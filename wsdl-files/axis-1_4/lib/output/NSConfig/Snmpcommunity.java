/**
 * Snmpcommunity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Snmpcommunity  implements java.io.Serializable {
    private java.lang.String communityname;

    private java.lang.String permissions;

    public Snmpcommunity() {
    }

    public Snmpcommunity(
           java.lang.String communityname,
           java.lang.String permissions) {
           this.communityname = communityname;
           this.permissions = permissions;
    }


    /**
     * Gets the communityname value for this Snmpcommunity.
     * 
     * @return communityname
     */
    public java.lang.String getCommunityname() {
        return communityname;
    }


    /**
     * Sets the communityname value for this Snmpcommunity.
     * 
     * @param communityname
     */
    public void setCommunityname(java.lang.String communityname) {
        this.communityname = communityname;
    }


    /**
     * Gets the permissions value for this Snmpcommunity.
     * 
     * @return permissions
     */
    public java.lang.String getPermissions() {
        return permissions;
    }


    /**
     * Sets the permissions value for this Snmpcommunity.
     * 
     * @param permissions
     */
    public void setPermissions(java.lang.String permissions) {
        this.permissions = permissions;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Snmpcommunity)) return false;
        Snmpcommunity other = (Snmpcommunity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.communityname==null && other.getCommunityname()==null) || 
             (this.communityname!=null &&
              this.communityname.equals(other.getCommunityname()))) &&
            ((this.permissions==null && other.getPermissions()==null) || 
             (this.permissions!=null &&
              this.permissions.equals(other.getPermissions())));
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
        if (getCommunityname() != null) {
            _hashCode += getCommunityname().hashCode();
        }
        if (getPermissions() != null) {
            _hashCode += getPermissions().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Snmpcommunity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "snmpcommunity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communityname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "communityname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permissions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "permissions"));
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
