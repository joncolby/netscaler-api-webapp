/**
 * Nslimitidentifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nslimitidentifier  implements java.io.Serializable {
    private java.lang.String limitidentifier;

    private java.lang.String ngname;

    private org.apache.axis.types.UnsignedInt threshold;

    private org.apache.axis.types.UnsignedInt timeslice;

    private java.lang.String mode;

    private java.lang.String limittype;

    private java.lang.String selectorname;

    private org.apache.axis.types.UnsignedLong hits;

    private org.apache.axis.types.UnsignedLong drop;

    private java.lang.String[] rule;

    private org.apache.axis.types.UnsignedInt time;

    private org.apache.axis.types.UnsignedInt total;

    private org.apache.axis.types.UnsignedInt maxbandwidth;

    private org.apache.axis.types.UnsignedInt trapsintimeslice;

    private org.apache.axis.types.UnsignedInt trapscomputedintimeslice;

    private org.apache.axis.types.UnsignedInt computedtraptimeslice;

    private org.apache.axis.types.UnsignedInt referencecount;

    public Nslimitidentifier() {
    }

    public Nslimitidentifier(
           java.lang.String limitidentifier,
           java.lang.String ngname,
           org.apache.axis.types.UnsignedInt threshold,
           org.apache.axis.types.UnsignedInt timeslice,
           java.lang.String mode,
           java.lang.String limittype,
           java.lang.String selectorname,
           org.apache.axis.types.UnsignedLong hits,
           org.apache.axis.types.UnsignedLong drop,
           java.lang.String[] rule,
           org.apache.axis.types.UnsignedInt time,
           org.apache.axis.types.UnsignedInt total,
           org.apache.axis.types.UnsignedInt maxbandwidth,
           org.apache.axis.types.UnsignedInt trapsintimeslice,
           org.apache.axis.types.UnsignedInt trapscomputedintimeslice,
           org.apache.axis.types.UnsignedInt computedtraptimeslice,
           org.apache.axis.types.UnsignedInt referencecount) {
           this.limitidentifier = limitidentifier;
           this.ngname = ngname;
           this.threshold = threshold;
           this.timeslice = timeslice;
           this.mode = mode;
           this.limittype = limittype;
           this.selectorname = selectorname;
           this.hits = hits;
           this.drop = drop;
           this.rule = rule;
           this.time = time;
           this.total = total;
           this.maxbandwidth = maxbandwidth;
           this.trapsintimeslice = trapsintimeslice;
           this.trapscomputedintimeslice = trapscomputedintimeslice;
           this.computedtraptimeslice = computedtraptimeslice;
           this.referencecount = referencecount;
    }


    /**
     * Gets the limitidentifier value for this Nslimitidentifier.
     * 
     * @return limitidentifier
     */
    public java.lang.String getLimitidentifier() {
        return limitidentifier;
    }


    /**
     * Sets the limitidentifier value for this Nslimitidentifier.
     * 
     * @param limitidentifier
     */
    public void setLimitidentifier(java.lang.String limitidentifier) {
        this.limitidentifier = limitidentifier;
    }


    /**
     * Gets the ngname value for this Nslimitidentifier.
     * 
     * @return ngname
     */
    public java.lang.String getNgname() {
        return ngname;
    }


    /**
     * Sets the ngname value for this Nslimitidentifier.
     * 
     * @param ngname
     */
    public void setNgname(java.lang.String ngname) {
        this.ngname = ngname;
    }


    /**
     * Gets the threshold value for this Nslimitidentifier.
     * 
     * @return threshold
     */
    public org.apache.axis.types.UnsignedInt getThreshold() {
        return threshold;
    }


    /**
     * Sets the threshold value for this Nslimitidentifier.
     * 
     * @param threshold
     */
    public void setThreshold(org.apache.axis.types.UnsignedInt threshold) {
        this.threshold = threshold;
    }


    /**
     * Gets the timeslice value for this Nslimitidentifier.
     * 
     * @return timeslice
     */
    public org.apache.axis.types.UnsignedInt getTimeslice() {
        return timeslice;
    }


    /**
     * Sets the timeslice value for this Nslimitidentifier.
     * 
     * @param timeslice
     */
    public void setTimeslice(org.apache.axis.types.UnsignedInt timeslice) {
        this.timeslice = timeslice;
    }


    /**
     * Gets the mode value for this Nslimitidentifier.
     * 
     * @return mode
     */
    public java.lang.String getMode() {
        return mode;
    }


    /**
     * Sets the mode value for this Nslimitidentifier.
     * 
     * @param mode
     */
    public void setMode(java.lang.String mode) {
        this.mode = mode;
    }


    /**
     * Gets the limittype value for this Nslimitidentifier.
     * 
     * @return limittype
     */
    public java.lang.String getLimittype() {
        return limittype;
    }


    /**
     * Sets the limittype value for this Nslimitidentifier.
     * 
     * @param limittype
     */
    public void setLimittype(java.lang.String limittype) {
        this.limittype = limittype;
    }


    /**
     * Gets the selectorname value for this Nslimitidentifier.
     * 
     * @return selectorname
     */
    public java.lang.String getSelectorname() {
        return selectorname;
    }


    /**
     * Sets the selectorname value for this Nslimitidentifier.
     * 
     * @param selectorname
     */
    public void setSelectorname(java.lang.String selectorname) {
        this.selectorname = selectorname;
    }


    /**
     * Gets the hits value for this Nslimitidentifier.
     * 
     * @return hits
     */
    public org.apache.axis.types.UnsignedLong getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this Nslimitidentifier.
     * 
     * @param hits
     */
    public void setHits(org.apache.axis.types.UnsignedLong hits) {
        this.hits = hits;
    }


    /**
     * Gets the drop value for this Nslimitidentifier.
     * 
     * @return drop
     */
    public org.apache.axis.types.UnsignedLong getDrop() {
        return drop;
    }


    /**
     * Sets the drop value for this Nslimitidentifier.
     * 
     * @param drop
     */
    public void setDrop(org.apache.axis.types.UnsignedLong drop) {
        this.drop = drop;
    }


    /**
     * Gets the rule value for this Nslimitidentifier.
     * 
     * @return rule
     */
    public java.lang.String[] getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this Nslimitidentifier.
     * 
     * @param rule
     */
    public void setRule(java.lang.String[] rule) {
        this.rule = rule;
    }


    /**
     * Gets the time value for this Nslimitidentifier.
     * 
     * @return time
     */
    public org.apache.axis.types.UnsignedInt getTime() {
        return time;
    }


    /**
     * Sets the time value for this Nslimitidentifier.
     * 
     * @param time
     */
    public void setTime(org.apache.axis.types.UnsignedInt time) {
        this.time = time;
    }


    /**
     * Gets the total value for this Nslimitidentifier.
     * 
     * @return total
     */
    public org.apache.axis.types.UnsignedInt getTotal() {
        return total;
    }


    /**
     * Sets the total value for this Nslimitidentifier.
     * 
     * @param total
     */
    public void setTotal(org.apache.axis.types.UnsignedInt total) {
        this.total = total;
    }


    /**
     * Gets the maxbandwidth value for this Nslimitidentifier.
     * 
     * @return maxbandwidth
     */
    public org.apache.axis.types.UnsignedInt getMaxbandwidth() {
        return maxbandwidth;
    }


    /**
     * Sets the maxbandwidth value for this Nslimitidentifier.
     * 
     * @param maxbandwidth
     */
    public void setMaxbandwidth(org.apache.axis.types.UnsignedInt maxbandwidth) {
        this.maxbandwidth = maxbandwidth;
    }


    /**
     * Gets the trapsintimeslice value for this Nslimitidentifier.
     * 
     * @return trapsintimeslice
     */
    public org.apache.axis.types.UnsignedInt getTrapsintimeslice() {
        return trapsintimeslice;
    }


    /**
     * Sets the trapsintimeslice value for this Nslimitidentifier.
     * 
     * @param trapsintimeslice
     */
    public void setTrapsintimeslice(org.apache.axis.types.UnsignedInt trapsintimeslice) {
        this.trapsintimeslice = trapsintimeslice;
    }


    /**
     * Gets the trapscomputedintimeslice value for this Nslimitidentifier.
     * 
     * @return trapscomputedintimeslice
     */
    public org.apache.axis.types.UnsignedInt getTrapscomputedintimeslice() {
        return trapscomputedintimeslice;
    }


    /**
     * Sets the trapscomputedintimeslice value for this Nslimitidentifier.
     * 
     * @param trapscomputedintimeslice
     */
    public void setTrapscomputedintimeslice(org.apache.axis.types.UnsignedInt trapscomputedintimeslice) {
        this.trapscomputedintimeslice = trapscomputedintimeslice;
    }


    /**
     * Gets the computedtraptimeslice value for this Nslimitidentifier.
     * 
     * @return computedtraptimeslice
     */
    public org.apache.axis.types.UnsignedInt getComputedtraptimeslice() {
        return computedtraptimeslice;
    }


    /**
     * Sets the computedtraptimeslice value for this Nslimitidentifier.
     * 
     * @param computedtraptimeslice
     */
    public void setComputedtraptimeslice(org.apache.axis.types.UnsignedInt computedtraptimeslice) {
        this.computedtraptimeslice = computedtraptimeslice;
    }


    /**
     * Gets the referencecount value for this Nslimitidentifier.
     * 
     * @return referencecount
     */
    public org.apache.axis.types.UnsignedInt getReferencecount() {
        return referencecount;
    }


    /**
     * Sets the referencecount value for this Nslimitidentifier.
     * 
     * @param referencecount
     */
    public void setReferencecount(org.apache.axis.types.UnsignedInt referencecount) {
        this.referencecount = referencecount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nslimitidentifier)) return false;
        Nslimitidentifier other = (Nslimitidentifier) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.limitidentifier==null && other.getLimitidentifier()==null) || 
             (this.limitidentifier!=null &&
              this.limitidentifier.equals(other.getLimitidentifier()))) &&
            ((this.ngname==null && other.getNgname()==null) || 
             (this.ngname!=null &&
              this.ngname.equals(other.getNgname()))) &&
            ((this.threshold==null && other.getThreshold()==null) || 
             (this.threshold!=null &&
              this.threshold.equals(other.getThreshold()))) &&
            ((this.timeslice==null && other.getTimeslice()==null) || 
             (this.timeslice!=null &&
              this.timeslice.equals(other.getTimeslice()))) &&
            ((this.mode==null && other.getMode()==null) || 
             (this.mode!=null &&
              this.mode.equals(other.getMode()))) &&
            ((this.limittype==null && other.getLimittype()==null) || 
             (this.limittype!=null &&
              this.limittype.equals(other.getLimittype()))) &&
            ((this.selectorname==null && other.getSelectorname()==null) || 
             (this.selectorname!=null &&
              this.selectorname.equals(other.getSelectorname()))) &&
            ((this.hits==null && other.getHits()==null) || 
             (this.hits!=null &&
              this.hits.equals(other.getHits()))) &&
            ((this.drop==null && other.getDrop()==null) || 
             (this.drop!=null &&
              this.drop.equals(other.getDrop()))) &&
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              java.util.Arrays.equals(this.rule, other.getRule()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal()))) &&
            ((this.maxbandwidth==null && other.getMaxbandwidth()==null) || 
             (this.maxbandwidth!=null &&
              this.maxbandwidth.equals(other.getMaxbandwidth()))) &&
            ((this.trapsintimeslice==null && other.getTrapsintimeslice()==null) || 
             (this.trapsintimeslice!=null &&
              this.trapsintimeslice.equals(other.getTrapsintimeslice()))) &&
            ((this.trapscomputedintimeslice==null && other.getTrapscomputedintimeslice()==null) || 
             (this.trapscomputedintimeslice!=null &&
              this.trapscomputedintimeslice.equals(other.getTrapscomputedintimeslice()))) &&
            ((this.computedtraptimeslice==null && other.getComputedtraptimeslice()==null) || 
             (this.computedtraptimeslice!=null &&
              this.computedtraptimeslice.equals(other.getComputedtraptimeslice()))) &&
            ((this.referencecount==null && other.getReferencecount()==null) || 
             (this.referencecount!=null &&
              this.referencecount.equals(other.getReferencecount())));
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
        if (getLimitidentifier() != null) {
            _hashCode += getLimitidentifier().hashCode();
        }
        if (getNgname() != null) {
            _hashCode += getNgname().hashCode();
        }
        if (getThreshold() != null) {
            _hashCode += getThreshold().hashCode();
        }
        if (getTimeslice() != null) {
            _hashCode += getTimeslice().hashCode();
        }
        if (getMode() != null) {
            _hashCode += getMode().hashCode();
        }
        if (getLimittype() != null) {
            _hashCode += getLimittype().hashCode();
        }
        if (getSelectorname() != null) {
            _hashCode += getSelectorname().hashCode();
        }
        if (getHits() != null) {
            _hashCode += getHits().hashCode();
        }
        if (getDrop() != null) {
            _hashCode += getDrop().hashCode();
        }
        if (getRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        if (getMaxbandwidth() != null) {
            _hashCode += getMaxbandwidth().hashCode();
        }
        if (getTrapsintimeslice() != null) {
            _hashCode += getTrapsintimeslice().hashCode();
        }
        if (getTrapscomputedintimeslice() != null) {
            _hashCode += getTrapscomputedintimeslice().hashCode();
        }
        if (getComputedtraptimeslice() != null) {
            _hashCode += getComputedtraptimeslice().hashCode();
        }
        if (getReferencecount() != null) {
            _hashCode += getReferencecount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nslimitidentifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nslimitidentifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitidentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limitidentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ngname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ngname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "threshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeslice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeslice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limittype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limittype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectorname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selectorname"));
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
        elemField.setFieldName("drop");
        elemField.setXmlName(new javax.xml.namespace.QName("", "drop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxbandwidth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxbandwidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trapsintimeslice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trapsintimeslice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trapscomputedintimeslice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trapscomputedintimeslice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("computedtraptimeslice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "computedtraptimeslice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referencecount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referencecount"));
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
