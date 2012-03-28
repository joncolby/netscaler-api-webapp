package de.mobile.siteops

class NetscalerServiceController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [netscalerServiceInstanceList: NetscalerService.list(params), netscalerServiceInstanceTotal: NetscalerService.count()]
    }

    def create = {
        def netscalerServiceInstance = new NetscalerService()
        netscalerServiceInstance.properties = params
        return [netscalerServiceInstance: netscalerServiceInstance]
    }

    def save = {
        def netscalerServiceInstance = new NetscalerService(params)
        if (netscalerServiceInstance.save(flush: true)) {
            flash.message = "${message(code: 'default.created.message', args: [message(code: 'netscalerService.label', default: 'NetscalerService'), netscalerServiceInstance.id])}"
            redirect(action: "show", id: netscalerServiceInstance.id)
        }
        else {
            render(view: "create", model: [netscalerServiceInstance: netscalerServiceInstance])
        }
    }

    def show = {
        def netscalerServiceInstance = NetscalerService.get(params.id)
        if (!netscalerServiceInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'netscalerService.label', default: 'NetscalerService'), params.id])}"
            redirect(action: "list")
        }
        else {
            [netscalerServiceInstance: netscalerServiceInstance]
        }
    }

    def edit = {
        def netscalerServiceInstance = NetscalerService.get(params.id)
        if (!netscalerServiceInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'netscalerService.label', default: 'NetscalerService'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [netscalerServiceInstance: netscalerServiceInstance]
        }
    }

    def update = {
        def netscalerServiceInstance = NetscalerService.get(params.id)
        if (netscalerServiceInstance) {
            if (params.version) {
                def version = params.version.toLong()
                if (netscalerServiceInstance.version > version) {
                    
                    netscalerServiceInstance.errors.rejectValue("version", "default.optimistic.locking.failure", [message(code: 'netscalerService.label', default: 'NetscalerService')] as Object[], "Another user has updated this NetscalerService while you were editing")
                    render(view: "edit", model: [netscalerServiceInstance: netscalerServiceInstance])
                    return
                }
            }
            netscalerServiceInstance.properties = params
            if (!netscalerServiceInstance.hasErrors() && netscalerServiceInstance.save(flush: true)) {
                flash.message = "${message(code: 'default.updated.message', args: [message(code: 'netscalerService.label', default: 'NetscalerService'), netscalerServiceInstance.id])}"
                redirect(action: "show", id: netscalerServiceInstance.id)
            }
            else {
                render(view: "edit", model: [netscalerServiceInstance: netscalerServiceInstance])
            }
        }
        else {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'netscalerService.label', default: 'NetscalerService'), params.id])}"
            redirect(action: "list")
        }
    }

    def delete = {
        def netscalerServiceInstance = NetscalerService.get(params.id)
        if (netscalerServiceInstance) {
            try {
                netscalerServiceInstance.delete(flush: true)
                flash.message = "${message(code: 'default.deleted.message', args: [message(code: 'netscalerService.label', default: 'NetscalerService'), params.id])}"
                redirect(action: "list")
            }
            catch (org.springframework.dao.DataIntegrityViolationException e) {
                flash.message = "${message(code: 'default.not.deleted.message', args: [message(code: 'netscalerService.label', default: 'NetscalerService'), params.id])}"
                redirect(action: "show", id: params.id)
            }
        }
        else {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'netscalerService.label', default: 'NetscalerService'), params.id])}"
            redirect(action: "list")
        }
    }
}
