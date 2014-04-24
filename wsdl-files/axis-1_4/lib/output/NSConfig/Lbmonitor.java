/**
 * Lbmonitor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Lbmonitor  implements java.io.Serializable {
    private java.lang.String monitorname;

    private java.lang.String type;

    private int interval;

    private java.lang.String units;

    private int resptimeout;

    private org.apache.axis.types.UnsignedInt resptimeoutthresh;

    private java.lang.String units2;

    private int retries;

    private int failureretries;

    private int alertretries;

    private int successretries;

    private int downtime;

    private java.lang.String units3;

    private java.lang.String destip;

    private org.apache.axis.types.UnsignedInt destport;

    private java.lang.String state;

    private java.lang.String reverse;

    private java.lang.String transparent;

    private java.lang.String iptunnel;

    private java.lang.String tos;

    private org.apache.axis.types.UnsignedInt tosid;

    private java.lang.String secure;

    private java.lang.String actioN;

    private java.lang.String[] respcode;

    private java.lang.String httprequest;

    private java.lang.String rtsprequest;

    private java.lang.String send;

    private java.lang.String recv;

    private java.lang.String query;

    private java.lang.String querytype;

    private java.lang.String username;

    private java.lang.String password;

    private java.lang.String secondarypassword;

    private java.lang.String logonpointname;

    private java.lang.String lasversion;

    private java.lang.String validatecred;

    private java.lang.String domain;

    private java.lang.String radkey;

    private java.lang.String radnasid;

    private java.lang.String radnasip;

    private org.apache.axis.types.UnsignedInt radaccounttype;

    private java.lang.String radframedip;

    private java.lang.String radapn;

    private java.lang.String radmsisdn;

    private java.lang.String radaccountsession;

    private java.lang.String lrtM;

    private int lrtmconf;

    private org.apache.axis.types.UnsignedInt deviation;

    private java.lang.String units4;

    private int dynamicresponsetimeout;

    private int dynamicinterval;

    private java.lang.String scriptname;

    private java.lang.String scriptargs;

    private java.lang.String dispatcherip;

    private org.apache.axis.types.UnsignedInt dispatcherport;

    private java.lang.String sipuri;

    private java.lang.String sipmethod;

    private org.apache.axis.types.UnsignedInt maxforwards;

    private java.lang.String sipreguri;

    private java.lang.String customheaders;

    private java.lang.String[] ipaddress;

    private java.lang.String group;

    private java.lang.String filename;

    private java.lang.String basedn;

    private java.lang.String binddn;

    private java.lang.String filter;

    private java.lang.String attribute;

    private java.lang.String database;

    private java.lang.String sqlquery;

    private java.lang.String evalrule;

    private java.lang.String snmpoid;

    private java.lang.String snmpcommunity;

    private java.lang.String snmpthreshold;

    private java.lang.String snmpversion;

    private java.lang.String metric;

    private java.lang.String[] metrictable;

    private java.lang.String[] multimetrictable;

    private org.apache.axis.types.UnsignedLong[] metricthreshold;

    private org.apache.axis.types.UnsignedInt[] metricweight;

    private java.lang.String application;

    private java.lang.String sitepath;

    private java.lang.String storename;

    private java.lang.String storefrontacctservice;

    private java.lang.String hostname;

    private java.lang.String[] units5;

    private java.lang.String netprofile;

    private java.lang.String mssqlprotocolversion;

    private java.lang.String originhost;

    private java.lang.String originrealm;

    private java.lang.String hostipaddress;

    private org.apache.axis.types.UnsignedInt vendorid;

    private java.lang.String productname;

    private org.apache.axis.types.UnsignedInt firmwarerevision;

    private org.apache.axis.types.UnsignedInt[] authapplicationid;

    private org.apache.axis.types.UnsignedInt[] acctapplicationid;

    private java.lang.String inbandsecurityid;

    private org.apache.axis.types.UnsignedInt[] supportedvendorids;

    private org.apache.axis.types.UnsignedInt vendorspecificvendorid;

    private org.apache.axis.types.UnsignedInt[] vendorspecificauthapplicationids;

    private org.apache.axis.types.UnsignedInt[] vendorspecificacctapplicationids;

    private java.lang.String servicename;

    private java.lang.String state2;

    private org.apache.axis.types.UnsignedInt weight;

    private java.lang.String servicegroupname;

    private org.apache.axis.types.UnsignedInt weight2;

    private java.lang.String kcdaccount;

    private java.lang.String storedb;

    private java.lang.String[] boundmetrictable;

    public Lbmonitor() {
    }

    public Lbmonitor(
           java.lang.String monitorname,
           java.lang.String type,
           int interval,
           java.lang.String units,
           int resptimeout,
           org.apache.axis.types.UnsignedInt resptimeoutthresh,
           java.lang.String units2,
           int retries,
           int failureretries,
           int alertretries,
           int successretries,
           int downtime,
           java.lang.String units3,
           java.lang.String destip,
           org.apache.axis.types.UnsignedInt destport,
           java.lang.String state,
           java.lang.String reverse,
           java.lang.String transparent,
           java.lang.String iptunnel,
           java.lang.String tos,
           org.apache.axis.types.UnsignedInt tosid,
           java.lang.String secure,
           java.lang.String actioN,
           java.lang.String[] respcode,
           java.lang.String httprequest,
           java.lang.String rtsprequest,
           java.lang.String send,
           java.lang.String recv,
           java.lang.String query,
           java.lang.String querytype,
           java.lang.String username,
           java.lang.String password,
           java.lang.String secondarypassword,
           java.lang.String logonpointname,
           java.lang.String lasversion,
           java.lang.String validatecred,
           java.lang.String domain,
           java.lang.String radkey,
           java.lang.String radnasid,
           java.lang.String radnasip,
           org.apache.axis.types.UnsignedInt radaccounttype,
           java.lang.String radframedip,
           java.lang.String radapn,
           java.lang.String radmsisdn,
           java.lang.String radaccountsession,
           java.lang.String lrtM,
           int lrtmconf,
           org.apache.axis.types.UnsignedInt deviation,
           java.lang.String units4,
           int dynamicresponsetimeout,
           int dynamicinterval,
           java.lang.String scriptname,
           java.lang.String scriptargs,
           java.lang.String dispatcherip,
           org.apache.axis.types.UnsignedInt dispatcherport,
           java.lang.String sipuri,
           java.lang.String sipmethod,
           org.apache.axis.types.UnsignedInt maxforwards,
           java.lang.String sipreguri,
           java.lang.String customheaders,
           java.lang.String[] ipaddress,
           java.lang.String group,
           java.lang.String filename,
           java.lang.String basedn,
           java.lang.String binddn,
           java.lang.String filter,
           java.lang.String attribute,
           java.lang.String database,
           java.lang.String sqlquery,
           java.lang.String evalrule,
           java.lang.String snmpoid,
           java.lang.String snmpcommunity,
           java.lang.String snmpthreshold,
           java.lang.String snmpversion,
           java.lang.String metric,
           java.lang.String[] metrictable,
           java.lang.String[] multimetrictable,
           org.apache.axis.types.UnsignedLong[] metricthreshold,
           org.apache.axis.types.UnsignedInt[] metricweight,
           java.lang.String application,
           java.lang.String sitepath,
           java.lang.String storename,
           java.lang.String storefrontacctservice,
           java.lang.String hostname,
           java.lang.String[] units5,
           java.lang.String netprofile,
           java.lang.String mssqlprotocolversion,
           java.lang.String originhost,
           java.lang.String originrealm,
           java.lang.String hostipaddress,
           org.apache.axis.types.UnsignedInt vendorid,
           java.lang.String productname,
           org.apache.axis.types.UnsignedInt firmwarerevision,
           org.apache.axis.types.UnsignedInt[] authapplicationid,
           org.apache.axis.types.UnsignedInt[] acctapplicationid,
           java.lang.String inbandsecurityid,
           org.apache.axis.types.UnsignedInt[] supportedvendorids,
           org.apache.axis.types.UnsignedInt vendorspecificvendorid,
           org.apache.axis.types.UnsignedInt[] vendorspecificauthapplicationids,
           org.apache.axis.types.UnsignedInt[] vendorspecificacctapplicationids,
           java.lang.String servicename,
           java.lang.String state2,
           org.apache.axis.types.UnsignedInt weight,
           java.lang.String servicegroupname,
           org.apache.axis.types.UnsignedInt weight2,
           java.lang.String kcdaccount,
           java.lang.String storedb,
           java.lang.String[] boundmetrictable) {
           this.monitorname = monitorname;
           this.type = type;
           this.interval = interval;
           this.units = units;
           this.resptimeout = resptimeout;
           this.resptimeoutthresh = resptimeoutthresh;
           this.units2 = units2;
           this.retries = retries;
           this.failureretries = failureretries;
           this.alertretries = alertretries;
           this.successretries = successretries;
           this.downtime = downtime;
           this.units3 = units3;
           this.destip = destip;
           this.destport = destport;
           this.state = state;
           this.reverse = reverse;
           this.transparent = transparent;
           this.iptunnel = iptunnel;
           this.tos = tos;
           this.tosid = tosid;
           this.secure = secure;
           this.actioN = actioN;
           this.respcode = respcode;
           this.httprequest = httprequest;
           this.rtsprequest = rtsprequest;
           this.send = send;
           this.recv = recv;
           this.query = query;
           this.querytype = querytype;
           this.username = username;
           this.password = password;
           this.secondarypassword = secondarypassword;
           this.logonpointname = logonpointname;
           this.lasversion = lasversion;
           this.validatecred = validatecred;
           this.domain = domain;
           this.radkey = radkey;
           this.radnasid = radnasid;
           this.radnasip = radnasip;
           this.radaccounttype = radaccounttype;
           this.radframedip = radframedip;
           this.radapn = radapn;
           this.radmsisdn = radmsisdn;
           this.radaccountsession = radaccountsession;
           this.lrtM = lrtM;
           this.lrtmconf = lrtmconf;
           this.deviation = deviation;
           this.units4 = units4;
           this.dynamicresponsetimeout = dynamicresponsetimeout;
           this.dynamicinterval = dynamicinterval;
           this.scriptname = scriptname;
           this.scriptargs = scriptargs;
           this.dispatcherip = dispatcherip;
           this.dispatcherport = dispatcherport;
           this.sipuri = sipuri;
           this.sipmethod = sipmethod;
           this.maxforwards = maxforwards;
           this.sipreguri = sipreguri;
           this.customheaders = customheaders;
           this.ipaddress = ipaddress;
           this.group = group;
           this.filename = filename;
           this.basedn = basedn;
           this.binddn = binddn;
           this.filter = filter;
           this.attribute = attribute;
           this.database = database;
           this.sqlquery = sqlquery;
           this.evalrule = evalrule;
           this.snmpoid = snmpoid;
           this.snmpcommunity = snmpcommunity;
           this.snmpthreshold = snmpthreshold;
           this.snmpversion = snmpversion;
           this.metric = metric;
           this.metrictable = metrictable;
           this.multimetrictable = multimetrictable;
           this.metricthreshold = metricthreshold;
           this.metricweight = metricweight;
           this.application = application;
           this.sitepath = sitepath;
           this.storename = storename;
           this.storefrontacctservice = storefrontacctservice;
           this.hostname = hostname;
           this.units5 = units5;
           this.netprofile = netprofile;
           this.mssqlprotocolversion = mssqlprotocolversion;
           this.originhost = originhost;
           this.originrealm = originrealm;
           this.hostipaddress = hostipaddress;
           this.vendorid = vendorid;
           this.productname = productname;
           this.firmwarerevision = firmwarerevision;
           this.authapplicationid = authapplicationid;
           this.acctapplicationid = acctapplicationid;
           this.inbandsecurityid = inbandsecurityid;
           this.supportedvendorids = supportedvendorids;
           this.vendorspecificvendorid = vendorspecificvendorid;
           this.vendorspecificauthapplicationids = vendorspecificauthapplicationids;
           this.vendorspecificacctapplicationids = vendorspecificacctapplicationids;
           this.servicename = servicename;
           this.state2 = state2;
           this.weight = weight;
           this.servicegroupname = servicegroupname;
           this.weight2 = weight2;
           this.kcdaccount = kcdaccount;
           this.storedb = storedb;
           this.boundmetrictable = boundmetrictable;
    }


    /**
     * Gets the monitorname value for this Lbmonitor.
     * 
     * @return monitorname
     */
    public java.lang.String getMonitorname() {
        return monitorname;
    }


    /**
     * Sets the monitorname value for this Lbmonitor.
     * 
     * @param monitorname
     */
    public void setMonitorname(java.lang.String monitorname) {
        this.monitorname = monitorname;
    }


    /**
     * Gets the type value for this Lbmonitor.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Lbmonitor.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the interval value for this Lbmonitor.
     * 
     * @return interval
     */
    public int getInterval() {
        return interval;
    }


    /**
     * Sets the interval value for this Lbmonitor.
     * 
     * @param interval
     */
    public void setInterval(int interval) {
        this.interval = interval;
    }


    /**
     * Gets the units value for this Lbmonitor.
     * 
     * @return units
     */
    public java.lang.String getUnits() {
        return units;
    }


    /**
     * Sets the units value for this Lbmonitor.
     * 
     * @param units
     */
    public void setUnits(java.lang.String units) {
        this.units = units;
    }


    /**
     * Gets the resptimeout value for this Lbmonitor.
     * 
     * @return resptimeout
     */
    public int getResptimeout() {
        return resptimeout;
    }


    /**
     * Sets the resptimeout value for this Lbmonitor.
     * 
     * @param resptimeout
     */
    public void setResptimeout(int resptimeout) {
        this.resptimeout = resptimeout;
    }


    /**
     * Gets the resptimeoutthresh value for this Lbmonitor.
     * 
     * @return resptimeoutthresh
     */
    public org.apache.axis.types.UnsignedInt getResptimeoutthresh() {
        return resptimeoutthresh;
    }


    /**
     * Sets the resptimeoutthresh value for this Lbmonitor.
     * 
     * @param resptimeoutthresh
     */
    public void setResptimeoutthresh(org.apache.axis.types.UnsignedInt resptimeoutthresh) {
        this.resptimeoutthresh = resptimeoutthresh;
    }


    /**
     * Gets the units2 value for this Lbmonitor.
     * 
     * @return units2
     */
    public java.lang.String getUnits2() {
        return units2;
    }


    /**
     * Sets the units2 value for this Lbmonitor.
     * 
     * @param units2
     */
    public void setUnits2(java.lang.String units2) {
        this.units2 = units2;
    }


    /**
     * Gets the retries value for this Lbmonitor.
     * 
     * @return retries
     */
    public int getRetries() {
        return retries;
    }


    /**
     * Sets the retries value for this Lbmonitor.
     * 
     * @param retries
     */
    public void setRetries(int retries) {
        this.retries = retries;
    }


    /**
     * Gets the failureretries value for this Lbmonitor.
     * 
     * @return failureretries
     */
    public int getFailureretries() {
        return failureretries;
    }


    /**
     * Sets the failureretries value for this Lbmonitor.
     * 
     * @param failureretries
     */
    public void setFailureretries(int failureretries) {
        this.failureretries = failureretries;
    }


    /**
     * Gets the alertretries value for this Lbmonitor.
     * 
     * @return alertretries
     */
    public int getAlertretries() {
        return alertretries;
    }


    /**
     * Sets the alertretries value for this Lbmonitor.
     * 
     * @param alertretries
     */
    public void setAlertretries(int alertretries) {
        this.alertretries = alertretries;
    }


    /**
     * Gets the successretries value for this Lbmonitor.
     * 
     * @return successretries
     */
    public int getSuccessretries() {
        return successretries;
    }


    /**
     * Sets the successretries value for this Lbmonitor.
     * 
     * @param successretries
     */
    public void setSuccessretries(int successretries) {
        this.successretries = successretries;
    }


    /**
     * Gets the downtime value for this Lbmonitor.
     * 
     * @return downtime
     */
    public int getDowntime() {
        return downtime;
    }


    /**
     * Sets the downtime value for this Lbmonitor.
     * 
     * @param downtime
     */
    public void setDowntime(int downtime) {
        this.downtime = downtime;
    }


    /**
     * Gets the units3 value for this Lbmonitor.
     * 
     * @return units3
     */
    public java.lang.String getUnits3() {
        return units3;
    }


    /**
     * Sets the units3 value for this Lbmonitor.
     * 
     * @param units3
     */
    public void setUnits3(java.lang.String units3) {
        this.units3 = units3;
    }


    /**
     * Gets the destip value for this Lbmonitor.
     * 
     * @return destip
     */
    public java.lang.String getDestip() {
        return destip;
    }


    /**
     * Sets the destip value for this Lbmonitor.
     * 
     * @param destip
     */
    public void setDestip(java.lang.String destip) {
        this.destip = destip;
    }


    /**
     * Gets the destport value for this Lbmonitor.
     * 
     * @return destport
     */
    public org.apache.axis.types.UnsignedInt getDestport() {
        return destport;
    }


    /**
     * Sets the destport value for this Lbmonitor.
     * 
     * @param destport
     */
    public void setDestport(org.apache.axis.types.UnsignedInt destport) {
        this.destport = destport;
    }


    /**
     * Gets the state value for this Lbmonitor.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Lbmonitor.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the reverse value for this Lbmonitor.
     * 
     * @return reverse
     */
    public java.lang.String getReverse() {
        return reverse;
    }


    /**
     * Sets the reverse value for this Lbmonitor.
     * 
     * @param reverse
     */
    public void setReverse(java.lang.String reverse) {
        this.reverse = reverse;
    }


    /**
     * Gets the transparent value for this Lbmonitor.
     * 
     * @return transparent
     */
    public java.lang.String getTransparent() {
        return transparent;
    }


    /**
     * Sets the transparent value for this Lbmonitor.
     * 
     * @param transparent
     */
    public void setTransparent(java.lang.String transparent) {
        this.transparent = transparent;
    }


    /**
     * Gets the iptunnel value for this Lbmonitor.
     * 
     * @return iptunnel
     */
    public java.lang.String getIptunnel() {
        return iptunnel;
    }


    /**
     * Sets the iptunnel value for this Lbmonitor.
     * 
     * @param iptunnel
     */
    public void setIptunnel(java.lang.String iptunnel) {
        this.iptunnel = iptunnel;
    }


    /**
     * Gets the tos value for this Lbmonitor.
     * 
     * @return tos
     */
    public java.lang.String getTos() {
        return tos;
    }


    /**
     * Sets the tos value for this Lbmonitor.
     * 
     * @param tos
     */
    public void setTos(java.lang.String tos) {
        this.tos = tos;
    }


    /**
     * Gets the tosid value for this Lbmonitor.
     * 
     * @return tosid
     */
    public org.apache.axis.types.UnsignedInt getTosid() {
        return tosid;
    }


    /**
     * Sets the tosid value for this Lbmonitor.
     * 
     * @param tosid
     */
    public void setTosid(org.apache.axis.types.UnsignedInt tosid) {
        this.tosid = tosid;
    }


    /**
     * Gets the secure value for this Lbmonitor.
     * 
     * @return secure
     */
    public java.lang.String getSecure() {
        return secure;
    }


    /**
     * Sets the secure value for this Lbmonitor.
     * 
     * @param secure
     */
    public void setSecure(java.lang.String secure) {
        this.secure = secure;
    }


    /**
     * Gets the actioN value for this Lbmonitor.
     * 
     * @return actioN
     */
    public java.lang.String getActioN() {
        return actioN;
    }


    /**
     * Sets the actioN value for this Lbmonitor.
     * 
     * @param actioN
     */
    public void setActioN(java.lang.String actioN) {
        this.actioN = actioN;
    }


    /**
     * Gets the respcode value for this Lbmonitor.
     * 
     * @return respcode
     */
    public java.lang.String[] getRespcode() {
        return respcode;
    }


    /**
     * Sets the respcode value for this Lbmonitor.
     * 
     * @param respcode
     */
    public void setRespcode(java.lang.String[] respcode) {
        this.respcode = respcode;
    }


    /**
     * Gets the httprequest value for this Lbmonitor.
     * 
     * @return httprequest
     */
    public java.lang.String getHttprequest() {
        return httprequest;
    }


    /**
     * Sets the httprequest value for this Lbmonitor.
     * 
     * @param httprequest
     */
    public void setHttprequest(java.lang.String httprequest) {
        this.httprequest = httprequest;
    }


    /**
     * Gets the rtsprequest value for this Lbmonitor.
     * 
     * @return rtsprequest
     */
    public java.lang.String getRtsprequest() {
        return rtsprequest;
    }


    /**
     * Sets the rtsprequest value for this Lbmonitor.
     * 
     * @param rtsprequest
     */
    public void setRtsprequest(java.lang.String rtsprequest) {
        this.rtsprequest = rtsprequest;
    }


    /**
     * Gets the send value for this Lbmonitor.
     * 
     * @return send
     */
    public java.lang.String getSend() {
        return send;
    }


    /**
     * Sets the send value for this Lbmonitor.
     * 
     * @param send
     */
    public void setSend(java.lang.String send) {
        this.send = send;
    }


    /**
     * Gets the recv value for this Lbmonitor.
     * 
     * @return recv
     */
    public java.lang.String getRecv() {
        return recv;
    }


    /**
     * Sets the recv value for this Lbmonitor.
     * 
     * @param recv
     */
    public void setRecv(java.lang.String recv) {
        this.recv = recv;
    }


    /**
     * Gets the query value for this Lbmonitor.
     * 
     * @return query
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this Lbmonitor.
     * 
     * @param query
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the querytype value for this Lbmonitor.
     * 
     * @return querytype
     */
    public java.lang.String getQuerytype() {
        return querytype;
    }


    /**
     * Sets the querytype value for this Lbmonitor.
     * 
     * @param querytype
     */
    public void setQuerytype(java.lang.String querytype) {
        this.querytype = querytype;
    }


    /**
     * Gets the username value for this Lbmonitor.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this Lbmonitor.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the password value for this Lbmonitor.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this Lbmonitor.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the secondarypassword value for this Lbmonitor.
     * 
     * @return secondarypassword
     */
    public java.lang.String getSecondarypassword() {
        return secondarypassword;
    }


    /**
     * Sets the secondarypassword value for this Lbmonitor.
     * 
     * @param secondarypassword
     */
    public void setSecondarypassword(java.lang.String secondarypassword) {
        this.secondarypassword = secondarypassword;
    }


    /**
     * Gets the logonpointname value for this Lbmonitor.
     * 
     * @return logonpointname
     */
    public java.lang.String getLogonpointname() {
        return logonpointname;
    }


    /**
     * Sets the logonpointname value for this Lbmonitor.
     * 
     * @param logonpointname
     */
    public void setLogonpointname(java.lang.String logonpointname) {
        this.logonpointname = logonpointname;
    }


    /**
     * Gets the lasversion value for this Lbmonitor.
     * 
     * @return lasversion
     */
    public java.lang.String getLasversion() {
        return lasversion;
    }


    /**
     * Sets the lasversion value for this Lbmonitor.
     * 
     * @param lasversion
     */
    public void setLasversion(java.lang.String lasversion) {
        this.lasversion = lasversion;
    }


    /**
     * Gets the validatecred value for this Lbmonitor.
     * 
     * @return validatecred
     */
    public java.lang.String getValidatecred() {
        return validatecred;
    }


    /**
     * Sets the validatecred value for this Lbmonitor.
     * 
     * @param validatecred
     */
    public void setValidatecred(java.lang.String validatecred) {
        this.validatecred = validatecred;
    }


    /**
     * Gets the domain value for this Lbmonitor.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this Lbmonitor.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the radkey value for this Lbmonitor.
     * 
     * @return radkey
     */
    public java.lang.String getRadkey() {
        return radkey;
    }


    /**
     * Sets the radkey value for this Lbmonitor.
     * 
     * @param radkey
     */
    public void setRadkey(java.lang.String radkey) {
        this.radkey = radkey;
    }


    /**
     * Gets the radnasid value for this Lbmonitor.
     * 
     * @return radnasid
     */
    public java.lang.String getRadnasid() {
        return radnasid;
    }


    /**
     * Sets the radnasid value for this Lbmonitor.
     * 
     * @param radnasid
     */
    public void setRadnasid(java.lang.String radnasid) {
        this.radnasid = radnasid;
    }


    /**
     * Gets the radnasip value for this Lbmonitor.
     * 
     * @return radnasip
     */
    public java.lang.String getRadnasip() {
        return radnasip;
    }


    /**
     * Sets the radnasip value for this Lbmonitor.
     * 
     * @param radnasip
     */
    public void setRadnasip(java.lang.String radnasip) {
        this.radnasip = radnasip;
    }


    /**
     * Gets the radaccounttype value for this Lbmonitor.
     * 
     * @return radaccounttype
     */
    public org.apache.axis.types.UnsignedInt getRadaccounttype() {
        return radaccounttype;
    }


    /**
     * Sets the radaccounttype value for this Lbmonitor.
     * 
     * @param radaccounttype
     */
    public void setRadaccounttype(org.apache.axis.types.UnsignedInt radaccounttype) {
        this.radaccounttype = radaccounttype;
    }


    /**
     * Gets the radframedip value for this Lbmonitor.
     * 
     * @return radframedip
     */
    public java.lang.String getRadframedip() {
        return radframedip;
    }


    /**
     * Sets the radframedip value for this Lbmonitor.
     * 
     * @param radframedip
     */
    public void setRadframedip(java.lang.String radframedip) {
        this.radframedip = radframedip;
    }


    /**
     * Gets the radapn value for this Lbmonitor.
     * 
     * @return radapn
     */
    public java.lang.String getRadapn() {
        return radapn;
    }


    /**
     * Sets the radapn value for this Lbmonitor.
     * 
     * @param radapn
     */
    public void setRadapn(java.lang.String radapn) {
        this.radapn = radapn;
    }


    /**
     * Gets the radmsisdn value for this Lbmonitor.
     * 
     * @return radmsisdn
     */
    public java.lang.String getRadmsisdn() {
        return radmsisdn;
    }


    /**
     * Sets the radmsisdn value for this Lbmonitor.
     * 
     * @param radmsisdn
     */
    public void setRadmsisdn(java.lang.String radmsisdn) {
        this.radmsisdn = radmsisdn;
    }


    /**
     * Gets the radaccountsession value for this Lbmonitor.
     * 
     * @return radaccountsession
     */
    public java.lang.String getRadaccountsession() {
        return radaccountsession;
    }


    /**
     * Sets the radaccountsession value for this Lbmonitor.
     * 
     * @param radaccountsession
     */
    public void setRadaccountsession(java.lang.String radaccountsession) {
        this.radaccountsession = radaccountsession;
    }


    /**
     * Gets the lrtM value for this Lbmonitor.
     * 
     * @return lrtM
     */
    public java.lang.String getLrtM() {
        return lrtM;
    }


    /**
     * Sets the lrtM value for this Lbmonitor.
     * 
     * @param lrtM
     */
    public void setLrtM(java.lang.String lrtM) {
        this.lrtM = lrtM;
    }


    /**
     * Gets the lrtmconf value for this Lbmonitor.
     * 
     * @return lrtmconf
     */
    public int getLrtmconf() {
        return lrtmconf;
    }


    /**
     * Sets the lrtmconf value for this Lbmonitor.
     * 
     * @param lrtmconf
     */
    public void setLrtmconf(int lrtmconf) {
        this.lrtmconf = lrtmconf;
    }


    /**
     * Gets the deviation value for this Lbmonitor.
     * 
     * @return deviation
     */
    public org.apache.axis.types.UnsignedInt getDeviation() {
        return deviation;
    }


    /**
     * Sets the deviation value for this Lbmonitor.
     * 
     * @param deviation
     */
    public void setDeviation(org.apache.axis.types.UnsignedInt deviation) {
        this.deviation = deviation;
    }


    /**
     * Gets the units4 value for this Lbmonitor.
     * 
     * @return units4
     */
    public java.lang.String getUnits4() {
        return units4;
    }


    /**
     * Sets the units4 value for this Lbmonitor.
     * 
     * @param units4
     */
    public void setUnits4(java.lang.String units4) {
        this.units4 = units4;
    }


    /**
     * Gets the dynamicresponsetimeout value for this Lbmonitor.
     * 
     * @return dynamicresponsetimeout
     */
    public int getDynamicresponsetimeout() {
        return dynamicresponsetimeout;
    }


    /**
     * Sets the dynamicresponsetimeout value for this Lbmonitor.
     * 
     * @param dynamicresponsetimeout
     */
    public void setDynamicresponsetimeout(int dynamicresponsetimeout) {
        this.dynamicresponsetimeout = dynamicresponsetimeout;
    }


    /**
     * Gets the dynamicinterval value for this Lbmonitor.
     * 
     * @return dynamicinterval
     */
    public int getDynamicinterval() {
        return dynamicinterval;
    }


    /**
     * Sets the dynamicinterval value for this Lbmonitor.
     * 
     * @param dynamicinterval
     */
    public void setDynamicinterval(int dynamicinterval) {
        this.dynamicinterval = dynamicinterval;
    }


    /**
     * Gets the scriptname value for this Lbmonitor.
     * 
     * @return scriptname
     */
    public java.lang.String getScriptname() {
        return scriptname;
    }


    /**
     * Sets the scriptname value for this Lbmonitor.
     * 
     * @param scriptname
     */
    public void setScriptname(java.lang.String scriptname) {
        this.scriptname = scriptname;
    }


    /**
     * Gets the scriptargs value for this Lbmonitor.
     * 
     * @return scriptargs
     */
    public java.lang.String getScriptargs() {
        return scriptargs;
    }


    /**
     * Sets the scriptargs value for this Lbmonitor.
     * 
     * @param scriptargs
     */
    public void setScriptargs(java.lang.String scriptargs) {
        this.scriptargs = scriptargs;
    }


    /**
     * Gets the dispatcherip value for this Lbmonitor.
     * 
     * @return dispatcherip
     */
    public java.lang.String getDispatcherip() {
        return dispatcherip;
    }


    /**
     * Sets the dispatcherip value for this Lbmonitor.
     * 
     * @param dispatcherip
     */
    public void setDispatcherip(java.lang.String dispatcherip) {
        this.dispatcherip = dispatcherip;
    }


    /**
     * Gets the dispatcherport value for this Lbmonitor.
     * 
     * @return dispatcherport
     */
    public org.apache.axis.types.UnsignedInt getDispatcherport() {
        return dispatcherport;
    }


    /**
     * Sets the dispatcherport value for this Lbmonitor.
     * 
     * @param dispatcherport
     */
    public void setDispatcherport(org.apache.axis.types.UnsignedInt dispatcherport) {
        this.dispatcherport = dispatcherport;
    }


    /**
     * Gets the sipuri value for this Lbmonitor.
     * 
     * @return sipuri
     */
    public java.lang.String getSipuri() {
        return sipuri;
    }


    /**
     * Sets the sipuri value for this Lbmonitor.
     * 
     * @param sipuri
     */
    public void setSipuri(java.lang.String sipuri) {
        this.sipuri = sipuri;
    }


    /**
     * Gets the sipmethod value for this Lbmonitor.
     * 
     * @return sipmethod
     */
    public java.lang.String getSipmethod() {
        return sipmethod;
    }


    /**
     * Sets the sipmethod value for this Lbmonitor.
     * 
     * @param sipmethod
     */
    public void setSipmethod(java.lang.String sipmethod) {
        this.sipmethod = sipmethod;
    }


    /**
     * Gets the maxforwards value for this Lbmonitor.
     * 
     * @return maxforwards
     */
    public org.apache.axis.types.UnsignedInt getMaxforwards() {
        return maxforwards;
    }


    /**
     * Sets the maxforwards value for this Lbmonitor.
     * 
     * @param maxforwards
     */
    public void setMaxforwards(org.apache.axis.types.UnsignedInt maxforwards) {
        this.maxforwards = maxforwards;
    }


    /**
     * Gets the sipreguri value for this Lbmonitor.
     * 
     * @return sipreguri
     */
    public java.lang.String getSipreguri() {
        return sipreguri;
    }


    /**
     * Sets the sipreguri value for this Lbmonitor.
     * 
     * @param sipreguri
     */
    public void setSipreguri(java.lang.String sipreguri) {
        this.sipreguri = sipreguri;
    }


    /**
     * Gets the customheaders value for this Lbmonitor.
     * 
     * @return customheaders
     */
    public java.lang.String getCustomheaders() {
        return customheaders;
    }


    /**
     * Sets the customheaders value for this Lbmonitor.
     * 
     * @param customheaders
     */
    public void setCustomheaders(java.lang.String customheaders) {
        this.customheaders = customheaders;
    }


    /**
     * Gets the ipaddress value for this Lbmonitor.
     * 
     * @return ipaddress
     */
    public java.lang.String[] getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Lbmonitor.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String[] ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the group value for this Lbmonitor.
     * 
     * @return group
     */
    public java.lang.String getGroup() {
        return group;
    }


    /**
     * Sets the group value for this Lbmonitor.
     * 
     * @param group
     */
    public void setGroup(java.lang.String group) {
        this.group = group;
    }


    /**
     * Gets the filename value for this Lbmonitor.
     * 
     * @return filename
     */
    public java.lang.String getFilename() {
        return filename;
    }


    /**
     * Sets the filename value for this Lbmonitor.
     * 
     * @param filename
     */
    public void setFilename(java.lang.String filename) {
        this.filename = filename;
    }


    /**
     * Gets the basedn value for this Lbmonitor.
     * 
     * @return basedn
     */
    public java.lang.String getBasedn() {
        return basedn;
    }


    /**
     * Sets the basedn value for this Lbmonitor.
     * 
     * @param basedn
     */
    public void setBasedn(java.lang.String basedn) {
        this.basedn = basedn;
    }


    /**
     * Gets the binddn value for this Lbmonitor.
     * 
     * @return binddn
     */
    public java.lang.String getBinddn() {
        return binddn;
    }


    /**
     * Sets the binddn value for this Lbmonitor.
     * 
     * @param binddn
     */
    public void setBinddn(java.lang.String binddn) {
        this.binddn = binddn;
    }


    /**
     * Gets the filter value for this Lbmonitor.
     * 
     * @return filter
     */
    public java.lang.String getFilter() {
        return filter;
    }


    /**
     * Sets the filter value for this Lbmonitor.
     * 
     * @param filter
     */
    public void setFilter(java.lang.String filter) {
        this.filter = filter;
    }


    /**
     * Gets the attribute value for this Lbmonitor.
     * 
     * @return attribute
     */
    public java.lang.String getAttribute() {
        return attribute;
    }


    /**
     * Sets the attribute value for this Lbmonitor.
     * 
     * @param attribute
     */
    public void setAttribute(java.lang.String attribute) {
        this.attribute = attribute;
    }


    /**
     * Gets the database value for this Lbmonitor.
     * 
     * @return database
     */
    public java.lang.String getDatabase() {
        return database;
    }


    /**
     * Sets the database value for this Lbmonitor.
     * 
     * @param database
     */
    public void setDatabase(java.lang.String database) {
        this.database = database;
    }


    /**
     * Gets the sqlquery value for this Lbmonitor.
     * 
     * @return sqlquery
     */
    public java.lang.String getSqlquery() {
        return sqlquery;
    }


    /**
     * Sets the sqlquery value for this Lbmonitor.
     * 
     * @param sqlquery
     */
    public void setSqlquery(java.lang.String sqlquery) {
        this.sqlquery = sqlquery;
    }


    /**
     * Gets the evalrule value for this Lbmonitor.
     * 
     * @return evalrule
     */
    public java.lang.String getEvalrule() {
        return evalrule;
    }


    /**
     * Sets the evalrule value for this Lbmonitor.
     * 
     * @param evalrule
     */
    public void setEvalrule(java.lang.String evalrule) {
        this.evalrule = evalrule;
    }


    /**
     * Gets the snmpoid value for this Lbmonitor.
     * 
     * @return snmpoid
     */
    public java.lang.String getSnmpoid() {
        return snmpoid;
    }


    /**
     * Sets the snmpoid value for this Lbmonitor.
     * 
     * @param snmpoid
     */
    public void setSnmpoid(java.lang.String snmpoid) {
        this.snmpoid = snmpoid;
    }


    /**
     * Gets the snmpcommunity value for this Lbmonitor.
     * 
     * @return snmpcommunity
     */
    public java.lang.String getSnmpcommunity() {
        return snmpcommunity;
    }


    /**
     * Sets the snmpcommunity value for this Lbmonitor.
     * 
     * @param snmpcommunity
     */
    public void setSnmpcommunity(java.lang.String snmpcommunity) {
        this.snmpcommunity = snmpcommunity;
    }


    /**
     * Gets the snmpthreshold value for this Lbmonitor.
     * 
     * @return snmpthreshold
     */
    public java.lang.String getSnmpthreshold() {
        return snmpthreshold;
    }


    /**
     * Sets the snmpthreshold value for this Lbmonitor.
     * 
     * @param snmpthreshold
     */
    public void setSnmpthreshold(java.lang.String snmpthreshold) {
        this.snmpthreshold = snmpthreshold;
    }


    /**
     * Gets the snmpversion value for this Lbmonitor.
     * 
     * @return snmpversion
     */
    public java.lang.String getSnmpversion() {
        return snmpversion;
    }


    /**
     * Sets the snmpversion value for this Lbmonitor.
     * 
     * @param snmpversion
     */
    public void setSnmpversion(java.lang.String snmpversion) {
        this.snmpversion = snmpversion;
    }


    /**
     * Gets the metric value for this Lbmonitor.
     * 
     * @return metric
     */
    public java.lang.String getMetric() {
        return metric;
    }


    /**
     * Sets the metric value for this Lbmonitor.
     * 
     * @param metric
     */
    public void setMetric(java.lang.String metric) {
        this.metric = metric;
    }


    /**
     * Gets the metrictable value for this Lbmonitor.
     * 
     * @return metrictable
     */
    public java.lang.String[] getMetrictable() {
        return metrictable;
    }


    /**
     * Sets the metrictable value for this Lbmonitor.
     * 
     * @param metrictable
     */
    public void setMetrictable(java.lang.String[] metrictable) {
        this.metrictable = metrictable;
    }


    /**
     * Gets the multimetrictable value for this Lbmonitor.
     * 
     * @return multimetrictable
     */
    public java.lang.String[] getMultimetrictable() {
        return multimetrictable;
    }


    /**
     * Sets the multimetrictable value for this Lbmonitor.
     * 
     * @param multimetrictable
     */
    public void setMultimetrictable(java.lang.String[] multimetrictable) {
        this.multimetrictable = multimetrictable;
    }


    /**
     * Gets the metricthreshold value for this Lbmonitor.
     * 
     * @return metricthreshold
     */
    public org.apache.axis.types.UnsignedLong[] getMetricthreshold() {
        return metricthreshold;
    }


    /**
     * Sets the metricthreshold value for this Lbmonitor.
     * 
     * @param metricthreshold
     */
    public void setMetricthreshold(org.apache.axis.types.UnsignedLong[] metricthreshold) {
        this.metricthreshold = metricthreshold;
    }


    /**
     * Gets the metricweight value for this Lbmonitor.
     * 
     * @return metricweight
     */
    public org.apache.axis.types.UnsignedInt[] getMetricweight() {
        return metricweight;
    }


    /**
     * Sets the metricweight value for this Lbmonitor.
     * 
     * @param metricweight
     */
    public void setMetricweight(org.apache.axis.types.UnsignedInt[] metricweight) {
        this.metricweight = metricweight;
    }


    /**
     * Gets the application value for this Lbmonitor.
     * 
     * @return application
     */
    public java.lang.String getApplication() {
        return application;
    }


    /**
     * Sets the application value for this Lbmonitor.
     * 
     * @param application
     */
    public void setApplication(java.lang.String application) {
        this.application = application;
    }


    /**
     * Gets the sitepath value for this Lbmonitor.
     * 
     * @return sitepath
     */
    public java.lang.String getSitepath() {
        return sitepath;
    }


    /**
     * Sets the sitepath value for this Lbmonitor.
     * 
     * @param sitepath
     */
    public void setSitepath(java.lang.String sitepath) {
        this.sitepath = sitepath;
    }


    /**
     * Gets the storename value for this Lbmonitor.
     * 
     * @return storename
     */
    public java.lang.String getStorename() {
        return storename;
    }


    /**
     * Sets the storename value for this Lbmonitor.
     * 
     * @param storename
     */
    public void setStorename(java.lang.String storename) {
        this.storename = storename;
    }


    /**
     * Gets the storefrontacctservice value for this Lbmonitor.
     * 
     * @return storefrontacctservice
     */
    public java.lang.String getStorefrontacctservice() {
        return storefrontacctservice;
    }


    /**
     * Sets the storefrontacctservice value for this Lbmonitor.
     * 
     * @param storefrontacctservice
     */
    public void setStorefrontacctservice(java.lang.String storefrontacctservice) {
        this.storefrontacctservice = storefrontacctservice;
    }


    /**
     * Gets the hostname value for this Lbmonitor.
     * 
     * @return hostname
     */
    public java.lang.String getHostname() {
        return hostname;
    }


    /**
     * Sets the hostname value for this Lbmonitor.
     * 
     * @param hostname
     */
    public void setHostname(java.lang.String hostname) {
        this.hostname = hostname;
    }


    /**
     * Gets the units5 value for this Lbmonitor.
     * 
     * @return units5
     */
    public java.lang.String[] getUnits5() {
        return units5;
    }


    /**
     * Sets the units5 value for this Lbmonitor.
     * 
     * @param units5
     */
    public void setUnits5(java.lang.String[] units5) {
        this.units5 = units5;
    }


    /**
     * Gets the netprofile value for this Lbmonitor.
     * 
     * @return netprofile
     */
    public java.lang.String getNetprofile() {
        return netprofile;
    }


    /**
     * Sets the netprofile value for this Lbmonitor.
     * 
     * @param netprofile
     */
    public void setNetprofile(java.lang.String netprofile) {
        this.netprofile = netprofile;
    }


    /**
     * Gets the mssqlprotocolversion value for this Lbmonitor.
     * 
     * @return mssqlprotocolversion
     */
    public java.lang.String getMssqlprotocolversion() {
        return mssqlprotocolversion;
    }


    /**
     * Sets the mssqlprotocolversion value for this Lbmonitor.
     * 
     * @param mssqlprotocolversion
     */
    public void setMssqlprotocolversion(java.lang.String mssqlprotocolversion) {
        this.mssqlprotocolversion = mssqlprotocolversion;
    }


    /**
     * Gets the originhost value for this Lbmonitor.
     * 
     * @return originhost
     */
    public java.lang.String getOriginhost() {
        return originhost;
    }


    /**
     * Sets the originhost value for this Lbmonitor.
     * 
     * @param originhost
     */
    public void setOriginhost(java.lang.String originhost) {
        this.originhost = originhost;
    }


    /**
     * Gets the originrealm value for this Lbmonitor.
     * 
     * @return originrealm
     */
    public java.lang.String getOriginrealm() {
        return originrealm;
    }


    /**
     * Sets the originrealm value for this Lbmonitor.
     * 
     * @param originrealm
     */
    public void setOriginrealm(java.lang.String originrealm) {
        this.originrealm = originrealm;
    }


    /**
     * Gets the hostipaddress value for this Lbmonitor.
     * 
     * @return hostipaddress
     */
    public java.lang.String getHostipaddress() {
        return hostipaddress;
    }


    /**
     * Sets the hostipaddress value for this Lbmonitor.
     * 
     * @param hostipaddress
     */
    public void setHostipaddress(java.lang.String hostipaddress) {
        this.hostipaddress = hostipaddress;
    }


    /**
     * Gets the vendorid value for this Lbmonitor.
     * 
     * @return vendorid
     */
    public org.apache.axis.types.UnsignedInt getVendorid() {
        return vendorid;
    }


    /**
     * Sets the vendorid value for this Lbmonitor.
     * 
     * @param vendorid
     */
    public void setVendorid(org.apache.axis.types.UnsignedInt vendorid) {
        this.vendorid = vendorid;
    }


    /**
     * Gets the productname value for this Lbmonitor.
     * 
     * @return productname
     */
    public java.lang.String getProductname() {
        return productname;
    }


    /**
     * Sets the productname value for this Lbmonitor.
     * 
     * @param productname
     */
    public void setProductname(java.lang.String productname) {
        this.productname = productname;
    }


    /**
     * Gets the firmwarerevision value for this Lbmonitor.
     * 
     * @return firmwarerevision
     */
    public org.apache.axis.types.UnsignedInt getFirmwarerevision() {
        return firmwarerevision;
    }


    /**
     * Sets the firmwarerevision value for this Lbmonitor.
     * 
     * @param firmwarerevision
     */
    public void setFirmwarerevision(org.apache.axis.types.UnsignedInt firmwarerevision) {
        this.firmwarerevision = firmwarerevision;
    }


    /**
     * Gets the authapplicationid value for this Lbmonitor.
     * 
     * @return authapplicationid
     */
    public org.apache.axis.types.UnsignedInt[] getAuthapplicationid() {
        return authapplicationid;
    }


    /**
     * Sets the authapplicationid value for this Lbmonitor.
     * 
     * @param authapplicationid
     */
    public void setAuthapplicationid(org.apache.axis.types.UnsignedInt[] authapplicationid) {
        this.authapplicationid = authapplicationid;
    }


    /**
     * Gets the acctapplicationid value for this Lbmonitor.
     * 
     * @return acctapplicationid
     */
    public org.apache.axis.types.UnsignedInt[] getAcctapplicationid() {
        return acctapplicationid;
    }


    /**
     * Sets the acctapplicationid value for this Lbmonitor.
     * 
     * @param acctapplicationid
     */
    public void setAcctapplicationid(org.apache.axis.types.UnsignedInt[] acctapplicationid) {
        this.acctapplicationid = acctapplicationid;
    }


    /**
     * Gets the inbandsecurityid value for this Lbmonitor.
     * 
     * @return inbandsecurityid
     */
    public java.lang.String getInbandsecurityid() {
        return inbandsecurityid;
    }


    /**
     * Sets the inbandsecurityid value for this Lbmonitor.
     * 
     * @param inbandsecurityid
     */
    public void setInbandsecurityid(java.lang.String inbandsecurityid) {
        this.inbandsecurityid = inbandsecurityid;
    }


    /**
     * Gets the supportedvendorids value for this Lbmonitor.
     * 
     * @return supportedvendorids
     */
    public org.apache.axis.types.UnsignedInt[] getSupportedvendorids() {
        return supportedvendorids;
    }


    /**
     * Sets the supportedvendorids value for this Lbmonitor.
     * 
     * @param supportedvendorids
     */
    public void setSupportedvendorids(org.apache.axis.types.UnsignedInt[] supportedvendorids) {
        this.supportedvendorids = supportedvendorids;
    }


    /**
     * Gets the vendorspecificvendorid value for this Lbmonitor.
     * 
     * @return vendorspecificvendorid
     */
    public org.apache.axis.types.UnsignedInt getVendorspecificvendorid() {
        return vendorspecificvendorid;
    }


    /**
     * Sets the vendorspecificvendorid value for this Lbmonitor.
     * 
     * @param vendorspecificvendorid
     */
    public void setVendorspecificvendorid(org.apache.axis.types.UnsignedInt vendorspecificvendorid) {
        this.vendorspecificvendorid = vendorspecificvendorid;
    }


    /**
     * Gets the vendorspecificauthapplicationids value for this Lbmonitor.
     * 
     * @return vendorspecificauthapplicationids
     */
    public org.apache.axis.types.UnsignedInt[] getVendorspecificauthapplicationids() {
        return vendorspecificauthapplicationids;
    }


    /**
     * Sets the vendorspecificauthapplicationids value for this Lbmonitor.
     * 
     * @param vendorspecificauthapplicationids
     */
    public void setVendorspecificauthapplicationids(org.apache.axis.types.UnsignedInt[] vendorspecificauthapplicationids) {
        this.vendorspecificauthapplicationids = vendorspecificauthapplicationids;
    }


    /**
     * Gets the vendorspecificacctapplicationids value for this Lbmonitor.
     * 
     * @return vendorspecificacctapplicationids
     */
    public org.apache.axis.types.UnsignedInt[] getVendorspecificacctapplicationids() {
        return vendorspecificacctapplicationids;
    }


    /**
     * Sets the vendorspecificacctapplicationids value for this Lbmonitor.
     * 
     * @param vendorspecificacctapplicationids
     */
    public void setVendorspecificacctapplicationids(org.apache.axis.types.UnsignedInt[] vendorspecificacctapplicationids) {
        this.vendorspecificacctapplicationids = vendorspecificacctapplicationids;
    }


    /**
     * Gets the servicename value for this Lbmonitor.
     * 
     * @return servicename
     */
    public java.lang.String getServicename() {
        return servicename;
    }


    /**
     * Sets the servicename value for this Lbmonitor.
     * 
     * @param servicename
     */
    public void setServicename(java.lang.String servicename) {
        this.servicename = servicename;
    }


    /**
     * Gets the state2 value for this Lbmonitor.
     * 
     * @return state2
     */
    public java.lang.String getState2() {
        return state2;
    }


    /**
     * Sets the state2 value for this Lbmonitor.
     * 
     * @param state2
     */
    public void setState2(java.lang.String state2) {
        this.state2 = state2;
    }


    /**
     * Gets the weight value for this Lbmonitor.
     * 
     * @return weight
     */
    public org.apache.axis.types.UnsignedInt getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this Lbmonitor.
     * 
     * @param weight
     */
    public void setWeight(org.apache.axis.types.UnsignedInt weight) {
        this.weight = weight;
    }


    /**
     * Gets the servicegroupname value for this Lbmonitor.
     * 
     * @return servicegroupname
     */
    public java.lang.String getServicegroupname() {
        return servicegroupname;
    }


    /**
     * Sets the servicegroupname value for this Lbmonitor.
     * 
     * @param servicegroupname
     */
    public void setServicegroupname(java.lang.String servicegroupname) {
        this.servicegroupname = servicegroupname;
    }


    /**
     * Gets the weight2 value for this Lbmonitor.
     * 
     * @return weight2
     */
    public org.apache.axis.types.UnsignedInt getWeight2() {
        return weight2;
    }


    /**
     * Sets the weight2 value for this Lbmonitor.
     * 
     * @param weight2
     */
    public void setWeight2(org.apache.axis.types.UnsignedInt weight2) {
        this.weight2 = weight2;
    }


    /**
     * Gets the kcdaccount value for this Lbmonitor.
     * 
     * @return kcdaccount
     */
    public java.lang.String getKcdaccount() {
        return kcdaccount;
    }


    /**
     * Sets the kcdaccount value for this Lbmonitor.
     * 
     * @param kcdaccount
     */
    public void setKcdaccount(java.lang.String kcdaccount) {
        this.kcdaccount = kcdaccount;
    }


    /**
     * Gets the storedb value for this Lbmonitor.
     * 
     * @return storedb
     */
    public java.lang.String getStoredb() {
        return storedb;
    }


    /**
     * Sets the storedb value for this Lbmonitor.
     * 
     * @param storedb
     */
    public void setStoredb(java.lang.String storedb) {
        this.storedb = storedb;
    }


    /**
     * Gets the boundmetrictable value for this Lbmonitor.
     * 
     * @return boundmetrictable
     */
    public java.lang.String[] getBoundmetrictable() {
        return boundmetrictable;
    }


    /**
     * Sets the boundmetrictable value for this Lbmonitor.
     * 
     * @param boundmetrictable
     */
    public void setBoundmetrictable(java.lang.String[] boundmetrictable) {
        this.boundmetrictable = boundmetrictable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Lbmonitor)) return false;
        Lbmonitor other = (Lbmonitor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.monitorname==null && other.getMonitorname()==null) || 
             (this.monitorname!=null &&
              this.monitorname.equals(other.getMonitorname()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.interval == other.getInterval() &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits()))) &&
            this.resptimeout == other.getResptimeout() &&
            ((this.resptimeoutthresh==null && other.getResptimeoutthresh()==null) || 
             (this.resptimeoutthresh!=null &&
              this.resptimeoutthresh.equals(other.getResptimeoutthresh()))) &&
            ((this.units2==null && other.getUnits2()==null) || 
             (this.units2!=null &&
              this.units2.equals(other.getUnits2()))) &&
            this.retries == other.getRetries() &&
            this.failureretries == other.getFailureretries() &&
            this.alertretries == other.getAlertretries() &&
            this.successretries == other.getSuccessretries() &&
            this.downtime == other.getDowntime() &&
            ((this.units3==null && other.getUnits3()==null) || 
             (this.units3!=null &&
              this.units3.equals(other.getUnits3()))) &&
            ((this.destip==null && other.getDestip()==null) || 
             (this.destip!=null &&
              this.destip.equals(other.getDestip()))) &&
            ((this.destport==null && other.getDestport()==null) || 
             (this.destport!=null &&
              this.destport.equals(other.getDestport()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.reverse==null && other.getReverse()==null) || 
             (this.reverse!=null &&
              this.reverse.equals(other.getReverse()))) &&
            ((this.transparent==null && other.getTransparent()==null) || 
             (this.transparent!=null &&
              this.transparent.equals(other.getTransparent()))) &&
            ((this.iptunnel==null && other.getIptunnel()==null) || 
             (this.iptunnel!=null &&
              this.iptunnel.equals(other.getIptunnel()))) &&
            ((this.tos==null && other.getTos()==null) || 
             (this.tos!=null &&
              this.tos.equals(other.getTos()))) &&
            ((this.tosid==null && other.getTosid()==null) || 
             (this.tosid!=null &&
              this.tosid.equals(other.getTosid()))) &&
            ((this.secure==null && other.getSecure()==null) || 
             (this.secure!=null &&
              this.secure.equals(other.getSecure()))) &&
            ((this.actioN==null && other.getActioN()==null) || 
             (this.actioN!=null &&
              this.actioN.equals(other.getActioN()))) &&
            ((this.respcode==null && other.getRespcode()==null) || 
             (this.respcode!=null &&
              java.util.Arrays.equals(this.respcode, other.getRespcode()))) &&
            ((this.httprequest==null && other.getHttprequest()==null) || 
             (this.httprequest!=null &&
              this.httprequest.equals(other.getHttprequest()))) &&
            ((this.rtsprequest==null && other.getRtsprequest()==null) || 
             (this.rtsprequest!=null &&
              this.rtsprequest.equals(other.getRtsprequest()))) &&
            ((this.send==null && other.getSend()==null) || 
             (this.send!=null &&
              this.send.equals(other.getSend()))) &&
            ((this.recv==null && other.getRecv()==null) || 
             (this.recv!=null &&
              this.recv.equals(other.getRecv()))) &&
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.querytype==null && other.getQuerytype()==null) || 
             (this.querytype!=null &&
              this.querytype.equals(other.getQuerytype()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.secondarypassword==null && other.getSecondarypassword()==null) || 
             (this.secondarypassword!=null &&
              this.secondarypassword.equals(other.getSecondarypassword()))) &&
            ((this.logonpointname==null && other.getLogonpointname()==null) || 
             (this.logonpointname!=null &&
              this.logonpointname.equals(other.getLogonpointname()))) &&
            ((this.lasversion==null && other.getLasversion()==null) || 
             (this.lasversion!=null &&
              this.lasversion.equals(other.getLasversion()))) &&
            ((this.validatecred==null && other.getValidatecred()==null) || 
             (this.validatecred!=null &&
              this.validatecred.equals(other.getValidatecred()))) &&
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain()))) &&
            ((this.radkey==null && other.getRadkey()==null) || 
             (this.radkey!=null &&
              this.radkey.equals(other.getRadkey()))) &&
            ((this.radnasid==null && other.getRadnasid()==null) || 
             (this.radnasid!=null &&
              this.radnasid.equals(other.getRadnasid()))) &&
            ((this.radnasip==null && other.getRadnasip()==null) || 
             (this.radnasip!=null &&
              this.radnasip.equals(other.getRadnasip()))) &&
            ((this.radaccounttype==null && other.getRadaccounttype()==null) || 
             (this.radaccounttype!=null &&
              this.radaccounttype.equals(other.getRadaccounttype()))) &&
            ((this.radframedip==null && other.getRadframedip()==null) || 
             (this.radframedip!=null &&
              this.radframedip.equals(other.getRadframedip()))) &&
            ((this.radapn==null && other.getRadapn()==null) || 
             (this.radapn!=null &&
              this.radapn.equals(other.getRadapn()))) &&
            ((this.radmsisdn==null && other.getRadmsisdn()==null) || 
             (this.radmsisdn!=null &&
              this.radmsisdn.equals(other.getRadmsisdn()))) &&
            ((this.radaccountsession==null && other.getRadaccountsession()==null) || 
             (this.radaccountsession!=null &&
              this.radaccountsession.equals(other.getRadaccountsession()))) &&
            ((this.lrtM==null && other.getLrtM()==null) || 
             (this.lrtM!=null &&
              this.lrtM.equals(other.getLrtM()))) &&
            this.lrtmconf == other.getLrtmconf() &&
            ((this.deviation==null && other.getDeviation()==null) || 
             (this.deviation!=null &&
              this.deviation.equals(other.getDeviation()))) &&
            ((this.units4==null && other.getUnits4()==null) || 
             (this.units4!=null &&
              this.units4.equals(other.getUnits4()))) &&
            this.dynamicresponsetimeout == other.getDynamicresponsetimeout() &&
            this.dynamicinterval == other.getDynamicinterval() &&
            ((this.scriptname==null && other.getScriptname()==null) || 
             (this.scriptname!=null &&
              this.scriptname.equals(other.getScriptname()))) &&
            ((this.scriptargs==null && other.getScriptargs()==null) || 
             (this.scriptargs!=null &&
              this.scriptargs.equals(other.getScriptargs()))) &&
            ((this.dispatcherip==null && other.getDispatcherip()==null) || 
             (this.dispatcherip!=null &&
              this.dispatcherip.equals(other.getDispatcherip()))) &&
            ((this.dispatcherport==null && other.getDispatcherport()==null) || 
             (this.dispatcherport!=null &&
              this.dispatcherport.equals(other.getDispatcherport()))) &&
            ((this.sipuri==null && other.getSipuri()==null) || 
             (this.sipuri!=null &&
              this.sipuri.equals(other.getSipuri()))) &&
            ((this.sipmethod==null && other.getSipmethod()==null) || 
             (this.sipmethod!=null &&
              this.sipmethod.equals(other.getSipmethod()))) &&
            ((this.maxforwards==null && other.getMaxforwards()==null) || 
             (this.maxforwards!=null &&
              this.maxforwards.equals(other.getMaxforwards()))) &&
            ((this.sipreguri==null && other.getSipreguri()==null) || 
             (this.sipreguri!=null &&
              this.sipreguri.equals(other.getSipreguri()))) &&
            ((this.customheaders==null && other.getCustomheaders()==null) || 
             (this.customheaders!=null &&
              this.customheaders.equals(other.getCustomheaders()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              java.util.Arrays.equals(this.ipaddress, other.getIpaddress()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.filename==null && other.getFilename()==null) || 
             (this.filename!=null &&
              this.filename.equals(other.getFilename()))) &&
            ((this.basedn==null && other.getBasedn()==null) || 
             (this.basedn!=null &&
              this.basedn.equals(other.getBasedn()))) &&
            ((this.binddn==null && other.getBinddn()==null) || 
             (this.binddn!=null &&
              this.binddn.equals(other.getBinddn()))) &&
            ((this.filter==null && other.getFilter()==null) || 
             (this.filter!=null &&
              this.filter.equals(other.getFilter()))) &&
            ((this.attribute==null && other.getAttribute()==null) || 
             (this.attribute!=null &&
              this.attribute.equals(other.getAttribute()))) &&
            ((this.database==null && other.getDatabase()==null) || 
             (this.database!=null &&
              this.database.equals(other.getDatabase()))) &&
            ((this.sqlquery==null && other.getSqlquery()==null) || 
             (this.sqlquery!=null &&
              this.sqlquery.equals(other.getSqlquery()))) &&
            ((this.evalrule==null && other.getEvalrule()==null) || 
             (this.evalrule!=null &&
              this.evalrule.equals(other.getEvalrule()))) &&
            ((this.snmpoid==null && other.getSnmpoid()==null) || 
             (this.snmpoid!=null &&
              this.snmpoid.equals(other.getSnmpoid()))) &&
            ((this.snmpcommunity==null && other.getSnmpcommunity()==null) || 
             (this.snmpcommunity!=null &&
              this.snmpcommunity.equals(other.getSnmpcommunity()))) &&
            ((this.snmpthreshold==null && other.getSnmpthreshold()==null) || 
             (this.snmpthreshold!=null &&
              this.snmpthreshold.equals(other.getSnmpthreshold()))) &&
            ((this.snmpversion==null && other.getSnmpversion()==null) || 
             (this.snmpversion!=null &&
              this.snmpversion.equals(other.getSnmpversion()))) &&
            ((this.metric==null && other.getMetric()==null) || 
             (this.metric!=null &&
              this.metric.equals(other.getMetric()))) &&
            ((this.metrictable==null && other.getMetrictable()==null) || 
             (this.metrictable!=null &&
              java.util.Arrays.equals(this.metrictable, other.getMetrictable()))) &&
            ((this.multimetrictable==null && other.getMultimetrictable()==null) || 
             (this.multimetrictable!=null &&
              java.util.Arrays.equals(this.multimetrictable, other.getMultimetrictable()))) &&
            ((this.metricthreshold==null && other.getMetricthreshold()==null) || 
             (this.metricthreshold!=null &&
              java.util.Arrays.equals(this.metricthreshold, other.getMetricthreshold()))) &&
            ((this.metricweight==null && other.getMetricweight()==null) || 
             (this.metricweight!=null &&
              java.util.Arrays.equals(this.metricweight, other.getMetricweight()))) &&
            ((this.application==null && other.getApplication()==null) || 
             (this.application!=null &&
              this.application.equals(other.getApplication()))) &&
            ((this.sitepath==null && other.getSitepath()==null) || 
             (this.sitepath!=null &&
              this.sitepath.equals(other.getSitepath()))) &&
            ((this.storename==null && other.getStorename()==null) || 
             (this.storename!=null &&
              this.storename.equals(other.getStorename()))) &&
            ((this.storefrontacctservice==null && other.getStorefrontacctservice()==null) || 
             (this.storefrontacctservice!=null &&
              this.storefrontacctservice.equals(other.getStorefrontacctservice()))) &&
            ((this.hostname==null && other.getHostname()==null) || 
             (this.hostname!=null &&
              this.hostname.equals(other.getHostname()))) &&
            ((this.units5==null && other.getUnits5()==null) || 
             (this.units5!=null &&
              java.util.Arrays.equals(this.units5, other.getUnits5()))) &&
            ((this.netprofile==null && other.getNetprofile()==null) || 
             (this.netprofile!=null &&
              this.netprofile.equals(other.getNetprofile()))) &&
            ((this.mssqlprotocolversion==null && other.getMssqlprotocolversion()==null) || 
             (this.mssqlprotocolversion!=null &&
              this.mssqlprotocolversion.equals(other.getMssqlprotocolversion()))) &&
            ((this.originhost==null && other.getOriginhost()==null) || 
             (this.originhost!=null &&
              this.originhost.equals(other.getOriginhost()))) &&
            ((this.originrealm==null && other.getOriginrealm()==null) || 
             (this.originrealm!=null &&
              this.originrealm.equals(other.getOriginrealm()))) &&
            ((this.hostipaddress==null && other.getHostipaddress()==null) || 
             (this.hostipaddress!=null &&
              this.hostipaddress.equals(other.getHostipaddress()))) &&
            ((this.vendorid==null && other.getVendorid()==null) || 
             (this.vendorid!=null &&
              this.vendorid.equals(other.getVendorid()))) &&
            ((this.productname==null && other.getProductname()==null) || 
             (this.productname!=null &&
              this.productname.equals(other.getProductname()))) &&
            ((this.firmwarerevision==null && other.getFirmwarerevision()==null) || 
             (this.firmwarerevision!=null &&
              this.firmwarerevision.equals(other.getFirmwarerevision()))) &&
            ((this.authapplicationid==null && other.getAuthapplicationid()==null) || 
             (this.authapplicationid!=null &&
              java.util.Arrays.equals(this.authapplicationid, other.getAuthapplicationid()))) &&
            ((this.acctapplicationid==null && other.getAcctapplicationid()==null) || 
             (this.acctapplicationid!=null &&
              java.util.Arrays.equals(this.acctapplicationid, other.getAcctapplicationid()))) &&
            ((this.inbandsecurityid==null && other.getInbandsecurityid()==null) || 
             (this.inbandsecurityid!=null &&
              this.inbandsecurityid.equals(other.getInbandsecurityid()))) &&
            ((this.supportedvendorids==null && other.getSupportedvendorids()==null) || 
             (this.supportedvendorids!=null &&
              java.util.Arrays.equals(this.supportedvendorids, other.getSupportedvendorids()))) &&
            ((this.vendorspecificvendorid==null && other.getVendorspecificvendorid()==null) || 
             (this.vendorspecificvendorid!=null &&
              this.vendorspecificvendorid.equals(other.getVendorspecificvendorid()))) &&
            ((this.vendorspecificauthapplicationids==null && other.getVendorspecificauthapplicationids()==null) || 
             (this.vendorspecificauthapplicationids!=null &&
              java.util.Arrays.equals(this.vendorspecificauthapplicationids, other.getVendorspecificauthapplicationids()))) &&
            ((this.vendorspecificacctapplicationids==null && other.getVendorspecificacctapplicationids()==null) || 
             (this.vendorspecificacctapplicationids!=null &&
              java.util.Arrays.equals(this.vendorspecificacctapplicationids, other.getVendorspecificacctapplicationids()))) &&
            ((this.servicename==null && other.getServicename()==null) || 
             (this.servicename!=null &&
              this.servicename.equals(other.getServicename()))) &&
            ((this.state2==null && other.getState2()==null) || 
             (this.state2!=null &&
              this.state2.equals(other.getState2()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.servicegroupname==null && other.getServicegroupname()==null) || 
             (this.servicegroupname!=null &&
              this.servicegroupname.equals(other.getServicegroupname()))) &&
            ((this.weight2==null && other.getWeight2()==null) || 
             (this.weight2!=null &&
              this.weight2.equals(other.getWeight2()))) &&
            ((this.kcdaccount==null && other.getKcdaccount()==null) || 
             (this.kcdaccount!=null &&
              this.kcdaccount.equals(other.getKcdaccount()))) &&
            ((this.storedb==null && other.getStoredb()==null) || 
             (this.storedb!=null &&
              this.storedb.equals(other.getStoredb()))) &&
            ((this.boundmetrictable==null && other.getBoundmetrictable()==null) || 
             (this.boundmetrictable!=null &&
              java.util.Arrays.equals(this.boundmetrictable, other.getBoundmetrictable())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getMonitorname() != null) {
            _hashCode += getMonitorname().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += getInterval();
        if (getUnits() != null) {
            _hashCode += getUnits().hashCode();
        }
        _hashCode += getResptimeout();
        if (getResptimeoutthresh() != null) {
            _hashCode += getResptimeoutthresh().hashCode();
        }
        if (getUnits2() != null) {
            _hashCode += getUnits2().hashCode();
        }
        _hashCode += getRetries();
        _hashCode += getFailureretries();
        _hashCode += getAlertretries();
        _hashCode += getSuccessretries();
        _hashCode += getDowntime();
        if (getUnits3() != null) {
            _hashCode += getUnits3().hashCode();
        }
        if (getDestip() != null) {
            _hashCode += getDestip().hashCode();
        }
        if (getDestport() != null) {
            _hashCode += getDestport().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getReverse() != null) {
            _hashCode += getReverse().hashCode();
        }
        if (getTransparent() != null) {
            _hashCode += getTransparent().hashCode();
        }
        if (getIptunnel() != null) {
            _hashCode += getIptunnel().hashCode();
        }
        if (getTos() != null) {
            _hashCode += getTos().hashCode();
        }
        if (getTosid() != null) {
            _hashCode += getTosid().hashCode();
        }
        if (getSecure() != null) {
            _hashCode += getSecure().hashCode();
        }
        if (getActioN() != null) {
            _hashCode += getActioN().hashCode();
        }
        if (getRespcode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRespcode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRespcode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHttprequest() != null) {
            _hashCode += getHttprequest().hashCode();
        }
        if (getRtsprequest() != null) {
            _hashCode += getRtsprequest().hashCode();
        }
        if (getSend() != null) {
            _hashCode += getSend().hashCode();
        }
        if (getRecv() != null) {
            _hashCode += getRecv().hashCode();
        }
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getQuerytype() != null) {
            _hashCode += getQuerytype().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getSecondarypassword() != null) {
            _hashCode += getSecondarypassword().hashCode();
        }
        if (getLogonpointname() != null) {
            _hashCode += getLogonpointname().hashCode();
        }
        if (getLasversion() != null) {
            _hashCode += getLasversion().hashCode();
        }
        if (getValidatecred() != null) {
            _hashCode += getValidatecred().hashCode();
        }
        if (getDomain() != null) {
            _hashCode += getDomain().hashCode();
        }
        if (getRadkey() != null) {
            _hashCode += getRadkey().hashCode();
        }
        if (getRadnasid() != null) {
            _hashCode += getRadnasid().hashCode();
        }
        if (getRadnasip() != null) {
            _hashCode += getRadnasip().hashCode();
        }
        if (getRadaccounttype() != null) {
            _hashCode += getRadaccounttype().hashCode();
        }
        if (getRadframedip() != null) {
            _hashCode += getRadframedip().hashCode();
        }
        if (getRadapn() != null) {
            _hashCode += getRadapn().hashCode();
        }
        if (getRadmsisdn() != null) {
            _hashCode += getRadmsisdn().hashCode();
        }
        if (getRadaccountsession() != null) {
            _hashCode += getRadaccountsession().hashCode();
        }
        if (getLrtM() != null) {
            _hashCode += getLrtM().hashCode();
        }
        _hashCode += getLrtmconf();
        if (getDeviation() != null) {
            _hashCode += getDeviation().hashCode();
        }
        if (getUnits4() != null) {
            _hashCode += getUnits4().hashCode();
        }
        _hashCode += getDynamicresponsetimeout();
        _hashCode += getDynamicinterval();
        if (getScriptname() != null) {
            _hashCode += getScriptname().hashCode();
        }
        if (getScriptargs() != null) {
            _hashCode += getScriptargs().hashCode();
        }
        if (getDispatcherip() != null) {
            _hashCode += getDispatcherip().hashCode();
        }
        if (getDispatcherport() != null) {
            _hashCode += getDispatcherport().hashCode();
        }
        if (getSipuri() != null) {
            _hashCode += getSipuri().hashCode();
        }
        if (getSipmethod() != null) {
            _hashCode += getSipmethod().hashCode();
        }
        if (getMaxforwards() != null) {
            _hashCode += getMaxforwards().hashCode();
        }
        if (getSipreguri() != null) {
            _hashCode += getSipreguri().hashCode();
        }
        if (getCustomheaders() != null) {
            _hashCode += getCustomheaders().hashCode();
        }
        if (getIpaddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpaddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpaddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getFilename() != null) {
            _hashCode += getFilename().hashCode();
        }
        if (getBasedn() != null) {
            _hashCode += getBasedn().hashCode();
        }
        if (getBinddn() != null) {
            _hashCode += getBinddn().hashCode();
        }
        if (getFilter() != null) {
            _hashCode += getFilter().hashCode();
        }
        if (getAttribute() != null) {
            _hashCode += getAttribute().hashCode();
        }
        if (getDatabase() != null) {
            _hashCode += getDatabase().hashCode();
        }
        if (getSqlquery() != null) {
            _hashCode += getSqlquery().hashCode();
        }
        if (getEvalrule() != null) {
            _hashCode += getEvalrule().hashCode();
        }
        if (getSnmpoid() != null) {
            _hashCode += getSnmpoid().hashCode();
        }
        if (getSnmpcommunity() != null) {
            _hashCode += getSnmpcommunity().hashCode();
        }
        if (getSnmpthreshold() != null) {
            _hashCode += getSnmpthreshold().hashCode();
        }
        if (getSnmpversion() != null) {
            _hashCode += getSnmpversion().hashCode();
        }
        if (getMetric() != null) {
            _hashCode += getMetric().hashCode();
        }
        if (getMetrictable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetrictable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetrictable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMultimetrictable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMultimetrictable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMultimetrictable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMetricthreshold() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetricthreshold());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetricthreshold(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMetricweight() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetricweight());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetricweight(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getApplication() != null) {
            _hashCode += getApplication().hashCode();
        }
        if (getSitepath() != null) {
            _hashCode += getSitepath().hashCode();
        }
        if (getStorename() != null) {
            _hashCode += getStorename().hashCode();
        }
        if (getStorefrontacctservice() != null) {
            _hashCode += getStorefrontacctservice().hashCode();
        }
        if (getHostname() != null) {
            _hashCode += getHostname().hashCode();
        }
        if (getUnits5() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnits5());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnits5(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetprofile() != null) {
            _hashCode += getNetprofile().hashCode();
        }
        if (getMssqlprotocolversion() != null) {
            _hashCode += getMssqlprotocolversion().hashCode();
        }
        if (getOriginhost() != null) {
            _hashCode += getOriginhost().hashCode();
        }
        if (getOriginrealm() != null) {
            _hashCode += getOriginrealm().hashCode();
        }
        if (getHostipaddress() != null) {
            _hashCode += getHostipaddress().hashCode();
        }
        if (getVendorid() != null) {
            _hashCode += getVendorid().hashCode();
        }
        if (getProductname() != null) {
            _hashCode += getProductname().hashCode();
        }
        if (getFirmwarerevision() != null) {
            _hashCode += getFirmwarerevision().hashCode();
        }
        if (getAuthapplicationid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthapplicationid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthapplicationid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAcctapplicationid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAcctapplicationid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAcctapplicationid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInbandsecurityid() != null) {
            _hashCode += getInbandsecurityid().hashCode();
        }
        if (getSupportedvendorids() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSupportedvendorids());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSupportedvendorids(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVendorspecificvendorid() != null) {
            _hashCode += getVendorspecificvendorid().hashCode();
        }
        if (getVendorspecificauthapplicationids() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVendorspecificauthapplicationids());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVendorspecificauthapplicationids(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVendorspecificacctapplicationids() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVendorspecificacctapplicationids());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVendorspecificacctapplicationids(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServicename() != null) {
            _hashCode += getServicename().hashCode();
        }
        if (getState2() != null) {
            _hashCode += getState2().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getServicegroupname() != null) {
            _hashCode += getServicegroupname().hashCode();
        }
        if (getWeight2() != null) {
            _hashCode += getWeight2().hashCode();
        }
        if (getKcdaccount() != null) {
            _hashCode += getKcdaccount().hashCode();
        }
        if (getStoredb() != null) {
            _hashCode += getStoredb().hashCode();
        }
        if (getBoundmetrictable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundmetrictable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundmetrictable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Lbmonitor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "lbmonitor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monitorname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monitorname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("", "units"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resptimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resptimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resptimeoutthresh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resptimeoutthresh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "units2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failureretries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "failureretries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alertretries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alertretries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("successretries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "successretries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downtime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "downtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "units3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reverse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reverse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transparent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transparent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iptunnel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iptunnel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tosid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tosid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actioN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actioN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "respcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httprequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httprequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rtsprequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rtsprequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("send");
        elemField.setXmlName(new javax.xml.namespace.QName("", "send"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("", "query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("querytype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "querytype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondarypassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondarypassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logonpointname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logonpointname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lasversion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lasversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validatecred");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validatecred"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radkey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radkey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radnasid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radnasid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radnasip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radnasip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radaccounttype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radaccounttype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radframedip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radframedip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radapn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radapn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radmsisdn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radmsisdn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radaccountsession");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radaccountsession"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lrtM");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lrtM"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lrtmconf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lrtmconf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deviation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deviation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "units4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamicresponsetimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dynamicresponsetimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamicinterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dynamicinterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scriptname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scriptname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scriptargs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scriptargs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dispatcherip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dispatcherip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dispatcherport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dispatcherport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipuri");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipuri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipmethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipmethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxforwards");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxforwards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipreguri");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipreguri"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customheaders");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customheaders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipaddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basedn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "basedn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binddn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "binddn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("attribute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "attribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("database");
        elemField.setXmlName(new javax.xml.namespace.QName("", "database"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sqlquery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sqlquery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("evalrule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "evalrule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snmpoid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "snmpoid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snmpcommunity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "snmpcommunity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snmpthreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "snmpthreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snmpversion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "snmpversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metric");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metric"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metrictable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metrictable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multimetrictable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "multimetrictable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metricthreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metricthreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metricweight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metricweight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("application");
        elemField.setXmlName(new javax.xml.namespace.QName("", "application"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitepath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sitepath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storefrontacctservice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storefrontacctservice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "units5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netprofile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netprofile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mssqlprotocolversion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mssqlprotocolversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originhost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originhost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originrealm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originrealm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostipaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostipaddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firmwarerevision");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firmwarerevision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authapplicationid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authapplicationid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctapplicationid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctapplicationid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inbandsecurityid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inbandsecurityid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supportedvendorids");
        elemField.setXmlName(new javax.xml.namespace.QName("", "supportedvendorids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorspecificvendorid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorspecificvendorid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorspecificauthapplicationids");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorspecificauthapplicationids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vendorspecificacctapplicationids");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vendorspecificacctapplicationids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicegroupname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicegroupname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weight2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kcdaccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kcdaccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storedb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storedb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundmetrictable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundmetrictable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
