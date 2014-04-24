/**
 * Aaaldapparams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Aaaldapparams  implements java.io.Serializable {
    private java.lang.String serverip;

    private org.apache.axis.types.UnsignedInt serverport;

    private org.apache.axis.types.UnsignedInt authtimeout;

    private java.lang.String ldapbinddn;

    private java.lang.String ldaploginname;

    private java.lang.String ldapbase;

    private java.lang.String sectype;

    private java.lang.String svrtype;

    private java.lang.String ssonameattribute;

    private java.lang.String searchfilter;

    private java.lang.String groupattrname;

    private java.lang.String subattributename;

    private java.lang.String groupauthname;

    private java.lang.String passwdchange;

    private java.lang.String nestedgroupextraction;

    private org.apache.axis.types.UnsignedInt maxnestinglevel;

    private java.lang.String groupnameidentifier;

    private java.lang.String groupsearchattribute;

    private java.lang.String groupsearchsubattribute;

    private java.lang.String groupsearchfilter;

    private java.lang.String defaultauthenticationgroup;

    public Aaaldapparams() {
    }

    public Aaaldapparams(
           java.lang.String serverip,
           org.apache.axis.types.UnsignedInt serverport,
           org.apache.axis.types.UnsignedInt authtimeout,
           java.lang.String ldapbinddn,
           java.lang.String ldaploginname,
           java.lang.String ldapbase,
           java.lang.String sectype,
           java.lang.String svrtype,
           java.lang.String ssonameattribute,
           java.lang.String searchfilter,
           java.lang.String groupattrname,
           java.lang.String subattributename,
           java.lang.String groupauthname,
           java.lang.String passwdchange,
           java.lang.String nestedgroupextraction,
           org.apache.axis.types.UnsignedInt maxnestinglevel,
           java.lang.String groupnameidentifier,
           java.lang.String groupsearchattribute,
           java.lang.String groupsearchsubattribute,
           java.lang.String groupsearchfilter,
           java.lang.String defaultauthenticationgroup) {
           this.serverip = serverip;
           this.serverport = serverport;
           this.authtimeout = authtimeout;
           this.ldapbinddn = ldapbinddn;
           this.ldaploginname = ldaploginname;
           this.ldapbase = ldapbase;
           this.sectype = sectype;
           this.svrtype = svrtype;
           this.ssonameattribute = ssonameattribute;
           this.searchfilter = searchfilter;
           this.groupattrname = groupattrname;
           this.subattributename = subattributename;
           this.groupauthname = groupauthname;
           this.passwdchange = passwdchange;
           this.nestedgroupextraction = nestedgroupextraction;
           this.maxnestinglevel = maxnestinglevel;
           this.groupnameidentifier = groupnameidentifier;
           this.groupsearchattribute = groupsearchattribute;
           this.groupsearchsubattribute = groupsearchsubattribute;
           this.groupsearchfilter = groupsearchfilter;
           this.defaultauthenticationgroup = defaultauthenticationgroup;
    }


    /**
     * Gets the serverip value for this Aaaldapparams.
     * 
     * @return serverip
     */
    public java.lang.String getServerip() {
        return serverip;
    }


    /**
     * Sets the serverip value for this Aaaldapparams.
     * 
     * @param serverip
     */
    public void setServerip(java.lang.String serverip) {
        this.serverip = serverip;
    }


    /**
     * Gets the serverport value for this Aaaldapparams.
     * 
     * @return serverport
     */
    public org.apache.axis.types.UnsignedInt getServerport() {
        return serverport;
    }


    /**
     * Sets the serverport value for this Aaaldapparams.
     * 
     * @param serverport
     */
    public void setServerport(org.apache.axis.types.UnsignedInt serverport) {
        this.serverport = serverport;
    }


    /**
     * Gets the authtimeout value for this Aaaldapparams.
     * 
     * @return authtimeout
     */
    public org.apache.axis.types.UnsignedInt getAuthtimeout() {
        return authtimeout;
    }


    /**
     * Sets the authtimeout value for this Aaaldapparams.
     * 
     * @param authtimeout
     */
    public void setAuthtimeout(org.apache.axis.types.UnsignedInt authtimeout) {
        this.authtimeout = authtimeout;
    }


    /**
     * Gets the ldapbinddn value for this Aaaldapparams.
     * 
     * @return ldapbinddn
     */
    public java.lang.String getLdapbinddn() {
        return ldapbinddn;
    }


    /**
     * Sets the ldapbinddn value for this Aaaldapparams.
     * 
     * @param ldapbinddn
     */
    public void setLdapbinddn(java.lang.String ldapbinddn) {
        this.ldapbinddn = ldapbinddn;
    }


    /**
     * Gets the ldaploginname value for this Aaaldapparams.
     * 
     * @return ldaploginname
     */
    public java.lang.String getLdaploginname() {
        return ldaploginname;
    }


    /**
     * Sets the ldaploginname value for this Aaaldapparams.
     * 
     * @param ldaploginname
     */
    public void setLdaploginname(java.lang.String ldaploginname) {
        this.ldaploginname = ldaploginname;
    }


    /**
     * Gets the ldapbase value for this Aaaldapparams.
     * 
     * @return ldapbase
     */
    public java.lang.String getLdapbase() {
        return ldapbase;
    }


    /**
     * Sets the ldapbase value for this Aaaldapparams.
     * 
     * @param ldapbase
     */
    public void setLdapbase(java.lang.String ldapbase) {
        this.ldapbase = ldapbase;
    }


    /**
     * Gets the sectype value for this Aaaldapparams.
     * 
     * @return sectype
     */
    public java.lang.String getSectype() {
        return sectype;
    }


    /**
     * Sets the sectype value for this Aaaldapparams.
     * 
     * @param sectype
     */
    public void setSectype(java.lang.String sectype) {
        this.sectype = sectype;
    }


    /**
     * Gets the svrtype value for this Aaaldapparams.
     * 
     * @return svrtype
     */
    public java.lang.String getSvrtype() {
        return svrtype;
    }


    /**
     * Sets the svrtype value for this Aaaldapparams.
     * 
     * @param svrtype
     */
    public void setSvrtype(java.lang.String svrtype) {
        this.svrtype = svrtype;
    }


    /**
     * Gets the ssonameattribute value for this Aaaldapparams.
     * 
     * @return ssonameattribute
     */
    public java.lang.String getSsonameattribute() {
        return ssonameattribute;
    }


    /**
     * Sets the ssonameattribute value for this Aaaldapparams.
     * 
     * @param ssonameattribute
     */
    public void setSsonameattribute(java.lang.String ssonameattribute) {
        this.ssonameattribute = ssonameattribute;
    }


    /**
     * Gets the searchfilter value for this Aaaldapparams.
     * 
     * @return searchfilter
     */
    public java.lang.String getSearchfilter() {
        return searchfilter;
    }


    /**
     * Sets the searchfilter value for this Aaaldapparams.
     * 
     * @param searchfilter
     */
    public void setSearchfilter(java.lang.String searchfilter) {
        this.searchfilter = searchfilter;
    }


    /**
     * Gets the groupattrname value for this Aaaldapparams.
     * 
     * @return groupattrname
     */
    public java.lang.String getGroupattrname() {
        return groupattrname;
    }


    /**
     * Sets the groupattrname value for this Aaaldapparams.
     * 
     * @param groupattrname
     */
    public void setGroupattrname(java.lang.String groupattrname) {
        this.groupattrname = groupattrname;
    }


    /**
     * Gets the subattributename value for this Aaaldapparams.
     * 
     * @return subattributename
     */
    public java.lang.String getSubattributename() {
        return subattributename;
    }


    /**
     * Sets the subattributename value for this Aaaldapparams.
     * 
     * @param subattributename
     */
    public void setSubattributename(java.lang.String subattributename) {
        this.subattributename = subattributename;
    }


    /**
     * Gets the groupauthname value for this Aaaldapparams.
     * 
     * @return groupauthname
     */
    public java.lang.String getGroupauthname() {
        return groupauthname;
    }


    /**
     * Sets the groupauthname value for this Aaaldapparams.
     * 
     * @param groupauthname
     */
    public void setGroupauthname(java.lang.String groupauthname) {
        this.groupauthname = groupauthname;
    }


    /**
     * Gets the passwdchange value for this Aaaldapparams.
     * 
     * @return passwdchange
     */
    public java.lang.String getPasswdchange() {
        return passwdchange;
    }


    /**
     * Sets the passwdchange value for this Aaaldapparams.
     * 
     * @param passwdchange
     */
    public void setPasswdchange(java.lang.String passwdchange) {
        this.passwdchange = passwdchange;
    }


    /**
     * Gets the nestedgroupextraction value for this Aaaldapparams.
     * 
     * @return nestedgroupextraction
     */
    public java.lang.String getNestedgroupextraction() {
        return nestedgroupextraction;
    }


    /**
     * Sets the nestedgroupextraction value for this Aaaldapparams.
     * 
     * @param nestedgroupextraction
     */
    public void setNestedgroupextraction(java.lang.String nestedgroupextraction) {
        this.nestedgroupextraction = nestedgroupextraction;
    }


    /**
     * Gets the maxnestinglevel value for this Aaaldapparams.
     * 
     * @return maxnestinglevel
     */
    public org.apache.axis.types.UnsignedInt getMaxnestinglevel() {
        return maxnestinglevel;
    }


    /**
     * Sets the maxnestinglevel value for this Aaaldapparams.
     * 
     * @param maxnestinglevel
     */
    public void setMaxnestinglevel(org.apache.axis.types.UnsignedInt maxnestinglevel) {
        this.maxnestinglevel = maxnestinglevel;
    }


    /**
     * Gets the groupnameidentifier value for this Aaaldapparams.
     * 
     * @return groupnameidentifier
     */
    public java.lang.String getGroupnameidentifier() {
        return groupnameidentifier;
    }


    /**
     * Sets the groupnameidentifier value for this Aaaldapparams.
     * 
     * @param groupnameidentifier
     */
    public void setGroupnameidentifier(java.lang.String groupnameidentifier) {
        this.groupnameidentifier = groupnameidentifier;
    }


    /**
     * Gets the groupsearchattribute value for this Aaaldapparams.
     * 
     * @return groupsearchattribute
     */
    public java.lang.String getGroupsearchattribute() {
        return groupsearchattribute;
    }


    /**
     * Sets the groupsearchattribute value for this Aaaldapparams.
     * 
     * @param groupsearchattribute
     */
    public void setGroupsearchattribute(java.lang.String groupsearchattribute) {
        this.groupsearchattribute = groupsearchattribute;
    }


    /**
     * Gets the groupsearchsubattribute value for this Aaaldapparams.
     * 
     * @return groupsearchsubattribute
     */
    public java.lang.String getGroupsearchsubattribute() {
        return groupsearchsubattribute;
    }


    /**
     * Sets the groupsearchsubattribute value for this Aaaldapparams.
     * 
     * @param groupsearchsubattribute
     */
    public void setGroupsearchsubattribute(java.lang.String groupsearchsubattribute) {
        this.groupsearchsubattribute = groupsearchsubattribute;
    }


    /**
     * Gets the groupsearchfilter value for this Aaaldapparams.
     * 
     * @return groupsearchfilter
     */
    public java.lang.String getGroupsearchfilter() {
        return groupsearchfilter;
    }


    /**
     * Sets the groupsearchfilter value for this Aaaldapparams.
     * 
     * @param groupsearchfilter
     */
    public void setGroupsearchfilter(java.lang.String groupsearchfilter) {
        this.groupsearchfilter = groupsearchfilter;
    }


    /**
     * Gets the defaultauthenticationgroup value for this Aaaldapparams.
     * 
     * @return defaultauthenticationgroup
     */
    public java.lang.String getDefaultauthenticationgroup() {
        return defaultauthenticationgroup;
    }


    /**
     * Sets the defaultauthenticationgroup value for this Aaaldapparams.
     * 
     * @param defaultauthenticationgroup
     */
    public void setDefaultauthenticationgroup(java.lang.String defaultauthenticationgroup) {
        this.defaultauthenticationgroup = defaultauthenticationgroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Aaaldapparams)) return false;
        Aaaldapparams other = (Aaaldapparams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serverip==null && other.getServerip()==null) || 
             (this.serverip!=null &&
              this.serverip.equals(other.getServerip()))) &&
            ((this.serverport==null && other.getServerport()==null) || 
             (this.serverport!=null &&
              this.serverport.equals(other.getServerport()))) &&
            ((this.authtimeout==null && other.getAuthtimeout()==null) || 
             (this.authtimeout!=null &&
              this.authtimeout.equals(other.getAuthtimeout()))) &&
            ((this.ldapbinddn==null && other.getLdapbinddn()==null) || 
             (this.ldapbinddn!=null &&
              this.ldapbinddn.equals(other.getLdapbinddn()))) &&
            ((this.ldaploginname==null && other.getLdaploginname()==null) || 
             (this.ldaploginname!=null &&
              this.ldaploginname.equals(other.getLdaploginname()))) &&
            ((this.ldapbase==null && other.getLdapbase()==null) || 
             (this.ldapbase!=null &&
              this.ldapbase.equals(other.getLdapbase()))) &&
            ((this.sectype==null && other.getSectype()==null) || 
             (this.sectype!=null &&
              this.sectype.equals(other.getSectype()))) &&
            ((this.svrtype==null && other.getSvrtype()==null) || 
             (this.svrtype!=null &&
              this.svrtype.equals(other.getSvrtype()))) &&
            ((this.ssonameattribute==null && other.getSsonameattribute()==null) || 
             (this.ssonameattribute!=null &&
              this.ssonameattribute.equals(other.getSsonameattribute()))) &&
            ((this.searchfilter==null && other.getSearchfilter()==null) || 
             (this.searchfilter!=null &&
              this.searchfilter.equals(other.getSearchfilter()))) &&
            ((this.groupattrname==null && other.getGroupattrname()==null) || 
             (this.groupattrname!=null &&
              this.groupattrname.equals(other.getGroupattrname()))) &&
            ((this.subattributename==null && other.getSubattributename()==null) || 
             (this.subattributename!=null &&
              this.subattributename.equals(other.getSubattributename()))) &&
            ((this.groupauthname==null && other.getGroupauthname()==null) || 
             (this.groupauthname!=null &&
              this.groupauthname.equals(other.getGroupauthname()))) &&
            ((this.passwdchange==null && other.getPasswdchange()==null) || 
             (this.passwdchange!=null &&
              this.passwdchange.equals(other.getPasswdchange()))) &&
            ((this.nestedgroupextraction==null && other.getNestedgroupextraction()==null) || 
             (this.nestedgroupextraction!=null &&
              this.nestedgroupextraction.equals(other.getNestedgroupextraction()))) &&
            ((this.maxnestinglevel==null && other.getMaxnestinglevel()==null) || 
             (this.maxnestinglevel!=null &&
              this.maxnestinglevel.equals(other.getMaxnestinglevel()))) &&
            ((this.groupnameidentifier==null && other.getGroupnameidentifier()==null) || 
             (this.groupnameidentifier!=null &&
              this.groupnameidentifier.equals(other.getGroupnameidentifier()))) &&
            ((this.groupsearchattribute==null && other.getGroupsearchattribute()==null) || 
             (this.groupsearchattribute!=null &&
              this.groupsearchattribute.equals(other.getGroupsearchattribute()))) &&
            ((this.groupsearchsubattribute==null && other.getGroupsearchsubattribute()==null) || 
             (this.groupsearchsubattribute!=null &&
              this.groupsearchsubattribute.equals(other.getGroupsearchsubattribute()))) &&
            ((this.groupsearchfilter==null && other.getGroupsearchfilter()==null) || 
             (this.groupsearchfilter!=null &&
              this.groupsearchfilter.equals(other.getGroupsearchfilter()))) &&
            ((this.defaultauthenticationgroup==null && other.getDefaultauthenticationgroup()==null) || 
             (this.defaultauthenticationgroup!=null &&
              this.defaultauthenticationgroup.equals(other.getDefaultauthenticationgroup())));
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
        if (getServerip() != null) {
            _hashCode += getServerip().hashCode();
        }
        if (getServerport() != null) {
            _hashCode += getServerport().hashCode();
        }
        if (getAuthtimeout() != null) {
            _hashCode += getAuthtimeout().hashCode();
        }
        if (getLdapbinddn() != null) {
            _hashCode += getLdapbinddn().hashCode();
        }
        if (getLdaploginname() != null) {
            _hashCode += getLdaploginname().hashCode();
        }
        if (getLdapbase() != null) {
            _hashCode += getLdapbase().hashCode();
        }
        if (getSectype() != null) {
            _hashCode += getSectype().hashCode();
        }
        if (getSvrtype() != null) {
            _hashCode += getSvrtype().hashCode();
        }
        if (getSsonameattribute() != null) {
            _hashCode += getSsonameattribute().hashCode();
        }
        if (getSearchfilter() != null) {
            _hashCode += getSearchfilter().hashCode();
        }
        if (getGroupattrname() != null) {
            _hashCode += getGroupattrname().hashCode();
        }
        if (getSubattributename() != null) {
            _hashCode += getSubattributename().hashCode();
        }
        if (getGroupauthname() != null) {
            _hashCode += getGroupauthname().hashCode();
        }
        if (getPasswdchange() != null) {
            _hashCode += getPasswdchange().hashCode();
        }
        if (getNestedgroupextraction() != null) {
            _hashCode += getNestedgroupextraction().hashCode();
        }
        if (getMaxnestinglevel() != null) {
            _hashCode += getMaxnestinglevel().hashCode();
        }
        if (getGroupnameidentifier() != null) {
            _hashCode += getGroupnameidentifier().hashCode();
        }
        if (getGroupsearchattribute() != null) {
            _hashCode += getGroupsearchattribute().hashCode();
        }
        if (getGroupsearchsubattribute() != null) {
            _hashCode += getGroupsearchsubattribute().hashCode();
        }
        if (getGroupsearchfilter() != null) {
            _hashCode += getGroupsearchfilter().hashCode();
        }
        if (getDefaultauthenticationgroup() != null) {
            _hashCode += getDefaultauthenticationgroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Aaaldapparams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "aaaldapparams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("ldapbinddn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldapbinddn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldaploginname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldaploginname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldapbase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldapbase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sectype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sectype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svrtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svrtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssonameattribute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssonameattribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchfilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "searchfilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupattrname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupattrname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subattributename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subattributename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupauthname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupauthname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwdchange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passwdchange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nestedgroupextraction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nestedgroupextraction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxnestinglevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxnestinglevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupnameidentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupnameidentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupsearchattribute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupsearchattribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupsearchsubattribute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupsearchsubattribute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupsearchfilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupsearchfilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultauthenticationgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultauthenticationgroup"));
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
