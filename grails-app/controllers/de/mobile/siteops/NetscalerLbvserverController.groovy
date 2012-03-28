package de.mobile.siteops

class NetscalerLbvserverController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [netscalerLbvserverInstanceList: NetscalerLbvserver.list(params), netscalerLbvserverInstanceTotal: NetscalerLbvserver.count()]
    }

    def create = {
        def netscalerLbvserverInstance = new NetscalerLbvserver()
        netscalerLbvserverInstance.properties = params
        return [netscalerLbvserverInstance: netscalerLbvserverInstance]
    }

    def save = {
        def netscalerLbvserverInstance = new NetscalerLbvserver(params)
        if (netscalerLbvserverInstance.save(flush: true)) {
            flash.message = "${message(code: 'default.created.message', args: [message(code: 'netscalerLbvserver.label', default: 'NetscalerLbvserver'), netscalerLbvserverInstance.id])}"
            redirect(action: "show", id: netscalerLbvserverInstance.id)
        }
        else {
            render(view: "create", model: [netscalerLbvserverInstance: netscalerLbvserverInstance])
        }
    }

    def show = {
        def netscalerLbvserverInstance = NetscalerLbvserver.get(params.id)
        if (!netscalerLbvserverInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'netscalerLbvserver.label', default: 'NetscalerLbvserver'), params.id])}"
            redirect(action: "list")
        }
        else {
            [netscalerLbvserverInstance: netscalerLbvserverInstance]
        }
    }

    def edit = {
        def netscalerLbvserverInstance = NetscalerLbvserver.get(params.id)
        if (!netscalerLbvserverInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'netscalerLbvserver.label', default: 'NetscalerLbvserver'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [netscalerLbvserverInstance: netscalerLbvserverInstance]
        }
    }

    def update = {
        def netscalerLbvserverInstance = NetscalerLbvserver.get(params.id)
        if (netscalerLbvserverInstance) {
            if (params.version) {
                def version = params.version.toLong()
                if (netscalerLbvserverInstance.version > version) {
                    
                    netscalerLbvserverInstance.errors.rejectValue("version", "default.optimistic.locking.failure", [message(code: 'netscalerLbvserver.label', default: 'NetscalerLbvserver')] as Object[], "Another user has updated this NetscalerLbvserver while you were editing")
                    render(view: "edit", model: [netscalerLbvserverInstance: netscalerLbvserverInstance])
                    return
                }
            }
            netscalerLbvserverInstance.properties = params
            if (!netscalerLbvserverInstance.hasErrors() && netscalerLbvserverInstance.save(flush: true)) {
                flash.message = "${message(code: 'default.updated.message', args: [message(code: 'netscalerLbvserver.label', default: 'NetscalerLbvserver'), netscalerLbvserverInstance.id])}"
                redirect(action: "show", id: netscalerLbvserverInstance.id)
            }
            else {
                render(view: "edit", model: [netscalerLbvserverInstance: netscalerLbvserverInstance])
            }
        }
        else {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'netscalerLbvserver.label', default: 'NetscalerLbvserver'), params.id])}"
            redirect(action: "list")
        }
    }

    def delete = {
        def netscalerLbvserverInstance = NetscalerLbvserver.get(params.id)
        if (netscalerLbvserverInstance) {
            try {
                netscalerLbvserverInstance.delete(flush: true)
                flash.message = "${message(code: 'default.deleted.message', args: [message(code: 'netscalerLbvserver.label', default: 'NetscalerLbvserver'), params.id])}"
                redirect(action: "list")
            }
            catch (org.springframework.dao.DataIntegrityViolationException e) {
                flash.message = "${message(code: 'default.not.deleted.message', args: [message(code: 'netscalerLbvserver.label', default: 'NetscalerLbvserver'), params.id])}"
                redirect(action: "show", id: params.id)
            }
        }
        else {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'netscalerLbvserver.label', default: 'NetscalerLbvserver'), params.id])}"
            redirect(action: "list")
        }
    }
}
