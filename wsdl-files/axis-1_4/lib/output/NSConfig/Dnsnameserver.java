/**
 * Dnsnameserver.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Dnsnameserver  implements java.io.Serializable {
    private java.lang.String ip;

    private java.lang.String dnsvservername;

    private java.lang.String servicename;

    private org.apache.axis.types.UnsignedInt port;

    private java.lang.String type;

    private java.lang.String state;

    private java.lang.String nameserverstate;

    private boolean local;

    private org.apache.axis.types.UnsignedInt clmonowner;

    private org.apache.axis.types.UnsignedInt clmonview;

    public Dnsnameserver() {
    }

    public Dnsnameserver(
           java.lang.String ip,
           java.lang.String dnsvservername,
           java.lang.String servicename,
           org.apache.axis.types.UnsignedInt port,
           java.lang.String type,
           java.lang.String state,
           java.lang.String nameserverstate,
           boolean local,
           org.apache.axis.types.UnsignedInt clmonowner,
           org.apache.axis.types.UnsignedInt clmonview) {
           this.ip = ip;
           this.dnsvservername = dnsvservername;
           this.servicename = servicename;
           this.port = port;
           this.type = type;
           this.state = state;
           this.nameserverstate = nameserverstate;
           this.local = local;
           this.clmonowner = clmonowner;
           this.clmonview = clmonview;
    }


    /**
     * Gets the ip value for this Dnsnameserver.
     * 
     * @return ip
     */
    public java.lang.String getIp() {
        return ip;
    }


    /**
     * Sets the ip value for this Dnsnameserver.
     * 
     * @param ip
     */
    public void setIp(java.lang.String ip) {
        this.ip = ip;
    }


    /**
     * Gets the dnsvservername value for this Dnsnameserver.
     * 
     * @return dnsvservername
     */
    public java.lang.String getDnsvservername() {
        return dnsvservername;
    }


    /**
     * Sets the dnsvservername value for this Dnsnameserver.
     * 
     * @param dnsvservername
     */
    public void setDnsvservername(java.lang.String dnsvservername) {
        this.dnsvservername = dnsvservername;
    }


    /**
     * Gets the servicename value for this Dnsnameserver.
     * 
     * @return servicename
     */
    public java.lang.String getServicename() {
        return servicename;
    }


    /**
     * Sets the servicename value for this Dnsnameserver.
     * 
     * @param servicename
     */
    public void setServicename(java.lang.String servicename) {
        this.servicename = servicename;
    }


    /**
     * Gets the port value for this Dnsnameserver.
     * 
     * @return port
     */
    public org.apache.axis.types.UnsignedInt getPort() {
        return port;
    }


    /**
     * Sets the port value for this Dnsnameserver.
     * 
     * @param port
     */
    public void setPort(org.apache.axis.types.UnsignedInt port) {
        this.port = port;
    }


    /**
     * Gets the type value for this Dnsnameserver.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Dnsnameserver.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the state value for this Dnsnameserver.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Dnsnameserver.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the nameserverstate value for this Dnsnameserver.
     * 
     * @return nameserverstate
     */
    public java.lang.String getNameserverstate() {
        return nameserverstate;
    }


    /**
     * Sets the nameserverstate value for this Dnsnameserver.
     * 
     * @param nameserverstate
     */
    public void setNameserverstate(java.lang.String nameserverstate) {
        this.nameserverstate = nameserverstate;
    }


    /**
     * Gets the local value for this Dnsnameserver.
     * 
     * @return local
     */
    public boolean isLocal() {
        return local;
    }


    /**
     * Sets the local value for this Dnsnameserver.
     * 
     * @param local
     */
    public void setLocal(boolean local) {
        this.local = local;
    }


    /**
     * Gets the clmonowner value for this Dnsnameserver.
     * 
     * @return clmonowner
     */
    public org.apache.axis.types.UnsignedInt getClmonowner() {
        return clmonowner;
    }


    /**
     * Sets the clmonowner value for this Dnsnameserver.
     * 
     * @param clmonowner
     */
    public void setClmonowner(org.apache.axis.types.UnsignedInt clmonowner) {
        this.clmonowner = clmonowner;
    }


    /**
     * Gets the clmonview value for this Dnsnameserver.
     * 
     * @return clmonview
     */
    public org.apache.axis.types.UnsignedInt getClmonview() {
        return clmonview;
    }


    /**
     * Sets the clmonview value for this Dnsnameserver.
     * 
     * @param clmonview
     */
    public void setClmonview(org.apache.axis.types.UnsignedInt clmonview) {
        this.clmonview = clmonview;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Dnsnameserver)) return false;
        Dnsnameserver other = (Dnsnameserver) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ip==null && other.getIp()==null) || 
             (this.ip!=null &&
              this.ip.equals(other.getIp()))) &&
            ((this.dnsvservername==null && other.getDnsvservername()==null) || 
             (this.dnsvservername!=null &&
              this.dnsvservername.equals(other.getDnsvservername()))) &&
            ((this.servicename==null && other.getServicename()==null) || 
             (this.servicename!=null &&
              this.servicename.equals(other.getServicename()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.nameserverstate==null && other.getNameserverstate()==null) || 
             (this.nameserverstate!=null &&
              this.nameserverstate.equals(other.getNameserverstate()))) &&
            this.local == other.isLocal() &&
            ((this.clmonowner==null && other.getClmonowner()==null) || 
             (this.clmonowner!=null &&
              this.clmonowner.equals(other.getClmonowner()))) &&
            ((this.clmonview==null && other.getClmonview()==null) || 
             (this.clmonview!=null &&
              this.clmonview.equals(other.getClmonview())));
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
        if (getIp() != null) {
            _hashCode += getIp().hashCode();
        }
        if (getDnsvservername() != null) {
            _hashCode += getDnsvservername().hashCode();
        }
        if (getServicename() != null) {
            _hashCode += getServicename().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getNameserverstate() != null) {
            _hashCode += getNameserverstate().hashCode();
        }
        _hashCode += (isLocal() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getClmonowner() != null) {
            _hashCode += getClmonowner().hashCode();
        }
        if (getClmonview() != null) {
            _hashCode += getClmonview().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dnsnameserver.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "dnsnameserver"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dnsvservername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dnsvservername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicename"));
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
        elemField.setFieldName("nameserverstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nameserverstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("local");
        elemField.setXmlName(new javax.xml.namespace.QName("", "local"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clmonowner");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clmonowner"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clmonview");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clmonview"));
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
