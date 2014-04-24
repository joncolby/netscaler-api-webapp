/**
 * Auditloglevel1Enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Auditloglevel1Enum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Auditloglevel1Enum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _EMERGENCY = "EMERGENCY";
    public static final java.lang.String _ALERT = "ALERT";
    public static final java.lang.String _CRITICAL = "CRITICAL";
    public static final java.lang.String _ERROR = "ERROR";
    public static final java.lang.String _WARNING = "WARNING";
    public static final java.lang.String _NOTICE = "NOTICE";
    public static final java.lang.String _INFORMATIONAL = "INFORMATIONAL";
    public static final java.lang.String _DEBUG = "DEBUG";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final Auditloglevel1Enum EMERGENCY = new Auditloglevel1Enum(_EMERGENCY);
    public static final Auditloglevel1Enum ALERT = new Auditloglevel1Enum(_ALERT);
    public static final Auditloglevel1Enum CRITICAL = new Auditloglevel1Enum(_CRITICAL);
    public static final Auditloglevel1Enum ERROR = new Auditloglevel1Enum(_ERROR);
    public static final Auditloglevel1Enum WARNING = new Auditloglevel1Enum(_WARNING);
    public static final Auditloglevel1Enum NOTICE = new Auditloglevel1Enum(_NOTICE);
    public static final Auditloglevel1Enum INFORMATIONAL = new Auditloglevel1Enum(_INFORMATIONAL);
    public static final Auditloglevel1Enum DEBUG = new Auditloglevel1Enum(_DEBUG);
    public static final Auditloglevel1Enum VALNOTSET = new Auditloglevel1Enum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static Auditloglevel1Enum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Auditloglevel1Enum enumeration = (Auditloglevel1Enum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Auditloglevel1Enum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Auditloglevel1Enum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "auditloglevel1Enum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
