/**
 * Pqbinding.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Pqbinding  implements java.io.Serializable {
    private java.lang.String vservername;

    private java.lang.String policyname;

    private java.lang.String rule;

    private org.apache.axis.types.UnsignedInt priority;

    private org.apache.axis.types.UnsignedInt weight;

    private org.apache.axis.types.UnsignedInt qdepth;

    private org.apache.axis.types.UnsignedInt polqdepth;

    private org.apache.axis.types.UnsignedLong hits;

    public Pqbinding() {
    }

    public Pqbinding(
           java.lang.String vservername,
           java.lang.String policyname,
           java.lang.String rule,
           org.apache.axis.types.UnsignedInt priority,
           org.apache.axis.types.UnsignedInt weight,
           org.apache.axis.types.UnsignedInt qdepth,
           org.apache.axis.types.UnsignedInt polqdepth,
           org.apache.axis.types.UnsignedLong hits) {
           this.vservername = vservername;
           this.policyname = policyname;
           this.rule = rule;
           this.priority = priority;
           this.weight = weight;
           this.qdepth = qdepth;
           this.polqdepth = polqdepth;
           this.hits = hits;
    }


    /**
     * Gets the vservername value for this Pqbinding.
     * 
     * @return vservername
     */
    public java.lang.String getVservername() {
        return vservername;
    }


    /**
     * Sets the vservername value for this Pqbinding.
     * 
     * @param vservername
     */
    public void setVservername(java.lang.String vservername) {
        this.vservername = vservername;
    }


    /**
     * Gets the policyname value for this Pqbinding.
     * 
     * @return policyname
     */
    public java.lang.String getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Pqbinding.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the rule value for this Pqbinding.
     * 
     * @return rule
     */
    public java.lang.String getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this Pqbinding.
     * 
     * @param rule
     */
    public void setRule(java.lang.String rule) {
        this.rule = rule;
    }


    /**
     * Gets the priority value for this Pqbinding.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Pqbinding.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the weight value for this Pqbinding.
     * 
     * @return weight
     */
    public org.apache.axis.types.UnsignedInt getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this Pqbinding.
     * 
     * @param weight
     */
    public void setWeight(org.apache.axis.types.UnsignedInt weight) {
        this.weight = weight;
    }


    /**
     * Gets the qdepth value for this Pqbinding.
     * 
     * @return qdepth
     */
    public org.apache.axis.types.UnsignedInt getQdepth() {
        return qdepth;
    }


    /**
     * Sets the qdepth value for this Pqbinding.
     * 
     * @param qdepth
     */
    public void setQdepth(org.apache.axis.types.UnsignedInt qdepth) {
        this.qdepth = qdepth;
    }


    /**
     * Gets the polqdepth value for this Pqbinding.
     * 
     * @return polqdepth
     */
    public org.apache.axis.types.UnsignedInt getPolqdepth() {
        return polqdepth;
    }


    /**
     * Sets the polqdepth value for this Pqbinding.
     * 
     * @param polqdepth
     */
    public void setPolqdepth(org.apache.axis.types.UnsignedInt polqdepth) {
        this.polqdepth = polqdepth;
    }


    /**
     * Gets the hits value for this Pqbinding.
     * 
     * @return hits
     */
    public org.apache.axis.types.UnsignedLong getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this Pqbinding.
     * 
     * @param hits
     */
    public void setHits(org.apache.axis.types.UnsignedLong hits) {
        this.hits = hits;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Pqbinding)) return false;
        Pqbinding other = (Pqbinding) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vservername==null && other.getVservername()==null) || 
             (this.vservername!=null &&
              this.vservername.equals(other.getVservername()))) &&
            ((this.policyname==null && other.getPolicyname()==null) || 
             (this.policyname!=null &&
              this.policyname.equals(other.getPolicyname()))) &&
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              this.rule.equals(other.getRule()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.qdepth==null && other.getQdepth()==null) || 
             (this.qdepth!=null &&
              this.qdepth.equals(other.getQdepth()))) &&
            ((this.polqdepth==null && other.getPolqdepth()==null) || 
             (this.polqdepth!=null &&
              this.polqdepth.equals(other.getPolqdepth()))) &&
            ((this.hits==null && other.getHits()==null) || 
             (this.hits!=null &&
              this.hits.equals(other.getHits())));
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
        if (getVservername() != null) {
            _hashCode += getVservername().hashCode();
        }
        if (getPolicyname() != null) {
            _hashCode += getPolicyname().hashCode();
        }
        if (getRule() != null) {
            _hashCode += getRule().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getQdepth() != null) {
            _hashCode += getQdepth().hashCode();
        }
        if (getPolqdepth() != null) {
            _hashCode += getPolqdepth().hashCode();
        }
        if (getHits() != null) {
            _hashCode += getHits().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Pqbinding.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "pqbinding"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vservername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vservername"));
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
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rule"));
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
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qdepth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "qdepth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("polqdepth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "polqdepth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
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
