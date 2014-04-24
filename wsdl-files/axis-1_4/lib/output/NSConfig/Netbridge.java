/**
 * Netbridge.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Netbridge  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String[] tunnel;

    private org.apache.axis.types.UnsignedInt[] vlan;

    private java.lang.String[] ipaddress;

    private java.lang.String[] netmask;

    public Netbridge() {
    }

    public Netbridge(
           java.lang.String name,
           java.lang.String[] tunnel,
           org.apache.axis.types.UnsignedInt[] vlan,
           java.lang.String[] ipaddress,
           java.lang.String[] netmask) {
           this.name = name;
           this.tunnel = tunnel;
           this.vlan = vlan;
           this.ipaddress = ipaddress;
           this.netmask = netmask;
    }


    /**
     * Gets the name value for this Netbridge.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Netbridge.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the tunnel value for this Netbridge.
     * 
     * @return tunnel
     */
    public java.lang.String[] getTunnel() {
        return tunnel;
    }


    /**
     * Sets the tunnel value for this Netbridge.
     * 
     * @param tunnel
     */
    public void setTunnel(java.lang.String[] tunnel) {
        this.tunnel = tunnel;
    }


    /**
     * Gets the vlan value for this Netbridge.
     * 
     * @return vlan
     */
    public org.apache.axis.types.UnsignedInt[] getVlan() {
        return vlan;
    }


    /**
     * Sets the vlan value for this Netbridge.
     * 
     * @param vlan
     */
    public void setVlan(org.apache.axis.types.UnsignedInt[] vlan) {
        this.vlan = vlan;
    }


    /**
     * Gets the ipaddress value for this Netbridge.
     * 
     * @return ipaddress
     */
    public java.lang.String[] getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Netbridge.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String[] ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the netmask value for this Netbridge.
     * 
     * @return netmask
     */
    public java.lang.String[] getNetmask() {
        return netmask;
    }


    /**
     * Sets the netmask value for this Netbridge.
     * 
     * @param netmask
     */
    public void setNetmask(java.lang.String[] netmask) {
        this.netmask = netmask;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Netbridge)) return false;
        Netbridge other = (Netbridge) obj;
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
            ((this.tunnel==null && other.getTunnel()==null) || 
             (this.tunnel!=null &&
              java.util.Arrays.equals(this.tunnel, other.getTunnel()))) &&
            ((this.vlan==null && other.getVlan()==null) || 
             (this.vlan!=null &&
              java.util.Arrays.equals(this.vlan, other.getVlan()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              java.util.Arrays.equals(this.ipaddress, other.getIpaddress()))) &&
            ((this.netmask==null && other.getNetmask()==null) || 
             (this.netmask!=null &&
              java.util.Arrays.equals(this.netmask, other.getNetmask())));
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
        if (getTunnel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTunnel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTunnel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVlan() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVlan());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVlan(), i);
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
        if (getNetmask() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetmask());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetmask(), i);
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
        new org.apache.axis.description.TypeDesc(Netbridge.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "netbridge"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tunnel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tunnel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vlan"));
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
        elemField.setFieldName("netmask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netmask"));
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
