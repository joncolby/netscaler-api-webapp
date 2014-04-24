/**
 * Appqoepolicy.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Appqoepolicy  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String rule;

    private java.lang.String actioN;

    private org.apache.axis.types.UnsignedLong hits;

    private java.lang.String[] gotopriorityexpression;

    private org.apache.axis.types.UnsignedInt[] bindpriority;

    private java.lang.String[] boundto;

    private org.apache.axis.types.UnsignedInt[] activepolicy;

    public Appqoepolicy() {
    }

    public Appqoepolicy(
           java.lang.String name,
           java.lang.String rule,
           java.lang.String actioN,
           org.apache.axis.types.UnsignedLong hits,
           java.lang.String[] gotopriorityexpression,
           org.apache.axis.types.UnsignedInt[] bindpriority,
           java.lang.String[] boundto,
           org.apache.axis.types.UnsignedInt[] activepolicy) {
           this.name = name;
           this.rule = rule;
           this.actioN = actioN;
           this.hits = hits;
           this.gotopriorityexpression = gotopriorityexpression;
           this.bindpriority = bindpriority;
           this.boundto = boundto;
           this.activepolicy = activepolicy;
    }


    /**
     * Gets the name value for this Appqoepolicy.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Appqoepolicy.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the rule value for this Appqoepolicy.
     * 
     * @return rule
     */
    public java.lang.String getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this Appqoepolicy.
     * 
     * @param rule
     */
    public void setRule(java.lang.String rule) {
        this.rule = rule;
    }


    /**
     * Gets the actioN value for this Appqoepolicy.
     * 
     * @return actioN
     */
    public java.lang.String getActioN() {
        return actioN;
    }


    /**
     * Sets the actioN value for this Appqoepolicy.
     * 
     * @param actioN
     */
    public void setActioN(java.lang.String actioN) {
        this.actioN = actioN;
    }


    /**
     * Gets the hits value for this Appqoepolicy.
     * 
     * @return hits
     */
    public org.apache.axis.types.UnsignedLong getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this Appqoepolicy.
     * 
     * @param hits
     */
    public void setHits(org.apache.axis.types.UnsignedLong hits) {
        this.hits = hits;
    }


    /**
     * Gets the gotopriorityexpression value for this Appqoepolicy.
     * 
     * @return gotopriorityexpression
     */
    public java.lang.String[] getGotopriorityexpression() {
        return gotopriorityexpression;
    }


    /**
     * Sets the gotopriorityexpression value for this Appqoepolicy.
     * 
     * @param gotopriorityexpression
     */
    public void setGotopriorityexpression(java.lang.String[] gotopriorityexpression) {
        this.gotopriorityexpression = gotopriorityexpression;
    }


    /**
     * Gets the bindpriority value for this Appqoepolicy.
     * 
     * @return bindpriority
     */
    public org.apache.axis.types.UnsignedInt[] getBindpriority() {
        return bindpriority;
    }


    /**
     * Sets the bindpriority value for this Appqoepolicy.
     * 
     * @param bindpriority
     */
    public void setBindpriority(org.apache.axis.types.UnsignedInt[] bindpriority) {
        this.bindpriority = bindpriority;
    }


    /**
     * Gets the boundto value for this Appqoepolicy.
     * 
     * @return boundto
     */
    public java.lang.String[] getBoundto() {
        return boundto;
    }


    /**
     * Sets the boundto value for this Appqoepolicy.
     * 
     * @param boundto
     */
    public void setBoundto(java.lang.String[] boundto) {
        this.boundto = boundto;
    }


    /**
     * Gets the activepolicy value for this Appqoepolicy.
     * 
     * @return activepolicy
     */
    public org.apache.axis.types.UnsignedInt[] getActivepolicy() {
        return activepolicy;
    }


    /**
     * Sets the activepolicy value for this Appqoepolicy.
     * 
     * @param activepolicy
     */
    public void setActivepolicy(org.apache.axis.types.UnsignedInt[] activepolicy) {
        this.activepolicy = activepolicy;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Appqoepolicy)) return false;
        Appqoepolicy other = (Appqoepolicy) obj;
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
            ((this.gotopriorityexpression==null && other.getGotopriorityexpression()==null) || 
             (this.gotopriorityexpression!=null &&
              java.util.Arrays.equals(this.gotopriorityexpression, other.getGotopriorityexpression()))) &&
            ((this.bindpriority==null && other.getBindpriority()==null) || 
             (this.bindpriority!=null &&
              java.util.Arrays.equals(this.bindpriority, other.getBindpriority()))) &&
            ((this.boundto==null && other.getBoundto()==null) || 
             (this.boundto!=null &&
              java.util.Arrays.equals(this.boundto, other.getBoundto()))) &&
            ((this.activepolicy==null && other.getActivepolicy()==null) || 
             (this.activepolicy!=null &&
              java.util.Arrays.equals(this.activepolicy, other.getActivepolicy())));
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
        if (getBindpriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBindpriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBindpriority(), i);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Appqoepolicy.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "appqoepolicy"));
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
        elemField.setFieldName("gotopriorityexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gotopriorityexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bindpriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bindpriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
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
