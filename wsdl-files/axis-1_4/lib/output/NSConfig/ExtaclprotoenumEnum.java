/**
 * ExtaclprotoenumEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class ExtaclprotoenumEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ExtaclprotoenumEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ICMP = "ICMP";
    public static final java.lang.String _IGMP = "IGMP";
    public static final java.lang.String _TCP = "TCP";
    public static final java.lang.String _EGP = "EGP";
    public static final java.lang.String _IGP = "IGP";
    public static final java.lang.String _ARGUS = "ARGUS";
    public static final java.lang.String _UDP = "UDP";
    public static final java.lang.String _RDP = "RDP";
    public static final java.lang.String _RSVP = "RSVP";
    public static final java.lang.String _EIGRP = "EIGRP";
    public static final java.lang.String _L2TP = "L2TP";
    public static final java.lang.String _ISIS = "ISIS";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final ExtaclprotoenumEnum ICMP = new ExtaclprotoenumEnum(_ICMP);
    public static final ExtaclprotoenumEnum IGMP = new ExtaclprotoenumEnum(_IGMP);
    public static final ExtaclprotoenumEnum TCP = new ExtaclprotoenumEnum(_TCP);
    public static final ExtaclprotoenumEnum EGP = new ExtaclprotoenumEnum(_EGP);
    public static final ExtaclprotoenumEnum IGP = new ExtaclprotoenumEnum(_IGP);
    public static final ExtaclprotoenumEnum ARGUS = new ExtaclprotoenumEnum(_ARGUS);
    public static final ExtaclprotoenumEnum UDP = new ExtaclprotoenumEnum(_UDP);
    public static final ExtaclprotoenumEnum RDP = new ExtaclprotoenumEnum(_RDP);
    public static final ExtaclprotoenumEnum RSVP = new ExtaclprotoenumEnum(_RSVP);
    public static final ExtaclprotoenumEnum EIGRP = new ExtaclprotoenumEnum(_EIGRP);
    public static final ExtaclprotoenumEnum L2TP = new ExtaclprotoenumEnum(_L2TP);
    public static final ExtaclprotoenumEnum ISIS = new ExtaclprotoenumEnum(_ISIS);
    public static final ExtaclprotoenumEnum VALNOTSET = new ExtaclprotoenumEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static ExtaclprotoenumEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ExtaclprotoenumEnum enumeration = (ExtaclprotoenumEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ExtaclprotoenumEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ExtaclprotoenumEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "extaclprotoenumEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
