/**
 * Policypatset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Policypatset  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String[] strinG;

    private org.apache.axis.types.UnsignedInt[] index;

    private java.lang.String[] charset;

    private java.lang.String description;

    private java.lang.String indextype;

    private java.lang.String[] builtin;

    public Policypatset() {
    }

    public Policypatset(
           java.lang.String name,
           java.lang.String[] strinG,
           org.apache.axis.types.UnsignedInt[] index,
           java.lang.String[] charset,
           java.lang.String description,
           java.lang.String indextype,
           java.lang.String[] builtin) {
           this.name = name;
           this.strinG = strinG;
           this.index = index;
           this.charset = charset;
           this.description = description;
           this.indextype = indextype;
           this.builtin = builtin;
    }


    /**
     * Gets the name value for this Policypatset.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Policypatset.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the strinG value for this Policypatset.
     * 
     * @return strinG
     */
    public java.lang.String[] getStrinG() {
        return strinG;
    }


    /**
     * Sets the strinG value for this Policypatset.
     * 
     * @param strinG
     */
    public void setStrinG(java.lang.String[] strinG) {
        this.strinG = strinG;
    }


    /**
     * Gets the index value for this Policypatset.
     * 
     * @return index
     */
    public org.apache.axis.types.UnsignedInt[] getIndex() {
        return index;
    }


    /**
     * Sets the index value for this Policypatset.
     * 
     * @param index
     */
    public void setIndex(org.apache.axis.types.UnsignedInt[] index) {
        this.index = index;
    }


    /**
     * Gets the charset value for this Policypatset.
     * 
     * @return charset
     */
    public java.lang.String[] getCharset() {
        return charset;
    }


    /**
     * Sets the charset value for this Policypatset.
     * 
     * @param charset
     */
    public void setCharset(java.lang.String[] charset) {
        this.charset = charset;
    }


    /**
     * Gets the description value for this Policypatset.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Policypatset.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the indextype value for this Policypatset.
     * 
     * @return indextype
     */
    public java.lang.String getIndextype() {
        return indextype;
    }


    /**
     * Sets the indextype value for this Policypatset.
     * 
     * @param indextype
     */
    public void setIndextype(java.lang.String indextype) {
        this.indextype = indextype;
    }


    /**
     * Gets the builtin value for this Policypatset.
     * 
     * @return builtin
     */
    public java.lang.String[] getBuiltin() {
        return builtin;
    }


    /**
     * Sets the builtin value for this Policypatset.
     * 
     * @param builtin
     */
    public void setBuiltin(java.lang.String[] builtin) {
        this.builtin = builtin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Policypatset)) return false;
        Policypatset other = (Policypatset) obj;
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
            ((this.strinG==null && other.getStrinG()==null) || 
             (this.strinG!=null &&
              java.util.Arrays.equals(this.strinG, other.getStrinG()))) &&
            ((this.index==null && other.getIndex()==null) || 
             (this.index!=null &&
              java.util.Arrays.equals(this.index, other.getIndex()))) &&
            ((this.charset==null && other.getCharset()==null) || 
             (this.charset!=null &&
              java.util.Arrays.equals(this.charset, other.getCharset()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.indextype==null && other.getIndextype()==null) || 
             (this.indextype!=null &&
              this.indextype.equals(other.getIndextype()))) &&
            ((this.builtin==null && other.getBuiltin()==null) || 
             (this.builtin!=null &&
              java.util.Arrays.equals(this.builtin, other.getBuiltin())));
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
        if (getStrinG() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStrinG());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStrinG(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIndex() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIndex());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIndex(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCharset() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCharset());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCharset(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getIndextype() != null) {
            _hashCode += getIndextype().hashCode();
        }
        if (getBuiltin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBuiltin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBuiltin(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Policypatset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "policypatset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strinG");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strinG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("index");
        elemField.setXmlName(new javax.xml.namespace.QName("", "index"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("charset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "charset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indextype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indextype"));
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
