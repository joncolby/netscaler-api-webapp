/**
 * Vpnintranetapplication.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Vpnintranetapplication  implements java.io.Serializable {
    private java.lang.String intranetapplication;

    private java.lang.String protocol;

    private java.lang.String destip;

    private java.lang.String netmask;

    private java.lang.String ipaddress;

    private java.lang.String hostname;

    private java.lang.String destport;

    private java.lang.String[] clientapplication;

    private java.lang.String spoofiip;

    private java.lang.String interception;

    private java.lang.String srcip;

    private org.apache.axis.types.UnsignedInt srcport;

    public Vpnintranetapplication() {
    }

    public Vpnintranetapplication(
           java.lang.String intranetapplication,
           java.lang.String protocol,
           java.lang.String destip,
           java.lang.String netmask,
           java.lang.String ipaddress,
           java.lang.String hostname,
           java.lang.String destport,
           java.lang.String[] clientapplication,
           java.lang.String spoofiip,
           java.lang.String interception,
           java.lang.String srcip,
           org.apache.axis.types.UnsignedInt srcport) {
           this.intranetapplication = intranetapplication;
           this.protocol = protocol;
           this.destip = destip;
           this.netmask = netmask;
           this.ipaddress = ipaddress;
           this.hostname = hostname;
           this.destport = destport;
           this.clientapplication = clientapplication;
           this.spoofiip = spoofiip;
           this.interception = interception;
           this.srcip = srcip;
           this.srcport = srcport;
    }


    /**
     * Gets the intranetapplication value for this Vpnintranetapplication.
     * 
     * @return intranetapplication
     */
    public java.lang.String getIntranetapplication() {
        return intranetapplication;
    }


    /**
     * Sets the intranetapplication value for this Vpnintranetapplication.
     * 
     * @param intranetapplication
     */
    public void setIntranetapplication(java.lang.String intranetapplication) {
        this.intranetapplication = intranetapplication;
    }


    /**
     * Gets the protocol value for this Vpnintranetapplication.
     * 
     * @return protocol
     */
    public java.lang.String getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this Vpnintranetapplication.
     * 
     * @param protocol
     */
    public void setProtocol(java.lang.String protocol) {
        this.protocol = protocol;
    }


    /**
     * Gets the destip value for this Vpnintranetapplication.
     * 
     * @return destip
     */
    public java.lang.String getDestip() {
        return destip;
    }


    /**
     * Sets the destip value for this Vpnintranetapplication.
     * 
     * @param destip
     */
    public void setDestip(java.lang.String destip) {
        this.destip = destip;
    }


    /**
     * Gets the netmask value for this Vpnintranetapplication.
     * 
     * @return netmask
     */
    public java.lang.String getNetmask() {
        return netmask;
    }


    /**
     * Sets the netmask value for this Vpnintranetapplication.
     * 
     * @param netmask
     */
    public void setNetmask(java.lang.String netmask) {
        this.netmask = netmask;
    }


    /**
     * Gets the ipaddress value for this Vpnintranetapplication.
     * 
     * @return ipaddress
     */
    public java.lang.String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Vpnintranetapplication.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the hostname value for this Vpnintranetapplication.
     * 
     * @return hostname
     */
    public java.lang.String getHostname() {
        return hostname;
    }


    /**
     * Sets the hostname value for this Vpnintranetapplication.
     * 
     * @param hostname
     */
    public void setHostname(java.lang.String hostname) {
        this.hostname = hostname;
    }


    /**
     * Gets the destport value for this Vpnintranetapplication.
     * 
     * @return destport
     */
    public java.lang.String getDestport() {
        return destport;
    }


    /**
     * Sets the destport value for this Vpnintranetapplication.
     * 
     * @param destport
     */
    public void setDestport(java.lang.String destport) {
        this.destport = destport;
    }


    /**
     * Gets the clientapplication value for this Vpnintranetapplication.
     * 
     * @return clientapplication
     */
    public java.lang.String[] getClientapplication() {
        return clientapplication;
    }


    /**
     * Sets the clientapplication value for this Vpnintranetapplication.
     * 
     * @param clientapplication
     */
    public void setClientapplication(java.lang.String[] clientapplication) {
        this.clientapplication = clientapplication;
    }


    /**
     * Gets the spoofiip value for this Vpnintranetapplication.
     * 
     * @return spoofiip
     */
    public java.lang.String getSpoofiip() {
        return spoofiip;
    }


    /**
     * Sets the spoofiip value for this Vpnintranetapplication.
     * 
     * @param spoofiip
     */
    public void setSpoofiip(java.lang.String spoofiip) {
        this.spoofiip = spoofiip;
    }


    /**
     * Gets the interception value for this Vpnintranetapplication.
     * 
     * @return interception
     */
    public java.lang.String getInterception() {
        return interception;
    }


    /**
     * Sets the interception value for this Vpnintranetapplication.
     * 
     * @param interception
     */
    public void setInterception(java.lang.String interception) {
        this.interception = interception;
    }


    /**
     * Gets the srcip value for this Vpnintranetapplication.
     * 
     * @return srcip
     */
    public java.lang.String getSrcip() {
        return srcip;
    }


    /**
     * Sets the srcip value for this Vpnintranetapplication.
     * 
     * @param srcip
     */
    public void setSrcip(java.lang.String srcip) {
        this.srcip = srcip;
    }


    /**
     * Gets the srcport value for this Vpnintranetapplication.
     * 
     * @return srcport
     */
    public org.apache.axis.types.UnsignedInt getSrcport() {
        return srcport;
    }


    /**
     * Sets the srcport value for this Vpnintranetapplication.
     * 
     * @param srcport
     */
    public void setSrcport(org.apache.axis.types.UnsignedInt srcport) {
        this.srcport = srcport;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Vpnintranetapplication)) return false;
        Vpnintranetapplication other = (Vpnintranetapplication) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.intranetapplication==null && other.getIntranetapplication()==null) || 
             (this.intranetapplication!=null &&
              this.intranetapplication.equals(other.getIntranetapplication()))) &&
            ((this.protocol==null && other.getProtocol()==null) || 
             (this.protocol!=null &&
              this.protocol.equals(other.getProtocol()))) &&
            ((this.destip==null && other.getDestip()==null) || 
             (this.destip!=null &&
              this.destip.equals(other.getDestip()))) &&
            ((this.netmask==null && other.getNetmask()==null) || 
             (this.netmask!=null &&
              this.netmask.equals(other.getNetmask()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              this.ipaddress.equals(other.getIpaddress()))) &&
            ((this.hostname==null && other.getHostname()==null) || 
             (this.hostname!=null &&
              this.hostname.equals(other.getHostname()))) &&
            ((this.destport==null && other.getDestport()==null) || 
             (this.destport!=null &&
              this.destport.equals(other.getDestport()))) &&
            ((this.clientapplication==null && other.getClientapplication()==null) || 
             (this.clientapplication!=null &&
              java.util.Arrays.equals(this.clientapplication, other.getClientapplication()))) &&
            ((this.spoofiip==null && other.getSpoofiip()==null) || 
             (this.spoofiip!=null &&
              this.spoofiip.equals(other.getSpoofiip()))) &&
            ((this.interception==null && other.getInterception()==null) || 
             (this.interception!=null &&
              this.interception.equals(other.getInterception()))) &&
            ((this.srcip==null && other.getSrcip()==null) || 
             (this.srcip!=null &&
              this.srcip.equals(other.getSrcip()))) &&
            ((this.srcport==null && other.getSrcport()==null) || 
             (this.srcport!=null &&
              this.srcport.equals(other.getSrcport())));
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
        if (getIntranetapplication() != null) {
            _hashCode += getIntranetapplication().hashCode();
        }
        if (getProtocol() != null) {
            _hashCode += getProtocol().hashCode();
        }
        if (getDestip() != null) {
            _hashCode += getDestip().hashCode();
        }
        if (getNetmask() != null) {
            _hashCode += getNetmask().hashCode();
        }
        if (getIpaddress() != null) {
            _hashCode += getIpaddress().hashCode();
        }
        if (getHostname() != null) {
            _hashCode += getHostname().hashCode();
        }
        if (getDestport() != null) {
            _hashCode += getDestport().hashCode();
        }
        if (getClientapplication() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClientapplication());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClientapplication(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSpoofiip() != null) {
            _hashCode += getSpoofiip().hashCode();
        }
        if (getInterception() != null) {
            _hashCode += getInterception().hashCode();
        }
        if (getSrcip() != null) {
            _hashCode += getSrcip().hashCode();
        }
        if (getSrcport() != null) {
            _hashCode += getSrcport().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Vpnintranetapplication.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "vpnintranetapplication"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intranetapplication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "intranetapplication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destip"));
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
        elemField.setFieldName("ipaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipaddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientapplication");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientapplication"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spoofiip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spoofiip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interception");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interception"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srcip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srcport"));
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
