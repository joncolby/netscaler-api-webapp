/**
 * Dnssoarec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Dnssoarec  implements java.io.Serializable {
    private java.lang.String domain;

    private java.lang.String type;

    private java.lang.String originserver;

    private java.lang.String contact;

    private org.apache.axis.types.UnsignedInt serial;

    private org.apache.axis.types.UnsignedInt refresh;

    private org.apache.axis.types.UnsignedInt retry;

    private org.apache.axis.types.UnsignedInt expire;

    private org.apache.axis.types.UnsignedInt minimum;

    private org.apache.axis.types.UnsignedInt ttl;

    private java.lang.String authtype;

    public Dnssoarec() {
    }

    public Dnssoarec(
           java.lang.String domain,
           java.lang.String type,
           java.lang.String originserver,
           java.lang.String contact,
           org.apache.axis.types.UnsignedInt serial,
           org.apache.axis.types.UnsignedInt refresh,
           org.apache.axis.types.UnsignedInt retry,
           org.apache.axis.types.UnsignedInt expire,
           org.apache.axis.types.UnsignedInt minimum,
           org.apache.axis.types.UnsignedInt ttl,
           java.lang.String authtype) {
           this.domain = domain;
           this.type = type;
           this.originserver = originserver;
           this.contact = contact;
           this.serial = serial;
           this.refresh = refresh;
           this.retry = retry;
           this.expire = expire;
           this.minimum = minimum;
           this.ttl = ttl;
           this.authtype = authtype;
    }


    /**
     * Gets the domain value for this Dnssoarec.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this Dnssoarec.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the type value for this Dnssoarec.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Dnssoarec.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the originserver value for this Dnssoarec.
     * 
     * @return originserver
     */
    public java.lang.String getOriginserver() {
        return originserver;
    }


    /**
     * Sets the originserver value for this Dnssoarec.
     * 
     * @param originserver
     */
    public void setOriginserver(java.lang.String originserver) {
        this.originserver = originserver;
    }


    /**
     * Gets the contact value for this Dnssoarec.
     * 
     * @return contact
     */
    public java.lang.String getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this Dnssoarec.
     * 
     * @param contact
     */
    public void setContact(java.lang.String contact) {
        this.contact = contact;
    }


    /**
     * Gets the serial value for this Dnssoarec.
     * 
     * @return serial
     */
    public org.apache.axis.types.UnsignedInt getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this Dnssoarec.
     * 
     * @param serial
     */
    public void setSerial(org.apache.axis.types.UnsignedInt serial) {
        this.serial = serial;
    }


    /**
     * Gets the refresh value for this Dnssoarec.
     * 
     * @return refresh
     */
    public org.apache.axis.types.UnsignedInt getRefresh() {
        return refresh;
    }


    /**
     * Sets the refresh value for this Dnssoarec.
     * 
     * @param refresh
     */
    public void setRefresh(org.apache.axis.types.UnsignedInt refresh) {
        this.refresh = refresh;
    }


    /**
     * Gets the retry value for this Dnssoarec.
     * 
     * @return retry
     */
    public org.apache.axis.types.UnsignedInt getRetry() {
        return retry;
    }


    /**
     * Sets the retry value for this Dnssoarec.
     * 
     * @param retry
     */
    public void setRetry(org.apache.axis.types.UnsignedInt retry) {
        this.retry = retry;
    }


    /**
     * Gets the expire value for this Dnssoarec.
     * 
     * @return expire
     */
    public org.apache.axis.types.UnsignedInt getExpire() {
        return expire;
    }


    /**
     * Sets the expire value for this Dnssoarec.
     * 
     * @param expire
     */
    public void setExpire(org.apache.axis.types.UnsignedInt expire) {
        this.expire = expire;
    }


    /**
     * Gets the minimum value for this Dnssoarec.
     * 
     * @return minimum
     */
    public org.apache.axis.types.UnsignedInt getMinimum() {
        return minimum;
    }


    /**
     * Sets the minimum value for this Dnssoarec.
     * 
     * @param minimum
     */
    public void setMinimum(org.apache.axis.types.UnsignedInt minimum) {
        this.minimum = minimum;
    }


    /**
     * Gets the ttl value for this Dnssoarec.
     * 
     * @return ttl
     */
    public org.apache.axis.types.UnsignedInt getTtl() {
        return ttl;
    }


    /**
     * Sets the ttl value for this Dnssoarec.
     * 
     * @param ttl
     */
    public void setTtl(org.apache.axis.types.UnsignedInt ttl) {
        this.ttl = ttl;
    }


    /**
     * Gets the authtype value for this Dnssoarec.
     * 
     * @return authtype
     */
    public java.lang.String getAuthtype() {
        return authtype;
    }


    /**
     * Sets the authtype value for this Dnssoarec.
     * 
     * @param authtype
     */
    public void setAuthtype(java.lang.String authtype) {
        this.authtype = authtype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Dnssoarec)) return false;
        Dnssoarec other = (Dnssoarec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.originserver==null && other.getOriginserver()==null) || 
             (this.originserver!=null &&
              this.originserver.equals(other.getOriginserver()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.serial==null && other.getSerial()==null) || 
             (this.serial!=null &&
              this.serial.equals(other.getSerial()))) &&
            ((this.refresh==null && other.getRefresh()==null) || 
             (this.refresh!=null &&
              this.refresh.equals(other.getRefresh()))) &&
            ((this.retry==null && other.getRetry()==null) || 
             (this.retry!=null &&
              this.retry.equals(other.getRetry()))) &&
            ((this.expire==null && other.getExpire()==null) || 
             (this.expire!=null &&
              this.expire.equals(other.getExpire()))) &&
            ((this.minimum==null && other.getMinimum()==null) || 
             (this.minimum!=null &&
              this.minimum.equals(other.getMinimum()))) &&
            ((this.ttl==null && other.getTtl()==null) || 
             (this.ttl!=null &&
              this.ttl.equals(other.getTtl()))) &&
            ((this.authtype==null && other.getAuthtype()==null) || 
             (this.authtype!=null &&
              this.authtype.equals(other.getAuthtype())));
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
        if (getDomain() != null) {
            _hashCode += getDomain().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getOriginserver() != null) {
            _hashCode += getOriginserver().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getSerial() != null) {
            _hashCode += getSerial().hashCode();
        }
        if (getRefresh() != null) {
            _hashCode += getRefresh().hashCode();
        }
        if (getRetry() != null) {
            _hashCode += getRetry().hashCode();
        }
        if (getExpire() != null) {
            _hashCode += getExpire().hashCode();
        }
        if (getMinimum() != null) {
            _hashCode += getMinimum().hashCode();
        }
        if (getTtl() != null) {
            _hashCode += getTtl().hashCode();
        }
        if (getAuthtype() != null) {
            _hashCode += getAuthtype().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dnssoarec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "dnssoarec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refresh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refresh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expire");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expire"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minimum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ttl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authtype"));
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
