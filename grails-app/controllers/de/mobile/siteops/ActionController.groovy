package de.mobile.siteops


class ActionController {

    def nitroService

    def index = {
        render(template:"/help")
    }

    def port = {
        def ports = nitroService.getServicePorts(params.service)
        render ports.join(',')
    }


    def changeServiceState = {
        def result = nitroService.changeServiceState(params.service,params.operation)
        log.info clientRequestInfo + " message: " + result

        if (result.error) {
            render result.error
            return
        }
        redirect(uri: "/service/read/${params.service}")
    }

    def showServiceState = {
        def netscalerServices

        if (params.service) {
            netscalerServices = nitroService.getServicesByHostPattern(params?.service)

            if (!netscalerServices) {
                render "no service found for ${params.service}"
                return
            }

        } else {
            netscalerServices = NetscalerService.list()
        }

        render(view: "service", model: [services: netscalerServices])
    }

    def showLbvserverBindings = {
        def netscalerLbvservers

        if (params.datacenter) {
            netscalerLbvservers = params?.lbvserver  ? NetscalerLbvserver.findAllByNameAndDataCenter(params?.lbvserver, params.datacenter) : NetscalerLbvserver.findAllByDataCenter(params.datacenter)
        }  else {
            netscalerLbvservers = params?.lbvserver  ? NetscalerLbvserver.findAllByName(params?.lbvserver) : NetscalerLbvserver.list()
        }

        if (!netscalerLbvservers) {
            render "no lbvserver found for ${params?.lbvserver}"
            return
        }

        render(view: "lbvserverbindings", model: [lbvservers: netscalerLbvservers])
    }

    def showLbvservers = {
        def netscalerLbvservers

        if (params.datacenter) {
            netscalerLbvservers = params?.lbvserver  ? NetscalerLbvserver.findAllByNameAndDataCenter(params?.lbvserver,params.datacenter) : NetscalerLbvserver.findAllByDataCenter(params.datacenter)
        } else {
            netscalerLbvservers = params?.lbvserver  ? NetscalerLbvserver.findAllByName(params?.lbvserver) : NetscalerLbvserver.list()
        }

        if (!netscalerLbvservers) {
            render "no lbvserver found for ${params?.lbvserver}"
            return
        }

        render(view: "lbvserver", model: [lbvservers: netscalerLbvservers])
    }

    private String getClientRequestInfo() {
        def userIp = request.getHeader("X-Forwarded-For") ? request.getHeader("X-Forwarded-For") : request.remoteAddr
        def queryStr = request.getQueryString() ? "?" + request.getQueryString() :  ""
        def userAgent = request.getHeader("User-Agent")
        def command = request.forwardURI + queryStr

        return "${userIp} \"${userAgent}\" ${command}"
    }

}
