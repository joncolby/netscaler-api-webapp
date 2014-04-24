/**
 * Csaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Csaction  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String targetlbvserver;

    private java.lang.String targetvserverexpr;

    private org.apache.axis.types.UnsignedLong hits;

    private org.apache.axis.types.UnsignedInt referencecount;

    private org.apache.axis.types.UnsignedLong undefhits;

    private java.lang.String builtin;

    private java.lang.String comment;

    public Csaction() {
    }

    public Csaction(
           java.lang.String name,
           java.lang.String targetlbvserver,
           java.lang.String targetvserverexpr,
           org.apache.axis.types.UnsignedLong hits,
           org.apache.axis.types.UnsignedInt referencecount,
           org.apache.axis.types.UnsignedLong undefhits,
           java.lang.String builtin,
           java.lang.String comment) {
           this.name = name;
           this.targetlbvserver = targetlbvserver;
           this.targetvserverexpr = targetvserverexpr;
           this.hits = hits;
           this.referencecount = referencecount;
           this.undefhits = undefhits;
           this.builtin = builtin;
           this.comment = comment;
    }


    /**
     * Gets the name value for this Csaction.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Csaction.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the targetlbvserver value for this Csaction.
     * 
     * @return targetlbvserver
     */
    public java.lang.String getTargetlbvserver() {
        return targetlbvserver;
    }


    /**
     * Sets the targetlbvserver value for this Csaction.
     * 
     * @param targetlbvserver
     */
    public void setTargetlbvserver(java.lang.String targetlbvserver) {
        this.targetlbvserver = targetlbvserver;
    }


    /**
     * Gets the targetvserverexpr value for this Csaction.
     * 
     * @return targetvserverexpr
     */
    public java.lang.String getTargetvserverexpr() {
        return targetvserverexpr;
    }


    /**
     * Sets the targetvserverexpr value for this Csaction.
     * 
     * @param targetvserverexpr
     */
    public void setTargetvserverexpr(java.lang.String targetvserverexpr) {
        this.targetvserverexpr = targetvserverexpr;
    }


    /**
     * Gets the hits value for this Csaction.
     * 
     * @return hits
     */
    public org.apache.axis.types.UnsignedLong getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this Csaction.
     * 
     * @param hits
     */
    public void setHits(org.apache.axis.types.UnsignedLong hits) {
        this.hits = hits;
    }


    /**
     * Gets the referencecount value for this Csaction.
     * 
     * @return referencecount
     */
    public org.apache.axis.types.UnsignedInt getReferencecount() {
        return referencecount;
    }


    /**
     * Sets the referencecount value for this Csaction.
     * 
     * @param referencecount
     */
    public void setReferencecount(org.apache.axis.types.UnsignedInt referencecount) {
        this.referencecount = referencecount;
    }


    /**
     * Gets the undefhits value for this Csaction.
     * 
     * @return undefhits
     */
    public org.apache.axis.types.UnsignedLong getUndefhits() {
        return undefhits;
    }


    /**
     * Sets the undefhits value for this Csaction.
     * 
     * @param undefhits
     */
    public void setUndefhits(org.apache.axis.types.UnsignedLong undefhits) {
        this.undefhits = undefhits;
    }


    /**
     * Gets the builtin value for this Csaction.
     * 
     * @return builtin
     */
    public java.lang.String getBuiltin() {
        return builtin;
    }


    /**
     * Sets the builtin value for this Csaction.
     * 
     * @param builtin
     */
    public void setBuiltin(java.lang.String builtin) {
        this.builtin = builtin;
    }


    /**
     * Gets the comment value for this Csaction.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Csaction.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Csaction)) return false;
        Csaction other = (Csaction) obj;
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
            ((this.targetlbvserver==null && other.getTargetlbvserver()==null) || 
             (this.targetlbvserver!=null &&
              this.targetlbvserver.equals(other.getTargetlbvserver()))) &&
            ((this.targetvserverexpr==null && other.getTargetvserverexpr()==null) || 
             (this.targetvserverexpr!=null &&
              this.targetvserverexpr.equals(other.getTargetvserverexpr()))) &&
            ((this.hits==null && other.getHits()==null) || 
             (this.hits!=null &&
              this.hits.equals(other.getHits()))) &&
            ((this.referencecount==null && other.getReferencecount()==null) || 
             (this.referencecount!=null &&
              this.referencecount.equals(other.getReferencecount()))) &&
            ((this.undefhits==null && other.getUndefhits()==null) || 
             (this.undefhits!=null &&
              this.undefhits.equals(other.getUndefhits()))) &&
            ((this.builtin==null && other.getBuiltin()==null) || 
             (this.builtin!=null &&
              this.builtin.equals(other.getBuiltin()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment())));
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
        if (getTargetlbvserver() != null) {
            _hashCode += getTargetlbvserver().hashCode();
        }
        if (getTargetvserverexpr() != null) {
            _hashCode += getTargetvserverexpr().hashCode();
        }
        if (getHits() != null) {
            _hashCode += getHits().hashCode();
        }
        if (getReferencecount() != null) {
            _hashCode += getReferencecount().hashCode();
        }
        if (getUndefhits() != null) {
            _hashCode += getUndefhits().hashCode();
        }
        if (getBuiltin() != null) {
            _hashCode += getBuiltin().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Csaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "csaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetlbvserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetlbvserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetvserverexpr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetvserverexpr"));
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
        elemField.setFieldName("referencecount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referencecount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undefhits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "undefhits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builtin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "builtin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
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
