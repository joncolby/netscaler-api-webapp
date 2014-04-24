/**
 * Lbsipparameters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Lbsipparameters  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt rnatsrcport;

    private org.apache.axis.types.UnsignedInt rnatdstport;

    private org.apache.axis.types.UnsignedInt retrydur;

    private java.lang.String addrportvip;

    private org.apache.axis.types.UnsignedInt sip503Ratethreshold;

    public Lbsipparameters() {
    }

    public Lbsipparameters(
           org.apache.axis.types.UnsignedInt rnatsrcport,
           org.apache.axis.types.UnsignedInt rnatdstport,
           org.apache.axis.types.UnsignedInt retrydur,
           java.lang.String addrportvip,
           org.apache.axis.types.UnsignedInt sip503Ratethreshold) {
           this.rnatsrcport = rnatsrcport;
           this.rnatdstport = rnatdstport;
           this.retrydur = retrydur;
           this.addrportvip = addrportvip;
           this.sip503Ratethreshold = sip503Ratethreshold;
    }


    /**
     * Gets the rnatsrcport value for this Lbsipparameters.
     * 
     * @return rnatsrcport
     */
    public org.apache.axis.types.UnsignedInt getRnatsrcport() {
        return rnatsrcport;
    }


    /**
     * Sets the rnatsrcport value for this Lbsipparameters.
     * 
     * @param rnatsrcport
     */
    public void setRnatsrcport(org.apache.axis.types.UnsignedInt rnatsrcport) {
        this.rnatsrcport = rnatsrcport;
    }


    /**
     * Gets the rnatdstport value for this Lbsipparameters.
     * 
     * @return rnatdstport
     */
    public org.apache.axis.types.UnsignedInt getRnatdstport() {
        return rnatdstport;
    }


    /**
     * Sets the rnatdstport value for this Lbsipparameters.
     * 
     * @param rnatdstport
     */
    public void setRnatdstport(org.apache.axis.types.UnsignedInt rnatdstport) {
        this.rnatdstport = rnatdstport;
    }


    /**
     * Gets the retrydur value for this Lbsipparameters.
     * 
     * @return retrydur
     */
    public org.apache.axis.types.UnsignedInt getRetrydur() {
        return retrydur;
    }


    /**
     * Sets the retrydur value for this Lbsipparameters.
     * 
     * @param retrydur
     */
    public void setRetrydur(org.apache.axis.types.UnsignedInt retrydur) {
        this.retrydur = retrydur;
    }


    /**
     * Gets the addrportvip value for this Lbsipparameters.
     * 
     * @return addrportvip
     */
    public java.lang.String getAddrportvip() {
        return addrportvip;
    }


    /**
     * Sets the addrportvip value for this Lbsipparameters.
     * 
     * @param addrportvip
     */
    public void setAddrportvip(java.lang.String addrportvip) {
        this.addrportvip = addrportvip;
    }


    /**
     * Gets the sip503Ratethreshold value for this Lbsipparameters.
     * 
     * @return sip503Ratethreshold
     */
    public org.apache.axis.types.UnsignedInt getSip503Ratethreshold() {
        return sip503Ratethreshold;
    }


    /**
     * Sets the sip503Ratethreshold value for this Lbsipparameters.
     * 
     * @param sip503Ratethreshold
     */
    public void setSip503Ratethreshold(org.apache.axis.types.UnsignedInt sip503Ratethreshold) {
        this.sip503Ratethreshold = sip503Ratethreshold;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Lbsipparameters)) return false;
        Lbsipparameters other = (Lbsipparameters) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rnatsrcport==null && other.getRnatsrcport()==null) || 
             (this.rnatsrcport!=null &&
              this.rnatsrcport.equals(other.getRnatsrcport()))) &&
            ((this.rnatdstport==null && other.getRnatdstport()==null) || 
             (this.rnatdstport!=null &&
              this.rnatdstport.equals(other.getRnatdstport()))) &&
            ((this.retrydur==null && other.getRetrydur()==null) || 
             (this.retrydur!=null &&
              this.retrydur.equals(other.getRetrydur()))) &&
            ((this.addrportvip==null && other.getAddrportvip()==null) || 
             (this.addrportvip!=null &&
              this.addrportvip.equals(other.getAddrportvip()))) &&
            ((this.sip503Ratethreshold==null && other.getSip503Ratethreshold()==null) || 
             (this.sip503Ratethreshold!=null &&
              this.sip503Ratethreshold.equals(other.getSip503Ratethreshold())));
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
        if (getRnatsrcport() != null) {
            _hashCode += getRnatsrcport().hashCode();
        }
        if (getRnatdstport() != null) {
            _hashCode += getRnatdstport().hashCode();
        }
        if (getRetrydur() != null) {
            _hashCode += getRetrydur().hashCode();
        }
        if (getAddrportvip() != null) {
            _hashCode += getAddrportvip().hashCode();
        }
        if (getSip503Ratethreshold() != null) {
            _hashCode += getSip503Ratethreshold().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Lbsipparameters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "lbsipparameters"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rnatsrcport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rnatsrcport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rnatdstport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rnatdstport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retrydur");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retrydur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addrportvip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "addrportvip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sip503Ratethreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sip503ratethreshold"));
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
