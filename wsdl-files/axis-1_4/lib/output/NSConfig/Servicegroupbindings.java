/**
 * Servicegroupbindings.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Servicegroupbindings  implements java.io.Serializable {
    private java.lang.String servicegroupname;

    private java.lang.String ipaddress;

    private org.apache.axis.types.UnsignedInt port;

    private java.lang.String state;

    private java.lang.String svrstate;

    private java.lang.String vservername;

    public Servicegroupbindings() {
    }

    public Servicegroupbindings(
           java.lang.String servicegroupname,
           java.lang.String ipaddress,
           org.apache.axis.types.UnsignedInt port,
           java.lang.String state,
           java.lang.String svrstate,
           java.lang.String vservername) {
           this.servicegroupname = servicegroupname;
           this.ipaddress = ipaddress;
           this.port = port;
           this.state = state;
           this.svrstate = svrstate;
           this.vservername = vservername;
    }


    /**
     * Gets the servicegroupname value for this Servicegroupbindings.
     * 
     * @return servicegroupname
     */
    public java.lang.String getServicegroupname() {
        return servicegroupname;
    }


    /**
     * Sets the servicegroupname value for this Servicegroupbindings.
     * 
     * @param servicegroupname
     */
    public void setServicegroupname(java.lang.String servicegroupname) {
        this.servicegroupname = servicegroupname;
    }


    /**
     * Gets the ipaddress value for this Servicegroupbindings.
     * 
     * @return ipaddress
     */
    public java.lang.String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Servicegroupbindings.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the port value for this Servicegroupbindings.
     * 
     * @return port
     */
    public org.apache.axis.types.UnsignedInt getPort() {
        return port;
    }


    /**
     * Sets the port value for this Servicegroupbindings.
     * 
     * @param port
     */
    public void setPort(org.apache.axis.types.UnsignedInt port) {
        this.port = port;
    }


    /**
     * Gets the state value for this Servicegroupbindings.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Servicegroupbindings.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the svrstate value for this Servicegroupbindings.
     * 
     * @return svrstate
     */
    public java.lang.String getSvrstate() {
        return svrstate;
    }


    /**
     * Sets the svrstate value for this Servicegroupbindings.
     * 
     * @param svrstate
     */
    public void setSvrstate(java.lang.String svrstate) {
        this.svrstate = svrstate;
    }


    /**
     * Gets the vservername value for this Servicegroupbindings.
     * 
     * @return vservername
     */
    public java.lang.String getVservername() {
        return vservername;
    }


    /**
     * Sets the vservername value for this Servicegroupbindings.
     * 
     * @param vservername
     */
    public void setVservername(java.lang.String vservername) {
        this.vservername = vservername;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Servicegroupbindings)) return false;
        Servicegroupbindings other = (Servicegroupbindings) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.servicegroupname==null && other.getServicegroupname()==null) || 
             (this.servicegroupname!=null &&
              this.servicegroupname.equals(other.getServicegroupname()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              this.ipaddress.equals(other.getIpaddress()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.svrstate==null && other.getSvrstate()==null) || 
             (this.svrstate!=null &&
              this.svrstate.equals(other.getSvrstate()))) &&
            ((this.vservername==null && other.getVservername()==null) || 
             (this.vservername!=null &&
              this.vservername.equals(other.getVservername())));
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
        if (getServicegroupname() != null) {
            _hashCode += getServicegroupname().hashCode();
        }
        if (getIpaddress() != null) {
            _hashCode += getIpaddress().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getSvrstate() != null) {
            _hashCode += getSvrstate().hashCode();
        }
        if (getVservername() != null) {
            _hashCode += getVservername().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Servicegroupbindings.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "servicegroupbindings"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicegroupname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicegroupname"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
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
        elemField.setFieldName("vservername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vservername"));
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
