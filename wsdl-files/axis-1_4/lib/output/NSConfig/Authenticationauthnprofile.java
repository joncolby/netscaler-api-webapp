/**
 * Authenticationauthnprofile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Authenticationauthnprofile  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String authnvsname;

    private java.lang.String authenticationhost;

    private java.lang.String authenticationdomain;

    private org.apache.axis.types.UnsignedInt authenticationlevel;

    public Authenticationauthnprofile() {
    }

    public Authenticationauthnprofile(
           java.lang.String name,
           java.lang.String authnvsname,
           java.lang.String authenticationhost,
           java.lang.String authenticationdomain,
           org.apache.axis.types.UnsignedInt authenticationlevel) {
           this.name = name;
           this.authnvsname = authnvsname;
           this.authenticationhost = authenticationhost;
           this.authenticationdomain = authenticationdomain;
           this.authenticationlevel = authenticationlevel;
    }


    /**
     * Gets the name value for this Authenticationauthnprofile.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Authenticationauthnprofile.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the authnvsname value for this Authenticationauthnprofile.
     * 
     * @return authnvsname
     */
    public java.lang.String getAuthnvsname() {
        return authnvsname;
    }


    /**
     * Sets the authnvsname value for this Authenticationauthnprofile.
     * 
     * @param authnvsname
     */
    public void setAuthnvsname(java.lang.String authnvsname) {
        this.authnvsname = authnvsname;
    }


    /**
     * Gets the authenticationhost value for this Authenticationauthnprofile.
     * 
     * @return authenticationhost
     */
    public java.lang.String getAuthenticationhost() {
        return authenticationhost;
    }


    /**
     * Sets the authenticationhost value for this Authenticationauthnprofile.
     * 
     * @param authenticationhost
     */
    public void setAuthenticationhost(java.lang.String authenticationhost) {
        this.authenticationhost = authenticationhost;
    }


    /**
     * Gets the authenticationdomain value for this Authenticationauthnprofile.
     * 
     * @return authenticationdomain
     */
    public java.lang.String getAuthenticationdomain() {
        return authenticationdomain;
    }


    /**
     * Sets the authenticationdomain value for this Authenticationauthnprofile.
     * 
     * @param authenticationdomain
     */
    public void setAuthenticationdomain(java.lang.String authenticationdomain) {
        this.authenticationdomain = authenticationdomain;
    }


    /**
     * Gets the authenticationlevel value for this Authenticationauthnprofile.
     * 
     * @return authenticationlevel
     */
    public org.apache.axis.types.UnsignedInt getAuthenticationlevel() {
        return authenticationlevel;
    }


    /**
     * Sets the authenticationlevel value for this Authenticationauthnprofile.
     * 
     * @param authenticationlevel
     */
    public void setAuthenticationlevel(org.apache.axis.types.UnsignedInt authenticationlevel) {
        this.authenticationlevel = authenticationlevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Authenticationauthnprofile)) return false;
        Authenticationauthnprofile other = (Authenticationauthnprofile) obj;
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
            ((this.authnvsname==null && other.getAuthnvsname()==null) || 
             (this.authnvsname!=null &&
              this.authnvsname.equals(other.getAuthnvsname()))) &&
            ((this.authenticationhost==null && other.getAuthenticationhost()==null) || 
             (this.authenticationhost!=null &&
              this.authenticationhost.equals(other.getAuthenticationhost()))) &&
            ((this.authenticationdomain==null && other.getAuthenticationdomain()==null) || 
             (this.authenticationdomain!=null &&
              this.authenticationdomain.equals(other.getAuthenticationdomain()))) &&
            ((this.authenticationlevel==null && other.getAuthenticationlevel()==null) || 
             (this.authenticationlevel!=null &&
              this.authenticationlevel.equals(other.getAuthenticationlevel())));
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
        if (getAuthnvsname() != null) {
            _hashCode += getAuthnvsname().hashCode();
        }
        if (getAuthenticationhost() != null) {
            _hashCode += getAuthenticationhost().hashCode();
        }
        if (getAuthenticationdomain() != null) {
            _hashCode += getAuthenticationdomain().hashCode();
        }
        if (getAuthenticationlevel() != null) {
            _hashCode += getAuthenticationlevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Authenticationauthnprofile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "authenticationauthnprofile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authnvsname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authnvsname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationhost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authenticationhost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationdomain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authenticationdomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationlevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authenticationlevel"));
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
