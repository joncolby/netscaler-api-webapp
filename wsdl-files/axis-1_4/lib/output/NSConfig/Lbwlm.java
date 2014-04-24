/**
 * Lbwlm.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Lbwlm  implements java.io.Serializable {
    private java.lang.String wlmname;

    private java.lang.String ipaddress;

    private org.apache.axis.types.UnsignedInt port;

    private java.lang.String secure;

    private org.apache.axis.types.UnsignedInt katimeout;

    private java.lang.String lbuid;

    private java.lang.String state;

    private java.lang.String[] vservername;

    public Lbwlm() {
    }

    public Lbwlm(
           java.lang.String wlmname,
           java.lang.String ipaddress,
           org.apache.axis.types.UnsignedInt port,
           java.lang.String secure,
           org.apache.axis.types.UnsignedInt katimeout,
           java.lang.String lbuid,
           java.lang.String state,
           java.lang.String[] vservername) {
           this.wlmname = wlmname;
           this.ipaddress = ipaddress;
           this.port = port;
           this.secure = secure;
           this.katimeout = katimeout;
           this.lbuid = lbuid;
           this.state = state;
           this.vservername = vservername;
    }


    /**
     * Gets the wlmname value for this Lbwlm.
     * 
     * @return wlmname
     */
    public java.lang.String getWlmname() {
        return wlmname;
    }


    /**
     * Sets the wlmname value for this Lbwlm.
     * 
     * @param wlmname
     */
    public void setWlmname(java.lang.String wlmname) {
        this.wlmname = wlmname;
    }


    /**
     * Gets the ipaddress value for this Lbwlm.
     * 
     * @return ipaddress
     */
    public java.lang.String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Lbwlm.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the port value for this Lbwlm.
     * 
     * @return port
     */
    public org.apache.axis.types.UnsignedInt getPort() {
        return port;
    }


    /**
     * Sets the port value for this Lbwlm.
     * 
     * @param port
     */
    public void setPort(org.apache.axis.types.UnsignedInt port) {
        this.port = port;
    }


    /**
     * Gets the secure value for this Lbwlm.
     * 
     * @return secure
     */
    public java.lang.String getSecure() {
        return secure;
    }


    /**
     * Sets the secure value for this Lbwlm.
     * 
     * @param secure
     */
    public void setSecure(java.lang.String secure) {
        this.secure = secure;
    }


    /**
     * Gets the katimeout value for this Lbwlm.
     * 
     * @return katimeout
     */
    public org.apache.axis.types.UnsignedInt getKatimeout() {
        return katimeout;
    }


    /**
     * Sets the katimeout value for this Lbwlm.
     * 
     * @param katimeout
     */
    public void setKatimeout(org.apache.axis.types.UnsignedInt katimeout) {
        this.katimeout = katimeout;
    }


    /**
     * Gets the lbuid value for this Lbwlm.
     * 
     * @return lbuid
     */
    public java.lang.String getLbuid() {
        return lbuid;
    }


    /**
     * Sets the lbuid value for this Lbwlm.
     * 
     * @param lbuid
     */
    public void setLbuid(java.lang.String lbuid) {
        this.lbuid = lbuid;
    }


    /**
     * Gets the state value for this Lbwlm.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Lbwlm.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the vservername value for this Lbwlm.
     * 
     * @return vservername
     */
    public java.lang.String[] getVservername() {
        return vservername;
    }


    /**
     * Sets the vservername value for this Lbwlm.
     * 
     * @param vservername
     */
    public void setVservername(java.lang.String[] vservername) {
        this.vservername = vservername;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Lbwlm)) return false;
        Lbwlm other = (Lbwlm) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.wlmname==null && other.getWlmname()==null) || 
             (this.wlmname!=null &&
              this.wlmname.equals(other.getWlmname()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              this.ipaddress.equals(other.getIpaddress()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.secure==null && other.getSecure()==null) || 
             (this.secure!=null &&
              this.secure.equals(other.getSecure()))) &&
            ((this.katimeout==null && other.getKatimeout()==null) || 
             (this.katimeout!=null &&
              this.katimeout.equals(other.getKatimeout()))) &&
            ((this.lbuid==null && other.getLbuid()==null) || 
             (this.lbuid!=null &&
              this.lbuid.equals(other.getLbuid()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.vservername==null && other.getVservername()==null) || 
             (this.vservername!=null &&
              java.util.Arrays.equals(this.vservername, other.getVservername())));
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
        if (getWlmname() != null) {
            _hashCode += getWlmname().hashCode();
        }
        if (getIpaddress() != null) {
            _hashCode += getIpaddress().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getSecure() != null) {
            _hashCode += getSecure().hashCode();
        }
        if (getKatimeout() != null) {
            _hashCode += getKatimeout().hashCode();
        }
        if (getLbuid() != null) {
            _hashCode += getLbuid().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getVservername() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVservername());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVservername(), i);
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
        new org.apache.axis.description.TypeDesc(Lbwlm.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "lbwlm"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wlmname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wlmname"));
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
        elemField.setFieldName("secure");
        elemField.setXmlName(new javax.xml.namespace.QName("", "secure"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("katimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "katimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lbuid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lbuid"));
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
