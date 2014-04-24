/**
 * Rnat6.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Rnat6  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String network;

    private java.lang.String acl6Name;

    private java.lang.String[] natip6;

    private org.apache.axis.types.UnsignedInt redirectport;

    public Rnat6() {
    }

    public Rnat6(
           java.lang.String name,
           java.lang.String network,
           java.lang.String acl6Name,
           java.lang.String[] natip6,
           org.apache.axis.types.UnsignedInt redirectport) {
           this.name = name;
           this.network = network;
           this.acl6Name = acl6Name;
           this.natip6 = natip6;
           this.redirectport = redirectport;
    }


    /**
     * Gets the name value for this Rnat6.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Rnat6.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the network value for this Rnat6.
     * 
     * @return network
     */
    public java.lang.String getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this Rnat6.
     * 
     * @param network
     */
    public void setNetwork(java.lang.String network) {
        this.network = network;
    }


    /**
     * Gets the acl6Name value for this Rnat6.
     * 
     * @return acl6Name
     */
    public java.lang.String getAcl6Name() {
        return acl6Name;
    }


    /**
     * Sets the acl6Name value for this Rnat6.
     * 
     * @param acl6Name
     */
    public void setAcl6Name(java.lang.String acl6Name) {
        this.acl6Name = acl6Name;
    }


    /**
     * Gets the natip6 value for this Rnat6.
     * 
     * @return natip6
     */
    public java.lang.String[] getNatip6() {
        return natip6;
    }


    /**
     * Sets the natip6 value for this Rnat6.
     * 
     * @param natip6
     */
    public void setNatip6(java.lang.String[] natip6) {
        this.natip6 = natip6;
    }


    /**
     * Gets the redirectport value for this Rnat6.
     * 
     * @return redirectport
     */
    public org.apache.axis.types.UnsignedInt getRedirectport() {
        return redirectport;
    }


    /**
     * Sets the redirectport value for this Rnat6.
     * 
     * @param redirectport
     */
    public void setRedirectport(org.apache.axis.types.UnsignedInt redirectport) {
        this.redirectport = redirectport;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rnat6)) return false;
        Rnat6 other = (Rnat6) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              this.network.equals(other.getNetwork()))) &&
            ((this.acl6Name==null && other.getAcl6Name()==null) || 
             (this.acl6Name!=null &&
              this.acl6Name.equals(other.getAcl6Name()))) &&
            ((this.natip6==null && other.getNatip6()==null) || 
             (this.natip6!=null &&
              java.util.Arrays.equals(this.natip6, other.getNatip6()))) &&
            ((this.redirectport==null && other.getRedirectport()==null) || 
             (this.redirectport!=null &&
              this.redirectport.equals(other.getRedirectport())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getNetwork() != null) {
            _hashCode += getNetwork().hashCode();
        }
        if (getAcl6Name() != null) {
            _hashCode += getAcl6Name().hashCode();
        }
        if (getNatip6() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNatip6());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNatip6(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRedirectport() != null) {
            _hashCode += getRedirectport().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Rnat6.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "rnat6"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("", "network"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acl6Name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acl6name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natip6");
        elemField.setXmlName(new javax.xml.namespace.QName("", "natip6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirectport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "redirectport"));
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
