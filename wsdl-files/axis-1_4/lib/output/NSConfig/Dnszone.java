/**
 * Dnszone.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Dnszone  implements java.io.Serializable {
    private java.lang.String zonename;

    private java.lang.String type;

    private java.lang.String proxymode;

    private org.apache.axis.types.UnsignedInt flags;

    private byte[] nsecbitarray;

    private java.lang.String[] domain;

    private java.lang.String[] nextrecs;

    private java.lang.String dnssecoffload;

    private java.lang.String nsec;

    public Dnszone() {
    }

    public Dnszone(
           java.lang.String zonename,
           java.lang.String type,
           java.lang.String proxymode,
           org.apache.axis.types.UnsignedInt flags,
           byte[] nsecbitarray,
           java.lang.String[] domain,
           java.lang.String[] nextrecs,
           java.lang.String dnssecoffload,
           java.lang.String nsec) {
           this.zonename = zonename;
           this.type = type;
           this.proxymode = proxymode;
           this.flags = flags;
           this.nsecbitarray = nsecbitarray;
           this.domain = domain;
           this.nextrecs = nextrecs;
           this.dnssecoffload = dnssecoffload;
           this.nsec = nsec;
    }


    /**
     * Gets the zonename value for this Dnszone.
     * 
     * @return zonename
     */
    public java.lang.String getZonename() {
        return zonename;
    }


    /**
     * Sets the zonename value for this Dnszone.
     * 
     * @param zonename
     */
    public void setZonename(java.lang.String zonename) {
        this.zonename = zonename;
    }


    /**
     * Gets the type value for this Dnszone.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Dnszone.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the proxymode value for this Dnszone.
     * 
     * @return proxymode
     */
    public java.lang.String getProxymode() {
        return proxymode;
    }


    /**
     * Sets the proxymode value for this Dnszone.
     * 
     * @param proxymode
     */
    public void setProxymode(java.lang.String proxymode) {
        this.proxymode = proxymode;
    }


    /**
     * Gets the flags value for this Dnszone.
     * 
     * @return flags
     */
    public org.apache.axis.types.UnsignedInt getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this Dnszone.
     * 
     * @param flags
     */
    public void setFlags(org.apache.axis.types.UnsignedInt flags) {
        this.flags = flags;
    }


    /**
     * Gets the nsecbitarray value for this Dnszone.
     * 
     * @return nsecbitarray
     */
    public byte[] getNsecbitarray() {
        return nsecbitarray;
    }


    /**
     * Sets the nsecbitarray value for this Dnszone.
     * 
     * @param nsecbitarray
     */
    public void setNsecbitarray(byte[] nsecbitarray) {
        this.nsecbitarray = nsecbitarray;
    }


    /**
     * Gets the domain value for this Dnszone.
     * 
     * @return domain
     */
    public java.lang.String[] getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this Dnszone.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String[] domain) {
        this.domain = domain;
    }


    /**
     * Gets the nextrecs value for this Dnszone.
     * 
     * @return nextrecs
     */
    public java.lang.String[] getNextrecs() {
        return nextrecs;
    }


    /**
     * Sets the nextrecs value for this Dnszone.
     * 
     * @param nextrecs
     */
    public void setNextrecs(java.lang.String[] nextrecs) {
        this.nextrecs = nextrecs;
    }


    /**
     * Gets the dnssecoffload value for this Dnszone.
     * 
     * @return dnssecoffload
     */
    public java.lang.String getDnssecoffload() {
        return dnssecoffload;
    }


    /**
     * Sets the dnssecoffload value for this Dnszone.
     * 
     * @param dnssecoffload
     */
    public void setDnssecoffload(java.lang.String dnssecoffload) {
        this.dnssecoffload = dnssecoffload;
    }


    /**
     * Gets the nsec value for this Dnszone.
     * 
     * @return nsec
     */
    public java.lang.String getNsec() {
        return nsec;
    }


    /**
     * Sets the nsec value for this Dnszone.
     * 
     * @param nsec
     */
    public void setNsec(java.lang.String nsec) {
        this.nsec = nsec;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Dnszone)) return false;
        Dnszone other = (Dnszone) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.zonename==null && other.getZonename()==null) || 
             (this.zonename!=null &&
              this.zonename.equals(other.getZonename()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.proxymode==null && other.getProxymode()==null) || 
             (this.proxymode!=null &&
              this.proxymode.equals(other.getProxymode()))) &&
            ((this.flags==null && other.getFlags()==null) || 
             (this.flags!=null &&
              this.flags.equals(other.getFlags()))) &&
            ((this.nsecbitarray==null && other.getNsecbitarray()==null) || 
             (this.nsecbitarray!=null &&
              java.util.Arrays.equals(this.nsecbitarray, other.getNsecbitarray()))) &&
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              java.util.Arrays.equals(this.domain, other.getDomain()))) &&
            ((this.nextrecs==null && other.getNextrecs()==null) || 
             (this.nextrecs!=null &&
              java.util.Arrays.equals(this.nextrecs, other.getNextrecs()))) &&
            ((this.dnssecoffload==null && other.getDnssecoffload()==null) || 
             (this.dnssecoffload!=null &&
              this.dnssecoffload.equals(other.getDnssecoffload()))) &&
            ((this.nsec==null && other.getNsec()==null) || 
             (this.nsec!=null &&
              this.nsec.equals(other.getNsec())));
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
        if (getZonename() != null) {
            _hashCode += getZonename().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getProxymode() != null) {
            _hashCode += getProxymode().hashCode();
        }
        if (getFlags() != null) {
            _hashCode += getFlags().hashCode();
        }
        if (getNsecbitarray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNsecbitarray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNsecbitarray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDomain() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDomain());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDomain(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNextrecs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNextrecs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNextrecs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDnssecoffload() != null) {
            _hashCode += getDnssecoffload().hashCode();
        }
        if (getNsec() != null) {
            _hashCode += getNsec().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dnszone.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "dnszone"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zonename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zonename"));
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
        elemField.setFieldName("proxymode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proxymode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nsecbitarray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nsecbitarray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextrecs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextrecs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnssecoffload");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnssecoffload"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nsec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nsec"));
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
