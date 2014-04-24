/**
 * Nsconfig.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nsconfig  implements java.io.Serializable {
    private java.lang.String ipaddress;

    private java.lang.String netmask;

    private java.lang.String mappedip;

    private org.apache.axis.types.UnsignedInt range;

    private org.apache.axis.types.UnsignedInt nsvlan;

    private java.lang.String[] ifnum;

    private java.lang.String tagged;

    private org.apache.axis.types.UnsignedInt[] httpport;

    private org.apache.axis.types.UnsignedInt maxconn;

    private org.apache.axis.types.UnsignedInt maxreq;

    private java.lang.String cip;

    private java.lang.String cipheader;

    private java.lang.String cookieversion;

    private java.lang.String securecookie;

    private java.lang.String failover;

    private java.lang.String systemtype;

    private java.lang.String primaryip;

    private org.apache.axis.types.UnsignedInt pmtumin;

    private org.apache.axis.types.UnsignedInt pmtutimeout;

    private java.lang.String ftpportrange;

    private java.lang.String crportrange;

    private org.apache.axis.types.UnsignedInt flags;

    private java.lang.String timezone;

    private java.lang.String lastconfigchangedtime;

    private java.lang.String lastconfigsavetime;

    private java.lang.String currentsytemtime;

    private org.apache.axis.types.UnsignedInt systemtime;

    private org.apache.axis.types.UnsignedInt grantquotamaxclient;

    private org.apache.axis.types.UnsignedInt exclusivequotamaxclient;

    private org.apache.axis.types.UnsignedInt grantquotaspillover;

    private org.apache.axis.types.UnsignedInt exclusivequotaspillover;

    private java.lang.String nwfwmode;

    public Nsconfig() {
    }

    public Nsconfig(
           java.lang.String ipaddress,
           java.lang.String netmask,
           java.lang.String mappedip,
           org.apache.axis.types.UnsignedInt range,
           org.apache.axis.types.UnsignedInt nsvlan,
           java.lang.String[] ifnum,
           java.lang.String tagged,
           org.apache.axis.types.UnsignedInt[] httpport,
           org.apache.axis.types.UnsignedInt maxconn,
           org.apache.axis.types.UnsignedInt maxreq,
           java.lang.String cip,
           java.lang.String cipheader,
           java.lang.String cookieversion,
           java.lang.String securecookie,
           java.lang.String failover,
           java.lang.String systemtype,
           java.lang.String primaryip,
           org.apache.axis.types.UnsignedInt pmtumin,
           org.apache.axis.types.UnsignedInt pmtutimeout,
           java.lang.String ftpportrange,
           java.lang.String crportrange,
           org.apache.axis.types.UnsignedInt flags,
           java.lang.String timezone,
           java.lang.String lastconfigchangedtime,
           java.lang.String lastconfigsavetime,
           java.lang.String currentsytemtime,
           org.apache.axis.types.UnsignedInt systemtime,
           org.apache.axis.types.UnsignedInt grantquotamaxclient,
           org.apache.axis.types.UnsignedInt exclusivequotamaxclient,
           org.apache.axis.types.UnsignedInt grantquotaspillover,
           org.apache.axis.types.UnsignedInt exclusivequotaspillover,
           java.lang.String nwfwmode) {
           this.ipaddress = ipaddress;
           this.netmask = netmask;
           this.mappedip = mappedip;
           this.range = range;
           this.nsvlan = nsvlan;
           this.ifnum = ifnum;
           this.tagged = tagged;
           this.httpport = httpport;
           this.maxconn = maxconn;
           this.maxreq = maxreq;
           this.cip = cip;
           this.cipheader = cipheader;
           this.cookieversion = cookieversion;
           this.securecookie = securecookie;
           this.failover = failover;
           this.systemtype = systemtype;
           this.primaryip = primaryip;
           this.pmtumin = pmtumin;
           this.pmtutimeout = pmtutimeout;
           this.ftpportrange = ftpportrange;
           this.crportrange = crportrange;
           this.flags = flags;
           this.timezone = timezone;
           this.lastconfigchangedtime = lastconfigchangedtime;
           this.lastconfigsavetime = lastconfigsavetime;
           this.currentsytemtime = currentsytemtime;
           this.systemtime = systemtime;
           this.grantquotamaxclient = grantquotamaxclient;
           this.exclusivequotamaxclient = exclusivequotamaxclient;
           this.grantquotaspillover = grantquotaspillover;
           this.exclusivequotaspillover = exclusivequotaspillover;
           this.nwfwmode = nwfwmode;
    }


    /**
     * Gets the ipaddress value for this Nsconfig.
     * 
     * @return ipaddress
     */
    public java.lang.String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Nsconfig.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the netmask value for this Nsconfig.
     * 
     * @return netmask
     */
    public java.lang.String getNetmask() {
        return netmask;
    }


    /**
     * Sets the netmask value for this Nsconfig.
     * 
     * @param netmask
     */
    public void setNetmask(java.lang.String netmask) {
        this.netmask = netmask;
    }


    /**
     * Gets the mappedip value for this Nsconfig.
     * 
     * @return mappedip
     */
    public java.lang.String getMappedip() {
        return mappedip;
    }


    /**
     * Sets the mappedip value for this Nsconfig.
     * 
     * @param mappedip
     */
    public void setMappedip(java.lang.String mappedip) {
        this.mappedip = mappedip;
    }


    /**
     * Gets the range value for this Nsconfig.
     * 
     * @return range
     */
    public org.apache.axis.types.UnsignedInt getRange() {
        return range;
    }


    /**
     * Sets the range value for this Nsconfig.
     * 
     * @param range
     */
    public void setRange(org.apache.axis.types.UnsignedInt range) {
        this.range = range;
    }


    /**
     * Gets the nsvlan value for this Nsconfig.
     * 
     * @return nsvlan
     */
    public org.apache.axis.types.UnsignedInt getNsvlan() {
        return nsvlan;
    }


    /**
     * Sets the nsvlan value for this Nsconfig.
     * 
     * @param nsvlan
     */
    public void setNsvlan(org.apache.axis.types.UnsignedInt nsvlan) {
        this.nsvlan = nsvlan;
    }


    /**
     * Gets the ifnum value for this Nsconfig.
     * 
     * @return ifnum
     */
    public java.lang.String[] getIfnum() {
        return ifnum;
    }


    /**
     * Sets the ifnum value for this Nsconfig.
     * 
     * @param ifnum
     */
    public void setIfnum(java.lang.String[] ifnum) {
        this.ifnum = ifnum;
    }


    /**
     * Gets the tagged value for this Nsconfig.
     * 
     * @return tagged
     */
    public java.lang.String getTagged() {
        return tagged;
    }


    /**
     * Sets the tagged value for this Nsconfig.
     * 
     * @param tagged
     */
    public void setTagged(java.lang.String tagged) {
        this.tagged = tagged;
    }


    /**
     * Gets the httpport value for this Nsconfig.
     * 
     * @return httpport
     */
    public org.apache.axis.types.UnsignedInt[] getHttpport() {
        return httpport;
    }


    /**
     * Sets the httpport value for this Nsconfig.
     * 
     * @param httpport
     */
    public void setHttpport(org.apache.axis.types.UnsignedInt[] httpport) {
        this.httpport = httpport;
    }


    /**
     * Gets the maxconn value for this Nsconfig.
     * 
     * @return maxconn
     */
    public org.apache.axis.types.UnsignedInt getMaxconn() {
        return maxconn;
    }


    /**
     * Sets the maxconn value for this Nsconfig.
     * 
     * @param maxconn
     */
    public void setMaxconn(org.apache.axis.types.UnsignedInt maxconn) {
        this.maxconn = maxconn;
    }


    /**
     * Gets the maxreq value for this Nsconfig.
     * 
     * @return maxreq
     */
    public org.apache.axis.types.UnsignedInt getMaxreq() {
        return maxreq;
    }


    /**
     * Sets the maxreq value for this Nsconfig.
     * 
     * @param maxreq
     */
    public void setMaxreq(org.apache.axis.types.UnsignedInt maxreq) {
        this.maxreq = maxreq;
    }


    /**
     * Gets the cip value for this Nsconfig.
     * 
     * @return cip
     */
    public java.lang.String getCip() {
        return cip;
    }


    /**
     * Sets the cip value for this Nsconfig.
     * 
     * @param cip
     */
    public void setCip(java.lang.String cip) {
        this.cip = cip;
    }


    /**
     * Gets the cipheader value for this Nsconfig.
     * 
     * @return cipheader
     */
    public java.lang.String getCipheader() {
        return cipheader;
    }


    /**
     * Sets the cipheader value for this Nsconfig.
     * 
     * @param cipheader
     */
    public void setCipheader(java.lang.String cipheader) {
        this.cipheader = cipheader;
    }


    /**
     * Gets the cookieversion value for this Nsconfig.
     * 
     * @return cookieversion
     */
    public java.lang.String getCookieversion() {
        return cookieversion;
    }


    /**
     * Sets the cookieversion value for this Nsconfig.
     * 
     * @param cookieversion
     */
    public void setCookieversion(java.lang.String cookieversion) {
        this.cookieversion = cookieversion;
    }


    /**
     * Gets the securecookie value for this Nsconfig.
     * 
     * @return securecookie
     */
    public java.lang.String getSecurecookie() {
        return securecookie;
    }


    /**
     * Sets the securecookie value for this Nsconfig.
     * 
     * @param securecookie
     */
    public void setSecurecookie(java.lang.String securecookie) {
        this.securecookie = securecookie;
    }


    /**
     * Gets the failover value for this Nsconfig.
     * 
     * @return failover
     */
    public java.lang.String getFailover() {
        return failover;
    }


    /**
     * Sets the failover value for this Nsconfig.
     * 
     * @param failover
     */
    public void setFailover(java.lang.String failover) {
        this.failover = failover;
    }


    /**
     * Gets the systemtype value for this Nsconfig.
     * 
     * @return systemtype
     */
    public java.lang.String getSystemtype() {
        return systemtype;
    }


    /**
     * Sets the systemtype value for this Nsconfig.
     * 
     * @param systemtype
     */
    public void setSystemtype(java.lang.String systemtype) {
        this.systemtype = systemtype;
    }


    /**
     * Gets the primaryip value for this Nsconfig.
     * 
     * @return primaryip
     */
    public java.lang.String getPrimaryip() {
        return primaryip;
    }


    /**
     * Sets the primaryip value for this Nsconfig.
     * 
     * @param primaryip
     */
    public void setPrimaryip(java.lang.String primaryip) {
        this.primaryip = primaryip;
    }


    /**
     * Gets the pmtumin value for this Nsconfig.
     * 
     * @return pmtumin
     */
    public org.apache.axis.types.UnsignedInt getPmtumin() {
        return pmtumin;
    }


    /**
     * Sets the pmtumin value for this Nsconfig.
     * 
     * @param pmtumin
     */
    public void setPmtumin(org.apache.axis.types.UnsignedInt pmtumin) {
        this.pmtumin = pmtumin;
    }


    /**
     * Gets the pmtutimeout value for this Nsconfig.
     * 
     * @return pmtutimeout
     */
    public org.apache.axis.types.UnsignedInt getPmtutimeout() {
        return pmtutimeout;
    }


    /**
     * Sets the pmtutimeout value for this Nsconfig.
     * 
     * @param pmtutimeout
     */
    public void setPmtutimeout(org.apache.axis.types.UnsignedInt pmtutimeout) {
        this.pmtutimeout = pmtutimeout;
    }


    /**
     * Gets the ftpportrange value for this Nsconfig.
     * 
     * @return ftpportrange
     */
    public java.lang.String getFtpportrange() {
        return ftpportrange;
    }


    /**
     * Sets the ftpportrange value for this Nsconfig.
     * 
     * @param ftpportrange
     */
    public void setFtpportrange(java.lang.String ftpportrange) {
        this.ftpportrange = ftpportrange;
    }


    /**
     * Gets the crportrange value for this Nsconfig.
     * 
     * @return crportrange
     */
    public java.lang.String getCrportrange() {
        return crportrange;
    }


    /**
     * Sets the crportrange value for this Nsconfig.
     * 
     * @param crportrange
     */
    public void setCrportrange(java.lang.String crportrange) {
        this.crportrange = crportrange;
    }


    /**
     * Gets the flags value for this Nsconfig.
     * 
     * @return flags
     */
    public org.apache.axis.types.UnsignedInt getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this Nsconfig.
     * 
     * @param flags
     */
    public void setFlags(org.apache.axis.types.UnsignedInt flags) {
        this.flags = flags;
    }


    /**
     * Gets the timezone value for this Nsconfig.
     * 
     * @return timezone
     */
    public java.lang.String getTimezone() {
        return timezone;
    }


    /**
     * Sets the timezone value for this Nsconfig.
     * 
     * @param timezone
     */
    public void setTimezone(java.lang.String timezone) {
        this.timezone = timezone;
    }


    /**
     * Gets the lastconfigchangedtime value for this Nsconfig.
     * 
     * @return lastconfigchangedtime
     */
    public java.lang.String getLastconfigchangedtime() {
        return lastconfigchangedtime;
    }


    /**
     * Sets the lastconfigchangedtime value for this Nsconfig.
     * 
     * @param lastconfigchangedtime
     */
    public void setLastconfigchangedtime(java.lang.String lastconfigchangedtime) {
        this.lastconfigchangedtime = lastconfigchangedtime;
    }


    /**
     * Gets the lastconfigsavetime value for this Nsconfig.
     * 
     * @return lastconfigsavetime
     */
    public java.lang.String getLastconfigsavetime() {
        return lastconfigsavetime;
    }


    /**
     * Sets the lastconfigsavetime value for this Nsconfig.
     * 
     * @param lastconfigsavetime
     */
    public void setLastconfigsavetime(java.lang.String lastconfigsavetime) {
        this.lastconfigsavetime = lastconfigsavetime;
    }


    /**
     * Gets the currentsytemtime value for this Nsconfig.
     * 
     * @return currentsytemtime
     */
    public java.lang.String getCurrentsytemtime() {
        return currentsytemtime;
    }


    /**
     * Sets the currentsytemtime value for this Nsconfig.
     * 
     * @param currentsytemtime
     */
    public void setCurrentsytemtime(java.lang.String currentsytemtime) {
        this.currentsytemtime = currentsytemtime;
    }


    /**
     * Gets the systemtime value for this Nsconfig.
     * 
     * @return systemtime
     */
    public org.apache.axis.types.UnsignedInt getSystemtime() {
        return systemtime;
    }


    /**
     * Sets the systemtime value for this Nsconfig.
     * 
     * @param systemtime
     */
    public void setSystemtime(org.apache.axis.types.UnsignedInt systemtime) {
        this.systemtime = systemtime;
    }


    /**
     * Gets the grantquotamaxclient value for this Nsconfig.
     * 
     * @return grantquotamaxclient
     */
    public org.apache.axis.types.UnsignedInt getGrantquotamaxclient() {
        return grantquotamaxclient;
    }


    /**
     * Sets the grantquotamaxclient value for this Nsconfig.
     * 
     * @param grantquotamaxclient
     */
    public void setGrantquotamaxclient(org.apache.axis.types.UnsignedInt grantquotamaxclient) {
        this.grantquotamaxclient = grantquotamaxclient;
    }


    /**
     * Gets the exclusivequotamaxclient value for this Nsconfig.
     * 
     * @return exclusivequotamaxclient
     */
    public org.apache.axis.types.UnsignedInt getExclusivequotamaxclient() {
        return exclusivequotamaxclient;
    }


    /**
     * Sets the exclusivequotamaxclient value for this Nsconfig.
     * 
     * @param exclusivequotamaxclient
     */
    public void setExclusivequotamaxclient(org.apache.axis.types.UnsignedInt exclusivequotamaxclient) {
        this.exclusivequotamaxclient = exclusivequotamaxclient;
    }


    /**
     * Gets the grantquotaspillover value for this Nsconfig.
     * 
     * @return grantquotaspillover
     */
    public org.apache.axis.types.UnsignedInt getGrantquotaspillover() {
        return grantquotaspillover;
    }


    /**
     * Sets the grantquotaspillover value for this Nsconfig.
     * 
     * @param grantquotaspillover
     */
    public void setGrantquotaspillover(org.apache.axis.types.UnsignedInt grantquotaspillover) {
        this.grantquotaspillover = grantquotaspillover;
    }


    /**
     * Gets the exclusivequotaspillover value for this Nsconfig.
     * 
     * @return exclusivequotaspillover
     */
    public org.apache.axis.types.UnsignedInt getExclusivequotaspillover() {
        return exclusivequotaspillover;
    }


    /**
     * Sets the exclusivequotaspillover value for this Nsconfig.
     * 
     * @param exclusivequotaspillover
     */
    public void setExclusivequotaspillover(org.apache.axis.types.UnsignedInt exclusivequotaspillover) {
        this.exclusivequotaspillover = exclusivequotaspillover;
    }


    /**
     * Gets the nwfwmode value for this Nsconfig.
     * 
     * @return nwfwmode
     */
    public java.lang.String getNwfwmode() {
        return nwfwmode;
    }


    /**
     * Sets the nwfwmode value for this Nsconfig.
     * 
     * @param nwfwmode
     */
    public void setNwfwmode(java.lang.String nwfwmode) {
        this.nwfwmode = nwfwmode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nsconfig)) return false;
        Nsconfig other = (Nsconfig) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              this.ipaddress.equals(other.getIpaddress()))) &&
            ((this.netmask==null && other.getNetmask()==null) || 
             (this.netmask!=null &&
              this.netmask.equals(other.getNetmask()))) &&
            ((this.mappedip==null && other.getMappedip()==null) || 
             (this.mappedip!=null &&
              this.mappedip.equals(other.getMappedip()))) &&
            ((this.range==null && other.getRange()==null) || 
             (this.range!=null &&
              this.range.equals(other.getRange()))) &&
            ((this.nsvlan==null && other.getNsvlan()==null) || 
             (this.nsvlan!=null &&
              this.nsvlan.equals(other.getNsvlan()))) &&
            ((this.ifnum==null && other.getIfnum()==null) || 
             (this.ifnum!=null &&
              java.util.Arrays.equals(this.ifnum, other.getIfnum()))) &&
            ((this.tagged==null && other.getTagged()==null) || 
             (this.tagged!=null &&
              this.tagged.equals(other.getTagged()))) &&
            ((this.httpport==null && other.getHttpport()==null) || 
             (this.httpport!=null &&
              java.util.Arrays.equals(this.httpport, other.getHttpport()))) &&
            ((this.maxconn==null && other.getMaxconn()==null) || 
             (this.maxconn!=null &&
              this.maxconn.equals(other.getMaxconn()))) &&
            ((this.maxreq==null && other.getMaxreq()==null) || 
             (this.maxreq!=null &&
              this.maxreq.equals(other.getMaxreq()))) &&
            ((this.cip==null && other.getCip()==null) || 
             (this.cip!=null &&
              this.cip.equals(other.getCip()))) &&
            ((this.cipheader==null && other.getCipheader()==null) || 
             (this.cipheader!=null &&
              this.cipheader.equals(other.getCipheader()))) &&
            ((this.cookieversion==null && other.getCookieversion()==null) || 
             (this.cookieversion!=null &&
              this.cookieversion.equals(other.getCookieversion()))) &&
            ((this.securecookie==null && other.getSecurecookie()==null) || 
             (this.securecookie!=null &&
              this.securecookie.equals(other.getSecurecookie()))) &&
            ((this.failover==null && other.getFailover()==null) || 
             (this.failover!=null &&
              this.failover.equals(other.getFailover()))) &&
            ((this.systemtype==null && other.getSystemtype()==null) || 
             (this.systemtype!=null &&
              this.systemtype.equals(other.getSystemtype()))) &&
            ((this.primaryip==null && other.getPrimaryip()==null) || 
             (this.primaryip!=null &&
              this.primaryip.equals(other.getPrimaryip()))) &&
            ((this.pmtumin==null && other.getPmtumin()==null) || 
             (this.pmtumin!=null &&
              this.pmtumin.equals(other.getPmtumin()))) &&
            ((this.pmtutimeout==null && other.getPmtutimeout()==null) || 
             (this.pmtutimeout!=null &&
              this.pmtutimeout.equals(other.getPmtutimeout()))) &&
            ((this.ftpportrange==null && other.getFtpportrange()==null) || 
             (this.ftpportrange!=null &&
              this.ftpportrange.equals(other.getFtpportrange()))) &&
            ((this.crportrange==null && other.getCrportrange()==null) || 
             (this.crportrange!=null &&
              this.crportrange.equals(other.getCrportrange()))) &&
            ((this.flags==null && other.getFlags()==null) || 
             (this.flags!=null &&
              this.flags.equals(other.getFlags()))) &&
            ((this.timezone==null && other.getTimezone()==null) || 
             (this.timezone!=null &&
              this.timezone.equals(other.getTimezone()))) &&
            ((this.lastconfigchangedtime==null && other.getLastconfigchangedtime()==null) || 
             (this.lastconfigchangedtime!=null &&
              this.lastconfigchangedtime.equals(other.getLastconfigchangedtime()))) &&
            ((this.lastconfigsavetime==null && other.getLastconfigsavetime()==null) || 
             (this.lastconfigsavetime!=null &&
              this.lastconfigsavetime.equals(other.getLastconfigsavetime()))) &&
            ((this.currentsytemtime==null && other.getCurrentsytemtime()==null) || 
             (this.currentsytemtime!=null &&
              this.currentsytemtime.equals(other.getCurrentsytemtime()))) &&
            ((this.systemtime==null && other.getSystemtime()==null) || 
             (this.systemtime!=null &&
              this.systemtime.equals(other.getSystemtime()))) &&
            ((this.grantquotamaxclient==null && other.getGrantquotamaxclient()==null) || 
             (this.grantquotamaxclient!=null &&
              this.grantquotamaxclient.equals(other.getGrantquotamaxclient()))) &&
            ((this.exclusivequotamaxclient==null && other.getExclusivequotamaxclient()==null) || 
             (this.exclusivequotamaxclient!=null &&
              this.exclusivequotamaxclient.equals(other.getExclusivequotamaxclient()))) &&
            ((this.grantquotaspillover==null && other.getGrantquotaspillover()==null) || 
             (this.grantquotaspillover!=null &&
              this.grantquotaspillover.equals(other.getGrantquotaspillover()))) &&
            ((this.exclusivequotaspillover==null && other.getExclusivequotaspillover()==null) || 
             (this.exclusivequotaspillover!=null &&
              this.exclusivequotaspillover.equals(other.getExclusivequotaspillover()))) &&
            ((this.nwfwmode==null && other.getNwfwmode()==null) || 
             (this.nwfwmode!=null &&
              this.nwfwmode.equals(other.getNwfwmode())));
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
        if (getIpaddress() != null) {
            _hashCode += getIpaddress().hashCode();
        }
        if (getNetmask() != null) {
            _hashCode += getNetmask().hashCode();
        }
        if (getMappedip() != null) {
            _hashCode += getMappedip().hashCode();
        }
        if (getRange() != null) {
            _hashCode += getRange().hashCode();
        }
        if (getNsvlan() != null) {
            _hashCode += getNsvlan().hashCode();
        }
        if (getIfnum() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIfnum());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIfnum(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTagged() != null) {
            _hashCode += getTagged().hashCode();
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
        if (getMaxconn() != null) {
            _hashCode += getMaxconn().hashCode();
        }
        if (getMaxreq() != null) {
            _hashCode += getMaxreq().hashCode();
        }
        if (getCip() != null) {
            _hashCode += getCip().hashCode();
        }
        if (getCipheader() != null) {
            _hashCode += getCipheader().hashCode();
        }
        if (getCookieversion() != null) {
            _hashCode += getCookieversion().hashCode();
        }
        if (getSecurecookie() != null) {
            _hashCode += getSecurecookie().hashCode();
        }
        if (getFailover() != null) {
            _hashCode += getFailover().hashCode();
        }
        if (getSystemtype() != null) {
            _hashCode += getSystemtype().hashCode();
        }
        if (getPrimaryip() != null) {
            _hashCode += getPrimaryip().hashCode();
        }
        if (getPmtumin() != null) {
            _hashCode += getPmtumin().hashCode();
        }
        if (getPmtutimeout() != null) {
            _hashCode += getPmtutimeout().hashCode();
        }
        if (getFtpportrange() != null) {
            _hashCode += getFtpportrange().hashCode();
        }
        if (getCrportrange() != null) {
            _hashCode += getCrportrange().hashCode();
        }
        if (getFlags() != null) {
            _hashCode += getFlags().hashCode();
        }
        if (getTimezone() != null) {
            _hashCode += getTimezone().hashCode();
        }
        if (getLastconfigchangedtime() != null) {
            _hashCode += getLastconfigchangedtime().hashCode();
        }
        if (getLastconfigsavetime() != null) {
            _hashCode += getLastconfigsavetime().hashCode();
        }
        if (getCurrentsytemtime() != null) {
            _hashCode += getCurrentsytemtime().hashCode();
        }
        if (getSystemtime() != null) {
            _hashCode += getSystemtime().hashCode();
        }
        if (getGrantquotamaxclient() != null) {
            _hashCode += getGrantquotamaxclient().hashCode();
        }
        if (getExclusivequotamaxclient() != null) {
            _hashCode += getExclusivequotamaxclient().hashCode();
        }
        if (getGrantquotaspillover() != null) {
            _hashCode += getGrantquotaspillover().hashCode();
        }
        if (getExclusivequotaspillover() != null) {
            _hashCode += getExclusivequotaspillover().hashCode();
        }
        if (getNwfwmode() != null) {
            _hashCode += getNwfwmode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nsconfig.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nsconfig"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipaddress"));
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
        elemField.setFieldName("mappedip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mappedip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("range");
        elemField.setXmlName(new javax.xml.namespace.QName("", "range"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nsvlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nsvlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ifnum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ifnum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tagged");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tagged"));
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
        elemField.setFieldName("maxconn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxconn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxreq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxreq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cipheader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cipheader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cookieversion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cookieversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("securecookie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "securecookie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failover");
        elemField.setXmlName(new javax.xml.namespace.QName("", "failover"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "systemtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("primaryip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "primaryip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmtumin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmtumin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmtutimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmtutimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ftpportrange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ftpportrange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crportrange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crportrange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timezone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timezone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastconfigchangedtime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastconfigchangedtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastconfigsavetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastconfigsavetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentsytemtime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentsytemtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemtime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "systemtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grantquotamaxclient");
        elemField.setXmlName(new javax.xml.namespace.QName("", "grantquotamaxclient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exclusivequotamaxclient");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exclusivequotamaxclient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grantquotaspillover");
        elemField.setXmlName(new javax.xml.namespace.QName("", "grantquotaspillover"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exclusivequotaspillover");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exclusivequotaspillover"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nwfwmode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nwfwmode"));
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
