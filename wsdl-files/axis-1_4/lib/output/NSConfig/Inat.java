/**
 * Inat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Inat  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String publicip;

    private java.lang.String privateip;

    private java.lang.String proxyip;

    private java.lang.String tcpproxy;

    private java.lang.String ftp;

    private java.lang.String tftp;

    private java.lang.String usip;

    private java.lang.String usnip;

    private org.apache.axis.types.UnsignedInt flags;

    private java.lang.String mode;

    public Inat() {
    }

    public Inat(
           java.lang.String name,
           java.lang.String publicip,
           java.lang.String privateip,
           java.lang.String proxyip,
           java.lang.String tcpproxy,
           java.lang.String ftp,
           java.lang.String tftp,
           java.lang.String usip,
           java.lang.String usnip,
           org.apache.axis.types.UnsignedInt flags,
           java.lang.String mode) {
           this.name = name;
           this.publicip = publicip;
           this.privateip = privateip;
           this.proxyip = proxyip;
           this.tcpproxy = tcpproxy;
           this.ftp = ftp;
           this.tftp = tftp;
           this.usip = usip;
           this.usnip = usnip;
           this.flags = flags;
           this.mode = mode;
    }


    /**
     * Gets the name value for this Inat.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Inat.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the publicip value for this Inat.
     * 
     * @return publicip
     */
    public java.lang.String getPublicip() {
        return publicip;
    }


    /**
     * Sets the publicip value for this Inat.
     * 
     * @param publicip
     */
    public void setPublicip(java.lang.String publicip) {
        this.publicip = publicip;
    }


    /**
     * Gets the privateip value for this Inat.
     * 
     * @return privateip
     */
    public java.lang.String getPrivateip() {
        return privateip;
    }


    /**
     * Sets the privateip value for this Inat.
     * 
     * @param privateip
     */
    public void setPrivateip(java.lang.String privateip) {
        this.privateip = privateip;
    }


    /**
     * Gets the proxyip value for this Inat.
     * 
     * @return proxyip
     */
    public java.lang.String getProxyip() {
        return proxyip;
    }


    /**
     * Sets the proxyip value for this Inat.
     * 
     * @param proxyip
     */
    public void setProxyip(java.lang.String proxyip) {
        this.proxyip = proxyip;
    }


    /**
     * Gets the tcpproxy value for this Inat.
     * 
     * @return tcpproxy
     */
    public java.lang.String getTcpproxy() {
        return tcpproxy;
    }


    /**
     * Sets the tcpproxy value for this Inat.
     * 
     * @param tcpproxy
     */
    public void setTcpproxy(java.lang.String tcpproxy) {
        this.tcpproxy = tcpproxy;
    }


    /**
     * Gets the ftp value for this Inat.
     * 
     * @return ftp
     */
    public java.lang.String getFtp() {
        return ftp;
    }


    /**
     * Sets the ftp value for this Inat.
     * 
     * @param ftp
     */
    public void setFtp(java.lang.String ftp) {
        this.ftp = ftp;
    }


    /**
     * Gets the tftp value for this Inat.
     * 
     * @return tftp
     */
    public java.lang.String getTftp() {
        return tftp;
    }


    /**
     * Sets the tftp value for this Inat.
     * 
     * @param tftp
     */
    public void setTftp(java.lang.String tftp) {
        this.tftp = tftp;
    }


    /**
     * Gets the usip value for this Inat.
     * 
     * @return usip
     */
    public java.lang.String getUsip() {
        return usip;
    }


    /**
     * Sets the usip value for this Inat.
     * 
     * @param usip
     */
    public void setUsip(java.lang.String usip) {
        this.usip = usip;
    }


    /**
     * Gets the usnip value for this Inat.
     * 
     * @return usnip
     */
    public java.lang.String getUsnip() {
        return usnip;
    }


    /**
     * Sets the usnip value for this Inat.
     * 
     * @param usnip
     */
    public void setUsnip(java.lang.String usnip) {
        this.usnip = usnip;
    }


    /**
     * Gets the flags value for this Inat.
     * 
     * @return flags
     */
    public org.apache.axis.types.UnsignedInt getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this Inat.
     * 
     * @param flags
     */
    public void setFlags(org.apache.axis.types.UnsignedInt flags) {
        this.flags = flags;
    }


    /**
     * Gets the mode value for this Inat.
     * 
     * @return mode
     */
    public java.lang.String getMode() {
        return mode;
    }


    /**
     * Sets the mode value for this Inat.
     * 
     * @param mode
     */
    public void setMode(java.lang.String mode) {
        this.mode = mode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Inat)) return false;
        Inat other = (Inat) obj;
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
            ((this.publicip==null && other.getPublicip()==null) || 
             (this.publicip!=null &&
              this.publicip.equals(other.getPublicip()))) &&
            ((this.privateip==null && other.getPrivateip()==null) || 
             (this.privateip!=null &&
              this.privateip.equals(other.getPrivateip()))) &&
            ((this.proxyip==null && other.getProxyip()==null) || 
             (this.proxyip!=null &&
              this.proxyip.equals(other.getProxyip()))) &&
            ((this.tcpproxy==null && other.getTcpproxy()==null) || 
             (this.tcpproxy!=null &&
              this.tcpproxy.equals(other.getTcpproxy()))) &&
            ((this.ftp==null && other.getFtp()==null) || 
             (this.ftp!=null &&
              this.ftp.equals(other.getFtp()))) &&
            ((this.tftp==null && other.getTftp()==null) || 
             (this.tftp!=null &&
              this.tftp.equals(other.getTftp()))) &&
            ((this.usip==null && other.getUsip()==null) || 
             (this.usip!=null &&
              this.usip.equals(other.getUsip()))) &&
            ((this.usnip==null && other.getUsnip()==null) || 
             (this.usnip!=null &&
              this.usnip.equals(other.getUsnip()))) &&
            ((this.flags==null && other.getFlags()==null) || 
             (this.flags!=null &&
              this.flags.equals(other.getFlags()))) &&
            ((this.mode==null && other.getMode()==null) || 
             (this.mode!=null &&
              this.mode.equals(other.getMode())));
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
        if (getPublicip() != null) {
            _hashCode += getPublicip().hashCode();
        }
        if (getPrivateip() != null) {
            _hashCode += getPrivateip().hashCode();
        }
        if (getProxyip() != null) {
            _hashCode += getProxyip().hashCode();
        }
        if (getTcpproxy() != null) {
            _hashCode += getTcpproxy().hashCode();
        }
        if (getFtp() != null) {
            _hashCode += getFtp().hashCode();
        }
        if (getTftp() != null) {
            _hashCode += getTftp().hashCode();
        }
        if (getUsip() != null) {
            _hashCode += getUsip().hashCode();
        }
        if (getUsnip() != null) {
            _hashCode += getUsnip().hashCode();
        }
        if (getFlags() != null) {
            _hashCode += getFlags().hashCode();
        }
        if (getMode() != null) {
            _hashCode += getMode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Inat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "inat"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
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
        elemField.setFieldName("privateip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "privateip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxyip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proxyip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcpproxy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tcpproxy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ftp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ftp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tftp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tftp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usnip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usnip"));
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
        elemField.setFieldName("mode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mode"));
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
