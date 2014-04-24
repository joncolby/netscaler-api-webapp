/**
 * Appfwglobal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Appfwglobal  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String policyname;

    private org.apache.axis.types.UnsignedInt priority;

    private java.lang.String gotopriorityexpression;

    private boolean invoke;

    private java.lang.String state;

    private java.lang.String labeltype;

    private java.lang.String labelname;

    private org.apache.axis.types.UnsignedInt flowtype;

    private org.apache.axis.types.UnsignedInt numpol;

    private java.lang.String[] policytype;

    private java.lang.String[] appfwpolicyname;

    private org.apache.axis.types.UnsignedInt[] appfwpriority;

    private java.lang.String[] appfwpolicygotoprioexpression;

    private boolean[] appfwinvoke;

    private java.lang.String[] appfwpolicystate;

    private org.apache.axis.types.UnsignedInt[] appfwbindpolicytype;

    private java.lang.String[] appfwpolicyinvokelabeltype;

    private java.lang.String[] appfwpolicyinvokelabelname;

    private org.apache.axis.types.UnsignedInt[] appfwpolicynumpol;

    private org.apache.axis.types.UnsignedInt[] appfwpolicyflowtype;

    private org.apache.axis.types.UnsignedInt[] appfwpolicyflag;

    private org.apache.axis.types.UnsignedInt[] appfwpolicybindflags;

    private java.lang.String[] appfwbindpoint;

    private java.lang.String[] nslogpolicyname;

    private org.apache.axis.types.UnsignedInt[] nslogpriority;

    private java.lang.String[] nslogpolicystate;

    private org.apache.axis.types.UnsignedInt[] nslogbindpolicytype;

    private org.apache.axis.types.UnsignedInt[] nslogpolicyflag;

    private org.apache.axis.types.UnsignedInt[] nslogpolicybindflags;

    private java.lang.String[] nslogbindpoint;

    private java.lang.String[] syslogpolicyname;

    private org.apache.axis.types.UnsignedInt[] syslogpriority;

    private java.lang.String[] syslogpolicystate;

    private org.apache.axis.types.UnsignedInt[] syslogbindpolicytype;

    private org.apache.axis.types.UnsignedInt[] syslogpolicyflag;

    private org.apache.axis.types.UnsignedInt[] syslogpolicybindflags;

    private java.lang.String[] syslogbindpoint;

    public Appfwglobal() {
    }

    public Appfwglobal(
           java.lang.String type,
           java.lang.String policyname,
           org.apache.axis.types.UnsignedInt priority,
           java.lang.String gotopriorityexpression,
           boolean invoke,
           java.lang.String state,
           java.lang.String labeltype,
           java.lang.String labelname,
           org.apache.axis.types.UnsignedInt flowtype,
           org.apache.axis.types.UnsignedInt numpol,
           java.lang.String[] policytype,
           java.lang.String[] appfwpolicyname,
           org.apache.axis.types.UnsignedInt[] appfwpriority,
           java.lang.String[] appfwpolicygotoprioexpression,
           boolean[] appfwinvoke,
           java.lang.String[] appfwpolicystate,
           org.apache.axis.types.UnsignedInt[] appfwbindpolicytype,
           java.lang.String[] appfwpolicyinvokelabeltype,
           java.lang.String[] appfwpolicyinvokelabelname,
           org.apache.axis.types.UnsignedInt[] appfwpolicynumpol,
           org.apache.axis.types.UnsignedInt[] appfwpolicyflowtype,
           org.apache.axis.types.UnsignedInt[] appfwpolicyflag,
           org.apache.axis.types.UnsignedInt[] appfwpolicybindflags,
           java.lang.String[] appfwbindpoint,
           java.lang.String[] nslogpolicyname,
           org.apache.axis.types.UnsignedInt[] nslogpriority,
           java.lang.String[] nslogpolicystate,
           org.apache.axis.types.UnsignedInt[] nslogbindpolicytype,
           org.apache.axis.types.UnsignedInt[] nslogpolicyflag,
           org.apache.axis.types.UnsignedInt[] nslogpolicybindflags,
           java.lang.String[] nslogbindpoint,
           java.lang.String[] syslogpolicyname,
           org.apache.axis.types.UnsignedInt[] syslogpriority,
           java.lang.String[] syslogpolicystate,
           org.apache.axis.types.UnsignedInt[] syslogbindpolicytype,
           org.apache.axis.types.UnsignedInt[] syslogpolicyflag,
           org.apache.axis.types.UnsignedInt[] syslogpolicybindflags,
           java.lang.String[] syslogbindpoint) {
           this.type = type;
           this.policyname = policyname;
           this.priority = priority;
           this.gotopriorityexpression = gotopriorityexpression;
           this.invoke = invoke;
           this.state = state;
           this.labeltype = labeltype;
           this.labelname = labelname;
           this.flowtype = flowtype;
           this.numpol = numpol;
           this.policytype = policytype;
           this.appfwpolicyname = appfwpolicyname;
           this.appfwpriority = appfwpriority;
           this.appfwpolicygotoprioexpression = appfwpolicygotoprioexpression;
           this.appfwinvoke = appfwinvoke;
           this.appfwpolicystate = appfwpolicystate;
           this.appfwbindpolicytype = appfwbindpolicytype;
           this.appfwpolicyinvokelabeltype = appfwpolicyinvokelabeltype;
           this.appfwpolicyinvokelabelname = appfwpolicyinvokelabelname;
           this.appfwpolicynumpol = appfwpolicynumpol;
           this.appfwpolicyflowtype = appfwpolicyflowtype;
           this.appfwpolicyflag = appfwpolicyflag;
           this.appfwpolicybindflags = appfwpolicybindflags;
           this.appfwbindpoint = appfwbindpoint;
           this.nslogpolicyname = nslogpolicyname;
           this.nslogpriority = nslogpriority;
           this.nslogpolicystate = nslogpolicystate;
           this.nslogbindpolicytype = nslogbindpolicytype;
           this.nslogpolicyflag = nslogpolicyflag;
           this.nslogpolicybindflags = nslogpolicybindflags;
           this.nslogbindpoint = nslogbindpoint;
           this.syslogpolicyname = syslogpolicyname;
           this.syslogpriority = syslogpriority;
           this.syslogpolicystate = syslogpolicystate;
           this.syslogbindpolicytype = syslogbindpolicytype;
           this.syslogpolicyflag = syslogpolicyflag;
           this.syslogpolicybindflags = syslogpolicybindflags;
           this.syslogbindpoint = syslogbindpoint;
    }


    /**
     * Gets the type value for this Appfwglobal.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Appfwglobal.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the policyname value for this Appfwglobal.
     * 
     * @return policyname
     */
    public java.lang.String getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Appfwglobal.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the priority value for this Appfwglobal.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Appfwglobal.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the gotopriorityexpression value for this Appfwglobal.
     * 
     * @return gotopriorityexpression
     */
    public java.lang.String getGotopriorityexpression() {
        return gotopriorityexpression;
    }


    /**
     * Sets the gotopriorityexpression value for this Appfwglobal.
     * 
     * @param gotopriorityexpression
     */
    public void setGotopriorityexpression(java.lang.String gotopriorityexpression) {
        this.gotopriorityexpression = gotopriorityexpression;
    }


    /**
     * Gets the invoke value for this Appfwglobal.
     * 
     * @return invoke
     */
    public boolean isInvoke() {
        return invoke;
    }


    /**
     * Sets the invoke value for this Appfwglobal.
     * 
     * @param invoke
     */
    public void setInvoke(boolean invoke) {
        this.invoke = invoke;
    }


    /**
     * Gets the state value for this Appfwglobal.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Appfwglobal.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the labeltype value for this Appfwglobal.
     * 
     * @return labeltype
     */
    public java.lang.String getLabeltype() {
        return labeltype;
    }


    /**
     * Sets the labeltype value for this Appfwglobal.
     * 
     * @param labeltype
     */
    public void setLabeltype(java.lang.String labeltype) {
        this.labeltype = labeltype;
    }


    /**
     * Gets the labelname value for this Appfwglobal.
     * 
     * @return labelname
     */
    public java.lang.String getLabelname() {
        return labelname;
    }


    /**
     * Sets the labelname value for this Appfwglobal.
     * 
     * @param labelname
     */
    public void setLabelname(java.lang.String labelname) {
        this.labelname = labelname;
    }


    /**
     * Gets the flowtype value for this Appfwglobal.
     * 
     * @return flowtype
     */
    public org.apache.axis.types.UnsignedInt getFlowtype() {
        return flowtype;
    }


    /**
     * Sets the flowtype value for this Appfwglobal.
     * 
     * @param flowtype
     */
    public void setFlowtype(org.apache.axis.types.UnsignedInt flowtype) {
        this.flowtype = flowtype;
    }


    /**
     * Gets the numpol value for this Appfwglobal.
     * 
     * @return numpol
     */
    public org.apache.axis.types.UnsignedInt getNumpol() {
        return numpol;
    }


    /**
     * Sets the numpol value for this Appfwglobal.
     * 
     * @param numpol
     */
    public void setNumpol(org.apache.axis.types.UnsignedInt numpol) {
        this.numpol = numpol;
    }


    /**
     * Gets the policytype value for this Appfwglobal.
     * 
     * @return policytype
     */
    public java.lang.String[] getPolicytype() {
        return policytype;
    }


    /**
     * Sets the policytype value for this Appfwglobal.
     * 
     * @param policytype
     */
    public void setPolicytype(java.lang.String[] policytype) {
        this.policytype = policytype;
    }


    /**
     * Gets the appfwpolicyname value for this Appfwglobal.
     * 
     * @return appfwpolicyname
     */
    public java.lang.String[] getAppfwpolicyname() {
        return appfwpolicyname;
    }


    /**
     * Sets the appfwpolicyname value for this Appfwglobal.
     * 
     * @param appfwpolicyname
     */
    public void setAppfwpolicyname(java.lang.String[] appfwpolicyname) {
        this.appfwpolicyname = appfwpolicyname;
    }


    /**
     * Gets the appfwpriority value for this Appfwglobal.
     * 
     * @return appfwpriority
     */
    public org.apache.axis.types.UnsignedInt[] getAppfwpriority() {
        return appfwpriority;
    }


    /**
     * Sets the appfwpriority value for this Appfwglobal.
     * 
     * @param appfwpriority
     */
    public void setAppfwpriority(org.apache.axis.types.UnsignedInt[] appfwpriority) {
        this.appfwpriority = appfwpriority;
    }


    /**
     * Gets the appfwpolicygotoprioexpression value for this Appfwglobal.
     * 
     * @return appfwpolicygotoprioexpression
     */
    public java.lang.String[] getAppfwpolicygotoprioexpression() {
        return appfwpolicygotoprioexpression;
    }


    /**
     * Sets the appfwpolicygotoprioexpression value for this Appfwglobal.
     * 
     * @param appfwpolicygotoprioexpression
     */
    public void setAppfwpolicygotoprioexpression(java.lang.String[] appfwpolicygotoprioexpression) {
        this.appfwpolicygotoprioexpression = appfwpolicygotoprioexpression;
    }


    /**
     * Gets the appfwinvoke value for this Appfwglobal.
     * 
     * @return appfwinvoke
     */
    public boolean[] getAppfwinvoke() {
        return appfwinvoke;
    }


    /**
     * Sets the appfwinvoke value for this Appfwglobal.
     * 
     * @param appfwinvoke
     */
    public void setAppfwinvoke(boolean[] appfwinvoke) {
        this.appfwinvoke = appfwinvoke;
    }


    /**
     * Gets the appfwpolicystate value for this Appfwglobal.
     * 
     * @return appfwpolicystate
     */
    public java.lang.String[] getAppfwpolicystate() {
        return appfwpolicystate;
    }


    /**
     * Sets the appfwpolicystate value for this Appfwglobal.
     * 
     * @param appfwpolicystate
     */
    public void setAppfwpolicystate(java.lang.String[] appfwpolicystate) {
        this.appfwpolicystate = appfwpolicystate;
    }


    /**
     * Gets the appfwbindpolicytype value for this Appfwglobal.
     * 
     * @return appfwbindpolicytype
     */
    public org.apache.axis.types.UnsignedInt[] getAppfwbindpolicytype() {
        return appfwbindpolicytype;
    }


    /**
     * Sets the appfwbindpolicytype value for this Appfwglobal.
     * 
     * @param appfwbindpolicytype
     */
    public void setAppfwbindpolicytype(org.apache.axis.types.UnsignedInt[] appfwbindpolicytype) {
        this.appfwbindpolicytype = appfwbindpolicytype;
    }


    /**
     * Gets the appfwpolicyinvokelabeltype value for this Appfwglobal.
     * 
     * @return appfwpolicyinvokelabeltype
     */
    public java.lang.String[] getAppfwpolicyinvokelabeltype() {
        return appfwpolicyinvokelabeltype;
    }


    /**
     * Sets the appfwpolicyinvokelabeltype value for this Appfwglobal.
     * 
     * @param appfwpolicyinvokelabeltype
     */
    public void setAppfwpolicyinvokelabeltype(java.lang.String[] appfwpolicyinvokelabeltype) {
        this.appfwpolicyinvokelabeltype = appfwpolicyinvokelabeltype;
    }


    /**
     * Gets the appfwpolicyinvokelabelname value for this Appfwglobal.
     * 
     * @return appfwpolicyinvokelabelname
     */
    public java.lang.String[] getAppfwpolicyinvokelabelname() {
        return appfwpolicyinvokelabelname;
    }


    /**
     * Sets the appfwpolicyinvokelabelname value for this Appfwglobal.
     * 
     * @param appfwpolicyinvokelabelname
     */
    public void setAppfwpolicyinvokelabelname(java.lang.String[] appfwpolicyinvokelabelname) {
        this.appfwpolicyinvokelabelname = appfwpolicyinvokelabelname;
    }


    /**
     * Gets the appfwpolicynumpol value for this Appfwglobal.
     * 
     * @return appfwpolicynumpol
     */
    public org.apache.axis.types.UnsignedInt[] getAppfwpolicynumpol() {
        return appfwpolicynumpol;
    }


    /**
     * Sets the appfwpolicynumpol value for this Appfwglobal.
     * 
     * @param appfwpolicynumpol
     */
    public void setAppfwpolicynumpol(org.apache.axis.types.UnsignedInt[] appfwpolicynumpol) {
        this.appfwpolicynumpol = appfwpolicynumpol;
    }


    /**
     * Gets the appfwpolicyflowtype value for this Appfwglobal.
     * 
     * @return appfwpolicyflowtype
     */
    public org.apache.axis.types.UnsignedInt[] getAppfwpolicyflowtype() {
        return appfwpolicyflowtype;
    }


    /**
     * Sets the appfwpolicyflowtype value for this Appfwglobal.
     * 
     * @param appfwpolicyflowtype
     */
    public void setAppfwpolicyflowtype(org.apache.axis.types.UnsignedInt[] appfwpolicyflowtype) {
        this.appfwpolicyflowtype = appfwpolicyflowtype;
    }


    /**
     * Gets the appfwpolicyflag value for this Appfwglobal.
     * 
     * @return appfwpolicyflag
     */
    public org.apache.axis.types.UnsignedInt[] getAppfwpolicyflag() {
        return appfwpolicyflag;
    }


    /**
     * Sets the appfwpolicyflag value for this Appfwglobal.
     * 
     * @param appfwpolicyflag
     */
    public void setAppfwpolicyflag(org.apache.axis.types.UnsignedInt[] appfwpolicyflag) {
        this.appfwpolicyflag = appfwpolicyflag;
    }


    /**
     * Gets the appfwpolicybindflags value for this Appfwglobal.
     * 
     * @return appfwpolicybindflags
     */
    public org.apache.axis.types.UnsignedInt[] getAppfwpolicybindflags() {
        return appfwpolicybindflags;
    }


    /**
     * Sets the appfwpolicybindflags value for this Appfwglobal.
     * 
     * @param appfwpolicybindflags
     */
    public void setAppfwpolicybindflags(org.apache.axis.types.UnsignedInt[] appfwpolicybindflags) {
        this.appfwpolicybindflags = appfwpolicybindflags;
    }


    /**
     * Gets the appfwbindpoint value for this Appfwglobal.
     * 
     * @return appfwbindpoint
     */
    public java.lang.String[] getAppfwbindpoint() {
        return appfwbindpoint;
    }


    /**
     * Sets the appfwbindpoint value for this Appfwglobal.
     * 
     * @param appfwbindpoint
     */
    public void setAppfwbindpoint(java.lang.String[] appfwbindpoint) {
        this.appfwbindpoint = appfwbindpoint;
    }


    /**
     * Gets the nslogpolicyname value for this Appfwglobal.
     * 
     * @return nslogpolicyname
     */
    public java.lang.String[] getNslogpolicyname() {
        return nslogpolicyname;
    }


    /**
     * Sets the nslogpolicyname value for this Appfwglobal.
     * 
     * @param nslogpolicyname
     */
    public void setNslogpolicyname(java.lang.String[] nslogpolicyname) {
        this.nslogpolicyname = nslogpolicyname;
    }


    /**
     * Gets the nslogpriority value for this Appfwglobal.
     * 
     * @return nslogpriority
     */
    public org.apache.axis.types.UnsignedInt[] getNslogpriority() {
        return nslogpriority;
    }


    /**
     * Sets the nslogpriority value for this Appfwglobal.
     * 
     * @param nslogpriority
     */
    public void setNslogpriority(org.apache.axis.types.UnsignedInt[] nslogpriority) {
        this.nslogpriority = nslogpriority;
    }


    /**
     * Gets the nslogpolicystate value for this Appfwglobal.
     * 
     * @return nslogpolicystate
     */
    public java.lang.String[] getNslogpolicystate() {
        return nslogpolicystate;
    }


    /**
     * Sets the nslogpolicystate value for this Appfwglobal.
     * 
     * @param nslogpolicystate
     */
    public void setNslogpolicystate(java.lang.String[] nslogpolicystate) {
        this.nslogpolicystate = nslogpolicystate;
    }


    /**
     * Gets the nslogbindpolicytype value for this Appfwglobal.
     * 
     * @return nslogbindpolicytype
     */
    public org.apache.axis.types.UnsignedInt[] getNslogbindpolicytype() {
        return nslogbindpolicytype;
    }


    /**
     * Sets the nslogbindpolicytype value for this Appfwglobal.
     * 
     * @param nslogbindpolicytype
     */
    public void setNslogbindpolicytype(org.apache.axis.types.UnsignedInt[] nslogbindpolicytype) {
        this.nslogbindpolicytype = nslogbindpolicytype;
    }


    /**
     * Gets the nslogpolicyflag value for this Appfwglobal.
     * 
     * @return nslogpolicyflag
     */
    public org.apache.axis.types.UnsignedInt[] getNslogpolicyflag() {
        return nslogpolicyflag;
    }


    /**
     * Sets the nslogpolicyflag value for this Appfwglobal.
     * 
     * @param nslogpolicyflag
     */
    public void setNslogpolicyflag(org.apache.axis.types.UnsignedInt[] nslogpolicyflag) {
        this.nslogpolicyflag = nslogpolicyflag;
    }


    /**
     * Gets the nslogpolicybindflags value for this Appfwglobal.
     * 
     * @return nslogpolicybindflags
     */
    public org.apache.axis.types.UnsignedInt[] getNslogpolicybindflags() {
        return nslogpolicybindflags;
    }


    /**
     * Sets the nslogpolicybindflags value for this Appfwglobal.
     * 
     * @param nslogpolicybindflags
     */
    public void setNslogpolicybindflags(org.apache.axis.types.UnsignedInt[] nslogpolicybindflags) {
        this.nslogpolicybindflags = nslogpolicybindflags;
    }


    /**
     * Gets the nslogbindpoint value for this Appfwglobal.
     * 
     * @return nslogbindpoint
     */
    public java.lang.String[] getNslogbindpoint() {
        return nslogbindpoint;
    }


    /**
     * Sets the nslogbindpoint value for this Appfwglobal.
     * 
     * @param nslogbindpoint
     */
    public void setNslogbindpoint(java.lang.String[] nslogbindpoint) {
        this.nslogbindpoint = nslogbindpoint;
    }


    /**
     * Gets the syslogpolicyname value for this Appfwglobal.
     * 
     * @return syslogpolicyname
     */
    public java.lang.String[] getSyslogpolicyname() {
        return syslogpolicyname;
    }


    /**
     * Sets the syslogpolicyname value for this Appfwglobal.
     * 
     * @param syslogpolicyname
     */
    public void setSyslogpolicyname(java.lang.String[] syslogpolicyname) {
        this.syslogpolicyname = syslogpolicyname;
    }


    /**
     * Gets the syslogpriority value for this Appfwglobal.
     * 
     * @return syslogpriority
     */
    public org.apache.axis.types.UnsignedInt[] getSyslogpriority() {
        return syslogpriority;
    }


    /**
     * Sets the syslogpriority value for this Appfwglobal.
     * 
     * @param syslogpriority
     */
    public void setSyslogpriority(org.apache.axis.types.UnsignedInt[] syslogpriority) {
        this.syslogpriority = syslogpriority;
    }


    /**
     * Gets the syslogpolicystate value for this Appfwglobal.
     * 
     * @return syslogpolicystate
     */
    public java.lang.String[] getSyslogpolicystate() {
        return syslogpolicystate;
    }


    /**
     * Sets the syslogpolicystate value for this Appfwglobal.
     * 
     * @param syslogpolicystate
     */
    public void setSyslogpolicystate(java.lang.String[] syslogpolicystate) {
        this.syslogpolicystate = syslogpolicystate;
    }


    /**
     * Gets the syslogbindpolicytype value for this Appfwglobal.
     * 
     * @return syslogbindpolicytype
     */
    public org.apache.axis.types.UnsignedInt[] getSyslogbindpolicytype() {
        return syslogbindpolicytype;
    }


    /**
     * Sets the syslogbindpolicytype value for this Appfwglobal.
     * 
     * @param syslogbindpolicytype
     */
    public void setSyslogbindpolicytype(org.apache.axis.types.UnsignedInt[] syslogbindpolicytype) {
        this.syslogbindpolicytype = syslogbindpolicytype;
    }


    /**
     * Gets the syslogpolicyflag value for this Appfwglobal.
     * 
     * @return syslogpolicyflag
     */
    public org.apache.axis.types.UnsignedInt[] getSyslogpolicyflag() {
        return syslogpolicyflag;
    }


    /**
     * Sets the syslogpolicyflag value for this Appfwglobal.
     * 
     * @param syslogpolicyflag
     */
    public void setSyslogpolicyflag(org.apache.axis.types.UnsignedInt[] syslogpolicyflag) {
        this.syslogpolicyflag = syslogpolicyflag;
    }


    /**
     * Gets the syslogpolicybindflags value for this Appfwglobal.
     * 
     * @return syslogpolicybindflags
     */
    public org.apache.axis.types.UnsignedInt[] getSyslogpolicybindflags() {
        return syslogpolicybindflags;
    }


    /**
     * Sets the syslogpolicybindflags value for this Appfwglobal.
     * 
     * @param syslogpolicybindflags
     */
    public void setSyslogpolicybindflags(org.apache.axis.types.UnsignedInt[] syslogpolicybindflags) {
        this.syslogpolicybindflags = syslogpolicybindflags;
    }


    /**
     * Gets the syslogbindpoint value for this Appfwglobal.
     * 
     * @return syslogbindpoint
     */
    public java.lang.String[] getSyslogbindpoint() {
        return syslogbindpoint;
    }


    /**
     * Sets the syslogbindpoint value for this Appfwglobal.
     * 
     * @param syslogbindpoint
     */
    public void setSyslogbindpoint(java.lang.String[] syslogbindpoint) {
        this.syslogbindpoint = syslogbindpoint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Appfwglobal)) return false;
        Appfwglobal other = (Appfwglobal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.policyname==null && other.getPolicyname()==null) || 
             (this.policyname!=null &&
              this.policyname.equals(other.getPolicyname()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.gotopriorityexpression==null && other.getGotopriorityexpression()==null) || 
             (this.gotopriorityexpression!=null &&
              this.gotopriorityexpression.equals(other.getGotopriorityexpression()))) &&
            this.invoke == other.isInvoke() &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.labeltype==null && other.getLabeltype()==null) || 
             (this.labeltype!=null &&
              this.labeltype.equals(other.getLabeltype()))) &&
            ((this.labelname==null && other.getLabelname()==null) || 
             (this.labelname!=null &&
              this.labelname.equals(other.getLabelname()))) &&
            ((this.flowtype==null && other.getFlowtype()==null) || 
             (this.flowtype!=null &&
              this.flowtype.equals(other.getFlowtype()))) &&
            ((this.numpol==null && other.getNumpol()==null) || 
             (this.numpol!=null &&
              this.numpol.equals(other.getNumpol()))) &&
            ((this.policytype==null && other.getPolicytype()==null) || 
             (this.policytype!=null &&
              java.util.Arrays.equals(this.policytype, other.getPolicytype()))) &&
            ((this.appfwpolicyname==null && other.getAppfwpolicyname()==null) || 
             (this.appfwpolicyname!=null &&
              java.util.Arrays.equals(this.appfwpolicyname, other.getAppfwpolicyname()))) &&
            ((this.appfwpriority==null && other.getAppfwpriority()==null) || 
             (this.appfwpriority!=null &&
              java.util.Arrays.equals(this.appfwpriority, other.getAppfwpriority()))) &&
            ((this.appfwpolicygotoprioexpression==null && other.getAppfwpolicygotoprioexpression()==null) || 
             (this.appfwpolicygotoprioexpression!=null &&
              java.util.Arrays.equals(this.appfwpolicygotoprioexpression, other.getAppfwpolicygotoprioexpression()))) &&
            ((this.appfwinvoke==null && other.getAppfwinvoke()==null) || 
             (this.appfwinvoke!=null &&
              java.util.Arrays.equals(this.appfwinvoke, other.getAppfwinvoke()))) &&
            ((this.appfwpolicystate==null && other.getAppfwpolicystate()==null) || 
             (this.appfwpolicystate!=null &&
              java.util.Arrays.equals(this.appfwpolicystate, other.getAppfwpolicystate()))) &&
            ((this.appfwbindpolicytype==null && other.getAppfwbindpolicytype()==null) || 
             (this.appfwbindpolicytype!=null &&
              java.util.Arrays.equals(this.appfwbindpolicytype, other.getAppfwbindpolicytype()))) &&
            ((this.appfwpolicyinvokelabeltype==null && other.getAppfwpolicyinvokelabeltype()==null) || 
             (this.appfwpolicyinvokelabeltype!=null &&
              java.util.Arrays.equals(this.appfwpolicyinvokelabeltype, other.getAppfwpolicyinvokelabeltype()))) &&
            ((this.appfwpolicyinvokelabelname==null && other.getAppfwpolicyinvokelabelname()==null) || 
             (this.appfwpolicyinvokelabelname!=null &&
              java.util.Arrays.equals(this.appfwpolicyinvokelabelname, other.getAppfwpolicyinvokelabelname()))) &&
            ((this.appfwpolicynumpol==null && other.getAppfwpolicynumpol()==null) || 
             (this.appfwpolicynumpol!=null &&
              java.util.Arrays.equals(this.appfwpolicynumpol, other.getAppfwpolicynumpol()))) &&
            ((this.appfwpolicyflowtype==null && other.getAppfwpolicyflowtype()==null) || 
             (this.appfwpolicyflowtype!=null &&
              java.util.Arrays.equals(this.appfwpolicyflowtype, other.getAppfwpolicyflowtype()))) &&
            ((this.appfwpolicyflag==null && other.getAppfwpolicyflag()==null) || 
             (this.appfwpolicyflag!=null &&
              java.util.Arrays.equals(this.appfwpolicyflag, other.getAppfwpolicyflag()))) &&
            ((this.appfwpolicybindflags==null && other.getAppfwpolicybindflags()==null) || 
             (this.appfwpolicybindflags!=null &&
              java.util.Arrays.equals(this.appfwpolicybindflags, other.getAppfwpolicybindflags()))) &&
            ((this.appfwbindpoint==null && other.getAppfwbindpoint()==null) || 
             (this.appfwbindpoint!=null &&
              java.util.Arrays.equals(this.appfwbindpoint, other.getAppfwbindpoint()))) &&
            ((this.nslogpolicyname==null && other.getNslogpolicyname()==null) || 
             (this.nslogpolicyname!=null &&
              java.util.Arrays.equals(this.nslogpolicyname, other.getNslogpolicyname()))) &&
            ((this.nslogpriority==null && other.getNslogpriority()==null) || 
             (this.nslogpriority!=null &&
              java.util.Arrays.equals(this.nslogpriority, other.getNslogpriority()))) &&
            ((this.nslogpolicystate==null && other.getNslogpolicystate()==null) || 
             (this.nslogpolicystate!=null &&
              java.util.Arrays.equals(this.nslogpolicystate, other.getNslogpolicystate()))) &&
            ((this.nslogbindpolicytype==null && other.getNslogbindpolicytype()==null) || 
             (this.nslogbindpolicytype!=null &&
              java.util.Arrays.equals(this.nslogbindpolicytype, other.getNslogbindpolicytype()))) &&
            ((this.nslogpolicyflag==null && other.getNslogpolicyflag()==null) || 
             (this.nslogpolicyflag!=null &&
              java.util.Arrays.equals(this.nslogpolicyflag, other.getNslogpolicyflag()))) &&
            ((this.nslogpolicybindflags==null && other.getNslogpolicybindflags()==null) || 
             (this.nslogpolicybindflags!=null &&
              java.util.Arrays.equals(this.nslogpolicybindflags, other.getNslogpolicybindflags()))) &&
            ((this.nslogbindpoint==null && other.getNslogbindpoint()==null) || 
             (this.nslogbindpoint!=null &&
              java.util.Arrays.equals(this.nslogbindpoint, other.getNslogbindpoint()))) &&
            ((this.syslogpolicyname==null && other.getSyslogpolicyname()==null) || 
             (this.syslogpolicyname!=null &&
              java.util.Arrays.equals(this.syslogpolicyname, other.getSyslogpolicyname()))) &&
            ((this.syslogpriority==null && other.getSyslogpriority()==null) || 
             (this.syslogpriority!=null &&
              java.util.Arrays.equals(this.syslogpriority, other.getSyslogpriority()))) &&
            ((this.syslogpolicystate==null && other.getSyslogpolicystate()==null) || 
             (this.syslogpolicystate!=null &&
              java.util.Arrays.equals(this.syslogpolicystate, other.getSyslogpolicystate()))) &&
            ((this.syslogbindpolicytype==null && other.getSyslogbindpolicytype()==null) || 
             (this.syslogbindpolicytype!=null &&
              java.util.Arrays.equals(this.syslogbindpolicytype, other.getSyslogbindpolicytype()))) &&
            ((this.syslogpolicyflag==null && other.getSyslogpolicyflag()==null) || 
             (this.syslogpolicyflag!=null &&
              java.util.Arrays.equals(this.syslogpolicyflag, other.getSyslogpolicyflag()))) &&
            ((this.syslogpolicybindflags==null && other.getSyslogpolicybindflags()==null) || 
             (this.syslogpolicybindflags!=null &&
              java.util.Arrays.equals(this.syslogpolicybindflags, other.getSyslogpolicybindflags()))) &&
            ((this.syslogbindpoint==null && other.getSyslogbindpoint()==null) || 
             (this.syslogbindpoint!=null &&
              java.util.Arrays.equals(this.syslogbindpoint, other.getSyslogbindpoint())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getPolicyname() != null) {
            _hashCode += getPolicyname().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getGotopriorityexpression() != null) {
            _hashCode += getGotopriorityexpression().hashCode();
        }
        _hashCode += (isInvoke() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getLabeltype() != null) {
            _hashCode += getLabeltype().hashCode();
        }
        if (getLabelname() != null) {
            _hashCode += getLabelname().hashCode();
        }
        if (getFlowtype() != null) {
            _hashCode += getFlowtype().hashCode();
        }
        if (getNumpol() != null) {
            _hashCode += getNumpol().hashCode();
        }
        if (getPolicytype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolicytype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolicytype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppfwpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppfwpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppfwpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppfwpriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppfwpriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppfwpriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppfwpolicygotoprioexpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppfwpolicygotoprioexpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppfwpolicygotoprioexpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppfwinvoke() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppfwinvoke());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppfwinvoke(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppfwpolicystate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppfwpolicystate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppfwpolicystate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppfwbindpolicytype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppfwbindpolicytype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppfwbindpolicytype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppfwpolicyinvokelabeltype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppfwpolicyinvokelabeltype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppfwpolicyinvokelabeltype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppfwpolicyinvokelabelname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppfwpolicyinvokelabelname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppfwpolicyinvokelabelname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppfwpolicynumpol() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppfwpolicynumpol());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppfwpolicynumpol(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppfwpolicyflowtype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppfwpolicyflowtype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppfwpolicyflowtype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppfwpolicyflag() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppfwpolicyflag());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppfwpolicyflag(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppfwpolicybindflags() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppfwpolicybindflags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppfwpolicybindflags(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppfwbindpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppfwbindpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppfwbindpoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNslogpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNslogpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNslogpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNslogpriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNslogpriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNslogpriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNslogpolicystate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNslogpolicystate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNslogpolicystate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNslogbindpolicytype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNslogbindpolicytype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNslogbindpolicytype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNslogpolicyflag() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNslogpolicyflag());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNslogpolicyflag(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNslogpolicybindflags() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNslogpolicybindflags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNslogpolicybindflags(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNslogbindpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNslogbindpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNslogbindpoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSyslogpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSyslogpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSyslogpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSyslogpriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSyslogpriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSyslogpriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSyslogpolicystate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSyslogpolicystate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSyslogpolicystate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSyslogbindpolicytype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSyslogbindpolicytype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSyslogbindpolicytype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSyslogpolicyflag() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSyslogpolicyflag());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSyslogpolicyflag(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSyslogpolicybindflags() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSyslogpolicybindflags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSyslogpolicybindflags(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSyslogbindpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSyslogbindpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSyslogbindpoint(), i);
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
        new org.apache.axis.description.TypeDesc(Appfwglobal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "appfwglobal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gotopriorityexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gotopriorityexpression"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
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
        elemField.setFieldName("labelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "labelname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flowtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flowtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numpol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numpol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policytype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policytype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appfwpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appfwpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appfwpriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appfwpriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appfwpolicygotoprioexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appfwpolicygotoprioexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appfwinvoke");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appfwinvoke"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appfwpolicystate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appfwpolicystate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appfwbindpolicytype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appfwbindpolicytype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appfwpolicyinvokelabeltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appfwpolicyinvokelabeltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appfwpolicyinvokelabelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appfwpolicyinvokelabelname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appfwpolicynumpol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appfwpolicynumpol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appfwpolicyflowtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appfwpolicyflowtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appfwpolicyflag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appfwpolicyflag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appfwpolicybindflags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appfwpolicybindflags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appfwbindpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appfwbindpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nslogpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nslogpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nslogpriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nslogpriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nslogpolicystate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nslogpolicystate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nslogbindpolicytype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nslogbindpolicytype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nslogpolicyflag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nslogpolicyflag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nslogpolicybindflags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nslogpolicybindflags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nslogbindpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nslogbindpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syslogpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "syslogpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syslogpriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "syslogpriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syslogpolicystate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "syslogpolicystate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syslogbindpolicytype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "syslogbindpolicytype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syslogpolicyflag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "syslogpolicyflag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syslogpolicybindflags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "syslogpolicybindflags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syslogbindpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "syslogbindpoint"));
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
