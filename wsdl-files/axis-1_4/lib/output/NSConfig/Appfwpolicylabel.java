/**
 * Appfwpolicylabel.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Appfwpolicylabel  implements java.io.Serializable {
    private java.lang.String labelname;

    private java.lang.String policylabeltype;

    private org.apache.axis.types.UnsignedInt numpol;

    private org.apache.axis.types.UnsignedLong hits;

    private java.lang.String[] policyname;

    private org.apache.axis.types.UnsignedInt priority;

    private java.lang.String gotopriorityexpression;

    private boolean[] invoke;

    private java.lang.String labeltype;

    private java.lang.String labelname2;

    private java.lang.String description;

    private java.lang.String policytype;

    private java.lang.String[] appfwpolicylabelname;

    private org.apache.axis.types.UnsignedInt[] boundpriority;

    private java.lang.String[] boundgotoprioexpression;

    private java.lang.String[] boundinvokelabeltype;

    private java.lang.String[] boundinvokelabelname;

    public Appfwpolicylabel() {
    }

    public Appfwpolicylabel(
           java.lang.String labelname,
           java.lang.String policylabeltype,
           org.apache.axis.types.UnsignedInt numpol,
           org.apache.axis.types.UnsignedLong hits,
           java.lang.String[] policyname,
           org.apache.axis.types.UnsignedInt priority,
           java.lang.String gotopriorityexpression,
           boolean[] invoke,
           java.lang.String labeltype,
           java.lang.String labelname2,
           java.lang.String description,
           java.lang.String policytype,
           java.lang.String[] appfwpolicylabelname,
           org.apache.axis.types.UnsignedInt[] boundpriority,
           java.lang.String[] boundgotoprioexpression,
           java.lang.String[] boundinvokelabeltype,
           java.lang.String[] boundinvokelabelname) {
           this.labelname = labelname;
           this.policylabeltype = policylabeltype;
           this.numpol = numpol;
           this.hits = hits;
           this.policyname = policyname;
           this.priority = priority;
           this.gotopriorityexpression = gotopriorityexpression;
           this.invoke = invoke;
           this.labeltype = labeltype;
           this.labelname2 = labelname2;
           this.description = description;
           this.policytype = policytype;
           this.appfwpolicylabelname = appfwpolicylabelname;
           this.boundpriority = boundpriority;
           this.boundgotoprioexpression = boundgotoprioexpression;
           this.boundinvokelabeltype = boundinvokelabeltype;
           this.boundinvokelabelname = boundinvokelabelname;
    }


    /**
     * Gets the labelname value for this Appfwpolicylabel.
     * 
     * @return labelname
     */
    public java.lang.String getLabelname() {
        return labelname;
    }


    /**
     * Sets the labelname value for this Appfwpolicylabel.
     * 
     * @param labelname
     */
    public void setLabelname(java.lang.String labelname) {
        this.labelname = labelname;
    }


    /**
     * Gets the policylabeltype value for this Appfwpolicylabel.
     * 
     * @return policylabeltype
     */
    public java.lang.String getPolicylabeltype() {
        return policylabeltype;
    }


    /**
     * Sets the policylabeltype value for this Appfwpolicylabel.
     * 
     * @param policylabeltype
     */
    public void setPolicylabeltype(java.lang.String policylabeltype) {
        this.policylabeltype = policylabeltype;
    }


    /**
     * Gets the numpol value for this Appfwpolicylabel.
     * 
     * @return numpol
     */
    public org.apache.axis.types.UnsignedInt getNumpol() {
        return numpol;
    }


    /**
     * Sets the numpol value for this Appfwpolicylabel.
     * 
     * @param numpol
     */
    public void setNumpol(org.apache.axis.types.UnsignedInt numpol) {
        this.numpol = numpol;
    }


    /**
     * Gets the hits value for this Appfwpolicylabel.
     * 
     * @return hits
     */
    public org.apache.axis.types.UnsignedLong getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this Appfwpolicylabel.
     * 
     * @param hits
     */
    public void setHits(org.apache.axis.types.UnsignedLong hits) {
        this.hits = hits;
    }


    /**
     * Gets the policyname value for this Appfwpolicylabel.
     * 
     * @return policyname
     */
    public java.lang.String[] getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Appfwpolicylabel.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String[] policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the priority value for this Appfwpolicylabel.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Appfwpolicylabel.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the gotopriorityexpression value for this Appfwpolicylabel.
     * 
     * @return gotopriorityexpression
     */
    public java.lang.String getGotopriorityexpression() {
        return gotopriorityexpression;
    }


    /**
     * Sets the gotopriorityexpression value for this Appfwpolicylabel.
     * 
     * @param gotopriorityexpression
     */
    public void setGotopriorityexpression(java.lang.String gotopriorityexpression) {
        this.gotopriorityexpression = gotopriorityexpression;
    }


    /**
     * Gets the invoke value for this Appfwpolicylabel.
     * 
     * @return invoke
     */
    public boolean[] getInvoke() {
        return invoke;
    }


    /**
     * Sets the invoke value for this Appfwpolicylabel.
     * 
     * @param invoke
     */
    public void setInvoke(boolean[] invoke) {
        this.invoke = invoke;
    }


    /**
     * Gets the labeltype value for this Appfwpolicylabel.
     * 
     * @return labeltype
     */
    public java.lang.String getLabeltype() {
        return labeltype;
    }


    /**
     * Sets the labeltype value for this Appfwpolicylabel.
     * 
     * @param labeltype
     */
    public void setLabeltype(java.lang.String labeltype) {
        this.labeltype = labeltype;
    }


    /**
     * Gets the labelname2 value for this Appfwpolicylabel.
     * 
     * @return labelname2
     */
    public java.lang.String getLabelname2() {
        return labelname2;
    }


    /**
     * Sets the labelname2 value for this Appfwpolicylabel.
     * 
     * @param labelname2
     */
    public void setLabelname2(java.lang.String labelname2) {
        this.labelname2 = labelname2;
    }


    /**
     * Gets the description value for this Appfwpolicylabel.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Appfwpolicylabel.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the policytype value for this Appfwpolicylabel.
     * 
     * @return policytype
     */
    public java.lang.String getPolicytype() {
        return policytype;
    }


    /**
     * Sets the policytype value for this Appfwpolicylabel.
     * 
     * @param policytype
     */
    public void setPolicytype(java.lang.String policytype) {
        this.policytype = policytype;
    }


    /**
     * Gets the appfwpolicylabelname value for this Appfwpolicylabel.
     * 
     * @return appfwpolicylabelname
     */
    public java.lang.String[] getAppfwpolicylabelname() {
        return appfwpolicylabelname;
    }


    /**
     * Sets the appfwpolicylabelname value for this Appfwpolicylabel.
     * 
     * @param appfwpolicylabelname
     */
    public void setAppfwpolicylabelname(java.lang.String[] appfwpolicylabelname) {
        this.appfwpolicylabelname = appfwpolicylabelname;
    }


    /**
     * Gets the boundpriority value for this Appfwpolicylabel.
     * 
     * @return boundpriority
     */
    public org.apache.axis.types.UnsignedInt[] getBoundpriority() {
        return boundpriority;
    }


    /**
     * Sets the boundpriority value for this Appfwpolicylabel.
     * 
     * @param boundpriority
     */
    public void setBoundpriority(org.apache.axis.types.UnsignedInt[] boundpriority) {
        this.boundpriority = boundpriority;
    }


    /**
     * Gets the boundgotoprioexpression value for this Appfwpolicylabel.
     * 
     * @return boundgotoprioexpression
     */
    public java.lang.String[] getBoundgotoprioexpression() {
        return boundgotoprioexpression;
    }


    /**
     * Sets the boundgotoprioexpression value for this Appfwpolicylabel.
     * 
     * @param boundgotoprioexpression
     */
    public void setBoundgotoprioexpression(java.lang.String[] boundgotoprioexpression) {
        this.boundgotoprioexpression = boundgotoprioexpression;
    }


    /**
     * Gets the boundinvokelabeltype value for this Appfwpolicylabel.
     * 
     * @return boundinvokelabeltype
     */
    public java.lang.String[] getBoundinvokelabeltype() {
        return boundinvokelabeltype;
    }


    /**
     * Sets the boundinvokelabeltype value for this Appfwpolicylabel.
     * 
     * @param boundinvokelabeltype
     */
    public void setBoundinvokelabeltype(java.lang.String[] boundinvokelabeltype) {
        this.boundinvokelabeltype = boundinvokelabeltype;
    }


    /**
     * Gets the boundinvokelabelname value for this Appfwpolicylabel.
     * 
     * @return boundinvokelabelname
     */
    public java.lang.String[] getBoundinvokelabelname() {
        return boundinvokelabelname;
    }


    /**
     * Sets the boundinvokelabelname value for this Appfwpolicylabel.
     * 
     * @param boundinvokelabelname
     */
    public void setBoundinvokelabelname(java.lang.String[] boundinvokelabelname) {
        this.boundinvokelabelname = boundinvokelabelname;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Appfwpolicylabel)) return false;
        Appfwpolicylabel other = (Appfwpolicylabel) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.labelname==null && other.getLabelname()==null) || 
             (this.labelname!=null &&
              this.labelname.equals(other.getLabelname()))) &&
            ((this.policylabeltype==null && other.getPolicylabeltype()==null) || 
             (this.policylabeltype!=null &&
              this.policylabeltype.equals(other.getPolicylabeltype()))) &&
            ((this.numpol==null && other.getNumpol()==null) || 
             (this.numpol!=null &&
              this.numpol.equals(other.getNumpol()))) &&
            ((this.hits==null && other.getHits()==null) || 
             (this.hits!=null &&
              this.hits.equals(other.getHits()))) &&
            ((this.policyname==null && other.getPolicyname()==null) || 
             (this.policyname!=null &&
              java.util.Arrays.equals(this.policyname, other.getPolicyname()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.gotopriorityexpression==null && other.getGotopriorityexpression()==null) || 
             (this.gotopriorityexpression!=null &&
              this.gotopriorityexpression.equals(other.getGotopriorityexpression()))) &&
            ((this.invoke==null && other.getInvoke()==null) || 
             (this.invoke!=null &&
              java.util.Arrays.equals(this.invoke, other.getInvoke()))) &&
            ((this.labeltype==null && other.getLabeltype()==null) || 
             (this.labeltype!=null &&
              this.labeltype.equals(other.getLabeltype()))) &&
            ((this.labelname2==null && other.getLabelname2()==null) || 
             (this.labelname2!=null &&
              this.labelname2.equals(other.getLabelname2()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.policytype==null && other.getPolicytype()==null) || 
             (this.policytype!=null &&
              this.policytype.equals(other.getPolicytype()))) &&
            ((this.appfwpolicylabelname==null && other.getAppfwpolicylabelname()==null) || 
             (this.appfwpolicylabelname!=null &&
              java.util.Arrays.equals(this.appfwpolicylabelname, other.getAppfwpolicylabelname()))) &&
            ((this.boundpriority==null && other.getBoundpriority()==null) || 
             (this.boundpriority!=null &&
              java.util.Arrays.equals(this.boundpriority, other.getBoundpriority()))) &&
            ((this.boundgotoprioexpression==null && other.getBoundgotoprioexpression()==null) || 
             (this.boundgotoprioexpression!=null &&
              java.util.Arrays.equals(this.boundgotoprioexpression, other.getBoundgotoprioexpression()))) &&
            ((this.boundinvokelabeltype==null && other.getBoundinvokelabeltype()==null) || 
             (this.boundinvokelabeltype!=null &&
              java.util.Arrays.equals(this.boundinvokelabeltype, other.getBoundinvokelabeltype()))) &&
            ((this.boundinvokelabelname==null && other.getBoundinvokelabelname()==null) || 
             (this.boundinvokelabelname!=null &&
              java.util.Arrays.equals(this.boundinvokelabelname, other.getBoundinvokelabelname())));
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
        if (getLabelname() != null) {
            _hashCode += getLabelname().hashCode();
        }
        if (getPolicylabeltype() != null) {
            _hashCode += getPolicylabeltype().hashCode();
        }
        if (getNumpol() != null) {
            _hashCode += getNumpol().hashCode();
        }
        if (getHits() != null) {
            _hashCode += getHits().hashCode();
        }
        if (getPolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getGotopriorityexpression() != null) {
            _hashCode += getGotopriorityexpression().hashCode();
        }
        if (getInvoke() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvoke());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvoke(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLabeltype() != null) {
            _hashCode += getLabeltype().hashCode();
        }
        if (getLabelname2() != null) {
            _hashCode += getLabelname2().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getPolicytype() != null) {
            _hashCode += getPolicytype().hashCode();
        }
        if (getAppfwpolicylabelname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAppfwpolicylabelname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAppfwpolicylabelname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBoundpriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundpriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundpriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBoundgotoprioexpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundgotoprioexpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundgotoprioexpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBoundinvokelabeltype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundinvokelabeltype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundinvokelabeltype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBoundinvokelabelname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundinvokelabelname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundinvokelabelname(), i);
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
        new org.apache.axis.description.TypeDesc(Appfwpolicylabel.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "appfwpolicylabel"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("labelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "labelname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policylabeltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policylabeltype"));
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
        elemField.setFieldName("hits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
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
        elemField.setFieldName("labelname2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "labelname2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policytype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policytype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appfwpolicylabelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appfwpolicylabelname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundpriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundpriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundgotoprioexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundgotoprioexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundinvokelabeltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundinvokelabeltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundinvokelabelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundinvokelabelname"));
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
