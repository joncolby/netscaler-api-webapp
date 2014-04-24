/**
 * Ssl_push_enc_triggerEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Ssl_push_enc_triggerEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Ssl_push_enc_triggerEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ALWAYS = "ALWAYS";
    public static final java.lang.String _MERGE = "MERGE";
    public static final java.lang.String _IGNORE = "IGNORE";
    public static final java.lang.String _TIMER = "TIMER";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final Ssl_push_enc_triggerEnum ALWAYS = new Ssl_push_enc_triggerEnum(_ALWAYS);
    public static final Ssl_push_enc_triggerEnum MERGE = new Ssl_push_enc_triggerEnum(_MERGE);
    public static final Ssl_push_enc_triggerEnum IGNORE = new Ssl_push_enc_triggerEnum(_IGNORE);
    public static final Ssl_push_enc_triggerEnum TIMER = new Ssl_push_enc_triggerEnum(_TIMER);
    public static final Ssl_push_enc_triggerEnum VALNOTSET = new Ssl_push_enc_triggerEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static Ssl_push_enc_triggerEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Ssl_push_enc_triggerEnum enumeration = (Ssl_push_enc_triggerEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Ssl_push_enc_triggerEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Ssl_push_enc_triggerEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "ssl_push_enc_triggerEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
