/**
 * Ntpparam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Ntpparam  implements java.io.Serializable {
    private java.lang.String authentication;

    private org.apache.axis.types.UnsignedInt[] trustedkey;

    private org.apache.axis.types.UnsignedInt autokeylogsec;

    private org.apache.axis.types.UnsignedInt revokelogsec;

    public Ntpparam() {
    }

    public Ntpparam(
           java.lang.String authentication,
           org.apache.axis.types.UnsignedInt[] trustedkey,
           org.apache.axis.types.UnsignedInt autokeylogsec,
           org.apache.axis.types.UnsignedInt revokelogsec) {
           this.authentication = authentication;
           this.trustedkey = trustedkey;
           this.autokeylogsec = autokeylogsec;
           this.revokelogsec = revokelogsec;
    }


    /**
     * Gets the authentication value for this Ntpparam.
     * 
     * @return authentication
     */
    public java.lang.String getAuthentication() {
        return authentication;
    }


    /**
     * Sets the authentication value for this Ntpparam.
     * 
     * @param authentication
     */
    public void setAuthentication(java.lang.String authentication) {
        this.authentication = authentication;
    }


    /**
     * Gets the trustedkey value for this Ntpparam.
     * 
     * @return trustedkey
     */
    public org.apache.axis.types.UnsignedInt[] getTrustedkey() {
        return trustedkey;
    }


    /**
     * Sets the trustedkey value for this Ntpparam.
     * 
     * @param trustedkey
     */
    public void setTrustedkey(org.apache.axis.types.UnsignedInt[] trustedkey) {
        this.trustedkey = trustedkey;
    }


    /**
     * Gets the autokeylogsec value for this Ntpparam.
     * 
     * @return autokeylogsec
     */
    public org.apache.axis.types.UnsignedInt getAutokeylogsec() {
        return autokeylogsec;
    }


    /**
     * Sets the autokeylogsec value for this Ntpparam.
     * 
     * @param autokeylogsec
     */
    public void setAutokeylogsec(org.apache.axis.types.UnsignedInt autokeylogsec) {
        this.autokeylogsec = autokeylogsec;
    }


    /**
     * Gets the revokelogsec value for this Ntpparam.
     * 
     * @return revokelogsec
     */
    public org.apache.axis.types.UnsignedInt getRevokelogsec() {
        return revokelogsec;
    }


    /**
     * Sets the revokelogsec value for this Ntpparam.
     * 
     * @param revokelogsec
     */
    public void setRevokelogsec(org.apache.axis.types.UnsignedInt revokelogsec) {
        this.revokelogsec = revokelogsec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ntpparam)) return false;
        Ntpparam other = (Ntpparam) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.authentication==null && other.getAuthentication()==null) || 
             (this.authentication!=null &&
              this.authentication.equals(other.getAuthentication()))) &&
            ((this.trustedkey==null && other.getTrustedkey()==null) || 
             (this.trustedkey!=null &&
              java.util.Arrays.equals(this.trustedkey, other.getTrustedkey()))) &&
            ((this.autokeylogsec==null && other.getAutokeylogsec()==null) || 
             (this.autokeylogsec!=null &&
              this.autokeylogsec.equals(other.getAutokeylogsec()))) &&
            ((this.revokelogsec==null && other.getRevokelogsec()==null) || 
             (this.revokelogsec!=null &&
              this.revokelogsec.equals(other.getRevokelogsec())));
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
        if (getAuthentication() != null) {
            _hashCode += getAuthentication().hashCode();
        }
        if (getTrustedkey() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrustedkey());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrustedkey(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAutokeylogsec() != null) {
            _hashCode += getAutokeylogsec().hashCode();
        }
        if (getRevokelogsec() != null) {
            _hashCode += getRevokelogsec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ntpparam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "ntpparam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authentication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authentication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trustedkey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trustedkey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autokeylogsec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autokeylogsec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("revokelogsec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "revokelogsec"));
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
