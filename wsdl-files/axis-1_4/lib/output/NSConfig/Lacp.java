/**
 * Lacp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Lacp  implements java.io.Serializable {
    private java.lang.String devicename;

    private org.apache.axis.types.UnsignedInt syspriority;

    private java.lang.String mac;

    private org.apache.axis.types.UnsignedInt flags;

    private org.apache.axis.types.UnsignedInt lacpkey;

    private org.apache.axis.types.UnsignedInt clustersyspriority;

    private java.lang.String clustermac;

    public Lacp() {
    }

    public Lacp(
           java.lang.String devicename,
           org.apache.axis.types.UnsignedInt syspriority,
           java.lang.String mac,
           org.apache.axis.types.UnsignedInt flags,
           org.apache.axis.types.UnsignedInt lacpkey,
           org.apache.axis.types.UnsignedInt clustersyspriority,
           java.lang.String clustermac) {
           this.devicename = devicename;
           this.syspriority = syspriority;
           this.mac = mac;
           this.flags = flags;
           this.lacpkey = lacpkey;
           this.clustersyspriority = clustersyspriority;
           this.clustermac = clustermac;
    }


    /**
     * Gets the devicename value for this Lacp.
     * 
     * @return devicename
     */
    public java.lang.String getDevicename() {
        return devicename;
    }


    /**
     * Sets the devicename value for this Lacp.
     * 
     * @param devicename
     */
    public void setDevicename(java.lang.String devicename) {
        this.devicename = devicename;
    }


    /**
     * Gets the syspriority value for this Lacp.
     * 
     * @return syspriority
     */
    public org.apache.axis.types.UnsignedInt getSyspriority() {
        return syspriority;
    }


    /**
     * Sets the syspriority value for this Lacp.
     * 
     * @param syspriority
     */
    public void setSyspriority(org.apache.axis.types.UnsignedInt syspriority) {
        this.syspriority = syspriority;
    }


    /**
     * Gets the mac value for this Lacp.
     * 
     * @return mac
     */
    public java.lang.String getMac() {
        return mac;
    }


    /**
     * Sets the mac value for this Lacp.
     * 
     * @param mac
     */
    public void setMac(java.lang.String mac) {
        this.mac = mac;
    }


    /**
     * Gets the flags value for this Lacp.
     * 
     * @return flags
     */
    public org.apache.axis.types.UnsignedInt getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this Lacp.
     * 
     * @param flags
     */
    public void setFlags(org.apache.axis.types.UnsignedInt flags) {
        this.flags = flags;
    }


    /**
     * Gets the lacpkey value for this Lacp.
     * 
     * @return lacpkey
     */
    public org.apache.axis.types.UnsignedInt getLacpkey() {
        return lacpkey;
    }


    /**
     * Sets the lacpkey value for this Lacp.
     * 
     * @param lacpkey
     */
    public void setLacpkey(org.apache.axis.types.UnsignedInt lacpkey) {
        this.lacpkey = lacpkey;
    }


    /**
     * Gets the clustersyspriority value for this Lacp.
     * 
     * @return clustersyspriority
     */
    public org.apache.axis.types.UnsignedInt getClustersyspriority() {
        return clustersyspriority;
    }


    /**
     * Sets the clustersyspriority value for this Lacp.
     * 
     * @param clustersyspriority
     */
    public void setClustersyspriority(org.apache.axis.types.UnsignedInt clustersyspriority) {
        this.clustersyspriority = clustersyspriority;
    }


    /**
     * Gets the clustermac value for this Lacp.
     * 
     * @return clustermac
     */
    public java.lang.String getClustermac() {
        return clustermac;
    }


    /**
     * Sets the clustermac value for this Lacp.
     * 
     * @param clustermac
     */
    public void setClustermac(java.lang.String clustermac) {
        this.clustermac = clustermac;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Lacp)) return false;
        Lacp other = (Lacp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.devicename==null && other.getDevicename()==null) || 
             (this.devicename!=null &&
              this.devicename.equals(other.getDevicename()))) &&
            ((this.syspriority==null && other.getSyspriority()==null) || 
             (this.syspriority!=null &&
              this.syspriority.equals(other.getSyspriority()))) &&
            ((this.mac==null && other.getMac()==null) || 
             (this.mac!=null &&
              this.mac.equals(other.getMac()))) &&
            ((this.flags==null && other.getFlags()==null) || 
             (this.flags!=null &&
              this.flags.equals(other.getFlags()))) &&
            ((this.lacpkey==null && other.getLacpkey()==null) || 
             (this.lacpkey!=null &&
              this.lacpkey.equals(other.getLacpkey()))) &&
            ((this.clustersyspriority==null && other.getClustersyspriority()==null) || 
             (this.clustersyspriority!=null &&
              this.clustersyspriority.equals(other.getClustersyspriority()))) &&
            ((this.clustermac==null && other.getClustermac()==null) || 
             (this.clustermac!=null &&
              this.clustermac.equals(other.getClustermac())));
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
        if (getDevicename() != null) {
            _hashCode += getDevicename().hashCode();
        }
        if (getSyspriority() != null) {
            _hashCode += getSyspriority().hashCode();
        }
        if (getMac() != null) {
            _hashCode += getMac().hashCode();
        }
        if (getFlags() != null) {
            _hashCode += getFlags().hashCode();
        }
        if (getLacpkey() != null) {
            _hashCode += getLacpkey().hashCode();
        }
        if (getClustersyspriority() != null) {
            _hashCode += getClustersyspriority().hashCode();
        }
        if (getClustermac() != null) {
            _hashCode += getClustermac().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Lacp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "lacp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devicename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "devicename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syspriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "syspriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mac");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lacpkey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lacpkey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clustersyspriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clustersyspriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clustermac");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clustermac"));
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
