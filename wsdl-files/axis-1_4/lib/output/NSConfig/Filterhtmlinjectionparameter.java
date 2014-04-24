/**
 * Filterhtmlinjectionparameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Filterhtmlinjectionparameter  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt rate;

    private org.apache.axis.types.UnsignedInt frequency;

    private java.lang.String strict;

    private org.apache.axis.types.UnsignedInt htmlsearchlen;

    public Filterhtmlinjectionparameter() {
    }

    public Filterhtmlinjectionparameter(
           org.apache.axis.types.UnsignedInt rate,
           org.apache.axis.types.UnsignedInt frequency,
           java.lang.String strict,
           org.apache.axis.types.UnsignedInt htmlsearchlen) {
           this.rate = rate;
           this.frequency = frequency;
           this.strict = strict;
           this.htmlsearchlen = htmlsearchlen;
    }


    /**
     * Gets the rate value for this Filterhtmlinjectionparameter.
     * 
     * @return rate
     */
    public org.apache.axis.types.UnsignedInt getRate() {
        return rate;
    }


    /**
     * Sets the rate value for this Filterhtmlinjectionparameter.
     * 
     * @param rate
     */
    public void setRate(org.apache.axis.types.UnsignedInt rate) {
        this.rate = rate;
    }


    /**
     * Gets the frequency value for this Filterhtmlinjectionparameter.
     * 
     * @return frequency
     */
    public org.apache.axis.types.UnsignedInt getFrequency() {
        return frequency;
    }


    /**
     * Sets the frequency value for this Filterhtmlinjectionparameter.
     * 
     * @param frequency
     */
    public void setFrequency(org.apache.axis.types.UnsignedInt frequency) {
        this.frequency = frequency;
    }


    /**
     * Gets the strict value for this Filterhtmlinjectionparameter.
     * 
     * @return strict
     */
    public java.lang.String getStrict() {
        return strict;
    }


    /**
     * Sets the strict value for this Filterhtmlinjectionparameter.
     * 
     * @param strict
     */
    public void setStrict(java.lang.String strict) {
        this.strict = strict;
    }


    /**
     * Gets the htmlsearchlen value for this Filterhtmlinjectionparameter.
     * 
     * @return htmlsearchlen
     */
    public org.apache.axis.types.UnsignedInt getHtmlsearchlen() {
        return htmlsearchlen;
    }


    /**
     * Sets the htmlsearchlen value for this Filterhtmlinjectionparameter.
     * 
     * @param htmlsearchlen
     */
    public void setHtmlsearchlen(org.apache.axis.types.UnsignedInt htmlsearchlen) {
        this.htmlsearchlen = htmlsearchlen;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Filterhtmlinjectionparameter)) return false;
        Filterhtmlinjectionparameter other = (Filterhtmlinjectionparameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rate==null && other.getRate()==null) || 
             (this.rate!=null &&
              this.rate.equals(other.getRate()))) &&
            ((this.frequency==null && other.getFrequency()==null) || 
             (this.frequency!=null &&
              this.frequency.equals(other.getFrequency()))) &&
            ((this.strict==null && other.getStrict()==null) || 
             (this.strict!=null &&
              this.strict.equals(other.getStrict()))) &&
            ((this.htmlsearchlen==null && other.getHtmlsearchlen()==null) || 
             (this.htmlsearchlen!=null &&
              this.htmlsearchlen.equals(other.getHtmlsearchlen())));
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
        if (getRate() != null) {
            _hashCode += getRate().hashCode();
        }
        if (getFrequency() != null) {
            _hashCode += getFrequency().hashCode();
        }
        if (getStrict() != null) {
            _hashCode += getStrict().hashCode();
        }
        if (getHtmlsearchlen() != null) {
            _hashCode += getHtmlsearchlen().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Filterhtmlinjectionparameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "filterhtmlinjectionparameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "frequency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strict");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strict"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("htmlsearchlen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "htmlsearchlen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
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
