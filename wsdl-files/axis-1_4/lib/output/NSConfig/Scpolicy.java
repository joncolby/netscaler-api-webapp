/**
 * Scpolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Scpolicy  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String url;

    private java.lang.String rule;

    private org.apache.axis.types.UnsignedInt delay;

    private org.apache.axis.types.UnsignedInt maxconn;

    private java.lang.String actioN;

    private java.lang.String altcontentsvcname;

    private java.lang.String altcontentpath;

    public Scpolicy() {
    }

    public Scpolicy(
           java.lang.String name,
           java.lang.String url,
           java.lang.String rule,
           org.apache.axis.types.UnsignedInt delay,
           org.apache.axis.types.UnsignedInt maxconn,
           java.lang.String actioN,
           java.lang.String altcontentsvcname,
           java.lang.String altcontentpath) {
           this.name = name;
           this.url = url;
           this.rule = rule;
           this.delay = delay;
           this.maxconn = maxconn;
           this.actioN = actioN;
           this.altcontentsvcname = altcontentsvcname;
           this.altcontentpath = altcontentpath;
    }


    /**
     * Gets the name value for this Scpolicy.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Scpolicy.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the url value for this Scpolicy.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Scpolicy.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the rule value for this Scpolicy.
     * 
     * @return rule
     */
    public java.lang.String getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this Scpolicy.
     * 
     * @param rule
     */
    public void setRule(java.lang.String rule) {
        this.rule = rule;
    }


    /**
     * Gets the delay value for this Scpolicy.
     * 
     * @return delay
     */
    public org.apache.axis.types.UnsignedInt getDelay() {
        return delay;
    }


    /**
     * Sets the delay value for this Scpolicy.
     * 
     * @param delay
     */
    public void setDelay(org.apache.axis.types.UnsignedInt delay) {
        this.delay = delay;
    }


    /**
     * Gets the maxconn value for this Scpolicy.
     * 
     * @return maxconn
     */
    public org.apache.axis.types.UnsignedInt getMaxconn() {
        return maxconn;
    }


    /**
     * Sets the maxconn value for this Scpolicy.
     * 
     * @param maxconn
     */
    public void setMaxconn(org.apache.axis.types.UnsignedInt maxconn) {
        this.maxconn = maxconn;
    }


    /**
     * Gets the actioN value for this Scpolicy.
     * 
     * @return actioN
     */
    public java.lang.String getActioN() {
        return actioN;
    }


    /**
     * Sets the actioN value for this Scpolicy.
     * 
     * @param actioN
     */
    public void setActioN(java.lang.String actioN) {
        this.actioN = actioN;
    }


    /**
     * Gets the altcontentsvcname value for this Scpolicy.
     * 
     * @return altcontentsvcname
     */
    public java.lang.String getAltcontentsvcname() {
        return altcontentsvcname;
    }


    /**
     * Sets the altcontentsvcname value for this Scpolicy.
     * 
     * @param altcontentsvcname
     */
    public void setAltcontentsvcname(java.lang.String altcontentsvcname) {
        this.altcontentsvcname = altcontentsvcname;
    }


    /**
     * Gets the altcontentpath value for this Scpolicy.
     * 
     * @return altcontentpath
     */
    public java.lang.String getAltcontentpath() {
        return altcontentpath;
    }


    /**
     * Sets the altcontentpath value for this Scpolicy.
     * 
     * @param altcontentpath
     */
    public void setAltcontentpath(java.lang.String altcontentpath) {
        this.altcontentpath = altcontentpath;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Scpolicy)) return false;
        Scpolicy other = (Scpolicy) obj;
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
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              this.rule.equals(other.getRule()))) &&
            ((this.delay==null && other.getDelay()==null) || 
             (this.delay!=null &&
              this.delay.equals(other.getDelay()))) &&
            ((this.maxconn==null && other.getMaxconn()==null) || 
             (this.maxconn!=null &&
              this.maxconn.equals(other.getMaxconn()))) &&
            ((this.actioN==null && other.getActioN()==null) || 
             (this.actioN!=null &&
              this.actioN.equals(other.getActioN()))) &&
            ((this.altcontentsvcname==null && other.getAltcontentsvcname()==null) || 
             (this.altcontentsvcname!=null &&
              this.altcontentsvcname.equals(other.getAltcontentsvcname()))) &&
            ((this.altcontentpath==null && other.getAltcontentpath()==null) || 
             (this.altcontentpath!=null &&
              this.altcontentpath.equals(other.getAltcontentpath())));
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
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getRule() != null) {
            _hashCode += getRule().hashCode();
        }
        if (getDelay() != null) {
            _hashCode += getDelay().hashCode();
        }
        if (getMaxconn() != null) {
            _hashCode += getMaxconn().hashCode();
        }
        if (getActioN() != null) {
            _hashCode += getActioN().hashCode();
        }
        if (getAltcontentsvcname() != null) {
            _hashCode += getAltcontentsvcname().hashCode();
        }
        if (getAltcontentpath() != null) {
            _hashCode += getAltcontentpath().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Scpolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "scpolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxconn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxconn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actioN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actioN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altcontentsvcname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "altcontentsvcname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altcontentpath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "altcontentpath"));
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
