/**
 * Ip6Tunnel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Ip6Tunnel  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String remote;

    private java.lang.String remoteip;

    private java.lang.String local;

    private org.apache.axis.types.UnsignedInt type;

    private java.lang.String encapip;

    public Ip6Tunnel() {
    }

    public Ip6Tunnel(
           java.lang.String name,
           java.lang.String remote,
           java.lang.String remoteip,
           java.lang.String local,
           org.apache.axis.types.UnsignedInt type,
           java.lang.String encapip) {
           this.name = name;
           this.remote = remote;
           this.remoteip = remoteip;
           this.local = local;
           this.type = type;
           this.encapip = encapip;
    }


    /**
     * Gets the name value for this Ip6Tunnel.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Ip6Tunnel.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the remote value for this Ip6Tunnel.
     * 
     * @return remote
     */
    public java.lang.String getRemote() {
        return remote;
    }


    /**
     * Sets the remote value for this Ip6Tunnel.
     * 
     * @param remote
     */
    public void setRemote(java.lang.String remote) {
        this.remote = remote;
    }


    /**
     * Gets the remoteip value for this Ip6Tunnel.
     * 
     * @return remoteip
     */
    public java.lang.String getRemoteip() {
        return remoteip;
    }


    /**
     * Sets the remoteip value for this Ip6Tunnel.
     * 
     * @param remoteip
     */
    public void setRemoteip(java.lang.String remoteip) {
        this.remoteip = remoteip;
    }


    /**
     * Gets the local value for this Ip6Tunnel.
     * 
     * @return local
     */
    public java.lang.String getLocal() {
        return local;
    }


    /**
     * Sets the local value for this Ip6Tunnel.
     * 
     * @param local
     */
    public void setLocal(java.lang.String local) {
        this.local = local;
    }


    /**
     * Gets the type value for this Ip6Tunnel.
     * 
     * @return type
     */
    public org.apache.axis.types.UnsignedInt getType() {
        return type;
    }


    /**
     * Sets the type value for this Ip6Tunnel.
     * 
     * @param type
     */
    public void setType(org.apache.axis.types.UnsignedInt type) {
        this.type = type;
    }


    /**
     * Gets the encapip value for this Ip6Tunnel.
     * 
     * @return encapip
     */
    public java.lang.String getEncapip() {
        return encapip;
    }


    /**
     * Sets the encapip value for this Ip6Tunnel.
     * 
     * @param encapip
     */
    public void setEncapip(java.lang.String encapip) {
        this.encapip = encapip;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ip6Tunnel)) return false;
        Ip6Tunnel other = (Ip6Tunnel) obj;
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
            ((this.remote==null && other.getRemote()==null) || 
             (this.remote!=null &&
              this.remote.equals(other.getRemote()))) &&
            ((this.remoteip==null && other.getRemoteip()==null) || 
             (this.remoteip!=null &&
              this.remoteip.equals(other.getRemoteip()))) &&
            ((this.local==null && other.getLocal()==null) || 
             (this.local!=null &&
              this.local.equals(other.getLocal()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.encapip==null && other.getEncapip()==null) || 
             (this.encapip!=null &&
              this.encapip.equals(other.getEncapip())));
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
        if (getRemote() != null) {
            _hashCode += getRemote().hashCode();
        }
        if (getRemoteip() != null) {
            _hashCode += getRemoteip().hashCode();
        }
        if (getLocal() != null) {
            _hashCode += getLocal().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getEncapip() != null) {
            _hashCode += getEncapip().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ip6Tunnel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "ip6tunnel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remote");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remoteip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remoteip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("local");
        elemField.setXmlName(new javax.xml.namespace.QName("", "local"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encapip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "encapip"));
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
