/**
 * Ssl_params_quantumEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Ssl_params_quantumEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Ssl_params_quantumEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __4096 = "_4096";
    public static final java.lang.String __8192 = "_8192";
    public static final java.lang.String __16384 = "_16384";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final Ssl_params_quantumEnum _4096 = new Ssl_params_quantumEnum(__4096);
    public static final Ssl_params_quantumEnum _8192 = new Ssl_params_quantumEnum(__8192);
    public static final Ssl_params_quantumEnum _16384 = new Ssl_params_quantumEnum(__16384);
    public static final Ssl_params_quantumEnum VALNOTSET = new Ssl_params_quantumEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static Ssl_params_quantumEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Ssl_params_quantumEnum enumeration = (Ssl_params_quantumEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Ssl_params_quantumEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Ssl_params_quantumEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "ssl_params_quantumEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
