/**
 * CspolicylabeltypeEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class CspolicylabeltypeEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CspolicylabeltypeEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _HTTP = "HTTP";
    public static final java.lang.String _TCP = "TCP";
    public static final java.lang.String _RTSP = "RTSP";
    public static final java.lang.String _SSL = "SSL";
    public static final java.lang.String _SSLTCP = "SSLTCP";
    public static final java.lang.String _UDP = "UDP";
    public static final java.lang.String _DNS = "DNS";
    public static final java.lang.String _SIPUDP = "SIPUDP";
    public static final java.lang.String _ANY = "ANY";
    public static final java.lang.String _RADIUS = "RADIUS";
    public static final java.lang.String _RDP = "RDP";
    public static final java.lang.String _MYSQL = "MYSQL";
    public static final java.lang.String _MSSQL = "MSSQL";
    public static final java.lang.String _DIAMETER = "DIAMETER";
    public static final java.lang.String _SSLDIAMETER = "SSLDIAMETER";
    public static final java.lang.String _FTP = "FTP";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final CspolicylabeltypeEnum HTTP = new CspolicylabeltypeEnum(_HTTP);
    public static final CspolicylabeltypeEnum TCP = new CspolicylabeltypeEnum(_TCP);
    public static final CspolicylabeltypeEnum RTSP = new CspolicylabeltypeEnum(_RTSP);
    public static final CspolicylabeltypeEnum SSL = new CspolicylabeltypeEnum(_SSL);
    public static final CspolicylabeltypeEnum SSLTCP = new CspolicylabeltypeEnum(_SSLTCP);
    public static final CspolicylabeltypeEnum UDP = new CspolicylabeltypeEnum(_UDP);
    public static final CspolicylabeltypeEnum DNS = new CspolicylabeltypeEnum(_DNS);
    public static final CspolicylabeltypeEnum SIPUDP = new CspolicylabeltypeEnum(_SIPUDP);
    public static final CspolicylabeltypeEnum ANY = new CspolicylabeltypeEnum(_ANY);
    public static final CspolicylabeltypeEnum RADIUS = new CspolicylabeltypeEnum(_RADIUS);
    public static final CspolicylabeltypeEnum RDP = new CspolicylabeltypeEnum(_RDP);
    public static final CspolicylabeltypeEnum MYSQL = new CspolicylabeltypeEnum(_MYSQL);
    public static final CspolicylabeltypeEnum MSSQL = new CspolicylabeltypeEnum(_MSSQL);
    public static final CspolicylabeltypeEnum DIAMETER = new CspolicylabeltypeEnum(_DIAMETER);
    public static final CspolicylabeltypeEnum SSLDIAMETER = new CspolicylabeltypeEnum(_SSLDIAMETER);
    public static final CspolicylabeltypeEnum FTP = new CspolicylabeltypeEnum(_FTP);
    public static final CspolicylabeltypeEnum VALNOTSET = new CspolicylabeltypeEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static CspolicylabeltypeEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CspolicylabeltypeEnum enumeration = (CspolicylabeltypeEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CspolicylabeltypeEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CspolicylabeltypeEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "cspolicylabeltypeEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
