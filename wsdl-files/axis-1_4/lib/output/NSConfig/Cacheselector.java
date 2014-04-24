/**
 * Cacheselector.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Cacheselector  implements java.io.Serializable {
    private java.lang.String selectorname;

    private org.apache.axis.types.UnsignedInt flags;

    private java.lang.String[] rule;

    public Cacheselector() {
    }

    public Cacheselector(
           java.lang.String selectorname,
           org.apache.axis.types.UnsignedInt flags,
           java.lang.String[] rule) {
           this.selectorname = selectorname;
           this.flags = flags;
           this.rule = rule;
    }


    /**
     * Gets the selectorname value for this Cacheselector.
     * 
     * @return selectorname
     */
    public java.lang.String getSelectorname() {
        return selectorname;
    }


    /**
     * Sets the selectorname value for this Cacheselector.
     * 
     * @param selectorname
     */
    public void setSelectorname(java.lang.String selectorname) {
        this.selectorname = selectorname;
    }


    /**
     * Gets the flags value for this Cacheselector.
     * 
     * @return flags
     */
    public org.apache.axis.types.UnsignedInt getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this Cacheselector.
     * 
     * @param flags
     */
    public void setFlags(org.apache.axis.types.UnsignedInt flags) {
        this.flags = flags;
    }


    /**
     * Gets the rule value for this Cacheselector.
     * 
     * @return rule
     */
    public java.lang.String[] getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this Cacheselector.
     * 
     * @param rule
     */
    public void setRule(java.lang.String[] rule) {
        this.rule = rule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cacheselector)) return false;
        Cacheselector other = (Cacheselector) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.selectorname==null && other.getSelectorname()==null) || 
             (this.selectorname!=null &&
              this.selectorname.equals(other.getSelectorname()))) &&
            ((this.flags==null && other.getFlags()==null) || 
             (this.flags!=null &&
              this.flags.equals(other.getFlags()))) &&
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              java.util.Arrays.equals(this.rule, other.getRule())));
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
        if (getSelectorname() != null) {
            _hashCode += getSelectorname().hashCode();
        }
        if (getFlags() != null) {
            _hashCode += getFlags().hashCode();
        }
        if (getRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRule(), i);
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
        new org.apache.axis.description.TypeDesc(Cacheselector.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "cacheselector"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectorname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selectorname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
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
