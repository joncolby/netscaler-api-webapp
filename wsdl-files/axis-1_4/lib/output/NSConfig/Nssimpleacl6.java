/**
 * Nssimpleacl6.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nssimpleacl6  implements java.io.Serializable {
    private java.lang.String aclname;

    private java.lang.String aclaction;

    private java.lang.String srcipv6;

    private org.apache.axis.types.UnsignedInt destport;

    private java.lang.String protocol;

    private org.apache.axis.types.UnsignedInt ttl;

    private org.apache.axis.types.UnsignedLong hits;

    public Nssimpleacl6() {
    }

    public Nssimpleacl6(
           java.lang.String aclname,
           java.lang.String aclaction,
           java.lang.String srcipv6,
           org.apache.axis.types.UnsignedInt destport,
           java.lang.String protocol,
           org.apache.axis.types.UnsignedInt ttl,
           org.apache.axis.types.UnsignedLong hits) {
           this.aclname = aclname;
           this.aclaction = aclaction;
           this.srcipv6 = srcipv6;
           this.destport = destport;
           this.protocol = protocol;
           this.ttl = ttl;
           this.hits = hits;
    }


    /**
     * Gets the aclname value for this Nssimpleacl6.
     * 
     * @return aclname
     */
    public java.lang.String getAclname() {
        return aclname;
    }


    /**
     * Sets the aclname value for this Nssimpleacl6.
     * 
     * @param aclname
     */
    public void setAclname(java.lang.String aclname) {
        this.aclname = aclname;
    }


    /**
     * Gets the aclaction value for this Nssimpleacl6.
     * 
     * @return aclaction
     */
    public java.lang.String getAclaction() {
        return aclaction;
    }


    /**
     * Sets the aclaction value for this Nssimpleacl6.
     * 
     * @param aclaction
     */
    public void setAclaction(java.lang.String aclaction) {
        this.aclaction = aclaction;
    }


    /**
     * Gets the srcipv6 value for this Nssimpleacl6.
     * 
     * @return srcipv6
     */
    public java.lang.String getSrcipv6() {
        return srcipv6;
    }


    /**
     * Sets the srcipv6 value for this Nssimpleacl6.
     * 
     * @param srcipv6
     */
    public void setSrcipv6(java.lang.String srcipv6) {
        this.srcipv6 = srcipv6;
    }


    /**
     * Gets the destport value for this Nssimpleacl6.
     * 
     * @return destport
     */
    public org.apache.axis.types.UnsignedInt getDestport() {
        return destport;
    }


    /**
     * Sets the destport value for this Nssimpleacl6.
     * 
     * @param destport
     */
    public void setDestport(org.apache.axis.types.UnsignedInt destport) {
        this.destport = destport;
    }


    /**
     * Gets the protocol value for this Nssimpleacl6.
     * 
     * @return protocol
     */
    public java.lang.String getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this Nssimpleacl6.
     * 
     * @param protocol
     */
    public void setProtocol(java.lang.String protocol) {
        this.protocol = protocol;
    }


    /**
     * Gets the ttl value for this Nssimpleacl6.
     * 
     * @return ttl
     */
    public org.apache.axis.types.UnsignedInt getTtl() {
        return ttl;
    }


    /**
     * Sets the ttl value for this Nssimpleacl6.
     * 
     * @param ttl
     */
    public void setTtl(org.apache.axis.types.UnsignedInt ttl) {
        this.ttl = ttl;
    }


    /**
     * Gets the hits value for this Nssimpleacl6.
     * 
     * @return hits
     */
    public org.apache.axis.types.UnsignedLong getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this Nssimpleacl6.
     * 
     * @param hits
     */
    public void setHits(org.apache.axis.types.UnsignedLong hits) {
        this.hits = hits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nssimpleacl6)) return false;
        Nssimpleacl6 other = (Nssimpleacl6) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aclname==null && other.getAclname()==null) || 
             (this.aclname!=null &&
              this.aclname.equals(other.getAclname()))) &&
            ((this.aclaction==null && other.getAclaction()==null) || 
             (this.aclaction!=null &&
              this.aclaction.equals(other.getAclaction()))) &&
            ((this.srcipv6==null && other.getSrcipv6()==null) || 
             (this.srcipv6!=null &&
              this.srcipv6.equals(other.getSrcipv6()))) &&
            ((this.destport==null && other.getDestport()==null) || 
             (this.destport!=null &&
              this.destport.equals(other.getDestport()))) &&
            ((this.protocol==null && other.getProtocol()==null) || 
             (this.protocol!=null &&
              this.protocol.equals(other.getProtocol()))) &&
            ((this.ttl==null && other.getTtl()==null) || 
             (this.ttl!=null &&
              this.ttl.equals(other.getTtl()))) &&
            ((this.hits==null && other.getHits()==null) || 
             (this.hits!=null &&
              this.hits.equals(other.getHits())));
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
        if (getAclname() != null) {
            _hashCode += getAclname().hashCode();
        }
        if (getAclaction() != null) {
            _hashCode += getAclaction().hashCode();
        }
        if (getSrcipv6() != null) {
            _hashCode += getSrcipv6().hashCode();
        }
        if (getDestport() != null) {
            _hashCode += getDestport().hashCode();
        }
        if (getProtocol() != null) {
            _hashCode += getProtocol().hashCode();
        }
        if (getTtl() != null) {
            _hashCode += getTtl().hashCode();
        }
        if (getHits() != null) {
            _hashCode += getHits().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nssimpleacl6.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nssimpleacl6"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aclname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aclname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aclaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aclaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcipv6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srcipv6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocol"));
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
        elemField.setFieldName("hits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
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
