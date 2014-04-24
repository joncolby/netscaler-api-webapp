/**
 * AppseclearningchecktypeEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class AppseclearningchecktypeEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AppseclearningchecktypeEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _STARTURL = "STARTURL";
    public static final java.lang.String _COOKIECONSISTENCY = "COOKIECONSISTENCY";
    public static final java.lang.String _FIELDCONSISTENCY = "FIELDCONSISTENCY";
    public static final java.lang.String _CROSSSITESCRIPTING = "CROSSSITESCRIPTING";
    public static final java.lang.String _SQLINJECTION = "SQLINJECTION";
    public static final java.lang.String _FIELDFORMAT = "FIELDFORMAT";
    public static final java.lang.String _CSRFTAG = "CSRFTAG";
    public static final java.lang.String _XMLDOSCHECK = "XMLDOSCHECK";
    public static final java.lang.String _XMLWSICHECK = "XMLWSICHECK";
    public static final java.lang.String _XMLATTACHMENTCHECK = "XMLATTACHMENTCHECK";
    public static final java.lang.String _TOTALXMLREQUESTS = "TOTALXMLREQUESTS";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final AppseclearningchecktypeEnum STARTURL = new AppseclearningchecktypeEnum(_STARTURL);
    public static final AppseclearningchecktypeEnum COOKIECONSISTENCY = new AppseclearningchecktypeEnum(_COOKIECONSISTENCY);
    public static final AppseclearningchecktypeEnum FIELDCONSISTENCY = new AppseclearningchecktypeEnum(_FIELDCONSISTENCY);
    public static final AppseclearningchecktypeEnum CROSSSITESCRIPTING = new AppseclearningchecktypeEnum(_CROSSSITESCRIPTING);
    public static final AppseclearningchecktypeEnum SQLINJECTION = new AppseclearningchecktypeEnum(_SQLINJECTION);
    public static final AppseclearningchecktypeEnum FIELDFORMAT = new AppseclearningchecktypeEnum(_FIELDFORMAT);
    public static final AppseclearningchecktypeEnum CSRFTAG = new AppseclearningchecktypeEnum(_CSRFTAG);
    public static final AppseclearningchecktypeEnum XMLDOSCHECK = new AppseclearningchecktypeEnum(_XMLDOSCHECK);
    public static final AppseclearningchecktypeEnum XMLWSICHECK = new AppseclearningchecktypeEnum(_XMLWSICHECK);
    public static final AppseclearningchecktypeEnum XMLATTACHMENTCHECK = new AppseclearningchecktypeEnum(_XMLATTACHMENTCHECK);
    public static final AppseclearningchecktypeEnum TOTALXMLREQUESTS = new AppseclearningchecktypeEnum(_TOTALXMLREQUESTS);
    public static final AppseclearningchecktypeEnum VALNOTSET = new AppseclearningchecktypeEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static AppseclearningchecktypeEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AppseclearningchecktypeEnum enumeration = (AppseclearningchecktypeEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AppseclearningchecktypeEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(AppseclearningchecktypeEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "appseclearningchecktypeEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
