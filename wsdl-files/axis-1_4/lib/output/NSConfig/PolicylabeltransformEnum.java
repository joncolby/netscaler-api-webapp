/**
 * PolicylabeltransformEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class PolicylabeltransformEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PolicylabeltransformEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _HTTPREQ = "HTTPREQ";
    public static final java.lang.String _HTTPRES = "HTTPRES";
    public static final java.lang.String _OTHERTCPREQ = "OTHERTCPREQ";
    public static final java.lang.String _OTHERTCPRES = "OTHERTCPRES";
    public static final java.lang.String _URL = "URL";
    public static final java.lang.String _TEXT = "TEXT";
    public static final java.lang.String _CLIENTLESSVPNREQ = "CLIENTLESSVPNREQ";
    public static final java.lang.String _CLIENTLESSVPNRES = "CLIENTLESSVPNRES";
    public static final java.lang.String _SIPUDPREQ = "SIPUDPREQ";
    public static final java.lang.String _SIPUDPRES = "SIPUDPRES";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final PolicylabeltransformEnum HTTPREQ = new PolicylabeltransformEnum(_HTTPREQ);
    public static final PolicylabeltransformEnum HTTPRES = new PolicylabeltransformEnum(_HTTPRES);
    public static final PolicylabeltransformEnum OTHERTCPREQ = new PolicylabeltransformEnum(_OTHERTCPREQ);
    public static final PolicylabeltransformEnum OTHERTCPRES = new PolicylabeltransformEnum(_OTHERTCPRES);
    public static final PolicylabeltransformEnum URL = new PolicylabeltransformEnum(_URL);
    public static final PolicylabeltransformEnum TEXT = new PolicylabeltransformEnum(_TEXT);
    public static final PolicylabeltransformEnum CLIENTLESSVPNREQ = new PolicylabeltransformEnum(_CLIENTLESSVPNREQ);
    public static final PolicylabeltransformEnum CLIENTLESSVPNRES = new PolicylabeltransformEnum(_CLIENTLESSVPNRES);
    public static final PolicylabeltransformEnum SIPUDPREQ = new PolicylabeltransformEnum(_SIPUDPREQ);
    public static final PolicylabeltransformEnum SIPUDPRES = new PolicylabeltransformEnum(_SIPUDPRES);
    public static final PolicylabeltransformEnum VALNOTSET = new PolicylabeltransformEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static PolicylabeltransformEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PolicylabeltransformEnum enumeration = (PolicylabeltransformEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PolicylabeltransformEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PolicylabeltransformEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "policylabeltransformEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
