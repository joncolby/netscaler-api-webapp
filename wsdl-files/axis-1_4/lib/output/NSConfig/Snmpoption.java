/**
 * Snmpoption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Snmpoption  implements java.io.Serializable {
    private java.lang.String snmpset;

    private java.lang.String snmptraplogging;

    public Snmpoption() {
    }

    public Snmpoption(
           java.lang.String snmpset,
           java.lang.String snmptraplogging) {
           this.snmpset = snmpset;
           this.snmptraplogging = snmptraplogging;
    }


    /**
     * Gets the snmpset value for this Snmpoption.
     * 
     * @return snmpset
     */
    public java.lang.String getSnmpset() {
        return snmpset;
    }


    /**
     * Sets the snmpset value for this Snmpoption.
     * 
     * @param snmpset
     */
    public void setSnmpset(java.lang.String snmpset) {
        this.snmpset = snmpset;
    }


    /**
     * Gets the snmptraplogging value for this Snmpoption.
     * 
     * @return snmptraplogging
     */
    public java.lang.String getSnmptraplogging() {
        return snmptraplogging;
    }


    /**
     * Sets the snmptraplogging value for this Snmpoption.
     * 
     * @param snmptraplogging
     */
    public void setSnmptraplogging(java.lang.String snmptraplogging) {
        this.snmptraplogging = snmptraplogging;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Snmpoption)) return false;
        Snmpoption other = (Snmpoption) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.snmpset==null && other.getSnmpset()==null) || 
             (this.snmpset!=null &&
              this.snmpset.equals(other.getSnmpset()))) &&
            ((this.snmptraplogging==null && other.getSnmptraplogging()==null) || 
             (this.snmptraplogging!=null &&
              this.snmptraplogging.equals(other.getSnmptraplogging())));
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
        if (getSnmpset() != null) {
            _hashCode += getSnmpset().hashCode();
        }
        if (getSnmptraplogging() != null) {
            _hashCode += getSnmptraplogging().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Snmpoption.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "snmpoption"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snmpset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "snmpset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snmptraplogging");
        elemField.setXmlName(new javax.xml.namespace.QName("", "snmptraplogging"));
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
