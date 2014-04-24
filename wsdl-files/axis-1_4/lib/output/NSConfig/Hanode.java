/**
 * Hanode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Hanode  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt id;

    private java.lang.String name;

    private java.lang.String ipaddress;

    private org.apache.axis.types.UnsignedInt flags;

    private java.lang.String hastatus;

    private java.lang.String state;

    private java.lang.String hasync;

    private java.lang.String haprop;

    private java.lang.String enaifaces;

    private java.lang.String disifaces;

    private java.lang.String hamonifaces;

    private java.lang.String pfifaces;

    private java.lang.String ifaces;

    private java.lang.String network;

    private java.lang.String netmask;

    private java.lang.String inc;

    private java.lang.String ssl2;

    private org.apache.axis.types.UnsignedInt hellointerval;

    private org.apache.axis.types.UnsignedInt deadinterval;

    private org.apache.axis.types.UnsignedInt masterstatetime;

    private java.lang.String failsafe;

    private java.lang.String routemonitor;

    private org.apache.axis.types.UnsignedInt maxflips;

    private org.apache.axis.types.UnsignedInt maxfliptime;

    private org.apache.axis.types.UnsignedInt curflips;

    private org.apache.axis.types.UnsignedInt completedfliptime;

    private org.apache.axis.types.UnsignedInt syncvlan;

    private java.lang.String[] criticalinterfaces;

    private java.lang.String[] pfltifaces;

    private java.lang.String[] fisname;

    private java.lang.String[] fisifaces;

    private java.lang.String[] routemonnetwork;

    private java.lang.String[] routemonnetmask;

    private org.apache.axis.types.UnsignedInt[] routemonstate;

    private java.lang.String[] routemon6Network;

    private java.lang.String[] routemon6Netmask;

    private org.apache.axis.types.UnsignedInt[] routemon6State;

    public Hanode() {
    }

    public Hanode(
           org.apache.axis.types.UnsignedInt id,
           java.lang.String name,
           java.lang.String ipaddress,
           org.apache.axis.types.UnsignedInt flags,
           java.lang.String hastatus,
           java.lang.String state,
           java.lang.String hasync,
           java.lang.String haprop,
           java.lang.String enaifaces,
           java.lang.String disifaces,
           java.lang.String hamonifaces,
           java.lang.String pfifaces,
           java.lang.String ifaces,
           java.lang.String network,
           java.lang.String netmask,
           java.lang.String inc,
           java.lang.String ssl2,
           org.apache.axis.types.UnsignedInt hellointerval,
           org.apache.axis.types.UnsignedInt deadinterval,
           org.apache.axis.types.UnsignedInt masterstatetime,
           java.lang.String failsafe,
           java.lang.String routemonitor,
           org.apache.axis.types.UnsignedInt maxflips,
           org.apache.axis.types.UnsignedInt maxfliptime,
           org.apache.axis.types.UnsignedInt curflips,
           org.apache.axis.types.UnsignedInt completedfliptime,
           org.apache.axis.types.UnsignedInt syncvlan,
           java.lang.String[] criticalinterfaces,
           java.lang.String[] pfltifaces,
           java.lang.String[] fisname,
           java.lang.String[] fisifaces,
           java.lang.String[] routemonnetwork,
           java.lang.String[] routemonnetmask,
           org.apache.axis.types.UnsignedInt[] routemonstate,
           java.lang.String[] routemon6Network,
           java.lang.String[] routemon6Netmask,
           org.apache.axis.types.UnsignedInt[] routemon6State) {
           this.id = id;
           this.name = name;
           this.ipaddress = ipaddress;
           this.flags = flags;
           this.hastatus = hastatus;
           this.state = state;
           this.hasync = hasync;
           this.haprop = haprop;
           this.enaifaces = enaifaces;
           this.disifaces = disifaces;
           this.hamonifaces = hamonifaces;
           this.pfifaces = pfifaces;
           this.ifaces = ifaces;
           this.network = network;
           this.netmask = netmask;
           this.inc = inc;
           this.ssl2 = ssl2;
           this.hellointerval = hellointerval;
           this.deadinterval = deadinterval;
           this.masterstatetime = masterstatetime;
           this.failsafe = failsafe;
           this.routemonitor = routemonitor;
           this.maxflips = maxflips;
           this.maxfliptime = maxfliptime;
           this.curflips = curflips;
           this.completedfliptime = completedfliptime;
           this.syncvlan = syncvlan;
           this.criticalinterfaces = criticalinterfaces;
           this.pfltifaces = pfltifaces;
           this.fisname = fisname;
           this.fisifaces = fisifaces;
           this.routemonnetwork = routemonnetwork;
           this.routemonnetmask = routemonnetmask;
           this.routemonstate = routemonstate;
           this.routemon6Network = routemon6Network;
           this.routemon6Netmask = routemon6Netmask;
           this.routemon6State = routemon6State;
    }


    /**
     * Gets the id value for this Hanode.
     * 
     * @return id
     */
    public org.apache.axis.types.UnsignedInt getId() {
        return id;
    }


    /**
     * Sets the id value for this Hanode.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.UnsignedInt id) {
        this.id = id;
    }


    /**
     * Gets the name value for this Hanode.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Hanode.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the ipaddress value for this Hanode.
     * 
     * @return ipaddress
     */
    public java.lang.String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Hanode.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the flags value for this Hanode.
     * 
     * @return flags
     */
    public org.apache.axis.types.UnsignedInt getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this Hanode.
     * 
     * @param flags
     */
    public void setFlags(org.apache.axis.types.UnsignedInt flags) {
        this.flags = flags;
    }


    /**
     * Gets the hastatus value for this Hanode.
     * 
     * @return hastatus
     */
    public java.lang.String getHastatus() {
        return hastatus;
    }


    /**
     * Sets the hastatus value for this Hanode.
     * 
     * @param hastatus
     */
    public void setHastatus(java.lang.String hastatus) {
        this.hastatus = hastatus;
    }


    /**
     * Gets the state value for this Hanode.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Hanode.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the hasync value for this Hanode.
     * 
     * @return hasync
     */
    public java.lang.String getHasync() {
        return hasync;
    }


    /**
     * Sets the hasync value for this Hanode.
     * 
     * @param hasync
     */
    public void setHasync(java.lang.String hasync) {
        this.hasync = hasync;
    }


    /**
     * Gets the haprop value for this Hanode.
     * 
     * @return haprop
     */
    public java.lang.String getHaprop() {
        return haprop;
    }


    /**
     * Sets the haprop value for this Hanode.
     * 
     * @param haprop
     */
    public void setHaprop(java.lang.String haprop) {
        this.haprop = haprop;
    }


    /**
     * Gets the enaifaces value for this Hanode.
     * 
     * @return enaifaces
     */
    public java.lang.String getEnaifaces() {
        return enaifaces;
    }


    /**
     * Sets the enaifaces value for this Hanode.
     * 
     * @param enaifaces
     */
    public void setEnaifaces(java.lang.String enaifaces) {
        this.enaifaces = enaifaces;
    }


    /**
     * Gets the disifaces value for this Hanode.
     * 
     * @return disifaces
     */
    public java.lang.String getDisifaces() {
        return disifaces;
    }


    /**
     * Sets the disifaces value for this Hanode.
     * 
     * @param disifaces
     */
    public void setDisifaces(java.lang.String disifaces) {
        this.disifaces = disifaces;
    }


    /**
     * Gets the hamonifaces value for this Hanode.
     * 
     * @return hamonifaces
     */
    public java.lang.String getHamonifaces() {
        return hamonifaces;
    }


    /**
     * Sets the hamonifaces value for this Hanode.
     * 
     * @param hamonifaces
     */
    public void setHamonifaces(java.lang.String hamonifaces) {
        this.hamonifaces = hamonifaces;
    }


    /**
     * Gets the pfifaces value for this Hanode.
     * 
     * @return pfifaces
     */
    public java.lang.String getPfifaces() {
        return pfifaces;
    }


    /**
     * Sets the pfifaces value for this Hanode.
     * 
     * @param pfifaces
     */
    public void setPfifaces(java.lang.String pfifaces) {
        this.pfifaces = pfifaces;
    }


    /**
     * Gets the ifaces value for this Hanode.
     * 
     * @return ifaces
     */
    public java.lang.String getIfaces() {
        return ifaces;
    }


    /**
     * Sets the ifaces value for this Hanode.
     * 
     * @param ifaces
     */
    public void setIfaces(java.lang.String ifaces) {
        this.ifaces = ifaces;
    }


    /**
     * Gets the network value for this Hanode.
     * 
     * @return network
     */
    public java.lang.String getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this Hanode.
     * 
     * @param network
     */
    public void setNetwork(java.lang.String network) {
        this.network = network;
    }


    /**
     * Gets the netmask value for this Hanode.
     * 
     * @return netmask
     */
    public java.lang.String getNetmask() {
        return netmask;
    }


    /**
     * Sets the netmask value for this Hanode.
     * 
     * @param netmask
     */
    public void setNetmask(java.lang.String netmask) {
        this.netmask = netmask;
    }


    /**
     * Gets the inc value for this Hanode.
     * 
     * @return inc
     */
    public java.lang.String getInc() {
        return inc;
    }


    /**
     * Sets the inc value for this Hanode.
     * 
     * @param inc
     */
    public void setInc(java.lang.String inc) {
        this.inc = inc;
    }


    /**
     * Gets the ssl2 value for this Hanode.
     * 
     * @return ssl2
     */
    public java.lang.String getSsl2() {
        return ssl2;
    }


    /**
     * Sets the ssl2 value for this Hanode.
     * 
     * @param ssl2
     */
    public void setSsl2(java.lang.String ssl2) {
        this.ssl2 = ssl2;
    }


    /**
     * Gets the hellointerval value for this Hanode.
     * 
     * @return hellointerval
     */
    public org.apache.axis.types.UnsignedInt getHellointerval() {
        return hellointerval;
    }


    /**
     * Sets the hellointerval value for this Hanode.
     * 
     * @param hellointerval
     */
    public void setHellointerval(org.apache.axis.types.UnsignedInt hellointerval) {
        this.hellointerval = hellointerval;
    }


    /**
     * Gets the deadinterval value for this Hanode.
     * 
     * @return deadinterval
     */
    public org.apache.axis.types.UnsignedInt getDeadinterval() {
        return deadinterval;
    }


    /**
     * Sets the deadinterval value for this Hanode.
     * 
     * @param deadinterval
     */
    public void setDeadinterval(org.apache.axis.types.UnsignedInt deadinterval) {
        this.deadinterval = deadinterval;
    }


    /**
     * Gets the masterstatetime value for this Hanode.
     * 
     * @return masterstatetime
     */
    public org.apache.axis.types.UnsignedInt getMasterstatetime() {
        return masterstatetime;
    }


    /**
     * Sets the masterstatetime value for this Hanode.
     * 
     * @param masterstatetime
     */
    public void setMasterstatetime(org.apache.axis.types.UnsignedInt masterstatetime) {
        this.masterstatetime = masterstatetime;
    }


    /**
     * Gets the failsafe value for this Hanode.
     * 
     * @return failsafe
     */
    public java.lang.String getFailsafe() {
        return failsafe;
    }


    /**
     * Sets the failsafe value for this Hanode.
     * 
     * @param failsafe
     */
    public void setFailsafe(java.lang.String failsafe) {
        this.failsafe = failsafe;
    }


    /**
     * Gets the routemonitor value for this Hanode.
     * 
     * @return routemonitor
     */
    public java.lang.String getRoutemonitor() {
        return routemonitor;
    }


    /**
     * Sets the routemonitor value for this Hanode.
     * 
     * @param routemonitor
     */
    public void setRoutemonitor(java.lang.String routemonitor) {
        this.routemonitor = routemonitor;
    }


    /**
     * Gets the maxflips value for this Hanode.
     * 
     * @return maxflips
     */
    public org.apache.axis.types.UnsignedInt getMaxflips() {
        return maxflips;
    }


    /**
     * Sets the maxflips value for this Hanode.
     * 
     * @param maxflips
     */
    public void setMaxflips(org.apache.axis.types.UnsignedInt maxflips) {
        this.maxflips = maxflips;
    }


    /**
     * Gets the maxfliptime value for this Hanode.
     * 
     * @return maxfliptime
     */
    public org.apache.axis.types.UnsignedInt getMaxfliptime() {
        return maxfliptime;
    }


    /**
     * Sets the maxfliptime value for this Hanode.
     * 
     * @param maxfliptime
     */
    public void setMaxfliptime(org.apache.axis.types.UnsignedInt maxfliptime) {
        this.maxfliptime = maxfliptime;
    }


    /**
     * Gets the curflips value for this Hanode.
     * 
     * @return curflips
     */
    public org.apache.axis.types.UnsignedInt getCurflips() {
        return curflips;
    }


    /**
     * Sets the curflips value for this Hanode.
     * 
     * @param curflips
     */
    public void setCurflips(org.apache.axis.types.UnsignedInt curflips) {
        this.curflips = curflips;
    }


    /**
     * Gets the completedfliptime value for this Hanode.
     * 
     * @return completedfliptime
     */
    public org.apache.axis.types.UnsignedInt getCompletedfliptime() {
        return completedfliptime;
    }


    /**
     * Sets the completedfliptime value for this Hanode.
     * 
     * @param completedfliptime
     */
    public void setCompletedfliptime(org.apache.axis.types.UnsignedInt completedfliptime) {
        this.completedfliptime = completedfliptime;
    }


    /**
     * Gets the syncvlan value for this Hanode.
     * 
     * @return syncvlan
     */
    public org.apache.axis.types.UnsignedInt getSyncvlan() {
        return syncvlan;
    }


    /**
     * Sets the syncvlan value for this Hanode.
     * 
     * @param syncvlan
     */
    public void setSyncvlan(org.apache.axis.types.UnsignedInt syncvlan) {
        this.syncvlan = syncvlan;
    }


    /**
     * Gets the criticalinterfaces value for this Hanode.
     * 
     * @return criticalinterfaces
     */
    public java.lang.String[] getCriticalinterfaces() {
        return criticalinterfaces;
    }


    /**
     * Sets the criticalinterfaces value for this Hanode.
     * 
     * @param criticalinterfaces
     */
    public void setCriticalinterfaces(java.lang.String[] criticalinterfaces) {
        this.criticalinterfaces = criticalinterfaces;
    }


    /**
     * Gets the pfltifaces value for this Hanode.
     * 
     * @return pfltifaces
     */
    public java.lang.String[] getPfltifaces() {
        return pfltifaces;
    }


    /**
     * Sets the pfltifaces value for this Hanode.
     * 
     * @param pfltifaces
     */
    public void setPfltifaces(java.lang.String[] pfltifaces) {
        this.pfltifaces = pfltifaces;
    }


    /**
     * Gets the fisname value for this Hanode.
     * 
     * @return fisname
     */
    public java.lang.String[] getFisname() {
        return fisname;
    }


    /**
     * Sets the fisname value for this Hanode.
     * 
     * @param fisname
     */
    public void setFisname(java.lang.String[] fisname) {
        this.fisname = fisname;
    }


    /**
     * Gets the fisifaces value for this Hanode.
     * 
     * @return fisifaces
     */
    public java.lang.String[] getFisifaces() {
        return fisifaces;
    }


    /**
     * Sets the fisifaces value for this Hanode.
     * 
     * @param fisifaces
     */
    public void setFisifaces(java.lang.String[] fisifaces) {
        this.fisifaces = fisifaces;
    }


    /**
     * Gets the routemonnetwork value for this Hanode.
     * 
     * @return routemonnetwork
     */
    public java.lang.String[] getRoutemonnetwork() {
        return routemonnetwork;
    }


    /**
     * Sets the routemonnetwork value for this Hanode.
     * 
     * @param routemonnetwork
     */
    public void setRoutemonnetwork(java.lang.String[] routemonnetwork) {
        this.routemonnetwork = routemonnetwork;
    }


    /**
     * Gets the routemonnetmask value for this Hanode.
     * 
     * @return routemonnetmask
     */
    public java.lang.String[] getRoutemonnetmask() {
        return routemonnetmask;
    }


    /**
     * Sets the routemonnetmask value for this Hanode.
     * 
     * @param routemonnetmask
     */
    public void setRoutemonnetmask(java.lang.String[] routemonnetmask) {
        this.routemonnetmask = routemonnetmask;
    }


    /**
     * Gets the routemonstate value for this Hanode.
     * 
     * @return routemonstate
     */
    public org.apache.axis.types.UnsignedInt[] getRoutemonstate() {
        return routemonstate;
    }


    /**
     * Sets the routemonstate value for this Hanode.
     * 
     * @param routemonstate
     */
    public void setRoutemonstate(org.apache.axis.types.UnsignedInt[] routemonstate) {
        this.routemonstate = routemonstate;
    }


    /**
     * Gets the routemon6Network value for this Hanode.
     * 
     * @return routemon6Network
     */
    public java.lang.String[] getRoutemon6Network() {
        return routemon6Network;
    }


    /**
     * Sets the routemon6Network value for this Hanode.
     * 
     * @param routemon6Network
     */
    public void setRoutemon6Network(java.lang.String[] routemon6Network) {
        this.routemon6Network = routemon6Network;
    }


    /**
     * Gets the routemon6Netmask value for this Hanode.
     * 
     * @return routemon6Netmask
     */
    public java.lang.String[] getRoutemon6Netmask() {
        return routemon6Netmask;
    }


    /**
     * Sets the routemon6Netmask value for this Hanode.
     * 
     * @param routemon6Netmask
     */
    public void setRoutemon6Netmask(java.lang.String[] routemon6Netmask) {
        this.routemon6Netmask = routemon6Netmask;
    }


    /**
     * Gets the routemon6State value for this Hanode.
     * 
     * @return routemon6State
     */
    public org.apache.axis.types.UnsignedInt[] getRoutemon6State() {
        return routemon6State;
    }


    /**
     * Sets the routemon6State value for this Hanode.
     * 
     * @param routemon6State
     */
    public void setRoutemon6State(org.apache.axis.types.UnsignedInt[] routemon6State) {
        this.routemon6State = routemon6State;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Hanode)) return false;
        Hanode other = (Hanode) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              this.ipaddress.equals(other.getIpaddress()))) &&
            ((this.flags==null && other.getFlags()==null) || 
             (this.flags!=null &&
              this.flags.equals(other.getFlags()))) &&
            ((this.hastatus==null && other.getHastatus()==null) || 
             (this.hastatus!=null &&
              this.hastatus.equals(other.getHastatus()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.hasync==null && other.getHasync()==null) || 
             (this.hasync!=null &&
              this.hasync.equals(other.getHasync()))) &&
            ((this.haprop==null && other.getHaprop()==null) || 
             (this.haprop!=null &&
              this.haprop.equals(other.getHaprop()))) &&
            ((this.enaifaces==null && other.getEnaifaces()==null) || 
             (this.enaifaces!=null &&
              this.enaifaces.equals(other.getEnaifaces()))) &&
            ((this.disifaces==null && other.getDisifaces()==null) || 
             (this.disifaces!=null &&
              this.disifaces.equals(other.getDisifaces()))) &&
            ((this.hamonifaces==null && other.getHamonifaces()==null) || 
             (this.hamonifaces!=null &&
              this.hamonifaces.equals(other.getHamonifaces()))) &&
            ((this.pfifaces==null && other.getPfifaces()==null) || 
             (this.pfifaces!=null &&
              this.pfifaces.equals(other.getPfifaces()))) &&
            ((this.ifaces==null && other.getIfaces()==null) || 
             (this.ifaces!=null &&
              this.ifaces.equals(other.getIfaces()))) &&
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              this.network.equals(other.getNetwork()))) &&
            ((this.netmask==null && other.getNetmask()==null) || 
             (this.netmask!=null &&
              this.netmask.equals(other.getNetmask()))) &&
            ((this.inc==null && other.getInc()==null) || 
             (this.inc!=null &&
              this.inc.equals(other.getInc()))) &&
            ((this.ssl2==null && other.getSsl2()==null) || 
             (this.ssl2!=null &&
              this.ssl2.equals(other.getSsl2()))) &&
            ((this.hellointerval==null && other.getHellointerval()==null) || 
             (this.hellointerval!=null &&
              this.hellointerval.equals(other.getHellointerval()))) &&
            ((this.deadinterval==null && other.getDeadinterval()==null) || 
             (this.deadinterval!=null &&
              this.deadinterval.equals(other.getDeadinterval()))) &&
            ((this.masterstatetime==null && other.getMasterstatetime()==null) || 
             (this.masterstatetime!=null &&
              this.masterstatetime.equals(other.getMasterstatetime()))) &&
            ((this.failsafe==null && other.getFailsafe()==null) || 
             (this.failsafe!=null &&
              this.failsafe.equals(other.getFailsafe()))) &&
            ((this.routemonitor==null && other.getRoutemonitor()==null) || 
             (this.routemonitor!=null &&
              this.routemonitor.equals(other.getRoutemonitor()))) &&
            ((this.maxflips==null && other.getMaxflips()==null) || 
             (this.maxflips!=null &&
              this.maxflips.equals(other.getMaxflips()))) &&
            ((this.maxfliptime==null && other.getMaxfliptime()==null) || 
             (this.maxfliptime!=null &&
              this.maxfliptime.equals(other.getMaxfliptime()))) &&
            ((this.curflips==null && other.getCurflips()==null) || 
             (this.curflips!=null &&
              this.curflips.equals(other.getCurflips()))) &&
            ((this.completedfliptime==null && other.getCompletedfliptime()==null) || 
             (this.completedfliptime!=null &&
              this.completedfliptime.equals(other.getCompletedfliptime()))) &&
            ((this.syncvlan==null && other.getSyncvlan()==null) || 
             (this.syncvlan!=null &&
              this.syncvlan.equals(other.getSyncvlan()))) &&
            ((this.criticalinterfaces==null && other.getCriticalinterfaces()==null) || 
             (this.criticalinterfaces!=null &&
              java.util.Arrays.equals(this.criticalinterfaces, other.getCriticalinterfaces()))) &&
            ((this.pfltifaces==null && other.getPfltifaces()==null) || 
             (this.pfltifaces!=null &&
              java.util.Arrays.equals(this.pfltifaces, other.getPfltifaces()))) &&
            ((this.fisname==null && other.getFisname()==null) || 
             (this.fisname!=null &&
              java.util.Arrays.equals(this.fisname, other.getFisname()))) &&
            ((this.fisifaces==null && other.getFisifaces()==null) || 
             (this.fisifaces!=null &&
              java.util.Arrays.equals(this.fisifaces, other.getFisifaces()))) &&
            ((this.routemonnetwork==null && other.getRoutemonnetwork()==null) || 
             (this.routemonnetwork!=null &&
              java.util.Arrays.equals(this.routemonnetwork, other.getRoutemonnetwork()))) &&
            ((this.routemonnetmask==null && other.getRoutemonnetmask()==null) || 
             (this.routemonnetmask!=null &&
              java.util.Arrays.equals(this.routemonnetmask, other.getRoutemonnetmask()))) &&
            ((this.routemonstate==null && other.getRoutemonstate()==null) || 
             (this.routemonstate!=null &&
              java.util.Arrays.equals(this.routemonstate, other.getRoutemonstate()))) &&
            ((this.routemon6Network==null && other.getRoutemon6Network()==null) || 
             (this.routemon6Network!=null &&
              java.util.Arrays.equals(this.routemon6Network, other.getRoutemon6Network()))) &&
            ((this.routemon6Netmask==null && other.getRoutemon6Netmask()==null) || 
             (this.routemon6Netmask!=null &&
              java.util.Arrays.equals(this.routemon6Netmask, other.getRoutemon6Netmask()))) &&
            ((this.routemon6State==null && other.getRoutemon6State()==null) || 
             (this.routemon6State!=null &&
              java.util.Arrays.equals(this.routemon6State, other.getRoutemon6State())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getIpaddress() != null) {
            _hashCode += getIpaddress().hashCode();
        }
        if (getFlags() != null) {
            _hashCode += getFlags().hashCode();
        }
        if (getHastatus() != null) {
            _hashCode += getHastatus().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getHasync() != null) {
            _hashCode += getHasync().hashCode();
        }
        if (getHaprop() != null) {
            _hashCode += getHaprop().hashCode();
        }
        if (getEnaifaces() != null) {
            _hashCode += getEnaifaces().hashCode();
        }
        if (getDisifaces() != null) {
            _hashCode += getDisifaces().hashCode();
        }
        if (getHamonifaces() != null) {
            _hashCode += getHamonifaces().hashCode();
        }
        if (getPfifaces() != null) {
            _hashCode += getPfifaces().hashCode();
        }
        if (getIfaces() != null) {
            _hashCode += getIfaces().hashCode();
        }
        if (getNetwork() != null) {
            _hashCode += getNetwork().hashCode();
        }
        if (getNetmask() != null) {
            _hashCode += getNetmask().hashCode();
        }
        if (getInc() != null) {
            _hashCode += getInc().hashCode();
        }
        if (getSsl2() != null) {
            _hashCode += getSsl2().hashCode();
        }
        if (getHellointerval() != null) {
            _hashCode += getHellointerval().hashCode();
        }
        if (getDeadinterval() != null) {
            _hashCode += getDeadinterval().hashCode();
        }
        if (getMasterstatetime() != null) {
            _hashCode += getMasterstatetime().hashCode();
        }
        if (getFailsafe() != null) {
            _hashCode += getFailsafe().hashCode();
        }
        if (getRoutemonitor() != null) {
            _hashCode += getRoutemonitor().hashCode();
        }
        if (getMaxflips() != null) {
            _hashCode += getMaxflips().hashCode();
        }
        if (getMaxfliptime() != null) {
            _hashCode += getMaxfliptime().hashCode();
        }
        if (getCurflips() != null) {
            _hashCode += getCurflips().hashCode();
        }
        if (getCompletedfliptime() != null) {
            _hashCode += getCompletedfliptime().hashCode();
        }
        if (getSyncvlan() != null) {
            _hashCode += getSyncvlan().hashCode();
        }
        if (getCriticalinterfaces() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCriticalinterfaces());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCriticalinterfaces(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPfltifaces() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPfltifaces());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPfltifaces(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFisname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFisname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFisname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFisifaces() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFisifaces());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFisifaces(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoutemonnetwork() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoutemonnetwork());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoutemonnetwork(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoutemonnetmask() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoutemonnetmask());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoutemonnetmask(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoutemonstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoutemonstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoutemonstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoutemon6Network() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoutemon6Network());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoutemon6Network(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoutemon6Netmask() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoutemon6Netmask());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoutemon6Netmask(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRoutemon6State() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoutemon6State());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoutemon6State(), i);
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
        new org.apache.axis.description.TypeDesc(Hanode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "hanode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hastatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hastatus"));
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
        elemField.setFieldName("hasync");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hasync"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("haprop");
        elemField.setXmlName(new javax.xml.namespace.QName("", "haprop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enaifaces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enaifaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disifaces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disifaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hamonifaces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hamonifaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pfifaces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pfifaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ifaces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ifaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("", "network"));
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
        elemField.setFieldName("inc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssl2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssl2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hellointerval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hellointerval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deadinterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deadinterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterstatetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "masterstatetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failsafe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "failsafe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routemonitor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routemonitor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxflips");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxflips"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxfliptime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxfliptime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curflips");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curflips"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("completedfliptime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "completedfliptime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syncvlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "syncvlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criticalinterfaces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "criticalinterfaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pfltifaces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pfltifaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fisname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fisname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fisifaces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fisifaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routemonnetwork");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routemonnetwork"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routemonnetmask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routemonnetmask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routemonstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routemonstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routemon6Network");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routemon6network"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routemon6Netmask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routemon6netmask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routemon6State");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routemon6state"));
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
