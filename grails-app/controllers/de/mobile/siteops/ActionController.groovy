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

    def complete = {
        if (flash.message) {
            render flash.message
        } else {
            render "no action performed"
        }
    }

    def changeServiceState = {
        def result = nitroService.changeServiceState(params.service,params.operation)
        //render(text: "${result}", contentType: "text/html", encoding: "UTF-8")
        log.info clientRequestInfo + " message: " + result
        flash.message = result
		redirect(action:complete)
    }

    def showServiceState = {
        def netscalerServices = nitroService.getServicesByHostPattern(params?.service)  ?:  NetscalerService.list()
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
