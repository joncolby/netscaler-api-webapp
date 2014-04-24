/**
 * Sslwrapkey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Sslwrapkey  implements java.io.Serializable {
    private java.lang.String wrapkeyname;

    public Sslwrapkey() {
    }

    public Sslwrapkey(
           java.lang.String wrapkeyname) {
           this.wrapkeyname = wrapkeyname;
    }


    /**
     * Gets the wrapkeyname value for this Sslwrapkey.
     * 
     * @return wrapkeyname
     */
    public java.lang.String getWrapkeyname() {
        return wrapkeyname;
    }


    /**
     * Sets the wrapkeyname value for this Sslwrapkey.
     * 
     * @param wrapkeyname
     */
    public void setWrapkeyname(java.lang.String wrapkeyname) {
        this.wrapkeyname = wrapkeyname;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sslwrapkey)) return false;
        Sslwrapkey other = (Sslwrapkey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wrapkeyname==null && other.getWrapkeyname()==null) || 
             (this.wrapkeyname!=null &&
              this.wrapkeyname.equals(other.getWrapkeyname())));
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
        if (getWrapkeyname() != null) {
            _hashCode += getWrapkeyname().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sslwrapkey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "sslwrapkey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wrapkeyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wrapkeyname"));
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
