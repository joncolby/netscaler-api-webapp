/**
 * ModeEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class ModeEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ModeEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _FR = "FR";
    public static final java.lang.String _FASTRAMP = "FASTRAMP";
    public static final java.lang.String _L2 = "L2";
    public static final java.lang.String _L2MODE = "L2MODE";
    public static final java.lang.String _L3 = "L3";
    public static final java.lang.String _L3MODE = "L3MODE";
    public static final java.lang.String _USIP = "USIP";
    public static final java.lang.String _USESOURCEIP = "USESOURCEIP";
    public static final java.lang.String _CKA = "CKA";
    public static final java.lang.String _CLIENTKEEPALIVE = "CLIENTKEEPALIVE";
    public static final java.lang.String _TCPB = "TCPB";
    public static final java.lang.String _TCPBUFFERING = "TCPBUFFERING";
    public static final java.lang.String _MBF = "MBF";
    public static final java.lang.String _MACBASEDFORWARDING = "MACBASEDFORWARDING";
    public static final java.lang.String _EDGE = "EDGE";
    public static final java.lang.String _USNIP = "USNIP";
    public static final java.lang.String _SRADV = "SRADV";
    public static final java.lang.String _DRADV = "DRADV";
    public static final java.lang.String _IRADV = "IRADV";
    public static final java.lang.String _SRADV6 = "SRADV6";
    public static final java.lang.String _DRADV6 = "DRADV6";
    public static final java.lang.String _PMTUD = "PMTUD";
    public static final java.lang.String _BRIDGEBPDUS = "BRIDGEBPDUS";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final ModeEnum FR = new ModeEnum(_FR);
    public static final ModeEnum FASTRAMP = new ModeEnum(_FASTRAMP);
    public static final ModeEnum L2 = new ModeEnum(_L2);
    public static final ModeEnum L2MODE = new ModeEnum(_L2MODE);
    public static final ModeEnum L3 = new ModeEnum(_L3);
    public static final ModeEnum L3MODE = new ModeEnum(_L3MODE);
    public static final ModeEnum USIP = new ModeEnum(_USIP);
    public static final ModeEnum USESOURCEIP = new ModeEnum(_USESOURCEIP);
    public static final ModeEnum CKA = new ModeEnum(_CKA);
    public static final ModeEnum CLIENTKEEPALIVE = new ModeEnum(_CLIENTKEEPALIVE);
    public static final ModeEnum TCPB = new ModeEnum(_TCPB);
    public static final ModeEnum TCPBUFFERING = new ModeEnum(_TCPBUFFERING);
    public static final ModeEnum MBF = new ModeEnum(_MBF);
    public static final ModeEnum MACBASEDFORWARDING = new ModeEnum(_MACBASEDFORWARDING);
    public static final ModeEnum EDGE = new ModeEnum(_EDGE);
    public static final ModeEnum USNIP = new ModeEnum(_USNIP);
    public static final ModeEnum SRADV = new ModeEnum(_SRADV);
    public static final ModeEnum DRADV = new ModeEnum(_DRADV);
    public static final ModeEnum IRADV = new ModeEnum(_IRADV);
    public static final ModeEnum SRADV6 = new ModeEnum(_SRADV6);
    public static final ModeEnum DRADV6 = new ModeEnum(_DRADV6);
    public static final ModeEnum PMTUD = new ModeEnum(_PMTUD);
    public static final ModeEnum BRIDGEBPDUS = new ModeEnum(_BRIDGEBPDUS);
    public static final ModeEnum VALNOTSET = new ModeEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static ModeEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ModeEnum enumeration = (ModeEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ModeEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ModeEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "modeEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
