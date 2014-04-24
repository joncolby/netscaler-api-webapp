/**
 * Lbmonbindings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Lbmonbindings  implements java.io.Serializable {
    private java.lang.String monitorname;

    private java.lang.String type;

    private java.lang.String state;

    private java.lang.String[] boundservicegroupsvrstate;

    private java.lang.String[] monsvcstate;

    private java.lang.String[] monstate;

    private java.lang.String[] ipaddress;

    private org.apache.axis.types.UnsignedInt[] port;

    private java.lang.String[] servicename;

    private java.lang.String[] servicegroupname;

    private java.lang.String[] servicetype;

    private java.lang.String[] svrstate;

    private java.lang.String[] boundservicegroupsvctype;

    public Lbmonbindings() {
    }

    public Lbmonbindings(
           java.lang.String monitorname,
           java.lang.String type,
           java.lang.String state,
           java.lang.String[] boundservicegroupsvrstate,
           java.lang.String[] monsvcstate,
           java.lang.String[] monstate,
           java.lang.String[] ipaddress,
           org.apache.axis.types.UnsignedInt[] port,
           java.lang.String[] servicename,
           java.lang.String[] servicegroupname,
           java.lang.String[] servicetype,
           java.lang.String[] svrstate,
           java.lang.String[] boundservicegroupsvctype) {
           this.monitorname = monitorname;
           this.type = type;
           this.state = state;
           this.boundservicegroupsvrstate = boundservicegroupsvrstate;
           this.monsvcstate = monsvcstate;
           this.monstate = monstate;
           this.ipaddress = ipaddress;
           this.port = port;
           this.servicename = servicename;
           this.servicegroupname = servicegroupname;
           this.servicetype = servicetype;
           this.svrstate = svrstate;
           this.boundservicegroupsvctype = boundservicegroupsvctype;
    }


    /**
     * Gets the monitorname value for this Lbmonbindings.
     * 
     * @return monitorname
     */
    public java.lang.String getMonitorname() {
        return monitorname;
    }


    /**
     * Sets the monitorname value for this Lbmonbindings.
     * 
     * @param monitorname
     */
    public void setMonitorname(java.lang.String monitorname) {
        this.monitorname = monitorname;
    }


    /**
     * Gets the type value for this Lbmonbindings.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Lbmonbindings.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the state value for this Lbmonbindings.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Lbmonbindings.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the boundservicegroupsvrstate value for this Lbmonbindings.
     * 
     * @return boundservicegroupsvrstate
     */
    public java.lang.String[] getBoundservicegroupsvrstate() {
        return boundservicegroupsvrstate;
    }


    /**
     * Sets the boundservicegroupsvrstate value for this Lbmonbindings.
     * 
     * @param boundservicegroupsvrstate
     */
    public void setBoundservicegroupsvrstate(java.lang.String[] boundservicegroupsvrstate) {
        this.boundservicegroupsvrstate = boundservicegroupsvrstate;
    }


    /**
     * Gets the monsvcstate value for this Lbmonbindings.
     * 
     * @return monsvcstate
     */
    public java.lang.String[] getMonsvcstate() {
        return monsvcstate;
    }


    /**
     * Sets the monsvcstate value for this Lbmonbindings.
     * 
     * @param monsvcstate
     */
    public void setMonsvcstate(java.lang.String[] monsvcstate) {
        this.monsvcstate = monsvcstate;
    }


    /**
     * Gets the monstate value for this Lbmonbindings.
     * 
     * @return monstate
     */
    public java.lang.String[] getMonstate() {
        return monstate;
    }


    /**
     * Sets the monstate value for this Lbmonbindings.
     * 
     * @param monstate
     */
    public void setMonstate(java.lang.String[] monstate) {
        this.monstate = monstate;
    }


    /**
     * Gets the ipaddress value for this Lbmonbindings.
     * 
     * @return ipaddress
     */
    public java.lang.String[] getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Lbmonbindings.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String[] ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the port value for this Lbmonbindings.
     * 
     * @return port
     */
    public org.apache.axis.types.UnsignedInt[] getPort() {
        return port;
    }


    /**
     * Sets the port value for this Lbmonbindings.
     * 
     * @param port
     */
    public void setPort(org.apache.axis.types.UnsignedInt[] port) {
        this.port = port;
    }


    /**
     * Gets the servicename value for this Lbmonbindings.
     * 
     * @return servicename
     */
    public java.lang.String[] getServicename() {
        return servicename;
    }


    /**
     * Sets the servicename value for this Lbmonbindings.
     * 
     * @param servicename
     */
    public void setServicename(java.lang.String[] servicename) {
        this.servicename = servicename;
    }


    /**
     * Gets the servicegroupname value for this Lbmonbindings.
     * 
     * @return servicegroupname
     */
    public java.lang.String[] getServicegroupname() {
        return servicegroupname;
    }


    /**
     * Sets the servicegroupname value for this Lbmonbindings.
     * 
     * @param servicegroupname
     */
    public void setServicegroupname(java.lang.String[] servicegroupname) {
        this.servicegroupname = servicegroupname;
    }


    /**
     * Gets the servicetype value for this Lbmonbindings.
     * 
     * @return servicetype
     */
    public java.lang.String[] getServicetype() {
        return servicetype;
    }


    /**
     * Sets the servicetype value for this Lbmonbindings.
     * 
     * @param servicetype
     */
    public void setServicetype(java.lang.String[] servicetype) {
        this.servicetype = servicetype;
    }


    /**
     * Gets the svrstate value for this Lbmonbindings.
     * 
     * @return svrstate
     */
    public java.lang.String[] getSvrstate() {
        return svrstate;
    }


    /**
     * Sets the svrstate value for this Lbmonbindings.
     * 
     * @param svrstate
     */
    public void setSvrstate(java.lang.String[] svrstate) {
        this.svrstate = svrstate;
    }


    /**
     * Gets the boundservicegroupsvctype value for this Lbmonbindings.
     * 
     * @return boundservicegroupsvctype
     */
    public java.lang.String[] getBoundservicegroupsvctype() {
        return boundservicegroupsvctype;
    }


    /**
     * Sets the boundservicegroupsvctype value for this Lbmonbindings.
     * 
     * @param boundservicegroupsvctype
     */
    public void setBoundservicegroupsvctype(java.lang.String[] boundservicegroupsvctype) {
        this.boundservicegroupsvctype = boundservicegroupsvctype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Lbmonbindings)) return false;
        Lbmonbindings other = (Lbmonbindings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.monitorname==null && other.getMonitorname()==null) || 
             (this.monitorname!=null &&
              this.monitorname.equals(other.getMonitorname()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.boundservicegroupsvrstate==null && other.getBoundservicegroupsvrstate()==null) || 
             (this.boundservicegroupsvrstate!=null &&
              java.util.Arrays.equals(this.boundservicegroupsvrstate, other.getBoundservicegroupsvrstate()))) &&
            ((this.monsvcstate==null && other.getMonsvcstate()==null) || 
             (this.monsvcstate!=null &&
              java.util.Arrays.equals(this.monsvcstate, other.getMonsvcstate()))) &&
            ((this.monstate==null && other.getMonstate()==null) || 
             (this.monstate!=null &&
              java.util.Arrays.equals(this.monstate, other.getMonstate()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              java.util.Arrays.equals(this.ipaddress, other.getIpaddress()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              java.util.Arrays.equals(this.port, other.getPort()))) &&
            ((this.servicename==null && other.getServicename()==null) || 
             (this.servicename!=null &&
              java.util.Arrays.equals(this.servicename, other.getServicename()))) &&
            ((this.servicegroupname==null && other.getServicegroupname()==null) || 
             (this.servicegroupname!=null &&
              java.util.Arrays.equals(this.servicegroupname, other.getServicegroupname()))) &&
            ((this.servicetype==null && other.getServicetype()==null) || 
             (this.servicetype!=null &&
              java.util.Arrays.equals(this.servicetype, other.getServicetype()))) &&
            ((this.svrstate==null && other.getSvrstate()==null) || 
             (this.svrstate!=null &&
              java.util.Arrays.equals(this.svrstate, other.getSvrstate()))) &&
            ((this.boundservicegroupsvctype==null && other.getBoundservicegroupsvctype()==null) || 
             (this.boundservicegroupsvctype!=null &&
              java.util.Arrays.equals(this.boundservicegroupsvctype, other.getBoundservicegroupsvctype())));
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
        if (getMonitorname() != null) {
            _hashCode += getMonitorname().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getBoundservicegroupsvrstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundservicegroupsvrstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundservicegroupsvrstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMonsvcstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMonsvcstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMonsvcstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMonstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMonstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMonstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIpaddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpaddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpaddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPort() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPort());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPort(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServicename() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicename());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicename(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServicegroupname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicegroupname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicegroupname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServicetype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicetype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicetype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvrstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvrstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvrstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBoundservicegroupsvctype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundservicegroupsvctype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundservicegroupsvctype(), i);
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
        new org.apache.axis.description.TypeDesc(Lbmonbindings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "lbmonbindings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monitorname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monitorname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundservicegroupsvrstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundservicegroupsvrstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monsvcstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monsvcstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipaddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicegroupname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicegroupname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svrstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svrstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundservicegroupsvctype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundservicegroupsvctype"));
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
