/**
 * Authenticationldapaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Authenticationldapaction  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String serverip;

    private org.apache.axis.types.UnsignedInt serverport;

    private org.apache.axis.types.UnsignedInt authtimeout;

    private java.lang.String ldapbinddn;

    private java.lang.String ldapbinddnpassword;

    private java.lang.String ldaploginname;

    private java.lang.String ldapbase;

    private java.lang.String searchfilter;

    private java.lang.String groupattrname;

    private java.lang.String subattributename;

    private java.lang.String sectype;

    private java.lang.String svrtype;

    private java.lang.String ssonameattribute;

    private java.lang.String authentication;

    private java.lang.String requireuser;

    private org.apache.axis.types.UnsignedLong success;

    private org.apache.axis.types.UnsignedLong failure;

    private java.lang.String nestedgroupextraction;

    private org.apache.axis.types.UnsignedInt maxnestinglevel;

    private java.lang.String followreferrals;

    private org.apache.axis.types.UnsignedInt maxldapreferrals;

    private java.lang.String validateservercert;

    private java.lang.String ldaphostname;

    private java.lang.String groupnameidentifier;

    private java.lang.String groupsearchattribute;

    private java.lang.String groupsearchsubattribute;

    private java.lang.String groupsearchfilter;

    private java.lang.String passwdchange;

    private java.lang.String defaultauthenticationgroup;

    public Authenticationldapaction() {
    }

    public Authenticationldapaction(
           java.lang.String name,
           java.lang.String serverip,
           org.apache.axis.types.UnsignedInt serverport,
           org.apache.axis.types.UnsignedInt authtimeout,
           java.lang.String ldapbinddn,
           java.lang.String ldapbinddnpassword,
           java.lang.String ldaploginname,
           java.lang.String ldapbase,
           java.lang.String searchfilter,
           java.lang.String groupattrname,
           java.lang.String subattributename,
           java.lang.String sectype,
           java.lang.String svrtype,
           java.lang.String ssonameattribute,
           java.lang.String authentication,
           java.lang.String requireuser,
           org.apache.axis.types.UnsignedLong success,
           org.apache.axis.types.UnsignedLong failure,
           java.lang.String nestedgroupextraction,
           org.apache.axis.types.UnsignedInt maxnestinglevel,
           java.lang.String followreferrals,
           org.apache.axis.types.UnsignedInt maxldapreferrals,
           java.lang.String validateservercert,
           java.lang.String ldaphostname,
           java.lang.String groupnameidentifier,
           java.lang.String groupsearchattribute,
           java.lang.String groupsearchsubattribute,
           java.lang.String groupsearchfilter,
           java.lang.String passwdchange,
           java.lang.String defaultauthenticationgroup) {
           this.name = name;
           this.serverip = serverip;
           this.serverport = serverport;
           this.authtimeout = authtimeout;
           this.ldapbinddn = ldapbinddn;
           this.ldapbinddnpassword = ldapbinddnpassword;
           this.ldaploginname = ldaploginname;
           this.ldapbase = ldapbase;
           this.searchfilter = searchfilter;
           this.groupattrname = groupattrname;
           this.subattributename = subattributename;
           this.sectype = sectype;
           this.svrtype = svrtype;
           this.ssonameattribute = ssonameattribute;
           this.authentication = authentication;
           this.requireuser = requireuser;
           this.success = success;
           this.failure = failure;
           this.nestedgroupextraction = nestedgroupextraction;
           this.maxnestinglevel = maxnestinglevel;
           this.followreferrals = followreferrals;
           this.maxldapreferrals = maxldapreferrals;
           this.validateservercert = validateservercert;
           this.ldaphostname = ldaphostname;
           this.groupnameidentifier = groupnameidentifier;
           this.groupsearchattribute = groupsearchattribute;
           this.groupsearchsubattribute = groupsearchsubattribute;
           this.groupsearchfilter = groupsearchfilter;
           this.passwdchange = passwdchange;
           this.defaultauthenticationgroup = defaultauthenticationgroup;
    }


    /**
     * Gets the name value for this Authenticationldapaction.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Authenticationldapaction.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the serverip value for this Authenticationldapaction.
     * 
     * @return serverip
     */
    public java.lang.String getServerip() {
        return serverip;
    }


    /**
     * Sets the serverip value for this Authenticationldapaction.
     * 
     * @param serverip
     */
    public void setServerip(java.lang.String serverip) {
        this.serverip = serverip;
    }


    /**
     * Gets the serverport value for this Authenticationldapaction.
     * 
     * @return serverport
     */
    public org.apache.axis.types.UnsignedInt getServerport() {
        return serverport;
    }


    /**
     * Sets the serverport value for this Authenticationldapaction.
     * 
     * @param serverport
     */
    public void setServerport(org.apache.axis.types.UnsignedInt serverport) {
        this.serverport = serverport;
    }


    /**
     * Gets the authtimeout value for this Authenticationldapaction.
     * 
     * @return authtimeout
     */
    public org.apache.axis.types.UnsignedInt getAuthtimeout() {
        return authtimeout;
    }


    /**
     * Sets the authtimeout value for this Authenticationldapaction.
     * 
     * @param authtimeout
     */
    public void setAuthtimeout(org.apache.axis.types.UnsignedInt authtimeout) {
        this.authtimeout = authtimeout;
    }


    /**
     * Gets the ldapbinddn value for this Authenticationldapaction.
     * 
     * @return ldapbinddn
     */
    public java.lang.String getLdapbinddn() {
        return ldapbinddn;
    }


    /**
     * Sets the ldapbinddn value for this Authenticationldapaction.
     * 
     * @param ldapbinddn
     */
    public void setLdapbinddn(java.lang.String ldapbinddn) {
        this.ldapbinddn = ldapbinddn;
    }


    /**
     * Gets the ldapbinddnpassword value for this Authenticationldapaction.
     * 
     * @return ldapbinddnpassword
     */
    public java.lang.String getLdapbinddnpassword() {
        return ldapbinddnpassword;
    }


    /**
     * Sets the ldapbinddnpassword value for this Authenticationldapaction.
     * 
     * @param ldapbinddnpassword
     */
    public void setLdapbinddnpassword(java.lang.String ldapbinddnpassword) {
        this.ldapbinddnpassword = ldapbinddnpassword;
    }


    /**
     * Gets the ldaploginname value for this Authenticationldapaction.
     * 
     * @return ldaploginname
     */
    public java.lang.String getLdaploginname() {
        return ldaploginname;
    }


    /**
     * Sets the ldaploginname value for this Authenticationldapaction.
     * 
     * @param ldaploginname
     */
    public void setLdaploginname(java.lang.String ldaploginname) {
        this.ldaploginname = ldaploginname;
    }


    /**
     * Gets the ldapbase value for this Authenticationldapaction.
     * 
     * @return ldapbase
     */
    public java.lang.String getLdapbase() {
        return ldapbase;
    }


    /**
     * Sets the ldapbase value for this Authenticationldapaction.
     * 
     * @param ldapbase
     */
    public void setLdapbase(java.lang.String ldapbase) {
        this.ldapbase = ldapbase;
    }


    /**
     * Gets the searchfilter value for this Authenticationldapaction.
     * 
     * @return searchfilter
     */
    public java.lang.String getSearchfilter() {
        return searchfilter;
    }


    /**
     * Sets the searchfilter value for this Authenticationldapaction.
     * 
     * @param searchfilter
     */
    public void setSearchfilter(java.lang.String searchfilter) {
        this.searchfilter = searchfilter;
    }


    /**
     * Gets the groupattrname value for this Authenticationldapaction.
     * 
     * @return groupattrname
     */
    public java.lang.String getGroupattrname() {
        return groupattrname;
    }


    /**
     * Sets the groupattrname value for this Authenticationldapaction.
     * 
     * @param groupattrname
     */
    public void setGroupattrname(java.lang.String groupattrname) {
        this.groupattrname = groupattrname;
    }


    /**
     * Gets the subattributename value for this Authenticationldapaction.
     * 
     * @return subattributename
     */
    public java.lang.String getSubattributename() {
        return subattributename;
    }


    /**
     * Sets the subattributename value for this Authenticationldapaction.
     * 
     * @param subattributename
     */
    public void setSubattributename(java.lang.String subattributename) {
        this.subattributename = subattributename;
    }


    /**
     * Gets the sectype value for this Authenticationldapaction.
     * 
     * @return sectype
     */
    public java.lang.String getSectype() {
        return sectype;
    }


    /**
     * Sets the sectype value for this Authenticationldapaction.
     * 
     * @param sectype
     */
    public void setSectype(java.lang.String sectype) {
        this.sectype = sectype;
    }


    /**
     * Gets the svrtype value for this Authenticationldapaction.
     * 
     * @return svrtype
     */
    public java.lang.String getSvrtype() {
        return svrtype;
    }


    /**
     * Sets the svrtype value for this Authenticationldapaction.
     * 
     * @param svrtype
     */
    public void setSvrtype(java.lang.String svrtype) {
        this.svrtype = svrtype;
    }


    /**
     * Gets the ssonameattribute value for this Authenticationldapaction.
     * 
     * @return ssonameattribute
     */
    public java.lang.String getSsonameattribute() {
        return ssonameattribute;
    }


    /**
     * Sets the ssonameattribute value for this Authenticationldapaction.
     * 
     * @param ssonameattribute
     */
    public void setSsonameattribute(java.lang.String ssonameattribute) {
        this.ssonameattribute = ssonameattribute;
    }


    /**
     * Gets the authentication value for this Authenticationldapaction.
     * 
     * @return authentication
     */
    public java.lang.String getAuthentication() {
        return authentication;
    }


    /**
     * Sets the authentication value for this Authenticationldapaction.
     * 
     * @param authentication
     */
    public void setAuthentication(java.lang.String authentication) {
        this.authentication = authentication;
    }


    /**
     * Gets the requireuser value for this Authenticationldapaction.
     * 
     * @return requireuser
     */
    public java.lang.String getRequireuser() {
        return requireuser;
    }


    /**
     * Sets the requireuser value for this Authenticationldapaction.
     * 
     * @param requireuser
     */
    public void setRequireuser(java.lang.String requireuser) {
        this.requireuser = requireuser;
    }


    /**
     * Gets the success value for this Authenticationldapaction.
     * 
     * @return success
     */
    public org.apache.axis.types.UnsignedLong getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this Authenticationldapaction.
     * 
     * @param success
     */
    public void setSuccess(org.apache.axis.types.UnsignedLong success) {
        this.success = success;
    }


    /**
     * Gets the failure value for this Authenticationldapaction.
     * 
     * @return failure
     */
    public org.apache.axis.types.UnsignedLong getFailure() {
        return failure;
    }


    /**
     * Sets the failure value for this Authenticationldapaction.
     * 
     * @param failure
     */
    public void setFailure(org.apache.axis.types.UnsignedLong failure) {
        this.failure = failure;
    }


    /**
     * Gets the nestedgroupextraction value for this Authenticationldapaction.
     * 
     * @return nestedgroupextraction
     */
    public java.lang.String getNestedgroupextraction() {
        return nestedgroupextraction;
    }


    /**
     * Sets the nestedgroupextraction value for this Authenticationldapaction.
     * 
     * @param nestedgroupextraction
     */
    public void setNestedgroupextraction(java.lang.String nestedgroupextraction) {
        this.nestedgroupextraction = nestedgroupextraction;
    }


    /**
     * Gets the maxnestinglevel value for this Authenticationldapaction.
     * 
     * @return maxnestinglevel
     */
    public org.apache.axis.types.UnsignedInt getMaxnestinglevel() {
        return maxnestinglevel;
    }


    /**
     * Sets the maxnestinglevel value for this Authenticationldapaction.
     * 
     * @param maxnestinglevel
     */
    public void setMaxnestinglevel(org.apache.axis.types.UnsignedInt maxnestinglevel) {
        this.maxnestinglevel = maxnestinglevel;
    }


    /**
     * Gets the followreferrals value for this Authenticationldapaction.
     * 
     * @return followreferrals
     */
    public java.lang.String getFollowreferrals() {
        return followreferrals;
    }


    /**
     * Sets the followreferrals value for this Authenticationldapaction.
     * 
     * @param followreferrals
     */
    public void setFollowreferrals(java.lang.String followreferrals) {
        this.followreferrals = followreferrals;
    }


    /**
     * Gets the maxldapreferrals value for this Authenticationldapaction.
     * 
     * @return maxldapreferrals
     */
    public org.apache.axis.types.UnsignedInt getMaxldapreferrals() {
        return maxldapreferrals;
    }


    /**
     * Sets the maxldapreferrals value for this Authenticationldapaction.
     * 
     * @param maxldapreferrals
     */
    public void setMaxldapreferrals(org.apache.axis.types.UnsignedInt maxldapreferrals) {
        this.maxldapreferrals = maxldapreferrals;
    }


    /**
     * Gets the validateservercert value for this Authenticationldapaction.
     * 
     * @return validateservercert
     */
    public java.lang.String getValidateservercert() {
        return validateservercert;
    }


    /**
     * Sets the validateservercert value for this Authenticationldapaction.
     * 
     * @param validateservercert
     */
    public void setValidateservercert(java.lang.String validateservercert) {
        this.validateservercert = validateservercert;
    }


    /**
     * Gets the ldaphostname value for this Authenticationldapaction.
     * 
     * @return ldaphostname
     */
    public java.lang.String getLdaphostname() {
        return ldaphostname;
    }


    /**
     * Sets the ldaphostname value for this Authenticationldapaction.
     * 
     * @param ldaphostname
     */
    public void setLdaphostname(java.lang.String ldaphostname) {
        this.ldaphostname = ldaphostname;
    }


    /**
     * Gets the groupnameidentifier value for this Authenticationldapaction.
     * 
     * @return groupnameidentifier
     */
    public java.lang.String getGroupnameidentifier() {
        return groupnameidentifier;
    }


    /**
     * Sets the groupnameidentifier value for this Authenticationldapaction.
     * 
     * @param groupnameidentifier
     */
    public void setGroupnameidentifier(java.lang.String groupnameidentifier) {
        this.groupnameidentifier = groupnameidentifier;
    }


    /**
     * Gets the groupsearchattribute value for this Authenticationldapaction.
     * 
     * @return groupsearchattribute
     */
    public java.lang.String getGroupsearchattribute() {
        return groupsearchattribute;
    }


    /**
     * Sets the groupsearchattribute value for this Authenticationldapaction.
     * 
     * @param groupsearchattribute
     */
    public void setGroupsearchattribute(java.lang.String groupsearchattribute) {
        this.groupsearchattribute = groupsearchattribute;
    }


    /**
     * Gets the groupsearchsubattribute value for this Authenticationldapaction.
     * 
     * @return groupsearchsubattribute
     */
    public java.lang.String getGroupsearchsubattribute() {
        return groupsearchsubattribute;
    }


    /**
     * Sets the groupsearchsubattribute value for this Authenticationldapaction.
     * 
     * @param groupsearchsubattribute
     */
    public void setGroupsearchsubattribute(java.lang.String groupsearchsubattribute) {
        this.groupsearchsubattribute = groupsearchsubattribute;
    }


    /**
     * Gets the groupsearchfilter value for this Authenticationldapaction.
     * 
     * @return groupsearchfilter
     */
    public java.lang.String getGroupsearchfilter() {
        return groupsearchfilter;
    }


    /**
     * Sets the groupsearchfilter value for this Authenticationldapaction.
     * 
     * @param groupsearchfilter
     */
    public void setGroupsearchfilter(java.lang.String groupsearchfilter) {
        this.groupsearchfilter = groupsearchfilter;
    }


    /**
     * Gets the passwdchange value for this Authenticationldapaction.
     * 
     * @return passwdchange
     */
    public java.lang.String getPasswdchange() {
        return passwdchange;
    }


    /**
     * Sets the passwdchange value for this Authenticationldapaction.
     * 
     * @param passwdchange
     */
    public void setPasswdchange(java.lang.String passwdchange) {
        this.passwdchange = passwdchange;
    }


    /**
     * Gets the defaultauthenticationgroup value for this Authenticationldapaction.
     * 
     * @return defaultauthenticationgroup
     */
    public java.lang.String getDefaultauthenticationgroup() {
        return defaultauthenticationgroup;
    }


    /**
     * Sets the defaultauthenticationgroup value for this Authenticationldapaction.
     * 
     * @param defaultauthenticationgroup
     */
    public void setDefaultauthenticationgroup(java.lang.String defaultauthenticationgroup) {
        this.defaultauthenticationgroup = defaultauthenticationgroup;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Authenticationldapaction)) return false;
        Authenticationldapaction other = (Authenticationldapaction) obj;
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
            ((this.ldapbinddn==null && other.getLdapbinddn()==null) || 
             (this.ldapbinddn!=null &&
              this.ldapbinddn.equals(other.getLdapbinddn()))) &&
            ((this.ldapbinddnpassword==null && other.getLdapbinddnpassword()==null) || 
             (this.ldapbinddnpassword!=null &&
              this.ldapbinddnpassword.equals(other.getLdapbinddnpassword()))) &&
            ((this.ldaploginname==null && other.getLdaploginname()==null) || 
             (this.ldaploginname!=null &&
              this.ldaploginname.equals(other.getLdaploginname()))) &&
            ((this.ldapbase==null && other.getLdapbase()==null) || 
             (this.ldapbase!=null &&
              this.ldapbase.equals(other.getLdapbase()))) &&
            ((this.searchfilter==null && other.getSearchfilter()==null) || 
             (this.searchfilter!=null &&
              this.searchfilter.equals(other.getSearchfilter()))) &&
            ((this.groupattrname==null && other.getGroupattrname()==null) || 
             (this.groupattrname!=null &&
              this.groupattrname.equals(other.getGroupattrname()))) &&
            ((this.subattributename==null && other.getSubattributename()==null) || 
             (this.subattributename!=null &&
              this.subattributename.equals(other.getSubattributename()))) &&
            ((this.sectype==null && other.getSectype()==null) || 
             (this.sectype!=null &&
              this.sectype.equals(other.getSectype()))) &&
            ((this.svrtype==null && other.getSvrtype()==null) || 
             (this.svrtype!=null &&
              this.svrtype.equals(other.getSvrtype()))) &&
            ((this.ssonameattribute==null && other.getSsonameattribute()==null) || 
             (this.ssonameattribute!=null &&
              this.ssonameattribute.equals(other.getSsonameattribute()))) &&
            ((this.authentication==null && other.getAuthentication()==null) || 
             (this.authentication!=null &&
              this.authentication.equals(other.getAuthentication()))) &&
            ((this.requireuser==null && other.getRequireuser()==null) || 
             (this.requireuser!=null &&
              this.requireuser.equals(other.getRequireuser()))) &&
            ((this.success==null && other.getSuccess()==null) || 
             (this.success!=null &&
              this.success.equals(other.getSuccess()))) &&
            ((this.failure==null && other.getFailure()==null) || 
             (this.failure!=null &&
              this.failure.equals(other.getFailure()))) &&
            ((this.nestedgroupextraction==null && other.getNestedgroupextraction()==null) || 
             (this.nestedgroupextraction!=null &&
              this.nestedgroupextraction.equals(other.getNestedgroupextraction()))) &&
            ((this.maxnestinglevel==null && other.getMaxnestinglevel()==null) || 
             (this.maxnestinglevel!=null &&
              this.maxnestinglevel.equals(other.getMaxnestinglevel()))) &&
            ((this.followreferrals==null && other.getFollowreferrals()==null) || 
             (this.followreferrals!=null &&
              this.followreferrals.equals(other.getFollowreferrals()))) &&
            ((this.maxldapreferrals==null && other.getMaxldapreferrals()==null) || 
             (this.maxldapreferrals!=null &&
              this.maxldapreferrals.equals(other.getMaxldapreferrals()))) &&
            ((this.validateservercert==null && other.getValidateservercert()==null) || 
             (this.validateservercert!=null &&
              this.validateservercert.equals(other.getValidateservercert()))) &&
            ((this.ldaphostname==null && other.getLdaphostname()==null) || 
             (this.ldaphostname!=null &&
              this.ldaphostname.equals(other.getLdaphostname()))) &&
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
            ((this.passwdchange==null && other.getPasswdchange()==null) || 
             (this.passwdchange!=null &&
              this.passwdchange.equals(other.getPasswdchange()))) &&
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
        if (getLdapbinddn() != null) {
            _hashCode += getLdapbinddn().hashCode();
        }
        if (getLdapbinddnpassword() != null) {
            _hashCode += getLdapbinddnpassword().hashCode();
        }
        if (getLdaploginname() != null) {
            _hashCode += getLdaploginname().hashCode();
        }
        if (getLdapbase() != null) {
            _hashCode += getLdapbase().hashCode();
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
        if (getSectype() != null) {
            _hashCode += getSectype().hashCode();
        }
        if (getSvrtype() != null) {
            _hashCode += getSvrtype().hashCode();
        }
        if (getSsonameattribute() != null) {
            _hashCode += getSsonameattribute().hashCode();
        }
        if (getAuthentication() != null) {
            _hashCode += getAuthentication().hashCode();
        }
        if (getRequireuser() != null) {
            _hashCode += getRequireuser().hashCode();
        }
        if (getSuccess() != null) {
            _hashCode += getSuccess().hashCode();
        }
        if (getFailure() != null) {
            _hashCode += getFailure().hashCode();
        }
        if (getNestedgroupextraction() != null) {
            _hashCode += getNestedgroupextraction().hashCode();
        }
        if (getMaxnestinglevel() != null) {
            _hashCode += getMaxnestinglevel().hashCode();
        }
        if (getFollowreferrals() != null) {
            _hashCode += getFollowreferrals().hashCode();
        }
        if (getMaxldapreferrals() != null) {
            _hashCode += getMaxldapreferrals().hashCode();
        }
        if (getValidateservercert() != null) {
            _hashCode += getValidateservercert().hashCode();
        }
        if (getLdaphostname() != null) {
            _hashCode += getLdaphostname().hashCode();
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
        if (getPasswdchange() != null) {
            _hashCode += getPasswdchange().hashCode();
        }
        if (getDefaultauthenticationgroup() != null) {
            _hashCode += getDefaultauthenticationgroup().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Authenticationldapaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "authenticationldapaction"));
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
        elemField.setFieldName("ldapbinddn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldapbinddn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldapbinddnpassword");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldapbinddnpassword"));
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
        elemField.setFieldName("authentication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "authentication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requireuser");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requireuser"));
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
        elemField.setFieldName("followreferrals");
        elemField.setXmlName(new javax.xml.namespace.QName("", "followreferrals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxldapreferrals");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxldapreferrals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validateservercert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "validateservercert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldaphostname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldaphostname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("passwdchange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "passwdchange"));
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
