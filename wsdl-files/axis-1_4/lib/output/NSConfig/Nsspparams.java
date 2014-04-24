/**
 * Nsspparams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nsspparams  implements java.io.Serializable {
    private int basethreshold;

    private java.lang.String throttle;

    private int[] table;

    public Nsspparams() {
    }

    public Nsspparams(
           int basethreshold,
           java.lang.String throttle,
           int[] table) {
           this.basethreshold = basethreshold;
           this.throttle = throttle;
           this.table = table;
    }


    /**
     * Gets the basethreshold value for this Nsspparams.
     * 
     * @return basethreshold
     */
    public int getBasethreshold() {
        return basethreshold;
    }


    /**
     * Sets the basethreshold value for this Nsspparams.
     * 
     * @param basethreshold
     */
    public void setBasethreshold(int basethreshold) {
        this.basethreshold = basethreshold;
    }


    /**
     * Gets the throttle value for this Nsspparams.
     * 
     * @return throttle
     */
    public java.lang.String getThrottle() {
        return throttle;
    }


    /**
     * Sets the throttle value for this Nsspparams.
     * 
     * @param throttle
     */
    public void setThrottle(java.lang.String throttle) {
        this.throttle = throttle;
    }


    /**
     * Gets the table value for this Nsspparams.
     * 
     * @return table
     */
    public int[] getTable() {
        return table;
    }


    /**
     * Sets the table value for this Nsspparams.
     * 
     * @param table
     */
    public void setTable(int[] table) {
        this.table = table;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nsspparams)) return false;
        Nsspparams other = (Nsspparams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.basethreshold == other.getBasethreshold() &&
            ((this.throttle==null && other.getThrottle()==null) || 
             (this.throttle!=null &&
              this.throttle.equals(other.getThrottle()))) &&
            ((this.table==null && other.getTable()==null) || 
             (this.table!=null &&
              java.util.Arrays.equals(this.table, other.getTable())));
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
        _hashCode += getBasethreshold();
        if (getThrottle() != null) {
            _hashCode += getThrottle().hashCode();
        }
        if (getTable() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTable());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTable(), i);
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
        new org.apache.axis.description.TypeDesc(Nsspparams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nsspparams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basethreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "basethreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("throttle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "throttle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("table");
        elemField.setXmlName(new javax.xml.namespace.QName("", "table"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
