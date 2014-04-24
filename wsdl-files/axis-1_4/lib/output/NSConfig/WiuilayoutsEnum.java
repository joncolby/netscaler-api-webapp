/**
 * WiuilayoutsEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class WiuilayoutsEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected WiuilayoutsEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AUTO = "AUTO";
    public static final java.lang.String _NORMAL = "NORMAL";
    public static final java.lang.String _COMPACT = "COMPACT";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final WiuilayoutsEnum AUTO = new WiuilayoutsEnum(_AUTO);
    public static final WiuilayoutsEnum NORMAL = new WiuilayoutsEnum(_NORMAL);
    public static final WiuilayoutsEnum COMPACT = new WiuilayoutsEnum(_COMPACT);
    public static final WiuilayoutsEnum VALNOTSET = new WiuilayoutsEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static WiuilayoutsEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        WiuilayoutsEnum enumeration = (WiuilayoutsEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static WiuilayoutsEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(WiuilayoutsEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "wiuilayoutsEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
