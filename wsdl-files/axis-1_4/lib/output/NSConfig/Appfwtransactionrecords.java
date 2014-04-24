/**
 * Appfwtransactionrecords.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Appfwtransactionrecords  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt httptransactionid;

    private int packetengineid;

    private java.lang.String appfwsessionid;

    private java.lang.String profilename;

    private java.lang.String url;

    private java.lang.String clientip;

    private java.lang.String destip;

    private java.lang.String starttime;

    private java.lang.String endtime;

    private int requestcontentlength;

    private org.apache.axis.types.UnsignedInt requestyields;

    private org.apache.axis.types.UnsignedInt requestmaxprocessingtime;

    private int responsecontentlength;

    private org.apache.axis.types.UnsignedInt responseyields;

    private org.apache.axis.types.UnsignedInt responsemaxprocessingtime;

    public Appfwtransactionrecords() {
    }

    public Appfwtransactionrecords(
           org.apache.axis.types.UnsignedInt httptransactionid,
           int packetengineid,
           java.lang.String appfwsessionid,
           java.lang.String profilename,
           java.lang.String url,
           java.lang.String clientip,
           java.lang.String destip,
           java.lang.String starttime,
           java.lang.String endtime,
           int requestcontentlength,
           org.apache.axis.types.UnsignedInt requestyields,
           org.apache.axis.types.UnsignedInt requestmaxprocessingtime,
           int responsecontentlength,
           org.apache.axis.types.UnsignedInt responseyields,
           org.apache.axis.types.UnsignedInt responsemaxprocessingtime) {
           this.httptransactionid = httptransactionid;
           this.packetengineid = packetengineid;
           this.appfwsessionid = appfwsessionid;
           this.profilename = profilename;
           this.url = url;
           this.clientip = clientip;
           this.destip = destip;
           this.starttime = starttime;
           this.endtime = endtime;
           this.requestcontentlength = requestcontentlength;
           this.requestyields = requestyields;
           this.requestmaxprocessingtime = requestmaxprocessingtime;
           this.responsecontentlength = responsecontentlength;
           this.responseyields = responseyields;
           this.responsemaxprocessingtime = responsemaxprocessingtime;
    }


    /**
     * Gets the httptransactionid value for this Appfwtransactionrecords.
     * 
     * @return httptransactionid
     */
    public org.apache.axis.types.UnsignedInt getHttptransactionid() {
        return httptransactionid;
    }


    /**
     * Sets the httptransactionid value for this Appfwtransactionrecords.
     * 
     * @param httptransactionid
     */
    public void setHttptransactionid(org.apache.axis.types.UnsignedInt httptransactionid) {
        this.httptransactionid = httptransactionid;
    }


    /**
     * Gets the packetengineid value for this Appfwtransactionrecords.
     * 
     * @return packetengineid
     */
    public int getPacketengineid() {
        return packetengineid;
    }


    /**
     * Sets the packetengineid value for this Appfwtransactionrecords.
     * 
     * @param packetengineid
     */
    public void setPacketengineid(int packetengineid) {
        this.packetengineid = packetengineid;
    }


    /**
     * Gets the appfwsessionid value for this Appfwtransactionrecords.
     * 
     * @return appfwsessionid
     */
    public java.lang.String getAppfwsessionid() {
        return appfwsessionid;
    }


    /**
     * Sets the appfwsessionid value for this Appfwtransactionrecords.
     * 
     * @param appfwsessionid
     */
    public void setAppfwsessionid(java.lang.String appfwsessionid) {
        this.appfwsessionid = appfwsessionid;
    }


    /**
     * Gets the profilename value for this Appfwtransactionrecords.
     * 
     * @return profilename
     */
    public java.lang.String getProfilename() {
        return profilename;
    }


    /**
     * Sets the profilename value for this Appfwtransactionrecords.
     * 
     * @param profilename
     */
    public void setProfilename(java.lang.String profilename) {
        this.profilename = profilename;
    }


    /**
     * Gets the url value for this Appfwtransactionrecords.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Appfwtransactionrecords.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the clientip value for this Appfwtransactionrecords.
     * 
     * @return clientip
     */
    public java.lang.String getClientip() {
        return clientip;
    }


    /**
     * Sets the clientip value for this Appfwtransactionrecords.
     * 
     * @param clientip
     */
    public void setClientip(java.lang.String clientip) {
        this.clientip = clientip;
    }


    /**
     * Gets the destip value for this Appfwtransactionrecords.
     * 
     * @return destip
     */
    public java.lang.String getDestip() {
        return destip;
    }


    /**
     * Sets the destip value for this Appfwtransactionrecords.
     * 
     * @param destip
     */
    public void setDestip(java.lang.String destip) {
        this.destip = destip;
    }


    /**
     * Gets the starttime value for this Appfwtransactionrecords.
     * 
     * @return starttime
     */
    public java.lang.String getStarttime() {
        return starttime;
    }


    /**
     * Sets the starttime value for this Appfwtransactionrecords.
     * 
     * @param starttime
     */
    public void setStarttime(java.lang.String starttime) {
        this.starttime = starttime;
    }


    /**
     * Gets the endtime value for this Appfwtransactionrecords.
     * 
     * @return endtime
     */
    public java.lang.String getEndtime() {
        return endtime;
    }


    /**
     * Sets the endtime value for this Appfwtransactionrecords.
     * 
     * @param endtime
     */
    public void setEndtime(java.lang.String endtime) {
        this.endtime = endtime;
    }


    /**
     * Gets the requestcontentlength value for this Appfwtransactionrecords.
     * 
     * @return requestcontentlength
     */
    public int getRequestcontentlength() {
        return requestcontentlength;
    }


    /**
     * Sets the requestcontentlength value for this Appfwtransactionrecords.
     * 
     * @param requestcontentlength
     */
    public void setRequestcontentlength(int requestcontentlength) {
        this.requestcontentlength = requestcontentlength;
    }


    /**
     * Gets the requestyields value for this Appfwtransactionrecords.
     * 
     * @return requestyields
     */
    public org.apache.axis.types.UnsignedInt getRequestyields() {
        return requestyields;
    }


    /**
     * Sets the requestyields value for this Appfwtransactionrecords.
     * 
     * @param requestyields
     */
    public void setRequestyields(org.apache.axis.types.UnsignedInt requestyields) {
        this.requestyields = requestyields;
    }


    /**
     * Gets the requestmaxprocessingtime value for this Appfwtransactionrecords.
     * 
     * @return requestmaxprocessingtime
     */
    public org.apache.axis.types.UnsignedInt getRequestmaxprocessingtime() {
        return requestmaxprocessingtime;
    }


    /**
     * Sets the requestmaxprocessingtime value for this Appfwtransactionrecords.
     * 
     * @param requestmaxprocessingtime
     */
    public void setRequestmaxprocessingtime(org.apache.axis.types.UnsignedInt requestmaxprocessingtime) {
        this.requestmaxprocessingtime = requestmaxprocessingtime;
    }


    /**
     * Gets the responsecontentlength value for this Appfwtransactionrecords.
     * 
     * @return responsecontentlength
     */
    public int getResponsecontentlength() {
        return responsecontentlength;
    }


    /**
     * Sets the responsecontentlength value for this Appfwtransactionrecords.
     * 
     * @param responsecontentlength
     */
    public void setResponsecontentlength(int responsecontentlength) {
        this.responsecontentlength = responsecontentlength;
    }


    /**
     * Gets the responseyields value for this Appfwtransactionrecords.
     * 
     * @return responseyields
     */
    public org.apache.axis.types.UnsignedInt getResponseyields() {
        return responseyields;
    }


    /**
     * Sets the responseyields value for this Appfwtransactionrecords.
     * 
     * @param responseyields
     */
    public void setResponseyields(org.apache.axis.types.UnsignedInt responseyields) {
        this.responseyields = responseyields;
    }


    /**
     * Gets the responsemaxprocessingtime value for this Appfwtransactionrecords.
     * 
     * @return responsemaxprocessingtime
     */
    public org.apache.axis.types.UnsignedInt getResponsemaxprocessingtime() {
        return responsemaxprocessingtime;
    }


    /**
     * Sets the responsemaxprocessingtime value for this Appfwtransactionrecords.
     * 
     * @param responsemaxprocessingtime
     */
    public void setResponsemaxprocessingtime(org.apache.axis.types.UnsignedInt responsemaxprocessingtime) {
        this.responsemaxprocessingtime = responsemaxprocessingtime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Appfwtransactionrecords)) return false;
        Appfwtransactionrecords other = (Appfwtransactionrecords) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.httptransactionid==null && other.getHttptransactionid()==null) || 
             (this.httptransactionid!=null &&
              this.httptransactionid.equals(other.getHttptransactionid()))) &&
            this.packetengineid == other.getPacketengineid() &&
            ((this.appfwsessionid==null && other.getAppfwsessionid()==null) || 
             (this.appfwsessionid!=null &&
              this.appfwsessionid.equals(other.getAppfwsessionid()))) &&
            ((this.profilename==null && other.getProfilename()==null) || 
             (this.profilename!=null &&
              this.profilename.equals(other.getProfilename()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.clientip==null && other.getClientip()==null) || 
             (this.clientip!=null &&
              this.clientip.equals(other.getClientip()))) &&
            ((this.destip==null && other.getDestip()==null) || 
             (this.destip!=null &&
              this.destip.equals(other.getDestip()))) &&
            ((this.starttime==null && other.getStarttime()==null) || 
             (this.starttime!=null &&
              this.starttime.equals(other.getStarttime()))) &&
            ((this.endtime==null && other.getEndtime()==null) || 
             (this.endtime!=null &&
              this.endtime.equals(other.getEndtime()))) &&
            this.requestcontentlength == other.getRequestcontentlength() &&
            ((this.requestyields==null && other.getRequestyields()==null) || 
             (this.requestyields!=null &&
              this.requestyields.equals(other.getRequestyields()))) &&
            ((this.requestmaxprocessingtime==null && other.getRequestmaxprocessingtime()==null) || 
             (this.requestmaxprocessingtime!=null &&
              this.requestmaxprocessingtime.equals(other.getRequestmaxprocessingtime()))) &&
            this.responsecontentlength == other.getResponsecontentlength() &&
            ((this.responseyields==null && other.getResponseyields()==null) || 
             (this.responseyields!=null &&
              this.responseyields.equals(other.getResponseyields()))) &&
            ((this.responsemaxprocessingtime==null && other.getResponsemaxprocessingtime()==null) || 
             (this.responsemaxprocessingtime!=null &&
              this.responsemaxprocessingtime.equals(other.getResponsemaxprocessingtime())));
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
        if (getHttptransactionid() != null) {
            _hashCode += getHttptransactionid().hashCode();
        }
        _hashCode += getPacketengineid();
        if (getAppfwsessionid() != null) {
            _hashCode += getAppfwsessionid().hashCode();
        }
        if (getProfilename() != null) {
            _hashCode += getProfilename().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getClientip() != null) {
            _hashCode += getClientip().hashCode();
        }
        if (getDestip() != null) {
            _hashCode += getDestip().hashCode();
        }
        if (getStarttime() != null) {
            _hashCode += getStarttime().hashCode();
        }
        if (getEndtime() != null) {
            _hashCode += getEndtime().hashCode();
        }
        _hashCode += getRequestcontentlength();
        if (getRequestyields() != null) {
            _hashCode += getRequestyields().hashCode();
        }
        if (getRequestmaxprocessingtime() != null) {
            _hashCode += getRequestmaxprocessingtime().hashCode();
        }
        _hashCode += getResponsecontentlength();
        if (getResponseyields() != null) {
            _hashCode += getResponseyields().hashCode();
        }
        if (getResponsemaxprocessingtime() != null) {
            _hashCode += getResponsemaxprocessingtime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Appfwtransactionrecords.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "appfwtransactionrecords"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httptransactionid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httptransactionid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("packetengineid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "packetengineid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appfwsessionid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appfwsessionid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profilename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profilename"));
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
        elemField.setFieldName("clientip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("starttime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "starttime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endtime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestcontentlength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestcontentlength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestyields");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestyields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestmaxprocessingtime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requestmaxprocessingtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsecontentlength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responsecontentlength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseyields");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responseyields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsemaxprocessingtime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "responsemaxprocessingtime"));
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
