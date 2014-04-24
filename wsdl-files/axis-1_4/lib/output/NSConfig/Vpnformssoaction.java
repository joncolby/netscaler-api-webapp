/**
 * Vpnformssoaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Vpnformssoaction  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String actionurl;

    private java.lang.String userfield;

    private java.lang.String passwdfield;

    private org.apache.axis.types.UnsignedInt responsesize;

    private java.lang.String namevaluepair;

    private java.lang.String nvtype;

    private java.lang.String ssosuccessrule;

    private java.lang.String submitmethod;

    public Vpnformssoaction() {
    }

    public Vpnformssoaction(
           java.lang.String name,
           java.lang.String actionurl,
           java.lang.String userfield,
           java.lang.String passwdfield,
           org.apache.axis.types.UnsignedInt responsesize,
           java.lang.String namevaluepair,
           java.lang.String nvtype,
           java.lang.String ssosuccessrule,
           java.lang.String submitmethod) {
           this.name = name;
           this.actionurl = actionurl;
           this.userfield = userfield;
           this.passwdfield = passwdfield;
           this.responsesize = responsesize;
           this.namevaluepair = namevaluepair;
           this.nvtype = nvtype;
           this.ssosuccessrule = ssosuccessrule;
           this.submitmethod = submitmethod;
    }


    /**
     * Gets the name value for this Vpnformssoaction.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Vpnformssoaction.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the actionurl value for this Vpnformssoaction.
     * 
     * @return actionurl
     */
    public java.lang.String getActionurl() {
        return actionurl;
    }


    /**
     * Sets the actionurl value for this Vpnformssoaction.
     * 
     * @param actionurl
     */
    public void setActionurl(java.lang.String actionurl) {
        this.actionurl = actionurl;
    }


    /**
     * Gets the userfield value for this Vpnformssoaction.
     * 
     * @return userfield
     */
    public java.lang.String getUserfield() {
        return userfield;
    }


    /**
     * Sets the userfield value for this Vpnformssoaction.
     * 
     * @param userfield
     */
    public void setUserfield(java.lang.String userfield) {
        this.userfield = userfield;
    }


    /**
     * Gets the passwdfield value for this Vpnformssoaction.
     * 
     * @return passwdfield
     */
    public java.lang.String getPasswdfield() {
        return passwdfield;
    }


    /**
     * Sets the passwdfield value for this Vpnformssoaction.
     * 
     * @param passwdfield
     */
    public void setPasswdfield(java.lang.String passwdfield) {
        this.passwdfield = passwdfield;
    }


    /**
     * Gets the responsesize value for this Vpnformssoaction.
     * 
     * @return responsesize
     */
    public org.apache.axis.types.UnsignedInt getResponsesize() {
        return responsesize;
    }


    /**
     * Sets the responsesize value for this Vpnformssoaction.
     * 
     * @param responsesize
     */
    public void setResponsesize(org.apache.axis.types.UnsignedInt responsesize) {
        this.responsesize = responsesize;
    }


    /**
     * Gets the namevaluepair value for this Vpnformssoaction.
     * 
     * @return namevaluepair
     */
    public java.lang.String getNamevaluepair() {
        return namevaluepair;
    }


    /**
     * Sets the namevaluepair value for this Vpnformssoaction.
     * 
     * @param namevaluepair
     */
    public void setNamevaluepair(java.lang.String namevaluepair) {
        this.namevaluepair = namevaluepair;
    }


    /**
     * Gets the nvtype value for this Vpnformssoaction.
     * 
     * @return nvtype
     */
    public java.lang.String getNvtype() {
        return nvtype;
    }


    /**
     * Sets the nvtype value for this Vpnformssoaction.
     * 
     * @param nvtype
     */
    public void setNvtype(java.lang.String nvtype) {
        this.nvtype = nvtype;
    }


    /**
     * Gets the ssosuccessrule value for this Vpnformssoaction.
     * 
     * @return ssosuccessrule
     */
    public java.lang.String getSsosuccessrule() {
        return ssosuccessrule;
    }


    /**
     * Sets the ssosuccessrule value for this Vpnformssoaction.
     * 
     * @param ssosuccessrule
     */
    public void setSsosuccessrule(java.lang.String ssosuccessrule) {
        this.ssosuccessrule = ssosuccessrule;
    }


    /**
     * Gets the submitmethod value for this Vpnformssoaction.
     * 
     * @return submitmethod
     */
    public java.lang.String getSubmitmethod() {
        return submitmethod;
    }


    /**
     * Sets the submitmethod value for this Vpnformssoaction.
     * 
     * @param submitmethod
     */
    public void setSubmitmethod(java.lang.String submitmethod) {
        this.submitmethod = submitmethod;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Vpnformssoaction)) return false;
        Vpnformssoaction other = (Vpnformssoaction) obj;
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
            ((this.actionurl==null && other.getActionurl()==null) || 
             (this.actionurl!=null &&
              this.actionurl.equals(other.getActionurl()))) &&
            ((this.userfield==null && other.getUserfield()==null) || 
             (this.userfield!=null &&
              this.userfield.equals(other.getUserfield()))) &&
            ((this.passwdfield==null && other.getPasswdfield()==null) || 
             (this.passwdfield!=null &&
              this.passwdfield.equals(other.getPasswdfield()))) &&
            ((this.responsesize==null && other.getResponsesize()==null) || 
             (this.responsesize!=null &&
              this.responsesize.equals(other.getResponsesize()))) &&
            ((this.namevaluepair==null && other.getNamevaluepair()==null) || 
             (this.namevaluepair!=null &&
              this.namevaluepair.equals(other.getNamevaluepair()))) &&
            ((this.nvtype==null && other.getNvtype()==null) || 
             (this.nvtype!=null &&
              this.nvtype.equals(other.getNvtype()))) &&
            ((this.ssosuccessrule==null && other.getSsosuccessrule()==null) || 
             (this.ssosuccessrule!=null &&
              this.ssosuccessrule.equals(other.getSsosuccessrule()))) &&
            ((this.submitmethod==null && other.getSubmitmethod()==null) || 
             (this.submitmethod!=null &&
              this.submitmethod.equals(other.getSubmitmethod())));
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
        if (getActionurl() != null) {
            _hashCode += getActionurl().hashCode();
        }
        if (getUserfield() != null) {
            _hashCode += getUserfield().hashCode();
        }
        if (getPasswdfield() != null) {
            _hashCode += getPasswdfield().hashCode();
        }
        if (getResponsesize() != null) {
            _hashCode += getResponsesize().hashCode();
        }
        if (getNamevaluepair() != null) {
            _hashCode += getNamevaluepair().hashCode();
        }
        if (getNvtype() != null) {
            _hashCode += getNvtype().hashCode();
        }
        if (getSsosuccessrule() != null) {
            _hashCode += getSsosuccessrule().hashCode();
        }
        if (getSubmitmethod() != null) {
            _hashCode += getSubmitmethod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Vpnformssoaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "vpnformssoaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionurl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionurl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userfield");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userfield"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwdfield");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passwdfield"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsesize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responsesize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("namevaluepair");
        elemField.setXmlName(new javax.xml.namespace.QName("", "namevaluepair"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nvtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nvtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssosuccessrule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssosuccessrule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("submitmethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "submitmethod"));
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
