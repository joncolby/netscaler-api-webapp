/**
 * Iptunnel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Iptunnel  implements java.io.Serializable {
    private java.lang.String remote;

    private java.lang.String remotesubnetmask;

    private java.lang.String name;

    private java.lang.String name2;

    private java.lang.String local;

    private java.lang.String protocol;

    private org.apache.axis.types.UnsignedInt type;

    private java.lang.String encapip;

    private org.apache.axis.types.UnsignedInt channel;

    private java.lang.String ipsecprofilename;

    private java.lang.String tunneltype;

    private java.lang.String ipsectunnelstatus;

    private java.lang.String name3;

    public Iptunnel() {
    }

    public Iptunnel(
           java.lang.String remote,
           java.lang.String remotesubnetmask,
           java.lang.String name,
           java.lang.String name2,
           java.lang.String local,
           java.lang.String protocol,
           org.apache.axis.types.UnsignedInt type,
           java.lang.String encapip,
           org.apache.axis.types.UnsignedInt channel,
           java.lang.String ipsecprofilename,
           java.lang.String tunneltype,
           java.lang.String ipsectunnelstatus,
           java.lang.String name3) {
           this.remote = remote;
           this.remotesubnetmask = remotesubnetmask;
           this.name = name;
           this.name2 = name2;
           this.local = local;
           this.protocol = protocol;
           this.type = type;
           this.encapip = encapip;
           this.channel = channel;
           this.ipsecprofilename = ipsecprofilename;
           this.tunneltype = tunneltype;
           this.ipsectunnelstatus = ipsectunnelstatus;
           this.name3 = name3;
    }


    /**
     * Gets the remote value for this Iptunnel.
     * 
     * @return remote
     */
    public java.lang.String getRemote() {
        return remote;
    }


    /**
     * Sets the remote value for this Iptunnel.
     * 
     * @param remote
     */
    public void setRemote(java.lang.String remote) {
        this.remote = remote;
    }


    /**
     * Gets the remotesubnetmask value for this Iptunnel.
     * 
     * @return remotesubnetmask
     */
    public java.lang.String getRemotesubnetmask() {
        return remotesubnetmask;
    }


    /**
     * Sets the remotesubnetmask value for this Iptunnel.
     * 
     * @param remotesubnetmask
     */
    public void setRemotesubnetmask(java.lang.String remotesubnetmask) {
        this.remotesubnetmask = remotesubnetmask;
    }


    /**
     * Gets the name value for this Iptunnel.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Iptunnel.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the name2 value for this Iptunnel.
     * 
     * @return name2
     */
    public java.lang.String getName2() {
        return name2;
    }


    /**
     * Sets the name2 value for this Iptunnel.
     * 
     * @param name2
     */
    public void setName2(java.lang.String name2) {
        this.name2 = name2;
    }


    /**
     * Gets the local value for this Iptunnel.
     * 
     * @return local
     */
    public java.lang.String getLocal() {
        return local;
    }


    /**
     * Sets the local value for this Iptunnel.
     * 
     * @param local
     */
    public void setLocal(java.lang.String local) {
        this.local = local;
    }


    /**
     * Gets the protocol value for this Iptunnel.
     * 
     * @return protocol
     */
    public java.lang.String getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this Iptunnel.
     * 
     * @param protocol
     */
    public void setProtocol(java.lang.String protocol) {
        this.protocol = protocol;
    }


    /**
     * Gets the type value for this Iptunnel.
     * 
     * @return type
     */
    public org.apache.axis.types.UnsignedInt getType() {
        return type;
    }


    /**
     * Sets the type value for this Iptunnel.
     * 
     * @param type
     */
    public void setType(org.apache.axis.types.UnsignedInt type) {
        this.type = type;
    }


    /**
     * Gets the encapip value for this Iptunnel.
     * 
     * @return encapip
     */
    public java.lang.String getEncapip() {
        return encapip;
    }


    /**
     * Sets the encapip value for this Iptunnel.
     * 
     * @param encapip
     */
    public void setEncapip(java.lang.String encapip) {
        this.encapip = encapip;
    }


    /**
     * Gets the channel value for this Iptunnel.
     * 
     * @return channel
     */
    public org.apache.axis.types.UnsignedInt getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this Iptunnel.
     * 
     * @param channel
     */
    public void setChannel(org.apache.axis.types.UnsignedInt channel) {
        this.channel = channel;
    }


    /**
     * Gets the ipsecprofilename value for this Iptunnel.
     * 
     * @return ipsecprofilename
     */
    public java.lang.String getIpsecprofilename() {
        return ipsecprofilename;
    }


    /**
     * Sets the ipsecprofilename value for this Iptunnel.
     * 
     * @param ipsecprofilename
     */
    public void setIpsecprofilename(java.lang.String ipsecprofilename) {
        this.ipsecprofilename = ipsecprofilename;
    }


    /**
     * Gets the tunneltype value for this Iptunnel.
     * 
     * @return tunneltype
     */
    public java.lang.String getTunneltype() {
        return tunneltype;
    }


    /**
     * Sets the tunneltype value for this Iptunnel.
     * 
     * @param tunneltype
     */
    public void setTunneltype(java.lang.String tunneltype) {
        this.tunneltype = tunneltype;
    }


    /**
     * Gets the ipsectunnelstatus value for this Iptunnel.
     * 
     * @return ipsectunnelstatus
     */
    public java.lang.String getIpsectunnelstatus() {
        return ipsectunnelstatus;
    }


    /**
     * Sets the ipsectunnelstatus value for this Iptunnel.
     * 
     * @param ipsectunnelstatus
     */
    public void setIpsectunnelstatus(java.lang.String ipsectunnelstatus) {
        this.ipsectunnelstatus = ipsectunnelstatus;
    }


    /**
     * Gets the name3 value for this Iptunnel.
     * 
     * @return name3
     */
    public java.lang.String getName3() {
        return name3;
    }


    /**
     * Sets the name3 value for this Iptunnel.
     * 
     * @param name3
     */
    public void setName3(java.lang.String name3) {
        this.name3 = name3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Iptunnel)) return false;
        Iptunnel other = (Iptunnel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.remote==null && other.getRemote()==null) || 
             (this.remote!=null &&
              this.remote.equals(other.getRemote()))) &&
            ((this.remotesubnetmask==null && other.getRemotesubnetmask()==null) || 
             (this.remotesubnetmask!=null &&
              this.remotesubnetmask.equals(other.getRemotesubnetmask()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.name2==null && other.getName2()==null) || 
             (this.name2!=null &&
              this.name2.equals(other.getName2()))) &&
            ((this.local==null && other.getLocal()==null) || 
             (this.local!=null &&
              this.local.equals(other.getLocal()))) &&
            ((this.protocol==null && other.getProtocol()==null) || 
             (this.protocol!=null &&
              this.protocol.equals(other.getProtocol()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.encapip==null && other.getEncapip()==null) || 
             (this.encapip!=null &&
              this.encapip.equals(other.getEncapip()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              this.channel.equals(other.getChannel()))) &&
            ((this.ipsecprofilename==null && other.getIpsecprofilename()==null) || 
             (this.ipsecprofilename!=null &&
              this.ipsecprofilename.equals(other.getIpsecprofilename()))) &&
            ((this.tunneltype==null && other.getTunneltype()==null) || 
             (this.tunneltype!=null &&
              this.tunneltype.equals(other.getTunneltype()))) &&
            ((this.ipsectunnelstatus==null && other.getIpsectunnelstatus()==null) || 
             (this.ipsectunnelstatus!=null &&
              this.ipsectunnelstatus.equals(other.getIpsectunnelstatus()))) &&
            ((this.name3==null && other.getName3()==null) || 
             (this.name3!=null &&
              this.name3.equals(other.getName3())));
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
        if (getRemote() != null) {
            _hashCode += getRemote().hashCode();
        }
        if (getRemotesubnetmask() != null) {
            _hashCode += getRemotesubnetmask().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getName2() != null) {
            _hashCode += getName2().hashCode();
        }
        if (getLocal() != null) {
            _hashCode += getLocal().hashCode();
        }
        if (getProtocol() != null) {
            _hashCode += getProtocol().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getEncapip() != null) {
            _hashCode += getEncapip().hashCode();
        }
        if (getChannel() != null) {
            _hashCode += getChannel().hashCode();
        }
        if (getIpsecprofilename() != null) {
            _hashCode += getIpsecprofilename().hashCode();
        }
        if (getTunneltype() != null) {
            _hashCode += getTunneltype().hashCode();
        }
        if (getIpsectunnelstatus() != null) {
            _hashCode += getIpsectunnelstatus().hashCode();
        }
        if (getName3() != null) {
            _hashCode += getName3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Iptunnel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "iptunnel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remote");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remote"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remotesubnetmask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remotesubnetmask"));
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
        elemField.setFieldName("name2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name2"));
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
        elemField.setFieldName("protocol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocol"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipsecprofilename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipsecprofilename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tunneltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tunneltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipsectunnelstatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipsectunnelstatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name3"));
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
