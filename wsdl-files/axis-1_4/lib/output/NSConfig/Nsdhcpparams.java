/**
 * Nsdhcpparams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nsdhcpparams  implements java.io.Serializable {
    private java.lang.String dhcpclient;

    private java.lang.String ipaddress;

    private java.lang.String netmask;

    private java.lang.String hostrtgw;

    private boolean running;

    private java.lang.String saveroute;

    public Nsdhcpparams() {
    }

    public Nsdhcpparams(
           java.lang.String dhcpclient,
           java.lang.String ipaddress,
           java.lang.String netmask,
           java.lang.String hostrtgw,
           boolean running,
           java.lang.String saveroute) {
           this.dhcpclient = dhcpclient;
           this.ipaddress = ipaddress;
           this.netmask = netmask;
           this.hostrtgw = hostrtgw;
           this.running = running;
           this.saveroute = saveroute;
    }


    /**
     * Gets the dhcpclient value for this Nsdhcpparams.
     * 
     * @return dhcpclient
     */
    public java.lang.String getDhcpclient() {
        return dhcpclient;
    }


    /**
     * Sets the dhcpclient value for this Nsdhcpparams.
     * 
     * @param dhcpclient
     */
    public void setDhcpclient(java.lang.String dhcpclient) {
        this.dhcpclient = dhcpclient;
    }


    /**
     * Gets the ipaddress value for this Nsdhcpparams.
     * 
     * @return ipaddress
     */
    public java.lang.String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Nsdhcpparams.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the netmask value for this Nsdhcpparams.
     * 
     * @return netmask
     */
    public java.lang.String getNetmask() {
        return netmask;
    }


    /**
     * Sets the netmask value for this Nsdhcpparams.
     * 
     * @param netmask
     */
    public void setNetmask(java.lang.String netmask) {
        this.netmask = netmask;
    }


    /**
     * Gets the hostrtgw value for this Nsdhcpparams.
     * 
     * @return hostrtgw
     */
    public java.lang.String getHostrtgw() {
        return hostrtgw;
    }


    /**
     * Sets the hostrtgw value for this Nsdhcpparams.
     * 
     * @param hostrtgw
     */
    public void setHostrtgw(java.lang.String hostrtgw) {
        this.hostrtgw = hostrtgw;
    }


    /**
     * Gets the running value for this Nsdhcpparams.
     * 
     * @return running
     */
    public boolean isRunning() {
        return running;
    }


    /**
     * Sets the running value for this Nsdhcpparams.
     * 
     * @param running
     */
    public void setRunning(boolean running) {
        this.running = running;
    }


    /**
     * Gets the saveroute value for this Nsdhcpparams.
     * 
     * @return saveroute
     */
    public java.lang.String getSaveroute() {
        return saveroute;
    }


    /**
     * Sets the saveroute value for this Nsdhcpparams.
     * 
     * @param saveroute
     */
    public void setSaveroute(java.lang.String saveroute) {
        this.saveroute = saveroute;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nsdhcpparams)) return false;
        Nsdhcpparams other = (Nsdhcpparams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dhcpclient==null && other.getDhcpclient()==null) || 
             (this.dhcpclient!=null &&
              this.dhcpclient.equals(other.getDhcpclient()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              this.ipaddress.equals(other.getIpaddress()))) &&
            ((this.netmask==null && other.getNetmask()==null) || 
             (this.netmask!=null &&
              this.netmask.equals(other.getNetmask()))) &&
            ((this.hostrtgw==null && other.getHostrtgw()==null) || 
             (this.hostrtgw!=null &&
              this.hostrtgw.equals(other.getHostrtgw()))) &&
            this.running == other.isRunning() &&
            ((this.saveroute==null && other.getSaveroute()==null) || 
             (this.saveroute!=null &&
              this.saveroute.equals(other.getSaveroute())));
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
        if (getDhcpclient() != null) {
            _hashCode += getDhcpclient().hashCode();
        }
        if (getIpaddress() != null) {
            _hashCode += getIpaddress().hashCode();
        }
        if (getNetmask() != null) {
            _hashCode += getNetmask().hashCode();
        }
        if (getHostrtgw() != null) {
            _hashCode += getHostrtgw().hashCode();
        }
        _hashCode += (isRunning() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSaveroute() != null) {
            _hashCode += getSaveroute().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nsdhcpparams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nsdhcpparams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dhcpclient");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dhcpclient"));
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
        elemField.setFieldName("netmask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netmask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hostrtgw");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hostrtgw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("running");
        elemField.setXmlName(new javax.xml.namespace.QName("", "running"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saveroute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "saveroute"));
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
