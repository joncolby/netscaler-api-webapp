/**
 * Ipsecparameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Ipsecparameter  implements java.io.Serializable {
    private java.lang.String ikeversion;

    private java.lang.String encalgo;

    private java.lang.String hashalgo;

    private org.apache.axis.types.UnsignedInt lifetime;

    private org.apache.axis.types.UnsignedInt livenesscheckinterval;

    private org.apache.axis.types.UnsignedInt replaywindowsize;

    private org.apache.axis.types.UnsignedInt ikeretryinterval;

    private org.apache.axis.types.UnsignedInt retransmissiontime;

    public Ipsecparameter() {
    }

    public Ipsecparameter(
           java.lang.String ikeversion,
           java.lang.String encalgo,
           java.lang.String hashalgo,
           org.apache.axis.types.UnsignedInt lifetime,
           org.apache.axis.types.UnsignedInt livenesscheckinterval,
           org.apache.axis.types.UnsignedInt replaywindowsize,
           org.apache.axis.types.UnsignedInt ikeretryinterval,
           org.apache.axis.types.UnsignedInt retransmissiontime) {
           this.ikeversion = ikeversion;
           this.encalgo = encalgo;
           this.hashalgo = hashalgo;
           this.lifetime = lifetime;
           this.livenesscheckinterval = livenesscheckinterval;
           this.replaywindowsize = replaywindowsize;
           this.ikeretryinterval = ikeretryinterval;
           this.retransmissiontime = retransmissiontime;
    }


    /**
     * Gets the ikeversion value for this Ipsecparameter.
     * 
     * @return ikeversion
     */
    public java.lang.String getIkeversion() {
        return ikeversion;
    }


    /**
     * Sets the ikeversion value for this Ipsecparameter.
     * 
     * @param ikeversion
     */
    public void setIkeversion(java.lang.String ikeversion) {
        this.ikeversion = ikeversion;
    }


    /**
     * Gets the encalgo value for this Ipsecparameter.
     * 
     * @return encalgo
     */
    public java.lang.String getEncalgo() {
        return encalgo;
    }


    /**
     * Sets the encalgo value for this Ipsecparameter.
     * 
     * @param encalgo
     */
    public void setEncalgo(java.lang.String encalgo) {
        this.encalgo = encalgo;
    }


    /**
     * Gets the hashalgo value for this Ipsecparameter.
     * 
     * @return hashalgo
     */
    public java.lang.String getHashalgo() {
        return hashalgo;
    }


    /**
     * Sets the hashalgo value for this Ipsecparameter.
     * 
     * @param hashalgo
     */
    public void setHashalgo(java.lang.String hashalgo) {
        this.hashalgo = hashalgo;
    }


    /**
     * Gets the lifetime value for this Ipsecparameter.
     * 
     * @return lifetime
     */
    public org.apache.axis.types.UnsignedInt getLifetime() {
        return lifetime;
    }


    /**
     * Sets the lifetime value for this Ipsecparameter.
     * 
     * @param lifetime
     */
    public void setLifetime(org.apache.axis.types.UnsignedInt lifetime) {
        this.lifetime = lifetime;
    }


    /**
     * Gets the livenesscheckinterval value for this Ipsecparameter.
     * 
     * @return livenesscheckinterval
     */
    public org.apache.axis.types.UnsignedInt getLivenesscheckinterval() {
        return livenesscheckinterval;
    }


    /**
     * Sets the livenesscheckinterval value for this Ipsecparameter.
     * 
     * @param livenesscheckinterval
     */
    public void setLivenesscheckinterval(org.apache.axis.types.UnsignedInt livenesscheckinterval) {
        this.livenesscheckinterval = livenesscheckinterval;
    }


    /**
     * Gets the replaywindowsize value for this Ipsecparameter.
     * 
     * @return replaywindowsize
     */
    public org.apache.axis.types.UnsignedInt getReplaywindowsize() {
        return replaywindowsize;
    }


    /**
     * Sets the replaywindowsize value for this Ipsecparameter.
     * 
     * @param replaywindowsize
     */
    public void setReplaywindowsize(org.apache.axis.types.UnsignedInt replaywindowsize) {
        this.replaywindowsize = replaywindowsize;
    }


    /**
     * Gets the ikeretryinterval value for this Ipsecparameter.
     * 
     * @return ikeretryinterval
     */
    public org.apache.axis.types.UnsignedInt getIkeretryinterval() {
        return ikeretryinterval;
    }


    /**
     * Sets the ikeretryinterval value for this Ipsecparameter.
     * 
     * @param ikeretryinterval
     */
    public void setIkeretryinterval(org.apache.axis.types.UnsignedInt ikeretryinterval) {
        this.ikeretryinterval = ikeretryinterval;
    }


    /**
     * Gets the retransmissiontime value for this Ipsecparameter.
     * 
     * @return retransmissiontime
     */
    public org.apache.axis.types.UnsignedInt getRetransmissiontime() {
        return retransmissiontime;
    }


    /**
     * Sets the retransmissiontime value for this Ipsecparameter.
     * 
     * @param retransmissiontime
     */
    public void setRetransmissiontime(org.apache.axis.types.UnsignedInt retransmissiontime) {
        this.retransmissiontime = retransmissiontime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ipsecparameter)) return false;
        Ipsecparameter other = (Ipsecparameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ikeversion==null && other.getIkeversion()==null) || 
             (this.ikeversion!=null &&
              this.ikeversion.equals(other.getIkeversion()))) &&
            ((this.encalgo==null && other.getEncalgo()==null) || 
             (this.encalgo!=null &&
              this.encalgo.equals(other.getEncalgo()))) &&
            ((this.hashalgo==null && other.getHashalgo()==null) || 
             (this.hashalgo!=null &&
              this.hashalgo.equals(other.getHashalgo()))) &&
            ((this.lifetime==null && other.getLifetime()==null) || 
             (this.lifetime!=null &&
              this.lifetime.equals(other.getLifetime()))) &&
            ((this.livenesscheckinterval==null && other.getLivenesscheckinterval()==null) || 
             (this.livenesscheckinterval!=null &&
              this.livenesscheckinterval.equals(other.getLivenesscheckinterval()))) &&
            ((this.replaywindowsize==null && other.getReplaywindowsize()==null) || 
             (this.replaywindowsize!=null &&
              this.replaywindowsize.equals(other.getReplaywindowsize()))) &&
            ((this.ikeretryinterval==null && other.getIkeretryinterval()==null) || 
             (this.ikeretryinterval!=null &&
              this.ikeretryinterval.equals(other.getIkeretryinterval()))) &&
            ((this.retransmissiontime==null && other.getRetransmissiontime()==null) || 
             (this.retransmissiontime!=null &&
              this.retransmissiontime.equals(other.getRetransmissiontime())));
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
        if (getIkeversion() != null) {
            _hashCode += getIkeversion().hashCode();
        }
        if (getEncalgo() != null) {
            _hashCode += getEncalgo().hashCode();
        }
        if (getHashalgo() != null) {
            _hashCode += getHashalgo().hashCode();
        }
        if (getLifetime() != null) {
            _hashCode += getLifetime().hashCode();
        }
        if (getLivenesscheckinterval() != null) {
            _hashCode += getLivenesscheckinterval().hashCode();
        }
        if (getReplaywindowsize() != null) {
            _hashCode += getReplaywindowsize().hashCode();
        }
        if (getIkeretryinterval() != null) {
            _hashCode += getIkeretryinterval().hashCode();
        }
        if (getRetransmissiontime() != null) {
            _hashCode += getRetransmissiontime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ipsecparameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "ipsecparameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ikeversion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ikeversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encalgo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "encalgo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hashalgo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hashalgo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lifetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("livenesscheckinterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "livenesscheckinterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("replaywindowsize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "replaywindowsize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ikeretryinterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ikeretryinterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retransmissiontime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retransmissiontime"));
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
