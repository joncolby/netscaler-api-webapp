/**
 * Policyhttpcallout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Policyhttpcallout  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String ipaddress;

    private org.apache.axis.types.UnsignedInt port;

    private java.lang.String vserver;

    private java.lang.String returntype;

    private java.lang.String scheme;

    private java.lang.String httpmethod;

    private java.lang.String hostexpr;

    private java.lang.String urlstemexpr;

    private java.lang.String[] headers;

    private java.lang.String[] parameters;

    private java.lang.String fullreqexpr;

    private java.lang.String resultexpr;

    private org.apache.axis.types.UnsignedLong hits;

    private org.apache.axis.types.UnsignedLong undefhits;

    private java.lang.String svrstate;

    private java.lang.String undefreason;

    private org.apache.axis.types.UnsignedLong recursivecallout;

    private java.lang.String bodyexpr;

    private org.apache.axis.types.UnsignedInt cacheforsecs;

    public Policyhttpcallout() {
    }

    public Policyhttpcallout(
           java.lang.String name,
           java.lang.String ipaddress,
           org.apache.axis.types.UnsignedInt port,
           java.lang.String vserver,
           java.lang.String returntype,
           java.lang.String scheme,
           java.lang.String httpmethod,
           java.lang.String hostexpr,
           java.lang.String urlstemexpr,
           java.lang.String[] headers,
           java.lang.String[] parameters,
           java.lang.String fullreqexpr,
           java.lang.String resultexpr,
           org.apache.axis.types.UnsignedLong hits,
           org.apache.axis.types.UnsignedLong undefhits,
           java.lang.String svrstate,
           java.lang.String undefreason,
           org.apache.axis.types.UnsignedLong recursivecallout,
           java.lang.String bodyexpr,
           org.apache.axis.types.UnsignedInt cacheforsecs) {
           this.name = name;
           this.ipaddress = ipaddress;
           this.port = port;
           this.vserver = vserver;
           this.returntype = returntype;
           this.scheme = scheme;
           this.httpmethod = httpmethod;
           this.hostexpr = hostexpr;
           this.urlstemexpr = urlstemexpr;
           this.headers = headers;
           this.parameters = parameters;
           this.fullreqexpr = fullreqexpr;
           this.resultexpr = resultexpr;
           this.hits = hits;
           this.undefhits = undefhits;
           this.svrstate = svrstate;
           this.undefreason = undefreason;
           this.recursivecallout = recursivecallout;
           this.bodyexpr = bodyexpr;
           this.cacheforsecs = cacheforsecs;
    }


    /**
     * Gets the name value for this Policyhttpcallout.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Policyhttpcallout.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the ipaddress value for this Policyhttpcallout.
     * 
     * @return ipaddress
     */
    public java.lang.String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Policyhttpcallout.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the port value for this Policyhttpcallout.
     * 
     * @return port
     */
    public org.apache.axis.types.UnsignedInt getPort() {
        return port;
    }


    /**
     * Sets the port value for this Policyhttpcallout.
     * 
     * @param port
     */
    public void setPort(org.apache.axis.types.UnsignedInt port) {
        this.port = port;
    }


    /**
     * Gets the vserver value for this Policyhttpcallout.
     * 
     * @return vserver
     */
    public java.lang.String getVserver() {
        return vserver;
    }


    /**
     * Sets the vserver value for this Policyhttpcallout.
     * 
     * @param vserver
     */
    public void setVserver(java.lang.String vserver) {
        this.vserver = vserver;
    }


    /**
     * Gets the returntype value for this Policyhttpcallout.
     * 
     * @return returntype
     */
    public java.lang.String getReturntype() {
        return returntype;
    }


    /**
     * Sets the returntype value for this Policyhttpcallout.
     * 
     * @param returntype
     */
    public void setReturntype(java.lang.String returntype) {
        this.returntype = returntype;
    }


    /**
     * Gets the scheme value for this Policyhttpcallout.
     * 
     * @return scheme
     */
    public java.lang.String getScheme() {
        return scheme;
    }


    /**
     * Sets the scheme value for this Policyhttpcallout.
     * 
     * @param scheme
     */
    public void setScheme(java.lang.String scheme) {
        this.scheme = scheme;
    }


    /**
     * Gets the httpmethod value for this Policyhttpcallout.
     * 
     * @return httpmethod
     */
    public java.lang.String getHttpmethod() {
        return httpmethod;
    }


    /**
     * Sets the httpmethod value for this Policyhttpcallout.
     * 
     * @param httpmethod
     */
    public void setHttpmethod(java.lang.String httpmethod) {
        this.httpmethod = httpmethod;
    }


    /**
     * Gets the hostexpr value for this Policyhttpcallout.
     * 
     * @return hostexpr
     */
    public java.lang.String getHostexpr() {
        return hostexpr;
    }


    /**
     * Sets the hostexpr value for this Policyhttpcallout.
     * 
     * @param hostexpr
     */
    public void setHostexpr(java.lang.String hostexpr) {
        this.hostexpr = hostexpr;
    }


    /**
     * Gets the urlstemexpr value for this Policyhttpcallout.
     * 
     * @return urlstemexpr
     */
    public java.lang.String getUrlstemexpr() {
        return urlstemexpr;
    }


    /**
     * Sets the urlstemexpr value for this Policyhttpcallout.
     * 
     * @param urlstemexpr
     */
    public void setUrlstemexpr(java.lang.String urlstemexpr) {
        this.urlstemexpr = urlstemexpr;
    }


    /**
     * Gets the headers value for this Policyhttpcallout.
     * 
     * @return headers
     */
    public java.lang.String[] getHeaders() {
        return headers;
    }


    /**
     * Sets the headers value for this Policyhttpcallout.
     * 
     * @param headers
     */
    public void setHeaders(java.lang.String[] headers) {
        this.headers = headers;
    }


    /**
     * Gets the parameters value for this Policyhttpcallout.
     * 
     * @return parameters
     */
    public java.lang.String[] getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this Policyhttpcallout.
     * 
     * @param parameters
     */
    public void setParameters(java.lang.String[] parameters) {
        this.parameters = parameters;
    }


    /**
     * Gets the fullreqexpr value for this Policyhttpcallout.
     * 
     * @return fullreqexpr
     */
    public java.lang.String getFullreqexpr() {
        return fullreqexpr;
    }


    /**
     * Sets the fullreqexpr value for this Policyhttpcallout.
     * 
     * @param fullreqexpr
     */
    public void setFullreqexpr(java.lang.String fullreqexpr) {
        this.fullreqexpr = fullreqexpr;
    }


    /**
     * Gets the resultexpr value for this Policyhttpcallout.
     * 
     * @return resultexpr
     */
    public java.lang.String getResultexpr() {
        return resultexpr;
    }


    /**
     * Sets the resultexpr value for this Policyhttpcallout.
     * 
     * @param resultexpr
     */
    public void setResultexpr(java.lang.String resultexpr) {
        this.resultexpr = resultexpr;
    }


    /**
     * Gets the hits value for this Policyhttpcallout.
     * 
     * @return hits
     */
    public org.apache.axis.types.UnsignedLong getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this Policyhttpcallout.
     * 
     * @param hits
     */
    public void setHits(org.apache.axis.types.UnsignedLong hits) {
        this.hits = hits;
    }


    /**
     * Gets the undefhits value for this Policyhttpcallout.
     * 
     * @return undefhits
     */
    public org.apache.axis.types.UnsignedLong getUndefhits() {
        return undefhits;
    }


    /**
     * Sets the undefhits value for this Policyhttpcallout.
     * 
     * @param undefhits
     */
    public void setUndefhits(org.apache.axis.types.UnsignedLong undefhits) {
        this.undefhits = undefhits;
    }


    /**
     * Gets the svrstate value for this Policyhttpcallout.
     * 
     * @return svrstate
     */
    public java.lang.String getSvrstate() {
        return svrstate;
    }


    /**
     * Sets the svrstate value for this Policyhttpcallout.
     * 
     * @param svrstate
     */
    public void setSvrstate(java.lang.String svrstate) {
        this.svrstate = svrstate;
    }


    /**
     * Gets the undefreason value for this Policyhttpcallout.
     * 
     * @return undefreason
     */
    public java.lang.String getUndefreason() {
        return undefreason;
    }


    /**
     * Sets the undefreason value for this Policyhttpcallout.
     * 
     * @param undefreason
     */
    public void setUndefreason(java.lang.String undefreason) {
        this.undefreason = undefreason;
    }


    /**
     * Gets the recursivecallout value for this Policyhttpcallout.
     * 
     * @return recursivecallout
     */
    public org.apache.axis.types.UnsignedLong getRecursivecallout() {
        return recursivecallout;
    }


    /**
     * Sets the recursivecallout value for this Policyhttpcallout.
     * 
     * @param recursivecallout
     */
    public void setRecursivecallout(org.apache.axis.types.UnsignedLong recursivecallout) {
        this.recursivecallout = recursivecallout;
    }


    /**
     * Gets the bodyexpr value for this Policyhttpcallout.
     * 
     * @return bodyexpr
     */
    public java.lang.String getBodyexpr() {
        return bodyexpr;
    }


    /**
     * Sets the bodyexpr value for this Policyhttpcallout.
     * 
     * @param bodyexpr
     */
    public void setBodyexpr(java.lang.String bodyexpr) {
        this.bodyexpr = bodyexpr;
    }


    /**
     * Gets the cacheforsecs value for this Policyhttpcallout.
     * 
     * @return cacheforsecs
     */
    public org.apache.axis.types.UnsignedInt getCacheforsecs() {
        return cacheforsecs;
    }


    /**
     * Sets the cacheforsecs value for this Policyhttpcallout.
     * 
     * @param cacheforsecs
     */
    public void setCacheforsecs(org.apache.axis.types.UnsignedInt cacheforsecs) {
        this.cacheforsecs = cacheforsecs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Policyhttpcallout)) return false;
        Policyhttpcallout other = (Policyhttpcallout) obj;
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
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              this.ipaddress.equals(other.getIpaddress()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.vserver==null && other.getVserver()==null) || 
             (this.vserver!=null &&
              this.vserver.equals(other.getVserver()))) &&
            ((this.returntype==null && other.getReturntype()==null) || 
             (this.returntype!=null &&
              this.returntype.equals(other.getReturntype()))) &&
            ((this.scheme==null && other.getScheme()==null) || 
             (this.scheme!=null &&
              this.scheme.equals(other.getScheme()))) &&
            ((this.httpmethod==null && other.getHttpmethod()==null) || 
             (this.httpmethod!=null &&
              this.httpmethod.equals(other.getHttpmethod()))) &&
            ((this.hostexpr==null && other.getHostexpr()==null) || 
             (this.hostexpr!=null &&
              this.hostexpr.equals(other.getHostexpr()))) &&
            ((this.urlstemexpr==null && other.getUrlstemexpr()==null) || 
             (this.urlstemexpr!=null &&
              this.urlstemexpr.equals(other.getUrlstemexpr()))) &&
            ((this.headers==null && other.getHeaders()==null) || 
             (this.headers!=null &&
              java.util.Arrays.equals(this.headers, other.getHeaders()))) &&
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              java.util.Arrays.equals(this.parameters, other.getParameters()))) &&
            ((this.fullreqexpr==null && other.getFullreqexpr()==null) || 
             (this.fullreqexpr!=null &&
              this.fullreqexpr.equals(other.getFullreqexpr()))) &&
            ((this.resultexpr==null && other.getResultexpr()==null) || 
             (this.resultexpr!=null &&
              this.resultexpr.equals(other.getResultexpr()))) &&
            ((this.hits==null && other.getHits()==null) || 
             (this.hits!=null &&
              this.hits.equals(other.getHits()))) &&
            ((this.undefhits==null && other.getUndefhits()==null) || 
             (this.undefhits!=null &&
              this.undefhits.equals(other.getUndefhits()))) &&
            ((this.svrstate==null && other.getSvrstate()==null) || 
             (this.svrstate!=null &&
              this.svrstate.equals(other.getSvrstate()))) &&
            ((this.undefreason==null && other.getUndefreason()==null) || 
             (this.undefreason!=null &&
              this.undefreason.equals(other.getUndefreason()))) &&
            ((this.recursivecallout==null && other.getRecursivecallout()==null) || 
             (this.recursivecallout!=null &&
              this.recursivecallout.equals(other.getRecursivecallout()))) &&
            ((this.bodyexpr==null && other.getBodyexpr()==null) || 
             (this.bodyexpr!=null &&
              this.bodyexpr.equals(other.getBodyexpr()))) &&
            ((this.cacheforsecs==null && other.getCacheforsecs()==null) || 
             (this.cacheforsecs!=null &&
              this.cacheforsecs.equals(other.getCacheforsecs())));
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
        if (getIpaddress() != null) {
            _hashCode += getIpaddress().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getVserver() != null) {
            _hashCode += getVserver().hashCode();
        }
        if (getReturntype() != null) {
            _hashCode += getReturntype().hashCode();
        }
        if (getScheme() != null) {
            _hashCode += getScheme().hashCode();
        }
        if (getHttpmethod() != null) {
            _hashCode += getHttpmethod().hashCode();
        }
        if (getHostexpr() != null) {
            _hashCode += getHostexpr().hashCode();
        }
        if (getUrlstemexpr() != null) {
            _hashCode += getUrlstemexpr().hashCode();
        }
        if (getHeaders() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHeaders());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHeaders(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getParameters() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getParameters());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getParameters(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFullreqexpr() != null) {
            _hashCode += getFullreqexpr().hashCode();
        }
        if (getResultexpr() != null) {
            _hashCode += getResultexpr().hashCode();
        }
        if (getHits() != null) {
            _hashCode += getHits().hashCode();
        }
        if (getUndefhits() != null) {
            _hashCode += getUndefhits().hashCode();
        }
        if (getSvrstate() != null) {
            _hashCode += getSvrstate().hashCode();
        }
        if (getUndefreason() != null) {
            _hashCode += getUndefreason().hashCode();
        }
        if (getRecursivecallout() != null) {
            _hashCode += getRecursivecallout().hashCode();
        }
        if (getBodyexpr() != null) {
            _hashCode += getBodyexpr().hashCode();
        }
        if (getCacheforsecs() != null) {
            _hashCode += getCacheforsecs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Policyhttpcallout.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "policyhttpcallout"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipaddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returntype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returntype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheme");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheme"));
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
        elemField.setFieldName("hostexpr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostexpr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlstemexpr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urlstemexpr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "headers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullreqexpr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullreqexpr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultexpr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultexpr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undefhits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "undefhits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svrstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svrstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undefreason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "undefreason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recursivecallout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recursivecallout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bodyexpr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bodyexpr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheforsecs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cacheforsecs"));
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
