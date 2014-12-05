package de.mobile.siteops

import org.apache.log4j.Logger

class PollerJob {
    //def timeout = 5000l // execute job once in 5 seconds
    def concurrent = false

    def logger = Logger.getLogger(getClass())

    def nitroService

    // TODO - trigger on demand from controller
    static triggers = {
       //cron name: 'poller', startDelay: 10000, cronExpression: "0 0/60 * * * ?"
       simple name:'init-poller', startDelay:10000, repeatCount: 0
       //cron name: 'poller', startDelay: 10000, cronExpression: "0 0/10 * * * ?"
       cron name: 'poller', startDelay: 10000, cronExpression: "0 0/20 * * * ?"
    }

    def execute() {
        // execute task
        logger.info "starting poller job at " + new Date()

        def netscalerAppliances = NetscalerAppliance.findAllByManaged(true)

        netscalerAppliances.each { netscalerAppliance ->
            nitroService.netscalerAppliance = netscalerAppliance
            nitroService.refreshLbvserverBindings()
        }

        // remove lbvservers and service which were not updated for X minutes
        def maxMinutes = 10

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
