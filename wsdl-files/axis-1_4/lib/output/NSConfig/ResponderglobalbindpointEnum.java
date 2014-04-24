/**
 * ResponderglobalbindpointEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class ResponderglobalbindpointEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ResponderglobalbindpointEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _REQOVERRIDE = "REQOVERRIDE";
    public static final java.lang.String _REQDEFAULT = "REQDEFAULT";
    public static final java.lang.String _OVERRIDE = "OVERRIDE";
    public static final java.lang.String _DEFAULT = "DEFAULT";
    public static final java.lang.String _OTHERTCPREQOVERRIDE = "OTHERTCPREQOVERRIDE";
    public static final java.lang.String _OTHERTCPREQDEFAULT = "OTHERTCPREQDEFAULT";
    public static final java.lang.String _SIPUDPREQOVERRIDE = "SIPUDPREQOVERRIDE";
    public static final java.lang.String _SIPUDPREQDEFAULT = "SIPUDPREQDEFAULT";
    public static final java.lang.String _MSSQLREQOVERRIDE = "MSSQLREQOVERRIDE";
    public static final java.lang.String _MSSQLREQDEFAULT = "MSSQLREQDEFAULT";
    public static final java.lang.String _MYSQLREQOVERRIDE = "MYSQLREQOVERRIDE";
    public static final java.lang.String _MYSQLREQDEFAULT = "MYSQLREQDEFAULT";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final ResponderglobalbindpointEnum REQOVERRIDE = new ResponderglobalbindpointEnum(_REQOVERRIDE);
    public static final ResponderglobalbindpointEnum REQDEFAULT = new ResponderglobalbindpointEnum(_REQDEFAULT);
    public static final ResponderglobalbindpointEnum OVERRIDE = new ResponderglobalbindpointEnum(_OVERRIDE);
    public static final ResponderglobalbindpointEnum DEFAULT = new ResponderglobalbindpointEnum(_DEFAULT);
    public static final ResponderglobalbindpointEnum OTHERTCPREQOVERRIDE = new ResponderglobalbindpointEnum(_OTHERTCPREQOVERRIDE);
    public static final ResponderglobalbindpointEnum OTHERTCPREQDEFAULT = new ResponderglobalbindpointEnum(_OTHERTCPREQDEFAULT);
    public static final ResponderglobalbindpointEnum SIPUDPREQOVERRIDE = new ResponderglobalbindpointEnum(_SIPUDPREQOVERRIDE);
    public static final ResponderglobalbindpointEnum SIPUDPREQDEFAULT = new ResponderglobalbindpointEnum(_SIPUDPREQDEFAULT);
    public static final ResponderglobalbindpointEnum MSSQLREQOVERRIDE = new ResponderglobalbindpointEnum(_MSSQLREQOVERRIDE);
    public static final ResponderglobalbindpointEnum MSSQLREQDEFAULT = new ResponderglobalbindpointEnum(_MSSQLREQDEFAULT);
    public static final ResponderglobalbindpointEnum MYSQLREQOVERRIDE = new ResponderglobalbindpointEnum(_MYSQLREQOVERRIDE);
    public static final ResponderglobalbindpointEnum MYSQLREQDEFAULT = new ResponderglobalbindpointEnum(_MYSQLREQDEFAULT);
    public static final ResponderglobalbindpointEnum VALNOTSET = new ResponderglobalbindpointEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static ResponderglobalbindpointEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ResponderglobalbindpointEnum enumeration = (ResponderglobalbindpointEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ResponderglobalbindpointEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ResponderglobalbindpointEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "responderglobalbindpointEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
