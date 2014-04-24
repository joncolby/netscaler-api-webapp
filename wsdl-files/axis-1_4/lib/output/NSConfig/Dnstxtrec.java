/**
 * Dnstxtrec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Dnstxtrec  implements java.io.Serializable {
    private java.lang.String domain;

    private java.lang.String type;

    private java.lang.String[] strinG;

    private org.apache.axis.types.UnsignedInt ttl;

    private org.apache.axis.types.UnsignedInt recordid;

    private java.lang.String authtype;

    public Dnstxtrec() {
    }

    public Dnstxtrec(
           java.lang.String domain,
           java.lang.String type,
           java.lang.String[] strinG,
           org.apache.axis.types.UnsignedInt ttl,
           org.apache.axis.types.UnsignedInt recordid,
           java.lang.String authtype) {
           this.domain = domain;
           this.type = type;
           this.strinG = strinG;
           this.ttl = ttl;
           this.recordid = recordid;
           this.authtype = authtype;
    }


    /**
     * Gets the domain value for this Dnstxtrec.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this Dnstxtrec.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the type value for this Dnstxtrec.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Dnstxtrec.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the strinG value for this Dnstxtrec.
     * 
     * @return strinG
     */
    public java.lang.String[] getStrinG() {
        return strinG;
    }


    /**
     * Sets the strinG value for this Dnstxtrec.
     * 
     * @param strinG
     */
    public void setStrinG(java.lang.String[] strinG) {
        this.strinG = strinG;
    }


    /**
     * Gets the ttl value for this Dnstxtrec.
     * 
     * @return ttl
     */
    public org.apache.axis.types.UnsignedInt getTtl() {
        return ttl;
    }


    /**
     * Sets the ttl value for this Dnstxtrec.
     * 
     * @param ttl
     */
    public void setTtl(org.apache.axis.types.UnsignedInt ttl) {
        this.ttl = ttl;
    }


    /**
     * Gets the recordid value for this Dnstxtrec.
     * 
     * @return recordid
     */
    public org.apache.axis.types.UnsignedInt getRecordid() {
        return recordid;
    }


    /**
     * Sets the recordid value for this Dnstxtrec.
     * 
     * @param recordid
     */
    public void setRecordid(org.apache.axis.types.UnsignedInt recordid) {
        this.recordid = recordid;
    }


    /**
     * Gets the authtype value for this Dnstxtrec.
     * 
     * @return authtype
     */
    public java.lang.String getAuthtype() {
        return authtype;
    }


    /**
     * Sets the authtype value for this Dnstxtrec.
     * 
     * @param authtype
     */
    public void setAuthtype(java.lang.String authtype) {
        this.authtype = authtype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Dnstxtrec)) return false;
        Dnstxtrec other = (Dnstxtrec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.strinG==null && other.getStrinG()==null) || 
             (this.strinG!=null &&
              java.util.Arrays.equals(this.strinG, other.getStrinG()))) &&
            ((this.ttl==null && other.getTtl()==null) || 
             (this.ttl!=null &&
              this.ttl.equals(other.getTtl()))) &&
            ((this.recordid==null && other.getRecordid()==null) || 
             (this.recordid!=null &&
              this.recordid.equals(other.getRecordid()))) &&
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
        if (getDomain() != null) {
            _hashCode += getDomain().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getStrinG() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStrinG());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStrinG(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTtl() != null) {
            _hashCode += getTtl().hashCode();
        }
        if (getRecordid() != null) {
            _hashCode += getRecordid().hashCode();
        }
        if (getAuthtype() != null) {
            _hashCode += getAuthtype().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dnstxtrec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "dnstxtrec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain"));
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
        elemField.setFieldName("strinG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strinG"));
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
        elemField.setFieldName("recordid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recordid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
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
