/**
 * Csvserver.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Csvserver  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String insertvserveripport;

    private java.lang.String vipheader;

    private java.lang.String ipaddress;

    private java.lang.String ipaddress2;

    private java.lang.String ippattern;

    private java.lang.String ipmask;

    private java.lang.String value;

    private org.apache.axis.types.UnsignedInt port;

    private org.apache.axis.types.UnsignedInt range;

    private java.lang.String servicetype;

    private java.lang.String ngname;

    private java.lang.String type;

    private java.lang.String state;

    private java.lang.String sc;

    private java.lang.String stateupdate;

    private int status;

    private java.lang.String cachetype;

    private java.lang.String redirect;

    private java.lang.String precedence;

    private java.lang.String redirecturl;

    private java.lang.String authentication;

    private java.lang.String authn401;

    private java.lang.String authnvsname;

    private java.lang.String casesensitive;

    private java.lang.String homepage;

    private java.lang.String dnsvservername;

    private java.lang.String domain;

    private java.lang.String[] rule;

    private java.lang.String policyname;

    private org.apache.axis.types.UnsignedInt[] hits;

    private org.apache.axis.types.UnsignedInt[] pipolicyhits;

    private java.lang.String servicename;

    private org.apache.axis.types.UnsignedInt weight;

    private java.lang.String cachevserver;

    private java.lang.String targetvserver;

    private java.lang.String backupvserver;

    private org.apache.axis.types.UnsignedInt priority;

    private org.apache.axis.types.UnsignedInt clttimeout;

    private java.lang.String listenpolicy;

    private org.apache.axis.types.UnsignedInt listenpriority;

    private java.lang.String somethod;

    private java.lang.String sopersistence;

    private org.apache.axis.types.UnsignedInt sopersistencetimeout;

    private org.apache.axis.types.UnsignedInt sothreshold;

    private java.lang.String sobackupaction;

    private java.lang.String cacheable;

    private java.lang.String url;

    private java.lang.String gotopriorityexpression;

    private java.lang.String redirectportrewrite;

    private java.lang.String downstateflush;

    private java.lang.String disableprimaryondown;

    private java.lang.String type2;

    private boolean invoke;

    private java.lang.String labeltype;

    private java.lang.String labelname;

    private java.lang.String gt2Gb;

    private java.lang.String statechangetimesec;

    private org.apache.axis.types.UnsignedInt statechangetimemsec;

    private org.apache.axis.types.UnsignedInt tickssincelaststatechange;

    private java.lang.String rtspnat;

    private java.lang.String authenticationhost;

    private java.lang.String push;

    private java.lang.String pushvserver;

    private java.lang.String pushlabel;

    private java.lang.String pushmulticlients;

    private java.lang.String tcpprofilename;

    private java.lang.String httpprofilename;

    private java.lang.String dbprofilename;

    private java.lang.String comment;

    private java.lang.String oracleserverversion;

    private java.lang.String mssqlserverversion;

    private java.lang.String l2Conn;

    private org.apache.axis.types.UnsignedInt mysqlprotocolversion;

    private java.lang.String mysqlserverversion;

    private org.apache.axis.types.UnsignedInt mysqlcharacterset;

    private org.apache.axis.types.UnsignedInt mysqlservercapabilities;

    private java.lang.String appflowlog;

    private java.lang.String netprofile;

    private java.lang.String icmpvsrresponse;

    private java.lang.String lbvserver;

    private java.lang.String targetlbvserver;

    private java.lang.String authnprofile;

    private java.lang.String[] filterpolicyname;

    private org.apache.axis.types.UnsignedInt[] filterpolicypriority;

    private java.lang.String[] filterpolicyscflag;

    private java.lang.String[] syslogpolicyname;

    private org.apache.axis.types.UnsignedInt[] syslogpriority;

    private java.lang.String[] syslogpolicyscflag;

    private java.lang.String[] nslogpolicyname;

    private org.apache.axis.types.UnsignedInt[] nslogpriority;

    private java.lang.String[] nslogpolicyscflag;

    private java.lang.String[] authorpolicyname;

    private org.apache.axis.types.UnsignedInt[] authorpolicypriority;

    private java.lang.String[] authorpolicyscflag;

    private java.lang.String[] authorpolicygotoprioexpr;

    private java.lang.String[] authorpolicybindpoint;

    private boolean[] authorinvoke;

    private java.lang.String[] authorpolicyinvokelabeltype;

    private java.lang.String[] authorpolicyinvokelabelname;

    private java.lang.String[] appfwpolicyname;

    private org.apache.axis.types.UnsignedInt[] appfwpriority;

    private java.lang.String[] appfwpolicygotoprioexpression;

    private java.lang.String[] appfwscflag;

    private java.lang.String[] appfwbindpoint;

    private boolean[] appfwinvoke;

    private java.lang.String[] appfwpolicyinvokelabeltype;

    private java.lang.String[] appfwpolicyinvokelabelname;

    private java.lang.String[] transformpolicyname;

    private org.apache.axis.types.UnsignedInt[] transformpolicypriority;

    private java.lang.String[] transformpolicygotoprioexpression;

    private java.lang.String[] transformpolicybindpoint;

    private boolean[] transforminvoke;

    private java.lang.String[] transformpolicyinvokelabeltype;

    private java.lang.String[] transformpolicyinvokelabelname;

    private java.lang.String[] rwpolicyname;

    private org.apache.axis.types.UnsignedInt[] rwpolicypriority;

    private java.lang.String[] rwpolicygotoprioexpression;

    private java.lang.String[] rwpolicybindpoint;

    private boolean[] rwinvoke;

    private java.lang.String[] rwpolicyinvokelabeltype;

    private java.lang.String[] rwpolicyinvokelabelname;

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

    private java.lang.String[] tmtrafficpolicyname;

    private org.apache.axis.types.UnsignedInt[] tmtrafficpolicypriority;

    private java.lang.String[] spilloverpolicyname;

    private java.lang.String[] spilloverpolicygotoprioexpression;

    private java.lang.String[] spilloverpolicyflowtype;

    private org.apache.axis.types.UnsignedInt[] spilloverpolicypriority;

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

    private java.lang.String[] cswpolicyname;

    private java.lang.String[] cswtargetserver;

    private org.apache.axis.types.UnsignedInt[] cswpriority;

    private java.lang.String[] cswpolicygotoprioexpr;

    private java.lang.String[] cswpolicybindpoint;

    private boolean[] cswinvoke;

    private java.lang.String[] cswpolicyinvokelabeltype;

    private java.lang.String[] cswpolicyinvokelabelname;

    private java.lang.String[] appflowpolicyname;

    private org.apache.axis.types.UnsignedInt[] appflowpolicypriority;

    private java.lang.String[] appflowpolicygotoprioexpression;

    private boolean[] appflowinvoke;

    private java.lang.String[] appflowpolicyinvokelabeltype;

    private java.lang.String[] appflowpolicyinvokelabelname;

    private java.lang.String[] defaultlb;

    public Csvserver() {
    }

    public Csvserver(
           java.lang.String name,
           java.lang.String insertvserveripport,
           java.lang.String vipheader,
           java.lang.String ipaddress,
           java.lang.String ipaddress2,
           java.lang.String ippattern,
           java.lang.String ipmask,
           java.lang.String value,
           org.apache.axis.types.UnsignedInt port,
           org.apache.axis.types.UnsignedInt range,
           java.lang.String servicetype,
           java.lang.String ngname,
           java.lang.String type,
           java.lang.String state,
           java.lang.String sc,
           java.lang.String stateupdate,
           int status,
           java.lang.String cachetype,
           java.lang.String redirect,
           java.lang.String precedence,
           java.lang.String redirecturl,
           java.lang.String authentication,
           java.lang.String authn401,
           java.lang.String authnvsname,
           java.lang.String casesensitive,
           java.lang.String homepage,
           java.lang.String dnsvservername,
           java.lang.String domain,
           java.lang.String[] rule,
           java.lang.String policyname,
           org.apache.axis.types.UnsignedInt[] hits,
           org.apache.axis.types.UnsignedInt[] pipolicyhits,
           java.lang.String servicename,
           org.apache.axis.types.UnsignedInt weight,
           java.lang.String cachevserver,
           java.lang.String targetvserver,
           java.lang.String backupvserver,
           org.apache.axis.types.UnsignedInt priority,
           org.apache.axis.types.UnsignedInt clttimeout,
           java.lang.String listenpolicy,
           org.apache.axis.types.UnsignedInt listenpriority,
           java.lang.String somethod,
           java.lang.String sopersistence,
           org.apache.axis.types.UnsignedInt sopersistencetimeout,
           org.apache.axis.types.UnsignedInt sothreshold,
           java.lang.String sobackupaction,
           java.lang.String cacheable,
           java.lang.String url,
           java.lang.String gotopriorityexpression,
           java.lang.String redirectportrewrite,
           java.lang.String downstateflush,
           java.lang.String disableprimaryondown,
           java.lang.String type2,
           boolean invoke,
           java.lang.String labeltype,
           java.lang.String labelname,
           java.lang.String gt2Gb,
           java.lang.String statechangetimesec,
           org.apache.axis.types.UnsignedInt statechangetimemsec,
           org.apache.axis.types.UnsignedInt tickssincelaststatechange,
           java.lang.String rtspnat,
           java.lang.String authenticationhost,
           java.lang.String push,
           java.lang.String pushvserver,
           java.lang.String pushlabel,
           java.lang.String pushmulticlients,
           java.lang.String tcpprofilename,
           java.lang.String httpprofilename,
           java.lang.String dbprofilename,
           java.lang.String comment,
           java.lang.String oracleserverversion,
           java.lang.String mssqlserverversion,
           java.lang.String l2Conn,
           org.apache.axis.types.UnsignedInt mysqlprotocolversion,
           java.lang.String mysqlserverversion,
           org.apache.axis.types.UnsignedInt mysqlcharacterset,
           org.apache.axis.types.UnsignedInt mysqlservercapabilities,
           java.lang.String appflowlog,
           java.lang.String netprofile,
           java.lang.String icmpvsrresponse,
           java.lang.String lbvserver,
           java.lang.String targetlbvserver,
           java.lang.String authnprofile,
           java.lang.String[] filterpolicyname,
           org.apache.axis.types.UnsignedInt[] filterpolicypriority,
           java.lang.String[] filterpolicyscflag,
           java.lang.String[] syslogpolicyname,
           org.apache.axis.types.UnsignedInt[] syslogpriority,
           java.lang.String[] syslogpolicyscflag,
           java.lang.String[] nslogpolicyname,
           org.apache.axis.types.UnsignedInt[] nslogpriority,
           java.lang.String[] nslogpolicyscflag,
           java.lang.String[] authorpolicyname,
           org.apache.axis.types.UnsignedInt[] authorpolicypriority,
           java.lang.String[] authorpolicyscflag,
           java.lang.String[] authorpolicygotoprioexpr,
           java.lang.String[] authorpolicybindpoint,
           boolean[] authorinvoke,
           java.lang.String[] authorpolicyinvokelabeltype,
           java.lang.String[] authorpolicyinvokelabelname,
           java.lang.String[] appfwpolicyname,
           org.apache.axis.types.UnsignedInt[] appfwpriority,
           java.lang.String[] appfwpolicygotoprioexpression,
           java.lang.String[] appfwscflag,
           java.lang.String[] appfwbindpoint,
           boolean[] appfwinvoke,
           java.lang.String[] appfwpolicyinvokelabeltype,
           java.lang.String[] appfwpolicyinvokelabelname,
           java.lang.String[] transformpolicyname,
           org.apache.axis.types.UnsignedInt[] transformpolicypriority,
           java.lang.String[] transformpolicygotoprioexpression,
           java.lang.String[] transformpolicybindpoint,
           boolean[] transforminvoke,
           java.lang.String[] transformpolicyinvokelabeltype,
           java.lang.String[] transformpolicyinvokelabelname,
           java.lang.String[] rwpolicyname,
           org.apache.axis.types.UnsignedInt[] rwpolicypriority,
           java.lang.String[] rwpolicygotoprioexpression,
           java.lang.String[] rwpolicybindpoint,
           boolean[] rwinvoke,
           java.lang.String[] rwpolicyinvokelabeltype,
           java.lang.String[] rwpolicyinvokelabelname,
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
           java.lang.String[] tmtrafficpolicyname,
           org.apache.axis.types.UnsignedInt[] tmtrafficpolicypriority,
           java.lang.String[] spilloverpolicyname,
           java.lang.String[] spilloverpolicygotoprioexpression,
           java.lang.String[] spilloverpolicyflowtype,
           org.apache.axis.types.UnsignedInt[] spilloverpolicypriority,
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
           java.lang.String[] cswpolicyname,
           java.lang.String[] cswtargetserver,
           org.apache.axis.types.UnsignedInt[] cswpriority,
           java.lang.String[] cswpolicygotoprioexpr,
           java.lang.String[] cswpolicybindpoint,
           boolean[] cswinvoke,
           java.lang.String[] cswpolicyinvokelabeltype,
           java.lang.String[] cswpolicyinvokelabelname,
           java.lang.String[] appflowpolicyname,
           org.apache.axis.types.UnsignedInt[] appflowpolicypriority,
           java.lang.String[] appflowpolicygotoprioexpression,
           boolean[] appflowinvoke,
           java.lang.String[] appflowpolicyinvokelabeltype,
           java.lang.String[] appflowpolicyinvokelabelname,
           java.lang.String[] defaultlb) {
           this.name = name;
           this.insertvserveripport = insertvserveripport;
           this.vipheader = vipheader;
           this.ipaddress = ipaddress;
           this.ipaddress2 = ipaddress2;
           this.ippattern = ippattern;
           this.ipmask = ipmask;
           this.value = value;
           this.port = port;
           this.range = range;
           this.servicetype = servicetype;
           this.ngname = ngname;
           this.type = type;
           this.state = state;
           this.sc = sc;
           this.stateupdate = stateupdate;
           this.status = status;
           this.cachetype = cachetype;
           this.redirect = redirect;
           this.precedence = precedence;
           this.redirecturl = redirecturl;
           this.authentication = authentication;
           this.authn401 = authn401;
           this.authnvsname = authnvsname;
           this.casesensitive = casesensitive;
           this.homepage = homepage;
           this.dnsvservername = dnsvservername;
           this.domain = domain;
           this.rule = rule;
           this.policyname = policyname;
           this.hits = hits;
           this.pipolicyhits = pipolicyhits;
           this.servicename = servicename;
           this.weight = weight;
           this.cachevserver = cachevserver;
           this.targetvserver = targetvserver;
           this.backupvserver = backupvserver;
           this.priority = priority;
           this.clttimeout = clttimeout;
           this.listenpolicy = listenpolicy;
           this.listenpriority = listenpriority;
           this.somethod = somethod;
           this.sopersistence = sopersistence;
           this.sopersistencetimeout = sopersistencetimeout;
           this.sothreshold = sothreshold;
           this.sobackupaction = sobackupaction;
           this.cacheable = cacheable;
           this.url = url;
           this.gotopriorityexpression = gotopriorityexpression;
           this.redirectportrewrite = redirectportrewrite;
           this.downstateflush = downstateflush;
           this.disableprimaryondown = disableprimaryondown;
           this.type2 = type2;
           this.invoke = invoke;
           this.labeltype = labeltype;
           this.labelname = labelname;
           this.gt2Gb = gt2Gb;
           this.statechangetimesec = statechangetimesec;
           this.statechangetimemsec = statechangetimemsec;
           this.tickssincelaststatechange = tickssincelaststatechange;
           this.rtspnat = rtspnat;
           this.authenticationhost = authenticationhost;
           this.push = push;
           this.pushvserver = pushvserver;
           this.pushlabel = pushlabel;
           this.pushmulticlients = pushmulticlients;
           this.tcpprofilename = tcpprofilename;
           this.httpprofilename = httpprofilename;
           this.dbprofilename = dbprofilename;
           this.comment = comment;
           this.oracleserverversion = oracleserverversion;
           this.mssqlserverversion = mssqlserverversion;
           this.l2Conn = l2Conn;
           this.mysqlprotocolversion = mysqlprotocolversion;
           this.mysqlserverversion = mysqlserverversion;
           this.mysqlcharacterset = mysqlcharacterset;
           this.mysqlservercapabilities = mysqlservercapabilities;
           this.appflowlog = appflowlog;
           this.netprofile = netprofile;
           this.icmpvsrresponse = icmpvsrresponse;
           this.lbvserver = lbvserver;
           this.targetlbvserver = targetlbvserver;
           this.authnprofile = authnprofile;
           this.filterpolicyname = filterpolicyname;
           this.filterpolicypriority = filterpolicypriority;
           this.filterpolicyscflag = filterpolicyscflag;
           this.syslogpolicyname = syslogpolicyname;
           this.syslogpriority = syslogpriority;
           this.syslogpolicyscflag = syslogpolicyscflag;
           this.nslogpolicyname = nslogpolicyname;
           this.nslogpriority = nslogpriority;
           this.nslogpolicyscflag = nslogpolicyscflag;
           this.authorpolicyname = authorpolicyname;
           this.authorpolicypriority = authorpolicypriority;
           this.authorpolicyscflag = authorpolicyscflag;
           this.authorpolicygotoprioexpr = authorpolicygotoprioexpr;
           this.authorpolicybindpoint = authorpolicybindpoint;
           this.authorinvoke = authorinvoke;
           this.authorpolicyinvokelabeltype = authorpolicyinvokelabeltype;
           this.authorpolicyinvokelabelname = authorpolicyinvokelabelname;
           this.appfwpolicyname = appfwpolicyname;
           this.appfwpriority = appfwpriority;
           this.appfwpolicygotoprioexpression = appfwpolicygotoprioexpression;
           this.appfwscflag = appfwscflag;
           this.appfwbindpoint = appfwbindpoint;
           this.appfwinvoke = appfwinvoke;
           this.appfwpolicyinvokelabeltype = appfwpolicyinvokelabeltype;
           this.appfwpolicyinvokelabelname = appfwpolicyinvokelabelname;
           this.transformpolicyname = transformpolicyname;
           this.transformpolicypriority = transformpolicypriority;
           this.transformpolicygotoprioexpression = transformpolicygotoprioexpression;
           this.transformpolicybindpoint = transformpolicybindpoint;
           this.transforminvoke = transforminvoke;
           this.transformpolicyinvokelabeltype = transformpolicyinvokelabeltype;
           this.transformpolicyinvokelabelname = transformpolicyinvokelabelname;
           this.rwpolicyname = rwpolicyname;
           this.rwpolicypriority = rwpolicypriority;
           this.rwpolicygotoprioexpression = rwpolicygotoprioexpression;
           this.rwpolicybindpoint = rwpolicybindpoint;
           this.rwinvoke = rwinvoke;
           this.rwpolicyinvokelabeltype = rwpolicyinvokelabeltype;
           this.rwpolicyinvokelabelname = rwpolicyinvokelabelname;
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
           this.tmtrafficpolicyname = tmtrafficpolicyname;
           this.tmtrafficpolicypriority = tmtrafficpolicypriority;
           this.spilloverpolicyname = spilloverpolicyname;
           this.spilloverpolicygotoprioexpression = spilloverpolicygotoprioexpression;
           this.spilloverpolicyflowtype = spilloverpolicyflowtype;
           this.spilloverpolicypriority = spilloverpolicypriority;
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
           this.cswpolicyname = cswpolicyname;
           this.cswtargetserver = cswtargetserver;
           this.cswpriority = cswpriority;
           this.cswpolicygotoprioexpr = cswpolicygotoprioexpr;
           this.cswpolicybindpoint = cswpolicybindpoint;
           this.cswinvoke = cswinvoke;
           this.cswpolicyinvokelabeltype = cswpolicyinvokelabeltype;
           this.cswpolicyinvokelabelname = cswpolicyinvokelabelname;
           this.appflowpolicyname = appflowpolicyname;
           this.appflowpolicypriority = appflowpolicypriority;
           this.appflowpolicygotoprioexpression = appflowpolicygotoprioexpression;
           this.appflowinvoke = appflowinvoke;
           this.appflowpolicyinvokelabeltype = appflowpolicyinvokelabeltype;
           this.appflowpolicyinvokelabelname = appflowpolicyinvokelabelname;
           this.defaultlb = defaultlb;
    }


    /**
     * Gets the name value for this Csvserver.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Csvserver.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the insertvserveripport value for this Csvserver.
     * 
     * @return insertvserveripport
     */
    public java.lang.String getInsertvserveripport() {
        return insertvserveripport;
    }


    /**
     * Sets the insertvserveripport value for this Csvserver.
     * 
     * @param insertvserveripport
     */
    public void setInsertvserveripport(java.lang.String insertvserveripport) {
        this.insertvserveripport = insertvserveripport;
    }


    /**
     * Gets the vipheader value for this Csvserver.
     * 
     * @return vipheader
     */
    public java.lang.String getVipheader() {
        return vipheader;
    }


    /**
     * Sets the vipheader value for this Csvserver.
     * 
     * @param vipheader
     */
    public void setVipheader(java.lang.String vipheader) {
        this.vipheader = vipheader;
    }


    /**
     * Gets the ipaddress value for this Csvserver.
     * 
     * @return ipaddress
     */
    public java.lang.String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Csvserver.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the ipaddress2 value for this Csvserver.
     * 
     * @return ipaddress2
     */
    public java.lang.String getIpaddress2() {
        return ipaddress2;
    }


    /**
     * Sets the ipaddress2 value for this Csvserver.
     * 
     * @param ipaddress2
     */
    public void setIpaddress2(java.lang.String ipaddress2) {
        this.ipaddress2 = ipaddress2;
    }


    /**
     * Gets the ippattern value for this Csvserver.
     * 
     * @return ippattern
     */
    public java.lang.String getIppattern() {
        return ippattern;
    }


    /**
     * Sets the ippattern value for this Csvserver.
     * 
     * @param ippattern
     */
    public void setIppattern(java.lang.String ippattern) {
        this.ippattern = ippattern;
    }


    /**
     * Gets the ipmask value for this Csvserver.
     * 
     * @return ipmask
     */
    public java.lang.String getIpmask() {
        return ipmask;
    }


    /**
     * Sets the ipmask value for this Csvserver.
     * 
     * @param ipmask
     */
    public void setIpmask(java.lang.String ipmask) {
        this.ipmask = ipmask;
    }


    /**
     * Gets the value value for this Csvserver.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this Csvserver.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }


    /**
     * Gets the port value for this Csvserver.
     * 
     * @return port
     */
    public org.apache.axis.types.UnsignedInt getPort() {
        return port;
    }


    /**
     * Sets the port value for this Csvserver.
     * 
     * @param port
     */
    public void setPort(org.apache.axis.types.UnsignedInt port) {
        this.port = port;
    }


    /**
     * Gets the range value for this Csvserver.
     * 
     * @return range
     */
    public org.apache.axis.types.UnsignedInt getRange() {
        return range;
    }


    /**
     * Sets the range value for this Csvserver.
     * 
     * @param range
     */
    public void setRange(org.apache.axis.types.UnsignedInt range) {
        this.range = range;
    }


    /**
     * Gets the servicetype value for this Csvserver.
     * 
     * @return servicetype
     */
    public java.lang.String getServicetype() {
        return servicetype;
    }


    /**
     * Sets the servicetype value for this Csvserver.
     * 
     * @param servicetype
     */
    public void setServicetype(java.lang.String servicetype) {
        this.servicetype = servicetype;
    }


    /**
     * Gets the ngname value for this Csvserver.
     * 
     * @return ngname
     */
    public java.lang.String getNgname() {
        return ngname;
    }


    /**
     * Sets the ngname value for this Csvserver.
     * 
     * @param ngname
     */
    public void setNgname(java.lang.String ngname) {
        this.ngname = ngname;
    }


    /**
     * Gets the type value for this Csvserver.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Csvserver.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the state value for this Csvserver.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Csvserver.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the sc value for this Csvserver.
     * 
     * @return sc
     */
    public java.lang.String getSc() {
        return sc;
    }


    /**
     * Sets the sc value for this Csvserver.
     * 
     * @param sc
     */
    public void setSc(java.lang.String sc) {
        this.sc = sc;
    }


    /**
     * Gets the stateupdate value for this Csvserver.
     * 
     * @return stateupdate
     */
    public java.lang.String getStateupdate() {
        return stateupdate;
    }


    /**
     * Sets the stateupdate value for this Csvserver.
     * 
     * @param stateupdate
     */
    public void setStateupdate(java.lang.String stateupdate) {
        this.stateupdate = stateupdate;
    }


    /**
     * Gets the status value for this Csvserver.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Csvserver.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }


    /**
     * Gets the cachetype value for this Csvserver.
     * 
     * @return cachetype
     */
    public java.lang.String getCachetype() {
        return cachetype;
    }


    /**
     * Sets the cachetype value for this Csvserver.
     * 
     * @param cachetype
     */
    public void setCachetype(java.lang.String cachetype) {
        this.cachetype = cachetype;
    }


    /**
     * Gets the redirect value for this Csvserver.
     * 
     * @return redirect
     */
    public java.lang.String getRedirect() {
        return redirect;
    }


    /**
     * Sets the redirect value for this Csvserver.
     * 
     * @param redirect
     */
    public void setRedirect(java.lang.String redirect) {
        this.redirect = redirect;
    }


    /**
     * Gets the precedence value for this Csvserver.
     * 
     * @return precedence
     */
    public java.lang.String getPrecedence() {
        return precedence;
    }


    /**
     * Sets the precedence value for this Csvserver.
     * 
     * @param precedence
     */
    public void setPrecedence(java.lang.String precedence) {
        this.precedence = precedence;
    }


    /**
     * Gets the redirecturl value for this Csvserver.
     * 
     * @return redirecturl
     */
    public java.lang.String getRedirecturl() {
        return redirecturl;
    }


    /**
     * Sets the redirecturl value for this Csvserver.
     * 
     * @param redirecturl
     */
    public void setRedirecturl(java.lang.String redirecturl) {
        this.redirecturl = redirecturl;
    }


    /**
     * Gets the authentication value for this Csvserver.
     * 
     * @return authentication
     */
    public java.lang.String getAuthentication() {
        return authentication;
    }


    /**
     * Sets the authentication value for this Csvserver.
     * 
     * @param authentication
     */
    public void setAuthentication(java.lang.String authentication) {
        this.authentication = authentication;
    }


    /**
     * Gets the authn401 value for this Csvserver.
     * 
     * @return authn401
     */
    public java.lang.String getAuthn401() {
        return authn401;
    }


    /**
     * Sets the authn401 value for this Csvserver.
     * 
     * @param authn401
     */
    public void setAuthn401(java.lang.String authn401) {
        this.authn401 = authn401;
    }


    /**
     * Gets the authnvsname value for this Csvserver.
     * 
     * @return authnvsname
     */
    public java.lang.String getAuthnvsname() {
        return authnvsname;
    }


    /**
     * Sets the authnvsname value for this Csvserver.
     * 
     * @param authnvsname
     */
    public void setAuthnvsname(java.lang.String authnvsname) {
        this.authnvsname = authnvsname;
    }


    /**
     * Gets the casesensitive value for this Csvserver.
     * 
     * @return casesensitive
     */
    public java.lang.String getCasesensitive() {
        return casesensitive;
    }


    /**
     * Sets the casesensitive value for this Csvserver.
     * 
     * @param casesensitive
     */
    public void setCasesensitive(java.lang.String casesensitive) {
        this.casesensitive = casesensitive;
    }


    /**
     * Gets the homepage value for this Csvserver.
     * 
     * @return homepage
     */
    public java.lang.String getHomepage() {
        return homepage;
    }


    /**
     * Sets the homepage value for this Csvserver.
     * 
     * @param homepage
     */
    public void setHomepage(java.lang.String homepage) {
        this.homepage = homepage;
    }


    /**
     * Gets the dnsvservername value for this Csvserver.
     * 
     * @return dnsvservername
     */
    public java.lang.String getDnsvservername() {
        return dnsvservername;
    }


    /**
     * Sets the dnsvservername value for this Csvserver.
     * 
     * @param dnsvservername
     */
    public void setDnsvservername(java.lang.String dnsvservername) {
        this.dnsvservername = dnsvservername;
    }


    /**
     * Gets the domain value for this Csvserver.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this Csvserver.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the rule value for this Csvserver.
     * 
     * @return rule
     */
    public java.lang.String[] getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this Csvserver.
     * 
     * @param rule
     */
    public void setRule(java.lang.String[] rule) {
        this.rule = rule;
    }


    /**
     * Gets the policyname value for this Csvserver.
     * 
     * @return policyname
     */
    public java.lang.String getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Csvserver.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the hits value for this Csvserver.
     * 
     * @return hits
     */
    public org.apache.axis.types.UnsignedInt[] getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this Csvserver.
     * 
     * @param hits
     */
    public void setHits(org.apache.axis.types.UnsignedInt[] hits) {
        this.hits = hits;
    }


    /**
     * Gets the pipolicyhits value for this Csvserver.
     * 
     * @return pipolicyhits
     */
    public org.apache.axis.types.UnsignedInt[] getPipolicyhits() {
        return pipolicyhits;
    }


    /**
     * Sets the pipolicyhits value for this Csvserver.
     * 
     * @param pipolicyhits
     */
    public void setPipolicyhits(org.apache.axis.types.UnsignedInt[] pipolicyhits) {
        this.pipolicyhits = pipolicyhits;
    }


    /**
     * Gets the servicename value for this Csvserver.
     * 
     * @return servicename
     */
    public java.lang.String getServicename() {
        return servicename;
    }


    /**
     * Sets the servicename value for this Csvserver.
     * 
     * @param servicename
     */
    public void setServicename(java.lang.String servicename) {
        this.servicename = servicename;
    }


    /**
     * Gets the weight value for this Csvserver.
     * 
     * @return weight
     */
    public org.apache.axis.types.UnsignedInt getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this Csvserver.
     * 
     * @param weight
     */
    public void setWeight(org.apache.axis.types.UnsignedInt weight) {
        this.weight = weight;
    }


    /**
     * Gets the cachevserver value for this Csvserver.
     * 
     * @return cachevserver
     */
    public java.lang.String getCachevserver() {
        return cachevserver;
    }


    /**
     * Sets the cachevserver value for this Csvserver.
     * 
     * @param cachevserver
     */
    public void setCachevserver(java.lang.String cachevserver) {
        this.cachevserver = cachevserver;
    }


    /**
     * Gets the targetvserver value for this Csvserver.
     * 
     * @return targetvserver
     */
    public java.lang.String getTargetvserver() {
        return targetvserver;
    }


    /**
     * Sets the targetvserver value for this Csvserver.
     * 
     * @param targetvserver
     */
    public void setTargetvserver(java.lang.String targetvserver) {
        this.targetvserver = targetvserver;
    }


    /**
     * Gets the backupvserver value for this Csvserver.
     * 
     * @return backupvserver
     */
    public java.lang.String getBackupvserver() {
        return backupvserver;
    }


    /**
     * Sets the backupvserver value for this Csvserver.
     * 
     * @param backupvserver
     */
    public void setBackupvserver(java.lang.String backupvserver) {
        this.backupvserver = backupvserver;
    }


    /**
     * Gets the priority value for this Csvserver.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Csvserver.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the clttimeout value for this Csvserver.
     * 
     * @return clttimeout
     */
    public org.apache.axis.types.UnsignedInt getClttimeout() {
        return clttimeout;
    }


    /**
     * Sets the clttimeout value for this Csvserver.
     * 
     * @param clttimeout
     */
    public void setClttimeout(org.apache.axis.types.UnsignedInt clttimeout) {
        this.clttimeout = clttimeout;
    }


    /**
     * Gets the listenpolicy value for this Csvserver.
     * 
     * @return listenpolicy
     */
    public java.lang.String getListenpolicy() {
        return listenpolicy;
    }


    /**
     * Sets the listenpolicy value for this Csvserver.
     * 
     * @param listenpolicy
     */
    public void setListenpolicy(java.lang.String listenpolicy) {
        this.listenpolicy = listenpolicy;
    }


    /**
     * Gets the listenpriority value for this Csvserver.
     * 
     * @return listenpriority
     */
    public org.apache.axis.types.UnsignedInt getListenpriority() {
        return listenpriority;
    }


    /**
     * Sets the listenpriority value for this Csvserver.
     * 
     * @param listenpriority
     */
    public void setListenpriority(org.apache.axis.types.UnsignedInt listenpriority) {
        this.listenpriority = listenpriority;
    }


    /**
     * Gets the somethod value for this Csvserver.
     * 
     * @return somethod
     */
    public java.lang.String getSomethod() {
        return somethod;
    }


    /**
     * Sets the somethod value for this Csvserver.
     * 
     * @param somethod
     */
    public void setSomethod(java.lang.String somethod) {
        this.somethod = somethod;
    }


    /**
     * Gets the sopersistence value for this Csvserver.
     * 
     * @return sopersistence
     */
    public java.lang.String getSopersistence() {
        return sopersistence;
    }


    /**
     * Sets the sopersistence value for this Csvserver.
     * 
     * @param sopersistence
     */
    public void setSopersistence(java.lang.String sopersistence) {
        this.sopersistence = sopersistence;
    }


    /**
     * Gets the sopersistencetimeout value for this Csvserver.
     * 
     * @return sopersistencetimeout
     */
    public org.apache.axis.types.UnsignedInt getSopersistencetimeout() {
        return sopersistencetimeout;
    }


    /**
     * Sets the sopersistencetimeout value for this Csvserver.
     * 
     * @param sopersistencetimeout
     */
    public void setSopersistencetimeout(org.apache.axis.types.UnsignedInt sopersistencetimeout) {
        this.sopersistencetimeout = sopersistencetimeout;
    }


    /**
     * Gets the sothreshold value for this Csvserver.
     * 
     * @return sothreshold
     */
    public org.apache.axis.types.UnsignedInt getSothreshold() {
        return sothreshold;
    }


    /**
     * Sets the sothreshold value for this Csvserver.
     * 
     * @param sothreshold
     */
    public void setSothreshold(org.apache.axis.types.UnsignedInt sothreshold) {
        this.sothreshold = sothreshold;
    }


    /**
     * Gets the sobackupaction value for this Csvserver.
     * 
     * @return sobackupaction
     */
    public java.lang.String getSobackupaction() {
        return sobackupaction;
    }


    /**
     * Sets the sobackupaction value for this Csvserver.
     * 
     * @param sobackupaction
     */
    public void setSobackupaction(java.lang.String sobackupaction) {
        this.sobackupaction = sobackupaction;
    }


    /**
     * Gets the cacheable value for this Csvserver.
     * 
     * @return cacheable
     */
    public java.lang.String getCacheable() {
        return cacheable;
    }


    /**
     * Sets the cacheable value for this Csvserver.
     * 
     * @param cacheable
     */
    public void setCacheable(java.lang.String cacheable) {
        this.cacheable = cacheable;
    }


    /**
     * Gets the url value for this Csvserver.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Csvserver.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the gotopriorityexpression value for this Csvserver.
     * 
     * @return gotopriorityexpression
     */
    public java.lang.String getGotopriorityexpression() {
        return gotopriorityexpression;
    }


    /**
     * Sets the gotopriorityexpression value for this Csvserver.
     * 
     * @param gotopriorityexpression
     */
    public void setGotopriorityexpression(java.lang.String gotopriorityexpression) {
        this.gotopriorityexpression = gotopriorityexpression;
    }


    /**
     * Gets the redirectportrewrite value for this Csvserver.
     * 
     * @return redirectportrewrite
     */
    public java.lang.String getRedirectportrewrite() {
        return redirectportrewrite;
    }


    /**
     * Sets the redirectportrewrite value for this Csvserver.
     * 
     * @param redirectportrewrite
     */
    public void setRedirectportrewrite(java.lang.String redirectportrewrite) {
        this.redirectportrewrite = redirectportrewrite;
    }


    /**
     * Gets the downstateflush value for this Csvserver.
     * 
     * @return downstateflush
     */
    public java.lang.String getDownstateflush() {
        return downstateflush;
    }


    /**
     * Sets the downstateflush value for this Csvserver.
     * 
     * @param downstateflush
     */
    public void setDownstateflush(java.lang.String downstateflush) {
        this.downstateflush = downstateflush;
    }


    /**
     * Gets the disableprimaryondown value for this Csvserver.
     * 
     * @return disableprimaryondown
     */
    public java.lang.String getDisableprimaryondown() {
        return disableprimaryondown;
    }


    /**
     * Sets the disableprimaryondown value for this Csvserver.
     * 
     * @param disableprimaryondown
     */
    public void setDisableprimaryondown(java.lang.String disableprimaryondown) {
        this.disableprimaryondown = disableprimaryondown;
    }


    /**
     * Gets the type2 value for this Csvserver.
     * 
     * @return type2
     */
    public java.lang.String getType2() {
        return type2;
    }


    /**
     * Sets the type2 value for this Csvserver.
     * 
     * @param type2
     */
    public void setType2(java.lang.String type2) {
        this.type2 = type2;
    }


    /**
     * Gets the invoke value for this Csvserver.
     * 
     * @return invoke
     */
    public boolean isInvoke() {
        return invoke;
    }


    /**
     * Sets the invoke value for this Csvserver.
     * 
     * @param invoke
     */
    public void setInvoke(boolean invoke) {
        this.invoke = invoke;
    }


    /**
     * Gets the labeltype value for this Csvserver.
     * 
     * @return labeltype
     */
    public java.lang.String getLabeltype() {
        return labeltype;
    }


    /**
     * Sets the labeltype value for this Csvserver.
     * 
     * @param labeltype
     */
    public void setLabeltype(java.lang.String labeltype) {
        this.labeltype = labeltype;
    }


    /**
     * Gets the labelname value for this Csvserver.
     * 
     * @return labelname
     */
    public java.lang.String getLabelname() {
        return labelname;
    }


    /**
     * Sets the labelname value for this Csvserver.
     * 
     * @param labelname
     */
    public void setLabelname(java.lang.String labelname) {
        this.labelname = labelname;
    }


    /**
     * Gets the gt2Gb value for this Csvserver.
     * 
     * @return gt2Gb
     */
    public java.lang.String getGt2Gb() {
        return gt2Gb;
    }


    /**
     * Sets the gt2Gb value for this Csvserver.
     * 
     * @param gt2Gb
     */
    public void setGt2Gb(java.lang.String gt2Gb) {
        this.gt2Gb = gt2Gb;
    }


    /**
     * Gets the statechangetimesec value for this Csvserver.
     * 
     * @return statechangetimesec
     */
    public java.lang.String getStatechangetimesec() {
        return statechangetimesec;
    }


    /**
     * Sets the statechangetimesec value for this Csvserver.
     * 
     * @param statechangetimesec
     */
    public void setStatechangetimesec(java.lang.String statechangetimesec) {
        this.statechangetimesec = statechangetimesec;
    }


    /**
     * Gets the statechangetimemsec value for this Csvserver.
     * 
     * @return statechangetimemsec
     */
    public org.apache.axis.types.UnsignedInt getStatechangetimemsec() {
        return statechangetimemsec;
    }


    /**
     * Sets the statechangetimemsec value for this Csvserver.
     * 
     * @param statechangetimemsec
     */
    public void setStatechangetimemsec(org.apache.axis.types.UnsignedInt statechangetimemsec) {
        this.statechangetimemsec = statechangetimemsec;
    }


    /**
     * Gets the tickssincelaststatechange value for this Csvserver.
     * 
     * @return tickssincelaststatechange
     */
    public org.apache.axis.types.UnsignedInt getTickssincelaststatechange() {
        return tickssincelaststatechange;
    }


    /**
     * Sets the tickssincelaststatechange value for this Csvserver.
     * 
     * @param tickssincelaststatechange
     */
    public void setTickssincelaststatechange(org.apache.axis.types.UnsignedInt tickssincelaststatechange) {
        this.tickssincelaststatechange = tickssincelaststatechange;
    }


    /**
     * Gets the rtspnat value for this Csvserver.
     * 
     * @return rtspnat
     */
    public java.lang.String getRtspnat() {
        return rtspnat;
    }


    /**
     * Sets the rtspnat value for this Csvserver.
     * 
     * @param rtspnat
     */
    public void setRtspnat(java.lang.String rtspnat) {
        this.rtspnat = rtspnat;
    }


    /**
     * Gets the authenticationhost value for this Csvserver.
     * 
     * @return authenticationhost
     */
    public java.lang.String getAuthenticationhost() {
        return authenticationhost;
    }


    /**
     * Sets the authenticationhost value for this Csvserver.
     * 
     * @param authenticationhost
     */
    public void setAuthenticationhost(java.lang.String authenticationhost) {
        this.authenticationhost = authenticationhost;
    }


    /**
     * Gets the push value for this Csvserver.
     * 
     * @return push
     */
    public java.lang.String getPush() {
        return push;
    }


    /**
     * Sets the push value for this Csvserver.
     * 
     * @param push
     */
    public void setPush(java.lang.String push) {
        this.push = push;
    }


    /**
     * Gets the pushvserver value for this Csvserver.
     * 
     * @return pushvserver
     */
    public java.lang.String getPushvserver() {
        return pushvserver;
    }


    /**
     * Sets the pushvserver value for this Csvserver.
     * 
     * @param pushvserver
     */
    public void setPushvserver(java.lang.String pushvserver) {
        this.pushvserver = pushvserver;
    }


    /**
     * Gets the pushlabel value for this Csvserver.
     * 
     * @return pushlabel
     */
    public java.lang.String getPushlabel() {
        return pushlabel;
    }


    /**
     * Sets the pushlabel value for this Csvserver.
     * 
     * @param pushlabel
     */
    public void setPushlabel(java.lang.String pushlabel) {
        this.pushlabel = pushlabel;
    }


    /**
     * Gets the pushmulticlients value for this Csvserver.
     * 
     * @return pushmulticlients
     */
    public java.lang.String getPushmulticlients() {
        return pushmulticlients;
    }


    /**
     * Sets the pushmulticlients value for this Csvserver.
     * 
     * @param pushmulticlients
     */
    public void setPushmulticlients(java.lang.String pushmulticlients) {
        this.pushmulticlients = pushmulticlients;
    }


    /**
     * Gets the tcpprofilename value for this Csvserver.
     * 
     * @return tcpprofilename
     */
    public java.lang.String getTcpprofilename() {
        return tcpprofilename;
    }


    /**
     * Sets the tcpprofilename value for this Csvserver.
     * 
     * @param tcpprofilename
     */
    public void setTcpprofilename(java.lang.String tcpprofilename) {
        this.tcpprofilename = tcpprofilename;
    }


    /**
     * Gets the httpprofilename value for this Csvserver.
     * 
     * @return httpprofilename
     */
    public java.lang.String getHttpprofilename() {
        return httpprofilename;
    }


    /**
     * Sets the httpprofilename value for this Csvserver.
     * 
     * @param httpprofilename
     */
    public void setHttpprofilename(java.lang.String httpprofilename) {
        this.httpprofilename = httpprofilename;
    }


    /**
     * Gets the dbprofilename value for this Csvserver.
     * 
     * @return dbprofilename
     */
    public java.lang.String getDbprofilename() {
        return dbprofilename;
    }


    /**
     * Sets the dbprofilename value for this Csvserver.
     * 
     * @param dbprofilename
     */
    public void setDbprofilename(java.lang.String dbprofilename) {
        this.dbprofilename = dbprofilename;
    }


    /**
     * Gets the comment value for this Csvserver.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Csvserver.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the oracleserverversion value for this Csvserver.
     * 
     * @return oracleserverversion
     */
    public java.lang.String getOracleserverversion() {
        return oracleserverversion;
    }


    /**
     * Sets the oracleserverversion value for this Csvserver.
     * 
     * @param oracleserverversion
     */
    public void setOracleserverversion(java.lang.String oracleserverversion) {
        this.oracleserverversion = oracleserverversion;
    }


    /**
     * Gets the mssqlserverversion value for this Csvserver.
     * 
     * @return mssqlserverversion
     */
    public java.lang.String getMssqlserverversion() {
        return mssqlserverversion;
    }


    /**
     * Sets the mssqlserverversion value for this Csvserver.
     * 
     * @param mssqlserverversion
     */
    public void setMssqlserverversion(java.lang.String mssqlserverversion) {
        this.mssqlserverversion = mssqlserverversion;
    }


    /**
     * Gets the l2Conn value for this Csvserver.
     * 
     * @return l2Conn
     */
    public java.lang.String getL2Conn() {
        return l2Conn;
    }


    /**
     * Sets the l2Conn value for this Csvserver.
     * 
     * @param l2Conn
     */
    public void setL2Conn(java.lang.String l2Conn) {
        this.l2Conn = l2Conn;
    }


    /**
     * Gets the mysqlprotocolversion value for this Csvserver.
     * 
     * @return mysqlprotocolversion
     */
    public org.apache.axis.types.UnsignedInt getMysqlprotocolversion() {
        return mysqlprotocolversion;
    }


    /**
     * Sets the mysqlprotocolversion value for this Csvserver.
     * 
     * @param mysqlprotocolversion
     */
    public void setMysqlprotocolversion(org.apache.axis.types.UnsignedInt mysqlprotocolversion) {
        this.mysqlprotocolversion = mysqlprotocolversion;
    }


    /**
     * Gets the mysqlserverversion value for this Csvserver.
     * 
     * @return mysqlserverversion
     */
    public java.lang.String getMysqlserverversion() {
        return mysqlserverversion;
    }


    /**
     * Sets the mysqlserverversion value for this Csvserver.
     * 
     * @param mysqlserverversion
     */
    public void setMysqlserverversion(java.lang.String mysqlserverversion) {
        this.mysqlserverversion = mysqlserverversion;
    }


    /**
     * Gets the mysqlcharacterset value for this Csvserver.
     * 
     * @return mysqlcharacterset
     */
    public org.apache.axis.types.UnsignedInt getMysqlcharacterset() {
        return mysqlcharacterset;
    }


    /**
     * Sets the mysqlcharacterset value for this Csvserver.
     * 
     * @param mysqlcharacterset
     */
    public void setMysqlcharacterset(org.apache.axis.types.UnsignedInt mysqlcharacterset) {
        this.mysqlcharacterset = mysqlcharacterset;
    }


    /**
     * Gets the mysqlservercapabilities value for this Csvserver.
     * 
     * @return mysqlservercapabilities
     */
    public org.apache.axis.types.UnsignedInt getMysqlservercapabilities() {
        return mysqlservercapabilities;
    }


    /**
     * Sets the mysqlservercapabilities value for this Csvserver.
     * 
     * @param mysqlservercapabilities
     */
    public void setMysqlservercapabilities(org.apache.axis.types.UnsignedInt mysqlservercapabilities) {
        this.mysqlservercapabilities = mysqlservercapabilities;
    }


    /**
     * Gets the appflowlog value for this Csvserver.
     * 
     * @return appflowlog
     */
    public java.lang.String getAppflowlog() {
        return appflowlog;
    }


    /**
     * Sets the appflowlog value for this Csvserver.
     * 
     * @param appflowlog
     */
    public void setAppflowlog(java.lang.String appflowlog) {
        this.appflowlog = appflowlog;
    }


    /**
     * Gets the netprofile value for this Csvserver.
     * 
     * @return netprofile
     */
    public java.lang.String getNetprofile() {
        return netprofile;
    }


    /**
     * Sets the netprofile value for this Csvserver.
     * 
     * @param netprofile
     */
    public void setNetprofile(java.lang.String netprofile) {
        this.netprofile = netprofile;
    }


    /**
     * Gets the icmpvsrresponse value for this Csvserver.
     * 
     * @return icmpvsrresponse
     */
    public java.lang.String getIcmpvsrresponse() {
        return icmpvsrresponse;
    }


    /**
     * Sets the icmpvsrresponse value for this Csvserver.
     * 
     * @param icmpvsrresponse
     */
    public void setIcmpvsrresponse(java.lang.String icmpvsrresponse) {
        this.icmpvsrresponse = icmpvsrresponse;
    }


    /**
     * Gets the lbvserver value for this Csvserver.
     * 
     * @return lbvserver
     */
    public java.lang.String getLbvserver() {
        return lbvserver;
    }


    /**
     * Sets the lbvserver value for this Csvserver.
     * 
     * @param lbvserver
     */
    public void setLbvserver(java.lang.String lbvserver) {
        this.lbvserver = lbvserver;
    }


    /**
     * Gets the targetlbvserver value for this Csvserver.
     * 
     * @return targetlbvserver
     */
    public java.lang.String getTargetlbvserver() {
        return targetlbvserver;
    }


    /**
     * Sets the targetlbvserver value for this Csvserver.
     * 
     * @param targetlbvserver
     */
    public void setTargetlbvserver(java.lang.String targetlbvserver) {
        this.targetlbvserver = targetlbvserver;
    }


    /**
     * Gets the authnprofile value for this Csvserver.
     * 
     * @return authnprofile
     */
    public java.lang.String getAuthnprofile() {
        return authnprofile;
    }


    /**
     * Sets the authnprofile value for this Csvserver.
     * 
     * @param authnprofile
     */
    public void setAuthnprofile(java.lang.String authnprofile) {
        this.authnprofile = authnprofile;
    }


    /**
     * Gets the filterpolicyname value for this Csvserver.
     * 
     * @return filterpolicyname
     */
    public java.lang.String[] getFilterpolicyname() {
        return filterpolicyname;
    }


    /**
     * Sets the filterpolicyname value for this Csvserver.
     * 
     * @param filterpolicyname
     */
    public void setFilterpolicyname(java.lang.String[] filterpolicyname) {
        this.filterpolicyname = filterpolicyname;
    }


    /**
     * Gets the filterpolicypriority value for this Csvserver.
     * 
     * @return filterpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getFilterpolicypriority() {
        return filterpolicypriority;
    }


    /**
     * Sets the filterpolicypriority value for this Csvserver.
     * 
     * @param filterpolicypriority
     */
    public void setFilterpolicypriority(org.apache.axis.types.UnsignedInt[] filterpolicypriority) {
        this.filterpolicypriority = filterpolicypriority;
    }


    /**
     * Gets the filterpolicyscflag value for this Csvserver.
     * 
     * @return filterpolicyscflag
     */
    public java.lang.String[] getFilterpolicyscflag() {
        return filterpolicyscflag;
    }


    /**
     * Sets the filterpolicyscflag value for this Csvserver.
     * 
     * @param filterpolicyscflag
     */
    public void setFilterpolicyscflag(java.lang.String[] filterpolicyscflag) {
        this.filterpolicyscflag = filterpolicyscflag;
    }


    /**
     * Gets the syslogpolicyname value for this Csvserver.
     * 
     * @return syslogpolicyname
     */
    public java.lang.String[] getSyslogpolicyname() {
        return syslogpolicyname;
    }


    /**
     * Sets the syslogpolicyname value for this Csvserver.
     * 
     * @param syslogpolicyname
     */
    public void setSyslogpolicyname(java.lang.String[] syslogpolicyname) {
        this.syslogpolicyname = syslogpolicyname;
    }


    /**
     * Gets the syslogpriority value for this Csvserver.
     * 
     * @return syslogpriority
     */
    public org.apache.axis.types.UnsignedInt[] getSyslogpriority() {
        return syslogpriority;
    }


    /**
     * Sets the syslogpriority value for this Csvserver.
     * 
     * @param syslogpriority
     */
    public void setSyslogpriority(org.apache.axis.types.UnsignedInt[] syslogpriority) {
        this.syslogpriority = syslogpriority;
    }


    /**
     * Gets the syslogpolicyscflag value for this Csvserver.
     * 
     * @return syslogpolicyscflag
     */
    public java.lang.String[] getSyslogpolicyscflag() {
        return syslogpolicyscflag;
    }


    /**
     * Sets the syslogpolicyscflag value for this Csvserver.
     * 
     * @param syslogpolicyscflag
     */
    public void setSyslogpolicyscflag(java.lang.String[] syslogpolicyscflag) {
        this.syslogpolicyscflag = syslogpolicyscflag;
    }


    /**
     * Gets the nslogpolicyname value for this Csvserver.
     * 
     * @return nslogpolicyname
     */
    public java.lang.String[] getNslogpolicyname() {
        return nslogpolicyname;
    }


    /**
     * Sets the nslogpolicyname value for this Csvserver.
     * 
     * @param nslogpolicyname
     */
    public void setNslogpolicyname(java.lang.String[] nslogpolicyname) {
        this.nslogpolicyname = nslogpolicyname;
    }


    /**
     * Gets the nslogpriority value for this Csvserver.
     * 
     * @return nslogpriority
     */
    public org.apache.axis.types.UnsignedInt[] getNslogpriority() {
        return nslogpriority;
    }


    /**
     * Sets the nslogpriority value for this Csvserver.
     * 
     * @param nslogpriority
     */
    public void setNslogpriority(org.apache.axis.types.UnsignedInt[] nslogpriority) {
        this.nslogpriority = nslogpriority;
    }


    /**
     * Gets the nslogpolicyscflag value for this Csvserver.
     * 
     * @return nslogpolicyscflag
     */
    public java.lang.String[] getNslogpolicyscflag() {
        return nslogpolicyscflag;
    }


    /**
     * Sets the nslogpolicyscflag value for this Csvserver.
     * 
     * @param nslogpolicyscflag
     */
    public void setNslogpolicyscflag(java.lang.String[] nslogpolicyscflag) {
        this.nslogpolicyscflag = nslogpolicyscflag;
    }


    /**
     * Gets the authorpolicyname value for this Csvserver.
     * 
     * @return authorpolicyname
     */
    public java.lang.String[] getAuthorpolicyname() {
        return authorpolicyname;
    }


    /**
     * Sets the authorpolicyname value for this Csvserver.
     * 
     * @param authorpolicyname
     */
    public void setAuthorpolicyname(java.lang.String[] authorpolicyname) {
        this.authorpolicyname = authorpolicyname;
    }


    /**
     * Gets the authorpolicypriority value for this Csvserver.
     * 
     * @return authorpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getAuthorpolicypriority() {
        return authorpolicypriority;
    }


    /**
     * Sets the authorpolicypriority value for this Csvserver.
     * 
     * @param authorpolicypriority
     */
    public void setAuthorpolicypriority(org.apache.axis.types.UnsignedInt[] authorpolicypriority) {
        this.authorpolicypriority = authorpolicypriority;
    }


    /**
     * Gets the authorpolicyscflag value for this Csvserver.
     * 
     * @return authorpolicyscflag
     */
    public java.lang.String[] getAuthorpolicyscflag() {
        return authorpolicyscflag;
    }


    /**
     * Sets the authorpolicyscflag value for this Csvserver.
     * 
     * @param authorpolicyscflag
     */
    public void setAuthorpolicyscflag(java.lang.String[] authorpolicyscflag) {
        this.authorpolicyscflag = authorpolicyscflag;
    }


    /**
     * Gets the authorpolicygotoprioexpr value for this Csvserver.
     * 
     * @return authorpolicygotoprioexpr
     */
    public java.lang.String[] getAuthorpolicygotoprioexpr() {
        return authorpolicygotoprioexpr;
    }


    /**
     * Sets the authorpolicygotoprioexpr value for this Csvserver.
     * 
     * @param authorpolicygotoprioexpr
     */
    public void setAuthorpolicygotoprioexpr(java.lang.String[] authorpolicygotoprioexpr) {
        this.authorpolicygotoprioexpr = authorpolicygotoprioexpr;
    }


    /**
     * Gets the authorpolicybindpoint value for this Csvserver.
     * 
     * @return authorpolicybindpoint
     */
    public java.lang.String[] getAuthorpolicybindpoint() {
        return authorpolicybindpoint;
    }


    /**
     * Sets the authorpolicybindpoint value for this Csvserver.
     * 
     * @param authorpolicybindpoint
     */
    public void setAuthorpolicybindpoint(java.lang.String[] authorpolicybindpoint) {
        this.authorpolicybindpoint = authorpolicybindpoint;
    }


    /**
     * Gets the authorinvoke value for this Csvserver.
     * 
     * @return authorinvoke
     */
    public boolean[] getAuthorinvoke() {
        return authorinvoke;
    }


    /**
     * Sets the authorinvoke value for this Csvserver.
     * 
     * @param authorinvoke
     */
    public void setAuthorinvoke(boolean[] authorinvoke) {
        this.authorinvoke = authorinvoke;
    }


    /**
     * Gets the authorpolicyinvokelabeltype value for this Csvserver.
     * 
     * @return authorpolicyinvokelabeltype
     */
    public java.lang.String[] getAuthorpolicyinvokelabeltype() {
        return authorpolicyinvokelabeltype;
    }


    /**
     * Sets the authorpolicyinvokelabeltype value for this Csvserver.
     * 
     * @param authorpolicyinvokelabeltype
     */
    public void setAuthorpolicyinvokelabeltype(java.lang.String[] authorpolicyinvokelabeltype) {
        this.authorpolicyinvokelabeltype = authorpolicyinvokelabeltype;
    }


    /**
     * Gets the authorpolicyinvokelabelname value for this Csvserver.
     * 
     * @return authorpolicyinvokelabelname
     */
    public java.lang.String[] getAuthorpolicyinvokelabelname() {
        return authorpolicyinvokelabelname;
    }


    /**
     * Sets the authorpolicyinvokelabelname value for this Csvserver.
     * 
     * @param authorpolicyinvokelabelname
     */
    public void setAuthorpolicyinvokelabelname(java.lang.String[] authorpolicyinvokelabelname) {
        this.authorpolicyinvokelabelname = authorpolicyinvokelabelname;
    }


    /**
     * Gets the appfwpolicyname value for this Csvserver.
     * 
     * @return appfwpolicyname
     */
    public java.lang.String[] getAppfwpolicyname() {
        return appfwpolicyname;
    }


    /**
     * Sets the appfwpolicyname value for this Csvserver.
     * 
     * @param appfwpolicyname
     */
    public void setAppfwpolicyname(java.lang.String[] appfwpolicyname) {
        this.appfwpolicyname = appfwpolicyname;
    }


    /**
     * Gets the appfwpriority value for this Csvserver.
     * 
     * @return appfwpriority
     */
    public org.apache.axis.types.UnsignedInt[] getAppfwpriority() {
        return appfwpriority;
    }


    /**
     * Sets the appfwpriority value for this Csvserver.
     * 
     * @param appfwpriority
     */
    public void setAppfwpriority(org.apache.axis.types.UnsignedInt[] appfwpriority) {
        this.appfwpriority = appfwpriority;
    }


    /**
     * Gets the appfwpolicygotoprioexpression value for this Csvserver.
     * 
     * @return appfwpolicygotoprioexpression
     */
    public java.lang.String[] getAppfwpolicygotoprioexpression() {
        return appfwpolicygotoprioexpression;
    }


    /**
     * Sets the appfwpolicygotoprioexpression value for this Csvserver.
     * 
     * @param appfwpolicygotoprioexpression
     */
    public void setAppfwpolicygotoprioexpression(java.lang.String[] appfwpolicygotoprioexpression) {
        this.appfwpolicygotoprioexpression = appfwpolicygotoprioexpression;
    }


    /**
     * Gets the appfwscflag value for this Csvserver.
     * 
     * @return appfwscflag
     */
    public java.lang.String[] getAppfwscflag() {
        return appfwscflag;
    }


    /**
     * Sets the appfwscflag value for this Csvserver.
     * 
     * @param appfwscflag
     */
    public void setAppfwscflag(java.lang.String[] appfwscflag) {
        this.appfwscflag = appfwscflag;
    }


    /**
     * Gets the appfwbindpoint value for this Csvserver.
     * 
     * @return appfwbindpoint
     */
    public java.lang.String[] getAppfwbindpoint() {
        return appfwbindpoint;
    }


    /**
     * Sets the appfwbindpoint value for this Csvserver.
     * 
     * @param appfwbindpoint
     */
    public void setAppfwbindpoint(java.lang.String[] appfwbindpoint) {
        this.appfwbindpoint = appfwbindpoint;
    }


    /**
     * Gets the appfwinvoke value for this Csvserver.
     * 
     * @return appfwinvoke
     */
    public boolean[] getAppfwinvoke() {
        return appfwinvoke;
    }


    /**
     * Sets the appfwinvoke value for this Csvserver.
     * 
     * @param appfwinvoke
     */
    public void setAppfwinvoke(boolean[] appfwinvoke) {
        this.appfwinvoke = appfwinvoke;
    }


    /**
     * Gets the appfwpolicyinvokelabeltype value for this Csvserver.
     * 
     * @return appfwpolicyinvokelabeltype
     */
    public java.lang.String[] getAppfwpolicyinvokelabeltype() {
        return appfwpolicyinvokelabeltype;
    }


    /**
     * Sets the appfwpolicyinvokelabeltype value for this Csvserver.
     * 
     * @param appfwpolicyinvokelabeltype
     */
    public void setAppfwpolicyinvokelabeltype(java.lang.String[] appfwpolicyinvokelabeltype) {
        this.appfwpolicyinvokelabeltype = appfwpolicyinvokelabeltype;
    }


    /**
     * Gets the appfwpolicyinvokelabelname value for this Csvserver.
     * 
     * @return appfwpolicyinvokelabelname
     */
    public java.lang.String[] getAppfwpolicyinvokelabelname() {
        return appfwpolicyinvokelabelname;
    }


    /**
     * Sets the appfwpolicyinvokelabelname value for this Csvserver.
     * 
     * @param appfwpolicyinvokelabelname
     */
    public void setAppfwpolicyinvokelabelname(java.lang.String[] appfwpolicyinvokelabelname) {
        this.appfwpolicyinvokelabelname = appfwpolicyinvokelabelname;
    }


    /**
     * Gets the transformpolicyname value for this Csvserver.
     * 
     * @return transformpolicyname
     */
    public java.lang.String[] getTransformpolicyname() {
        return transformpolicyname;
    }


    /**
     * Sets the transformpolicyname value for this Csvserver.
     * 
     * @param transformpolicyname
     */
    public void setTransformpolicyname(java.lang.String[] transformpolicyname) {
        this.transformpolicyname = transformpolicyname;
    }


    /**
     * Gets the transformpolicypriority value for this Csvserver.
     * 
     * @return transformpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getTransformpolicypriority() {
        return transformpolicypriority;
    }


    /**
     * Sets the transformpolicypriority value for this Csvserver.
     * 
     * @param transformpolicypriority
     */
    public void setTransformpolicypriority(org.apache.axis.types.UnsignedInt[] transformpolicypriority) {
        this.transformpolicypriority = transformpolicypriority;
    }


    /**
     * Gets the transformpolicygotoprioexpression value for this Csvserver.
     * 
     * @return transformpolicygotoprioexpression
     */
    public java.lang.String[] getTransformpolicygotoprioexpression() {
        return transformpolicygotoprioexpression;
    }


    /**
     * Sets the transformpolicygotoprioexpression value for this Csvserver.
     * 
     * @param transformpolicygotoprioexpression
     */
    public void setTransformpolicygotoprioexpression(java.lang.String[] transformpolicygotoprioexpression) {
        this.transformpolicygotoprioexpression = transformpolicygotoprioexpression;
    }


    /**
     * Gets the transformpolicybindpoint value for this Csvserver.
     * 
     * @return transformpolicybindpoint
     */
    public java.lang.String[] getTransformpolicybindpoint() {
        return transformpolicybindpoint;
    }


    /**
     * Sets the transformpolicybindpoint value for this Csvserver.
     * 
     * @param transformpolicybindpoint
     */
    public void setTransformpolicybindpoint(java.lang.String[] transformpolicybindpoint) {
        this.transformpolicybindpoint = transformpolicybindpoint;
    }


    /**
     * Gets the transforminvoke value for this Csvserver.
     * 
     * @return transforminvoke
     */
    public boolean[] getTransforminvoke() {
        return transforminvoke;
    }


    /**
     * Sets the transforminvoke value for this Csvserver.
     * 
     * @param transforminvoke
     */
    public void setTransforminvoke(boolean[] transforminvoke) {
        this.transforminvoke = transforminvoke;
    }


    /**
     * Gets the transformpolicyinvokelabeltype value for this Csvserver.
     * 
     * @return transformpolicyinvokelabeltype
     */
    public java.lang.String[] getTransformpolicyinvokelabeltype() {
        return transformpolicyinvokelabeltype;
    }


    /**
     * Sets the transformpolicyinvokelabeltype value for this Csvserver.
     * 
     * @param transformpolicyinvokelabeltype
     */
    public void setTransformpolicyinvokelabeltype(java.lang.String[] transformpolicyinvokelabeltype) {
        this.transformpolicyinvokelabeltype = transformpolicyinvokelabeltype;
    }


    /**
     * Gets the transformpolicyinvokelabelname value for this Csvserver.
     * 
     * @return transformpolicyinvokelabelname
     */
    public java.lang.String[] getTransformpolicyinvokelabelname() {
        return transformpolicyinvokelabelname;
    }


    /**
     * Sets the transformpolicyinvokelabelname value for this Csvserver.
     * 
     * @param transformpolicyinvokelabelname
     */
    public void setTransformpolicyinvokelabelname(java.lang.String[] transformpolicyinvokelabelname) {
        this.transformpolicyinvokelabelname = transformpolicyinvokelabelname;
    }


    /**
     * Gets the rwpolicyname value for this Csvserver.
     * 
     * @return rwpolicyname
     */
    public java.lang.String[] getRwpolicyname() {
        return rwpolicyname;
    }


    /**
     * Sets the rwpolicyname value for this Csvserver.
     * 
     * @param rwpolicyname
     */
    public void setRwpolicyname(java.lang.String[] rwpolicyname) {
        this.rwpolicyname = rwpolicyname;
    }


    /**
     * Gets the rwpolicypriority value for this Csvserver.
     * 
     * @return rwpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getRwpolicypriority() {
        return rwpolicypriority;
    }


    /**
     * Sets the rwpolicypriority value for this Csvserver.
     * 
     * @param rwpolicypriority
     */
    public void setRwpolicypriority(org.apache.axis.types.UnsignedInt[] rwpolicypriority) {
        this.rwpolicypriority = rwpolicypriority;
    }


    /**
     * Gets the rwpolicygotoprioexpression value for this Csvserver.
     * 
     * @return rwpolicygotoprioexpression
     */
    public java.lang.String[] getRwpolicygotoprioexpression() {
        return rwpolicygotoprioexpression;
    }


    /**
     * Sets the rwpolicygotoprioexpression value for this Csvserver.
     * 
     * @param rwpolicygotoprioexpression
     */
    public void setRwpolicygotoprioexpression(java.lang.String[] rwpolicygotoprioexpression) {
        this.rwpolicygotoprioexpression = rwpolicygotoprioexpression;
    }


    /**
     * Gets the rwpolicybindpoint value for this Csvserver.
     * 
     * @return rwpolicybindpoint
     */
    public java.lang.String[] getRwpolicybindpoint() {
        return rwpolicybindpoint;
    }


    /**
     * Sets the rwpolicybindpoint value for this Csvserver.
     * 
     * @param rwpolicybindpoint
     */
    public void setRwpolicybindpoint(java.lang.String[] rwpolicybindpoint) {
        this.rwpolicybindpoint = rwpolicybindpoint;
    }


    /**
     * Gets the rwinvoke value for this Csvserver.
     * 
     * @return rwinvoke
     */
    public boolean[] getRwinvoke() {
        return rwinvoke;
    }


    /**
     * Sets the rwinvoke value for this Csvserver.
     * 
     * @param rwinvoke
     */
    public void setRwinvoke(boolean[] rwinvoke) {
        this.rwinvoke = rwinvoke;
    }


    /**
     * Gets the rwpolicyinvokelabeltype value for this Csvserver.
     * 
     * @return rwpolicyinvokelabeltype
     */
    public java.lang.String[] getRwpolicyinvokelabeltype() {
        return rwpolicyinvokelabeltype;
    }


    /**
     * Sets the rwpolicyinvokelabeltype value for this Csvserver.
     * 
     * @param rwpolicyinvokelabeltype
     */
    public void setRwpolicyinvokelabeltype(java.lang.String[] rwpolicyinvokelabeltype) {
        this.rwpolicyinvokelabeltype = rwpolicyinvokelabeltype;
    }


    /**
     * Gets the rwpolicyinvokelabelname value for this Csvserver.
     * 
     * @return rwpolicyinvokelabelname
     */
    public java.lang.String[] getRwpolicyinvokelabelname() {
        return rwpolicyinvokelabelname;
    }


    /**
     * Sets the rwpolicyinvokelabelname value for this Csvserver.
     * 
     * @param rwpolicyinvokelabelname
     */
    public void setRwpolicyinvokelabelname(java.lang.String[] rwpolicyinvokelabelname) {
        this.rwpolicyinvokelabelname = rwpolicyinvokelabelname;
    }


    /**
     * Gets the cachepolicyname value for this Csvserver.
     * 
     * @return cachepolicyname
     */
    public java.lang.String[] getCachepolicyname() {
        return cachepolicyname;
    }


    /**
     * Sets the cachepolicyname value for this Csvserver.
     * 
     * @param cachepolicyname
     */
    public void setCachepolicyname(java.lang.String[] cachepolicyname) {
        this.cachepolicyname = cachepolicyname;
    }


    /**
     * Gets the cachepolicypriority value for this Csvserver.
     * 
     * @return cachepolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getCachepolicypriority() {
        return cachepolicypriority;
    }


    /**
     * Sets the cachepolicypriority value for this Csvserver.
     * 
     * @param cachepolicypriority
     */
    public void setCachepolicypriority(org.apache.axis.types.UnsignedInt[] cachepolicypriority) {
        this.cachepolicypriority = cachepolicypriority;
    }


    /**
     * Gets the cachepolicygotoprioexpression value for this Csvserver.
     * 
     * @return cachepolicygotoprioexpression
     */
    public java.lang.String[] getCachepolicygotoprioexpression() {
        return cachepolicygotoprioexpression;
    }


    /**
     * Sets the cachepolicygotoprioexpression value for this Csvserver.
     * 
     * @param cachepolicygotoprioexpression
     */
    public void setCachepolicygotoprioexpression(java.lang.String[] cachepolicygotoprioexpression) {
        this.cachepolicygotoprioexpression = cachepolicygotoprioexpression;
    }


    /**
     * Gets the cachepolicybindpoint value for this Csvserver.
     * 
     * @return cachepolicybindpoint
     */
    public java.lang.String[] getCachepolicybindpoint() {
        return cachepolicybindpoint;
    }


    /**
     * Sets the cachepolicybindpoint value for this Csvserver.
     * 
     * @param cachepolicybindpoint
     */
    public void setCachepolicybindpoint(java.lang.String[] cachepolicybindpoint) {
        this.cachepolicybindpoint = cachepolicybindpoint;
    }


    /**
     * Gets the cacheinvoke value for this Csvserver.
     * 
     * @return cacheinvoke
     */
    public boolean[] getCacheinvoke() {
        return cacheinvoke;
    }


    /**
     * Sets the cacheinvoke value for this Csvserver.
     * 
     * @param cacheinvoke
     */
    public void setCacheinvoke(boolean[] cacheinvoke) {
        this.cacheinvoke = cacheinvoke;
    }


    /**
     * Gets the cachepolicyinvokelabeltype value for this Csvserver.
     * 
     * @return cachepolicyinvokelabeltype
     */
    public java.lang.String[] getCachepolicyinvokelabeltype() {
        return cachepolicyinvokelabeltype;
    }


    /**
     * Sets the cachepolicyinvokelabeltype value for this Csvserver.
     * 
     * @param cachepolicyinvokelabeltype
     */
    public void setCachepolicyinvokelabeltype(java.lang.String[] cachepolicyinvokelabeltype) {
        this.cachepolicyinvokelabeltype = cachepolicyinvokelabeltype;
    }


    /**
     * Gets the cachepolicyinvokelabelname value for this Csvserver.
     * 
     * @return cachepolicyinvokelabelname
     */
    public java.lang.String[] getCachepolicyinvokelabelname() {
        return cachepolicyinvokelabelname;
    }


    /**
     * Sets the cachepolicyinvokelabelname value for this Csvserver.
     * 
     * @param cachepolicyinvokelabelname
     */
    public void setCachepolicyinvokelabelname(java.lang.String[] cachepolicyinvokelabelname) {
        this.cachepolicyinvokelabelname = cachepolicyinvokelabelname;
    }


    /**
     * Gets the rsppolicyname value for this Csvserver.
     * 
     * @return rsppolicyname
     */
    public java.lang.String[] getRsppolicyname() {
        return rsppolicyname;
    }


    /**
     * Sets the rsppolicyname value for this Csvserver.
     * 
     * @param rsppolicyname
     */
    public void setRsppolicyname(java.lang.String[] rsppolicyname) {
        this.rsppolicyname = rsppolicyname;
    }


    /**
     * Gets the rsppolicypriority value for this Csvserver.
     * 
     * @return rsppolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getRsppolicypriority() {
        return rsppolicypriority;
    }


    /**
     * Sets the rsppolicypriority value for this Csvserver.
     * 
     * @param rsppolicypriority
     */
    public void setRsppolicypriority(org.apache.axis.types.UnsignedInt[] rsppolicypriority) {
        this.rsppolicypriority = rsppolicypriority;
    }


    /**
     * Gets the rsppolicygotoprioexpression value for this Csvserver.
     * 
     * @return rsppolicygotoprioexpression
     */
    public java.lang.String[] getRsppolicygotoprioexpression() {
        return rsppolicygotoprioexpression;
    }


    /**
     * Sets the rsppolicygotoprioexpression value for this Csvserver.
     * 
     * @param rsppolicygotoprioexpression
     */
    public void setRsppolicygotoprioexpression(java.lang.String[] rsppolicygotoprioexpression) {
        this.rsppolicygotoprioexpression = rsppolicygotoprioexpression;
    }


    /**
     * Gets the rspinvoke value for this Csvserver.
     * 
     * @return rspinvoke
     */
    public boolean[] getRspinvoke() {
        return rspinvoke;
    }


    /**
     * Sets the rspinvoke value for this Csvserver.
     * 
     * @param rspinvoke
     */
    public void setRspinvoke(boolean[] rspinvoke) {
        this.rspinvoke = rspinvoke;
    }


    /**
     * Gets the rsppolicyinvokelabeltype value for this Csvserver.
     * 
     * @return rsppolicyinvokelabeltype
     */
    public java.lang.String[] getRsppolicyinvokelabeltype() {
        return rsppolicyinvokelabeltype;
    }


    /**
     * Sets the rsppolicyinvokelabeltype value for this Csvserver.
     * 
     * @param rsppolicyinvokelabeltype
     */
    public void setRsppolicyinvokelabeltype(java.lang.String[] rsppolicyinvokelabeltype) {
        this.rsppolicyinvokelabeltype = rsppolicyinvokelabeltype;
    }


    /**
     * Gets the rsppolicyinvokelabelname value for this Csvserver.
     * 
     * @return rsppolicyinvokelabelname
     */
    public java.lang.String[] getRsppolicyinvokelabelname() {
        return rsppolicyinvokelabelname;
    }


    /**
     * Sets the rsppolicyinvokelabelname value for this Csvserver.
     * 
     * @param rsppolicyinvokelabelname
     */
    public void setRsppolicyinvokelabelname(java.lang.String[] rsppolicyinvokelabelname) {
        this.rsppolicyinvokelabelname = rsppolicyinvokelabelname;
    }


    /**
     * Gets the tmtrafficpolicyname value for this Csvserver.
     * 
     * @return tmtrafficpolicyname
     */
    public java.lang.String[] getTmtrafficpolicyname() {
        return tmtrafficpolicyname;
    }


    /**
     * Sets the tmtrafficpolicyname value for this Csvserver.
     * 
     * @param tmtrafficpolicyname
     */
    public void setTmtrafficpolicyname(java.lang.String[] tmtrafficpolicyname) {
        this.tmtrafficpolicyname = tmtrafficpolicyname;
    }


    /**
     * Gets the tmtrafficpolicypriority value for this Csvserver.
     * 
     * @return tmtrafficpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getTmtrafficpolicypriority() {
        return tmtrafficpolicypriority;
    }


    /**
     * Sets the tmtrafficpolicypriority value for this Csvserver.
     * 
     * @param tmtrafficpolicypriority
     */
    public void setTmtrafficpolicypriority(org.apache.axis.types.UnsignedInt[] tmtrafficpolicypriority) {
        this.tmtrafficpolicypriority = tmtrafficpolicypriority;
    }


    /**
     * Gets the spilloverpolicyname value for this Csvserver.
     * 
     * @return spilloverpolicyname
     */
    public java.lang.String[] getSpilloverpolicyname() {
        return spilloverpolicyname;
    }


    /**
     * Sets the spilloverpolicyname value for this Csvserver.
     * 
     * @param spilloverpolicyname
     */
    public void setSpilloverpolicyname(java.lang.String[] spilloverpolicyname) {
        this.spilloverpolicyname = spilloverpolicyname;
    }


    /**
     * Gets the spilloverpolicygotoprioexpression value for this Csvserver.
     * 
     * @return spilloverpolicygotoprioexpression
     */
    public java.lang.String[] getSpilloverpolicygotoprioexpression() {
        return spilloverpolicygotoprioexpression;
    }


    /**
     * Sets the spilloverpolicygotoprioexpression value for this Csvserver.
     * 
     * @param spilloverpolicygotoprioexpression
     */
    public void setSpilloverpolicygotoprioexpression(java.lang.String[] spilloverpolicygotoprioexpression) {
        this.spilloverpolicygotoprioexpression = spilloverpolicygotoprioexpression;
    }


    /**
     * Gets the spilloverpolicyflowtype value for this Csvserver.
     * 
     * @return spilloverpolicyflowtype
     */
    public java.lang.String[] getSpilloverpolicyflowtype() {
        return spilloverpolicyflowtype;
    }


    /**
     * Sets the spilloverpolicyflowtype value for this Csvserver.
     * 
     * @param spilloverpolicyflowtype
     */
    public void setSpilloverpolicyflowtype(java.lang.String[] spilloverpolicyflowtype) {
        this.spilloverpolicyflowtype = spilloverpolicyflowtype;
    }


    /**
     * Gets the spilloverpolicypriority value for this Csvserver.
     * 
     * @return spilloverpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getSpilloverpolicypriority() {
        return spilloverpolicypriority;
    }


    /**
     * Sets the spilloverpolicypriority value for this Csvserver.
     * 
     * @param spilloverpolicypriority
     */
    public void setSpilloverpolicypriority(org.apache.axis.types.UnsignedInt[] spilloverpolicypriority) {
        this.spilloverpolicypriority = spilloverpolicypriority;
    }


    /**
     * Gets the cmppolicyname value for this Csvserver.
     * 
     * @return cmppolicyname
     */
    public java.lang.String[] getCmppolicyname() {
        return cmppolicyname;
    }


    /**
     * Sets the cmppolicyname value for this Csvserver.
     * 
     * @param cmppolicyname
     */
    public void setCmppolicyname(java.lang.String[] cmppolicyname) {
        this.cmppolicyname = cmppolicyname;
    }


    /**
     * Gets the cmppolicypriority value for this Csvserver.
     * 
     * @return cmppolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getCmppolicypriority() {
        return cmppolicypriority;
    }


    /**
     * Sets the cmppolicypriority value for this Csvserver.
     * 
     * @param cmppolicypriority
     */
    public void setCmppolicypriority(org.apache.axis.types.UnsignedInt[] cmppolicypriority) {
        this.cmppolicypriority = cmppolicypriority;
    }


    /**
     * Gets the cmppolicyscflag value for this Csvserver.
     * 
     * @return cmppolicyscflag
     */
    public java.lang.String[] getCmppolicyscflag() {
        return cmppolicyscflag;
    }


    /**
     * Sets the cmppolicyscflag value for this Csvserver.
     * 
     * @param cmppolicyscflag
     */
    public void setCmppolicyscflag(java.lang.String[] cmppolicyscflag) {
        this.cmppolicyscflag = cmppolicyscflag;
    }


    /**
     * Gets the cmppolicygotoprioexpr value for this Csvserver.
     * 
     * @return cmppolicygotoprioexpr
     */
    public java.lang.String[] getCmppolicygotoprioexpr() {
        return cmppolicygotoprioexpr;
    }


    /**
     * Sets the cmppolicygotoprioexpr value for this Csvserver.
     * 
     * @param cmppolicygotoprioexpr
     */
    public void setCmppolicygotoprioexpr(java.lang.String[] cmppolicygotoprioexpr) {
        this.cmppolicygotoprioexpr = cmppolicygotoprioexpr;
    }


    /**
     * Gets the cmppolicybindpoint value for this Csvserver.
     * 
     * @return cmppolicybindpoint
     */
    public java.lang.String[] getCmppolicybindpoint() {
        return cmppolicybindpoint;
    }


    /**
     * Sets the cmppolicybindpoint value for this Csvserver.
     * 
     * @param cmppolicybindpoint
     */
    public void setCmppolicybindpoint(java.lang.String[] cmppolicybindpoint) {
        this.cmppolicybindpoint = cmppolicybindpoint;
    }


    /**
     * Gets the cmpinvoke value for this Csvserver.
     * 
     * @return cmpinvoke
     */
    public boolean[] getCmpinvoke() {
        return cmpinvoke;
    }


    /**
     * Sets the cmpinvoke value for this Csvserver.
     * 
     * @param cmpinvoke
     */
    public void setCmpinvoke(boolean[] cmpinvoke) {
        this.cmpinvoke = cmpinvoke;
    }


    /**
     * Gets the cmppolicyinvokelabeltype value for this Csvserver.
     * 
     * @return cmppolicyinvokelabeltype
     */
    public java.lang.String[] getCmppolicyinvokelabeltype() {
        return cmppolicyinvokelabeltype;
    }


    /**
     * Sets the cmppolicyinvokelabeltype value for this Csvserver.
     * 
     * @param cmppolicyinvokelabeltype
     */
    public void setCmppolicyinvokelabeltype(java.lang.String[] cmppolicyinvokelabeltype) {
        this.cmppolicyinvokelabeltype = cmppolicyinvokelabeltype;
    }


    /**
     * Gets the cmppolicyinvokelabelname value for this Csvserver.
     * 
     * @return cmppolicyinvokelabelname
     */
    public java.lang.String[] getCmppolicyinvokelabelname() {
        return cmppolicyinvokelabelname;
    }


    /**
     * Sets the cmppolicyinvokelabelname value for this Csvserver.
     * 
     * @param cmppolicyinvokelabelname
     */
    public void setCmppolicyinvokelabelname(java.lang.String[] cmppolicyinvokelabelname) {
        this.cmppolicyinvokelabelname = cmppolicyinvokelabelname;
    }


    /**
     * Gets the copolicyname value for this Csvserver.
     * 
     * @return copolicyname
     */
    public java.lang.String[] getCopolicyname() {
        return copolicyname;
    }


    /**
     * Sets the copolicyname value for this Csvserver.
     * 
     * @param copolicyname
     */
    public void setCopolicyname(java.lang.String[] copolicyname) {
        this.copolicyname = copolicyname;
    }


    /**
     * Gets the copolicypriority value for this Csvserver.
     * 
     * @return copolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getCopolicypriority() {
        return copolicypriority;
    }


    /**
     * Sets the copolicypriority value for this Csvserver.
     * 
     * @param copolicypriority
     */
    public void setCopolicypriority(org.apache.axis.types.UnsignedInt[] copolicypriority) {
        this.copolicypriority = copolicypriority;
    }


    /**
     * Gets the copolicynextexpr value for this Csvserver.
     * 
     * @return copolicynextexpr
     */
    public java.lang.String[] getCopolicynextexpr() {
        return copolicynextexpr;
    }


    /**
     * Sets the copolicynextexpr value for this Csvserver.
     * 
     * @param copolicynextexpr
     */
    public void setCopolicynextexpr(java.lang.String[] copolicynextexpr) {
        this.copolicynextexpr = copolicynextexpr;
    }


    /**
     * Gets the copolicybindpoint value for this Csvserver.
     * 
     * @return copolicybindpoint
     */
    public java.lang.String[] getCopolicybindpoint() {
        return copolicybindpoint;
    }


    /**
     * Sets the copolicybindpoint value for this Csvserver.
     * 
     * @param copolicybindpoint
     */
    public void setCopolicybindpoint(java.lang.String[] copolicybindpoint) {
        this.copolicybindpoint = copolicybindpoint;
    }


    /**
     * Gets the cswpolicyname value for this Csvserver.
     * 
     * @return cswpolicyname
     */
    public java.lang.String[] getCswpolicyname() {
        return cswpolicyname;
    }


    /**
     * Sets the cswpolicyname value for this Csvserver.
     * 
     * @param cswpolicyname
     */
    public void setCswpolicyname(java.lang.String[] cswpolicyname) {
        this.cswpolicyname = cswpolicyname;
    }


    /**
     * Gets the cswtargetserver value for this Csvserver.
     * 
     * @return cswtargetserver
     */
    public java.lang.String[] getCswtargetserver() {
        return cswtargetserver;
    }


    /**
     * Sets the cswtargetserver value for this Csvserver.
     * 
     * @param cswtargetserver
     */
    public void setCswtargetserver(java.lang.String[] cswtargetserver) {
        this.cswtargetserver = cswtargetserver;
    }


    /**
     * Gets the cswpriority value for this Csvserver.
     * 
     * @return cswpriority
     */
    public org.apache.axis.types.UnsignedInt[] getCswpriority() {
        return cswpriority;
    }


    /**
     * Sets the cswpriority value for this Csvserver.
     * 
     * @param cswpriority
     */
    public void setCswpriority(org.apache.axis.types.UnsignedInt[] cswpriority) {
        this.cswpriority = cswpriority;
    }


    /**
     * Gets the cswpolicygotoprioexpr value for this Csvserver.
     * 
     * @return cswpolicygotoprioexpr
     */
    public java.lang.String[] getCswpolicygotoprioexpr() {
        return cswpolicygotoprioexpr;
    }


    /**
     * Sets the cswpolicygotoprioexpr value for this Csvserver.
     * 
     * @param cswpolicygotoprioexpr
     */
    public void setCswpolicygotoprioexpr(java.lang.String[] cswpolicygotoprioexpr) {
        this.cswpolicygotoprioexpr = cswpolicygotoprioexpr;
    }


    /**
     * Gets the cswpolicybindpoint value for this Csvserver.
     * 
     * @return cswpolicybindpoint
     */
    public java.lang.String[] getCswpolicybindpoint() {
        return cswpolicybindpoint;
    }


    /**
     * Sets the cswpolicybindpoint value for this Csvserver.
     * 
     * @param cswpolicybindpoint
     */
    public void setCswpolicybindpoint(java.lang.String[] cswpolicybindpoint) {
        this.cswpolicybindpoint = cswpolicybindpoint;
    }


    /**
     * Gets the cswinvoke value for this Csvserver.
     * 
     * @return cswinvoke
     */
    public boolean[] getCswinvoke() {
        return cswinvoke;
    }


    /**
     * Sets the cswinvoke value for this Csvserver.
     * 
     * @param cswinvoke
     */
    public void setCswinvoke(boolean[] cswinvoke) {
        this.cswinvoke = cswinvoke;
    }


    /**
     * Gets the cswpolicyinvokelabeltype value for this Csvserver.
     * 
     * @return cswpolicyinvokelabeltype
     */
    public java.lang.String[] getCswpolicyinvokelabeltype() {
        return cswpolicyinvokelabeltype;
    }


    /**
     * Sets the cswpolicyinvokelabeltype value for this Csvserver.
     * 
     * @param cswpolicyinvokelabeltype
     */
    public void setCswpolicyinvokelabeltype(java.lang.String[] cswpolicyinvokelabeltype) {
        this.cswpolicyinvokelabeltype = cswpolicyinvokelabeltype;
    }


    /**
     * Gets the cswpolicyinvokelabelname value for this Csvserver.
     * 
     * @return cswpolicyinvokelabelname
     */
    public java.lang.String[] getCswpolicyinvokelabelname() {
        return cswpolicyinvokelabelname;
    }


    /**
     * Sets the cswpolicyinvokelabelname value for this Csvserver.
     * 
     * @param cswpolicyinvokelabelname
     */
    public void setCswpolicyinvokelabelname(java.lang.String[] cswpolicyinvokelabelname) {
        this.cswpolicyinvokelabelname = cswpolicyinvokelabelname;
    }


    /**
     * Gets the appflowpolicyname value for this Csvserver.
     * 
     * @return appflowpolicyname
     */
    public java.lang.String[] getAppflowpolicyname() {
        return appflowpolicyname;
    }


    /**
     * Sets the appflowpolicyname value for this Csvserver.
     * 
     * @param appflowpolicyname
     */
    public void setAppflowpolicyname(java.lang.String[] appflowpolicyname) {
        this.appflowpolicyname = appflowpolicyname;
    }


    /**
     * Gets the appflowpolicypriority value for this Csvserver.
     * 
     * @return appflowpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getAppflowpolicypriority() {
        return appflowpolicypriority;
    }


    /**
     * Sets the appflowpolicypriority value for this Csvserver.
     * 
     * @param appflowpolicypriority
     */
    public void setAppflowpolicypriority(org.apache.axis.types.UnsignedInt[] appflowpolicypriority) {
        this.appflowpolicypriority = appflowpolicypriority;
    }


    /**
     * Gets the appflowpolicygotoprioexpression value for this Csvserver.
     * 
     * @return appflowpolicygotoprioexpression
     */
    public java.lang.String[] getAppflowpolicygotoprioexpression() {
        return appflowpolicygotoprioexpression;
    }


    /**
     * Sets the appflowpolicygotoprioexpression value for this Csvserver.
     * 
     * @param appflowpolicygotoprioexpression
     */
    public void setAppflowpolicygotoprioexpression(java.lang.String[] appflowpolicygotoprioexpression) {
        this.appflowpolicygotoprioexpression = appflowpolicygotoprioexpression;
    }


    /**
     * Gets the appflowinvoke value for this Csvserver.
     * 
     * @return appflowinvoke
     */
    public boolean[] getAppflowinvoke() {
        return appflowinvoke;
    }


    /**
     * Sets the appflowinvoke value for this Csvserver.
     * 
     * @param appflowinvoke
     */
    public void setAppflowinvoke(boolean[] appflowinvoke) {
        this.appflowinvoke = appflowinvoke;
    }


    /**
     * Gets the appflowpolicyinvokelabeltype value for this Csvserver.
     * 
     * @return appflowpolicyinvokelabeltype
     */
    public java.lang.String[] getAppflowpolicyinvokelabeltype() {
        return appflowpolicyinvokelabeltype;
    }


    /**
     * Sets the appflowpolicyinvokelabeltype value for this Csvserver.
     * 
     * @param appflowpolicyinvokelabeltype
     */
    public void setAppflowpolicyinvokelabeltype(java.lang.String[] appflowpolicyinvokelabeltype) {
        this.appflowpolicyinvokelabeltype = appflowpolicyinvokelabeltype;
    }


    /**
     * Gets the appflowpolicyinvokelabelname value for this Csvserver.
     * 
     * @return appflowpolicyinvokelabelname
     */
    public java.lang.String[] getAppflowpolicyinvokelabelname() {
        return appflowpolicyinvokelabelname;
    }


    /**
     * Sets the appflowpolicyinvokelabelname value for this Csvserver.
     * 
     * @param appflowpolicyinvokelabelname
     */
    public void setAppflowpolicyinvokelabelname(java.lang.String[] appflowpolicyinvokelabelname) {
        this.appflowpolicyinvokelabelname = appflowpolicyinvokelabelname;
    }


    /**
     * Gets the defaultlb value for this Csvserver.
     * 
     * @return defaultlb
     */
    public java.lang.String[] getDefaultlb() {
        return defaultlb;
    }


    /**
     * Sets the defaultlb value for this Csvserver.
     * 
     * @param defaultlb
     */
    public void setDefaultlb(java.lang.String[] defaultlb) {
        this.defaultlb = defaultlb;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Csvserver)) return false;
        Csvserver other = (Csvserver) obj;
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
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue()))) &&
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
            ((this.sc==null && other.getSc()==null) || 
             (this.sc!=null &&
              this.sc.equals(other.getSc()))) &&
            ((this.stateupdate==null && other.getStateupdate()==null) || 
             (this.stateupdate!=null &&
              this.stateupdate.equals(other.getStateupdate()))) &&
            this.status == other.getStatus() &&
            ((this.cachetype==null && other.getCachetype()==null) || 
             (this.cachetype!=null &&
              this.cachetype.equals(other.getCachetype()))) &&
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
            ((this.casesensitive==null && other.getCasesensitive()==null) || 
             (this.casesensitive!=null &&
              this.casesensitive.equals(other.getCasesensitive()))) &&
            ((this.homepage==null && other.getHomepage()==null) || 
             (this.homepage!=null &&
              this.homepage.equals(other.getHomepage()))) &&
            ((this.dnsvservername==null && other.getDnsvservername()==null) || 
             (this.dnsvservername!=null &&
              this.dnsvservername.equals(other.getDnsvservername()))) &&
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain()))) &&
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              java.util.Arrays.equals(this.rule, other.getRule()))) &&
            ((this.policyname==null && other.getPolicyname()==null) || 
             (this.policyname!=null &&
              this.policyname.equals(other.getPolicyname()))) &&
            ((this.hits==null && other.getHits()==null) || 
             (this.hits!=null &&
              java.util.Arrays.equals(this.hits, other.getHits()))) &&
            ((this.pipolicyhits==null && other.getPipolicyhits()==null) || 
             (this.pipolicyhits!=null &&
              java.util.Arrays.equals(this.pipolicyhits, other.getPipolicyhits()))) &&
            ((this.servicename==null && other.getServicename()==null) || 
             (this.servicename!=null &&
              this.servicename.equals(other.getServicename()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.cachevserver==null && other.getCachevserver()==null) || 
             (this.cachevserver!=null &&
              this.cachevserver.equals(other.getCachevserver()))) &&
            ((this.targetvserver==null && other.getTargetvserver()==null) || 
             (this.targetvserver!=null &&
              this.targetvserver.equals(other.getTargetvserver()))) &&
            ((this.backupvserver==null && other.getBackupvserver()==null) || 
             (this.backupvserver!=null &&
              this.backupvserver.equals(other.getBackupvserver()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.clttimeout==null && other.getClttimeout()==null) || 
             (this.clttimeout!=null &&
              this.clttimeout.equals(other.getClttimeout()))) &&
            ((this.listenpolicy==null && other.getListenpolicy()==null) || 
             (this.listenpolicy!=null &&
              this.listenpolicy.equals(other.getListenpolicy()))) &&
            ((this.listenpriority==null && other.getListenpriority()==null) || 
             (this.listenpriority!=null &&
              this.listenpriority.equals(other.getListenpriority()))) &&
            ((this.somethod==null && other.getSomethod()==null) || 
             (this.somethod!=null &&
              this.somethod.equals(other.getSomethod()))) &&
            ((this.sopersistence==null && other.getSopersistence()==null) || 
             (this.sopersistence!=null &&
              this.sopersistence.equals(other.getSopersistence()))) &&
            ((this.sopersistencetimeout==null && other.getSopersistencetimeout()==null) || 
             (this.sopersistencetimeout!=null &&
              this.sopersistencetimeout.equals(other.getSopersistencetimeout()))) &&
            ((this.sothreshold==null && other.getSothreshold()==null) || 
             (this.sothreshold!=null &&
              this.sothreshold.equals(other.getSothreshold()))) &&
            ((this.sobackupaction==null && other.getSobackupaction()==null) || 
             (this.sobackupaction!=null &&
              this.sobackupaction.equals(other.getSobackupaction()))) &&
            ((this.cacheable==null && other.getCacheable()==null) || 
             (this.cacheable!=null &&
              this.cacheable.equals(other.getCacheable()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.gotopriorityexpression==null && other.getGotopriorityexpression()==null) || 
             (this.gotopriorityexpression!=null &&
              this.gotopriorityexpression.equals(other.getGotopriorityexpression()))) &&
            ((this.redirectportrewrite==null && other.getRedirectportrewrite()==null) || 
             (this.redirectportrewrite!=null &&
              this.redirectportrewrite.equals(other.getRedirectportrewrite()))) &&
            ((this.downstateflush==null && other.getDownstateflush()==null) || 
             (this.downstateflush!=null &&
              this.downstateflush.equals(other.getDownstateflush()))) &&
            ((this.disableprimaryondown==null && other.getDisableprimaryondown()==null) || 
             (this.disableprimaryondown!=null &&
              this.disableprimaryondown.equals(other.getDisableprimaryondown()))) &&
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
            ((this.gt2Gb==null && other.getGt2Gb()==null) || 
             (this.gt2Gb!=null &&
              this.gt2Gb.equals(other.getGt2Gb()))) &&
            ((this.statechangetimesec==null && other.getStatechangetimesec()==null) || 
             (this.statechangetimesec!=null &&
              this.statechangetimesec.equals(other.getStatechangetimesec()))) &&
            ((this.statechangetimemsec==null && other.getStatechangetimemsec()==null) || 
             (this.statechangetimemsec!=null &&
              this.statechangetimemsec.equals(other.getStatechangetimemsec()))) &&
            ((this.tickssincelaststatechange==null && other.getTickssincelaststatechange()==null) || 
             (this.tickssincelaststatechange!=null &&
              this.tickssincelaststatechange.equals(other.getTickssincelaststatechange()))) &&
            ((this.rtspnat==null && other.getRtspnat()==null) || 
             (this.rtspnat!=null &&
              this.rtspnat.equals(other.getRtspnat()))) &&
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
            ((this.oracleserverversion==null && other.getOracleserverversion()==null) || 
             (this.oracleserverversion!=null &&
              this.oracleserverversion.equals(other.getOracleserverversion()))) &&
            ((this.mssqlserverversion==null && other.getMssqlserverversion()==null) || 
             (this.mssqlserverversion!=null &&
              this.mssqlserverversion.equals(other.getMssqlserverversion()))) &&
            ((this.l2Conn==null && other.getL2Conn()==null) || 
             (this.l2Conn!=null &&
              this.l2Conn.equals(other.getL2Conn()))) &&
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
            ((this.icmpvsrresponse==null && other.getIcmpvsrresponse()==null) || 
             (this.icmpvsrresponse!=null &&
              this.icmpvsrresponse.equals(other.getIcmpvsrresponse()))) &&
            ((this.lbvserver==null && other.getLbvserver()==null) || 
             (this.lbvserver!=null &&
              this.lbvserver.equals(other.getLbvserver()))) &&
            ((this.targetlbvserver==null && other.getTargetlbvserver()==null) || 
             (this.targetlbvserver!=null &&
              this.targetlbvserver.equals(other.getTargetlbvserver()))) &&
            ((this.authnprofile==null && other.getAuthnprofile()==null) || 
             (this.authnprofile!=null &&
              this.authnprofile.equals(other.getAuthnprofile()))) &&
            ((this.filterpolicyname==null && other.getFilterpolicyname()==null) || 
             (this.filterpolicyname!=null &&
              java.util.Arrays.equals(this.filterpolicyname, other.getFilterpolicyname()))) &&
            ((this.filterpolicypriority==null && other.getFilterpolicypriority()==null) || 
             (this.filterpolicypriority!=null &&
              java.util.Arrays.equals(this.filterpolicypriority, other.getFilterpolicypriority()))) &&
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
            ((this.cswpolicyname==null && other.getCswpolicyname()==null) || 
             (this.cswpolicyname!=null &&
              java.util.Arrays.equals(this.cswpolicyname, other.getCswpolicyname()))) &&
            ((this.cswtargetserver==null && other.getCswtargetserver()==null) || 
             (this.cswtargetserver!=null &&
              java.util.Arrays.equals(this.cswtargetserver, other.getCswtargetserver()))) &&
            ((this.cswpriority==null && other.getCswpriority()==null) || 
             (this.cswpriority!=null &&
              java.util.Arrays.equals(this.cswpriority, other.getCswpriority()))) &&
            ((this.cswpolicygotoprioexpr==null && other.getCswpolicygotoprioexpr()==null) || 
             (this.cswpolicygotoprioexpr!=null &&
              java.util.Arrays.equals(this.cswpolicygotoprioexpr, other.getCswpolicygotoprioexpr()))) &&
            ((this.cswpolicybindpoint==null && other.getCswpolicybindpoint()==null) || 
             (this.cswpolicybindpoint!=null &&
              java.util.Arrays.equals(this.cswpolicybindpoint, other.getCswpolicybindpoint()))) &&
            ((this.cswinvoke==null && other.getCswinvoke()==null) || 
             (this.cswinvoke!=null &&
              java.util.Arrays.equals(this.cswinvoke, other.getCswinvoke()))) &&
            ((this.cswpolicyinvokelabeltype==null && other.getCswpolicyinvokelabeltype()==null) || 
             (this.cswpolicyinvokelabeltype!=null &&
              java.util.Arrays.equals(this.cswpolicyinvokelabeltype, other.getCswpolicyinvokelabeltype()))) &&
            ((this.cswpolicyinvokelabelname==null && other.getCswpolicyinvokelabelname()==null) || 
             (this.cswpolicyinvokelabelname!=null &&
              java.util.Arrays.equals(this.cswpolicyinvokelabelname, other.getCswpolicyinvokelabelname()))) &&
            ((this.appflowpolicyname==null && other.getAppflowpolicyname()==null) || 
             (this.appflowpolicyname!=null &&
              java.util.Arrays.equals(this.appflowpolicyname, other.getAppflowpolicyname()))) &&
            ((this.appflowpolicypriority==null && other.getAppflowpolicypriority()==null) || 
             (this.appflowpolicypriority!=null &&
              java.util.Arrays.equals(this.appflowpolicypriority, other.getAppflowpolicypriority()))) &&
            ((this.appflowpolicygotoprioexpression==null && other.getAppflowpolicygotoprioexpression()==null) || 
             (this.appflowpolicygotoprioexpression!=null &&
              java.util.Arrays.equals(this.appflowpolicygotoprioexpression, other.getAppflowpolicygotoprioexpression()))) &&
            ((this.appflowinvoke==null && other.getAppflowinvoke()==null) || 
             (this.appflowinvoke!=null &&
              java.util.Arrays.equals(this.appflowinvoke, other.getAppflowinvoke()))) &&
            ((this.appflowpolicyinvokelabeltype==null && other.getAppflowpolicyinvokelabeltype()==null) || 
             (this.appflowpolicyinvokelabeltype!=null &&
              java.util.Arrays.equals(this.appflowpolicyinvokelabeltype, other.getAppflowpolicyinvokelabeltype()))) &&
            ((this.appflowpolicyinvokelabelname==null && other.getAppflowpolicyinvokelabelname()==null) || 
             (this.appflowpolicyinvokelabelname!=null &&
              java.util.Arrays.equals(this.appflowpolicyinvokelabelname, other.getAppflowpolicyinvokelabelname()))) &&
            ((this.defaultlb==null && other.getDefaultlb()==null) || 
             (this.defaultlb!=null &&
              java.util.Arrays.equals(this.defaultlb, other.getDefaultlb())));
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
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
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
        if (getSc() != null) {
            _hashCode += getSc().hashCode();
        }
        if (getStateupdate() != null) {
            _hashCode += getStateupdate().hashCode();
        }
        _hashCode += getStatus();
        if (getCachetype() != null) {
            _hashCode += getCachetype().hashCode();
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
        if (getCasesensitive() != null) {
            _hashCode += getCasesensitive().hashCode();
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
        if (getRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPolicyname() != null) {
            _hashCode += getPolicyname().hashCode();
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
        if (getServicename() != null) {
            _hashCode += getServicename().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getCachevserver() != null) {
            _hashCode += getCachevserver().hashCode();
        }
        if (getTargetvserver() != null) {
            _hashCode += getTargetvserver().hashCode();
        }
        if (getBackupvserver() != null) {
            _hashCode += getBackupvserver().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getClttimeout() != null) {
            _hashCode += getClttimeout().hashCode();
        }
        if (getListenpolicy() != null) {
            _hashCode += getListenpolicy().hashCode();
        }
        if (getListenpriority() != null) {
            _hashCode += getListenpriority().hashCode();
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
        if (getSothreshold() != null) {
            _hashCode += getSothreshold().hashCode();
        }
        if (getSobackupaction() != null) {
            _hashCode += getSobackupaction().hashCode();
        }
        if (getCacheable() != null) {
            _hashCode += getCacheable().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getGotopriorityexpression() != null) {
            _hashCode += getGotopriorityexpression().hashCode();
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
        if (getGt2Gb() != null) {
            _hashCode += getGt2Gb().hashCode();
        }
        if (getStatechangetimesec() != null) {
            _hashCode += getStatechangetimesec().hashCode();
        }
        if (getStatechangetimemsec() != null) {
            _hashCode += getStatechangetimemsec().hashCode();
        }
        if (getTickssincelaststatechange() != null) {
            _hashCode += getTickssincelaststatechange().hashCode();
        }
        if (getRtspnat() != null) {
            _hashCode += getRtspnat().hashCode();
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
        if (getOracleserverversion() != null) {
            _hashCode += getOracleserverversion().hashCode();
        }
        if (getMssqlserverversion() != null) {
            _hashCode += getMssqlserverversion().hashCode();
        }
        if (getL2Conn() != null) {
            _hashCode += getL2Conn().hashCode();
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
        if (getIcmpvsrresponse() != null) {
            _hashCode += getIcmpvsrresponse().hashCode();
        }
        if (getLbvserver() != null) {
            _hashCode += getLbvserver().hashCode();
        }
        if (getTargetlbvserver() != null) {
            _hashCode += getTargetlbvserver().hashCode();
        }
        if (getAuthnprofile() != null) {
            _hashCode += getAuthnprofile().hashCode();
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
        if (getFilterpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFilterpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFilterpolicypriority(), i);
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
        if (getCswtargetserver() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCswtargetserver());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCswtargetserver(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCswpriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCswpriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCswpriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCswpolicygotoprioexpr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCswpolicygotoprioexpr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCswpolicygotoprioexpr(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCswpolicybindpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCswpolicybindpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCswpolicybindpoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCswinvoke() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCswinvoke());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCswinvoke(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCswpolicyinvokelabeltype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCswpolicyinvokelabeltype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCswpolicyinvokelabeltype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCswpolicyinvokelabelname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCswpolicyinvokelabelname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCswpolicyinvokelabelname(), i);
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
        if (getDefaultlb() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDefaultlb());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDefaultlb(), i);
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
        new org.apache.axis.description.TypeDesc(Csvserver.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "csvserver"));
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
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
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
        elemField.setFieldName("sc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateupdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stateupdate"));
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
        elemField.setFieldName("casesensitive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "casesensitive"));
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
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rule"));
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
        elemField.setFieldName("servicename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicename"));
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
        elemField.setFieldName("cachevserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachevserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetvserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetvserver"));
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
        elemField.setFieldName("cacheable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cacheable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
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
        elemField.setFieldName("gt2Gb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gt2gb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statechangetimesec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statechangetimesec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("rtspnat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rtspnat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("l2Conn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "l2conn"));
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
        elemField.setFieldName("icmpvsrresponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "icmpvsrresponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lbvserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lbvserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetlbvserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetlbvserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authnprofile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authnprofile"));
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
        elemField.setFieldName("filterpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filterpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
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
        elemField.setFieldName("cswpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cswpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cswtargetserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cswtargetserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cswpriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cswpriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cswpolicygotoprioexpr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cswpolicygotoprioexpr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cswpolicybindpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cswpolicybindpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cswinvoke");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cswinvoke"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cswpolicyinvokelabeltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cswpolicyinvokelabeltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cswpolicyinvokelabelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cswpolicyinvokelabelname"));
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
        elemField.setFieldName("defaultlb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultlb"));
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
