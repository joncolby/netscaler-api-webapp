/**
 * AppsecdispositionobjectexpressionEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class AppsecdispositionobjectexpressionEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AppsecdispositionobjectexpressionEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NONE = "NONE";
    public static final java.lang.String _BLOCK = "BLOCK";
    public static final java.lang.String _LOG = "LOG";
    public static final java.lang.String _REMOVE = "REMOVE";
    public static final java.lang.String _STATS = "STATS";
    public static final java.lang.String _XOUT = "XOUT";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final AppsecdispositionobjectexpressionEnum NONE = new AppsecdispositionobjectexpressionEnum(_NONE);
    public static final AppsecdispositionobjectexpressionEnum BLOCK = new AppsecdispositionobjectexpressionEnum(_BLOCK);
    public static final AppsecdispositionobjectexpressionEnum LOG = new AppsecdispositionobjectexpressionEnum(_LOG);
    public static final AppsecdispositionobjectexpressionEnum REMOVE = new AppsecdispositionobjectexpressionEnum(_REMOVE);
    public static final AppsecdispositionobjectexpressionEnum STATS = new AppsecdispositionobjectexpressionEnum(_STATS);
    public static final AppsecdispositionobjectexpressionEnum XOUT = new AppsecdispositionobjectexpressionEnum(_XOUT);
    public static final AppsecdispositionobjectexpressionEnum VALNOTSET = new AppsecdispositionobjectexpressionEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static AppsecdispositionobjectexpressionEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AppsecdispositionobjectexpressionEnum enumeration = (AppsecdispositionobjectexpressionEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AppsecdispositionobjectexpressionEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AppsecdispositionobjectexpressionEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "appsecdispositionobjectexpressionEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
