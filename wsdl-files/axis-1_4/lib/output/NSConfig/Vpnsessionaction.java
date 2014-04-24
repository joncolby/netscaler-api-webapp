/**
 * Vpnsessionaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Vpnsessionaction  implements java.io.Serializable {
    private java.lang.String name;

    private org.apache.axis.types.UnsignedInt[] httpport;

    private java.lang.String winsip;

    private java.lang.String dnsvservername;

    private java.lang.String splitdns;

    private org.apache.axis.types.UnsignedInt sesstimeout;

    private java.lang.String clientsecurity;

    private java.lang.String clientsecuritygroup;

    private java.lang.String clientsecuritymessage;

    private java.lang.String clientsecuritylog;

    private java.lang.String splittunnel;

    private java.lang.String locallanaccess;

    private java.lang.String rfc1918;

    private java.lang.String spoofiip;

    private java.lang.String killconnections;

    private java.lang.String transparentinterception;

    private java.lang.String windowsclienttype;

    private java.lang.String defaultauthorizationaction;

    private java.lang.String authorizationgroup;

    private org.apache.axis.types.UnsignedInt clientidletimeout;

    private org.apache.axis.types.UnsignedInt clientidletimeoutwarning;

    private java.lang.String proxy;

    private java.lang.String allprotocolproxy;

    private java.lang.String httpproxy;

    private java.lang.String ftpproxy;

    private java.lang.String socksproxy;

    private java.lang.String gopherproxy;

    private java.lang.String sslproxy;

    private java.lang.String proxyexception;

    private java.lang.String proxylocalbypass;

    private java.lang.String clientcleanupprompt;

    private java.lang.String forcecleanup;

    private java.lang.String clientoptions;

    private java.lang.String clientconfiguration;

    private java.lang.String sso;

    private java.lang.String ssocredential;

    private java.lang.String windowsautologon;

    private java.lang.String usemip;

    private java.lang.String useiip;

    private java.lang.String clientdebug;

    private java.lang.String loginscript;

    private java.lang.String logoutscript;

    private java.lang.String homepage;

    private java.lang.String icaproxy;

    private java.lang.String wihome;

    private java.lang.String citrixreceiverhome;

    private java.lang.String wiportalmode;

    private java.lang.String clientchoices;

    private java.lang.String epaclienttype;

    private java.lang.String iipdnssuffix;

    private org.apache.axis.types.UnsignedInt forcedtimeout;

    private org.apache.axis.types.UnsignedInt forcedtimeoutwarning;

    private java.lang.String ntdomain;

    private java.lang.String clientlessvpnmode;

    private java.lang.String clientlessmodeurlencoding;

    private java.lang.String clientlesspersistentcookie;

    private java.lang.String emailhome;

    private java.lang.String allowedlogingroups;

    private java.lang.String securebrowse;

    private java.lang.String storefronturl;

    private java.lang.String kcdaccount;

    private java.lang.String builtin;

    public Vpnsessionaction() {
    }

    public Vpnsessionaction(
           java.lang.String name,
           org.apache.axis.types.UnsignedInt[] httpport,
           java.lang.String winsip,
           java.lang.String dnsvservername,
           java.lang.String splitdns,
           org.apache.axis.types.UnsignedInt sesstimeout,
           java.lang.String clientsecurity,
           java.lang.String clientsecuritygroup,
           java.lang.String clientsecuritymessage,
           java.lang.String clientsecuritylog,
           java.lang.String splittunnel,
           java.lang.String locallanaccess,
           java.lang.String rfc1918,
           java.lang.String spoofiip,
           java.lang.String killconnections,
           java.lang.String transparentinterception,
           java.lang.String windowsclienttype,
           java.lang.String defaultauthorizationaction,
           java.lang.String authorizationgroup,
           org.apache.axis.types.UnsignedInt clientidletimeout,
           org.apache.axis.types.UnsignedInt clientidletimeoutwarning,
           java.lang.String proxy,
           java.lang.String allprotocolproxy,
           java.lang.String httpproxy,
           java.lang.String ftpproxy,
           java.lang.String socksproxy,
           java.lang.String gopherproxy,
           java.lang.String sslproxy,
           java.lang.String proxyexception,
           java.lang.String proxylocalbypass,
           java.lang.String clientcleanupprompt,
           java.lang.String forcecleanup,
           java.lang.String clientoptions,
           java.lang.String clientconfiguration,
           java.lang.String sso,
           java.lang.String ssocredential,
           java.lang.String windowsautologon,
           java.lang.String usemip,
           java.lang.String useiip,
           java.lang.String clientdebug,
           java.lang.String loginscript,
           java.lang.String logoutscript,
           java.lang.String homepage,
           java.lang.String icaproxy,
           java.lang.String wihome,
           java.lang.String citrixreceiverhome,
           java.lang.String wiportalmode,
           java.lang.String clientchoices,
           java.lang.String epaclienttype,
           java.lang.String iipdnssuffix,
           org.apache.axis.types.UnsignedInt forcedtimeout,
           org.apache.axis.types.UnsignedInt forcedtimeoutwarning,
           java.lang.String ntdomain,
           java.lang.String clientlessvpnmode,
           java.lang.String clientlessmodeurlencoding,
           java.lang.String clientlesspersistentcookie,
           java.lang.String emailhome,
           java.lang.String allowedlogingroups,
           java.lang.String securebrowse,
           java.lang.String storefronturl,
           java.lang.String kcdaccount,
           java.lang.String builtin) {
           this.name = name;
           this.httpport = httpport;
           this.winsip = winsip;
           this.dnsvservername = dnsvservername;
           this.splitdns = splitdns;
           this.sesstimeout = sesstimeout;
           this.clientsecurity = clientsecurity;
           this.clientsecuritygroup = clientsecuritygroup;
           this.clientsecuritymessage = clientsecuritymessage;
           this.clientsecuritylog = clientsecuritylog;
           this.splittunnel = splittunnel;
           this.locallanaccess = locallanaccess;
           this.rfc1918 = rfc1918;
           this.spoofiip = spoofiip;
           this.killconnections = killconnections;
           this.transparentinterception = transparentinterception;
           this.windowsclienttype = windowsclienttype;
           this.defaultauthorizationaction = defaultauthorizationaction;
           this.authorizationgroup = authorizationgroup;
           this.clientidletimeout = clientidletimeout;
           this.clientidletimeoutwarning = clientidletimeoutwarning;
           this.proxy = proxy;
           this.allprotocolproxy = allprotocolproxy;
           this.httpproxy = httpproxy;
           this.ftpproxy = ftpproxy;
           this.socksproxy = socksproxy;
           this.gopherproxy = gopherproxy;
           this.sslproxy = sslproxy;
           this.proxyexception = proxyexception;
           this.proxylocalbypass = proxylocalbypass;
           this.clientcleanupprompt = clientcleanupprompt;
           this.forcecleanup = forcecleanup;
           this.clientoptions = clientoptions;
           this.clientconfiguration = clientconfiguration;
           this.sso = sso;
           this.ssocredential = ssocredential;
           this.windowsautologon = windowsautologon;
           this.usemip = usemip;
           this.useiip = useiip;
           this.clientdebug = clientdebug;
           this.loginscript = loginscript;
           this.logoutscript = logoutscript;
           this.homepage = homepage;
           this.icaproxy = icaproxy;
           this.wihome = wihome;
           this.citrixreceiverhome = citrixreceiverhome;
           this.wiportalmode = wiportalmode;
           this.clientchoices = clientchoices;
           this.epaclienttype = epaclienttype;
           this.iipdnssuffix = iipdnssuffix;
           this.forcedtimeout = forcedtimeout;
           this.forcedtimeoutwarning = forcedtimeoutwarning;
           this.ntdomain = ntdomain;
           this.clientlessvpnmode = clientlessvpnmode;
           this.clientlessmodeurlencoding = clientlessmodeurlencoding;
           this.clientlesspersistentcookie = clientlesspersistentcookie;
           this.emailhome = emailhome;
           this.allowedlogingroups = allowedlogingroups;
           this.securebrowse = securebrowse;
           this.storefronturl = storefronturl;
           this.kcdaccount = kcdaccount;
           this.builtin = builtin;
    }


    /**
     * Gets the name value for this Vpnsessionaction.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Vpnsessionaction.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the httpport value for this Vpnsessionaction.
     * 
     * @return httpport
     */
    public org.apache.axis.types.UnsignedInt[] getHttpport() {
        return httpport;
    }


    /**
     * Sets the httpport value for this Vpnsessionaction.
     * 
     * @param httpport
     */
    public void setHttpport(org.apache.axis.types.UnsignedInt[] httpport) {
        this.httpport = httpport;
    }


    /**
     * Gets the winsip value for this Vpnsessionaction.
     * 
     * @return winsip
     */
    public java.lang.String getWinsip() {
        return winsip;
    }


    /**
     * Sets the winsip value for this Vpnsessionaction.
     * 
     * @param winsip
     */
    public void setWinsip(java.lang.String winsip) {
        this.winsip = winsip;
    }


    /**
     * Gets the dnsvservername value for this Vpnsessionaction.
     * 
     * @return dnsvservername
     */
    public java.lang.String getDnsvservername() {
        return dnsvservername;
    }


    /**
     * Sets the dnsvservername value for this Vpnsessionaction.
     * 
     * @param dnsvservername
     */
    public void setDnsvservername(java.lang.String dnsvservername) {
        this.dnsvservername = dnsvservername;
    }


    /**
     * Gets the splitdns value for this Vpnsessionaction.
     * 
     * @return splitdns
     */
    public java.lang.String getSplitdns() {
        return splitdns;
    }


    /**
     * Sets the splitdns value for this Vpnsessionaction.
     * 
     * @param splitdns
     */
    public void setSplitdns(java.lang.String splitdns) {
        this.splitdns = splitdns;
    }


    /**
     * Gets the sesstimeout value for this Vpnsessionaction.
     * 
     * @return sesstimeout
     */
    public org.apache.axis.types.UnsignedInt getSesstimeout() {
        return sesstimeout;
    }


    /**
     * Sets the sesstimeout value for this Vpnsessionaction.
     * 
     * @param sesstimeout
     */
    public void setSesstimeout(org.apache.axis.types.UnsignedInt sesstimeout) {
        this.sesstimeout = sesstimeout;
    }


    /**
     * Gets the clientsecurity value for this Vpnsessionaction.
     * 
     * @return clientsecurity
     */
    public java.lang.String getClientsecurity() {
        return clientsecurity;
    }


    /**
     * Sets the clientsecurity value for this Vpnsessionaction.
     * 
     * @param clientsecurity
     */
    public void setClientsecurity(java.lang.String clientsecurity) {
        this.clientsecurity = clientsecurity;
    }


    /**
     * Gets the clientsecuritygroup value for this Vpnsessionaction.
     * 
     * @return clientsecuritygroup
     */
    public java.lang.String getClientsecuritygroup() {
        return clientsecuritygroup;
    }


    /**
     * Sets the clientsecuritygroup value for this Vpnsessionaction.
     * 
     * @param clientsecuritygroup
     */
    public void setClientsecuritygroup(java.lang.String clientsecuritygroup) {
        this.clientsecuritygroup = clientsecuritygroup;
    }


    /**
     * Gets the clientsecuritymessage value for this Vpnsessionaction.
     * 
     * @return clientsecuritymessage
     */
    public java.lang.String getClientsecuritymessage() {
        return clientsecuritymessage;
    }


    /**
     * Sets the clientsecuritymessage value for this Vpnsessionaction.
     * 
     * @param clientsecuritymessage
     */
    public void setClientsecuritymessage(java.lang.String clientsecuritymessage) {
        this.clientsecuritymessage = clientsecuritymessage;
    }


    /**
     * Gets the clientsecuritylog value for this Vpnsessionaction.
     * 
     * @return clientsecuritylog
     */
    public java.lang.String getClientsecuritylog() {
        return clientsecuritylog;
    }


    /**
     * Sets the clientsecuritylog value for this Vpnsessionaction.
     * 
     * @param clientsecuritylog
     */
    public void setClientsecuritylog(java.lang.String clientsecuritylog) {
        this.clientsecuritylog = clientsecuritylog;
    }


    /**
     * Gets the splittunnel value for this Vpnsessionaction.
     * 
     * @return splittunnel
     */
    public java.lang.String getSplittunnel() {
        return splittunnel;
    }


    /**
     * Sets the splittunnel value for this Vpnsessionaction.
     * 
     * @param splittunnel
     */
    public void setSplittunnel(java.lang.String splittunnel) {
        this.splittunnel = splittunnel;
    }


    /**
     * Gets the locallanaccess value for this Vpnsessionaction.
     * 
     * @return locallanaccess
     */
    public java.lang.String getLocallanaccess() {
        return locallanaccess;
    }


    /**
     * Sets the locallanaccess value for this Vpnsessionaction.
     * 
     * @param locallanaccess
     */
    public void setLocallanaccess(java.lang.String locallanaccess) {
        this.locallanaccess = locallanaccess;
    }


    /**
     * Gets the rfc1918 value for this Vpnsessionaction.
     * 
     * @return rfc1918
     */
    public java.lang.String getRfc1918() {
        return rfc1918;
    }


    /**
     * Sets the rfc1918 value for this Vpnsessionaction.
     * 
     * @param rfc1918
     */
    public void setRfc1918(java.lang.String rfc1918) {
        this.rfc1918 = rfc1918;
    }


    /**
     * Gets the spoofiip value for this Vpnsessionaction.
     * 
     * @return spoofiip
     */
    public java.lang.String getSpoofiip() {
        return spoofiip;
    }


    /**
     * Sets the spoofiip value for this Vpnsessionaction.
     * 
     * @param spoofiip
     */
    public void setSpoofiip(java.lang.String spoofiip) {
        this.spoofiip = spoofiip;
    }


    /**
     * Gets the killconnections value for this Vpnsessionaction.
     * 
     * @return killconnections
     */
    public java.lang.String getKillconnections() {
        return killconnections;
    }


    /**
     * Sets the killconnections value for this Vpnsessionaction.
     * 
     * @param killconnections
     */
    public void setKillconnections(java.lang.String killconnections) {
        this.killconnections = killconnections;
    }


    /**
     * Gets the transparentinterception value for this Vpnsessionaction.
     * 
     * @return transparentinterception
     */
    public java.lang.String getTransparentinterception() {
        return transparentinterception;
    }


    /**
     * Sets the transparentinterception value for this Vpnsessionaction.
     * 
     * @param transparentinterception
     */
    public void setTransparentinterception(java.lang.String transparentinterception) {
        this.transparentinterception = transparentinterception;
    }


    /**
     * Gets the windowsclienttype value for this Vpnsessionaction.
     * 
     * @return windowsclienttype
     */
    public java.lang.String getWindowsclienttype() {
        return windowsclienttype;
    }


    /**
     * Sets the windowsclienttype value for this Vpnsessionaction.
     * 
     * @param windowsclienttype
     */
    public void setWindowsclienttype(java.lang.String windowsclienttype) {
        this.windowsclienttype = windowsclienttype;
    }


    /**
     * Gets the defaultauthorizationaction value for this Vpnsessionaction.
     * 
     * @return defaultauthorizationaction
     */
    public java.lang.String getDefaultauthorizationaction() {
        return defaultauthorizationaction;
    }


    /**
     * Sets the defaultauthorizationaction value for this Vpnsessionaction.
     * 
     * @param defaultauthorizationaction
     */
    public void setDefaultauthorizationaction(java.lang.String defaultauthorizationaction) {
        this.defaultauthorizationaction = defaultauthorizationaction;
    }


    /**
     * Gets the authorizationgroup value for this Vpnsessionaction.
     * 
     * @return authorizationgroup
     */
    public java.lang.String getAuthorizationgroup() {
        return authorizationgroup;
    }


    /**
     * Sets the authorizationgroup value for this Vpnsessionaction.
     * 
     * @param authorizationgroup
     */
    public void setAuthorizationgroup(java.lang.String authorizationgroup) {
        this.authorizationgroup = authorizationgroup;
    }


    /**
     * Gets the clientidletimeout value for this Vpnsessionaction.
     * 
     * @return clientidletimeout
     */
    public org.apache.axis.types.UnsignedInt getClientidletimeout() {
        return clientidletimeout;
    }


    /**
     * Sets the clientidletimeout value for this Vpnsessionaction.
     * 
     * @param clientidletimeout
     */
    public void setClientidletimeout(org.apache.axis.types.UnsignedInt clientidletimeout) {
        this.clientidletimeout = clientidletimeout;
    }


    /**
     * Gets the clientidletimeoutwarning value for this Vpnsessionaction.
     * 
     * @return clientidletimeoutwarning
     */
    public org.apache.axis.types.UnsignedInt getClientidletimeoutwarning() {
        return clientidletimeoutwarning;
    }


    /**
     * Sets the clientidletimeoutwarning value for this Vpnsessionaction.
     * 
     * @param clientidletimeoutwarning
     */
    public void setClientidletimeoutwarning(org.apache.axis.types.UnsignedInt clientidletimeoutwarning) {
        this.clientidletimeoutwarning = clientidletimeoutwarning;
    }


    /**
     * Gets the proxy value for this Vpnsessionaction.
     * 
     * @return proxy
     */
    public java.lang.String getProxy() {
        return proxy;
    }


    /**
     * Sets the proxy value for this Vpnsessionaction.
     * 
     * @param proxy
     */
    public void setProxy(java.lang.String proxy) {
        this.proxy = proxy;
    }


    /**
     * Gets the allprotocolproxy value for this Vpnsessionaction.
     * 
     * @return allprotocolproxy
     */
    public java.lang.String getAllprotocolproxy() {
        return allprotocolproxy;
    }


    /**
     * Sets the allprotocolproxy value for this Vpnsessionaction.
     * 
     * @param allprotocolproxy
     */
    public void setAllprotocolproxy(java.lang.String allprotocolproxy) {
        this.allprotocolproxy = allprotocolproxy;
    }


    /**
     * Gets the httpproxy value for this Vpnsessionaction.
     * 
     * @return httpproxy
     */
    public java.lang.String getHttpproxy() {
        return httpproxy;
    }


    /**
     * Sets the httpproxy value for this Vpnsessionaction.
     * 
     * @param httpproxy
     */
    public void setHttpproxy(java.lang.String httpproxy) {
        this.httpproxy = httpproxy;
    }


    /**
     * Gets the ftpproxy value for this Vpnsessionaction.
     * 
     * @return ftpproxy
     */
    public java.lang.String getFtpproxy() {
        return ftpproxy;
    }


    /**
     * Sets the ftpproxy value for this Vpnsessionaction.
     * 
     * @param ftpproxy
     */
    public void setFtpproxy(java.lang.String ftpproxy) {
        this.ftpproxy = ftpproxy;
    }


    /**
     * Gets the socksproxy value for this Vpnsessionaction.
     * 
     * @return socksproxy
     */
    public java.lang.String getSocksproxy() {
        return socksproxy;
    }


    /**
     * Sets the socksproxy value for this Vpnsessionaction.
     * 
     * @param socksproxy
     */
    public void setSocksproxy(java.lang.String socksproxy) {
        this.socksproxy = socksproxy;
    }


    /**
     * Gets the gopherproxy value for this Vpnsessionaction.
     * 
     * @return gopherproxy
     */
    public java.lang.String getGopherproxy() {
        return gopherproxy;
    }


    /**
     * Sets the gopherproxy value for this Vpnsessionaction.
     * 
     * @param gopherproxy
     */
    public void setGopherproxy(java.lang.String gopherproxy) {
        this.gopherproxy = gopherproxy;
    }


    /**
     * Gets the sslproxy value for this Vpnsessionaction.
     * 
     * @return sslproxy
     */
    public java.lang.String getSslproxy() {
        return sslproxy;
    }


    /**
     * Sets the sslproxy value for this Vpnsessionaction.
     * 
     * @param sslproxy
     */
    public void setSslproxy(java.lang.String sslproxy) {
        this.sslproxy = sslproxy;
    }


    /**
     * Gets the proxyexception value for this Vpnsessionaction.
     * 
     * @return proxyexception
     */
    public java.lang.String getProxyexception() {
        return proxyexception;
    }


    /**
     * Sets the proxyexception value for this Vpnsessionaction.
     * 
     * @param proxyexception
     */
    public void setProxyexception(java.lang.String proxyexception) {
        this.proxyexception = proxyexception;
    }


    /**
     * Gets the proxylocalbypass value for this Vpnsessionaction.
     * 
     * @return proxylocalbypass
     */
    public java.lang.String getProxylocalbypass() {
        return proxylocalbypass;
    }


    /**
     * Sets the proxylocalbypass value for this Vpnsessionaction.
     * 
     * @param proxylocalbypass
     */
    public void setProxylocalbypass(java.lang.String proxylocalbypass) {
        this.proxylocalbypass = proxylocalbypass;
    }


    /**
     * Gets the clientcleanupprompt value for this Vpnsessionaction.
     * 
     * @return clientcleanupprompt
     */
    public java.lang.String getClientcleanupprompt() {
        return clientcleanupprompt;
    }


    /**
     * Sets the clientcleanupprompt value for this Vpnsessionaction.
     * 
     * @param clientcleanupprompt
     */
    public void setClientcleanupprompt(java.lang.String clientcleanupprompt) {
        this.clientcleanupprompt = clientcleanupprompt;
    }


    /**
     * Gets the forcecleanup value for this Vpnsessionaction.
     * 
     * @return forcecleanup
     */
    public java.lang.String getForcecleanup() {
        return forcecleanup;
    }


    /**
     * Sets the forcecleanup value for this Vpnsessionaction.
     * 
     * @param forcecleanup
     */
    public void setForcecleanup(java.lang.String forcecleanup) {
        this.forcecleanup = forcecleanup;
    }


    /**
     * Gets the clientoptions value for this Vpnsessionaction.
     * 
     * @return clientoptions
     */
    public java.lang.String getClientoptions() {
        return clientoptions;
    }


    /**
     * Sets the clientoptions value for this Vpnsessionaction.
     * 
     * @param clientoptions
     */
    public void setClientoptions(java.lang.String clientoptions) {
        this.clientoptions = clientoptions;
    }


    /**
     * Gets the clientconfiguration value for this Vpnsessionaction.
     * 
     * @return clientconfiguration
     */
    public java.lang.String getClientconfiguration() {
        return clientconfiguration;
    }


    /**
     * Sets the clientconfiguration value for this Vpnsessionaction.
     * 
     * @param clientconfiguration
     */
    public void setClientconfiguration(java.lang.String clientconfiguration) {
        this.clientconfiguration = clientconfiguration;
    }


    /**
     * Gets the sso value for this Vpnsessionaction.
     * 
     * @return sso
     */
    public java.lang.String getSso() {
        return sso;
    }


    /**
     * Sets the sso value for this Vpnsessionaction.
     * 
     * @param sso
     */
    public void setSso(java.lang.String sso) {
        this.sso = sso;
    }


    /**
     * Gets the ssocredential value for this Vpnsessionaction.
     * 
     * @return ssocredential
     */
    public java.lang.String getSsocredential() {
        return ssocredential;
    }


    /**
     * Sets the ssocredential value for this Vpnsessionaction.
     * 
     * @param ssocredential
     */
    public void setSsocredential(java.lang.String ssocredential) {
        this.ssocredential = ssocredential;
    }


    /**
     * Gets the windowsautologon value for this Vpnsessionaction.
     * 
     * @return windowsautologon
     */
    public java.lang.String getWindowsautologon() {
        return windowsautologon;
    }


    /**
     * Sets the windowsautologon value for this Vpnsessionaction.
     * 
     * @param windowsautologon
     */
    public void setWindowsautologon(java.lang.String windowsautologon) {
        this.windowsautologon = windowsautologon;
    }


    /**
     * Gets the usemip value for this Vpnsessionaction.
     * 
     * @return usemip
     */
    public java.lang.String getUsemip() {
        return usemip;
    }


    /**
     * Sets the usemip value for this Vpnsessionaction.
     * 
     * @param usemip
     */
    public void setUsemip(java.lang.String usemip) {
        this.usemip = usemip;
    }


    /**
     * Gets the useiip value for this Vpnsessionaction.
     * 
     * @return useiip
     */
    public java.lang.String getUseiip() {
        return useiip;
    }


    /**
     * Sets the useiip value for this Vpnsessionaction.
     * 
     * @param useiip
     */
    public void setUseiip(java.lang.String useiip) {
        this.useiip = useiip;
    }


    /**
     * Gets the clientdebug value for this Vpnsessionaction.
     * 
     * @return clientdebug
     */
    public java.lang.String getClientdebug() {
        return clientdebug;
    }


    /**
     * Sets the clientdebug value for this Vpnsessionaction.
     * 
     * @param clientdebug
     */
    public void setClientdebug(java.lang.String clientdebug) {
        this.clientdebug = clientdebug;
    }


    /**
     * Gets the loginscript value for this Vpnsessionaction.
     * 
     * @return loginscript
     */
    public java.lang.String getLoginscript() {
        return loginscript;
    }


    /**
     * Sets the loginscript value for this Vpnsessionaction.
     * 
     * @param loginscript
     */
    public void setLoginscript(java.lang.String loginscript) {
        this.loginscript = loginscript;
    }


    /**
     * Gets the logoutscript value for this Vpnsessionaction.
     * 
     * @return logoutscript
     */
    public java.lang.String getLogoutscript() {
        return logoutscript;
    }


    /**
     * Sets the logoutscript value for this Vpnsessionaction.
     * 
     * @param logoutscript
     */
    public void setLogoutscript(java.lang.String logoutscript) {
        this.logoutscript = logoutscript;
    }


    /**
     * Gets the homepage value for this Vpnsessionaction.
     * 
     * @return homepage
     */
    public java.lang.String getHomepage() {
        return homepage;
    }


    /**
     * Sets the homepage value for this Vpnsessionaction.
     * 
     * @param homepage
     */
    public void setHomepage(java.lang.String homepage) {
        this.homepage = homepage;
    }


    /**
     * Gets the icaproxy value for this Vpnsessionaction.
     * 
     * @return icaproxy
     */
    public java.lang.String getIcaproxy() {
        return icaproxy;
    }


    /**
     * Sets the icaproxy value for this Vpnsessionaction.
     * 
     * @param icaproxy
     */
    public void setIcaproxy(java.lang.String icaproxy) {
        this.icaproxy = icaproxy;
    }


    /**
     * Gets the wihome value for this Vpnsessionaction.
     * 
     * @return wihome
     */
    public java.lang.String getWihome() {
        return wihome;
    }


    /**
     * Sets the wihome value for this Vpnsessionaction.
     * 
     * @param wihome
     */
    public void setWihome(java.lang.String wihome) {
        this.wihome = wihome;
    }


    /**
     * Gets the citrixreceiverhome value for this Vpnsessionaction.
     * 
     * @return citrixreceiverhome
     */
    public java.lang.String getCitrixreceiverhome() {
        return citrixreceiverhome;
    }


    /**
     * Sets the citrixreceiverhome value for this Vpnsessionaction.
     * 
     * @param citrixreceiverhome
     */
    public void setCitrixreceiverhome(java.lang.String citrixreceiverhome) {
        this.citrixreceiverhome = citrixreceiverhome;
    }


    /**
     * Gets the wiportalmode value for this Vpnsessionaction.
     * 
     * @return wiportalmode
     */
    public java.lang.String getWiportalmode() {
        return wiportalmode;
    }


    /**
     * Sets the wiportalmode value for this Vpnsessionaction.
     * 
     * @param wiportalmode
     */
    public void setWiportalmode(java.lang.String wiportalmode) {
        this.wiportalmode = wiportalmode;
    }


    /**
     * Gets the clientchoices value for this Vpnsessionaction.
     * 
     * @return clientchoices
     */
    public java.lang.String getClientchoices() {
        return clientchoices;
    }


    /**
     * Sets the clientchoices value for this Vpnsessionaction.
     * 
     * @param clientchoices
     */
    public void setClientchoices(java.lang.String clientchoices) {
        this.clientchoices = clientchoices;
    }


    /**
     * Gets the epaclienttype value for this Vpnsessionaction.
     * 
     * @return epaclienttype
     */
    public java.lang.String getEpaclienttype() {
        return epaclienttype;
    }


    /**
     * Sets the epaclienttype value for this Vpnsessionaction.
     * 
     * @param epaclienttype
     */
    public void setEpaclienttype(java.lang.String epaclienttype) {
        this.epaclienttype = epaclienttype;
    }


    /**
     * Gets the iipdnssuffix value for this Vpnsessionaction.
     * 
     * @return iipdnssuffix
     */
    public java.lang.String getIipdnssuffix() {
        return iipdnssuffix;
    }


    /**
     * Sets the iipdnssuffix value for this Vpnsessionaction.
     * 
     * @param iipdnssuffix
     */
    public void setIipdnssuffix(java.lang.String iipdnssuffix) {
        this.iipdnssuffix = iipdnssuffix;
    }


    /**
     * Gets the forcedtimeout value for this Vpnsessionaction.
     * 
     * @return forcedtimeout
     */
    public org.apache.axis.types.UnsignedInt getForcedtimeout() {
        return forcedtimeout;
    }


    /**
     * Sets the forcedtimeout value for this Vpnsessionaction.
     * 
     * @param forcedtimeout
     */
    public void setForcedtimeout(org.apache.axis.types.UnsignedInt forcedtimeout) {
        this.forcedtimeout = forcedtimeout;
    }


    /**
     * Gets the forcedtimeoutwarning value for this Vpnsessionaction.
     * 
     * @return forcedtimeoutwarning
     */
    public org.apache.axis.types.UnsignedInt getForcedtimeoutwarning() {
        return forcedtimeoutwarning;
    }


    /**
     * Sets the forcedtimeoutwarning value for this Vpnsessionaction.
     * 
     * @param forcedtimeoutwarning
     */
    public void setForcedtimeoutwarning(org.apache.axis.types.UnsignedInt forcedtimeoutwarning) {
        this.forcedtimeoutwarning = forcedtimeoutwarning;
    }


    /**
     * Gets the ntdomain value for this Vpnsessionaction.
     * 
     * @return ntdomain
     */
    public java.lang.String getNtdomain() {
        return ntdomain;
    }


    /**
     * Sets the ntdomain value for this Vpnsessionaction.
     * 
     * @param ntdomain
     */
    public void setNtdomain(java.lang.String ntdomain) {
        this.ntdomain = ntdomain;
    }


    /**
     * Gets the clientlessvpnmode value for this Vpnsessionaction.
     * 
     * @return clientlessvpnmode
     */
    public java.lang.String getClientlessvpnmode() {
        return clientlessvpnmode;
    }


    /**
     * Sets the clientlessvpnmode value for this Vpnsessionaction.
     * 
     * @param clientlessvpnmode
     */
    public void setClientlessvpnmode(java.lang.String clientlessvpnmode) {
        this.clientlessvpnmode = clientlessvpnmode;
    }


    /**
     * Gets the clientlessmodeurlencoding value for this Vpnsessionaction.
     * 
     * @return clientlessmodeurlencoding
     */
    public java.lang.String getClientlessmodeurlencoding() {
        return clientlessmodeurlencoding;
    }


    /**
     * Sets the clientlessmodeurlencoding value for this Vpnsessionaction.
     * 
     * @param clientlessmodeurlencoding
     */
    public void setClientlessmodeurlencoding(java.lang.String clientlessmodeurlencoding) {
        this.clientlessmodeurlencoding = clientlessmodeurlencoding;
    }


    /**
     * Gets the clientlesspersistentcookie value for this Vpnsessionaction.
     * 
     * @return clientlesspersistentcookie
     */
    public java.lang.String getClientlesspersistentcookie() {
        return clientlesspersistentcookie;
    }


    /**
     * Sets the clientlesspersistentcookie value for this Vpnsessionaction.
     * 
     * @param clientlesspersistentcookie
     */
    public void setClientlesspersistentcookie(java.lang.String clientlesspersistentcookie) {
        this.clientlesspersistentcookie = clientlesspersistentcookie;
    }


    /**
     * Gets the emailhome value for this Vpnsessionaction.
     * 
     * @return emailhome
     */
    public java.lang.String getEmailhome() {
        return emailhome;
    }


    /**
     * Sets the emailhome value for this Vpnsessionaction.
     * 
     * @param emailhome
     */
    public void setEmailhome(java.lang.String emailhome) {
        this.emailhome = emailhome;
    }


    /**
     * Gets the allowedlogingroups value for this Vpnsessionaction.
     * 
     * @return allowedlogingroups
     */
    public java.lang.String getAllowedlogingroups() {
        return allowedlogingroups;
    }


    /**
     * Sets the allowedlogingroups value for this Vpnsessionaction.
     * 
     * @param allowedlogingroups
     */
    public void setAllowedlogingroups(java.lang.String allowedlogingroups) {
        this.allowedlogingroups = allowedlogingroups;
    }


    /**
     * Gets the securebrowse value for this Vpnsessionaction.
     * 
     * @return securebrowse
     */
    public java.lang.String getSecurebrowse() {
        return securebrowse;
    }


    /**
     * Sets the securebrowse value for this Vpnsessionaction.
     * 
     * @param securebrowse
     */
    public void setSecurebrowse(java.lang.String securebrowse) {
        this.securebrowse = securebrowse;
    }


    /**
     * Gets the storefronturl value for this Vpnsessionaction.
     * 
     * @return storefronturl
     */
    public java.lang.String getStorefronturl() {
        return storefronturl;
    }


    /**
     * Sets the storefronturl value for this Vpnsessionaction.
     * 
     * @param storefronturl
     */
    public void setStorefronturl(java.lang.String storefronturl) {
        this.storefronturl = storefronturl;
    }


    /**
     * Gets the kcdaccount value for this Vpnsessionaction.
     * 
     * @return kcdaccount
     */
    public java.lang.String getKcdaccount() {
        return kcdaccount;
    }


    /**
     * Sets the kcdaccount value for this Vpnsessionaction.
     * 
     * @param kcdaccount
     */
    public void setKcdaccount(java.lang.String kcdaccount) {
        this.kcdaccount = kcdaccount;
    }


    /**
     * Gets the builtin value for this Vpnsessionaction.
     * 
     * @return builtin
     */
    public java.lang.String getBuiltin() {
        return builtin;
    }


    /**
     * Sets the builtin value for this Vpnsessionaction.
     * 
     * @param builtin
     */
    public void setBuiltin(java.lang.String builtin) {
        this.builtin = builtin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Vpnsessionaction)) return false;
        Vpnsessionaction other = (Vpnsessionaction) obj;
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
            ((this.httpport==null && other.getHttpport()==null) || 
             (this.httpport!=null &&
              java.util.Arrays.equals(this.httpport, other.getHttpport()))) &&
            ((this.winsip==null && other.getWinsip()==null) || 
             (this.winsip!=null &&
              this.winsip.equals(other.getWinsip()))) &&
            ((this.dnsvservername==null && other.getDnsvservername()==null) || 
             (this.dnsvservername!=null &&
              this.dnsvservername.equals(other.getDnsvservername()))) &&
            ((this.splitdns==null && other.getSplitdns()==null) || 
             (this.splitdns!=null &&
              this.splitdns.equals(other.getSplitdns()))) &&
            ((this.sesstimeout==null && other.getSesstimeout()==null) || 
             (this.sesstimeout!=null &&
              this.sesstimeout.equals(other.getSesstimeout()))) &&
            ((this.clientsecurity==null && other.getClientsecurity()==null) || 
             (this.clientsecurity!=null &&
              this.clientsecurity.equals(other.getClientsecurity()))) &&
            ((this.clientsecuritygroup==null && other.getClientsecuritygroup()==null) || 
             (this.clientsecuritygroup!=null &&
              this.clientsecuritygroup.equals(other.getClientsecuritygroup()))) &&
            ((this.clientsecuritymessage==null && other.getClientsecuritymessage()==null) || 
             (this.clientsecuritymessage!=null &&
              this.clientsecuritymessage.equals(other.getClientsecuritymessage()))) &&
            ((this.clientsecuritylog==null && other.getClientsecuritylog()==null) || 
             (this.clientsecuritylog!=null &&
              this.clientsecuritylog.equals(other.getClientsecuritylog()))) &&
            ((this.splittunnel==null && other.getSplittunnel()==null) || 
             (this.splittunnel!=null &&
              this.splittunnel.equals(other.getSplittunnel()))) &&
            ((this.locallanaccess==null && other.getLocallanaccess()==null) || 
             (this.locallanaccess!=null &&
              this.locallanaccess.equals(other.getLocallanaccess()))) &&
            ((this.rfc1918==null && other.getRfc1918()==null) || 
             (this.rfc1918!=null &&
              this.rfc1918.equals(other.getRfc1918()))) &&
            ((this.spoofiip==null && other.getSpoofiip()==null) || 
             (this.spoofiip!=null &&
              this.spoofiip.equals(other.getSpoofiip()))) &&
            ((this.killconnections==null && other.getKillconnections()==null) || 
             (this.killconnections!=null &&
              this.killconnections.equals(other.getKillconnections()))) &&
            ((this.transparentinterception==null && other.getTransparentinterception()==null) || 
             (this.transparentinterception!=null &&
              this.transparentinterception.equals(other.getTransparentinterception()))) &&
            ((this.windowsclienttype==null && other.getWindowsclienttype()==null) || 
             (this.windowsclienttype!=null &&
              this.windowsclienttype.equals(other.getWindowsclienttype()))) &&
            ((this.defaultauthorizationaction==null && other.getDefaultauthorizationaction()==null) || 
             (this.defaultauthorizationaction!=null &&
              this.defaultauthorizationaction.equals(other.getDefaultauthorizationaction()))) &&
            ((this.authorizationgroup==null && other.getAuthorizationgroup()==null) || 
             (this.authorizationgroup!=null &&
              this.authorizationgroup.equals(other.getAuthorizationgroup()))) &&
            ((this.clientidletimeout==null && other.getClientidletimeout()==null) || 
             (this.clientidletimeout!=null &&
              this.clientidletimeout.equals(other.getClientidletimeout()))) &&
            ((this.clientidletimeoutwarning==null && other.getClientidletimeoutwarning()==null) || 
             (this.clientidletimeoutwarning!=null &&
              this.clientidletimeoutwarning.equals(other.getClientidletimeoutwarning()))) &&
            ((this.proxy==null && other.getProxy()==null) || 
             (this.proxy!=null &&
              this.proxy.equals(other.getProxy()))) &&
            ((this.allprotocolproxy==null && other.getAllprotocolproxy()==null) || 
             (this.allprotocolproxy!=null &&
              this.allprotocolproxy.equals(other.getAllprotocolproxy()))) &&
            ((this.httpproxy==null && other.getHttpproxy()==null) || 
             (this.httpproxy!=null &&
              this.httpproxy.equals(other.getHttpproxy()))) &&
            ((this.ftpproxy==null && other.getFtpproxy()==null) || 
             (this.ftpproxy!=null &&
              this.ftpproxy.equals(other.getFtpproxy()))) &&
            ((this.socksproxy==null && other.getSocksproxy()==null) || 
             (this.socksproxy!=null &&
              this.socksproxy.equals(other.getSocksproxy()))) &&
            ((this.gopherproxy==null && other.getGopherproxy()==null) || 
             (this.gopherproxy!=null &&
              this.gopherproxy.equals(other.getGopherproxy()))) &&
            ((this.sslproxy==null && other.getSslproxy()==null) || 
             (this.sslproxy!=null &&
              this.sslproxy.equals(other.getSslproxy()))) &&
            ((this.proxyexception==null && other.getProxyexception()==null) || 
             (this.proxyexception!=null &&
              this.proxyexception.equals(other.getProxyexception()))) &&
            ((this.proxylocalbypass==null && other.getProxylocalbypass()==null) || 
             (this.proxylocalbypass!=null &&
              this.proxylocalbypass.equals(other.getProxylocalbypass()))) &&
            ((this.clientcleanupprompt==null && other.getClientcleanupprompt()==null) || 
             (this.clientcleanupprompt!=null &&
              this.clientcleanupprompt.equals(other.getClientcleanupprompt()))) &&
            ((this.forcecleanup==null && other.getForcecleanup()==null) || 
             (this.forcecleanup!=null &&
              this.forcecleanup.equals(other.getForcecleanup()))) &&
            ((this.clientoptions==null && other.getClientoptions()==null) || 
             (this.clientoptions!=null &&
              this.clientoptions.equals(other.getClientoptions()))) &&
            ((this.clientconfiguration==null && other.getClientconfiguration()==null) || 
             (this.clientconfiguration!=null &&
              this.clientconfiguration.equals(other.getClientconfiguration()))) &&
            ((this.sso==null && other.getSso()==null) || 
             (this.sso!=null &&
              this.sso.equals(other.getSso()))) &&
            ((this.ssocredential==null && other.getSsocredential()==null) || 
             (this.ssocredential!=null &&
              this.ssocredential.equals(other.getSsocredential()))) &&
            ((this.windowsautologon==null && other.getWindowsautologon()==null) || 
             (this.windowsautologon!=null &&
              this.windowsautologon.equals(other.getWindowsautologon()))) &&
            ((this.usemip==null && other.getUsemip()==null) || 
             (this.usemip!=null &&
              this.usemip.equals(other.getUsemip()))) &&
            ((this.useiip==null && other.getUseiip()==null) || 
             (this.useiip!=null &&
              this.useiip.equals(other.getUseiip()))) &&
            ((this.clientdebug==null && other.getClientdebug()==null) || 
             (this.clientdebug!=null &&
              this.clientdebug.equals(other.getClientdebug()))) &&
            ((this.loginscript==null && other.getLoginscript()==null) || 
             (this.loginscript!=null &&
              this.loginscript.equals(other.getLoginscript()))) &&
            ((this.logoutscript==null && other.getLogoutscript()==null) || 
             (this.logoutscript!=null &&
              this.logoutscript.equals(other.getLogoutscript()))) &&
            ((this.homepage==null && other.getHomepage()==null) || 
             (this.homepage!=null &&
              this.homepage.equals(other.getHomepage()))) &&
            ((this.icaproxy==null && other.getIcaproxy()==null) || 
             (this.icaproxy!=null &&
              this.icaproxy.equals(other.getIcaproxy()))) &&
            ((this.wihome==null && other.getWihome()==null) || 
             (this.wihome!=null &&
              this.wihome.equals(other.getWihome()))) &&
            ((this.citrixreceiverhome==null && other.getCitrixreceiverhome()==null) || 
             (this.citrixreceiverhome!=null &&
              this.citrixreceiverhome.equals(other.getCitrixreceiverhome()))) &&
            ((this.wiportalmode==null && other.getWiportalmode()==null) || 
             (this.wiportalmode!=null &&
              this.wiportalmode.equals(other.getWiportalmode()))) &&
            ((this.clientchoices==null && other.getClientchoices()==null) || 
             (this.clientchoices!=null &&
              this.clientchoices.equals(other.getClientchoices()))) &&
            ((this.epaclienttype==null && other.getEpaclienttype()==null) || 
             (this.epaclienttype!=null &&
              this.epaclienttype.equals(other.getEpaclienttype()))) &&
            ((this.iipdnssuffix==null && other.getIipdnssuffix()==null) || 
             (this.iipdnssuffix!=null &&
              this.iipdnssuffix.equals(other.getIipdnssuffix()))) &&
            ((this.forcedtimeout==null && other.getForcedtimeout()==null) || 
             (this.forcedtimeout!=null &&
              this.forcedtimeout.equals(other.getForcedtimeout()))) &&
            ((this.forcedtimeoutwarning==null && other.getForcedtimeoutwarning()==null) || 
             (this.forcedtimeoutwarning!=null &&
              this.forcedtimeoutwarning.equals(other.getForcedtimeoutwarning()))) &&
            ((this.ntdomain==null && other.getNtdomain()==null) || 
             (this.ntdomain!=null &&
              this.ntdomain.equals(other.getNtdomain()))) &&
            ((this.clientlessvpnmode==null && other.getClientlessvpnmode()==null) || 
             (this.clientlessvpnmode!=null &&
              this.clientlessvpnmode.equals(other.getClientlessvpnmode()))) &&
            ((this.clientlessmodeurlencoding==null && other.getClientlessmodeurlencoding()==null) || 
             (this.clientlessmodeurlencoding!=null &&
              this.clientlessmodeurlencoding.equals(other.getClientlessmodeurlencoding()))) &&
            ((this.clientlesspersistentcookie==null && other.getClientlesspersistentcookie()==null) || 
             (this.clientlesspersistentcookie!=null &&
              this.clientlesspersistentcookie.equals(other.getClientlesspersistentcookie()))) &&
            ((this.emailhome==null && other.getEmailhome()==null) || 
             (this.emailhome!=null &&
              this.emailhome.equals(other.getEmailhome()))) &&
            ((this.allowedlogingroups==null && other.getAllowedlogingroups()==null) || 
             (this.allowedlogingroups!=null &&
              this.allowedlogingroups.equals(other.getAllowedlogingroups()))) &&
            ((this.securebrowse==null && other.getSecurebrowse()==null) || 
             (this.securebrowse!=null &&
              this.securebrowse.equals(other.getSecurebrowse()))) &&
            ((this.storefronturl==null && other.getStorefronturl()==null) || 
             (this.storefronturl!=null &&
              this.storefronturl.equals(other.getStorefronturl()))) &&
            ((this.kcdaccount==null && other.getKcdaccount()==null) || 
             (this.kcdaccount!=null &&
              this.kcdaccount.equals(other.getKcdaccount()))) &&
            ((this.builtin==null && other.getBuiltin()==null) || 
             (this.builtin!=null &&
              this.builtin.equals(other.getBuiltin())));
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
        if (getHttpport() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHttpport());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHttpport(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWinsip() != null) {
            _hashCode += getWinsip().hashCode();
        }
        if (getDnsvservername() != null) {
            _hashCode += getDnsvservername().hashCode();
        }
        if (getSplitdns() != null) {
            _hashCode += getSplitdns().hashCode();
        }
        if (getSesstimeout() != null) {
            _hashCode += getSesstimeout().hashCode();
        }
        if (getClientsecurity() != null) {
            _hashCode += getClientsecurity().hashCode();
        }
        if (getClientsecuritygroup() != null) {
            _hashCode += getClientsecuritygroup().hashCode();
        }
        if (getClientsecuritymessage() != null) {
            _hashCode += getClientsecuritymessage().hashCode();
        }
        if (getClientsecuritylog() != null) {
            _hashCode += getClientsecuritylog().hashCode();
        }
        if (getSplittunnel() != null) {
            _hashCode += getSplittunnel().hashCode();
        }
        if (getLocallanaccess() != null) {
            _hashCode += getLocallanaccess().hashCode();
        }
        if (getRfc1918() != null) {
            _hashCode += getRfc1918().hashCode();
        }
        if (getSpoofiip() != null) {
            _hashCode += getSpoofiip().hashCode();
        }
        if (getKillconnections() != null) {
            _hashCode += getKillconnections().hashCode();
        }
        if (getTransparentinterception() != null) {
            _hashCode += getTransparentinterception().hashCode();
        }
        if (getWindowsclienttype() != null) {
            _hashCode += getWindowsclienttype().hashCode();
        }
        if (getDefaultauthorizationaction() != null) {
            _hashCode += getDefaultauthorizationaction().hashCode();
        }
        if (getAuthorizationgroup() != null) {
            _hashCode += getAuthorizationgroup().hashCode();
        }
        if (getClientidletimeout() != null) {
            _hashCode += getClientidletimeout().hashCode();
        }
        if (getClientidletimeoutwarning() != null) {
            _hashCode += getClientidletimeoutwarning().hashCode();
        }
        if (getProxy() != null) {
            _hashCode += getProxy().hashCode();
        }
        if (getAllprotocolproxy() != null) {
            _hashCode += getAllprotocolproxy().hashCode();
        }
        if (getHttpproxy() != null) {
            _hashCode += getHttpproxy().hashCode();
        }
        if (getFtpproxy() != null) {
            _hashCode += getFtpproxy().hashCode();
        }
        if (getSocksproxy() != null) {
            _hashCode += getSocksproxy().hashCode();
        }
        if (getGopherproxy() != null) {
            _hashCode += getGopherproxy().hashCode();
        }
        if (getSslproxy() != null) {
            _hashCode += getSslproxy().hashCode();
        }
        if (getProxyexception() != null) {
            _hashCode += getProxyexception().hashCode();
        }
        if (getProxylocalbypass() != null) {
            _hashCode += getProxylocalbypass().hashCode();
        }
        if (getClientcleanupprompt() != null) {
            _hashCode += getClientcleanupprompt().hashCode();
        }
        if (getForcecleanup() != null) {
            _hashCode += getForcecleanup().hashCode();
        }
        if (getClientoptions() != null) {
            _hashCode += getClientoptions().hashCode();
        }
        if (getClientconfiguration() != null) {
            _hashCode += getClientconfiguration().hashCode();
        }
        if (getSso() != null) {
            _hashCode += getSso().hashCode();
        }
        if (getSsocredential() != null) {
            _hashCode += getSsocredential().hashCode();
        }
        if (getWindowsautologon() != null) {
            _hashCode += getWindowsautologon().hashCode();
        }
        if (getUsemip() != null) {
            _hashCode += getUsemip().hashCode();
        }
        if (getUseiip() != null) {
            _hashCode += getUseiip().hashCode();
        }
        if (getClientdebug() != null) {
            _hashCode += getClientdebug().hashCode();
        }
        if (getLoginscript() != null) {
            _hashCode += getLoginscript().hashCode();
        }
        if (getLogoutscript() != null) {
            _hashCode += getLogoutscript().hashCode();
        }
        if (getHomepage() != null) {
            _hashCode += getHomepage().hashCode();
        }
        if (getIcaproxy() != null) {
            _hashCode += getIcaproxy().hashCode();
        }
        if (getWihome() != null) {
            _hashCode += getWihome().hashCode();
        }
        if (getCitrixreceiverhome() != null) {
            _hashCode += getCitrixreceiverhome().hashCode();
        }
        if (getWiportalmode() != null) {
            _hashCode += getWiportalmode().hashCode();
        }
        if (getClientchoices() != null) {
            _hashCode += getClientchoices().hashCode();
        }
        if (getEpaclienttype() != null) {
            _hashCode += getEpaclienttype().hashCode();
        }
        if (getIipdnssuffix() != null) {
            _hashCode += getIipdnssuffix().hashCode();
        }
        if (getForcedtimeout() != null) {
            _hashCode += getForcedtimeout().hashCode();
        }
        if (getForcedtimeoutwarning() != null) {
            _hashCode += getForcedtimeoutwarning().hashCode();
        }
        if (getNtdomain() != null) {
            _hashCode += getNtdomain().hashCode();
        }
        if (getClientlessvpnmode() != null) {
            _hashCode += getClientlessvpnmode().hashCode();
        }
        if (getClientlessmodeurlencoding() != null) {
            _hashCode += getClientlessmodeurlencoding().hashCode();
        }
        if (getClientlesspersistentcookie() != null) {
            _hashCode += getClientlesspersistentcookie().hashCode();
        }
        if (getEmailhome() != null) {
            _hashCode += getEmailhome().hashCode();
        }
        if (getAllowedlogingroups() != null) {
            _hashCode += getAllowedlogingroups().hashCode();
        }
        if (getSecurebrowse() != null) {
            _hashCode += getSecurebrowse().hashCode();
        }
        if (getStorefronturl() != null) {
            _hashCode += getStorefronturl().hashCode();
        }
        if (getKcdaccount() != null) {
            _hashCode += getKcdaccount().hashCode();
        }
        if (getBuiltin() != null) {
            _hashCode += getBuiltin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Vpnsessionaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "vpnsessionaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("winsip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "winsip"));
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
        elemField.setFieldName("splitdns");
        elemField.setXmlName(new javax.xml.namespace.QName("", "splitdns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sesstimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sesstimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientsecurity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientsecurity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientsecuritygroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientsecuritygroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientsecuritymessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientsecuritymessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientsecuritylog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientsecuritylog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("splittunnel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "splittunnel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locallanaccess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locallanaccess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfc1918");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rfc1918"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spoofiip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spoofiip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("killconnections");
        elemField.setXmlName(new javax.xml.namespace.QName("", "killconnections"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transparentinterception");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transparentinterception"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("windowsclienttype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "windowsclienttype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultauthorizationaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultauthorizationaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authorizationgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authorizationgroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientidletimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientidletimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientidletimeoutwarning");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientidletimeoutwarning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proxy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allprotocolproxy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allprotocolproxy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpproxy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpproxy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ftpproxy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ftpproxy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("socksproxy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "socksproxy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gopherproxy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gopherproxy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslproxy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sslproxy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxyexception");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proxyexception"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proxylocalbypass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "proxylocalbypass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientcleanupprompt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientcleanupprompt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forcecleanup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forcecleanup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientoptions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientoptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientconfiguration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientconfiguration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssocredential");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssocredential"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("windowsautologon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "windowsautologon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usemip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usemip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useiip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useiip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientdebug");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientdebug"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginscript");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginscript"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logoutscript");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logoutscript"));
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
        elemField.setFieldName("icaproxy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "icaproxy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wihome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wihome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("citrixreceiverhome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "citrixreceiverhome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wiportalmode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wiportalmode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientchoices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientchoices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("epaclienttype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "epaclienttype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iipdnssuffix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iipdnssuffix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forcedtimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forcedtimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forcedtimeoutwarning");
        elemField.setXmlName(new javax.xml.namespace.QName("", "forcedtimeoutwarning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ntdomain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ntdomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientlessvpnmode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientlessvpnmode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientlessmodeurlencoding");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientlessmodeurlencoding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientlesspersistentcookie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientlesspersistentcookie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailhome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emailhome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedlogingroups");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allowedlogingroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securebrowse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "securebrowse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storefronturl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storefronturl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kcdaccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kcdaccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builtin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "builtin"));
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
