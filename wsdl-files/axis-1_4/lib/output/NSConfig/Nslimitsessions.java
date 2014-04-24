/**
 * Nslimitsessions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nslimitsessions  implements java.io.Serializable {
    private java.lang.String limitidentifier;

    private boolean detail;

    private org.apache.axis.types.UnsignedInt timeout;

    private org.apache.axis.types.UnsignedInt hits;

    private org.apache.axis.types.UnsignedInt drop;

    private org.apache.axis.types.UnsignedInt[] number;

    private java.lang.String name;

    private org.apache.axis.types.UnsignedInt unit;

    private org.apache.axis.types.UnsignedInt flags;

    private org.apache.axis.types.UnsignedInt referencecount;

    private org.apache.axis.types.UnsignedInt maxbandwidth;

    private java.lang.String selectoripv61;

    private java.lang.String selectoripv62;

    private org.apache.axis.types.UnsignedInt flag;

    public Nslimitsessions() {
    }

    public Nslimitsessions(
           java.lang.String limitidentifier,
           boolean detail,
           org.apache.axis.types.UnsignedInt timeout,
           org.apache.axis.types.UnsignedInt hits,
           org.apache.axis.types.UnsignedInt drop,
           org.apache.axis.types.UnsignedInt[] number,
           java.lang.String name,
           org.apache.axis.types.UnsignedInt unit,
           org.apache.axis.types.UnsignedInt flags,
           org.apache.axis.types.UnsignedInt referencecount,
           org.apache.axis.types.UnsignedInt maxbandwidth,
           java.lang.String selectoripv61,
           java.lang.String selectoripv62,
           org.apache.axis.types.UnsignedInt flag) {
           this.limitidentifier = limitidentifier;
           this.detail = detail;
           this.timeout = timeout;
           this.hits = hits;
           this.drop = drop;
           this.number = number;
           this.name = name;
           this.unit = unit;
           this.flags = flags;
           this.referencecount = referencecount;
           this.maxbandwidth = maxbandwidth;
           this.selectoripv61 = selectoripv61;
           this.selectoripv62 = selectoripv62;
           this.flag = flag;
    }


    /**
     * Gets the limitidentifier value for this Nslimitsessions.
     * 
     * @return limitidentifier
     */
    public java.lang.String getLimitidentifier() {
        return limitidentifier;
    }


    /**
     * Sets the limitidentifier value for this Nslimitsessions.
     * 
     * @param limitidentifier
     */
    public void setLimitidentifier(java.lang.String limitidentifier) {
        this.limitidentifier = limitidentifier;
    }


    /**
     * Gets the detail value for this Nslimitsessions.
     * 
     * @return detail
     */
    public boolean isDetail() {
        return detail;
    }


    /**
     * Sets the detail value for this Nslimitsessions.
     * 
     * @param detail
     */
    public void setDetail(boolean detail) {
        this.detail = detail;
    }


    /**
     * Gets the timeout value for this Nslimitsessions.
     * 
     * @return timeout
     */
    public org.apache.axis.types.UnsignedInt getTimeout() {
        return timeout;
    }


    /**
     * Sets the timeout value for this Nslimitsessions.
     * 
     * @param timeout
     */
    public void setTimeout(org.apache.axis.types.UnsignedInt timeout) {
        this.timeout = timeout;
    }


    /**
     * Gets the hits value for this Nslimitsessions.
     * 
     * @return hits
     */
    public org.apache.axis.types.UnsignedInt getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this Nslimitsessions.
     * 
     * @param hits
     */
    public void setHits(org.apache.axis.types.UnsignedInt hits) {
        this.hits = hits;
    }


    /**
     * Gets the drop value for this Nslimitsessions.
     * 
     * @return drop
     */
    public org.apache.axis.types.UnsignedInt getDrop() {
        return drop;
    }


    /**
     * Sets the drop value for this Nslimitsessions.
     * 
     * @param drop
     */
    public void setDrop(org.apache.axis.types.UnsignedInt drop) {
        this.drop = drop;
    }


    /**
     * Gets the number value for this Nslimitsessions.
     * 
     * @return number
     */
    public org.apache.axis.types.UnsignedInt[] getNumber() {
        return number;
    }


    /**
     * Sets the number value for this Nslimitsessions.
     * 
     * @param number
     */
    public void setNumber(org.apache.axis.types.UnsignedInt[] number) {
        this.number = number;
    }


    /**
     * Gets the name value for this Nslimitsessions.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Nslimitsessions.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the unit value for this Nslimitsessions.
     * 
     * @return unit
     */
    public org.apache.axis.types.UnsignedInt getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this Nslimitsessions.
     * 
     * @param unit
     */
    public void setUnit(org.apache.axis.types.UnsignedInt unit) {
        this.unit = unit;
    }


    /**
     * Gets the flags value for this Nslimitsessions.
     * 
     * @return flags
     */
    public org.apache.axis.types.UnsignedInt getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this Nslimitsessions.
     * 
     * @param flags
     */
    public void setFlags(org.apache.axis.types.UnsignedInt flags) {
        this.flags = flags;
    }


    /**
     * Gets the referencecount value for this Nslimitsessions.
     * 
     * @return referencecount
     */
    public org.apache.axis.types.UnsignedInt getReferencecount() {
        return referencecount;
    }


    /**
     * Sets the referencecount value for this Nslimitsessions.
     * 
     * @param referencecount
     */
    public void setReferencecount(org.apache.axis.types.UnsignedInt referencecount) {
        this.referencecount = referencecount;
    }


    /**
     * Gets the maxbandwidth value for this Nslimitsessions.
     * 
     * @return maxbandwidth
     */
    public org.apache.axis.types.UnsignedInt getMaxbandwidth() {
        return maxbandwidth;
    }


    /**
     * Sets the maxbandwidth value for this Nslimitsessions.
     * 
     * @param maxbandwidth
     */
    public void setMaxbandwidth(org.apache.axis.types.UnsignedInt maxbandwidth) {
        this.maxbandwidth = maxbandwidth;
    }


    /**
     * Gets the selectoripv61 value for this Nslimitsessions.
     * 
     * @return selectoripv61
     */
    public java.lang.String getSelectoripv61() {
        return selectoripv61;
    }


    /**
     * Sets the selectoripv61 value for this Nslimitsessions.
     * 
     * @param selectoripv61
     */
    public void setSelectoripv61(java.lang.String selectoripv61) {
        this.selectoripv61 = selectoripv61;
    }


    /**
     * Gets the selectoripv62 value for this Nslimitsessions.
     * 
     * @return selectoripv62
     */
    public java.lang.String getSelectoripv62() {
        return selectoripv62;
    }


    /**
     * Sets the selectoripv62 value for this Nslimitsessions.
     * 
     * @param selectoripv62
     */
    public void setSelectoripv62(java.lang.String selectoripv62) {
        this.selectoripv62 = selectoripv62;
    }


    /**
     * Gets the flag value for this Nslimitsessions.
     * 
     * @return flag
     */
    public org.apache.axis.types.UnsignedInt getFlag() {
        return flag;
    }


    /**
     * Sets the flag value for this Nslimitsessions.
     * 
     * @param flag
     */
    public void setFlag(org.apache.axis.types.UnsignedInt flag) {
        this.flag = flag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nslimitsessions)) return false;
        Nslimitsessions other = (Nslimitsessions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.limitidentifier==null && other.getLimitidentifier()==null) || 
             (this.limitidentifier!=null &&
              this.limitidentifier.equals(other.getLimitidentifier()))) &&
            this.detail == other.isDetail() &&
            ((this.timeout==null && other.getTimeout()==null) || 
             (this.timeout!=null &&
              this.timeout.equals(other.getTimeout()))) &&
            ((this.hits==null && other.getHits()==null) || 
             (this.hits!=null &&
              this.hits.equals(other.getHits()))) &&
            ((this.drop==null && other.getDrop()==null) || 
             (this.drop!=null &&
              this.drop.equals(other.getDrop()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              java.util.Arrays.equals(this.number, other.getNumber()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
            ((this.flags==null && other.getFlags()==null) || 
             (this.flags!=null &&
              this.flags.equals(other.getFlags()))) &&
            ((this.referencecount==null && other.getReferencecount()==null) || 
             (this.referencecount!=null &&
              this.referencecount.equals(other.getReferencecount()))) &&
            ((this.maxbandwidth==null && other.getMaxbandwidth()==null) || 
             (this.maxbandwidth!=null &&
              this.maxbandwidth.equals(other.getMaxbandwidth()))) &&
            ((this.selectoripv61==null && other.getSelectoripv61()==null) || 
             (this.selectoripv61!=null &&
              this.selectoripv61.equals(other.getSelectoripv61()))) &&
            ((this.selectoripv62==null && other.getSelectoripv62()==null) || 
             (this.selectoripv62!=null &&
              this.selectoripv62.equals(other.getSelectoripv62()))) &&
            ((this.flag==null && other.getFlag()==null) || 
             (this.flag!=null &&
              this.flag.equals(other.getFlag())));
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
        if (getLimitidentifier() != null) {
            _hashCode += getLimitidentifier().hashCode();
        }
        _hashCode += (isDetail() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTimeout() != null) {
            _hashCode += getTimeout().hashCode();
        }
        if (getHits() != null) {
            _hashCode += getHits().hashCode();
        }
        if (getDrop() != null) {
            _hashCode += getDrop().hashCode();
        }
        if (getNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        if (getFlags() != null) {
            _hashCode += getFlags().hashCode();
        }
        if (getReferencecount() != null) {
            _hashCode += getReferencecount().hashCode();
        }
        if (getMaxbandwidth() != null) {
            _hashCode += getMaxbandwidth().hashCode();
        }
        if (getSelectoripv61() != null) {
            _hashCode += getSelectoripv61().hashCode();
        }
        if (getSelectoripv62() != null) {
            _hashCode += getSelectoripv62().hashCode();
        }
        if (getFlag() != null) {
            _hashCode += getFlag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nslimitsessions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nslimitsessions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitidentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limitidentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drop");
        elemField.setXmlName(new javax.xml.namespace.QName("", "drop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referencecount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referencecount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxbandwidth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxbandwidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectoripv61");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selectoripv61"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectoripv62");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selectoripv62"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flag"));
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
