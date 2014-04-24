/**
 * Tunneltrafficpolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Tunneltrafficpolicy  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String rule;

    private java.lang.String actioN;

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

    private boolean isdefault;

    private java.lang.String builtin;

    public Tunneltrafficpolicy() {
    }

    public Tunneltrafficpolicy(
           java.lang.String name,
           java.lang.String rule,
           java.lang.String actioN,
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
           boolean isdefault,
           java.lang.String builtin) {
           this.name = name;
           this.rule = rule;
           this.actioN = actioN;
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
           this.isdefault = isdefault;
           this.builtin = builtin;
    }


    /**
     * Gets the name value for this Tunneltrafficpolicy.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Tunneltrafficpolicy.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the rule value for this Tunneltrafficpolicy.
     * 
     * @return rule
     */
    public java.lang.String getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this Tunneltrafficpolicy.
     * 
     * @param rule
     */
    public void setRule(java.lang.String rule) {
        this.rule = rule;
    }


    /**
     * Gets the actioN value for this Tunneltrafficpolicy.
     * 
     * @return actioN
     */
    public java.lang.String getActioN() {
        return actioN;
    }


    /**
     * Sets the actioN value for this Tunneltrafficpolicy.
     * 
     * @param actioN
     */
    public void setActioN(java.lang.String actioN) {
        this.actioN = actioN;
    }


    /**
     * Gets the hits value for this Tunneltrafficpolicy.
     * 
     * @return hits
     */
    public org.apache.axis.types.UnsignedLong getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this Tunneltrafficpolicy.
     * 
     * @param hits
     */
    public void setHits(org.apache.axis.types.UnsignedLong hits) {
        this.hits = hits;
    }


    /**
     * Gets the txbytes value for this Tunneltrafficpolicy.
     * 
     * @return txbytes
     */
    public org.apache.axis.types.UnsignedLong getTxbytes() {
        return txbytes;
    }


    /**
     * Sets the txbytes value for this Tunneltrafficpolicy.
     * 
     * @param txbytes
     */
    public void setTxbytes(org.apache.axis.types.UnsignedLong txbytes) {
        this.txbytes = txbytes;
    }


    /**
     * Gets the rxbytes value for this Tunneltrafficpolicy.
     * 
     * @return rxbytes
     */
    public org.apache.axis.types.UnsignedLong getRxbytes() {
        return rxbytes;
    }


    /**
     * Sets the rxbytes value for this Tunneltrafficpolicy.
     * 
     * @param rxbytes
     */
    public void setRxbytes(org.apache.axis.types.UnsignedLong rxbytes) {
        this.rxbytes = rxbytes;
    }


    /**
     * Gets the clientttlb value for this Tunneltrafficpolicy.
     * 
     * @return clientttlb
     */
    public org.apache.axis.types.UnsignedLong getClientttlb() {
        return clientttlb;
    }


    /**
     * Sets the clientttlb value for this Tunneltrafficpolicy.
     * 
     * @param clientttlb
     */
    public void setClientttlb(org.apache.axis.types.UnsignedLong clientttlb) {
        this.clientttlb = clientttlb;
    }


    /**
     * Gets the clienttransactions value for this Tunneltrafficpolicy.
     * 
     * @return clienttransactions
     */
    public org.apache.axis.types.UnsignedLong getClienttransactions() {
        return clienttransactions;
    }


    /**
     * Sets the clienttransactions value for this Tunneltrafficpolicy.
     * 
     * @param clienttransactions
     */
    public void setClienttransactions(org.apache.axis.types.UnsignedLong clienttransactions) {
        this.clienttransactions = clienttransactions;
    }


    /**
     * Gets the serverttlb value for this Tunneltrafficpolicy.
     * 
     * @return serverttlb
     */
    public org.apache.axis.types.UnsignedLong getServerttlb() {
        return serverttlb;
    }


    /**
     * Sets the serverttlb value for this Tunneltrafficpolicy.
     * 
     * @param serverttlb
     */
    public void setServerttlb(org.apache.axis.types.UnsignedLong serverttlb) {
        this.serverttlb = serverttlb;
    }


    /**
     * Gets the servertransactions value for this Tunneltrafficpolicy.
     * 
     * @return servertransactions
     */
    public org.apache.axis.types.UnsignedLong getServertransactions() {
        return servertransactions;
    }


    /**
     * Sets the servertransactions value for this Tunneltrafficpolicy.
     * 
     * @param servertransactions
     */
    public void setServertransactions(org.apache.axis.types.UnsignedLong servertransactions) {
        this.servertransactions = servertransactions;
    }


    /**
     * Gets the boundto value for this Tunneltrafficpolicy.
     * 
     * @return boundto
     */
    public java.lang.String[] getBoundto() {
        return boundto;
    }


    /**
     * Sets the boundto value for this Tunneltrafficpolicy.
     * 
     * @param boundto
     */
    public void setBoundto(java.lang.String[] boundto) {
        this.boundto = boundto;
    }


    /**
     * Gets the activepolicy value for this Tunneltrafficpolicy.
     * 
     * @return activepolicy
     */
    public org.apache.axis.types.UnsignedInt[] getActivepolicy() {
        return activepolicy;
    }


    /**
     * Sets the activepolicy value for this Tunneltrafficpolicy.
     * 
     * @param activepolicy
     */
    public void setActivepolicy(org.apache.axis.types.UnsignedInt[] activepolicy) {
        this.activepolicy = activepolicy;
    }


    /**
     * Gets the priority value for this Tunneltrafficpolicy.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt[] getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Tunneltrafficpolicy.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt[] priority) {
        this.priority = priority;
    }


    /**
     * Gets the isdefault value for this Tunneltrafficpolicy.
     * 
     * @return isdefault
     */
    public boolean isIsdefault() {
        return isdefault;
    }


    /**
     * Sets the isdefault value for this Tunneltrafficpolicy.
     * 
     * @param isdefault
     */
    public void setIsdefault(boolean isdefault) {
        this.isdefault = isdefault;
    }


    /**
     * Gets the builtin value for this Tunneltrafficpolicy.
     * 
     * @return builtin
     */
    public java.lang.String getBuiltin() {
        return builtin;
    }


    /**
     * Sets the builtin value for this Tunneltrafficpolicy.
     * 
     * @param builtin
     */
    public void setBuiltin(java.lang.String builtin) {
        this.builtin = builtin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tunneltrafficpolicy)) return false;
        Tunneltrafficpolicy other = (Tunneltrafficpolicy) obj;
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
            ((this.actioN==null && other.getActioN()==null) || 
             (this.actioN!=null &&
              this.actioN.equals(other.getActioN()))) &&
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
            this.isdefault == other.isIsdefault() &&
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
        if (getActioN() != null) {
            _hashCode += getActioN().hashCode();
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
        _hashCode += (isIsdefault() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBuiltin() != null) {
            _hashCode += getBuiltin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Tunneltrafficpolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "tunneltrafficpolicy"));
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
        elemField.setFieldName("actioN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actioN"));
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
        elemField.setFieldName("isdefault");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isdefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
