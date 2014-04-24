/**
 * Cmpparameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Cmpparameter  implements java.io.Serializable {
    private java.lang.String cmplevel;

    private org.apache.axis.types.UnsignedInt quantumsize;

    private java.lang.String servercmp;

    private java.lang.String heurexpiry;

    private org.apache.axis.types.UnsignedInt heurexpirythres;

    private org.apache.axis.types.UnsignedInt heurexpiryhistwt;

    private org.apache.axis.types.UnsignedInt minressize;

    private org.apache.axis.types.UnsignedInt cmpbypasspct;

    private java.lang.String cmponpush;

    private java.lang.String policytype;

    private java.lang.String addvaryheader;

    private java.lang.String externalcache;

    public Cmpparameter() {
    }

    public Cmpparameter(
           java.lang.String cmplevel,
           org.apache.axis.types.UnsignedInt quantumsize,
           java.lang.String servercmp,
           java.lang.String heurexpiry,
           org.apache.axis.types.UnsignedInt heurexpirythres,
           org.apache.axis.types.UnsignedInt heurexpiryhistwt,
           org.apache.axis.types.UnsignedInt minressize,
           org.apache.axis.types.UnsignedInt cmpbypasspct,
           java.lang.String cmponpush,
           java.lang.String policytype,
           java.lang.String addvaryheader,
           java.lang.String externalcache) {
           this.cmplevel = cmplevel;
           this.quantumsize = quantumsize;
           this.servercmp = servercmp;
           this.heurexpiry = heurexpiry;
           this.heurexpirythres = heurexpirythres;
           this.heurexpiryhistwt = heurexpiryhistwt;
           this.minressize = minressize;
           this.cmpbypasspct = cmpbypasspct;
           this.cmponpush = cmponpush;
           this.policytype = policytype;
           this.addvaryheader = addvaryheader;
           this.externalcache = externalcache;
    }


    /**
     * Gets the cmplevel value for this Cmpparameter.
     * 
     * @return cmplevel
     */
    public java.lang.String getCmplevel() {
        return cmplevel;
    }


    /**
     * Sets the cmplevel value for this Cmpparameter.
     * 
     * @param cmplevel
     */
    public void setCmplevel(java.lang.String cmplevel) {
        this.cmplevel = cmplevel;
    }


    /**
     * Gets the quantumsize value for this Cmpparameter.
     * 
     * @return quantumsize
     */
    public org.apache.axis.types.UnsignedInt getQuantumsize() {
        return quantumsize;
    }


    /**
     * Sets the quantumsize value for this Cmpparameter.
     * 
     * @param quantumsize
     */
    public void setQuantumsize(org.apache.axis.types.UnsignedInt quantumsize) {
        this.quantumsize = quantumsize;
    }


    /**
     * Gets the servercmp value for this Cmpparameter.
     * 
     * @return servercmp
     */
    public java.lang.String getServercmp() {
        return servercmp;
    }


    /**
     * Sets the servercmp value for this Cmpparameter.
     * 
     * @param servercmp
     */
    public void setServercmp(java.lang.String servercmp) {
        this.servercmp = servercmp;
    }


    /**
     * Gets the heurexpiry value for this Cmpparameter.
     * 
     * @return heurexpiry
     */
    public java.lang.String getHeurexpiry() {
        return heurexpiry;
    }


    /**
     * Sets the heurexpiry value for this Cmpparameter.
     * 
     * @param heurexpiry
     */
    public void setHeurexpiry(java.lang.String heurexpiry) {
        this.heurexpiry = heurexpiry;
    }


    /**
     * Gets the heurexpirythres value for this Cmpparameter.
     * 
     * @return heurexpirythres
     */
    public org.apache.axis.types.UnsignedInt getHeurexpirythres() {
        return heurexpirythres;
    }


    /**
     * Sets the heurexpirythres value for this Cmpparameter.
     * 
     * @param heurexpirythres
     */
    public void setHeurexpirythres(org.apache.axis.types.UnsignedInt heurexpirythres) {
        this.heurexpirythres = heurexpirythres;
    }


    /**
     * Gets the heurexpiryhistwt value for this Cmpparameter.
     * 
     * @return heurexpiryhistwt
     */
    public org.apache.axis.types.UnsignedInt getHeurexpiryhistwt() {
        return heurexpiryhistwt;
    }


    /**
     * Sets the heurexpiryhistwt value for this Cmpparameter.
     * 
     * @param heurexpiryhistwt
     */
    public void setHeurexpiryhistwt(org.apache.axis.types.UnsignedInt heurexpiryhistwt) {
        this.heurexpiryhistwt = heurexpiryhistwt;
    }


    /**
     * Gets the minressize value for this Cmpparameter.
     * 
     * @return minressize
     */
    public org.apache.axis.types.UnsignedInt getMinressize() {
        return minressize;
    }


    /**
     * Sets the minressize value for this Cmpparameter.
     * 
     * @param minressize
     */
    public void setMinressize(org.apache.axis.types.UnsignedInt minressize) {
        this.minressize = minressize;
    }


    /**
     * Gets the cmpbypasspct value for this Cmpparameter.
     * 
     * @return cmpbypasspct
     */
    public org.apache.axis.types.UnsignedInt getCmpbypasspct() {
        return cmpbypasspct;
    }


    /**
     * Sets the cmpbypasspct value for this Cmpparameter.
     * 
     * @param cmpbypasspct
     */
    public void setCmpbypasspct(org.apache.axis.types.UnsignedInt cmpbypasspct) {
        this.cmpbypasspct = cmpbypasspct;
    }


    /**
     * Gets the cmponpush value for this Cmpparameter.
     * 
     * @return cmponpush
     */
    public java.lang.String getCmponpush() {
        return cmponpush;
    }


    /**
     * Sets the cmponpush value for this Cmpparameter.
     * 
     * @param cmponpush
     */
    public void setCmponpush(java.lang.String cmponpush) {
        this.cmponpush = cmponpush;
    }


    /**
     * Gets the policytype value for this Cmpparameter.
     * 
     * @return policytype
     */
    public java.lang.String getPolicytype() {
        return policytype;
    }


    /**
     * Sets the policytype value for this Cmpparameter.
     * 
     * @param policytype
     */
    public void setPolicytype(java.lang.String policytype) {
        this.policytype = policytype;
    }


    /**
     * Gets the addvaryheader value for this Cmpparameter.
     * 
     * @return addvaryheader
     */
    public java.lang.String getAddvaryheader() {
        return addvaryheader;
    }


    /**
     * Sets the addvaryheader value for this Cmpparameter.
     * 
     * @param addvaryheader
     */
    public void setAddvaryheader(java.lang.String addvaryheader) {
        this.addvaryheader = addvaryheader;
    }


    /**
     * Gets the externalcache value for this Cmpparameter.
     * 
     * @return externalcache
     */
    public java.lang.String getExternalcache() {
        return externalcache;
    }


    /**
     * Sets the externalcache value for this Cmpparameter.
     * 
     * @param externalcache
     */
    public void setExternalcache(java.lang.String externalcache) {
        this.externalcache = externalcache;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cmpparameter)) return false;
        Cmpparameter other = (Cmpparameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cmplevel==null && other.getCmplevel()==null) || 
             (this.cmplevel!=null &&
              this.cmplevel.equals(other.getCmplevel()))) &&
            ((this.quantumsize==null && other.getQuantumsize()==null) || 
             (this.quantumsize!=null &&
              this.quantumsize.equals(other.getQuantumsize()))) &&
            ((this.servercmp==null && other.getServercmp()==null) || 
             (this.servercmp!=null &&
              this.servercmp.equals(other.getServercmp()))) &&
            ((this.heurexpiry==null && other.getHeurexpiry()==null) || 
             (this.heurexpiry!=null &&
              this.heurexpiry.equals(other.getHeurexpiry()))) &&
            ((this.heurexpirythres==null && other.getHeurexpirythres()==null) || 
             (this.heurexpirythres!=null &&
              this.heurexpirythres.equals(other.getHeurexpirythres()))) &&
            ((this.heurexpiryhistwt==null && other.getHeurexpiryhistwt()==null) || 
             (this.heurexpiryhistwt!=null &&
              this.heurexpiryhistwt.equals(other.getHeurexpiryhistwt()))) &&
            ((this.minressize==null && other.getMinressize()==null) || 
             (this.minressize!=null &&
              this.minressize.equals(other.getMinressize()))) &&
            ((this.cmpbypasspct==null && other.getCmpbypasspct()==null) || 
             (this.cmpbypasspct!=null &&
              this.cmpbypasspct.equals(other.getCmpbypasspct()))) &&
            ((this.cmponpush==null && other.getCmponpush()==null) || 
             (this.cmponpush!=null &&
              this.cmponpush.equals(other.getCmponpush()))) &&
            ((this.policytype==null && other.getPolicytype()==null) || 
             (this.policytype!=null &&
              this.policytype.equals(other.getPolicytype()))) &&
            ((this.addvaryheader==null && other.getAddvaryheader()==null) || 
             (this.addvaryheader!=null &&
              this.addvaryheader.equals(other.getAddvaryheader()))) &&
            ((this.externalcache==null && other.getExternalcache()==null) || 
             (this.externalcache!=null &&
              this.externalcache.equals(other.getExternalcache())));
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
        if (getCmplevel() != null) {
            _hashCode += getCmplevel().hashCode();
        }
        if (getQuantumsize() != null) {
            _hashCode += getQuantumsize().hashCode();
        }
        if (getServercmp() != null) {
            _hashCode += getServercmp().hashCode();
        }
        if (getHeurexpiry() != null) {
            _hashCode += getHeurexpiry().hashCode();
        }
        if (getHeurexpirythres() != null) {
            _hashCode += getHeurexpirythres().hashCode();
        }
        if (getHeurexpiryhistwt() != null) {
            _hashCode += getHeurexpiryhistwt().hashCode();
        }
        if (getMinressize() != null) {
            _hashCode += getMinressize().hashCode();
        }
        if (getCmpbypasspct() != null) {
            _hashCode += getCmpbypasspct().hashCode();
        }
        if (getCmponpush() != null) {
            _hashCode += getCmponpush().hashCode();
        }
        if (getPolicytype() != null) {
            _hashCode += getPolicytype().hashCode();
        }
        if (getAddvaryheader() != null) {
            _hashCode += getAddvaryheader().hashCode();
        }
        if (getExternalcache() != null) {
            _hashCode += getExternalcache().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cmpparameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "cmpparameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmplevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmplevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantumsize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantumsize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servercmp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servercmp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heurexpiry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "heurexpiry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heurexpirythres");
        elemField.setXmlName(new javax.xml.namespace.QName("", "heurexpirythres"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heurexpiryhistwt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "heurexpiryhistwt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minressize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minressize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmpbypasspct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmpbypasspct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmponpush");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmponpush"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policytype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policytype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addvaryheader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addvaryheader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalcache");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externalcache"));
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
