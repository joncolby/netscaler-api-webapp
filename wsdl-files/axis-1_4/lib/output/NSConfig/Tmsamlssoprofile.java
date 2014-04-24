/**
 * Tmsamlssoprofile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Tmsamlssoprofile  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String samlsigningcertname;

    private java.lang.String assertionconsumerserviceurl;

    private java.lang.String sendpassword;

    private java.lang.String samlissuername;

    private java.lang.String relaystaterule;

    public Tmsamlssoprofile() {
    }

    public Tmsamlssoprofile(
           java.lang.String name,
           java.lang.String samlsigningcertname,
           java.lang.String assertionconsumerserviceurl,
           java.lang.String sendpassword,
           java.lang.String samlissuername,
           java.lang.String relaystaterule) {
           this.name = name;
           this.samlsigningcertname = samlsigningcertname;
           this.assertionconsumerserviceurl = assertionconsumerserviceurl;
           this.sendpassword = sendpassword;
           this.samlissuername = samlissuername;
           this.relaystaterule = relaystaterule;
    }


    /**
     * Gets the name value for this Tmsamlssoprofile.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Tmsamlssoprofile.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the samlsigningcertname value for this Tmsamlssoprofile.
     * 
     * @return samlsigningcertname
     */
    public java.lang.String getSamlsigningcertname() {
        return samlsigningcertname;
    }


    /**
     * Sets the samlsigningcertname value for this Tmsamlssoprofile.
     * 
     * @param samlsigningcertname
     */
    public void setSamlsigningcertname(java.lang.String samlsigningcertname) {
        this.samlsigningcertname = samlsigningcertname;
    }


    /**
     * Gets the assertionconsumerserviceurl value for this Tmsamlssoprofile.
     * 
     * @return assertionconsumerserviceurl
     */
    public java.lang.String getAssertionconsumerserviceurl() {
        return assertionconsumerserviceurl;
    }


    /**
     * Sets the assertionconsumerserviceurl value for this Tmsamlssoprofile.
     * 
     * @param assertionconsumerserviceurl
     */
    public void setAssertionconsumerserviceurl(java.lang.String assertionconsumerserviceurl) {
        this.assertionconsumerserviceurl = assertionconsumerserviceurl;
    }


    /**
     * Gets the sendpassword value for this Tmsamlssoprofile.
     * 
     * @return sendpassword
     */
    public java.lang.String getSendpassword() {
        return sendpassword;
    }


    /**
     * Sets the sendpassword value for this Tmsamlssoprofile.
     * 
     * @param sendpassword
     */
    public void setSendpassword(java.lang.String sendpassword) {
        this.sendpassword = sendpassword;
    }


    /**
     * Gets the samlissuername value for this Tmsamlssoprofile.
     * 
     * @return samlissuername
     */
    public java.lang.String getSamlissuername() {
        return samlissuername;
    }


    /**
     * Sets the samlissuername value for this Tmsamlssoprofile.
     * 
     * @param samlissuername
     */
    public void setSamlissuername(java.lang.String samlissuername) {
        this.samlissuername = samlissuername;
    }


    /**
     * Gets the relaystaterule value for this Tmsamlssoprofile.
     * 
     * @return relaystaterule
     */
    public java.lang.String getRelaystaterule() {
        return relaystaterule;
    }


    /**
     * Sets the relaystaterule value for this Tmsamlssoprofile.
     * 
     * @param relaystaterule
     */
    public void setRelaystaterule(java.lang.String relaystaterule) {
        this.relaystaterule = relaystaterule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tmsamlssoprofile)) return false;
        Tmsamlssoprofile other = (Tmsamlssoprofile) obj;
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
            ((this.samlsigningcertname==null && other.getSamlsigningcertname()==null) || 
             (this.samlsigningcertname!=null &&
              this.samlsigningcertname.equals(other.getSamlsigningcertname()))) &&
            ((this.assertionconsumerserviceurl==null && other.getAssertionconsumerserviceurl()==null) || 
             (this.assertionconsumerserviceurl!=null &&
              this.assertionconsumerserviceurl.equals(other.getAssertionconsumerserviceurl()))) &&
            ((this.sendpassword==null && other.getSendpassword()==null) || 
             (this.sendpassword!=null &&
              this.sendpassword.equals(other.getSendpassword()))) &&
            ((this.samlissuername==null && other.getSamlissuername()==null) || 
             (this.samlissuername!=null &&
              this.samlissuername.equals(other.getSamlissuername()))) &&
            ((this.relaystaterule==null && other.getRelaystaterule()==null) || 
             (this.relaystaterule!=null &&
              this.relaystaterule.equals(other.getRelaystaterule())));
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
        if (getSamlsigningcertname() != null) {
            _hashCode += getSamlsigningcertname().hashCode();
        }
        if (getAssertionconsumerserviceurl() != null) {
            _hashCode += getAssertionconsumerserviceurl().hashCode();
        }
        if (getSendpassword() != null) {
            _hashCode += getSendpassword().hashCode();
        }
        if (getSamlissuername() != null) {
            _hashCode += getSamlissuername().hashCode();
        }
        if (getRelaystaterule() != null) {
            _hashCode += getRelaystaterule().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Tmsamlssoprofile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "tmsamlssoprofile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlsigningcertname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "samlsigningcertname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assertionconsumerserviceurl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assertionconsumerserviceurl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendpassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendpassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlissuername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "samlissuername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relaystaterule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relaystaterule"));
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
