/**
 * Filterglobal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Filterglobal  implements java.io.Serializable {
    private java.lang.String policyname;

    private org.apache.axis.types.UnsignedInt priority;

    private java.lang.String state;

    private java.lang.String[] filterpolicyname;

    private org.apache.axis.types.UnsignedInt[] filterpolicypriority;

    private java.lang.String[] filterstate;

    public Filterglobal() {
    }

    public Filterglobal(
           java.lang.String policyname,
           org.apache.axis.types.UnsignedInt priority,
           java.lang.String state,
           java.lang.String[] filterpolicyname,
           org.apache.axis.types.UnsignedInt[] filterpolicypriority,
           java.lang.String[] filterstate) {
           this.policyname = policyname;
           this.priority = priority;
           this.state = state;
           this.filterpolicyname = filterpolicyname;
           this.filterpolicypriority = filterpolicypriority;
           this.filterstate = filterstate;
    }


    /**
     * Gets the policyname value for this Filterglobal.
     * 
     * @return policyname
     */
    public java.lang.String getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Filterglobal.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the priority value for this Filterglobal.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Filterglobal.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the state value for this Filterglobal.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Filterglobal.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the filterpolicyname value for this Filterglobal.
     * 
     * @return filterpolicyname
     */
    public java.lang.String[] getFilterpolicyname() {
        return filterpolicyname;
    }


    /**
     * Sets the filterpolicyname value for this Filterglobal.
     * 
     * @param filterpolicyname
     */
    public void setFilterpolicyname(java.lang.String[] filterpolicyname) {
        this.filterpolicyname = filterpolicyname;
    }


    /**
     * Gets the filterpolicypriority value for this Filterglobal.
     * 
     * @return filterpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getFilterpolicypriority() {
        return filterpolicypriority;
    }


    /**
     * Sets the filterpolicypriority value for this Filterglobal.
     * 
     * @param filterpolicypriority
     */
    public void setFilterpolicypriority(org.apache.axis.types.UnsignedInt[] filterpolicypriority) {
        this.filterpolicypriority = filterpolicypriority;
    }


    /**
     * Gets the filterstate value for this Filterglobal.
     * 
     * @return filterstate
     */
    public java.lang.String[] getFilterstate() {
        return filterstate;
    }


    /**
     * Sets the filterstate value for this Filterglobal.
     * 
     * @param filterstate
     */
    public void setFilterstate(java.lang.String[] filterstate) {
        this.filterstate = filterstate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Filterglobal)) return false;
        Filterglobal other = (Filterglobal) obj;
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
            ((this.filterpolicyname==null && other.getFilterpolicyname()==null) || 
             (this.filterpolicyname!=null &&
              java.util.Arrays.equals(this.filterpolicyname, other.getFilterpolicyname()))) &&
            ((this.filterpolicypriority==null && other.getFilterpolicypriority()==null) || 
             (this.filterpolicypriority!=null &&
              java.util.Arrays.equals(this.filterpolicypriority, other.getFilterpolicypriority()))) &&
            ((this.filterstate==null && other.getFilterstate()==null) || 
             (this.filterstate!=null &&
              java.util.Arrays.equals(this.filterstate, other.getFilterstate())));
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
        if (getFilterpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFilterpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFilterpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFilterpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFilterpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFilterpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFilterstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFilterstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFilterstate(), i);
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
        new org.apache.axis.description.TypeDesc(Filterglobal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "filterglobal"));
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
        elemField.setFieldName("filterpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filterpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filterpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filterstate"));
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
