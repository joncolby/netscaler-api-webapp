/**
 * Sslglobal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Sslglobal  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String policyname;

    private org.apache.axis.types.UnsignedInt priority;

    private org.apache.axis.types.UnsignedInt numpol;

    private java.lang.String[] sslpolicyname;

    private java.lang.String[] sslpolicybindpoint;

    private org.apache.axis.types.UnsignedInt[] sslpolicypriority;

    private java.lang.String[] sslpolicygotoprioexpression;

    private java.lang.String[] sslpolicyinvokelabeltype;

    private java.lang.String[] sslpolicyinvokelabelname;

    public Sslglobal() {
    }

    public Sslglobal(
           java.lang.String type,
           java.lang.String policyname,
           org.apache.axis.types.UnsignedInt priority,
           org.apache.axis.types.UnsignedInt numpol,
           java.lang.String[] sslpolicyname,
           java.lang.String[] sslpolicybindpoint,
           org.apache.axis.types.UnsignedInt[] sslpolicypriority,
           java.lang.String[] sslpolicygotoprioexpression,
           java.lang.String[] sslpolicyinvokelabeltype,
           java.lang.String[] sslpolicyinvokelabelname) {
           this.type = type;
           this.policyname = policyname;
           this.priority = priority;
           this.numpol = numpol;
           this.sslpolicyname = sslpolicyname;
           this.sslpolicybindpoint = sslpolicybindpoint;
           this.sslpolicypriority = sslpolicypriority;
           this.sslpolicygotoprioexpression = sslpolicygotoprioexpression;
           this.sslpolicyinvokelabeltype = sslpolicyinvokelabeltype;
           this.sslpolicyinvokelabelname = sslpolicyinvokelabelname;
    }


    /**
     * Gets the type value for this Sslglobal.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Sslglobal.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the policyname value for this Sslglobal.
     * 
     * @return policyname
     */
    public java.lang.String getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Sslglobal.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the priority value for this Sslglobal.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Sslglobal.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the numpol value for this Sslglobal.
     * 
     * @return numpol
     */
    public org.apache.axis.types.UnsignedInt getNumpol() {
        return numpol;
    }


    /**
     * Sets the numpol value for this Sslglobal.
     * 
     * @param numpol
     */
    public void setNumpol(org.apache.axis.types.UnsignedInt numpol) {
        this.numpol = numpol;
    }


    /**
     * Gets the sslpolicyname value for this Sslglobal.
     * 
     * @return sslpolicyname
     */
    public java.lang.String[] getSslpolicyname() {
        return sslpolicyname;
    }


    /**
     * Sets the sslpolicyname value for this Sslglobal.
     * 
     * @param sslpolicyname
     */
    public void setSslpolicyname(java.lang.String[] sslpolicyname) {
        this.sslpolicyname = sslpolicyname;
    }


    /**
     * Gets the sslpolicybindpoint value for this Sslglobal.
     * 
     * @return sslpolicybindpoint
     */
    public java.lang.String[] getSslpolicybindpoint() {
        return sslpolicybindpoint;
    }


    /**
     * Sets the sslpolicybindpoint value for this Sslglobal.
     * 
     * @param sslpolicybindpoint
     */
    public void setSslpolicybindpoint(java.lang.String[] sslpolicybindpoint) {
        this.sslpolicybindpoint = sslpolicybindpoint;
    }


    /**
     * Gets the sslpolicypriority value for this Sslglobal.
     * 
     * @return sslpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getSslpolicypriority() {
        return sslpolicypriority;
    }


    /**
     * Sets the sslpolicypriority value for this Sslglobal.
     * 
     * @param sslpolicypriority
     */
    public void setSslpolicypriority(org.apache.axis.types.UnsignedInt[] sslpolicypriority) {
        this.sslpolicypriority = sslpolicypriority;
    }


    /**
     * Gets the sslpolicygotoprioexpression value for this Sslglobal.
     * 
     * @return sslpolicygotoprioexpression
     */
    public java.lang.String[] getSslpolicygotoprioexpression() {
        return sslpolicygotoprioexpression;
    }


    /**
     * Sets the sslpolicygotoprioexpression value for this Sslglobal.
     * 
     * @param sslpolicygotoprioexpression
     */
    public void setSslpolicygotoprioexpression(java.lang.String[] sslpolicygotoprioexpression) {
        this.sslpolicygotoprioexpression = sslpolicygotoprioexpression;
    }


    /**
     * Gets the sslpolicyinvokelabeltype value for this Sslglobal.
     * 
     * @return sslpolicyinvokelabeltype
     */
    public java.lang.String[] getSslpolicyinvokelabeltype() {
        return sslpolicyinvokelabeltype;
    }


    /**
     * Sets the sslpolicyinvokelabeltype value for this Sslglobal.
     * 
     * @param sslpolicyinvokelabeltype
     */
    public void setSslpolicyinvokelabeltype(java.lang.String[] sslpolicyinvokelabeltype) {
        this.sslpolicyinvokelabeltype = sslpolicyinvokelabeltype;
    }


    /**
     * Gets the sslpolicyinvokelabelname value for this Sslglobal.
     * 
     * @return sslpolicyinvokelabelname
     */
    public java.lang.String[] getSslpolicyinvokelabelname() {
        return sslpolicyinvokelabelname;
    }


    /**
     * Sets the sslpolicyinvokelabelname value for this Sslglobal.
     * 
     * @param sslpolicyinvokelabelname
     */
    public void setSslpolicyinvokelabelname(java.lang.String[] sslpolicyinvokelabelname) {
        this.sslpolicyinvokelabelname = sslpolicyinvokelabelname;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sslglobal)) return false;
        Sslglobal other = (Sslglobal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.policyname==null && other.getPolicyname()==null) || 
             (this.policyname!=null &&
              this.policyname.equals(other.getPolicyname()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.numpol==null && other.getNumpol()==null) || 
             (this.numpol!=null &&
              this.numpol.equals(other.getNumpol()))) &&
            ((this.sslpolicyname==null && other.getSslpolicyname()==null) || 
             (this.sslpolicyname!=null &&
              java.util.Arrays.equals(this.sslpolicyname, other.getSslpolicyname()))) &&
            ((this.sslpolicybindpoint==null && other.getSslpolicybindpoint()==null) || 
             (this.sslpolicybindpoint!=null &&
              java.util.Arrays.equals(this.sslpolicybindpoint, other.getSslpolicybindpoint()))) &&
            ((this.sslpolicypriority==null && other.getSslpolicypriority()==null) || 
             (this.sslpolicypriority!=null &&
              java.util.Arrays.equals(this.sslpolicypriority, other.getSslpolicypriority()))) &&
            ((this.sslpolicygotoprioexpression==null && other.getSslpolicygotoprioexpression()==null) || 
             (this.sslpolicygotoprioexpression!=null &&
              java.util.Arrays.equals(this.sslpolicygotoprioexpression, other.getSslpolicygotoprioexpression()))) &&
            ((this.sslpolicyinvokelabeltype==null && other.getSslpolicyinvokelabeltype()==null) || 
             (this.sslpolicyinvokelabeltype!=null &&
              java.util.Arrays.equals(this.sslpolicyinvokelabeltype, other.getSslpolicyinvokelabeltype()))) &&
            ((this.sslpolicyinvokelabelname==null && other.getSslpolicyinvokelabelname()==null) || 
             (this.sslpolicyinvokelabelname!=null &&
              java.util.Arrays.equals(this.sslpolicyinvokelabelname, other.getSslpolicyinvokelabelname())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getPolicyname() != null) {
            _hashCode += getPolicyname().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getNumpol() != null) {
            _hashCode += getNumpol().hashCode();
        }
        if (getSslpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSslpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSslpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSslpolicybindpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSslpolicybindpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSslpolicybindpoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSslpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSslpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSslpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSslpolicygotoprioexpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSslpolicygotoprioexpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSslpolicygotoprioexpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSslpolicyinvokelabeltype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSslpolicyinvokelabeltype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSslpolicyinvokelabeltype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSslpolicyinvokelabelname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSslpolicyinvokelabelname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSslpolicyinvokelabelname(), i);
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
        new org.apache.axis.description.TypeDesc(Sslglobal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "sslglobal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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
        elemField.setFieldName("numpol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numpol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sslpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslpolicybindpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sslpolicybindpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sslpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslpolicygotoprioexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sslpolicygotoprioexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslpolicyinvokelabeltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sslpolicyinvokelabeltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sslpolicyinvokelabelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sslpolicyinvokelabelname"));
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
