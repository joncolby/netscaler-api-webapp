/**
 * Linkset.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Linkset  implements java.io.Serializable {
    private java.lang.String id;

    private java.lang.String ifnum;

    private java.lang.String[] interfacE;

    private java.lang.String[] channel;

    public Linkset() {
    }

    public Linkset(
           java.lang.String id,
           java.lang.String ifnum,
           java.lang.String[] interfacE,
           java.lang.String[] channel) {
           this.id = id;
           this.ifnum = ifnum;
           this.interfacE = interfacE;
           this.channel = channel;
    }


    /**
     * Gets the id value for this Linkset.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Linkset.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the ifnum value for this Linkset.
     * 
     * @return ifnum
     */
    public java.lang.String getIfnum() {
        return ifnum;
    }


    /**
     * Sets the ifnum value for this Linkset.
     * 
     * @param ifnum
     */
    public void setIfnum(java.lang.String ifnum) {
        this.ifnum = ifnum;
    }


    /**
     * Gets the interfacE value for this Linkset.
     * 
     * @return interfacE
     */
    public java.lang.String[] getInterfacE() {
        return interfacE;
    }


    /**
     * Sets the interfacE value for this Linkset.
     * 
     * @param interfacE
     */
    public void setInterfacE(java.lang.String[] interfacE) {
        this.interfacE = interfacE;
    }


    /**
     * Gets the channel value for this Linkset.
     * 
     * @return channel
     */
    public java.lang.String[] getChannel() {
        return channel;
    }


    /**
     * Sets the channel value for this Linkset.
     * 
     * @param channel
     */
    public void setChannel(java.lang.String[] channel) {
        this.channel = channel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Linkset)) return false;
        Linkset other = (Linkset) obj;
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
            ((this.ifnum==null && other.getIfnum()==null) || 
             (this.ifnum!=null &&
              this.ifnum.equals(other.getIfnum()))) &&
            ((this.interfacE==null && other.getInterfacE()==null) || 
             (this.interfacE!=null &&
              java.util.Arrays.equals(this.interfacE, other.getInterfacE()))) &&
            ((this.channel==null && other.getChannel()==null) || 
             (this.channel!=null &&
              java.util.Arrays.equals(this.channel, other.getChannel())));
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
        if (getIfnum() != null) {
            _hashCode += getIfnum().hashCode();
        }
        if (getInterfacE() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInterfacE());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInterfacE(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChannel() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getChannel());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getChannel(), i);
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
        new org.apache.axis.description.TypeDesc(Linkset.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "linkset"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
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
        elemField.setFieldName("interfacE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interfacE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channel"));
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
