/**
 * Vpathparam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Vpathparam  implements java.io.Serializable {
    private java.lang.String srcip;

    private java.lang.String encapmode;

    public Vpathparam() {
    }

    public Vpathparam(
           java.lang.String srcip,
           java.lang.String encapmode) {
           this.srcip = srcip;
           this.encapmode = encapmode;
    }


    /**
     * Gets the srcip value for this Vpathparam.
     * 
     * @return srcip
     */
    public java.lang.String getSrcip() {
        return srcip;
    }


    /**
     * Sets the srcip value for this Vpathparam.
     * 
     * @param srcip
     */
    public void setSrcip(java.lang.String srcip) {
        this.srcip = srcip;
    }


    /**
     * Gets the encapmode value for this Vpathparam.
     * 
     * @return encapmode
     */
    public java.lang.String getEncapmode() {
        return encapmode;
    }


    /**
     * Sets the encapmode value for this Vpathparam.
     * 
     * @param encapmode
     */
    public void setEncapmode(java.lang.String encapmode) {
        this.encapmode = encapmode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Vpathparam)) return false;
        Vpathparam other = (Vpathparam) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.srcip==null && other.getSrcip()==null) || 
             (this.srcip!=null &&
              this.srcip.equals(other.getSrcip()))) &&
            ((this.encapmode==null && other.getEncapmode()==null) || 
             (this.encapmode!=null &&
              this.encapmode.equals(other.getEncapmode())));
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
        if (getSrcip() != null) {
            _hashCode += getSrcip().hashCode();
        }
        if (getEncapmode() != null) {
            _hashCode += getEncapmode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Vpathparam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "vpathparam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srcip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encapmode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "encapmode"));
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
