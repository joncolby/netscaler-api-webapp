/**
 * Snmpalarm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Snmpalarm  implements java.io.Serializable {
    private java.lang.String trapname;

    private org.apache.axis.types.UnsignedInt thresholdvalue;

    private org.apache.axis.types.UnsignedInt normalvalue;

    private org.apache.axis.types.UnsignedInt time;

    private java.lang.String state;

    private java.lang.String severity;

    private java.lang.String logging;

    private org.apache.axis.types.UnsignedInt timeout;

    public Snmpalarm() {
    }

    public Snmpalarm(
           java.lang.String trapname,
           org.apache.axis.types.UnsignedInt thresholdvalue,
           org.apache.axis.types.UnsignedInt normalvalue,
           org.apache.axis.types.UnsignedInt time,
           java.lang.String state,
           java.lang.String severity,
           java.lang.String logging,
           org.apache.axis.types.UnsignedInt timeout) {
           this.trapname = trapname;
           this.thresholdvalue = thresholdvalue;
           this.normalvalue = normalvalue;
           this.time = time;
           this.state = state;
           this.severity = severity;
           this.logging = logging;
           this.timeout = timeout;
    }


    /**
     * Gets the trapname value for this Snmpalarm.
     * 
     * @return trapname
     */
    public java.lang.String getTrapname() {
        return trapname;
    }


    /**
     * Sets the trapname value for this Snmpalarm.
     * 
     * @param trapname
     */
    public void setTrapname(java.lang.String trapname) {
        this.trapname = trapname;
    }


    /**
     * Gets the thresholdvalue value for this Snmpalarm.
     * 
     * @return thresholdvalue
     */
    public org.apache.axis.types.UnsignedInt getThresholdvalue() {
        return thresholdvalue;
    }


    /**
     * Sets the thresholdvalue value for this Snmpalarm.
     * 
     * @param thresholdvalue
     */
    public void setThresholdvalue(org.apache.axis.types.UnsignedInt thresholdvalue) {
        this.thresholdvalue = thresholdvalue;
    }


    /**
     * Gets the normalvalue value for this Snmpalarm.
     * 
     * @return normalvalue
     */
    public org.apache.axis.types.UnsignedInt getNormalvalue() {
        return normalvalue;
    }


    /**
     * Sets the normalvalue value for this Snmpalarm.
     * 
     * @param normalvalue
     */
    public void setNormalvalue(org.apache.axis.types.UnsignedInt normalvalue) {
        this.normalvalue = normalvalue;
    }


    /**
     * Gets the time value for this Snmpalarm.
     * 
     * @return time
     */
    public org.apache.axis.types.UnsignedInt getTime() {
        return time;
    }


    /**
     * Sets the time value for this Snmpalarm.
     * 
     * @param time
     */
    public void setTime(org.apache.axis.types.UnsignedInt time) {
        this.time = time;
    }


    /**
     * Gets the state value for this Snmpalarm.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Snmpalarm.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the severity value for this Snmpalarm.
     * 
     * @return severity
     */
    public java.lang.String getSeverity() {
        return severity;
    }


    /**
     * Sets the severity value for this Snmpalarm.
     * 
     * @param severity
     */
    public void setSeverity(java.lang.String severity) {
        this.severity = severity;
    }


    /**
     * Gets the logging value for this Snmpalarm.
     * 
     * @return logging
     */
    public java.lang.String getLogging() {
        return logging;
    }


    /**
     * Sets the logging value for this Snmpalarm.
     * 
     * @param logging
     */
    public void setLogging(java.lang.String logging) {
        this.logging = logging;
    }


    /**
     * Gets the timeout value for this Snmpalarm.
     * 
     * @return timeout
     */
    public org.apache.axis.types.UnsignedInt getTimeout() {
        return timeout;
    }


    /**
     * Sets the timeout value for this Snmpalarm.
     * 
     * @param timeout
     */
    public void setTimeout(org.apache.axis.types.UnsignedInt timeout) {
        this.timeout = timeout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Snmpalarm)) return false;
        Snmpalarm other = (Snmpalarm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.trapname==null && other.getTrapname()==null) || 
             (this.trapname!=null &&
              this.trapname.equals(other.getTrapname()))) &&
            ((this.thresholdvalue==null && other.getThresholdvalue()==null) || 
             (this.thresholdvalue!=null &&
              this.thresholdvalue.equals(other.getThresholdvalue()))) &&
            ((this.normalvalue==null && other.getNormalvalue()==null) || 
             (this.normalvalue!=null &&
              this.normalvalue.equals(other.getNormalvalue()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.severity==null && other.getSeverity()==null) || 
             (this.severity!=null &&
              this.severity.equals(other.getSeverity()))) &&
            ((this.logging==null && other.getLogging()==null) || 
             (this.logging!=null &&
              this.logging.equals(other.getLogging()))) &&
            ((this.timeout==null && other.getTimeout()==null) || 
             (this.timeout!=null &&
              this.timeout.equals(other.getTimeout())));
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
        if (getTrapname() != null) {
            _hashCode += getTrapname().hashCode();
        }
        if (getThresholdvalue() != null) {
            _hashCode += getThresholdvalue().hashCode();
        }
        if (getNormalvalue() != null) {
            _hashCode += getNormalvalue().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getSeverity() != null) {
            _hashCode += getSeverity().hashCode();
        }
        if (getLogging() != null) {
            _hashCode += getLogging().hashCode();
        }
        if (getTimeout() != null) {
            _hashCode += getTimeout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Snmpalarm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "snmpalarm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trapname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trapname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thresholdvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "thresholdvalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("normalvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "normalvalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("severity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "severity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logging");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logging"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeout"));
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
