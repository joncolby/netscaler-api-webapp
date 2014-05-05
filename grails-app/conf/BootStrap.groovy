import de.mobile.siteops.NetscalerAppliance

class BootStrap {

    def init = { servletContext ->

        //new NetscalerAppliance(dataCenter: 46, protocol: 'HTTPS', ipAddress: '10.46.28.251', username: 'apiuser', password: 't313F0n', role: 'ACTIVE', managed: true).save()
        new NetscalerAppliance(dataCenter: 46, protocol: 'HTTPS', ipAddress: 'mo-lb001', username: 'apiuser', password: 't313F0n', role: 'ACTIVE', managed: true).save()
        //new NetscalerAppliance(dataCenter: 47, protocol: 'HTTPS', ipAddress: '10.47.28.251', username: 'apiuser', password: 't313F0n', role: 'ACTIVE', managed: true).save()
        new NetscalerAppliance(dataCenter: 47, protocol: 'HTTPS', ipAddress: 'mo-lb002', username: 'apiuser', password: 't313F0n', role: 'ACTIVE', managed: true).save()
        //new NetscalerAppliance(dataCenter: 44, protocol: 'HTTPS', ipAddress: '10.44.28.251', username: 'apiuser', password: 't313F0n', role: 'ACTIVE', managed: false).save()
        //new NetscalerAppliance(dataCenter: 38, protocol: 'HTTPS', ipAddress: '10.38.28.251', username: 'apiuser', password: 't313F0n', role: 'ACTIVE', managed: true).save()
        new NetscalerAppliance(dataCenter: 38, protocol: 'HTTPS', ipAddress: 'mo-lb003', username: 'apiuser', password: 't313F0n', role: 'ACTIVE', managed: true).save()
        // microsites
        //new NetscalerAppliance(dataCenter: 46, protocol: 'HTTPS', ipAddress: '10.46.23.251', username: 'apiuser', password: 't313F0n', role: 'ACTIVE', managed: true).save()

    }
    def destroy = {

        def env = System.getenv()
        new File(env["HOME"]).eachFileMatch(~".h2.*") { f ->
            println "deleting h2 file $f"
            f.delete()
        }

    }
}
