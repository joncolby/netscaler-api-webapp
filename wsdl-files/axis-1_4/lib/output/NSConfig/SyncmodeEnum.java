/**
 * SyncmodeEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class SyncmodeEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SyncmodeEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ALL = "ALL";
    public static final java.lang.String _BOOKMARKS = "BOOKMARKS";
    public static final java.lang.String _SSL = "SSL";
    public static final java.lang.String _HTMLINJECTION = "HTMLINJECTION";
    public static final java.lang.String _IMPORTS = "IMPORTS";
    public static final java.lang.String _MISC = "MISC";
    public static final java.lang.String _DNS = "DNS";
    public static final java.lang.String _KRB = "KRB";
    public static final java.lang.String _ALLPLUSMISC = "ALLPLUSMISC";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final SyncmodeEnum ALL = new SyncmodeEnum(_ALL);
    public static final SyncmodeEnum BOOKMARKS = new SyncmodeEnum(_BOOKMARKS);
    public static final SyncmodeEnum SSL = new SyncmodeEnum(_SSL);
    public static final SyncmodeEnum HTMLINJECTION = new SyncmodeEnum(_HTMLINJECTION);
    public static final SyncmodeEnum IMPORTS = new SyncmodeEnum(_IMPORTS);
    public static final SyncmodeEnum MISC = new SyncmodeEnum(_MISC);
    public static final SyncmodeEnum DNS = new SyncmodeEnum(_DNS);
    public static final SyncmodeEnum KRB = new SyncmodeEnum(_KRB);
    public static final SyncmodeEnum ALLPLUSMISC = new SyncmodeEnum(_ALLPLUSMISC);
    public static final SyncmodeEnum VALNOTSET = new SyncmodeEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static SyncmodeEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SyncmodeEnum enumeration = (SyncmodeEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SyncmodeEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SyncmodeEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "syncmodeEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
