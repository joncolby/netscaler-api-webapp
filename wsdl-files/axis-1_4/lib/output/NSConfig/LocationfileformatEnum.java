/**
 * LocationfileformatEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class LocationfileformatEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected LocationfileformatEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NETSCALER = "NETSCALER";
    public static final java.lang.String _IPCOUNTRY = "IPCOUNTRY";
    public static final java.lang.String _IPCOUNTRYISP = "IPCOUNTRYISP";
    public static final java.lang.String _IPCOUNTRYREGIONCITY = "IPCOUNTRYREGIONCITY";
    public static final java.lang.String _IPCOUNTRYREGIONCITYISP = "IPCOUNTRYREGIONCITYISP";
    public static final java.lang.String _GEOIPCOUNTRY = "GEOIPCOUNTRY";
    public static final java.lang.String _GEOIPREGION = "GEOIPREGION";
    public static final java.lang.String _GEOIPCITY = "GEOIPCITY";
    public static final java.lang.String _GEOIPCOUNTRYORG = "GEOIPCOUNTRYORG";
    public static final java.lang.String _GEOIPCOUNTRYISP = "GEOIPCOUNTRYISP";
    public static final java.lang.String _GEOIPCITYISPORG = "GEOIPCITYISPORG";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final LocationfileformatEnum NETSCALER = new LocationfileformatEnum(_NETSCALER);
    public static final LocationfileformatEnum IPCOUNTRY = new LocationfileformatEnum(_IPCOUNTRY);
    public static final LocationfileformatEnum IPCOUNTRYISP = new LocationfileformatEnum(_IPCOUNTRYISP);
    public static final LocationfileformatEnum IPCOUNTRYREGIONCITY = new LocationfileformatEnum(_IPCOUNTRYREGIONCITY);
    public static final LocationfileformatEnum IPCOUNTRYREGIONCITYISP = new LocationfileformatEnum(_IPCOUNTRYREGIONCITYISP);
    public static final LocationfileformatEnum GEOIPCOUNTRY = new LocationfileformatEnum(_GEOIPCOUNTRY);
    public static final LocationfileformatEnum GEOIPREGION = new LocationfileformatEnum(_GEOIPREGION);
    public static final LocationfileformatEnum GEOIPCITY = new LocationfileformatEnum(_GEOIPCITY);
    public static final LocationfileformatEnum GEOIPCOUNTRYORG = new LocationfileformatEnum(_GEOIPCOUNTRYORG);
    public static final LocationfileformatEnum GEOIPCOUNTRYISP = new LocationfileformatEnum(_GEOIPCOUNTRYISP);
    public static final LocationfileformatEnum GEOIPCITYISPORG = new LocationfileformatEnum(_GEOIPCITYISPORG);
    public static final LocationfileformatEnum VALNOTSET = new LocationfileformatEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static LocationfileformatEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        LocationfileformatEnum enumeration = (LocationfileformatEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static LocationfileformatEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(LocationfileformatEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "locationfileformatEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
