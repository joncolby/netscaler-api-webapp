package de.mobile.siteops

class NetscalerApplianceController {

    static allowedMethods = [save: "POST", update: "POST", delete: "POST"]

    def index = {
        redirect(action: "list", params: params)
    }

    def list = {
        params.max = Math.min(params.max ? params.int('max') : 10, 100)
        [netscalerApplianceInstanceList: NetscalerAppliance.list(params), netscalerApplianceInstanceTotal: NetscalerAppliance.count()]
    }

    def create = {
        def netscalerApplianceInstance = new NetscalerAppliance()
        netscalerApplianceInstance.properties = params
        return [netscalerApplianceInstance: netscalerApplianceInstance]
    }

    def save = {
        def netscalerApplianceInstance = new NetscalerAppliance(params)
        if (netscalerApplianceInstance.save(flush: true)) {
            flash.message = "${message(code: 'default.created.message', args: [message(code: 'netscalerAppliance.label', default: 'NetscalerAppliance'), netscalerApplianceInstance.id])}"
            redirect(action: "show", id: netscalerApplianceInstance.id)
        }
        else {
            render(view: "create", model: [netscalerApplianceInstance: netscalerApplianceInstance])
        }
    }

    def show = {
        def netscalerApplianceInstance = NetscalerAppliance.get(params.id)
        if (!netscalerApplianceInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'netscalerAppliance.label', default: 'NetscalerAppliance'), params.id])}"
            redirect(action: "list")
        }
        else {
            [netscalerApplianceInstance: netscalerApplianceInstance]
        }
    }

    def edit = {
        def netscalerApplianceInstance = NetscalerAppliance.get(params.id)
        if (!netscalerApplianceInstance) {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'netscalerAppliance.label', default: 'NetscalerAppliance'), params.id])}"
            redirect(action: "list")
        }
        else {
            return [netscalerApplianceInstance: netscalerApplianceInstance]
        }
    }

    def update = {
        def netscalerApplianceInstance = NetscalerAppliance.get(params.id)
        if (netscalerApplianceInstance) {
            if (params.version) {
                def version = params.version.toLong()
                if (netscalerApplianceInstance.version > version) {
                    
                    netscalerApplianceInstance.errors.rejectValue("version", "default.optimistic.locking.failure", [message(code: 'netscalerAppliance.label', default: 'NetscalerAppliance')] as Object[], "Another user has updated this NetscalerAppliance while you were editing")
                    render(view: "edit", model: [netscalerApplianceInstance: netscalerApplianceInstance])
                    return
                }
            }
            netscalerApplianceInstance.properties = params
            if (!netscalerApplianceInstance.hasErrors() && netscalerApplianceInstance.save(flush: true)) {
                flash.message = "${message(code: 'default.updated.message', args: [message(code: 'netscalerAppliance.label', default: 'NetscalerAppliance'), netscalerApplianceInstance.id])}"
                redirect(action: "show", id: netscalerApplianceInstance.id)
            }
            else {
                render(view: "edit", model: [netscalerApplianceInstance: netscalerApplianceInstance])
            }
        }
        else {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'netscalerAppliance.label', default: 'NetscalerAppliance'), params.id])}"
            redirect(action: "list")
        }
    }

    def delete = {
        def netscalerApplianceInstance = NetscalerAppliance.get(params.id)
        if (netscalerApplianceInstance) {
            try {
                netscalerApplianceInstance.delete(flush: true)
                flash.message = "${message(code: 'default.deleted.message', args: [message(code: 'netscalerAppliance.label', default: 'NetscalerAppliance'), params.id])}"
                redirect(action: "list")
            }
            catch (org.springframework.dao.DataIntegrityViolationException e) {
                flash.message = "${message(code: 'default.not.deleted.message', args: [message(code: 'netscalerAppliance.label', default: 'NetscalerAppliance'), params.id])}"
                redirect(action: "show", id: params.id)
            }
        }
        else {
            flash.message = "${message(code: 'default.not.found.message', args: [message(code: 'netscalerAppliance.label', default: 'NetscalerAppliance'), params.id])}"
            redirect(action: "list")
        }
    }
}
