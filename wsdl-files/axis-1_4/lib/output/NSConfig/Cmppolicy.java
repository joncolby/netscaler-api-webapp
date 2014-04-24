/**
 * Cmppolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Cmppolicy  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String expressiontype;

    private java.lang.String rule;

    private java.lang.String reqaction;

    private java.lang.String resaction;

    private org.apache.axis.types.UnsignedLong hits;

    private org.apache.axis.types.UnsignedLong txbytes;

    private org.apache.axis.types.UnsignedLong rxbytes;

    private org.apache.axis.types.UnsignedLong clientttlb;

    private org.apache.axis.types.UnsignedLong clienttransactions;

    private org.apache.axis.types.UnsignedLong serverttlb;

    private org.apache.axis.types.UnsignedLong servertransactions;

    private java.lang.String[] boundto;

    private org.apache.axis.types.UnsignedInt[] activepolicy;

    private org.apache.axis.types.UnsignedInt[] priority;

    private java.lang.String[] gotopriorityexpression;

    private java.lang.String[] labeltype;

    private java.lang.String[] labelname;

    private java.lang.String description;

    private java.lang.String builtin;

    private boolean isdefault;

    public Cmppolicy() {
    }

    public Cmppolicy(
           java.lang.String name,
           java.lang.String expressiontype,
           java.lang.String rule,
           java.lang.String reqaction,
           java.lang.String resaction,
           org.apache.axis.types.UnsignedLong hits,
           org.apache.axis.types.UnsignedLong txbytes,
           org.apache.axis.types.UnsignedLong rxbytes,
           org.apache.axis.types.UnsignedLong clientttlb,
           org.apache.axis.types.UnsignedLong clienttransactions,
           org.apache.axis.types.UnsignedLong serverttlb,
           org.apache.axis.types.UnsignedLong servertransactions,
           java.lang.String[] boundto,
           org.apache.axis.types.UnsignedInt[] activepolicy,
           org.apache.axis.types.UnsignedInt[] priority,
           java.lang.String[] gotopriorityexpression,
           java.lang.String[] labeltype,
           java.lang.String[] labelname,
           java.lang.String description,
           java.lang.String builtin,
           boolean isdefault) {
           this.name = name;
           this.expressiontype = expressiontype;
           this.rule = rule;
           this.reqaction = reqaction;
           this.resaction = resaction;
           this.hits = hits;
           this.txbytes = txbytes;
           this.rxbytes = rxbytes;
           this.clientttlb = clientttlb;
           this.clienttransactions = clienttransactions;
           this.serverttlb = serverttlb;
           this.servertransactions = servertransactions;
           this.boundto = boundto;
           this.activepolicy = activepolicy;
           this.priority = priority;
           this.gotopriorityexpression = gotopriorityexpression;
           this.labeltype = labeltype;
           this.labelname = labelname;
           this.description = description;
           this.builtin = builtin;
           this.isdefault = isdefault;
    }


    /**
     * Gets the name value for this Cmppolicy.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Cmppolicy.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the expressiontype value for this Cmppolicy.
     * 
     * @return expressiontype
     */
    public java.lang.String getExpressiontype() {
        return expressiontype;
    }


    /**
     * Sets the expressiontype value for this Cmppolicy.
     * 
     * @param expressiontype
     */
    public void setExpressiontype(java.lang.String expressiontype) {
        this.expressiontype = expressiontype;
    }


    /**
     * Gets the rule value for this Cmppolicy.
     * 
     * @return rule
     */
    public java.lang.String getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this Cmppolicy.
     * 
     * @param rule
     */
    public void setRule(java.lang.String rule) {
        this.rule = rule;
    }


    /**
     * Gets the reqaction value for this Cmppolicy.
     * 
     * @return reqaction
     */
    public java.lang.String getReqaction() {
        return reqaction;
    }


    /**
     * Sets the reqaction value for this Cmppolicy.
     * 
     * @param reqaction
     */
    public void setReqaction(java.lang.String reqaction) {
        this.reqaction = reqaction;
    }


    /**
     * Gets the resaction value for this Cmppolicy.
     * 
     * @return resaction
     */
    public java.lang.String getResaction() {
        return resaction;
    }


    /**
     * Sets the resaction value for this Cmppolicy.
     * 
     * @param resaction
     */
    public void setResaction(java.lang.String resaction) {
        this.resaction = resaction;
    }


    /**
     * Gets the hits value for this Cmppolicy.
     * 
     * @return hits
     */
    public org.apache.axis.types.UnsignedLong getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this Cmppolicy.
     * 
     * @param hits
     */
    public void setHits(org.apache.axis.types.UnsignedLong hits) {
        this.hits = hits;
    }


    /**
     * Gets the txbytes value for this Cmppolicy.
     * 
     * @return txbytes
     */
    public org.apache.axis.types.UnsignedLong getTxbytes() {
        return txbytes;
    }


    /**
     * Sets the txbytes value for this Cmppolicy.
     * 
     * @param txbytes
     */
    public void setTxbytes(org.apache.axis.types.UnsignedLong txbytes) {
        this.txbytes = txbytes;
    }


    /**
     * Gets the rxbytes value for this Cmppolicy.
     * 
     * @return rxbytes
     */
    public org.apache.axis.types.UnsignedLong getRxbytes() {
        return rxbytes;
    }


    /**
     * Sets the rxbytes value for this Cmppolicy.
     * 
     * @param rxbytes
     */
    public void setRxbytes(org.apache.axis.types.UnsignedLong rxbytes) {
        this.rxbytes = rxbytes;
    }


    /**
     * Gets the clientttlb value for this Cmppolicy.
     * 
     * @return clientttlb
     */
    public org.apache.axis.types.UnsignedLong getClientttlb() {
        return clientttlb;
    }


    /**
     * Sets the clientttlb value for this Cmppolicy.
     * 
     * @param clientttlb
     */
    public void setClientttlb(org.apache.axis.types.UnsignedLong clientttlb) {
        this.clientttlb = clientttlb;
    }


    /**
     * Gets the clienttransactions value for this Cmppolicy.
     * 
     * @return clienttransactions
     */
    public org.apache.axis.types.UnsignedLong getClienttransactions() {
        return clienttransactions;
    }


    /**
     * Sets the clienttransactions value for this Cmppolicy.
     * 
     * @param clienttransactions
     */
    public void setClienttransactions(org.apache.axis.types.UnsignedLong clienttransactions) {
        this.clienttransactions = clienttransactions;
    }


    /**
     * Gets the serverttlb value for this Cmppolicy.
     * 
     * @return serverttlb
     */
    public org.apache.axis.types.UnsignedLong getServerttlb() {
        return serverttlb;
    }


    /**
     * Sets the serverttlb value for this Cmppolicy.
     * 
     * @param serverttlb
     */
    public void setServerttlb(org.apache.axis.types.UnsignedLong serverttlb) {
        this.serverttlb = serverttlb;
    }


    /**
     * Gets the servertransactions value for this Cmppolicy.
     * 
     * @return servertransactions
     */
    public org.apache.axis.types.UnsignedLong getServertransactions() {
        return servertransactions;
    }


    /**
     * Sets the servertransactions value for this Cmppolicy.
     * 
     * @param servertransactions
     */
    public void setServertransactions(org.apache.axis.types.UnsignedLong servertransactions) {
        this.servertransactions = servertransactions;
    }


    /**
     * Gets the boundto value for this Cmppolicy.
     * 
     * @return boundto
     */
    public java.lang.String[] getBoundto() {
        return boundto;
    }


    /**
     * Sets the boundto value for this Cmppolicy.
     * 
     * @param boundto
     */
    public void setBoundto(java.lang.String[] boundto) {
        this.boundto = boundto;
    }


    /**
     * Gets the activepolicy value for this Cmppolicy.
     * 
     * @return activepolicy
     */
    public org.apache.axis.types.UnsignedInt[] getActivepolicy() {
        return activepolicy;
    }


    /**
     * Sets the activepolicy value for this Cmppolicy.
     * 
     * @param activepolicy
     */
    public void setActivepolicy(org.apache.axis.types.UnsignedInt[] activepolicy) {
        this.activepolicy = activepolicy;
    }


    /**
     * Gets the priority value for this Cmppolicy.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt[] getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Cmppolicy.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt[] priority) {
        this.priority = priority;
    }


    /**
     * Gets the gotopriorityexpression value for this Cmppolicy.
     * 
     * @return gotopriorityexpression
     */
    public java.lang.String[] getGotopriorityexpression() {
        return gotopriorityexpression;
    }


    /**
     * Sets the gotopriorityexpression value for this Cmppolicy.
     * 
     * @param gotopriorityexpression
     */
    public void setGotopriorityexpression(java.lang.String[] gotopriorityexpression) {
        this.gotopriorityexpression = gotopriorityexpression;
    }


    /**
     * Gets the labeltype value for this Cmppolicy.
     * 
     * @return labeltype
     */
    public java.lang.String[] getLabeltype() {
        return labeltype;
    }


    /**
     * Sets the labeltype value for this Cmppolicy.
     * 
     * @param labeltype
     */
    public void setLabeltype(java.lang.String[] labeltype) {
        this.labeltype = labeltype;
    }


    /**
     * Gets the labelname value for this Cmppolicy.
     * 
     * @return labelname
     */
    public java.lang.String[] getLabelname() {
        return labelname;
    }


    /**
     * Sets the labelname value for this Cmppolicy.
     * 
     * @param labelname
     */
    public void setLabelname(java.lang.String[] labelname) {
        this.labelname = labelname;
    }


    /**
     * Gets the description value for this Cmppolicy.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Cmppolicy.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the builtin value for this Cmppolicy.
     * 
     * @return builtin
     */
    public java.lang.String getBuiltin() {
        return builtin;
    }


    /**
     * Sets the builtin value for this Cmppolicy.
     * 
     * @param builtin
     */
    public void setBuiltin(java.lang.String builtin) {
        this.builtin = builtin;
    }


    /**
     * Gets the isdefault value for this Cmppolicy.
     * 
     * @return isdefault
     */
    public boolean isIsdefault() {
        return isdefault;
    }


    /**
     * Sets the isdefault value for this Cmppolicy.
     * 
     * @param isdefault
     */
    public void setIsdefault(boolean isdefault) {
        this.isdefault = isdefault;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cmppolicy)) return false;
        Cmppolicy other = (Cmppolicy) obj;
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
            ((this.expressiontype==null && other.getExpressiontype()==null) || 
             (this.expressiontype!=null &&
              this.expressiontype.equals(other.getExpressiontype()))) &&
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              this.rule.equals(other.getRule()))) &&
            ((this.reqaction==null && other.getReqaction()==null) || 
             (this.reqaction!=null &&
              this.reqaction.equals(other.getReqaction()))) &&
            ((this.resaction==null && other.getResaction()==null) || 
             (this.resaction!=null &&
              this.resaction.equals(other.getResaction()))) &&
            ((this.hits==null && other.getHits()==null) || 
             (this.hits!=null &&
              this.hits.equals(other.getHits()))) &&
            ((this.txbytes==null && other.getTxbytes()==null) || 
             (this.txbytes!=null &&
              this.txbytes.equals(other.getTxbytes()))) &&
            ((this.rxbytes==null && other.getRxbytes()==null) || 
             (this.rxbytes!=null &&
              this.rxbytes.equals(other.getRxbytes()))) &&
            ((this.clientttlb==null && other.getClientttlb()==null) || 
             (this.clientttlb!=null &&
              this.clientttlb.equals(other.getClientttlb()))) &&
            ((this.clienttransactions==null && other.getClienttransactions()==null) || 
             (this.clienttransactions!=null &&
              this.clienttransactions.equals(other.getClienttransactions()))) &&
            ((this.serverttlb==null && other.getServerttlb()==null) || 
             (this.serverttlb!=null &&
              this.serverttlb.equals(other.getServerttlb()))) &&
            ((this.servertransactions==null && other.getServertransactions()==null) || 
             (this.servertransactions!=null &&
              this.servertransactions.equals(other.getServertransactions()))) &&
            ((this.boundto==null && other.getBoundto()==null) || 
             (this.boundto!=null &&
              java.util.Arrays.equals(this.boundto, other.getBoundto()))) &&
            ((this.activepolicy==null && other.getActivepolicy()==null) || 
             (this.activepolicy!=null &&
              java.util.Arrays.equals(this.activepolicy, other.getActivepolicy()))) &&
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
              this.builtin.equals(other.getBuiltin()))) &&
            this.isdefault == other.isIsdefault();
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
        if (getExpressiontype() != null) {
            _hashCode += getExpressiontype().hashCode();
        }
        if (getRule() != null) {
            _hashCode += getRule().hashCode();
        }
        if (getReqaction() != null) {
            _hashCode += getReqaction().hashCode();
        }
        if (getResaction() != null) {
            _hashCode += getResaction().hashCode();
        }
        if (getHits() != null) {
            _hashCode += getHits().hashCode();
        }
        if (getTxbytes() != null) {
            _hashCode += getTxbytes().hashCode();
        }
        if (getRxbytes() != null) {
            _hashCode += getRxbytes().hashCode();
        }
        if (getClientttlb() != null) {
            _hashCode += getClientttlb().hashCode();
        }
        if (getClienttransactions() != null) {
            _hashCode += getClienttransactions().hashCode();
        }
        if (getServerttlb() != null) {
            _hashCode += getServerttlb().hashCode();
        }
        if (getServertransactions() != null) {
            _hashCode += getServertransactions().hashCode();
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
        _hashCode += (isIsdefault() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cmppolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "cmppolicy"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expressiontype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expressiontype"));
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
        elemField.setFieldName("reqaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reqaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resaction"));
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
        elemField.setFieldName("txbytes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "txbytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rxbytes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rxbytes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientttlb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientttlb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clienttransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clienttransactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serverttlb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serverttlb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servertransactions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servertransactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isdefault");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isdefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
