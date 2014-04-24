/**
 * AuthtypeEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class AuthtypeEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AuthtypeEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _LOCAL = "LOCAL";
    public static final java.lang.String _LDAP = "LDAP";
    public static final java.lang.String _RADIUS = "RADIUS";
    public static final java.lang.String _TACACS = "TACACS";
    public static final java.lang.String _CERT = "CERT";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final AuthtypeEnum LOCAL = new AuthtypeEnum(_LOCAL);
    public static final AuthtypeEnum LDAP = new AuthtypeEnum(_LDAP);
    public static final AuthtypeEnum RADIUS = new AuthtypeEnum(_RADIUS);
    public static final AuthtypeEnum TACACS = new AuthtypeEnum(_TACACS);
    public static final AuthtypeEnum CERT = new AuthtypeEnum(_CERT);
    public static final AuthtypeEnum VALNOTSET = new AuthtypeEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static AuthtypeEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AuthtypeEnum enumeration = (AuthtypeEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AuthtypeEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AuthtypeEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "authtypeEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
