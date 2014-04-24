/**
 * Snmpengineid.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Snmpengineid  implements java.io.Serializable {
    private java.lang.String engineid;

    private java.lang.String defaultengineid;

    public Snmpengineid() {
    }

    public Snmpengineid(
           java.lang.String engineid,
           java.lang.String defaultengineid) {
           this.engineid = engineid;
           this.defaultengineid = defaultengineid;
    }


    /**
     * Gets the engineid value for this Snmpengineid.
     * 
     * @return engineid
     */
    public java.lang.String getEngineid() {
        return engineid;
    }


    /**
     * Sets the engineid value for this Snmpengineid.
     * 
     * @param engineid
     */
    public void setEngineid(java.lang.String engineid) {
        this.engineid = engineid;
    }


    /**
     * Gets the defaultengineid value for this Snmpengineid.
     * 
     * @return defaultengineid
     */
    public java.lang.String getDefaultengineid() {
        return defaultengineid;
    }


    /**
     * Sets the defaultengineid value for this Snmpengineid.
     * 
     * @param defaultengineid
     */
    public void setDefaultengineid(java.lang.String defaultengineid) {
        this.defaultengineid = defaultengineid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Snmpengineid)) return false;
        Snmpengineid other = (Snmpengineid) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.engineid==null && other.getEngineid()==null) || 
             (this.engineid!=null &&
              this.engineid.equals(other.getEngineid()))) &&
            ((this.defaultengineid==null && other.getDefaultengineid()==null) || 
             (this.defaultengineid!=null &&
              this.defaultengineid.equals(other.getDefaultengineid())));
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
        if (getEngineid() != null) {
            _hashCode += getEngineid().hashCode();
        }
        if (getDefaultengineid() != null) {
            _hashCode += getDefaultengineid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Snmpengineid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "snmpengineid"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("engineid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "engineid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultengineid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultengineid"));
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
