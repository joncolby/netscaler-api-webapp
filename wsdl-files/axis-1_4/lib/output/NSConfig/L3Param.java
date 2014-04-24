/**
 * L3Param.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class L3Param  implements java.io.Serializable {
    private java.lang.String srcnat;

    private org.apache.axis.types.UnsignedInt icmpgenratethreshold;

    private java.lang.String overridernat;

    private java.lang.String dropdfflag;

    private java.lang.String miproundrobin;

    private java.lang.String externalloopback;

    private java.lang.String tnlpmtuwoconn;

    private java.lang.String usipserverstraypkt;

    private java.lang.String forwardicmpfragments;

    private java.lang.String dropipfragments;

    private org.apache.axis.types.UnsignedInt acllogtime;

    private java.lang.String icmperrgenerate;

    public L3Param() {
    }

    public L3Param(
           java.lang.String srcnat,
           org.apache.axis.types.UnsignedInt icmpgenratethreshold,
           java.lang.String overridernat,
           java.lang.String dropdfflag,
           java.lang.String miproundrobin,
           java.lang.String externalloopback,
           java.lang.String tnlpmtuwoconn,
           java.lang.String usipserverstraypkt,
           java.lang.String forwardicmpfragments,
           java.lang.String dropipfragments,
           org.apache.axis.types.UnsignedInt acllogtime,
           java.lang.String icmperrgenerate) {
           this.srcnat = srcnat;
           this.icmpgenratethreshold = icmpgenratethreshold;
           this.overridernat = overridernat;
           this.dropdfflag = dropdfflag;
           this.miproundrobin = miproundrobin;
           this.externalloopback = externalloopback;
           this.tnlpmtuwoconn = tnlpmtuwoconn;
           this.usipserverstraypkt = usipserverstraypkt;
           this.forwardicmpfragments = forwardicmpfragments;
           this.dropipfragments = dropipfragments;
           this.acllogtime = acllogtime;
           this.icmperrgenerate = icmperrgenerate;
    }


    /**
     * Gets the srcnat value for this L3Param.
     * 
     * @return srcnat
     */
    public java.lang.String getSrcnat() {
        return srcnat;
    }


    /**
     * Sets the srcnat value for this L3Param.
     * 
     * @param srcnat
     */
    public void setSrcnat(java.lang.String srcnat) {
        this.srcnat = srcnat;
    }


    /**
     * Gets the icmpgenratethreshold value for this L3Param.
     * 
     * @return icmpgenratethreshold
     */
    public org.apache.axis.types.UnsignedInt getIcmpgenratethreshold() {
        return icmpgenratethreshold;
    }


    /**
     * Sets the icmpgenratethreshold value for this L3Param.
     * 
     * @param icmpgenratethreshold
     */
    public void setIcmpgenratethreshold(org.apache.axis.types.UnsignedInt icmpgenratethreshold) {
        this.icmpgenratethreshold = icmpgenratethreshold;
    }


    /**
     * Gets the overridernat value for this L3Param.
     * 
     * @return overridernat
     */
    public java.lang.String getOverridernat() {
        return overridernat;
    }


    /**
     * Sets the overridernat value for this L3Param.
     * 
     * @param overridernat
     */
    public void setOverridernat(java.lang.String overridernat) {
        this.overridernat = overridernat;
    }


    /**
     * Gets the dropdfflag value for this L3Param.
     * 
     * @return dropdfflag
     */
    public java.lang.String getDropdfflag() {
        return dropdfflag;
    }


    /**
     * Sets the dropdfflag value for this L3Param.
     * 
     * @param dropdfflag
     */
    public void setDropdfflag(java.lang.String dropdfflag) {
        this.dropdfflag = dropdfflag;
    }


    /**
     * Gets the miproundrobin value for this L3Param.
     * 
     * @return miproundrobin
     */
    public java.lang.String getMiproundrobin() {
        return miproundrobin;
    }


    /**
     * Sets the miproundrobin value for this L3Param.
     * 
     * @param miproundrobin
     */
    public void setMiproundrobin(java.lang.String miproundrobin) {
        this.miproundrobin = miproundrobin;
    }


    /**
     * Gets the externalloopback value for this L3Param.
     * 
     * @return externalloopback
     */
    public java.lang.String getExternalloopback() {
        return externalloopback;
    }


    /**
     * Sets the externalloopback value for this L3Param.
     * 
     * @param externalloopback
     */
    public void setExternalloopback(java.lang.String externalloopback) {
        this.externalloopback = externalloopback;
    }


    /**
     * Gets the tnlpmtuwoconn value for this L3Param.
     * 
     * @return tnlpmtuwoconn
     */
    public java.lang.String getTnlpmtuwoconn() {
        return tnlpmtuwoconn;
    }


    /**
     * Sets the tnlpmtuwoconn value for this L3Param.
     * 
     * @param tnlpmtuwoconn
     */
    public void setTnlpmtuwoconn(java.lang.String tnlpmtuwoconn) {
        this.tnlpmtuwoconn = tnlpmtuwoconn;
    }


    /**
     * Gets the usipserverstraypkt value for this L3Param.
     * 
     * @return usipserverstraypkt
     */
    public java.lang.String getUsipserverstraypkt() {
        return usipserverstraypkt;
    }


    /**
     * Sets the usipserverstraypkt value for this L3Param.
     * 
     * @param usipserverstraypkt
     */
    public void setUsipserverstraypkt(java.lang.String usipserverstraypkt) {
        this.usipserverstraypkt = usipserverstraypkt;
    }


    /**
     * Gets the forwardicmpfragments value for this L3Param.
     * 
     * @return forwardicmpfragments
     */
    public java.lang.String getForwardicmpfragments() {
        return forwardicmpfragments;
    }


    /**
     * Sets the forwardicmpfragments value for this L3Param.
     * 
     * @param forwardicmpfragments
     */
    public void setForwardicmpfragments(java.lang.String forwardicmpfragments) {
        this.forwardicmpfragments = forwardicmpfragments;
    }


    /**
     * Gets the dropipfragments value for this L3Param.
     * 
     * @return dropipfragments
     */
    public java.lang.String getDropipfragments() {
        return dropipfragments;
    }


    /**
     * Sets the dropipfragments value for this L3Param.
     * 
     * @param dropipfragments
     */
    public void setDropipfragments(java.lang.String dropipfragments) {
        this.dropipfragments = dropipfragments;
    }


    /**
     * Gets the acllogtime value for this L3Param.
     * 
     * @return acllogtime
     */
    public org.apache.axis.types.UnsignedInt getAcllogtime() {
        return acllogtime;
    }


    /**
     * Sets the acllogtime value for this L3Param.
     * 
     * @param acllogtime
     */
    public void setAcllogtime(org.apache.axis.types.UnsignedInt acllogtime) {
        this.acllogtime = acllogtime;
    }


    /**
     * Gets the icmperrgenerate value for this L3Param.
     * 
     * @return icmperrgenerate
     */
    public java.lang.String getIcmperrgenerate() {
        return icmperrgenerate;
    }


    /**
     * Sets the icmperrgenerate value for this L3Param.
     * 
     * @param icmperrgenerate
     */
    public void setIcmperrgenerate(java.lang.String icmperrgenerate) {
        this.icmperrgenerate = icmperrgenerate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof L3Param)) return false;
        L3Param other = (L3Param) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.srcnat==null && other.getSrcnat()==null) || 
             (this.srcnat!=null &&
              this.srcnat.equals(other.getSrcnat()))) &&
            ((this.icmpgenratethreshold==null && other.getIcmpgenratethreshold()==null) || 
             (this.icmpgenratethreshold!=null &&
              this.icmpgenratethreshold.equals(other.getIcmpgenratethreshold()))) &&
            ((this.overridernat==null && other.getOverridernat()==null) || 
             (this.overridernat!=null &&
              this.overridernat.equals(other.getOverridernat()))) &&
            ((this.dropdfflag==null && other.getDropdfflag()==null) || 
             (this.dropdfflag!=null &&
              this.dropdfflag.equals(other.getDropdfflag()))) &&
            ((this.miproundrobin==null && other.getMiproundrobin()==null) || 
             (this.miproundrobin!=null &&
              this.miproundrobin.equals(other.getMiproundrobin()))) &&
            ((this.externalloopback==null && other.getExternalloopback()==null) || 
             (this.externalloopback!=null &&
              this.externalloopback.equals(other.getExternalloopback()))) &&
            ((this.tnlpmtuwoconn==null && other.getTnlpmtuwoconn()==null) || 
             (this.tnlpmtuwoconn!=null &&
              this.tnlpmtuwoconn.equals(other.getTnlpmtuwoconn()))) &&
            ((this.usipserverstraypkt==null && other.getUsipserverstraypkt()==null) || 
             (this.usipserverstraypkt!=null &&
              this.usipserverstraypkt.equals(other.getUsipserverstraypkt()))) &&
            ((this.forwardicmpfragments==null && other.getForwardicmpfragments()==null) || 
             (this.forwardicmpfragments!=null &&
              this.forwardicmpfragments.equals(other.getForwardicmpfragments()))) &&
            ((this.dropipfragments==null && other.getDropipfragments()==null) || 
             (this.dropipfragments!=null &&
              this.dropipfragments.equals(other.getDropipfragments()))) &&
            ((this.acllogtime==null && other.getAcllogtime()==null) || 
             (this.acllogtime!=null &&
              this.acllogtime.equals(other.getAcllogtime()))) &&
            ((this.icmperrgenerate==null && other.getIcmperrgenerate()==null) || 
             (this.icmperrgenerate!=null &&
              this.icmperrgenerate.equals(other.getIcmperrgenerate())));
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
        if (getSrcnat() != null) {
            _hashCode += getSrcnat().hashCode();
        }
        if (getIcmpgenratethreshold() != null) {
            _hashCode += getIcmpgenratethreshold().hashCode();
        }
        if (getOverridernat() != null) {
            _hashCode += getOverridernat().hashCode();
        }
        if (getDropdfflag() != null) {
            _hashCode += getDropdfflag().hashCode();
        }
        if (getMiproundrobin() != null) {
            _hashCode += getMiproundrobin().hashCode();
        }
        if (getExternalloopback() != null) {
            _hashCode += getExternalloopback().hashCode();
        }
        if (getTnlpmtuwoconn() != null) {
            _hashCode += getTnlpmtuwoconn().hashCode();
        }
        if (getUsipserverstraypkt() != null) {
            _hashCode += getUsipserverstraypkt().hashCode();
        }
        if (getForwardicmpfragments() != null) {
            _hashCode += getForwardicmpfragments().hashCode();
        }
        if (getDropipfragments() != null) {
            _hashCode += getDropipfragments().hashCode();
        }
        if (getAcllogtime() != null) {
            _hashCode += getAcllogtime().hashCode();
        }
        if (getIcmperrgenerate() != null) {
            _hashCode += getIcmperrgenerate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(L3Param.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "l3param"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcnat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srcnat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icmpgenratethreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "icmpgenratethreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("overridernat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "overridernat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dropdfflag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dropdfflag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("miproundrobin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "miproundrobin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalloopback");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externalloopback"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tnlpmtuwoconn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tnlpmtuwoconn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usipserverstraypkt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usipserverstraypkt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forwardicmpfragments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forwardicmpfragments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dropipfragments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dropipfragments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acllogtime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acllogtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icmperrgenerate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "icmperrgenerate"));
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
