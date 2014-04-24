/**
 * Transformglobal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Transformglobal  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String policyname;

    private org.apache.axis.types.UnsignedInt priority;

    private java.lang.String gotopriorityexpression;

    private boolean invoke;

    private java.lang.String labeltype;

    private java.lang.String labelname;

    private org.apache.axis.types.UnsignedInt flowtype;

    private org.apache.axis.types.UnsignedInt numpol;

    private java.lang.String[] transformpolicyname;

    private java.lang.String[] transformpolicybindpoint;

    private org.apache.axis.types.UnsignedInt[] transformpolicypriority;

    private java.lang.String[] transformpolicygotoprioexpression;

    private boolean[] transforminvoke;

    private java.lang.String[] transformpolicyinvokelabeltype;

    private java.lang.String[] transformpolicyinvokelabelname;

    private org.apache.axis.types.UnsignedInt[] transformpolicynumpol;

    private org.apache.axis.types.UnsignedInt[] transformpolicyflowtype;

    public Transformglobal() {
    }

    public Transformglobal(
           java.lang.String type,
           java.lang.String policyname,
           org.apache.axis.types.UnsignedInt priority,
           java.lang.String gotopriorityexpression,
           boolean invoke,
           java.lang.String labeltype,
           java.lang.String labelname,
           org.apache.axis.types.UnsignedInt flowtype,
           org.apache.axis.types.UnsignedInt numpol,
           java.lang.String[] transformpolicyname,
           java.lang.String[] transformpolicybindpoint,
           org.apache.axis.types.UnsignedInt[] transformpolicypriority,
           java.lang.String[] transformpolicygotoprioexpression,
           boolean[] transforminvoke,
           java.lang.String[] transformpolicyinvokelabeltype,
           java.lang.String[] transformpolicyinvokelabelname,
           org.apache.axis.types.UnsignedInt[] transformpolicynumpol,
           org.apache.axis.types.UnsignedInt[] transformpolicyflowtype) {
           this.type = type;
           this.policyname = policyname;
           this.priority = priority;
           this.gotopriorityexpression = gotopriorityexpression;
           this.invoke = invoke;
           this.labeltype = labeltype;
           this.labelname = labelname;
           this.flowtype = flowtype;
           this.numpol = numpol;
           this.transformpolicyname = transformpolicyname;
           this.transformpolicybindpoint = transformpolicybindpoint;
           this.transformpolicypriority = transformpolicypriority;
           this.transformpolicygotoprioexpression = transformpolicygotoprioexpression;
           this.transforminvoke = transforminvoke;
           this.transformpolicyinvokelabeltype = transformpolicyinvokelabeltype;
           this.transformpolicyinvokelabelname = transformpolicyinvokelabelname;
           this.transformpolicynumpol = transformpolicynumpol;
           this.transformpolicyflowtype = transformpolicyflowtype;
    }


    /**
     * Gets the type value for this Transformglobal.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Transformglobal.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the policyname value for this Transformglobal.
     * 
     * @return policyname
     */
    public java.lang.String getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Transformglobal.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the priority value for this Transformglobal.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Transformglobal.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the gotopriorityexpression value for this Transformglobal.
     * 
     * @return gotopriorityexpression
     */
    public java.lang.String getGotopriorityexpression() {
        return gotopriorityexpression;
    }


    /**
     * Sets the gotopriorityexpression value for this Transformglobal.
     * 
     * @param gotopriorityexpression
     */
    public void setGotopriorityexpression(java.lang.String gotopriorityexpression) {
        this.gotopriorityexpression = gotopriorityexpression;
    }


    /**
     * Gets the invoke value for this Transformglobal.
     * 
     * @return invoke
     */
    public boolean isInvoke() {
        return invoke;
    }


    /**
     * Sets the invoke value for this Transformglobal.
     * 
     * @param invoke
     */
    public void setInvoke(boolean invoke) {
        this.invoke = invoke;
    }


    /**
     * Gets the labeltype value for this Transformglobal.
     * 
     * @return labeltype
     */
    public java.lang.String getLabeltype() {
        return labeltype;
    }


    /**
     * Sets the labeltype value for this Transformglobal.
     * 
     * @param labeltype
     */
    public void setLabeltype(java.lang.String labeltype) {
        this.labeltype = labeltype;
    }


    /**
     * Gets the labelname value for this Transformglobal.
     * 
     * @return labelname
     */
    public java.lang.String getLabelname() {
        return labelname;
    }


    /**
     * Sets the labelname value for this Transformglobal.
     * 
     * @param labelname
     */
    public void setLabelname(java.lang.String labelname) {
        this.labelname = labelname;
    }


    /**
     * Gets the flowtype value for this Transformglobal.
     * 
     * @return flowtype
     */
    public org.apache.axis.types.UnsignedInt getFlowtype() {
        return flowtype;
    }


    /**
     * Sets the flowtype value for this Transformglobal.
     * 
     * @param flowtype
     */
    public void setFlowtype(org.apache.axis.types.UnsignedInt flowtype) {
        this.flowtype = flowtype;
    }


    /**
     * Gets the numpol value for this Transformglobal.
     * 
     * @return numpol
     */
    public org.apache.axis.types.UnsignedInt getNumpol() {
        return numpol;
    }


    /**
     * Sets the numpol value for this Transformglobal.
     * 
     * @param numpol
     */
    public void setNumpol(org.apache.axis.types.UnsignedInt numpol) {
        this.numpol = numpol;
    }


    /**
     * Gets the transformpolicyname value for this Transformglobal.
     * 
     * @return transformpolicyname
     */
    public java.lang.String[] getTransformpolicyname() {
        return transformpolicyname;
    }


    /**
     * Sets the transformpolicyname value for this Transformglobal.
     * 
     * @param transformpolicyname
     */
    public void setTransformpolicyname(java.lang.String[] transformpolicyname) {
        this.transformpolicyname = transformpolicyname;
    }


    /**
     * Gets the transformpolicybindpoint value for this Transformglobal.
     * 
     * @return transformpolicybindpoint
     */
    public java.lang.String[] getTransformpolicybindpoint() {
        return transformpolicybindpoint;
    }


    /**
     * Sets the transformpolicybindpoint value for this Transformglobal.
     * 
     * @param transformpolicybindpoint
     */
    public void setTransformpolicybindpoint(java.lang.String[] transformpolicybindpoint) {
        this.transformpolicybindpoint = transformpolicybindpoint;
    }


    /**
     * Gets the transformpolicypriority value for this Transformglobal.
     * 
     * @return transformpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getTransformpolicypriority() {
        return transformpolicypriority;
    }


    /**
     * Sets the transformpolicypriority value for this Transformglobal.
     * 
     * @param transformpolicypriority
     */
    public void setTransformpolicypriority(org.apache.axis.types.UnsignedInt[] transformpolicypriority) {
        this.transformpolicypriority = transformpolicypriority;
    }


    /**
     * Gets the transformpolicygotoprioexpression value for this Transformglobal.
     * 
     * @return transformpolicygotoprioexpression
     */
    public java.lang.String[] getTransformpolicygotoprioexpression() {
        return transformpolicygotoprioexpression;
    }


    /**
     * Sets the transformpolicygotoprioexpression value for this Transformglobal.
     * 
     * @param transformpolicygotoprioexpression
     */
    public void setTransformpolicygotoprioexpression(java.lang.String[] transformpolicygotoprioexpression) {
        this.transformpolicygotoprioexpression = transformpolicygotoprioexpression;
    }


    /**
     * Gets the transforminvoke value for this Transformglobal.
     * 
     * @return transforminvoke
     */
    public boolean[] getTransforminvoke() {
        return transforminvoke;
    }


    /**
     * Sets the transforminvoke value for this Transformglobal.
     * 
     * @param transforminvoke
     */
    public void setTransforminvoke(boolean[] transforminvoke) {
        this.transforminvoke = transforminvoke;
    }


    /**
     * Gets the transformpolicyinvokelabeltype value for this Transformglobal.
     * 
     * @return transformpolicyinvokelabeltype
     */
    public java.lang.String[] getTransformpolicyinvokelabeltype() {
        return transformpolicyinvokelabeltype;
    }


    /**
     * Sets the transformpolicyinvokelabeltype value for this Transformglobal.
     * 
     * @param transformpolicyinvokelabeltype
     */
    public void setTransformpolicyinvokelabeltype(java.lang.String[] transformpolicyinvokelabeltype) {
        this.transformpolicyinvokelabeltype = transformpolicyinvokelabeltype;
    }


    /**
     * Gets the transformpolicyinvokelabelname value for this Transformglobal.
     * 
     * @return transformpolicyinvokelabelname
     */
    public java.lang.String[] getTransformpolicyinvokelabelname() {
        return transformpolicyinvokelabelname;
    }


    /**
     * Sets the transformpolicyinvokelabelname value for this Transformglobal.
     * 
     * @param transformpolicyinvokelabelname
     */
    public void setTransformpolicyinvokelabelname(java.lang.String[] transformpolicyinvokelabelname) {
        this.transformpolicyinvokelabelname = transformpolicyinvokelabelname;
    }


    /**
     * Gets the transformpolicynumpol value for this Transformglobal.
     * 
     * @return transformpolicynumpol
     */
    public org.apache.axis.types.UnsignedInt[] getTransformpolicynumpol() {
        return transformpolicynumpol;
    }


    /**
     * Sets the transformpolicynumpol value for this Transformglobal.
     * 
     * @param transformpolicynumpol
     */
    public void setTransformpolicynumpol(org.apache.axis.types.UnsignedInt[] transformpolicynumpol) {
        this.transformpolicynumpol = transformpolicynumpol;
    }


    /**
     * Gets the transformpolicyflowtype value for this Transformglobal.
     * 
     * @return transformpolicyflowtype
     */
    public org.apache.axis.types.UnsignedInt[] getTransformpolicyflowtype() {
        return transformpolicyflowtype;
    }


    /**
     * Sets the transformpolicyflowtype value for this Transformglobal.
     * 
     * @param transformpolicyflowtype
     */
    public void setTransformpolicyflowtype(org.apache.axis.types.UnsignedInt[] transformpolicyflowtype) {
        this.transformpolicyflowtype = transformpolicyflowtype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Transformglobal)) return false;
        Transformglobal other = (Transformglobal) obj;
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
            ((this.transformpolicyname==null && other.getTransformpolicyname()==null) || 
             (this.transformpolicyname!=null &&
              java.util.Arrays.equals(this.transformpolicyname, other.getTransformpolicyname()))) &&
            ((this.transformpolicybindpoint==null && other.getTransformpolicybindpoint()==null) || 
             (this.transformpolicybindpoint!=null &&
              java.util.Arrays.equals(this.transformpolicybindpoint, other.getTransformpolicybindpoint()))) &&
            ((this.transformpolicypriority==null && other.getTransformpolicypriority()==null) || 
             (this.transformpolicypriority!=null &&
              java.util.Arrays.equals(this.transformpolicypriority, other.getTransformpolicypriority()))) &&
            ((this.transformpolicygotoprioexpression==null && other.getTransformpolicygotoprioexpression()==null) || 
             (this.transformpolicygotoprioexpression!=null &&
              java.util.Arrays.equals(this.transformpolicygotoprioexpression, other.getTransformpolicygotoprioexpression()))) &&
            ((this.transforminvoke==null && other.getTransforminvoke()==null) || 
             (this.transforminvoke!=null &&
              java.util.Arrays.equals(this.transforminvoke, other.getTransforminvoke()))) &&
            ((this.transformpolicyinvokelabeltype==null && other.getTransformpolicyinvokelabeltype()==null) || 
             (this.transformpolicyinvokelabeltype!=null &&
              java.util.Arrays.equals(this.transformpolicyinvokelabeltype, other.getTransformpolicyinvokelabeltype()))) &&
            ((this.transformpolicyinvokelabelname==null && other.getTransformpolicyinvokelabelname()==null) || 
             (this.transformpolicyinvokelabelname!=null &&
              java.util.Arrays.equals(this.transformpolicyinvokelabelname, other.getTransformpolicyinvokelabelname()))) &&
            ((this.transformpolicynumpol==null && other.getTransformpolicynumpol()==null) || 
             (this.transformpolicynumpol!=null &&
              java.util.Arrays.equals(this.transformpolicynumpol, other.getTransformpolicynumpol()))) &&
            ((this.transformpolicyflowtype==null && other.getTransformpolicyflowtype()==null) || 
             (this.transformpolicyflowtype!=null &&
              java.util.Arrays.equals(this.transformpolicyflowtype, other.getTransformpolicyflowtype())));
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
        if (getTransformpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransformpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransformpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransformpolicybindpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransformpolicybindpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransformpolicybindpoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransformpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransformpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransformpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransformpolicygotoprioexpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransformpolicygotoprioexpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransformpolicygotoprioexpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransforminvoke() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransforminvoke());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransforminvoke(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransformpolicyinvokelabeltype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransformpolicyinvokelabeltype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransformpolicyinvokelabeltype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransformpolicyinvokelabelname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransformpolicyinvokelabelname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransformpolicyinvokelabelname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransformpolicynumpol() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransformpolicynumpol());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransformpolicynumpol(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTransformpolicyflowtype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransformpolicyflowtype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransformpolicyflowtype(), i);
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
        new org.apache.axis.description.TypeDesc(Transformglobal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "transformglobal"));
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
        elemField.setFieldName("transformpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transformpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transformpolicybindpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transformpolicybindpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transformpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transformpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transformpolicygotoprioexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transformpolicygotoprioexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transforminvoke");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transforminvoke"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transformpolicyinvokelabeltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transformpolicyinvokelabeltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transformpolicyinvokelabelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transformpolicyinvokelabelname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transformpolicynumpol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transformpolicynumpol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transformpolicyflowtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transformpolicyflowtype"));
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
