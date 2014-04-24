/**
 * Snmpmib.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Snmpmib  implements java.io.Serializable {
    private java.lang.String contact;

    private java.lang.String name;

    private java.lang.String location;

    private java.lang.String sysdesc;

    private org.apache.axis.types.UnsignedInt sysuptime;

    private org.apache.axis.types.UnsignedInt sysservices;

    private java.lang.String sysoid;

    private java.lang.String customid;

    public Snmpmib() {
    }

    public Snmpmib(
           java.lang.String contact,
           java.lang.String name,
           java.lang.String location,
           java.lang.String sysdesc,
           org.apache.axis.types.UnsignedInt sysuptime,
           org.apache.axis.types.UnsignedInt sysservices,
           java.lang.String sysoid,
           java.lang.String customid) {
           this.contact = contact;
           this.name = name;
           this.location = location;
           this.sysdesc = sysdesc;
           this.sysuptime = sysuptime;
           this.sysservices = sysservices;
           this.sysoid = sysoid;
           this.customid = customid;
    }


    /**
     * Gets the contact value for this Snmpmib.
     * 
     * @return contact
     */
    public java.lang.String getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this Snmpmib.
     * 
     * @param contact
     */
    public void setContact(java.lang.String contact) {
        this.contact = contact;
    }


    /**
     * Gets the name value for this Snmpmib.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Snmpmib.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the location value for this Snmpmib.
     * 
     * @return location
     */
    public java.lang.String getLocation() {
        return location;
    }


    /**
     * Sets the location value for this Snmpmib.
     * 
     * @param location
     */
    public void setLocation(java.lang.String location) {
        this.location = location;
    }


    /**
     * Gets the sysdesc value for this Snmpmib.
     * 
     * @return sysdesc
     */
    public java.lang.String getSysdesc() {
        return sysdesc;
    }


    /**
     * Sets the sysdesc value for this Snmpmib.
     * 
     * @param sysdesc
     */
    public void setSysdesc(java.lang.String sysdesc) {
        this.sysdesc = sysdesc;
    }


    /**
     * Gets the sysuptime value for this Snmpmib.
     * 
     * @return sysuptime
     */
    public org.apache.axis.types.UnsignedInt getSysuptime() {
        return sysuptime;
    }


    /**
     * Sets the sysuptime value for this Snmpmib.
     * 
     * @param sysuptime
     */
    public void setSysuptime(org.apache.axis.types.UnsignedInt sysuptime) {
        this.sysuptime = sysuptime;
    }


    /**
     * Gets the sysservices value for this Snmpmib.
     * 
     * @return sysservices
     */
    public org.apache.axis.types.UnsignedInt getSysservices() {
        return sysservices;
    }


    /**
     * Sets the sysservices value for this Snmpmib.
     * 
     * @param sysservices
     */
    public void setSysservices(org.apache.axis.types.UnsignedInt sysservices) {
        this.sysservices = sysservices;
    }


    /**
     * Gets the sysoid value for this Snmpmib.
     * 
     * @return sysoid
     */
    public java.lang.String getSysoid() {
        return sysoid;
    }


    /**
     * Sets the sysoid value for this Snmpmib.
     * 
     * @param sysoid
     */
    public void setSysoid(java.lang.String sysoid) {
        this.sysoid = sysoid;
    }


    /**
     * Gets the customid value for this Snmpmib.
     * 
     * @return customid
     */
    public java.lang.String getCustomid() {
        return customid;
    }


    /**
     * Sets the customid value for this Snmpmib.
     * 
     * @param customid
     */
    public void setCustomid(java.lang.String customid) {
        this.customid = customid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Snmpmib)) return false;
        Snmpmib other = (Snmpmib) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.location==null && other.getLocation()==null) || 
             (this.location!=null &&
              this.location.equals(other.getLocation()))) &&
            ((this.sysdesc==null && other.getSysdesc()==null) || 
             (this.sysdesc!=null &&
              this.sysdesc.equals(other.getSysdesc()))) &&
            ((this.sysuptime==null && other.getSysuptime()==null) || 
             (this.sysuptime!=null &&
              this.sysuptime.equals(other.getSysuptime()))) &&
            ((this.sysservices==null && other.getSysservices()==null) || 
             (this.sysservices!=null &&
              this.sysservices.equals(other.getSysservices()))) &&
            ((this.sysoid==null && other.getSysoid()==null) || 
             (this.sysoid!=null &&
              this.sysoid.equals(other.getSysoid()))) &&
            ((this.customid==null && other.getCustomid()==null) || 
             (this.customid!=null &&
              this.customid.equals(other.getCustomid())));
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
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getLocation() != null) {
            _hashCode += getLocation().hashCode();
        }
        if (getSysdesc() != null) {
            _hashCode += getSysdesc().hashCode();
        }
        if (getSysuptime() != null) {
            _hashCode += getSysuptime().hashCode();
        }
        if (getSysservices() != null) {
            _hashCode += getSysservices().hashCode();
        }
        if (getSysoid() != null) {
            _hashCode += getSysoid().hashCode();
        }
        if (getCustomid() != null) {
            _hashCode += getCustomid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Snmpmib.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "snmpmib"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new javax.xml.namespace.QName("", "location"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sysdesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sysdesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sysuptime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sysuptime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sysservices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sysservices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sysoid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sysoid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customid"));
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
