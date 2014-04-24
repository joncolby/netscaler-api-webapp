/**
 * Inatparam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Inatparam  implements java.io.Serializable {
    private java.lang.String nat46V6Prefix;

    private java.lang.String nat46Ignoretos;

    private java.lang.String nat46Zerochecksum;

    private org.apache.axis.types.UnsignedInt nat46V6Mtu;

    private java.lang.String nat46Fragheader;

    public Inatparam() {
    }

    public Inatparam(
           java.lang.String nat46V6Prefix,
           java.lang.String nat46Ignoretos,
           java.lang.String nat46Zerochecksum,
           org.apache.axis.types.UnsignedInt nat46V6Mtu,
           java.lang.String nat46Fragheader) {
           this.nat46V6Prefix = nat46V6Prefix;
           this.nat46Ignoretos = nat46Ignoretos;
           this.nat46Zerochecksum = nat46Zerochecksum;
           this.nat46V6Mtu = nat46V6Mtu;
           this.nat46Fragheader = nat46Fragheader;
    }


    /**
     * Gets the nat46V6Prefix value for this Inatparam.
     * 
     * @return nat46V6Prefix
     */
    public java.lang.String getNat46V6Prefix() {
        return nat46V6Prefix;
    }


    /**
     * Sets the nat46V6Prefix value for this Inatparam.
     * 
     * @param nat46V6Prefix
     */
    public void setNat46V6Prefix(java.lang.String nat46V6Prefix) {
        this.nat46V6Prefix = nat46V6Prefix;
    }


    /**
     * Gets the nat46Ignoretos value for this Inatparam.
     * 
     * @return nat46Ignoretos
     */
    public java.lang.String getNat46Ignoretos() {
        return nat46Ignoretos;
    }


    /**
     * Sets the nat46Ignoretos value for this Inatparam.
     * 
     * @param nat46Ignoretos
     */
    public void setNat46Ignoretos(java.lang.String nat46Ignoretos) {
        this.nat46Ignoretos = nat46Ignoretos;
    }


    /**
     * Gets the nat46Zerochecksum value for this Inatparam.
     * 
     * @return nat46Zerochecksum
     */
    public java.lang.String getNat46Zerochecksum() {
        return nat46Zerochecksum;
    }


    /**
     * Sets the nat46Zerochecksum value for this Inatparam.
     * 
     * @param nat46Zerochecksum
     */
    public void setNat46Zerochecksum(java.lang.String nat46Zerochecksum) {
        this.nat46Zerochecksum = nat46Zerochecksum;
    }


    /**
     * Gets the nat46V6Mtu value for this Inatparam.
     * 
     * @return nat46V6Mtu
     */
    public org.apache.axis.types.UnsignedInt getNat46V6Mtu() {
        return nat46V6Mtu;
    }


    /**
     * Sets the nat46V6Mtu value for this Inatparam.
     * 
     * @param nat46V6Mtu
     */
    public void setNat46V6Mtu(org.apache.axis.types.UnsignedInt nat46V6Mtu) {
        this.nat46V6Mtu = nat46V6Mtu;
    }


    /**
     * Gets the nat46Fragheader value for this Inatparam.
     * 
     * @return nat46Fragheader
     */
    public java.lang.String getNat46Fragheader() {
        return nat46Fragheader;
    }


    /**
     * Sets the nat46Fragheader value for this Inatparam.
     * 
     * @param nat46Fragheader
     */
    public void setNat46Fragheader(java.lang.String nat46Fragheader) {
        this.nat46Fragheader = nat46Fragheader;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Inatparam)) return false;
        Inatparam other = (Inatparam) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nat46V6Prefix==null && other.getNat46V6Prefix()==null) || 
             (this.nat46V6Prefix!=null &&
              this.nat46V6Prefix.equals(other.getNat46V6Prefix()))) &&
            ((this.nat46Ignoretos==null && other.getNat46Ignoretos()==null) || 
             (this.nat46Ignoretos!=null &&
              this.nat46Ignoretos.equals(other.getNat46Ignoretos()))) &&
            ((this.nat46Zerochecksum==null && other.getNat46Zerochecksum()==null) || 
             (this.nat46Zerochecksum!=null &&
              this.nat46Zerochecksum.equals(other.getNat46Zerochecksum()))) &&
            ((this.nat46V6Mtu==null && other.getNat46V6Mtu()==null) || 
             (this.nat46V6Mtu!=null &&
              this.nat46V6Mtu.equals(other.getNat46V6Mtu()))) &&
            ((this.nat46Fragheader==null && other.getNat46Fragheader()==null) || 
             (this.nat46Fragheader!=null &&
              this.nat46Fragheader.equals(other.getNat46Fragheader())));
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
        if (getNat46V6Prefix() != null) {
            _hashCode += getNat46V6Prefix().hashCode();
        }
        if (getNat46Ignoretos() != null) {
            _hashCode += getNat46Ignoretos().hashCode();
        }
        if (getNat46Zerochecksum() != null) {
            _hashCode += getNat46Zerochecksum().hashCode();
        }
        if (getNat46V6Mtu() != null) {
            _hashCode += getNat46V6Mtu().hashCode();
        }
        if (getNat46Fragheader() != null) {
            _hashCode += getNat46Fragheader().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Inatparam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "inatparam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nat46V6Prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nat46v6prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nat46Ignoretos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nat46ignoretos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nat46Zerochecksum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nat46zerochecksum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nat46V6Mtu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nat46v6mtu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nat46Fragheader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nat46fragheader"));
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
