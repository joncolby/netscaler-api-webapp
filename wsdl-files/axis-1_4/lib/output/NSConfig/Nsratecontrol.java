/**
 * Nsratecontrol.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nsratecontrol  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt tcpthreshold;

    private org.apache.axis.types.UnsignedInt udpthreshold;

    private org.apache.axis.types.UnsignedInt icmpthreshold;

    private org.apache.axis.types.UnsignedInt tcprstthreshold;

    public Nsratecontrol() {
    }

    public Nsratecontrol(
           org.apache.axis.types.UnsignedInt tcpthreshold,
           org.apache.axis.types.UnsignedInt udpthreshold,
           org.apache.axis.types.UnsignedInt icmpthreshold,
           org.apache.axis.types.UnsignedInt tcprstthreshold) {
           this.tcpthreshold = tcpthreshold;
           this.udpthreshold = udpthreshold;
           this.icmpthreshold = icmpthreshold;
           this.tcprstthreshold = tcprstthreshold;
    }


    /**
     * Gets the tcpthreshold value for this Nsratecontrol.
     * 
     * @return tcpthreshold
     */
    public org.apache.axis.types.UnsignedInt getTcpthreshold() {
        return tcpthreshold;
    }


    /**
     * Sets the tcpthreshold value for this Nsratecontrol.
     * 
     * @param tcpthreshold
     */
    public void setTcpthreshold(org.apache.axis.types.UnsignedInt tcpthreshold) {
        this.tcpthreshold = tcpthreshold;
    }


    /**
     * Gets the udpthreshold value for this Nsratecontrol.
     * 
     * @return udpthreshold
     */
    public org.apache.axis.types.UnsignedInt getUdpthreshold() {
        return udpthreshold;
    }


    /**
     * Sets the udpthreshold value for this Nsratecontrol.
     * 
     * @param udpthreshold
     */
    public void setUdpthreshold(org.apache.axis.types.UnsignedInt udpthreshold) {
        this.udpthreshold = udpthreshold;
    }


    /**
     * Gets the icmpthreshold value for this Nsratecontrol.
     * 
     * @return icmpthreshold
     */
    public org.apache.axis.types.UnsignedInt getIcmpthreshold() {
        return icmpthreshold;
    }


    /**
     * Sets the icmpthreshold value for this Nsratecontrol.
     * 
     * @param icmpthreshold
     */
    public void setIcmpthreshold(org.apache.axis.types.UnsignedInt icmpthreshold) {
        this.icmpthreshold = icmpthreshold;
    }


    /**
     * Gets the tcprstthreshold value for this Nsratecontrol.
     * 
     * @return tcprstthreshold
     */
    public org.apache.axis.types.UnsignedInt getTcprstthreshold() {
        return tcprstthreshold;
    }


    /**
     * Sets the tcprstthreshold value for this Nsratecontrol.
     * 
     * @param tcprstthreshold
     */
    public void setTcprstthreshold(org.apache.axis.types.UnsignedInt tcprstthreshold) {
        this.tcprstthreshold = tcprstthreshold;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nsratecontrol)) return false;
        Nsratecontrol other = (Nsratecontrol) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tcpthreshold==null && other.getTcpthreshold()==null) || 
             (this.tcpthreshold!=null &&
              this.tcpthreshold.equals(other.getTcpthreshold()))) &&
            ((this.udpthreshold==null && other.getUdpthreshold()==null) || 
             (this.udpthreshold!=null &&
              this.udpthreshold.equals(other.getUdpthreshold()))) &&
            ((this.icmpthreshold==null && other.getIcmpthreshold()==null) || 
             (this.icmpthreshold!=null &&
              this.icmpthreshold.equals(other.getIcmpthreshold()))) &&
            ((this.tcprstthreshold==null && other.getTcprstthreshold()==null) || 
             (this.tcprstthreshold!=null &&
              this.tcprstthreshold.equals(other.getTcprstthreshold())));
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
        if (getTcpthreshold() != null) {
            _hashCode += getTcpthreshold().hashCode();
        }
        if (getUdpthreshold() != null) {
            _hashCode += getUdpthreshold().hashCode();
        }
        if (getIcmpthreshold() != null) {
            _hashCode += getIcmpthreshold().hashCode();
        }
        if (getTcprstthreshold() != null) {
            _hashCode += getTcprstthreshold().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nsratecontrol.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nsratecontrol"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcpthreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tcpthreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("udpthreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "udpthreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icmpthreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "icmpthreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcprstthreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tcprstthreshold"));
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
