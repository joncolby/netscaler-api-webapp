/**
 * ForceclnupEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class ForceclnupEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ForceclnupEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NONE = "NONE";
    public static final java.lang.String _ALL = "ALL";
    public static final java.lang.String _COOKIE = "COOKIE";
    public static final java.lang.String _ADDRESSBAR = "ADDRESSBAR";
    public static final java.lang.String _PLUGIN = "PLUGIN";
    public static final java.lang.String _FILESYSTEMAPPLICATION = "FILESYSTEMAPPLICATION";
    public static final java.lang.String _APPLICATION = "APPLICATION";
    public static final java.lang.String _APPLICATIONDATA = "APPLICATIONDATA";
    public static final java.lang.String _CLIENTCERTIFICATE = "CLIENTCERTIFICATE";
    public static final java.lang.String _AUTOCOMPLETE = "AUTOCOMPLETE";
    public static final java.lang.String _CACHE = "CACHE";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final ForceclnupEnum NONE = new ForceclnupEnum(_NONE);
    public static final ForceclnupEnum ALL = new ForceclnupEnum(_ALL);
    public static final ForceclnupEnum COOKIE = new ForceclnupEnum(_COOKIE);
    public static final ForceclnupEnum ADDRESSBAR = new ForceclnupEnum(_ADDRESSBAR);
    public static final ForceclnupEnum PLUGIN = new ForceclnupEnum(_PLUGIN);
    public static final ForceclnupEnum FILESYSTEMAPPLICATION = new ForceclnupEnum(_FILESYSTEMAPPLICATION);
    public static final ForceclnupEnum APPLICATION = new ForceclnupEnum(_APPLICATION);
    public static final ForceclnupEnum APPLICATIONDATA = new ForceclnupEnum(_APPLICATIONDATA);
    public static final ForceclnupEnum CLIENTCERTIFICATE = new ForceclnupEnum(_CLIENTCERTIFICATE);
    public static final ForceclnupEnum AUTOCOMPLETE = new ForceclnupEnum(_AUTOCOMPLETE);
    public static final ForceclnupEnum CACHE = new ForceclnupEnum(_CACHE);
    public static final ForceclnupEnum VALNOTSET = new ForceclnupEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static ForceclnupEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ForceclnupEnum enumeration = (ForceclnupEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ForceclnupEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ForceclnupEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "forceclnupEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
