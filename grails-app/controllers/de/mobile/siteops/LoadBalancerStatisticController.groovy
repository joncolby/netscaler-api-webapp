package de.mobile.siteops

class LoadBalancerStatisticController {

    boolean transactional = false
    static defaultAction = "stats"

    def stats = {
        def lbname = params?.lbname
        def netmask = params?.netmask ?: null
        def statsArray = []
        def statsMap = [:]
        def lbServers

        if (netmask) {
            lbServers = NetscalerLbvserver.findAllByIpAddressLike("${netmask}%")
        } else {
            lbServers = NetscalerLbvserver.list()
        }

        def lbServerGroups = lbServers.groupBy {  NetscalerLbvserver lbServer -> lbServer.name }

        lbServerGroups.sort().each { grp ->

           // println "LB ${grp}"
            statsMap = [:]
            def upServicesCount = 0
            def downServicesCount = 0
            def unknownServicesCount = 0
            def totalServicesCount = 0

             grp.value.each { NetscalerLbvserver lb ->
                 def lbName = lb.name
                 def sampleService = lb.services.collect { NetscalerService s -> s.name}[0]
                 def hostPrefix = ""

                 if (sampleService) {
                         def strippedServiceName = sampleService =~ /(.*)_([a-zA-Z-_]+)([0-9]*-)/
                         hostPrefix = strippedServiceName[0][2]
                 }

                 statsMap["${lbName}.lbName"] =  lbName
                 statsMap["${lbName}.hostprefix"] = hostPrefix
                 statsMap["${lbName}.total"] =  (statsMap["${lbName}.total"] ?: 0) + lb.services.size()
                 def upServices = lb.services.findAll { it.state == "UP" }.collect { NetscalerService service -> service.name }
                 def downServices = lb.services.findAll { it.state == "OUT OF SERVICE" }.collect { NetscalerService service -> service.name }
                 def unknownServices = lb.services.findAll { it.state != "OUT OF SERVICE" && it.state != "UP" }.collect { NetscalerService service -> service.name }
                 //statsMap["${lbName}.UP"] = 0
                 statsMap["${lbName}.UP"] = ( statsMap["${lbName}.UP"] ?: 0 )  + upServices.size()
                 statsMap["${lbName}.OUTOFSERVICE"] = ( statsMap["${lbName}.OUTOFSERVICE"] ?: 0 )  + downServices.size()
                 statsMap["${lbName}.UNKNOWN"] = ( statsMap["${lbName}.UNKNOWN"] ?: 0 )  + unknownServices.size()
                 upServicesCount += upServices.size()
                 downServicesCount += downServices.size()
                 unknownServicesCount += unknownServices.size()
                 //println "LB ${lb.name} in datacenter ${lb.dataCenter} UP services: ${upServices}"

                // println "up " +  statsMap["${lbName}.UP"]
                 //println "tot " +  statsMap["${lbName}.total"]
                 if ( statsMap["${lbName}.total"] > 0 )  {
                        def pct = statsMap["${lbName}.UP"] / statsMap["${lbName}.total"] *  100
                        statsMap["${lbName}.percent-up"] = pct.stripTrailingZeros().toPlainString()
                 }
             }


           // statsMap.each { k,v ->
           //   println "${k} => ${v}"
           // }

            statsArray << statsMap
        }
        //statsArray.each { println it}
        //render(view:"stats", model: [statsMap:statsMap])
        render(view:"stats", model: [statsArray:statsArray])


        /*

        def loadBalancerList = []

        if (lbname) {
              loadBalancerList << lbname.toString().toLowerCase()
        } else {
               loadBalancerList = ModJkLoadbalancer.list().collect { it.name }.unique()
        }

        def statsMap = [:]

        loadBalancerList.each { lb ->
         def active = jkService.searchLoadBalancer(lb,"ACT","", netmask)
         def activeError = jkService.searchLoadBalancer(lb,"ACT","ERR",netmask)
         def activeOK = jkService.searchLoadBalancer(lb,"ACT","OK", netmask)
         def stopped = jkService.searchLoadBalancer(lb,"STP","", netmask)
         def disabled = jkService.searchLoadBalancer(lb,"DIS","", netmask)
         def total = jkService.searchLoadBalancer(lb,"","", netmask)

         if (active)
         statsMap["${lb}.ACTIVE"] = active

         if (activeError)
         statsMap["${lb}.ACTIVE.ERROR"] = activeError

            if (active && activeError) {
                def percentActiveError = activeError / active * 100
                statsMap["${lb}.ACTIVE.ERROR.PERCENT"] = percentActiveError.stripTrailingZeros().toPlainString()
            }

         if (activeOK)
         statsMap["${lb}.ACTIVE.OK"] = activeOK

            if ( active && activeOK) {
                def percentActiveOk = activeOK / active * 100
                statsMap["${lb}.ACTIVE.OK.PERCENT"] = percentActiveOk.stripTrailingZeros().toPlainString()
            }


         if (stopped)
            statsMap["${lb}.STOPPED"] = stopped

         if (disabled)
            statsMap["${lb}.DISABLED"] = disabled

         if (total)
            statsMap["${lb}.TOTAL"] = total

        }

         if (!statsMap) {
             render "no statistics available for lbname: ${lbname}"
             return
         }

         render(view:"stats", model: [statsMap:statsMap])
        */
    }
    /*
    def health = {

        def healthMap = [:]
        def loadBalancerList = []
        def loadBalancer = params?.lbname
        def netmask = params?.netmask ?: null

        if (loadBalancer) {
            loadBalancerList << loadBalancer.toString().toLowerCase()
        } else {
            loadBalancerList = ModJkLoadbalancer.list().collect { it.name }.unique()
        }

        loadBalancerList.each { lb ->

            def activeOK = jkService.searchLoadBalancer(lb,"ACT","OK", netmask)
            def activeTotal = jkService.searchLoadBalancer(lb,"ACT","", netmask)

            if (activeOK && activeTotal) {
               def percentOK = jkService.searchLoadBalancer(lb,"ACT","OK", netmask) / jkService.searchLoadBalancer(lb,"ACT","", netmask) * 100
                healthMap[lb] = percentOK.stripTrailingZeros().toPlainString()
            }


        }

        if (!healthMap) {
            render "no health information can be calculated for ${loadBalancer}"
            return
        }

        render(view: "health", model:[healthMap:healthMap])



    }
    */

}
