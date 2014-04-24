/**
 * ExtaclactionEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class ExtaclactionEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ExtaclactionEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _BRIDGE = "BRIDGE";
    public static final java.lang.String _DENY = "DENY";
    public static final java.lang.String _ALLOW = "ALLOW";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final ExtaclactionEnum BRIDGE = new ExtaclactionEnum(_BRIDGE);
    public static final ExtaclactionEnum DENY = new ExtaclactionEnum(_DENY);
    public static final ExtaclactionEnum ALLOW = new ExtaclactionEnum(_ALLOW);
    public static final ExtaclactionEnum VALNOTSET = new ExtaclactionEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static ExtaclactionEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ExtaclactionEnum enumeration = (ExtaclactionEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ExtaclactionEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ExtaclactionEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "extaclactionEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
