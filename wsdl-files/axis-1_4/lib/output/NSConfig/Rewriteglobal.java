/**
 * Rewriteglobal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Rewriteglobal  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String policyname;

    private org.apache.axis.types.UnsignedInt priority;

    private java.lang.String gotopriorityexpression;

    private boolean invoke;

    private java.lang.String labeltype;

    private java.lang.String labelname;

    private org.apache.axis.types.UnsignedInt numpol;

    private org.apache.axis.types.UnsignedInt flowtype;

    private java.lang.String[] rwpolicyname;

    private java.lang.String[] rwpolicybindpoint;

    private org.apache.axis.types.UnsignedInt[] rwpolicypriority;

    private java.lang.String[] rwpolicygotoprioexpression;

    private boolean[] rwinvoke;

    private java.lang.String[] rwpolicyinvokelabeltype;

    private java.lang.String[] rwpolicyinvokelabelname;

    private org.apache.axis.types.UnsignedInt[] rwpolicynumpol;

    private org.apache.axis.types.UnsignedInt[] rwpolicyflowtype;

    public Rewriteglobal() {
    }

    public Rewriteglobal(
           java.lang.String type,
           java.lang.String policyname,
           org.apache.axis.types.UnsignedInt priority,
           java.lang.String gotopriorityexpression,
           boolean invoke,
           java.lang.String labeltype,
           java.lang.String labelname,
           org.apache.axis.types.UnsignedInt numpol,
           org.apache.axis.types.UnsignedInt flowtype,
           java.lang.String[] rwpolicyname,
           java.lang.String[] rwpolicybindpoint,
           org.apache.axis.types.UnsignedInt[] rwpolicypriority,
           java.lang.String[] rwpolicygotoprioexpression,
           boolean[] rwinvoke,
           java.lang.String[] rwpolicyinvokelabeltype,
           java.lang.String[] rwpolicyinvokelabelname,
           org.apache.axis.types.UnsignedInt[] rwpolicynumpol,
           org.apache.axis.types.UnsignedInt[] rwpolicyflowtype) {
           this.type = type;
           this.policyname = policyname;
           this.priority = priority;
           this.gotopriorityexpression = gotopriorityexpression;
           this.invoke = invoke;
           this.labeltype = labeltype;
           this.labelname = labelname;
           this.numpol = numpol;
           this.flowtype = flowtype;
           this.rwpolicyname = rwpolicyname;
           this.rwpolicybindpoint = rwpolicybindpoint;
           this.rwpolicypriority = rwpolicypriority;
           this.rwpolicygotoprioexpression = rwpolicygotoprioexpression;
           this.rwinvoke = rwinvoke;
           this.rwpolicyinvokelabeltype = rwpolicyinvokelabeltype;
           this.rwpolicyinvokelabelname = rwpolicyinvokelabelname;
           this.rwpolicynumpol = rwpolicynumpol;
           this.rwpolicyflowtype = rwpolicyflowtype;
    }


    /**
     * Gets the type value for this Rewriteglobal.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Rewriteglobal.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the policyname value for this Rewriteglobal.
     * 
     * @return policyname
     */
    public java.lang.String getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Rewriteglobal.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the priority value for this Rewriteglobal.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Rewriteglobal.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the gotopriorityexpression value for this Rewriteglobal.
     * 
     * @return gotopriorityexpression
     */
    public java.lang.String getGotopriorityexpression() {
        return gotopriorityexpression;
    }


    /**
     * Sets the gotopriorityexpression value for this Rewriteglobal.
     * 
     * @param gotopriorityexpression
     */
    public void setGotopriorityexpression(java.lang.String gotopriorityexpression) {
        this.gotopriorityexpression = gotopriorityexpression;
    }


    /**
     * Gets the invoke value for this Rewriteglobal.
     * 
     * @return invoke
     */
    public boolean isInvoke() {
        return invoke;
    }


    /**
     * Sets the invoke value for this Rewriteglobal.
     * 
     * @param invoke
     */
    public void setInvoke(boolean invoke) {
        this.invoke = invoke;
    }


    /**
     * Gets the labeltype value for this Rewriteglobal.
     * 
     * @return labeltype
     */
    public java.lang.String getLabeltype() {
        return labeltype;
    }


    /**
     * Sets the labeltype value for this Rewriteglobal.
     * 
     * @param labeltype
     */
    public void setLabeltype(java.lang.String labeltype) {
        this.labeltype = labeltype;
    }


    /**
     * Gets the labelname value for this Rewriteglobal.
     * 
     * @return labelname
     */
    public java.lang.String getLabelname() {
        return labelname;
    }


    /**
     * Sets the labelname value for this Rewriteglobal.
     * 
     * @param labelname
     */
    public void setLabelname(java.lang.String labelname) {
        this.labelname = labelname;
    }


    /**
     * Gets the numpol value for this Rewriteglobal.
     * 
     * @return numpol
     */
    public org.apache.axis.types.UnsignedInt getNumpol() {
        return numpol;
    }


    /**
     * Sets the numpol value for this Rewriteglobal.
     * 
     * @param numpol
     */
    public void setNumpol(org.apache.axis.types.UnsignedInt numpol) {
        this.numpol = numpol;
    }


    /**
     * Gets the flowtype value for this Rewriteglobal.
     * 
     * @return flowtype
     */
    public org.apache.axis.types.UnsignedInt getFlowtype() {
        return flowtype;
    }


    /**
     * Sets the flowtype value for this Rewriteglobal.
     * 
     * @param flowtype
     */
    public void setFlowtype(org.apache.axis.types.UnsignedInt flowtype) {
        this.flowtype = flowtype;
    }


    /**
     * Gets the rwpolicyname value for this Rewriteglobal.
     * 
     * @return rwpolicyname
     */
    public java.lang.String[] getRwpolicyname() {
        return rwpolicyname;
    }


    /**
     * Sets the rwpolicyname value for this Rewriteglobal.
     * 
     * @param rwpolicyname
     */
    public void setRwpolicyname(java.lang.String[] rwpolicyname) {
        this.rwpolicyname = rwpolicyname;
    }


    /**
     * Gets the rwpolicybindpoint value for this Rewriteglobal.
     * 
     * @return rwpolicybindpoint
     */
    public java.lang.String[] getRwpolicybindpoint() {
        return rwpolicybindpoint;
    }


    /**
     * Sets the rwpolicybindpoint value for this Rewriteglobal.
     * 
     * @param rwpolicybindpoint
     */
    public void setRwpolicybindpoint(java.lang.String[] rwpolicybindpoint) {
        this.rwpolicybindpoint = rwpolicybindpoint;
    }


    /**
     * Gets the rwpolicypriority value for this Rewriteglobal.
     * 
     * @return rwpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getRwpolicypriority() {
        return rwpolicypriority;
    }


    /**
     * Sets the rwpolicypriority value for this Rewriteglobal.
     * 
     * @param rwpolicypriority
     */
    public void setRwpolicypriority(org.apache.axis.types.UnsignedInt[] rwpolicypriority) {
        this.rwpolicypriority = rwpolicypriority;
    }


    /**
     * Gets the rwpolicygotoprioexpression value for this Rewriteglobal.
     * 
     * @return rwpolicygotoprioexpression
     */
    public java.lang.String[] getRwpolicygotoprioexpression() {
        return rwpolicygotoprioexpression;
    }


    /**
     * Sets the rwpolicygotoprioexpression value for this Rewriteglobal.
     * 
     * @param rwpolicygotoprioexpression
     */
    public void setRwpolicygotoprioexpression(java.lang.String[] rwpolicygotoprioexpression) {
        this.rwpolicygotoprioexpression = rwpolicygotoprioexpression;
    }


    /**
     * Gets the rwinvoke value for this Rewriteglobal.
     * 
     * @return rwinvoke
     */
    public boolean[] getRwinvoke() {
        return rwinvoke;
    }


    /**
     * Sets the rwinvoke value for this Rewriteglobal.
     * 
     * @param rwinvoke
     */
    public void setRwinvoke(boolean[] rwinvoke) {
        this.rwinvoke = rwinvoke;
    }


    /**
     * Gets the rwpolicyinvokelabeltype value for this Rewriteglobal.
     * 
     * @return rwpolicyinvokelabeltype
     */
    public java.lang.String[] getRwpolicyinvokelabeltype() {
        return rwpolicyinvokelabeltype;
    }


    /**
     * Sets the rwpolicyinvokelabeltype value for this Rewriteglobal.
     * 
     * @param rwpolicyinvokelabeltype
     */
    public void setRwpolicyinvokelabeltype(java.lang.String[] rwpolicyinvokelabeltype) {
        this.rwpolicyinvokelabeltype = rwpolicyinvokelabeltype;
    }


    /**
     * Gets the rwpolicyinvokelabelname value for this Rewriteglobal.
     * 
     * @return rwpolicyinvokelabelname
     */
    public java.lang.String[] getRwpolicyinvokelabelname() {
        return rwpolicyinvokelabelname;
    }


    /**
     * Sets the rwpolicyinvokelabelname value for this Rewriteglobal.
     * 
     * @param rwpolicyinvokelabelname
     */
    public void setRwpolicyinvokelabelname(java.lang.String[] rwpolicyinvokelabelname) {
        this.rwpolicyinvokelabelname = rwpolicyinvokelabelname;
    }


    /**
     * Gets the rwpolicynumpol value for this Rewriteglobal.
     * 
     * @return rwpolicynumpol
     */
    public org.apache.axis.types.UnsignedInt[] getRwpolicynumpol() {
        return rwpolicynumpol;
    }


    /**
     * Sets the rwpolicynumpol value for this Rewriteglobal.
     * 
     * @param rwpolicynumpol
     */
    public void setRwpolicynumpol(org.apache.axis.types.UnsignedInt[] rwpolicynumpol) {
        this.rwpolicynumpol = rwpolicynumpol;
    }


    /**
     * Gets the rwpolicyflowtype value for this Rewriteglobal.
     * 
     * @return rwpolicyflowtype
     */
    public org.apache.axis.types.UnsignedInt[] getRwpolicyflowtype() {
        return rwpolicyflowtype;
    }


    /**
     * Sets the rwpolicyflowtype value for this Rewriteglobal.
     * 
     * @param rwpolicyflowtype
     */
    public void setRwpolicyflowtype(org.apache.axis.types.UnsignedInt[] rwpolicyflowtype) {
        this.rwpolicyflowtype = rwpolicyflowtype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rewriteglobal)) return false;
        Rewriteglobal other = (Rewriteglobal) obj;
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
            ((this.rwpolicyname==null && other.getRwpolicyname()==null) || 
             (this.rwpolicyname!=null &&
              java.util.Arrays.equals(this.rwpolicyname, other.getRwpolicyname()))) &&
            ((this.rwpolicybindpoint==null && other.getRwpolicybindpoint()==null) || 
             (this.rwpolicybindpoint!=null &&
              java.util.Arrays.equals(this.rwpolicybindpoint, other.getRwpolicybindpoint()))) &&
            ((this.rwpolicypriority==null && other.getRwpolicypriority()==null) || 
             (this.rwpolicypriority!=null &&
              java.util.Arrays.equals(this.rwpolicypriority, other.getRwpolicypriority()))) &&
            ((this.rwpolicygotoprioexpression==null && other.getRwpolicygotoprioexpression()==null) || 
             (this.rwpolicygotoprioexpression!=null &&
              java.util.Arrays.equals(this.rwpolicygotoprioexpression, other.getRwpolicygotoprioexpression()))) &&
            ((this.rwinvoke==null && other.getRwinvoke()==null) || 
             (this.rwinvoke!=null &&
              java.util.Arrays.equals(this.rwinvoke, other.getRwinvoke()))) &&
            ((this.rwpolicyinvokelabeltype==null && other.getRwpolicyinvokelabeltype()==null) || 
             (this.rwpolicyinvokelabeltype!=null &&
              java.util.Arrays.equals(this.rwpolicyinvokelabeltype, other.getRwpolicyinvokelabeltype()))) &&
            ((this.rwpolicyinvokelabelname==null && other.getRwpolicyinvokelabelname()==null) || 
             (this.rwpolicyinvokelabelname!=null &&
              java.util.Arrays.equals(this.rwpolicyinvokelabelname, other.getRwpolicyinvokelabelname()))) &&
            ((this.rwpolicynumpol==null && other.getRwpolicynumpol()==null) || 
             (this.rwpolicynumpol!=null &&
              java.util.Arrays.equals(this.rwpolicynumpol, other.getRwpolicynumpol()))) &&
            ((this.rwpolicyflowtype==null && other.getRwpolicyflowtype()==null) || 
             (this.rwpolicyflowtype!=null &&
              java.util.Arrays.equals(this.rwpolicyflowtype, other.getRwpolicyflowtype())));
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
        if (getRwpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRwpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRwpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRwpolicybindpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRwpolicybindpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRwpolicybindpoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRwpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRwpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRwpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRwpolicygotoprioexpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRwpolicygotoprioexpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRwpolicygotoprioexpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRwinvoke() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRwinvoke());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRwinvoke(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRwpolicyinvokelabeltype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRwpolicyinvokelabeltype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRwpolicyinvokelabeltype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRwpolicyinvokelabelname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRwpolicyinvokelabelname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRwpolicyinvokelabelname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRwpolicynumpol() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRwpolicynumpol());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRwpolicynumpol(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRwpolicyflowtype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRwpolicyflowtype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRwpolicyflowtype(), i);
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
        new org.apache.axis.description.TypeDesc(Rewriteglobal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "rewriteglobal"));
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
        elemField.setFieldName("rwpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rwpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rwpolicybindpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rwpolicybindpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rwpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rwpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rwpolicygotoprioexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rwpolicygotoprioexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rwinvoke");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rwinvoke"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rwpolicyinvokelabeltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rwpolicyinvokelabeltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rwpolicyinvokelabelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rwpolicyinvokelabelname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rwpolicynumpol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rwpolicynumpol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rwpolicyflowtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rwpolicyflowtype"));
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
