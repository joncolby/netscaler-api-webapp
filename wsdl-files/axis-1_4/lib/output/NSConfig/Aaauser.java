/**
 * Aaauser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Aaauser  implements java.io.Serializable {
    private java.lang.String username;

    private boolean loggedin;

    private java.lang.String[] groupname;

    private java.lang.String[] policy;

    private org.apache.axis.types.UnsignedInt[] priority;

    private java.lang.String[] intranetapplication;

    private java.lang.String[] urlname;

    private org.apache.axis.types.UnsignedInt[] acttype;

    private java.lang.String[] intranetip;

    private java.lang.String[] netmask;

    public Aaauser() {
    }

    public Aaauser(
           java.lang.String username,
           boolean loggedin,
           java.lang.String[] groupname,
           java.lang.String[] policy,
           org.apache.axis.types.UnsignedInt[] priority,
           java.lang.String[] intranetapplication,
           java.lang.String[] urlname,
           org.apache.axis.types.UnsignedInt[] acttype,
           java.lang.String[] intranetip,
           java.lang.String[] netmask) {
           this.username = username;
           this.loggedin = loggedin;
           this.groupname = groupname;
           this.policy = policy;
           this.priority = priority;
           this.intranetapplication = intranetapplication;
           this.urlname = urlname;
           this.acttype = acttype;
           this.intranetip = intranetip;
           this.netmask = netmask;
    }


    /**
     * Gets the username value for this Aaauser.
     * 
     * @return username
     */
    public java.lang.String getUsername() {
        return username;
    }


    /**
     * Sets the username value for this Aaauser.
     * 
     * @param username
     */
    public void setUsername(java.lang.String username) {
        this.username = username;
    }


    /**
     * Gets the loggedin value for this Aaauser.
     * 
     * @return loggedin
     */
    public boolean isLoggedin() {
        return loggedin;
    }


    /**
     * Sets the loggedin value for this Aaauser.
     * 
     * @param loggedin
     */
    public void setLoggedin(boolean loggedin) {
        this.loggedin = loggedin;
    }


    /**
     * Gets the groupname value for this Aaauser.
     * 
     * @return groupname
     */
    public java.lang.String[] getGroupname() {
        return groupname;
    }


    /**
     * Sets the groupname value for this Aaauser.
     * 
     * @param groupname
     */
    public void setGroupname(java.lang.String[] groupname) {
        this.groupname = groupname;
    }


    /**
     * Gets the policy value for this Aaauser.
     * 
     * @return policy
     */
    public java.lang.String[] getPolicy() {
        return policy;
    }


    /**
     * Sets the policy value for this Aaauser.
     * 
     * @param policy
     */
    public void setPolicy(java.lang.String[] policy) {
        this.policy = policy;
    }


    /**
     * Gets the priority value for this Aaauser.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt[] getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Aaauser.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt[] priority) {
        this.priority = priority;
    }


    /**
     * Gets the intranetapplication value for this Aaauser.
     * 
     * @return intranetapplication
     */
    public java.lang.String[] getIntranetapplication() {
        return intranetapplication;
    }


    /**
     * Sets the intranetapplication value for this Aaauser.
     * 
     * @param intranetapplication
     */
    public void setIntranetapplication(java.lang.String[] intranetapplication) {
        this.intranetapplication = intranetapplication;
    }


    /**
     * Gets the urlname value for this Aaauser.
     * 
     * @return urlname
     */
    public java.lang.String[] getUrlname() {
        return urlname;
    }


    /**
     * Sets the urlname value for this Aaauser.
     * 
     * @param urlname
     */
    public void setUrlname(java.lang.String[] urlname) {
        this.urlname = urlname;
    }


    /**
     * Gets the acttype value for this Aaauser.
     * 
     * @return acttype
     */
    public org.apache.axis.types.UnsignedInt[] getActtype() {
        return acttype;
    }


    /**
     * Sets the acttype value for this Aaauser.
     * 
     * @param acttype
     */
    public void setActtype(org.apache.axis.types.UnsignedInt[] acttype) {
        this.acttype = acttype;
    }


    /**
     * Gets the intranetip value for this Aaauser.
     * 
     * @return intranetip
     */
    public java.lang.String[] getIntranetip() {
        return intranetip;
    }


    /**
     * Sets the intranetip value for this Aaauser.
     * 
     * @param intranetip
     */
    public void setIntranetip(java.lang.String[] intranetip) {
        this.intranetip = intranetip;
    }


    /**
     * Gets the netmask value for this Aaauser.
     * 
     * @return netmask
     */
    public java.lang.String[] getNetmask() {
        return netmask;
    }


    /**
     * Sets the netmask value for this Aaauser.
     * 
     * @param netmask
     */
    public void setNetmask(java.lang.String[] netmask) {
        this.netmask = netmask;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Aaauser)) return false;
        Aaauser other = (Aaauser) obj;
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
            this.loggedin == other.isLoggedin() &&
            ((this.groupname==null && other.getGroupname()==null) || 
             (this.groupname!=null &&
              java.util.Arrays.equals(this.groupname, other.getGroupname()))) &&
            ((this.policy==null && other.getPolicy()==null) || 
             (this.policy!=null &&
              java.util.Arrays.equals(this.policy, other.getPolicy()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              java.util.Arrays.equals(this.priority, other.getPriority()))) &&
            ((this.intranetapplication==null && other.getIntranetapplication()==null) || 
             (this.intranetapplication!=null &&
              java.util.Arrays.equals(this.intranetapplication, other.getIntranetapplication()))) &&
            ((this.urlname==null && other.getUrlname()==null) || 
             (this.urlname!=null &&
              java.util.Arrays.equals(this.urlname, other.getUrlname()))) &&
            ((this.acttype==null && other.getActtype()==null) || 
             (this.acttype!=null &&
              java.util.Arrays.equals(this.acttype, other.getActtype()))) &&
            ((this.intranetip==null && other.getIntranetip()==null) || 
             (this.intranetip!=null &&
              java.util.Arrays.equals(this.intranetip, other.getIntranetip()))) &&
            ((this.netmask==null && other.getNetmask()==null) || 
             (this.netmask!=null &&
              java.util.Arrays.equals(this.netmask, other.getNetmask())));
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
        _hashCode += (isLoggedin() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        if (getPolicy() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolicy());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolicy(), i);
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
        if (getIntranetapplication() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntranetapplication());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIntranetapplication(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUrlname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUrlname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUrlname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getActtype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActtype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActtype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIntranetip() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIntranetip());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIntranetip(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNetmask() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNetmask());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNetmask(), i);
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
        new org.apache.axis.description.TypeDesc(Aaauser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "aaauser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("username");
        elemField.setXmlName(new javax.xml.namespace.QName("", "username"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loggedin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loggedin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policy"));
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
        elemField.setFieldName("intranetapplication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intranetapplication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("urlname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "urlname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acttype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acttype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intranetip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intranetip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netmask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netmask"));
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
