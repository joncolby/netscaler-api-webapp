/**
 * Sslservice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Sslservice  implements java.io.Serializable {
    private java.lang.String servicename;

    private boolean cipherdetails;

    private java.lang.String[] crlcheck;

    private java.lang.String dh;

    private java.lang.String dhfile;

    private org.apache.axis.types.UnsignedInt dhcount;

    private java.lang.String ersa;

    private org.apache.axis.types.UnsignedInt ersacount;

    private java.lang.String sessreuse;

    private org.apache.axis.types.UnsignedInt sesstimeout;

    private java.lang.String cipherredirect;

    private java.lang.String cipherurl;

    private java.lang.String sslv2Redirect;

    private java.lang.String sslv2Url;

    private java.lang.String clientauth;

    private java.lang.String clientcert;

    private java.lang.String sslredirect;

    private java.lang.String redirectportrewrite;

    private java.lang.String nonfipsciphers;

    private java.lang.String ssl2;

    private java.lang.String ssl3;

    private java.lang.String tls1;

    private java.lang.String tls11;

    private java.lang.String tls12;

    private java.lang.String snienable;

    private java.lang.String serverauth;

    private java.lang.String commonname;

    private java.lang.String[] cipheraliasname;

    private java.lang.String[] ciphername;

    private java.lang.String[] description;

    private java.lang.String[] certkeyname;

    private java.lang.String[] policyname;

    private boolean[] invoke;

    private java.lang.String[] labeltype;

    private java.lang.String[] labelname;

    private org.apache.axis.types.UnsignedInt[] cleartextport;

    private org.apache.axis.types.UnsignedInt service;

    private org.apache.axis.types.UnsignedInt[] priority;

    private org.apache.axis.types.UnsignedInt[] polinherit;

    private java.lang.String[] ocspcheck;

    private java.lang.String pushenctrigger;

    private boolean[] ca;

    private boolean[] snicert;

    private java.lang.String[] gotopriorityexpression;

    private boolean skipcaname;

    private java.lang.String sendclosenotify;

    private java.lang.String dtlsprofilename;

    private boolean dtlsflag;

    private boolean[] boundskipcaname;

    public Sslservice() {
    }

    public Sslservice(
           java.lang.String servicename,
           boolean cipherdetails,
           java.lang.String[] crlcheck,
           java.lang.String dh,
           java.lang.String dhfile,
           org.apache.axis.types.UnsignedInt dhcount,
           java.lang.String ersa,
           org.apache.axis.types.UnsignedInt ersacount,
           java.lang.String sessreuse,
           org.apache.axis.types.UnsignedInt sesstimeout,
           java.lang.String cipherredirect,
           java.lang.String cipherurl,
           java.lang.String sslv2Redirect,
           java.lang.String sslv2Url,
           java.lang.String clientauth,
           java.lang.String clientcert,
           java.lang.String sslredirect,
           java.lang.String redirectportrewrite,
           java.lang.String nonfipsciphers,
           java.lang.String ssl2,
           java.lang.String ssl3,
           java.lang.String tls1,
           java.lang.String tls11,
           java.lang.String tls12,
           java.lang.String snienable,
           java.lang.String serverauth,
           java.lang.String commonname,
           java.lang.String[] cipheraliasname,
           java.lang.String[] ciphername,
           java.lang.String[] description,
           java.lang.String[] certkeyname,
           java.lang.String[] policyname,
           boolean[] invoke,
           java.lang.String[] labeltype,
           java.lang.String[] labelname,
           org.apache.axis.types.UnsignedInt[] cleartextport,
           org.apache.axis.types.UnsignedInt service,
           org.apache.axis.types.UnsignedInt[] priority,
           org.apache.axis.types.UnsignedInt[] polinherit,
           java.lang.String[] ocspcheck,
           java.lang.String pushenctrigger,
           boolean[] ca,
           boolean[] snicert,
           java.lang.String[] gotopriorityexpression,
           boolean skipcaname,
           java.lang.String sendclosenotify,
           java.lang.String dtlsprofilename,
           boolean dtlsflag,
           boolean[] boundskipcaname) {
           this.servicename = servicename;
           this.cipherdetails = cipherdetails;
           this.crlcheck = crlcheck;
           this.dh = dh;
           this.dhfile = dhfile;
           this.dhcount = dhcount;
           this.ersa = ersa;
           this.ersacount = ersacount;
           this.sessreuse = sessreuse;
           this.sesstimeout = sesstimeout;
           this.cipherredirect = cipherredirect;
           this.cipherurl = cipherurl;
           this.sslv2Redirect = sslv2Redirect;
           this.sslv2Url = sslv2Url;
           this.clientauth = clientauth;
           this.clientcert = clientcert;
           this.sslredirect = sslredirect;
           this.redirectportrewrite = redirectportrewrite;
           this.nonfipsciphers = nonfipsciphers;
           this.ssl2 = ssl2;
           this.ssl3 = ssl3;
           this.tls1 = tls1;
           this.tls11 = tls11;
           this.tls12 = tls12;
           this.snienable = snienable;
           this.serverauth = serverauth;
           this.commonname = commonname;
           this.cipheraliasname = cipheraliasname;
           this.ciphername = ciphername;
           this.description = description;
           this.certkeyname = certkeyname;
           this.policyname = policyname;
           this.invoke = invoke;
           this.labeltype = labeltype;
           this.labelname = labelname;
           this.cleartextport = cleartextport;
           this.service = service;
           this.priority = priority;
           this.polinherit = polinherit;
           this.ocspcheck = ocspcheck;
           this.pushenctrigger = pushenctrigger;
           this.ca = ca;
           this.snicert = snicert;
           this.gotopriorityexpression = gotopriorityexpression;
           this.skipcaname = skipcaname;
           this.sendclosenotify = sendclosenotify;
           this.dtlsprofilename = dtlsprofilename;
           this.dtlsflag = dtlsflag;
           this.boundskipcaname = boundskipcaname;
    }


    /**
     * Gets the servicename value for this Sslservice.
     * 
     * @return servicename
     */
    public java.lang.String getServicename() {
        return servicename;
    }


    /**
     * Sets the servicename value for this Sslservice.
     * 
     * @param servicename
     */
    public void setServicename(java.lang.String servicename) {
        this.servicename = servicename;
    }


    /**
     * Gets the cipherdetails value for this Sslservice.
     * 
     * @return cipherdetails
     */
    public boolean isCipherdetails() {
        return cipherdetails;
    }


    /**
     * Sets the cipherdetails value for this Sslservice.
     * 
     * @param cipherdetails
     */
    public void setCipherdetails(boolean cipherdetails) {
        this.cipherdetails = cipherdetails;
    }


    /**
     * Gets the crlcheck value for this Sslservice.
     * 
     * @return crlcheck
     */
    public java.lang.String[] getCrlcheck() {
        return crlcheck;
    }


    /**
     * Sets the crlcheck value for this Sslservice.
     * 
     * @param crlcheck
     */
    public void setCrlcheck(java.lang.String[] crlcheck) {
        this.crlcheck = crlcheck;
    }


    /**
     * Gets the dh value for this Sslservice.
     * 
     * @return dh
     */
    public java.lang.String getDh() {
        return dh;
    }


    /**
     * Sets the dh value for this Sslservice.
     * 
     * @param dh
     */
    public void setDh(java.lang.String dh) {
        this.dh = dh;
    }


    /**
     * Gets the dhfile value for this Sslservice.
     * 
     * @return dhfile
     */
    public java.lang.String getDhfile() {
        return dhfile;
    }


    /**
     * Sets the dhfile value for this Sslservice.
     * 
     * @param dhfile
     */
    public void setDhfile(java.lang.String dhfile) {
        this.dhfile = dhfile;
    }


    /**
     * Gets the dhcount value for this Sslservice.
     * 
     * @return dhcount
     */
    public org.apache.axis.types.UnsignedInt getDhcount() {
        return dhcount;
    }


    /**
     * Sets the dhcount value for this Sslservice.
     * 
     * @param dhcount
     */
    public void setDhcount(org.apache.axis.types.UnsignedInt dhcount) {
        this.dhcount = dhcount;
    }


    /**
     * Gets the ersa value for this Sslservice.
     * 
     * @return ersa
     */
    public java.lang.String getErsa() {
        return ersa;
    }


    /**
     * Sets the ersa value for this Sslservice.
     * 
     * @param ersa
     */
    public void setErsa(java.lang.String ersa) {
        this.ersa = ersa;
    }


    /**
     * Gets the ersacount value for this Sslservice.
     * 
     * @return ersacount
     */
    public org.apache.axis.types.UnsignedInt getErsacount() {
        return ersacount;
    }


    /**
     * Sets the ersacount value for this Sslservice.
     * 
     * @param ersacount
     */
    public void setErsacount(org.apache.axis.types.UnsignedInt ersacount) {
        this.ersacount = ersacount;
    }


    /**
     * Gets the sessreuse value for this Sslservice.
     * 
     * @return sessreuse
     */
    public java.lang.String getSessreuse() {
        return sessreuse;
    }


    /**
     * Sets the sessreuse value for this Sslservice.
     * 
     * @param sessreuse
     */
    public void setSessreuse(java.lang.String sessreuse) {
        this.sessreuse = sessreuse;
    }


    /**
     * Gets the sesstimeout value for this Sslservice.
     * 
     * @return sesstimeout
     */
    public org.apache.axis.types.UnsignedInt getSesstimeout() {
        return sesstimeout;
    }


    /**
     * Sets the sesstimeout value for this Sslservice.
     * 
     * @param sesstimeout
     */
    public void setSesstimeout(org.apache.axis.types.UnsignedInt sesstimeout) {
        this.sesstimeout = sesstimeout;
    }


    /**
     * Gets the cipherredirect value for this Sslservice.
     * 
     * @return cipherredirect
     */
    public java.lang.String getCipherredirect() {
        return cipherredirect;
    }


    /**
     * Sets the cipherredirect value for this Sslservice.
     * 
     * @param cipherredirect
     */
    public void setCipherredirect(java.lang.String cipherredirect) {
        this.cipherredirect = cipherredirect;
    }


    /**
     * Gets the cipherurl value for this Sslservice.
     * 
     * @return cipherurl
     */
    public java.lang.String getCipherurl() {
        return cipherurl;
    }


    /**
     * Sets the cipherurl value for this Sslservice.
     * 
     * @param cipherurl
     */
    public void setCipherurl(java.lang.String cipherurl) {
        this.cipherurl = cipherurl;
    }


    /**
     * Gets the sslv2Redirect value for this Sslservice.
     * 
     * @return sslv2Redirect
     */
    public java.lang.String getSslv2Redirect() {
        return sslv2Redirect;
    }


    /**
     * Sets the sslv2Redirect value for this Sslservice.
     * 
     * @param sslv2Redirect
     */
    public void setSslv2Redirect(java.lang.String sslv2Redirect) {
        this.sslv2Redirect = sslv2Redirect;
    }


    /**
     * Gets the sslv2Url value for this Sslservice.
     * 
     * @return sslv2Url
     */
    public java.lang.String getSslv2Url() {
        return sslv2Url;
    }


    /**
     * Sets the sslv2Url value for this Sslservice.
     * 
     * @param sslv2Url
     */
    public void setSslv2Url(java.lang.String sslv2Url) {
        this.sslv2Url = sslv2Url;
    }


    /**
     * Gets the clientauth value for this Sslservice.
     * 
     * @return clientauth
     */
    public java.lang.String getClientauth() {
        return clientauth;
    }


    /**
     * Sets the clientauth value for this Sslservice.
     * 
     * @param clientauth
     */
    public void setClientauth(java.lang.String clientauth) {
        this.clientauth = clientauth;
    }


    /**
     * Gets the clientcert value for this Sslservice.
     * 
     * @return clientcert
     */
    public java.lang.String getClientcert() {
        return clientcert;
    }


    /**
     * Sets the clientcert value for this Sslservice.
     * 
     * @param clientcert
     */
    public void setClientcert(java.lang.String clientcert) {
        this.clientcert = clientcert;
    }


    /**
     * Gets the sslredirect value for this Sslservice.
     * 
     * @return sslredirect
     */
    public java.lang.String getSslredirect() {
        return sslredirect;
    }


    /**
     * Sets the sslredirect value for this Sslservice.
     * 
     * @param sslredirect
     */
    public void setSslredirect(java.lang.String sslredirect) {
        this.sslredirect = sslredirect;
    }


    /**
     * Gets the redirectportrewrite value for this Sslservice.
     * 
     * @return redirectportrewrite
     */
    public java.lang.String getRedirectportrewrite() {
        return redirectportrewrite;
    }


    /**
     * Sets the redirectportrewrite value for this Sslservice.
     * 
     * @param redirectportrewrite
     */
    public void setRedirectportrewrite(java.lang.String redirectportrewrite) {
        this.redirectportrewrite = redirectportrewrite;
    }


    /**
     * Gets the nonfipsciphers value for this Sslservice.
     * 
     * @return nonfipsciphers
     */
    public java.lang.String getNonfipsciphers() {
        return nonfipsciphers;
    }


    /**
     * Sets the nonfipsciphers value for this Sslservice.
     * 
     * @param nonfipsciphers
     */
    public void setNonfipsciphers(java.lang.String nonfipsciphers) {
        this.nonfipsciphers = nonfipsciphers;
    }


    /**
     * Gets the ssl2 value for this Sslservice.
     * 
     * @return ssl2
     */
    public java.lang.String getSsl2() {
        return ssl2;
    }


    /**
     * Sets the ssl2 value for this Sslservice.
     * 
     * @param ssl2
     */
    public void setSsl2(java.lang.String ssl2) {
        this.ssl2 = ssl2;
    }


    /**
     * Gets the ssl3 value for this Sslservice.
     * 
     * @return ssl3
     */
    public java.lang.String getSsl3() {
        return ssl3;
    }


    /**
     * Sets the ssl3 value for this Sslservice.
     * 
     * @param ssl3
     */
    public void setSsl3(java.lang.String ssl3) {
        this.ssl3 = ssl3;
    }


    /**
     * Gets the tls1 value for this Sslservice.
     * 
     * @return tls1
     */
    public java.lang.String getTls1() {
        return tls1;
    }


    /**
     * Sets the tls1 value for this Sslservice.
     * 
     * @param tls1
     */
    public void setTls1(java.lang.String tls1) {
        this.tls1 = tls1;
    }


    /**
     * Gets the tls11 value for this Sslservice.
     * 
     * @return tls11
     */
    public java.lang.String getTls11() {
        return tls11;
    }


    /**
     * Sets the tls11 value for this Sslservice.
     * 
     * @param tls11
     */
    public void setTls11(java.lang.String tls11) {
        this.tls11 = tls11;
    }


    /**
     * Gets the tls12 value for this Sslservice.
     * 
     * @return tls12
     */
    public java.lang.String getTls12() {
        return tls12;
    }


    /**
     * Sets the tls12 value for this Sslservice.
     * 
     * @param tls12
     */
    public void setTls12(java.lang.String tls12) {
        this.tls12 = tls12;
    }


    /**
     * Gets the snienable value for this Sslservice.
     * 
     * @return snienable
     */
    public java.lang.String getSnienable() {
        return snienable;
    }


    /**
     * Sets the snienable value for this Sslservice.
     * 
     * @param snienable
     */
    public void setSnienable(java.lang.String snienable) {
        this.snienable = snienable;
    }


    /**
     * Gets the serverauth value for this Sslservice.
     * 
     * @return serverauth
     */
    public java.lang.String getServerauth() {
        return serverauth;
    }


    /**
     * Sets the serverauth value for this Sslservice.
     * 
     * @param serverauth
     */
    public void setServerauth(java.lang.String serverauth) {
        this.serverauth = serverauth;
    }


    /**
     * Gets the commonname value for this Sslservice.
     * 
     * @return commonname
     */
    public java.lang.String getCommonname() {
        return commonname;
    }


    /**
     * Sets the commonname value for this Sslservice.
     * 
     * @param commonname
     */
    public void setCommonname(java.lang.String commonname) {
        this.commonname = commonname;
    }


    /**
     * Gets the cipheraliasname value for this Sslservice.
     * 
     * @return cipheraliasname
     */
    public java.lang.String[] getCipheraliasname() {
        return cipheraliasname;
    }


    /**
     * Sets the cipheraliasname value for this Sslservice.
     * 
     * @param cipheraliasname
     */
    public void setCipheraliasname(java.lang.String[] cipheraliasname) {
        this.cipheraliasname = cipheraliasname;
    }


    /**
     * Gets the ciphername value for this Sslservice.
     * 
     * @return ciphername
     */
    public java.lang.String[] getCiphername() {
        return ciphername;
    }


    /**
     * Sets the ciphername value for this Sslservice.
     * 
     * @param ciphername
     */
    public void setCiphername(java.lang.String[] ciphername) {
        this.ciphername = ciphername;
    }


    /**
     * Gets the description value for this Sslservice.
     * 
     * @return description
     */
    public java.lang.String[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Sslservice.
     * 
     * @param description
     */
    public void setDescription(java.lang.String[] description) {
        this.description = description;
    }


    /**
     * Gets the certkeyname value for this Sslservice.
     * 
     * @return certkeyname
     */
    public java.lang.String[] getCertkeyname() {
        return certkeyname;
    }


    /**
     * Sets the certkeyname value for this Sslservice.
     * 
     * @param certkeyname
     */
    public void setCertkeyname(java.lang.String[] certkeyname) {
        this.certkeyname = certkeyname;
    }


    /**
     * Gets the policyname value for this Sslservice.
     * 
     * @return policyname
     */
    public java.lang.String[] getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Sslservice.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String[] policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the invoke value for this Sslservice.
     * 
     * @return invoke
     */
    public boolean[] getInvoke() {
        return invoke;
    }


    /**
     * Sets the invoke value for this Sslservice.
     * 
     * @param invoke
     */
    public void setInvoke(boolean[] invoke) {
        this.invoke = invoke;
    }


    /**
     * Gets the labeltype value for this Sslservice.
     * 
     * @return labeltype
     */
    public java.lang.String[] getLabeltype() {
        return labeltype;
    }


    /**
     * Sets the labeltype value for this Sslservice.
     * 
     * @param labeltype
     */
    public void setLabeltype(java.lang.String[] labeltype) {
        this.labeltype = labeltype;
    }


    /**
     * Gets the labelname value for this Sslservice.
     * 
     * @return labelname
     */
    public java.lang.String[] getLabelname() {
        return labelname;
    }


    /**
     * Sets the labelname value for this Sslservice.
     * 
     * @param labelname
     */
    public void setLabelname(java.lang.String[] labelname) {
        this.labelname = labelname;
    }


    /**
     * Gets the cleartextport value for this Sslservice.
     * 
     * @return cleartextport
     */
    public org.apache.axis.types.UnsignedInt[] getCleartextport() {
        return cleartextport;
    }


    /**
     * Sets the cleartextport value for this Sslservice.
     * 
     * @param cleartextport
     */
    public void setCleartextport(org.apache.axis.types.UnsignedInt[] cleartextport) {
        this.cleartextport = cleartextport;
    }


    /**
     * Gets the service value for this Sslservice.
     * 
     * @return service
     */
    public org.apache.axis.types.UnsignedInt getService() {
        return service;
    }


    /**
     * Sets the service value for this Sslservice.
     * 
     * @param service
     */
    public void setService(org.apache.axis.types.UnsignedInt service) {
        this.service = service;
    }


    /**
     * Gets the priority value for this Sslservice.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt[] getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Sslservice.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt[] priority) {
        this.priority = priority;
    }


    /**
     * Gets the polinherit value for this Sslservice.
     * 
     * @return polinherit
     */
    public org.apache.axis.types.UnsignedInt[] getPolinherit() {
        return polinherit;
    }


    /**
     * Sets the polinherit value for this Sslservice.
     * 
     * @param polinherit
     */
    public void setPolinherit(org.apache.axis.types.UnsignedInt[] polinherit) {
        this.polinherit = polinherit;
    }


    /**
     * Gets the ocspcheck value for this Sslservice.
     * 
     * @return ocspcheck
     */
    public java.lang.String[] getOcspcheck() {
        return ocspcheck;
    }


    /**
     * Sets the ocspcheck value for this Sslservice.
     * 
     * @param ocspcheck
     */
    public void setOcspcheck(java.lang.String[] ocspcheck) {
        this.ocspcheck = ocspcheck;
    }


    /**
     * Gets the pushenctrigger value for this Sslservice.
     * 
     * @return pushenctrigger
     */
    public java.lang.String getPushenctrigger() {
        return pushenctrigger;
    }


    /**
     * Sets the pushenctrigger value for this Sslservice.
     * 
     * @param pushenctrigger
     */
    public void setPushenctrigger(java.lang.String pushenctrigger) {
        this.pushenctrigger = pushenctrigger;
    }


    /**
     * Gets the ca value for this Sslservice.
     * 
     * @return ca
     */
    public boolean[] getCa() {
        return ca;
    }


    /**
     * Sets the ca value for this Sslservice.
     * 
     * @param ca
     */
    public void setCa(boolean[] ca) {
        this.ca = ca;
    }


    /**
     * Gets the snicert value for this Sslservice.
     * 
     * @return snicert
     */
    public boolean[] getSnicert() {
        return snicert;
    }


    /**
     * Sets the snicert value for this Sslservice.
     * 
     * @param snicert
     */
    public void setSnicert(boolean[] snicert) {
        this.snicert = snicert;
    }


    /**
     * Gets the gotopriorityexpression value for this Sslservice.
     * 
     * @return gotopriorityexpression
     */
    public java.lang.String[] getGotopriorityexpression() {
        return gotopriorityexpression;
    }


    /**
     * Sets the gotopriorityexpression value for this Sslservice.
     * 
     * @param gotopriorityexpression
     */
    public void setGotopriorityexpression(java.lang.String[] gotopriorityexpression) {
        this.gotopriorityexpression = gotopriorityexpression;
    }


    /**
     * Gets the skipcaname value for this Sslservice.
     * 
     * @return skipcaname
     */
    public boolean isSkipcaname() {
        return skipcaname;
    }


    /**
     * Sets the skipcaname value for this Sslservice.
     * 
     * @param skipcaname
     */
    public void setSkipcaname(boolean skipcaname) {
        this.skipcaname = skipcaname;
    }


    /**
     * Gets the sendclosenotify value for this Sslservice.
     * 
     * @return sendclosenotify
     */
    public java.lang.String getSendclosenotify() {
        return sendclosenotify;
    }


    /**
     * Sets the sendclosenotify value for this Sslservice.
     * 
     * @param sendclosenotify
     */
    public void setSendclosenotify(java.lang.String sendclosenotify) {
        this.sendclosenotify = sendclosenotify;
    }


    /**
     * Gets the dtlsprofilename value for this Sslservice.
     * 
     * @return dtlsprofilename
     */
    public java.lang.String getDtlsprofilename() {
        return dtlsprofilename;
    }


    /**
     * Sets the dtlsprofilename value for this Sslservice.
     * 
     * @param dtlsprofilename
     */
    public void setDtlsprofilename(java.lang.String dtlsprofilename) {
        this.dtlsprofilename = dtlsprofilename;
    }


    /**
     * Gets the dtlsflag value for this Sslservice.
     * 
     * @return dtlsflag
     */
    public boolean isDtlsflag() {
        return dtlsflag;
    }


    /**
     * Sets the dtlsflag value for this Sslservice.
     * 
     * @param dtlsflag
     */
    public void setDtlsflag(boolean dtlsflag) {
        this.dtlsflag = dtlsflag;
    }


    /**
     * Gets the boundskipcaname value for this Sslservice.
     * 
     * @return boundskipcaname
     */
    public boolean[] getBoundskipcaname() {
        return boundskipcaname;
    }


    /**
     * Sets the boundskipcaname value for this Sslservice.
     * 
     * @param boundskipcaname
     */
    public void setBoundskipcaname(boolean[] boundskipcaname) {
        this.boundskipcaname = boundskipcaname;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sslservice)) return false;
        Sslservice other = (Sslservice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.servicename==null && other.getServicename()==null) || 
             (this.servicename!=null &&
              this.servicename.equals(other.getServicename()))) &&
            this.cipherdetails == other.isCipherdetails() &&
            ((this.crlcheck==null && other.getCrlcheck()==null) || 
             (this.crlcheck!=null &&
              java.util.Arrays.equals(this.crlcheck, other.getCrlcheck()))) &&
            ((this.dh==null && other.getDh()==null) || 
             (this.dh!=null &&
              this.dh.equals(other.getDh()))) &&
            ((this.dhfile==null && other.getDhfile()==null) || 
             (this.dhfile!=null &&
              this.dhfile.equals(other.getDhfile()))) &&
            ((this.dhcount==null && other.getDhcount()==null) || 
             (this.dhcount!=null &&
              this.dhcount.equals(other.getDhcount()))) &&
            ((this.ersa==null && other.getErsa()==null) || 
             (this.ersa!=null &&
              this.ersa.equals(other.getErsa()))) &&
            ((this.ersacount==null && other.getErsacount()==null) || 
             (this.ersacount!=null &&
              this.ersacount.equals(other.getErsacount()))) &&
            ((this.sessreuse==null && other.getSessreuse()==null) || 
             (this.sessreuse!=null &&
              this.sessreuse.equals(other.getSessreuse()))) &&
            ((this.sesstimeout==null && other.getSesstimeout()==null) || 
             (this.sesstimeout!=null &&
              this.sesstimeout.equals(other.getSesstimeout()))) &&
            ((this.cipherredirect==null && other.getCipherredirect()==null) || 
             (this.cipherredirect!=null &&
              this.cipherredirect.equals(other.getCipherredirect()))) &&
            ((this.cipherurl==null && other.getCipherurl()==null) || 
             (this.cipherurl!=null &&
              this.cipherurl.equals(other.getCipherurl()))) &&
            ((this.sslv2Redirect==null && other.getSslv2Redirect()==null) || 
             (this.sslv2Redirect!=null &&
              this.sslv2Redirect.equals(other.getSslv2Redirect()))) &&
            ((this.sslv2Url==null && other.getSslv2Url()==null) || 
             (this.sslv2Url!=null &&
              this.sslv2Url.equals(other.getSslv2Url()))) &&
            ((this.clientauth==null && other.getClientauth()==null) || 
             (this.clientauth!=null &&
              this.clientauth.equals(other.getClientauth()))) &&
            ((this.clientcert==null && other.getClientcert()==null) || 
             (this.clientcert!=null &&
              this.clientcert.equals(other.getClientcert()))) &&
            ((this.sslredirect==null && other.getSslredirect()==null) || 
             (this.sslredirect!=null &&
              this.sslredirect.equals(other.getSslredirect()))) &&
            ((this.redirectportrewrite==null && other.getRedirectportrewrite()==null) || 
             (this.redirectportrewrite!=null &&
              this.redirectportrewrite.equals(other.getRedirectportrewrite()))) &&
            ((this.nonfipsciphers==null && other.getNonfipsciphers()==null) || 
             (this.nonfipsciphers!=null &&
              this.nonfipsciphers.equals(other.getNonfipsciphers()))) &&
            ((this.ssl2==null && other.getSsl2()==null) || 
             (this.ssl2!=null &&
              this.ssl2.equals(other.getSsl2()))) &&
            ((this.ssl3==null && other.getSsl3()==null) || 
             (this.ssl3!=null &&
              this.ssl3.equals(other.getSsl3()))) &&
            ((this.tls1==null && other.getTls1()==null) || 
             (this.tls1!=null &&
              this.tls1.equals(other.getTls1()))) &&
            ((this.tls11==null && other.getTls11()==null) || 
             (this.tls11!=null &&
              this.tls11.equals(other.getTls11()))) &&
            ((this.tls12==null && other.getTls12()==null) || 
             (this.tls12!=null &&
              this.tls12.equals(other.getTls12()))) &&
            ((this.snienable==null && other.getSnienable()==null) || 
             (this.snienable!=null &&
              this.snienable.equals(other.getSnienable()))) &&
            ((this.serverauth==null && other.getServerauth()==null) || 
             (this.serverauth!=null &&
              this.serverauth.equals(other.getServerauth()))) &&
            ((this.commonname==null && other.getCommonname()==null) || 
             (this.commonname!=null &&
              this.commonname.equals(other.getCommonname()))) &&
            ((this.cipheraliasname==null && other.getCipheraliasname()==null) || 
             (this.cipheraliasname!=null &&
              java.util.Arrays.equals(this.cipheraliasname, other.getCipheraliasname()))) &&
            ((this.ciphername==null && other.getCiphername()==null) || 
             (this.ciphername!=null &&
              java.util.Arrays.equals(this.ciphername, other.getCiphername()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.certkeyname==null && other.getCertkeyname()==null) || 
             (this.certkeyname!=null &&
              java.util.Arrays.equals(this.certkeyname, other.getCertkeyname()))) &&
            ((this.policyname==null && other.getPolicyname()==null) || 
             (this.policyname!=null &&
              java.util.Arrays.equals(this.policyname, other.getPolicyname()))) &&
            ((this.invoke==null && other.getInvoke()==null) || 
             (this.invoke!=null &&
              java.util.Arrays.equals(this.invoke, other.getInvoke()))) &&
            ((this.labeltype==null && other.getLabeltype()==null) || 
             (this.labeltype!=null &&
              java.util.Arrays.equals(this.labeltype, other.getLabeltype()))) &&
            ((this.labelname==null && other.getLabelname()==null) || 
             (this.labelname!=null &&
              java.util.Arrays.equals(this.labelname, other.getLabelname()))) &&
            ((this.cleartextport==null && other.getCleartextport()==null) || 
             (this.cleartextport!=null &&
              java.util.Arrays.equals(this.cleartextport, other.getCleartextport()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              this.service.equals(other.getService()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              java.util.Arrays.equals(this.priority, other.getPriority()))) &&
            ((this.polinherit==null && other.getPolinherit()==null) || 
             (this.polinherit!=null &&
              java.util.Arrays.equals(this.polinherit, other.getPolinherit()))) &&
            ((this.ocspcheck==null && other.getOcspcheck()==null) || 
             (this.ocspcheck!=null &&
              java.util.Arrays.equals(this.ocspcheck, other.getOcspcheck()))) &&
            ((this.pushenctrigger==null && other.getPushenctrigger()==null) || 
             (this.pushenctrigger!=null &&
              this.pushenctrigger.equals(other.getPushenctrigger()))) &&
            ((this.ca==null && other.getCa()==null) || 
             (this.ca!=null &&
              java.util.Arrays.equals(this.ca, other.getCa()))) &&
            ((this.snicert==null && other.getSnicert()==null) || 
             (this.snicert!=null &&
              java.util.Arrays.equals(this.snicert, other.getSnicert()))) &&
            ((this.gotopriorityexpression==null && other.getGotopriorityexpression()==null) || 
             (this.gotopriorityexpression!=null &&
              java.util.Arrays.equals(this.gotopriorityexpression, other.getGotopriorityexpression()))) &&
            this.skipcaname == other.isSkipcaname() &&
            ((this.sendclosenotify==null && other.getSendclosenotify()==null) || 
             (this.sendclosenotify!=null &&
              this.sendclosenotify.equals(other.getSendclosenotify()))) &&
            ((this.dtlsprofilename==null && other.getDtlsprofilename()==null) || 
             (this.dtlsprofilename!=null &&
              this.dtlsprofilename.equals(other.getDtlsprofilename()))) &&
            this.dtlsflag == other.isDtlsflag() &&
            ((this.boundskipcaname==null && other.getBoundskipcaname()==null) || 
             (this.boundskipcaname!=null &&
              java.util.Arrays.equals(this.boundskipcaname, other.getBoundskipcaname())));
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
        if (getServicename() != null) {
            _hashCode += getServicename().hashCode();
        }
        _hashCode += (isCipherdetails() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCrlcheck() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCrlcheck());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCrlcheck(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDh() != null) {
            _hashCode += getDh().hashCode();
        }
        if (getDhfile() != null) {
            _hashCode += getDhfile().hashCode();
        }
        if (getDhcount() != null) {
            _hashCode += getDhcount().hashCode();
        }
        if (getErsa() != null) {
            _hashCode += getErsa().hashCode();
        }
        if (getErsacount() != null) {
            _hashCode += getErsacount().hashCode();
        }
        if (getSessreuse() != null) {
            _hashCode += getSessreuse().hashCode();
        }
        if (getSesstimeout() != null) {
            _hashCode += getSesstimeout().hashCode();
        }
        if (getCipherredirect() != null) {
            _hashCode += getCipherredirect().hashCode();
        }
        if (getCipherurl() != null) {
            _hashCode += getCipherurl().hashCode();
        }
        if (getSslv2Redirect() != null) {
            _hashCode += getSslv2Redirect().hashCode();
        }
        if (getSslv2Url() != null) {
            _hashCode += getSslv2Url().hashCode();
        }
        if (getClientauth() != null) {
            _hashCode += getClientauth().hashCode();
        }
        if (getClientcert() != null) {
            _hashCode += getClientcert().hashCode();
        }
        if (getSslredirect() != null) {
            _hashCode += getSslredirect().hashCode();
        }
        if (getRedirectportrewrite() != null) {
            _hashCode += getRedirectportrewrite().hashCode();
        }
        if (getNonfipsciphers() != null) {
            _hashCode += getNonfipsciphers().hashCode();
        }
        if (getSsl2() != null) {
            _hashCode += getSsl2().hashCode();
        }
        if (getSsl3() != null) {
            _hashCode += getSsl3().hashCode();
        }
        if (getTls1() != null) {
            _hashCode += getTls1().hashCode();
        }
        if (getTls11() != null) {
            _hashCode += getTls11().hashCode();
        }
        if (getTls12() != null) {
            _hashCode += getTls12().hashCode();
        }
        if (getSnienable() != null) {
            _hashCode += getSnienable().hashCode();
        }
        if (getServerauth() != null) {
            _hashCode += getServerauth().hashCode();
        }
        if (getCommonname() != null) {
            _hashCode += getCommonname().hashCode();
        }
        if (getCipheraliasname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCipheraliasname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCipheraliasname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCiphername() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCiphername());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCiphername(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCertkeyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCertkeyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCertkeyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInvoke() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvoke());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvoke(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLabeltype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLabeltype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLabeltype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLabelname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLabelname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLabelname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCleartextport() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCleartextport());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCleartextport(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getService() != null) {
            _hashCode += getService().hashCode();
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
        if (getPolinherit() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolinherit());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolinherit(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOcspcheck() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOcspcheck());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOcspcheck(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPushenctrigger() != null) {
            _hashCode += getPushenctrigger().hashCode();
        }
        if (getCa() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCa());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCa(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSnicert() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSnicert());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSnicert(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGotopriorityexpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGotopriorityexpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGotopriorityexpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isSkipcaname() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSendclosenotify() != null) {
            _hashCode += getSendclosenotify().hashCode();
        }
        if (getDtlsprofilename() != null) {
            _hashCode += getDtlsprofilename().hashCode();
        }
        _hashCode += (isDtlsflag() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBoundskipcaname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundskipcaname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundskipcaname(), i);
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
        new org.apache.axis.description.TypeDesc(Sslservice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "sslservice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cipherdetails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cipherdetails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crlcheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crlcheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dhfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dhfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dhcount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dhcount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ersa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ersa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ersacount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ersacount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessreuse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessreuse"));
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
        elemField.setFieldName("cipherredirect");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cipherredirect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cipherurl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cipherurl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslv2Redirect");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sslv2redirect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslv2Url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sslv2url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientauth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientauth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientcert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientcert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslredirect");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sslredirect"));
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
        elemField.setFieldName("nonfipsciphers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nonfipsciphers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssl2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssl2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssl3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssl3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tls1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tls1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tls11");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tls11"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tls12");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tls12"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snienable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "snienable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverauth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverauth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commonname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "commonname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cipheraliasname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cipheraliasname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ciphername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ciphername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certkeyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certkeyname"));
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
        elemField.setFieldName("cleartextport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cleartextport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("", "service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("polinherit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "polinherit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ocspcheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ocspcheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pushenctrigger");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pushenctrigger"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ca");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ca"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snicert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "snicert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gotopriorityexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gotopriorityexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("skipcaname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "skipcaname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendclosenotify");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendclosenotify"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtlsprofilename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dtlsprofilename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dtlsflag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dtlsflag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundskipcaname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundskipcaname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
