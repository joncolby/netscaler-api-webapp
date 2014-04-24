/**
 * Nstimeout.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nstimeout  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt zombie;

    private org.apache.axis.types.UnsignedInt client;

    private org.apache.axis.types.UnsignedInt server;

    private org.apache.axis.types.UnsignedInt httpclient;

    private org.apache.axis.types.UnsignedInt httpserver;

    private org.apache.axis.types.UnsignedInt tcpclient;

    private org.apache.axis.types.UnsignedInt tcpserver;

    private org.apache.axis.types.UnsignedInt anyclient;

    private org.apache.axis.types.UnsignedInt anyserver;

    private org.apache.axis.types.UnsignedInt halfclose;

    private org.apache.axis.types.UnsignedInt nontcpzombie;

    private org.apache.axis.types.UnsignedInt reducedfintimeout;

    private org.apache.axis.types.UnsignedInt newconnidletimeout;

    public Nstimeout() {
    }

    public Nstimeout(
           org.apache.axis.types.UnsignedInt zombie,
           org.apache.axis.types.UnsignedInt client,
           org.apache.axis.types.UnsignedInt server,
           org.apache.axis.types.UnsignedInt httpclient,
           org.apache.axis.types.UnsignedInt httpserver,
           org.apache.axis.types.UnsignedInt tcpclient,
           org.apache.axis.types.UnsignedInt tcpserver,
           org.apache.axis.types.UnsignedInt anyclient,
           org.apache.axis.types.UnsignedInt anyserver,
           org.apache.axis.types.UnsignedInt halfclose,
           org.apache.axis.types.UnsignedInt nontcpzombie,
           org.apache.axis.types.UnsignedInt reducedfintimeout,
           org.apache.axis.types.UnsignedInt newconnidletimeout) {
           this.zombie = zombie;
           this.client = client;
           this.server = server;
           this.httpclient = httpclient;
           this.httpserver = httpserver;
           this.tcpclient = tcpclient;
           this.tcpserver = tcpserver;
           this.anyclient = anyclient;
           this.anyserver = anyserver;
           this.halfclose = halfclose;
           this.nontcpzombie = nontcpzombie;
           this.reducedfintimeout = reducedfintimeout;
           this.newconnidletimeout = newconnidletimeout;
    }


    /**
     * Gets the zombie value for this Nstimeout.
     * 
     * @return zombie
     */
    public org.apache.axis.types.UnsignedInt getZombie() {
        return zombie;
    }


    /**
     * Sets the zombie value for this Nstimeout.
     * 
     * @param zombie
     */
    public void setZombie(org.apache.axis.types.UnsignedInt zombie) {
        this.zombie = zombie;
    }


    /**
     * Gets the client value for this Nstimeout.
     * 
     * @return client
     */
    public org.apache.axis.types.UnsignedInt getClient() {
        return client;
    }


    /**
     * Sets the client value for this Nstimeout.
     * 
     * @param client
     */
    public void setClient(org.apache.axis.types.UnsignedInt client) {
        this.client = client;
    }


    /**
     * Gets the server value for this Nstimeout.
     * 
     * @return server
     */
    public org.apache.axis.types.UnsignedInt getServer() {
        return server;
    }


    /**
     * Sets the server value for this Nstimeout.
     * 
     * @param server
     */
    public void setServer(org.apache.axis.types.UnsignedInt server) {
        this.server = server;
    }


    /**
     * Gets the httpclient value for this Nstimeout.
     * 
     * @return httpclient
     */
    public org.apache.axis.types.UnsignedInt getHttpclient() {
        return httpclient;
    }


    /**
     * Sets the httpclient value for this Nstimeout.
     * 
     * @param httpclient
     */
    public void setHttpclient(org.apache.axis.types.UnsignedInt httpclient) {
        this.httpclient = httpclient;
    }


    /**
     * Gets the httpserver value for this Nstimeout.
     * 
     * @return httpserver
     */
    public org.apache.axis.types.UnsignedInt getHttpserver() {
        return httpserver;
    }


    /**
     * Sets the httpserver value for this Nstimeout.
     * 
     * @param httpserver
     */
    public void setHttpserver(org.apache.axis.types.UnsignedInt httpserver) {
        this.httpserver = httpserver;
    }


    /**
     * Gets the tcpclient value for this Nstimeout.
     * 
     * @return tcpclient
     */
    public org.apache.axis.types.UnsignedInt getTcpclient() {
        return tcpclient;
    }


    /**
     * Sets the tcpclient value for this Nstimeout.
     * 
     * @param tcpclient
     */
    public void setTcpclient(org.apache.axis.types.UnsignedInt tcpclient) {
        this.tcpclient = tcpclient;
    }


    /**
     * Gets the tcpserver value for this Nstimeout.
     * 
     * @return tcpserver
     */
    public org.apache.axis.types.UnsignedInt getTcpserver() {
        return tcpserver;
    }


    /**
     * Sets the tcpserver value for this Nstimeout.
     * 
     * @param tcpserver
     */
    public void setTcpserver(org.apache.axis.types.UnsignedInt tcpserver) {
        this.tcpserver = tcpserver;
    }


    /**
     * Gets the anyclient value for this Nstimeout.
     * 
     * @return anyclient
     */
    public org.apache.axis.types.UnsignedInt getAnyclient() {
        return anyclient;
    }


    /**
     * Sets the anyclient value for this Nstimeout.
     * 
     * @param anyclient
     */
    public void setAnyclient(org.apache.axis.types.UnsignedInt anyclient) {
        this.anyclient = anyclient;
    }


    /**
     * Gets the anyserver value for this Nstimeout.
     * 
     * @return anyserver
     */
    public org.apache.axis.types.UnsignedInt getAnyserver() {
        return anyserver;
    }


    /**
     * Sets the anyserver value for this Nstimeout.
     * 
     * @param anyserver
     */
    public void setAnyserver(org.apache.axis.types.UnsignedInt anyserver) {
        this.anyserver = anyserver;
    }


    /**
     * Gets the halfclose value for this Nstimeout.
     * 
     * @return halfclose
     */
    public org.apache.axis.types.UnsignedInt getHalfclose() {
        return halfclose;
    }


    /**
     * Sets the halfclose value for this Nstimeout.
     * 
     * @param halfclose
     */
    public void setHalfclose(org.apache.axis.types.UnsignedInt halfclose) {
        this.halfclose = halfclose;
    }


    /**
     * Gets the nontcpzombie value for this Nstimeout.
     * 
     * @return nontcpzombie
     */
    public org.apache.axis.types.UnsignedInt getNontcpzombie() {
        return nontcpzombie;
    }


    /**
     * Sets the nontcpzombie value for this Nstimeout.
     * 
     * @param nontcpzombie
     */
    public void setNontcpzombie(org.apache.axis.types.UnsignedInt nontcpzombie) {
        this.nontcpzombie = nontcpzombie;
    }


    /**
     * Gets the reducedfintimeout value for this Nstimeout.
     * 
     * @return reducedfintimeout
     */
    public org.apache.axis.types.UnsignedInt getReducedfintimeout() {
        return reducedfintimeout;
    }


    /**
     * Sets the reducedfintimeout value for this Nstimeout.
     * 
     * @param reducedfintimeout
     */
    public void setReducedfintimeout(org.apache.axis.types.UnsignedInt reducedfintimeout) {
        this.reducedfintimeout = reducedfintimeout;
    }


    /**
     * Gets the newconnidletimeout value for this Nstimeout.
     * 
     * @return newconnidletimeout
     */
    public org.apache.axis.types.UnsignedInt getNewconnidletimeout() {
        return newconnidletimeout;
    }


    /**
     * Sets the newconnidletimeout value for this Nstimeout.
     * 
     * @param newconnidletimeout
     */
    public void setNewconnidletimeout(org.apache.axis.types.UnsignedInt newconnidletimeout) {
        this.newconnidletimeout = newconnidletimeout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nstimeout)) return false;
        Nstimeout other = (Nstimeout) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.zombie==null && other.getZombie()==null) || 
             (this.zombie!=null &&
              this.zombie.equals(other.getZombie()))) &&
            ((this.client==null && other.getClient()==null) || 
             (this.client!=null &&
              this.client.equals(other.getClient()))) &&
            ((this.server==null && other.getServer()==null) || 
             (this.server!=null &&
              this.server.equals(other.getServer()))) &&
            ((this.httpclient==null && other.getHttpclient()==null) || 
             (this.httpclient!=null &&
              this.httpclient.equals(other.getHttpclient()))) &&
            ((this.httpserver==null && other.getHttpserver()==null) || 
             (this.httpserver!=null &&
              this.httpserver.equals(other.getHttpserver()))) &&
            ((this.tcpclient==null && other.getTcpclient()==null) || 
             (this.tcpclient!=null &&
              this.tcpclient.equals(other.getTcpclient()))) &&
            ((this.tcpserver==null && other.getTcpserver()==null) || 
             (this.tcpserver!=null &&
              this.tcpserver.equals(other.getTcpserver()))) &&
            ((this.anyclient==null && other.getAnyclient()==null) || 
             (this.anyclient!=null &&
              this.anyclient.equals(other.getAnyclient()))) &&
            ((this.anyserver==null && other.getAnyserver()==null) || 
             (this.anyserver!=null &&
              this.anyserver.equals(other.getAnyserver()))) &&
            ((this.halfclose==null && other.getHalfclose()==null) || 
             (this.halfclose!=null &&
              this.halfclose.equals(other.getHalfclose()))) &&
            ((this.nontcpzombie==null && other.getNontcpzombie()==null) || 
             (this.nontcpzombie!=null &&
              this.nontcpzombie.equals(other.getNontcpzombie()))) &&
            ((this.reducedfintimeout==null && other.getReducedfintimeout()==null) || 
             (this.reducedfintimeout!=null &&
              this.reducedfintimeout.equals(other.getReducedfintimeout()))) &&
            ((this.newconnidletimeout==null && other.getNewconnidletimeout()==null) || 
             (this.newconnidletimeout!=null &&
              this.newconnidletimeout.equals(other.getNewconnidletimeout())));
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
        if (getZombie() != null) {
            _hashCode += getZombie().hashCode();
        }
        if (getClient() != null) {
            _hashCode += getClient().hashCode();
        }
        if (getServer() != null) {
            _hashCode += getServer().hashCode();
        }
        if (getHttpclient() != null) {
            _hashCode += getHttpclient().hashCode();
        }
        if (getHttpserver() != null) {
            _hashCode += getHttpserver().hashCode();
        }
        if (getTcpclient() != null) {
            _hashCode += getTcpclient().hashCode();
        }
        if (getTcpserver() != null) {
            _hashCode += getTcpserver().hashCode();
        }
        if (getAnyclient() != null) {
            _hashCode += getAnyclient().hashCode();
        }
        if (getAnyserver() != null) {
            _hashCode += getAnyserver().hashCode();
        }
        if (getHalfclose() != null) {
            _hashCode += getHalfclose().hashCode();
        }
        if (getNontcpzombie() != null) {
            _hashCode += getNontcpzombie().hashCode();
        }
        if (getReducedfintimeout() != null) {
            _hashCode += getReducedfintimeout().hashCode();
        }
        if (getNewconnidletimeout() != null) {
            _hashCode += getNewconnidletimeout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nstimeout.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nstimeout"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zombie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zombie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client");
        elemField.setXmlName(new javax.xml.namespace.QName("", "client"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("server");
        elemField.setXmlName(new javax.xml.namespace.QName("", "server"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpclient");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpclient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcpclient");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tcpclient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcpserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tcpserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anyclient");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anyclient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anyserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "anyserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("halfclose");
        elemField.setXmlName(new javax.xml.namespace.QName("", "halfclose"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nontcpzombie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nontcpzombie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reducedfintimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reducedfintimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newconnidletimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newconnidletimeout"));
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
