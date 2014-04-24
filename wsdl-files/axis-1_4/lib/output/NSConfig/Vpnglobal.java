/**
 * Vpnglobal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Vpnglobal  implements java.io.Serializable {
    private java.lang.String policyname;

    private org.apache.axis.types.UnsignedInt priority;

    private java.lang.String[] intranetdomain;

    private java.lang.String[] intranetapplication;

    private java.lang.String[] nexthopserver;

    private java.lang.String[] urlname;

    private java.lang.String[] intranetip;

    private java.lang.String[] netmask;

    private java.lang.String[] staserver;

    private java.lang.String[] staauthid;

    private java.lang.String[] appcontroller;

    private java.lang.String[] sharefile;

    private java.lang.String type;

    private java.lang.String builtin;

    private boolean secondary;

    private boolean groupextraction;

    private java.lang.String[] auditpolicyname;

    private org.apache.axis.types.UnsignedInt[] auditpolicypriority;

    private org.apache.axis.types.UnsignedInt[] auditpolicysubtype;

    private java.lang.String[] sessionpolicyname;

    private org.apache.axis.types.UnsignedInt[] sessionpolicypriority;

    private java.lang.String[] sessionpolicybuiltin;

    private java.lang.String[] radiusauthpolicyname;

    private org.apache.axis.types.UnsignedInt[] radiusauthpolicypriority;

    private boolean[] radiusauthpolicysecondary;

    private java.lang.String[] ldapauthpolicyname;

    private org.apache.axis.types.UnsignedInt[] ldapauthpolicypriority;

    private boolean[] ldapauthpolicysecondary;

    private boolean[] ldapauthpolicygroupextraction;

    private java.lang.String[] certauthpolicyname;

    private org.apache.axis.types.UnsignedInt[] certauthpolicypriority;

    private boolean[] certauthpolicysecondary;

    private java.lang.String[] tacacsauthpolicyname;

    private org.apache.axis.types.UnsignedInt[] tacacsauthpolicypriority;

    private boolean[] tacacsauthpolicysecondary;

    private java.lang.String[] localauthpolicyname;

    private org.apache.axis.types.UnsignedInt[] localauthpolicypriority;

    private boolean[] localauthpolicysecondary;

    private java.lang.String[] negauthpolicyname;

    private org.apache.axis.types.UnsignedInt[] negauthpolicypriority;

    private boolean[] negauthpolicysecondary;

    private java.lang.String[] samlauthpolicyname;

    private org.apache.axis.types.UnsignedInt[] samlauthpolicypriority;

    private boolean[] samlauthpolicysecondary;

    private java.lang.String[] trafficpolicyname;

    private org.apache.axis.types.UnsignedInt[] trafficpolicypriority;

    private java.lang.String[] cvpnpolicyname;

    private org.apache.axis.types.UnsignedInt[] cvpnpriority;

    private java.lang.String[] cvpnbindpoint;

    private java.lang.String[] clientlesspolicybuiltin;

    public Vpnglobal() {
    }

    public Vpnglobal(
           java.lang.String policyname,
           org.apache.axis.types.UnsignedInt priority,
           java.lang.String[] intranetdomain,
           java.lang.String[] intranetapplication,
           java.lang.String[] nexthopserver,
           java.lang.String[] urlname,
           java.lang.String[] intranetip,
           java.lang.String[] netmask,
           java.lang.String[] staserver,
           java.lang.String[] staauthid,
           java.lang.String[] appcontroller,
           java.lang.String[] sharefile,
           java.lang.String type,
           java.lang.String builtin,
           boolean secondary,
           boolean groupextraction,
           java.lang.String[] auditpolicyname,
           org.apache.axis.types.UnsignedInt[] auditpolicypriority,
           org.apache.axis.types.UnsignedInt[] auditpolicysubtype,
           java.lang.String[] sessionpolicyname,
           org.apache.axis.types.UnsignedInt[] sessionpolicypriority,
           java.lang.String[] sessionpolicybuiltin,
           java.lang.String[] radiusauthpolicyname,
           org.apache.axis.types.UnsignedInt[] radiusauthpolicypriority,
           boolean[] radiusauthpolicysecondary,
           java.lang.String[] ldapauthpolicyname,
           org.apache.axis.types.UnsignedInt[] ldapauthpolicypriority,
           boolean[] ldapauthpolicysecondary,
           boolean[] ldapauthpolicygroupextraction,
           java.lang.String[] certauthpolicyname,
           org.apache.axis.types.UnsignedInt[] certauthpolicypriority,
           boolean[] certauthpolicysecondary,
           java.lang.String[] tacacsauthpolicyname,
           org.apache.axis.types.UnsignedInt[] tacacsauthpolicypriority,
           boolean[] tacacsauthpolicysecondary,
           java.lang.String[] localauthpolicyname,
           org.apache.axis.types.UnsignedInt[] localauthpolicypriority,
           boolean[] localauthpolicysecondary,
           java.lang.String[] negauthpolicyname,
           org.apache.axis.types.UnsignedInt[] negauthpolicypriority,
           boolean[] negauthpolicysecondary,
           java.lang.String[] samlauthpolicyname,
           org.apache.axis.types.UnsignedInt[] samlauthpolicypriority,
           boolean[] samlauthpolicysecondary,
           java.lang.String[] trafficpolicyname,
           org.apache.axis.types.UnsignedInt[] trafficpolicypriority,
           java.lang.String[] cvpnpolicyname,
           org.apache.axis.types.UnsignedInt[] cvpnpriority,
           java.lang.String[] cvpnbindpoint,
           java.lang.String[] clientlesspolicybuiltin) {
           this.policyname = policyname;
           this.priority = priority;
           this.intranetdomain = intranetdomain;
           this.intranetapplication = intranetapplication;
           this.nexthopserver = nexthopserver;
           this.urlname = urlname;
           this.intranetip = intranetip;
           this.netmask = netmask;
           this.staserver = staserver;
           this.staauthid = staauthid;
           this.appcontroller = appcontroller;
           this.sharefile = sharefile;
           this.type = type;
           this.builtin = builtin;
           this.secondary = secondary;
           this.groupextraction = groupextraction;
           this.auditpolicyname = auditpolicyname;
           this.auditpolicypriority = auditpolicypriority;
           this.auditpolicysubtype = auditpolicysubtype;
           this.sessionpolicyname = sessionpolicyname;
           this.sessionpolicypriority = sessionpolicypriority;
           this.sessionpolicybuiltin = sessionpolicybuiltin;
           this.radiusauthpolicyname = radiusauthpolicyname;
           this.radiusauthpolicypriority = radiusauthpolicypriority;
           this.radiusauthpolicysecondary = radiusauthpolicysecondary;
           this.ldapauthpolicyname = ldapauthpolicyname;
           this.ldapauthpolicypriority = ldapauthpolicypriority;
           this.ldapauthpolicysecondary = ldapauthpolicysecondary;
           this.ldapauthpolicygroupextraction = ldapauthpolicygroupextraction;
           this.certauthpolicyname = certauthpolicyname;
           this.certauthpolicypriority = certauthpolicypriority;
           this.certauthpolicysecondary = certauthpolicysecondary;
           this.tacacsauthpolicyname = tacacsauthpolicyname;
           this.tacacsauthpolicypriority = tacacsauthpolicypriority;
           this.tacacsauthpolicysecondary = tacacsauthpolicysecondary;
           this.localauthpolicyname = localauthpolicyname;
           this.localauthpolicypriority = localauthpolicypriority;
           this.localauthpolicysecondary = localauthpolicysecondary;
           this.negauthpolicyname = negauthpolicyname;
           this.negauthpolicypriority = negauthpolicypriority;
           this.negauthpolicysecondary = negauthpolicysecondary;
           this.samlauthpolicyname = samlauthpolicyname;
           this.samlauthpolicypriority = samlauthpolicypriority;
           this.samlauthpolicysecondary = samlauthpolicysecondary;
           this.trafficpolicyname = trafficpolicyname;
           this.trafficpolicypriority = trafficpolicypriority;
           this.cvpnpolicyname = cvpnpolicyname;
           this.cvpnpriority = cvpnpriority;
           this.cvpnbindpoint = cvpnbindpoint;
           this.clientlesspolicybuiltin = clientlesspolicybuiltin;
    }


    /**
     * Gets the policyname value for this Vpnglobal.
     * 
     * @return policyname
     */
    public java.lang.String getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Vpnglobal.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the priority value for this Vpnglobal.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Vpnglobal.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the intranetdomain value for this Vpnglobal.
     * 
     * @return intranetdomain
     */
    public java.lang.String[] getIntranetdomain() {
        return intranetdomain;
    }


    /**
     * Sets the intranetdomain value for this Vpnglobal.
     * 
     * @param intranetdomain
     */
    public void setIntranetdomain(java.lang.String[] intranetdomain) {
        this.intranetdomain = intranetdomain;
    }


    /**
     * Gets the intranetapplication value for this Vpnglobal.
     * 
     * @return intranetapplication
     */
    public java.lang.String[] getIntranetapplication() {
        return intranetapplication;
    }


    /**
     * Sets the intranetapplication value for this Vpnglobal.
     * 
     * @param intranetapplication
     */
    public void setIntranetapplication(java.lang.String[] intranetapplication) {
        this.intranetapplication = intranetapplication;
    }


    /**
     * Gets the nexthopserver value for this Vpnglobal.
     * 
     * @return nexthopserver
     */
    public java.lang.String[] getNexthopserver() {
        return nexthopserver;
    }


    /**
     * Sets the nexthopserver value for this Vpnglobal.
     * 
     * @param nexthopserver
     */
    public void setNexthopserver(java.lang.String[] nexthopserver) {
        this.nexthopserver = nexthopserver;
    }


    /**
     * Gets the urlname value for this Vpnglobal.
     * 
     * @return urlname
     */
    public java.lang.String[] getUrlname() {
        return urlname;
    }


    /**
     * Sets the urlname value for this Vpnglobal.
     * 
     * @param urlname
     */
    public void setUrlname(java.lang.String[] urlname) {
        this.urlname = urlname;
    }


    /**
     * Gets the intranetip value for this Vpnglobal.
     * 
     * @return intranetip
     */
    public java.lang.String[] getIntranetip() {
        return intranetip;
    }


    /**
     * Sets the intranetip value for this Vpnglobal.
     * 
     * @param intranetip
     */
    public void setIntranetip(java.lang.String[] intranetip) {
        this.intranetip = intranetip;
    }


    /**
     * Gets the netmask value for this Vpnglobal.
     * 
     * @return netmask
     */
    public java.lang.String[] getNetmask() {
        return netmask;
    }


    /**
     * Sets the netmask value for this Vpnglobal.
     * 
     * @param netmask
     */
    public void setNetmask(java.lang.String[] netmask) {
        this.netmask = netmask;
    }


    /**
     * Gets the staserver value for this Vpnglobal.
     * 
     * @return staserver
     */
    public java.lang.String[] getStaserver() {
        return staserver;
    }


    /**
     * Sets the staserver value for this Vpnglobal.
     * 
     * @param staserver
     */
    public void setStaserver(java.lang.String[] staserver) {
        this.staserver = staserver;
    }


    /**
     * Gets the staauthid value for this Vpnglobal.
     * 
     * @return staauthid
     */
    public java.lang.String[] getStaauthid() {
        return staauthid;
    }


    /**
     * Sets the staauthid value for this Vpnglobal.
     * 
     * @param staauthid
     */
    public void setStaauthid(java.lang.String[] staauthid) {
        this.staauthid = staauthid;
    }


    /**
     * Gets the appcontroller value for this Vpnglobal.
     * 
     * @return appcontroller
     */
    public java.lang.String[] getAppcontroller() {
        return appcontroller;
    }


    /**
     * Sets the appcontroller value for this Vpnglobal.
     * 
     * @param appcontroller
     */
    public void setAppcontroller(java.lang.String[] appcontroller) {
        this.appcontroller = appcontroller;
    }


    /**
     * Gets the sharefile value for this Vpnglobal.
     * 
     * @return sharefile
     */
    public java.lang.String[] getSharefile() {
        return sharefile;
    }


    /**
     * Sets the sharefile value for this Vpnglobal.
     * 
     * @param sharefile
     */
    public void setSharefile(java.lang.String[] sharefile) {
        this.sharefile = sharefile;
    }


    /**
     * Gets the type value for this Vpnglobal.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Vpnglobal.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the builtin value for this Vpnglobal.
     * 
     * @return builtin
     */
    public java.lang.String getBuiltin() {
        return builtin;
    }


    /**
     * Sets the builtin value for this Vpnglobal.
     * 
     * @param builtin
     */
    public void setBuiltin(java.lang.String builtin) {
        this.builtin = builtin;
    }


    /**
     * Gets the secondary value for this Vpnglobal.
     * 
     * @return secondary
     */
    public boolean isSecondary() {
        return secondary;
    }


    /**
     * Sets the secondary value for this Vpnglobal.
     * 
     * @param secondary
     */
    public void setSecondary(boolean secondary) {
        this.secondary = secondary;
    }


    /**
     * Gets the groupextraction value for this Vpnglobal.
     * 
     * @return groupextraction
     */
    public boolean isGroupextraction() {
        return groupextraction;
    }


    /**
     * Sets the groupextraction value for this Vpnglobal.
     * 
     * @param groupextraction
     */
    public void setGroupextraction(boolean groupextraction) {
        this.groupextraction = groupextraction;
    }


    /**
     * Gets the auditpolicyname value for this Vpnglobal.
     * 
     * @return auditpolicyname
     */
    public java.lang.String[] getAuditpolicyname() {
        return auditpolicyname;
    }


    /**
     * Sets the auditpolicyname value for this Vpnglobal.
     * 
     * @param auditpolicyname
     */
    public void setAuditpolicyname(java.lang.String[] auditpolicyname) {
        this.auditpolicyname = auditpolicyname;
    }


    /**
     * Gets the auditpolicypriority value for this Vpnglobal.
     * 
     * @return auditpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getAuditpolicypriority() {
        return auditpolicypriority;
    }


    /**
     * Sets the auditpolicypriority value for this Vpnglobal.
     * 
     * @param auditpolicypriority
     */
    public void setAuditpolicypriority(org.apache.axis.types.UnsignedInt[] auditpolicypriority) {
        this.auditpolicypriority = auditpolicypriority;
    }


    /**
     * Gets the auditpolicysubtype value for this Vpnglobal.
     * 
     * @return auditpolicysubtype
     */
    public org.apache.axis.types.UnsignedInt[] getAuditpolicysubtype() {
        return auditpolicysubtype;
    }


    /**
     * Sets the auditpolicysubtype value for this Vpnglobal.
     * 
     * @param auditpolicysubtype
     */
    public void setAuditpolicysubtype(org.apache.axis.types.UnsignedInt[] auditpolicysubtype) {
        this.auditpolicysubtype = auditpolicysubtype;
    }


    /**
     * Gets the sessionpolicyname value for this Vpnglobal.
     * 
     * @return sessionpolicyname
     */
    public java.lang.String[] getSessionpolicyname() {
        return sessionpolicyname;
    }


    /**
     * Sets the sessionpolicyname value for this Vpnglobal.
     * 
     * @param sessionpolicyname
     */
    public void setSessionpolicyname(java.lang.String[] sessionpolicyname) {
        this.sessionpolicyname = sessionpolicyname;
    }


    /**
     * Gets the sessionpolicypriority value for this Vpnglobal.
     * 
     * @return sessionpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getSessionpolicypriority() {
        return sessionpolicypriority;
    }


    /**
     * Sets the sessionpolicypriority value for this Vpnglobal.
     * 
     * @param sessionpolicypriority
     */
    public void setSessionpolicypriority(org.apache.axis.types.UnsignedInt[] sessionpolicypriority) {
        this.sessionpolicypriority = sessionpolicypriority;
    }


    /**
     * Gets the sessionpolicybuiltin value for this Vpnglobal.
     * 
     * @return sessionpolicybuiltin
     */
    public java.lang.String[] getSessionpolicybuiltin() {
        return sessionpolicybuiltin;
    }


    /**
     * Sets the sessionpolicybuiltin value for this Vpnglobal.
     * 
     * @param sessionpolicybuiltin
     */
    public void setSessionpolicybuiltin(java.lang.String[] sessionpolicybuiltin) {
        this.sessionpolicybuiltin = sessionpolicybuiltin;
    }


    /**
     * Gets the radiusauthpolicyname value for this Vpnglobal.
     * 
     * @return radiusauthpolicyname
     */
    public java.lang.String[] getRadiusauthpolicyname() {
        return radiusauthpolicyname;
    }


    /**
     * Sets the radiusauthpolicyname value for this Vpnglobal.
     * 
     * @param radiusauthpolicyname
     */
    public void setRadiusauthpolicyname(java.lang.String[] radiusauthpolicyname) {
        this.radiusauthpolicyname = radiusauthpolicyname;
    }


    /**
     * Gets the radiusauthpolicypriority value for this Vpnglobal.
     * 
     * @return radiusauthpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getRadiusauthpolicypriority() {
        return radiusauthpolicypriority;
    }


    /**
     * Sets the radiusauthpolicypriority value for this Vpnglobal.
     * 
     * @param radiusauthpolicypriority
     */
    public void setRadiusauthpolicypriority(org.apache.axis.types.UnsignedInt[] radiusauthpolicypriority) {
        this.radiusauthpolicypriority = radiusauthpolicypriority;
    }


    /**
     * Gets the radiusauthpolicysecondary value for this Vpnglobal.
     * 
     * @return radiusauthpolicysecondary
     */
    public boolean[] getRadiusauthpolicysecondary() {
        return radiusauthpolicysecondary;
    }


    /**
     * Sets the radiusauthpolicysecondary value for this Vpnglobal.
     * 
     * @param radiusauthpolicysecondary
     */
    public void setRadiusauthpolicysecondary(boolean[] radiusauthpolicysecondary) {
        this.radiusauthpolicysecondary = radiusauthpolicysecondary;
    }


    /**
     * Gets the ldapauthpolicyname value for this Vpnglobal.
     * 
     * @return ldapauthpolicyname
     */
    public java.lang.String[] getLdapauthpolicyname() {
        return ldapauthpolicyname;
    }


    /**
     * Sets the ldapauthpolicyname value for this Vpnglobal.
     * 
     * @param ldapauthpolicyname
     */
    public void setLdapauthpolicyname(java.lang.String[] ldapauthpolicyname) {
        this.ldapauthpolicyname = ldapauthpolicyname;
    }


    /**
     * Gets the ldapauthpolicypriority value for this Vpnglobal.
     * 
     * @return ldapauthpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getLdapauthpolicypriority() {
        return ldapauthpolicypriority;
    }


    /**
     * Sets the ldapauthpolicypriority value for this Vpnglobal.
     * 
     * @param ldapauthpolicypriority
     */
    public void setLdapauthpolicypriority(org.apache.axis.types.UnsignedInt[] ldapauthpolicypriority) {
        this.ldapauthpolicypriority = ldapauthpolicypriority;
    }


    /**
     * Gets the ldapauthpolicysecondary value for this Vpnglobal.
     * 
     * @return ldapauthpolicysecondary
     */
    public boolean[] getLdapauthpolicysecondary() {
        return ldapauthpolicysecondary;
    }


    /**
     * Sets the ldapauthpolicysecondary value for this Vpnglobal.
     * 
     * @param ldapauthpolicysecondary
     */
    public void setLdapauthpolicysecondary(boolean[] ldapauthpolicysecondary) {
        this.ldapauthpolicysecondary = ldapauthpolicysecondary;
    }


    /**
     * Gets the ldapauthpolicygroupextraction value for this Vpnglobal.
     * 
     * @return ldapauthpolicygroupextraction
     */
    public boolean[] getLdapauthpolicygroupextraction() {
        return ldapauthpolicygroupextraction;
    }


    /**
     * Sets the ldapauthpolicygroupextraction value for this Vpnglobal.
     * 
     * @param ldapauthpolicygroupextraction
     */
    public void setLdapauthpolicygroupextraction(boolean[] ldapauthpolicygroupextraction) {
        this.ldapauthpolicygroupextraction = ldapauthpolicygroupextraction;
    }


    /**
     * Gets the certauthpolicyname value for this Vpnglobal.
     * 
     * @return certauthpolicyname
     */
    public java.lang.String[] getCertauthpolicyname() {
        return certauthpolicyname;
    }


    /**
     * Sets the certauthpolicyname value for this Vpnglobal.
     * 
     * @param certauthpolicyname
     */
    public void setCertauthpolicyname(java.lang.String[] certauthpolicyname) {
        this.certauthpolicyname = certauthpolicyname;
    }


    /**
     * Gets the certauthpolicypriority value for this Vpnglobal.
     * 
     * @return certauthpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getCertauthpolicypriority() {
        return certauthpolicypriority;
    }


    /**
     * Sets the certauthpolicypriority value for this Vpnglobal.
     * 
     * @param certauthpolicypriority
     */
    public void setCertauthpolicypriority(org.apache.axis.types.UnsignedInt[] certauthpolicypriority) {
        this.certauthpolicypriority = certauthpolicypriority;
    }


    /**
     * Gets the certauthpolicysecondary value for this Vpnglobal.
     * 
     * @return certauthpolicysecondary
     */
    public boolean[] getCertauthpolicysecondary() {
        return certauthpolicysecondary;
    }


    /**
     * Sets the certauthpolicysecondary value for this Vpnglobal.
     * 
     * @param certauthpolicysecondary
     */
    public void setCertauthpolicysecondary(boolean[] certauthpolicysecondary) {
        this.certauthpolicysecondary = certauthpolicysecondary;
    }


    /**
     * Gets the tacacsauthpolicyname value for this Vpnglobal.
     * 
     * @return tacacsauthpolicyname
     */
    public java.lang.String[] getTacacsauthpolicyname() {
        return tacacsauthpolicyname;
    }


    /**
     * Sets the tacacsauthpolicyname value for this Vpnglobal.
     * 
     * @param tacacsauthpolicyname
     */
    public void setTacacsauthpolicyname(java.lang.String[] tacacsauthpolicyname) {
        this.tacacsauthpolicyname = tacacsauthpolicyname;
    }


    /**
     * Gets the tacacsauthpolicypriority value for this Vpnglobal.
     * 
     * @return tacacsauthpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getTacacsauthpolicypriority() {
        return tacacsauthpolicypriority;
    }


    /**
     * Sets the tacacsauthpolicypriority value for this Vpnglobal.
     * 
     * @param tacacsauthpolicypriority
     */
    public void setTacacsauthpolicypriority(org.apache.axis.types.UnsignedInt[] tacacsauthpolicypriority) {
        this.tacacsauthpolicypriority = tacacsauthpolicypriority;
    }


    /**
     * Gets the tacacsauthpolicysecondary value for this Vpnglobal.
     * 
     * @return tacacsauthpolicysecondary
     */
    public boolean[] getTacacsauthpolicysecondary() {
        return tacacsauthpolicysecondary;
    }


    /**
     * Sets the tacacsauthpolicysecondary value for this Vpnglobal.
     * 
     * @param tacacsauthpolicysecondary
     */
    public void setTacacsauthpolicysecondary(boolean[] tacacsauthpolicysecondary) {
        this.tacacsauthpolicysecondary = tacacsauthpolicysecondary;
    }


    /**
     * Gets the localauthpolicyname value for this Vpnglobal.
     * 
     * @return localauthpolicyname
     */
    public java.lang.String[] getLocalauthpolicyname() {
        return localauthpolicyname;
    }


    /**
     * Sets the localauthpolicyname value for this Vpnglobal.
     * 
     * @param localauthpolicyname
     */
    public void setLocalauthpolicyname(java.lang.String[] localauthpolicyname) {
        this.localauthpolicyname = localauthpolicyname;
    }


    /**
     * Gets the localauthpolicypriority value for this Vpnglobal.
     * 
     * @return localauthpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getLocalauthpolicypriority() {
        return localauthpolicypriority;
    }


    /**
     * Sets the localauthpolicypriority value for this Vpnglobal.
     * 
     * @param localauthpolicypriority
     */
    public void setLocalauthpolicypriority(org.apache.axis.types.UnsignedInt[] localauthpolicypriority) {
        this.localauthpolicypriority = localauthpolicypriority;
    }


    /**
     * Gets the localauthpolicysecondary value for this Vpnglobal.
     * 
     * @return localauthpolicysecondary
     */
    public boolean[] getLocalauthpolicysecondary() {
        return localauthpolicysecondary;
    }


    /**
     * Sets the localauthpolicysecondary value for this Vpnglobal.
     * 
     * @param localauthpolicysecondary
     */
    public void setLocalauthpolicysecondary(boolean[] localauthpolicysecondary) {
        this.localauthpolicysecondary = localauthpolicysecondary;
    }


    /**
     * Gets the negauthpolicyname value for this Vpnglobal.
     * 
     * @return negauthpolicyname
     */
    public java.lang.String[] getNegauthpolicyname() {
        return negauthpolicyname;
    }


    /**
     * Sets the negauthpolicyname value for this Vpnglobal.
     * 
     * @param negauthpolicyname
     */
    public void setNegauthpolicyname(java.lang.String[] negauthpolicyname) {
        this.negauthpolicyname = negauthpolicyname;
    }


    /**
     * Gets the negauthpolicypriority value for this Vpnglobal.
     * 
     * @return negauthpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getNegauthpolicypriority() {
        return negauthpolicypriority;
    }


    /**
     * Sets the negauthpolicypriority value for this Vpnglobal.
     * 
     * @param negauthpolicypriority
     */
    public void setNegauthpolicypriority(org.apache.axis.types.UnsignedInt[] negauthpolicypriority) {
        this.negauthpolicypriority = negauthpolicypriority;
    }


    /**
     * Gets the negauthpolicysecondary value for this Vpnglobal.
     * 
     * @return negauthpolicysecondary
     */
    public boolean[] getNegauthpolicysecondary() {
        return negauthpolicysecondary;
    }


    /**
     * Sets the negauthpolicysecondary value for this Vpnglobal.
     * 
     * @param negauthpolicysecondary
     */
    public void setNegauthpolicysecondary(boolean[] negauthpolicysecondary) {
        this.negauthpolicysecondary = negauthpolicysecondary;
    }


    /**
     * Gets the samlauthpolicyname value for this Vpnglobal.
     * 
     * @return samlauthpolicyname
     */
    public java.lang.String[] getSamlauthpolicyname() {
        return samlauthpolicyname;
    }


    /**
     * Sets the samlauthpolicyname value for this Vpnglobal.
     * 
     * @param samlauthpolicyname
     */
    public void setSamlauthpolicyname(java.lang.String[] samlauthpolicyname) {
        this.samlauthpolicyname = samlauthpolicyname;
    }


    /**
     * Gets the samlauthpolicypriority value for this Vpnglobal.
     * 
     * @return samlauthpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getSamlauthpolicypriority() {
        return samlauthpolicypriority;
    }


    /**
     * Sets the samlauthpolicypriority value for this Vpnglobal.
     * 
     * @param samlauthpolicypriority
     */
    public void setSamlauthpolicypriority(org.apache.axis.types.UnsignedInt[] samlauthpolicypriority) {
        this.samlauthpolicypriority = samlauthpolicypriority;
    }


    /**
     * Gets the samlauthpolicysecondary value for this Vpnglobal.
     * 
     * @return samlauthpolicysecondary
     */
    public boolean[] getSamlauthpolicysecondary() {
        return samlauthpolicysecondary;
    }


    /**
     * Sets the samlauthpolicysecondary value for this Vpnglobal.
     * 
     * @param samlauthpolicysecondary
     */
    public void setSamlauthpolicysecondary(boolean[] samlauthpolicysecondary) {
        this.samlauthpolicysecondary = samlauthpolicysecondary;
    }


    /**
     * Gets the trafficpolicyname value for this Vpnglobal.
     * 
     * @return trafficpolicyname
     */
    public java.lang.String[] getTrafficpolicyname() {
        return trafficpolicyname;
    }


    /**
     * Sets the trafficpolicyname value for this Vpnglobal.
     * 
     * @param trafficpolicyname
     */
    public void setTrafficpolicyname(java.lang.String[] trafficpolicyname) {
        this.trafficpolicyname = trafficpolicyname;
    }


    /**
     * Gets the trafficpolicypriority value for this Vpnglobal.
     * 
     * @return trafficpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getTrafficpolicypriority() {
        return trafficpolicypriority;
    }


    /**
     * Sets the trafficpolicypriority value for this Vpnglobal.
     * 
     * @param trafficpolicypriority
     */
    public void setTrafficpolicypriority(org.apache.axis.types.UnsignedInt[] trafficpolicypriority) {
        this.trafficpolicypriority = trafficpolicypriority;
    }


    /**
     * Gets the cvpnpolicyname value for this Vpnglobal.
     * 
     * @return cvpnpolicyname
     */
    public java.lang.String[] getCvpnpolicyname() {
        return cvpnpolicyname;
    }


    /**
     * Sets the cvpnpolicyname value for this Vpnglobal.
     * 
     * @param cvpnpolicyname
     */
    public void setCvpnpolicyname(java.lang.String[] cvpnpolicyname) {
        this.cvpnpolicyname = cvpnpolicyname;
    }


    /**
     * Gets the cvpnpriority value for this Vpnglobal.
     * 
     * @return cvpnpriority
     */
    public org.apache.axis.types.UnsignedInt[] getCvpnpriority() {
        return cvpnpriority;
    }


    /**
     * Sets the cvpnpriority value for this Vpnglobal.
     * 
     * @param cvpnpriority
     */
    public void setCvpnpriority(org.apache.axis.types.UnsignedInt[] cvpnpriority) {
        this.cvpnpriority = cvpnpriority;
    }


    /**
     * Gets the cvpnbindpoint value for this Vpnglobal.
     * 
     * @return cvpnbindpoint
     */
    public java.lang.String[] getCvpnbindpoint() {
        return cvpnbindpoint;
    }


    /**
     * Sets the cvpnbindpoint value for this Vpnglobal.
     * 
     * @param cvpnbindpoint
     */
    public void setCvpnbindpoint(java.lang.String[] cvpnbindpoint) {
        this.cvpnbindpoint = cvpnbindpoint;
    }


    /**
     * Gets the clientlesspolicybuiltin value for this Vpnglobal.
     * 
     * @return clientlesspolicybuiltin
     */
    public java.lang.String[] getClientlesspolicybuiltin() {
        return clientlesspolicybuiltin;
    }


    /**
     * Sets the clientlesspolicybuiltin value for this Vpnglobal.
     * 
     * @param clientlesspolicybuiltin
     */
    public void setClientlesspolicybuiltin(java.lang.String[] clientlesspolicybuiltin) {
        this.clientlesspolicybuiltin = clientlesspolicybuiltin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Vpnglobal)) return false;
        Vpnglobal other = (Vpnglobal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.policyname==null && other.getPolicyname()==null) || 
             (this.policyname!=null &&
              this.policyname.equals(other.getPolicyname()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.intranetdomain==null && other.getIntranetdomain()==null) || 
             (this.intranetdomain!=null &&
              java.util.Arrays.equals(this.intranetdomain, other.getIntranetdomain()))) &&
            ((this.intranetapplication==null && other.getIntranetapplication()==null) || 
             (this.intranetapplication!=null &&
              java.util.Arrays.equals(this.intranetapplication, other.getIntranetapplication()))) &&
            ((this.nexthopserver==null && other.getNexthopserver()==null) || 
             (this.nexthopserver!=null &&
              java.util.Arrays.equals(this.nexthopserver, other.getNexthopserver()))) &&
            ((this.urlname==null && other.getUrlname()==null) || 
             (this.urlname!=null &&
              java.util.Arrays.equals(this.urlname, other.getUrlname()))) &&
            ((this.intranetip==null && other.getIntranetip()==null) || 
             (this.intranetip!=null &&
              java.util.Arrays.equals(this.intranetip, other.getIntranetip()))) &&
            ((this.netmask==null && other.getNetmask()==null) || 
             (this.netmask!=null &&
              java.util.Arrays.equals(this.netmask, other.getNetmask()))) &&
            ((this.staserver==null && other.getStaserver()==null) || 
             (this.staserver!=null &&
              java.util.Arrays.equals(this.staserver, other.getStaserver()))) &&
            ((this.staauthid==null && other.getStaauthid()==null) || 
             (this.staauthid!=null &&
              java.util.Arrays.equals(this.staauthid, other.getStaauthid()))) &&
            ((this.appcontroller==null && other.getAppcontroller()==null) || 
             (this.appcontroller!=null &&
              java.util.Arrays.equals(this.appcontroller, other.getAppcontroller()))) &&
            ((this.sharefile==null && other.getSharefile()==null) || 
             (this.sharefile!=null &&
              java.util.Arrays.equals(this.sharefile, other.getSharefile()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.builtin==null && other.getBuiltin()==null) || 
             (this.builtin!=null &&
              this.builtin.equals(other.getBuiltin()))) &&
            this.secondary == other.isSecondary() &&
            this.groupextraction == other.isGroupextraction() &&
            ((this.auditpolicyname==null && other.getAuditpolicyname()==null) || 
             (this.auditpolicyname!=null &&
              java.util.Arrays.equals(this.auditpolicyname, other.getAuditpolicyname()))) &&
            ((this.auditpolicypriority==null && other.getAuditpolicypriority()==null) || 
             (this.auditpolicypriority!=null &&
              java.util.Arrays.equals(this.auditpolicypriority, other.getAuditpolicypriority()))) &&
            ((this.auditpolicysubtype==null && other.getAuditpolicysubtype()==null) || 
             (this.auditpolicysubtype!=null &&
              java.util.Arrays.equals(this.auditpolicysubtype, other.getAuditpolicysubtype()))) &&
            ((this.sessionpolicyname==null && other.getSessionpolicyname()==null) || 
             (this.sessionpolicyname!=null &&
              java.util.Arrays.equals(this.sessionpolicyname, other.getSessionpolicyname()))) &&
            ((this.sessionpolicypriority==null && other.getSessionpolicypriority()==null) || 
             (this.sessionpolicypriority!=null &&
              java.util.Arrays.equals(this.sessionpolicypriority, other.getSessionpolicypriority()))) &&
            ((this.sessionpolicybuiltin==null && other.getSessionpolicybuiltin()==null) || 
             (this.sessionpolicybuiltin!=null &&
              java.util.Arrays.equals(this.sessionpolicybuiltin, other.getSessionpolicybuiltin()))) &&
            ((this.radiusauthpolicyname==null && other.getRadiusauthpolicyname()==null) || 
             (this.radiusauthpolicyname!=null &&
              java.util.Arrays.equals(this.radiusauthpolicyname, other.getRadiusauthpolicyname()))) &&
            ((this.radiusauthpolicypriority==null && other.getRadiusauthpolicypriority()==null) || 
             (this.radiusauthpolicypriority!=null &&
              java.util.Arrays.equals(this.radiusauthpolicypriority, other.getRadiusauthpolicypriority()))) &&
            ((this.radiusauthpolicysecondary==null && other.getRadiusauthpolicysecondary()==null) || 
             (this.radiusauthpolicysecondary!=null &&
              java.util.Arrays.equals(this.radiusauthpolicysecondary, other.getRadiusauthpolicysecondary()))) &&
            ((this.ldapauthpolicyname==null && other.getLdapauthpolicyname()==null) || 
             (this.ldapauthpolicyname!=null &&
              java.util.Arrays.equals(this.ldapauthpolicyname, other.getLdapauthpolicyname()))) &&
            ((this.ldapauthpolicypriority==null && other.getLdapauthpolicypriority()==null) || 
             (this.ldapauthpolicypriority!=null &&
              java.util.Arrays.equals(this.ldapauthpolicypriority, other.getLdapauthpolicypriority()))) &&
            ((this.ldapauthpolicysecondary==null && other.getLdapauthpolicysecondary()==null) || 
             (this.ldapauthpolicysecondary!=null &&
              java.util.Arrays.equals(this.ldapauthpolicysecondary, other.getLdapauthpolicysecondary()))) &&
            ((this.ldapauthpolicygroupextraction==null && other.getLdapauthpolicygroupextraction()==null) || 
             (this.ldapauthpolicygroupextraction!=null &&
              java.util.Arrays.equals(this.ldapauthpolicygroupextraction, other.getLdapauthpolicygroupextraction()))) &&
            ((this.certauthpolicyname==null && other.getCertauthpolicyname()==null) || 
             (this.certauthpolicyname!=null &&
              java.util.Arrays.equals(this.certauthpolicyname, other.getCertauthpolicyname()))) &&
            ((this.certauthpolicypriority==null && other.getCertauthpolicypriority()==null) || 
             (this.certauthpolicypriority!=null &&
              java.util.Arrays.equals(this.certauthpolicypriority, other.getCertauthpolicypriority()))) &&
            ((this.certauthpolicysecondary==null && other.getCertauthpolicysecondary()==null) || 
             (this.certauthpolicysecondary!=null &&
              java.util.Arrays.equals(this.certauthpolicysecondary, other.getCertauthpolicysecondary()))) &&
            ((this.tacacsauthpolicyname==null && other.getTacacsauthpolicyname()==null) || 
             (this.tacacsauthpolicyname!=null &&
              java.util.Arrays.equals(this.tacacsauthpolicyname, other.getTacacsauthpolicyname()))) &&
            ((this.tacacsauthpolicypriority==null && other.getTacacsauthpolicypriority()==null) || 
             (this.tacacsauthpolicypriority!=null &&
              java.util.Arrays.equals(this.tacacsauthpolicypriority, other.getTacacsauthpolicypriority()))) &&
            ((this.tacacsauthpolicysecondary==null && other.getTacacsauthpolicysecondary()==null) || 
             (this.tacacsauthpolicysecondary!=null &&
              java.util.Arrays.equals(this.tacacsauthpolicysecondary, other.getTacacsauthpolicysecondary()))) &&
            ((this.localauthpolicyname==null && other.getLocalauthpolicyname()==null) || 
             (this.localauthpolicyname!=null &&
              java.util.Arrays.equals(this.localauthpolicyname, other.getLocalauthpolicyname()))) &&
            ((this.localauthpolicypriority==null && other.getLocalauthpolicypriority()==null) || 
             (this.localauthpolicypriority!=null &&
              java.util.Arrays.equals(this.localauthpolicypriority, other.getLocalauthpolicypriority()))) &&
            ((this.localauthpolicysecondary==null && other.getLocalauthpolicysecondary()==null) || 
             (this.localauthpolicysecondary!=null &&
              java.util.Arrays.equals(this.localauthpolicysecondary, other.getLocalauthpolicysecondary()))) &&
            ((this.negauthpolicyname==null && other.getNegauthpolicyname()==null) || 
             (this.negauthpolicyname!=null &&
              java.util.Arrays.equals(this.negauthpolicyname, other.getNegauthpolicyname()))) &&
            ((this.negauthpolicypriority==null && other.getNegauthpolicypriority()==null) || 
             (this.negauthpolicypriority!=null &&
              java.util.Arrays.equals(this.negauthpolicypriority, other.getNegauthpolicypriority()))) &&
            ((this.negauthpolicysecondary==null && other.getNegauthpolicysecondary()==null) || 
             (this.negauthpolicysecondary!=null &&
              java.util.Arrays.equals(this.negauthpolicysecondary, other.getNegauthpolicysecondary()))) &&
            ((this.samlauthpolicyname==null && other.getSamlauthpolicyname()==null) || 
             (this.samlauthpolicyname!=null &&
              java.util.Arrays.equals(this.samlauthpolicyname, other.getSamlauthpolicyname()))) &&
            ((this.samlauthpolicypriority==null && other.getSamlauthpolicypriority()==null) || 
             (this.samlauthpolicypriority!=null &&
              java.util.Arrays.equals(this.samlauthpolicypriority, other.getSamlauthpolicypriority()))) &&
            ((this.samlauthpolicysecondary==null && other.getSamlauthpolicysecondary()==null) || 
             (this.samlauthpolicysecondary!=null &&
              java.util.Arrays.equals(this.samlauthpolicysecondary, other.getSamlauthpolicysecondary()))) &&
            ((this.trafficpolicyname==null && other.getTrafficpolicyname()==null) || 
             (this.trafficpolicyname!=null &&
              java.util.Arrays.equals(this.trafficpolicyname, other.getTrafficpolicyname()))) &&
            ((this.trafficpolicypriority==null && other.getTrafficpolicypriority()==null) || 
             (this.trafficpolicypriority!=null &&
              java.util.Arrays.equals(this.trafficpolicypriority, other.getTrafficpolicypriority()))) &&
            ((this.cvpnpolicyname==null && other.getCvpnpolicyname()==null) || 
             (this.cvpnpolicyname!=null &&
              java.util.Arrays.equals(this.cvpnpolicyname, other.getCvpnpolicyname()))) &&
            ((this.cvpnpriority==null && other.getCvpnpriority()==null) || 
             (this.cvpnpriority!=null &&
              java.util.Arrays.equals(this.cvpnpriority, other.getCvpnpriority()))) &&
            ((this.cvpnbindpoint==null && other.getCvpnbindpoint()==null) || 
             (this.cvpnbindpoint!=null &&
              java.util.Arrays.equals(this.cvpnbindpoint, other.getCvpnbindpoint()))) &&
            ((this.clientlesspolicybuiltin==null && other.getClientlesspolicybuiltin()==null) || 
             (this.clientlesspolicybuiltin!=null &&
              java.util.Arrays.equals(this.clientlesspolicybuiltin, other.getClientlesspolicybuiltin())));
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
        if (getPolicyname() != null) {
            _hashCode += getPolicyname().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getIntranetdomain() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntranetdomain());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIntranetdomain(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIntranetapplication() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntranetapplication());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIntranetapplication(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNexthopserver() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNexthopserver());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNexthopserver(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUrlname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUrlname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUrlname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIntranetip() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntranetip());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIntranetip(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetmask() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetmask());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetmask(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStaserver() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStaserver());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStaserver(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStaauthid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStaauthid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStaauthid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppcontroller() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppcontroller());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppcontroller(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSharefile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSharefile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSharefile(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getBuiltin() != null) {
            _hashCode += getBuiltin().hashCode();
        }
        _hashCode += (isSecondary() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isGroupextraction() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAuditpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuditpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuditpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuditpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuditpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuditpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuditpolicysubtype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuditpolicysubtype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuditpolicysubtype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSessionpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSessionpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSessionpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSessionpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSessionpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSessionpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSessionpolicybuiltin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSessionpolicybuiltin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSessionpolicybuiltin(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRadiusauthpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRadiusauthpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRadiusauthpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRadiusauthpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRadiusauthpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRadiusauthpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRadiusauthpolicysecondary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRadiusauthpolicysecondary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRadiusauthpolicysecondary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLdapauthpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLdapauthpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLdapauthpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLdapauthpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLdapauthpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLdapauthpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLdapauthpolicysecondary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLdapauthpolicysecondary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLdapauthpolicysecondary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLdapauthpolicygroupextraction() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLdapauthpolicygroupextraction());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLdapauthpolicygroupextraction(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCertauthpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCertauthpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCertauthpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCertauthpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCertauthpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCertauthpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCertauthpolicysecondary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCertauthpolicysecondary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCertauthpolicysecondary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTacacsauthpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTacacsauthpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTacacsauthpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTacacsauthpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTacacsauthpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTacacsauthpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTacacsauthpolicysecondary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTacacsauthpolicysecondary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTacacsauthpolicysecondary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocalauthpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocalauthpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocalauthpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocalauthpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocalauthpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocalauthpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocalauthpolicysecondary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocalauthpolicysecondary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocalauthpolicysecondary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNegauthpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNegauthpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNegauthpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNegauthpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNegauthpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNegauthpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNegauthpolicysecondary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNegauthpolicysecondary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNegauthpolicysecondary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSamlauthpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSamlauthpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSamlauthpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSamlauthpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSamlauthpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSamlauthpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSamlauthpolicysecondary() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSamlauthpolicysecondary());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSamlauthpolicysecondary(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrafficpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrafficpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrafficpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrafficpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrafficpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrafficpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCvpnpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCvpnpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCvpnpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCvpnpriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCvpnpriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCvpnpriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCvpnbindpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCvpnbindpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCvpnbindpoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClientlesspolicybuiltin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClientlesspolicybuiltin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClientlesspolicybuiltin(), i);
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
        new org.apache.axis.description.TypeDesc(Vpnglobal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "vpnglobal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policyname"));
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
        elemField.setFieldName("intranetdomain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intranetdomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intranetapplication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intranetapplication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nexthopserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nexthopserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urlname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intranetip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intranetip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netmask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netmask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "staserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("staauthid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "staauthid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appcontroller");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appcontroller"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharefile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sharefile"));
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
        elemField.setFieldName("builtin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "builtin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secondary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupextraction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupextraction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditpolicysubtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditpolicysubtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionpolicybuiltin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionpolicybuiltin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusauthpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radiusauthpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusauthpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radiusauthpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiusauthpolicysecondary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radiusauthpolicysecondary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldapauthpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldapauthpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldapauthpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldapauthpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldapauthpolicysecondary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldapauthpolicysecondary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldapauthpolicygroupextraction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldapauthpolicygroupextraction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certauthpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certauthpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certauthpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certauthpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certauthpolicysecondary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certauthpolicysecondary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tacacsauthpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tacacsauthpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tacacsauthpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tacacsauthpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tacacsauthpolicysecondary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tacacsauthpolicysecondary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localauthpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localauthpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localauthpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localauthpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localauthpolicysecondary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localauthpolicysecondary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negauthpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "negauthpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negauthpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "negauthpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("negauthpolicysecondary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "negauthpolicysecondary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlauthpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "samlauthpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlauthpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "samlauthpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samlauthpolicysecondary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "samlauthpolicysecondary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trafficpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trafficpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trafficpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trafficpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvpnpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cvpnpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvpnpriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cvpnpriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvpnbindpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cvpnbindpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientlesspolicybuiltin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientlesspolicybuiltin"));
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
