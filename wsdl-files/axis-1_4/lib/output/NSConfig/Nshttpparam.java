/**
 * Nshttpparam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nshttpparam  implements java.io.Serializable {
    private java.lang.String dropinvalreqs;

    private java.lang.String markhttp09Inval;

    private java.lang.String markconnreqinval;

    private java.lang.String insnssrvrhdr;

    private java.lang.String nssrvrhdr;

    private java.lang.String logerrresp;

    private java.lang.String conmultiplex;

    private org.apache.axis.types.UnsignedInt maxreusepool;

    public Nshttpparam() {
    }

    public Nshttpparam(
           java.lang.String dropinvalreqs,
           java.lang.String markhttp09Inval,
           java.lang.String markconnreqinval,
           java.lang.String insnssrvrhdr,
           java.lang.String nssrvrhdr,
           java.lang.String logerrresp,
           java.lang.String conmultiplex,
           org.apache.axis.types.UnsignedInt maxreusepool) {
           this.dropinvalreqs = dropinvalreqs;
           this.markhttp09Inval = markhttp09Inval;
           this.markconnreqinval = markconnreqinval;
           this.insnssrvrhdr = insnssrvrhdr;
           this.nssrvrhdr = nssrvrhdr;
           this.logerrresp = logerrresp;
           this.conmultiplex = conmultiplex;
           this.maxreusepool = maxreusepool;
    }


    /**
     * Gets the dropinvalreqs value for this Nshttpparam.
     * 
     * @return dropinvalreqs
     */
    public java.lang.String getDropinvalreqs() {
        return dropinvalreqs;
    }


    /**
     * Sets the dropinvalreqs value for this Nshttpparam.
     * 
     * @param dropinvalreqs
     */
    public void setDropinvalreqs(java.lang.String dropinvalreqs) {
        this.dropinvalreqs = dropinvalreqs;
    }


    /**
     * Gets the markhttp09Inval value for this Nshttpparam.
     * 
     * @return markhttp09Inval
     */
    public java.lang.String getMarkhttp09Inval() {
        return markhttp09Inval;
    }


    /**
     * Sets the markhttp09Inval value for this Nshttpparam.
     * 
     * @param markhttp09Inval
     */
    public void setMarkhttp09Inval(java.lang.String markhttp09Inval) {
        this.markhttp09Inval = markhttp09Inval;
    }


    /**
     * Gets the markconnreqinval value for this Nshttpparam.
     * 
     * @return markconnreqinval
     */
    public java.lang.String getMarkconnreqinval() {
        return markconnreqinval;
    }


    /**
     * Sets the markconnreqinval value for this Nshttpparam.
     * 
     * @param markconnreqinval
     */
    public void setMarkconnreqinval(java.lang.String markconnreqinval) {
        this.markconnreqinval = markconnreqinval;
    }


    /**
     * Gets the insnssrvrhdr value for this Nshttpparam.
     * 
     * @return insnssrvrhdr
     */
    public java.lang.String getInsnssrvrhdr() {
        return insnssrvrhdr;
    }


    /**
     * Sets the insnssrvrhdr value for this Nshttpparam.
     * 
     * @param insnssrvrhdr
     */
    public void setInsnssrvrhdr(java.lang.String insnssrvrhdr) {
        this.insnssrvrhdr = insnssrvrhdr;
    }


    /**
     * Gets the nssrvrhdr value for this Nshttpparam.
     * 
     * @return nssrvrhdr
     */
    public java.lang.String getNssrvrhdr() {
        return nssrvrhdr;
    }


    /**
     * Sets the nssrvrhdr value for this Nshttpparam.
     * 
     * @param nssrvrhdr
     */
    public void setNssrvrhdr(java.lang.String nssrvrhdr) {
        this.nssrvrhdr = nssrvrhdr;
    }


    /**
     * Gets the logerrresp value for this Nshttpparam.
     * 
     * @return logerrresp
     */
    public java.lang.String getLogerrresp() {
        return logerrresp;
    }


    /**
     * Sets the logerrresp value for this Nshttpparam.
     * 
     * @param logerrresp
     */
    public void setLogerrresp(java.lang.String logerrresp) {
        this.logerrresp = logerrresp;
    }


    /**
     * Gets the conmultiplex value for this Nshttpparam.
     * 
     * @return conmultiplex
     */
    public java.lang.String getConmultiplex() {
        return conmultiplex;
    }


    /**
     * Sets the conmultiplex value for this Nshttpparam.
     * 
     * @param conmultiplex
     */
    public void setConmultiplex(java.lang.String conmultiplex) {
        this.conmultiplex = conmultiplex;
    }


    /**
     * Gets the maxreusepool value for this Nshttpparam.
     * 
     * @return maxreusepool
     */
    public org.apache.axis.types.UnsignedInt getMaxreusepool() {
        return maxreusepool;
    }


    /**
     * Sets the maxreusepool value for this Nshttpparam.
     * 
     * @param maxreusepool
     */
    public void setMaxreusepool(org.apache.axis.types.UnsignedInt maxreusepool) {
        this.maxreusepool = maxreusepool;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nshttpparam)) return false;
        Nshttpparam other = (Nshttpparam) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dropinvalreqs==null && other.getDropinvalreqs()==null) || 
             (this.dropinvalreqs!=null &&
              this.dropinvalreqs.equals(other.getDropinvalreqs()))) &&
            ((this.markhttp09Inval==null && other.getMarkhttp09Inval()==null) || 
             (this.markhttp09Inval!=null &&
              this.markhttp09Inval.equals(other.getMarkhttp09Inval()))) &&
            ((this.markconnreqinval==null && other.getMarkconnreqinval()==null) || 
             (this.markconnreqinval!=null &&
              this.markconnreqinval.equals(other.getMarkconnreqinval()))) &&
            ((this.insnssrvrhdr==null && other.getInsnssrvrhdr()==null) || 
             (this.insnssrvrhdr!=null &&
              this.insnssrvrhdr.equals(other.getInsnssrvrhdr()))) &&
            ((this.nssrvrhdr==null && other.getNssrvrhdr()==null) || 
             (this.nssrvrhdr!=null &&
              this.nssrvrhdr.equals(other.getNssrvrhdr()))) &&
            ((this.logerrresp==null && other.getLogerrresp()==null) || 
             (this.logerrresp!=null &&
              this.logerrresp.equals(other.getLogerrresp()))) &&
            ((this.conmultiplex==null && other.getConmultiplex()==null) || 
             (this.conmultiplex!=null &&
              this.conmultiplex.equals(other.getConmultiplex()))) &&
            ((this.maxreusepool==null && other.getMaxreusepool()==null) || 
             (this.maxreusepool!=null &&
              this.maxreusepool.equals(other.getMaxreusepool())));
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
        if (getDropinvalreqs() != null) {
            _hashCode += getDropinvalreqs().hashCode();
        }
        if (getMarkhttp09Inval() != null) {
            _hashCode += getMarkhttp09Inval().hashCode();
        }
        if (getMarkconnreqinval() != null) {
            _hashCode += getMarkconnreqinval().hashCode();
        }
        if (getInsnssrvrhdr() != null) {
            _hashCode += getInsnssrvrhdr().hashCode();
        }
        if (getNssrvrhdr() != null) {
            _hashCode += getNssrvrhdr().hashCode();
        }
        if (getLogerrresp() != null) {
            _hashCode += getLogerrresp().hashCode();
        }
        if (getConmultiplex() != null) {
            _hashCode += getConmultiplex().hashCode();
        }
        if (getMaxreusepool() != null) {
            _hashCode += getMaxreusepool().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nshttpparam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nshttpparam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dropinvalreqs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dropinvalreqs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markhttp09Inval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markhttp09inval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markconnreqinval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markconnreqinval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insnssrvrhdr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "insnssrvrhdr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nssrvrhdr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nssrvrhdr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logerrresp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logerrresp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conmultiplex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conmultiplex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxreusepool");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxreusepool"));
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
