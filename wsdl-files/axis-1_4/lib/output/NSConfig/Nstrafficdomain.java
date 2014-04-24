/**
 * Nstrafficdomain.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nstrafficdomain  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt td;

    private java.lang.String aliasname;

    private org.apache.axis.types.UnsignedInt[] vlan;

    private org.apache.axis.types.UnsignedInt[] bridgegroup;

    private java.lang.String state;

    public Nstrafficdomain() {
    }

    public Nstrafficdomain(
           org.apache.axis.types.UnsignedInt td,
           java.lang.String aliasname,
           org.apache.axis.types.UnsignedInt[] vlan,
           org.apache.axis.types.UnsignedInt[] bridgegroup,
           java.lang.String state) {
           this.td = td;
           this.aliasname = aliasname;
           this.vlan = vlan;
           this.bridgegroup = bridgegroup;
           this.state = state;
    }


    /**
     * Gets the td value for this Nstrafficdomain.
     * 
     * @return td
     */
    public org.apache.axis.types.UnsignedInt getTd() {
        return td;
    }


    /**
     * Sets the td value for this Nstrafficdomain.
     * 
     * @param td
     */
    public void setTd(org.apache.axis.types.UnsignedInt td) {
        this.td = td;
    }


    /**
     * Gets the aliasname value for this Nstrafficdomain.
     * 
     * @return aliasname
     */
    public java.lang.String getAliasname() {
        return aliasname;
    }


    /**
     * Sets the aliasname value for this Nstrafficdomain.
     * 
     * @param aliasname
     */
    public void setAliasname(java.lang.String aliasname) {
        this.aliasname = aliasname;
    }


    /**
     * Gets the vlan value for this Nstrafficdomain.
     * 
     * @return vlan
     */
    public org.apache.axis.types.UnsignedInt[] getVlan() {
        return vlan;
    }


    /**
     * Sets the vlan value for this Nstrafficdomain.
     * 
     * @param vlan
     */
    public void setVlan(org.apache.axis.types.UnsignedInt[] vlan) {
        this.vlan = vlan;
    }


    /**
     * Gets the bridgegroup value for this Nstrafficdomain.
     * 
     * @return bridgegroup
     */
    public org.apache.axis.types.UnsignedInt[] getBridgegroup() {
        return bridgegroup;
    }


    /**
     * Sets the bridgegroup value for this Nstrafficdomain.
     * 
     * @param bridgegroup
     */
    public void setBridgegroup(org.apache.axis.types.UnsignedInt[] bridgegroup) {
        this.bridgegroup = bridgegroup;
    }


    /**
     * Gets the state value for this Nstrafficdomain.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Nstrafficdomain.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nstrafficdomain)) return false;
        Nstrafficdomain other = (Nstrafficdomain) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.td==null && other.getTd()==null) || 
             (this.td!=null &&
              this.td.equals(other.getTd()))) &&
            ((this.aliasname==null && other.getAliasname()==null) || 
             (this.aliasname!=null &&
              this.aliasname.equals(other.getAliasname()))) &&
            ((this.vlan==null && other.getVlan()==null) || 
             (this.vlan!=null &&
              java.util.Arrays.equals(this.vlan, other.getVlan()))) &&
            ((this.bridgegroup==null && other.getBridgegroup()==null) || 
             (this.bridgegroup!=null &&
              java.util.Arrays.equals(this.bridgegroup, other.getBridgegroup()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState())));
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
        if (getTd() != null) {
            _hashCode += getTd().hashCode();
        }
        if (getAliasname() != null) {
            _hashCode += getAliasname().hashCode();
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
        if (getBridgegroup() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBridgegroup());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBridgegroup(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nstrafficdomain.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nstrafficdomain"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("td");
        elemField.setXmlName(new javax.xml.namespace.QName("", "td"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aliasname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aliasname"));
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
        elemField.setFieldName("bridgegroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bridgegroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
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
