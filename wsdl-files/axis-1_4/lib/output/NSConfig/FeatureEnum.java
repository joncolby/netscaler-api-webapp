/**
 * FeatureEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class FeatureEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FeatureEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _WL = "WL";
    public static final java.lang.String _WEBLOGGING = "WEBLOGGING";
    public static final java.lang.String _SP = "SP";
    public static final java.lang.String _SURGEPROTECTION = "SURGEPROTECTION";
    public static final java.lang.String _LB = "LB";
    public static final java.lang.String _LOADBALANCING = "LOADBALANCING";
    public static final java.lang.String _ROUTING = "ROUTING";
    public static final java.lang.String _DYNAMICROUTING = "DYNAMICROUTING";
    public static final java.lang.String _CS = "CS";
    public static final java.lang.String _CONTENTSWITCHING = "CONTENTSWITCHING";
    public static final java.lang.String _CR = "CR";
    public static final java.lang.String _CACHEREDIRECTION = "CACHEREDIRECTION";
    public static final java.lang.String _SC = "SC";
    public static final java.lang.String _SURECONNECT = "SURECONNECT";
    public static final java.lang.String _CMP = "CMP";
    public static final java.lang.String _CMPCNTL = "CMPCNTL";
    public static final java.lang.String _COMPRESSIONCONTROL = "COMPRESSIONCONTROL";
    public static final java.lang.String _PQ = "PQ";
    public static final java.lang.String _PRIORITYQUEUING = "PRIORITYQUEUING";
    public static final java.lang.String _HDOSP = "HDOSP";
    public static final java.lang.String _HTTPDOSPROTECTION = "HTTPDOSPROTECTION";
    public static final java.lang.String _SSLVPN = "SSLVPN";
    public static final java.lang.String _AAA = "AAA";
    public static final java.lang.String _GSLB = "GSLB";
    public static final java.lang.String _GLOBALSERVERLOADBALANCING = "GLOBALSERVERLOADBALANCING";
    public static final java.lang.String _SSL = "SSL";
    public static final java.lang.String _SSLOFFLOAD = "SSLOFFLOAD";
    public static final java.lang.String _SSLOFFLOADING = "SSLOFFLOADING";
    public static final java.lang.String _CF = "CF";
    public static final java.lang.String _CONTENTFILTERING = "CONTENTFILTERING";
    public static final java.lang.String _IC = "IC";
    public static final java.lang.String _INTEGRATEDCACHING = "INTEGRATEDCACHING";
    public static final java.lang.String _OSPF = "OSPF";
    public static final java.lang.String _OSPFROUTING = "OSPFROUTING";
    public static final java.lang.String _RIP = "RIP";
    public static final java.lang.String _RIPROUTING = "RIPROUTING";
    public static final java.lang.String _BGP = "BGP";
    public static final java.lang.String _BGPROUTING = "BGPROUTING";
    public static final java.lang.String _REWRITE = "REWRITE";
    public static final java.lang.String _IPV6PT = "IPV6PT";
    public static final java.lang.String _IPV6PROTOCOLTRANSLATION = "IPV6PROTOCOLTRANSLATION";
    public static final java.lang.String _APPFW = "APPFW";
    public static final java.lang.String _APPLICATIONFIREWALL = "APPLICATIONFIREWALL";
    public static final java.lang.String _RESPONDER = "RESPONDER";
    public static final java.lang.String _HTMLINJECTION = "HTMLINJECTION";
    public static final java.lang.String _PUSH = "PUSH";
    public static final java.lang.String _NSPUSH = "NSPUSH";
    public static final java.lang.String _NETSCALERPUSH = "NETSCALERPUSH";
    public static final java.lang.String _APPFLOW = "APPFLOW";
    public static final java.lang.String _CLOUDBRIDGE = "CLOUDBRIDGE";
    public static final java.lang.String _ISIS = "ISIS";
    public static final java.lang.String _ISISROUTING = "ISISROUTING";
    public static final java.lang.String _CH = "CH";
    public static final java.lang.String _CALLHOME = "CALLHOME";
    public static final java.lang.String _APPQOE = "APPQOE";
    public static final java.lang.String _VPATH = "VPATH";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final FeatureEnum WL = new FeatureEnum(_WL);
    public static final FeatureEnum WEBLOGGING = new FeatureEnum(_WEBLOGGING);
    public static final FeatureEnum SP = new FeatureEnum(_SP);
    public static final FeatureEnum SURGEPROTECTION = new FeatureEnum(_SURGEPROTECTION);
    public static final FeatureEnum LB = new FeatureEnum(_LB);
    public static final FeatureEnum LOADBALANCING = new FeatureEnum(_LOADBALANCING);
    public static final FeatureEnum ROUTING = new FeatureEnum(_ROUTING);
    public static final FeatureEnum DYNAMICROUTING = new FeatureEnum(_DYNAMICROUTING);
    public static final FeatureEnum CS = new FeatureEnum(_CS);
    public static final FeatureEnum CONTENTSWITCHING = new FeatureEnum(_CONTENTSWITCHING);
    public static final FeatureEnum CR = new FeatureEnum(_CR);
    public static final FeatureEnum CACHEREDIRECTION = new FeatureEnum(_CACHEREDIRECTION);
    public static final FeatureEnum SC = new FeatureEnum(_SC);
    public static final FeatureEnum SURECONNECT = new FeatureEnum(_SURECONNECT);
    public static final FeatureEnum CMP = new FeatureEnum(_CMP);
    public static final FeatureEnum CMPCNTL = new FeatureEnum(_CMPCNTL);
    public static final FeatureEnum COMPRESSIONCONTROL = new FeatureEnum(_COMPRESSIONCONTROL);
    public static final FeatureEnum PQ = new FeatureEnum(_PQ);
    public static final FeatureEnum PRIORITYQUEUING = new FeatureEnum(_PRIORITYQUEUING);
    public static final FeatureEnum HDOSP = new FeatureEnum(_HDOSP);
    public static final FeatureEnum HTTPDOSPROTECTION = new FeatureEnum(_HTTPDOSPROTECTION);
    public static final FeatureEnum SSLVPN = new FeatureEnum(_SSLVPN);
    public static final FeatureEnum AAA = new FeatureEnum(_AAA);
    public static final FeatureEnum GSLB = new FeatureEnum(_GSLB);
    public static final FeatureEnum GLOBALSERVERLOADBALANCING = new FeatureEnum(_GLOBALSERVERLOADBALANCING);
    public static final FeatureEnum SSL = new FeatureEnum(_SSL);
    public static final FeatureEnum SSLOFFLOAD = new FeatureEnum(_SSLOFFLOAD);
    public static final FeatureEnum SSLOFFLOADING = new FeatureEnum(_SSLOFFLOADING);
    public static final FeatureEnum CF = new FeatureEnum(_CF);
    public static final FeatureEnum CONTENTFILTERING = new FeatureEnum(_CONTENTFILTERING);
    public static final FeatureEnum IC = new FeatureEnum(_IC);
    public static final FeatureEnum INTEGRATEDCACHING = new FeatureEnum(_INTEGRATEDCACHING);
    public static final FeatureEnum OSPF = new FeatureEnum(_OSPF);
    public static final FeatureEnum OSPFROUTING = new FeatureEnum(_OSPFROUTING);
    public static final FeatureEnum RIP = new FeatureEnum(_RIP);
    public static final FeatureEnum RIPROUTING = new FeatureEnum(_RIPROUTING);
    public static final FeatureEnum BGP = new FeatureEnum(_BGP);
    public static final FeatureEnum BGPROUTING = new FeatureEnum(_BGPROUTING);
    public static final FeatureEnum REWRITE = new FeatureEnum(_REWRITE);
    public static final FeatureEnum IPV6PT = new FeatureEnum(_IPV6PT);
    public static final FeatureEnum IPV6PROTOCOLTRANSLATION = new FeatureEnum(_IPV6PROTOCOLTRANSLATION);
    public static final FeatureEnum APPFW = new FeatureEnum(_APPFW);
    public static final FeatureEnum APPLICATIONFIREWALL = new FeatureEnum(_APPLICATIONFIREWALL);
    public static final FeatureEnum RESPONDER = new FeatureEnum(_RESPONDER);
    public static final FeatureEnum HTMLINJECTION = new FeatureEnum(_HTMLINJECTION);
    public static final FeatureEnum PUSH = new FeatureEnum(_PUSH);
    public static final FeatureEnum NSPUSH = new FeatureEnum(_NSPUSH);
    public static final FeatureEnum NETSCALERPUSH = new FeatureEnum(_NETSCALERPUSH);
    public static final FeatureEnum APPFLOW = new FeatureEnum(_APPFLOW);
    public static final FeatureEnum CLOUDBRIDGE = new FeatureEnum(_CLOUDBRIDGE);
    public static final FeatureEnum ISIS = new FeatureEnum(_ISIS);
    public static final FeatureEnum ISISROUTING = new FeatureEnum(_ISISROUTING);
    public static final FeatureEnum CH = new FeatureEnum(_CH);
    public static final FeatureEnum CALLHOME = new FeatureEnum(_CALLHOME);
    public static final FeatureEnum APPQOE = new FeatureEnum(_APPQOE);
    public static final FeatureEnum VPATH = new FeatureEnum(_VPATH);
    public static final FeatureEnum VALNOTSET = new FeatureEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static FeatureEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FeatureEnum enumeration = (FeatureEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FeatureEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FeatureEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "featureEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
