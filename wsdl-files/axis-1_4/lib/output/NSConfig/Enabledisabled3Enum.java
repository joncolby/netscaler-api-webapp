/**
 * Enabledisabled3Enum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Enabledisabled3Enum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Enabledisabled3Enum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ENABLED = "ENABLED";
    public static final java.lang.String _DISABLED = "DISABLED";
    public static final java.lang.String _UNSET = "UNSET";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final Enabledisabled3Enum ENABLED = new Enabledisabled3Enum(_ENABLED);
    public static final Enabledisabled3Enum DISABLED = new Enabledisabled3Enum(_DISABLED);
    public static final Enabledisabled3Enum UNSET = new Enabledisabled3Enum(_UNSET);
    public static final Enabledisabled3Enum VALNOTSET = new Enabledisabled3Enum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static Enabledisabled3Enum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Enabledisabled3Enum enumeration = (Enabledisabled3Enum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Enabledisabled3Enum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Enabledisabled3Enum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "enabledisabled3Enum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
