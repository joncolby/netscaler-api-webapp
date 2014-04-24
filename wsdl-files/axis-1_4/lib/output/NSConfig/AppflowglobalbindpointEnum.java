/**
 * AppflowglobalbindpointEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class AppflowglobalbindpointEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AppflowglobalbindpointEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _REQOVERRIDE = "REQOVERRIDE";
    public static final java.lang.String _REQDEFAULT = "REQDEFAULT";
    public static final java.lang.String _OVERRIDE = "OVERRIDE";
    public static final java.lang.String _DEFAULT = "DEFAULT";
    public static final java.lang.String _OTHERTCPREQOVERRIDE = "OTHERTCPREQOVERRIDE";
    public static final java.lang.String _OTHERTCPREQDEFAULT = "OTHERTCPREQDEFAULT";
    public static final java.lang.String _MSSQLREQOVERRIDE = "MSSQLREQOVERRIDE";
    public static final java.lang.String _MSSQLREQDEFAULT = "MSSQLREQDEFAULT";
    public static final java.lang.String _MYSQLREQOVERRIDE = "MYSQLREQOVERRIDE";
    public static final java.lang.String _MYSQLREQDEFAULT = "MYSQLREQDEFAULT";
    public static final java.lang.String _ICAREQOVERRIDE = "ICAREQOVERRIDE";
    public static final java.lang.String _ICAREQDEFAULT = "ICAREQDEFAULT";
    public static final java.lang.String _ORACLEREQOVERRIDE = "ORACLEREQOVERRIDE";
    public static final java.lang.String _ORACLEREQDEFAULT = "ORACLEREQDEFAULT";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final AppflowglobalbindpointEnum REQOVERRIDE = new AppflowglobalbindpointEnum(_REQOVERRIDE);
    public static final AppflowglobalbindpointEnum REQDEFAULT = new AppflowglobalbindpointEnum(_REQDEFAULT);
    public static final AppflowglobalbindpointEnum OVERRIDE = new AppflowglobalbindpointEnum(_OVERRIDE);
    public static final AppflowglobalbindpointEnum DEFAULT = new AppflowglobalbindpointEnum(_DEFAULT);
    public static final AppflowglobalbindpointEnum OTHERTCPREQOVERRIDE = new AppflowglobalbindpointEnum(_OTHERTCPREQOVERRIDE);
    public static final AppflowglobalbindpointEnum OTHERTCPREQDEFAULT = new AppflowglobalbindpointEnum(_OTHERTCPREQDEFAULT);
    public static final AppflowglobalbindpointEnum MSSQLREQOVERRIDE = new AppflowglobalbindpointEnum(_MSSQLREQOVERRIDE);
    public static final AppflowglobalbindpointEnum MSSQLREQDEFAULT = new AppflowglobalbindpointEnum(_MSSQLREQDEFAULT);
    public static final AppflowglobalbindpointEnum MYSQLREQOVERRIDE = new AppflowglobalbindpointEnum(_MYSQLREQOVERRIDE);
    public static final AppflowglobalbindpointEnum MYSQLREQDEFAULT = new AppflowglobalbindpointEnum(_MYSQLREQDEFAULT);
    public static final AppflowglobalbindpointEnum ICAREQOVERRIDE = new AppflowglobalbindpointEnum(_ICAREQOVERRIDE);
    public static final AppflowglobalbindpointEnum ICAREQDEFAULT = new AppflowglobalbindpointEnum(_ICAREQDEFAULT);
    public static final AppflowglobalbindpointEnum ORACLEREQOVERRIDE = new AppflowglobalbindpointEnum(_ORACLEREQOVERRIDE);
    public static final AppflowglobalbindpointEnum ORACLEREQDEFAULT = new AppflowglobalbindpointEnum(_ORACLEREQDEFAULT);
    public static final AppflowglobalbindpointEnum VALNOTSET = new AppflowglobalbindpointEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static AppflowglobalbindpointEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AppflowglobalbindpointEnum enumeration = (AppflowglobalbindpointEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AppflowglobalbindpointEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AppflowglobalbindpointEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "appflowglobalbindpointEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
