/**
 * Vpnurl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Vpnurl  implements java.io.Serializable {
    private java.lang.String urlname;

    private java.lang.String linkname;

    private java.lang.String actualurl;

    private java.lang.String clientlessaccess;

    private java.lang.String comment;

    public Vpnurl() {
    }

    public Vpnurl(
           java.lang.String urlname,
           java.lang.String linkname,
           java.lang.String actualurl,
           java.lang.String clientlessaccess,
           java.lang.String comment) {
           this.urlname = urlname;
           this.linkname = linkname;
           this.actualurl = actualurl;
           this.clientlessaccess = clientlessaccess;
           this.comment = comment;
    }


    /**
     * Gets the urlname value for this Vpnurl.
     * 
     * @return urlname
     */
    public java.lang.String getUrlname() {
        return urlname;
    }


    /**
     * Sets the urlname value for this Vpnurl.
     * 
     * @param urlname
     */
    public void setUrlname(java.lang.String urlname) {
        this.urlname = urlname;
    }


    /**
     * Gets the linkname value for this Vpnurl.
     * 
     * @return linkname
     */
    public java.lang.String getLinkname() {
        return linkname;
    }


    /**
     * Sets the linkname value for this Vpnurl.
     * 
     * @param linkname
     */
    public void setLinkname(java.lang.String linkname) {
        this.linkname = linkname;
    }


    /**
     * Gets the actualurl value for this Vpnurl.
     * 
     * @return actualurl
     */
    public java.lang.String getActualurl() {
        return actualurl;
    }


    /**
     * Sets the actualurl value for this Vpnurl.
     * 
     * @param actualurl
     */
    public void setActualurl(java.lang.String actualurl) {
        this.actualurl = actualurl;
    }


    /**
     * Gets the clientlessaccess value for this Vpnurl.
     * 
     * @return clientlessaccess
     */
    public java.lang.String getClientlessaccess() {
        return clientlessaccess;
    }


    /**
     * Sets the clientlessaccess value for this Vpnurl.
     * 
     * @param clientlessaccess
     */
    public void setClientlessaccess(java.lang.String clientlessaccess) {
        this.clientlessaccess = clientlessaccess;
    }


    /**
     * Gets the comment value for this Vpnurl.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Vpnurl.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Vpnurl)) return false;
        Vpnurl other = (Vpnurl) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.urlname==null && other.getUrlname()==null) || 
             (this.urlname!=null &&
              this.urlname.equals(other.getUrlname()))) &&
            ((this.linkname==null && other.getLinkname()==null) || 
             (this.linkname!=null &&
              this.linkname.equals(other.getLinkname()))) &&
            ((this.actualurl==null && other.getActualurl()==null) || 
             (this.actualurl!=null &&
              this.actualurl.equals(other.getActualurl()))) &&
            ((this.clientlessaccess==null && other.getClientlessaccess()==null) || 
             (this.clientlessaccess!=null &&
              this.clientlessaccess.equals(other.getClientlessaccess()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment())));
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
        if (getUrlname() != null) {
            _hashCode += getUrlname().hashCode();
        }
        if (getLinkname() != null) {
            _hashCode += getLinkname().hashCode();
        }
        if (getActualurl() != null) {
            _hashCode += getActualurl().hashCode();
        }
        if (getClientlessaccess() != null) {
            _hashCode += getClientlessaccess().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Vpnurl.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "vpnurl"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urlname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualurl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actualurl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientlessaccess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientlessaccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
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
