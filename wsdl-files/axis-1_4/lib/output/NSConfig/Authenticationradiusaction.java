/**
 * Authenticationradiusaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Authenticationradiusaction  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String serverip;

    private org.apache.axis.types.UnsignedInt serverport;

    private org.apache.axis.types.UnsignedInt authtimeout;

    private java.lang.String radkey;

    private java.lang.String radnasip;

    private java.lang.String ipaddress;

    private java.lang.String radnasid;

    private org.apache.axis.types.UnsignedInt radvendorid;

    private org.apache.axis.types.UnsignedInt radattributetype;

    private java.lang.String radgroupsprefix;

    private java.lang.String radgroupseparator;

    private java.lang.String passencoding;

    private org.apache.axis.types.UnsignedInt ipvendorid;

    private org.apache.axis.types.UnsignedInt ipattributetype;

    private java.lang.String accounting;

    private org.apache.axis.types.UnsignedLong success;

    private org.apache.axis.types.UnsignedLong failure;

    private org.apache.axis.types.UnsignedInt pwdvendorid;

    private org.apache.axis.types.UnsignedInt pwdattributetype;

    private java.lang.String defaultauthenticationgroup;

    private java.lang.String callingstationid;

    public Authenticationradiusaction() {
    }

    public Authenticationradiusaction(
           java.lang.String name,
           java.lang.String serverip,
           org.apache.axis.types.UnsignedInt serverport,
           org.apache.axis.types.UnsignedInt authtimeout,
           java.lang.String radkey,
           java.lang.String radnasip,
           java.lang.String ipaddress,
           java.lang.String radnasid,
           org.apache.axis.types.UnsignedInt radvendorid,
           org.apache.axis.types.UnsignedInt radattributetype,
           java.lang.String radgroupsprefix,
           java.lang.String radgroupseparator,
           java.lang.String passencoding,
           org.apache.axis.types.UnsignedInt ipvendorid,
           org.apache.axis.types.UnsignedInt ipattributetype,
           java.lang.String accounting,
           org.apache.axis.types.UnsignedLong success,
           org.apache.axis.types.UnsignedLong failure,
           org.apache.axis.types.UnsignedInt pwdvendorid,
           org.apache.axis.types.UnsignedInt pwdattributetype,
           java.lang.String defaultauthenticationgroup,
           java.lang.String callingstationid) {
           this.name = name;
           this.serverip = serverip;
           this.serverport = serverport;
           this.authtimeout = authtimeout;
           this.radkey = radkey;
           this.radnasip = radnasip;
           this.ipaddress = ipaddress;
           this.radnasid = radnasid;
           this.radvendorid = radvendorid;
           this.radattributetype = radattributetype;
           this.radgroupsprefix = radgroupsprefix;
           this.radgroupseparator = radgroupseparator;
           this.passencoding = passencoding;
           this.ipvendorid = ipvendorid;
           this.ipattributetype = ipattributetype;
           this.accounting = accounting;
           this.success = success;
           this.failure = failure;
           this.pwdvendorid = pwdvendorid;
           this.pwdattributetype = pwdattributetype;
           this.defaultauthenticationgroup = defaultauthenticationgroup;
           this.callingstationid = callingstationid;
    }


    /**
     * Gets the name value for this Authenticationradiusaction.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Authenticationradiusaction.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the serverip value for this Authenticationradiusaction.
     * 
     * @return serverip
     */
    public java.lang.String getServerip() {
        return serverip;
    }


    /**
     * Sets the serverip value for this Authenticationradiusaction.
     * 
     * @param serverip
     */
    public void setServerip(java.lang.String serverip) {
        this.serverip = serverip;
    }


    /**
     * Gets the serverport value for this Authenticationradiusaction.
     * 
     * @return serverport
     */
    public org.apache.axis.types.UnsignedInt getServerport() {
        return serverport;
    }


    /**
     * Sets the serverport value for this Authenticationradiusaction.
     * 
     * @param serverport
     */
    public void setServerport(org.apache.axis.types.UnsignedInt serverport) {
        this.serverport = serverport;
    }


    /**
     * Gets the authtimeout value for this Authenticationradiusaction.
     * 
     * @return authtimeout
     */
    public org.apache.axis.types.UnsignedInt getAuthtimeout() {
        return authtimeout;
    }


    /**
     * Sets the authtimeout value for this Authenticationradiusaction.
     * 
     * @param authtimeout
     */
    public void setAuthtimeout(org.apache.axis.types.UnsignedInt authtimeout) {
        this.authtimeout = authtimeout;
    }


    /**
     * Gets the radkey value for this Authenticationradiusaction.
     * 
     * @return radkey
     */
    public java.lang.String getRadkey() {
        return radkey;
    }


    /**
     * Sets the radkey value for this Authenticationradiusaction.
     * 
     * @param radkey
     */
    public void setRadkey(java.lang.String radkey) {
        this.radkey = radkey;
    }


    /**
     * Gets the radnasip value for this Authenticationradiusaction.
     * 
     * @return radnasip
     */
    public java.lang.String getRadnasip() {
        return radnasip;
    }


    /**
     * Sets the radnasip value for this Authenticationradiusaction.
     * 
     * @param radnasip
     */
    public void setRadnasip(java.lang.String radnasip) {
        this.radnasip = radnasip;
    }


    /**
     * Gets the ipaddress value for this Authenticationradiusaction.
     * 
     * @return ipaddress
     */
    public java.lang.String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Authenticationradiusaction.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the radnasid value for this Authenticationradiusaction.
     * 
     * @return radnasid
     */
    public java.lang.String getRadnasid() {
        return radnasid;
    }


    /**
     * Sets the radnasid value for this Authenticationradiusaction.
     * 
     * @param radnasid
     */
    public void setRadnasid(java.lang.String radnasid) {
        this.radnasid = radnasid;
    }


    /**
     * Gets the radvendorid value for this Authenticationradiusaction.
     * 
     * @return radvendorid
     */
    public org.apache.axis.types.UnsignedInt getRadvendorid() {
        return radvendorid;
    }


    /**
     * Sets the radvendorid value for this Authenticationradiusaction.
     * 
     * @param radvendorid
     */
    public void setRadvendorid(org.apache.axis.types.UnsignedInt radvendorid) {
        this.radvendorid = radvendorid;
    }


    /**
     * Gets the radattributetype value for this Authenticationradiusaction.
     * 
     * @return radattributetype
     */
    public org.apache.axis.types.UnsignedInt getRadattributetype() {
        return radattributetype;
    }


    /**
     * Sets the radattributetype value for this Authenticationradiusaction.
     * 
     * @param radattributetype
     */
    public void setRadattributetype(org.apache.axis.types.UnsignedInt radattributetype) {
        this.radattributetype = radattributetype;
    }


    /**
     * Gets the radgroupsprefix value for this Authenticationradiusaction.
     * 
     * @return radgroupsprefix
     */
    public java.lang.String getRadgroupsprefix() {
        return radgroupsprefix;
    }


    /**
     * Sets the radgroupsprefix value for this Authenticationradiusaction.
     * 
     * @param radgroupsprefix
     */
    public void setRadgroupsprefix(java.lang.String radgroupsprefix) {
        this.radgroupsprefix = radgroupsprefix;
    }


    /**
     * Gets the radgroupseparator value for this Authenticationradiusaction.
     * 
     * @return radgroupseparator
     */
    public java.lang.String getRadgroupseparator() {
        return radgroupseparator;
    }


    /**
     * Sets the radgroupseparator value for this Authenticationradiusaction.
     * 
     * @param radgroupseparator
     */
    public void setRadgroupseparator(java.lang.String radgroupseparator) {
        this.radgroupseparator = radgroupseparator;
    }


    /**
     * Gets the passencoding value for this Authenticationradiusaction.
     * 
     * @return passencoding
     */
    public java.lang.String getPassencoding() {
        return passencoding;
    }


    /**
     * Sets the passencoding value for this Authenticationradiusaction.
     * 
     * @param passencoding
     */
    public void setPassencoding(java.lang.String passencoding) {
        this.passencoding = passencoding;
    }


    /**
     * Gets the ipvendorid value for this Authenticationradiusaction.
     * 
     * @return ipvendorid
     */
    public org.apache.axis.types.UnsignedInt getIpvendorid() {
        return ipvendorid;
    }


    /**
     * Sets the ipvendorid value for this Authenticationradiusaction.
     * 
     * @param ipvendorid
     */
    public void setIpvendorid(org.apache.axis.types.UnsignedInt ipvendorid) {
        this.ipvendorid = ipvendorid;
    }


    /**
     * Gets the ipattributetype value for this Authenticationradiusaction.
     * 
     * @return ipattributetype
     */
    public org.apache.axis.types.UnsignedInt getIpattributetype() {
        return ipattributetype;
    }


    /**
     * Sets the ipattributetype value for this Authenticationradiusaction.
     * 
     * @param ipattributetype
     */
    public void setIpattributetype(org.apache.axis.types.UnsignedInt ipattributetype) {
        this.ipattributetype = ipattributetype;
    }


    /**
     * Gets the accounting value for this Authenticationradiusaction.
     * 
     * @return accounting
     */
    public java.lang.String getAccounting() {
        return accounting;
    }


    /**
     * Sets the accounting value for this Authenticationradiusaction.
     * 
     * @param accounting
     */
    public void setAccounting(java.lang.String accounting) {
        this.accounting = accounting;
    }


    /**
     * Gets the success value for this Authenticationradiusaction.
     * 
     * @return success
     */
    public org.apache.axis.types.UnsignedLong getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this Authenticationradiusaction.
     * 
     * @param success
     */
    public void setSuccess(org.apache.axis.types.UnsignedLong success) {
        this.success = success;
    }


    /**
     * Gets the failure value for this Authenticationradiusaction.
     * 
     * @return failure
     */
    public org.apache.axis.types.UnsignedLong getFailure() {
        return failure;
    }


    /**
     * Sets the failure value for this Authenticationradiusaction.
     * 
     * @param failure
     */
    public void setFailure(org.apache.axis.types.UnsignedLong failure) {
        this.failure = failure;
    }


    /**
     * Gets the pwdvendorid value for this Authenticationradiusaction.
     * 
     * @return pwdvendorid
     */
    public org.apache.axis.types.UnsignedInt getPwdvendorid() {
        return pwdvendorid;
    }


    /**
     * Sets the pwdvendorid value for this Authenticationradiusaction.
     * 
     * @param pwdvendorid
     */
    public void setPwdvendorid(org.apache.axis.types.UnsignedInt pwdvendorid) {
        this.pwdvendorid = pwdvendorid;
    }


    /**
     * Gets the pwdattributetype value for this Authenticationradiusaction.
     * 
     * @return pwdattributetype
     */
    public org.apache.axis.types.UnsignedInt getPwdattributetype() {
        return pwdattributetype;
    }


    /**
     * Sets the pwdattributetype value for this Authenticationradiusaction.
     * 
     * @param pwdattributetype
     */
    public void setPwdattributetype(org.apache.axis.types.UnsignedInt pwdattributetype) {
        this.pwdattributetype = pwdattributetype;
    }


    /**
     * Gets the defaultauthenticationgroup value for this Authenticationradiusaction.
     * 
     * @return defaultauthenticationgroup
     */
    public java.lang.String getDefaultauthenticationgroup() {
        return defaultauthenticationgroup;
    }


    /**
     * Sets the defaultauthenticationgroup value for this Authenticationradiusaction.
     * 
     * @param defaultauthenticationgroup
     */
    public void setDefaultauthenticationgroup(java.lang.String defaultauthenticationgroup) {
        this.defaultauthenticationgroup = defaultauthenticationgroup;
    }


    /**
     * Gets the callingstationid value for this Authenticationradiusaction.
     * 
     * @return callingstationid
     */
    public java.lang.String getCallingstationid() {
        return callingstationid;
    }


    /**
     * Sets the callingstationid value for this Authenticationradiusaction.
     * 
     * @param callingstationid
     */
    public void setCallingstationid(java.lang.String callingstationid) {
        this.callingstationid = callingstationid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Authenticationradiusaction)) return false;
        Authenticationradiusaction other = (Authenticationradiusaction) obj;
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
            ((this.serverip==null && other.getServerip()==null) || 
             (this.serverip!=null &&
              this.serverip.equals(other.getServerip()))) &&
            ((this.serverport==null && other.getServerport()==null) || 
             (this.serverport!=null &&
              this.serverport.equals(other.getServerport()))) &&
            ((this.authtimeout==null && other.getAuthtimeout()==null) || 
             (this.authtimeout!=null &&
              this.authtimeout.equals(other.getAuthtimeout()))) &&
            ((this.radkey==null && other.getRadkey()==null) || 
             (this.radkey!=null &&
              this.radkey.equals(other.getRadkey()))) &&
            ((this.radnasip==null && other.getRadnasip()==null) || 
             (this.radnasip!=null &&
              this.radnasip.equals(other.getRadnasip()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              this.ipaddress.equals(other.getIpaddress()))) &&
            ((this.radnasid==null && other.getRadnasid()==null) || 
             (this.radnasid!=null &&
              this.radnasid.equals(other.getRadnasid()))) &&
            ((this.radvendorid==null && other.getRadvendorid()==null) || 
             (this.radvendorid!=null &&
              this.radvendorid.equals(other.getRadvendorid()))) &&
            ((this.radattributetype==null && other.getRadattributetype()==null) || 
             (this.radattributetype!=null &&
              this.radattributetype.equals(other.getRadattributetype()))) &&
            ((this.radgroupsprefix==null && other.getRadgroupsprefix()==null) || 
             (this.radgroupsprefix!=null &&
              this.radgroupsprefix.equals(other.getRadgroupsprefix()))) &&
            ((this.radgroupseparator==null && other.getRadgroupseparator()==null) || 
             (this.radgroupseparator!=null &&
              this.radgroupseparator.equals(other.getRadgroupseparator()))) &&
            ((this.passencoding==null && other.getPassencoding()==null) || 
             (this.passencoding!=null &&
              this.passencoding.equals(other.getPassencoding()))) &&
            ((this.ipvendorid==null && other.getIpvendorid()==null) || 
             (this.ipvendorid!=null &&
              this.ipvendorid.equals(other.getIpvendorid()))) &&
            ((this.ipattributetype==null && other.getIpattributetype()==null) || 
             (this.ipattributetype!=null &&
              this.ipattributetype.equals(other.getIpattributetype()))) &&
            ((this.accounting==null && other.getAccounting()==null) || 
             (this.accounting!=null &&
              this.accounting.equals(other.getAccounting()))) &&
            ((this.success==null && other.getSuccess()==null) || 
             (this.success!=null &&
              this.success.equals(other.getSuccess()))) &&
            ((this.failure==null && other.getFailure()==null) || 
             (this.failure!=null &&
              this.failure.equals(other.getFailure()))) &&
            ((this.pwdvendorid==null && other.getPwdvendorid()==null) || 
             (this.pwdvendorid!=null &&
              this.pwdvendorid.equals(other.getPwdvendorid()))) &&
            ((this.pwdattributetype==null && other.getPwdattributetype()==null) || 
             (this.pwdattributetype!=null &&
              this.pwdattributetype.equals(other.getPwdattributetype()))) &&
            ((this.defaultauthenticationgroup==null && other.getDefaultauthenticationgroup()==null) || 
             (this.defaultauthenticationgroup!=null &&
              this.defaultauthenticationgroup.equals(other.getDefaultauthenticationgroup()))) &&
            ((this.callingstationid==null && other.getCallingstationid()==null) || 
             (this.callingstationid!=null &&
              this.callingstationid.equals(other.getCallingstationid())));
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
        if (getServerip() != null) {
            _hashCode += getServerip().hashCode();
        }
        if (getServerport() != null) {
            _hashCode += getServerport().hashCode();
        }
        if (getAuthtimeout() != null) {
            _hashCode += getAuthtimeout().hashCode();
        }
        if (getRadkey() != null) {
            _hashCode += getRadkey().hashCode();
        }
        if (getRadnasip() != null) {
            _hashCode += getRadnasip().hashCode();
        }
        if (getIpaddress() != null) {
            _hashCode += getIpaddress().hashCode();
        }
        if (getRadnasid() != null) {
            _hashCode += getRadnasid().hashCode();
        }
        if (getRadvendorid() != null) {
            _hashCode += getRadvendorid().hashCode();
        }
        if (getRadattributetype() != null) {
            _hashCode += getRadattributetype().hashCode();
        }
        if (getRadgroupsprefix() != null) {
            _hashCode += getRadgroupsprefix().hashCode();
        }
        if (getRadgroupseparator() != null) {
            _hashCode += getRadgroupseparator().hashCode();
        }
        if (getPassencoding() != null) {
            _hashCode += getPassencoding().hashCode();
        }
        if (getIpvendorid() != null) {
            _hashCode += getIpvendorid().hashCode();
        }
        if (getIpattributetype() != null) {
            _hashCode += getIpattributetype().hashCode();
        }
        if (getAccounting() != null) {
            _hashCode += getAccounting().hashCode();
        }
        if (getSuccess() != null) {
            _hashCode += getSuccess().hashCode();
        }
        if (getFailure() != null) {
            _hashCode += getFailure().hashCode();
        }
        if (getPwdvendorid() != null) {
            _hashCode += getPwdvendorid().hashCode();
        }
        if (getPwdattributetype() != null) {
            _hashCode += getPwdattributetype().hashCode();
        }
        if (getDefaultauthenticationgroup() != null) {
            _hashCode += getDefaultauthenticationgroup().hashCode();
        }
        if (getCallingstationid() != null) {
            _hashCode += getCallingstationid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Authenticationradiusaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "authenticationradiusaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("authtimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authtimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radkey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radkey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radnasip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radnasip"));
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
        elemField.setFieldName("radnasid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radnasid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radvendorid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radvendorid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radattributetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radattributetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radgroupsprefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radgroupsprefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radgroupseparator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radgroupseparator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passencoding");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passencoding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipvendorid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipvendorid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipattributetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipattributetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accounting");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accounting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("", "success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "failure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdvendorid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwdvendorid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pwdattributetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pwdattributetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultauthenticationgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultauthenticationgroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingstationid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "callingstationid"));
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
