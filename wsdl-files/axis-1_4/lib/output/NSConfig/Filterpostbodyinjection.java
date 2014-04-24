/**
 * Filterpostbodyinjection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Filterpostbodyinjection  implements java.io.Serializable {
    private java.lang.String postbody;

    private java.lang.String systemiid;

    public Filterpostbodyinjection() {
    }

    public Filterpostbodyinjection(
           java.lang.String postbody,
           java.lang.String systemiid) {
           this.postbody = postbody;
           this.systemiid = systemiid;
    }


    /**
     * Gets the postbody value for this Filterpostbodyinjection.
     * 
     * @return postbody
     */
    public java.lang.String getPostbody() {
        return postbody;
    }


    /**
     * Sets the postbody value for this Filterpostbodyinjection.
     * 
     * @param postbody
     */
    public void setPostbody(java.lang.String postbody) {
        this.postbody = postbody;
    }


    /**
     * Gets the systemiid value for this Filterpostbodyinjection.
     * 
     * @return systemiid
     */
    public java.lang.String getSystemiid() {
        return systemiid;
    }


    /**
     * Sets the systemiid value for this Filterpostbodyinjection.
     * 
     * @param systemiid
     */
    public void setSystemiid(java.lang.String systemiid) {
        this.systemiid = systemiid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Filterpostbodyinjection)) return false;
        Filterpostbodyinjection other = (Filterpostbodyinjection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.postbody==null && other.getPostbody()==null) || 
             (this.postbody!=null &&
              this.postbody.equals(other.getPostbody()))) &&
            ((this.systemiid==null && other.getSystemiid()==null) || 
             (this.systemiid!=null &&
              this.systemiid.equals(other.getSystemiid())));
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
        if (getPostbody() != null) {
            _hashCode += getPostbody().hashCode();
        }
        if (getSystemiid() != null) {
            _hashCode += getSystemiid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Filterpostbodyinjection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "filterpostbodyinjection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postbody");
        elemField.setXmlName(new javax.xml.namespace.QName("", "postbody"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("systemiid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "systemiid"));
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
