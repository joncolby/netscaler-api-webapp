/**
 * Dospolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Dospolicy  implements java.io.Serializable {
    private java.lang.String name;

    private org.apache.axis.types.UnsignedInt qdepth;

    private org.apache.axis.types.UnsignedInt cltdetectrate;

    public Dospolicy() {
    }

    public Dospolicy(
           java.lang.String name,
           org.apache.axis.types.UnsignedInt qdepth,
           org.apache.axis.types.UnsignedInt cltdetectrate) {
           this.name = name;
           this.qdepth = qdepth;
           this.cltdetectrate = cltdetectrate;
    }


    /**
     * Gets the name value for this Dospolicy.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Dospolicy.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the qdepth value for this Dospolicy.
     * 
     * @return qdepth
     */
    public org.apache.axis.types.UnsignedInt getQdepth() {
        return qdepth;
    }


    /**
     * Sets the qdepth value for this Dospolicy.
     * 
     * @param qdepth
     */
    public void setQdepth(org.apache.axis.types.UnsignedInt qdepth) {
        this.qdepth = qdepth;
    }


    /**
     * Gets the cltdetectrate value for this Dospolicy.
     * 
     * @return cltdetectrate
     */
    public org.apache.axis.types.UnsignedInt getCltdetectrate() {
        return cltdetectrate;
    }


    /**
     * Sets the cltdetectrate value for this Dospolicy.
     * 
     * @param cltdetectrate
     */
    public void setCltdetectrate(org.apache.axis.types.UnsignedInt cltdetectrate) {
        this.cltdetectrate = cltdetectrate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Dospolicy)) return false;
        Dospolicy other = (Dospolicy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.qdepth==null && other.getQdepth()==null) || 
             (this.qdepth!=null &&
              this.qdepth.equals(other.getQdepth()))) &&
            ((this.cltdetectrate==null && other.getCltdetectrate()==null) || 
             (this.cltdetectrate!=null &&
              this.cltdetectrate.equals(other.getCltdetectrate())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getQdepth() != null) {
            _hashCode += getQdepth().hashCode();
        }
        if (getCltdetectrate() != null) {
            _hashCode += getCltdetectrate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dospolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "dospolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qdepth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qdepth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cltdetectrate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cltdetectrate"));
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
