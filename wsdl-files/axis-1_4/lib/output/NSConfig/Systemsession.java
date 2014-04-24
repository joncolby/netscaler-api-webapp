/**
 * Systemsession.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Systemsession  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt sid;

    private java.lang.String username;

    private java.lang.String logintime;

    private java.lang.String lastactivitytime;

    private int expirytime;

    private org.apache.axis.types.UnsignedInt numofconnections;

    private boolean currentconn;

    public Systemsession() {
    }

    public Systemsession(
           org.apache.axis.types.UnsignedInt sid,
           java.lang.String username,
           java.lang.String logintime,
           java.lang.String lastactivitytime,
           int expirytime,
           org.apache.axis.types.UnsignedInt numofconnections,
           boolean currentconn) {
           this.sid = sid;
           this.username = username;
           this.logintime = logintime;
           this.lastactivitytime = lastactivitytime;
           this.expirytime = expirytime;
           this.numofconnections = numofconnections;
           this.currentconn = currentconn;
    }


    /**
     * Gets the sid value for this Systemsession.
     * 
     * @return sid
     */
    public org.apache.axis.types.UnsignedInt getSid() {
        return sid;
    }


    /**
     * Sets the sid value for this Systemsession.
     * 
     * @param sid
     */
    public void setSid(org.apache.axis.types.UnsignedInt sid) {
        this.sid = sid;
    }


    /**
     * Gets the username value for this Systemsession.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this Systemsession.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the logintime value for this Systemsession.
     * 
     * @return logintime
     */
    public java.lang.String getLogintime() {
        return logintime;
    }


    /**
     * Sets the logintime value for this Systemsession.
     * 
     * @param logintime
     */
    public void setLogintime(java.lang.String logintime) {
        this.logintime = logintime;
    }


    /**
     * Gets the lastactivitytime value for this Systemsession.
     * 
     * @return lastactivitytime
     */
    public java.lang.String getLastactivitytime() {
        return lastactivitytime;
    }


    /**
     * Sets the lastactivitytime value for this Systemsession.
     * 
     * @param lastactivitytime
     */
    public void setLastactivitytime(java.lang.String lastactivitytime) {
        this.lastactivitytime = lastactivitytime;
    }


    /**
     * Gets the expirytime value for this Systemsession.
     * 
     * @return expirytime
     */
    public int getExpirytime() {
        return expirytime;
    }


    /**
     * Sets the expirytime value for this Systemsession.
     * 
     * @param expirytime
     */
    public void setExpirytime(int expirytime) {
        this.expirytime = expirytime;
    }


    /**
     * Gets the numofconnections value for this Systemsession.
     * 
     * @return numofconnections
     */
    public org.apache.axis.types.UnsignedInt getNumofconnections() {
        return numofconnections;
    }


    /**
     * Sets the numofconnections value for this Systemsession.
     * 
     * @param numofconnections
     */
    public void setNumofconnections(org.apache.axis.types.UnsignedInt numofconnections) {
        this.numofconnections = numofconnections;
    }


    /**
     * Gets the currentconn value for this Systemsession.
     * 
     * @return currentconn
     */
    public boolean isCurrentconn() {
        return currentconn;
    }


    /**
     * Sets the currentconn value for this Systemsession.
     * 
     * @param currentconn
     */
    public void setCurrentconn(boolean currentconn) {
        this.currentconn = currentconn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Systemsession)) return false;
        Systemsession other = (Systemsession) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sid==null && other.getSid()==null) || 
             (this.sid!=null &&
              this.sid.equals(other.getSid()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.logintime==null && other.getLogintime()==null) || 
             (this.logintime!=null &&
              this.logintime.equals(other.getLogintime()))) &&
            ((this.lastactivitytime==null && other.getLastactivitytime()==null) || 
             (this.lastactivitytime!=null &&
              this.lastactivitytime.equals(other.getLastactivitytime()))) &&
            this.expirytime == other.getExpirytime() &&
            ((this.numofconnections==null && other.getNumofconnections()==null) || 
             (this.numofconnections!=null &&
              this.numofconnections.equals(other.getNumofconnections()))) &&
            this.currentconn == other.isCurrentconn();
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
        if (getSid() != null) {
            _hashCode += getSid().hashCode();
        }
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getLogintime() != null) {
            _hashCode += getLogintime().hashCode();
        }
        if (getLastactivitytime() != null) {
            _hashCode += getLastactivitytime().hashCode();
        }
        _hashCode += getExpirytime();
        if (getNumofconnections() != null) {
            _hashCode += getNumofconnections().hashCode();
        }
        _hashCode += (isCurrentconn() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Systemsession.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "systemsession"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logintime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logintime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastactivitytime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastactivitytime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirytime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirytime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numofconnections");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numofconnections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentconn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentconn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
