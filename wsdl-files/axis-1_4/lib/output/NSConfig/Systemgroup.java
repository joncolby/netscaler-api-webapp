/**
 * Systemgroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Systemgroup  implements java.io.Serializable {
    private java.lang.String groupname;

    private java.lang.String[] username;

    private java.lang.String[] policyname;

    private org.apache.axis.types.UnsignedInt[] priority;

    private java.lang.String promptstring;

    private org.apache.axis.types.UnsignedInt timeout;

    public Systemgroup() {
    }

    public Systemgroup(
           java.lang.String groupname,
           java.lang.String[] username,
           java.lang.String[] policyname,
           org.apache.axis.types.UnsignedInt[] priority,
           java.lang.String promptstring,
           org.apache.axis.types.UnsignedInt timeout) {
           this.groupname = groupname;
           this.username = username;
           this.policyname = policyname;
           this.priority = priority;
           this.promptstring = promptstring;
           this.timeout = timeout;
    }


    /**
     * Gets the groupname value for this Systemgroup.
     * 
     * @return groupname
     */
    public java.lang.String getGroupname() {
        return groupname;
    }


    /**
     * Sets the groupname value for this Systemgroup.
     * 
     * @param groupname
     */
    public void setGroupname(java.lang.String groupname) {
        this.groupname = groupname;
    }


    /**
     * Gets the username value for this Systemgroup.
     * 
     * @return username
     */
    public java.lang.String[] getUsername() {
        return username;
    }


    /**
     * Sets the username value for this Systemgroup.
     * 
     * @param username
     */
    public void setUsername(java.lang.String[] username) {
        this.username = username;
    }


    /**
     * Gets the policyname value for this Systemgroup.
     * 
     * @return policyname
     */
    public java.lang.String[] getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Systemgroup.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String[] policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the priority value for this Systemgroup.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt[] getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Systemgroup.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt[] priority) {
        this.priority = priority;
    }


    /**
     * Gets the promptstring value for this Systemgroup.
     * 
     * @return promptstring
     */
    public java.lang.String getPromptstring() {
        return promptstring;
    }


    /**
     * Sets the promptstring value for this Systemgroup.
     * 
     * @param promptstring
     */
    public void setPromptstring(java.lang.String promptstring) {
        this.promptstring = promptstring;
    }


    /**
     * Gets the timeout value for this Systemgroup.
     * 
     * @return timeout
     */
    public org.apache.axis.types.UnsignedInt getTimeout() {
        return timeout;
    }


    /**
     * Sets the timeout value for this Systemgroup.
     * 
     * @param timeout
     */
    public void setTimeout(org.apache.axis.types.UnsignedInt timeout) {
        this.timeout = timeout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Systemgroup)) return false;
        Systemgroup other = (Systemgroup) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.groupname==null && other.getGroupname()==null) || 
             (this.groupname!=null &&
              this.groupname.equals(other.getGroupname()))) &&
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              java.util.Arrays.equals(this.username, other.getUsername()))) &&
            ((this.policyname==null && other.getPolicyname()==null) || 
             (this.policyname!=null &&
              java.util.Arrays.equals(this.policyname, other.getPolicyname()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              java.util.Arrays.equals(this.priority, other.getPriority()))) &&
            ((this.promptstring==null && other.getPromptstring()==null) || 
             (this.promptstring!=null &&
              this.promptstring.equals(other.getPromptstring()))) &&
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
        if (getGroupname() != null) {
            _hashCode += getGroupname().hashCode();
        }
        if (getUsername() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUsername());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUsername(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPromptstring() != null) {
            _hashCode += getPromptstring().hashCode();
        }
        if (getTimeout() != null) {
            _hashCode += getTimeout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Systemgroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "systemgroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promptstring");
        elemField.setXmlName(new javax.xml.namespace.QName("", "promptstring"));
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
