/**
 * LbmethodEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class LbmethodEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LbmethodEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ROUNDROBIN = "ROUNDROBIN";
    public static final java.lang.String _LEASTCONNECTION = "LEASTCONNECTION";
    public static final java.lang.String _LEASTRESPONSETIME = "LEASTRESPONSETIME";
    public static final java.lang.String _URLHASH = "URLHASH";
    public static final java.lang.String _DOMAINHASH = "DOMAINHASH";
    public static final java.lang.String _DESTINATIONIPHASH = "DESTINATIONIPHASH";
    public static final java.lang.String _SOURCEIPHASH = "SOURCEIPHASH";
    public static final java.lang.String _SRCIPDESTIPHASH = "SRCIPDESTIPHASH";
    public static final java.lang.String _LEASTBANDWIDTH = "LEASTBANDWIDTH";
    public static final java.lang.String _LEASTPACKETS = "LEASTPACKETS";
    public static final java.lang.String _TOKEN = "TOKEN";
    public static final java.lang.String _SRCIPSRCPORTHASH = "SRCIPSRCPORTHASH";
    public static final java.lang.String _LRTM = "LRTM";
    public static final java.lang.String _CALLIDHASH = "CALLIDHASH";
    public static final java.lang.String _CUSTOMLOAD = "CUSTOMLOAD";
    public static final java.lang.String _LEASTREQUEST = "LEASTREQUEST";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final LbmethodEnum ROUNDROBIN = new LbmethodEnum(_ROUNDROBIN);
    public static final LbmethodEnum LEASTCONNECTION = new LbmethodEnum(_LEASTCONNECTION);
    public static final LbmethodEnum LEASTRESPONSETIME = new LbmethodEnum(_LEASTRESPONSETIME);
    public static final LbmethodEnum URLHASH = new LbmethodEnum(_URLHASH);
    public static final LbmethodEnum DOMAINHASH = new LbmethodEnum(_DOMAINHASH);
    public static final LbmethodEnum DESTINATIONIPHASH = new LbmethodEnum(_DESTINATIONIPHASH);
    public static final LbmethodEnum SOURCEIPHASH = new LbmethodEnum(_SOURCEIPHASH);
    public static final LbmethodEnum SRCIPDESTIPHASH = new LbmethodEnum(_SRCIPDESTIPHASH);
    public static final LbmethodEnum LEASTBANDWIDTH = new LbmethodEnum(_LEASTBANDWIDTH);
    public static final LbmethodEnum LEASTPACKETS = new LbmethodEnum(_LEASTPACKETS);
    public static final LbmethodEnum TOKEN = new LbmethodEnum(_TOKEN);
    public static final LbmethodEnum SRCIPSRCPORTHASH = new LbmethodEnum(_SRCIPSRCPORTHASH);
    public static final LbmethodEnum LRTM = new LbmethodEnum(_LRTM);
    public static final LbmethodEnum CALLIDHASH = new LbmethodEnum(_CALLIDHASH);
    public static final LbmethodEnum CUSTOMLOAD = new LbmethodEnum(_CUSTOMLOAD);
    public static final LbmethodEnum LEASTREQUEST = new LbmethodEnum(_LEASTREQUEST);
    public static final LbmethodEnum VALNOTSET = new LbmethodEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static LbmethodEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LbmethodEnum enumeration = (LbmethodEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LbmethodEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LbmethodEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "lbmethodEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
