/**
 * Dnssuffix.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Dnssuffix  implements java.io.Serializable {
    private java.lang.String dnssuffix;

    public Dnssuffix() {
    }

    public Dnssuffix(
           java.lang.String dnssuffix) {
           this.dnssuffix = dnssuffix;
    }


    /**
     * Gets the dnssuffix value for this Dnssuffix.
     * 
     * @return dnssuffix
     */
    public java.lang.String getDnssuffix() {
        return dnssuffix;
    }


    /**
     * Sets the dnssuffix value for this Dnssuffix.
     * 
     * @param dnssuffix
     */
    public void setDnssuffix(java.lang.String dnssuffix) {
        this.dnssuffix = dnssuffix;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Dnssuffix)) return false;
        Dnssuffix other = (Dnssuffix) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dnssuffix==null && other.getDnssuffix()==null) || 
             (this.dnssuffix!=null &&
              this.dnssuffix.equals(other.getDnssuffix())));
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
        if (getDnssuffix() != null) {
            _hashCode += getDnssuffix().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dnssuffix.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "dnssuffix"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnssuffix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnssuffix"));
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
