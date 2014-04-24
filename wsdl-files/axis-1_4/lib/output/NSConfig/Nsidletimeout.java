/**
 * Nsidletimeout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nsidletimeout  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt tcpsvr;

    private org.apache.axis.types.UnsignedInt tcpclt;

    private org.apache.axis.types.UnsignedInt nontcpsvrclt;

    public Nsidletimeout() {
    }

    public Nsidletimeout(
           org.apache.axis.types.UnsignedInt tcpsvr,
           org.apache.axis.types.UnsignedInt tcpclt,
           org.apache.axis.types.UnsignedInt nontcpsvrclt) {
           this.tcpsvr = tcpsvr;
           this.tcpclt = tcpclt;
           this.nontcpsvrclt = nontcpsvrclt;
    }


    /**
     * Gets the tcpsvr value for this Nsidletimeout.
     * 
     * @return tcpsvr
     */
    public org.apache.axis.types.UnsignedInt getTcpsvr() {
        return tcpsvr;
    }


    /**
     * Sets the tcpsvr value for this Nsidletimeout.
     * 
     * @param tcpsvr
     */
    public void setTcpsvr(org.apache.axis.types.UnsignedInt tcpsvr) {
        this.tcpsvr = tcpsvr;
    }


    /**
     * Gets the tcpclt value for this Nsidletimeout.
     * 
     * @return tcpclt
     */
    public org.apache.axis.types.UnsignedInt getTcpclt() {
        return tcpclt;
    }


    /**
     * Sets the tcpclt value for this Nsidletimeout.
     * 
     * @param tcpclt
     */
    public void setTcpclt(org.apache.axis.types.UnsignedInt tcpclt) {
        this.tcpclt = tcpclt;
    }


    /**
     * Gets the nontcpsvrclt value for this Nsidletimeout.
     * 
     * @return nontcpsvrclt
     */
    public org.apache.axis.types.UnsignedInt getNontcpsvrclt() {
        return nontcpsvrclt;
    }


    /**
     * Sets the nontcpsvrclt value for this Nsidletimeout.
     * 
     * @param nontcpsvrclt
     */
    public void setNontcpsvrclt(org.apache.axis.types.UnsignedInt nontcpsvrclt) {
        this.nontcpsvrclt = nontcpsvrclt;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nsidletimeout)) return false;
        Nsidletimeout other = (Nsidletimeout) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tcpsvr==null && other.getTcpsvr()==null) || 
             (this.tcpsvr!=null &&
              this.tcpsvr.equals(other.getTcpsvr()))) &&
            ((this.tcpclt==null && other.getTcpclt()==null) || 
             (this.tcpclt!=null &&
              this.tcpclt.equals(other.getTcpclt()))) &&
            ((this.nontcpsvrclt==null && other.getNontcpsvrclt()==null) || 
             (this.nontcpsvrclt!=null &&
              this.nontcpsvrclt.equals(other.getNontcpsvrclt())));
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
        if (getTcpsvr() != null) {
            _hashCode += getTcpsvr().hashCode();
        }
        if (getTcpclt() != null) {
            _hashCode += getTcpclt().hashCode();
        }
        if (getNontcpsvrclt() != null) {
            _hashCode += getNontcpsvrclt().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nsidletimeout.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nsidletimeout"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcpsvr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tcpsvr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcpclt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tcpclt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nontcpsvrclt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nontcpsvrclt"));
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
