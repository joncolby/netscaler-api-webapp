/**
 * CachedirectiveEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class CachedirectiveEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CachedirectiveEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CACHE = "CACHE";
    public static final java.lang.String _NOCACHE = "NOCACHE";
    public static final java.lang.String _MAYCACHE = "MAYCACHE";
    public static final java.lang.String _MAYNOCACHE = "MAYNOCACHE";
    public static final java.lang.String _INVAL = "INVAL";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final CachedirectiveEnum CACHE = new CachedirectiveEnum(_CACHE);
    public static final CachedirectiveEnum NOCACHE = new CachedirectiveEnum(_NOCACHE);
    public static final CachedirectiveEnum MAYCACHE = new CachedirectiveEnum(_MAYCACHE);
    public static final CachedirectiveEnum MAYNOCACHE = new CachedirectiveEnum(_MAYNOCACHE);
    public static final CachedirectiveEnum INVAL = new CachedirectiveEnum(_INVAL);
    public static final CachedirectiveEnum VALNOTSET = new CachedirectiveEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static CachedirectiveEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CachedirectiveEnum enumeration = (CachedirectiveEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CachedirectiveEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CachedirectiveEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "cachedirectiveEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
