/**
 * Forwardingsession.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Forwardingsession  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String network;

    private java.lang.String netmask;

    private java.lang.String aclname;

    private java.lang.String acl6Name;

    private java.lang.String connfailover;

    public Forwardingsession() {
    }

    public Forwardingsession(
           java.lang.String name,
           java.lang.String network,
           java.lang.String netmask,
           java.lang.String aclname,
           java.lang.String acl6Name,
           java.lang.String connfailover) {
           this.name = name;
           this.network = network;
           this.netmask = netmask;
           this.aclname = aclname;
           this.acl6Name = acl6Name;
           this.connfailover = connfailover;
    }


    /**
     * Gets the name value for this Forwardingsession.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Forwardingsession.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the network value for this Forwardingsession.
     * 
     * @return network
     */
    public java.lang.String getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this Forwardingsession.
     * 
     * @param network
     */
    public void setNetwork(java.lang.String network) {
        this.network = network;
    }


    /**
     * Gets the netmask value for this Forwardingsession.
     * 
     * @return netmask
     */
    public java.lang.String getNetmask() {
        return netmask;
    }


    /**
     * Sets the netmask value for this Forwardingsession.
     * 
     * @param netmask
     */
    public void setNetmask(java.lang.String netmask) {
        this.netmask = netmask;
    }


    /**
     * Gets the aclname value for this Forwardingsession.
     * 
     * @return aclname
     */
    public java.lang.String getAclname() {
        return aclname;
    }


    /**
     * Sets the aclname value for this Forwardingsession.
     * 
     * @param aclname
     */
    public void setAclname(java.lang.String aclname) {
        this.aclname = aclname;
    }


    /**
     * Gets the acl6Name value for this Forwardingsession.
     * 
     * @return acl6Name
     */
    public java.lang.String getAcl6Name() {
        return acl6Name;
    }


    /**
     * Sets the acl6Name value for this Forwardingsession.
     * 
     * @param acl6Name
     */
    public void setAcl6Name(java.lang.String acl6Name) {
        this.acl6Name = acl6Name;
    }


    /**
     * Gets the connfailover value for this Forwardingsession.
     * 
     * @return connfailover
     */
    public java.lang.String getConnfailover() {
        return connfailover;
    }


    /**
     * Sets the connfailover value for this Forwardingsession.
     * 
     * @param connfailover
     */
    public void setConnfailover(java.lang.String connfailover) {
        this.connfailover = connfailover;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Forwardingsession)) return false;
        Forwardingsession other = (Forwardingsession) obj;
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
            ((this.netmask==null && other.getNetmask()==null) || 
             (this.netmask!=null &&
              this.netmask.equals(other.getNetmask()))) &&
            ((this.aclname==null && other.getAclname()==null) || 
             (this.aclname!=null &&
              this.aclname.equals(other.getAclname()))) &&
            ((this.acl6Name==null && other.getAcl6Name()==null) || 
             (this.acl6Name!=null &&
              this.acl6Name.equals(other.getAcl6Name()))) &&
            ((this.connfailover==null && other.getConnfailover()==null) || 
             (this.connfailover!=null &&
              this.connfailover.equals(other.getConnfailover())));
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
        if (getNetmask() != null) {
            _hashCode += getNetmask().hashCode();
        }
        if (getAclname() != null) {
            _hashCode += getAclname().hashCode();
        }
        if (getAcl6Name() != null) {
            _hashCode += getAcl6Name().hashCode();
        }
        if (getConnfailover() != null) {
            _hashCode += getConnfailover().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Forwardingsession.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "forwardingsession"));
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
        elemField.setFieldName("netmask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netmask"));
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
        elemField.setFieldName("acl6Name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acl6name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connfailover");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connfailover"));
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
