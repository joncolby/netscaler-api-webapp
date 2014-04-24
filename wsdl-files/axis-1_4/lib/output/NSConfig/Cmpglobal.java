/**
 * Cmpglobal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Cmpglobal  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String policyname;

    private org.apache.axis.types.UnsignedInt priority;

    private java.lang.String state;

    private org.apache.axis.types.UnsignedInt numpol;

    private java.lang.String[] policytype;

    private java.lang.String[] cmppolicyname;

    private org.apache.axis.types.UnsignedInt[] cmppolicypriority;

    private java.lang.String[] cmppolicystate;

    private java.lang.String[] cmppolicygotoprioexpr;

    private boolean[] cmpinvoke;

    private java.lang.String[] cmppolicyinvokelabeltype;

    private java.lang.String[] cmppolicyinvokelabelname;

    private java.lang.String[] cmppolicybindpoint;

    private org.apache.axis.types.UnsignedInt[] cmppolicynumpol;

    public Cmpglobal() {
    }

    public Cmpglobal(
           java.lang.String type,
           java.lang.String policyname,
           org.apache.axis.types.UnsignedInt priority,
           java.lang.String state,
           org.apache.axis.types.UnsignedInt numpol,
           java.lang.String[] policytype,
           java.lang.String[] cmppolicyname,
           org.apache.axis.types.UnsignedInt[] cmppolicypriority,
           java.lang.String[] cmppolicystate,
           java.lang.String[] cmppolicygotoprioexpr,
           boolean[] cmpinvoke,
           java.lang.String[] cmppolicyinvokelabeltype,
           java.lang.String[] cmppolicyinvokelabelname,
           java.lang.String[] cmppolicybindpoint,
           org.apache.axis.types.UnsignedInt[] cmppolicynumpol) {
           this.type = type;
           this.policyname = policyname;
           this.priority = priority;
           this.state = state;
           this.numpol = numpol;
           this.policytype = policytype;
           this.cmppolicyname = cmppolicyname;
           this.cmppolicypriority = cmppolicypriority;
           this.cmppolicystate = cmppolicystate;
           this.cmppolicygotoprioexpr = cmppolicygotoprioexpr;
           this.cmpinvoke = cmpinvoke;
           this.cmppolicyinvokelabeltype = cmppolicyinvokelabeltype;
           this.cmppolicyinvokelabelname = cmppolicyinvokelabelname;
           this.cmppolicybindpoint = cmppolicybindpoint;
           this.cmppolicynumpol = cmppolicynumpol;
    }


    /**
     * Gets the type value for this Cmpglobal.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Cmpglobal.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the policyname value for this Cmpglobal.
     * 
     * @return policyname
     */
    public java.lang.String getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Cmpglobal.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the priority value for this Cmpglobal.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Cmpglobal.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the state value for this Cmpglobal.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Cmpglobal.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the numpol value for this Cmpglobal.
     * 
     * @return numpol
     */
    public org.apache.axis.types.UnsignedInt getNumpol() {
        return numpol;
    }


    /**
     * Sets the numpol value for this Cmpglobal.
     * 
     * @param numpol
     */
    public void setNumpol(org.apache.axis.types.UnsignedInt numpol) {
        this.numpol = numpol;
    }


    /**
     * Gets the policytype value for this Cmpglobal.
     * 
     * @return policytype
     */
    public java.lang.String[] getPolicytype() {
        return policytype;
    }


    /**
     * Sets the policytype value for this Cmpglobal.
     * 
     * @param policytype
     */
    public void setPolicytype(java.lang.String[] policytype) {
        this.policytype = policytype;
    }


    /**
     * Gets the cmppolicyname value for this Cmpglobal.
     * 
     * @return cmppolicyname
     */
    public java.lang.String[] getCmppolicyname() {
        return cmppolicyname;
    }


    /**
     * Sets the cmppolicyname value for this Cmpglobal.
     * 
     * @param cmppolicyname
     */
    public void setCmppolicyname(java.lang.String[] cmppolicyname) {
        this.cmppolicyname = cmppolicyname;
    }


    /**
     * Gets the cmppolicypriority value for this Cmpglobal.
     * 
     * @return cmppolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getCmppolicypriority() {
        return cmppolicypriority;
    }


    /**
     * Sets the cmppolicypriority value for this Cmpglobal.
     * 
     * @param cmppolicypriority
     */
    public void setCmppolicypriority(org.apache.axis.types.UnsignedInt[] cmppolicypriority) {
        this.cmppolicypriority = cmppolicypriority;
    }


    /**
     * Gets the cmppolicystate value for this Cmpglobal.
     * 
     * @return cmppolicystate
     */
    public java.lang.String[] getCmppolicystate() {
        return cmppolicystate;
    }


    /**
     * Sets the cmppolicystate value for this Cmpglobal.
     * 
     * @param cmppolicystate
     */
    public void setCmppolicystate(java.lang.String[] cmppolicystate) {
        this.cmppolicystate = cmppolicystate;
    }


    /**
     * Gets the cmppolicygotoprioexpr value for this Cmpglobal.
     * 
     * @return cmppolicygotoprioexpr
     */
    public java.lang.String[] getCmppolicygotoprioexpr() {
        return cmppolicygotoprioexpr;
    }


    /**
     * Sets the cmppolicygotoprioexpr value for this Cmpglobal.
     * 
     * @param cmppolicygotoprioexpr
     */
    public void setCmppolicygotoprioexpr(java.lang.String[] cmppolicygotoprioexpr) {
        this.cmppolicygotoprioexpr = cmppolicygotoprioexpr;
    }


    /**
     * Gets the cmpinvoke value for this Cmpglobal.
     * 
     * @return cmpinvoke
     */
    public boolean[] getCmpinvoke() {
        return cmpinvoke;
    }


    /**
     * Sets the cmpinvoke value for this Cmpglobal.
     * 
     * @param cmpinvoke
     */
    public void setCmpinvoke(boolean[] cmpinvoke) {
        this.cmpinvoke = cmpinvoke;
    }


    /**
     * Gets the cmppolicyinvokelabeltype value for this Cmpglobal.
     * 
     * @return cmppolicyinvokelabeltype
     */
    public java.lang.String[] getCmppolicyinvokelabeltype() {
        return cmppolicyinvokelabeltype;
    }


    /**
     * Sets the cmppolicyinvokelabeltype value for this Cmpglobal.
     * 
     * @param cmppolicyinvokelabeltype
     */
    public void setCmppolicyinvokelabeltype(java.lang.String[] cmppolicyinvokelabeltype) {
        this.cmppolicyinvokelabeltype = cmppolicyinvokelabeltype;
    }


    /**
     * Gets the cmppolicyinvokelabelname value for this Cmpglobal.
     * 
     * @return cmppolicyinvokelabelname
     */
    public java.lang.String[] getCmppolicyinvokelabelname() {
        return cmppolicyinvokelabelname;
    }


    /**
     * Sets the cmppolicyinvokelabelname value for this Cmpglobal.
     * 
     * @param cmppolicyinvokelabelname
     */
    public void setCmppolicyinvokelabelname(java.lang.String[] cmppolicyinvokelabelname) {
        this.cmppolicyinvokelabelname = cmppolicyinvokelabelname;
    }


    /**
     * Gets the cmppolicybindpoint value for this Cmpglobal.
     * 
     * @return cmppolicybindpoint
     */
    public java.lang.String[] getCmppolicybindpoint() {
        return cmppolicybindpoint;
    }


    /**
     * Sets the cmppolicybindpoint value for this Cmpglobal.
     * 
     * @param cmppolicybindpoint
     */
    public void setCmppolicybindpoint(java.lang.String[] cmppolicybindpoint) {
        this.cmppolicybindpoint = cmppolicybindpoint;
    }


    /**
     * Gets the cmppolicynumpol value for this Cmpglobal.
     * 
     * @return cmppolicynumpol
     */
    public org.apache.axis.types.UnsignedInt[] getCmppolicynumpol() {
        return cmppolicynumpol;
    }


    /**
     * Sets the cmppolicynumpol value for this Cmpglobal.
     * 
     * @param cmppolicynumpol
     */
    public void setCmppolicynumpol(org.apache.axis.types.UnsignedInt[] cmppolicynumpol) {
        this.cmppolicynumpol = cmppolicynumpol;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cmpglobal)) return false;
        Cmpglobal other = (Cmpglobal) obj;
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
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.numpol==null && other.getNumpol()==null) || 
             (this.numpol!=null &&
              this.numpol.equals(other.getNumpol()))) &&
            ((this.policytype==null && other.getPolicytype()==null) || 
             (this.policytype!=null &&
              java.util.Arrays.equals(this.policytype, other.getPolicytype()))) &&
            ((this.cmppolicyname==null && other.getCmppolicyname()==null) || 
             (this.cmppolicyname!=null &&
              java.util.Arrays.equals(this.cmppolicyname, other.getCmppolicyname()))) &&
            ((this.cmppolicypriority==null && other.getCmppolicypriority()==null) || 
             (this.cmppolicypriority!=null &&
              java.util.Arrays.equals(this.cmppolicypriority, other.getCmppolicypriority()))) &&
            ((this.cmppolicystate==null && other.getCmppolicystate()==null) || 
             (this.cmppolicystate!=null &&
              java.util.Arrays.equals(this.cmppolicystate, other.getCmppolicystate()))) &&
            ((this.cmppolicygotoprioexpr==null && other.getCmppolicygotoprioexpr()==null) || 
             (this.cmppolicygotoprioexpr!=null &&
              java.util.Arrays.equals(this.cmppolicygotoprioexpr, other.getCmppolicygotoprioexpr()))) &&
            ((this.cmpinvoke==null && other.getCmpinvoke()==null) || 
             (this.cmpinvoke!=null &&
              java.util.Arrays.equals(this.cmpinvoke, other.getCmpinvoke()))) &&
            ((this.cmppolicyinvokelabeltype==null && other.getCmppolicyinvokelabeltype()==null) || 
             (this.cmppolicyinvokelabeltype!=null &&
              java.util.Arrays.equals(this.cmppolicyinvokelabeltype, other.getCmppolicyinvokelabeltype()))) &&
            ((this.cmppolicyinvokelabelname==null && other.getCmppolicyinvokelabelname()==null) || 
             (this.cmppolicyinvokelabelname!=null &&
              java.util.Arrays.equals(this.cmppolicyinvokelabelname, other.getCmppolicyinvokelabelname()))) &&
            ((this.cmppolicybindpoint==null && other.getCmppolicybindpoint()==null) || 
             (this.cmppolicybindpoint!=null &&
              java.util.Arrays.equals(this.cmppolicybindpoint, other.getCmppolicybindpoint()))) &&
            ((this.cmppolicynumpol==null && other.getCmppolicynumpol()==null) || 
             (this.cmppolicynumpol!=null &&
              java.util.Arrays.equals(this.cmppolicynumpol, other.getCmppolicynumpol())));
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
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getNumpol() != null) {
            _hashCode += getNumpol().hashCode();
        }
        if (getPolicytype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolicytype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolicytype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCmppolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmppolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmppolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCmppolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmppolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmppolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCmppolicystate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmppolicystate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmppolicystate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCmppolicygotoprioexpr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmppolicygotoprioexpr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmppolicygotoprioexpr(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCmpinvoke() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmpinvoke());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmpinvoke(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCmppolicyinvokelabeltype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmppolicyinvokelabeltype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmppolicyinvokelabeltype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCmppolicyinvokelabelname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmppolicyinvokelabelname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmppolicyinvokelabelname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCmppolicybindpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmppolicybindpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmppolicybindpoint(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCmppolicynumpol() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCmppolicynumpol());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCmppolicynumpol(), i);
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
        new org.apache.axis.description.TypeDesc(Cmpglobal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "cmpglobal"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numpol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numpol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policytype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policytype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmppolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmppolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmppolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmppolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmppolicystate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmppolicystate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmppolicygotoprioexpr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmppolicygotoprioexpr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmpinvoke");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmpinvoke"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmppolicyinvokelabeltype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmppolicyinvokelabeltype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmppolicyinvokelabelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmppolicyinvokelabelname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmppolicybindpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmppolicybindpoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmppolicynumpol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmppolicynumpol"));
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
