/**
 * Snmpgroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Snmpgroup  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String securitylevel;

    private java.lang.String readviewname;

    private java.lang.String storagetype;

    private java.lang.String status;

    public Snmpgroup() {
    }

    public Snmpgroup(
           java.lang.String name,
           java.lang.String securitylevel,
           java.lang.String readviewname,
           java.lang.String storagetype,
           java.lang.String status) {
           this.name = name;
           this.securitylevel = securitylevel;
           this.readviewname = readviewname;
           this.storagetype = storagetype;
           this.status = status;
    }


    /**
     * Gets the name value for this Snmpgroup.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Snmpgroup.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the securitylevel value for this Snmpgroup.
     * 
     * @return securitylevel
     */
    public java.lang.String getSecuritylevel() {
        return securitylevel;
    }


    /**
     * Sets the securitylevel value for this Snmpgroup.
     * 
     * @param securitylevel
     */
    public void setSecuritylevel(java.lang.String securitylevel) {
        this.securitylevel = securitylevel;
    }


    /**
     * Gets the readviewname value for this Snmpgroup.
     * 
     * @return readviewname
     */
    public java.lang.String getReadviewname() {
        return readviewname;
    }


    /**
     * Sets the readviewname value for this Snmpgroup.
     * 
     * @param readviewname
     */
    public void setReadviewname(java.lang.String readviewname) {
        this.readviewname = readviewname;
    }


    /**
     * Gets the storagetype value for this Snmpgroup.
     * 
     * @return storagetype
     */
    public java.lang.String getStoragetype() {
        return storagetype;
    }


    /**
     * Sets the storagetype value for this Snmpgroup.
     * 
     * @param storagetype
     */
    public void setStoragetype(java.lang.String storagetype) {
        this.storagetype = storagetype;
    }


    /**
     * Gets the status value for this Snmpgroup.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Snmpgroup.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Snmpgroup)) return false;
        Snmpgroup other = (Snmpgroup) obj;
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
            ((this.securitylevel==null && other.getSecuritylevel()==null) || 
             (this.securitylevel!=null &&
              this.securitylevel.equals(other.getSecuritylevel()))) &&
            ((this.readviewname==null && other.getReadviewname()==null) || 
             (this.readviewname!=null &&
              this.readviewname.equals(other.getReadviewname()))) &&
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
        if (getSecuritylevel() != null) {
            _hashCode += getSecuritylevel().hashCode();
        }
        if (getReadviewname() != null) {
            _hashCode += getReadviewname().hashCode();
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
        new org.apache.axis.description.TypeDesc(Snmpgroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "snmpgroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securitylevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "securitylevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("readviewname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "readviewname"));
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
