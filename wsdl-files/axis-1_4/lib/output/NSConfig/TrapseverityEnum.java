/**
 * TrapseverityEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class TrapseverityEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TrapseverityEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CRITICAL = "CRITICAL";
    public static final java.lang.String _MAJOR = "MAJOR";
    public static final java.lang.String _MINOR = "MINOR";
    public static final java.lang.String _WARNING = "WARNING";
    public static final java.lang.String _INFORMATIONAL = "INFORMATIONAL";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final TrapseverityEnum CRITICAL = new TrapseverityEnum(_CRITICAL);
    public static final TrapseverityEnum MAJOR = new TrapseverityEnum(_MAJOR);
    public static final TrapseverityEnum MINOR = new TrapseverityEnum(_MINOR);
    public static final TrapseverityEnum WARNING = new TrapseverityEnum(_WARNING);
    public static final TrapseverityEnum INFORMATIONAL = new TrapseverityEnum(_INFORMATIONAL);
    public static final TrapseverityEnum VALNOTSET = new TrapseverityEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static TrapseverityEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        TrapseverityEnum enumeration = (TrapseverityEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static TrapseverityEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(TrapseverityEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "trapseverityEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
