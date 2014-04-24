/**
 * Sslcertlink.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Sslcertlink  implements java.io.Serializable {
    private java.lang.String certkeyname;

    private java.lang.String linkcertkeyname;

    public Sslcertlink() {
    }

    public Sslcertlink(
           java.lang.String certkeyname,
           java.lang.String linkcertkeyname) {
           this.certkeyname = certkeyname;
           this.linkcertkeyname = linkcertkeyname;
    }


    /**
     * Gets the certkeyname value for this Sslcertlink.
     * 
     * @return certkeyname
     */
    public java.lang.String getCertkeyname() {
        return certkeyname;
    }


    /**
     * Sets the certkeyname value for this Sslcertlink.
     * 
     * @param certkeyname
     */
    public void setCertkeyname(java.lang.String certkeyname) {
        this.certkeyname = certkeyname;
    }


    /**
     * Gets the linkcertkeyname value for this Sslcertlink.
     * 
     * @return linkcertkeyname
     */
    public java.lang.String getLinkcertkeyname() {
        return linkcertkeyname;
    }


    /**
     * Sets the linkcertkeyname value for this Sslcertlink.
     * 
     * @param linkcertkeyname
     */
    public void setLinkcertkeyname(java.lang.String linkcertkeyname) {
        this.linkcertkeyname = linkcertkeyname;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sslcertlink)) return false;
        Sslcertlink other = (Sslcertlink) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.certkeyname==null && other.getCertkeyname()==null) || 
             (this.certkeyname!=null &&
              this.certkeyname.equals(other.getCertkeyname()))) &&
            ((this.linkcertkeyname==null && other.getLinkcertkeyname()==null) || 
             (this.linkcertkeyname!=null &&
              this.linkcertkeyname.equals(other.getLinkcertkeyname())));
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
        if (getCertkeyname() != null) {
            _hashCode += getCertkeyname().hashCode();
        }
        if (getLinkcertkeyname() != null) {
            _hashCode += getLinkcertkeyname().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sslcertlink.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "sslcertlink"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certkeyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certkeyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkcertkeyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkcertkeyname"));
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
