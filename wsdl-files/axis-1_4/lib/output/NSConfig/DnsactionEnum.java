/**
 * DnsactionEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class DnsactionEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DnsactionEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _VIEWNAME = "VIEWNAME";
    public static final java.lang.String _GSLBPREFLOC = "GSLBPREFLOC";
    public static final java.lang.String _DROP = "DROP";
    public static final java.lang.String _CACHEBYPASS = "CACHEBYPASS";
    public static final java.lang.String _REWRITERESPONSE = "REWRITERESPONSE";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final DnsactionEnum VIEWNAME = new DnsactionEnum(_VIEWNAME);
    public static final DnsactionEnum GSLBPREFLOC = new DnsactionEnum(_GSLBPREFLOC);
    public static final DnsactionEnum DROP = new DnsactionEnum(_DROP);
    public static final DnsactionEnum CACHEBYPASS = new DnsactionEnum(_CACHEBYPASS);
    public static final DnsactionEnum REWRITERESPONSE = new DnsactionEnum(_REWRITERESPONSE);
    public static final DnsactionEnum VALNOTSET = new DnsactionEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static DnsactionEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DnsactionEnum enumeration = (DnsactionEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DnsactionEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DnsactionEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "dnsactionEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
