/**
 * AccessmethodEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class AccessmethodEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AccessmethodEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _DIRECT = "DIRECT";
    public static final java.lang.String _ALTERNATE = "ALTERNATE";
    public static final java.lang.String _TRANSLATED = "TRANSLATED";
    public static final java.lang.String _GATEWAYDIRECT = "GATEWAYDIRECT";
    public static final java.lang.String _GATEWAYALTERNATE = "GATEWAYALTERNATE";
    public static final java.lang.String _GATEWAYTRANSLATED = "GATEWAYTRANSLATED";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final AccessmethodEnum DIRECT = new AccessmethodEnum(_DIRECT);
    public static final AccessmethodEnum ALTERNATE = new AccessmethodEnum(_ALTERNATE);
    public static final AccessmethodEnum TRANSLATED = new AccessmethodEnum(_TRANSLATED);
    public static final AccessmethodEnum GATEWAYDIRECT = new AccessmethodEnum(_GATEWAYDIRECT);
    public static final AccessmethodEnum GATEWAYALTERNATE = new AccessmethodEnum(_GATEWAYALTERNATE);
    public static final AccessmethodEnum GATEWAYTRANSLATED = new AccessmethodEnum(_GATEWAYTRANSLATED);
    public static final AccessmethodEnum VALNOTSET = new AccessmethodEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static AccessmethodEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AccessmethodEnum enumeration = (AccessmethodEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AccessmethodEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AccessmethodEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "accessmethodEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
