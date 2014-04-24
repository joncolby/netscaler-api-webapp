/**
 * VpnvserverbindpointEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class VpnvserverbindpointEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected VpnvserverbindpointEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _REQUEST = "REQUEST";
    public static final java.lang.String _RESPONSE = "RESPONSE";
    public static final java.lang.String _ICAREQUEST = "ICAREQUEST";
    public static final java.lang.String _OTHERTCPREQUEST = "OTHERTCPREQUEST";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final VpnvserverbindpointEnum REQUEST = new VpnvserverbindpointEnum(_REQUEST);
    public static final VpnvserverbindpointEnum RESPONSE = new VpnvserverbindpointEnum(_RESPONSE);
    public static final VpnvserverbindpointEnum ICAREQUEST = new VpnvserverbindpointEnum(_ICAREQUEST);
    public static final VpnvserverbindpointEnum OTHERTCPREQUEST = new VpnvserverbindpointEnum(_OTHERTCPREQUEST);
    public static final VpnvserverbindpointEnum VALNOTSET = new VpnvserverbindpointEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static VpnvserverbindpointEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        VpnvserverbindpointEnum enumeration = (VpnvserverbindpointEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static VpnvserverbindpointEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(VpnvserverbindpointEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "vpnvserverbindpointEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
