/**
 * Sslfipskey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Sslfipskey  implements java.io.Serializable {
    private java.lang.String fipskeyname;

    private org.apache.axis.types.UnsignedInt modulus;

    private java.lang.String exponent;

    private org.apache.axis.types.UnsignedInt size;

    public Sslfipskey() {
    }

    public Sslfipskey(
           java.lang.String fipskeyname,
           org.apache.axis.types.UnsignedInt modulus,
           java.lang.String exponent,
           org.apache.axis.types.UnsignedInt size) {
           this.fipskeyname = fipskeyname;
           this.modulus = modulus;
           this.exponent = exponent;
           this.size = size;
    }


    /**
     * Gets the fipskeyname value for this Sslfipskey.
     * 
     * @return fipskeyname
     */
    public java.lang.String getFipskeyname() {
        return fipskeyname;
    }


    /**
     * Sets the fipskeyname value for this Sslfipskey.
     * 
     * @param fipskeyname
     */
    public void setFipskeyname(java.lang.String fipskeyname) {
        this.fipskeyname = fipskeyname;
    }


    /**
     * Gets the modulus value for this Sslfipskey.
     * 
     * @return modulus
     */
    public org.apache.axis.types.UnsignedInt getModulus() {
        return modulus;
    }


    /**
     * Sets the modulus value for this Sslfipskey.
     * 
     * @param modulus
     */
    public void setModulus(org.apache.axis.types.UnsignedInt modulus) {
        this.modulus = modulus;
    }


    /**
     * Gets the exponent value for this Sslfipskey.
     * 
     * @return exponent
     */
    public java.lang.String getExponent() {
        return exponent;
    }


    /**
     * Sets the exponent value for this Sslfipskey.
     * 
     * @param exponent
     */
    public void setExponent(java.lang.String exponent) {
        this.exponent = exponent;
    }


    /**
     * Gets the size value for this Sslfipskey.
     * 
     * @return size
     */
    public org.apache.axis.types.UnsignedInt getSize() {
        return size;
    }


    /**
     * Sets the size value for this Sslfipskey.
     * 
     * @param size
     */
    public void setSize(org.apache.axis.types.UnsignedInt size) {
        this.size = size;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sslfipskey)) return false;
        Sslfipskey other = (Sslfipskey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fipskeyname==null && other.getFipskeyname()==null) || 
             (this.fipskeyname!=null &&
              this.fipskeyname.equals(other.getFipskeyname()))) &&
            ((this.modulus==null && other.getModulus()==null) || 
             (this.modulus!=null &&
              this.modulus.equals(other.getModulus()))) &&
            ((this.exponent==null && other.getExponent()==null) || 
             (this.exponent!=null &&
              this.exponent.equals(other.getExponent()))) &&
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize())));
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
        if (getFipskeyname() != null) {
            _hashCode += getFipskeyname().hashCode();
        }
        if (getModulus() != null) {
            _hashCode += getModulus().hashCode();
        }
        if (getExponent() != null) {
            _hashCode += getExponent().hashCode();
        }
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sslfipskey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "sslfipskey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fipskeyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fipskeyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modulus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exponent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exponent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
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
