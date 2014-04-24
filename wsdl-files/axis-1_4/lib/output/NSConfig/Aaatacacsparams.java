/**
 * Aaatacacsparams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Aaatacacsparams  implements java.io.Serializable {
    private java.lang.String serverip;

    private org.apache.axis.types.UnsignedInt serverport;

    private org.apache.axis.types.UnsignedInt authtimeout;

    private java.lang.String tacacssecret;

    private java.lang.String authorization;

    private java.lang.String accounting;

    private java.lang.String auditfailedcmds;

    private java.lang.String defaultauthenticationgroup;

    public Aaatacacsparams() {
    }

    public Aaatacacsparams(
           java.lang.String serverip,
           org.apache.axis.types.UnsignedInt serverport,
           org.apache.axis.types.UnsignedInt authtimeout,
           java.lang.String tacacssecret,
           java.lang.String authorization,
           java.lang.String accounting,
           java.lang.String auditfailedcmds,
           java.lang.String defaultauthenticationgroup) {
           this.serverip = serverip;
           this.serverport = serverport;
           this.authtimeout = authtimeout;
           this.tacacssecret = tacacssecret;
           this.authorization = authorization;
           this.accounting = accounting;
           this.auditfailedcmds = auditfailedcmds;
           this.defaultauthenticationgroup = defaultauthenticationgroup;
    }


    /**
     * Gets the serverip value for this Aaatacacsparams.
     * 
     * @return serverip
     */
    public java.lang.String getServerip() {
        return serverip;
    }


    /**
     * Sets the serverip value for this Aaatacacsparams.
     * 
     * @param serverip
     */
    public void setServerip(java.lang.String serverip) {
        this.serverip = serverip;
    }


    /**
     * Gets the serverport value for this Aaatacacsparams.
     * 
     * @return serverport
     */
    public org.apache.axis.types.UnsignedInt getServerport() {
        return serverport;
    }


    /**
     * Sets the serverport value for this Aaatacacsparams.
     * 
     * @param serverport
     */
    public void setServerport(org.apache.axis.types.UnsignedInt serverport) {
        this.serverport = serverport;
    }


    /**
     * Gets the authtimeout value for this Aaatacacsparams.
     * 
     * @return authtimeout
     */
    public org.apache.axis.types.UnsignedInt getAuthtimeout() {
        return authtimeout;
    }


    /**
     * Sets the authtimeout value for this Aaatacacsparams.
     * 
     * @param authtimeout
     */
    public void setAuthtimeout(org.apache.axis.types.UnsignedInt authtimeout) {
        this.authtimeout = authtimeout;
    }


    /**
     * Gets the tacacssecret value for this Aaatacacsparams.
     * 
     * @return tacacssecret
     */
    public java.lang.String getTacacssecret() {
        return tacacssecret;
    }


    /**
     * Sets the tacacssecret value for this Aaatacacsparams.
     * 
     * @param tacacssecret
     */
    public void setTacacssecret(java.lang.String tacacssecret) {
        this.tacacssecret = tacacssecret;
    }


    /**
     * Gets the authorization value for this Aaatacacsparams.
     * 
     * @return authorization
     */
    public java.lang.String getAuthorization() {
        return authorization;
    }


    /**
     * Sets the authorization value for this Aaatacacsparams.
     * 
     * @param authorization
     */
    public void setAuthorization(java.lang.String authorization) {
        this.authorization = authorization;
    }


    /**
     * Gets the accounting value for this Aaatacacsparams.
     * 
     * @return accounting
     */
    public java.lang.String getAccounting() {
        return accounting;
    }


    /**
     * Sets the accounting value for this Aaatacacsparams.
     * 
     * @param accounting
     */
    public void setAccounting(java.lang.String accounting) {
        this.accounting = accounting;
    }


    /**
     * Gets the auditfailedcmds value for this Aaatacacsparams.
     * 
     * @return auditfailedcmds
     */
    public java.lang.String getAuditfailedcmds() {
        return auditfailedcmds;
    }


    /**
     * Sets the auditfailedcmds value for this Aaatacacsparams.
     * 
     * @param auditfailedcmds
     */
    public void setAuditfailedcmds(java.lang.String auditfailedcmds) {
        this.auditfailedcmds = auditfailedcmds;
    }


    /**
     * Gets the defaultauthenticationgroup value for this Aaatacacsparams.
     * 
     * @return defaultauthenticationgroup
     */
    public java.lang.String getDefaultauthenticationgroup() {
        return defaultauthenticationgroup;
    }


    /**
     * Sets the defaultauthenticationgroup value for this Aaatacacsparams.
     * 
     * @param defaultauthenticationgroup
     */
    public void setDefaultauthenticationgroup(java.lang.String defaultauthenticationgroup) {
        this.defaultauthenticationgroup = defaultauthenticationgroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Aaatacacsparams)) return false;
        Aaatacacsparams other = (Aaatacacsparams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serverip==null && other.getServerip()==null) || 
             (this.serverip!=null &&
              this.serverip.equals(other.getServerip()))) &&
            ((this.serverport==null && other.getServerport()==null) || 
             (this.serverport!=null &&
              this.serverport.equals(other.getServerport()))) &&
            ((this.authtimeout==null && other.getAuthtimeout()==null) || 
             (this.authtimeout!=null &&
              this.authtimeout.equals(other.getAuthtimeout()))) &&
            ((this.tacacssecret==null && other.getTacacssecret()==null) || 
             (this.tacacssecret!=null &&
              this.tacacssecret.equals(other.getTacacssecret()))) &&
            ((this.authorization==null && other.getAuthorization()==null) || 
             (this.authorization!=null &&
              this.authorization.equals(other.getAuthorization()))) &&
            ((this.accounting==null && other.getAccounting()==null) || 
             (this.accounting!=null &&
              this.accounting.equals(other.getAccounting()))) &&
            ((this.auditfailedcmds==null && other.getAuditfailedcmds()==null) || 
             (this.auditfailedcmds!=null &&
              this.auditfailedcmds.equals(other.getAuditfailedcmds()))) &&
            ((this.defaultauthenticationgroup==null && other.getDefaultauthenticationgroup()==null) || 
             (this.defaultauthenticationgroup!=null &&
              this.defaultauthenticationgroup.equals(other.getDefaultauthenticationgroup())));
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
        if (getServerip() != null) {
            _hashCode += getServerip().hashCode();
        }
        if (getServerport() != null) {
            _hashCode += getServerport().hashCode();
        }
        if (getAuthtimeout() != null) {
            _hashCode += getAuthtimeout().hashCode();
        }
        if (getTacacssecret() != null) {
            _hashCode += getTacacssecret().hashCode();
        }
        if (getAuthorization() != null) {
            _hashCode += getAuthorization().hashCode();
        }
        if (getAccounting() != null) {
            _hashCode += getAccounting().hashCode();
        }
        if (getAuditfailedcmds() != null) {
            _hashCode += getAuditfailedcmds().hashCode();
        }
        if (getDefaultauthenticationgroup() != null) {
            _hashCode += getDefaultauthenticationgroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Aaatacacsparams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "aaatacacsparams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authtimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authtimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tacacssecret");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tacacssecret"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorization");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorization"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accounting");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accounting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditfailedcmds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditfailedcmds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultauthenticationgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultauthenticationgroup"));
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
