/**
 * Systemparameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Systemparameter  implements java.io.Serializable {
    private java.lang.String rbaonresponse;

    private java.lang.String promptstring;

    private org.apache.axis.types.UnsignedInt natpcbforceflushlimit;

    private java.lang.String natpcbrstontimeout;

    private org.apache.axis.types.UnsignedInt timeout;

    public Systemparameter() {
    }

    public Systemparameter(
           java.lang.String rbaonresponse,
           java.lang.String promptstring,
           org.apache.axis.types.UnsignedInt natpcbforceflushlimit,
           java.lang.String natpcbrstontimeout,
           org.apache.axis.types.UnsignedInt timeout) {
           this.rbaonresponse = rbaonresponse;
           this.promptstring = promptstring;
           this.natpcbforceflushlimit = natpcbforceflushlimit;
           this.natpcbrstontimeout = natpcbrstontimeout;
           this.timeout = timeout;
    }


    /**
     * Gets the rbaonresponse value for this Systemparameter.
     * 
     * @return rbaonresponse
     */
    public java.lang.String getRbaonresponse() {
        return rbaonresponse;
    }


    /**
     * Sets the rbaonresponse value for this Systemparameter.
     * 
     * @param rbaonresponse
     */
    public void setRbaonresponse(java.lang.String rbaonresponse) {
        this.rbaonresponse = rbaonresponse;
    }


    /**
     * Gets the promptstring value for this Systemparameter.
     * 
     * @return promptstring
     */
    public java.lang.String getPromptstring() {
        return promptstring;
    }


    /**
     * Sets the promptstring value for this Systemparameter.
     * 
     * @param promptstring
     */
    public void setPromptstring(java.lang.String promptstring) {
        this.promptstring = promptstring;
    }


    /**
     * Gets the natpcbforceflushlimit value for this Systemparameter.
     * 
     * @return natpcbforceflushlimit
     */
    public org.apache.axis.types.UnsignedInt getNatpcbforceflushlimit() {
        return natpcbforceflushlimit;
    }


    /**
     * Sets the natpcbforceflushlimit value for this Systemparameter.
     * 
     * @param natpcbforceflushlimit
     */
    public void setNatpcbforceflushlimit(org.apache.axis.types.UnsignedInt natpcbforceflushlimit) {
        this.natpcbforceflushlimit = natpcbforceflushlimit;
    }


    /**
     * Gets the natpcbrstontimeout value for this Systemparameter.
     * 
     * @return natpcbrstontimeout
     */
    public java.lang.String getNatpcbrstontimeout() {
        return natpcbrstontimeout;
    }


    /**
     * Sets the natpcbrstontimeout value for this Systemparameter.
     * 
     * @param natpcbrstontimeout
     */
    public void setNatpcbrstontimeout(java.lang.String natpcbrstontimeout) {
        this.natpcbrstontimeout = natpcbrstontimeout;
    }


    /**
     * Gets the timeout value for this Systemparameter.
     * 
     * @return timeout
     */
    public org.apache.axis.types.UnsignedInt getTimeout() {
        return timeout;
    }


    /**
     * Sets the timeout value for this Systemparameter.
     * 
     * @param timeout
     */
    public void setTimeout(org.apache.axis.types.UnsignedInt timeout) {
        this.timeout = timeout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Systemparameter)) return false;
        Systemparameter other = (Systemparameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rbaonresponse==null && other.getRbaonresponse()==null) || 
             (this.rbaonresponse!=null &&
              this.rbaonresponse.equals(other.getRbaonresponse()))) &&
            ((this.promptstring==null && other.getPromptstring()==null) || 
             (this.promptstring!=null &&
              this.promptstring.equals(other.getPromptstring()))) &&
            ((this.natpcbforceflushlimit==null && other.getNatpcbforceflushlimit()==null) || 
             (this.natpcbforceflushlimit!=null &&
              this.natpcbforceflushlimit.equals(other.getNatpcbforceflushlimit()))) &&
            ((this.natpcbrstontimeout==null && other.getNatpcbrstontimeout()==null) || 
             (this.natpcbrstontimeout!=null &&
              this.natpcbrstontimeout.equals(other.getNatpcbrstontimeout()))) &&
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
        if (getRbaonresponse() != null) {
            _hashCode += getRbaonresponse().hashCode();
        }
        if (getPromptstring() != null) {
            _hashCode += getPromptstring().hashCode();
        }
        if (getNatpcbforceflushlimit() != null) {
            _hashCode += getNatpcbforceflushlimit().hashCode();
        }
        if (getNatpcbrstontimeout() != null) {
            _hashCode += getNatpcbrstontimeout().hashCode();
        }
        if (getTimeout() != null) {
            _hashCode += getTimeout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Systemparameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "systemparameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rbaonresponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rbaonresponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promptstring");
        elemField.setXmlName(new javax.xml.namespace.QName("", "promptstring"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natpcbforceflushlimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "natpcbforceflushlimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natpcbrstontimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "natpcbrstontimeout"));
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
