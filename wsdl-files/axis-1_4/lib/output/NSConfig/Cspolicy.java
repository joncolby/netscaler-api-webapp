/**
 * Cspolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Cspolicy  implements java.io.Serializable {
    private java.lang.String policyname;

    private java.lang.String url;

    private java.lang.String rule;

    private java.lang.String domain;

    private java.lang.String actioN;

    private org.apache.axis.types.UnsignedInt vstype;

    private org.apache.axis.types.UnsignedInt hits;

    private org.apache.axis.types.UnsignedInt[] pihits;

    private org.apache.axis.types.UnsignedInt bindhits;

    private org.apache.axis.types.UnsignedInt[] pipolicyhits;

    private java.lang.String labelname;

    private java.lang.String labeltype;

    private java.lang.String target;

    private org.apache.axis.types.UnsignedInt priority;

    private boolean activepolicy;

    private java.lang.String cspolicytype;

    private java.lang.String logaction;

    private java.lang.String[] csdomain;

    private java.lang.String[] cstarget;

    private java.lang.String[] gotopriorityexpression;

    private org.apache.axis.types.UnsignedInt[] cspriority;

    private org.apache.axis.types.UnsignedInt[] cshits;

    private java.lang.String[] csinvokelabeltype;

    private java.lang.String[] csinvokelabelname;

    private java.lang.String[] crdomain;

    private java.lang.String[] crtarget;

    private java.lang.String[] gotocrnextpriorityexpression;

    private org.apache.axis.types.UnsignedInt[] crpriority;

    private org.apache.axis.types.UnsignedInt[] crhits;

    private java.lang.String[] crinvokelabeltype;

    private java.lang.String[] crinvokelabelname;

    private java.lang.String[] cspolicylabel;

    private java.lang.String[] cspltarget;

    private java.lang.String[] gotocsplnextpriorityexpression;

    private org.apache.axis.types.UnsignedInt[] csplpriority;

    private org.apache.axis.types.UnsignedInt[] csplhits;

    private java.lang.String[] csplinvokelabeltype;

    private java.lang.String[] csplinvokelabelname;

    public Cspolicy() {
    }

    public Cspolicy(
           java.lang.String policyname,
           java.lang.String url,
           java.lang.String rule,
           java.lang.String domain,
           java.lang.String actioN,
           org.apache.axis.types.UnsignedInt vstype,
           org.apache.axis.types.UnsignedInt hits,
           org.apache.axis.types.UnsignedInt[] pihits,
           org.apache.axis.types.UnsignedInt bindhits,
           org.apache.axis.types.UnsignedInt[] pipolicyhits,
           java.lang.String labelname,
           java.lang.String labeltype,
           java.lang.String target,
           org.apache.axis.types.UnsignedInt priority,
           boolean activepolicy,
           java.lang.String cspolicytype,
           java.lang.String logaction,
           java.lang.String[] csdomain,
           java.lang.String[] cstarget,
           java.lang.String[] gotopriorityexpression,
           org.apache.axis.types.UnsignedInt[] cspriority,
           org.apache.axis.types.UnsignedInt[] cshits,
           java.lang.String[] csinvokelabeltype,
           java.lang.String[] csinvokelabelname,
           java.lang.String[] crdomain,
           java.lang.String[] crtarget,
           java.lang.String[] gotocrnextpriorityexpression,
           org.apache.axis.types.UnsignedInt[] crpriority,
           org.apache.axis.types.UnsignedInt[] crhits,
           java.lang.String[] crinvokelabeltype,
           java.lang.String[] crinvokelabelname,
           java.lang.String[] cspolicylabel,
           java.lang.String[] cspltarget,
           java.lang.String[] gotocsplnextpriorityexpression,
           org.apache.axis.types.UnsignedInt[] csplpriority,
           org.apache.axis.types.UnsignedInt[] csplhits,
           java.lang.String[] csplinvokelabeltype,
           java.lang.String[] csplinvokelabelname) {
           this.policyname = policyname;
           this.url = url;
           this.rule = rule;
           this.domain = domain;
           this.actioN = actioN;
           this.vstype = vstype;
           this.hits = hits;
           this.pihits = pihits;
           this.bindhits = bindhits;
           this.pipolicyhits = pipolicyhits;
           this.labelname = labelname;
           this.labeltype = labeltype;
           this.target = target;
           this.priority = priority;
           this.activepolicy = activepolicy;
           this.cspolicytype = cspolicytype;
           this.logaction = logaction;
           this.csdomain = csdomain;
           this.cstarget = cstarget;
           this.gotopriorityexpression = gotopriorityexpression;
           this.cspriority = cspriority;
           this.cshits = cshits;
           this.csinvokelabeltype = csinvokelabeltype;
           this.csinvokelabelname = csinvokelabelname;
           this.crdomain = crdomain;
           this.crtarget = crtarget;
           this.gotocrnextpriorityexpression = gotocrnextpriorityexpression;
           this.crpriority = crpriority;
           this.crhits = crhits;
           this.crinvokelabeltype = crinvokelabeltype;
           this.crinvokelabelname = crinvokelabelname;
           this.cspolicylabel = cspolicylabel;
           this.cspltarget = cspltarget;
           this.gotocsplnextpriorityexpression = gotocsplnextpriorityexpression;
           this.csplpriority = csplpriority;
           this.csplhits = csplhits;
           this.csplinvokelabeltype = csplinvokelabeltype;
           this.csplinvokelabelname = csplinvokelabelname;
    }


    /**
     * Gets the policyname value for this Cspolicy.
     * 
     * @return policyname
     */
    public java.lang.String getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Cspolicy.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the url value for this Cspolicy.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Cspolicy.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the rule value for this Cspolicy.
     * 
     * @return rule
     */
    public java.lang.String getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this Cspolicy.
     * 
     * @param rule
     */
    public void setRule(java.lang.String rule) {
        this.rule = rule;
    }


    /**
     * Gets the domain value for this Cspolicy.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this Cspolicy.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the actioN value for this Cspolicy.
     * 
     * @return actioN
     */
    public java.lang.String getActioN() {
        return actioN;
    }


    /**
     * Sets the actioN value for this Cspolicy.
     * 
     * @param actioN
     */
    public void setActioN(java.lang.String actioN) {
        this.actioN = actioN;
    }


    /**
     * Gets the vstype value for this Cspolicy.
     * 
     * @return vstype
     */
    public org.apache.axis.types.UnsignedInt getVstype() {
        return vstype;
    }


    /**
     * Sets the vstype value for this Cspolicy.
     * 
     * @param vstype
     */
    public void setVstype(org.apache.axis.types.UnsignedInt vstype) {
        this.vstype = vstype;
    }


    /**
     * Gets the hits value for this Cspolicy.
     * 
     * @return hits
     */
    public org.apache.axis.types.UnsignedInt getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this Cspolicy.
     * 
     * @param hits
     */
    public void setHits(org.apache.axis.types.UnsignedInt hits) {
        this.hits = hits;
    }


    /**
     * Gets the pihits value for this Cspolicy.
     * 
     * @return pihits
     */
    public org.apache.axis.types.UnsignedInt[] getPihits() {
        return pihits;
    }


    /**
     * Sets the pihits value for this Cspolicy.
     * 
     * @param pihits
     */
    public void setPihits(org.apache.axis.types.UnsignedInt[] pihits) {
        this.pihits = pihits;
    }


    /**
     * Gets the bindhits value for this Cspolicy.
     * 
     * @return bindhits
     */
    public org.apache.axis.types.UnsignedInt getBindhits() {
        return bindhits;
    }


    /**
     * Sets the bindhits value for this Cspolicy.
     * 
     * @param bindhits
     */
    public void setBindhits(org.apache.axis.types.UnsignedInt bindhits) {
        this.bindhits = bindhits;
    }


    /**
     * Gets the pipolicyhits value for this Cspolicy.
     * 
     * @return pipolicyhits
     */
    public org.apache.axis.types.UnsignedInt[] getPipolicyhits() {
        return pipolicyhits;
    }


    /**
     * Sets the pipolicyhits value for this Cspolicy.
     * 
     * @param pipolicyhits
     */
    public void setPipolicyhits(org.apache.axis.types.UnsignedInt[] pipolicyhits) {
        this.pipolicyhits = pipolicyhits;
    }


    /**
     * Gets the labelname value for this Cspolicy.
     * 
     * @return labelname
     */
    public java.lang.String getLabelname() {
        return labelname;
    }


    /**
     * Sets the labelname value for this Cspolicy.
     * 
     * @param labelname
     */
    public void setLabelname(java.lang.String labelname) {
        this.labelname = labelname;
    }


    /**
     * Gets the labeltype value for this Cspolicy.
     * 
     * @return labeltype
     */
    public java.lang.String getLabeltype() {
        return labeltype;
    }


    /**
     * Sets the labeltype value for this Cspolicy.
     * 
     * @param labeltype
     */
    public void setLabeltype(java.lang.String labeltype) {
        this.labeltype = labeltype;
    }


    /**
     * Gets the target value for this Cspolicy.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this Cspolicy.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the priority value for this Cspolicy.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Cspolicy.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the activepolicy value for this Cspolicy.
     * 
     * @return activepolicy
     */
    public boolean isActivepolicy() {
        return activepolicy;
    }


    /**
     * Sets the activepolicy value for this Cspolicy.
     * 
     * @param activepolicy
     */
    public void setActivepolicy(boolean activepolicy) {
        this.activepolicy = activepolicy;
    }


    /**
     * Gets the cspolicytype value for this Cspolicy.
     * 
     * @return cspolicytype
     */
    public java.lang.String getCspolicytype() {
        return cspolicytype;
    }


    /**
     * Sets the cspolicytype value for this Cspolicy.
     * 
     * @param cspolicytype
     */
    public void setCspolicytype(java.lang.String cspolicytype) {
        this.cspolicytype = cspolicytype;
    }


    /**
     * Gets the logaction value for this Cspolicy.
     * 
     * @return logaction
     */
    public java.lang.String getLogaction() {
        return logaction;
    }


    /**
     * Sets the logaction value for this Cspolicy.
     * 
     * @param logaction
     */
    public void setLogaction(java.lang.String logaction) {
        this.logaction = logaction;
    }


    /**
     * Gets the csdomain value for this Cspolicy.
     * 
     * @return csdomain
     */
    public java.lang.String[] getCsdomain() {
        return csdomain;
    }


    /**
     * Sets the csdomain value for this Cspolicy.
     * 
     * @param csdomain
     */
    public void setCsdomain(java.lang.String[] csdomain) {
        this.csdomain = csdomain;
    }


    /**
     * Gets the cstarget value for this Cspolicy.
     * 
     * @return cstarget
     */
    public java.lang.String[] getCstarget() {
        return cstarget;
    }


    /**
     * Sets the cstarget value for this Cspolicy.
     * 
     * @param cstarget
     */
    public void setCstarget(java.lang.String[] cstarget) {
        this.cstarget = cstarget;
    }


    /**
     * Gets the gotopriorityexpression value for this Cspolicy.
     * 
     * @return gotopriorityexpression
     */
    public java.lang.String[] getGotopriorityexpression() {
        return gotopriorityexpression;
    }


    /**
     * Sets the gotopriorityexpression value for this Cspolicy.
     * 
     * @param gotopriorityexpression
     */
    public void setGotopriorityexpression(java.lang.String[] gotopriorityexpression) {
        this.gotopriorityexpression = gotopriorityexpression;
    }


    /**
     * Gets the cspriority value for this Cspolicy.
     * 
     * @return cspriority
     */
    public org.apache.axis.types.UnsignedInt[] getCspriority() {
        return cspriority;
    }


    /**
     * Sets the cspriority value for this Cspolicy.
     * 
     * @param cspriority
     */
    public void setCspriority(org.apache.axis.types.UnsignedInt[] cspriority) {
        this.cspriority = cspriority;
    }


    /**
     * Gets the cshits value for this Cspolicy.
     * 
     * @return cshits
     */
    public org.apache.axis.types.UnsignedInt[] getCshits() {
        return cshits;
    }


    /**
     * Sets the cshits value for this Cspolicy.
     * 
     * @param cshits
     */
    public void setCshits(org.apache.axis.types.UnsignedInt[] cshits) {
        this.cshits = cshits;
    }


    /**
     * Gets the csinvokelabeltype value for this Cspolicy.
     * 
     * @return csinvokelabeltype
     */
    public java.lang.String[] getCsinvokelabeltype() {
        return csinvokelabeltype;
    }


    /**
     * Sets the csinvokelabeltype value for this Cspolicy.
     * 
     * @param csinvokelabeltype
     */
    public void setCsinvokelabeltype(java.lang.String[] csinvokelabeltype) {
        this.csinvokelabeltype = csinvokelabeltype;
    }


    /**
     * Gets the csinvokelabelname value for this Cspolicy.
     * 
     * @return csinvokelabelname
     */
    public java.lang.String[] getCsinvokelabelname() {
        return csinvokelabelname;
    }


    /**
     * Sets the csinvokelabelname value for this Cspolicy.
     * 
     * @param csinvokelabelname
     */
    public void setCsinvokelabelname(java.lang.String[] csinvokelabelname) {
        this.csinvokelabelname = csinvokelabelname;
    }


    /**
     * Gets the crdomain value for this Cspolicy.
     * 
     * @return crdomain
     */
    public java.lang.String[] getCrdomain() {
        return crdomain;
    }


    /**
     * Sets the crdomain value for this Cspolicy.
     * 
     * @param crdomain
     */
    public void setCrdomain(java.lang.String[] crdomain) {
        this.crdomain = crdomain;
    }


    /**
     * Gets the crtarget value for this Cspolicy.
     * 
     * @return crtarget
     */
    public java.lang.String[] getCrtarget() {
        return crtarget;
    }


    /**
     * Sets the crtarget value for this Cspolicy.
     * 
     * @param crtarget
     */
    public void setCrtarget(java.lang.String[] crtarget) {
        this.crtarget = crtarget;
    }


    /**
     * Gets the gotocrnextpriorityexpression value for this Cspolicy.
     * 
     * @return gotocrnextpriorityexpression
     */
    public java.lang.String[] getGotocrnextpriorityexpression() {
        return gotocrnextpriorityexpression;
    }


    /**
     * Sets the gotocrnextpriorityexpression value for this Cspolicy.
     * 
     * @param gotocrnextpriorityexpression
     */
    public void setGotocrnextpriorityexpression(java.lang.String[] gotocrnextpriorityexpression) {
        this.gotocrnextpriorityexpression = gotocrnextpriorityexpression;
    }


    /**
     * Gets the crpriority value for this Cspolicy.
     * 
     * @return crpriority
     */
    public org.apache.axis.types.UnsignedInt[] getCrpriority() {
        return crpriority;
    }


    /**
     * Sets the crpriority value for this Cspolicy.
     * 
     * @param crpriority
     */
    public void setCrpriority(org.apache.axis.types.UnsignedInt[] crpriority) {
        this.crpriority = crpriority;
    }


    /**
     * Gets the crhits value for this Cspolicy.
     * 
     * @return crhits
     */
    public org.apache.axis.types.UnsignedInt[] getCrhits() {
        return crhits;
    }


    /**
     * Sets the crhits value for this Cspolicy.
     * 
     * @param crhits
     */
    public void setCrhits(org.apache.axis.types.UnsignedInt[] crhits) {
        this.crhits = crhits;
    }


    /**
     * Gets the crinvokelabeltype value for this Cspolicy.
     * 
     * @return crinvokelabeltype
     */
    public java.lang.String[] getCrinvokelabeltype() {
        return crinvokelabeltype;
    }


    /**
     * Sets the crinvokelabeltype value for this Cspolicy.
     * 
     * @param crinvokelabeltype
     */
    public void setCrinvokelabeltype(java.lang.String[] crinvokelabeltype) {
        this.crinvokelabeltype = crinvokelabeltype;
    }


    /**
     * Gets the crinvokelabelname value for this Cspolicy.
     * 
     * @return crinvokelabelname
     */
    public java.lang.String[] getCrinvokelabelname() {
        return crinvokelabelname;
    }


    /**
     * Sets the crinvokelabelname value for this Cspolicy.
     * 
     * @param crinvokelabelname
     */
    public void setCrinvokelabelname(java.lang.String[] crinvokelabelname) {
        this.crinvokelabelname = crinvokelabelname;
    }


    /**
     * Gets the cspolicylabel value for this Cspolicy.
     * 
     * @return cspolicylabel
     */
    public java.lang.String[] getCspolicylabel() {
        return cspolicylabel;
    }


    /**
     * Sets the cspolicylabel value for this Cspolicy.
     * 
     * @param cspolicylabel
     */
    public void setCspolicylabel(java.lang.String[] cspolicylabel) {
        this.cspolicylabel = cspolicylabel;
    }


    /**
     * Gets the cspltarget value for this Cspolicy.
     * 
     * @return cspltarget
     */
    public java.lang.String[] getCspltarget() {
        return cspltarget;
    }


    /**
     * Sets the cspltarget value for this Cspolicy.
     * 
     * @param cspltarget
     */
    public void setCspltarget(java.lang.String[] cspltarget) {
        this.cspltarget = cspltarget;
    }


    /**
     * Gets the gotocsplnextpriorityexpression value for this Cspolicy.
     * 
     * @return gotocsplnextpriorityexpression
     */
    public java.lang.String[] getGotocsplnextpriorityexpression() {
        return gotocsplnextpriorityexpression;
    }


    /**
     * Sets the gotocsplnextpriorityexpression value for this Cspolicy.
     * 
     * @param gotocsplnextpriorityexpression
     */
    public void setGotocsplnextpriorityexpression(java.lang.String[] gotocsplnextpriorityexpression) {
        this.gotocsplnextpriorityexpression = gotocsplnextpriorityexpression;
    }


    /**
     * Gets the csplpriority value for this Cspolicy.
     * 
     * @return csplpriority
     */
    public org.apache.axis.types.UnsignedInt[] getCsplpriority() {
        return csplpriority;
    }


    /**
     * Sets the csplpriority value for this Cspolicy.
     * 
     * @param csplpriority
     */
    public void setCsplpriority(org.apache.axis.types.UnsignedInt[] csplpriority) {
        this.csplpriority = csplpriority;
    }


    /**
     * Gets the csplhits value for this Cspolicy.
     * 
     * @return csplhits
     */
    public org.apache.axis.types.UnsignedInt[] getCsplhits() {
        return csplhits;
    }


    /**
     * Sets the csplhits value for this Cspolicy.
     * 
     * @param csplhits
     */
    public void setCsplhits(org.apache.axis.types.UnsignedInt[] csplhits) {
        this.csplhits = csplhits;
    }


    /**
     * Gets the csplinvokelabeltype value for this Cspolicy.
     * 
     * @return csplinvokelabeltype
     */
    public java.lang.String[] getCsplinvokelabeltype() {
        return csplinvokelabeltype;
    }


    /**
     * Sets the csplinvokelabeltype value for this Cspolicy.
     * 
     * @param csplinvokelabeltype
     */
    public void setCsplinvokelabeltype(java.lang.String[] csplinvokelabeltype) {
        this.csplinvokelabeltype = csplinvokelabeltype;
    }


    /**
     * Gets the csplinvokelabelname value for this Cspolicy.
     * 
     * @return csplinvokelabelname
     */
    public java.lang.String[] getCsplinvokelabelname() {
        return csplinvokelabelname;
    }


    /**
     * Sets the csplinvokelabelname value for this Cspolicy.
     * 
     * @param csplinvokelabelname
     */
    public void setCsplinvokelabelname(java.lang.String[] csplinvokelabelname) {
        this.csplinvokelabelname = csplinvokelabelname;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cspolicy)) return false;
        Cspolicy other = (Cspolicy) obj;
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
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              this.rule.equals(other.getRule()))) &&
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain()))) &&
            ((this.actioN==null && other.getActioN()==null) || 
             (this.actioN!=null &&
              this.actioN.equals(other.getActioN()))) &&
            ((this.vstype==null && other.getVstype()==null) || 
             (this.vstype!=null &&
              this.vstype.equals(other.getVstype()))) &&
            ((this.hits==null && other.getHits()==null) || 
             (this.hits!=null &&
              this.hits.equals(other.getHits()))) &&
            ((this.pihits==null && other.getPihits()==null) || 
             (this.pihits!=null &&
              java.util.Arrays.equals(this.pihits, other.getPihits()))) &&
            ((this.bindhits==null && other.getBindhits()==null) || 
             (this.bindhits!=null &&
              this.bindhits.equals(other.getBindhits()))) &&
            ((this.pipolicyhits==null && other.getPipolicyhits()==null) || 
             (this.pipolicyhits!=null &&
              java.util.Arrays.equals(this.pipolicyhits, other.getPipolicyhits()))) &&
            ((this.labelname==null && other.getLabelname()==null) || 
             (this.labelname!=null &&
              this.labelname.equals(other.getLabelname()))) &&
            ((this.labeltype==null && other.getLabeltype()==null) || 
             (this.labeltype!=null &&
              this.labeltype.equals(other.getLabeltype()))) &&
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            this.activepolicy == other.isActivepolicy() &&
            ((this.cspolicytype==null && other.getCspolicytype()==null) || 
             (this.cspolicytype!=null &&
              this.cspolicytype.equals(other.getCspolicytype()))) &&
            ((this.logaction==null && other.getLogaction()==null) || 
             (this.logaction!=null &&
              this.logaction.equals(other.getLogaction()))) &&
            ((this.csdomain==null && other.getCsdomain()==null) || 
             (this.csdomain!=null &&
              java.util.Arrays.equals(this.csdomain, other.getCsdomain()))) &&
            ((this.cstarget==null && other.getCstarget()==null) || 
             (this.cstarget!=null &&
              java.util.Arrays.equals(this.cstarget, other.getCstarget()))) &&
            ((this.gotopriorityexpression==null && other.getGotopriorityexpression()==null) || 
             (this.gotopriorityexpression!=null &&
              java.util.Arrays.equals(this.gotopriorityexpression, other.getGotopriorityexpression()))) &&
            ((this.cspriority==null && other.getCspriority()==null) || 
             (this.cspriority!=null &&
              java.util.Arrays.equals(this.cspriority, other.getCspriority()))) &&
            ((this.cshits==null && other.getCshits()==null) || 
             (this.cshits!=null &&
              java.util.Arrays.equals(this.cshits, other.getCshits()))) &&
            ((this.csinvokelabeltype==null && other.getCsinvokelabeltype()==null) || 
             (this.csinvokelabeltype!=null &&
              java.util.Arrays.equals(this.csinvokelabeltype, other.getCsinvokelabeltype()))) &&
            ((this.csinvokelabelname==null && other.getCsinvokelabelname()==null) || 
             (this.csinvokelabelname!=null &&
              java.util.Arrays.equals(this.csinvokelabelname, other.getCsinvokelabelname()))) &&
            ((this.crdomain==null && other.getCrdomain()==null) || 
             (this.crdomain!=null &&
              java.util.Arrays.equals(this.crdomain, other.getCrdomain()))) &&
            ((this.crtarget==null && other.getCrtarget()==null) || 
             (this.crtarget!=null &&
              java.util.Arrays.equals(this.crtarget, other.getCrtarget()))) &&
            ((this.gotocrnextpriorityexpression==null && other.getGotocrnextpriorityexpression()==null) || 
             (this.gotocrnextpriorityexpression!=null &&
              java.util.Arrays.equals(this.gotocrnextpriorityexpression, other.getGotocrnextpriorityexpression()))) &&
            ((this.crpriority==null && other.getCrpriority()==null) || 
             (this.crpriority!=null &&
              java.util.Arrays.equals(this.crpriority, other.getCrpriority()))) &&
            ((this.crhits==null && other.getCrhits()==null) || 
             (this.crhits!=null &&
              java.util.Arrays.equals(this.crhits, other.getCrhits()))) &&
            ((this.crinvokelabeltype==null && other.getCrinvokelabeltype()==null) || 
             (this.crinvokelabeltype!=null &&
              java.util.Arrays.equals(this.crinvokelabeltype, other.getCrinvokelabeltype()))) &&
            ((this.crinvokelabelname==null && other.getCrinvokelabelname()==null) || 
             (this.crinvokelabelname!=null &&
              java.util.Arrays.equals(this.crinvokelabelname, other.getCrinvokelabelname()))) &&
            ((this.cspolicylabel==null && other.getCspolicylabel()==null) || 
             (this.cspolicylabel!=null &&
              java.util.Arrays.equals(this.cspolicylabel, other.getCspolicylabel()))) &&
            ((this.cspltarget==null && other.getCspltarget()==null) || 
             (this.cspltarget!=null &&
              java.util.Arrays.equals(this.cspltarget, other.getCspltarget()))) &&
            ((this.gotocsplnextpriorityexpression==null && other.getGotocsplnextpriorityexpression()==null) || 
             (this.gotocsplnextpriorityexpression!=null &&
              java.util.Arrays.equals(this.gotocsplnextpriorityexpression, other.getGotocsplnextpriorityexpression()))) &&
            ((this.csplpriority==null && other.getCsplpriority()==null) || 
             (this.csplpriority!=null &&
              java.util.Arrays.equals(this.csplpriority, other.getCsplpriority()))) &&
            ((this.csplhits==null && other.getCsplhits()==null) || 
             (this.csplhits!=null &&
              java.util.Arrays.equals(this.csplhits, other.getCsplhits()))) &&
            ((this.csplinvokelabeltype==null && other.getCsplinvokelabeltype()==null) || 
             (this.csplinvokelabeltype!=null &&
              java.util.Arrays.equals(this.csplinvokelabeltype, other.getCsplinvokelabeltype()))) &&
            ((this.csplinvokelabelname==null && other.getCsplinvokelabelname()==null) || 
             (this.csplinvokelabelname!=null &&
              java.util.Arrays.equals(this.csplinvokelabelname, other.getCsplinvokelabelname())));
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
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getRule() != null) {
            _hashCode += getRule().hashCode();
        }
        if (getDomain() != null) {
            _hashCode += getDomain().hashCode();
        }
        if (getActioN() != null) {
            _hashCode += getActioN().hashCode();
        }
        if (getVstype() != null) {
            _hashCode += getVstype().hashCode();
        }
        if (getHits() != null) {
            _hashCode += getHits().hashCode();
        }
        if (getPihits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPihits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPihits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBindhits() != null) {
            _hashCode += getBindhits().hashCode();
        }
        if (getPipolicyhits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPipolicyhits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPipolicyhits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLabelname() != null) {
            _hashCode += getLabelname().hashCode();
        }
        if (getLabeltype() != null) {
            _hashCode += getLabeltype().hashCode();
        }
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        _hashCode += (isActivepolicy() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCspolicytype() != null) {
            _hashCode += getCspolicytype().hashCode();
        }
        if (getLogaction() != null) {
            _hashCode += getLogaction().hashCode();
        }
        if (getCsdomain() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCsdomain());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCsdomain(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCstarget() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCstarget());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCstarget(), i);
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
        if (getCspriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCspriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCspriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCshits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCshits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCshits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCsinvokelabeltype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCsinvokelabeltype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCsinvokelabeltype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCsinvokelabelname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCsinvokelabelname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCsinvokelabelname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCrdomain() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCrdomain());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCrdomain(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCrtarget() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCrtarget());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCrtarget(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGotocrnextpriorityexpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGotocrnextpriorityexpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGotocrnextpriorityexpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCrpriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCrpriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCrpriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCrhits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCrhits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCrhits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCrinvokelabeltype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCrinvokelabeltype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCrinvokelabeltype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCrinvokelabelname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCrinvokelabelname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCrinvokelabelname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCspolicylabel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCspolicylabel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCspolicylabel(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCspltarget() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCspltarget());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCspltarget(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGotocsplnextpriorityexpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGotocsplnextpriorityexpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGotocsplnextpriorityexpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCsplpriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCsplpriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCsplpriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCsplhits() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCsplhits());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCsplhits(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCsplinvokelabeltype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCsplinvokelabeltype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCsplinvokelabeltype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCsplinvokelabelname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCsplinvokelabelname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCsplinvokelabelname(), i);
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
        new org.apache.axis.description.TypeDesc(Cspolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "cspolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actioN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actioN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vstype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vstype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pihits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pihits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bindhits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bindhits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pipolicyhits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pipolicyhits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "labelname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labeltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "labeltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("", "target"));
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
        elemField.setFieldName("activepolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activepolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cspolicytype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cspolicytype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csdomain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "csdomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cstarget");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cstarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gotopriorityexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gotopriorityexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cspriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cspriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cshits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cshits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csinvokelabeltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "csinvokelabeltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csinvokelabelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "csinvokelabelname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crdomain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crdomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crtarget");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crtarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gotocrnextpriorityexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gotocrnextpriorityexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crpriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crpriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crhits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crhits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crinvokelabeltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crinvokelabeltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crinvokelabelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crinvokelabelname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cspolicylabel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cspolicylabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cspltarget");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cspltarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gotocsplnextpriorityexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gotocsplnextpriorityexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csplpriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "csplpriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csplhits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "csplhits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csplinvokelabeltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "csplinvokelabeltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csplinvokelabelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "csplinvokelabelname"));
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
