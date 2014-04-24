/**
 * Lbmetrictable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Lbmetrictable  implements java.io.Serializable {
    private java.lang.String metrictable;

    private java.lang.String[] metric;

    private java.lang.String[] snmpoid;

    private boolean flags;

    private java.lang.String metrictype;

    private java.lang.String[] type;

    public Lbmetrictable() {
    }

    public Lbmetrictable(
           java.lang.String metrictable,
           java.lang.String[] metric,
           java.lang.String[] snmpoid,
           boolean flags,
           java.lang.String metrictype,
           java.lang.String[] type) {
           this.metrictable = metrictable;
           this.metric = metric;
           this.snmpoid = snmpoid;
           this.flags = flags;
           this.metrictype = metrictype;
           this.type = type;
    }


    /**
     * Gets the metrictable value for this Lbmetrictable.
     * 
     * @return metrictable
     */
    public java.lang.String getMetrictable() {
        return metrictable;
    }


    /**
     * Sets the metrictable value for this Lbmetrictable.
     * 
     * @param metrictable
     */
    public void setMetrictable(java.lang.String metrictable) {
        this.metrictable = metrictable;
    }


    /**
     * Gets the metric value for this Lbmetrictable.
     * 
     * @return metric
     */
    public java.lang.String[] getMetric() {
        return metric;
    }


    /**
     * Sets the metric value for this Lbmetrictable.
     * 
     * @param metric
     */
    public void setMetric(java.lang.String[] metric) {
        this.metric = metric;
    }


    /**
     * Gets the snmpoid value for this Lbmetrictable.
     * 
     * @return snmpoid
     */
    public java.lang.String[] getSnmpoid() {
        return snmpoid;
    }


    /**
     * Sets the snmpoid value for this Lbmetrictable.
     * 
     * @param snmpoid
     */
    public void setSnmpoid(java.lang.String[] snmpoid) {
        this.snmpoid = snmpoid;
    }


    /**
     * Gets the flags value for this Lbmetrictable.
     * 
     * @return flags
     */
    public boolean isFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this Lbmetrictable.
     * 
     * @param flags
     */
    public void setFlags(boolean flags) {
        this.flags = flags;
    }


    /**
     * Gets the metrictype value for this Lbmetrictable.
     * 
     * @return metrictype
     */
    public java.lang.String getMetrictype() {
        return metrictype;
    }


    /**
     * Sets the metrictype value for this Lbmetrictable.
     * 
     * @param metrictype
     */
    public void setMetrictype(java.lang.String metrictype) {
        this.metrictype = metrictype;
    }


    /**
     * Gets the type value for this Lbmetrictable.
     * 
     * @return type
     */
    public java.lang.String[] getType() {
        return type;
    }


    /**
     * Sets the type value for this Lbmetrictable.
     * 
     * @param type
     */
    public void setType(java.lang.String[] type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Lbmetrictable)) return false;
        Lbmetrictable other = (Lbmetrictable) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.metrictable==null && other.getMetrictable()==null) || 
             (this.metrictable!=null &&
              this.metrictable.equals(other.getMetrictable()))) &&
            ((this.metric==null && other.getMetric()==null) || 
             (this.metric!=null &&
              java.util.Arrays.equals(this.metric, other.getMetric()))) &&
            ((this.snmpoid==null && other.getSnmpoid()==null) || 
             (this.snmpoid!=null &&
              java.util.Arrays.equals(this.snmpoid, other.getSnmpoid()))) &&
            this.flags == other.isFlags() &&
            ((this.metrictype==null && other.getMetrictype()==null) || 
             (this.metrictype!=null &&
              this.metrictype.equals(other.getMetrictype()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              java.util.Arrays.equals(this.type, other.getType())));
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
        if (getMetrictable() != null) {
            _hashCode += getMetrictable().hashCode();
        }
        if (getMetric() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMetric());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMetric(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSnmpoid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSnmpoid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSnmpoid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isFlags() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMetrictype() != null) {
            _hashCode += getMetrictype().hashCode();
        }
        if (getType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Lbmetrictable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "lbmetrictable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metrictable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metrictable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metric");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metric"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("snmpoid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "snmpoid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metrictype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "metrictype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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
