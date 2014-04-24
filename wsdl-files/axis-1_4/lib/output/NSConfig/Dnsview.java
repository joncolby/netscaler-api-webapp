/**
 * Dnsview.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Dnsview  implements java.io.Serializable {
    private java.lang.String viewname;

    private java.lang.String servicename;

    private java.lang.String[] gslbservicename;

    private java.lang.String[] dnspolicyname;

    private java.lang.String[] ipaddress;

    private org.apache.axis.types.UnsignedInt flags;

    public Dnsview() {
    }

    public Dnsview(
           java.lang.String viewname,
           java.lang.String servicename,
           java.lang.String[] gslbservicename,
           java.lang.String[] dnspolicyname,
           java.lang.String[] ipaddress,
           org.apache.axis.types.UnsignedInt flags) {
           this.viewname = viewname;
           this.servicename = servicename;
           this.gslbservicename = gslbservicename;
           this.dnspolicyname = dnspolicyname;
           this.ipaddress = ipaddress;
           this.flags = flags;
    }


    /**
     * Gets the viewname value for this Dnsview.
     * 
     * @return viewname
     */
    public java.lang.String getViewname() {
        return viewname;
    }


    /**
     * Sets the viewname value for this Dnsview.
     * 
     * @param viewname
     */
    public void setViewname(java.lang.String viewname) {
        this.viewname = viewname;
    }


    /**
     * Gets the servicename value for this Dnsview.
     * 
     * @return servicename
     */
    public java.lang.String getServicename() {
        return servicename;
    }


    /**
     * Sets the servicename value for this Dnsview.
     * 
     * @param servicename
     */
    public void setServicename(java.lang.String servicename) {
        this.servicename = servicename;
    }


    /**
     * Gets the gslbservicename value for this Dnsview.
     * 
     * @return gslbservicename
     */
    public java.lang.String[] getGslbservicename() {
        return gslbservicename;
    }


    /**
     * Sets the gslbservicename value for this Dnsview.
     * 
     * @param gslbservicename
     */
    public void setGslbservicename(java.lang.String[] gslbservicename) {
        this.gslbservicename = gslbservicename;
    }


    /**
     * Gets the dnspolicyname value for this Dnsview.
     * 
     * @return dnspolicyname
     */
    public java.lang.String[] getDnspolicyname() {
        return dnspolicyname;
    }


    /**
     * Sets the dnspolicyname value for this Dnsview.
     * 
     * @param dnspolicyname
     */
    public void setDnspolicyname(java.lang.String[] dnspolicyname) {
        this.dnspolicyname = dnspolicyname;
    }


    /**
     * Gets the ipaddress value for this Dnsview.
     * 
     * @return ipaddress
     */
    public java.lang.String[] getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Dnsview.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String[] ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the flags value for this Dnsview.
     * 
     * @return flags
     */
    public org.apache.axis.types.UnsignedInt getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this Dnsview.
     * 
     * @param flags
     */
    public void setFlags(org.apache.axis.types.UnsignedInt flags) {
        this.flags = flags;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Dnsview)) return false;
        Dnsview other = (Dnsview) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.viewname==null && other.getViewname()==null) || 
             (this.viewname!=null &&
              this.viewname.equals(other.getViewname()))) &&
            ((this.servicename==null && other.getServicename()==null) || 
             (this.servicename!=null &&
              this.servicename.equals(other.getServicename()))) &&
            ((this.gslbservicename==null && other.getGslbservicename()==null) || 
             (this.gslbservicename!=null &&
              java.util.Arrays.equals(this.gslbservicename, other.getGslbservicename()))) &&
            ((this.dnspolicyname==null && other.getDnspolicyname()==null) || 
             (this.dnspolicyname!=null &&
              java.util.Arrays.equals(this.dnspolicyname, other.getDnspolicyname()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              java.util.Arrays.equals(this.ipaddress, other.getIpaddress()))) &&
            ((this.flags==null && other.getFlags()==null) || 
             (this.flags!=null &&
              this.flags.equals(other.getFlags())));
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
        if (getViewname() != null) {
            _hashCode += getViewname().hashCode();
        }
        if (getServicename() != null) {
            _hashCode += getServicename().hashCode();
        }
        if (getGslbservicename() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGslbservicename());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGslbservicename(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDnspolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDnspolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDnspolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIpaddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpaddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpaddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFlags() != null) {
            _hashCode += getFlags().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dnsview.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "dnsview"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viewname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gslbservicename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gslbservicename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnspolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnspolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipaddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flags"));
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
