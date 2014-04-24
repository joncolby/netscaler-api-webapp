/**
 * DnsseckeytypesEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class DnsseckeytypesEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected DnsseckeytypesEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _KSK = "KSK";
    public static final java.lang.String _KEYSIGNINGKEY = "KEYSIGNINGKEY";
    public static final java.lang.String _ZSK = "ZSK";
    public static final java.lang.String _ZONESIGNINGKEY = "ZONESIGNINGKEY";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final DnsseckeytypesEnum KSK = new DnsseckeytypesEnum(_KSK);
    public static final DnsseckeytypesEnum KEYSIGNINGKEY = new DnsseckeytypesEnum(_KEYSIGNINGKEY);
    public static final DnsseckeytypesEnum ZSK = new DnsseckeytypesEnum(_ZSK);
    public static final DnsseckeytypesEnum ZONESIGNINGKEY = new DnsseckeytypesEnum(_ZONESIGNINGKEY);
    public static final DnsseckeytypesEnum VALNOTSET = new DnsseckeytypesEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static DnsseckeytypesEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        DnsseckeytypesEnum enumeration = (DnsseckeytypesEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static DnsseckeytypesEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(DnsseckeytypesEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "dnsseckeytypesEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
