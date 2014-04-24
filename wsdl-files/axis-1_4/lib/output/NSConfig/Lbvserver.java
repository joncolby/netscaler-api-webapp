/**
 * Lbvserver.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Lbvserver  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String insertvserveripport;

    private java.lang.String vipheader;

    private java.lang.String value;

    private java.lang.String ipaddress;

    private java.lang.String ipaddress2;

    private java.lang.String ippattern;

    private java.lang.String ipmask;

    private java.lang.String listenpolicy;

    private org.apache.axis.types.UnsignedInt listenpriority;

    private java.lang.String ipmapping;

    private org.apache.axis.types.UnsignedInt port;

    private org.apache.axis.types.UnsignedInt range;

    private java.lang.String servicetype;

    private java.lang.String ngname;

    private java.lang.String type;

    private java.lang.String state;

    private java.lang.String effectivestate;

    private int status;

    private int lbrrreason;

    private java.lang.String[] cachetype;

    private java.lang.String redirect;

    private java.lang.String precedence;

    private java.lang.String redirecturl;

    private java.lang.String authentication;

    private java.lang.String authn401;

    private java.lang.String authnvsname;

    private java.lang.String homepage;

    private java.lang.String dnsvservername;

    private java.lang.String domain;

    private java.lang.String policyname;

    private java.lang.String[] servicename;

    private java.lang.String[] servicegroupname;

    private org.apache.axis.types.UnsignedInt[] weight;

    private org.apache.axis.types.UnsignedInt[] dynamicweight;

    private java.lang.String cachevserver;

    private java.lang.String backupvserver;

    private org.apache.axis.types.UnsignedInt[] priority;

    private org.apache.axis.types.UnsignedInt clttimeout;

    private java.lang.String somethod;

    private java.lang.String sopersistence;

    private org.apache.axis.types.UnsignedInt sopersistencetimeout;

    private org.apache.axis.types.UnsignedInt healththreshold;

    private org.apache.axis.types.UnsignedInt sothreshold;

    private java.lang.String sobackupaction;

    private java.lang.String lbmethod;

    private org.apache.axis.types.UnsignedInt hashlength;

    private org.apache.axis.types.UnsignedInt dataoffset;

    private org.apache.axis.types.UnsignedInt health;

    private org.apache.axis.types.UnsignedInt datalength;

    private java.lang.String netmask;

    private org.apache.axis.types.UnsignedInt v6Netmasklen;

    private java.lang.String rule;

    private java.lang.String resrule;

    private java.lang.String gotopriorityexpression;

    private org.apache.axis.types.UnsignedInt ruletype;

    private java.lang.String groupname;

    private java.lang.String m;

    private org.apache.axis.types.UnsignedInt tosid;

    private java.lang.String persistencetype;

    private org.apache.axis.types.UnsignedInt timeout;

    private java.lang.String cookiedomain;

    private java.lang.String persistmask;

    private org.apache.axis.types.UnsignedInt v6Persistmasklen;

    private java.lang.String persistencebackup;

    private org.apache.axis.types.UnsignedInt backuppersistencetimeout;

    private java.lang.String cacheable;

    private java.lang.String pq;

    private java.lang.String sc;

    private java.lang.String rtspnat;

    private java.lang.String sessionless;

    private java.lang.String map;

    private java.lang.String connfailover;

    private java.lang.String redirectportrewrite;

    private java.lang.String downstateflush;

    private java.lang.String disableprimaryondown;

    private java.lang.String gt2Gb;

    private java.lang.String consolidatedlconn;

    private java.lang.String consolidatedlconngbl;

    private int thresholdvalue;

    private java.lang.String type2;

    private boolean invoke;

    private java.lang.String labeltype;

    private java.lang.String labelname;

    private java.lang.String[] cookieipport;

    private java.lang.String cookiename;

    private java.lang.String[] vserverid;

    private int version;

    private org.apache.axis.types.UnsignedInt totalservices;

    private org.apache.axis.types.UnsignedInt activeservices;

    private java.lang.String statechangetimesec;

    private org.apache.axis.types.UnsignedInt statechangetimeseconds;

    private org.apache.axis.types.UnsignedInt statechangetimemsec;

    private org.apache.axis.types.UnsignedInt tickssincelaststatechange;

    private org.apache.axis.types.UnsignedInt[] hits;

    private org.apache.axis.types.UnsignedInt[] pipolicyhits;

    private java.lang.String authenticationhost;

    private java.lang.String push;

    private java.lang.String pushvserver;

    private java.lang.String pushlabel;

    private java.lang.String pushmulticlients;

    private java.lang.String tcpprofilename;

    private java.lang.String httpprofilename;

    private java.lang.String dbprofilename;

    private java.lang.String comment;

    private org.apache.axis.types.UnsignedInt[] policysubtype;

    private java.lang.String l2Conn;

    private java.lang.String oracleserverversion;

    private java.lang.String mssqlserverversion;

    private org.apache.axis.types.UnsignedInt mysqlprotocolversion;

    private java.lang.String mysqlserverversion;

    private org.apache.axis.types.UnsignedInt mysqlcharacterset;

    private org.apache.axis.types.UnsignedInt mysqlservercapabilities;

    private java.lang.String appflowlog;

    private java.lang.String netprofile;

    private boolean isgslb;

    private java.lang.String icmpvsrresponse;

    private org.apache.axis.types.UnsignedInt newservicerequest;

    private java.lang.String newservicerequestunit;

    private org.apache.axis.types.UnsignedInt newservicerequestincrementinterval;

    private java.lang.String[] vsvrbindsvcip;

    private org.apache.axis.types.UnsignedInt[] vsvrbindsvcport;

    private org.apache.axis.types.UnsignedInt[] persistavpno;

    private java.lang.String skippersistency;

    private org.apache.axis.types.UnsignedInt minautoscalemembers;

    private org.apache.axis.types.UnsignedInt maxautoscalemembers;

    private java.lang.String authnprofile;

    private java.lang.String macmoderetainvlan;

    private java.lang.String dbslb;

    private java.lang.String dns64;

    private java.lang.String bypassaaaa;

    private java.lang.String recursionavailable;

    private java.lang.String[] svcipaddress;

    private org.apache.axis.types.UnsignedInt[] svcport;

    private java.lang.String[] svctype;

    private java.lang.String[] svcstate;

    private java.lang.String[] svcgrpsvcname;

    private java.lang.String[] svcgrpmemgrpname;

    private java.lang.String[] svcgrpmemip;

    private org.apache.axis.types.UnsignedInt[] svcgrpmemport;

    private java.lang.String[] svcgrpmemsvctype;

    private java.lang.String[] svcgrpmemstate;

    private org.apache.axis.types.UnsignedInt[] svcgrpmemweight;

    private org.apache.axis.types.UnsignedInt[] svcgrpmemdynwtmethod;

    private java.lang.String[] svcgrpmemcookieipport;

    private java.lang.String[] svcgrpmemcookiename;

    private java.lang.String[] svcgrpmemvserverid;

    private java.lang.String[] filterpolicyname;

    private java.lang.String[] filterpolicyscflag;

    private java.lang.String[] syslogpolicyname;

    private org.apache.axis.types.UnsignedInt[] syslogpriority;

    private java.lang.String[] syslogpolicyscflag;

    private java.lang.String[] nslogpolicyname;

    private org.apache.axis.types.UnsignedInt[] nslogpriority;

    private java.lang.String[] nslogpolicyscflag;

    private java.lang.String[] scpolicyname;

    private org.apache.axis.types.UnsignedInt[] scpolicypriority;

    private java.lang.String[] pqpolicyname;

    private java.lang.String[] appfwpolicyname;

    private org.apache.axis.types.UnsignedInt[] appfwpriority;

    private java.lang.String[] appfwpolicygotoprioexpression;

    private java.lang.String[] appfwscflag;

    private java.lang.String[] appfwbindpoint;

    private boolean[] appfwinvoke;

    private java.lang.String[] appfwpolicyinvokelabeltype;

    private java.lang.String[] appfwpolicyinvokelabelname;

    private java.lang.String[] appqospolicyname;

    private org.apache.axis.types.UnsignedInt[] appqospolicypriority;

    private java.lang.String[] appqospolicygotoprioexpr;

    private java.lang.String[] appqospolicybindpoint;

    private java.lang.String[] transformpolicyname;

    private org.apache.axis.types.UnsignedInt[] transformpolicypriority;

    private java.lang.String[] transformpolicygotoprioexpression;

    private java.lang.String[] transformpolicybindpoint;

    private boolean[] transforminvoke;

    private java.lang.String[] transformpolicyinvokelabeltype;

    private java.lang.String[] transformpolicyinvokelabelname;

    private java.lang.String[] dospolicyname;

    private org.apache.axis.types.UnsignedInt[] dospolicypriority;

    private java.lang.String[] rwpolicyname;

    private org.apache.axis.types.UnsignedInt[] rwpolicypriority;

    private java.lang.String[] rwpolicygotoprioexpression;

    private java.lang.String[] rwpolicybindpoint;

    private boolean[] rwinvoke;

    private java.lang.String[] rwpolicyinvokelabeltype;

    private java.lang.String[] rwpolicyinvokelabelname;

    private java.lang.String[] cmppolicyname;

    private org.apache.axis.types.UnsignedInt[] cmppolicypriority;

    private java.lang.String[] cmppolicyscflag;

    private java.lang.String[] cmppolicygotoprioexpr;

    private java.lang.String[] cmppolicybindpoint;

    private boolean[] cmpinvoke;

    private java.lang.String[] cmppolicyinvokelabeltype;

    private java.lang.String[] cmppolicyinvokelabelname;

    private java.lang.String[] copolicyname;

    private org.apache.axis.types.UnsignedInt[] copolicypriority;

    private java.lang.String[] copolicynextexpr;

    private java.lang.String[] copolicybindpoint;

    private java.lang.String[] authorpolicyname;

    private org.apache.axis.types.UnsignedInt[] authorpolicypriority;

    private java.lang.String[] authorpolicyscflag;

    private java.lang.String[] authorpolicygotoprioexpr;

    private java.lang.String[] authorpolicybindpoint;

    private boolean[] authorinvoke;

    private java.lang.String[] authorpolicyinvokelabeltype;

    private java.lang.String[] authorpolicyinvokelabelname;

    private java.lang.String[] cachepolicyname;

    private org.apache.axis.types.UnsignedInt[] cachepolicypriority;

    private java.lang.String[] cachepolicygotoprioexpression;

    private java.lang.String[] cachepolicybindpoint;

    private boolean[] cacheinvoke;

    private java.lang.String[] cachepolicyinvokelabeltype;

    private java.lang.String[] cachepolicyinvokelabelname;

    private java.lang.String[] rsppolicyname;

    private org.apache.axis.types.UnsignedInt[] rsppolicypriority;

    private java.lang.String[] rsppolicygotoprioexpression;

    private boolean[] rspinvoke;

    private java.lang.String[] rsppolicyinvokelabeltype;

    private java.lang.String[] rsppolicyinvokelabelname;

    private java.lang.String[] appflowpolicyname;

    private org.apache.axis.types.UnsignedInt[] appflowpolicypriority;

    private java.lang.String[] appflowpolicygotoprioexpression;

    private java.lang.String[] appflowpolicybindpoint;

    private boolean[] appflowinvoke;

    private java.lang.String[] appflowpolicyinvokelabeltype;

    private java.lang.String[] appflowpolicyinvokelabelname;

    private java.lang.String[] csvserver;

    private java.lang.String[] cswpolicyname;

    private org.apache.axis.types.UnsignedInt[] cspriority;

    private java.lang.String[] tmtrafficpolicyname;

    private org.apache.axis.types.UnsignedInt[] tmtrafficpolicypriority;

    private java.lang.String[] spilloverpolicyname;

    private java.lang.String[] spilloverpolicygotoprioexpression;

    private java.lang.String[] spilloverpolicyflowtype;

    private org.apache.axis.types.UnsignedInt[] spilloverpolicypriority;

    private java.lang.String[] dns64Policyname;

    private org.apache.axis.types.UnsignedInt[] dns64Policypriority;

    private java.lang.String[] dns64Policygotoprioexpression;

    public Lbvserver() {
    }

    public Lbvserver(
           java.lang.String name,
           java.lang.String insertvserveripport,
           java.lang.String vipheader,
           java.lang.String value,
           java.lang.String ipaddress,
           java.lang.String ipaddress2,
           java.lang.String ippattern,
           java.lang.String ipmask,
           java.lang.String listenpolicy,
           org.apache.axis.types.UnsignedInt listenpriority,
           java.lang.String ipmapping,
           org.apache.axis.types.UnsignedInt port,
           org.apache.axis.types.UnsignedInt range,
           java.lang.String servicetype,
           java.lang.String ngname,
           java.lang.String type,
           java.lang.String state,
           java.lang.String effectivestate,
           int status,
           int lbrrreason,
           java.lang.String[] cachetype,
           java.lang.String redirect,
           java.lang.String precedence,
           java.lang.String redirecturl,
           java.lang.String authentication,
           java.lang.String authn401,
           java.lang.String authnvsname,
           java.lang.String homepage,
           java.lang.String dnsvservername,
           java.lang.String domain,
           java.lang.String policyname,
           java.lang.String[] servicename,
           java.lang.String[] servicegroupname,
           org.apache.axis.types.UnsignedInt[] weight,
           org.apache.axis.types.UnsignedInt[] dynamicweight,
           java.lang.String cachevserver,
           java.lang.String backupvserver,
           org.apache.axis.types.UnsignedInt[] priority,
           org.apache.axis.types.UnsignedInt clttimeout,
           java.lang.String somethod,
           java.lang.String sopersistence,
           org.apache.axis.types.UnsignedInt sopersistencetimeout,
           org.apache.axis.types.UnsignedInt healththreshold,
           org.apache.axis.types.UnsignedInt sothreshold,
           java.lang.String sobackupaction,
           java.lang.String lbmethod,
           org.apache.axis.types.UnsignedInt hashlength,
           org.apache.axis.types.UnsignedInt dataoffset,
           org.apache.axis.types.UnsignedInt health,
           org.apache.axis.types.UnsignedInt datalength,
           java.lang.String netmask,
           org.apache.axis.types.UnsignedInt v6Netmasklen,
           java.lang.String rule,
           java.lang.String resrule,
           java.lang.String gotopriorityexpression,
           org.apache.axis.types.UnsignedInt ruletype,
           java.lang.String groupname,
           java.lang.String m,
           org.apache.axis.types.UnsignedInt tosid,
           java.lang.String persistencetype,
           org.apache.axis.types.UnsignedInt timeout,
           java.lang.String cookiedomain,
           java.lang.String persistmask,
           org.apache.axis.types.UnsignedInt v6Persistmasklen,
           java.lang.String persistencebackup,
           org.apache.axis.types.UnsignedInt backuppersistencetimeout,
           java.lang.String cacheable,
           java.lang.String pq,
           java.lang.String sc,
           java.lang.String rtspnat,
           java.lang.String sessionless,
           java.lang.String map,
           java.lang.String connfailover,
           java.lang.String redirectportrewrite,
           java.lang.String downstateflush,
           java.lang.String disableprimaryondown,
           java.lang.String gt2Gb,
           java.lang.String consolidatedlconn,
           java.lang.String consolidatedlconngbl,
           int thresholdvalue,
           java.lang.String type2,
           boolean invoke,
           java.lang.String labeltype,
           java.lang.String labelname,
           java.lang.String[] cookieipport,
           java.lang.String cookiename,
           java.lang.String[] vserverid,
           int version,
           org.apache.axis.types.UnsignedInt totalservices,
           org.apache.axis.types.UnsignedInt activeservices,
           java.lang.String statechangetimesec,
           org.apache.axis.types.UnsignedInt statechangetimeseconds,
           org.apache.axis.types.UnsignedInt statechangetimemsec,
           org.apache.axis.types.UnsignedInt tickssincelaststatechange,
           org.apache.axis.types.UnsignedInt[] hits,
           org.apache.axis.types.UnsignedInt[] pipolicyhits,
           java.lang.String authenticationhost,
           java.lang.String push,
           java.lang.String pushvserver,
           java.lang.String pushlabel,
           java.lang.String pushmulticlients,
           java.lang.String tcpprofilename,
           java.lang.String httpprofilename,
           java.lang.String dbprofilename,
           java.lang.String comment,
           org.apache.axis.types.UnsignedInt[] policysubtype,
           java.lang.String l2Conn,
           java.lang.String oracleserverversion,
           java.lang.String mssqlserverversion,
           org.apache.axis.types.UnsignedInt mysqlprotocolversion,
           java.lang.String mysqlserverversion,
           org.apache.axis.types.UnsignedInt mysqlcharacterset,
           org.apache.axis.types.UnsignedInt mysqlservercapabilities,
           java.lang.String appflowlog,
           java.lang.String netprofile,
           boolean isgslb,
           java.lang.String icmpvsrresponse,
           org.apache.axis.types.UnsignedInt newservicerequest,
           java.lang.String newservicerequestunit,
           org.apache.axis.types.UnsignedInt newservicerequestincrementinterval,
           java.lang.String[] vsvrbindsvcip,
           org.apache.axis.types.UnsignedInt[] vsvrbindsvcport,
           org.apache.axis.types.UnsignedInt[] persistavpno,
           java.lang.String skippersistency,
           org.apache.axis.types.UnsignedInt minautoscalemembers,
           org.apache.axis.types.UnsignedInt maxautoscalemembers,
           java.lang.String authnprofile,
           java.lang.String macmoderetainvlan,
           java.lang.String dbslb,
           java.lang.String dns64,
           java.lang.String bypassaaaa,
           java.lang.String recursionavailable,
           java.lang.String[] svcipaddress,
           org.apache.axis.types.UnsignedInt[] svcport,
           java.lang.String[] svctype,
           java.lang.String[] svcstate,
           java.lang.String[] svcgrpsvcname,
           java.lang.String[] svcgrpmemgrpname,
           java.lang.String[] svcgrpmemip,
           org.apache.axis.types.UnsignedInt[] svcgrpmemport,
           java.lang.String[] svcgrpmemsvctype,
           java.lang.String[] svcgrpmemstate,
           org.apache.axis.types.UnsignedInt[] svcgrpmemweight,
           org.apache.axis.types.UnsignedInt[] svcgrpmemdynwtmethod,
           java.lang.String[] svcgrpmemcookieipport,
           java.lang.String[] svcgrpmemcookiename,
           java.lang.String[] svcgrpmemvserverid,
           java.lang.String[] filterpolicyname,
           java.lang.String[] filterpolicyscflag,
           java.lang.String[] syslogpolicyname,
           org.apache.axis.types.UnsignedInt[] syslogpriority,
           java.lang.String[] syslogpolicyscflag,
           java.lang.String[] nslogpolicyname,
           org.apache.axis.types.UnsignedInt[] nslogpriority,
           java.lang.String[] nslogpolicyscflag,
           java.lang.String[] scpolicyname,
           org.apache.axis.types.UnsignedInt[] scpolicypriority,
           java.lang.String[] pqpolicyname,
           java.lang.String[] appfwpolicyname,
           org.apache.axis.types.UnsignedInt[] appfwpriority,
           java.lang.String[] appfwpolicygotoprioexpression,
           java.lang.String[] appfwscflag,
           java.lang.String[] appfwbindpoint,
           boolean[] appfwinvoke,
           java.lang.String[] appfwpolicyinvokelabeltype,
           java.lang.String[] appfwpolicyinvokelabelname,
           java.lang.String[] appqospolicyname,
           org.apache.axis.types.UnsignedInt[] appqospolicypriority,
           java.lang.String[] appqospolicygotoprioexpr,
           java.lang.String[] appqospolicybindpoint,
           java.lang.String[] transformpolicyname,
           org.apache.axis.types.UnsignedInt[] transformpolicypriority,
           java.lang.String[] transformpolicygotoprioexpression,
           java.lang.String[] transformpolicybindpoint,
           boolean[] transforminvoke,
           java.lang.String[] transformpolicyinvokelabeltype,
           java.lang.String[] transformpolicyinvokelabelname,
           java.lang.String[] dospolicyname,
           org.apache.axis.types.UnsignedInt[] dospolicypriority,
           java.lang.String[] rwpolicyname,
           org.apache.axis.types.UnsignedInt[] rwpolicypriority,
           java.lang.String[] rwpolicygotoprioexpression,
           java.lang.String[] rwpolicybindpoint,
           boolean[] rwinvoke,
           java.lang.String[] rwpolicyinvokelabeltype,
           java.lang.String[] rwpolicyinvokelabelname,
           java.lang.String[] cmppolicyname,
           org.apache.axis.types.UnsignedInt[] cmppolicypriority,
           java.lang.String[] cmppolicyscflag,
           java.lang.String[] cmppolicygotoprioexpr,
           java.lang.String[] cmppolicybindpoint,
           boolean[] cmpinvoke,
           java.lang.String[] cmppolicyinvokelabeltype,
           java.lang.String[] cmppolicyinvokelabelname,
           java.lang.String[] copolicyname,
           org.apache.axis.types.UnsignedInt[] copolicypriority,
           java.lang.String[] copolicynextexpr,
           java.lang.String[] copolicybindpoint,
           java.lang.String[] authorpolicyname,
           org.apache.axis.types.UnsignedInt[] authorpolicypriority,
           java.lang.String[] authorpolicyscflag,
           java.lang.String[] authorpolicygotoprioexpr,
           java.lang.String[] authorpolicybindpoint,
           boolean[] authorinvoke,
           java.lang.String[] authorpolicyinvokelabeltype,
           java.lang.String[] authorpolicyinvokelabelname,
           java.lang.String[] cachepolicyname,
           org.apache.axis.types.UnsignedInt[] cachepolicypriority,
           java.lang.String[] cachepolicygotoprioexpression,
           java.lang.String[] cachepolicybindpoint,
           boolean[] cacheinvoke,
           java.lang.String[] cachepolicyinvokelabeltype,
           java.lang.String[] cachepolicyinvokelabelname,
           java.lang.String[] rsppolicyname,
           org.apache.axis.types.UnsignedInt[] rsppolicypriority,
           java.lang.String[] rsppolicygotoprioexpression,
           boolean[] rspinvoke,
           java.lang.String[] rsppolicyinvokelabeltype,
           java.lang.String[] rsppolicyinvokelabelname,
           java.lang.String[] appflowpolicyname,
           org.apache.axis.types.UnsignedInt[] appflowpolicypriority,
           java.lang.String[] appflowpolicygotoprioexpression,
           java.lang.String[] appflowpolicybindpoint,
           boolean[] appflowinvoke,
           java.lang.String[] appflowpolicyinvokelabeltype,
           java.lang.String[] appflowpolicyinvokelabelname,
           java.lang.String[] csvserver,
           java.lang.String[] cswpolicyname,
           org.apache.axis.types.UnsignedInt[] cspriority,
           java.lang.String[] tmtrafficpolicyname,
           org.apache.axis.types.UnsignedInt[] tmtrafficpolicypriority,
           java.lang.String[] spilloverpolicyname,
           java.lang.String[] spilloverpolicygotoprioexpression,
           java.lang.String[] spilloverpolicyflowtype,
           org.apache.axis.types.UnsignedInt[] spilloverpolicypriority,
           java.lang.String[] dns64Policyname,
           org.apache.axis.types.UnsignedInt[] dns64Policypriority,
           java.lang.String[] dns64Policygotoprioexpression) {
           this.name = name;
           this.insertvserveripport = insertvserveripport;
           this.vipheader = vipheader;
           this.value = value;
           this.ipaddress = ipaddress;
           this.ipaddress2 = ipaddress2;
           this.ippattern = ippattern;
           this.ipmask = ipmask;
           this.listenpolicy = listenpolicy;
           this.listenpriority = listenpriority;
           this.ipmapping = ipmapping;
           this.port = port;
           this.range = range;
           this.servicetype = servicetype;
           this.ngname = ngname;
           this.type = type;
           this.state = state;
           this.effectivestate = effectivestate;
           this.status = status;
           this.lbrrreason = lbrrreason;
           this.cachetype = cachetype;
           this.redirect = redirect;
           this.precedence = precedence;
           this.redirecturl = redirecturl;
           this.authentication = authentication;
           this.authn401 = authn401;
           this.authnvsname = authnvsname;
           this.homepage = homepage;
           this.dnsvservername = dnsvservername;
           this.domain = domain;
           this.policyname = policyname;
           this.servicename = servicename;
           this.servicegroupname = servicegroupname;
           this.weight = weight;
           this.dynamicweight = dynamicweight;
           this.cachevserver = cachevserver;
           this.backupvserver = backupvserver;
           this.priority = priority;
           this.clttimeout = clttimeout;
           this.somethod = somethod;
           this.sopersistence = sopersistence;
           this.sopersistencetimeout = sopersistencetimeout;
           this.healththreshold = healththreshold;
           this.sothreshold = sothreshold;
           this.sobackupaction = sobackupaction;
           this.lbmethod = lbmethod;
           this.hashlength = hashlength;
           this.dataoffset = dataoffset;
           this.health = health;
           this.datalength = datalength;
           this.netmask = netmask;
           this.v6Netmasklen = v6Netmasklen;
           this.rule = rule;
           this.resrule = resrule;
           this.gotopriorityexpression = gotopriorityexpression;
           this.ruletype = ruletype;
           this.groupname = groupname;
           this.m = m;
           this.tosid = tosid;
           this.persistencetype = persistencetype;
           this.timeout = timeout;
           this.cookiedomain = cookiedomain;
           this.persistmask = persistmask;
           this.v6Persistmasklen = v6Persistmasklen;
           this.persistencebackup = persistencebackup;
           this.backuppersistencetimeout = backuppersistencetimeout;
           this.cacheable = cacheable;
           this.pq = pq;
           this.sc = sc;
           this.rtspnat = rtspnat;
           this.sessionless = sessionless;
           this.map = map;
           this.connfailover = connfailover;
           this.redirectportrewrite = redirectportrewrite;
           this.downstateflush = downstateflush;
           this.disableprimaryondown = disableprimaryondown;
           this.gt2Gb = gt2Gb;
           this.consolidatedlconn = consolidatedlconn;
           this.consolidatedlconngbl = consolidatedlconngbl;
           this.thresholdvalue = thresholdvalue;
           this.type2 = type2;
           this.invoke = invoke;
           this.labeltype = labeltype;
           this.labelname = labelname;
           this.cookieipport = cookieipport;
           this.cookiename = cookiename;
           this.vserverid = vserverid;
           this.version = version;
           this.totalservices = totalservices;
           this.activeservices = activeservices;
           this.statechangetimesec = statechangetimesec;
           this.statechangetimeseconds = statechangetimeseconds;
           this.statechangetimemsec = statechangetimemsec;
           this.tickssincelaststatechange = tickssincelaststatechange;
           this.hits = hits;
           this.pipolicyhits = pipolicyhits;
           this.authenticationhost = authenticationhost;
           this.push = push;
           this.pushvserver = pushvserver;
           this.pushlabel = pushlabel;
           this.pushmulticlients = pushmulticlients;
           this.tcpprofilename = tcpprofilename;
           this.httpprofilename = httpprofilename;
           this.dbprofilename = dbprofilename;
           this.comment = comment;
           this.policysubtype = policysubtype;
           this.l2Conn = l2Conn;
           this.oracleserverversion = oracleserverversion;
           this.mssqlserverversion = mssqlserverversion;
           this.mysqlprotocolversion = mysqlprotocolversion;
           this.mysqlserverversion = mysqlserverversion;
           this.mysqlcharacterset = mysqlcharacterset;
           this.mysqlservercapabilities = mysqlservercapabilities;
           this.appflowlog = appflowlog;
           this.netprofile = netprofile;
           this.isgslb = isgslb;
           this.icmpvsrresponse = icmpvsrresponse;
           this.newservicerequest = newservicerequest;
           this.newservicerequestunit = newservicerequestunit;
           this.newservicerequestincrementinterval = newservicerequestincrementinterval;
           this.vsvrbindsvcip = vsvrbindsvcip;
           this.vsvrbindsvcport = vsvrbindsvcport;
           this.persistavpno = persistavpno;
           this.skippersistency = skippersistency;
           this.minautoscalemembers = minautoscalemembers;
           this.maxautoscalemembers = maxautoscalemembers;
           this.authnprofile = authnprofile;
           this.macmoderetainvlan = macmoderetainvlan;
           this.dbslb = dbslb;
           this.dns64 = dns64;
           this.bypassaaaa = bypassaaaa;
           this.recursionavailable = recursionavailable;
           this.svcipaddress = svcipaddress;
           this.svcport = svcport;
           this.svctype = svctype;
           this.svcstate = svcstate;
           this.svcgrpsvcname = svcgrpsvcname;
           this.svcgrpmemgrpname = svcgrpmemgrpname;
           this.svcgrpmemip = svcgrpmemip;
           this.svcgrpmemport = svcgrpmemport;
           this.svcgrpmemsvctype = svcgrpmemsvctype;
           this.svcgrpmemstate = svcgrpmemstate;
           this.svcgrpmemweight = svcgrpmemweight;
           this.svcgrpmemdynwtmethod = svcgrpmemdynwtmethod;
           this.svcgrpmemcookieipport = svcgrpmemcookieipport;
           this.svcgrpmemcookiename = svcgrpmemcookiename;
           this.svcgrpmemvserverid = svcgrpmemvserverid;
           this.filterpolicyname = filterpolicyname;
           this.filterpolicyscflag = filterpolicyscflag;
           this.syslogpolicyname = syslogpolicyname;
           this.syslogpriority = syslogpriority;
           this.syslogpolicyscflag = syslogpolicyscflag;
           this.nslogpolicyname = nslogpolicyname;
           this.nslogpriority = nslogpriority;
           this.nslogpolicyscflag = nslogpolicyscflag;
           this.scpolicyname = scpolicyname;
           this.scpolicypriority = scpolicypriority;
           this.pqpolicyname = pqpolicyname;
           this.appfwpolicyname = appfwpolicyname;
           this.appfwpriority = appfwpriority;
           this.appfwpolicygotoprioexpression = appfwpolicygotoprioexpression;
           this.appfwscflag = appfwscflag;
           this.appfwbindpoint = appfwbindpoint;
           this.appfwinvoke = appfwinvoke;
           this.appfwpolicyinvokelabeltype = appfwpolicyinvokelabeltype;
           this.appfwpolicyinvokelabelname = appfwpolicyinvokelabelname;
           this.appqospolicyname = appqospolicyname;
           this.appqospolicypriority = appqospolicypriority;
           this.appqospolicygotoprioexpr = appqospolicygotoprioexpr;
           this.appqospolicybindpoint = appqospolicybindpoint;
           this.transformpolicyname = transformpolicyname;
           this.transformpolicypriority = transformpolicypriority;
           this.transformpolicygotoprioexpression = transformpolicygotoprioexpression;
           this.transformpolicybindpoint = transformpolicybindpoint;
           this.transforminvoke = transforminvoke;
           this.transformpolicyinvokelabeltype = transformpolicyinvokelabeltype;
           this.transformpolicyinvokelabelname = transformpolicyinvokelabelname;
           this.dospolicyname = dospolicyname;
           this.dospolicypriority = dospolicypriority;
           this.rwpolicyname = rwpolicyname;
           this.rwpolicypriority = rwpolicypriority;
           this.rwpolicygotoprioexpression = rwpolicygotoprioexpression;
           this.rwpolicybindpoint = rwpolicybindpoint;
           this.rwinvoke = rwinvoke;
           this.rwpolicyinvokelabeltype = rwpolicyinvokelabeltype;
           this.rwpolicyinvokelabelname = rwpolicyinvokelabelname;
           this.cmppolicyname = cmppolicyname;
           this.cmppolicypriority = cmppolicypriority;
           this.cmppolicyscflag = cmppolicyscflag;
           this.cmppolicygotoprioexpr = cmppolicygotoprioexpr;
           this.cmppolicybindpoint = cmppolicybindpoint;
           this.cmpinvoke = cmpinvoke;
           this.cmppolicyinvokelabeltype = cmppolicyinvokelabeltype;
           this.cmppolicyinvokelabelname = cmppolicyinvokelabelname;
           this.copolicyname = copolicyname;
           this.copolicypriority = copolicypriority;
           this.copolicynextexpr = copolicynextexpr;
           this.copolicybindpoint = copolicybindpoint;
           this.authorpolicyname = authorpolicyname;
           this.authorpolicypriority = authorpolicypriority;
           this.authorpolicyscflag = authorpolicyscflag;
           this.authorpolicygotoprioexpr = authorpolicygotoprioexpr;
           this.authorpolicybindpoint = authorpolicybindpoint;
           this.authorinvoke = authorinvoke;
           this.authorpolicyinvokelabeltype = authorpolicyinvokelabeltype;
           this.authorpolicyinvokelabelname = authorpolicyinvokelabelname;
           this.cachepolicyname = cachepolicyname;
           this.cachepolicypriority = cachepolicypriority;
           this.cachepolicygotoprioexpression = cachepolicygotoprioexpression;
           this.cachepolicybindpoint = cachepolicybindpoint;
           this.cacheinvoke = cacheinvoke;
           this.cachepolicyinvokelabeltype = cachepolicyinvokelabeltype;
           this.cachepolicyinvokelabelname = cachepolicyinvokelabelname;
           this.rsppolicyname = rsppolicyname;
           this.rsppolicypriority = rsppolicypriority;
           this.rsppolicygotoprioexpression = rsppolicygotoprioexpression;
           this.rspinvoke = rspinvoke;
           this.rsppolicyinvokelabeltype = rsppolicyinvokelabeltype;
           this.rsppolicyinvokelabelname = rsppolicyinvokelabelname;
           this.appflowpolicyname = appflowpolicyname;
           this.appflowpolicypriority = appflowpolicypriority;
           this.appflowpolicygotoprioexpression = appflowpolicygotoprioexpression;
           this.appflowpolicybindpoint = appflowpolicybindpoint;
           this.appflowinvoke = appflowinvoke;
           this.appflowpolicyinvokelabeltype = appflowpolicyinvokelabeltype;
           this.appflowpolicyinvokelabelname = appflowpolicyinvokelabelname;
           this.csvserver = csvserver;
           this.cswpolicyname = cswpolicyname;
           this.cspriority = cspriority;
           this.tmtrafficpolicyname = tmtrafficpolicyname;
           this.tmtrafficpolicypriority = tmtrafficpolicypriority;
           this.spilloverpolicyname = spilloverpolicyname;
           this.spilloverpolicygotoprioexpression = spilloverpolicygotoprioexpression;
           this.spilloverpolicyflowtype = spilloverpolicyflowtype;
           this.spilloverpolicypriority = spilloverpolicypriority;
           this.dns64Policyname = dns64Policyname;
           this.dns64Policypriority = dns64Policypriority;
           this.dns64Policygotoprioexpression = dns64Policygotoprioexpression;
    }


    /**
     * Gets the name value for this Lbvserver.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Lbvserver.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the insertvserveripport value for this Lbvserver.
     * 
     * @return insertvserveripport
     */
    public java.lang.String getInsertvserveripport() {
        return insertvserveripport;
    }


    /**
     * Sets the insertvserveripport value for this Lbvserver.
     * 
     * @param insertvserveripport
     */
    public void setInsertvserveripport(java.lang.String insertvserveripport) {
        this.insertvserveripport = insertvserveripport;
    }


    /**
     * Gets the vipheader value for this Lbvserver.
     * 
     * @return vipheader
     */
    public java.lang.String getVipheader() {
        return vipheader;
    }


    /**
     * Sets the vipheader value for this Lbvserver.
     * 
     * @param vipheader
     */
    public void setVipheader(java.lang.String vipheader) {
        this.vipheader = vipheader;
    }


    /**
     * Gets the value value for this Lbvserver.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this Lbvserver.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the ipaddress value for this Lbvserver.
     * 
     * @return ipaddress
     */
    public java.lang.String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Lbvserver.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the ipaddress2 value for this Lbvserver.
     * 
     * @return ipaddress2
     */
    public java.lang.String getIpaddress2() {
        return ipaddress2;
    }


    /**
     * Sets the ipaddress2 value for this Lbvserver.
     * 
     * @param ipaddress2
     */
    public void setIpaddress2(java.lang.String ipaddress2) {
        this.ipaddress2 = ipaddress2;
    }


    /**
     * Gets the ippattern value for this Lbvserver.
     * 
     * @return ippattern
     */
    public java.lang.String getIppattern() {
        return ippattern;
    }


    /**
     * Sets the ippattern value for this Lbvserver.
     * 
     * @param ippattern
     */
    public void setIppattern(java.lang.String ippattern) {
        this.ippattern = ippattern;
    }


    /**
     * Gets the ipmask value for this Lbvserver.
     * 
     * @return ipmask
     */
    public java.lang.String getIpmask() {
        return ipmask;
    }


    /**
     * Sets the ipmask value for this Lbvserver.
     * 
     * @param ipmask
     */
    public void setIpmask(java.lang.String ipmask) {
        this.ipmask = ipmask;
    }


    /**
     * Gets the listenpolicy value for this Lbvserver.
     * 
     * @return listenpolicy
     */
    public java.lang.String getListenpolicy() {
        return listenpolicy;
    }


    /**
     * Sets the listenpolicy value for this Lbvserver.
     * 
     * @param listenpolicy
     */
    public void setListenpolicy(java.lang.String listenpolicy) {
        this.listenpolicy = listenpolicy;
    }


    /**
     * Gets the listenpriority value for this Lbvserver.
     * 
     * @return listenpriority
     */
    public org.apache.axis.types.UnsignedInt getListenpriority() {
        return listenpriority;
    }


    /**
     * Sets the listenpriority value for this Lbvserver.
     * 
     * @param listenpriority
     */
    public void setListenpriority(org.apache.axis.types.UnsignedInt listenpriority) {
        this.listenpriority = listenpriority;
    }


    /**
     * Gets the ipmapping value for this Lbvserver.
     * 
     * @return ipmapping
     */
    public java.lang.String getIpmapping() {
        return ipmapping;
    }


    /**
     * Sets the ipmapping value for this Lbvserver.
     * 
     * @param ipmapping
     */
    public void setIpmapping(java.lang.String ipmapping) {
        this.ipmapping = ipmapping;
    }


    /**
     * Gets the port value for this Lbvserver.
     * 
     * @return port
     */
    public org.apache.axis.types.UnsignedInt getPort() {
        return port;
    }


    /**
     * Sets the port value for this Lbvserver.
     * 
     * @param port
     */
    public void setPort(org.apache.axis.types.UnsignedInt port) {
        this.port = port;
    }


    /**
     * Gets the range value for this Lbvserver.
     * 
     * @return range
     */
    public org.apache.axis.types.UnsignedInt getRange() {
        return range;
    }


    /**
     * Sets the range value for this Lbvserver.
     * 
     * @param range
     */
    public void setRange(org.apache.axis.types.UnsignedInt range) {
        this.range = range;
    }


    /**
     * Gets the servicetype value for this Lbvserver.
     * 
     * @return servicetype
     */
    public java.lang.String getServicetype() {
        return servicetype;
    }


    /**
     * Sets the servicetype value for this Lbvserver.
     * 
     * @param servicetype
     */
    public void setServicetype(java.lang.String servicetype) {
        this.servicetype = servicetype;
    }


    /**
     * Gets the ngname value for this Lbvserver.
     * 
     * @return ngname
     */
    public java.lang.String getNgname() {
        return ngname;
    }


    /**
     * Sets the ngname value for this Lbvserver.
     * 
     * @param ngname
     */
    public void setNgname(java.lang.String ngname) {
        this.ngname = ngname;
    }


    /**
     * Gets the type value for this Lbvserver.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Lbvserver.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the state value for this Lbvserver.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Lbvserver.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the effectivestate value for this Lbvserver.
     * 
     * @return effectivestate
     */
    public java.lang.String getEffectivestate() {
        return effectivestate;
    }


    /**
     * Sets the effectivestate value for this Lbvserver.
     * 
     * @param effectivestate
     */
    public void setEffectivestate(java.lang.String effectivestate) {
        this.effectivestate = effectivestate;
    }


    /**
     * Gets the status value for this Lbvserver.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Lbvserver.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the lbrrreason value for this Lbvserver.
     * 
     * @return lbrrreason
     */
    public int getLbrrreason() {
        return lbrrreason;
    }


    /**
     * Sets the lbrrreason value for this Lbvserver.
     * 
     * @param lbrrreason
     */
    public void setLbrrreason(int lbrrreason) {
        this.lbrrreason = lbrrreason;
    }


    /**
     * Gets the cachetype value for this Lbvserver.
     * 
     * @return cachetype
     */
    public java.lang.String[] getCachetype() {
        return cachetype;
    }


    /**
     * Sets the cachetype value for this Lbvserver.
     * 
     * @param cachetype
     */
    public void setCachetype(java.lang.String[] cachetype) {
        this.cachetype = cachetype;
    }


    /**
     * Gets the redirect value for this Lbvserver.
     * 
     * @return redirect
     */
    public java.lang.String getRedirect() {
        return redirect;
    }


    /**
     * Sets the redirect value for this Lbvserver.
     * 
     * @param redirect
     */
    public void setRedirect(java.lang.String redirect) {
        this.redirect = redirect;
    }


    /**
     * Gets the precedence value for this Lbvserver.
     * 
     * @return precedence
     */
    public java.lang.String getPrecedence() {
        return precedence;
    }


    /**
     * Sets the precedence value for this Lbvserver.
     * 
     * @param precedence
     */
    public void setPrecedence(java.lang.String precedence) {
        this.precedence = precedence;
    }


    /**
     * Gets the redirecturl value for this Lbvserver.
     * 
     * @return redirecturl
     */
    public java.lang.String getRedirecturl() {
        return redirecturl;
    }


    /**
     * Sets the redirecturl value for this Lbvserver.
     * 
     * @param redirecturl
     */
    public void setRedirecturl(java.lang.String redirecturl) {
        this.redirecturl = redirecturl;
    }


    /**
     * Gets the authentication value for this Lbvserver.
     * 
     * @return authentication
     */
    public java.lang.String getAuthentication() {
        return authentication;
    }


    /**
     * Sets the authentication value for this Lbvserver.
     * 
     * @param authentication
     */
    public void setAuthentication(java.lang.String authentication) {
        this.authentication = authentication;
    }


    /**
     * Gets the authn401 value for this Lbvserver.
     * 
     * @return authn401
     */
    public java.lang.String getAuthn401() {
        return authn401;
    }


    /**
     * Sets the authn401 value for this Lbvserver.
     * 
     * @param authn401
     */
    public void setAuthn401(java.lang.String authn401) {
        this.authn401 = authn401;
    }


    /**
     * Gets the authnvsname value for this Lbvserver.
     * 
     * @return authnvsname
     */
    public java.lang.String getAuthnvsname() {
        return authnvsname;
    }


    /**
     * Sets the authnvsname value for this Lbvserver.
     * 
     * @param authnvsname
     */
    public void setAuthnvsname(java.lang.String authnvsname) {
        this.authnvsname = authnvsname;
    }


    /**
     * Gets the homepage value for this Lbvserver.
     * 
     * @return homepage
     */
    public java.lang.String getHomepage() {
        return homepage;
    }


    /**
     * Sets the homepage value for this Lbvserver.
     * 
     * @param homepage
     */
    public void setHomepage(java.lang.String homepage) {
        this.homepage = homepage;
    }


    /**
     * Gets the dnsvservername value for this Lbvserver.
     * 
     * @return dnsvservername
     */
    public java.lang.String getDnsvservername() {
        return dnsvservername;
    }


    /**
     * Sets the dnsvservername value for this Lbvserver.
     * 
     * @param dnsvservername
     */
    public void setDnsvservername(java.lang.String dnsvservername) {
        this.dnsvservername = dnsvservername;
    }


    /**
     * Gets the domain value for this Lbvserver.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this Lbvserver.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the policyname value for this Lbvserver.
     * 
     * @return policyname
     */
    public java.lang.String getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Lbvserver.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the servicename value for this Lbvserver.
     * 
     * @return servicename
     */
    public java.lang.String[] getServicename() {
        return servicename;
    }


    /**
     * Sets the servicename value for this Lbvserver.
     * 
     * @param servicename
     */
    public void setServicename(java.lang.String[] servicename) {
        this.servicename = servicename;
    }


    /**
     * Gets the servicegroupname value for this Lbvserver.
     * 
     * @return servicegroupname
     */
    public java.lang.String[] getServicegroupname() {
        return servicegroupname;
    }


    /**
     * Sets the servicegroupname value for this Lbvserver.
     * 
     * @param servicegroupname
     */
    public void setServicegroupname(java.lang.String[] servicegroupname) {
        this.servicegroupname = servicegroupname;
    }


    /**
     * Gets the weight value for this Lbvserver.
     * 
     * @return weight
     */
    public org.apache.axis.types.UnsignedInt[] getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this Lbvserver.
     * 
     * @param weight
     */
    public void setWeight(org.apache.axis.types.UnsignedInt[] weight) {
        this.weight = weight;
    }


    /**
     * Gets the dynamicweight value for this Lbvserver.
     * 
     * @return dynamicweight
     */
    public org.apache.axis.types.UnsignedInt[] getDynamicweight() {
        return dynamicweight;
    }


    /**
     * Sets the dynamicweight value for this Lbvserver.
     * 
     * @param dynamicweight
     */
    public void setDynamicweight(org.apache.axis.types.UnsignedInt[] dynamicweight) {
        this.dynamicweight = dynamicweight;
    }


    /**
     * Gets the cachevserver value for this Lbvserver.
     * 
     * @return cachevserver
     */
    public java.lang.String getCachevserver() {
        return cachevserver;
    }


    /**
     * Sets the cachevserver value for this Lbvserver.
     * 
     * @param cachevserver
     */
    public void setCachevserver(java.lang.String cachevserver) {
        this.cachevserver = cachevserver;
    }


    /**
     * Gets the backupvserver value for this Lbvserver.
     * 
     * @return backupvserver
     */
    public java.lang.String getBackupvserver() {
        return backupvserver;
    }


    /**
     * Sets the backupvserver value for this Lbvserver.
     * 
     * @param backupvserver
     */
    public void setBackupvserver(java.lang.String backupvserver) {
        this.backupvserver = backupvserver;
    }


    /**
     * Gets the priority value for this Lbvserver.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt[] getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Lbvserver.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt[] priority) {
        this.priority = priority;
    }


    /**
     * Gets the clttimeout value for this Lbvserver.
     * 
     * @return clttimeout
     */
    public org.apache.axis.types.UnsignedInt getClttimeout() {
        return clttimeout;
    }


    /**
     * Sets the clttimeout value for this Lbvserver.
     * 
     * @param clttimeout
     */
    public void setClttimeout(org.apache.axis.types.UnsignedInt clttimeout) {
        this.clttimeout = clttimeout;
    }


    /**
     * Gets the somethod value for this Lbvserver.
     * 
     * @return somethod
     */
    public java.lang.String getSomethod() {
        return somethod;
    }


    /**
     * Sets the somethod value for this Lbvserver.
     * 
     * @param somethod
     */
    public void setSomethod(java.lang.String somethod) {
        this.somethod = somethod;
    }


    /**
     * Gets the sopersistence value for this Lbvserver.
     * 
     * @return sopersistence
     */
    public java.lang.String getSopersistence() {
        return sopersistence;
    }


    /**
     * Sets the sopersistence value for this Lbvserver.
     * 
     * @param sopersistence
     */
    public void setSopersistence(java.lang.String sopersistence) {
        this.sopersistence = sopersistence;
    }


    /**
     * Gets the sopersistencetimeout value for this Lbvserver.
     * 
     * @return sopersistencetimeout
     */
    public org.apache.axis.types.UnsignedInt getSopersistencetimeout() {
        return sopersistencetimeout;
    }


    /**
     * Sets the sopersistencetimeout value for this Lbvserver.
     * 
     * @param sopersistencetimeout
     */
    public void setSopersistencetimeout(org.apache.axis.types.UnsignedInt sopersistencetimeout) {
        this.sopersistencetimeout = sopersistencetimeout;
    }


    /**
     * Gets the healththreshold value for this Lbvserver.
     * 
     * @return healththreshold
     */
    public org.apache.axis.types.UnsignedInt getHealththreshold() {
        return healththreshold;
    }


    /**
     * Sets the healththreshold value for this Lbvserver.
     * 
     * @param healththreshold
     */
    public void setHealththreshold(org.apache.axis.types.UnsignedInt healththreshold) {
        this.healththreshold = healththreshold;
    }


    /**
     * Gets the sothreshold value for this Lbvserver.
     * 
     * @return sothreshold
     */
    public org.apache.axis.types.UnsignedInt getSothreshold() {
        return sothreshold;
    }


    /**
     * Sets the sothreshold value for this Lbvserver.
     * 
     * @param sothreshold
     */
    public void setSothreshold(org.apache.axis.types.UnsignedInt sothreshold) {
        this.sothreshold = sothreshold;
    }


    /**
     * Gets the sobackupaction value for this Lbvserver.
     * 
     * @return sobackupaction
     */
    public java.lang.String getSobackupaction() {
        return sobackupaction;
    }


    /**
     * Sets the sobackupaction value for this Lbvserver.
     * 
     * @param sobackupaction
     */
    public void setSobackupaction(java.lang.String sobackupaction) {
        this.sobackupaction = sobackupaction;
    }


    /**
     * Gets the lbmethod value for this Lbvserver.
     * 
     * @return lbmethod
     */
    public java.lang.String getLbmethod() {
        return lbmethod;
    }


    /**
     * Sets the lbmethod value for this Lbvserver.
     * 
     * @param lbmethod
     */
    public void setLbmethod(java.lang.String lbmethod) {
        this.lbmethod = lbmethod;
    }


    /**
     * Gets the hashlength value for this Lbvserver.
     * 
     * @return hashlength
     */
    public org.apache.axis.types.UnsignedInt getHashlength() {
        return hashlength;
    }


    /**
     * Sets the hashlength value for this Lbvserver.
     * 
     * @param hashlength
     */
    public void setHashlength(org.apache.axis.types.UnsignedInt hashlength) {
        this.hashlength = hashlength;
    }


    /**
     * Gets the dataoffset value for this Lbvserver.
     * 
     * @return dataoffset
     */
    public org.apache.axis.types.UnsignedInt getDataoffset() {
        return dataoffset;
    }


    /**
     * Sets the dataoffset value for this Lbvserver.
     * 
     * @param dataoffset
     */
    public void setDataoffset(org.apache.axis.types.UnsignedInt dataoffset) {
        this.dataoffset = dataoffset;
    }


    /**
     * Gets the health value for this Lbvserver.
     * 
     * @return health
     */
    public org.apache.axis.types.UnsignedInt getHealth() {
        return health;
    }


    /**
     * Sets the health value for this Lbvserver.
     * 
     * @param health
     */
    public void setHealth(org.apache.axis.types.UnsignedInt health) {
        this.health = health;
    }


    /**
     * Gets the datalength value for this Lbvserver.
     * 
     * @return datalength
     */
    public org.apache.axis.types.UnsignedInt getDatalength() {
        return datalength;
    }


    /**
     * Sets the datalength value for this Lbvserver.
     * 
     * @param datalength
     */
    public void setDatalength(org.apache.axis.types.UnsignedInt datalength) {
        this.datalength = datalength;
    }


    /**
     * Gets the netmask value for this Lbvserver.
     * 
     * @return netmask
     */
    public java.lang.String getNetmask() {
        return netmask;
    }


    /**
     * Sets the netmask value for this Lbvserver.
     * 
     * @param netmask
     */
    public void setNetmask(java.lang.String netmask) {
        this.netmask = netmask;
    }


    /**
     * Gets the v6Netmasklen value for this Lbvserver.
     * 
     * @return v6Netmasklen
     */
    public org.apache.axis.types.UnsignedInt getV6Netmasklen() {
        return v6Netmasklen;
    }


    /**
     * Sets the v6Netmasklen value for this Lbvserver.
     * 
     * @param v6Netmasklen
     */
    public void setV6Netmasklen(org.apache.axis.types.UnsignedInt v6Netmasklen) {
        this.v6Netmasklen = v6Netmasklen;
    }


    /**
     * Gets the rule value for this Lbvserver.
     * 
     * @return rule
     */
    public java.lang.String getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this Lbvserver.
     * 
     * @param rule
     */
    public void setRule(java.lang.String rule) {
        this.rule = rule;
    }


    /**
     * Gets the resrule value for this Lbvserver.
     * 
     * @return resrule
     */
    public java.lang.String getResrule() {
        return resrule;
    }


    /**
     * Sets the resrule value for this Lbvserver.
     * 
     * @param resrule
     */
    public void setResrule(java.lang.String resrule) {
        this.resrule = resrule;
    }


    /**
     * Gets the gotopriorityexpression value for this Lbvserver.
     * 
     * @return gotopriorityexpression
     */
    public java.lang.String getGotopriorityexpression() {
        return gotopriorityexpression;
    }


    /**
     * Sets the gotopriorityexpression value for this Lbvserver.
     * 
     * @param gotopriorityexpression
     */
    public void setGotopriorityexpression(java.lang.String gotopriorityexpression) {
        this.gotopriorityexpression = gotopriorityexpression;
    }


    /**
     * Gets the ruletype value for this Lbvserver.
     * 
     * @return ruletype
     */
    public org.apache.axis.types.UnsignedInt getRuletype() {
        return ruletype;
    }


    /**
     * Sets the ruletype value for this Lbvserver.
     * 
     * @param ruletype
     */
    public void setRuletype(org.apache.axis.types.UnsignedInt ruletype) {
        this.ruletype = ruletype;
    }


    /**
     * Gets the groupname value for this Lbvserver.
     * 
     * @return groupname
     */
    public java.lang.String getGroupname() {
        return groupname;
    }


    /**
     * Sets the groupname value for this Lbvserver.
     * 
     * @param groupname
     */
    public void setGroupname(java.lang.String groupname) {
        this.groupname = groupname;
    }


    /**
     * Gets the m value for this Lbvserver.
     * 
     * @return m
     */
    public java.lang.String getM() {
        return m;
    }


    /**
     * Sets the m value for this Lbvserver.
     * 
     * @param m
     */
    public void setM(java.lang.String m) {
        this.m = m;
    }


    /**
     * Gets the tosid value for this Lbvserver.
     * 
     * @return tosid
     */
    public org.apache.axis.types.UnsignedInt getTosid() {
        return tosid;
    }


    /**
     * Sets the tosid value for this Lbvserver.
     * 
     * @param tosid
     */
    public void setTosid(org.apache.axis.types.UnsignedInt tosid) {
        this.tosid = tosid;
    }


    /**
     * Gets the persistencetype value for this Lbvserver.
     * 
     * @return persistencetype
     */
    public java.lang.String getPersistencetype() {
        return persistencetype;
    }


    /**
     * Sets the persistencetype value for this Lbvserver.
     * 
     * @param persistencetype
     */
    public void setPersistencetype(java.lang.String persistencetype) {
        this.persistencetype = persistencetype;
    }


    /**
     * Gets the timeout value for this Lbvserver.
     * 
     * @return timeout
     */
    public org.apache.axis.types.UnsignedInt getTimeout() {
        return timeout;
    }


    /**
     * Sets the timeout value for this Lbvserver.
     * 
     * @param timeout
     */
    public void setTimeout(org.apache.axis.types.UnsignedInt timeout) {
        this.timeout = timeout;
    }


    /**
     * Gets the cookiedomain value for this Lbvserver.
     * 
     * @return cookiedomain
     */
    public java.lang.String getCookiedomain() {
        return cookiedomain;
    }


    /**
     * Sets the cookiedomain value for this Lbvserver.
     * 
     * @param cookiedomain
     */
    public void setCookiedomain(java.lang.String cookiedomain) {
        this.cookiedomain = cookiedomain;
    }


    /**
     * Gets the persistmask value for this Lbvserver.
     * 
     * @return persistmask
     */
    public java.lang.String getPersistmask() {
        return persistmask;
    }


    /**
     * Sets the persistmask value for this Lbvserver.
     * 
     * @param persistmask
     */
    public void setPersistmask(java.lang.String persistmask) {
        this.persistmask = persistmask;
    }


    /**
     * Gets the v6Persistmasklen value for this Lbvserver.
     * 
     * @return v6Persistmasklen
     */
    public org.apache.axis.types.UnsignedInt getV6Persistmasklen() {
        return v6Persistmasklen;
    }


    /**
     * Sets the v6Persistmasklen value for this Lbvserver.
     * 
     * @param v6Persistmasklen
     */
    public void setV6Persistmasklen(org.apache.axis.types.UnsignedInt v6Persistmasklen) {
        this.v6Persistmasklen = v6Persistmasklen;
    }


    /**
     * Gets the persistencebackup value for this Lbvserver.
     * 
     * @return persistencebackup
     */
    public java.lang.String getPersistencebackup() {
        return persistencebackup;
    }


    /**
     * Sets the persistencebackup value for this Lbvserver.
     * 
     * @param persistencebackup
     */
    public void setPersistencebackup(java.lang.String persistencebackup) {
        this.persistencebackup = persistencebackup;
    }


    /**
     * Gets the backuppersistencetimeout value for this Lbvserver.
     * 
     * @return backuppersistencetimeout
     */
    public org.apache.axis.types.UnsignedInt getBackuppersistencetimeout() {
        return backuppersistencetimeout;
    }


    /**
     * Sets the backuppersistencetimeout value for this Lbvserver.
     * 
     * @param backuppersistencetimeout
     */
    public void setBackuppersistencetimeout(org.apache.axis.types.UnsignedInt backuppersistencetimeout) {
        this.backuppersistencetimeout = backuppersistencetimeout;
    }


    /**
     * Gets the cacheable value for this Lbvserver.
     * 
     * @return cacheable
     */
    public java.lang.String getCacheable() {
        return cacheable;
    }


    /**
     * Sets the cacheable value for this Lbvserver.
     * 
     * @param cacheable
     */
    public void setCacheable(java.lang.String cacheable) {
        this.cacheable = cacheable;
    }


    /**
     * Gets the pq value for this Lbvserver.
     * 
     * @return pq
     */
    public java.lang.String getPq() {
        return pq;
    }


    /**
     * Sets the pq value for this Lbvserver.
     * 
     * @param pq
     */
    public void setPq(java.lang.String pq) {
        this.pq = pq;
    }


    /**
     * Gets the sc value for this Lbvserver.
     * 
     * @return sc
     */
    public java.lang.String getSc() {
        return sc;
    }


    /**
     * Sets the sc value for this Lbvserver.
     * 
     * @param sc
     */
    public void setSc(java.lang.String sc) {
        this.sc = sc;
    }


    /**
     * Gets the rtspnat value for this Lbvserver.
     * 
     * @return rtspnat
     */
    public java.lang.String getRtspnat() {
        return rtspnat;
    }


    /**
     * Sets the rtspnat value for this Lbvserver.
     * 
     * @param rtspnat
     */
    public void setRtspnat(java.lang.String rtspnat) {
        this.rtspnat = rtspnat;
    }


    /**
     * Gets the sessionless value for this Lbvserver.
     * 
     * @return sessionless
     */
    public java.lang.String getSessionless() {
        return sessionless;
    }


    /**
     * Sets the sessionless value for this Lbvserver.
     * 
     * @param sessionless
     */
    public void setSessionless(java.lang.String sessionless) {
        this.sessionless = sessionless;
    }


    /**
     * Gets the map value for this Lbvserver.
     * 
     * @return map
     */
    public java.lang.String getMap() {
        return map;
    }


    /**
     * Sets the map value for this Lbvserver.
     * 
     * @param map
     */
    public void setMap(java.lang.String map) {
        this.map = map;
    }


    /**
     * Gets the connfailover value for this Lbvserver.
     * 
     * @return connfailover
     */
    public java.lang.String getConnfailover() {
        return connfailover;
    }


    /**
     * Sets the connfailover value for this Lbvserver.
     * 
     * @param connfailover
     */
    public void setConnfailover(java.lang.String connfailover) {
        this.connfailover = connfailover;
    }


    /**
     * Gets the redirectportrewrite value for this Lbvserver.
     * 
     * @return redirectportrewrite
     */
    public java.lang.String getRedirectportrewrite() {
        return redirectportrewrite;
    }


    /**
     * Sets the redirectportrewrite value for this Lbvserver.
     * 
     * @param redirectportrewrite
     */
    public void setRedirectportrewrite(java.lang.String redirectportrewrite) {
        this.redirectportrewrite = redirectportrewrite;
    }


    /**
     * Gets the downstateflush value for this Lbvserver.
     * 
     * @return downstateflush
     */
    public java.lang.String getDownstateflush() {
        return downstateflush;
    }


    /**
     * Sets the downstateflush value for this Lbvserver.
     * 
     * @param downstateflush
     */
    public void setDownstateflush(java.lang.String downstateflush) {
        this.downstateflush = downstateflush;
    }


    /**
     * Gets the disableprimaryondown value for this Lbvserver.
     * 
     * @return disableprimaryondown
     */
    public java.lang.String getDisableprimaryondown() {
        return disableprimaryondown;
    }


    /**
     * Sets the disableprimaryondown value for this Lbvserver.
     * 
     * @param disableprimaryondown
     */
    public void setDisableprimaryondown(java.lang.String disableprimaryondown) {
        this.disableprimaryondown = disableprimaryondown;
    }


    /**
     * Gets the gt2Gb value for this Lbvserver.
     * 
     * @return gt2Gb
     */
    public java.lang.String getGt2Gb() {
        return gt2Gb;
    }


    /**
     * Sets the gt2Gb value for this Lbvserver.
     * 
     * @param gt2Gb
     */
    public void setGt2Gb(java.lang.String gt2Gb) {
        this.gt2Gb = gt2Gb;
    }


    /**
     * Gets the consolidatedlconn value for this Lbvserver.
     * 
     * @return consolidatedlconn
     */
    public java.lang.String getConsolidatedlconn() {
        return consolidatedlconn;
    }


    /**
     * Sets the consolidatedlconn value for this Lbvserver.
     * 
     * @param consolidatedlconn
     */
    public void setConsolidatedlconn(java.lang.String consolidatedlconn) {
        this.consolidatedlconn = consolidatedlconn;
    }


    /**
     * Gets the consolidatedlconngbl value for this Lbvserver.
     * 
     * @return consolidatedlconngbl
     */
    public java.lang.String getConsolidatedlconngbl() {
        return consolidatedlconngbl;
    }


    /**
     * Sets the consolidatedlconngbl value for this Lbvserver.
     * 
     * @param consolidatedlconngbl
     */
    public void setConsolidatedlconngbl(java.lang.String consolidatedlconngbl) {
        this.consolidatedlconngbl = consolidatedlconngbl;
    }


    /**
     * Gets the thresholdvalue value for this Lbvserver.
     * 
     * @return thresholdvalue
     */
    public int getThresholdvalue() {
        return thresholdvalue;
    }


    /**
     * Sets the thresholdvalue value for this Lbvserver.
     * 
     * @param thresholdvalue
     */
    public void setThresholdvalue(int thresholdvalue) {
        this.thresholdvalue = thresholdvalue;
    }


    /**
     * Gets the type2 value for this Lbvserver.
     * 
     * @return type2
     */
    public java.lang.String getType2() {
        return type2;
    }


    /**
     * Sets the type2 value for this Lbvserver.
     * 
     * @param type2
     */
    public void setType2(java.lang.String type2) {
        this.type2 = type2;
    }


    /**
     * Gets the invoke value for this Lbvserver.
     * 
     * @return invoke
     */
    public boolean isInvoke() {
        return invoke;
    }


    /**
     * Sets the invoke value for this Lbvserver.
     * 
     * @param invoke
     */
    public void setInvoke(boolean invoke) {
        this.invoke = invoke;
    }


    /**
     * Gets the labeltype value for this Lbvserver.
     * 
     * @return labeltype
     */
    public java.lang.String getLabeltype() {
        return labeltype;
    }


    /**
     * Sets the labeltype value for this Lbvserver.
     * 
     * @param labeltype
     */
    public void setLabeltype(java.lang.String labeltype) {
        this.labeltype = labeltype;
    }


    /**
     * Gets the labelname value for this Lbvserver.
     * 
     * @return labelname
     */
    public java.lang.String getLabelname() {
        return labelname;
    }


    /**
     * Sets the labelname value for this Lbvserver.
     * 
     * @param labelname
     */
    public void setLabelname(java.lang.String labelname) {
        this.labelname = labelname;
    }


    /**
     * Gets the cookieipport value for this Lbvserver.
     * 
     * @return cookieipport
     */
    public java.lang.String[] getCookieipport() {
        return cookieipport;
    }


    /**
     * Sets the cookieipport value for this Lbvserver.
     * 
     * @param cookieipport
     */
    public void setCookieipport(java.lang.String[] cookieipport) {
        this.cookieipport = cookieipport;
    }


    /**
     * Gets the cookiename value for this Lbvserver.
     * 
     * @return cookiename
     */
    public java.lang.String getCookiename() {
        return cookiename;
    }


    /**
     * Sets the cookiename value for this Lbvserver.
     * 
     * @param cookiename
     */
    public void setCookiename(java.lang.String cookiename) {
        this.cookiename = cookiename;
    }


    /**
     * Gets the vserverid value for this Lbvserver.
     * 
     * @return vserverid
     */
    public java.lang.String[] getVserverid() {
        return vserverid;
    }


    /**
     * Sets the vserverid value for this Lbvserver.
     * 
     * @param vserverid
     */
    public void setVserverid(java.lang.String[] vserverid) {
        this.vserverid = vserverid;
    }


    /**
     * Gets the version value for this Lbvserver.
     * 
     * @return version
     */
    public int getVersion() {
        return version;
    }


    /**
     * Sets the version value for this Lbvserver.
     * 
     * @param version
     */
    public void setVersion(int version) {
        this.version = version;
    }


    /**
     * Gets the totalservices value for this Lbvserver.
     * 
     * @return totalservices
     */
    public org.apache.axis.types.UnsignedInt getTotalservices() {
        return totalservices;
    }


    /**
     * Sets the totalservices value for this Lbvserver.
     * 
     * @param totalservices
     */
    public void setTotalservices(org.apache.axis.types.UnsignedInt totalservices) {
        this.totalservices = totalservices;
    }


    /**
     * Gets the activeservices value for this Lbvserver.
     * 
     * @return activeservices
     */
    public org.apache.axis.types.UnsignedInt getActiveservices() {
        return activeservices;
    }


    /**
     * Sets the activeservices value for this Lbvserver.
     * 
     * @param activeservices
     */
    public void setActiveservices(org.apache.axis.types.UnsignedInt activeservices) {
        this.activeservices = activeservices;
    }


    /**
     * Gets the statechangetimesec value for this Lbvserver.
     * 
     * @return statechangetimesec
     */
    public java.lang.String getStatechangetimesec() {
        return statechangetimesec;
    }


    /**
     * Sets the statechangetimesec value for this Lbvserver.
     * 
     * @param statechangetimesec
     */
    public void setStatechangetimesec(java.lang.String statechangetimesec) {
        this.statechangetimesec = statechangetimesec;
    }


    /**
     * Gets the statechangetimeseconds value for this Lbvserver.
     * 
     * @return statechangetimeseconds
     */
    public org.apache.axis.types.UnsignedInt getStatechangetimeseconds() {
        return statechangetimeseconds;
    }


    /**
     * Sets the statechangetimeseconds value for this Lbvserver.
     * 
     * @param statechangetimeseconds
     */
    public void setStatechangetimeseconds(org.apache.axis.types.UnsignedInt statechangetimeseconds) {
        this.statechangetimeseconds = statechangetimeseconds;
    }


    /**
     * Gets the statechangetimemsec value for this Lbvserver.
     * 
     * @return statechangetimemsec
     */
    public org.apache.axis.types.UnsignedInt getStatechangetimemsec() {
        return statechangetimemsec;
    }


    /**
     * Sets the statechangetimemsec value for this Lbvserver.
     * 
     * @param statechangetimemsec
     */
    public void setStatechangetimemsec(org.apache.axis.types.UnsignedInt statechangetimemsec) {
        this.statechangetimemsec = statechangetimemsec;
    }


    /**
     * Gets the tickssincelaststatechange value for this Lbvserver.
     * 
     * @return tickssincelaststatechange
     */
    public org.apache.axis.types.UnsignedInt getTickssincelaststatechange() {
        return tickssincelaststatechange;
    }


    /**
     * Sets the tickssincelaststatechange value for this Lbvserver.
     * 
     * @param tickssincelaststatechange
     */
    public void setTickssincelaststatechange(org.apache.axis.types.UnsignedInt tickssincelaststatechange) {
        this.tickssincelaststatechange = tickssincelaststatechange;
    }


    /**
     * Gets the hits value for this Lbvserver.
     * 
     * @return hits
     */
    public org.apache.axis.types.UnsignedInt[] getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this Lbvserver.
     * 
     * @param hits
     */
    public void setHits(org.apache.axis.types.UnsignedInt[] hits) {
        this.hits = hits;
    }


    /**
     * Gets the pipolicyhits value for this Lbvserver.
     * 
     * @return pipolicyhits
     */
    public org.apache.axis.types.UnsignedInt[] getPipolicyhits() {
        return pipolicyhits;
    }


    /**
     * Sets the pipolicyhits value for this Lbvserver.
     * 
     * @param pipolicyhits
     */
    public void setPipolicyhits(org.apache.axis.types.UnsignedInt[] pipolicyhits) {
        this.pipolicyhits = pipolicyhits;
    }


    /**
     * Gets the authenticationhost value for this Lbvserver.
     * 
     * @return authenticationhost
     */
    public java.lang.String getAuthenticationhost() {
        return authenticationhost;
    }


    /**
     * Sets the authenticationhost value for this Lbvserver.
     * 
     * @param authenticationhost
     */
    public void setAuthenticationhost(java.lang.String authenticationhost) {
        this.authenticationhost = authenticationhost;
    }


    /**
     * Gets the push value for this Lbvserver.
     * 
     * @return push
     */
    public java.lang.String getPush() {
        return push;
    }


    /**
     * Sets the push value for this Lbvserver.
     * 
     * @param push
     */
    public void setPush(java.lang.String push) {
        this.push = push;
    }


    /**
     * Gets the pushvserver value for this Lbvserver.
     * 
     * @return pushvserver
     */
    public java.lang.String getPushvserver() {
        return pushvserver;
    }


    /**
     * Sets the pushvserver value for this Lbvserver.
     * 
     * @param pushvserver
     */
    public void setPushvserver(java.lang.String pushvserver) {
        this.pushvserver = pushvserver;
    }


    /**
     * Gets the pushlabel value for this Lbvserver.
     * 
     * @return pushlabel
     */
    public java.lang.String getPushlabel() {
        return pushlabel;
    }


    /**
     * Sets the pushlabel value for this Lbvserver.
     * 
     * @param pushlabel
     */
    public void setPushlabel(java.lang.String pushlabel) {
        this.pushlabel = pushlabel;
    }


    /**
     * Gets the pushmulticlients value for this Lbvserver.
     * 
     * @return pushmulticlients
     */
    public java.lang.String getPushmulticlients() {
        return pushmulticlients;
    }


    /**
     * Sets the pushmulticlients value for this Lbvserver.
     * 
     * @param pushmulticlients
     */
    public void setPushmulticlients(java.lang.String pushmulticlients) {
        this.pushmulticlients = pushmulticlients;
    }


    /**
     * Gets the tcpprofilename value for this Lbvserver.
     * 
     * @return tcpprofilename
     */
    public java.lang.String getTcpprofilename() {
        return tcpprofilename;
    }


    /**
     * Sets the tcpprofilename value for this Lbvserver.
     * 
     * @param tcpprofilename
     */
    public void setTcpprofilename(java.lang.String tcpprofilename) {
        this.tcpprofilename = tcpprofilename;
    }


    /**
     * Gets the httpprofilename value for this Lbvserver.
     * 
     * @return httpprofilename
     */
    public java.lang.String getHttpprofilename() {
        return httpprofilename;
    }


    /**
     * Sets the httpprofilename value for this Lbvserver.
     * 
     * @param httpprofilename
     */
    public void setHttpprofilename(java.lang.String httpprofilename) {
        this.httpprofilename = httpprofilename;
    }


    /**
     * Gets the dbprofilename value for this Lbvserver.
     * 
     * @return dbprofilename
     */
    public java.lang.String getDbprofilename() {
        return dbprofilename;
    }


    /**
     * Sets the dbprofilename value for this Lbvserver.
     * 
     * @param dbprofilename
     */
    public void setDbprofilename(java.lang.String dbprofilename) {
        this.dbprofilename = dbprofilename;
    }


    /**
     * Gets the comment value for this Lbvserver.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Lbvserver.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the policysubtype value for this Lbvserver.
     * 
     * @return policysubtype
     */
    public org.apache.axis.types.UnsignedInt[] getPolicysubtype() {
        return policysubtype;
    }


    /**
     * Sets the policysubtype value for this Lbvserver.
     * 
     * @param policysubtype
     */
    public void setPolicysubtype(org.apache.axis.types.UnsignedInt[] policysubtype) {
        this.policysubtype = policysubtype;
    }


    /**
     * Gets the l2Conn value for this Lbvserver.
     * 
     * @return l2Conn
     */
    public java.lang.String getL2Conn() {
        return l2Conn;
    }


    /**
     * Sets the l2Conn value for this Lbvserver.
     * 
     * @param l2Conn
     */
    public void setL2Conn(java.lang.String l2Conn) {
        this.l2Conn = l2Conn;
    }


    /**
     * Gets the oracleserverversion value for this Lbvserver.
     * 
     * @return oracleserverversion
     */
    public java.lang.String getOracleserverversion() {
        return oracleserverversion;
    }


    /**
     * Sets the oracleserverversion value for this Lbvserver.
     * 
     * @param oracleserverversion
     */
    public void setOracleserverversion(java.lang.String oracleserverversion) {
        this.oracleserverversion = oracleserverversion;
    }


    /**
     * Gets the mssqlserverversion value for this Lbvserver.
     * 
     * @return mssqlserverversion
     */
    public java.lang.String getMssqlserverversion() {
        return mssqlserverversion;
    }


    /**
     * Sets the mssqlserverversion value for this Lbvserver.
     * 
     * @param mssqlserverversion
     */
    public void setMssqlserverversion(java.lang.String mssqlserverversion) {
        this.mssqlserverversion = mssqlserverversion;
    }


    /**
     * Gets the mysqlprotocolversion value for this Lbvserver.
     * 
     * @return mysqlprotocolversion
     */
    public org.apache.axis.types.UnsignedInt getMysqlprotocolversion() {
        return mysqlprotocolversion;
    }


    /**
     * Sets the mysqlprotocolversion value for this Lbvserver.
     * 
     * @param mysqlprotocolversion
     */
    public void setMysqlprotocolversion(org.apache.axis.types.UnsignedInt mysqlprotocolversion) {
        this.mysqlprotocolversion = mysqlprotocolversion;
    }


    /**
     * Gets the mysqlserverversion value for this Lbvserver.
     * 
     * @return mysqlserverversion
     */
    public java.lang.String getMysqlserverversion() {
        return mysqlserverversion;
    }


    /**
     * Sets the mysqlserverversion value for this Lbvserver.
     * 
     * @param mysqlserverversion
     */
    public void setMysqlserverversion(java.lang.String mysqlserverversion) {
        this.mysqlserverversion = mysqlserverversion;
    }


    /**
     * Gets the mysqlcharacterset value for this Lbvserver.
     * 
     * @return mysqlcharacterset
     */
    public org.apache.axis.types.UnsignedInt getMysqlcharacterset() {
        return mysqlcharacterset;
    }


    /**
     * Sets the mysqlcharacterset value for this Lbvserver.
     * 
     * @param mysqlcharacterset
     */
    public void setMysqlcharacterset(org.apache.axis.types.UnsignedInt mysqlcharacterset) {
        this.mysqlcharacterset = mysqlcharacterset;
    }


    /**
     * Gets the mysqlservercapabilities value for this Lbvserver.
     * 
     * @return mysqlservercapabilities
     */
    public org.apache.axis.types.UnsignedInt getMysqlservercapabilities() {
        return mysqlservercapabilities;
    }


    /**
     * Sets the mysqlservercapabilities value for this Lbvserver.
     * 
     * @param mysqlservercapabilities
     */
    public void setMysqlservercapabilities(org.apache.axis.types.UnsignedInt mysqlservercapabilities) {
        this.mysqlservercapabilities = mysqlservercapabilities;
    }


    /**
     * Gets the appflowlog value for this Lbvserver.
     * 
     * @return appflowlog
     */
    public java.lang.String getAppflowlog() {
        return appflowlog;
    }


    /**
     * Sets the appflowlog value for this Lbvserver.
     * 
     * @param appflowlog
     */
    public void setAppflowlog(java.lang.String appflowlog) {
        this.appflowlog = appflowlog;
    }


    /**
     * Gets the netprofile value for this Lbvserver.
     * 
     * @return netprofile
     */
    public java.lang.String getNetprofile() {
        return netprofile;
    }


    /**
     * Sets the netprofile value for this Lbvserver.
     * 
     * @param netprofile
     */
    public void setNetprofile(java.lang.String netprofile) {
        this.netprofile = netprofile;
    }


    /**
     * Gets the isgslb value for this Lbvserver.
     * 
     * @return isgslb
     */
    public boolean isIsgslb() {
        return isgslb;
    }


    /**
     * Sets the isgslb value for this Lbvserver.
     * 
     * @param isgslb
     */
    public void setIsgslb(boolean isgslb) {
        this.isgslb = isgslb;
    }


    /**
     * Gets the icmpvsrresponse value for this Lbvserver.
     * 
     * @return icmpvsrresponse
     */
    public java.lang.String getIcmpvsrresponse() {
        return icmpvsrresponse;
    }


    /**
     * Sets the icmpvsrresponse value for this Lbvserver.
     * 
     * @param icmpvsrresponse
     */
    public void setIcmpvsrresponse(java.lang.String icmpvsrresponse) {
        this.icmpvsrresponse = icmpvsrresponse;
    }


    /**
     * Gets the newservicerequest value for this Lbvserver.
     * 
     * @return newservicerequest
     */
    public org.apache.axis.types.UnsignedInt getNewservicerequest() {
        return newservicerequest;
    }


    /**
     * Sets the newservicerequest value for this Lbvserver.
     * 
     * @param newservicerequest
     */
    public void setNewservicerequest(org.apache.axis.types.UnsignedInt newservicerequest) {
        this.newservicerequest = newservicerequest;
    }


    /**
     * Gets the newservicerequestunit value for this Lbvserver.
     * 
     * @return newservicerequestunit
     */
    public java.lang.String getNewservicerequestunit() {
        return newservicerequestunit;
    }


    /**
     * Sets the newservicerequestunit value for this Lbvserver.
     * 
     * @param newservicerequestunit
     */
    public void setNewservicerequestunit(java.lang.String newservicerequestunit) {
        this.newservicerequestunit = newservicerequestunit;
    }


    /**
     * Gets the newservicerequestincrementinterval value for this Lbvserver.
     * 
     * @return newservicerequestincrementinterval
     */
    public org.apache.axis.types.UnsignedInt getNewservicerequestincrementinterval() {
        return newservicerequestincrementinterval;
    }


    /**
     * Sets the newservicerequestincrementinterval value for this Lbvserver.
     * 
     * @param newservicerequestincrementinterval
     */
    public void setNewservicerequestincrementinterval(org.apache.axis.types.UnsignedInt newservicerequestincrementinterval) {
        this.newservicerequestincrementinterval = newservicerequestincrementinterval;
    }


    /**
     * Gets the vsvrbindsvcip value for this Lbvserver.
     * 
     * @return vsvrbindsvcip
     */
    public java.lang.String[] getVsvrbindsvcip() {
        return vsvrbindsvcip;
    }


    /**
     * Sets the vsvrbindsvcip value for this Lbvserver.
     * 
     * @param vsvrbindsvcip
     */
    public void setVsvrbindsvcip(java.lang.String[] vsvrbindsvcip) {
        this.vsvrbindsvcip = vsvrbindsvcip;
    }


    /**
     * Gets the vsvrbindsvcport value for this Lbvserver.
     * 
     * @return vsvrbindsvcport
     */
    public org.apache.axis.types.UnsignedInt[] getVsvrbindsvcport() {
        return vsvrbindsvcport;
    }


    /**
     * Sets the vsvrbindsvcport value for this Lbvserver.
     * 
     * @param vsvrbindsvcport
     */
    public void setVsvrbindsvcport(org.apache.axis.types.UnsignedInt[] vsvrbindsvcport) {
        this.vsvrbindsvcport = vsvrbindsvcport;
    }


    /**
     * Gets the persistavpno value for this Lbvserver.
     * 
     * @return persistavpno
     */
    public org.apache.axis.types.UnsignedInt[] getPersistavpno() {
        return persistavpno;
    }


    /**
     * Sets the persistavpno value for this Lbvserver.
     * 
     * @param persistavpno
     */
    public void setPersistavpno(org.apache.axis.types.UnsignedInt[] persistavpno) {
        this.persistavpno = persistavpno;
    }


    /**
     * Gets the skippersistency value for this Lbvserver.
     * 
     * @return skippersistency
     */
    public java.lang.String getSkippersistency() {
        return skippersistency;
    }


    /**
     * Sets the skippersistency value for this Lbvserver.
     * 
     * @param skippersistency
     */
    public void setSkippersistency(java.lang.String skippersistency) {
        this.skippersistency = skippersistency;
    }


    /**
     * Gets the minautoscalemembers value for this Lbvserver.
     * 
     * @return minautoscalemembers
     */
    public org.apache.axis.types.UnsignedInt getMinautoscalemembers() {
        return minautoscalemembers;
    }


    /**
     * Sets the minautoscalemembers value for this Lbvserver.
     * 
     * @param minautoscalemembers
     */
    public void setMinautoscalemembers(org.apache.axis.types.UnsignedInt minautoscalemembers) {
        this.minautoscalemembers = minautoscalemembers;
    }


    /**
     * Gets the maxautoscalemembers value for this Lbvserver.
     * 
     * @return maxautoscalemembers
     */
    public org.apache.axis.types.UnsignedInt getMaxautoscalemembers() {
        return maxautoscalemembers;
    }


    /**
     * Sets the maxautoscalemembers value for this Lbvserver.
     * 
     * @param maxautoscalemembers
     */
    public void setMaxautoscalemembers(org.apache.axis.types.UnsignedInt maxautoscalemembers) {
        this.maxautoscalemembers = maxautoscalemembers;
    }


    /**
     * Gets the authnprofile value for this Lbvserver.
     * 
     * @return authnprofile
     */
    public java.lang.String getAuthnprofile() {
        return authnprofile;
    }


    /**
     * Sets the authnprofile value for this Lbvserver.
     * 
     * @param authnprofile
     */
    public void setAuthnprofile(java.lang.String authnprofile) {
        this.authnprofile = authnprofile;
    }


    /**
     * Gets the macmoderetainvlan value for this Lbvserver.
     * 
     * @return macmoderetainvlan
     */
    public java.lang.String getMacmoderetainvlan() {
        return macmoderetainvlan;
    }


    /**
     * Sets the macmoderetainvlan value for this Lbvserver.
     * 
     * @param macmoderetainvlan
     */
    public void setMacmoderetainvlan(java.lang.String macmoderetainvlan) {
        this.macmoderetainvlan = macmoderetainvlan;
    }


    /**
     * Gets the dbslb value for this Lbvserver.
     * 
     * @return dbslb
     */
    public java.lang.String getDbslb() {
        return dbslb;
    }


    /**
     * Sets the dbslb value for this Lbvserver.
     * 
     * @param dbslb
     */
    public void setDbslb(java.lang.String dbslb) {
        this.dbslb = dbslb;
    }


    /**
     * Gets the dns64 value for this Lbvserver.
     * 
     * @return dns64
     */
    public java.lang.String getDns64() {
        return dns64;
    }


    /**
     * Sets the dns64 value for this Lbvserver.
     * 
     * @param dns64
     */
    public void setDns64(java.lang.String dns64) {
        this.dns64 = dns64;
    }


    /**
     * Gets the bypassaaaa value for this Lbvserver.
     * 
     * @return bypassaaaa
     */
    public java.lang.String getBypassaaaa() {
        return bypassaaaa;
    }


    /**
     * Sets the bypassaaaa value for this Lbvserver.
     * 
     * @param bypassaaaa
     */
    public void setBypassaaaa(java.lang.String bypassaaaa) {
        this.bypassaaaa = bypassaaaa;
    }


    /**
     * Gets the recursionavailable value for this Lbvserver.
     * 
     * @return recursionavailable
     */
    public java.lang.String getRecursionavailable() {
        return recursionavailable;
    }


    /**
     * Sets the recursionavailable value for this Lbvserver.
     * 
     * @param recursionavailable
     */
    public void setRecursionavailable(java.lang.String recursionavailable) {
        this.recursionavailable = recursionavailable;
    }


    /**
     * Gets the svcipaddress value for this Lbvserver.
     * 
     * @return svcipaddress
     */
    public java.lang.String[] getSvcipaddress() {
        return svcipaddress;
    }


    /**
     * Sets the svcipaddress value for this Lbvserver.
     * 
     * @param svcipaddress
     */
    public void setSvcipaddress(java.lang.String[] svcipaddress) {
        this.svcipaddress = svcipaddress;
    }


    /**
     * Gets the svcport value for this Lbvserver.
     * 
     * @return svcport
     */
    public org.apache.axis.types.UnsignedInt[] getSvcport() {
        return svcport;
    }


    /**
     * Sets the svcport value for this Lbvserver.
     * 
     * @param svcport
     */
    public void setSvcport(org.apache.axis.types.UnsignedInt[] svcport) {
        this.svcport = svcport;
    }


    /**
     * Gets the svctype value for this Lbvserver.
     * 
     * @return svctype
     */
    public java.lang.String[] getSvctype() {
        return svctype;
    }


    /**
     * Sets the svctype value for this Lbvserver.
     * 
     * @param svctype
     */
    public void setSvctype(java.lang.String[] svctype) {
        this.svctype = svctype;
    }


    /**
     * Gets the svcstate value for this Lbvserver.
     * 
     * @return svcstate
     */
    public java.lang.String[] getSvcstate() {
        return svcstate;
    }


    /**
     * Sets the svcstate value for this Lbvserver.
     * 
     * @param svcstate
     */
    public void setSvcstate(java.lang.String[] svcstate) {
        this.svcstate = svcstate;
    }


    /**
     * Gets the svcgrpsvcname value for this Lbvserver.
     * 
     * @return svcgrpsvcname
     */
    public java.lang.String[] getSvcgrpsvcname() {
        return svcgrpsvcname;
    }


    /**
     * Sets the svcgrpsvcname value for this Lbvserver.
     * 
     * @param svcgrpsvcname
     */
    public void setSvcgrpsvcname(java.lang.String[] svcgrpsvcname) {
        this.svcgrpsvcname = svcgrpsvcname;
    }


    /**
     * Gets the svcgrpmemgrpname value for this Lbvserver.
     * 
     * @return svcgrpmemgrpname
     */
    public java.lang.String[] getSvcgrpmemgrpname() {
        return svcgrpmemgrpname;
    }


    /**
     * Sets the svcgrpmemgrpname value for this Lbvserver.
     * 
     * @param svcgrpmemgrpname
     */
    public void setSvcgrpmemgrpname(java.lang.String[] svcgrpmemgrpname) {
        this.svcgrpmemgrpname = svcgrpmemgrpname;
    }


    /**
     * Gets the svcgrpmemip value for this Lbvserver.
     * 
     * @return svcgrpmemip
     */
    public java.lang.String[] getSvcgrpmemip() {
        return svcgrpmemip;
    }


    /**
     * Sets the svcgrpmemip value for this Lbvserver.
     * 
     * @param svcgrpmemip
     */
    public void setSvcgrpmemip(java.lang.String[] svcgrpmemip) {
        this.svcgrpmemip = svcgrpmemip;
    }


    /**
     * Gets the svcgrpmemport value for this Lbvserver.
     * 
     * @return svcgrpmemport
     */
    public org.apache.axis.types.UnsignedInt[] getSvcgrpmemport() {
        return svcgrpmemport;
    }


    /**
     * Sets the svcgrpmemport value for this Lbvserver.
     * 
     * @param svcgrpmemport
     */
    public void setSvcgrpmemport(org.apache.axis.types.UnsignedInt[] svcgrpmemport) {
        this.svcgrpmemport = svcgrpmemport;
    }


    /**
     * Gets the svcgrpmemsvctype value for this Lbvserver.
     * 
     * @return svcgrpmemsvctype
     */
    public java.lang.String[] getSvcgrpmemsvctype() {
        return svcgrpmemsvctype;
    }


    /**
     * Sets the svcgrpmemsvctype value for this Lbvserver.
     * 
     * @param svcgrpmemsvctype
     */
    public void setSvcgrpmemsvctype(java.lang.String[] svcgrpmemsvctype) {
        this.svcgrpmemsvctype = svcgrpmemsvctype;
    }


    /**
     * Gets the svcgrpmemstate value for this Lbvserver.
     * 
     * @return svcgrpmemstate
     */
    public java.lang.String[] getSvcgrpmemstate() {
        return svcgrpmemstate;
    }


    /**
     * Sets the svcgrpmemstate value for this Lbvserver.
     * 
     * @param svcgrpmemstate
     */
    public void setSvcgrpmemstate(java.lang.String[] svcgrpmemstate) {
        this.svcgrpmemstate = svcgrpmemstate;
    }


    /**
     * Gets the svcgrpmemweight value for this Lbvserver.
     * 
     * @return svcgrpmemweight
     */
    public org.apache.axis.types.UnsignedInt[] getSvcgrpmemweight() {
        return svcgrpmemweight;
    }


    /**
     * Sets the svcgrpmemweight value for this Lbvserver.
     * 
     * @param svcgrpmemweight
     */
    public void setSvcgrpmemweight(org.apache.axis.types.UnsignedInt[] svcgrpmemweight) {
        this.svcgrpmemweight = svcgrpmemweight;
    }


    /**
     * Gets the svcgrpmemdynwtmethod value for this Lbvserver.
     * 
     * @return svcgrpmemdynwtmethod
     */
    public org.apache.axis.types.UnsignedInt[] getSvcgrpmemdynwtmethod() {
        return svcgrpmemdynwtmethod;
    }


    /**
     * Sets the svcgrpmemdynwtmethod value for this Lbvserver.
     * 
     * @param svcgrpmemdynwtmethod
     */
    public void setSvcgrpmemdynwtmethod(org.apache.axis.types.UnsignedInt[] svcgrpmemdynwtmethod) {
        this.svcgrpmemdynwtmethod = svcgrpmemdynwtmethod;
    }


    /**
     * Gets the svcgrpmemcookieipport value for this Lbvserver.
     * 
     * @return svcgrpmemcookieipport
     */
    public java.lang.String[] getSvcgrpmemcookieipport() {
        return svcgrpmemcookieipport;
    }


    /**
     * Sets the svcgrpmemcookieipport value for this Lbvserver.
     * 
     * @param svcgrpmemcookieipport
     */
    public void setSvcgrpmemcookieipport(java.lang.String[] svcgrpmemcookieipport) {
        this.svcgrpmemcookieipport = svcgrpmemcookieipport;
    }


    /**
     * Gets the svcgrpmemcookiename value for this Lbvserver.
     * 
     * @return svcgrpmemcookiename
     */
    public java.lang.String[] getSvcgrpmemcookiename() {
        return svcgrpmemcookiename;
    }


    /**
     * Sets the svcgrpmemcookiename value for this Lbvserver.
     * 
     * @param svcgrpmemcookiename
     */
    public void setSvcgrpmemcookiename(java.lang.String[] svcgrpmemcookiename) {
        this.svcgrpmemcookiename = svcgrpmemcookiename;
    }


    /**
     * Gets the svcgrpmemvserverid value for this Lbvserver.
     * 
     * @return svcgrpmemvserverid
     */
    public java.lang.String[] getSvcgrpmemvserverid() {
        return svcgrpmemvserverid;
    }


    /**
     * Sets the svcgrpmemvserverid value for this Lbvserver.
     * 
     * @param svcgrpmemvserverid
     */
    public void setSvcgrpmemvserverid(java.lang.String[] svcgrpmemvserverid) {
        this.svcgrpmemvserverid = svcgrpmemvserverid;
    }


    /**
     * Gets the filterpolicyname value for this Lbvserver.
     * 
     * @return filterpolicyname
     */
    public java.lang.String[] getFilterpolicyname() {
        return filterpolicyname;
    }


    /**
     * Sets the filterpolicyname value for this Lbvserver.
     * 
     * @param filterpolicyname
     */
    public void setFilterpolicyname(java.lang.String[] filterpolicyname) {
        this.filterpolicyname = filterpolicyname;
    }


    /**
     * Gets the filterpolicyscflag value for this Lbvserver.
     * 
     * @return filterpolicyscflag
     */
    public java.lang.String[] getFilterpolicyscflag() {
        return filterpolicyscflag;
    }


    /**
     * Sets the filterpolicyscflag value for this Lbvserver.
     * 
     * @param filterpolicyscflag
     */
    public void setFilterpolicyscflag(java.lang.String[] filterpolicyscflag) {
        this.filterpolicyscflag = filterpolicyscflag;
    }


    /**
     * Gets the syslogpolicyname value for this Lbvserver.
     * 
     * @return syslogpolicyname
     */
    public java.lang.String[] getSyslogpolicyname() {
        return syslogpolicyname;
    }


    /**
     * Sets the syslogpolicyname value for this Lbvserver.
     * 
     * @param syslogpolicyname
     */
    public void setSyslogpolicyname(java.lang.String[] syslogpolicyname) {
        this.syslogpolicyname = syslogpolicyname;
    }


    /**
     * Gets the syslogpriority value for this Lbvserver.
     * 
     * @return syslogpriority
     */
    public org.apache.axis.types.UnsignedInt[] getSyslogpriority() {
        return syslogpriority;
    }


    /**
     * Sets the syslogpriority value for this Lbvserver.
     * 
     * @param syslogpriority
     */
    public void setSyslogpriority(org.apache.axis.types.UnsignedInt[] syslogpriority) {
        this.syslogpriority = syslogpriority;
    }


    /**
     * Gets the syslogpolicyscflag value for this Lbvserver.
     * 
     * @return syslogpolicyscflag
     */
    public java.lang.String[] getSyslogpolicyscflag() {
        return syslogpolicyscflag;
    }


    /**
     * Sets the syslogpolicyscflag value for this Lbvserver.
     * 
     * @param syslogpolicyscflag
     */
    public void setSyslogpolicyscflag(java.lang.String[] syslogpolicyscflag) {
        this.syslogpolicyscflag = syslogpolicyscflag;
    }


    /**
     * Gets the nslogpolicyname value for this Lbvserver.
     * 
     * @return nslogpolicyname
     */
    public java.lang.String[] getNslogpolicyname() {
        return nslogpolicyname;
    }


    /**
     * Sets the nslogpolicyname value for this Lbvserver.
     * 
     * @param nslogpolicyname
     */
    public void setNslogpolicyname(java.lang.String[] nslogpolicyname) {
        this.nslogpolicyname = nslogpolicyname;
    }


    /**
     * Gets the nslogpriority value for this Lbvserver.
     * 
     * @return nslogpriority
     */
    public org.apache.axis.types.UnsignedInt[] getNslogpriority() {
        return nslogpriority;
    }


    /**
     * Sets the nslogpriority value for this Lbvserver.
     * 
     * @param nslogpriority
     */
    public void setNslogpriority(org.apache.axis.types.UnsignedInt[] nslogpriority) {
        this.nslogpriority = nslogpriority;
    }


    /**
     * Gets the nslogpolicyscflag value for this Lbvserver.
     * 
     * @return nslogpolicyscflag
     */
    public java.lang.String[] getNslogpolicyscflag() {
        return nslogpolicyscflag;
    }


    /**
     * Sets the nslogpolicyscflag value for this Lbvserver.
     * 
     * @param nslogpolicyscflag
     */
    public void setNslogpolicyscflag(java.lang.String[] nslogpolicyscflag) {
        this.nslogpolicyscflag = nslogpolicyscflag;
    }


    /**
     * Gets the scpolicyname value for this Lbvserver.
     * 
     * @return scpolicyname
     */
    public java.lang.String[] getScpolicyname() {
        return scpolicyname;
    }


    /**
     * Sets the scpolicyname value for this Lbvserver.
     * 
     * @param scpolicyname
     */
    public void setScpolicyname(java.lang.String[] scpolicyname) {
        this.scpolicyname = scpolicyname;
    }


    /**
     * Gets the scpolicypriority value for this Lbvserver.
     * 
     * @return scpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getScpolicypriority() {
        return scpolicypriority;
    }


    /**
     * Sets the scpolicypriority value for this Lbvserver.
     * 
     * @param scpolicypriority
     */
    public void setScpolicypriority(org.apache.axis.types.UnsignedInt[] scpolicypriority) {
        this.scpolicypriority = scpolicypriority;
    }


    /**
     * Gets the pqpolicyname value for this Lbvserver.
     * 
     * @return pqpolicyname
     */
    public java.lang.String[] getPqpolicyname() {
        return pqpolicyname;
    }


    /**
     * Sets the pqpolicyname value for this Lbvserver.
     * 
     * @param pqpolicyname
     */
    public void setPqpolicyname(java.lang.String[] pqpolicyname) {
        this.pqpolicyname = pqpolicyname;
    }


    /**
     * Gets the appfwpolicyname value for this Lbvserver.
     * 
     * @return appfwpolicyname
     */
    public java.lang.String[] getAppfwpolicyname() {
        return appfwpolicyname;
    }


    /**
     * Sets the appfwpolicyname value for this Lbvserver.
     * 
     * @param appfwpolicyname
     */
    public void setAppfwpolicyname(java.lang.String[] appfwpolicyname) {
        this.appfwpolicyname = appfwpolicyname;
    }


    /**
     * Gets the appfwpriority value for this Lbvserver.
     * 
     * @return appfwpriority
     */
    public org.apache.axis.types.UnsignedInt[] getAppfwpriority() {
        return appfwpriority;
    }


    /**
     * Sets the appfwpriority value for this Lbvserver.
     * 
     * @param appfwpriority
     */
    public void setAppfwpriority(org.apache.axis.types.UnsignedInt[] appfwpriority) {
        this.appfwpriority = appfwpriority;
    }


    /**
     * Gets the appfwpolicygotoprioexpression value for this Lbvserver.
     * 
     * @return appfwpolicygotoprioexpression
     */
    public java.lang.String[] getAppfwpolicygotoprioexpression() {
        return appfwpolicygotoprioexpression;
    }


    /**
     * Sets the appfwpolicygotoprioexpression value for this Lbvserver.
     * 
     * @param appfwpolicygotoprioexpression
     */
    public void setAppfwpolicygotoprioexpression(java.lang.String[] appfwpolicygotoprioexpression) {
        this.appfwpolicygotoprioexpression = appfwpolicygotoprioexpression;
    }


    /**
     * Gets the appfwscflag value for this Lbvserver.
     * 
     * @return appfwscflag
     */
    public java.lang.String[] getAppfwscflag() {
        return appfwscflag;
    }


    /**
     * Sets the appfwscflag value for this Lbvserver.
     * 
     * @param appfwscflag
     */
    public void setAppfwscflag(java.lang.String[] appfwscflag) {
        this.appfwscflag = appfwscflag;
    }


    /**
     * Gets the appfwbindpoint value for this Lbvserver.
     * 
     * @return appfwbindpoint
     */
    public java.lang.String[] getAppfwbindpoint() {
        return appfwbindpoint;
    }


    /**
     * Sets the appfwbindpoint value for this Lbvserver.
     * 
     * @param appfwbindpoint
     */
    public void setAppfwbindpoint(java.lang.String[] appfwbindpoint) {
        this.appfwbindpoint = appfwbindpoint;
    }


    /**
     * Gets the appfwinvoke value for this Lbvserver.
     * 
     * @return appfwinvoke
     */
    public boolean[] getAppfwinvoke() {
        return appfwinvoke;
    }


    /**
     * Sets the appfwinvoke value for this Lbvserver.
     * 
     * @param appfwinvoke
     */
    public void setAppfwinvoke(boolean[] appfwinvoke) {
        this.appfwinvoke = appfwinvoke;
    }


    /**
     * Gets the appfwpolicyinvokelabeltype value for this Lbvserver.
     * 
     * @return appfwpolicyinvokelabeltype
     */
    public java.lang.String[] getAppfwpolicyinvokelabeltype() {
        return appfwpolicyinvokelabeltype;
    }


    /**
     * Sets the appfwpolicyinvokelabeltype value for this Lbvserver.
     * 
     * @param appfwpolicyinvokelabeltype
     */
    public void setAppfwpolicyinvokelabeltype(java.lang.String[] appfwpolicyinvokelabeltype) {
        this.appfwpolicyinvokelabeltype = appfwpolicyinvokelabeltype;
    }


    /**
     * Gets the appfwpolicyinvokelabelname value for this Lbvserver.
     * 
     * @return appfwpolicyinvokelabelname
     */
    public java.lang.String[] getAppfwpolicyinvokelabelname() {
        return appfwpolicyinvokelabelname;
    }


    /**
     * Sets the appfwpolicyinvokelabelname value for this Lbvserver.
     * 
     * @param appfwpolicyinvokelabelname
     */
    public void setAppfwpolicyinvokelabelname(java.lang.String[] appfwpolicyinvokelabelname) {
        this.appfwpolicyinvokelabelname = appfwpolicyinvokelabelname;
    }


    /**
     * Gets the appqospolicyname value for this Lbvserver.
     * 
     * @return appqospolicyname
     */
    public java.lang.String[] getAppqospolicyname() {
        return appqospolicyname;
    }


    /**
     * Sets the appqospolicyname value for this Lbvserver.
     * 
     * @param appqospolicyname
     */
    public void setAppqospolicyname(java.lang.String[] appqospolicyname) {
        this.appqospolicyname = appqospolicyname;
    }


    /**
     * Gets the appqospolicypriority value for this Lbvserver.
     * 
     * @return appqospolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getAppqospolicypriority() {
        return appqospolicypriority;
    }


    /**
     * Sets the appqospolicypriority value for this Lbvserver.
     * 
     * @param appqospolicypriority
     */
    public void setAppqospolicypriority(org.apache.axis.types.UnsignedInt[] appqospolicypriority) {
        this.appqospolicypriority = appqospolicypriority;
    }


    /**
     * Gets the appqospolicygotoprioexpr value for this Lbvserver.
     * 
     * @return appqospolicygotoprioexpr
     */
    public java.lang.String[] getAppqospolicygotoprioexpr() {
        return appqospolicygotoprioexpr;
    }


    /**
     * Sets the appqospolicygotoprioexpr value for this Lbvserver.
     * 
     * @param appqospolicygotoprioexpr
     */
    public void setAppqospolicygotoprioexpr(java.lang.String[] appqospolicygotoprioexpr) {
        this.appqospolicygotoprioexpr = appqospolicygotoprioexpr;
    }


    /**
     * Gets the appqospolicybindpoint value for this Lbvserver.
     * 
     * @return appqospolicybindpoint
     */
    public java.lang.String[] getAppqospolicybindpoint() {
        return appqospolicybindpoint;
    }


    /**
     * Sets the appqospolicybindpoint value for this Lbvserver.
     * 
     * @param appqospolicybindpoint
     */
    public void setAppqospolicybindpoint(java.lang.String[] appqospolicybindpoint) {
        this.appqospolicybindpoint = appqospolicybindpoint;
    }


    /**
     * Gets the transformpolicyname value for this Lbvserver.
     * 
     * @return transformpolicyname
     */
    public java.lang.String[] getTransformpolicyname() {
        return transformpolicyname;
    }


    /**
     * Sets the transformpolicyname value for this Lbvserver.
     * 
     * @param transformpolicyname
     */
    public void setTransformpolicyname(java.lang.String[] transformpolicyname) {
        this.transformpolicyname = transformpolicyname;
    }


    /**
     * Gets the transformpolicypriority value for this Lbvserver.
     * 
     * @return transformpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getTransformpolicypriority() {
        return transformpolicypriority;
    }


    /**
     * Sets the transformpolicypriority value for this Lbvserver.
     * 
     * @param transformpolicypriority
     */
    public void setTransformpolicypriority(org.apache.axis.types.UnsignedInt[] transformpolicypriority) {
        this.transformpolicypriority = transformpolicypriority;
    }


    /**
     * Gets the transformpolicygotoprioexpression value for this Lbvserver.
     * 
     * @return transformpolicygotoprioexpression
     */
    public java.lang.String[] getTransformpolicygotoprioexpression() {
        return transformpolicygotoprioexpression;
    }


    /**
     * Sets the transformpolicygotoprioexpression value for this Lbvserver.
     * 
     * @param transformpolicygotoprioexpression
     */
    public void setTransformpolicygotoprioexpression(java.lang.String[] transformpolicygotoprioexpression) {
        this.transformpolicygotoprioexpression = transformpolicygotoprioexpression;
    }


    /**
     * Gets the transformpolicybindpoint value for this Lbvserver.
     * 
     * @return transformpolicybindpoint
     */
    public java.lang.String[] getTransformpolicybindpoint() {
        return transformpolicybindpoint;
    }


    /**
     * Sets the transformpolicybindpoint value for this Lbvserver.
     * 
     * @param transformpolicybindpoint
     */
    public void setTransformpolicybindpoint(java.lang.String[] transformpolicybindpoint) {
        this.transformpolicybindpoint = transformpolicybindpoint;
    }


    /**
     * Gets the transforminvoke value for this Lbvserver.
     * 
     * @return transforminvoke
     */
    public boolean[] getTransforminvoke() {
        return transforminvoke;
    }


    /**
     * Sets the transforminvoke value for this Lbvserver.
     * 
     * @param transforminvoke
     */
    public void setTransforminvoke(boolean[] transforminvoke) {
        this.transforminvoke = transforminvoke;
    }


    /**
     * Gets the transformpolicyinvokelabeltype value for this Lbvserver.
     * 
     * @return transformpolicyinvokelabeltype
     */
    public java.lang.String[] getTransformpolicyinvokelabeltype() {
        return transformpolicyinvokelabeltype;
    }


    /**
     * Sets the transformpolicyinvokelabeltype value for this Lbvserver.
     * 
     * @param transformpolicyinvokelabeltype
     */
    public void setTransformpolicyinvokelabeltype(java.lang.String[] transformpolicyinvokelabeltype) {
        this.transformpolicyinvokelabeltype = transformpolicyinvokelabeltype;
    }


    /**
     * Gets the transformpolicyinvokelabelname value for this Lbvserver.
     * 
     * @return transformpolicyinvokelabelname
     */
    public java.lang.String[] getTransformpolicyinvokelabelname() {
        return transformpolicyinvokelabelname;
    }


    /**
     * Sets the transformpolicyinvokelabelname value for this Lbvserver.
     * 
     * @param transformpolicyinvokelabelname
     */
    public void setTransformpolicyinvokelabelname(java.lang.String[] transformpolicyinvokelabelname) {
        this.transformpolicyinvokelabelname = transformpolicyinvokelabelname;
    }


    /**
     * Gets the dospolicyname value for this Lbvserver.
     * 
     * @return dospolicyname
     */
    public java.lang.String[] getDospolicyname() {
        return dospolicyname;
    }


    /**
     * Sets the dospolicyname value for this Lbvserver.
     * 
     * @param dospolicyname
     */
    public void setDospolicyname(java.lang.String[] dospolicyname) {
        this.dospolicyname = dospolicyname;
    }


    /**
     * Gets the dospolicypriority value for this Lbvserver.
     * 
     * @return dospolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getDospolicypriority() {
        return dospolicypriority;
    }


    /**
     * Sets the dospolicypriority value for this Lbvserver.
     * 
     * @param dospolicypriority
     */
    public void setDospolicypriority(org.apache.axis.types.UnsignedInt[] dospolicypriority) {
        this.dospolicypriority = dospolicypriority;
    }


    /**
     * Gets the rwpolicyname value for this Lbvserver.
     * 
     * @return rwpolicyname
     */
    public java.lang.String[] getRwpolicyname() {
        return rwpolicyname;
    }


    /**
     * Sets the rwpolicyname value for this Lbvserver.
     * 
     * @param rwpolicyname
     */
    public void setRwpolicyname(java.lang.String[] rwpolicyname) {
        this.rwpolicyname = rwpolicyname;
    }


    /**
     * Gets the rwpolicypriority value for this Lbvserver.
     * 
     * @return rwpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getRwpolicypriority() {
        return rwpolicypriority;
    }


    /**
     * Sets the rwpolicypriority value for this Lbvserver.
     * 
     * @param rwpolicypriority
     */
    public void setRwpolicypriority(org.apache.axis.types.UnsignedInt[] rwpolicypriority) {
        this.rwpolicypriority = rwpolicypriority;
    }


    /**
     * Gets the rwpolicygotoprioexpression value for this Lbvserver.
     * 
     * @return rwpolicygotoprioexpression
     */
    public java.lang.String[] getRwpolicygotoprioexpression() {
        return rwpolicygotoprioexpression;
    }


    /**
     * Sets the rwpolicygotoprioexpression value for this Lbvserver.
     * 
     * @param rwpolicygotoprioexpression
     */
    public void setRwpolicygotoprioexpression(java.lang.String[] rwpolicygotoprioexpression) {
        this.rwpolicygotoprioexpression = rwpolicygotoprioexpression;
    }


    /**
     * Gets the rwpolicybindpoint value for this Lbvserver.
     * 
     * @return rwpolicybindpoint
     */
    public java.lang.String[] getRwpolicybindpoint() {
        return rwpolicybindpoint;
    }


    /**
     * Sets the rwpolicybindpoint value for this Lbvserver.
     * 
     * @param rwpolicybindpoint
     */
    public void setRwpolicybindpoint(java.lang.String[] rwpolicybindpoint) {
        this.rwpolicybindpoint = rwpolicybindpoint;
    }


    /**
     * Gets the rwinvoke value for this Lbvserver.
     * 
     * @return rwinvoke
     */
    public boolean[] getRwinvoke() {
        return rwinvoke;
    }


    /**
     * Sets the rwinvoke value for this Lbvserver.
     * 
     * @param rwinvoke
     */
    public void setRwinvoke(boolean[] rwinvoke) {
        this.rwinvoke = rwinvoke;
    }


    /**
     * Gets the rwpolicyinvokelabeltype value for this Lbvserver.
     * 
     * @return rwpolicyinvokelabeltype
     */
    public java.lang.String[] getRwpolicyinvokelabeltype() {
        return rwpolicyinvokelabeltype;
    }


    /**
     * Sets the rwpolicyinvokelabeltype value for this Lbvserver.
     * 
     * @param rwpolicyinvokelabeltype
     */
    public void setRwpolicyinvokelabeltype(java.lang.String[] rwpolicyinvokelabeltype) {
        this.rwpolicyinvokelabeltype = rwpolicyinvokelabeltype;
    }


    /**
     * Gets the rwpolicyinvokelabelname value for this Lbvserver.
     * 
     * @return rwpolicyinvokelabelname
     */
    public java.lang.String[] getRwpolicyinvokelabelname() {
        return rwpolicyinvokelabelname;
    }


    /**
     * Sets the rwpolicyinvokelabelname value for this Lbvserver.
     * 
     * @param rwpolicyinvokelabelname
     */
    public void setRwpolicyinvokelabelname(java.lang.String[] rwpolicyinvokelabelname) {
        this.rwpolicyinvokelabelname = rwpolicyinvokelabelname;
    }


    /**
     * Gets the cmppolicyname value for this Lbvserver.
     * 
     * @return cmppolicyname
     */
    public java.lang.String[] getCmppolicyname() {
        return cmppolicyname;
    }


    /**
     * Sets the cmppolicyname value for this Lbvserver.
     * 
     * @param cmppolicyname
     */
    public void setCmppolicyname(java.lang.String[] cmppolicyname) {
        this.cmppolicyname = cmppolicyname;
    }


    /**
     * Gets the cmppolicypriority value for this Lbvserver.
     * 
     * @return cmppolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getCmppolicypriority() {
        return cmppolicypriority;
    }


    /**
     * Sets the cmppolicypriority value for this Lbvserver.
     * 
     * @param cmppolicypriority
     */
    public void setCmppolicypriority(org.apache.axis.types.UnsignedInt[] cmppolicypriority) {
        this.cmppolicypriority = cmppolicypriority;
    }


    /**
     * Gets the cmppolicyscflag value for this Lbvserver.
     * 
     * @return cmppolicyscflag
     */
    public java.lang.String[] getCmppolicyscflag() {
        return cmppolicyscflag;
    }


    /**
     * Sets the cmppolicyscflag value for this Lbvserver.
     * 
     * @param cmppolicyscflag
     */
    public void setCmppolicyscflag(java.lang.String[] cmppolicyscflag) {
        this.cmppolicyscflag = cmppolicyscflag;
    }


    /**
     * Gets the cmppolicygotoprioexpr value for this Lbvserver.
     * 
     * @return cmppolicygotoprioexpr
     */
    public java.lang.String[] getCmppolicygotoprioexpr() {
        return cmppolicygotoprioexpr;
    }


    /**
     * Sets the cmppolicygotoprioexpr value for this Lbvserver.
     * 
     * @param cmppolicygotoprioexpr
     */
    public void setCmppolicygotoprioexpr(java.lang.String[] cmppolicygotoprioexpr) {
        this.cmppolicygotoprioexpr = cmppolicygotoprioexpr;
    }


    /**
     * Gets the cmppolicybindpoint value for this Lbvserver.
     * 
     * @return cmppolicybindpoint
     */
    public java.lang.String[] getCmppolicybindpoint() {
        return cmppolicybindpoint;
    }


    /**
     * Sets the cmppolicybindpoint value for this Lbvserver.
     * 
     * @param cmppolicybindpoint
     */
    public void setCmppolicybindpoint(java.lang.String[] cmppolicybindpoint) {
        this.cmppolicybindpoint = cmppolicybindpoint;
    }


    /**
     * Gets the cmpinvoke value for this Lbvserver.
     * 
     * @return cmpinvoke
     */
    public boolean[] getCmpinvoke() {
        return cmpinvoke;
    }


    /**
     * Sets the cmpinvoke value for this Lbvserver.
     * 
     * @param cmpinvoke
     */
    public void setCmpinvoke(boolean[] cmpinvoke) {
        this.cmpinvoke = cmpinvoke;
    }


    /**
     * Gets the cmppolicyinvokelabeltype value for this Lbvserver.
     * 
     * @return cmppolicyinvokelabeltype
     */
    public java.lang.String[] getCmppolicyinvokelabeltype() {
        return cmppolicyinvokelabeltype;
    }


    /**
     * Sets the cmppolicyinvokelabeltype value for this Lbvserver.
     * 
     * @param cmppolicyinvokelabeltype
     */
    public void setCmppolicyinvokelabeltype(java.lang.String[] cmppolicyinvokelabeltype) {
        this.cmppolicyinvokelabeltype = cmppolicyinvokelabeltype;
    }


    /**
     * Gets the cmppolicyinvokelabelname value for this Lbvserver.
     * 
     * @return cmppolicyinvokelabelname
     */
    public java.lang.String[] getCmppolicyinvokelabelname() {
        return cmppolicyinvokelabelname;
    }


    /**
     * Sets the cmppolicyinvokelabelname value for this Lbvserver.
     * 
     * @param cmppolicyinvokelabelname
     */
    public void setCmppolicyinvokelabelname(java.lang.String[] cmppolicyinvokelabelname) {
        this.cmppolicyinvokelabelname = cmppolicyinvokelabelname;
    }


    /**
     * Gets the copolicyname value for this Lbvserver.
     * 
     * @return copolicyname
     */
    public java.lang.String[] getCopolicyname() {
        return copolicyname;
    }


    /**
     * Sets the copolicyname value for this Lbvserver.
     * 
     * @param copolicyname
     */
    public void setCopolicyname(java.lang.String[] copolicyname) {
        this.copolicyname = copolicyname;
    }


    /**
     * Gets the copolicypriority value for this Lbvserver.
     * 
     * @return copolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getCopolicypriority() {
        return copolicypriority;
    }


    /**
     * Sets the copolicypriority value for this Lbvserver.
     * 
     * @param copolicypriority
     */
    public void setCopolicypriority(org.apache.axis.types.UnsignedInt[] copolicypriority) {
        this.copolicypriority = copolicypriority;
    }


    /**
     * Gets the copolicynextexpr value for this Lbvserver.
     * 
     * @return copolicynextexpr
     */
    public java.lang.String[] getCopolicynextexpr() {
        return copolicynextexpr;
    }


    /**
     * Sets the copolicynextexpr value for this Lbvserver.
     * 
     * @param copolicynextexpr
     */
    public void setCopolicynextexpr(java.lang.String[] copolicynextexpr) {
        this.copolicynextexpr = copolicynextexpr;
    }


    /**
     * Gets the copolicybindpoint value for this Lbvserver.
     * 
     * @return copolicybindpoint
     */
    public java.lang.String[] getCopolicybindpoint() {
        return copolicybindpoint;
    }


    /**
     * Sets the copolicybindpoint value for this Lbvserver.
     * 
     * @param copolicybindpoint
     */
    public void setCopolicybindpoint(java.lang.String[] copolicybindpoint) {
        this.copolicybindpoint = copolicybindpoint;
    }


    /**
     * Gets the authorpolicyname value for this Lbvserver.
     * 
     * @return authorpolicyname
     */
    public java.lang.String[] getAuthorpolicyname() {
        return authorpolicyname;
    }


    /**
     * Sets the authorpolicyname value for this Lbvserver.
     * 
     * @param authorpolicyname
     */
    public void setAuthorpolicyname(java.lang.String[] authorpolicyname) {
        this.authorpolicyname = authorpolicyname;
    }


    /**
     * Gets the authorpolicypriority value for this Lbvserver.
     * 
     * @return authorpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getAuthorpolicypriority() {
        return authorpolicypriority;
    }


    /**
     * Sets the authorpolicypriority value for this Lbvserver.
     * 
     * @param authorpolicypriority
     */
    public void setAuthorpolicypriority(org.apache.axis.types.UnsignedInt[] authorpolicypriority) {
        this.authorpolicypriority = authorpolicypriority;
    }


    /**
     * Gets the authorpolicyscflag value for this Lbvserver.
     * 
     * @return authorpolicyscflag
     */
    public java.lang.String[] getAuthorpolicyscflag() {
        return authorpolicyscflag;
    }


    /**
     * Sets the authorpolicyscflag value for this Lbvserver.
     * 
     * @param authorpolicyscflag
     */
    public void setAuthorpolicyscflag(java.lang.String[] authorpolicyscflag) {
        this.authorpolicyscflag = authorpolicyscflag;
    }


    /**
     * Gets the authorpolicygotoprioexpr value for this Lbvserver.
     * 
     * @return authorpolicygotoprioexpr
     */
    public java.lang.String[] getAuthorpolicygotoprioexpr() {
        return authorpolicygotoprioexpr;
    }


    /**
     * Sets the authorpolicygotoprioexpr value for this Lbvserver.
     * 
     * @param authorpolicygotoprioexpr
     */
    public void setAuthorpolicygotoprioexpr(java.lang.String[] authorpolicygotoprioexpr) {
        this.authorpolicygotoprioexpr = authorpolicygotoprioexpr;
    }


    /**
     * Gets the authorpolicybindpoint value for this Lbvserver.
     * 
     * @return authorpolicybindpoint
     */
    public java.lang.String[] getAuthorpolicybindpoint() {
        return authorpolicybindpoint;
    }


    /**
     * Sets the authorpolicybindpoint value for this Lbvserver.
     * 
     * @param authorpolicybindpoint
     */
    public void setAuthorpolicybindpoint(java.lang.String[] authorpolicybindpoint) {
        this.authorpolicybindpoint = authorpolicybindpoint;
    }


    /**
     * Gets the authorinvoke value for this Lbvserver.
     * 
     * @return authorinvoke
     */
    public boolean[] getAuthorinvoke() {
        return authorinvoke;
    }


    /**
     * Sets the authorinvoke value for this Lbvserver.
     * 
     * @param authorinvoke
     */
    public void setAuthorinvoke(boolean[] authorinvoke) {
        this.authorinvoke = authorinvoke;
    }


    /**
     * Gets the authorpolicyinvokelabeltype value for this Lbvserver.
     * 
     * @return authorpolicyinvokelabeltype
     */
    public java.lang.String[] getAuthorpolicyinvokelabeltype() {
        return authorpolicyinvokelabeltype;
    }


    /**
     * Sets the authorpolicyinvokelabeltype value for this Lbvserver.
     * 
     * @param authorpolicyinvokelabeltype
     */
    public void setAuthorpolicyinvokelabeltype(java.lang.String[] authorpolicyinvokelabeltype) {
        this.authorpolicyinvokelabeltype = authorpolicyinvokelabeltype;
    }


    /**
     * Gets the authorpolicyinvokelabelname value for this Lbvserver.
     * 
     * @return authorpolicyinvokelabelname
     */
    public java.lang.String[] getAuthorpolicyinvokelabelname() {
        return authorpolicyinvokelabelname;
    }


    /**
     * Sets the authorpolicyinvokelabelname value for this Lbvserver.
     * 
     * @param authorpolicyinvokelabelname
     */
    public void setAuthorpolicyinvokelabelname(java.lang.String[] authorpolicyinvokelabelname) {
        this.authorpolicyinvokelabelname = authorpolicyinvokelabelname;
    }


    /**
     * Gets the cachepolicyname value for this Lbvserver.
     * 
     * @return cachepolicyname
     */
    public java.lang.String[] getCachepolicyname() {
        return cachepolicyname;
    }


    /**
     * Sets the cachepolicyname value for this Lbvserver.
     * 
     * @param cachepolicyname
     */
    public void setCachepolicyname(java.lang.String[] cachepolicyname) {
        this.cachepolicyname = cachepolicyname;
    }


    /**
     * Gets the cachepolicypriority value for this Lbvserver.
     * 
     * @return cachepolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getCachepolicypriority() {
        return cachepolicypriority;
    }


    /**
     * Sets the cachepolicypriority value for this Lbvserver.
     * 
     * @param cachepolicypriority
     */
    public void setCachepolicypriority(org.apache.axis.types.UnsignedInt[] cachepolicypriority) {
        this.cachepolicypriority = cachepolicypriority;
    }


    /**
     * Gets the cachepolicygotoprioexpression value for this Lbvserver.
     * 
     * @return cachepolicygotoprioexpression
     */
    public java.lang.String[] getCachepolicygotoprioexpression() {
        return cachepolicygotoprioexpression;
    }


    /**
     * Sets the cachepolicygotoprioexpression value for this Lbvserver.
     * 
     * @param cachepolicygotoprioexpression
     */
    public void setCachepolicygotoprioexpression(java.lang.String[] cachepolicygotoprioexpression) {
        this.cachepolicygotoprioexpression = cachepolicygotoprioexpression;
    }


    /**
     * Gets the cachepolicybindpoint value for this Lbvserver.
     * 
     * @return cachepolicybindpoint
     */
    public java.lang.String[] getCachepolicybindpoint() {
        return cachepolicybindpoint;
    }


    /**
     * Sets the cachepolicybindpoint value for this Lbvserver.
     * 
     * @param cachepolicybindpoint
     */
    public void setCachepolicybindpoint(java.lang.String[] cachepolicybindpoint) {
        this.cachepolicybindpoint = cachepolicybindpoint;
    }


    /**
     * Gets the cacheinvoke value for this Lbvserver.
     * 
     * @return cacheinvoke
     */
    public boolean[] getCacheinvoke() {
        return cacheinvoke;
    }


    /**
     * Sets the cacheinvoke value for this Lbvserver.
     * 
     * @param cacheinvoke
     */
    public void setCacheinvoke(boolean[] cacheinvoke) {
        this.cacheinvoke = cacheinvoke;
    }


    /**
     * Gets the cachepolicyinvokelabeltype value for this Lbvserver.
     * 
     * @return cachepolicyinvokelabeltype
     */
    public java.lang.String[] getCachepolicyinvokelabeltype() {
        return cachepolicyinvokelabeltype;
    }


    /**
     * Sets the cachepolicyinvokelabeltype value for this Lbvserver.
     * 
     * @param cachepolicyinvokelabeltype
     */
    public void setCachepolicyinvokelabeltype(java.lang.String[] cachepolicyinvokelabeltype) {
        this.cachepolicyinvokelabeltype = cachepolicyinvokelabeltype;
    }


    /**
     * Gets the cachepolicyinvokelabelname value for this Lbvserver.
     * 
     * @return cachepolicyinvokelabelname
     */
    public java.lang.String[] getCachepolicyinvokelabelname() {
        return cachepolicyinvokelabelname;
    }


    /**
     * Sets the cachepolicyinvokelabelname value for this Lbvserver.
     * 
     * @param cachepolicyinvokelabelname
     */
    public void setCachepolicyinvokelabelname(java.lang.String[] cachepolicyinvokelabelname) {
        this.cachepolicyinvokelabelname = cachepolicyinvokelabelname;
    }


    /**
     * Gets the rsppolicyname value for this Lbvserver.
     * 
     * @return rsppolicyname
     */
    public java.lang.String[] getRsppolicyname() {
        return rsppolicyname;
    }


    /**
     * Sets the rsppolicyname value for this Lbvserver.
     * 
     * @param rsppolicyname
     */
    public void setRsppolicyname(java.lang.String[] rsppolicyname) {
        this.rsppolicyname = rsppolicyname;
    }


    /**
     * Gets the rsppolicypriority value for this Lbvserver.
     * 
     * @return rsppolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getRsppolicypriority() {
        return rsppolicypriority;
    }


    /**
     * Sets the rsppolicypriority value for this Lbvserver.
     * 
     * @param rsppolicypriority
     */
    public void setRsppolicypriority(org.apache.axis.types.UnsignedInt[] rsppolicypriority) {
        this.rsppolicypriority = rsppolicypriority;
    }


    /**
     * Gets the rsppolicygotoprioexpression value for this Lbvserver.
     * 
     * @return rsppolicygotoprioexpression
     */
    public java.lang.String[] getRsppolicygotoprioexpression() {
        return rsppolicygotoprioexpression;
    }


    /**
     * Sets the rsppolicygotoprioexpression value for this Lbvserver.
     * 
     * @param rsppolicygotoprioexpression
     */
    public void setRsppolicygotoprioexpression(java.lang.String[] rsppolicygotoprioexpression) {
        this.rsppolicygotoprioexpression = rsppolicygotoprioexpression;
    }


    /**
     * Gets the rspinvoke value for this Lbvserver.
     * 
     * @return rspinvoke
     */
    public boolean[] getRspinvoke() {
        return rspinvoke;
    }


    /**
     * Sets the rspinvoke value for this Lbvserver.
     * 
     * @param rspinvoke
     */
    public void setRspinvoke(boolean[] rspinvoke) {
        this.rspinvoke = rspinvoke;
    }


    /**
     * Gets the rsppolicyinvokelabeltype value for this Lbvserver.
     * 
     * @return rsppolicyinvokelabeltype
     */
    public java.lang.String[] getRsppolicyinvokelabeltype() {
        return rsppolicyinvokelabeltype;
    }


    /**
     * Sets the rsppolicyinvokelabeltype value for this Lbvserver.
     * 
     * @param rsppolicyinvokelabeltype
     */
    public void setRsppolicyinvokelabeltype(java.lang.String[] rsppolicyinvokelabeltype) {
        this.rsppolicyinvokelabeltype = rsppolicyinvokelabeltype;
    }


    /**
     * Gets the rsppolicyinvokelabelname value for this Lbvserver.
     * 
     * @return rsppolicyinvokelabelname
     */
    public java.lang.String[] getRsppolicyinvokelabelname() {
        return rsppolicyinvokelabelname;
    }


    /**
     * Sets the rsppolicyinvokelabelname value for this Lbvserver.
     * 
     * @param rsppolicyinvokelabelname
     */
    public void setRsppolicyinvokelabelname(java.lang.String[] rsppolicyinvokelabelname) {
        this.rsppolicyinvokelabelname = rsppolicyinvokelabelname;
    }


    /**
     * Gets the appflowpolicyname value for this Lbvserver.
     * 
     * @return appflowpolicyname
     */
    public java.lang.String[] getAppflowpolicyname() {
        return appflowpolicyname;
    }


    /**
     * Sets the appflowpolicyname value for this Lbvserver.
     * 
     * @param appflowpolicyname
     */
    public void setAppflowpolicyname(java.lang.String[] appflowpolicyname) {
        this.appflowpolicyname = appflowpolicyname;
    }


    /**
     * Gets the appflowpolicypriority value for this Lbvserver.
     * 
     * @return appflowpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getAppflowpolicypriority() {
        return appflowpolicypriority;
    }


    /**
     * Sets the appflowpolicypriority value for this Lbvserver.
     * 
     * @param appflowpolicypriority
     */
    public void setAppflowpolicypriority(org.apache.axis.types.UnsignedInt[] appflowpolicypriority) {
        this.appflowpolicypriority = appflowpolicypriority;
    }


    /**
     * Gets the appflowpolicygotoprioexpression value for this Lbvserver.
     * 
     * @return appflowpolicygotoprioexpression
     */
    public java.lang.String[] getAppflowpolicygotoprioexpression() {
        return appflowpolicygotoprioexpression;
    }


    /**
     * Sets the appflowpolicygotoprioexpression value for this Lbvserver.
     * 
     * @param appflowpolicygotoprioexpression
     */
    public void setAppflowpolicygotoprioexpression(java.lang.String[] appflowpolicygotoprioexpression) {
        this.appflowpolicygotoprioexpression = appflowpolicygotoprioexpression;
    }


    /**
     * Gets the appflowpolicybindpoint value for this Lbvserver.
     * 
     * @return appflowpolicybindpoint
     */
    public java.lang.String[] getAppflowpolicybindpoint() {
        return appflowpolicybindpoint;
    }


    /**
     * Sets the appflowpolicybindpoint value for this Lbvserver.
     * 
     * @param appflowpolicybindpoint
     */
    public void setAppflowpolicybindpoint(java.lang.String[] appflowpolicybindpoint) {
        this.appflowpolicybindpoint = appflowpolicybindpoint;
    }


    /**
     * Gets the appflowinvoke value for this Lbvserver.
     * 
     * @return appflowinvoke
     */
    public boolean[] getAppflowinvoke() {
        return appflowinvoke;
    }


    /**
     * Sets the appflowinvoke value for this Lbvserver.
     * 
     * @param appflowinvoke
     */
    public void setAppflowinvoke(boolean[] appflowinvoke) {
        this.appflowinvoke = appflowinvoke;
    }


    /**
     * Gets the appflowpolicyinvokelabeltype value for this Lbvserver.
     * 
     * @return appflowpolicyinvokelabeltype
     */
    public java.lang.String[] getAppflowpolicyinvokelabeltype() {
        return appflowpolicyinvokelabeltype;
    }


    /**
     * Sets the appflowpolicyinvokelabeltype value for this Lbvserver.
     * 
     * @param appflowpolicyinvokelabeltype
     */
    public void setAppflowpolicyinvokelabeltype(java.lang.String[] appflowpolicyinvokelabeltype) {
        this.appflowpolicyinvokelabeltype = appflowpolicyinvokelabeltype;
    }


    /**
     * Gets the appflowpolicyinvokelabelname value for this Lbvserver.
     * 
     * @return appflowpolicyinvokelabelname
     */
    public java.lang.String[] getAppflowpolicyinvokelabelname() {
        return appflowpolicyinvokelabelname;
    }


    /**
     * Sets the appflowpolicyinvokelabelname value for this Lbvserver.
     * 
     * @param appflowpolicyinvokelabelname
     */
    public void setAppflowpolicyinvokelabelname(java.lang.String[] appflowpolicyinvokelabelname) {
        this.appflowpolicyinvokelabelname = appflowpolicyinvokelabelname;
    }


    /**
     * Gets the csvserver value for this Lbvserver.
     * 
     * @return csvserver
     */
    public java.lang.String[] getCsvserver() {
        return csvserver;
    }


    /**
     * Sets the csvserver value for this Lbvserver.
     * 
     * @param csvserver
     */
    public void setCsvserver(java.lang.String[] csvserver) {
        this.csvserver = csvserver;
    }


    /**
     * Gets the cswpolicyname value for this Lbvserver.
     * 
     * @return cswpolicyname
     */
    public java.lang.String[] getCswpolicyname() {
        return cswpolicyname;
    }


    /**
     * Sets the cswpolicyname value for this Lbvserver.
     * 
     * @param cswpolicyname
     */
    public void setCswpolicyname(java.lang.String[] cswpolicyname) {
        this.cswpolicyname = cswpolicyname;
    }


    /**
     * Gets the cspriority value for this Lbvserver.
     * 
     * @return cspriority
     */
    public org.apache.axis.types.UnsignedInt[] getCspriority() {
        return cspriority;
    }


    /**
     * Sets the cspriority value for this Lbvserver.
     * 
     * @param cspriority
     */
    public void setCspriority(org.apache.axis.types.UnsignedInt[] cspriority) {
        this.cspriority = cspriority;
    }


    /**
     * Gets the tmtrafficpolicyname value for this Lbvserver.
     * 
     * @return tmtrafficpolicyname
     */
    public java.lang.String[] getTmtrafficpolicyname() {
        return tmtrafficpolicyname;
    }


    /**
     * Sets the tmtrafficpolicyname value for this Lbvserver.
     * 
     * @param tmtrafficpolicyname
     */
    public void setTmtrafficpolicyname(java.lang.String[] tmtrafficpolicyname) {
        this.tmtrafficpolicyname = tmtrafficpolicyname;
    }


    /**
     * Gets the tmtrafficpolicypriority value for this Lbvserver.
     * 
     * @return tmtrafficpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getTmtrafficpolicypriority() {
        return tmtrafficpolicypriority;
    }


    /**
     * Sets the tmtrafficpolicypriority value for this Lbvserver.
     * 
     * @param tmtrafficpolicypriority
     */
    public void setTmtrafficpolicypriority(org.apache.axis.types.UnsignedInt[] tmtrafficpolicypriority) {
        this.tmtrafficpolicypriority = tmtrafficpolicypriority;
    }


    /**
     * Gets the spilloverpolicyname value for this Lbvserver.
     * 
     * @return spilloverpolicyname
     */
    public java.lang.String[] getSpilloverpolicyname() {
        return spilloverpolicyname;
    }


    /**
     * Sets the spilloverpolicyname value for this Lbvserver.
     * 
     * @param spilloverpolicyname
     */
    public void setSpilloverpolicyname(java.lang.String[] spilloverpolicyname) {
        this.spilloverpolicyname = spilloverpolicyname;
    }


    /**
     * Gets the spilloverpolicygotoprioexpression value for this Lbvserver.
     * 
     * @return spilloverpolicygotoprioexpression
     */
    public java.lang.String[] getSpilloverpolicygotoprioexpression() {
        return spilloverpolicygotoprioexpression;
    }


    /**
     * Sets the spilloverpolicygotoprioexpression value for this Lbvserver.
     * 
     * @param spilloverpolicygotoprioexpression
     */
    public void setSpilloverpolicygotoprioexpression(java.lang.String[] spilloverpolicygotoprioexpression) {
        this.spilloverpolicygotoprioexpression = spilloverpolicygotoprioexpression;
    }


    /**
     * Gets the spilloverpolicyflowtype value for this Lbvserver.
     * 
     * @return spilloverpolicyflowtype
     */
    public java.lang.String[] getSpilloverpolicyflowtype() {
        return spilloverpolicyflowtype;
    }


    /**
     * Sets the spilloverpolicyflowtype value for this Lbvserver.
     * 
     * @param spilloverpolicyflowtype
     */
    public void setSpilloverpolicyflowtype(java.lang.String[] spilloverpolicyflowtype) {
        this.spilloverpolicyflowtype = spilloverpolicyflowtype;
    }


    /**
     * Gets the spilloverpolicypriority value for this Lbvserver.
     * 
     * @return spilloverpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getSpilloverpolicypriority() {
        return spilloverpolicypriority;
    }


    /**
     * Sets the spilloverpolicypriority value for this Lbvserver.
     * 
     * @param spilloverpolicypriority
     */
    public void setSpilloverpolicypriority(org.apache.axis.types.UnsignedInt[] spilloverpolicypriority) {
        this.spilloverpolicypriority = spilloverpolicypriority;
    }


    /**
     * Gets the dns64Policyname value for this Lbvserver.
     * 
     * @return dns64Policyname
     */
    public java.lang.String[] getDns64Policyname() {
        return dns64Policyname;
    }


    /**
     * Sets the dns64Policyname value for this Lbvserver.
     * 
     * @param dns64Policyname
     */
    public void setDns64Policyname(java.lang.String[] dns64Policyname) {
        this.dns64Policyname = dns64Policyname;
    }


    /**
     * Gets the dns64Policypriority value for this Lbvserver.
     * 
     * @return dns64Policypriority
     */
    public org.apache.axis.types.UnsignedInt[] getDns64Policypriority() {
        return dns64Policypriority;
    }


    /**
     * Sets the dns64Policypriority value for this Lbvserver.
     * 
     * @param dns64Policypriority
     */
    public void setDns64Policypriority(org.apache.axis.types.UnsignedInt[] dns64Policypriority) {
        this.dns64Policypriority = dns64Policypriority;
    }


    /**
     * Gets the dns64Policygotoprioexpression value for this Lbvserver.
     * 
     * @return dns64Policygotoprioexpression
     */
    public java.lang.String[] getDns64Policygotoprioexpression() {
        return dns64Policygotoprioexpression;
    }


    /**
     * Sets the dns64Policygotoprioexpression value for this Lbvserver.
     * 
     * @param dns64Policygotoprioexpression
     */
    public void setDns64Policygotoprioexpression(java.lang.String[] dns64Policygotoprioexpression) {
        this.dns64Policygotoprioexpression = dns64Policygotoprioexpression;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Lbvserver)) return false;
        Lbvserver other = (Lbvserver) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.insertvserveripport==null && other.getInsertvserveripport()==null) || 
             (this.insertvserveripport!=null &&
              this.insertvserveripport.equals(other.getInsertvserveripport()))) &&
            ((this.vipheader==null && other.getVipheader()==null) || 
             (this.vipheader!=null &&
              this.vipheader.equals(other.getVipheader()))) &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              this.ipaddress.equals(other.getIpaddress()))) &&
            ((this.ipaddress2==null && other.getIpaddress2()==null) || 
             (this.ipaddress2!=null &&
              this.ipaddress2.equals(other.getIpaddress2()))) &&
            ((this.ippattern==null && other.getIppattern()==null) || 
             (this.ippattern!=null &&
              this.ippattern.equals(other.getIppattern()))) &&
            ((this.ipmask==null && other.getIpmask()==null) || 
             (this.ipmask!=null &&
              this.ipmask.equals(other.getIpmask()))) &&
            ((this.listenpolicy==null && other.getListenpolicy()==null) || 
             (this.listenpolicy!=null &&
              this.listenpolicy.equals(other.getListenpolicy()))) &&
            ((this.listenpriority==null && other.getListenpriority()==null) || 
             (this.listenpriority!=null &&
              this.listenpriority.equals(other.getListenpriority()))) &&
            ((this.ipmapping==null && other.getIpmapping()==null) || 
             (this.ipmapping!=null &&
              this.ipmapping.equals(other.getIpmapping()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.range==null && other.getRange()==null) || 
             (this.range!=null &&
              this.range.equals(other.getRange()))) &&
            ((this.servicetype==null && other.getServicetype()==null) || 
             (this.servicetype!=null &&
              this.servicetype.equals(other.getServicetype()))) &&
            ((this.ngname==null && other.getNgname()==null) || 
             (this.ngname!=null &&
              this.ngname.equals(other.getNgname()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.effectivestate==null && other.getEffectivestate()==null) || 
             (this.effectivestate!=null &&
              this.effectivestate.equals(other.getEffectivestate()))) &&
            this.status == other.getStatus() &&
            this.lbrrreason == other.getLbrrreason() &&
            ((this.cachetype==null && other.getCachetype()==null) || 
             (this.cachetype!=null &&
              java.util.Arrays.equals(this.cachetype, other.getCachetype()))) &&
            ((this.redirect==null && other.getRedirect()==null) || 
             (this.redirect!=null &&
              this.redirect.equals(other.getRedirect()))) &&
            ((this.precedence==null && other.getPrecedence()==null) || 
             (this.precedence!=null &&
              this.precedence.equals(other.getPrecedence()))) &&
            ((this.redirecturl==null && other.getRedirecturl()==null) || 
             (this.redirecturl!=null &&
              this.redirecturl.equals(other.getRedirecturl()))) &&
            ((this.authentication==null && other.getAuthentication()==null) || 
             (this.authentication!=null &&
              this.authentication.equals(other.getAuthentication()))) &&
            ((this.authn401==null && other.getAuthn401()==null) || 
             (this.authn401!=null &&
              this.authn401.equals(other.getAuthn401()))) &&
            ((this.authnvsname==null && other.getAuthnvsname()==null) || 
             (this.authnvsname!=null &&
              this.authnvsname.equals(other.getAuthnvsname()))) &&
            ((this.homepage==null && other.getHomepage()==null) || 
             (this.homepage!=null &&
              this.homepage.equals(other.getHomepage()))) &&
            ((this.dnsvservername==null && other.getDnsvservername()==null) || 
             (this.dnsvservername!=null &&
              this.dnsvservername.equals(other.getDnsvservername()))) &&
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain()))) &&
            ((this.policyname==null && other.getPolicyname()==null) || 
             (this.policyname!=null &&
              this.policyname.equals(other.getPolicyname()))) &&
            ((this.servicename==null && other.getServicename()==null) || 
             (this.servicename!=null &&
              java.util.Arrays.equals(this.servicename, other.getServicename()))) &&
            ((this.servicegroupname==null && other.getServicegroupname()==null) || 
             (this.servicegroupname!=null &&
              java.util.Arrays.equals(this.servicegroupname, other.getServicegroupname()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              java.util.Arrays.equals(this.weight, other.getWeight()))) &&
            ((this.dynamicweight==null && other.getDynamicweight()==null) || 
             (this.dynamicweight!=null &&
              java.util.Arrays.equals(this.dynamicweight, other.getDynamicweight()))) &&
            ((this.cachevserver==null && other.getCachevserver()==null) || 
             (this.cachevserver!=null &&
              this.cachevserver.equals(other.getCachevserver()))) &&
            ((this.backupvserver==null && other.getBackupvserver()==null) || 
             (this.backupvserver!=null &&
              this.backupvserver.equals(other.getBackupvserver()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              java.util.Arrays.equals(this.priority, other.getPriority()))) &&
            ((this.clttimeout==null && other.getClttimeout()==null) || 
             (this.clttimeout!=null &&
              this.clttimeout.equals(other.getClttimeout()))) &&
            ((this.somethod==null && other.getSomethod()==null) || 
             (this.somethod!=null &&
              this.somethod.equals(other.getSomethod()))) &&
            ((this.sopersistence==null && other.getSopersistence()==null) || 
             (this.sopersistence!=null &&
              this.sopersistence.equals(other.getSopersistence()))) &&
            ((this.sopersistencetimeout==null && other.getSopersistencetimeout()==null) || 
             (this.sopersistencetimeout!=null &&
              this.sopersistencetimeout.equals(other.getSopersistencetimeout()))) &&
            ((this.healththreshold==null && other.getHealththreshold()==null) || 
             (this.healththreshold!=null &&
              this.healththreshold.equals(other.getHealththreshold()))) &&
            ((this.sothreshold==null && other.getSothreshold()==null) || 
             (this.sothreshold!=null &&
              this.sothreshold.equals(other.getSothreshold()))) &&
            ((this.sobackupaction==null && other.getSobackupaction()==null) || 
             (this.sobackupaction!=null &&
              this.sobackupaction.equals(other.getSobackupaction()))) &&
            ((this.lbmethod==null && other.getLbmethod()==null) || 
             (this.lbmethod!=null &&
              this.lbmethod.equals(other.getLbmethod()))) &&
            ((this.hashlength==null && other.getHashlength()==null) || 
             (this.hashlength!=null &&
              this.hashlength.equals(other.getHashlength()))) &&
            ((this.dataoffset==null && other.getDataoffset()==null) || 
             (this.dataoffset!=null &&
              this.dataoffset.equals(other.getDataoffset()))) &&
            ((this.health==null && other.getHealth()==null) || 
             (this.health!=null &&
              this.health.equals(other.getHealth()))) &&
            ((this.datalength==null && other.getDatalength()==null) || 
             (this.datalength!=null &&
              this.datalength.equals(other.getDatalength()))) &&
            ((this.netmask==null && other.getNetmask()==null) || 
             (this.netmask!=null &&
              this.netmask.equals(other.getNetmask()))) &&
            ((this.v6Netmasklen==null && other.getV6Netmasklen()==null) || 
             (this.v6Netmasklen!=null &&
              this.v6Netmasklen.equals(other.getV6Netmasklen()))) &&
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              this.rule.equals(other.getRule()))) &&
            ((this.resrule==null && other.getResrule()==null) || 
             (this.resrule!=null &&
              this.resrule.equals(other.getResrule()))) &&
            ((this.gotopriorityexpression==null && other.getGotopriorityexpression()==null) || 
             (this.gotopriorityexpression!=null &&
              this.gotopriorityexpression.equals(other.getGotopriorityexpression()))) &&
            ((this.ruletype==null && other.getRuletype()==null) || 
             (this.ruletype!=null &&
              this.ruletype.equals(other.getRuletype()))) &&
            ((this.groupname==null && other.getGroupname()==null) || 
             (this.groupname!=null &&
              this.groupname.equals(other.getGroupname()))) &&
            ((this.m==null && other.getM()==null) || 
             (this.m!=null &&
              this.m.equals(other.getM()))) &&
            ((this.tosid==null && other.getTosid()==null) || 
             (this.tosid!=null &&
              this.tosid.equals(other.getTosid()))) &&
            ((this.persistencetype==null && other.getPersistencetype()==null) || 
             (this.persistencetype!=null &&
              this.persistencetype.equals(other.getPersistencetype()))) &&
            ((this.timeout==null && other.getTimeout()==null) || 
             (this.timeout!=null &&
              this.timeout.equals(other.getTimeout()))) &&
            ((this.cookiedomain==null && other.getCookiedomain()==null) || 
             (this.cookiedomain!=null &&
              this.cookiedomain.equals(other.getCookiedomain()))) &&
            ((this.persistmask==null && other.getPersistmask()==null) || 
             (this.persistmask!=null &&
              this.persistmask.equals(other.getPersistmask()))) &&
            ((this.v6Persistmasklen==null && other.getV6Persistmasklen()==null) || 
             (this.v6Persistmasklen!=null &&
              this.v6Persistmasklen.equals(other.getV6Persistmasklen()))) &&
            ((this.persistencebackup==null && other.getPersistencebackup()==null) || 
             (this.persistencebackup!=null &&
              this.persistencebackup.equals(other.getPersistencebackup()))) &&
            ((this.backuppersistencetimeout==null && other.getBackuppersistencetimeout()==null) || 
             (this.backuppersistencetimeout!=null &&
              this.backuppersistencetimeout.equals(other.getBackuppersistencetimeout()))) &&
            ((this.cacheable==null && other.getCacheable()==null) || 
             (this.cacheable!=null &&
              this.cacheable.equals(other.getCacheable()))) &&
            ((this.pq==null && other.getPq()==null) || 
             (this.pq!=null &&
              this.pq.equals(other.getPq()))) &&
            ((this.sc==null && other.getSc()==null) || 
             (this.sc!=null &&
              this.sc.equals(other.getSc()))) &&
            ((this.rtspnat==null && other.getRtspnat()==null) || 
             (this.rtspnat!=null &&
              this.rtspnat.equals(other.getRtspnat()))) &&
            ((this.sessionless==null && other.getSessionless()==null) || 
             (this.sessionless!=null &&
              this.sessionless.equals(other.getSessionless()))) &&
            ((this.map==null && other.getMap()==null) || 
             (this.map!=null &&
              this.map.equals(other.getMap()))) &&
            ((this.connfailover==null && other.getConnfailover()==null) || 
             (this.connfailover!=null &&
              this.connfailover.equals(other.getConnfailover()))) &&
            ((this.redirectportrewrite==null && other.getRedirectportrewrite()==null) || 
             (this.redirectportrewrite!=null &&
              this.redirectportrewrite.equals(other.getRedirectportrewrite()))) &&
            ((this.downstateflush==null && other.getDownstateflush()==null) || 
             (this.downstateflush!=null &&
              this.downstateflush.equals(other.getDownstateflush()))) &&
            ((this.disableprimaryondown==null && other.getDisableprimaryondown()==null) || 
             (this.disableprimaryondown!=null &&
              this.disableprimaryondown.equals(other.getDisableprimaryondown()))) &&
            ((this.gt2Gb==null && other.getGt2Gb()==null) || 
             (this.gt2Gb!=null &&
              this.gt2Gb.equals(other.getGt2Gb()))) &&
            ((this.consolidatedlconn==null && other.getConsolidatedlconn()==null) || 
             (this.consolidatedlconn!=null &&
              this.consolidatedlconn.equals(other.getConsolidatedlconn()))) &&
            ((this.consolidatedlconngbl==null && other.getConsolidatedlconngbl()==null) || 
             (this.consolidatedlconngbl!=null &&
              this.consolidatedlconngbl.equals(other.getConsolidatedlconngbl()))) &&
            this.thresholdvalue == other.getThresholdvalue() &&
            ((this.type2==null && other.getType2()==null) || 
             (this.type2!=null &&
              this.type2.equals(other.getType2()))) &&
            this.invoke == other.isInvoke() &&
            ((this.labeltype==null && other.getLabeltype()==null) || 
             (this.labeltype!=null &&
              this.labeltype.equals(other.getLabeltype()))) &&
            ((this.labelname==null && other.getLabelname()==null) || 
             (this.labelname!=null &&
              this.labelname.equals(other.getLabelname()))) &&
            ((this.cookieipport==null && other.getCookieipport()==null) || 
             (this.cookieipport!=null &&
              java.util.Arrays.equals(this.cookieipport, other.getCookieipport()))) &&
            ((this.cookiename==null && other.getCookiename()==null) || 
             (this.cookiename!=null &&
              this.cookiename.equals(other.getCookiename()))) &&
            ((this.vserverid==null && other.getVserverid()==null) || 
             (this.vserverid!=null &&
              java.util.Arrays.equals(this.vserverid, other.getVserverid()))) &&
            this.version == other.getVersion() &&
            ((this.totalservices==null && other.getTotalservices()==null) || 
             (this.totalservices!=null &&
              this.totalservices.equals(other.getTotalservices()))) &&
            ((this.activeservices==null && other.getActiveservices()==null) || 
             (this.activeservices!=null &&
              this.activeservices.equals(other.getActiveservices()))) &&
            ((this.statechangetimesec==null && other.getStatechangetimesec()==null) || 
             (this.statechangetimesec!=null &&
              this.statechangetimesec.equals(other.getStatechangetimesec()))) &&
            ((this.statechangetimeseconds==null && other.getStatechangetimeseconds()==null) || 
             (this.statechangetimeseconds!=null &&
              this.statechangetimeseconds.equals(other.getStatechangetimeseconds()))) &&
            ((this.statechangetimemsec==null && other.getStatechangetimemsec()==null) || 
             (this.statechangetimemsec!=null &&
              this.statechangetimemsec.equals(other.getStatechangetimemsec()))) &&
            ((this.tickssincelaststatechange==null && other.getTickssincelaststatechange()==null) || 
             (this.tickssincelaststatechange!=null &&
              this.tickssincelaststatechange.equals(other.getTickssincelaststatechange()))) &&
            ((this.hits==null && other.getHits()==null) || 
             (this.hits!=null &&
              java.util.Arrays.equals(this.hits, other.getHits()))) &&
            ((this.pipolicyhits==null && other.getPipolicyhits()==null) || 
             (this.pipolicyhits!=null &&
              java.util.Arrays.equals(this.pipolicyhits, other.getPipolicyhits()))) &&
            ((this.authenticationhost==null && other.getAuthenticationhost()==null) || 
             (this.authenticationhost!=null &&
              this.authenticationhost.equals(other.getAuthenticationhost()))) &&
            ((this.push==null && other.getPush()==null) || 
             (this.push!=null &&
              this.push.equals(other.getPush()))) &&
            ((this.pushvserver==null && other.getPushvserver()==null) || 
             (this.pushvserver!=null &&
              this.pushvserver.equals(other.getPushvserver()))) &&
            ((this.pushlabel==null && other.getPushlabel()==null) || 
             (this.pushlabel!=null &&
              this.pushlabel.equals(other.getPushlabel()))) &&
            ((this.pushmulticlients==null && other.getPushmulticlients()==null) || 
             (this.pushmulticlients!=null &&
              this.pushmulticlients.equals(other.getPushmulticlients()))) &&
            ((this.tcpprofilename==null && other.getTcpprofilename()==null) || 
             (this.tcpprofilename!=null &&
              this.tcpprofilename.equals(other.getTcpprofilename()))) &&
            ((this.httpprofilename==null && other.getHttpprofilename()==null) || 
             (this.httpprofilename!=null &&
              this.httpprofilename.equals(other.getHttpprofilename()))) &&
            ((this.dbprofilename==null && other.getDbprofilename()==null) || 
             (this.dbprofilename!=null &&
              this.dbprofilename.equals(other.getDbprofilename()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.policysubtype==null && other.getPolicysubtype()==null) || 
             (this.policysubtype!=null &&
              java.util.Arrays.equals(this.policysubtype, other.getPolicysubtype()))) &&
            ((this.l2Conn==null && other.getL2Conn()==null) || 
             (this.l2Conn!=null &&
              this.l2Conn.equals(other.getL2Conn()))) &&
            ((this.oracleserverversion==null && other.getOracleserverversion()==null) || 
             (this.oracleserverversion!=null &&
              this.oracleserverversion.equals(other.getOracleserverversion()))) &&
            ((this.mssqlserverversion==null && other.getMssqlserverversion()==null) || 
             (this.mssqlserverversion!=null &&
              this.mssqlserverversion.equals(other.getMssqlserverversion()))) &&
            ((this.mysqlprotocolversion==null && other.getMysqlprotocolversion()==null) || 
             (this.mysqlprotocolversion!=null &&
              this.mysqlprotocolversion.equals(other.getMysqlprotocolversion()))) &&
            ((this.mysqlserverversion==null && other.getMysqlserverversion()==null) || 
             (this.mysqlserverversion!=null &&
              this.mysqlserverversion.equals(other.getMysqlserverversion()))) &&
            ((this.mysqlcharacterset==null && other.getMysqlcharacterset()==null) || 
             (this.mysqlcharacterset!=null &&
              this.mysqlcharacterset.equals(other.getMysqlcharacterset()))) &&
            ((this.mysqlservercapabilities==null && other.getMysqlservercapabilities()==null) || 
             (this.mysqlservercapabilities!=null &&
              this.mysqlservercapabilities.equals(other.getMysqlservercapabilities()))) &&
            ((this.appflowlog==null && other.getAppflowlog()==null) || 
             (this.appflowlog!=null &&
              this.appflowlog.equals(other.getAppflowlog()))) &&
            ((this.netprofile==null && other.getNetprofile()==null) || 
             (this.netprofile!=null &&
              this.netprofile.equals(other.getNetprofile()))) &&
            this.isgslb == other.isIsgslb() &&
            ((this.icmpvsrresponse==null && other.getIcmpvsrresponse()==null) || 
             (this.icmpvsrresponse!=null &&
              this.icmpvsrresponse.equals(other.getIcmpvsrresponse()))) &&
            ((this.newservicerequest==null && other.getNewservicerequest()==null) || 
             (this.newservicerequest!=null &&
              this.newservicerequest.equals(other.getNewservicerequest()))) &&
            ((this.newservicerequestunit==null && other.getNewservicerequestunit()==null) || 
             (this.newservicerequestunit!=null &&
              this.newservicerequestunit.equals(other.getNewservicerequestunit()))) &&
            ((this.newservicerequestincrementinterval==null && other.getNewservicerequestincrementinterval()==null) || 
             (this.newservicerequestincrementinterval!=null &&
              this.newservicerequestincrementinterval.equals(other.getNewservicerequestincrementinterval()))) &&
            ((this.vsvrbindsvcip==null && other.getVsvrbindsvcip()==null) || 
             (this.vsvrbindsvcip!=null &&
              java.util.Arrays.equals(this.vsvrbindsvcip, other.getVsvrbindsvcip()))) &&
            ((this.vsvrbindsvcport==null && other.getVsvrbindsvcport()==null) || 
             (this.vsvrbindsvcport!=null &&
              java.util.Arrays.equals(this.vsvrbindsvcport, other.getVsvrbindsvcport()))) &&
            ((this.persistavpno==null && other.getPersistavpno()==null) || 
             (this.persistavpno!=null &&
              java.util.Arrays.equals(this.persistavpno, other.getPersistavpno()))) &&
            ((this.skippersistency==null && other.getSkippersistency()==null) || 
             (this.skippersistency!=null &&
              this.skippersistency.equals(other.getSkippersistency()))) &&
            ((this.minautoscalemembers==null && other.getMinautoscalemembers()==null) || 
             (this.minautoscalemembers!=null &&
              this.minautoscalemembers.equals(other.getMinautoscalemembers()))) &&
            ((this.maxautoscalemembers==null && other.getMaxautoscalemembers()==null) || 
             (this.maxautoscalemembers!=null &&
              this.maxautoscalemembers.equals(other.getMaxautoscalemembers()))) &&
            ((this.authnprofile==null && other.getAuthnprofile()==null) || 
             (this.authnprofile!=null &&
              this.authnprofile.equals(other.getAuthnprofile()))) &&
            ((this.macmoderetainvlan==null && other.getMacmoderetainvlan()==null) || 
             (this.macmoderetainvlan!=null &&
              this.macmoderetainvlan.equals(other.getMacmoderetainvlan()))) &&
            ((this.dbslb==null && other.getDbslb()==null) || 
             (this.dbslb!=null &&
              this.dbslb.equals(other.getDbslb()))) &&
            ((this.dns64==null && other.getDns64()==null) || 
             (this.dns64!=null &&
              this.dns64.equals(other.getDns64()))) &&
            ((this.bypassaaaa==null && other.getBypassaaaa()==null) || 
             (this.bypassaaaa!=null &&
              this.bypassaaaa.equals(other.getBypassaaaa()))) &&
            ((this.recursionavailable==null && other.getRecursionavailable()==null) || 
             (this.recursionavailable!=null &&
              this.recursionavailable.equals(other.getRecursionavailable()))) &&
            ((this.svcipaddress==null && other.getSvcipaddress()==null) || 
             (this.svcipaddress!=null &&
              java.util.Arrays.equals(this.svcipaddress, other.getSvcipaddress()))) &&
            ((this.svcport==null && other.getSvcport()==null) || 
             (this.svcport!=null &&
              java.util.Arrays.equals(this.svcport, other.getSvcport()))) &&
            ((this.svctype==null && other.getSvctype()==null) || 
             (this.svctype!=null &&
              java.util.Arrays.equals(this.svctype, other.getSvctype()))) &&
            ((this.svcstate==null && other.getSvcstate()==null) || 
             (this.svcstate!=null &&
              java.util.Arrays.equals(this.svcstate, other.getSvcstate()))) &&
            ((this.svcgrpsvcname==null && other.getSvcgrpsvcname()==null) || 
             (this.svcgrpsvcname!=null &&
              java.util.Arrays.equals(this.svcgrpsvcname, other.getSvcgrpsvcname()))) &&
            ((this.svcgrpmemgrpname==null && other.getSvcgrpmemgrpname()==null) || 
             (this.svcgrpmemgrpname!=null &&
              java.util.Arrays.equals(this.svcgrpmemgrpname, other.getSvcgrpmemgrpname()))) &&
            ((this.svcgrpmemip==null && other.getSvcgrpmemip()==null) || 
             (this.svcgrpmemip!=null &&
              java.util.Arrays.equals(this.svcgrpmemip, other.getSvcgrpmemip()))) &&
            ((this.svcgrpmemport==null && other.getSvcgrpmemport()==null) || 
             (this.svcgrpmemport!=null &&
              java.util.Arrays.equals(this.svcgrpmemport, other.getSvcgrpmemport()))) &&
            ((this.svcgrpmemsvctype==null && other.getSvcgrpmemsvctype()==null) || 
             (this.svcgrpmemsvctype!=null &&
              java.util.Arrays.equals(this.svcgrpmemsvctype, other.getSvcgrpmemsvctype()))) &&
            ((this.svcgrpmemstate==null && other.getSvcgrpmemstate()==null) || 
             (this.svcgrpmemstate!=null &&
              java.util.Arrays.equals(this.svcgrpmemstate, other.getSvcgrpmemstate()))) &&
            ((this.svcgrpmemweight==null && other.getSvcgrpmemweight()==null) || 
             (this.svcgrpmemweight!=null &&
              java.util.Arrays.equals(this.svcgrpmemweight, other.getSvcgrpmemweight()))) &&
            ((this.svcgrpmemdynwtmethod==null && other.getSvcgrpmemdynwtmethod()==null) || 
             (this.svcgrpmemdynwtmethod!=null &&
              java.util.Arrays.equals(this.svcgrpmemdynwtmethod, other.getSvcgrpmemdynwtmethod()))) &&
            ((this.svcgrpmemcookieipport==null && other.getSvcgrpmemcookieipport()==null) || 
             (this.svcgrpmemcookieipport!=null &&
              java.util.Arrays.equals(this.svcgrpmemcookieipport, other.getSvcgrpmemcookieipport()))) &&
            ((this.svcgrpmemcookiename==null && other.getSvcgrpmemcookiename()==null) || 
             (this.svcgrpmemcookiename!=null &&
              java.util.Arrays.equals(this.svcgrpmemcookiename, other.getSvcgrpmemcookiename()))) &&
            ((this.svcgrpmemvserverid==null && other.getSvcgrpmemvserverid()==null) || 
             (this.svcgrpmemvserverid!=null &&
              java.util.Arrays.equals(this.svcgrpmemvserverid, other.getSvcgrpmemvserverid()))) &&
            ((this.filterpolicyname==null && other.getFilterpolicyname()==null) || 
             (this.filterpolicyname!=null &&
              java.util.Arrays.equals(this.filterpolicyname, other.getFilterpolicyname()))) &&
            ((this.filterpolicyscflag==null && other.getFilterpolicyscflag()==null) || 
             (this.filterpolicyscflag!=null &&
              java.util.Arrays.equals(this.filterpolicyscflag, other.getFilterpolicyscflag()))) &&
            ((this.syslogpolicyname==null && other.getSyslogpolicyname()==null) || 
             (this.syslogpolicyname!=null &&
              java.util.Arrays.equals(this.syslogpolicyname, other.getSyslogpolicyname()))) &&
            ((this.syslogpriority==null && other.getSyslogpriority()==null) || 
             (this.syslogpriority!=null &&
              java.util.Arrays.equals(this.syslogpriority, other.getSyslogpriority()))) &&
            ((this.syslogpolicyscflag==null && other.getSyslogpolicyscflag()==null) || 
             (this.syslogpolicyscflag!=null &&
              java.util.Arrays.equals(this.syslogpolicyscflag, other.getSyslogpolicyscflag()))) &&
            ((this.nslogpolicyname==null && other.getNslogpolicyname()==null) || 
             (this.nslogpolicyname!=null &&
              java.util.Arrays.equals(this.nslogpolicyname, other.getNslogpolicyname()))) &&
            ((this.nslogpriority==null && other.getNslogpriority()==null) || 
             (this.nslogpriority!=null &&
              java.util.Arrays.equals(this.nslogpriority, other.getNslogpriority()))) &&
            ((this.nslogpolicyscflag==null && other.getNslogpolicyscflag()==null) || 
             (this.nslogpolicyscflag!=null &&
              java.util.Arrays.equals(this.nslogpolicyscflag, other.getNslogpolicyscflag()))) &&
            ((this.scpolicyname==null && other.getScpolicyname()==null) || 
             (this.scpolicyname!=null &&
              java.util.Arrays.equals(this.scpolicyname, other.getScpolicyname()))) &&
            ((this.scpolicypriority==null && other.getScpolicypriority()==null) || 
             (this.scpolicypriority!=null &&
              java.util.Arrays.equals(this.scpolicypriority, other.getScpolicypriority()))) &&
            ((this.pqpolicyname==null && other.getPqpolicyname()==null) || 
             (this.pqpolicyname!=null &&
              java.util.Arrays.equals(this.pqpolicyname, other.getPqpolicyname()))) &&
            ((this.appfwpolicyname==null && other.getAppfwpolicyname()==null) || 
             (this.appfwpolicyname!=null &&
              java.util.Arrays.equals(this.appfwpolicyname, other.getAppfwpolicyname()))) &&
            ((this.appfwpriority==null && other.getAppfwpriority()==null) || 
             (this.appfwpriority!=null &&
              java.util.Arrays.equals(this.appfwpriority, other.getAppfwpriority()))) &&
            ((this.appfwpolicygotoprioexpression==null && other.getAppfwpolicygotoprioexpression()==null) || 
             (this.appfwpolicygotoprioexpression!=null &&
              java.util.Arrays.equals(this.appfwpolicygotoprioexpression, other.getAppfwpolicygotoprioexpression()))) &&
            ((this.appfwscflag==null && other.getAppfwscflag()==null) || 
             (this.appfwscflag!=null &&
              java.util.Arrays.equals(this.appfwscflag, other.getAppfwscflag()))) &&
            ((this.appfwbindpoint==null && other.getAppfwbindpoint()==null) || 
             (this.appfwbindpoint!=null &&
              java.util.Arrays.equals(this.appfwbindpoint, other.getAppfwbindpoint()))) &&
            ((this.appfwinvoke==null && other.getAppfwinvoke()==null) || 
             (this.appfwinvoke!=null &&
              java.util.Arrays.equals(this.appfwinvoke, other.getAppfwinvoke()))) &&
            ((this.appfwpolicyinvokelabeltype==null && other.getAppfwpolicyinvokelabeltype()==null) || 
             (this.appfwpolicyinvokelabeltype!=null &&
              java.util.Arrays.equals(this.appfwpolicyinvokelabeltype, other.getAppfwpolicyinvokelabeltype()))) &&
            ((this.appfwpolicyinvokelabelname==null && other.getAppfwpolicyinvokelabelname()==null) || 
             (this.appfwpolicyinvokelabelname!=null &&
              java.util.Arrays.equals(this.appfwpolicyinvokelabelname, other.getAppfwpolicyinvokelabelname()))) &&
            ((this.appqospolicyname==null && other.getAppqospolicyname()==null) || 
             (this.appqospolicyname!=null &&
              java.util.Arrays.equals(this.appqospolicyname, other.getAppqospolicyname()))) &&
            ((this.appqospolicypriority==null && other.getAppqospolicypriority()==null) || 
             (this.appqospolicypriority!=null &&
              java.util.Arrays.equals(this.appqospolicypriority, other.getAppqospolicypriority()))) &&
            ((this.appqospolicygotoprioexpr==null && other.getAppqospolicygotoprioexpr()==null) || 
             (this.appqospolicygotoprioexpr!=null &&
              java.util.Arrays.equals(this.appqospolicygotoprioexpr, other.getAppqospolicygotoprioexpr()))) &&
            ((this.appqospolicybindpoint==null && other.getAppqospolicybindpoint()==null) || 
             (this.appqospolicybindpoint!=null &&
              java.util.Arrays.equals(this.appqospolicybindpoint, other.getAppqospolicybindpoint()))) &&
            ((this.transformpolicyname==null && other.getTransformpolicyname()==null) || 
             (this.transformpolicyname!=null &&
              java.util.Arrays.equals(this.transformpolicyname, other.getTransformpolicyname()))) &&
            ((this.transformpolicypriority==null && other.getTransformpolicypriority()==null) || 
             (this.transformpolicypriority!=null &&
              java.util.Arrays.equals(this.transformpolicypriority, other.getTransformpolicypriority()))) &&
            ((this.transformpolicygotoprioexpression==null && other.getTransformpolicygotoprioexpression()==null) || 
             (this.transformpolicygotoprioexpression!=null &&
              java.util.Arrays.equals(this.transformpolicygotoprioexpression, other.getTransformpolicygotoprioexpression()))) &&
            ((this.transformpolicybindpoint==null && other.getTransformpolicybindpoint()==null) || 
             (this.transformpolicybindpoint!=null &&
              java.util.Arrays.equals(this.transformpolicybindpoint, other.getTransformpolicybindpoint()))) &&
            ((this.transforminvoke==null && other.getTransforminvoke()==null) || 
             (this.transforminvoke!=null &&
              java.util.Arrays.equals(this.transforminvoke, other.getTransforminvoke()))) &&
            ((this.transformpolicyinvokelabeltype==null && other.getTransformpolicyinvokelabeltype()==null) || 
             (this.transformpolicyinvokelabeltype!=null &&
              java.util.Arrays.equals(this.transformpolicyinvokelabeltype, other.getTransformpolicyinvokelabeltype()))) &&
            ((this.transformpolicyinvokelabelname==null && other.getTransformpolicyinvokelabelname()==null) || 
             (this.transformpolicyinvokelabelname!=null &&
              java.util.Arrays.equals(this.transformpolicyinvokelabelname, other.getTransformpolicyinvokelabelname()))) &&
            ((this.dospolicyname==null && other.getDospolicyname()==null) || 
             (this.dospolicyname!=null &&
              java.util.Arrays.equals(this.dospolicyname, other.getDospolicyname()))) &&
            ((this.dospolicypriority==null && other.getDospolicypriority()==null) || 
             (this.dospolicypriority!=null &&
              java.util.Arrays.equals(this.dospolicypriority, other.getDospolicypriority()))) &&
            ((this.rwpolicyname==null && other.getRwpolicyname()==null) || 
             (this.rwpolicyname!=null &&
              java.util.Arrays.equals(this.rwpolicyname, other.getRwpolicyname()))) &&
            ((this.rwpolicypriority==null && other.getRwpolicypriority()==null) || 
             (this.rwpolicypriority!=null &&
              java.util.Arrays.equals(this.rwpolicypriority, other.getRwpolicypriority()))) &&
            ((this.rwpolicygotoprioexpression==null && other.getRwpolicygotoprioexpression()==null) || 
             (this.rwpolicygotoprioexpression!=null &&
              java.util.Arrays.equals(this.rwpolicygotoprioexpression, other.getRwpolicygotoprioexpression()))) &&
            ((this.rwpolicybindpoint==null && other.getRwpolicybindpoint()==null) || 
             (this.rwpolicybindpoint!=null &&
              java.util.Arrays.equals(this.rwpolicybindpoint, other.getRwpolicybindpoint()))) &&
            ((this.rwinvoke==null && other.getRwinvoke()==null) || 
             (this.rwinvoke!=null &&
              java.util.Arrays.equals(this.rwinvoke, other.getRwinvoke()))) &&
            ((this.rwpolicyinvokelabeltype==null && other.getRwpolicyinvokelabeltype()==null) || 
             (this.rwpolicyinvokelabeltype!=null &&
              java.util.Arrays.equals(this.rwpolicyinvokelabeltype, other.getRwpolicyinvokelabeltype()))) &&
            ((this.rwpolicyinvokelabelname==null && other.getRwpolicyinvokelabelname()==null) || 
             (this.rwpolicyinvokelabelname!=null &&
              java.util.Arrays.equals(this.rwpolicyinvokelabelname, other.getRwpolicyinvokelabelname()))) &&
            ((this.cmppolicyname==null && other.getCmppolicyname()==null) || 
             (this.cmppolicyname!=null &&
              java.util.Arrays.equals(this.cmppolicyname, other.getCmppolicyname()))) &&
            ((this.cmppolicypriority==null && other.getCmppolicypriority()==null) || 
             (this.cmppolicypriority!=null &&
              java.util.Arrays.equals(this.cmppolicypriority, other.getCmppolicypriority()))) &&
            ((this.cmppolicyscflag==null && other.getCmppolicyscflag()==null) || 
             (this.cmppolicyscflag!=null &&
              java.util.Arrays.equals(this.cmppolicyscflag, other.getCmppolicyscflag()))) &&
            ((this.cmppolicygotoprioexpr==null && other.getCmppolicygotoprioexpr()==null) || 
             (this.cmppolicygotoprioexpr!=null &&
              java.util.Arrays.equals(this.cmppolicygotoprioexpr, other.getCmppolicygotoprioexpr()))) &&
            ((this.cmppolicybindpoint==null && other.getCmppolicybindpoint()==null) || 
             (this.cmppolicybindpoint!=null &&
              java.util.Arrays.equals(this.cmppolicybindpoint, other.getCmppolicybindpoint()))) &&
            ((this.cmpinvoke==null && other.getCmpinvoke()==null) || 
             (this.cmpinvoke!=null &&
              java.util.Arrays.equals(this.cmpinvoke, other.getCmpinvoke()))) &&
            ((this.cmppolicyinvokelabeltype==null && other.getCmppolicyinvokelabeltype()==null) || 
             (this.cmppolicyinvokelabeltype!=null &&
              java.util.Arrays.equals(this.cmppolicyinvokelabeltype, other.getCmppolicyinvokelabeltype()))) &&
            ((this.cmppolicyinvokelabelname==null && other.getCmppolicyinvokelabelname()==null) || 
             (this.cmppolicyinvokelabelname!=null &&
              java.util.Arrays.equals(this.cmppolicyinvokelabelname, other.getCmppolicyinvokelabelname()))) &&
            ((this.copolicyname==null && other.getCopolicyname()==null) || 
             (this.copolicyname!=null &&
              java.util.Arrays.equals(this.copolicyname, other.getCopolicyname()))) &&
            ((this.copolicypriority==null && other.getCopolicypriority()==null) || 
             (this.copolicypriority!=null &&
              java.util.Arrays.equals(this.copolicypriority, other.getCopolicypriority()))) &&
            ((this.copolicynextexpr==null && other.getCopolicynextexpr()==null) || 
             (this.copolicynextexpr!=null &&
              java.util.Arrays.equals(this.copolicynextexpr, other.getCopolicynextexpr()))) &&
            ((this.copolicybindpoint==null && other.getCopolicybindpoint()==null) || 
             (this.copolicybindpoint!=null &&
              java.util.Arrays.equals(this.copolicybindpoint, other.getCopolicybindpoint()))) &&
            ((this.authorpolicyname==null && other.getAuthorpolicyname()==null) || 
             (this.authorpolicyname!=null &&
              java.util.Arrays.equals(this.authorpolicyname, other.getAuthorpolicyname()))) &&
            ((this.authorpolicypriority==null && other.getAuthorpolicypriority()==null) || 
             (this.authorpolicypriority!=null &&
              java.util.Arrays.equals(this.authorpolicypriority, other.getAuthorpolicypriority()))) &&
            ((this.authorpolicyscflag==null && other.getAuthorpolicyscflag()==null) || 
             (this.authorpolicyscflag!=null &&
              java.util.Arrays.equals(this.authorpolicyscflag, other.getAuthorpolicyscflag()))) &&
            ((this.authorpolicygotoprioexpr==null && other.getAuthorpolicygotoprioexpr()==null) || 
             (this.authorpolicygotoprioexpr!=null &&
              java.util.Arrays.equals(this.authorpolicygotoprioexpr, other.getAuthorpolicygotoprioexpr()))) &&
            ((this.authorpolicybindpoint==null && other.getAuthorpolicybindpoint()==null) || 
             (this.authorpolicybindpoint!=null &&
              java.util.Arrays.equals(this.authorpolicybindpoint, other.getAuthorpolicybindpoint()))) &&
            ((this.authorinvoke==null && other.getAuthorinvoke()==null) || 
             (this.authorinvoke!=null &&
              java.util.Arrays.equals(this.authorinvoke, other.getAuthorinvoke()))) &&
            ((this.authorpolicyinvokelabeltype==null && other.getAuthorpolicyinvokelabeltype()==null) || 
             (this.authorpolicyinvokelabeltype!=null &&
              java.util.Arrays.equals(this.authorpolicyinvokelabeltype, other.getAuthorpolicyinvokelabeltype()))) &&
            ((this.authorpolicyinvokelabelname==null && other.getAuthorpolicyinvokelabelname()==null) || 
             (this.authorpolicyinvokelabelname!=null &&
              java.util.Arrays.equals(this.authorpolicyinvokelabelname, other.getAuthorpolicyinvokelabelname()))) &&
            ((this.cachepolicyname==null && other.getCachepolicyname()==null) || 
             (this.cachepolicyname!=null &&
              java.util.Arrays.equals(this.cachepolicyname, other.getCachepolicyname()))) &&
            ((this.cachepolicypriority==null && other.getCachepolicypriority()==null) || 
             (this.cachepolicypriority!=null &&
              java.util.Arrays.equals(this.cachepolicypriority, other.getCachepolicypriority()))) &&
            ((this.cachepolicygotoprioexpression==null && other.getCachepolicygotoprioexpression()==null) || 
             (this.cachepolicygotoprioexpression!=null &&
              java.util.Arrays.equals(this.cachepolicygotoprioexpression, other.getCachepolicygotoprioexpression()))) &&
            ((this.cachepolicybindpoint==null && other.getCachepolicybindpoint()==null) || 
             (this.cachepolicybindpoint!=null &&
              java.util.Arrays.equals(this.cachepolicybindpoint, other.getCachepolicybindpoint()))) &&
            ((this.cacheinvoke==null && other.getCacheinvoke()==null) || 
             (this.cacheinvoke!=null &&
              java.util.Arrays.equals(this.cacheinvoke, other.getCacheinvoke()))) &&
            ((this.cachepolicyinvokelabeltype==null && other.getCachepolicyinvokelabeltype()==null) || 
             (this.cachepolicyinvokelabeltype!=null &&
              java.util.Arrays.equals(this.cachepolicyinvokelabeltype, other.getCachepolicyinvokelabeltype()))) &&
            ((this.cachepolicyinvokelabelname==null && other.getCachepolicyinvokelabelname()==null) || 
             (this.cachepolicyinvokelabelname!=null &&
              java.util.Arrays.equals(this.cachepolicyinvokelabelname, other.getCachepolicyinvokelabelname()))) &&
            ((this.rsppolicyname==null && other.getRsppolicyname()==null) || 
             (this.rsppolicyname!=null &&
              java.util.Arrays.equals(this.rsppolicyname, other.getRsppolicyname()))) &&
            ((this.rsppolicypriority==null && other.getRsppolicypriority()==null) || 
             (this.rsppolicypriority!=null &&
              java.util.Arrays.equals(this.rsppolicypriority, other.getRsppolicypriority()))) &&
            ((this.rsppolicygotoprioexpression==null && other.getRsppolicygotoprioexpression()==null) || 
             (this.rsppolicygotoprioexpression!=null &&
              java.util.Arrays.equals(this.rsppolicygotoprioexpression, other.getRsppolicygotoprioexpression()))) &&
            ((this.rspinvoke==null && other.getRspinvoke()==null) || 
             (this.rspinvoke!=null &&
              java.util.Arrays.equals(this.rspinvoke, other.getRspinvoke()))) &&
            ((this.rsppolicyinvokelabeltype==null && other.getRsppolicyinvokelabeltype()==null) || 
             (this.rsppolicyinvokelabeltype!=null &&
              java.util.Arrays.equals(this.rsppolicyinvokelabeltype, other.getRsppolicyinvokelabeltype()))) &&
            ((this.rsppolicyinvokelabelname==null && other.getRsppolicyinvokelabelname()==null) || 
             (this.rsppolicyinvokelabelname!=null &&
              java.util.Arrays.equals(this.rsppolicyinvokelabelname, other.getRsppolicyinvokelabelname()))) &&
            ((this.appflowpolicyname==null && other.getAppflowpolicyname()==null) || 
             (this.appflowpolicyname!=null &&
              java.util.Arrays.equals(this.appflowpolicyname, other.getAppflowpolicyname()))) &&
            ((this.appflowpolicypriority==null && other.getAppflowpolicypriority()==null) || 
             (this.appflowpolicypriority!=null &&
              java.util.Arrays.equals(this.appflowpolicypriority, other.getAppflowpolicypriority()))) &&
            ((this.appflowpolicygotoprioexpression==null && other.getAppflowpolicygotoprioexpression()==null) || 
             (this.appflowpolicygotoprioexpression!=null &&
              java.util.Arrays.equals(this.appflowpolicygotoprioexpression, other.getAppflowpolicygotoprioexpression()))) &&
            ((this.appflowpolicybindpoint==null && other.getAppflowpolicybindpoint()==null) || 
             (this.appflowpolicybindpoint!=null &&
              java.util.Arrays.equals(this.appflowpolicybindpoint, other.getAppflowpolicybindpoint()))) &&
            ((this.appflowinvoke==null && other.getAppflowinvoke()==null) || 
             (this.appflowinvoke!=null &&
              java.util.Arrays.equals(this.appflowinvoke, other.getAppflowinvoke()))) &&
            ((this.appflowpolicyinvokelabeltype==null && other.getAppflowpolicyinvokelabeltype()==null) || 
             (this.appflowpolicyinvokelabeltype!=null &&
              java.util.Arrays.equals(this.appflowpolicyinvokelabeltype, other.getAppflowpolicyinvokelabeltype()))) &&
            ((this.appflowpolicyinvokelabelname==null && other.getAppflowpolicyinvokelabelname()==null) || 
             (this.appflowpolicyinvokelabelname!=null &&
              java.util.Arrays.equals(this.appflowpolicyinvokelabelname, other.getAppflowpolicyinvokelabelname()))) &&
            ((this.csvserver==null && other.getCsvserver()==null) || 
             (this.csvserver!=null &&
              java.util.Arrays.equals(this.csvserver, other.getCsvserver()))) &&
            ((this.cswpolicyname==null && other.getCswpolicyname()==null) || 
             (this.cswpolicyname!=null &&
              java.util.Arrays.equals(this.cswpolicyname, other.getCswpolicyname()))) &&
            ((this.cspriority==null && other.getCspriority()==null) || 
             (this.cspriority!=null &&
              java.util.Arrays.equals(this.cspriority, other.getCspriority()))) &&
            ((this.tmtrafficpolicyname==null && other.getTmtrafficpolicyname()==null) || 
             (this.tmtrafficpolicyname!=null &&
              java.util.Arrays.equals(this.tmtrafficpolicyname, other.getTmtrafficpolicyname()))) &&
            ((this.tmtrafficpolicypriority==null && other.getTmtrafficpolicypriority()==null) || 
             (this.tmtrafficpolicypriority!=null &&
              java.util.Arrays.equals(this.tmtrafficpolicypriority, other.getTmtrafficpolicypriority()))) &&
            ((this.spilloverpolicyname==null && other.getSpilloverpolicyname()==null) || 
             (this.spilloverpolicyname!=null &&
              java.util.Arrays.equals(this.spilloverpolicyname, other.getSpilloverpolicyname()))) &&
            ((this.spilloverpolicygotoprioexpression==null && other.getSpilloverpolicygotoprioexpression()==null) || 
             (this.spilloverpolicygotoprioexpression!=null &&
              java.util.Arrays.equals(this.spilloverpolicygotoprioexpression, other.getSpilloverpolicygotoprioexpression()))) &&
            ((this.spilloverpolicyflowtype==null && other.getSpilloverpolicyflowtype()==null) || 
             (this.spilloverpolicyflowtype!=null &&
              java.util.Arrays.equals(this.spilloverpolicyflowtype, other.getSpilloverpolicyflowtype()))) &&
            ((this.spilloverpolicypriority==null && other.getSpilloverpolicypriority()==null) || 
             (this.spilloverpolicypriority!=null &&
              java.util.Arrays.equals(this.spilloverpolicypriority, other.getSpilloverpolicypriority()))) &&
            ((this.dns64Policyname==null && other.getDns64Policyname()==null) || 
             (this.dns64Policyname!=null &&
              java.util.Arrays.equals(this.dns64Policyname, other.getDns64Policyname()))) &&
            ((this.dns64Policypriority==null && other.getDns64Policypriority()==null) || 
             (this.dns64Policypriority!=null &&
              java.util.Arrays.equals(this.dns64Policypriority, other.getDns64Policypriority()))) &&
            ((this.dns64Policygotoprioexpression==null && other.getDns64Policygotoprioexpression()==null) || 
             (this.dns64Policygotoprioexpression!=null &&
              java.util.Arrays.equals(this.dns64Policygotoprioexpression, other.getDns64Policygotoprioexpression())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getInsertvserveripport() != null) {
            _hashCode += getInsertvserveripport().hashCode();
        }
        if (getVipheader() != null) {
            _hashCode += getVipheader().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        if (getIpaddress() != null) {
            _hashCode += getIpaddress().hashCode();
        }
        if (getIpaddress2() != null) {
            _hashCode += getIpaddress2().hashCode();
        }
        if (getIppattern() != null) {
            _hashCode += getIppattern().hashCode();
        }
        if (getIpmask() != null) {
            _hashCode += getIpmask().hashCode();
        }
        if (getListenpolicy() != null) {
            _hashCode += getListenpolicy().hashCode();
        }
        if (getListenpriority() != null) {
            _hashCode += getListenpriority().hashCode();
        }
        if (getIpmapping() != null) {
            _hashCode += getIpmapping().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getRange() != null) {
            _hashCode += getRange().hashCode();
        }
        if (getServicetype() != null) {
            _hashCode += getServicetype().hashCode();
        }
        if (getNgname() != null) {
            _hashCode += getNgname().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getEffectivestate() != null) {
            _hashCode += getEffectivestate().hashCode();
        }
        _hashCode += getStatus();
        _hashCode += getLbrrreason();
        if (getCachetype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCachetype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCachetype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRedirect() != null) {
            _hashCode += getRedirect().hashCode();
        }
        if (getPrecedence() != null) {
            _hashCode += getPrecedence().hashCode();
        }
        if (getRedirecturl() != null) {
            _hashCode += getRedirecturl().hashCode();
        }
        if (getAuthentication() != null) {
            _hashCode += getAuthentication().hashCode();
        }
        if (getAuthn401() != null) {
            _hashCode += getAuthn401().hashCode();
        }
        if (getAuthnvsname() != null) {
            _hashCode += getAuthnvsname().hashCode();
        }
        if (getHomepage() != null) {
            _hashCode += getHomepage().hashCode();
        }
        if (getDnsvservername() != null) {
            _hashCode += getDnsvservername().hashCode();
        }
        if (getDomain() != null) {
            _hashCode += getDomain().hashCode();
        }
        if (getPolicyname() != null) {
            _hashCode += getPolicyname().hashCode();
        }
        if (getServicename() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicename());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicename(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServicegroupname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicegroupname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicegroupname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWeight() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWeight());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWeight(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDynamicweight() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDynamicweight());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDynamicweight(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCachevserver() != null) {
            _hashCode += getCachevserver().hashCode();
        }
        if (getBackupvserver() != null) {
            _hashCode += getBackupvserver().hashCode();
        }
        if (getPriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClttimeout() != null) {
            _hashCode += getClttimeout().hashCode();
        }
        if (getSomethod() != null) {
            _hashCode += getSomethod().hashCode();
        }
        if (getSopersistence() != null) {
            _hashCode += getSopersistence().hashCode();
        }
        if (getSopersistencetimeout() != null) {
            _hashCode += getSopersistencetimeout().hashCode();
        }
        if (getHealththreshold() != null) {
            _hashCode += getHealththreshold().hashCode();
        }
        if (getSothreshold() != null) {
            _hashCode += getSothreshold().hashCode();
        }
        if (getSobackupaction() != null) {
            _hashCode += getSobackupaction().hashCode();
        }
        if (getLbmethod() != null) {
            _hashCode += getLbmethod().hashCode();
        }
        if (getHashlength() != null) {
            _hashCode += getHashlength().hashCode();
        }
        if (getDataoffset() != null) {
            _hashCode += getDataoffset().hashCode();
        }
        if (getHealth() != null) {
            _hashCode += getHealth().hashCode();
        }
        if (getDatalength() != null) {
            _hashCode += getDatalength().hashCode();
        }
        if (getNetmask() != null) {
            _hashCode += getNetmask().hashCode();
        }
        if (getV6Netmasklen() != null) {
            _hashCode += getV6Netmasklen().hashCode();
        }
        if (getRule() != null) {
            _hashCode += getRule().hashCode();
        }
        if (getResrule() != null) {
            _hashCode += getResrule().hashCode();
        }
        if (getGotopriorityexpression() != null) {
            _hashCode += getGotopriorityexpression().hashCode();
        }
        if (getRuletype() != null) {
            _hashCode += getRuletype().hashCode();
        }
        if (getGroupname() != null) {
            _hashCode += getGroupname().hashCode();
        }
        if (getM() != null) {
            _hashCode += getM().hashCode();
        }
        if (getTosid() != null) {
            _hashCode += getTosid().hashCode();
        }
        if (getPersistencetype() != null) {
            _hashCode += getPersistencetype().hashCode();
        }
        if (getTimeout() != null) {
            _hashCode += getTimeout().hashCode();
        }
        if (getCookiedomain() != null) {
            _hashCode += getCookiedomain().hashCode();
        }
        if (getPersistmask() != null) {
            _hashCode += getPersistmask().hashCode();
        }
        if (getV6Persistmasklen() != null) {
            _hashCode += getV6Persistmasklen().hashCode();
        }
        if (getPersistencebackup() != null) {
            _hashCode += getPersistencebackup().hashCode();
        }
        if (getBackuppersistencetimeout() != null) {
            _hashCode += getBackuppersistencetimeout().hashCode();
        }
        if (getCacheable() != null) {
            _hashCode += getCacheable().hashCode();
        }
        if (getPq() != null) {
            _hashCode += getPq().hashCode();
        }
        if (getSc() != null) {
            _hashCode += getSc().hashCode();
        }
        if (getRtspnat() != null) {
            _hashCode += getRtspnat().hashCode();
        }
        if (getSessionless() != null) {
            _hashCode += getSessionless().hashCode();
        }
        if (getMap() != null) {
            _hashCode += getMap().hashCode();
        }
        if (getConnfailover() != null) {
            _hashCode += getConnfailover().hashCode();
        }
        if (getRedirectportrewrite() != null) {
            _hashCode += getRedirectportrewrite().hashCode();
        }
        if (getDownstateflush() != null) {
            _hashCode += getDownstateflush().hashCode();
        }
        if (getDisableprimaryondown() != null) {
            _hashCode += getDisableprimaryondown().hashCode();
        }
        if (getGt2Gb() != null) {
            _hashCode += getGt2Gb().hashCode();
        }
        if (getConsolidatedlconn() != null) {
            _hashCode += getConsolidatedlconn().hashCode();
        }
        if (getConsolidatedlconngbl() != null) {
            _hashCode += getConsolidatedlconngbl().hashCode();
        }
        _hashCode += getThresholdvalue();
        if (getType2() != null) {
            _hashCode += getType2().hashCode();
        }
        _hashCode += (isInvoke() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLabeltype() != null) {
            _hashCode += getLabeltype().hashCode();
        }
        if (getLabelname() != null) {
            _hashCode += getLabelname().hashCode();
        }
        if (getCookieipport() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCookieipport());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCookieipport(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCookiename() != null) {
            _hashCode += getCookiename().hashCode();
        }
        if (getVserverid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVserverid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVserverid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getVersion();
        if (getTotalservices() != null) {
            _hashCode += getTotalservices().hashCode();
        }
        if (getActiveservices() != null) {
            _hashCode += getActiveservices().hashCode();
        }
        if (getStatechangetimesec() != null) {
            _hashCode += getStatechangetimesec().hashCode();
        }
        if (getStatechangetimeseconds() != null) {
            _hashCode += getStatechangetimeseconds().hashCode();
        }
        if (getStatechangetimemsec() != null) {
            _hashCode += getStatechangetimemsec().hashCode();
        }
        if (getTickssincelaststatechange() != null) {
            _hashCode += getTickssincelaststatechange().hashCode();
        }
        if (getHits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPipolicyhits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPipolicyhits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPipolicyhits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthenticationhost() != null) {
            _hashCode += getAuthenticationhost().hashCode();
        }
        if (getPush() != null) {
            _hashCode += getPush().hashCode();
        }
        if (getPushvserver() != null) {
            _hashCode += getPushvserver().hashCode();
        }
        if (getPushlabel() != null) {
            _hashCode += getPushlabel().hashCode();
        }
        if (getPushmulticlients() != null) {
            _hashCode += getPushmulticlients().hashCode();
        }
        if (getTcpprofilename() != null) {
            _hashCode += getTcpprofilename().hashCode();
        }
        if (getHttpprofilename() != null) {
            _hashCode += getHttpprofilename().hashCode();
        }
        if (getDbprofilename() != null) {
            _hashCode += getDbprofilename().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getPolicysubtype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolicysubtype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolicysubtype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getL2Conn() != null) {
            _hashCode += getL2Conn().hashCode();
        }
        if (getOracleserverversion() != null) {
            _hashCode += getOracleserverversion().hashCode();
        }
        if (getMssqlserverversion() != null) {
            _hashCode += getMssqlserverversion().hashCode();
        }
        if (getMysqlprotocolversion() != null) {
            _hashCode += getMysqlprotocolversion().hashCode();
        }
        if (getMysqlserverversion() != null) {
            _hashCode += getMysqlserverversion().hashCode();
        }
        if (getMysqlcharacterset() != null) {
            _hashCode += getMysqlcharacterset().hashCode();
        }
        if (getMysqlservercapabilities() != null) {
            _hashCode += getMysqlservercapabilities().hashCode();
        }
        if (getAppflowlog() != null) {
            _hashCode += getAppflowlog().hashCode();
        }
        if (getNetprofile() != null) {
            _hashCode += getNetprofile().hashCode();
        }
        _hashCode += (isIsgslb() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIcmpvsrresponse() != null) {
            _hashCode += getIcmpvsrresponse().hashCode();
        }
        if (getNewservicerequest() != null) {
            _hashCode += getNewservicerequest().hashCode();
        }
        if (getNewservicerequestunit() != null) {
            _hashCode += getNewservicerequestunit().hashCode();
        }
        if (getNewservicerequestincrementinterval() != null) {
            _hashCode += getNewservicerequestincrementinterval().hashCode();
        }
        if (getVsvrbindsvcip() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsvrbindsvcip());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsvrbindsvcip(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVsvrbindsvcport() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVsvrbindsvcport());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVsvrbindsvcport(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPersistavpno() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPersistavpno());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPersistavpno(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSkippersistency() != null) {
            _hashCode += getSkippersistency().hashCode();
        }
        if (getMinautoscalemembers() != null) {
            _hashCode += getMinautoscalemembers().hashCode();
        }
        if (getMaxautoscalemembers() != null) {
            _hashCode += getMaxautoscalemembers().hashCode();
        }
        if (getAuthnprofile() != null) {
            _hashCode += getAuthnprofile().hashCode();
        }
        if (getMacmoderetainvlan() != null) {
            _hashCode += getMacmoderetainvlan().hashCode();
        }
        if (getDbslb() != null) {
            _hashCode += getDbslb().hashCode();
        }
        if (getDns64() != null) {
            _hashCode += getDns64().hashCode();
        }
        if (getBypassaaaa() != null) {
            _hashCode += getBypassaaaa().hashCode();
        }
        if (getRecursionavailable() != null) {
            _hashCode += getRecursionavailable().hashCode();
        }
        if (getSvcipaddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvcipaddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvcipaddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvcport() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvcport());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvcport(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvctype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvctype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvctype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvcstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvcstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvcstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvcgrpsvcname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvcgrpsvcname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvcgrpsvcname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvcgrpmemgrpname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvcgrpmemgrpname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvcgrpmemgrpname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvcgrpmemip() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvcgrpmemip());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvcgrpmemip(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvcgrpmemport() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvcgrpmemport());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvcgrpmemport(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvcgrpmemsvctype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvcgrpmemsvctype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvcgrpmemsvctype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvcgrpmemstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvcgrpmemstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvcgrpmemstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvcgrpmemweight() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvcgrpmemweight());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvcgrpmemweight(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvcgrpmemdynwtmethod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvcgrpmemdynwtmethod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvcgrpmemdynwtmethod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvcgrpmemcookieipport() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvcgrpmemcookieipport());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvcgrpmemcookieipport(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvcgrpmemcookiename() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvcgrpmemcookiename());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvcgrpmemcookiename(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvcgrpmemvserverid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvcgrpmemvserverid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvcgrpmemvserverid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFilterpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFilterpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFilterpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFilterpolicyscflag() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFilterpolicyscflag());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFilterpolicyscflag(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSyslogpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSyslogpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSyslogpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSyslogpriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSyslogpriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSyslogpriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSyslogpolicyscflag() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSyslogpolicyscflag());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSyslogpolicyscflag(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNslogpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNslogpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNslogpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNslogpriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNslogpriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNslogpriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNslogpolicyscflag() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNslogpolicyscflag());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNslogpolicyscflag(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getScpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPqpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPqpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPqpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppfwpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppfwpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppfwpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppfwpriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppfwpriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppfwpriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppfwpolicygotoprioexpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppfwpolicygotoprioexpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppfwpolicygotoprioexpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppfwscflag() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppfwscflag());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppfwscflag(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppfwbindpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppfwbindpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppfwbindpoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppfwinvoke() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppfwinvoke());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppfwinvoke(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppfwpolicyinvokelabeltype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppfwpolicyinvokelabeltype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppfwpolicyinvokelabeltype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppfwpolicyinvokelabelname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppfwpolicyinvokelabelname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppfwpolicyinvokelabelname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppqospolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppqospolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppqospolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppqospolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppqospolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppqospolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppqospolicygotoprioexpr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppqospolicygotoprioexpr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppqospolicygotoprioexpr(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppqospolicybindpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppqospolicybindpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppqospolicybindpoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransformpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransformpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransformpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransformpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransformpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransformpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransformpolicygotoprioexpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransformpolicygotoprioexpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransformpolicygotoprioexpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransformpolicybindpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransformpolicybindpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransformpolicybindpoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransforminvoke() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransforminvoke());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransforminvoke(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransformpolicyinvokelabeltype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransformpolicyinvokelabeltype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransformpolicyinvokelabeltype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransformpolicyinvokelabelname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransformpolicyinvokelabelname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransformpolicyinvokelabelname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDospolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDospolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDospolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDospolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDospolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDospolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRwpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRwpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRwpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRwpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRwpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRwpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRwpolicygotoprioexpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRwpolicygotoprioexpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRwpolicygotoprioexpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRwpolicybindpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRwpolicybindpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRwpolicybindpoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRwinvoke() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRwinvoke());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRwinvoke(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRwpolicyinvokelabeltype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRwpolicyinvokelabeltype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRwpolicyinvokelabeltype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRwpolicyinvokelabelname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRwpolicyinvokelabelname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRwpolicyinvokelabelname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCmppolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmppolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmppolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCmppolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmppolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmppolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCmppolicyscflag() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmppolicyscflag());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmppolicyscflag(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCmppolicygotoprioexpr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmppolicygotoprioexpr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmppolicygotoprioexpr(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCmppolicybindpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmppolicybindpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmppolicybindpoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCmpinvoke() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmpinvoke());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmpinvoke(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCmppolicyinvokelabeltype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmppolicyinvokelabeltype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmppolicyinvokelabeltype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCmppolicyinvokelabelname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmppolicyinvokelabelname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmppolicyinvokelabelname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCopolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCopolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCopolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCopolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCopolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCopolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCopolicynextexpr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCopolicynextexpr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCopolicynextexpr(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCopolicybindpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCopolicybindpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCopolicybindpoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthorpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthorpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthorpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthorpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthorpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthorpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthorpolicyscflag() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthorpolicyscflag());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthorpolicyscflag(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthorpolicygotoprioexpr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthorpolicygotoprioexpr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthorpolicygotoprioexpr(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthorpolicybindpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthorpolicybindpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthorpolicybindpoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthorinvoke() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthorinvoke());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthorinvoke(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthorpolicyinvokelabeltype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthorpolicyinvokelabeltype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthorpolicyinvokelabeltype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthorpolicyinvokelabelname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuthorpolicyinvokelabelname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuthorpolicyinvokelabelname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCachepolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCachepolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCachepolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCachepolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCachepolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCachepolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCachepolicygotoprioexpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCachepolicygotoprioexpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCachepolicygotoprioexpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCachepolicybindpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCachepolicybindpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCachepolicybindpoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCacheinvoke() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCacheinvoke());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCacheinvoke(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCachepolicyinvokelabeltype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCachepolicyinvokelabeltype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCachepolicyinvokelabeltype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCachepolicyinvokelabelname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCachepolicyinvokelabelname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCachepolicyinvokelabelname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRsppolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRsppolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRsppolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRsppolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRsppolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRsppolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRsppolicygotoprioexpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRsppolicygotoprioexpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRsppolicygotoprioexpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRspinvoke() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRspinvoke());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRspinvoke(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRsppolicyinvokelabeltype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRsppolicyinvokelabeltype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRsppolicyinvokelabeltype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRsppolicyinvokelabelname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRsppolicyinvokelabelname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRsppolicyinvokelabelname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppflowpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppflowpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppflowpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppflowpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppflowpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppflowpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppflowpolicygotoprioexpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppflowpolicygotoprioexpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppflowpolicygotoprioexpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppflowpolicybindpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppflowpolicybindpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppflowpolicybindpoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppflowinvoke() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppflowinvoke());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppflowinvoke(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppflowpolicyinvokelabeltype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppflowpolicyinvokelabeltype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppflowpolicyinvokelabeltype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppflowpolicyinvokelabelname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppflowpolicyinvokelabelname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppflowpolicyinvokelabelname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCsvserver() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCsvserver());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCsvserver(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCswpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCswpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCswpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCspriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCspriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCspriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTmtrafficpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTmtrafficpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTmtrafficpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTmtrafficpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTmtrafficpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTmtrafficpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpilloverpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpilloverpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpilloverpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpilloverpolicygotoprioexpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpilloverpolicygotoprioexpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpilloverpolicygotoprioexpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpilloverpolicyflowtype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpilloverpolicyflowtype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpilloverpolicyflowtype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpilloverpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSpilloverpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSpilloverpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDns64Policyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDns64Policyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDns64Policyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDns64Policypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDns64Policypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDns64Policypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDns64Policygotoprioexpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDns64Policygotoprioexpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDns64Policygotoprioexpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Lbvserver.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "lbvserver"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertvserveripport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "insertvserveripport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vipheader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vipheader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipaddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipaddress2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipaddress2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ippattern");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ippattern"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipmask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipmask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listenpolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listenpolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listenpriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listenpriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipmapping");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipmapping"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("range");
        elemField.setXmlName(new javax.xml.namespace.QName("", "range"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ngname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ngname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectivestate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "effectivestate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lbrrreason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lbrrreason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirect");
        elemField.setXmlName(new javax.xml.namespace.QName("", "redirect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precedence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "precedence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirecturl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "redirecturl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authentication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authentication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authn401");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authn401"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authnvsname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authnvsname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homepage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homepage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsvservername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnsvservername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicegroupname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicegroupname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamicweight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dynamicweight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachevserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachevserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupvserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backupvserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clttimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clttimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("somethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "somethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sopersistence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sopersistence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sopersistencetimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sopersistencetimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("healththreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "healththreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sothreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sothreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sobackupaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sobackupaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lbmethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lbmethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hashlength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hashlength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataoffset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataoffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("health");
        elemField.setXmlName(new javax.xml.namespace.QName("", "health"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datalength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datalength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netmask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netmask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("v6Netmasklen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "v6netmasklen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resrule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resrule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gotopriorityexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gotopriorityexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruletype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ruletype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tosid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tosid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persistencetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "persistencetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cookiedomain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cookiedomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persistmask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "persistmask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("v6Persistmasklen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "v6persistmasklen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persistencebackup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "persistencebackup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backuppersistencetimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backuppersistencetimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cacheable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rtspnat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rtspnat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionless");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionless"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("map");
        elemField.setXmlName(new javax.xml.namespace.QName("", "map"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connfailover");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connfailover"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirectportrewrite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "redirectportrewrite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("downstateflush");
        elemField.setXmlName(new javax.xml.namespace.QName("", "downstateflush"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disableprimaryondown");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disableprimaryondown"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gt2Gb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gt2gb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidatedlconn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "consolidatedlconn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consolidatedlconngbl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "consolidatedlconngbl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thresholdvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thresholdvalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoke");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoke"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labeltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "labeltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "labelname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cookieipport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cookieipport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cookiename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cookiename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vserverid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vserverid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalservices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalservices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activeservices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activeservices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statechangetimesec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statechangetimesec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statechangetimeseconds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statechangetimeseconds"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statechangetimemsec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statechangetimemsec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tickssincelaststatechange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tickssincelaststatechange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pipolicyhits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pipolicyhits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationhost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authenticationhost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("push");
        elemField.setXmlName(new javax.xml.namespace.QName("", "push"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pushvserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pushvserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pushlabel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pushlabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pushmulticlients");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pushmulticlients"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcpprofilename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tcpprofilename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpprofilename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpprofilename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dbprofilename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dbprofilename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policysubtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policysubtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("l2Conn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "l2conn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oracleserverversion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oracleserverversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mssqlserverversion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mssqlserverversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mysqlprotocolversion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mysqlprotocolversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mysqlserverversion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mysqlserverversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mysqlcharacterset");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mysqlcharacterset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mysqlservercapabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mysqlservercapabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appflowlog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appflowlog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netprofile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netprofile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isgslb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isgslb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icmpvsrresponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "icmpvsrresponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newservicerequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newservicerequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newservicerequestunit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newservicerequestunit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newservicerequestincrementinterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newservicerequestincrementinterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsvrbindsvcip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vsvrbindsvcip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vsvrbindsvcport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vsvrbindsvcport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persistavpno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "persistavpno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skippersistency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "skippersistency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minautoscalemembers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minautoscalemembers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxautoscalemembers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxautoscalemembers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authnprofile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authnprofile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("macmoderetainvlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "macmoderetainvlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dbslb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dbslb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dns64");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dns64"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bypassaaaa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bypassaaaa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recursionavailable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recursionavailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcipaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcipaddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svctype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svctype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcgrpsvcname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcgrpsvcname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcgrpmemgrpname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcgrpmemgrpname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcgrpmemip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcgrpmemip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcgrpmemport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcgrpmemport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcgrpmemsvctype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcgrpmemsvctype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcgrpmemstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcgrpmemstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcgrpmemweight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcgrpmemweight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcgrpmemdynwtmethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcgrpmemdynwtmethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcgrpmemcookieipport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcgrpmemcookieipport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcgrpmemcookiename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcgrpmemcookiename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svcgrpmemvserverid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svcgrpmemvserverid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filterpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterpolicyscflag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filterpolicyscflag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syslogpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "syslogpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syslogpriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "syslogpriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syslogpolicyscflag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "syslogpolicyscflag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nslogpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nslogpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nslogpriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nslogpriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nslogpolicyscflag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nslogpolicyscflag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pqpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pqpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appfwpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appfwpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appfwpriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appfwpriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appfwpolicygotoprioexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appfwpolicygotoprioexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appfwscflag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appfwscflag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appfwbindpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appfwbindpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appfwinvoke");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appfwinvoke"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appfwpolicyinvokelabeltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appfwpolicyinvokelabeltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appfwpolicyinvokelabelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appfwpolicyinvokelabelname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appqospolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appqospolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appqospolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appqospolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appqospolicygotoprioexpr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appqospolicygotoprioexpr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appqospolicybindpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appqospolicybindpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transformpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transformpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transformpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transformpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transformpolicygotoprioexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transformpolicygotoprioexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transformpolicybindpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transformpolicybindpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transforminvoke");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transforminvoke"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transformpolicyinvokelabeltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transformpolicyinvokelabeltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transformpolicyinvokelabelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transformpolicyinvokelabelname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dospolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dospolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dospolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dospolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rwpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rwpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rwpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rwpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rwpolicygotoprioexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rwpolicygotoprioexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rwpolicybindpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rwpolicybindpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rwinvoke");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rwinvoke"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rwpolicyinvokelabeltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rwpolicyinvokelabeltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rwpolicyinvokelabelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rwpolicyinvokelabelname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmppolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmppolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmppolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmppolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmppolicyscflag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmppolicyscflag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmppolicygotoprioexpr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmppolicygotoprioexpr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmppolicybindpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmppolicybindpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmpinvoke");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmpinvoke"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmppolicyinvokelabeltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmppolicyinvokelabeltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmppolicyinvokelabelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmppolicyinvokelabelname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copolicynextexpr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copolicynextexpr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copolicybindpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copolicybindpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorpolicyscflag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorpolicyscflag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorpolicygotoprioexpr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorpolicygotoprioexpr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorpolicybindpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorpolicybindpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorinvoke");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorinvoke"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorpolicyinvokelabeltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorpolicyinvokelabeltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorpolicyinvokelabelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorpolicyinvokelabelname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachepolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachepolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachepolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachepolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachepolicygotoprioexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachepolicygotoprioexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachepolicybindpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachepolicybindpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheinvoke");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cacheinvoke"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachepolicyinvokelabeltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachepolicyinvokelabeltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachepolicyinvokelabelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachepolicyinvokelabelname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsppolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsppolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsppolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsppolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsppolicygotoprioexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsppolicygotoprioexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rspinvoke");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rspinvoke"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsppolicyinvokelabeltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsppolicyinvokelabeltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsppolicyinvokelabelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsppolicyinvokelabelname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appflowpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appflowpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appflowpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appflowpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appflowpolicygotoprioexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appflowpolicygotoprioexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appflowpolicybindpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appflowpolicybindpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appflowinvoke");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appflowinvoke"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appflowpolicyinvokelabeltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appflowpolicyinvokelabeltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appflowpolicyinvokelabelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appflowpolicyinvokelabelname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csvserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "csvserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cswpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cswpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cspriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cspriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmtrafficpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tmtrafficpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmtrafficpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tmtrafficpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spilloverpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spilloverpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spilloverpolicygotoprioexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spilloverpolicygotoprioexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spilloverpolicyflowtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spilloverpolicyflowtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spilloverpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spilloverpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dns64Policyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dns64policyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dns64Policypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dns64policypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dns64Policygotoprioexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dns64policygotoprioexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
