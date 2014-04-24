/**
 * UiinternalentitytypeEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class UiinternalentitytypeEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected UiinternalentitytypeEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _LBVSERVER = "LBVSERVER";
    public static final java.lang.String _GSLBVSERVER = "GSLBVSERVER";
    public static final java.lang.String _CRVSERVER = "CRVSERVER";
    public static final java.lang.String _VPNVSERVER = "VPNVSERVER";
    public static final java.lang.String _CSVSERVER = "CSVSERVER";
    public static final java.lang.String _AUTHENTICATIONVSERVER = "AUTHENTICATIONVSERVER";
    public static final java.lang.String _SERVER = "SERVER";
    public static final java.lang.String _SERVICE = "SERVICE";
    public static final java.lang.String _SERVICEGROUP = "SERVICEGROUP";
    public static final java.lang.String _GSLBSERVICE = "GSLBSERVICE";
    public static final java.lang.String _EXPRESSION = "EXPRESSION";
    public static final java.lang.String _VPNURL = "VPNURL";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final UiinternalentitytypeEnum LBVSERVER = new UiinternalentitytypeEnum(_LBVSERVER);
    public static final UiinternalentitytypeEnum GSLBVSERVER = new UiinternalentitytypeEnum(_GSLBVSERVER);
    public static final UiinternalentitytypeEnum CRVSERVER = new UiinternalentitytypeEnum(_CRVSERVER);
    public static final UiinternalentitytypeEnum VPNVSERVER = new UiinternalentitytypeEnum(_VPNVSERVER);
    public static final UiinternalentitytypeEnum CSVSERVER = new UiinternalentitytypeEnum(_CSVSERVER);
    public static final UiinternalentitytypeEnum AUTHENTICATIONVSERVER = new UiinternalentitytypeEnum(_AUTHENTICATIONVSERVER);
    public static final UiinternalentitytypeEnum SERVER = new UiinternalentitytypeEnum(_SERVER);
    public static final UiinternalentitytypeEnum SERVICE = new UiinternalentitytypeEnum(_SERVICE);
    public static final UiinternalentitytypeEnum SERVICEGROUP = new UiinternalentitytypeEnum(_SERVICEGROUP);
    public static final UiinternalentitytypeEnum GSLBSERVICE = new UiinternalentitytypeEnum(_GSLBSERVICE);
    public static final UiinternalentitytypeEnum EXPRESSION = new UiinternalentitytypeEnum(_EXPRESSION);
    public static final UiinternalentitytypeEnum VPNURL = new UiinternalentitytypeEnum(_VPNURL);
    public static final UiinternalentitytypeEnum VALNOTSET = new UiinternalentitytypeEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static UiinternalentitytypeEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        UiinternalentitytypeEnum enumeration = (UiinternalentitytypeEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static UiinternalentitytypeEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(UiinternalentitytypeEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "uiinternalentitytypeEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
