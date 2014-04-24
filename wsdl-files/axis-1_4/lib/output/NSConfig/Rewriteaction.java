/**
 * Rewriteaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Rewriteaction  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String type;

    private java.lang.String target;

    private java.lang.String stringbuilderexpr;

    private java.lang.String pattern;

    private java.lang.String search;

    private java.lang.String bypasssafetycheck;

    private java.lang.String refinesearch;

    private org.apache.axis.types.UnsignedLong hits;

    private org.apache.axis.types.UnsignedLong undefhits;

    private org.apache.axis.types.UnsignedInt referencecount;

    private java.lang.String description;

    private boolean isdefault;

    private java.lang.String comment;

    private java.lang.String builtin;

    public Rewriteaction() {
    }

    public Rewriteaction(
           java.lang.String name,
           java.lang.String type,
           java.lang.String target,
           java.lang.String stringbuilderexpr,
           java.lang.String pattern,
           java.lang.String search,
           java.lang.String bypasssafetycheck,
           java.lang.String refinesearch,
           org.apache.axis.types.UnsignedLong hits,
           org.apache.axis.types.UnsignedLong undefhits,
           org.apache.axis.types.UnsignedInt referencecount,
           java.lang.String description,
           boolean isdefault,
           java.lang.String comment,
           java.lang.String builtin) {
           this.name = name;
           this.type = type;
           this.target = target;
           this.stringbuilderexpr = stringbuilderexpr;
           this.pattern = pattern;
           this.search = search;
           this.bypasssafetycheck = bypasssafetycheck;
           this.refinesearch = refinesearch;
           this.hits = hits;
           this.undefhits = undefhits;
           this.referencecount = referencecount;
           this.description = description;
           this.isdefault = isdefault;
           this.comment = comment;
           this.builtin = builtin;
    }


    /**
     * Gets the name value for this Rewriteaction.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Rewriteaction.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the type value for this Rewriteaction.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Rewriteaction.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the target value for this Rewriteaction.
     * 
     * @return target
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this Rewriteaction.
     * 
     * @param target
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the stringbuilderexpr value for this Rewriteaction.
     * 
     * @return stringbuilderexpr
     */
    public java.lang.String getStringbuilderexpr() {
        return stringbuilderexpr;
    }


    /**
     * Sets the stringbuilderexpr value for this Rewriteaction.
     * 
     * @param stringbuilderexpr
     */
    public void setStringbuilderexpr(java.lang.String stringbuilderexpr) {
        this.stringbuilderexpr = stringbuilderexpr;
    }


    /**
     * Gets the pattern value for this Rewriteaction.
     * 
     * @return pattern
     */
    public java.lang.String getPattern() {
        return pattern;
    }


    /**
     * Sets the pattern value for this Rewriteaction.
     * 
     * @param pattern
     */
    public void setPattern(java.lang.String pattern) {
        this.pattern = pattern;
    }


    /**
     * Gets the search value for this Rewriteaction.
     * 
     * @return search
     */
    public java.lang.String getSearch() {
        return search;
    }


    /**
     * Sets the search value for this Rewriteaction.
     * 
     * @param search
     */
    public void setSearch(java.lang.String search) {
        this.search = search;
    }


    /**
     * Gets the bypasssafetycheck value for this Rewriteaction.
     * 
     * @return bypasssafetycheck
     */
    public java.lang.String getBypasssafetycheck() {
        return bypasssafetycheck;
    }


    /**
     * Sets the bypasssafetycheck value for this Rewriteaction.
     * 
     * @param bypasssafetycheck
     */
    public void setBypasssafetycheck(java.lang.String bypasssafetycheck) {
        this.bypasssafetycheck = bypasssafetycheck;
    }


    /**
     * Gets the refinesearch value for this Rewriteaction.
     * 
     * @return refinesearch
     */
    public java.lang.String getRefinesearch() {
        return refinesearch;
    }


    /**
     * Sets the refinesearch value for this Rewriteaction.
     * 
     * @param refinesearch
     */
    public void setRefinesearch(java.lang.String refinesearch) {
        this.refinesearch = refinesearch;
    }


    /**
     * Gets the hits value for this Rewriteaction.
     * 
     * @return hits
     */
    public org.apache.axis.types.UnsignedLong getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this Rewriteaction.
     * 
     * @param hits
     */
    public void setHits(org.apache.axis.types.UnsignedLong hits) {
        this.hits = hits;
    }


    /**
     * Gets the undefhits value for this Rewriteaction.
     * 
     * @return undefhits
     */
    public org.apache.axis.types.UnsignedLong getUndefhits() {
        return undefhits;
    }


    /**
     * Sets the undefhits value for this Rewriteaction.
     * 
     * @param undefhits
     */
    public void setUndefhits(org.apache.axis.types.UnsignedLong undefhits) {
        this.undefhits = undefhits;
    }


    /**
     * Gets the referencecount value for this Rewriteaction.
     * 
     * @return referencecount
     */
    public org.apache.axis.types.UnsignedInt getReferencecount() {
        return referencecount;
    }


    /**
     * Sets the referencecount value for this Rewriteaction.
     * 
     * @param referencecount
     */
    public void setReferencecount(org.apache.axis.types.UnsignedInt referencecount) {
        this.referencecount = referencecount;
    }


    /**
     * Gets the description value for this Rewriteaction.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Rewriteaction.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the isdefault value for this Rewriteaction.
     * 
     * @return isdefault
     */
    public boolean isIsdefault() {
        return isdefault;
    }


    /**
     * Sets the isdefault value for this Rewriteaction.
     * 
     * @param isdefault
     */
    public void setIsdefault(boolean isdefault) {
        this.isdefault = isdefault;
    }


    /**
     * Gets the comment value for this Rewriteaction.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Rewriteaction.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the builtin value for this Rewriteaction.
     * 
     * @return builtin
     */
    public java.lang.String getBuiltin() {
        return builtin;
    }


    /**
     * Sets the builtin value for this Rewriteaction.
     * 
     * @param builtin
     */
    public void setBuiltin(java.lang.String builtin) {
        this.builtin = builtin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rewriteaction)) return false;
        Rewriteaction other = (Rewriteaction) obj;
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
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.stringbuilderexpr==null && other.getStringbuilderexpr()==null) || 
             (this.stringbuilderexpr!=null &&
              this.stringbuilderexpr.equals(other.getStringbuilderexpr()))) &&
            ((this.pattern==null && other.getPattern()==null) || 
             (this.pattern!=null &&
              this.pattern.equals(other.getPattern()))) &&
            ((this.search==null && other.getSearch()==null) || 
             (this.search!=null &&
              this.search.equals(other.getSearch()))) &&
            ((this.bypasssafetycheck==null && other.getBypasssafetycheck()==null) || 
             (this.bypasssafetycheck!=null &&
              this.bypasssafetycheck.equals(other.getBypasssafetycheck()))) &&
            ((this.refinesearch==null && other.getRefinesearch()==null) || 
             (this.refinesearch!=null &&
              this.refinesearch.equals(other.getRefinesearch()))) &&
            ((this.hits==null && other.getHits()==null) || 
             (this.hits!=null &&
              this.hits.equals(other.getHits()))) &&
            ((this.undefhits==null && other.getUndefhits()==null) || 
             (this.undefhits!=null &&
              this.undefhits.equals(other.getUndefhits()))) &&
            ((this.referencecount==null && other.getReferencecount()==null) || 
             (this.referencecount!=null &&
              this.referencecount.equals(other.getReferencecount()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.isdefault == other.isIsdefault() &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getStringbuilderexpr() != null) {
            _hashCode += getStringbuilderexpr().hashCode();
        }
        if (getPattern() != null) {
            _hashCode += getPattern().hashCode();
        }
        if (getSearch() != null) {
            _hashCode += getSearch().hashCode();
        }
        if (getBypasssafetycheck() != null) {
            _hashCode += getBypasssafetycheck().hashCode();
        }
        if (getRefinesearch() != null) {
            _hashCode += getRefinesearch().hashCode();
        }
        if (getHits() != null) {
            _hashCode += getHits().hashCode();
        }
        if (getUndefhits() != null) {
            _hashCode += getUndefhits().hashCode();
        }
        if (getReferencecount() != null) {
            _hashCode += getReferencecount().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += (isIsdefault() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getBuiltin() != null) {
            _hashCode += getBuiltin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Rewriteaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "rewriteaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("", "target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringbuilderexpr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stringbuilderexpr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pattern");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pattern"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("search");
        elemField.setXmlName(new javax.xml.namespace.QName("", "search"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bypasssafetycheck");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bypasssafetycheck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refinesearch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refinesearch"));
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
        elemField.setFieldName("referencecount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referencecount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isdefault");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isdefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
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
