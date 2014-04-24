/**
 * Lbparameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Lbparameter  implements java.io.Serializable {
    private java.lang.String httponlycookieflag;

    private java.lang.String consolidatedlconn;

    private java.lang.String useportforhashlb;

    private java.lang.String preferdirectroute;

    private org.apache.axis.types.UnsignedInt startuprrfactor;

    private java.lang.String monitorskipmaxclient;

    private java.lang.String monitorconnectionclose;

    private java.lang.String vserverspecificmac;

    private org.apache.axis.types.UnsignedInt sessionsthreshold;

    public Lbparameter() {
    }

    public Lbparameter(
           java.lang.String httponlycookieflag,
           java.lang.String consolidatedlconn,
           java.lang.String useportforhashlb,
           java.lang.String preferdirectroute,
           org.apache.axis.types.UnsignedInt startuprrfactor,
           java.lang.String monitorskipmaxclient,
           java.lang.String monitorconnectionclose,
           java.lang.String vserverspecificmac,
           org.apache.axis.types.UnsignedInt sessionsthreshold) {
           this.httponlycookieflag = httponlycookieflag;
           this.consolidatedlconn = consolidatedlconn;
           this.useportforhashlb = useportforhashlb;
           this.preferdirectroute = preferdirectroute;
           this.startuprrfactor = startuprrfactor;
           this.monitorskipmaxclient = monitorskipmaxclient;
           this.monitorconnectionclose = monitorconnectionclose;
           this.vserverspecificmac = vserverspecificmac;
           this.sessionsthreshold = sessionsthreshold;
    }


    /**
     * Gets the httponlycookieflag value for this Lbparameter.
     * 
     * @return httponlycookieflag
     */
    public java.lang.String getHttponlycookieflag() {
        return httponlycookieflag;
    }


    /**
     * Sets the httponlycookieflag value for this Lbparameter.
     * 
     * @param httponlycookieflag
     */
    public void setHttponlycookieflag(java.lang.String httponlycookieflag) {
        this.httponlycookieflag = httponlycookieflag;
    }


    /**
     * Gets the consolidatedlconn value for this Lbparameter.
     * 
     * @return consolidatedlconn
     */
    public java.lang.String getConsolidatedlconn() {
        return consolidatedlconn;
    }


    /**
     * Sets the consolidatedlconn value for this Lbparameter.
     * 
     * @param consolidatedlconn
     */
    public void setConsolidatedlconn(java.lang.String consolidatedlconn) {
        this.consolidatedlconn = consolidatedlconn;
    }


    /**
     * Gets the useportforhashlb value for this Lbparameter.
     * 
     * @return useportforhashlb
     */
    public java.lang.String getUseportforhashlb() {
        return useportforhashlb;
    }


    /**
     * Sets the useportforhashlb value for this Lbparameter.
     * 
     * @param useportforhashlb
     */
    public void setUseportforhashlb(java.lang.String useportforhashlb) {
        this.useportforhashlb = useportforhashlb;
    }


    /**
     * Gets the preferdirectroute value for this Lbparameter.
     * 
     * @return preferdirectroute
     */
    public java.lang.String getPreferdirectroute() {
        return preferdirectroute;
    }


    /**
     * Sets the preferdirectroute value for this Lbparameter.
     * 
     * @param preferdirectroute
     */
    public void setPreferdirectroute(java.lang.String preferdirectroute) {
        this.preferdirectroute = preferdirectroute;
    }


    /**
     * Gets the startuprrfactor value for this Lbparameter.
     * 
     * @return startuprrfactor
     */
    public org.apache.axis.types.UnsignedInt getStartuprrfactor() {
        return startuprrfactor;
    }


    /**
     * Sets the startuprrfactor value for this Lbparameter.
     * 
     * @param startuprrfactor
     */
    public void setStartuprrfactor(org.apache.axis.types.UnsignedInt startuprrfactor) {
        this.startuprrfactor = startuprrfactor;
    }


    /**
     * Gets the monitorskipmaxclient value for this Lbparameter.
     * 
     * @return monitorskipmaxclient
     */
    public java.lang.String getMonitorskipmaxclient() {
        return monitorskipmaxclient;
    }


    /**
     * Sets the monitorskipmaxclient value for this Lbparameter.
     * 
     * @param monitorskipmaxclient
     */
    public void setMonitorskipmaxclient(java.lang.String monitorskipmaxclient) {
        this.monitorskipmaxclient = monitorskipmaxclient;
    }


    /**
     * Gets the monitorconnectionclose value for this Lbparameter.
     * 
     * @return monitorconnectionclose
     */
    public java.lang.String getMonitorconnectionclose() {
        return monitorconnectionclose;
    }


    /**
     * Sets the monitorconnectionclose value for this Lbparameter.
     * 
     * @param monitorconnectionclose
     */
    public void setMonitorconnectionclose(java.lang.String monitorconnectionclose) {
        this.monitorconnectionclose = monitorconnectionclose;
    }


    /**
     * Gets the vserverspecificmac value for this Lbparameter.
     * 
     * @return vserverspecificmac
     */
    public java.lang.String getVserverspecificmac() {
        return vserverspecificmac;
    }


    /**
     * Sets the vserverspecificmac value for this Lbparameter.
     * 
     * @param vserverspecificmac
     */
    public void setVserverspecificmac(java.lang.String vserverspecificmac) {
        this.vserverspecificmac = vserverspecificmac;
    }


    /**
     * Gets the sessionsthreshold value for this Lbparameter.
     * 
     * @return sessionsthreshold
     */
    public org.apache.axis.types.UnsignedInt getSessionsthreshold() {
        return sessionsthreshold;
    }


    /**
     * Sets the sessionsthreshold value for this Lbparameter.
     * 
     * @param sessionsthreshold
     */
    public void setSessionsthreshold(org.apache.axis.types.UnsignedInt sessionsthreshold) {
        this.sessionsthreshold = sessionsthreshold;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Lbparameter)) return false;
        Lbparameter other = (Lbparameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.httponlycookieflag==null && other.getHttponlycookieflag()==null) || 
             (this.httponlycookieflag!=null &&
              this.httponlycookieflag.equals(other.getHttponlycookieflag()))) &&
            ((this.consolidatedlconn==null && other.getConsolidatedlconn()==null) || 
             (this.consolidatedlconn!=null &&
              this.consolidatedlconn.equals(other.getConsolidatedlconn()))) &&
            ((this.useportforhashlb==null && other.getUseportforhashlb()==null) || 
             (this.useportforhashlb!=null &&
              this.useportforhashlb.equals(other.getUseportforhashlb()))) &&
            ((this.preferdirectroute==null && other.getPreferdirectroute()==null) || 
             (this.preferdirectroute!=null &&
              this.preferdirectroute.equals(other.getPreferdirectroute()))) &&
            ((this.startuprrfactor==null && other.getStartuprrfactor()==null) || 
             (this.startuprrfactor!=null &&
              this.startuprrfactor.equals(other.getStartuprrfactor()))) &&
            ((this.monitorskipmaxclient==null && other.getMonitorskipmaxclient()==null) || 
             (this.monitorskipmaxclient!=null &&
              this.monitorskipmaxclient.equals(other.getMonitorskipmaxclient()))) &&
            ((this.monitorconnectionclose==null && other.getMonitorconnectionclose()==null) || 
             (this.monitorconnectionclose!=null &&
              this.monitorconnectionclose.equals(other.getMonitorconnectionclose()))) &&
            ((this.vserverspecificmac==null && other.getVserverspecificmac()==null) || 
             (this.vserverspecificmac!=null &&
              this.vserverspecificmac.equals(other.getVserverspecificmac()))) &&
            ((this.sessionsthreshold==null && other.getSessionsthreshold()==null) || 
             (this.sessionsthreshold!=null &&
              this.sessionsthreshold.equals(other.getSessionsthreshold())));
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
        if (getHttponlycookieflag() != null) {
            _hashCode += getHttponlycookieflag().hashCode();
        }
        if (getConsolidatedlconn() != null) {
            _hashCode += getConsolidatedlconn().hashCode();
        }
        if (getUseportforhashlb() != null) {
            _hashCode += getUseportforhashlb().hashCode();
        }
        if (getPreferdirectroute() != null) {
            _hashCode += getPreferdirectroute().hashCode();
        }
        if (getStartuprrfactor() != null) {
            _hashCode += getStartuprrfactor().hashCode();
        }
        if (getMonitorskipmaxclient() != null) {
            _hashCode += getMonitorskipmaxclient().hashCode();
        }
        if (getMonitorconnectionclose() != null) {
            _hashCode += getMonitorconnectionclose().hashCode();
        }
        if (getVserverspecificmac() != null) {
            _hashCode += getVserverspecificmac().hashCode();
        }
        if (getSessionsthreshold() != null) {
            _hashCode += getSessionsthreshold().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Lbparameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "lbparameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httponlycookieflag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httponlycookieflag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidatedlconn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "consolidatedlconn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useportforhashlb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useportforhashlb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferdirectroute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preferdirectroute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startuprrfactor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startuprrfactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monitorskipmaxclient");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monitorskipmaxclient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monitorconnectionclose");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monitorconnectionclose"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vserverspecificmac");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vserverspecificmac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionsthreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionsthreshold"));
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
