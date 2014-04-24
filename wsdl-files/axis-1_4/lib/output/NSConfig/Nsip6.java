/**
 * Nsip6.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nsip6  implements java.io.Serializable {
    private java.lang.String ipv6Address;

    private java.lang.String scope;

    private java.lang.String type;

    private java.lang.String iptype;

    private org.apache.axis.types.UnsignedInt vlan;

    private java.lang.String nd;

    private java.lang.String icmp;

    private java.lang.String vserver;

    private java.lang.String telnet;

    private java.lang.String ssh;

    private java.lang.String gui;

    private java.lang.String snmp;

    private java.lang.String ftp;

    private java.lang.String mgmtaccess;

    private java.lang.String restrictaccess;

    private java.lang.String state;

    private java.lang.String state2;

    private java.lang.String map;

    private java.lang.String dynamicrouting;

    private java.lang.String hostroute;

    private java.lang.String ip6Hostrtgw;

    private int metric;

    private java.lang.String vserverrhilevel;

    private boolean viprtadv2Bsd;

    private org.apache.axis.types.UnsignedInt vipvsercount;

    private org.apache.axis.types.UnsignedInt vipvserdowncount;

    private java.lang.String ospf6Lsatype;

    private org.apache.axis.types.UnsignedInt ospfarea;

    private org.apache.axis.types.UnsignedInt ownernode;

    private java.lang.String systemtype;

    public Nsip6() {
    }

    public Nsip6(
           java.lang.String ipv6Address,
           java.lang.String scope,
           java.lang.String type,
           java.lang.String iptype,
           org.apache.axis.types.UnsignedInt vlan,
           java.lang.String nd,
           java.lang.String icmp,
           java.lang.String vserver,
           java.lang.String telnet,
           java.lang.String ssh,
           java.lang.String gui,
           java.lang.String snmp,
           java.lang.String ftp,
           java.lang.String mgmtaccess,
           java.lang.String restrictaccess,
           java.lang.String state,
           java.lang.String state2,
           java.lang.String map,
           java.lang.String dynamicrouting,
           java.lang.String hostroute,
           java.lang.String ip6Hostrtgw,
           int metric,
           java.lang.String vserverrhilevel,
           boolean viprtadv2Bsd,
           org.apache.axis.types.UnsignedInt vipvsercount,
           org.apache.axis.types.UnsignedInt vipvserdowncount,
           java.lang.String ospf6Lsatype,
           org.apache.axis.types.UnsignedInt ospfarea,
           org.apache.axis.types.UnsignedInt ownernode,
           java.lang.String systemtype) {
           this.ipv6Address = ipv6Address;
           this.scope = scope;
           this.type = type;
           this.iptype = iptype;
           this.vlan = vlan;
           this.nd = nd;
           this.icmp = icmp;
           this.vserver = vserver;
           this.telnet = telnet;
           this.ssh = ssh;
           this.gui = gui;
           this.snmp = snmp;
           this.ftp = ftp;
           this.mgmtaccess = mgmtaccess;
           this.restrictaccess = restrictaccess;
           this.state = state;
           this.state2 = state2;
           this.map = map;
           this.dynamicrouting = dynamicrouting;
           this.hostroute = hostroute;
           this.ip6Hostrtgw = ip6Hostrtgw;
           this.metric = metric;
           this.vserverrhilevel = vserverrhilevel;
           this.viprtadv2Bsd = viprtadv2Bsd;
           this.vipvsercount = vipvsercount;
           this.vipvserdowncount = vipvserdowncount;
           this.ospf6Lsatype = ospf6Lsatype;
           this.ospfarea = ospfarea;
           this.ownernode = ownernode;
           this.systemtype = systemtype;
    }


    /**
     * Gets the ipv6Address value for this Nsip6.
     * 
     * @return ipv6Address
     */
    public java.lang.String getIpv6Address() {
        return ipv6Address;
    }


    /**
     * Sets the ipv6Address value for this Nsip6.
     * 
     * @param ipv6Address
     */
    public void setIpv6Address(java.lang.String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }


    /**
     * Gets the scope value for this Nsip6.
     * 
     * @return scope
     */
    public java.lang.String getScope() {
        return scope;
    }


    /**
     * Sets the scope value for this Nsip6.
     * 
     * @param scope
     */
    public void setScope(java.lang.String scope) {
        this.scope = scope;
    }


    /**
     * Gets the type value for this Nsip6.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Nsip6.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the iptype value for this Nsip6.
     * 
     * @return iptype
     */
    public java.lang.String getIptype() {
        return iptype;
    }


    /**
     * Sets the iptype value for this Nsip6.
     * 
     * @param iptype
     */
    public void setIptype(java.lang.String iptype) {
        this.iptype = iptype;
    }


    /**
     * Gets the vlan value for this Nsip6.
     * 
     * @return vlan
     */
    public org.apache.axis.types.UnsignedInt getVlan() {
        return vlan;
    }


    /**
     * Sets the vlan value for this Nsip6.
     * 
     * @param vlan
     */
    public void setVlan(org.apache.axis.types.UnsignedInt vlan) {
        this.vlan = vlan;
    }


    /**
     * Gets the nd value for this Nsip6.
     * 
     * @return nd
     */
    public java.lang.String getNd() {
        return nd;
    }


    /**
     * Sets the nd value for this Nsip6.
     * 
     * @param nd
     */
    public void setNd(java.lang.String nd) {
        this.nd = nd;
    }


    /**
     * Gets the icmp value for this Nsip6.
     * 
     * @return icmp
     */
    public java.lang.String getIcmp() {
        return icmp;
    }


    /**
     * Sets the icmp value for this Nsip6.
     * 
     * @param icmp
     */
    public void setIcmp(java.lang.String icmp) {
        this.icmp = icmp;
    }


    /**
     * Gets the vserver value for this Nsip6.
     * 
     * @return vserver
     */
    public java.lang.String getVserver() {
        return vserver;
    }


    /**
     * Sets the vserver value for this Nsip6.
     * 
     * @param vserver
     */
    public void setVserver(java.lang.String vserver) {
        this.vserver = vserver;
    }


    /**
     * Gets the telnet value for this Nsip6.
     * 
     * @return telnet
     */
    public java.lang.String getTelnet() {
        return telnet;
    }


    /**
     * Sets the telnet value for this Nsip6.
     * 
     * @param telnet
     */
    public void setTelnet(java.lang.String telnet) {
        this.telnet = telnet;
    }


    /**
     * Gets the ssh value for this Nsip6.
     * 
     * @return ssh
     */
    public java.lang.String getSsh() {
        return ssh;
    }


    /**
     * Sets the ssh value for this Nsip6.
     * 
     * @param ssh
     */
    public void setSsh(java.lang.String ssh) {
        this.ssh = ssh;
    }


    /**
     * Gets the gui value for this Nsip6.
     * 
     * @return gui
     */
    public java.lang.String getGui() {
        return gui;
    }


    /**
     * Sets the gui value for this Nsip6.
     * 
     * @param gui
     */
    public void setGui(java.lang.String gui) {
        this.gui = gui;
    }


    /**
     * Gets the snmp value for this Nsip6.
     * 
     * @return snmp
     */
    public java.lang.String getSnmp() {
        return snmp;
    }


    /**
     * Sets the snmp value for this Nsip6.
     * 
     * @param snmp
     */
    public void setSnmp(java.lang.String snmp) {
        this.snmp = snmp;
    }


    /**
     * Gets the ftp value for this Nsip6.
     * 
     * @return ftp
     */
    public java.lang.String getFtp() {
        return ftp;
    }


    /**
     * Sets the ftp value for this Nsip6.
     * 
     * @param ftp
     */
    public void setFtp(java.lang.String ftp) {
        this.ftp = ftp;
    }


    /**
     * Gets the mgmtaccess value for this Nsip6.
     * 
     * @return mgmtaccess
     */
    public java.lang.String getMgmtaccess() {
        return mgmtaccess;
    }


    /**
     * Sets the mgmtaccess value for this Nsip6.
     * 
     * @param mgmtaccess
     */
    public void setMgmtaccess(java.lang.String mgmtaccess) {
        this.mgmtaccess = mgmtaccess;
    }


    /**
     * Gets the restrictaccess value for this Nsip6.
     * 
     * @return restrictaccess
     */
    public java.lang.String getRestrictaccess() {
        return restrictaccess;
    }


    /**
     * Sets the restrictaccess value for this Nsip6.
     * 
     * @param restrictaccess
     */
    public void setRestrictaccess(java.lang.String restrictaccess) {
        this.restrictaccess = restrictaccess;
    }


    /**
     * Gets the state value for this Nsip6.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Nsip6.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the state2 value for this Nsip6.
     * 
     * @return state2
     */
    public java.lang.String getState2() {
        return state2;
    }


    /**
     * Sets the state2 value for this Nsip6.
     * 
     * @param state2
     */
    public void setState2(java.lang.String state2) {
        this.state2 = state2;
    }


    /**
     * Gets the map value for this Nsip6.
     * 
     * @return map
     */
    public java.lang.String getMap() {
        return map;
    }


    /**
     * Sets the map value for this Nsip6.
     * 
     * @param map
     */
    public void setMap(java.lang.String map) {
        this.map = map;
    }


    /**
     * Gets the dynamicrouting value for this Nsip6.
     * 
     * @return dynamicrouting
     */
    public java.lang.String getDynamicrouting() {
        return dynamicrouting;
    }


    /**
     * Sets the dynamicrouting value for this Nsip6.
     * 
     * @param dynamicrouting
     */
    public void setDynamicrouting(java.lang.String dynamicrouting) {
        this.dynamicrouting = dynamicrouting;
    }


    /**
     * Gets the hostroute value for this Nsip6.
     * 
     * @return hostroute
     */
    public java.lang.String getHostroute() {
        return hostroute;
    }


    /**
     * Sets the hostroute value for this Nsip6.
     * 
     * @param hostroute
     */
    public void setHostroute(java.lang.String hostroute) {
        this.hostroute = hostroute;
    }


    /**
     * Gets the ip6Hostrtgw value for this Nsip6.
     * 
     * @return ip6Hostrtgw
     */
    public java.lang.String getIp6Hostrtgw() {
        return ip6Hostrtgw;
    }


    /**
     * Sets the ip6Hostrtgw value for this Nsip6.
     * 
     * @param ip6Hostrtgw
     */
    public void setIp6Hostrtgw(java.lang.String ip6Hostrtgw) {
        this.ip6Hostrtgw = ip6Hostrtgw;
    }


    /**
     * Gets the metric value for this Nsip6.
     * 
     * @return metric
     */
    public int getMetric() {
        return metric;
    }


    /**
     * Sets the metric value for this Nsip6.
     * 
     * @param metric
     */
    public void setMetric(int metric) {
        this.metric = metric;
    }


    /**
     * Gets the vserverrhilevel value for this Nsip6.
     * 
     * @return vserverrhilevel
     */
    public java.lang.String getVserverrhilevel() {
        return vserverrhilevel;
    }


    /**
     * Sets the vserverrhilevel value for this Nsip6.
     * 
     * @param vserverrhilevel
     */
    public void setVserverrhilevel(java.lang.String vserverrhilevel) {
        this.vserverrhilevel = vserverrhilevel;
    }


    /**
     * Gets the viprtadv2Bsd value for this Nsip6.
     * 
     * @return viprtadv2Bsd
     */
    public boolean isViprtadv2Bsd() {
        return viprtadv2Bsd;
    }


    /**
     * Sets the viprtadv2Bsd value for this Nsip6.
     * 
     * @param viprtadv2Bsd
     */
    public void setViprtadv2Bsd(boolean viprtadv2Bsd) {
        this.viprtadv2Bsd = viprtadv2Bsd;
    }


    /**
     * Gets the vipvsercount value for this Nsip6.
     * 
     * @return vipvsercount
     */
    public org.apache.axis.types.UnsignedInt getVipvsercount() {
        return vipvsercount;
    }


    /**
     * Sets the vipvsercount value for this Nsip6.
     * 
     * @param vipvsercount
     */
    public void setVipvsercount(org.apache.axis.types.UnsignedInt vipvsercount) {
        this.vipvsercount = vipvsercount;
    }


    /**
     * Gets the vipvserdowncount value for this Nsip6.
     * 
     * @return vipvserdowncount
     */
    public org.apache.axis.types.UnsignedInt getVipvserdowncount() {
        return vipvserdowncount;
    }


    /**
     * Sets the vipvserdowncount value for this Nsip6.
     * 
     * @param vipvserdowncount
     */
    public void setVipvserdowncount(org.apache.axis.types.UnsignedInt vipvserdowncount) {
        this.vipvserdowncount = vipvserdowncount;
    }


    /**
     * Gets the ospf6Lsatype value for this Nsip6.
     * 
     * @return ospf6Lsatype
     */
    public java.lang.String getOspf6Lsatype() {
        return ospf6Lsatype;
    }


    /**
     * Sets the ospf6Lsatype value for this Nsip6.
     * 
     * @param ospf6Lsatype
     */
    public void setOspf6Lsatype(java.lang.String ospf6Lsatype) {
        this.ospf6Lsatype = ospf6Lsatype;
    }


    /**
     * Gets the ospfarea value for this Nsip6.
     * 
     * @return ospfarea
     */
    public org.apache.axis.types.UnsignedInt getOspfarea() {
        return ospfarea;
    }


    /**
     * Sets the ospfarea value for this Nsip6.
     * 
     * @param ospfarea
     */
    public void setOspfarea(org.apache.axis.types.UnsignedInt ospfarea) {
        this.ospfarea = ospfarea;
    }


    /**
     * Gets the ownernode value for this Nsip6.
     * 
     * @return ownernode
     */
    public org.apache.axis.types.UnsignedInt getOwnernode() {
        return ownernode;
    }


    /**
     * Sets the ownernode value for this Nsip6.
     * 
     * @param ownernode
     */
    public void setOwnernode(org.apache.axis.types.UnsignedInt ownernode) {
        this.ownernode = ownernode;
    }


    /**
     * Gets the systemtype value for this Nsip6.
     * 
     * @return systemtype
     */
    public java.lang.String getSystemtype() {
        return systemtype;
    }


    /**
     * Sets the systemtype value for this Nsip6.
     * 
     * @param systemtype
     */
    public void setSystemtype(java.lang.String systemtype) {
        this.systemtype = systemtype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nsip6)) return false;
        Nsip6 other = (Nsip6) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ipv6Address==null && other.getIpv6Address()==null) || 
             (this.ipv6Address!=null &&
              this.ipv6Address.equals(other.getIpv6Address()))) &&
            ((this.scope==null && other.getScope()==null) || 
             (this.scope!=null &&
              this.scope.equals(other.getScope()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.iptype==null && other.getIptype()==null) || 
             (this.iptype!=null &&
              this.iptype.equals(other.getIptype()))) &&
            ((this.vlan==null && other.getVlan()==null) || 
             (this.vlan!=null &&
              this.vlan.equals(other.getVlan()))) &&
            ((this.nd==null && other.getNd()==null) || 
             (this.nd!=null &&
              this.nd.equals(other.getNd()))) &&
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
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.state2==null && other.getState2()==null) || 
             (this.state2!=null &&
              this.state2.equals(other.getState2()))) &&
            ((this.map==null && other.getMap()==null) || 
             (this.map!=null &&
              this.map.equals(other.getMap()))) &&
            ((this.dynamicrouting==null && other.getDynamicrouting()==null) || 
             (this.dynamicrouting!=null &&
              this.dynamicrouting.equals(other.getDynamicrouting()))) &&
            ((this.hostroute==null && other.getHostroute()==null) || 
             (this.hostroute!=null &&
              this.hostroute.equals(other.getHostroute()))) &&
            ((this.ip6Hostrtgw==null && other.getIp6Hostrtgw()==null) || 
             (this.ip6Hostrtgw!=null &&
              this.ip6Hostrtgw.equals(other.getIp6Hostrtgw()))) &&
            this.metric == other.getMetric() &&
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
            ((this.ospf6Lsatype==null && other.getOspf6Lsatype()==null) || 
             (this.ospf6Lsatype!=null &&
              this.ospf6Lsatype.equals(other.getOspf6Lsatype()))) &&
            ((this.ospfarea==null && other.getOspfarea()==null) || 
             (this.ospfarea!=null &&
              this.ospfarea.equals(other.getOspfarea()))) &&
            ((this.ownernode==null && other.getOwnernode()==null) || 
             (this.ownernode!=null &&
              this.ownernode.equals(other.getOwnernode()))) &&
            ((this.systemtype==null && other.getSystemtype()==null) || 
             (this.systemtype!=null &&
              this.systemtype.equals(other.getSystemtype())));
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
        if (getIpv6Address() != null) {
            _hashCode += getIpv6Address().hashCode();
        }
        if (getScope() != null) {
            _hashCode += getScope().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getIptype() != null) {
            _hashCode += getIptype().hashCode();
        }
        if (getVlan() != null) {
            _hashCode += getVlan().hashCode();
        }
        if (getNd() != null) {
            _hashCode += getNd().hashCode();
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
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getState2() != null) {
            _hashCode += getState2().hashCode();
        }
        if (getMap() != null) {
            _hashCode += getMap().hashCode();
        }
        if (getDynamicrouting() != null) {
            _hashCode += getDynamicrouting().hashCode();
        }
        if (getHostroute() != null) {
            _hashCode += getHostroute().hashCode();
        }
        if (getIp6Hostrtgw() != null) {
            _hashCode += getIp6Hostrtgw().hashCode();
        }
        _hashCode += getMetric();
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
        if (getOspf6Lsatype() != null) {
            _hashCode += getOspf6Lsatype().hashCode();
        }
        if (getOspfarea() != null) {
            _hashCode += getOspfarea().hashCode();
        }
        if (getOwnernode() != null) {
            _hashCode += getOwnernode().hashCode();
        }
        if (getSystemtype() != null) {
            _hashCode += getSystemtype().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nsip6.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nsip6"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6Address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipv6address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scope"));
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
        elemField.setFieldName("iptype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iptype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nd"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state2"));
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
        elemField.setFieldName("dynamicrouting");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dynamicrouting"));
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
        elemField.setFieldName("ip6Hostrtgw");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip6hostrtgw"));
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
        elemField.setFieldName("ospf6Lsatype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ospf6lsatype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ospfarea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ospfarea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ownernode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ownernode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "systemtype"));
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
