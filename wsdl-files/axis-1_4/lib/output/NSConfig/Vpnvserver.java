/**
 * Vpnvserver.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Vpnvserver  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String ipaddress;

    private java.lang.String ipaddress2;

    private java.lang.String value;

    private org.apache.axis.types.UnsignedInt port;

    private org.apache.axis.types.UnsignedInt range;

    private java.lang.String servicetype;

    private java.lang.String type;

    private java.lang.String state;

    private int status;

    private java.lang.String cachetype;

    private java.lang.String redirect;

    private java.lang.String precedence;

    private java.lang.String redirecturl;

    private java.lang.String authentication;

    private java.lang.String doublehop;

    private java.lang.String icaonly;

    private org.apache.axis.types.UnsignedInt maxaaausers;

    private org.apache.axis.types.UnsignedInt curaaausers;

    private java.lang.String domain;

    private java.lang.String rule;

    private java.lang.String policyname;

    private java.lang.String policy;

    private java.lang.String servicename;

    private org.apache.axis.types.UnsignedInt weight;

    private java.lang.String cachevserver;

    private java.lang.String backupvserver;

    private org.apache.axis.types.UnsignedInt priority;

    private org.apache.axis.types.UnsignedInt clttimeout;

    private java.lang.String somethod;

    private org.apache.axis.types.UnsignedInt sothreshold;

    private java.lang.String sopersistence;

    private org.apache.axis.types.UnsignedInt sopersistencetimeout;

    private org.apache.axis.types.UnsignedInt[] acttype;

    private java.lang.String[] intranetapplication;

    private java.lang.String[] nexthopserver;

    private java.lang.String[] urlname;

    private java.lang.String[] intranetip;

    private java.lang.String[] netmask;

    private java.lang.String[] staserver;

    private java.lang.String[] staauthid;

    private java.lang.String[] appcontroller;

    private java.lang.String[] sharefile;

    private java.lang.String usemip;

    private java.lang.String map;

    private java.lang.String downstateflush;

    private java.lang.String type2;

    private java.lang.String gotopriorityexpression;

    private java.lang.String disableprimaryondown;

    private java.lang.String listenpolicy;

    private org.apache.axis.types.UnsignedInt listenpriority;

    private java.lang.String tcpprofilename;

    private java.lang.String httpprofilename;

    private java.lang.String comment;

    private java.lang.String appflowlog;

    private java.lang.String icmpvsrresponse;

    private java.lang.String netprofile;

    private org.apache.axis.types.UnsignedInt maxloginattempts;

    private org.apache.axis.types.UnsignedInt failedlogintimeout;

    private boolean secondary;

    private boolean groupextraction;

    private java.lang.String[] intranetipmap;

    private java.lang.String[] syslogpolicyname;

    private org.apache.axis.types.UnsignedInt[] syslogpriority;

    private java.lang.String[] nslogpolicyname;

    private org.apache.axis.types.UnsignedInt[] nslogpriority;

    private java.lang.String[] sessionpolicyname;

    private org.apache.axis.types.UnsignedInt[] sessionpolicypriority;

    private java.lang.String[] radiusauthpolicyname;

    private org.apache.axis.types.UnsignedInt[] radiusauthpolicypriority;

    private boolean[] radiusauthpolicysecondary;

    private java.lang.String[] ldapauthpolicyname;

    private org.apache.axis.types.UnsignedInt[] ldapauthpolicypriority;

    private boolean[] ldapauthpolicysecondary;

    private boolean[] ldapauthpolicygroupextraction;

    private java.lang.String[] certauthpolicyname;

    private org.apache.axis.types.UnsignedInt[] certauthpolicypriority;

    private boolean[] certauthpolicysecondary;

    private java.lang.String[] tacacsauthpolicyname;

    private org.apache.axis.types.UnsignedInt[] tacacsauthpolicypriority;

    private boolean[] tacacsauthpolicysecondary;

    private java.lang.String[] localauthpolicyname;

    private org.apache.axis.types.UnsignedInt[] localauthpolicypriority;

    private boolean[] localauthpolicysecondary;

    private java.lang.String[] negauthpolicyname;

    private org.apache.axis.types.UnsignedInt[] negauthpolicypriority;

    private boolean[] negauthpolicysecondary;

    private java.lang.String[] samlauthpolicyname;

    private org.apache.axis.types.UnsignedInt[] samlauthpolicypriority;

    private boolean[] samlauthpolicysecondary;

    private java.lang.String[] trafficpolicyname;

    private org.apache.axis.types.UnsignedInt[] trafficpolicypriority;

    private java.lang.String[] preauthenticationpolicyname;

    private org.apache.axis.types.UnsignedInt[] preauthenticationpolicypriority;

    private java.lang.String[] cvpnpolicyname;

    private org.apache.axis.types.UnsignedInt[] cvpnpriority;

    private java.lang.String[] cvpnbindpoint;

    private java.lang.String[] cvpngotopriorityexpression;

    private java.lang.String[] rwpolicyname;

    private org.apache.axis.types.UnsignedInt[] rwpolicypriority;

    private java.lang.String[] rwpolicygotoprioexpression;

    private java.lang.String[] rwpolicybindpoint;

    private java.lang.String[] rsppolicyname;

    private org.apache.axis.types.UnsignedInt[] rsppolicypriority;

    private java.lang.String[] rsppolicygotoprioexpression;

    private java.lang.String[] cachepolicyname;

    private org.apache.axis.types.UnsignedInt[] cachepolicypriority;

    private java.lang.String[] cachepolicygotoprioexpression;

    private java.lang.String[] appflowpolicyname;

    private org.apache.axis.types.UnsignedInt[] appflowpolicypriority;

    private java.lang.String[] appflowpolicygotoprioexpression;

    private java.lang.String[] appflowpolicybindpoint;

    public Vpnvserver() {
    }

    public Vpnvserver(
           java.lang.String name,
           java.lang.String ipaddress,
           java.lang.String ipaddress2,
           java.lang.String value,
           org.apache.axis.types.UnsignedInt port,
           org.apache.axis.types.UnsignedInt range,
           java.lang.String servicetype,
           java.lang.String type,
           java.lang.String state,
           int status,
           java.lang.String cachetype,
           java.lang.String redirect,
           java.lang.String precedence,
           java.lang.String redirecturl,
           java.lang.String authentication,
           java.lang.String doublehop,
           java.lang.String icaonly,
           org.apache.axis.types.UnsignedInt maxaaausers,
           org.apache.axis.types.UnsignedInt curaaausers,
           java.lang.String domain,
           java.lang.String rule,
           java.lang.String policyname,
           java.lang.String policy,
           java.lang.String servicename,
           org.apache.axis.types.UnsignedInt weight,
           java.lang.String cachevserver,
           java.lang.String backupvserver,
           org.apache.axis.types.UnsignedInt priority,
           org.apache.axis.types.UnsignedInt clttimeout,
           java.lang.String somethod,
           org.apache.axis.types.UnsignedInt sothreshold,
           java.lang.String sopersistence,
           org.apache.axis.types.UnsignedInt sopersistencetimeout,
           org.apache.axis.types.UnsignedInt[] acttype,
           java.lang.String[] intranetapplication,
           java.lang.String[] nexthopserver,
           java.lang.String[] urlname,
           java.lang.String[] intranetip,
           java.lang.String[] netmask,
           java.lang.String[] staserver,
           java.lang.String[] staauthid,
           java.lang.String[] appcontroller,
           java.lang.String[] sharefile,
           java.lang.String usemip,
           java.lang.String map,
           java.lang.String downstateflush,
           java.lang.String type2,
           java.lang.String gotopriorityexpression,
           java.lang.String disableprimaryondown,
           java.lang.String listenpolicy,
           org.apache.axis.types.UnsignedInt listenpriority,
           java.lang.String tcpprofilename,
           java.lang.String httpprofilename,
           java.lang.String comment,
           java.lang.String appflowlog,
           java.lang.String icmpvsrresponse,
           java.lang.String netprofile,
           org.apache.axis.types.UnsignedInt maxloginattempts,
           org.apache.axis.types.UnsignedInt failedlogintimeout,
           boolean secondary,
           boolean groupextraction,
           java.lang.String[] intranetipmap,
           java.lang.String[] syslogpolicyname,
           org.apache.axis.types.UnsignedInt[] syslogpriority,
           java.lang.String[] nslogpolicyname,
           org.apache.axis.types.UnsignedInt[] nslogpriority,
           java.lang.String[] sessionpolicyname,
           org.apache.axis.types.UnsignedInt[] sessionpolicypriority,
           java.lang.String[] radiusauthpolicyname,
           org.apache.axis.types.UnsignedInt[] radiusauthpolicypriority,
           boolean[] radiusauthpolicysecondary,
           java.lang.String[] ldapauthpolicyname,
           org.apache.axis.types.UnsignedInt[] ldapauthpolicypriority,
           boolean[] ldapauthpolicysecondary,
           boolean[] ldapauthpolicygroupextraction,
           java.lang.String[] certauthpolicyname,
           org.apache.axis.types.UnsignedInt[] certauthpolicypriority,
           boolean[] certauthpolicysecondary,
           java.lang.String[] tacacsauthpolicyname,
           org.apache.axis.types.UnsignedInt[] tacacsauthpolicypriority,
           boolean[] tacacsauthpolicysecondary,
           java.lang.String[] localauthpolicyname,
           org.apache.axis.types.UnsignedInt[] localauthpolicypriority,
           boolean[] localauthpolicysecondary,
           java.lang.String[] negauthpolicyname,
           org.apache.axis.types.UnsignedInt[] negauthpolicypriority,
           boolean[] negauthpolicysecondary,
           java.lang.String[] samlauthpolicyname,
           org.apache.axis.types.UnsignedInt[] samlauthpolicypriority,
           boolean[] samlauthpolicysecondary,
           java.lang.String[] trafficpolicyname,
           org.apache.axis.types.UnsignedInt[] trafficpolicypriority,
           java.lang.String[] preauthenticationpolicyname,
           org.apache.axis.types.UnsignedInt[] preauthenticationpolicypriority,
           java.lang.String[] cvpnpolicyname,
           org.apache.axis.types.UnsignedInt[] cvpnpriority,
           java.lang.String[] cvpnbindpoint,
           java.lang.String[] cvpngotopriorityexpression,
           java.lang.String[] rwpolicyname,
           org.apache.axis.types.UnsignedInt[] rwpolicypriority,
           java.lang.String[] rwpolicygotoprioexpression,
           java.lang.String[] rwpolicybindpoint,
           java.lang.String[] rsppolicyname,
           org.apache.axis.types.UnsignedInt[] rsppolicypriority,
           java.lang.String[] rsppolicygotoprioexpression,
           java.lang.String[] cachepolicyname,
           org.apache.axis.types.UnsignedInt[] cachepolicypriority,
           java.lang.String[] cachepolicygotoprioexpression,
           java.lang.String[] appflowpolicyname,
           org.apache.axis.types.UnsignedInt[] appflowpolicypriority,
           java.lang.String[] appflowpolicygotoprioexpression,
           java.lang.String[] appflowpolicybindpoint) {
           this.name = name;
           this.ipaddress = ipaddress;
           this.ipaddress2 = ipaddress2;
           this.value = value;
           this.port = port;
           this.range = range;
           this.servicetype = servicetype;
           this.type = type;
           this.state = state;
           this.status = status;
           this.cachetype = cachetype;
           this.redirect = redirect;
           this.precedence = precedence;
           this.redirecturl = redirecturl;
           this.authentication = authentication;
           this.doublehop = doublehop;
           this.icaonly = icaonly;
           this.maxaaausers = maxaaausers;
           this.curaaausers = curaaausers;
           this.domain = domain;
           this.rule = rule;
           this.policyname = policyname;
           this.policy = policy;
           this.servicename = servicename;
           this.weight = weight;
           this.cachevserver = cachevserver;
           this.backupvserver = backupvserver;
           this.priority = priority;
           this.clttimeout = clttimeout;
           this.somethod = somethod;
           this.sothreshold = sothreshold;
           this.sopersistence = sopersistence;
           this.sopersistencetimeout = sopersistencetimeout;
           this.acttype = acttype;
           this.intranetapplication = intranetapplication;
           this.nexthopserver = nexthopserver;
           this.urlname = urlname;
           this.intranetip = intranetip;
           this.netmask = netmask;
           this.staserver = staserver;
           this.staauthid = staauthid;
           this.appcontroller = appcontroller;
           this.sharefile = sharefile;
           this.usemip = usemip;
           this.map = map;
           this.downstateflush = downstateflush;
           this.type2 = type2;
           this.gotopriorityexpression = gotopriorityexpression;
           this.disableprimaryondown = disableprimaryondown;
           this.listenpolicy = listenpolicy;
           this.listenpriority = listenpriority;
           this.tcpprofilename = tcpprofilename;
           this.httpprofilename = httpprofilename;
           this.comment = comment;
           this.appflowlog = appflowlog;
           this.icmpvsrresponse = icmpvsrresponse;
           this.netprofile = netprofile;
           this.maxloginattempts = maxloginattempts;
           this.failedlogintimeout = failedlogintimeout;
           this.secondary = secondary;
           this.groupextraction = groupextraction;
           this.intranetipmap = intranetipmap;
           this.syslogpolicyname = syslogpolicyname;
           this.syslogpriority = syslogpriority;
           this.nslogpolicyname = nslogpolicyname;
           this.nslogpriority = nslogpriority;
           this.sessionpolicyname = sessionpolicyname;
           this.sessionpolicypriority = sessionpolicypriority;
           this.radiusauthpolicyname = radiusauthpolicyname;
           this.radiusauthpolicypriority = radiusauthpolicypriority;
           this.radiusauthpolicysecondary = radiusauthpolicysecondary;
           this.ldapauthpolicyname = ldapauthpolicyname;
           this.ldapauthpolicypriority = ldapauthpolicypriority;
           this.ldapauthpolicysecondary = ldapauthpolicysecondary;
           this.ldapauthpolicygroupextraction = ldapauthpolicygroupextraction;
           this.certauthpolicyname = certauthpolicyname;
           this.certauthpolicypriority = certauthpolicypriority;
           this.certauthpolicysecondary = certauthpolicysecondary;
           this.tacacsauthpolicyname = tacacsauthpolicyname;
           this.tacacsauthpolicypriority = tacacsauthpolicypriority;
           this.tacacsauthpolicysecondary = tacacsauthpolicysecondary;
           this.localauthpolicyname = localauthpolicyname;
           this.localauthpolicypriority = localauthpolicypriority;
           this.localauthpolicysecondary = localauthpolicysecondary;
           this.negauthpolicyname = negauthpolicyname;
           this.negauthpolicypriority = negauthpolicypriority;
           this.negauthpolicysecondary = negauthpolicysecondary;
           this.samlauthpolicyname = samlauthpolicyname;
           this.samlauthpolicypriority = samlauthpolicypriority;
           this.samlauthpolicysecondary = samlauthpolicysecondary;
           this.trafficpolicyname = trafficpolicyname;
           this.trafficpolicypriority = trafficpolicypriority;
           this.preauthenticationpolicyname = preauthenticationpolicyname;
           this.preauthenticationpolicypriority = preauthenticationpolicypriority;
           this.cvpnpolicyname = cvpnpolicyname;
           this.cvpnpriority = cvpnpriority;
           this.cvpnbindpoint = cvpnbindpoint;
           this.cvpngotopriorityexpression = cvpngotopriorityexpression;
           this.rwpolicyname = rwpolicyname;
           this.rwpolicypriority = rwpolicypriority;
           this.rwpolicygotoprioexpression = rwpolicygotoprioexpression;
           this.rwpolicybindpoint = rwpolicybindpoint;
           this.rsppolicyname = rsppolicyname;
           this.rsppolicypriority = rsppolicypriority;
           this.rsppolicygotoprioexpression = rsppolicygotoprioexpression;
           this.cachepolicyname = cachepolicyname;
           this.cachepolicypriority = cachepolicypriority;
           this.cachepolicygotoprioexpression = cachepolicygotoprioexpression;
           this.appflowpolicyname = appflowpolicyname;
           this.appflowpolicypriority = appflowpolicypriority;
           this.appflowpolicygotoprioexpression = appflowpolicygotoprioexpression;
           this.appflowpolicybindpoint = appflowpolicybindpoint;
    }


    /**
     * Gets the name value for this Vpnvserver.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Vpnvserver.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the ipaddress value for this Vpnvserver.
     * 
     * @return ipaddress
     */
    public java.lang.String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Vpnvserver.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the ipaddress2 value for this Vpnvserver.
     * 
     * @return ipaddress2
     */
    public java.lang.String getIpaddress2() {
        return ipaddress2;
    }


    /**
     * Sets the ipaddress2 value for this Vpnvserver.
     * 
     * @param ipaddress2
     */
    public void setIpaddress2(java.lang.String ipaddress2) {
        this.ipaddress2 = ipaddress2;
    }


    /**
     * Gets the value value for this Vpnvserver.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this Vpnvserver.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the port value for this Vpnvserver.
     * 
     * @return port
     */
    public org.apache.axis.types.UnsignedInt getPort() {
        return port;
    }


    /**
     * Sets the port value for this Vpnvserver.
     * 
     * @param port
     */
    public void setPort(org.apache.axis.types.UnsignedInt port) {
        this.port = port;
    }


    /**
     * Gets the range value for this Vpnvserver.
     * 
     * @return range
     */
    public org.apache.axis.types.UnsignedInt getRange() {
        return range;
    }


    /**
     * Sets the range value for this Vpnvserver.
     * 
     * @param range
     */
    public void setRange(org.apache.axis.types.UnsignedInt range) {
        this.range = range;
    }


    /**
     * Gets the servicetype value for this Vpnvserver.
     * 
     * @return servicetype
     */
    public java.lang.String getServicetype() {
        return servicetype;
    }


    /**
     * Sets the servicetype value for this Vpnvserver.
     * 
     * @param servicetype
     */
    public void setServicetype(java.lang.String servicetype) {
        this.servicetype = servicetype;
    }


    /**
     * Gets the type value for this Vpnvserver.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Vpnvserver.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the state value for this Vpnvserver.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Vpnvserver.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the status value for this Vpnvserver.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Vpnvserver.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the cachetype value for this Vpnvserver.
     * 
     * @return cachetype
     */
    public java.lang.String getCachetype() {
        return cachetype;
    }


    /**
     * Sets the cachetype value for this Vpnvserver.
     * 
     * @param cachetype
     */
    public void setCachetype(java.lang.String cachetype) {
        this.cachetype = cachetype;
    }


    /**
     * Gets the redirect value for this Vpnvserver.
     * 
     * @return redirect
     */
    public java.lang.String getRedirect() {
        return redirect;
    }


    /**
     * Sets the redirect value for this Vpnvserver.
     * 
     * @param redirect
     */
    public void setRedirect(java.lang.String redirect) {
        this.redirect = redirect;
    }


    /**
     * Gets the precedence value for this Vpnvserver.
     * 
     * @return precedence
     */
    public java.lang.String getPrecedence() {
        return precedence;
    }


    /**
     * Sets the precedence value for this Vpnvserver.
     * 
     * @param precedence
     */
    public void setPrecedence(java.lang.String precedence) {
        this.precedence = precedence;
    }


    /**
     * Gets the redirecturl value for this Vpnvserver.
     * 
     * @return redirecturl
     */
    public java.lang.String getRedirecturl() {
        return redirecturl;
    }


    /**
     * Sets the redirecturl value for this Vpnvserver.
     * 
     * @param redirecturl
     */
    public void setRedirecturl(java.lang.String redirecturl) {
        this.redirecturl = redirecturl;
    }


    /**
     * Gets the authentication value for this Vpnvserver.
     * 
     * @return authentication
     */
    public java.lang.String getAuthentication() {
        return authentication;
    }


    /**
     * Sets the authentication value for this Vpnvserver.
     * 
     * @param authentication
     */
    public void setAuthentication(java.lang.String authentication) {
        this.authentication = authentication;
    }


    /**
     * Gets the doublehop value for this Vpnvserver.
     * 
     * @return doublehop
     */
    public java.lang.String getDoublehop() {
        return doublehop;
    }


    /**
     * Sets the doublehop value for this Vpnvserver.
     * 
     * @param doublehop
     */
    public void setDoublehop(java.lang.String doublehop) {
        this.doublehop = doublehop;
    }


    /**
     * Gets the icaonly value for this Vpnvserver.
     * 
     * @return icaonly
     */
    public java.lang.String getIcaonly() {
        return icaonly;
    }


    /**
     * Sets the icaonly value for this Vpnvserver.
     * 
     * @param icaonly
     */
    public void setIcaonly(java.lang.String icaonly) {
        this.icaonly = icaonly;
    }


    /**
     * Gets the maxaaausers value for this Vpnvserver.
     * 
     * @return maxaaausers
     */
    public org.apache.axis.types.UnsignedInt getMaxaaausers() {
        return maxaaausers;
    }


    /**
     * Sets the maxaaausers value for this Vpnvserver.
     * 
     * @param maxaaausers
     */
    public void setMaxaaausers(org.apache.axis.types.UnsignedInt maxaaausers) {
        this.maxaaausers = maxaaausers;
    }


    /**
     * Gets the curaaausers value for this Vpnvserver.
     * 
     * @return curaaausers
     */
    public org.apache.axis.types.UnsignedInt getCuraaausers() {
        return curaaausers;
    }


    /**
     * Sets the curaaausers value for this Vpnvserver.
     * 
     * @param curaaausers
     */
    public void setCuraaausers(org.apache.axis.types.UnsignedInt curaaausers) {
        this.curaaausers = curaaausers;
    }


    /**
     * Gets the domain value for this Vpnvserver.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this Vpnvserver.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the rule value for this Vpnvserver.
     * 
     * @return rule
     */
    public java.lang.String getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this Vpnvserver.
     * 
     * @param rule
     */
    public void setRule(java.lang.String rule) {
        this.rule = rule;
    }


    /**
     * Gets the policyname value for this Vpnvserver.
     * 
     * @return policyname
     */
    public java.lang.String getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Vpnvserver.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the policy value for this Vpnvserver.
     * 
     * @return policy
     */
    public java.lang.String getPolicy() {
        return policy;
    }


    /**
     * Sets the policy value for this Vpnvserver.
     * 
     * @param policy
     */
    public void setPolicy(java.lang.String policy) {
        this.policy = policy;
    }


    /**
     * Gets the servicename value for this Vpnvserver.
     * 
     * @return servicename
     */
    public java.lang.String getServicename() {
        return servicename;
    }


    /**
     * Sets the servicename value for this Vpnvserver.
     * 
     * @param servicename
     */
    public void setServicename(java.lang.String servicename) {
        this.servicename = servicename;
    }


    /**
     * Gets the weight value for this Vpnvserver.
     * 
     * @return weight
     */
    public org.apache.axis.types.UnsignedInt getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this Vpnvserver.
     * 
     * @param weight
     */
    public void setWeight(org.apache.axis.types.UnsignedInt weight) {
        this.weight = weight;
    }


    /**
     * Gets the cachevserver value for this Vpnvserver.
     * 
     * @return cachevserver
     */
    public java.lang.String getCachevserver() {
        return cachevserver;
    }


    /**
     * Sets the cachevserver value for this Vpnvserver.
     * 
     * @param cachevserver
     */
    public void setCachevserver(java.lang.String cachevserver) {
        this.cachevserver = cachevserver;
    }


    /**
     * Gets the backupvserver value for this Vpnvserver.
     * 
     * @return backupvserver
     */
    public java.lang.String getBackupvserver() {
        return backupvserver;
    }


    /**
     * Sets the backupvserver value for this Vpnvserver.
     * 
     * @param backupvserver
     */
    public void setBackupvserver(java.lang.String backupvserver) {
        this.backupvserver = backupvserver;
    }


    /**
     * Gets the priority value for this Vpnvserver.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Vpnvserver.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the clttimeout value for this Vpnvserver.
     * 
     * @return clttimeout
     */
    public org.apache.axis.types.UnsignedInt getClttimeout() {
        return clttimeout;
    }


    /**
     * Sets the clttimeout value for this Vpnvserver.
     * 
     * @param clttimeout
     */
    public void setClttimeout(org.apache.axis.types.UnsignedInt clttimeout) {
        this.clttimeout = clttimeout;
    }


    /**
     * Gets the somethod value for this Vpnvserver.
     * 
     * @return somethod
     */
    public java.lang.String getSomethod() {
        return somethod;
    }


    /**
     * Sets the somethod value for this Vpnvserver.
     * 
     * @param somethod
     */
    public void setSomethod(java.lang.String somethod) {
        this.somethod = somethod;
    }


    /**
     * Gets the sothreshold value for this Vpnvserver.
     * 
     * @return sothreshold
     */
    public org.apache.axis.types.UnsignedInt getSothreshold() {
        return sothreshold;
    }


    /**
     * Sets the sothreshold value for this Vpnvserver.
     * 
     * @param sothreshold
     */
    public void setSothreshold(org.apache.axis.types.UnsignedInt sothreshold) {
        this.sothreshold = sothreshold;
    }


    /**
     * Gets the sopersistence value for this Vpnvserver.
     * 
     * @return sopersistence
     */
    public java.lang.String getSopersistence() {
        return sopersistence;
    }


    /**
     * Sets the sopersistence value for this Vpnvserver.
     * 
     * @param sopersistence
     */
    public void setSopersistence(java.lang.String sopersistence) {
        this.sopersistence = sopersistence;
    }


    /**
     * Gets the sopersistencetimeout value for this Vpnvserver.
     * 
     * @return sopersistencetimeout
     */
    public org.apache.axis.types.UnsignedInt getSopersistencetimeout() {
        return sopersistencetimeout;
    }


    /**
     * Sets the sopersistencetimeout value for this Vpnvserver.
     * 
     * @param sopersistencetimeout
     */
    public void setSopersistencetimeout(org.apache.axis.types.UnsignedInt sopersistencetimeout) {
        this.sopersistencetimeout = sopersistencetimeout;
    }


    /**
     * Gets the acttype value for this Vpnvserver.
     * 
     * @return acttype
     */
    public org.apache.axis.types.UnsignedInt[] getActtype() {
        return acttype;
    }


    /**
     * Sets the acttype value for this Vpnvserver.
     * 
     * @param acttype
     */
    public void setActtype(org.apache.axis.types.UnsignedInt[] acttype) {
        this.acttype = acttype;
    }


    /**
     * Gets the intranetapplication value for this Vpnvserver.
     * 
     * @return intranetapplication
     */
    public java.lang.String[] getIntranetapplication() {
        return intranetapplication;
    }


    /**
     * Sets the intranetapplication value for this Vpnvserver.
     * 
     * @param intranetapplication
     */
    public void setIntranetapplication(java.lang.String[] intranetapplication) {
        this.intranetapplication = intranetapplication;
    }


    /**
     * Gets the nexthopserver value for this Vpnvserver.
     * 
     * @return nexthopserver
     */
    public java.lang.String[] getNexthopserver() {
        return nexthopserver;
    }


    /**
     * Sets the nexthopserver value for this Vpnvserver.
     * 
     * @param nexthopserver
     */
    public void setNexthopserver(java.lang.String[] nexthopserver) {
        this.nexthopserver = nexthopserver;
    }


    /**
     * Gets the urlname value for this Vpnvserver.
     * 
     * @return urlname
     */
    public java.lang.String[] getUrlname() {
        return urlname;
    }


    /**
     * Sets the urlname value for this Vpnvserver.
     * 
     * @param urlname
     */
    public void setUrlname(java.lang.String[] urlname) {
        this.urlname = urlname;
    }


    /**
     * Gets the intranetip value for this Vpnvserver.
     * 
     * @return intranetip
     */
    public java.lang.String[] getIntranetip() {
        return intranetip;
    }


    /**
     * Sets the intranetip value for this Vpnvserver.
     * 
     * @param intranetip
     */
    public void setIntranetip(java.lang.String[] intranetip) {
        this.intranetip = intranetip;
    }


    /**
     * Gets the netmask value for this Vpnvserver.
     * 
     * @return netmask
     */
    public java.lang.String[] getNetmask() {
        return netmask;
    }


    /**
     * Sets the netmask value for this Vpnvserver.
     * 
     * @param netmask
     */
    public void setNetmask(java.lang.String[] netmask) {
        this.netmask = netmask;
    }


    /**
     * Gets the staserver value for this Vpnvserver.
     * 
     * @return staserver
     */
    public java.lang.String[] getStaserver() {
        return staserver;
    }


    /**
     * Sets the staserver value for this Vpnvserver.
     * 
     * @param staserver
     */
    public void setStaserver(java.lang.String[] staserver) {
        this.staserver = staserver;
    }


    /**
     * Gets the staauthid value for this Vpnvserver.
     * 
     * @return staauthid
     */
    public java.lang.String[] getStaauthid() {
        return staauthid;
    }


    /**
     * Sets the staauthid value for this Vpnvserver.
     * 
     * @param staauthid
     */
    public void setStaauthid(java.lang.String[] staauthid) {
        this.staauthid = staauthid;
    }


    /**
     * Gets the appcontroller value for this Vpnvserver.
     * 
     * @return appcontroller
     */
    public java.lang.String[] getAppcontroller() {
        return appcontroller;
    }


    /**
     * Sets the appcontroller value for this Vpnvserver.
     * 
     * @param appcontroller
     */
    public void setAppcontroller(java.lang.String[] appcontroller) {
        this.appcontroller = appcontroller;
    }


    /**
     * Gets the sharefile value for this Vpnvserver.
     * 
     * @return sharefile
     */
    public java.lang.String[] getSharefile() {
        return sharefile;
    }


    /**
     * Sets the sharefile value for this Vpnvserver.
     * 
     * @param sharefile
     */
    public void setSharefile(java.lang.String[] sharefile) {
        this.sharefile = sharefile;
    }


    /**
     * Gets the usemip value for this Vpnvserver.
     * 
     * @return usemip
     */
    public java.lang.String getUsemip() {
        return usemip;
    }


    /**
     * Sets the usemip value for this Vpnvserver.
     * 
     * @param usemip
     */
    public void setUsemip(java.lang.String usemip) {
        this.usemip = usemip;
    }


    /**
     * Gets the map value for this Vpnvserver.
     * 
     * @return map
     */
    public java.lang.String getMap() {
        return map;
    }


    /**
     * Sets the map value for this Vpnvserver.
     * 
     * @param map
     */
    public void setMap(java.lang.String map) {
        this.map = map;
    }


    /**
     * Gets the downstateflush value for this Vpnvserver.
     * 
     * @return downstateflush
     */
    public java.lang.String getDownstateflush() {
        return downstateflush;
    }


    /**
     * Sets the downstateflush value for this Vpnvserver.
     * 
     * @param downstateflush
     */
    public void setDownstateflush(java.lang.String downstateflush) {
        this.downstateflush = downstateflush;
    }


    /**
     * Gets the type2 value for this Vpnvserver.
     * 
     * @return type2
     */
    public java.lang.String getType2() {
        return type2;
    }


    /**
     * Sets the type2 value for this Vpnvserver.
     * 
     * @param type2
     */
    public void setType2(java.lang.String type2) {
        this.type2 = type2;
    }


    /**
     * Gets the gotopriorityexpression value for this Vpnvserver.
     * 
     * @return gotopriorityexpression
     */
    public java.lang.String getGotopriorityexpression() {
        return gotopriorityexpression;
    }


    /**
     * Sets the gotopriorityexpression value for this Vpnvserver.
     * 
     * @param gotopriorityexpression
     */
    public void setGotopriorityexpression(java.lang.String gotopriorityexpression) {
        this.gotopriorityexpression = gotopriorityexpression;
    }


    /**
     * Gets the disableprimaryondown value for this Vpnvserver.
     * 
     * @return disableprimaryondown
     */
    public java.lang.String getDisableprimaryondown() {
        return disableprimaryondown;
    }


    /**
     * Sets the disableprimaryondown value for this Vpnvserver.
     * 
     * @param disableprimaryondown
     */
    public void setDisableprimaryondown(java.lang.String disableprimaryondown) {
        this.disableprimaryondown = disableprimaryondown;
    }


    /**
     * Gets the listenpolicy value for this Vpnvserver.
     * 
     * @return listenpolicy
     */
    public java.lang.String getListenpolicy() {
        return listenpolicy;
    }


    /**
     * Sets the listenpolicy value for this Vpnvserver.
     * 
     * @param listenpolicy
     */
    public void setListenpolicy(java.lang.String listenpolicy) {
        this.listenpolicy = listenpolicy;
    }


    /**
     * Gets the listenpriority value for this Vpnvserver.
     * 
     * @return listenpriority
     */
    public org.apache.axis.types.UnsignedInt getListenpriority() {
        return listenpriority;
    }


    /**
     * Sets the listenpriority value for this Vpnvserver.
     * 
     * @param listenpriority
     */
    public void setListenpriority(org.apache.axis.types.UnsignedInt listenpriority) {
        this.listenpriority = listenpriority;
    }


    /**
     * Gets the tcpprofilename value for this Vpnvserver.
     * 
     * @return tcpprofilename
     */
    public java.lang.String getTcpprofilename() {
        return tcpprofilename;
    }


    /**
     * Sets the tcpprofilename value for this Vpnvserver.
     * 
     * @param tcpprofilename
     */
    public void setTcpprofilename(java.lang.String tcpprofilename) {
        this.tcpprofilename = tcpprofilename;
    }


    /**
     * Gets the httpprofilename value for this Vpnvserver.
     * 
     * @return httpprofilename
     */
    public java.lang.String getHttpprofilename() {
        return httpprofilename;
    }


    /**
     * Sets the httpprofilename value for this Vpnvserver.
     * 
     * @param httpprofilename
     */
    public void setHttpprofilename(java.lang.String httpprofilename) {
        this.httpprofilename = httpprofilename;
    }


    /**
     * Gets the comment value for this Vpnvserver.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Vpnvserver.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the appflowlog value for this Vpnvserver.
     * 
     * @return appflowlog
     */
    public java.lang.String getAppflowlog() {
        return appflowlog;
    }


    /**
     * Sets the appflowlog value for this Vpnvserver.
     * 
     * @param appflowlog
     */
    public void setAppflowlog(java.lang.String appflowlog) {
        this.appflowlog = appflowlog;
    }


    /**
     * Gets the icmpvsrresponse value for this Vpnvserver.
     * 
     * @return icmpvsrresponse
     */
    public java.lang.String getIcmpvsrresponse() {
        return icmpvsrresponse;
    }


    /**
     * Sets the icmpvsrresponse value for this Vpnvserver.
     * 
     * @param icmpvsrresponse
     */
    public void setIcmpvsrresponse(java.lang.String icmpvsrresponse) {
        this.icmpvsrresponse = icmpvsrresponse;
    }


    /**
     * Gets the netprofile value for this Vpnvserver.
     * 
     * @return netprofile
     */
    public java.lang.String getNetprofile() {
        return netprofile;
    }


    /**
     * Sets the netprofile value for this Vpnvserver.
     * 
     * @param netprofile
     */
    public void setNetprofile(java.lang.String netprofile) {
        this.netprofile = netprofile;
    }


    /**
     * Gets the maxloginattempts value for this Vpnvserver.
     * 
     * @return maxloginattempts
     */
    public org.apache.axis.types.UnsignedInt getMaxloginattempts() {
        return maxloginattempts;
    }


    /**
     * Sets the maxloginattempts value for this Vpnvserver.
     * 
     * @param maxloginattempts
     */
    public void setMaxloginattempts(org.apache.axis.types.UnsignedInt maxloginattempts) {
        this.maxloginattempts = maxloginattempts;
    }


    /**
     * Gets the failedlogintimeout value for this Vpnvserver.
     * 
     * @return failedlogintimeout
     */
    public org.apache.axis.types.UnsignedInt getFailedlogintimeout() {
        return failedlogintimeout;
    }


    /**
     * Sets the failedlogintimeout value for this Vpnvserver.
     * 
     * @param failedlogintimeout
     */
    public void setFailedlogintimeout(org.apache.axis.types.UnsignedInt failedlogintimeout) {
        this.failedlogintimeout = failedlogintimeout;
    }


    /**
     * Gets the secondary value for this Vpnvserver.
     * 
     * @return secondary
     */
    public boolean isSecondary() {
        return secondary;
    }


    /**
     * Sets the secondary value for this Vpnvserver.
     * 
     * @param secondary
     */
    public void setSecondary(boolean secondary) {
        this.secondary = secondary;
    }


    /**
     * Gets the groupextraction value for this Vpnvserver.
     * 
     * @return groupextraction
     */
    public boolean isGroupextraction() {
        return groupextraction;
    }


    /**
     * Sets the groupextraction value for this Vpnvserver.
     * 
     * @param groupextraction
     */
    public void setGroupextraction(boolean groupextraction) {
        this.groupextraction = groupextraction;
    }


    /**
     * Gets the intranetipmap value for this Vpnvserver.
     * 
     * @return intranetipmap
     */
    public java.lang.String[] getIntranetipmap() {
        return intranetipmap;
    }


    /**
     * Sets the intranetipmap value for this Vpnvserver.
     * 
     * @param intranetipmap
     */
    public void setIntranetipmap(java.lang.String[] intranetipmap) {
        this.intranetipmap = intranetipmap;
    }


    /**
     * Gets the syslogpolicyname value for this Vpnvserver.
     * 
     * @return syslogpolicyname
     */
    public java.lang.String[] getSyslogpolicyname() {
        return syslogpolicyname;
    }


    /**
     * Sets the syslogpolicyname value for this Vpnvserver.
     * 
     * @param syslogpolicyname
     */
    public void setSyslogpolicyname(java.lang.String[] syslogpolicyname) {
        this.syslogpolicyname = syslogpolicyname;
    }


    /**
     * Gets the syslogpriority value for this Vpnvserver.
     * 
     * @return syslogpriority
     */
    public org.apache.axis.types.UnsignedInt[] getSyslogpriority() {
        return syslogpriority;
    }


    /**
     * Sets the syslogpriority value for this Vpnvserver.
     * 
     * @param syslogpriority
     */
    public void setSyslogpriority(org.apache.axis.types.UnsignedInt[] syslogpriority) {
        this.syslogpriority = syslogpriority;
    }


    /**
     * Gets the nslogpolicyname value for this Vpnvserver.
     * 
     * @return nslogpolicyname
     */
    public java.lang.String[] getNslogpolicyname() {
        return nslogpolicyname;
    }


    /**
     * Sets the nslogpolicyname value for this Vpnvserver.
     * 
     * @param nslogpolicyname
     */
    public void setNslogpolicyname(java.lang.String[] nslogpolicyname) {
        this.nslogpolicyname = nslogpolicyname;
    }


    /**
     * Gets the nslogpriority value for this Vpnvserver.
     * 
     * @return nslogpriority
     */
    public org.apache.axis.types.UnsignedInt[] getNslogpriority() {
        return nslogpriority;
    }


    /**
     * Sets the nslogpriority value for this Vpnvserver.
     * 
     * @param nslogpriority
     */
    public void setNslogpriority(org.apache.axis.types.UnsignedInt[] nslogpriority) {
        this.nslogpriority = nslogpriority;
    }


    /**
     * Gets the sessionpolicyname value for this Vpnvserver.
     * 
     * @return sessionpolicyname
     */
    public java.lang.String[] getSessionpolicyname() {
        return sessionpolicyname;
    }


    /**
     * Sets the sessionpolicyname value for this Vpnvserver.
     * 
     * @param sessionpolicyname
     */
    public void setSessionpolicyname(java.lang.String[] sessionpolicyname) {
        this.sessionpolicyname = sessionpolicyname;
    }


    /**
     * Gets the sessionpolicypriority value for this Vpnvserver.
     * 
     * @return sessionpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getSessionpolicypriority() {
        return sessionpolicypriority;
    }


    /**
     * Sets the sessionpolicypriority value for this Vpnvserver.
     * 
     * @param sessionpolicypriority
     */
    public void setSessionpolicypriority(org.apache.axis.types.UnsignedInt[] sessionpolicypriority) {
        this.sessionpolicypriority = sessionpolicypriority;
    }


    /**
     * Gets the radiusauthpolicyname value for this Vpnvserver.
     * 
     * @return radiusauthpolicyname
     */
    public java.lang.String[] getRadiusauthpolicyname() {
        return radiusauthpolicyname;
    }


    /**
     * Sets the radiusauthpolicyname value for this Vpnvserver.
     * 
     * @param radiusauthpolicyname
     */
    public void setRadiusauthpolicyname(java.lang.String[] radiusauthpolicyname) {
        this.radiusauthpolicyname = radiusauthpolicyname;
    }


    /**
     * Gets the radiusauthpolicypriority value for this Vpnvserver.
     * 
     * @return radiusauthpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getRadiusauthpolicypriority() {
        return radiusauthpolicypriority;
    }


    /**
     * Sets the radiusauthpolicypriority value for this Vpnvserver.
     * 
     * @param radiusauthpolicypriority
     */
    public void setRadiusauthpolicypriority(org.apache.axis.types.UnsignedInt[] radiusauthpolicypriority) {
        this.radiusauthpolicypriority = radiusauthpolicypriority;
    }


    /**
     * Gets the radiusauthpolicysecondary value for this Vpnvserver.
     * 
     * @return radiusauthpolicysecondary
     */
    public boolean[] getRadiusauthpolicysecondary() {
        return radiusauthpolicysecondary;
    }


    /**
     * Sets the radiusauthpolicysecondary value for this Vpnvserver.
     * 
     * @param radiusauthpolicysecondary
     */
    public void setRadiusauthpolicysecondary(boolean[] radiusauthpolicysecondary) {
        this.radiusauthpolicysecondary = radiusauthpolicysecondary;
    }


    /**
     * Gets the ldapauthpolicyname value for this Vpnvserver.
     * 
     * @return ldapauthpolicyname
     */
    public java.lang.String[] getLdapauthpolicyname() {
        return ldapauthpolicyname;
    }


    /**
     * Sets the ldapauthpolicyname value for this Vpnvserver.
     * 
     * @param ldapauthpolicyname
     */
    public void setLdapauthpolicyname(java.lang.String[] ldapauthpolicyname) {
        this.ldapauthpolicyname = ldapauthpolicyname;
    }


    /**
     * Gets the ldapauthpolicypriority value for this Vpnvserver.
     * 
     * @return ldapauthpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getLdapauthpolicypriority() {
        return ldapauthpolicypriority;
    }


    /**
     * Sets the ldapauthpolicypriority value for this Vpnvserver.
     * 
     * @param ldapauthpolicypriority
     */
    public void setLdapauthpolicypriority(org.apache.axis.types.UnsignedInt[] ldapauthpolicypriority) {
        this.ldapauthpolicypriority = ldapauthpolicypriority;
    }


    /**
     * Gets the ldapauthpolicysecondary value for this Vpnvserver.
     * 
     * @return ldapauthpolicysecondary
     */
    public boolean[] getLdapauthpolicysecondary() {
        return ldapauthpolicysecondary;
    }


    /**
     * Sets the ldapauthpolicysecondary value for this Vpnvserver.
     * 
     * @param ldapauthpolicysecondary
     */
    public void setLdapauthpolicysecondary(boolean[] ldapauthpolicysecondary) {
        this.ldapauthpolicysecondary = ldapauthpolicysecondary;
    }


    /**
     * Gets the ldapauthpolicygroupextraction value for this Vpnvserver.
     * 
     * @return ldapauthpolicygroupextraction
     */
    public boolean[] getLdapauthpolicygroupextraction() {
        return ldapauthpolicygroupextraction;
    }


    /**
     * Sets the ldapauthpolicygroupextraction value for this Vpnvserver.
     * 
     * @param ldapauthpolicygroupextraction
     */
    public void setLdapauthpolicygroupextraction(boolean[] ldapauthpolicygroupextraction) {
        this.ldapauthpolicygroupextraction = ldapauthpolicygroupextraction;
    }


    /**
     * Gets the certauthpolicyname value for this Vpnvserver.
     * 
     * @return certauthpolicyname
     */
    public java.lang.String[] getCertauthpolicyname() {
        return certauthpolicyname;
    }


    /**
     * Sets the certauthpolicyname value for this Vpnvserver.
     * 
     * @param certauthpolicyname
     */
    public void setCertauthpolicyname(java.lang.String[] certauthpolicyname) {
        this.certauthpolicyname = certauthpolicyname;
    }


    /**
     * Gets the certauthpolicypriority value for this Vpnvserver.
     * 
     * @return certauthpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getCertauthpolicypriority() {
        return certauthpolicypriority;
    }


    /**
     * Sets the certauthpolicypriority value for this Vpnvserver.
     * 
     * @param certauthpolicypriority
     */
    public void setCertauthpolicypriority(org.apache.axis.types.UnsignedInt[] certauthpolicypriority) {
        this.certauthpolicypriority = certauthpolicypriority;
    }


    /**
     * Gets the certauthpolicysecondary value for this Vpnvserver.
     * 
     * @return certauthpolicysecondary
     */
    public boolean[] getCertauthpolicysecondary() {
        return certauthpolicysecondary;
    }


    /**
     * Sets the certauthpolicysecondary value for this Vpnvserver.
     * 
     * @param certauthpolicysecondary
     */
    public void setCertauthpolicysecondary(boolean[] certauthpolicysecondary) {
        this.certauthpolicysecondary = certauthpolicysecondary;
    }


    /**
     * Gets the tacacsauthpolicyname value for this Vpnvserver.
     * 
     * @return tacacsauthpolicyname
     */
    public java.lang.String[] getTacacsauthpolicyname() {
        return tacacsauthpolicyname;
    }


    /**
     * Sets the tacacsauthpolicyname value for this Vpnvserver.
     * 
     * @param tacacsauthpolicyname
     */
    public void setTacacsauthpolicyname(java.lang.String[] tacacsauthpolicyname) {
        this.tacacsauthpolicyname = tacacsauthpolicyname;
    }


    /**
     * Gets the tacacsauthpolicypriority value for this Vpnvserver.
     * 
     * @return tacacsauthpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getTacacsauthpolicypriority() {
        return tacacsauthpolicypriority;
    }


    /**
     * Sets the tacacsauthpolicypriority value for this Vpnvserver.
     * 
     * @param tacacsauthpolicypriority
     */
    public void setTacacsauthpolicypriority(org.apache.axis.types.UnsignedInt[] tacacsauthpolicypriority) {
        this.tacacsauthpolicypriority = tacacsauthpolicypriority;
    }


    /**
     * Gets the tacacsauthpolicysecondary value for this Vpnvserver.
     * 
     * @return tacacsauthpolicysecondary
     */
    public boolean[] getTacacsauthpolicysecondary() {
        return tacacsauthpolicysecondary;
    }


    /**
     * Sets the tacacsauthpolicysecondary value for this Vpnvserver.
     * 
     * @param tacacsauthpolicysecondary
     */
    public void setTacacsauthpolicysecondary(boolean[] tacacsauthpolicysecondary) {
        this.tacacsauthpolicysecondary = tacacsauthpolicysecondary;
    }


    /**
     * Gets the localauthpolicyname value for this Vpnvserver.
     * 
     * @return localauthpolicyname
     */
    public java.lang.String[] getLocalauthpolicyname() {
        return localauthpolicyname;
    }


    /**
     * Sets the localauthpolicyname value for this Vpnvserver.
     * 
     * @param localauthpolicyname
     */
    public void setLocalauthpolicyname(java.lang.String[] localauthpolicyname) {
        this.localauthpolicyname = localauthpolicyname;
    }


    /**
     * Gets the localauthpolicypriority value for this Vpnvserver.
     * 
     * @return localauthpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getLocalauthpolicypriority() {
        return localauthpolicypriority;
    }


    /**
     * Sets the localauthpolicypriority value for this Vpnvserver.
     * 
     * @param localauthpolicypriority
     */
    public void setLocalauthpolicypriority(org.apache.axis.types.UnsignedInt[] localauthpolicypriority) {
        this.localauthpolicypriority = localauthpolicypriority;
    }


    /**
     * Gets the localauthpolicysecondary value for this Vpnvserver.
     * 
     * @return localauthpolicysecondary
     */
    public boolean[] getLocalauthpolicysecondary() {
        return localauthpolicysecondary;
    }


    /**
     * Sets the localauthpolicysecondary value for this Vpnvserver.
     * 
     * @param localauthpolicysecondary
     */
    public void setLocalauthpolicysecondary(boolean[] localauthpolicysecondary) {
        this.localauthpolicysecondary = localauthpolicysecondary;
    }


    /**
     * Gets the negauthpolicyname value for this Vpnvserver.
     * 
     * @return negauthpolicyname
     */
    public java.lang.String[] getNegauthpolicyname() {
        return negauthpolicyname;
    }


    /**
     * Sets the negauthpolicyname value for this Vpnvserver.
     * 
     * @param negauthpolicyname
     */
    public void setNegauthpolicyname(java.lang.String[] negauthpolicyname) {
        this.negauthpolicyname = negauthpolicyname;
    }


    /**
     * Gets the negauthpolicypriority value for this Vpnvserver.
     * 
     * @return negauthpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getNegauthpolicypriority() {
        return negauthpolicypriority;
    }


    /**
     * Sets the negauthpolicypriority value for this Vpnvserver.
     * 
     * @param negauthpolicypriority
     */
    public void setNegauthpolicypriority(org.apache.axis.types.UnsignedInt[] negauthpolicypriority) {
        this.negauthpolicypriority = negauthpolicypriority;
    }


    /**
     * Gets the negauthpolicysecondary value for this Vpnvserver.
     * 
     * @return negauthpolicysecondary
     */
    public boolean[] getNegauthpolicysecondary() {
        return negauthpolicysecondary;
    }


    /**
     * Sets the negauthpolicysecondary value for this Vpnvserver.
     * 
     * @param negauthpolicysecondary
     */
    public void setNegauthpolicysecondary(boolean[] negauthpolicysecondary) {
        this.negauthpolicysecondary = negauthpolicysecondary;
    }


    /**
     * Gets the samlauthpolicyname value for this Vpnvserver.
     * 
     * @return samlauthpolicyname
     */
    public java.lang.String[] getSamlauthpolicyname() {
        return samlauthpolicyname;
    }


    /**
     * Sets the samlauthpolicyname value for this Vpnvserver.
     * 
     * @param samlauthpolicyname
     */
    public void setSamlauthpolicyname(java.lang.String[] samlauthpolicyname) {
        this.samlauthpolicyname = samlauthpolicyname;
    }


    /**
     * Gets the samlauthpolicypriority value for this Vpnvserver.
     * 
     * @return samlauthpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getSamlauthpolicypriority() {
        return samlauthpolicypriority;
    }


    /**
     * Sets the samlauthpolicypriority value for this Vpnvserver.
     * 
     * @param samlauthpolicypriority
     */
    public void setSamlauthpolicypriority(org.apache.axis.types.UnsignedInt[] samlauthpolicypriority) {
        this.samlauthpolicypriority = samlauthpolicypriority;
    }


    /**
     * Gets the samlauthpolicysecondary value for this Vpnvserver.
     * 
     * @return samlauthpolicysecondary
     */
    public boolean[] getSamlauthpolicysecondary() {
        return samlauthpolicysecondary;
    }


    /**
     * Sets the samlauthpolicysecondary value for this Vpnvserver.
     * 
     * @param samlauthpolicysecondary
     */
    public void setSamlauthpolicysecondary(boolean[] samlauthpolicysecondary) {
        this.samlauthpolicysecondary = samlauthpolicysecondary;
    }


    /**
     * Gets the trafficpolicyname value for this Vpnvserver.
     * 
     * @return trafficpolicyname
     */
    public java.lang.String[] getTrafficpolicyname() {
        return trafficpolicyname;
    }


    /**
     * Sets the trafficpolicyname value for this Vpnvserver.
     * 
     * @param trafficpolicyname
     */
    public void setTrafficpolicyname(java.lang.String[] trafficpolicyname) {
        this.trafficpolicyname = trafficpolicyname;
    }


    /**
     * Gets the trafficpolicypriority value for this Vpnvserver.
     * 
     * @return trafficpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getTrafficpolicypriority() {
        return trafficpolicypriority;
    }


    /**
     * Sets the trafficpolicypriority value for this Vpnvserver.
     * 
     * @param trafficpolicypriority
     */
    public void setTrafficpolicypriority(org.apache.axis.types.UnsignedInt[] trafficpolicypriority) {
        this.trafficpolicypriority = trafficpolicypriority;
    }


    /**
     * Gets the preauthenticationpolicyname value for this Vpnvserver.
     * 
     * @return preauthenticationpolicyname
     */
    public java.lang.String[] getPreauthenticationpolicyname() {
        return preauthenticationpolicyname;
    }


    /**
     * Sets the preauthenticationpolicyname value for this Vpnvserver.
     * 
     * @param preauthenticationpolicyname
     */
    public void setPreauthenticationpolicyname(java.lang.String[] preauthenticationpolicyname) {
        this.preauthenticationpolicyname = preauthenticationpolicyname;
    }


    /**
     * Gets the preauthenticationpolicypriority value for this Vpnvserver.
     * 
     * @return preauthenticationpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getPreauthenticationpolicypriority() {
        return preauthenticationpolicypriority;
    }


    /**
     * Sets the preauthenticationpolicypriority value for this Vpnvserver.
     * 
     * @param preauthenticationpolicypriority
     */
    public void setPreauthenticationpolicypriority(org.apache.axis.types.UnsignedInt[] preauthenticationpolicypriority) {
        this.preauthenticationpolicypriority = preauthenticationpolicypriority;
    }


    /**
     * Gets the cvpnpolicyname value for this Vpnvserver.
     * 
     * @return cvpnpolicyname
     */
    public java.lang.String[] getCvpnpolicyname() {
        return cvpnpolicyname;
    }


    /**
     * Sets the cvpnpolicyname value for this Vpnvserver.
     * 
     * @param cvpnpolicyname
     */
    public void setCvpnpolicyname(java.lang.String[] cvpnpolicyname) {
        this.cvpnpolicyname = cvpnpolicyname;
    }


    /**
     * Gets the cvpnpriority value for this Vpnvserver.
     * 
     * @return cvpnpriority
     */
    public org.apache.axis.types.UnsignedInt[] getCvpnpriority() {
        return cvpnpriority;
    }


    /**
     * Sets the cvpnpriority value for this Vpnvserver.
     * 
     * @param cvpnpriority
     */
    public void setCvpnpriority(org.apache.axis.types.UnsignedInt[] cvpnpriority) {
        this.cvpnpriority = cvpnpriority;
    }


    /**
     * Gets the cvpnbindpoint value for this Vpnvserver.
     * 
     * @return cvpnbindpoint
     */
    public java.lang.String[] getCvpnbindpoint() {
        return cvpnbindpoint;
    }


    /**
     * Sets the cvpnbindpoint value for this Vpnvserver.
     * 
     * @param cvpnbindpoint
     */
    public void setCvpnbindpoint(java.lang.String[] cvpnbindpoint) {
        this.cvpnbindpoint = cvpnbindpoint;
    }


    /**
     * Gets the cvpngotopriorityexpression value for this Vpnvserver.
     * 
     * @return cvpngotopriorityexpression
     */
    public java.lang.String[] getCvpngotopriorityexpression() {
        return cvpngotopriorityexpression;
    }


    /**
     * Sets the cvpngotopriorityexpression value for this Vpnvserver.
     * 
     * @param cvpngotopriorityexpression
     */
    public void setCvpngotopriorityexpression(java.lang.String[] cvpngotopriorityexpression) {
        this.cvpngotopriorityexpression = cvpngotopriorityexpression;
    }


    /**
     * Gets the rwpolicyname value for this Vpnvserver.
     * 
     * @return rwpolicyname
     */
    public java.lang.String[] getRwpolicyname() {
        return rwpolicyname;
    }


    /**
     * Sets the rwpolicyname value for this Vpnvserver.
     * 
     * @param rwpolicyname
     */
    public void setRwpolicyname(java.lang.String[] rwpolicyname) {
        this.rwpolicyname = rwpolicyname;
    }


    /**
     * Gets the rwpolicypriority value for this Vpnvserver.
     * 
     * @return rwpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getRwpolicypriority() {
        return rwpolicypriority;
    }


    /**
     * Sets the rwpolicypriority value for this Vpnvserver.
     * 
     * @param rwpolicypriority
     */
    public void setRwpolicypriority(org.apache.axis.types.UnsignedInt[] rwpolicypriority) {
        this.rwpolicypriority = rwpolicypriority;
    }


    /**
     * Gets the rwpolicygotoprioexpression value for this Vpnvserver.
     * 
     * @return rwpolicygotoprioexpression
     */
    public java.lang.String[] getRwpolicygotoprioexpression() {
        return rwpolicygotoprioexpression;
    }


    /**
     * Sets the rwpolicygotoprioexpression value for this Vpnvserver.
     * 
     * @param rwpolicygotoprioexpression
     */
    public void setRwpolicygotoprioexpression(java.lang.String[] rwpolicygotoprioexpression) {
        this.rwpolicygotoprioexpression = rwpolicygotoprioexpression;
    }


    /**
     * Gets the rwpolicybindpoint value for this Vpnvserver.
     * 
     * @return rwpolicybindpoint
     */
    public java.lang.String[] getRwpolicybindpoint() {
        return rwpolicybindpoint;
    }


    /**
     * Sets the rwpolicybindpoint value for this Vpnvserver.
     * 
     * @param rwpolicybindpoint
     */
    public void setRwpolicybindpoint(java.lang.String[] rwpolicybindpoint) {
        this.rwpolicybindpoint = rwpolicybindpoint;
    }


    /**
     * Gets the rsppolicyname value for this Vpnvserver.
     * 
     * @return rsppolicyname
     */
    public java.lang.String[] getRsppolicyname() {
        return rsppolicyname;
    }


    /**
     * Sets the rsppolicyname value for this Vpnvserver.
     * 
     * @param rsppolicyname
     */
    public void setRsppolicyname(java.lang.String[] rsppolicyname) {
        this.rsppolicyname = rsppolicyname;
    }


    /**
     * Gets the rsppolicypriority value for this Vpnvserver.
     * 
     * @return rsppolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getRsppolicypriority() {
        return rsppolicypriority;
    }


    /**
     * Sets the rsppolicypriority value for this Vpnvserver.
     * 
     * @param rsppolicypriority
     */
    public void setRsppolicypriority(org.apache.axis.types.UnsignedInt[] rsppolicypriority) {
        this.rsppolicypriority = rsppolicypriority;
    }


    /**
     * Gets the rsppolicygotoprioexpression value for this Vpnvserver.
     * 
     * @return rsppolicygotoprioexpression
     */
    public java.lang.String[] getRsppolicygotoprioexpression() {
        return rsppolicygotoprioexpression;
    }


    /**
     * Sets the rsppolicygotoprioexpression value for this Vpnvserver.
     * 
     * @param rsppolicygotoprioexpression
     */
    public void setRsppolicygotoprioexpression(java.lang.String[] rsppolicygotoprioexpression) {
        this.rsppolicygotoprioexpression = rsppolicygotoprioexpression;
    }


    /**
     * Gets the cachepolicyname value for this Vpnvserver.
     * 
     * @return cachepolicyname
     */
    public java.lang.String[] getCachepolicyname() {
        return cachepolicyname;
    }


    /**
     * Sets the cachepolicyname value for this Vpnvserver.
     * 
     * @param cachepolicyname
     */
    public void setCachepolicyname(java.lang.String[] cachepolicyname) {
        this.cachepolicyname = cachepolicyname;
    }


    /**
     * Gets the cachepolicypriority value for this Vpnvserver.
     * 
     * @return cachepolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getCachepolicypriority() {
        return cachepolicypriority;
    }


    /**
     * Sets the cachepolicypriority value for this Vpnvserver.
     * 
     * @param cachepolicypriority
     */
    public void setCachepolicypriority(org.apache.axis.types.UnsignedInt[] cachepolicypriority) {
        this.cachepolicypriority = cachepolicypriority;
    }


    /**
     * Gets the cachepolicygotoprioexpression value for this Vpnvserver.
     * 
     * @return cachepolicygotoprioexpression
     */
    public java.lang.String[] getCachepolicygotoprioexpression() {
        return cachepolicygotoprioexpression;
    }


    /**
     * Sets the cachepolicygotoprioexpression value for this Vpnvserver.
     * 
     * @param cachepolicygotoprioexpression
     */
    public void setCachepolicygotoprioexpression(java.lang.String[] cachepolicygotoprioexpression) {
        this.cachepolicygotoprioexpression = cachepolicygotoprioexpression;
    }


    /**
     * Gets the appflowpolicyname value for this Vpnvserver.
     * 
     * @return appflowpolicyname
     */
    public java.lang.String[] getAppflowpolicyname() {
        return appflowpolicyname;
    }


    /**
     * Sets the appflowpolicyname value for this Vpnvserver.
     * 
     * @param appflowpolicyname
     */
    public void setAppflowpolicyname(java.lang.String[] appflowpolicyname) {
        this.appflowpolicyname = appflowpolicyname;
    }


    /**
     * Gets the appflowpolicypriority value for this Vpnvserver.
     * 
     * @return appflowpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getAppflowpolicypriority() {
        return appflowpolicypriority;
    }


    /**
     * Sets the appflowpolicypriority value for this Vpnvserver.
     * 
     * @param appflowpolicypriority
     */
    public void setAppflowpolicypriority(org.apache.axis.types.UnsignedInt[] appflowpolicypriority) {
        this.appflowpolicypriority = appflowpolicypriority;
    }


    /**
     * Gets the appflowpolicygotoprioexpression value for this Vpnvserver.
     * 
     * @return appflowpolicygotoprioexpression
     */
    public java.lang.String[] getAppflowpolicygotoprioexpression() {
        return appflowpolicygotoprioexpression;
    }


    /**
     * Sets the appflowpolicygotoprioexpression value for this Vpnvserver.
     * 
     * @param appflowpolicygotoprioexpression
     */
    public void setAppflowpolicygotoprioexpression(java.lang.String[] appflowpolicygotoprioexpression) {
        this.appflowpolicygotoprioexpression = appflowpolicygotoprioexpression;
    }


    /**
     * Gets the appflowpolicybindpoint value for this Vpnvserver.
     * 
     * @return appflowpolicybindpoint
     */
    public java.lang.String[] getAppflowpolicybindpoint() {
        return appflowpolicybindpoint;
    }


    /**
     * Sets the appflowpolicybindpoint value for this Vpnvserver.
     * 
     * @param appflowpolicybindpoint
     */
    public void setAppflowpolicybindpoint(java.lang.String[] appflowpolicybindpoint) {
        this.appflowpolicybindpoint = appflowpolicybindpoint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Vpnvserver)) return false;
        Vpnvserver other = (Vpnvserver) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              this.ipaddress.equals(other.getIpaddress()))) &&
            ((this.ipaddress2==null && other.getIpaddress2()==null) || 
             (this.ipaddress2!=null &&
              this.ipaddress2.equals(other.getIpaddress2()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.range==null && other.getRange()==null) || 
             (this.range!=null &&
              this.range.equals(other.getRange()))) &&
            ((this.servicetype==null && other.getServicetype()==null) || 
             (this.servicetype!=null &&
              this.servicetype.equals(other.getServicetype()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            this.status == other.getStatus() &&
            ((this.cachetype==null && other.getCachetype()==null) || 
             (this.cachetype!=null &&
              this.cachetype.equals(other.getCachetype()))) &&
            ((this.redirect==null && other.getRedirect()==null) || 
             (this.redirect!=null &&
              this.redirect.equals(other.getRedirect()))) &&
            ((this.precedence==null && other.getPrecedence()==null) || 
             (this.precedence!=null &&
              this.precedence.equals(other.getPrecedence()))) &&
            ((this.redirecturl==null && other.getRedirecturl()==null) || 
             (this.redirecturl!=null &&
              this.redirecturl.equals(other.getRedirecturl()))) &&
            ((this.authentication==null && other.getAuthentication()==null) || 
             (this.authentication!=null &&
              this.authentication.equals(other.getAuthentication()))) &&
            ((this.doublehop==null && other.getDoublehop()==null) || 
             (this.doublehop!=null &&
              this.doublehop.equals(other.getDoublehop()))) &&
            ((this.icaonly==null && other.getIcaonly()==null) || 
             (this.icaonly!=null &&
              this.icaonly.equals(other.getIcaonly()))) &&
            ((this.maxaaausers==null && other.getMaxaaausers()==null) || 
             (this.maxaaausers!=null &&
              this.maxaaausers.equals(other.getMaxaaausers()))) &&
            ((this.curaaausers==null && other.getCuraaausers()==null) || 
             (this.curaaausers!=null &&
              this.curaaausers.equals(other.getCuraaausers()))) &&
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain()))) &&
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              this.rule.equals(other.getRule()))) &&
            ((this.policyname==null && other.getPolicyname()==null) || 
             (this.policyname!=null &&
              this.policyname.equals(other.getPolicyname()))) &&
            ((this.policy==null && other.getPolicy()==null) || 
             (this.policy!=null &&
              this.policy.equals(other.getPolicy()))) &&
            ((this.servicename==null && other.getServicename()==null) || 
             (this.servicename!=null &&
              this.servicename.equals(other.getServicename()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.cachevserver==null && other.getCachevserver()==null) || 
             (this.cachevserver!=null &&
              this.cachevserver.equals(other.getCachevserver()))) &&
            ((this.backupvserver==null && other.getBackupvserver()==null) || 
             (this.backupvserver!=null &&
              this.backupvserver.equals(other.getBackupvserver()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.clttimeout==null && other.getClttimeout()==null) || 
             (this.clttimeout!=null &&
              this.clttimeout.equals(other.getClttimeout()))) &&
            ((this.somethod==null && other.getSomethod()==null) || 
             (this.somethod!=null &&
              this.somethod.equals(other.getSomethod()))) &&
            ((this.sothreshold==null && other.getSothreshold()==null) || 
             (this.sothreshold!=null &&
              this.sothreshold.equals(other.getSothreshold()))) &&
            ((this.sopersistence==null && other.getSopersistence()==null) || 
             (this.sopersistence!=null &&
              this.sopersistence.equals(other.getSopersistence()))) &&
            ((this.sopersistencetimeout==null && other.getSopersistencetimeout()==null) || 
             (this.sopersistencetimeout!=null &&
              this.sopersistencetimeout.equals(other.getSopersistencetimeout()))) &&
            ((this.acttype==null && other.getActtype()==null) || 
             (this.acttype!=null &&
              java.util.Arrays.equals(this.acttype, other.getActtype()))) &&
            ((this.intranetapplication==null && other.getIntranetapplication()==null) || 
             (this.intranetapplication!=null &&
              java.util.Arrays.equals(this.intranetapplication, other.getIntranetapplication()))) &&
            ((this.nexthopserver==null && other.getNexthopserver()==null) || 
             (this.nexthopserver!=null &&
              java.util.Arrays.equals(this.nexthopserver, other.getNexthopserver()))) &&
            ((this.urlname==null && other.getUrlname()==null) || 
             (this.urlname!=null &&
              java.util.Arrays.equals(this.urlname, other.getUrlname()))) &&
            ((this.intranetip==null && other.getIntranetip()==null) || 
             (this.intranetip!=null &&
              java.util.Arrays.equals(this.intranetip, other.getIntranetip()))) &&
            ((this.netmask==null && other.getNetmask()==null) || 
             (this.netmask!=null &&
              java.util.Arrays.equals(this.netmask, other.getNetmask()))) &&
            ((this.staserver==null && other.getStaserver()==null) || 
             (this.staserver!=null &&
              java.util.Arrays.equals(this.staserver, other.getStaserver()))) &&
            ((this.staauthid==null && other.getStaauthid()==null) || 
             (this.staauthid!=null &&
              java.util.Arrays.equals(this.staauthid, other.getStaauthid()))) &&
            ((this.appcontroller==null && other.getAppcontroller()==null) || 
             (this.appcontroller!=null &&
              java.util.Arrays.equals(this.appcontroller, other.getAppcontroller()))) &&
            ((this.sharefile==null && other.getSharefile()==null) || 
             (this.sharefile!=null &&
              java.util.Arrays.equals(this.sharefile, other.getSharefile()))) &&
            ((this.usemip==null && other.getUsemip()==null) || 
             (this.usemip!=null &&
              this.usemip.equals(other.getUsemip()))) &&
            ((this.map==null && other.getMap()==null) || 
             (this.map!=null &&
              this.map.equals(other.getMap()))) &&
            ((this.downstateflush==null && other.getDownstateflush()==null) || 
             (this.downstateflush!=null &&
              this.downstateflush.equals(other.getDownstateflush()))) &&
            ((this.type2==null && other.getType2()==null) || 
             (this.type2!=null &&
              this.type2.equals(other.getType2()))) &&
            ((this.gotopriorityexpression==null && other.getGotopriorityexpression()==null) || 
             (this.gotopriorityexpression!=null &&
              this.gotopriorityexpression.equals(other.getGotopriorityexpression()))) &&
            ((this.disableprimaryondown==null && other.getDisableprimaryondown()==null) || 
             (this.disableprimaryondown!=null &&
              this.disableprimaryondown.equals(other.getDisableprimaryondown()))) &&
            ((this.listenpolicy==null && other.getListenpolicy()==null) || 
             (this.listenpolicy!=null &&
              this.listenpolicy.equals(other.getListenpolicy()))) &&
            ((this.listenpriority==null && other.getListenpriority()==null) || 
             (this.listenpriority!=null &&
              this.listenpriority.equals(other.getListenpriority()))) &&
            ((this.tcpprofilename==null && other.getTcpprofilename()==null) || 
             (this.tcpprofilename!=null &&
              this.tcpprofilename.equals(other.getTcpprofilename()))) &&
            ((this.httpprofilename==null && other.getHttpprofilename()==null) || 
             (this.httpprofilename!=null &&
              this.httpprofilename.equals(other.getHttpprofilename()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.appflowlog==null && other.getAppflowlog()==null) || 
             (this.appflowlog!=null &&
              this.appflowlog.equals(other.getAppflowlog()))) &&
            ((this.icmpvsrresponse==null && other.getIcmpvsrresponse()==null) || 
             (this.icmpvsrresponse!=null &&
              this.icmpvsrresponse.equals(other.getIcmpvsrresponse()))) &&
            ((this.netprofile==null && other.getNetprofile()==null) || 
             (this.netprofile!=null &&
              this.netprofile.equals(other.getNetprofile()))) &&
            ((this.maxloginattempts==null && other.getMaxloginattempts()==null) || 
             (this.maxloginattempts!=null &&
              this.maxloginattempts.equals(other.getMaxloginattempts()))) &&
            ((this.failedlogintimeout==null && other.getFailedlogintimeout()==null) || 
             (this.failedlogintimeout!=null &&
              this.failedlogintimeout.equals(other.getFailedlogintimeout()))) &&
            this.secondary == other.isSecondary() &&
            this.groupextraction == other.isGroupextraction() &&
            ((this.intranetipmap==null && other.getIntranetipmap()==null) || 
             (this.intranetipmap!=null &&
              java.util.Arrays.equals(this.intranetipmap, other.getIntranetipmap()))) &&
            ((this.syslogpolicyname==null && other.getSyslogpolicyname()==null) || 
             (this.syslogpolicyname!=null &&
              java.util.Arrays.equals(this.syslogpolicyname, other.getSyslogpolicyname()))) &&
            ((this.syslogpriority==null && other.getSyslogpriority()==null) || 
             (this.syslogpriority!=null &&
              java.util.Arrays.equals(this.syslogpriority, other.getSyslogpriority()))) &&
            ((this.nslogpolicyname==null && other.getNslogpolicyname()==null) || 
             (this.nslogpolicyname!=null &&
              java.util.Arrays.equals(this.nslogpolicyname, other.getNslogpolicyname()))) &&
            ((this.nslogpriority==null && other.getNslogpriority()==null) || 
             (this.nslogpriority!=null &&
              java.util.Arrays.equals(this.nslogpriority, other.getNslogpriority()))) &&
            ((this.sessionpolicyname==null && other.getSessionpolicyname()==null) || 
             (this.sessionpolicyname!=null &&
              java.util.Arrays.equals(this.sessionpolicyname, other.getSessionpolicyname()))) &&
            ((this.sessionpolicypriority==null && other.getSessionpolicypriority()==null) || 
             (this.sessionpolicypriority!=null &&
              java.util.Arrays.equals(this.sessionpolicypriority, other.getSessionpolicypriority()))) &&
            ((this.radiusauthpolicyname==null && other.getRadiusauthpolicyname()==null) || 
             (this.radiusauthpolicyname!=null &&
              java.util.Arrays.equals(this.radiusauthpolicyname, other.getRadiusauthpolicyname()))) &&
            ((this.radiusauthpolicypriority==null && other.getRadiusauthpolicypriority()==null) || 
             (this.radiusauthpolicypriority!=null &&
              java.util.Arrays.equals(this.radiusauthpolicypriority, other.getRadiusauthpolicypriority()))) &&
            ((this.radiusauthpolicysecondary==null && other.getRadiusauthpolicysecondary()==null) || 
             (this.radiusauthpolicysecondary!=null &&
              java.util.Arrays.equals(this.radiusauthpolicysecondary, other.getRadiusauthpolicysecondary()))) &&
            ((this.ldapauthpolicyname==null && other.getLdapauthpolicyname()==null) || 
             (this.ldapauthpolicyname!=null &&
              java.util.Arrays.equals(this.ldapauthpolicyname, other.getLdapauthpolicyname()))) &&
            ((this.ldapauthpolicypriority==null && other.getLdapauthpolicypriority()==null) || 
             (this.ldapauthpolicypriority!=null &&
              java.util.Arrays.equals(this.ldapauthpolicypriority, other.getLdapauthpolicypriority()))) &&
            ((this.ldapauthpolicysecondary==null && other.getLdapauthpolicysecondary()==null) || 
             (this.ldapauthpolicysecondary!=null &&
              java.util.Arrays.equals(this.ldapauthpolicysecondary, other.getLdapauthpolicysecondary()))) &&
            ((this.ldapauthpolicygroupextraction==null && other.getLdapauthpolicygroupextraction()==null) || 
             (this.ldapauthpolicygroupextraction!=null &&
              java.util.Arrays.equals(this.ldapauthpolicygroupextraction, other.getLdapauthpolicygroupextraction()))) &&
            ((this.certauthpolicyname==null && other.getCertauthpolicyname()==null) || 
             (this.certauthpolicyname!=null &&
              java.util.Arrays.equals(this.certauthpolicyname, other.getCertauthpolicyname()))) &&
            ((this.certauthpolicypriority==null && other.getCertauthpolicypriority()==null) || 
             (this.certauthpolicypriority!=null &&
              java.util.Arrays.equals(this.certauthpolicypriority, other.getCertauthpolicypriority()))) &&
            ((this.certauthpolicysecondary==null && other.getCertauthpolicysecondary()==null) || 
             (this.certauthpolicysecondary!=null &&
              java.util.Arrays.equals(this.certauthpolicysecondary, other.getCertauthpolicysecondary()))) &&
            ((this.tacacsauthpolicyname==null && other.getTacacsauthpolicyname()==null) || 
             (this.tacacsauthpolicyname!=null &&
              java.util.Arrays.equals(this.tacacsauthpolicyname, other.getTacacsauthpolicyname()))) &&
            ((this.tacacsauthpolicypriority==null && other.getTacacsauthpolicypriority()==null) || 
             (this.tacacsauthpolicypriority!=null &&
              java.util.Arrays.equals(this.tacacsauthpolicypriority, other.getTacacsauthpolicypriority()))) &&
            ((this.tacacsauthpolicysecondary==null && other.getTacacsauthpolicysecondary()==null) || 
             (this.tacacsauthpolicysecondary!=null &&
              java.util.Arrays.equals(this.tacacsauthpolicysecondary, other.getTacacsauthpolicysecondary()))) &&
            ((this.localauthpolicyname==null && other.getLocalauthpolicyname()==null) || 
             (this.localauthpolicyname!=null &&
              java.util.Arrays.equals(this.localauthpolicyname, other.getLocalauthpolicyname()))) &&
            ((this.localauthpolicypriority==null && other.getLocalauthpolicypriority()==null) || 
             (this.localauthpolicypriority!=null &&
              java.util.Arrays.equals(this.localauthpolicypriority, other.getLocalauthpolicypriority()))) &&
            ((this.localauthpolicysecondary==null && other.getLocalauthpolicysecondary()==null) || 
             (this.localauthpolicysecondary!=null &&
              java.util.Arrays.equals(this.localauthpolicysecondary, other.getLocalauthpolicysecondary()))) &&
            ((this.negauthpolicyname==null && other.getNegauthpolicyname()==null) || 
             (this.negauthpolicyname!=null &&
              java.util.Arrays.equals(this.negauthpolicyname, other.getNegauthpolicyname()))) &&
            ((this.negauthpolicypriority==null && other.getNegauthpolicypriority()==null) || 
             (this.negauthpolicypriority!=null &&
              java.util.Arrays.equals(this.negauthpolicypriority, other.getNegauthpolicypriority()))) &&
            ((this.negauthpolicysecondary==null && other.getNegauthpolicysecondary()==null) || 
             (this.negauthpolicysecondary!=null &&
              java.util.Arrays.equals(this.negauthpolicysecondary, other.getNegauthpolicysecondary()))) &&
            ((this.samlauthpolicyname==null && other.getSamlauthpolicyname()==null) || 
             (this.samlauthpolicyname!=null &&
              java.util.Arrays.equals(this.samlauthpolicyname, other.getSamlauthpolicyname()))) &&
            ((this.samlauthpolicypriority==null && other.getSamlauthpolicypriority()==null) || 
             (this.samlauthpolicypriority!=null &&
              java.util.Arrays.equals(this.samlauthpolicypriority, other.getSamlauthpolicypriority()))) &&
            ((this.samlauthpolicysecondary==null && other.getSamlauthpolicysecondary()==null) || 
             (this.samlauthpolicysecondary!=null &&
              java.util.Arrays.equals(this.samlauthpolicysecondary, other.getSamlauthpolicysecondary()))) &&
            ((this.trafficpolicyname==null && other.getTrafficpolicyname()==null) || 
             (this.trafficpolicyname!=null &&
              java.util.Arrays.equals(this.trafficpolicyname, other.getTrafficpolicyname()))) &&
            ((this.trafficpolicypriority==null && other.getTrafficpolicypriority()==null) || 
             (this.trafficpolicypriority!=null &&
              java.util.Arrays.equals(this.trafficpolicypriority, other.getTrafficpolicypriority()))) &&
            ((this.preauthenticationpolicyname==null && other.getPreauthenticationpolicyname()==null) || 
             (this.preauthenticationpolicyname!=null &&
              java.util.Arrays.equals(this.preauthenticationpolicyname, other.getPreauthenticationpolicyname()))) &&
            ((this.preauthenticationpolicypriority==null && other.getPreauthenticationpolicypriority()==null) || 
             (this.preauthenticationpolicypriority!=null &&
              java.util.Arrays.equals(this.preauthenticationpolicypriority, other.getPreauthenticationpolicypriority()))) &&
            ((this.cvpnpolicyname==null && other.getCvpnpolicyname()==null) || 
             (this.cvpnpolicyname!=null &&
              java.util.Arrays.equals(this.cvpnpolicyname, other.getCvpnpolicyname()))) &&
            ((this.cvpnpriority==null && other.getCvpnpriority()==null) || 
             (this.cvpnpriority!=null &&
              java.util.Arrays.equals(this.cvpnpriority, other.getCvpnpriority()))) &&
            ((this.cvpnbindpoint==null && other.getCvpnbindpoint()==null) || 
             (this.cvpnbindpoint!=null &&
              java.util.Arrays.equals(this.cvpnbindpoint, other.getCvpnbindpoint()))) &&
            ((this.cvpngotopriorityexpression==null && other.getCvpngotopriorityexpression()==null) || 
             (this.cvpngotopriorityexpression!=null &&
              java.util.Arrays.equals(this.cvpngotopriorityexpression, other.getCvpngotopriorityexpression()))) &&
            ((this.rwpolicyname==null && other.getRwpolicyname()==null) || 
             (this.rwpolicyname!=null &&
              java.util.Arrays.equals(this.rwpolicyname, other.getRwpolicyname()))) &&
            ((this.rwpolicypriority==null && other.getRwpolicypriority()==null) || 
             (this.rwpolicypriority!=null &&
              java.util.Arrays.equals(this.rwpolicypriority, other.getRwpolicypriority()))) &&
            ((this.rwpolicygotoprioexpression==null && other.getRwpolicygotoprioexpression()==null) || 
             (this.rwpolicygotoprioexpression!=null &&
              java.util.Arrays.equals(this.rwpolicygotoprioexpression, other.getRwpolicygotoprioexpression()))) &&
            ((this.rwpolicybindpoint==null && other.getRwpolicybindpoint()==null) || 
             (this.rwpolicybindpoint!=null &&
              java.util.Arrays.equals(this.rwpolicybindpoint, other.getRwpolicybindpoint()))) &&
            ((this.rsppolicyname==null && other.getRsppolicyname()==null) || 
             (this.rsppolicyname!=null &&
              java.util.Arrays.equals(this.rsppolicyname, other.getRsppolicyname()))) &&
            ((this.rsppolicypriority==null && other.getRsppolicypriority()==null) || 
             (this.rsppolicypriority!=null &&
              java.util.Arrays.equals(this.rsppolicypriority, other.getRsppolicypriority()))) &&
            ((this.rsppolicygotoprioexpression==null && other.getRsppolicygotoprioexpression()==null) || 
             (this.rsppolicygotoprioexpression!=null &&
              java.util.Arrays.equals(this.rsppolicygotoprioexpression, other.getRsppolicygotoprioexpression()))) &&
            ((this.cachepolicyname==null && other.getCachepolicyname()==null) || 
             (this.cachepolicyname!=null &&
              java.util.Arrays.equals(this.cachepolicyname, other.getCachepolicyname()))) &&
            ((this.cachepolicypriority==null && other.getCachepolicypriority()==null) || 
             (this.cachepolicypriority!=null &&
              java.util.Arrays.equals(this.cachepolicypriority, other.getCachepolicypriority()))) &&
            ((this.cachepolicygotoprioexpression==null && other.getCachepolicygotoprioexpression()==null) || 
             (this.cachepolicygotoprioexpression!=null &&
              java.util.Arrays.equals(this.cachepolicygotoprioexpression, other.getCachepolicygotoprioexpression()))) &&
            ((this.appflowpolicyname==null && other.getAppflowpolicyname()==null) || 
             (this.appflowpolicyname!=null &&
              java.util.Arrays.equals(this.appflowpolicyname, other.getAppflowpolicyname()))) &&
            ((this.appflowpolicypriority==null && other.getAppflowpolicypriority()==null) || 
             (this.appflowpolicypriority!=null &&
              java.util.Arrays.equals(this.appflowpolicypriority, other.getAppflowpolicypriority()))) &&
            ((this.appflowpolicygotoprioexpression==null && other.getAppflowpolicygotoprioexpression()==null) || 
             (this.appflowpolicygotoprioexpression!=null &&
              java.util.Arrays.equals(this.appflowpolicygotoprioexpression, other.getAppflowpolicygotoprioexpression()))) &&
            ((this.appflowpolicybindpoint==null && other.getAppflowpolicybindpoint()==null) || 
             (this.appflowpolicybindpoint!=null &&
              java.util.Arrays.equals(this.appflowpolicybindpoint, other.getAppflowpolicybindpoint())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getIpaddress() != null) {
            _hashCode += getIpaddress().hashCode();
        }
        if (getIpaddress2() != null) {
            _hashCode += getIpaddress2().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getRange() != null) {
            _hashCode += getRange().hashCode();
        }
        if (getServicetype() != null) {
            _hashCode += getServicetype().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        _hashCode += getStatus();
        if (getCachetype() != null) {
            _hashCode += getCachetype().hashCode();
        }
        if (getRedirect() != null) {
            _hashCode += getRedirect().hashCode();
        }
        if (getPrecedence() != null) {
            _hashCode += getPrecedence().hashCode();
        }
        if (getRedirecturl() != null) {
            _hashCode += getRedirecturl().hashCode();
        }
        if (getAuthentication() != null) {
            _hashCode += getAuthentication().hashCode();
        }
        if (getDoublehop() != null) {
            _hashCode += getDoublehop().hashCode();
        }
        if (getIcaonly() != null) {
            _hashCode += getIcaonly().hashCode();
        }
        if (getMaxaaausers() != null) {
            _hashCode += getMaxaaausers().hashCode();
        }
        if (getCuraaausers() != null) {
            _hashCode += getCuraaausers().hashCode();
        }
        if (getDomain() != null) {
            _hashCode += getDomain().hashCode();
        }
        if (getRule() != null) {
            _hashCode += getRule().hashCode();
        }
        if (getPolicyname() != null) {
            _hashCode += getPolicyname().hashCode();
        }
        if (getPolicy() != null) {
            _hashCode += getPolicy().hashCode();
        }
        if (getServicename() != null) {
            _hashCode += getServicename().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getCachevserver() != null) {
            _hashCode += getCachevserver().hashCode();
        }
        if (getBackupvserver() != null) {
            _hashCode += getBackupvserver().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getClttimeout() != null) {
            _hashCode += getClttimeout().hashCode();
        }
        if (getSomethod() != null) {
            _hashCode += getSomethod().hashCode();
        }
        if (getSothreshold() != null) {
            _hashCode += getSothreshold().hashCode();
        }
        if (getSopersistence() != null) {
            _hashCode += getSopersistence().hashCode();
        }
        if (getSopersistencetimeout() != null) {
            _hashCode += getSopersistencetimeout().hashCode();
        }
        if (getActtype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActtype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActtype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIntranetapplication() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntranetapplication());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIntranetapplication(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNexthopserver() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNexthopserver());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNexthopserver(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUrlname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUrlname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUrlname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIntranetip() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntranetip());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIntranetip(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetmask() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetmask());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetmask(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStaserver() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStaserver());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStaserver(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStaauthid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStaauthid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStaauthid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppcontroller() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppcontroller());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppcontroller(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSharefile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSharefile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSharefile(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUsemip() != null) {
            _hashCode += getUsemip().hashCode();
        }
        if (getMap() != null) {
            _hashCode += getMap().hashCode();
        }
        if (getDownstateflush() != null) {
            _hashCode += getDownstateflush().hashCode();
        }
        if (getType2() != null) {
            _hashCode += getType2().hashCode();
        }
        if (getGotopriorityexpression() != null) {
            _hashCode += getGotopriorityexpression().hashCode();
        }
        if (getDisableprimaryondown() != null) {
            _hashCode += getDisableprimaryondown().hashCode();
        }
        if (getListenpolicy() != null) {
            _hashCode += getListenpolicy().hashCode();
        }
        if (getListenpriority() != null) {
            _hashCode += getListenpriority().hashCode();
        }
        if (getTcpprofilename() != null) {
            _hashCode += getTcpprofilename().hashCode();
        }
        if (getHttpprofilename() != null) {
            _hashCode += getHttpprofilename().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getAppflowlog() != null) {
            _hashCode += getAppflowlog().hashCode();
        }
        if (getIcmpvsrresponse() != null) {
            _hashCode += getIcmpvsrresponse().hashCode();
        }
        if (getNetprofile() != null) {
            _hashCode += getNetprofile().hashCode();
        }
        if (getMaxloginattempts() != null) {
            _hashCode += getMaxloginattempts().hashCode();
        }
        if (getFailedlogintimeout() != null) {
            _hashCode += getFailedlogintimeout().hashCode();
        }
        _hashCode += (isSecondary() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isGroupextraction() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIntranetipmap() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntranetipmap());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIntranetipmap(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSyslogpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSyslogpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSyslogpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSyslogpriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSyslogpriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSyslogpriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNslogpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNslogpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNslogpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNslogpriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNslogpriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNslogpriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSessionpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSessionpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSessionpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSessionpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSessionpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSessionpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRadiusauthpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRadiusauthpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRadiusauthpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRadiusauthpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRadiusauthpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRadiusauthpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRadiusauthpolicysecondary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRadiusauthpolicysecondary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRadiusauthpolicysecondary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLdapauthpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLdapauthpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLdapauthpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLdapauthpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLdapauthpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLdapauthpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLdapauthpolicysecondary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLdapauthpolicysecondary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLdapauthpolicysecondary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLdapauthpolicygroupextraction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLdapauthpolicygroupextraction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLdapauthpolicygroupextraction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCertauthpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCertauthpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCertauthpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCertauthpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCertauthpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCertauthpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCertauthpolicysecondary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCertauthpolicysecondary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCertauthpolicysecondary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTacacsauthpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTacacsauthpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTacacsauthpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTacacsauthpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTacacsauthpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTacacsauthpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTacacsauthpolicysecondary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTacacsauthpolicysecondary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTacacsauthpolicysecondary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocalauthpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocalauthpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocalauthpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocalauthpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocalauthpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocalauthpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocalauthpolicysecondary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocalauthpolicysecondary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocalauthpolicysecondary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNegauthpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNegauthpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNegauthpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNegauthpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNegauthpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNegauthpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNegauthpolicysecondary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNegauthpolicysecondary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNegauthpolicysecondary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSamlauthpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSamlauthpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSamlauthpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSamlauthpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSamlauthpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSamlauthpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSamlauthpolicysecondary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSamlauthpolicysecondary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSamlauthpolicysecondary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrafficpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrafficpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrafficpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrafficpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrafficpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrafficpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPreauthenticationpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreauthenticationpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreauthenticationpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPreauthenticationpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreauthenticationpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreauthenticationpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCvpnpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCvpnpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCvpnpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCvpnpriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCvpnpriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCvpnpriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCvpnbindpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCvpnbindpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCvpnbindpoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCvpngotopriorityexpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCvpngotopriorityexpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCvpngotopriorityexpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRwpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRwpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRwpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRwpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRwpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRwpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRwpolicygotoprioexpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRwpolicygotoprioexpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRwpolicygotoprioexpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRwpolicybindpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRwpolicybindpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRwpolicybindpoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRsppolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRsppolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRsppolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRsppolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRsppolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRsppolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRsppolicygotoprioexpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRsppolicygotoprioexpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRsppolicygotoprioexpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCachepolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCachepolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCachepolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCachepolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCachepolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCachepolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCachepolicygotoprioexpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCachepolicygotoprioexpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCachepolicygotoprioexpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppflowpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppflowpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppflowpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppflowpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppflowpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppflowpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppflowpolicygotoprioexpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppflowpolicygotoprioexpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppflowpolicygotoprioexpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppflowpolicybindpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppflowpolicybindpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppflowpolicybindpoint(), i);
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
        new org.apache.axis.description.TypeDesc(Vpnvserver.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "vpnvserver"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
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
        elemField.setFieldName("ipaddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipaddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("range");
        elemField.setXmlName(new javax.xml.namespace.QName("", "range"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicetype"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirect");
        elemField.setXmlName(new javax.xml.namespace.QName("", "redirect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precedence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "precedence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirecturl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "redirecturl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authentication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authentication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("doublehop");
        elemField.setXmlName(new javax.xml.namespace.QName("", "doublehop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icaonly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "icaonly"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxaaausers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxaaausers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curaaausers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curaaausers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicename"));
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
        elemField.setFieldName("cachevserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachevserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupvserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backupvserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clttimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clttimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("somethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "somethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sothreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sothreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sopersistence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sopersistence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sopersistencetimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sopersistencetimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acttype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acttype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intranetapplication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intranetapplication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexthopserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nexthopserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urlname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intranetip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intranetip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netmask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netmask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "staserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staauthid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "staauthid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appcontroller");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appcontroller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharefile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sharefile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usemip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usemip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("map");
        elemField.setXmlName(new javax.xml.namespace.QName("", "map"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downstateflush");
        elemField.setXmlName(new javax.xml.namespace.QName("", "downstateflush"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gotopriorityexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gotopriorityexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableprimaryondown");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disableprimaryondown"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listenpolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listenpolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listenpriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listenpriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcpprofilename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tcpprofilename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpprofilename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpprofilename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appflowlog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appflowlog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icmpvsrresponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "icmpvsrresponse"));
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
        elemField.setFieldName("maxloginattempts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxloginattempts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedlogintimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "failedlogintimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupextraction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupextraction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intranetipmap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intranetipmap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syslogpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "syslogpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syslogpriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "syslogpriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nslogpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nslogpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nslogpriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nslogpriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusauthpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radiusauthpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusauthpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radiusauthpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusauthpolicysecondary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radiusauthpolicysecondary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldapauthpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldapauthpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldapauthpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldapauthpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldapauthpolicysecondary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldapauthpolicysecondary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldapauthpolicygroupextraction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldapauthpolicygroupextraction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certauthpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certauthpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certauthpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certauthpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certauthpolicysecondary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certauthpolicysecondary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tacacsauthpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tacacsauthpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tacacsauthpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tacacsauthpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tacacsauthpolicysecondary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tacacsauthpolicysecondary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localauthpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localauthpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localauthpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localauthpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localauthpolicysecondary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localauthpolicysecondary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negauthpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "negauthpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negauthpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "negauthpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negauthpolicysecondary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "negauthpolicysecondary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlauthpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "samlauthpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlauthpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "samlauthpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlauthpolicysecondary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "samlauthpolicysecondary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trafficpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trafficpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trafficpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trafficpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preauthenticationpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preauthenticationpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preauthenticationpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preauthenticationpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvpnpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cvpnpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvpnpriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cvpnpriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvpnbindpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cvpnbindpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvpngotopriorityexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cvpngotopriorityexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rwpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rwpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rwpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rwpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rwpolicygotoprioexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rwpolicygotoprioexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rwpolicybindpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rwpolicybindpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsppolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsppolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsppolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsppolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsppolicygotoprioexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsppolicygotoprioexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachepolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachepolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachepolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachepolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachepolicygotoprioexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachepolicygotoprioexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appflowpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appflowpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appflowpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appflowpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appflowpolicygotoprioexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appflowpolicygotoprioexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appflowpolicybindpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appflowpolicybindpoint"));
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
