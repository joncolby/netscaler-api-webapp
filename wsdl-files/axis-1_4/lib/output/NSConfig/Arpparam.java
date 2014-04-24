/**
 * Arpparam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Arpparam  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt timeout;

    private java.lang.String spoofvalidation;

    public Arpparam() {
    }

    public Arpparam(
           org.apache.axis.types.UnsignedInt timeout,
           java.lang.String spoofvalidation) {
           this.timeout = timeout;
           this.spoofvalidation = spoofvalidation;
    }


    /**
     * Gets the timeout value for this Arpparam.
     * 
     * @return timeout
     */
    public org.apache.axis.types.UnsignedInt getTimeout() {
        return timeout;
    }


    /**
     * Sets the timeout value for this Arpparam.
     * 
     * @param timeout
     */
    public void setTimeout(org.apache.axis.types.UnsignedInt timeout) {
        this.timeout = timeout;
    }


    /**
     * Gets the spoofvalidation value for this Arpparam.
     * 
     * @return spoofvalidation
     */
    public java.lang.String getSpoofvalidation() {
        return spoofvalidation;
    }


    /**
     * Sets the spoofvalidation value for this Arpparam.
     * 
     * @param spoofvalidation
     */
    public void setSpoofvalidation(java.lang.String spoofvalidation) {
        this.spoofvalidation = spoofvalidation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Arpparam)) return false;
        Arpparam other = (Arpparam) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.timeout==null && other.getTimeout()==null) || 
             (this.timeout!=null &&
              this.timeout.equals(other.getTimeout()))) &&
            ((this.spoofvalidation==null && other.getSpoofvalidation()==null) || 
             (this.spoofvalidation!=null &&
              this.spoofvalidation.equals(other.getSpoofvalidation())));
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
        if (getTimeout() != null) {
            _hashCode += getTimeout().hashCode();
        }
        if (getSpoofvalidation() != null) {
            _hashCode += getSpoofvalidation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Arpparam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "arpparam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spoofvalidation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spoofvalidation"));
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
