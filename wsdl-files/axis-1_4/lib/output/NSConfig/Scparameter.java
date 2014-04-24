/**
 * Scparameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Scparameter  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt sessionlife;

    private java.lang.String vsr;

    public Scparameter() {
    }

    public Scparameter(
           org.apache.axis.types.UnsignedInt sessionlife,
           java.lang.String vsr) {
           this.sessionlife = sessionlife;
           this.vsr = vsr;
    }


    /**
     * Gets the sessionlife value for this Scparameter.
     * 
     * @return sessionlife
     */
    public org.apache.axis.types.UnsignedInt getSessionlife() {
        return sessionlife;
    }


    /**
     * Sets the sessionlife value for this Scparameter.
     * 
     * @param sessionlife
     */
    public void setSessionlife(org.apache.axis.types.UnsignedInt sessionlife) {
        this.sessionlife = sessionlife;
    }


    /**
     * Gets the vsr value for this Scparameter.
     * 
     * @return vsr
     */
    public java.lang.String getVsr() {
        return vsr;
    }


    /**
     * Sets the vsr value for this Scparameter.
     * 
     * @param vsr
     */
    public void setVsr(java.lang.String vsr) {
        this.vsr = vsr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Scparameter)) return false;
        Scparameter other = (Scparameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionlife==null && other.getSessionlife()==null) || 
             (this.sessionlife!=null &&
              this.sessionlife.equals(other.getSessionlife()))) &&
            ((this.vsr==null && other.getVsr()==null) || 
             (this.vsr!=null &&
              this.vsr.equals(other.getVsr())));
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
        if (getSessionlife() != null) {
            _hashCode += getSessionlife().hashCode();
        }
        if (getVsr() != null) {
            _hashCode += getVsr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Scparameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "scparameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionlife");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionlife"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vsr"));
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
