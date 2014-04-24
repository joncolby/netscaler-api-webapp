/**
 * Iptunnelparam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Iptunnelparam  implements java.io.Serializable {
    private java.lang.String srcip;

    private java.lang.String dropfrag;

    private org.apache.axis.types.UnsignedInt dropfragcputhreshold;

    private java.lang.String srciproundrobin;

    public Iptunnelparam() {
    }

    public Iptunnelparam(
           java.lang.String srcip,
           java.lang.String dropfrag,
           org.apache.axis.types.UnsignedInt dropfragcputhreshold,
           java.lang.String srciproundrobin) {
           this.srcip = srcip;
           this.dropfrag = dropfrag;
           this.dropfragcputhreshold = dropfragcputhreshold;
           this.srciproundrobin = srciproundrobin;
    }


    /**
     * Gets the srcip value for this Iptunnelparam.
     * 
     * @return srcip
     */
    public java.lang.String getSrcip() {
        return srcip;
    }


    /**
     * Sets the srcip value for this Iptunnelparam.
     * 
     * @param srcip
     */
    public void setSrcip(java.lang.String srcip) {
        this.srcip = srcip;
    }


    /**
     * Gets the dropfrag value for this Iptunnelparam.
     * 
     * @return dropfrag
     */
    public java.lang.String getDropfrag() {
        return dropfrag;
    }


    /**
     * Sets the dropfrag value for this Iptunnelparam.
     * 
     * @param dropfrag
     */
    public void setDropfrag(java.lang.String dropfrag) {
        this.dropfrag = dropfrag;
    }


    /**
     * Gets the dropfragcputhreshold value for this Iptunnelparam.
     * 
     * @return dropfragcputhreshold
     */
    public org.apache.axis.types.UnsignedInt getDropfragcputhreshold() {
        return dropfragcputhreshold;
    }


    /**
     * Sets the dropfragcputhreshold value for this Iptunnelparam.
     * 
     * @param dropfragcputhreshold
     */
    public void setDropfragcputhreshold(org.apache.axis.types.UnsignedInt dropfragcputhreshold) {
        this.dropfragcputhreshold = dropfragcputhreshold;
    }


    /**
     * Gets the srciproundrobin value for this Iptunnelparam.
     * 
     * @return srciproundrobin
     */
    public java.lang.String getSrciproundrobin() {
        return srciproundrobin;
    }


    /**
     * Sets the srciproundrobin value for this Iptunnelparam.
     * 
     * @param srciproundrobin
     */
    public void setSrciproundrobin(java.lang.String srciproundrobin) {
        this.srciproundrobin = srciproundrobin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Iptunnelparam)) return false;
        Iptunnelparam other = (Iptunnelparam) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.srcip==null && other.getSrcip()==null) || 
             (this.srcip!=null &&
              this.srcip.equals(other.getSrcip()))) &&
            ((this.dropfrag==null && other.getDropfrag()==null) || 
             (this.dropfrag!=null &&
              this.dropfrag.equals(other.getDropfrag()))) &&
            ((this.dropfragcputhreshold==null && other.getDropfragcputhreshold()==null) || 
             (this.dropfragcputhreshold!=null &&
              this.dropfragcputhreshold.equals(other.getDropfragcputhreshold()))) &&
            ((this.srciproundrobin==null && other.getSrciproundrobin()==null) || 
             (this.srciproundrobin!=null &&
              this.srciproundrobin.equals(other.getSrciproundrobin())));
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
        if (getSrcip() != null) {
            _hashCode += getSrcip().hashCode();
        }
        if (getDropfrag() != null) {
            _hashCode += getDropfrag().hashCode();
        }
        if (getDropfragcputhreshold() != null) {
            _hashCode += getDropfragcputhreshold().hashCode();
        }
        if (getSrciproundrobin() != null) {
            _hashCode += getSrciproundrobin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Iptunnelparam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "iptunnelparam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srcip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dropfrag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dropfrag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dropfragcputhreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dropfragcputhreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srciproundrobin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srciproundrobin"));
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
