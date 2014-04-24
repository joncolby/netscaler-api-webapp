/**
 * Dynamic_wt_optionsEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Dynamic_wt_optionsEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Dynamic_wt_optionsEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _SERVICECOUNT = "SERVICECOUNT";
    public static final java.lang.String _SERVICEWEIGHT = "SERVICEWEIGHT";
    public static final java.lang.String _DISABLED = "DISABLED";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final Dynamic_wt_optionsEnum SERVICECOUNT = new Dynamic_wt_optionsEnum(_SERVICECOUNT);
    public static final Dynamic_wt_optionsEnum SERVICEWEIGHT = new Dynamic_wt_optionsEnum(_SERVICEWEIGHT);
    public static final Dynamic_wt_optionsEnum DISABLED = new Dynamic_wt_optionsEnum(_DISABLED);
    public static final Dynamic_wt_optionsEnum VALNOTSET = new Dynamic_wt_optionsEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static Dynamic_wt_optionsEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        Dynamic_wt_optionsEnum enumeration = (Dynamic_wt_optionsEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static Dynamic_wt_optionsEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(Dynamic_wt_optionsEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "dynamic_wt_optionsEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
