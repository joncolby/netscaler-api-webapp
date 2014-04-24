/**
 * Dbdbprofile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Dbdbprofile  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String interpretquery;

    private java.lang.String stickiness;

    private java.lang.String kcdaccount;

    private java.lang.String conmultiplex;

    private org.apache.axis.types.UnsignedInt refcnt;

    public Dbdbprofile() {
    }

    public Dbdbprofile(
           java.lang.String name,
           java.lang.String interpretquery,
           java.lang.String stickiness,
           java.lang.String kcdaccount,
           java.lang.String conmultiplex,
           org.apache.axis.types.UnsignedInt refcnt) {
           this.name = name;
           this.interpretquery = interpretquery;
           this.stickiness = stickiness;
           this.kcdaccount = kcdaccount;
           this.conmultiplex = conmultiplex;
           this.refcnt = refcnt;
    }


    /**
     * Gets the name value for this Dbdbprofile.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Dbdbprofile.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the interpretquery value for this Dbdbprofile.
     * 
     * @return interpretquery
     */
    public java.lang.String getInterpretquery() {
        return interpretquery;
    }


    /**
     * Sets the interpretquery value for this Dbdbprofile.
     * 
     * @param interpretquery
     */
    public void setInterpretquery(java.lang.String interpretquery) {
        this.interpretquery = interpretquery;
    }


    /**
     * Gets the stickiness value for this Dbdbprofile.
     * 
     * @return stickiness
     */
    public java.lang.String getStickiness() {
        return stickiness;
    }


    /**
     * Sets the stickiness value for this Dbdbprofile.
     * 
     * @param stickiness
     */
    public void setStickiness(java.lang.String stickiness) {
        this.stickiness = stickiness;
    }


    /**
     * Gets the kcdaccount value for this Dbdbprofile.
     * 
     * @return kcdaccount
     */
    public java.lang.String getKcdaccount() {
        return kcdaccount;
    }


    /**
     * Sets the kcdaccount value for this Dbdbprofile.
     * 
     * @param kcdaccount
     */
    public void setKcdaccount(java.lang.String kcdaccount) {
        this.kcdaccount = kcdaccount;
    }


    /**
     * Gets the conmultiplex value for this Dbdbprofile.
     * 
     * @return conmultiplex
     */
    public java.lang.String getConmultiplex() {
        return conmultiplex;
    }


    /**
     * Sets the conmultiplex value for this Dbdbprofile.
     * 
     * @param conmultiplex
     */
    public void setConmultiplex(java.lang.String conmultiplex) {
        this.conmultiplex = conmultiplex;
    }


    /**
     * Gets the refcnt value for this Dbdbprofile.
     * 
     * @return refcnt
     */
    public org.apache.axis.types.UnsignedInt getRefcnt() {
        return refcnt;
    }


    /**
     * Sets the refcnt value for this Dbdbprofile.
     * 
     * @param refcnt
     */
    public void setRefcnt(org.apache.axis.types.UnsignedInt refcnt) {
        this.refcnt = refcnt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Dbdbprofile)) return false;
        Dbdbprofile other = (Dbdbprofile) obj;
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
            ((this.interpretquery==null && other.getInterpretquery()==null) || 
             (this.interpretquery!=null &&
              this.interpretquery.equals(other.getInterpretquery()))) &&
            ((this.stickiness==null && other.getStickiness()==null) || 
             (this.stickiness!=null &&
              this.stickiness.equals(other.getStickiness()))) &&
            ((this.kcdaccount==null && other.getKcdaccount()==null) || 
             (this.kcdaccount!=null &&
              this.kcdaccount.equals(other.getKcdaccount()))) &&
            ((this.conmultiplex==null && other.getConmultiplex()==null) || 
             (this.conmultiplex!=null &&
              this.conmultiplex.equals(other.getConmultiplex()))) &&
            ((this.refcnt==null && other.getRefcnt()==null) || 
             (this.refcnt!=null &&
              this.refcnt.equals(other.getRefcnt())));
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
        if (getInterpretquery() != null) {
            _hashCode += getInterpretquery().hashCode();
        }
        if (getStickiness() != null) {
            _hashCode += getStickiness().hashCode();
        }
        if (getKcdaccount() != null) {
            _hashCode += getKcdaccount().hashCode();
        }
        if (getConmultiplex() != null) {
            _hashCode += getConmultiplex().hashCode();
        }
        if (getRefcnt() != null) {
            _hashCode += getRefcnt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dbdbprofile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "dbdbprofile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interpretquery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interpretquery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stickiness");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stickiness"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kcdaccount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kcdaccount"));
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
        elemField.setFieldName("refcnt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refcnt"));
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
