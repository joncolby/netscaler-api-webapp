/**
 * Snmptrap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Snmptrap  implements java.io.Serializable {
    private java.lang.String trapclass;

    private java.lang.String trapdestination;

    private org.apache.axis.types.UnsignedInt destport;

    private java.lang.String version;

    private java.lang.String communityname;

    private java.lang.String srcip;

    private java.lang.String severity;

    public Snmptrap() {
    }

    public Snmptrap(
           java.lang.String trapclass,
           java.lang.String trapdestination,
           org.apache.axis.types.UnsignedInt destport,
           java.lang.String version,
           java.lang.String communityname,
           java.lang.String srcip,
           java.lang.String severity) {
           this.trapclass = trapclass;
           this.trapdestination = trapdestination;
           this.destport = destport;
           this.version = version;
           this.communityname = communityname;
           this.srcip = srcip;
           this.severity = severity;
    }


    /**
     * Gets the trapclass value for this Snmptrap.
     * 
     * @return trapclass
     */
    public java.lang.String getTrapclass() {
        return trapclass;
    }


    /**
     * Sets the trapclass value for this Snmptrap.
     * 
     * @param trapclass
     */
    public void setTrapclass(java.lang.String trapclass) {
        this.trapclass = trapclass;
    }


    /**
     * Gets the trapdestination value for this Snmptrap.
     * 
     * @return trapdestination
     */
    public java.lang.String getTrapdestination() {
        return trapdestination;
    }


    /**
     * Sets the trapdestination value for this Snmptrap.
     * 
     * @param trapdestination
     */
    public void setTrapdestination(java.lang.String trapdestination) {
        this.trapdestination = trapdestination;
    }


    /**
     * Gets the destport value for this Snmptrap.
     * 
     * @return destport
     */
    public org.apache.axis.types.UnsignedInt getDestport() {
        return destport;
    }


    /**
     * Sets the destport value for this Snmptrap.
     * 
     * @param destport
     */
    public void setDestport(org.apache.axis.types.UnsignedInt destport) {
        this.destport = destport;
    }


    /**
     * Gets the version value for this Snmptrap.
     * 
     * @return version
     */
    public java.lang.String getVersion() {
        return version;
    }


    /**
     * Sets the version value for this Snmptrap.
     * 
     * @param version
     */
    public void setVersion(java.lang.String version) {
        this.version = version;
    }


    /**
     * Gets the communityname value for this Snmptrap.
     * 
     * @return communityname
     */
    public java.lang.String getCommunityname() {
        return communityname;
    }


    /**
     * Sets the communityname value for this Snmptrap.
     * 
     * @param communityname
     */
    public void setCommunityname(java.lang.String communityname) {
        this.communityname = communityname;
    }


    /**
     * Gets the srcip value for this Snmptrap.
     * 
     * @return srcip
     */
    public java.lang.String getSrcip() {
        return srcip;
    }


    /**
     * Sets the srcip value for this Snmptrap.
     * 
     * @param srcip
     */
    public void setSrcip(java.lang.String srcip) {
        this.srcip = srcip;
    }


    /**
     * Gets the severity value for this Snmptrap.
     * 
     * @return severity
     */
    public java.lang.String getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this Snmptrap.
     * 
     * @param severity
     */
    public void setSeverity(java.lang.String severity) {
        this.severity = severity;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Snmptrap)) return false;
        Snmptrap other = (Snmptrap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.trapclass==null && other.getTrapclass()==null) || 
             (this.trapclass!=null &&
              this.trapclass.equals(other.getTrapclass()))) &&
            ((this.trapdestination==null && other.getTrapdestination()==null) || 
             (this.trapdestination!=null &&
              this.trapdestination.equals(other.getTrapdestination()))) &&
            ((this.destport==null && other.getDestport()==null) || 
             (this.destport!=null &&
              this.destport.equals(other.getDestport()))) &&
            ((this.version==null && other.getVersion()==null) || 
             (this.version!=null &&
              this.version.equals(other.getVersion()))) &&
            ((this.communityname==null && other.getCommunityname()==null) || 
             (this.communityname!=null &&
              this.communityname.equals(other.getCommunityname()))) &&
            ((this.srcip==null && other.getSrcip()==null) || 
             (this.srcip!=null &&
              this.srcip.equals(other.getSrcip()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity())));
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
        if (getTrapclass() != null) {
            _hashCode += getTrapclass().hashCode();
        }
        if (getTrapdestination() != null) {
            _hashCode += getTrapdestination().hashCode();
        }
        if (getDestport() != null) {
            _hashCode += getDestport().hashCode();
        }
        if (getVersion() != null) {
            _hashCode += getVersion().hashCode();
        }
        if (getCommunityname() != null) {
            _hashCode += getCommunityname().hashCode();
        }
        if (getSrcip() != null) {
            _hashCode += getSrcip().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Snmptrap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "snmptrap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trapclass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trapclass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trapdestination");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trapdestination"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communityname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "communityname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srcip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "severity"));
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
