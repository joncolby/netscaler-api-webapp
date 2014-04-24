/**
 * AllocclientconnectionEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class AllocclientconnectionEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AllocclientconnectionEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AUTOMATIC = "AUTOMATIC";
    public static final java.lang.String _CONNESTABLISHED = "CONNESTABLISHED";
    public static final java.lang.String _ONFIRSTDATA = "ONFIRSTDATA";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final AllocclientconnectionEnum AUTOMATIC = new AllocclientconnectionEnum(_AUTOMATIC);
    public static final AllocclientconnectionEnum CONNESTABLISHED = new AllocclientconnectionEnum(_CONNESTABLISHED);
    public static final AllocclientconnectionEnum ONFIRSTDATA = new AllocclientconnectionEnum(_ONFIRSTDATA);
    public static final AllocclientconnectionEnum VALNOTSET = new AllocclientconnectionEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static AllocclientconnectionEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AllocclientconnectionEnum enumeration = (AllocclientconnectionEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AllocclientconnectionEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AllocclientconnectionEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "allocclientconnectionEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
