/**
 * Authenticationcertaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Authenticationcertaction  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String twofactor;

    private java.lang.String usernamefield;

    private java.lang.String groupnamefield;

    private java.lang.String defaultauthenticationgroup;

    public Authenticationcertaction() {
    }

    public Authenticationcertaction(
           java.lang.String name,
           java.lang.String twofactor,
           java.lang.String usernamefield,
           java.lang.String groupnamefield,
           java.lang.String defaultauthenticationgroup) {
           this.name = name;
           this.twofactor = twofactor;
           this.usernamefield = usernamefield;
           this.groupnamefield = groupnamefield;
           this.defaultauthenticationgroup = defaultauthenticationgroup;
    }


    /**
     * Gets the name value for this Authenticationcertaction.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Authenticationcertaction.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the twofactor value for this Authenticationcertaction.
     * 
     * @return twofactor
     */
    public java.lang.String getTwofactor() {
        return twofactor;
    }


    /**
     * Sets the twofactor value for this Authenticationcertaction.
     * 
     * @param twofactor
     */
    public void setTwofactor(java.lang.String twofactor) {
        this.twofactor = twofactor;
    }


    /**
     * Gets the usernamefield value for this Authenticationcertaction.
     * 
     * @return usernamefield
     */
    public java.lang.String getUsernamefield() {
        return usernamefield;
    }


    /**
     * Sets the usernamefield value for this Authenticationcertaction.
     * 
     * @param usernamefield
     */
    public void setUsernamefield(java.lang.String usernamefield) {
        this.usernamefield = usernamefield;
    }


    /**
     * Gets the groupnamefield value for this Authenticationcertaction.
     * 
     * @return groupnamefield
     */
    public java.lang.String getGroupnamefield() {
        return groupnamefield;
    }


    /**
     * Sets the groupnamefield value for this Authenticationcertaction.
     * 
     * @param groupnamefield
     */
    public void setGroupnamefield(java.lang.String groupnamefield) {
        this.groupnamefield = groupnamefield;
    }


    /**
     * Gets the defaultauthenticationgroup value for this Authenticationcertaction.
     * 
     * @return defaultauthenticationgroup
     */
    public java.lang.String getDefaultauthenticationgroup() {
        return defaultauthenticationgroup;
    }


    /**
     * Sets the defaultauthenticationgroup value for this Authenticationcertaction.
     * 
     * @param defaultauthenticationgroup
     */
    public void setDefaultauthenticationgroup(java.lang.String defaultauthenticationgroup) {
        this.defaultauthenticationgroup = defaultauthenticationgroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Authenticationcertaction)) return false;
        Authenticationcertaction other = (Authenticationcertaction) obj;
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
            ((this.twofactor==null && other.getTwofactor()==null) || 
             (this.twofactor!=null &&
              this.twofactor.equals(other.getTwofactor()))) &&
            ((this.usernamefield==null && other.getUsernamefield()==null) || 
             (this.usernamefield!=null &&
              this.usernamefield.equals(other.getUsernamefield()))) &&
            ((this.groupnamefield==null && other.getGroupnamefield()==null) || 
             (this.groupnamefield!=null &&
              this.groupnamefield.equals(other.getGroupnamefield()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getTwofactor() != null) {
            _hashCode += getTwofactor().hashCode();
        }
        if (getUsernamefield() != null) {
            _hashCode += getUsernamefield().hashCode();
        }
        if (getGroupnamefield() != null) {
            _hashCode += getGroupnamefield().hashCode();
        }
        if (getDefaultauthenticationgroup() != null) {
            _hashCode += getDefaultauthenticationgroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Authenticationcertaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "authenticationcertaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("twofactor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "twofactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usernamefield");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usernamefield"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupnamefield");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupnamefield"));
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
