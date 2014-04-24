/**
 * SnmppermEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class SnmppermEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SnmppermEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _GET = "GET";
    public static final java.lang.String _GETNEXT = "GETNEXT";
    public static final java.lang.String _GETBULK = "GETBULK";
    public static final java.lang.String _SET = "SET";
    public static final java.lang.String _ALL = "ALL";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final SnmppermEnum GET = new SnmppermEnum(_GET);
    public static final SnmppermEnum GETNEXT = new SnmppermEnum(_GETNEXT);
    public static final SnmppermEnum GETBULK = new SnmppermEnum(_GETBULK);
    public static final SnmppermEnum SET = new SnmppermEnum(_SET);
    public static final SnmppermEnum ALL = new SnmppermEnum(_ALL);
    public static final SnmppermEnum VALNOTSET = new SnmppermEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static SnmppermEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SnmppermEnum enumeration = (SnmppermEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SnmppermEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SnmppermEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "snmppermEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
