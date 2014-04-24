/**
 * ActionrewritetypeEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class ActionrewritetypeEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ActionrewritetypeEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _NOOP = "NOOP";
    public static final java.lang.String _DELETE = "DELETE";
    public static final java.lang.String _INSERTHTTPHEADER = "INSERTHTTPHEADER";
    public static final java.lang.String _DELETEHTTPHEADER = "DELETEHTTPHEADER";
    public static final java.lang.String _CORRUPTHTTPHEADER = "CORRUPTHTTPHEADER";
    public static final java.lang.String _INSERTBEFORE = "INSERTBEFORE";
    public static final java.lang.String _INSERTAFTER = "INSERTAFTER";
    public static final java.lang.String _REPLACE = "REPLACE";
    public static final java.lang.String _REPLACEHTTPRES = "REPLACEHTTPRES";
    public static final java.lang.String _DELETEALL = "DELETEALL";
    public static final java.lang.String _REPLACEALL = "REPLACEALL";
    public static final java.lang.String _INSERTBEFOREALL = "INSERTBEFOREALL";
    public static final java.lang.String _INSERTAFTERALL = "INSERTAFTERALL";
    public static final java.lang.String _CLIENTLESSVPNENCODE = "CLIENTLESSVPNENCODE";
    public static final java.lang.String _CLIENTLESSVPNENCODEALL = "CLIENTLESSVPNENCODEALL";
    public static final java.lang.String _CLIENTLESSVPNDECODE = "CLIENTLESSVPNDECODE";
    public static final java.lang.String _CLIENTLESSVPNDECODEALL = "CLIENTLESSVPNDECODEALL";
    public static final java.lang.String _INSERTSIPHEADER = "INSERTSIPHEADER";
    public static final java.lang.String _DELETESIPHEADER = "DELETESIPHEADER";
    public static final java.lang.String _CORRUPTSIPHEADER = "CORRUPTSIPHEADER";
    public static final java.lang.String _REPLACESIPRES = "REPLACESIPRES";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final ActionrewritetypeEnum NOOP = new ActionrewritetypeEnum(_NOOP);
    public static final ActionrewritetypeEnum DELETE = new ActionrewritetypeEnum(_DELETE);
    public static final ActionrewritetypeEnum INSERTHTTPHEADER = new ActionrewritetypeEnum(_INSERTHTTPHEADER);
    public static final ActionrewritetypeEnum DELETEHTTPHEADER = new ActionrewritetypeEnum(_DELETEHTTPHEADER);
    public static final ActionrewritetypeEnum CORRUPTHTTPHEADER = new ActionrewritetypeEnum(_CORRUPTHTTPHEADER);
    public static final ActionrewritetypeEnum INSERTBEFORE = new ActionrewritetypeEnum(_INSERTBEFORE);
    public static final ActionrewritetypeEnum INSERTAFTER = new ActionrewritetypeEnum(_INSERTAFTER);
    public static final ActionrewritetypeEnum REPLACE = new ActionrewritetypeEnum(_REPLACE);
    public static final ActionrewritetypeEnum REPLACEHTTPRES = new ActionrewritetypeEnum(_REPLACEHTTPRES);
    public static final ActionrewritetypeEnum DELETEALL = new ActionrewritetypeEnum(_DELETEALL);
    public static final ActionrewritetypeEnum REPLACEALL = new ActionrewritetypeEnum(_REPLACEALL);
    public static final ActionrewritetypeEnum INSERTBEFOREALL = new ActionrewritetypeEnum(_INSERTBEFOREALL);
    public static final ActionrewritetypeEnum INSERTAFTERALL = new ActionrewritetypeEnum(_INSERTAFTERALL);
    public static final ActionrewritetypeEnum CLIENTLESSVPNENCODE = new ActionrewritetypeEnum(_CLIENTLESSVPNENCODE);
    public static final ActionrewritetypeEnum CLIENTLESSVPNENCODEALL = new ActionrewritetypeEnum(_CLIENTLESSVPNENCODEALL);
    public static final ActionrewritetypeEnum CLIENTLESSVPNDECODE = new ActionrewritetypeEnum(_CLIENTLESSVPNDECODE);
    public static final ActionrewritetypeEnum CLIENTLESSVPNDECODEALL = new ActionrewritetypeEnum(_CLIENTLESSVPNDECODEALL);
    public static final ActionrewritetypeEnum INSERTSIPHEADER = new ActionrewritetypeEnum(_INSERTSIPHEADER);
    public static final ActionrewritetypeEnum DELETESIPHEADER = new ActionrewritetypeEnum(_DELETESIPHEADER);
    public static final ActionrewritetypeEnum CORRUPTSIPHEADER = new ActionrewritetypeEnum(_CORRUPTSIPHEADER);
    public static final ActionrewritetypeEnum REPLACESIPRES = new ActionrewritetypeEnum(_REPLACESIPRES);
    public static final ActionrewritetypeEnum VALNOTSET = new ActionrewritetypeEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static ActionrewritetypeEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ActionrewritetypeEnum enumeration = (ActionrewritetypeEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ActionrewritetypeEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ActionrewritetypeEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "actionrewritetypeEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
