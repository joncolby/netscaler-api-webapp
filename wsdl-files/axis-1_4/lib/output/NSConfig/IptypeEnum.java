/**
 * IptypeEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class IptypeEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected IptypeEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SNIP = "SNIP";
    public static final java.lang.String _VIP = "VIP";
    public static final java.lang.String _MIP = "MIP";
    public static final java.lang.String _NSIP = "NSIP";
    public static final java.lang.String _GSLBSITEIP = "GSLBSITEIP";
    public static final java.lang.String _CLIP = "CLIP";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final IptypeEnum SNIP = new IptypeEnum(_SNIP);
    public static final IptypeEnum VIP = new IptypeEnum(_VIP);
    public static final IptypeEnum MIP = new IptypeEnum(_MIP);
    public static final IptypeEnum NSIP = new IptypeEnum(_NSIP);
    public static final IptypeEnum GSLBSITEIP = new IptypeEnum(_GSLBSITEIP);
    public static final IptypeEnum CLIP = new IptypeEnum(_CLIP);
    public static final IptypeEnum VALNOTSET = new IptypeEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static IptypeEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        IptypeEnum enumeration = (IptypeEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static IptypeEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(IptypeEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "iptypeEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
