/**
 * Aaasession.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Aaasession  implements java.io.Serializable {
    private java.lang.String username;

    private java.lang.String groupname;

    private java.lang.String intranetip;

    private java.lang.String netmask;

    private java.lang.String publicip;

    private org.apache.axis.types.UnsignedInt publicport;

    private java.lang.String ipaddress;

    private org.apache.axis.types.UnsignedInt port;

    private java.lang.String privateip;

    private org.apache.axis.types.UnsignedInt privateport;

    private java.lang.String destip;

    private org.apache.axis.types.UnsignedInt destport;

    private java.lang.String intranetip2;

    private org.apache.axis.types.UnsignedInt peid;

    public Aaasession() {
    }

    public Aaasession(
           java.lang.String username,
           java.lang.String groupname,
           java.lang.String intranetip,
           java.lang.String netmask,
           java.lang.String publicip,
           org.apache.axis.types.UnsignedInt publicport,
           java.lang.String ipaddress,
           org.apache.axis.types.UnsignedInt port,
           java.lang.String privateip,
           org.apache.axis.types.UnsignedInt privateport,
           java.lang.String destip,
           org.apache.axis.types.UnsignedInt destport,
           java.lang.String intranetip2,
           org.apache.axis.types.UnsignedInt peid) {
           this.username = username;
           this.groupname = groupname;
           this.intranetip = intranetip;
           this.netmask = netmask;
           this.publicip = publicip;
           this.publicport = publicport;
           this.ipaddress = ipaddress;
           this.port = port;
           this.privateip = privateip;
           this.privateport = privateport;
           this.destip = destip;
           this.destport = destport;
           this.intranetip2 = intranetip2;
           this.peid = peid;
    }


    /**
     * Gets the username value for this Aaasession.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this Aaasession.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the groupname value for this Aaasession.
     * 
     * @return groupname
     */
    public java.lang.String getGroupname() {
        return groupname;
    }


    /**
     * Sets the groupname value for this Aaasession.
     * 
     * @param groupname
     */
    public void setGroupname(java.lang.String groupname) {
        this.groupname = groupname;
    }


    /**
     * Gets the intranetip value for this Aaasession.
     * 
     * @return intranetip
     */
    public java.lang.String getIntranetip() {
        return intranetip;
    }


    /**
     * Sets the intranetip value for this Aaasession.
     * 
     * @param intranetip
     */
    public void setIntranetip(java.lang.String intranetip) {
        this.intranetip = intranetip;
    }


    /**
     * Gets the netmask value for this Aaasession.
     * 
     * @return netmask
     */
    public java.lang.String getNetmask() {
        return netmask;
    }


    /**
     * Sets the netmask value for this Aaasession.
     * 
     * @param netmask
     */
    public void setNetmask(java.lang.String netmask) {
        this.netmask = netmask;
    }


    /**
     * Gets the publicip value for this Aaasession.
     * 
     * @return publicip
     */
    public java.lang.String getPublicip() {
        return publicip;
    }


    /**
     * Sets the publicip value for this Aaasession.
     * 
     * @param publicip
     */
    public void setPublicip(java.lang.String publicip) {
        this.publicip = publicip;
    }


    /**
     * Gets the publicport value for this Aaasession.
     * 
     * @return publicport
     */
    public org.apache.axis.types.UnsignedInt getPublicport() {
        return publicport;
    }


    /**
     * Sets the publicport value for this Aaasession.
     * 
     * @param publicport
     */
    public void setPublicport(org.apache.axis.types.UnsignedInt publicport) {
        this.publicport = publicport;
    }


    /**
     * Gets the ipaddress value for this Aaasession.
     * 
     * @return ipaddress
     */
    public java.lang.String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Aaasession.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the port value for this Aaasession.
     * 
     * @return port
     */
    public org.apache.axis.types.UnsignedInt getPort() {
        return port;
    }


    /**
     * Sets the port value for this Aaasession.
     * 
     * @param port
     */
    public void setPort(org.apache.axis.types.UnsignedInt port) {
        this.port = port;
    }


    /**
     * Gets the privateip value for this Aaasession.
     * 
     * @return privateip
     */
    public java.lang.String getPrivateip() {
        return privateip;
    }


    /**
     * Sets the privateip value for this Aaasession.
     * 
     * @param privateip
     */
    public void setPrivateip(java.lang.String privateip) {
        this.privateip = privateip;
    }


    /**
     * Gets the privateport value for this Aaasession.
     * 
     * @return privateport
     */
    public org.apache.axis.types.UnsignedInt getPrivateport() {
        return privateport;
    }


    /**
     * Sets the privateport value for this Aaasession.
     * 
     * @param privateport
     */
    public void setPrivateport(org.apache.axis.types.UnsignedInt privateport) {
        this.privateport = privateport;
    }


    /**
     * Gets the destip value for this Aaasession.
     * 
     * @return destip
     */
    public java.lang.String getDestip() {
        return destip;
    }


    /**
     * Sets the destip value for this Aaasession.
     * 
     * @param destip
     */
    public void setDestip(java.lang.String destip) {
        this.destip = destip;
    }


    /**
     * Gets the destport value for this Aaasession.
     * 
     * @return destport
     */
    public org.apache.axis.types.UnsignedInt getDestport() {
        return destport;
    }


    /**
     * Sets the destport value for this Aaasession.
     * 
     * @param destport
     */
    public void setDestport(org.apache.axis.types.UnsignedInt destport) {
        this.destport = destport;
    }


    /**
     * Gets the intranetip2 value for this Aaasession.
     * 
     * @return intranetip2
     */
    public java.lang.String getIntranetip2() {
        return intranetip2;
    }


    /**
     * Sets the intranetip2 value for this Aaasession.
     * 
     * @param intranetip2
     */
    public void setIntranetip2(java.lang.String intranetip2) {
        this.intranetip2 = intranetip2;
    }


    /**
     * Gets the peid value for this Aaasession.
     * 
     * @return peid
     */
    public org.apache.axis.types.UnsignedInt getPeid() {
        return peid;
    }


    /**
     * Sets the peid value for this Aaasession.
     * 
     * @param peid
     */
    public void setPeid(org.apache.axis.types.UnsignedInt peid) {
        this.peid = peid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Aaasession)) return false;
        Aaasession other = (Aaasession) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.groupname==null && other.getGroupname()==null) || 
             (this.groupname!=null &&
              this.groupname.equals(other.getGroupname()))) &&
            ((this.intranetip==null && other.getIntranetip()==null) || 
             (this.intranetip!=null &&
              this.intranetip.equals(other.getIntranetip()))) &&
            ((this.netmask==null && other.getNetmask()==null) || 
             (this.netmask!=null &&
              this.netmask.equals(other.getNetmask()))) &&
            ((this.publicip==null && other.getPublicip()==null) || 
             (this.publicip!=null &&
              this.publicip.equals(other.getPublicip()))) &&
            ((this.publicport==null && other.getPublicport()==null) || 
             (this.publicport!=null &&
              this.publicport.equals(other.getPublicport()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              this.ipaddress.equals(other.getIpaddress()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.privateip==null && other.getPrivateip()==null) || 
             (this.privateip!=null &&
              this.privateip.equals(other.getPrivateip()))) &&
            ((this.privateport==null && other.getPrivateport()==null) || 
             (this.privateport!=null &&
              this.privateport.equals(other.getPrivateport()))) &&
            ((this.destip==null && other.getDestip()==null) || 
             (this.destip!=null &&
              this.destip.equals(other.getDestip()))) &&
            ((this.destport==null && other.getDestport()==null) || 
             (this.destport!=null &&
              this.destport.equals(other.getDestport()))) &&
            ((this.intranetip2==null && other.getIntranetip2()==null) || 
             (this.intranetip2!=null &&
              this.intranetip2.equals(other.getIntranetip2()))) &&
            ((this.peid==null && other.getPeid()==null) || 
             (this.peid!=null &&
              this.peid.equals(other.getPeid())));
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
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getGroupname() != null) {
            _hashCode += getGroupname().hashCode();
        }
        if (getIntranetip() != null) {
            _hashCode += getIntranetip().hashCode();
        }
        if (getNetmask() != null) {
            _hashCode += getNetmask().hashCode();
        }
        if (getPublicip() != null) {
            _hashCode += getPublicip().hashCode();
        }
        if (getPublicport() != null) {
            _hashCode += getPublicport().hashCode();
        }
        if (getIpaddress() != null) {
            _hashCode += getIpaddress().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getPrivateip() != null) {
            _hashCode += getPrivateip().hashCode();
        }
        if (getPrivateport() != null) {
            _hashCode += getPrivateport().hashCode();
        }
        if (getDestip() != null) {
            _hashCode += getDestip().hashCode();
        }
        if (getDestport() != null) {
            _hashCode += getDestport().hashCode();
        }
        if (getIntranetip2() != null) {
            _hashCode += getIntranetip2().hashCode();
        }
        if (getPeid() != null) {
            _hashCode += getPeid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Aaasession.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "aaasession"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intranetip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intranetip"));
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
        elemField.setFieldName("publicip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publicport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publicport"));
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
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "privateip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("privateport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "privateport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intranetip2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intranetip2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "peid"));
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
