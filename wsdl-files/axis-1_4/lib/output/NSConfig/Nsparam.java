/**
 * Nsparam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nsparam  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt[] httpport;

    private org.apache.axis.types.UnsignedInt maxconn;

    private org.apache.axis.types.UnsignedInt maxreq;

    private java.lang.String cip;

    private java.lang.String cipheader;

    private java.lang.String cookieversion;

    private java.lang.String securecookie;

    private org.apache.axis.types.UnsignedInt pmtumin;

    private org.apache.axis.types.UnsignedInt pmtutimeout;

    private java.lang.String ftpportrange;

    private java.lang.String crportrange;

    private java.lang.String timezone;

    private org.apache.axis.types.UnsignedInt grantquotamaxclient;

    private org.apache.axis.types.UnsignedInt exclusivequotamaxclient;

    private org.apache.axis.types.UnsignedInt grantquotaspillover;

    private org.apache.axis.types.UnsignedInt exclusivequotaspillover;

    private java.lang.String useproxyport;

    private java.lang.String internaluserlogin;

    private java.lang.String aftpallowrandomsourceport;

    private org.apache.axis.types.UnsignedInt[] icaports;

    public Nsparam() {
    }

    public Nsparam(
           org.apache.axis.types.UnsignedInt[] httpport,
           org.apache.axis.types.UnsignedInt maxconn,
           org.apache.axis.types.UnsignedInt maxreq,
           java.lang.String cip,
           java.lang.String cipheader,
           java.lang.String cookieversion,
           java.lang.String securecookie,
           org.apache.axis.types.UnsignedInt pmtumin,
           org.apache.axis.types.UnsignedInt pmtutimeout,
           java.lang.String ftpportrange,
           java.lang.String crportrange,
           java.lang.String timezone,
           org.apache.axis.types.UnsignedInt grantquotamaxclient,
           org.apache.axis.types.UnsignedInt exclusivequotamaxclient,
           org.apache.axis.types.UnsignedInt grantquotaspillover,
           org.apache.axis.types.UnsignedInt exclusivequotaspillover,
           java.lang.String useproxyport,
           java.lang.String internaluserlogin,
           java.lang.String aftpallowrandomsourceport,
           org.apache.axis.types.UnsignedInt[] icaports) {
           this.httpport = httpport;
           this.maxconn = maxconn;
           this.maxreq = maxreq;
           this.cip = cip;
           this.cipheader = cipheader;
           this.cookieversion = cookieversion;
           this.securecookie = securecookie;
           this.pmtumin = pmtumin;
           this.pmtutimeout = pmtutimeout;
           this.ftpportrange = ftpportrange;
           this.crportrange = crportrange;
           this.timezone = timezone;
           this.grantquotamaxclient = grantquotamaxclient;
           this.exclusivequotamaxclient = exclusivequotamaxclient;
           this.grantquotaspillover = grantquotaspillover;
           this.exclusivequotaspillover = exclusivequotaspillover;
           this.useproxyport = useproxyport;
           this.internaluserlogin = internaluserlogin;
           this.aftpallowrandomsourceport = aftpallowrandomsourceport;
           this.icaports = icaports;
    }


    /**
     * Gets the httpport value for this Nsparam.
     * 
     * @return httpport
     */
    public org.apache.axis.types.UnsignedInt[] getHttpport() {
        return httpport;
    }


    /**
     * Sets the httpport value for this Nsparam.
     * 
     * @param httpport
     */
    public void setHttpport(org.apache.axis.types.UnsignedInt[] httpport) {
        this.httpport = httpport;
    }


    /**
     * Gets the maxconn value for this Nsparam.
     * 
     * @return maxconn
     */
    public org.apache.axis.types.UnsignedInt getMaxconn() {
        return maxconn;
    }


    /**
     * Sets the maxconn value for this Nsparam.
     * 
     * @param maxconn
     */
    public void setMaxconn(org.apache.axis.types.UnsignedInt maxconn) {
        this.maxconn = maxconn;
    }


    /**
     * Gets the maxreq value for this Nsparam.
     * 
     * @return maxreq
     */
    public org.apache.axis.types.UnsignedInt getMaxreq() {
        return maxreq;
    }


    /**
     * Sets the maxreq value for this Nsparam.
     * 
     * @param maxreq
     */
    public void setMaxreq(org.apache.axis.types.UnsignedInt maxreq) {
        this.maxreq = maxreq;
    }


    /**
     * Gets the cip value for this Nsparam.
     * 
     * @return cip
     */
    public java.lang.String getCip() {
        return cip;
    }


    /**
     * Sets the cip value for this Nsparam.
     * 
     * @param cip
     */
    public void setCip(java.lang.String cip) {
        this.cip = cip;
    }


    /**
     * Gets the cipheader value for this Nsparam.
     * 
     * @return cipheader
     */
    public java.lang.String getCipheader() {
        return cipheader;
    }


    /**
     * Sets the cipheader value for this Nsparam.
     * 
     * @param cipheader
     */
    public void setCipheader(java.lang.String cipheader) {
        this.cipheader = cipheader;
    }


    /**
     * Gets the cookieversion value for this Nsparam.
     * 
     * @return cookieversion
     */
    public java.lang.String getCookieversion() {
        return cookieversion;
    }


    /**
     * Sets the cookieversion value for this Nsparam.
     * 
     * @param cookieversion
     */
    public void setCookieversion(java.lang.String cookieversion) {
        this.cookieversion = cookieversion;
    }


    /**
     * Gets the securecookie value for this Nsparam.
     * 
     * @return securecookie
     */
    public java.lang.String getSecurecookie() {
        return securecookie;
    }


    /**
     * Sets the securecookie value for this Nsparam.
     * 
     * @param securecookie
     */
    public void setSecurecookie(java.lang.String securecookie) {
        this.securecookie = securecookie;
    }


    /**
     * Gets the pmtumin value for this Nsparam.
     * 
     * @return pmtumin
     */
    public org.apache.axis.types.UnsignedInt getPmtumin() {
        return pmtumin;
    }


    /**
     * Sets the pmtumin value for this Nsparam.
     * 
     * @param pmtumin
     */
    public void setPmtumin(org.apache.axis.types.UnsignedInt pmtumin) {
        this.pmtumin = pmtumin;
    }


    /**
     * Gets the pmtutimeout value for this Nsparam.
     * 
     * @return pmtutimeout
     */
    public org.apache.axis.types.UnsignedInt getPmtutimeout() {
        return pmtutimeout;
    }


    /**
     * Sets the pmtutimeout value for this Nsparam.
     * 
     * @param pmtutimeout
     */
    public void setPmtutimeout(org.apache.axis.types.UnsignedInt pmtutimeout) {
        this.pmtutimeout = pmtutimeout;
    }


    /**
     * Gets the ftpportrange value for this Nsparam.
     * 
     * @return ftpportrange
     */
    public java.lang.String getFtpportrange() {
        return ftpportrange;
    }


    /**
     * Sets the ftpportrange value for this Nsparam.
     * 
     * @param ftpportrange
     */
    public void setFtpportrange(java.lang.String ftpportrange) {
        this.ftpportrange = ftpportrange;
    }


    /**
     * Gets the crportrange value for this Nsparam.
     * 
     * @return crportrange
     */
    public java.lang.String getCrportrange() {
        return crportrange;
    }


    /**
     * Sets the crportrange value for this Nsparam.
     * 
     * @param crportrange
     */
    public void setCrportrange(java.lang.String crportrange) {
        this.crportrange = crportrange;
    }


    /**
     * Gets the timezone value for this Nsparam.
     * 
     * @return timezone
     */
    public java.lang.String getTimezone() {
        return timezone;
    }


    /**
     * Sets the timezone value for this Nsparam.
     * 
     * @param timezone
     */
    public void setTimezone(java.lang.String timezone) {
        this.timezone = timezone;
    }


    /**
     * Gets the grantquotamaxclient value for this Nsparam.
     * 
     * @return grantquotamaxclient
     */
    public org.apache.axis.types.UnsignedInt getGrantquotamaxclient() {
        return grantquotamaxclient;
    }


    /**
     * Sets the grantquotamaxclient value for this Nsparam.
     * 
     * @param grantquotamaxclient
     */
    public void setGrantquotamaxclient(org.apache.axis.types.UnsignedInt grantquotamaxclient) {
        this.grantquotamaxclient = grantquotamaxclient;
    }


    /**
     * Gets the exclusivequotamaxclient value for this Nsparam.
     * 
     * @return exclusivequotamaxclient
     */
    public org.apache.axis.types.UnsignedInt getExclusivequotamaxclient() {
        return exclusivequotamaxclient;
    }


    /**
     * Sets the exclusivequotamaxclient value for this Nsparam.
     * 
     * @param exclusivequotamaxclient
     */
    public void setExclusivequotamaxclient(org.apache.axis.types.UnsignedInt exclusivequotamaxclient) {
        this.exclusivequotamaxclient = exclusivequotamaxclient;
    }


    /**
     * Gets the grantquotaspillover value for this Nsparam.
     * 
     * @return grantquotaspillover
     */
    public org.apache.axis.types.UnsignedInt getGrantquotaspillover() {
        return grantquotaspillover;
    }


    /**
     * Sets the grantquotaspillover value for this Nsparam.
     * 
     * @param grantquotaspillover
     */
    public void setGrantquotaspillover(org.apache.axis.types.UnsignedInt grantquotaspillover) {
        this.grantquotaspillover = grantquotaspillover;
    }


    /**
     * Gets the exclusivequotaspillover value for this Nsparam.
     * 
     * @return exclusivequotaspillover
     */
    public org.apache.axis.types.UnsignedInt getExclusivequotaspillover() {
        return exclusivequotaspillover;
    }


    /**
     * Sets the exclusivequotaspillover value for this Nsparam.
     * 
     * @param exclusivequotaspillover
     */
    public void setExclusivequotaspillover(org.apache.axis.types.UnsignedInt exclusivequotaspillover) {
        this.exclusivequotaspillover = exclusivequotaspillover;
    }


    /**
     * Gets the useproxyport value for this Nsparam.
     * 
     * @return useproxyport
     */
    public java.lang.String getUseproxyport() {
        return useproxyport;
    }


    /**
     * Sets the useproxyport value for this Nsparam.
     * 
     * @param useproxyport
     */
    public void setUseproxyport(java.lang.String useproxyport) {
        this.useproxyport = useproxyport;
    }


    /**
     * Gets the internaluserlogin value for this Nsparam.
     * 
     * @return internaluserlogin
     */
    public java.lang.String getInternaluserlogin() {
        return internaluserlogin;
    }


    /**
     * Sets the internaluserlogin value for this Nsparam.
     * 
     * @param internaluserlogin
     */
    public void setInternaluserlogin(java.lang.String internaluserlogin) {
        this.internaluserlogin = internaluserlogin;
    }


    /**
     * Gets the aftpallowrandomsourceport value for this Nsparam.
     * 
     * @return aftpallowrandomsourceport
     */
    public java.lang.String getAftpallowrandomsourceport() {
        return aftpallowrandomsourceport;
    }


    /**
     * Sets the aftpallowrandomsourceport value for this Nsparam.
     * 
     * @param aftpallowrandomsourceport
     */
    public void setAftpallowrandomsourceport(java.lang.String aftpallowrandomsourceport) {
        this.aftpallowrandomsourceport = aftpallowrandomsourceport;
    }


    /**
     * Gets the icaports value for this Nsparam.
     * 
     * @return icaports
     */
    public org.apache.axis.types.UnsignedInt[] getIcaports() {
        return icaports;
    }


    /**
     * Sets the icaports value for this Nsparam.
     * 
     * @param icaports
     */
    public void setIcaports(org.apache.axis.types.UnsignedInt[] icaports) {
        this.icaports = icaports;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nsparam)) return false;
        Nsparam other = (Nsparam) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
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
            ((this.timezone==null && other.getTimezone()==null) || 
             (this.timezone!=null &&
              this.timezone.equals(other.getTimezone()))) &&
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
            ((this.useproxyport==null && other.getUseproxyport()==null) || 
             (this.useproxyport!=null &&
              this.useproxyport.equals(other.getUseproxyport()))) &&
            ((this.internaluserlogin==null && other.getInternaluserlogin()==null) || 
             (this.internaluserlogin!=null &&
              this.internaluserlogin.equals(other.getInternaluserlogin()))) &&
            ((this.aftpallowrandomsourceport==null && other.getAftpallowrandomsourceport()==null) || 
             (this.aftpallowrandomsourceport!=null &&
              this.aftpallowrandomsourceport.equals(other.getAftpallowrandomsourceport()))) &&
            ((this.icaports==null && other.getIcaports()==null) || 
             (this.icaports!=null &&
              java.util.Arrays.equals(this.icaports, other.getIcaports())));
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
        if (getTimezone() != null) {
            _hashCode += getTimezone().hashCode();
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
        if (getUseproxyport() != null) {
            _hashCode += getUseproxyport().hashCode();
        }
        if (getInternaluserlogin() != null) {
            _hashCode += getInternaluserlogin().hashCode();
        }
        if (getAftpallowrandomsourceport() != null) {
            _hashCode += getAftpallowrandomsourceport().hashCode();
        }
        if (getIcaports() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIcaports());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIcaports(), i);
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
        new org.apache.axis.description.TypeDesc(Nsparam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nsparam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("timezone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timezone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("useproxyport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useproxyport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internaluserlogin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internaluserlogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aftpallowrandomsourceport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aftpallowrandomsourceport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icaports");
        elemField.setXmlName(new javax.xml.namespace.QName("", "icaports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
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
