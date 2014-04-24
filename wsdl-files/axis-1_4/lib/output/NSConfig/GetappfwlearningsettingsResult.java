/**
 * GetappfwlearningsettingsResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class GetappfwlearningsettingsResult  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt rc;

    private java.lang.String message;

    private NSConfig.Appfwlearningsettings[] list;

    public GetappfwlearningsettingsResult() {
    }

    public GetappfwlearningsettingsResult(
           org.apache.axis.types.UnsignedInt rc,
           java.lang.String message,
           NSConfig.Appfwlearningsettings[] list) {
           this.rc = rc;
           this.message = message;
           this.list = list;
    }


    /**
     * Gets the rc value for this GetappfwlearningsettingsResult.
     * 
     * @return rc
     */
    public org.apache.axis.types.UnsignedInt getRc() {
        return rc;
    }


    /**
     * Sets the rc value for this GetappfwlearningsettingsResult.
     * 
     * @param rc
     */
    public void setRc(org.apache.axis.types.UnsignedInt rc) {
        this.rc = rc;
    }


    /**
     * Gets the message value for this GetappfwlearningsettingsResult.
     * 
     * @return message
     */
    public java.lang.String getMessage() {
        return message;
    }


    /**
     * Sets the message value for this GetappfwlearningsettingsResult.
     * 
     * @param message
     */
    public void setMessage(java.lang.String message) {
        this.message = message;
    }


    /**
     * Gets the list value for this GetappfwlearningsettingsResult.
     * 
     * @return list
     */
    public NSConfig.Appfwlearningsettings[] getList() {
        return list;
    }


    /**
     * Sets the list value for this GetappfwlearningsettingsResult.
     * 
     * @param list
     */
    public void setList(NSConfig.Appfwlearningsettings[] list) {
        this.list = list;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetappfwlearningsettingsResult)) return false;
        GetappfwlearningsettingsResult other = (GetappfwlearningsettingsResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rc==null && other.getRc()==null) || 
             (this.rc!=null &&
              this.rc.equals(other.getRc()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.list==null && other.getList()==null) || 
             (this.list!=null &&
              java.util.Arrays.equals(this.list, other.getList())));
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
        if (getRc() != null) {
            _hashCode += getRc().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetappfwlearningsettingsResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "getappfwlearningsettingsResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("", "message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("list");
        elemField.setXmlName(new javax.xml.namespace.QName("", "List"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "appfwlearningsettings"));
        elemField.setMinOccurs(0);
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
