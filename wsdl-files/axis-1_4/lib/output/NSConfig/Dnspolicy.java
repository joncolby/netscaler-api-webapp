/**
 * Dnspolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Dnspolicy  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String rule;

    private java.lang.String viewname;

    private java.lang.String preferredlocation;

    private java.lang.String[] preferredloclist;

    private org.apache.axis.types.UnsignedLong hits;

    private org.apache.axis.types.UnsignedLong undefhits;

    private java.lang.String drop;

    private java.lang.String actionname;

    private java.lang.String cachebypass;

    private int[] activepolicy;

    private java.lang.String[] boundto;

    private org.apache.axis.types.UnsignedInt[] priority;

    private java.lang.String[] gotopriorityexpression;

    private java.lang.String[] labeltype;

    private java.lang.String[] labelname;

    private java.lang.String description;

    private java.lang.String builtin;

    public Dnspolicy() {
    }

    public Dnspolicy(
           java.lang.String name,
           java.lang.String rule,
           java.lang.String viewname,
           java.lang.String preferredlocation,
           java.lang.String[] preferredloclist,
           org.apache.axis.types.UnsignedLong hits,
           org.apache.axis.types.UnsignedLong undefhits,
           java.lang.String drop,
           java.lang.String actionname,
           java.lang.String cachebypass,
           int[] activepolicy,
           java.lang.String[] boundto,
           org.apache.axis.types.UnsignedInt[] priority,
           java.lang.String[] gotopriorityexpression,
           java.lang.String[] labeltype,
           java.lang.String[] labelname,
           java.lang.String description,
           java.lang.String builtin) {
           this.name = name;
           this.rule = rule;
           this.viewname = viewname;
           this.preferredlocation = preferredlocation;
           this.preferredloclist = preferredloclist;
           this.hits = hits;
           this.undefhits = undefhits;
           this.drop = drop;
           this.actionname = actionname;
           this.cachebypass = cachebypass;
           this.activepolicy = activepolicy;
           this.boundto = boundto;
           this.priority = priority;
           this.gotopriorityexpression = gotopriorityexpression;
           this.labeltype = labeltype;
           this.labelname = labelname;
           this.description = description;
           this.builtin = builtin;
    }


    /**
     * Gets the name value for this Dnspolicy.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Dnspolicy.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the rule value for this Dnspolicy.
     * 
     * @return rule
     */
    public java.lang.String getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this Dnspolicy.
     * 
     * @param rule
     */
    public void setRule(java.lang.String rule) {
        this.rule = rule;
    }


    /**
     * Gets the viewname value for this Dnspolicy.
     * 
     * @return viewname
     */
    public java.lang.String getViewname() {
        return viewname;
    }


    /**
     * Sets the viewname value for this Dnspolicy.
     * 
     * @param viewname
     */
    public void setViewname(java.lang.String viewname) {
        this.viewname = viewname;
    }


    /**
     * Gets the preferredlocation value for this Dnspolicy.
     * 
     * @return preferredlocation
     */
    public java.lang.String getPreferredlocation() {
        return preferredlocation;
    }


    /**
     * Sets the preferredlocation value for this Dnspolicy.
     * 
     * @param preferredlocation
     */
    public void setPreferredlocation(java.lang.String preferredlocation) {
        this.preferredlocation = preferredlocation;
    }


    /**
     * Gets the preferredloclist value for this Dnspolicy.
     * 
     * @return preferredloclist
     */
    public java.lang.String[] getPreferredloclist() {
        return preferredloclist;
    }


    /**
     * Sets the preferredloclist value for this Dnspolicy.
     * 
     * @param preferredloclist
     */
    public void setPreferredloclist(java.lang.String[] preferredloclist) {
        this.preferredloclist = preferredloclist;
    }


    /**
     * Gets the hits value for this Dnspolicy.
     * 
     * @return hits
     */
    public org.apache.axis.types.UnsignedLong getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this Dnspolicy.
     * 
     * @param hits
     */
    public void setHits(org.apache.axis.types.UnsignedLong hits) {
        this.hits = hits;
    }


    /**
     * Gets the undefhits value for this Dnspolicy.
     * 
     * @return undefhits
     */
    public org.apache.axis.types.UnsignedLong getUndefhits() {
        return undefhits;
    }


    /**
     * Sets the undefhits value for this Dnspolicy.
     * 
     * @param undefhits
     */
    public void setUndefhits(org.apache.axis.types.UnsignedLong undefhits) {
        this.undefhits = undefhits;
    }


    /**
     * Gets the drop value for this Dnspolicy.
     * 
     * @return drop
     */
    public java.lang.String getDrop() {
        return drop;
    }


    /**
     * Sets the drop value for this Dnspolicy.
     * 
     * @param drop
     */
    public void setDrop(java.lang.String drop) {
        this.drop = drop;
    }


    /**
     * Gets the actionname value for this Dnspolicy.
     * 
     * @return actionname
     */
    public java.lang.String getActionname() {
        return actionname;
    }


    /**
     * Sets the actionname value for this Dnspolicy.
     * 
     * @param actionname
     */
    public void setActionname(java.lang.String actionname) {
        this.actionname = actionname;
    }


    /**
     * Gets the cachebypass value for this Dnspolicy.
     * 
     * @return cachebypass
     */
    public java.lang.String getCachebypass() {
        return cachebypass;
    }


    /**
     * Sets the cachebypass value for this Dnspolicy.
     * 
     * @param cachebypass
     */
    public void setCachebypass(java.lang.String cachebypass) {
        this.cachebypass = cachebypass;
    }


    /**
     * Gets the activepolicy value for this Dnspolicy.
     * 
     * @return activepolicy
     */
    public int[] getActivepolicy() {
        return activepolicy;
    }


    /**
     * Sets the activepolicy value for this Dnspolicy.
     * 
     * @param activepolicy
     */
    public void setActivepolicy(int[] activepolicy) {
        this.activepolicy = activepolicy;
    }


    /**
     * Gets the boundto value for this Dnspolicy.
     * 
     * @return boundto
     */
    public java.lang.String[] getBoundto() {
        return boundto;
    }


    /**
     * Sets the boundto value for this Dnspolicy.
     * 
     * @param boundto
     */
    public void setBoundto(java.lang.String[] boundto) {
        this.boundto = boundto;
    }


    /**
     * Gets the priority value for this Dnspolicy.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt[] getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Dnspolicy.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt[] priority) {
        this.priority = priority;
    }


    /**
     * Gets the gotopriorityexpression value for this Dnspolicy.
     * 
     * @return gotopriorityexpression
     */
    public java.lang.String[] getGotopriorityexpression() {
        return gotopriorityexpression;
    }


    /**
     * Sets the gotopriorityexpression value for this Dnspolicy.
     * 
     * @param gotopriorityexpression
     */
    public void setGotopriorityexpression(java.lang.String[] gotopriorityexpression) {
        this.gotopriorityexpression = gotopriorityexpression;
    }


    /**
     * Gets the labeltype value for this Dnspolicy.
     * 
     * @return labeltype
     */
    public java.lang.String[] getLabeltype() {
        return labeltype;
    }


    /**
     * Sets the labeltype value for this Dnspolicy.
     * 
     * @param labeltype
     */
    public void setLabeltype(java.lang.String[] labeltype) {
        this.labeltype = labeltype;
    }


    /**
     * Gets the labelname value for this Dnspolicy.
     * 
     * @return labelname
     */
    public java.lang.String[] getLabelname() {
        return labelname;
    }


    /**
     * Sets the labelname value for this Dnspolicy.
     * 
     * @param labelname
     */
    public void setLabelname(java.lang.String[] labelname) {
        this.labelname = labelname;
    }


    /**
     * Gets the description value for this Dnspolicy.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Dnspolicy.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the builtin value for this Dnspolicy.
     * 
     * @return builtin
     */
    public java.lang.String getBuiltin() {
        return builtin;
    }


    /**
     * Sets the builtin value for this Dnspolicy.
     * 
     * @param builtin
     */
    public void setBuiltin(java.lang.String builtin) {
        this.builtin = builtin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Dnspolicy)) return false;
        Dnspolicy other = (Dnspolicy) obj;
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
            ((this.viewname==null && other.getViewname()==null) || 
             (this.viewname!=null &&
              this.viewname.equals(other.getViewname()))) &&
            ((this.preferredlocation==null && other.getPreferredlocation()==null) || 
             (this.preferredlocation!=null &&
              this.preferredlocation.equals(other.getPreferredlocation()))) &&
            ((this.preferredloclist==null && other.getPreferredloclist()==null) || 
             (this.preferredloclist!=null &&
              java.util.Arrays.equals(this.preferredloclist, other.getPreferredloclist()))) &&
            ((this.hits==null && other.getHits()==null) || 
             (this.hits!=null &&
              this.hits.equals(other.getHits()))) &&
            ((this.undefhits==null && other.getUndefhits()==null) || 
             (this.undefhits!=null &&
              this.undefhits.equals(other.getUndefhits()))) &&
            ((this.drop==null && other.getDrop()==null) || 
             (this.drop!=null &&
              this.drop.equals(other.getDrop()))) &&
            ((this.actionname==null && other.getActionname()==null) || 
             (this.actionname!=null &&
              this.actionname.equals(other.getActionname()))) &&
            ((this.cachebypass==null && other.getCachebypass()==null) || 
             (this.cachebypass!=null &&
              this.cachebypass.equals(other.getCachebypass()))) &&
            ((this.activepolicy==null && other.getActivepolicy()==null) || 
             (this.activepolicy!=null &&
              java.util.Arrays.equals(this.activepolicy, other.getActivepolicy()))) &&
            ((this.boundto==null && other.getBoundto()==null) || 
             (this.boundto!=null &&
              java.util.Arrays.equals(this.boundto, other.getBoundto()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              java.util.Arrays.equals(this.priority, other.getPriority()))) &&
            ((this.gotopriorityexpression==null && other.getGotopriorityexpression()==null) || 
             (this.gotopriorityexpression!=null &&
              java.util.Arrays.equals(this.gotopriorityexpression, other.getGotopriorityexpression()))) &&
            ((this.labeltype==null && other.getLabeltype()==null) || 
             (this.labeltype!=null &&
              java.util.Arrays.equals(this.labeltype, other.getLabeltype()))) &&
            ((this.labelname==null && other.getLabelname()==null) || 
             (this.labelname!=null &&
              java.util.Arrays.equals(this.labelname, other.getLabelname()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.builtin==null && other.getBuiltin()==null) || 
             (this.builtin!=null &&
              this.builtin.equals(other.getBuiltin())));
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
        if (getViewname() != null) {
            _hashCode += getViewname().hashCode();
        }
        if (getPreferredlocation() != null) {
            _hashCode += getPreferredlocation().hashCode();
        }
        if (getPreferredloclist() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreferredloclist());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreferredloclist(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHits() != null) {
            _hashCode += getHits().hashCode();
        }
        if (getUndefhits() != null) {
            _hashCode += getUndefhits().hashCode();
        }
        if (getDrop() != null) {
            _hashCode += getDrop().hashCode();
        }
        if (getActionname() != null) {
            _hashCode += getActionname().hashCode();
        }
        if (getCachebypass() != null) {
            _hashCode += getCachebypass().hashCode();
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getBuiltin() != null) {
            _hashCode += getBuiltin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dnspolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "dnspolicy"));
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
        elemField.setFieldName("viewname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viewname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredlocation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preferredlocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredloclist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preferredloclist"));
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
        elemField.setFieldName("drop");
        elemField.setXmlName(new javax.xml.namespace.QName("", "drop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachebypass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachebypass"));
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
        elemField.setFieldName("boundto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundto"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builtin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "builtin"));
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
