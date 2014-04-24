/**
 * ActionrespondertypeEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class ActionrespondertypeEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ActionrespondertypeEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NOOP = "NOOP";
    public static final java.lang.String _RESPONDWITH = "RESPONDWITH";
    public static final java.lang.String _REDIRECT = "REDIRECT";
    public static final java.lang.String _RESPONDWITHHTMLPAGE = "RESPONDWITHHTMLPAGE";
    public static final java.lang.String _SQLRESPONSEOK = "SQLRESPONSEOK";
    public static final java.lang.String _SQLRESPONSEERROR = "SQLRESPONSEERROR";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final ActionrespondertypeEnum NOOP = new ActionrespondertypeEnum(_NOOP);
    public static final ActionrespondertypeEnum RESPONDWITH = new ActionrespondertypeEnum(_RESPONDWITH);
    public static final ActionrespondertypeEnum REDIRECT = new ActionrespondertypeEnum(_REDIRECT);
    public static final ActionrespondertypeEnum RESPONDWITHHTMLPAGE = new ActionrespondertypeEnum(_RESPONDWITHHTMLPAGE);
    public static final ActionrespondertypeEnum SQLRESPONSEOK = new ActionrespondertypeEnum(_SQLRESPONSEOK);
    public static final ActionrespondertypeEnum SQLRESPONSEERROR = new ActionrespondertypeEnum(_SQLRESPONSEERROR);
    public static final ActionrespondertypeEnum VALNOTSET = new ActionrespondertypeEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static ActionrespondertypeEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ActionrespondertypeEnum enumeration = (ActionrespondertypeEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ActionrespondertypeEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ActionrespondertypeEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "actionrespondertypeEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
