/**
 * EncryptionmethodsEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class EncryptionmethodsEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected EncryptionmethodsEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NONE = "NONE";
    public static final java.lang.String _RC4 = "RC4";
    public static final java.lang.String _DES3 = "DES3";
    public static final java.lang.String _AES128 = "AES128";
    public static final java.lang.String _AES192 = "AES192";
    public static final java.lang.String _AES256 = "AES256";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final EncryptionmethodsEnum NONE = new EncryptionmethodsEnum(_NONE);
    public static final EncryptionmethodsEnum RC4 = new EncryptionmethodsEnum(_RC4);
    public static final EncryptionmethodsEnum DES3 = new EncryptionmethodsEnum(_DES3);
    public static final EncryptionmethodsEnum AES128 = new EncryptionmethodsEnum(_AES128);
    public static final EncryptionmethodsEnum AES192 = new EncryptionmethodsEnum(_AES192);
    public static final EncryptionmethodsEnum AES256 = new EncryptionmethodsEnum(_AES256);
    public static final EncryptionmethodsEnum VALNOTSET = new EncryptionmethodsEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static EncryptionmethodsEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        EncryptionmethodsEnum enumeration = (EncryptionmethodsEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static EncryptionmethodsEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(EncryptionmethodsEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "encryptionmethodsEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
