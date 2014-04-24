/**
 * Systemuser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Systemuser  implements java.io.Serializable {
    private java.lang.String username;

    private java.lang.String[] groupname;

    private java.lang.String[] policyname;

    private org.apache.axis.types.UnsignedInt[] priority;

    private java.lang.String password;

    private boolean encrypted;

    private java.lang.String externalauth;

    private java.lang.String promptstring;

    private java.lang.String promptinheritedfrom;

    private org.apache.axis.types.UnsignedInt timeout;

    private java.lang.String timeoutkind;

    public Systemuser() {
    }

    public Systemuser(
           java.lang.String username,
           java.lang.String[] groupname,
           java.lang.String[] policyname,
           org.apache.axis.types.UnsignedInt[] priority,
           java.lang.String password,
           boolean encrypted,
           java.lang.String externalauth,
           java.lang.String promptstring,
           java.lang.String promptinheritedfrom,
           org.apache.axis.types.UnsignedInt timeout,
           java.lang.String timeoutkind) {
           this.username = username;
           this.groupname = groupname;
           this.policyname = policyname;
           this.priority = priority;
           this.password = password;
           this.encrypted = encrypted;
           this.externalauth = externalauth;
           this.promptstring = promptstring;
           this.promptinheritedfrom = promptinheritedfrom;
           this.timeout = timeout;
           this.timeoutkind = timeoutkind;
    }


    /**
     * Gets the username value for this Systemuser.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this Systemuser.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the groupname value for this Systemuser.
     * 
     * @return groupname
     */
    public java.lang.String[] getGroupname() {
        return groupname;
    }


    /**
     * Sets the groupname value for this Systemuser.
     * 
     * @param groupname
     */
    public void setGroupname(java.lang.String[] groupname) {
        this.groupname = groupname;
    }


    /**
     * Gets the policyname value for this Systemuser.
     * 
     * @return policyname
     */
    public java.lang.String[] getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Systemuser.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String[] policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the priority value for this Systemuser.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt[] getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Systemuser.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt[] priority) {
        this.priority = priority;
    }


    /**
     * Gets the password value for this Systemuser.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this Systemuser.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the encrypted value for this Systemuser.
     * 
     * @return encrypted
     */
    public boolean isEncrypted() {
        return encrypted;
    }


    /**
     * Sets the encrypted value for this Systemuser.
     * 
     * @param encrypted
     */
    public void setEncrypted(boolean encrypted) {
        this.encrypted = encrypted;
    }


    /**
     * Gets the externalauth value for this Systemuser.
     * 
     * @return externalauth
     */
    public java.lang.String getExternalauth() {
        return externalauth;
    }


    /**
     * Sets the externalauth value for this Systemuser.
     * 
     * @param externalauth
     */
    public void setExternalauth(java.lang.String externalauth) {
        this.externalauth = externalauth;
    }


    /**
     * Gets the promptstring value for this Systemuser.
     * 
     * @return promptstring
     */
    public java.lang.String getPromptstring() {
        return promptstring;
    }


    /**
     * Sets the promptstring value for this Systemuser.
     * 
     * @param promptstring
     */
    public void setPromptstring(java.lang.String promptstring) {
        this.promptstring = promptstring;
    }


    /**
     * Gets the promptinheritedfrom value for this Systemuser.
     * 
     * @return promptinheritedfrom
     */
    public java.lang.String getPromptinheritedfrom() {
        return promptinheritedfrom;
    }


    /**
     * Sets the promptinheritedfrom value for this Systemuser.
     * 
     * @param promptinheritedfrom
     */
    public void setPromptinheritedfrom(java.lang.String promptinheritedfrom) {
        this.promptinheritedfrom = promptinheritedfrom;
    }


    /**
     * Gets the timeout value for this Systemuser.
     * 
     * @return timeout
     */
    public org.apache.axis.types.UnsignedInt getTimeout() {
        return timeout;
    }


    /**
     * Sets the timeout value for this Systemuser.
     * 
     * @param timeout
     */
    public void setTimeout(org.apache.axis.types.UnsignedInt timeout) {
        this.timeout = timeout;
    }


    /**
     * Gets the timeoutkind value for this Systemuser.
     * 
     * @return timeoutkind
     */
    public java.lang.String getTimeoutkind() {
        return timeoutkind;
    }


    /**
     * Sets the timeoutkind value for this Systemuser.
     * 
     * @param timeoutkind
     */
    public void setTimeoutkind(java.lang.String timeoutkind) {
        this.timeoutkind = timeoutkind;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Systemuser)) return false;
        Systemuser other = (Systemuser) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.username==null && other.getUsername()==null) || 
             (this.username!=null &&
              this.username.equals(other.getUsername()))) &&
            ((this.groupname==null && other.getGroupname()==null) || 
             (this.groupname!=null &&
              java.util.Arrays.equals(this.groupname, other.getGroupname()))) &&
            ((this.policyname==null && other.getPolicyname()==null) || 
             (this.policyname!=null &&
              java.util.Arrays.equals(this.policyname, other.getPolicyname()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              java.util.Arrays.equals(this.priority, other.getPriority()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            this.encrypted == other.isEncrypted() &&
            ((this.externalauth==null && other.getExternalauth()==null) || 
             (this.externalauth!=null &&
              this.externalauth.equals(other.getExternalauth()))) &&
            ((this.promptstring==null && other.getPromptstring()==null) || 
             (this.promptstring!=null &&
              this.promptstring.equals(other.getPromptstring()))) &&
            ((this.promptinheritedfrom==null && other.getPromptinheritedfrom()==null) || 
             (this.promptinheritedfrom!=null &&
              this.promptinheritedfrom.equals(other.getPromptinheritedfrom()))) &&
            ((this.timeout==null && other.getTimeout()==null) || 
             (this.timeout!=null &&
              this.timeout.equals(other.getTimeout()))) &&
            ((this.timeoutkind==null && other.getTimeoutkind()==null) || 
             (this.timeoutkind!=null &&
              this.timeoutkind.equals(other.getTimeoutkind())));
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
        if (getUsername() != null) {
            _hashCode += getUsername().hashCode();
        }
        if (getGroupname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGroupname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGroupname(), i);
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
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        _hashCode += (isEncrypted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getExternalauth() != null) {
            _hashCode += getExternalauth().hashCode();
        }
        if (getPromptstring() != null) {
            _hashCode += getPromptstring().hashCode();
        }
        if (getPromptinheritedfrom() != null) {
            _hashCode += getPromptinheritedfrom().hashCode();
        }
        if (getTimeout() != null) {
            _hashCode += getTimeout().hashCode();
        }
        if (getTimeoutkind() != null) {
            _hashCode += getTimeoutkind().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Systemuser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "systemuser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupname"));
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
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encrypted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "encrypted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalauth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "externalauth"));
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
        elemField.setFieldName("promptinheritedfrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "promptinheritedfrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeoutkind");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeoutkind"));
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
