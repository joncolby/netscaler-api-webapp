/**
 * Vrid6.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Vrid6  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt id;

    private java.lang.String ifaces;

    private java.lang.String ifnum;

    private java.lang.String type;

    private org.apache.axis.types.UnsignedInt[] vlan;

    private org.apache.axis.types.UnsignedInt priority;

    private org.apache.axis.types.UnsignedInt state;

    private org.apache.axis.types.UnsignedInt flags;

    private java.lang.String ipaddress;

    private java.lang.String[] boundip;

    private org.apache.axis.types.UnsignedInt[] vrid6Ipbindflags;

    private java.lang.String[] boundifaces;

    private org.apache.axis.types.UnsignedInt[] vrid6Vlanbindflags;

    public Vrid6() {
    }

    public Vrid6(
           org.apache.axis.types.UnsignedInt id,
           java.lang.String ifaces,
           java.lang.String ifnum,
           java.lang.String type,
           org.apache.axis.types.UnsignedInt[] vlan,
           org.apache.axis.types.UnsignedInt priority,
           org.apache.axis.types.UnsignedInt state,
           org.apache.axis.types.UnsignedInt flags,
           java.lang.String ipaddress,
           java.lang.String[] boundip,
           org.apache.axis.types.UnsignedInt[] vrid6Ipbindflags,
           java.lang.String[] boundifaces,
           org.apache.axis.types.UnsignedInt[] vrid6Vlanbindflags) {
           this.id = id;
           this.ifaces = ifaces;
           this.ifnum = ifnum;
           this.type = type;
           this.vlan = vlan;
           this.priority = priority;
           this.state = state;
           this.flags = flags;
           this.ipaddress = ipaddress;
           this.boundip = boundip;
           this.vrid6Ipbindflags = vrid6Ipbindflags;
           this.boundifaces = boundifaces;
           this.vrid6Vlanbindflags = vrid6Vlanbindflags;
    }


    /**
     * Gets the id value for this Vrid6.
     * 
     * @return id
     */
    public org.apache.axis.types.UnsignedInt getId() {
        return id;
    }


    /**
     * Sets the id value for this Vrid6.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.UnsignedInt id) {
        this.id = id;
    }


    /**
     * Gets the ifaces value for this Vrid6.
     * 
     * @return ifaces
     */
    public java.lang.String getIfaces() {
        return ifaces;
    }


    /**
     * Sets the ifaces value for this Vrid6.
     * 
     * @param ifaces
     */
    public void setIfaces(java.lang.String ifaces) {
        this.ifaces = ifaces;
    }


    /**
     * Gets the ifnum value for this Vrid6.
     * 
     * @return ifnum
     */
    public java.lang.String getIfnum() {
        return ifnum;
    }


    /**
     * Sets the ifnum value for this Vrid6.
     * 
     * @param ifnum
     */
    public void setIfnum(java.lang.String ifnum) {
        this.ifnum = ifnum;
    }


    /**
     * Gets the type value for this Vrid6.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Vrid6.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the vlan value for this Vrid6.
     * 
     * @return vlan
     */
    public org.apache.axis.types.UnsignedInt[] getVlan() {
        return vlan;
    }


    /**
     * Sets the vlan value for this Vrid6.
     * 
     * @param vlan
     */
    public void setVlan(org.apache.axis.types.UnsignedInt[] vlan) {
        this.vlan = vlan;
    }


    /**
     * Gets the priority value for this Vrid6.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Vrid6.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the state value for this Vrid6.
     * 
     * @return state
     */
    public org.apache.axis.types.UnsignedInt getState() {
        return state;
    }


    /**
     * Sets the state value for this Vrid6.
     * 
     * @param state
     */
    public void setState(org.apache.axis.types.UnsignedInt state) {
        this.state = state;
    }


    /**
     * Gets the flags value for this Vrid6.
     * 
     * @return flags
     */
    public org.apache.axis.types.UnsignedInt getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this Vrid6.
     * 
     * @param flags
     */
    public void setFlags(org.apache.axis.types.UnsignedInt flags) {
        this.flags = flags;
    }


    /**
     * Gets the ipaddress value for this Vrid6.
     * 
     * @return ipaddress
     */
    public java.lang.String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Vrid6.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the boundip value for this Vrid6.
     * 
     * @return boundip
     */
    public java.lang.String[] getBoundip() {
        return boundip;
    }


    /**
     * Sets the boundip value for this Vrid6.
     * 
     * @param boundip
     */
    public void setBoundip(java.lang.String[] boundip) {
        this.boundip = boundip;
    }


    /**
     * Gets the vrid6Ipbindflags value for this Vrid6.
     * 
     * @return vrid6Ipbindflags
     */
    public org.apache.axis.types.UnsignedInt[] getVrid6Ipbindflags() {
        return vrid6Ipbindflags;
    }


    /**
     * Sets the vrid6Ipbindflags value for this Vrid6.
     * 
     * @param vrid6Ipbindflags
     */
    public void setVrid6Ipbindflags(org.apache.axis.types.UnsignedInt[] vrid6Ipbindflags) {
        this.vrid6Ipbindflags = vrid6Ipbindflags;
    }


    /**
     * Gets the boundifaces value for this Vrid6.
     * 
     * @return boundifaces
     */
    public java.lang.String[] getBoundifaces() {
        return boundifaces;
    }


    /**
     * Sets the boundifaces value for this Vrid6.
     * 
     * @param boundifaces
     */
    public void setBoundifaces(java.lang.String[] boundifaces) {
        this.boundifaces = boundifaces;
    }


    /**
     * Gets the vrid6Vlanbindflags value for this Vrid6.
     * 
     * @return vrid6Vlanbindflags
     */
    public org.apache.axis.types.UnsignedInt[] getVrid6Vlanbindflags() {
        return vrid6Vlanbindflags;
    }


    /**
     * Sets the vrid6Vlanbindflags value for this Vrid6.
     * 
     * @param vrid6Vlanbindflags
     */
    public void setVrid6Vlanbindflags(org.apache.axis.types.UnsignedInt[] vrid6Vlanbindflags) {
        this.vrid6Vlanbindflags = vrid6Vlanbindflags;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Vrid6)) return false;
        Vrid6 other = (Vrid6) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.ifaces==null && other.getIfaces()==null) || 
             (this.ifaces!=null &&
              this.ifaces.equals(other.getIfaces()))) &&
            ((this.ifnum==null && other.getIfnum()==null) || 
             (this.ifnum!=null &&
              this.ifnum.equals(other.getIfnum()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.vlan==null && other.getVlan()==null) || 
             (this.vlan!=null &&
              java.util.Arrays.equals(this.vlan, other.getVlan()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.flags==null && other.getFlags()==null) || 
             (this.flags!=null &&
              this.flags.equals(other.getFlags()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              this.ipaddress.equals(other.getIpaddress()))) &&
            ((this.boundip==null && other.getBoundip()==null) || 
             (this.boundip!=null &&
              java.util.Arrays.equals(this.boundip, other.getBoundip()))) &&
            ((this.vrid6Ipbindflags==null && other.getVrid6Ipbindflags()==null) || 
             (this.vrid6Ipbindflags!=null &&
              java.util.Arrays.equals(this.vrid6Ipbindflags, other.getVrid6Ipbindflags()))) &&
            ((this.boundifaces==null && other.getBoundifaces()==null) || 
             (this.boundifaces!=null &&
              java.util.Arrays.equals(this.boundifaces, other.getBoundifaces()))) &&
            ((this.vrid6Vlanbindflags==null && other.getVrid6Vlanbindflags()==null) || 
             (this.vrid6Vlanbindflags!=null &&
              java.util.Arrays.equals(this.vrid6Vlanbindflags, other.getVrid6Vlanbindflags())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIfaces() != null) {
            _hashCode += getIfaces().hashCode();
        }
        if (getIfnum() != null) {
            _hashCode += getIfnum().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getVlan() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVlan());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVlan(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getFlags() != null) {
            _hashCode += getFlags().hashCode();
        }
        if (getIpaddress() != null) {
            _hashCode += getIpaddress().hashCode();
        }
        if (getBoundip() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundip());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundip(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVrid6Ipbindflags() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVrid6Ipbindflags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVrid6Ipbindflags(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBoundifaces() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundifaces());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundifaces(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVrid6Vlanbindflags() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVrid6Vlanbindflags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVrid6Vlanbindflags(), i);
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
        new org.apache.axis.description.TypeDesc(Vrid6.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "vrid6"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ifaces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ifaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ifnum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ifnum"));
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
        elemField.setFieldName("vlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipaddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vrid6Ipbindflags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vrid6ipbindflags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundifaces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundifaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vrid6Vlanbindflags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vrid6vlanbindflags"));
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
