/**
 * Cacheglobal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Cacheglobal  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String policyname;

    private java.lang.String policy;

    private org.apache.axis.types.UnsignedInt priority;

    private java.lang.String gotopriorityexpression;

    private boolean invoke;

    private java.lang.String labeltype;

    private java.lang.String labelname;

    private org.apache.axis.types.UnsignedInt numpol;

    private org.apache.axis.types.UnsignedInt flowtype;

    private java.lang.String rule;

    private java.lang.String actioN;

    private java.lang.String storeingroup;

    private java.lang.String[] invalgroups;

    private java.lang.String[] invalobjects;

    private org.apache.axis.types.UnsignedInt hits;

    private org.apache.axis.types.UnsignedInt flags;

    private java.lang.String precededefrules;

    private java.lang.String[] cachepolicyname;

    private java.lang.String[] cachepolicybindpoint;

    private org.apache.axis.types.UnsignedInt[] cachepolicypriority;

    private java.lang.String[] cachepolicygotoprioexpression;

    private boolean[] cacheinvoke;

    private java.lang.String[] cachepolicyinvokelabeltype;

    private java.lang.String[] cachepolicyinvokelabelname;

    private org.apache.axis.types.UnsignedInt[] cachepolicynumpol;

    private org.apache.axis.types.UnsignedInt[] cachepolicyflowtype;

    private org.apache.axis.types.UnsignedInt[] cachepolicyflags;

    public Cacheglobal() {
    }

    public Cacheglobal(
           java.lang.String type,
           java.lang.String policyname,
           java.lang.String policy,
           org.apache.axis.types.UnsignedInt priority,
           java.lang.String gotopriorityexpression,
           boolean invoke,
           java.lang.String labeltype,
           java.lang.String labelname,
           org.apache.axis.types.UnsignedInt numpol,
           org.apache.axis.types.UnsignedInt flowtype,
           java.lang.String rule,
           java.lang.String actioN,
           java.lang.String storeingroup,
           java.lang.String[] invalgroups,
           java.lang.String[] invalobjects,
           org.apache.axis.types.UnsignedInt hits,
           org.apache.axis.types.UnsignedInt flags,
           java.lang.String precededefrules,
           java.lang.String[] cachepolicyname,
           java.lang.String[] cachepolicybindpoint,
           org.apache.axis.types.UnsignedInt[] cachepolicypriority,
           java.lang.String[] cachepolicygotoprioexpression,
           boolean[] cacheinvoke,
           java.lang.String[] cachepolicyinvokelabeltype,
           java.lang.String[] cachepolicyinvokelabelname,
           org.apache.axis.types.UnsignedInt[] cachepolicynumpol,
           org.apache.axis.types.UnsignedInt[] cachepolicyflowtype,
           org.apache.axis.types.UnsignedInt[] cachepolicyflags) {
           this.type = type;
           this.policyname = policyname;
           this.policy = policy;
           this.priority = priority;
           this.gotopriorityexpression = gotopriorityexpression;
           this.invoke = invoke;
           this.labeltype = labeltype;
           this.labelname = labelname;
           this.numpol = numpol;
           this.flowtype = flowtype;
           this.rule = rule;
           this.actioN = actioN;
           this.storeingroup = storeingroup;
           this.invalgroups = invalgroups;
           this.invalobjects = invalobjects;
           this.hits = hits;
           this.flags = flags;
           this.precededefrules = precededefrules;
           this.cachepolicyname = cachepolicyname;
           this.cachepolicybindpoint = cachepolicybindpoint;
           this.cachepolicypriority = cachepolicypriority;
           this.cachepolicygotoprioexpression = cachepolicygotoprioexpression;
           this.cacheinvoke = cacheinvoke;
           this.cachepolicyinvokelabeltype = cachepolicyinvokelabeltype;
           this.cachepolicyinvokelabelname = cachepolicyinvokelabelname;
           this.cachepolicynumpol = cachepolicynumpol;
           this.cachepolicyflowtype = cachepolicyflowtype;
           this.cachepolicyflags = cachepolicyflags;
    }


    /**
     * Gets the type value for this Cacheglobal.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Cacheglobal.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the policyname value for this Cacheglobal.
     * 
     * @return policyname
     */
    public java.lang.String getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Cacheglobal.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the policy value for this Cacheglobal.
     * 
     * @return policy
     */
    public java.lang.String getPolicy() {
        return policy;
    }


    /**
     * Sets the policy value for this Cacheglobal.
     * 
     * @param policy
     */
    public void setPolicy(java.lang.String policy) {
        this.policy = policy;
    }


    /**
     * Gets the priority value for this Cacheglobal.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Cacheglobal.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the gotopriorityexpression value for this Cacheglobal.
     * 
     * @return gotopriorityexpression
     */
    public java.lang.String getGotopriorityexpression() {
        return gotopriorityexpression;
    }


    /**
     * Sets the gotopriorityexpression value for this Cacheglobal.
     * 
     * @param gotopriorityexpression
     */
    public void setGotopriorityexpression(java.lang.String gotopriorityexpression) {
        this.gotopriorityexpression = gotopriorityexpression;
    }


    /**
     * Gets the invoke value for this Cacheglobal.
     * 
     * @return invoke
     */
    public boolean isInvoke() {
        return invoke;
    }


    /**
     * Sets the invoke value for this Cacheglobal.
     * 
     * @param invoke
     */
    public void setInvoke(boolean invoke) {
        this.invoke = invoke;
    }


    /**
     * Gets the labeltype value for this Cacheglobal.
     * 
     * @return labeltype
     */
    public java.lang.String getLabeltype() {
        return labeltype;
    }


    /**
     * Sets the labeltype value for this Cacheglobal.
     * 
     * @param labeltype
     */
    public void setLabeltype(java.lang.String labeltype) {
        this.labeltype = labeltype;
    }


    /**
     * Gets the labelname value for this Cacheglobal.
     * 
     * @return labelname
     */
    public java.lang.String getLabelname() {
        return labelname;
    }


    /**
     * Sets the labelname value for this Cacheglobal.
     * 
     * @param labelname
     */
    public void setLabelname(java.lang.String labelname) {
        this.labelname = labelname;
    }


    /**
     * Gets the numpol value for this Cacheglobal.
     * 
     * @return numpol
     */
    public org.apache.axis.types.UnsignedInt getNumpol() {
        return numpol;
    }


    /**
     * Sets the numpol value for this Cacheglobal.
     * 
     * @param numpol
     */
    public void setNumpol(org.apache.axis.types.UnsignedInt numpol) {
        this.numpol = numpol;
    }


    /**
     * Gets the flowtype value for this Cacheglobal.
     * 
     * @return flowtype
     */
    public org.apache.axis.types.UnsignedInt getFlowtype() {
        return flowtype;
    }


    /**
     * Sets the flowtype value for this Cacheglobal.
     * 
     * @param flowtype
     */
    public void setFlowtype(org.apache.axis.types.UnsignedInt flowtype) {
        this.flowtype = flowtype;
    }


    /**
     * Gets the rule value for this Cacheglobal.
     * 
     * @return rule
     */
    public java.lang.String getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this Cacheglobal.
     * 
     * @param rule
     */
    public void setRule(java.lang.String rule) {
        this.rule = rule;
    }


    /**
     * Gets the actioN value for this Cacheglobal.
     * 
     * @return actioN
     */
    public java.lang.String getActioN() {
        return actioN;
    }


    /**
     * Sets the actioN value for this Cacheglobal.
     * 
     * @param actioN
     */
    public void setActioN(java.lang.String actioN) {
        this.actioN = actioN;
    }


    /**
     * Gets the storeingroup value for this Cacheglobal.
     * 
     * @return storeingroup
     */
    public java.lang.String getStoreingroup() {
        return storeingroup;
    }


    /**
     * Sets the storeingroup value for this Cacheglobal.
     * 
     * @param storeingroup
     */
    public void setStoreingroup(java.lang.String storeingroup) {
        this.storeingroup = storeingroup;
    }


    /**
     * Gets the invalgroups value for this Cacheglobal.
     * 
     * @return invalgroups
     */
    public java.lang.String[] getInvalgroups() {
        return invalgroups;
    }


    /**
     * Sets the invalgroups value for this Cacheglobal.
     * 
     * @param invalgroups
     */
    public void setInvalgroups(java.lang.String[] invalgroups) {
        this.invalgroups = invalgroups;
    }


    /**
     * Gets the invalobjects value for this Cacheglobal.
     * 
     * @return invalobjects
     */
    public java.lang.String[] getInvalobjects() {
        return invalobjects;
    }


    /**
     * Sets the invalobjects value for this Cacheglobal.
     * 
     * @param invalobjects
     */
    public void setInvalobjects(java.lang.String[] invalobjects) {
        this.invalobjects = invalobjects;
    }


    /**
     * Gets the hits value for this Cacheglobal.
     * 
     * @return hits
     */
    public org.apache.axis.types.UnsignedInt getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this Cacheglobal.
     * 
     * @param hits
     */
    public void setHits(org.apache.axis.types.UnsignedInt hits) {
        this.hits = hits;
    }


    /**
     * Gets the flags value for this Cacheglobal.
     * 
     * @return flags
     */
    public org.apache.axis.types.UnsignedInt getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this Cacheglobal.
     * 
     * @param flags
     */
    public void setFlags(org.apache.axis.types.UnsignedInt flags) {
        this.flags = flags;
    }


    /**
     * Gets the precededefrules value for this Cacheglobal.
     * 
     * @return precededefrules
     */
    public java.lang.String getPrecededefrules() {
        return precededefrules;
    }


    /**
     * Sets the precededefrules value for this Cacheglobal.
     * 
     * @param precededefrules
     */
    public void setPrecededefrules(java.lang.String precededefrules) {
        this.precededefrules = precededefrules;
    }


    /**
     * Gets the cachepolicyname value for this Cacheglobal.
     * 
     * @return cachepolicyname
     */
    public java.lang.String[] getCachepolicyname() {
        return cachepolicyname;
    }


    /**
     * Sets the cachepolicyname value for this Cacheglobal.
     * 
     * @param cachepolicyname
     */
    public void setCachepolicyname(java.lang.String[] cachepolicyname) {
        this.cachepolicyname = cachepolicyname;
    }


    /**
     * Gets the cachepolicybindpoint value for this Cacheglobal.
     * 
     * @return cachepolicybindpoint
     */
    public java.lang.String[] getCachepolicybindpoint() {
        return cachepolicybindpoint;
    }


    /**
     * Sets the cachepolicybindpoint value for this Cacheglobal.
     * 
     * @param cachepolicybindpoint
     */
    public void setCachepolicybindpoint(java.lang.String[] cachepolicybindpoint) {
        this.cachepolicybindpoint = cachepolicybindpoint;
    }


    /**
     * Gets the cachepolicypriority value for this Cacheglobal.
     * 
     * @return cachepolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getCachepolicypriority() {
        return cachepolicypriority;
    }


    /**
     * Sets the cachepolicypriority value for this Cacheglobal.
     * 
     * @param cachepolicypriority
     */
    public void setCachepolicypriority(org.apache.axis.types.UnsignedInt[] cachepolicypriority) {
        this.cachepolicypriority = cachepolicypriority;
    }


    /**
     * Gets the cachepolicygotoprioexpression value for this Cacheglobal.
     * 
     * @return cachepolicygotoprioexpression
     */
    public java.lang.String[] getCachepolicygotoprioexpression() {
        return cachepolicygotoprioexpression;
    }


    /**
     * Sets the cachepolicygotoprioexpression value for this Cacheglobal.
     * 
     * @param cachepolicygotoprioexpression
     */
    public void setCachepolicygotoprioexpression(java.lang.String[] cachepolicygotoprioexpression) {
        this.cachepolicygotoprioexpression = cachepolicygotoprioexpression;
    }


    /**
     * Gets the cacheinvoke value for this Cacheglobal.
     * 
     * @return cacheinvoke
     */
    public boolean[] getCacheinvoke() {
        return cacheinvoke;
    }


    /**
     * Sets the cacheinvoke value for this Cacheglobal.
     * 
     * @param cacheinvoke
     */
    public void setCacheinvoke(boolean[] cacheinvoke) {
        this.cacheinvoke = cacheinvoke;
    }


    /**
     * Gets the cachepolicyinvokelabeltype value for this Cacheglobal.
     * 
     * @return cachepolicyinvokelabeltype
     */
    public java.lang.String[] getCachepolicyinvokelabeltype() {
        return cachepolicyinvokelabeltype;
    }


    /**
     * Sets the cachepolicyinvokelabeltype value for this Cacheglobal.
     * 
     * @param cachepolicyinvokelabeltype
     */
    public void setCachepolicyinvokelabeltype(java.lang.String[] cachepolicyinvokelabeltype) {
        this.cachepolicyinvokelabeltype = cachepolicyinvokelabeltype;
    }


    /**
     * Gets the cachepolicyinvokelabelname value for this Cacheglobal.
     * 
     * @return cachepolicyinvokelabelname
     */
    public java.lang.String[] getCachepolicyinvokelabelname() {
        return cachepolicyinvokelabelname;
    }


    /**
     * Sets the cachepolicyinvokelabelname value for this Cacheglobal.
     * 
     * @param cachepolicyinvokelabelname
     */
    public void setCachepolicyinvokelabelname(java.lang.String[] cachepolicyinvokelabelname) {
        this.cachepolicyinvokelabelname = cachepolicyinvokelabelname;
    }


    /**
     * Gets the cachepolicynumpol value for this Cacheglobal.
     * 
     * @return cachepolicynumpol
     */
    public org.apache.axis.types.UnsignedInt[] getCachepolicynumpol() {
        return cachepolicynumpol;
    }


    /**
     * Sets the cachepolicynumpol value for this Cacheglobal.
     * 
     * @param cachepolicynumpol
     */
    public void setCachepolicynumpol(org.apache.axis.types.UnsignedInt[] cachepolicynumpol) {
        this.cachepolicynumpol = cachepolicynumpol;
    }


    /**
     * Gets the cachepolicyflowtype value for this Cacheglobal.
     * 
     * @return cachepolicyflowtype
     */
    public org.apache.axis.types.UnsignedInt[] getCachepolicyflowtype() {
        return cachepolicyflowtype;
    }


    /**
     * Sets the cachepolicyflowtype value for this Cacheglobal.
     * 
     * @param cachepolicyflowtype
     */
    public void setCachepolicyflowtype(org.apache.axis.types.UnsignedInt[] cachepolicyflowtype) {
        this.cachepolicyflowtype = cachepolicyflowtype;
    }


    /**
     * Gets the cachepolicyflags value for this Cacheglobal.
     * 
     * @return cachepolicyflags
     */
    public org.apache.axis.types.UnsignedInt[] getCachepolicyflags() {
        return cachepolicyflags;
    }


    /**
     * Sets the cachepolicyflags value for this Cacheglobal.
     * 
     * @param cachepolicyflags
     */
    public void setCachepolicyflags(org.apache.axis.types.UnsignedInt[] cachepolicyflags) {
        this.cachepolicyflags = cachepolicyflags;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cacheglobal)) return false;
        Cacheglobal other = (Cacheglobal) obj;
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
            ((this.policy==null && other.getPolicy()==null) || 
             (this.policy!=null &&
              this.policy.equals(other.getPolicy()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.gotopriorityexpression==null && other.getGotopriorityexpression()==null) || 
             (this.gotopriorityexpression!=null &&
              this.gotopriorityexpression.equals(other.getGotopriorityexpression()))) &&
            this.invoke == other.isInvoke() &&
            ((this.labeltype==null && other.getLabeltype()==null) || 
             (this.labeltype!=null &&
              this.labeltype.equals(other.getLabeltype()))) &&
            ((this.labelname==null && other.getLabelname()==null) || 
             (this.labelname!=null &&
              this.labelname.equals(other.getLabelname()))) &&
            ((this.numpol==null && other.getNumpol()==null) || 
             (this.numpol!=null &&
              this.numpol.equals(other.getNumpol()))) &&
            ((this.flowtype==null && other.getFlowtype()==null) || 
             (this.flowtype!=null &&
              this.flowtype.equals(other.getFlowtype()))) &&
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              this.rule.equals(other.getRule()))) &&
            ((this.actioN==null && other.getActioN()==null) || 
             (this.actioN!=null &&
              this.actioN.equals(other.getActioN()))) &&
            ((this.storeingroup==null && other.getStoreingroup()==null) || 
             (this.storeingroup!=null &&
              this.storeingroup.equals(other.getStoreingroup()))) &&
            ((this.invalgroups==null && other.getInvalgroups()==null) || 
             (this.invalgroups!=null &&
              java.util.Arrays.equals(this.invalgroups, other.getInvalgroups()))) &&
            ((this.invalobjects==null && other.getInvalobjects()==null) || 
             (this.invalobjects!=null &&
              java.util.Arrays.equals(this.invalobjects, other.getInvalobjects()))) &&
            ((this.hits==null && other.getHits()==null) || 
             (this.hits!=null &&
              this.hits.equals(other.getHits()))) &&
            ((this.flags==null && other.getFlags()==null) || 
             (this.flags!=null &&
              this.flags.equals(other.getFlags()))) &&
            ((this.precededefrules==null && other.getPrecededefrules()==null) || 
             (this.precededefrules!=null &&
              this.precededefrules.equals(other.getPrecededefrules()))) &&
            ((this.cachepolicyname==null && other.getCachepolicyname()==null) || 
             (this.cachepolicyname!=null &&
              java.util.Arrays.equals(this.cachepolicyname, other.getCachepolicyname()))) &&
            ((this.cachepolicybindpoint==null && other.getCachepolicybindpoint()==null) || 
             (this.cachepolicybindpoint!=null &&
              java.util.Arrays.equals(this.cachepolicybindpoint, other.getCachepolicybindpoint()))) &&
            ((this.cachepolicypriority==null && other.getCachepolicypriority()==null) || 
             (this.cachepolicypriority!=null &&
              java.util.Arrays.equals(this.cachepolicypriority, other.getCachepolicypriority()))) &&
            ((this.cachepolicygotoprioexpression==null && other.getCachepolicygotoprioexpression()==null) || 
             (this.cachepolicygotoprioexpression!=null &&
              java.util.Arrays.equals(this.cachepolicygotoprioexpression, other.getCachepolicygotoprioexpression()))) &&
            ((this.cacheinvoke==null && other.getCacheinvoke()==null) || 
             (this.cacheinvoke!=null &&
              java.util.Arrays.equals(this.cacheinvoke, other.getCacheinvoke()))) &&
            ((this.cachepolicyinvokelabeltype==null && other.getCachepolicyinvokelabeltype()==null) || 
             (this.cachepolicyinvokelabeltype!=null &&
              java.util.Arrays.equals(this.cachepolicyinvokelabeltype, other.getCachepolicyinvokelabeltype()))) &&
            ((this.cachepolicyinvokelabelname==null && other.getCachepolicyinvokelabelname()==null) || 
             (this.cachepolicyinvokelabelname!=null &&
              java.util.Arrays.equals(this.cachepolicyinvokelabelname, other.getCachepolicyinvokelabelname()))) &&
            ((this.cachepolicynumpol==null && other.getCachepolicynumpol()==null) || 
             (this.cachepolicynumpol!=null &&
              java.util.Arrays.equals(this.cachepolicynumpol, other.getCachepolicynumpol()))) &&
            ((this.cachepolicyflowtype==null && other.getCachepolicyflowtype()==null) || 
             (this.cachepolicyflowtype!=null &&
              java.util.Arrays.equals(this.cachepolicyflowtype, other.getCachepolicyflowtype()))) &&
            ((this.cachepolicyflags==null && other.getCachepolicyflags()==null) || 
             (this.cachepolicyflags!=null &&
              java.util.Arrays.equals(this.cachepolicyflags, other.getCachepolicyflags())));
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
        if (getPolicy() != null) {
            _hashCode += getPolicy().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getGotopriorityexpression() != null) {
            _hashCode += getGotopriorityexpression().hashCode();
        }
        _hashCode += (isInvoke() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLabeltype() != null) {
            _hashCode += getLabeltype().hashCode();
        }
        if (getLabelname() != null) {
            _hashCode += getLabelname().hashCode();
        }
        if (getNumpol() != null) {
            _hashCode += getNumpol().hashCode();
        }
        if (getFlowtype() != null) {
            _hashCode += getFlowtype().hashCode();
        }
        if (getRule() != null) {
            _hashCode += getRule().hashCode();
        }
        if (getActioN() != null) {
            _hashCode += getActioN().hashCode();
        }
        if (getStoreingroup() != null) {
            _hashCode += getStoreingroup().hashCode();
        }
        if (getInvalgroups() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvalgroups());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvalgroups(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInvalobjects() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvalobjects());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvalobjects(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHits() != null) {
            _hashCode += getHits().hashCode();
        }
        if (getFlags() != null) {
            _hashCode += getFlags().hashCode();
        }
        if (getPrecededefrules() != null) {
            _hashCode += getPrecededefrules().hashCode();
        }
        if (getCachepolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCachepolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCachepolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCachepolicybindpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCachepolicybindpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCachepolicybindpoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCachepolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCachepolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCachepolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCachepolicygotoprioexpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCachepolicygotoprioexpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCachepolicygotoprioexpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCacheinvoke() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCacheinvoke());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCacheinvoke(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCachepolicyinvokelabeltype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCachepolicyinvokelabeltype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCachepolicyinvokelabeltype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCachepolicyinvokelabelname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCachepolicyinvokelabelname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCachepolicyinvokelabelname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCachepolicynumpol() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCachepolicynumpol());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCachepolicynumpol(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCachepolicyflowtype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCachepolicyflowtype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCachepolicyflowtype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCachepolicyflags() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCachepolicyflags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCachepolicyflags(), i);
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
        new org.apache.axis.description.TypeDesc(Cacheglobal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "cacheglobal"));
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
        elemField.setFieldName("policy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policy"));
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
        elemField.setFieldName("numpol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numpol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flowtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flowtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rule"));
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
        elemField.setFieldName("storeingroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "storeingroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invalgroups");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invalgroups"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invalobjects");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invalobjects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precededefrules");
        elemField.setXmlName(new javax.xml.namespace.QName("", "precededefrules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachepolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachepolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachepolicybindpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachepolicybindpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachepolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachepolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachepolicygotoprioexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachepolicygotoprioexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheinvoke");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cacheinvoke"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachepolicyinvokelabeltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachepolicyinvokelabeltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachepolicyinvokelabelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachepolicyinvokelabelname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachepolicynumpol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachepolicynumpol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachepolicyflowtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachepolicyflowtype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachepolicyflags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachepolicyflags"));
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
