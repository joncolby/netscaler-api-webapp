/**
 * ServicetypeEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class ServicetypeEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ServicetypeEnum(java.lang.String value) {
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
    public static final java.lang.String _RPCSVR = "RPCSVR";
    public static final java.lang.String _DNS = "DNS";
    public static final java.lang.String _ADNS = "ADNS";
    public static final java.lang.String _SNMP = "SNMP";
    public static final java.lang.String _RTSP = "RTSP";
    public static final java.lang.String _DHCPRA = "DHCPRA";
    public static final java.lang.String _ANY = "ANY";
    public static final java.lang.String _SIPUDP = "SIPUDP";
    public static final java.lang.String _DNSTCP = "DNSTCP";
    public static final java.lang.String _ADNSTCP = "ADNSTCP";
    public static final java.lang.String _MYSQL = "MYSQL";
    public static final java.lang.String _MSSQL = "MSSQL";
    public static final java.lang.String _ORACLE = "ORACLE";
    public static final java.lang.String _RADIUS = "RADIUS";
    public static final java.lang.String _RDP = "RDP";
    public static final java.lang.String _DIAMETER = "DIAMETER";
    public static final java.lang.String _SSLDIAMETER = "SSLDIAMETER";
    public static final java.lang.String _TFTP = "TFTP";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final ServicetypeEnum HTTP = new ServicetypeEnum(_HTTP);
    public static final ServicetypeEnum FTP = new ServicetypeEnum(_FTP);
    public static final ServicetypeEnum TCP = new ServicetypeEnum(_TCP);
    public static final ServicetypeEnum UDP = new ServicetypeEnum(_UDP);
    public static final ServicetypeEnum SSL = new ServicetypeEnum(_SSL);
    public static final ServicetypeEnum SSLBRIDGE = new ServicetypeEnum(_SSLBRIDGE);
    public static final ServicetypeEnum SSLTCP = new ServicetypeEnum(_SSLTCP);
    public static final ServicetypeEnum DTLS = new ServicetypeEnum(_DTLS);
    public static final ServicetypeEnum NNTP = new ServicetypeEnum(_NNTP);
    public static final ServicetypeEnum RPCSVR = new ServicetypeEnum(_RPCSVR);
    public static final ServicetypeEnum DNS = new ServicetypeEnum(_DNS);
    public static final ServicetypeEnum ADNS = new ServicetypeEnum(_ADNS);
    public static final ServicetypeEnum SNMP = new ServicetypeEnum(_SNMP);
    public static final ServicetypeEnum RTSP = new ServicetypeEnum(_RTSP);
    public static final ServicetypeEnum DHCPRA = new ServicetypeEnum(_DHCPRA);
    public static final ServicetypeEnum ANY = new ServicetypeEnum(_ANY);
    public static final ServicetypeEnum SIPUDP = new ServicetypeEnum(_SIPUDP);
    public static final ServicetypeEnum DNSTCP = new ServicetypeEnum(_DNSTCP);
    public static final ServicetypeEnum ADNSTCP = new ServicetypeEnum(_ADNSTCP);
    public static final ServicetypeEnum MYSQL = new ServicetypeEnum(_MYSQL);
    public static final ServicetypeEnum MSSQL = new ServicetypeEnum(_MSSQL);
    public static final ServicetypeEnum ORACLE = new ServicetypeEnum(_ORACLE);
    public static final ServicetypeEnum RADIUS = new ServicetypeEnum(_RADIUS);
    public static final ServicetypeEnum RDP = new ServicetypeEnum(_RDP);
    public static final ServicetypeEnum DIAMETER = new ServicetypeEnum(_DIAMETER);
    public static final ServicetypeEnum SSLDIAMETER = new ServicetypeEnum(_SSLDIAMETER);
    public static final ServicetypeEnum TFTP = new ServicetypeEnum(_TFTP);
    public static final ServicetypeEnum VALNOTSET = new ServicetypeEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static ServicetypeEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ServicetypeEnum enumeration = (ServicetypeEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ServicetypeEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ServicetypeEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "servicetypeEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
