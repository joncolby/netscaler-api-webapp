/**
 * Crpolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Crpolicy  implements java.io.Serializable {
    private java.lang.String policyname;

    private java.lang.String rule;

    private java.lang.String domain;

    private org.apache.axis.types.UnsignedInt vstype;

    private java.lang.String cspolicytype;

    private java.lang.String builtin;

    public Crpolicy() {
    }

    public Crpolicy(
           java.lang.String policyname,
           java.lang.String rule,
           java.lang.String domain,
           org.apache.axis.types.UnsignedInt vstype,
           java.lang.String cspolicytype,
           java.lang.String builtin) {
           this.policyname = policyname;
           this.rule = rule;
           this.domain = domain;
           this.vstype = vstype;
           this.cspolicytype = cspolicytype;
           this.builtin = builtin;
    }


    /**
     * Gets the policyname value for this Crpolicy.
     * 
     * @return policyname
     */
    public java.lang.String getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Crpolicy.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the rule value for this Crpolicy.
     * 
     * @return rule
     */
    public java.lang.String getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this Crpolicy.
     * 
     * @param rule
     */
    public void setRule(java.lang.String rule) {
        this.rule = rule;
    }


    /**
     * Gets the domain value for this Crpolicy.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this Crpolicy.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the vstype value for this Crpolicy.
     * 
     * @return vstype
     */
    public org.apache.axis.types.UnsignedInt getVstype() {
        return vstype;
    }


    /**
     * Sets the vstype value for this Crpolicy.
     * 
     * @param vstype
     */
    public void setVstype(org.apache.axis.types.UnsignedInt vstype) {
        this.vstype = vstype;
    }


    /**
     * Gets the cspolicytype value for this Crpolicy.
     * 
     * @return cspolicytype
     */
    public java.lang.String getCspolicytype() {
        return cspolicytype;
    }


    /**
     * Sets the cspolicytype value for this Crpolicy.
     * 
     * @param cspolicytype
     */
    public void setCspolicytype(java.lang.String cspolicytype) {
        this.cspolicytype = cspolicytype;
    }


    /**
     * Gets the builtin value for this Crpolicy.
     * 
     * @return builtin
     */
    public java.lang.String getBuiltin() {
        return builtin;
    }


    /**
     * Sets the builtin value for this Crpolicy.
     * 
     * @param builtin
     */
    public void setBuiltin(java.lang.String builtin) {
        this.builtin = builtin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Crpolicy)) return false;
        Crpolicy other = (Crpolicy) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.policyname==null && other.getPolicyname()==null) || 
             (this.policyname!=null &&
              this.policyname.equals(other.getPolicyname()))) &&
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              this.rule.equals(other.getRule()))) &&
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain()))) &&
            ((this.vstype==null && other.getVstype()==null) || 
             (this.vstype!=null &&
              this.vstype.equals(other.getVstype()))) &&
            ((this.cspolicytype==null && other.getCspolicytype()==null) || 
             (this.cspolicytype!=null &&
              this.cspolicytype.equals(other.getCspolicytype()))) &&
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
        if (getPolicyname() != null) {
            _hashCode += getPolicyname().hashCode();
        }
        if (getRule() != null) {
            _hashCode += getRule().hashCode();
        }
        if (getDomain() != null) {
            _hashCode += getDomain().hashCode();
        }
        if (getVstype() != null) {
            _hashCode += getVstype().hashCode();
        }
        if (getCspolicytype() != null) {
            _hashCode += getCspolicytype().hashCode();
        }
        if (getBuiltin() != null) {
            _hashCode += getBuiltin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Crpolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "crpolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vstype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vstype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cspolicytype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cspolicytype"));
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
