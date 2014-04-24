/**
 * Policyexpression.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Policyexpression  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String type;

    private java.lang.String value;

    private org.apache.axis.types.UnsignedInt hits;

    private org.apache.axis.types.UnsignedInt pihits;

    private java.lang.String type2;

    private java.lang.String clientsecuritymessage;

    private java.lang.String description;

    private java.lang.String comment;

    private boolean isdefault;

    private java.lang.String builtin;

    public Policyexpression() {
    }

    public Policyexpression(
           java.lang.String name,
           java.lang.String type,
           java.lang.String value,
           org.apache.axis.types.UnsignedInt hits,
           org.apache.axis.types.UnsignedInt pihits,
           java.lang.String type2,
           java.lang.String clientsecuritymessage,
           java.lang.String description,
           java.lang.String comment,
           boolean isdefault,
           java.lang.String builtin) {
           this.name = name;
           this.type = type;
           this.value = value;
           this.hits = hits;
           this.pihits = pihits;
           this.type2 = type2;
           this.clientsecuritymessage = clientsecuritymessage;
           this.description = description;
           this.comment = comment;
           this.isdefault = isdefault;
           this.builtin = builtin;
    }


    /**
     * Gets the name value for this Policyexpression.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Policyexpression.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the type value for this Policyexpression.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Policyexpression.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the value value for this Policyexpression.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this Policyexpression.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the hits value for this Policyexpression.
     * 
     * @return hits
     */
    public org.apache.axis.types.UnsignedInt getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this Policyexpression.
     * 
     * @param hits
     */
    public void setHits(org.apache.axis.types.UnsignedInt hits) {
        this.hits = hits;
    }


    /**
     * Gets the pihits value for this Policyexpression.
     * 
     * @return pihits
     */
    public org.apache.axis.types.UnsignedInt getPihits() {
        return pihits;
    }


    /**
     * Sets the pihits value for this Policyexpression.
     * 
     * @param pihits
     */
    public void setPihits(org.apache.axis.types.UnsignedInt pihits) {
        this.pihits = pihits;
    }


    /**
     * Gets the type2 value for this Policyexpression.
     * 
     * @return type2
     */
    public java.lang.String getType2() {
        return type2;
    }


    /**
     * Sets the type2 value for this Policyexpression.
     * 
     * @param type2
     */
    public void setType2(java.lang.String type2) {
        this.type2 = type2;
    }


    /**
     * Gets the clientsecuritymessage value for this Policyexpression.
     * 
     * @return clientsecuritymessage
     */
    public java.lang.String getClientsecuritymessage() {
        return clientsecuritymessage;
    }


    /**
     * Sets the clientsecuritymessage value for this Policyexpression.
     * 
     * @param clientsecuritymessage
     */
    public void setClientsecuritymessage(java.lang.String clientsecuritymessage) {
        this.clientsecuritymessage = clientsecuritymessage;
    }


    /**
     * Gets the description value for this Policyexpression.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Policyexpression.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the comment value for this Policyexpression.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Policyexpression.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the isdefault value for this Policyexpression.
     * 
     * @return isdefault
     */
    public boolean isIsdefault() {
        return isdefault;
    }


    /**
     * Sets the isdefault value for this Policyexpression.
     * 
     * @param isdefault
     */
    public void setIsdefault(boolean isdefault) {
        this.isdefault = isdefault;
    }


    /**
     * Gets the builtin value for this Policyexpression.
     * 
     * @return builtin
     */
    public java.lang.String getBuiltin() {
        return builtin;
    }


    /**
     * Sets the builtin value for this Policyexpression.
     * 
     * @param builtin
     */
    public void setBuiltin(java.lang.String builtin) {
        this.builtin = builtin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Policyexpression)) return false;
        Policyexpression other = (Policyexpression) obj;
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
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.hits==null && other.getHits()==null) || 
             (this.hits!=null &&
              this.hits.equals(other.getHits()))) &&
            ((this.pihits==null && other.getPihits()==null) || 
             (this.pihits!=null &&
              this.pihits.equals(other.getPihits()))) &&
            ((this.type2==null && other.getType2()==null) || 
             (this.type2!=null &&
              this.type2.equals(other.getType2()))) &&
            ((this.clientsecuritymessage==null && other.getClientsecuritymessage()==null) || 
             (this.clientsecuritymessage!=null &&
              this.clientsecuritymessage.equals(other.getClientsecuritymessage()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            this.isdefault == other.isIsdefault() &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getHits() != null) {
            _hashCode += getHits().hashCode();
        }
        if (getPihits() != null) {
            _hashCode += getPihits().hashCode();
        }
        if (getType2() != null) {
            _hashCode += getType2().hashCode();
        }
        if (getClientsecuritymessage() != null) {
            _hashCode += getClientsecuritymessage().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        _hashCode += (isIsdefault() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBuiltin() != null) {
            _hashCode += getBuiltin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Policyexpression.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "policyexpression"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pihits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pihits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientsecuritymessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientsecuritymessage"));
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
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isdefault");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isdefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
