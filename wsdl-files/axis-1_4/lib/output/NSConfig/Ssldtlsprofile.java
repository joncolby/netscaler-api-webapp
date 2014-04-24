/**
 * Ssldtlsprofile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Ssldtlsprofile  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String pmtudiscovery;

    private org.apache.axis.types.UnsignedInt maxrecordsize;

    private org.apache.axis.types.UnsignedInt maxretrytime;

    private java.lang.String helloverifyrequest;

    private java.lang.String terminatesession;

    private org.apache.axis.types.UnsignedInt maxpacketsize;

    public Ssldtlsprofile() {
    }

    public Ssldtlsprofile(
           java.lang.String name,
           java.lang.String pmtudiscovery,
           org.apache.axis.types.UnsignedInt maxrecordsize,
           org.apache.axis.types.UnsignedInt maxretrytime,
           java.lang.String helloverifyrequest,
           java.lang.String terminatesession,
           org.apache.axis.types.UnsignedInt maxpacketsize) {
           this.name = name;
           this.pmtudiscovery = pmtudiscovery;
           this.maxrecordsize = maxrecordsize;
           this.maxretrytime = maxretrytime;
           this.helloverifyrequest = helloverifyrequest;
           this.terminatesession = terminatesession;
           this.maxpacketsize = maxpacketsize;
    }


    /**
     * Gets the name value for this Ssldtlsprofile.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Ssldtlsprofile.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the pmtudiscovery value for this Ssldtlsprofile.
     * 
     * @return pmtudiscovery
     */
    public java.lang.String getPmtudiscovery() {
        return pmtudiscovery;
    }


    /**
     * Sets the pmtudiscovery value for this Ssldtlsprofile.
     * 
     * @param pmtudiscovery
     */
    public void setPmtudiscovery(java.lang.String pmtudiscovery) {
        this.pmtudiscovery = pmtudiscovery;
    }


    /**
     * Gets the maxrecordsize value for this Ssldtlsprofile.
     * 
     * @return maxrecordsize
     */
    public org.apache.axis.types.UnsignedInt getMaxrecordsize() {
        return maxrecordsize;
    }


    /**
     * Sets the maxrecordsize value for this Ssldtlsprofile.
     * 
     * @param maxrecordsize
     */
    public void setMaxrecordsize(org.apache.axis.types.UnsignedInt maxrecordsize) {
        this.maxrecordsize = maxrecordsize;
    }


    /**
     * Gets the maxretrytime value for this Ssldtlsprofile.
     * 
     * @return maxretrytime
     */
    public org.apache.axis.types.UnsignedInt getMaxretrytime() {
        return maxretrytime;
    }


    /**
     * Sets the maxretrytime value for this Ssldtlsprofile.
     * 
     * @param maxretrytime
     */
    public void setMaxretrytime(org.apache.axis.types.UnsignedInt maxretrytime) {
        this.maxretrytime = maxretrytime;
    }


    /**
     * Gets the helloverifyrequest value for this Ssldtlsprofile.
     * 
     * @return helloverifyrequest
     */
    public java.lang.String getHelloverifyrequest() {
        return helloverifyrequest;
    }


    /**
     * Sets the helloverifyrequest value for this Ssldtlsprofile.
     * 
     * @param helloverifyrequest
     */
    public void setHelloverifyrequest(java.lang.String helloverifyrequest) {
        this.helloverifyrequest = helloverifyrequest;
    }


    /**
     * Gets the terminatesession value for this Ssldtlsprofile.
     * 
     * @return terminatesession
     */
    public java.lang.String getTerminatesession() {
        return terminatesession;
    }


    /**
     * Sets the terminatesession value for this Ssldtlsprofile.
     * 
     * @param terminatesession
     */
    public void setTerminatesession(java.lang.String terminatesession) {
        this.terminatesession = terminatesession;
    }


    /**
     * Gets the maxpacketsize value for this Ssldtlsprofile.
     * 
     * @return maxpacketsize
     */
    public org.apache.axis.types.UnsignedInt getMaxpacketsize() {
        return maxpacketsize;
    }


    /**
     * Sets the maxpacketsize value for this Ssldtlsprofile.
     * 
     * @param maxpacketsize
     */
    public void setMaxpacketsize(org.apache.axis.types.UnsignedInt maxpacketsize) {
        this.maxpacketsize = maxpacketsize;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ssldtlsprofile)) return false;
        Ssldtlsprofile other = (Ssldtlsprofile) obj;
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
            ((this.pmtudiscovery==null && other.getPmtudiscovery()==null) || 
             (this.pmtudiscovery!=null &&
              this.pmtudiscovery.equals(other.getPmtudiscovery()))) &&
            ((this.maxrecordsize==null && other.getMaxrecordsize()==null) || 
             (this.maxrecordsize!=null &&
              this.maxrecordsize.equals(other.getMaxrecordsize()))) &&
            ((this.maxretrytime==null && other.getMaxretrytime()==null) || 
             (this.maxretrytime!=null &&
              this.maxretrytime.equals(other.getMaxretrytime()))) &&
            ((this.helloverifyrequest==null && other.getHelloverifyrequest()==null) || 
             (this.helloverifyrequest!=null &&
              this.helloverifyrequest.equals(other.getHelloverifyrequest()))) &&
            ((this.terminatesession==null && other.getTerminatesession()==null) || 
             (this.terminatesession!=null &&
              this.terminatesession.equals(other.getTerminatesession()))) &&
            ((this.maxpacketsize==null && other.getMaxpacketsize()==null) || 
             (this.maxpacketsize!=null &&
              this.maxpacketsize.equals(other.getMaxpacketsize())));
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
        if (getPmtudiscovery() != null) {
            _hashCode += getPmtudiscovery().hashCode();
        }
        if (getMaxrecordsize() != null) {
            _hashCode += getMaxrecordsize().hashCode();
        }
        if (getMaxretrytime() != null) {
            _hashCode += getMaxretrytime().hashCode();
        }
        if (getHelloverifyrequest() != null) {
            _hashCode += getHelloverifyrequest().hashCode();
        }
        if (getTerminatesession() != null) {
            _hashCode += getTerminatesession().hashCode();
        }
        if (getMaxpacketsize() != null) {
            _hashCode += getMaxpacketsize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ssldtlsprofile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "ssldtlsprofile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pmtudiscovery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pmtudiscovery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxrecordsize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxrecordsize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxretrytime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxretrytime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("helloverifyrequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "helloverifyrequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("terminatesession");
        elemField.setXmlName(new javax.xml.namespace.QName("", "terminatesession"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxpacketsize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxpacketsize"));
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
