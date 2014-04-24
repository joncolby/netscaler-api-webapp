/**
 * Ipv6TypeEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Ipv6TypeEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Ipv6TypeEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NSIP = "NSIP";
    public static final java.lang.String _VIP = "VIP";
    public static final java.lang.String _SNIP = "SNIP";
    public static final java.lang.String _GSLBSITEIP = "GSLBSITEIP";
    public static final java.lang.String _ADNSSVCIP = "ADNSSVCIP";
    public static final java.lang.String _CLIP = "CLIP";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final Ipv6TypeEnum NSIP = new Ipv6TypeEnum(_NSIP);
    public static final Ipv6TypeEnum VIP = new Ipv6TypeEnum(_VIP);
    public static final Ipv6TypeEnum SNIP = new Ipv6TypeEnum(_SNIP);
    public static final Ipv6TypeEnum GSLBSITEIP = new Ipv6TypeEnum(_GSLBSITEIP);
    public static final Ipv6TypeEnum ADNSSVCIP = new Ipv6TypeEnum(_ADNSSVCIP);
    public static final Ipv6TypeEnum CLIP = new Ipv6TypeEnum(_CLIP);
    public static final Ipv6TypeEnum VALNOTSET = new Ipv6TypeEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static Ipv6TypeEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Ipv6TypeEnum enumeration = (Ipv6TypeEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Ipv6TypeEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Ipv6TypeEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "ipv6typeEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
