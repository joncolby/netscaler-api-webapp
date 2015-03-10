import de.mobile.siteops.NetscalerAppliance

class BootStrap {

    def init = { servletContext ->

        //new NetscalerAppliance(dataCenter: 46, protocol: 'HTTPS', ipAddress: '_IP_', username: 'apiuser', password: '_PASSWORD_', role: 'ACTIVE', managed: true).save()
        new NetscalerAppliance(dataCenter: 46, protocol: 'HTTPS', ipAddress: '_IP_', username: 'apiuser', password: '_PASSWORD_', role: 'ACTIVE', managed: true).save()
        //new NetscalerAppliance(dataCenter: 47, protocol: 'HTTPS', ipAddress: '_IP_', username: 'apiuser', password: '_PASSWORD_', role: 'ACTIVE', managed: true).save()
        new NetscalerAppliance(dataCenter: 47, protocol: 'HTTPS', ipAddress: '_IP_', username: 'apiuser', password: '_PASSWORD_', role: 'ACTIVE', managed: true).save()
        //new NetscalerAppliance(dataCenter: 44, protocol: 'HTTPS', ipAddress: '_IP_', username: 'apiuser', password: '_PASSWORD_', role: 'ACTIVE', managed: false).save()
        //new NetscalerAppliance(dataCenter: 38, protocol: 'HTTPS', ipAddress: '_IP_', username: 'apiuser', password: '_PASSWORD_', role: 'ACTIVE', managed: true).save()
        new NetscalerAppliance(dataCenter: 38, protocol: 'HTTPS', ipAddress: '_IP_', username: 'apiuser', password: '_PASSWORD_', role: 'ACTIVE', managed: true).save()
        // microsites
        //new NetscalerAppliance(dataCenter: 46, protocol: 'HTTPS', ipAddress: '_IP_', username: 'apiuser', password: '_PASSWORD_', role: 'ACTIVE', managed: true).save()

    }
    def destroy = {

        def env = System.getenv()
        new File(env["HOME"]).eachFileMatch(~".h2.*") { f ->
            println "deleting h2 file $f"
            f.delete()
        }

    }
}
