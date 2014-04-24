/**
 * Auditmessages.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Auditmessages  implements java.io.Serializable {
    private java.lang.String loglevel;

    private org.apache.axis.types.UnsignedInt numofmesgs;

    private java.lang.String value;

    public Auditmessages() {
    }

    public Auditmessages(
           java.lang.String loglevel,
           org.apache.axis.types.UnsignedInt numofmesgs,
           java.lang.String value) {
           this.loglevel = loglevel;
           this.numofmesgs = numofmesgs;
           this.value = value;
    }


    /**
     * Gets the loglevel value for this Auditmessages.
     * 
     * @return loglevel
     */
    public java.lang.String getLoglevel() {
        return loglevel;
    }


    /**
     * Sets the loglevel value for this Auditmessages.
     * 
     * @param loglevel
     */
    public void setLoglevel(java.lang.String loglevel) {
        this.loglevel = loglevel;
    }


    /**
     * Gets the numofmesgs value for this Auditmessages.
     * 
     * @return numofmesgs
     */
    public org.apache.axis.types.UnsignedInt getNumofmesgs() {
        return numofmesgs;
    }


    /**
     * Sets the numofmesgs value for this Auditmessages.
     * 
     * @param numofmesgs
     */
    public void setNumofmesgs(org.apache.axis.types.UnsignedInt numofmesgs) {
        this.numofmesgs = numofmesgs;
    }


    /**
     * Gets the value value for this Auditmessages.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this Auditmessages.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Auditmessages)) return false;
        Auditmessages other = (Auditmessages) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.loglevel==null && other.getLoglevel()==null) || 
             (this.loglevel!=null &&
              this.loglevel.equals(other.getLoglevel()))) &&
            ((this.numofmesgs==null && other.getNumofmesgs()==null) || 
             (this.numofmesgs!=null &&
              this.numofmesgs.equals(other.getNumofmesgs()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        if (getLoglevel() != null) {
            _hashCode += getLoglevel().hashCode();
        }
        if (getNumofmesgs() != null) {
            _hashCode += getNumofmesgs().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Auditmessages.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "auditmessages"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loglevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loglevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numofmesgs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numofmesgs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
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
