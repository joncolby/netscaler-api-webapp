/**
 * Gslbsite.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Gslbsite  implements java.io.Serializable {
    private java.lang.String sitename;

    private java.lang.String sitetype;

    private java.lang.String siteipaddress;

    private java.lang.String publicip;

    private java.lang.String metricexchange;

    private java.lang.String[] servicename;

    private java.lang.String[] ipaddress;

    private org.apache.axis.types.UnsignedInt[] port;

    private java.lang.String[] state;

    private java.lang.String status;

    private java.lang.String persistencemepstatus;

    private java.lang.String[] servicetype;

    private java.lang.String nwmetricexchange;

    private java.lang.String sessionexchange;

    private java.lang.String triggermonitor;

    private java.lang.String parentsite;

    private java.lang.String[] cnameentry;

    private org.apache.axis.types.UnsignedInt version;

    public Gslbsite() {
    }

    public Gslbsite(
           java.lang.String sitename,
           java.lang.String sitetype,
           java.lang.String siteipaddress,
           java.lang.String publicip,
           java.lang.String metricexchange,
           java.lang.String[] servicename,
           java.lang.String[] ipaddress,
           org.apache.axis.types.UnsignedInt[] port,
           java.lang.String[] state,
           java.lang.String status,
           java.lang.String persistencemepstatus,
           java.lang.String[] servicetype,
           java.lang.String nwmetricexchange,
           java.lang.String sessionexchange,
           java.lang.String triggermonitor,
           java.lang.String parentsite,
           java.lang.String[] cnameentry,
           org.apache.axis.types.UnsignedInt version) {
           this.sitename = sitename;
           this.sitetype = sitetype;
           this.siteipaddress = siteipaddress;
           this.publicip = publicip;
           this.metricexchange = metricexchange;
           this.servicename = servicename;
           this.ipaddress = ipaddress;
           this.port = port;
           this.state = state;
           this.status = status;
           this.persistencemepstatus = persistencemepstatus;
           this.servicetype = servicetype;
           this.nwmetricexchange = nwmetricexchange;
           this.sessionexchange = sessionexchange;
           this.triggermonitor = triggermonitor;
           this.parentsite = parentsite;
           this.cnameentry = cnameentry;
           this.version = version;
    }


    /**
     * Gets the sitename value for this Gslbsite.
     * 
     * @return sitename
     */
    public java.lang.String getSitename() {
        return sitename;
    }


    /**
     * Sets the sitename value for this Gslbsite.
     * 
     * @param sitename
     */
    public void setSitename(java.lang.String sitename) {
        this.sitename = sitename;
    }


    /**
     * Gets the sitetype value for this Gslbsite.
     * 
     * @return sitetype
     */
    public java.lang.String getSitetype() {
        return sitetype;
    }


    /**
     * Sets the sitetype value for this Gslbsite.
     * 
     * @param sitetype
     */
    public void setSitetype(java.lang.String sitetype) {
        this.sitetype = sitetype;
    }


    /**
     * Gets the siteipaddress value for this Gslbsite.
     * 
     * @return siteipaddress
     */
    public java.lang.String getSiteipaddress() {
        return siteipaddress;
    }


    /**
     * Sets the siteipaddress value for this Gslbsite.
     * 
     * @param siteipaddress
     */
    public void setSiteipaddress(java.lang.String siteipaddress) {
        this.siteipaddress = siteipaddress;
    }


    /**
     * Gets the publicip value for this Gslbsite.
     * 
     * @return publicip
     */
    public java.lang.String getPublicip() {
        return publicip;
    }


    /**
     * Sets the publicip value for this Gslbsite.
     * 
     * @param publicip
     */
    public void setPublicip(java.lang.String publicip) {
        this.publicip = publicip;
    }


    /**
     * Gets the metricexchange value for this Gslbsite.
     * 
     * @return metricexchange
     */
    public java.lang.String getMetricexchange() {
        return metricexchange;
    }


    /**
     * Sets the metricexchange value for this Gslbsite.
     * 
     * @param metricexchange
     */
    public void setMetricexchange(java.lang.String metricexchange) {
        this.metricexchange = metricexchange;
    }


    /**
     * Gets the servicename value for this Gslbsite.
     * 
     * @return servicename
     */
    public java.lang.String[] getServicename() {
        return servicename;
    }


    /**
     * Sets the servicename value for this Gslbsite.
     * 
     * @param servicename
     */
    public void setServicename(java.lang.String[] servicename) {
        this.servicename = servicename;
    }


    /**
     * Gets the ipaddress value for this Gslbsite.
     * 
     * @return ipaddress
     */
    public java.lang.String[] getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Gslbsite.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String[] ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the port value for this Gslbsite.
     * 
     * @return port
     */
    public org.apache.axis.types.UnsignedInt[] getPort() {
        return port;
    }


    /**
     * Sets the port value for this Gslbsite.
     * 
     * @param port
     */
    public void setPort(org.apache.axis.types.UnsignedInt[] port) {
        this.port = port;
    }


    /**
     * Gets the state value for this Gslbsite.
     * 
     * @return state
     */
    public java.lang.String[] getState() {
        return state;
    }


    /**
     * Sets the state value for this Gslbsite.
     * 
     * @param state
     */
    public void setState(java.lang.String[] state) {
        this.state = state;
    }


    /**
     * Gets the status value for this Gslbsite.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Gslbsite.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the persistencemepstatus value for this Gslbsite.
     * 
     * @return persistencemepstatus
     */
    public java.lang.String getPersistencemepstatus() {
        return persistencemepstatus;
    }


    /**
     * Sets the persistencemepstatus value for this Gslbsite.
     * 
     * @param persistencemepstatus
     */
    public void setPersistencemepstatus(java.lang.String persistencemepstatus) {
        this.persistencemepstatus = persistencemepstatus;
    }


    /**
     * Gets the servicetype value for this Gslbsite.
     * 
     * @return servicetype
     */
    public java.lang.String[] getServicetype() {
        return servicetype;
    }


    /**
     * Sets the servicetype value for this Gslbsite.
     * 
     * @param servicetype
     */
    public void setServicetype(java.lang.String[] servicetype) {
        this.servicetype = servicetype;
    }


    /**
     * Gets the nwmetricexchange value for this Gslbsite.
     * 
     * @return nwmetricexchange
     */
    public java.lang.String getNwmetricexchange() {
        return nwmetricexchange;
    }


    /**
     * Sets the nwmetricexchange value for this Gslbsite.
     * 
     * @param nwmetricexchange
     */
    public void setNwmetricexchange(java.lang.String nwmetricexchange) {
        this.nwmetricexchange = nwmetricexchange;
    }


    /**
     * Gets the sessionexchange value for this Gslbsite.
     * 
     * @return sessionexchange
     */
    public java.lang.String getSessionexchange() {
        return sessionexchange;
    }


    /**
     * Sets the sessionexchange value for this Gslbsite.
     * 
     * @param sessionexchange
     */
    public void setSessionexchange(java.lang.String sessionexchange) {
        this.sessionexchange = sessionexchange;
    }


    /**
     * Gets the triggermonitor value for this Gslbsite.
     * 
     * @return triggermonitor
     */
    public java.lang.String getTriggermonitor() {
        return triggermonitor;
    }


    /**
     * Sets the triggermonitor value for this Gslbsite.
     * 
     * @param triggermonitor
     */
    public void setTriggermonitor(java.lang.String triggermonitor) {
        this.triggermonitor = triggermonitor;
    }


    /**
     * Gets the parentsite value for this Gslbsite.
     * 
     * @return parentsite
     */
    public java.lang.String getParentsite() {
        return parentsite;
    }


    /**
     * Sets the parentsite value for this Gslbsite.
     * 
     * @param parentsite
     */
    public void setParentsite(java.lang.String parentsite) {
        this.parentsite = parentsite;
    }


    /**
     * Gets the cnameentry value for this Gslbsite.
     * 
     * @return cnameentry
     */
    public java.lang.String[] getCnameentry() {
        return cnameentry;
    }


    /**
     * Sets the cnameentry value for this Gslbsite.
     * 
     * @param cnameentry
     */
    public void setCnameentry(java.lang.String[] cnameentry) {
        this.cnameentry = cnameentry;
    }


    /**
     * Gets the version value for this Gslbsite.
     * 
     * @return version
     */
    public org.apache.axis.types.UnsignedInt getVersion() {
        return version;
    }


    /**
     * Sets the version value for this Gslbsite.
     * 
     * @param version
     */
    public void setVersion(org.apache.axis.types.UnsignedInt version) {
        this.version = version;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gslbsite)) return false;
        Gslbsite other = (Gslbsite) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sitename==null && other.getSitename()==null) || 
             (this.sitename!=null &&
              this.sitename.equals(other.getSitename()))) &&
            ((this.sitetype==null && other.getSitetype()==null) || 
             (this.sitetype!=null &&
              this.sitetype.equals(other.getSitetype()))) &&
            ((this.siteipaddress==null && other.getSiteipaddress()==null) || 
             (this.siteipaddress!=null &&
              this.siteipaddress.equals(other.getSiteipaddress()))) &&
            ((this.publicip==null && other.getPublicip()==null) || 
             (this.publicip!=null &&
              this.publicip.equals(other.getPublicip()))) &&
            ((this.metricexchange==null && other.getMetricexchange()==null) || 
             (this.metricexchange!=null &&
              this.metricexchange.equals(other.getMetricexchange()))) &&
            ((this.servicename==null && other.getServicename()==null) || 
             (this.servicename!=null &&
              java.util.Arrays.equals(this.servicename, other.getServicename()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              java.util.Arrays.equals(this.ipaddress, other.getIpaddress()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              java.util.Arrays.equals(this.port, other.getPort()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              java.util.Arrays.equals(this.state, other.getState()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.persistencemepstatus==null && other.getPersistencemepstatus()==null) || 
             (this.persistencemepstatus!=null &&
              this.persistencemepstatus.equals(other.getPersistencemepstatus()))) &&
            ((this.servicetype==null && other.getServicetype()==null) || 
             (this.servicetype!=null &&
              java.util.Arrays.equals(this.servicetype, other.getServicetype()))) &&
            ((this.nwmetricexchange==null && other.getNwmetricexchange()==null) || 
             (this.nwmetricexchange!=null &&
              this.nwmetricexchange.equals(other.getNwmetricexchange()))) &&
            ((this.sessionexchange==null && other.getSessionexchange()==null) || 
             (this.sessionexchange!=null &&
              this.sessionexchange.equals(other.getSessionexchange()))) &&
            ((this.triggermonitor==null && other.getTriggermonitor()==null) || 
             (this.triggermonitor!=null &&
              this.triggermonitor.equals(other.getTriggermonitor()))) &&
            ((this.parentsite==null && other.getParentsite()==null) || 
             (this.parentsite!=null &&
              this.parentsite.equals(other.getParentsite()))) &&
            ((this.cnameentry==null && other.getCnameentry()==null) || 
             (this.cnameentry!=null &&
              java.util.Arrays.equals(this.cnameentry, other.getCnameentry()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion())));
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
        if (getSitename() != null) {
            _hashCode += getSitename().hashCode();
        }
        if (getSitetype() != null) {
            _hashCode += getSitetype().hashCode();
        }
        if (getSiteipaddress() != null) {
            _hashCode += getSiteipaddress().hashCode();
        }
        if (getPublicip() != null) {
            _hashCode += getPublicip().hashCode();
        }
        if (getMetricexchange() != null) {
            _hashCode += getMetricexchange().hashCode();
        }
        if (getServicename() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicename());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicename(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIpaddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpaddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpaddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPort() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPort());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPort(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getPersistencemepstatus() != null) {
            _hashCode += getPersistencemepstatus().hashCode();
        }
        if (getServicetype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicetype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicetype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNwmetricexchange() != null) {
            _hashCode += getNwmetricexchange().hashCode();
        }
        if (getSessionexchange() != null) {
            _hashCode += getSessionexchange().hashCode();
        }
        if (getTriggermonitor() != null) {
            _hashCode += getTriggermonitor().hashCode();
        }
        if (getParentsite() != null) {
            _hashCode += getParentsite().hashCode();
        }
        if (getCnameentry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCnameentry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCnameentry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gslbsite.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "gslbsite"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sitename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sitetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteipaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "siteipaddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metricexchange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metricexchange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicename"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persistencemepstatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "persistencemepstatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nwmetricexchange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nwmetricexchange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionexchange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionexchange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triggermonitor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "triggermonitor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentsite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parentsite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnameentry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cnameentry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
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
