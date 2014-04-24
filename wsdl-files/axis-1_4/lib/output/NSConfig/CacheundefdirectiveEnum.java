/**
 * CacheundefdirectiveEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class CacheundefdirectiveEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CacheundefdirectiveEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NOCACHE = "NOCACHE";
    public static final java.lang.String _RESET = "RESET";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final CacheundefdirectiveEnum NOCACHE = new CacheundefdirectiveEnum(_NOCACHE);
    public static final CacheundefdirectiveEnum RESET = new CacheundefdirectiveEnum(_RESET);
    public static final CacheundefdirectiveEnum VALNOTSET = new CacheundefdirectiveEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static CacheundefdirectiveEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CacheundefdirectiveEnum enumeration = (CacheundefdirectiveEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CacheundefdirectiveEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CacheundefdirectiveEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "cacheundefdirectiveEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
