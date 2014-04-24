/**
 * Ipsecprofile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Ipsecprofile  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String ikeversion;

    private java.lang.String encalgo;

    private java.lang.String hashalgo;

    private org.apache.axis.types.UnsignedInt lifetime;

    private org.apache.axis.types.UnsignedInt livenesscheckinterval;

    private org.apache.axis.types.UnsignedInt replaywindowsize;

    private org.apache.axis.types.UnsignedInt retransmissiontime;

    private java.lang.String psk;

    private java.lang.String publickey;

    private java.lang.String privatekey;

    private java.lang.String peerpublickey;

    private org.apache.axis.types.UnsignedInt ikeretryinterval;

    private java.lang.String builtin;

    public Ipsecprofile() {
    }

    public Ipsecprofile(
           java.lang.String name,
           java.lang.String ikeversion,
           java.lang.String encalgo,
           java.lang.String hashalgo,
           org.apache.axis.types.UnsignedInt lifetime,
           org.apache.axis.types.UnsignedInt livenesscheckinterval,
           org.apache.axis.types.UnsignedInt replaywindowsize,
           org.apache.axis.types.UnsignedInt retransmissiontime,
           java.lang.String psk,
           java.lang.String publickey,
           java.lang.String privatekey,
           java.lang.String peerpublickey,
           org.apache.axis.types.UnsignedInt ikeretryinterval,
           java.lang.String builtin) {
           this.name = name;
           this.ikeversion = ikeversion;
           this.encalgo = encalgo;
           this.hashalgo = hashalgo;
           this.lifetime = lifetime;
           this.livenesscheckinterval = livenesscheckinterval;
           this.replaywindowsize = replaywindowsize;
           this.retransmissiontime = retransmissiontime;
           this.psk = psk;
           this.publickey = publickey;
           this.privatekey = privatekey;
           this.peerpublickey = peerpublickey;
           this.ikeretryinterval = ikeretryinterval;
           this.builtin = builtin;
    }


    /**
     * Gets the name value for this Ipsecprofile.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Ipsecprofile.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the ikeversion value for this Ipsecprofile.
     * 
     * @return ikeversion
     */
    public java.lang.String getIkeversion() {
        return ikeversion;
    }


    /**
     * Sets the ikeversion value for this Ipsecprofile.
     * 
     * @param ikeversion
     */
    public void setIkeversion(java.lang.String ikeversion) {
        this.ikeversion = ikeversion;
    }


    /**
     * Gets the encalgo value for this Ipsecprofile.
     * 
     * @return encalgo
     */
    public java.lang.String getEncalgo() {
        return encalgo;
    }


    /**
     * Sets the encalgo value for this Ipsecprofile.
     * 
     * @param encalgo
     */
    public void setEncalgo(java.lang.String encalgo) {
        this.encalgo = encalgo;
    }


    /**
     * Gets the hashalgo value for this Ipsecprofile.
     * 
     * @return hashalgo
     */
    public java.lang.String getHashalgo() {
        return hashalgo;
    }


    /**
     * Sets the hashalgo value for this Ipsecprofile.
     * 
     * @param hashalgo
     */
    public void setHashalgo(java.lang.String hashalgo) {
        this.hashalgo = hashalgo;
    }


    /**
     * Gets the lifetime value for this Ipsecprofile.
     * 
     * @return lifetime
     */
    public org.apache.axis.types.UnsignedInt getLifetime() {
        return lifetime;
    }


    /**
     * Sets the lifetime value for this Ipsecprofile.
     * 
     * @param lifetime
     */
    public void setLifetime(org.apache.axis.types.UnsignedInt lifetime) {
        this.lifetime = lifetime;
    }


    /**
     * Gets the livenesscheckinterval value for this Ipsecprofile.
     * 
     * @return livenesscheckinterval
     */
    public org.apache.axis.types.UnsignedInt getLivenesscheckinterval() {
        return livenesscheckinterval;
    }


    /**
     * Sets the livenesscheckinterval value for this Ipsecprofile.
     * 
     * @param livenesscheckinterval
     */
    public void setLivenesscheckinterval(org.apache.axis.types.UnsignedInt livenesscheckinterval) {
        this.livenesscheckinterval = livenesscheckinterval;
    }


    /**
     * Gets the replaywindowsize value for this Ipsecprofile.
     * 
     * @return replaywindowsize
     */
    public org.apache.axis.types.UnsignedInt getReplaywindowsize() {
        return replaywindowsize;
    }


    /**
     * Sets the replaywindowsize value for this Ipsecprofile.
     * 
     * @param replaywindowsize
     */
    public void setReplaywindowsize(org.apache.axis.types.UnsignedInt replaywindowsize) {
        this.replaywindowsize = replaywindowsize;
    }


    /**
     * Gets the retransmissiontime value for this Ipsecprofile.
     * 
     * @return retransmissiontime
     */
    public org.apache.axis.types.UnsignedInt getRetransmissiontime() {
        return retransmissiontime;
    }


    /**
     * Sets the retransmissiontime value for this Ipsecprofile.
     * 
     * @param retransmissiontime
     */
    public void setRetransmissiontime(org.apache.axis.types.UnsignedInt retransmissiontime) {
        this.retransmissiontime = retransmissiontime;
    }


    /**
     * Gets the psk value for this Ipsecprofile.
     * 
     * @return psk
     */
    public java.lang.String getPsk() {
        return psk;
    }


    /**
     * Sets the psk value for this Ipsecprofile.
     * 
     * @param psk
     */
    public void setPsk(java.lang.String psk) {
        this.psk = psk;
    }


    /**
     * Gets the publickey value for this Ipsecprofile.
     * 
     * @return publickey
     */
    public java.lang.String getPublickey() {
        return publickey;
    }


    /**
     * Sets the publickey value for this Ipsecprofile.
     * 
     * @param publickey
     */
    public void setPublickey(java.lang.String publickey) {
        this.publickey = publickey;
    }


    /**
     * Gets the privatekey value for this Ipsecprofile.
     * 
     * @return privatekey
     */
    public java.lang.String getPrivatekey() {
        return privatekey;
    }


    /**
     * Sets the privatekey value for this Ipsecprofile.
     * 
     * @param privatekey
     */
    public void setPrivatekey(java.lang.String privatekey) {
        this.privatekey = privatekey;
    }


    /**
     * Gets the peerpublickey value for this Ipsecprofile.
     * 
     * @return peerpublickey
     */
    public java.lang.String getPeerpublickey() {
        return peerpublickey;
    }


    /**
     * Sets the peerpublickey value for this Ipsecprofile.
     * 
     * @param peerpublickey
     */
    public void setPeerpublickey(java.lang.String peerpublickey) {
        this.peerpublickey = peerpublickey;
    }


    /**
     * Gets the ikeretryinterval value for this Ipsecprofile.
     * 
     * @return ikeretryinterval
     */
    public org.apache.axis.types.UnsignedInt getIkeretryinterval() {
        return ikeretryinterval;
    }


    /**
     * Sets the ikeretryinterval value for this Ipsecprofile.
     * 
     * @param ikeretryinterval
     */
    public void setIkeretryinterval(org.apache.axis.types.UnsignedInt ikeretryinterval) {
        this.ikeretryinterval = ikeretryinterval;
    }


    /**
     * Gets the builtin value for this Ipsecprofile.
     * 
     * @return builtin
     */
    public java.lang.String getBuiltin() {
        return builtin;
    }


    /**
     * Sets the builtin value for this Ipsecprofile.
     * 
     * @param builtin
     */
    public void setBuiltin(java.lang.String builtin) {
        this.builtin = builtin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ipsecprofile)) return false;
        Ipsecprofile other = (Ipsecprofile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
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
            ((this.retransmissiontime==null && other.getRetransmissiontime()==null) || 
             (this.retransmissiontime!=null &&
              this.retransmissiontime.equals(other.getRetransmissiontime()))) &&
            ((this.psk==null && other.getPsk()==null) || 
             (this.psk!=null &&
              this.psk.equals(other.getPsk()))) &&
            ((this.publickey==null && other.getPublickey()==null) || 
             (this.publickey!=null &&
              this.publickey.equals(other.getPublickey()))) &&
            ((this.privatekey==null && other.getPrivatekey()==null) || 
             (this.privatekey!=null &&
              this.privatekey.equals(other.getPrivatekey()))) &&
            ((this.peerpublickey==null && other.getPeerpublickey()==null) || 
             (this.peerpublickey!=null &&
              this.peerpublickey.equals(other.getPeerpublickey()))) &&
            ((this.ikeretryinterval==null && other.getIkeretryinterval()==null) || 
             (this.ikeretryinterval!=null &&
              this.ikeretryinterval.equals(other.getIkeretryinterval()))) &&
            ((this.builtin==null && other.getBuiltin()==null) || 
             (this.builtin!=null &&
              this.builtin.equals(other.getBuiltin())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
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
        if (getRetransmissiontime() != null) {
            _hashCode += getRetransmissiontime().hashCode();
        }
        if (getPsk() != null) {
            _hashCode += getPsk().hashCode();
        }
        if (getPublickey() != null) {
            _hashCode += getPublickey().hashCode();
        }
        if (getPrivatekey() != null) {
            _hashCode += getPrivatekey().hashCode();
        }
        if (getPeerpublickey() != null) {
            _hashCode += getPeerpublickey().hashCode();
        }
        if (getIkeretryinterval() != null) {
            _hashCode += getIkeretryinterval().hashCode();
        }
        if (getBuiltin() != null) {
            _hashCode += getBuiltin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ipsecprofile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "ipsecprofile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("retransmissiontime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retransmissiontime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("psk");
        elemField.setXmlName(new javax.xml.namespace.QName("", "psk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publickey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publickey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privatekey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "privatekey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peerpublickey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "peerpublickey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ikeretryinterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ikeretryinterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builtin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "builtin"));
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
