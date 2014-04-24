/**
 * Authenticationsamlaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Authenticationsamlaction  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String samlidpcertname;

    private java.lang.String samlsigningcertname;

    private java.lang.String samlredirecturl;

    private java.lang.String samluserfield;

    private java.lang.String samlrejectunsignedassertion;

    private java.lang.String samlissuername;

    private java.lang.String samltwofactor;

    private java.lang.String defaultauthenticationgroup;

    public Authenticationsamlaction() {
    }

    public Authenticationsamlaction(
           java.lang.String name,
           java.lang.String samlidpcertname,
           java.lang.String samlsigningcertname,
           java.lang.String samlredirecturl,
           java.lang.String samluserfield,
           java.lang.String samlrejectunsignedassertion,
           java.lang.String samlissuername,
           java.lang.String samltwofactor,
           java.lang.String defaultauthenticationgroup) {
           this.name = name;
           this.samlidpcertname = samlidpcertname;
           this.samlsigningcertname = samlsigningcertname;
           this.samlredirecturl = samlredirecturl;
           this.samluserfield = samluserfield;
           this.samlrejectunsignedassertion = samlrejectunsignedassertion;
           this.samlissuername = samlissuername;
           this.samltwofactor = samltwofactor;
           this.defaultauthenticationgroup = defaultauthenticationgroup;
    }


    /**
     * Gets the name value for this Authenticationsamlaction.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Authenticationsamlaction.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the samlidpcertname value for this Authenticationsamlaction.
     * 
     * @return samlidpcertname
     */
    public java.lang.String getSamlidpcertname() {
        return samlidpcertname;
    }


    /**
     * Sets the samlidpcertname value for this Authenticationsamlaction.
     * 
     * @param samlidpcertname
     */
    public void setSamlidpcertname(java.lang.String samlidpcertname) {
        this.samlidpcertname = samlidpcertname;
    }


    /**
     * Gets the samlsigningcertname value for this Authenticationsamlaction.
     * 
     * @return samlsigningcertname
     */
    public java.lang.String getSamlsigningcertname() {
        return samlsigningcertname;
    }


    /**
     * Sets the samlsigningcertname value for this Authenticationsamlaction.
     * 
     * @param samlsigningcertname
     */
    public void setSamlsigningcertname(java.lang.String samlsigningcertname) {
        this.samlsigningcertname = samlsigningcertname;
    }


    /**
     * Gets the samlredirecturl value for this Authenticationsamlaction.
     * 
     * @return samlredirecturl
     */
    public java.lang.String getSamlredirecturl() {
        return samlredirecturl;
    }


    /**
     * Sets the samlredirecturl value for this Authenticationsamlaction.
     * 
     * @param samlredirecturl
     */
    public void setSamlredirecturl(java.lang.String samlredirecturl) {
        this.samlredirecturl = samlredirecturl;
    }


    /**
     * Gets the samluserfield value for this Authenticationsamlaction.
     * 
     * @return samluserfield
     */
    public java.lang.String getSamluserfield() {
        return samluserfield;
    }


    /**
     * Sets the samluserfield value for this Authenticationsamlaction.
     * 
     * @param samluserfield
     */
    public void setSamluserfield(java.lang.String samluserfield) {
        this.samluserfield = samluserfield;
    }


    /**
     * Gets the samlrejectunsignedassertion value for this Authenticationsamlaction.
     * 
     * @return samlrejectunsignedassertion
     */
    public java.lang.String getSamlrejectunsignedassertion() {
        return samlrejectunsignedassertion;
    }


    /**
     * Sets the samlrejectunsignedassertion value for this Authenticationsamlaction.
     * 
     * @param samlrejectunsignedassertion
     */
    public void setSamlrejectunsignedassertion(java.lang.String samlrejectunsignedassertion) {
        this.samlrejectunsignedassertion = samlrejectunsignedassertion;
    }


    /**
     * Gets the samlissuername value for this Authenticationsamlaction.
     * 
     * @return samlissuername
     */
    public java.lang.String getSamlissuername() {
        return samlissuername;
    }


    /**
     * Sets the samlissuername value for this Authenticationsamlaction.
     * 
     * @param samlissuername
     */
    public void setSamlissuername(java.lang.String samlissuername) {
        this.samlissuername = samlissuername;
    }


    /**
     * Gets the samltwofactor value for this Authenticationsamlaction.
     * 
     * @return samltwofactor
     */
    public java.lang.String getSamltwofactor() {
        return samltwofactor;
    }


    /**
     * Sets the samltwofactor value for this Authenticationsamlaction.
     * 
     * @param samltwofactor
     */
    public void setSamltwofactor(java.lang.String samltwofactor) {
        this.samltwofactor = samltwofactor;
    }


    /**
     * Gets the defaultauthenticationgroup value for this Authenticationsamlaction.
     * 
     * @return defaultauthenticationgroup
     */
    public java.lang.String getDefaultauthenticationgroup() {
        return defaultauthenticationgroup;
    }


    /**
     * Sets the defaultauthenticationgroup value for this Authenticationsamlaction.
     * 
     * @param defaultauthenticationgroup
     */
    public void setDefaultauthenticationgroup(java.lang.String defaultauthenticationgroup) {
        this.defaultauthenticationgroup = defaultauthenticationgroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Authenticationsamlaction)) return false;
        Authenticationsamlaction other = (Authenticationsamlaction) obj;
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
            ((this.samlidpcertname==null && other.getSamlidpcertname()==null) || 
             (this.samlidpcertname!=null &&
              this.samlidpcertname.equals(other.getSamlidpcertname()))) &&
            ((this.samlsigningcertname==null && other.getSamlsigningcertname()==null) || 
             (this.samlsigningcertname!=null &&
              this.samlsigningcertname.equals(other.getSamlsigningcertname()))) &&
            ((this.samlredirecturl==null && other.getSamlredirecturl()==null) || 
             (this.samlredirecturl!=null &&
              this.samlredirecturl.equals(other.getSamlredirecturl()))) &&
            ((this.samluserfield==null && other.getSamluserfield()==null) || 
             (this.samluserfield!=null &&
              this.samluserfield.equals(other.getSamluserfield()))) &&
            ((this.samlrejectunsignedassertion==null && other.getSamlrejectunsignedassertion()==null) || 
             (this.samlrejectunsignedassertion!=null &&
              this.samlrejectunsignedassertion.equals(other.getSamlrejectunsignedassertion()))) &&
            ((this.samlissuername==null && other.getSamlissuername()==null) || 
             (this.samlissuername!=null &&
              this.samlissuername.equals(other.getSamlissuername()))) &&
            ((this.samltwofactor==null && other.getSamltwofactor()==null) || 
             (this.samltwofactor!=null &&
              this.samltwofactor.equals(other.getSamltwofactor()))) &&
            ((this.defaultauthenticationgroup==null && other.getDefaultauthenticationgroup()==null) || 
             (this.defaultauthenticationgroup!=null &&
              this.defaultauthenticationgroup.equals(other.getDefaultauthenticationgroup())));
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
        if (getSamlidpcertname() != null) {
            _hashCode += getSamlidpcertname().hashCode();
        }
        if (getSamlsigningcertname() != null) {
            _hashCode += getSamlsigningcertname().hashCode();
        }
        if (getSamlredirecturl() != null) {
            _hashCode += getSamlredirecturl().hashCode();
        }
        if (getSamluserfield() != null) {
            _hashCode += getSamluserfield().hashCode();
        }
        if (getSamlrejectunsignedassertion() != null) {
            _hashCode += getSamlrejectunsignedassertion().hashCode();
        }
        if (getSamlissuername() != null) {
            _hashCode += getSamlissuername().hashCode();
        }
        if (getSamltwofactor() != null) {
            _hashCode += getSamltwofactor().hashCode();
        }
        if (getDefaultauthenticationgroup() != null) {
            _hashCode += getDefaultauthenticationgroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Authenticationsamlaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "authenticationsamlaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlidpcertname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "samlidpcertname"));
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
        elemField.setFieldName("samlredirecturl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "samlredirecturl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samluserfield");
        elemField.setXmlName(new javax.xml.namespace.QName("", "samluserfield"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlrejectunsignedassertion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "samlrejectunsignedassertion"));
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
        elemField.setFieldName("samltwofactor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "samltwofactor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultauthenticationgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultauthenticationgroup"));
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
