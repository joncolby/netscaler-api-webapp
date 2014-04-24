/**
 * Snmpuser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Snmpuser  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String group;

    private java.lang.String authtype;

    private java.lang.String privtype;

    private java.lang.String engineid;

    private java.lang.String storagetype;

    private java.lang.String status;

    public Snmpuser() {
    }

    public Snmpuser(
           java.lang.String name,
           java.lang.String group,
           java.lang.String authtype,
           java.lang.String privtype,
           java.lang.String engineid,
           java.lang.String storagetype,
           java.lang.String status) {
           this.name = name;
           this.group = group;
           this.authtype = authtype;
           this.privtype = privtype;
           this.engineid = engineid;
           this.storagetype = storagetype;
           this.status = status;
    }


    /**
     * Gets the name value for this Snmpuser.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Snmpuser.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the group value for this Snmpuser.
     * 
     * @return group
     */
    public java.lang.String getGroup() {
        return group;
    }


    /**
     * Sets the group value for this Snmpuser.
     * 
     * @param group
     */
    public void setGroup(java.lang.String group) {
        this.group = group;
    }


    /**
     * Gets the authtype value for this Snmpuser.
     * 
     * @return authtype
     */
    public java.lang.String getAuthtype() {
        return authtype;
    }


    /**
     * Sets the authtype value for this Snmpuser.
     * 
     * @param authtype
     */
    public void setAuthtype(java.lang.String authtype) {
        this.authtype = authtype;
    }


    /**
     * Gets the privtype value for this Snmpuser.
     * 
     * @return privtype
     */
    public java.lang.String getPrivtype() {
        return privtype;
    }


    /**
     * Sets the privtype value for this Snmpuser.
     * 
     * @param privtype
     */
    public void setPrivtype(java.lang.String privtype) {
        this.privtype = privtype;
    }


    /**
     * Gets the engineid value for this Snmpuser.
     * 
     * @return engineid
     */
    public java.lang.String getEngineid() {
        return engineid;
    }


    /**
     * Sets the engineid value for this Snmpuser.
     * 
     * @param engineid
     */
    public void setEngineid(java.lang.String engineid) {
        this.engineid = engineid;
    }


    /**
     * Gets the storagetype value for this Snmpuser.
     * 
     * @return storagetype
     */
    public java.lang.String getStoragetype() {
        return storagetype;
    }


    /**
     * Sets the storagetype value for this Snmpuser.
     * 
     * @param storagetype
     */
    public void setStoragetype(java.lang.String storagetype) {
        this.storagetype = storagetype;
    }


    /**
     * Gets the status value for this Snmpuser.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Snmpuser.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Snmpuser)) return false;
        Snmpuser other = (Snmpuser) obj;
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
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.authtype==null && other.getAuthtype()==null) || 
             (this.authtype!=null &&
              this.authtype.equals(other.getAuthtype()))) &&
            ((this.privtype==null && other.getPrivtype()==null) || 
             (this.privtype!=null &&
              this.privtype.equals(other.getPrivtype()))) &&
            ((this.engineid==null && other.getEngineid()==null) || 
             (this.engineid!=null &&
              this.engineid.equals(other.getEngineid()))) &&
            ((this.storagetype==null && other.getStoragetype()==null) || 
             (this.storagetype!=null &&
              this.storagetype.equals(other.getStoragetype()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getAuthtype() != null) {
            _hashCode += getAuthtype().hashCode();
        }
        if (getPrivtype() != null) {
            _hashCode += getPrivtype().hashCode();
        }
        if (getEngineid() != null) {
            _hashCode += getEngineid().hashCode();
        }
        if (getStoragetype() != null) {
            _hashCode += getStoragetype().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Snmpuser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "snmpuser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "privtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("engineid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "engineid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storagetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storagetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
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
