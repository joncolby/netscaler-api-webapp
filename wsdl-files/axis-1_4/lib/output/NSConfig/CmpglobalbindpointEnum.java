/**
 * CmpglobalbindpointEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class CmpglobalbindpointEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected CmpglobalbindpointEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _REQOVERRIDE = "REQOVERRIDE";
    public static final java.lang.String _REQDEFAULT = "REQDEFAULT";
    public static final java.lang.String _RESOVERRIDE = "RESOVERRIDE";
    public static final java.lang.String _RESDEFAULT = "RESDEFAULT";
    public static final java.lang.String _NONE = "NONE";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final CmpglobalbindpointEnum REQOVERRIDE = new CmpglobalbindpointEnum(_REQOVERRIDE);
    public static final CmpglobalbindpointEnum REQDEFAULT = new CmpglobalbindpointEnum(_REQDEFAULT);
    public static final CmpglobalbindpointEnum RESOVERRIDE = new CmpglobalbindpointEnum(_RESOVERRIDE);
    public static final CmpglobalbindpointEnum RESDEFAULT = new CmpglobalbindpointEnum(_RESDEFAULT);
    public static final CmpglobalbindpointEnum NONE = new CmpglobalbindpointEnum(_NONE);
    public static final CmpglobalbindpointEnum VALNOTSET = new CmpglobalbindpointEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static CmpglobalbindpointEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        CmpglobalbindpointEnum enumeration = (CmpglobalbindpointEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static CmpglobalbindpointEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(CmpglobalbindpointEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "cmpglobalbindpointEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
