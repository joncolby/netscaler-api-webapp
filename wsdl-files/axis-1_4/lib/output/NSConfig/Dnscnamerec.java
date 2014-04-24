/**
 * Dnscnamerec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Dnscnamerec  implements java.io.Serializable {
    private java.lang.String aliasname;

    private java.lang.String type;

    private java.lang.String canonicalname;

    private org.apache.axis.types.UnsignedInt ttl;

    private java.lang.String vservername;

    private java.lang.String authtype;

    public Dnscnamerec() {
    }

    public Dnscnamerec(
           java.lang.String aliasname,
           java.lang.String type,
           java.lang.String canonicalname,
           org.apache.axis.types.UnsignedInt ttl,
           java.lang.String vservername,
           java.lang.String authtype) {
           this.aliasname = aliasname;
           this.type = type;
           this.canonicalname = canonicalname;
           this.ttl = ttl;
           this.vservername = vservername;
           this.authtype = authtype;
    }


    /**
     * Gets the aliasname value for this Dnscnamerec.
     * 
     * @return aliasname
     */
    public java.lang.String getAliasname() {
        return aliasname;
    }


    /**
     * Sets the aliasname value for this Dnscnamerec.
     * 
     * @param aliasname
     */
    public void setAliasname(java.lang.String aliasname) {
        this.aliasname = aliasname;
    }


    /**
     * Gets the type value for this Dnscnamerec.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Dnscnamerec.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the canonicalname value for this Dnscnamerec.
     * 
     * @return canonicalname
     */
    public java.lang.String getCanonicalname() {
        return canonicalname;
    }


    /**
     * Sets the canonicalname value for this Dnscnamerec.
     * 
     * @param canonicalname
     */
    public void setCanonicalname(java.lang.String canonicalname) {
        this.canonicalname = canonicalname;
    }


    /**
     * Gets the ttl value for this Dnscnamerec.
     * 
     * @return ttl
     */
    public org.apache.axis.types.UnsignedInt getTtl() {
        return ttl;
    }


    /**
     * Sets the ttl value for this Dnscnamerec.
     * 
     * @param ttl
     */
    public void setTtl(org.apache.axis.types.UnsignedInt ttl) {
        this.ttl = ttl;
    }


    /**
     * Gets the vservername value for this Dnscnamerec.
     * 
     * @return vservername
     */
    public java.lang.String getVservername() {
        return vservername;
    }


    /**
     * Sets the vservername value for this Dnscnamerec.
     * 
     * @param vservername
     */
    public void setVservername(java.lang.String vservername) {
        this.vservername = vservername;
    }


    /**
     * Gets the authtype value for this Dnscnamerec.
     * 
     * @return authtype
     */
    public java.lang.String getAuthtype() {
        return authtype;
    }


    /**
     * Sets the authtype value for this Dnscnamerec.
     * 
     * @param authtype
     */
    public void setAuthtype(java.lang.String authtype) {
        this.authtype = authtype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Dnscnamerec)) return false;
        Dnscnamerec other = (Dnscnamerec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aliasname==null && other.getAliasname()==null) || 
             (this.aliasname!=null &&
              this.aliasname.equals(other.getAliasname()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.canonicalname==null && other.getCanonicalname()==null) || 
             (this.canonicalname!=null &&
              this.canonicalname.equals(other.getCanonicalname()))) &&
            ((this.ttl==null && other.getTtl()==null) || 
             (this.ttl!=null &&
              this.ttl.equals(other.getTtl()))) &&
            ((this.vservername==null && other.getVservername()==null) || 
             (this.vservername!=null &&
              this.vservername.equals(other.getVservername()))) &&
            ((this.authtype==null && other.getAuthtype()==null) || 
             (this.authtype!=null &&
              this.authtype.equals(other.getAuthtype())));
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
        if (getAliasname() != null) {
            _hashCode += getAliasname().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getCanonicalname() != null) {
            _hashCode += getCanonicalname().hashCode();
        }
        if (getTtl() != null) {
            _hashCode += getTtl().hashCode();
        }
        if (getVservername() != null) {
            _hashCode += getVservername().hashCode();
        }
        if (getAuthtype() != null) {
            _hashCode += getAuthtype().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dnscnamerec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "dnscnamerec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliasname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aliasname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("canonicalname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "canonicalname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ttl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vservername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vservername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authtype"));
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
