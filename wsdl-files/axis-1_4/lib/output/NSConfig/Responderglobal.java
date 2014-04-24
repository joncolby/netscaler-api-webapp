/**
 * Responderglobal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Responderglobal  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String policyname;

    private org.apache.axis.types.UnsignedInt priority;

    private java.lang.String gotopriorityexpression;

    private boolean invoke;

    private java.lang.String labeltype;

    private java.lang.String labelname;

    private org.apache.axis.types.UnsignedInt flowtype;

    private org.apache.axis.types.UnsignedInt numpol;

    private java.lang.String[] rsppolicyname;

    private java.lang.String[] rsppolicybindpoint;

    private org.apache.axis.types.UnsignedInt[] rsppolicypriority;

    private java.lang.String[] rsppolicygotoprioexpression;

    private boolean[] rspinvoke;

    private java.lang.String[] rsppolicyinvokelabeltype;

    private java.lang.String[] rsppolicyinvokelabelname;

    private org.apache.axis.types.UnsignedInt[] rsppolicynumpol;

    private org.apache.axis.types.UnsignedInt[] rsppolicyflowtype;

    public Responderglobal() {
    }

    public Responderglobal(
           java.lang.String type,
           java.lang.String policyname,
           org.apache.axis.types.UnsignedInt priority,
           java.lang.String gotopriorityexpression,
           boolean invoke,
           java.lang.String labeltype,
           java.lang.String labelname,
           org.apache.axis.types.UnsignedInt flowtype,
           org.apache.axis.types.UnsignedInt numpol,
           java.lang.String[] rsppolicyname,
           java.lang.String[] rsppolicybindpoint,
           org.apache.axis.types.UnsignedInt[] rsppolicypriority,
           java.lang.String[] rsppolicygotoprioexpression,
           boolean[] rspinvoke,
           java.lang.String[] rsppolicyinvokelabeltype,
           java.lang.String[] rsppolicyinvokelabelname,
           org.apache.axis.types.UnsignedInt[] rsppolicynumpol,
           org.apache.axis.types.UnsignedInt[] rsppolicyflowtype) {
           this.type = type;
           this.policyname = policyname;
           this.priority = priority;
           this.gotopriorityexpression = gotopriorityexpression;
           this.invoke = invoke;
           this.labeltype = labeltype;
           this.labelname = labelname;
           this.flowtype = flowtype;
           this.numpol = numpol;
           this.rsppolicyname = rsppolicyname;
           this.rsppolicybindpoint = rsppolicybindpoint;
           this.rsppolicypriority = rsppolicypriority;
           this.rsppolicygotoprioexpression = rsppolicygotoprioexpression;
           this.rspinvoke = rspinvoke;
           this.rsppolicyinvokelabeltype = rsppolicyinvokelabeltype;
           this.rsppolicyinvokelabelname = rsppolicyinvokelabelname;
           this.rsppolicynumpol = rsppolicynumpol;
           this.rsppolicyflowtype = rsppolicyflowtype;
    }


    /**
     * Gets the type value for this Responderglobal.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Responderglobal.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the policyname value for this Responderglobal.
     * 
     * @return policyname
     */
    public java.lang.String getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Responderglobal.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the priority value for this Responderglobal.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Responderglobal.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the gotopriorityexpression value for this Responderglobal.
     * 
     * @return gotopriorityexpression
     */
    public java.lang.String getGotopriorityexpression() {
        return gotopriorityexpression;
    }


    /**
     * Sets the gotopriorityexpression value for this Responderglobal.
     * 
     * @param gotopriorityexpression
     */
    public void setGotopriorityexpression(java.lang.String gotopriorityexpression) {
        this.gotopriorityexpression = gotopriorityexpression;
    }


    /**
     * Gets the invoke value for this Responderglobal.
     * 
     * @return invoke
     */
    public boolean isInvoke() {
        return invoke;
    }


    /**
     * Sets the invoke value for this Responderglobal.
     * 
     * @param invoke
     */
    public void setInvoke(boolean invoke) {
        this.invoke = invoke;
    }


    /**
     * Gets the labeltype value for this Responderglobal.
     * 
     * @return labeltype
     */
    public java.lang.String getLabeltype() {
        return labeltype;
    }


    /**
     * Sets the labeltype value for this Responderglobal.
     * 
     * @param labeltype
     */
    public void setLabeltype(java.lang.String labeltype) {
        this.labeltype = labeltype;
    }


    /**
     * Gets the labelname value for this Responderglobal.
     * 
     * @return labelname
     */
    public java.lang.String getLabelname() {
        return labelname;
    }


    /**
     * Sets the labelname value for this Responderglobal.
     * 
     * @param labelname
     */
    public void setLabelname(java.lang.String labelname) {
        this.labelname = labelname;
    }


    /**
     * Gets the flowtype value for this Responderglobal.
     * 
     * @return flowtype
     */
    public org.apache.axis.types.UnsignedInt getFlowtype() {
        return flowtype;
    }


    /**
     * Sets the flowtype value for this Responderglobal.
     * 
     * @param flowtype
     */
    public void setFlowtype(org.apache.axis.types.UnsignedInt flowtype) {
        this.flowtype = flowtype;
    }


    /**
     * Gets the numpol value for this Responderglobal.
     * 
     * @return numpol
     */
    public org.apache.axis.types.UnsignedInt getNumpol() {
        return numpol;
    }


    /**
     * Sets the numpol value for this Responderglobal.
     * 
     * @param numpol
     */
    public void setNumpol(org.apache.axis.types.UnsignedInt numpol) {
        this.numpol = numpol;
    }


    /**
     * Gets the rsppolicyname value for this Responderglobal.
     * 
     * @return rsppolicyname
     */
    public java.lang.String[] getRsppolicyname() {
        return rsppolicyname;
    }


    /**
     * Sets the rsppolicyname value for this Responderglobal.
     * 
     * @param rsppolicyname
     */
    public void setRsppolicyname(java.lang.String[] rsppolicyname) {
        this.rsppolicyname = rsppolicyname;
    }


    /**
     * Gets the rsppolicybindpoint value for this Responderglobal.
     * 
     * @return rsppolicybindpoint
     */
    public java.lang.String[] getRsppolicybindpoint() {
        return rsppolicybindpoint;
    }


    /**
     * Sets the rsppolicybindpoint value for this Responderglobal.
     * 
     * @param rsppolicybindpoint
     */
    public void setRsppolicybindpoint(java.lang.String[] rsppolicybindpoint) {
        this.rsppolicybindpoint = rsppolicybindpoint;
    }


    /**
     * Gets the rsppolicypriority value for this Responderglobal.
     * 
     * @return rsppolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getRsppolicypriority() {
        return rsppolicypriority;
    }


    /**
     * Sets the rsppolicypriority value for this Responderglobal.
     * 
     * @param rsppolicypriority
     */
    public void setRsppolicypriority(org.apache.axis.types.UnsignedInt[] rsppolicypriority) {
        this.rsppolicypriority = rsppolicypriority;
    }


    /**
     * Gets the rsppolicygotoprioexpression value for this Responderglobal.
     * 
     * @return rsppolicygotoprioexpression
     */
    public java.lang.String[] getRsppolicygotoprioexpression() {
        return rsppolicygotoprioexpression;
    }


    /**
     * Sets the rsppolicygotoprioexpression value for this Responderglobal.
     * 
     * @param rsppolicygotoprioexpression
     */
    public void setRsppolicygotoprioexpression(java.lang.String[] rsppolicygotoprioexpression) {
        this.rsppolicygotoprioexpression = rsppolicygotoprioexpression;
    }


    /**
     * Gets the rspinvoke value for this Responderglobal.
     * 
     * @return rspinvoke
     */
    public boolean[] getRspinvoke() {
        return rspinvoke;
    }


    /**
     * Sets the rspinvoke value for this Responderglobal.
     * 
     * @param rspinvoke
     */
    public void setRspinvoke(boolean[] rspinvoke) {
        this.rspinvoke = rspinvoke;
    }


    /**
     * Gets the rsppolicyinvokelabeltype value for this Responderglobal.
     * 
     * @return rsppolicyinvokelabeltype
     */
    public java.lang.String[] getRsppolicyinvokelabeltype() {
        return rsppolicyinvokelabeltype;
    }


    /**
     * Sets the rsppolicyinvokelabeltype value for this Responderglobal.
     * 
     * @param rsppolicyinvokelabeltype
     */
    public void setRsppolicyinvokelabeltype(java.lang.String[] rsppolicyinvokelabeltype) {
        this.rsppolicyinvokelabeltype = rsppolicyinvokelabeltype;
    }


    /**
     * Gets the rsppolicyinvokelabelname value for this Responderglobal.
     * 
     * @return rsppolicyinvokelabelname
     */
    public java.lang.String[] getRsppolicyinvokelabelname() {
        return rsppolicyinvokelabelname;
    }


    /**
     * Sets the rsppolicyinvokelabelname value for this Responderglobal.
     * 
     * @param rsppolicyinvokelabelname
     */
    public void setRsppolicyinvokelabelname(java.lang.String[] rsppolicyinvokelabelname) {
        this.rsppolicyinvokelabelname = rsppolicyinvokelabelname;
    }


    /**
     * Gets the rsppolicynumpol value for this Responderglobal.
     * 
     * @return rsppolicynumpol
     */
    public org.apache.axis.types.UnsignedInt[] getRsppolicynumpol() {
        return rsppolicynumpol;
    }


    /**
     * Sets the rsppolicynumpol value for this Responderglobal.
     * 
     * @param rsppolicynumpol
     */
    public void setRsppolicynumpol(org.apache.axis.types.UnsignedInt[] rsppolicynumpol) {
        this.rsppolicynumpol = rsppolicynumpol;
    }


    /**
     * Gets the rsppolicyflowtype value for this Responderglobal.
     * 
     * @return rsppolicyflowtype
     */
    public org.apache.axis.types.UnsignedInt[] getRsppolicyflowtype() {
        return rsppolicyflowtype;
    }


    /**
     * Sets the rsppolicyflowtype value for this Responderglobal.
     * 
     * @param rsppolicyflowtype
     */
    public void setRsppolicyflowtype(org.apache.axis.types.UnsignedInt[] rsppolicyflowtype) {
        this.rsppolicyflowtype = rsppolicyflowtype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Responderglobal)) return false;
        Responderglobal other = (Responderglobal) obj;
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
            ((this.flowtype==null && other.getFlowtype()==null) || 
             (this.flowtype!=null &&
              this.flowtype.equals(other.getFlowtype()))) &&
            ((this.numpol==null && other.getNumpol()==null) || 
             (this.numpol!=null &&
              this.numpol.equals(other.getNumpol()))) &&
            ((this.rsppolicyname==null && other.getRsppolicyname()==null) || 
             (this.rsppolicyname!=null &&
              java.util.Arrays.equals(this.rsppolicyname, other.getRsppolicyname()))) &&
            ((this.rsppolicybindpoint==null && other.getRsppolicybindpoint()==null) || 
             (this.rsppolicybindpoint!=null &&
              java.util.Arrays.equals(this.rsppolicybindpoint, other.getRsppolicybindpoint()))) &&
            ((this.rsppolicypriority==null && other.getRsppolicypriority()==null) || 
             (this.rsppolicypriority!=null &&
              java.util.Arrays.equals(this.rsppolicypriority, other.getRsppolicypriority()))) &&
            ((this.rsppolicygotoprioexpression==null && other.getRsppolicygotoprioexpression()==null) || 
             (this.rsppolicygotoprioexpression!=null &&
              java.util.Arrays.equals(this.rsppolicygotoprioexpression, other.getRsppolicygotoprioexpression()))) &&
            ((this.rspinvoke==null && other.getRspinvoke()==null) || 
             (this.rspinvoke!=null &&
              java.util.Arrays.equals(this.rspinvoke, other.getRspinvoke()))) &&
            ((this.rsppolicyinvokelabeltype==null && other.getRsppolicyinvokelabeltype()==null) || 
             (this.rsppolicyinvokelabeltype!=null &&
              java.util.Arrays.equals(this.rsppolicyinvokelabeltype, other.getRsppolicyinvokelabeltype()))) &&
            ((this.rsppolicyinvokelabelname==null && other.getRsppolicyinvokelabelname()==null) || 
             (this.rsppolicyinvokelabelname!=null &&
              java.util.Arrays.equals(this.rsppolicyinvokelabelname, other.getRsppolicyinvokelabelname()))) &&
            ((this.rsppolicynumpol==null && other.getRsppolicynumpol()==null) || 
             (this.rsppolicynumpol!=null &&
              java.util.Arrays.equals(this.rsppolicynumpol, other.getRsppolicynumpol()))) &&
            ((this.rsppolicyflowtype==null && other.getRsppolicyflowtype()==null) || 
             (this.rsppolicyflowtype!=null &&
              java.util.Arrays.equals(this.rsppolicyflowtype, other.getRsppolicyflowtype())));
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
        if (getFlowtype() != null) {
            _hashCode += getFlowtype().hashCode();
        }
        if (getNumpol() != null) {
            _hashCode += getNumpol().hashCode();
        }
        if (getRsppolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRsppolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRsppolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRsppolicybindpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRsppolicybindpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRsppolicybindpoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRsppolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRsppolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRsppolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRsppolicygotoprioexpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRsppolicygotoprioexpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRsppolicygotoprioexpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRspinvoke() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRspinvoke());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRspinvoke(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRsppolicyinvokelabeltype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRsppolicyinvokelabeltype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRsppolicyinvokelabeltype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRsppolicyinvokelabelname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRsppolicyinvokelabelname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRsppolicyinvokelabelname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRsppolicynumpol() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRsppolicynumpol());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRsppolicynumpol(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRsppolicyflowtype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRsppolicyflowtype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRsppolicyflowtype(), i);
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
        new org.apache.axis.description.TypeDesc(Responderglobal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "responderglobal"));
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
        elemField.setFieldName("rsppolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsppolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsppolicybindpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsppolicybindpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsppolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsppolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsppolicygotoprioexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsppolicygotoprioexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rspinvoke");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rspinvoke"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsppolicyinvokelabeltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsppolicyinvokelabeltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsppolicyinvokelabelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsppolicyinvokelabelname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsppolicynumpol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsppolicynumpol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rsppolicyflowtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsppolicyflowtype"));
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
