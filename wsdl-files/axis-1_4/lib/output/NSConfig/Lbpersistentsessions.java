/**
 * Lbpersistentsessions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Lbpersistentsessions  implements java.io.Serializable {
    private java.lang.String vserver;

    private org.apache.axis.types.UnsignedInt type;

    private java.lang.String srcip;

    private java.lang.String srcipv6;

    private java.lang.String destip;

    private java.lang.String destipv6;

    private boolean flags;

    private org.apache.axis.types.UnsignedInt destport;

    private java.lang.String vservername;

    private org.apache.axis.types.UnsignedInt timeout;

    private org.apache.axis.types.UnsignedInt referencecount;

    private java.lang.String sipcallid;

    private java.lang.String persistenceparam;

    public Lbpersistentsessions() {
    }

    public Lbpersistentsessions(
           java.lang.String vserver,
           org.apache.axis.types.UnsignedInt type,
           java.lang.String srcip,
           java.lang.String srcipv6,
           java.lang.String destip,
           java.lang.String destipv6,
           boolean flags,
           org.apache.axis.types.UnsignedInt destport,
           java.lang.String vservername,
           org.apache.axis.types.UnsignedInt timeout,
           org.apache.axis.types.UnsignedInt referencecount,
           java.lang.String sipcallid,
           java.lang.String persistenceparam) {
           this.vserver = vserver;
           this.type = type;
           this.srcip = srcip;
           this.srcipv6 = srcipv6;
           this.destip = destip;
           this.destipv6 = destipv6;
           this.flags = flags;
           this.destport = destport;
           this.vservername = vservername;
           this.timeout = timeout;
           this.referencecount = referencecount;
           this.sipcallid = sipcallid;
           this.persistenceparam = persistenceparam;
    }


    /**
     * Gets the vserver value for this Lbpersistentsessions.
     * 
     * @return vserver
     */
    public java.lang.String getVserver() {
        return vserver;
    }


    /**
     * Sets the vserver value for this Lbpersistentsessions.
     * 
     * @param vserver
     */
    public void setVserver(java.lang.String vserver) {
        this.vserver = vserver;
    }


    /**
     * Gets the type value for this Lbpersistentsessions.
     * 
     * @return type
     */
    public org.apache.axis.types.UnsignedInt getType() {
        return type;
    }


    /**
     * Sets the type value for this Lbpersistentsessions.
     * 
     * @param type
     */
    public void setType(org.apache.axis.types.UnsignedInt type) {
        this.type = type;
    }


    /**
     * Gets the srcip value for this Lbpersistentsessions.
     * 
     * @return srcip
     */
    public java.lang.String getSrcip() {
        return srcip;
    }


    /**
     * Sets the srcip value for this Lbpersistentsessions.
     * 
     * @param srcip
     */
    public void setSrcip(java.lang.String srcip) {
        this.srcip = srcip;
    }


    /**
     * Gets the srcipv6 value for this Lbpersistentsessions.
     * 
     * @return srcipv6
     */
    public java.lang.String getSrcipv6() {
        return srcipv6;
    }


    /**
     * Sets the srcipv6 value for this Lbpersistentsessions.
     * 
     * @param srcipv6
     */
    public void setSrcipv6(java.lang.String srcipv6) {
        this.srcipv6 = srcipv6;
    }


    /**
     * Gets the destip value for this Lbpersistentsessions.
     * 
     * @return destip
     */
    public java.lang.String getDestip() {
        return destip;
    }


    /**
     * Sets the destip value for this Lbpersistentsessions.
     * 
     * @param destip
     */
    public void setDestip(java.lang.String destip) {
        this.destip = destip;
    }


    /**
     * Gets the destipv6 value for this Lbpersistentsessions.
     * 
     * @return destipv6
     */
    public java.lang.String getDestipv6() {
        return destipv6;
    }


    /**
     * Sets the destipv6 value for this Lbpersistentsessions.
     * 
     * @param destipv6
     */
    public void setDestipv6(java.lang.String destipv6) {
        this.destipv6 = destipv6;
    }


    /**
     * Gets the flags value for this Lbpersistentsessions.
     * 
     * @return flags
     */
    public boolean isFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this Lbpersistentsessions.
     * 
     * @param flags
     */
    public void setFlags(boolean flags) {
        this.flags = flags;
    }


    /**
     * Gets the destport value for this Lbpersistentsessions.
     * 
     * @return destport
     */
    public org.apache.axis.types.UnsignedInt getDestport() {
        return destport;
    }


    /**
     * Sets the destport value for this Lbpersistentsessions.
     * 
     * @param destport
     */
    public void setDestport(org.apache.axis.types.UnsignedInt destport) {
        this.destport = destport;
    }


    /**
     * Gets the vservername value for this Lbpersistentsessions.
     * 
     * @return vservername
     */
    public java.lang.String getVservername() {
        return vservername;
    }


    /**
     * Sets the vservername value for this Lbpersistentsessions.
     * 
     * @param vservername
     */
    public void setVservername(java.lang.String vservername) {
        this.vservername = vservername;
    }


    /**
     * Gets the timeout value for this Lbpersistentsessions.
     * 
     * @return timeout
     */
    public org.apache.axis.types.UnsignedInt getTimeout() {
        return timeout;
    }


    /**
     * Sets the timeout value for this Lbpersistentsessions.
     * 
     * @param timeout
     */
    public void setTimeout(org.apache.axis.types.UnsignedInt timeout) {
        this.timeout = timeout;
    }


    /**
     * Gets the referencecount value for this Lbpersistentsessions.
     * 
     * @return referencecount
     */
    public org.apache.axis.types.UnsignedInt getReferencecount() {
        return referencecount;
    }


    /**
     * Sets the referencecount value for this Lbpersistentsessions.
     * 
     * @param referencecount
     */
    public void setReferencecount(org.apache.axis.types.UnsignedInt referencecount) {
        this.referencecount = referencecount;
    }


    /**
     * Gets the sipcallid value for this Lbpersistentsessions.
     * 
     * @return sipcallid
     */
    public java.lang.String getSipcallid() {
        return sipcallid;
    }


    /**
     * Sets the sipcallid value for this Lbpersistentsessions.
     * 
     * @param sipcallid
     */
    public void setSipcallid(java.lang.String sipcallid) {
        this.sipcallid = sipcallid;
    }


    /**
     * Gets the persistenceparam value for this Lbpersistentsessions.
     * 
     * @return persistenceparam
     */
    public java.lang.String getPersistenceparam() {
        return persistenceparam;
    }


    /**
     * Sets the persistenceparam value for this Lbpersistentsessions.
     * 
     * @param persistenceparam
     */
    public void setPersistenceparam(java.lang.String persistenceparam) {
        this.persistenceparam = persistenceparam;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Lbpersistentsessions)) return false;
        Lbpersistentsessions other = (Lbpersistentsessions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vserver==null && other.getVserver()==null) || 
             (this.vserver!=null &&
              this.vserver.equals(other.getVserver()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.srcip==null && other.getSrcip()==null) || 
             (this.srcip!=null &&
              this.srcip.equals(other.getSrcip()))) &&
            ((this.srcipv6==null && other.getSrcipv6()==null) || 
             (this.srcipv6!=null &&
              this.srcipv6.equals(other.getSrcipv6()))) &&
            ((this.destip==null && other.getDestip()==null) || 
             (this.destip!=null &&
              this.destip.equals(other.getDestip()))) &&
            ((this.destipv6==null && other.getDestipv6()==null) || 
             (this.destipv6!=null &&
              this.destipv6.equals(other.getDestipv6()))) &&
            this.flags == other.isFlags() &&
            ((this.destport==null && other.getDestport()==null) || 
             (this.destport!=null &&
              this.destport.equals(other.getDestport()))) &&
            ((this.vservername==null && other.getVservername()==null) || 
             (this.vservername!=null &&
              this.vservername.equals(other.getVservername()))) &&
            ((this.timeout==null && other.getTimeout()==null) || 
             (this.timeout!=null &&
              this.timeout.equals(other.getTimeout()))) &&
            ((this.referencecount==null && other.getReferencecount()==null) || 
             (this.referencecount!=null &&
              this.referencecount.equals(other.getReferencecount()))) &&
            ((this.sipcallid==null && other.getSipcallid()==null) || 
             (this.sipcallid!=null &&
              this.sipcallid.equals(other.getSipcallid()))) &&
            ((this.persistenceparam==null && other.getPersistenceparam()==null) || 
             (this.persistenceparam!=null &&
              this.persistenceparam.equals(other.getPersistenceparam())));
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
        if (getVserver() != null) {
            _hashCode += getVserver().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getSrcip() != null) {
            _hashCode += getSrcip().hashCode();
        }
        if (getSrcipv6() != null) {
            _hashCode += getSrcipv6().hashCode();
        }
        if (getDestip() != null) {
            _hashCode += getDestip().hashCode();
        }
        if (getDestipv6() != null) {
            _hashCode += getDestipv6().hashCode();
        }
        _hashCode += (isFlags() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDestport() != null) {
            _hashCode += getDestport().hashCode();
        }
        if (getVservername() != null) {
            _hashCode += getVservername().hashCode();
        }
        if (getTimeout() != null) {
            _hashCode += getTimeout().hashCode();
        }
        if (getReferencecount() != null) {
            _hashCode += getReferencecount().hashCode();
        }
        if (getSipcallid() != null) {
            _hashCode += getSipcallid().hashCode();
        }
        if (getPersistenceparam() != null) {
            _hashCode += getPersistenceparam().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Lbpersistentsessions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "lbpersistentsessions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srcip"));
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
        elemField.setFieldName("destip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destipv6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destipv6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destport"));
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
        elemField.setFieldName("timeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referencecount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referencecount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sipcallid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sipcallid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persistenceparam");
        elemField.setXmlName(new javax.xml.namespace.QName("", "persistenceparam"));
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
