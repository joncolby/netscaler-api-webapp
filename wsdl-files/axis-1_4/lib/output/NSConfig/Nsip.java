/**
 * Nsip.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nsip  implements java.io.Serializable {
    private java.lang.String ipaddress;

    private java.lang.String type;

    private java.lang.String netmask;

    private org.apache.axis.types.UnsignedInt flags;

    private java.lang.String arp;

    private java.lang.String icmp;

    private java.lang.String vserver;

    private java.lang.String telnet;

    private java.lang.String ssh;

    private java.lang.String gui;

    private java.lang.String snmp;

    private java.lang.String ftp;

    private java.lang.String mgmtaccess;

    private java.lang.String restrictaccess;

    private java.lang.String dynamicrouting;

    private java.lang.String bgp;

    private java.lang.String ospf;

    private java.lang.String rip;

    private java.lang.String hostroute;

    private java.lang.String hostrtgw;

    private java.lang.String hostrtgwact;

    private int metric;

    private int ospfarea;

    private org.apache.axis.types.UnsignedInt ospfareaval;

    private java.lang.String vserverrhilevel;

    private boolean viprtadv2Bsd;

    private org.apache.axis.types.UnsignedInt vipvsercount;

    private org.apache.axis.types.UnsignedInt vipvserdowncount;

    private java.lang.String ospflsatype;

    private java.lang.String state;

    private org.apache.axis.types.UnsignedInt freeports;

    private org.apache.axis.types.UnsignedInt vrid;

    private java.lang.String iptype;

    private java.lang.String icmpresponse;

    private org.apache.axis.types.UnsignedInt ownernode;

    private java.lang.String arpresponse;

    public Nsip() {
    }

    public Nsip(
           java.lang.String ipaddress,
           java.lang.String type,
           java.lang.String netmask,
           org.apache.axis.types.UnsignedInt flags,
           java.lang.String arp,
           java.lang.String icmp,
           java.lang.String vserver,
           java.lang.String telnet,
           java.lang.String ssh,
           java.lang.String gui,
           java.lang.String snmp,
           java.lang.String ftp,
           java.lang.String mgmtaccess,
           java.lang.String restrictaccess,
           java.lang.String dynamicrouting,
           java.lang.String bgp,
           java.lang.String ospf,
           java.lang.String rip,
           java.lang.String hostroute,
           java.lang.String hostrtgw,
           java.lang.String hostrtgwact,
           int metric,
           int ospfarea,
           org.apache.axis.types.UnsignedInt ospfareaval,
           java.lang.String vserverrhilevel,
           boolean viprtadv2Bsd,
           org.apache.axis.types.UnsignedInt vipvsercount,
           org.apache.axis.types.UnsignedInt vipvserdowncount,
           java.lang.String ospflsatype,
           java.lang.String state,
           org.apache.axis.types.UnsignedInt freeports,
           org.apache.axis.types.UnsignedInt vrid,
           java.lang.String iptype,
           java.lang.String icmpresponse,
           org.apache.axis.types.UnsignedInt ownernode,
           java.lang.String arpresponse) {
           this.ipaddress = ipaddress;
           this.type = type;
           this.netmask = netmask;
           this.flags = flags;
           this.arp = arp;
           this.icmp = icmp;
           this.vserver = vserver;
           this.telnet = telnet;
           this.ssh = ssh;
           this.gui = gui;
           this.snmp = snmp;
           this.ftp = ftp;
           this.mgmtaccess = mgmtaccess;
           this.restrictaccess = restrictaccess;
           this.dynamicrouting = dynamicrouting;
           this.bgp = bgp;
           this.ospf = ospf;
           this.rip = rip;
           this.hostroute = hostroute;
           this.hostrtgw = hostrtgw;
           this.hostrtgwact = hostrtgwact;
           this.metric = metric;
           this.ospfarea = ospfarea;
           this.ospfareaval = ospfareaval;
           this.vserverrhilevel = vserverrhilevel;
           this.viprtadv2Bsd = viprtadv2Bsd;
           this.vipvsercount = vipvsercount;
           this.vipvserdowncount = vipvserdowncount;
           this.ospflsatype = ospflsatype;
           this.state = state;
           this.freeports = freeports;
           this.vrid = vrid;
           this.iptype = iptype;
           this.icmpresponse = icmpresponse;
           this.ownernode = ownernode;
           this.arpresponse = arpresponse;
    }


    /**
     * Gets the ipaddress value for this Nsip.
     * 
     * @return ipaddress
     */
    public java.lang.String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Nsip.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the type value for this Nsip.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Nsip.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the netmask value for this Nsip.
     * 
     * @return netmask
     */
    public java.lang.String getNetmask() {
        return netmask;
    }


    /**
     * Sets the netmask value for this Nsip.
     * 
     * @param netmask
     */
    public void setNetmask(java.lang.String netmask) {
        this.netmask = netmask;
    }


    /**
     * Gets the flags value for this Nsip.
     * 
     * @return flags
     */
    public org.apache.axis.types.UnsignedInt getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this Nsip.
     * 
     * @param flags
     */
    public void setFlags(org.apache.axis.types.UnsignedInt flags) {
        this.flags = flags;
    }


    /**
     * Gets the arp value for this Nsip.
     * 
     * @return arp
     */
    public java.lang.String getArp() {
        return arp;
    }


    /**
     * Sets the arp value for this Nsip.
     * 
     * @param arp
     */
    public void setArp(java.lang.String arp) {
        this.arp = arp;
    }


    /**
     * Gets the icmp value for this Nsip.
     * 
     * @return icmp
     */
    public java.lang.String getIcmp() {
        return icmp;
    }


    /**
     * Sets the icmp value for this Nsip.
     * 
     * @param icmp
     */
    public void setIcmp(java.lang.String icmp) {
        this.icmp = icmp;
    }


    /**
     * Gets the vserver value for this Nsip.
     * 
     * @return vserver
     */
    public java.lang.String getVserver() {
        return vserver;
    }


    /**
     * Sets the vserver value for this Nsip.
     * 
     * @param vserver
     */
    public void setVserver(java.lang.String vserver) {
        this.vserver = vserver;
    }


    /**
     * Gets the telnet value for this Nsip.
     * 
     * @return telnet
     */
    public java.lang.String getTelnet() {
        return telnet;
    }


    /**
     * Sets the telnet value for this Nsip.
     * 
     * @param telnet
     */
    public void setTelnet(java.lang.String telnet) {
        this.telnet = telnet;
    }


    /**
     * Gets the ssh value for this Nsip.
     * 
     * @return ssh
     */
    public java.lang.String getSsh() {
        return ssh;
    }


    /**
     * Sets the ssh value for this Nsip.
     * 
     * @param ssh
     */
    public void setSsh(java.lang.String ssh) {
        this.ssh = ssh;
    }


    /**
     * Gets the gui value for this Nsip.
     * 
     * @return gui
     */
    public java.lang.String getGui() {
        return gui;
    }


    /**
     * Sets the gui value for this Nsip.
     * 
     * @param gui
     */
    public void setGui(java.lang.String gui) {
        this.gui = gui;
    }


    /**
     * Gets the snmp value for this Nsip.
     * 
     * @return snmp
     */
    public java.lang.String getSnmp() {
        return snmp;
    }


    /**
     * Sets the snmp value for this Nsip.
     * 
     * @param snmp
     */
    public void setSnmp(java.lang.String snmp) {
        this.snmp = snmp;
    }


    /**
     * Gets the ftp value for this Nsip.
     * 
     * @return ftp
     */
    public java.lang.String getFtp() {
        return ftp;
    }


    /**
     * Sets the ftp value for this Nsip.
     * 
     * @param ftp
     */
    public void setFtp(java.lang.String ftp) {
        this.ftp = ftp;
    }


    /**
     * Gets the mgmtaccess value for this Nsip.
     * 
     * @return mgmtaccess
     */
    public java.lang.String getMgmtaccess() {
        return mgmtaccess;
    }


    /**
     * Sets the mgmtaccess value for this Nsip.
     * 
     * @param mgmtaccess
     */
    public void setMgmtaccess(java.lang.String mgmtaccess) {
        this.mgmtaccess = mgmtaccess;
    }


    /**
     * Gets the restrictaccess value for this Nsip.
     * 
     * @return restrictaccess
     */
    public java.lang.String getRestrictaccess() {
        return restrictaccess;
    }


    /**
     * Sets the restrictaccess value for this Nsip.
     * 
     * @param restrictaccess
     */
    public void setRestrictaccess(java.lang.String restrictaccess) {
        this.restrictaccess = restrictaccess;
    }


    /**
     * Gets the dynamicrouting value for this Nsip.
     * 
     * @return dynamicrouting
     */
    public java.lang.String getDynamicrouting() {
        return dynamicrouting;
    }


    /**
     * Sets the dynamicrouting value for this Nsip.
     * 
     * @param dynamicrouting
     */
    public void setDynamicrouting(java.lang.String dynamicrouting) {
        this.dynamicrouting = dynamicrouting;
    }


    /**
     * Gets the bgp value for this Nsip.
     * 
     * @return bgp
     */
    public java.lang.String getBgp() {
        return bgp;
    }


    /**
     * Sets the bgp value for this Nsip.
     * 
     * @param bgp
     */
    public void setBgp(java.lang.String bgp) {
        this.bgp = bgp;
    }


    /**
     * Gets the ospf value for this Nsip.
     * 
     * @return ospf
     */
    public java.lang.String getOspf() {
        return ospf;
    }


    /**
     * Sets the ospf value for this Nsip.
     * 
     * @param ospf
     */
    public void setOspf(java.lang.String ospf) {
        this.ospf = ospf;
    }


    /**
     * Gets the rip value for this Nsip.
     * 
     * @return rip
     */
    public java.lang.String getRip() {
        return rip;
    }


    /**
     * Sets the rip value for this Nsip.
     * 
     * @param rip
     */
    public void setRip(java.lang.String rip) {
        this.rip = rip;
    }


    /**
     * Gets the hostroute value for this Nsip.
     * 
     * @return hostroute
     */
    public java.lang.String getHostroute() {
        return hostroute;
    }


    /**
     * Sets the hostroute value for this Nsip.
     * 
     * @param hostroute
     */
    public void setHostroute(java.lang.String hostroute) {
        this.hostroute = hostroute;
    }


    /**
     * Gets the hostrtgw value for this Nsip.
     * 
     * @return hostrtgw
     */
    public java.lang.String getHostrtgw() {
        return hostrtgw;
    }


    /**
     * Sets the hostrtgw value for this Nsip.
     * 
     * @param hostrtgw
     */
    public void setHostrtgw(java.lang.String hostrtgw) {
        this.hostrtgw = hostrtgw;
    }


    /**
     * Gets the hostrtgwact value for this Nsip.
     * 
     * @return hostrtgwact
     */
    public java.lang.String getHostrtgwact() {
        return hostrtgwact;
    }


    /**
     * Sets the hostrtgwact value for this Nsip.
     * 
     * @param hostrtgwact
     */
    public void setHostrtgwact(java.lang.String hostrtgwact) {
        this.hostrtgwact = hostrtgwact;
    }


    /**
     * Gets the metric value for this Nsip.
     * 
     * @return metric
     */
    public int getMetric() {
        return metric;
    }


    /**
     * Sets the metric value for this Nsip.
     * 
     * @param metric
     */
    public void setMetric(int metric) {
        this.metric = metric;
    }


    /**
     * Gets the ospfarea value for this Nsip.
     * 
     * @return ospfarea
     */
    public int getOspfarea() {
        return ospfarea;
    }


    /**
     * Sets the ospfarea value for this Nsip.
     * 
     * @param ospfarea
     */
    public void setOspfarea(int ospfarea) {
        this.ospfarea = ospfarea;
    }


    /**
     * Gets the ospfareaval value for this Nsip.
     * 
     * @return ospfareaval
     */
    public org.apache.axis.types.UnsignedInt getOspfareaval() {
        return ospfareaval;
    }


    /**
     * Sets the ospfareaval value for this Nsip.
     * 
     * @param ospfareaval
     */
    public void setOspfareaval(org.apache.axis.types.UnsignedInt ospfareaval) {
        this.ospfareaval = ospfareaval;
    }


    /**
     * Gets the vserverrhilevel value for this Nsip.
     * 
     * @return vserverrhilevel
     */
    public java.lang.String getVserverrhilevel() {
        return vserverrhilevel;
    }


    /**
     * Sets the vserverrhilevel value for this Nsip.
     * 
     * @param vserverrhilevel
     */
    public void setVserverrhilevel(java.lang.String vserverrhilevel) {
        this.vserverrhilevel = vserverrhilevel;
    }


    /**
     * Gets the viprtadv2Bsd value for this Nsip.
     * 
     * @return viprtadv2Bsd
     */
    public boolean isViprtadv2Bsd() {
        return viprtadv2Bsd;
    }


    /**
     * Sets the viprtadv2Bsd value for this Nsip.
     * 
     * @param viprtadv2Bsd
     */
    public void setViprtadv2Bsd(boolean viprtadv2Bsd) {
        this.viprtadv2Bsd = viprtadv2Bsd;
    }


    /**
     * Gets the vipvsercount value for this Nsip.
     * 
     * @return vipvsercount
     */
    public org.apache.axis.types.UnsignedInt getVipvsercount() {
        return vipvsercount;
    }


    /**
     * Sets the vipvsercount value for this Nsip.
     * 
     * @param vipvsercount
     */
    public void setVipvsercount(org.apache.axis.types.UnsignedInt vipvsercount) {
        this.vipvsercount = vipvsercount;
    }


    /**
     * Gets the vipvserdowncount value for this Nsip.
     * 
     * @return vipvserdowncount
     */
    public org.apache.axis.types.UnsignedInt getVipvserdowncount() {
        return vipvserdowncount;
    }


    /**
     * Sets the vipvserdowncount value for this Nsip.
     * 
     * @param vipvserdowncount
     */
    public void setVipvserdowncount(org.apache.axis.types.UnsignedInt vipvserdowncount) {
        this.vipvserdowncount = vipvserdowncount;
    }


    /**
     * Gets the ospflsatype value for this Nsip.
     * 
     * @return ospflsatype
     */
    public java.lang.String getOspflsatype() {
        return ospflsatype;
    }


    /**
     * Sets the ospflsatype value for this Nsip.
     * 
     * @param ospflsatype
     */
    public void setOspflsatype(java.lang.String ospflsatype) {
        this.ospflsatype = ospflsatype;
    }


    /**
     * Gets the state value for this Nsip.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Nsip.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the freeports value for this Nsip.
     * 
     * @return freeports
     */
    public org.apache.axis.types.UnsignedInt getFreeports() {
        return freeports;
    }


    /**
     * Sets the freeports value for this Nsip.
     * 
     * @param freeports
     */
    public void setFreeports(org.apache.axis.types.UnsignedInt freeports) {
        this.freeports = freeports;
    }


    /**
     * Gets the vrid value for this Nsip.
     * 
     * @return vrid
     */
    public org.apache.axis.types.UnsignedInt getVrid() {
        return vrid;
    }


    /**
     * Sets the vrid value for this Nsip.
     * 
     * @param vrid
     */
    public void setVrid(org.apache.axis.types.UnsignedInt vrid) {
        this.vrid = vrid;
    }


    /**
     * Gets the iptype value for this Nsip.
     * 
     * @return iptype
     */
    public java.lang.String getIptype() {
        return iptype;
    }


    /**
     * Sets the iptype value for this Nsip.
     * 
     * @param iptype
     */
    public void setIptype(java.lang.String iptype) {
        this.iptype = iptype;
    }


    /**
     * Gets the icmpresponse value for this Nsip.
     * 
     * @return icmpresponse
     */
    public java.lang.String getIcmpresponse() {
        return icmpresponse;
    }


    /**
     * Sets the icmpresponse value for this Nsip.
     * 
     * @param icmpresponse
     */
    public void setIcmpresponse(java.lang.String icmpresponse) {
        this.icmpresponse = icmpresponse;
    }


    /**
     * Gets the ownernode value for this Nsip.
     * 
     * @return ownernode
     */
    public org.apache.axis.types.UnsignedInt getOwnernode() {
        return ownernode;
    }


    /**
     * Sets the ownernode value for this Nsip.
     * 
     * @param ownernode
     */
    public void setOwnernode(org.apache.axis.types.UnsignedInt ownernode) {
        this.ownernode = ownernode;
    }


    /**
     * Gets the arpresponse value for this Nsip.
     * 
     * @return arpresponse
     */
    public java.lang.String getArpresponse() {
        return arpresponse;
    }


    /**
     * Sets the arpresponse value for this Nsip.
     * 
     * @param arpresponse
     */
    public void setArpresponse(java.lang.String arpresponse) {
        this.arpresponse = arpresponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nsip)) return false;
        Nsip other = (Nsip) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              this.ipaddress.equals(other.getIpaddress()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.netmask==null && other.getNetmask()==null) || 
             (this.netmask!=null &&
              this.netmask.equals(other.getNetmask()))) &&
            ((this.flags==null && other.getFlags()==null) || 
             (this.flags!=null &&
              this.flags.equals(other.getFlags()))) &&
            ((this.arp==null && other.getArp()==null) || 
             (this.arp!=null &&
              this.arp.equals(other.getArp()))) &&
            ((this.icmp==null && other.getIcmp()==null) || 
             (this.icmp!=null &&
              this.icmp.equals(other.getIcmp()))) &&
            ((this.vserver==null && other.getVserver()==null) || 
             (this.vserver!=null &&
              this.vserver.equals(other.getVserver()))) &&
            ((this.telnet==null && other.getTelnet()==null) || 
             (this.telnet!=null &&
              this.telnet.equals(other.getTelnet()))) &&
            ((this.ssh==null && other.getSsh()==null) || 
             (this.ssh!=null &&
              this.ssh.equals(other.getSsh()))) &&
            ((this.gui==null && other.getGui()==null) || 
             (this.gui!=null &&
              this.gui.equals(other.getGui()))) &&
            ((this.snmp==null && other.getSnmp()==null) || 
             (this.snmp!=null &&
              this.snmp.equals(other.getSnmp()))) &&
            ((this.ftp==null && other.getFtp()==null) || 
             (this.ftp!=null &&
              this.ftp.equals(other.getFtp()))) &&
            ((this.mgmtaccess==null && other.getMgmtaccess()==null) || 
             (this.mgmtaccess!=null &&
              this.mgmtaccess.equals(other.getMgmtaccess()))) &&
            ((this.restrictaccess==null && other.getRestrictaccess()==null) || 
             (this.restrictaccess!=null &&
              this.restrictaccess.equals(other.getRestrictaccess()))) &&
            ((this.dynamicrouting==null && other.getDynamicrouting()==null) || 
             (this.dynamicrouting!=null &&
              this.dynamicrouting.equals(other.getDynamicrouting()))) &&
            ((this.bgp==null && other.getBgp()==null) || 
             (this.bgp!=null &&
              this.bgp.equals(other.getBgp()))) &&
            ((this.ospf==null && other.getOspf()==null) || 
             (this.ospf!=null &&
              this.ospf.equals(other.getOspf()))) &&
            ((this.rip==null && other.getRip()==null) || 
             (this.rip!=null &&
              this.rip.equals(other.getRip()))) &&
            ((this.hostroute==null && other.getHostroute()==null) || 
             (this.hostroute!=null &&
              this.hostroute.equals(other.getHostroute()))) &&
            ((this.hostrtgw==null && other.getHostrtgw()==null) || 
             (this.hostrtgw!=null &&
              this.hostrtgw.equals(other.getHostrtgw()))) &&
            ((this.hostrtgwact==null && other.getHostrtgwact()==null) || 
             (this.hostrtgwact!=null &&
              this.hostrtgwact.equals(other.getHostrtgwact()))) &&
            this.metric == other.getMetric() &&
            this.ospfarea == other.getOspfarea() &&
            ((this.ospfareaval==null && other.getOspfareaval()==null) || 
             (this.ospfareaval!=null &&
              this.ospfareaval.equals(other.getOspfareaval()))) &&
            ((this.vserverrhilevel==null && other.getVserverrhilevel()==null) || 
             (this.vserverrhilevel!=null &&
              this.vserverrhilevel.equals(other.getVserverrhilevel()))) &&
            this.viprtadv2Bsd == other.isViprtadv2Bsd() &&
            ((this.vipvsercount==null && other.getVipvsercount()==null) || 
             (this.vipvsercount!=null &&
              this.vipvsercount.equals(other.getVipvsercount()))) &&
            ((this.vipvserdowncount==null && other.getVipvserdowncount()==null) || 
             (this.vipvserdowncount!=null &&
              this.vipvserdowncount.equals(other.getVipvserdowncount()))) &&
            ((this.ospflsatype==null && other.getOspflsatype()==null) || 
             (this.ospflsatype!=null &&
              this.ospflsatype.equals(other.getOspflsatype()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.freeports==null && other.getFreeports()==null) || 
             (this.freeports!=null &&
              this.freeports.equals(other.getFreeports()))) &&
            ((this.vrid==null && other.getVrid()==null) || 
             (this.vrid!=null &&
              this.vrid.equals(other.getVrid()))) &&
            ((this.iptype==null && other.getIptype()==null) || 
             (this.iptype!=null &&
              this.iptype.equals(other.getIptype()))) &&
            ((this.icmpresponse==null && other.getIcmpresponse()==null) || 
             (this.icmpresponse!=null &&
              this.icmpresponse.equals(other.getIcmpresponse()))) &&
            ((this.ownernode==null && other.getOwnernode()==null) || 
             (this.ownernode!=null &&
              this.ownernode.equals(other.getOwnernode()))) &&
            ((this.arpresponse==null && other.getArpresponse()==null) || 
             (this.arpresponse!=null &&
              this.arpresponse.equals(other.getArpresponse())));
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
        if (getIpaddress() != null) {
            _hashCode += getIpaddress().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getNetmask() != null) {
            _hashCode += getNetmask().hashCode();
        }
        if (getFlags() != null) {
            _hashCode += getFlags().hashCode();
        }
        if (getArp() != null) {
            _hashCode += getArp().hashCode();
        }
        if (getIcmp() != null) {
            _hashCode += getIcmp().hashCode();
        }
        if (getVserver() != null) {
            _hashCode += getVserver().hashCode();
        }
        if (getTelnet() != null) {
            _hashCode += getTelnet().hashCode();
        }
        if (getSsh() != null) {
            _hashCode += getSsh().hashCode();
        }
        if (getGui() != null) {
            _hashCode += getGui().hashCode();
        }
        if (getSnmp() != null) {
            _hashCode += getSnmp().hashCode();
        }
        if (getFtp() != null) {
            _hashCode += getFtp().hashCode();
        }
        if (getMgmtaccess() != null) {
            _hashCode += getMgmtaccess().hashCode();
        }
        if (getRestrictaccess() != null) {
            _hashCode += getRestrictaccess().hashCode();
        }
        if (getDynamicrouting() != null) {
            _hashCode += getDynamicrouting().hashCode();
        }
        if (getBgp() != null) {
            _hashCode += getBgp().hashCode();
        }
        if (getOspf() != null) {
            _hashCode += getOspf().hashCode();
        }
        if (getRip() != null) {
            _hashCode += getRip().hashCode();
        }
        if (getHostroute() != null) {
            _hashCode += getHostroute().hashCode();
        }
        if (getHostrtgw() != null) {
            _hashCode += getHostrtgw().hashCode();
        }
        if (getHostrtgwact() != null) {
            _hashCode += getHostrtgwact().hashCode();
        }
        _hashCode += getMetric();
        _hashCode += getOspfarea();
        if (getOspfareaval() != null) {
            _hashCode += getOspfareaval().hashCode();
        }
        if (getVserverrhilevel() != null) {
            _hashCode += getVserverrhilevel().hashCode();
        }
        _hashCode += (isViprtadv2Bsd() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getVipvsercount() != null) {
            _hashCode += getVipvsercount().hashCode();
        }
        if (getVipvserdowncount() != null) {
            _hashCode += getVipvserdowncount().hashCode();
        }
        if (getOspflsatype() != null) {
            _hashCode += getOspflsatype().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getFreeports() != null) {
            _hashCode += getFreeports().hashCode();
        }
        if (getVrid() != null) {
            _hashCode += getVrid().hashCode();
        }
        if (getIptype() != null) {
            _hashCode += getIptype().hashCode();
        }
        if (getIcmpresponse() != null) {
            _hashCode += getIcmpresponse().hashCode();
        }
        if (getOwnernode() != null) {
            _hashCode += getOwnernode().hashCode();
        }
        if (getArpresponse() != null) {
            _hashCode += getArpresponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nsip.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nsip"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipaddress"));
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
        elemField.setFieldName("netmask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netmask"));
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
        elemField.setFieldName("arp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icmp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "icmp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telnet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telnet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gui");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gui"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snmp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "snmp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ftp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ftp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mgmtaccess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mgmtaccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictaccess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "restrictaccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamicrouting");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dynamicrouting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bgp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bgp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ospf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ospf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostroute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostroute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostrtgw");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostrtgw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostrtgwact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostrtgwact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metric");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metric"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ospfarea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ospfarea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ospfareaval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ospfareaval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vserverrhilevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vserverrhilevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viprtadv2Bsd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viprtadv2bsd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vipvsercount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vipvsercount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vipvserdowncount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vipvserdowncount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ospflsatype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ospflsatype"));
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
        elemField.setFieldName("freeports");
        elemField.setXmlName(new javax.xml.namespace.QName("", "freeports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vrid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vrid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iptype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iptype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icmpresponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "icmpresponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownernode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownernode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arpresponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "arpresponse"));
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
