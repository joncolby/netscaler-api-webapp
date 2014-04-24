/**
 * Nsdiameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nsdiameter  implements java.io.Serializable {
    private java.lang.String identity;

    private java.lang.String realm;

    private java.lang.String serverclosepropagation;

    public Nsdiameter() {
    }

    public Nsdiameter(
           java.lang.String identity,
           java.lang.String realm,
           java.lang.String serverclosepropagation) {
           this.identity = identity;
           this.realm = realm;
           this.serverclosepropagation = serverclosepropagation;
    }


    /**
     * Gets the identity value for this Nsdiameter.
     * 
     * @return identity
     */
    public java.lang.String getIdentity() {
        return identity;
    }


    /**
     * Sets the identity value for this Nsdiameter.
     * 
     * @param identity
     */
    public void setIdentity(java.lang.String identity) {
        this.identity = identity;
    }


    /**
     * Gets the realm value for this Nsdiameter.
     * 
     * @return realm
     */
    public java.lang.String getRealm() {
        return realm;
    }


    /**
     * Sets the realm value for this Nsdiameter.
     * 
     * @param realm
     */
    public void setRealm(java.lang.String realm) {
        this.realm = realm;
    }


    /**
     * Gets the serverclosepropagation value for this Nsdiameter.
     * 
     * @return serverclosepropagation
     */
    public java.lang.String getServerclosepropagation() {
        return serverclosepropagation;
    }


    /**
     * Sets the serverclosepropagation value for this Nsdiameter.
     * 
     * @param serverclosepropagation
     */
    public void setServerclosepropagation(java.lang.String serverclosepropagation) {
        this.serverclosepropagation = serverclosepropagation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nsdiameter)) return false;
        Nsdiameter other = (Nsdiameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identity==null && other.getIdentity()==null) || 
             (this.identity!=null &&
              this.identity.equals(other.getIdentity()))) &&
            ((this.realm==null && other.getRealm()==null) || 
             (this.realm!=null &&
              this.realm.equals(other.getRealm()))) &&
            ((this.serverclosepropagation==null && other.getServerclosepropagation()==null) || 
             (this.serverclosepropagation!=null &&
              this.serverclosepropagation.equals(other.getServerclosepropagation())));
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
        if (getIdentity() != null) {
            _hashCode += getIdentity().hashCode();
        }
        if (getRealm() != null) {
            _hashCode += getRealm().hashCode();
        }
        if (getServerclosepropagation() != null) {
            _hashCode += getServerclosepropagation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nsdiameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nsdiameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverclosepropagation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverclosepropagation"));
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
