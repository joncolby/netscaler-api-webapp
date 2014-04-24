/**
 * Policymap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Policymap  implements java.io.Serializable {
    private java.lang.String mappolicyname;

    private java.lang.String sd;

    private java.lang.String su;

    private java.lang.String td;

    private java.lang.String tu;

    private java.lang.String targetname;

    public Policymap() {
    }

    public Policymap(
           java.lang.String mappolicyname,
           java.lang.String sd,
           java.lang.String su,
           java.lang.String td,
           java.lang.String tu,
           java.lang.String targetname) {
           this.mappolicyname = mappolicyname;
           this.sd = sd;
           this.su = su;
           this.td = td;
           this.tu = tu;
           this.targetname = targetname;
    }


    /**
     * Gets the mappolicyname value for this Policymap.
     * 
     * @return mappolicyname
     */
    public java.lang.String getMappolicyname() {
        return mappolicyname;
    }


    /**
     * Sets the mappolicyname value for this Policymap.
     * 
     * @param mappolicyname
     */
    public void setMappolicyname(java.lang.String mappolicyname) {
        this.mappolicyname = mappolicyname;
    }


    /**
     * Gets the sd value for this Policymap.
     * 
     * @return sd
     */
    public java.lang.String getSd() {
        return sd;
    }


    /**
     * Sets the sd value for this Policymap.
     * 
     * @param sd
     */
    public void setSd(java.lang.String sd) {
        this.sd = sd;
    }


    /**
     * Gets the su value for this Policymap.
     * 
     * @return su
     */
    public java.lang.String getSu() {
        return su;
    }


    /**
     * Sets the su value for this Policymap.
     * 
     * @param su
     */
    public void setSu(java.lang.String su) {
        this.su = su;
    }


    /**
     * Gets the td value for this Policymap.
     * 
     * @return td
     */
    public java.lang.String getTd() {
        return td;
    }


    /**
     * Sets the td value for this Policymap.
     * 
     * @param td
     */
    public void setTd(java.lang.String td) {
        this.td = td;
    }


    /**
     * Gets the tu value for this Policymap.
     * 
     * @return tu
     */
    public java.lang.String getTu() {
        return tu;
    }


    /**
     * Sets the tu value for this Policymap.
     * 
     * @param tu
     */
    public void setTu(java.lang.String tu) {
        this.tu = tu;
    }


    /**
     * Gets the targetname value for this Policymap.
     * 
     * @return targetname
     */
    public java.lang.String getTargetname() {
        return targetname;
    }


    /**
     * Sets the targetname value for this Policymap.
     * 
     * @param targetname
     */
    public void setTargetname(java.lang.String targetname) {
        this.targetname = targetname;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Policymap)) return false;
        Policymap other = (Policymap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mappolicyname==null && other.getMappolicyname()==null) || 
             (this.mappolicyname!=null &&
              this.mappolicyname.equals(other.getMappolicyname()))) &&
            ((this.sd==null && other.getSd()==null) || 
             (this.sd!=null &&
              this.sd.equals(other.getSd()))) &&
            ((this.su==null && other.getSu()==null) || 
             (this.su!=null &&
              this.su.equals(other.getSu()))) &&
            ((this.td==null && other.getTd()==null) || 
             (this.td!=null &&
              this.td.equals(other.getTd()))) &&
            ((this.tu==null && other.getTu()==null) || 
             (this.tu!=null &&
              this.tu.equals(other.getTu()))) &&
            ((this.targetname==null && other.getTargetname()==null) || 
             (this.targetname!=null &&
              this.targetname.equals(other.getTargetname())));
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
        if (getMappolicyname() != null) {
            _hashCode += getMappolicyname().hashCode();
        }
        if (getSd() != null) {
            _hashCode += getSd().hashCode();
        }
        if (getSu() != null) {
            _hashCode += getSu().hashCode();
        }
        if (getTd() != null) {
            _hashCode += getTd().hashCode();
        }
        if (getTu() != null) {
            _hashCode += getTu().hashCode();
        }
        if (getTargetname() != null) {
            _hashCode += getTargetname().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Policymap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "policymap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mappolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mappolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("su");
        elemField.setXmlName(new javax.xml.namespace.QName("", "su"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("td");
        elemField.setXmlName(new javax.xml.namespace.QName("", "td"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetname"));
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
