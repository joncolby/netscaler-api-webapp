/**
 * Snmpoid.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Snmpoid  implements java.io.Serializable {
    private java.lang.String entitytype;

    private java.lang.String name;

    private java.lang.String snmpoid;

    public Snmpoid() {
    }

    public Snmpoid(
           java.lang.String entitytype,
           java.lang.String name,
           java.lang.String snmpoid) {
           this.entitytype = entitytype;
           this.name = name;
           this.snmpoid = snmpoid;
    }


    /**
     * Gets the entitytype value for this Snmpoid.
     * 
     * @return entitytype
     */
    public java.lang.String getEntitytype() {
        return entitytype;
    }


    /**
     * Sets the entitytype value for this Snmpoid.
     * 
     * @param entitytype
     */
    public void setEntitytype(java.lang.String entitytype) {
        this.entitytype = entitytype;
    }


    /**
     * Gets the name value for this Snmpoid.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Snmpoid.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the snmpoid value for this Snmpoid.
     * 
     * @return snmpoid
     */
    public java.lang.String getSnmpoid() {
        return snmpoid;
    }


    /**
     * Sets the snmpoid value for this Snmpoid.
     * 
     * @param snmpoid
     */
    public void setSnmpoid(java.lang.String snmpoid) {
        this.snmpoid = snmpoid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Snmpoid)) return false;
        Snmpoid other = (Snmpoid) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entitytype==null && other.getEntitytype()==null) || 
             (this.entitytype!=null &&
              this.entitytype.equals(other.getEntitytype()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.snmpoid==null && other.getSnmpoid()==null) || 
             (this.snmpoid!=null &&
              this.snmpoid.equals(other.getSnmpoid())));
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
        if (getEntitytype() != null) {
            _hashCode += getEntitytype().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSnmpoid() != null) {
            _hashCode += getSnmpoid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Snmpoid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "snmpoid"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entitytype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entitytype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snmpoid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "snmpoid"));
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
