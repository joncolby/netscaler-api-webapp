/**
 * Auditmessageaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Auditmessageaction  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String loglevel;

    private java.lang.String loglevel2;

    private java.lang.String stringbuilderexpr;

    private java.lang.String logtonewnslog;

    private java.lang.String bypasssafetycheck;

    private org.apache.axis.types.UnsignedLong hits;

    private org.apache.axis.types.UnsignedLong undefhits;

    private org.apache.axis.types.UnsignedInt referencecount;

    public Auditmessageaction() {
    }

    public Auditmessageaction(
           java.lang.String name,
           java.lang.String loglevel,
           java.lang.String loglevel2,
           java.lang.String stringbuilderexpr,
           java.lang.String logtonewnslog,
           java.lang.String bypasssafetycheck,
           org.apache.axis.types.UnsignedLong hits,
           org.apache.axis.types.UnsignedLong undefhits,
           org.apache.axis.types.UnsignedInt referencecount) {
           this.name = name;
           this.loglevel = loglevel;
           this.loglevel2 = loglevel2;
           this.stringbuilderexpr = stringbuilderexpr;
           this.logtonewnslog = logtonewnslog;
           this.bypasssafetycheck = bypasssafetycheck;
           this.hits = hits;
           this.undefhits = undefhits;
           this.referencecount = referencecount;
    }


    /**
     * Gets the name value for this Auditmessageaction.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Auditmessageaction.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the loglevel value for this Auditmessageaction.
     * 
     * @return loglevel
     */
    public java.lang.String getLoglevel() {
        return loglevel;
    }


    /**
     * Sets the loglevel value for this Auditmessageaction.
     * 
     * @param loglevel
     */
    public void setLoglevel(java.lang.String loglevel) {
        this.loglevel = loglevel;
    }


    /**
     * Gets the loglevel2 value for this Auditmessageaction.
     * 
     * @return loglevel2
     */
    public java.lang.String getLoglevel2() {
        return loglevel2;
    }


    /**
     * Sets the loglevel2 value for this Auditmessageaction.
     * 
     * @param loglevel2
     */
    public void setLoglevel2(java.lang.String loglevel2) {
        this.loglevel2 = loglevel2;
    }


    /**
     * Gets the stringbuilderexpr value for this Auditmessageaction.
     * 
     * @return stringbuilderexpr
     */
    public java.lang.String getStringbuilderexpr() {
        return stringbuilderexpr;
    }


    /**
     * Sets the stringbuilderexpr value for this Auditmessageaction.
     * 
     * @param stringbuilderexpr
     */
    public void setStringbuilderexpr(java.lang.String stringbuilderexpr) {
        this.stringbuilderexpr = stringbuilderexpr;
    }


    /**
     * Gets the logtonewnslog value for this Auditmessageaction.
     * 
     * @return logtonewnslog
     */
    public java.lang.String getLogtonewnslog() {
        return logtonewnslog;
    }


    /**
     * Sets the logtonewnslog value for this Auditmessageaction.
     * 
     * @param logtonewnslog
     */
    public void setLogtonewnslog(java.lang.String logtonewnslog) {
        this.logtonewnslog = logtonewnslog;
    }


    /**
     * Gets the bypasssafetycheck value for this Auditmessageaction.
     * 
     * @return bypasssafetycheck
     */
    public java.lang.String getBypasssafetycheck() {
        return bypasssafetycheck;
    }


    /**
     * Sets the bypasssafetycheck value for this Auditmessageaction.
     * 
     * @param bypasssafetycheck
     */
    public void setBypasssafetycheck(java.lang.String bypasssafetycheck) {
        this.bypasssafetycheck = bypasssafetycheck;
    }


    /**
     * Gets the hits value for this Auditmessageaction.
     * 
     * @return hits
     */
    public org.apache.axis.types.UnsignedLong getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this Auditmessageaction.
     * 
     * @param hits
     */
    public void setHits(org.apache.axis.types.UnsignedLong hits) {
        this.hits = hits;
    }


    /**
     * Gets the undefhits value for this Auditmessageaction.
     * 
     * @return undefhits
     */
    public org.apache.axis.types.UnsignedLong getUndefhits() {
        return undefhits;
    }


    /**
     * Sets the undefhits value for this Auditmessageaction.
     * 
     * @param undefhits
     */
    public void setUndefhits(org.apache.axis.types.UnsignedLong undefhits) {
        this.undefhits = undefhits;
    }


    /**
     * Gets the referencecount value for this Auditmessageaction.
     * 
     * @return referencecount
     */
    public org.apache.axis.types.UnsignedInt getReferencecount() {
        return referencecount;
    }


    /**
     * Sets the referencecount value for this Auditmessageaction.
     * 
     * @param referencecount
     */
    public void setReferencecount(org.apache.axis.types.UnsignedInt referencecount) {
        this.referencecount = referencecount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Auditmessageaction)) return false;
        Auditmessageaction other = (Auditmessageaction) obj;
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
            ((this.loglevel==null && other.getLoglevel()==null) || 
             (this.loglevel!=null &&
              this.loglevel.equals(other.getLoglevel()))) &&
            ((this.loglevel2==null && other.getLoglevel2()==null) || 
             (this.loglevel2!=null &&
              this.loglevel2.equals(other.getLoglevel2()))) &&
            ((this.stringbuilderexpr==null && other.getStringbuilderexpr()==null) || 
             (this.stringbuilderexpr!=null &&
              this.stringbuilderexpr.equals(other.getStringbuilderexpr()))) &&
            ((this.logtonewnslog==null && other.getLogtonewnslog()==null) || 
             (this.logtonewnslog!=null &&
              this.logtonewnslog.equals(other.getLogtonewnslog()))) &&
            ((this.bypasssafetycheck==null && other.getBypasssafetycheck()==null) || 
             (this.bypasssafetycheck!=null &&
              this.bypasssafetycheck.equals(other.getBypasssafetycheck()))) &&
            ((this.hits==null && other.getHits()==null) || 
             (this.hits!=null &&
              this.hits.equals(other.getHits()))) &&
            ((this.undefhits==null && other.getUndefhits()==null) || 
             (this.undefhits!=null &&
              this.undefhits.equals(other.getUndefhits()))) &&
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getLoglevel() != null) {
            _hashCode += getLoglevel().hashCode();
        }
        if (getLoglevel2() != null) {
            _hashCode += getLoglevel2().hashCode();
        }
        if (getStringbuilderexpr() != null) {
            _hashCode += getStringbuilderexpr().hashCode();
        }
        if (getLogtonewnslog() != null) {
            _hashCode += getLogtonewnslog().hashCode();
        }
        if (getBypasssafetycheck() != null) {
            _hashCode += getBypasssafetycheck().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Auditmessageaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "auditmessageaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loglevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loglevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loglevel2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loglevel2"));
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
        elemField.setFieldName("logtonewnslog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logtonewnslog"));
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
