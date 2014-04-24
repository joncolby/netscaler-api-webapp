/**
 * L4Param.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class L4Param  implements java.io.Serializable {
    private java.lang.String l2Connmethod;

    private java.lang.String l4Switch;

    public L4Param() {
    }

    public L4Param(
           java.lang.String l2Connmethod,
           java.lang.String l4Switch) {
           this.l2Connmethod = l2Connmethod;
           this.l4Switch = l4Switch;
    }


    /**
     * Gets the l2Connmethod value for this L4Param.
     * 
     * @return l2Connmethod
     */
    public java.lang.String getL2Connmethod() {
        return l2Connmethod;
    }


    /**
     * Sets the l2Connmethod value for this L4Param.
     * 
     * @param l2Connmethod
     */
    public void setL2Connmethod(java.lang.String l2Connmethod) {
        this.l2Connmethod = l2Connmethod;
    }


    /**
     * Gets the l4Switch value for this L4Param.
     * 
     * @return l4Switch
     */
    public java.lang.String getL4Switch() {
        return l4Switch;
    }


    /**
     * Sets the l4Switch value for this L4Param.
     * 
     * @param l4Switch
     */
    public void setL4Switch(java.lang.String l4Switch) {
        this.l4Switch = l4Switch;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof L4Param)) return false;
        L4Param other = (L4Param) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.l2Connmethod==null && other.getL2Connmethod()==null) || 
             (this.l2Connmethod!=null &&
              this.l2Connmethod.equals(other.getL2Connmethod()))) &&
            ((this.l4Switch==null && other.getL4Switch()==null) || 
             (this.l4Switch!=null &&
              this.l4Switch.equals(other.getL4Switch())));
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
        if (getL2Connmethod() != null) {
            _hashCode += getL2Connmethod().hashCode();
        }
        if (getL4Switch() != null) {
            _hashCode += getL4Switch().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(L4Param.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "l4param"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("l2Connmethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "l2connmethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("l4Switch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "l4switch"));
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
