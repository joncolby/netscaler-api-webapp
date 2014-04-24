/**
 * Dnsnsecrec.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Dnsnsecrec  implements java.io.Serializable {
    private java.lang.String hostname;

    private java.lang.String type;

    private java.lang.String nextnsec;

    private byte[] nsecbitarray;

    private java.lang.String nextrecs;

    public Dnsnsecrec() {
    }

    public Dnsnsecrec(
           java.lang.String hostname,
           java.lang.String type,
           java.lang.String nextnsec,
           byte[] nsecbitarray,
           java.lang.String nextrecs) {
           this.hostname = hostname;
           this.type = type;
           this.nextnsec = nextnsec;
           this.nsecbitarray = nsecbitarray;
           this.nextrecs = nextrecs;
    }


    /**
     * Gets the hostname value for this Dnsnsecrec.
     * 
     * @return hostname
     */
    public java.lang.String getHostname() {
        return hostname;
    }


    /**
     * Sets the hostname value for this Dnsnsecrec.
     * 
     * @param hostname
     */
    public void setHostname(java.lang.String hostname) {
        this.hostname = hostname;
    }


    /**
     * Gets the type value for this Dnsnsecrec.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Dnsnsecrec.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the nextnsec value for this Dnsnsecrec.
     * 
     * @return nextnsec
     */
    public java.lang.String getNextnsec() {
        return nextnsec;
    }


    /**
     * Sets the nextnsec value for this Dnsnsecrec.
     * 
     * @param nextnsec
     */
    public void setNextnsec(java.lang.String nextnsec) {
        this.nextnsec = nextnsec;
    }


    /**
     * Gets the nsecbitarray value for this Dnsnsecrec.
     * 
     * @return nsecbitarray
     */
    public byte[] getNsecbitarray() {
        return nsecbitarray;
    }


    /**
     * Sets the nsecbitarray value for this Dnsnsecrec.
     * 
     * @param nsecbitarray
     */
    public void setNsecbitarray(byte[] nsecbitarray) {
        this.nsecbitarray = nsecbitarray;
    }


    /**
     * Gets the nextrecs value for this Dnsnsecrec.
     * 
     * @return nextrecs
     */
    public java.lang.String getNextrecs() {
        return nextrecs;
    }


    /**
     * Sets the nextrecs value for this Dnsnsecrec.
     * 
     * @param nextrecs
     */
    public void setNextrecs(java.lang.String nextrecs) {
        this.nextrecs = nextrecs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Dnsnsecrec)) return false;
        Dnsnsecrec other = (Dnsnsecrec) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.hostname==null && other.getHostname()==null) || 
             (this.hostname!=null &&
              this.hostname.equals(other.getHostname()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.nextnsec==null && other.getNextnsec()==null) || 
             (this.nextnsec!=null &&
              this.nextnsec.equals(other.getNextnsec()))) &&
            ((this.nsecbitarray==null && other.getNsecbitarray()==null) || 
             (this.nsecbitarray!=null &&
              java.util.Arrays.equals(this.nsecbitarray, other.getNsecbitarray()))) &&
            ((this.nextrecs==null && other.getNextrecs()==null) || 
             (this.nextrecs!=null &&
              this.nextrecs.equals(other.getNextrecs())));
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
        if (getHostname() != null) {
            _hashCode += getHostname().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getNextnsec() != null) {
            _hashCode += getNextnsec().hashCode();
        }
        if (getNsecbitarray() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNsecbitarray());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNsecbitarray(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNextrecs() != null) {
            _hashCode += getNextrecs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dnsnsecrec.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "dnsnsecrec"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextnsec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextnsec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nsecbitarray");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nsecbitarray"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextrecs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextrecs"));
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
