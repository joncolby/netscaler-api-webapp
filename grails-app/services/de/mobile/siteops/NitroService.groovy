package de.mobile.siteops

import com.google.gson.Gson;

import com.citrix.netscaler.nitro.exception.nitro_exception;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver;
import com.citrix.netscaler.nitro.resource.base.base_response;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_cachepolicy_binding;
import com.citrix.netscaler.nitro.resource.stat.basic.service_stats;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_service_binding;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwconfidfield;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwlearningdata;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwlearningdata_args;
import com.citrix.netscaler.nitro.resource.config.appfw.appfwprofile;
import com.citrix.netscaler.nitro.resource.config.audit.auditnslogaction;
import com.citrix.netscaler.nitro.resource.config.audit.auditsyslogparams;
import com.citrix.netscaler.nitro.resource.config.authorization.authorizationpolicylabel_binding;
import com.citrix.netscaler.nitro.resource.config.basic.service;
import com.citrix.netscaler.nitro.resource.config.basic.service_binding;
import com.citrix.netscaler.nitro.resource.config.basic.servicegroup_servicegroupmember_binding;
import com.citrix.netscaler.nitro.resource.config.cache.cacheobject;
import com.citrix.netscaler.nitro.resource.config.cmp.cmppolicy_lbvserver_binding;
import com.citrix.netscaler.nitro.resource.config.dns.dnsnsecrec;
import com.citrix.netscaler.nitro.resource.config.dns.dnssuffix;
import com.citrix.netscaler.nitro.resource.config.dns.dnsview_dnspolicy_binding;
import com.citrix.netscaler.nitro.resource.config.dns.dnszone;
import com.citrix.netscaler.nitro.resource.config.gslb.gslbldnsentries;
import com.citrix.netscaler.nitro.resource.config.gslb.gslbparameter;
import com.citrix.netscaler.nitro.resource.config.gslb.gslbservice_binding;
import com.citrix.netscaler.nitro.resource.config.ha.hanode;
import com.citrix.netscaler.nitro.resource.config.lb.lbvserver_binding;
import com.citrix.netscaler.nitro.resource.config.network.Interface;
import com.citrix.netscaler.nitro.resource.config.network.channel;
import com.citrix.netscaler.nitro.resource.config.ns.nsip;
import com.citrix.netscaler.nitro.resource.config.ns.nsip_args;
import com.citrix.netscaler.nitro.resource.config.ns.nslimitselector;
import com.citrix.netscaler.nitro.resource.config.policy.policyexpression;
import com.citrix.netscaler.nitro.resource.config.policy.policyexpression_args;
import com.citrix.netscaler.nitro.resource.config.protocol.protocolhttpband;
import com.citrix.netscaler.nitro.resource.config.protocol.protocolhttpband_args;
import com.citrix.netscaler.nitro.resource.config.snmp.snmpgroup;
import com.citrix.netscaler.nitro.resource.config.snmp.snmpmanager;
import com.citrix.netscaler.nitro.resource.config.snmp.snmpoid;
import com.citrix.netscaler.nitro.resource.config.snmp.snmpoid_args;
import com.citrix.netscaler.nitro.resource.config.snmp.snmptrap;
import com.citrix.netscaler.nitro.resource.config.ssl.sslcertkey;
import com.citrix.netscaler.nitro.resource.config.ssl.sslcipher_binding;
import com.citrix.netscaler.nitro.resource.config.ssl.sslpolicy_binding;
import com.citrix.netscaler.nitro.resource.config.ssl.sslpolicy_csvserver_binding;
import com.citrix.netscaler.nitro.resource.config.system.systemgroup_binding;
import com.citrix.netscaler.nitro.resource.config.transform.transformprofile_transformaction_binding;
import com.citrix.netscaler.nitro.resource.config.vpn.vpnglobal_vpnclientlessaccesspolicy_binding;
import com.citrix.netscaler.nitro.service.nitro_service;
import com.citrix.netscaler.nitro.service.options;
import com.citrix.netscaler.nitro.util.filtervalue;
import com.citrix.netscaler.nitro.resource.config.basic.service_lbmonitor_binding
import com.sun.jndi.ldap.Connection;


class NitroService {

    static transactional = false

    private NetscalerClient netscalerClient
    public NetscalerAppliance netscalerAppliance

    private class NetscalerClient {

        private def client
        private NetscalerAppliance netscalerAppliance

        public NetscalerClient(NetscalerAppliance netscalerAppliance) {
            this.netscalerAppliance = netscalerAppliance
        }

        public def getClient() {
            return client
        }

        public def connect() {
                try {
                    client = new nitro_service(netscalerAppliance.ipAddress,netscalerAppliance.protocol)
                    client.login(netscalerAppliance.username, netscalerAppliance.password)
                } catch(nitro_exception error){
                    log.error "NITRO Error -> Code " +error.getErrorCode() +" : " +error.getMessage()
                } catch(Exception e){
                    log.error "Java Error -> " + e.getMessage()
                }
        }

        public void disconnect() {
                if (client) {
                    try {
                        client.logout()
                    } catch(nitro_exception error){
                        log.error "NITRO Error -> Code " +error.getErrorCode() +" : " +error.getMessage()
                    } catch(Exception e){
                        log.error "Java Error -> " +e.getMessage()
                    } finally {
                        client = null
                    }
                }
        }

    }

    private def connect(NetscalerAppliance netscalerAppliance) {
        log.debug "connecting to netscaler " + netscalerAppliance.ipAddress
        NetscalerClient netscalerClient = new NetscalerClient(netscalerAppliance)
        netscalerClient.connect()
        return netscalerClient.client

    }

    private void disconnect() {
        if (netscalerClient) {
            netscalerClient.disconnect()
        }
    }


    def refreshLbvserverBindings() {

        log.debug "using netscaler " + netscalerAppliance.ipAddress

        def client = connect(netscalerAppliance)
        def results = lbvserver.get(client)

        results.each { result ->

           NetscalerLbvserver netscalerLbvserver = NetscalerLbvserver.findByDataCenterAndName(netscalerAppliance.dataCenter, result._name)

           if (netscalerLbvserver) {
               netscalerLbvserver.port = result._port
               netscalerLbvserver.state = result._curstate
               netscalerLbvserver.ipAddress = result._ipv46
               netscalerLbvserver.serviceType = result._servicetype
               netscalerLbvserver.lastUpdated = new Date()
           } else {
               netscalerLbvserver = new NetscalerLbvserver(netscaler: netscalerAppliance, name: result._name, dataCenter: netscalerAppliance.dataCenter, ipAddress: result._ipv46, port: result._port, state: result._curstate, serviceType: result._servicetype)
           }

             if ( ! netscalerLbvserver.validate() || ! netscalerLbvserver.save(flush:true) ) {
                 log.error "COULD NOT SAVE LBVSERVER " + result._name
                 log.error netscalerLbvserver.errors
             }

           // get all the services bound to this lbvserver
           def boundServices = lbvserver_service_binding.get(client,result._name)

           boundServices.each { s ->

               NetscalerService netscalerService = NetscalerService.findByNameAndLbvserver(s._servicename,netscalerLbvserver)

               if (netscalerService) {
                   netscalerService.port = s._port
                   netscalerService.state = s._curstate
                   netscalerService.serviceType = s._servicetype
                   netscalerService.ipAddress = s._ipv46
                   netscalerService.lbvserver = netscalerLbvserver
                   netscalerService.lastUpdated = new Date()
               } else {
                   netscalerService = new NetscalerService(name: s._servicename, ipAddress: s._ipv46,dataCenter: netscalerLbvserver.dataCenter,port: s._port,state: s._curstate,serviceType: s._servicetype, lbvserver: netscalerLbvserver)
                   if ( netscalerService.validate() && netscalerService.save() ) {
                        netscalerLbvserver.addToServices(netscalerService)
                   } else {
                        log.error "could not save service: " + s._servicename
                        log.error netscalerService.errors
                   }
               }

           }

        }

        disconnect()
    }

    def changeServiceState(String serviceName, String action) {
        def response = ""
        def error = ""

        if (! serviceName ) {
            error = "missing host or service name"
        }
        def netscalerServices = getServicesByHostPattern(serviceName)

        if (! netscalerServices ) {
            error = "no services found for ${serviceName}"
        }

        log.debug "found services: " + netscalerServices

        def command
        def state
        netscalerServices.each { NetscalerService s ->
                  def client = connect(s.lbvserver.netscaler)
                  def result

                switch (action) {
                    case "in":
                        result = service.enable(client, s.name)
                        command = "enable"
                        state = "UP"
                        break
                    case "out":
                        result = service.disable(client, s.name)
                        command = "disable"
                        state = "OUT OF SERVICE"
                        break
                    default:
                        error = "unrecognized action $action"
                        return
                }

            if (result.errorcode == 0) {
               // querying the state here gets back the old *unchanged* state
               //def stat = service_stats.get(client, s.name)
               //def state = stat.get_state()
               response += s.name + " state is " + state + "<br>\n"
               s.state = state
               s.save()
            } else {
               error += "problem setting ${s.name} to ${command}: ${result.message}. error ${result.errorcode}<br>\n"
            }

            disconnect()
        }
        return [response: response, error: error]
    }

    def NetscalerService[] getServicesByHostPattern(String hostPattern) {
        //if ( hostPattern =~ /\d+\_/ ) {
        if ( hostPattern =~ /[a-zA-Z0-9]+_/ ) {
           // println "using as-is name"
           return NetscalerService.findAllByName(hostPattern)
        } else {
           // println "using find by like"
           return NetscalerService.findAllByNameLike("%\\_$hostPattern")
        }
        return null
    }


    def getServicePorts(String hostPattern) {
        def netscalerServices = getServicesByHostPattern(hostPattern)
        return netscalerServices.collect { NetscalerService netscalerService ->  netscalerService.port }
    }



}
