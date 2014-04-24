/**
 * SyslogfacilityEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class SyslogfacilityEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SyslogfacilityEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _LOCAL0 = "LOCAL0";
    public static final java.lang.String _LOCAL1 = "LOCAL1";
    public static final java.lang.String _LOCAL2 = "LOCAL2";
    public static final java.lang.String _LOCAL3 = "LOCAL3";
    public static final java.lang.String _LOCAL4 = "LOCAL4";
    public static final java.lang.String _LOCAL5 = "LOCAL5";
    public static final java.lang.String _LOCAL6 = "LOCAL6";
    public static final java.lang.String _LOCAL7 = "LOCAL7";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final SyslogfacilityEnum LOCAL0 = new SyslogfacilityEnum(_LOCAL0);
    public static final SyslogfacilityEnum LOCAL1 = new SyslogfacilityEnum(_LOCAL1);
    public static final SyslogfacilityEnum LOCAL2 = new SyslogfacilityEnum(_LOCAL2);
    public static final SyslogfacilityEnum LOCAL3 = new SyslogfacilityEnum(_LOCAL3);
    public static final SyslogfacilityEnum LOCAL4 = new SyslogfacilityEnum(_LOCAL4);
    public static final SyslogfacilityEnum LOCAL5 = new SyslogfacilityEnum(_LOCAL5);
    public static final SyslogfacilityEnum LOCAL6 = new SyslogfacilityEnum(_LOCAL6);
    public static final SyslogfacilityEnum LOCAL7 = new SyslogfacilityEnum(_LOCAL7);
    public static final SyslogfacilityEnum VALNOTSET = new SyslogfacilityEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static SyslogfacilityEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SyslogfacilityEnum enumeration = (SyslogfacilityEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SyslogfacilityEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SyslogfacilityEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "syslogfacilityEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
