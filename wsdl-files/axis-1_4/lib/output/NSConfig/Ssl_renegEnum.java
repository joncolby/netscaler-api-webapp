/**
 * Ssl_renegEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Ssl_renegEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Ssl_renegEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NO = "NO";
    public static final java.lang.String _FRONTENDCLIENT = "FRONTENDCLIENT";
    public static final java.lang.String _FRONTENDCLIENTSERVER = "FRONTENDCLIENTSERVER";
    public static final java.lang.String _ALL = "ALL";
    public static final java.lang.String _NONSECURE = "NONSECURE";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final Ssl_renegEnum NO = new Ssl_renegEnum(_NO);
    public static final Ssl_renegEnum FRONTENDCLIENT = new Ssl_renegEnum(_FRONTENDCLIENT);
    public static final Ssl_renegEnum FRONTENDCLIENTSERVER = new Ssl_renegEnum(_FRONTENDCLIENTSERVER);
    public static final Ssl_renegEnum ALL = new Ssl_renegEnum(_ALL);
    public static final Ssl_renegEnum NONSECURE = new Ssl_renegEnum(_NONSECURE);
    public static final Ssl_renegEnum VALNOTSET = new Ssl_renegEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static Ssl_renegEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Ssl_renegEnum enumeration = (Ssl_renegEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Ssl_renegEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Ssl_renegEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "ssl_renegEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
