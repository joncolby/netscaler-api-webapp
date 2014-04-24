/**
 * AuditloglevelEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class AuditloglevelEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AuditloglevelEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ALL = "ALL";
    public static final java.lang.String _EMERGENCY = "EMERGENCY";
    public static final java.lang.String _ALERT = "ALERT";
    public static final java.lang.String _CRITICAL = "CRITICAL";
    public static final java.lang.String _ERROR = "ERROR";
    public static final java.lang.String _WARNING = "WARNING";
    public static final java.lang.String _NOTICE = "NOTICE";
    public static final java.lang.String _INFORMATIONAL = "INFORMATIONAL";
    public static final java.lang.String _DEBUG = "DEBUG";
    public static final java.lang.String _NONE = "NONE";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final AuditloglevelEnum ALL = new AuditloglevelEnum(_ALL);
    public static final AuditloglevelEnum EMERGENCY = new AuditloglevelEnum(_EMERGENCY);
    public static final AuditloglevelEnum ALERT = new AuditloglevelEnum(_ALERT);
    public static final AuditloglevelEnum CRITICAL = new AuditloglevelEnum(_CRITICAL);
    public static final AuditloglevelEnum ERROR = new AuditloglevelEnum(_ERROR);
    public static final AuditloglevelEnum WARNING = new AuditloglevelEnum(_WARNING);
    public static final AuditloglevelEnum NOTICE = new AuditloglevelEnum(_NOTICE);
    public static final AuditloglevelEnum INFORMATIONAL = new AuditloglevelEnum(_INFORMATIONAL);
    public static final AuditloglevelEnum DEBUG = new AuditloglevelEnum(_DEBUG);
    public static final AuditloglevelEnum NONE = new AuditloglevelEnum(_NONE);
    public static final AuditloglevelEnum VALNOTSET = new AuditloglevelEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static AuditloglevelEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AuditloglevelEnum enumeration = (AuditloglevelEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AuditloglevelEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AuditloglevelEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "auditloglevelEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
