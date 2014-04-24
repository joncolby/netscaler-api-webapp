/**
 * Aaakcdaccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Aaakcdaccount  implements java.io.Serializable {
    private java.lang.String kcdaccount;

    private java.lang.String keytab;

    private java.lang.String principle;

    private java.lang.String kcdspn;

    private java.lang.String realmstr;

    private java.lang.String delegateduser;

    private java.lang.String kcdpassword;

    private java.lang.String usercert;

    private java.lang.String cacert;

    public Aaakcdaccount() {
    }

    public Aaakcdaccount(
           java.lang.String kcdaccount,
           java.lang.String keytab,
           java.lang.String principle,
           java.lang.String kcdspn,
           java.lang.String realmstr,
           java.lang.String delegateduser,
           java.lang.String kcdpassword,
           java.lang.String usercert,
           java.lang.String cacert) {
           this.kcdaccount = kcdaccount;
           this.keytab = keytab;
           this.principle = principle;
           this.kcdspn = kcdspn;
           this.realmstr = realmstr;
           this.delegateduser = delegateduser;
           this.kcdpassword = kcdpassword;
           this.usercert = usercert;
           this.cacert = cacert;
    }


    /**
     * Gets the kcdaccount value for this Aaakcdaccount.
     * 
     * @return kcdaccount
     */
    public java.lang.String getKcdaccount() {
        return kcdaccount;
    }


    /**
     * Sets the kcdaccount value for this Aaakcdaccount.
     * 
     * @param kcdaccount
     */
    public void setKcdaccount(java.lang.String kcdaccount) {
        this.kcdaccount = kcdaccount;
    }


    /**
     * Gets the keytab value for this Aaakcdaccount.
     * 
     * @return keytab
     */
    public java.lang.String getKeytab() {
        return keytab;
    }


    /**
     * Sets the keytab value for this Aaakcdaccount.
     * 
     * @param keytab
     */
    public void setKeytab(java.lang.String keytab) {
        this.keytab = keytab;
    }


    /**
     * Gets the principle value for this Aaakcdaccount.
     * 
     * @return principle
     */
    public java.lang.String getPrinciple() {
        return principle;
    }


    /**
     * Sets the principle value for this Aaakcdaccount.
     * 
     * @param principle
     */
    public void setPrinciple(java.lang.String principle) {
        this.principle = principle;
    }


    /**
     * Gets the kcdspn value for this Aaakcdaccount.
     * 
     * @return kcdspn
     */
    public java.lang.String getKcdspn() {
        return kcdspn;
    }


    /**
     * Sets the kcdspn value for this Aaakcdaccount.
     * 
     * @param kcdspn
     */
    public void setKcdspn(java.lang.String kcdspn) {
        this.kcdspn = kcdspn;
    }


    /**
     * Gets the realmstr value for this Aaakcdaccount.
     * 
     * @return realmstr
     */
    public java.lang.String getRealmstr() {
        return realmstr;
    }


    /**
     * Sets the realmstr value for this Aaakcdaccount.
     * 
     * @param realmstr
     */
    public void setRealmstr(java.lang.String realmstr) {
        this.realmstr = realmstr;
    }


    /**
     * Gets the delegateduser value for this Aaakcdaccount.
     * 
     * @return delegateduser
     */
    public java.lang.String getDelegateduser() {
        return delegateduser;
    }


    /**
     * Sets the delegateduser value for this Aaakcdaccount.
     * 
     * @param delegateduser
     */
    public void setDelegateduser(java.lang.String delegateduser) {
        this.delegateduser = delegateduser;
    }


    /**
     * Gets the kcdpassword value for this Aaakcdaccount.
     * 
     * @return kcdpassword
     */
    public java.lang.String getKcdpassword() {
        return kcdpassword;
    }


    /**
     * Sets the kcdpassword value for this Aaakcdaccount.
     * 
     * @param kcdpassword
     */
    public void setKcdpassword(java.lang.String kcdpassword) {
        this.kcdpassword = kcdpassword;
    }


    /**
     * Gets the usercert value for this Aaakcdaccount.
     * 
     * @return usercert
     */
    public java.lang.String getUsercert() {
        return usercert;
    }


    /**
     * Sets the usercert value for this Aaakcdaccount.
     * 
     * @param usercert
     */
    public void setUsercert(java.lang.String usercert) {
        this.usercert = usercert;
    }


    /**
     * Gets the cacert value for this Aaakcdaccount.
     * 
     * @return cacert
     */
    public java.lang.String getCacert() {
        return cacert;
    }


    /**
     * Sets the cacert value for this Aaakcdaccount.
     * 
     * @param cacert
     */
    public void setCacert(java.lang.String cacert) {
        this.cacert = cacert;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Aaakcdaccount)) return false;
        Aaakcdaccount other = (Aaakcdaccount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.kcdaccount==null && other.getKcdaccount()==null) || 
             (this.kcdaccount!=null &&
              this.kcdaccount.equals(other.getKcdaccount()))) &&
            ((this.keytab==null && other.getKeytab()==null) || 
             (this.keytab!=null &&
              this.keytab.equals(other.getKeytab()))) &&
            ((this.principle==null && other.getPrinciple()==null) || 
             (this.principle!=null &&
              this.principle.equals(other.getPrinciple()))) &&
            ((this.kcdspn==null && other.getKcdspn()==null) || 
             (this.kcdspn!=null &&
              this.kcdspn.equals(other.getKcdspn()))) &&
            ((this.realmstr==null && other.getRealmstr()==null) || 
             (this.realmstr!=null &&
              this.realmstr.equals(other.getRealmstr()))) &&
            ((this.delegateduser==null && other.getDelegateduser()==null) || 
             (this.delegateduser!=null &&
              this.delegateduser.equals(other.getDelegateduser()))) &&
            ((this.kcdpassword==null && other.getKcdpassword()==null) || 
             (this.kcdpassword!=null &&
              this.kcdpassword.equals(other.getKcdpassword()))) &&
            ((this.usercert==null && other.getUsercert()==null) || 
             (this.usercert!=null &&
              this.usercert.equals(other.getUsercert()))) &&
            ((this.cacert==null && other.getCacert()==null) || 
             (this.cacert!=null &&
              this.cacert.equals(other.getCacert())));
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
        if (getKcdaccount() != null) {
            _hashCode += getKcdaccount().hashCode();
        }
        if (getKeytab() != null) {
            _hashCode += getKeytab().hashCode();
        }
        if (getPrinciple() != null) {
            _hashCode += getPrinciple().hashCode();
        }
        if (getKcdspn() != null) {
            _hashCode += getKcdspn().hashCode();
        }
        if (getRealmstr() != null) {
            _hashCode += getRealmstr().hashCode();
        }
        if (getDelegateduser() != null) {
            _hashCode += getDelegateduser().hashCode();
        }
        if (getKcdpassword() != null) {
            _hashCode += getKcdpassword().hashCode();
        }
        if (getUsercert() != null) {
            _hashCode += getUsercert().hashCode();
        }
        if (getCacert() != null) {
            _hashCode += getCacert().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Aaakcdaccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "aaakcdaccount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kcdaccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kcdaccount"));
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
        elemField.setFieldName("principle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "principle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kcdspn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kcdspn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("realmstr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "realmstr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delegateduser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delegateduser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kcdpassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kcdpassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usercert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usercert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cacert"));
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
