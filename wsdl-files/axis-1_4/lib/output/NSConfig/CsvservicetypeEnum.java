/**
 * CsvservicetypeEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class CsvservicetypeEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CsvservicetypeEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _HTTP = "HTTP";
    public static final java.lang.String _SSL = "SSL";
    public static final java.lang.String _TCP = "TCP";
    public static final java.lang.String _FTP = "FTP";
    public static final java.lang.String _RTSP = "RTSP";
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
    public static final java.lang.String _ORACLE = "ORACLE";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final CsvservicetypeEnum HTTP = new CsvservicetypeEnum(_HTTP);
    public static final CsvservicetypeEnum SSL = new CsvservicetypeEnum(_SSL);
    public static final CsvservicetypeEnum TCP = new CsvservicetypeEnum(_TCP);
    public static final CsvservicetypeEnum FTP = new CsvservicetypeEnum(_FTP);
    public static final CsvservicetypeEnum RTSP = new CsvservicetypeEnum(_RTSP);
    public static final CsvservicetypeEnum SSLTCP = new CsvservicetypeEnum(_SSLTCP);
    public static final CsvservicetypeEnum UDP = new CsvservicetypeEnum(_UDP);
    public static final CsvservicetypeEnum DNS = new CsvservicetypeEnum(_DNS);
    public static final CsvservicetypeEnum SIPUDP = new CsvservicetypeEnum(_SIPUDP);
    public static final CsvservicetypeEnum ANY = new CsvservicetypeEnum(_ANY);
    public static final CsvservicetypeEnum RADIUS = new CsvservicetypeEnum(_RADIUS);
    public static final CsvservicetypeEnum RDP = new CsvservicetypeEnum(_RDP);
    public static final CsvservicetypeEnum MYSQL = new CsvservicetypeEnum(_MYSQL);
    public static final CsvservicetypeEnum MSSQL = new CsvservicetypeEnum(_MSSQL);
    public static final CsvservicetypeEnum DIAMETER = new CsvservicetypeEnum(_DIAMETER);
    public static final CsvservicetypeEnum SSLDIAMETER = new CsvservicetypeEnum(_SSLDIAMETER);
    public static final CsvservicetypeEnum ORACLE = new CsvservicetypeEnum(_ORACLE);
    public static final CsvservicetypeEnum VALNOTSET = new CsvservicetypeEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static CsvservicetypeEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CsvservicetypeEnum enumeration = (CsvservicetypeEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CsvservicetypeEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CsvservicetypeEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "csvservicetypeEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
