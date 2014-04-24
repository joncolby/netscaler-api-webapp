/**
 * ThresholdsEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class ThresholdsEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ThresholdsEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CPUUSAGE = "CPUUSAGE";
    public static final java.lang.String _AVERAGECPU = "AVERAGECPU";
    public static final java.lang.String _MEMORY = "MEMORY";
    public static final java.lang.String _MGMTCPUUSAGE = "MGMTCPUUSAGE";
    public static final java.lang.String _SYNFLOOD = "SYNFLOOD";
    public static final java.lang.String _VSERVERREQRATE = "VSERVERREQRATE";
    public static final java.lang.String _SERVICEREQRATE = "SERVICEREQRATE";
    public static final java.lang.String _ENTITYRXRATE = "ENTITYRXRATE";
    public static final java.lang.String _ENTITYTXRATE = "ENTITYTXRATE";
    public static final java.lang.String _ENTITYSYNFLOOD = "ENTITYSYNFLOOD";
    public static final java.lang.String _SERVICEMAXCLIENTS = "SERVICEMAXCLIENTS";
    public static final java.lang.String _HASTATECHANGE = "HASTATECHANGE";
    public static final java.lang.String _ENTITYSTATE = "ENTITYSTATE";
    public static final java.lang.String _CONFIGCHANGE = "CONFIGCHANGE";
    public static final java.lang.String _CONFIGSAVE = "CONFIGSAVE";
    public static final java.lang.String _SERVICEGROUPMEMBERREQRATE = "SERVICEGROUPMEMBERREQRATE";
    public static final java.lang.String _SERVICEGROUPMEMBERMAXCLIENTS = "SERVICEGROUPMEMBERMAXCLIENTS";
    public static final java.lang.String _MONITORRTOTHRESHOLD = "MONITORRTOTHRESHOLD";
    public static final java.lang.String _LOGINFAILURE = "LOGINFAILURE";
    public static final java.lang.String _SSLCERTEXPIRY = "SSLCERTEXPIRY";
    public static final java.lang.String _FANSPEEDLOW = "FANSPEEDLOW";
    public static final java.lang.String _VOLTAGELOW = "VOLTAGELOW";
    public static final java.lang.String _VOLTAGEHIGH = "VOLTAGEHIGH";
    public static final java.lang.String _TEMPERATUREHIGH = "TEMPERATUREHIGH";
    public static final java.lang.String _CPUTEMPERATUREHIGH = "CPUTEMPERATUREHIGH";
    public static final java.lang.String _POWERSUPPLYFAILURE = "POWERSUPPLYFAILURE";
    public static final java.lang.String _DISKUSAGEHIGH = "DISKUSAGEHIGH";
    public static final java.lang.String _INTERFACETHROUGHPUTLOW = "INTERFACETHROUGHPUTLOW";
    public static final java.lang.String _MONPROBEFAILED = "MONPROBEFAILED";
    public static final java.lang.String _HAVERSIONMISMATCH = "HAVERSIONMISMATCH";
    public static final java.lang.String _HASYNCFAILURE = "HASYNCFAILURE";
    public static final java.lang.String _HANOHEARTBEATS = "HANOHEARTBEATS";
    public static final java.lang.String _HABADSECONDARYSTATE = "HABADSECONDARYSTATE";
    public static final java.lang.String _INTERFACEBWUSAGE = "INTERFACEBWUSAGE";
    public static final java.lang.String _RATELIMITTHRESHOLDEXCEEDED = "RATELIMITTHRESHOLDEXCEEDED";
    public static final java.lang.String _ENTITYNAMECHANGE = "ENTITYNAMECHANGE";
    public static final java.lang.String _HAPROPFAILURE = "HAPROPFAILURE";
    public static final java.lang.String _IPCONFLICT = "IPCONFLICT";
    public static final java.lang.String _PFRLRATETHRESHOLD = "PFRLRATETHRESHOLD";
    public static final java.lang.String _PFRLPPSTHRESHOLD = "PFRLPPSTHRESHOLD";
    public static final java.lang.String _PFRLRATEPKTSDROPPED = "PFRLRATEPKTSDROPPED";
    public static final java.lang.String _PFRLPPSPKTSDROPPED = "PFRLPPSPKTSDROPPED";
    public static final java.lang.String _APPFWSTARTURL = "APPFWSTARTURL";
    public static final java.lang.String _APPFWDENYURL = "APPFWDENYURL";
    public static final java.lang.String _APPFWVIOLATIONSTYPE = "APPFWVIOLATIONSTYPE";
    public static final java.lang.String _APPFWREFERERHEADER = "APPFWREFERERHEADER";
    public static final java.lang.String _APPFWCSRFTAG = "APPFWCSRFTAG";
    public static final java.lang.String _APPFWCOOKIE = "APPFWCOOKIE";
    public static final java.lang.String _APPFWFIELDCONSISTENCY = "APPFWFIELDCONSISTENCY";
    public static final java.lang.String _APPFWBUFFEROVERFLOW = "APPFWBUFFEROVERFLOW";
    public static final java.lang.String _APPFWFIELDFORMAT = "APPFWFIELDFORMAT";
    public static final java.lang.String _APPFWSAFECOMMERCE = "APPFWSAFECOMMERCE";
    public static final java.lang.String _APPFWSAFEOBJECT = "APPFWSAFEOBJECT";
    public static final java.lang.String _APPFWPOLICYHIT = "APPFWPOLICYHIT";
    public static final java.lang.String _APPFWXSS = "APPFWXSS";
    public static final java.lang.String _APPFWXMLXSS = "APPFWXMLXSS";
    public static final java.lang.String _APPFWSQL = "APPFWSQL";
    public static final java.lang.String _APPFWXMLSQL = "APPFWXMLSQL";
    public static final java.lang.String _APPFWXMLATTACHMENT = "APPFWXMLATTACHMENT";
    public static final java.lang.String _APPFWXMLDOS = "APPFWXMLDOS";
    public static final java.lang.String _APPFWXMLVALIDATION = "APPFWXMLVALIDATION";
    public static final java.lang.String _APPFWXMLWSI = "APPFWXMLWSI";
    public static final java.lang.String _APPFWXMLSCHEMACOMPILE = "APPFWXMLSCHEMACOMPILE";
    public static final java.lang.String _APPFWXMLSOAPFAULT = "APPFWXMLSOAPFAULT";
    public static final java.lang.String _DNSKEYEXPIRY = "DNSKEYEXPIRY";
    public static final java.lang.String _DATASTREAMRATELIMITHIT = "DATASTREAMRATELIMITHIT";
    public static final java.lang.String _HALICENSEMISMATCH = "HALICENSEMISMATCH";
    public static final java.lang.String _SSLCARDFAILED = "SSLCARDFAILED";
    public static final java.lang.String _SSLCARDNORMAL = "SSLCARDNORMAL";
    public static final java.lang.String _WARMRESTARTEVENT = "WARMRESTARTEVENT";
    public static final java.lang.String _HARDDISKDRIVEERRORS = "HARDDISKDRIVEERRORS";
    public static final java.lang.String _COMPACTFLASHERRORS = "COMPACTFLASHERRORS";
    public static final java.lang.String _CALLHOMEUPLOADEVENT = "CALLHOMEUPLOADEVENT";
    public static final java.lang.String __1024KEYEXCHANGERATE = "_1024KEYEXCHANGERATE";
    public static final java.lang.String __2048KEYEXCHANGERATE = "_2048KEYEXCHANGERATE";
    public static final java.lang.String __4096KEYEXCHANGERATE = "_4096KEYEXCHANGERATE";
    public static final java.lang.String _SSLCURSESSIONINUSE = "SSLCURSESSIONINUSE";
    public static final java.lang.String _CLUSTERNODEHEALTH = "CLUSTERNODEHEALTH";
    public static final java.lang.String _CLUSTERNODEQUORUM = "CLUSTERNODEQUORUM";
    public static final java.lang.String _CLUSTERVERSIONMISMATCH = "CLUSTERVERSIONMISMATCH";
    public static final java.lang.String _CLUSTERCCOCHANGE = "CLUSTERCCOCHANGE";
    public static final java.lang.String _CLUSTEROVSCHANGE = "CLUSTEROVSCHANGE";
    public static final java.lang.String _CLUSTERSYNCFAILURE = "CLUSTERSYNCFAILURE";
    public static final java.lang.String _CLUSTERPROPFAILURE = "CLUSTERPROPFAILURE";
    public static final java.lang.String _HASTICKYPRIMARY = "HASTICKYPRIMARY";
    public static final java.lang.String _INBANDPROTOCOLVERSIONMISMATCH = "INBANDPROTOCOLVERSIONMISMATCH";
    public static final java.lang.String _SSLCHIPREINIT = "SSLCHIPREINIT";
    public static final java.lang.String _VRIDSTATECHANGE = "VRIDSTATECHANGE";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final ThresholdsEnum CPUUSAGE = new ThresholdsEnum(_CPUUSAGE);
    public static final ThresholdsEnum AVERAGECPU = new ThresholdsEnum(_AVERAGECPU);
    public static final ThresholdsEnum MEMORY = new ThresholdsEnum(_MEMORY);
    public static final ThresholdsEnum MGMTCPUUSAGE = new ThresholdsEnum(_MGMTCPUUSAGE);
    public static final ThresholdsEnum SYNFLOOD = new ThresholdsEnum(_SYNFLOOD);
    public static final ThresholdsEnum VSERVERREQRATE = new ThresholdsEnum(_VSERVERREQRATE);
    public static final ThresholdsEnum SERVICEREQRATE = new ThresholdsEnum(_SERVICEREQRATE);
    public static final ThresholdsEnum ENTITYRXRATE = new ThresholdsEnum(_ENTITYRXRATE);
    public static final ThresholdsEnum ENTITYTXRATE = new ThresholdsEnum(_ENTITYTXRATE);
    public static final ThresholdsEnum ENTITYSYNFLOOD = new ThresholdsEnum(_ENTITYSYNFLOOD);
    public static final ThresholdsEnum SERVICEMAXCLIENTS = new ThresholdsEnum(_SERVICEMAXCLIENTS);
    public static final ThresholdsEnum HASTATECHANGE = new ThresholdsEnum(_HASTATECHANGE);
    public static final ThresholdsEnum ENTITYSTATE = new ThresholdsEnum(_ENTITYSTATE);
    public static final ThresholdsEnum CONFIGCHANGE = new ThresholdsEnum(_CONFIGCHANGE);
    public static final ThresholdsEnum CONFIGSAVE = new ThresholdsEnum(_CONFIGSAVE);
    public static final ThresholdsEnum SERVICEGROUPMEMBERREQRATE = new ThresholdsEnum(_SERVICEGROUPMEMBERREQRATE);
    public static final ThresholdsEnum SERVICEGROUPMEMBERMAXCLIENTS = new ThresholdsEnum(_SERVICEGROUPMEMBERMAXCLIENTS);
    public static final ThresholdsEnum MONITORRTOTHRESHOLD = new ThresholdsEnum(_MONITORRTOTHRESHOLD);
    public static final ThresholdsEnum LOGINFAILURE = new ThresholdsEnum(_LOGINFAILURE);
    public static final ThresholdsEnum SSLCERTEXPIRY = new ThresholdsEnum(_SSLCERTEXPIRY);
    public static final ThresholdsEnum FANSPEEDLOW = new ThresholdsEnum(_FANSPEEDLOW);
    public static final ThresholdsEnum VOLTAGELOW = new ThresholdsEnum(_VOLTAGELOW);
    public static final ThresholdsEnum VOLTAGEHIGH = new ThresholdsEnum(_VOLTAGEHIGH);
    public static final ThresholdsEnum TEMPERATUREHIGH = new ThresholdsEnum(_TEMPERATUREHIGH);
    public static final ThresholdsEnum CPUTEMPERATUREHIGH = new ThresholdsEnum(_CPUTEMPERATUREHIGH);
    public static final ThresholdsEnum POWERSUPPLYFAILURE = new ThresholdsEnum(_POWERSUPPLYFAILURE);
    public static final ThresholdsEnum DISKUSAGEHIGH = new ThresholdsEnum(_DISKUSAGEHIGH);
    public static final ThresholdsEnum INTERFACETHROUGHPUTLOW = new ThresholdsEnum(_INTERFACETHROUGHPUTLOW);
    public static final ThresholdsEnum MONPROBEFAILED = new ThresholdsEnum(_MONPROBEFAILED);
    public static final ThresholdsEnum HAVERSIONMISMATCH = new ThresholdsEnum(_HAVERSIONMISMATCH);
    public static final ThresholdsEnum HASYNCFAILURE = new ThresholdsEnum(_HASYNCFAILURE);
    public static final ThresholdsEnum HANOHEARTBEATS = new ThresholdsEnum(_HANOHEARTBEATS);
    public static final ThresholdsEnum HABADSECONDARYSTATE = new ThresholdsEnum(_HABADSECONDARYSTATE);
    public static final ThresholdsEnum INTERFACEBWUSAGE = new ThresholdsEnum(_INTERFACEBWUSAGE);
    public static final ThresholdsEnum RATELIMITTHRESHOLDEXCEEDED = new ThresholdsEnum(_RATELIMITTHRESHOLDEXCEEDED);
    public static final ThresholdsEnum ENTITYNAMECHANGE = new ThresholdsEnum(_ENTITYNAMECHANGE);
    public static final ThresholdsEnum HAPROPFAILURE = new ThresholdsEnum(_HAPROPFAILURE);
    public static final ThresholdsEnum IPCONFLICT = new ThresholdsEnum(_IPCONFLICT);
    public static final ThresholdsEnum PFRLRATETHRESHOLD = new ThresholdsEnum(_PFRLRATETHRESHOLD);
    public static final ThresholdsEnum PFRLPPSTHRESHOLD = new ThresholdsEnum(_PFRLPPSTHRESHOLD);
    public static final ThresholdsEnum PFRLRATEPKTSDROPPED = new ThresholdsEnum(_PFRLRATEPKTSDROPPED);
    public static final ThresholdsEnum PFRLPPSPKTSDROPPED = new ThresholdsEnum(_PFRLPPSPKTSDROPPED);
    public static final ThresholdsEnum APPFWSTARTURL = new ThresholdsEnum(_APPFWSTARTURL);
    public static final ThresholdsEnum APPFWDENYURL = new ThresholdsEnum(_APPFWDENYURL);
    public static final ThresholdsEnum APPFWVIOLATIONSTYPE = new ThresholdsEnum(_APPFWVIOLATIONSTYPE);
    public static final ThresholdsEnum APPFWREFERERHEADER = new ThresholdsEnum(_APPFWREFERERHEADER);
    public static final ThresholdsEnum APPFWCSRFTAG = new ThresholdsEnum(_APPFWCSRFTAG);
    public static final ThresholdsEnum APPFWCOOKIE = new ThresholdsEnum(_APPFWCOOKIE);
    public static final ThresholdsEnum APPFWFIELDCONSISTENCY = new ThresholdsEnum(_APPFWFIELDCONSISTENCY);
    public static final ThresholdsEnum APPFWBUFFEROVERFLOW = new ThresholdsEnum(_APPFWBUFFEROVERFLOW);
    public static final ThresholdsEnum APPFWFIELDFORMAT = new ThresholdsEnum(_APPFWFIELDFORMAT);
    public static final ThresholdsEnum APPFWSAFECOMMERCE = new ThresholdsEnum(_APPFWSAFECOMMERCE);
    public static final ThresholdsEnum APPFWSAFEOBJECT = new ThresholdsEnum(_APPFWSAFEOBJECT);
    public static final ThresholdsEnum APPFWPOLICYHIT = new ThresholdsEnum(_APPFWPOLICYHIT);
    public static final ThresholdsEnum APPFWXSS = new ThresholdsEnum(_APPFWXSS);
    public static final ThresholdsEnum APPFWXMLXSS = new ThresholdsEnum(_APPFWXMLXSS);
    public static final ThresholdsEnum APPFWSQL = new ThresholdsEnum(_APPFWSQL);
    public static final ThresholdsEnum APPFWXMLSQL = new ThresholdsEnum(_APPFWXMLSQL);
    public static final ThresholdsEnum APPFWXMLATTACHMENT = new ThresholdsEnum(_APPFWXMLATTACHMENT);
    public static final ThresholdsEnum APPFWXMLDOS = new ThresholdsEnum(_APPFWXMLDOS);
    public static final ThresholdsEnum APPFWXMLVALIDATION = new ThresholdsEnum(_APPFWXMLVALIDATION);
    public static final ThresholdsEnum APPFWXMLWSI = new ThresholdsEnum(_APPFWXMLWSI);
    public static final ThresholdsEnum APPFWXMLSCHEMACOMPILE = new ThresholdsEnum(_APPFWXMLSCHEMACOMPILE);
    public static final ThresholdsEnum APPFWXMLSOAPFAULT = new ThresholdsEnum(_APPFWXMLSOAPFAULT);
    public static final ThresholdsEnum DNSKEYEXPIRY = new ThresholdsEnum(_DNSKEYEXPIRY);
    public static final ThresholdsEnum DATASTREAMRATELIMITHIT = new ThresholdsEnum(_DATASTREAMRATELIMITHIT);
    public static final ThresholdsEnum HALICENSEMISMATCH = new ThresholdsEnum(_HALICENSEMISMATCH);
    public static final ThresholdsEnum SSLCARDFAILED = new ThresholdsEnum(_SSLCARDFAILED);
    public static final ThresholdsEnum SSLCARDNORMAL = new ThresholdsEnum(_SSLCARDNORMAL);
    public static final ThresholdsEnum WARMRESTARTEVENT = new ThresholdsEnum(_WARMRESTARTEVENT);
    public static final ThresholdsEnum HARDDISKDRIVEERRORS = new ThresholdsEnum(_HARDDISKDRIVEERRORS);
    public static final ThresholdsEnum COMPACTFLASHERRORS = new ThresholdsEnum(_COMPACTFLASHERRORS);
    public static final ThresholdsEnum CALLHOMEUPLOADEVENT = new ThresholdsEnum(_CALLHOMEUPLOADEVENT);
    public static final ThresholdsEnum _1024KEYEXCHANGERATE = new ThresholdsEnum(__1024KEYEXCHANGERATE);
    public static final ThresholdsEnum _2048KEYEXCHANGERATE = new ThresholdsEnum(__2048KEYEXCHANGERATE);
    public static final ThresholdsEnum _4096KEYEXCHANGERATE = new ThresholdsEnum(__4096KEYEXCHANGERATE);
    public static final ThresholdsEnum SSLCURSESSIONINUSE = new ThresholdsEnum(_SSLCURSESSIONINUSE);
    public static final ThresholdsEnum CLUSTERNODEHEALTH = new ThresholdsEnum(_CLUSTERNODEHEALTH);
    public static final ThresholdsEnum CLUSTERNODEQUORUM = new ThresholdsEnum(_CLUSTERNODEQUORUM);
    public static final ThresholdsEnum CLUSTERVERSIONMISMATCH = new ThresholdsEnum(_CLUSTERVERSIONMISMATCH);
    public static final ThresholdsEnum CLUSTERCCOCHANGE = new ThresholdsEnum(_CLUSTERCCOCHANGE);
    public static final ThresholdsEnum CLUSTEROVSCHANGE = new ThresholdsEnum(_CLUSTEROVSCHANGE);
    public static final ThresholdsEnum CLUSTERSYNCFAILURE = new ThresholdsEnum(_CLUSTERSYNCFAILURE);
    public static final ThresholdsEnum CLUSTERPROPFAILURE = new ThresholdsEnum(_CLUSTERPROPFAILURE);
    public static final ThresholdsEnum HASTICKYPRIMARY = new ThresholdsEnum(_HASTICKYPRIMARY);
    public static final ThresholdsEnum INBANDPROTOCOLVERSIONMISMATCH = new ThresholdsEnum(_INBANDPROTOCOLVERSIONMISMATCH);
    public static final ThresholdsEnum SSLCHIPREINIT = new ThresholdsEnum(_SSLCHIPREINIT);
    public static final ThresholdsEnum VRIDSTATECHANGE = new ThresholdsEnum(_VRIDSTATECHANGE);
    public static final ThresholdsEnum VALNOTSET = new ThresholdsEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static ThresholdsEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ThresholdsEnum enumeration = (ThresholdsEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ThresholdsEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ThresholdsEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "thresholdsEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
