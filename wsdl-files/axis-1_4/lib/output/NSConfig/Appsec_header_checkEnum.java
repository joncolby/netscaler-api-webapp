/**
 * Appsec_header_checkEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Appsec_header_checkEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Appsec_header_checkEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _OFF = "OFF";
    public static final java.lang.String _IFPRESENT = "IFPRESENT";
    public static final java.lang.String _ALWAYS = "ALWAYS";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final Appsec_header_checkEnum OFF = new Appsec_header_checkEnum(_OFF);
    public static final Appsec_header_checkEnum IFPRESENT = new Appsec_header_checkEnum(_IFPRESENT);
    public static final Appsec_header_checkEnum ALWAYS = new Appsec_header_checkEnum(_ALWAYS);
    public static final Appsec_header_checkEnum VALNOTSET = new Appsec_header_checkEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static Appsec_header_checkEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Appsec_header_checkEnum enumeration = (Appsec_header_checkEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Appsec_header_checkEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Appsec_header_checkEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "appsec_header_checkEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
