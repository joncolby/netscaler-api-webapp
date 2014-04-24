/**
 * Nsappflowparam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nsappflowparam  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt templaterefresh;

    private org.apache.axis.types.UnsignedInt udppmtu;

    private java.lang.String httpurl;

    private java.lang.String httpcookie;

    private java.lang.String httpreferer;

    private java.lang.String httpmethod;

    private java.lang.String httphost;

    private java.lang.String httpuseragent;

    private java.lang.String clienttrafficonly;

    public Nsappflowparam() {
    }

    public Nsappflowparam(
           org.apache.axis.types.UnsignedInt templaterefresh,
           org.apache.axis.types.UnsignedInt udppmtu,
           java.lang.String httpurl,
           java.lang.String httpcookie,
           java.lang.String httpreferer,
           java.lang.String httpmethod,
           java.lang.String httphost,
           java.lang.String httpuseragent,
           java.lang.String clienttrafficonly) {
           this.templaterefresh = templaterefresh;
           this.udppmtu = udppmtu;
           this.httpurl = httpurl;
           this.httpcookie = httpcookie;
           this.httpreferer = httpreferer;
           this.httpmethod = httpmethod;
           this.httphost = httphost;
           this.httpuseragent = httpuseragent;
           this.clienttrafficonly = clienttrafficonly;
    }


    /**
     * Gets the templaterefresh value for this Nsappflowparam.
     * 
     * @return templaterefresh
     */
    public org.apache.axis.types.UnsignedInt getTemplaterefresh() {
        return templaterefresh;
    }


    /**
     * Sets the templaterefresh value for this Nsappflowparam.
     * 
     * @param templaterefresh
     */
    public void setTemplaterefresh(org.apache.axis.types.UnsignedInt templaterefresh) {
        this.templaterefresh = templaterefresh;
    }


    /**
     * Gets the udppmtu value for this Nsappflowparam.
     * 
     * @return udppmtu
     */
    public org.apache.axis.types.UnsignedInt getUdppmtu() {
        return udppmtu;
    }


    /**
     * Sets the udppmtu value for this Nsappflowparam.
     * 
     * @param udppmtu
     */
    public void setUdppmtu(org.apache.axis.types.UnsignedInt udppmtu) {
        this.udppmtu = udppmtu;
    }


    /**
     * Gets the httpurl value for this Nsappflowparam.
     * 
     * @return httpurl
     */
    public java.lang.String getHttpurl() {
        return httpurl;
    }


    /**
     * Sets the httpurl value for this Nsappflowparam.
     * 
     * @param httpurl
     */
    public void setHttpurl(java.lang.String httpurl) {
        this.httpurl = httpurl;
    }


    /**
     * Gets the httpcookie value for this Nsappflowparam.
     * 
     * @return httpcookie
     */
    public java.lang.String getHttpcookie() {
        return httpcookie;
    }


    /**
     * Sets the httpcookie value for this Nsappflowparam.
     * 
     * @param httpcookie
     */
    public void setHttpcookie(java.lang.String httpcookie) {
        this.httpcookie = httpcookie;
    }


    /**
     * Gets the httpreferer value for this Nsappflowparam.
     * 
     * @return httpreferer
     */
    public java.lang.String getHttpreferer() {
        return httpreferer;
    }


    /**
     * Sets the httpreferer value for this Nsappflowparam.
     * 
     * @param httpreferer
     */
    public void setHttpreferer(java.lang.String httpreferer) {
        this.httpreferer = httpreferer;
    }


    /**
     * Gets the httpmethod value for this Nsappflowparam.
     * 
     * @return httpmethod
     */
    public java.lang.String getHttpmethod() {
        return httpmethod;
    }


    /**
     * Sets the httpmethod value for this Nsappflowparam.
     * 
     * @param httpmethod
     */
    public void setHttpmethod(java.lang.String httpmethod) {
        this.httpmethod = httpmethod;
    }


    /**
     * Gets the httphost value for this Nsappflowparam.
     * 
     * @return httphost
     */
    public java.lang.String getHttphost() {
        return httphost;
    }


    /**
     * Sets the httphost value for this Nsappflowparam.
     * 
     * @param httphost
     */
    public void setHttphost(java.lang.String httphost) {
        this.httphost = httphost;
    }


    /**
     * Gets the httpuseragent value for this Nsappflowparam.
     * 
     * @return httpuseragent
     */
    public java.lang.String getHttpuseragent() {
        return httpuseragent;
    }


    /**
     * Sets the httpuseragent value for this Nsappflowparam.
     * 
     * @param httpuseragent
     */
    public void setHttpuseragent(java.lang.String httpuseragent) {
        this.httpuseragent = httpuseragent;
    }


    /**
     * Gets the clienttrafficonly value for this Nsappflowparam.
     * 
     * @return clienttrafficonly
     */
    public java.lang.String getClienttrafficonly() {
        return clienttrafficonly;
    }


    /**
     * Sets the clienttrafficonly value for this Nsappflowparam.
     * 
     * @param clienttrafficonly
     */
    public void setClienttrafficonly(java.lang.String clienttrafficonly) {
        this.clienttrafficonly = clienttrafficonly;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nsappflowparam)) return false;
        Nsappflowparam other = (Nsappflowparam) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.templaterefresh==null && other.getTemplaterefresh()==null) || 
             (this.templaterefresh!=null &&
              this.templaterefresh.equals(other.getTemplaterefresh()))) &&
            ((this.udppmtu==null && other.getUdppmtu()==null) || 
             (this.udppmtu!=null &&
              this.udppmtu.equals(other.getUdppmtu()))) &&
            ((this.httpurl==null && other.getHttpurl()==null) || 
             (this.httpurl!=null &&
              this.httpurl.equals(other.getHttpurl()))) &&
            ((this.httpcookie==null && other.getHttpcookie()==null) || 
             (this.httpcookie!=null &&
              this.httpcookie.equals(other.getHttpcookie()))) &&
            ((this.httpreferer==null && other.getHttpreferer()==null) || 
             (this.httpreferer!=null &&
              this.httpreferer.equals(other.getHttpreferer()))) &&
            ((this.httpmethod==null && other.getHttpmethod()==null) || 
             (this.httpmethod!=null &&
              this.httpmethod.equals(other.getHttpmethod()))) &&
            ((this.httphost==null && other.getHttphost()==null) || 
             (this.httphost!=null &&
              this.httphost.equals(other.getHttphost()))) &&
            ((this.httpuseragent==null && other.getHttpuseragent()==null) || 
             (this.httpuseragent!=null &&
              this.httpuseragent.equals(other.getHttpuseragent()))) &&
            ((this.clienttrafficonly==null && other.getClienttrafficonly()==null) || 
             (this.clienttrafficonly!=null &&
              this.clienttrafficonly.equals(other.getClienttrafficonly())));
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
        if (getTemplaterefresh() != null) {
            _hashCode += getTemplaterefresh().hashCode();
        }
        if (getUdppmtu() != null) {
            _hashCode += getUdppmtu().hashCode();
        }
        if (getHttpurl() != null) {
            _hashCode += getHttpurl().hashCode();
        }
        if (getHttpcookie() != null) {
            _hashCode += getHttpcookie().hashCode();
        }
        if (getHttpreferer() != null) {
            _hashCode += getHttpreferer().hashCode();
        }
        if (getHttpmethod() != null) {
            _hashCode += getHttpmethod().hashCode();
        }
        if (getHttphost() != null) {
            _hashCode += getHttphost().hashCode();
        }
        if (getHttpuseragent() != null) {
            _hashCode += getHttpuseragent().hashCode();
        }
        if (getClienttrafficonly() != null) {
            _hashCode += getClienttrafficonly().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nsappflowparam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nsappflowparam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("templaterefresh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "templaterefresh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("udppmtu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "udppmtu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpurl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpurl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpcookie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpcookie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpreferer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpreferer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpmethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpmethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httphost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httphost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpuseragent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpuseragent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clienttrafficonly");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clienttrafficonly"));
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
