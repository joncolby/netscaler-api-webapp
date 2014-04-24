/**
 * Nsns.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nsns  implements java.io.Serializable {
    private java.lang.String textblob;

    public Nsns() {
    }

    public Nsns(
           java.lang.String textblob) {
           this.textblob = textblob;
    }


    /**
     * Gets the textblob value for this Nsns.
     * 
     * @return textblob
     */
    public java.lang.String getTextblob() {
        return textblob;
    }


    /**
     * Sets the textblob value for this Nsns.
     * 
     * @param textblob
     */
    public void setTextblob(java.lang.String textblob) {
        this.textblob = textblob;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nsns)) return false;
        Nsns other = (Nsns) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.textblob==null && other.getTextblob()==null) || 
             (this.textblob!=null &&
              this.textblob.equals(other.getTextblob())));
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
        if (getTextblob() != null) {
            _hashCode += getTextblob().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nsns.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nsns"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textblob");
        elemField.setXmlName(new javax.xml.namespace.QName("", "textblob"));
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
