/**
 * Dnsparameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Dnsparameter  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt retries;

    private org.apache.axis.types.UnsignedInt minttl;

    private org.apache.axis.types.UnsignedInt maxttl;

    private java.lang.String namelookuppriority;

    private java.lang.String cacherecords;

    private java.lang.String recursion;

    private java.lang.String resolutionorder;

    private java.lang.String dnssec;

    private org.apache.axis.types.UnsignedInt maxpipeline;

    private java.lang.String dnsrootreferral;

    private org.apache.axis.types.UnsignedInt dns64Timeout;

    public Dnsparameter() {
    }

    public Dnsparameter(
           org.apache.axis.types.UnsignedInt retries,
           org.apache.axis.types.UnsignedInt minttl,
           org.apache.axis.types.UnsignedInt maxttl,
           java.lang.String namelookuppriority,
           java.lang.String cacherecords,
           java.lang.String recursion,
           java.lang.String resolutionorder,
           java.lang.String dnssec,
           org.apache.axis.types.UnsignedInt maxpipeline,
           java.lang.String dnsrootreferral,
           org.apache.axis.types.UnsignedInt dns64Timeout) {
           this.retries = retries;
           this.minttl = minttl;
           this.maxttl = maxttl;
           this.namelookuppriority = namelookuppriority;
           this.cacherecords = cacherecords;
           this.recursion = recursion;
           this.resolutionorder = resolutionorder;
           this.dnssec = dnssec;
           this.maxpipeline = maxpipeline;
           this.dnsrootreferral = dnsrootreferral;
           this.dns64Timeout = dns64Timeout;
    }


    /**
     * Gets the retries value for this Dnsparameter.
     * 
     * @return retries
     */
    public org.apache.axis.types.UnsignedInt getRetries() {
        return retries;
    }


    /**
     * Sets the retries value for this Dnsparameter.
     * 
     * @param retries
     */
    public void setRetries(org.apache.axis.types.UnsignedInt retries) {
        this.retries = retries;
    }


    /**
     * Gets the minttl value for this Dnsparameter.
     * 
     * @return minttl
     */
    public org.apache.axis.types.UnsignedInt getMinttl() {
        return minttl;
    }


    /**
     * Sets the minttl value for this Dnsparameter.
     * 
     * @param minttl
     */
    public void setMinttl(org.apache.axis.types.UnsignedInt minttl) {
        this.minttl = minttl;
    }


    /**
     * Gets the maxttl value for this Dnsparameter.
     * 
     * @return maxttl
     */
    public org.apache.axis.types.UnsignedInt getMaxttl() {
        return maxttl;
    }


    /**
     * Sets the maxttl value for this Dnsparameter.
     * 
     * @param maxttl
     */
    public void setMaxttl(org.apache.axis.types.UnsignedInt maxttl) {
        this.maxttl = maxttl;
    }


    /**
     * Gets the namelookuppriority value for this Dnsparameter.
     * 
     * @return namelookuppriority
     */
    public java.lang.String getNamelookuppriority() {
        return namelookuppriority;
    }


    /**
     * Sets the namelookuppriority value for this Dnsparameter.
     * 
     * @param namelookuppriority
     */
    public void setNamelookuppriority(java.lang.String namelookuppriority) {
        this.namelookuppriority = namelookuppriority;
    }


    /**
     * Gets the cacherecords value for this Dnsparameter.
     * 
     * @return cacherecords
     */
    public java.lang.String getCacherecords() {
        return cacherecords;
    }


    /**
     * Sets the cacherecords value for this Dnsparameter.
     * 
     * @param cacherecords
     */
    public void setCacherecords(java.lang.String cacherecords) {
        this.cacherecords = cacherecords;
    }


    /**
     * Gets the recursion value for this Dnsparameter.
     * 
     * @return recursion
     */
    public java.lang.String getRecursion() {
        return recursion;
    }


    /**
     * Sets the recursion value for this Dnsparameter.
     * 
     * @param recursion
     */
    public void setRecursion(java.lang.String recursion) {
        this.recursion = recursion;
    }


    /**
     * Gets the resolutionorder value for this Dnsparameter.
     * 
     * @return resolutionorder
     */
    public java.lang.String getResolutionorder() {
        return resolutionorder;
    }


    /**
     * Sets the resolutionorder value for this Dnsparameter.
     * 
     * @param resolutionorder
     */
    public void setResolutionorder(java.lang.String resolutionorder) {
        this.resolutionorder = resolutionorder;
    }


    /**
     * Gets the dnssec value for this Dnsparameter.
     * 
     * @return dnssec
     */
    public java.lang.String getDnssec() {
        return dnssec;
    }


    /**
     * Sets the dnssec value for this Dnsparameter.
     * 
     * @param dnssec
     */
    public void setDnssec(java.lang.String dnssec) {
        this.dnssec = dnssec;
    }


    /**
     * Gets the maxpipeline value for this Dnsparameter.
     * 
     * @return maxpipeline
     */
    public org.apache.axis.types.UnsignedInt getMaxpipeline() {
        return maxpipeline;
    }


    /**
     * Sets the maxpipeline value for this Dnsparameter.
     * 
     * @param maxpipeline
     */
    public void setMaxpipeline(org.apache.axis.types.UnsignedInt maxpipeline) {
        this.maxpipeline = maxpipeline;
    }


    /**
     * Gets the dnsrootreferral value for this Dnsparameter.
     * 
     * @return dnsrootreferral
     */
    public java.lang.String getDnsrootreferral() {
        return dnsrootreferral;
    }


    /**
     * Sets the dnsrootreferral value for this Dnsparameter.
     * 
     * @param dnsrootreferral
     */
    public void setDnsrootreferral(java.lang.String dnsrootreferral) {
        this.dnsrootreferral = dnsrootreferral;
    }


    /**
     * Gets the dns64Timeout value for this Dnsparameter.
     * 
     * @return dns64Timeout
     */
    public org.apache.axis.types.UnsignedInt getDns64Timeout() {
        return dns64Timeout;
    }


    /**
     * Sets the dns64Timeout value for this Dnsparameter.
     * 
     * @param dns64Timeout
     */
    public void setDns64Timeout(org.apache.axis.types.UnsignedInt dns64Timeout) {
        this.dns64Timeout = dns64Timeout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Dnsparameter)) return false;
        Dnsparameter other = (Dnsparameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.retries==null && other.getRetries()==null) || 
             (this.retries!=null &&
              this.retries.equals(other.getRetries()))) &&
            ((this.minttl==null && other.getMinttl()==null) || 
             (this.minttl!=null &&
              this.minttl.equals(other.getMinttl()))) &&
            ((this.maxttl==null && other.getMaxttl()==null) || 
             (this.maxttl!=null &&
              this.maxttl.equals(other.getMaxttl()))) &&
            ((this.namelookuppriority==null && other.getNamelookuppriority()==null) || 
             (this.namelookuppriority!=null &&
              this.namelookuppriority.equals(other.getNamelookuppriority()))) &&
            ((this.cacherecords==null && other.getCacherecords()==null) || 
             (this.cacherecords!=null &&
              this.cacherecords.equals(other.getCacherecords()))) &&
            ((this.recursion==null && other.getRecursion()==null) || 
             (this.recursion!=null &&
              this.recursion.equals(other.getRecursion()))) &&
            ((this.resolutionorder==null && other.getResolutionorder()==null) || 
             (this.resolutionorder!=null &&
              this.resolutionorder.equals(other.getResolutionorder()))) &&
            ((this.dnssec==null && other.getDnssec()==null) || 
             (this.dnssec!=null &&
              this.dnssec.equals(other.getDnssec()))) &&
            ((this.maxpipeline==null && other.getMaxpipeline()==null) || 
             (this.maxpipeline!=null &&
              this.maxpipeline.equals(other.getMaxpipeline()))) &&
            ((this.dnsrootreferral==null && other.getDnsrootreferral()==null) || 
             (this.dnsrootreferral!=null &&
              this.dnsrootreferral.equals(other.getDnsrootreferral()))) &&
            ((this.dns64Timeout==null && other.getDns64Timeout()==null) || 
             (this.dns64Timeout!=null &&
              this.dns64Timeout.equals(other.getDns64Timeout())));
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
        if (getRetries() != null) {
            _hashCode += getRetries().hashCode();
        }
        if (getMinttl() != null) {
            _hashCode += getMinttl().hashCode();
        }
        if (getMaxttl() != null) {
            _hashCode += getMaxttl().hashCode();
        }
        if (getNamelookuppriority() != null) {
            _hashCode += getNamelookuppriority().hashCode();
        }
        if (getCacherecords() != null) {
            _hashCode += getCacherecords().hashCode();
        }
        if (getRecursion() != null) {
            _hashCode += getRecursion().hashCode();
        }
        if (getResolutionorder() != null) {
            _hashCode += getResolutionorder().hashCode();
        }
        if (getDnssec() != null) {
            _hashCode += getDnssec().hashCode();
        }
        if (getMaxpipeline() != null) {
            _hashCode += getMaxpipeline().hashCode();
        }
        if (getDnsrootreferral() != null) {
            _hashCode += getDnsrootreferral().hashCode();
        }
        if (getDns64Timeout() != null) {
            _hashCode += getDns64Timeout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dnsparameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "dnsparameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minttl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minttl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxttl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxttl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namelookuppriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "namelookuppriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacherecords");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cacherecords"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recursion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recursion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resolutionorder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resolutionorder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnssec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnssec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxpipeline");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxpipeline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsrootreferral");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnsrootreferral"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dns64Timeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dns64timeout"));
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
