/**
 * SpillovermethodsEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class SpillovermethodsEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SpillovermethodsEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CONNECTION = "CONNECTION";
    public static final java.lang.String _DYNAMICCONNECTION = "DYNAMICCONNECTION";
    public static final java.lang.String _BANDWIDTH = "BANDWIDTH";
    public static final java.lang.String _HEALTH = "HEALTH";
    public static final java.lang.String _NONE = "NONE";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final SpillovermethodsEnum CONNECTION = new SpillovermethodsEnum(_CONNECTION);
    public static final SpillovermethodsEnum DYNAMICCONNECTION = new SpillovermethodsEnum(_DYNAMICCONNECTION);
    public static final SpillovermethodsEnum BANDWIDTH = new SpillovermethodsEnum(_BANDWIDTH);
    public static final SpillovermethodsEnum HEALTH = new SpillovermethodsEnum(_HEALTH);
    public static final SpillovermethodsEnum NONE = new SpillovermethodsEnum(_NONE);
    public static final SpillovermethodsEnum VALNOTSET = new SpillovermethodsEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static SpillovermethodsEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SpillovermethodsEnum enumeration = (SpillovermethodsEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SpillovermethodsEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SpillovermethodsEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "spillovermethodsEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
