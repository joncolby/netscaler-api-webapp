/**
 * Bridgegroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Bridgegroup  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt id;

    private java.lang.String[] ipaddress;

    private java.lang.String[] netmask;

    private boolean flags;

    private org.apache.axis.types.UnsignedLong portbitmap;

    private org.apache.axis.types.UnsignedLong tagbitmap;

    private java.lang.String ifaces;

    private java.lang.String tagifaces;

    private org.apache.axis.types.UnsignedInt[] vlan;

    private java.lang.String ipv6Dynamicrouting;

    private boolean rnat;

    private boolean[] boundvlanrnat;

    private boolean[] boundiprnat;

    public Bridgegroup() {
    }

    public Bridgegroup(
           org.apache.axis.types.UnsignedInt id,
           java.lang.String[] ipaddress,
           java.lang.String[] netmask,
           boolean flags,
           org.apache.axis.types.UnsignedLong portbitmap,
           org.apache.axis.types.UnsignedLong tagbitmap,
           java.lang.String ifaces,
           java.lang.String tagifaces,
           org.apache.axis.types.UnsignedInt[] vlan,
           java.lang.String ipv6Dynamicrouting,
           boolean rnat,
           boolean[] boundvlanrnat,
           boolean[] boundiprnat) {
           this.id = id;
           this.ipaddress = ipaddress;
           this.netmask = netmask;
           this.flags = flags;
           this.portbitmap = portbitmap;
           this.tagbitmap = tagbitmap;
           this.ifaces = ifaces;
           this.tagifaces = tagifaces;
           this.vlan = vlan;
           this.ipv6Dynamicrouting = ipv6Dynamicrouting;
           this.rnat = rnat;
           this.boundvlanrnat = boundvlanrnat;
           this.boundiprnat = boundiprnat;
    }


    /**
     * Gets the id value for this Bridgegroup.
     * 
     * @return id
     */
    public org.apache.axis.types.UnsignedInt getId() {
        return id;
    }


    /**
     * Sets the id value for this Bridgegroup.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.UnsignedInt id) {
        this.id = id;
    }


    /**
     * Gets the ipaddress value for this Bridgegroup.
     * 
     * @return ipaddress
     */
    public java.lang.String[] getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Bridgegroup.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String[] ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the netmask value for this Bridgegroup.
     * 
     * @return netmask
     */
    public java.lang.String[] getNetmask() {
        return netmask;
    }


    /**
     * Sets the netmask value for this Bridgegroup.
     * 
     * @param netmask
     */
    public void setNetmask(java.lang.String[] netmask) {
        this.netmask = netmask;
    }


    /**
     * Gets the flags value for this Bridgegroup.
     * 
     * @return flags
     */
    public boolean isFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this Bridgegroup.
     * 
     * @param flags
     */
    public void setFlags(boolean flags) {
        this.flags = flags;
    }


    /**
     * Gets the portbitmap value for this Bridgegroup.
     * 
     * @return portbitmap
     */
    public org.apache.axis.types.UnsignedLong getPortbitmap() {
        return portbitmap;
    }


    /**
     * Sets the portbitmap value for this Bridgegroup.
     * 
     * @param portbitmap
     */
    public void setPortbitmap(org.apache.axis.types.UnsignedLong portbitmap) {
        this.portbitmap = portbitmap;
    }


    /**
     * Gets the tagbitmap value for this Bridgegroup.
     * 
     * @return tagbitmap
     */
    public org.apache.axis.types.UnsignedLong getTagbitmap() {
        return tagbitmap;
    }


    /**
     * Sets the tagbitmap value for this Bridgegroup.
     * 
     * @param tagbitmap
     */
    public void setTagbitmap(org.apache.axis.types.UnsignedLong tagbitmap) {
        this.tagbitmap = tagbitmap;
    }


    /**
     * Gets the ifaces value for this Bridgegroup.
     * 
     * @return ifaces
     */
    public java.lang.String getIfaces() {
        return ifaces;
    }


    /**
     * Sets the ifaces value for this Bridgegroup.
     * 
     * @param ifaces
     */
    public void setIfaces(java.lang.String ifaces) {
        this.ifaces = ifaces;
    }


    /**
     * Gets the tagifaces value for this Bridgegroup.
     * 
     * @return tagifaces
     */
    public java.lang.String getTagifaces() {
        return tagifaces;
    }


    /**
     * Sets the tagifaces value for this Bridgegroup.
     * 
     * @param tagifaces
     */
    public void setTagifaces(java.lang.String tagifaces) {
        this.tagifaces = tagifaces;
    }


    /**
     * Gets the vlan value for this Bridgegroup.
     * 
     * @return vlan
     */
    public org.apache.axis.types.UnsignedInt[] getVlan() {
        return vlan;
    }


    /**
     * Sets the vlan value for this Bridgegroup.
     * 
     * @param vlan
     */
    public void setVlan(org.apache.axis.types.UnsignedInt[] vlan) {
        this.vlan = vlan;
    }


    /**
     * Gets the ipv6Dynamicrouting value for this Bridgegroup.
     * 
     * @return ipv6Dynamicrouting
     */
    public java.lang.String getIpv6Dynamicrouting() {
        return ipv6Dynamicrouting;
    }


    /**
     * Sets the ipv6Dynamicrouting value for this Bridgegroup.
     * 
     * @param ipv6Dynamicrouting
     */
    public void setIpv6Dynamicrouting(java.lang.String ipv6Dynamicrouting) {
        this.ipv6Dynamicrouting = ipv6Dynamicrouting;
    }


    /**
     * Gets the rnat value for this Bridgegroup.
     * 
     * @return rnat
     */
    public boolean isRnat() {
        return rnat;
    }


    /**
     * Sets the rnat value for this Bridgegroup.
     * 
     * @param rnat
     */
    public void setRnat(boolean rnat) {
        this.rnat = rnat;
    }


    /**
     * Gets the boundvlanrnat value for this Bridgegroup.
     * 
     * @return boundvlanrnat
     */
    public boolean[] getBoundvlanrnat() {
        return boundvlanrnat;
    }


    /**
     * Sets the boundvlanrnat value for this Bridgegroup.
     * 
     * @param boundvlanrnat
     */
    public void setBoundvlanrnat(boolean[] boundvlanrnat) {
        this.boundvlanrnat = boundvlanrnat;
    }


    /**
     * Gets the boundiprnat value for this Bridgegroup.
     * 
     * @return boundiprnat
     */
    public boolean[] getBoundiprnat() {
        return boundiprnat;
    }


    /**
     * Sets the boundiprnat value for this Bridgegroup.
     * 
     * @param boundiprnat
     */
    public void setBoundiprnat(boolean[] boundiprnat) {
        this.boundiprnat = boundiprnat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Bridgegroup)) return false;
        Bridgegroup other = (Bridgegroup) obj;
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
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              java.util.Arrays.equals(this.ipaddress, other.getIpaddress()))) &&
            ((this.netmask==null && other.getNetmask()==null) || 
             (this.netmask!=null &&
              java.util.Arrays.equals(this.netmask, other.getNetmask()))) &&
            this.flags == other.isFlags() &&
            ((this.portbitmap==null && other.getPortbitmap()==null) || 
             (this.portbitmap!=null &&
              this.portbitmap.equals(other.getPortbitmap()))) &&
            ((this.tagbitmap==null && other.getTagbitmap()==null) || 
             (this.tagbitmap!=null &&
              this.tagbitmap.equals(other.getTagbitmap()))) &&
            ((this.ifaces==null && other.getIfaces()==null) || 
             (this.ifaces!=null &&
              this.ifaces.equals(other.getIfaces()))) &&
            ((this.tagifaces==null && other.getTagifaces()==null) || 
             (this.tagifaces!=null &&
              this.tagifaces.equals(other.getTagifaces()))) &&
            ((this.vlan==null && other.getVlan()==null) || 
             (this.vlan!=null &&
              java.util.Arrays.equals(this.vlan, other.getVlan()))) &&
            ((this.ipv6Dynamicrouting==null && other.getIpv6Dynamicrouting()==null) || 
             (this.ipv6Dynamicrouting!=null &&
              this.ipv6Dynamicrouting.equals(other.getIpv6Dynamicrouting()))) &&
            this.rnat == other.isRnat() &&
            ((this.boundvlanrnat==null && other.getBoundvlanrnat()==null) || 
             (this.boundvlanrnat!=null &&
              java.util.Arrays.equals(this.boundvlanrnat, other.getBoundvlanrnat()))) &&
            ((this.boundiprnat==null && other.getBoundiprnat()==null) || 
             (this.boundiprnat!=null &&
              java.util.Arrays.equals(this.boundiprnat, other.getBoundiprnat())));
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
        _hashCode += (isFlags() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPortbitmap() != null) {
            _hashCode += getPortbitmap().hashCode();
        }
        if (getTagbitmap() != null) {
            _hashCode += getTagbitmap().hashCode();
        }
        if (getIfaces() != null) {
            _hashCode += getIfaces().hashCode();
        }
        if (getTagifaces() != null) {
            _hashCode += getTagifaces().hashCode();
        }
        if (getVlan() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVlan());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVlan(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIpv6Dynamicrouting() != null) {
            _hashCode += getIpv6Dynamicrouting().hashCode();
        }
        _hashCode += (isRnat() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBoundvlanrnat() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundvlanrnat());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundvlanrnat(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBoundiprnat() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundiprnat());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundiprnat(), i);
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
        new org.apache.axis.description.TypeDesc(Bridgegroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "bridgegroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
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
        elemField.setFieldName("netmask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netmask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flags"));
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
        elemField.setFieldName("tagbitmap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tagbitmap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
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
        elemField.setFieldName("vlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6Dynamicrouting");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipv6dynamicrouting"));
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
        elemField.setFieldName("boundvlanrnat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundvlanrnat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundiprnat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundiprnat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
