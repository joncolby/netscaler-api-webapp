/**
 * Nstcpbufparam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nstcpbufparam  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt size;

    private org.apache.axis.types.UnsignedInt memlimit;

    public Nstcpbufparam() {
    }

    public Nstcpbufparam(
           org.apache.axis.types.UnsignedInt size,
           org.apache.axis.types.UnsignedInt memlimit) {
           this.size = size;
           this.memlimit = memlimit;
    }


    /**
     * Gets the size value for this Nstcpbufparam.
     * 
     * @return size
     */
    public org.apache.axis.types.UnsignedInt getSize() {
        return size;
    }


    /**
     * Sets the size value for this Nstcpbufparam.
     * 
     * @param size
     */
    public void setSize(org.apache.axis.types.UnsignedInt size) {
        this.size = size;
    }


    /**
     * Gets the memlimit value for this Nstcpbufparam.
     * 
     * @return memlimit
     */
    public org.apache.axis.types.UnsignedInt getMemlimit() {
        return memlimit;
    }


    /**
     * Sets the memlimit value for this Nstcpbufparam.
     * 
     * @param memlimit
     */
    public void setMemlimit(org.apache.axis.types.UnsignedInt memlimit) {
        this.memlimit = memlimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nstcpbufparam)) return false;
        Nstcpbufparam other = (Nstcpbufparam) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.size==null && other.getSize()==null) || 
             (this.size!=null &&
              this.size.equals(other.getSize()))) &&
            ((this.memlimit==null && other.getMemlimit()==null) || 
             (this.memlimit!=null &&
              this.memlimit.equals(other.getMemlimit())));
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
        if (getSize() != null) {
            _hashCode += getSize().hashCode();
        }
        if (getMemlimit() != null) {
            _hashCode += getMemlimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nstcpbufparam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nstcpbufparam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new javax.xml.namespace.QName("", "size"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memlimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "memlimit"));
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
