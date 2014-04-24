/**
 * Tmtrafficaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Tmtrafficaction  implements java.io.Serializable {
    private java.lang.String name;

    private org.apache.axis.types.UnsignedInt apptimeout;

    private java.lang.String sso;

    private java.lang.String formssoaction;

    private java.lang.String persistentcookie;

    private java.lang.String initiatelogout;

    private java.lang.String kcdaccount;

    private java.lang.String samlssoprofile;

    public Tmtrafficaction() {
    }

    public Tmtrafficaction(
           java.lang.String name,
           org.apache.axis.types.UnsignedInt apptimeout,
           java.lang.String sso,
           java.lang.String formssoaction,
           java.lang.String persistentcookie,
           java.lang.String initiatelogout,
           java.lang.String kcdaccount,
           java.lang.String samlssoprofile) {
           this.name = name;
           this.apptimeout = apptimeout;
           this.sso = sso;
           this.formssoaction = formssoaction;
           this.persistentcookie = persistentcookie;
           this.initiatelogout = initiatelogout;
           this.kcdaccount = kcdaccount;
           this.samlssoprofile = samlssoprofile;
    }


    /**
     * Gets the name value for this Tmtrafficaction.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Tmtrafficaction.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the apptimeout value for this Tmtrafficaction.
     * 
     * @return apptimeout
     */
    public org.apache.axis.types.UnsignedInt getApptimeout() {
        return apptimeout;
    }


    /**
     * Sets the apptimeout value for this Tmtrafficaction.
     * 
     * @param apptimeout
     */
    public void setApptimeout(org.apache.axis.types.UnsignedInt apptimeout) {
        this.apptimeout = apptimeout;
    }


    /**
     * Gets the sso value for this Tmtrafficaction.
     * 
     * @return sso
     */
    public java.lang.String getSso() {
        return sso;
    }


    /**
     * Sets the sso value for this Tmtrafficaction.
     * 
     * @param sso
     */
    public void setSso(java.lang.String sso) {
        this.sso = sso;
    }


    /**
     * Gets the formssoaction value for this Tmtrafficaction.
     * 
     * @return formssoaction
     */
    public java.lang.String getFormssoaction() {
        return formssoaction;
    }


    /**
     * Sets the formssoaction value for this Tmtrafficaction.
     * 
     * @param formssoaction
     */
    public void setFormssoaction(java.lang.String formssoaction) {
        this.formssoaction = formssoaction;
    }


    /**
     * Gets the persistentcookie value for this Tmtrafficaction.
     * 
     * @return persistentcookie
     */
    public java.lang.String getPersistentcookie() {
        return persistentcookie;
    }


    /**
     * Sets the persistentcookie value for this Tmtrafficaction.
     * 
     * @param persistentcookie
     */
    public void setPersistentcookie(java.lang.String persistentcookie) {
        this.persistentcookie = persistentcookie;
    }


    /**
     * Gets the initiatelogout value for this Tmtrafficaction.
     * 
     * @return initiatelogout
     */
    public java.lang.String getInitiatelogout() {
        return initiatelogout;
    }


    /**
     * Sets the initiatelogout value for this Tmtrafficaction.
     * 
     * @param initiatelogout
     */
    public void setInitiatelogout(java.lang.String initiatelogout) {
        this.initiatelogout = initiatelogout;
    }


    /**
     * Gets the kcdaccount value for this Tmtrafficaction.
     * 
     * @return kcdaccount
     */
    public java.lang.String getKcdaccount() {
        return kcdaccount;
    }


    /**
     * Sets the kcdaccount value for this Tmtrafficaction.
     * 
     * @param kcdaccount
     */
    public void setKcdaccount(java.lang.String kcdaccount) {
        this.kcdaccount = kcdaccount;
    }


    /**
     * Gets the samlssoprofile value for this Tmtrafficaction.
     * 
     * @return samlssoprofile
     */
    public java.lang.String getSamlssoprofile() {
        return samlssoprofile;
    }


    /**
     * Sets the samlssoprofile value for this Tmtrafficaction.
     * 
     * @param samlssoprofile
     */
    public void setSamlssoprofile(java.lang.String samlssoprofile) {
        this.samlssoprofile = samlssoprofile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tmtrafficaction)) return false;
        Tmtrafficaction other = (Tmtrafficaction) obj;
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
            ((this.apptimeout==null && other.getApptimeout()==null) || 
             (this.apptimeout!=null &&
              this.apptimeout.equals(other.getApptimeout()))) &&
            ((this.sso==null && other.getSso()==null) || 
             (this.sso!=null &&
              this.sso.equals(other.getSso()))) &&
            ((this.formssoaction==null && other.getFormssoaction()==null) || 
             (this.formssoaction!=null &&
              this.formssoaction.equals(other.getFormssoaction()))) &&
            ((this.persistentcookie==null && other.getPersistentcookie()==null) || 
             (this.persistentcookie!=null &&
              this.persistentcookie.equals(other.getPersistentcookie()))) &&
            ((this.initiatelogout==null && other.getInitiatelogout()==null) || 
             (this.initiatelogout!=null &&
              this.initiatelogout.equals(other.getInitiatelogout()))) &&
            ((this.kcdaccount==null && other.getKcdaccount()==null) || 
             (this.kcdaccount!=null &&
              this.kcdaccount.equals(other.getKcdaccount()))) &&
            ((this.samlssoprofile==null && other.getSamlssoprofile()==null) || 
             (this.samlssoprofile!=null &&
              this.samlssoprofile.equals(other.getSamlssoprofile())));
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
        if (getApptimeout() != null) {
            _hashCode += getApptimeout().hashCode();
        }
        if (getSso() != null) {
            _hashCode += getSso().hashCode();
        }
        if (getFormssoaction() != null) {
            _hashCode += getFormssoaction().hashCode();
        }
        if (getPersistentcookie() != null) {
            _hashCode += getPersistentcookie().hashCode();
        }
        if (getInitiatelogout() != null) {
            _hashCode += getInitiatelogout().hashCode();
        }
        if (getKcdaccount() != null) {
            _hashCode += getKcdaccount().hashCode();
        }
        if (getSamlssoprofile() != null) {
            _hashCode += getSamlssoprofile().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Tmtrafficaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "tmtrafficaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apptimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apptimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formssoaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "formssoaction"));
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
        elemField.setFieldName("initiatelogout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "initiatelogout"));
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
        elemField.setFieldName("samlssoprofile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "samlssoprofile"));
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
