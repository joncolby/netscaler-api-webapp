/**
 * Ssl_policy_label_typeEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Ssl_policy_label_typeEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Ssl_policy_label_typeEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CONTROL = "CONTROL";
    public static final java.lang.String _DATA = "DATA";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final Ssl_policy_label_typeEnum CONTROL = new Ssl_policy_label_typeEnum(_CONTROL);
    public static final Ssl_policy_label_typeEnum DATA = new Ssl_policy_label_typeEnum(_DATA);
    public static final Ssl_policy_label_typeEnum VALNOTSET = new Ssl_policy_label_typeEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static Ssl_policy_label_typeEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Ssl_policy_label_typeEnum enumeration = (Ssl_policy_label_typeEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Ssl_policy_label_typeEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Ssl_policy_label_typeEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "ssl_policy_label_typeEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
