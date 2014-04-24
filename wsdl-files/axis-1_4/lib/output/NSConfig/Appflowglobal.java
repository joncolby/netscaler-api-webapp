/**
 * Appflowglobal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Appflowglobal  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String policyname;

    private org.apache.axis.types.UnsignedInt priority;

    private java.lang.String gotopriorityexpression;

    private boolean invoke;

    private java.lang.String labeltype;

    private java.lang.String labelname;

    private org.apache.axis.types.UnsignedInt numpol;

    private org.apache.axis.types.UnsignedInt flowtype;

    private java.lang.String[] appflowpolicyname;

    private java.lang.String[] appflowpolicybindpoint;

    private org.apache.axis.types.UnsignedInt[] appflowpolicypriority;

    private java.lang.String[] appflowpolicygotoprioexpression;

    private boolean[] appflowinvoke;

    private java.lang.String[] appflowpolicyinvokelabeltype;

    private java.lang.String[] appflowpolicyinvokelabelname;

    private org.apache.axis.types.UnsignedInt[] appflowpolicynumpol;

    private org.apache.axis.types.UnsignedInt[] appflowpolicyflowtype;

    public Appflowglobal() {
    }

    public Appflowglobal(
           java.lang.String type,
           java.lang.String policyname,
           org.apache.axis.types.UnsignedInt priority,
           java.lang.String gotopriorityexpression,
           boolean invoke,
           java.lang.String labeltype,
           java.lang.String labelname,
           org.apache.axis.types.UnsignedInt numpol,
           org.apache.axis.types.UnsignedInt flowtype,
           java.lang.String[] appflowpolicyname,
           java.lang.String[] appflowpolicybindpoint,
           org.apache.axis.types.UnsignedInt[] appflowpolicypriority,
           java.lang.String[] appflowpolicygotoprioexpression,
           boolean[] appflowinvoke,
           java.lang.String[] appflowpolicyinvokelabeltype,
           java.lang.String[] appflowpolicyinvokelabelname,
           org.apache.axis.types.UnsignedInt[] appflowpolicynumpol,
           org.apache.axis.types.UnsignedInt[] appflowpolicyflowtype) {
           this.type = type;
           this.policyname = policyname;
           this.priority = priority;
           this.gotopriorityexpression = gotopriorityexpression;
           this.invoke = invoke;
           this.labeltype = labeltype;
           this.labelname = labelname;
           this.numpol = numpol;
           this.flowtype = flowtype;
           this.appflowpolicyname = appflowpolicyname;
           this.appflowpolicybindpoint = appflowpolicybindpoint;
           this.appflowpolicypriority = appflowpolicypriority;
           this.appflowpolicygotoprioexpression = appflowpolicygotoprioexpression;
           this.appflowinvoke = appflowinvoke;
           this.appflowpolicyinvokelabeltype = appflowpolicyinvokelabeltype;
           this.appflowpolicyinvokelabelname = appflowpolicyinvokelabelname;
           this.appflowpolicynumpol = appflowpolicynumpol;
           this.appflowpolicyflowtype = appflowpolicyflowtype;
    }


    /**
     * Gets the type value for this Appflowglobal.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Appflowglobal.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the policyname value for this Appflowglobal.
     * 
     * @return policyname
     */
    public java.lang.String getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Appflowglobal.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the priority value for this Appflowglobal.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Appflowglobal.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the gotopriorityexpression value for this Appflowglobal.
     * 
     * @return gotopriorityexpression
     */
    public java.lang.String getGotopriorityexpression() {
        return gotopriorityexpression;
    }


    /**
     * Sets the gotopriorityexpression value for this Appflowglobal.
     * 
     * @param gotopriorityexpression
     */
    public void setGotopriorityexpression(java.lang.String gotopriorityexpression) {
        this.gotopriorityexpression = gotopriorityexpression;
    }


    /**
     * Gets the invoke value for this Appflowglobal.
     * 
     * @return invoke
     */
    public boolean isInvoke() {
        return invoke;
    }


    /**
     * Sets the invoke value for this Appflowglobal.
     * 
     * @param invoke
     */
    public void setInvoke(boolean invoke) {
        this.invoke = invoke;
    }


    /**
     * Gets the labeltype value for this Appflowglobal.
     * 
     * @return labeltype
     */
    public java.lang.String getLabeltype() {
        return labeltype;
    }


    /**
     * Sets the labeltype value for this Appflowglobal.
     * 
     * @param labeltype
     */
    public void setLabeltype(java.lang.String labeltype) {
        this.labeltype = labeltype;
    }


    /**
     * Gets the labelname value for this Appflowglobal.
     * 
     * @return labelname
     */
    public java.lang.String getLabelname() {
        return labelname;
    }


    /**
     * Sets the labelname value for this Appflowglobal.
     * 
     * @param labelname
     */
    public void setLabelname(java.lang.String labelname) {
        this.labelname = labelname;
    }


    /**
     * Gets the numpol value for this Appflowglobal.
     * 
     * @return numpol
     */
    public org.apache.axis.types.UnsignedInt getNumpol() {
        return numpol;
    }


    /**
     * Sets the numpol value for this Appflowglobal.
     * 
     * @param numpol
     */
    public void setNumpol(org.apache.axis.types.UnsignedInt numpol) {
        this.numpol = numpol;
    }


    /**
     * Gets the flowtype value for this Appflowglobal.
     * 
     * @return flowtype
     */
    public org.apache.axis.types.UnsignedInt getFlowtype() {
        return flowtype;
    }


    /**
     * Sets the flowtype value for this Appflowglobal.
     * 
     * @param flowtype
     */
    public void setFlowtype(org.apache.axis.types.UnsignedInt flowtype) {
        this.flowtype = flowtype;
    }


    /**
     * Gets the appflowpolicyname value for this Appflowglobal.
     * 
     * @return appflowpolicyname
     */
    public java.lang.String[] getAppflowpolicyname() {
        return appflowpolicyname;
    }


    /**
     * Sets the appflowpolicyname value for this Appflowglobal.
     * 
     * @param appflowpolicyname
     */
    public void setAppflowpolicyname(java.lang.String[] appflowpolicyname) {
        this.appflowpolicyname = appflowpolicyname;
    }


    /**
     * Gets the appflowpolicybindpoint value for this Appflowglobal.
     * 
     * @return appflowpolicybindpoint
     */
    public java.lang.String[] getAppflowpolicybindpoint() {
        return appflowpolicybindpoint;
    }


    /**
     * Sets the appflowpolicybindpoint value for this Appflowglobal.
     * 
     * @param appflowpolicybindpoint
     */
    public void setAppflowpolicybindpoint(java.lang.String[] appflowpolicybindpoint) {
        this.appflowpolicybindpoint = appflowpolicybindpoint;
    }


    /**
     * Gets the appflowpolicypriority value for this Appflowglobal.
     * 
     * @return appflowpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getAppflowpolicypriority() {
        return appflowpolicypriority;
    }


    /**
     * Sets the appflowpolicypriority value for this Appflowglobal.
     * 
     * @param appflowpolicypriority
     */
    public void setAppflowpolicypriority(org.apache.axis.types.UnsignedInt[] appflowpolicypriority) {
        this.appflowpolicypriority = appflowpolicypriority;
    }


    /**
     * Gets the appflowpolicygotoprioexpression value for this Appflowglobal.
     * 
     * @return appflowpolicygotoprioexpression
     */
    public java.lang.String[] getAppflowpolicygotoprioexpression() {
        return appflowpolicygotoprioexpression;
    }


    /**
     * Sets the appflowpolicygotoprioexpression value for this Appflowglobal.
     * 
     * @param appflowpolicygotoprioexpression
     */
    public void setAppflowpolicygotoprioexpression(java.lang.String[] appflowpolicygotoprioexpression) {
        this.appflowpolicygotoprioexpression = appflowpolicygotoprioexpression;
    }


    /**
     * Gets the appflowinvoke value for this Appflowglobal.
     * 
     * @return appflowinvoke
     */
    public boolean[] getAppflowinvoke() {
        return appflowinvoke;
    }


    /**
     * Sets the appflowinvoke value for this Appflowglobal.
     * 
     * @param appflowinvoke
     */
    public void setAppflowinvoke(boolean[] appflowinvoke) {
        this.appflowinvoke = appflowinvoke;
    }


    /**
     * Gets the appflowpolicyinvokelabeltype value for this Appflowglobal.
     * 
     * @return appflowpolicyinvokelabeltype
     */
    public java.lang.String[] getAppflowpolicyinvokelabeltype() {
        return appflowpolicyinvokelabeltype;
    }


    /**
     * Sets the appflowpolicyinvokelabeltype value for this Appflowglobal.
     * 
     * @param appflowpolicyinvokelabeltype
     */
    public void setAppflowpolicyinvokelabeltype(java.lang.String[] appflowpolicyinvokelabeltype) {
        this.appflowpolicyinvokelabeltype = appflowpolicyinvokelabeltype;
    }


    /**
     * Gets the appflowpolicyinvokelabelname value for this Appflowglobal.
     * 
     * @return appflowpolicyinvokelabelname
     */
    public java.lang.String[] getAppflowpolicyinvokelabelname() {
        return appflowpolicyinvokelabelname;
    }


    /**
     * Sets the appflowpolicyinvokelabelname value for this Appflowglobal.
     * 
     * @param appflowpolicyinvokelabelname
     */
    public void setAppflowpolicyinvokelabelname(java.lang.String[] appflowpolicyinvokelabelname) {
        this.appflowpolicyinvokelabelname = appflowpolicyinvokelabelname;
    }


    /**
     * Gets the appflowpolicynumpol value for this Appflowglobal.
     * 
     * @return appflowpolicynumpol
     */
    public org.apache.axis.types.UnsignedInt[] getAppflowpolicynumpol() {
        return appflowpolicynumpol;
    }


    /**
     * Sets the appflowpolicynumpol value for this Appflowglobal.
     * 
     * @param appflowpolicynumpol
     */
    public void setAppflowpolicynumpol(org.apache.axis.types.UnsignedInt[] appflowpolicynumpol) {
        this.appflowpolicynumpol = appflowpolicynumpol;
    }


    /**
     * Gets the appflowpolicyflowtype value for this Appflowglobal.
     * 
     * @return appflowpolicyflowtype
     */
    public org.apache.axis.types.UnsignedInt[] getAppflowpolicyflowtype() {
        return appflowpolicyflowtype;
    }


    /**
     * Sets the appflowpolicyflowtype value for this Appflowglobal.
     * 
     * @param appflowpolicyflowtype
     */
    public void setAppflowpolicyflowtype(org.apache.axis.types.UnsignedInt[] appflowpolicyflowtype) {
        this.appflowpolicyflowtype = appflowpolicyflowtype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Appflowglobal)) return false;
        Appflowglobal other = (Appflowglobal) obj;
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
            ((this.appflowpolicyname==null && other.getAppflowpolicyname()==null) || 
             (this.appflowpolicyname!=null &&
              java.util.Arrays.equals(this.appflowpolicyname, other.getAppflowpolicyname()))) &&
            ((this.appflowpolicybindpoint==null && other.getAppflowpolicybindpoint()==null) || 
             (this.appflowpolicybindpoint!=null &&
              java.util.Arrays.equals(this.appflowpolicybindpoint, other.getAppflowpolicybindpoint()))) &&
            ((this.appflowpolicypriority==null && other.getAppflowpolicypriority()==null) || 
             (this.appflowpolicypriority!=null &&
              java.util.Arrays.equals(this.appflowpolicypriority, other.getAppflowpolicypriority()))) &&
            ((this.appflowpolicygotoprioexpression==null && other.getAppflowpolicygotoprioexpression()==null) || 
             (this.appflowpolicygotoprioexpression!=null &&
              java.util.Arrays.equals(this.appflowpolicygotoprioexpression, other.getAppflowpolicygotoprioexpression()))) &&
            ((this.appflowinvoke==null && other.getAppflowinvoke()==null) || 
             (this.appflowinvoke!=null &&
              java.util.Arrays.equals(this.appflowinvoke, other.getAppflowinvoke()))) &&
            ((this.appflowpolicyinvokelabeltype==null && other.getAppflowpolicyinvokelabeltype()==null) || 
             (this.appflowpolicyinvokelabeltype!=null &&
              java.util.Arrays.equals(this.appflowpolicyinvokelabeltype, other.getAppflowpolicyinvokelabeltype()))) &&
            ((this.appflowpolicyinvokelabelname==null && other.getAppflowpolicyinvokelabelname()==null) || 
             (this.appflowpolicyinvokelabelname!=null &&
              java.util.Arrays.equals(this.appflowpolicyinvokelabelname, other.getAppflowpolicyinvokelabelname()))) &&
            ((this.appflowpolicynumpol==null && other.getAppflowpolicynumpol()==null) || 
             (this.appflowpolicynumpol!=null &&
              java.util.Arrays.equals(this.appflowpolicynumpol, other.getAppflowpolicynumpol()))) &&
            ((this.appflowpolicyflowtype==null && other.getAppflowpolicyflowtype()==null) || 
             (this.appflowpolicyflowtype!=null &&
              java.util.Arrays.equals(this.appflowpolicyflowtype, other.getAppflowpolicyflowtype())));
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
        if (getAppflowpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppflowpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppflowpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppflowpolicybindpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppflowpolicybindpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppflowpolicybindpoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppflowpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppflowpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppflowpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppflowpolicygotoprioexpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppflowpolicygotoprioexpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppflowpolicygotoprioexpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppflowinvoke() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppflowinvoke());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppflowinvoke(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppflowpolicyinvokelabeltype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppflowpolicyinvokelabeltype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppflowpolicyinvokelabeltype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppflowpolicyinvokelabelname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppflowpolicyinvokelabelname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppflowpolicyinvokelabelname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppflowpolicynumpol() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppflowpolicynumpol());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppflowpolicynumpol(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAppflowpolicyflowtype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppflowpolicyflowtype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppflowpolicyflowtype(), i);
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
        new org.apache.axis.description.TypeDesc(Appflowglobal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "appflowglobal"));
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
        elemField.setFieldName("appflowpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appflowpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appflowpolicybindpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appflowpolicybindpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appflowpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appflowpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appflowpolicygotoprioexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appflowpolicygotoprioexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appflowinvoke");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appflowinvoke"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appflowpolicyinvokelabeltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appflowpolicyinvokelabeltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appflowpolicyinvokelabelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appflowpolicyinvokelabelname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appflowpolicynumpol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appflowpolicynumpol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appflowpolicyflowtype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appflowpolicyflowtype"));
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
