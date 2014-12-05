package de.mobile.siteops

import org.apache.log4j.Logger
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
import de.mobile.siteops.NitroSessionPool;


class NitroService {

    def logger = Logger.getLogger(getClass())

    static transactional = false

    private NetscalerAppliance netscalerAppliance

    HashMap<String, nitro_service> sessions = new HashMap<String, nitro_service>();

    private connect(NetscalerAppliance netscalerAppliance) {

        this.netscalerAppliance = netscalerAppliance
        //disconnect(netscalerAppliance)
        logger.debug "attempting to connect to netscaler " + netscalerAppliance.ipAddress

        // if session already found
        def session = sessions.get(netscalerAppliance.ipAddress)
        if (session) {
            return session
        }

        try {

            sessions.put(netscalerAppliance.ipAddress.toString(),new nitro_service(netscalerAppliance.ipAddress,netscalerAppliance.protocol))

            return sessions.get(netscalerAppliance.ipAddress)

        } catch(nitro_exception error){
            logger.error "NITRO Error -> Code " + error.getErrorCode() + " : " + error.getMessage()
        } catch(Exception e){
            logger.error "Java Error -> " + e.getMessage()
        }
    }


    private void disconnect(NetscalerAppliance netscalerAppliance) {
        def session = sessions.get(netscalerAppliance.ipAddress)
        if (session) {
            try {
                session.logout()
            } catch(nitro_exception error){
                logger.error "Nitro Error -> Code " + error.getErrorCode() +" : " + error.getMessage()
            } catch(Exception e){
                logger.error "Java Error -> " +e.getMessage()
            } finally {
                sessions.put(netscalerAppliance.ipAddress,null)
            }
        }
    }


    def refreshLbvserverBindings() {

        if (!netscalerAppliance) {
          logger.error "no netscaler instance found. Was connect not used?"
        }

        logger.debug "using netscaler " + netscalerAppliance.ipAddress

         def session = connect(netscalerAppliance)

        try {
            session.login(netscalerAppliance.username,netscalerAppliance.password)
        } catch (Exception e) {
          logger.error "error from netscaler ${netscalerAppliance.ipAddress}: " + e.message
          return
        }

        //def results = lbvserver.get(client)
        def results = []

        try {
           results = lbvserver.get(session)
        } catch (Exception e) {
           logger.error "Something went horribly wrong -> " +e.getMessage()
        }

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
                 logger.error "COULD NOT SAVE LBVSERVER " + result._name
                 logger.error netscalerLbvserver.errors
             }


           def boundServices = lbvserver_service_binding.get(session,result._name)

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
                        logger.error "could not save service: " + s._servicename
                        logger.error netscalerService.errors
                   }
               }

           }

        }
        disconnect(netscalerAppliance)
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

        logger.debug "found services: " + netscalerServices

        def command
        def state
        netscalerServices.each { NetscalerService s ->
                  def client
                  def result
                  def basicService
                  def service

            try {
                client = connect(s.lbvserver.netscaler)
                         try {
                            client.login(netscalerAppliance.username,netscalerAppliance.password)
                            } catch (Exception e) {
                            logger.error "error from netscaler ${netscalerAppliance.ipAddress}: " + e.message
                            return
                         }
                basicService  = new com.citrix.netscaler.nitro.resource.config.basic.service()
                service = basicService.get(client,s.name)
            } catch (Exception e) {
                error = "Error from netscaler ${s.lbvserver.netscaler}: " + e.message
                return
            }

                switch (action) {
                    case "in":
                        // with service string parameter
                        //result = service.enable(client, s.name)
                        result = service.enable(client, service)
                        command = "enable"
                        state = "UP"
                        break
                    case "out":
                        // with service string parameter
                        //result = service.disable(client, s.name)
                        service.set_graceful("YES")
                        service.set_delay(1000)
                        result = service.disable(client, service)
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

            disconnect(s.lbvserver.netscaler)
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
