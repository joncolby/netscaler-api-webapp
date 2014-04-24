/**
 * Cacheparameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Cacheparameter  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt memlimit;

    private org.apache.axis.types.UnsignedInt memlimitactive;

    private org.apache.axis.types.UnsignedInt maxmemlimit;

    private java.lang.String via;

    private java.lang.String verifyusing;

    private org.apache.axis.types.UnsignedInt maxpostlen;

    private org.apache.axis.types.UnsignedInt prefetchcur;

    private org.apache.axis.types.UnsignedInt prefetchmaxpending;

    private java.lang.String enablebypass;

    private java.lang.String undefaction;

    private java.lang.String enablediskcache;

    public Cacheparameter() {
    }

    public Cacheparameter(
           org.apache.axis.types.UnsignedInt memlimit,
           org.apache.axis.types.UnsignedInt memlimitactive,
           org.apache.axis.types.UnsignedInt maxmemlimit,
           java.lang.String via,
           java.lang.String verifyusing,
           org.apache.axis.types.UnsignedInt maxpostlen,
           org.apache.axis.types.UnsignedInt prefetchcur,
           org.apache.axis.types.UnsignedInt prefetchmaxpending,
           java.lang.String enablebypass,
           java.lang.String undefaction,
           java.lang.String enablediskcache) {
           this.memlimit = memlimit;
           this.memlimitactive = memlimitactive;
           this.maxmemlimit = maxmemlimit;
           this.via = via;
           this.verifyusing = verifyusing;
           this.maxpostlen = maxpostlen;
           this.prefetchcur = prefetchcur;
           this.prefetchmaxpending = prefetchmaxpending;
           this.enablebypass = enablebypass;
           this.undefaction = undefaction;
           this.enablediskcache = enablediskcache;
    }


    /**
     * Gets the memlimit value for this Cacheparameter.
     * 
     * @return memlimit
     */
    public org.apache.axis.types.UnsignedInt getMemlimit() {
        return memlimit;
    }


    /**
     * Sets the memlimit value for this Cacheparameter.
     * 
     * @param memlimit
     */
    public void setMemlimit(org.apache.axis.types.UnsignedInt memlimit) {
        this.memlimit = memlimit;
    }


    /**
     * Gets the memlimitactive value for this Cacheparameter.
     * 
     * @return memlimitactive
     */
    public org.apache.axis.types.UnsignedInt getMemlimitactive() {
        return memlimitactive;
    }


    /**
     * Sets the memlimitactive value for this Cacheparameter.
     * 
     * @param memlimitactive
     */
    public void setMemlimitactive(org.apache.axis.types.UnsignedInt memlimitactive) {
        this.memlimitactive = memlimitactive;
    }


    /**
     * Gets the maxmemlimit value for this Cacheparameter.
     * 
     * @return maxmemlimit
     */
    public org.apache.axis.types.UnsignedInt getMaxmemlimit() {
        return maxmemlimit;
    }


    /**
     * Sets the maxmemlimit value for this Cacheparameter.
     * 
     * @param maxmemlimit
     */
    public void setMaxmemlimit(org.apache.axis.types.UnsignedInt maxmemlimit) {
        this.maxmemlimit = maxmemlimit;
    }


    /**
     * Gets the via value for this Cacheparameter.
     * 
     * @return via
     */
    public java.lang.String getVia() {
        return via;
    }


    /**
     * Sets the via value for this Cacheparameter.
     * 
     * @param via
     */
    public void setVia(java.lang.String via) {
        this.via = via;
    }


    /**
     * Gets the verifyusing value for this Cacheparameter.
     * 
     * @return verifyusing
     */
    public java.lang.String getVerifyusing() {
        return verifyusing;
    }


    /**
     * Sets the verifyusing value for this Cacheparameter.
     * 
     * @param verifyusing
     */
    public void setVerifyusing(java.lang.String verifyusing) {
        this.verifyusing = verifyusing;
    }


    /**
     * Gets the maxpostlen value for this Cacheparameter.
     * 
     * @return maxpostlen
     */
    public org.apache.axis.types.UnsignedInt getMaxpostlen() {
        return maxpostlen;
    }


    /**
     * Sets the maxpostlen value for this Cacheparameter.
     * 
     * @param maxpostlen
     */
    public void setMaxpostlen(org.apache.axis.types.UnsignedInt maxpostlen) {
        this.maxpostlen = maxpostlen;
    }


    /**
     * Gets the prefetchcur value for this Cacheparameter.
     * 
     * @return prefetchcur
     */
    public org.apache.axis.types.UnsignedInt getPrefetchcur() {
        return prefetchcur;
    }


    /**
     * Sets the prefetchcur value for this Cacheparameter.
     * 
     * @param prefetchcur
     */
    public void setPrefetchcur(org.apache.axis.types.UnsignedInt prefetchcur) {
        this.prefetchcur = prefetchcur;
    }


    /**
     * Gets the prefetchmaxpending value for this Cacheparameter.
     * 
     * @return prefetchmaxpending
     */
    public org.apache.axis.types.UnsignedInt getPrefetchmaxpending() {
        return prefetchmaxpending;
    }


    /**
     * Sets the prefetchmaxpending value for this Cacheparameter.
     * 
     * @param prefetchmaxpending
     */
    public void setPrefetchmaxpending(org.apache.axis.types.UnsignedInt prefetchmaxpending) {
        this.prefetchmaxpending = prefetchmaxpending;
    }


    /**
     * Gets the enablebypass value for this Cacheparameter.
     * 
     * @return enablebypass
     */
    public java.lang.String getEnablebypass() {
        return enablebypass;
    }


    /**
     * Sets the enablebypass value for this Cacheparameter.
     * 
     * @param enablebypass
     */
    public void setEnablebypass(java.lang.String enablebypass) {
        this.enablebypass = enablebypass;
    }


    /**
     * Gets the undefaction value for this Cacheparameter.
     * 
     * @return undefaction
     */
    public java.lang.String getUndefaction() {
        return undefaction;
    }


    /**
     * Sets the undefaction value for this Cacheparameter.
     * 
     * @param undefaction
     */
    public void setUndefaction(java.lang.String undefaction) {
        this.undefaction = undefaction;
    }


    /**
     * Gets the enablediskcache value for this Cacheparameter.
     * 
     * @return enablediskcache
     */
    public java.lang.String getEnablediskcache() {
        return enablediskcache;
    }


    /**
     * Sets the enablediskcache value for this Cacheparameter.
     * 
     * @param enablediskcache
     */
    public void setEnablediskcache(java.lang.String enablediskcache) {
        this.enablediskcache = enablediskcache;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cacheparameter)) return false;
        Cacheparameter other = (Cacheparameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.memlimit==null && other.getMemlimit()==null) || 
             (this.memlimit!=null &&
              this.memlimit.equals(other.getMemlimit()))) &&
            ((this.memlimitactive==null && other.getMemlimitactive()==null) || 
             (this.memlimitactive!=null &&
              this.memlimitactive.equals(other.getMemlimitactive()))) &&
            ((this.maxmemlimit==null && other.getMaxmemlimit()==null) || 
             (this.maxmemlimit!=null &&
              this.maxmemlimit.equals(other.getMaxmemlimit()))) &&
            ((this.via==null && other.getVia()==null) || 
             (this.via!=null &&
              this.via.equals(other.getVia()))) &&
            ((this.verifyusing==null && other.getVerifyusing()==null) || 
             (this.verifyusing!=null &&
              this.verifyusing.equals(other.getVerifyusing()))) &&
            ((this.maxpostlen==null && other.getMaxpostlen()==null) || 
             (this.maxpostlen!=null &&
              this.maxpostlen.equals(other.getMaxpostlen()))) &&
            ((this.prefetchcur==null && other.getPrefetchcur()==null) || 
             (this.prefetchcur!=null &&
              this.prefetchcur.equals(other.getPrefetchcur()))) &&
            ((this.prefetchmaxpending==null && other.getPrefetchmaxpending()==null) || 
             (this.prefetchmaxpending!=null &&
              this.prefetchmaxpending.equals(other.getPrefetchmaxpending()))) &&
            ((this.enablebypass==null && other.getEnablebypass()==null) || 
             (this.enablebypass!=null &&
              this.enablebypass.equals(other.getEnablebypass()))) &&
            ((this.undefaction==null && other.getUndefaction()==null) || 
             (this.undefaction!=null &&
              this.undefaction.equals(other.getUndefaction()))) &&
            ((this.enablediskcache==null && other.getEnablediskcache()==null) || 
             (this.enablediskcache!=null &&
              this.enablediskcache.equals(other.getEnablediskcache())));
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
        if (getMemlimit() != null) {
            _hashCode += getMemlimit().hashCode();
        }
        if (getMemlimitactive() != null) {
            _hashCode += getMemlimitactive().hashCode();
        }
        if (getMaxmemlimit() != null) {
            _hashCode += getMaxmemlimit().hashCode();
        }
        if (getVia() != null) {
            _hashCode += getVia().hashCode();
        }
        if (getVerifyusing() != null) {
            _hashCode += getVerifyusing().hashCode();
        }
        if (getMaxpostlen() != null) {
            _hashCode += getMaxpostlen().hashCode();
        }
        if (getPrefetchcur() != null) {
            _hashCode += getPrefetchcur().hashCode();
        }
        if (getPrefetchmaxpending() != null) {
            _hashCode += getPrefetchmaxpending().hashCode();
        }
        if (getEnablebypass() != null) {
            _hashCode += getEnablebypass().hashCode();
        }
        if (getUndefaction() != null) {
            _hashCode += getUndefaction().hashCode();
        }
        if (getEnablediskcache() != null) {
            _hashCode += getEnablediskcache().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cacheparameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "cacheparameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memlimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "memlimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memlimitactive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "memlimitactive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxmemlimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxmemlimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("via");
        elemField.setXmlName(new javax.xml.namespace.QName("", "via"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verifyusing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "verifyusing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxpostlen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxpostlen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefetchcur");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefetchcur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefetchmaxpending");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefetchmaxpending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enablebypass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enablebypass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undefaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "undefaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enablediskcache");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enablediskcache"));
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
