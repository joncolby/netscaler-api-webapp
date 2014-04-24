/**
 * VservicetypeEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class VservicetypeEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VservicetypeEnum(java.lang.String value) {
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
    public static final java.lang.String _DTLS = "DTLS";
    public static final java.lang.String _NNTP = "NNTP";
    public static final java.lang.String _DNS = "DNS";
    public static final java.lang.String _DHCPRA = "DHCPRA";
    public static final java.lang.String _ANY = "ANY";
    public static final java.lang.String _SIPUDP = "SIPUDP";
    public static final java.lang.String _DNSTCP = "DNSTCP";
    public static final java.lang.String _RTSP = "RTSP";
    public static final java.lang.String _PUSH = "PUSH";
    public static final java.lang.String _SSLPUSH = "SSLPUSH";
    public static final java.lang.String _RADIUS = "RADIUS";
    public static final java.lang.String _RDP = "RDP";
    public static final java.lang.String _MYSQL = "MYSQL";
    public static final java.lang.String _MSSQL = "MSSQL";
    public static final java.lang.String _DIAMETER = "DIAMETER";
    public static final java.lang.String _SSLDIAMETER = "SSLDIAMETER";
    public static final java.lang.String _TFTP = "TFTP";
    public static final java.lang.String _ORACLE = "ORACLE";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final VservicetypeEnum HTTP = new VservicetypeEnum(_HTTP);
    public static final VservicetypeEnum FTP = new VservicetypeEnum(_FTP);
    public static final VservicetypeEnum TCP = new VservicetypeEnum(_TCP);
    public static final VservicetypeEnum UDP = new VservicetypeEnum(_UDP);
    public static final VservicetypeEnum SSL = new VservicetypeEnum(_SSL);
    public static final VservicetypeEnum SSLBRIDGE = new VservicetypeEnum(_SSLBRIDGE);
    public static final VservicetypeEnum SSLTCP = new VservicetypeEnum(_SSLTCP);
    public static final VservicetypeEnum DTLS = new VservicetypeEnum(_DTLS);
    public static final VservicetypeEnum NNTP = new VservicetypeEnum(_NNTP);
    public static final VservicetypeEnum DNS = new VservicetypeEnum(_DNS);
    public static final VservicetypeEnum DHCPRA = new VservicetypeEnum(_DHCPRA);
    public static final VservicetypeEnum ANY = new VservicetypeEnum(_ANY);
    public static final VservicetypeEnum SIPUDP = new VservicetypeEnum(_SIPUDP);
    public static final VservicetypeEnum DNSTCP = new VservicetypeEnum(_DNSTCP);
    public static final VservicetypeEnum RTSP = new VservicetypeEnum(_RTSP);
    public static final VservicetypeEnum PUSH = new VservicetypeEnum(_PUSH);
    public static final VservicetypeEnum SSLPUSH = new VservicetypeEnum(_SSLPUSH);
    public static final VservicetypeEnum RADIUS = new VservicetypeEnum(_RADIUS);
    public static final VservicetypeEnum RDP = new VservicetypeEnum(_RDP);
    public static final VservicetypeEnum MYSQL = new VservicetypeEnum(_MYSQL);
    public static final VservicetypeEnum MSSQL = new VservicetypeEnum(_MSSQL);
    public static final VservicetypeEnum DIAMETER = new VservicetypeEnum(_DIAMETER);
    public static final VservicetypeEnum SSLDIAMETER = new VservicetypeEnum(_SSLDIAMETER);
    public static final VservicetypeEnum TFTP = new VservicetypeEnum(_TFTP);
    public static final VservicetypeEnum ORACLE = new VservicetypeEnum(_ORACLE);
    public static final VservicetypeEnum VALNOTSET = new VservicetypeEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static VservicetypeEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VservicetypeEnum enumeration = (VservicetypeEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VservicetypeEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VservicetypeEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "vservicetypeEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
