/**
 * Callhome.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Callhome  implements java.io.Serializable {
    private java.lang.String emailaddress;

    private java.lang.String proxymode;

    private java.lang.String ipaddress;

    private org.apache.axis.types.UnsignedInt port;

    private java.lang.String sslcardfirstfailure;

    private java.lang.String sslcardlatestfailure;

    private java.lang.String powfirstfail;

    private java.lang.String powlatestfailure;

    private java.lang.String hddfirstfail;

    private java.lang.String hddlatestfailure;

    private java.lang.String flashfirstfail;

    private java.lang.String flashlatestfailure;

    private java.lang.String restartlatestfail;

    private java.lang.String callhomestatus;

    public Callhome() {
    }

    public Callhome(
           java.lang.String emailaddress,
           java.lang.String proxymode,
           java.lang.String ipaddress,
           org.apache.axis.types.UnsignedInt port,
           java.lang.String sslcardfirstfailure,
           java.lang.String sslcardlatestfailure,
           java.lang.String powfirstfail,
           java.lang.String powlatestfailure,
           java.lang.String hddfirstfail,
           java.lang.String hddlatestfailure,
           java.lang.String flashfirstfail,
           java.lang.String flashlatestfailure,
           java.lang.String restartlatestfail,
           java.lang.String callhomestatus) {
           this.emailaddress = emailaddress;
           this.proxymode = proxymode;
           this.ipaddress = ipaddress;
           this.port = port;
           this.sslcardfirstfailure = sslcardfirstfailure;
           this.sslcardlatestfailure = sslcardlatestfailure;
           this.powfirstfail = powfirstfail;
           this.powlatestfailure = powlatestfailure;
           this.hddfirstfail = hddfirstfail;
           this.hddlatestfailure = hddlatestfailure;
           this.flashfirstfail = flashfirstfail;
           this.flashlatestfailure = flashlatestfailure;
           this.restartlatestfail = restartlatestfail;
           this.callhomestatus = callhomestatus;
    }


    /**
     * Gets the emailaddress value for this Callhome.
     * 
     * @return emailaddress
     */
    public java.lang.String getEmailaddress() {
        return emailaddress;
    }


    /**
     * Sets the emailaddress value for this Callhome.
     * 
     * @param emailaddress
     */
    public void setEmailaddress(java.lang.String emailaddress) {
        this.emailaddress = emailaddress;
    }


    /**
     * Gets the proxymode value for this Callhome.
     * 
     * @return proxymode
     */
    public java.lang.String getProxymode() {
        return proxymode;
    }


    /**
     * Sets the proxymode value for this Callhome.
     * 
     * @param proxymode
     */
    public void setProxymode(java.lang.String proxymode) {
        this.proxymode = proxymode;
    }


    /**
     * Gets the ipaddress value for this Callhome.
     * 
     * @return ipaddress
     */
    public java.lang.String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Callhome.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the port value for this Callhome.
     * 
     * @return port
     */
    public org.apache.axis.types.UnsignedInt getPort() {
        return port;
    }


    /**
     * Sets the port value for this Callhome.
     * 
     * @param port
     */
    public void setPort(org.apache.axis.types.UnsignedInt port) {
        this.port = port;
    }


    /**
     * Gets the sslcardfirstfailure value for this Callhome.
     * 
     * @return sslcardfirstfailure
     */
    public java.lang.String getSslcardfirstfailure() {
        return sslcardfirstfailure;
    }


    /**
     * Sets the sslcardfirstfailure value for this Callhome.
     * 
     * @param sslcardfirstfailure
     */
    public void setSslcardfirstfailure(java.lang.String sslcardfirstfailure) {
        this.sslcardfirstfailure = sslcardfirstfailure;
    }


    /**
     * Gets the sslcardlatestfailure value for this Callhome.
     * 
     * @return sslcardlatestfailure
     */
    public java.lang.String getSslcardlatestfailure() {
        return sslcardlatestfailure;
    }


    /**
     * Sets the sslcardlatestfailure value for this Callhome.
     * 
     * @param sslcardlatestfailure
     */
    public void setSslcardlatestfailure(java.lang.String sslcardlatestfailure) {
        this.sslcardlatestfailure = sslcardlatestfailure;
    }


    /**
     * Gets the powfirstfail value for this Callhome.
     * 
     * @return powfirstfail
     */
    public java.lang.String getPowfirstfail() {
        return powfirstfail;
    }


    /**
     * Sets the powfirstfail value for this Callhome.
     * 
     * @param powfirstfail
     */
    public void setPowfirstfail(java.lang.String powfirstfail) {
        this.powfirstfail = powfirstfail;
    }


    /**
     * Gets the powlatestfailure value for this Callhome.
     * 
     * @return powlatestfailure
     */
    public java.lang.String getPowlatestfailure() {
        return powlatestfailure;
    }


    /**
     * Sets the powlatestfailure value for this Callhome.
     * 
     * @param powlatestfailure
     */
    public void setPowlatestfailure(java.lang.String powlatestfailure) {
        this.powlatestfailure = powlatestfailure;
    }


    /**
     * Gets the hddfirstfail value for this Callhome.
     * 
     * @return hddfirstfail
     */
    public java.lang.String getHddfirstfail() {
        return hddfirstfail;
    }


    /**
     * Sets the hddfirstfail value for this Callhome.
     * 
     * @param hddfirstfail
     */
    public void setHddfirstfail(java.lang.String hddfirstfail) {
        this.hddfirstfail = hddfirstfail;
    }


    /**
     * Gets the hddlatestfailure value for this Callhome.
     * 
     * @return hddlatestfailure
     */
    public java.lang.String getHddlatestfailure() {
        return hddlatestfailure;
    }


    /**
     * Sets the hddlatestfailure value for this Callhome.
     * 
     * @param hddlatestfailure
     */
    public void setHddlatestfailure(java.lang.String hddlatestfailure) {
        this.hddlatestfailure = hddlatestfailure;
    }


    /**
     * Gets the flashfirstfail value for this Callhome.
     * 
     * @return flashfirstfail
     */
    public java.lang.String getFlashfirstfail() {
        return flashfirstfail;
    }


    /**
     * Sets the flashfirstfail value for this Callhome.
     * 
     * @param flashfirstfail
     */
    public void setFlashfirstfail(java.lang.String flashfirstfail) {
        this.flashfirstfail = flashfirstfail;
    }


    /**
     * Gets the flashlatestfailure value for this Callhome.
     * 
     * @return flashlatestfailure
     */
    public java.lang.String getFlashlatestfailure() {
        return flashlatestfailure;
    }


    /**
     * Sets the flashlatestfailure value for this Callhome.
     * 
     * @param flashlatestfailure
     */
    public void setFlashlatestfailure(java.lang.String flashlatestfailure) {
        this.flashlatestfailure = flashlatestfailure;
    }


    /**
     * Gets the restartlatestfail value for this Callhome.
     * 
     * @return restartlatestfail
     */
    public java.lang.String getRestartlatestfail() {
        return restartlatestfail;
    }


    /**
     * Sets the restartlatestfail value for this Callhome.
     * 
     * @param restartlatestfail
     */
    public void setRestartlatestfail(java.lang.String restartlatestfail) {
        this.restartlatestfail = restartlatestfail;
    }


    /**
     * Gets the callhomestatus value for this Callhome.
     * 
     * @return callhomestatus
     */
    public java.lang.String getCallhomestatus() {
        return callhomestatus;
    }


    /**
     * Sets the callhomestatus value for this Callhome.
     * 
     * @param callhomestatus
     */
    public void setCallhomestatus(java.lang.String callhomestatus) {
        this.callhomestatus = callhomestatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Callhome)) return false;
        Callhome other = (Callhome) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.emailaddress==null && other.getEmailaddress()==null) || 
             (this.emailaddress!=null &&
              this.emailaddress.equals(other.getEmailaddress()))) &&
            ((this.proxymode==null && other.getProxymode()==null) || 
             (this.proxymode!=null &&
              this.proxymode.equals(other.getProxymode()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              this.ipaddress.equals(other.getIpaddress()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.sslcardfirstfailure==null && other.getSslcardfirstfailure()==null) || 
             (this.sslcardfirstfailure!=null &&
              this.sslcardfirstfailure.equals(other.getSslcardfirstfailure()))) &&
            ((this.sslcardlatestfailure==null && other.getSslcardlatestfailure()==null) || 
             (this.sslcardlatestfailure!=null &&
              this.sslcardlatestfailure.equals(other.getSslcardlatestfailure()))) &&
            ((this.powfirstfail==null && other.getPowfirstfail()==null) || 
             (this.powfirstfail!=null &&
              this.powfirstfail.equals(other.getPowfirstfail()))) &&
            ((this.powlatestfailure==null && other.getPowlatestfailure()==null) || 
             (this.powlatestfailure!=null &&
              this.powlatestfailure.equals(other.getPowlatestfailure()))) &&
            ((this.hddfirstfail==null && other.getHddfirstfail()==null) || 
             (this.hddfirstfail!=null &&
              this.hddfirstfail.equals(other.getHddfirstfail()))) &&
            ((this.hddlatestfailure==null && other.getHddlatestfailure()==null) || 
             (this.hddlatestfailure!=null &&
              this.hddlatestfailure.equals(other.getHddlatestfailure()))) &&
            ((this.flashfirstfail==null && other.getFlashfirstfail()==null) || 
             (this.flashfirstfail!=null &&
              this.flashfirstfail.equals(other.getFlashfirstfail()))) &&
            ((this.flashlatestfailure==null && other.getFlashlatestfailure()==null) || 
             (this.flashlatestfailure!=null &&
              this.flashlatestfailure.equals(other.getFlashlatestfailure()))) &&
            ((this.restartlatestfail==null && other.getRestartlatestfail()==null) || 
             (this.restartlatestfail!=null &&
              this.restartlatestfail.equals(other.getRestartlatestfail()))) &&
            ((this.callhomestatus==null && other.getCallhomestatus()==null) || 
             (this.callhomestatus!=null &&
              this.callhomestatus.equals(other.getCallhomestatus())));
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
        if (getEmailaddress() != null) {
            _hashCode += getEmailaddress().hashCode();
        }
        if (getProxymode() != null) {
            _hashCode += getProxymode().hashCode();
        }
        if (getIpaddress() != null) {
            _hashCode += getIpaddress().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getSslcardfirstfailure() != null) {
            _hashCode += getSslcardfirstfailure().hashCode();
        }
        if (getSslcardlatestfailure() != null) {
            _hashCode += getSslcardlatestfailure().hashCode();
        }
        if (getPowfirstfail() != null) {
            _hashCode += getPowfirstfail().hashCode();
        }
        if (getPowlatestfailure() != null) {
            _hashCode += getPowlatestfailure().hashCode();
        }
        if (getHddfirstfail() != null) {
            _hashCode += getHddfirstfail().hashCode();
        }
        if (getHddlatestfailure() != null) {
            _hashCode += getHddlatestfailure().hashCode();
        }
        if (getFlashfirstfail() != null) {
            _hashCode += getFlashfirstfail().hashCode();
        }
        if (getFlashlatestfailure() != null) {
            _hashCode += getFlashlatestfailure().hashCode();
        }
        if (getRestartlatestfail() != null) {
            _hashCode += getRestartlatestfail().hashCode();
        }
        if (getCallhomestatus() != null) {
            _hashCode += getCallhomestatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Callhome.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "callhome"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailaddress"));
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
        elemField.setFieldName("ipaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipaddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslcardfirstfailure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sslcardfirstfailure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslcardlatestfailure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sslcardlatestfailure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("powfirstfail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "powfirstfail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("powlatestfailure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "powlatestfailure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hddfirstfail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hddfirstfail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hddlatestfailure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hddlatestfailure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashfirstfail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flashfirstfail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashlatestfailure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flashlatestfailure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restartlatestfail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "restartlatestfail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callhomestatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callhomestatus"));
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
