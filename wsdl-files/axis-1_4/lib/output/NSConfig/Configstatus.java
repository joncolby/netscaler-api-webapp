/**
 * Configstatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Configstatus  implements java.io.Serializable {
    private java.lang.String consistent;

    private org.apache.axis.types.UnsignedInt culpritcore;

    private org.apache.axis.types.UnsignedInt core;

    private java.lang.String culpritcoreconfstring;

    private java.lang.String coreconfstring;

    public Configstatus() {
    }

    public Configstatus(
           java.lang.String consistent,
           org.apache.axis.types.UnsignedInt culpritcore,
           org.apache.axis.types.UnsignedInt core,
           java.lang.String culpritcoreconfstring,
           java.lang.String coreconfstring) {
           this.consistent = consistent;
           this.culpritcore = culpritcore;
           this.core = core;
           this.culpritcoreconfstring = culpritcoreconfstring;
           this.coreconfstring = coreconfstring;
    }


    /**
     * Gets the consistent value for this Configstatus.
     * 
     * @return consistent
     */
    public java.lang.String getConsistent() {
        return consistent;
    }


    /**
     * Sets the consistent value for this Configstatus.
     * 
     * @param consistent
     */
    public void setConsistent(java.lang.String consistent) {
        this.consistent = consistent;
    }


    /**
     * Gets the culpritcore value for this Configstatus.
     * 
     * @return culpritcore
     */
    public org.apache.axis.types.UnsignedInt getCulpritcore() {
        return culpritcore;
    }


    /**
     * Sets the culpritcore value for this Configstatus.
     * 
     * @param culpritcore
     */
    public void setCulpritcore(org.apache.axis.types.UnsignedInt culpritcore) {
        this.culpritcore = culpritcore;
    }


    /**
     * Gets the core value for this Configstatus.
     * 
     * @return core
     */
    public org.apache.axis.types.UnsignedInt getCore() {
        return core;
    }


    /**
     * Sets the core value for this Configstatus.
     * 
     * @param core
     */
    public void setCore(org.apache.axis.types.UnsignedInt core) {
        this.core = core;
    }


    /**
     * Gets the culpritcoreconfstring value for this Configstatus.
     * 
     * @return culpritcoreconfstring
     */
    public java.lang.String getCulpritcoreconfstring() {
        return culpritcoreconfstring;
    }


    /**
     * Sets the culpritcoreconfstring value for this Configstatus.
     * 
     * @param culpritcoreconfstring
     */
    public void setCulpritcoreconfstring(java.lang.String culpritcoreconfstring) {
        this.culpritcoreconfstring = culpritcoreconfstring;
    }


    /**
     * Gets the coreconfstring value for this Configstatus.
     * 
     * @return coreconfstring
     */
    public java.lang.String getCoreconfstring() {
        return coreconfstring;
    }


    /**
     * Sets the coreconfstring value for this Configstatus.
     * 
     * @param coreconfstring
     */
    public void setCoreconfstring(java.lang.String coreconfstring) {
        this.coreconfstring = coreconfstring;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Configstatus)) return false;
        Configstatus other = (Configstatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.consistent==null && other.getConsistent()==null) || 
             (this.consistent!=null &&
              this.consistent.equals(other.getConsistent()))) &&
            ((this.culpritcore==null && other.getCulpritcore()==null) || 
             (this.culpritcore!=null &&
              this.culpritcore.equals(other.getCulpritcore()))) &&
            ((this.core==null && other.getCore()==null) || 
             (this.core!=null &&
              this.core.equals(other.getCore()))) &&
            ((this.culpritcoreconfstring==null && other.getCulpritcoreconfstring()==null) || 
             (this.culpritcoreconfstring!=null &&
              this.culpritcoreconfstring.equals(other.getCulpritcoreconfstring()))) &&
            ((this.coreconfstring==null && other.getCoreconfstring()==null) || 
             (this.coreconfstring!=null &&
              this.coreconfstring.equals(other.getCoreconfstring())));
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
        if (getConsistent() != null) {
            _hashCode += getConsistent().hashCode();
        }
        if (getCulpritcore() != null) {
            _hashCode += getCulpritcore().hashCode();
        }
        if (getCore() != null) {
            _hashCode += getCore().hashCode();
        }
        if (getCulpritcoreconfstring() != null) {
            _hashCode += getCulpritcoreconfstring().hashCode();
        }
        if (getCoreconfstring() != null) {
            _hashCode += getCoreconfstring().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Configstatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "configstatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consistent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "consistent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("culpritcore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "culpritcore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("core");
        elemField.setXmlName(new javax.xml.namespace.QName("", "core"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("culpritcoreconfstring");
        elemField.setXmlName(new javax.xml.namespace.QName("", "culpritcoreconfstring"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("coreconfstring");
        elemField.setXmlName(new javax.xml.namespace.QName("", "coreconfstring"));
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
