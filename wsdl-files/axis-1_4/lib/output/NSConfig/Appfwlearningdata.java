/**
 * Appfwlearningdata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Appfwlearningdata  implements java.io.Serializable {
    private java.lang.String profilename;

    private java.lang.String securitycheck;

    private java.lang.String data;

    public Appfwlearningdata() {
    }

    public Appfwlearningdata(
           java.lang.String profilename,
           java.lang.String securitycheck,
           java.lang.String data) {
           this.profilename = profilename;
           this.securitycheck = securitycheck;
           this.data = data;
    }


    /**
     * Gets the profilename value for this Appfwlearningdata.
     * 
     * @return profilename
     */
    public java.lang.String getProfilename() {
        return profilename;
    }


    /**
     * Sets the profilename value for this Appfwlearningdata.
     * 
     * @param profilename
     */
    public void setProfilename(java.lang.String profilename) {
        this.profilename = profilename;
    }


    /**
     * Gets the securitycheck value for this Appfwlearningdata.
     * 
     * @return securitycheck
     */
    public java.lang.String getSecuritycheck() {
        return securitycheck;
    }


    /**
     * Sets the securitycheck value for this Appfwlearningdata.
     * 
     * @param securitycheck
     */
    public void setSecuritycheck(java.lang.String securitycheck) {
        this.securitycheck = securitycheck;
    }


    /**
     * Gets the data value for this Appfwlearningdata.
     * 
     * @return data
     */
    public java.lang.String getData() {
        return data;
    }


    /**
     * Sets the data value for this Appfwlearningdata.
     * 
     * @param data
     */
    public void setData(java.lang.String data) {
        this.data = data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Appfwlearningdata)) return false;
        Appfwlearningdata other = (Appfwlearningdata) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.profilename==null && other.getProfilename()==null) || 
             (this.profilename!=null &&
              this.profilename.equals(other.getProfilename()))) &&
            ((this.securitycheck==null && other.getSecuritycheck()==null) || 
             (this.securitycheck!=null &&
              this.securitycheck.equals(other.getSecuritycheck()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData())));
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
        if (getProfilename() != null) {
            _hashCode += getProfilename().hashCode();
        }
        if (getSecuritycheck() != null) {
            _hashCode += getSecuritycheck().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Appfwlearningdata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "appfwlearningdata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profilename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profilename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securitycheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "securitycheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
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
