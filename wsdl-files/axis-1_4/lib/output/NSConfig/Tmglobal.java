/**
 * Tmglobal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Tmglobal  implements java.io.Serializable {
    private java.lang.String policyname;

    private org.apache.axis.types.UnsignedInt priority;

    private java.lang.String type;

    private java.lang.String builtin;

    private org.apache.axis.types.UnsignedInt bindpolicytype;

    private java.lang.String[] auditpolicyname;

    private org.apache.axis.types.UnsignedInt[] auditpolicypriority;

    private org.apache.axis.types.UnsignedInt[] auditbindpolicytype;

    private java.lang.String[] sessionpolicyname;

    private org.apache.axis.types.UnsignedInt[] sessionpolicypriority;

    private org.apache.axis.types.UnsignedInt[] sessionbindpolicytype;

    private java.lang.String[] sessionpolicybuiltin;

    private java.lang.String[] trafficpolicyname;

    private org.apache.axis.types.UnsignedInt[] trafficpolicypriority;

    private org.apache.axis.types.UnsignedInt[] trafficbindpolicytype;

    private java.lang.String[] trafficpolicybindpoint;

    public Tmglobal() {
    }

    public Tmglobal(
           java.lang.String policyname,
           org.apache.axis.types.UnsignedInt priority,
           java.lang.String type,
           java.lang.String builtin,
           org.apache.axis.types.UnsignedInt bindpolicytype,
           java.lang.String[] auditpolicyname,
           org.apache.axis.types.UnsignedInt[] auditpolicypriority,
           org.apache.axis.types.UnsignedInt[] auditbindpolicytype,
           java.lang.String[] sessionpolicyname,
           org.apache.axis.types.UnsignedInt[] sessionpolicypriority,
           org.apache.axis.types.UnsignedInt[] sessionbindpolicytype,
           java.lang.String[] sessionpolicybuiltin,
           java.lang.String[] trafficpolicyname,
           org.apache.axis.types.UnsignedInt[] trafficpolicypriority,
           org.apache.axis.types.UnsignedInt[] trafficbindpolicytype,
           java.lang.String[] trafficpolicybindpoint) {
           this.policyname = policyname;
           this.priority = priority;
           this.type = type;
           this.builtin = builtin;
           this.bindpolicytype = bindpolicytype;
           this.auditpolicyname = auditpolicyname;
           this.auditpolicypriority = auditpolicypriority;
           this.auditbindpolicytype = auditbindpolicytype;
           this.sessionpolicyname = sessionpolicyname;
           this.sessionpolicypriority = sessionpolicypriority;
           this.sessionbindpolicytype = sessionbindpolicytype;
           this.sessionpolicybuiltin = sessionpolicybuiltin;
           this.trafficpolicyname = trafficpolicyname;
           this.trafficpolicypriority = trafficpolicypriority;
           this.trafficbindpolicytype = trafficbindpolicytype;
           this.trafficpolicybindpoint = trafficpolicybindpoint;
    }


    /**
     * Gets the policyname value for this Tmglobal.
     * 
     * @return policyname
     */
    public java.lang.String getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Tmglobal.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the priority value for this Tmglobal.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Tmglobal.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the type value for this Tmglobal.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Tmglobal.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the builtin value for this Tmglobal.
     * 
     * @return builtin
     */
    public java.lang.String getBuiltin() {
        return builtin;
    }


    /**
     * Sets the builtin value for this Tmglobal.
     * 
     * @param builtin
     */
    public void setBuiltin(java.lang.String builtin) {
        this.builtin = builtin;
    }


    /**
     * Gets the bindpolicytype value for this Tmglobal.
     * 
     * @return bindpolicytype
     */
    public org.apache.axis.types.UnsignedInt getBindpolicytype() {
        return bindpolicytype;
    }


    /**
     * Sets the bindpolicytype value for this Tmglobal.
     * 
     * @param bindpolicytype
     */
    public void setBindpolicytype(org.apache.axis.types.UnsignedInt bindpolicytype) {
        this.bindpolicytype = bindpolicytype;
    }


    /**
     * Gets the auditpolicyname value for this Tmglobal.
     * 
     * @return auditpolicyname
     */
    public java.lang.String[] getAuditpolicyname() {
        return auditpolicyname;
    }


    /**
     * Sets the auditpolicyname value for this Tmglobal.
     * 
     * @param auditpolicyname
     */
    public void setAuditpolicyname(java.lang.String[] auditpolicyname) {
        this.auditpolicyname = auditpolicyname;
    }


    /**
     * Gets the auditpolicypriority value for this Tmglobal.
     * 
     * @return auditpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getAuditpolicypriority() {
        return auditpolicypriority;
    }


    /**
     * Sets the auditpolicypriority value for this Tmglobal.
     * 
     * @param auditpolicypriority
     */
    public void setAuditpolicypriority(org.apache.axis.types.UnsignedInt[] auditpolicypriority) {
        this.auditpolicypriority = auditpolicypriority;
    }


    /**
     * Gets the auditbindpolicytype value for this Tmglobal.
     * 
     * @return auditbindpolicytype
     */
    public org.apache.axis.types.UnsignedInt[] getAuditbindpolicytype() {
        return auditbindpolicytype;
    }


    /**
     * Sets the auditbindpolicytype value for this Tmglobal.
     * 
     * @param auditbindpolicytype
     */
    public void setAuditbindpolicytype(org.apache.axis.types.UnsignedInt[] auditbindpolicytype) {
        this.auditbindpolicytype = auditbindpolicytype;
    }


    /**
     * Gets the sessionpolicyname value for this Tmglobal.
     * 
     * @return sessionpolicyname
     */
    public java.lang.String[] getSessionpolicyname() {
        return sessionpolicyname;
    }


    /**
     * Sets the sessionpolicyname value for this Tmglobal.
     * 
     * @param sessionpolicyname
     */
    public void setSessionpolicyname(java.lang.String[] sessionpolicyname) {
        this.sessionpolicyname = sessionpolicyname;
    }


    /**
     * Gets the sessionpolicypriority value for this Tmglobal.
     * 
     * @return sessionpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getSessionpolicypriority() {
        return sessionpolicypriority;
    }


    /**
     * Sets the sessionpolicypriority value for this Tmglobal.
     * 
     * @param sessionpolicypriority
     */
    public void setSessionpolicypriority(org.apache.axis.types.UnsignedInt[] sessionpolicypriority) {
        this.sessionpolicypriority = sessionpolicypriority;
    }


    /**
     * Gets the sessionbindpolicytype value for this Tmglobal.
     * 
     * @return sessionbindpolicytype
     */
    public org.apache.axis.types.UnsignedInt[] getSessionbindpolicytype() {
        return sessionbindpolicytype;
    }


    /**
     * Sets the sessionbindpolicytype value for this Tmglobal.
     * 
     * @param sessionbindpolicytype
     */
    public void setSessionbindpolicytype(org.apache.axis.types.UnsignedInt[] sessionbindpolicytype) {
        this.sessionbindpolicytype = sessionbindpolicytype;
    }


    /**
     * Gets the sessionpolicybuiltin value for this Tmglobal.
     * 
     * @return sessionpolicybuiltin
     */
    public java.lang.String[] getSessionpolicybuiltin() {
        return sessionpolicybuiltin;
    }


    /**
     * Sets the sessionpolicybuiltin value for this Tmglobal.
     * 
     * @param sessionpolicybuiltin
     */
    public void setSessionpolicybuiltin(java.lang.String[] sessionpolicybuiltin) {
        this.sessionpolicybuiltin = sessionpolicybuiltin;
    }


    /**
     * Gets the trafficpolicyname value for this Tmglobal.
     * 
     * @return trafficpolicyname
     */
    public java.lang.String[] getTrafficpolicyname() {
        return trafficpolicyname;
    }


    /**
     * Sets the trafficpolicyname value for this Tmglobal.
     * 
     * @param trafficpolicyname
     */
    public void setTrafficpolicyname(java.lang.String[] trafficpolicyname) {
        this.trafficpolicyname = trafficpolicyname;
    }


    /**
     * Gets the trafficpolicypriority value for this Tmglobal.
     * 
     * @return trafficpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getTrafficpolicypriority() {
        return trafficpolicypriority;
    }


    /**
     * Sets the trafficpolicypriority value for this Tmglobal.
     * 
     * @param trafficpolicypriority
     */
    public void setTrafficpolicypriority(org.apache.axis.types.UnsignedInt[] trafficpolicypriority) {
        this.trafficpolicypriority = trafficpolicypriority;
    }


    /**
     * Gets the trafficbindpolicytype value for this Tmglobal.
     * 
     * @return trafficbindpolicytype
     */
    public org.apache.axis.types.UnsignedInt[] getTrafficbindpolicytype() {
        return trafficbindpolicytype;
    }


    /**
     * Sets the trafficbindpolicytype value for this Tmglobal.
     * 
     * @param trafficbindpolicytype
     */
    public void setTrafficbindpolicytype(org.apache.axis.types.UnsignedInt[] trafficbindpolicytype) {
        this.trafficbindpolicytype = trafficbindpolicytype;
    }


    /**
     * Gets the trafficpolicybindpoint value for this Tmglobal.
     * 
     * @return trafficpolicybindpoint
     */
    public java.lang.String[] getTrafficpolicybindpoint() {
        return trafficpolicybindpoint;
    }


    /**
     * Sets the trafficpolicybindpoint value for this Tmglobal.
     * 
     * @param trafficpolicybindpoint
     */
    public void setTrafficpolicybindpoint(java.lang.String[] trafficpolicybindpoint) {
        this.trafficpolicybindpoint = trafficpolicybindpoint;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tmglobal)) return false;
        Tmglobal other = (Tmglobal) obj;
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
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.builtin==null && other.getBuiltin()==null) || 
             (this.builtin!=null &&
              this.builtin.equals(other.getBuiltin()))) &&
            ((this.bindpolicytype==null && other.getBindpolicytype()==null) || 
             (this.bindpolicytype!=null &&
              this.bindpolicytype.equals(other.getBindpolicytype()))) &&
            ((this.auditpolicyname==null && other.getAuditpolicyname()==null) || 
             (this.auditpolicyname!=null &&
              java.util.Arrays.equals(this.auditpolicyname, other.getAuditpolicyname()))) &&
            ((this.auditpolicypriority==null && other.getAuditpolicypriority()==null) || 
             (this.auditpolicypriority!=null &&
              java.util.Arrays.equals(this.auditpolicypriority, other.getAuditpolicypriority()))) &&
            ((this.auditbindpolicytype==null && other.getAuditbindpolicytype()==null) || 
             (this.auditbindpolicytype!=null &&
              java.util.Arrays.equals(this.auditbindpolicytype, other.getAuditbindpolicytype()))) &&
            ((this.sessionpolicyname==null && other.getSessionpolicyname()==null) || 
             (this.sessionpolicyname!=null &&
              java.util.Arrays.equals(this.sessionpolicyname, other.getSessionpolicyname()))) &&
            ((this.sessionpolicypriority==null && other.getSessionpolicypriority()==null) || 
             (this.sessionpolicypriority!=null &&
              java.util.Arrays.equals(this.sessionpolicypriority, other.getSessionpolicypriority()))) &&
            ((this.sessionbindpolicytype==null && other.getSessionbindpolicytype()==null) || 
             (this.sessionbindpolicytype!=null &&
              java.util.Arrays.equals(this.sessionbindpolicytype, other.getSessionbindpolicytype()))) &&
            ((this.sessionpolicybuiltin==null && other.getSessionpolicybuiltin()==null) || 
             (this.sessionpolicybuiltin!=null &&
              java.util.Arrays.equals(this.sessionpolicybuiltin, other.getSessionpolicybuiltin()))) &&
            ((this.trafficpolicyname==null && other.getTrafficpolicyname()==null) || 
             (this.trafficpolicyname!=null &&
              java.util.Arrays.equals(this.trafficpolicyname, other.getTrafficpolicyname()))) &&
            ((this.trafficpolicypriority==null && other.getTrafficpolicypriority()==null) || 
             (this.trafficpolicypriority!=null &&
              java.util.Arrays.equals(this.trafficpolicypriority, other.getTrafficpolicypriority()))) &&
            ((this.trafficbindpolicytype==null && other.getTrafficbindpolicytype()==null) || 
             (this.trafficbindpolicytype!=null &&
              java.util.Arrays.equals(this.trafficbindpolicytype, other.getTrafficbindpolicytype()))) &&
            ((this.trafficpolicybindpoint==null && other.getTrafficpolicybindpoint()==null) || 
             (this.trafficpolicybindpoint!=null &&
              java.util.Arrays.equals(this.trafficpolicybindpoint, other.getTrafficpolicybindpoint())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getBuiltin() != null) {
            _hashCode += getBuiltin().hashCode();
        }
        if (getBindpolicytype() != null) {
            _hashCode += getBindpolicytype().hashCode();
        }
        if (getAuditpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuditpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuditpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuditpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuditpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuditpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAuditbindpolicytype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAuditbindpolicytype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAuditbindpolicytype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSessionpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSessionpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSessionpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSessionpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSessionpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSessionpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSessionbindpolicytype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSessionbindpolicytype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSessionbindpolicytype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSessionpolicybuiltin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSessionpolicybuiltin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSessionpolicybuiltin(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrafficpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrafficpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrafficpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrafficpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrafficpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrafficpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrafficbindpolicytype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrafficbindpolicytype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrafficbindpolicytype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTrafficpolicybindpoint() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTrafficpolicybindpoint());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTrafficpolicybindpoint(), i);
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
        new org.apache.axis.description.TypeDesc(Tmglobal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "tmglobal"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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
        elemField.setFieldName("bindpolicytype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bindpolicytype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auditbindpolicytype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auditbindpolicytype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionbindpolicytype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionbindpolicytype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionpolicybuiltin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionpolicybuiltin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trafficpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trafficpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trafficpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trafficpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trafficbindpolicytype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trafficbindpolicytype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trafficpolicybindpoint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trafficpolicybindpoint"));
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
