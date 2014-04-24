/**
 * Appfwpolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Appfwpolicy  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String rule;

    private java.lang.String profilename;

    private org.apache.axis.types.UnsignedLong hits;

    private org.apache.axis.types.UnsignedLong undefhits;

    private java.lang.String[] gotopriorityexpression;

    private java.lang.String[] labeltype;

    private java.lang.String[] labelname;

    private java.lang.String comment;

    private java.lang.String logaction;

    private java.lang.String[] boundto;

    private int[] activepolicy;

    private org.apache.axis.types.UnsignedInt[] priority;

    private java.lang.String policytype;

    public Appfwpolicy() {
    }

    public Appfwpolicy(
           java.lang.String name,
           java.lang.String rule,
           java.lang.String profilename,
           org.apache.axis.types.UnsignedLong hits,
           org.apache.axis.types.UnsignedLong undefhits,
           java.lang.String[] gotopriorityexpression,
           java.lang.String[] labeltype,
           java.lang.String[] labelname,
           java.lang.String comment,
           java.lang.String logaction,
           java.lang.String[] boundto,
           int[] activepolicy,
           org.apache.axis.types.UnsignedInt[] priority,
           java.lang.String policytype) {
           this.name = name;
           this.rule = rule;
           this.profilename = profilename;
           this.hits = hits;
           this.undefhits = undefhits;
           this.gotopriorityexpression = gotopriorityexpression;
           this.labeltype = labeltype;
           this.labelname = labelname;
           this.comment = comment;
           this.logaction = logaction;
           this.boundto = boundto;
           this.activepolicy = activepolicy;
           this.priority = priority;
           this.policytype = policytype;
    }


    /**
     * Gets the name value for this Appfwpolicy.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Appfwpolicy.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the rule value for this Appfwpolicy.
     * 
     * @return rule
     */
    public java.lang.String getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this Appfwpolicy.
     * 
     * @param rule
     */
    public void setRule(java.lang.String rule) {
        this.rule = rule;
    }


    /**
     * Gets the profilename value for this Appfwpolicy.
     * 
     * @return profilename
     */
    public java.lang.String getProfilename() {
        return profilename;
    }


    /**
     * Sets the profilename value for this Appfwpolicy.
     * 
     * @param profilename
     */
    public void setProfilename(java.lang.String profilename) {
        this.profilename = profilename;
    }


    /**
     * Gets the hits value for this Appfwpolicy.
     * 
     * @return hits
     */
    public org.apache.axis.types.UnsignedLong getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this Appfwpolicy.
     * 
     * @param hits
     */
    public void setHits(org.apache.axis.types.UnsignedLong hits) {
        this.hits = hits;
    }


    /**
     * Gets the undefhits value for this Appfwpolicy.
     * 
     * @return undefhits
     */
    public org.apache.axis.types.UnsignedLong getUndefhits() {
        return undefhits;
    }


    /**
     * Sets the undefhits value for this Appfwpolicy.
     * 
     * @param undefhits
     */
    public void setUndefhits(org.apache.axis.types.UnsignedLong undefhits) {
        this.undefhits = undefhits;
    }


    /**
     * Gets the gotopriorityexpression value for this Appfwpolicy.
     * 
     * @return gotopriorityexpression
     */
    public java.lang.String[] getGotopriorityexpression() {
        return gotopriorityexpression;
    }


    /**
     * Sets the gotopriorityexpression value for this Appfwpolicy.
     * 
     * @param gotopriorityexpression
     */
    public void setGotopriorityexpression(java.lang.String[] gotopriorityexpression) {
        this.gotopriorityexpression = gotopriorityexpression;
    }


    /**
     * Gets the labeltype value for this Appfwpolicy.
     * 
     * @return labeltype
     */
    public java.lang.String[] getLabeltype() {
        return labeltype;
    }


    /**
     * Sets the labeltype value for this Appfwpolicy.
     * 
     * @param labeltype
     */
    public void setLabeltype(java.lang.String[] labeltype) {
        this.labeltype = labeltype;
    }


    /**
     * Gets the labelname value for this Appfwpolicy.
     * 
     * @return labelname
     */
    public java.lang.String[] getLabelname() {
        return labelname;
    }


    /**
     * Sets the labelname value for this Appfwpolicy.
     * 
     * @param labelname
     */
    public void setLabelname(java.lang.String[] labelname) {
        this.labelname = labelname;
    }


    /**
     * Gets the comment value for this Appfwpolicy.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Appfwpolicy.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the logaction value for this Appfwpolicy.
     * 
     * @return logaction
     */
    public java.lang.String getLogaction() {
        return logaction;
    }


    /**
     * Sets the logaction value for this Appfwpolicy.
     * 
     * @param logaction
     */
    public void setLogaction(java.lang.String logaction) {
        this.logaction = logaction;
    }


    /**
     * Gets the boundto value for this Appfwpolicy.
     * 
     * @return boundto
     */
    public java.lang.String[] getBoundto() {
        return boundto;
    }


    /**
     * Sets the boundto value for this Appfwpolicy.
     * 
     * @param boundto
     */
    public void setBoundto(java.lang.String[] boundto) {
        this.boundto = boundto;
    }


    /**
     * Gets the activepolicy value for this Appfwpolicy.
     * 
     * @return activepolicy
     */
    public int[] getActivepolicy() {
        return activepolicy;
    }


    /**
     * Sets the activepolicy value for this Appfwpolicy.
     * 
     * @param activepolicy
     */
    public void setActivepolicy(int[] activepolicy) {
        this.activepolicy = activepolicy;
    }


    /**
     * Gets the priority value for this Appfwpolicy.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt[] getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Appfwpolicy.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt[] priority) {
        this.priority = priority;
    }


    /**
     * Gets the policytype value for this Appfwpolicy.
     * 
     * @return policytype
     */
    public java.lang.String getPolicytype() {
        return policytype;
    }


    /**
     * Sets the policytype value for this Appfwpolicy.
     * 
     * @param policytype
     */
    public void setPolicytype(java.lang.String policytype) {
        this.policytype = policytype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Appfwpolicy)) return false;
        Appfwpolicy other = (Appfwpolicy) obj;
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
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              this.rule.equals(other.getRule()))) &&
            ((this.profilename==null && other.getProfilename()==null) || 
             (this.profilename!=null &&
              this.profilename.equals(other.getProfilename()))) &&
            ((this.hits==null && other.getHits()==null) || 
             (this.hits!=null &&
              this.hits.equals(other.getHits()))) &&
            ((this.undefhits==null && other.getUndefhits()==null) || 
             (this.undefhits!=null &&
              this.undefhits.equals(other.getUndefhits()))) &&
            ((this.gotopriorityexpression==null && other.getGotopriorityexpression()==null) || 
             (this.gotopriorityexpression!=null &&
              java.util.Arrays.equals(this.gotopriorityexpression, other.getGotopriorityexpression()))) &&
            ((this.labeltype==null && other.getLabeltype()==null) || 
             (this.labeltype!=null &&
              java.util.Arrays.equals(this.labeltype, other.getLabeltype()))) &&
            ((this.labelname==null && other.getLabelname()==null) || 
             (this.labelname!=null &&
              java.util.Arrays.equals(this.labelname, other.getLabelname()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.logaction==null && other.getLogaction()==null) || 
             (this.logaction!=null &&
              this.logaction.equals(other.getLogaction()))) &&
            ((this.boundto==null && other.getBoundto()==null) || 
             (this.boundto!=null &&
              java.util.Arrays.equals(this.boundto, other.getBoundto()))) &&
            ((this.activepolicy==null && other.getActivepolicy()==null) || 
             (this.activepolicy!=null &&
              java.util.Arrays.equals(this.activepolicy, other.getActivepolicy()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              java.util.Arrays.equals(this.priority, other.getPriority()))) &&
            ((this.policytype==null && other.getPolicytype()==null) || 
             (this.policytype!=null &&
              this.policytype.equals(other.getPolicytype())));
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
        if (getRule() != null) {
            _hashCode += getRule().hashCode();
        }
        if (getProfilename() != null) {
            _hashCode += getProfilename().hashCode();
        }
        if (getHits() != null) {
            _hashCode += getHits().hashCode();
        }
        if (getUndefhits() != null) {
            _hashCode += getUndefhits().hashCode();
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
        if (getLabeltype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLabeltype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLabeltype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLabelname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLabelname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLabelname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getLogaction() != null) {
            _hashCode += getLogaction().hashCode();
        }
        if (getBoundto() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundto());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundto(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getActivepolicy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActivepolicy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActivepolicy(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPolicytype() != null) {
            _hashCode += getPolicytype().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Appfwpolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "appfwpolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
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
        elemField.setFieldName("profilename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profilename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undefhits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "undefhits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gotopriorityexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gotopriorityexpression"));
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
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
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
        elemField.setFieldName("boundto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activepolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activepolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policytype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policytype"));
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
