/**
 * Aaaparameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Aaaparameter  implements java.io.Serializable {
    private java.lang.String enablestaticpagecaching;

    private java.lang.String enableenhancedauthfeedback;

    private java.lang.String defaultauthtype;

    private org.apache.axis.types.UnsignedInt maxaaausers;

    private java.lang.String aaadnatip;

    private org.apache.axis.types.UnsignedInt maxloginattempts;

    private org.apache.axis.types.UnsignedInt failedlogintimeout;

    public Aaaparameter() {
    }

    public Aaaparameter(
           java.lang.String enablestaticpagecaching,
           java.lang.String enableenhancedauthfeedback,
           java.lang.String defaultauthtype,
           org.apache.axis.types.UnsignedInt maxaaausers,
           java.lang.String aaadnatip,
           org.apache.axis.types.UnsignedInt maxloginattempts,
           org.apache.axis.types.UnsignedInt failedlogintimeout) {
           this.enablestaticpagecaching = enablestaticpagecaching;
           this.enableenhancedauthfeedback = enableenhancedauthfeedback;
           this.defaultauthtype = defaultauthtype;
           this.maxaaausers = maxaaausers;
           this.aaadnatip = aaadnatip;
           this.maxloginattempts = maxloginattempts;
           this.failedlogintimeout = failedlogintimeout;
    }


    /**
     * Gets the enablestaticpagecaching value for this Aaaparameter.
     * 
     * @return enablestaticpagecaching
     */
    public java.lang.String getEnablestaticpagecaching() {
        return enablestaticpagecaching;
    }


    /**
     * Sets the enablestaticpagecaching value for this Aaaparameter.
     * 
     * @param enablestaticpagecaching
     */
    public void setEnablestaticpagecaching(java.lang.String enablestaticpagecaching) {
        this.enablestaticpagecaching = enablestaticpagecaching;
    }


    /**
     * Gets the enableenhancedauthfeedback value for this Aaaparameter.
     * 
     * @return enableenhancedauthfeedback
     */
    public java.lang.String getEnableenhancedauthfeedback() {
        return enableenhancedauthfeedback;
    }


    /**
     * Sets the enableenhancedauthfeedback value for this Aaaparameter.
     * 
     * @param enableenhancedauthfeedback
     */
    public void setEnableenhancedauthfeedback(java.lang.String enableenhancedauthfeedback) {
        this.enableenhancedauthfeedback = enableenhancedauthfeedback;
    }


    /**
     * Gets the defaultauthtype value for this Aaaparameter.
     * 
     * @return defaultauthtype
     */
    public java.lang.String getDefaultauthtype() {
        return defaultauthtype;
    }


    /**
     * Sets the defaultauthtype value for this Aaaparameter.
     * 
     * @param defaultauthtype
     */
    public void setDefaultauthtype(java.lang.String defaultauthtype) {
        this.defaultauthtype = defaultauthtype;
    }


    /**
     * Gets the maxaaausers value for this Aaaparameter.
     * 
     * @return maxaaausers
     */
    public org.apache.axis.types.UnsignedInt getMaxaaausers() {
        return maxaaausers;
    }


    /**
     * Sets the maxaaausers value for this Aaaparameter.
     * 
     * @param maxaaausers
     */
    public void setMaxaaausers(org.apache.axis.types.UnsignedInt maxaaausers) {
        this.maxaaausers = maxaaausers;
    }


    /**
     * Gets the aaadnatip value for this Aaaparameter.
     * 
     * @return aaadnatip
     */
    public java.lang.String getAaadnatip() {
        return aaadnatip;
    }


    /**
     * Sets the aaadnatip value for this Aaaparameter.
     * 
     * @param aaadnatip
     */
    public void setAaadnatip(java.lang.String aaadnatip) {
        this.aaadnatip = aaadnatip;
    }


    /**
     * Gets the maxloginattempts value for this Aaaparameter.
     * 
     * @return maxloginattempts
     */
    public org.apache.axis.types.UnsignedInt getMaxloginattempts() {
        return maxloginattempts;
    }


    /**
     * Sets the maxloginattempts value for this Aaaparameter.
     * 
     * @param maxloginattempts
     */
    public void setMaxloginattempts(org.apache.axis.types.UnsignedInt maxloginattempts) {
        this.maxloginattempts = maxloginattempts;
    }


    /**
     * Gets the failedlogintimeout value for this Aaaparameter.
     * 
     * @return failedlogintimeout
     */
    public org.apache.axis.types.UnsignedInt getFailedlogintimeout() {
        return failedlogintimeout;
    }


    /**
     * Sets the failedlogintimeout value for this Aaaparameter.
     * 
     * @param failedlogintimeout
     */
    public void setFailedlogintimeout(org.apache.axis.types.UnsignedInt failedlogintimeout) {
        this.failedlogintimeout = failedlogintimeout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Aaaparameter)) return false;
        Aaaparameter other = (Aaaparameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.enablestaticpagecaching==null && other.getEnablestaticpagecaching()==null) || 
             (this.enablestaticpagecaching!=null &&
              this.enablestaticpagecaching.equals(other.getEnablestaticpagecaching()))) &&
            ((this.enableenhancedauthfeedback==null && other.getEnableenhancedauthfeedback()==null) || 
             (this.enableenhancedauthfeedback!=null &&
              this.enableenhancedauthfeedback.equals(other.getEnableenhancedauthfeedback()))) &&
            ((this.defaultauthtype==null && other.getDefaultauthtype()==null) || 
             (this.defaultauthtype!=null &&
              this.defaultauthtype.equals(other.getDefaultauthtype()))) &&
            ((this.maxaaausers==null && other.getMaxaaausers()==null) || 
             (this.maxaaausers!=null &&
              this.maxaaausers.equals(other.getMaxaaausers()))) &&
            ((this.aaadnatip==null && other.getAaadnatip()==null) || 
             (this.aaadnatip!=null &&
              this.aaadnatip.equals(other.getAaadnatip()))) &&
            ((this.maxloginattempts==null && other.getMaxloginattempts()==null) || 
             (this.maxloginattempts!=null &&
              this.maxloginattempts.equals(other.getMaxloginattempts()))) &&
            ((this.failedlogintimeout==null && other.getFailedlogintimeout()==null) || 
             (this.failedlogintimeout!=null &&
              this.failedlogintimeout.equals(other.getFailedlogintimeout())));
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
        if (getEnablestaticpagecaching() != null) {
            _hashCode += getEnablestaticpagecaching().hashCode();
        }
        if (getEnableenhancedauthfeedback() != null) {
            _hashCode += getEnableenhancedauthfeedback().hashCode();
        }
        if (getDefaultauthtype() != null) {
            _hashCode += getDefaultauthtype().hashCode();
        }
        if (getMaxaaausers() != null) {
            _hashCode += getMaxaaausers().hashCode();
        }
        if (getAaadnatip() != null) {
            _hashCode += getAaadnatip().hashCode();
        }
        if (getMaxloginattempts() != null) {
            _hashCode += getMaxloginattempts().hashCode();
        }
        if (getFailedlogintimeout() != null) {
            _hashCode += getFailedlogintimeout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Aaaparameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "aaaparameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enablestaticpagecaching");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enablestaticpagecaching"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enableenhancedauthfeedback");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enableenhancedauthfeedback"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultauthtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultauthtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxaaausers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxaaausers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aaadnatip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aaadnatip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxloginattempts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxloginattempts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedlogintimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "failedlogintimeout"));
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
