/**
 * Aaaglobal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Aaaglobal  implements java.io.Serializable {
    private java.lang.String policy;

    private java.lang.String windowsprofile;

    private org.apache.axis.types.UnsignedInt priority;

    private org.apache.axis.types.UnsignedInt bindpolicytype;

    private java.lang.String builtin;

    private java.lang.String[] preauthenticationpolicyname;

    private org.apache.axis.types.UnsignedInt[] preauthenticationpolicypriority;

    private org.apache.axis.types.UnsignedInt[] preauthenticationbindpolicytype;

    private java.lang.String[] preauthenticationpolicybuiltin;

    private java.lang.String[] windowsprofilename;

    public Aaaglobal() {
    }

    public Aaaglobal(
           java.lang.String policy,
           java.lang.String windowsprofile,
           org.apache.axis.types.UnsignedInt priority,
           org.apache.axis.types.UnsignedInt bindpolicytype,
           java.lang.String builtin,
           java.lang.String[] preauthenticationpolicyname,
           org.apache.axis.types.UnsignedInt[] preauthenticationpolicypriority,
           org.apache.axis.types.UnsignedInt[] preauthenticationbindpolicytype,
           java.lang.String[] preauthenticationpolicybuiltin,
           java.lang.String[] windowsprofilename) {
           this.policy = policy;
           this.windowsprofile = windowsprofile;
           this.priority = priority;
           this.bindpolicytype = bindpolicytype;
           this.builtin = builtin;
           this.preauthenticationpolicyname = preauthenticationpolicyname;
           this.preauthenticationpolicypriority = preauthenticationpolicypriority;
           this.preauthenticationbindpolicytype = preauthenticationbindpolicytype;
           this.preauthenticationpolicybuiltin = preauthenticationpolicybuiltin;
           this.windowsprofilename = windowsprofilename;
    }


    /**
     * Gets the policy value for this Aaaglobal.
     * 
     * @return policy
     */
    public java.lang.String getPolicy() {
        return policy;
    }


    /**
     * Sets the policy value for this Aaaglobal.
     * 
     * @param policy
     */
    public void setPolicy(java.lang.String policy) {
        this.policy = policy;
    }


    /**
     * Gets the windowsprofile value for this Aaaglobal.
     * 
     * @return windowsprofile
     */
    public java.lang.String getWindowsprofile() {
        return windowsprofile;
    }


    /**
     * Sets the windowsprofile value for this Aaaglobal.
     * 
     * @param windowsprofile
     */
    public void setWindowsprofile(java.lang.String windowsprofile) {
        this.windowsprofile = windowsprofile;
    }


    /**
     * Gets the priority value for this Aaaglobal.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Aaaglobal.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the bindpolicytype value for this Aaaglobal.
     * 
     * @return bindpolicytype
     */
    public org.apache.axis.types.UnsignedInt getBindpolicytype() {
        return bindpolicytype;
    }


    /**
     * Sets the bindpolicytype value for this Aaaglobal.
     * 
     * @param bindpolicytype
     */
    public void setBindpolicytype(org.apache.axis.types.UnsignedInt bindpolicytype) {
        this.bindpolicytype = bindpolicytype;
    }


    /**
     * Gets the builtin value for this Aaaglobal.
     * 
     * @return builtin
     */
    public java.lang.String getBuiltin() {
        return builtin;
    }


    /**
     * Sets the builtin value for this Aaaglobal.
     * 
     * @param builtin
     */
    public void setBuiltin(java.lang.String builtin) {
        this.builtin = builtin;
    }


    /**
     * Gets the preauthenticationpolicyname value for this Aaaglobal.
     * 
     * @return preauthenticationpolicyname
     */
    public java.lang.String[] getPreauthenticationpolicyname() {
        return preauthenticationpolicyname;
    }


    /**
     * Sets the preauthenticationpolicyname value for this Aaaglobal.
     * 
     * @param preauthenticationpolicyname
     */
    public void setPreauthenticationpolicyname(java.lang.String[] preauthenticationpolicyname) {
        this.preauthenticationpolicyname = preauthenticationpolicyname;
    }


    /**
     * Gets the preauthenticationpolicypriority value for this Aaaglobal.
     * 
     * @return preauthenticationpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getPreauthenticationpolicypriority() {
        return preauthenticationpolicypriority;
    }


    /**
     * Sets the preauthenticationpolicypriority value for this Aaaglobal.
     * 
     * @param preauthenticationpolicypriority
     */
    public void setPreauthenticationpolicypriority(org.apache.axis.types.UnsignedInt[] preauthenticationpolicypriority) {
        this.preauthenticationpolicypriority = preauthenticationpolicypriority;
    }


    /**
     * Gets the preauthenticationbindpolicytype value for this Aaaglobal.
     * 
     * @return preauthenticationbindpolicytype
     */
    public org.apache.axis.types.UnsignedInt[] getPreauthenticationbindpolicytype() {
        return preauthenticationbindpolicytype;
    }


    /**
     * Sets the preauthenticationbindpolicytype value for this Aaaglobal.
     * 
     * @param preauthenticationbindpolicytype
     */
    public void setPreauthenticationbindpolicytype(org.apache.axis.types.UnsignedInt[] preauthenticationbindpolicytype) {
        this.preauthenticationbindpolicytype = preauthenticationbindpolicytype;
    }


    /**
     * Gets the preauthenticationpolicybuiltin value for this Aaaglobal.
     * 
     * @return preauthenticationpolicybuiltin
     */
    public java.lang.String[] getPreauthenticationpolicybuiltin() {
        return preauthenticationpolicybuiltin;
    }


    /**
     * Sets the preauthenticationpolicybuiltin value for this Aaaglobal.
     * 
     * @param preauthenticationpolicybuiltin
     */
    public void setPreauthenticationpolicybuiltin(java.lang.String[] preauthenticationpolicybuiltin) {
        this.preauthenticationpolicybuiltin = preauthenticationpolicybuiltin;
    }


    /**
     * Gets the windowsprofilename value for this Aaaglobal.
     * 
     * @return windowsprofilename
     */
    public java.lang.String[] getWindowsprofilename() {
        return windowsprofilename;
    }


    /**
     * Sets the windowsprofilename value for this Aaaglobal.
     * 
     * @param windowsprofilename
     */
    public void setWindowsprofilename(java.lang.String[] windowsprofilename) {
        this.windowsprofilename = windowsprofilename;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Aaaglobal)) return false;
        Aaaglobal other = (Aaaglobal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.policy==null && other.getPolicy()==null) || 
             (this.policy!=null &&
              this.policy.equals(other.getPolicy()))) &&
            ((this.windowsprofile==null && other.getWindowsprofile()==null) || 
             (this.windowsprofile!=null &&
              this.windowsprofile.equals(other.getWindowsprofile()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.bindpolicytype==null && other.getBindpolicytype()==null) || 
             (this.bindpolicytype!=null &&
              this.bindpolicytype.equals(other.getBindpolicytype()))) &&
            ((this.builtin==null && other.getBuiltin()==null) || 
             (this.builtin!=null &&
              this.builtin.equals(other.getBuiltin()))) &&
            ((this.preauthenticationpolicyname==null && other.getPreauthenticationpolicyname()==null) || 
             (this.preauthenticationpolicyname!=null &&
              java.util.Arrays.equals(this.preauthenticationpolicyname, other.getPreauthenticationpolicyname()))) &&
            ((this.preauthenticationpolicypriority==null && other.getPreauthenticationpolicypriority()==null) || 
             (this.preauthenticationpolicypriority!=null &&
              java.util.Arrays.equals(this.preauthenticationpolicypriority, other.getPreauthenticationpolicypriority()))) &&
            ((this.preauthenticationbindpolicytype==null && other.getPreauthenticationbindpolicytype()==null) || 
             (this.preauthenticationbindpolicytype!=null &&
              java.util.Arrays.equals(this.preauthenticationbindpolicytype, other.getPreauthenticationbindpolicytype()))) &&
            ((this.preauthenticationpolicybuiltin==null && other.getPreauthenticationpolicybuiltin()==null) || 
             (this.preauthenticationpolicybuiltin!=null &&
              java.util.Arrays.equals(this.preauthenticationpolicybuiltin, other.getPreauthenticationpolicybuiltin()))) &&
            ((this.windowsprofilename==null && other.getWindowsprofilename()==null) || 
             (this.windowsprofilename!=null &&
              java.util.Arrays.equals(this.windowsprofilename, other.getWindowsprofilename())));
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
        if (getPolicy() != null) {
            _hashCode += getPolicy().hashCode();
        }
        if (getWindowsprofile() != null) {
            _hashCode += getWindowsprofile().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getBindpolicytype() != null) {
            _hashCode += getBindpolicytype().hashCode();
        }
        if (getBuiltin() != null) {
            _hashCode += getBuiltin().hashCode();
        }
        if (getPreauthenticationpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreauthenticationpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreauthenticationpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPreauthenticationpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreauthenticationpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreauthenticationpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPreauthenticationbindpolicytype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreauthenticationbindpolicytype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreauthenticationbindpolicytype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPreauthenticationpolicybuiltin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreauthenticationpolicybuiltin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreauthenticationpolicybuiltin(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getWindowsprofilename() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getWindowsprofilename());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getWindowsprofilename(), i);
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
        new org.apache.axis.description.TypeDesc(Aaaglobal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "aaaglobal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("windowsprofile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "windowsprofile"));
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
        elemField.setFieldName("bindpolicytype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bindpolicytype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builtin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "builtin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preauthenticationpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preauthenticationpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preauthenticationpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preauthenticationpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preauthenticationbindpolicytype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preauthenticationbindpolicytype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preauthenticationpolicybuiltin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preauthenticationpolicybuiltin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("windowsprofilename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "windowsprofilename"));
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
