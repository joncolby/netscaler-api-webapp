/**
 * Nat64.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nat64  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String acl6Name;

    private java.lang.String netprofile;

    public Nat64() {
    }

    public Nat64(
           java.lang.String name,
           java.lang.String acl6Name,
           java.lang.String netprofile) {
           this.name = name;
           this.acl6Name = acl6Name;
           this.netprofile = netprofile;
    }


    /**
     * Gets the name value for this Nat64.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Nat64.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the acl6Name value for this Nat64.
     * 
     * @return acl6Name
     */
    public java.lang.String getAcl6Name() {
        return acl6Name;
    }


    /**
     * Sets the acl6Name value for this Nat64.
     * 
     * @param acl6Name
     */
    public void setAcl6Name(java.lang.String acl6Name) {
        this.acl6Name = acl6Name;
    }


    /**
     * Gets the netprofile value for this Nat64.
     * 
     * @return netprofile
     */
    public java.lang.String getNetprofile() {
        return netprofile;
    }


    /**
     * Sets the netprofile value for this Nat64.
     * 
     * @param netprofile
     */
    public void setNetprofile(java.lang.String netprofile) {
        this.netprofile = netprofile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nat64)) return false;
        Nat64 other = (Nat64) obj;
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
            ((this.acl6Name==null && other.getAcl6Name()==null) || 
             (this.acl6Name!=null &&
              this.acl6Name.equals(other.getAcl6Name()))) &&
            ((this.netprofile==null && other.getNetprofile()==null) || 
             (this.netprofile!=null &&
              this.netprofile.equals(other.getNetprofile())));
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
        if (getAcl6Name() != null) {
            _hashCode += getAcl6Name().hashCode();
        }
        if (getNetprofile() != null) {
            _hashCode += getNetprofile().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nat64.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nat64"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acl6Name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acl6name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netprofile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netprofile"));
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
