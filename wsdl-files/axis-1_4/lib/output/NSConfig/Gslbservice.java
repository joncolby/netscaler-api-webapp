/**
 * Gslbservice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Gslbservice  implements java.io.Serializable {
    private java.lang.String servicename;

    private java.lang.String gslb;

    private java.lang.String ipaddress;

    private java.lang.String servername;

    private java.lang.String servicetype;

    private org.apache.axis.types.UnsignedInt port;

    private java.lang.String publicip;

    private org.apache.axis.types.UnsignedInt publicport;

    private org.apache.axis.types.UnsignedInt maxclient;

    private org.apache.axis.types.UnsignedInt maxaaausers;

    private java.lang.String sitename;

    private java.lang.String svrstate;

    private java.lang.String svreffgslbstate;

    private int gslbthreshold;

    private int gslbsvcstats;

    private java.lang.String state;

    private java.lang.String[] monitorname;

    private java.lang.String monstate;

    private java.lang.String cip;

    private java.lang.String cipheader;

    private java.lang.String sitepersistence;

    private java.lang.String siteprefix;

    private org.apache.axis.types.UnsignedInt clttimeout;

    private org.apache.axis.types.UnsignedInt svrtimeout;

    private org.apache.axis.types.UnsignedInt[] totalfailedprobes;

    private java.lang.String preferredlocation;

    private org.apache.axis.types.UnsignedInt maxbandwidth;

    private java.lang.String downstateflush;

    private java.lang.String cnameentry;

    private java.lang.String[] viewname;

    private java.lang.String[] viewip;

    private org.apache.axis.types.UnsignedInt[] weight;

    private org.apache.axis.types.UnsignedInt monthreshold;

    private org.apache.axis.types.UnsignedInt[] failedprobes;

    private int[] monstatcode;

    private int[] monstatparam1;

    private int[] monstatparam2;

    private int[] monstatparam3;

    private org.apache.axis.types.UnsignedLong[] responsetime;

    private java.lang.String monstate2;

    private org.apache.axis.types.UnsignedInt hashid;

    private java.lang.String comment;

    private java.lang.String healthmonitor;

    private java.lang.String appflowlog;

    private org.apache.axis.types.UnsignedInt[] monitortotalprobes;

    private org.apache.axis.types.UnsignedInt[] monitortotalfailedprobes;

    private org.apache.axis.types.UnsignedInt[] monitorcurrentfailedprobes;

    private java.lang.String[] boundmonstate;

    private java.lang.String[] boundmonrunningstate;

    public Gslbservice() {
    }

    public Gslbservice(
           java.lang.String servicename,
           java.lang.String gslb,
           java.lang.String ipaddress,
           java.lang.String servername,
           java.lang.String servicetype,
           org.apache.axis.types.UnsignedInt port,
           java.lang.String publicip,
           org.apache.axis.types.UnsignedInt publicport,
           org.apache.axis.types.UnsignedInt maxclient,
           org.apache.axis.types.UnsignedInt maxaaausers,
           java.lang.String sitename,
           java.lang.String svrstate,
           java.lang.String svreffgslbstate,
           int gslbthreshold,
           int gslbsvcstats,
           java.lang.String state,
           java.lang.String[] monitorname,
           java.lang.String monstate,
           java.lang.String cip,
           java.lang.String cipheader,
           java.lang.String sitepersistence,
           java.lang.String siteprefix,
           org.apache.axis.types.UnsignedInt clttimeout,
           org.apache.axis.types.UnsignedInt svrtimeout,
           org.apache.axis.types.UnsignedInt[] totalfailedprobes,
           java.lang.String preferredlocation,
           org.apache.axis.types.UnsignedInt maxbandwidth,
           java.lang.String downstateflush,
           java.lang.String cnameentry,
           java.lang.String[] viewname,
           java.lang.String[] viewip,
           org.apache.axis.types.UnsignedInt[] weight,
           org.apache.axis.types.UnsignedInt monthreshold,
           org.apache.axis.types.UnsignedInt[] failedprobes,
           int[] monstatcode,
           int[] monstatparam1,
           int[] monstatparam2,
           int[] monstatparam3,
           org.apache.axis.types.UnsignedLong[] responsetime,
           java.lang.String monstate2,
           org.apache.axis.types.UnsignedInt hashid,
           java.lang.String comment,
           java.lang.String healthmonitor,
           java.lang.String appflowlog,
           org.apache.axis.types.UnsignedInt[] monitortotalprobes,
           org.apache.axis.types.UnsignedInt[] monitortotalfailedprobes,
           org.apache.axis.types.UnsignedInt[] monitorcurrentfailedprobes,
           java.lang.String[] boundmonstate,
           java.lang.String[] boundmonrunningstate) {
           this.servicename = servicename;
           this.gslb = gslb;
           this.ipaddress = ipaddress;
           this.servername = servername;
           this.servicetype = servicetype;
           this.port = port;
           this.publicip = publicip;
           this.publicport = publicport;
           this.maxclient = maxclient;
           this.maxaaausers = maxaaausers;
           this.sitename = sitename;
           this.svrstate = svrstate;
           this.svreffgslbstate = svreffgslbstate;
           this.gslbthreshold = gslbthreshold;
           this.gslbsvcstats = gslbsvcstats;
           this.state = state;
           this.monitorname = monitorname;
           this.monstate = monstate;
           this.cip = cip;
           this.cipheader = cipheader;
           this.sitepersistence = sitepersistence;
           this.siteprefix = siteprefix;
           this.clttimeout = clttimeout;
           this.svrtimeout = svrtimeout;
           this.totalfailedprobes = totalfailedprobes;
           this.preferredlocation = preferredlocation;
           this.maxbandwidth = maxbandwidth;
           this.downstateflush = downstateflush;
           this.cnameentry = cnameentry;
           this.viewname = viewname;
           this.viewip = viewip;
           this.weight = weight;
           this.monthreshold = monthreshold;
           this.failedprobes = failedprobes;
           this.monstatcode = monstatcode;
           this.monstatparam1 = monstatparam1;
           this.monstatparam2 = monstatparam2;
           this.monstatparam3 = monstatparam3;
           this.responsetime = responsetime;
           this.monstate2 = monstate2;
           this.hashid = hashid;
           this.comment = comment;
           this.healthmonitor = healthmonitor;
           this.appflowlog = appflowlog;
           this.monitortotalprobes = monitortotalprobes;
           this.monitortotalfailedprobes = monitortotalfailedprobes;
           this.monitorcurrentfailedprobes = monitorcurrentfailedprobes;
           this.boundmonstate = boundmonstate;
           this.boundmonrunningstate = boundmonrunningstate;
    }


    /**
     * Gets the servicename value for this Gslbservice.
     * 
     * @return servicename
     */
    public java.lang.String getServicename() {
        return servicename;
    }


    /**
     * Sets the servicename value for this Gslbservice.
     * 
     * @param servicename
     */
    public void setServicename(java.lang.String servicename) {
        this.servicename = servicename;
    }


    /**
     * Gets the gslb value for this Gslbservice.
     * 
     * @return gslb
     */
    public java.lang.String getGslb() {
        return gslb;
    }


    /**
     * Sets the gslb value for this Gslbservice.
     * 
     * @param gslb
     */
    public void setGslb(java.lang.String gslb) {
        this.gslb = gslb;
    }


    /**
     * Gets the ipaddress value for this Gslbservice.
     * 
     * @return ipaddress
     */
    public java.lang.String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Gslbservice.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the servername value for this Gslbservice.
     * 
     * @return servername
     */
    public java.lang.String getServername() {
        return servername;
    }


    /**
     * Sets the servername value for this Gslbservice.
     * 
     * @param servername
     */
    public void setServername(java.lang.String servername) {
        this.servername = servername;
    }


    /**
     * Gets the servicetype value for this Gslbservice.
     * 
     * @return servicetype
     */
    public java.lang.String getServicetype() {
        return servicetype;
    }


    /**
     * Sets the servicetype value for this Gslbservice.
     * 
     * @param servicetype
     */
    public void setServicetype(java.lang.String servicetype) {
        this.servicetype = servicetype;
    }


    /**
     * Gets the port value for this Gslbservice.
     * 
     * @return port
     */
    public org.apache.axis.types.UnsignedInt getPort() {
        return port;
    }


    /**
     * Sets the port value for this Gslbservice.
     * 
     * @param port
     */
    public void setPort(org.apache.axis.types.UnsignedInt port) {
        this.port = port;
    }


    /**
     * Gets the publicip value for this Gslbservice.
     * 
     * @return publicip
     */
    public java.lang.String getPublicip() {
        return publicip;
    }


    /**
     * Sets the publicip value for this Gslbservice.
     * 
     * @param publicip
     */
    public void setPublicip(java.lang.String publicip) {
        this.publicip = publicip;
    }


    /**
     * Gets the publicport value for this Gslbservice.
     * 
     * @return publicport
     */
    public org.apache.axis.types.UnsignedInt getPublicport() {
        return publicport;
    }


    /**
     * Sets the publicport value for this Gslbservice.
     * 
     * @param publicport
     */
    public void setPublicport(org.apache.axis.types.UnsignedInt publicport) {
        this.publicport = publicport;
    }


    /**
     * Gets the maxclient value for this Gslbservice.
     * 
     * @return maxclient
     */
    public org.apache.axis.types.UnsignedInt getMaxclient() {
        return maxclient;
    }


    /**
     * Sets the maxclient value for this Gslbservice.
     * 
     * @param maxclient
     */
    public void setMaxclient(org.apache.axis.types.UnsignedInt maxclient) {
        this.maxclient = maxclient;
    }


    /**
     * Gets the maxaaausers value for this Gslbservice.
     * 
     * @return maxaaausers
     */
    public org.apache.axis.types.UnsignedInt getMaxaaausers() {
        return maxaaausers;
    }


    /**
     * Sets the maxaaausers value for this Gslbservice.
     * 
     * @param maxaaausers
     */
    public void setMaxaaausers(org.apache.axis.types.UnsignedInt maxaaausers) {
        this.maxaaausers = maxaaausers;
    }


    /**
     * Gets the sitename value for this Gslbservice.
     * 
     * @return sitename
     */
    public java.lang.String getSitename() {
        return sitename;
    }


    /**
     * Sets the sitename value for this Gslbservice.
     * 
     * @param sitename
     */
    public void setSitename(java.lang.String sitename) {
        this.sitename = sitename;
    }


    /**
     * Gets the svrstate value for this Gslbservice.
     * 
     * @return svrstate
     */
    public java.lang.String getSvrstate() {
        return svrstate;
    }


    /**
     * Sets the svrstate value for this Gslbservice.
     * 
     * @param svrstate
     */
    public void setSvrstate(java.lang.String svrstate) {
        this.svrstate = svrstate;
    }


    /**
     * Gets the svreffgslbstate value for this Gslbservice.
     * 
     * @return svreffgslbstate
     */
    public java.lang.String getSvreffgslbstate() {
        return svreffgslbstate;
    }


    /**
     * Sets the svreffgslbstate value for this Gslbservice.
     * 
     * @param svreffgslbstate
     */
    public void setSvreffgslbstate(java.lang.String svreffgslbstate) {
        this.svreffgslbstate = svreffgslbstate;
    }


    /**
     * Gets the gslbthreshold value for this Gslbservice.
     * 
     * @return gslbthreshold
     */
    public int getGslbthreshold() {
        return gslbthreshold;
    }


    /**
     * Sets the gslbthreshold value for this Gslbservice.
     * 
     * @param gslbthreshold
     */
    public void setGslbthreshold(int gslbthreshold) {
        this.gslbthreshold = gslbthreshold;
    }


    /**
     * Gets the gslbsvcstats value for this Gslbservice.
     * 
     * @return gslbsvcstats
     */
    public int getGslbsvcstats() {
        return gslbsvcstats;
    }


    /**
     * Sets the gslbsvcstats value for this Gslbservice.
     * 
     * @param gslbsvcstats
     */
    public void setGslbsvcstats(int gslbsvcstats) {
        this.gslbsvcstats = gslbsvcstats;
    }


    /**
     * Gets the state value for this Gslbservice.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Gslbservice.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the monitorname value for this Gslbservice.
     * 
     * @return monitorname
     */
    public java.lang.String[] getMonitorname() {
        return monitorname;
    }


    /**
     * Sets the monitorname value for this Gslbservice.
     * 
     * @param monitorname
     */
    public void setMonitorname(java.lang.String[] monitorname) {
        this.monitorname = monitorname;
    }


    /**
     * Gets the monstate value for this Gslbservice.
     * 
     * @return monstate
     */
    public java.lang.String getMonstate() {
        return monstate;
    }


    /**
     * Sets the monstate value for this Gslbservice.
     * 
     * @param monstate
     */
    public void setMonstate(java.lang.String monstate) {
        this.monstate = monstate;
    }


    /**
     * Gets the cip value for this Gslbservice.
     * 
     * @return cip
     */
    public java.lang.String getCip() {
        return cip;
    }


    /**
     * Sets the cip value for this Gslbservice.
     * 
     * @param cip
     */
    public void setCip(java.lang.String cip) {
        this.cip = cip;
    }


    /**
     * Gets the cipheader value for this Gslbservice.
     * 
     * @return cipheader
     */
    public java.lang.String getCipheader() {
        return cipheader;
    }


    /**
     * Sets the cipheader value for this Gslbservice.
     * 
     * @param cipheader
     */
    public void setCipheader(java.lang.String cipheader) {
        this.cipheader = cipheader;
    }


    /**
     * Gets the sitepersistence value for this Gslbservice.
     * 
     * @return sitepersistence
     */
    public java.lang.String getSitepersistence() {
        return sitepersistence;
    }


    /**
     * Sets the sitepersistence value for this Gslbservice.
     * 
     * @param sitepersistence
     */
    public void setSitepersistence(java.lang.String sitepersistence) {
        this.sitepersistence = sitepersistence;
    }


    /**
     * Gets the siteprefix value for this Gslbservice.
     * 
     * @return siteprefix
     */
    public java.lang.String getSiteprefix() {
        return siteprefix;
    }


    /**
     * Sets the siteprefix value for this Gslbservice.
     * 
     * @param siteprefix
     */
    public void setSiteprefix(java.lang.String siteprefix) {
        this.siteprefix = siteprefix;
    }


    /**
     * Gets the clttimeout value for this Gslbservice.
     * 
     * @return clttimeout
     */
    public org.apache.axis.types.UnsignedInt getClttimeout() {
        return clttimeout;
    }


    /**
     * Sets the clttimeout value for this Gslbservice.
     * 
     * @param clttimeout
     */
    public void setClttimeout(org.apache.axis.types.UnsignedInt clttimeout) {
        this.clttimeout = clttimeout;
    }


    /**
     * Gets the svrtimeout value for this Gslbservice.
     * 
     * @return svrtimeout
     */
    public org.apache.axis.types.UnsignedInt getSvrtimeout() {
        return svrtimeout;
    }


    /**
     * Sets the svrtimeout value for this Gslbservice.
     * 
     * @param svrtimeout
     */
    public void setSvrtimeout(org.apache.axis.types.UnsignedInt svrtimeout) {
        this.svrtimeout = svrtimeout;
    }


    /**
     * Gets the totalfailedprobes value for this Gslbservice.
     * 
     * @return totalfailedprobes
     */
    public org.apache.axis.types.UnsignedInt[] getTotalfailedprobes() {
        return totalfailedprobes;
    }


    /**
     * Sets the totalfailedprobes value for this Gslbservice.
     * 
     * @param totalfailedprobes
     */
    public void setTotalfailedprobes(org.apache.axis.types.UnsignedInt[] totalfailedprobes) {
        this.totalfailedprobes = totalfailedprobes;
    }


    /**
     * Gets the preferredlocation value for this Gslbservice.
     * 
     * @return preferredlocation
     */
    public java.lang.String getPreferredlocation() {
        return preferredlocation;
    }


    /**
     * Sets the preferredlocation value for this Gslbservice.
     * 
     * @param preferredlocation
     */
    public void setPreferredlocation(java.lang.String preferredlocation) {
        this.preferredlocation = preferredlocation;
    }


    /**
     * Gets the maxbandwidth value for this Gslbservice.
     * 
     * @return maxbandwidth
     */
    public org.apache.axis.types.UnsignedInt getMaxbandwidth() {
        return maxbandwidth;
    }


    /**
     * Sets the maxbandwidth value for this Gslbservice.
     * 
     * @param maxbandwidth
     */
    public void setMaxbandwidth(org.apache.axis.types.UnsignedInt maxbandwidth) {
        this.maxbandwidth = maxbandwidth;
    }


    /**
     * Gets the downstateflush value for this Gslbservice.
     * 
     * @return downstateflush
     */
    public java.lang.String getDownstateflush() {
        return downstateflush;
    }


    /**
     * Sets the downstateflush value for this Gslbservice.
     * 
     * @param downstateflush
     */
    public void setDownstateflush(java.lang.String downstateflush) {
        this.downstateflush = downstateflush;
    }


    /**
     * Gets the cnameentry value for this Gslbservice.
     * 
     * @return cnameentry
     */
    public java.lang.String getCnameentry() {
        return cnameentry;
    }


    /**
     * Sets the cnameentry value for this Gslbservice.
     * 
     * @param cnameentry
     */
    public void setCnameentry(java.lang.String cnameentry) {
        this.cnameentry = cnameentry;
    }


    /**
     * Gets the viewname value for this Gslbservice.
     * 
     * @return viewname
     */
    public java.lang.String[] getViewname() {
        return viewname;
    }


    /**
     * Sets the viewname value for this Gslbservice.
     * 
     * @param viewname
     */
    public void setViewname(java.lang.String[] viewname) {
        this.viewname = viewname;
    }


    /**
     * Gets the viewip value for this Gslbservice.
     * 
     * @return viewip
     */
    public java.lang.String[] getViewip() {
        return viewip;
    }


    /**
     * Sets the viewip value for this Gslbservice.
     * 
     * @param viewip
     */
    public void setViewip(java.lang.String[] viewip) {
        this.viewip = viewip;
    }


    /**
     * Gets the weight value for this Gslbservice.
     * 
     * @return weight
     */
    public org.apache.axis.types.UnsignedInt[] getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this Gslbservice.
     * 
     * @param weight
     */
    public void setWeight(org.apache.axis.types.UnsignedInt[] weight) {
        this.weight = weight;
    }


    /**
     * Gets the monthreshold value for this Gslbservice.
     * 
     * @return monthreshold
     */
    public org.apache.axis.types.UnsignedInt getMonthreshold() {
        return monthreshold;
    }


    /**
     * Sets the monthreshold value for this Gslbservice.
     * 
     * @param monthreshold
     */
    public void setMonthreshold(org.apache.axis.types.UnsignedInt monthreshold) {
        this.monthreshold = monthreshold;
    }


    /**
     * Gets the failedprobes value for this Gslbservice.
     * 
     * @return failedprobes
     */
    public org.apache.axis.types.UnsignedInt[] getFailedprobes() {
        return failedprobes;
    }


    /**
     * Sets the failedprobes value for this Gslbservice.
     * 
     * @param failedprobes
     */
    public void setFailedprobes(org.apache.axis.types.UnsignedInt[] failedprobes) {
        this.failedprobes = failedprobes;
    }


    /**
     * Gets the monstatcode value for this Gslbservice.
     * 
     * @return monstatcode
     */
    public int[] getMonstatcode() {
        return monstatcode;
    }


    /**
     * Sets the monstatcode value for this Gslbservice.
     * 
     * @param monstatcode
     */
    public void setMonstatcode(int[] monstatcode) {
        this.monstatcode = monstatcode;
    }


    /**
     * Gets the monstatparam1 value for this Gslbservice.
     * 
     * @return monstatparam1
     */
    public int[] getMonstatparam1() {
        return monstatparam1;
    }


    /**
     * Sets the monstatparam1 value for this Gslbservice.
     * 
     * @param monstatparam1
     */
    public void setMonstatparam1(int[] monstatparam1) {
        this.monstatparam1 = monstatparam1;
    }


    /**
     * Gets the monstatparam2 value for this Gslbservice.
     * 
     * @return monstatparam2
     */
    public int[] getMonstatparam2() {
        return monstatparam2;
    }


    /**
     * Sets the monstatparam2 value for this Gslbservice.
     * 
     * @param monstatparam2
     */
    public void setMonstatparam2(int[] monstatparam2) {
        this.monstatparam2 = monstatparam2;
    }


    /**
     * Gets the monstatparam3 value for this Gslbservice.
     * 
     * @return monstatparam3
     */
    public int[] getMonstatparam3() {
        return monstatparam3;
    }


    /**
     * Sets the monstatparam3 value for this Gslbservice.
     * 
     * @param monstatparam3
     */
    public void setMonstatparam3(int[] monstatparam3) {
        this.monstatparam3 = monstatparam3;
    }


    /**
     * Gets the responsetime value for this Gslbservice.
     * 
     * @return responsetime
     */
    public org.apache.axis.types.UnsignedLong[] getResponsetime() {
        return responsetime;
    }


    /**
     * Sets the responsetime value for this Gslbservice.
     * 
     * @param responsetime
     */
    public void setResponsetime(org.apache.axis.types.UnsignedLong[] responsetime) {
        this.responsetime = responsetime;
    }


    /**
     * Gets the monstate2 value for this Gslbservice.
     * 
     * @return monstate2
     */
    public java.lang.String getMonstate2() {
        return monstate2;
    }


    /**
     * Sets the monstate2 value for this Gslbservice.
     * 
     * @param monstate2
     */
    public void setMonstate2(java.lang.String monstate2) {
        this.monstate2 = monstate2;
    }


    /**
     * Gets the hashid value for this Gslbservice.
     * 
     * @return hashid
     */
    public org.apache.axis.types.UnsignedInt getHashid() {
        return hashid;
    }


    /**
     * Sets the hashid value for this Gslbservice.
     * 
     * @param hashid
     */
    public void setHashid(org.apache.axis.types.UnsignedInt hashid) {
        this.hashid = hashid;
    }


    /**
     * Gets the comment value for this Gslbservice.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Gslbservice.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the healthmonitor value for this Gslbservice.
     * 
     * @return healthmonitor
     */
    public java.lang.String getHealthmonitor() {
        return healthmonitor;
    }


    /**
     * Sets the healthmonitor value for this Gslbservice.
     * 
     * @param healthmonitor
     */
    public void setHealthmonitor(java.lang.String healthmonitor) {
        this.healthmonitor = healthmonitor;
    }


    /**
     * Gets the appflowlog value for this Gslbservice.
     * 
     * @return appflowlog
     */
    public java.lang.String getAppflowlog() {
        return appflowlog;
    }


    /**
     * Sets the appflowlog value for this Gslbservice.
     * 
     * @param appflowlog
     */
    public void setAppflowlog(java.lang.String appflowlog) {
        this.appflowlog = appflowlog;
    }


    /**
     * Gets the monitortotalprobes value for this Gslbservice.
     * 
     * @return monitortotalprobes
     */
    public org.apache.axis.types.UnsignedInt[] getMonitortotalprobes() {
        return monitortotalprobes;
    }


    /**
     * Sets the monitortotalprobes value for this Gslbservice.
     * 
     * @param monitortotalprobes
     */
    public void setMonitortotalprobes(org.apache.axis.types.UnsignedInt[] monitortotalprobes) {
        this.monitortotalprobes = monitortotalprobes;
    }


    /**
     * Gets the monitortotalfailedprobes value for this Gslbservice.
     * 
     * @return monitortotalfailedprobes
     */
    public org.apache.axis.types.UnsignedInt[] getMonitortotalfailedprobes() {
        return monitortotalfailedprobes;
    }


    /**
     * Sets the monitortotalfailedprobes value for this Gslbservice.
     * 
     * @param monitortotalfailedprobes
     */
    public void setMonitortotalfailedprobes(org.apache.axis.types.UnsignedInt[] monitortotalfailedprobes) {
        this.monitortotalfailedprobes = monitortotalfailedprobes;
    }


    /**
     * Gets the monitorcurrentfailedprobes value for this Gslbservice.
     * 
     * @return monitorcurrentfailedprobes
     */
    public org.apache.axis.types.UnsignedInt[] getMonitorcurrentfailedprobes() {
        return monitorcurrentfailedprobes;
    }


    /**
     * Sets the monitorcurrentfailedprobes value for this Gslbservice.
     * 
     * @param monitorcurrentfailedprobes
     */
    public void setMonitorcurrentfailedprobes(org.apache.axis.types.UnsignedInt[] monitorcurrentfailedprobes) {
        this.monitorcurrentfailedprobes = monitorcurrentfailedprobes;
    }


    /**
     * Gets the boundmonstate value for this Gslbservice.
     * 
     * @return boundmonstate
     */
    public java.lang.String[] getBoundmonstate() {
        return boundmonstate;
    }


    /**
     * Sets the boundmonstate value for this Gslbservice.
     * 
     * @param boundmonstate
     */
    public void setBoundmonstate(java.lang.String[] boundmonstate) {
        this.boundmonstate = boundmonstate;
    }


    /**
     * Gets the boundmonrunningstate value for this Gslbservice.
     * 
     * @return boundmonrunningstate
     */
    public java.lang.String[] getBoundmonrunningstate() {
        return boundmonrunningstate;
    }


    /**
     * Sets the boundmonrunningstate value for this Gslbservice.
     * 
     * @param boundmonrunningstate
     */
    public void setBoundmonrunningstate(java.lang.String[] boundmonrunningstate) {
        this.boundmonrunningstate = boundmonrunningstate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gslbservice)) return false;
        Gslbservice other = (Gslbservice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.servicename==null && other.getServicename()==null) || 
             (this.servicename!=null &&
              this.servicename.equals(other.getServicename()))) &&
            ((this.gslb==null && other.getGslb()==null) || 
             (this.gslb!=null &&
              this.gslb.equals(other.getGslb()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              this.ipaddress.equals(other.getIpaddress()))) &&
            ((this.servername==null && other.getServername()==null) || 
             (this.servername!=null &&
              this.servername.equals(other.getServername()))) &&
            ((this.servicetype==null && other.getServicetype()==null) || 
             (this.servicetype!=null &&
              this.servicetype.equals(other.getServicetype()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.publicip==null && other.getPublicip()==null) || 
             (this.publicip!=null &&
              this.publicip.equals(other.getPublicip()))) &&
            ((this.publicport==null && other.getPublicport()==null) || 
             (this.publicport!=null &&
              this.publicport.equals(other.getPublicport()))) &&
            ((this.maxclient==null && other.getMaxclient()==null) || 
             (this.maxclient!=null &&
              this.maxclient.equals(other.getMaxclient()))) &&
            ((this.maxaaausers==null && other.getMaxaaausers()==null) || 
             (this.maxaaausers!=null &&
              this.maxaaausers.equals(other.getMaxaaausers()))) &&
            ((this.sitename==null && other.getSitename()==null) || 
             (this.sitename!=null &&
              this.sitename.equals(other.getSitename()))) &&
            ((this.svrstate==null && other.getSvrstate()==null) || 
             (this.svrstate!=null &&
              this.svrstate.equals(other.getSvrstate()))) &&
            ((this.svreffgslbstate==null && other.getSvreffgslbstate()==null) || 
             (this.svreffgslbstate!=null &&
              this.svreffgslbstate.equals(other.getSvreffgslbstate()))) &&
            this.gslbthreshold == other.getGslbthreshold() &&
            this.gslbsvcstats == other.getGslbsvcstats() &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.monitorname==null && other.getMonitorname()==null) || 
             (this.monitorname!=null &&
              java.util.Arrays.equals(this.monitorname, other.getMonitorname()))) &&
            ((this.monstate==null && other.getMonstate()==null) || 
             (this.monstate!=null &&
              this.monstate.equals(other.getMonstate()))) &&
            ((this.cip==null && other.getCip()==null) || 
             (this.cip!=null &&
              this.cip.equals(other.getCip()))) &&
            ((this.cipheader==null && other.getCipheader()==null) || 
             (this.cipheader!=null &&
              this.cipheader.equals(other.getCipheader()))) &&
            ((this.sitepersistence==null && other.getSitepersistence()==null) || 
             (this.sitepersistence!=null &&
              this.sitepersistence.equals(other.getSitepersistence()))) &&
            ((this.siteprefix==null && other.getSiteprefix()==null) || 
             (this.siteprefix!=null &&
              this.siteprefix.equals(other.getSiteprefix()))) &&
            ((this.clttimeout==null && other.getClttimeout()==null) || 
             (this.clttimeout!=null &&
              this.clttimeout.equals(other.getClttimeout()))) &&
            ((this.svrtimeout==null && other.getSvrtimeout()==null) || 
             (this.svrtimeout!=null &&
              this.svrtimeout.equals(other.getSvrtimeout()))) &&
            ((this.totalfailedprobes==null && other.getTotalfailedprobes()==null) || 
             (this.totalfailedprobes!=null &&
              java.util.Arrays.equals(this.totalfailedprobes, other.getTotalfailedprobes()))) &&
            ((this.preferredlocation==null && other.getPreferredlocation()==null) || 
             (this.preferredlocation!=null &&
              this.preferredlocation.equals(other.getPreferredlocation()))) &&
            ((this.maxbandwidth==null && other.getMaxbandwidth()==null) || 
             (this.maxbandwidth!=null &&
              this.maxbandwidth.equals(other.getMaxbandwidth()))) &&
            ((this.downstateflush==null && other.getDownstateflush()==null) || 
             (this.downstateflush!=null &&
              this.downstateflush.equals(other.getDownstateflush()))) &&
            ((this.cnameentry==null && other.getCnameentry()==null) || 
             (this.cnameentry!=null &&
              this.cnameentry.equals(other.getCnameentry()))) &&
            ((this.viewname==null && other.getViewname()==null) || 
             (this.viewname!=null &&
              java.util.Arrays.equals(this.viewname, other.getViewname()))) &&
            ((this.viewip==null && other.getViewip()==null) || 
             (this.viewip!=null &&
              java.util.Arrays.equals(this.viewip, other.getViewip()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              java.util.Arrays.equals(this.weight, other.getWeight()))) &&
            ((this.monthreshold==null && other.getMonthreshold()==null) || 
             (this.monthreshold!=null &&
              this.monthreshold.equals(other.getMonthreshold()))) &&
            ((this.failedprobes==null && other.getFailedprobes()==null) || 
             (this.failedprobes!=null &&
              java.util.Arrays.equals(this.failedprobes, other.getFailedprobes()))) &&
            ((this.monstatcode==null && other.getMonstatcode()==null) || 
             (this.monstatcode!=null &&
              java.util.Arrays.equals(this.monstatcode, other.getMonstatcode()))) &&
            ((this.monstatparam1==null && other.getMonstatparam1()==null) || 
             (this.monstatparam1!=null &&
              java.util.Arrays.equals(this.monstatparam1, other.getMonstatparam1()))) &&
            ((this.monstatparam2==null && other.getMonstatparam2()==null) || 
             (this.monstatparam2!=null &&
              java.util.Arrays.equals(this.monstatparam2, other.getMonstatparam2()))) &&
            ((this.monstatparam3==null && other.getMonstatparam3()==null) || 
             (this.monstatparam3!=null &&
              java.util.Arrays.equals(this.monstatparam3, other.getMonstatparam3()))) &&
            ((this.responsetime==null && other.getResponsetime()==null) || 
             (this.responsetime!=null &&
              java.util.Arrays.equals(this.responsetime, other.getResponsetime()))) &&
            ((this.monstate2==null && other.getMonstate2()==null) || 
             (this.monstate2!=null &&
              this.monstate2.equals(other.getMonstate2()))) &&
            ((this.hashid==null && other.getHashid()==null) || 
             (this.hashid!=null &&
              this.hashid.equals(other.getHashid()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.healthmonitor==null && other.getHealthmonitor()==null) || 
             (this.healthmonitor!=null &&
              this.healthmonitor.equals(other.getHealthmonitor()))) &&
            ((this.appflowlog==null && other.getAppflowlog()==null) || 
             (this.appflowlog!=null &&
              this.appflowlog.equals(other.getAppflowlog()))) &&
            ((this.monitortotalprobes==null && other.getMonitortotalprobes()==null) || 
             (this.monitortotalprobes!=null &&
              java.util.Arrays.equals(this.monitortotalprobes, other.getMonitortotalprobes()))) &&
            ((this.monitortotalfailedprobes==null && other.getMonitortotalfailedprobes()==null) || 
             (this.monitortotalfailedprobes!=null &&
              java.util.Arrays.equals(this.monitortotalfailedprobes, other.getMonitortotalfailedprobes()))) &&
            ((this.monitorcurrentfailedprobes==null && other.getMonitorcurrentfailedprobes()==null) || 
             (this.monitorcurrentfailedprobes!=null &&
              java.util.Arrays.equals(this.monitorcurrentfailedprobes, other.getMonitorcurrentfailedprobes()))) &&
            ((this.boundmonstate==null && other.getBoundmonstate()==null) || 
             (this.boundmonstate!=null &&
              java.util.Arrays.equals(this.boundmonstate, other.getBoundmonstate()))) &&
            ((this.boundmonrunningstate==null && other.getBoundmonrunningstate()==null) || 
             (this.boundmonrunningstate!=null &&
              java.util.Arrays.equals(this.boundmonrunningstate, other.getBoundmonrunningstate())));
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
        if (getServicename() != null) {
            _hashCode += getServicename().hashCode();
        }
        if (getGslb() != null) {
            _hashCode += getGslb().hashCode();
        }
        if (getIpaddress() != null) {
            _hashCode += getIpaddress().hashCode();
        }
        if (getServername() != null) {
            _hashCode += getServername().hashCode();
        }
        if (getServicetype() != null) {
            _hashCode += getServicetype().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getPublicip() != null) {
            _hashCode += getPublicip().hashCode();
        }
        if (getPublicport() != null) {
            _hashCode += getPublicport().hashCode();
        }
        if (getMaxclient() != null) {
            _hashCode += getMaxclient().hashCode();
        }
        if (getMaxaaausers() != null) {
            _hashCode += getMaxaaausers().hashCode();
        }
        if (getSitename() != null) {
            _hashCode += getSitename().hashCode();
        }
        if (getSvrstate() != null) {
            _hashCode += getSvrstate().hashCode();
        }
        if (getSvreffgslbstate() != null) {
            _hashCode += getSvreffgslbstate().hashCode();
        }
        _hashCode += getGslbthreshold();
        _hashCode += getGslbsvcstats();
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getMonitorname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMonitorname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMonitorname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMonstate() != null) {
            _hashCode += getMonstate().hashCode();
        }
        if (getCip() != null) {
            _hashCode += getCip().hashCode();
        }
        if (getCipheader() != null) {
            _hashCode += getCipheader().hashCode();
        }
        if (getSitepersistence() != null) {
            _hashCode += getSitepersistence().hashCode();
        }
        if (getSiteprefix() != null) {
            _hashCode += getSiteprefix().hashCode();
        }
        if (getClttimeout() != null) {
            _hashCode += getClttimeout().hashCode();
        }
        if (getSvrtimeout() != null) {
            _hashCode += getSvrtimeout().hashCode();
        }
        if (getTotalfailedprobes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTotalfailedprobes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTotalfailedprobes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPreferredlocation() != null) {
            _hashCode += getPreferredlocation().hashCode();
        }
        if (getMaxbandwidth() != null) {
            _hashCode += getMaxbandwidth().hashCode();
        }
        if (getDownstateflush() != null) {
            _hashCode += getDownstateflush().hashCode();
        }
        if (getCnameentry() != null) {
            _hashCode += getCnameentry().hashCode();
        }
        if (getViewname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getViewname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getViewname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getViewip() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getViewip());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getViewip(), i);
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
        if (getMonthreshold() != null) {
            _hashCode += getMonthreshold().hashCode();
        }
        if (getFailedprobes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFailedprobes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFailedprobes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMonstatcode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMonstatcode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMonstatcode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMonstatparam1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMonstatparam1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMonstatparam1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMonstatparam2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMonstatparam2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMonstatparam2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMonstatparam3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMonstatparam3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMonstatparam3(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResponsetime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResponsetime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResponsetime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMonstate2() != null) {
            _hashCode += getMonstate2().hashCode();
        }
        if (getHashid() != null) {
            _hashCode += getHashid().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getHealthmonitor() != null) {
            _hashCode += getHealthmonitor().hashCode();
        }
        if (getAppflowlog() != null) {
            _hashCode += getAppflowlog().hashCode();
        }
        if (getMonitortotalprobes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMonitortotalprobes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMonitortotalprobes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMonitortotalfailedprobes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMonitortotalfailedprobes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMonitortotalfailedprobes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMonitorcurrentfailedprobes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMonitorcurrentfailedprobes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMonitorcurrentfailedprobes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBoundmonstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundmonstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundmonstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBoundmonrunningstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundmonrunningstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundmonrunningstate(), i);
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
        new org.apache.axis.description.TypeDesc(Gslbservice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "gslbservice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gslb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gslb"));
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
        elemField.setFieldName("servername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servername"));
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
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxclient");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxclient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxaaausers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxaaausers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sitename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svrstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svrstate"));
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
        elemField.setFieldName("gslbsvcstats");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gslbsvcstats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monitorname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monitorname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cipheader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cipheader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitepersistence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sitepersistence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteprefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siteprefix"));
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
        elemField.setFieldName("svrtimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svrtimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalfailedprobes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalfailedprobes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredlocation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preferredlocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxbandwidth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxbandwidth"));
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
        elemField.setFieldName("cnameentry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cnameentry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viewname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viewip"));
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
        elemField.setFieldName("monthreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monthreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedprobes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "failedprobes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monstatcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monstatcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monstatparam1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monstatparam1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monstatparam2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monstatparam2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monstatparam3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monstatparam3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responsetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monstate2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monstate2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hashid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hashid"));
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
        elemField.setFieldName("healthmonitor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "healthmonitor"));
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
        elemField.setFieldName("monitortotalprobes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monitortotalprobes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monitortotalfailedprobes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monitortotalfailedprobes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monitorcurrentfailedprobes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monitorcurrentfailedprobes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundmonstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundmonstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundmonrunningstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundmonrunningstate"));
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
