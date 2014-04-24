/**
 * Sslservicegroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Sslservicegroup  implements java.io.Serializable {
    private java.lang.String servicegroupname;

    private boolean cipherdetails;

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

    private java.lang.String serverauth;

    private java.lang.String commonname;

    private java.lang.String[] cipheraliasname;

    private java.lang.String[] ciphername;

    private java.lang.String ocspcheck;

    private java.lang.String crlcheck;

    private java.lang.String[] description;

    private java.lang.String[] certkeyname;

    private org.apache.axis.types.UnsignedInt cleartextport;

    private java.lang.String servicename;

    private boolean ca;

    private boolean snicert;

    private java.lang.String sendclosenotify;

    private java.lang.String[] boundcrlcheck;

    private java.lang.String[] boundocspcheck;

    private boolean[] boundcacert;

    private boolean[] boundsnicert;

    public Sslservicegroup() {
    }

    public Sslservicegroup(
           java.lang.String servicegroupname,
           boolean cipherdetails,
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
           java.lang.String serverauth,
           java.lang.String commonname,
           java.lang.String[] cipheraliasname,
           java.lang.String[] ciphername,
           java.lang.String ocspcheck,
           java.lang.String crlcheck,
           java.lang.String[] description,
           java.lang.String[] certkeyname,
           org.apache.axis.types.UnsignedInt cleartextport,
           java.lang.String servicename,
           boolean ca,
           boolean snicert,
           java.lang.String sendclosenotify,
           java.lang.String[] boundcrlcheck,
           java.lang.String[] boundocspcheck,
           boolean[] boundcacert,
           boolean[] boundsnicert) {
           this.servicegroupname = servicegroupname;
           this.cipherdetails = cipherdetails;
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
           this.serverauth = serverauth;
           this.commonname = commonname;
           this.cipheraliasname = cipheraliasname;
           this.ciphername = ciphername;
           this.ocspcheck = ocspcheck;
           this.crlcheck = crlcheck;
           this.description = description;
           this.certkeyname = certkeyname;
           this.cleartextport = cleartextport;
           this.servicename = servicename;
           this.ca = ca;
           this.snicert = snicert;
           this.sendclosenotify = sendclosenotify;
           this.boundcrlcheck = boundcrlcheck;
           this.boundocspcheck = boundocspcheck;
           this.boundcacert = boundcacert;
           this.boundsnicert = boundsnicert;
    }


    /**
     * Gets the servicegroupname value for this Sslservicegroup.
     * 
     * @return servicegroupname
     */
    public java.lang.String getServicegroupname() {
        return servicegroupname;
    }


    /**
     * Sets the servicegroupname value for this Sslservicegroup.
     * 
     * @param servicegroupname
     */
    public void setServicegroupname(java.lang.String servicegroupname) {
        this.servicegroupname = servicegroupname;
    }


    /**
     * Gets the cipherdetails value for this Sslservicegroup.
     * 
     * @return cipherdetails
     */
    public boolean isCipherdetails() {
        return cipherdetails;
    }


    /**
     * Sets the cipherdetails value for this Sslservicegroup.
     * 
     * @param cipherdetails
     */
    public void setCipherdetails(boolean cipherdetails) {
        this.cipherdetails = cipherdetails;
    }


    /**
     * Gets the dh value for this Sslservicegroup.
     * 
     * @return dh
     */
    public java.lang.String getDh() {
        return dh;
    }


    /**
     * Sets the dh value for this Sslservicegroup.
     * 
     * @param dh
     */
    public void setDh(java.lang.String dh) {
        this.dh = dh;
    }


    /**
     * Gets the dhfile value for this Sslservicegroup.
     * 
     * @return dhfile
     */
    public java.lang.String getDhfile() {
        return dhfile;
    }


    /**
     * Sets the dhfile value for this Sslservicegroup.
     * 
     * @param dhfile
     */
    public void setDhfile(java.lang.String dhfile) {
        this.dhfile = dhfile;
    }


    /**
     * Gets the dhcount value for this Sslservicegroup.
     * 
     * @return dhcount
     */
    public org.apache.axis.types.UnsignedInt getDhcount() {
        return dhcount;
    }


    /**
     * Sets the dhcount value for this Sslservicegroup.
     * 
     * @param dhcount
     */
    public void setDhcount(org.apache.axis.types.UnsignedInt dhcount) {
        this.dhcount = dhcount;
    }


    /**
     * Gets the ersa value for this Sslservicegroup.
     * 
     * @return ersa
     */
    public java.lang.String getErsa() {
        return ersa;
    }


    /**
     * Sets the ersa value for this Sslservicegroup.
     * 
     * @param ersa
     */
    public void setErsa(java.lang.String ersa) {
        this.ersa = ersa;
    }


    /**
     * Gets the ersacount value for this Sslservicegroup.
     * 
     * @return ersacount
     */
    public org.apache.axis.types.UnsignedInt getErsacount() {
        return ersacount;
    }


    /**
     * Sets the ersacount value for this Sslservicegroup.
     * 
     * @param ersacount
     */
    public void setErsacount(org.apache.axis.types.UnsignedInt ersacount) {
        this.ersacount = ersacount;
    }


    /**
     * Gets the sessreuse value for this Sslservicegroup.
     * 
     * @return sessreuse
     */
    public java.lang.String getSessreuse() {
        return sessreuse;
    }


    /**
     * Sets the sessreuse value for this Sslservicegroup.
     * 
     * @param sessreuse
     */
    public void setSessreuse(java.lang.String sessreuse) {
        this.sessreuse = sessreuse;
    }


    /**
     * Gets the sesstimeout value for this Sslservicegroup.
     * 
     * @return sesstimeout
     */
    public org.apache.axis.types.UnsignedInt getSesstimeout() {
        return sesstimeout;
    }


    /**
     * Sets the sesstimeout value for this Sslservicegroup.
     * 
     * @param sesstimeout
     */
    public void setSesstimeout(org.apache.axis.types.UnsignedInt sesstimeout) {
        this.sesstimeout = sesstimeout;
    }


    /**
     * Gets the cipherredirect value for this Sslservicegroup.
     * 
     * @return cipherredirect
     */
    public java.lang.String getCipherredirect() {
        return cipherredirect;
    }


    /**
     * Sets the cipherredirect value for this Sslservicegroup.
     * 
     * @param cipherredirect
     */
    public void setCipherredirect(java.lang.String cipherredirect) {
        this.cipherredirect = cipherredirect;
    }


    /**
     * Gets the cipherurl value for this Sslservicegroup.
     * 
     * @return cipherurl
     */
    public java.lang.String getCipherurl() {
        return cipherurl;
    }


    /**
     * Sets the cipherurl value for this Sslservicegroup.
     * 
     * @param cipherurl
     */
    public void setCipherurl(java.lang.String cipherurl) {
        this.cipherurl = cipherurl;
    }


    /**
     * Gets the sslv2Redirect value for this Sslservicegroup.
     * 
     * @return sslv2Redirect
     */
    public java.lang.String getSslv2Redirect() {
        return sslv2Redirect;
    }


    /**
     * Sets the sslv2Redirect value for this Sslservicegroup.
     * 
     * @param sslv2Redirect
     */
    public void setSslv2Redirect(java.lang.String sslv2Redirect) {
        this.sslv2Redirect = sslv2Redirect;
    }


    /**
     * Gets the sslv2Url value for this Sslservicegroup.
     * 
     * @return sslv2Url
     */
    public java.lang.String getSslv2Url() {
        return sslv2Url;
    }


    /**
     * Sets the sslv2Url value for this Sslservicegroup.
     * 
     * @param sslv2Url
     */
    public void setSslv2Url(java.lang.String sslv2Url) {
        this.sslv2Url = sslv2Url;
    }


    /**
     * Gets the clientauth value for this Sslservicegroup.
     * 
     * @return clientauth
     */
    public java.lang.String getClientauth() {
        return clientauth;
    }


    /**
     * Sets the clientauth value for this Sslservicegroup.
     * 
     * @param clientauth
     */
    public void setClientauth(java.lang.String clientauth) {
        this.clientauth = clientauth;
    }


    /**
     * Gets the clientcert value for this Sslservicegroup.
     * 
     * @return clientcert
     */
    public java.lang.String getClientcert() {
        return clientcert;
    }


    /**
     * Sets the clientcert value for this Sslservicegroup.
     * 
     * @param clientcert
     */
    public void setClientcert(java.lang.String clientcert) {
        this.clientcert = clientcert;
    }


    /**
     * Gets the sslredirect value for this Sslservicegroup.
     * 
     * @return sslredirect
     */
    public java.lang.String getSslredirect() {
        return sslredirect;
    }


    /**
     * Sets the sslredirect value for this Sslservicegroup.
     * 
     * @param sslredirect
     */
    public void setSslredirect(java.lang.String sslredirect) {
        this.sslredirect = sslredirect;
    }


    /**
     * Gets the redirectportrewrite value for this Sslservicegroup.
     * 
     * @return redirectportrewrite
     */
    public java.lang.String getRedirectportrewrite() {
        return redirectportrewrite;
    }


    /**
     * Sets the redirectportrewrite value for this Sslservicegroup.
     * 
     * @param redirectportrewrite
     */
    public void setRedirectportrewrite(java.lang.String redirectportrewrite) {
        this.redirectportrewrite = redirectportrewrite;
    }


    /**
     * Gets the nonfipsciphers value for this Sslservicegroup.
     * 
     * @return nonfipsciphers
     */
    public java.lang.String getNonfipsciphers() {
        return nonfipsciphers;
    }


    /**
     * Sets the nonfipsciphers value for this Sslservicegroup.
     * 
     * @param nonfipsciphers
     */
    public void setNonfipsciphers(java.lang.String nonfipsciphers) {
        this.nonfipsciphers = nonfipsciphers;
    }


    /**
     * Gets the ssl2 value for this Sslservicegroup.
     * 
     * @return ssl2
     */
    public java.lang.String getSsl2() {
        return ssl2;
    }


    /**
     * Sets the ssl2 value for this Sslservicegroup.
     * 
     * @param ssl2
     */
    public void setSsl2(java.lang.String ssl2) {
        this.ssl2 = ssl2;
    }


    /**
     * Gets the ssl3 value for this Sslservicegroup.
     * 
     * @return ssl3
     */
    public java.lang.String getSsl3() {
        return ssl3;
    }


    /**
     * Sets the ssl3 value for this Sslservicegroup.
     * 
     * @param ssl3
     */
    public void setSsl3(java.lang.String ssl3) {
        this.ssl3 = ssl3;
    }


    /**
     * Gets the tls1 value for this Sslservicegroup.
     * 
     * @return tls1
     */
    public java.lang.String getTls1() {
        return tls1;
    }


    /**
     * Sets the tls1 value for this Sslservicegroup.
     * 
     * @param tls1
     */
    public void setTls1(java.lang.String tls1) {
        this.tls1 = tls1;
    }


    /**
     * Gets the serverauth value for this Sslservicegroup.
     * 
     * @return serverauth
     */
    public java.lang.String getServerauth() {
        return serverauth;
    }


    /**
     * Sets the serverauth value for this Sslservicegroup.
     * 
     * @param serverauth
     */
    public void setServerauth(java.lang.String serverauth) {
        this.serverauth = serverauth;
    }


    /**
     * Gets the commonname value for this Sslservicegroup.
     * 
     * @return commonname
     */
    public java.lang.String getCommonname() {
        return commonname;
    }


    /**
     * Sets the commonname value for this Sslservicegroup.
     * 
     * @param commonname
     */
    public void setCommonname(java.lang.String commonname) {
        this.commonname = commonname;
    }


    /**
     * Gets the cipheraliasname value for this Sslservicegroup.
     * 
     * @return cipheraliasname
     */
    public java.lang.String[] getCipheraliasname() {
        return cipheraliasname;
    }


    /**
     * Sets the cipheraliasname value for this Sslservicegroup.
     * 
     * @param cipheraliasname
     */
    public void setCipheraliasname(java.lang.String[] cipheraliasname) {
        this.cipheraliasname = cipheraliasname;
    }


    /**
     * Gets the ciphername value for this Sslservicegroup.
     * 
     * @return ciphername
     */
    public java.lang.String[] getCiphername() {
        return ciphername;
    }


    /**
     * Sets the ciphername value for this Sslservicegroup.
     * 
     * @param ciphername
     */
    public void setCiphername(java.lang.String[] ciphername) {
        this.ciphername = ciphername;
    }


    /**
     * Gets the ocspcheck value for this Sslservicegroup.
     * 
     * @return ocspcheck
     */
    public java.lang.String getOcspcheck() {
        return ocspcheck;
    }


    /**
     * Sets the ocspcheck value for this Sslservicegroup.
     * 
     * @param ocspcheck
     */
    public void setOcspcheck(java.lang.String ocspcheck) {
        this.ocspcheck = ocspcheck;
    }


    /**
     * Gets the crlcheck value for this Sslservicegroup.
     * 
     * @return crlcheck
     */
    public java.lang.String getCrlcheck() {
        return crlcheck;
    }


    /**
     * Sets the crlcheck value for this Sslservicegroup.
     * 
     * @param crlcheck
     */
    public void setCrlcheck(java.lang.String crlcheck) {
        this.crlcheck = crlcheck;
    }


    /**
     * Gets the description value for this Sslservicegroup.
     * 
     * @return description
     */
    public java.lang.String[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Sslservicegroup.
     * 
     * @param description
     */
    public void setDescription(java.lang.String[] description) {
        this.description = description;
    }


    /**
     * Gets the certkeyname value for this Sslservicegroup.
     * 
     * @return certkeyname
     */
    public java.lang.String[] getCertkeyname() {
        return certkeyname;
    }


    /**
     * Sets the certkeyname value for this Sslservicegroup.
     * 
     * @param certkeyname
     */
    public void setCertkeyname(java.lang.String[] certkeyname) {
        this.certkeyname = certkeyname;
    }


    /**
     * Gets the cleartextport value for this Sslservicegroup.
     * 
     * @return cleartextport
     */
    public org.apache.axis.types.UnsignedInt getCleartextport() {
        return cleartextport;
    }


    /**
     * Sets the cleartextport value for this Sslservicegroup.
     * 
     * @param cleartextport
     */
    public void setCleartextport(org.apache.axis.types.UnsignedInt cleartextport) {
        this.cleartextport = cleartextport;
    }


    /**
     * Gets the servicename value for this Sslservicegroup.
     * 
     * @return servicename
     */
    public java.lang.String getServicename() {
        return servicename;
    }


    /**
     * Sets the servicename value for this Sslservicegroup.
     * 
     * @param servicename
     */
    public void setServicename(java.lang.String servicename) {
        this.servicename = servicename;
    }


    /**
     * Gets the ca value for this Sslservicegroup.
     * 
     * @return ca
     */
    public boolean isCa() {
        return ca;
    }


    /**
     * Sets the ca value for this Sslservicegroup.
     * 
     * @param ca
     */
    public void setCa(boolean ca) {
        this.ca = ca;
    }


    /**
     * Gets the snicert value for this Sslservicegroup.
     * 
     * @return snicert
     */
    public boolean isSnicert() {
        return snicert;
    }


    /**
     * Sets the snicert value for this Sslservicegroup.
     * 
     * @param snicert
     */
    public void setSnicert(boolean snicert) {
        this.snicert = snicert;
    }


    /**
     * Gets the sendclosenotify value for this Sslservicegroup.
     * 
     * @return sendclosenotify
     */
    public java.lang.String getSendclosenotify() {
        return sendclosenotify;
    }


    /**
     * Sets the sendclosenotify value for this Sslservicegroup.
     * 
     * @param sendclosenotify
     */
    public void setSendclosenotify(java.lang.String sendclosenotify) {
        this.sendclosenotify = sendclosenotify;
    }


    /**
     * Gets the boundcrlcheck value for this Sslservicegroup.
     * 
     * @return boundcrlcheck
     */
    public java.lang.String[] getBoundcrlcheck() {
        return boundcrlcheck;
    }


    /**
     * Sets the boundcrlcheck value for this Sslservicegroup.
     * 
     * @param boundcrlcheck
     */
    public void setBoundcrlcheck(java.lang.String[] boundcrlcheck) {
        this.boundcrlcheck = boundcrlcheck;
    }


    /**
     * Gets the boundocspcheck value for this Sslservicegroup.
     * 
     * @return boundocspcheck
     */
    public java.lang.String[] getBoundocspcheck() {
        return boundocspcheck;
    }


    /**
     * Sets the boundocspcheck value for this Sslservicegroup.
     * 
     * @param boundocspcheck
     */
    public void setBoundocspcheck(java.lang.String[] boundocspcheck) {
        this.boundocspcheck = boundocspcheck;
    }


    /**
     * Gets the boundcacert value for this Sslservicegroup.
     * 
     * @return boundcacert
     */
    public boolean[] getBoundcacert() {
        return boundcacert;
    }


    /**
     * Sets the boundcacert value for this Sslservicegroup.
     * 
     * @param boundcacert
     */
    public void setBoundcacert(boolean[] boundcacert) {
        this.boundcacert = boundcacert;
    }


    /**
     * Gets the boundsnicert value for this Sslservicegroup.
     * 
     * @return boundsnicert
     */
    public boolean[] getBoundsnicert() {
        return boundsnicert;
    }


    /**
     * Sets the boundsnicert value for this Sslservicegroup.
     * 
     * @param boundsnicert
     */
    public void setBoundsnicert(boolean[] boundsnicert) {
        this.boundsnicert = boundsnicert;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sslservicegroup)) return false;
        Sslservicegroup other = (Sslservicegroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.servicegroupname==null && other.getServicegroupname()==null) || 
             (this.servicegroupname!=null &&
              this.servicegroupname.equals(other.getServicegroupname()))) &&
            this.cipherdetails == other.isCipherdetails() &&
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
            ((this.ocspcheck==null && other.getOcspcheck()==null) || 
             (this.ocspcheck!=null &&
              this.ocspcheck.equals(other.getOcspcheck()))) &&
            ((this.crlcheck==null && other.getCrlcheck()==null) || 
             (this.crlcheck!=null &&
              this.crlcheck.equals(other.getCrlcheck()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.certkeyname==null && other.getCertkeyname()==null) || 
             (this.certkeyname!=null &&
              java.util.Arrays.equals(this.certkeyname, other.getCertkeyname()))) &&
            ((this.cleartextport==null && other.getCleartextport()==null) || 
             (this.cleartextport!=null &&
              this.cleartextport.equals(other.getCleartextport()))) &&
            ((this.servicename==null && other.getServicename()==null) || 
             (this.servicename!=null &&
              this.servicename.equals(other.getServicename()))) &&
            this.ca == other.isCa() &&
            this.snicert == other.isSnicert() &&
            ((this.sendclosenotify==null && other.getSendclosenotify()==null) || 
             (this.sendclosenotify!=null &&
              this.sendclosenotify.equals(other.getSendclosenotify()))) &&
            ((this.boundcrlcheck==null && other.getBoundcrlcheck()==null) || 
             (this.boundcrlcheck!=null &&
              java.util.Arrays.equals(this.boundcrlcheck, other.getBoundcrlcheck()))) &&
            ((this.boundocspcheck==null && other.getBoundocspcheck()==null) || 
             (this.boundocspcheck!=null &&
              java.util.Arrays.equals(this.boundocspcheck, other.getBoundocspcheck()))) &&
            ((this.boundcacert==null && other.getBoundcacert()==null) || 
             (this.boundcacert!=null &&
              java.util.Arrays.equals(this.boundcacert, other.getBoundcacert()))) &&
            ((this.boundsnicert==null && other.getBoundsnicert()==null) || 
             (this.boundsnicert!=null &&
              java.util.Arrays.equals(this.boundsnicert, other.getBoundsnicert())));
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
        if (getServicegroupname() != null) {
            _hashCode += getServicegroupname().hashCode();
        }
        _hashCode += (isCipherdetails() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        if (getOcspcheck() != null) {
            _hashCode += getOcspcheck().hashCode();
        }
        if (getCrlcheck() != null) {
            _hashCode += getCrlcheck().hashCode();
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
        if (getCleartextport() != null) {
            _hashCode += getCleartextport().hashCode();
        }
        if (getServicename() != null) {
            _hashCode += getServicename().hashCode();
        }
        _hashCode += (isCa() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isSnicert() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSendclosenotify() != null) {
            _hashCode += getSendclosenotify().hashCode();
        }
        if (getBoundcrlcheck() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundcrlcheck());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundcrlcheck(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBoundocspcheck() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundocspcheck());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundocspcheck(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBoundcacert() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundcacert());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundcacert(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBoundsnicert() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundsnicert());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundsnicert(), i);
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
        new org.apache.axis.description.TypeDesc(Sslservicegroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "sslservicegroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicegroupname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicegroupname"));
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
        elemField.setFieldName("ocspcheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ocspcheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crlcheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crlcheck"));
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
        elemField.setFieldName("cleartextport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cleartextport"));
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
        elemField.setFieldName("sendclosenotify");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendclosenotify"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundcrlcheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundcrlcheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundocspcheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundocspcheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundcacert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundcacert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundsnicert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundsnicert"));
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
