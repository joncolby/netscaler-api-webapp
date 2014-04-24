/**
 * Vpnsessact_perscookieEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Vpnsessact_perscookieEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Vpnsessact_perscookieEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ALLOW = "ALLOW";
    public static final java.lang.String _DENY = "DENY";
    public static final java.lang.String _PROMPT = "PROMPT";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final Vpnsessact_perscookieEnum ALLOW = new Vpnsessact_perscookieEnum(_ALLOW);
    public static final Vpnsessact_perscookieEnum DENY = new Vpnsessact_perscookieEnum(_DENY);
    public static final Vpnsessact_perscookieEnum PROMPT = new Vpnsessact_perscookieEnum(_PROMPT);
    public static final Vpnsessact_perscookieEnum VALNOTSET = new Vpnsessact_perscookieEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static Vpnsessact_perscookieEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Vpnsessact_perscookieEnum enumeration = (Vpnsessact_perscookieEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Vpnsessact_perscookieEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Vpnsessact_perscookieEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "vpnsessact_perscookieEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
