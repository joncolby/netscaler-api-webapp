/**
 * Vpntrafficaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Vpntrafficaction  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String qual;

    private org.apache.axis.types.UnsignedInt apptimeout;

    private java.lang.String sso;

    private java.lang.String formssoaction;

    private java.lang.String fta;

    private java.lang.String wanscaler;

    private java.lang.String kcdaccount;

    private java.lang.String samlssoprofile;

    public Vpntrafficaction() {
    }

    public Vpntrafficaction(
           java.lang.String name,
           java.lang.String qual,
           org.apache.axis.types.UnsignedInt apptimeout,
           java.lang.String sso,
           java.lang.String formssoaction,
           java.lang.String fta,
           java.lang.String wanscaler,
           java.lang.String kcdaccount,
           java.lang.String samlssoprofile) {
           this.name = name;
           this.qual = qual;
           this.apptimeout = apptimeout;
           this.sso = sso;
           this.formssoaction = formssoaction;
           this.fta = fta;
           this.wanscaler = wanscaler;
           this.kcdaccount = kcdaccount;
           this.samlssoprofile = samlssoprofile;
    }


    /**
     * Gets the name value for this Vpntrafficaction.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Vpntrafficaction.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the qual value for this Vpntrafficaction.
     * 
     * @return qual
     */
    public java.lang.String getQual() {
        return qual;
    }


    /**
     * Sets the qual value for this Vpntrafficaction.
     * 
     * @param qual
     */
    public void setQual(java.lang.String qual) {
        this.qual = qual;
    }


    /**
     * Gets the apptimeout value for this Vpntrafficaction.
     * 
     * @return apptimeout
     */
    public org.apache.axis.types.UnsignedInt getApptimeout() {
        return apptimeout;
    }


    /**
     * Sets the apptimeout value for this Vpntrafficaction.
     * 
     * @param apptimeout
     */
    public void setApptimeout(org.apache.axis.types.UnsignedInt apptimeout) {
        this.apptimeout = apptimeout;
    }


    /**
     * Gets the sso value for this Vpntrafficaction.
     * 
     * @return sso
     */
    public java.lang.String getSso() {
        return sso;
    }


    /**
     * Sets the sso value for this Vpntrafficaction.
     * 
     * @param sso
     */
    public void setSso(java.lang.String sso) {
        this.sso = sso;
    }


    /**
     * Gets the formssoaction value for this Vpntrafficaction.
     * 
     * @return formssoaction
     */
    public java.lang.String getFormssoaction() {
        return formssoaction;
    }


    /**
     * Sets the formssoaction value for this Vpntrafficaction.
     * 
     * @param formssoaction
     */
    public void setFormssoaction(java.lang.String formssoaction) {
        this.formssoaction = formssoaction;
    }


    /**
     * Gets the fta value for this Vpntrafficaction.
     * 
     * @return fta
     */
    public java.lang.String getFta() {
        return fta;
    }


    /**
     * Sets the fta value for this Vpntrafficaction.
     * 
     * @param fta
     */
    public void setFta(java.lang.String fta) {
        this.fta = fta;
    }


    /**
     * Gets the wanscaler value for this Vpntrafficaction.
     * 
     * @return wanscaler
     */
    public java.lang.String getWanscaler() {
        return wanscaler;
    }


    /**
     * Sets the wanscaler value for this Vpntrafficaction.
     * 
     * @param wanscaler
     */
    public void setWanscaler(java.lang.String wanscaler) {
        this.wanscaler = wanscaler;
    }


    /**
     * Gets the kcdaccount value for this Vpntrafficaction.
     * 
     * @return kcdaccount
     */
    public java.lang.String getKcdaccount() {
        return kcdaccount;
    }


    /**
     * Sets the kcdaccount value for this Vpntrafficaction.
     * 
     * @param kcdaccount
     */
    public void setKcdaccount(java.lang.String kcdaccount) {
        this.kcdaccount = kcdaccount;
    }


    /**
     * Gets the samlssoprofile value for this Vpntrafficaction.
     * 
     * @return samlssoprofile
     */
    public java.lang.String getSamlssoprofile() {
        return samlssoprofile;
    }


    /**
     * Sets the samlssoprofile value for this Vpntrafficaction.
     * 
     * @param samlssoprofile
     */
    public void setSamlssoprofile(java.lang.String samlssoprofile) {
        this.samlssoprofile = samlssoprofile;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Vpntrafficaction)) return false;
        Vpntrafficaction other = (Vpntrafficaction) obj;
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
            ((this.qual==null && other.getQual()==null) || 
             (this.qual!=null &&
              this.qual.equals(other.getQual()))) &&
            ((this.apptimeout==null && other.getApptimeout()==null) || 
             (this.apptimeout!=null &&
              this.apptimeout.equals(other.getApptimeout()))) &&
            ((this.sso==null && other.getSso()==null) || 
             (this.sso!=null &&
              this.sso.equals(other.getSso()))) &&
            ((this.formssoaction==null && other.getFormssoaction()==null) || 
             (this.formssoaction!=null &&
              this.formssoaction.equals(other.getFormssoaction()))) &&
            ((this.fta==null && other.getFta()==null) || 
             (this.fta!=null &&
              this.fta.equals(other.getFta()))) &&
            ((this.wanscaler==null && other.getWanscaler()==null) || 
             (this.wanscaler!=null &&
              this.wanscaler.equals(other.getWanscaler()))) &&
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
        if (getQual() != null) {
            _hashCode += getQual().hashCode();
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
        if (getFta() != null) {
            _hashCode += getFta().hashCode();
        }
        if (getWanscaler() != null) {
            _hashCode += getWanscaler().hashCode();
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
        new org.apache.axis.description.TypeDesc(Vpntrafficaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "vpntrafficaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qual");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qual"));
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
        elemField.setFieldName("fta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wanscaler");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wanscaler"));
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
