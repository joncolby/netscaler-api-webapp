/**
 * IfspeedEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class IfspeedEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected IfspeedEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AUTO = "AUTO";
    public static final java.lang.String __10 = "_10";
    public static final java.lang.String __100 = "_100";
    public static final java.lang.String __1000 = "_1000";
    public static final java.lang.String __10000 = "_10000";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final IfspeedEnum AUTO = new IfspeedEnum(_AUTO);
    public static final IfspeedEnum _10 = new IfspeedEnum(__10);
    public static final IfspeedEnum _100 = new IfspeedEnum(__100);
    public static final IfspeedEnum _1000 = new IfspeedEnum(__1000);
    public static final IfspeedEnum _10000 = new IfspeedEnum(__10000);
    public static final IfspeedEnum VALNOTSET = new IfspeedEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static IfspeedEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        IfspeedEnum enumeration = (IfspeedEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static IfspeedEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(IfspeedEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "ifspeedEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
