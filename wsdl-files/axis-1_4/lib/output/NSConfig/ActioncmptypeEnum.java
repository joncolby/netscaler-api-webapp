/**
 * ActioncmptypeEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class ActioncmptypeEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ActioncmptypeEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _COMPRESS = "COMPRESS";
    public static final java.lang.String _GZIP = "GZIP";
    public static final java.lang.String _DEFLATE = "DEFLATE";
    public static final java.lang.String _DELTA = "DELTA";
    public static final java.lang.String _NOCOMPRESS = "NOCOMPRESS";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final ActioncmptypeEnum COMPRESS = new ActioncmptypeEnum(_COMPRESS);
    public static final ActioncmptypeEnum GZIP = new ActioncmptypeEnum(_GZIP);
    public static final ActioncmptypeEnum DEFLATE = new ActioncmptypeEnum(_DEFLATE);
    public static final ActioncmptypeEnum DELTA = new ActioncmptypeEnum(_DELTA);
    public static final ActioncmptypeEnum NOCOMPRESS = new ActioncmptypeEnum(_NOCOMPRESS);
    public static final ActioncmptypeEnum VALNOTSET = new ActioncmptypeEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static ActioncmptypeEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ActioncmptypeEnum enumeration = (ActioncmptypeEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ActioncmptypeEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ActioncmptypeEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "actioncmptypeEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
