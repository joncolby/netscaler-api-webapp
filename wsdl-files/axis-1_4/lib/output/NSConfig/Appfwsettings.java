/**
 * Appfwsettings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Appfwsettings  implements java.io.Serializable {
    private java.lang.String defaultprofile;

    private java.lang.String undefaction;

    private org.apache.axis.types.UnsignedInt sessiontimeout;

    private org.apache.axis.types.UnsignedInt learnratelimit;

    private org.apache.axis.types.UnsignedInt sessionlifetime;

    private java.lang.String sessioncookiename;

    private java.lang.String clientiploggingheader;

    private org.apache.axis.types.UnsignedInt importsizelimit;

    private java.lang.String signatureautoupdate;

    private java.lang.String signatureurl;

    private java.lang.String cookiepostencryptprefix;

    private java.lang.String logmalformedreq;

    private java.lang.String ceflogging;

    private java.lang.String entitydecoding;

    private java.lang.String useconfigurablesecretkey;

    public Appfwsettings() {
    }

    public Appfwsettings(
           java.lang.String defaultprofile,
           java.lang.String undefaction,
           org.apache.axis.types.UnsignedInt sessiontimeout,
           org.apache.axis.types.UnsignedInt learnratelimit,
           org.apache.axis.types.UnsignedInt sessionlifetime,
           java.lang.String sessioncookiename,
           java.lang.String clientiploggingheader,
           org.apache.axis.types.UnsignedInt importsizelimit,
           java.lang.String signatureautoupdate,
           java.lang.String signatureurl,
           java.lang.String cookiepostencryptprefix,
           java.lang.String logmalformedreq,
           java.lang.String ceflogging,
           java.lang.String entitydecoding,
           java.lang.String useconfigurablesecretkey) {
           this.defaultprofile = defaultprofile;
           this.undefaction = undefaction;
           this.sessiontimeout = sessiontimeout;
           this.learnratelimit = learnratelimit;
           this.sessionlifetime = sessionlifetime;
           this.sessioncookiename = sessioncookiename;
           this.clientiploggingheader = clientiploggingheader;
           this.importsizelimit = importsizelimit;
           this.signatureautoupdate = signatureautoupdate;
           this.signatureurl = signatureurl;
           this.cookiepostencryptprefix = cookiepostencryptprefix;
           this.logmalformedreq = logmalformedreq;
           this.ceflogging = ceflogging;
           this.entitydecoding = entitydecoding;
           this.useconfigurablesecretkey = useconfigurablesecretkey;
    }


    /**
     * Gets the defaultprofile value for this Appfwsettings.
     * 
     * @return defaultprofile
     */
    public java.lang.String getDefaultprofile() {
        return defaultprofile;
    }


    /**
     * Sets the defaultprofile value for this Appfwsettings.
     * 
     * @param defaultprofile
     */
    public void setDefaultprofile(java.lang.String defaultprofile) {
        this.defaultprofile = defaultprofile;
    }


    /**
     * Gets the undefaction value for this Appfwsettings.
     * 
     * @return undefaction
     */
    public java.lang.String getUndefaction() {
        return undefaction;
    }


    /**
     * Sets the undefaction value for this Appfwsettings.
     * 
     * @param undefaction
     */
    public void setUndefaction(java.lang.String undefaction) {
        this.undefaction = undefaction;
    }


    /**
     * Gets the sessiontimeout value for this Appfwsettings.
     * 
     * @return sessiontimeout
     */
    public org.apache.axis.types.UnsignedInt getSessiontimeout() {
        return sessiontimeout;
    }


    /**
     * Sets the sessiontimeout value for this Appfwsettings.
     * 
     * @param sessiontimeout
     */
    public void setSessiontimeout(org.apache.axis.types.UnsignedInt sessiontimeout) {
        this.sessiontimeout = sessiontimeout;
    }


    /**
     * Gets the learnratelimit value for this Appfwsettings.
     * 
     * @return learnratelimit
     */
    public org.apache.axis.types.UnsignedInt getLearnratelimit() {
        return learnratelimit;
    }


    /**
     * Sets the learnratelimit value for this Appfwsettings.
     * 
     * @param learnratelimit
     */
    public void setLearnratelimit(org.apache.axis.types.UnsignedInt learnratelimit) {
        this.learnratelimit = learnratelimit;
    }


    /**
     * Gets the sessionlifetime value for this Appfwsettings.
     * 
     * @return sessionlifetime
     */
    public org.apache.axis.types.UnsignedInt getSessionlifetime() {
        return sessionlifetime;
    }


    /**
     * Sets the sessionlifetime value for this Appfwsettings.
     * 
     * @param sessionlifetime
     */
    public void setSessionlifetime(org.apache.axis.types.UnsignedInt sessionlifetime) {
        this.sessionlifetime = sessionlifetime;
    }


    /**
     * Gets the sessioncookiename value for this Appfwsettings.
     * 
     * @return sessioncookiename
     */
    public java.lang.String getSessioncookiename() {
        return sessioncookiename;
    }


    /**
     * Sets the sessioncookiename value for this Appfwsettings.
     * 
     * @param sessioncookiename
     */
    public void setSessioncookiename(java.lang.String sessioncookiename) {
        this.sessioncookiename = sessioncookiename;
    }


    /**
     * Gets the clientiploggingheader value for this Appfwsettings.
     * 
     * @return clientiploggingheader
     */
    public java.lang.String getClientiploggingheader() {
        return clientiploggingheader;
    }


    /**
     * Sets the clientiploggingheader value for this Appfwsettings.
     * 
     * @param clientiploggingheader
     */
    public void setClientiploggingheader(java.lang.String clientiploggingheader) {
        this.clientiploggingheader = clientiploggingheader;
    }


    /**
     * Gets the importsizelimit value for this Appfwsettings.
     * 
     * @return importsizelimit
     */
    public org.apache.axis.types.UnsignedInt getImportsizelimit() {
        return importsizelimit;
    }


    /**
     * Sets the importsizelimit value for this Appfwsettings.
     * 
     * @param importsizelimit
     */
    public void setImportsizelimit(org.apache.axis.types.UnsignedInt importsizelimit) {
        this.importsizelimit = importsizelimit;
    }


    /**
     * Gets the signatureautoupdate value for this Appfwsettings.
     * 
     * @return signatureautoupdate
     */
    public java.lang.String getSignatureautoupdate() {
        return signatureautoupdate;
    }


    /**
     * Sets the signatureautoupdate value for this Appfwsettings.
     * 
     * @param signatureautoupdate
     */
    public void setSignatureautoupdate(java.lang.String signatureautoupdate) {
        this.signatureautoupdate = signatureautoupdate;
    }


    /**
     * Gets the signatureurl value for this Appfwsettings.
     * 
     * @return signatureurl
     */
    public java.lang.String getSignatureurl() {
        return signatureurl;
    }


    /**
     * Sets the signatureurl value for this Appfwsettings.
     * 
     * @param signatureurl
     */
    public void setSignatureurl(java.lang.String signatureurl) {
        this.signatureurl = signatureurl;
    }


    /**
     * Gets the cookiepostencryptprefix value for this Appfwsettings.
     * 
     * @return cookiepostencryptprefix
     */
    public java.lang.String getCookiepostencryptprefix() {
        return cookiepostencryptprefix;
    }


    /**
     * Sets the cookiepostencryptprefix value for this Appfwsettings.
     * 
     * @param cookiepostencryptprefix
     */
    public void setCookiepostencryptprefix(java.lang.String cookiepostencryptprefix) {
        this.cookiepostencryptprefix = cookiepostencryptprefix;
    }


    /**
     * Gets the logmalformedreq value for this Appfwsettings.
     * 
     * @return logmalformedreq
     */
    public java.lang.String getLogmalformedreq() {
        return logmalformedreq;
    }


    /**
     * Sets the logmalformedreq value for this Appfwsettings.
     * 
     * @param logmalformedreq
     */
    public void setLogmalformedreq(java.lang.String logmalformedreq) {
        this.logmalformedreq = logmalformedreq;
    }


    /**
     * Gets the ceflogging value for this Appfwsettings.
     * 
     * @return ceflogging
     */
    public java.lang.String getCeflogging() {
        return ceflogging;
    }


    /**
     * Sets the ceflogging value for this Appfwsettings.
     * 
     * @param ceflogging
     */
    public void setCeflogging(java.lang.String ceflogging) {
        this.ceflogging = ceflogging;
    }


    /**
     * Gets the entitydecoding value for this Appfwsettings.
     * 
     * @return entitydecoding
     */
    public java.lang.String getEntitydecoding() {
        return entitydecoding;
    }


    /**
     * Sets the entitydecoding value for this Appfwsettings.
     * 
     * @param entitydecoding
     */
    public void setEntitydecoding(java.lang.String entitydecoding) {
        this.entitydecoding = entitydecoding;
    }


    /**
     * Gets the useconfigurablesecretkey value for this Appfwsettings.
     * 
     * @return useconfigurablesecretkey
     */
    public java.lang.String getUseconfigurablesecretkey() {
        return useconfigurablesecretkey;
    }


    /**
     * Sets the useconfigurablesecretkey value for this Appfwsettings.
     * 
     * @param useconfigurablesecretkey
     */
    public void setUseconfigurablesecretkey(java.lang.String useconfigurablesecretkey) {
        this.useconfigurablesecretkey = useconfigurablesecretkey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Appfwsettings)) return false;
        Appfwsettings other = (Appfwsettings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.defaultprofile==null && other.getDefaultprofile()==null) || 
             (this.defaultprofile!=null &&
              this.defaultprofile.equals(other.getDefaultprofile()))) &&
            ((this.undefaction==null && other.getUndefaction()==null) || 
             (this.undefaction!=null &&
              this.undefaction.equals(other.getUndefaction()))) &&
            ((this.sessiontimeout==null && other.getSessiontimeout()==null) || 
             (this.sessiontimeout!=null &&
              this.sessiontimeout.equals(other.getSessiontimeout()))) &&
            ((this.learnratelimit==null && other.getLearnratelimit()==null) || 
             (this.learnratelimit!=null &&
              this.learnratelimit.equals(other.getLearnratelimit()))) &&
            ((this.sessionlifetime==null && other.getSessionlifetime()==null) || 
             (this.sessionlifetime!=null &&
              this.sessionlifetime.equals(other.getSessionlifetime()))) &&
            ((this.sessioncookiename==null && other.getSessioncookiename()==null) || 
             (this.sessioncookiename!=null &&
              this.sessioncookiename.equals(other.getSessioncookiename()))) &&
            ((this.clientiploggingheader==null && other.getClientiploggingheader()==null) || 
             (this.clientiploggingheader!=null &&
              this.clientiploggingheader.equals(other.getClientiploggingheader()))) &&
            ((this.importsizelimit==null && other.getImportsizelimit()==null) || 
             (this.importsizelimit!=null &&
              this.importsizelimit.equals(other.getImportsizelimit()))) &&
            ((this.signatureautoupdate==null && other.getSignatureautoupdate()==null) || 
             (this.signatureautoupdate!=null &&
              this.signatureautoupdate.equals(other.getSignatureautoupdate()))) &&
            ((this.signatureurl==null && other.getSignatureurl()==null) || 
             (this.signatureurl!=null &&
              this.signatureurl.equals(other.getSignatureurl()))) &&
            ((this.cookiepostencryptprefix==null && other.getCookiepostencryptprefix()==null) || 
             (this.cookiepostencryptprefix!=null &&
              this.cookiepostencryptprefix.equals(other.getCookiepostencryptprefix()))) &&
            ((this.logmalformedreq==null && other.getLogmalformedreq()==null) || 
             (this.logmalformedreq!=null &&
              this.logmalformedreq.equals(other.getLogmalformedreq()))) &&
            ((this.ceflogging==null && other.getCeflogging()==null) || 
             (this.ceflogging!=null &&
              this.ceflogging.equals(other.getCeflogging()))) &&
            ((this.entitydecoding==null && other.getEntitydecoding()==null) || 
             (this.entitydecoding!=null &&
              this.entitydecoding.equals(other.getEntitydecoding()))) &&
            ((this.useconfigurablesecretkey==null && other.getUseconfigurablesecretkey()==null) || 
             (this.useconfigurablesecretkey!=null &&
              this.useconfigurablesecretkey.equals(other.getUseconfigurablesecretkey())));
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
        if (getDefaultprofile() != null) {
            _hashCode += getDefaultprofile().hashCode();
        }
        if (getUndefaction() != null) {
            _hashCode += getUndefaction().hashCode();
        }
        if (getSessiontimeout() != null) {
            _hashCode += getSessiontimeout().hashCode();
        }
        if (getLearnratelimit() != null) {
            _hashCode += getLearnratelimit().hashCode();
        }
        if (getSessionlifetime() != null) {
            _hashCode += getSessionlifetime().hashCode();
        }
        if (getSessioncookiename() != null) {
            _hashCode += getSessioncookiename().hashCode();
        }
        if (getClientiploggingheader() != null) {
            _hashCode += getClientiploggingheader().hashCode();
        }
        if (getImportsizelimit() != null) {
            _hashCode += getImportsizelimit().hashCode();
        }
        if (getSignatureautoupdate() != null) {
            _hashCode += getSignatureautoupdate().hashCode();
        }
        if (getSignatureurl() != null) {
            _hashCode += getSignatureurl().hashCode();
        }
        if (getCookiepostencryptprefix() != null) {
            _hashCode += getCookiepostencryptprefix().hashCode();
        }
        if (getLogmalformedreq() != null) {
            _hashCode += getLogmalformedreq().hashCode();
        }
        if (getCeflogging() != null) {
            _hashCode += getCeflogging().hashCode();
        }
        if (getEntitydecoding() != null) {
            _hashCode += getEntitydecoding().hashCode();
        }
        if (getUseconfigurablesecretkey() != null) {
            _hashCode += getUseconfigurablesecretkey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Appfwsettings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "appfwsettings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultprofile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultprofile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undefaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "undefaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessiontimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessiontimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("learnratelimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "learnratelimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionlifetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionlifetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessioncookiename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessioncookiename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientiploggingheader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientiploggingheader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importsizelimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "importsizelimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureautoupdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signatureautoupdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signatureurl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signatureurl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cookiepostencryptprefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cookiepostencryptprefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logmalformedreq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logmalformedreq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ceflogging");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ceflogging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitydecoding");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entitydecoding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useconfigurablesecretkey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useconfigurablesecretkey"));
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
