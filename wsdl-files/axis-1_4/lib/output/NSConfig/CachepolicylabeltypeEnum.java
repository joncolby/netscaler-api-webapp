/**
 * CachepolicylabeltypeEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class CachepolicylabeltypeEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CachepolicylabeltypeEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _REQ = "REQ";
    public static final java.lang.String _RES = "RES";
    public static final java.lang.String _MSSQLREQ = "MSSQLREQ";
    public static final java.lang.String _MSSQLRES = "MSSQLRES";
    public static final java.lang.String _MYSQLREQ = "MYSQLREQ";
    public static final java.lang.String _MYSQLRES = "MYSQLRES";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final CachepolicylabeltypeEnum REQ = new CachepolicylabeltypeEnum(_REQ);
    public static final CachepolicylabeltypeEnum RES = new CachepolicylabeltypeEnum(_RES);
    public static final CachepolicylabeltypeEnum MSSQLREQ = new CachepolicylabeltypeEnum(_MSSQLREQ);
    public static final CachepolicylabeltypeEnum MSSQLRES = new CachepolicylabeltypeEnum(_MSSQLRES);
    public static final CachepolicylabeltypeEnum MYSQLREQ = new CachepolicylabeltypeEnum(_MYSQLREQ);
    public static final CachepolicylabeltypeEnum MYSQLRES = new CachepolicylabeltypeEnum(_MYSQLRES);
    public static final CachepolicylabeltypeEnum VALNOTSET = new CachepolicylabeltypeEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static CachepolicylabeltypeEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CachepolicylabeltypeEnum enumeration = (CachepolicylabeltypeEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CachepolicylabeltypeEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CachepolicylabeltypeEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "cachepolicylabeltypeEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
