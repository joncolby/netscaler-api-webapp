package de.mobile.siteops


class PollerJob {
    //def timeout = 5000l // execute job once in 5 seconds
    def concurrent = false

    def nitroService

    // TODO - trigger on demand from controller
    static triggers = {
       //cron name: 'poller', startDelay: 10000, cronExpression: "0 0/60 * * * ?"
       simple name:'init-poller', startDelay:10000, repeatCount: 1
       cron name: 'poller', startDelay: 10000, cronExpression: "0 0/5 * * * ?"
    }

    def execute() {
        // execute task
        log.info "starting poller job at " + new Date()

        def netscalerAppliances = NetscalerAppliance.findAllByManaged(true)

        netscalerAppliances.each { netscalerAppliance ->
            nitroService.netscalerAppliance = netscalerAppliance
            nitroService.refreshLbvserverBindings()
        }

        // remove lbvservers and service which were not updated for X minutes
        def maxMinutes = 20

        def now = new Date()
        def c = Calendar.getInstance()
        c.add(Calendar.MINUTE, -maxMinutes)
        def oldAge = c.getTime()

        def staleServices = NetscalerService.findAllByLastUpdatedLessThanEquals(oldAge)
        staleServices.each { NetscalerService netscalerService ->  netscalerService.delete() }

        def staleLbvservers = NetscalerLbvserver.findAllByLastUpdatedLessThanEquals(oldAge)
        staleLbvservers.each { NetscalerLbvserver netscalerLbvserver -> netscalerLbvserver.delete() }

    }
}
