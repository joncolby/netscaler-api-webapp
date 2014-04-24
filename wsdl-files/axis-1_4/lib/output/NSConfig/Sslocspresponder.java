/**
 * Sslocspresponder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Sslocspresponder  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String url;

    private boolean useaia;

    private java.lang.String cache;

    private org.apache.axis.types.UnsignedInt cachetimeout;

    private org.apache.axis.types.UnsignedInt batchingdepth;

    private org.apache.axis.types.UnsignedInt batchingdelay;

    private org.apache.axis.types.UnsignedInt resptimeout;

    private org.apache.axis.types.UnsignedInt producedattimeskew;

    private java.lang.String respondercert;

    private boolean trustresponder;

    private java.lang.String signingcert;

    private java.lang.String usenonce;

    private java.lang.String dns;

    private java.lang.String insertclientcert;

    private java.lang.String ipaddress;

    public Sslocspresponder() {
    }

    public Sslocspresponder(
           java.lang.String name,
           java.lang.String url,
           boolean useaia,
           java.lang.String cache,
           org.apache.axis.types.UnsignedInt cachetimeout,
           org.apache.axis.types.UnsignedInt batchingdepth,
           org.apache.axis.types.UnsignedInt batchingdelay,
           org.apache.axis.types.UnsignedInt resptimeout,
           org.apache.axis.types.UnsignedInt producedattimeskew,
           java.lang.String respondercert,
           boolean trustresponder,
           java.lang.String signingcert,
           java.lang.String usenonce,
           java.lang.String dns,
           java.lang.String insertclientcert,
           java.lang.String ipaddress) {
           this.name = name;
           this.url = url;
           this.useaia = useaia;
           this.cache = cache;
           this.cachetimeout = cachetimeout;
           this.batchingdepth = batchingdepth;
           this.batchingdelay = batchingdelay;
           this.resptimeout = resptimeout;
           this.producedattimeskew = producedattimeskew;
           this.respondercert = respondercert;
           this.trustresponder = trustresponder;
           this.signingcert = signingcert;
           this.usenonce = usenonce;
           this.dns = dns;
           this.insertclientcert = insertclientcert;
           this.ipaddress = ipaddress;
    }


    /**
     * Gets the name value for this Sslocspresponder.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Sslocspresponder.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the url value for this Sslocspresponder.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Sslocspresponder.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the useaia value for this Sslocspresponder.
     * 
     * @return useaia
     */
    public boolean isUseaia() {
        return useaia;
    }


    /**
     * Sets the useaia value for this Sslocspresponder.
     * 
     * @param useaia
     */
    public void setUseaia(boolean useaia) {
        this.useaia = useaia;
    }


    /**
     * Gets the cache value for this Sslocspresponder.
     * 
     * @return cache
     */
    public java.lang.String getCache() {
        return cache;
    }


    /**
     * Sets the cache value for this Sslocspresponder.
     * 
     * @param cache
     */
    public void setCache(java.lang.String cache) {
        this.cache = cache;
    }


    /**
     * Gets the cachetimeout value for this Sslocspresponder.
     * 
     * @return cachetimeout
     */
    public org.apache.axis.types.UnsignedInt getCachetimeout() {
        return cachetimeout;
    }


    /**
     * Sets the cachetimeout value for this Sslocspresponder.
     * 
     * @param cachetimeout
     */
    public void setCachetimeout(org.apache.axis.types.UnsignedInt cachetimeout) {
        this.cachetimeout = cachetimeout;
    }


    /**
     * Gets the batchingdepth value for this Sslocspresponder.
     * 
     * @return batchingdepth
     */
    public org.apache.axis.types.UnsignedInt getBatchingdepth() {
        return batchingdepth;
    }


    /**
     * Sets the batchingdepth value for this Sslocspresponder.
     * 
     * @param batchingdepth
     */
    public void setBatchingdepth(org.apache.axis.types.UnsignedInt batchingdepth) {
        this.batchingdepth = batchingdepth;
    }


    /**
     * Gets the batchingdelay value for this Sslocspresponder.
     * 
     * @return batchingdelay
     */
    public org.apache.axis.types.UnsignedInt getBatchingdelay() {
        return batchingdelay;
    }


    /**
     * Sets the batchingdelay value for this Sslocspresponder.
     * 
     * @param batchingdelay
     */
    public void setBatchingdelay(org.apache.axis.types.UnsignedInt batchingdelay) {
        this.batchingdelay = batchingdelay;
    }


    /**
     * Gets the resptimeout value for this Sslocspresponder.
     * 
     * @return resptimeout
     */
    public org.apache.axis.types.UnsignedInt getResptimeout() {
        return resptimeout;
    }


    /**
     * Sets the resptimeout value for this Sslocspresponder.
     * 
     * @param resptimeout
     */
    public void setResptimeout(org.apache.axis.types.UnsignedInt resptimeout) {
        this.resptimeout = resptimeout;
    }


    /**
     * Gets the producedattimeskew value for this Sslocspresponder.
     * 
     * @return producedattimeskew
     */
    public org.apache.axis.types.UnsignedInt getProducedattimeskew() {
        return producedattimeskew;
    }


    /**
     * Sets the producedattimeskew value for this Sslocspresponder.
     * 
     * @param producedattimeskew
     */
    public void setProducedattimeskew(org.apache.axis.types.UnsignedInt producedattimeskew) {
        this.producedattimeskew = producedattimeskew;
    }


    /**
     * Gets the respondercert value for this Sslocspresponder.
     * 
     * @return respondercert
     */
    public java.lang.String getRespondercert() {
        return respondercert;
    }


    /**
     * Sets the respondercert value for this Sslocspresponder.
     * 
     * @param respondercert
     */
    public void setRespondercert(java.lang.String respondercert) {
        this.respondercert = respondercert;
    }


    /**
     * Gets the trustresponder value for this Sslocspresponder.
     * 
     * @return trustresponder
     */
    public boolean isTrustresponder() {
        return trustresponder;
    }


    /**
     * Sets the trustresponder value for this Sslocspresponder.
     * 
     * @param trustresponder
     */
    public void setTrustresponder(boolean trustresponder) {
        this.trustresponder = trustresponder;
    }


    /**
     * Gets the signingcert value for this Sslocspresponder.
     * 
     * @return signingcert
     */
    public java.lang.String getSigningcert() {
        return signingcert;
    }


    /**
     * Sets the signingcert value for this Sslocspresponder.
     * 
     * @param signingcert
     */
    public void setSigningcert(java.lang.String signingcert) {
        this.signingcert = signingcert;
    }


    /**
     * Gets the usenonce value for this Sslocspresponder.
     * 
     * @return usenonce
     */
    public java.lang.String getUsenonce() {
        return usenonce;
    }


    /**
     * Sets the usenonce value for this Sslocspresponder.
     * 
     * @param usenonce
     */
    public void setUsenonce(java.lang.String usenonce) {
        this.usenonce = usenonce;
    }


    /**
     * Gets the dns value for this Sslocspresponder.
     * 
     * @return dns
     */
    public java.lang.String getDns() {
        return dns;
    }


    /**
     * Sets the dns value for this Sslocspresponder.
     * 
     * @param dns
     */
    public void setDns(java.lang.String dns) {
        this.dns = dns;
    }


    /**
     * Gets the insertclientcert value for this Sslocspresponder.
     * 
     * @return insertclientcert
     */
    public java.lang.String getInsertclientcert() {
        return insertclientcert;
    }


    /**
     * Sets the insertclientcert value for this Sslocspresponder.
     * 
     * @param insertclientcert
     */
    public void setInsertclientcert(java.lang.String insertclientcert) {
        this.insertclientcert = insertclientcert;
    }


    /**
     * Gets the ipaddress value for this Sslocspresponder.
     * 
     * @return ipaddress
     */
    public java.lang.String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Sslocspresponder.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String ipaddress) {
        this.ipaddress = ipaddress;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sslocspresponder)) return false;
        Sslocspresponder other = (Sslocspresponder) obj;
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
            this.useaia == other.isUseaia() &&
            ((this.cache==null && other.getCache()==null) || 
             (this.cache!=null &&
              this.cache.equals(other.getCache()))) &&
            ((this.cachetimeout==null && other.getCachetimeout()==null) || 
             (this.cachetimeout!=null &&
              this.cachetimeout.equals(other.getCachetimeout()))) &&
            ((this.batchingdepth==null && other.getBatchingdepth()==null) || 
             (this.batchingdepth!=null &&
              this.batchingdepth.equals(other.getBatchingdepth()))) &&
            ((this.batchingdelay==null && other.getBatchingdelay()==null) || 
             (this.batchingdelay!=null &&
              this.batchingdelay.equals(other.getBatchingdelay()))) &&
            ((this.resptimeout==null && other.getResptimeout()==null) || 
             (this.resptimeout!=null &&
              this.resptimeout.equals(other.getResptimeout()))) &&
            ((this.producedattimeskew==null && other.getProducedattimeskew()==null) || 
             (this.producedattimeskew!=null &&
              this.producedattimeskew.equals(other.getProducedattimeskew()))) &&
            ((this.respondercert==null && other.getRespondercert()==null) || 
             (this.respondercert!=null &&
              this.respondercert.equals(other.getRespondercert()))) &&
            this.trustresponder == other.isTrustresponder() &&
            ((this.signingcert==null && other.getSigningcert()==null) || 
             (this.signingcert!=null &&
              this.signingcert.equals(other.getSigningcert()))) &&
            ((this.usenonce==null && other.getUsenonce()==null) || 
             (this.usenonce!=null &&
              this.usenonce.equals(other.getUsenonce()))) &&
            ((this.dns==null && other.getDns()==null) || 
             (this.dns!=null &&
              this.dns.equals(other.getDns()))) &&
            ((this.insertclientcert==null && other.getInsertclientcert()==null) || 
             (this.insertclientcert!=null &&
              this.insertclientcert.equals(other.getInsertclientcert()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              this.ipaddress.equals(other.getIpaddress())));
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
        _hashCode += (isUseaia() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCache() != null) {
            _hashCode += getCache().hashCode();
        }
        if (getCachetimeout() != null) {
            _hashCode += getCachetimeout().hashCode();
        }
        if (getBatchingdepth() != null) {
            _hashCode += getBatchingdepth().hashCode();
        }
        if (getBatchingdelay() != null) {
            _hashCode += getBatchingdelay().hashCode();
        }
        if (getResptimeout() != null) {
            _hashCode += getResptimeout().hashCode();
        }
        if (getProducedattimeskew() != null) {
            _hashCode += getProducedattimeskew().hashCode();
        }
        if (getRespondercert() != null) {
            _hashCode += getRespondercert().hashCode();
        }
        _hashCode += (isTrustresponder() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSigningcert() != null) {
            _hashCode += getSigningcert().hashCode();
        }
        if (getUsenonce() != null) {
            _hashCode += getUsenonce().hashCode();
        }
        if (getDns() != null) {
            _hashCode += getDns().hashCode();
        }
        if (getInsertclientcert() != null) {
            _hashCode += getInsertclientcert().hashCode();
        }
        if (getIpaddress() != null) {
            _hashCode += getIpaddress().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sslocspresponder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "sslocspresponder"));
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
        elemField.setFieldName("useaia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useaia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cache");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cache"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachetimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachetimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchingdepth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "batchingdepth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchingdelay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "batchingdelay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resptimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resptimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("producedattimeskew");
        elemField.setXmlName(new javax.xml.namespace.QName("", "producedattimeskew"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respondercert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "respondercert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trustresponder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trustresponder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signingcert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signingcert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usenonce");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usenonce"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dns");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertclientcert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "insertclientcert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipaddress"));
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
