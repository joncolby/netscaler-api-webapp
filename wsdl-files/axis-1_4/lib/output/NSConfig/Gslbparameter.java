/**
 * Gslbparameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Gslbparameter  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt flags;

    private org.apache.axis.types.UnsignedInt ldnsentrytimeout;

    private org.apache.axis.types.UnsignedInt rtttolerance;

    private java.lang.String ldnsmask;

    private org.apache.axis.types.UnsignedInt v6Ldnsmasklen;

    private java.lang.String[] ldnsprobeorder;

    private java.lang.String dropldnsreq;

    public Gslbparameter() {
    }

    public Gslbparameter(
           org.apache.axis.types.UnsignedInt flags,
           org.apache.axis.types.UnsignedInt ldnsentrytimeout,
           org.apache.axis.types.UnsignedInt rtttolerance,
           java.lang.String ldnsmask,
           org.apache.axis.types.UnsignedInt v6Ldnsmasklen,
           java.lang.String[] ldnsprobeorder,
           java.lang.String dropldnsreq) {
           this.flags = flags;
           this.ldnsentrytimeout = ldnsentrytimeout;
           this.rtttolerance = rtttolerance;
           this.ldnsmask = ldnsmask;
           this.v6Ldnsmasklen = v6Ldnsmasklen;
           this.ldnsprobeorder = ldnsprobeorder;
           this.dropldnsreq = dropldnsreq;
    }


    /**
     * Gets the flags value for this Gslbparameter.
     * 
     * @return flags
     */
    public org.apache.axis.types.UnsignedInt getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this Gslbparameter.
     * 
     * @param flags
     */
    public void setFlags(org.apache.axis.types.UnsignedInt flags) {
        this.flags = flags;
    }


    /**
     * Gets the ldnsentrytimeout value for this Gslbparameter.
     * 
     * @return ldnsentrytimeout
     */
    public org.apache.axis.types.UnsignedInt getLdnsentrytimeout() {
        return ldnsentrytimeout;
    }


    /**
     * Sets the ldnsentrytimeout value for this Gslbparameter.
     * 
     * @param ldnsentrytimeout
     */
    public void setLdnsentrytimeout(org.apache.axis.types.UnsignedInt ldnsentrytimeout) {
        this.ldnsentrytimeout = ldnsentrytimeout;
    }


    /**
     * Gets the rtttolerance value for this Gslbparameter.
     * 
     * @return rtttolerance
     */
    public org.apache.axis.types.UnsignedInt getRtttolerance() {
        return rtttolerance;
    }


    /**
     * Sets the rtttolerance value for this Gslbparameter.
     * 
     * @param rtttolerance
     */
    public void setRtttolerance(org.apache.axis.types.UnsignedInt rtttolerance) {
        this.rtttolerance = rtttolerance;
    }


    /**
     * Gets the ldnsmask value for this Gslbparameter.
     * 
     * @return ldnsmask
     */
    public java.lang.String getLdnsmask() {
        return ldnsmask;
    }


    /**
     * Sets the ldnsmask value for this Gslbparameter.
     * 
     * @param ldnsmask
     */
    public void setLdnsmask(java.lang.String ldnsmask) {
        this.ldnsmask = ldnsmask;
    }


    /**
     * Gets the v6Ldnsmasklen value for this Gslbparameter.
     * 
     * @return v6Ldnsmasklen
     */
    public org.apache.axis.types.UnsignedInt getV6Ldnsmasklen() {
        return v6Ldnsmasklen;
    }


    /**
     * Sets the v6Ldnsmasklen value for this Gslbparameter.
     * 
     * @param v6Ldnsmasklen
     */
    public void setV6Ldnsmasklen(org.apache.axis.types.UnsignedInt v6Ldnsmasklen) {
        this.v6Ldnsmasklen = v6Ldnsmasklen;
    }


    /**
     * Gets the ldnsprobeorder value for this Gslbparameter.
     * 
     * @return ldnsprobeorder
     */
    public java.lang.String[] getLdnsprobeorder() {
        return ldnsprobeorder;
    }


    /**
     * Sets the ldnsprobeorder value for this Gslbparameter.
     * 
     * @param ldnsprobeorder
     */
    public void setLdnsprobeorder(java.lang.String[] ldnsprobeorder) {
        this.ldnsprobeorder = ldnsprobeorder;
    }


    /**
     * Gets the dropldnsreq value for this Gslbparameter.
     * 
     * @return dropldnsreq
     */
    public java.lang.String getDropldnsreq() {
        return dropldnsreq;
    }


    /**
     * Sets the dropldnsreq value for this Gslbparameter.
     * 
     * @param dropldnsreq
     */
    public void setDropldnsreq(java.lang.String dropldnsreq) {
        this.dropldnsreq = dropldnsreq;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gslbparameter)) return false;
        Gslbparameter other = (Gslbparameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.flags==null && other.getFlags()==null) || 
             (this.flags!=null &&
              this.flags.equals(other.getFlags()))) &&
            ((this.ldnsentrytimeout==null && other.getLdnsentrytimeout()==null) || 
             (this.ldnsentrytimeout!=null &&
              this.ldnsentrytimeout.equals(other.getLdnsentrytimeout()))) &&
            ((this.rtttolerance==null && other.getRtttolerance()==null) || 
             (this.rtttolerance!=null &&
              this.rtttolerance.equals(other.getRtttolerance()))) &&
            ((this.ldnsmask==null && other.getLdnsmask()==null) || 
             (this.ldnsmask!=null &&
              this.ldnsmask.equals(other.getLdnsmask()))) &&
            ((this.v6Ldnsmasklen==null && other.getV6Ldnsmasklen()==null) || 
             (this.v6Ldnsmasklen!=null &&
              this.v6Ldnsmasklen.equals(other.getV6Ldnsmasklen()))) &&
            ((this.ldnsprobeorder==null && other.getLdnsprobeorder()==null) || 
             (this.ldnsprobeorder!=null &&
              java.util.Arrays.equals(this.ldnsprobeorder, other.getLdnsprobeorder()))) &&
            ((this.dropldnsreq==null && other.getDropldnsreq()==null) || 
             (this.dropldnsreq!=null &&
              this.dropldnsreq.equals(other.getDropldnsreq())));
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
        if (getFlags() != null) {
            _hashCode += getFlags().hashCode();
        }
        if (getLdnsentrytimeout() != null) {
            _hashCode += getLdnsentrytimeout().hashCode();
        }
        if (getRtttolerance() != null) {
            _hashCode += getRtttolerance().hashCode();
        }
        if (getLdnsmask() != null) {
            _hashCode += getLdnsmask().hashCode();
        }
        if (getV6Ldnsmasklen() != null) {
            _hashCode += getV6Ldnsmasklen().hashCode();
        }
        if (getLdnsprobeorder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLdnsprobeorder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLdnsprobeorder(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDropldnsreq() != null) {
            _hashCode += getDropldnsreq().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gslbparameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "gslbparameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldnsentrytimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldnsentrytimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rtttolerance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rtttolerance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldnsmask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldnsmask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("v6Ldnsmasklen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "v6ldnsmasklen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldnsprobeorder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldnsprobeorder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dropldnsreq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dropldnsreq"));
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
