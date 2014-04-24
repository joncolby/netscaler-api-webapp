/**
 * Nsweblogparam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nsweblogparam  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt buffersizemb;

    private java.lang.String[] customreqhdrs;

    private java.lang.String[] customrsphdrs;

    public Nsweblogparam() {
    }

    public Nsweblogparam(
           org.apache.axis.types.UnsignedInt buffersizemb,
           java.lang.String[] customreqhdrs,
           java.lang.String[] customrsphdrs) {
           this.buffersizemb = buffersizemb;
           this.customreqhdrs = customreqhdrs;
           this.customrsphdrs = customrsphdrs;
    }


    /**
     * Gets the buffersizemb value for this Nsweblogparam.
     * 
     * @return buffersizemb
     */
    public org.apache.axis.types.UnsignedInt getBuffersizemb() {
        return buffersizemb;
    }


    /**
     * Sets the buffersizemb value for this Nsweblogparam.
     * 
     * @param buffersizemb
     */
    public void setBuffersizemb(org.apache.axis.types.UnsignedInt buffersizemb) {
        this.buffersizemb = buffersizemb;
    }


    /**
     * Gets the customreqhdrs value for this Nsweblogparam.
     * 
     * @return customreqhdrs
     */
    public java.lang.String[] getCustomreqhdrs() {
        return customreqhdrs;
    }


    /**
     * Sets the customreqhdrs value for this Nsweblogparam.
     * 
     * @param customreqhdrs
     */
    public void setCustomreqhdrs(java.lang.String[] customreqhdrs) {
        this.customreqhdrs = customreqhdrs;
    }


    /**
     * Gets the customrsphdrs value for this Nsweblogparam.
     * 
     * @return customrsphdrs
     */
    public java.lang.String[] getCustomrsphdrs() {
        return customrsphdrs;
    }


    /**
     * Sets the customrsphdrs value for this Nsweblogparam.
     * 
     * @param customrsphdrs
     */
    public void setCustomrsphdrs(java.lang.String[] customrsphdrs) {
        this.customrsphdrs = customrsphdrs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nsweblogparam)) return false;
        Nsweblogparam other = (Nsweblogparam) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.buffersizemb==null && other.getBuffersizemb()==null) || 
             (this.buffersizemb!=null &&
              this.buffersizemb.equals(other.getBuffersizemb()))) &&
            ((this.customreqhdrs==null && other.getCustomreqhdrs()==null) || 
             (this.customreqhdrs!=null &&
              java.util.Arrays.equals(this.customreqhdrs, other.getCustomreqhdrs()))) &&
            ((this.customrsphdrs==null && other.getCustomrsphdrs()==null) || 
             (this.customrsphdrs!=null &&
              java.util.Arrays.equals(this.customrsphdrs, other.getCustomrsphdrs())));
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
        if (getBuffersizemb() != null) {
            _hashCode += getBuffersizemb().hashCode();
        }
        if (getCustomreqhdrs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomreqhdrs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomreqhdrs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomrsphdrs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomrsphdrs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomrsphdrs(), i);
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
        new org.apache.axis.description.TypeDesc(Nsweblogparam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nsweblogparam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buffersizemb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "buffersizemb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customreqhdrs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customreqhdrs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customrsphdrs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customrsphdrs"));
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
