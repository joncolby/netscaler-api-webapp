/**
 * Filteraction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Filteraction  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String qual;

    private java.lang.String servicename;

    private java.lang.String value;

    private org.apache.axis.types.UnsignedInt respcode;

    private java.lang.String page;

    private boolean isdefault;

    private java.lang.String builtin;

    public Filteraction() {
    }

    public Filteraction(
           java.lang.String name,
           java.lang.String qual,
           java.lang.String servicename,
           java.lang.String value,
           org.apache.axis.types.UnsignedInt respcode,
           java.lang.String page,
           boolean isdefault,
           java.lang.String builtin) {
           this.name = name;
           this.qual = qual;
           this.servicename = servicename;
           this.value = value;
           this.respcode = respcode;
           this.page = page;
           this.isdefault = isdefault;
           this.builtin = builtin;
    }


    /**
     * Gets the name value for this Filteraction.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Filteraction.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the qual value for this Filteraction.
     * 
     * @return qual
     */
    public java.lang.String getQual() {
        return qual;
    }


    /**
     * Sets the qual value for this Filteraction.
     * 
     * @param qual
     */
    public void setQual(java.lang.String qual) {
        this.qual = qual;
    }


    /**
     * Gets the servicename value for this Filteraction.
     * 
     * @return servicename
     */
    public java.lang.String getServicename() {
        return servicename;
    }


    /**
     * Sets the servicename value for this Filteraction.
     * 
     * @param servicename
     */
    public void setServicename(java.lang.String servicename) {
        this.servicename = servicename;
    }


    /**
     * Gets the value value for this Filteraction.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this Filteraction.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the respcode value for this Filteraction.
     * 
     * @return respcode
     */
    public org.apache.axis.types.UnsignedInt getRespcode() {
        return respcode;
    }


    /**
     * Sets the respcode value for this Filteraction.
     * 
     * @param respcode
     */
    public void setRespcode(org.apache.axis.types.UnsignedInt respcode) {
        this.respcode = respcode;
    }


    /**
     * Gets the page value for this Filteraction.
     * 
     * @return page
     */
    public java.lang.String getPage() {
        return page;
    }


    /**
     * Sets the page value for this Filteraction.
     * 
     * @param page
     */
    public void setPage(java.lang.String page) {
        this.page = page;
    }


    /**
     * Gets the isdefault value for this Filteraction.
     * 
     * @return isdefault
     */
    public boolean isIsdefault() {
        return isdefault;
    }


    /**
     * Sets the isdefault value for this Filteraction.
     * 
     * @param isdefault
     */
    public void setIsdefault(boolean isdefault) {
        this.isdefault = isdefault;
    }


    /**
     * Gets the builtin value for this Filteraction.
     * 
     * @return builtin
     */
    public java.lang.String getBuiltin() {
        return builtin;
    }


    /**
     * Sets the builtin value for this Filteraction.
     * 
     * @param builtin
     */
    public void setBuiltin(java.lang.String builtin) {
        this.builtin = builtin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Filteraction)) return false;
        Filteraction other = (Filteraction) obj;
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
            ((this.qual==null && other.getQual()==null) || 
             (this.qual!=null &&
              this.qual.equals(other.getQual()))) &&
            ((this.servicename==null && other.getServicename()==null) || 
             (this.servicename!=null &&
              this.servicename.equals(other.getServicename()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.respcode==null && other.getRespcode()==null) || 
             (this.respcode!=null &&
              this.respcode.equals(other.getRespcode()))) &&
            ((this.page==null && other.getPage()==null) || 
             (this.page!=null &&
              this.page.equals(other.getPage()))) &&
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
        if (getQual() != null) {
            _hashCode += getQual().hashCode();
        }
        if (getServicename() != null) {
            _hashCode += getServicename().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getRespcode() != null) {
            _hashCode += getRespcode().hashCode();
        }
        if (getPage() != null) {
            _hashCode += getPage().hashCode();
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
        new org.apache.axis.description.TypeDesc(Filteraction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "filteraction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qual");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qual"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicename"));
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
        elemField.setFieldName("respcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "respcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("page");
        elemField.setXmlName(new javax.xml.namespace.QName("", "page"));
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
