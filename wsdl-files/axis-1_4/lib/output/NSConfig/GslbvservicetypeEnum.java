/**
 * GslbvservicetypeEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class GslbvservicetypeEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected GslbvservicetypeEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _HTTP = "HTTP";
    public static final java.lang.String _FTP = "FTP";
    public static final java.lang.String _TCP = "TCP";
    public static final java.lang.String _UDP = "UDP";
    public static final java.lang.String _SSL = "SSL";
    public static final java.lang.String _SSLBRIDGE = "SSLBRIDGE";
    public static final java.lang.String _SSLTCP = "SSLTCP";
    public static final java.lang.String _NNTP = "NNTP";
    public static final java.lang.String _ANY = "ANY";
    public static final java.lang.String _SIPUDP = "SIPUDP";
    public static final java.lang.String _RADIUS = "RADIUS";
    public static final java.lang.String _RDP = "RDP";
    public static final java.lang.String _RTSP = "RTSP";
    public static final java.lang.String _MYSQL = "MYSQL";
    public static final java.lang.String _MSSQL = "MSSQL";
    public static final java.lang.String _ORACLE = "ORACLE";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final GslbvservicetypeEnum HTTP = new GslbvservicetypeEnum(_HTTP);
    public static final GslbvservicetypeEnum FTP = new GslbvservicetypeEnum(_FTP);
    public static final GslbvservicetypeEnum TCP = new GslbvservicetypeEnum(_TCP);
    public static final GslbvservicetypeEnum UDP = new GslbvservicetypeEnum(_UDP);
    public static final GslbvservicetypeEnum SSL = new GslbvservicetypeEnum(_SSL);
    public static final GslbvservicetypeEnum SSLBRIDGE = new GslbvservicetypeEnum(_SSLBRIDGE);
    public static final GslbvservicetypeEnum SSLTCP = new GslbvservicetypeEnum(_SSLTCP);
    public static final GslbvservicetypeEnum NNTP = new GslbvservicetypeEnum(_NNTP);
    public static final GslbvservicetypeEnum ANY = new GslbvservicetypeEnum(_ANY);
    public static final GslbvservicetypeEnum SIPUDP = new GslbvservicetypeEnum(_SIPUDP);
    public static final GslbvservicetypeEnum RADIUS = new GslbvservicetypeEnum(_RADIUS);
    public static final GslbvservicetypeEnum RDP = new GslbvservicetypeEnum(_RDP);
    public static final GslbvservicetypeEnum RTSP = new GslbvservicetypeEnum(_RTSP);
    public static final GslbvservicetypeEnum MYSQL = new GslbvservicetypeEnum(_MYSQL);
    public static final GslbvservicetypeEnum MSSQL = new GslbvservicetypeEnum(_MSSQL);
    public static final GslbvservicetypeEnum ORACLE = new GslbvservicetypeEnum(_ORACLE);
    public static final GslbvservicetypeEnum VALNOTSET = new GslbvservicetypeEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static GslbvservicetypeEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        GslbvservicetypeEnum enumeration = (GslbvservicetypeEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static GslbvservicetypeEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(GslbvservicetypeEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "gslbvservicetypeEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
