/**
 * Systemeventhistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Systemeventhistory  implements java.io.Serializable {
    private java.lang.String starttime;

    private java.lang.String endtime;

    private int last;

    private java.lang.String unit;

    private java.lang.String datasource;

    private java.lang.String response;

    public Systemeventhistory() {
    }

    public Systemeventhistory(
           java.lang.String starttime,
           java.lang.String endtime,
           int last,
           java.lang.String unit,
           java.lang.String datasource,
           java.lang.String response) {
           this.starttime = starttime;
           this.endtime = endtime;
           this.last = last;
           this.unit = unit;
           this.datasource = datasource;
           this.response = response;
    }


    /**
     * Gets the starttime value for this Systemeventhistory.
     * 
     * @return starttime
     */
    public java.lang.String getStarttime() {
        return starttime;
    }


    /**
     * Sets the starttime value for this Systemeventhistory.
     * 
     * @param starttime
     */
    public void setStarttime(java.lang.String starttime) {
        this.starttime = starttime;
    }


    /**
     * Gets the endtime value for this Systemeventhistory.
     * 
     * @return endtime
     */
    public java.lang.String getEndtime() {
        return endtime;
    }


    /**
     * Sets the endtime value for this Systemeventhistory.
     * 
     * @param endtime
     */
    public void setEndtime(java.lang.String endtime) {
        this.endtime = endtime;
    }


    /**
     * Gets the last value for this Systemeventhistory.
     * 
     * @return last
     */
    public int getLast() {
        return last;
    }


    /**
     * Sets the last value for this Systemeventhistory.
     * 
     * @param last
     */
    public void setLast(int last) {
        this.last = last;
    }


    /**
     * Gets the unit value for this Systemeventhistory.
     * 
     * @return unit
     */
    public java.lang.String getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this Systemeventhistory.
     * 
     * @param unit
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }


    /**
     * Gets the datasource value for this Systemeventhistory.
     * 
     * @return datasource
     */
    public java.lang.String getDatasource() {
        return datasource;
    }


    /**
     * Sets the datasource value for this Systemeventhistory.
     * 
     * @param datasource
     */
    public void setDatasource(java.lang.String datasource) {
        this.datasource = datasource;
    }


    /**
     * Gets the response value for this Systemeventhistory.
     * 
     * @return response
     */
    public java.lang.String getResponse() {
        return response;
    }


    /**
     * Sets the response value for this Systemeventhistory.
     * 
     * @param response
     */
    public void setResponse(java.lang.String response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Systemeventhistory)) return false;
        Systemeventhistory other = (Systemeventhistory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.starttime==null && other.getStarttime()==null) || 
             (this.starttime!=null &&
              this.starttime.equals(other.getStarttime()))) &&
            ((this.endtime==null && other.getEndtime()==null) || 
             (this.endtime!=null &&
              this.endtime.equals(other.getEndtime()))) &&
            this.last == other.getLast() &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
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
        if (getStarttime() != null) {
            _hashCode += getStarttime().hashCode();
        }
        if (getEndtime() != null) {
            _hashCode += getEndtime().hashCode();
        }
        _hashCode += getLast();
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
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
        new org.apache.axis.description.TypeDesc(Systemeventhistory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "systemeventhistory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("starttime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "starttime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endtime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "endtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("last");
        elemField.setXmlName(new javax.xml.namespace.QName("", "last"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unit"));
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
