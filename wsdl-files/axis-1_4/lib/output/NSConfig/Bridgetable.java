/**
 * Bridgetable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Bridgetable  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt bridgeage;

    private java.lang.String mac;

    private java.lang.String ifnum;

    private org.apache.axis.types.UnsignedInt vlan;

    private org.apache.axis.types.UnsignedInt channel;

    public Bridgetable() {
    }

    public Bridgetable(
           org.apache.axis.types.UnsignedInt bridgeage,
           java.lang.String mac,
           java.lang.String ifnum,
           org.apache.axis.types.UnsignedInt vlan,
           org.apache.axis.types.UnsignedInt channel) {
           this.bridgeage = bridgeage;
           this.mac = mac;
           this.ifnum = ifnum;
           this.vlan = vlan;
           this.channel = channel;
    }


    /**
     * Gets the bridgeage value for this Bridgetable.
     * 
     * @return bridgeage
     */
    public org.apache.axis.types.UnsignedInt getBridgeage() {
        return bridgeage;
    }


    /**
     * Sets the bridgeage value for this Bridgetable.
     * 
     * @param bridgeage
     */
    public void setBridgeage(org.apache.axis.types.UnsignedInt bridgeage) {
        this.bridgeage = bridgeage;
    }


    /**
     * Gets the mac value for this Bridgetable.
     * 
     * @return mac
     */
    public java.lang.String getMac() {
        return mac;
    }


    /**
     * Sets the mac value for this Bridgetable.
     * 
     * @param mac
     */
    public void setMac(java.lang.String mac) {
        this.mac = mac;
    }


    /**
     * Gets the ifnum value for this Bridgetable.
     * 
     * @return ifnum
     */
    public java.lang.String getIfnum() {
        return ifnum;
    }


    /**
     * Sets the ifnum value for this Bridgetable.
     * 
     * @param ifnum
     */
    public void setIfnum(java.lang.String ifnum) {
        this.ifnum = ifnum;
    }


    /**
     * Gets the vlan value for this Bridgetable.
     * 
     * @return vlan
     */
    public org.apache.axis.types.UnsignedInt getVlan() {
        return vlan;
    }


    /**
     * Sets the vlan value for this Bridgetable.
     * 
     * @param vlan
     */
    public void setVlan(org.apache.axis.types.UnsignedInt vlan) {
        this.vlan = vlan;
    }


    /**
     * Gets the channel value for this Bridgetable.
     * 
     * @return channel
     */
    public org.apache.axis.types.UnsignedInt getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this Bridgetable.
     * 
     * @param channel
     */
    public void setChannel(org.apache.axis.types.UnsignedInt channel) {
        this.channel = channel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Bridgetable)) return false;
        Bridgetable other = (Bridgetable) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bridgeage==null && other.getBridgeage()==null) || 
             (this.bridgeage!=null &&
              this.bridgeage.equals(other.getBridgeage()))) &&
            ((this.mac==null && other.getMac()==null) || 
             (this.mac!=null &&
              this.mac.equals(other.getMac()))) &&
            ((this.ifnum==null && other.getIfnum()==null) || 
             (this.ifnum!=null &&
              this.ifnum.equals(other.getIfnum()))) &&
            ((this.vlan==null && other.getVlan()==null) || 
             (this.vlan!=null &&
              this.vlan.equals(other.getVlan()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel())));
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
        if (getBridgeage() != null) {
            _hashCode += getBridgeage().hashCode();
        }
        if (getMac() != null) {
            _hashCode += getMac().hashCode();
        }
        if (getIfnum() != null) {
            _hashCode += getIfnum().hashCode();
        }
        if (getVlan() != null) {
            _hashCode += getVlan().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Bridgetable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "bridgetable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bridgeage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bridgeage"));
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
        elemField.setFieldName("ifnum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ifnum"));
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
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channel"));
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
