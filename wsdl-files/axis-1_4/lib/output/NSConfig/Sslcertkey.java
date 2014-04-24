/**
 * Sslcertkey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Sslcertkey  implements java.io.Serializable {
    private java.lang.String certkeyname;

    private java.lang.String cert;

    private java.lang.String key;

    private java.lang.String inform;

    private java.lang.String signaturealg;

    private java.lang.String serial;

    private java.lang.String issuer;

    private java.lang.String clientcertnotbefore;

    private java.lang.String clientcertnotafter;

    private int daystoexpiration;

    private java.lang.String subject;

    private java.lang.String publickey;

    private int publickeysize;

    private int version;

    private org.apache.axis.types.UnsignedInt priority;

    private java.lang.String status;

    private java.lang.String fipskey;

    private java.lang.String passcrypt;

    private org.apache.axis.types.UnsignedInt data;

    private java.lang.String[] servername;

    private java.lang.String servicename;

    private java.lang.String[] ocspresponder;

    private java.lang.String expirymonitor;

    private org.apache.axis.types.UnsignedInt notificationperiod;

    private java.lang.String linkcertkeyname;

    private org.apache.axis.types.UnsignedInt[] sslvserverpriority;

    private int[] sslvserverversion;

    private java.lang.String[] service;

    private org.apache.axis.types.UnsignedInt[] servicepriority;

    private int[] serviceversion;

    private java.lang.String[] crldistributionpoint;

    private org.apache.axis.types.UnsignedInt[] ocsppriority;

    public Sslcertkey() {
    }

    public Sslcertkey(
           java.lang.String certkeyname,
           java.lang.String cert,
           java.lang.String key,
           java.lang.String inform,
           java.lang.String signaturealg,
           java.lang.String serial,
           java.lang.String issuer,
           java.lang.String clientcertnotbefore,
           java.lang.String clientcertnotafter,
           int daystoexpiration,
           java.lang.String subject,
           java.lang.String publickey,
           int publickeysize,
           int version,
           org.apache.axis.types.UnsignedInt priority,
           java.lang.String status,
           java.lang.String fipskey,
           java.lang.String passcrypt,
           org.apache.axis.types.UnsignedInt data,
           java.lang.String[] servername,
           java.lang.String servicename,
           java.lang.String[] ocspresponder,
           java.lang.String expirymonitor,
           org.apache.axis.types.UnsignedInt notificationperiod,
           java.lang.String linkcertkeyname,
           org.apache.axis.types.UnsignedInt[] sslvserverpriority,
           int[] sslvserverversion,
           java.lang.String[] service,
           org.apache.axis.types.UnsignedInt[] servicepriority,
           int[] serviceversion,
           java.lang.String[] crldistributionpoint,
           org.apache.axis.types.UnsignedInt[] ocsppriority) {
           this.certkeyname = certkeyname;
           this.cert = cert;
           this.key = key;
           this.inform = inform;
           this.signaturealg = signaturealg;
           this.serial = serial;
           this.issuer = issuer;
           this.clientcertnotbefore = clientcertnotbefore;
           this.clientcertnotafter = clientcertnotafter;
           this.daystoexpiration = daystoexpiration;
           this.subject = subject;
           this.publickey = publickey;
           this.publickeysize = publickeysize;
           this.version = version;
           this.priority = priority;
           this.status = status;
           this.fipskey = fipskey;
           this.passcrypt = passcrypt;
           this.data = data;
           this.servername = servername;
           this.servicename = servicename;
           this.ocspresponder = ocspresponder;
           this.expirymonitor = expirymonitor;
           this.notificationperiod = notificationperiod;
           this.linkcertkeyname = linkcertkeyname;
           this.sslvserverpriority = sslvserverpriority;
           this.sslvserverversion = sslvserverversion;
           this.service = service;
           this.servicepriority = servicepriority;
           this.serviceversion = serviceversion;
           this.crldistributionpoint = crldistributionpoint;
           this.ocsppriority = ocsppriority;
    }


    /**
     * Gets the certkeyname value for this Sslcertkey.
     * 
     * @return certkeyname
     */
    public java.lang.String getCertkeyname() {
        return certkeyname;
    }


    /**
     * Sets the certkeyname value for this Sslcertkey.
     * 
     * @param certkeyname
     */
    public void setCertkeyname(java.lang.String certkeyname) {
        this.certkeyname = certkeyname;
    }


    /**
     * Gets the cert value for this Sslcertkey.
     * 
     * @return cert
     */
    public java.lang.String getCert() {
        return cert;
    }


    /**
     * Sets the cert value for this Sslcertkey.
     * 
     * @param cert
     */
    public void setCert(java.lang.String cert) {
        this.cert = cert;
    }


    /**
     * Gets the key value for this Sslcertkey.
     * 
     * @return key
     */
    public java.lang.String getKey() {
        return key;
    }


    /**
     * Sets the key value for this Sslcertkey.
     * 
     * @param key
     */
    public void setKey(java.lang.String key) {
        this.key = key;
    }


    /**
     * Gets the inform value for this Sslcertkey.
     * 
     * @return inform
     */
    public java.lang.String getInform() {
        return inform;
    }


    /**
     * Sets the inform value for this Sslcertkey.
     * 
     * @param inform
     */
    public void setInform(java.lang.String inform) {
        this.inform = inform;
    }


    /**
     * Gets the signaturealg value for this Sslcertkey.
     * 
     * @return signaturealg
     */
    public java.lang.String getSignaturealg() {
        return signaturealg;
    }


    /**
     * Sets the signaturealg value for this Sslcertkey.
     * 
     * @param signaturealg
     */
    public void setSignaturealg(java.lang.String signaturealg) {
        this.signaturealg = signaturealg;
    }


    /**
     * Gets the serial value for this Sslcertkey.
     * 
     * @return serial
     */
    public java.lang.String getSerial() {
        return serial;
    }


    /**
     * Sets the serial value for this Sslcertkey.
     * 
     * @param serial
     */
    public void setSerial(java.lang.String serial) {
        this.serial = serial;
    }


    /**
     * Gets the issuer value for this Sslcertkey.
     * 
     * @return issuer
     */
    public java.lang.String getIssuer() {
        return issuer;
    }


    /**
     * Sets the issuer value for this Sslcertkey.
     * 
     * @param issuer
     */
    public void setIssuer(java.lang.String issuer) {
        this.issuer = issuer;
    }


    /**
     * Gets the clientcertnotbefore value for this Sslcertkey.
     * 
     * @return clientcertnotbefore
     */
    public java.lang.String getClientcertnotbefore() {
        return clientcertnotbefore;
    }


    /**
     * Sets the clientcertnotbefore value for this Sslcertkey.
     * 
     * @param clientcertnotbefore
     */
    public void setClientcertnotbefore(java.lang.String clientcertnotbefore) {
        this.clientcertnotbefore = clientcertnotbefore;
    }


    /**
     * Gets the clientcertnotafter value for this Sslcertkey.
     * 
     * @return clientcertnotafter
     */
    public java.lang.String getClientcertnotafter() {
        return clientcertnotafter;
    }


    /**
     * Sets the clientcertnotafter value for this Sslcertkey.
     * 
     * @param clientcertnotafter
     */
    public void setClientcertnotafter(java.lang.String clientcertnotafter) {
        this.clientcertnotafter = clientcertnotafter;
    }


    /**
     * Gets the daystoexpiration value for this Sslcertkey.
     * 
     * @return daystoexpiration
     */
    public int getDaystoexpiration() {
        return daystoexpiration;
    }


    /**
     * Sets the daystoexpiration value for this Sslcertkey.
     * 
     * @param daystoexpiration
     */
    public void setDaystoexpiration(int daystoexpiration) {
        this.daystoexpiration = daystoexpiration;
    }


    /**
     * Gets the subject value for this Sslcertkey.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this Sslcertkey.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the publickey value for this Sslcertkey.
     * 
     * @return publickey
     */
    public java.lang.String getPublickey() {
        return publickey;
    }


    /**
     * Sets the publickey value for this Sslcertkey.
     * 
     * @param publickey
     */
    public void setPublickey(java.lang.String publickey) {
        this.publickey = publickey;
    }


    /**
     * Gets the publickeysize value for this Sslcertkey.
     * 
     * @return publickeysize
     */
    public int getPublickeysize() {
        return publickeysize;
    }


    /**
     * Sets the publickeysize value for this Sslcertkey.
     * 
     * @param publickeysize
     */
    public void setPublickeysize(int publickeysize) {
        this.publickeysize = publickeysize;
    }


    /**
     * Gets the version value for this Sslcertkey.
     * 
     * @return version
     */
    public int getVersion() {
        return version;
    }


    /**
     * Sets the version value for this Sslcertkey.
     * 
     * @param version
     */
    public void setVersion(int version) {
        this.version = version;
    }


    /**
     * Gets the priority value for this Sslcertkey.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Sslcertkey.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the status value for this Sslcertkey.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Sslcertkey.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the fipskey value for this Sslcertkey.
     * 
     * @return fipskey
     */
    public java.lang.String getFipskey() {
        return fipskey;
    }


    /**
     * Sets the fipskey value for this Sslcertkey.
     * 
     * @param fipskey
     */
    public void setFipskey(java.lang.String fipskey) {
        this.fipskey = fipskey;
    }


    /**
     * Gets the passcrypt value for this Sslcertkey.
     * 
     * @return passcrypt
     */
    public java.lang.String getPasscrypt() {
        return passcrypt;
    }


    /**
     * Sets the passcrypt value for this Sslcertkey.
     * 
     * @param passcrypt
     */
    public void setPasscrypt(java.lang.String passcrypt) {
        this.passcrypt = passcrypt;
    }


    /**
     * Gets the data value for this Sslcertkey.
     * 
     * @return data
     */
    public org.apache.axis.types.UnsignedInt getData() {
        return data;
    }


    /**
     * Sets the data value for this Sslcertkey.
     * 
     * @param data
     */
    public void setData(org.apache.axis.types.UnsignedInt data) {
        this.data = data;
    }


    /**
     * Gets the servername value for this Sslcertkey.
     * 
     * @return servername
     */
    public java.lang.String[] getServername() {
        return servername;
    }


    /**
     * Sets the servername value for this Sslcertkey.
     * 
     * @param servername
     */
    public void setServername(java.lang.String[] servername) {
        this.servername = servername;
    }


    /**
     * Gets the servicename value for this Sslcertkey.
     * 
     * @return servicename
     */
    public java.lang.String getServicename() {
        return servicename;
    }


    /**
     * Sets the servicename value for this Sslcertkey.
     * 
     * @param servicename
     */
    public void setServicename(java.lang.String servicename) {
        this.servicename = servicename;
    }


    /**
     * Gets the ocspresponder value for this Sslcertkey.
     * 
     * @return ocspresponder
     */
    public java.lang.String[] getOcspresponder() {
        return ocspresponder;
    }


    /**
     * Sets the ocspresponder value for this Sslcertkey.
     * 
     * @param ocspresponder
     */
    public void setOcspresponder(java.lang.String[] ocspresponder) {
        this.ocspresponder = ocspresponder;
    }


    /**
     * Gets the expirymonitor value for this Sslcertkey.
     * 
     * @return expirymonitor
     */
    public java.lang.String getExpirymonitor() {
        return expirymonitor;
    }


    /**
     * Sets the expirymonitor value for this Sslcertkey.
     * 
     * @param expirymonitor
     */
    public void setExpirymonitor(java.lang.String expirymonitor) {
        this.expirymonitor = expirymonitor;
    }


    /**
     * Gets the notificationperiod value for this Sslcertkey.
     * 
     * @return notificationperiod
     */
    public org.apache.axis.types.UnsignedInt getNotificationperiod() {
        return notificationperiod;
    }


    /**
     * Sets the notificationperiod value for this Sslcertkey.
     * 
     * @param notificationperiod
     */
    public void setNotificationperiod(org.apache.axis.types.UnsignedInt notificationperiod) {
        this.notificationperiod = notificationperiod;
    }


    /**
     * Gets the linkcertkeyname value for this Sslcertkey.
     * 
     * @return linkcertkeyname
     */
    public java.lang.String getLinkcertkeyname() {
        return linkcertkeyname;
    }


    /**
     * Sets the linkcertkeyname value for this Sslcertkey.
     * 
     * @param linkcertkeyname
     */
    public void setLinkcertkeyname(java.lang.String linkcertkeyname) {
        this.linkcertkeyname = linkcertkeyname;
    }


    /**
     * Gets the sslvserverpriority value for this Sslcertkey.
     * 
     * @return sslvserverpriority
     */
    public org.apache.axis.types.UnsignedInt[] getSslvserverpriority() {
        return sslvserverpriority;
    }


    /**
     * Sets the sslvserverpriority value for this Sslcertkey.
     * 
     * @param sslvserverpriority
     */
    public void setSslvserverpriority(org.apache.axis.types.UnsignedInt[] sslvserverpriority) {
        this.sslvserverpriority = sslvserverpriority;
    }


    /**
     * Gets the sslvserverversion value for this Sslcertkey.
     * 
     * @return sslvserverversion
     */
    public int[] getSslvserverversion() {
        return sslvserverversion;
    }


    /**
     * Sets the sslvserverversion value for this Sslcertkey.
     * 
     * @param sslvserverversion
     */
    public void setSslvserverversion(int[] sslvserverversion) {
        this.sslvserverversion = sslvserverversion;
    }


    /**
     * Gets the service value for this Sslcertkey.
     * 
     * @return service
     */
    public java.lang.String[] getService() {
        return service;
    }


    /**
     * Sets the service value for this Sslcertkey.
     * 
     * @param service
     */
    public void setService(java.lang.String[] service) {
        this.service = service;
    }


    /**
     * Gets the servicepriority value for this Sslcertkey.
     * 
     * @return servicepriority
     */
    public org.apache.axis.types.UnsignedInt[] getServicepriority() {
        return servicepriority;
    }


    /**
     * Sets the servicepriority value for this Sslcertkey.
     * 
     * @param servicepriority
     */
    public void setServicepriority(org.apache.axis.types.UnsignedInt[] servicepriority) {
        this.servicepriority = servicepriority;
    }


    /**
     * Gets the serviceversion value for this Sslcertkey.
     * 
     * @return serviceversion
     */
    public int[] getServiceversion() {
        return serviceversion;
    }


    /**
     * Sets the serviceversion value for this Sslcertkey.
     * 
     * @param serviceversion
     */
    public void setServiceversion(int[] serviceversion) {
        this.serviceversion = serviceversion;
    }


    /**
     * Gets the crldistributionpoint value for this Sslcertkey.
     * 
     * @return crldistributionpoint
     */
    public java.lang.String[] getCrldistributionpoint() {
        return crldistributionpoint;
    }


    /**
     * Sets the crldistributionpoint value for this Sslcertkey.
     * 
     * @param crldistributionpoint
     */
    public void setCrldistributionpoint(java.lang.String[] crldistributionpoint) {
        this.crldistributionpoint = crldistributionpoint;
    }


    /**
     * Gets the ocsppriority value for this Sslcertkey.
     * 
     * @return ocsppriority
     */
    public org.apache.axis.types.UnsignedInt[] getOcsppriority() {
        return ocsppriority;
    }


    /**
     * Sets the ocsppriority value for this Sslcertkey.
     * 
     * @param ocsppriority
     */
    public void setOcsppriority(org.apache.axis.types.UnsignedInt[] ocsppriority) {
        this.ocsppriority = ocsppriority;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sslcertkey)) return false;
        Sslcertkey other = (Sslcertkey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.certkeyname==null && other.getCertkeyname()==null) || 
             (this.certkeyname!=null &&
              this.certkeyname.equals(other.getCertkeyname()))) &&
            ((this.cert==null && other.getCert()==null) || 
             (this.cert!=null &&
              this.cert.equals(other.getCert()))) &&
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
            ((this.inform==null && other.getInform()==null) || 
             (this.inform!=null &&
              this.inform.equals(other.getInform()))) &&
            ((this.signaturealg==null && other.getSignaturealg()==null) || 
             (this.signaturealg!=null &&
              this.signaturealg.equals(other.getSignaturealg()))) &&
            ((this.serial==null && other.getSerial()==null) || 
             (this.serial!=null &&
              this.serial.equals(other.getSerial()))) &&
            ((this.issuer==null && other.getIssuer()==null) || 
             (this.issuer!=null &&
              this.issuer.equals(other.getIssuer()))) &&
            ((this.clientcertnotbefore==null && other.getClientcertnotbefore()==null) || 
             (this.clientcertnotbefore!=null &&
              this.clientcertnotbefore.equals(other.getClientcertnotbefore()))) &&
            ((this.clientcertnotafter==null && other.getClientcertnotafter()==null) || 
             (this.clientcertnotafter!=null &&
              this.clientcertnotafter.equals(other.getClientcertnotafter()))) &&
            this.daystoexpiration == other.getDaystoexpiration() &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.publickey==null && other.getPublickey()==null) || 
             (this.publickey!=null &&
              this.publickey.equals(other.getPublickey()))) &&
            this.publickeysize == other.getPublickeysize() &&
            this.version == other.getVersion() &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.fipskey==null && other.getFipskey()==null) || 
             (this.fipskey!=null &&
              this.fipskey.equals(other.getFipskey()))) &&
            ((this.passcrypt==null && other.getPasscrypt()==null) || 
             (this.passcrypt!=null &&
              this.passcrypt.equals(other.getPasscrypt()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.servername==null && other.getServername()==null) || 
             (this.servername!=null &&
              java.util.Arrays.equals(this.servername, other.getServername()))) &&
            ((this.servicename==null && other.getServicename()==null) || 
             (this.servicename!=null &&
              this.servicename.equals(other.getServicename()))) &&
            ((this.ocspresponder==null && other.getOcspresponder()==null) || 
             (this.ocspresponder!=null &&
              java.util.Arrays.equals(this.ocspresponder, other.getOcspresponder()))) &&
            ((this.expirymonitor==null && other.getExpirymonitor()==null) || 
             (this.expirymonitor!=null &&
              this.expirymonitor.equals(other.getExpirymonitor()))) &&
            ((this.notificationperiod==null && other.getNotificationperiod()==null) || 
             (this.notificationperiod!=null &&
              this.notificationperiod.equals(other.getNotificationperiod()))) &&
            ((this.linkcertkeyname==null && other.getLinkcertkeyname()==null) || 
             (this.linkcertkeyname!=null &&
              this.linkcertkeyname.equals(other.getLinkcertkeyname()))) &&
            ((this.sslvserverpriority==null && other.getSslvserverpriority()==null) || 
             (this.sslvserverpriority!=null &&
              java.util.Arrays.equals(this.sslvserverpriority, other.getSslvserverpriority()))) &&
            ((this.sslvserverversion==null && other.getSslvserverversion()==null) || 
             (this.sslvserverversion!=null &&
              java.util.Arrays.equals(this.sslvserverversion, other.getSslvserverversion()))) &&
            ((this.service==null && other.getService()==null) || 
             (this.service!=null &&
              java.util.Arrays.equals(this.service, other.getService()))) &&
            ((this.servicepriority==null && other.getServicepriority()==null) || 
             (this.servicepriority!=null &&
              java.util.Arrays.equals(this.servicepriority, other.getServicepriority()))) &&
            ((this.serviceversion==null && other.getServiceversion()==null) || 
             (this.serviceversion!=null &&
              java.util.Arrays.equals(this.serviceversion, other.getServiceversion()))) &&
            ((this.crldistributionpoint==null && other.getCrldistributionpoint()==null) || 
             (this.crldistributionpoint!=null &&
              java.util.Arrays.equals(this.crldistributionpoint, other.getCrldistributionpoint()))) &&
            ((this.ocsppriority==null && other.getOcsppriority()==null) || 
             (this.ocsppriority!=null &&
              java.util.Arrays.equals(this.ocsppriority, other.getOcsppriority())));
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
        if (getCertkeyname() != null) {
            _hashCode += getCertkeyname().hashCode();
        }
        if (getCert() != null) {
            _hashCode += getCert().hashCode();
        }
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getInform() != null) {
            _hashCode += getInform().hashCode();
        }
        if (getSignaturealg() != null) {
            _hashCode += getSignaturealg().hashCode();
        }
        if (getSerial() != null) {
            _hashCode += getSerial().hashCode();
        }
        if (getIssuer() != null) {
            _hashCode += getIssuer().hashCode();
        }
        if (getClientcertnotbefore() != null) {
            _hashCode += getClientcertnotbefore().hashCode();
        }
        if (getClientcertnotafter() != null) {
            _hashCode += getClientcertnotafter().hashCode();
        }
        _hashCode += getDaystoexpiration();
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getPublickey() != null) {
            _hashCode += getPublickey().hashCode();
        }
        _hashCode += getPublickeysize();
        _hashCode += getVersion();
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getFipskey() != null) {
            _hashCode += getFipskey().hashCode();
        }
        if (getPasscrypt() != null) {
            _hashCode += getPasscrypt().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getServername() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServername());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServername(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServicename() != null) {
            _hashCode += getServicename().hashCode();
        }
        if (getOcspresponder() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOcspresponder());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOcspresponder(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExpirymonitor() != null) {
            _hashCode += getExpirymonitor().hashCode();
        }
        if (getNotificationperiod() != null) {
            _hashCode += getNotificationperiod().hashCode();
        }
        if (getLinkcertkeyname() != null) {
            _hashCode += getLinkcertkeyname().hashCode();
        }
        if (getSslvserverpriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSslvserverpriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSslvserverpriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSslvserverversion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSslvserverversion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSslvserverversion(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getService() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getService());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getService(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServicepriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicepriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicepriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServiceversion() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceversion());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceversion(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCrldistributionpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCrldistributionpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCrldistributionpoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOcsppriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOcsppriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOcsppriority(), i);
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
        new org.apache.axis.description.TypeDesc(Sslcertkey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "sslcertkey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certkeyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certkeyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("", "key"));
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
        elemField.setFieldName("signaturealg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "signaturealg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serial"));
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
        elemField.setFieldName("clientcertnotbefore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientcertnotbefore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientcertnotafter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientcertnotafter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("daystoexpiration");
        elemField.setXmlName(new javax.xml.namespace.QName("", "daystoexpiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publickey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publickey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publickeysize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "publickeysize"));
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
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fipskey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fipskey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passcrypt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passcrypt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servername"));
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
        elemField.setFieldName("ocspresponder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ocspresponder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirymonitor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expirymonitor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationperiod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "notificationperiod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkcertkeyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkcertkeyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslvserverpriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sslvserverpriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslvserverversion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sslvserverversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("service");
        elemField.setXmlName(new javax.xml.namespace.QName("", "service"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicepriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicepriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceversion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceversion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crldistributionpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crldistributionpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ocsppriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ocsppriority"));
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
