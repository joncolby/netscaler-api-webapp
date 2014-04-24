/**
 * Lbroute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Lbroute  implements java.io.Serializable {
    private java.lang.String network;

    private java.lang.String netmask;

    private java.lang.String gatewayname;

    private java.lang.String flags;

    public Lbroute() {
    }

    public Lbroute(
           java.lang.String network,
           java.lang.String netmask,
           java.lang.String gatewayname,
           java.lang.String flags) {
           this.network = network;
           this.netmask = netmask;
           this.gatewayname = gatewayname;
           this.flags = flags;
    }


    /**
     * Gets the network value for this Lbroute.
     * 
     * @return network
     */
    public java.lang.String getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this Lbroute.
     * 
     * @param network
     */
    public void setNetwork(java.lang.String network) {
        this.network = network;
    }


    /**
     * Gets the netmask value for this Lbroute.
     * 
     * @return netmask
     */
    public java.lang.String getNetmask() {
        return netmask;
    }


    /**
     * Sets the netmask value for this Lbroute.
     * 
     * @param netmask
     */
    public void setNetmask(java.lang.String netmask) {
        this.netmask = netmask;
    }


    /**
     * Gets the gatewayname value for this Lbroute.
     * 
     * @return gatewayname
     */
    public java.lang.String getGatewayname() {
        return gatewayname;
    }


    /**
     * Sets the gatewayname value for this Lbroute.
     * 
     * @param gatewayname
     */
    public void setGatewayname(java.lang.String gatewayname) {
        this.gatewayname = gatewayname;
    }


    /**
     * Gets the flags value for this Lbroute.
     * 
     * @return flags
     */
    public java.lang.String getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this Lbroute.
     * 
     * @param flags
     */
    public void setFlags(java.lang.String flags) {
        this.flags = flags;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Lbroute)) return false;
        Lbroute other = (Lbroute) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              this.network.equals(other.getNetwork()))) &&
            ((this.netmask==null && other.getNetmask()==null) || 
             (this.netmask!=null &&
              this.netmask.equals(other.getNetmask()))) &&
            ((this.gatewayname==null && other.getGatewayname()==null) || 
             (this.gatewayname!=null &&
              this.gatewayname.equals(other.getGatewayname()))) &&
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
        if (getNetwork() != null) {
            _hashCode += getNetwork().hashCode();
        }
        if (getNetmask() != null) {
            _hashCode += getNetmask().hashCode();
        }
        if (getGatewayname() != null) {
            _hashCode += getGatewayname().hashCode();
        }
        if (getFlags() != null) {
            _hashCode += getFlags().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Lbroute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "lbroute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("", "network"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netmask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netmask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gatewayname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flags"));
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
