/**
 * AppsecckiencryptionEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class AppsecckiencryptionEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AppsecckiencryptionEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NONE = "NONE";
    public static final java.lang.String _DECRYPTONLY = "DECRYPTONLY";
    public static final java.lang.String _ENCRYPTSESSIONONLY = "ENCRYPTSESSIONONLY";
    public static final java.lang.String _ENCRYPTALL = "ENCRYPTALL";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final AppsecckiencryptionEnum NONE = new AppsecckiencryptionEnum(_NONE);
    public static final AppsecckiencryptionEnum DECRYPTONLY = new AppsecckiencryptionEnum(_DECRYPTONLY);
    public static final AppsecckiencryptionEnum ENCRYPTSESSIONONLY = new AppsecckiencryptionEnum(_ENCRYPTSESSIONONLY);
    public static final AppsecckiencryptionEnum ENCRYPTALL = new AppsecckiencryptionEnum(_ENCRYPTALL);
    public static final AppsecckiencryptionEnum VALNOTSET = new AppsecckiencryptionEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static AppsecckiencryptionEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AppsecckiencryptionEnum enumeration = (AppsecckiencryptionEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AppsecckiencryptionEnum fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AppsecckiencryptionEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "appsecckiencryptionEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
