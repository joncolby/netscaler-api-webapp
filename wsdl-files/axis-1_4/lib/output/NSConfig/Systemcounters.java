/**
 * Systemcounters.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Systemcounters  implements java.io.Serializable {
    private java.lang.String countergroup;

    private java.lang.String datasource;

    private java.lang.String response;

    public Systemcounters() {
    }

    public Systemcounters(
           java.lang.String countergroup,
           java.lang.String datasource,
           java.lang.String response) {
           this.countergroup = countergroup;
           this.datasource = datasource;
           this.response = response;
    }


    /**
     * Gets the countergroup value for this Systemcounters.
     * 
     * @return countergroup
     */
    public java.lang.String getCountergroup() {
        return countergroup;
    }


    /**
     * Sets the countergroup value for this Systemcounters.
     * 
     * @param countergroup
     */
    public void setCountergroup(java.lang.String countergroup) {
        this.countergroup = countergroup;
    }


    /**
     * Gets the datasource value for this Systemcounters.
     * 
     * @return datasource
     */
    public java.lang.String getDatasource() {
        return datasource;
    }


    /**
     * Sets the datasource value for this Systemcounters.
     * 
     * @param datasource
     */
    public void setDatasource(java.lang.String datasource) {
        this.datasource = datasource;
    }


    /**
     * Gets the response value for this Systemcounters.
     * 
     * @return response
     */
    public java.lang.String getResponse() {
        return response;
    }


    /**
     * Sets the response value for this Systemcounters.
     * 
     * @param response
     */
    public void setResponse(java.lang.String response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Systemcounters)) return false;
        Systemcounters other = (Systemcounters) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.countergroup==null && other.getCountergroup()==null) || 
             (this.countergroup!=null &&
              this.countergroup.equals(other.getCountergroup()))) &&
            ((this.datasource==null && other.getDatasource()==null) || 
             (this.datasource!=null &&
              this.datasource.equals(other.getDatasource()))) &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse())));
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
        if (getCountergroup() != null) {
            _hashCode += getCountergroup().hashCode();
        }
        if (getDatasource() != null) {
            _hashCode += getDatasource().hashCode();
        }
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Systemcounters.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "systemcounters"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countergroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "countergroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datasource");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datasource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("", "response"));
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
