/**
 * MssqlversionsEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class MssqlversionsEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected MssqlversionsEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String __70 = "_70";
    public static final java.lang.String __2000 = "_2000";
    public static final java.lang.String __2000SP1 = "_2000SP1";
    public static final java.lang.String __2005 = "_2005";
    public static final java.lang.String __2008 = "_2008";
    public static final java.lang.String __2008R2 = "_2008R2";
    public static final java.lang.String __2012 = "_2012";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final MssqlversionsEnum _70 = new MssqlversionsEnum(__70);
    public static final MssqlversionsEnum _2000 = new MssqlversionsEnum(__2000);
    public static final MssqlversionsEnum _2000SP1 = new MssqlversionsEnum(__2000SP1);
    public static final MssqlversionsEnum _2005 = new MssqlversionsEnum(__2005);
    public static final MssqlversionsEnum _2008 = new MssqlversionsEnum(__2008);
    public static final MssqlversionsEnum _2008R2 = new MssqlversionsEnum(__2008R2);
    public static final MssqlversionsEnum _2012 = new MssqlversionsEnum(__2012);
    public static final MssqlversionsEnum VALNOTSET = new MssqlversionsEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static MssqlversionsEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        MssqlversionsEnum enumeration = (MssqlversionsEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static MssqlversionsEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(MssqlversionsEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "mssqlversionsEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
