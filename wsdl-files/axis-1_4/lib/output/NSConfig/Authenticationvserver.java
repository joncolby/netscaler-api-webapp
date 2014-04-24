/**
 * Authenticationvserver.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Authenticationvserver  implements java.io.Serializable {
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

    private org.apache.axis.types.UnsignedInt curaaausers;

    private java.lang.String authenticationdomain;

    private java.lang.String rule;

    private java.lang.String policyname;

    private java.lang.String policy;

    private java.lang.String servicename;

    private org.apache.axis.types.UnsignedInt weight;

    private java.lang.String cachevserver;

    private java.lang.String backupvserver;

    private org.apache.axis.types.UnsignedInt clttimeout;

    private java.lang.String somethod;

    private org.apache.axis.types.UnsignedInt sothreshold;

    private java.lang.String sopersistence;

    private org.apache.axis.types.UnsignedInt sopersistencetimeout;

    private org.apache.axis.types.UnsignedInt priority;

    private java.lang.String downstateflush;

    private org.apache.axis.types.UnsignedInt[] acttype;

    private java.lang.String disableprimaryondown;

    private java.lang.String listenpolicy;

    private org.apache.axis.types.UnsignedInt listenpriority;

    private java.lang.String tcpprofilename;

    private java.lang.String httpprofilename;

    private java.lang.String comment;

    private java.lang.String appflowlog;

    private org.apache.axis.types.UnsignedInt vstype;

    private java.lang.String ngname;

    private org.apache.axis.types.UnsignedInt maxloginattempts;

    private org.apache.axis.types.UnsignedInt failedlogintimeout;

    private boolean secondary;

    private boolean groupextraction;

    private java.lang.String[] nslogpolicyname;

    private org.apache.axis.types.UnsignedInt[] nslogpriority;

    private java.lang.String[] syslogpolicyname;

    private org.apache.axis.types.UnsignedInt[] syslogpriority;

    private java.lang.String[] tmsessionpolicyname;

    private org.apache.axis.types.UnsignedInt[] tmsessionpolicypriority;

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

    private java.lang.String[] negauthpolicyname;

    private org.apache.axis.types.UnsignedInt[] negauthpolicypriority;

    private boolean[] negauthpolicysecondary;

    private java.lang.String[] samlauthpolicyname;

    private org.apache.axis.types.UnsignedInt[] samlauthpolicypriority;

    private boolean[] samlauthpolicysecondary;

    private java.lang.String[] localauthpolicyname;

    private org.apache.axis.types.UnsignedInt[] localauthpolicypriority;

    private boolean[] localauthpolicysecondary;

    public Authenticationvserver() {
    }

    public Authenticationvserver(
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
           org.apache.axis.types.UnsignedInt curaaausers,
           java.lang.String authenticationdomain,
           java.lang.String rule,
           java.lang.String policyname,
           java.lang.String policy,
           java.lang.String servicename,
           org.apache.axis.types.UnsignedInt weight,
           java.lang.String cachevserver,
           java.lang.String backupvserver,
           org.apache.axis.types.UnsignedInt clttimeout,
           java.lang.String somethod,
           org.apache.axis.types.UnsignedInt sothreshold,
           java.lang.String sopersistence,
           org.apache.axis.types.UnsignedInt sopersistencetimeout,
           org.apache.axis.types.UnsignedInt priority,
           java.lang.String downstateflush,
           org.apache.axis.types.UnsignedInt[] acttype,
           java.lang.String disableprimaryondown,
           java.lang.String listenpolicy,
           org.apache.axis.types.UnsignedInt listenpriority,
           java.lang.String tcpprofilename,
           java.lang.String httpprofilename,
           java.lang.String comment,
           java.lang.String appflowlog,
           org.apache.axis.types.UnsignedInt vstype,
           java.lang.String ngname,
           org.apache.axis.types.UnsignedInt maxloginattempts,
           org.apache.axis.types.UnsignedInt failedlogintimeout,
           boolean secondary,
           boolean groupextraction,
           java.lang.String[] nslogpolicyname,
           org.apache.axis.types.UnsignedInt[] nslogpriority,
           java.lang.String[] syslogpolicyname,
           org.apache.axis.types.UnsignedInt[] syslogpriority,
           java.lang.String[] tmsessionpolicyname,
           org.apache.axis.types.UnsignedInt[] tmsessionpolicypriority,
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
           java.lang.String[] negauthpolicyname,
           org.apache.axis.types.UnsignedInt[] negauthpolicypriority,
           boolean[] negauthpolicysecondary,
           java.lang.String[] samlauthpolicyname,
           org.apache.axis.types.UnsignedInt[] samlauthpolicypriority,
           boolean[] samlauthpolicysecondary,
           java.lang.String[] localauthpolicyname,
           org.apache.axis.types.UnsignedInt[] localauthpolicypriority,
           boolean[] localauthpolicysecondary) {
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
           this.curaaausers = curaaausers;
           this.authenticationdomain = authenticationdomain;
           this.rule = rule;
           this.policyname = policyname;
           this.policy = policy;
           this.servicename = servicename;
           this.weight = weight;
           this.cachevserver = cachevserver;
           this.backupvserver = backupvserver;
           this.clttimeout = clttimeout;
           this.somethod = somethod;
           this.sothreshold = sothreshold;
           this.sopersistence = sopersistence;
           this.sopersistencetimeout = sopersistencetimeout;
           this.priority = priority;
           this.downstateflush = downstateflush;
           this.acttype = acttype;
           this.disableprimaryondown = disableprimaryondown;
           this.listenpolicy = listenpolicy;
           this.listenpriority = listenpriority;
           this.tcpprofilename = tcpprofilename;
           this.httpprofilename = httpprofilename;
           this.comment = comment;
           this.appflowlog = appflowlog;
           this.vstype = vstype;
           this.ngname = ngname;
           this.maxloginattempts = maxloginattempts;
           this.failedlogintimeout = failedlogintimeout;
           this.secondary = secondary;
           this.groupextraction = groupextraction;
           this.nslogpolicyname = nslogpolicyname;
           this.nslogpriority = nslogpriority;
           this.syslogpolicyname = syslogpolicyname;
           this.syslogpriority = syslogpriority;
           this.tmsessionpolicyname = tmsessionpolicyname;
           this.tmsessionpolicypriority = tmsessionpolicypriority;
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
           this.negauthpolicyname = negauthpolicyname;
           this.negauthpolicypriority = negauthpolicypriority;
           this.negauthpolicysecondary = negauthpolicysecondary;
           this.samlauthpolicyname = samlauthpolicyname;
           this.samlauthpolicypriority = samlauthpolicypriority;
           this.samlauthpolicysecondary = samlauthpolicysecondary;
           this.localauthpolicyname = localauthpolicyname;
           this.localauthpolicypriority = localauthpolicypriority;
           this.localauthpolicysecondary = localauthpolicysecondary;
    }


    /**
     * Gets the name value for this Authenticationvserver.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Authenticationvserver.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the ipaddress value for this Authenticationvserver.
     * 
     * @return ipaddress
     */
    public java.lang.String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Authenticationvserver.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the ipaddress2 value for this Authenticationvserver.
     * 
     * @return ipaddress2
     */
    public java.lang.String getIpaddress2() {
        return ipaddress2;
    }


    /**
     * Sets the ipaddress2 value for this Authenticationvserver.
     * 
     * @param ipaddress2
     */
    public void setIpaddress2(java.lang.String ipaddress2) {
        this.ipaddress2 = ipaddress2;
    }


    /**
     * Gets the value value for this Authenticationvserver.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this Authenticationvserver.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the port value for this Authenticationvserver.
     * 
     * @return port
     */
    public org.apache.axis.types.UnsignedInt getPort() {
        return port;
    }


    /**
     * Sets the port value for this Authenticationvserver.
     * 
     * @param port
     */
    public void setPort(org.apache.axis.types.UnsignedInt port) {
        this.port = port;
    }


    /**
     * Gets the range value for this Authenticationvserver.
     * 
     * @return range
     */
    public org.apache.axis.types.UnsignedInt getRange() {
        return range;
    }


    /**
     * Sets the range value for this Authenticationvserver.
     * 
     * @param range
     */
    public void setRange(org.apache.axis.types.UnsignedInt range) {
        this.range = range;
    }


    /**
     * Gets the servicetype value for this Authenticationvserver.
     * 
     * @return servicetype
     */
    public java.lang.String getServicetype() {
        return servicetype;
    }


    /**
     * Sets the servicetype value for this Authenticationvserver.
     * 
     * @param servicetype
     */
    public void setServicetype(java.lang.String servicetype) {
        this.servicetype = servicetype;
    }


    /**
     * Gets the type value for this Authenticationvserver.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Authenticationvserver.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the state value for this Authenticationvserver.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Authenticationvserver.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the status value for this Authenticationvserver.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Authenticationvserver.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the cachetype value for this Authenticationvserver.
     * 
     * @return cachetype
     */
    public java.lang.String getCachetype() {
        return cachetype;
    }


    /**
     * Sets the cachetype value for this Authenticationvserver.
     * 
     * @param cachetype
     */
    public void setCachetype(java.lang.String cachetype) {
        this.cachetype = cachetype;
    }


    /**
     * Gets the redirect value for this Authenticationvserver.
     * 
     * @return redirect
     */
    public java.lang.String getRedirect() {
        return redirect;
    }


    /**
     * Sets the redirect value for this Authenticationvserver.
     * 
     * @param redirect
     */
    public void setRedirect(java.lang.String redirect) {
        this.redirect = redirect;
    }


    /**
     * Gets the precedence value for this Authenticationvserver.
     * 
     * @return precedence
     */
    public java.lang.String getPrecedence() {
        return precedence;
    }


    /**
     * Sets the precedence value for this Authenticationvserver.
     * 
     * @param precedence
     */
    public void setPrecedence(java.lang.String precedence) {
        this.precedence = precedence;
    }


    /**
     * Gets the redirecturl value for this Authenticationvserver.
     * 
     * @return redirecturl
     */
    public java.lang.String getRedirecturl() {
        return redirecturl;
    }


    /**
     * Sets the redirecturl value for this Authenticationvserver.
     * 
     * @param redirecturl
     */
    public void setRedirecturl(java.lang.String redirecturl) {
        this.redirecturl = redirecturl;
    }


    /**
     * Gets the authentication value for this Authenticationvserver.
     * 
     * @return authentication
     */
    public java.lang.String getAuthentication() {
        return authentication;
    }


    /**
     * Sets the authentication value for this Authenticationvserver.
     * 
     * @param authentication
     */
    public void setAuthentication(java.lang.String authentication) {
        this.authentication = authentication;
    }


    /**
     * Gets the curaaausers value for this Authenticationvserver.
     * 
     * @return curaaausers
     */
    public org.apache.axis.types.UnsignedInt getCuraaausers() {
        return curaaausers;
    }


    /**
     * Sets the curaaausers value for this Authenticationvserver.
     * 
     * @param curaaausers
     */
    public void setCuraaausers(org.apache.axis.types.UnsignedInt curaaausers) {
        this.curaaausers = curaaausers;
    }


    /**
     * Gets the authenticationdomain value for this Authenticationvserver.
     * 
     * @return authenticationdomain
     */
    public java.lang.String getAuthenticationdomain() {
        return authenticationdomain;
    }


    /**
     * Sets the authenticationdomain value for this Authenticationvserver.
     * 
     * @param authenticationdomain
     */
    public void setAuthenticationdomain(java.lang.String authenticationdomain) {
        this.authenticationdomain = authenticationdomain;
    }


    /**
     * Gets the rule value for this Authenticationvserver.
     * 
     * @return rule
     */
    public java.lang.String getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this Authenticationvserver.
     * 
     * @param rule
     */
    public void setRule(java.lang.String rule) {
        this.rule = rule;
    }


    /**
     * Gets the policyname value for this Authenticationvserver.
     * 
     * @return policyname
     */
    public java.lang.String getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Authenticationvserver.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the policy value for this Authenticationvserver.
     * 
     * @return policy
     */
    public java.lang.String getPolicy() {
        return policy;
    }


    /**
     * Sets the policy value for this Authenticationvserver.
     * 
     * @param policy
     */
    public void setPolicy(java.lang.String policy) {
        this.policy = policy;
    }


    /**
     * Gets the servicename value for this Authenticationvserver.
     * 
     * @return servicename
     */
    public java.lang.String getServicename() {
        return servicename;
    }


    /**
     * Sets the servicename value for this Authenticationvserver.
     * 
     * @param servicename
     */
    public void setServicename(java.lang.String servicename) {
        this.servicename = servicename;
    }


    /**
     * Gets the weight value for this Authenticationvserver.
     * 
     * @return weight
     */
    public org.apache.axis.types.UnsignedInt getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this Authenticationvserver.
     * 
     * @param weight
     */
    public void setWeight(org.apache.axis.types.UnsignedInt weight) {
        this.weight = weight;
    }


    /**
     * Gets the cachevserver value for this Authenticationvserver.
     * 
     * @return cachevserver
     */
    public java.lang.String getCachevserver() {
        return cachevserver;
    }


    /**
     * Sets the cachevserver value for this Authenticationvserver.
     * 
     * @param cachevserver
     */
    public void setCachevserver(java.lang.String cachevserver) {
        this.cachevserver = cachevserver;
    }


    /**
     * Gets the backupvserver value for this Authenticationvserver.
     * 
     * @return backupvserver
     */
    public java.lang.String getBackupvserver() {
        return backupvserver;
    }


    /**
     * Sets the backupvserver value for this Authenticationvserver.
     * 
     * @param backupvserver
     */
    public void setBackupvserver(java.lang.String backupvserver) {
        this.backupvserver = backupvserver;
    }


    /**
     * Gets the clttimeout value for this Authenticationvserver.
     * 
     * @return clttimeout
     */
    public org.apache.axis.types.UnsignedInt getClttimeout() {
        return clttimeout;
    }


    /**
     * Sets the clttimeout value for this Authenticationvserver.
     * 
     * @param clttimeout
     */
    public void setClttimeout(org.apache.axis.types.UnsignedInt clttimeout) {
        this.clttimeout = clttimeout;
    }


    /**
     * Gets the somethod value for this Authenticationvserver.
     * 
     * @return somethod
     */
    public java.lang.String getSomethod() {
        return somethod;
    }


    /**
     * Sets the somethod value for this Authenticationvserver.
     * 
     * @param somethod
     */
    public void setSomethod(java.lang.String somethod) {
        this.somethod = somethod;
    }


    /**
     * Gets the sothreshold value for this Authenticationvserver.
     * 
     * @return sothreshold
     */
    public org.apache.axis.types.UnsignedInt getSothreshold() {
        return sothreshold;
    }


    /**
     * Sets the sothreshold value for this Authenticationvserver.
     * 
     * @param sothreshold
     */
    public void setSothreshold(org.apache.axis.types.UnsignedInt sothreshold) {
        this.sothreshold = sothreshold;
    }


    /**
     * Gets the sopersistence value for this Authenticationvserver.
     * 
     * @return sopersistence
     */
    public java.lang.String getSopersistence() {
        return sopersistence;
    }


    /**
     * Sets the sopersistence value for this Authenticationvserver.
     * 
     * @param sopersistence
     */
    public void setSopersistence(java.lang.String sopersistence) {
        this.sopersistence = sopersistence;
    }


    /**
     * Gets the sopersistencetimeout value for this Authenticationvserver.
     * 
     * @return sopersistencetimeout
     */
    public org.apache.axis.types.UnsignedInt getSopersistencetimeout() {
        return sopersistencetimeout;
    }


    /**
     * Sets the sopersistencetimeout value for this Authenticationvserver.
     * 
     * @param sopersistencetimeout
     */
    public void setSopersistencetimeout(org.apache.axis.types.UnsignedInt sopersistencetimeout) {
        this.sopersistencetimeout = sopersistencetimeout;
    }


    /**
     * Gets the priority value for this Authenticationvserver.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Authenticationvserver.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the downstateflush value for this Authenticationvserver.
     * 
     * @return downstateflush
     */
    public java.lang.String getDownstateflush() {
        return downstateflush;
    }


    /**
     * Sets the downstateflush value for this Authenticationvserver.
     * 
     * @param downstateflush
     */
    public void setDownstateflush(java.lang.String downstateflush) {
        this.downstateflush = downstateflush;
    }


    /**
     * Gets the acttype value for this Authenticationvserver.
     * 
     * @return acttype
     */
    public org.apache.axis.types.UnsignedInt[] getActtype() {
        return acttype;
    }


    /**
     * Sets the acttype value for this Authenticationvserver.
     * 
     * @param acttype
     */
    public void setActtype(org.apache.axis.types.UnsignedInt[] acttype) {
        this.acttype = acttype;
    }


    /**
     * Gets the disableprimaryondown value for this Authenticationvserver.
     * 
     * @return disableprimaryondown
     */
    public java.lang.String getDisableprimaryondown() {
        return disableprimaryondown;
    }


    /**
     * Sets the disableprimaryondown value for this Authenticationvserver.
     * 
     * @param disableprimaryondown
     */
    public void setDisableprimaryondown(java.lang.String disableprimaryondown) {
        this.disableprimaryondown = disableprimaryondown;
    }


    /**
     * Gets the listenpolicy value for this Authenticationvserver.
     * 
     * @return listenpolicy
     */
    public java.lang.String getListenpolicy() {
        return listenpolicy;
    }


    /**
     * Sets the listenpolicy value for this Authenticationvserver.
     * 
     * @param listenpolicy
     */
    public void setListenpolicy(java.lang.String listenpolicy) {
        this.listenpolicy = listenpolicy;
    }


    /**
     * Gets the listenpriority value for this Authenticationvserver.
     * 
     * @return listenpriority
     */
    public org.apache.axis.types.UnsignedInt getListenpriority() {
        return listenpriority;
    }


    /**
     * Sets the listenpriority value for this Authenticationvserver.
     * 
     * @param listenpriority
     */
    public void setListenpriority(org.apache.axis.types.UnsignedInt listenpriority) {
        this.listenpriority = listenpriority;
    }


    /**
     * Gets the tcpprofilename value for this Authenticationvserver.
     * 
     * @return tcpprofilename
     */
    public java.lang.String getTcpprofilename() {
        return tcpprofilename;
    }


    /**
     * Sets the tcpprofilename value for this Authenticationvserver.
     * 
     * @param tcpprofilename
     */
    public void setTcpprofilename(java.lang.String tcpprofilename) {
        this.tcpprofilename = tcpprofilename;
    }


    /**
     * Gets the httpprofilename value for this Authenticationvserver.
     * 
     * @return httpprofilename
     */
    public java.lang.String getHttpprofilename() {
        return httpprofilename;
    }


    /**
     * Sets the httpprofilename value for this Authenticationvserver.
     * 
     * @param httpprofilename
     */
    public void setHttpprofilename(java.lang.String httpprofilename) {
        this.httpprofilename = httpprofilename;
    }


    /**
     * Gets the comment value for this Authenticationvserver.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Authenticationvserver.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the appflowlog value for this Authenticationvserver.
     * 
     * @return appflowlog
     */
    public java.lang.String getAppflowlog() {
        return appflowlog;
    }


    /**
     * Sets the appflowlog value for this Authenticationvserver.
     * 
     * @param appflowlog
     */
    public void setAppflowlog(java.lang.String appflowlog) {
        this.appflowlog = appflowlog;
    }


    /**
     * Gets the vstype value for this Authenticationvserver.
     * 
     * @return vstype
     */
    public org.apache.axis.types.UnsignedInt getVstype() {
        return vstype;
    }


    /**
     * Sets the vstype value for this Authenticationvserver.
     * 
     * @param vstype
     */
    public void setVstype(org.apache.axis.types.UnsignedInt vstype) {
        this.vstype = vstype;
    }


    /**
     * Gets the ngname value for this Authenticationvserver.
     * 
     * @return ngname
     */
    public java.lang.String getNgname() {
        return ngname;
    }


    /**
     * Sets the ngname value for this Authenticationvserver.
     * 
     * @param ngname
     */
    public void setNgname(java.lang.String ngname) {
        this.ngname = ngname;
    }


    /**
     * Gets the maxloginattempts value for this Authenticationvserver.
     * 
     * @return maxloginattempts
     */
    public org.apache.axis.types.UnsignedInt getMaxloginattempts() {
        return maxloginattempts;
    }


    /**
     * Sets the maxloginattempts value for this Authenticationvserver.
     * 
     * @param maxloginattempts
     */
    public void setMaxloginattempts(org.apache.axis.types.UnsignedInt maxloginattempts) {
        this.maxloginattempts = maxloginattempts;
    }


    /**
     * Gets the failedlogintimeout value for this Authenticationvserver.
     * 
     * @return failedlogintimeout
     */
    public org.apache.axis.types.UnsignedInt getFailedlogintimeout() {
        return failedlogintimeout;
    }


    /**
     * Sets the failedlogintimeout value for this Authenticationvserver.
     * 
     * @param failedlogintimeout
     */
    public void setFailedlogintimeout(org.apache.axis.types.UnsignedInt failedlogintimeout) {
        this.failedlogintimeout = failedlogintimeout;
    }


    /**
     * Gets the secondary value for this Authenticationvserver.
     * 
     * @return secondary
     */
    public boolean isSecondary() {
        return secondary;
    }


    /**
     * Sets the secondary value for this Authenticationvserver.
     * 
     * @param secondary
     */
    public void setSecondary(boolean secondary) {
        this.secondary = secondary;
    }


    /**
     * Gets the groupextraction value for this Authenticationvserver.
     * 
     * @return groupextraction
     */
    public boolean isGroupextraction() {
        return groupextraction;
    }


    /**
     * Sets the groupextraction value for this Authenticationvserver.
     * 
     * @param groupextraction
     */
    public void setGroupextraction(boolean groupextraction) {
        this.groupextraction = groupextraction;
    }


    /**
     * Gets the nslogpolicyname value for this Authenticationvserver.
     * 
     * @return nslogpolicyname
     */
    public java.lang.String[] getNslogpolicyname() {
        return nslogpolicyname;
    }


    /**
     * Sets the nslogpolicyname value for this Authenticationvserver.
     * 
     * @param nslogpolicyname
     */
    public void setNslogpolicyname(java.lang.String[] nslogpolicyname) {
        this.nslogpolicyname = nslogpolicyname;
    }


    /**
     * Gets the nslogpriority value for this Authenticationvserver.
     * 
     * @return nslogpriority
     */
    public org.apache.axis.types.UnsignedInt[] getNslogpriority() {
        return nslogpriority;
    }


    /**
     * Sets the nslogpriority value for this Authenticationvserver.
     * 
     * @param nslogpriority
     */
    public void setNslogpriority(org.apache.axis.types.UnsignedInt[] nslogpriority) {
        this.nslogpriority = nslogpriority;
    }


    /**
     * Gets the syslogpolicyname value for this Authenticationvserver.
     * 
     * @return syslogpolicyname
     */
    public java.lang.String[] getSyslogpolicyname() {
        return syslogpolicyname;
    }


    /**
     * Sets the syslogpolicyname value for this Authenticationvserver.
     * 
     * @param syslogpolicyname
     */
    public void setSyslogpolicyname(java.lang.String[] syslogpolicyname) {
        this.syslogpolicyname = syslogpolicyname;
    }


    /**
     * Gets the syslogpriority value for this Authenticationvserver.
     * 
     * @return syslogpriority
     */
    public org.apache.axis.types.UnsignedInt[] getSyslogpriority() {
        return syslogpriority;
    }


    /**
     * Sets the syslogpriority value for this Authenticationvserver.
     * 
     * @param syslogpriority
     */
    public void setSyslogpriority(org.apache.axis.types.UnsignedInt[] syslogpriority) {
        this.syslogpriority = syslogpriority;
    }


    /**
     * Gets the tmsessionpolicyname value for this Authenticationvserver.
     * 
     * @return tmsessionpolicyname
     */
    public java.lang.String[] getTmsessionpolicyname() {
        return tmsessionpolicyname;
    }


    /**
     * Sets the tmsessionpolicyname value for this Authenticationvserver.
     * 
     * @param tmsessionpolicyname
     */
    public void setTmsessionpolicyname(java.lang.String[] tmsessionpolicyname) {
        this.tmsessionpolicyname = tmsessionpolicyname;
    }


    /**
     * Gets the tmsessionpolicypriority value for this Authenticationvserver.
     * 
     * @return tmsessionpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getTmsessionpolicypriority() {
        return tmsessionpolicypriority;
    }


    /**
     * Sets the tmsessionpolicypriority value for this Authenticationvserver.
     * 
     * @param tmsessionpolicypriority
     */
    public void setTmsessionpolicypriority(org.apache.axis.types.UnsignedInt[] tmsessionpolicypriority) {
        this.tmsessionpolicypriority = tmsessionpolicypriority;
    }


    /**
     * Gets the radiusauthpolicyname value for this Authenticationvserver.
     * 
     * @return radiusauthpolicyname
     */
    public java.lang.String[] getRadiusauthpolicyname() {
        return radiusauthpolicyname;
    }


    /**
     * Sets the radiusauthpolicyname value for this Authenticationvserver.
     * 
     * @param radiusauthpolicyname
     */
    public void setRadiusauthpolicyname(java.lang.String[] radiusauthpolicyname) {
        this.radiusauthpolicyname = radiusauthpolicyname;
    }


    /**
     * Gets the radiusauthpolicypriority value for this Authenticationvserver.
     * 
     * @return radiusauthpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getRadiusauthpolicypriority() {
        return radiusauthpolicypriority;
    }


    /**
     * Sets the radiusauthpolicypriority value for this Authenticationvserver.
     * 
     * @param radiusauthpolicypriority
     */
    public void setRadiusauthpolicypriority(org.apache.axis.types.UnsignedInt[] radiusauthpolicypriority) {
        this.radiusauthpolicypriority = radiusauthpolicypriority;
    }


    /**
     * Gets the radiusauthpolicysecondary value for this Authenticationvserver.
     * 
     * @return radiusauthpolicysecondary
     */
    public boolean[] getRadiusauthpolicysecondary() {
        return radiusauthpolicysecondary;
    }


    /**
     * Sets the radiusauthpolicysecondary value for this Authenticationvserver.
     * 
     * @param radiusauthpolicysecondary
     */
    public void setRadiusauthpolicysecondary(boolean[] radiusauthpolicysecondary) {
        this.radiusauthpolicysecondary = radiusauthpolicysecondary;
    }


    /**
     * Gets the ldapauthpolicyname value for this Authenticationvserver.
     * 
     * @return ldapauthpolicyname
     */
    public java.lang.String[] getLdapauthpolicyname() {
        return ldapauthpolicyname;
    }


    /**
     * Sets the ldapauthpolicyname value for this Authenticationvserver.
     * 
     * @param ldapauthpolicyname
     */
    public void setLdapauthpolicyname(java.lang.String[] ldapauthpolicyname) {
        this.ldapauthpolicyname = ldapauthpolicyname;
    }


    /**
     * Gets the ldapauthpolicypriority value for this Authenticationvserver.
     * 
     * @return ldapauthpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getLdapauthpolicypriority() {
        return ldapauthpolicypriority;
    }


    /**
     * Sets the ldapauthpolicypriority value for this Authenticationvserver.
     * 
     * @param ldapauthpolicypriority
     */
    public void setLdapauthpolicypriority(org.apache.axis.types.UnsignedInt[] ldapauthpolicypriority) {
        this.ldapauthpolicypriority = ldapauthpolicypriority;
    }


    /**
     * Gets the ldapauthpolicysecondary value for this Authenticationvserver.
     * 
     * @return ldapauthpolicysecondary
     */
    public boolean[] getLdapauthpolicysecondary() {
        return ldapauthpolicysecondary;
    }


    /**
     * Sets the ldapauthpolicysecondary value for this Authenticationvserver.
     * 
     * @param ldapauthpolicysecondary
     */
    public void setLdapauthpolicysecondary(boolean[] ldapauthpolicysecondary) {
        this.ldapauthpolicysecondary = ldapauthpolicysecondary;
    }


    /**
     * Gets the ldapauthpolicygroupextraction value for this Authenticationvserver.
     * 
     * @return ldapauthpolicygroupextraction
     */
    public boolean[] getLdapauthpolicygroupextraction() {
        return ldapauthpolicygroupextraction;
    }


    /**
     * Sets the ldapauthpolicygroupextraction value for this Authenticationvserver.
     * 
     * @param ldapauthpolicygroupextraction
     */
    public void setLdapauthpolicygroupextraction(boolean[] ldapauthpolicygroupextraction) {
        this.ldapauthpolicygroupextraction = ldapauthpolicygroupextraction;
    }


    /**
     * Gets the certauthpolicyname value for this Authenticationvserver.
     * 
     * @return certauthpolicyname
     */
    public java.lang.String[] getCertauthpolicyname() {
        return certauthpolicyname;
    }


    /**
     * Sets the certauthpolicyname value for this Authenticationvserver.
     * 
     * @param certauthpolicyname
     */
    public void setCertauthpolicyname(java.lang.String[] certauthpolicyname) {
        this.certauthpolicyname = certauthpolicyname;
    }


    /**
     * Gets the certauthpolicypriority value for this Authenticationvserver.
     * 
     * @return certauthpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getCertauthpolicypriority() {
        return certauthpolicypriority;
    }


    /**
     * Sets the certauthpolicypriority value for this Authenticationvserver.
     * 
     * @param certauthpolicypriority
     */
    public void setCertauthpolicypriority(org.apache.axis.types.UnsignedInt[] certauthpolicypriority) {
        this.certauthpolicypriority = certauthpolicypriority;
    }


    /**
     * Gets the certauthpolicysecondary value for this Authenticationvserver.
     * 
     * @return certauthpolicysecondary
     */
    public boolean[] getCertauthpolicysecondary() {
        return certauthpolicysecondary;
    }


    /**
     * Sets the certauthpolicysecondary value for this Authenticationvserver.
     * 
     * @param certauthpolicysecondary
     */
    public void setCertauthpolicysecondary(boolean[] certauthpolicysecondary) {
        this.certauthpolicysecondary = certauthpolicysecondary;
    }


    /**
     * Gets the tacacsauthpolicyname value for this Authenticationvserver.
     * 
     * @return tacacsauthpolicyname
     */
    public java.lang.String[] getTacacsauthpolicyname() {
        return tacacsauthpolicyname;
    }


    /**
     * Sets the tacacsauthpolicyname value for this Authenticationvserver.
     * 
     * @param tacacsauthpolicyname
     */
    public void setTacacsauthpolicyname(java.lang.String[] tacacsauthpolicyname) {
        this.tacacsauthpolicyname = tacacsauthpolicyname;
    }


    /**
     * Gets the tacacsauthpolicypriority value for this Authenticationvserver.
     * 
     * @return tacacsauthpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getTacacsauthpolicypriority() {
        return tacacsauthpolicypriority;
    }


    /**
     * Sets the tacacsauthpolicypriority value for this Authenticationvserver.
     * 
     * @param tacacsauthpolicypriority
     */
    public void setTacacsauthpolicypriority(org.apache.axis.types.UnsignedInt[] tacacsauthpolicypriority) {
        this.tacacsauthpolicypriority = tacacsauthpolicypriority;
    }


    /**
     * Gets the tacacsauthpolicysecondary value for this Authenticationvserver.
     * 
     * @return tacacsauthpolicysecondary
     */
    public boolean[] getTacacsauthpolicysecondary() {
        return tacacsauthpolicysecondary;
    }


    /**
     * Sets the tacacsauthpolicysecondary value for this Authenticationvserver.
     * 
     * @param tacacsauthpolicysecondary
     */
    public void setTacacsauthpolicysecondary(boolean[] tacacsauthpolicysecondary) {
        this.tacacsauthpolicysecondary = tacacsauthpolicysecondary;
    }


    /**
     * Gets the negauthpolicyname value for this Authenticationvserver.
     * 
     * @return negauthpolicyname
     */
    public java.lang.String[] getNegauthpolicyname() {
        return negauthpolicyname;
    }


    /**
     * Sets the negauthpolicyname value for this Authenticationvserver.
     * 
     * @param negauthpolicyname
     */
    public void setNegauthpolicyname(java.lang.String[] negauthpolicyname) {
        this.negauthpolicyname = negauthpolicyname;
    }


    /**
     * Gets the negauthpolicypriority value for this Authenticationvserver.
     * 
     * @return negauthpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getNegauthpolicypriority() {
        return negauthpolicypriority;
    }


    /**
     * Sets the negauthpolicypriority value for this Authenticationvserver.
     * 
     * @param negauthpolicypriority
     */
    public void setNegauthpolicypriority(org.apache.axis.types.UnsignedInt[] negauthpolicypriority) {
        this.negauthpolicypriority = negauthpolicypriority;
    }


    /**
     * Gets the negauthpolicysecondary value for this Authenticationvserver.
     * 
     * @return negauthpolicysecondary
     */
    public boolean[] getNegauthpolicysecondary() {
        return negauthpolicysecondary;
    }


    /**
     * Sets the negauthpolicysecondary value for this Authenticationvserver.
     * 
     * @param negauthpolicysecondary
     */
    public void setNegauthpolicysecondary(boolean[] negauthpolicysecondary) {
        this.negauthpolicysecondary = negauthpolicysecondary;
    }


    /**
     * Gets the samlauthpolicyname value for this Authenticationvserver.
     * 
     * @return samlauthpolicyname
     */
    public java.lang.String[] getSamlauthpolicyname() {
        return samlauthpolicyname;
    }


    /**
     * Sets the samlauthpolicyname value for this Authenticationvserver.
     * 
     * @param samlauthpolicyname
     */
    public void setSamlauthpolicyname(java.lang.String[] samlauthpolicyname) {
        this.samlauthpolicyname = samlauthpolicyname;
    }


    /**
     * Gets the samlauthpolicypriority value for this Authenticationvserver.
     * 
     * @return samlauthpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getSamlauthpolicypriority() {
        return samlauthpolicypriority;
    }


    /**
     * Sets the samlauthpolicypriority value for this Authenticationvserver.
     * 
     * @param samlauthpolicypriority
     */
    public void setSamlauthpolicypriority(org.apache.axis.types.UnsignedInt[] samlauthpolicypriority) {
        this.samlauthpolicypriority = samlauthpolicypriority;
    }


    /**
     * Gets the samlauthpolicysecondary value for this Authenticationvserver.
     * 
     * @return samlauthpolicysecondary
     */
    public boolean[] getSamlauthpolicysecondary() {
        return samlauthpolicysecondary;
    }


    /**
     * Sets the samlauthpolicysecondary value for this Authenticationvserver.
     * 
     * @param samlauthpolicysecondary
     */
    public void setSamlauthpolicysecondary(boolean[] samlauthpolicysecondary) {
        this.samlauthpolicysecondary = samlauthpolicysecondary;
    }


    /**
     * Gets the localauthpolicyname value for this Authenticationvserver.
     * 
     * @return localauthpolicyname
     */
    public java.lang.String[] getLocalauthpolicyname() {
        return localauthpolicyname;
    }


    /**
     * Sets the localauthpolicyname value for this Authenticationvserver.
     * 
     * @param localauthpolicyname
     */
    public void setLocalauthpolicyname(java.lang.String[] localauthpolicyname) {
        this.localauthpolicyname = localauthpolicyname;
    }


    /**
     * Gets the localauthpolicypriority value for this Authenticationvserver.
     * 
     * @return localauthpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getLocalauthpolicypriority() {
        return localauthpolicypriority;
    }


    /**
     * Sets the localauthpolicypriority value for this Authenticationvserver.
     * 
     * @param localauthpolicypriority
     */
    public void setLocalauthpolicypriority(org.apache.axis.types.UnsignedInt[] localauthpolicypriority) {
        this.localauthpolicypriority = localauthpolicypriority;
    }


    /**
     * Gets the localauthpolicysecondary value for this Authenticationvserver.
     * 
     * @return localauthpolicysecondary
     */
    public boolean[] getLocalauthpolicysecondary() {
        return localauthpolicysecondary;
    }


    /**
     * Sets the localauthpolicysecondary value for this Authenticationvserver.
     * 
     * @param localauthpolicysecondary
     */
    public void setLocalauthpolicysecondary(boolean[] localauthpolicysecondary) {
        this.localauthpolicysecondary = localauthpolicysecondary;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Authenticationvserver)) return false;
        Authenticationvserver other = (Authenticationvserver) obj;
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
            ((this.curaaausers==null && other.getCuraaausers()==null) || 
             (this.curaaausers!=null &&
              this.curaaausers.equals(other.getCuraaausers()))) &&
            ((this.authenticationdomain==null && other.getAuthenticationdomain()==null) || 
             (this.authenticationdomain!=null &&
              this.authenticationdomain.equals(other.getAuthenticationdomain()))) &&
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
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.downstateflush==null && other.getDownstateflush()==null) || 
             (this.downstateflush!=null &&
              this.downstateflush.equals(other.getDownstateflush()))) &&
            ((this.acttype==null && other.getActtype()==null) || 
             (this.acttype!=null &&
              java.util.Arrays.equals(this.acttype, other.getActtype()))) &&
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
            ((this.vstype==null && other.getVstype()==null) || 
             (this.vstype!=null &&
              this.vstype.equals(other.getVstype()))) &&
            ((this.ngname==null && other.getNgname()==null) || 
             (this.ngname!=null &&
              this.ngname.equals(other.getNgname()))) &&
            ((this.maxloginattempts==null && other.getMaxloginattempts()==null) || 
             (this.maxloginattempts!=null &&
              this.maxloginattempts.equals(other.getMaxloginattempts()))) &&
            ((this.failedlogintimeout==null && other.getFailedlogintimeout()==null) || 
             (this.failedlogintimeout!=null &&
              this.failedlogintimeout.equals(other.getFailedlogintimeout()))) &&
            this.secondary == other.isSecondary() &&
            this.groupextraction == other.isGroupextraction() &&
            ((this.nslogpolicyname==null && other.getNslogpolicyname()==null) || 
             (this.nslogpolicyname!=null &&
              java.util.Arrays.equals(this.nslogpolicyname, other.getNslogpolicyname()))) &&
            ((this.nslogpriority==null && other.getNslogpriority()==null) || 
             (this.nslogpriority!=null &&
              java.util.Arrays.equals(this.nslogpriority, other.getNslogpriority()))) &&
            ((this.syslogpolicyname==null && other.getSyslogpolicyname()==null) || 
             (this.syslogpolicyname!=null &&
              java.util.Arrays.equals(this.syslogpolicyname, other.getSyslogpolicyname()))) &&
            ((this.syslogpriority==null && other.getSyslogpriority()==null) || 
             (this.syslogpriority!=null &&
              java.util.Arrays.equals(this.syslogpriority, other.getSyslogpriority()))) &&
            ((this.tmsessionpolicyname==null && other.getTmsessionpolicyname()==null) || 
             (this.tmsessionpolicyname!=null &&
              java.util.Arrays.equals(this.tmsessionpolicyname, other.getTmsessionpolicyname()))) &&
            ((this.tmsessionpolicypriority==null && other.getTmsessionpolicypriority()==null) || 
             (this.tmsessionpolicypriority!=null &&
              java.util.Arrays.equals(this.tmsessionpolicypriority, other.getTmsessionpolicypriority()))) &&
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
            ((this.localauthpolicyname==null && other.getLocalauthpolicyname()==null) || 
             (this.localauthpolicyname!=null &&
              java.util.Arrays.equals(this.localauthpolicyname, other.getLocalauthpolicyname()))) &&
            ((this.localauthpolicypriority==null && other.getLocalauthpolicypriority()==null) || 
             (this.localauthpolicypriority!=null &&
              java.util.Arrays.equals(this.localauthpolicypriority, other.getLocalauthpolicypriority()))) &&
            ((this.localauthpolicysecondary==null && other.getLocalauthpolicysecondary()==null) || 
             (this.localauthpolicysecondary!=null &&
              java.util.Arrays.equals(this.localauthpolicysecondary, other.getLocalauthpolicysecondary())));
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
        if (getCuraaausers() != null) {
            _hashCode += getCuraaausers().hashCode();
        }
        if (getAuthenticationdomain() != null) {
            _hashCode += getAuthenticationdomain().hashCode();
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
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getDownstateflush() != null) {
            _hashCode += getDownstateflush().hashCode();
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
        if (getVstype() != null) {
            _hashCode += getVstype().hashCode();
        }
        if (getNgname() != null) {
            _hashCode += getNgname().hashCode();
        }
        if (getMaxloginattempts() != null) {
            _hashCode += getMaxloginattempts().hashCode();
        }
        if (getFailedlogintimeout() != null) {
            _hashCode += getFailedlogintimeout().hashCode();
        }
        _hashCode += (isSecondary() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isGroupextraction() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        if (getTmsessionpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTmsessionpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTmsessionpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTmsessionpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTmsessionpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTmsessionpolicypriority(), i);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Authenticationvserver.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "authenticationvserver"));
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
        elemField.setFieldName("curaaausers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curaaausers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationdomain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authenticationdomain"));
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
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downstateflush");
        elemField.setXmlName(new javax.xml.namespace.QName("", "downstateflush"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acttype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acttype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
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
        elemField.setFieldName("vstype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vstype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ngname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ngname"));
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
        elemField.setFieldName("tmsessionpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tmsessionpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmsessionpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tmsessionpolicypriority"));
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
