/**
 * MonitortypeEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class MonitortypeEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MonitortypeEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PING = "PING";
    public static final java.lang.String _TCP = "TCP";
    public static final java.lang.String _HTTP = "HTTP";
    public static final java.lang.String _TCPECV = "TCPECV";
    public static final java.lang.String _HTTPECV = "HTTPECV";
    public static final java.lang.String _UDPECV = "UDPECV";
    public static final java.lang.String _DNS = "DNS";
    public static final java.lang.String _FTP = "FTP";
    public static final java.lang.String _LDNSPING = "LDNSPING";
    public static final java.lang.String _LDNSTCP = "LDNSTCP";
    public static final java.lang.String _LDNSDNS = "LDNSDNS";
    public static final java.lang.String _RADIUS = "RADIUS";
    public static final java.lang.String _USER = "USER";
    public static final java.lang.String _HTTPINLINE = "HTTPINLINE";
    public static final java.lang.String _SIPUDP = "SIPUDP";
    public static final java.lang.String _LOAD = "LOAD";
    public static final java.lang.String _FTPEXTENDED = "FTPEXTENDED";
    public static final java.lang.String _SMTP = "SMTP";
    public static final java.lang.String _SNMP = "SNMP";
    public static final java.lang.String _NNTP = "NNTP";
    public static final java.lang.String _MYSQL = "MYSQL";
    public static final java.lang.String _MYSQLECV = "MYSQLECV";
    public static final java.lang.String _MSSQLECV = "MSSQLECV";
    public static final java.lang.String _ORACLEECV = "ORACLEECV";
    public static final java.lang.String _LDAP = "LDAP";
    public static final java.lang.String _POP3 = "POP3";
    public static final java.lang.String _CITRIXXMLSERVICE = "CITRIXXMLSERVICE";
    public static final java.lang.String _CITRIXWEBINTERFACE = "CITRIXWEBINTERFACE";
    public static final java.lang.String _DNSTCP = "DNSTCP";
    public static final java.lang.String _RTSP = "RTSP";
    public static final java.lang.String _ARP = "ARP";
    public static final java.lang.String _CITRIXAG = "CITRIXAG";
    public static final java.lang.String _CITRIXAACLOGINPAGE = "CITRIXAACLOGINPAGE";
    public static final java.lang.String _CITRIXAACLAS = "CITRIXAACLAS";
    public static final java.lang.String _CITRIXXDDDC = "CITRIXXDDDC";
    public static final java.lang.String _ND6 = "ND6";
    public static final java.lang.String _CITRIXWIEXTENDED = "CITRIXWIEXTENDED";
    public static final java.lang.String _DIAMETER = "DIAMETER";
    public static final java.lang.String _RADIUSACCOUNTING = "RADIUSACCOUNTING";
    public static final java.lang.String _STOREFRONT = "STOREFRONT";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final MonitortypeEnum PING = new MonitortypeEnum(_PING);
    public static final MonitortypeEnum TCP = new MonitortypeEnum(_TCP);
    public static final MonitortypeEnum HTTP = new MonitortypeEnum(_HTTP);
    public static final MonitortypeEnum TCPECV = new MonitortypeEnum(_TCPECV);
    public static final MonitortypeEnum HTTPECV = new MonitortypeEnum(_HTTPECV);
    public static final MonitortypeEnum UDPECV = new MonitortypeEnum(_UDPECV);
    public static final MonitortypeEnum DNS = new MonitortypeEnum(_DNS);
    public static final MonitortypeEnum FTP = new MonitortypeEnum(_FTP);
    public static final MonitortypeEnum LDNSPING = new MonitortypeEnum(_LDNSPING);
    public static final MonitortypeEnum LDNSTCP = new MonitortypeEnum(_LDNSTCP);
    public static final MonitortypeEnum LDNSDNS = new MonitortypeEnum(_LDNSDNS);
    public static final MonitortypeEnum RADIUS = new MonitortypeEnum(_RADIUS);
    public static final MonitortypeEnum USER = new MonitortypeEnum(_USER);
    public static final MonitortypeEnum HTTPINLINE = new MonitortypeEnum(_HTTPINLINE);
    public static final MonitortypeEnum SIPUDP = new MonitortypeEnum(_SIPUDP);
    public static final MonitortypeEnum LOAD = new MonitortypeEnum(_LOAD);
    public static final MonitortypeEnum FTPEXTENDED = new MonitortypeEnum(_FTPEXTENDED);
    public static final MonitortypeEnum SMTP = new MonitortypeEnum(_SMTP);
    public static final MonitortypeEnum SNMP = new MonitortypeEnum(_SNMP);
    public static final MonitortypeEnum NNTP = new MonitortypeEnum(_NNTP);
    public static final MonitortypeEnum MYSQL = new MonitortypeEnum(_MYSQL);
    public static final MonitortypeEnum MYSQLECV = new MonitortypeEnum(_MYSQLECV);
    public static final MonitortypeEnum MSSQLECV = new MonitortypeEnum(_MSSQLECV);
    public static final MonitortypeEnum ORACLEECV = new MonitortypeEnum(_ORACLEECV);
    public static final MonitortypeEnum LDAP = new MonitortypeEnum(_LDAP);
    public static final MonitortypeEnum POP3 = new MonitortypeEnum(_POP3);
    public static final MonitortypeEnum CITRIXXMLSERVICE = new MonitortypeEnum(_CITRIXXMLSERVICE);
    public static final MonitortypeEnum CITRIXWEBINTERFACE = new MonitortypeEnum(_CITRIXWEBINTERFACE);
    public static final MonitortypeEnum DNSTCP = new MonitortypeEnum(_DNSTCP);
    public static final MonitortypeEnum RTSP = new MonitortypeEnum(_RTSP);
    public static final MonitortypeEnum ARP = new MonitortypeEnum(_ARP);
    public static final MonitortypeEnum CITRIXAG = new MonitortypeEnum(_CITRIXAG);
    public static final MonitortypeEnum CITRIXAACLOGINPAGE = new MonitortypeEnum(_CITRIXAACLOGINPAGE);
    public static final MonitortypeEnum CITRIXAACLAS = new MonitortypeEnum(_CITRIXAACLAS);
    public static final MonitortypeEnum CITRIXXDDDC = new MonitortypeEnum(_CITRIXXDDDC);
    public static final MonitortypeEnum ND6 = new MonitortypeEnum(_ND6);
    public static final MonitortypeEnum CITRIXWIEXTENDED = new MonitortypeEnum(_CITRIXWIEXTENDED);
    public static final MonitortypeEnum DIAMETER = new MonitortypeEnum(_DIAMETER);
    public static final MonitortypeEnum RADIUSACCOUNTING = new MonitortypeEnum(_RADIUSACCOUNTING);
    public static final MonitortypeEnum STOREFRONT = new MonitortypeEnum(_STOREFRONT);
    public static final MonitortypeEnum VALNOTSET = new MonitortypeEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static MonitortypeEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MonitortypeEnum enumeration = (MonitortypeEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MonitortypeEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MonitortypeEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "monitortypeEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
