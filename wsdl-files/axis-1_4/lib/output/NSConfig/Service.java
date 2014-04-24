/**
 * Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Service  implements java.io.Serializable {
    private java.lang.String name;

    private boolean all;

    private boolean internaL;

    private int numofconnections;

    private java.lang.String servername;

    private java.lang.String policyname;

    private java.lang.String servicetype;

    private boolean serviceconftpye;

    private boolean serviceconftype;

    private java.lang.String serviceconftype2;

    private org.apache.axis.types.UnsignedInt port;

    private java.lang.String value;

    private org.apache.axis.types.UnsignedInt cleartextport;

    private java.lang.String gslb;

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

    private java.lang.String sc;

    private org.apache.axis.types.UnsignedInt[] weight;

    private java.lang.String state;

    private java.lang.String sp;

    private java.lang.String rtspsessionidremap;

    private org.apache.axis.types.UnsignedInt[] failedprobes;

    private org.apache.axis.types.UnsignedInt clttimeout;

    private org.apache.axis.types.UnsignedInt[] totalprobes;

    private org.apache.axis.types.UnsignedInt svrtimeout;

    private org.apache.axis.types.UnsignedInt[] totalfailedprobes;

    private java.lang.String publicip;

    private org.apache.axis.types.UnsignedInt publicport;

    private java.lang.String customserverid;

    private org.apache.axis.types.UnsignedInt serverid;

    private java.lang.String cka;

    private java.lang.String tcpb;

    private java.lang.String cmp;

    private org.apache.axis.types.UnsignedInt maxbandwidth;

    private java.lang.String accessdown;

    private java.lang.String svrstate;

    private org.apache.axis.types.UnsignedInt delay;

    private java.lang.String ipaddress;

    private java.lang.String[] monitorname;

    private org.apache.axis.types.UnsignedInt monthreshold;

    private java.lang.String[] monstate;

    private java.lang.String monstate2;

    private int monstatcode;

    private java.lang.String lastresponse;

    private org.apache.axis.types.UnsignedLong responsetime;

    private int monstatparam1;

    private int monstatparam2;

    private int monstatparam3;

    private java.lang.String downstateflush;

    private java.lang.String statechangetimesec;

    private org.apache.axis.types.UnsignedInt statechangetimemsec;

    private org.apache.axis.types.UnsignedInt timesincelaststatechange;

    private org.apache.axis.types.UnsignedInt tickssincelaststatechange;

    private org.apache.axis.types.UnsignedInt stateupdatereason;

    private org.apache.axis.types.UnsignedInt clmonowner;

    private org.apache.axis.types.UnsignedInt clmonview;

    private java.lang.String tcpprofilename;

    private java.lang.String httpprofilename;

    private org.apache.axis.types.UnsignedInt hashid;

    private java.lang.String graceful;

    private java.lang.String comment;

    private org.apache.axis.types.UnsignedInt[] monitortotalprobes;

    private org.apache.axis.types.UnsignedInt[] monitortotalfailedprobes;

    private org.apache.axis.types.UnsignedInt[] monitorcurrentfailedprobes;

    private java.lang.String healthmonitor;

    private java.lang.String appflowlog;

    private java.lang.String netprofile;

    private java.lang.String serviceipstr;

    private org.apache.axis.types.UnsignedInt[] weight2;

    private boolean[] passive;

    private java.lang.String[] runningmonstate;

    private java.lang.String[] svcmonstate;

    private int[] boundmonstatcode;

    private java.lang.String[] boundlastresponse;

    private int[] boundmonstatparam1;

    private int[] boundmonstatparam2;

    private int[] boundmonstatparam3;

    private org.apache.axis.types.UnsignedLong[] boundresponsetime;

    private java.lang.String[] scpolicyname;

    private java.lang.String[] dospolicyname;

    public Service() {
    }

    public Service(
           java.lang.String name,
           boolean all,
           boolean internaL,
           int numofconnections,
           java.lang.String servername,
           java.lang.String policyname,
           java.lang.String servicetype,
           boolean serviceconftpye,
           boolean serviceconftype,
           java.lang.String serviceconftype2,
           org.apache.axis.types.UnsignedInt port,
           java.lang.String value,
           org.apache.axis.types.UnsignedInt cleartextport,
           java.lang.String gslb,
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
           java.lang.String sc,
           org.apache.axis.types.UnsignedInt[] weight,
           java.lang.String state,
           java.lang.String sp,
           java.lang.String rtspsessionidremap,
           org.apache.axis.types.UnsignedInt[] failedprobes,
           org.apache.axis.types.UnsignedInt clttimeout,
           org.apache.axis.types.UnsignedInt[] totalprobes,
           org.apache.axis.types.UnsignedInt svrtimeout,
           org.apache.axis.types.UnsignedInt[] totalfailedprobes,
           java.lang.String publicip,
           org.apache.axis.types.UnsignedInt publicport,
           java.lang.String customserverid,
           org.apache.axis.types.UnsignedInt serverid,
           java.lang.String cka,
           java.lang.String tcpb,
           java.lang.String cmp,
           org.apache.axis.types.UnsignedInt maxbandwidth,
           java.lang.String accessdown,
           java.lang.String svrstate,
           org.apache.axis.types.UnsignedInt delay,
           java.lang.String ipaddress,
           java.lang.String[] monitorname,
           org.apache.axis.types.UnsignedInt monthreshold,
           java.lang.String[] monstate,
           java.lang.String monstate2,
           int monstatcode,
           java.lang.String lastresponse,
           org.apache.axis.types.UnsignedLong responsetime,
           int monstatparam1,
           int monstatparam2,
           int monstatparam3,
           java.lang.String downstateflush,
           java.lang.String statechangetimesec,
           org.apache.axis.types.UnsignedInt statechangetimemsec,
           org.apache.axis.types.UnsignedInt timesincelaststatechange,
           org.apache.axis.types.UnsignedInt tickssincelaststatechange,
           org.apache.axis.types.UnsignedInt stateupdatereason,
           org.apache.axis.types.UnsignedInt clmonowner,
           org.apache.axis.types.UnsignedInt clmonview,
           java.lang.String tcpprofilename,
           java.lang.String httpprofilename,
           org.apache.axis.types.UnsignedInt hashid,
           java.lang.String graceful,
           java.lang.String comment,
           org.apache.axis.types.UnsignedInt[] monitortotalprobes,
           org.apache.axis.types.UnsignedInt[] monitortotalfailedprobes,
           org.apache.axis.types.UnsignedInt[] monitorcurrentfailedprobes,
           java.lang.String healthmonitor,
           java.lang.String appflowlog,
           java.lang.String netprofile,
           java.lang.String serviceipstr,
           org.apache.axis.types.UnsignedInt[] weight2,
           boolean[] passive,
           java.lang.String[] runningmonstate,
           java.lang.String[] svcmonstate,
           int[] boundmonstatcode,
           java.lang.String[] boundlastresponse,
           int[] boundmonstatparam1,
           int[] boundmonstatparam2,
           int[] boundmonstatparam3,
           org.apache.axis.types.UnsignedLong[] boundresponsetime,
           java.lang.String[] scpolicyname,
           java.lang.String[] dospolicyname) {
           this.name = name;
           this.all = all;
           this.internaL = internaL;
           this.numofconnections = numofconnections;
           this.servername = servername;
           this.policyname = policyname;
           this.servicetype = servicetype;
           this.serviceconftpye = serviceconftpye;
           this.serviceconftype = serviceconftype;
           this.serviceconftype2 = serviceconftype2;
           this.port = port;
           this.value = value;
           this.cleartextport = cleartextport;
           this.gslb = gslb;
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
           this.sc = sc;
           this.weight = weight;
           this.state = state;
           this.sp = sp;
           this.rtspsessionidremap = rtspsessionidremap;
           this.failedprobes = failedprobes;
           this.clttimeout = clttimeout;
           this.totalprobes = totalprobes;
           this.svrtimeout = svrtimeout;
           this.totalfailedprobes = totalfailedprobes;
           this.publicip = publicip;
           this.publicport = publicport;
           this.customserverid = customserverid;
           this.serverid = serverid;
           this.cka = cka;
           this.tcpb = tcpb;
           this.cmp = cmp;
           this.maxbandwidth = maxbandwidth;
           this.accessdown = accessdown;
           this.svrstate = svrstate;
           this.delay = delay;
           this.ipaddress = ipaddress;
           this.monitorname = monitorname;
           this.monthreshold = monthreshold;
           this.monstate = monstate;
           this.monstate2 = monstate2;
           this.monstatcode = monstatcode;
           this.lastresponse = lastresponse;
           this.responsetime = responsetime;
           this.monstatparam1 = monstatparam1;
           this.monstatparam2 = monstatparam2;
           this.monstatparam3 = monstatparam3;
           this.downstateflush = downstateflush;
           this.statechangetimesec = statechangetimesec;
           this.statechangetimemsec = statechangetimemsec;
           this.timesincelaststatechange = timesincelaststatechange;
           this.tickssincelaststatechange = tickssincelaststatechange;
           this.stateupdatereason = stateupdatereason;
           this.clmonowner = clmonowner;
           this.clmonview = clmonview;
           this.tcpprofilename = tcpprofilename;
           this.httpprofilename = httpprofilename;
           this.hashid = hashid;
           this.graceful = graceful;
           this.comment = comment;
           this.monitortotalprobes = monitortotalprobes;
           this.monitortotalfailedprobes = monitortotalfailedprobes;
           this.monitorcurrentfailedprobes = monitorcurrentfailedprobes;
           this.healthmonitor = healthmonitor;
           this.appflowlog = appflowlog;
           this.netprofile = netprofile;
           this.serviceipstr = serviceipstr;
           this.weight2 = weight2;
           this.passive = passive;
           this.runningmonstate = runningmonstate;
           this.svcmonstate = svcmonstate;
           this.boundmonstatcode = boundmonstatcode;
           this.boundlastresponse = boundlastresponse;
           this.boundmonstatparam1 = boundmonstatparam1;
           this.boundmonstatparam2 = boundmonstatparam2;
           this.boundmonstatparam3 = boundmonstatparam3;
           this.boundresponsetime = boundresponsetime;
           this.scpolicyname = scpolicyname;
           this.dospolicyname = dospolicyname;
    }


    /**
     * Gets the name value for this Service.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Service.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the all value for this Service.
     * 
     * @return all
     */
    public boolean isAll() {
        return all;
    }


    /**
     * Sets the all value for this Service.
     * 
     * @param all
     */
    public void setAll(boolean all) {
        this.all = all;
    }


    /**
     * Gets the internaL value for this Service.
     * 
     * @return internaL
     */
    public boolean isInternaL() {
        return internaL;
    }


    /**
     * Sets the internaL value for this Service.
     * 
     * @param internaL
     */
    public void setInternaL(boolean internaL) {
        this.internaL = internaL;
    }


    /**
     * Gets the numofconnections value for this Service.
     * 
     * @return numofconnections
     */
    public int getNumofconnections() {
        return numofconnections;
    }


    /**
     * Sets the numofconnections value for this Service.
     * 
     * @param numofconnections
     */
    public void setNumofconnections(int numofconnections) {
        this.numofconnections = numofconnections;
    }


    /**
     * Gets the servername value for this Service.
     * 
     * @return servername
     */
    public java.lang.String getServername() {
        return servername;
    }


    /**
     * Sets the servername value for this Service.
     * 
     * @param servername
     */
    public void setServername(java.lang.String servername) {
        this.servername = servername;
    }


    /**
     * Gets the policyname value for this Service.
     * 
     * @return policyname
     */
    public java.lang.String getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Service.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the servicetype value for this Service.
     * 
     * @return servicetype
     */
    public java.lang.String getServicetype() {
        return servicetype;
    }


    /**
     * Sets the servicetype value for this Service.
     * 
     * @param servicetype
     */
    public void setServicetype(java.lang.String servicetype) {
        this.servicetype = servicetype;
    }


    /**
     * Gets the serviceconftpye value for this Service.
     * 
     * @return serviceconftpye
     */
    public boolean isServiceconftpye() {
        return serviceconftpye;
    }


    /**
     * Sets the serviceconftpye value for this Service.
     * 
     * @param serviceconftpye
     */
    public void setServiceconftpye(boolean serviceconftpye) {
        this.serviceconftpye = serviceconftpye;
    }


    /**
     * Gets the serviceconftype value for this Service.
     * 
     * @return serviceconftype
     */
    public boolean isServiceconftype() {
        return serviceconftype;
    }


    /**
     * Sets the serviceconftype value for this Service.
     * 
     * @param serviceconftype
     */
    public void setServiceconftype(boolean serviceconftype) {
        this.serviceconftype = serviceconftype;
    }


    /**
     * Gets the serviceconftype2 value for this Service.
     * 
     * @return serviceconftype2
     */
    public java.lang.String getServiceconftype2() {
        return serviceconftype2;
    }


    /**
     * Sets the serviceconftype2 value for this Service.
     * 
     * @param serviceconftype2
     */
    public void setServiceconftype2(java.lang.String serviceconftype2) {
        this.serviceconftype2 = serviceconftype2;
    }


    /**
     * Gets the port value for this Service.
     * 
     * @return port
     */
    public org.apache.axis.types.UnsignedInt getPort() {
        return port;
    }


    /**
     * Sets the port value for this Service.
     * 
     * @param port
     */
    public void setPort(org.apache.axis.types.UnsignedInt port) {
        this.port = port;
    }


    /**
     * Gets the value value for this Service.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this Service.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the cleartextport value for this Service.
     * 
     * @return cleartextport
     */
    public org.apache.axis.types.UnsignedInt getCleartextport() {
        return cleartextport;
    }


    /**
     * Sets the cleartextport value for this Service.
     * 
     * @param cleartextport
     */
    public void setCleartextport(org.apache.axis.types.UnsignedInt cleartextport) {
        this.cleartextport = cleartextport;
    }


    /**
     * Gets the gslb value for this Service.
     * 
     * @return gslb
     */
    public java.lang.String getGslb() {
        return gslb;
    }


    /**
     * Sets the gslb value for this Service.
     * 
     * @param gslb
     */
    public void setGslb(java.lang.String gslb) {
        this.gslb = gslb;
    }


    /**
     * Gets the cachetype value for this Service.
     * 
     * @return cachetype
     */
    public java.lang.String getCachetype() {
        return cachetype;
    }


    /**
     * Sets the cachetype value for this Service.
     * 
     * @param cachetype
     */
    public void setCachetype(java.lang.String cachetype) {
        this.cachetype = cachetype;
    }


    /**
     * Gets the maxclient value for this Service.
     * 
     * @return maxclient
     */
    public org.apache.axis.types.UnsignedInt getMaxclient() {
        return maxclient;
    }


    /**
     * Sets the maxclient value for this Service.
     * 
     * @param maxclient
     */
    public void setMaxclient(org.apache.axis.types.UnsignedInt maxclient) {
        this.maxclient = maxclient;
    }


    /**
     * Gets the maxreq value for this Service.
     * 
     * @return maxreq
     */
    public org.apache.axis.types.UnsignedInt getMaxreq() {
        return maxreq;
    }


    /**
     * Sets the maxreq value for this Service.
     * 
     * @param maxreq
     */
    public void setMaxreq(org.apache.axis.types.UnsignedInt maxreq) {
        this.maxreq = maxreq;
    }


    /**
     * Gets the cacheable value for this Service.
     * 
     * @return cacheable
     */
    public java.lang.String getCacheable() {
        return cacheable;
    }


    /**
     * Sets the cacheable value for this Service.
     * 
     * @param cacheable
     */
    public void setCacheable(java.lang.String cacheable) {
        this.cacheable = cacheable;
    }


    /**
     * Gets the cip value for this Service.
     * 
     * @return cip
     */
    public java.lang.String getCip() {
        return cip;
    }


    /**
     * Sets the cip value for this Service.
     * 
     * @param cip
     */
    public void setCip(java.lang.String cip) {
        this.cip = cip;
    }


    /**
     * Gets the cipheader value for this Service.
     * 
     * @return cipheader
     */
    public java.lang.String getCipheader() {
        return cipheader;
    }


    /**
     * Sets the cipheader value for this Service.
     * 
     * @param cipheader
     */
    public void setCipheader(java.lang.String cipheader) {
        this.cipheader = cipheader;
    }


    /**
     * Gets the usip value for this Service.
     * 
     * @return usip
     */
    public java.lang.String getUsip() {
        return usip;
    }


    /**
     * Sets the usip value for this Service.
     * 
     * @param usip
     */
    public void setUsip(java.lang.String usip) {
        this.usip = usip;
    }


    /**
     * Gets the pathmonitor value for this Service.
     * 
     * @return pathmonitor
     */
    public java.lang.String getPathmonitor() {
        return pathmonitor;
    }


    /**
     * Sets the pathmonitor value for this Service.
     * 
     * @param pathmonitor
     */
    public void setPathmonitor(java.lang.String pathmonitor) {
        this.pathmonitor = pathmonitor;
    }


    /**
     * Gets the pathmonitorindv value for this Service.
     * 
     * @return pathmonitorindv
     */
    public java.lang.String getPathmonitorindv() {
        return pathmonitorindv;
    }


    /**
     * Sets the pathmonitorindv value for this Service.
     * 
     * @param pathmonitorindv
     */
    public void setPathmonitorindv(java.lang.String pathmonitorindv) {
        this.pathmonitorindv = pathmonitorindv;
    }


    /**
     * Gets the useproxyport value for this Service.
     * 
     * @return useproxyport
     */
    public java.lang.String getUseproxyport() {
        return useproxyport;
    }


    /**
     * Sets the useproxyport value for this Service.
     * 
     * @param useproxyport
     */
    public void setUseproxyport(java.lang.String useproxyport) {
        this.useproxyport = useproxyport;
    }


    /**
     * Gets the sc value for this Service.
     * 
     * @return sc
     */
    public java.lang.String getSc() {
        return sc;
    }


    /**
     * Sets the sc value for this Service.
     * 
     * @param sc
     */
    public void setSc(java.lang.String sc) {
        this.sc = sc;
    }


    /**
     * Gets the weight value for this Service.
     * 
     * @return weight
     */
    public org.apache.axis.types.UnsignedInt[] getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this Service.
     * 
     * @param weight
     */
    public void setWeight(org.apache.axis.types.UnsignedInt[] weight) {
        this.weight = weight;
    }


    /**
     * Gets the state value for this Service.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Service.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the sp value for this Service.
     * 
     * @return sp
     */
    public java.lang.String getSp() {
        return sp;
    }


    /**
     * Sets the sp value for this Service.
     * 
     * @param sp
     */
    public void setSp(java.lang.String sp) {
        this.sp = sp;
    }


    /**
     * Gets the rtspsessionidremap value for this Service.
     * 
     * @return rtspsessionidremap
     */
    public java.lang.String getRtspsessionidremap() {
        return rtspsessionidremap;
    }


    /**
     * Sets the rtspsessionidremap value for this Service.
     * 
     * @param rtspsessionidremap
     */
    public void setRtspsessionidremap(java.lang.String rtspsessionidremap) {
        this.rtspsessionidremap = rtspsessionidremap;
    }


    /**
     * Gets the failedprobes value for this Service.
     * 
     * @return failedprobes
     */
    public org.apache.axis.types.UnsignedInt[] getFailedprobes() {
        return failedprobes;
    }


    /**
     * Sets the failedprobes value for this Service.
     * 
     * @param failedprobes
     */
    public void setFailedprobes(org.apache.axis.types.UnsignedInt[] failedprobes) {
        this.failedprobes = failedprobes;
    }


    /**
     * Gets the clttimeout value for this Service.
     * 
     * @return clttimeout
     */
    public org.apache.axis.types.UnsignedInt getClttimeout() {
        return clttimeout;
    }


    /**
     * Sets the clttimeout value for this Service.
     * 
     * @param clttimeout
     */
    public void setClttimeout(org.apache.axis.types.UnsignedInt clttimeout) {
        this.clttimeout = clttimeout;
    }


    /**
     * Gets the totalprobes value for this Service.
     * 
     * @return totalprobes
     */
    public org.apache.axis.types.UnsignedInt[] getTotalprobes() {
        return totalprobes;
    }


    /**
     * Sets the totalprobes value for this Service.
     * 
     * @param totalprobes
     */
    public void setTotalprobes(org.apache.axis.types.UnsignedInt[] totalprobes) {
        this.totalprobes = totalprobes;
    }


    /**
     * Gets the svrtimeout value for this Service.
     * 
     * @return svrtimeout
     */
    public org.apache.axis.types.UnsignedInt getSvrtimeout() {
        return svrtimeout;
    }


    /**
     * Sets the svrtimeout value for this Service.
     * 
     * @param svrtimeout
     */
    public void setSvrtimeout(org.apache.axis.types.UnsignedInt svrtimeout) {
        this.svrtimeout = svrtimeout;
    }


    /**
     * Gets the totalfailedprobes value for this Service.
     * 
     * @return totalfailedprobes
     */
    public org.apache.axis.types.UnsignedInt[] getTotalfailedprobes() {
        return totalfailedprobes;
    }


    /**
     * Sets the totalfailedprobes value for this Service.
     * 
     * @param totalfailedprobes
     */
    public void setTotalfailedprobes(org.apache.axis.types.UnsignedInt[] totalfailedprobes) {
        this.totalfailedprobes = totalfailedprobes;
    }


    /**
     * Gets the publicip value for this Service.
     * 
     * @return publicip
     */
    public java.lang.String getPublicip() {
        return publicip;
    }


    /**
     * Sets the publicip value for this Service.
     * 
     * @param publicip
     */
    public void setPublicip(java.lang.String publicip) {
        this.publicip = publicip;
    }


    /**
     * Gets the publicport value for this Service.
     * 
     * @return publicport
     */
    public org.apache.axis.types.UnsignedInt getPublicport() {
        return publicport;
    }


    /**
     * Sets the publicport value for this Service.
     * 
     * @param publicport
     */
    public void setPublicport(org.apache.axis.types.UnsignedInt publicport) {
        this.publicport = publicport;
    }


    /**
     * Gets the customserverid value for this Service.
     * 
     * @return customserverid
     */
    public java.lang.String getCustomserverid() {
        return customserverid;
    }


    /**
     * Sets the customserverid value for this Service.
     * 
     * @param customserverid
     */
    public void setCustomserverid(java.lang.String customserverid) {
        this.customserverid = customserverid;
    }


    /**
     * Gets the serverid value for this Service.
     * 
     * @return serverid
     */
    public org.apache.axis.types.UnsignedInt getServerid() {
        return serverid;
    }


    /**
     * Sets the serverid value for this Service.
     * 
     * @param serverid
     */
    public void setServerid(org.apache.axis.types.UnsignedInt serverid) {
        this.serverid = serverid;
    }


    /**
     * Gets the cka value for this Service.
     * 
     * @return cka
     */
    public java.lang.String getCka() {
        return cka;
    }


    /**
     * Sets the cka value for this Service.
     * 
     * @param cka
     */
    public void setCka(java.lang.String cka) {
        this.cka = cka;
    }


    /**
     * Gets the tcpb value for this Service.
     * 
     * @return tcpb
     */
    public java.lang.String getTcpb() {
        return tcpb;
    }


    /**
     * Sets the tcpb value for this Service.
     * 
     * @param tcpb
     */
    public void setTcpb(java.lang.String tcpb) {
        this.tcpb = tcpb;
    }


    /**
     * Gets the cmp value for this Service.
     * 
     * @return cmp
     */
    public java.lang.String getCmp() {
        return cmp;
    }


    /**
     * Sets the cmp value for this Service.
     * 
     * @param cmp
     */
    public void setCmp(java.lang.String cmp) {
        this.cmp = cmp;
    }


    /**
     * Gets the maxbandwidth value for this Service.
     * 
     * @return maxbandwidth
     */
    public org.apache.axis.types.UnsignedInt getMaxbandwidth() {
        return maxbandwidth;
    }


    /**
     * Sets the maxbandwidth value for this Service.
     * 
     * @param maxbandwidth
     */
    public void setMaxbandwidth(org.apache.axis.types.UnsignedInt maxbandwidth) {
        this.maxbandwidth = maxbandwidth;
    }


    /**
     * Gets the accessdown value for this Service.
     * 
     * @return accessdown
     */
    public java.lang.String getAccessdown() {
        return accessdown;
    }


    /**
     * Sets the accessdown value for this Service.
     * 
     * @param accessdown
     */
    public void setAccessdown(java.lang.String accessdown) {
        this.accessdown = accessdown;
    }


    /**
     * Gets the svrstate value for this Service.
     * 
     * @return svrstate
     */
    public java.lang.String getSvrstate() {
        return svrstate;
    }


    /**
     * Sets the svrstate value for this Service.
     * 
     * @param svrstate
     */
    public void setSvrstate(java.lang.String svrstate) {
        this.svrstate = svrstate;
    }


    /**
     * Gets the delay value for this Service.
     * 
     * @return delay
     */
    public org.apache.axis.types.UnsignedInt getDelay() {
        return delay;
    }


    /**
     * Sets the delay value for this Service.
     * 
     * @param delay
     */
    public void setDelay(org.apache.axis.types.UnsignedInt delay) {
        this.delay = delay;
    }


    /**
     * Gets the ipaddress value for this Service.
     * 
     * @return ipaddress
     */
    public java.lang.String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Service.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the monitorname value for this Service.
     * 
     * @return monitorname
     */
    public java.lang.String[] getMonitorname() {
        return monitorname;
    }


    /**
     * Sets the monitorname value for this Service.
     * 
     * @param monitorname
     */
    public void setMonitorname(java.lang.String[] monitorname) {
        this.monitorname = monitorname;
    }


    /**
     * Gets the monthreshold value for this Service.
     * 
     * @return monthreshold
     */
    public org.apache.axis.types.UnsignedInt getMonthreshold() {
        return monthreshold;
    }


    /**
     * Sets the monthreshold value for this Service.
     * 
     * @param monthreshold
     */
    public void setMonthreshold(org.apache.axis.types.UnsignedInt monthreshold) {
        this.monthreshold = monthreshold;
    }


    /**
     * Gets the monstate value for this Service.
     * 
     * @return monstate
     */
    public java.lang.String[] getMonstate() {
        return monstate;
    }


    /**
     * Sets the monstate value for this Service.
     * 
     * @param monstate
     */
    public void setMonstate(java.lang.String[] monstate) {
        this.monstate = monstate;
    }


    /**
     * Gets the monstate2 value for this Service.
     * 
     * @return monstate2
     */
    public java.lang.String getMonstate2() {
        return monstate2;
    }


    /**
     * Sets the monstate2 value for this Service.
     * 
     * @param monstate2
     */
    public void setMonstate2(java.lang.String monstate2) {
        this.monstate2 = monstate2;
    }


    /**
     * Gets the monstatcode value for this Service.
     * 
     * @return monstatcode
     */
    public int getMonstatcode() {
        return monstatcode;
    }


    /**
     * Sets the monstatcode value for this Service.
     * 
     * @param monstatcode
     */
    public void setMonstatcode(int monstatcode) {
        this.monstatcode = monstatcode;
    }


    /**
     * Gets the lastresponse value for this Service.
     * 
     * @return lastresponse
     */
    public java.lang.String getLastresponse() {
        return lastresponse;
    }


    /**
     * Sets the lastresponse value for this Service.
     * 
     * @param lastresponse
     */
    public void setLastresponse(java.lang.String lastresponse) {
        this.lastresponse = lastresponse;
    }


    /**
     * Gets the responsetime value for this Service.
     * 
     * @return responsetime
     */
    public org.apache.axis.types.UnsignedLong getResponsetime() {
        return responsetime;
    }


    /**
     * Sets the responsetime value for this Service.
     * 
     * @param responsetime
     */
    public void setResponsetime(org.apache.axis.types.UnsignedLong responsetime) {
        this.responsetime = responsetime;
    }


    /**
     * Gets the monstatparam1 value for this Service.
     * 
     * @return monstatparam1
     */
    public int getMonstatparam1() {
        return monstatparam1;
    }


    /**
     * Sets the monstatparam1 value for this Service.
     * 
     * @param monstatparam1
     */
    public void setMonstatparam1(int monstatparam1) {
        this.monstatparam1 = monstatparam1;
    }


    /**
     * Gets the monstatparam2 value for this Service.
     * 
     * @return monstatparam2
     */
    public int getMonstatparam2() {
        return monstatparam2;
    }


    /**
     * Sets the monstatparam2 value for this Service.
     * 
     * @param monstatparam2
     */
    public void setMonstatparam2(int monstatparam2) {
        this.monstatparam2 = monstatparam2;
    }


    /**
     * Gets the monstatparam3 value for this Service.
     * 
     * @return monstatparam3
     */
    public int getMonstatparam3() {
        return monstatparam3;
    }


    /**
     * Sets the monstatparam3 value for this Service.
     * 
     * @param monstatparam3
     */
    public void setMonstatparam3(int monstatparam3) {
        this.monstatparam3 = monstatparam3;
    }


    /**
     * Gets the downstateflush value for this Service.
     * 
     * @return downstateflush
     */
    public java.lang.String getDownstateflush() {
        return downstateflush;
    }


    /**
     * Sets the downstateflush value for this Service.
     * 
     * @param downstateflush
     */
    public void setDownstateflush(java.lang.String downstateflush) {
        this.downstateflush = downstateflush;
    }


    /**
     * Gets the statechangetimesec value for this Service.
     * 
     * @return statechangetimesec
     */
    public java.lang.String getStatechangetimesec() {
        return statechangetimesec;
    }


    /**
     * Sets the statechangetimesec value for this Service.
     * 
     * @param statechangetimesec
     */
    public void setStatechangetimesec(java.lang.String statechangetimesec) {
        this.statechangetimesec = statechangetimesec;
    }


    /**
     * Gets the statechangetimemsec value for this Service.
     * 
     * @return statechangetimemsec
     */
    public org.apache.axis.types.UnsignedInt getStatechangetimemsec() {
        return statechangetimemsec;
    }


    /**
     * Sets the statechangetimemsec value for this Service.
     * 
     * @param statechangetimemsec
     */
    public void setStatechangetimemsec(org.apache.axis.types.UnsignedInt statechangetimemsec) {
        this.statechangetimemsec = statechangetimemsec;
    }


    /**
     * Gets the timesincelaststatechange value for this Service.
     * 
     * @return timesincelaststatechange
     */
    public org.apache.axis.types.UnsignedInt getTimesincelaststatechange() {
        return timesincelaststatechange;
    }


    /**
     * Sets the timesincelaststatechange value for this Service.
     * 
     * @param timesincelaststatechange
     */
    public void setTimesincelaststatechange(org.apache.axis.types.UnsignedInt timesincelaststatechange) {
        this.timesincelaststatechange = timesincelaststatechange;
    }


    /**
     * Gets the tickssincelaststatechange value for this Service.
     * 
     * @return tickssincelaststatechange
     */
    public org.apache.axis.types.UnsignedInt getTickssincelaststatechange() {
        return tickssincelaststatechange;
    }


    /**
     * Sets the tickssincelaststatechange value for this Service.
     * 
     * @param tickssincelaststatechange
     */
    public void setTickssincelaststatechange(org.apache.axis.types.UnsignedInt tickssincelaststatechange) {
        this.tickssincelaststatechange = tickssincelaststatechange;
    }


    /**
     * Gets the stateupdatereason value for this Service.
     * 
     * @return stateupdatereason
     */
    public org.apache.axis.types.UnsignedInt getStateupdatereason() {
        return stateupdatereason;
    }


    /**
     * Sets the stateupdatereason value for this Service.
     * 
     * @param stateupdatereason
     */
    public void setStateupdatereason(org.apache.axis.types.UnsignedInt stateupdatereason) {
        this.stateupdatereason = stateupdatereason;
    }


    /**
     * Gets the clmonowner value for this Service.
     * 
     * @return clmonowner
     */
    public org.apache.axis.types.UnsignedInt getClmonowner() {
        return clmonowner;
    }


    /**
     * Sets the clmonowner value for this Service.
     * 
     * @param clmonowner
     */
    public void setClmonowner(org.apache.axis.types.UnsignedInt clmonowner) {
        this.clmonowner = clmonowner;
    }


    /**
     * Gets the clmonview value for this Service.
     * 
     * @return clmonview
     */
    public org.apache.axis.types.UnsignedInt getClmonview() {
        return clmonview;
    }


    /**
     * Sets the clmonview value for this Service.
     * 
     * @param clmonview
     */
    public void setClmonview(org.apache.axis.types.UnsignedInt clmonview) {
        this.clmonview = clmonview;
    }


    /**
     * Gets the tcpprofilename value for this Service.
     * 
     * @return tcpprofilename
     */
    public java.lang.String getTcpprofilename() {
        return tcpprofilename;
    }


    /**
     * Sets the tcpprofilename value for this Service.
     * 
     * @param tcpprofilename
     */
    public void setTcpprofilename(java.lang.String tcpprofilename) {
        this.tcpprofilename = tcpprofilename;
    }


    /**
     * Gets the httpprofilename value for this Service.
     * 
     * @return httpprofilename
     */
    public java.lang.String getHttpprofilename() {
        return httpprofilename;
    }


    /**
     * Sets the httpprofilename value for this Service.
     * 
     * @param httpprofilename
     */
    public void setHttpprofilename(java.lang.String httpprofilename) {
        this.httpprofilename = httpprofilename;
    }


    /**
     * Gets the hashid value for this Service.
     * 
     * @return hashid
     */
    public org.apache.axis.types.UnsignedInt getHashid() {
        return hashid;
    }


    /**
     * Sets the hashid value for this Service.
     * 
     * @param hashid
     */
    public void setHashid(org.apache.axis.types.UnsignedInt hashid) {
        this.hashid = hashid;
    }


    /**
     * Gets the graceful value for this Service.
     * 
     * @return graceful
     */
    public java.lang.String getGraceful() {
        return graceful;
    }


    /**
     * Sets the graceful value for this Service.
     * 
     * @param graceful
     */
    public void setGraceful(java.lang.String graceful) {
        this.graceful = graceful;
    }


    /**
     * Gets the comment value for this Service.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Service.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the monitortotalprobes value for this Service.
     * 
     * @return monitortotalprobes
     */
    public org.apache.axis.types.UnsignedInt[] getMonitortotalprobes() {
        return monitortotalprobes;
    }


    /**
     * Sets the monitortotalprobes value for this Service.
     * 
     * @param monitortotalprobes
     */
    public void setMonitortotalprobes(org.apache.axis.types.UnsignedInt[] monitortotalprobes) {
        this.monitortotalprobes = monitortotalprobes;
    }


    /**
     * Gets the monitortotalfailedprobes value for this Service.
     * 
     * @return monitortotalfailedprobes
     */
    public org.apache.axis.types.UnsignedInt[] getMonitortotalfailedprobes() {
        return monitortotalfailedprobes;
    }


    /**
     * Sets the monitortotalfailedprobes value for this Service.
     * 
     * @param monitortotalfailedprobes
     */
    public void setMonitortotalfailedprobes(org.apache.axis.types.UnsignedInt[] monitortotalfailedprobes) {
        this.monitortotalfailedprobes = monitortotalfailedprobes;
    }


    /**
     * Gets the monitorcurrentfailedprobes value for this Service.
     * 
     * @return monitorcurrentfailedprobes
     */
    public org.apache.axis.types.UnsignedInt[] getMonitorcurrentfailedprobes() {
        return monitorcurrentfailedprobes;
    }


    /**
     * Sets the monitorcurrentfailedprobes value for this Service.
     * 
     * @param monitorcurrentfailedprobes
     */
    public void setMonitorcurrentfailedprobes(org.apache.axis.types.UnsignedInt[] monitorcurrentfailedprobes) {
        this.monitorcurrentfailedprobes = monitorcurrentfailedprobes;
    }


    /**
     * Gets the healthmonitor value for this Service.
     * 
     * @return healthmonitor
     */
    public java.lang.String getHealthmonitor() {
        return healthmonitor;
    }


    /**
     * Sets the healthmonitor value for this Service.
     * 
     * @param healthmonitor
     */
    public void setHealthmonitor(java.lang.String healthmonitor) {
        this.healthmonitor = healthmonitor;
    }


    /**
     * Gets the appflowlog value for this Service.
     * 
     * @return appflowlog
     */
    public java.lang.String getAppflowlog() {
        return appflowlog;
    }


    /**
     * Sets the appflowlog value for this Service.
     * 
     * @param appflowlog
     */
    public void setAppflowlog(java.lang.String appflowlog) {
        this.appflowlog = appflowlog;
    }


    /**
     * Gets the netprofile value for this Service.
     * 
     * @return netprofile
     */
    public java.lang.String getNetprofile() {
        return netprofile;
    }


    /**
     * Sets the netprofile value for this Service.
     * 
     * @param netprofile
     */
    public void setNetprofile(java.lang.String netprofile) {
        this.netprofile = netprofile;
    }


    /**
     * Gets the serviceipstr value for this Service.
     * 
     * @return serviceipstr
     */
    public java.lang.String getServiceipstr() {
        return serviceipstr;
    }


    /**
     * Sets the serviceipstr value for this Service.
     * 
     * @param serviceipstr
     */
    public void setServiceipstr(java.lang.String serviceipstr) {
        this.serviceipstr = serviceipstr;
    }


    /**
     * Gets the weight2 value for this Service.
     * 
     * @return weight2
     */
    public org.apache.axis.types.UnsignedInt[] getWeight2() {
        return weight2;
    }


    /**
     * Sets the weight2 value for this Service.
     * 
     * @param weight2
     */
    public void setWeight2(org.apache.axis.types.UnsignedInt[] weight2) {
        this.weight2 = weight2;
    }


    /**
     * Gets the passive value for this Service.
     * 
     * @return passive
     */
    public boolean[] getPassive() {
        return passive;
    }


    /**
     * Sets the passive value for this Service.
     * 
     * @param passive
     */
    public void setPassive(boolean[] passive) {
        this.passive = passive;
    }


    /**
     * Gets the runningmonstate value for this Service.
     * 
     * @return runningmonstate
     */
    public java.lang.String[] getRunningmonstate() {
        return runningmonstate;
    }


    /**
     * Sets the runningmonstate value for this Service.
     * 
     * @param runningmonstate
     */
    public void setRunningmonstate(java.lang.String[] runningmonstate) {
        this.runningmonstate = runningmonstate;
    }


    /**
     * Gets the svcmonstate value for this Service.
     * 
     * @return svcmonstate
     */
    public java.lang.String[] getSvcmonstate() {
        return svcmonstate;
    }


    /**
     * Sets the svcmonstate value for this Service.
     * 
     * @param svcmonstate
     */
    public void setSvcmonstate(java.lang.String[] svcmonstate) {
        this.svcmonstate = svcmonstate;
    }


    /**
     * Gets the boundmonstatcode value for this Service.
     * 
     * @return boundmonstatcode
     */
    public int[] getBoundmonstatcode() {
        return boundmonstatcode;
    }


    /**
     * Sets the boundmonstatcode value for this Service.
     * 
     * @param boundmonstatcode
     */
    public void setBoundmonstatcode(int[] boundmonstatcode) {
        this.boundmonstatcode = boundmonstatcode;
    }


    /**
     * Gets the boundlastresponse value for this Service.
     * 
     * @return boundlastresponse
     */
    public java.lang.String[] getBoundlastresponse() {
        return boundlastresponse;
    }


    /**
     * Sets the boundlastresponse value for this Service.
     * 
     * @param boundlastresponse
     */
    public void setBoundlastresponse(java.lang.String[] boundlastresponse) {
        this.boundlastresponse = boundlastresponse;
    }


    /**
     * Gets the boundmonstatparam1 value for this Service.
     * 
     * @return boundmonstatparam1
     */
    public int[] getBoundmonstatparam1() {
        return boundmonstatparam1;
    }


    /**
     * Sets the boundmonstatparam1 value for this Service.
     * 
     * @param boundmonstatparam1
     */
    public void setBoundmonstatparam1(int[] boundmonstatparam1) {
        this.boundmonstatparam1 = boundmonstatparam1;
    }


    /**
     * Gets the boundmonstatparam2 value for this Service.
     * 
     * @return boundmonstatparam2
     */
    public int[] getBoundmonstatparam2() {
        return boundmonstatparam2;
    }


    /**
     * Sets the boundmonstatparam2 value for this Service.
     * 
     * @param boundmonstatparam2
     */
    public void setBoundmonstatparam2(int[] boundmonstatparam2) {
        this.boundmonstatparam2 = boundmonstatparam2;
    }


    /**
     * Gets the boundmonstatparam3 value for this Service.
     * 
     * @return boundmonstatparam3
     */
    public int[] getBoundmonstatparam3() {
        return boundmonstatparam3;
    }


    /**
     * Sets the boundmonstatparam3 value for this Service.
     * 
     * @param boundmonstatparam3
     */
    public void setBoundmonstatparam3(int[] boundmonstatparam3) {
        this.boundmonstatparam3 = boundmonstatparam3;
    }


    /**
     * Gets the boundresponsetime value for this Service.
     * 
     * @return boundresponsetime
     */
    public org.apache.axis.types.UnsignedLong[] getBoundresponsetime() {
        return boundresponsetime;
    }


    /**
     * Sets the boundresponsetime value for this Service.
     * 
     * @param boundresponsetime
     */
    public void setBoundresponsetime(org.apache.axis.types.UnsignedLong[] boundresponsetime) {
        this.boundresponsetime = boundresponsetime;
    }


    /**
     * Gets the scpolicyname value for this Service.
     * 
     * @return scpolicyname
     */
    public java.lang.String[] getScpolicyname() {
        return scpolicyname;
    }


    /**
     * Sets the scpolicyname value for this Service.
     * 
     * @param scpolicyname
     */
    public void setScpolicyname(java.lang.String[] scpolicyname) {
        this.scpolicyname = scpolicyname;
    }


    /**
     * Gets the dospolicyname value for this Service.
     * 
     * @return dospolicyname
     */
    public java.lang.String[] getDospolicyname() {
        return dospolicyname;
    }


    /**
     * Sets the dospolicyname value for this Service.
     * 
     * @param dospolicyname
     */
    public void setDospolicyname(java.lang.String[] dospolicyname) {
        this.dospolicyname = dospolicyname;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Service)) return false;
        Service other = (Service) obj;
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
            this.all == other.isAll() &&
            this.internaL == other.isInternaL() &&
            this.numofconnections == other.getNumofconnections() &&
            ((this.servername==null && other.getServername()==null) || 
             (this.servername!=null &&
              this.servername.equals(other.getServername()))) &&
            ((this.policyname==null && other.getPolicyname()==null) || 
             (this.policyname!=null &&
              this.policyname.equals(other.getPolicyname()))) &&
            ((this.servicetype==null && other.getServicetype()==null) || 
             (this.servicetype!=null &&
              this.servicetype.equals(other.getServicetype()))) &&
            this.serviceconftpye == other.isServiceconftpye() &&
            this.serviceconftype == other.isServiceconftype() &&
            ((this.serviceconftype2==null && other.getServiceconftype2()==null) || 
             (this.serviceconftype2!=null &&
              this.serviceconftype2.equals(other.getServiceconftype2()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.cleartextport==null && other.getCleartextport()==null) || 
             (this.cleartextport!=null &&
              this.cleartextport.equals(other.getCleartextport()))) &&
            ((this.gslb==null && other.getGslb()==null) || 
             (this.gslb!=null &&
              this.gslb.equals(other.getGslb()))) &&
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
            ((this.sc==null && other.getSc()==null) || 
             (this.sc!=null &&
              this.sc.equals(other.getSc()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              java.util.Arrays.equals(this.weight, other.getWeight()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.sp==null && other.getSp()==null) || 
             (this.sp!=null &&
              this.sp.equals(other.getSp()))) &&
            ((this.rtspsessionidremap==null && other.getRtspsessionidremap()==null) || 
             (this.rtspsessionidremap!=null &&
              this.rtspsessionidremap.equals(other.getRtspsessionidremap()))) &&
            ((this.failedprobes==null && other.getFailedprobes()==null) || 
             (this.failedprobes!=null &&
              java.util.Arrays.equals(this.failedprobes, other.getFailedprobes()))) &&
            ((this.clttimeout==null && other.getClttimeout()==null) || 
             (this.clttimeout!=null &&
              this.clttimeout.equals(other.getClttimeout()))) &&
            ((this.totalprobes==null && other.getTotalprobes()==null) || 
             (this.totalprobes!=null &&
              java.util.Arrays.equals(this.totalprobes, other.getTotalprobes()))) &&
            ((this.svrtimeout==null && other.getSvrtimeout()==null) || 
             (this.svrtimeout!=null &&
              this.svrtimeout.equals(other.getSvrtimeout()))) &&
            ((this.totalfailedprobes==null && other.getTotalfailedprobes()==null) || 
             (this.totalfailedprobes!=null &&
              java.util.Arrays.equals(this.totalfailedprobes, other.getTotalfailedprobes()))) &&
            ((this.publicip==null && other.getPublicip()==null) || 
             (this.publicip!=null &&
              this.publicip.equals(other.getPublicip()))) &&
            ((this.publicport==null && other.getPublicport()==null) || 
             (this.publicport!=null &&
              this.publicport.equals(other.getPublicport()))) &&
            ((this.customserverid==null && other.getCustomserverid()==null) || 
             (this.customserverid!=null &&
              this.customserverid.equals(other.getCustomserverid()))) &&
            ((this.serverid==null && other.getServerid()==null) || 
             (this.serverid!=null &&
              this.serverid.equals(other.getServerid()))) &&
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
            ((this.accessdown==null && other.getAccessdown()==null) || 
             (this.accessdown!=null &&
              this.accessdown.equals(other.getAccessdown()))) &&
            ((this.svrstate==null && other.getSvrstate()==null) || 
             (this.svrstate!=null &&
              this.svrstate.equals(other.getSvrstate()))) &&
            ((this.delay==null && other.getDelay()==null) || 
             (this.delay!=null &&
              this.delay.equals(other.getDelay()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              this.ipaddress.equals(other.getIpaddress()))) &&
            ((this.monitorname==null && other.getMonitorname()==null) || 
             (this.monitorname!=null &&
              java.util.Arrays.equals(this.monitorname, other.getMonitorname()))) &&
            ((this.monthreshold==null && other.getMonthreshold()==null) || 
             (this.monthreshold!=null &&
              this.monthreshold.equals(other.getMonthreshold()))) &&
            ((this.monstate==null && other.getMonstate()==null) || 
             (this.monstate!=null &&
              java.util.Arrays.equals(this.monstate, other.getMonstate()))) &&
            ((this.monstate2==null && other.getMonstate2()==null) || 
             (this.monstate2!=null &&
              this.monstate2.equals(other.getMonstate2()))) &&
            this.monstatcode == other.getMonstatcode() &&
            ((this.lastresponse==null && other.getLastresponse()==null) || 
             (this.lastresponse!=null &&
              this.lastresponse.equals(other.getLastresponse()))) &&
            ((this.responsetime==null && other.getResponsetime()==null) || 
             (this.responsetime!=null &&
              this.responsetime.equals(other.getResponsetime()))) &&
            this.monstatparam1 == other.getMonstatparam1() &&
            this.monstatparam2 == other.getMonstatparam2() &&
            this.monstatparam3 == other.getMonstatparam3() &&
            ((this.downstateflush==null && other.getDownstateflush()==null) || 
             (this.downstateflush!=null &&
              this.downstateflush.equals(other.getDownstateflush()))) &&
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
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.monitortotalprobes==null && other.getMonitortotalprobes()==null) || 
             (this.monitortotalprobes!=null &&
              java.util.Arrays.equals(this.monitortotalprobes, other.getMonitortotalprobes()))) &&
            ((this.monitortotalfailedprobes==null && other.getMonitortotalfailedprobes()==null) || 
             (this.monitortotalfailedprobes!=null &&
              java.util.Arrays.equals(this.monitortotalfailedprobes, other.getMonitortotalfailedprobes()))) &&
            ((this.monitorcurrentfailedprobes==null && other.getMonitorcurrentfailedprobes()==null) || 
             (this.monitorcurrentfailedprobes!=null &&
              java.util.Arrays.equals(this.monitorcurrentfailedprobes, other.getMonitorcurrentfailedprobes()))) &&
            ((this.healthmonitor==null && other.getHealthmonitor()==null) || 
             (this.healthmonitor!=null &&
              this.healthmonitor.equals(other.getHealthmonitor()))) &&
            ((this.appflowlog==null && other.getAppflowlog()==null) || 
             (this.appflowlog!=null &&
              this.appflowlog.equals(other.getAppflowlog()))) &&
            ((this.netprofile==null && other.getNetprofile()==null) || 
             (this.netprofile!=null &&
              this.netprofile.equals(other.getNetprofile()))) &&
            ((this.serviceipstr==null && other.getServiceipstr()==null) || 
             (this.serviceipstr!=null &&
              this.serviceipstr.equals(other.getServiceipstr()))) &&
            ((this.weight2==null && other.getWeight2()==null) || 
             (this.weight2!=null &&
              java.util.Arrays.equals(this.weight2, other.getWeight2()))) &&
            ((this.passive==null && other.getPassive()==null) || 
             (this.passive!=null &&
              java.util.Arrays.equals(this.passive, other.getPassive()))) &&
            ((this.runningmonstate==null && other.getRunningmonstate()==null) || 
             (this.runningmonstate!=null &&
              java.util.Arrays.equals(this.runningmonstate, other.getRunningmonstate()))) &&
            ((this.svcmonstate==null && other.getSvcmonstate()==null) || 
             (this.svcmonstate!=null &&
              java.util.Arrays.equals(this.svcmonstate, other.getSvcmonstate()))) &&
            ((this.boundmonstatcode==null && other.getBoundmonstatcode()==null) || 
             (this.boundmonstatcode!=null &&
              java.util.Arrays.equals(this.boundmonstatcode, other.getBoundmonstatcode()))) &&
            ((this.boundlastresponse==null && other.getBoundlastresponse()==null) || 
             (this.boundlastresponse!=null &&
              java.util.Arrays.equals(this.boundlastresponse, other.getBoundlastresponse()))) &&
            ((this.boundmonstatparam1==null && other.getBoundmonstatparam1()==null) || 
             (this.boundmonstatparam1!=null &&
              java.util.Arrays.equals(this.boundmonstatparam1, other.getBoundmonstatparam1()))) &&
            ((this.boundmonstatparam2==null && other.getBoundmonstatparam2()==null) || 
             (this.boundmonstatparam2!=null &&
              java.util.Arrays.equals(this.boundmonstatparam2, other.getBoundmonstatparam2()))) &&
            ((this.boundmonstatparam3==null && other.getBoundmonstatparam3()==null) || 
             (this.boundmonstatparam3!=null &&
              java.util.Arrays.equals(this.boundmonstatparam3, other.getBoundmonstatparam3()))) &&
            ((this.boundresponsetime==null && other.getBoundresponsetime()==null) || 
             (this.boundresponsetime!=null &&
              java.util.Arrays.equals(this.boundresponsetime, other.getBoundresponsetime()))) &&
            ((this.scpolicyname==null && other.getScpolicyname()==null) || 
             (this.scpolicyname!=null &&
              java.util.Arrays.equals(this.scpolicyname, other.getScpolicyname()))) &&
            ((this.dospolicyname==null && other.getDospolicyname()==null) || 
             (this.dospolicyname!=null &&
              java.util.Arrays.equals(this.dospolicyname, other.getDospolicyname())));
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
        _hashCode += (isAll() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isInternaL() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getNumofconnections();
        if (getServername() != null) {
            _hashCode += getServername().hashCode();
        }
        if (getPolicyname() != null) {
            _hashCode += getPolicyname().hashCode();
        }
        if (getServicetype() != null) {
            _hashCode += getServicetype().hashCode();
        }
        _hashCode += (isServiceconftpye() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isServiceconftype() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getServiceconftype2() != null) {
            _hashCode += getServiceconftype2().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getCleartextport() != null) {
            _hashCode += getCleartextport().hashCode();
        }
        if (getGslb() != null) {
            _hashCode += getGslb().hashCode();
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
        if (getSc() != null) {
            _hashCode += getSc().hashCode();
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
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getSp() != null) {
            _hashCode += getSp().hashCode();
        }
        if (getRtspsessionidremap() != null) {
            _hashCode += getRtspsessionidremap().hashCode();
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
        if (getClttimeout() != null) {
            _hashCode += getClttimeout().hashCode();
        }
        if (getTotalprobes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTotalprobes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTotalprobes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getPublicip() != null) {
            _hashCode += getPublicip().hashCode();
        }
        if (getPublicport() != null) {
            _hashCode += getPublicport().hashCode();
        }
        if (getCustomserverid() != null) {
            _hashCode += getCustomserverid().hashCode();
        }
        if (getServerid() != null) {
            _hashCode += getServerid().hashCode();
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
        if (getAccessdown() != null) {
            _hashCode += getAccessdown().hashCode();
        }
        if (getSvrstate() != null) {
            _hashCode += getSvrstate().hashCode();
        }
        if (getDelay() != null) {
            _hashCode += getDelay().hashCode();
        }
        if (getIpaddress() != null) {
            _hashCode += getIpaddress().hashCode();
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
        if (getMonstate2() != null) {
            _hashCode += getMonstate2().hashCode();
        }
        _hashCode += getMonstatcode();
        if (getLastresponse() != null) {
            _hashCode += getLastresponse().hashCode();
        }
        if (getResponsetime() != null) {
            _hashCode += getResponsetime().hashCode();
        }
        _hashCode += getMonstatparam1();
        _hashCode += getMonstatparam2();
        _hashCode += getMonstatparam3();
        if (getDownstateflush() != null) {
            _hashCode += getDownstateflush().hashCode();
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
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
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
        if (getHealthmonitor() != null) {
            _hashCode += getHealthmonitor().hashCode();
        }
        if (getAppflowlog() != null) {
            _hashCode += getAppflowlog().hashCode();
        }
        if (getNetprofile() != null) {
            _hashCode += getNetprofile().hashCode();
        }
        if (getServiceipstr() != null) {
            _hashCode += getServiceipstr().hashCode();
        }
        if (getWeight2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWeight2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWeight2(), i);
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
        if (getRunningmonstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRunningmonstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRunningmonstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvcmonstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvcmonstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvcmonstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBoundmonstatcode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundmonstatcode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundmonstatcode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBoundlastresponse() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundlastresponse());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundlastresponse(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBoundmonstatparam1() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundmonstatparam1());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundmonstatparam1(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBoundmonstatparam2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundmonstatparam2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundmonstatparam2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBoundmonstatparam3() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundmonstatparam3());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundmonstatparam3(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBoundresponsetime() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundresponsetime());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundresponsetime(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDospolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDospolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDospolicyname(), i);
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
        new org.apache.axis.description.TypeDesc(Service.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "service"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("all");
        elemField.setXmlName(new javax.xml.namespace.QName("", "all"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internaL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internaL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numofconnections");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numofconnections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servername"));
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
        elemField.setFieldName("servicetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("serviceconftype2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceconftype2"));
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
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cleartextport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cleartextport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gslb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gslb"));
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
        elemField.setFieldName("sc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sc"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
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
        elemField.setFieldName("failedprobes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "failedprobes"));
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
        elemField.setFieldName("totalprobes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalprobes"));
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
        elemField.setFieldName("accessdown");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accessdown"));
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
        elemField.setFieldName("ipaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipaddress"));
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
        elemField.setFieldName("lastresponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastresponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responsetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
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
        elemField.setFieldName("downstateflush");
        elemField.setXmlName(new javax.xml.namespace.QName("", "downstateflush"));
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
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
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
        elemField.setFieldName("serviceipstr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceipstr"));
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
        elemField.setFieldName("passive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("runningmonstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "runningmonstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcmonstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcmonstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundmonstatcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundmonstatcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundlastresponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundlastresponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundmonstatparam1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundmonstatparam1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundmonstatparam2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundmonstatparam2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundmonstatparam3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundmonstatparam3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundresponsetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundresponsetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dospolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dospolicyname"));
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
