/**
 * Systementitydata.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Systementitydata  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String name;

    private java.lang.String counters;

    private java.lang.String starttime;

    private java.lang.String endtime;

    private int last;

    private java.lang.String unit;

    private java.lang.String datasource;

    private int core;

    private java.lang.String response;

    private org.apache.axis.types.UnsignedInt startupdate;

    private org.apache.axis.types.UnsignedInt lastupdate;

    public Systementitydata() {
    }

    public Systementitydata(
           java.lang.String type,
           java.lang.String name,
           java.lang.String counters,
           java.lang.String starttime,
           java.lang.String endtime,
           int last,
           java.lang.String unit,
           java.lang.String datasource,
           int core,
           java.lang.String response,
           org.apache.axis.types.UnsignedInt startupdate,
           org.apache.axis.types.UnsignedInt lastupdate) {
           this.type = type;
           this.name = name;
           this.counters = counters;
           this.starttime = starttime;
           this.endtime = endtime;
           this.last = last;
           this.unit = unit;
           this.datasource = datasource;
           this.core = core;
           this.response = response;
           this.startupdate = startupdate;
           this.lastupdate = lastupdate;
    }


    /**
     * Gets the type value for this Systementitydata.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Systementitydata.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the name value for this Systementitydata.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Systementitydata.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the counters value for this Systementitydata.
     * 
     * @return counters
     */
    public java.lang.String getCounters() {
        return counters;
    }


    /**
     * Sets the counters value for this Systementitydata.
     * 
     * @param counters
     */
    public void setCounters(java.lang.String counters) {
        this.counters = counters;
    }


    /**
     * Gets the starttime value for this Systementitydata.
     * 
     * @return starttime
     */
    public java.lang.String getStarttime() {
        return starttime;
    }


    /**
     * Sets the starttime value for this Systementitydata.
     * 
     * @param starttime
     */
    public void setStarttime(java.lang.String starttime) {
        this.starttime = starttime;
    }


    /**
     * Gets the endtime value for this Systementitydata.
     * 
     * @return endtime
     */
    public java.lang.String getEndtime() {
        return endtime;
    }


    /**
     * Sets the endtime value for this Systementitydata.
     * 
     * @param endtime
     */
    public void setEndtime(java.lang.String endtime) {
        this.endtime = endtime;
    }


    /**
     * Gets the last value for this Systementitydata.
     * 
     * @return last
     */
    public int getLast() {
        return last;
    }


    /**
     * Sets the last value for this Systementitydata.
     * 
     * @param last
     */
    public void setLast(int last) {
        this.last = last;
    }


    /**
     * Gets the unit value for this Systementitydata.
     * 
     * @return unit
     */
    public java.lang.String getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this Systementitydata.
     * 
     * @param unit
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }


    /**
     * Gets the datasource value for this Systementitydata.
     * 
     * @return datasource
     */
    public java.lang.String getDatasource() {
        return datasource;
    }


    /**
     * Sets the datasource value for this Systementitydata.
     * 
     * @param datasource
     */
    public void setDatasource(java.lang.String datasource) {
        this.datasource = datasource;
    }


    /**
     * Gets the core value for this Systementitydata.
     * 
     * @return core
     */
    public int getCore() {
        return core;
    }


    /**
     * Sets the core value for this Systementitydata.
     * 
     * @param core
     */
    public void setCore(int core) {
        this.core = core;
    }


    /**
     * Gets the response value for this Systementitydata.
     * 
     * @return response
     */
    public java.lang.String getResponse() {
        return response;
    }


    /**
     * Sets the response value for this Systementitydata.
     * 
     * @param response
     */
    public void setResponse(java.lang.String response) {
        this.response = response;
    }


    /**
     * Gets the startupdate value for this Systementitydata.
     * 
     * @return startupdate
     */
    public org.apache.axis.types.UnsignedInt getStartupdate() {
        return startupdate;
    }


    /**
     * Sets the startupdate value for this Systementitydata.
     * 
     * @param startupdate
     */
    public void setStartupdate(org.apache.axis.types.UnsignedInt startupdate) {
        this.startupdate = startupdate;
    }


    /**
     * Gets the lastupdate value for this Systementitydata.
     * 
     * @return lastupdate
     */
    public org.apache.axis.types.UnsignedInt getLastupdate() {
        return lastupdate;
    }


    /**
     * Sets the lastupdate value for this Systementitydata.
     * 
     * @param lastupdate
     */
    public void setLastupdate(org.apache.axis.types.UnsignedInt lastupdate) {
        this.lastupdate = lastupdate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Systementitydata)) return false;
        Systementitydata other = (Systementitydata) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.counters==null && other.getCounters()==null) || 
             (this.counters!=null &&
              this.counters.equals(other.getCounters()))) &&
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
            this.core == other.getCore() &&
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse()))) &&
            ((this.startupdate==null && other.getStartupdate()==null) || 
             (this.startupdate!=null &&
              this.startupdate.equals(other.getStartupdate()))) &&
            ((this.lastupdate==null && other.getLastupdate()==null) || 
             (this.lastupdate!=null &&
              this.lastupdate.equals(other.getLastupdate())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getCounters() != null) {
            _hashCode += getCounters().hashCode();
        }
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
        _hashCode += getCore();
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        if (getStartupdate() != null) {
            _hashCode += getStartupdate().hashCode();
        }
        if (getLastupdate() != null) {
            _hashCode += getLastupdate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Systementitydata.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "systementitydata"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("counters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "counters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("core");
        elemField.setXmlName(new javax.xml.namespace.QName("", "core"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startupdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "startupdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastupdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastupdate"));
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
