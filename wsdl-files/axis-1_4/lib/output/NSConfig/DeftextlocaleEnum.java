/**
 * DeftextlocaleEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class DeftextlocaleEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DeftextlocaleEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _GERMAN = "GERMAN";
    public static final java.lang.String _ENGLISH = "ENGLISH";
    public static final java.lang.String _SPANISH = "SPANISH";
    public static final java.lang.String _FRENCH = "FRENCH";
    public static final java.lang.String _JAPANESE = "JAPANESE";
    public static final java.lang.String _KOREAN = "KOREAN";
    public static final java.lang.String _RUSSIAN = "RUSSIAN";
    public static final java.lang.String _CHINESESIMPLIFIED = "CHINESESIMPLIFIED";
    public static final java.lang.String _CHINESETRADITIONAL = "CHINESETRADITIONAL";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final DeftextlocaleEnum GERMAN = new DeftextlocaleEnum(_GERMAN);
    public static final DeftextlocaleEnum ENGLISH = new DeftextlocaleEnum(_ENGLISH);
    public static final DeftextlocaleEnum SPANISH = new DeftextlocaleEnum(_SPANISH);
    public static final DeftextlocaleEnum FRENCH = new DeftextlocaleEnum(_FRENCH);
    public static final DeftextlocaleEnum JAPANESE = new DeftextlocaleEnum(_JAPANESE);
    public static final DeftextlocaleEnum KOREAN = new DeftextlocaleEnum(_KOREAN);
    public static final DeftextlocaleEnum RUSSIAN = new DeftextlocaleEnum(_RUSSIAN);
    public static final DeftextlocaleEnum CHINESESIMPLIFIED = new DeftextlocaleEnum(_CHINESESIMPLIFIED);
    public static final DeftextlocaleEnum CHINESETRADITIONAL = new DeftextlocaleEnum(_CHINESETRADITIONAL);
    public static final DeftextlocaleEnum VALNOTSET = new DeftextlocaleEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static DeftextlocaleEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DeftextlocaleEnum enumeration = (DeftextlocaleEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DeftextlocaleEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DeftextlocaleEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "deftextlocaleEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
