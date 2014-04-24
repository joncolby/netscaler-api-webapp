/**
 * Vpnicaconnection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Vpnicaconnection  implements java.io.Serializable {
    private java.lang.String username;

    private java.lang.String domain;

    private java.lang.String srcip;

    private org.apache.axis.types.UnsignedInt srcport;

    private java.lang.String destip;

    private org.apache.axis.types.UnsignedInt destport;

    private org.apache.axis.types.UnsignedInt peid;

    public Vpnicaconnection() {
    }

    public Vpnicaconnection(
           java.lang.String username,
           java.lang.String domain,
           java.lang.String srcip,
           org.apache.axis.types.UnsignedInt srcport,
           java.lang.String destip,
           org.apache.axis.types.UnsignedInt destport,
           org.apache.axis.types.UnsignedInt peid) {
           this.username = username;
           this.domain = domain;
           this.srcip = srcip;
           this.srcport = srcport;
           this.destip = destip;
           this.destport = destport;
           this.peid = peid;
    }


    /**
     * Gets the username value for this Vpnicaconnection.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this Vpnicaconnection.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the domain value for this Vpnicaconnection.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this Vpnicaconnection.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the srcip value for this Vpnicaconnection.
     * 
     * @return srcip
     */
    public java.lang.String getSrcip() {
        return srcip;
    }


    /**
     * Sets the srcip value for this Vpnicaconnection.
     * 
     * @param srcip
     */
    public void setSrcip(java.lang.String srcip) {
        this.srcip = srcip;
    }


    /**
     * Gets the srcport value for this Vpnicaconnection.
     * 
     * @return srcport
     */
    public org.apache.axis.types.UnsignedInt getSrcport() {
        return srcport;
    }


    /**
     * Sets the srcport value for this Vpnicaconnection.
     * 
     * @param srcport
     */
    public void setSrcport(org.apache.axis.types.UnsignedInt srcport) {
        this.srcport = srcport;
    }


    /**
     * Gets the destip value for this Vpnicaconnection.
     * 
     * @return destip
     */
    public java.lang.String getDestip() {
        return destip;
    }


    /**
     * Sets the destip value for this Vpnicaconnection.
     * 
     * @param destip
     */
    public void setDestip(java.lang.String destip) {
        this.destip = destip;
    }


    /**
     * Gets the destport value for this Vpnicaconnection.
     * 
     * @return destport
     */
    public org.apache.axis.types.UnsignedInt getDestport() {
        return destport;
    }


    /**
     * Sets the destport value for this Vpnicaconnection.
     * 
     * @param destport
     */
    public void setDestport(org.apache.axis.types.UnsignedInt destport) {
        this.destport = destport;
    }


    /**
     * Gets the peid value for this Vpnicaconnection.
     * 
     * @return peid
     */
    public org.apache.axis.types.UnsignedInt getPeid() {
        return peid;
    }


    /**
     * Sets the peid value for this Vpnicaconnection.
     * 
     * @param peid
     */
    public void setPeid(org.apache.axis.types.UnsignedInt peid) {
        this.peid = peid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Vpnicaconnection)) return false;
        Vpnicaconnection other = (Vpnicaconnection) obj;
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
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain()))) &&
            ((this.srcip==null && other.getSrcip()==null) || 
             (this.srcip!=null &&
              this.srcip.equals(other.getSrcip()))) &&
            ((this.srcport==null && other.getSrcport()==null) || 
             (this.srcport!=null &&
              this.srcport.equals(other.getSrcport()))) &&
            ((this.destip==null && other.getDestip()==null) || 
             (this.destip!=null &&
              this.destip.equals(other.getDestip()))) &&
            ((this.destport==null && other.getDestport()==null) || 
             (this.destport!=null &&
              this.destport.equals(other.getDestport()))) &&
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
        if (getDomain() != null) {
            _hashCode += getDomain().hashCode();
        }
        if (getSrcip() != null) {
            _hashCode += getSrcip().hashCode();
        }
        if (getSrcport() != null) {
            _hashCode += getSrcport().hashCode();
        }
        if (getDestip() != null) {
            _hashCode += getDestip().hashCode();
        }
        if (getDestport() != null) {
            _hashCode += getDestport().hashCode();
        }
        if (getPeid() != null) {
            _hashCode += getPeid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Vpnicaconnection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "vpnicaconnection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srcip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srcport"));
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
