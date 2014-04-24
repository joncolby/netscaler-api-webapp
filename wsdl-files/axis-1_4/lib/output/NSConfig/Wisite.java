/**
 * Wisite.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Wisite  implements java.io.Serializable {
    private java.lang.String sitepath;

    private java.lang.String agurl;

    private java.lang.String staurl;

    private java.lang.String wiauthenticationmethods;

    private java.lang.String logintitle;

    private java.lang.String appwelcomemessage;

    private java.lang.String welcomemessage;

    private java.lang.String footertext;

    private java.lang.String loginsysmessage;

    private java.lang.String preloginbutton;

    private java.lang.String preloginmessage;

    private java.lang.String prelogintitle;

    private java.lang.String domainselection;

    private java.lang.String defaultcustomtextlocale;

    private org.apache.axis.types.UnsignedInt websessiontimeout;

    private java.lang.String sitetype;

    private java.lang.String userinterfacebranding;

    private java.lang.String showsearch;

    private java.lang.String showrefresh;

    private java.lang.String wiuserinterfacemodes;

    private java.lang.String userinterfacelayouts;

    private java.lang.String publishedresourcetype;

    private java.lang.String defaultaccessmethod;

    private java.lang.String[] farmname;

    private java.lang.String[] accessmethod;

    private java.lang.String[] clientipaddress;

    private java.lang.String[] clientnetmask;

    private java.lang.String[] translationinternalip;

    private org.apache.axis.types.UnsignedInt[] translationinternalport;

    private java.lang.String[] translationexternalip;

    private org.apache.axis.types.UnsignedInt[] translationexternalport;

    private java.lang.String[] accesstype;

    private java.lang.String[] xmlserveraddresses;

    private org.apache.axis.types.UnsignedInt[] xmlport;

    private java.lang.String[] transport;

    private org.apache.axis.types.UnsignedInt[] sslrelayport;

    private java.lang.String agauthenticationmethod;

    private java.lang.String[] groups;

    private java.lang.String[] recoveryfarm;

    private java.lang.String sessionreliability;

    private java.lang.String usetwotickets;

    private java.lang.String secondstaurl;

    private java.lang.String[] loadbalance;

    private java.lang.String authenticationpoint;

    private java.lang.String kioskmode;

    public Wisite() {
    }

    public Wisite(
           java.lang.String sitepath,
           java.lang.String agurl,
           java.lang.String staurl,
           java.lang.String wiauthenticationmethods,
           java.lang.String logintitle,
           java.lang.String appwelcomemessage,
           java.lang.String welcomemessage,
           java.lang.String footertext,
           java.lang.String loginsysmessage,
           java.lang.String preloginbutton,
           java.lang.String preloginmessage,
           java.lang.String prelogintitle,
           java.lang.String domainselection,
           java.lang.String defaultcustomtextlocale,
           org.apache.axis.types.UnsignedInt websessiontimeout,
           java.lang.String sitetype,
           java.lang.String userinterfacebranding,
           java.lang.String showsearch,
           java.lang.String showrefresh,
           java.lang.String wiuserinterfacemodes,
           java.lang.String userinterfacelayouts,
           java.lang.String publishedresourcetype,
           java.lang.String defaultaccessmethod,
           java.lang.String[] farmname,
           java.lang.String[] accessmethod,
           java.lang.String[] clientipaddress,
           java.lang.String[] clientnetmask,
           java.lang.String[] translationinternalip,
           org.apache.axis.types.UnsignedInt[] translationinternalport,
           java.lang.String[] translationexternalip,
           org.apache.axis.types.UnsignedInt[] translationexternalport,
           java.lang.String[] accesstype,
           java.lang.String[] xmlserveraddresses,
           org.apache.axis.types.UnsignedInt[] xmlport,
           java.lang.String[] transport,
           org.apache.axis.types.UnsignedInt[] sslrelayport,
           java.lang.String agauthenticationmethod,
           java.lang.String[] groups,
           java.lang.String[] recoveryfarm,
           java.lang.String sessionreliability,
           java.lang.String usetwotickets,
           java.lang.String secondstaurl,
           java.lang.String[] loadbalance,
           java.lang.String authenticationpoint,
           java.lang.String kioskmode) {
           this.sitepath = sitepath;
           this.agurl = agurl;
           this.staurl = staurl;
           this.wiauthenticationmethods = wiauthenticationmethods;
           this.logintitle = logintitle;
           this.appwelcomemessage = appwelcomemessage;
           this.welcomemessage = welcomemessage;
           this.footertext = footertext;
           this.loginsysmessage = loginsysmessage;
           this.preloginbutton = preloginbutton;
           this.preloginmessage = preloginmessage;
           this.prelogintitle = prelogintitle;
           this.domainselection = domainselection;
           this.defaultcustomtextlocale = defaultcustomtextlocale;
           this.websessiontimeout = websessiontimeout;
           this.sitetype = sitetype;
           this.userinterfacebranding = userinterfacebranding;
           this.showsearch = showsearch;
           this.showrefresh = showrefresh;
           this.wiuserinterfacemodes = wiuserinterfacemodes;
           this.userinterfacelayouts = userinterfacelayouts;
           this.publishedresourcetype = publishedresourcetype;
           this.defaultaccessmethod = defaultaccessmethod;
           this.farmname = farmname;
           this.accessmethod = accessmethod;
           this.clientipaddress = clientipaddress;
           this.clientnetmask = clientnetmask;
           this.translationinternalip = translationinternalip;
           this.translationinternalport = translationinternalport;
           this.translationexternalip = translationexternalip;
           this.translationexternalport = translationexternalport;
           this.accesstype = accesstype;
           this.xmlserveraddresses = xmlserveraddresses;
           this.xmlport = xmlport;
           this.transport = transport;
           this.sslrelayport = sslrelayport;
           this.agauthenticationmethod = agauthenticationmethod;
           this.groups = groups;
           this.recoveryfarm = recoveryfarm;
           this.sessionreliability = sessionreliability;
           this.usetwotickets = usetwotickets;
           this.secondstaurl = secondstaurl;
           this.loadbalance = loadbalance;
           this.authenticationpoint = authenticationpoint;
           this.kioskmode = kioskmode;
    }


    /**
     * Gets the sitepath value for this Wisite.
     * 
     * @return sitepath
     */
    public java.lang.String getSitepath() {
        return sitepath;
    }


    /**
     * Sets the sitepath value for this Wisite.
     * 
     * @param sitepath
     */
    public void setSitepath(java.lang.String sitepath) {
        this.sitepath = sitepath;
    }


    /**
     * Gets the agurl value for this Wisite.
     * 
     * @return agurl
     */
    public java.lang.String getAgurl() {
        return agurl;
    }


    /**
     * Sets the agurl value for this Wisite.
     * 
     * @param agurl
     */
    public void setAgurl(java.lang.String agurl) {
        this.agurl = agurl;
    }


    /**
     * Gets the staurl value for this Wisite.
     * 
     * @return staurl
     */
    public java.lang.String getStaurl() {
        return staurl;
    }


    /**
     * Sets the staurl value for this Wisite.
     * 
     * @param staurl
     */
    public void setStaurl(java.lang.String staurl) {
        this.staurl = staurl;
    }


    /**
     * Gets the wiauthenticationmethods value for this Wisite.
     * 
     * @return wiauthenticationmethods
     */
    public java.lang.String getWiauthenticationmethods() {
        return wiauthenticationmethods;
    }


    /**
     * Sets the wiauthenticationmethods value for this Wisite.
     * 
     * @param wiauthenticationmethods
     */
    public void setWiauthenticationmethods(java.lang.String wiauthenticationmethods) {
        this.wiauthenticationmethods = wiauthenticationmethods;
    }


    /**
     * Gets the logintitle value for this Wisite.
     * 
     * @return logintitle
     */
    public java.lang.String getLogintitle() {
        return logintitle;
    }


    /**
     * Sets the logintitle value for this Wisite.
     * 
     * @param logintitle
     */
    public void setLogintitle(java.lang.String logintitle) {
        this.logintitle = logintitle;
    }


    /**
     * Gets the appwelcomemessage value for this Wisite.
     * 
     * @return appwelcomemessage
     */
    public java.lang.String getAppwelcomemessage() {
        return appwelcomemessage;
    }


    /**
     * Sets the appwelcomemessage value for this Wisite.
     * 
     * @param appwelcomemessage
     */
    public void setAppwelcomemessage(java.lang.String appwelcomemessage) {
        this.appwelcomemessage = appwelcomemessage;
    }


    /**
     * Gets the welcomemessage value for this Wisite.
     * 
     * @return welcomemessage
     */
    public java.lang.String getWelcomemessage() {
        return welcomemessage;
    }


    /**
     * Sets the welcomemessage value for this Wisite.
     * 
     * @param welcomemessage
     */
    public void setWelcomemessage(java.lang.String welcomemessage) {
        this.welcomemessage = welcomemessage;
    }


    /**
     * Gets the footertext value for this Wisite.
     * 
     * @return footertext
     */
    public java.lang.String getFootertext() {
        return footertext;
    }


    /**
     * Sets the footertext value for this Wisite.
     * 
     * @param footertext
     */
    public void setFootertext(java.lang.String footertext) {
        this.footertext = footertext;
    }


    /**
     * Gets the loginsysmessage value for this Wisite.
     * 
     * @return loginsysmessage
     */
    public java.lang.String getLoginsysmessage() {
        return loginsysmessage;
    }


    /**
     * Sets the loginsysmessage value for this Wisite.
     * 
     * @param loginsysmessage
     */
    public void setLoginsysmessage(java.lang.String loginsysmessage) {
        this.loginsysmessage = loginsysmessage;
    }


    /**
     * Gets the preloginbutton value for this Wisite.
     * 
     * @return preloginbutton
     */
    public java.lang.String getPreloginbutton() {
        return preloginbutton;
    }


    /**
     * Sets the preloginbutton value for this Wisite.
     * 
     * @param preloginbutton
     */
    public void setPreloginbutton(java.lang.String preloginbutton) {
        this.preloginbutton = preloginbutton;
    }


    /**
     * Gets the preloginmessage value for this Wisite.
     * 
     * @return preloginmessage
     */
    public java.lang.String getPreloginmessage() {
        return preloginmessage;
    }


    /**
     * Sets the preloginmessage value for this Wisite.
     * 
     * @param preloginmessage
     */
    public void setPreloginmessage(java.lang.String preloginmessage) {
        this.preloginmessage = preloginmessage;
    }


    /**
     * Gets the prelogintitle value for this Wisite.
     * 
     * @return prelogintitle
     */
    public java.lang.String getPrelogintitle() {
        return prelogintitle;
    }


    /**
     * Sets the prelogintitle value for this Wisite.
     * 
     * @param prelogintitle
     */
    public void setPrelogintitle(java.lang.String prelogintitle) {
        this.prelogintitle = prelogintitle;
    }


    /**
     * Gets the domainselection value for this Wisite.
     * 
     * @return domainselection
     */
    public java.lang.String getDomainselection() {
        return domainselection;
    }


    /**
     * Sets the domainselection value for this Wisite.
     * 
     * @param domainselection
     */
    public void setDomainselection(java.lang.String domainselection) {
        this.domainselection = domainselection;
    }


    /**
     * Gets the defaultcustomtextlocale value for this Wisite.
     * 
     * @return defaultcustomtextlocale
     */
    public java.lang.String getDefaultcustomtextlocale() {
        return defaultcustomtextlocale;
    }


    /**
     * Sets the defaultcustomtextlocale value for this Wisite.
     * 
     * @param defaultcustomtextlocale
     */
    public void setDefaultcustomtextlocale(java.lang.String defaultcustomtextlocale) {
        this.defaultcustomtextlocale = defaultcustomtextlocale;
    }


    /**
     * Gets the websessiontimeout value for this Wisite.
     * 
     * @return websessiontimeout
     */
    public org.apache.axis.types.UnsignedInt getWebsessiontimeout() {
        return websessiontimeout;
    }


    /**
     * Sets the websessiontimeout value for this Wisite.
     * 
     * @param websessiontimeout
     */
    public void setWebsessiontimeout(org.apache.axis.types.UnsignedInt websessiontimeout) {
        this.websessiontimeout = websessiontimeout;
    }


    /**
     * Gets the sitetype value for this Wisite.
     * 
     * @return sitetype
     */
    public java.lang.String getSitetype() {
        return sitetype;
    }


    /**
     * Sets the sitetype value for this Wisite.
     * 
     * @param sitetype
     */
    public void setSitetype(java.lang.String sitetype) {
        this.sitetype = sitetype;
    }


    /**
     * Gets the userinterfacebranding value for this Wisite.
     * 
     * @return userinterfacebranding
     */
    public java.lang.String getUserinterfacebranding() {
        return userinterfacebranding;
    }


    /**
     * Sets the userinterfacebranding value for this Wisite.
     * 
     * @param userinterfacebranding
     */
    public void setUserinterfacebranding(java.lang.String userinterfacebranding) {
        this.userinterfacebranding = userinterfacebranding;
    }


    /**
     * Gets the showsearch value for this Wisite.
     * 
     * @return showsearch
     */
    public java.lang.String getShowsearch() {
        return showsearch;
    }


    /**
     * Sets the showsearch value for this Wisite.
     * 
     * @param showsearch
     */
    public void setShowsearch(java.lang.String showsearch) {
        this.showsearch = showsearch;
    }


    /**
     * Gets the showrefresh value for this Wisite.
     * 
     * @return showrefresh
     */
    public java.lang.String getShowrefresh() {
        return showrefresh;
    }


    /**
     * Sets the showrefresh value for this Wisite.
     * 
     * @param showrefresh
     */
    public void setShowrefresh(java.lang.String showrefresh) {
        this.showrefresh = showrefresh;
    }


    /**
     * Gets the wiuserinterfacemodes value for this Wisite.
     * 
     * @return wiuserinterfacemodes
     */
    public java.lang.String getWiuserinterfacemodes() {
        return wiuserinterfacemodes;
    }


    /**
     * Sets the wiuserinterfacemodes value for this Wisite.
     * 
     * @param wiuserinterfacemodes
     */
    public void setWiuserinterfacemodes(java.lang.String wiuserinterfacemodes) {
        this.wiuserinterfacemodes = wiuserinterfacemodes;
    }


    /**
     * Gets the userinterfacelayouts value for this Wisite.
     * 
     * @return userinterfacelayouts
     */
    public java.lang.String getUserinterfacelayouts() {
        return userinterfacelayouts;
    }


    /**
     * Sets the userinterfacelayouts value for this Wisite.
     * 
     * @param userinterfacelayouts
     */
    public void setUserinterfacelayouts(java.lang.String userinterfacelayouts) {
        this.userinterfacelayouts = userinterfacelayouts;
    }


    /**
     * Gets the publishedresourcetype value for this Wisite.
     * 
     * @return publishedresourcetype
     */
    public java.lang.String getPublishedresourcetype() {
        return publishedresourcetype;
    }


    /**
     * Sets the publishedresourcetype value for this Wisite.
     * 
     * @param publishedresourcetype
     */
    public void setPublishedresourcetype(java.lang.String publishedresourcetype) {
        this.publishedresourcetype = publishedresourcetype;
    }


    /**
     * Gets the defaultaccessmethod value for this Wisite.
     * 
     * @return defaultaccessmethod
     */
    public java.lang.String getDefaultaccessmethod() {
        return defaultaccessmethod;
    }


    /**
     * Sets the defaultaccessmethod value for this Wisite.
     * 
     * @param defaultaccessmethod
     */
    public void setDefaultaccessmethod(java.lang.String defaultaccessmethod) {
        this.defaultaccessmethod = defaultaccessmethod;
    }


    /**
     * Gets the farmname value for this Wisite.
     * 
     * @return farmname
     */
    public java.lang.String[] getFarmname() {
        return farmname;
    }


    /**
     * Sets the farmname value for this Wisite.
     * 
     * @param farmname
     */
    public void setFarmname(java.lang.String[] farmname) {
        this.farmname = farmname;
    }


    /**
     * Gets the accessmethod value for this Wisite.
     * 
     * @return accessmethod
     */
    public java.lang.String[] getAccessmethod() {
        return accessmethod;
    }


    /**
     * Sets the accessmethod value for this Wisite.
     * 
     * @param accessmethod
     */
    public void setAccessmethod(java.lang.String[] accessmethod) {
        this.accessmethod = accessmethod;
    }


    /**
     * Gets the clientipaddress value for this Wisite.
     * 
     * @return clientipaddress
     */
    public java.lang.String[] getClientipaddress() {
        return clientipaddress;
    }


    /**
     * Sets the clientipaddress value for this Wisite.
     * 
     * @param clientipaddress
     */
    public void setClientipaddress(java.lang.String[] clientipaddress) {
        this.clientipaddress = clientipaddress;
    }


    /**
     * Gets the clientnetmask value for this Wisite.
     * 
     * @return clientnetmask
     */
    public java.lang.String[] getClientnetmask() {
        return clientnetmask;
    }


    /**
     * Sets the clientnetmask value for this Wisite.
     * 
     * @param clientnetmask
     */
    public void setClientnetmask(java.lang.String[] clientnetmask) {
        this.clientnetmask = clientnetmask;
    }


    /**
     * Gets the translationinternalip value for this Wisite.
     * 
     * @return translationinternalip
     */
    public java.lang.String[] getTranslationinternalip() {
        return translationinternalip;
    }


    /**
     * Sets the translationinternalip value for this Wisite.
     * 
     * @param translationinternalip
     */
    public void setTranslationinternalip(java.lang.String[] translationinternalip) {
        this.translationinternalip = translationinternalip;
    }


    /**
     * Gets the translationinternalport value for this Wisite.
     * 
     * @return translationinternalport
     */
    public org.apache.axis.types.UnsignedInt[] getTranslationinternalport() {
        return translationinternalport;
    }


    /**
     * Sets the translationinternalport value for this Wisite.
     * 
     * @param translationinternalport
     */
    public void setTranslationinternalport(org.apache.axis.types.UnsignedInt[] translationinternalport) {
        this.translationinternalport = translationinternalport;
    }


    /**
     * Gets the translationexternalip value for this Wisite.
     * 
     * @return translationexternalip
     */
    public java.lang.String[] getTranslationexternalip() {
        return translationexternalip;
    }


    /**
     * Sets the translationexternalip value for this Wisite.
     * 
     * @param translationexternalip
     */
    public void setTranslationexternalip(java.lang.String[] translationexternalip) {
        this.translationexternalip = translationexternalip;
    }


    /**
     * Gets the translationexternalport value for this Wisite.
     * 
     * @return translationexternalport
     */
    public org.apache.axis.types.UnsignedInt[] getTranslationexternalport() {
        return translationexternalport;
    }


    /**
     * Sets the translationexternalport value for this Wisite.
     * 
     * @param translationexternalport
     */
    public void setTranslationexternalport(org.apache.axis.types.UnsignedInt[] translationexternalport) {
        this.translationexternalport = translationexternalport;
    }


    /**
     * Gets the accesstype value for this Wisite.
     * 
     * @return accesstype
     */
    public java.lang.String[] getAccesstype() {
        return accesstype;
    }


    /**
     * Sets the accesstype value for this Wisite.
     * 
     * @param accesstype
     */
    public void setAccesstype(java.lang.String[] accesstype) {
        this.accesstype = accesstype;
    }


    /**
     * Gets the xmlserveraddresses value for this Wisite.
     * 
     * @return xmlserveraddresses
     */
    public java.lang.String[] getXmlserveraddresses() {
        return xmlserveraddresses;
    }


    /**
     * Sets the xmlserveraddresses value for this Wisite.
     * 
     * @param xmlserveraddresses
     */
    public void setXmlserveraddresses(java.lang.String[] xmlserveraddresses) {
        this.xmlserveraddresses = xmlserveraddresses;
    }


    /**
     * Gets the xmlport value for this Wisite.
     * 
     * @return xmlport
     */
    public org.apache.axis.types.UnsignedInt[] getXmlport() {
        return xmlport;
    }


    /**
     * Sets the xmlport value for this Wisite.
     * 
     * @param xmlport
     */
    public void setXmlport(org.apache.axis.types.UnsignedInt[] xmlport) {
        this.xmlport = xmlport;
    }


    /**
     * Gets the transport value for this Wisite.
     * 
     * @return transport
     */
    public java.lang.String[] getTransport() {
        return transport;
    }


    /**
     * Sets the transport value for this Wisite.
     * 
     * @param transport
     */
    public void setTransport(java.lang.String[] transport) {
        this.transport = transport;
    }


    /**
     * Gets the sslrelayport value for this Wisite.
     * 
     * @return sslrelayport
     */
    public org.apache.axis.types.UnsignedInt[] getSslrelayport() {
        return sslrelayport;
    }


    /**
     * Sets the sslrelayport value for this Wisite.
     * 
     * @param sslrelayport
     */
    public void setSslrelayport(org.apache.axis.types.UnsignedInt[] sslrelayport) {
        this.sslrelayport = sslrelayport;
    }


    /**
     * Gets the agauthenticationmethod value for this Wisite.
     * 
     * @return agauthenticationmethod
     */
    public java.lang.String getAgauthenticationmethod() {
        return agauthenticationmethod;
    }


    /**
     * Sets the agauthenticationmethod value for this Wisite.
     * 
     * @param agauthenticationmethod
     */
    public void setAgauthenticationmethod(java.lang.String agauthenticationmethod) {
        this.agauthenticationmethod = agauthenticationmethod;
    }


    /**
     * Gets the groups value for this Wisite.
     * 
     * @return groups
     */
    public java.lang.String[] getGroups() {
        return groups;
    }


    /**
     * Sets the groups value for this Wisite.
     * 
     * @param groups
     */
    public void setGroups(java.lang.String[] groups) {
        this.groups = groups;
    }


    /**
     * Gets the recoveryfarm value for this Wisite.
     * 
     * @return recoveryfarm
     */
    public java.lang.String[] getRecoveryfarm() {
        return recoveryfarm;
    }


    /**
     * Sets the recoveryfarm value for this Wisite.
     * 
     * @param recoveryfarm
     */
    public void setRecoveryfarm(java.lang.String[] recoveryfarm) {
        this.recoveryfarm = recoveryfarm;
    }


    /**
     * Gets the sessionreliability value for this Wisite.
     * 
     * @return sessionreliability
     */
    public java.lang.String getSessionreliability() {
        return sessionreliability;
    }


    /**
     * Sets the sessionreliability value for this Wisite.
     * 
     * @param sessionreliability
     */
    public void setSessionreliability(java.lang.String sessionreliability) {
        this.sessionreliability = sessionreliability;
    }


    /**
     * Gets the usetwotickets value for this Wisite.
     * 
     * @return usetwotickets
     */
    public java.lang.String getUsetwotickets() {
        return usetwotickets;
    }


    /**
     * Sets the usetwotickets value for this Wisite.
     * 
     * @param usetwotickets
     */
    public void setUsetwotickets(java.lang.String usetwotickets) {
        this.usetwotickets = usetwotickets;
    }


    /**
     * Gets the secondstaurl value for this Wisite.
     * 
     * @return secondstaurl
     */
    public java.lang.String getSecondstaurl() {
        return secondstaurl;
    }


    /**
     * Sets the secondstaurl value for this Wisite.
     * 
     * @param secondstaurl
     */
    public void setSecondstaurl(java.lang.String secondstaurl) {
        this.secondstaurl = secondstaurl;
    }


    /**
     * Gets the loadbalance value for this Wisite.
     * 
     * @return loadbalance
     */
    public java.lang.String[] getLoadbalance() {
        return loadbalance;
    }


    /**
     * Sets the loadbalance value for this Wisite.
     * 
     * @param loadbalance
     */
    public void setLoadbalance(java.lang.String[] loadbalance) {
        this.loadbalance = loadbalance;
    }


    /**
     * Gets the authenticationpoint value for this Wisite.
     * 
     * @return authenticationpoint
     */
    public java.lang.String getAuthenticationpoint() {
        return authenticationpoint;
    }


    /**
     * Sets the authenticationpoint value for this Wisite.
     * 
     * @param authenticationpoint
     */
    public void setAuthenticationpoint(java.lang.String authenticationpoint) {
        this.authenticationpoint = authenticationpoint;
    }


    /**
     * Gets the kioskmode value for this Wisite.
     * 
     * @return kioskmode
     */
    public java.lang.String getKioskmode() {
        return kioskmode;
    }


    /**
     * Sets the kioskmode value for this Wisite.
     * 
     * @param kioskmode
     */
    public void setKioskmode(java.lang.String kioskmode) {
        this.kioskmode = kioskmode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Wisite)) return false;
        Wisite other = (Wisite) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sitepath==null && other.getSitepath()==null) || 
             (this.sitepath!=null &&
              this.sitepath.equals(other.getSitepath()))) &&
            ((this.agurl==null && other.getAgurl()==null) || 
             (this.agurl!=null &&
              this.agurl.equals(other.getAgurl()))) &&
            ((this.staurl==null && other.getStaurl()==null) || 
             (this.staurl!=null &&
              this.staurl.equals(other.getStaurl()))) &&
            ((this.wiauthenticationmethods==null && other.getWiauthenticationmethods()==null) || 
             (this.wiauthenticationmethods!=null &&
              this.wiauthenticationmethods.equals(other.getWiauthenticationmethods()))) &&
            ((this.logintitle==null && other.getLogintitle()==null) || 
             (this.logintitle!=null &&
              this.logintitle.equals(other.getLogintitle()))) &&
            ((this.appwelcomemessage==null && other.getAppwelcomemessage()==null) || 
             (this.appwelcomemessage!=null &&
              this.appwelcomemessage.equals(other.getAppwelcomemessage()))) &&
            ((this.welcomemessage==null && other.getWelcomemessage()==null) || 
             (this.welcomemessage!=null &&
              this.welcomemessage.equals(other.getWelcomemessage()))) &&
            ((this.footertext==null && other.getFootertext()==null) || 
             (this.footertext!=null &&
              this.footertext.equals(other.getFootertext()))) &&
            ((this.loginsysmessage==null && other.getLoginsysmessage()==null) || 
             (this.loginsysmessage!=null &&
              this.loginsysmessage.equals(other.getLoginsysmessage()))) &&
            ((this.preloginbutton==null && other.getPreloginbutton()==null) || 
             (this.preloginbutton!=null &&
              this.preloginbutton.equals(other.getPreloginbutton()))) &&
            ((this.preloginmessage==null && other.getPreloginmessage()==null) || 
             (this.preloginmessage!=null &&
              this.preloginmessage.equals(other.getPreloginmessage()))) &&
            ((this.prelogintitle==null && other.getPrelogintitle()==null) || 
             (this.prelogintitle!=null &&
              this.prelogintitle.equals(other.getPrelogintitle()))) &&
            ((this.domainselection==null && other.getDomainselection()==null) || 
             (this.domainselection!=null &&
              this.domainselection.equals(other.getDomainselection()))) &&
            ((this.defaultcustomtextlocale==null && other.getDefaultcustomtextlocale()==null) || 
             (this.defaultcustomtextlocale!=null &&
              this.defaultcustomtextlocale.equals(other.getDefaultcustomtextlocale()))) &&
            ((this.websessiontimeout==null && other.getWebsessiontimeout()==null) || 
             (this.websessiontimeout!=null &&
              this.websessiontimeout.equals(other.getWebsessiontimeout()))) &&
            ((this.sitetype==null && other.getSitetype()==null) || 
             (this.sitetype!=null &&
              this.sitetype.equals(other.getSitetype()))) &&
            ((this.userinterfacebranding==null && other.getUserinterfacebranding()==null) || 
             (this.userinterfacebranding!=null &&
              this.userinterfacebranding.equals(other.getUserinterfacebranding()))) &&
            ((this.showsearch==null && other.getShowsearch()==null) || 
             (this.showsearch!=null &&
              this.showsearch.equals(other.getShowsearch()))) &&
            ((this.showrefresh==null && other.getShowrefresh()==null) || 
             (this.showrefresh!=null &&
              this.showrefresh.equals(other.getShowrefresh()))) &&
            ((this.wiuserinterfacemodes==null && other.getWiuserinterfacemodes()==null) || 
             (this.wiuserinterfacemodes!=null &&
              this.wiuserinterfacemodes.equals(other.getWiuserinterfacemodes()))) &&
            ((this.userinterfacelayouts==null && other.getUserinterfacelayouts()==null) || 
             (this.userinterfacelayouts!=null &&
              this.userinterfacelayouts.equals(other.getUserinterfacelayouts()))) &&
            ((this.publishedresourcetype==null && other.getPublishedresourcetype()==null) || 
             (this.publishedresourcetype!=null &&
              this.publishedresourcetype.equals(other.getPublishedresourcetype()))) &&
            ((this.defaultaccessmethod==null && other.getDefaultaccessmethod()==null) || 
             (this.defaultaccessmethod!=null &&
              this.defaultaccessmethod.equals(other.getDefaultaccessmethod()))) &&
            ((this.farmname==null && other.getFarmname()==null) || 
             (this.farmname!=null &&
              java.util.Arrays.equals(this.farmname, other.getFarmname()))) &&
            ((this.accessmethod==null && other.getAccessmethod()==null) || 
             (this.accessmethod!=null &&
              java.util.Arrays.equals(this.accessmethod, other.getAccessmethod()))) &&
            ((this.clientipaddress==null && other.getClientipaddress()==null) || 
             (this.clientipaddress!=null &&
              java.util.Arrays.equals(this.clientipaddress, other.getClientipaddress()))) &&
            ((this.clientnetmask==null && other.getClientnetmask()==null) || 
             (this.clientnetmask!=null &&
              java.util.Arrays.equals(this.clientnetmask, other.getClientnetmask()))) &&
            ((this.translationinternalip==null && other.getTranslationinternalip()==null) || 
             (this.translationinternalip!=null &&
              java.util.Arrays.equals(this.translationinternalip, other.getTranslationinternalip()))) &&
            ((this.translationinternalport==null && other.getTranslationinternalport()==null) || 
             (this.translationinternalport!=null &&
              java.util.Arrays.equals(this.translationinternalport, other.getTranslationinternalport()))) &&
            ((this.translationexternalip==null && other.getTranslationexternalip()==null) || 
             (this.translationexternalip!=null &&
              java.util.Arrays.equals(this.translationexternalip, other.getTranslationexternalip()))) &&
            ((this.translationexternalport==null && other.getTranslationexternalport()==null) || 
             (this.translationexternalport!=null &&
              java.util.Arrays.equals(this.translationexternalport, other.getTranslationexternalport()))) &&
            ((this.accesstype==null && other.getAccesstype()==null) || 
             (this.accesstype!=null &&
              java.util.Arrays.equals(this.accesstype, other.getAccesstype()))) &&
            ((this.xmlserveraddresses==null && other.getXmlserveraddresses()==null) || 
             (this.xmlserveraddresses!=null &&
              java.util.Arrays.equals(this.xmlserveraddresses, other.getXmlserveraddresses()))) &&
            ((this.xmlport==null && other.getXmlport()==null) || 
             (this.xmlport!=null &&
              java.util.Arrays.equals(this.xmlport, other.getXmlport()))) &&
            ((this.transport==null && other.getTransport()==null) || 
             (this.transport!=null &&
              java.util.Arrays.equals(this.transport, other.getTransport()))) &&
            ((this.sslrelayport==null && other.getSslrelayport()==null) || 
             (this.sslrelayport!=null &&
              java.util.Arrays.equals(this.sslrelayport, other.getSslrelayport()))) &&
            ((this.agauthenticationmethod==null && other.getAgauthenticationmethod()==null) || 
             (this.agauthenticationmethod!=null &&
              this.agauthenticationmethod.equals(other.getAgauthenticationmethod()))) &&
            ((this.groups==null && other.getGroups()==null) || 
             (this.groups!=null &&
              java.util.Arrays.equals(this.groups, other.getGroups()))) &&
            ((this.recoveryfarm==null && other.getRecoveryfarm()==null) || 
             (this.recoveryfarm!=null &&
              java.util.Arrays.equals(this.recoveryfarm, other.getRecoveryfarm()))) &&
            ((this.sessionreliability==null && other.getSessionreliability()==null) || 
             (this.sessionreliability!=null &&
              this.sessionreliability.equals(other.getSessionreliability()))) &&
            ((this.usetwotickets==null && other.getUsetwotickets()==null) || 
             (this.usetwotickets!=null &&
              this.usetwotickets.equals(other.getUsetwotickets()))) &&
            ((this.secondstaurl==null && other.getSecondstaurl()==null) || 
             (this.secondstaurl!=null &&
              this.secondstaurl.equals(other.getSecondstaurl()))) &&
            ((this.loadbalance==null && other.getLoadbalance()==null) || 
             (this.loadbalance!=null &&
              java.util.Arrays.equals(this.loadbalance, other.getLoadbalance()))) &&
            ((this.authenticationpoint==null && other.getAuthenticationpoint()==null) || 
             (this.authenticationpoint!=null &&
              this.authenticationpoint.equals(other.getAuthenticationpoint()))) &&
            ((this.kioskmode==null && other.getKioskmode()==null) || 
             (this.kioskmode!=null &&
              this.kioskmode.equals(other.getKioskmode())));
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
        if (getSitepath() != null) {
            _hashCode += getSitepath().hashCode();
        }
        if (getAgurl() != null) {
            _hashCode += getAgurl().hashCode();
        }
        if (getStaurl() != null) {
            _hashCode += getStaurl().hashCode();
        }
        if (getWiauthenticationmethods() != null) {
            _hashCode += getWiauthenticationmethods().hashCode();
        }
        if (getLogintitle() != null) {
            _hashCode += getLogintitle().hashCode();
        }
        if (getAppwelcomemessage() != null) {
            _hashCode += getAppwelcomemessage().hashCode();
        }
        if (getWelcomemessage() != null) {
            _hashCode += getWelcomemessage().hashCode();
        }
        if (getFootertext() != null) {
            _hashCode += getFootertext().hashCode();
        }
        if (getLoginsysmessage() != null) {
            _hashCode += getLoginsysmessage().hashCode();
        }
        if (getPreloginbutton() != null) {
            _hashCode += getPreloginbutton().hashCode();
        }
        if (getPreloginmessage() != null) {
            _hashCode += getPreloginmessage().hashCode();
        }
        if (getPrelogintitle() != null) {
            _hashCode += getPrelogintitle().hashCode();
        }
        if (getDomainselection() != null) {
            _hashCode += getDomainselection().hashCode();
        }
        if (getDefaultcustomtextlocale() != null) {
            _hashCode += getDefaultcustomtextlocale().hashCode();
        }
        if (getWebsessiontimeout() != null) {
            _hashCode += getWebsessiontimeout().hashCode();
        }
        if (getSitetype() != null) {
            _hashCode += getSitetype().hashCode();
        }
        if (getUserinterfacebranding() != null) {
            _hashCode += getUserinterfacebranding().hashCode();
        }
        if (getShowsearch() != null) {
            _hashCode += getShowsearch().hashCode();
        }
        if (getShowrefresh() != null) {
            _hashCode += getShowrefresh().hashCode();
        }
        if (getWiuserinterfacemodes() != null) {
            _hashCode += getWiuserinterfacemodes().hashCode();
        }
        if (getUserinterfacelayouts() != null) {
            _hashCode += getUserinterfacelayouts().hashCode();
        }
        if (getPublishedresourcetype() != null) {
            _hashCode += getPublishedresourcetype().hashCode();
        }
        if (getDefaultaccessmethod() != null) {
            _hashCode += getDefaultaccessmethod().hashCode();
        }
        if (getFarmname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFarmname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFarmname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccessmethod() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccessmethod());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccessmethod(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClientipaddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClientipaddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClientipaddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClientnetmask() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClientnetmask());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClientnetmask(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranslationinternalip() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranslationinternalip());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranslationinternalip(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranslationinternalport() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranslationinternalport());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranslationinternalport(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranslationexternalip() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranslationexternalip());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranslationexternalip(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranslationexternalport() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTranslationexternalport());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTranslationexternalport(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccesstype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccesstype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccesstype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlserveraddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlserveraddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlserveraddresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXmlport() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXmlport());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXmlport(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransport() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransport());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransport(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSslrelayport() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSslrelayport());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSslrelayport(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAgauthenticationmethod() != null) {
            _hashCode += getAgauthenticationmethod().hashCode();
        }
        if (getGroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRecoveryfarm() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecoveryfarm());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecoveryfarm(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSessionreliability() != null) {
            _hashCode += getSessionreliability().hashCode();
        }
        if (getUsetwotickets() != null) {
            _hashCode += getUsetwotickets().hashCode();
        }
        if (getSecondstaurl() != null) {
            _hashCode += getSecondstaurl().hashCode();
        }
        if (getLoadbalance() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLoadbalance());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLoadbalance(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuthenticationpoint() != null) {
            _hashCode += getAuthenticationpoint().hashCode();
        }
        if (getKioskmode() != null) {
            _hashCode += getKioskmode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Wisite.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "wisite"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitepath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sitepath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agurl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agurl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staurl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "staurl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wiauthenticationmethods");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wiauthenticationmethods"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logintitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logintitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appwelcomemessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appwelcomemessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("welcomemessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "welcomemessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("footertext");
        elemField.setXmlName(new javax.xml.namespace.QName("", "footertext"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginsysmessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loginsysmessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preloginbutton");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preloginbutton"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preloginmessage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preloginmessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prelogintitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prelogintitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainselection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domainselection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultcustomtextlocale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultcustomtextlocale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("websessiontimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "websessiontimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sitetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userinterfacebranding");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userinterfacebranding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showsearch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showsearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showrefresh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showrefresh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wiuserinterfacemodes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wiuserinterfacemodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userinterfacelayouts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userinterfacelayouts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishedresourcetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publishedresourcetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultaccessmethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultaccessmethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("farmname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "farmname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessmethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accessmethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientipaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientipaddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientnetmask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientnetmask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translationinternalip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "translationinternalip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translationinternalport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "translationinternalport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translationexternalip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "translationexternalip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translationexternalport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "translationexternalport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accesstype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accesstype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlserveraddresses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlserveraddresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmlport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmlport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslrelayport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sslrelayport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agauthenticationmethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agauthenticationmethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groups");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recoveryfarm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recoveryfarm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionreliability");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionreliability"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usetwotickets");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usetwotickets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondstaurl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondstaurl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loadbalance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loadbalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authenticationpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authenticationpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kioskmode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kioskmode"));
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
