/**
 * Vrid.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Vrid  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt id;

    private java.lang.String ifaces;

    private java.lang.String type;

    private org.apache.axis.types.UnsignedInt[] vlan;

    private org.apache.axis.types.UnsignedInt priority;

    private org.apache.axis.types.UnsignedInt effectivepriority;

    private java.lang.String preemption;

    private java.lang.String sharing;

    private java.lang.String tracking;

    private org.apache.axis.types.UnsignedInt flags;

    private java.lang.String ipaddress;

    private org.apache.axis.types.UnsignedInt state;

    private java.lang.String[] boundip;

    private org.apache.axis.types.UnsignedInt[] vridipbindflags;

    private java.lang.String[] boundifaces;

    private org.apache.axis.types.UnsignedInt[] vridvlanbindflags;

    public Vrid() {
    }

    public Vrid(
           org.apache.axis.types.UnsignedInt id,
           java.lang.String ifaces,
           java.lang.String type,
           org.apache.axis.types.UnsignedInt[] vlan,
           org.apache.axis.types.UnsignedInt priority,
           org.apache.axis.types.UnsignedInt effectivepriority,
           java.lang.String preemption,
           java.lang.String sharing,
           java.lang.String tracking,
           org.apache.axis.types.UnsignedInt flags,
           java.lang.String ipaddress,
           org.apache.axis.types.UnsignedInt state,
           java.lang.String[] boundip,
           org.apache.axis.types.UnsignedInt[] vridipbindflags,
           java.lang.String[] boundifaces,
           org.apache.axis.types.UnsignedInt[] vridvlanbindflags) {
           this.id = id;
           this.ifaces = ifaces;
           this.type = type;
           this.vlan = vlan;
           this.priority = priority;
           this.effectivepriority = effectivepriority;
           this.preemption = preemption;
           this.sharing = sharing;
           this.tracking = tracking;
           this.flags = flags;
           this.ipaddress = ipaddress;
           this.state = state;
           this.boundip = boundip;
           this.vridipbindflags = vridipbindflags;
           this.boundifaces = boundifaces;
           this.vridvlanbindflags = vridvlanbindflags;
    }


    /**
     * Gets the id value for this Vrid.
     * 
     * @return id
     */
    public org.apache.axis.types.UnsignedInt getId() {
        return id;
    }


    /**
     * Sets the id value for this Vrid.
     * 
     * @param id
     */
    public void setId(org.apache.axis.types.UnsignedInt id) {
        this.id = id;
    }


    /**
     * Gets the ifaces value for this Vrid.
     * 
     * @return ifaces
     */
    public java.lang.String getIfaces() {
        return ifaces;
    }


    /**
     * Sets the ifaces value for this Vrid.
     * 
     * @param ifaces
     */
    public void setIfaces(java.lang.String ifaces) {
        this.ifaces = ifaces;
    }


    /**
     * Gets the type value for this Vrid.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Vrid.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the vlan value for this Vrid.
     * 
     * @return vlan
     */
    public org.apache.axis.types.UnsignedInt[] getVlan() {
        return vlan;
    }


    /**
     * Sets the vlan value for this Vrid.
     * 
     * @param vlan
     */
    public void setVlan(org.apache.axis.types.UnsignedInt[] vlan) {
        this.vlan = vlan;
    }


    /**
     * Gets the priority value for this Vrid.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Vrid.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the effectivepriority value for this Vrid.
     * 
     * @return effectivepriority
     */
    public org.apache.axis.types.UnsignedInt getEffectivepriority() {
        return effectivepriority;
    }


    /**
     * Sets the effectivepriority value for this Vrid.
     * 
     * @param effectivepriority
     */
    public void setEffectivepriority(org.apache.axis.types.UnsignedInt effectivepriority) {
        this.effectivepriority = effectivepriority;
    }


    /**
     * Gets the preemption value for this Vrid.
     * 
     * @return preemption
     */
    public java.lang.String getPreemption() {
        return preemption;
    }


    /**
     * Sets the preemption value for this Vrid.
     * 
     * @param preemption
     */
    public void setPreemption(java.lang.String preemption) {
        this.preemption = preemption;
    }


    /**
     * Gets the sharing value for this Vrid.
     * 
     * @return sharing
     */
    public java.lang.String getSharing() {
        return sharing;
    }


    /**
     * Sets the sharing value for this Vrid.
     * 
     * @param sharing
     */
    public void setSharing(java.lang.String sharing) {
        this.sharing = sharing;
    }


    /**
     * Gets the tracking value for this Vrid.
     * 
     * @return tracking
     */
    public java.lang.String getTracking() {
        return tracking;
    }


    /**
     * Sets the tracking value for this Vrid.
     * 
     * @param tracking
     */
    public void setTracking(java.lang.String tracking) {
        this.tracking = tracking;
    }


    /**
     * Gets the flags value for this Vrid.
     * 
     * @return flags
     */
    public org.apache.axis.types.UnsignedInt getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this Vrid.
     * 
     * @param flags
     */
    public void setFlags(org.apache.axis.types.UnsignedInt flags) {
        this.flags = flags;
    }


    /**
     * Gets the ipaddress value for this Vrid.
     * 
     * @return ipaddress
     */
    public java.lang.String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Vrid.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the state value for this Vrid.
     * 
     * @return state
     */
    public org.apache.axis.types.UnsignedInt getState() {
        return state;
    }


    /**
     * Sets the state value for this Vrid.
     * 
     * @param state
     */
    public void setState(org.apache.axis.types.UnsignedInt state) {
        this.state = state;
    }


    /**
     * Gets the boundip value for this Vrid.
     * 
     * @return boundip
     */
    public java.lang.String[] getBoundip() {
        return boundip;
    }


    /**
     * Sets the boundip value for this Vrid.
     * 
     * @param boundip
     */
    public void setBoundip(java.lang.String[] boundip) {
        this.boundip = boundip;
    }


    /**
     * Gets the vridipbindflags value for this Vrid.
     * 
     * @return vridipbindflags
     */
    public org.apache.axis.types.UnsignedInt[] getVridipbindflags() {
        return vridipbindflags;
    }


    /**
     * Sets the vridipbindflags value for this Vrid.
     * 
     * @param vridipbindflags
     */
    public void setVridipbindflags(org.apache.axis.types.UnsignedInt[] vridipbindflags) {
        this.vridipbindflags = vridipbindflags;
    }


    /**
     * Gets the boundifaces value for this Vrid.
     * 
     * @return boundifaces
     */
    public java.lang.String[] getBoundifaces() {
        return boundifaces;
    }


    /**
     * Sets the boundifaces value for this Vrid.
     * 
     * @param boundifaces
     */
    public void setBoundifaces(java.lang.String[] boundifaces) {
        this.boundifaces = boundifaces;
    }


    /**
     * Gets the vridvlanbindflags value for this Vrid.
     * 
     * @return vridvlanbindflags
     */
    public org.apache.axis.types.UnsignedInt[] getVridvlanbindflags() {
        return vridvlanbindflags;
    }


    /**
     * Sets the vridvlanbindflags value for this Vrid.
     * 
     * @param vridvlanbindflags
     */
    public void setVridvlanbindflags(org.apache.axis.types.UnsignedInt[] vridvlanbindflags) {
        this.vridvlanbindflags = vridvlanbindflags;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Vrid)) return false;
        Vrid other = (Vrid) obj;
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
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.vlan==null && other.getVlan()==null) || 
             (this.vlan!=null &&
              java.util.Arrays.equals(this.vlan, other.getVlan()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.effectivepriority==null && other.getEffectivepriority()==null) || 
             (this.effectivepriority!=null &&
              this.effectivepriority.equals(other.getEffectivepriority()))) &&
            ((this.preemption==null && other.getPreemption()==null) || 
             (this.preemption!=null &&
              this.preemption.equals(other.getPreemption()))) &&
            ((this.sharing==null && other.getSharing()==null) || 
             (this.sharing!=null &&
              this.sharing.equals(other.getSharing()))) &&
            ((this.tracking==null && other.getTracking()==null) || 
             (this.tracking!=null &&
              this.tracking.equals(other.getTracking()))) &&
            ((this.flags==null && other.getFlags()==null) || 
             (this.flags!=null &&
              this.flags.equals(other.getFlags()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              this.ipaddress.equals(other.getIpaddress()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.boundip==null && other.getBoundip()==null) || 
             (this.boundip!=null &&
              java.util.Arrays.equals(this.boundip, other.getBoundip()))) &&
            ((this.vridipbindflags==null && other.getVridipbindflags()==null) || 
             (this.vridipbindflags!=null &&
              java.util.Arrays.equals(this.vridipbindflags, other.getVridipbindflags()))) &&
            ((this.boundifaces==null && other.getBoundifaces()==null) || 
             (this.boundifaces!=null &&
              java.util.Arrays.equals(this.boundifaces, other.getBoundifaces()))) &&
            ((this.vridvlanbindflags==null && other.getVridvlanbindflags()==null) || 
             (this.vridvlanbindflags!=null &&
              java.util.Arrays.equals(this.vridvlanbindflags, other.getVridvlanbindflags())));
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
        if (getEffectivepriority() != null) {
            _hashCode += getEffectivepriority().hashCode();
        }
        if (getPreemption() != null) {
            _hashCode += getPreemption().hashCode();
        }
        if (getSharing() != null) {
            _hashCode += getSharing().hashCode();
        }
        if (getTracking() != null) {
            _hashCode += getTracking().hashCode();
        }
        if (getFlags() != null) {
            _hashCode += getFlags().hashCode();
        }
        if (getIpaddress() != null) {
            _hashCode += getIpaddress().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
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
        if (getVridipbindflags() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVridipbindflags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVridipbindflags(), i);
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
        if (getVridvlanbindflags() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVridvlanbindflags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVridvlanbindflags(), i);
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
        new org.apache.axis.description.TypeDesc(Vrid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "vrid"));
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
        elemField.setFieldName("effectivepriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "effectivepriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preemption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preemption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sharing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sharing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tracking");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tracking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vridipbindflags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vridipbindflags"));
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
        elemField.setFieldName("vridvlanbindflags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vridvlanbindflags"));
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
