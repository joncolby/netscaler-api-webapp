/**
 * Sslcrl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Sslcrl  implements java.io.Serializable {
    private java.lang.String crlname;

    private java.lang.String crlpath;

    private java.lang.String inform;

    private java.lang.String cacert;

    private java.lang.String refresh;

    private java.lang.String scope;

    private java.lang.String server;

    private org.apache.axis.types.UnsignedInt port;

    private java.lang.String url;

    private java.lang.String method;

    private java.lang.String basedn;

    private java.lang.String interval;

    private int day;

    private java.lang.String time;

    private java.lang.String binddn;

    private java.lang.String password;

    private int flags;

    private int lastupdatetime;

    private int version;

    private java.lang.String signaturealgo;

    private java.lang.String issuer;

    private java.lang.String lastupdate;

    private java.lang.String nextupdate;

    private java.lang.String[] date;

    private java.lang.String[] number;

    private java.lang.String binary;

    private int daystoexpiration;

    public Sslcrl() {
    }

    public Sslcrl(
           java.lang.String crlname,
           java.lang.String crlpath,
           java.lang.String inform,
           java.lang.String cacert,
           java.lang.String refresh,
           java.lang.String scope,
           java.lang.String server,
           org.apache.axis.types.UnsignedInt port,
           java.lang.String url,
           java.lang.String method,
           java.lang.String basedn,
           java.lang.String interval,
           int day,
           java.lang.String time,
           java.lang.String binddn,
           java.lang.String password,
           int flags,
           int lastupdatetime,
           int version,
           java.lang.String signaturealgo,
           java.lang.String issuer,
           java.lang.String lastupdate,
           java.lang.String nextupdate,
           java.lang.String[] date,
           java.lang.String[] number,
           java.lang.String binary,
           int daystoexpiration) {
           this.crlname = crlname;
           this.crlpath = crlpath;
           this.inform = inform;
           this.cacert = cacert;
           this.refresh = refresh;
           this.scope = scope;
           this.server = server;
           this.port = port;
           this.url = url;
           this.method = method;
           this.basedn = basedn;
           this.interval = interval;
           this.day = day;
           this.time = time;
           this.binddn = binddn;
           this.password = password;
           this.flags = flags;
           this.lastupdatetime = lastupdatetime;
           this.version = version;
           this.signaturealgo = signaturealgo;
           this.issuer = issuer;
           this.lastupdate = lastupdate;
           this.nextupdate = nextupdate;
           this.date = date;
           this.number = number;
           this.binary = binary;
           this.daystoexpiration = daystoexpiration;
    }


    /**
     * Gets the crlname value for this Sslcrl.
     * 
     * @return crlname
     */
    public java.lang.String getCrlname() {
        return crlname;
    }


    /**
     * Sets the crlname value for this Sslcrl.
     * 
     * @param crlname
     */
    public void setCrlname(java.lang.String crlname) {
        this.crlname = crlname;
    }


    /**
     * Gets the crlpath value for this Sslcrl.
     * 
     * @return crlpath
     */
    public java.lang.String getCrlpath() {
        return crlpath;
    }


    /**
     * Sets the crlpath value for this Sslcrl.
     * 
     * @param crlpath
     */
    public void setCrlpath(java.lang.String crlpath) {
        this.crlpath = crlpath;
    }


    /**
     * Gets the inform value for this Sslcrl.
     * 
     * @return inform
     */
    public java.lang.String getInform() {
        return inform;
    }


    /**
     * Sets the inform value for this Sslcrl.
     * 
     * @param inform
     */
    public void setInform(java.lang.String inform) {
        this.inform = inform;
    }


    /**
     * Gets the cacert value for this Sslcrl.
     * 
     * @return cacert
     */
    public java.lang.String getCacert() {
        return cacert;
    }


    /**
     * Sets the cacert value for this Sslcrl.
     * 
     * @param cacert
     */
    public void setCacert(java.lang.String cacert) {
        this.cacert = cacert;
    }


    /**
     * Gets the refresh value for this Sslcrl.
     * 
     * @return refresh
     */
    public java.lang.String getRefresh() {
        return refresh;
    }


    /**
     * Sets the refresh value for this Sslcrl.
     * 
     * @param refresh
     */
    public void setRefresh(java.lang.String refresh) {
        this.refresh = refresh;
    }


    /**
     * Gets the scope value for this Sslcrl.
     * 
     * @return scope
     */
    public java.lang.String getScope() {
        return scope;
    }


    /**
     * Sets the scope value for this Sslcrl.
     * 
     * @param scope
     */
    public void setScope(java.lang.String scope) {
        this.scope = scope;
    }


    /**
     * Gets the server value for this Sslcrl.
     * 
     * @return server
     */
    public java.lang.String getServer() {
        return server;
    }


    /**
     * Sets the server value for this Sslcrl.
     * 
     * @param server
     */
    public void setServer(java.lang.String server) {
        this.server = server;
    }


    /**
     * Gets the port value for this Sslcrl.
     * 
     * @return port
     */
    public org.apache.axis.types.UnsignedInt getPort() {
        return port;
    }


    /**
     * Sets the port value for this Sslcrl.
     * 
     * @param port
     */
    public void setPort(org.apache.axis.types.UnsignedInt port) {
        this.port = port;
    }


    /**
     * Gets the url value for this Sslcrl.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Sslcrl.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the method value for this Sslcrl.
     * 
     * @return method
     */
    public java.lang.String getMethod() {
        return method;
    }


    /**
     * Sets the method value for this Sslcrl.
     * 
     * @param method
     */
    public void setMethod(java.lang.String method) {
        this.method = method;
    }


    /**
     * Gets the basedn value for this Sslcrl.
     * 
     * @return basedn
     */
    public java.lang.String getBasedn() {
        return basedn;
    }


    /**
     * Sets the basedn value for this Sslcrl.
     * 
     * @param basedn
     */
    public void setBasedn(java.lang.String basedn) {
        this.basedn = basedn;
    }


    /**
     * Gets the interval value for this Sslcrl.
     * 
     * @return interval
     */
    public java.lang.String getInterval() {
        return interval;
    }


    /**
     * Sets the interval value for this Sslcrl.
     * 
     * @param interval
     */
    public void setInterval(java.lang.String interval) {
        this.interval = interval;
    }


    /**
     * Gets the day value for this Sslcrl.
     * 
     * @return day
     */
    public int getDay() {
        return day;
    }


    /**
     * Sets the day value for this Sslcrl.
     * 
     * @param day
     */
    public void setDay(int day) {
        this.day = day;
    }


    /**
     * Gets the time value for this Sslcrl.
     * 
     * @return time
     */
    public java.lang.String getTime() {
        return time;
    }


    /**
     * Sets the time value for this Sslcrl.
     * 
     * @param time
     */
    public void setTime(java.lang.String time) {
        this.time = time;
    }


    /**
     * Gets the binddn value for this Sslcrl.
     * 
     * @return binddn
     */
    public java.lang.String getBinddn() {
        return binddn;
    }


    /**
     * Sets the binddn value for this Sslcrl.
     * 
     * @param binddn
     */
    public void setBinddn(java.lang.String binddn) {
        this.binddn = binddn;
    }


    /**
     * Gets the password value for this Sslcrl.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this Sslcrl.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the flags value for this Sslcrl.
     * 
     * @return flags
     */
    public int getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this Sslcrl.
     * 
     * @param flags
     */
    public void setFlags(int flags) {
        this.flags = flags;
    }


    /**
     * Gets the lastupdatetime value for this Sslcrl.
     * 
     * @return lastupdatetime
     */
    public int getLastupdatetime() {
        return lastupdatetime;
    }


    /**
     * Sets the lastupdatetime value for this Sslcrl.
     * 
     * @param lastupdatetime
     */
    public void setLastupdatetime(int lastupdatetime) {
        this.lastupdatetime = lastupdatetime;
    }


    /**
     * Gets the version value for this Sslcrl.
     * 
     * @return version
     */
    public int getVersion() {
        return version;
    }


    /**
     * Sets the version value for this Sslcrl.
     * 
     * @param version
     */
    public void setVersion(int version) {
        this.version = version;
    }


    /**
     * Gets the signaturealgo value for this Sslcrl.
     * 
     * @return signaturealgo
     */
    public java.lang.String getSignaturealgo() {
        return signaturealgo;
    }


    /**
     * Sets the signaturealgo value for this Sslcrl.
     * 
     * @param signaturealgo
     */
    public void setSignaturealgo(java.lang.String signaturealgo) {
        this.signaturealgo = signaturealgo;
    }


    /**
     * Gets the issuer value for this Sslcrl.
     * 
     * @return issuer
     */
    public java.lang.String getIssuer() {
        return issuer;
    }


    /**
     * Sets the issuer value for this Sslcrl.
     * 
     * @param issuer
     */
    public void setIssuer(java.lang.String issuer) {
        this.issuer = issuer;
    }


    /**
     * Gets the lastupdate value for this Sslcrl.
     * 
     * @return lastupdate
     */
    public java.lang.String getLastupdate() {
        return lastupdate;
    }


    /**
     * Sets the lastupdate value for this Sslcrl.
     * 
     * @param lastupdate
     */
    public void setLastupdate(java.lang.String lastupdate) {
        this.lastupdate = lastupdate;
    }


    /**
     * Gets the nextupdate value for this Sslcrl.
     * 
     * @return nextupdate
     */
    public java.lang.String getNextupdate() {
        return nextupdate;
    }


    /**
     * Sets the nextupdate value for this Sslcrl.
     * 
     * @param nextupdate
     */
    public void setNextupdate(java.lang.String nextupdate) {
        this.nextupdate = nextupdate;
    }


    /**
     * Gets the date value for this Sslcrl.
     * 
     * @return date
     */
    public java.lang.String[] getDate() {
        return date;
    }


    /**
     * Sets the date value for this Sslcrl.
     * 
     * @param date
     */
    public void setDate(java.lang.String[] date) {
        this.date = date;
    }


    /**
     * Gets the number value for this Sslcrl.
     * 
     * @return number
     */
    public java.lang.String[] getNumber() {
        return number;
    }


    /**
     * Sets the number value for this Sslcrl.
     * 
     * @param number
     */
    public void setNumber(java.lang.String[] number) {
        this.number = number;
    }


    /**
     * Gets the binary value for this Sslcrl.
     * 
     * @return binary
     */
    public java.lang.String getBinary() {
        return binary;
    }


    /**
     * Sets the binary value for this Sslcrl.
     * 
     * @param binary
     */
    public void setBinary(java.lang.String binary) {
        this.binary = binary;
    }


    /**
     * Gets the daystoexpiration value for this Sslcrl.
     * 
     * @return daystoexpiration
     */
    public int getDaystoexpiration() {
        return daystoexpiration;
    }


    /**
     * Sets the daystoexpiration value for this Sslcrl.
     * 
     * @param daystoexpiration
     */
    public void setDaystoexpiration(int daystoexpiration) {
        this.daystoexpiration = daystoexpiration;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sslcrl)) return false;
        Sslcrl other = (Sslcrl) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.crlname==null && other.getCrlname()==null) || 
             (this.crlname!=null &&
              this.crlname.equals(other.getCrlname()))) &&
            ((this.crlpath==null && other.getCrlpath()==null) || 
             (this.crlpath!=null &&
              this.crlpath.equals(other.getCrlpath()))) &&
            ((this.inform==null && other.getInform()==null) || 
             (this.inform!=null &&
              this.inform.equals(other.getInform()))) &&
            ((this.cacert==null && other.getCacert()==null) || 
             (this.cacert!=null &&
              this.cacert.equals(other.getCacert()))) &&
            ((this.refresh==null && other.getRefresh()==null) || 
             (this.refresh!=null &&
              this.refresh.equals(other.getRefresh()))) &&
            ((this.scope==null && other.getScope()==null) || 
             (this.scope!=null &&
              this.scope.equals(other.getScope()))) &&
            ((this.server==null && other.getServer()==null) || 
             (this.server!=null &&
              this.server.equals(other.getServer()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.method==null && other.getMethod()==null) || 
             (this.method!=null &&
              this.method.equals(other.getMethod()))) &&
            ((this.basedn==null && other.getBasedn()==null) || 
             (this.basedn!=null &&
              this.basedn.equals(other.getBasedn()))) &&
            ((this.interval==null && other.getInterval()==null) || 
             (this.interval!=null &&
              this.interval.equals(other.getInterval()))) &&
            this.day == other.getDay() &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            ((this.binddn==null && other.getBinddn()==null) || 
             (this.binddn!=null &&
              this.binddn.equals(other.getBinddn()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            this.flags == other.getFlags() &&
            this.lastupdatetime == other.getLastupdatetime() &&
            this.version == other.getVersion() &&
            ((this.signaturealgo==null && other.getSignaturealgo()==null) || 
             (this.signaturealgo!=null &&
              this.signaturealgo.equals(other.getSignaturealgo()))) &&
            ((this.issuer==null && other.getIssuer()==null) || 
             (this.issuer!=null &&
              this.issuer.equals(other.getIssuer()))) &&
            ((this.lastupdate==null && other.getLastupdate()==null) || 
             (this.lastupdate!=null &&
              this.lastupdate.equals(other.getLastupdate()))) &&
            ((this.nextupdate==null && other.getNextupdate()==null) || 
             (this.nextupdate!=null &&
              this.nextupdate.equals(other.getNextupdate()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              java.util.Arrays.equals(this.date, other.getDate()))) &&
            ((this.number==null && other.getNumber()==null) || 
             (this.number!=null &&
              java.util.Arrays.equals(this.number, other.getNumber()))) &&
            ((this.binary==null && other.getBinary()==null) || 
             (this.binary!=null &&
              this.binary.equals(other.getBinary()))) &&
            this.daystoexpiration == other.getDaystoexpiration();
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
        if (getCrlname() != null) {
            _hashCode += getCrlname().hashCode();
        }
        if (getCrlpath() != null) {
            _hashCode += getCrlpath().hashCode();
        }
        if (getInform() != null) {
            _hashCode += getInform().hashCode();
        }
        if (getCacert() != null) {
            _hashCode += getCacert().hashCode();
        }
        if (getRefresh() != null) {
            _hashCode += getRefresh().hashCode();
        }
        if (getScope() != null) {
            _hashCode += getScope().hashCode();
        }
        if (getServer() != null) {
            _hashCode += getServer().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getMethod() != null) {
            _hashCode += getMethod().hashCode();
        }
        if (getBasedn() != null) {
            _hashCode += getBasedn().hashCode();
        }
        if (getInterval() != null) {
            _hashCode += getInterval().hashCode();
        }
        _hashCode += getDay();
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getBinddn() != null) {
            _hashCode += getBinddn().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        _hashCode += getFlags();
        _hashCode += getLastupdatetime();
        _hashCode += getVersion();
        if (getSignaturealgo() != null) {
            _hashCode += getSignaturealgo().hashCode();
        }
        if (getIssuer() != null) {
            _hashCode += getIssuer().hashCode();
        }
        if (getLastupdate() != null) {
            _hashCode += getLastupdate().hashCode();
        }
        if (getNextupdate() != null) {
            _hashCode += getNextupdate().hashCode();
        }
        if (getDate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNumber() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNumber());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNumber(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBinary() != null) {
            _hashCode += getBinary().hashCode();
        }
        _hashCode += getDaystoexpiration();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sslcrl.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "sslcrl"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crlname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crlname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crlpath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crlpath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inform");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inform"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cacert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refresh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refresh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scope");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scope"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("server");
        elemField.setXmlName(new javax.xml.namespace.QName("", "server"));
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
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("method");
        elemField.setXmlName(new javax.xml.namespace.QName("", "method"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basedn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "basedn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("day");
        elemField.setXmlName(new javax.xml.namespace.QName("", "day"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binddn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "binddn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastupdatetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastupdatetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("version");
        elemField.setXmlName(new javax.xml.namespace.QName("", "version"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("signaturealgo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signaturealgo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "issuer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastupdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastupdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextupdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextupdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("", "number"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("binary");
        elemField.setXmlName(new javax.xml.namespace.QName("", "binary"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daystoexpiration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "daystoexpiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
