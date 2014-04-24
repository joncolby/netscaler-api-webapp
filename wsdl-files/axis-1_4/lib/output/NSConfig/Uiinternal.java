/**
 * Uiinternal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Uiinternal  implements java.io.Serializable {
    private java.lang.String entitytype;

    private java.lang.String name;

    private java.lang.String templatE;

    private java.lang.String comment;

    private java.lang.String uiinfo;

    private java.lang.String rule;

    public Uiinternal() {
    }

    public Uiinternal(
           java.lang.String entitytype,
           java.lang.String name,
           java.lang.String templatE,
           java.lang.String comment,
           java.lang.String uiinfo,
           java.lang.String rule) {
           this.entitytype = entitytype;
           this.name = name;
           this.templatE = templatE;
           this.comment = comment;
           this.uiinfo = uiinfo;
           this.rule = rule;
    }


    /**
     * Gets the entitytype value for this Uiinternal.
     * 
     * @return entitytype
     */
    public java.lang.String getEntitytype() {
        return entitytype;
    }


    /**
     * Sets the entitytype value for this Uiinternal.
     * 
     * @param entitytype
     */
    public void setEntitytype(java.lang.String entitytype) {
        this.entitytype = entitytype;
    }


    /**
     * Gets the name value for this Uiinternal.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Uiinternal.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the templatE value for this Uiinternal.
     * 
     * @return templatE
     */
    public java.lang.String getTemplatE() {
        return templatE;
    }


    /**
     * Sets the templatE value for this Uiinternal.
     * 
     * @param templatE
     */
    public void setTemplatE(java.lang.String templatE) {
        this.templatE = templatE;
    }


    /**
     * Gets the comment value for this Uiinternal.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Uiinternal.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the uiinfo value for this Uiinternal.
     * 
     * @return uiinfo
     */
    public java.lang.String getUiinfo() {
        return uiinfo;
    }


    /**
     * Sets the uiinfo value for this Uiinternal.
     * 
     * @param uiinfo
     */
    public void setUiinfo(java.lang.String uiinfo) {
        this.uiinfo = uiinfo;
    }


    /**
     * Gets the rule value for this Uiinternal.
     * 
     * @return rule
     */
    public java.lang.String getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this Uiinternal.
     * 
     * @param rule
     */
    public void setRule(java.lang.String rule) {
        this.rule = rule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Uiinternal)) return false;
        Uiinternal other = (Uiinternal) obj;
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
            ((this.templatE==null && other.getTemplatE()==null) || 
             (this.templatE!=null &&
              this.templatE.equals(other.getTemplatE()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.uiinfo==null && other.getUiinfo()==null) || 
             (this.uiinfo!=null &&
              this.uiinfo.equals(other.getUiinfo()))) &&
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              this.rule.equals(other.getRule())));
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
        if (getTemplatE() != null) {
            _hashCode += getTemplatE().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getUiinfo() != null) {
            _hashCode += getUiinfo().hashCode();
        }
        if (getRule() != null) {
            _hashCode += getRule().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Uiinternal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "uiinternal"));
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
        elemField.setFieldName("templatE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "templatE"));
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
        elemField.setFieldName("uiinfo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uiinfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rule"));
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
