/**
 * Filterprebodyinjection.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Filterprebodyinjection  implements java.io.Serializable {
    private java.lang.String prebody;

    private java.lang.String systemiid;

    public Filterprebodyinjection() {
    }

    public Filterprebodyinjection(
           java.lang.String prebody,
           java.lang.String systemiid) {
           this.prebody = prebody;
           this.systemiid = systemiid;
    }


    /**
     * Gets the prebody value for this Filterprebodyinjection.
     * 
     * @return prebody
     */
    public java.lang.String getPrebody() {
        return prebody;
    }


    /**
     * Sets the prebody value for this Filterprebodyinjection.
     * 
     * @param prebody
     */
    public void setPrebody(java.lang.String prebody) {
        this.prebody = prebody;
    }


    /**
     * Gets the systemiid value for this Filterprebodyinjection.
     * 
     * @return systemiid
     */
    public java.lang.String getSystemiid() {
        return systemiid;
    }


    /**
     * Sets the systemiid value for this Filterprebodyinjection.
     * 
     * @param systemiid
     */
    public void setSystemiid(java.lang.String systemiid) {
        this.systemiid = systemiid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Filterprebodyinjection)) return false;
        Filterprebodyinjection other = (Filterprebodyinjection) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.prebody==null && other.getPrebody()==null) || 
             (this.prebody!=null &&
              this.prebody.equals(other.getPrebody()))) &&
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
        if (getPrebody() != null) {
            _hashCode += getPrebody().hashCode();
        }
        if (getSystemiid() != null) {
            _hashCode += getSystemiid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Filterprebodyinjection.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "filterprebodyinjection"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prebody");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prebody"));
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
