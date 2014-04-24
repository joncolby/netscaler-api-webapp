/**
 * InterfacE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class InterfacE  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String devicename;

    private org.apache.axis.types.UnsignedInt unit;

    private java.lang.String description;

    private org.apache.axis.types.UnsignedInt flags;

    private org.apache.axis.types.UnsignedInt mtu;

    private org.apache.axis.types.UnsignedInt vlan;

    private java.lang.String mac;

    private org.apache.axis.types.UnsignedInt uptime;

    private org.apache.axis.types.UnsignedInt downtime;

    private java.lang.String reqmedia;

    private java.lang.String reqspeed;

    private java.lang.String reqduplex;

    private java.lang.String reqflowcontrol;

    private java.lang.String media;

    private java.lang.String speed;

    private java.lang.String duplex;

    private java.lang.String flowcontrol;

    private java.lang.String conndistr;

    private java.lang.String macdistr;

    private java.lang.String mode;

    private java.lang.String hamonitor;

    private java.lang.String state;

    private java.lang.String autoneg;

    private org.apache.axis.types.UnsignedInt autonegresult;

    private org.apache.axis.types.UnsignedInt tagged;

    private java.lang.String tagall;

    private java.lang.String trunk;

    private org.apache.axis.types.UnsignedInt taggedany;

    private org.apache.axis.types.UnsignedInt taggedautolearn;

    private org.apache.axis.types.UnsignedInt hangdetect;

    private org.apache.axis.types.UnsignedInt hangreset;

    private org.apache.axis.types.UnsignedInt linkstate;

    private org.apache.axis.types.UnsignedInt intfstate;

    private org.apache.axis.types.UnsignedLong rxpackets;

    private org.apache.axis.types.UnsignedLong rxbytes;

    private org.apache.axis.types.UnsignedLong rxerrors;

    private org.apache.axis.types.UnsignedLong rxdrops;

    private org.apache.axis.types.UnsignedLong txpackets;

    private org.apache.axis.types.UnsignedLong txbytes;

    private org.apache.axis.types.UnsignedLong txerrors;

    private org.apache.axis.types.UnsignedLong txdrops;

    private org.apache.axis.types.UnsignedLong indisc;

    private org.apache.axis.types.UnsignedLong outdisc;

    private org.apache.axis.types.UnsignedLong fctls;

    private org.apache.axis.types.UnsignedInt hangs;

    private org.apache.axis.types.UnsignedInt stsstalls;

    private org.apache.axis.types.UnsignedInt txstalls;

    private org.apache.axis.types.UnsignedInt rxstalls;

    private org.apache.axis.types.UnsignedLong bdgmacmoved;

    private org.apache.axis.types.UnsignedInt bdgmuted;

    private java.lang.String vmac;

    private java.lang.String vmac6;

    private java.lang.String lacpmode;

    private int lacpkey;

    private org.apache.axis.types.UnsignedInt lacppriority;

    private java.lang.String lacptimeout;

    private java.lang.String lagtype;

    private java.lang.String ifalias;

    private org.apache.axis.types.UnsignedInt reqthroughput;

    private org.apache.axis.types.UnsignedInt throughput;

    private org.apache.axis.types.UnsignedInt bandwidthhigh;

    private org.apache.axis.types.UnsignedInt bandwidthnormal;

    private java.lang.String backplane;

    private java.lang.String[] ifnum;

    private org.apache.axis.types.UnsignedInt cleartime;

    private org.apache.axis.types.UnsignedInt slavestate;

    private org.apache.axis.types.UnsignedInt slavemedia;

    private org.apache.axis.types.UnsignedInt slavespeed;

    private org.apache.axis.types.UnsignedInt slaveduplex;

    private org.apache.axis.types.UnsignedInt slaveflowctl;

    private org.apache.axis.types.UnsignedInt slavetime;

    private java.lang.String intftype;

    private org.apache.axis.types.UnsignedInt lacpactorpriority;

    private org.apache.axis.types.UnsignedInt lacpactorportno;

    private java.lang.String lacppartnerstate;

    private java.lang.String lacppartnertimeout;

    private java.lang.String lacppartneraggregation;

    private java.lang.String lacppartnerinsync;

    private java.lang.String lacppartnercollecting;

    private java.lang.String lacppartnerdistributing;

    private java.lang.String lacppartnerdefaulted;

    private java.lang.String lacppartnerexpired;

    private org.apache.axis.types.UnsignedInt lacppartnerpriority;

    private java.lang.String lacppartnersystemmac;

    private org.apache.axis.types.UnsignedInt lacppartnersystempriority;

    private org.apache.axis.types.UnsignedInt lacppartnerportno;

    private org.apache.axis.types.UnsignedInt lacppartnerkey;

    private java.lang.String lacpactoraggregation;

    private java.lang.String lacpactorinsync;

    private java.lang.String lacpactorcollecting;

    private java.lang.String lacpactordistributing;

    private java.lang.String lacpportmuxstate;

    private java.lang.String lacpportrxstat;

    private java.lang.String lacpportselectstate;

    public InterfacE() {
    }

    public InterfacE(
           java.lang.String id,
           java.lang.String devicename,
           org.apache.axis.types.UnsignedInt unit,
           java.lang.String description,
           org.apache.axis.types.UnsignedInt flags,
           org.apache.axis.types.UnsignedInt mtu,
           org.apache.axis.types.UnsignedInt vlan,
           java.lang.String mac,
           org.apache.axis.types.UnsignedInt uptime,
           org.apache.axis.types.UnsignedInt downtime,
           java.lang.String reqmedia,
           java.lang.String reqspeed,
           java.lang.String reqduplex,
           java.lang.String reqflowcontrol,
           java.lang.String media,
           java.lang.String speed,
           java.lang.String duplex,
           java.lang.String flowcontrol,
           java.lang.String conndistr,
           java.lang.String macdistr,
           java.lang.String mode,
           java.lang.String hamonitor,
           java.lang.String state,
           java.lang.String autoneg,
           org.apache.axis.types.UnsignedInt autonegresult,
           org.apache.axis.types.UnsignedInt tagged,
           java.lang.String tagall,
           java.lang.String trunk,
           org.apache.axis.types.UnsignedInt taggedany,
           org.apache.axis.types.UnsignedInt taggedautolearn,
           org.apache.axis.types.UnsignedInt hangdetect,
           org.apache.axis.types.UnsignedInt hangreset,
           org.apache.axis.types.UnsignedInt linkstate,
           org.apache.axis.types.UnsignedInt intfstate,
           org.apache.axis.types.UnsignedLong rxpackets,
           org.apache.axis.types.UnsignedLong rxbytes,
           org.apache.axis.types.UnsignedLong rxerrors,
           org.apache.axis.types.UnsignedLong rxdrops,
           org.apache.axis.types.UnsignedLong txpackets,
           org.apache.axis.types.UnsignedLong txbytes,
           org.apache.axis.types.UnsignedLong txerrors,
           org.apache.axis.types.UnsignedLong txdrops,
           org.apache.axis.types.UnsignedLong indisc,
           org.apache.axis.types.UnsignedLong outdisc,
           org.apache.axis.types.UnsignedLong fctls,
           org.apache.axis.types.UnsignedInt hangs,
           org.apache.axis.types.UnsignedInt stsstalls,
           org.apache.axis.types.UnsignedInt txstalls,
           org.apache.axis.types.UnsignedInt rxstalls,
           org.apache.axis.types.UnsignedLong bdgmacmoved,
           org.apache.axis.types.UnsignedInt bdgmuted,
           java.lang.String vmac,
           java.lang.String vmac6,
           java.lang.String lacpmode,
           int lacpkey,
           org.apache.axis.types.UnsignedInt lacppriority,
           java.lang.String lacptimeout,
           java.lang.String lagtype,
           java.lang.String ifalias,
           org.apache.axis.types.UnsignedInt reqthroughput,
           org.apache.axis.types.UnsignedInt throughput,
           org.apache.axis.types.UnsignedInt bandwidthhigh,
           org.apache.axis.types.UnsignedInt bandwidthnormal,
           java.lang.String backplane,
           java.lang.String[] ifnum,
           org.apache.axis.types.UnsignedInt cleartime,
           org.apache.axis.types.UnsignedInt slavestate,
           org.apache.axis.types.UnsignedInt slavemedia,
           org.apache.axis.types.UnsignedInt slavespeed,
           org.apache.axis.types.UnsignedInt slaveduplex,
           org.apache.axis.types.UnsignedInt slaveflowctl,
           org.apache.axis.types.UnsignedInt slavetime,
           java.lang.String intftype,
           org.apache.axis.types.UnsignedInt lacpactorpriority,
           org.apache.axis.types.UnsignedInt lacpactorportno,
           java.lang.String lacppartnerstate,
           java.lang.String lacppartnertimeout,
           java.lang.String lacppartneraggregation,
           java.lang.String lacppartnerinsync,
           java.lang.String lacppartnercollecting,
           java.lang.String lacppartnerdistributing,
           java.lang.String lacppartnerdefaulted,
           java.lang.String lacppartnerexpired,
           org.apache.axis.types.UnsignedInt lacppartnerpriority,
           java.lang.String lacppartnersystemmac,
           org.apache.axis.types.UnsignedInt lacppartnersystempriority,
           org.apache.axis.types.UnsignedInt lacppartnerportno,
           org.apache.axis.types.UnsignedInt lacppartnerkey,
           java.lang.String lacpactoraggregation,
           java.lang.String lacpactorinsync,
           java.lang.String lacpactorcollecting,
           java.lang.String lacpactordistributing,
           java.lang.String lacpportmuxstate,
           java.lang.String lacpportrxstat,
           java.lang.String lacpportselectstate) {
           this.id = id;
           this.devicename = devicename;
           this.unit = unit;
           this.description = description;
           this.flags = flags;
           this.mtu = mtu;
           this.vlan = vlan;
           this.mac = mac;
           this.uptime = uptime;
           this.downtime = downtime;
           this.reqmedia = reqmedia;
           this.reqspeed = reqspeed;
           this.reqduplex = reqduplex;
           this.reqflowcontrol = reqflowcontrol;
           this.media = media;
           this.speed = speed;
           this.duplex = duplex;
           this.flowcontrol = flowcontrol;
           this.conndistr = conndistr;
           this.macdistr = macdistr;
           this.mode = mode;
           this.hamonitor = hamonitor;
           this.state = state;
           this.autoneg = autoneg;
           this.autonegresult = autonegresult;
           this.tagged = tagged;
           this.tagall = tagall;
           this.trunk = trunk;
           this.taggedany = taggedany;
           this.taggedautolearn = taggedautolearn;
           this.hangdetect = hangdetect;
           this.hangreset = hangreset;
           this.linkstate = linkstate;
           this.intfstate = intfstate;
           this.rxpackets = rxpackets;
           this.rxbytes = rxbytes;
           this.rxerrors = rxerrors;
           this.rxdrops = rxdrops;
           this.txpackets = txpackets;
           this.txbytes = txbytes;
           this.txerrors = txerrors;
           this.txdrops = txdrops;
           this.indisc = indisc;
           this.outdisc = outdisc;
           this.fctls = fctls;
           this.hangs = hangs;
           this.stsstalls = stsstalls;
           this.txstalls = txstalls;
           this.rxstalls = rxstalls;
           this.bdgmacmoved = bdgmacmoved;
           this.bdgmuted = bdgmuted;
           this.vmac = vmac;
           this.vmac6 = vmac6;
           this.lacpmode = lacpmode;
           this.lacpkey = lacpkey;
           this.lacppriority = lacppriority;
           this.lacptimeout = lacptimeout;
           this.lagtype = lagtype;
           this.ifalias = ifalias;
           this.reqthroughput = reqthroughput;
           this.throughput = throughput;
           this.bandwidthhigh = bandwidthhigh;
           this.bandwidthnormal = bandwidthnormal;
           this.backplane = backplane;
           this.ifnum = ifnum;
           this.cleartime = cleartime;
           this.slavestate = slavestate;
           this.slavemedia = slavemedia;
           this.slavespeed = slavespeed;
           this.slaveduplex = slaveduplex;
           this.slaveflowctl = slaveflowctl;
           this.slavetime = slavetime;
           this.intftype = intftype;
           this.lacpactorpriority = lacpactorpriority;
           this.lacpactorportno = lacpactorportno;
           this.lacppartnerstate = lacppartnerstate;
           this.lacppartnertimeout = lacppartnertimeout;
           this.lacppartneraggregation = lacppartneraggregation;
           this.lacppartnerinsync = lacppartnerinsync;
           this.lacppartnercollecting = lacppartnercollecting;
           this.lacppartnerdistributing = lacppartnerdistributing;
           this.lacppartnerdefaulted = lacppartnerdefaulted;
           this.lacppartnerexpired = lacppartnerexpired;
           this.lacppartnerpriority = lacppartnerpriority;
           this.lacppartnersystemmac = lacppartnersystemmac;
           this.lacppartnersystempriority = lacppartnersystempriority;
           this.lacppartnerportno = lacppartnerportno;
           this.lacppartnerkey = lacppartnerkey;
           this.lacpactoraggregation = lacpactoraggregation;
           this.lacpactorinsync = lacpactorinsync;
           this.lacpactorcollecting = lacpactorcollecting;
           this.lacpactordistributing = lacpactordistributing;
           this.lacpportmuxstate = lacpportmuxstate;
           this.lacpportrxstat = lacpportrxstat;
           this.lacpportselectstate = lacpportselectstate;
    }


    /**
     * Gets the id value for this InterfacE.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this InterfacE.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the devicename value for this InterfacE.
     * 
     * @return devicename
     */
    public java.lang.String getDevicename() {
        return devicename;
    }


    /**
     * Sets the devicename value for this InterfacE.
     * 
     * @param devicename
     */
    public void setDevicename(java.lang.String devicename) {
        this.devicename = devicename;
    }


    /**
     * Gets the unit value for this InterfacE.
     * 
     * @return unit
     */
    public org.apache.axis.types.UnsignedInt getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this InterfacE.
     * 
     * @param unit
     */
    public void setUnit(org.apache.axis.types.UnsignedInt unit) {
        this.unit = unit;
    }


    /**
     * Gets the description value for this InterfacE.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this InterfacE.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the flags value for this InterfacE.
     * 
     * @return flags
     */
    public org.apache.axis.types.UnsignedInt getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this InterfacE.
     * 
     * @param flags
     */
    public void setFlags(org.apache.axis.types.UnsignedInt flags) {
        this.flags = flags;
    }


    /**
     * Gets the mtu value for this InterfacE.
     * 
     * @return mtu
     */
    public org.apache.axis.types.UnsignedInt getMtu() {
        return mtu;
    }


    /**
     * Sets the mtu value for this InterfacE.
     * 
     * @param mtu
     */
    public void setMtu(org.apache.axis.types.UnsignedInt mtu) {
        this.mtu = mtu;
    }


    /**
     * Gets the vlan value for this InterfacE.
     * 
     * @return vlan
     */
    public org.apache.axis.types.UnsignedInt getVlan() {
        return vlan;
    }


    /**
     * Sets the vlan value for this InterfacE.
     * 
     * @param vlan
     */
    public void setVlan(org.apache.axis.types.UnsignedInt vlan) {
        this.vlan = vlan;
    }


    /**
     * Gets the mac value for this InterfacE.
     * 
     * @return mac
     */
    public java.lang.String getMac() {
        return mac;
    }


    /**
     * Sets the mac value for this InterfacE.
     * 
     * @param mac
     */
    public void setMac(java.lang.String mac) {
        this.mac = mac;
    }


    /**
     * Gets the uptime value for this InterfacE.
     * 
     * @return uptime
     */
    public org.apache.axis.types.UnsignedInt getUptime() {
        return uptime;
    }


    /**
     * Sets the uptime value for this InterfacE.
     * 
     * @param uptime
     */
    public void setUptime(org.apache.axis.types.UnsignedInt uptime) {
        this.uptime = uptime;
    }


    /**
     * Gets the downtime value for this InterfacE.
     * 
     * @return downtime
     */
    public org.apache.axis.types.UnsignedInt getDowntime() {
        return downtime;
    }


    /**
     * Sets the downtime value for this InterfacE.
     * 
     * @param downtime
     */
    public void setDowntime(org.apache.axis.types.UnsignedInt downtime) {
        this.downtime = downtime;
    }


    /**
     * Gets the reqmedia value for this InterfacE.
     * 
     * @return reqmedia
     */
    public java.lang.String getReqmedia() {
        return reqmedia;
    }


    /**
     * Sets the reqmedia value for this InterfacE.
     * 
     * @param reqmedia
     */
    public void setReqmedia(java.lang.String reqmedia) {
        this.reqmedia = reqmedia;
    }


    /**
     * Gets the reqspeed value for this InterfacE.
     * 
     * @return reqspeed
     */
    public java.lang.String getReqspeed() {
        return reqspeed;
    }


    /**
     * Sets the reqspeed value for this InterfacE.
     * 
     * @param reqspeed
     */
    public void setReqspeed(java.lang.String reqspeed) {
        this.reqspeed = reqspeed;
    }


    /**
     * Gets the reqduplex value for this InterfacE.
     * 
     * @return reqduplex
     */
    public java.lang.String getReqduplex() {
        return reqduplex;
    }


    /**
     * Sets the reqduplex value for this InterfacE.
     * 
     * @param reqduplex
     */
    public void setReqduplex(java.lang.String reqduplex) {
        this.reqduplex = reqduplex;
    }


    /**
     * Gets the reqflowcontrol value for this InterfacE.
     * 
     * @return reqflowcontrol
     */
    public java.lang.String getReqflowcontrol() {
        return reqflowcontrol;
    }


    /**
     * Sets the reqflowcontrol value for this InterfacE.
     * 
     * @param reqflowcontrol
     */
    public void setReqflowcontrol(java.lang.String reqflowcontrol) {
        this.reqflowcontrol = reqflowcontrol;
    }


    /**
     * Gets the media value for this InterfacE.
     * 
     * @return media
     */
    public java.lang.String getMedia() {
        return media;
    }


    /**
     * Sets the media value for this InterfacE.
     * 
     * @param media
     */
    public void setMedia(java.lang.String media) {
        this.media = media;
    }


    /**
     * Gets the speed value for this InterfacE.
     * 
     * @return speed
     */
    public java.lang.String getSpeed() {
        return speed;
    }


    /**
     * Sets the speed value for this InterfacE.
     * 
     * @param speed
     */
    public void setSpeed(java.lang.String speed) {
        this.speed = speed;
    }


    /**
     * Gets the duplex value for this InterfacE.
     * 
     * @return duplex
     */
    public java.lang.String getDuplex() {
        return duplex;
    }


    /**
     * Sets the duplex value for this InterfacE.
     * 
     * @param duplex
     */
    public void setDuplex(java.lang.String duplex) {
        this.duplex = duplex;
    }


    /**
     * Gets the flowcontrol value for this InterfacE.
     * 
     * @return flowcontrol
     */
    public java.lang.String getFlowcontrol() {
        return flowcontrol;
    }


    /**
     * Sets the flowcontrol value for this InterfacE.
     * 
     * @param flowcontrol
     */
    public void setFlowcontrol(java.lang.String flowcontrol) {
        this.flowcontrol = flowcontrol;
    }


    /**
     * Gets the conndistr value for this InterfacE.
     * 
     * @return conndistr
     */
    public java.lang.String getConndistr() {
        return conndistr;
    }


    /**
     * Sets the conndistr value for this InterfacE.
     * 
     * @param conndistr
     */
    public void setConndistr(java.lang.String conndistr) {
        this.conndistr = conndistr;
    }


    /**
     * Gets the macdistr value for this InterfacE.
     * 
     * @return macdistr
     */
    public java.lang.String getMacdistr() {
        return macdistr;
    }


    /**
     * Sets the macdistr value for this InterfacE.
     * 
     * @param macdistr
     */
    public void setMacdistr(java.lang.String macdistr) {
        this.macdistr = macdistr;
    }


    /**
     * Gets the mode value for this InterfacE.
     * 
     * @return mode
     */
    public java.lang.String getMode() {
        return mode;
    }


    /**
     * Sets the mode value for this InterfacE.
     * 
     * @param mode
     */
    public void setMode(java.lang.String mode) {
        this.mode = mode;
    }


    /**
     * Gets the hamonitor value for this InterfacE.
     * 
     * @return hamonitor
     */
    public java.lang.String getHamonitor() {
        return hamonitor;
    }


    /**
     * Sets the hamonitor value for this InterfacE.
     * 
     * @param hamonitor
     */
    public void setHamonitor(java.lang.String hamonitor) {
        this.hamonitor = hamonitor;
    }


    /**
     * Gets the state value for this InterfacE.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this InterfacE.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the autoneg value for this InterfacE.
     * 
     * @return autoneg
     */
    public java.lang.String getAutoneg() {
        return autoneg;
    }


    /**
     * Sets the autoneg value for this InterfacE.
     * 
     * @param autoneg
     */
    public void setAutoneg(java.lang.String autoneg) {
        this.autoneg = autoneg;
    }


    /**
     * Gets the autonegresult value for this InterfacE.
     * 
     * @return autonegresult
     */
    public org.apache.axis.types.UnsignedInt getAutonegresult() {
        return autonegresult;
    }


    /**
     * Sets the autonegresult value for this InterfacE.
     * 
     * @param autonegresult
     */
    public void setAutonegresult(org.apache.axis.types.UnsignedInt autonegresult) {
        this.autonegresult = autonegresult;
    }


    /**
     * Gets the tagged value for this InterfacE.
     * 
     * @return tagged
     */
    public org.apache.axis.types.UnsignedInt getTagged() {
        return tagged;
    }


    /**
     * Sets the tagged value for this InterfacE.
     * 
     * @param tagged
     */
    public void setTagged(org.apache.axis.types.UnsignedInt tagged) {
        this.tagged = tagged;
    }


    /**
     * Gets the tagall value for this InterfacE.
     * 
     * @return tagall
     */
    public java.lang.String getTagall() {
        return tagall;
    }


    /**
     * Sets the tagall value for this InterfacE.
     * 
     * @param tagall
     */
    public void setTagall(java.lang.String tagall) {
        this.tagall = tagall;
    }


    /**
     * Gets the trunk value for this InterfacE.
     * 
     * @return trunk
     */
    public java.lang.String getTrunk() {
        return trunk;
    }


    /**
     * Sets the trunk value for this InterfacE.
     * 
     * @param trunk
     */
    public void setTrunk(java.lang.String trunk) {
        this.trunk = trunk;
    }


    /**
     * Gets the taggedany value for this InterfacE.
     * 
     * @return taggedany
     */
    public org.apache.axis.types.UnsignedInt getTaggedany() {
        return taggedany;
    }


    /**
     * Sets the taggedany value for this InterfacE.
     * 
     * @param taggedany
     */
    public void setTaggedany(org.apache.axis.types.UnsignedInt taggedany) {
        this.taggedany = taggedany;
    }


    /**
     * Gets the taggedautolearn value for this InterfacE.
     * 
     * @return taggedautolearn
     */
    public org.apache.axis.types.UnsignedInt getTaggedautolearn() {
        return taggedautolearn;
    }


    /**
     * Sets the taggedautolearn value for this InterfacE.
     * 
     * @param taggedautolearn
     */
    public void setTaggedautolearn(org.apache.axis.types.UnsignedInt taggedautolearn) {
        this.taggedautolearn = taggedautolearn;
    }


    /**
     * Gets the hangdetect value for this InterfacE.
     * 
     * @return hangdetect
     */
    public org.apache.axis.types.UnsignedInt getHangdetect() {
        return hangdetect;
    }


    /**
     * Sets the hangdetect value for this InterfacE.
     * 
     * @param hangdetect
     */
    public void setHangdetect(org.apache.axis.types.UnsignedInt hangdetect) {
        this.hangdetect = hangdetect;
    }


    /**
     * Gets the hangreset value for this InterfacE.
     * 
     * @return hangreset
     */
    public org.apache.axis.types.UnsignedInt getHangreset() {
        return hangreset;
    }


    /**
     * Sets the hangreset value for this InterfacE.
     * 
     * @param hangreset
     */
    public void setHangreset(org.apache.axis.types.UnsignedInt hangreset) {
        this.hangreset = hangreset;
    }


    /**
     * Gets the linkstate value for this InterfacE.
     * 
     * @return linkstate
     */
    public org.apache.axis.types.UnsignedInt getLinkstate() {
        return linkstate;
    }


    /**
     * Sets the linkstate value for this InterfacE.
     * 
     * @param linkstate
     */
    public void setLinkstate(org.apache.axis.types.UnsignedInt linkstate) {
        this.linkstate = linkstate;
    }


    /**
     * Gets the intfstate value for this InterfacE.
     * 
     * @return intfstate
     */
    public org.apache.axis.types.UnsignedInt getIntfstate() {
        return intfstate;
    }


    /**
     * Sets the intfstate value for this InterfacE.
     * 
     * @param intfstate
     */
    public void setIntfstate(org.apache.axis.types.UnsignedInt intfstate) {
        this.intfstate = intfstate;
    }


    /**
     * Gets the rxpackets value for this InterfacE.
     * 
     * @return rxpackets
     */
    public org.apache.axis.types.UnsignedLong getRxpackets() {
        return rxpackets;
    }


    /**
     * Sets the rxpackets value for this InterfacE.
     * 
     * @param rxpackets
     */
    public void setRxpackets(org.apache.axis.types.UnsignedLong rxpackets) {
        this.rxpackets = rxpackets;
    }


    /**
     * Gets the rxbytes value for this InterfacE.
     * 
     * @return rxbytes
     */
    public org.apache.axis.types.UnsignedLong getRxbytes() {
        return rxbytes;
    }


    /**
     * Sets the rxbytes value for this InterfacE.
     * 
     * @param rxbytes
     */
    public void setRxbytes(org.apache.axis.types.UnsignedLong rxbytes) {
        this.rxbytes = rxbytes;
    }


    /**
     * Gets the rxerrors value for this InterfacE.
     * 
     * @return rxerrors
     */
    public org.apache.axis.types.UnsignedLong getRxerrors() {
        return rxerrors;
    }


    /**
     * Sets the rxerrors value for this InterfacE.
     * 
     * @param rxerrors
     */
    public void setRxerrors(org.apache.axis.types.UnsignedLong rxerrors) {
        this.rxerrors = rxerrors;
    }


    /**
     * Gets the rxdrops value for this InterfacE.
     * 
     * @return rxdrops
     */
    public org.apache.axis.types.UnsignedLong getRxdrops() {
        return rxdrops;
    }


    /**
     * Sets the rxdrops value for this InterfacE.
     * 
     * @param rxdrops
     */
    public void setRxdrops(org.apache.axis.types.UnsignedLong rxdrops) {
        this.rxdrops = rxdrops;
    }


    /**
     * Gets the txpackets value for this InterfacE.
     * 
     * @return txpackets
     */
    public org.apache.axis.types.UnsignedLong getTxpackets() {
        return txpackets;
    }


    /**
     * Sets the txpackets value for this InterfacE.
     * 
     * @param txpackets
     */
    public void setTxpackets(org.apache.axis.types.UnsignedLong txpackets) {
        this.txpackets = txpackets;
    }


    /**
     * Gets the txbytes value for this InterfacE.
     * 
     * @return txbytes
     */
    public org.apache.axis.types.UnsignedLong getTxbytes() {
        return txbytes;
    }


    /**
     * Sets the txbytes value for this InterfacE.
     * 
     * @param txbytes
     */
    public void setTxbytes(org.apache.axis.types.UnsignedLong txbytes) {
        this.txbytes = txbytes;
    }


    /**
     * Gets the txerrors value for this InterfacE.
     * 
     * @return txerrors
     */
    public org.apache.axis.types.UnsignedLong getTxerrors() {
        return txerrors;
    }


    /**
     * Sets the txerrors value for this InterfacE.
     * 
     * @param txerrors
     */
    public void setTxerrors(org.apache.axis.types.UnsignedLong txerrors) {
        this.txerrors = txerrors;
    }


    /**
     * Gets the txdrops value for this InterfacE.
     * 
     * @return txdrops
     */
    public org.apache.axis.types.UnsignedLong getTxdrops() {
        return txdrops;
    }


    /**
     * Sets the txdrops value for this InterfacE.
     * 
     * @param txdrops
     */
    public void setTxdrops(org.apache.axis.types.UnsignedLong txdrops) {
        this.txdrops = txdrops;
    }


    /**
     * Gets the indisc value for this InterfacE.
     * 
     * @return indisc
     */
    public org.apache.axis.types.UnsignedLong getIndisc() {
        return indisc;
    }


    /**
     * Sets the indisc value for this InterfacE.
     * 
     * @param indisc
     */
    public void setIndisc(org.apache.axis.types.UnsignedLong indisc) {
        this.indisc = indisc;
    }


    /**
     * Gets the outdisc value for this InterfacE.
     * 
     * @return outdisc
     */
    public org.apache.axis.types.UnsignedLong getOutdisc() {
        return outdisc;
    }


    /**
     * Sets the outdisc value for this InterfacE.
     * 
     * @param outdisc
     */
    public void setOutdisc(org.apache.axis.types.UnsignedLong outdisc) {
        this.outdisc = outdisc;
    }


    /**
     * Gets the fctls value for this InterfacE.
     * 
     * @return fctls
     */
    public org.apache.axis.types.UnsignedLong getFctls() {
        return fctls;
    }


    /**
     * Sets the fctls value for this InterfacE.
     * 
     * @param fctls
     */
    public void setFctls(org.apache.axis.types.UnsignedLong fctls) {
        this.fctls = fctls;
    }


    /**
     * Gets the hangs value for this InterfacE.
     * 
     * @return hangs
     */
    public org.apache.axis.types.UnsignedInt getHangs() {
        return hangs;
    }


    /**
     * Sets the hangs value for this InterfacE.
     * 
     * @param hangs
     */
    public void setHangs(org.apache.axis.types.UnsignedInt hangs) {
        this.hangs = hangs;
    }


    /**
     * Gets the stsstalls value for this InterfacE.
     * 
     * @return stsstalls
     */
    public org.apache.axis.types.UnsignedInt getStsstalls() {
        return stsstalls;
    }


    /**
     * Sets the stsstalls value for this InterfacE.
     * 
     * @param stsstalls
     */
    public void setStsstalls(org.apache.axis.types.UnsignedInt stsstalls) {
        this.stsstalls = stsstalls;
    }


    /**
     * Gets the txstalls value for this InterfacE.
     * 
     * @return txstalls
     */
    public org.apache.axis.types.UnsignedInt getTxstalls() {
        return txstalls;
    }


    /**
     * Sets the txstalls value for this InterfacE.
     * 
     * @param txstalls
     */
    public void setTxstalls(org.apache.axis.types.UnsignedInt txstalls) {
        this.txstalls = txstalls;
    }


    /**
     * Gets the rxstalls value for this InterfacE.
     * 
     * @return rxstalls
     */
    public org.apache.axis.types.UnsignedInt getRxstalls() {
        return rxstalls;
    }


    /**
     * Sets the rxstalls value for this InterfacE.
     * 
     * @param rxstalls
     */
    public void setRxstalls(org.apache.axis.types.UnsignedInt rxstalls) {
        this.rxstalls = rxstalls;
    }


    /**
     * Gets the bdgmacmoved value for this InterfacE.
     * 
     * @return bdgmacmoved
     */
    public org.apache.axis.types.UnsignedLong getBdgmacmoved() {
        return bdgmacmoved;
    }


    /**
     * Sets the bdgmacmoved value for this InterfacE.
     * 
     * @param bdgmacmoved
     */
    public void setBdgmacmoved(org.apache.axis.types.UnsignedLong bdgmacmoved) {
        this.bdgmacmoved = bdgmacmoved;
    }


    /**
     * Gets the bdgmuted value for this InterfacE.
     * 
     * @return bdgmuted
     */
    public org.apache.axis.types.UnsignedInt getBdgmuted() {
        return bdgmuted;
    }


    /**
     * Sets the bdgmuted value for this InterfacE.
     * 
     * @param bdgmuted
     */
    public void setBdgmuted(org.apache.axis.types.UnsignedInt bdgmuted) {
        this.bdgmuted = bdgmuted;
    }


    /**
     * Gets the vmac value for this InterfacE.
     * 
     * @return vmac
     */
    public java.lang.String getVmac() {
        return vmac;
    }


    /**
     * Sets the vmac value for this InterfacE.
     * 
     * @param vmac
     */
    public void setVmac(java.lang.String vmac) {
        this.vmac = vmac;
    }


    /**
     * Gets the vmac6 value for this InterfacE.
     * 
     * @return vmac6
     */
    public java.lang.String getVmac6() {
        return vmac6;
    }


    /**
     * Sets the vmac6 value for this InterfacE.
     * 
     * @param vmac6
     */
    public void setVmac6(java.lang.String vmac6) {
        this.vmac6 = vmac6;
    }


    /**
     * Gets the lacpmode value for this InterfacE.
     * 
     * @return lacpmode
     */
    public java.lang.String getLacpmode() {
        return lacpmode;
    }


    /**
     * Sets the lacpmode value for this InterfacE.
     * 
     * @param lacpmode
     */
    public void setLacpmode(java.lang.String lacpmode) {
        this.lacpmode = lacpmode;
    }


    /**
     * Gets the lacpkey value for this InterfacE.
     * 
     * @return lacpkey
     */
    public int getLacpkey() {
        return lacpkey;
    }


    /**
     * Sets the lacpkey value for this InterfacE.
     * 
     * @param lacpkey
     */
    public void setLacpkey(int lacpkey) {
        this.lacpkey = lacpkey;
    }


    /**
     * Gets the lacppriority value for this InterfacE.
     * 
     * @return lacppriority
     */
    public org.apache.axis.types.UnsignedInt getLacppriority() {
        return lacppriority;
    }


    /**
     * Sets the lacppriority value for this InterfacE.
     * 
     * @param lacppriority
     */
    public void setLacppriority(org.apache.axis.types.UnsignedInt lacppriority) {
        this.lacppriority = lacppriority;
    }


    /**
     * Gets the lacptimeout value for this InterfacE.
     * 
     * @return lacptimeout
     */
    public java.lang.String getLacptimeout() {
        return lacptimeout;
    }


    /**
     * Sets the lacptimeout value for this InterfacE.
     * 
     * @param lacptimeout
     */
    public void setLacptimeout(java.lang.String lacptimeout) {
        this.lacptimeout = lacptimeout;
    }


    /**
     * Gets the lagtype value for this InterfacE.
     * 
     * @return lagtype
     */
    public java.lang.String getLagtype() {
        return lagtype;
    }


    /**
     * Sets the lagtype value for this InterfacE.
     * 
     * @param lagtype
     */
    public void setLagtype(java.lang.String lagtype) {
        this.lagtype = lagtype;
    }


    /**
     * Gets the ifalias value for this InterfacE.
     * 
     * @return ifalias
     */
    public java.lang.String getIfalias() {
        return ifalias;
    }


    /**
     * Sets the ifalias value for this InterfacE.
     * 
     * @param ifalias
     */
    public void setIfalias(java.lang.String ifalias) {
        this.ifalias = ifalias;
    }


    /**
     * Gets the reqthroughput value for this InterfacE.
     * 
     * @return reqthroughput
     */
    public org.apache.axis.types.UnsignedInt getReqthroughput() {
        return reqthroughput;
    }


    /**
     * Sets the reqthroughput value for this InterfacE.
     * 
     * @param reqthroughput
     */
    public void setReqthroughput(org.apache.axis.types.UnsignedInt reqthroughput) {
        this.reqthroughput = reqthroughput;
    }


    /**
     * Gets the throughput value for this InterfacE.
     * 
     * @return throughput
     */
    public org.apache.axis.types.UnsignedInt getThroughput() {
        return throughput;
    }


    /**
     * Sets the throughput value for this InterfacE.
     * 
     * @param throughput
     */
    public void setThroughput(org.apache.axis.types.UnsignedInt throughput) {
        this.throughput = throughput;
    }


    /**
     * Gets the bandwidthhigh value for this InterfacE.
     * 
     * @return bandwidthhigh
     */
    public org.apache.axis.types.UnsignedInt getBandwidthhigh() {
        return bandwidthhigh;
    }


    /**
     * Sets the bandwidthhigh value for this InterfacE.
     * 
     * @param bandwidthhigh
     */
    public void setBandwidthhigh(org.apache.axis.types.UnsignedInt bandwidthhigh) {
        this.bandwidthhigh = bandwidthhigh;
    }


    /**
     * Gets the bandwidthnormal value for this InterfacE.
     * 
     * @return bandwidthnormal
     */
    public org.apache.axis.types.UnsignedInt getBandwidthnormal() {
        return bandwidthnormal;
    }


    /**
     * Sets the bandwidthnormal value for this InterfacE.
     * 
     * @param bandwidthnormal
     */
    public void setBandwidthnormal(org.apache.axis.types.UnsignedInt bandwidthnormal) {
        this.bandwidthnormal = bandwidthnormal;
    }


    /**
     * Gets the backplane value for this InterfacE.
     * 
     * @return backplane
     */
    public java.lang.String getBackplane() {
        return backplane;
    }


    /**
     * Sets the backplane value for this InterfacE.
     * 
     * @param backplane
     */
    public void setBackplane(java.lang.String backplane) {
        this.backplane = backplane;
    }


    /**
     * Gets the ifnum value for this InterfacE.
     * 
     * @return ifnum
     */
    public java.lang.String[] getIfnum() {
        return ifnum;
    }


    /**
     * Sets the ifnum value for this InterfacE.
     * 
     * @param ifnum
     */
    public void setIfnum(java.lang.String[] ifnum) {
        this.ifnum = ifnum;
    }


    /**
     * Gets the cleartime value for this InterfacE.
     * 
     * @return cleartime
     */
    public org.apache.axis.types.UnsignedInt getCleartime() {
        return cleartime;
    }


    /**
     * Sets the cleartime value for this InterfacE.
     * 
     * @param cleartime
     */
    public void setCleartime(org.apache.axis.types.UnsignedInt cleartime) {
        this.cleartime = cleartime;
    }


    /**
     * Gets the slavestate value for this InterfacE.
     * 
     * @return slavestate
     */
    public org.apache.axis.types.UnsignedInt getSlavestate() {
        return slavestate;
    }


    /**
     * Sets the slavestate value for this InterfacE.
     * 
     * @param slavestate
     */
    public void setSlavestate(org.apache.axis.types.UnsignedInt slavestate) {
        this.slavestate = slavestate;
    }


    /**
     * Gets the slavemedia value for this InterfacE.
     * 
     * @return slavemedia
     */
    public org.apache.axis.types.UnsignedInt getSlavemedia() {
        return slavemedia;
    }


    /**
     * Sets the slavemedia value for this InterfacE.
     * 
     * @param slavemedia
     */
    public void setSlavemedia(org.apache.axis.types.UnsignedInt slavemedia) {
        this.slavemedia = slavemedia;
    }


    /**
     * Gets the slavespeed value for this InterfacE.
     * 
     * @return slavespeed
     */
    public org.apache.axis.types.UnsignedInt getSlavespeed() {
        return slavespeed;
    }


    /**
     * Sets the slavespeed value for this InterfacE.
     * 
     * @param slavespeed
     */
    public void setSlavespeed(org.apache.axis.types.UnsignedInt slavespeed) {
        this.slavespeed = slavespeed;
    }


    /**
     * Gets the slaveduplex value for this InterfacE.
     * 
     * @return slaveduplex
     */
    public org.apache.axis.types.UnsignedInt getSlaveduplex() {
        return slaveduplex;
    }


    /**
     * Sets the slaveduplex value for this InterfacE.
     * 
     * @param slaveduplex
     */
    public void setSlaveduplex(org.apache.axis.types.UnsignedInt slaveduplex) {
        this.slaveduplex = slaveduplex;
    }


    /**
     * Gets the slaveflowctl value for this InterfacE.
     * 
     * @return slaveflowctl
     */
    public org.apache.axis.types.UnsignedInt getSlaveflowctl() {
        return slaveflowctl;
    }


    /**
     * Sets the slaveflowctl value for this InterfacE.
     * 
     * @param slaveflowctl
     */
    public void setSlaveflowctl(org.apache.axis.types.UnsignedInt slaveflowctl) {
        this.slaveflowctl = slaveflowctl;
    }


    /**
     * Gets the slavetime value for this InterfacE.
     * 
     * @return slavetime
     */
    public org.apache.axis.types.UnsignedInt getSlavetime() {
        return slavetime;
    }


    /**
     * Sets the slavetime value for this InterfacE.
     * 
     * @param slavetime
     */
    public void setSlavetime(org.apache.axis.types.UnsignedInt slavetime) {
        this.slavetime = slavetime;
    }


    /**
     * Gets the intftype value for this InterfacE.
     * 
     * @return intftype
     */
    public java.lang.String getIntftype() {
        return intftype;
    }


    /**
     * Sets the intftype value for this InterfacE.
     * 
     * @param intftype
     */
    public void setIntftype(java.lang.String intftype) {
        this.intftype = intftype;
    }


    /**
     * Gets the lacpactorpriority value for this InterfacE.
     * 
     * @return lacpactorpriority
     */
    public org.apache.axis.types.UnsignedInt getLacpactorpriority() {
        return lacpactorpriority;
    }


    /**
     * Sets the lacpactorpriority value for this InterfacE.
     * 
     * @param lacpactorpriority
     */
    public void setLacpactorpriority(org.apache.axis.types.UnsignedInt lacpactorpriority) {
        this.lacpactorpriority = lacpactorpriority;
    }


    /**
     * Gets the lacpactorportno value for this InterfacE.
     * 
     * @return lacpactorportno
     */
    public org.apache.axis.types.UnsignedInt getLacpactorportno() {
        return lacpactorportno;
    }


    /**
     * Sets the lacpactorportno value for this InterfacE.
     * 
     * @param lacpactorportno
     */
    public void setLacpactorportno(org.apache.axis.types.UnsignedInt lacpactorportno) {
        this.lacpactorportno = lacpactorportno;
    }


    /**
     * Gets the lacppartnerstate value for this InterfacE.
     * 
     * @return lacppartnerstate
     */
    public java.lang.String getLacppartnerstate() {
        return lacppartnerstate;
    }


    /**
     * Sets the lacppartnerstate value for this InterfacE.
     * 
     * @param lacppartnerstate
     */
    public void setLacppartnerstate(java.lang.String lacppartnerstate) {
        this.lacppartnerstate = lacppartnerstate;
    }


    /**
     * Gets the lacppartnertimeout value for this InterfacE.
     * 
     * @return lacppartnertimeout
     */
    public java.lang.String getLacppartnertimeout() {
        return lacppartnertimeout;
    }


    /**
     * Sets the lacppartnertimeout value for this InterfacE.
     * 
     * @param lacppartnertimeout
     */
    public void setLacppartnertimeout(java.lang.String lacppartnertimeout) {
        this.lacppartnertimeout = lacppartnertimeout;
    }


    /**
     * Gets the lacppartneraggregation value for this InterfacE.
     * 
     * @return lacppartneraggregation
     */
    public java.lang.String getLacppartneraggregation() {
        return lacppartneraggregation;
    }


    /**
     * Sets the lacppartneraggregation value for this InterfacE.
     * 
     * @param lacppartneraggregation
     */
    public void setLacppartneraggregation(java.lang.String lacppartneraggregation) {
        this.lacppartneraggregation = lacppartneraggregation;
    }


    /**
     * Gets the lacppartnerinsync value for this InterfacE.
     * 
     * @return lacppartnerinsync
     */
    public java.lang.String getLacppartnerinsync() {
        return lacppartnerinsync;
    }


    /**
     * Sets the lacppartnerinsync value for this InterfacE.
     * 
     * @param lacppartnerinsync
     */
    public void setLacppartnerinsync(java.lang.String lacppartnerinsync) {
        this.lacppartnerinsync = lacppartnerinsync;
    }


    /**
     * Gets the lacppartnercollecting value for this InterfacE.
     * 
     * @return lacppartnercollecting
     */
    public java.lang.String getLacppartnercollecting() {
        return lacppartnercollecting;
    }


    /**
     * Sets the lacppartnercollecting value for this InterfacE.
     * 
     * @param lacppartnercollecting
     */
    public void setLacppartnercollecting(java.lang.String lacppartnercollecting) {
        this.lacppartnercollecting = lacppartnercollecting;
    }


    /**
     * Gets the lacppartnerdistributing value for this InterfacE.
     * 
     * @return lacppartnerdistributing
     */
    public java.lang.String getLacppartnerdistributing() {
        return lacppartnerdistributing;
    }


    /**
     * Sets the lacppartnerdistributing value for this InterfacE.
     * 
     * @param lacppartnerdistributing
     */
    public void setLacppartnerdistributing(java.lang.String lacppartnerdistributing) {
        this.lacppartnerdistributing = lacppartnerdistributing;
    }


    /**
     * Gets the lacppartnerdefaulted value for this InterfacE.
     * 
     * @return lacppartnerdefaulted
     */
    public java.lang.String getLacppartnerdefaulted() {
        return lacppartnerdefaulted;
    }


    /**
     * Sets the lacppartnerdefaulted value for this InterfacE.
     * 
     * @param lacppartnerdefaulted
     */
    public void setLacppartnerdefaulted(java.lang.String lacppartnerdefaulted) {
        this.lacppartnerdefaulted = lacppartnerdefaulted;
    }


    /**
     * Gets the lacppartnerexpired value for this InterfacE.
     * 
     * @return lacppartnerexpired
     */
    public java.lang.String getLacppartnerexpired() {
        return lacppartnerexpired;
    }


    /**
     * Sets the lacppartnerexpired value for this InterfacE.
     * 
     * @param lacppartnerexpired
     */
    public void setLacppartnerexpired(java.lang.String lacppartnerexpired) {
        this.lacppartnerexpired = lacppartnerexpired;
    }


    /**
     * Gets the lacppartnerpriority value for this InterfacE.
     * 
     * @return lacppartnerpriority
     */
    public org.apache.axis.types.UnsignedInt getLacppartnerpriority() {
        return lacppartnerpriority;
    }


    /**
     * Sets the lacppartnerpriority value for this InterfacE.
     * 
     * @param lacppartnerpriority
     */
    public void setLacppartnerpriority(org.apache.axis.types.UnsignedInt lacppartnerpriority) {
        this.lacppartnerpriority = lacppartnerpriority;
    }


    /**
     * Gets the lacppartnersystemmac value for this InterfacE.
     * 
     * @return lacppartnersystemmac
     */
    public java.lang.String getLacppartnersystemmac() {
        return lacppartnersystemmac;
    }


    /**
     * Sets the lacppartnersystemmac value for this InterfacE.
     * 
     * @param lacppartnersystemmac
     */
    public void setLacppartnersystemmac(java.lang.String lacppartnersystemmac) {
        this.lacppartnersystemmac = lacppartnersystemmac;
    }


    /**
     * Gets the lacppartnersystempriority value for this InterfacE.
     * 
     * @return lacppartnersystempriority
     */
    public org.apache.axis.types.UnsignedInt getLacppartnersystempriority() {
        return lacppartnersystempriority;
    }


    /**
     * Sets the lacppartnersystempriority value for this InterfacE.
     * 
     * @param lacppartnersystempriority
     */
    public void setLacppartnersystempriority(org.apache.axis.types.UnsignedInt lacppartnersystempriority) {
        this.lacppartnersystempriority = lacppartnersystempriority;
    }


    /**
     * Gets the lacppartnerportno value for this InterfacE.
     * 
     * @return lacppartnerportno
     */
    public org.apache.axis.types.UnsignedInt getLacppartnerportno() {
        return lacppartnerportno;
    }


    /**
     * Sets the lacppartnerportno value for this InterfacE.
     * 
     * @param lacppartnerportno
     */
    public void setLacppartnerportno(org.apache.axis.types.UnsignedInt lacppartnerportno) {
        this.lacppartnerportno = lacppartnerportno;
    }


    /**
     * Gets the lacppartnerkey value for this InterfacE.
     * 
     * @return lacppartnerkey
     */
    public org.apache.axis.types.UnsignedInt getLacppartnerkey() {
        return lacppartnerkey;
    }


    /**
     * Sets the lacppartnerkey value for this InterfacE.
     * 
     * @param lacppartnerkey
     */
    public void setLacppartnerkey(org.apache.axis.types.UnsignedInt lacppartnerkey) {
        this.lacppartnerkey = lacppartnerkey;
    }


    /**
     * Gets the lacpactoraggregation value for this InterfacE.
     * 
     * @return lacpactoraggregation
     */
    public java.lang.String getLacpactoraggregation() {
        return lacpactoraggregation;
    }


    /**
     * Sets the lacpactoraggregation value for this InterfacE.
     * 
     * @param lacpactoraggregation
     */
    public void setLacpactoraggregation(java.lang.String lacpactoraggregation) {
        this.lacpactoraggregation = lacpactoraggregation;
    }


    /**
     * Gets the lacpactorinsync value for this InterfacE.
     * 
     * @return lacpactorinsync
     */
    public java.lang.String getLacpactorinsync() {
        return lacpactorinsync;
    }


    /**
     * Sets the lacpactorinsync value for this InterfacE.
     * 
     * @param lacpactorinsync
     */
    public void setLacpactorinsync(java.lang.String lacpactorinsync) {
        this.lacpactorinsync = lacpactorinsync;
    }


    /**
     * Gets the lacpactorcollecting value for this InterfacE.
     * 
     * @return lacpactorcollecting
     */
    public java.lang.String getLacpactorcollecting() {
        return lacpactorcollecting;
    }


    /**
     * Sets the lacpactorcollecting value for this InterfacE.
     * 
     * @param lacpactorcollecting
     */
    public void setLacpactorcollecting(java.lang.String lacpactorcollecting) {
        this.lacpactorcollecting = lacpactorcollecting;
    }


    /**
     * Gets the lacpactordistributing value for this InterfacE.
     * 
     * @return lacpactordistributing
     */
    public java.lang.String getLacpactordistributing() {
        return lacpactordistributing;
    }


    /**
     * Sets the lacpactordistributing value for this InterfacE.
     * 
     * @param lacpactordistributing
     */
    public void setLacpactordistributing(java.lang.String lacpactordistributing) {
        this.lacpactordistributing = lacpactordistributing;
    }


    /**
     * Gets the lacpportmuxstate value for this InterfacE.
     * 
     * @return lacpportmuxstate
     */
    public java.lang.String getLacpportmuxstate() {
        return lacpportmuxstate;
    }


    /**
     * Sets the lacpportmuxstate value for this InterfacE.
     * 
     * @param lacpportmuxstate
     */
    public void setLacpportmuxstate(java.lang.String lacpportmuxstate) {
        this.lacpportmuxstate = lacpportmuxstate;
    }


    /**
     * Gets the lacpportrxstat value for this InterfacE.
     * 
     * @return lacpportrxstat
     */
    public java.lang.String getLacpportrxstat() {
        return lacpportrxstat;
    }


    /**
     * Sets the lacpportrxstat value for this InterfacE.
     * 
     * @param lacpportrxstat
     */
    public void setLacpportrxstat(java.lang.String lacpportrxstat) {
        this.lacpportrxstat = lacpportrxstat;
    }


    /**
     * Gets the lacpportselectstate value for this InterfacE.
     * 
     * @return lacpportselectstate
     */
    public java.lang.String getLacpportselectstate() {
        return lacpportselectstate;
    }


    /**
     * Sets the lacpportselectstate value for this InterfacE.
     * 
     * @param lacpportselectstate
     */
    public void setLacpportselectstate(java.lang.String lacpportselectstate) {
        this.lacpportselectstate = lacpportselectstate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InterfacE)) return false;
        InterfacE other = (InterfacE) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.devicename==null && other.getDevicename()==null) || 
             (this.devicename!=null &&
              this.devicename.equals(other.getDevicename()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.flags==null && other.getFlags()==null) || 
             (this.flags!=null &&
              this.flags.equals(other.getFlags()))) &&
            ((this.mtu==null && other.getMtu()==null) || 
             (this.mtu!=null &&
              this.mtu.equals(other.getMtu()))) &&
            ((this.vlan==null && other.getVlan()==null) || 
             (this.vlan!=null &&
              this.vlan.equals(other.getVlan()))) &&
            ((this.mac==null && other.getMac()==null) || 
             (this.mac!=null &&
              this.mac.equals(other.getMac()))) &&
            ((this.uptime==null && other.getUptime()==null) || 
             (this.uptime!=null &&
              this.uptime.equals(other.getUptime()))) &&
            ((this.downtime==null && other.getDowntime()==null) || 
             (this.downtime!=null &&
              this.downtime.equals(other.getDowntime()))) &&
            ((this.reqmedia==null && other.getReqmedia()==null) || 
             (this.reqmedia!=null &&
              this.reqmedia.equals(other.getReqmedia()))) &&
            ((this.reqspeed==null && other.getReqspeed()==null) || 
             (this.reqspeed!=null &&
              this.reqspeed.equals(other.getReqspeed()))) &&
            ((this.reqduplex==null && other.getReqduplex()==null) || 
             (this.reqduplex!=null &&
              this.reqduplex.equals(other.getReqduplex()))) &&
            ((this.reqflowcontrol==null && other.getReqflowcontrol()==null) || 
             (this.reqflowcontrol!=null &&
              this.reqflowcontrol.equals(other.getReqflowcontrol()))) &&
            ((this.media==null && other.getMedia()==null) || 
             (this.media!=null &&
              this.media.equals(other.getMedia()))) &&
            ((this.speed==null && other.getSpeed()==null) || 
             (this.speed!=null &&
              this.speed.equals(other.getSpeed()))) &&
            ((this.duplex==null && other.getDuplex()==null) || 
             (this.duplex!=null &&
              this.duplex.equals(other.getDuplex()))) &&
            ((this.flowcontrol==null && other.getFlowcontrol()==null) || 
             (this.flowcontrol!=null &&
              this.flowcontrol.equals(other.getFlowcontrol()))) &&
            ((this.conndistr==null && other.getConndistr()==null) || 
             (this.conndistr!=null &&
              this.conndistr.equals(other.getConndistr()))) &&
            ((this.macdistr==null && other.getMacdistr()==null) || 
             (this.macdistr!=null &&
              this.macdistr.equals(other.getMacdistr()))) &&
            ((this.mode==null && other.getMode()==null) || 
             (this.mode!=null &&
              this.mode.equals(other.getMode()))) &&
            ((this.hamonitor==null && other.getHamonitor()==null) || 
             (this.hamonitor!=null &&
              this.hamonitor.equals(other.getHamonitor()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.autoneg==null && other.getAutoneg()==null) || 
             (this.autoneg!=null &&
              this.autoneg.equals(other.getAutoneg()))) &&
            ((this.autonegresult==null && other.getAutonegresult()==null) || 
             (this.autonegresult!=null &&
              this.autonegresult.equals(other.getAutonegresult()))) &&
            ((this.tagged==null && other.getTagged()==null) || 
             (this.tagged!=null &&
              this.tagged.equals(other.getTagged()))) &&
            ((this.tagall==null && other.getTagall()==null) || 
             (this.tagall!=null &&
              this.tagall.equals(other.getTagall()))) &&
            ((this.trunk==null && other.getTrunk()==null) || 
             (this.trunk!=null &&
              this.trunk.equals(other.getTrunk()))) &&
            ((this.taggedany==null && other.getTaggedany()==null) || 
             (this.taggedany!=null &&
              this.taggedany.equals(other.getTaggedany()))) &&
            ((this.taggedautolearn==null && other.getTaggedautolearn()==null) || 
             (this.taggedautolearn!=null &&
              this.taggedautolearn.equals(other.getTaggedautolearn()))) &&
            ((this.hangdetect==null && other.getHangdetect()==null) || 
             (this.hangdetect!=null &&
              this.hangdetect.equals(other.getHangdetect()))) &&
            ((this.hangreset==null && other.getHangreset()==null) || 
             (this.hangreset!=null &&
              this.hangreset.equals(other.getHangreset()))) &&
            ((this.linkstate==null && other.getLinkstate()==null) || 
             (this.linkstate!=null &&
              this.linkstate.equals(other.getLinkstate()))) &&
            ((this.intfstate==null && other.getIntfstate()==null) || 
             (this.intfstate!=null &&
              this.intfstate.equals(other.getIntfstate()))) &&
            ((this.rxpackets==null && other.getRxpackets()==null) || 
             (this.rxpackets!=null &&
              this.rxpackets.equals(other.getRxpackets()))) &&
            ((this.rxbytes==null && other.getRxbytes()==null) || 
             (this.rxbytes!=null &&
              this.rxbytes.equals(other.getRxbytes()))) &&
            ((this.rxerrors==null && other.getRxerrors()==null) || 
             (this.rxerrors!=null &&
              this.rxerrors.equals(other.getRxerrors()))) &&
            ((this.rxdrops==null && other.getRxdrops()==null) || 
             (this.rxdrops!=null &&
              this.rxdrops.equals(other.getRxdrops()))) &&
            ((this.txpackets==null && other.getTxpackets()==null) || 
             (this.txpackets!=null &&
              this.txpackets.equals(other.getTxpackets()))) &&
            ((this.txbytes==null && other.getTxbytes()==null) || 
             (this.txbytes!=null &&
              this.txbytes.equals(other.getTxbytes()))) &&
            ((this.txerrors==null && other.getTxerrors()==null) || 
             (this.txerrors!=null &&
              this.txerrors.equals(other.getTxerrors()))) &&
            ((this.txdrops==null && other.getTxdrops()==null) || 
             (this.txdrops!=null &&
              this.txdrops.equals(other.getTxdrops()))) &&
            ((this.indisc==null && other.getIndisc()==null) || 
             (this.indisc!=null &&
              this.indisc.equals(other.getIndisc()))) &&
            ((this.outdisc==null && other.getOutdisc()==null) || 
             (this.outdisc!=null &&
              this.outdisc.equals(other.getOutdisc()))) &&
            ((this.fctls==null && other.getFctls()==null) || 
             (this.fctls!=null &&
              this.fctls.equals(other.getFctls()))) &&
            ((this.hangs==null && other.getHangs()==null) || 
             (this.hangs!=null &&
              this.hangs.equals(other.getHangs()))) &&
            ((this.stsstalls==null && other.getStsstalls()==null) || 
             (this.stsstalls!=null &&
              this.stsstalls.equals(other.getStsstalls()))) &&
            ((this.txstalls==null && other.getTxstalls()==null) || 
             (this.txstalls!=null &&
              this.txstalls.equals(other.getTxstalls()))) &&
            ((this.rxstalls==null && other.getRxstalls()==null) || 
             (this.rxstalls!=null &&
              this.rxstalls.equals(other.getRxstalls()))) &&
            ((this.bdgmacmoved==null && other.getBdgmacmoved()==null) || 
             (this.bdgmacmoved!=null &&
              this.bdgmacmoved.equals(other.getBdgmacmoved()))) &&
            ((this.bdgmuted==null && other.getBdgmuted()==null) || 
             (this.bdgmuted!=null &&
              this.bdgmuted.equals(other.getBdgmuted()))) &&
            ((this.vmac==null && other.getVmac()==null) || 
             (this.vmac!=null &&
              this.vmac.equals(other.getVmac()))) &&
            ((this.vmac6==null && other.getVmac6()==null) || 
             (this.vmac6!=null &&
              this.vmac6.equals(other.getVmac6()))) &&
            ((this.lacpmode==null && other.getLacpmode()==null) || 
             (this.lacpmode!=null &&
              this.lacpmode.equals(other.getLacpmode()))) &&
            this.lacpkey == other.getLacpkey() &&
            ((this.lacppriority==null && other.getLacppriority()==null) || 
             (this.lacppriority!=null &&
              this.lacppriority.equals(other.getLacppriority()))) &&
            ((this.lacptimeout==null && other.getLacptimeout()==null) || 
             (this.lacptimeout!=null &&
              this.lacptimeout.equals(other.getLacptimeout()))) &&
            ((this.lagtype==null && other.getLagtype()==null) || 
             (this.lagtype!=null &&
              this.lagtype.equals(other.getLagtype()))) &&
            ((this.ifalias==null && other.getIfalias()==null) || 
             (this.ifalias!=null &&
              this.ifalias.equals(other.getIfalias()))) &&
            ((this.reqthroughput==null && other.getReqthroughput()==null) || 
             (this.reqthroughput!=null &&
              this.reqthroughput.equals(other.getReqthroughput()))) &&
            ((this.throughput==null && other.getThroughput()==null) || 
             (this.throughput!=null &&
              this.throughput.equals(other.getThroughput()))) &&
            ((this.bandwidthhigh==null && other.getBandwidthhigh()==null) || 
             (this.bandwidthhigh!=null &&
              this.bandwidthhigh.equals(other.getBandwidthhigh()))) &&
            ((this.bandwidthnormal==null && other.getBandwidthnormal()==null) || 
             (this.bandwidthnormal!=null &&
              this.bandwidthnormal.equals(other.getBandwidthnormal()))) &&
            ((this.backplane==null && other.getBackplane()==null) || 
             (this.backplane!=null &&
              this.backplane.equals(other.getBackplane()))) &&
            ((this.ifnum==null && other.getIfnum()==null) || 
             (this.ifnum!=null &&
              java.util.Arrays.equals(this.ifnum, other.getIfnum()))) &&
            ((this.cleartime==null && other.getCleartime()==null) || 
             (this.cleartime!=null &&
              this.cleartime.equals(other.getCleartime()))) &&
            ((this.slavestate==null && other.getSlavestate()==null) || 
             (this.slavestate!=null &&
              this.slavestate.equals(other.getSlavestate()))) &&
            ((this.slavemedia==null && other.getSlavemedia()==null) || 
             (this.slavemedia!=null &&
              this.slavemedia.equals(other.getSlavemedia()))) &&
            ((this.slavespeed==null && other.getSlavespeed()==null) || 
             (this.slavespeed!=null &&
              this.slavespeed.equals(other.getSlavespeed()))) &&
            ((this.slaveduplex==null && other.getSlaveduplex()==null) || 
             (this.slaveduplex!=null &&
              this.slaveduplex.equals(other.getSlaveduplex()))) &&
            ((this.slaveflowctl==null && other.getSlaveflowctl()==null) || 
             (this.slaveflowctl!=null &&
              this.slaveflowctl.equals(other.getSlaveflowctl()))) &&
            ((this.slavetime==null && other.getSlavetime()==null) || 
             (this.slavetime!=null &&
              this.slavetime.equals(other.getSlavetime()))) &&
            ((this.intftype==null && other.getIntftype()==null) || 
             (this.intftype!=null &&
              this.intftype.equals(other.getIntftype()))) &&
            ((this.lacpactorpriority==null && other.getLacpactorpriority()==null) || 
             (this.lacpactorpriority!=null &&
              this.lacpactorpriority.equals(other.getLacpactorpriority()))) &&
            ((this.lacpactorportno==null && other.getLacpactorportno()==null) || 
             (this.lacpactorportno!=null &&
              this.lacpactorportno.equals(other.getLacpactorportno()))) &&
            ((this.lacppartnerstate==null && other.getLacppartnerstate()==null) || 
             (this.lacppartnerstate!=null &&
              this.lacppartnerstate.equals(other.getLacppartnerstate()))) &&
            ((this.lacppartnertimeout==null && other.getLacppartnertimeout()==null) || 
             (this.lacppartnertimeout!=null &&
              this.lacppartnertimeout.equals(other.getLacppartnertimeout()))) &&
            ((this.lacppartneraggregation==null && other.getLacppartneraggregation()==null) || 
             (this.lacppartneraggregation!=null &&
              this.lacppartneraggregation.equals(other.getLacppartneraggregation()))) &&
            ((this.lacppartnerinsync==null && other.getLacppartnerinsync()==null) || 
             (this.lacppartnerinsync!=null &&
              this.lacppartnerinsync.equals(other.getLacppartnerinsync()))) &&
            ((this.lacppartnercollecting==null && other.getLacppartnercollecting()==null) || 
             (this.lacppartnercollecting!=null &&
              this.lacppartnercollecting.equals(other.getLacppartnercollecting()))) &&
            ((this.lacppartnerdistributing==null && other.getLacppartnerdistributing()==null) || 
             (this.lacppartnerdistributing!=null &&
              this.lacppartnerdistributing.equals(other.getLacppartnerdistributing()))) &&
            ((this.lacppartnerdefaulted==null && other.getLacppartnerdefaulted()==null) || 
             (this.lacppartnerdefaulted!=null &&
              this.lacppartnerdefaulted.equals(other.getLacppartnerdefaulted()))) &&
            ((this.lacppartnerexpired==null && other.getLacppartnerexpired()==null) || 
             (this.lacppartnerexpired!=null &&
              this.lacppartnerexpired.equals(other.getLacppartnerexpired()))) &&
            ((this.lacppartnerpriority==null && other.getLacppartnerpriority()==null) || 
             (this.lacppartnerpriority!=null &&
              this.lacppartnerpriority.equals(other.getLacppartnerpriority()))) &&
            ((this.lacppartnersystemmac==null && other.getLacppartnersystemmac()==null) || 
             (this.lacppartnersystemmac!=null &&
              this.lacppartnersystemmac.equals(other.getLacppartnersystemmac()))) &&
            ((this.lacppartnersystempriority==null && other.getLacppartnersystempriority()==null) || 
             (this.lacppartnersystempriority!=null &&
              this.lacppartnersystempriority.equals(other.getLacppartnersystempriority()))) &&
            ((this.lacppartnerportno==null && other.getLacppartnerportno()==null) || 
             (this.lacppartnerportno!=null &&
              this.lacppartnerportno.equals(other.getLacppartnerportno()))) &&
            ((this.lacppartnerkey==null && other.getLacppartnerkey()==null) || 
             (this.lacppartnerkey!=null &&
              this.lacppartnerkey.equals(other.getLacppartnerkey()))) &&
            ((this.lacpactoraggregation==null && other.getLacpactoraggregation()==null) || 
             (this.lacpactoraggregation!=null &&
              this.lacpactoraggregation.equals(other.getLacpactoraggregation()))) &&
            ((this.lacpactorinsync==null && other.getLacpactorinsync()==null) || 
             (this.lacpactorinsync!=null &&
              this.lacpactorinsync.equals(other.getLacpactorinsync()))) &&
            ((this.lacpactorcollecting==null && other.getLacpactorcollecting()==null) || 
             (this.lacpactorcollecting!=null &&
              this.lacpactorcollecting.equals(other.getLacpactorcollecting()))) &&
            ((this.lacpactordistributing==null && other.getLacpactordistributing()==null) || 
             (this.lacpactordistributing!=null &&
              this.lacpactordistributing.equals(other.getLacpactordistributing()))) &&
            ((this.lacpportmuxstate==null && other.getLacpportmuxstate()==null) || 
             (this.lacpportmuxstate!=null &&
              this.lacpportmuxstate.equals(other.getLacpportmuxstate()))) &&
            ((this.lacpportrxstat==null && other.getLacpportrxstat()==null) || 
             (this.lacpportrxstat!=null &&
              this.lacpportrxstat.equals(other.getLacpportrxstat()))) &&
            ((this.lacpportselectstate==null && other.getLacpportselectstate()==null) || 
             (this.lacpportselectstate!=null &&
              this.lacpportselectstate.equals(other.getLacpportselectstate())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getDevicename() != null) {
            _hashCode += getDevicename().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getFlags() != null) {
            _hashCode += getFlags().hashCode();
        }
        if (getMtu() != null) {
            _hashCode += getMtu().hashCode();
        }
        if (getVlan() != null) {
            _hashCode += getVlan().hashCode();
        }
        if (getMac() != null) {
            _hashCode += getMac().hashCode();
        }
        if (getUptime() != null) {
            _hashCode += getUptime().hashCode();
        }
        if (getDowntime() != null) {
            _hashCode += getDowntime().hashCode();
        }
        if (getReqmedia() != null) {
            _hashCode += getReqmedia().hashCode();
        }
        if (getReqspeed() != null) {
            _hashCode += getReqspeed().hashCode();
        }
        if (getReqduplex() != null) {
            _hashCode += getReqduplex().hashCode();
        }
        if (getReqflowcontrol() != null) {
            _hashCode += getReqflowcontrol().hashCode();
        }
        if (getMedia() != null) {
            _hashCode += getMedia().hashCode();
        }
        if (getSpeed() != null) {
            _hashCode += getSpeed().hashCode();
        }
        if (getDuplex() != null) {
            _hashCode += getDuplex().hashCode();
        }
        if (getFlowcontrol() != null) {
            _hashCode += getFlowcontrol().hashCode();
        }
        if (getConndistr() != null) {
            _hashCode += getConndistr().hashCode();
        }
        if (getMacdistr() != null) {
            _hashCode += getMacdistr().hashCode();
        }
        if (getMode() != null) {
            _hashCode += getMode().hashCode();
        }
        if (getHamonitor() != null) {
            _hashCode += getHamonitor().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getAutoneg() != null) {
            _hashCode += getAutoneg().hashCode();
        }
        if (getAutonegresult() != null) {
            _hashCode += getAutonegresult().hashCode();
        }
        if (getTagged() != null) {
            _hashCode += getTagged().hashCode();
        }
        if (getTagall() != null) {
            _hashCode += getTagall().hashCode();
        }
        if (getTrunk() != null) {
            _hashCode += getTrunk().hashCode();
        }
        if (getTaggedany() != null) {
            _hashCode += getTaggedany().hashCode();
        }
        if (getTaggedautolearn() != null) {
            _hashCode += getTaggedautolearn().hashCode();
        }
        if (getHangdetect() != null) {
            _hashCode += getHangdetect().hashCode();
        }
        if (getHangreset() != null) {
            _hashCode += getHangreset().hashCode();
        }
        if (getLinkstate() != null) {
            _hashCode += getLinkstate().hashCode();
        }
        if (getIntfstate() != null) {
            _hashCode += getIntfstate().hashCode();
        }
        if (getRxpackets() != null) {
            _hashCode += getRxpackets().hashCode();
        }
        if (getRxbytes() != null) {
            _hashCode += getRxbytes().hashCode();
        }
        if (getRxerrors() != null) {
            _hashCode += getRxerrors().hashCode();
        }
        if (getRxdrops() != null) {
            _hashCode += getRxdrops().hashCode();
        }
        if (getTxpackets() != null) {
            _hashCode += getTxpackets().hashCode();
        }
        if (getTxbytes() != null) {
            _hashCode += getTxbytes().hashCode();
        }
        if (getTxerrors() != null) {
            _hashCode += getTxerrors().hashCode();
        }
        if (getTxdrops() != null) {
            _hashCode += getTxdrops().hashCode();
        }
        if (getIndisc() != null) {
            _hashCode += getIndisc().hashCode();
        }
        if (getOutdisc() != null) {
            _hashCode += getOutdisc().hashCode();
        }
        if (getFctls() != null) {
            _hashCode += getFctls().hashCode();
        }
        if (getHangs() != null) {
            _hashCode += getHangs().hashCode();
        }
        if (getStsstalls() != null) {
            _hashCode += getStsstalls().hashCode();
        }
        if (getTxstalls() != null) {
            _hashCode += getTxstalls().hashCode();
        }
        if (getRxstalls() != null) {
            _hashCode += getRxstalls().hashCode();
        }
        if (getBdgmacmoved() != null) {
            _hashCode += getBdgmacmoved().hashCode();
        }
        if (getBdgmuted() != null) {
            _hashCode += getBdgmuted().hashCode();
        }
        if (getVmac() != null) {
            _hashCode += getVmac().hashCode();
        }
        if (getVmac6() != null) {
            _hashCode += getVmac6().hashCode();
        }
        if (getLacpmode() != null) {
            _hashCode += getLacpmode().hashCode();
        }
        _hashCode += getLacpkey();
        if (getLacppriority() != null) {
            _hashCode += getLacppriority().hashCode();
        }
        if (getLacptimeout() != null) {
            _hashCode += getLacptimeout().hashCode();
        }
        if (getLagtype() != null) {
            _hashCode += getLagtype().hashCode();
        }
        if (getIfalias() != null) {
            _hashCode += getIfalias().hashCode();
        }
        if (getReqthroughput() != null) {
            _hashCode += getReqthroughput().hashCode();
        }
        if (getThroughput() != null) {
            _hashCode += getThroughput().hashCode();
        }
        if (getBandwidthhigh() != null) {
            _hashCode += getBandwidthhigh().hashCode();
        }
        if (getBandwidthnormal() != null) {
            _hashCode += getBandwidthnormal().hashCode();
        }
        if (getBackplane() != null) {
            _hashCode += getBackplane().hashCode();
        }
        if (getIfnum() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIfnum());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIfnum(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCleartime() != null) {
            _hashCode += getCleartime().hashCode();
        }
        if (getSlavestate() != null) {
            _hashCode += getSlavestate().hashCode();
        }
        if (getSlavemedia() != null) {
            _hashCode += getSlavemedia().hashCode();
        }
        if (getSlavespeed() != null) {
            _hashCode += getSlavespeed().hashCode();
        }
        if (getSlaveduplex() != null) {
            _hashCode += getSlaveduplex().hashCode();
        }
        if (getSlaveflowctl() != null) {
            _hashCode += getSlaveflowctl().hashCode();
        }
        if (getSlavetime() != null) {
            _hashCode += getSlavetime().hashCode();
        }
        if (getIntftype() != null) {
            _hashCode += getIntftype().hashCode();
        }
        if (getLacpactorpriority() != null) {
            _hashCode += getLacpactorpriority().hashCode();
        }
        if (getLacpactorportno() != null) {
            _hashCode += getLacpactorportno().hashCode();
        }
        if (getLacppartnerstate() != null) {
            _hashCode += getLacppartnerstate().hashCode();
        }
        if (getLacppartnertimeout() != null) {
            _hashCode += getLacppartnertimeout().hashCode();
        }
        if (getLacppartneraggregation() != null) {
            _hashCode += getLacppartneraggregation().hashCode();
        }
        if (getLacppartnerinsync() != null) {
            _hashCode += getLacppartnerinsync().hashCode();
        }
        if (getLacppartnercollecting() != null) {
            _hashCode += getLacppartnercollecting().hashCode();
        }
        if (getLacppartnerdistributing() != null) {
            _hashCode += getLacppartnerdistributing().hashCode();
        }
        if (getLacppartnerdefaulted() != null) {
            _hashCode += getLacppartnerdefaulted().hashCode();
        }
        if (getLacppartnerexpired() != null) {
            _hashCode += getLacppartnerexpired().hashCode();
        }
        if (getLacppartnerpriority() != null) {
            _hashCode += getLacppartnerpriority().hashCode();
        }
        if (getLacppartnersystemmac() != null) {
            _hashCode += getLacppartnersystemmac().hashCode();
        }
        if (getLacppartnersystempriority() != null) {
            _hashCode += getLacppartnersystempriority().hashCode();
        }
        if (getLacppartnerportno() != null) {
            _hashCode += getLacppartnerportno().hashCode();
        }
        if (getLacppartnerkey() != null) {
            _hashCode += getLacppartnerkey().hashCode();
        }
        if (getLacpactoraggregation() != null) {
            _hashCode += getLacpactoraggregation().hashCode();
        }
        if (getLacpactorinsync() != null) {
            _hashCode += getLacpactorinsync().hashCode();
        }
        if (getLacpactorcollecting() != null) {
            _hashCode += getLacpactorcollecting().hashCode();
        }
        if (getLacpactordistributing() != null) {
            _hashCode += getLacpactordistributing().hashCode();
        }
        if (getLacpportmuxstate() != null) {
            _hashCode += getLacpportmuxstate().hashCode();
        }
        if (getLacpportrxstat() != null) {
            _hashCode += getLacpportrxstat().hashCode();
        }
        if (getLacpportselectstate() != null) {
            _hashCode += getLacpportselectstate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InterfacE.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "interfacE"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devicename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "devicename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mtu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mtu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mac");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uptime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uptime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downtime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "downtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqmedia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reqmedia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqspeed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reqspeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqduplex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reqduplex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqflowcontrol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reqflowcontrol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("media");
        elemField.setXmlName(new javax.xml.namespace.QName("", "media"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("speed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "speed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duplex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flowcontrol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flowcontrol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conndistr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conndistr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macdistr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "macdistr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hamonitor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hamonitor"));
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
        elemField.setFieldName("autoneg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoneg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autonegresult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autonegresult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagged");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tagged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagall");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tagall"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trunk");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trunk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taggedany");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taggedany"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taggedautolearn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taggedautolearn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hangdetect");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hangdetect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hangreset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hangreset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intfstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intfstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rxpackets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rxpackets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rxbytes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rxbytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rxerrors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rxerrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rxdrops");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rxdrops"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txpackets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "txpackets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txbytes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "txbytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txerrors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "txerrors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txdrops");
        elemField.setXmlName(new javax.xml.namespace.QName("", "txdrops"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indisc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indisc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outdisc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outdisc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fctls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fctls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hangs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hangs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stsstalls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stsstalls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("txstalls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "txstalls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rxstalls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rxstalls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bdgmacmoved");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bdgmacmoved"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bdgmuted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bdgmuted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmac");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vmac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmac6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vmac6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacpmode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacpmode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacpkey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacpkey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacppriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacppriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacptimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacptimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lagtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lagtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ifalias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ifalias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqthroughput");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reqthroughput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("throughput");
        elemField.setXmlName(new javax.xml.namespace.QName("", "throughput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandwidthhigh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bandwidthhigh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandwidthnormal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bandwidthnormal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backplane");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backplane"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ifnum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ifnum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cleartime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cleartime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slavestate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slavestate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slavemedia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slavemedia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slavespeed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slavespeed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slaveduplex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slaveduplex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slaveflowctl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slaveflowctl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slavetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slavetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intftype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intftype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacpactorpriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacpactorpriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacpactorportno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacpactorportno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacppartnerstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacppartnerstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacppartnertimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacppartnertimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacppartneraggregation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacppartneraggregation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacppartnerinsync");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacppartnerinsync"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacppartnercollecting");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacppartnercollecting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacppartnerdistributing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacppartnerdistributing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacppartnerdefaulted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacppartnerdefaulted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacppartnerexpired");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacppartnerexpired"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacppartnerpriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacppartnerpriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacppartnersystemmac");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacppartnersystemmac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacppartnersystempriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacppartnersystempriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacppartnerportno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacppartnerportno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacppartnerkey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacppartnerkey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacpactoraggregation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacpactoraggregation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacpactorinsync");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacpactorinsync"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacpactorcollecting");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacpactorcollecting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacpactordistributing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacpactordistributing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacpportmuxstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacpportmuxstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacpportrxstat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacpportrxstat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacpportselectstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacpportselectstate"));
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
