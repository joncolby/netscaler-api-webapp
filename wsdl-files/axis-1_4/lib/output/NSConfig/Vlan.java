/**
 * Vlan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Vlan  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt id;

    private java.lang.String aliasname;

    private java.lang.String[] ipaddress;

    private java.lang.String[] netmask;

    private java.lang.String linklocalipv6Addr;

    private boolean rnat;

    private org.apache.axis.types.UnsignedLong portbitmap;

    private org.apache.axis.types.UnsignedInt lsbitmap;

    private org.apache.axis.types.UnsignedLong tagbitmap;

    private org.apache.axis.types.UnsignedInt lstagbitmap;

    private java.lang.String ifaces;

    private java.lang.String tagifaces;

    private java.lang.String ipv6Dynamicrouting;

    private java.lang.String ifnum;

    private boolean tagged;

    private java.lang.String sdxvlan;

    private java.lang.String[] interfacE;

    private boolean[] taggedinterface;

    private java.lang.String[] channel;

    private boolean[] taggedchannel;

    private java.lang.String[] linkset;

    private boolean[] taggedlinkset;

    private java.lang.String[] ipv6Address;

    public Vlan() {
    }

    public Vlan(
           org.apache.axis.types.UnsignedInt id,
           java.lang.String aliasname,
           java.lang.String[] ipaddress,
           java.lang.String[] netmask,
           java.lang.String linklocalipv6Addr,
           boolean rnat,
           org.apache.axis.types.UnsignedLong portbitmap,
           org.apache.axis.types.UnsignedInt lsbitmap,
           org.apache.axis.types.UnsignedLong tagbitmap,
           org.apache.axis.types.UnsignedInt lstagbitmap,
           java.lang.String ifaces,
           java.lang.String tagifaces,
           java.lang.String ipv6Dynamicrouting,
           java.lang.String ifnum,
           boolean tagged,
           java.lang.String sdxvlan,
           java.lang.String[] interfacE,
           boolean[] taggedinterface,
           java.lang.String[] channel,
           boolean[] taggedchannel,
           java.lang.String[] linkset,
           boolean[] taggedlinkset,
           java.lang.String[] ipv6Address) {
           this.id = id;
           this.aliasname = aliasname;
           this.ipaddress = ipaddress;
           this.netmask = netmask;
           this.linklocalipv6Addr = linklocalipv6Addr;
           this.rnat = rnat;
           this.portbitmap = portbitmap;
           this.lsbitmap = lsbitmap;
           this.tagbitmap = tagbitmap;
           this.lstagbitmap = lstagbitmap;
           this.ifaces = ifaces;
           this.tagifaces = tagifaces;
           this.ipv6Dynamicrouting = ipv6Dynamicrouting;
           this.ifnum = ifnum;
           this.tagged = tagged;
           this.sdxvlan = sdxvlan;
           this.interfacE = interfacE;
           this.taggedinterface = taggedinterface;
           this.channel = channel;
           this.taggedchannel = taggedchannel;
           this.linkset = linkset;
           this.taggedlinkset = taggedlinkset;
           this.ipv6Address = ipv6Address;
    }


    /**
     * Gets the id value for this Vlan.
     * 
     * @return id
     */
    public org.apache.axis.types.UnsignedInt getId() {
        return id;
    }


    /**
     * Sets the id value for this Vlan.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.UnsignedInt id) {
        this.id = id;
    }


    /**
     * Gets the aliasname value for this Vlan.
     * 
     * @return aliasname
     */
    public java.lang.String getAliasname() {
        return aliasname;
    }


    /**
     * Sets the aliasname value for this Vlan.
     * 
     * @param aliasname
     */
    public void setAliasname(java.lang.String aliasname) {
        this.aliasname = aliasname;
    }


    /**
     * Gets the ipaddress value for this Vlan.
     * 
     * @return ipaddress
     */
    public java.lang.String[] getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Vlan.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String[] ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the netmask value for this Vlan.
     * 
     * @return netmask
     */
    public java.lang.String[] getNetmask() {
        return netmask;
    }


    /**
     * Sets the netmask value for this Vlan.
     * 
     * @param netmask
     */
    public void setNetmask(java.lang.String[] netmask) {
        this.netmask = netmask;
    }


    /**
     * Gets the linklocalipv6Addr value for this Vlan.
     * 
     * @return linklocalipv6Addr
     */
    public java.lang.String getLinklocalipv6Addr() {
        return linklocalipv6Addr;
    }


    /**
     * Sets the linklocalipv6Addr value for this Vlan.
     * 
     * @param linklocalipv6Addr
     */
    public void setLinklocalipv6Addr(java.lang.String linklocalipv6Addr) {
        this.linklocalipv6Addr = linklocalipv6Addr;
    }


    /**
     * Gets the rnat value for this Vlan.
     * 
     * @return rnat
     */
    public boolean isRnat() {
        return rnat;
    }


    /**
     * Sets the rnat value for this Vlan.
     * 
     * @param rnat
     */
    public void setRnat(boolean rnat) {
        this.rnat = rnat;
    }


    /**
     * Gets the portbitmap value for this Vlan.
     * 
     * @return portbitmap
     */
    public org.apache.axis.types.UnsignedLong getPortbitmap() {
        return portbitmap;
    }


    /**
     * Sets the portbitmap value for this Vlan.
     * 
     * @param portbitmap
     */
    public void setPortbitmap(org.apache.axis.types.UnsignedLong portbitmap) {
        this.portbitmap = portbitmap;
    }


    /**
     * Gets the lsbitmap value for this Vlan.
     * 
     * @return lsbitmap
     */
    public org.apache.axis.types.UnsignedInt getLsbitmap() {
        return lsbitmap;
    }


    /**
     * Sets the lsbitmap value for this Vlan.
     * 
     * @param lsbitmap
     */
    public void setLsbitmap(org.apache.axis.types.UnsignedInt lsbitmap) {
        this.lsbitmap = lsbitmap;
    }


    /**
     * Gets the tagbitmap value for this Vlan.
     * 
     * @return tagbitmap
     */
    public org.apache.axis.types.UnsignedLong getTagbitmap() {
        return tagbitmap;
    }


    /**
     * Sets the tagbitmap value for this Vlan.
     * 
     * @param tagbitmap
     */
    public void setTagbitmap(org.apache.axis.types.UnsignedLong tagbitmap) {
        this.tagbitmap = tagbitmap;
    }


    /**
     * Gets the lstagbitmap value for this Vlan.
     * 
     * @return lstagbitmap
     */
    public org.apache.axis.types.UnsignedInt getLstagbitmap() {
        return lstagbitmap;
    }


    /**
     * Sets the lstagbitmap value for this Vlan.
     * 
     * @param lstagbitmap
     */
    public void setLstagbitmap(org.apache.axis.types.UnsignedInt lstagbitmap) {
        this.lstagbitmap = lstagbitmap;
    }


    /**
     * Gets the ifaces value for this Vlan.
     * 
     * @return ifaces
     */
    public java.lang.String getIfaces() {
        return ifaces;
    }


    /**
     * Sets the ifaces value for this Vlan.
     * 
     * @param ifaces
     */
    public void setIfaces(java.lang.String ifaces) {
        this.ifaces = ifaces;
    }


    /**
     * Gets the tagifaces value for this Vlan.
     * 
     * @return tagifaces
     */
    public java.lang.String getTagifaces() {
        return tagifaces;
    }


    /**
     * Sets the tagifaces value for this Vlan.
     * 
     * @param tagifaces
     */
    public void setTagifaces(java.lang.String tagifaces) {
        this.tagifaces = tagifaces;
    }


    /**
     * Gets the ipv6Dynamicrouting value for this Vlan.
     * 
     * @return ipv6Dynamicrouting
     */
    public java.lang.String getIpv6Dynamicrouting() {
        return ipv6Dynamicrouting;
    }


    /**
     * Sets the ipv6Dynamicrouting value for this Vlan.
     * 
     * @param ipv6Dynamicrouting
     */
    public void setIpv6Dynamicrouting(java.lang.String ipv6Dynamicrouting) {
        this.ipv6Dynamicrouting = ipv6Dynamicrouting;
    }


    /**
     * Gets the ifnum value for this Vlan.
     * 
     * @return ifnum
     */
    public java.lang.String getIfnum() {
        return ifnum;
    }


    /**
     * Sets the ifnum value for this Vlan.
     * 
     * @param ifnum
     */
    public void setIfnum(java.lang.String ifnum) {
        this.ifnum = ifnum;
    }


    /**
     * Gets the tagged value for this Vlan.
     * 
     * @return tagged
     */
    public boolean isTagged() {
        return tagged;
    }


    /**
     * Sets the tagged value for this Vlan.
     * 
     * @param tagged
     */
    public void setTagged(boolean tagged) {
        this.tagged = tagged;
    }


    /**
     * Gets the sdxvlan value for this Vlan.
     * 
     * @return sdxvlan
     */
    public java.lang.String getSdxvlan() {
        return sdxvlan;
    }


    /**
     * Sets the sdxvlan value for this Vlan.
     * 
     * @param sdxvlan
     */
    public void setSdxvlan(java.lang.String sdxvlan) {
        this.sdxvlan = sdxvlan;
    }


    /**
     * Gets the interfacE value for this Vlan.
     * 
     * @return interfacE
     */
    public java.lang.String[] getInterfacE() {
        return interfacE;
    }


    /**
     * Sets the interfacE value for this Vlan.
     * 
     * @param interfacE
     */
    public void setInterfacE(java.lang.String[] interfacE) {
        this.interfacE = interfacE;
    }


    /**
     * Gets the taggedinterface value for this Vlan.
     * 
     * @return taggedinterface
     */
    public boolean[] getTaggedinterface() {
        return taggedinterface;
    }


    /**
     * Sets the taggedinterface value for this Vlan.
     * 
     * @param taggedinterface
     */
    public void setTaggedinterface(boolean[] taggedinterface) {
        this.taggedinterface = taggedinterface;
    }


    /**
     * Gets the channel value for this Vlan.
     * 
     * @return channel
     */
    public java.lang.String[] getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this Vlan.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String[] channel) {
        this.channel = channel;
    }


    /**
     * Gets the taggedchannel value for this Vlan.
     * 
     * @return taggedchannel
     */
    public boolean[] getTaggedchannel() {
        return taggedchannel;
    }


    /**
     * Sets the taggedchannel value for this Vlan.
     * 
     * @param taggedchannel
     */
    public void setTaggedchannel(boolean[] taggedchannel) {
        this.taggedchannel = taggedchannel;
    }


    /**
     * Gets the linkset value for this Vlan.
     * 
     * @return linkset
     */
    public java.lang.String[] getLinkset() {
        return linkset;
    }


    /**
     * Sets the linkset value for this Vlan.
     * 
     * @param linkset
     */
    public void setLinkset(java.lang.String[] linkset) {
        this.linkset = linkset;
    }


    /**
     * Gets the taggedlinkset value for this Vlan.
     * 
     * @return taggedlinkset
     */
    public boolean[] getTaggedlinkset() {
        return taggedlinkset;
    }


    /**
     * Sets the taggedlinkset value for this Vlan.
     * 
     * @param taggedlinkset
     */
    public void setTaggedlinkset(boolean[] taggedlinkset) {
        this.taggedlinkset = taggedlinkset;
    }


    /**
     * Gets the ipv6Address value for this Vlan.
     * 
     * @return ipv6Address
     */
    public java.lang.String[] getIpv6Address() {
        return ipv6Address;
    }


    /**
     * Sets the ipv6Address value for this Vlan.
     * 
     * @param ipv6Address
     */
    public void setIpv6Address(java.lang.String[] ipv6Address) {
        this.ipv6Address = ipv6Address;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Vlan)) return false;
        Vlan other = (Vlan) obj;
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
            ((this.aliasname==null && other.getAliasname()==null) || 
             (this.aliasname!=null &&
              this.aliasname.equals(other.getAliasname()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              java.util.Arrays.equals(this.ipaddress, other.getIpaddress()))) &&
            ((this.netmask==null && other.getNetmask()==null) || 
             (this.netmask!=null &&
              java.util.Arrays.equals(this.netmask, other.getNetmask()))) &&
            ((this.linklocalipv6Addr==null && other.getLinklocalipv6Addr()==null) || 
             (this.linklocalipv6Addr!=null &&
              this.linklocalipv6Addr.equals(other.getLinklocalipv6Addr()))) &&
            this.rnat == other.isRnat() &&
            ((this.portbitmap==null && other.getPortbitmap()==null) || 
             (this.portbitmap!=null &&
              this.portbitmap.equals(other.getPortbitmap()))) &&
            ((this.lsbitmap==null && other.getLsbitmap()==null) || 
             (this.lsbitmap!=null &&
              this.lsbitmap.equals(other.getLsbitmap()))) &&
            ((this.tagbitmap==null && other.getTagbitmap()==null) || 
             (this.tagbitmap!=null &&
              this.tagbitmap.equals(other.getTagbitmap()))) &&
            ((this.lstagbitmap==null && other.getLstagbitmap()==null) || 
             (this.lstagbitmap!=null &&
              this.lstagbitmap.equals(other.getLstagbitmap()))) &&
            ((this.ifaces==null && other.getIfaces()==null) || 
             (this.ifaces!=null &&
              this.ifaces.equals(other.getIfaces()))) &&
            ((this.tagifaces==null && other.getTagifaces()==null) || 
             (this.tagifaces!=null &&
              this.tagifaces.equals(other.getTagifaces()))) &&
            ((this.ipv6Dynamicrouting==null && other.getIpv6Dynamicrouting()==null) || 
             (this.ipv6Dynamicrouting!=null &&
              this.ipv6Dynamicrouting.equals(other.getIpv6Dynamicrouting()))) &&
            ((this.ifnum==null && other.getIfnum()==null) || 
             (this.ifnum!=null &&
              this.ifnum.equals(other.getIfnum()))) &&
            this.tagged == other.isTagged() &&
            ((this.sdxvlan==null && other.getSdxvlan()==null) || 
             (this.sdxvlan!=null &&
              this.sdxvlan.equals(other.getSdxvlan()))) &&
            ((this.interfacE==null && other.getInterfacE()==null) || 
             (this.interfacE!=null &&
              java.util.Arrays.equals(this.interfacE, other.getInterfacE()))) &&
            ((this.taggedinterface==null && other.getTaggedinterface()==null) || 
             (this.taggedinterface!=null &&
              java.util.Arrays.equals(this.taggedinterface, other.getTaggedinterface()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              java.util.Arrays.equals(this.channel, other.getChannel()))) &&
            ((this.taggedchannel==null && other.getTaggedchannel()==null) || 
             (this.taggedchannel!=null &&
              java.util.Arrays.equals(this.taggedchannel, other.getTaggedchannel()))) &&
            ((this.linkset==null && other.getLinkset()==null) || 
             (this.linkset!=null &&
              java.util.Arrays.equals(this.linkset, other.getLinkset()))) &&
            ((this.taggedlinkset==null && other.getTaggedlinkset()==null) || 
             (this.taggedlinkset!=null &&
              java.util.Arrays.equals(this.taggedlinkset, other.getTaggedlinkset()))) &&
            ((this.ipv6Address==null && other.getIpv6Address()==null) || 
             (this.ipv6Address!=null &&
              java.util.Arrays.equals(this.ipv6Address, other.getIpv6Address())));
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
        if (getAliasname() != null) {
            _hashCode += getAliasname().hashCode();
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
        if (getNetmask() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetmask());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetmask(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLinklocalipv6Addr() != null) {
            _hashCode += getLinklocalipv6Addr().hashCode();
        }
        _hashCode += (isRnat() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPortbitmap() != null) {
            _hashCode += getPortbitmap().hashCode();
        }
        if (getLsbitmap() != null) {
            _hashCode += getLsbitmap().hashCode();
        }
        if (getTagbitmap() != null) {
            _hashCode += getTagbitmap().hashCode();
        }
        if (getLstagbitmap() != null) {
            _hashCode += getLstagbitmap().hashCode();
        }
        if (getIfaces() != null) {
            _hashCode += getIfaces().hashCode();
        }
        if (getTagifaces() != null) {
            _hashCode += getTagifaces().hashCode();
        }
        if (getIpv6Dynamicrouting() != null) {
            _hashCode += getIpv6Dynamicrouting().hashCode();
        }
        if (getIfnum() != null) {
            _hashCode += getIfnum().hashCode();
        }
        _hashCode += (isTagged() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSdxvlan() != null) {
            _hashCode += getSdxvlan().hashCode();
        }
        if (getInterfacE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInterfacE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInterfacE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaggedinterface() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaggedinterface());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaggedinterface(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChannel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChannel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChannel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaggedchannel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaggedchannel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaggedchannel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLinkset() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLinkset());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLinkset(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaggedlinkset() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaggedlinkset());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaggedlinkset(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIpv6Address() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpv6Address());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpv6Address(), i);
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
        new org.apache.axis.description.TypeDesc(Vlan.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "vlan"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliasname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aliasname"));
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
        elemField.setFieldName("netmask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netmask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linklocalipv6Addr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linklocalipv6addr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rnat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rnat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portbitmap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "portbitmap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lsbitmap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lsbitmap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagbitmap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tagbitmap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lstagbitmap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lstagbitmap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ifaces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ifaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagifaces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tagifaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6Dynamicrouting");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipv6dynamicrouting"));
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
        elemField.setFieldName("tagged");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tagged"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sdxvlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sdxvlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interfacE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interfacE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taggedinterface");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taggedinterface"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taggedchannel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taggedchannel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taggedlinkset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taggedlinkset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6Address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipv6address"));
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
