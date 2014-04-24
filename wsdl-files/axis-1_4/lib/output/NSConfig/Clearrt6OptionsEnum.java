/**
 * Clearrt6OptionsEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Clearrt6OptionsEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Clearrt6OptionsEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CONNECTED = "CONNECTED";
    public static final java.lang.String _STATIC = "STATIC";
    public static final java.lang.String _DYNAMIC = "DYNAMIC";
    public static final java.lang.String _OSPF = "OSPF";
    public static final java.lang.String _ISIS = "ISIS";
    public static final java.lang.String _BGP = "BGP";
    public static final java.lang.String _RIP = "RIP";
    public static final java.lang.String _NDRAROUTE = "NDRAROUTE";
    public static final java.lang.String _FIB6 = "FIB6";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final Clearrt6OptionsEnum CONNECTED = new Clearrt6OptionsEnum(_CONNECTED);
    public static final Clearrt6OptionsEnum STATIC = new Clearrt6OptionsEnum(_STATIC);
    public static final Clearrt6OptionsEnum DYNAMIC = new Clearrt6OptionsEnum(_DYNAMIC);
    public static final Clearrt6OptionsEnum OSPF = new Clearrt6OptionsEnum(_OSPF);
    public static final Clearrt6OptionsEnum ISIS = new Clearrt6OptionsEnum(_ISIS);
    public static final Clearrt6OptionsEnum BGP = new Clearrt6OptionsEnum(_BGP);
    public static final Clearrt6OptionsEnum RIP = new Clearrt6OptionsEnum(_RIP);
    public static final Clearrt6OptionsEnum NDRAROUTE = new Clearrt6OptionsEnum(_NDRAROUTE);
    public static final Clearrt6OptionsEnum FIB6 = new Clearrt6OptionsEnum(_FIB6);
    public static final Clearrt6OptionsEnum VALNOTSET = new Clearrt6OptionsEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static Clearrt6OptionsEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Clearrt6OptionsEnum enumeration = (Clearrt6OptionsEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Clearrt6OptionsEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Clearrt6OptionsEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "clearrt6optionsEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
