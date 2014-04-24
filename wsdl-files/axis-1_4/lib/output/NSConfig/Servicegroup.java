/**
 * Servicegroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Servicegroup  implements java.io.Serializable {
    private java.lang.String servicegroupname;

    private int numofconnections;

    private java.lang.String servicetype;

    private org.apache.axis.types.UnsignedInt[] port;

    private boolean serviceconftpye;

    private boolean serviceconftype;

    private java.lang.String value;

    private java.lang.String cachetype;

    private org.apache.axis.types.UnsignedInt maxclient;

    private org.apache.axis.types.UnsignedInt maxreq;

    private java.lang.String cacheable;

    private java.lang.String cip;

    private java.lang.String cipheader;

    private java.lang.String usip;

    private java.lang.String pathmonitor;

    private java.lang.String pathmonitorindv;

    private java.lang.String useproxyport;

    private org.apache.axis.types.UnsignedInt[] monweight;

    private java.lang.String sc;

    private java.lang.String sp;

    private java.lang.String rtspsessionidremap;

    private org.apache.axis.types.UnsignedInt clttimeout;

    private org.apache.axis.types.UnsignedInt svrtimeout;

    private java.lang.String cka;

    private java.lang.String tcpb;

    private java.lang.String cmp;

    private org.apache.axis.types.UnsignedInt maxbandwidth;

    private java.lang.String state;

    private java.lang.String svrstate;

    private org.apache.axis.types.UnsignedInt delay;

    private java.lang.String ip;

    private java.lang.String[] servername;

    private java.lang.String[] monitorname;

    private org.apache.axis.types.UnsignedInt monthreshold;

    private java.lang.String[] monstate;

    private org.apache.axis.types.UnsignedInt[] weight;

    private java.lang.String[] customserverid;

    private org.apache.axis.types.UnsignedInt serverid;

    private java.lang.String[] monstate2;

    private int monstatcode;

    private int monstatparam1;

    private int monstatparam2;

    private int monstatparam3;

    private org.apache.axis.types.UnsignedInt[] monitortotalprobes;

    private org.apache.axis.types.UnsignedInt[] monitortotalfailedprobes;

    private org.apache.axis.types.UnsignedInt[] monitorcurrentfailedprobes;

    private java.lang.String downstateflush;

    private java.lang.String[] lastresponse;

    private java.lang.String statechangetimesec;

    private org.apache.axis.types.UnsignedInt statechangetimemsec;

    private org.apache.axis.types.UnsignedInt timesincelaststatechange;

    private org.apache.axis.types.UnsignedInt tickssincelaststatechange;

    private org.apache.axis.types.UnsignedInt stateupdatereason;

    private org.apache.axis.types.UnsignedInt clmonowner;

    private org.apache.axis.types.UnsignedInt clmonview;

    private org.apache.axis.types.UnsignedInt groupcount;

    private java.lang.String comment;

    private java.lang.String tcpprofilename;

    private java.lang.String httpprofilename;

    private org.apache.axis.types.UnsignedInt hashid;

    private java.lang.String graceful;

    private java.lang.String healthmonitor;

    private java.lang.String appflowlog;

    private java.lang.String netprofile;

    private java.lang.String autoscale;

    private org.apache.axis.types.UnsignedInt memberport;

    private java.lang.String serviceipstr;

    private java.lang.String[] servicegroupentname2;

    private boolean[] passive;

    private org.apache.axis.types.UnsignedInt[] svcgrpmonbindweight;

    private java.lang.String[] svcgrpmonbindstate;

    private java.lang.String[] ipaddress;

    private java.lang.String[] svcstate;

    private org.apache.axis.types.UnsignedInt[] svcgrpentsvrid;

    private java.lang.String[] svcgrpentstate;

    private org.apache.axis.types.UnsignedInt[] svchashid;

    private java.lang.String[] svcgrpentgraceful;

    private org.apache.axis.types.UnsignedInt[] svcgrpentdelay;

    private org.apache.axis.types.UnsignedInt[] svcgrpentdelay1;

    public Servicegroup() {
    }

    public Servicegroup(
           java.lang.String servicegroupname,
           int numofconnections,
           java.lang.String servicetype,
           org.apache.axis.types.UnsignedInt[] port,
           boolean serviceconftpye,
           boolean serviceconftype,
           java.lang.String value,
           java.lang.String cachetype,
           org.apache.axis.types.UnsignedInt maxclient,
           org.apache.axis.types.UnsignedInt maxreq,
           java.lang.String cacheable,
           java.lang.String cip,
           java.lang.String cipheader,
           java.lang.String usip,
           java.lang.String pathmonitor,
           java.lang.String pathmonitorindv,
           java.lang.String useproxyport,
           org.apache.axis.types.UnsignedInt[] monweight,
           java.lang.String sc,
           java.lang.String sp,
           java.lang.String rtspsessionidremap,
           org.apache.axis.types.UnsignedInt clttimeout,
           org.apache.axis.types.UnsignedInt svrtimeout,
           java.lang.String cka,
           java.lang.String tcpb,
           java.lang.String cmp,
           org.apache.axis.types.UnsignedInt maxbandwidth,
           java.lang.String state,
           java.lang.String svrstate,
           org.apache.axis.types.UnsignedInt delay,
           java.lang.String ip,
           java.lang.String[] servername,
           java.lang.String[] monitorname,
           org.apache.axis.types.UnsignedInt monthreshold,
           java.lang.String[] monstate,
           org.apache.axis.types.UnsignedInt[] weight,
           java.lang.String[] customserverid,
           org.apache.axis.types.UnsignedInt serverid,
           java.lang.String[] monstate2,
           int monstatcode,
           int monstatparam1,
           int monstatparam2,
           int monstatparam3,
           org.apache.axis.types.UnsignedInt[] monitortotalprobes,
           org.apache.axis.types.UnsignedInt[] monitortotalfailedprobes,
           org.apache.axis.types.UnsignedInt[] monitorcurrentfailedprobes,
           java.lang.String downstateflush,
           java.lang.String[] lastresponse,
           java.lang.String statechangetimesec,
           org.apache.axis.types.UnsignedInt statechangetimemsec,
           org.apache.axis.types.UnsignedInt timesincelaststatechange,
           org.apache.axis.types.UnsignedInt tickssincelaststatechange,
           org.apache.axis.types.UnsignedInt stateupdatereason,
           org.apache.axis.types.UnsignedInt clmonowner,
           org.apache.axis.types.UnsignedInt clmonview,
           org.apache.axis.types.UnsignedInt groupcount,
           java.lang.String comment,
           java.lang.String tcpprofilename,
           java.lang.String httpprofilename,
           org.apache.axis.types.UnsignedInt hashid,
           java.lang.String graceful,
           java.lang.String healthmonitor,
           java.lang.String appflowlog,
           java.lang.String netprofile,
           java.lang.String autoscale,
           org.apache.axis.types.UnsignedInt memberport,
           java.lang.String serviceipstr,
           java.lang.String[] servicegroupentname2,
           boolean[] passive,
           org.apache.axis.types.UnsignedInt[] svcgrpmonbindweight,
           java.lang.String[] svcgrpmonbindstate,
           java.lang.String[] ipaddress,
           java.lang.String[] svcstate,
           org.apache.axis.types.UnsignedInt[] svcgrpentsvrid,
           java.lang.String[] svcgrpentstate,
           org.apache.axis.types.UnsignedInt[] svchashid,
           java.lang.String[] svcgrpentgraceful,
           org.apache.axis.types.UnsignedInt[] svcgrpentdelay,
           org.apache.axis.types.UnsignedInt[] svcgrpentdelay1) {
           this.servicegroupname = servicegroupname;
           this.numofconnections = numofconnections;
           this.servicetype = servicetype;
           this.port = port;
           this.serviceconftpye = serviceconftpye;
           this.serviceconftype = serviceconftype;
           this.value = value;
           this.cachetype = cachetype;
           this.maxclient = maxclient;
           this.maxreq = maxreq;
           this.cacheable = cacheable;
           this.cip = cip;
           this.cipheader = cipheader;
           this.usip = usip;
           this.pathmonitor = pathmonitor;
           this.pathmonitorindv = pathmonitorindv;
           this.useproxyport = useproxyport;
           this.monweight = monweight;
           this.sc = sc;
           this.sp = sp;
           this.rtspsessionidremap = rtspsessionidremap;
           this.clttimeout = clttimeout;
           this.svrtimeout = svrtimeout;
           this.cka = cka;
           this.tcpb = tcpb;
           this.cmp = cmp;
           this.maxbandwidth = maxbandwidth;
           this.state = state;
           this.svrstate = svrstate;
           this.delay = delay;
           this.ip = ip;
           this.servername = servername;
           this.monitorname = monitorname;
           this.monthreshold = monthreshold;
           this.monstate = monstate;
           this.weight = weight;
           this.customserverid = customserverid;
           this.serverid = serverid;
           this.monstate2 = monstate2;
           this.monstatcode = monstatcode;
           this.monstatparam1 = monstatparam1;
           this.monstatparam2 = monstatparam2;
           this.monstatparam3 = monstatparam3;
           this.monitortotalprobes = monitortotalprobes;
           this.monitortotalfailedprobes = monitortotalfailedprobes;
           this.monitorcurrentfailedprobes = monitorcurrentfailedprobes;
           this.downstateflush = downstateflush;
           this.lastresponse = lastresponse;
           this.statechangetimesec = statechangetimesec;
           this.statechangetimemsec = statechangetimemsec;
           this.timesincelaststatechange = timesincelaststatechange;
           this.tickssincelaststatechange = tickssincelaststatechange;
           this.stateupdatereason = stateupdatereason;
           this.clmonowner = clmonowner;
           this.clmonview = clmonview;
           this.groupcount = groupcount;
           this.comment = comment;
           this.tcpprofilename = tcpprofilename;
           this.httpprofilename = httpprofilename;
           this.hashid = hashid;
           this.graceful = graceful;
           this.healthmonitor = healthmonitor;
           this.appflowlog = appflowlog;
           this.netprofile = netprofile;
           this.autoscale = autoscale;
           this.memberport = memberport;
           this.serviceipstr = serviceipstr;
           this.servicegroupentname2 = servicegroupentname2;
           this.passive = passive;
           this.svcgrpmonbindweight = svcgrpmonbindweight;
           this.svcgrpmonbindstate = svcgrpmonbindstate;
           this.ipaddress = ipaddress;
           this.svcstate = svcstate;
           this.svcgrpentsvrid = svcgrpentsvrid;
           this.svcgrpentstate = svcgrpentstate;
           this.svchashid = svchashid;
           this.svcgrpentgraceful = svcgrpentgraceful;
           this.svcgrpentdelay = svcgrpentdelay;
           this.svcgrpentdelay1 = svcgrpentdelay1;
    }


    /**
     * Gets the servicegroupname value for this Servicegroup.
     * 
     * @return servicegroupname
     */
    public java.lang.String getServicegroupname() {
        return servicegroupname;
    }


    /**
     * Sets the servicegroupname value for this Servicegroup.
     * 
     * @param servicegroupname
     */
    public void setServicegroupname(java.lang.String servicegroupname) {
        this.servicegroupname = servicegroupname;
    }


    /**
     * Gets the numofconnections value for this Servicegroup.
     * 
     * @return numofconnections
     */
    public int getNumofconnections() {
        return numofconnections;
    }


    /**
     * Sets the numofconnections value for this Servicegroup.
     * 
     * @param numofconnections
     */
    public void setNumofconnections(int numofconnections) {
        this.numofconnections = numofconnections;
    }


    /**
     * Gets the servicetype value for this Servicegroup.
     * 
     * @return servicetype
     */
    public java.lang.String getServicetype() {
        return servicetype;
    }


    /**
     * Sets the servicetype value for this Servicegroup.
     * 
     * @param servicetype
     */
    public void setServicetype(java.lang.String servicetype) {
        this.servicetype = servicetype;
    }


    /**
     * Gets the port value for this Servicegroup.
     * 
     * @return port
     */
    public org.apache.axis.types.UnsignedInt[] getPort() {
        return port;
    }


    /**
     * Sets the port value for this Servicegroup.
     * 
     * @param port
     */
    public void setPort(org.apache.axis.types.UnsignedInt[] port) {
        this.port = port;
    }


    /**
     * Gets the serviceconftpye value for this Servicegroup.
     * 
     * @return serviceconftpye
     */
    public boolean isServiceconftpye() {
        return serviceconftpye;
    }


    /**
     * Sets the serviceconftpye value for this Servicegroup.
     * 
     * @param serviceconftpye
     */
    public void setServiceconftpye(boolean serviceconftpye) {
        this.serviceconftpye = serviceconftpye;
    }


    /**
     * Gets the serviceconftype value for this Servicegroup.
     * 
     * @return serviceconftype
     */
    public boolean isServiceconftype() {
        return serviceconftype;
    }


    /**
     * Sets the serviceconftype value for this Servicegroup.
     * 
     * @param serviceconftype
     */
    public void setServiceconftype(boolean serviceconftype) {
        this.serviceconftype = serviceconftype;
    }


    /**
     * Gets the value value for this Servicegroup.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this Servicegroup.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the cachetype value for this Servicegroup.
     * 
     * @return cachetype
     */
    public java.lang.String getCachetype() {
        return cachetype;
    }


    /**
     * Sets the cachetype value for this Servicegroup.
     * 
     * @param cachetype
     */
    public void setCachetype(java.lang.String cachetype) {
        this.cachetype = cachetype;
    }


    /**
     * Gets the maxclient value for this Servicegroup.
     * 
     * @return maxclient
     */
    public org.apache.axis.types.UnsignedInt getMaxclient() {
        return maxclient;
    }


    /**
     * Sets the maxclient value for this Servicegroup.
     * 
     * @param maxclient
     */
    public void setMaxclient(org.apache.axis.types.UnsignedInt maxclient) {
        this.maxclient = maxclient;
    }


    /**
     * Gets the maxreq value for this Servicegroup.
     * 
     * @return maxreq
     */
    public org.apache.axis.types.UnsignedInt getMaxreq() {
        return maxreq;
    }


    /**
     * Sets the maxreq value for this Servicegroup.
     * 
     * @param maxreq
     */
    public void setMaxreq(org.apache.axis.types.UnsignedInt maxreq) {
        this.maxreq = maxreq;
    }


    /**
     * Gets the cacheable value for this Servicegroup.
     * 
     * @return cacheable
     */
    public java.lang.String getCacheable() {
        return cacheable;
    }


    /**
     * Sets the cacheable value for this Servicegroup.
     * 
     * @param cacheable
     */
    public void setCacheable(java.lang.String cacheable) {
        this.cacheable = cacheable;
    }


    /**
     * Gets the cip value for this Servicegroup.
     * 
     * @return cip
     */
    public java.lang.String getCip() {
        return cip;
    }


    /**
     * Sets the cip value for this Servicegroup.
     * 
     * @param cip
     */
    public void setCip(java.lang.String cip) {
        this.cip = cip;
    }


    /**
     * Gets the cipheader value for this Servicegroup.
     * 
     * @return cipheader
     */
    public java.lang.String getCipheader() {
        return cipheader;
    }


    /**
     * Sets the cipheader value for this Servicegroup.
     * 
     * @param cipheader
     */
    public void setCipheader(java.lang.String cipheader) {
        this.cipheader = cipheader;
    }


    /**
     * Gets the usip value for this Servicegroup.
     * 
     * @return usip
     */
    public java.lang.String getUsip() {
        return usip;
    }


    /**
     * Sets the usip value for this Servicegroup.
     * 
     * @param usip
     */
    public void setUsip(java.lang.String usip) {
        this.usip = usip;
    }


    /**
     * Gets the pathmonitor value for this Servicegroup.
     * 
     * @return pathmonitor
     */
    public java.lang.String getPathmonitor() {
        return pathmonitor;
    }


    /**
     * Sets the pathmonitor value for this Servicegroup.
     * 
     * @param pathmonitor
     */
    public void setPathmonitor(java.lang.String pathmonitor) {
        this.pathmonitor = pathmonitor;
    }


    /**
     * Gets the pathmonitorindv value for this Servicegroup.
     * 
     * @return pathmonitorindv
     */
    public java.lang.String getPathmonitorindv() {
        return pathmonitorindv;
    }


    /**
     * Sets the pathmonitorindv value for this Servicegroup.
     * 
     * @param pathmonitorindv
     */
    public void setPathmonitorindv(java.lang.String pathmonitorindv) {
        this.pathmonitorindv = pathmonitorindv;
    }


    /**
     * Gets the useproxyport value for this Servicegroup.
     * 
     * @return useproxyport
     */
    public java.lang.String getUseproxyport() {
        return useproxyport;
    }


    /**
     * Sets the useproxyport value for this Servicegroup.
     * 
     * @param useproxyport
     */
    public void setUseproxyport(java.lang.String useproxyport) {
        this.useproxyport = useproxyport;
    }


    /**
     * Gets the monweight value for this Servicegroup.
     * 
     * @return monweight
     */
    public org.apache.axis.types.UnsignedInt[] getMonweight() {
        return monweight;
    }


    /**
     * Sets the monweight value for this Servicegroup.
     * 
     * @param monweight
     */
    public void setMonweight(org.apache.axis.types.UnsignedInt[] monweight) {
        this.monweight = monweight;
    }


    /**
     * Gets the sc value for this Servicegroup.
     * 
     * @return sc
     */
    public java.lang.String getSc() {
        return sc;
    }


    /**
     * Sets the sc value for this Servicegroup.
     * 
     * @param sc
     */
    public void setSc(java.lang.String sc) {
        this.sc = sc;
    }


    /**
     * Gets the sp value for this Servicegroup.
     * 
     * @return sp
     */
    public java.lang.String getSp() {
        return sp;
    }


    /**
     * Sets the sp value for this Servicegroup.
     * 
     * @param sp
     */
    public void setSp(java.lang.String sp) {
        this.sp = sp;
    }


    /**
     * Gets the rtspsessionidremap value for this Servicegroup.
     * 
     * @return rtspsessionidremap
     */
    public java.lang.String getRtspsessionidremap() {
        return rtspsessionidremap;
    }


    /**
     * Sets the rtspsessionidremap value for this Servicegroup.
     * 
     * @param rtspsessionidremap
     */
    public void setRtspsessionidremap(java.lang.String rtspsessionidremap) {
        this.rtspsessionidremap = rtspsessionidremap;
    }


    /**
     * Gets the clttimeout value for this Servicegroup.
     * 
     * @return clttimeout
     */
    public org.apache.axis.types.UnsignedInt getClttimeout() {
        return clttimeout;
    }


    /**
     * Sets the clttimeout value for this Servicegroup.
     * 
     * @param clttimeout
     */
    public void setClttimeout(org.apache.axis.types.UnsignedInt clttimeout) {
        this.clttimeout = clttimeout;
    }


    /**
     * Gets the svrtimeout value for this Servicegroup.
     * 
     * @return svrtimeout
     */
    public org.apache.axis.types.UnsignedInt getSvrtimeout() {
        return svrtimeout;
    }


    /**
     * Sets the svrtimeout value for this Servicegroup.
     * 
     * @param svrtimeout
     */
    public void setSvrtimeout(org.apache.axis.types.UnsignedInt svrtimeout) {
        this.svrtimeout = svrtimeout;
    }


    /**
     * Gets the cka value for this Servicegroup.
     * 
     * @return cka
     */
    public java.lang.String getCka() {
        return cka;
    }


    /**
     * Sets the cka value for this Servicegroup.
     * 
     * @param cka
     */
    public void setCka(java.lang.String cka) {
        this.cka = cka;
    }


    /**
     * Gets the tcpb value for this Servicegroup.
     * 
     * @return tcpb
     */
    public java.lang.String getTcpb() {
        return tcpb;
    }


    /**
     * Sets the tcpb value for this Servicegroup.
     * 
     * @param tcpb
     */
    public void setTcpb(java.lang.String tcpb) {
        this.tcpb = tcpb;
    }


    /**
     * Gets the cmp value for this Servicegroup.
     * 
     * @return cmp
     */
    public java.lang.String getCmp() {
        return cmp;
    }


    /**
     * Sets the cmp value for this Servicegroup.
     * 
     * @param cmp
     */
    public void setCmp(java.lang.String cmp) {
        this.cmp = cmp;
    }


    /**
     * Gets the maxbandwidth value for this Servicegroup.
     * 
     * @return maxbandwidth
     */
    public org.apache.axis.types.UnsignedInt getMaxbandwidth() {
        return maxbandwidth;
    }


    /**
     * Sets the maxbandwidth value for this Servicegroup.
     * 
     * @param maxbandwidth
     */
    public void setMaxbandwidth(org.apache.axis.types.UnsignedInt maxbandwidth) {
        this.maxbandwidth = maxbandwidth;
    }


    /**
     * Gets the state value for this Servicegroup.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Servicegroup.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the svrstate value for this Servicegroup.
     * 
     * @return svrstate
     */
    public java.lang.String getSvrstate() {
        return svrstate;
    }


    /**
     * Sets the svrstate value for this Servicegroup.
     * 
     * @param svrstate
     */
    public void setSvrstate(java.lang.String svrstate) {
        this.svrstate = svrstate;
    }


    /**
     * Gets the delay value for this Servicegroup.
     * 
     * @return delay
     */
    public org.apache.axis.types.UnsignedInt getDelay() {
        return delay;
    }


    /**
     * Sets the delay value for this Servicegroup.
     * 
     * @param delay
     */
    public void setDelay(org.apache.axis.types.UnsignedInt delay) {
        this.delay = delay;
    }


    /**
     * Gets the ip value for this Servicegroup.
     * 
     * @return ip
     */
    public java.lang.String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this Servicegroup.
     * 
     * @param ip
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }


    /**
     * Gets the servername value for this Servicegroup.
     * 
     * @return servername
     */
    public java.lang.String[] getServername() {
        return servername;
    }


    /**
     * Sets the servername value for this Servicegroup.
     * 
     * @param servername
     */
    public void setServername(java.lang.String[] servername) {
        this.servername = servername;
    }


    /**
     * Gets the monitorname value for this Servicegroup.
     * 
     * @return monitorname
     */
    public java.lang.String[] getMonitorname() {
        return monitorname;
    }


    /**
     * Sets the monitorname value for this Servicegroup.
     * 
     * @param monitorname
     */
    public void setMonitorname(java.lang.String[] monitorname) {
        this.monitorname = monitorname;
    }


    /**
     * Gets the monthreshold value for this Servicegroup.
     * 
     * @return monthreshold
     */
    public org.apache.axis.types.UnsignedInt getMonthreshold() {
        return monthreshold;
    }


    /**
     * Sets the monthreshold value for this Servicegroup.
     * 
     * @param monthreshold
     */
    public void setMonthreshold(org.apache.axis.types.UnsignedInt monthreshold) {
        this.monthreshold = monthreshold;
    }


    /**
     * Gets the monstate value for this Servicegroup.
     * 
     * @return monstate
     */
    public java.lang.String[] getMonstate() {
        return monstate;
    }


    /**
     * Sets the monstate value for this Servicegroup.
     * 
     * @param monstate
     */
    public void setMonstate(java.lang.String[] monstate) {
        this.monstate = monstate;
    }


    /**
     * Gets the weight value for this Servicegroup.
     * 
     * @return weight
     */
    public org.apache.axis.types.UnsignedInt[] getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this Servicegroup.
     * 
     * @param weight
     */
    public void setWeight(org.apache.axis.types.UnsignedInt[] weight) {
        this.weight = weight;
    }


    /**
     * Gets the customserverid value for this Servicegroup.
     * 
     * @return customserverid
     */
    public java.lang.String[] getCustomserverid() {
        return customserverid;
    }


    /**
     * Sets the customserverid value for this Servicegroup.
     * 
     * @param customserverid
     */
    public void setCustomserverid(java.lang.String[] customserverid) {
        this.customserverid = customserverid;
    }


    /**
     * Gets the serverid value for this Servicegroup.
     * 
     * @return serverid
     */
    public org.apache.axis.types.UnsignedInt getServerid() {
        return serverid;
    }


    /**
     * Sets the serverid value for this Servicegroup.
     * 
     * @param serverid
     */
    public void setServerid(org.apache.axis.types.UnsignedInt serverid) {
        this.serverid = serverid;
    }


    /**
     * Gets the monstate2 value for this Servicegroup.
     * 
     * @return monstate2
     */
    public java.lang.String[] getMonstate2() {
        return monstate2;
    }


    /**
     * Sets the monstate2 value for this Servicegroup.
     * 
     * @param monstate2
     */
    public void setMonstate2(java.lang.String[] monstate2) {
        this.monstate2 = monstate2;
    }


    /**
     * Gets the monstatcode value for this Servicegroup.
     * 
     * @return monstatcode
     */
    public int getMonstatcode() {
        return monstatcode;
    }


    /**
     * Sets the monstatcode value for this Servicegroup.
     * 
     * @param monstatcode
     */
    public void setMonstatcode(int monstatcode) {
        this.monstatcode = monstatcode;
    }


    /**
     * Gets the monstatparam1 value for this Servicegroup.
     * 
     * @return monstatparam1
     */
    public int getMonstatparam1() {
        return monstatparam1;
    }


    /**
     * Sets the monstatparam1 value for this Servicegroup.
     * 
     * @param monstatparam1
     */
    public void setMonstatparam1(int monstatparam1) {
        this.monstatparam1 = monstatparam1;
    }


    /**
     * Gets the monstatparam2 value for this Servicegroup.
     * 
     * @return monstatparam2
     */
    public int getMonstatparam2() {
        return monstatparam2;
    }


    /**
     * Sets the monstatparam2 value for this Servicegroup.
     * 
     * @param monstatparam2
     */
    public void setMonstatparam2(int monstatparam2) {
        this.monstatparam2 = monstatparam2;
    }


    /**
     * Gets the monstatparam3 value for this Servicegroup.
     * 
     * @return monstatparam3
     */
    public int getMonstatparam3() {
        return monstatparam3;
    }


    /**
     * Sets the monstatparam3 value for this Servicegroup.
     * 
     * @param monstatparam3
     */
    public void setMonstatparam3(int monstatparam3) {
        this.monstatparam3 = monstatparam3;
    }


    /**
     * Gets the monitortotalprobes value for this Servicegroup.
     * 
     * @return monitortotalprobes
     */
    public org.apache.axis.types.UnsignedInt[] getMonitortotalprobes() {
        return monitortotalprobes;
    }


    /**
     * Sets the monitortotalprobes value for this Servicegroup.
     * 
     * @param monitortotalprobes
     */
    public void setMonitortotalprobes(org.apache.axis.types.UnsignedInt[] monitortotalprobes) {
        this.monitortotalprobes = monitortotalprobes;
    }


    /**
     * Gets the monitortotalfailedprobes value for this Servicegroup.
     * 
     * @return monitortotalfailedprobes
     */
    public org.apache.axis.types.UnsignedInt[] getMonitortotalfailedprobes() {
        return monitortotalfailedprobes;
    }


    /**
     * Sets the monitortotalfailedprobes value for this Servicegroup.
     * 
     * @param monitortotalfailedprobes
     */
    public void setMonitortotalfailedprobes(org.apache.axis.types.UnsignedInt[] monitortotalfailedprobes) {
        this.monitortotalfailedprobes = monitortotalfailedprobes;
    }


    /**
     * Gets the monitorcurrentfailedprobes value for this Servicegroup.
     * 
     * @return monitorcurrentfailedprobes
     */
    public org.apache.axis.types.UnsignedInt[] getMonitorcurrentfailedprobes() {
        return monitorcurrentfailedprobes;
    }


    /**
     * Sets the monitorcurrentfailedprobes value for this Servicegroup.
     * 
     * @param monitorcurrentfailedprobes
     */
    public void setMonitorcurrentfailedprobes(org.apache.axis.types.UnsignedInt[] monitorcurrentfailedprobes) {
        this.monitorcurrentfailedprobes = monitorcurrentfailedprobes;
    }


    /**
     * Gets the downstateflush value for this Servicegroup.
     * 
     * @return downstateflush
     */
    public java.lang.String getDownstateflush() {
        return downstateflush;
    }


    /**
     * Sets the downstateflush value for this Servicegroup.
     * 
     * @param downstateflush
     */
    public void setDownstateflush(java.lang.String downstateflush) {
        this.downstateflush = downstateflush;
    }


    /**
     * Gets the lastresponse value for this Servicegroup.
     * 
     * @return lastresponse
     */
    public java.lang.String[] getLastresponse() {
        return lastresponse;
    }


    /**
     * Sets the lastresponse value for this Servicegroup.
     * 
     * @param lastresponse
     */
    public void setLastresponse(java.lang.String[] lastresponse) {
        this.lastresponse = lastresponse;
    }


    /**
     * Gets the statechangetimesec value for this Servicegroup.
     * 
     * @return statechangetimesec
     */
    public java.lang.String getStatechangetimesec() {
        return statechangetimesec;
    }


    /**
     * Sets the statechangetimesec value for this Servicegroup.
     * 
     * @param statechangetimesec
     */
    public void setStatechangetimesec(java.lang.String statechangetimesec) {
        this.statechangetimesec = statechangetimesec;
    }


    /**
     * Gets the statechangetimemsec value for this Servicegroup.
     * 
     * @return statechangetimemsec
     */
    public org.apache.axis.types.UnsignedInt getStatechangetimemsec() {
        return statechangetimemsec;
    }


    /**
     * Sets the statechangetimemsec value for this Servicegroup.
     * 
     * @param statechangetimemsec
     */
    public void setStatechangetimemsec(org.apache.axis.types.UnsignedInt statechangetimemsec) {
        this.statechangetimemsec = statechangetimemsec;
    }


    /**
     * Gets the timesincelaststatechange value for this Servicegroup.
     * 
     * @return timesincelaststatechange
     */
    public org.apache.axis.types.UnsignedInt getTimesincelaststatechange() {
        return timesincelaststatechange;
    }


    /**
     * Sets the timesincelaststatechange value for this Servicegroup.
     * 
     * @param timesincelaststatechange
     */
    public void setTimesincelaststatechange(org.apache.axis.types.UnsignedInt timesincelaststatechange) {
        this.timesincelaststatechange = timesincelaststatechange;
    }


    /**
     * Gets the tickssincelaststatechange value for this Servicegroup.
     * 
     * @return tickssincelaststatechange
     */
    public org.apache.axis.types.UnsignedInt getTickssincelaststatechange() {
        return tickssincelaststatechange;
    }


    /**
     * Sets the tickssincelaststatechange value for this Servicegroup.
     * 
     * @param tickssincelaststatechange
     */
    public void setTickssincelaststatechange(org.apache.axis.types.UnsignedInt tickssincelaststatechange) {
        this.tickssincelaststatechange = tickssincelaststatechange;
    }


    /**
     * Gets the stateupdatereason value for this Servicegroup.
     * 
     * @return stateupdatereason
     */
    public org.apache.axis.types.UnsignedInt getStateupdatereason() {
        return stateupdatereason;
    }


    /**
     * Sets the stateupdatereason value for this Servicegroup.
     * 
     * @param stateupdatereason
     */
    public void setStateupdatereason(org.apache.axis.types.UnsignedInt stateupdatereason) {
        this.stateupdatereason = stateupdatereason;
    }


    /**
     * Gets the clmonowner value for this Servicegroup.
     * 
     * @return clmonowner
     */
    public org.apache.axis.types.UnsignedInt getClmonowner() {
        return clmonowner;
    }


    /**
     * Sets the clmonowner value for this Servicegroup.
     * 
     * @param clmonowner
     */
    public void setClmonowner(org.apache.axis.types.UnsignedInt clmonowner) {
        this.clmonowner = clmonowner;
    }


    /**
     * Gets the clmonview value for this Servicegroup.
     * 
     * @return clmonview
     */
    public org.apache.axis.types.UnsignedInt getClmonview() {
        return clmonview;
    }


    /**
     * Sets the clmonview value for this Servicegroup.
     * 
     * @param clmonview
     */
    public void setClmonview(org.apache.axis.types.UnsignedInt clmonview) {
        this.clmonview = clmonview;
    }


    /**
     * Gets the groupcount value for this Servicegroup.
     * 
     * @return groupcount
     */
    public org.apache.axis.types.UnsignedInt getGroupcount() {
        return groupcount;
    }


    /**
     * Sets the groupcount value for this Servicegroup.
     * 
     * @param groupcount
     */
    public void setGroupcount(org.apache.axis.types.UnsignedInt groupcount) {
        this.groupcount = groupcount;
    }


    /**
     * Gets the comment value for this Servicegroup.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Servicegroup.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the tcpprofilename value for this Servicegroup.
     * 
     * @return tcpprofilename
     */
    public java.lang.String getTcpprofilename() {
        return tcpprofilename;
    }


    /**
     * Sets the tcpprofilename value for this Servicegroup.
     * 
     * @param tcpprofilename
     */
    public void setTcpprofilename(java.lang.String tcpprofilename) {
        this.tcpprofilename = tcpprofilename;
    }


    /**
     * Gets the httpprofilename value for this Servicegroup.
     * 
     * @return httpprofilename
     */
    public java.lang.String getHttpprofilename() {
        return httpprofilename;
    }


    /**
     * Sets the httpprofilename value for this Servicegroup.
     * 
     * @param httpprofilename
     */
    public void setHttpprofilename(java.lang.String httpprofilename) {
        this.httpprofilename = httpprofilename;
    }


    /**
     * Gets the hashid value for this Servicegroup.
     * 
     * @return hashid
     */
    public org.apache.axis.types.UnsignedInt getHashid() {
        return hashid;
    }


    /**
     * Sets the hashid value for this Servicegroup.
     * 
     * @param hashid
     */
    public void setHashid(org.apache.axis.types.UnsignedInt hashid) {
        this.hashid = hashid;
    }


    /**
     * Gets the graceful value for this Servicegroup.
     * 
     * @return graceful
     */
    public java.lang.String getGraceful() {
        return graceful;
    }


    /**
     * Sets the graceful value for this Servicegroup.
     * 
     * @param graceful
     */
    public void setGraceful(java.lang.String graceful) {
        this.graceful = graceful;
    }


    /**
     * Gets the healthmonitor value for this Servicegroup.
     * 
     * @return healthmonitor
     */
    public java.lang.String getHealthmonitor() {
        return healthmonitor;
    }


    /**
     * Sets the healthmonitor value for this Servicegroup.
     * 
     * @param healthmonitor
     */
    public void setHealthmonitor(java.lang.String healthmonitor) {
        this.healthmonitor = healthmonitor;
    }


    /**
     * Gets the appflowlog value for this Servicegroup.
     * 
     * @return appflowlog
     */
    public java.lang.String getAppflowlog() {
        return appflowlog;
    }


    /**
     * Sets the appflowlog value for this Servicegroup.
     * 
     * @param appflowlog
     */
    public void setAppflowlog(java.lang.String appflowlog) {
        this.appflowlog = appflowlog;
    }


    /**
     * Gets the netprofile value for this Servicegroup.
     * 
     * @return netprofile
     */
    public java.lang.String getNetprofile() {
        return netprofile;
    }


    /**
     * Sets the netprofile value for this Servicegroup.
     * 
     * @param netprofile
     */
    public void setNetprofile(java.lang.String netprofile) {
        this.netprofile = netprofile;
    }


    /**
     * Gets the autoscale value for this Servicegroup.
     * 
     * @return autoscale
     */
    public java.lang.String getAutoscale() {
        return autoscale;
    }


    /**
     * Sets the autoscale value for this Servicegroup.
     * 
     * @param autoscale
     */
    public void setAutoscale(java.lang.String autoscale) {
        this.autoscale = autoscale;
    }


    /**
     * Gets the memberport value for this Servicegroup.
     * 
     * @return memberport
     */
    public org.apache.axis.types.UnsignedInt getMemberport() {
        return memberport;
    }


    /**
     * Sets the memberport value for this Servicegroup.
     * 
     * @param memberport
     */
    public void setMemberport(org.apache.axis.types.UnsignedInt memberport) {
        this.memberport = memberport;
    }


    /**
     * Gets the serviceipstr value for this Servicegroup.
     * 
     * @return serviceipstr
     */
    public java.lang.String getServiceipstr() {
        return serviceipstr;
    }


    /**
     * Sets the serviceipstr value for this Servicegroup.
     * 
     * @param serviceipstr
     */
    public void setServiceipstr(java.lang.String serviceipstr) {
        this.serviceipstr = serviceipstr;
    }


    /**
     * Gets the servicegroupentname2 value for this Servicegroup.
     * 
     * @return servicegroupentname2
     */
    public java.lang.String[] getServicegroupentname2() {
        return servicegroupentname2;
    }


    /**
     * Sets the servicegroupentname2 value for this Servicegroup.
     * 
     * @param servicegroupentname2
     */
    public void setServicegroupentname2(java.lang.String[] servicegroupentname2) {
        this.servicegroupentname2 = servicegroupentname2;
    }


    /**
     * Gets the passive value for this Servicegroup.
     * 
     * @return passive
     */
    public boolean[] getPassive() {
        return passive;
    }


    /**
     * Sets the passive value for this Servicegroup.
     * 
     * @param passive
     */
    public void setPassive(boolean[] passive) {
        this.passive = passive;
    }


    /**
     * Gets the svcgrpmonbindweight value for this Servicegroup.
     * 
     * @return svcgrpmonbindweight
     */
    public org.apache.axis.types.UnsignedInt[] getSvcgrpmonbindweight() {
        return svcgrpmonbindweight;
    }


    /**
     * Sets the svcgrpmonbindweight value for this Servicegroup.
     * 
     * @param svcgrpmonbindweight
     */
    public void setSvcgrpmonbindweight(org.apache.axis.types.UnsignedInt[] svcgrpmonbindweight) {
        this.svcgrpmonbindweight = svcgrpmonbindweight;
    }


    /**
     * Gets the svcgrpmonbindstate value for this Servicegroup.
     * 
     * @return svcgrpmonbindstate
     */
    public java.lang.String[] getSvcgrpmonbindstate() {
        return svcgrpmonbindstate;
    }


    /**
     * Sets the svcgrpmonbindstate value for this Servicegroup.
     * 
     * @param svcgrpmonbindstate
     */
    public void setSvcgrpmonbindstate(java.lang.String[] svcgrpmonbindstate) {
        this.svcgrpmonbindstate = svcgrpmonbindstate;
    }


    /**
     * Gets the ipaddress value for this Servicegroup.
     * 
     * @return ipaddress
     */
    public java.lang.String[] getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Servicegroup.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String[] ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the svcstate value for this Servicegroup.
     * 
     * @return svcstate
     */
    public java.lang.String[] getSvcstate() {
        return svcstate;
    }


    /**
     * Sets the svcstate value for this Servicegroup.
     * 
     * @param svcstate
     */
    public void setSvcstate(java.lang.String[] svcstate) {
        this.svcstate = svcstate;
    }


    /**
     * Gets the svcgrpentsvrid value for this Servicegroup.
     * 
     * @return svcgrpentsvrid
     */
    public org.apache.axis.types.UnsignedInt[] getSvcgrpentsvrid() {
        return svcgrpentsvrid;
    }


    /**
     * Sets the svcgrpentsvrid value for this Servicegroup.
     * 
     * @param svcgrpentsvrid
     */
    public void setSvcgrpentsvrid(org.apache.axis.types.UnsignedInt[] svcgrpentsvrid) {
        this.svcgrpentsvrid = svcgrpentsvrid;
    }


    /**
     * Gets the svcgrpentstate value for this Servicegroup.
     * 
     * @return svcgrpentstate
     */
    public java.lang.String[] getSvcgrpentstate() {
        return svcgrpentstate;
    }


    /**
     * Sets the svcgrpentstate value for this Servicegroup.
     * 
     * @param svcgrpentstate
     */
    public void setSvcgrpentstate(java.lang.String[] svcgrpentstate) {
        this.svcgrpentstate = svcgrpentstate;
    }


    /**
     * Gets the svchashid value for this Servicegroup.
     * 
     * @return svchashid
     */
    public org.apache.axis.types.UnsignedInt[] getSvchashid() {
        return svchashid;
    }


    /**
     * Sets the svchashid value for this Servicegroup.
     * 
     * @param svchashid
     */
    public void setSvchashid(org.apache.axis.types.UnsignedInt[] svchashid) {
        this.svchashid = svchashid;
    }


    /**
     * Gets the svcgrpentgraceful value for this Servicegroup.
     * 
     * @return svcgrpentgraceful
     */
    public java.lang.String[] getSvcgrpentgraceful() {
        return svcgrpentgraceful;
    }


    /**
     * Sets the svcgrpentgraceful value for this Servicegroup.
     * 
     * @param svcgrpentgraceful
     */
    public void setSvcgrpentgraceful(java.lang.String[] svcgrpentgraceful) {
        this.svcgrpentgraceful = svcgrpentgraceful;
    }


    /**
     * Gets the svcgrpentdelay value for this Servicegroup.
     * 
     * @return svcgrpentdelay
     */
    public org.apache.axis.types.UnsignedInt[] getSvcgrpentdelay() {
        return svcgrpentdelay;
    }


    /**
     * Sets the svcgrpentdelay value for this Servicegroup.
     * 
     * @param svcgrpentdelay
     */
    public void setSvcgrpentdelay(org.apache.axis.types.UnsignedInt[] svcgrpentdelay) {
        this.svcgrpentdelay = svcgrpentdelay;
    }


    /**
     * Gets the svcgrpentdelay1 value for this Servicegroup.
     * 
     * @return svcgrpentdelay1
     */
    public org.apache.axis.types.UnsignedInt[] getSvcgrpentdelay1() {
        return svcgrpentdelay1;
    }


    /**
     * Sets the svcgrpentdelay1 value for this Servicegroup.
     * 
     * @param svcgrpentdelay1
     */
    public void setSvcgrpentdelay1(org.apache.axis.types.UnsignedInt[] svcgrpentdelay1) {
        this.svcgrpentdelay1 = svcgrpentdelay1;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Servicegroup)) return false;
        Servicegroup other = (Servicegroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.servicegroupname==null && other.getServicegroupname()==null) || 
             (this.servicegroupname!=null &&
              this.servicegroupname.equals(other.getServicegroupname()))) &&
            this.numofconnections == other.getNumofconnections() &&
            ((this.servicetype==null && other.getServicetype()==null) || 
             (this.servicetype!=null &&
              this.servicetype.equals(other.getServicetype()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              java.util.Arrays.equals(this.port, other.getPort()))) &&
            this.serviceconftpye == other.isServiceconftpye() &&
            this.serviceconftype == other.isServiceconftype() &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.cachetype==null && other.getCachetype()==null) || 
             (this.cachetype!=null &&
              this.cachetype.equals(other.getCachetype()))) &&
            ((this.maxclient==null && other.getMaxclient()==null) || 
             (this.maxclient!=null &&
              this.maxclient.equals(other.getMaxclient()))) &&
            ((this.maxreq==null && other.getMaxreq()==null) || 
             (this.maxreq!=null &&
              this.maxreq.equals(other.getMaxreq()))) &&
            ((this.cacheable==null && other.getCacheable()==null) || 
             (this.cacheable!=null &&
              this.cacheable.equals(other.getCacheable()))) &&
            ((this.cip==null && other.getCip()==null) || 
             (this.cip!=null &&
              this.cip.equals(other.getCip()))) &&
            ((this.cipheader==null && other.getCipheader()==null) || 
             (this.cipheader!=null &&
              this.cipheader.equals(other.getCipheader()))) &&
            ((this.usip==null && other.getUsip()==null) || 
             (this.usip!=null &&
              this.usip.equals(other.getUsip()))) &&
            ((this.pathmonitor==null && other.getPathmonitor()==null) || 
             (this.pathmonitor!=null &&
              this.pathmonitor.equals(other.getPathmonitor()))) &&
            ((this.pathmonitorindv==null && other.getPathmonitorindv()==null) || 
             (this.pathmonitorindv!=null &&
              this.pathmonitorindv.equals(other.getPathmonitorindv()))) &&
            ((this.useproxyport==null && other.getUseproxyport()==null) || 
             (this.useproxyport!=null &&
              this.useproxyport.equals(other.getUseproxyport()))) &&
            ((this.monweight==null && other.getMonweight()==null) || 
             (this.monweight!=null &&
              java.util.Arrays.equals(this.monweight, other.getMonweight()))) &&
            ((this.sc==null && other.getSc()==null) || 
             (this.sc!=null &&
              this.sc.equals(other.getSc()))) &&
            ((this.sp==null && other.getSp()==null) || 
             (this.sp!=null &&
              this.sp.equals(other.getSp()))) &&
            ((this.rtspsessionidremap==null && other.getRtspsessionidremap()==null) || 
             (this.rtspsessionidremap!=null &&
              this.rtspsessionidremap.equals(other.getRtspsessionidremap()))) &&
            ((this.clttimeout==null && other.getClttimeout()==null) || 
             (this.clttimeout!=null &&
              this.clttimeout.equals(other.getClttimeout()))) &&
            ((this.svrtimeout==null && other.getSvrtimeout()==null) || 
             (this.svrtimeout!=null &&
              this.svrtimeout.equals(other.getSvrtimeout()))) &&
            ((this.cka==null && other.getCka()==null) || 
             (this.cka!=null &&
              this.cka.equals(other.getCka()))) &&
            ((this.tcpb==null && other.getTcpb()==null) || 
             (this.tcpb!=null &&
              this.tcpb.equals(other.getTcpb()))) &&
            ((this.cmp==null && other.getCmp()==null) || 
             (this.cmp!=null &&
              this.cmp.equals(other.getCmp()))) &&
            ((this.maxbandwidth==null && other.getMaxbandwidth()==null) || 
             (this.maxbandwidth!=null &&
              this.maxbandwidth.equals(other.getMaxbandwidth()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.svrstate==null && other.getSvrstate()==null) || 
             (this.svrstate!=null &&
              this.svrstate.equals(other.getSvrstate()))) &&
            ((this.delay==null && other.getDelay()==null) || 
             (this.delay!=null &&
              this.delay.equals(other.getDelay()))) &&
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              this.ip.equals(other.getIp()))) &&
            ((this.servername==null && other.getServername()==null) || 
             (this.servername!=null &&
              java.util.Arrays.equals(this.servername, other.getServername()))) &&
            ((this.monitorname==null && other.getMonitorname()==null) || 
             (this.monitorname!=null &&
              java.util.Arrays.equals(this.monitorname, other.getMonitorname()))) &&
            ((this.monthreshold==null && other.getMonthreshold()==null) || 
             (this.monthreshold!=null &&
              this.monthreshold.equals(other.getMonthreshold()))) &&
            ((this.monstate==null && other.getMonstate()==null) || 
             (this.monstate!=null &&
              java.util.Arrays.equals(this.monstate, other.getMonstate()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              java.util.Arrays.equals(this.weight, other.getWeight()))) &&
            ((this.customserverid==null && other.getCustomserverid()==null) || 
             (this.customserverid!=null &&
              java.util.Arrays.equals(this.customserverid, other.getCustomserverid()))) &&
            ((this.serverid==null && other.getServerid()==null) || 
             (this.serverid!=null &&
              this.serverid.equals(other.getServerid()))) &&
            ((this.monstate2==null && other.getMonstate2()==null) || 
             (this.monstate2!=null &&
              java.util.Arrays.equals(this.monstate2, other.getMonstate2()))) &&
            this.monstatcode == other.getMonstatcode() &&
            this.monstatparam1 == other.getMonstatparam1() &&
            this.monstatparam2 == other.getMonstatparam2() &&
            this.monstatparam3 == other.getMonstatparam3() &&
            ((this.monitortotalprobes==null && other.getMonitortotalprobes()==null) || 
             (this.monitortotalprobes!=null &&
              java.util.Arrays.equals(this.monitortotalprobes, other.getMonitortotalprobes()))) &&
            ((this.monitortotalfailedprobes==null && other.getMonitortotalfailedprobes()==null) || 
             (this.monitortotalfailedprobes!=null &&
              java.util.Arrays.equals(this.monitortotalfailedprobes, other.getMonitortotalfailedprobes()))) &&
            ((this.monitorcurrentfailedprobes==null && other.getMonitorcurrentfailedprobes()==null) || 
             (this.monitorcurrentfailedprobes!=null &&
              java.util.Arrays.equals(this.monitorcurrentfailedprobes, other.getMonitorcurrentfailedprobes()))) &&
            ((this.downstateflush==null && other.getDownstateflush()==null) || 
             (this.downstateflush!=null &&
              this.downstateflush.equals(other.getDownstateflush()))) &&
            ((this.lastresponse==null && other.getLastresponse()==null) || 
             (this.lastresponse!=null &&
              java.util.Arrays.equals(this.lastresponse, other.getLastresponse()))) &&
            ((this.statechangetimesec==null && other.getStatechangetimesec()==null) || 
             (this.statechangetimesec!=null &&
              this.statechangetimesec.equals(other.getStatechangetimesec()))) &&
            ((this.statechangetimemsec==null && other.getStatechangetimemsec()==null) || 
             (this.statechangetimemsec!=null &&
              this.statechangetimemsec.equals(other.getStatechangetimemsec()))) &&
            ((this.timesincelaststatechange==null && other.getTimesincelaststatechange()==null) || 
             (this.timesincelaststatechange!=null &&
              this.timesincelaststatechange.equals(other.getTimesincelaststatechange()))) &&
            ((this.tickssincelaststatechange==null && other.getTickssincelaststatechange()==null) || 
             (this.tickssincelaststatechange!=null &&
              this.tickssincelaststatechange.equals(other.getTickssincelaststatechange()))) &&
            ((this.stateupdatereason==null && other.getStateupdatereason()==null) || 
             (this.stateupdatereason!=null &&
              this.stateupdatereason.equals(other.getStateupdatereason()))) &&
            ((this.clmonowner==null && other.getClmonowner()==null) || 
             (this.clmonowner!=null &&
              this.clmonowner.equals(other.getClmonowner()))) &&
            ((this.clmonview==null && other.getClmonview()==null) || 
             (this.clmonview!=null &&
              this.clmonview.equals(other.getClmonview()))) &&
            ((this.groupcount==null && other.getGroupcount()==null) || 
             (this.groupcount!=null &&
              this.groupcount.equals(other.getGroupcount()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.tcpprofilename==null && other.getTcpprofilename()==null) || 
             (this.tcpprofilename!=null &&
              this.tcpprofilename.equals(other.getTcpprofilename()))) &&
            ((this.httpprofilename==null && other.getHttpprofilename()==null) || 
             (this.httpprofilename!=null &&
              this.httpprofilename.equals(other.getHttpprofilename()))) &&
            ((this.hashid==null && other.getHashid()==null) || 
             (this.hashid!=null &&
              this.hashid.equals(other.getHashid()))) &&
            ((this.graceful==null && other.getGraceful()==null) || 
             (this.graceful!=null &&
              this.graceful.equals(other.getGraceful()))) &&
            ((this.healthmonitor==null && other.getHealthmonitor()==null) || 
             (this.healthmonitor!=null &&
              this.healthmonitor.equals(other.getHealthmonitor()))) &&
            ((this.appflowlog==null && other.getAppflowlog()==null) || 
             (this.appflowlog!=null &&
              this.appflowlog.equals(other.getAppflowlog()))) &&
            ((this.netprofile==null && other.getNetprofile()==null) || 
             (this.netprofile!=null &&
              this.netprofile.equals(other.getNetprofile()))) &&
            ((this.autoscale==null && other.getAutoscale()==null) || 
             (this.autoscale!=null &&
              this.autoscale.equals(other.getAutoscale()))) &&
            ((this.memberport==null && other.getMemberport()==null) || 
             (this.memberport!=null &&
              this.memberport.equals(other.getMemberport()))) &&
            ((this.serviceipstr==null && other.getServiceipstr()==null) || 
             (this.serviceipstr!=null &&
              this.serviceipstr.equals(other.getServiceipstr()))) &&
            ((this.servicegroupentname2==null && other.getServicegroupentname2()==null) || 
             (this.servicegroupentname2!=null &&
              java.util.Arrays.equals(this.servicegroupentname2, other.getServicegroupentname2()))) &&
            ((this.passive==null && other.getPassive()==null) || 
             (this.passive!=null &&
              java.util.Arrays.equals(this.passive, other.getPassive()))) &&
            ((this.svcgrpmonbindweight==null && other.getSvcgrpmonbindweight()==null) || 
             (this.svcgrpmonbindweight!=null &&
              java.util.Arrays.equals(this.svcgrpmonbindweight, other.getSvcgrpmonbindweight()))) &&
            ((this.svcgrpmonbindstate==null && other.getSvcgrpmonbindstate()==null) || 
             (this.svcgrpmonbindstate!=null &&
              java.util.Arrays.equals(this.svcgrpmonbindstate, other.getSvcgrpmonbindstate()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              java.util.Arrays.equals(this.ipaddress, other.getIpaddress()))) &&
            ((this.svcstate==null && other.getSvcstate()==null) || 
             (this.svcstate!=null &&
              java.util.Arrays.equals(this.svcstate, other.getSvcstate()))) &&
            ((this.svcgrpentsvrid==null && other.getSvcgrpentsvrid()==null) || 
             (this.svcgrpentsvrid!=null &&
              java.util.Arrays.equals(this.svcgrpentsvrid, other.getSvcgrpentsvrid()))) &&
            ((this.svcgrpentstate==null && other.getSvcgrpentstate()==null) || 
             (this.svcgrpentstate!=null &&
              java.util.Arrays.equals(this.svcgrpentstate, other.getSvcgrpentstate()))) &&
            ((this.svchashid==null && other.getSvchashid()==null) || 
             (this.svchashid!=null &&
              java.util.Arrays.equals(this.svchashid, other.getSvchashid()))) &&
            ((this.svcgrpentgraceful==null && other.getSvcgrpentgraceful()==null) || 
             (this.svcgrpentgraceful!=null &&
              java.util.Arrays.equals(this.svcgrpentgraceful, other.getSvcgrpentgraceful()))) &&
            ((this.svcgrpentdelay==null && other.getSvcgrpentdelay()==null) || 
             (this.svcgrpentdelay!=null &&
              java.util.Arrays.equals(this.svcgrpentdelay, other.getSvcgrpentdelay()))) &&
            ((this.svcgrpentdelay1==null && other.getSvcgrpentdelay1()==null) || 
             (this.svcgrpentdelay1!=null &&
              java.util.Arrays.equals(this.svcgrpentdelay1, other.getSvcgrpentdelay1())));
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
        if (getServicegroupname() != null) {
            _hashCode += getServicegroupname().hashCode();
        }
        _hashCode += getNumofconnections();
        if (getServicetype() != null) {
            _hashCode += getServicetype().hashCode();
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
        _hashCode += (isServiceconftpye() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isServiceconftype() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getCachetype() != null) {
            _hashCode += getCachetype().hashCode();
        }
        if (getMaxclient() != null) {
            _hashCode += getMaxclient().hashCode();
        }
        if (getMaxreq() != null) {
            _hashCode += getMaxreq().hashCode();
        }
        if (getCacheable() != null) {
            _hashCode += getCacheable().hashCode();
        }
        if (getCip() != null) {
            _hashCode += getCip().hashCode();
        }
        if (getCipheader() != null) {
            _hashCode += getCipheader().hashCode();
        }
        if (getUsip() != null) {
            _hashCode += getUsip().hashCode();
        }
        if (getPathmonitor() != null) {
            _hashCode += getPathmonitor().hashCode();
        }
        if (getPathmonitorindv() != null) {
            _hashCode += getPathmonitorindv().hashCode();
        }
        if (getUseproxyport() != null) {
            _hashCode += getUseproxyport().hashCode();
        }
        if (getMonweight() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMonweight());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMonweight(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSc() != null) {
            _hashCode += getSc().hashCode();
        }
        if (getSp() != null) {
            _hashCode += getSp().hashCode();
        }
        if (getRtspsessionidremap() != null) {
            _hashCode += getRtspsessionidremap().hashCode();
        }
        if (getClttimeout() != null) {
            _hashCode += getClttimeout().hashCode();
        }
        if (getSvrtimeout() != null) {
            _hashCode += getSvrtimeout().hashCode();
        }
        if (getCka() != null) {
            _hashCode += getCka().hashCode();
        }
        if (getTcpb() != null) {
            _hashCode += getTcpb().hashCode();
        }
        if (getCmp() != null) {
            _hashCode += getCmp().hashCode();
        }
        if (getMaxbandwidth() != null) {
            _hashCode += getMaxbandwidth().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getSvrstate() != null) {
            _hashCode += getSvrstate().hashCode();
        }
        if (getDelay() != null) {
            _hashCode += getDelay().hashCode();
        }
        if (getIp() != null) {
            _hashCode += getIp().hashCode();
        }
        if (getServername() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServername());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServername(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getMonthreshold() != null) {
            _hashCode += getMonthreshold().hashCode();
        }
        if (getMonstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMonstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMonstate(), i);
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
        if (getCustomserverid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomserverid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomserverid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServerid() != null) {
            _hashCode += getServerid().hashCode();
        }
        if (getMonstate2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMonstate2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMonstate2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getMonstatcode();
        _hashCode += getMonstatparam1();
        _hashCode += getMonstatparam2();
        _hashCode += getMonstatparam3();
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
        if (getDownstateflush() != null) {
            _hashCode += getDownstateflush().hashCode();
        }
        if (getLastresponse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLastresponse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLastresponse(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatechangetimesec() != null) {
            _hashCode += getStatechangetimesec().hashCode();
        }
        if (getStatechangetimemsec() != null) {
            _hashCode += getStatechangetimemsec().hashCode();
        }
        if (getTimesincelaststatechange() != null) {
            _hashCode += getTimesincelaststatechange().hashCode();
        }
        if (getTickssincelaststatechange() != null) {
            _hashCode += getTickssincelaststatechange().hashCode();
        }
        if (getStateupdatereason() != null) {
            _hashCode += getStateupdatereason().hashCode();
        }
        if (getClmonowner() != null) {
            _hashCode += getClmonowner().hashCode();
        }
        if (getClmonview() != null) {
            _hashCode += getClmonview().hashCode();
        }
        if (getGroupcount() != null) {
            _hashCode += getGroupcount().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getTcpprofilename() != null) {
            _hashCode += getTcpprofilename().hashCode();
        }
        if (getHttpprofilename() != null) {
            _hashCode += getHttpprofilename().hashCode();
        }
        if (getHashid() != null) {
            _hashCode += getHashid().hashCode();
        }
        if (getGraceful() != null) {
            _hashCode += getGraceful().hashCode();
        }
        if (getHealthmonitor() != null) {
            _hashCode += getHealthmonitor().hashCode();
        }
        if (getAppflowlog() != null) {
            _hashCode += getAppflowlog().hashCode();
        }
        if (getNetprofile() != null) {
            _hashCode += getNetprofile().hashCode();
        }
        if (getAutoscale() != null) {
            _hashCode += getAutoscale().hashCode();
        }
        if (getMemberport() != null) {
            _hashCode += getMemberport().hashCode();
        }
        if (getServiceipstr() != null) {
            _hashCode += getServiceipstr().hashCode();
        }
        if (getServicegroupentname2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicegroupentname2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicegroupentname2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPassive() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPassive());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPassive(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvcgrpmonbindweight() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvcgrpmonbindweight());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvcgrpmonbindweight(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvcgrpmonbindstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvcgrpmonbindstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvcgrpmonbindstate(), i);
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
        if (getSvcstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvcstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvcstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvcgrpentsvrid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvcgrpentsvrid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvcgrpentsvrid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvcgrpentstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvcgrpentstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvcgrpentstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvchashid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvchashid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvchashid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvcgrpentgraceful() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvcgrpentgraceful());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvcgrpentgraceful(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvcgrpentdelay() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvcgrpentdelay());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvcgrpentdelay(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvcgrpentdelay1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvcgrpentdelay1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvcgrpentdelay1(), i);
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
        new org.apache.axis.description.TypeDesc(Servicegroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "servicegroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicegroupname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicegroupname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numofconnections");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numofconnections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("serviceconftpye");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceconftpye"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceconftype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceconftype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxclient");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxclient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxreq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxreq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cacheable"));
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
        elemField.setFieldName("usip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathmonitor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pathmonitor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathmonitorindv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pathmonitorindv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useproxyport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useproxyport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monweight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monweight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rtspsessionidremap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rtspsessionidremap"));
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
        elemField.setFieldName("cka");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cka"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcpb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tcpb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmp"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
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
        elemField.setFieldName("delay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip"));
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
        elemField.setFieldName("monitorname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monitorname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monthreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monthreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monstate"));
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
        elemField.setFieldName("customserverid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customserverid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monstate2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monstate2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("downstateflush");
        elemField.setXmlName(new javax.xml.namespace.QName("", "downstateflush"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastresponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastresponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("timesincelaststatechange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timesincelaststatechange"));
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
        elemField.setFieldName("stateupdatereason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stateupdatereason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clmonowner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clmonowner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clmonview");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clmonview"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupcount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupcount"));
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
        elemField.setFieldName("hashid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hashid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("graceful");
        elemField.setXmlName(new javax.xml.namespace.QName("", "graceful"));
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
        elemField.setFieldName("netprofile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netprofile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoscale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoscale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memberport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "memberport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceipstr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceipstr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicegroupentname2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicegroupentname2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcgrpmonbindweight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcgrpmonbindweight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcgrpmonbindstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcgrpmonbindstate"));
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
        elemField.setFieldName("svcstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcgrpentsvrid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcgrpentsvrid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcgrpentstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcgrpentstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svchashid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svchashid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcgrpentgraceful");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcgrpentgraceful"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcgrpentdelay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcgrpentdelay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcgrpentdelay1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcgrpentdelay1"));
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
