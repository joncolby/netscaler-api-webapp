/**
 * Vpnnexthopserver.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Vpnnexthopserver  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String nexthopip;

    private org.apache.axis.types.UnsignedInt nexthopport;

    private java.lang.String secure;

    public Vpnnexthopserver() {
    }

    public Vpnnexthopserver(
           java.lang.String name,
           java.lang.String nexthopip,
           org.apache.axis.types.UnsignedInt nexthopport,
           java.lang.String secure) {
           this.name = name;
           this.nexthopip = nexthopip;
           this.nexthopport = nexthopport;
           this.secure = secure;
    }


    /**
     * Gets the name value for this Vpnnexthopserver.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Vpnnexthopserver.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the nexthopip value for this Vpnnexthopserver.
     * 
     * @return nexthopip
     */
    public java.lang.String getNexthopip() {
        return nexthopip;
    }


    /**
     * Sets the nexthopip value for this Vpnnexthopserver.
     * 
     * @param nexthopip
     */
    public void setNexthopip(java.lang.String nexthopip) {
        this.nexthopip = nexthopip;
    }


    /**
     * Gets the nexthopport value for this Vpnnexthopserver.
     * 
     * @return nexthopport
     */
    public org.apache.axis.types.UnsignedInt getNexthopport() {
        return nexthopport;
    }


    /**
     * Sets the nexthopport value for this Vpnnexthopserver.
     * 
     * @param nexthopport
     */
    public void setNexthopport(org.apache.axis.types.UnsignedInt nexthopport) {
        this.nexthopport = nexthopport;
    }


    /**
     * Gets the secure value for this Vpnnexthopserver.
     * 
     * @return secure
     */
    public java.lang.String getSecure() {
        return secure;
    }


    /**
     * Sets the secure value for this Vpnnexthopserver.
     * 
     * @param secure
     */
    public void setSecure(java.lang.String secure) {
        this.secure = secure;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Vpnnexthopserver)) return false;
        Vpnnexthopserver other = (Vpnnexthopserver) obj;
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
            ((this.nexthopip==null && other.getNexthopip()==null) || 
             (this.nexthopip!=null &&
              this.nexthopip.equals(other.getNexthopip()))) &&
            ((this.nexthopport==null && other.getNexthopport()==null) || 
             (this.nexthopport!=null &&
              this.nexthopport.equals(other.getNexthopport()))) &&
            ((this.secure==null && other.getSecure()==null) || 
             (this.secure!=null &&
              this.secure.equals(other.getSecure())));
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
        if (getNexthopip() != null) {
            _hashCode += getNexthopip().hashCode();
        }
        if (getNexthopport() != null) {
            _hashCode += getNexthopport().hashCode();
        }
        if (getSecure() != null) {
            _hashCode += getSecure().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Vpnnexthopserver.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "vpnnexthopserver"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexthopip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nexthopip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexthopport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nexthopport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secure"));
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
