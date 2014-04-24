/**
 * LbpersisttypeEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class LbpersisttypeEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LbpersisttypeEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SOURCEIP = "SOURCEIP";
    public static final java.lang.String _COOKIEINSERT = "COOKIEINSERT";
    public static final java.lang.String _SSLSESSION = "SSLSESSION";
    public static final java.lang.String _RULE = "RULE";
    public static final java.lang.String _URLPASSIVE = "URLPASSIVE";
    public static final java.lang.String _CUSTOMSERVERID = "CUSTOMSERVERID";
    public static final java.lang.String _DESTIP = "DESTIP";
    public static final java.lang.String _SRCIPDESTIP = "SRCIPDESTIP";
    public static final java.lang.String _CALLID = "CALLID";
    public static final java.lang.String _RTSPSID = "RTSPSID";
    public static final java.lang.String _DIAMETER = "DIAMETER";
    public static final java.lang.String _NONE = "NONE";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final LbpersisttypeEnum SOURCEIP = new LbpersisttypeEnum(_SOURCEIP);
    public static final LbpersisttypeEnum COOKIEINSERT = new LbpersisttypeEnum(_COOKIEINSERT);
    public static final LbpersisttypeEnum SSLSESSION = new LbpersisttypeEnum(_SSLSESSION);
    public static final LbpersisttypeEnum RULE = new LbpersisttypeEnum(_RULE);
    public static final LbpersisttypeEnum URLPASSIVE = new LbpersisttypeEnum(_URLPASSIVE);
    public static final LbpersisttypeEnum CUSTOMSERVERID = new LbpersisttypeEnum(_CUSTOMSERVERID);
    public static final LbpersisttypeEnum DESTIP = new LbpersisttypeEnum(_DESTIP);
    public static final LbpersisttypeEnum SRCIPDESTIP = new LbpersisttypeEnum(_SRCIPDESTIP);
    public static final LbpersisttypeEnum CALLID = new LbpersisttypeEnum(_CALLID);
    public static final LbpersisttypeEnum RTSPSID = new LbpersisttypeEnum(_RTSPSID);
    public static final LbpersisttypeEnum DIAMETER = new LbpersisttypeEnum(_DIAMETER);
    public static final LbpersisttypeEnum NONE = new LbpersisttypeEnum(_NONE);
    public static final LbpersisttypeEnum VALNOTSET = new LbpersisttypeEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static LbpersisttypeEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LbpersisttypeEnum enumeration = (LbpersisttypeEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LbpersisttypeEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LbpersisttypeEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "lbpersisttypeEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
