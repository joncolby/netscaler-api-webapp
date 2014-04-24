/**
 * Authenticationnegotiateaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Authenticationnegotiateaction  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String domain;

    private java.lang.String domainuser;

    private java.lang.String domainuserpasswd;

    private java.lang.String ou;

    private java.lang.String defaultauthenticationgroup;

    private java.lang.String keytab;

    private java.lang.String kcdspn;

    public Authenticationnegotiateaction() {
    }

    public Authenticationnegotiateaction(
           java.lang.String name,
           java.lang.String domain,
           java.lang.String domainuser,
           java.lang.String domainuserpasswd,
           java.lang.String ou,
           java.lang.String defaultauthenticationgroup,
           java.lang.String keytab,
           java.lang.String kcdspn) {
           this.name = name;
           this.domain = domain;
           this.domainuser = domainuser;
           this.domainuserpasswd = domainuserpasswd;
           this.ou = ou;
           this.defaultauthenticationgroup = defaultauthenticationgroup;
           this.keytab = keytab;
           this.kcdspn = kcdspn;
    }


    /**
     * Gets the name value for this Authenticationnegotiateaction.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Authenticationnegotiateaction.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the domain value for this Authenticationnegotiateaction.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this Authenticationnegotiateaction.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the domainuser value for this Authenticationnegotiateaction.
     * 
     * @return domainuser
     */
    public java.lang.String getDomainuser() {
        return domainuser;
    }


    /**
     * Sets the domainuser value for this Authenticationnegotiateaction.
     * 
     * @param domainuser
     */
    public void setDomainuser(java.lang.String domainuser) {
        this.domainuser = domainuser;
    }


    /**
     * Gets the domainuserpasswd value for this Authenticationnegotiateaction.
     * 
     * @return domainuserpasswd
     */
    public java.lang.String getDomainuserpasswd() {
        return domainuserpasswd;
    }


    /**
     * Sets the domainuserpasswd value for this Authenticationnegotiateaction.
     * 
     * @param domainuserpasswd
     */
    public void setDomainuserpasswd(java.lang.String domainuserpasswd) {
        this.domainuserpasswd = domainuserpasswd;
    }


    /**
     * Gets the ou value for this Authenticationnegotiateaction.
     * 
     * @return ou
     */
    public java.lang.String getOu() {
        return ou;
    }


    /**
     * Sets the ou value for this Authenticationnegotiateaction.
     * 
     * @param ou
     */
    public void setOu(java.lang.String ou) {
        this.ou = ou;
    }


    /**
     * Gets the defaultauthenticationgroup value for this Authenticationnegotiateaction.
     * 
     * @return defaultauthenticationgroup
     */
    public java.lang.String getDefaultauthenticationgroup() {
        return defaultauthenticationgroup;
    }


    /**
     * Sets the defaultauthenticationgroup value for this Authenticationnegotiateaction.
     * 
     * @param defaultauthenticationgroup
     */
    public void setDefaultauthenticationgroup(java.lang.String defaultauthenticationgroup) {
        this.defaultauthenticationgroup = defaultauthenticationgroup;
    }


    /**
     * Gets the keytab value for this Authenticationnegotiateaction.
     * 
     * @return keytab
     */
    public java.lang.String getKeytab() {
        return keytab;
    }


    /**
     * Sets the keytab value for this Authenticationnegotiateaction.
     * 
     * @param keytab
     */
    public void setKeytab(java.lang.String keytab) {
        this.keytab = keytab;
    }


    /**
     * Gets the kcdspn value for this Authenticationnegotiateaction.
     * 
     * @return kcdspn
     */
    public java.lang.String getKcdspn() {
        return kcdspn;
    }


    /**
     * Sets the kcdspn value for this Authenticationnegotiateaction.
     * 
     * @param kcdspn
     */
    public void setKcdspn(java.lang.String kcdspn) {
        this.kcdspn = kcdspn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Authenticationnegotiateaction)) return false;
        Authenticationnegotiateaction other = (Authenticationnegotiateaction) obj;
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
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain()))) &&
            ((this.domainuser==null && other.getDomainuser()==null) || 
             (this.domainuser!=null &&
              this.domainuser.equals(other.getDomainuser()))) &&
            ((this.domainuserpasswd==null && other.getDomainuserpasswd()==null) || 
             (this.domainuserpasswd!=null &&
              this.domainuserpasswd.equals(other.getDomainuserpasswd()))) &&
            ((this.ou==null && other.getOu()==null) || 
             (this.ou!=null &&
              this.ou.equals(other.getOu()))) &&
            ((this.defaultauthenticationgroup==null && other.getDefaultauthenticationgroup()==null) || 
             (this.defaultauthenticationgroup!=null &&
              this.defaultauthenticationgroup.equals(other.getDefaultauthenticationgroup()))) &&
            ((this.keytab==null && other.getKeytab()==null) || 
             (this.keytab!=null &&
              this.keytab.equals(other.getKeytab()))) &&
            ((this.kcdspn==null && other.getKcdspn()==null) || 
             (this.kcdspn!=null &&
              this.kcdspn.equals(other.getKcdspn())));
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
        if (getDomain() != null) {
            _hashCode += getDomain().hashCode();
        }
        if (getDomainuser() != null) {
            _hashCode += getDomainuser().hashCode();
        }
        if (getDomainuserpasswd() != null) {
            _hashCode += getDomainuserpasswd().hashCode();
        }
        if (getOu() != null) {
            _hashCode += getOu().hashCode();
        }
        if (getDefaultauthenticationgroup() != null) {
            _hashCode += getDefaultauthenticationgroup().hashCode();
        }
        if (getKeytab() != null) {
            _hashCode += getKeytab().hashCode();
        }
        if (getKcdspn() != null) {
            _hashCode += getKcdspn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Authenticationnegotiateaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "authenticationnegotiateaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
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
        elemField.setFieldName("domainuser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domainuser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainuserpasswd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domainuserpasswd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ou");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ou"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultauthenticationgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultauthenticationgroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("keytab");
        elemField.setXmlName(new javax.xml.namespace.QName("", "keytab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kcdspn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kcdspn"));
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
