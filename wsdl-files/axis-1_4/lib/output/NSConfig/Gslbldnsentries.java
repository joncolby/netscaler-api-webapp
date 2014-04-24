/**
 * Gslbldnsentries.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Gslbldnsentries  implements java.io.Serializable {
    private java.lang.String sitename;

    private org.apache.axis.types.UnsignedInt numsites;

    private java.lang.String ipaddress;

    private org.apache.axis.types.UnsignedInt ttl;

    private java.lang.String name;

    private org.apache.axis.types.UnsignedInt[] rtt;

    public Gslbldnsentries() {
    }

    public Gslbldnsentries(
           java.lang.String sitename,
           org.apache.axis.types.UnsignedInt numsites,
           java.lang.String ipaddress,
           org.apache.axis.types.UnsignedInt ttl,
           java.lang.String name,
           org.apache.axis.types.UnsignedInt[] rtt) {
           this.sitename = sitename;
           this.numsites = numsites;
           this.ipaddress = ipaddress;
           this.ttl = ttl;
           this.name = name;
           this.rtt = rtt;
    }


    /**
     * Gets the sitename value for this Gslbldnsentries.
     * 
     * @return sitename
     */
    public java.lang.String getSitename() {
        return sitename;
    }


    /**
     * Sets the sitename value for this Gslbldnsentries.
     * 
     * @param sitename
     */
    public void setSitename(java.lang.String sitename) {
        this.sitename = sitename;
    }


    /**
     * Gets the numsites value for this Gslbldnsentries.
     * 
     * @return numsites
     */
    public org.apache.axis.types.UnsignedInt getNumsites() {
        return numsites;
    }


    /**
     * Sets the numsites value for this Gslbldnsentries.
     * 
     * @param numsites
     */
    public void setNumsites(org.apache.axis.types.UnsignedInt numsites) {
        this.numsites = numsites;
    }


    /**
     * Gets the ipaddress value for this Gslbldnsentries.
     * 
     * @return ipaddress
     */
    public java.lang.String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Gslbldnsentries.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the ttl value for this Gslbldnsentries.
     * 
     * @return ttl
     */
    public org.apache.axis.types.UnsignedInt getTtl() {
        return ttl;
    }


    /**
     * Sets the ttl value for this Gslbldnsentries.
     * 
     * @param ttl
     */
    public void setTtl(org.apache.axis.types.UnsignedInt ttl) {
        this.ttl = ttl;
    }


    /**
     * Gets the name value for this Gslbldnsentries.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Gslbldnsentries.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the rtt value for this Gslbldnsentries.
     * 
     * @return rtt
     */
    public org.apache.axis.types.UnsignedInt[] getRtt() {
        return rtt;
    }


    /**
     * Sets the rtt value for this Gslbldnsentries.
     * 
     * @param rtt
     */
    public void setRtt(org.apache.axis.types.UnsignedInt[] rtt) {
        this.rtt = rtt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Gslbldnsentries)) return false;
        Gslbldnsentries other = (Gslbldnsentries) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sitename==null && other.getSitename()==null) || 
             (this.sitename!=null &&
              this.sitename.equals(other.getSitename()))) &&
            ((this.numsites==null && other.getNumsites()==null) || 
             (this.numsites!=null &&
              this.numsites.equals(other.getNumsites()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              this.ipaddress.equals(other.getIpaddress()))) &&
            ((this.ttl==null && other.getTtl()==null) || 
             (this.ttl!=null &&
              this.ttl.equals(other.getTtl()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.rtt==null && other.getRtt()==null) || 
             (this.rtt!=null &&
              java.util.Arrays.equals(this.rtt, other.getRtt())));
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
        if (getSitename() != null) {
            _hashCode += getSitename().hashCode();
        }
        if (getNumsites() != null) {
            _hashCode += getNumsites().hashCode();
        }
        if (getIpaddress() != null) {
            _hashCode += getIpaddress().hashCode();
        }
        if (getTtl() != null) {
            _hashCode += getTtl().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getRtt() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRtt());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRtt(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Gslbldnsentries.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "gslbldnsentries"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sitename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numsites");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numsites"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipaddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ttl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rtt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rtt"));
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
