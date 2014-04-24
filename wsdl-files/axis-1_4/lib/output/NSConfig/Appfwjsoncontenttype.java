/**
 * Appfwjsoncontenttype.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Appfwjsoncontenttype  implements java.io.Serializable {
    private java.lang.String jsoncontenttypevalue;

    private java.lang.String isregex;

    private java.lang.String builtin;

    public Appfwjsoncontenttype() {
    }

    public Appfwjsoncontenttype(
           java.lang.String jsoncontenttypevalue,
           java.lang.String isregex,
           java.lang.String builtin) {
           this.jsoncontenttypevalue = jsoncontenttypevalue;
           this.isregex = isregex;
           this.builtin = builtin;
    }


    /**
     * Gets the jsoncontenttypevalue value for this Appfwjsoncontenttype.
     * 
     * @return jsoncontenttypevalue
     */
    public java.lang.String getJsoncontenttypevalue() {
        return jsoncontenttypevalue;
    }


    /**
     * Sets the jsoncontenttypevalue value for this Appfwjsoncontenttype.
     * 
     * @param jsoncontenttypevalue
     */
    public void setJsoncontenttypevalue(java.lang.String jsoncontenttypevalue) {
        this.jsoncontenttypevalue = jsoncontenttypevalue;
    }


    /**
     * Gets the isregex value for this Appfwjsoncontenttype.
     * 
     * @return isregex
     */
    public java.lang.String getIsregex() {
        return isregex;
    }


    /**
     * Sets the isregex value for this Appfwjsoncontenttype.
     * 
     * @param isregex
     */
    public void setIsregex(java.lang.String isregex) {
        this.isregex = isregex;
    }


    /**
     * Gets the builtin value for this Appfwjsoncontenttype.
     * 
     * @return builtin
     */
    public java.lang.String getBuiltin() {
        return builtin;
    }


    /**
     * Sets the builtin value for this Appfwjsoncontenttype.
     * 
     * @param builtin
     */
    public void setBuiltin(java.lang.String builtin) {
        this.builtin = builtin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Appfwjsoncontenttype)) return false;
        Appfwjsoncontenttype other = (Appfwjsoncontenttype) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.jsoncontenttypevalue==null && other.getJsoncontenttypevalue()==null) || 
             (this.jsoncontenttypevalue!=null &&
              this.jsoncontenttypevalue.equals(other.getJsoncontenttypevalue()))) &&
            ((this.isregex==null && other.getIsregex()==null) || 
             (this.isregex!=null &&
              this.isregex.equals(other.getIsregex()))) &&
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
        if (getJsoncontenttypevalue() != null) {
            _hashCode += getJsoncontenttypevalue().hashCode();
        }
        if (getIsregex() != null) {
            _hashCode += getIsregex().hashCode();
        }
        if (getBuiltin() != null) {
            _hashCode += getBuiltin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Appfwjsoncontenttype.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "appfwjsoncontenttype"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jsoncontenttypevalue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "jsoncontenttypevalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isregex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isregex"));
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
