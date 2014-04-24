/**
 * Dnskey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Dnskey  implements java.io.Serializable {
    private java.lang.String keyname;

    private java.lang.String publickey;

    private java.lang.String privatekey;

    private org.apache.axis.types.UnsignedInt expires;

    private java.lang.String units;

    private org.apache.axis.types.UnsignedInt notificationperiod;

    private java.lang.String units2;

    private org.apache.axis.types.UnsignedInt ttl;

    public Dnskey() {
    }

    public Dnskey(
           java.lang.String keyname,
           java.lang.String publickey,
           java.lang.String privatekey,
           org.apache.axis.types.UnsignedInt expires,
           java.lang.String units,
           org.apache.axis.types.UnsignedInt notificationperiod,
           java.lang.String units2,
           org.apache.axis.types.UnsignedInt ttl) {
           this.keyname = keyname;
           this.publickey = publickey;
           this.privatekey = privatekey;
           this.expires = expires;
           this.units = units;
           this.notificationperiod = notificationperiod;
           this.units2 = units2;
           this.ttl = ttl;
    }


    /**
     * Gets the keyname value for this Dnskey.
     * 
     * @return keyname
     */
    public java.lang.String getKeyname() {
        return keyname;
    }


    /**
     * Sets the keyname value for this Dnskey.
     * 
     * @param keyname
     */
    public void setKeyname(java.lang.String keyname) {
        this.keyname = keyname;
    }


    /**
     * Gets the publickey value for this Dnskey.
     * 
     * @return publickey
     */
    public java.lang.String getPublickey() {
        return publickey;
    }


    /**
     * Sets the publickey value for this Dnskey.
     * 
     * @param publickey
     */
    public void setPublickey(java.lang.String publickey) {
        this.publickey = publickey;
    }


    /**
     * Gets the privatekey value for this Dnskey.
     * 
     * @return privatekey
     */
    public java.lang.String getPrivatekey() {
        return privatekey;
    }


    /**
     * Sets the privatekey value for this Dnskey.
     * 
     * @param privatekey
     */
    public void setPrivatekey(java.lang.String privatekey) {
        this.privatekey = privatekey;
    }


    /**
     * Gets the expires value for this Dnskey.
     * 
     * @return expires
     */
    public org.apache.axis.types.UnsignedInt getExpires() {
        return expires;
    }


    /**
     * Sets the expires value for this Dnskey.
     * 
     * @param expires
     */
    public void setExpires(org.apache.axis.types.UnsignedInt expires) {
        this.expires = expires;
    }


    /**
     * Gets the units value for this Dnskey.
     * 
     * @return units
     */
    public java.lang.String getUnits() {
        return units;
    }


    /**
     * Sets the units value for this Dnskey.
     * 
     * @param units
     */
    public void setUnits(java.lang.String units) {
        this.units = units;
    }


    /**
     * Gets the notificationperiod value for this Dnskey.
     * 
     * @return notificationperiod
     */
    public org.apache.axis.types.UnsignedInt getNotificationperiod() {
        return notificationperiod;
    }


    /**
     * Sets the notificationperiod value for this Dnskey.
     * 
     * @param notificationperiod
     */
    public void setNotificationperiod(org.apache.axis.types.UnsignedInt notificationperiod) {
        this.notificationperiod = notificationperiod;
    }


    /**
     * Gets the units2 value for this Dnskey.
     * 
     * @return units2
     */
    public java.lang.String getUnits2() {
        return units2;
    }


    /**
     * Sets the units2 value for this Dnskey.
     * 
     * @param units2
     */
    public void setUnits2(java.lang.String units2) {
        this.units2 = units2;
    }


    /**
     * Gets the ttl value for this Dnskey.
     * 
     * @return ttl
     */
    public org.apache.axis.types.UnsignedInt getTtl() {
        return ttl;
    }


    /**
     * Sets the ttl value for this Dnskey.
     * 
     * @param ttl
     */
    public void setTtl(org.apache.axis.types.UnsignedInt ttl) {
        this.ttl = ttl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Dnskey)) return false;
        Dnskey other = (Dnskey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.keyname==null && other.getKeyname()==null) || 
             (this.keyname!=null &&
              this.keyname.equals(other.getKeyname()))) &&
            ((this.publickey==null && other.getPublickey()==null) || 
             (this.publickey!=null &&
              this.publickey.equals(other.getPublickey()))) &&
            ((this.privatekey==null && other.getPrivatekey()==null) || 
             (this.privatekey!=null &&
              this.privatekey.equals(other.getPrivatekey()))) &&
            ((this.expires==null && other.getExpires()==null) || 
             (this.expires!=null &&
              this.expires.equals(other.getExpires()))) &&
            ((this.units==null && other.getUnits()==null) || 
             (this.units!=null &&
              this.units.equals(other.getUnits()))) &&
            ((this.notificationperiod==null && other.getNotificationperiod()==null) || 
             (this.notificationperiod!=null &&
              this.notificationperiod.equals(other.getNotificationperiod()))) &&
            ((this.units2==null && other.getUnits2()==null) || 
             (this.units2!=null &&
              this.units2.equals(other.getUnits2()))) &&
            ((this.ttl==null && other.getTtl()==null) || 
             (this.ttl!=null &&
              this.ttl.equals(other.getTtl())));
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
        if (getKeyname() != null) {
            _hashCode += getKeyname().hashCode();
        }
        if (getPublickey() != null) {
            _hashCode += getPublickey().hashCode();
        }
        if (getPrivatekey() != null) {
            _hashCode += getPrivatekey().hashCode();
        }
        if (getExpires() != null) {
            _hashCode += getExpires().hashCode();
        }
        if (getUnits() != null) {
            _hashCode += getUnits().hashCode();
        }
        if (getNotificationperiod() != null) {
            _hashCode += getNotificationperiod().hashCode();
        }
        if (getUnits2() != null) {
            _hashCode += getUnits2().hashCode();
        }
        if (getTtl() != null) {
            _hashCode += getTtl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dnskey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "dnskey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keyname"));
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
        elemField.setFieldName("expires");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expires"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new javax.xml.namespace.QName("", "units"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationperiod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notificationperiod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("units2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "units2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ttl"));
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
