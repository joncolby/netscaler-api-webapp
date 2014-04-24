/**
 * Crvserver.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Crvserver  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String ipaddress;

    private java.lang.String ipaddress2;

    private java.lang.String value;

    private org.apache.axis.types.UnsignedInt port;

    private org.apache.axis.types.UnsignedInt range;

    private java.lang.String servicetype;

    private java.lang.String ngname;

    private java.lang.String type;

    private java.lang.String state;

    private int status;

    private java.lang.String cachetype;

    private java.lang.String redirect;

    private java.lang.String onpolicymatch;

    private java.lang.String precedence;

    private java.lang.String redirecturl;

    private java.lang.String authentication;

    private java.lang.String homepage;

    private java.lang.String dnsvservername;

    private java.lang.String domain;

    private java.lang.String rule;

    private java.lang.String policyname;

    private org.apache.axis.types.UnsignedInt[] hits;

    private java.lang.String servicename;

    private org.apache.axis.types.UnsignedInt weight;

    private java.lang.String cachevserver;

    private java.lang.String targetvserver;

    private java.lang.String backupvserver;

    private org.apache.axis.types.UnsignedInt priority;

    private org.apache.axis.types.UnsignedInt clttimeout;

    private java.lang.String somethod;

    private java.lang.String sopersistence;

    private org.apache.axis.types.UnsignedInt sopersistencetimeout;

    private org.apache.axis.types.UnsignedInt sothreshold;

    private java.lang.String reuse;

    private java.lang.String arp;

    private java.lang.String destinationvserver;

    private java.lang.String via;

    private java.lang.String downstateflush;

    private java.lang.String disableprimaryondown;

    private java.lang.String l2Conn;

    private java.lang.String backendssl;

    private java.lang.String comment;

    private java.lang.String listenpolicy;

    private org.apache.axis.types.UnsignedInt listenpriority;

    private java.lang.String tcpprofilename;

    private java.lang.String httpprofilename;

    private java.lang.String srcipexpr;

    private java.lang.String originusip;

    private java.lang.String useportrange;

    private java.lang.String appflowlog;

    private java.lang.String netprofile;

    private java.lang.String icmpvsrresponse;

    private java.lang.String lbvserver;

    private java.lang.String[] cswpolicyname;

    private java.lang.String[] cswtargetserver;

    private org.apache.axis.types.UnsignedInt[] cswpriority;

    private org.apache.axis.types.UnsignedInt[] cswpolicyhits;

    private java.lang.String[] crdpolicyname;

    private org.apache.axis.types.UnsignedInt[] crdpolicypriority;

    private org.apache.axis.types.UnsignedInt[] crdpolicyhits;

    private java.lang.String[] maptable;

    private java.lang.String[] mttargetserver;

    private java.lang.String[] filterpolicyname;

    private org.apache.axis.types.UnsignedInt[] filterpolicypriority;

    private java.lang.String[] cmppolicyname;

    private org.apache.axis.types.UnsignedInt[] cmppolicypriority;

    private java.lang.String[] defaultlb;

    public Crvserver() {
    }

    public Crvserver(
           java.lang.String name,
           java.lang.String ipaddress,
           java.lang.String ipaddress2,
           java.lang.String value,
           org.apache.axis.types.UnsignedInt port,
           org.apache.axis.types.UnsignedInt range,
           java.lang.String servicetype,
           java.lang.String ngname,
           java.lang.String type,
           java.lang.String state,
           int status,
           java.lang.String cachetype,
           java.lang.String redirect,
           java.lang.String onpolicymatch,
           java.lang.String precedence,
           java.lang.String redirecturl,
           java.lang.String authentication,
           java.lang.String homepage,
           java.lang.String dnsvservername,
           java.lang.String domain,
           java.lang.String rule,
           java.lang.String policyname,
           org.apache.axis.types.UnsignedInt[] hits,
           java.lang.String servicename,
           org.apache.axis.types.UnsignedInt weight,
           java.lang.String cachevserver,
           java.lang.String targetvserver,
           java.lang.String backupvserver,
           org.apache.axis.types.UnsignedInt priority,
           org.apache.axis.types.UnsignedInt clttimeout,
           java.lang.String somethod,
           java.lang.String sopersistence,
           org.apache.axis.types.UnsignedInt sopersistencetimeout,
           org.apache.axis.types.UnsignedInt sothreshold,
           java.lang.String reuse,
           java.lang.String arp,
           java.lang.String destinationvserver,
           java.lang.String via,
           java.lang.String downstateflush,
           java.lang.String disableprimaryondown,
           java.lang.String l2Conn,
           java.lang.String backendssl,
           java.lang.String comment,
           java.lang.String listenpolicy,
           org.apache.axis.types.UnsignedInt listenpriority,
           java.lang.String tcpprofilename,
           java.lang.String httpprofilename,
           java.lang.String srcipexpr,
           java.lang.String originusip,
           java.lang.String useportrange,
           java.lang.String appflowlog,
           java.lang.String netprofile,
           java.lang.String icmpvsrresponse,
           java.lang.String lbvserver,
           java.lang.String[] cswpolicyname,
           java.lang.String[] cswtargetserver,
           org.apache.axis.types.UnsignedInt[] cswpriority,
           org.apache.axis.types.UnsignedInt[] cswpolicyhits,
           java.lang.String[] crdpolicyname,
           org.apache.axis.types.UnsignedInt[] crdpolicypriority,
           org.apache.axis.types.UnsignedInt[] crdpolicyhits,
           java.lang.String[] maptable,
           java.lang.String[] mttargetserver,
           java.lang.String[] filterpolicyname,
           org.apache.axis.types.UnsignedInt[] filterpolicypriority,
           java.lang.String[] cmppolicyname,
           org.apache.axis.types.UnsignedInt[] cmppolicypriority,
           java.lang.String[] defaultlb) {
           this.name = name;
           this.ipaddress = ipaddress;
           this.ipaddress2 = ipaddress2;
           this.value = value;
           this.port = port;
           this.range = range;
           this.servicetype = servicetype;
           this.ngname = ngname;
           this.type = type;
           this.state = state;
           this.status = status;
           this.cachetype = cachetype;
           this.redirect = redirect;
           this.onpolicymatch = onpolicymatch;
           this.precedence = precedence;
           this.redirecturl = redirecturl;
           this.authentication = authentication;
           this.homepage = homepage;
           this.dnsvservername = dnsvservername;
           this.domain = domain;
           this.rule = rule;
           this.policyname = policyname;
           this.hits = hits;
           this.servicename = servicename;
           this.weight = weight;
           this.cachevserver = cachevserver;
           this.targetvserver = targetvserver;
           this.backupvserver = backupvserver;
           this.priority = priority;
           this.clttimeout = clttimeout;
           this.somethod = somethod;
           this.sopersistence = sopersistence;
           this.sopersistencetimeout = sopersistencetimeout;
           this.sothreshold = sothreshold;
           this.reuse = reuse;
           this.arp = arp;
           this.destinationvserver = destinationvserver;
           this.via = via;
           this.downstateflush = downstateflush;
           this.disableprimaryondown = disableprimaryondown;
           this.l2Conn = l2Conn;
           this.backendssl = backendssl;
           this.comment = comment;
           this.listenpolicy = listenpolicy;
           this.listenpriority = listenpriority;
           this.tcpprofilename = tcpprofilename;
           this.httpprofilename = httpprofilename;
           this.srcipexpr = srcipexpr;
           this.originusip = originusip;
           this.useportrange = useportrange;
           this.appflowlog = appflowlog;
           this.netprofile = netprofile;
           this.icmpvsrresponse = icmpvsrresponse;
           this.lbvserver = lbvserver;
           this.cswpolicyname = cswpolicyname;
           this.cswtargetserver = cswtargetserver;
           this.cswpriority = cswpriority;
           this.cswpolicyhits = cswpolicyhits;
           this.crdpolicyname = crdpolicyname;
           this.crdpolicypriority = crdpolicypriority;
           this.crdpolicyhits = crdpolicyhits;
           this.maptable = maptable;
           this.mttargetserver = mttargetserver;
           this.filterpolicyname = filterpolicyname;
           this.filterpolicypriority = filterpolicypriority;
           this.cmppolicyname = cmppolicyname;
           this.cmppolicypriority = cmppolicypriority;
           this.defaultlb = defaultlb;
    }


    /**
     * Gets the name value for this Crvserver.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Crvserver.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the ipaddress value for this Crvserver.
     * 
     * @return ipaddress
     */
    public java.lang.String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Crvserver.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the ipaddress2 value for this Crvserver.
     * 
     * @return ipaddress2
     */
    public java.lang.String getIpaddress2() {
        return ipaddress2;
    }


    /**
     * Sets the ipaddress2 value for this Crvserver.
     * 
     * @param ipaddress2
     */
    public void setIpaddress2(java.lang.String ipaddress2) {
        this.ipaddress2 = ipaddress2;
    }


    /**
     * Gets the value value for this Crvserver.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this Crvserver.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the port value for this Crvserver.
     * 
     * @return port
     */
    public org.apache.axis.types.UnsignedInt getPort() {
        return port;
    }


    /**
     * Sets the port value for this Crvserver.
     * 
     * @param port
     */
    public void setPort(org.apache.axis.types.UnsignedInt port) {
        this.port = port;
    }


    /**
     * Gets the range value for this Crvserver.
     * 
     * @return range
     */
    public org.apache.axis.types.UnsignedInt getRange() {
        return range;
    }


    /**
     * Sets the range value for this Crvserver.
     * 
     * @param range
     */
    public void setRange(org.apache.axis.types.UnsignedInt range) {
        this.range = range;
    }


    /**
     * Gets the servicetype value for this Crvserver.
     * 
     * @return servicetype
     */
    public java.lang.String getServicetype() {
        return servicetype;
    }


    /**
     * Sets the servicetype value for this Crvserver.
     * 
     * @param servicetype
     */
    public void setServicetype(java.lang.String servicetype) {
        this.servicetype = servicetype;
    }


    /**
     * Gets the ngname value for this Crvserver.
     * 
     * @return ngname
     */
    public java.lang.String getNgname() {
        return ngname;
    }


    /**
     * Sets the ngname value for this Crvserver.
     * 
     * @param ngname
     */
    public void setNgname(java.lang.String ngname) {
        this.ngname = ngname;
    }


    /**
     * Gets the type value for this Crvserver.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Crvserver.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the state value for this Crvserver.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Crvserver.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the status value for this Crvserver.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Crvserver.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the cachetype value for this Crvserver.
     * 
     * @return cachetype
     */
    public java.lang.String getCachetype() {
        return cachetype;
    }


    /**
     * Sets the cachetype value for this Crvserver.
     * 
     * @param cachetype
     */
    public void setCachetype(java.lang.String cachetype) {
        this.cachetype = cachetype;
    }


    /**
     * Gets the redirect value for this Crvserver.
     * 
     * @return redirect
     */
    public java.lang.String getRedirect() {
        return redirect;
    }


    /**
     * Sets the redirect value for this Crvserver.
     * 
     * @param redirect
     */
    public void setRedirect(java.lang.String redirect) {
        this.redirect = redirect;
    }


    /**
     * Gets the onpolicymatch value for this Crvserver.
     * 
     * @return onpolicymatch
     */
    public java.lang.String getOnpolicymatch() {
        return onpolicymatch;
    }


    /**
     * Sets the onpolicymatch value for this Crvserver.
     * 
     * @param onpolicymatch
     */
    public void setOnpolicymatch(java.lang.String onpolicymatch) {
        this.onpolicymatch = onpolicymatch;
    }


    /**
     * Gets the precedence value for this Crvserver.
     * 
     * @return precedence
     */
    public java.lang.String getPrecedence() {
        return precedence;
    }


    /**
     * Sets the precedence value for this Crvserver.
     * 
     * @param precedence
     */
    public void setPrecedence(java.lang.String precedence) {
        this.precedence = precedence;
    }


    /**
     * Gets the redirecturl value for this Crvserver.
     * 
     * @return redirecturl
     */
    public java.lang.String getRedirecturl() {
        return redirecturl;
    }


    /**
     * Sets the redirecturl value for this Crvserver.
     * 
     * @param redirecturl
     */
    public void setRedirecturl(java.lang.String redirecturl) {
        this.redirecturl = redirecturl;
    }


    /**
     * Gets the authentication value for this Crvserver.
     * 
     * @return authentication
     */
    public java.lang.String getAuthentication() {
        return authentication;
    }


    /**
     * Sets the authentication value for this Crvserver.
     * 
     * @param authentication
     */
    public void setAuthentication(java.lang.String authentication) {
        this.authentication = authentication;
    }


    /**
     * Gets the homepage value for this Crvserver.
     * 
     * @return homepage
     */
    public java.lang.String getHomepage() {
        return homepage;
    }


    /**
     * Sets the homepage value for this Crvserver.
     * 
     * @param homepage
     */
    public void setHomepage(java.lang.String homepage) {
        this.homepage = homepage;
    }


    /**
     * Gets the dnsvservername value for this Crvserver.
     * 
     * @return dnsvservername
     */
    public java.lang.String getDnsvservername() {
        return dnsvservername;
    }


    /**
     * Sets the dnsvservername value for this Crvserver.
     * 
     * @param dnsvservername
     */
    public void setDnsvservername(java.lang.String dnsvservername) {
        this.dnsvservername = dnsvservername;
    }


    /**
     * Gets the domain value for this Crvserver.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this Crvserver.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the rule value for this Crvserver.
     * 
     * @return rule
     */
    public java.lang.String getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this Crvserver.
     * 
     * @param rule
     */
    public void setRule(java.lang.String rule) {
        this.rule = rule;
    }


    /**
     * Gets the policyname value for this Crvserver.
     * 
     * @return policyname
     */
    public java.lang.String getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Crvserver.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the hits value for this Crvserver.
     * 
     * @return hits
     */
    public org.apache.axis.types.UnsignedInt[] getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this Crvserver.
     * 
     * @param hits
     */
    public void setHits(org.apache.axis.types.UnsignedInt[] hits) {
        this.hits = hits;
    }


    /**
     * Gets the servicename value for this Crvserver.
     * 
     * @return servicename
     */
    public java.lang.String getServicename() {
        return servicename;
    }


    /**
     * Sets the servicename value for this Crvserver.
     * 
     * @param servicename
     */
    public void setServicename(java.lang.String servicename) {
        this.servicename = servicename;
    }


    /**
     * Gets the weight value for this Crvserver.
     * 
     * @return weight
     */
    public org.apache.axis.types.UnsignedInt getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this Crvserver.
     * 
     * @param weight
     */
    public void setWeight(org.apache.axis.types.UnsignedInt weight) {
        this.weight = weight;
    }


    /**
     * Gets the cachevserver value for this Crvserver.
     * 
     * @return cachevserver
     */
    public java.lang.String getCachevserver() {
        return cachevserver;
    }


    /**
     * Sets the cachevserver value for this Crvserver.
     * 
     * @param cachevserver
     */
    public void setCachevserver(java.lang.String cachevserver) {
        this.cachevserver = cachevserver;
    }


    /**
     * Gets the targetvserver value for this Crvserver.
     * 
     * @return targetvserver
     */
    public java.lang.String getTargetvserver() {
        return targetvserver;
    }


    /**
     * Sets the targetvserver value for this Crvserver.
     * 
     * @param targetvserver
     */
    public void setTargetvserver(java.lang.String targetvserver) {
        this.targetvserver = targetvserver;
    }


    /**
     * Gets the backupvserver value for this Crvserver.
     * 
     * @return backupvserver
     */
    public java.lang.String getBackupvserver() {
        return backupvserver;
    }


    /**
     * Sets the backupvserver value for this Crvserver.
     * 
     * @param backupvserver
     */
    public void setBackupvserver(java.lang.String backupvserver) {
        this.backupvserver = backupvserver;
    }


    /**
     * Gets the priority value for this Crvserver.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Crvserver.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the clttimeout value for this Crvserver.
     * 
     * @return clttimeout
     */
    public org.apache.axis.types.UnsignedInt getClttimeout() {
        return clttimeout;
    }


    /**
     * Sets the clttimeout value for this Crvserver.
     * 
     * @param clttimeout
     */
    public void setClttimeout(org.apache.axis.types.UnsignedInt clttimeout) {
        this.clttimeout = clttimeout;
    }


    /**
     * Gets the somethod value for this Crvserver.
     * 
     * @return somethod
     */
    public java.lang.String getSomethod() {
        return somethod;
    }


    /**
     * Sets the somethod value for this Crvserver.
     * 
     * @param somethod
     */
    public void setSomethod(java.lang.String somethod) {
        this.somethod = somethod;
    }


    /**
     * Gets the sopersistence value for this Crvserver.
     * 
     * @return sopersistence
     */
    public java.lang.String getSopersistence() {
        return sopersistence;
    }


    /**
     * Sets the sopersistence value for this Crvserver.
     * 
     * @param sopersistence
     */
    public void setSopersistence(java.lang.String sopersistence) {
        this.sopersistence = sopersistence;
    }


    /**
     * Gets the sopersistencetimeout value for this Crvserver.
     * 
     * @return sopersistencetimeout
     */
    public org.apache.axis.types.UnsignedInt getSopersistencetimeout() {
        return sopersistencetimeout;
    }


    /**
     * Sets the sopersistencetimeout value for this Crvserver.
     * 
     * @param sopersistencetimeout
     */
    public void setSopersistencetimeout(org.apache.axis.types.UnsignedInt sopersistencetimeout) {
        this.sopersistencetimeout = sopersistencetimeout;
    }


    /**
     * Gets the sothreshold value for this Crvserver.
     * 
     * @return sothreshold
     */
    public org.apache.axis.types.UnsignedInt getSothreshold() {
        return sothreshold;
    }


    /**
     * Sets the sothreshold value for this Crvserver.
     * 
     * @param sothreshold
     */
    public void setSothreshold(org.apache.axis.types.UnsignedInt sothreshold) {
        this.sothreshold = sothreshold;
    }


    /**
     * Gets the reuse value for this Crvserver.
     * 
     * @return reuse
     */
    public java.lang.String getReuse() {
        return reuse;
    }


    /**
     * Sets the reuse value for this Crvserver.
     * 
     * @param reuse
     */
    public void setReuse(java.lang.String reuse) {
        this.reuse = reuse;
    }


    /**
     * Gets the arp value for this Crvserver.
     * 
     * @return arp
     */
    public java.lang.String getArp() {
        return arp;
    }


    /**
     * Sets the arp value for this Crvserver.
     * 
     * @param arp
     */
    public void setArp(java.lang.String arp) {
        this.arp = arp;
    }


    /**
     * Gets the destinationvserver value for this Crvserver.
     * 
     * @return destinationvserver
     */
    public java.lang.String getDestinationvserver() {
        return destinationvserver;
    }


    /**
     * Sets the destinationvserver value for this Crvserver.
     * 
     * @param destinationvserver
     */
    public void setDestinationvserver(java.lang.String destinationvserver) {
        this.destinationvserver = destinationvserver;
    }


    /**
     * Gets the via value for this Crvserver.
     * 
     * @return via
     */
    public java.lang.String getVia() {
        return via;
    }


    /**
     * Sets the via value for this Crvserver.
     * 
     * @param via
     */
    public void setVia(java.lang.String via) {
        this.via = via;
    }


    /**
     * Gets the downstateflush value for this Crvserver.
     * 
     * @return downstateflush
     */
    public java.lang.String getDownstateflush() {
        return downstateflush;
    }


    /**
     * Sets the downstateflush value for this Crvserver.
     * 
     * @param downstateflush
     */
    public void setDownstateflush(java.lang.String downstateflush) {
        this.downstateflush = downstateflush;
    }


    /**
     * Gets the disableprimaryondown value for this Crvserver.
     * 
     * @return disableprimaryondown
     */
    public java.lang.String getDisableprimaryondown() {
        return disableprimaryondown;
    }


    /**
     * Sets the disableprimaryondown value for this Crvserver.
     * 
     * @param disableprimaryondown
     */
    public void setDisableprimaryondown(java.lang.String disableprimaryondown) {
        this.disableprimaryondown = disableprimaryondown;
    }


    /**
     * Gets the l2Conn value for this Crvserver.
     * 
     * @return l2Conn
     */
    public java.lang.String getL2Conn() {
        return l2Conn;
    }


    /**
     * Sets the l2Conn value for this Crvserver.
     * 
     * @param l2Conn
     */
    public void setL2Conn(java.lang.String l2Conn) {
        this.l2Conn = l2Conn;
    }


    /**
     * Gets the backendssl value for this Crvserver.
     * 
     * @return backendssl
     */
    public java.lang.String getBackendssl() {
        return backendssl;
    }


    /**
     * Sets the backendssl value for this Crvserver.
     * 
     * @param backendssl
     */
    public void setBackendssl(java.lang.String backendssl) {
        this.backendssl = backendssl;
    }


    /**
     * Gets the comment value for this Crvserver.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Crvserver.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the listenpolicy value for this Crvserver.
     * 
     * @return listenpolicy
     */
    public java.lang.String getListenpolicy() {
        return listenpolicy;
    }


    /**
     * Sets the listenpolicy value for this Crvserver.
     * 
     * @param listenpolicy
     */
    public void setListenpolicy(java.lang.String listenpolicy) {
        this.listenpolicy = listenpolicy;
    }


    /**
     * Gets the listenpriority value for this Crvserver.
     * 
     * @return listenpriority
     */
    public org.apache.axis.types.UnsignedInt getListenpriority() {
        return listenpriority;
    }


    /**
     * Sets the listenpriority value for this Crvserver.
     * 
     * @param listenpriority
     */
    public void setListenpriority(org.apache.axis.types.UnsignedInt listenpriority) {
        this.listenpriority = listenpriority;
    }


    /**
     * Gets the tcpprofilename value for this Crvserver.
     * 
     * @return tcpprofilename
     */
    public java.lang.String getTcpprofilename() {
        return tcpprofilename;
    }


    /**
     * Sets the tcpprofilename value for this Crvserver.
     * 
     * @param tcpprofilename
     */
    public void setTcpprofilename(java.lang.String tcpprofilename) {
        this.tcpprofilename = tcpprofilename;
    }


    /**
     * Gets the httpprofilename value for this Crvserver.
     * 
     * @return httpprofilename
     */
    public java.lang.String getHttpprofilename() {
        return httpprofilename;
    }


    /**
     * Sets the httpprofilename value for this Crvserver.
     * 
     * @param httpprofilename
     */
    public void setHttpprofilename(java.lang.String httpprofilename) {
        this.httpprofilename = httpprofilename;
    }


    /**
     * Gets the srcipexpr value for this Crvserver.
     * 
     * @return srcipexpr
     */
    public java.lang.String getSrcipexpr() {
        return srcipexpr;
    }


    /**
     * Sets the srcipexpr value for this Crvserver.
     * 
     * @param srcipexpr
     */
    public void setSrcipexpr(java.lang.String srcipexpr) {
        this.srcipexpr = srcipexpr;
    }


    /**
     * Gets the originusip value for this Crvserver.
     * 
     * @return originusip
     */
    public java.lang.String getOriginusip() {
        return originusip;
    }


    /**
     * Sets the originusip value for this Crvserver.
     * 
     * @param originusip
     */
    public void setOriginusip(java.lang.String originusip) {
        this.originusip = originusip;
    }


    /**
     * Gets the useportrange value for this Crvserver.
     * 
     * @return useportrange
     */
    public java.lang.String getUseportrange() {
        return useportrange;
    }


    /**
     * Sets the useportrange value for this Crvserver.
     * 
     * @param useportrange
     */
    public void setUseportrange(java.lang.String useportrange) {
        this.useportrange = useportrange;
    }


    /**
     * Gets the appflowlog value for this Crvserver.
     * 
     * @return appflowlog
     */
    public java.lang.String getAppflowlog() {
        return appflowlog;
    }


    /**
     * Sets the appflowlog value for this Crvserver.
     * 
     * @param appflowlog
     */
    public void setAppflowlog(java.lang.String appflowlog) {
        this.appflowlog = appflowlog;
    }


    /**
     * Gets the netprofile value for this Crvserver.
     * 
     * @return netprofile
     */
    public java.lang.String getNetprofile() {
        return netprofile;
    }


    /**
     * Sets the netprofile value for this Crvserver.
     * 
     * @param netprofile
     */
    public void setNetprofile(java.lang.String netprofile) {
        this.netprofile = netprofile;
    }


    /**
     * Gets the icmpvsrresponse value for this Crvserver.
     * 
     * @return icmpvsrresponse
     */
    public java.lang.String getIcmpvsrresponse() {
        return icmpvsrresponse;
    }


    /**
     * Sets the icmpvsrresponse value for this Crvserver.
     * 
     * @param icmpvsrresponse
     */
    public void setIcmpvsrresponse(java.lang.String icmpvsrresponse) {
        this.icmpvsrresponse = icmpvsrresponse;
    }


    /**
     * Gets the lbvserver value for this Crvserver.
     * 
     * @return lbvserver
     */
    public java.lang.String getLbvserver() {
        return lbvserver;
    }


    /**
     * Sets the lbvserver value for this Crvserver.
     * 
     * @param lbvserver
     */
    public void setLbvserver(java.lang.String lbvserver) {
        this.lbvserver = lbvserver;
    }


    /**
     * Gets the cswpolicyname value for this Crvserver.
     * 
     * @return cswpolicyname
     */
    public java.lang.String[] getCswpolicyname() {
        return cswpolicyname;
    }


    /**
     * Sets the cswpolicyname value for this Crvserver.
     * 
     * @param cswpolicyname
     */
    public void setCswpolicyname(java.lang.String[] cswpolicyname) {
        this.cswpolicyname = cswpolicyname;
    }


    /**
     * Gets the cswtargetserver value for this Crvserver.
     * 
     * @return cswtargetserver
     */
    public java.lang.String[] getCswtargetserver() {
        return cswtargetserver;
    }


    /**
     * Sets the cswtargetserver value for this Crvserver.
     * 
     * @param cswtargetserver
     */
    public void setCswtargetserver(java.lang.String[] cswtargetserver) {
        this.cswtargetserver = cswtargetserver;
    }


    /**
     * Gets the cswpriority value for this Crvserver.
     * 
     * @return cswpriority
     */
    public org.apache.axis.types.UnsignedInt[] getCswpriority() {
        return cswpriority;
    }


    /**
     * Sets the cswpriority value for this Crvserver.
     * 
     * @param cswpriority
     */
    public void setCswpriority(org.apache.axis.types.UnsignedInt[] cswpriority) {
        this.cswpriority = cswpriority;
    }


    /**
     * Gets the cswpolicyhits value for this Crvserver.
     * 
     * @return cswpolicyhits
     */
    public org.apache.axis.types.UnsignedInt[] getCswpolicyhits() {
        return cswpolicyhits;
    }


    /**
     * Sets the cswpolicyhits value for this Crvserver.
     * 
     * @param cswpolicyhits
     */
    public void setCswpolicyhits(org.apache.axis.types.UnsignedInt[] cswpolicyhits) {
        this.cswpolicyhits = cswpolicyhits;
    }


    /**
     * Gets the crdpolicyname value for this Crvserver.
     * 
     * @return crdpolicyname
     */
    public java.lang.String[] getCrdpolicyname() {
        return crdpolicyname;
    }


    /**
     * Sets the crdpolicyname value for this Crvserver.
     * 
     * @param crdpolicyname
     */
    public void setCrdpolicyname(java.lang.String[] crdpolicyname) {
        this.crdpolicyname = crdpolicyname;
    }


    /**
     * Gets the crdpolicypriority value for this Crvserver.
     * 
     * @return crdpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getCrdpolicypriority() {
        return crdpolicypriority;
    }


    /**
     * Sets the crdpolicypriority value for this Crvserver.
     * 
     * @param crdpolicypriority
     */
    public void setCrdpolicypriority(org.apache.axis.types.UnsignedInt[] crdpolicypriority) {
        this.crdpolicypriority = crdpolicypriority;
    }


    /**
     * Gets the crdpolicyhits value for this Crvserver.
     * 
     * @return crdpolicyhits
     */
    public org.apache.axis.types.UnsignedInt[] getCrdpolicyhits() {
        return crdpolicyhits;
    }


    /**
     * Sets the crdpolicyhits value for this Crvserver.
     * 
     * @param crdpolicyhits
     */
    public void setCrdpolicyhits(org.apache.axis.types.UnsignedInt[] crdpolicyhits) {
        this.crdpolicyhits = crdpolicyhits;
    }


    /**
     * Gets the maptable value for this Crvserver.
     * 
     * @return maptable
     */
    public java.lang.String[] getMaptable() {
        return maptable;
    }


    /**
     * Sets the maptable value for this Crvserver.
     * 
     * @param maptable
     */
    public void setMaptable(java.lang.String[] maptable) {
        this.maptable = maptable;
    }


    /**
     * Gets the mttargetserver value for this Crvserver.
     * 
     * @return mttargetserver
     */
    public java.lang.String[] getMttargetserver() {
        return mttargetserver;
    }


    /**
     * Sets the mttargetserver value for this Crvserver.
     * 
     * @param mttargetserver
     */
    public void setMttargetserver(java.lang.String[] mttargetserver) {
        this.mttargetserver = mttargetserver;
    }


    /**
     * Gets the filterpolicyname value for this Crvserver.
     * 
     * @return filterpolicyname
     */
    public java.lang.String[] getFilterpolicyname() {
        return filterpolicyname;
    }


    /**
     * Sets the filterpolicyname value for this Crvserver.
     * 
     * @param filterpolicyname
     */
    public void setFilterpolicyname(java.lang.String[] filterpolicyname) {
        this.filterpolicyname = filterpolicyname;
    }


    /**
     * Gets the filterpolicypriority value for this Crvserver.
     * 
     * @return filterpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getFilterpolicypriority() {
        return filterpolicypriority;
    }


    /**
     * Sets the filterpolicypriority value for this Crvserver.
     * 
     * @param filterpolicypriority
     */
    public void setFilterpolicypriority(org.apache.axis.types.UnsignedInt[] filterpolicypriority) {
        this.filterpolicypriority = filterpolicypriority;
    }


    /**
     * Gets the cmppolicyname value for this Crvserver.
     * 
     * @return cmppolicyname
     */
    public java.lang.String[] getCmppolicyname() {
        return cmppolicyname;
    }


    /**
     * Sets the cmppolicyname value for this Crvserver.
     * 
     * @param cmppolicyname
     */
    public void setCmppolicyname(java.lang.String[] cmppolicyname) {
        this.cmppolicyname = cmppolicyname;
    }


    /**
     * Gets the cmppolicypriority value for this Crvserver.
     * 
     * @return cmppolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getCmppolicypriority() {
        return cmppolicypriority;
    }


    /**
     * Sets the cmppolicypriority value for this Crvserver.
     * 
     * @param cmppolicypriority
     */
    public void setCmppolicypriority(org.apache.axis.types.UnsignedInt[] cmppolicypriority) {
        this.cmppolicypriority = cmppolicypriority;
    }


    /**
     * Gets the defaultlb value for this Crvserver.
     * 
     * @return defaultlb
     */
    public java.lang.String[] getDefaultlb() {
        return defaultlb;
    }


    /**
     * Sets the defaultlb value for this Crvserver.
     * 
     * @param defaultlb
     */
    public void setDefaultlb(java.lang.String[] defaultlb) {
        this.defaultlb = defaultlb;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Crvserver)) return false;
        Crvserver other = (Crvserver) obj;
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
            ((this.ngname==null && other.getNgname()==null) || 
             (this.ngname!=null &&
              this.ngname.equals(other.getNgname()))) &&
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
            ((this.onpolicymatch==null && other.getOnpolicymatch()==null) || 
             (this.onpolicymatch!=null &&
              this.onpolicymatch.equals(other.getOnpolicymatch()))) &&
            ((this.precedence==null && other.getPrecedence()==null) || 
             (this.precedence!=null &&
              this.precedence.equals(other.getPrecedence()))) &&
            ((this.redirecturl==null && other.getRedirecturl()==null) || 
             (this.redirecturl!=null &&
              this.redirecturl.equals(other.getRedirecturl()))) &&
            ((this.authentication==null && other.getAuthentication()==null) || 
             (this.authentication!=null &&
              this.authentication.equals(other.getAuthentication()))) &&
            ((this.homepage==null && other.getHomepage()==null) || 
             (this.homepage!=null &&
              this.homepage.equals(other.getHomepage()))) &&
            ((this.dnsvservername==null && other.getDnsvservername()==null) || 
             (this.dnsvservername!=null &&
              this.dnsvservername.equals(other.getDnsvservername()))) &&
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain()))) &&
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              this.rule.equals(other.getRule()))) &&
            ((this.policyname==null && other.getPolicyname()==null) || 
             (this.policyname!=null &&
              this.policyname.equals(other.getPolicyname()))) &&
            ((this.hits==null && other.getHits()==null) || 
             (this.hits!=null &&
              java.util.Arrays.equals(this.hits, other.getHits()))) &&
            ((this.servicename==null && other.getServicename()==null) || 
             (this.servicename!=null &&
              this.servicename.equals(other.getServicename()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.cachevserver==null && other.getCachevserver()==null) || 
             (this.cachevserver!=null &&
              this.cachevserver.equals(other.getCachevserver()))) &&
            ((this.targetvserver==null && other.getTargetvserver()==null) || 
             (this.targetvserver!=null &&
              this.targetvserver.equals(other.getTargetvserver()))) &&
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
            ((this.sopersistence==null && other.getSopersistence()==null) || 
             (this.sopersistence!=null &&
              this.sopersistence.equals(other.getSopersistence()))) &&
            ((this.sopersistencetimeout==null && other.getSopersistencetimeout()==null) || 
             (this.sopersistencetimeout!=null &&
              this.sopersistencetimeout.equals(other.getSopersistencetimeout()))) &&
            ((this.sothreshold==null && other.getSothreshold()==null) || 
             (this.sothreshold!=null &&
              this.sothreshold.equals(other.getSothreshold()))) &&
            ((this.reuse==null && other.getReuse()==null) || 
             (this.reuse!=null &&
              this.reuse.equals(other.getReuse()))) &&
            ((this.arp==null && other.getArp()==null) || 
             (this.arp!=null &&
              this.arp.equals(other.getArp()))) &&
            ((this.destinationvserver==null && other.getDestinationvserver()==null) || 
             (this.destinationvserver!=null &&
              this.destinationvserver.equals(other.getDestinationvserver()))) &&
            ((this.via==null && other.getVia()==null) || 
             (this.via!=null &&
              this.via.equals(other.getVia()))) &&
            ((this.downstateflush==null && other.getDownstateflush()==null) || 
             (this.downstateflush!=null &&
              this.downstateflush.equals(other.getDownstateflush()))) &&
            ((this.disableprimaryondown==null && other.getDisableprimaryondown()==null) || 
             (this.disableprimaryondown!=null &&
              this.disableprimaryondown.equals(other.getDisableprimaryondown()))) &&
            ((this.l2Conn==null && other.getL2Conn()==null) || 
             (this.l2Conn!=null &&
              this.l2Conn.equals(other.getL2Conn()))) &&
            ((this.backendssl==null && other.getBackendssl()==null) || 
             (this.backendssl!=null &&
              this.backendssl.equals(other.getBackendssl()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
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
            ((this.srcipexpr==null && other.getSrcipexpr()==null) || 
             (this.srcipexpr!=null &&
              this.srcipexpr.equals(other.getSrcipexpr()))) &&
            ((this.originusip==null && other.getOriginusip()==null) || 
             (this.originusip!=null &&
              this.originusip.equals(other.getOriginusip()))) &&
            ((this.useportrange==null && other.getUseportrange()==null) || 
             (this.useportrange!=null &&
              this.useportrange.equals(other.getUseportrange()))) &&
            ((this.appflowlog==null && other.getAppflowlog()==null) || 
             (this.appflowlog!=null &&
              this.appflowlog.equals(other.getAppflowlog()))) &&
            ((this.netprofile==null && other.getNetprofile()==null) || 
             (this.netprofile!=null &&
              this.netprofile.equals(other.getNetprofile()))) &&
            ((this.icmpvsrresponse==null && other.getIcmpvsrresponse()==null) || 
             (this.icmpvsrresponse!=null &&
              this.icmpvsrresponse.equals(other.getIcmpvsrresponse()))) &&
            ((this.lbvserver==null && other.getLbvserver()==null) || 
             (this.lbvserver!=null &&
              this.lbvserver.equals(other.getLbvserver()))) &&
            ((this.cswpolicyname==null && other.getCswpolicyname()==null) || 
             (this.cswpolicyname!=null &&
              java.util.Arrays.equals(this.cswpolicyname, other.getCswpolicyname()))) &&
            ((this.cswtargetserver==null && other.getCswtargetserver()==null) || 
             (this.cswtargetserver!=null &&
              java.util.Arrays.equals(this.cswtargetserver, other.getCswtargetserver()))) &&
            ((this.cswpriority==null && other.getCswpriority()==null) || 
             (this.cswpriority!=null &&
              java.util.Arrays.equals(this.cswpriority, other.getCswpriority()))) &&
            ((this.cswpolicyhits==null && other.getCswpolicyhits()==null) || 
             (this.cswpolicyhits!=null &&
              java.util.Arrays.equals(this.cswpolicyhits, other.getCswpolicyhits()))) &&
            ((this.crdpolicyname==null && other.getCrdpolicyname()==null) || 
             (this.crdpolicyname!=null &&
              java.util.Arrays.equals(this.crdpolicyname, other.getCrdpolicyname()))) &&
            ((this.crdpolicypriority==null && other.getCrdpolicypriority()==null) || 
             (this.crdpolicypriority!=null &&
              java.util.Arrays.equals(this.crdpolicypriority, other.getCrdpolicypriority()))) &&
            ((this.crdpolicyhits==null && other.getCrdpolicyhits()==null) || 
             (this.crdpolicyhits!=null &&
              java.util.Arrays.equals(this.crdpolicyhits, other.getCrdpolicyhits()))) &&
            ((this.maptable==null && other.getMaptable()==null) || 
             (this.maptable!=null &&
              java.util.Arrays.equals(this.maptable, other.getMaptable()))) &&
            ((this.mttargetserver==null && other.getMttargetserver()==null) || 
             (this.mttargetserver!=null &&
              java.util.Arrays.equals(this.mttargetserver, other.getMttargetserver()))) &&
            ((this.filterpolicyname==null && other.getFilterpolicyname()==null) || 
             (this.filterpolicyname!=null &&
              java.util.Arrays.equals(this.filterpolicyname, other.getFilterpolicyname()))) &&
            ((this.filterpolicypriority==null && other.getFilterpolicypriority()==null) || 
             (this.filterpolicypriority!=null &&
              java.util.Arrays.equals(this.filterpolicypriority, other.getFilterpolicypriority()))) &&
            ((this.cmppolicyname==null && other.getCmppolicyname()==null) || 
             (this.cmppolicyname!=null &&
              java.util.Arrays.equals(this.cmppolicyname, other.getCmppolicyname()))) &&
            ((this.cmppolicypriority==null && other.getCmppolicypriority()==null) || 
             (this.cmppolicypriority!=null &&
              java.util.Arrays.equals(this.cmppolicypriority, other.getCmppolicypriority()))) &&
            ((this.defaultlb==null && other.getDefaultlb()==null) || 
             (this.defaultlb!=null &&
              java.util.Arrays.equals(this.defaultlb, other.getDefaultlb())));
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
        if (getNgname() != null) {
            _hashCode += getNgname().hashCode();
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
        if (getOnpolicymatch() != null) {
            _hashCode += getOnpolicymatch().hashCode();
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
        if (getHomepage() != null) {
            _hashCode += getHomepage().hashCode();
        }
        if (getDnsvservername() != null) {
            _hashCode += getDnsvservername().hashCode();
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
        if (getHits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getTargetvserver() != null) {
            _hashCode += getTargetvserver().hashCode();
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
        if (getSopersistence() != null) {
            _hashCode += getSopersistence().hashCode();
        }
        if (getSopersistencetimeout() != null) {
            _hashCode += getSopersistencetimeout().hashCode();
        }
        if (getSothreshold() != null) {
            _hashCode += getSothreshold().hashCode();
        }
        if (getReuse() != null) {
            _hashCode += getReuse().hashCode();
        }
        if (getArp() != null) {
            _hashCode += getArp().hashCode();
        }
        if (getDestinationvserver() != null) {
            _hashCode += getDestinationvserver().hashCode();
        }
        if (getVia() != null) {
            _hashCode += getVia().hashCode();
        }
        if (getDownstateflush() != null) {
            _hashCode += getDownstateflush().hashCode();
        }
        if (getDisableprimaryondown() != null) {
            _hashCode += getDisableprimaryondown().hashCode();
        }
        if (getL2Conn() != null) {
            _hashCode += getL2Conn().hashCode();
        }
        if (getBackendssl() != null) {
            _hashCode += getBackendssl().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
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
        if (getSrcipexpr() != null) {
            _hashCode += getSrcipexpr().hashCode();
        }
        if (getOriginusip() != null) {
            _hashCode += getOriginusip().hashCode();
        }
        if (getUseportrange() != null) {
            _hashCode += getUseportrange().hashCode();
        }
        if (getAppflowlog() != null) {
            _hashCode += getAppflowlog().hashCode();
        }
        if (getNetprofile() != null) {
            _hashCode += getNetprofile().hashCode();
        }
        if (getIcmpvsrresponse() != null) {
            _hashCode += getIcmpvsrresponse().hashCode();
        }
        if (getLbvserver() != null) {
            _hashCode += getLbvserver().hashCode();
        }
        if (getCswpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCswpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCswpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCswtargetserver() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCswtargetserver());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCswtargetserver(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCswpriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCswpriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCswpriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCswpolicyhits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCswpolicyhits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCswpolicyhits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCrdpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCrdpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCrdpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCrdpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCrdpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCrdpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCrdpolicyhits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCrdpolicyhits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCrdpolicyhits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaptable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMaptable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMaptable(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMttargetserver() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMttargetserver());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMttargetserver(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFilterpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFilterpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFilterpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFilterpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFilterpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFilterpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCmppolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmppolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmppolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCmppolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmppolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmppolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDefaultlb() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefaultlb());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefaultlb(), i);
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
        new org.apache.axis.description.TypeDesc(Crvserver.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "crvserver"));
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
        elemField.setFieldName("ngname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ngname"));
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
        elemField.setFieldName("onpolicymatch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "onpolicymatch"));
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
        elemField.setFieldName("homepage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homepage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsvservername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnsvservername"));
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
        elemField.setFieldName("hits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hits"));
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
        elemField.setFieldName("targetvserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetvserver"));
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
        elemField.setFieldName("sothreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sothreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reuse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reuse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationvserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinationvserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("via");
        elemField.setXmlName(new javax.xml.namespace.QName("", "via"));
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
        elemField.setFieldName("disableprimaryondown");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disableprimaryondown"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("l2Conn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "l2conn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backendssl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backendssl"));
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
        elemField.setFieldName("srcipexpr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srcipexpr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originusip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originusip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useportrange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useportrange"));
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
        elemField.setFieldName("netprofile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netprofile"));
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
        elemField.setFieldName("lbvserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lbvserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cswpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cswpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cswtargetserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cswtargetserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cswpriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cswpriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cswpolicyhits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cswpolicyhits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crdpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crdpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crdpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crdpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crdpolicyhits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crdpolicyhits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maptable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maptable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mttargetserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mttargetserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filterpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filterpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmppolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmppolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmppolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmppolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultlb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultlb"));
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
