/**
 * NSConfigPort.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public interface NSConfigPort extends java.rmi.Remote {

    /**

     */
    public NSConfig.SimpleResult addlocation(java.lang.String ipfrom, java.lang.String ipto, java.lang.String preferredlocation) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addlocationEx(java.lang.String ipfrom, java.lang.String ipto, java.lang.String preferredlocation, int longitude, int latitude) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmlocation(java.lang.String ipfrom, java.lang.String ipto) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetlocationResult getlocation(java.lang.String ipfrom) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addlocationfile(java.lang.String locationfile, NSConfig.LocationfileformatEnum format) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmlocationfile() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetlocationfileResult getlocationfile() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addserver(java.lang.String name, java.lang.String ipaddress, java.lang.String domain, NSConfig.EnabledisabledEnum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setserver_ipaddress(java.lang.String name, java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setserver_domainresolveretry(java.lang.String name, int domainresolveretry) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setserver_translationip(java.lang.String name, java.lang.String translationip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setserver_translationmask(java.lang.String name, java.lang.String translationmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setserver_domainresolvenow(java.lang.String name, boolean domainresolvenow) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setserver_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetserver_comment(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult enableserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disableserver(java.lang.String name, org.apache.axis.types.UnsignedInt delay) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disableserverEx(java.lang.String name, org.apache.axis.types.UnsignedInt delay, NSConfig.YesnoEnum graceful) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetserverResult getserver(java.lang.String name, boolean internaL) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renameserver(java.lang.String name, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addservice(java.lang.String name, java.lang.String ip, java.lang.String servername, NSConfig.ServicetypeEnum servicetype, org.apache.axis.types.UnsignedInt port, org.apache.axis.types.UnsignedInt cleartextport, NSConfig.CachtypeEnum cachetype, NSConfig.EnabledisabledEnum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmservice(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_ipaddress(java.lang.String name, java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_maxclient(java.lang.String name, org.apache.axis.types.UnsignedInt maxclient) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_maxreq(java.lang.String name, org.apache.axis.types.UnsignedInt maxreq) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_cacheable(java.lang.String name, NSConfig.YesnoEnum cacheable) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_cip(java.lang.String name, NSConfig.EnabledisabledEnum cip, java.lang.String cipheader) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_usip(java.lang.String name, NSConfig.YesnoEnum usip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_pathmonitor(java.lang.String name, NSConfig.YesnoEnum pathmonitor) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_pathmonitorindv(java.lang.String name, NSConfig.YesnoEnum pathmonitorindv) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_useproxyport(java.lang.String name, NSConfig.YesnoEnum useproxyport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_sc(java.lang.String name, NSConfig.OnoffEnum sc) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_sp(java.lang.String name, NSConfig.OnoffEnum sp) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_rtspsessionidremap(java.lang.String name, NSConfig.OnoffEnum rtspsessionidremap) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_healthmonitor(java.lang.String name, NSConfig.YesnoEnum healthmonitor) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_clttimeout(java.lang.String name, org.apache.axis.types.UnsignedInt clttimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_svrtimeout(java.lang.String name, org.apache.axis.types.UnsignedInt svrtimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_customserverid(java.lang.String name, java.lang.String customserverid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_serverid(java.lang.String name, org.apache.axis.types.UnsignedInt serverid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_cka(java.lang.String name, NSConfig.YesnoEnum cka) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_tcpb(java.lang.String name, NSConfig.YesnoEnum tcpb) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_cmp(java.lang.String name, NSConfig.YesnoEnum cmp) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_maxbandwidth(java.lang.String name, org.apache.axis.types.UnsignedInt maxbandwidth) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_accessdown(java.lang.String name, NSConfig.YesnoEnum accessdown) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_monthreshold(java.lang.String name, org.apache.axis.types.UnsignedInt monthreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_weight(java.lang.String name, org.apache.axis.types.UnsignedInt weight, java.lang.String monitorname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_downstateflush(java.lang.String name, NSConfig.EnabledisabledEnum downstateflush) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_tcpprofile(java.lang.String name, java.lang.String tcpprofilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_httpprofile(java.lang.String name, java.lang.String httpprofilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_hashid(java.lang.String name, org.apache.axis.types.UnsignedInt hashid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_appflowlog(java.lang.String name, NSConfig.EnabledisabledEnum appflowlog) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservice_netprofile(java.lang.String name, java.lang.String netprofile) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_maxclient(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_maxreq(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_cacheable(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_cip(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_usip(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_pathmonitor(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_pathmonitorindv(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_useproxyport(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_sc(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_sp(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_rtspsessionidremap(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_customserverid(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_serverid(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_cka(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_tcpb(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_cmp(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_maxbandwidth(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_accessdown(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_monthreshold(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_clttimeout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_svrtimeout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_tcpprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_httpprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_hashid(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_appflowlog(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_netprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_cipheader(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_healthmonitor(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_monitorname(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_downstateflush(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservice_comment(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindservice_policy(java.lang.String name, java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindservice_monitor(java.lang.String name, java.lang.String monitorname, NSConfig.EnabledisabledEnum monstate, org.apache.axis.types.UnsignedInt weight) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindservice_monitorEx(java.lang.String name, java.lang.String monitorname, NSConfig.EnabledisabledEnum monstate, org.apache.axis.types.UnsignedInt weight, boolean passive) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindservice_policy(java.lang.String name, java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindservice_monitor(java.lang.String name, java.lang.String monitorname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult enableservice(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disableservice(java.lang.String name, org.apache.axis.types.UnsignedInt delay) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disableserviceEx(java.lang.String name, org.apache.axis.types.UnsignedInt delay, NSConfig.YesnoEnum graceful) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetserviceResult getservice(java.lang.String name, boolean all, boolean internaL) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renameservice(java.lang.String name, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addservicegroup(java.lang.String servicegroupname, NSConfig.ServicetypeEnum servicetype, NSConfig.CachtypeEnum cachetype, NSConfig.EnabledisabledEnum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmservicegroup(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_server(java.lang.String servicegroupname, java.lang.String servername, org.apache.axis.types.UnsignedInt port, org.apache.axis.types.UnsignedInt weight) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_serverEx(java.lang.String servicegroupname, java.lang.String servername, org.apache.axis.types.UnsignedInt port, org.apache.axis.types.UnsignedInt weight, org.apache.axis.types.UnsignedInt serverid, org.apache.axis.types.UnsignedInt hashid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_serverEx2(java.lang.String servicegroupname, java.lang.String servername, org.apache.axis.types.UnsignedInt port, org.apache.axis.types.UnsignedInt weight, java.lang.String customserverid, org.apache.axis.types.UnsignedInt serverid, org.apache.axis.types.UnsignedInt hashid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_monitor(java.lang.String servicegroupname, java.lang.String monitorname, org.apache.axis.types.UnsignedInt weight2) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_maxclient(java.lang.String servicegroupname, org.apache.axis.types.UnsignedInt maxclient) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_maxreq(java.lang.String servicegroupname, org.apache.axis.types.UnsignedInt maxreq) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_healthmonitor(java.lang.String servicegroupname, NSConfig.YesnoEnum healthmonitor) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_cacheable(java.lang.String servicegroupname, NSConfig.YesnoEnum cacheable) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_cip(java.lang.String servicegroupname, NSConfig.EnabledisabledEnum cip, java.lang.String cipheader) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_usip(java.lang.String servicegroupname, NSConfig.YesnoEnum usip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_pathmonitor(java.lang.String servicegroupname, NSConfig.YesnoEnum pathmonitor) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_pathmonitorindv(java.lang.String servicegroupname, NSConfig.YesnoEnum pathmonitorindv) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_useproxyport(java.lang.String servicegroupname, NSConfig.YesnoEnum useproxyport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_sc(java.lang.String servicegroupname, NSConfig.OnoffEnum sc) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_sp(java.lang.String servicegroupname, NSConfig.OnoffEnum sp) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_rtspsessionidremap(java.lang.String servicegroupname, NSConfig.OnoffEnum rtspsessionidremap) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_clttimeout(java.lang.String servicegroupname, org.apache.axis.types.UnsignedInt clttimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_svrtimeout(java.lang.String servicegroupname, org.apache.axis.types.UnsignedInt svrtimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_cka(java.lang.String servicegroupname, NSConfig.YesnoEnum cka) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_tcpb(java.lang.String servicegroupname, NSConfig.YesnoEnum tcpb) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_cmp(java.lang.String servicegroupname, NSConfig.YesnoEnum cmp) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_maxbandwidth(java.lang.String servicegroupname, org.apache.axis.types.UnsignedInt maxbandwidth) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_monthreshold(java.lang.String servicegroupname, org.apache.axis.types.UnsignedInt monthreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_downstateflush(java.lang.String servicegroupname, NSConfig.EnabledisabledEnum downstateflush) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_tcpprofile(java.lang.String servicegroupname, java.lang.String tcpprofilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_httpprofile(java.lang.String servicegroupname, java.lang.String httpprofilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_comment(java.lang.String servicegroupname, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_appflowlog(java.lang.String servicegroupname, NSConfig.EnabledisabledEnum appflowlog) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setservicegroup_netprofile(java.lang.String servicegroupname, java.lang.String netprofile) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_server(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_maxclient(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_maxreq(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_cacheable(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_cip(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_usip(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_useproxyport(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_sc(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_sp(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_rtspsessionidremap(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_clttimeout(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_svrtimeout(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_cka(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_tcpb(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_cmp(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_maxbandwidth(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_monthreshold(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_tcpprofile(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_httpprofile(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_appflowlog(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_netprofile(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_monitorname(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_weight2(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_healthmonitor(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_cipheader(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_pathmonitor(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_pathmonitorindv(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_downstateflush(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetservicegroup_comment(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindservicegroup_ip(java.lang.String servicegroupname, java.lang.String ip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindservicegroup_server(java.lang.String servicegroupname, java.lang.String servername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindservicegroup_port(java.lang.String servicegroupname, org.apache.axis.types.UnsignedInt port) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindservicegroup_monitor(java.lang.String servicegroupname, java.lang.String monitorname, NSConfig.EnabledisabledEnum monstate) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindservicegroup_monitorEx(java.lang.String servicegroupname, java.lang.String monitorname, NSConfig.EnabledisabledEnum monstate, boolean passive) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindservicegroup_weight(java.lang.String servicegroupname, org.apache.axis.types.UnsignedInt weight) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindservicegroup_customserverid(java.lang.String servicegroupname, java.lang.String customserverid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindservicegroup_serverid(java.lang.String servicegroupname, org.apache.axis.types.UnsignedInt serverid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindservicegroup_state(java.lang.String servicegroupname, NSConfig.EnabledisabledEnum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindservicegroup_hashid(java.lang.String servicegroupname, org.apache.axis.types.UnsignedInt hashid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindservicegroup_ip(java.lang.String servicegroupname, java.lang.String ip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindservicegroup_server(java.lang.String servicegroupname, java.lang.String servername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindservicegroup_port(java.lang.String servicegroupname, org.apache.axis.types.UnsignedInt port) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindservicegroup_monitor(java.lang.String servicegroupname, java.lang.String monitorname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult enableservicegroup(java.lang.String servicegroupname, java.lang.String servername, org.apache.axis.types.UnsignedInt port) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disableservicegroup(java.lang.String servicegroupname, java.lang.String servername, org.apache.axis.types.UnsignedInt port, org.apache.axis.types.UnsignedInt delay) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disableservicegroupEx(java.lang.String servicegroupname, java.lang.String servername, org.apache.axis.types.UnsignedInt port, org.apache.axis.types.UnsignedInt delay, NSConfig.YesnoEnum graceful) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetservicegroupResult getservicegroup(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renameservicegroup(java.lang.String servicegroupname, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult restartdbsmonitors() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult clearlocationdata() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsvcbindingsResult getsvcbindings(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetservicegroupbindingsResult getservicegroupbindings(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetconfigstatusResult getconfigstatus() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlocationparameter_context(NSConfig.ProximitycontextEnum context) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlocationparameter_q1Label(java.lang.String q1Label) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlocationparameter_q2Label(java.lang.String q2Label) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlocationparameter_q3Label(java.lang.String q3Label) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlocationparameter_q4Label(java.lang.String q4Label) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlocationparameter_q5Label(java.lang.String q5Label) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlocationparameter_q6Label(java.lang.String q6Label) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlocationparameter_context() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlocationparameter_q1Label() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlocationparameter_q2Label() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlocationparameter_q3Label() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlocationparameter_q4Label() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlocationparameter_q5Label() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlocationparameter_q6Label() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetlocationparameterResult getlocationparameter() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult rmvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setvserver_backupvserver(java.lang.String name, java.lang.String backupvserver) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setvserver_redirecturl(java.lang.String name, java.lang.String redirecturl) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setvserver_cacheable(java.lang.String name, NSConfig.YesnoEnum cacheable) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setvserver_clttimeout(java.lang.String name, org.apache.axis.types.UnsignedInt clttimeout) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setvserver_somethod(java.lang.String name, NSConfig.SpillovermethodsEnum somethod) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setvserver_sopersistence(java.lang.String name, NSConfig.EnabledisabledEnum sopersistence) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setvserver_sopersistencetimeout(java.lang.String name, org.apache.axis.types.UnsignedInt sopersistencetimeout) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setvserver_sothreshold(java.lang.String name, org.apache.axis.types.UnsignedInt sothreshold) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setvserver_pushvserver(java.lang.String name, java.lang.String pushvserver) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetvserver_backupvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetvserver_redirecturl(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetvserver_redirecturl2(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetvserver_cacheable(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetvserver_clttimeout(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetvserver_somethod(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetvserver_sopersistence(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetvserver_sopersistencetimeout(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetvserver_sothreshold(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetvserver_pushvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult enablevserver(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult disablevserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setuiinternal_template(NSConfig.UiinternalentitytypeEnum entitytype, java.lang.String name, java.lang.String templatE) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setuiinternal_comment(NSConfig.UiinternalentitytypeEnum entitytype, java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setuiinternal_rule(NSConfig.UiinternalentitytypeEnum entitytype, java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetuiinternal_template(NSConfig.UiinternalentitytypeEnum entitytype, java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetuiinternal_comment(NSConfig.UiinternalentitytypeEnum entitytype, java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetuiinternal_rule(NSConfig.UiinternalentitytypeEnum entitytype, java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetuiinternal_all(NSConfig.UiinternalentitytypeEnum entitytype, java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetuiinternalResult getuiinternal(java.lang.String entitytype, java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult enablereporting() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disablereporting() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetreportingResult getreporting() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult importapplication(java.lang.String apptemplatefilename, java.lang.String appname, java.lang.String deploymentfilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult exportapplication(java.lang.String appname, java.lang.String apptemplatefilename, java.lang.String deploymentfilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmapplication(java.lang.String appname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addaaauser(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmaaauser(java.lang.String username) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaauser_password(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindaaauser_policy(java.lang.String username, java.lang.String policy, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindaaauser_intranetapplication(java.lang.String username, java.lang.String intranetapplication) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindaaauser_url(java.lang.String username, java.lang.String urlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindaaauser_intranetip(java.lang.String username, java.lang.String intranetip, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindaaauser_policy(java.lang.String username, java.lang.String policy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindaaauser_intranetapplication(java.lang.String username, java.lang.String intranetapplication) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindaaauser_url(java.lang.String username, java.lang.String urlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindaaauser_intranetip(java.lang.String username, java.lang.String intranetip, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetaaauserResult getaaauser(java.lang.String username, boolean loggedin) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addaaagroup(java.lang.String groupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmaaagroup(java.lang.String groupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindaaagroup_username(java.lang.String groupname, java.lang.String username) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindaaagroup_policy(java.lang.String groupname, java.lang.String policy, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindaaagroup_intranetapplication(java.lang.String groupname, java.lang.String intranetapplication) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindaaagroup_url(java.lang.String groupname, java.lang.String urlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindaaagroup_intranetip(java.lang.String groupname, java.lang.String intranetip, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindaaagroup_username(java.lang.String groupname, java.lang.String username) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindaaagroup_policy(java.lang.String groupname, java.lang.String policy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindaaagroup_intranetapplication(java.lang.String groupname, java.lang.String intranetapplication) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindaaagroup_url(java.lang.String groupname, java.lang.String urlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindaaagroup_intranetip(java.lang.String groupname, java.lang.String intranetip, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetaaagroupResult getaaagroup(java.lang.String groupname, boolean loggedin) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addaaapreauthenticationaction(java.lang.String name, NSConfig.AllowdenyEnum preauthenticationaction, java.lang.String killprocess, java.lang.String deletefiles) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmaaapreauthenticationaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaapreauthenticationaction_preauthenticationaction(java.lang.String name, NSConfig.AllowdenyEnum preauthenticationaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaapreauthenticationaction_killprocess(java.lang.String name, java.lang.String killprocess) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaapreauthenticationaction_deletefiles(java.lang.String name, java.lang.String deletefiles) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaapreauthenticationaction_killprocess(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaapreauthenticationaction_deletefiles(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetaaapreauthenticationactionResult getaaapreauthenticationaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addaaapreauthenticationpolicy(java.lang.String name, java.lang.String rule, java.lang.String reqaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmaaapreauthenticationpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaapreauthenticationpolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaapreauthenticationpolicy_reqaction(java.lang.String name, java.lang.String reqaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetaaapreauthenticationpolicyResult getaaapreauthenticationpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetaaasessionResult getaaasession(java.lang.String username, java.lang.String groupname, java.lang.String intranetip, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult killaaasession(java.lang.String username, java.lang.String groupname, java.lang.String intranetip, java.lang.String netmask, boolean all) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaradiusparams_serverip(java.lang.String radkey, java.lang.String serverip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaradiusparams_serverport(java.lang.String radkey, org.apache.axis.types.UnsignedInt serverport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaradiusparams_authtimeout(java.lang.String radkey, org.apache.axis.types.UnsignedInt authtimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaradiusparams_radkey(java.lang.String radkey) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaradiusparams_radnasip(java.lang.String radkey, NSConfig.EnabledisabledEnum radnasip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaradiusparams_radnasid(java.lang.String radkey, java.lang.String radnasid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaradiusparams_radvendorid(java.lang.String radkey, org.apache.axis.types.UnsignedInt radvendorid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaradiusparams_radattributetype(java.lang.String radkey, org.apache.axis.types.UnsignedInt radattributetype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaradiusparams_radgroupsprefix(java.lang.String radkey, java.lang.String radgroupsprefix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaradiusparams_radgroupseparator(java.lang.String radkey, java.lang.String radgroupseparator) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaradiusparams_passencoding(java.lang.String radkey, NSConfig.RadpassencodingEnum passencoding) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaradiusparams_ipvendorid(java.lang.String radkey, org.apache.axis.types.UnsignedInt ipvendorid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaradiusparams_ipattributetype(java.lang.String radkey, org.apache.axis.types.UnsignedInt ipattributetype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaradiusparams_accounting(java.lang.String radkey, NSConfig.OnoffEnum accounting) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaradiusparams_pwdvendorid(java.lang.String radkey, org.apache.axis.types.UnsignedInt pwdvendorid, org.apache.axis.types.UnsignedInt pwdattributetype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaradiusparams_defaultauthenticationgroup(java.lang.String radkey, java.lang.String defaultauthenticationgroup) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaradiusparams_callingstationid(java.lang.String radkey, NSConfig.EnabledisabledEnum callingstationid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaradiusparams_serverip() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaradiusparams_serverport() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaradiusparams_authtimeout() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaradiusparams_radnasip() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaradiusparams_radnasid() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaradiusparams_radvendorid() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaradiusparams_radattributetype() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaradiusparams_radgroupsprefix() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaradiusparams_radgroupseparator() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaradiusparams_passencoding() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaradiusparams_ipvendorid() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaradiusparams_ipattributetype() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaradiusparams_accounting() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaradiusparams_pwdvendorid() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaradiusparams_pwdattributetype() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaradiusparams_defaultauthenticationgroup() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaradiusparams_callingstationid() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetaaaradiusparamsResult getaaaradiusparams() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaldapparams_serverip(java.lang.String serverip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaldapparams_serverport(org.apache.axis.types.UnsignedInt serverport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaldapparams_authtimeout(org.apache.axis.types.UnsignedInt authtimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaldapparams_ldapbase(java.lang.String ldapbase) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaldapparams_ldapbinddn(java.lang.String ldapbinddn) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaldapparams_ldapbinddnpassword(java.lang.String ldapbinddnpassword) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaldapparams_ldaploginname(java.lang.String ldaploginname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaldapparams_searchfilter(java.lang.String searchfilter) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaldapparams_groupattrname(java.lang.String groupattrname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaldapparams_subattributename(java.lang.String subattributename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaldapparams_sectype(NSConfig.SectypeEnum sectype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaldapparams_svrtype(NSConfig.SvrtypeEnum svrtype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaldapparams_ssonameattribute(java.lang.String ssonameattribute) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaldapparams_passwdchange(NSConfig.EnabledisabledEnum passwdchange) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaldapparams_nestedgroupextraction(NSConfig.OnoffEnum nestedgroupextraction, org.apache.axis.types.UnsignedInt maxnestinglevel, java.lang.String groupnameidentifier, java.lang.String groupsearchattribute, java.lang.String groupsearchsubattribute, java.lang.String groupsearchfilter) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaldapparams_defaultauthenticationgroup(java.lang.String defaultauthenticationgroup) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaldapparams_serverip() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaldapparams_serverport() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaldapparams_authtimeout() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaldapparams_ldapbase() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaldapparams_ldapbinddn() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaldapparams_ldapbinddnpassword() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaldapparams_ldaploginname() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaldapparams_searchfilter() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaldapparams_groupattrname() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaldapparams_subattributename() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaldapparams_sectype() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaldapparams_svrtype() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaldapparams_ssonameattribute() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaldapparams_passwdchange() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaldapparams_nestedgroupextraction() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaldapparams_maxnestinglevel() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaldapparams_groupnameidentifier() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaldapparams_groupsearchattribute() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaldapparams_groupsearchsubattribute() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaldapparams_groupsearchfilter() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaldapparams_defaultauthenticationgroup() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetaaaldapparamsResult getaaaldapparams() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaatacacsparams_serverip(java.lang.String serverip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaatacacsparams_serverport(org.apache.axis.types.UnsignedInt serverport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaatacacsparams_authtimeout(org.apache.axis.types.UnsignedInt authtimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaatacacsparams_tacacssecret(java.lang.String tacacssecret) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaatacacsparams_authorization(NSConfig.OnoffEnum authorization) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaatacacsparams_accounting(NSConfig.OnoffEnum accounting) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaatacacsparams_auditfailedcmds(NSConfig.OnoffEnum auditfailedcmds) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaatacacsparams_defaultauthenticationgroup(java.lang.String defaultauthenticationgroup) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaatacacsparams_serverip() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaatacacsparams_serverport() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaatacacsparams_authtimeout() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaatacacsparams_tacacssecret() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaatacacsparams_authorization() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaatacacsparams_accounting() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaatacacsparams_auditfailedcmds() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaatacacsparams_defaultauthenticationgroup() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetaaatacacsparamsResult getaaatacacsparams() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaacertparams_usernamefield(java.lang.String usernamefield) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaacertparams_groupnamefield(java.lang.String groupnamefield) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaacertparams_defaultauthenticationgroup(java.lang.String defaultauthenticationgroup) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaacertparams_usernamefield() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaacertparams_groupnamefield() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaacertparams_defaultauthenticationgroup() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetaaacertparamsResult getaaacertparams() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaparameter_enablestaticpagecaching(NSConfig.Staticpage_cachingEnum enablestaticpagecaching) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaparameter_enableenhancedauthfeedback(NSConfig.Enhanced_auth_feedbackEnum enableenhancedauthfeedback) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaparameter_defaultauthtype(NSConfig.AuthtypeEnum defaultauthtype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaparameter_maxaaausers(org.apache.axis.types.UnsignedInt maxaaausers) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaparameter_maxloginattempts(org.apache.axis.types.UnsignedInt maxloginattempts, org.apache.axis.types.UnsignedInt failedlogintimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaaparameter_aaadnatip(java.lang.String aaadnatip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaparameter_enablestaticpagecaching() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaparameter_enableenhancedauthfeedback() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaparameter_defaultauthtype() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaparameter_maxaaausers() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaparameter_aaadnatip() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaaparameter_maxloginattempts() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetaaaparameterResult getaaaparameter() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaapreauthenticationparameter_preauthenticationaction(NSConfig.AllowdenyEnum preauthenticationaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaapreauthenticationparameter_rule(java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaapreauthenticationparameter_killprocess(java.lang.String killprocess) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaapreauthenticationparameter_deletefiles(java.lang.String deletefiles) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaapreauthenticationparameter_rule() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaapreauthenticationparameter_preauthenticationaction() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaapreauthenticationparameter_killprocess() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaapreauthenticationparameter_deletefiles() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetaaapreauthenticationparameterResult getaaapreauthenticationparameter() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindaaaglobal_policy(java.lang.String policy, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindaaaglobal_windowsprofile(java.lang.String windowsprofile) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindaaaglobal_policy(java.lang.String policy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindaaaglobal_windowsprofile(java.lang.String windowsprofile) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetaaaglobalResult getaaaglobal() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addaaakcdaccount(java.lang.String kcdaccount, java.lang.String keytab) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmaaakcdaccount(java.lang.String kcdaccount) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaakcdaccount_keytab(java.lang.String kcdaccount, java.lang.String keytab) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaakcdaccount_realmstr(java.lang.String kcdaccount, java.lang.String realmstr) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaakcdaccount_delegateduser(java.lang.String kcdaccount, java.lang.String delegateduser) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaakcdaccount_kcdpassword(java.lang.String kcdaccount, java.lang.String kcdpassword) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaakcdaccount_usercert(java.lang.String kcdaccount, java.lang.String usercert) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setaaakcdaccount_cacert(java.lang.String kcdaccount, java.lang.String cacert) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaakcdaccount_keytab(java.lang.String kcdaccount) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaakcdaccount_usercert(java.lang.String kcdaccount) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetaaakcdaccount_cacert(java.lang.String kcdaccount) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetaaakcdaccountResult getaaakcdaccount(java.lang.String kcdaccount) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addappflowcollector(java.lang.String name, java.lang.String ipaddress, org.apache.axis.types.UnsignedInt port, java.lang.String netprofile) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmappflowcollector(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renameappflowcollector(java.lang.String name, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetappflowcollectorResult getappflowcollector(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addappflowaction(java.lang.String name, java.lang.String collectors) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmappflowaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappflowaction_collectors(java.lang.String name, java.lang.String collectors) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappflowaction_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappflowaction_comment(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renameappflowaction(java.lang.String name, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetappflowactionResult getappflowaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addappflowpolicy(java.lang.String name, java.lang.String rule, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmappflowpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappflowpolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappflowpolicy_action(java.lang.String name, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappflowpolicy_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappflowpolicy_comment(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renameappflowpolicy(java.lang.String name, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetappflowpolicyResult getappflowpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addappflowpolicylabel(java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmappflowpolicylabel(java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappflowpolicylabel_policy(java.lang.String labelname, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, java.lang.String gotopriorityexpression, boolean invoke, NSConfig.PolicylabelappflowinvoketypeEnum labeltype, java.lang.String labelname2) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappflowpolicylabel_policy(java.lang.String labelname, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renameappflowpolicylabel(java.lang.String labelname, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetappflowpolicylabelResult getappflowpolicylabel(java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappflowparam_templaterefresh(org.apache.axis.types.UnsignedInt templaterefresh) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappflowparam_appnamerefresh(org.apache.axis.types.UnsignedInt appnamerefresh) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappflowparam_flowrecordinterval(org.apache.axis.types.UnsignedInt flowrecordinterval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappflowparam_udppmtu(org.apache.axis.types.UnsignedInt udppmtu) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappflowparam_httpurl(NSConfig.EnabledisabledEnum httpurl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappflowparam_aaausername(NSConfig.EnabledisabledEnum aaausername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappflowparam_httpcookie(NSConfig.EnabledisabledEnum httpcookie) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappflowparam_httpreferer(NSConfig.EnabledisabledEnum httpreferer) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappflowparam_httpmethod(NSConfig.EnabledisabledEnum httpmethod) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappflowparam_httphost(NSConfig.EnabledisabledEnum httphost) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappflowparam_httpuseragent(NSConfig.EnabledisabledEnum httpuseragent) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappflowparam_clienttrafficonly(NSConfig.YesnoEnum clienttrafficonly) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappflowparam_httpcontenttype(NSConfig.EnabledisabledEnum httpcontenttype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappflowparam_httpauthorization(NSConfig.EnabledisabledEnum httpauthorization) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappflowparam_httpvia(NSConfig.EnabledisabledEnum httpvia) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappflowparam_httpxforwardedfor(NSConfig.EnabledisabledEnum httpxforwardedfor) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappflowparam_httplocation(NSConfig.EnabledisabledEnum httplocation) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappflowparam_httpsetcookie(NSConfig.EnabledisabledEnum httpsetcookie) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappflowparam_httpsetcookie2(NSConfig.EnabledisabledEnum httpsetcookie2) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappflowparam_connectionchaining(NSConfig.EnabledisabledEnum connectionchaining) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappflowparam_templaterefresh() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappflowparam_appnamerefresh() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappflowparam_flowrecordinterval() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappflowparam_udppmtu() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappflowparam_httpurl() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappflowparam_aaausername() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappflowparam_httpcookie() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappflowparam_httpreferer() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappflowparam_httpmethod() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappflowparam_httphost() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappflowparam_httpuseragent() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappflowparam_clienttrafficonly() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappflowparam_httpcontenttype() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappflowparam_httpauthorization() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappflowparam_httpvia() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappflowparam_httpxforwardedfor() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappflowparam_httplocation() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappflowparam_httpsetcookie() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappflowparam_httpsetcookie2() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappflowparam_connectionchaining() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetappflowparamResult getappflowparam() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappflowglobal_policy(java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, java.lang.String gotopriorityexpression, NSConfig.AppflowglobalbindpointEnum type, boolean invoke, NSConfig.PolicylabelappflowinvoketypeEnum labeltype, java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappflowglobal_policy(java.lang.String policyname, NSConfig.AppflowglobalbindpointEnum type, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetappflowglobalResult getappflowglobal(java.lang.String type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addappfwfieldtype(java.lang.String name, java.lang.String regex, org.apache.axis.types.UnsignedInt priority, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmappfwfieldtype(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwfieldtype_regex(java.lang.String name, java.lang.String regex, org.apache.axis.types.UnsignedInt priority, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetappfwfieldtypeResult getappfwfieldtype(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addappfwprofile(java.lang.String name, NSConfig.AppsecprofiledefaultEnum defaults) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmappfwprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_starturlaction(java.lang.String name, NSConfig.AppsecdispositionEnum starturlaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_starturlclosure(java.lang.String name, NSConfig.OnoffEnum starturlclosure) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_denyurlaction(java.lang.String name, NSConfig.AppsecdispositioncommerceEnum denyurlaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_refererheadercheck(java.lang.String name, NSConfig.Appsec_header_checkEnum refererheadercheck) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_cookieconsistencyaction(java.lang.String name, NSConfig.AppsecdispositionEnum cookieconsistencyaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_cookietransforms(java.lang.String name, NSConfig.OnoffEnum cookietransforms) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_cookieencryption(java.lang.String name, NSConfig.AppsecckiencryptionEnum cookieencryption) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_cookieproxying(java.lang.String name, NSConfig.AppsecckiproxyingEnum cookieproxying) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_addcookieflags(java.lang.String name, NSConfig.AppsecaddckiflagsEnum addcookieflags) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_fieldconsistencyaction(java.lang.String name, NSConfig.AppsecdispositionEnum fieldconsistencyaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_csrftagaction(java.lang.String name, NSConfig.AppsecdispositionEnum csrftagaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_crosssitescriptingaction(java.lang.String name, NSConfig.AppsecdispositionEnum crosssitescriptingaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_crosssitescriptingtransformunsafehtml(java.lang.String name, NSConfig.OnoffEnum crosssitescriptingtransformunsafehtml) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_crosssitescriptingcheckcompleteurls(java.lang.String name, NSConfig.OnoffEnum crosssitescriptingcheckcompleteurls) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_sqlinjectionaction(java.lang.String name, NSConfig.AppsecdispositionEnum sqlinjectionaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_sqlinjectiontransformspecialchars(java.lang.String name, NSConfig.OnoffEnum sqlinjectiontransformspecialchars) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_sqlinjectiononlycheckfieldswithsqlchars(java.lang.String name, NSConfig.OnoffEnum sqlinjectiononlycheckfieldswithsqlchars) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_sqlinjectionchecksqlwildchars(java.lang.String name, NSConfig.OnoffEnum sqlinjectionchecksqlwildchars) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_fieldformataction(java.lang.String name, NSConfig.AppsecdispositionEnum fieldformataction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_defaultfieldformattype(java.lang.String name, java.lang.String defaultfieldformattype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_defaultfieldformatminlength(java.lang.String name, org.apache.axis.types.UnsignedInt defaultfieldformatminlength) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_defaultfieldformatmaxlength(java.lang.String name, org.apache.axis.types.UnsignedInt defaultfieldformatmaxlength) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_bufferoverflowaction(java.lang.String name, NSConfig.AppsecdispositioncommerceEnum bufferoverflowaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_bufferoverflowmaxurllength(java.lang.String name, org.apache.axis.types.UnsignedInt bufferoverflowmaxurllength) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_bufferoverflowmaxheaderlength(java.lang.String name, org.apache.axis.types.UnsignedInt bufferoverflowmaxheaderlength) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_bufferoverflowmaxcookielength(java.lang.String name, org.apache.axis.types.UnsignedInt bufferoverflowmaxcookielength) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_creditcardaction(java.lang.String name, NSConfig.AppsecdispositioncommerceEnum creditcardaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_creditcard(java.lang.String name, NSConfig.AppsecsafecommercecardtypesEnum creditcard) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_creditcardmaxallowed(java.lang.String name, org.apache.axis.types.UnsignedInt creditcardmaxallowed) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_creditcardxout(java.lang.String name, NSConfig.OnoffEnum creditcardxout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_requestcontenttype(java.lang.String name, java.lang.String requestcontenttype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_responsecontenttype(java.lang.String name, java.lang.String responsecontenttype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_xmldosaction(java.lang.String name, NSConfig.AppsecdispositioncommerceEnum _xmldosaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_xmlformataction(java.lang.String name, NSConfig.AppsecdispositioncommerceEnum _xmlformataction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_xmlsqlinjectionaction(java.lang.String name, NSConfig.AppsecdispositioncommerceEnum _xmlsqlinjectionaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_xmlsqlinjectiononlycheckfieldswithsqlchars(java.lang.String name, NSConfig.OnoffEnum xmlsqlinjectiononlycheckfieldswithsqlchars) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_xmlsqlinjectionchecksqlwildchars(java.lang.String name, NSConfig.OnoffEnum xmlsqlinjectionchecksqlwildchars) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_xmlsqlinjectionparsecomments(java.lang.String name, NSConfig.AppsecsqlinjectionparsecommentsEnum xmlsqlinjectionparsecomments) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_xmlxssaction(java.lang.String name, NSConfig.AppsecdispositioncommerceEnum _xmlxssaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_xmlwsiaction(java.lang.String name, NSConfig.AppsecdispositioncommerceEnum _xmlwsiaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_xmlattachmentaction(java.lang.String name, NSConfig.AppsecdispositioncommerceEnum _xmlattachmentaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_xmlvalidationaction(java.lang.String name, NSConfig.AppsecdispositioncommerceEnum _xmlvalidationaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_xmlerrorobject(java.lang.String name, java.lang.String xmlerrorobject) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_customsettings(java.lang.String name, java.lang.String customsettings) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_signatures(java.lang.String name, java.lang.String signatures) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_xmlsoapfaultaction(java.lang.String name, NSConfig.AppsecdispositionsoapfaultEnum xmlsoapfaultaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_usehtmlerrorobject(java.lang.String name, NSConfig.OnoffEnum usehtmlerrorobject) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_errorurl(java.lang.String name, java.lang.String errorurl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_htmlerrorobject(java.lang.String name, java.lang.String htmlerrorobject) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_logeverypolicyhit(java.lang.String name, NSConfig.OnoffEnum logeverypolicyhit) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_stripcomments(java.lang.String name, NSConfig.OnoffEnum stripcomments) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_striphtmlcomments(java.lang.String name, NSConfig.AppsecstripcommentoptionsEnum striphtmlcomments) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_stripxmlcomments(java.lang.String name, NSConfig.AppsecstripxmlcommentoptionsEnum stripxmlcomments) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_exemptclosureurlsfromsecuritychecks(java.lang.String name, NSConfig.OnoffEnum exemptclosureurlsfromsecuritychecks) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_defaultcharset(java.lang.String name, java.lang.String defaultcharset) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_postbodylimit(java.lang.String name, org.apache.axis.types.UnsignedInt postbodylimit) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_fileuploadmaxnum(java.lang.String name, org.apache.axis.types.UnsignedInt fileuploadmaxnum) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_canonicalizehtmlresponse(java.lang.String name, NSConfig.OnoffEnum canonicalizehtmlresponse) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_enableformtagging(java.lang.String name, NSConfig.OnoffEnum enableformtagging) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_sessionlessfieldconsistency(java.lang.String name, NSConfig.AppsecsessionlessffcEnum sessionlessfieldconsistency) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_sessionlessurlclosure(java.lang.String name, NSConfig.OnoffEnum sessionlessurlclosure) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_semicolonfieldseparator(java.lang.String name, NSConfig.OnoffEnum semicolonfieldseparator) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_excludefileuploadfromchecks(java.lang.String name, NSConfig.OnoffEnum excludefileuploadfromchecks) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_sqlinjectionparsecomments(java.lang.String name, NSConfig.AppsecsqlinjectionparsecommentsEnum sqlinjectionparsecomments) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_invalidpercenthandling(java.lang.String name, NSConfig.AppsecpercentdecodeoptionsEnum invalidpercenthandling) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_type(java.lang.String name, NSConfig.AppsecprofiletypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_checkrequestheaders(java.lang.String name, NSConfig.OnoffEnum checkrequestheaders) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwprofile_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_starturlaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_starturlclosure(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_denyurlaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_refererheadercheck(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_cookieconsistencyaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_cookietransforms(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_cookieencryption(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_cookieproxying(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_addcookieflags(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_fieldconsistencyaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_csrftagaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_crosssitescriptingaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_crosssitescriptingtransformunsafehtml(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_crosssitescriptingcheckcompleteurls(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_sqlinjectionaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_sqlinjectiontransformspecialchars(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_sqlinjectiononlycheckfieldswithsqlchars(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_sqlinjectionchecksqlwildchars(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_fieldformataction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_defaultfieldformattype(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_defaultfieldformatminlength(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_defaultfieldformatmaxlength(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_bufferoverflowaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_bufferoverflowmaxurllength(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_bufferoverflowmaxheaderlength(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_bufferoverflowmaxcookielength(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_creditcardaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_creditcard(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_creditcardmaxallowed(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_creditcardxout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_requestcontenttype(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_responsecontenttype(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_xmldosaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_xmlformataction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_xmlsqlinjectionaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_xmlsqlinjectiononlycheckfieldswithsqlchars(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_xmlsqlinjectionchecksqlwildchars(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_xmlsqlinjectionparsecomments(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_xmlxssaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_xmlwsiaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_xmlattachmentaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_xmlvalidationaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_xmlerrorobject(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_customsettings(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_signatures(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_xmlsoapfaultaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_usehtmlerrorobject(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_errorurl(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_htmlerrorobject(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_logeverypolicyhit(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_stripcomments(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_striphtmlcomments(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_stripxmlcomments(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_exemptclosureurlsfromsecuritychecks(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_defaultcharset(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_postbodylimit(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_fileuploadmaxnum(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_canonicalizehtmlresponse(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_enableformtagging(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_sessionlessfieldconsistency(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_sessionlessurlclosure(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_semicolonfieldseparator(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_excludefileuploadfromchecks(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_sqlinjectionparsecomments(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_invalidpercenthandling(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_type(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_checkrequestheaders(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwprofile_comment(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwprofile_starturl(java.lang.String name, java.lang.String starturl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwprofile_denyurl(java.lang.String name, java.lang.String denyurl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwprofile_fieldconsistency(java.lang.String name, java.lang.String fieldconsistency, java.lang.String formactionurl, NSConfig.RegexnotregexEnum isregex) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwprofile_cookieconsistency(java.lang.String name, java.lang.String cookieconsistency, NSConfig.RegexnotregexEnum isregex2) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwprofile_sqlinjection(java.lang.String name, java.lang.String sqlinjection, java.lang.String formactionurl2, NSConfig.RegexnotregexEnum isregex3) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwprofile_sqlinjectionEx(java.lang.String name, java.lang.String sqlinjection, java.lang.String formactionurl2, NSConfig.RegexnotregexEnum isregex3, NSConfig.AppsecscanlocationEnum location) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwprofile_csrftag(java.lang.String name, java.lang.String csrftag, java.lang.String csrfformactionurl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwprofile_crosssitescripting(java.lang.String name, java.lang.String crosssitescripting, java.lang.String formactionurl3, NSConfig.RegexnotregexEnum isregex4) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwprofile_crosssitescriptingEx(java.lang.String name, java.lang.String crosssitescripting, java.lang.String formactionurl3, NSConfig.RegexnotregexEnum isregex4, NSConfig.AppsecscanlocationEnum location2) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwprofile_fieldformat(java.lang.String name, java.lang.String fieldformat, java.lang.String formactionurl4, java.lang.String fieldtype, org.apache.axis.types.UnsignedInt fieldformatminlength, org.apache.axis.types.UnsignedInt fieldformatmaxlength, NSConfig.RegexnotregexEnum isregex5) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwprofile_safeobject(java.lang.String name, java.lang.String safeobject, java.lang.String expression, org.apache.axis.types.UnsignedInt maxmatchlength, NSConfig.AppsecdispositionobjectexpressionEnum actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwprofile_trustedlearningclients(java.lang.String name, java.lang.String trustedlearningclients) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwprofile_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwprofile_state(java.lang.String name, NSConfig.EnabledisabledEnum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwprofile_xmldosurl(java.lang.String name, java.lang.String xmldosurl, NSConfig.OnoffEnum xmlmaxelementdepthcheck, org.apache.axis.types.UnsignedInt xmlmaxelementdepth, NSConfig.OnoffEnum xmlmaxelementnamelengthcheck, org.apache.axis.types.UnsignedInt xmlmaxelementnamelength, NSConfig.OnoffEnum xmlmaxelementscheck, org.apache.axis.types.UnsignedInt xmlmaxelements, NSConfig.OnoffEnum xmlmaxelementchildrencheck, org.apache.axis.types.UnsignedInt xmlmaxelementchildren, NSConfig.OnoffEnum xmlmaxattributescheck, org.apache.axis.types.UnsignedInt xmlmaxattributes, NSConfig.OnoffEnum xmlmaxattributenamelengthcheck, org.apache.axis.types.UnsignedInt xmlmaxattributenamelength, NSConfig.OnoffEnum xmlmaxattributevaluelengthcheck, org.apache.axis.types.UnsignedInt xmlmaxattributevaluelength, NSConfig.OnoffEnum xmlmaxchardatalengthcheck, org.apache.axis.types.UnsignedInt xmlmaxchardatalength, NSConfig.OnoffEnum xmlmaxfilesizecheck, org.apache.axis.types.UnsignedInt xmlmaxfilesize, NSConfig.OnoffEnum xmlminfilesizecheck, org.apache.axis.types.UnsignedInt xmlminfilesize, NSConfig.OnoffEnum xmlblockpi, NSConfig.OnoffEnum xmlblockdtd, NSConfig.OnoffEnum xmlblockexternalentities) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwprofile_xmldosurlEx(java.lang.String name, java.lang.String xmldosurl, NSConfig.OnoffEnum xmlmaxelementdepthcheck, org.apache.axis.types.UnsignedInt xmlmaxelementdepth, NSConfig.OnoffEnum xmlmaxelementnamelengthcheck, org.apache.axis.types.UnsignedInt xmlmaxelementnamelength, NSConfig.OnoffEnum xmlmaxelementscheck, org.apache.axis.types.UnsignedInt xmlmaxelements, NSConfig.OnoffEnum xmlmaxelementchildrencheck, org.apache.axis.types.UnsignedInt xmlmaxelementchildren, NSConfig.OnoffEnum xmlmaxattributescheck, org.apache.axis.types.UnsignedInt xmlmaxattributes, NSConfig.OnoffEnum xmlmaxattributenamelengthcheck, org.apache.axis.types.UnsignedInt xmlmaxattributenamelength, NSConfig.OnoffEnum xmlmaxattributevaluelengthcheck, org.apache.axis.types.UnsignedInt xmlmaxattributevaluelength, NSConfig.OnoffEnum xmlmaxchardatalengthcheck, org.apache.axis.types.UnsignedInt xmlmaxchardatalength, NSConfig.OnoffEnum xmlmaxfilesizecheck, org.apache.axis.types.UnsignedInt xmlmaxfilesize, NSConfig.OnoffEnum xmlminfilesizecheck, org.apache.axis.types.UnsignedInt xmlminfilesize, NSConfig.OnoffEnum xmlblockpi, NSConfig.OnoffEnum xmlblockdtd, NSConfig.OnoffEnum xmlblockexternalentities, NSConfig.OnoffEnum xmlmaxentityexpansionscheck, org.apache.axis.types.UnsignedInt xmlmaxentityexpansions, NSConfig.OnoffEnum xmlmaxentityexpansiondepthcheck, org.apache.axis.types.UnsignedInt xmlmaxentityexpansiondepth, NSConfig.OnoffEnum xmlmaxnamespacescheck, org.apache.axis.types.UnsignedInt xmlmaxnamespaces, NSConfig.OnoffEnum xmlmaxnamespaceurilengthcheck, org.apache.axis.types.UnsignedInt xmlmaxnamespaceurilength) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwprofile_xmldosurlEx2(java.lang.String name, java.lang.String xmldosurl, NSConfig.OnoffEnum xmlmaxelementdepthcheck, org.apache.axis.types.UnsignedInt xmlmaxelementdepth, NSConfig.OnoffEnum xmlmaxelementnamelengthcheck, org.apache.axis.types.UnsignedInt xmlmaxelementnamelength, NSConfig.OnoffEnum xmlmaxelementscheck, org.apache.axis.types.UnsignedInt xmlmaxelements, NSConfig.OnoffEnum xmlmaxelementchildrencheck, org.apache.axis.types.UnsignedInt xmlmaxelementchildren, NSConfig.OnoffEnum xmlmaxattributescheck, org.apache.axis.types.UnsignedInt xmlmaxattributes, NSConfig.OnoffEnum xmlmaxattributenamelengthcheck, org.apache.axis.types.UnsignedInt xmlmaxattributenamelength, NSConfig.OnoffEnum xmlmaxattributevaluelengthcheck, org.apache.axis.types.UnsignedInt xmlmaxattributevaluelength, NSConfig.OnoffEnum xmlmaxchardatalengthcheck, org.apache.axis.types.UnsignedInt xmlmaxchardatalength, NSConfig.OnoffEnum xmlmaxfilesizecheck, org.apache.axis.types.UnsignedInt xmlmaxfilesize, NSConfig.OnoffEnum xmlminfilesizecheck, org.apache.axis.types.UnsignedInt xmlminfilesize, NSConfig.OnoffEnum xmlblockpi, NSConfig.OnoffEnum xmlblockdtd, NSConfig.OnoffEnum xmlblockexternalentities, NSConfig.OnoffEnum xmlmaxentityexpansionscheck, org.apache.axis.types.UnsignedInt xmlmaxentityexpansions, NSConfig.OnoffEnum xmlmaxentityexpansiondepthcheck, org.apache.axis.types.UnsignedInt xmlmaxentityexpansiondepth, NSConfig.OnoffEnum xmlmaxnamespacescheck, org.apache.axis.types.UnsignedInt xmlmaxnamespaces, NSConfig.OnoffEnum xmlmaxnamespaceurilengthcheck, org.apache.axis.types.UnsignedInt xmlmaxnamespaceurilength, NSConfig.OnoffEnum xmlsoaparraycheck, org.apache.axis.types.UnsignedInt xmlmaxsoaparraysize, org.apache.axis.types.UnsignedInt xmlmaxsoaparrayrank) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwprofile_xmlwsiurl(java.lang.String name, java.lang.String xmlwsiurl, java.lang.String xmlwsichecks) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwprofile_xmlvalidationurl(java.lang.String name, java.lang.String xmlvalidationurl, java.lang.String xmlrequestschema, java.lang.String xmlresponseschema, java.lang.String xmlwsdl, NSConfig.OnoffEnum xmladditionalsoapheaders, NSConfig.OnoffEnum xmlvalidatesoapenvelope, NSConfig.OnoffEnum xmlvalidateresponse) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwprofile_xmlvalidationurlEx(java.lang.String name, java.lang.String xmlvalidationurl, java.lang.String xmlrequestschema, java.lang.String xmlresponseschema, java.lang.String xmlwsdl, NSConfig.OnoffEnum xmladditionalsoapheaders, NSConfig.AbsoluterelativeEnum xmlendpointcheck, NSConfig.OnoffEnum xmlvalidatesoapenvelope, NSConfig.OnoffEnum xmlvalidateresponse) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwprofile_xmlattachmenturl(java.lang.String name, java.lang.String xmlattachmenturl, NSConfig.OnoffEnum xmlmaxattachmentsizecheck, org.apache.axis.types.UnsignedInt xmlmaxattachmentsize, NSConfig.OnoffEnum xmlattachmentcontenttypecheck, java.lang.String xmlattachmentcontenttype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwprofile_xmlsqlinjection(java.lang.String name, java.lang.String xmlsqlinjection, NSConfig.RegexnotregexEnum isregex6, NSConfig.AppsecxmlscanlocationEnum location3) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwprofile_xmlxss(java.lang.String name, java.lang.String xmlxss, NSConfig.RegexnotregexEnum isregex7, NSConfig.AppsecxmlscanlocationEnum location4) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwprofile_contenttype(java.lang.String name, java.lang.String contenttype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwprofile_excluderescontenttype(java.lang.String name, java.lang.String excluderescontenttype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappfwprofile_starturl(java.lang.String name, java.lang.String starturl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappfwprofile_denyurl(java.lang.String name, java.lang.String denyurl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappfwprofile_fieldconsistency(java.lang.String name, java.lang.String fieldconsistency, java.lang.String formactionurl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappfwprofile_cookieconsistency(java.lang.String name, java.lang.String cookieconsistency) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappfwprofile_sqlinjection(java.lang.String name, java.lang.String sqlinjection, java.lang.String formactionurl2) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappfwprofile_sqlinjectionEx(java.lang.String name, java.lang.String sqlinjection, java.lang.String formactionurl2, NSConfig.AppsecscanlocationEnum location) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappfwprofile_csrftag(java.lang.String name, java.lang.String csrftag, java.lang.String csrfformactionurl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappfwprofile_crosssitescripting(java.lang.String name, java.lang.String crosssitescripting, java.lang.String formactionurl3) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappfwprofile_crosssitescriptingEx(java.lang.String name, java.lang.String crosssitescripting, java.lang.String formactionurl3, NSConfig.AppsecscanlocationEnum location2) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappfwprofile_fieldformat(java.lang.String name, java.lang.String fieldformat, java.lang.String formactionurl4) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappfwprofile_safeobject(java.lang.String name, java.lang.String safeobject) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappfwprofile_trustedlearningclients(java.lang.String name, java.lang.String trustedlearningclients) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappfwprofile_xmldosurl(java.lang.String name, java.lang.String xmldosurl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappfwprofile_xmlwsiurl(java.lang.String name, java.lang.String xmlwsiurl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappfwprofile_xmlvalidationurl(java.lang.String name, java.lang.String xmlvalidationurl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappfwprofile_xmlattachmenturl(java.lang.String name, java.lang.String xmlattachmenturl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappfwprofile_xmlsqlinjection(java.lang.String name, java.lang.String xmlsqlinjection, NSConfig.AppsecxmlscanlocationEnum location3) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappfwprofile_xmlxss(java.lang.String name, java.lang.String xmlxss, NSConfig.AppsecxmlscanlocationEnum location4) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappfwprofile_contenttype(java.lang.String name, java.lang.String contenttype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappfwprofile_excluderescontenttype(java.lang.String name, java.lang.String excluderescontenttype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetappfwprofileResult getappfwprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult archiveappfwprofile(java.lang.String name, java.lang.String archivename, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult restoreappfwprofile(java.lang.String archivename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addappfwpolicy(java.lang.String name, java.lang.String rule, java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmappfwpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwpolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwpolicy_profile(java.lang.String name, java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwpolicy_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwpolicy_logaction(java.lang.String name, java.lang.String logaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwpolicy_comment(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwpolicy_logaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetappfwpolicyResult getappfwpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renameappfwpolicy(java.lang.String name, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addappfwpolicylabel(java.lang.String labelname, NSConfig.AspolicylabeltypeEnum policylabeltype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmappfwpolicylabel(java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwpolicylabel_policy(java.lang.String labelname, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, java.lang.String gotopriorityexpression, boolean invoke, NSConfig.PolicylabelasinvoketypeEnum labeltype, java.lang.String labelname2) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappfwpolicylabel_policy(java.lang.String labelname, java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappfwpolicylabel_priority(java.lang.String labelname, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetappfwpolicylabelResult getappfwpolicylabel(java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renameappfwpolicylabel(java.lang.String labelname, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addappfwconfidfield(java.lang.String fieldname, java.lang.String url, NSConfig.RegexnotregexEnum isregex, java.lang.String comment, NSConfig.EnabledisabledEnum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmappfwconfidfield(java.lang.String fieldname, java.lang.String url) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwconfidfield_comment(java.lang.String fieldname, java.lang.String url, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwconfidfield_state(java.lang.String fieldname, java.lang.String url, NSConfig.EnabledisabledEnum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwconfidfield_comment(java.lang.String fieldname, java.lang.String url) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwconfidfield_state(java.lang.String fieldname, java.lang.String url) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetappfwconfidfieldResult getappfwconfidfield(java.lang.String fieldname, java.lang.String url) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.Use 'exportappfwsignatures' API.
     */
    public NSConfig.SimpleResult exportappfwcustomsettings(java.lang.String name, java.lang.String target) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.Use 'rmappfwsignatures' API.
     */
    public NSConfig.SimpleResult rmappfwcustomsettings(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.Use 'getappfwsignatures' API.
     */
    public NSConfig.GetappfwcustomsettingsResult getappfwcustomsettings(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.Use 'importappfwsignatures' API.
     */
    public NSConfig.SimpleResult importappfwcustomsettings(java.lang.String src, java.lang.String name) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.Use 'importappfwsignatures' API.
     */
    public NSConfig.SimpleResult importappfwcustomsettingsEx(java.lang.String src, java.lang.String name, java.lang.String comment, boolean overwrite, java.lang.String xslt) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.Use 'importappfwsignatures' API.
     */
    public NSConfig.SimpleResult importappfwcustomsettingsEx2(java.lang.String src, java.lang.String name, java.lang.String comment, boolean overwrite, java.lang.String xslt, boolean merge, java.lang.String sha1) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.Use 'updateappfwsignatures' API.
     */
    public NSConfig.SimpleResult updateappfwcustomsettings(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.Use 'updateappfwsignatures' API.
     */
    public NSConfig.SimpleResult updateappfwcustomsettingsEx(java.lang.String name, boolean mergedefault) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmappfwhtmlerrorpage(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetappfwhtmlerrorpageResult getappfwhtmlerrorpage(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult importappfwhtmlerrorpage(java.lang.String src, java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult importappfwhtmlerrorpageEx(java.lang.String src, java.lang.String name, java.lang.String comment, boolean overwrite) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult updateappfwhtmlerrorpage(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwsettings_defaultprofile(java.lang.String defaultprofile) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwsettings_undefaction(java.lang.String undefaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwsettings_sessiontimeout(org.apache.axis.types.UnsignedInt sessiontimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwsettings_learnratelimit(org.apache.axis.types.UnsignedInt learnratelimit) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwsettings_sessionlifetime(org.apache.axis.types.UnsignedInt sessionlifetime) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwsettings_sessioncookie(java.lang.String sessioncookiename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwsettings_clientiploggingheader(java.lang.String clientiploggingheader) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwsettings_importsizelimit(org.apache.axis.types.UnsignedInt importsizelimit) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwsettings_signatureautoupdate(NSConfig.OnoffEnum signatureautoupdate) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwsettings_signatureurl(java.lang.String signatureurl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwsettings_cookiepostencryptprefix(java.lang.String cookiepostencryptprefix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwsettings_logmalformedreq(NSConfig.OnoffEnum logmalformedreq) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwsettings_ceflogging(NSConfig.OnoffEnum ceflogging) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwsettings_entitydecoding(NSConfig.OnoffEnum entitydecoding) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwsettings_useconfigurablesecretkey(NSConfig.OnoffEnum useconfigurablesecretkey) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwsettings_defaultprofile() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwsettings_undefaction() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwsettings_sessiontimeout() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwsettings_learnratelimit() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwsettings_sessionlifetime() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwsettings_sessioncookiename() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwsettings_clientiploggingheader() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwsettings_importsizelimit() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwsettings_signatureautoupdate() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwsettings_signatureurl() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwsettings_cookiepostencryptprefix() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwsettings_logmalformedreq() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwsettings_ceflogging() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwsettings_entitydecoding() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwsettings_useconfigurablesecretkey() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetappfwsettingsResult getappfwsettings() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetappfwtransactionrecordsResult getappfwtransactionrecords() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwglobal_policy(java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, NSConfig.EnabledisabledEnum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindappfwglobal_policyEx(java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, NSConfig.EnabledisabledEnum state, java.lang.String gotopriorityexpression, NSConfig.AppfwglobalbindpointEnum type, boolean invoke, NSConfig.PolicylabelasinvoketypeEnum labeltype, java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappfwglobal_policy(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappfwglobal_policyEx(java.lang.String policyname, NSConfig.AppfwglobalbindpointEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindappfwglobal_priority(java.lang.String policyname, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetappfwglobalResult getappfwglobal() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetappfwglobalResult getappfwglobalEx(java.lang.String type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwlearningsettings_starturlminthreshold(java.lang.String profilename, org.apache.axis.types.UnsignedInt starturlminthreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwlearningsettings_starturlpercentthreshold(java.lang.String profilename, org.apache.axis.types.UnsignedInt starturlpercentthreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwlearningsettings_cookieconsistencyminthreshold(java.lang.String profilename, org.apache.axis.types.UnsignedInt cookieconsistencyminthreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwlearningsettings_cookieconsistencypercentthreshold(java.lang.String profilename, org.apache.axis.types.UnsignedInt cookieconsistencypercentthreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwlearningsettings_csrftagminthreshold(java.lang.String profilename, org.apache.axis.types.UnsignedInt csrftagminthreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwlearningsettings_csrftagpercentthreshold(java.lang.String profilename, org.apache.axis.types.UnsignedInt csrftagpercentthreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwlearningsettings_fieldconsistencyminthreshold(java.lang.String profilename, org.apache.axis.types.UnsignedInt fieldconsistencyminthreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwlearningsettings_fieldconsistencypercentthreshold(java.lang.String profilename, org.apache.axis.types.UnsignedInt fieldconsistencypercentthreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwlearningsettings_crosssitescriptingminthreshold(java.lang.String profilename, org.apache.axis.types.UnsignedInt crosssitescriptingminthreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwlearningsettings_crosssitescriptingpercentthreshold(java.lang.String profilename, org.apache.axis.types.UnsignedInt crosssitescriptingpercentthreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwlearningsettings_sqlinjectionminthreshold(java.lang.String profilename, org.apache.axis.types.UnsignedInt sqlinjectionminthreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwlearningsettings_sqlinjectionpercentthreshold(java.lang.String profilename, org.apache.axis.types.UnsignedInt sqlinjectionpercentthreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwlearningsettings_fieldformatminthreshold(java.lang.String profilename, org.apache.axis.types.UnsignedInt fieldformatminthreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwlearningsettings_fieldformatpercentthreshold(java.lang.String profilename, org.apache.axis.types.UnsignedInt fieldformatpercentthreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwlearningsettings_xmlwsiminthreshold(java.lang.String profilename, org.apache.axis.types.UnsignedInt xmlwsiminthreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwlearningsettings_xmlwsipercentthreshold(java.lang.String profilename, org.apache.axis.types.UnsignedInt xmlwsipercentthreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwlearningsettings_xmlattachmentminthreshold(java.lang.String profilename, org.apache.axis.types.UnsignedInt xmlattachmentminthreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappfwlearningsettings_xmlattachmentpercentthreshold(java.lang.String profilename, org.apache.axis.types.UnsignedInt xmlattachmentpercentthreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwlearningsettings_starturlminthreshold(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwlearningsettings_starturlpercentthreshold(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwlearningsettings_cookieconsistencyminthreshold(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwlearningsettings_cookieconsistencypercentthreshold(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwlearningsettings_csrftagminthreshold(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwlearningsettings_csrftagpercentthreshold(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwlearningsettings_fieldconsistencyminthreshold(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwlearningsettings_fieldconsistencypercentthreshold(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwlearningsettings_crosssitescriptingminthreshold(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwlearningsettings_crosssitescriptingpercentthreshold(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwlearningsettings_sqlinjectionminthreshold(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwlearningsettings_sqlinjectionpercentthreshold(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwlearningsettings_fieldformatminthreshold(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwlearningsettings_fieldformatpercentthreshold(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwlearningsettings_xmlwsiminthreshold(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwlearningsettings_xmlwsipercentthreshold(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwlearningsettings_xmlattachmentminthreshold(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappfwlearningsettings_xmlattachmentpercentthreshold(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetappfwlearningsettingsResult getappfwlearningsettings(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmappfwlearningdata(java.lang.String profilename, java.lang.String starturl, java.lang.String cookieconsistency, java.lang.String fieldconsistency, java.lang.String formactionurl, java.lang.String crosssitescripting, java.lang.String formactionurl2, java.lang.String sqlinjection, java.lang.String formactionurl3, java.lang.String fieldformat, java.lang.String formactionurl4, java.lang.String csrftag, java.lang.String csrfformoriginurl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmappfwlearningdataEx(java.lang.String profilename, java.lang.String starturl, java.lang.String cookieconsistency, java.lang.String fieldconsistency, java.lang.String formactionurl, java.lang.String crosssitescripting, java.lang.String formactionurl2, java.lang.String sqlinjection, java.lang.String formactionurl3, java.lang.String fieldformat, java.lang.String formactionurl4, java.lang.String csrftag, java.lang.String csrfformoriginurl, java.lang.String xmldoscheck, java.lang.String xmlwsicheck, java.lang.String xmlattachmentcheck, boolean totalxmlrequests) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetappfwlearningdataResult getappfwlearningdata(java.lang.String profilename, java.lang.String securitycheck) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult resetappfwlearningdata() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult exportappfwlearningdata(java.lang.String profilename, NSConfig.AppseclearningchecktypeEnum securitycheck, java.lang.String target) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addappfwjsoncontenttype(java.lang.String jsoncontenttypevalue, NSConfig.RegexnotregexEnum isregex) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmappfwjsoncontenttype(java.lang.String jsoncontenttypevalue) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetappfwjsoncontenttypeResult getappfwjsoncontenttype(java.lang.String jsoncontenttypevalue) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmappfwsignatures(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetappfwsignaturesResult getappfwsignatures(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult importappfwsignatures(java.lang.String src, java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult importappfwsignaturesEx(java.lang.String src, java.lang.String name, java.lang.String xslt, java.lang.String comment, boolean overwrite) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult importappfwsignaturesEx2(java.lang.String src, java.lang.String name, java.lang.String xslt, java.lang.String comment, boolean overwrite, boolean merge, java.lang.String sha1) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult updateappfwsignatures(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult updateappfwsignaturesEx(java.lang.String name, boolean mergedefault) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetappfwarchiveResult getappfwarchive() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult exportappfwarchive(java.lang.String name, java.lang.String target) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult importappfwarchive(java.lang.String src, java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult importappfwarchiveEx(java.lang.String src, java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmappfwarchive(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addappqoeaction(java.lang.String name, NSConfig.AppqoepriorityEnum priority, NSConfig.QossubactionEnum respondwith, java.lang.String customfile, java.lang.String altcontentsvcname, java.lang.String altcontentpath, org.apache.axis.types.UnsignedInt polqdepth, org.apache.axis.types.UnsignedInt priqdepth, org.apache.axis.types.UnsignedInt maxconn, org.apache.axis.types.UnsignedInt delay, java.lang.String dostrigexpression, NSConfig.AppqoedostriggertypeEnum dosaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmappqoeaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappqoeaction_priority(java.lang.String name, NSConfig.AppqoepriorityEnum priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappqoeaction_altcontentsvc(java.lang.String name, java.lang.String altcontentsvcname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappqoeaction_altcontentpath(java.lang.String name, java.lang.String altcontentpath) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappqoeaction_polqdepth(java.lang.String name, org.apache.axis.types.UnsignedInt polqdepth) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappqoeaction_priqdepth(java.lang.String name, org.apache.axis.types.UnsignedInt priqdepth) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappqoeaction_maxconn(java.lang.String name, org.apache.axis.types.UnsignedInt maxconn) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappqoeaction_delay(java.lang.String name, org.apache.axis.types.UnsignedInt delay) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappqoeaction_dostrigexpression(java.lang.String name, java.lang.String dostrigexpression) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappqoeaction_dosaction(java.lang.String name, NSConfig.AppqoedostriggertypeEnum dosaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappqoeaction_priority(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappqoeaction_altcontentsvcname(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappqoeaction_altcontentpath(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappqoeaction_polqdepth(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappqoeaction_priqdepth(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappqoeaction_maxconn(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappqoeaction_delay(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappqoeaction_dosaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetappqoeactionResult getappqoeaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addappqoepolicy(java.lang.String name, java.lang.String rule, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmappqoepolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappqoepolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappqoepolicy_action(java.lang.String name, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetappqoepolicyResult getappqoepolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappqoeparameter_sessionlife(org.apache.axis.types.UnsignedInt sessionlife) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappqoeparameter_avgwaitingclient(org.apache.axis.types.UnsignedInt avgwaitingclient) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappqoeparameter_maxaltrespbandwidth(org.apache.axis.types.UnsignedInt maxaltrespbandwidth) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setappqoeparameter_dosattackthresh(org.apache.axis.types.UnsignedInt dosattackthresh) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappqoeparameter_sessionlife() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappqoeparameter_avgwaitingclient() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappqoeparameter_maxaltrespbandwidth() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetappqoeparameter_dosattackthresh() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetappqoeparameterResult getappqoeparameter() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult importappqoecustomresp(java.lang.String src, java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmappqoecustomresp(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetappqoecustomrespResult getappqoecustomresp() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult updateappqoecustomresp(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addauditsyslogaction(java.lang.String name, java.lang.String serverip, NSConfig.AuditloglevelEnum loglevel) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmauditsyslogaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditsyslogaction_serverip(java.lang.String name, java.lang.String serverip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditsyslogaction_serverport(java.lang.String name, org.apache.axis.types.UnsignedInt serverport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditsyslogaction_loglevel(java.lang.String name, NSConfig.AuditloglevelEnum loglevel) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditsyslogaction_dateformat(java.lang.String name, NSConfig.DateformatEnum dateformat) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditsyslogaction_logfacility(java.lang.String name, NSConfig.SyslogfacilityEnum logfacility) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditsyslogaction_tcp(java.lang.String name, NSConfig.AuditlogstatusEnum tcp) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditsyslogaction_acl(java.lang.String name, NSConfig.AclauditlogstatusEnum acl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditsyslogaction_timezone(java.lang.String name, NSConfig.AuditlogtimezoneEnum timezone) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditsyslogaction_userdefinedauditlog(java.lang.String name, NSConfig.YesnoEnum userdefinedauditlog) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditsyslogaction_appflowexport(java.lang.String name, NSConfig.EnabledisabledEnum appflowexport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditsyslogaction_serverport(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditsyslogaction_loglevel(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditsyslogaction_dateformat(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditsyslogaction_logfacility(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditsyslogaction_tcp(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditsyslogaction_acl(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditsyslogaction_timezone(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditsyslogaction_userdefinedauditlog(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditsyslogaction_appflowexport(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditsyslogaction_serverip(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetauditsyslogactionResult getauditsyslogaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addauditsyslogpolicy(java.lang.String name, java.lang.String rule, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmauditsyslogpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditsyslogpolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditsyslogpolicy_action(java.lang.String name, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetauditsyslogpolicyResult getauditsyslogpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addauditnslogaction(java.lang.String name, java.lang.String serverip, NSConfig.AuditloglevelEnum loglevel) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmauditnslogaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditnslogaction_serverip(java.lang.String name, java.lang.String serverip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditnslogaction_serverport(java.lang.String name, org.apache.axis.types.UnsignedInt serverport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditnslogaction_loglevel(java.lang.String name, NSConfig.AuditloglevelEnum loglevel) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditnslogaction_dateformat(java.lang.String name, NSConfig.DateformatEnum dateformat) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditnslogaction_logfacility(java.lang.String name, NSConfig.SyslogfacilityEnum logfacility) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditnslogaction_tcp(java.lang.String name, NSConfig.AuditlogstatusEnum tcp) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditnslogaction_acl(java.lang.String name, NSConfig.AclauditlogstatusEnum acl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditnslogaction_timezone(java.lang.String name, NSConfig.AuditlogtimezoneEnum timezone) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditnslogaction_userdefinedauditlog(java.lang.String name, NSConfig.YesnoEnum userdefinedauditlog) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditnslogaction_appflowexport(java.lang.String name, NSConfig.EnabledisabledEnum appflowexport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditnslogaction_serverport(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditnslogaction_loglevel(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditnslogaction_dateformat(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditnslogaction_logfacility(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditnslogaction_tcp(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditnslogaction_acl(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditnslogaction_timezone(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditnslogaction_userdefinedauditlog(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditnslogaction_appflowexport(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetauditnslogactionResult getauditnslogaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addauditnslogpolicy(java.lang.String name, java.lang.String rule, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmauditnslogpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditnslogpolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditnslogpolicy_action(java.lang.String name, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetauditnslogpolicyResult getauditnslogpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addauditmessageaction(java.lang.String name, NSConfig.Auditloglevel1Enum loglevel, java.lang.String stringbuilderexpr, NSConfig.YesnoEnum logtonewnslog, NSConfig.YesnoEnum bypasssafetycheck) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmauditmessageaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditmessageaction_loglevel(java.lang.String name, NSConfig.Auditloglevel1Enum loglevel) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditmessageaction_stringbuilderexpr(java.lang.String name, java.lang.String stringbuilderexpr) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditmessageaction_logtonewnslog(java.lang.String name, NSConfig.YesnoEnum logtonewnslog) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditmessageaction_bypasssafetycheck(java.lang.String name, NSConfig.YesnoEnum bypasssafetycheck) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditmessageaction_logtonewnslog(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditmessageaction_bypasssafetycheck(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetauditmessageactionResult getauditmessageaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetauditmessagesResult getauditmessages(java.lang.String loglevel, org.apache.axis.types.UnsignedInt numofmesgs) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditsyslogparams_serverip(java.lang.String serverip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditsyslogparams_serverport(org.apache.axis.types.UnsignedInt serverport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditsyslogparams_dateformat(NSConfig.DateformatEnum dateformat) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditsyslogparams_loglevel(NSConfig.AuditloglevelEnum loglevel) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditsyslogparams_logfacility(NSConfig.SyslogfacilityEnum logfacility) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditsyslogparams_tcp(NSConfig.AuditlogstatusEnum tcp) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditsyslogparams_acl(NSConfig.AclauditlogstatusEnum acl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditsyslogparams_timezone(NSConfig.AuditlogtimezoneEnum timezone) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditsyslogparams_userdefinedauditlog(NSConfig.YesnoEnum userdefinedauditlog) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditsyslogparams_appflowexport(NSConfig.EnabledisabledEnum appflowexport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditsyslogparams_serverip() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditsyslogparams_serverport() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditsyslogparams_loglevel() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditsyslogparams_dateformat() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditsyslogparams_logfacility() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditsyslogparams_tcp() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditsyslogparams_acl() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditsyslogparams_timezone() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditsyslogparams_userdefinedauditlog() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditsyslogparams_appflowexport() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetauditsyslogparamsResult getauditsyslogparams() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditnslogparams_serverip(java.lang.String serverip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditnslogparams_serverport(org.apache.axis.types.UnsignedInt serverport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditnslogparams_dateformat(NSConfig.DateformatEnum dateformat) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditnslogparams_loglevel(NSConfig.AuditloglevelEnum loglevel) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditnslogparams_logfacility(NSConfig.SyslogfacilityEnum logfacility) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditnslogparams_tcp(NSConfig.AuditlogstatusEnum tcp) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditnslogparams_acl(NSConfig.AclauditlogstatusEnum acl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditnslogparams_timezone(NSConfig.AuditlogtimezoneEnum timezone) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditnslogparams_userdefinedauditlog(NSConfig.YesnoEnum userdefinedauditlog) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauditnslogparams_appflowexport(NSConfig.EnabledisabledEnum appflowexport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditnslogparams_serverip() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditnslogparams_serverport() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditnslogparams_loglevel() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditnslogparams_dateformat() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditnslogparams_logfacility() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditnslogparams_tcp() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditnslogparams_acl() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditnslogparams_timezone() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditnslogparams_userdefinedauditlog() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauditnslogparams_appflowexport() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetauditnslogparamsResult getauditnslogparams() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addauthenticationradiusaction(java.lang.String name, java.lang.String serverip, org.apache.axis.types.UnsignedInt serverport, org.apache.axis.types.UnsignedInt authtimeout, java.lang.String radkey, NSConfig.EnabledisabledEnum radnasip, java.lang.String radnasid, org.apache.axis.types.UnsignedInt radvendorid, org.apache.axis.types.UnsignedInt radattributetype, NSConfig.RadpassencodingEnum passencoding, org.apache.axis.types.UnsignedInt ipvendorid, org.apache.axis.types.UnsignedInt ipattributetype, NSConfig.OnoffEnum accounting) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmauthenticationradiusaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationradiusaction_serverip(java.lang.String name, java.lang.String serverip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationradiusaction_serverport(java.lang.String name, org.apache.axis.types.UnsignedInt serverport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationradiusaction_authtimeout(java.lang.String name, org.apache.axis.types.UnsignedInt authtimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationradiusaction_radkey(java.lang.String name, java.lang.String radkey) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationradiusaction_radnasip(java.lang.String name, NSConfig.EnabledisabledEnum radnasip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationradiusaction_radnasid(java.lang.String name, java.lang.String radnasid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationradiusaction_radvendorid(java.lang.String name, org.apache.axis.types.UnsignedInt radvendorid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationradiusaction_radattributetype(java.lang.String name, org.apache.axis.types.UnsignedInt radattributetype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationradiusaction_radgroupsprefix(java.lang.String name, java.lang.String radgroupsprefix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationradiusaction_radgroupseparator(java.lang.String name, java.lang.String radgroupseparator) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationradiusaction_passencoding(java.lang.String name, NSConfig.RadpassencodingEnum passencoding) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationradiusaction_ipvendorid(java.lang.String name, org.apache.axis.types.UnsignedInt ipvendorid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationradiusaction_ipattributetype(java.lang.String name, org.apache.axis.types.UnsignedInt ipattributetype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationradiusaction_accounting(java.lang.String name, NSConfig.OnoffEnum accounting) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationradiusaction_pwdvendorid(java.lang.String name, org.apache.axis.types.UnsignedInt pwdvendorid, org.apache.axis.types.UnsignedInt pwdattributetype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationradiusaction_defaultauthenticationgroup(java.lang.String name, java.lang.String defaultauthenticationgroup) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationradiusaction_callingstationid(java.lang.String name, NSConfig.EnabledisabledEnum callingstationid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationradiusaction_serverip(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationradiusaction_serverport(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationradiusaction_authtimeout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationradiusaction_radnasip(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationradiusaction_radnasid(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationradiusaction_radvendorid(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationradiusaction_radattributetype(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationradiusaction_radgroupsprefix(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationradiusaction_radgroupseparator(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationradiusaction_passencoding(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationradiusaction_ipvendorid(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationradiusaction_ipattributetype(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationradiusaction_accounting(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationradiusaction_pwdvendorid(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationradiusaction_pwdattributetype(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationradiusaction_defaultauthenticationgroup(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationradiusaction_callingstationid(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetauthenticationradiusactionResult getauthenticationradiusaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addauthenticationldapaction(java.lang.String name, java.lang.String serverip, org.apache.axis.types.UnsignedInt serverport, org.apache.axis.types.UnsignedInt authtimeout, java.lang.String ldapbase, java.lang.String ldapbinddn, java.lang.String ldapbinddnpassword, java.lang.String ldaploginname, java.lang.String searchfilter, java.lang.String groupattrname, java.lang.String subattributename, NSConfig.SectypeEnum sectype, NSConfig.SvrtypeEnum svrtype, NSConfig.EnabledisabledEnum authentication, NSConfig.YesnoEnum requireuser) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmauthenticationldapaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationldapaction_serverip(java.lang.String name, java.lang.String serverip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationldapaction_serverport(java.lang.String name, org.apache.axis.types.UnsignedInt serverport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationldapaction_authtimeout(java.lang.String name, org.apache.axis.types.UnsignedInt authtimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationldapaction_ldapbase(java.lang.String name, java.lang.String ldapbase) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationldapaction_ldapbinddn(java.lang.String name, java.lang.String ldapbinddn) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationldapaction_ldapbinddnpassword(java.lang.String name, java.lang.String ldapbinddnpassword) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationldapaction_ldaploginname(java.lang.String name, java.lang.String ldaploginname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationldapaction_searchfilter(java.lang.String name, java.lang.String searchfilter) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationldapaction_groupattrname(java.lang.String name, java.lang.String groupattrname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationldapaction_subattributename(java.lang.String name, java.lang.String subattributename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationldapaction_sectype(java.lang.String name, NSConfig.SectypeEnum sectype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationldapaction_svrtype(java.lang.String name, NSConfig.SvrtypeEnum svrtype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationldapaction_ssonameattribute(java.lang.String name, java.lang.String ssonameattribute) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationldapaction_authentication(java.lang.String name, NSConfig.EnabledisabledEnum authentication) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationldapaction_requireuser(java.lang.String name, NSConfig.YesnoEnum requireuser) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationldapaction_passwdchange(java.lang.String name, NSConfig.EnabledisabledEnum passwdchange) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationldapaction_validateservercert(java.lang.String name, NSConfig.YesnoEnum validateservercert) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationldapaction_ldaphostname(java.lang.String name, java.lang.String ldaphostname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationldapaction_nestedgroupextraction(java.lang.String name, NSConfig.OnoffEnum nestedgroupextraction, org.apache.axis.types.UnsignedInt maxnestinglevel, java.lang.String groupnameidentifier, java.lang.String groupsearchattribute, java.lang.String groupsearchsubattribute, java.lang.String groupsearchfilter) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationldapaction_followreferrals(java.lang.String name, NSConfig.OnoffEnum followreferrals, org.apache.axis.types.UnsignedInt maxldapreferrals) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationldapaction_defaultauthenticationgroup(java.lang.String name, java.lang.String defaultauthenticationgroup) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_serverip(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_serverport(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_authtimeout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_ldapbase(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_ldapbinddn(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_ldapbinddnpassword(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_ldaploginname(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_searchfilter(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_groupattrname(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_subattributename(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_sectype(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_svrtype(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_ssonameattribute(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_authentication(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_requireuser(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_passwdchange(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_validateservercert(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_ldaphostname(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_nestedgroupextraction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_maxnestinglevel(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_groupnameidentifier(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_groupsearchattribute(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_groupsearchsubattribute(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_groupsearchfilter(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_followreferrals(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_maxldapreferrals(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldapaction_defaultauthenticationgroup(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetauthenticationldapactionResult getauthenticationldapaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addauthenticationtacacsaction(java.lang.String name, java.lang.String serverip, org.apache.axis.types.UnsignedInt serverport, org.apache.axis.types.UnsignedInt authtimeout, java.lang.String tacacssecret, NSConfig.OnoffEnum authorization, NSConfig.OnoffEnum accounting, NSConfig.OnoffEnum auditfailedcmds) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmauthenticationtacacsaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationtacacsaction_serverip(java.lang.String name, java.lang.String serverip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationtacacsaction_serverport(java.lang.String name, org.apache.axis.types.UnsignedInt serverport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationtacacsaction_authtimeout(java.lang.String name, org.apache.axis.types.UnsignedInt authtimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationtacacsaction_tacacssecret(java.lang.String name, java.lang.String tacacssecret) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationtacacsaction_authorization(java.lang.String name, NSConfig.OnoffEnum authorization) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationtacacsaction_accounting(java.lang.String name, NSConfig.OnoffEnum accounting) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationtacacsaction_auditfailedcmds(java.lang.String name, NSConfig.OnoffEnum auditfailedcmds) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationtacacsaction_defaultauthenticationgroup(java.lang.String name, java.lang.String defaultauthenticationgroup) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationtacacsaction_serverip(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationtacacsaction_serverport(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationtacacsaction_authtimeout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationtacacsaction_tacacssecret(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationtacacsaction_authorization(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationtacacsaction_accounting(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationtacacsaction_auditfailedcmds(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationtacacsaction_defaultauthenticationgroup(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetauthenticationtacacsactionResult getauthenticationtacacsaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addauthenticationnegotiateaction(java.lang.String name, java.lang.String domain, java.lang.String domainuser, java.lang.String domainuserpasswd, java.lang.String ou) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmauthenticationnegotiateaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationnegotiateaction_domain(java.lang.String name, java.lang.String domain) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationnegotiateaction_domainuser(java.lang.String name, java.lang.String domainuser) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationnegotiateaction_domainuserpasswd(java.lang.String name, java.lang.String domainuserpasswd) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationnegotiateaction_ou(java.lang.String name, java.lang.String ou) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationnegotiateaction_defaultauthenticationgroup(java.lang.String name, java.lang.String defaultauthenticationgroup) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationnegotiateaction_keytab(java.lang.String name, java.lang.String keytab) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationnegotiateaction_domain(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationnegotiateaction_domainuser(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationnegotiateaction_domainuserpasswd(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationnegotiateaction_ou(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationnegotiateaction_defaultauthenticationgroup(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetauthenticationnegotiateactionResult getauthenticationnegotiateaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addauthenticationsamlaction(java.lang.String name, java.lang.String samlidpcertname, java.lang.String samlredirecturl, NSConfig.OnoffEnum samlrejectunsignedassertion) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmauthenticationsamlaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationsamlaction_samlidpcertname(java.lang.String name, java.lang.String samlidpcertname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationsamlaction_samlsigningcertname(java.lang.String name, java.lang.String samlsigningcertname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationsamlaction_samlredirecturl(java.lang.String name, java.lang.String samlredirecturl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationsamlaction_samluserfield(java.lang.String name, java.lang.String samluserfield) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationsamlaction_samlrejectunsignedassertion(java.lang.String name, NSConfig.OnoffEnum samlrejectunsignedassertion) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationsamlaction_samlissuername(java.lang.String name, java.lang.String samlissuername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationsamlaction_samltwofactor(java.lang.String name, NSConfig.Onoff2Enum samltwofactor) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationsamlaction_defaultauthenticationgroup(java.lang.String name, java.lang.String defaultauthenticationgroup) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationsamlaction_samlidpcertname(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationsamlaction_samlsigningcertname(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationsamlaction_samlredirecturl(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationsamlaction_samluserfield(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationsamlaction_samlrejectunsignedassertion(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationsamlaction_samlissuername(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationsamlaction_samltwofactor(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationsamlaction_defaultauthenticationgroup(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetauthenticationsamlactionResult getauthenticationsamlaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addauthenticationcertaction(java.lang.String name, NSConfig.OnoffEnum twofactor, java.lang.String usernamefield, java.lang.String groupnamefield) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmauthenticationcertaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationcertaction_twofactor(java.lang.String name, NSConfig.OnoffEnum twofactor) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationcertaction_usernamefield(java.lang.String name, java.lang.String usernamefield) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationcertaction_groupnamefield(java.lang.String name, java.lang.String groupnamefield) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationcertaction_defaultauthenticationgroup(java.lang.String name, java.lang.String defaultauthenticationgroup) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationcertaction_twofactor(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationcertaction_usernamefield(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationcertaction_groupnamefield(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationcertaction_defaultauthenticationgroup(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetauthenticationcertactionResult getauthenticationcertaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addauthenticationlocalpolicy(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmauthenticationlocalpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationlocalpolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationlocalpolicy_rule(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetauthenticationlocalpolicyResult getauthenticationlocalpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addauthenticationradiuspolicy(java.lang.String name, java.lang.String rule, java.lang.String reqaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmauthenticationradiuspolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationradiuspolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationradiuspolicy_reqaction(java.lang.String name, java.lang.String reqaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationradiuspolicy_rule(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationradiuspolicy_reqaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetauthenticationradiuspolicyResult getauthenticationradiuspolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addauthenticationcertpolicy(java.lang.String name, java.lang.String rule, java.lang.String reqaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmauthenticationcertpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationcertpolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationcertpolicy_reqaction(java.lang.String name, java.lang.String reqaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationcertpolicy_rule(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationcertpolicy_reqaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetauthenticationcertpolicyResult getauthenticationcertpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addauthenticationldappolicy(java.lang.String name, java.lang.String rule, java.lang.String reqaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmauthenticationldappolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationldappolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationldappolicy_reqaction(java.lang.String name, java.lang.String reqaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldappolicy_rule(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationldappolicy_reqaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetauthenticationldappolicyResult getauthenticationldappolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addauthenticationtacacspolicy(java.lang.String name, java.lang.String rule, java.lang.String reqaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmauthenticationtacacspolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationtacacspolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationtacacspolicy_reqaction(java.lang.String name, java.lang.String reqaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationtacacspolicy_rule(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationtacacspolicy_reqaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetauthenticationtacacspolicyResult getauthenticationtacacspolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addauthenticationnegotiatepolicy(java.lang.String name, java.lang.String rule, java.lang.String reqaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmauthenticationnegotiatepolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationnegotiatepolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationnegotiatepolicy_reqaction(java.lang.String name, java.lang.String reqaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationnegotiatepolicy_rule(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationnegotiatepolicy_reqaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetauthenticationnegotiatepolicyResult getauthenticationnegotiatepolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addauthenticationsamlpolicy(java.lang.String name, java.lang.String rule, java.lang.String reqaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmauthenticationsamlpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationsamlpolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationsamlpolicy_reqaction(java.lang.String name, java.lang.String reqaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationsamlpolicy_rule(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationsamlpolicy_reqaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetauthenticationsamlpolicyResult getauthenticationsamlpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addauthenticationvserver(java.lang.String name, NSConfig.SslvpnvservicetypeEnum servicetype, java.lang.String ipaddress, org.apache.axis.types.UnsignedInt range, org.apache.axis.types.UnsignedInt port, NSConfig.EnabledisabledEnum state, java.lang.String authenticationdomain) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmauthenticationvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationvserver_ipaddress(java.lang.String name, java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationvserver_authentication(java.lang.String name, NSConfig.OnoffEnum authentication) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationvserver_authenticationdomain(java.lang.String name, java.lang.String authenticationdomain) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationvserver_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationvserver_appflowlog(java.lang.String name, NSConfig.EnabledisabledEnum appflowlog) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationvserver_maxloginattempts(java.lang.String name, org.apache.axis.types.UnsignedInt maxloginattempts) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationvserver_failedlogintimeout(java.lang.String name, org.apache.axis.types.UnsignedInt failedlogintimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationvserver_authenticationdomain(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationvserver_maxloginattempts(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationvserver_authentication(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationvserver_comment(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationvserver_appflowlog(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindauthenticationvserver_policy(java.lang.String name, java.lang.String policy, org.apache.axis.types.UnsignedInt priority, boolean secondary) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindauthenticationvserver_policyEx(java.lang.String name, java.lang.String policy, org.apache.axis.types.UnsignedInt priority, boolean secondary, boolean groupextraction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindauthenticationvserver_policy(java.lang.String name, java.lang.String policy, boolean secondary) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindauthenticationvserver_policyEx(java.lang.String name, java.lang.String policy, boolean secondary, boolean groupextraction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult enableauthenticationvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disableauthenticationvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetauthenticationvserverResult getauthenticationvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renameauthenticationvserver(java.lang.String name, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addauthenticationauthnprofile(java.lang.String name, java.lang.String authnvsname, java.lang.String authenticationhost, java.lang.String authenticationdomain, org.apache.axis.types.UnsignedInt authenticationlevel) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmauthenticationauthnprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationauthnprofile_authnvsname(java.lang.String name, java.lang.String authnvsname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationauthnprofile_authenticationhost(java.lang.String name, java.lang.String authenticationhost) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationauthnprofile_authenticationdomain(java.lang.String name, java.lang.String authenticationdomain) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthenticationauthnprofile_authenticationlevel(java.lang.String name, org.apache.axis.types.UnsignedInt authenticationlevel) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationauthnprofile_authenticationdomain(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetauthenticationauthnprofile_authenticationlevel(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetauthenticationauthnprofileResult getauthenticationauthnprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addauthorizationpolicy(java.lang.String name, java.lang.String rule, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmauthorizationpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthorizationpolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setauthorizationpolicy_action(java.lang.String name, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renameauthorizationpolicy(java.lang.String name, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetauthorizationpolicyResult getauthorizationpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addauthorizationpolicylabel(java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmauthorizationpolicylabel(java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindauthorizationpolicylabel_policy(java.lang.String labelname, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, java.lang.String gotopriorityexpression, boolean invoke, NSConfig.PolicylabelinvoketypeEnum labeltype, java.lang.String labelname2) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindauthorizationpolicylabel_policy(java.lang.String labelname, java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindauthorizationpolicylabel_priority(java.lang.String labelname, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renameauthorizationpolicylabel(java.lang.String labelname, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetauthorizationpolicylabelResult getauthorizationpolicylabel(java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetauthorizationactionResult getauthorizationaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addautoscaleprofile(java.lang.String name, NSConfig.Autoscale_profile_typeEnum type, java.lang.String url, java.lang.String apikey, java.lang.String sharedsecret) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmautoscaleprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setautoscaleprofile_url(java.lang.String name, java.lang.String url) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setautoscaleprofile_apikey(java.lang.String name, java.lang.String apikey) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setautoscaleprofile_sharedsecret(java.lang.String name, java.lang.String sharedsecret) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetautoscaleprofileResult getautoscaleprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addautoscaleaction(java.lang.String name, java.lang.String profilename, java.lang.String parameters, org.apache.axis.types.UnsignedInt vmdestroygraceperiod, org.apache.axis.types.UnsignedInt quiettime, java.lang.String vserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmautoscaleaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setautoscaleaction_profile(java.lang.String name, java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setautoscaleaction_parameters(java.lang.String name, java.lang.String parameters) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setautoscaleaction_vmdestroygraceperiod(java.lang.String name, org.apache.axis.types.UnsignedInt vmdestroygraceperiod) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setautoscaleaction_quiettime(java.lang.String name, org.apache.axis.types.UnsignedInt quiettime) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setautoscaleaction_vserver(java.lang.String name, java.lang.String vserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetautoscaleaction_vmdestroygraceperiod(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetautoscaleaction_quiettime(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetautoscaleactionResult getautoscaleaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addautoscalepolicy(java.lang.String name, java.lang.String rule, java.lang.String actioN, java.lang.String comment, java.lang.String logaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmautoscalepolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setautoscalepolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setautoscalepolicy_action(java.lang.String name, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setautoscalepolicy_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setautoscalepolicy_logaction(java.lang.String name, java.lang.String logaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetautoscalepolicy_rule(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetautoscalepolicy_action(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetautoscalepolicy_comment(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetautoscalepolicy_logaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetautoscalepolicyResult getautoscalepolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renameautoscalepolicy(java.lang.String name, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addcachepolicy(java.lang.String policyname, java.lang.String rule, NSConfig.CachedirectiveEnum actioN, java.lang.String storeingroup, java.lang.String invalgroups, java.lang.String invalobjects) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmcachepolicy(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachepolicy_rule(java.lang.String policyname, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachepolicy_action(java.lang.String policyname, NSConfig.CachedirectiveEnum actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachepolicy_storeingroup(java.lang.String policyname, java.lang.String storeingroup) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachepolicy_invalgroups(java.lang.String policyname, java.lang.String invalgroups) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachepolicy_invalobjects(java.lang.String policyname, java.lang.String invalobjects) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachepolicy_undefaction(java.lang.String policyname, NSConfig.CacheundefdirectiveEnum undefaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachepolicy_storeingroup(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachepolicy_invalgroups(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachepolicy_invalobjects(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachepolicy_undefaction(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetcachepolicyResult getcachepolicy(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renamecachepolicy(java.lang.String policyname, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addcachepolicylabel(java.lang.String labelname, NSConfig.CachepolicylabeltypeEnum evaluates) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmcachepolicylabel(java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindcachepolicylabel_policy(java.lang.String labelname, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, java.lang.String gotopriorityexpression, boolean invoke, NSConfig.CachepolicylabelinvoketypeEnum labeltype, java.lang.String labelname2) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindcachepolicylabel_policy(java.lang.String labelname, java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindcachepolicylabel_priority(java.lang.String labelname, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetcachepolicylabelResult getcachepolicylabel(java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renamecachepolicylabel(java.lang.String labelname, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addcachecontentgroup(java.lang.String name, org.apache.axis.types.UnsignedInt prefetchmaxpending, NSConfig.YesnoEnum alwaysevalpolicies, NSConfig.YesnoEnum pinned, java.lang.String hitselector, java.lang.String invalselector) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addcachecontentgroupEx(java.lang.String name, org.apache.axis.types.UnsignedInt prefetchmaxpending, NSConfig.YesnoEnum alwaysevalpolicies, NSConfig.YesnoEnum pinned, java.lang.String hitselector, java.lang.String invalselector, NSConfig.ContentgrouptypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmcachecontentgroup(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_weakposrelexpiry(java.lang.String name, org.apache.axis.types.UnsignedInt weakposrelexpiry) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_heurexpiryparam(java.lang.String name, org.apache.axis.types.UnsignedInt heurexpiryparam) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_relexpiry(java.lang.String name, org.apache.axis.types.UnsignedInt relexpiry) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_relexpirymillisec(java.lang.String name, org.apache.axis.types.UnsignedInt relexpirymillisec) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_absexpiry(java.lang.String name, java.lang.String absexpiry) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_absexpirygmt(java.lang.String name, java.lang.String absexpirygmt) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_weaknegrelexpiry(java.lang.String name, org.apache.axis.types.UnsignedInt weaknegrelexpiry) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_hitparams(java.lang.String name, java.lang.String hitparams) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_invalparams(java.lang.String name, java.lang.String invalparams) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_ignoreparamvaluecase(java.lang.String name, NSConfig.YesnoEnum ignoreparamvaluecase) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_matchcookies(java.lang.String name, NSConfig.YesnoEnum matchcookies) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_invalrestrictedtohost(java.lang.String name, NSConfig.YesnoEnum invalrestrictedtohost) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_polleverytime(java.lang.String name, NSConfig.YesnoEnum polleverytime) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_ignorereloadreq(java.lang.String name, NSConfig.YesnoEnum ignorereloadreq) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_removecookies(java.lang.String name, NSConfig.YesnoEnum removecookies) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_prefetch(java.lang.String name, NSConfig.YesnoEnum prefetch) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_prefetchperiod(java.lang.String name, org.apache.axis.types.UnsignedInt prefetchperiod) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_prefetchperiodmillisec(java.lang.String name, org.apache.axis.types.UnsignedInt prefetchperiodmillisec) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_prefetchmaxpending(java.lang.String name, org.apache.axis.types.UnsignedInt prefetchmaxpending) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_flashcache(java.lang.String name, NSConfig.YesnoEnum flashcache) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_expireatlastbyte(java.lang.String name, NSConfig.YesnoEnum expireatlastbyte) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_insertvia(java.lang.String name, NSConfig.YesnoEnum insertvia) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_insertage(java.lang.String name, NSConfig.YesnoEnum insertage) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_insertetag(java.lang.String name, NSConfig.YesnoEnum insertetag) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_cachecontrol(java.lang.String name, java.lang.String cachecontrol) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_quickabortsize(java.lang.String name, org.apache.axis.types.UnsignedInt quickabortsize) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_minressize(java.lang.String name, org.apache.axis.types.UnsignedInt minressize) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_maxressize(java.lang.String name, org.apache.axis.types.UnsignedInt maxressize) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_memlimit(java.lang.String name, org.apache.axis.types.UnsignedInt memlimit) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_ignorereqcachinghdrs(java.lang.String name, NSConfig.YesnoEnum ignorereqcachinghdrs) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_minhits(java.lang.String name, int minhits) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_alwaysevalpolicies(java.lang.String name, NSConfig.YesnoEnum alwaysevalpolicies) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_persist(java.lang.String name, NSConfig.YesnoEnum persist) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_pinned(java.lang.String name, NSConfig.YesnoEnum pinned) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_lazydnsresolve(java.lang.String name, NSConfig.YesnoEnum lazydnsresolve) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_hitselector(java.lang.String name, java.lang.String hitselector) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcachecontentgroup_invalselector(java.lang.String name, java.lang.String invalselector) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_weakposrelexpiry(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_heurexpiryparam(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_relexpiry(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_relexpirymillisec(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_absexpiry(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_absexpirygmt(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_weaknegrelexpiry(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_hitparams(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_invalparams(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_ignoreparamvaluecase(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_matchcookies(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_invalrestrictedtohost(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_polleverytime(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_ignorereloadreq(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_removecookies(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_prefetch(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_prefetchperiod(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_prefetchperiodmillisec(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_prefetchmaxpending(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_flashcache(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_expireatlastbyte(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_insertvia(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_insertage(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_insertetag(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_cachecontrol(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_quickabortsize(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_minressize(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_maxressize(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_memlimit(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_ignorereqcachinghdrs(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_minhits(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_alwaysevalpolicies(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_persist(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_pinned(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_lazydnsresolve(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_hitselector(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcachecontentgroup_invalselector(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetcachecontentgroupResult getcachecontentgroup(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult expirecachecontentgroup(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult flushcachecontentgroup(java.lang.String name, java.lang.String query, java.lang.String host, java.lang.String selectorvalue) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult flushcachecontentgroupEx(java.lang.String name, java.lang.String query, java.lang.String host, java.lang.String selectorvalue, boolean force) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult savecachecontentgroup(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addcacheforwardproxy(java.lang.String ipaddress, org.apache.axis.types.UnsignedInt port) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmcacheforwardproxy(java.lang.String ipaddress, org.apache.axis.types.UnsignedInt port) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetcacheforwardproxyResult getcacheforwardproxy() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addcacheselector(java.lang.String selectorname, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmcacheselector(java.lang.String selectorname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcacheselector_rule(java.lang.String selectorname, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetcacheselectorResult getcacheselector(java.lang.String selectorname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetcacheobjectResult getcacheobject(java.lang.String url, org.apache.axis.types.UnsignedLong locator, java.lang.String host, org.apache.axis.types.UnsignedInt port, java.lang.String groupname, java.lang.String httpmethod, java.lang.String group, java.lang.String ignoremarkerobjects, java.lang.String includenotreadyobjects) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetcacheobjectResult getcacheobjectEx(java.lang.String url, org.apache.axis.types.UnsignedLong locator, org.apache.axis.types.UnsignedInt httpstatus, java.lang.String host, org.apache.axis.types.UnsignedInt port, java.lang.String groupname, java.lang.String httpmethod, java.lang.String group, java.lang.String ignoremarkerobjects, java.lang.String includenotreadyobjects) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult expirecacheobject(org.apache.axis.types.UnsignedLong locator, java.lang.String url, java.lang.String host, org.apache.axis.types.UnsignedInt port, java.lang.String groupname, NSConfig.HttpmethodEnum httpmethod) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult flushcacheobject(org.apache.axis.types.UnsignedLong locator, java.lang.String url, java.lang.String host, org.apache.axis.types.UnsignedInt port, java.lang.String groupname, NSConfig.HttpmethodEnum httpmethod) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult flushcacheobjectEx(org.apache.axis.types.UnsignedLong locator, java.lang.String url, java.lang.String host, org.apache.axis.types.UnsignedInt port, java.lang.String groupname, NSConfig.HttpmethodEnum httpmethod, boolean force) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult savecacheobject(org.apache.axis.types.UnsignedLong locator) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindcacheglobal_policy(java.lang.String policy, org.apache.axis.types.UnsignedInt priority, NSConfig.YesnoEnum precededefrules) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindcacheglobal_policyEx(java.lang.String policy, org.apache.axis.types.UnsignedInt priority, NSConfig.YesnoEnum precededefrules, java.lang.String gotopriorityexpression, NSConfig.CacheglobalbindpointEnum type, boolean invoke, NSConfig.CachepolicylabelinvoketypeEnum labeltype, java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindcacheglobal_policy(java.lang.String policy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindcacheglobal_policyEx(java.lang.String policy, NSConfig.CacheglobalbindpointEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindcacheglobal_priority(java.lang.String policy, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetcacheglobalResult getcacheglobal() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetcacheglobalResult getcacheglobalEx(java.lang.String type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcacheparameter_memlimit(org.apache.axis.types.UnsignedInt memlimit) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcacheparameter_via(java.lang.String via) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcacheparameter_verifyusing(NSConfig.VerifyusingEnum verifyusing) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcacheparameter_maxpostlen(org.apache.axis.types.UnsignedInt maxpostlen) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcacheparameter_prefetchmaxpending(org.apache.axis.types.UnsignedInt prefetchmaxpending) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcacheparameter_enablebypass(NSConfig.YesnoEnum enablebypass) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcacheparameter_undefaction(NSConfig.CacheundefdirectiveEnum undefaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcacheparameter_enablediskcache(NSConfig.YesnoEnum enablediskcache) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcacheparameter_memlimit() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcacheparameter_via() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcacheparameter_verifyusing() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcacheparameter_maxpostlen() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcacheparameter_prefetchmaxpending() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcacheparameter_enablebypass() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcacheparameter_undefaction() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcacheparameter_enablediskcache() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetcacheparameterResult getcacheparameter() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetclioutputResult getclioutput(java.lang.String command) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult joincluster(java.lang.String clip, java.lang.String password) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addclusterinstance(org.apache.axis.types.UnsignedInt clid, org.apache.axis.types.UnsignedInt deadinterval, org.apache.axis.types.UnsignedInt hellointerval, NSConfig.EnabledisabledEnum preemption) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmclusterinstance(org.apache.axis.types.UnsignedInt clid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setclusterinstance_deadinterval(org.apache.axis.types.UnsignedInt clid, org.apache.axis.types.UnsignedInt deadinterval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setclusterinstance_hellointerval(org.apache.axis.types.UnsignedInt clid, org.apache.axis.types.UnsignedInt hellointerval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setclusterinstance_preemption(org.apache.axis.types.UnsignedInt clid, NSConfig.EnabledisabledEnum preemption) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetclusterinstance_deadinterval(org.apache.axis.types.UnsignedInt clid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetclusterinstance_hellointerval(org.apache.axis.types.UnsignedInt clid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetclusterinstance_preemption(org.apache.axis.types.UnsignedInt clid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult enableclusterinstance(org.apache.axis.types.UnsignedInt clid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disableclusterinstance(org.apache.axis.types.UnsignedInt clid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetclusterinstanceResult getclusterinstance(org.apache.axis.types.UnsignedInt clid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addclusternode(org.apache.axis.types.UnsignedInt nodeid, java.lang.String ipaddress, NSConfig.ClnodestateEnum state, java.lang.String backplane) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addclusternodeEx(org.apache.axis.types.UnsignedInt nodeid, java.lang.String ipaddress, NSConfig.ClnodestateEnum state, java.lang.String backplane, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setclusternode_state(org.apache.axis.types.UnsignedInt nodeid, NSConfig.ClnodestateEnum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setclusternode_backplane(org.apache.axis.types.UnsignedInt nodeid, java.lang.String backplane) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setclusternode_priority(org.apache.axis.types.UnsignedInt nodeid, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetclusternode_state(org.apache.axis.types.UnsignedInt nodeid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetclusternode_backplane(org.apache.axis.types.UnsignedInt nodeid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetclusternode_priority(org.apache.axis.types.UnsignedInt nodeid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmclusternode(org.apache.axis.types.UnsignedInt nodeid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetclusternodeResult getclusternode(org.apache.axis.types.UnsignedInt nodeid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addclusternodegroup(java.lang.String name, NSConfig.YesnoEnum strict) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetclusternodegroupResult getclusternodegroup(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setclusternodegroup_strict(java.lang.String name, NSConfig.YesnoEnum strict) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetclusternodegroup_strict(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindclusternodegroup_node(java.lang.String name, org.apache.axis.types.UnsignedInt node) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindclusternodegroup_vserver(java.lang.String name, java.lang.String vserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindclusternodegroup_identifier(java.lang.String name, java.lang.String identifiername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindclusternodegroup_node(java.lang.String name, org.apache.axis.types.UnsignedInt node) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindclusternodegroup_vserver(java.lang.String name, java.lang.String vserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindclusternodegroup_identifier(java.lang.String name, java.lang.String identifiername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmclusternodegroup(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult syncclusterfiles(NSConfig.SyncmodeEnum mode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult forceclustersync() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addcmpaction(java.lang.String name, NSConfig.ActioncmptypeEnum cmptype, NSConfig.ActiondeltacmptypeEnum deltatype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmcmpaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetcmpactionResult getcmpaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renamecmpaction(java.lang.String name, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addcmppolicy(java.lang.String name, java.lang.String rule, java.lang.String resaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmcmppolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcmppolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcmppolicy_resaction(java.lang.String name, java.lang.String resaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetcmppolicyResult getcmppolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renamecmppolicy(java.lang.String name, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addcmppolicylabel(java.lang.String labelname, NSConfig.CmppolicylabeltypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmcmppolicylabel(java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindcmppolicylabel_policy(java.lang.String labelname, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, java.lang.String gotopriorityexpression, boolean invoke, NSConfig.PolicylabelinvoketypeEnum labeltype, java.lang.String labelname2) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindcmppolicylabel_policy(java.lang.String labelname, java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindcmppolicylabel_priority(java.lang.String labelname, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetcmppolicylabelResult getcmppolicylabel(java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renamecmppolicylabel(java.lang.String labelname, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindcmpglobal_policy(java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, NSConfig.EnabledisabledEnum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindcmpglobal_policyEx(java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, NSConfig.EnabledisabledEnum state, NSConfig.CmpglobalbindpointEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindcmpglobal_policy(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindcmpglobal_policyEx(java.lang.String policyname, NSConfig.CmpglobalbindpointEnum type, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetcmpglobalResult getcmpglobal(java.lang.String type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcmpparameter_cmplevel(NSConfig.CmplevelEnum cmplevel) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcmpparameter_quantumsize(org.apache.axis.types.UnsignedInt quantumsize) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcmpparameter_servercmp(NSConfig.OnoffEnum servercmp) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcmpparameter_heurexpiry(NSConfig.OnoffEnum heurexpiry) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcmpparameter_heurexpirythres(org.apache.axis.types.UnsignedInt heurexpirythres) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcmpparameter_heurexpiryhistwt(org.apache.axis.types.UnsignedInt heurexpiryhistwt) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcmpparameter_minressize(org.apache.axis.types.UnsignedInt minressize) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcmpparameter_cmpbypasspct(org.apache.axis.types.UnsignedInt cmpbypasspct) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcmpparameter_cmponpush(NSConfig.EnabledisabledEnum cmponpush) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcmpparameter_policytype(NSConfig.ExprtypeEnum policytype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcmpparameter_addvaryheader(NSConfig.EnabledisabledEnum addvaryheader) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcmpparameter_externalcache(NSConfig.YesnoEnum externalcache) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcmpparameter_cmplevel() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcmpparameter_quantumsize() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcmpparameter_servercmp() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcmpparameter_heurexpiry() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcmpparameter_heurexpirythres() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcmpparameter_heurexpiryhistwt() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcmpparameter_minressize() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcmpparameter_cmpbypasspct() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcmpparameter_cmponpush() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcmpparameter_policytype() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcmpparameter_addvaryheader() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcmpparameter_externalcache() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetcmpparameterResult getcmpparameter() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcopolicy_rule(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcopolicy_action(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcoparameter_cachemaxage() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcoparameter_imgtype() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcoparameter_jpegqualitypercent() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcoparameter_inlinecssthressize() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcoparameter_inlinejsthressize() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcoparameter_inlineimgthressize() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addcrpolicy(java.lang.String policyname, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmcrpolicy(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrpolicy_rule(java.lang.String policyname, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetcrpolicyResult getcrpolicy(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addcrvserver(java.lang.String name, NSConfig.CrvservicetypeEnum servicetype, java.lang.String ipaddress, org.apache.axis.types.UnsignedInt port, org.apache.axis.types.UnsignedInt range, NSConfig.CachtypeEnum cachetype, NSConfig.EnabledisabledEnum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addcrvserverEx(java.lang.String name, NSConfig.CrvservicetypeEnum servicetype, java.lang.String ipaddress, org.apache.axis.types.UnsignedInt port, org.apache.axis.types.UnsignedInt range, NSConfig.CachtypeEnum cachetype, java.lang.String redirecturl, NSConfig.EnabledisabledEnum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmcrvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_ipaddress(java.lang.String name, java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_redirect(java.lang.String name, NSConfig.CrdtypeEnum redirect) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_onpolicymatch(java.lang.String name, NSConfig.OnmatchEnum onpolicymatch) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_precedence(java.lang.String name, NSConfig.CsprecedenceEnum precedence) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_arp(java.lang.String name, NSConfig.OnoffEnum arp) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_via(java.lang.String name, NSConfig.OnoffEnum via) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_cachevserver(java.lang.String name, java.lang.String cachevserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_dnsvservername(java.lang.String name, java.lang.String dnsvservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_destinationvserver(java.lang.String name, java.lang.String destinationvserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_domain(java.lang.String name, java.lang.String domain) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_reuse(java.lang.String name, NSConfig.OnoffEnum reuse) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_backupvserver(java.lang.String name, java.lang.String backupvserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_disableprimaryondown(java.lang.String name, NSConfig.EnabledisabledEnum disableprimaryondown) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_redirecturl(java.lang.String name, java.lang.String redirecturl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_clttimeout(java.lang.String name, org.apache.axis.types.UnsignedInt clttimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_downstateflush(java.lang.String name, NSConfig.EnabledisabledEnum downstateflush) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_l2Conn(java.lang.String name, NSConfig.OnoffEnum l2Conn) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_backendssl(java.lang.String name, NSConfig.EnabledisabledEnum backendssl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_listenpolicy(java.lang.String name, java.lang.String listenpolicy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_listenpriority(java.lang.String name, org.apache.axis.types.UnsignedInt listenpriority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_tcpprofile(java.lang.String name, java.lang.String tcpprofilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_httpprofile(java.lang.String name, java.lang.String httpprofilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_netprofile(java.lang.String name, java.lang.String netprofile) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_srcipexpr(java.lang.String name, java.lang.String srcipexpr) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_originusip(java.lang.String name, NSConfig.OnoffEnum originusip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_useportrange(java.lang.String name, NSConfig.OnoffEnum useportrange) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_appflowlog(java.lang.String name, NSConfig.EnabledisabledEnum appflowlog) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcrvserver_icmpvsrresponse(java.lang.String name, NSConfig.IcmpvsrresponseEnum icmpvsrresponse) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_cachevserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_dnsvservername(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_destinationvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_domain(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_backupvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_clttimeout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_redirecturl(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_l2Conn(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_backendssl(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_originusip(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_useportrange(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_srcipexpr(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_tcpprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_httpprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_appflowlog(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_netprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_icmpvsrresponse(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_redirect(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_onpolicymatch(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_precedence(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_arp(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_via(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_reuse(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_disableprimaryondown(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_downstateflush(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_listenpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_listenpriority(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcrvserver_comment(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindcrvserver_lbvserver(java.lang.String name, java.lang.String lbvserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindcrvserver_policy(java.lang.String name, java.lang.String policyname, java.lang.String targetvserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindcrvserver_policyEx(java.lang.String name, java.lang.String policyname, java.lang.String targetvserver, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindcrvserver_policy(java.lang.String name, java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindcrvserver_lbvserver(java.lang.String name, java.lang.String lbvserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult enablecrvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disablecrvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetcrvserverResult getcrvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renamecrvserver(java.lang.String name, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addcspolicy(java.lang.String policyname, java.lang.String url, java.lang.String rule, java.lang.String domain, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmcspolicy(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcspolicy_url(java.lang.String policyname, java.lang.String url) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcspolicy_rule(java.lang.String policyname, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcspolicy_domain(java.lang.String policyname, java.lang.String domain) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcspolicy_action(java.lang.String policyname, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcspolicy_logaction(java.lang.String policyname, java.lang.String logaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcspolicy_logaction(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcspolicy_url(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcspolicy_rule(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcspolicy_domain(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcspolicy_action(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetcspolicyResult getcspolicy(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renamecspolicy(java.lang.String policyname, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addcspolicylabel(java.lang.String labelname, NSConfig.CspolicylabeltypeEnum cspolicylabeltype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmcspolicylabel(java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindcspolicylabel_targetvserver(java.lang.String labelname, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, java.lang.String targetvserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindcspolicylabel_gotopriorityexpression(java.lang.String labelname, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, java.lang.String gotopriorityexpression) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindcspolicylabel_invoke(java.lang.String labelname, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, boolean invoke, NSConfig.CsinvokelabeltypeEnum labeltype, java.lang.String labelname2) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindcspolicylabel_policy(java.lang.String labelname, java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetcspolicylabelResult getcspolicylabel(java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renamecspolicylabel(java.lang.String labelname, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addcsvserver(java.lang.String name, NSConfig.CsvservicetypeEnum servicetype, java.lang.String ipaddress, org.apache.axis.types.UnsignedInt range, org.apache.axis.types.UnsignedInt port, NSConfig.EnabledisabledEnum state, java.lang.String vipheader) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addcsvserverEx(java.lang.String name, NSConfig.CsvservicetypeEnum servicetype, java.lang.String ipaddress, java.lang.String ippattern, java.lang.String ipmask, org.apache.axis.types.UnsignedInt range, org.apache.axis.types.UnsignedInt port, NSConfig.EnabledisabledEnum state, java.lang.String vipheader) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmcsvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_ipaddress(java.lang.String name, java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_ippattern(java.lang.String name, java.lang.String ippattern) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_ipmask(java.lang.String name, java.lang.String ipmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_stateupdate(java.lang.String name, NSConfig.EnabledisabledEnum stateupdate) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_precedence(java.lang.String name, NSConfig.CsprecedenceEnum precedence) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_casesensitive(java.lang.String name, NSConfig.OnoffEnum casesensitive) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_backupvserver(java.lang.String name, java.lang.String backupvserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_redirecturl(java.lang.String name, java.lang.String redirecturl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_cacheable(java.lang.String name, NSConfig.YesnoEnum cacheable) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_clttimeout(java.lang.String name, org.apache.axis.types.UnsignedInt clttimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_somethod(java.lang.String name, NSConfig.SpillovermethodsEnum somethod) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_sopersistence(java.lang.String name, NSConfig.EnabledisabledEnum sopersistence) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_sopersistencetimeout(java.lang.String name, org.apache.axis.types.UnsignedInt sopersistencetimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_sothreshold(java.lang.String name, org.apache.axis.types.UnsignedInt sothreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_sobackupaction(java.lang.String name, NSConfig.SpilloverbackupactiontypeEnum sobackupaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_redirectportrewrite(java.lang.String name, NSConfig.EnabledisabledEnum redirectportrewrite) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_downstateflush(java.lang.String name, NSConfig.EnabledisabledEnum downstateflush) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_disableprimaryondown(java.lang.String name, NSConfig.EnabledisabledEnum disableprimaryondown) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_insertvserveripport(java.lang.String name, NSConfig.VipinsertEnum insertvserveripport, java.lang.String vipheader) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_rtspnat(java.lang.String name, NSConfig.OnoffEnum rtspnat) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_authenticationhost(java.lang.String name, java.lang.String authenticationhost) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_authentication(java.lang.String name, NSConfig.OnoffEnum authentication) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_listenpolicy(java.lang.String name, java.lang.String listenpolicy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_listenpriority(java.lang.String name, org.apache.axis.types.UnsignedInt listenpriority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_authn401(java.lang.String name, NSConfig.OnoffEnum authn401) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_authnvsname(java.lang.String name, java.lang.String authnvsname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_push(java.lang.String name, NSConfig.EnabledisabledEnum push) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_pushvserver(java.lang.String name, java.lang.String pushvserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_pushlabel(java.lang.String name, java.lang.String pushlabel) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_pushmulticlients(java.lang.String name, NSConfig.YesnoEnum pushmulticlients) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_tcpprofile(java.lang.String name, java.lang.String tcpprofilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_httpprofile(java.lang.String name, java.lang.String httpprofilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_dbprofile(java.lang.String name, java.lang.String dbprofilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_l2Conn(java.lang.String name, NSConfig.OnoffEnum l2Conn) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_mssqlserverversion(java.lang.String name, NSConfig.MssqlversionsEnum mssqlserverversion) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_mysqlprotocolversion(java.lang.String name, org.apache.axis.types.UnsignedInt mysqlprotocolversion) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_oracleserverversion(java.lang.String name, NSConfig.OracleversionsEnum oracleserverversion) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_mysqlserverversion(java.lang.String name, java.lang.String mysqlserverversion) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_mysqlcharacterset(java.lang.String name, org.apache.axis.types.UnsignedInt mysqlcharacterset) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_mysqlservercapabilities(java.lang.String name, org.apache.axis.types.UnsignedInt mysqlservercapabilities) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_appflowlog(java.lang.String name, NSConfig.EnabledisabledEnum appflowlog) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_netprofile(java.lang.String name, java.lang.String netprofile) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_authnprofile(java.lang.String name, java.lang.String authnprofile) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsvserver_icmpvsrresponse(java.lang.String name, NSConfig.IcmpvsrresponseEnum icmpvsrresponse) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_casesensitive(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_backupvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_clttimeout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_redirecturl(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_authn401(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_authentication(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_authenticationhost(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_authnvsname(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_pushvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_pushlabel(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_tcpprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_httpprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_dbprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_l2Conn(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_mysqlprotocolversion(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_mysqlserverversion(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_mysqlcharacterset(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_mysqlservercapabilities(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_appflowlog(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_netprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_icmpvsrresponse(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_authnprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_stateupdate(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_precedence(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_cacheable(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_somethod(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_sopersistence(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_sopersistencetimeout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_sothreshold(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_sobackupaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_redirectportrewrite(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_downstateflush(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_disableprimaryondown(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_insertvserveripport(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_vipheader(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_rtspnat(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_listenpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_listenpriority(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_push(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_pushmulticlients(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_comment(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_mssqlserverversion(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsvserver_oracleserverversion(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindcsvserver_lbvserver(java.lang.String name, java.lang.String lbvserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindcsvserver_policy(java.lang.String name, java.lang.String policyname, java.lang.String targetlbvserver, org.apache.axis.types.UnsignedInt priority, java.lang.String gotopriorityexpression, NSConfig.VserverbindpointEnum type, boolean invoke, NSConfig.PolicylabelinvoketypeEnum labeltype, java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindcsvserver_targetvserver(java.lang.String name, java.lang.String targetvserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindcsvserver_policy(java.lang.String name, java.lang.String policyname, NSConfig.VserverbindpointEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindcsvserver_policyEx(java.lang.String name, java.lang.String policyname, NSConfig.VserverbindpointEnum type, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindcsvserver_lbvserver(java.lang.String name, java.lang.String lbvserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult enablecsvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disablecsvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetcsvserverResult getcsvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renamecsvserver(java.lang.String name, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsparameter_stateupdate(NSConfig.EnabledisabledEnum stateupdate) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsparameter_stateupdate() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetcsparameterResult getcsparameter() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addcsaction(java.lang.String name, java.lang.String targetlbvserver, java.lang.String targetvserverexpr) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmcsaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsaction_targetlbvserver(java.lang.String name, java.lang.String targetlbvserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsaction_targetvserverexpr(java.lang.String name, java.lang.String targetvserverexpr) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcsaction_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcsaction_comment(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetcsactionResult getcsaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renamecsaction(java.lang.String name, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult adddbuser(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmdbuser(java.lang.String username) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdbuser_password(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetdbuserResult getdbuser(java.lang.String username, boolean loggedin) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult adddbdbprofile(java.lang.String name, NSConfig.YesnoEnum interpretquery, NSConfig.YesnoEnum stickiness, java.lang.String kcdaccount, NSConfig.EnabledisabledEnum conmultiplex) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmdbdbprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdbdbprofile_interpretquery(java.lang.String name, NSConfig.YesnoEnum interpretquery) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdbdbprofile_stickiness(java.lang.String name, NSConfig.YesnoEnum stickiness) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdbdbprofile_kcdaccount(java.lang.String name, java.lang.String kcdaccount) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdbdbprofile_conmultiplex(java.lang.String name, NSConfig.EnabledisabledEnum conmultiplex) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdbdbprofile_interpretquery(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdbdbprofile_stickiness(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdbdbprofile_kcdaccount(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdbdbprofile_conmultiplex(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetdbdbprofileResult getdbdbprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult adddnsaaaarec(java.lang.String hostname, java.lang.String ipv6Address, org.apache.axis.types.UnsignedInt ttl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmdnsaaaarec(java.lang.String hostname, java.lang.String ipv6Address) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetdnsaaaarecResult getdnsaaaarec(java.lang.String hostname, java.lang.String type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetdnsaaaarecResult getdnsaaaarecEx(java.lang.String hostname, java.lang.String ipv6Address, java.lang.String type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult adddnsaddrec(java.lang.String hostname, java.lang.String ipaddress, org.apache.axis.types.UnsignedInt ttl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmdnsaddrec(java.lang.String hostname, java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetdnsaddrecResult getdnsaddrec(java.lang.String hostname, java.lang.String type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult adddnstxtrec(java.lang.String domain, java.lang.String strinG, org.apache.axis.types.UnsignedInt ttl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmdnstxtrec(java.lang.String domain, java.lang.String strinG, org.apache.axis.types.UnsignedInt recordid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetdnstxtrecResult getdnstxtrec(java.lang.String domain, java.lang.String type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult adddnscnamerec(java.lang.String aliasname, java.lang.String canonicalname, org.apache.axis.types.UnsignedInt ttl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmdnscnamerec(java.lang.String aliasname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetdnscnamerecResult getdnscnamerec(java.lang.String aliasname, java.lang.String type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult adddnsmxrec(java.lang.String domain, java.lang.String mx, org.apache.axis.types.UnsignedInt pref) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmdnsmxrec(java.lang.String domain, java.lang.String mx) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnsmxrec_pref(java.lang.String domain, java.lang.String mx, org.apache.axis.types.UnsignedInt pref) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnsmxrec_ttl(java.lang.String domain, java.lang.String mx, org.apache.axis.types.UnsignedInt ttl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnsmxrec_ttl(java.lang.String domain, java.lang.String mx) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetdnsmxrecResult getdnsmxrec(java.lang.String domain, java.lang.String type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult adddnsnsrec(java.lang.String domain, java.lang.String nameserver, org.apache.axis.types.UnsignedInt ttl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmdnsnsrec(java.lang.String domain, java.lang.String nameserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetdnsnsrecResult getdnsnsrec(java.lang.String domain, java.lang.String type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult adddnsptrrec(java.lang.String reversedomain, java.lang.String domain, org.apache.axis.types.UnsignedInt ttl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmdnsptrrec(java.lang.String reversedomain, java.lang.String domain) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetdnsptrrecResult getdnsptrrec(java.lang.String reversedomain, java.lang.String type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult adddnssrvrec(java.lang.String domain, java.lang.String target, org.apache.axis.types.UnsignedInt priority, org.apache.axis.types.UnsignedInt weight, org.apache.axis.types.UnsignedInt port) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmdnssrvrec(java.lang.String domain, java.lang.String target) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnssrvrec_priority(java.lang.String domain, java.lang.String target, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnssrvrec_weight(java.lang.String domain, java.lang.String target, org.apache.axis.types.UnsignedInt weight) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnssrvrec_port(java.lang.String domain, java.lang.String target, org.apache.axis.types.UnsignedInt port) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnssrvrec_ttl(java.lang.String domain, java.lang.String target, org.apache.axis.types.UnsignedInt ttl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnssrvrec_ttl(java.lang.String domain, java.lang.String target) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetdnssrvrecResult getdnssrvrec(java.lang.String domain, java.lang.String target, java.lang.String type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult adddnssoarec(java.lang.String domain, java.lang.String originserver, java.lang.String contact, org.apache.axis.types.UnsignedInt serial, org.apache.axis.types.UnsignedInt refresh, org.apache.axis.types.UnsignedInt retry, org.apache.axis.types.UnsignedInt expire, org.apache.axis.types.UnsignedInt minimum, org.apache.axis.types.UnsignedInt ttl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmdnssoarec(java.lang.String domain) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnssoarec_originserver(java.lang.String domain, java.lang.String originserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnssoarec_contact(java.lang.String domain, java.lang.String contact) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnssoarec_serial(java.lang.String domain, org.apache.axis.types.UnsignedInt serial) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnssoarec_refresh(java.lang.String domain, org.apache.axis.types.UnsignedInt refresh) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnssoarec_retry(java.lang.String domain, org.apache.axis.types.UnsignedInt retry) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnssoarec_expire(java.lang.String domain, org.apache.axis.types.UnsignedInt expire) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnssoarec_minimum(java.lang.String domain, org.apache.axis.types.UnsignedInt minimum) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnssoarec_ttl(java.lang.String domain, org.apache.axis.types.UnsignedInt ttl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnssoarec_serial(java.lang.String domain) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnssoarec_refresh(java.lang.String domain) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnssoarec_retry(java.lang.String domain) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnssoarec_expire(java.lang.String domain) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnssoarec_minimum(java.lang.String domain) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnssoarec_ttl(java.lang.String domain) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetdnssoarecResult getdnssoarec(java.lang.String domain, java.lang.String type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult adddnssuffix(java.lang.String dnssuffix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmdnssuffix(java.lang.String dnssuffix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetdnssuffixResult getdnssuffix(java.lang.String dnssuffix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult adddnsnameserver(java.lang.String ip, java.lang.String dnsvservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult adddnsnameserverEx(java.lang.String ip, java.lang.String dnsvservername, boolean local, NSConfig.EnabledisabledEnum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmdnsnameserver(java.lang.String ip, java.lang.String dnsvservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult enablednsnameserver(java.lang.String ip, java.lang.String dnsvservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disablednsnameserver(java.lang.String ip, java.lang.String dnsvservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetdnsnameserverResult getdnsnameserver(java.lang.String ip, java.lang.String dnsvservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult adddnsview(java.lang.String viewname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmdnsview(java.lang.String viewname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetdnsviewResult getdnsview(java.lang.String viewname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult adddnspolicy(java.lang.String name, java.lang.String rule, java.lang.String viewname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmdnspolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnspolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnspolicy_viewname(java.lang.String name, java.lang.String viewname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnspolicy_preferredlocation(java.lang.String name, java.lang.String preferredlocation) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnspolicy_preferredloclist(java.lang.String name, java.lang.String preferredloclist) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnspolicy_drop(java.lang.String name, NSConfig.YesnoEnum drop) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnspolicy_cachebypass(java.lang.String name, NSConfig.YesnoEnum cachebypass) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnspolicy_action(java.lang.String name, java.lang.String actionname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetdnspolicyResult getdnspolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult adddnsaction64(java.lang.String actionname, java.lang.String prefix, java.lang.String mappedrule, java.lang.String excluderule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmdnsaction64(java.lang.String actionname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnsaction64_prefix(java.lang.String actionname, java.lang.String prefix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnsaction64_mappedrule(java.lang.String actionname, java.lang.String mappedrule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnsaction64_excluderule(java.lang.String actionname, java.lang.String excluderule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnsaction64_prefix(java.lang.String actionname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnsaction64_mappedrule(java.lang.String actionname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnsaction64_excluderule(java.lang.String actionname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.Getdnsaction64Result getdnsaction64(java.lang.String actionname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult adddnspolicy64(java.lang.String name, java.lang.String rule, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmdnspolicy64(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnspolicy64_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnspolicy64_action(java.lang.String name, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.Getdnspolicy64Result getdnspolicy64(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult adddnszone(java.lang.String zonename, NSConfig.YesnoEnum proxymode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult adddnszoneEx(java.lang.String zonename, NSConfig.YesnoEnum proxymode, NSConfig.EnabledisabledEnum dnssecoffload, NSConfig.EnabledisabledEnum nsec) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnszone_proxymode(java.lang.String zonename, NSConfig.YesnoEnum proxymode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnszone_proxymodeEx(java.lang.String zonename, NSConfig.YesnoEnum proxymode, NSConfig.EnabledisabledEnum dnssecoffload, NSConfig.EnabledisabledEnum nsec) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnszone_proxymode(java.lang.String zonename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnszone_dnssecoffload(java.lang.String zonename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnszone_nsec(java.lang.String zonename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmdnszone(java.lang.String zonename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult signdnszone(java.lang.String zonename, java.lang.String keyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsigndnszone(java.lang.String zonename, java.lang.String keyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetdnszoneResult getdnszone(java.lang.String zonename, java.lang.String type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult adddnskey(java.lang.String keyname, java.lang.String publickey, java.lang.String privatekey, org.apache.axis.types.UnsignedInt expires, NSConfig.DnskeyexpiryunitsEnum units, org.apache.axis.types.UnsignedInt notificationperiod, NSConfig.DnskeyexpiryunitsEnum units2, org.apache.axis.types.UnsignedInt ttl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult creatednskey(java.lang.String zonename, NSConfig.DnsseckeytypesEnum keytype, NSConfig.DnsseckeyalgorithmEnum algorithm, org.apache.axis.types.UnsignedInt keysize, java.lang.String filenameprefix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnskey_expires(java.lang.String keyname, org.apache.axis.types.UnsignedInt expires, NSConfig.DnskeyexpiryunitsEnum units) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnskey_notificationperiod(java.lang.String keyname, org.apache.axis.types.UnsignedInt notificationperiod, NSConfig.DnskeyexpiryunitsEnum units2) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnskey_ttl(java.lang.String keyname, org.apache.axis.types.UnsignedInt ttl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnskey_expires(java.lang.String keyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnskey_units(java.lang.String keyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnskey_notificationperiod(java.lang.String keyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnskey_units2(java.lang.String keyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnskey_ttl(java.lang.String keyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmdnskey(java.lang.String keyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetdnskeyResult getdnskey(java.lang.String keyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult flushdnsproxyrecords() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnsparameter_retries(org.apache.axis.types.UnsignedInt retries) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnsparameter_minttl(org.apache.axis.types.UnsignedInt minttl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnsparameter_maxttl(org.apache.axis.types.UnsignedInt maxttl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnsparameter_cacherecords(NSConfig.YesnoEnum cacherecords) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnsparameter_namelookuppriority(NSConfig.NamelookuppriorityEnum namelookuppriority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnsparameter_recursion(NSConfig.EnabledisabledEnum recursion) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnsparameter_resolutionorder(NSConfig.NamelookuporderEnum resolutionorder) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnsparameter_dnssec(NSConfig.EnabledisabledEnum dnssec) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnsparameter_maxpipeline(org.apache.axis.types.UnsignedInt maxpipeline) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnsparameter_dnsrootreferral(NSConfig.EnabledisabledEnum dnsrootreferral) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnsparameter_dns64Timeout(org.apache.axis.types.UnsignedInt dns64Timeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnsparameter_retries() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnsparameter_minttl() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnsparameter_maxttl() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnsparameter_cacherecords() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnsparameter_namelookuppriority() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnsparameter_recursion() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnsparameter_resolutionorder() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnsparameter_dnssec() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnsparameter_maxpipeline() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnsparameter_dnsrootreferral() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnsparameter_dns64Timeout() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetdnsparameterResult getdnsparameter() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult adddnspolicylabel(java.lang.String labelname, NSConfig.DnsformpolicylabeltypeEnum transform) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmdnspolicylabel(java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult binddnspolicylabel_policy(java.lang.String labelname, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, java.lang.String gotopriorityexpression, boolean invoke, NSConfig.PolicylabeldnsinvoketypeEnum labeltype, java.lang.String labelname2) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbinddnspolicylabel_policy(java.lang.String labelname, java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbinddnspolicylabel_priority(java.lang.String labelname, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetdnspolicylabelResult getdnspolicylabel(java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renamednspolicylabel(java.lang.String labelname, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult binddnsglobal_policyname(java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, java.lang.String gotopriorityexpression) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult binddnsglobal_policynameEx(java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, java.lang.String gotopriorityexpression, NSConfig.DnsglobalbindpointEnum type, boolean invoke, NSConfig.PolicylabeldnsinvoketypeEnum labeltype, java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbinddnsglobal_policyname(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetdnsglobalResult getdnsglobal() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetdnsglobalResult getdnsglobalEx(java.lang.String type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult adddnsaction(java.lang.String actionname, NSConfig.DnsactionEnum actiontype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult adddnsactionEx(java.lang.String actionname, NSConfig.DnsactionEnum actiontype, java.lang.String ipaddress, java.lang.String viewname, java.lang.String preferredloclist) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmdnsaction(java.lang.String actionname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnsaction_ipaddress(java.lang.String actionname, java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnsaction_ttl(java.lang.String actionname, org.apache.axis.types.UnsignedInt ttl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnsaction_viewname(java.lang.String actionname, java.lang.String viewname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdnsaction_preferredloclist(java.lang.String actionname, java.lang.String preferredloclist) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdnsaction_ttl(java.lang.String actionname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetdnsactionResult getdnsaction(java.lang.String actionname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetdnsnsecrecResult getdnsnsecrec(java.lang.String hostname, java.lang.String type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult adddospolicy(java.lang.String name, org.apache.axis.types.UnsignedInt qdepth) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmdospolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdospolicy_qdepth(java.lang.String name, org.apache.axis.types.UnsignedInt qdepth) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setdospolicy_cltdetectrate(java.lang.String name, org.apache.axis.types.UnsignedInt cltdetectrate) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetdospolicy_cltdetectrate(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetdospolicyResult getdospolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addfilteraction(java.lang.String name, NSConfig.ActionfilqualifierEnum qual, java.lang.String servicename, java.lang.String value, org.apache.axis.types.UnsignedInt respcode, java.lang.String page) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmfilteraction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setfilteraction_servicename(java.lang.String name, java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setfilteraction_value(java.lang.String name, java.lang.String value) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setfilteraction_respcode(java.lang.String name, org.apache.axis.types.UnsignedInt respcode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setfilteraction_page(java.lang.String name, java.lang.String page) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetfilteraction_page(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetfilteractionResult getfilteraction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addfilterhtmlinjectionvariable(java.lang.String variable, java.lang.String value) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmfilterhtmlinjectionvariable(java.lang.String variable) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setfilterhtmlinjectionvariable_value(java.lang.String variable, java.lang.String value) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetfilterhtmlinjectionvariable_value(java.lang.String variable) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetfilterhtmlinjectionvariableResult getfilterhtmlinjectionvariable(java.lang.String variable) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addfilterpolicy(java.lang.String name, java.lang.String rule, java.lang.String reqaction, java.lang.String resaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmfilterpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setfilterpolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setfilterpolicy_reqaction(java.lang.String name, java.lang.String reqaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setfilterpolicy_resaction(java.lang.String name, java.lang.String resaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetfilterpolicyResult getfilterpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setfilterprebodyinjection_prebody(java.lang.String prebody) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetfilterprebodyinjection_prebody() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetfilterprebodyinjectionResult getfilterprebodyinjection() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setfilterpostbodyinjection_postbody(java.lang.String postbody) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetfilterpostbodyinjection_postbody() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetfilterpostbodyinjectionResult getfilterpostbodyinjection() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setfilterhtmlinjectionparameter_rate(org.apache.axis.types.UnsignedInt rate) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setfilterhtmlinjectionparameter_frequency(org.apache.axis.types.UnsignedInt frequency) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setfilterhtmlinjectionparameter_strict(NSConfig.EnabledisabledEnum strict) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setfilterhtmlinjectionparameter_htmlsearchlen(org.apache.axis.types.UnsignedInt htmlsearchlen) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetfilterhtmlinjectionparameter_rate() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetfilterhtmlinjectionparameter_frequency() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetfilterhtmlinjectionparameter_strict() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetfilterhtmlinjectionparameter_htmlsearchlen() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetfilterhtmlinjectionparameterResult getfilterhtmlinjectionparameter() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindfilterglobal_policy(java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, NSConfig.EnabledisabledEnum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindfilterglobal_policy(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetfilterglobalResult getfilterglobal() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addgslbsite(java.lang.String sitename, NSConfig.GslbviptypeEnum sitetype, java.lang.String siteipaddress, java.lang.String publicip, NSConfig.EnabledisabledEnum nwmetricexchange, NSConfig.EnabledisabledEnum sessionexchange) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmgslbsite(java.lang.String sitename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbsite_metricexchange(java.lang.String sitename, NSConfig.EnabledisabledEnum metricexchange) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbsite_nwmetricexchange(java.lang.String sitename, NSConfig.EnabledisabledEnum nwmetricexchange) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbsite_sessionexchange(java.lang.String sitename, NSConfig.EnabledisabledEnum sessionexchange) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbsite_triggermonitor(java.lang.String sitename, NSConfig.TriggermonitorEnum triggermonitor) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbsite_metricexchange(java.lang.String sitename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbsite_nwmetricexchange(java.lang.String sitename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbsite_sessionexchange(java.lang.String sitename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbsite_triggermonitor(java.lang.String sitename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetgslbsiteResult getgslbsite(java.lang.String sitename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addgslbservice(java.lang.String servicename, java.lang.String ip, java.lang.String servername, NSConfig.GslbvservicetypeEnum servicetype, org.apache.axis.types.UnsignedInt port, java.lang.String sitename, NSConfig.EnabledisabledEnum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addgslbserviceEx(java.lang.String servicename, java.lang.String cnameentry, java.lang.String ip, java.lang.String servername, NSConfig.GslbvservicetypeEnum servicetype, org.apache.axis.types.UnsignedInt port, java.lang.String publicip, org.apache.axis.types.UnsignedInt publicport, java.lang.String sitename, NSConfig.EnabledisabledEnum state, NSConfig.HttpsitepersistenceEnum sitepersistence, java.lang.String siteprefix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmgslbservice(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbservice_ipaddress(java.lang.String servicename, java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbservice_publicip(java.lang.String servicename, java.lang.String publicip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbservice_publicport(java.lang.String servicename, org.apache.axis.types.UnsignedInt publicport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbservice_cip(java.lang.String servicename, NSConfig.EnabledisabledEnum cip, java.lang.String cipheader) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbservice_sitepersistence(java.lang.String servicename, NSConfig.HttpsitepersistenceEnum sitepersistence) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbservice_siteprefix(java.lang.String servicename, java.lang.String siteprefix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbservice_maxclient(java.lang.String servicename, org.apache.axis.types.UnsignedInt maxclient) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbservice_healthmonitor(java.lang.String servicename, NSConfig.YesnoEnum healthmonitor) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbservice_maxbandwidth(java.lang.String servicename, org.apache.axis.types.UnsignedInt maxbandwidth) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbservice_downstateflush(java.lang.String servicename, NSConfig.EnabledisabledEnum downstateflush) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbservice_maxaaausers(java.lang.String servicename, org.apache.axis.types.UnsignedInt maxaaausers) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbservice_view(java.lang.String servicename, java.lang.String viewname, java.lang.String viewip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbservice_monthreshold(java.lang.String servicename, org.apache.axis.types.UnsignedInt monthreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbservice_weight(java.lang.String servicename, org.apache.axis.types.UnsignedInt weight, java.lang.String monitorname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbservice_hashid(java.lang.String servicename, org.apache.axis.types.UnsignedInt hashid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbservice_comment(java.lang.String servicename, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbservice_appflowlog(java.lang.String servicename, NSConfig.EnabledisabledEnum appflowlog) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbservice_publicip(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbservice_publicport(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbservice_cip(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbservice_cipheader(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbservice_sitepersistence(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbservice_siteprefix(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbservice_maxclient(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbservice_healthmonitor(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbservice_maxbandwidth(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbservice_downstateflush(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbservice_maxaaausers(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbservice_viewip(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbservice_monthreshold(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbservice_monitorname(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbservice_hashid(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbservice_comment(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbservice_appflowlog(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindgslbservice_view(java.lang.String servicename, java.lang.String viewname, java.lang.String viewip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindgslbservice_monitor(java.lang.String servicename, java.lang.String monitorname, NSConfig.EnabledisabledEnum monstate, org.apache.axis.types.UnsignedInt weight) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindgslbservice_view(java.lang.String servicename, java.lang.String viewname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindgslbservice_monitorname(java.lang.String servicename, java.lang.String monitorname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetgslbserviceResult getgslbservice(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renamegslbservice(java.lang.String servicename, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addgslbvserver(java.lang.String name, NSConfig.GslbvservicetypeEnum servicetype, NSConfig.EnabledisabledEnum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addgslbvserverEx(java.lang.String name, NSConfig.GslbvservicetypeEnum servicetype, NSConfig.GslbiptypeEnum iptype, NSConfig.EnabledisabledEnum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmgslbvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_iptype(java.lang.String name, NSConfig.GslbiptypeEnum iptype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_dnsrecordtype(java.lang.String name, NSConfig.GslbrectypeEnum dnsrecordtype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_backupvserver(java.lang.String name, java.lang.String backupvserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_backupsessiontimeout(java.lang.String name, org.apache.axis.types.UnsignedInt backupsessiontimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_lbmethod(java.lang.String name, NSConfig.GslblbmethodEnum lbmethod, NSConfig.GslblbmethodEnum backuplbmethod) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_netmask(java.lang.String name, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_v6Netmasklen(java.lang.String name, org.apache.axis.types.UnsignedInt v6Netmasklen) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_tolerance(java.lang.String name, org.apache.axis.types.UnsignedInt tolerance) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_persistencetype(java.lang.String name, NSConfig.GslbpersistenceEnum persistencetype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_persistenceid(java.lang.String name, org.apache.axis.types.UnsignedInt persistenceid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_persistmask(java.lang.String name, java.lang.String persistmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_v6Persistmasklen(java.lang.String name, org.apache.axis.types.UnsignedInt v6Persistmasklen) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_timeout(java.lang.String name, org.apache.axis.types.UnsignedInt timeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_edr(java.lang.String name, NSConfig.EnabledisabledEnum edr) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_mir(java.lang.String name, NSConfig.EnabledisabledEnum mir) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_disableprimaryondown(java.lang.String name, NSConfig.EnabledisabledEnum disableprimaryondown) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_dynamicweight(java.lang.String name, NSConfig.Dynamic_wt_optionsEnum dynamicweight) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_considereffectivestate(java.lang.String name, NSConfig.GslbvipconsiderstatsEnum considereffectivestate) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_somethod(java.lang.String name, NSConfig.SpillovermethodsEnum somethod) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_sopersistence(java.lang.String name, NSConfig.EnabledisabledEnum sopersistence) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_sopersistencetimeout(java.lang.String name, org.apache.axis.types.UnsignedInt sopersistencetimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_sothreshold(java.lang.String name, org.apache.axis.types.UnsignedInt sothreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_sobackupaction(java.lang.String name, NSConfig.SpilloverbackupactiontypeEnum sobackupaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_service(java.lang.String name, java.lang.String servicename, org.apache.axis.types.UnsignedInt weight) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_domainname(java.lang.String name, java.lang.String domainname, org.apache.axis.types.UnsignedInt ttl, java.lang.String backupip, java.lang.String cookiedomain, org.apache.axis.types.UnsignedInt cookietimeout, org.apache.axis.types.UnsignedInt sitedomainttl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbvserver_appflowlog(java.lang.String name, NSConfig.EnabledisabledEnum appflowlog) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_backupvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_sothreshold(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_iptype(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_dnsrecordtype(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_backupsessiontimeout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_lbmethod(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_backuplbmethod(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_netmask(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_v6Netmasklen(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_tolerance(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_persistencetype(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_persistenceid(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_persistmask(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_v6Persistmasklen(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_timeout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_edr(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_mir(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_disableprimaryondown(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_dynamicweight(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_considereffectivestate(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_somethod(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_sopersistence(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_sopersistencetimeout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_sobackupaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_servicename(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_weight(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_comment(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbvserver_appflowlog(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindgslbvserver_service(java.lang.String name, java.lang.String servicename, org.apache.axis.types.UnsignedInt weight) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindgslbvserver_domainname(java.lang.String name, java.lang.String domainname, org.apache.axis.types.UnsignedInt ttl, java.lang.String backupip, java.lang.String cookiedomain, org.apache.axis.types.UnsignedInt cookietimeout, org.apache.axis.types.UnsignedInt sitedomainttl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindgslbvserver_policy(java.lang.String name, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, java.lang.String gotopriorityexpression) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindgslbvserver_service(java.lang.String name, java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindgslbvserver_domainname(java.lang.String name, java.lang.String domainname, boolean backupip, boolean cookiedomain) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindgslbvserver_policy(java.lang.String name, java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult enablegslbvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disablegslbvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetgslbvserverResult getgslbvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renamegslbvserver(java.lang.String name, java.lang.String newname) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult addgslbpolicy(java.lang.String name, java.lang.String reqrule, java.lang.String actioN) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult rmgslbpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setgslbpolicy_action(java.lang.String name, java.lang.String actioN) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.GetgslbpolicyResult getgslbpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult addgslbaction(java.lang.String name, java.lang.String preferredlocation) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult rmgslbaction(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setgslbaction_preferredlocation(java.lang.String name, java.lang.String preferredlocation) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.GetgslbactionResult getgslbaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult cleargslbldnsentries() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetgslbldnsentriesResult getgslbldnsentries() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbparameter_ldnsentrytimeout(org.apache.axis.types.UnsignedInt ldnsentrytimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbparameter_rtttolerance(org.apache.axis.types.UnsignedInt rtttolerance) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbparameter_ldnsmask(java.lang.String ldnsmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbparameter_v6Ldnsmasklen(org.apache.axis.types.UnsignedInt v6Ldnsmasklen) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbparameter_ldnsprobeorder(NSConfig.LdnsprobeorderEnum ldnsprobeorder) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setgslbparameter_dropldnsreq(NSConfig.EnabledisabledEnum dropldnsreq) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbparameter_ldnsentrytimeout() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbparameter_rtttolerance() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbparameter_ldnsmask() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbparameter_v6Ldnsmasklen() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbparameter_ldnsprobeorder() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetgslbparameter_dropldnsreq() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetgslbparameterResult getgslbparameter() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmgslbldnsentry(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult syncgslbconfig(boolean preview, boolean debug) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult syncgslbconfigEx(boolean preview, boolean debug, java.lang.String forcesync) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult syncgslbconfigEx2(boolean preview, boolean debug, java.lang.String forcesync, boolean nowarn) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult syncgslbconfigEx3(boolean preview, boolean debug, java.lang.String forcesync, boolean nowarn, boolean saveconfig) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult syncgslbconfigEx4(boolean preview, boolean debug, java.lang.String forcesync, boolean nowarn, boolean saveconfig, java.lang.String command) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addhanode(org.apache.axis.types.UnsignedInt id, java.lang.String ipaddress, NSConfig.EnabledisabledEnum inc) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmhanode(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult sethanode_hastatus(org.apache.axis.types.UnsignedInt id, NSConfig.HastatusEnum hastatus) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult sethanode_hasync(org.apache.axis.types.UnsignedInt id, NSConfig.EnabledisabledEnum hasync) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult sethanode_haprop(org.apache.axis.types.UnsignedInt id, NSConfig.EnabledisabledEnum haprop) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult sethanode_hellointerval(org.apache.axis.types.UnsignedInt id, org.apache.axis.types.UnsignedInt hellointerval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult sethanode_deadinterval(org.apache.axis.types.UnsignedInt id, org.apache.axis.types.UnsignedInt deadinterval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult sethanode_failsafe(org.apache.axis.types.UnsignedInt id, NSConfig.OnoffEnum failsafe) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult sethanode_maxflips(org.apache.axis.types.UnsignedInt id, org.apache.axis.types.UnsignedInt maxflips) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult sethanode_maxfliptime(org.apache.axis.types.UnsignedInt id, org.apache.axis.types.UnsignedInt maxfliptime) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult sethanode_syncvlan(org.apache.axis.types.UnsignedInt id, org.apache.axis.types.UnsignedInt syncvlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsethanode_hastatus(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsethanode_hasync(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsethanode_haprop(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsethanode_hellointerval(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsethanode_deadinterval(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsethanode_failsafe(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsethanode_maxflips(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsethanode_maxfliptime(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsethanode_syncvlan(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindhanode_routemonitor(org.apache.axis.types.UnsignedInt id, java.lang.String routemonitor, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindhanode_routemonitor(org.apache.axis.types.UnsignedInt id, java.lang.String routemonitor, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GethanodeResult gethanode(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult forcehasync() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult forcehasyncEx(boolean force, NSConfig.YesnoEnum save) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult synchafiles(NSConfig.SyncmodeEnum mode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult forcehafailover() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addipsecprofile(java.lang.String name, NSConfig.EncryptionalgoEnum encalgo, NSConfig.AuthenticationtypeEnum hashalgo, org.apache.axis.types.UnsignedInt lifetime, java.lang.String psk, java.lang.String publickey, java.lang.String privatekey, java.lang.String peerpublickey, org.apache.axis.types.UnsignedInt livenesscheckinterval, org.apache.axis.types.UnsignedInt replaywindowsize, org.apache.axis.types.UnsignedInt retransmissiontime) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addipsecprofileEx(java.lang.String name, NSConfig.IkeversionEnum ikeversion, NSConfig.EncryptionalgoEnum encalgo, NSConfig.AuthenticationtypeEnum hashalgo, org.apache.axis.types.UnsignedInt lifetime, java.lang.String psk, java.lang.String publickey, java.lang.String privatekey, java.lang.String peerpublickey, org.apache.axis.types.UnsignedInt livenesscheckinterval, org.apache.axis.types.UnsignedInt replaywindowsize, org.apache.axis.types.UnsignedInt retransmissiontime) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetipsecprofileResult getipsecprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmipsecprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setipsecparameter_ikeversion(NSConfig.IkeversionEnum ikeversion) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setipsecparameter_encalgo(NSConfig.EncryptionalgoEnum encalgo) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setipsecparameter_hashalgo(NSConfig.AuthenticationtypeEnum hashalgo) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setipsecparameter_lifetime(org.apache.axis.types.UnsignedInt lifetime) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setipsecparameter_livenesscheckinterval(org.apache.axis.types.UnsignedInt livenesscheckinterval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setipsecparameter_replaywindowsize(org.apache.axis.types.UnsignedInt replaywindowsize) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setipsecparameter_ikeretryinterval(org.apache.axis.types.UnsignedInt ikeretryinterval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setipsecparameter_retransmissiontime(org.apache.axis.types.UnsignedInt retransmissiontime) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetipsecparameter_ikeversion() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetipsecparameter_encalgo() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetipsecparameter_hashalgo() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetipsecparameter_lifetime() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetipsecparameter_livenesscheckinterval() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetipsecparameter_replaywindowsize() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetipsecparameter_ikeretryinterval() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetipsecparameter_retransmissiontime() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetipsecparameterResult getipsecparameter() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addlbmonitor(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String sipuri, java.lang.String scriptname, java.lang.String username, java.lang.String password, java.lang.String radkey) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmlbmonitor(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String respcode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_action(java.lang.String monitorname, NSConfig.MonitortypeEnum type, NSConfig.MonactionEnum actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_respcode(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String respcode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_httprequest(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String httprequest) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_rtsprequest(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String rtsprequest) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_customheaders(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String customheaders) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_maxforwards(java.lang.String monitorname, NSConfig.MonitortypeEnum type, org.apache.axis.types.UnsignedInt maxforwards) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_sipmethod(java.lang.String monitorname, NSConfig.MonitortypeEnum type, NSConfig.SipmethodEnum sipmethod, java.lang.String sipreguri) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_sipuri(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String sipuri) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_send(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String send) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_recv(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String recv) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_query(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String query) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_querytype(java.lang.String monitorname, NSConfig.MonitortypeEnum type, NSConfig.DnsqueryEnum querytype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_username(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String username) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_password(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String password) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_secondarypassword(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String secondarypassword) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_logonpointname(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String logonpointname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_lasversion(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String lasversion) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_radkey(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String radkey) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_radnasid(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String radnasid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_radnasip(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String radnasip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_radaccounttype(java.lang.String monitorname, NSConfig.MonitortypeEnum type, org.apache.axis.types.UnsignedInt radaccounttype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_radframedip(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String radframedip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_radapn(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String radapn) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_radmsisdn(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String radmsisdn) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_radaccountsession(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String radaccountsession) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_lrtm(java.lang.String monitorname, NSConfig.MonitortypeEnum type, NSConfig.EnabledisabledEnum lrtM) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_deviation(java.lang.String monitorname, NSConfig.MonitortypeEnum type, org.apache.axis.types.UnsignedInt deviation, NSConfig.TimeunitsEnum units) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_scriptname(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String scriptname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_scriptargs(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String scriptargs) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_validatecred(java.lang.String monitorname, NSConfig.MonitortypeEnum type, NSConfig.YesnoEnum validatecred) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_domain(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String domain) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_dispatcherip(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String dispatcherip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_dispatcherport(java.lang.String monitorname, NSConfig.MonitortypeEnum type, org.apache.axis.types.UnsignedInt dispatcherport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_interval(java.lang.String monitorname, NSConfig.MonitortypeEnum type, int interval, NSConfig.TimeunitsEnum units2) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_resptimeout(java.lang.String monitorname, NSConfig.MonitortypeEnum type, int resptimeout, NSConfig.TimeunitsEnum units3) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_resptimeoutthresh(java.lang.String monitorname, NSConfig.MonitortypeEnum type, org.apache.axis.types.UnsignedInt resptimeoutthresh) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_retries(java.lang.String monitorname, NSConfig.MonitortypeEnum type, int retries) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_failureretries(java.lang.String monitorname, NSConfig.MonitortypeEnum type, int failureretries) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_alertretries(java.lang.String monitorname, NSConfig.MonitortypeEnum type, int alertretries) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_successretries(java.lang.String monitorname, NSConfig.MonitortypeEnum type, int successretries) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_downtime(java.lang.String monitorname, NSConfig.MonitortypeEnum type, int downtime, NSConfig.TimeunitsEnum units4) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_destip(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String destip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_destport(java.lang.String monitorname, NSConfig.MonitortypeEnum type, org.apache.axis.types.UnsignedInt destport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_state(java.lang.String monitorname, NSConfig.MonitortypeEnum type, NSConfig.EnabledisabledEnum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_reverse(java.lang.String monitorname, NSConfig.MonitortypeEnum type, NSConfig.YesnoEnum reverse) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_transparent(java.lang.String monitorname, NSConfig.MonitortypeEnum type, NSConfig.YesnoEnum transparent) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_iptunnel(java.lang.String monitorname, NSConfig.MonitortypeEnum type, NSConfig.YesnoEnum iptunnel) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_tos(java.lang.String monitorname, NSConfig.MonitortypeEnum type, NSConfig.YesnoEnum tos) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_tosid(java.lang.String monitorname, NSConfig.MonitortypeEnum type, org.apache.axis.types.UnsignedInt tosid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_secure(java.lang.String monitorname, NSConfig.MonitortypeEnum type, NSConfig.YesnoEnum secure) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_ipaddress(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_group(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String group) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_filename(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String filename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_basedn(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String basedn) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_binddn(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String binddn) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_filter(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String filter) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_attribute(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String attribute) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_database(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String database) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_sqlquery(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String sqlquery) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_evalrule(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String evalrule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_snmpoid(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String snmpoid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_snmpcommunity(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String snmpcommunity) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_snmpthreshold(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String snmpthreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_snmpversion(java.lang.String monitorname, NSConfig.MonitortypeEnum type, NSConfig.AgentversionEnum snmpversion) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_metrictable(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String metrictable) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_metric(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String metric, org.apache.axis.types.UnsignedLong metricthreshold, org.apache.axis.types.UnsignedInt metricweight) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_application(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String application) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_sitepath(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String sitepath) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_storename(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String storename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_storefrontacctservice(java.lang.String monitorname, NSConfig.MonitortypeEnum type, NSConfig.YesnoEnum storefrontacctservice) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_hostname(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String hostname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_netprofile(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String netprofile) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_mssqlprotocolversion(java.lang.String monitorname, NSConfig.MonitortypeEnum type, NSConfig.MssqlversionsEnum mssqlprotocolversion) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_originhost(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String originhost) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_originrealm(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String originrealm) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_hostipaddress(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String hostipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_vendorid(java.lang.String monitorname, NSConfig.MonitortypeEnum type, org.apache.axis.types.UnsignedInt vendorid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_productname(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String productname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_firmwarerevision(java.lang.String monitorname, NSConfig.MonitortypeEnum type, org.apache.axis.types.UnsignedInt firmwarerevision) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_authapplicationid(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String authapplicationid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_acctapplicationid(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String acctapplicationid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_inbandsecurityid(java.lang.String monitorname, NSConfig.MonitortypeEnum type, NSConfig.Inband_security_idEnum inbandsecurityid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_supportedvendorids(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String supportedvendorids) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_vendorspecificvendorid(java.lang.String monitorname, NSConfig.MonitortypeEnum type, org.apache.axis.types.UnsignedInt vendorspecificvendorid, java.lang.String vendorspecificauthapplicationids, java.lang.String vendorspecificacctapplicationids) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbmonitor_kcdaccount(java.lang.String monitorname, NSConfig.MonitortypeEnum type, java.lang.String kcdaccount) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_ipaddress(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_script(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_destport(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_netprofile(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_action(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_respcode(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_httprequest(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_rtsprequest(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_customheaders(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_maxforwards(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_sipmethod(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_sipreguri(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_send(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_recv(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_query(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_querytype(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_username(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_password(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_secondarypassword(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_logonpointname(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_lasversion(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_radkey(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_radnasid(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_radnasip(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_radaccounttype(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_radframedip(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_radapn(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_radmsisdn(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_radaccountsession(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_lrtm(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_deviation(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_scriptargs(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_validatecred(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_domain(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_dispatcherip(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_dispatcherport(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_interval(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_resptimeout(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_resptimeoutthresh(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_retries(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_failureretries(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_alertretries(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_successretries(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_downtime(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_destip(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_state(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_reverse(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_transparent(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_iptunnel(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_tos(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_tosid(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_secure(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_group(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_filename(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_basedn(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_binddn(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_filter(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_attribute(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_database(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_sqlquery(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_evalrule(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_snmpoid(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_snmpcommunity(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_snmpthreshold(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_snmpversion(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_metrictable(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_mssqlprotocolversion(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_originhost(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_originrealm(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_hostipaddress(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_vendorid(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_productname(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_firmwarerevision(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_authapplicationid(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_acctapplicationid(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_inbandsecurityid(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_supportedvendorids(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_vendorspecificvendorid(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_vendorspecificauthapplicationids(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_vendorspecificacctapplicationids(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbmonitor_kcdaccount(java.lang.String monitorname, NSConfig.MonitortypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult enablelbmonitor(java.lang.String servicename, java.lang.String servicegroupname, java.lang.String monitorname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disablelbmonitor(java.lang.String servicename, java.lang.String servicegroupname, java.lang.String monitorname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindlbmonitor_service(java.lang.String monitorname, java.lang.String servicename, NSConfig.EnabledisabledEnum state, org.apache.axis.types.UnsignedInt weight) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindlbmonitor_servicegroup(java.lang.String monitorname, java.lang.String servicegroupname, NSConfig.EnabledisabledEnum state2, org.apache.axis.types.UnsignedInt weight2) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindlbmonitor_metric(java.lang.String monitorname, java.lang.String metric, org.apache.axis.types.UnsignedLong metricthreshold, org.apache.axis.types.UnsignedInt metricweight) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindlbmonitor_service(java.lang.String monitorname, java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindlbmonitor_servicegroup(java.lang.String monitorname, java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindlbmonitor_metric(java.lang.String monitorname, java.lang.String metric) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetlbmonitorResult getlbmonitor(java.lang.String monitorname, java.lang.String type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addlbroute(java.lang.String network, java.lang.String netmask, java.lang.String gatewayname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmlbroute(java.lang.String network, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetlbrouteResult getlbroute(java.lang.String network, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addlbroute6(java.lang.String network, java.lang.String gatewayname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmlbroute6(java.lang.String network) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.Getlbroute6Result getlbroute6(java.lang.String network) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addlbvserver(java.lang.String name, NSConfig.VservicetypeEnum servicetype, java.lang.String ipaddress, org.apache.axis.types.UnsignedInt port, org.apache.axis.types.UnsignedInt range, NSConfig.EnabledisabledEnum state, java.lang.String vipheader) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmlbvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_ipaddress(java.lang.String name, java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_ippattern(java.lang.String name, java.lang.String ippattern) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_ipmask(java.lang.String name, java.lang.String ipmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_weight(java.lang.String name, org.apache.axis.types.UnsignedInt weight, java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_persistencetype(java.lang.String name, NSConfig.LbpersisttypeEnum persistencetype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_timeout(java.lang.String name, org.apache.axis.types.UnsignedInt timeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_persistencebackup(java.lang.String name, NSConfig.BkplbpersisttypeEnum persistencebackup) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_backuppersistencetimeout(java.lang.String name, org.apache.axis.types.UnsignedInt backuppersistencetimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_lbmethod(java.lang.String name, NSConfig.LbmethodEnum lbmethod, org.apache.axis.types.UnsignedInt hashlength, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_lbmethodEx(java.lang.String name, NSConfig.LbmethodEnum lbmethod, org.apache.axis.types.UnsignedInt hashlength, java.lang.String netmask, org.apache.axis.types.UnsignedInt v6Netmasklen) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_cookiename(java.lang.String name, java.lang.String cookiename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_resrule(java.lang.String name, java.lang.String resrule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_persistmask(java.lang.String name, java.lang.String persistmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_v6Persistmasklen(java.lang.String name, org.apache.axis.types.UnsignedInt v6Persistmasklen) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_pq(java.lang.String name, NSConfig.OnoffEnum pq) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_sc(java.lang.String name, NSConfig.OnoffEnum sc) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_rtspnat(java.lang.String name, NSConfig.OnoffEnum rtspnat) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_m(java.lang.String name, NSConfig.RedirmodeEnum m) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_tosid(java.lang.String name, org.apache.axis.types.UnsignedInt tosid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_datalength(java.lang.String name, org.apache.axis.types.UnsignedInt datalength) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_dataoffset(java.lang.String name, org.apache.axis.types.UnsignedInt dataoffset) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_sessionless(java.lang.String name, NSConfig.EnabledisabledEnum sessionless) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_connfailover(java.lang.String name, NSConfig.ConnfailEnum connfailover) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_backupvserver(java.lang.String name, java.lang.String backupvserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_redirecturl(java.lang.String name, java.lang.String redirecturl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_cacheable(java.lang.String name, NSConfig.YesnoEnum cacheable) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_clttimeout(java.lang.String name, org.apache.axis.types.UnsignedInt clttimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_somethod(java.lang.String name, NSConfig.SpillovermethodsEnum somethod, org.apache.axis.types.UnsignedInt sothreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_sopersistence(java.lang.String name, NSConfig.EnabledisabledEnum sopersistence) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_sopersistencetimeout(java.lang.String name, org.apache.axis.types.UnsignedInt sopersistencetimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_healththreshold(java.lang.String name, org.apache.axis.types.UnsignedInt healththreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_sobackupaction(java.lang.String name, NSConfig.SpilloverbackupactiontypeEnum sobackupaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_redirectportrewrite(java.lang.String name, NSConfig.EnabledisabledEnum redirectportrewrite) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_downstateflush(java.lang.String name, NSConfig.EnabledisabledEnum downstateflush) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_insertvserveripport(java.lang.String name, NSConfig.VipinsertEnum insertvserveripport, java.lang.String vipheader) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_disableprimaryondown(java.lang.String name, NSConfig.EnabledisabledEnum disableprimaryondown) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_authenticationhost(java.lang.String name, java.lang.String authenticationhost) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_authentication(java.lang.String name, NSConfig.OnoffEnum authentication) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_authn401(java.lang.String name, NSConfig.OnoffEnum authn401) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_authnvsname(java.lang.String name, java.lang.String authnvsname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_push(java.lang.String name, NSConfig.EnabledisabledEnum push) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_pushvserver(java.lang.String name, java.lang.String pushvserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_pushlabel(java.lang.String name, java.lang.String pushlabel) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_pushmulticlients(java.lang.String name, NSConfig.YesnoEnum pushmulticlients) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_listenpolicy(java.lang.String name, java.lang.String listenpolicy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_listenpriority(java.lang.String name, org.apache.axis.types.UnsignedInt listenpriority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_tcpprofile(java.lang.String name, java.lang.String tcpprofilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_httpprofile(java.lang.String name, java.lang.String httpprofilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_dbprofile(java.lang.String name, java.lang.String dbprofilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_l2Conn(java.lang.String name, NSConfig.OnoffEnum l2Conn) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_oracleserverversion(java.lang.String name, NSConfig.OracleversionsEnum oracleserverversion) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_mssqlserverversion(java.lang.String name, NSConfig.MssqlversionsEnum mssqlserverversion) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_mysqlprotocolversion(java.lang.String name, org.apache.axis.types.UnsignedInt mysqlprotocolversion) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_mysqlserverversion(java.lang.String name, java.lang.String mysqlserverversion) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_mysqlcharacterset(java.lang.String name, org.apache.axis.types.UnsignedInt mysqlcharacterset) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_mysqlservercapabilities(java.lang.String name, org.apache.axis.types.UnsignedInt mysqlservercapabilities) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_appflowlog(java.lang.String name, NSConfig.EnabledisabledEnum appflowlog) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_netprofile(java.lang.String name, java.lang.String netprofile) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_icmpvsrresponse(java.lang.String name, NSConfig.IcmpvsrresponseEnum icmpvsrresponse) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_newservicerequest(java.lang.String name, org.apache.axis.types.UnsignedInt newservicerequest, NSConfig.NewreqtypesEnum newservicerequestunit) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_newservicerequestincrementinterval(java.lang.String name, org.apache.axis.types.UnsignedInt newservicerequestincrementinterval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_minautoscalemembers(java.lang.String name, org.apache.axis.types.UnsignedInt minautoscalemembers) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_maxautoscalemembers(java.lang.String name, org.apache.axis.types.UnsignedInt maxautoscalemembers) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_persistavpno(java.lang.String name, java.lang.String persistavpno) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_skippersistency(java.lang.String name, NSConfig.BrEnum skippersistency) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_authnprofile(java.lang.String name, java.lang.String authnprofile) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_macmoderetainvlan(java.lang.String name, NSConfig.EnabledisabledEnum macmoderetainvlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_dbslb(java.lang.String name, NSConfig.EnabledisabledEnum dbslb) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_dns64(java.lang.String name, NSConfig.Enabledisabled2Enum dns64) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_bypassaaaa(java.lang.String name, NSConfig.YesnoEnum bypassaaaa) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbvserver_recursionavailable(java.lang.String name, NSConfig.YesnoEnum recursionavailable) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_backupvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_clttimeout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_redirecturl(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_redirecturl2(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_authn401(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_authentication(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_authenticationhost(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_authnvsname(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_pushvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_pushlabel(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_tcpprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_httpprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_dbprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_rule(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_sothreshold(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_l2Conn(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_mysqlprotocolversion(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_mysqlserverversion(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_mysqlcharacterset(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_mysqlservercapabilities(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_appflowlog(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_netprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_icmpvsrresponse(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_skippersistency(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_minautoscalemembers(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_maxautoscalemembers(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_authnprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_macmoderetainvlan(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_dbslb(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_servicename(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_persistencetype(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_timeout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_persistencebackup(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_backuppersistencetimeout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_lbmethod(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_hashlength(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_netmask(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_v6Netmasklen(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_cookiename(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_resrule(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_persistmask(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_v6Persistmasklen(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_pq(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_sc(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_rtspnat(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_m(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_tosid(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_datalength(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_dataoffset(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_sessionless(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_connfailover(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_cacheable(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_somethod(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_sopersistence(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_sopersistencetimeout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_healththreshold(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_sobackupaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_redirectportrewrite(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_downstateflush(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_insertvserveripport(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_vipheader(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_disableprimaryondown(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_push(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_pushmulticlients(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_listenpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_listenpriority(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_comment(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_oracleserverversion(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_mssqlserverversion(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_newservicerequest(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_newservicerequestunit(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_newservicerequestincrementinterval(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_persistavpno(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbvserver_recursionavailable(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindlbvserver_service(java.lang.String name, java.lang.String servicename, org.apache.axis.types.UnsignedInt weight) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindlbvserver_servicegroup(java.lang.String name, java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindlbvserver_policy(java.lang.String name, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, java.lang.String gotopriorityexpression, NSConfig.VserverbindpointEnum type, boolean invoke, NSConfig.PolicylabelinvoketypeEnum labeltype, java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindlbvserver_service(java.lang.String name, java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindlbvserver_servicegroup(java.lang.String name, java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindlbvserver_policy(java.lang.String name, java.lang.String policyname, NSConfig.VserverbindpointEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindlbvserver_priority(java.lang.String name, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult enablelbvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disablelbvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetlbvserverResult getlbvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renamelbvserver(java.lang.String name, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addlbmetrictable(java.lang.String metrictable) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmlbmetrictable(java.lang.String metrictable) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindlbmetrictable_metric(java.lang.String metrictable, java.lang.String metric, java.lang.String snmpoid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindlbmetrictable_metric(java.lang.String metrictable, java.lang.String metric) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetlbmetrictableResult getlbmetrictable(java.lang.String metrictable) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult addlbwlm(java.lang.String wlmname, java.lang.String ipaddress, org.apache.axis.types.UnsignedInt port, java.lang.String lbuid) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult rmlbwlm(java.lang.String wlmname) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setlbwlm_katimeout(java.lang.String wlmname, org.apache.axis.types.UnsignedInt katimeout) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetlbwlm_katimeout(java.lang.String wlmname) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.GetlbwlmResult getlbwlm(java.lang.String wlmname) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult bindlbwlm_vserver(java.lang.String wlmname, java.lang.String vservername) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unbindlbwlm_vserver(java.lang.String wlmname, java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetlbmonbindingsResult getlbmonbindings(java.lang.String monitorname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetlbpersistentsessionsResult getlbpersistentsessions(java.lang.String vserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult clearlbpersistentsessions(java.lang.String vserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbgroup_persistencetype(java.lang.String name, NSConfig.GrppersisttypeEnum persistencetype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbgroup_persistencebackup(java.lang.String name, NSConfig.GrpbkppersisttypeEnum persistencebackup) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbgroup_backuppersistencetimeout(java.lang.String name, org.apache.axis.types.UnsignedInt backuppersistencetimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbgroup_persistmask(java.lang.String name, java.lang.String persistmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbgroup_cookiename(java.lang.String name, java.lang.String cookiename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbgroup_v6Persistmasklen(java.lang.String name, org.apache.axis.types.UnsignedInt v6Persistmasklen) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbgroup_cookiedomain(java.lang.String name, java.lang.String cookiedomain) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbgroup_timeout(java.lang.String name, org.apache.axis.types.UnsignedInt timeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbgroup_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbgroup_persistencetype(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbgroup_persistencebackup(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbgroup_backuppersistencetimeout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbgroup_persistmask(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbgroup_cookiename(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbgroup_v6Persistmasklen(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbgroup_cookiedomain(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbgroup_timeout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbgroup_rule(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindlbgroup_vserver(java.lang.String name, java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindlbgroup_vserver(java.lang.String name, java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetlbgroupResult getlbgroup(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renamelbgroup(java.lang.String name, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbsipparameters_rnatsrcport(org.apache.axis.types.UnsignedInt rnatsrcport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbsipparameters_rnatdstport(org.apache.axis.types.UnsignedInt rnatdstport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbsipparameters_retrydur(int retrydur) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbsipparameters_addrportvip(NSConfig.EnabledisabledEnum addrportvip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbsipparameters_sip503Ratethreshold(org.apache.axis.types.UnsignedInt sip503Ratethreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbsipparameters_rnatsrcport() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbsipparameters_rnatdstport() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbsipparameters_retrydur() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbsipparameters_addrportvip() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbsipparameters_sip503Ratethreshold() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetlbsipparametersResult getlbsipparameters() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbparameter_httponlycookieflag(NSConfig.EnabledisabledEnum httponlycookieflag) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbparameter_consolidatedlconn(NSConfig.YesnoEnum consolidatedlconn) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbparameter_useportforhashlb(NSConfig.YesnoEnum useportforhashlb) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbparameter_preferdirectroute(NSConfig.YesnoEnum preferdirectroute) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbparameter_startuprrfactor(org.apache.axis.types.UnsignedInt startuprrfactor) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbparameter_monitorskipmaxclient(NSConfig.EnabledisabledEnum monitorskipmaxclient) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbparameter_monitorconnectionclose(NSConfig.FinresetEnum monitorconnectionclose) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlbparameter_vserverspecificmac(NSConfig.EnabledisabledEnum vserverspecificmac) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbparameter_httponlycookieflag() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbparameter_consolidatedlconn() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbparameter_useportforhashlb() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbparameter_preferdirectroute() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbparameter_startuprrfactor() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbparameter_monitorskipmaxclient() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbparameter_monitorconnectionclose() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetlbparameter_vserverspecificmac() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetlbparameterResult getlbparameter() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addarp(java.lang.String ipaddress, java.lang.String mac, java.lang.String ifnum) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addarpEx(java.lang.String ipaddress, java.lang.String mac, java.lang.String ifnum, org.apache.axis.types.UnsignedInt ownernode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmarp(java.lang.String ipaddress, boolean all) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmarpEx(java.lang.String ipaddress, boolean all, org.apache.axis.types.UnsignedInt ownernode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult sendarp(java.lang.String ipaddress, boolean all) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetarpResult getarp(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetarpResult getarpEx(java.lang.String ipaddress, org.apache.axis.types.UnsignedInt ownernode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addchannel(java.lang.String id, java.lang.String ifnum) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmchannel(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setchannel_state(java.lang.String id, NSConfig.EnabledisabledifEnum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setchannel_mode(java.lang.String id, NSConfig.LamodeEnum mode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setchannel_conndistr(java.lang.String id, NSConfig.LaconndistrEnum conndistr) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setchannel_macdistr(java.lang.String id, NSConfig.LamacdistrEnum macdistr) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setchannel_lamac(java.lang.String id, java.lang.String lamac) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setchannel_speed(java.lang.String id, NSConfig.IfspeedEnum speed) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setchannel_flowcontrol(java.lang.String id, NSConfig.FlowcontrolEnum flowcontrol) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setchannel_hamonitor(java.lang.String id, NSConfig.IfmonitortypeEnum hamonitor) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setchannel_tagall(java.lang.String id, NSConfig.TrunktypeEnum tagall) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setchannel_trunk(java.lang.String id, NSConfig.TrunktypeEnum trunk) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setchannel_ifalias(java.lang.String id, java.lang.String ifalias) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setchannel_throughput(java.lang.String id, org.apache.axis.types.UnsignedInt throughput) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setchannel_lrminthroughput(java.lang.String id, org.apache.axis.types.UnsignedInt lrminthroughput) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setchannel_bandwidthhigh(java.lang.String id, org.apache.axis.types.UnsignedInt bandwidthhigh, org.apache.axis.types.UnsignedInt bandwidthnormal) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetchannel_state(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetchannel_mode(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetchannel_conndistr(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetchannel_macdistr(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetchannel_speed(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetchannel_flowcontrol(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetchannel_hamonitor(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetchannel_tagall(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetchannel_trunk(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetchannel_ifalias(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetchannel_throughput(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetchannel_lrminthroughput(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetchannel_bandwidthhigh(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetchannel_bandwidthnormal(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindchannel_ifnum(java.lang.String id, java.lang.String ifnum) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindchannel_ifnum(java.lang.String id, java.lang.String ifnum) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetchannelResult getchannel(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addfis(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmfis(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindfis_ifnum(java.lang.String name, java.lang.String ifnum) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindfis_ifnum(java.lang.String name, java.lang.String ifnum) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetfisResult getfis(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addroute(java.lang.String network, java.lang.String netmask, java.lang.String gateway, org.apache.axis.types.UnsignedInt cost, NSConfig.LaconndistrEnum advertise, NSConfig.RtprotocoloptionsEnum protocol) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult clearroute(NSConfig.ClearrtoptionsEnum routetype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmroute(java.lang.String network, java.lang.String netmask, java.lang.String gateway) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setroute_distance(java.lang.String network, java.lang.String netmask, java.lang.String gateway, org.apache.axis.types.UnsignedInt distance) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setroute_cost(java.lang.String network, java.lang.String netmask, java.lang.String gateway, org.apache.axis.types.UnsignedInt cost) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setroute_weight(java.lang.String network, java.lang.String netmask, java.lang.String gateway, org.apache.axis.types.UnsignedInt weight) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setroute_advertise(java.lang.String network, java.lang.String netmask, java.lang.String gateway, NSConfig.LaconndistrEnum advertise) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setroute_protocol(java.lang.String network, java.lang.String netmask, java.lang.String gateway, NSConfig.RtprotocoloptionsEnum protocol) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setroute_msr(java.lang.String network, java.lang.String netmask, java.lang.String gateway, NSConfig.EnabledisabledEnum msr, java.lang.String monitor) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetroute_advertise(java.lang.String network, java.lang.String netmask, java.lang.String gateway) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetroute_distance(java.lang.String network, java.lang.String netmask, java.lang.String gateway) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetroute_cost(java.lang.String network, java.lang.String netmask, java.lang.String gateway) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetroute_weight(java.lang.String network, java.lang.String netmask, java.lang.String gateway) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetroute_protocol(java.lang.String network, java.lang.String netmask, java.lang.String gateway) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetroute_msr(java.lang.String network, java.lang.String netmask, java.lang.String gateway) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetroute_monitor(java.lang.String network, java.lang.String netmask, java.lang.String gateway) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetrouteResult getroute(java.lang.String network, java.lang.String netmask, java.lang.String gateway, java.lang.String routetype, boolean detail) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addvlan(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmvlan(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvlan_aliasname(org.apache.axis.types.UnsignedInt id, java.lang.String aliasname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvlan_ipv6Dynamicrouting(org.apache.axis.types.UnsignedInt id, NSConfig.EnabledisabledEnum ipv6Dynamicrouting) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvlan_aliasname(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvlan_ipv6Dynamicrouting(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindvlan_ifnum(org.apache.axis.types.UnsignedInt id, java.lang.String ifnum, boolean tagged) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindvlan_ipaddress(org.apache.axis.types.UnsignedInt id, java.lang.String ipaddress, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindvlan_ifnum(org.apache.axis.types.UnsignedInt id, java.lang.String ifnum, boolean tagged) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindvlan_ipaddress(org.apache.axis.types.UnsignedInt id, java.lang.String ipaddress, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetvlanResult getvlan(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addvrid(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmvrid(org.apache.axis.types.UnsignedInt id, boolean all) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvrid_priority(org.apache.axis.types.UnsignedInt id, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvrid_preemption(org.apache.axis.types.UnsignedInt id, NSConfig.EnabledisabledEnum preemption) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvrid_sharing(org.apache.axis.types.UnsignedInt id, NSConfig.EnabledisabledEnum sharing) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvrid_tracking(org.apache.axis.types.UnsignedInt id, NSConfig.TrackingEnum tracking) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvrid_priority(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvrid_preemption(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvrid_sharing(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvrid_tracking(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindvrid_ifnum(org.apache.axis.types.UnsignedInt id, java.lang.String ifnum) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindvrid_ifnum(org.apache.axis.types.UnsignedInt id, java.lang.String ifnum) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetvridResult getvrid(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addvrid6(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmvrid6(org.apache.axis.types.UnsignedInt id, boolean all) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindvrid6_ifnum(org.apache.axis.types.UnsignedInt id, java.lang.String ifnum) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindvrid6_ifnum(org.apache.axis.types.UnsignedInt id, java.lang.String ifnum) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.Getvrid6Result getvrid6(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addroute6(java.lang.String network, java.lang.String gateway, org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult clearroute6(NSConfig.Clearrt6OptionsEnum routetype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmroute6(java.lang.String network, java.lang.String gateway, org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setroute6_weight(java.lang.String network, java.lang.String gateway, org.apache.axis.types.UnsignedInt vlan, org.apache.axis.types.UnsignedInt weight) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setroute6_distance(java.lang.String network, java.lang.String gateway, org.apache.axis.types.UnsignedInt vlan, org.apache.axis.types.UnsignedInt distance) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setroute6_cost(java.lang.String network, java.lang.String gateway, org.apache.axis.types.UnsignedInt vlan, org.apache.axis.types.UnsignedInt cost) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setroute6_advertise(java.lang.String network, java.lang.String gateway, org.apache.axis.types.UnsignedInt vlan, NSConfig.LaconndistrEnum advertise) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setroute6_msr(java.lang.String network, java.lang.String gateway, org.apache.axis.types.UnsignedInt vlan, NSConfig.EnabledisabledEnum msr, java.lang.String monitor) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetroute6_weight(java.lang.String network, java.lang.String gateway, org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetroute6_distance(java.lang.String network, java.lang.String gateway, org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetroute6_cost(java.lang.String network, java.lang.String gateway, org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetroute6_advertise(java.lang.String network, java.lang.String gateway, org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetroute6_msr(java.lang.String network, java.lang.String gateway, org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetroute6_monitor(java.lang.String network, java.lang.String gateway, org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.Getroute6Result getroute6(java.lang.String network, java.lang.String gateway, org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.Getroute6Result getroute6Ex(java.lang.String network, java.lang.String gateway, org.apache.axis.types.UnsignedInt vlan, java.lang.String routetype, boolean detail) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addnd6(java.lang.String neighbor, java.lang.String mac, java.lang.String ifnum, int vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult clearnd6() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmnd6(java.lang.String neighbor, int vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.Getnd6Result getnd6() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.Getnd6Result getnd6Ex(java.lang.String neighbor) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addinat(java.lang.String name, java.lang.String publicip, java.lang.String privateip, NSConfig.EnabledisabledEnum tcpproxy, NSConfig.EnabledisabledEnum ftp, NSConfig.OnoffEnum usip, NSConfig.OnoffEnum usnip, java.lang.String proxyip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rminat(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinat_privateip(java.lang.String name, java.lang.String privateip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinat_tcpproxy(java.lang.String name, NSConfig.EnabledisabledEnum tcpproxy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinat_ftp(java.lang.String name, NSConfig.EnabledisabledEnum ftp) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinat_tftp(java.lang.String name, NSConfig.EnabledisabledEnum tftp) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinat_usip(java.lang.String name, NSConfig.OnoffEnum usip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinat_usnip(java.lang.String name, NSConfig.OnoffEnum usnip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinat_proxyip(java.lang.String name, java.lang.String proxyip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinat_mode(java.lang.String name, NSConfig.InatmodeEnum mode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetinat_tcpproxy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetinat_ftp(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetinat_tftp(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetinat_usip(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetinat_usnip(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetinat_proxyip(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetinat_mode(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetinatResult getinat(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addbridgegroup(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmbridgegroup(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setbridgegroup_ipv6Dynamicrouting(org.apache.axis.types.UnsignedInt id, NSConfig.EnabledisabledEnum ipv6Dynamicrouting) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetbridgegroup_ipv6Dynamicrouting(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindbridgegroup_vlan(org.apache.axis.types.UnsignedInt id, org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindbridgegroup_ipaddress(org.apache.axis.types.UnsignedInt id, java.lang.String ipaddress, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindbridgegroup_vlan(org.apache.axis.types.UnsignedInt id, org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindbridgegroup_ipaddress(org.apache.axis.types.UnsignedInt id, java.lang.String ipaddress, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetbridgegroupResult getbridgegroup(org.apache.axis.types.UnsignedInt id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addiptunnel(java.lang.String name, java.lang.String remote, java.lang.String remotesubnetmask, java.lang.String local, NSConfig.IptunnelsEnum protocol) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addiptunnelEx(java.lang.String name, java.lang.String remote, java.lang.String remotesubnetmask, java.lang.String local, NSConfig.IptunnelsEnum protocol, java.lang.String ipsecprofilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmiptunnel(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetiptunnelResult getiptunnel(java.lang.String remote, java.lang.String remotesubnetmask, java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addip6Tunnel(java.lang.String name, java.lang.String remote, java.lang.String local) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmip6Tunnel(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.Getip6TunnelResult getip6Tunnel(java.lang.String name, java.lang.String remote) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addnetbridge(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmnetbridge(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnetbridgeResult getnetbridge(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindnetbridge_tunnel(java.lang.String name, java.lang.String tunnel) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindnetbridge_vlan(java.lang.String name, org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindnetbridge_ipaddress(java.lang.String name, java.lang.String ipaddress, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindnetbridge_tunnel(java.lang.String name, java.lang.String tunnel) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindnetbridge_vlan(java.lang.String name, org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindnetbridge_ipaddress(java.lang.String name, java.lang.String ipaddress, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addipset(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmipset(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindipset_ipaddress(java.lang.String name, java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindipset_ipaddress(java.lang.String name, java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetipsetResult getipset(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addlinkset(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmlinkset(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindlinkset_ifnum(java.lang.String id, java.lang.String ifnum) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindlinkset_ifnum(java.lang.String id, java.lang.String ifnum) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetlinksetResult getlinkset(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addnetprofile(java.lang.String name, java.lang.String srcip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmnetprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnetprofile_srcip(java.lang.String name, java.lang.String srcip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnetprofile_srcip(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnetprofileResult getnetprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setarpparam_timeout(org.apache.axis.types.UnsignedInt timeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setarpparam_spoofvalidation(NSConfig.EnabledisabledEnum spoofvalidation) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetarpparam_timeout() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetarpparam_spoofvalidation() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetarpparamResult getarpparam() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetciResult getci() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult clearinterface(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinterface_speed(java.lang.String id, NSConfig.IfspeedEnum speed) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinterface_duplex(java.lang.String id, NSConfig.IfduplexEnum duplex) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinterface_flowcontrol(java.lang.String id, NSConfig.FlowcontrolEnum flowcontrol) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinterface_autoneg(java.lang.String id, NSConfig.LaconndistrEnum autoneg) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinterface_hamonitor(java.lang.String id, NSConfig.IfmonitortypeEnum hamonitor) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinterface_tagall(java.lang.String id, NSConfig.TrunktypeEnum tagall) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinterface_trunk(java.lang.String id, NSConfig.TrunktypeEnum trunk) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinterface_lacpmode(java.lang.String id, NSConfig.LacpmodeEnum lacpmode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinterface_lacpkey(java.lang.String id, org.apache.axis.types.UnsignedInt lacpkey) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinterface_lagtype(java.lang.String id, NSConfig.LagtypeEnum lagtype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinterface_lacppriority(java.lang.String id, org.apache.axis.types.UnsignedInt lacppriority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinterface_lacptimeout(java.lang.String id, NSConfig.LacptimeoutEnum lacptimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinterface_ifalias(java.lang.String id, java.lang.String ifalias) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinterface_throughput(java.lang.String id, org.apache.axis.types.UnsignedInt throughput) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinterface_bandwidthhigh(java.lang.String id, org.apache.axis.types.UnsignedInt bandwidthhigh, org.apache.axis.types.UnsignedInt bandwidthnormal) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetinterface_speed(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetinterface_duplex(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetinterface_flowcontrol(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetinterface_autoneg(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetinterface_hamonitor(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetinterface_tagall(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetinterface_trunk(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetinterface_lacpmode(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetinterface_lacpkey(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetinterface_lacppriority(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetinterface_lacptimeout(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetinterface_ifalias(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetinterface_throughput(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetinterface_bandwidthhigh(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetinterface_bandwidthnormal(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult enableinterface(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disableinterface(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult resetinterface(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetinterfaceResult getinterface(java.lang.String id) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult clearrnat(java.lang.String network, java.lang.String netmask, java.lang.String aclname, boolean redirectport, java.lang.String natip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setrnat_network(java.lang.String network, java.lang.String netmask, java.lang.String natip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setrnat_aclname(java.lang.String aclname, org.apache.axis.types.UnsignedInt redirectport, java.lang.String natip2) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetrnat_network() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetrnat_aclname() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetrnat_natip() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetrnatResult getrnat() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setbridgetable_bridgeage(org.apache.axis.types.UnsignedInt bridgeage) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetbridgetable_bridgeage() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetbridgetableResult getbridgetable() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult clearbridgetable(org.apache.axis.types.UnsignedInt vlan, java.lang.String ifnum) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setlacp_syspriority(org.apache.axis.types.UnsignedInt syspriority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetlacpResult getlacp() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setrnatparam_tcpproxy(NSConfig.EnabledisabledEnum tcpproxy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetrnatparam_tcpproxy() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetrnatparamResult getrnatparam() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvridparam_sendtomaster(NSConfig.EnabledisabledEnum sendtomaster) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvridparam_sendtomaster() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetvridparamResult getvridparam() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnd6Ravariables_ceaserouteradv(org.apache.axis.types.UnsignedInt vlan, NSConfig.YesnoEnum ceaserouteradv) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnd6Ravariables_sendrouteradv(org.apache.axis.types.UnsignedInt vlan, NSConfig.YesnoEnum sendrouteradv) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnd6Ravariables_srclinklayeraddroption(org.apache.axis.types.UnsignedInt vlan, NSConfig.YesnoEnum srclinklayeraddroption) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnd6Ravariables_onlyunicastrtadvresponse(org.apache.axis.types.UnsignedInt vlan, NSConfig.YesnoEnum onlyunicastrtadvresponse) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnd6Ravariables_managedaddrconfig(org.apache.axis.types.UnsignedInt vlan, NSConfig.YesnoEnum managedaddrconfig) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnd6Ravariables_otheraddrconfig(org.apache.axis.types.UnsignedInt vlan, NSConfig.YesnoEnum otheraddrconfig) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnd6Ravariables_currhoplimit(org.apache.axis.types.UnsignedInt vlan, org.apache.axis.types.UnsignedInt currhoplimit) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnd6Ravariables_maxrtadvinterval(org.apache.axis.types.UnsignedInt vlan, org.apache.axis.types.UnsignedInt maxrtadvinterval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnd6Ravariables_minrtadvinterval(org.apache.axis.types.UnsignedInt vlan, org.apache.axis.types.UnsignedInt minrtadvinterval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnd6Ravariables_linkmtu(org.apache.axis.types.UnsignedInt vlan, org.apache.axis.types.UnsignedInt linkmtu) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnd6Ravariables_reachabletime(org.apache.axis.types.UnsignedInt vlan, org.apache.axis.types.UnsignedInt reachabletime) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnd6Ravariables_retranstime(org.apache.axis.types.UnsignedInt vlan, org.apache.axis.types.UnsignedInt retranstime) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnd6Ravariables_defaultlifetime(org.apache.axis.types.UnsignedInt vlan, int defaultlifetime) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnd6Ravariables_ceaserouteradv(org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnd6Ravariables_sendrouteradv(org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnd6Ravariables_srclinklayeraddroption(org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnd6Ravariables_onlyunicastrtadvresponse(org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnd6Ravariables_managedaddrconfig(org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnd6Ravariables_otheraddrconfig(org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnd6Ravariables_currhoplimit(org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnd6Ravariables_maxrtadvinterval(org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnd6Ravariables_minrtadvinterval(org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnd6Ravariables_linkmtu(org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnd6Ravariables_reachabletime(org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnd6Ravariables_retranstime(org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnd6Ravariables_defaultlifetime(org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.Getnd6RavariablesResult getnd6Ravariables(org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindnd6Ravariables_ipv6Prefix(org.apache.axis.types.UnsignedInt vlan, java.lang.String ipv6Prefix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindnd6Ravariables_ipv6Prefix(org.apache.axis.types.UnsignedInt vlan, java.lang.String ipv6Prefix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addonlinkipv6Prefix(java.lang.String ipv6Prefix, NSConfig.YesnoEnum onlinkprefix, NSConfig.YesnoEnum autonomusprefix, NSConfig.YesnoEnum depricateprefix, NSConfig.YesnoEnum decrementprefixlifetimes, org.apache.axis.types.UnsignedInt prefixvalidelifetime, org.apache.axis.types.UnsignedInt prefixpreferredlifetime) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmonlinkipv6Prefix(java.lang.String ipv6Prefix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setonlinkipv6Prefix_onlinkprefix(java.lang.String ipv6Prefix, NSConfig.YesnoEnum onlinkprefix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setonlinkipv6Prefix_autonomusprefix(java.lang.String ipv6Prefix, NSConfig.YesnoEnum autonomusprefix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setonlinkipv6Prefix_depricateprefix(java.lang.String ipv6Prefix, NSConfig.YesnoEnum depricateprefix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setonlinkipv6Prefix_decrementprefixlifetimes(java.lang.String ipv6Prefix, NSConfig.YesnoEnum decrementprefixlifetimes) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setonlinkipv6Prefix_prefixvalidelifetime(java.lang.String ipv6Prefix, org.apache.axis.types.UnsignedInt prefixvalidelifetime) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setonlinkipv6Prefix_prefixpreferredlifetime(java.lang.String ipv6Prefix, org.apache.axis.types.UnsignedInt prefixpreferredlifetime) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetonlinkipv6Prefix_onlinkprefix(java.lang.String ipv6Prefix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetonlinkipv6Prefix_autonomusprefix(java.lang.String ipv6Prefix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetonlinkipv6Prefix_depricateprefix(java.lang.String ipv6Prefix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetonlinkipv6Prefix_decrementprefixlifetimes(java.lang.String ipv6Prefix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetonlinkipv6Prefix_prefixvalidelifetime(java.lang.String ipv6Prefix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetonlinkipv6Prefix_prefixpreferredlifetime(java.lang.String ipv6Prefix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.Getonlinkipv6PrefixResult getonlinkipv6Prefix(java.lang.String ipv6Prefix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setipv6_ralearning(NSConfig.EnabledisabledEnum ralearning) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setipv6_routerredirection(NSConfig.EnabledisabledEnum routerredirection) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setipv6_ndbasereachtime(org.apache.axis.types.UnsignedInt ndbasereachtime) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setipv6_ndretransmissiontime(org.apache.axis.types.UnsignedInt ndretransmissiontime) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setipv6_natprefix(java.lang.String natprefix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setipv6_dodad(NSConfig.EnabledisabledEnum dodad) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetipv6_ralearning() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetipv6_routerredirection() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetipv6_ndbasereachtime() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetipv6_ndretransmissiontime() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetipv6_natprefix() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetipv6_dodad() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.Getipv6Result getipv6() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setiptunnelparam_srcip(java.lang.String srcip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setiptunnelparam_dropfrag(NSConfig.YesnoEnum dropfrag) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setiptunnelparam_dropfragcputhreshold(org.apache.axis.types.UnsignedInt dropfragcputhreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setiptunnelparam_srciproundrobin(NSConfig.YesnoEnum srciproundrobin) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetiptunnelparam_srcip() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetiptunnelparam_dropfrag() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetiptunnelparam_dropfragcputhreshold() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetiptunnelparam_srciproundrobin() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetiptunnelparamResult getiptunnelparam() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setip6Tunnelparam_srcip(java.lang.String srcip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setip6Tunnelparam_dropfrag(NSConfig.YesnoEnum dropfrag) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setip6Tunnelparam_dropfragcputhreshold(org.apache.axis.types.UnsignedInt dropfragcputhreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setip6Tunnelparam_srciproundrobin(NSConfig.YesnoEnum srciproundrobin) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetip6Tunnelparam_srcip() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetip6Tunnelparam_dropfrag() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetip6Tunnelparam_dropfragcputhreshold() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetip6Tunnelparam_srciproundrobin() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.Getip6TunnelparamResult getip6Tunnelparam() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl2Param_mbfpeermacupdate(org.apache.axis.types.UnsignedInt mbfpeermacupdate) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl2Param_maxbridgecollision(org.apache.axis.types.UnsignedInt maxbridgecollision) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl2Param_bdggrpproxyarp(NSConfig.EnabledisabledEnum bdggrpproxyarp) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl2Param_bdgsetting(NSConfig.EnabledisabledEnum bdgsetting) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl2Param_garponvridintf(NSConfig.EnabledisabledEnum garponvridintf) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl2Param_macmodefwdmypkt(NSConfig.EnabledisabledEnum macmodefwdmypkt) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl2Param_usemymac(NSConfig.EnabledisabledEnum usemymac) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl2Param_proxyarp(NSConfig.EnabledisabledEnum proxyarp) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl2Param_garpreply(NSConfig.EnabledisabledEnum garpreply) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl2Param_mbfinstlearning(NSConfig.EnabledisabledEnum mbfinstlearning) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl2Param_rstintfonhafo(NSConfig.EnabledisabledEnum rstintfonhafo) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl2Param_skipproxyingbsdtraffic(NSConfig.EnabledisabledEnum skipproxyingbsdtraffic) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl2Param_returntoethernetsender(NSConfig.EnabledisabledEnum returntoethernetsender) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl2Param_mbfpeermacupdate() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl2Param_maxbridgecollision() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl2Param_bdggrpproxyarp() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl2Param_bdgsetting() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl2Param_garponvridintf() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl2Param_macmodefwdmypkt() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl2Param_usemymac() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl2Param_proxyarp() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl2Param_garpreply() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl2Param_mbfinstlearning() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl2Param_rstintfonhafo() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl2Param_skipproxyingbsdtraffic() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl2Param_returntoethernetsender() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.Getl2ParamResult getl2Param() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl3Param_srcnat(NSConfig.EnabledisabledEnum srcnat) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl3Param_icmpgenratethreshold(org.apache.axis.types.UnsignedInt icmpgenratethreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl3Param_overridernat(NSConfig.EnabledisabledEnum overridernat) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl3Param_dropdfflag(NSConfig.EnabledisabledEnum dropdfflag) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl3Param_miproundrobin(NSConfig.EnabledisabledEnum miproundrobin) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl3Param_externalloopback(NSConfig.EnabledisabledEnum externalloopback) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl3Param_tnlpmtuwoconn(NSConfig.EnabledisabledEnum tnlpmtuwoconn) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl3Param_usipserverstraypkt(NSConfig.EnabledisabledEnum usipserverstraypkt) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl3Param_forwardicmpfragments(NSConfig.EnabledisabledEnum forwardicmpfragments) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl3Param_dropipfragments(NSConfig.EnabledisabledEnum dropipfragments) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl3Param_acllogtime(org.apache.axis.types.UnsignedInt acllogtime) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl3Param_icmperrgenerate(NSConfig.EnabledisabledEnum icmperrgenerate) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl3Param_srcnat() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl3Param_icmpgenratethreshold() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl3Param_overridernat() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl3Param_dropdfflag() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl3Param_miproundrobin() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl3Param_externalloopback() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl3Param_tnlpmtuwoconn() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl3Param_usipserverstraypkt() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl3Param_forwardicmpfragments() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl3Param_dropipfragments() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl3Param_acllogtime() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl3Param_icmperrgenerate() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.Getl3ParamResult getl3Param() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addforwardingsession(java.lang.String name, java.lang.String network, java.lang.String netmask, java.lang.String aclname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addforwardingsessionEx(java.lang.String name, java.lang.String network, java.lang.String netmask, java.lang.String acl6Name, java.lang.String aclname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setforwardingsession_connfailover(java.lang.String name, NSConfig.EnabledisabledEnum connfailover) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmforwardingsession(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetforwardingsessionResult getforwardingsession(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setptp_state(NSConfig.PtpstateEnum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetptpResult getptp() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addrnat6(java.lang.String name, java.lang.String network, java.lang.String acl6Name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindrnat6_natip6(java.lang.String name, java.lang.String natip6) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindrnat6_natip6(java.lang.String name, java.lang.String natip6) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setrnat6_redirectport(java.lang.String name, org.apache.axis.types.UnsignedInt redirectport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetrnat6_redirectport(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult clearrnat6(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.Getrnat6Result getrnat6(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinatparam_nat46V6Prefix(java.lang.String nat46V6Prefix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinatparam_nat46Ignoretos(NSConfig.YesnoEnum nat46Ignoretos) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinatparam_nat46Zerochecksum(NSConfig.EnabledisabledEnum nat46Zerochecksum) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinatparam_nat46V6Mtu(org.apache.axis.types.UnsignedInt nat46V6Mtu) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setinatparam_nat46Fragheader(NSConfig.EnabledisabledEnum nat46Fragheader) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetinatparam_nat46V6Prefix() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetinatparamResult getinatparam() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addnat64(java.lang.String name, java.lang.String acl6Name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnat64_acl6Name(java.lang.String name, java.lang.String acl6Name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnat64_netprofile(java.lang.String name, java.lang.String netprofile) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnat64_netprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmnat64(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.Getnat64Result getnat64(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setrsskeytype_rsstype(NSConfig.RsskeytypeEnum rsstype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetrsskeytypeResult getrsskeytype() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl4Param_l2Connmethod(NSConfig.L2ConnmethodEnum l2Connmethod) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setl4Param_l4Switch(NSConfig.EnabledisabledEnum l4Switch) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl4Param_l2Connmethod() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetl4Param_l4Switch() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.Getl4ParamResult getl4Param() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addvpath(java.lang.String name, java.lang.String destip, java.lang.String netmask, java.lang.String gateway) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmvpath(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetvpathResult getvpath(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpathparam_srcip(java.lang.String srcip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpathparam_srcip() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetvpathparamResult getvpathparam() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult reboot() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rebootEx(boolean warm) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult logout() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult loginchallengeresponse(java.lang.String response) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult login(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult loginEx(java.lang.String username, java.lang.String password, java.lang.String ns) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addnslimitidentifier(java.lang.String limitidentifier) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmnslimitidentifier(java.lang.String limitidentifier) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnslimitidentifier_threshold(java.lang.String limitidentifier, org.apache.axis.types.UnsignedInt threshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnslimitidentifier_timeslice(java.lang.String limitidentifier, org.apache.axis.types.UnsignedInt timeslice) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnslimitidentifier_mode(java.lang.String limitidentifier, NSConfig.RatelimitmodeEnum mode, NSConfig.RatelimitratetypeEnum limittype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnslimitidentifier_selector(java.lang.String limitidentifier, java.lang.String selectorname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnslimitidentifier_maxbandwidth(java.lang.String limitidentifier, org.apache.axis.types.UnsignedInt maxbandwidth) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnslimitidentifier_trapsintimeslice(java.lang.String limitidentifier, org.apache.axis.types.UnsignedInt trapsintimeslice) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnslimitidentifier_selector(java.lang.String limitidentifier) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnslimitidentifier_threshold(java.lang.String limitidentifier) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnslimitidentifier_timeslice(java.lang.String limitidentifier) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnslimitidentifier_mode(java.lang.String limitidentifier) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnslimitidentifier_limittype(java.lang.String limitidentifier) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnslimitidentifier_maxbandwidth(java.lang.String limitidentifier) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnslimitidentifier_trapsintimeslice(java.lang.String limitidentifier) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnslimitidentifierResult getnslimitidentifier(java.lang.String limitidentifier) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult addnslimitselector(java.lang.String selectorname, java.lang.String rule) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult rmnslimitselector(java.lang.String selectorname) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setnslimitselector_rule(java.lang.String selectorname, java.lang.String rule) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetnslimitselector_rule(java.lang.String selectorname) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.GetnslimitselectorResult getnslimitselector(java.lang.String selectorname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addnsacl(java.lang.String aclname, NSConfig.ExtaclactionEnum aclaction, org.apache.axis.types.UnsignedInt ttl, NSConfig.ExtaclprotoenumEnum protocol, boolean established, org.apache.axis.types.UnsignedInt icmptype, org.apache.axis.types.UnsignedInt icmpcode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmnsacl(java.lang.String aclname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl_aclaction(java.lang.String aclname, NSConfig.ExtaclactionEnum aclaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl_srcip(java.lang.String aclname, boolean srcip, NSConfig.XacloperatorEnum operatoR, java.lang.String srcipval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl_srcport(java.lang.String aclname, boolean srcport, NSConfig.XacloperatorEnum operatoR2, java.lang.String srcportval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl_destip(java.lang.String aclname, boolean destip, NSConfig.XacloperatorEnum operatoR3, java.lang.String destipval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl_destport(java.lang.String aclname, boolean destport, NSConfig.XacloperatorEnum operatoR4, java.lang.String destportval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl_srcmac(java.lang.String aclname, java.lang.String srcmac) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl_protocol(java.lang.String aclname, NSConfig.ExtaclprotoenumEnum protocol) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl_protocolnumber(java.lang.String aclname, org.apache.axis.types.UnsignedInt protocolnumber) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl_icmptype(java.lang.String aclname, org.apache.axis.types.UnsignedInt icmptype, org.apache.axis.types.UnsignedInt icmpcode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl_vlan(java.lang.String aclname, org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl_interface(java.lang.String aclname, java.lang.String interfacE) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl_priority(java.lang.String aclname, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl_logstate(java.lang.String aclname, NSConfig.GenericenabledisableEnum logstate, org.apache.axis.types.UnsignedInt ratelimit) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl_established(java.lang.String aclname, boolean established) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsacl_srcip(java.lang.String aclname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsacl_srcport(java.lang.String aclname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsacl_destip(java.lang.String aclname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsacl_destport(java.lang.String aclname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsacl_srcmac(java.lang.String aclname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsacl_protocol(java.lang.String aclname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsacl_icmptype(java.lang.String aclname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsacl_icmpcode(java.lang.String aclname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsacl_vlan(java.lang.String aclname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsacl_interface(java.lang.String aclname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsacl_logstate(java.lang.String aclname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsacl_ratelimit(java.lang.String aclname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsacl_established(java.lang.String aclname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult enablensacl(java.lang.String aclname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disablensacl(java.lang.String aclname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renamensacl(java.lang.String aclname, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnsaclResult getnsacl(java.lang.String aclname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addnsacl6(java.lang.String acl6Name, NSConfig.ExtaclactionEnum acl6Action, org.apache.axis.types.UnsignedInt ttl, NSConfig.Acl6ProtoenumEnum protocol, boolean established, org.apache.axis.types.UnsignedInt icmptype, org.apache.axis.types.UnsignedInt icmpcode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmnsacl6(java.lang.String acl6Name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl6_aclaction(java.lang.String acl6Name, NSConfig.ExtaclactionEnum aclaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl6_srcipv6(java.lang.String acl6Name, boolean srcipv6, NSConfig.XacloperatorEnum operatoR, java.lang.String srcipv6Val) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl6_srcport(java.lang.String acl6Name, boolean srcport, NSConfig.XacloperatorEnum operatoR2, java.lang.String srcportval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl6_destipv6(java.lang.String acl6Name, boolean destipv6, NSConfig.XacloperatorEnum operatoR3, java.lang.String destipv6Val) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl6_destport(java.lang.String acl6Name, boolean destport, NSConfig.XacloperatorEnum operatoR4, java.lang.String destportval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl6_srcmac(java.lang.String acl6Name, java.lang.String srcmac) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl6_protocol(java.lang.String acl6Name, NSConfig.Acl6ProtoenumEnum protocol) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl6_protocolnumber(java.lang.String acl6Name, org.apache.axis.types.UnsignedInt protocolnumber) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl6_icmptype(java.lang.String acl6Name, org.apache.axis.types.UnsignedInt icmptype, org.apache.axis.types.UnsignedInt icmpcode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl6_vlan(java.lang.String acl6Name, org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl6_interface(java.lang.String acl6Name, java.lang.String interfacE) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl6_priority(java.lang.String acl6Name, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsacl6_established(java.lang.String acl6Name, boolean established) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsacl6_srcipv6(java.lang.String acl6Name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsacl6_srcport(java.lang.String acl6Name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsacl6_destipv6(java.lang.String acl6Name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsacl6_destport(java.lang.String acl6Name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsacl6_srcmac(java.lang.String acl6Name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsacl6_protocol(java.lang.String acl6Name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsacl6_icmptype(java.lang.String acl6Name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsacl6_icmpcode(java.lang.String acl6Name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsacl6_vlan(java.lang.String acl6Name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsacl6_interface(java.lang.String acl6Name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsacl6_established(java.lang.String acl6Name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult enablensacl6(java.lang.String acl6Name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disablensacl6(java.lang.String acl6Name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renamensacl6(java.lang.String acl6Name, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.Getnsacl6Result getnsacl6(java.lang.String acl6Name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addnsip6(java.lang.String ipv6Address, NSConfig.Ipv6ScopeEnum scope, NSConfig.Ipv6TypeEnum type, java.lang.String map) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addnsip6Ex(java.lang.String ipv6Address, NSConfig.Ipv6ScopeEnum scope, NSConfig.Ipv6TypeEnum type, java.lang.String map, org.apache.axis.types.UnsignedInt ownernode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmnsip6(java.lang.String ipv6Address) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip6_nd(java.lang.String ipv6Address, NSConfig.EnabledisabledEnum nd) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip6_icmp(java.lang.String ipv6Address, NSConfig.EnabledisabledEnum icmp) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip6_vserver(java.lang.String ipv6Address, NSConfig.EnabledisabledEnum vserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip6_telnet(java.lang.String ipv6Address, NSConfig.EnabledisabledEnum telnet) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip6_ftp(java.lang.String ipv6Address, NSConfig.EnabledisabledEnum ftp) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip6_gui(java.lang.String ipv6Address, NSConfig.AccesscmdEnum gui) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip6_ssh(java.lang.String ipv6Address, NSConfig.EnabledisabledEnum ssh) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip6_snmp(java.lang.String ipv6Address, NSConfig.EnabledisabledEnum snmp) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip6_mgmtaccess(java.lang.String ipv6Address, NSConfig.EnabledisabledEnum mgmtaccess) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip6_restrictaccess(java.lang.String ipv6Address, NSConfig.EnabledisabledEnum restrictaccess) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip6_state(java.lang.String ipv6Address, NSConfig.Ipv6StateEnum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip6_map(java.lang.String ipv6Address, java.lang.String map) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip6_dynamicrouting(java.lang.String ipv6Address, NSConfig.EnabledisabledEnum dynamicrouting) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip6_hostroute(java.lang.String ipv6Address, NSConfig.EnabledisabledEnum hostroute, java.lang.String ip6Hostrtgw, int metric, NSConfig.VserverrhilevelEnum vserverrhilevel, NSConfig.Ospflsatype6Enum ospf6Lsatype, org.apache.axis.types.UnsignedInt ospfarea) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip6_nd(java.lang.String ipv6Address) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip6_icmp(java.lang.String ipv6Address) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip6_vserver(java.lang.String ipv6Address) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip6_telnet(java.lang.String ipv6Address) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip6_ftp(java.lang.String ipv6Address) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip6_gui(java.lang.String ipv6Address) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip6_ssh(java.lang.String ipv6Address) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip6_snmp(java.lang.String ipv6Address) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip6_mgmtaccess(java.lang.String ipv6Address) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip6_restrictaccess(java.lang.String ipv6Address) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip6_state(java.lang.String ipv6Address) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip6_map(java.lang.String ipv6Address) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip6_dynamicrouting(java.lang.String ipv6Address) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip6_hostroute(java.lang.String ipv6Address) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip6_ip6Hostrtgw(java.lang.String ipv6Address) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip6_metric(java.lang.String ipv6Address) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip6_vserverrhilevel(java.lang.String ipv6Address) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip6_ospf6Lsatype(java.lang.String ipv6Address) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip6_ospfarea(java.lang.String ipv6Address) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.Getnsip6Result getnsip6(java.lang.String ipv6Address) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addnsip(java.lang.String ipaddress, java.lang.String netmask, NSConfig.IptypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addnsipEx(java.lang.String ipaddress, java.lang.String netmask, NSConfig.IptypeEnum type, org.apache.axis.types.UnsignedInt ownernode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmnsip(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip_netmask(java.lang.String ipaddress, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip_arp(java.lang.String ipaddress, NSConfig.EnabledisabledEnum arp) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip_icmp(java.lang.String ipaddress, NSConfig.EnabledisabledEnum icmp) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip_vserver(java.lang.String ipaddress, NSConfig.EnabledisabledEnum vserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip_telnet(java.lang.String ipaddress, NSConfig.EnabledisabledEnum telnet) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip_ftp(java.lang.String ipaddress, NSConfig.EnabledisabledEnum ftp) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip_gui(java.lang.String ipaddress, NSConfig.AccesscmdEnum gui) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip_ssh(java.lang.String ipaddress, NSConfig.EnabledisabledEnum ssh) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip_snmp(java.lang.String ipaddress, NSConfig.EnabledisabledEnum snmp) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip_mgmtaccess(java.lang.String ipaddress, NSConfig.EnabledisabledEnum mgmtaccess) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip_restrictaccess(java.lang.String ipaddress, NSConfig.EnabledisabledEnum restrictaccess) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip_dynamicrouting(java.lang.String ipaddress, NSConfig.EnabledisabledEnum dynamicrouting) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip_ospf(java.lang.String ipaddress, NSConfig.EnabledisabledEnum ospf) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip_bgp(java.lang.String ipaddress, NSConfig.EnabledisabledEnum bgp) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip_rip(java.lang.String ipaddress, NSConfig.EnabledisabledEnum rip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip_hostroute(java.lang.String ipaddress, NSConfig.EnabledisabledEnum hostroute, java.lang.String hostrtgw, int metric, NSConfig.VserverrhilevelEnum vserverrhilevel, NSConfig.OspflsatypeEnum ospflsatype, org.apache.axis.types.UnsignedInt ospfarea) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip_vrid(java.lang.String ipaddress, org.apache.axis.types.UnsignedInt vrid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip_icmpresponse(java.lang.String ipaddress, NSConfig.IcmpresponseEnum icmpresponse) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsip_arpresponse(java.lang.String ipaddress, NSConfig.ArpresponseEnum arpresponse) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip_netmask(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip_arp(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip_icmp(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip_vserver(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip_telnet(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip_ftp(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip_gui(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip_ssh(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip_snmp(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip_mgmtaccess(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip_restrictaccess(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip_dynamicrouting(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip_ospf(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip_bgp(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip_rip(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip_hostroute(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip_hostrtgw(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip_metric(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip_vserverrhilevel(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip_ospflsatype(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip_ospfarea(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip_vrid(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip_icmpresponse(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsip_arpresponse(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult enablensip(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disablensip(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnsipResult getnsip(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnsipResult getnsipEx(java.lang.String ipaddress, java.lang.String type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addnssimpleacl(java.lang.String aclname, NSConfig.SaclactionEnum aclaction, java.lang.String srcip, org.apache.axis.types.UnsignedInt destport, NSConfig.SaclprotoclEnum protocol, org.apache.axis.types.UnsignedInt ttl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult clearnssimpleacl() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmnssimpleacl(java.lang.String aclname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult flushnssimpleacl(boolean estsessions) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnssimpleaclResult getnssimpleacl(java.lang.String aclname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addnssimpleacl6(java.lang.String aclname, NSConfig.SaclactionEnum aclaction, java.lang.String srcipv6, org.apache.axis.types.UnsignedInt destport, NSConfig.SaclprotoclEnum protocol, org.apache.axis.types.UnsignedInt ttl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult clearnssimpleacl6() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult flushnssimpleacl6(boolean estsessions) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmnssimpleacl6(java.lang.String aclname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.Getnssimpleacl6Result getnssimpleacl6(java.lang.String aclname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addnspbr(java.lang.String name, NSConfig.AllowdenyEnum actioN, NSConfig.ExtaclprotoenumEnum protocol) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addnspbrEx(java.lang.String name, NSConfig.AllowdenyEnum actioN, boolean nexthop, java.lang.String nexthopval, NSConfig.ExtaclprotoenumEnum protocol) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addnspbrEx2(java.lang.String name, NSConfig.AllowdenyEnum actioN, boolean nexthop, java.lang.String nexthopval, boolean iptunnel, java.lang.String iptunnelname, NSConfig.ExtaclprotoenumEnum protocol) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmnspbr(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr_action(java.lang.String name, NSConfig.AllowdenyEnum actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr_srcip(java.lang.String name, boolean srcip, NSConfig.XacloperatorEnum operatoR, java.lang.String srcipval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr_srcport(java.lang.String name, boolean srcport, NSConfig.XacloperatorEnum operatoR2, java.lang.String srcportval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr_destip(java.lang.String name, boolean destip, NSConfig.XacloperatorEnum operatoR3, java.lang.String destipval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr_destport(java.lang.String name, boolean destport, NSConfig.XacloperatorEnum operatoR4, java.lang.String destportval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr_nexthop(java.lang.String name, boolean nexthop, java.lang.String nexthopval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr_iptunnel(java.lang.String name, boolean iptunnel, java.lang.String iptunnelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr_srcmac(java.lang.String name, java.lang.String srcmac) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr_protocol(java.lang.String name, NSConfig.ExtaclprotoenumEnum protocol) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr_protocolnumber(java.lang.String name, org.apache.axis.types.UnsignedInt protocolnumber) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr_vlan(java.lang.String name, org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr_interface(java.lang.String name, java.lang.String interfacE) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr_priority(java.lang.String name, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr_msr(java.lang.String name, NSConfig.EnabledisabledEnum msr, java.lang.String monitor) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnspbr_srcip(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnspbr_srcport(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnspbr_destip(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnspbr_destport(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnspbr_nexthop(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnspbr_iptunnel(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnspbr_srcmac(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnspbr_protocol(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnspbr_vlan(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnspbr_interface(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnspbr_msr(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnspbr_monitor(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult enablenspbr(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disablenspbr(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnspbrResult getnspbr(java.lang.String name, boolean detail) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addnsxmlnamespace(java.lang.String prefix, java.lang.String namespacE) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmnsxmlnamespace(java.lang.String prefix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsxmlnamespace_namespace(java.lang.String prefix, java.lang.String namespacE) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsxmlnamespace_description(java.lang.String prefix, java.lang.String description) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsxmlnamespace_namespace(java.lang.String prefix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsxmlnamespace_description(java.lang.String prefix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnsxmlnamespaceResult getnsxmlnamespace(java.lang.String prefix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addnstcpprofile(java.lang.String name, NSConfig.EnabledisabledEnum ws, NSConfig.EnabledisabledEnum sack, org.apache.axis.types.UnsignedInt wsval, NSConfig.EnabledisabledEnum nagle, NSConfig.EnabledisabledEnum ackonpush, org.apache.axis.types.UnsignedInt maxburst, org.apache.axis.types.UnsignedInt initialcwnd, org.apache.axis.types.UnsignedInt delayedack, org.apache.axis.types.UnsignedInt oooqsize, org.apache.axis.types.UnsignedInt maxpktpermss, org.apache.axis.types.UnsignedInt pktperretx, org.apache.axis.types.UnsignedInt minrto, org.apache.axis.types.UnsignedInt slowstartincr) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmnstcpprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpprofile_ws(java.lang.String name, NSConfig.EnabledisabledEnum ws) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpprofile_sack(java.lang.String name, NSConfig.EnabledisabledEnum sack) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpprofile_wsval(java.lang.String name, org.apache.axis.types.UnsignedInt wsval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpprofile_nagle(java.lang.String name, NSConfig.EnabledisabledEnum nagle) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpprofile_ackonpush(java.lang.String name, NSConfig.EnabledisabledEnum ackonpush) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpprofile_mss(java.lang.String name, org.apache.axis.types.UnsignedInt mss) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpprofile_maxburst(java.lang.String name, org.apache.axis.types.UnsignedInt maxburst) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpprofile_initialcwnd(java.lang.String name, org.apache.axis.types.UnsignedInt initialcwnd) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpprofile_delayedack(java.lang.String name, org.apache.axis.types.UnsignedInt delayedack) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpprofile_oooqsize(java.lang.String name, int oooqsize) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpprofile_maxpktpermss(java.lang.String name, org.apache.axis.types.UnsignedInt maxpktpermss) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpprofile_pktperretx(java.lang.String name, org.apache.axis.types.UnsignedInt pktperretx) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpprofile_minrto(java.lang.String name, org.apache.axis.types.UnsignedInt minrto) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpprofile_slowstartincr(java.lang.String name, org.apache.axis.types.UnsignedInt slowstartincr) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpprofile_buffersize(java.lang.String name, org.apache.axis.types.UnsignedInt buffersize) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpprofile_syncookie(java.lang.String name, NSConfig.EnabledisabledEnum syncookie) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpprofile_kaprobeupdatelastactivity(java.lang.String name, NSConfig.EnabledisabledEnum kaprobeupdatelastactivity) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpprofile_flavor(java.lang.String name, NSConfig.TcpcongestionalgoEnum flavor) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpprofile_dynamicreceivebuffering(java.lang.String name, NSConfig.EnabledisabledEnum dynamicreceivebuffering) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpprofile_ka(java.lang.String name, NSConfig.EnabledisabledEnum ka) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpprofile_kaconnidletime(java.lang.String name, org.apache.axis.types.UnsignedInt kaconnidletime) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpprofile_kamaxprobes(java.lang.String name, org.apache.axis.types.UnsignedInt kamaxprobes) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpprofile_kaprobeinterval(java.lang.String name, org.apache.axis.types.UnsignedInt kaprobeinterval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpprofile_sendbuffsize(java.lang.String name, org.apache.axis.types.UnsignedInt sendbuffsize) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpprofile_mptcp(java.lang.String name, NSConfig.EnabledisabledEnum mptcp) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpprofile_establishclientconn(java.lang.String name, NSConfig.AllocclientconnectionEnum establishclientconn) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpprofile_ws(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpprofile_sack(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpprofile_wsval(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpprofile_nagle(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpprofile_ackonpush(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpprofile_mss(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpprofile_maxburst(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpprofile_initialcwnd(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpprofile_delayedack(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpprofile_oooqsize(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpprofile_maxpktpermss(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpprofile_pktperretx(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpprofile_minrto(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpprofile_slowstartincr(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpprofile_buffersize(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpprofile_syncookie(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpprofile_kaprobeupdatelastactivity(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpprofile_flavor(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpprofile_dynamicreceivebuffering(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpprofile_ka(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpprofile_kamaxprobes(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpprofile_kaconnidletime(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpprofile_kaprobeinterval(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpprofile_sendbuffsize(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpprofile_mptcp(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpprofile_establishclientconn(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnstcpprofileResult getnstcpprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addnshttpprofile(java.lang.String name, NSConfig.EnabledisabledEnum dropinvalreqs, NSConfig.EnabledisabledEnum markhttp09Inval, NSConfig.EnabledisabledEnum markconnreqinval, NSConfig.EnabledisabledEnum cmponpush, NSConfig.EnabledisabledEnum conmultiplex, org.apache.axis.types.UnsignedInt maxreusepool, NSConfig.EnabledisabledEnum dropextracrlf, org.apache.axis.types.UnsignedInt incomphdrdelay, NSConfig.EnabledisabledEnum weblog) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmnshttpprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshttpprofile_dropinvalreqs(java.lang.String name, NSConfig.EnabledisabledEnum dropinvalreqs) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshttpprofile_markhttp09Inval(java.lang.String name, NSConfig.EnabledisabledEnum markhttp09Inval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshttpprofile_markconnreqinval(java.lang.String name, NSConfig.EnabledisabledEnum markconnreqinval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshttpprofile_cmponpush(java.lang.String name, NSConfig.EnabledisabledEnum cmponpush) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshttpprofile_conmultiplex(java.lang.String name, NSConfig.EnabledisabledEnum conmultiplex) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshttpprofile_maxreusepool(java.lang.String name, org.apache.axis.types.UnsignedInt maxreusepool) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshttpprofile_dropextracrlf(java.lang.String name, NSConfig.EnabledisabledEnum dropextracrlf) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshttpprofile_incomphdrdelay(java.lang.String name, org.apache.axis.types.UnsignedInt incomphdrdelay) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshttpprofile_websocket(java.lang.String name, NSConfig.EnabledisabledEnum websocket) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshttpprofile_reqtimeout(java.lang.String name, org.apache.axis.types.UnsignedInt reqtimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshttpprofile_adpttimeout(java.lang.String name, NSConfig.EnabledisabledEnum adpttimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshttpprofile_reqtimeoutaction(java.lang.String name, java.lang.String reqtimeoutaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshttpprofile_dropextradata(java.lang.String name, NSConfig.EnabledisabledEnum dropextradata) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshttpprofile_weblog(java.lang.String name, NSConfig.EnabledisabledEnum weblog) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshttpprofile_clientiphdrexpr(java.lang.String name, java.lang.String clientiphdrexpr) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshttpprofile_maxreq(java.lang.String name, org.apache.axis.types.UnsignedInt maxreq) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshttpprofile_persistentetag(java.lang.String name, NSConfig.EnabledisabledEnum persistentetag) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshttpprofile_spdy(java.lang.String name, NSConfig.EnabledisabledEnum spdy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshttpprofile_reusepooltimeout(java.lang.String name, org.apache.axis.types.UnsignedInt reusepooltimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpprofile_dropinvalreqs(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpprofile_markhttp09Inval(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpprofile_markconnreqinval(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpprofile_cmponpush(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpprofile_conmultiplex(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpprofile_maxreusepool(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpprofile_dropextracrlf(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpprofile_incomphdrdelay(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpprofile_websocket(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpprofile_dropextradata(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpprofile_clientiphdrexpr(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpprofile_reqtimeout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpprofile_adpttimeout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpprofile_reqtimeoutaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpprofile_weblog(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpprofile_maxreq(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpprofile_persistentetag(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpprofile_spdy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpprofile_reusepooltimeout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnshttpprofileResult getnshttpprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult addnsappflowcollector(java.lang.String name, java.lang.String ipaddress, org.apache.axis.types.UnsignedInt port) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult rmnsappflowcollector(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.GetnsappflowcollectorResult getnsappflowcollector(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnsnsResult getnsns() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnssavedconfigResult getnssavedconfig() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renumbernsacls() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult clearnsacls() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult applynsacls() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnslicenseResult getnslicense() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnsversionResult getnsversion() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult clearnsconfig(boolean force, NSConfig.ClearconfiglevelEnum level) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsconfig_ipaddress(java.lang.String ipaddress, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsconfig_nsvlan(org.apache.axis.types.UnsignedInt nsvlan, java.lang.String ifnum) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsconfig_nsvlanEx(org.apache.axis.types.UnsignedInt nsvlan, java.lang.String ifnum, NSConfig.YesnoEnum tagged) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsconfig_httpport(java.lang.String httpport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsconfig_maxconn(org.apache.axis.types.UnsignedInt maxconn) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsconfig_maxreq(org.apache.axis.types.UnsignedInt maxreq) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsconfig_cip(NSConfig.Enabledisabled2Enum cip, java.lang.String cipheader) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsconfig_cookieversion(NSConfig.CookieverEnum cookieversion) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsconfig_securecookie(NSConfig.EnabledisabledEnum securecookie) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsconfig_pmtumin(org.apache.axis.types.UnsignedInt pmtumin) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsconfig_pmtutimeout(org.apache.axis.types.UnsignedInt pmtutimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsconfig_ftpportrange(java.lang.String ftpportrange) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsconfig_crportrange(java.lang.String crportrange) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsconfig_timezone(NSConfig.NsconfigtimezoneEnum timezone) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsconfig_grantquotamaxclient(org.apache.axis.types.UnsignedInt grantquotamaxclient) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsconfig_exclusivequotamaxclient(org.apache.axis.types.UnsignedInt exclusivequotamaxclient) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsconfig_grantquotaspillover(org.apache.axis.types.UnsignedInt grantquotaspillover) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsconfig_exclusivequotaspillover(org.apache.axis.types.UnsignedInt exclusivequotaspillover) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsconfig_nwfwmode(NSConfig.NwfwmodeEnum nwfwmode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsconfig_nsvlan() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsconfig_ftpportrange() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsconfig_crportrange() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsconfig_timezone() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsconfig_ipaddress() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsconfig_netmask() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsconfig_ifnum() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsconfig_tagged() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsconfig_httpport() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsconfig_maxconn() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsconfig_maxreq() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsconfig_cip() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsconfig_cipheader() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsconfig_cookieversion() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsconfig_securecookie() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsconfig_pmtumin() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsconfig_pmtutimeout() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsconfig_grantquotamaxclient() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsconfig_exclusivequotamaxclient() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsconfig_grantquotaspillover() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsconfig_exclusivequotaspillover() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsconfig_nwfwmode() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult savensconfig() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnsconfigResult getnsconfig() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult diffnsconfig(java.lang.String config1, java.lang.String config2, NSConfig.AuditformatEnum outtype, boolean templatE) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult diffnsconfigEx(java.lang.String config1, java.lang.String config2, NSConfig.AuditformatEnum outtype, boolean templatE, boolean ignoredevicespecific) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsparam_httpport(java.lang.String httpport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsparam_maxconn(org.apache.axis.types.UnsignedInt maxconn) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsparam_maxreq(org.apache.axis.types.UnsignedInt maxreq) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsparam_cip(NSConfig.Enabledisabled2Enum cip, java.lang.String cipheader) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsparam_cookieversion(NSConfig.CookieverEnum cookieversion) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsparam_securecookie(NSConfig.EnabledisabledEnum securecookie) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsparam_pmtumin(org.apache.axis.types.UnsignedInt pmtumin) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsparam_pmtutimeout(org.apache.axis.types.UnsignedInt pmtutimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsparam_ftpportrange(java.lang.String ftpportrange) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsparam_crportrange(java.lang.String crportrange) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsparam_timezone(NSConfig.NsconfigtimezoneEnum timezone) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsparam_grantquotamaxclient(org.apache.axis.types.UnsignedInt grantquotamaxclient) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsparam_exclusivequotamaxclient(org.apache.axis.types.UnsignedInt exclusivequotamaxclient) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsparam_grantquotaspillover(org.apache.axis.types.UnsignedInt grantquotaspillover) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsparam_exclusivequotaspillover(org.apache.axis.types.UnsignedInt exclusivequotaspillover) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsparam_useproxyport(NSConfig.EnabledisabledEnum useproxyport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsparam_internaluserlogin(NSConfig.EnabledisabledEnum internaluserlogin) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsparam_aftpallowrandomsourceport(NSConfig.EnabledisabledEnum aftpallowrandomsourceport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsparam_icaports(java.lang.String icaports) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsparam_ftpportrange() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsparam_crportrange() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsparam_timezone() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsparam_aftpallowrandomsourceport() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsparam_httpport() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsparam_maxconn() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsparam_maxreq() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsparam_cip() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsparam_cipheader() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsparam_cookieversion() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsparam_securecookie() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsparam_pmtumin() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsparam_pmtutimeout() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsparam_grantquotamaxclient() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsparam_exclusivequotamaxclient() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsparam_grantquotaspillover() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsparam_exclusivequotaspillover() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsparam_useproxyport() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsparam_internaluserlogin() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsparam_icaports() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnsparamResult getnsparam() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult clearnsacls6() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult applynsacls6() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renumbernsacls6() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renumbernspbrs() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult clearnspbrs() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult applynspbrs() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnsconnectiontableResult getnsconnectiontable(java.lang.String filterexpression, boolean link, boolean name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnsconnectiontableResult getnsconnectiontableEx(java.lang.String filterexpression, boolean link, boolean name, java.lang.String detail) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnslimitsessionsResult getnslimitsessions(java.lang.String limitidentifier, boolean detail) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult clearnslimitsessions(java.lang.String limitidentifier) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.GetnspersistencesessionResult getnspersistencesession(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult clearnspersistencesession(java.lang.String vserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshostname_hostname(org.apache.axis.types.UnsignedInt ownernode, java.lang.String hostname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnshostnameResult getnshostname() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult flushnssurgeq(java.lang.String name, java.lang.String servername, org.apache.axis.types.UnsignedInt port) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult enablensfeature(NSConfig.FeatureEnum feature) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disablensfeature(NSConfig.FeatureEnum feature) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnsfeatureResult getnsfeature() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult enablensmode(NSConfig.ModeEnum mode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disablensmode(NSConfig.ModeEnum mode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnsmodeResult getnsmode() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsdhcpparams_dhcpclient(NSConfig.OnoffEnum dhcpclient) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsdhcpparams_saveroute(NSConfig.OnoffEnum saveroute) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsdhcpparams_dhcpclient() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsdhcpparams_saveroute() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnsdhcpparamsResult getnsdhcpparams() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult releasensdhcpip() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsspparams_basethreshold(int basethreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsspparams_throttle(NSConfig.SpthrottleEnum throttle) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsspparams_basethreshold() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsspparams_throttle() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnsspparamsResult getnsspparams() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpbufparam_size(org.apache.axis.types.UnsignedInt size) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpbufparam_memlimit(org.apache.axis.types.UnsignedInt memlimit) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpbufparam_size() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpbufparam_memlimit() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnstcpbufparamResult getnstcpbufparam() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_ws(NSConfig.EnabledisabledEnum ws) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_wsval(org.apache.axis.types.UnsignedInt wsval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_sack(NSConfig.EnabledisabledEnum sack) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_learnvsvrmss(NSConfig.EnabledisabledEnum learnvsvrmss) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_maxburst(org.apache.axis.types.UnsignedInt maxburst) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_initialcwnd(org.apache.axis.types.UnsignedInt initialcwnd) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_recvbuffsize(org.apache.axis.types.UnsignedInt recvbuffsize) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_delayedack(org.apache.axis.types.UnsignedInt delayedack) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_downstaterst(NSConfig.EnabledisabledEnum downstaterst) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_nagle(NSConfig.EnabledisabledEnum nagle) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_limitedpersist(NSConfig.EnabledisabledEnum limitedpersist) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_oooqsize(org.apache.axis.types.UnsignedInt oooqsize) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_ackonpush(NSConfig.EnabledisabledEnum ackonpush) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_maxpktpermss(int maxpktpermss) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_pktperretx(int pktperretx) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_minrto(int minrto) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_slowstartincr(int slowstartincr) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_maxdynserverprobes(org.apache.axis.types.UnsignedInt maxdynserverprobes) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_synholdfastgiveup(org.apache.axis.types.UnsignedInt synholdfastgiveup) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_maxsynholdperprobe(org.apache.axis.types.UnsignedInt maxsynholdperprobe) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_maxsynhold(org.apache.axis.types.UnsignedInt maxsynhold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_msslearninterval(org.apache.axis.types.UnsignedInt msslearninterval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_msslearndelay(org.apache.axis.types.UnsignedInt msslearndelay) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_maxtimewaitconn(org.apache.axis.types.UnsignedInt maxtimewaitconn) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_kaprobeupdatelastactivity(NSConfig.EnabledisabledEnum kaprobeupdatelastactivity) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_maxsynackretx(org.apache.axis.types.UnsignedInt maxsynackretx) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_synattackdetection(NSConfig.EnabledisabledEnum synattackdetection) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_connflushifnomem(NSConfig.ConnflushEnum connflushifnomem) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_connflushthres(org.apache.axis.types.UnsignedInt connflushthres) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_mptcpconcloseonpassivesf(NSConfig.EnabledisabledEnum mptcpconcloseonpassivesf) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_mptcpchecksum(NSConfig.EnabledisabledEnum mptcpchecksum) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_mptcpsftimeout(org.apache.axis.types.UnsignedInt mptcpsftimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_mptcpsfreplacetimeout(org.apache.axis.types.UnsignedInt mptcpsfreplacetimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_mptcpmaxsf(org.apache.axis.types.UnsignedInt mptcpmaxsf) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_mptcpmaxpendingsf(org.apache.axis.types.UnsignedInt mptcpmaxpendingsf) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_mptcppendingjointhreshold(org.apache.axis.types.UnsignedInt mptcppendingjointhreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_mptcprtostoswitchsf(org.apache.axis.types.UnsignedInt mptcprtostoswitchsf) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_mptcpusebackupondss(NSConfig.EnabledisabledEnum mptcpusebackupondss) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_tcpmaxretries(org.apache.axis.types.UnsignedInt tcpmaxretries) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstcpparam_mptcpimmediatesfcloseonfin(NSConfig.EnabledisabledEnum mptcpimmediatesfcloseonfin) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_ws() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_wsval() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_sack() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_learnvsvrmss() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_maxburst() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_initialcwnd() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_recvbuffsize() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_delayedack() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_downstaterst() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_nagle() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_limitedpersist() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_oooqsize() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_ackonpush() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_maxpktpermss() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_pktperretx() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_minrto() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_slowstartincr() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_maxdynserverprobes() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_synholdfastgiveup() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_maxsynholdperprobe() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_maxsynhold() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_msslearninterval() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_msslearndelay() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_maxtimewaitconn() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_kaprobeupdatelastactivity() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_maxsynackretx() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_synattackdetection() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_connflushifnomem() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_connflushthres() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_mptcpconcloseonpassivesf() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_mptcpchecksum() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_mptcpsftimeout() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_mptcpsfreplacetimeout() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_mptcpmaxsf() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_mptcpmaxpendingsf() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_mptcppendingjointhreshold() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_mptcprtostoswitchsf() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_mptcpusebackupondss() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_tcpmaxretries() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstcpparam_mptcpimmediatesfcloseonfin() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnstcpparamResult getnstcpparam() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshttpparam_dropinvalreqs(NSConfig.OnoffEnum dropinvalreqs) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshttpparam_markhttp09Inval(NSConfig.OnoffEnum markhttp09Inval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshttpparam_markconnreqinval(NSConfig.OnoffEnum markconnreqinval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshttpparam_insnssrvrhdr(NSConfig.OnoffEnum insnssrvrhdr, java.lang.String nssrvrhdr) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshttpparam_logerrresp(NSConfig.OnoffEnum logerrresp) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshttpparam_conmultiplex(NSConfig.EnabledisabledEnum conmultiplex) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnshttpparam_maxreusepool(org.apache.axis.types.UnsignedInt maxreusepool) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpparam_dropinvalreqs() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpparam_markhttp09Inval() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpparam_markconnreqinval() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpparam_insnssrvrhdr() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpparam_nssrvrhdr() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpparam_logerrresp() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpparam_conmultiplex() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnshttpparam_maxreusepool() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnshttpparamResult getnshttpparam() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsweblogparam_buffersizemb(org.apache.axis.types.UnsignedInt buffersizemb) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsweblogparam_customreqhdrs(java.lang.String customreqhdrs) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsweblogparam_customrsphdrs(java.lang.String customrsphdrs) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsweblogparam_buffersizemb() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsweblogparam_customreqhdrs() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsweblogparam_customrsphdrs() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnsweblogparamResult getnsweblogparam() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsdiameter_identity(java.lang.String identity) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsdiameter_realm(java.lang.String realm) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsdiameter_serverclosepropagation(NSConfig.YesnoEnum serverclosepropagation) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsdiameter_serverclosepropagation() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnsdiameterResult getnsdiameter() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsratecontrol_tcpthreshold(org.apache.axis.types.UnsignedInt tcpthreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsratecontrol_udpthreshold(org.apache.axis.types.UnsignedInt udpthreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsratecontrol_icmpthreshold(org.apache.axis.types.UnsignedInt icmpthreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsratecontrol_tcprstthreshold(org.apache.axis.types.UnsignedInt tcprstthreshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsratecontrol_tcpthreshold() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsratecontrol_udpthreshold() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsratecontrol_icmpthreshold() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsratecontrol_tcprstthreshold() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnsratecontrolResult getnsratecontrol() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsrpcnode_password(java.lang.String ipaddress, java.lang.String password) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsrpcnode_srcip(java.lang.String ipaddress, java.lang.String srcip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsrpcnode_secure(java.lang.String ipaddress, NSConfig.YesnoEnum secure) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsrpcnode_password(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsrpcnode_srcip(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsrpcnode_secure(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnsrpcnodeResult getnsrpcnode() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnsrpcnodeResult getnsrpcnodeEx(java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setnsidletimeout_tcpsvr(org.apache.axis.types.UnsignedInt tcpsvr) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setnsidletimeout_tcpclt(org.apache.axis.types.UnsignedInt tcpclt) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setnsidletimeout_nontcpsvrclt(org.apache.axis.types.UnsignedInt nontcpsvrclt) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetnsidletimeout_tcpsvr() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetnsidletimeout_tcpclt() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetnsidletimeout_nontcpsvrclt() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.GetnsidletimeoutResult getnsidletimeout() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstimeout_zombie(org.apache.axis.types.UnsignedInt zombie) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstimeout_client(org.apache.axis.types.UnsignedInt client) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstimeout_server(org.apache.axis.types.UnsignedInt server) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstimeout_httpclient(org.apache.axis.types.UnsignedInt httpclient) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstimeout_httpserver(org.apache.axis.types.UnsignedInt httpserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstimeout_tcpclient(org.apache.axis.types.UnsignedInt tcpclient) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstimeout_tcpserver(org.apache.axis.types.UnsignedInt tcpserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstimeout_anyclient(org.apache.axis.types.UnsignedInt anyclient) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstimeout_anyserver(org.apache.axis.types.UnsignedInt anyserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstimeout_halfclose(org.apache.axis.types.UnsignedInt halfclose) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstimeout_nontcpzombie(org.apache.axis.types.UnsignedInt nontcpzombie) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstimeout_reducedfintimeout(org.apache.axis.types.UnsignedInt reducedfintimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstimeout_newconnidletimeout(org.apache.axis.types.UnsignedInt newconnidletimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstimeout_zombie() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstimeout_client() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstimeout_server() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstimeout_httpclient() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstimeout_httpserver() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstimeout_tcpclient() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstimeout_tcpserver() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstimeout_anyclient() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstimeout_anyserver() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstimeout_halfclose() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstimeout_nontcpzombie() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstimeout_reducedfintimeout() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstimeout_newconnidletimeout() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnstimeoutResult getnstimeout() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnshardwareResult getnshardware() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnseventsResult getnsevents(org.apache.axis.types.UnsignedInt eventno) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsencryptionparams_method(NSConfig.EncryptionmethodsEnum method) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsencryptionparams_keyvalue(NSConfig.EncryptionmethodsEnum method, java.lang.String keyvalue) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnsencryptionparamsResult getnsencryptionparams() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnsrollbackcmdResult getnsrollbackcmd(java.lang.String filename, java.lang.String outtype) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setnsappflowparam_templaterefresh(org.apache.axis.types.UnsignedInt templaterefresh) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setnsappflowparam_udppmtu(org.apache.axis.types.UnsignedInt udppmtu) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setnsappflowparam_httpurl(NSConfig.EnabledisabledEnum httpurl) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setnsappflowparam_httpcookie(NSConfig.EnabledisabledEnum httpcookie) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setnsappflowparam_httpreferer(NSConfig.EnabledisabledEnum httpreferer) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setnsappflowparam_httpmethod(NSConfig.EnabledisabledEnum httpmethod) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setnsappflowparam_httphost(NSConfig.EnabledisabledEnum httphost) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setnsappflowparam_httpuseragent(NSConfig.EnabledisabledEnum httpuseragent) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setnsappflowparam_clienttrafficonly(NSConfig.YesnoEnum clienttrafficonly) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetnsappflowparam_templaterefresh() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetnsappflowparam_udppmtu() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetnsappflowparam_httpurl() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetnsappflowparam_httpcookie() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetnsappflowparam_httpreferer() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetnsappflowparam_httpmethod() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetnsappflowparam_httphost() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetnsappflowparam_httpuseragent() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetnsappflowparam_clienttrafficonly() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.GetnsappflowparamResult getnsappflowparam() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addnspbr6(java.lang.String name, NSConfig.AllowdenyEnum actioN, NSConfig.Acl6ProtoenumEnum protocol, boolean nexthop, java.lang.String nexthopval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renumbernspbr6() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmnspbr6(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr6_action(java.lang.String name, NSConfig.AllowdenyEnum actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr6_srcipv6(java.lang.String name, boolean srcipv6, NSConfig.XacloperatorEnum operatoR, java.lang.String srcipv6Val) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr6_srcport(java.lang.String name, boolean srcport, NSConfig.XacloperatorEnum operatoR2, java.lang.String srcportval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr6_destipv6(java.lang.String name, boolean destipv6, NSConfig.XacloperatorEnum operatoR3, java.lang.String destipv6Val) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr6_destport(java.lang.String name, boolean destport, NSConfig.XacloperatorEnum operatoR4, java.lang.String destportval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr6_srcmac(java.lang.String name, java.lang.String srcmac) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr6_protocol(java.lang.String name, NSConfig.Acl6ProtoenumEnum protocol) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr6_protocolnumber(java.lang.String name, org.apache.axis.types.UnsignedInt protocolnumber) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr6_vlan(java.lang.String name, org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr6_interface(java.lang.String name, java.lang.String interfacE) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr6_priority(java.lang.String name, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr6_msr(java.lang.String name, NSConfig.EnabledisabledEnum msr, java.lang.String monitor) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr6_nexthop(java.lang.String name, boolean nexthop, java.lang.String nexthopval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnspbr6_nexthopvlan(java.lang.String name, org.apache.axis.types.UnsignedInt nexthopvlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnspbr6_srcipv6(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnspbr6_srcport(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnspbr6_destipv6(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnspbr6_destport(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnspbr6_srcmac(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnspbr6_protocol(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnspbr6_interface(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnspbr6_vlan(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnspbr6_msr(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnspbr6_monitor(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnspbr6_nexthop(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnspbr6_nexthopvlan(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult enablenspbr6(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disablenspbr6(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.Getnspbr6Result getnspbr6(java.lang.String name, boolean detail) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult clearnspbr6() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult applynspbr6() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addnstrafficdomain(org.apache.axis.types.UnsignedInt td, java.lang.String aliasname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmnstrafficdomain(org.apache.axis.types.UnsignedInt td) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult clearnstrafficdomain(org.apache.axis.types.UnsignedInt td) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindnstrafficdomain_vlan(org.apache.axis.types.UnsignedInt td, org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindnstrafficdomain_bridgegroup(org.apache.axis.types.UnsignedInt td, org.apache.axis.types.UnsignedInt bridgegroup) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindnstrafficdomain_vlan(org.apache.axis.types.UnsignedInt td, org.apache.axis.types.UnsignedInt vlan) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindnstrafficdomain_bridgegroup(org.apache.axis.types.UnsignedInt td, org.apache.axis.types.UnsignedInt bridgegroup) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult enablenstrafficdomain(org.apache.axis.types.UnsignedInt td, NSConfig.EnabledisabledEnum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disablenstrafficdomain(org.apache.axis.types.UnsignedInt td, NSConfig.EnabledisabledEnum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnstrafficdomainResult getnstrafficdomain(org.apache.axis.types.UnsignedInt td) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnsconsoleloginprompt_promptstring(java.lang.String promptstring) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnsconsoleloginprompt_promptstring() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnsconsoleloginpromptResult getnsconsoleloginprompt() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addnstimer(java.lang.String name, int interval, NSConfig.TimerentityunitsEnum unit, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmnstimer(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstimer_interval(java.lang.String name, int interval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstimer_unit(java.lang.String name, NSConfig.TimerentityunitsEnum unit) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setnstimer_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstimer_interval(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstimer_unit(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetnstimer_comment(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindnstimer_policy(java.lang.String name, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, java.lang.String gotopriorityexpression, java.lang.String vserver, org.apache.axis.types.UnsignedInt samplesize, org.apache.axis.types.UnsignedInt threshold) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindnstimer_policy(java.lang.String name, java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetnstimerResult getnstimer(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renamenstimer(java.lang.String name, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult clearnsstats(NSConfig.ClearstatslevelEnum cleanuplevel) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addntpserver(java.lang.String serverip, java.lang.String servername, org.apache.axis.types.UnsignedInt minpoll, org.apache.axis.types.UnsignedInt maxpoll) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmntpserver(java.lang.String serverip, java.lang.String servername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setntpserver_minpoll(java.lang.String serverip, java.lang.String servername, org.apache.axis.types.UnsignedInt minpoll) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setntpserver_maxpoll(java.lang.String serverip, java.lang.String servername, org.apache.axis.types.UnsignedInt maxpoll) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setntpserver_preferredntpserver(java.lang.String serverip, java.lang.String servername, NSConfig.YesnoEnum preferredntpserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setntpserver_autokey(java.lang.String serverip, java.lang.String servername, boolean autokey) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setntpserver_key(java.lang.String serverip, java.lang.String servername, org.apache.axis.types.UnsignedInt key) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetntpserver_minpoll(java.lang.String serverip, java.lang.String servername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetntpserver_maxpoll(java.lang.String serverip, java.lang.String servername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetntpserver_preferredntpserver(java.lang.String serverip, java.lang.String servername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetntpserver_autokey(java.lang.String serverip, java.lang.String servername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetntpserver_key(java.lang.String serverip, java.lang.String servername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetntpserverResult getntpserver(java.lang.String serverip, java.lang.String servername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult enablentpsync() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disablentpsync() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetntpsyncResult getntpsync() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetntpstatusResult getntpstatus() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setntpparam_authentication(NSConfig.YesnoEnum authentication) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setntpparam_trustedkey(java.lang.String trustedkey) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setntpparam_autokeylogsec(org.apache.axis.types.UnsignedInt autokeylogsec) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setntpparam_revokelogsec(org.apache.axis.types.UnsignedInt revokelogsec) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetntpparam_authentication() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetntpparam_trustedkey() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetntpparam_autokeylogsec() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetntpparam_revokelogsec() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetntpparamResult getntpparam() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addpolicyexpression(java.lang.String name, java.lang.String value) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmpolicyexpression(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setpolicyexpression_value(java.lang.String name, java.lang.String value) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setpolicyexpression_description(java.lang.String name, java.lang.String description) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setpolicyexpression_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setpolicyexpression_clientsecuritymessage(java.lang.String name, java.lang.String clientsecuritymessage) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetpolicyexpression_description(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetpolicyexpression_comment(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetpolicyexpression_clientsecuritymessage(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetpolicyexpressionResult getpolicyexpression(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetpolicyexpressionResult getpolicyexpressionEx(java.lang.String name, java.lang.String type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addpolicymap(java.lang.String mappolicyname, java.lang.String sd, java.lang.String su, java.lang.String td, java.lang.String tu) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmpolicymap(java.lang.String mappolicyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetpolicymapResult getpolicymap(java.lang.String mappolicyname) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult addpolicypatclass(java.lang.String name, java.lang.String strinG) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult rmpolicypatclass(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult bindpolicypatclass_string(java.lang.String name, java.lang.String strinG) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unbindpolicypatclass_string(java.lang.String name, java.lang.String strinG) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.GetpolicypatclassResult getpolicypatclass(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addpolicypatset(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmpolicypatset(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindpolicypatset_string(java.lang.String name, java.lang.String strinG, org.apache.axis.types.UnsignedInt index) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindpolicypatset_stringEx(java.lang.String name, java.lang.String strinG, org.apache.axis.types.UnsignedInt index, NSConfig.CharsetsEnum charset) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindpolicypatset_string(java.lang.String name, java.lang.String strinG) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetpolicypatsetResult getpolicypatset(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addpolicydataset(java.lang.String name, NSConfig.DatasettypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmpolicydataset(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindpolicydataset_value(java.lang.String name, java.lang.String value, org.apache.axis.types.UnsignedInt index) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindpolicydataset_value(java.lang.String name, java.lang.String value) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetpolicydatasetResult getpolicydataset(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addpolicyhttpcallout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmpolicyhttpcallout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setpolicyhttpcallout_ipaddress(java.lang.String name, java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setpolicyhttpcallout_port(java.lang.String name, org.apache.axis.types.UnsignedInt port) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setpolicyhttpcallout_vserver(java.lang.String name, java.lang.String vserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setpolicyhttpcallout_returntype(java.lang.String name, NSConfig.HttpcallouttypeEnum returntype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setpolicyhttpcallout_httpmethod(java.lang.String name, NSConfig.HttpmethodEnum httpmethod) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setpolicyhttpcallout_hostexpr(java.lang.String name, java.lang.String hostexpr) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setpolicyhttpcallout_urlstemexpr(java.lang.String name, java.lang.String urlstemexpr) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setpolicyhttpcallout_headers(java.lang.String name, java.lang.String headers) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setpolicyhttpcallout_parameters(java.lang.String name, java.lang.String parameters) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setpolicyhttpcallout_bodyexpr(java.lang.String name, java.lang.String bodyexpr) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setpolicyhttpcallout_fullreqexpr(java.lang.String name, java.lang.String fullreqexpr) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setpolicyhttpcallout_scheme(java.lang.String name, NSConfig.HttpcalloutEnum scheme) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setpolicyhttpcallout_resultexpr(java.lang.String name, java.lang.String resultexpr) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setpolicyhttpcallout_cacheforsecs(java.lang.String name, org.apache.axis.types.UnsignedInt cacheforsecs) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetpolicyhttpcallout_ipaddress(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetpolicyhttpcallout_port(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetpolicyhttpcallout_vserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetpolicyhttpcallout_httpmethod(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetpolicyhttpcallout_hostexpr(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetpolicyhttpcallout_urlstemexpr(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetpolicyhttpcallout_headers(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetpolicyhttpcallout_parameters(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetpolicyhttpcallout_bodyexpr(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetpolicyhttpcallout_fullreqexpr(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetpolicyhttpcallout_resultexpr(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetpolicyhttpcallout_cacheforsecs(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetpolicyhttpcalloutResult getpolicyhttpcallout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addpolicystringmap(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmpolicystringmap(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setpolicystringmap_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetpolicystringmap_comment(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindpolicystringmap_key(java.lang.String name, java.lang.String key, java.lang.String value) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindpolicystringmap_key(java.lang.String name, java.lang.String key) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetpolicystringmapResult getpolicystringmap(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addpqpolicy(java.lang.String policyname, java.lang.String rule, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmpqpolicy(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setpqpolicy_weight(java.lang.String policyname, org.apache.axis.types.UnsignedInt weight) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setpqpolicy_qdepth(java.lang.String policyname, org.apache.axis.types.UnsignedInt qdepth) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setpqpolicy_polqdepth(java.lang.String policyname, org.apache.axis.types.UnsignedInt polqdepth) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetpqpolicy_weight(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetpqpolicy_qdepth(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetpqpolicy_polqdepth(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetpqpolicyResult getpqpolicy(java.lang.String policyname) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.GetpqbindingResult getpqbinding(java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setprotocolhttpband_reqbandsize(int reqbandsize) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setprotocolhttpband_respbandsize(int respbandsize) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetprotocolhttpband_reqbandsize() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetprotocolhttpband_respbandsize() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetprotocolhttpbandResult getprotocolhttpband(java.lang.String type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addresponderpolicy(java.lang.String name, java.lang.String rule, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmresponderpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setresponderpolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setresponderpolicy_action(java.lang.String name, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setresponderpolicy_undefaction(java.lang.String name, java.lang.String undefaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setresponderpolicy_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setresponderpolicy_logaction(java.lang.String name, java.lang.String logaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setresponderpolicy_appflowaction(java.lang.String name, java.lang.String appflowaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetresponderpolicy_undefaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetresponderpolicy_comment(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetresponderpolicy_logaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetresponderpolicy_appflowaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetresponderpolicyResult getresponderpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renameresponderpolicy(java.lang.String name, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addresponderaction(java.lang.String name, NSConfig.ActionrespondertypeEnum type, java.lang.String target, java.lang.String htmlpage, NSConfig.YesnoEnum bypasssafetycheck) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmresponderaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setresponderaction_target(java.lang.String name, java.lang.String target, NSConfig.YesnoEnum bypasssafetycheck) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setresponderaction_htmlpage(java.lang.String name, java.lang.String htmlpage) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setresponderaction_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetresponderaction_comment(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetresponderactionResult getresponderaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renameresponderaction(java.lang.String name, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addresponderpolicylabel(java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmresponderpolicylabel(java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindresponderpolicylabel_policy(java.lang.String labelname, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, java.lang.String gotopriorityexpression, boolean invoke, NSConfig.PolicylabelresponderinvoketypeEnum labeltype, java.lang.String labelname2) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindresponderpolicylabel_policy(java.lang.String labelname, java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindresponderpolicylabel_priority(java.lang.String labelname, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetresponderpolicylabelResult getresponderpolicylabel(java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renameresponderpolicylabel(java.lang.String labelname, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindresponderglobal_policyname(java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, java.lang.String gotopriorityexpression, NSConfig.ResponderglobalbindpointEnum type, boolean invoke, NSConfig.PolicylabelresponderinvoketypeEnum labeltype, java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindresponderglobal_policyname(java.lang.String policyname, NSConfig.ResponderglobalbindpointEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindresponderglobal_priority(java.lang.String policyname, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetresponderglobalResult getresponderglobal(java.lang.String type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setresponderparam_undefaction(java.lang.String undefaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetresponderparam_undefaction() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetresponderparamResult getresponderparam() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult importresponderhtmlpage(java.lang.String src, java.lang.String name, java.lang.String comment, boolean overwrite) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmresponderhtmlpage(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult updateresponderhtmlpage(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetresponderhtmlpageResult getresponderhtmlpage(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addrewritepolicy(java.lang.String name, java.lang.String rule, java.lang.String actioN, java.lang.String undefaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmrewritepolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setrewritepolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setrewritepolicy_action(java.lang.String name, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setrewritepolicy_undefaction(java.lang.String name, java.lang.String undefaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setrewritepolicy_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setrewritepolicy_logaction(java.lang.String name, java.lang.String logaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetrewritepolicy_undefaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetrewritepolicy_comment(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetrewritepolicy_logaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetrewritepolicyResult getrewritepolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renamerewritepolicy(java.lang.String name, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addrewriteaction(java.lang.String name, NSConfig.ActionrewritetypeEnum type, java.lang.String target, java.lang.String stringbuilderexpr, NSConfig.YesnoEnum bypasssafetycheck) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addrewriteactionEx(java.lang.String name, NSConfig.ActionrewritetypeEnum type, java.lang.String target, java.lang.String stringbuilderexpr, java.lang.String pattern, java.lang.String search, NSConfig.YesnoEnum bypasssafetycheck) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmrewriteaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setrewriteaction_target(java.lang.String name, java.lang.String target) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setrewriteaction_stringbuilderexpr(java.lang.String name, java.lang.String stringbuilderexpr, NSConfig.YesnoEnum bypasssafetycheck) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setrewriteaction_pattern(java.lang.String name, java.lang.String pattern) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setrewriteaction_search(java.lang.String name, java.lang.String search) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setrewriteaction_refinesearch(java.lang.String name, java.lang.String refinesearch) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setrewriteaction_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetrewriteaction_stringbuilderexpr(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetrewriteaction_refinesearch(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetrewriteaction_comment(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetrewriteactionResult getrewriteaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renamerewriteaction(java.lang.String name, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addrewritepolicylabel(java.lang.String labelname, NSConfig.PolicylabeltransformEnum transform) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmrewritepolicylabel(java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindrewritepolicylabel_policy(java.lang.String labelname, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, java.lang.String gotopriorityexpression, boolean invoke, NSConfig.PolicylabelinvoketypeEnum labeltype, java.lang.String labelname2) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindrewritepolicylabel_policy(java.lang.String labelname, java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindrewritepolicylabel_priority(java.lang.String labelname, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetrewritepolicylabelResult getrewritepolicylabel(java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renamerewritepolicylabel(java.lang.String labelname, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindrewriteglobal_policy(java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, java.lang.String gotopriorityexpression, NSConfig.RwglobalbindpointEnum type, boolean invoke, NSConfig.PolicylabelinvoketypeEnum labeltype, java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindrewriteglobal_policy(java.lang.String policyname, NSConfig.RwglobalbindpointEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindrewriteglobal_priority(java.lang.String policyname, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetrewriteglobalResult getrewriteglobal(java.lang.String type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setrewriteparam_undefaction(java.lang.String undefaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetrewriteparam_undefaction() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetrewriteparamResult getrewriteparam() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult vtysh() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult addrouterbgp(org.apache.axis.types.UnsignedInt autonomoussystem) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult clearrouterbgp(java.lang.String neighbor, boolean all) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult clearrouterbgpEx(org.apache.axis.types.UnsignedInt autonomoussystem, java.lang.String neighbor, boolean all) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult rmrouterbgp(org.apache.axis.types.UnsignedInt autonomoussystem, java.lang.String neighbor) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setrouterbgp_autonomoussystem(org.apache.axis.types.UnsignedInt autonomoussystem) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setrouterbgp_routerid(org.apache.axis.types.UnsignedInt autonomoussystem, java.lang.String routerid) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setrouterbgp_learnroute(org.apache.axis.types.UnsignedInt autonomoussystem, boolean learnroute) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setrouterbgp_staticredistribute(org.apache.axis.types.UnsignedInt autonomoussystem, boolean staticredistribute, java.lang.String staticroutemap) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setrouterbgp_kernelredistribute(org.apache.axis.types.UnsignedInt autonomoussystem, boolean kernelredistribute, java.lang.String kernelroutemap) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setrouterbgp_conredistribute(org.apache.axis.types.UnsignedInt autonomoussystem, boolean conredistribute, java.lang.String connectedroutemap) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setrouterbgp_neighbor(org.apache.axis.types.UnsignedInt autonomoussystem, java.lang.String neighbor, org.apache.axis.types.UnsignedInt remoteas, java.lang.String neighborroutemap) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setrouterbgp_network(org.apache.axis.types.UnsignedInt autonomoussystem, java.lang.String network, java.lang.String netmask) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetrouterbgp_autonomoussystem() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetrouterbgp_routerid(org.apache.axis.types.UnsignedInt autonomoussystem) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetrouterbgp_learnroute(org.apache.axis.types.UnsignedInt autonomoussystem) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetrouterbgp_staticredistribute(org.apache.axis.types.UnsignedInt autonomoussystem) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetrouterbgp_kernelredistribute(org.apache.axis.types.UnsignedInt autonomoussystem) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetrouterbgp_conredistribute(org.apache.axis.types.UnsignedInt autonomoussystem) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetrouterbgp_neighbor(org.apache.axis.types.UnsignedInt autonomoussystem) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetrouterbgp_network(org.apache.axis.types.UnsignedInt autonomoussystem) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetrouterbgp_remoteas(org.apache.axis.types.UnsignedInt autonomoussystem) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setrouterospf_routerid(java.lang.String routerid) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setrouterospf_passiveinterface(java.lang.String passiveinterface) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setrouterospf_staticredistribute(boolean staticredistribute, int staticmetrictype) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setrouterospf_kernelredistribute(boolean kernelredistribute, int kernelmetrictype) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setrouterospf_conredistribute(boolean conredistribute, int conmetrictype) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setrouterospf_learnroute(boolean learnroute) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setrouterospf_network(java.lang.String network, java.lang.String netmask, int area) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setrouterospf_host(java.lang.String host, int cost) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetrouterospf_routerid() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetrouterospf_learnroute() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetrouterospf_conredistribute() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetrouterospf_kernelredistribute() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetrouterospf_staticredistribute() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetrouterospf_network() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetrouterospf_host() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetrouterospf_passiveinterface() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetrouterospf_staticmetrictype() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetrouterospf_kernelmetrictype() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetrouterospf_conmetrictype() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.GetrouterospfResult getrouterospf(java.lang.String ospfoptions) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setrouterrip_defaultmetric(int defaultmetric) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setrouterrip_passiveinterface(java.lang.String passiveinterface) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setrouterrip_learnroute(boolean learnroute) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setrouterrip_staticredistribute(boolean staticredistribute) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setrouterrip_kernelredistribute(boolean kernelredistribute) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult setrouterrip_network(java.lang.String network, java.lang.String netmask) throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetrouterrip_defaultmetric() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetrouterrip_staticredistribute() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetrouterrip_learnroute() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetrouterrip_kernelredistribute() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetrouterrip_passiveinterface() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.SimpleResult unsetrouterrip_network() throws java.rmi.RemoteException;

    /**
     * This API is deprecated.
     */
    public NSConfig.GetrouterripResult getrouterrip(java.lang.String ripoptions) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addsnmpcommunity(java.lang.String communityname, NSConfig.SnmppermEnum permissions) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmsnmpcommunity(java.lang.String communityname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsnmpcommunityResult getsnmpcommunity(java.lang.String communityname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addsnmpmanager(java.lang.String ipaddress, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmsnmpmanager(java.lang.String ipaddress, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsnmpmanager_domainresolveretry(java.lang.String ipaddress, java.lang.String netmask, int domainresolveretry) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsnmpmanager_domainresolveretry(java.lang.String ipaddress, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsnmpmanagerResult getsnmpmanager(java.lang.String ipaddress, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addsnmptrap(NSConfig.TrapclassEnum trapclass, java.lang.String trapdestination) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmsnmptrap(NSConfig.TrapclassEnum trapclass, java.lang.String trapdestination) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsnmptrap_destport(NSConfig.TrapclassEnum trapclass, java.lang.String trapdestination, org.apache.axis.types.UnsignedInt destport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsnmptrap_version(NSConfig.TrapclassEnum trapclass, java.lang.String trapdestination, NSConfig.TrapversionEnum version) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsnmptrap_communityname(NSConfig.TrapclassEnum trapclass, java.lang.String trapdestination, java.lang.String communityname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsnmptrap_srcip(NSConfig.TrapclassEnum trapclass, java.lang.String trapdestination, java.lang.String srcip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsnmptrap_severity(NSConfig.TrapclassEnum trapclass, java.lang.String trapdestination, NSConfig.TrapseverityEnum severity) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsnmptrap_destport(NSConfig.TrapclassEnum trapclass, java.lang.String trapdestination) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsnmptrap_version(NSConfig.TrapclassEnum trapclass, java.lang.String trapdestination) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsnmptrap_communityname(NSConfig.TrapclassEnum trapclass, java.lang.String trapdestination) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsnmptrap_srcip(NSConfig.TrapclassEnum trapclass, java.lang.String trapdestination) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsnmptrap_severity(NSConfig.TrapclassEnum trapclass, java.lang.String trapdestination) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsnmptrapResult getsnmptrap(java.lang.String trapclass, java.lang.String trapdestination) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addsnmpgroup(java.lang.String name, NSConfig.SecuritylevelEnum securitylevel, java.lang.String readviewname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmsnmpgroup(java.lang.String name, NSConfig.SecuritylevelEnum securitylevel) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsnmpgroup_readviewname(java.lang.String name, NSConfig.SecuritylevelEnum securitylevel, java.lang.String readviewname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsnmpgroupResult getsnmpgroup(java.lang.String name, java.lang.String securitylevel) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addsnmpview(java.lang.String name, java.lang.String subtree, NSConfig.SubtreetypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmsnmpview(java.lang.String name, java.lang.String subtree) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsnmpview_type(java.lang.String name, java.lang.String subtree, NSConfig.SubtreetypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsnmpviewResult getsnmpview(java.lang.String name, java.lang.String subtree) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addsnmpuser(java.lang.String name, java.lang.String group, NSConfig.SnmpauthtypeEnum authtype, java.lang.String authpasswd, NSConfig.PrivtypeEnum privtype, java.lang.String privpasswd) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmsnmpuser(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsnmpuser_group(java.lang.String name, java.lang.String group) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsnmpuser_authtype(java.lang.String name, NSConfig.SnmpauthtypeEnum authtype, java.lang.String authpasswd) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsnmpuser_privtype(java.lang.String name, NSConfig.PrivtypeEnum privtype, java.lang.String privpasswd) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsnmpuser_authtype(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsnmpuser_privtype(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsnmpuser_authpasswd(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsnmpuser_privpasswd(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsnmpuserResult getsnmpuser(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsnmpoidResult getsnmpoid(java.lang.String entitytype, java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsnmpalarm_thresholdvalue(NSConfig.ThresholdsEnum trapname, org.apache.axis.types.UnsignedInt thresholdvalue, org.apache.axis.types.UnsignedInt normalvalue) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsnmpalarm_time(NSConfig.ThresholdsEnum trapname, org.apache.axis.types.UnsignedInt time) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsnmpalarm_state(NSConfig.ThresholdsEnum trapname, NSConfig.Enabledisabled3Enum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsnmpalarm_severity(NSConfig.ThresholdsEnum trapname, NSConfig.TrapseverityEnum severity) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsnmpalarm_logging(NSConfig.ThresholdsEnum trapname, NSConfig.EnabledisabledEnum logging) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsnmpalarm_thresholdvalue(NSConfig.ThresholdsEnum trapname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsnmpalarm_normalvalue(NSConfig.ThresholdsEnum trapname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsnmpalarm_time(NSConfig.ThresholdsEnum trapname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsnmpalarm_state(NSConfig.ThresholdsEnum trapname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsnmpalarm_severity(NSConfig.ThresholdsEnum trapname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsnmpalarm_logging(NSConfig.ThresholdsEnum trapname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult enablesnmpalarm(NSConfig.ThresholdsEnum trapname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disablesnmpalarm(NSConfig.ThresholdsEnum trapname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsnmpalarmResult getsnmpalarm(java.lang.String trapname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsnmpmib_contact(java.lang.String contact) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsnmpmib_name(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsnmpmib_location(java.lang.String location) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsnmpmib_customid(java.lang.String customid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsnmpmib_contact() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsnmpmib_name() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsnmpmib_location() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsnmpmib_customid() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsnmpmibResult getsnmpmib() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsnmpengineid_engineid(java.lang.String engineid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsnmpengineidResult getsnmpengineid() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsnmpoption_snmpset(NSConfig.EnabledisabledEnum snmpset) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsnmpoption_snmptraplogging(NSConfig.EnabledisabledEnum snmptraplogging) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsnmpoption_snmpset() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsnmpoption_snmptraplogging() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsnmpoptionResult getsnmpoption() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addspilloverpolicy(java.lang.String name, java.lang.String rule, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmspilloverpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setspilloverpolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setspilloverpolicy_action(java.lang.String name, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setspilloverpolicy_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetspilloverpolicy_comment(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetspilloverpolicyResult getspilloverpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renamespilloverpolicy(java.lang.String name, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addspilloveraction(java.lang.String name, NSConfig.SpilloveractiontypeEnum actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmspilloveraction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetspilloveractionResult getspilloveraction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renamespilloveraction(java.lang.String name, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addscpolicy(java.lang.String name, java.lang.String url, java.lang.String rule, org.apache.axis.types.UnsignedInt delay, org.apache.axis.types.UnsignedInt maxconn, NSConfig.ScactionEnum actioN, java.lang.String altcontentsvcname, java.lang.String altcontentpath) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmscpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setscpolicy_url(java.lang.String name, java.lang.String url) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setscpolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setscpolicy_delay(java.lang.String name, org.apache.axis.types.UnsignedInt delay) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setscpolicy_maxconn(java.lang.String name, org.apache.axis.types.UnsignedInt maxconn) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setscpolicy_action(java.lang.String name, NSConfig.ScactionEnum actioN, java.lang.String altcontentsvcname, java.lang.String altcontentpath) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetscpolicy_delay(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetscpolicy_maxconn(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetscpolicyResult getscpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setscparameter_sessionlife(org.apache.axis.types.UnsignedInt sessionlife) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setscparameter_vsr(java.lang.String vsr) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetscparameter_sessionlife() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetscparameter_vsr() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetscparameterResult getscparameter() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult createsslfipskey(java.lang.String fipskeyname, org.apache.axis.types.UnsignedInt modulus, NSConfig.FipskeyexpEnum exponent) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmsslfipskey(java.lang.String fipskeyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsslfipskeyResult getsslfipskey(java.lang.String fipskeyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult importsslfipskey(java.lang.String fipskeyname, java.lang.String key, NSConfig.FipskeyinformEnum inform, java.lang.String wrapkeyname, java.lang.String iv) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult importsslfipskeyEx(java.lang.String fipskeyname, java.lang.String key, NSConfig.FipskeyinformEnum inform, java.lang.String wrapkeyname, java.lang.String iv, NSConfig.FipskeyexpEnum exponent) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult exportsslfipskey(java.lang.String fipskeyname, java.lang.String key) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult createsslwrapkey(java.lang.String wrapkeyname, java.lang.String password, java.lang.String salt) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmsslwrapkey(java.lang.String wrapkeyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsslwrapkeyResult getsslwrapkey() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addsslcertkey(java.lang.String certkeyname, java.lang.String cert, java.lang.String key, boolean password, java.lang.String fipskey, NSConfig.InformatsEnum inform, NSConfig.EnabledisabledEnum expirymonitor, org.apache.axis.types.UnsignedInt notificationperiod) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addsslcertkeyEx(java.lang.String certkeyname, java.lang.String cert, java.lang.String key, boolean password, java.lang.String fipskey, NSConfig.InformatsEnum inform, java.lang.String passplain, NSConfig.EnabledisabledEnum expirymonitor, org.apache.axis.types.UnsignedInt notificationperiod) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addsslcertkeyEx2(java.lang.String certkeyname, java.lang.String cert, java.lang.String key, boolean password, java.lang.String fipskey, NSConfig.InformatsEnum inform, java.lang.String passplain, NSConfig.EnabledisabledEnum expirymonitor, org.apache.axis.types.UnsignedInt notificationperiod, NSConfig.YesnoEnum bundle) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmsslcertkey(java.lang.String certkeyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslcertkey_expirymonitor(java.lang.String certkeyname, NSConfig.EnabledisabledEnum expirymonitor, org.apache.axis.types.UnsignedInt notificationperiod) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslcertkey_expirymonitor(java.lang.String certkeyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslcertkey_notificationperiod(java.lang.String certkeyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslcertkey_ocspresponder(java.lang.String certkeyname, java.lang.String ocspresponder, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslcertkey_vserver(java.lang.String certkeyname, java.lang.String vservername, boolean vserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslcertkey_service(java.lang.String certkeyname, java.lang.String servicename, boolean service) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslcertkey_servicegroup(java.lang.String certkeyname, java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslcertkey_certkeyname2(java.lang.String certkeyname, java.lang.String certkeyname2) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslcertkey_ca(java.lang.String certkeyname, boolean ca, NSConfig.CrlcheckEnum crlcheck) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsslcertkey_ocspresponder(java.lang.String certkeyname, java.lang.String ocspresponder) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsslcertkey_vserver(java.lang.String certkeyname, java.lang.String vservername, boolean vserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsslcertkey_service(java.lang.String certkeyname, java.lang.String servicename, boolean service) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsslcertkey_servicegroup(java.lang.String certkeyname, java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsslcertkey_certkeyname2(java.lang.String certkeyname, java.lang.String certkeyname2) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsslcertkey_ca(java.lang.String certkeyname, boolean ca) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult linksslcertkey(java.lang.String certkeyname, java.lang.String linkcertkeyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unlinksslcertkey(java.lang.String certkeyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsslcertkeyResult getsslcertkey(java.lang.String certkeyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult updatesslcertkey(java.lang.String certkeyname, java.lang.String cert, java.lang.String key, boolean password, java.lang.String fipskey, NSConfig.InformatsEnum inform, boolean nodomaincheck) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult updatesslcertkeyEx(java.lang.String certkeyname, java.lang.String cert, java.lang.String key, boolean password, java.lang.String fipskey, NSConfig.InformatsEnum inform, java.lang.String passplain, boolean nodomaincheck) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsslciphersuiteResult getsslciphersuite(java.lang.String ciphername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addsslcipher(java.lang.String ciphergroupname, java.lang.String cipheraliasname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslcipher_vserver(java.lang.String ciphergroupname, java.lang.String vservername, boolean vserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslcipher_service(java.lang.String ciphergroupname, java.lang.String servicename, boolean service) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslcipher_servicegroup(java.lang.String ciphergroupname, java.lang.String servicegroupname, boolean servicegroup) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslcipher_cipheralias(java.lang.String ciphergroupname, java.lang.String cipheraliasname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslcipher_ciphername(java.lang.String ciphergroupname, java.lang.String ciphername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsslcipherResult getsslcipher(java.lang.String ciphergroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmsslcipher(java.lang.String ciphergroupname, java.lang.String ciphername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsslcipher_cipher(java.lang.String ciphergroupname, java.lang.String ciphername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addsslcrl(java.lang.String crlname, java.lang.String crlpath, NSConfig.InformatsEnum inform) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmsslcrl(java.lang.String crlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslcrl_refresh(java.lang.String crlname, NSConfig.EnabledisabledEnum refresh) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslcrl_cacert(java.lang.String crlname, java.lang.String cacert) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslcrl_server(java.lang.String crlname, java.lang.String server) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslcrl_method(java.lang.String crlname, NSConfig.RefreshmethodEnum method, java.lang.String url) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslcrl_port(java.lang.String crlname, org.apache.axis.types.UnsignedInt port) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslcrl_basedn(java.lang.String crlname, java.lang.String basedn) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslcrl_scope(java.lang.String crlname, NSConfig.LdapsrchscopeEnum scope) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslcrl_interval(java.lang.String crlname, NSConfig.RefreshintervlEnum interval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslcrl_day(java.lang.String crlname, int day) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslcrl_time(java.lang.String crlname, java.lang.String time) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslcrl_binddn(java.lang.String crlname, java.lang.String binddn) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslcrl_password(java.lang.String crlname, java.lang.String password) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslcrl_binary(java.lang.String crlname, NSConfig.YesnoEnum binary) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslcrl_refresh(java.lang.String crlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslcrl_cacert(java.lang.String crlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslcrl_server(java.lang.String crlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslcrl_method(java.lang.String crlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslcrl_url(java.lang.String crlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslcrl_port(java.lang.String crlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslcrl_basedn(java.lang.String crlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslcrl_scope(java.lang.String crlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslcrl_interval(java.lang.String crlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslcrl_day(java.lang.String crlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslcrl_time(java.lang.String crlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslcrl_binddn(java.lang.String crlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslcrl_password(java.lang.String crlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslcrl_binary(java.lang.String crlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsslcrlResult getsslcrl(java.lang.String crlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addsslaction(java.lang.String name, NSConfig.ClntauthEnum clientauth, NSConfig.EnabledisablednzEnum clientcert, java.lang.String certheader, NSConfig.EnabledisablednzEnum clientcertserialnumber, java.lang.String certserialheader, NSConfig.EnabledisablednzEnum clientcertsubject, java.lang.String certsubjectheader, NSConfig.EnabledisablednzEnum clientcerthash, java.lang.String certhashheader, NSConfig.EnabledisablednzEnum clientcertissuer, java.lang.String certissuerheader, NSConfig.EnabledisablednzEnum sessionid, java.lang.String sessionidheader, NSConfig.EnabledisablednzEnum cipher, java.lang.String cipherheader, NSConfig.EnabledisablednzEnum clientcertnotbefore, java.lang.String certnotbeforeheader, NSConfig.EnabledisablednzEnum clientcertnotafter, java.lang.String certnotafterheader, NSConfig.EnabledisablednzEnum owasupport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmsslaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsslactionResult getsslaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addsslpolicy(java.lang.String name, java.lang.String rule, java.lang.String reqaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addsslpolicyEx(java.lang.String name, java.lang.String rule, java.lang.String reqaction, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmsslpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslpolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslpolicy_action(java.lang.String name, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslpolicy_undefaction(java.lang.String name, java.lang.String undefaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslpolicy_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslpolicy_undefaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslpolicy_comment(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsslpolicyResult getsslpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addsslpolicylabel(java.lang.String labelname, NSConfig.Ssl_policy_label_typeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmsslpolicylabel(java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslpolicylabel_policy(java.lang.String labelname, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, java.lang.String gotopriorityexpression, boolean invoke, NSConfig.Ssl_policy_label_invoke_typeEnum labeltype, java.lang.String labelname2) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsslpolicylabel_policy(java.lang.String labelname, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsslpolicylabelResult getsslpolicylabel(java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addsslocspresponder(java.lang.String name, java.lang.String url, NSConfig.GenericenabledisableEnum cache, org.apache.axis.types.UnsignedInt cachetimeout, org.apache.axis.types.UnsignedInt batchingdepth, org.apache.axis.types.UnsignedInt batchingdelay, org.apache.axis.types.UnsignedInt resptimeout, java.lang.String respondercert, boolean trustresponder, org.apache.axis.types.UnsignedInt producedattimeskew, java.lang.String signingcert, NSConfig.YesnoEnum usenonce) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmsslocspresponder(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslocspresponder_url(java.lang.String name, java.lang.String url) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslocspresponder_cache(java.lang.String name, NSConfig.GenericenabledisableEnum cache) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslocspresponder_cachetimeout(java.lang.String name, org.apache.axis.types.UnsignedInt cachetimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslocspresponder_batchingdepth(java.lang.String name, org.apache.axis.types.UnsignedInt batchingdepth) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslocspresponder_batchingdelay(java.lang.String name, org.apache.axis.types.UnsignedInt batchingdelay) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslocspresponder_resptimeout(java.lang.String name, org.apache.axis.types.UnsignedInt resptimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslocspresponder_respondercert(java.lang.String name, java.lang.String respondercert, boolean trustresponder) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslocspresponder_producedattimeskew(java.lang.String name, org.apache.axis.types.UnsignedInt producedattimeskew) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslocspresponder_signingcert(java.lang.String name, java.lang.String signingcert) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslocspresponder_usenonce(java.lang.String name, NSConfig.YesnoEnum usenonce) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslocspresponder_insertclientcert(java.lang.String name, NSConfig.YesnoEnum insertclientcert) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslocspresponder_trustresponder(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslocspresponder_insertclientcert(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslocspresponder_cache(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslocspresponder_cachetimeout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslocspresponder_batchingdepth(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslocspresponder_batchingdelay(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslocspresponder_resptimeout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslocspresponder_respondercert(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslocspresponder_producedattimeskew(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslocspresponder_signingcert(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslocspresponder_usenonce(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsslocspresponderResult getsslocspresponder(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsslcertlinkResult getsslcertlink() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslparameter_quantumsize(NSConfig.Ssl_params_quantumEnum quantumsize) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslparameter_crlmemorysizemb(org.apache.axis.types.UnsignedInt crlmemorysizemb) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslparameter_strictcachecks(NSConfig.YesnoEnum strictcachecks) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslparameter_ssltriggertimeout(org.apache.axis.types.UnsignedInt ssltriggertimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslparameter_sendclosenotify(NSConfig.YesnoEnum sendclosenotify) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslparameter_encrypttriggerpktcount(org.apache.axis.types.UnsignedInt encrypttriggerpktcount) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslparameter_denysslreneg(NSConfig.Ssl_renegEnum denysslreneg) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslparameter_insertionencoding(NSConfig.InsertionencodeEnum insertionencoding) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslparameter_ocspcachesize(org.apache.axis.types.UnsignedInt ocspcachesize) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslparameter_pushflag(org.apache.axis.types.UnsignedInt pushflag) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslparameter_dropreqwithnohostheader(NSConfig.YesnoEnum dropreqwithnohostheader) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslparameter_pushenctriggertimeout(org.apache.axis.types.UnsignedInt pushenctriggertimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslparameter_undefactioncontrol(java.lang.String undefactioncontrol) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslparameter_undefactiondata(java.lang.String undefactiondata) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslparameter_quantumsize() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslparameter_crlmemorysizemb() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslparameter_strictcachecks() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslparameter_ssltriggertimeout() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslparameter_sendclosenotify() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslparameter_encrypttriggerpktcount() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslparameter_denysslreneg() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslparameter_insertionencoding() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslparameter_ocspcachesize() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslparameter_pushflag() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslparameter_dropreqwithnohostheader() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslparameter_pushenctriggertimeout() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslparameter_undefactioncontrol() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslparameter_undefactiondata() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsslparameterResult getsslparameter() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslfips_inithsm(java.lang.String sopassword, java.lang.String oldsopassword, java.lang.String userpassword, NSConfig.FipsinitlevelEnum inithsm) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslfips_sopassword(NSConfig.FipsinitlevelEnum inithsm, java.lang.String oldsopassword, java.lang.String userpassword, java.lang.String sopassword) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslfips_oldsopassword(NSConfig.FipsinitlevelEnum inithsm, java.lang.String sopassword, java.lang.String userpassword, java.lang.String oldsopassword) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslfips_userpassword(NSConfig.FipsinitlevelEnum inithsm, java.lang.String sopassword, java.lang.String oldsopassword, java.lang.String userpassword) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslfips_hsmlabel(NSConfig.FipsinitlevelEnum inithsm, java.lang.String sopassword, java.lang.String oldsopassword, java.lang.String userpassword, java.lang.String hsmlabel) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslfips_hsmlabel() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult resetsslfips() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsslfipsResult getsslfips() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult updatesslfips(NSConfig.FipsfwupdateEnum fipsfw) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslservice_dh(java.lang.String servicename, NSConfig.EnabledisabledEnum dh, java.lang.String dhfile) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslservice_dhcount(java.lang.String servicename, org.apache.axis.types.UnsignedInt dhcount) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslservice_ersa(java.lang.String servicename, NSConfig.EnabledisabledEnum ersa, org.apache.axis.types.UnsignedInt ersacount) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslservice_sessreuse(java.lang.String servicename, NSConfig.EnabledisabledEnum sessreuse, org.apache.axis.types.UnsignedInt sesstimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslservice_cipherredirect(java.lang.String servicename, NSConfig.EnabledisabledEnum cipherredirect, java.lang.String cipherurl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslservice_sslv2Redirect(java.lang.String servicename, NSConfig.EnabledisabledEnum sslv2Redirect, java.lang.String sslv2Url) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslservice_clientauth(java.lang.String servicename, NSConfig.EnabledisabledEnum clientauth, NSConfig.Client_authcertEnum clientcert) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslservice_sslredirect(java.lang.String servicename, NSConfig.EnabledisabledEnum sslredirect) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslservice_redirectportrewrite(java.lang.String servicename, NSConfig.EnabledisabledEnum redirectportrewrite) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslservice_nonfipsciphers(java.lang.String servicename, NSConfig.EnabledisabledEnum nonfipsciphers) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslservice_ssl2(java.lang.String servicename, NSConfig.EnabledisabledEnum ssl2) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslservice_ssl3(java.lang.String servicename, NSConfig.EnabledisabledEnum ssl3) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslservice_tls1(java.lang.String servicename, NSConfig.EnabledisabledEnum tls1) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslservice_tls11(java.lang.String servicename, NSConfig.EnabledisabledEnum tls11) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslservice_tls12(java.lang.String servicename, NSConfig.EnabledisabledEnum tls12) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslservice_snienable(java.lang.String servicename, NSConfig.EnabledisabledEnum snienable) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslservice_serverauth(java.lang.String servicename, NSConfig.EnabledisabledEnum serverauth, java.lang.String commonname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslservice_pushenctrigger(java.lang.String servicename, NSConfig.Ssl_push_enc_triggerEnum pushenctrigger) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslservice_sendclosenotify(java.lang.String servicename, NSConfig.YesnoEnum sendclosenotify) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslservice_dtlsprofile(java.lang.String servicename, java.lang.String dtlsprofilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservice_dh(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservice_dhfile(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservice_dhcount(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservice_ersa(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservice_ersacount(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservice_sessreuse(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservice_sesstimeout(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservice_cipherredirect(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservice_cipherurl(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservice_sslv2Redirect(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservice_sslv2Url(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservice_clientauth(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservice_clientcert(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservice_sslredirect(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservice_redirectportrewrite(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservice_nonfipsciphers(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservice_ssl2(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservice_ssl3(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservice_tls1(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservice_tls11(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservice_tls12(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservice_snienable(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservice_serverauth(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservice_commonname(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservice_sendclosenotify(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservice_dtlsprofilename(java.lang.String servicename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslservice_policyname(java.lang.String servicename, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslservice_policynameEx(java.lang.String servicename, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, java.lang.String gotopriorityexpression, boolean invoke, NSConfig.Ssl_policy_label_invoke_typeEnum labeltype, java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslservice_certkeyname(java.lang.String servicename, java.lang.String certkeyname, boolean ca, NSConfig.CrlcheckEnum crlcheck) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslservice_certkeynameEx(java.lang.String servicename, java.lang.String certkeyname, boolean ca, NSConfig.CrlcheckEnum crlcheck, boolean snicert, NSConfig.CrlcheckEnum ocspcheck) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslservice_certkeynameEx2(java.lang.String servicename, java.lang.String certkeyname, boolean ca, NSConfig.CrlcheckEnum crlcheck, boolean skipcaname, boolean snicert, NSConfig.CrlcheckEnum ocspcheck) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslservice_ciphername(java.lang.String servicename, java.lang.String ciphername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsslservice_policyname(java.lang.String servicename, java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsslservice_policynameEx(java.lang.String servicename, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsslservice_certkeyname(java.lang.String servicename, java.lang.String certkeyname, boolean ca, NSConfig.CrlcheckEnum crlcheck) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsslservice_certkeynameEx(java.lang.String servicename, java.lang.String certkeyname, boolean ca, NSConfig.CrlcheckEnum crlcheck, boolean snicert) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsslservice_ciphername(java.lang.String servicename, java.lang.String ciphername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsslserviceResult getsslservice(java.lang.String servicename, boolean cipherdetails) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslservicegroup_sessreuse(java.lang.String servicegroupname, NSConfig.EnabledisabledEnum sessreuse, org.apache.axis.types.UnsignedInt sesstimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslservicegroup_nonfipsciphers(java.lang.String servicegroupname, NSConfig.EnabledisabledEnum nonfipsciphers) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslservicegroup_ssl3(java.lang.String servicegroupname, NSConfig.EnabledisabledEnum ssl3) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslservicegroup_tls1(java.lang.String servicegroupname, NSConfig.EnabledisabledEnum tls1) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslservicegroup_serverauth(java.lang.String servicegroupname, NSConfig.EnabledisabledEnum serverauth, java.lang.String commonname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslservicegroup_sendclosenotify(java.lang.String servicegroupname, NSConfig.YesnoEnum sendclosenotify) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservicegroup_sessreuse(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservicegroup_sesstimeout(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservicegroup_nonfipsciphers(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservicegroup_ssl3(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservicegroup_tls1(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservicegroup_serverauth(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservicegroup_commonname(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslservicegroup_sendclosenotify(java.lang.String servicegroupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslservicegroup_certkeyname(java.lang.String servicegroupname, java.lang.String certkeyname, boolean ca, NSConfig.CrlcheckEnum crlcheck) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslservicegroup_certkeynameEx(java.lang.String servicegroupname, java.lang.String certkeyname, boolean ca, NSConfig.CrlcheckEnum crlcheck, boolean snicert, NSConfig.CrlcheckEnum ocspcheck) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslservicegroup_ciphername(java.lang.String servicegroupname, java.lang.String ciphername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsslservicegroup_certkeyname(java.lang.String servicegroupname, java.lang.String certkeyname, boolean ca, NSConfig.CrlcheckEnum crlcheck) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsslservicegroup_certkeynameEx(java.lang.String servicegroupname, java.lang.String certkeyname, boolean ca, NSConfig.CrlcheckEnum crlcheck, boolean snicert) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsslservicegroup_ciphername(java.lang.String servicegroupname, java.lang.String ciphername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsslservicegroupResult getsslservicegroup(java.lang.String servicegroupname, boolean cipherdetails) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslvserver_cleartextport(java.lang.String vservername, org.apache.axis.types.UnsignedInt cleartextport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslvserver_dh(java.lang.String vservername, NSConfig.EnabledisabledEnum dh, java.lang.String dhfile) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslvserver_dhcount(java.lang.String vservername, org.apache.axis.types.UnsignedInt dhcount) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslvserver_ersa(java.lang.String vservername, NSConfig.EnabledisabledEnum ersa, org.apache.axis.types.UnsignedInt ersacount) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslvserver_sessreuse(java.lang.String vservername, NSConfig.EnabledisabledEnum sessreuse, org.apache.axis.types.UnsignedInt sesstimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslvserver_cipherredirect(java.lang.String vservername, NSConfig.EnabledisabledEnum cipherredirect, java.lang.String cipherurl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslvserver_sslv2Redirect(java.lang.String vservername, NSConfig.EnabledisabledEnum sslv2Redirect, java.lang.String sslv2Url) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslvserver_clientauth(java.lang.String vservername, NSConfig.EnabledisabledEnum clientauth, NSConfig.Client_authcertEnum clientcert) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslvserver_sslredirect(java.lang.String vservername, NSConfig.EnabledisabledEnum sslredirect) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslvserver_redirectportrewrite(java.lang.String vservername, NSConfig.EnabledisabledEnum redirectportrewrite) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslvserver_nonfipsciphers(java.lang.String vservername, NSConfig.EnabledisabledEnum nonfipsciphers) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslvserver_ssl2(java.lang.String vservername, NSConfig.EnabledisabledEnum ssl2) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslvserver_ssl3(java.lang.String vservername, NSConfig.EnabledisabledEnum ssl3) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslvserver_tls1(java.lang.String vservername, NSConfig.EnabledisabledEnum tls1) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslvserver_tls11(java.lang.String vservername, NSConfig.EnabledisabledEnum tls11) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslvserver_tls12(java.lang.String vservername, NSConfig.EnabledisabledEnum tls12) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslvserver_snienable(java.lang.String vservername, NSConfig.EnabledisabledEnum snienable) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslvserver_pushenctrigger(java.lang.String vservername, NSConfig.Ssl_push_enc_triggerEnum pushenctrigger) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslvserver_sendclosenotify(java.lang.String vservername, NSConfig.YesnoEnum sendclosenotify) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsslvserver_dtlsprofile(java.lang.String vservername, java.lang.String dtlsprofilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslvserver_cleartextport(java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslvserver_dh(java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslvserver_dhfile(java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslvserver_dhcount(java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslvserver_ersa(java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslvserver_ersacount(java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslvserver_sessreuse(java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslvserver_sesstimeout(java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslvserver_cipherredirect(java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslvserver_cipherurl(java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslvserver_sslv2Redirect(java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslvserver_sslv2Url(java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslvserver_clientauth(java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslvserver_clientcert(java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslvserver_sslredirect(java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslvserver_redirectportrewrite(java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslvserver_nonfipsciphers(java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslvserver_ssl2(java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslvserver_ssl3(java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslvserver_tls1(java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslvserver_tls11(java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslvserver_tls12(java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslvserver_snienable(java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslvserver_sendclosenotify(java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsslvserver_dtlsprofilename(java.lang.String vservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslvserver_policyname(java.lang.String vservername, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslvserver_policynameEx(java.lang.String vservername, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, java.lang.String gotopriorityexpression, boolean invoke, NSConfig.Ssl_policy_label_invoke_typeEnum labeltype, java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslvserver_certkeyname(java.lang.String vservername, java.lang.String certkeyname, boolean ca, NSConfig.CrlcheckEnum crlcheck) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslvserver_certkeynameEx(java.lang.String vservername, java.lang.String certkeyname, boolean ca, NSConfig.CrlcheckEnum crlcheck, boolean snicert, NSConfig.CrlcheckEnum ocspcheck) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslvserver_certkeynameEx2(java.lang.String vservername, java.lang.String certkeyname, boolean ca, NSConfig.CrlcheckEnum crlcheck, boolean skipcaname, boolean snicert, NSConfig.CrlcheckEnum ocspcheck) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslvserver_ciphername(java.lang.String vservername, java.lang.String ciphername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsslvserver_policyname(java.lang.String vservername, java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsslvserver_policynameEx(java.lang.String vservername, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsslvserver_certkeyname(java.lang.String vservername, java.lang.String certkeyname, boolean ca, NSConfig.CrlcheckEnum crlcheck) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsslvserver_certkeynameEx(java.lang.String vservername, java.lang.String certkeyname, boolean ca, NSConfig.CrlcheckEnum crlcheck, boolean snicert, NSConfig.CrlcheckEnum ocspcheck) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsslvserver_ciphername(java.lang.String vservername, java.lang.String ciphername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsslvserverResult getsslvserver(java.lang.String vservername, boolean cipherdetails) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult enablesslfipssimtarget(java.lang.String keyvector, java.lang.String sourcesecret) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult initsslfipssimtarget(java.lang.String certfile, java.lang.String keyvector, java.lang.String targetsecret) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult enablesslfipssimsource(java.lang.String targetsecret, java.lang.String sourcesecret) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult initsslfipssimsource(java.lang.String certfile) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslglobal_policyname(java.lang.String policyname, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsslglobal_policynameEx(java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, NSConfig.SslglobalbindpointEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsslglobal_policyname(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsslglobal_policynameEx(java.lang.String policyname, NSConfig.SslglobalbindpointEnum type, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsslglobalResult getsslglobal() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsslglobalResult getsslglobalEx(java.lang.String type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addssldtlsprofile(java.lang.String name, NSConfig.EnabledisabledEnum pmtudiscovery, org.apache.axis.types.UnsignedInt maxrecordsize, org.apache.axis.types.UnsignedInt maxretrytime, NSConfig.EnabledisabledEnum helloverifyrequest, NSConfig.EnabledisabledEnum terminatesession, org.apache.axis.types.UnsignedInt maxpacketsize) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmssldtlsprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setssldtlsprofile_pmtudiscovery(java.lang.String name, NSConfig.EnabledisabledEnum pmtudiscovery) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setssldtlsprofile_maxrecordsize(java.lang.String name, org.apache.axis.types.UnsignedInt maxrecordsize) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setssldtlsprofile_maxretrytime(java.lang.String name, org.apache.axis.types.UnsignedInt maxretrytime) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setssldtlsprofile_helloverifyrequest(java.lang.String name, NSConfig.EnabledisabledEnum helloverifyrequest) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setssldtlsprofile_terminatesession(java.lang.String name, NSConfig.EnabledisabledEnum terminatesession) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setssldtlsprofile_maxpacketsize(java.lang.String name, org.apache.axis.types.UnsignedInt maxpacketsize) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetssldtlsprofile_pmtudiscovery(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetssldtlsprofile_maxrecordsize(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetssldtlsprofile_maxretrytime(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetssldtlsprofile_helloverifyrequest(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetssldtlsprofile_terminatesession(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetssldtlsprofile_maxpacketsize(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetssldtlsprofileResult getssldtlsprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addstreamselector(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setstreamselector_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmstreamselector(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetstreamselectorResult getstreamselector(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addstreamidentifier(java.lang.String name, java.lang.String selectorname, org.apache.axis.types.UnsignedInt interval, org.apache.axis.types.UnsignedInt samplecount, NSConfig.StreamdimensionEnum sort) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setstreamidentifier_selector(java.lang.String name, java.lang.String selectorname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setstreamidentifier_interval(java.lang.String name, org.apache.axis.types.UnsignedInt interval) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setstreamidentifier_samplecount(java.lang.String name, org.apache.axis.types.UnsignedInt samplecount) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setstreamidentifier_sort(java.lang.String name, NSConfig.StreamdimensionEnum sort) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetstreamidentifier_selectorname(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetstreamidentifier_interval(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetstreamidentifier_samplecount(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetstreamidentifier_sort(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmstreamidentifier(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetstreamidentifierResult getstreamidentifier(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult clearstreamsession(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addsystemcmdpolicy(java.lang.String policyname, NSConfig.AllowdenyEnum actioN, java.lang.String cmdspec) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmsystemcmdpolicy(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsystemcmdpolicy_action(java.lang.String policyname, java.lang.String cmdspec, NSConfig.AllowdenyEnum actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsystemcmdpolicy_cmdspec(java.lang.String policyname, NSConfig.AllowdenyEnum actioN, java.lang.String cmdspec) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsystemcmdpolicyResult getsystemcmdpolicy(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addsystemuser(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmsystemuser(java.lang.String username) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsystemuser_password(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsystemuser_externalauth(java.lang.String username, NSConfig.ExternalauthEnum externalauth) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsystemuser_promptstring(java.lang.String username, java.lang.String promptstring) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsystemuser_timeout(java.lang.String username, org.apache.axis.types.UnsignedInt timeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsystemuser_externalauth(java.lang.String username) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsystemuser_promptstring(java.lang.String username) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsystemuser_timeout(java.lang.String username) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsystemuser_policy(java.lang.String username, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsystemuser_policy(java.lang.String username, java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsystemuserResult getsystemuser(java.lang.String username) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addsystemgroup(java.lang.String groupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmsystemgroup(java.lang.String groupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsystemgroup_user(java.lang.String groupname, java.lang.String username) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsystemgroup_policy(java.lang.String groupname, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsystemgroup_user(java.lang.String groupname, java.lang.String username) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsystemgroup_policy(java.lang.String groupname, java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsystemgroupResult getsystemgroup(java.lang.String groupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsystemgroup_promptstring(java.lang.String groupname, java.lang.String promptstring) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsystemgroup_timeout(java.lang.String groupname, org.apache.axis.types.UnsignedInt timeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsystemgroup_promptstring(java.lang.String groupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsystemgroup_timeout(java.lang.String groupname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsystemsessionResult getsystemsession(org.apache.axis.types.UnsignedInt sid) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult killsystemsession(org.apache.axis.types.UnsignedInt sid, boolean all) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmsystementitydata(java.lang.String type, java.lang.String name, boolean alldeleted, boolean allinactive, java.lang.String datasource, int core) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsystementitydataResult getsystementitydata(java.lang.String type, java.lang.String name, java.lang.String counters, java.lang.String starttime, java.lang.String endtime, int last, java.lang.String unit, java.lang.String datasource, int core) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsystementityResult getsystementity(java.lang.String type, java.lang.String datasource, int core) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsystemglobaldataResult getsystemglobaldata(java.lang.String counters, java.lang.String countergroup, java.lang.String starttime, java.lang.String endtime, int last, java.lang.String unit, java.lang.String datasource, int core) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsystemcountersResult getsystemcounters(java.lang.String countergroup, java.lang.String datasource) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsystemcountergroupResult getsystemcountergroup(java.lang.String datasource) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsystementitytypeResult getsystementitytype(java.lang.String datasource) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsystemeventhistoryResult getsystemeventhistory(java.lang.String starttime, java.lang.String endtime, int last, java.lang.String unit, java.lang.String datasource) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsystemcoreResult getsystemcore(java.lang.String datasource) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsystemdatasourceResult getsystemdatasource(java.lang.String datasource) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindsystemglobal_policy(java.lang.String policyname, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindsystemglobal_policy(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsystemglobalResult getsystemglobal() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsystemcollectionparam_community(java.lang.String communityname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsystemcollectionparam_loglevel(java.lang.String loglevel) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsystemcollectionparam_datapath(java.lang.String datapath) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsystemcollectionparam_communityname() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsystemcollectionparam_loglevel() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsystemcollectionparam_datapath() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsystemcollectionparamResult getsystemcollectionparam() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsystemparameter_rbaonresponse(NSConfig.EnabledisabledEnum rbaonresponse) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsystemparameter_promptstring(java.lang.String promptstring) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsystemparameter_natpcbforceflushlimit(org.apache.axis.types.UnsignedInt natpcbforceflushlimit) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsystemparameter_natpcbrstontimeout(NSConfig.EnabledisabledEnum natpcbrstontimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setsystemparameter_timeout(org.apache.axis.types.UnsignedInt timeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsystemparameter_rbaonresponse() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsystemparameter_promptstring() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsystemparameter_natpcbforceflushlimit() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsystemparameter_natpcbrstontimeout() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetsystemparameter_timeout() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsystemparameterResult getsystemparameter() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult createsystembackup(java.lang.String filename, NSConfig.SysbackupEnum level, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult restoresystembackup(java.lang.String filename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmsystembackup(java.lang.String filename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetsystembackupResult getsystembackup(java.lang.String filename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addtmsessionpolicy(java.lang.String name, java.lang.String rule, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmtmsessionpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsessionpolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsessionpolicy_action(java.lang.String name, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmsessionpolicy_rule(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmsessionpolicy_action(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GettmsessionpolicyResult gettmsessionpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addtmsessionaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmtmsessionaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsessionaction_sesstimeout(java.lang.String name, org.apache.axis.types.UnsignedInt sesstimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsessionaction_defaultauthorizationaction(java.lang.String name, NSConfig.AllowdenyEnum defaultauthorizationaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsessionaction_sso(java.lang.String name, NSConfig.VpnsessactEnum sso) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsessionaction_ssocredential(java.lang.String name, NSConfig.Vpnsessact_sso_credential_indexEnum ssocredential) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsessionaction_ssodomain(java.lang.String name, java.lang.String ssodomain) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsessionaction_kcdaccount(java.lang.String name, java.lang.String kcdaccount) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsessionaction_httponlycookie(java.lang.String name, NSConfig.Vpnsessact_httonly_cookieEnum httponlycookie) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsessionaction_persistentcookie(java.lang.String name, NSConfig.VpnsessactEnum persistentcookie) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsessionaction_persistentcookievalidity(java.lang.String name, org.apache.axis.types.UnsignedInt persistentcookievalidity) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsessionaction_homepage(java.lang.String name, java.lang.String homepage) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmsessionaction_sesstimeout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmsessionaction_defaultauthorizationaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmsessionaction_sso(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmsessionaction_ssocredential(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmsessionaction_ssodomain(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmsessionaction_kcdaccount(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmsessionaction_httponlycookie(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmsessionaction_persistentcookie(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmsessionaction_persistentcookievalidity(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmsessionaction_homepage(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GettmsessionactionResult gettmsessionaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addtmtrafficpolicy(java.lang.String name, java.lang.String rule, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmtmtrafficpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmtrafficpolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmtrafficpolicy_action(java.lang.String name, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmtrafficpolicy_rule(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmtrafficpolicy_action(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GettmtrafficpolicyResult gettmtrafficpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addtmformssoaction(java.lang.String name, java.lang.String actionurl, java.lang.String userfield, java.lang.String passwdfield, java.lang.String ssosuccessrule, java.lang.String namevaluepair, org.apache.axis.types.UnsignedInt responsesize, NSConfig.ActionfssonvtypeEnum nvtype, NSConfig.ActionfssosubmittypeEnum submitmethod) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmtmformssoaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmformssoaction_actionurl(java.lang.String name, java.lang.String actionurl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmformssoaction_userfield(java.lang.String name, java.lang.String userfield) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmformssoaction_passwdfield(java.lang.String name, java.lang.String passwdfield) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmformssoaction_ssosuccessrule(java.lang.String name, java.lang.String ssosuccessrule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmformssoaction_responsesize(java.lang.String name, org.apache.axis.types.UnsignedInt responsesize) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmformssoaction_namevaluepair(java.lang.String name, java.lang.String namevaluepair) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmformssoaction_nvtype(java.lang.String name, NSConfig.ActionfssonvtypeEnum nvtype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmformssoaction_submitmethod(java.lang.String name, NSConfig.ActionfssosubmittypeEnum submitmethod) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmformssoaction_responsesize(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmformssoaction_namevaluepair(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmformssoaction_nvtype(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmformssoaction_submitmethod(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GettmformssoactionResult gettmformssoaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addtmsamlssoprofile(java.lang.String name, java.lang.String samlsigningcertname, java.lang.String assertionconsumerserviceurl, java.lang.String relaystaterule, NSConfig.OnoffEnum sendpassword, java.lang.String samlissuername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmtmsamlssoprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsamlssoprofile_samlsigningcertname(java.lang.String name, java.lang.String samlsigningcertname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsamlssoprofile_assertionconsumerserviceurl(java.lang.String name, java.lang.String assertionconsumerserviceurl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsamlssoprofile_sendpassword(java.lang.String name, NSConfig.OnoffEnum sendpassword) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsamlssoprofile_samlissuername(java.lang.String name, java.lang.String samlissuername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsamlssoprofile_relaystaterule(java.lang.String name, java.lang.String relaystaterule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmsamlssoprofile_samlsigningcertname(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmsamlssoprofile_sendpassword(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmsamlssoprofile_samlissuername(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GettmsamlssoprofileResult gettmsamlssoprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addtmtrafficaction(java.lang.String name, org.apache.axis.types.UnsignedInt apptimeout, NSConfig.Onoff2Enum sso, NSConfig.Onoff2Enum initiatelogout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmtmtrafficaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmtrafficaction_apptimeout(java.lang.String name, org.apache.axis.types.UnsignedInt apptimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmtrafficaction_sso(java.lang.String name, NSConfig.Onoff2Enum sso) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmtrafficaction_formssoaction(java.lang.String name, java.lang.String formssoaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmtrafficaction_persistentcookie(java.lang.String name, NSConfig.Onoff2Enum persistentcookie) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmtrafficaction_initiatelogout(java.lang.String name, NSConfig.Onoff2Enum initiatelogout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmtrafficaction_kcdaccount(java.lang.String name, java.lang.String kcdaccount) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmtrafficaction_samlssoprofile(java.lang.String name, java.lang.String samlssoprofile) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmtrafficaction_persistentcookie(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmtrafficaction_kcdaccount(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GettmtrafficactionResult gettmtrafficaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindtmglobal_policy(java.lang.String policyname, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindtmglobal_policy(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GettmglobalResult gettmglobal() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsessionparameter_sesstimeout(org.apache.axis.types.UnsignedInt sesstimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsessionparameter_defaultauthorizationaction(NSConfig.AllowdenyEnum defaultauthorizationaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsessionparameter_sso(NSConfig.VpnsessactEnum sso) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsessionparameter_ssocredential(NSConfig.Vpnsessact_sso_credential_indexEnum ssocredential) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsessionparameter_ssodomain(java.lang.String ssodomain) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsessionparameter_kcdaccount(java.lang.String kcdaccount) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsessionparameter_httponlycookie(NSConfig.Vpnsessact_httonly_cookieEnum httponlycookie) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsessionparameter_persistentcookie(NSConfig.VpnsessactEnum persistentcookie) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsessionparameter_persistentcookievalidity(org.apache.axis.types.UnsignedInt persistentcookievalidity) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settmsessionparameter_homepage(java.lang.String homepage) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmsessionparameter_sesstimeout() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmsessionparameter_sso() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmsessionparameter_ssodomain() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmsessionparameter_kcdaccount() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmsessionparameter_persistentcookie() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmsessionparameter_homepage() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmsessionparameter_defaultauthorizationaction() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmsessionparameter_ssocredential() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmsessionparameter_httponlycookie() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettmsessionparameter_persistentcookievalidity() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GettmsessionparameterResult gettmsessionparameter() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addtransformprofile(java.lang.String name, NSConfig.UrltransprofiletypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmtransformprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settransformprofile_type(java.lang.String name, NSConfig.UrltransprofiletypeEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settransformprofile_onlytransformabsurlinbody(java.lang.String name, NSConfig.OnoffEnum onlytransformabsurlinbody) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settransformprofile_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettransformprofile_type(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettransformprofile_onlytransformabsurlinbody(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettransformprofile_comment(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GettransformprofileResult gettransformprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addtransformaction(java.lang.String name, java.lang.String profilename, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmtransformaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settransformaction_priority(java.lang.String name, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settransformaction_requrlfrom(java.lang.String name, java.lang.String requrlfrom) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settransformaction_requrlinto(java.lang.String name, java.lang.String requrlinto) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settransformaction_resurlfrom(java.lang.String name, java.lang.String resurlfrom) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settransformaction_resurlinto(java.lang.String name, java.lang.String resurlinto) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settransformaction_cookiedomainfrom(java.lang.String name, java.lang.String cookiedomainfrom) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settransformaction_cookiedomaininto(java.lang.String name, java.lang.String cookiedomaininto) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settransformaction_state(java.lang.String name, NSConfig.GenericenabledisableEnum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settransformaction_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettransformaction_requrlfrom(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettransformaction_requrlinto(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettransformaction_resurlfrom(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettransformaction_resurlinto(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettransformaction_cookiedomainfrom(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettransformaction_cookiedomaininto(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettransformaction_state(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettransformaction_comment(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GettransformactionResult gettransformaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addtransformpolicy(java.lang.String name, java.lang.String rule, java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmtransformpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settransformpolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settransformpolicy_profile(java.lang.String name, java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settransformpolicy_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settransformpolicy_logaction(java.lang.String name, java.lang.String logaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettransformpolicy_comment(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettransformpolicy_logaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GettransformpolicyResult gettransformpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renametransformpolicy(java.lang.String name, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addtransformpolicylabel(java.lang.String labelname, NSConfig.TransformpolicylabeltypeEnum policylabeltype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmtransformpolicylabel(java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindtransformpolicylabel_policy(java.lang.String labelname, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, java.lang.String gotopriorityexpression, boolean invoke, NSConfig.PolicylabeltransforminvoketypeEnum labeltype, java.lang.String labelname2) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindtransformpolicylabel_policy(java.lang.String labelname, java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindtransformpolicylabel_priority(java.lang.String labelname, java.lang.String policyname, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GettransformpolicylabelResult gettransformpolicylabel(java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renametransformpolicylabel(java.lang.String labelname, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindtransformglobal_policy(java.lang.String policyname, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindtransformglobal_policyEx(java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, java.lang.String gotopriorityexpression, NSConfig.TransformglobalbindpointEnum type, boolean invoke, NSConfig.PolicylabelinvoketypeEnum labeltype, java.lang.String labelname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindtransformglobal_policy(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindtransformglobal_policyEx(java.lang.String policyname, NSConfig.TransformglobalbindpointEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindtransformglobal_priority(java.lang.String policyname, org.apache.axis.types.UnsignedInt priority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GettransformglobalResult gettransformglobal() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GettransformglobalResult gettransformglobalEx(java.lang.String type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addtunneltrafficpolicy(java.lang.String name, java.lang.String rule, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmtunneltrafficpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settunneltrafficpolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult settunneltrafficpolicy_action(java.lang.String name, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettunneltrafficpolicy_rule(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsettunneltrafficpolicy_action(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GettunneltrafficpolicyResult gettunneltrafficpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindtunnelglobal_policy(java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, NSConfig.EnabledisabledEnum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindtunnelglobal_policy(java.lang.String policyname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GettunnelglobalResult gettunnelglobal() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult install(java.lang.String url) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult installEx(java.lang.String url, boolean c) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GettechsupportResult gettechsupport(java.lang.String scope) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetcallhomeResult getcallhome() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcallhome_emailaddress(java.lang.String emailaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setcallhome_proxymode(NSConfig.YesnoEnum proxymode, java.lang.String ipaddress, org.apache.axis.types.UnsignedInt port) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcallhome_emailaddress() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcallhome_proxymode() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcallhome_ipaddress() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetcallhome_port() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addvpnvserver(java.lang.String name, NSConfig.SslvpnvservicetypeEnum servicetype, java.lang.String ipaddress, org.apache.axis.types.UnsignedInt range, org.apache.axis.types.UnsignedInt port, NSConfig.EnabledisabledEnum state) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmvpnvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnvserver_ipaddress(java.lang.String name, java.lang.String ipaddress) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnvserver_authentication(java.lang.String name, NSConfig.OnoffEnum authentication) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnvserver_doublehop(java.lang.String name, NSConfig.EnabledisabledEnum doublehop) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnvserver_icaonly(java.lang.String name, NSConfig.OnoffEnum icaonly) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnvserver_maxaaausers(java.lang.String name, org.apache.axis.types.UnsignedInt maxaaausers) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnvserver_downstateflush(java.lang.String name, NSConfig.EnabledisabledEnum downstateflush) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnvserver_listenpolicy(java.lang.String name, java.lang.String listenpolicy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnvserver_listenpriority(java.lang.String name, org.apache.axis.types.UnsignedInt listenpriority) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnvserver_tcpprofile(java.lang.String name, java.lang.String tcpprofilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnvserver_httpprofile(java.lang.String name, java.lang.String httpprofilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnvserver_comment(java.lang.String name, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnvserver_appflowlog(java.lang.String name, NSConfig.EnabledisabledEnum appflowlog) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnvserver_icmpvsrresponse(java.lang.String name, NSConfig.IcmpvsrresponseEnum icmpvsrresponse) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnvserver_netprofile(java.lang.String name, java.lang.String netprofile) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnvserver_cginfrahomepageredirect(java.lang.String name, NSConfig.EnabledisabledEnum cginfrahomepageredirect) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnvserver_maxloginattempts(java.lang.String name, org.apache.axis.types.UnsignedInt maxloginattempts) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnvserver_failedlogintimeout(java.lang.String name, org.apache.axis.types.UnsignedInt failedlogintimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnvserver_authentication(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnvserver_doublehop(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnvserver_icaonly(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnvserver_maxaaausers(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnvserver_downstateflush(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnvserver_listenpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnvserver_listenpriority(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnvserver_tcpprofilename(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnvserver_httpprofilename(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnvserver_comment(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnvserver_appflowlog(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnvserver_icmpvsrresponse(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnvserver_netprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnvserver_cginfrahomepageredirect(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnvserver_maxloginattempts(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindvpnvserver_policy(java.lang.String name, java.lang.String policy, org.apache.axis.types.UnsignedInt priority, boolean secondary) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindvpnvserver_policyEx(java.lang.String name, java.lang.String policy, org.apache.axis.types.UnsignedInt priority, boolean secondary, java.lang.String gotopriorityexpression, NSConfig.VpnvserverbindpointEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindvpnvserver_policyEx2(java.lang.String name, java.lang.String policy, org.apache.axis.types.UnsignedInt priority, boolean secondary, boolean groupextraction, java.lang.String gotopriorityexpression, NSConfig.VpnvserverbindpointEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindvpnvserver_intranetapplication(java.lang.String name, java.lang.String intranetapplication) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindvpnvserver_nexthopserver(java.lang.String name, java.lang.String nexthopserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindvpnvserver_url(java.lang.String name, java.lang.String urlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindvpnvserver_intranetip(java.lang.String name, java.lang.String intranetip, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindvpnvserver_staserver(java.lang.String name, java.lang.String staserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindvpnvserver_appcontroller(java.lang.String name, java.lang.String appcontroller) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindvpnvserver_sharefile(java.lang.String name, java.lang.String sharefile) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindvpnvserver_policy(java.lang.String name, java.lang.String policy, boolean secondary) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindvpnvserver_policyEx(java.lang.String name, java.lang.String policy, boolean secondary, NSConfig.VpnvserverbindpointEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindvpnvserver_policyEx2(java.lang.String name, java.lang.String policy, boolean secondary, boolean groupextraction, NSConfig.VpnvserverbindpointEnum type) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindvpnvserver_intranetapplication(java.lang.String name, java.lang.String intranetapplication) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindvpnvserver_nexthopserver(java.lang.String name, java.lang.String nexthopserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindvpnvserver_url(java.lang.String name, java.lang.String urlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindvpnvserver_intranetip(java.lang.String name, java.lang.String intranetip, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindvpnvserver_staserver(java.lang.String name, java.lang.String staserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindvpnvserver_appcontroller(java.lang.String name, java.lang.String appcontroller) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindvpnvserver_sharefile(java.lang.String name, java.lang.String sharefile) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult enablevpnvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult disablevpnvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetvpnvserverResult getvpnvserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult renamevpnvserver(java.lang.String name, java.lang.String newname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addvpnintranetapplication(java.lang.String intranetapplication, NSConfig.ProtocolsEnum protocol, java.lang.String destip, java.lang.String netmask, java.lang.String iprange, java.lang.String hostname, java.lang.String clientapplication, NSConfig.VpnsessactEnum spoofiip, java.lang.String destport, NSConfig.AppmodeEnum interception, java.lang.String srcip, org.apache.axis.types.UnsignedInt srcport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmvpnintranetapplication(java.lang.String intranetapplication) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetvpnintranetapplicationResult getvpnintranetapplication(java.lang.String intranetapplication) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addvpnnexthopserver(java.lang.String name, java.lang.String nexthopip, org.apache.axis.types.UnsignedInt nexthopport, NSConfig.OnoffEnum secure) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmvpnnexthopserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetvpnnexthopserverResult getvpnnexthopserver(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addvpntrafficpolicy(java.lang.String name, java.lang.String rule, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmvpntrafficpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpntrafficpolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpntrafficpolicy_action(java.lang.String name, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpntrafficpolicy_rule(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpntrafficpolicy_action(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetvpntrafficpolicyResult getvpntrafficpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addvpntrafficaction(java.lang.String name, NSConfig.ActionvpntraffictypeEnum qual, org.apache.axis.types.UnsignedInt apptimeout, NSConfig.Onoff2Enum sso) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmvpntrafficaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpntrafficaction_apptimeout(java.lang.String name, org.apache.axis.types.UnsignedInt apptimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpntrafficaction_sso(java.lang.String name, NSConfig.Onoff2Enum sso) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpntrafficaction_formssoaction(java.lang.String name, java.lang.String formssoaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpntrafficaction_fta(java.lang.String name, NSConfig.Onoff2Enum fta) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpntrafficaction_wanscaler(java.lang.String name, NSConfig.Onoff2Enum wanscaler) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpntrafficaction_kcdaccount(java.lang.String name, java.lang.String kcdaccount) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpntrafficaction_samlssoprofile(java.lang.String name, java.lang.String samlssoprofile) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpntrafficaction_wanscaler(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpntrafficaction_kcdaccount(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetvpntrafficactionResult getvpntrafficaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addvpnformssoaction(java.lang.String name, java.lang.String actionurl, java.lang.String userfield, java.lang.String passwdfield, java.lang.String ssosuccessrule, java.lang.String namevaluepair, org.apache.axis.types.UnsignedInt responsesize, NSConfig.ActionfssonvtypeEnum nvtype, NSConfig.ActionfssosubmittypeEnum submitmethod) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmvpnformssoaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnformssoaction_actionurl(java.lang.String name, java.lang.String actionurl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnformssoaction_userfield(java.lang.String name, java.lang.String userfield) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnformssoaction_passwdfield(java.lang.String name, java.lang.String passwdfield) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnformssoaction_ssosuccessrule(java.lang.String name, java.lang.String ssosuccessrule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnformssoaction_responsesize(java.lang.String name, org.apache.axis.types.UnsignedInt responsesize) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnformssoaction_namevaluepair(java.lang.String name, java.lang.String namevaluepair) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnformssoaction_nvtype(java.lang.String name, NSConfig.ActionfssonvtypeEnum nvtype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnformssoaction_submitmethod(java.lang.String name, NSConfig.ActionfssosubmittypeEnum submitmethod) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnformssoaction_responsesize(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnformssoaction_namevaluepair(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnformssoaction_nvtype(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnformssoaction_submitmethod(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetvpnformssoactionResult getvpnformssoaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addvpnsamlssoprofile(java.lang.String name, java.lang.String samlsigningcertname, java.lang.String assertionconsumerserviceurl, java.lang.String relaystaterule, NSConfig.OnoffEnum sendpassword, java.lang.String samlissuername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmvpnsamlssoprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsamlssoprofile_samlsigningcertname(java.lang.String name, java.lang.String samlsigningcertname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsamlssoprofile_assertionconsumerserviceurl(java.lang.String name, java.lang.String assertionconsumerserviceurl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsamlssoprofile_sendpassword(java.lang.String name, NSConfig.OnoffEnum sendpassword) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsamlssoprofile_samlissuername(java.lang.String name, java.lang.String samlissuername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsamlssoprofile_relaystaterule(java.lang.String name, java.lang.String relaystaterule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsamlssoprofile_samlsigningcertname(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsamlssoprofile_sendpassword(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsamlssoprofile_samlissuername(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetvpnsamlssoprofileResult getvpnsamlssoprofile(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addvpnurl(java.lang.String urlname, java.lang.String linkname, java.lang.String actualurl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmvpnurl(java.lang.String urlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnurl_linkname(java.lang.String urlname, java.lang.String linkname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnurl_actualurl(java.lang.String urlname, java.lang.String actualurl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnurl_clientlessaccess(java.lang.String urlname, NSConfig.OnoffEnum clientlessaccess) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnurl_comment(java.lang.String urlname, java.lang.String comment) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnurl_clientlessaccess(java.lang.String urlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnurl_comment(java.lang.String urlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetvpnurlResult getvpnurl(java.lang.String urlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addvpnsessionpolicy(java.lang.String name, java.lang.String rule, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmvpnsessionpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionpolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionpolicy_action(java.lang.String name, java.lang.String actioN) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionpolicy_rule(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionpolicy_action(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetvpnsessionpolicyResult getvpnsessionpolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addvpnsessionaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmvpnsessionaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_httpport(java.lang.String name, java.lang.String httpport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_winsip(java.lang.String name, java.lang.String winsip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_dnsvservername(java.lang.String name, java.lang.String dnsvservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_splitdns(java.lang.String name, NSConfig.Vpnsessact_splitdnsEnum splitdns) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_sesstimeout(java.lang.String name, org.apache.axis.types.UnsignedInt sesstimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_clientsecurity(java.lang.String name, java.lang.String clientsecurity, java.lang.String clientsecuritygroup, java.lang.String clientsecuritymessage) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_clientsecuritylog(java.lang.String name, NSConfig.VpnsessactEnum clientsecuritylog) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_splittunnel(java.lang.String name, NSConfig.Vpnsessact_splittunnelEnum splittunnel) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_locallanaccess(java.lang.String name, NSConfig.Vpnsessact_locallanaccessEnum locallanaccess) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_rfc1918(java.lang.String name, NSConfig.VpnsessactEnum rfc1918) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_spoofiip(java.lang.String name, NSConfig.VpnsessactEnum spoofiip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_killconnections(java.lang.String name, NSConfig.VpnsessactEnum killconnections) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_transparentinterception(java.lang.String name, NSConfig.VpnsessactEnum transparentinterception) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_windowsclienttype(java.lang.String name, NSConfig.Vpnsessact_clttypeEnum windowsclienttype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_defaultauthorizationaction(java.lang.String name, NSConfig.AllowdenyEnum defaultauthorizationaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_authorizationgroup(java.lang.String name, java.lang.String authorizationgroup) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_clientidletimeout(java.lang.String name, org.apache.axis.types.UnsignedInt clientidletimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_proxy(java.lang.String name, NSConfig.Vpnsessact_proxyEnum proxy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_allprotocolproxy(java.lang.String name, java.lang.String allprotocolproxy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_httpproxy(java.lang.String name, java.lang.String httpproxy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_ftpproxy(java.lang.String name, java.lang.String ftpproxy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_socksproxy(java.lang.String name, java.lang.String socksproxy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_gopherproxy(java.lang.String name, java.lang.String gopherproxy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_sslproxy(java.lang.String name, java.lang.String sslproxy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_proxyexception(java.lang.String name, java.lang.String proxyexception) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_proxylocalbypass(java.lang.String name, NSConfig.Vpnsessact_enabledisabledEnum proxylocalbypass) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_clientcleanupprompt(java.lang.String name, NSConfig.VpnsessactEnum clientcleanupprompt) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_forcecleanup(java.lang.String name, NSConfig.ForceclnupEnum forcecleanup) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_clientoptions(java.lang.String name, NSConfig.ClntoptionsEnum clientoptions) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_clientconfiguration(java.lang.String name, NSConfig.ClntconfEnum clientconfiguration) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_sso(java.lang.String name, NSConfig.VpnsessactEnum sso) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_ssocredential(java.lang.String name, NSConfig.Vpnsessact_sso_credential_indexEnum ssocredential) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_windowsautologon(java.lang.String name, NSConfig.VpnsessactEnum windowsautologon) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_usemip(java.lang.String name, NSConfig.Vpnsessact_usemipEnum usemip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_useiip(java.lang.String name, NSConfig.Vpnsessact_useiipEnum useiip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_clientdebug(java.lang.String name, NSConfig.ClntdbgEnum clientdebug) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_loginscript(java.lang.String name, java.lang.String loginscript) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_logoutscript(java.lang.String name, java.lang.String logoutscript) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_homepage(java.lang.String name, java.lang.String homepage) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_icaproxy(java.lang.String name, NSConfig.VpnsessactEnum icaproxy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_wihome(java.lang.String name, java.lang.String wihome) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_citrixreceiverhome(java.lang.String name, java.lang.String citrixreceiverhome) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_wiportalmode(java.lang.String name, NSConfig.Vpnsessact_portal_wimodeEnum wiportalmode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_clientchoices(java.lang.String name, NSConfig.VpnsessactEnum clientchoices) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_epaclienttype(java.lang.String name, NSConfig.Vpnsessact_clttypeEnum epaclienttype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_iipdnssuffix(java.lang.String name, java.lang.String iipdnssuffix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_forcedtimeout(java.lang.String name, org.apache.axis.types.UnsignedInt forcedtimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_forcedtimeoutwarning(java.lang.String name, org.apache.axis.types.UnsignedInt forcedtimeoutwarning) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_ntdomain(java.lang.String name, java.lang.String ntdomain) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_clientlessvpnmode(java.lang.String name, NSConfig.Vpnsessact_cvpnmodeEnum clientlessvpnmode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_emailhome(java.lang.String name, java.lang.String emailhome) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_clientlessmodeurlencoding(java.lang.String name, NSConfig.Vpnsessact_urlencodingEnum clientlessmodeurlencoding) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_clientlesspersistentcookie(java.lang.String name, NSConfig.Vpnsessact_perscookieEnum clientlesspersistentcookie) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_allowedlogingroups(java.lang.String name, java.lang.String allowedlogingroups) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_securebrowse(java.lang.String name, NSConfig.Vpnsessact_enabledisabledEnum securebrowse) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_storefronturl(java.lang.String name, java.lang.String storefronturl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnsessionaction_kcdaccount(java.lang.String name, java.lang.String kcdaccount) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_httpport(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_winsip(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_dnsvservername(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_splitdns(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_sesstimeout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_clientsecurity(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_clientsecuritygroup(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_clientsecuritymessage(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_clientsecuritylog(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_splittunnel(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_locallanaccess(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_rfc1918(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_spoofiip(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_killconnections(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_transparentinterception(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_windowsclienttype(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_defaultauthorizationaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_authorizationgroup(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_clientidletimeout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_proxy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_allprotocolproxy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_httpproxy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_ftpproxy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_socksproxy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_gopherproxy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_sslproxy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_proxyexception(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_proxylocalbypass(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_clientcleanupprompt(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_forcecleanup(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_clientoptions(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_clientconfiguration(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_sso(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_ssocredential(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_windowsautologon(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_usemip(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_useiip(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_clientdebug(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_loginscript(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_logoutscript(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_homepage(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_icaproxy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_wihome(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_citrixreceiverhome(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_wiportalmode(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_clientchoices(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_epaclienttype(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_iipdnssuffix(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_forcedtimeout(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_forcedtimeoutwarning(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_ntdomain(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_clientlessvpnmode(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_emailhome(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_clientlessmodeurlencoding(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_clientlesspersistentcookie(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_allowedlogingroups(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_securebrowse(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_storefronturl(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnsessionaction_kcdaccount(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetvpnsessionactionResult getvpnsessionaction(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addvpnclientlessaccesspolicy(java.lang.String name, java.lang.String rule, java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmvpnclientlessaccesspolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnclientlessaccesspolicy_rule(java.lang.String name, java.lang.String rule) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnclientlessaccesspolicy_profile(java.lang.String name, java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetvpnclientlessaccesspolicyResult getvpnclientlessaccesspolicy(java.lang.String name) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addvpnclientlessaccessprofile(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmvpnclientlessaccessprofile(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnclientlessaccessprofile_urlrewritepolicylabel(java.lang.String profilename, java.lang.String urlrewritepolicylabel) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnclientlessaccessprofile_javascriptrewritepolicylabel(java.lang.String profilename, java.lang.String javascriptrewritepolicylabel) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnclientlessaccessprofile_reqhdrrewritepolicylabel(java.lang.String profilename, java.lang.String reqhdrrewritepolicylabel) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnclientlessaccessprofile_reshdrrewritepolicylabel(java.lang.String profilename, java.lang.String reshdrrewritepolicylabel) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnclientlessaccessprofile_regexforfindingurlinjavascript(java.lang.String profilename, java.lang.String regexforfindingurlinjavascript) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnclientlessaccessprofile_regexforfindingurlincss(java.lang.String profilename, java.lang.String regexforfindingurlincss) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnclientlessaccessprofile_regexforfindingurlinxcomponent(java.lang.String profilename, java.lang.String regexforfindingurlinxcomponent) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnclientlessaccessprofile_regexforfindingurlinxml(java.lang.String profilename, java.lang.String regexforfindingurlinxml) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnclientlessaccessprofile_regexforfindingcustomurls(java.lang.String profilename, java.lang.String regexforfindingcustomurls) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnclientlessaccessprofile_clientconsumedcookies(java.lang.String profilename, java.lang.String clientconsumedcookies) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnclientlessaccessprofile_requirepersistentcookie(java.lang.String profilename, NSConfig.OnoffEnum requirepersistentcookie) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnclientlessaccessprofile_urlrewritepolicylabel(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnclientlessaccessprofile_javascriptrewritepolicylabel(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnclientlessaccessprofile_reqhdrrewritepolicylabel(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnclientlessaccessprofile_reshdrrewritepolicylabel(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnclientlessaccessprofile_regexforfindingurlinjavascript(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnclientlessaccessprofile_regexforfindingurlincss(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnclientlessaccessprofile_regexforfindingurlinxcomponent(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnclientlessaccessprofile_regexforfindingurlinxml(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnclientlessaccessprofile_regexforfindingcustomurls(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnclientlessaccessprofile_clientconsumedcookies(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnclientlessaccessprofile_requirepersistentcookie(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetvpnclientlessaccessprofileResult getvpnclientlessaccessprofile(java.lang.String profilename) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetvpnicaconnectionResult getvpnicaconnection(java.lang.String username) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindvpnglobal_policy(java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, boolean secondary) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindvpnglobal_policyEx(java.lang.String policyname, org.apache.axis.types.UnsignedInt priority, boolean secondary, boolean groupextraction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindvpnglobal_intranetdomain(java.lang.String intranetdomain) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindvpnglobal_intranetapplication(java.lang.String intranetapplication) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindvpnglobal_nexthopserver(java.lang.String nexthopserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindvpnglobal_url(java.lang.String urlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindvpnglobal_intranetip(java.lang.String intranetip, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindvpnglobal_staserver(java.lang.String staserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindvpnglobal_appcontroller(java.lang.String appcontroller) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindvpnglobal_sharefile(java.lang.String sharefile) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindvpnglobal_policy(java.lang.String policyname, boolean secondary) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindvpnglobal_policyEx(java.lang.String policyname, boolean secondary, boolean groupextraction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindvpnglobal_intranetdomain(java.lang.String intranetdomain) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindvpnglobal_intranetapplication(java.lang.String intranetapplication) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindvpnglobal_nexthopserver(java.lang.String nexthopserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindvpnglobal_url(java.lang.String urlname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindvpnglobal_intranetip(java.lang.String intranetip, java.lang.String netmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindvpnglobal_staserver(java.lang.String staserver) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindvpnglobal_appcontroller(java.lang.String appcontroller) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindvpnglobal_sharefile(java.lang.String sharefile) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetvpnglobalResult getvpnglobal() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_httpport(java.lang.String httpport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_winsip(java.lang.String winsip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_dnsvservername(java.lang.String dnsvservername) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_splitdns(NSConfig.Vpnsessact_splitdnsEnum splitdns) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_sesstimeout(org.apache.axis.types.UnsignedInt sesstimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_clientsecurity(java.lang.String clientsecurity, java.lang.String clientsecuritygroup, java.lang.String clientsecuritymessage) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_clientsecuritylog(NSConfig.VpnsessactEnum clientsecuritylog) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_splittunnel(NSConfig.Vpnsessact_splittunnelEnum splittunnel) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_locallanaccess(NSConfig.Vpnsessact_locallanaccessEnum locallanaccess) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_rfc1918(NSConfig.VpnsessactEnum rfc1918) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_spoofiip(NSConfig.VpnsessactEnum spoofiip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_killconnections(NSConfig.VpnsessactEnum killconnections) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_transparentinterception(NSConfig.VpnsessactEnum transparentinterception) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_windowsclienttype(NSConfig.Vpnsessact_clttypeEnum windowsclienttype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_defaultauthorizationaction(NSConfig.AllowdenyEnum defaultauthorizationaction) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_authorizationgroup(java.lang.String authorizationgroup) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_clientidletimeout(org.apache.axis.types.UnsignedInt clientidletimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_proxy(NSConfig.Vpnsessact_proxyEnum proxy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_allprotocolproxy(java.lang.String allprotocolproxy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_httpproxy(java.lang.String httpproxy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_ftpproxy(java.lang.String ftpproxy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_socksproxy(java.lang.String socksproxy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_gopherproxy(java.lang.String gopherproxy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_sslproxy(java.lang.String sslproxy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_proxyexception(java.lang.String proxyexception) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_proxylocalbypass(NSConfig.Vpnsessact_enabledisabledEnum proxylocalbypass) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_clientcleanupprompt(NSConfig.VpnsessactEnum clientcleanupprompt) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_forcecleanup(NSConfig.ForceclnupEnum forcecleanup) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_clientoptions(NSConfig.ClntoptionsEnum clientoptions) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_clientconfiguration(NSConfig.ClntconfEnum clientconfiguration) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_sso(NSConfig.VpnsessactEnum sso) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_ssocredential(NSConfig.Vpnsessact_sso_credential_indexEnum ssocredential) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_windowsautologon(NSConfig.VpnsessactEnum windowsautologon) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_usemip(NSConfig.Vpnsessact_usemipEnum usemip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_useiip(NSConfig.Vpnsessact_useiipEnum useiip) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_clientdebug(NSConfig.ClntdbgEnum clientdebug) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_loginscript(java.lang.String loginscript) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_logoutscript(java.lang.String logoutscript) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_homepage(java.lang.String homepage) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_icaproxy(NSConfig.VpnsessactEnum icaproxy) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_wihome(java.lang.String wihome) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_citrixreceiverhome(java.lang.String citrixreceiverhome) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_wiportalmode(NSConfig.Vpnsessact_portal_wimodeEnum wiportalmode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_clientchoices(NSConfig.VpnsessactEnum clientchoices) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_epaclienttype(NSConfig.Vpnsessact_clttypeEnum epaclienttype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_iipdnssuffix(java.lang.String iipdnssuffix) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_forcedtimeout(org.apache.axis.types.UnsignedInt forcedtimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_forcedtimeoutwarning(org.apache.axis.types.UnsignedInt forcedtimeoutwarning) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_ntdomain(java.lang.String ntdomain) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_clientlessvpnmode(NSConfig.Vpnsessact_cvpnmodeEnum clientlessvpnmode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_clientlessmodeurlencoding(NSConfig.Vpnsessact_urlencodingEnum clientlessmodeurlencoding) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_clientlesspersistentcookie(NSConfig.Vpnsessact_perscookieEnum clientlesspersistentcookie) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_emailhome(java.lang.String emailhome) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_allowedlogingroups(java.lang.String allowedlogingroups) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_encryptcsecexp(NSConfig.Vpnsessact_enabledisabledEnum encryptcsecexp) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_apptokentimeout(org.apache.axis.types.UnsignedInt apptokentimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_mdxtokentimeout(org.apache.axis.types.UnsignedInt mdxtokentimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_uitheme(NSConfig.Vpnsessact_uithemeEnum uitheme) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_securebrowse(NSConfig.Vpnsessact_enabledisabledEnum securebrowse) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_storefronturl(java.lang.String storefronturl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setvpnparameter_kcdaccount(java.lang.String kcdaccount) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_httpport() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_winsip() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_dnsvservername() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_splitdns() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_sesstimeout() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_clientsecurity() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_clientsecuritygroup() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_clientsecuritymessage() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_clientsecuritylog() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_authorizationgroup() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_clientidletimeout() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_allprotocolproxy() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_httpproxy() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_ftpproxy() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_socksproxy() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_gopherproxy() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_sslproxy() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_proxyexception() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_forcecleanup() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_clientoptions() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_clientconfiguration() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_loginscript() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_logoutscript() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_homepage() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_proxy() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_wihome() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_citrixreceiverhome() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_wiportalmode() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_iipdnssuffix() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_forcedtimeout() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_forcedtimeoutwarning() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_defaultauthorizationaction() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_ntdomain() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_clientlessvpnmode() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_emailhome() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_clientlessmodeurlencoding() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_clientlesspersistentcookie() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_allowedlogingroups() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_apptokentimeout() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_mdxtokentimeout() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_storefronturl() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_uitheme() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_kcdaccount() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_splittunnel() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_locallanaccess() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_rfc1918() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_spoofiip() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_killconnections() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_transparentinterception() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_windowsclienttype() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_proxylocalbypass() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_clientcleanupprompt() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_sso() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_ssocredential() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_windowsautologon() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_usemip() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_useiip() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_clientdebug() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_icaproxy() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_clientchoices() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_epaclienttype() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_encryptcsecexp() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetvpnparameter_securebrowse() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetvpnparameterResult getvpnparameter() throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult addwisite(java.lang.String sitepath, java.lang.String agurl, java.lang.String staurl, NSConfig.WisitetypeEnum sitetype, NSConfig.WirestypeEnum publishedresourcetype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult rmwisite(java.lang.String sitepath) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_agurl(java.lang.String sitepath, java.lang.String agurl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_staurl(java.lang.String sitepath, java.lang.String staurl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_sessionreliability(java.lang.String sitepath, NSConfig.OnoffEnum sessionreliability) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_usetwotickets(java.lang.String sitepath, NSConfig.OnoffEnum usetwotickets) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_secondstaurl(java.lang.String sitepath, java.lang.String secondstaurl) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_wiauthenticationmethods(java.lang.String sitepath, NSConfig.WiauthmethodsEnum wiauthenticationmethods) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_defaultaccessmethod(java.lang.String sitepath, NSConfig.DefaultaccessmethodEnum defaultaccessmethod) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_defaultcustomtextlocale(java.lang.String sitepath, NSConfig.DeftextlocaleEnum defaultcustomtextlocale) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_websessiontimeout(java.lang.String sitepath, org.apache.axis.types.UnsignedInt websessiontimeout) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_logintitle(java.lang.String sitepath, java.lang.String logintitle) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_appwelcomemessage(java.lang.String sitepath, java.lang.String appwelcomemessage) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_welcomemessage(java.lang.String sitepath, java.lang.String welcomemessage) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_footertext(java.lang.String sitepath, java.lang.String footertext) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_loginsysmessage(java.lang.String sitepath, java.lang.String loginsysmessage) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_preloginbutton(java.lang.String sitepath, java.lang.String preloginbutton) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_preloginmessage(java.lang.String sitepath, java.lang.String preloginmessage) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_prelogintitle(java.lang.String sitepath, java.lang.String prelogintitle) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_domainselection(java.lang.String sitepath, java.lang.String domainselection) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_userinterfacebranding(java.lang.String sitepath, NSConfig.UserinterfacebrandingEnum userinterfacebranding) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_authenticationpoint(java.lang.String sitepath, NSConfig.WiauthpntEnum authenticationpoint) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_agauthenticationmethod(java.lang.String sitepath, NSConfig.AgauthmethodEnum agauthenticationmethod) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_publishedresourcetype(java.lang.String sitepath, NSConfig.WirestypeEnum publishedresourcetype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_kioskmode(java.lang.String sitepath, NSConfig.OnoffEnum kioskmode) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_showsearch(java.lang.String sitepath, NSConfig.OnoffEnum showsearch) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_showrefresh(java.lang.String sitepath, NSConfig.OnoffEnum showrefresh) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_wiuserinterfacemodes(java.lang.String sitepath, NSConfig.WiuimodesEnum wiuserinterfacemodes) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult setwisite_userinterfacelayouts(java.lang.String sitepath, NSConfig.WiuilayoutsEnum userinterfacelayouts) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetwisite_appwelcomemessage(java.lang.String sitepath) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetwisite_welcomemessage(java.lang.String sitepath) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetwisite_footertext(java.lang.String sitepath) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetwisite_loginsysmessage(java.lang.String sitepath) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetwisite_preloginbutton(java.lang.String sitepath) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetwisite_preloginmessage(java.lang.String sitepath) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetwisite_prelogintitle(java.lang.String sitepath) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unsetwisite_userinterfacebranding(java.lang.String sitepath) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindwisite_farm(java.lang.String sitepath, java.lang.String farmname, java.lang.String xmlserveraddresses, org.apache.axis.types.UnsignedInt xmlport, NSConfig.XmltransportEnum transport, org.apache.axis.types.UnsignedInt sslrelayport, NSConfig.OnoffEnum loadbalance) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindwisite_farmEx(java.lang.String sitepath, java.lang.String farmname, java.lang.String xmlserveraddresses, java.lang.String groups, NSConfig.OnoffEnum recoveryfarm, org.apache.axis.types.UnsignedInt xmlport, NSConfig.XmltransportEnum transport, org.apache.axis.types.UnsignedInt sslrelayport, NSConfig.OnoffEnum loadbalance) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindwisite_accessmethod(java.lang.String sitepath, NSConfig.AccessmethodEnum accessmethod, java.lang.String clientipaddress, java.lang.String clientnetmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult bindwisite_translationinternalip(java.lang.String sitepath, java.lang.String translationinternalip, org.apache.axis.types.UnsignedInt translationinternalport, java.lang.String translationexternalip, org.apache.axis.types.UnsignedInt translationexternalport, NSConfig.AccesstypeEnum accesstype) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindwisite_farm(java.lang.String sitepath, java.lang.String farmname) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindwisite_clientipaddress(java.lang.String sitepath, java.lang.String clientipaddress, java.lang.String clientnetmask) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult unbindwisite_translationinternalip(java.lang.String sitepath, java.lang.String translationinternalip, org.apache.axis.types.UnsignedInt translationinternalport, java.lang.String translationexternalip, org.apache.axis.types.UnsignedInt translationexternalport) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.GetwisiteResult getwisite(java.lang.String sitepath) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult installwipackage(java.lang.String jre, java.lang.String wi) throws java.rmi.RemoteException;

    /**

     */
    public NSConfig.SimpleResult uninstallwipackage() throws java.rmi.RemoteException;
}
