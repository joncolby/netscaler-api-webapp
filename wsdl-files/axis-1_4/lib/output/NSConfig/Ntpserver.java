/**
 * Ntpserver.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Ntpserver  implements java.io.Serializable {
    private java.lang.String serverip;

    private java.lang.String servername;

    private org.apache.axis.types.UnsignedInt minpoll;

    private org.apache.axis.types.UnsignedInt maxpoll;

    private java.lang.String preferredntpserver;

    private boolean autokey;

    private org.apache.axis.types.UnsignedInt key;

    public Ntpserver() {
    }

    public Ntpserver(
           java.lang.String serverip,
           java.lang.String servername,
           org.apache.axis.types.UnsignedInt minpoll,
           org.apache.axis.types.UnsignedInt maxpoll,
           java.lang.String preferredntpserver,
           boolean autokey,
           org.apache.axis.types.UnsignedInt key) {
           this.serverip = serverip;
           this.servername = servername;
           this.minpoll = minpoll;
           this.maxpoll = maxpoll;
           this.preferredntpserver = preferredntpserver;
           this.autokey = autokey;
           this.key = key;
    }


    /**
     * Gets the serverip value for this Ntpserver.
     * 
     * @return serverip
     */
    public java.lang.String getServerip() {
        return serverip;
    }


    /**
     * Sets the serverip value for this Ntpserver.
     * 
     * @param serverip
     */
    public void setServerip(java.lang.String serverip) {
        this.serverip = serverip;
    }


    /**
     * Gets the servername value for this Ntpserver.
     * 
     * @return servername
     */
    public java.lang.String getServername() {
        return servername;
    }


    /**
     * Sets the servername value for this Ntpserver.
     * 
     * @param servername
     */
    public void setServername(java.lang.String servername) {
        this.servername = servername;
    }


    /**
     * Gets the minpoll value for this Ntpserver.
     * 
     * @return minpoll
     */
    public org.apache.axis.types.UnsignedInt getMinpoll() {
        return minpoll;
    }


    /**
     * Sets the minpoll value for this Ntpserver.
     * 
     * @param minpoll
     */
    public void setMinpoll(org.apache.axis.types.UnsignedInt minpoll) {
        this.minpoll = minpoll;
    }


    /**
     * Gets the maxpoll value for this Ntpserver.
     * 
     * @return maxpoll
     */
    public org.apache.axis.types.UnsignedInt getMaxpoll() {
        return maxpoll;
    }


    /**
     * Sets the maxpoll value for this Ntpserver.
     * 
     * @param maxpoll
     */
    public void setMaxpoll(org.apache.axis.types.UnsignedInt maxpoll) {
        this.maxpoll = maxpoll;
    }


    /**
     * Gets the preferredntpserver value for this Ntpserver.
     * 
     * @return preferredntpserver
     */
    public java.lang.String getPreferredntpserver() {
        return preferredntpserver;
    }


    /**
     * Sets the preferredntpserver value for this Ntpserver.
     * 
     * @param preferredntpserver
     */
    public void setPreferredntpserver(java.lang.String preferredntpserver) {
        this.preferredntpserver = preferredntpserver;
    }


    /**
     * Gets the autokey value for this Ntpserver.
     * 
     * @return autokey
     */
    public boolean isAutokey() {
        return autokey;
    }


    /**
     * Sets the autokey value for this Ntpserver.
     * 
     * @param autokey
     */
    public void setAutokey(boolean autokey) {
        this.autokey = autokey;
    }


    /**
     * Gets the key value for this Ntpserver.
     * 
     * @return key
     */
    public org.apache.axis.types.UnsignedInt getKey() {
        return key;
    }


    /**
     * Sets the key value for this Ntpserver.
     * 
     * @param key
     */
    public void setKey(org.apache.axis.types.UnsignedInt key) {
        this.key = key;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ntpserver)) return false;
        Ntpserver other = (Ntpserver) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serverip==null && other.getServerip()==null) || 
             (this.serverip!=null &&
              this.serverip.equals(other.getServerip()))) &&
            ((this.servername==null && other.getServername()==null) || 
             (this.servername!=null &&
              this.servername.equals(other.getServername()))) &&
            ((this.minpoll==null && other.getMinpoll()==null) || 
             (this.minpoll!=null &&
              this.minpoll.equals(other.getMinpoll()))) &&
            ((this.maxpoll==null && other.getMaxpoll()==null) || 
             (this.maxpoll!=null &&
              this.maxpoll.equals(other.getMaxpoll()))) &&
            ((this.preferredntpserver==null && other.getPreferredntpserver()==null) || 
             (this.preferredntpserver!=null &&
              this.preferredntpserver.equals(other.getPreferredntpserver()))) &&
            this.autokey == other.isAutokey() &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey())));
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
        if (getServerip() != null) {
            _hashCode += getServerip().hashCode();
        }
        if (getServername() != null) {
            _hashCode += getServername().hashCode();
        }
        if (getMinpoll() != null) {
            _hashCode += getMinpoll().hashCode();
        }
        if (getMaxpoll() != null) {
            _hashCode += getMaxpoll().hashCode();
        }
        if (getPreferredntpserver() != null) {
            _hashCode += getPreferredntpserver().hashCode();
        }
        _hashCode += (isAutokey() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ntpserver.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "ntpserver"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minpoll");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minpoll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxpoll");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxpoll"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredntpserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preferredntpserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autokey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autokey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "key"));
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
