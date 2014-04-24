/**
 * Dnsglobal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Dnsglobal  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String policyname;

    private org.apache.axis.types.UnsignedInt priority;

    private java.lang.String gotopriorityexpression;

    private boolean invoke;

    private java.lang.String labeltype;

    private java.lang.String labelname;

    private org.apache.axis.types.UnsignedInt numpol;

    private org.apache.axis.types.UnsignedInt flowtype;

    private org.apache.axis.types.UnsignedInt upgraded;

    private java.lang.String builtin;

    private java.lang.String[] dnspolicyname;

    private java.lang.String[] dnspolicybindpoint;

    private org.apache.axis.types.UnsignedInt[] dnspolicypriority;

    private java.lang.String[] dnspolicygotoprioexpr;

    private boolean[] dnsinvoke;

    private java.lang.String[] dnspolicyinvokelabeltype;

    private java.lang.String[] dnspolicyinvokelabelname;

    private org.apache.axis.types.UnsignedInt[] dnspolicynumpol;

    private org.apache.axis.types.UnsignedInt[] dnspolicyflowtype;

    public Dnsglobal() {
    }

    public Dnsglobal(
           java.lang.String type,
           java.lang.String policyname,
           org.apache.axis.types.UnsignedInt priority,
           java.lang.String gotopriorityexpression,
           boolean invoke,
           java.lang.String labeltype,
           java.lang.String labelname,
           org.apache.axis.types.UnsignedInt numpol,
           org.apache.axis.types.UnsignedInt flowtype,
           org.apache.axis.types.UnsignedInt upgraded,
           java.lang.String builtin,
           java.lang.String[] dnspolicyname,
           java.lang.String[] dnspolicybindpoint,
           org.apache.axis.types.UnsignedInt[] dnspolicypriority,
           java.lang.String[] dnspolicygotoprioexpr,
           boolean[] dnsinvoke,
           java.lang.String[] dnspolicyinvokelabeltype,
           java.lang.String[] dnspolicyinvokelabelname,
           org.apache.axis.types.UnsignedInt[] dnspolicynumpol,
           org.apache.axis.types.UnsignedInt[] dnspolicyflowtype) {
           this.type = type;
           this.policyname = policyname;
           this.priority = priority;
           this.gotopriorityexpression = gotopriorityexpression;
           this.invoke = invoke;
           this.labeltype = labeltype;
           this.labelname = labelname;
           this.numpol = numpol;
           this.flowtype = flowtype;
           this.upgraded = upgraded;
           this.builtin = builtin;
           this.dnspolicyname = dnspolicyname;
           this.dnspolicybindpoint = dnspolicybindpoint;
           this.dnspolicypriority = dnspolicypriority;
           this.dnspolicygotoprioexpr = dnspolicygotoprioexpr;
           this.dnsinvoke = dnsinvoke;
           this.dnspolicyinvokelabeltype = dnspolicyinvokelabeltype;
           this.dnspolicyinvokelabelname = dnspolicyinvokelabelname;
           this.dnspolicynumpol = dnspolicynumpol;
           this.dnspolicyflowtype = dnspolicyflowtype;
    }


    /**
     * Gets the type value for this Dnsglobal.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Dnsglobal.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the policyname value for this Dnsglobal.
     * 
     * @return policyname
     */
    public java.lang.String getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Dnsglobal.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the priority value for this Dnsglobal.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Dnsglobal.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the gotopriorityexpression value for this Dnsglobal.
     * 
     * @return gotopriorityexpression
     */
    public java.lang.String getGotopriorityexpression() {
        return gotopriorityexpression;
    }


    /**
     * Sets the gotopriorityexpression value for this Dnsglobal.
     * 
     * @param gotopriorityexpression
     */
    public void setGotopriorityexpression(java.lang.String gotopriorityexpression) {
        this.gotopriorityexpression = gotopriorityexpression;
    }


    /**
     * Gets the invoke value for this Dnsglobal.
     * 
     * @return invoke
     */
    public boolean isInvoke() {
        return invoke;
    }


    /**
     * Sets the invoke value for this Dnsglobal.
     * 
     * @param invoke
     */
    public void setInvoke(boolean invoke) {
        this.invoke = invoke;
    }


    /**
     * Gets the labeltype value for this Dnsglobal.
     * 
     * @return labeltype
     */
    public java.lang.String getLabeltype() {
        return labeltype;
    }


    /**
     * Sets the labeltype value for this Dnsglobal.
     * 
     * @param labeltype
     */
    public void setLabeltype(java.lang.String labeltype) {
        this.labeltype = labeltype;
    }


    /**
     * Gets the labelname value for this Dnsglobal.
     * 
     * @return labelname
     */
    public java.lang.String getLabelname() {
        return labelname;
    }


    /**
     * Sets the labelname value for this Dnsglobal.
     * 
     * @param labelname
     */
    public void setLabelname(java.lang.String labelname) {
        this.labelname = labelname;
    }


    /**
     * Gets the numpol value for this Dnsglobal.
     * 
     * @return numpol
     */
    public org.apache.axis.types.UnsignedInt getNumpol() {
        return numpol;
    }


    /**
     * Sets the numpol value for this Dnsglobal.
     * 
     * @param numpol
     */
    public void setNumpol(org.apache.axis.types.UnsignedInt numpol) {
        this.numpol = numpol;
    }


    /**
     * Gets the flowtype value for this Dnsglobal.
     * 
     * @return flowtype
     */
    public org.apache.axis.types.UnsignedInt getFlowtype() {
        return flowtype;
    }


    /**
     * Sets the flowtype value for this Dnsglobal.
     * 
     * @param flowtype
     */
    public void setFlowtype(org.apache.axis.types.UnsignedInt flowtype) {
        this.flowtype = flowtype;
    }


    /**
     * Gets the upgraded value for this Dnsglobal.
     * 
     * @return upgraded
     */
    public org.apache.axis.types.UnsignedInt getUpgraded() {
        return upgraded;
    }


    /**
     * Sets the upgraded value for this Dnsglobal.
     * 
     * @param upgraded
     */
    public void setUpgraded(org.apache.axis.types.UnsignedInt upgraded) {
        this.upgraded = upgraded;
    }


    /**
     * Gets the builtin value for this Dnsglobal.
     * 
     * @return builtin
     */
    public java.lang.String getBuiltin() {
        return builtin;
    }


    /**
     * Sets the builtin value for this Dnsglobal.
     * 
     * @param builtin
     */
    public void setBuiltin(java.lang.String builtin) {
        this.builtin = builtin;
    }


    /**
     * Gets the dnspolicyname value for this Dnsglobal.
     * 
     * @return dnspolicyname
     */
    public java.lang.String[] getDnspolicyname() {
        return dnspolicyname;
    }


    /**
     * Sets the dnspolicyname value for this Dnsglobal.
     * 
     * @param dnspolicyname
     */
    public void setDnspolicyname(java.lang.String[] dnspolicyname) {
        this.dnspolicyname = dnspolicyname;
    }


    /**
     * Gets the dnspolicybindpoint value for this Dnsglobal.
     * 
     * @return dnspolicybindpoint
     */
    public java.lang.String[] getDnspolicybindpoint() {
        return dnspolicybindpoint;
    }


    /**
     * Sets the dnspolicybindpoint value for this Dnsglobal.
     * 
     * @param dnspolicybindpoint
     */
    public void setDnspolicybindpoint(java.lang.String[] dnspolicybindpoint) {
        this.dnspolicybindpoint = dnspolicybindpoint;
    }


    /**
     * Gets the dnspolicypriority value for this Dnsglobal.
     * 
     * @return dnspolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getDnspolicypriority() {
        return dnspolicypriority;
    }


    /**
     * Sets the dnspolicypriority value for this Dnsglobal.
     * 
     * @param dnspolicypriority
     */
    public void setDnspolicypriority(org.apache.axis.types.UnsignedInt[] dnspolicypriority) {
        this.dnspolicypriority = dnspolicypriority;
    }


    /**
     * Gets the dnspolicygotoprioexpr value for this Dnsglobal.
     * 
     * @return dnspolicygotoprioexpr
     */
    public java.lang.String[] getDnspolicygotoprioexpr() {
        return dnspolicygotoprioexpr;
    }


    /**
     * Sets the dnspolicygotoprioexpr value for this Dnsglobal.
     * 
     * @param dnspolicygotoprioexpr
     */
    public void setDnspolicygotoprioexpr(java.lang.String[] dnspolicygotoprioexpr) {
        this.dnspolicygotoprioexpr = dnspolicygotoprioexpr;
    }


    /**
     * Gets the dnsinvoke value for this Dnsglobal.
     * 
     * @return dnsinvoke
     */
    public boolean[] getDnsinvoke() {
        return dnsinvoke;
    }


    /**
     * Sets the dnsinvoke value for this Dnsglobal.
     * 
     * @param dnsinvoke
     */
    public void setDnsinvoke(boolean[] dnsinvoke) {
        this.dnsinvoke = dnsinvoke;
    }


    /**
     * Gets the dnspolicyinvokelabeltype value for this Dnsglobal.
     * 
     * @return dnspolicyinvokelabeltype
     */
    public java.lang.String[] getDnspolicyinvokelabeltype() {
        return dnspolicyinvokelabeltype;
    }


    /**
     * Sets the dnspolicyinvokelabeltype value for this Dnsglobal.
     * 
     * @param dnspolicyinvokelabeltype
     */
    public void setDnspolicyinvokelabeltype(java.lang.String[] dnspolicyinvokelabeltype) {
        this.dnspolicyinvokelabeltype = dnspolicyinvokelabeltype;
    }


    /**
     * Gets the dnspolicyinvokelabelname value for this Dnsglobal.
     * 
     * @return dnspolicyinvokelabelname
     */
    public java.lang.String[] getDnspolicyinvokelabelname() {
        return dnspolicyinvokelabelname;
    }


    /**
     * Sets the dnspolicyinvokelabelname value for this Dnsglobal.
     * 
     * @param dnspolicyinvokelabelname
     */
    public void setDnspolicyinvokelabelname(java.lang.String[] dnspolicyinvokelabelname) {
        this.dnspolicyinvokelabelname = dnspolicyinvokelabelname;
    }


    /**
     * Gets the dnspolicynumpol value for this Dnsglobal.
     * 
     * @return dnspolicynumpol
     */
    public org.apache.axis.types.UnsignedInt[] getDnspolicynumpol() {
        return dnspolicynumpol;
    }


    /**
     * Sets the dnspolicynumpol value for this Dnsglobal.
     * 
     * @param dnspolicynumpol
     */
    public void setDnspolicynumpol(org.apache.axis.types.UnsignedInt[] dnspolicynumpol) {
        this.dnspolicynumpol = dnspolicynumpol;
    }


    /**
     * Gets the dnspolicyflowtype value for this Dnsglobal.
     * 
     * @return dnspolicyflowtype
     */
    public org.apache.axis.types.UnsignedInt[] getDnspolicyflowtype() {
        return dnspolicyflowtype;
    }


    /**
     * Sets the dnspolicyflowtype value for this Dnsglobal.
     * 
     * @param dnspolicyflowtype
     */
    public void setDnspolicyflowtype(org.apache.axis.types.UnsignedInt[] dnspolicyflowtype) {
        this.dnspolicyflowtype = dnspolicyflowtype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Dnsglobal)) return false;
        Dnsglobal other = (Dnsglobal) obj;
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
            ((this.upgraded==null && other.getUpgraded()==null) || 
             (this.upgraded!=null &&
              this.upgraded.equals(other.getUpgraded()))) &&
            ((this.builtin==null && other.getBuiltin()==null) || 
             (this.builtin!=null &&
              this.builtin.equals(other.getBuiltin()))) &&
            ((this.dnspolicyname==null && other.getDnspolicyname()==null) || 
             (this.dnspolicyname!=null &&
              java.util.Arrays.equals(this.dnspolicyname, other.getDnspolicyname()))) &&
            ((this.dnspolicybindpoint==null && other.getDnspolicybindpoint()==null) || 
             (this.dnspolicybindpoint!=null &&
              java.util.Arrays.equals(this.dnspolicybindpoint, other.getDnspolicybindpoint()))) &&
            ((this.dnspolicypriority==null && other.getDnspolicypriority()==null) || 
             (this.dnspolicypriority!=null &&
              java.util.Arrays.equals(this.dnspolicypriority, other.getDnspolicypriority()))) &&
            ((this.dnspolicygotoprioexpr==null && other.getDnspolicygotoprioexpr()==null) || 
             (this.dnspolicygotoprioexpr!=null &&
              java.util.Arrays.equals(this.dnspolicygotoprioexpr, other.getDnspolicygotoprioexpr()))) &&
            ((this.dnsinvoke==null && other.getDnsinvoke()==null) || 
             (this.dnsinvoke!=null &&
              java.util.Arrays.equals(this.dnsinvoke, other.getDnsinvoke()))) &&
            ((this.dnspolicyinvokelabeltype==null && other.getDnspolicyinvokelabeltype()==null) || 
             (this.dnspolicyinvokelabeltype!=null &&
              java.util.Arrays.equals(this.dnspolicyinvokelabeltype, other.getDnspolicyinvokelabeltype()))) &&
            ((this.dnspolicyinvokelabelname==null && other.getDnspolicyinvokelabelname()==null) || 
             (this.dnspolicyinvokelabelname!=null &&
              java.util.Arrays.equals(this.dnspolicyinvokelabelname, other.getDnspolicyinvokelabelname()))) &&
            ((this.dnspolicynumpol==null && other.getDnspolicynumpol()==null) || 
             (this.dnspolicynumpol!=null &&
              java.util.Arrays.equals(this.dnspolicynumpol, other.getDnspolicynumpol()))) &&
            ((this.dnspolicyflowtype==null && other.getDnspolicyflowtype()==null) || 
             (this.dnspolicyflowtype!=null &&
              java.util.Arrays.equals(this.dnspolicyflowtype, other.getDnspolicyflowtype())));
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
        if (getUpgraded() != null) {
            _hashCode += getUpgraded().hashCode();
        }
        if (getBuiltin() != null) {
            _hashCode += getBuiltin().hashCode();
        }
        if (getDnspolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDnspolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDnspolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDnspolicybindpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDnspolicybindpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDnspolicybindpoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDnspolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDnspolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDnspolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDnspolicygotoprioexpr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDnspolicygotoprioexpr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDnspolicygotoprioexpr(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDnsinvoke() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDnsinvoke());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDnsinvoke(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDnspolicyinvokelabeltype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDnspolicyinvokelabeltype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDnspolicyinvokelabeltype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDnspolicyinvokelabelname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDnspolicyinvokelabelname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDnspolicyinvokelabelname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDnspolicynumpol() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDnspolicynumpol());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDnspolicynumpol(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDnspolicyflowtype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDnspolicyflowtype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDnspolicyflowtype(), i);
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
        new org.apache.axis.description.TypeDesc(Dnsglobal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "dnsglobal"));
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
        elemField.setFieldName("upgraded");
        elemField.setXmlName(new javax.xml.namespace.QName("", "upgraded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builtin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "builtin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnspolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnspolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnspolicybindpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnspolicybindpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnspolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnspolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnspolicygotoprioexpr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnspolicygotoprioexpr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsinvoke");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnsinvoke"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnspolicyinvokelabeltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnspolicyinvokelabeltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnspolicyinvokelabelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnspolicyinvokelabelname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnspolicynumpol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnspolicynumpol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnspolicyflowtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnspolicyflowtype"));
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
