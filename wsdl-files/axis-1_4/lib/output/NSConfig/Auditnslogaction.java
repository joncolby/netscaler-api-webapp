/**
 * Auditnslogaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Auditnslogaction  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String serverip;

    private org.apache.axis.types.UnsignedInt serverport;

    private java.lang.String loglevel;

    private java.lang.String dateformat;

    private java.lang.String logfacility;

    private java.lang.String tcp;

    private java.lang.String acl;

    private java.lang.String timezone;

    private java.lang.String userdefinedauditlog;

    private java.lang.String appflowexport;

    private java.lang.String builtin;

    public Auditnslogaction() {
    }

    public Auditnslogaction(
           java.lang.String name,
           java.lang.String serverip,
           org.apache.axis.types.UnsignedInt serverport,
           java.lang.String loglevel,
           java.lang.String dateformat,
           java.lang.String logfacility,
           java.lang.String tcp,
           java.lang.String acl,
           java.lang.String timezone,
           java.lang.String userdefinedauditlog,
           java.lang.String appflowexport,
           java.lang.String builtin) {
           this.name = name;
           this.serverip = serverip;
           this.serverport = serverport;
           this.loglevel = loglevel;
           this.dateformat = dateformat;
           this.logfacility = logfacility;
           this.tcp = tcp;
           this.acl = acl;
           this.timezone = timezone;
           this.userdefinedauditlog = userdefinedauditlog;
           this.appflowexport = appflowexport;
           this.builtin = builtin;
    }


    /**
     * Gets the name value for this Auditnslogaction.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Auditnslogaction.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the serverip value for this Auditnslogaction.
     * 
     * @return serverip
     */
    public java.lang.String getServerip() {
        return serverip;
    }


    /**
     * Sets the serverip value for this Auditnslogaction.
     * 
     * @param serverip
     */
    public void setServerip(java.lang.String serverip) {
        this.serverip = serverip;
    }


    /**
     * Gets the serverport value for this Auditnslogaction.
     * 
     * @return serverport
     */
    public org.apache.axis.types.UnsignedInt getServerport() {
        return serverport;
    }


    /**
     * Sets the serverport value for this Auditnslogaction.
     * 
     * @param serverport
     */
    public void setServerport(org.apache.axis.types.UnsignedInt serverport) {
        this.serverport = serverport;
    }


    /**
     * Gets the loglevel value for this Auditnslogaction.
     * 
     * @return loglevel
     */
    public java.lang.String getLoglevel() {
        return loglevel;
    }


    /**
     * Sets the loglevel value for this Auditnslogaction.
     * 
     * @param loglevel
     */
    public void setLoglevel(java.lang.String loglevel) {
        this.loglevel = loglevel;
    }


    /**
     * Gets the dateformat value for this Auditnslogaction.
     * 
     * @return dateformat
     */
    public java.lang.String getDateformat() {
        return dateformat;
    }


    /**
     * Sets the dateformat value for this Auditnslogaction.
     * 
     * @param dateformat
     */
    public void setDateformat(java.lang.String dateformat) {
        this.dateformat = dateformat;
    }


    /**
     * Gets the logfacility value for this Auditnslogaction.
     * 
     * @return logfacility
     */
    public java.lang.String getLogfacility() {
        return logfacility;
    }


    /**
     * Sets the logfacility value for this Auditnslogaction.
     * 
     * @param logfacility
     */
    public void setLogfacility(java.lang.String logfacility) {
        this.logfacility = logfacility;
    }


    /**
     * Gets the tcp value for this Auditnslogaction.
     * 
     * @return tcp
     */
    public java.lang.String getTcp() {
        return tcp;
    }


    /**
     * Sets the tcp value for this Auditnslogaction.
     * 
     * @param tcp
     */
    public void setTcp(java.lang.String tcp) {
        this.tcp = tcp;
    }


    /**
     * Gets the acl value for this Auditnslogaction.
     * 
     * @return acl
     */
    public java.lang.String getAcl() {
        return acl;
    }


    /**
     * Sets the acl value for this Auditnslogaction.
     * 
     * @param acl
     */
    public void setAcl(java.lang.String acl) {
        this.acl = acl;
    }


    /**
     * Gets the timezone value for this Auditnslogaction.
     * 
     * @return timezone
     */
    public java.lang.String getTimezone() {
        return timezone;
    }


    /**
     * Sets the timezone value for this Auditnslogaction.
     * 
     * @param timezone
     */
    public void setTimezone(java.lang.String timezone) {
        this.timezone = timezone;
    }


    /**
     * Gets the userdefinedauditlog value for this Auditnslogaction.
     * 
     * @return userdefinedauditlog
     */
    public java.lang.String getUserdefinedauditlog() {
        return userdefinedauditlog;
    }


    /**
     * Sets the userdefinedauditlog value for this Auditnslogaction.
     * 
     * @param userdefinedauditlog
     */
    public void setUserdefinedauditlog(java.lang.String userdefinedauditlog) {
        this.userdefinedauditlog = userdefinedauditlog;
    }


    /**
     * Gets the appflowexport value for this Auditnslogaction.
     * 
     * @return appflowexport
     */
    public java.lang.String getAppflowexport() {
        return appflowexport;
    }


    /**
     * Sets the appflowexport value for this Auditnslogaction.
     * 
     * @param appflowexport
     */
    public void setAppflowexport(java.lang.String appflowexport) {
        this.appflowexport = appflowexport;
    }


    /**
     * Gets the builtin value for this Auditnslogaction.
     * 
     * @return builtin
     */
    public java.lang.String getBuiltin() {
        return builtin;
    }


    /**
     * Sets the builtin value for this Auditnslogaction.
     * 
     * @param builtin
     */
    public void setBuiltin(java.lang.String builtin) {
        this.builtin = builtin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Auditnslogaction)) return false;
        Auditnslogaction other = (Auditnslogaction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.serverip==null && other.getServerip()==null) || 
             (this.serverip!=null &&
              this.serverip.equals(other.getServerip()))) &&
            ((this.serverport==null && other.getServerport()==null) || 
             (this.serverport!=null &&
              this.serverport.equals(other.getServerport()))) &&
            ((this.loglevel==null && other.getLoglevel()==null) || 
             (this.loglevel!=null &&
              this.loglevel.equals(other.getLoglevel()))) &&
            ((this.dateformat==null && other.getDateformat()==null) || 
             (this.dateformat!=null &&
              this.dateformat.equals(other.getDateformat()))) &&
            ((this.logfacility==null && other.getLogfacility()==null) || 
             (this.logfacility!=null &&
              this.logfacility.equals(other.getLogfacility()))) &&
            ((this.tcp==null && other.getTcp()==null) || 
             (this.tcp!=null &&
              this.tcp.equals(other.getTcp()))) &&
            ((this.acl==null && other.getAcl()==null) || 
             (this.acl!=null &&
              this.acl.equals(other.getAcl()))) &&
            ((this.timezone==null && other.getTimezone()==null) || 
             (this.timezone!=null &&
              this.timezone.equals(other.getTimezone()))) &&
            ((this.userdefinedauditlog==null && other.getUserdefinedauditlog()==null) || 
             (this.userdefinedauditlog!=null &&
              this.userdefinedauditlog.equals(other.getUserdefinedauditlog()))) &&
            ((this.appflowexport==null && other.getAppflowexport()==null) || 
             (this.appflowexport!=null &&
              this.appflowexport.equals(other.getAppflowexport()))) &&
            ((this.builtin==null && other.getBuiltin()==null) || 
             (this.builtin!=null &&
              this.builtin.equals(other.getBuiltin())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getServerip() != null) {
            _hashCode += getServerip().hashCode();
        }
        if (getServerport() != null) {
            _hashCode += getServerport().hashCode();
        }
        if (getLoglevel() != null) {
            _hashCode += getLoglevel().hashCode();
        }
        if (getDateformat() != null) {
            _hashCode += getDateformat().hashCode();
        }
        if (getLogfacility() != null) {
            _hashCode += getLogfacility().hashCode();
        }
        if (getTcp() != null) {
            _hashCode += getTcp().hashCode();
        }
        if (getAcl() != null) {
            _hashCode += getAcl().hashCode();
        }
        if (getTimezone() != null) {
            _hashCode += getTimezone().hashCode();
        }
        if (getUserdefinedauditlog() != null) {
            _hashCode += getUserdefinedauditlog().hashCode();
        }
        if (getAppflowexport() != null) {
            _hashCode += getAppflowexport().hashCode();
        }
        if (getBuiltin() != null) {
            _hashCode += getBuiltin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Auditnslogaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "auditnslogaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("loglevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loglevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateformat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateformat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logfacility");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logfacility"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tcp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timezone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timezone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userdefinedauditlog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userdefinedauditlog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appflowexport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appflowexport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builtin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "builtin"));
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
