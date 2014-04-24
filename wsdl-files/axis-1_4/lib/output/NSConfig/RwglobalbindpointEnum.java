/**
 * RwglobalbindpointEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class RwglobalbindpointEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RwglobalbindpointEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _REQOVERRIDE = "REQOVERRIDE";
    public static final java.lang.String _REQDEFAULT = "REQDEFAULT";
    public static final java.lang.String _RESOVERRIDE = "RESOVERRIDE";
    public static final java.lang.String _RESDEFAULT = "RESDEFAULT";
    public static final java.lang.String _OTHERTCPREQOVERRIDE = "OTHERTCPREQOVERRIDE";
    public static final java.lang.String _OTHERTCPREQDEFAULT = "OTHERTCPREQDEFAULT";
    public static final java.lang.String _OTHERTCPRESOVERRIDE = "OTHERTCPRESOVERRIDE";
    public static final java.lang.String _OTHERTCPRESDEFAULT = "OTHERTCPRESDEFAULT";
    public static final java.lang.String _SIPUDPREQOVERRIDE = "SIPUDPREQOVERRIDE";
    public static final java.lang.String _SIPUDPREQDEFAULT = "SIPUDPREQDEFAULT";
    public static final java.lang.String _SIPUDPRESOVERRIDE = "SIPUDPRESOVERRIDE";
    public static final java.lang.String _SIPUDPRESDEFAULT = "SIPUDPRESDEFAULT";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final RwglobalbindpointEnum REQOVERRIDE = new RwglobalbindpointEnum(_REQOVERRIDE);
    public static final RwglobalbindpointEnum REQDEFAULT = new RwglobalbindpointEnum(_REQDEFAULT);
    public static final RwglobalbindpointEnum RESOVERRIDE = new RwglobalbindpointEnum(_RESOVERRIDE);
    public static final RwglobalbindpointEnum RESDEFAULT = new RwglobalbindpointEnum(_RESDEFAULT);
    public static final RwglobalbindpointEnum OTHERTCPREQOVERRIDE = new RwglobalbindpointEnum(_OTHERTCPREQOVERRIDE);
    public static final RwglobalbindpointEnum OTHERTCPREQDEFAULT = new RwglobalbindpointEnum(_OTHERTCPREQDEFAULT);
    public static final RwglobalbindpointEnum OTHERTCPRESOVERRIDE = new RwglobalbindpointEnum(_OTHERTCPRESOVERRIDE);
    public static final RwglobalbindpointEnum OTHERTCPRESDEFAULT = new RwglobalbindpointEnum(_OTHERTCPRESDEFAULT);
    public static final RwglobalbindpointEnum SIPUDPREQOVERRIDE = new RwglobalbindpointEnum(_SIPUDPREQOVERRIDE);
    public static final RwglobalbindpointEnum SIPUDPREQDEFAULT = new RwglobalbindpointEnum(_SIPUDPREQDEFAULT);
    public static final RwglobalbindpointEnum SIPUDPRESOVERRIDE = new RwglobalbindpointEnum(_SIPUDPRESOVERRIDE);
    public static final RwglobalbindpointEnum SIPUDPRESDEFAULT = new RwglobalbindpointEnum(_SIPUDPRESDEFAULT);
    public static final RwglobalbindpointEnum VALNOTSET = new RwglobalbindpointEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static RwglobalbindpointEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RwglobalbindpointEnum enumeration = (RwglobalbindpointEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RwglobalbindpointEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RwglobalbindpointEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "rwglobalbindpointEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
