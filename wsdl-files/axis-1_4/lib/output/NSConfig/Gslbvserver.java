/**
 * Gslbvserver.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Gslbvserver  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String servicetype;

    private java.lang.String iptype;

    private java.lang.String dnsrecordtype;

    private java.lang.String persistencetype;

    private org.apache.axis.types.UnsignedInt persistenceid;

    private java.lang.String lbmethod;

    private java.lang.String backuplbmethod;

    private org.apache.axis.types.UnsignedInt tolerance;

    private org.apache.axis.types.UnsignedInt timeout;

    private java.lang.String state;

    private java.lang.String netmask;

    private org.apache.axis.types.UnsignedInt v6Netmasklen;

    private java.lang.String persistmask;

    private org.apache.axis.types.UnsignedInt v6Persistmasklen;

    private java.lang.String[] servicename;

    private org.apache.axis.types.UnsignedInt[] weight;

    private java.lang.String[] domainname;

    private org.apache.axis.types.UnsignedInt[] ttl;

    private java.lang.String[] backupip;

    private java.lang.String[] cookiedomain;

    private org.apache.axis.types.UnsignedInt[] cookietimeout;

    private org.apache.axis.types.UnsignedInt[] sitedomainttl;

    private java.lang.String[] ipaddress;

    private org.apache.axis.types.UnsignedInt[] port;

    private int status;

    private int lbrrreason;

    private java.lang.String[] preferredlocation;

    private java.lang.String backupvserver;

    private org.apache.axis.types.UnsignedInt backupsessiontimeout;

    private java.lang.String edr;

    private java.lang.String mir;

    private java.lang.String disableprimaryondown;

    private java.lang.String dynamicweight;

    private java.lang.String iscname;

    private org.apache.axis.types.UnsignedInt[] cumulativeweight;

    private org.apache.axis.types.UnsignedInt[] dynamicconfwt;

    private int[] thresholdvalue;

    private java.lang.String[] sitepersistence;

    private java.lang.String[] svreffgslbstate;

    private int[] gslbthreshold;

    private java.lang.String considereffectivestate;

    private java.lang.String[] cnameentry;

    private org.apache.axis.types.UnsignedInt totalservices;

    private org.apache.axis.types.UnsignedInt activeservices;

    private java.lang.String statechangetimesec;

    private org.apache.axis.types.UnsignedInt statechangetimemsec;

    private org.apache.axis.types.UnsignedInt tickssincelaststatechange;

    private java.lang.String comment;

    private org.apache.axis.types.UnsignedInt sopersistencetimeout;

    private java.lang.String somethod;

    private java.lang.String sobackupaction;

    private java.lang.String sopersistence;

    private org.apache.axis.types.UnsignedInt sothreshold;

    private org.apache.axis.types.UnsignedInt health;

    private java.lang.String appflowlog;

    private java.lang.String policyname;

    private org.apache.axis.types.UnsignedInt priority;

    private java.lang.String gotopriorityexpression;

    private java.lang.String type;

    private java.lang.String[] gslbservicetype;

    private java.lang.String[] gslbservicecurstate;

    private java.lang.String[] gslbsvciscname;

    private java.lang.String[] spilloverpolicyname;

    private java.lang.String[] spilloverpolicygotoprioexpression;

    private java.lang.String[] spilloverpolicyflowtype;

    private org.apache.axis.types.UnsignedInt[] spilloverpolicypriority;

    public Gslbvserver() {
    }

    public Gslbvserver(
           java.lang.String name,
           java.lang.String servicetype,
           java.lang.String iptype,
           java.lang.String dnsrecordtype,
           java.lang.String persistencetype,
           org.apache.axis.types.UnsignedInt persistenceid,
           java.lang.String lbmethod,
           java.lang.String backuplbmethod,
           org.apache.axis.types.UnsignedInt tolerance,
           org.apache.axis.types.UnsignedInt timeout,
           java.lang.String state,
           java.lang.String netmask,
           org.apache.axis.types.UnsignedInt v6Netmasklen,
           java.lang.String persistmask,
           org.apache.axis.types.UnsignedInt v6Persistmasklen,
           java.lang.String[] servicename,
           org.apache.axis.types.UnsignedInt[] weight,
           java.lang.String[] domainname,
           org.apache.axis.types.UnsignedInt[] ttl,
           java.lang.String[] backupip,
           java.lang.String[] cookiedomain,
           org.apache.axis.types.UnsignedInt[] cookietimeout,
           org.apache.axis.types.UnsignedInt[] sitedomainttl,
           java.lang.String[] ipaddress,
           org.apache.axis.types.UnsignedInt[] port,
           int status,
           int lbrrreason,
           java.lang.String[] preferredlocation,
           java.lang.String backupvserver,
           org.apache.axis.types.UnsignedInt backupsessiontimeout,
           java.lang.String edr,
           java.lang.String mir,
           java.lang.String disableprimaryondown,
           java.lang.String dynamicweight,
           java.lang.String iscname,
           org.apache.axis.types.UnsignedInt[] cumulativeweight,
           org.apache.axis.types.UnsignedInt[] dynamicconfwt,
           int[] thresholdvalue,
           java.lang.String[] sitepersistence,
           java.lang.String[] svreffgslbstate,
           int[] gslbthreshold,
           java.lang.String considereffectivestate,
           java.lang.String[] cnameentry,
           org.apache.axis.types.UnsignedInt totalservices,
           org.apache.axis.types.UnsignedInt activeservices,
           java.lang.String statechangetimesec,
           org.apache.axis.types.UnsignedInt statechangetimemsec,
           org.apache.axis.types.UnsignedInt tickssincelaststatechange,
           java.lang.String comment,
           org.apache.axis.types.UnsignedInt sopersistencetimeout,
           java.lang.String somethod,
           java.lang.String sobackupaction,
           java.lang.String sopersistence,
           org.apache.axis.types.UnsignedInt sothreshold,
           org.apache.axis.types.UnsignedInt health,
           java.lang.String appflowlog,
           java.lang.String policyname,
           org.apache.axis.types.UnsignedInt priority,
           java.lang.String gotopriorityexpression,
           java.lang.String type,
           java.lang.String[] gslbservicetype,
           java.lang.String[] gslbservicecurstate,
           java.lang.String[] gslbsvciscname,
           java.lang.String[] spilloverpolicyname,
           java.lang.String[] spilloverpolicygotoprioexpression,
           java.lang.String[] spilloverpolicyflowtype,
           org.apache.axis.types.UnsignedInt[] spilloverpolicypriority) {
           this.name = name;
           this.servicetype = servicetype;
           this.iptype = iptype;
           this.dnsrecordtype = dnsrecordtype;
           this.persistencetype = persistencetype;
           this.persistenceid = persistenceid;
           this.lbmethod = lbmethod;
           this.backuplbmethod = backuplbmethod;
           this.tolerance = tolerance;
           this.timeout = timeout;
           this.state = state;
           this.netmask = netmask;
           this.v6Netmasklen = v6Netmasklen;
           this.persistmask = persistmask;
           this.v6Persistmasklen = v6Persistmasklen;
           this.servicename = servicename;
           this.weight = weight;
           this.domainname = domainname;
           this.ttl = ttl;
           this.backupip = backupip;
           this.cookiedomain = cookiedomain;
           this.cookietimeout = cookietimeout;
           this.sitedomainttl = sitedomainttl;
           this.ipaddress = ipaddress;
           this.port = port;
           this.status = status;
           this.lbrrreason = lbrrreason;
           this.preferredlocation = preferredlocation;
           this.backupvserver = backupvserver;
           this.backupsessiontimeout = backupsessiontimeout;
           this.edr = edr;
           this.mir = mir;
           this.disableprimaryondown = disableprimaryondown;
           this.dynamicweight = dynamicweight;
           this.iscname = iscname;
           this.cumulativeweight = cumulativeweight;
           this.dynamicconfwt = dynamicconfwt;
           this.thresholdvalue = thresholdvalue;
           this.sitepersistence = sitepersistence;
           this.svreffgslbstate = svreffgslbstate;
           this.gslbthreshold = gslbthreshold;
           this.considereffectivestate = considereffectivestate;
           this.cnameentry = cnameentry;
           this.totalservices = totalservices;
           this.activeservices = activeservices;
           this.statechangetimesec = statechangetimesec;
           this.statechangetimemsec = statechangetimemsec;
           this.tickssincelaststatechange = tickssincelaststatechange;
           this.comment = comment;
           this.sopersistencetimeout = sopersistencetimeout;
           this.somethod = somethod;
           this.sobackupaction = sobackupaction;
           this.sopersistence = sopersistence;
           this.sothreshold = sothreshold;
           this.health = health;
           this.appflowlog = appflowlog;
           this.policyname = policyname;
           this.priority = priority;
           this.gotopriorityexpression = gotopriorityexpression;
           this.type = type;
           this.gslbservicetype = gslbservicetype;
           this.gslbservicecurstate = gslbservicecurstate;
           this.gslbsvciscname = gslbsvciscname;
           this.spilloverpolicyname = spilloverpolicyname;
           this.spilloverpolicygotoprioexpression = spilloverpolicygotoprioexpression;
           this.spilloverpolicyflowtype = spilloverpolicyflowtype;
           this.spilloverpolicypriority = spilloverpolicypriority;
    }


    /**
     * Gets the name value for this Gslbvserver.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Gslbvserver.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the servicetype value for this Gslbvserver.
     * 
     * @return servicetype
     */
    public java.lang.String getServicetype() {
        return servicetype;
    }


    /**
     * Sets the servicetype value for this Gslbvserver.
     * 
     * @param servicetype
     */
    public void setServicetype(java.lang.String servicetype) {
        this.servicetype = servicetype;
    }


    /**
     * Gets the iptype value for this Gslbvserver.
     * 
     * @return iptype
     */
    public java.lang.String getIptype() {
        return iptype;
    }


    /**
     * Sets the iptype value for this Gslbvserver.
     * 
     * @param iptype
     */
    public void setIptype(java.lang.String iptype) {
        this.iptype = iptype;
    }


    /**
     * Gets the dnsrecordtype value for this Gslbvserver.
     * 
     * @return dnsrecordtype
     */
    public java.lang.String getDnsrecordtype() {
        return dnsrecordtype;
    }


    /**
     * Sets the dnsrecordtype value for this Gslbvserver.
     * 
     * @param dnsrecordtype
     */
    public void setDnsrecordtype(java.lang.String dnsrecordtype) {
        this.dnsrecordtype = dnsrecordtype;
    }


    /**
     * Gets the persistencetype value for this Gslbvserver.
     * 
     * @return persistencetype
     */
    public java.lang.String getPersistencetype() {
        return persistencetype;
    }


    /**
     * Sets the persistencetype value for this Gslbvserver.
     * 
     * @param persistencetype
     */
    public void setPersistencetype(java.lang.String persistencetype) {
        this.persistencetype = persistencetype;
    }


    /**
     * Gets the persistenceid value for this Gslbvserver.
     * 
     * @return persistenceid
     */
    public org.apache.axis.types.UnsignedInt getPersistenceid() {
        return persistenceid;
    }


    /**
     * Sets the persistenceid value for this Gslbvserver.
     * 
     * @param persistenceid
     */
    public void setPersistenceid(org.apache.axis.types.UnsignedInt persistenceid) {
        this.persistenceid = persistenceid;
    }


    /**
     * Gets the lbmethod value for this Gslbvserver.
     * 
     * @return lbmethod
     */
    public java.lang.String getLbmethod() {
        return lbmethod;
    }


    /**
     * Sets the lbmethod value for this Gslbvserver.
     * 
     * @param lbmethod
     */
    public void setLbmethod(java.lang.String lbmethod) {
        this.lbmethod = lbmethod;
    }


    /**
     * Gets the backuplbmethod value for this Gslbvserver.
     * 
     * @return backuplbmethod
     */
    public java.lang.String getBackuplbmethod() {
        return backuplbmethod;
    }


    /**
     * Sets the backuplbmethod value for this Gslbvserver.
     * 
     * @param backuplbmethod
     */
    public void setBackuplbmethod(java.lang.String backuplbmethod) {
        this.backuplbmethod = backuplbmethod;
    }


    /**
     * Gets the tolerance value for this Gslbvserver.
     * 
     * @return tolerance
     */
    public org.apache.axis.types.UnsignedInt getTolerance() {
        return tolerance;
    }


    /**
     * Sets the tolerance value for this Gslbvserver.
     * 
     * @param tolerance
     */
    public void setTolerance(org.apache.axis.types.UnsignedInt tolerance) {
        this.tolerance = tolerance;
    }


    /**
     * Gets the timeout value for this Gslbvserver.
     * 
     * @return timeout
     */
    public org.apache.axis.types.UnsignedInt getTimeout() {
        return timeout;
    }


    /**
     * Sets the timeout value for this Gslbvserver.
     * 
     * @param timeout
     */
    public void setTimeout(org.apache.axis.types.UnsignedInt timeout) {
        this.timeout = timeout;
    }


    /**
     * Gets the state value for this Gslbvserver.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Gslbvserver.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the netmask value for this Gslbvserver.
     * 
     * @return netmask
     */
    public java.lang.String getNetmask() {
        return netmask;
    }


    /**
     * Sets the netmask value for this Gslbvserver.
     * 
     * @param netmask
     */
    public void setNetmask(java.lang.String netmask) {
        this.netmask = netmask;
    }


    /**
     * Gets the v6Netmasklen value for this Gslbvserver.
     * 
     * @return v6Netmasklen
     */
    public org.apache.axis.types.UnsignedInt getV6Netmasklen() {
        return v6Netmasklen;
    }


    /**
     * Sets the v6Netmasklen value for this Gslbvserver.
     * 
     * @param v6Netmasklen
     */
    public void setV6Netmasklen(org.apache.axis.types.UnsignedInt v6Netmasklen) {
        this.v6Netmasklen = v6Netmasklen;
    }


    /**
     * Gets the persistmask value for this Gslbvserver.
     * 
     * @return persistmask
     */
    public java.lang.String getPersistmask() {
        return persistmask;
    }


    /**
     * Sets the persistmask value for this Gslbvserver.
     * 
     * @param persistmask
     */
    public void setPersistmask(java.lang.String persistmask) {
        this.persistmask = persistmask;
    }


    /**
     * Gets the v6Persistmasklen value for this Gslbvserver.
     * 
     * @return v6Persistmasklen
     */
    public org.apache.axis.types.UnsignedInt getV6Persistmasklen() {
        return v6Persistmasklen;
    }


    /**
     * Sets the v6Persistmasklen value for this Gslbvserver.
     * 
     * @param v6Persistmasklen
     */
    public void setV6Persistmasklen(org.apache.axis.types.UnsignedInt v6Persistmasklen) {
        this.v6Persistmasklen = v6Persistmasklen;
    }


    /**
     * Gets the servicename value for this Gslbvserver.
     * 
     * @return servicename
     */
    public java.lang.String[] getServicename() {
        return servicename;
    }


    /**
     * Sets the servicename value for this Gslbvserver.
     * 
     * @param servicename
     */
    public void setServicename(java.lang.String[] servicename) {
        this.servicename = servicename;
    }


    /**
     * Gets the weight value for this Gslbvserver.
     * 
     * @return weight
     */
    public org.apache.axis.types.UnsignedInt[] getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this Gslbvserver.
     * 
     * @param weight
     */
    public void setWeight(org.apache.axis.types.UnsignedInt[] weight) {
        this.weight = weight;
    }


    /**
     * Gets the domainname value for this Gslbvserver.
     * 
     * @return domainname
     */
    public java.lang.String[] getDomainname() {
        return domainname;
    }


    /**
     * Sets the domainname value for this Gslbvserver.
     * 
     * @param domainname
     */
    public void setDomainname(java.lang.String[] domainname) {
        this.domainname = domainname;
    }


    /**
     * Gets the ttl value for this Gslbvserver.
     * 
     * @return ttl
     */
    public org.apache.axis.types.UnsignedInt[] getTtl() {
        return ttl;
    }


    /**
     * Sets the ttl value for this Gslbvserver.
     * 
     * @param ttl
     */
    public void setTtl(org.apache.axis.types.UnsignedInt[] ttl) {
        this.ttl = ttl;
    }


    /**
     * Gets the backupip value for this Gslbvserver.
     * 
     * @return backupip
     */
    public java.lang.String[] getBackupip() {
        return backupip;
    }


    /**
     * Sets the backupip value for this Gslbvserver.
     * 
     * @param backupip
     */
    public void setBackupip(java.lang.String[] backupip) {
        this.backupip = backupip;
    }


    /**
     * Gets the cookiedomain value for this Gslbvserver.
     * 
     * @return cookiedomain
     */
    public java.lang.String[] getCookiedomain() {
        return cookiedomain;
    }


    /**
     * Sets the cookiedomain value for this Gslbvserver.
     * 
     * @param cookiedomain
     */
    public void setCookiedomain(java.lang.String[] cookiedomain) {
        this.cookiedomain = cookiedomain;
    }


    /**
     * Gets the cookietimeout value for this Gslbvserver.
     * 
     * @return cookietimeout
     */
    public org.apache.axis.types.UnsignedInt[] getCookietimeout() {
        return cookietimeout;
    }


    /**
     * Sets the cookietimeout value for this Gslbvserver.
     * 
     * @param cookietimeout
     */
    public void setCookietimeout(org.apache.axis.types.UnsignedInt[] cookietimeout) {
        this.cookietimeout = cookietimeout;
    }


    /**
     * Gets the sitedomainttl value for this Gslbvserver.
     * 
     * @return sitedomainttl
     */
    public org.apache.axis.types.UnsignedInt[] getSitedomainttl() {
        return sitedomainttl;
    }


    /**
     * Sets the sitedomainttl value for this Gslbvserver.
     * 
     * @param sitedomainttl
     */
    public void setSitedomainttl(org.apache.axis.types.UnsignedInt[] sitedomainttl) {
        this.sitedomainttl = sitedomainttl;
    }


    /**
     * Gets the ipaddress value for this Gslbvserver.
     * 
     * @return ipaddress
     */
    public java.lang.String[] getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Gslbvserver.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String[] ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the port value for this Gslbvserver.
     * 
     * @return port
     */
    public org.apache.axis.types.UnsignedInt[] getPort() {
        return port;
    }


    /**
     * Sets the port value for this Gslbvserver.
     * 
     * @param port
     */
    public void setPort(org.apache.axis.types.UnsignedInt[] port) {
        this.port = port;
    }


    /**
     * Gets the status value for this Gslbvserver.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Gslbvserver.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the lbrrreason value for this Gslbvserver.
     * 
     * @return lbrrreason
     */
    public int getLbrrreason() {
        return lbrrreason;
    }


    /**
     * Sets the lbrrreason value for this Gslbvserver.
     * 
     * @param lbrrreason
     */
    public void setLbrrreason(int lbrrreason) {
        this.lbrrreason = lbrrreason;
    }


    /**
     * Gets the preferredlocation value for this Gslbvserver.
     * 
     * @return preferredlocation
     */
    public java.lang.String[] getPreferredlocation() {
        return preferredlocation;
    }


    /**
     * Sets the preferredlocation value for this Gslbvserver.
     * 
     * @param preferredlocation
     */
    public void setPreferredlocation(java.lang.String[] preferredlocation) {
        this.preferredlocation = preferredlocation;
    }


    /**
     * Gets the backupvserver value for this Gslbvserver.
     * 
     * @return backupvserver
     */
    public java.lang.String getBackupvserver() {
        return backupvserver;
    }


    /**
     * Sets the backupvserver value for this Gslbvserver.
     * 
     * @param backupvserver
     */
    public void setBackupvserver(java.lang.String backupvserver) {
        this.backupvserver = backupvserver;
    }


    /**
     * Gets the backupsessiontimeout value for this Gslbvserver.
     * 
     * @return backupsessiontimeout
     */
    public org.apache.axis.types.UnsignedInt getBackupsessiontimeout() {
        return backupsessiontimeout;
    }


    /**
     * Sets the backupsessiontimeout value for this Gslbvserver.
     * 
     * @param backupsessiontimeout
     */
    public void setBackupsessiontimeout(org.apache.axis.types.UnsignedInt backupsessiontimeout) {
        this.backupsessiontimeout = backupsessiontimeout;
    }


    /**
     * Gets the edr value for this Gslbvserver.
     * 
     * @return edr
     */
    public java.lang.String getEdr() {
        return edr;
    }


    /**
     * Sets the edr value for this Gslbvserver.
     * 
     * @param edr
     */
    public void setEdr(java.lang.String edr) {
        this.edr = edr;
    }


    /**
     * Gets the mir value for this Gslbvserver.
     * 
     * @return mir
     */
    public java.lang.String getMir() {
        return mir;
    }


    /**
     * Sets the mir value for this Gslbvserver.
     * 
     * @param mir
     */
    public void setMir(java.lang.String mir) {
        this.mir = mir;
    }


    /**
     * Gets the disableprimaryondown value for this Gslbvserver.
     * 
     * @return disableprimaryondown
     */
    public java.lang.String getDisableprimaryondown() {
        return disableprimaryondown;
    }


    /**
     * Sets the disableprimaryondown value for this Gslbvserver.
     * 
     * @param disableprimaryondown
     */
    public void setDisableprimaryondown(java.lang.String disableprimaryondown) {
        this.disableprimaryondown = disableprimaryondown;
    }


    /**
     * Gets the dynamicweight value for this Gslbvserver.
     * 
     * @return dynamicweight
     */
    public java.lang.String getDynamicweight() {
        return dynamicweight;
    }


    /**
     * Sets the dynamicweight value for this Gslbvserver.
     * 
     * @param dynamicweight
     */
    public void setDynamicweight(java.lang.String dynamicweight) {
        this.dynamicweight = dynamicweight;
    }


    /**
     * Gets the iscname value for this Gslbvserver.
     * 
     * @return iscname
     */
    public java.lang.String getIscname() {
        return iscname;
    }


    /**
     * Sets the iscname value for this Gslbvserver.
     * 
     * @param iscname
     */
    public void setIscname(java.lang.String iscname) {
        this.iscname = iscname;
    }


    /**
     * Gets the cumulativeweight value for this Gslbvserver.
     * 
     * @return cumulativeweight
     */
    public org.apache.axis.types.UnsignedInt[] getCumulativeweight() {
        return cumulativeweight;
    }


    /**
     * Sets the cumulativeweight value for this Gslbvserver.
     * 
     * @param cumulativeweight
     */
    public void setCumulativeweight(org.apache.axis.types.UnsignedInt[] cumulativeweight) {
        this.cumulativeweight = cumulativeweight;
    }


    /**
     * Gets the dynamicconfwt value for this Gslbvserver.
     * 
     * @return dynamicconfwt
     */
    public org.apache.axis.types.UnsignedInt[] getDynamicconfwt() {
        return dynamicconfwt;
    }


    /**
     * Sets the dynamicconfwt value for this Gslbvserver.
     * 
     * @param dynamicconfwt
     */
    public void setDynamicconfwt(org.apache.axis.types.UnsignedInt[] dynamicconfwt) {
        this.dynamicconfwt = dynamicconfwt;
    }


    /**
     * Gets the thresholdvalue value for this Gslbvserver.
     * 
     * @return thresholdvalue
     */
    public int[] getThresholdvalue() {
        return thresholdvalue;
    }


    /**
     * Sets the thresholdvalue value for this Gslbvserver.
     * 
     * @param thresholdvalue
     */
    public void setThresholdvalue(int[] thresholdvalue) {
        this.thresholdvalue = thresholdvalue;
    }


    /**
     * Gets the sitepersistence value for this Gslbvserver.
     * 
     * @return sitepersistence
     */
    public java.lang.String[] getSitepersistence() {
        return sitepersistence;
    }


    /**
     * Sets the sitepersistence value for this Gslbvserver.
     * 
     * @param sitepersistence
     */
    public void setSitepersistence(java.lang.String[] sitepersistence) {
        this.sitepersistence = sitepersistence;
    }


    /**
     * Gets the svreffgslbstate value for this Gslbvserver.
     * 
     * @return svreffgslbstate
     */
    public java.lang.String[] getSvreffgslbstate() {
        return svreffgslbstate;
    }


    /**
     * Sets the svreffgslbstate value for this Gslbvserver.
     * 
     * @param svreffgslbstate
     */
    public void setSvreffgslbstate(java.lang.String[] svreffgslbstate) {
        this.svreffgslbstate = svreffgslbstate;
    }


    /**
     * Gets the gslbthreshold value for this Gslbvserver.
     * 
     * @return gslbthreshold
     */
    public int[] getGslbthreshold() {
        return gslbthreshold;
    }


    /**
     * Sets the gslbthreshold value for this Gslbvserver.
     * 
     * @param gslbthreshold
     */
    public void setGslbthreshold(int[] gslbthreshold) {
        this.gslbthreshold = gslbthreshold;
    }


    /**
     * Gets the considereffectivestate value for this Gslbvserver.
     * 
     * @return considereffectivestate
     */
    public java.lang.String getConsidereffectivestate() {
        return considereffectivestate;
    }


    /**
     * Sets the considereffectivestate value for this Gslbvserver.
     * 
     * @param considereffectivestate
     */
    public void setConsidereffectivestate(java.lang.String considereffectivestate) {
        this.considereffectivestate = considereffectivestate;
    }


    /**
     * Gets the cnameentry value for this Gslbvserver.
     * 
     * @return cnameentry
     */
    public java.lang.String[] getCnameentry() {
        return cnameentry;
    }


    /**
     * Sets the cnameentry value for this Gslbvserver.
     * 
     * @param cnameentry
     */
    public void setCnameentry(java.lang.String[] cnameentry) {
        this.cnameentry = cnameentry;
    }


    /**
     * Gets the totalservices value for this Gslbvserver.
     * 
     * @return totalservices
     */
    public org.apache.axis.types.UnsignedInt getTotalservices() {
        return totalservices;
    }


    /**
     * Sets the totalservices value for this Gslbvserver.
     * 
     * @param totalservices
     */
    public void setTotalservices(org.apache.axis.types.UnsignedInt totalservices) {
        this.totalservices = totalservices;
    }


    /**
     * Gets the activeservices value for this Gslbvserver.
     * 
     * @return activeservices
     */
    public org.apache.axis.types.UnsignedInt getActiveservices() {
        return activeservices;
    }


    /**
     * Sets the activeservices value for this Gslbvserver.
     * 
     * @param activeservices
     */
    public void setActiveservices(org.apache.axis.types.UnsignedInt activeservices) {
        this.activeservices = activeservices;
    }


    /**
     * Gets the statechangetimesec value for this Gslbvserver.
     * 
     * @return statechangetimesec
     */
    public java.lang.String getStatechangetimesec() {
        return statechangetimesec;
    }


    /**
     * Sets the statechangetimesec value for this Gslbvserver.
     * 
     * @param statechangetimesec
     */
    public void setStatechangetimesec(java.lang.String statechangetimesec) {
        this.statechangetimesec = statechangetimesec;
    }


    /**
     * Gets the statechangetimemsec value for this Gslbvserver.
     * 
     * @return statechangetimemsec
     */
    public org.apache.axis.types.UnsignedInt getStatechangetimemsec() {
        return statechangetimemsec;
    }


    /**
     * Sets the statechangetimemsec value for this Gslbvserver.
     * 
     * @param statechangetimemsec
     */
    public void setStatechangetimemsec(org.apache.axis.types.UnsignedInt statechangetimemsec) {
        this.statechangetimemsec = statechangetimemsec;
    }


    /**
     * Gets the tickssincelaststatechange value for this Gslbvserver.
     * 
     * @return tickssincelaststatechange
     */
    public org.apache.axis.types.UnsignedInt getTickssincelaststatechange() {
        return tickssincelaststatechange;
    }


    /**
     * Sets the tickssincelaststatechange value for this Gslbvserver.
     * 
     * @param tickssincelaststatechange
     */
    public void setTickssincelaststatechange(org.apache.axis.types.UnsignedInt tickssincelaststatechange) {
        this.tickssincelaststatechange = tickssincelaststatechange;
    }


    /**
     * Gets the comment value for this Gslbvserver.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Gslbvserver.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the sopersistencetimeout value for this Gslbvserver.
     * 
     * @return sopersistencetimeout
     */
    public org.apache.axis.types.UnsignedInt getSopersistencetimeout() {
        return sopersistencetimeout;
    }


    /**
     * Sets the sopersistencetimeout value for this Gslbvserver.
     * 
     * @param sopersistencetimeout
     */
    public void setSopersistencetimeout(org.apache.axis.types.UnsignedInt sopersistencetimeout) {
        this.sopersistencetimeout = sopersistencetimeout;
    }


    /**
     * Gets the somethod value for this Gslbvserver.
     * 
     * @return somethod
     */
    public java.lang.String getSomethod() {
        return somethod;
    }


    /**
     * Sets the somethod value for this Gslbvserver.
     * 
     * @param somethod
     */
    public void setSomethod(java.lang.String somethod) {
        this.somethod = somethod;
    }


    /**
     * Gets the sobackupaction value for this Gslbvserver.
     * 
     * @return sobackupaction
     */
    public java.lang.String getSobackupaction() {
        return sobackupaction;
    }


    /**
     * Sets the sobackupaction value for this Gslbvserver.
     * 
     * @param sobackupaction
     */
    public void setSobackupaction(java.lang.String sobackupaction) {
        this.sobackupaction = sobackupaction;
    }


    /**
     * Gets the sopersistence value for this Gslbvserver.
     * 
     * @return sopersistence
     */
    public java.lang.String getSopersistence() {
        return sopersistence;
    }


    /**
     * Sets the sopersistence value for this Gslbvserver.
     * 
     * @param sopersistence
     */
    public void setSopersistence(java.lang.String sopersistence) {
        this.sopersistence = sopersistence;
    }


    /**
     * Gets the sothreshold value for this Gslbvserver.
     * 
     * @return sothreshold
     */
    public org.apache.axis.types.UnsignedInt getSothreshold() {
        return sothreshold;
    }


    /**
     * Sets the sothreshold value for this Gslbvserver.
     * 
     * @param sothreshold
     */
    public void setSothreshold(org.apache.axis.types.UnsignedInt sothreshold) {
        this.sothreshold = sothreshold;
    }


    /**
     * Gets the health value for this Gslbvserver.
     * 
     * @return health
     */
    public org.apache.axis.types.UnsignedInt getHealth() {
        return health;
    }


    /**
     * Sets the health value for this Gslbvserver.
     * 
     * @param health
     */
    public void setHealth(org.apache.axis.types.UnsignedInt health) {
        this.health = health;
    }


    /**
     * Gets the appflowlog value for this Gslbvserver.
     * 
     * @return appflowlog
     */
    public java.lang.String getAppflowlog() {
        return appflowlog;
    }


    /**
     * Sets the appflowlog value for this Gslbvserver.
     * 
     * @param appflowlog
     */
    public void setAppflowlog(java.lang.String appflowlog) {
        this.appflowlog = appflowlog;
    }


    /**
     * Gets the policyname value for this Gslbvserver.
     * 
     * @return policyname
     */
    public java.lang.String getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Gslbvserver.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the priority value for this Gslbvserver.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Gslbvserver.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the gotopriorityexpression value for this Gslbvserver.
     * 
     * @return gotopriorityexpression
     */
    public java.lang.String getGotopriorityexpression() {
        return gotopriorityexpression;
    }


    /**
     * Sets the gotopriorityexpression value for this Gslbvserver.
     * 
     * @param gotopriorityexpression
     */
    public void setGotopriorityexpression(java.lang.String gotopriorityexpression) {
        this.gotopriorityexpression = gotopriorityexpression;
    }


    /**
     * Gets the type value for this Gslbvserver.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Gslbvserver.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the gslbservicetype value for this Gslbvserver.
     * 
     * @return gslbservicetype
     */
    public java.lang.String[] getGslbservicetype() {
        return gslbservicetype;
    }


    /**
     * Sets the gslbservicetype value for this Gslbvserver.
     * 
     * @param gslbservicetype
     */
    public void setGslbservicetype(java.lang.String[] gslbservicetype) {
        this.gslbservicetype = gslbservicetype;
    }


    /**
     * Gets the gslbservicecurstate value for this Gslbvserver.
     * 
     * @return gslbservicecurstate
     */
    public java.lang.String[] getGslbservicecurstate() {
        return gslbservicecurstate;
    }


    /**
     * Sets the gslbservicecurstate value for this Gslbvserver.
     * 
     * @param gslbservicecurstate
     */
    public void setGslbservicecurstate(java.lang.String[] gslbservicecurstate) {
        this.gslbservicecurstate = gslbservicecurstate;
    }


    /**
     * Gets the gslbsvciscname value for this Gslbvserver.
     * 
     * @return gslbsvciscname
     */
    public java.lang.String[] getGslbsvciscname() {
        return gslbsvciscname;
    }


    /**
     * Sets the gslbsvciscname value for this Gslbvserver.
     * 
     * @param gslbsvciscname
     */
    public void setGslbsvciscname(java.lang.String[] gslbsvciscname) {
        this.gslbsvciscname = gslbsvciscname;
    }


    /**
     * Gets the spilloverpolicyname value for this Gslbvserver.
     * 
     * @return spilloverpolicyname
     */
    public java.lang.String[] getSpilloverpolicyname() {
        return spilloverpolicyname;
    }


    /**
     * Sets the spilloverpolicyname value for this Gslbvserver.
     * 
     * @param spilloverpolicyname
     */
    public void setSpilloverpolicyname(java.lang.String[] spilloverpolicyname) {
        this.spilloverpolicyname = spilloverpolicyname;
    }


    /**
     * Gets the spilloverpolicygotoprioexpression value for this Gslbvserver.
     * 
     * @return spilloverpolicygotoprioexpression
     */
    public java.lang.String[] getSpilloverpolicygotoprioexpression() {
        return spilloverpolicygotoprioexpression;
    }


    /**
     * Sets the spilloverpolicygotoprioexpression value for this Gslbvserver.
     * 
     * @param spilloverpolicygotoprioexpression
     */
    public void setSpilloverpolicygotoprioexpression(java.lang.String[] spilloverpolicygotoprioexpression) {
        this.spilloverpolicygotoprioexpression = spilloverpolicygotoprioexpression;
    }


    /**
     * Gets the spilloverpolicyflowtype value for this Gslbvserver.
     * 
     * @return spilloverpolicyflowtype
     */
    public java.lang.String[] getSpilloverpolicyflowtype() {
        return spilloverpolicyflowtype;
    }


    /**
     * Sets the spilloverpolicyflowtype value for this Gslbvserver.
     * 
     * @param spilloverpolicyflowtype
     */
    public void setSpilloverpolicyflowtype(java.lang.String[] spilloverpolicyflowtype) {
        this.spilloverpolicyflowtype = spilloverpolicyflowtype;
    }


    /**
     * Gets the spilloverpolicypriority value for this Gslbvserver.
     * 
     * @return spilloverpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getSpilloverpolicypriority() {
        return spilloverpolicypriority;
    }


    /**
     * Sets the spilloverpolicypriority value for this Gslbvserver.
     * 
     * @param spilloverpolicypriority
     */
    public void setSpilloverpolicypriority(org.apache.axis.types.UnsignedInt[] spilloverpolicypriority) {
        this.spilloverpolicypriority = spilloverpolicypriority;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gslbvserver)) return false;
        Gslbvserver other = (Gslbvserver) obj;
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
            ((this.servicetype==null && other.getServicetype()==null) || 
             (this.servicetype!=null &&
              this.servicetype.equals(other.getServicetype()))) &&
            ((this.iptype==null && other.getIptype()==null) || 
             (this.iptype!=null &&
              this.iptype.equals(other.getIptype()))) &&
            ((this.dnsrecordtype==null && other.getDnsrecordtype()==null) || 
             (this.dnsrecordtype!=null &&
              this.dnsrecordtype.equals(other.getDnsrecordtype()))) &&
            ((this.persistencetype==null && other.getPersistencetype()==null) || 
             (this.persistencetype!=null &&
              this.persistencetype.equals(other.getPersistencetype()))) &&
            ((this.persistenceid==null && other.getPersistenceid()==null) || 
             (this.persistenceid!=null &&
              this.persistenceid.equals(other.getPersistenceid()))) &&
            ((this.lbmethod==null && other.getLbmethod()==null) || 
             (this.lbmethod!=null &&
              this.lbmethod.equals(other.getLbmethod()))) &&
            ((this.backuplbmethod==null && other.getBackuplbmethod()==null) || 
             (this.backuplbmethod!=null &&
              this.backuplbmethod.equals(other.getBackuplbmethod()))) &&
            ((this.tolerance==null && other.getTolerance()==null) || 
             (this.tolerance!=null &&
              this.tolerance.equals(other.getTolerance()))) &&
            ((this.timeout==null && other.getTimeout()==null) || 
             (this.timeout!=null &&
              this.timeout.equals(other.getTimeout()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.netmask==null && other.getNetmask()==null) || 
             (this.netmask!=null &&
              this.netmask.equals(other.getNetmask()))) &&
            ((this.v6Netmasklen==null && other.getV6Netmasklen()==null) || 
             (this.v6Netmasklen!=null &&
              this.v6Netmasklen.equals(other.getV6Netmasklen()))) &&
            ((this.persistmask==null && other.getPersistmask()==null) || 
             (this.persistmask!=null &&
              this.persistmask.equals(other.getPersistmask()))) &&
            ((this.v6Persistmasklen==null && other.getV6Persistmasklen()==null) || 
             (this.v6Persistmasklen!=null &&
              this.v6Persistmasklen.equals(other.getV6Persistmasklen()))) &&
            ((this.servicename==null && other.getServicename()==null) || 
             (this.servicename!=null &&
              java.util.Arrays.equals(this.servicename, other.getServicename()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              java.util.Arrays.equals(this.weight, other.getWeight()))) &&
            ((this.domainname==null && other.getDomainname()==null) || 
             (this.domainname!=null &&
              java.util.Arrays.equals(this.domainname, other.getDomainname()))) &&
            ((this.ttl==null && other.getTtl()==null) || 
             (this.ttl!=null &&
              java.util.Arrays.equals(this.ttl, other.getTtl()))) &&
            ((this.backupip==null && other.getBackupip()==null) || 
             (this.backupip!=null &&
              java.util.Arrays.equals(this.backupip, other.getBackupip()))) &&
            ((this.cookiedomain==null && other.getCookiedomain()==null) || 
             (this.cookiedomain!=null &&
              java.util.Arrays.equals(this.cookiedomain, other.getCookiedomain()))) &&
            ((this.cookietimeout==null && other.getCookietimeout()==null) || 
             (this.cookietimeout!=null &&
              java.util.Arrays.equals(this.cookietimeout, other.getCookietimeout()))) &&
            ((this.sitedomainttl==null && other.getSitedomainttl()==null) || 
             (this.sitedomainttl!=null &&
              java.util.Arrays.equals(this.sitedomainttl, other.getSitedomainttl()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              java.util.Arrays.equals(this.ipaddress, other.getIpaddress()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              java.util.Arrays.equals(this.port, other.getPort()))) &&
            this.status == other.getStatus() &&
            this.lbrrreason == other.getLbrrreason() &&
            ((this.preferredlocation==null && other.getPreferredlocation()==null) || 
             (this.preferredlocation!=null &&
              java.util.Arrays.equals(this.preferredlocation, other.getPreferredlocation()))) &&
            ((this.backupvserver==null && other.getBackupvserver()==null) || 
             (this.backupvserver!=null &&
              this.backupvserver.equals(other.getBackupvserver()))) &&
            ((this.backupsessiontimeout==null && other.getBackupsessiontimeout()==null) || 
             (this.backupsessiontimeout!=null &&
              this.backupsessiontimeout.equals(other.getBackupsessiontimeout()))) &&
            ((this.edr==null && other.getEdr()==null) || 
             (this.edr!=null &&
              this.edr.equals(other.getEdr()))) &&
            ((this.mir==null && other.getMir()==null) || 
             (this.mir!=null &&
              this.mir.equals(other.getMir()))) &&
            ((this.disableprimaryondown==null && other.getDisableprimaryondown()==null) || 
             (this.disableprimaryondown!=null &&
              this.disableprimaryondown.equals(other.getDisableprimaryondown()))) &&
            ((this.dynamicweight==null && other.getDynamicweight()==null) || 
             (this.dynamicweight!=null &&
              this.dynamicweight.equals(other.getDynamicweight()))) &&
            ((this.iscname==null && other.getIscname()==null) || 
             (this.iscname!=null &&
              this.iscname.equals(other.getIscname()))) &&
            ((this.cumulativeweight==null && other.getCumulativeweight()==null) || 
             (this.cumulativeweight!=null &&
              java.util.Arrays.equals(this.cumulativeweight, other.getCumulativeweight()))) &&
            ((this.dynamicconfwt==null && other.getDynamicconfwt()==null) || 
             (this.dynamicconfwt!=null &&
              java.util.Arrays.equals(this.dynamicconfwt, other.getDynamicconfwt()))) &&
            ((this.thresholdvalue==null && other.getThresholdvalue()==null) || 
             (this.thresholdvalue!=null &&
              java.util.Arrays.equals(this.thresholdvalue, other.getThresholdvalue()))) &&
            ((this.sitepersistence==null && other.getSitepersistence()==null) || 
             (this.sitepersistence!=null &&
              java.util.Arrays.equals(this.sitepersistence, other.getSitepersistence()))) &&
            ((this.svreffgslbstate==null && other.getSvreffgslbstate()==null) || 
             (this.svreffgslbstate!=null &&
              java.util.Arrays.equals(this.svreffgslbstate, other.getSvreffgslbstate()))) &&
            ((this.gslbthreshold==null && other.getGslbthreshold()==null) || 
             (this.gslbthreshold!=null &&
              java.util.Arrays.equals(this.gslbthreshold, other.getGslbthreshold()))) &&
            ((this.considereffectivestate==null && other.getConsidereffectivestate()==null) || 
             (this.considereffectivestate!=null &&
              this.considereffectivestate.equals(other.getConsidereffectivestate()))) &&
            ((this.cnameentry==null && other.getCnameentry()==null) || 
             (this.cnameentry!=null &&
              java.util.Arrays.equals(this.cnameentry, other.getCnameentry()))) &&
            ((this.totalservices==null && other.getTotalservices()==null) || 
             (this.totalservices!=null &&
              this.totalservices.equals(other.getTotalservices()))) &&
            ((this.activeservices==null && other.getActiveservices()==null) || 
             (this.activeservices!=null &&
              this.activeservices.equals(other.getActiveservices()))) &&
            ((this.statechangetimesec==null && other.getStatechangetimesec()==null) || 
             (this.statechangetimesec!=null &&
              this.statechangetimesec.equals(other.getStatechangetimesec()))) &&
            ((this.statechangetimemsec==null && other.getStatechangetimemsec()==null) || 
             (this.statechangetimemsec!=null &&
              this.statechangetimemsec.equals(other.getStatechangetimemsec()))) &&
            ((this.tickssincelaststatechange==null && other.getTickssincelaststatechange()==null) || 
             (this.tickssincelaststatechange!=null &&
              this.tickssincelaststatechange.equals(other.getTickssincelaststatechange()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.sopersistencetimeout==null && other.getSopersistencetimeout()==null) || 
             (this.sopersistencetimeout!=null &&
              this.sopersistencetimeout.equals(other.getSopersistencetimeout()))) &&
            ((this.somethod==null && other.getSomethod()==null) || 
             (this.somethod!=null &&
              this.somethod.equals(other.getSomethod()))) &&
            ((this.sobackupaction==null && other.getSobackupaction()==null) || 
             (this.sobackupaction!=null &&
              this.sobackupaction.equals(other.getSobackupaction()))) &&
            ((this.sopersistence==null && other.getSopersistence()==null) || 
             (this.sopersistence!=null &&
              this.sopersistence.equals(other.getSopersistence()))) &&
            ((this.sothreshold==null && other.getSothreshold()==null) || 
             (this.sothreshold!=null &&
              this.sothreshold.equals(other.getSothreshold()))) &&
            ((this.health==null && other.getHealth()==null) || 
             (this.health!=null &&
              this.health.equals(other.getHealth()))) &&
            ((this.appflowlog==null && other.getAppflowlog()==null) || 
             (this.appflowlog!=null &&
              this.appflowlog.equals(other.getAppflowlog()))) &&
            ((this.policyname==null && other.getPolicyname()==null) || 
             (this.policyname!=null &&
              this.policyname.equals(other.getPolicyname()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.gotopriorityexpression==null && other.getGotopriorityexpression()==null) || 
             (this.gotopriorityexpression!=null &&
              this.gotopriorityexpression.equals(other.getGotopriorityexpression()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.gslbservicetype==null && other.getGslbservicetype()==null) || 
             (this.gslbservicetype!=null &&
              java.util.Arrays.equals(this.gslbservicetype, other.getGslbservicetype()))) &&
            ((this.gslbservicecurstate==null && other.getGslbservicecurstate()==null) || 
             (this.gslbservicecurstate!=null &&
              java.util.Arrays.equals(this.gslbservicecurstate, other.getGslbservicecurstate()))) &&
            ((this.gslbsvciscname==null && other.getGslbsvciscname()==null) || 
             (this.gslbsvciscname!=null &&
              java.util.Arrays.equals(this.gslbsvciscname, other.getGslbsvciscname()))) &&
            ((this.spilloverpolicyname==null && other.getSpilloverpolicyname()==null) || 
             (this.spilloverpolicyname!=null &&
              java.util.Arrays.equals(this.spilloverpolicyname, other.getSpilloverpolicyname()))) &&
            ((this.spilloverpolicygotoprioexpression==null && other.getSpilloverpolicygotoprioexpression()==null) || 
             (this.spilloverpolicygotoprioexpression!=null &&
              java.util.Arrays.equals(this.spilloverpolicygotoprioexpression, other.getSpilloverpolicygotoprioexpression()))) &&
            ((this.spilloverpolicyflowtype==null && other.getSpilloverpolicyflowtype()==null) || 
             (this.spilloverpolicyflowtype!=null &&
              java.util.Arrays.equals(this.spilloverpolicyflowtype, other.getSpilloverpolicyflowtype()))) &&
            ((this.spilloverpolicypriority==null && other.getSpilloverpolicypriority()==null) || 
             (this.spilloverpolicypriority!=null &&
              java.util.Arrays.equals(this.spilloverpolicypriority, other.getSpilloverpolicypriority())));
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
        if (getServicetype() != null) {
            _hashCode += getServicetype().hashCode();
        }
        if (getIptype() != null) {
            _hashCode += getIptype().hashCode();
        }
        if (getDnsrecordtype() != null) {
            _hashCode += getDnsrecordtype().hashCode();
        }
        if (getPersistencetype() != null) {
            _hashCode += getPersistencetype().hashCode();
        }
        if (getPersistenceid() != null) {
            _hashCode += getPersistenceid().hashCode();
        }
        if (getLbmethod() != null) {
            _hashCode += getLbmethod().hashCode();
        }
        if (getBackuplbmethod() != null) {
            _hashCode += getBackuplbmethod().hashCode();
        }
        if (getTolerance() != null) {
            _hashCode += getTolerance().hashCode();
        }
        if (getTimeout() != null) {
            _hashCode += getTimeout().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getNetmask() != null) {
            _hashCode += getNetmask().hashCode();
        }
        if (getV6Netmasklen() != null) {
            _hashCode += getV6Netmasklen().hashCode();
        }
        if (getPersistmask() != null) {
            _hashCode += getPersistmask().hashCode();
        }
        if (getV6Persistmasklen() != null) {
            _hashCode += getV6Persistmasklen().hashCode();
        }
        if (getServicename() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicename());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicename(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWeight() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWeight());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWeight(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDomainname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDomainname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDomainname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTtl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTtl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTtl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBackupip() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBackupip());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBackupip(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCookiedomain() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCookiedomain());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCookiedomain(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCookietimeout() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCookietimeout());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCookietimeout(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSitedomainttl() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSitedomainttl());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSitedomainttl(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getPort() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPort());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPort(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getStatus();
        _hashCode += getLbrrreason();
        if (getPreferredlocation() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreferredlocation());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreferredlocation(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBackupvserver() != null) {
            _hashCode += getBackupvserver().hashCode();
        }
        if (getBackupsessiontimeout() != null) {
            _hashCode += getBackupsessiontimeout().hashCode();
        }
        if (getEdr() != null) {
            _hashCode += getEdr().hashCode();
        }
        if (getMir() != null) {
            _hashCode += getMir().hashCode();
        }
        if (getDisableprimaryondown() != null) {
            _hashCode += getDisableprimaryondown().hashCode();
        }
        if (getDynamicweight() != null) {
            _hashCode += getDynamicweight().hashCode();
        }
        if (getIscname() != null) {
            _hashCode += getIscname().hashCode();
        }
        if (getCumulativeweight() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCumulativeweight());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCumulativeweight(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDynamicconfwt() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDynamicconfwt());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDynamicconfwt(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThresholdvalue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThresholdvalue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThresholdvalue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSitepersistence() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSitepersistence());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSitepersistence(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvreffgslbstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvreffgslbstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvreffgslbstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGslbthreshold() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGslbthreshold());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGslbthreshold(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConsidereffectivestate() != null) {
            _hashCode += getConsidereffectivestate().hashCode();
        }
        if (getCnameentry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCnameentry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCnameentry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalservices() != null) {
            _hashCode += getTotalservices().hashCode();
        }
        if (getActiveservices() != null) {
            _hashCode += getActiveservices().hashCode();
        }
        if (getStatechangetimesec() != null) {
            _hashCode += getStatechangetimesec().hashCode();
        }
        if (getStatechangetimemsec() != null) {
            _hashCode += getStatechangetimemsec().hashCode();
        }
        if (getTickssincelaststatechange() != null) {
            _hashCode += getTickssincelaststatechange().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getSopersistencetimeout() != null) {
            _hashCode += getSopersistencetimeout().hashCode();
        }
        if (getSomethod() != null) {
            _hashCode += getSomethod().hashCode();
        }
        if (getSobackupaction() != null) {
            _hashCode += getSobackupaction().hashCode();
        }
        if (getSopersistence() != null) {
            _hashCode += getSopersistence().hashCode();
        }
        if (getSothreshold() != null) {
            _hashCode += getSothreshold().hashCode();
        }
        if (getHealth() != null) {
            _hashCode += getHealth().hashCode();
        }
        if (getAppflowlog() != null) {
            _hashCode += getAppflowlog().hashCode();
        }
        if (getPolicyname() != null) {
            _hashCode += getPolicyname().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getGotopriorityexpression() != null) {
            _hashCode += getGotopriorityexpression().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getGslbservicetype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGslbservicetype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGslbservicetype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGslbservicecurstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGslbservicecurstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGslbservicecurstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGslbsvciscname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGslbsvciscname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGslbsvciscname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpilloverpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpilloverpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpilloverpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpilloverpolicygotoprioexpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpilloverpolicygotoprioexpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpilloverpolicygotoprioexpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpilloverpolicyflowtype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpilloverpolicyflowtype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpilloverpolicyflowtype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpilloverpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpilloverpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpilloverpolicypriority(), i);
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
        new org.apache.axis.description.TypeDesc(Gslbvserver.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "gslbvserver"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iptype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iptype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsrecordtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnsrecordtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persistencetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "persistencetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persistenceid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "persistenceid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lbmethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lbmethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backuplbmethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backuplbmethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tolerance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tolerance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeout"));
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
        elemField.setFieldName("netmask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netmask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("v6Netmasklen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "v6netmasklen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persistmask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "persistmask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("v6Persistmasklen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "v6persistmasklen"));
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
        elemField.setFieldName("domainname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domainname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ttl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backupip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cookiedomain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cookiedomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cookietimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cookietimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitedomainttl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sitedomainttl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipaddress"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lbrrreason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lbrrreason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredlocation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preferredlocation"));
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
        elemField.setFieldName("backupsessiontimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backupsessiontimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "edr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mir");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mir"));
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
        elemField.setFieldName("dynamicweight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dynamicweight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iscname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iscname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cumulativeweight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cumulativeweight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamicconfwt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dynamicconfwt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thresholdvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thresholdvalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitepersistence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sitepersistence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svreffgslbstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svreffgslbstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gslbthreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gslbthreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("considereffectivestate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "considereffectivestate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnameentry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cnameentry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalservices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalservices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeservices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeservices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statechangetimesec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statechangetimesec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statechangetimemsec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statechangetimemsec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tickssincelaststatechange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tickssincelaststatechange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
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
        elemField.setFieldName("somethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "somethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sobackupaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sobackupaction"));
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
        elemField.setFieldName("sothreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sothreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("health");
        elemField.setXmlName(new javax.xml.namespace.QName("", "health"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appflowlog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appflowlog"));
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
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gotopriorityexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gotopriorityexpression"));
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
        elemField.setFieldName("gslbservicetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gslbservicetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gslbservicecurstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gslbservicecurstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gslbsvciscname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gslbsvciscname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spilloverpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spilloverpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spilloverpolicygotoprioexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spilloverpolicygotoprioexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spilloverpolicyflowtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spilloverpolicyflowtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spilloverpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spilloverpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
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
