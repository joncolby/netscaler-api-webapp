/**
 * Nshardware.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nshardware  implements java.io.Serializable {
    private java.lang.String hwdescription;

    private org.apache.axis.types.UnsignedInt sysid;

    private int manufactureday;

    private int manufacturemonth;

    private int manufactureyear;

    private int cpufrequncy;

    private int hostid;

    private java.lang.String host;

    private java.lang.String serialno;

    private java.lang.String encodedserialno;

    public Nshardware() {
    }

    public Nshardware(
           java.lang.String hwdescription,
           org.apache.axis.types.UnsignedInt sysid,
           int manufactureday,
           int manufacturemonth,
           int manufactureyear,
           int cpufrequncy,
           int hostid,
           java.lang.String host,
           java.lang.String serialno,
           java.lang.String encodedserialno) {
           this.hwdescription = hwdescription;
           this.sysid = sysid;
           this.manufactureday = manufactureday;
           this.manufacturemonth = manufacturemonth;
           this.manufactureyear = manufactureyear;
           this.cpufrequncy = cpufrequncy;
           this.hostid = hostid;
           this.host = host;
           this.serialno = serialno;
           this.encodedserialno = encodedserialno;
    }


    /**
     * Gets the hwdescription value for this Nshardware.
     * 
     * @return hwdescription
     */
    public java.lang.String getHwdescription() {
        return hwdescription;
    }


    /**
     * Sets the hwdescription value for this Nshardware.
     * 
     * @param hwdescription
     */
    public void setHwdescription(java.lang.String hwdescription) {
        this.hwdescription = hwdescription;
    }


    /**
     * Gets the sysid value for this Nshardware.
     * 
     * @return sysid
     */
    public org.apache.axis.types.UnsignedInt getSysid() {
        return sysid;
    }


    /**
     * Sets the sysid value for this Nshardware.
     * 
     * @param sysid
     */
    public void setSysid(org.apache.axis.types.UnsignedInt sysid) {
        this.sysid = sysid;
    }


    /**
     * Gets the manufactureday value for this Nshardware.
     * 
     * @return manufactureday
     */
    public int getManufactureday() {
        return manufactureday;
    }


    /**
     * Sets the manufactureday value for this Nshardware.
     * 
     * @param manufactureday
     */
    public void setManufactureday(int manufactureday) {
        this.manufactureday = manufactureday;
    }


    /**
     * Gets the manufacturemonth value for this Nshardware.
     * 
     * @return manufacturemonth
     */
    public int getManufacturemonth() {
        return manufacturemonth;
    }


    /**
     * Sets the manufacturemonth value for this Nshardware.
     * 
     * @param manufacturemonth
     */
    public void setManufacturemonth(int manufacturemonth) {
        this.manufacturemonth = manufacturemonth;
    }


    /**
     * Gets the manufactureyear value for this Nshardware.
     * 
     * @return manufactureyear
     */
    public int getManufactureyear() {
        return manufactureyear;
    }


    /**
     * Sets the manufactureyear value for this Nshardware.
     * 
     * @param manufactureyear
     */
    public void setManufactureyear(int manufactureyear) {
        this.manufactureyear = manufactureyear;
    }


    /**
     * Gets the cpufrequncy value for this Nshardware.
     * 
     * @return cpufrequncy
     */
    public int getCpufrequncy() {
        return cpufrequncy;
    }


    /**
     * Sets the cpufrequncy value for this Nshardware.
     * 
     * @param cpufrequncy
     */
    public void setCpufrequncy(int cpufrequncy) {
        this.cpufrequncy = cpufrequncy;
    }


    /**
     * Gets the hostid value for this Nshardware.
     * 
     * @return hostid
     */
    public int getHostid() {
        return hostid;
    }


    /**
     * Sets the hostid value for this Nshardware.
     * 
     * @param hostid
     */
    public void setHostid(int hostid) {
        this.hostid = hostid;
    }


    /**
     * Gets the host value for this Nshardware.
     * 
     * @return host
     */
    public java.lang.String getHost() {
        return host;
    }


    /**
     * Sets the host value for this Nshardware.
     * 
     * @param host
     */
    public void setHost(java.lang.String host) {
        this.host = host;
    }


    /**
     * Gets the serialno value for this Nshardware.
     * 
     * @return serialno
     */
    public java.lang.String getSerialno() {
        return serialno;
    }


    /**
     * Sets the serialno value for this Nshardware.
     * 
     * @param serialno
     */
    public void setSerialno(java.lang.String serialno) {
        this.serialno = serialno;
    }


    /**
     * Gets the encodedserialno value for this Nshardware.
     * 
     * @return encodedserialno
     */
    public java.lang.String getEncodedserialno() {
        return encodedserialno;
    }


    /**
     * Sets the encodedserialno value for this Nshardware.
     * 
     * @param encodedserialno
     */
    public void setEncodedserialno(java.lang.String encodedserialno) {
        this.encodedserialno = encodedserialno;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nshardware)) return false;
        Nshardware other = (Nshardware) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hwdescription==null && other.getHwdescription()==null) || 
             (this.hwdescription!=null &&
              this.hwdescription.equals(other.getHwdescription()))) &&
            ((this.sysid==null && other.getSysid()==null) || 
             (this.sysid!=null &&
              this.sysid.equals(other.getSysid()))) &&
            this.manufactureday == other.getManufactureday() &&
            this.manufacturemonth == other.getManufacturemonth() &&
            this.manufactureyear == other.getManufactureyear() &&
            this.cpufrequncy == other.getCpufrequncy() &&
            this.hostid == other.getHostid() &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.serialno==null && other.getSerialno()==null) || 
             (this.serialno!=null &&
              this.serialno.equals(other.getSerialno()))) &&
            ((this.encodedserialno==null && other.getEncodedserialno()==null) || 
             (this.encodedserialno!=null &&
              this.encodedserialno.equals(other.getEncodedserialno())));
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
        if (getHwdescription() != null) {
            _hashCode += getHwdescription().hashCode();
        }
        if (getSysid() != null) {
            _hashCode += getSysid().hashCode();
        }
        _hashCode += getManufactureday();
        _hashCode += getManufacturemonth();
        _hashCode += getManufactureyear();
        _hashCode += getCpufrequncy();
        _hashCode += getHostid();
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getSerialno() != null) {
            _hashCode += getSerialno().hashCode();
        }
        if (getEncodedserialno() != null) {
            _hashCode += getEncodedserialno().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nshardware.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nshardware"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hwdescription");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hwdescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sysid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sysid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufactureday");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manufactureday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufacturemonth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manufacturemonth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manufactureyear");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manufactureyear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cpufrequncy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cpufrequncy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serialno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encodedserialno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "encodedserialno"));
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
