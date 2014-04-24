/**
 * Dnsaction64.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Dnsaction64  implements java.io.Serializable {
    private java.lang.String actionname;

    private java.lang.String prefix;

    private java.lang.String mappedrule;

    private java.lang.String excluderule;

    private java.lang.String builtin;

    public Dnsaction64() {
    }

    public Dnsaction64(
           java.lang.String actionname,
           java.lang.String prefix,
           java.lang.String mappedrule,
           java.lang.String excluderule,
           java.lang.String builtin) {
           this.actionname = actionname;
           this.prefix = prefix;
           this.mappedrule = mappedrule;
           this.excluderule = excluderule;
           this.builtin = builtin;
    }


    /**
     * Gets the actionname value for this Dnsaction64.
     * 
     * @return actionname
     */
    public java.lang.String getActionname() {
        return actionname;
    }


    /**
     * Sets the actionname value for this Dnsaction64.
     * 
     * @param actionname
     */
    public void setActionname(java.lang.String actionname) {
        this.actionname = actionname;
    }


    /**
     * Gets the prefix value for this Dnsaction64.
     * 
     * @return prefix
     */
    public java.lang.String getPrefix() {
        return prefix;
    }


    /**
     * Sets the prefix value for this Dnsaction64.
     * 
     * @param prefix
     */
    public void setPrefix(java.lang.String prefix) {
        this.prefix = prefix;
    }


    /**
     * Gets the mappedrule value for this Dnsaction64.
     * 
     * @return mappedrule
     */
    public java.lang.String getMappedrule() {
        return mappedrule;
    }


    /**
     * Sets the mappedrule value for this Dnsaction64.
     * 
     * @param mappedrule
     */
    public void setMappedrule(java.lang.String mappedrule) {
        this.mappedrule = mappedrule;
    }


    /**
     * Gets the excluderule value for this Dnsaction64.
     * 
     * @return excluderule
     */
    public java.lang.String getExcluderule() {
        return excluderule;
    }


    /**
     * Sets the excluderule value for this Dnsaction64.
     * 
     * @param excluderule
     */
    public void setExcluderule(java.lang.String excluderule) {
        this.excluderule = excluderule;
    }


    /**
     * Gets the builtin value for this Dnsaction64.
     * 
     * @return builtin
     */
    public java.lang.String getBuiltin() {
        return builtin;
    }


    /**
     * Sets the builtin value for this Dnsaction64.
     * 
     * @param builtin
     */
    public void setBuiltin(java.lang.String builtin) {
        this.builtin = builtin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Dnsaction64)) return false;
        Dnsaction64 other = (Dnsaction64) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actionname==null && other.getActionname()==null) || 
             (this.actionname!=null &&
              this.actionname.equals(other.getActionname()))) &&
            ((this.prefix==null && other.getPrefix()==null) || 
             (this.prefix!=null &&
              this.prefix.equals(other.getPrefix()))) &&
            ((this.mappedrule==null && other.getMappedrule()==null) || 
             (this.mappedrule!=null &&
              this.mappedrule.equals(other.getMappedrule()))) &&
            ((this.excluderule==null && other.getExcluderule()==null) || 
             (this.excluderule!=null &&
              this.excluderule.equals(other.getExcluderule()))) &&
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
        if (getActionname() != null) {
            _hashCode += getActionname().hashCode();
        }
        if (getPrefix() != null) {
            _hashCode += getPrefix().hashCode();
        }
        if (getMappedrule() != null) {
            _hashCode += getMappedrule().hashCode();
        }
        if (getExcluderule() != null) {
            _hashCode += getExcluderule().hashCode();
        }
        if (getBuiltin() != null) {
            _hashCode += getBuiltin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dnsaction64.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "dnsaction64"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mappedrule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mappedrule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excluderule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "excluderule"));
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
