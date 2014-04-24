/**
 * Tmsessionaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Tmsessionaction  implements java.io.Serializable {
    private java.lang.String name;

    private org.apache.axis.types.UnsignedInt sesstimeout;

    private java.lang.String defaultauthorizationaction;

    private java.lang.String sso;

    private java.lang.String ssocredential;

    private java.lang.String ssodomain;

    private java.lang.String kcdaccount;

    private java.lang.String httponlycookie;

    private java.lang.String persistentcookie;

    private org.apache.axis.types.UnsignedInt persistentcookievalidity;

    private java.lang.String homepage;

    private java.lang.String builtin;

    public Tmsessionaction() {
    }

    public Tmsessionaction(
           java.lang.String name,
           org.apache.axis.types.UnsignedInt sesstimeout,
           java.lang.String defaultauthorizationaction,
           java.lang.String sso,
           java.lang.String ssocredential,
           java.lang.String ssodomain,
           java.lang.String kcdaccount,
           java.lang.String httponlycookie,
           java.lang.String persistentcookie,
           org.apache.axis.types.UnsignedInt persistentcookievalidity,
           java.lang.String homepage,
           java.lang.String builtin) {
           this.name = name;
           this.sesstimeout = sesstimeout;
           this.defaultauthorizationaction = defaultauthorizationaction;
           this.sso = sso;
           this.ssocredential = ssocredential;
           this.ssodomain = ssodomain;
           this.kcdaccount = kcdaccount;
           this.httponlycookie = httponlycookie;
           this.persistentcookie = persistentcookie;
           this.persistentcookievalidity = persistentcookievalidity;
           this.homepage = homepage;
           this.builtin = builtin;
    }


    /**
     * Gets the name value for this Tmsessionaction.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Tmsessionaction.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the sesstimeout value for this Tmsessionaction.
     * 
     * @return sesstimeout
     */
    public org.apache.axis.types.UnsignedInt getSesstimeout() {
        return sesstimeout;
    }


    /**
     * Sets the sesstimeout value for this Tmsessionaction.
     * 
     * @param sesstimeout
     */
    public void setSesstimeout(org.apache.axis.types.UnsignedInt sesstimeout) {
        this.sesstimeout = sesstimeout;
    }


    /**
     * Gets the defaultauthorizationaction value for this Tmsessionaction.
     * 
     * @return defaultauthorizationaction
     */
    public java.lang.String getDefaultauthorizationaction() {
        return defaultauthorizationaction;
    }


    /**
     * Sets the defaultauthorizationaction value for this Tmsessionaction.
     * 
     * @param defaultauthorizationaction
     */
    public void setDefaultauthorizationaction(java.lang.String defaultauthorizationaction) {
        this.defaultauthorizationaction = defaultauthorizationaction;
    }


    /**
     * Gets the sso value for this Tmsessionaction.
     * 
     * @return sso
     */
    public java.lang.String getSso() {
        return sso;
    }


    /**
     * Sets the sso value for this Tmsessionaction.
     * 
     * @param sso
     */
    public void setSso(java.lang.String sso) {
        this.sso = sso;
    }


    /**
     * Gets the ssocredential value for this Tmsessionaction.
     * 
     * @return ssocredential
     */
    public java.lang.String getSsocredential() {
        return ssocredential;
    }


    /**
     * Sets the ssocredential value for this Tmsessionaction.
     * 
     * @param ssocredential
     */
    public void setSsocredential(java.lang.String ssocredential) {
        this.ssocredential = ssocredential;
    }


    /**
     * Gets the ssodomain value for this Tmsessionaction.
     * 
     * @return ssodomain
     */
    public java.lang.String getSsodomain() {
        return ssodomain;
    }


    /**
     * Sets the ssodomain value for this Tmsessionaction.
     * 
     * @param ssodomain
     */
    public void setSsodomain(java.lang.String ssodomain) {
        this.ssodomain = ssodomain;
    }


    /**
     * Gets the kcdaccount value for this Tmsessionaction.
     * 
     * @return kcdaccount
     */
    public java.lang.String getKcdaccount() {
        return kcdaccount;
    }


    /**
     * Sets the kcdaccount value for this Tmsessionaction.
     * 
     * @param kcdaccount
     */
    public void setKcdaccount(java.lang.String kcdaccount) {
        this.kcdaccount = kcdaccount;
    }


    /**
     * Gets the httponlycookie value for this Tmsessionaction.
     * 
     * @return httponlycookie
     */
    public java.lang.String getHttponlycookie() {
        return httponlycookie;
    }


    /**
     * Sets the httponlycookie value for this Tmsessionaction.
     * 
     * @param httponlycookie
     */
    public void setHttponlycookie(java.lang.String httponlycookie) {
        this.httponlycookie = httponlycookie;
    }


    /**
     * Gets the persistentcookie value for this Tmsessionaction.
     * 
     * @return persistentcookie
     */
    public java.lang.String getPersistentcookie() {
        return persistentcookie;
    }


    /**
     * Sets the persistentcookie value for this Tmsessionaction.
     * 
     * @param persistentcookie
     */
    public void setPersistentcookie(java.lang.String persistentcookie) {
        this.persistentcookie = persistentcookie;
    }


    /**
     * Gets the persistentcookievalidity value for this Tmsessionaction.
     * 
     * @return persistentcookievalidity
     */
    public org.apache.axis.types.UnsignedInt getPersistentcookievalidity() {
        return persistentcookievalidity;
    }


    /**
     * Sets the persistentcookievalidity value for this Tmsessionaction.
     * 
     * @param persistentcookievalidity
     */
    public void setPersistentcookievalidity(org.apache.axis.types.UnsignedInt persistentcookievalidity) {
        this.persistentcookievalidity = persistentcookievalidity;
    }


    /**
     * Gets the homepage value for this Tmsessionaction.
     * 
     * @return homepage
     */
    public java.lang.String getHomepage() {
        return homepage;
    }


    /**
     * Sets the homepage value for this Tmsessionaction.
     * 
     * @param homepage
     */
    public void setHomepage(java.lang.String homepage) {
        this.homepage = homepage;
    }


    /**
     * Gets the builtin value for this Tmsessionaction.
     * 
     * @return builtin
     */
    public java.lang.String getBuiltin() {
        return builtin;
    }


    /**
     * Sets the builtin value for this Tmsessionaction.
     * 
     * @param builtin
     */
    public void setBuiltin(java.lang.String builtin) {
        this.builtin = builtin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tmsessionaction)) return false;
        Tmsessionaction other = (Tmsessionaction) obj;
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
            ((this.sesstimeout==null && other.getSesstimeout()==null) || 
             (this.sesstimeout!=null &&
              this.sesstimeout.equals(other.getSesstimeout()))) &&
            ((this.defaultauthorizationaction==null && other.getDefaultauthorizationaction()==null) || 
             (this.defaultauthorizationaction!=null &&
              this.defaultauthorizationaction.equals(other.getDefaultauthorizationaction()))) &&
            ((this.sso==null && other.getSso()==null) || 
             (this.sso!=null &&
              this.sso.equals(other.getSso()))) &&
            ((this.ssocredential==null && other.getSsocredential()==null) || 
             (this.ssocredential!=null &&
              this.ssocredential.equals(other.getSsocredential()))) &&
            ((this.ssodomain==null && other.getSsodomain()==null) || 
             (this.ssodomain!=null &&
              this.ssodomain.equals(other.getSsodomain()))) &&
            ((this.kcdaccount==null && other.getKcdaccount()==null) || 
             (this.kcdaccount!=null &&
              this.kcdaccount.equals(other.getKcdaccount()))) &&
            ((this.httponlycookie==null && other.getHttponlycookie()==null) || 
             (this.httponlycookie!=null &&
              this.httponlycookie.equals(other.getHttponlycookie()))) &&
            ((this.persistentcookie==null && other.getPersistentcookie()==null) || 
             (this.persistentcookie!=null &&
              this.persistentcookie.equals(other.getPersistentcookie()))) &&
            ((this.persistentcookievalidity==null && other.getPersistentcookievalidity()==null) || 
             (this.persistentcookievalidity!=null &&
              this.persistentcookievalidity.equals(other.getPersistentcookievalidity()))) &&
            ((this.homepage==null && other.getHomepage()==null) || 
             (this.homepage!=null &&
              this.homepage.equals(other.getHomepage()))) &&
            ((this.builtin==null && other.getBuiltin()==null) || 
             (this.builtin!=null &&
              this.builtin.equals(other.getBuiltin())));
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
        if (getSesstimeout() != null) {
            _hashCode += getSesstimeout().hashCode();
        }
        if (getDefaultauthorizationaction() != null) {
            _hashCode += getDefaultauthorizationaction().hashCode();
        }
        if (getSso() != null) {
            _hashCode += getSso().hashCode();
        }
        if (getSsocredential() != null) {
            _hashCode += getSsocredential().hashCode();
        }
        if (getSsodomain() != null) {
            _hashCode += getSsodomain().hashCode();
        }
        if (getKcdaccount() != null) {
            _hashCode += getKcdaccount().hashCode();
        }
        if (getHttponlycookie() != null) {
            _hashCode += getHttponlycookie().hashCode();
        }
        if (getPersistentcookie() != null) {
            _hashCode += getPersistentcookie().hashCode();
        }
        if (getPersistentcookievalidity() != null) {
            _hashCode += getPersistentcookievalidity().hashCode();
        }
        if (getHomepage() != null) {
            _hashCode += getHomepage().hashCode();
        }
        if (getBuiltin() != null) {
            _hashCode += getBuiltin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Tmsessionaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "tmsessionaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sesstimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sesstimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultauthorizationaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultauthorizationaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssocredential");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssocredential"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssodomain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssodomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kcdaccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kcdaccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httponlycookie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httponlycookie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persistentcookie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "persistentcookie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persistentcookievalidity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "persistentcookievalidity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homepage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homepage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builtin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "builtin"));
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
