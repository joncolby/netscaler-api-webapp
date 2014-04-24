/**
 * Rnat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Rnat  implements java.io.Serializable {
    private java.lang.String network;

    private java.lang.String netmask;

    private java.lang.String natip;

    private java.lang.String aclname;

    private org.apache.axis.types.UnsignedInt redirectport;

    public Rnat() {
    }

    public Rnat(
           java.lang.String network,
           java.lang.String netmask,
           java.lang.String natip,
           java.lang.String aclname,
           org.apache.axis.types.UnsignedInt redirectport) {
           this.network = network;
           this.netmask = netmask;
           this.natip = natip;
           this.aclname = aclname;
           this.redirectport = redirectport;
    }


    /**
     * Gets the network value for this Rnat.
     * 
     * @return network
     */
    public java.lang.String getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this Rnat.
     * 
     * @param network
     */
    public void setNetwork(java.lang.String network) {
        this.network = network;
    }


    /**
     * Gets the netmask value for this Rnat.
     * 
     * @return netmask
     */
    public java.lang.String getNetmask() {
        return netmask;
    }


    /**
     * Sets the netmask value for this Rnat.
     * 
     * @param netmask
     */
    public void setNetmask(java.lang.String netmask) {
        this.netmask = netmask;
    }


    /**
     * Gets the natip value for this Rnat.
     * 
     * @return natip
     */
    public java.lang.String getNatip() {
        return natip;
    }


    /**
     * Sets the natip value for this Rnat.
     * 
     * @param natip
     */
    public void setNatip(java.lang.String natip) {
        this.natip = natip;
    }


    /**
     * Gets the aclname value for this Rnat.
     * 
     * @return aclname
     */
    public java.lang.String getAclname() {
        return aclname;
    }


    /**
     * Sets the aclname value for this Rnat.
     * 
     * @param aclname
     */
    public void setAclname(java.lang.String aclname) {
        this.aclname = aclname;
    }


    /**
     * Gets the redirectport value for this Rnat.
     * 
     * @return redirectport
     */
    public org.apache.axis.types.UnsignedInt getRedirectport() {
        return redirectport;
    }


    /**
     * Sets the redirectport value for this Rnat.
     * 
     * @param redirectport
     */
    public void setRedirectport(org.apache.axis.types.UnsignedInt redirectport) {
        this.redirectport = redirectport;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rnat)) return false;
        Rnat other = (Rnat) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              this.network.equals(other.getNetwork()))) &&
            ((this.netmask==null && other.getNetmask()==null) || 
             (this.netmask!=null &&
              this.netmask.equals(other.getNetmask()))) &&
            ((this.natip==null && other.getNatip()==null) || 
             (this.natip!=null &&
              this.natip.equals(other.getNatip()))) &&
            ((this.aclname==null && other.getAclname()==null) || 
             (this.aclname!=null &&
              this.aclname.equals(other.getAclname()))) &&
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
        if (getNetwork() != null) {
            _hashCode += getNetwork().hashCode();
        }
        if (getNetmask() != null) {
            _hashCode += getNetmask().hashCode();
        }
        if (getNatip() != null) {
            _hashCode += getNatip().hashCode();
        }
        if (getAclname() != null) {
            _hashCode += getAclname().hashCode();
        }
        if (getRedirectport() != null) {
            _hashCode += getRedirectport().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Rnat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "rnat"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("", "network"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netmask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netmask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "natip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aclname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aclname"));
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
