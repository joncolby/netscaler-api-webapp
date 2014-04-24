/**
 * Tunnelglobal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Tunnelglobal  implements java.io.Serializable {
    private java.lang.String policyname;

    private org.apache.axis.types.UnsignedInt priority;

    private java.lang.String state;

    private java.lang.String builtin;

    private java.lang.String[] tunnelpolicyname;

    private org.apache.axis.types.UnsignedInt[] tunnelpolicypriority;

    private java.lang.String[] tunnelpolicystate;

    private java.lang.String[] tunnelpolicybuiltin;

    public Tunnelglobal() {
    }

    public Tunnelglobal(
           java.lang.String policyname,
           org.apache.axis.types.UnsignedInt priority,
           java.lang.String state,
           java.lang.String builtin,
           java.lang.String[] tunnelpolicyname,
           org.apache.axis.types.UnsignedInt[] tunnelpolicypriority,
           java.lang.String[] tunnelpolicystate,
           java.lang.String[] tunnelpolicybuiltin) {
           this.policyname = policyname;
           this.priority = priority;
           this.state = state;
           this.builtin = builtin;
           this.tunnelpolicyname = tunnelpolicyname;
           this.tunnelpolicypriority = tunnelpolicypriority;
           this.tunnelpolicystate = tunnelpolicystate;
           this.tunnelpolicybuiltin = tunnelpolicybuiltin;
    }


    /**
     * Gets the policyname value for this Tunnelglobal.
     * 
     * @return policyname
     */
    public java.lang.String getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Tunnelglobal.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the priority value for this Tunnelglobal.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Tunnelglobal.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the state value for this Tunnelglobal.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Tunnelglobal.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the builtin value for this Tunnelglobal.
     * 
     * @return builtin
     */
    public java.lang.String getBuiltin() {
        return builtin;
    }


    /**
     * Sets the builtin value for this Tunnelglobal.
     * 
     * @param builtin
     */
    public void setBuiltin(java.lang.String builtin) {
        this.builtin = builtin;
    }


    /**
     * Gets the tunnelpolicyname value for this Tunnelglobal.
     * 
     * @return tunnelpolicyname
     */
    public java.lang.String[] getTunnelpolicyname() {
        return tunnelpolicyname;
    }


    /**
     * Sets the tunnelpolicyname value for this Tunnelglobal.
     * 
     * @param tunnelpolicyname
     */
    public void setTunnelpolicyname(java.lang.String[] tunnelpolicyname) {
        this.tunnelpolicyname = tunnelpolicyname;
    }


    /**
     * Gets the tunnelpolicypriority value for this Tunnelglobal.
     * 
     * @return tunnelpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getTunnelpolicypriority() {
        return tunnelpolicypriority;
    }


    /**
     * Sets the tunnelpolicypriority value for this Tunnelglobal.
     * 
     * @param tunnelpolicypriority
     */
    public void setTunnelpolicypriority(org.apache.axis.types.UnsignedInt[] tunnelpolicypriority) {
        this.tunnelpolicypriority = tunnelpolicypriority;
    }


    /**
     * Gets the tunnelpolicystate value for this Tunnelglobal.
     * 
     * @return tunnelpolicystate
     */
    public java.lang.String[] getTunnelpolicystate() {
        return tunnelpolicystate;
    }


    /**
     * Sets the tunnelpolicystate value for this Tunnelglobal.
     * 
     * @param tunnelpolicystate
     */
    public void setTunnelpolicystate(java.lang.String[] tunnelpolicystate) {
        this.tunnelpolicystate = tunnelpolicystate;
    }


    /**
     * Gets the tunnelpolicybuiltin value for this Tunnelglobal.
     * 
     * @return tunnelpolicybuiltin
     */
    public java.lang.String[] getTunnelpolicybuiltin() {
        return tunnelpolicybuiltin;
    }


    /**
     * Sets the tunnelpolicybuiltin value for this Tunnelglobal.
     * 
     * @param tunnelpolicybuiltin
     */
    public void setTunnelpolicybuiltin(java.lang.String[] tunnelpolicybuiltin) {
        this.tunnelpolicybuiltin = tunnelpolicybuiltin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tunnelglobal)) return false;
        Tunnelglobal other = (Tunnelglobal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.policyname==null && other.getPolicyname()==null) || 
             (this.policyname!=null &&
              this.policyname.equals(other.getPolicyname()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.builtin==null && other.getBuiltin()==null) || 
             (this.builtin!=null &&
              this.builtin.equals(other.getBuiltin()))) &&
            ((this.tunnelpolicyname==null && other.getTunnelpolicyname()==null) || 
             (this.tunnelpolicyname!=null &&
              java.util.Arrays.equals(this.tunnelpolicyname, other.getTunnelpolicyname()))) &&
            ((this.tunnelpolicypriority==null && other.getTunnelpolicypriority()==null) || 
             (this.tunnelpolicypriority!=null &&
              java.util.Arrays.equals(this.tunnelpolicypriority, other.getTunnelpolicypriority()))) &&
            ((this.tunnelpolicystate==null && other.getTunnelpolicystate()==null) || 
             (this.tunnelpolicystate!=null &&
              java.util.Arrays.equals(this.tunnelpolicystate, other.getTunnelpolicystate()))) &&
            ((this.tunnelpolicybuiltin==null && other.getTunnelpolicybuiltin()==null) || 
             (this.tunnelpolicybuiltin!=null &&
              java.util.Arrays.equals(this.tunnelpolicybuiltin, other.getTunnelpolicybuiltin())));
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
        if (getPolicyname() != null) {
            _hashCode += getPolicyname().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getBuiltin() != null) {
            _hashCode += getBuiltin().hashCode();
        }
        if (getTunnelpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTunnelpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTunnelpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTunnelpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTunnelpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTunnelpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTunnelpolicystate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTunnelpolicystate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTunnelpolicystate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTunnelpolicybuiltin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTunnelpolicybuiltin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTunnelpolicybuiltin(), i);
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
        new org.apache.axis.description.TypeDesc(Tunnelglobal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "tunnelglobal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builtin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "builtin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tunnelpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tunnelpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tunnelpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tunnelpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tunnelpolicystate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tunnelpolicystate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tunnelpolicybuiltin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tunnelpolicybuiltin"));
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
