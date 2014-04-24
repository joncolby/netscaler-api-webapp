/**
 * Ipv6.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Ipv6  implements java.io.Serializable {
    private java.lang.String ralearning;

    private java.lang.String routerredirection;

    private int basereachtime;

    private org.apache.axis.types.UnsignedInt ndbasereachtime;

    private int reachtime;

    private org.apache.axis.types.UnsignedInt ndreachtime;

    private int retransmissiontime;

    private org.apache.axis.types.UnsignedInt ndretransmissiontime;

    private java.lang.String natprefix;

    private java.lang.String dodad;

    public Ipv6() {
    }

    public Ipv6(
           java.lang.String ralearning,
           java.lang.String routerredirection,
           int basereachtime,
           org.apache.axis.types.UnsignedInt ndbasereachtime,
           int reachtime,
           org.apache.axis.types.UnsignedInt ndreachtime,
           int retransmissiontime,
           org.apache.axis.types.UnsignedInt ndretransmissiontime,
           java.lang.String natprefix,
           java.lang.String dodad) {
           this.ralearning = ralearning;
           this.routerredirection = routerredirection;
           this.basereachtime = basereachtime;
           this.ndbasereachtime = ndbasereachtime;
           this.reachtime = reachtime;
           this.ndreachtime = ndreachtime;
           this.retransmissiontime = retransmissiontime;
           this.ndretransmissiontime = ndretransmissiontime;
           this.natprefix = natprefix;
           this.dodad = dodad;
    }


    /**
     * Gets the ralearning value for this Ipv6.
     * 
     * @return ralearning
     */
    public java.lang.String getRalearning() {
        return ralearning;
    }


    /**
     * Sets the ralearning value for this Ipv6.
     * 
     * @param ralearning
     */
    public void setRalearning(java.lang.String ralearning) {
        this.ralearning = ralearning;
    }


    /**
     * Gets the routerredirection value for this Ipv6.
     * 
     * @return routerredirection
     */
    public java.lang.String getRouterredirection() {
        return routerredirection;
    }


    /**
     * Sets the routerredirection value for this Ipv6.
     * 
     * @param routerredirection
     */
    public void setRouterredirection(java.lang.String routerredirection) {
        this.routerredirection = routerredirection;
    }


    /**
     * Gets the basereachtime value for this Ipv6.
     * 
     * @return basereachtime
     */
    public int getBasereachtime() {
        return basereachtime;
    }


    /**
     * Sets the basereachtime value for this Ipv6.
     * 
     * @param basereachtime
     */
    public void setBasereachtime(int basereachtime) {
        this.basereachtime = basereachtime;
    }


    /**
     * Gets the ndbasereachtime value for this Ipv6.
     * 
     * @return ndbasereachtime
     */
    public org.apache.axis.types.UnsignedInt getNdbasereachtime() {
        return ndbasereachtime;
    }


    /**
     * Sets the ndbasereachtime value for this Ipv6.
     * 
     * @param ndbasereachtime
     */
    public void setNdbasereachtime(org.apache.axis.types.UnsignedInt ndbasereachtime) {
        this.ndbasereachtime = ndbasereachtime;
    }


    /**
     * Gets the reachtime value for this Ipv6.
     * 
     * @return reachtime
     */
    public int getReachtime() {
        return reachtime;
    }


    /**
     * Sets the reachtime value for this Ipv6.
     * 
     * @param reachtime
     */
    public void setReachtime(int reachtime) {
        this.reachtime = reachtime;
    }


    /**
     * Gets the ndreachtime value for this Ipv6.
     * 
     * @return ndreachtime
     */
    public org.apache.axis.types.UnsignedInt getNdreachtime() {
        return ndreachtime;
    }


    /**
     * Sets the ndreachtime value for this Ipv6.
     * 
     * @param ndreachtime
     */
    public void setNdreachtime(org.apache.axis.types.UnsignedInt ndreachtime) {
        this.ndreachtime = ndreachtime;
    }


    /**
     * Gets the retransmissiontime value for this Ipv6.
     * 
     * @return retransmissiontime
     */
    public int getRetransmissiontime() {
        return retransmissiontime;
    }


    /**
     * Sets the retransmissiontime value for this Ipv6.
     * 
     * @param retransmissiontime
     */
    public void setRetransmissiontime(int retransmissiontime) {
        this.retransmissiontime = retransmissiontime;
    }


    /**
     * Gets the ndretransmissiontime value for this Ipv6.
     * 
     * @return ndretransmissiontime
     */
    public org.apache.axis.types.UnsignedInt getNdretransmissiontime() {
        return ndretransmissiontime;
    }


    /**
     * Sets the ndretransmissiontime value for this Ipv6.
     * 
     * @param ndretransmissiontime
     */
    public void setNdretransmissiontime(org.apache.axis.types.UnsignedInt ndretransmissiontime) {
        this.ndretransmissiontime = ndretransmissiontime;
    }


    /**
     * Gets the natprefix value for this Ipv6.
     * 
     * @return natprefix
     */
    public java.lang.String getNatprefix() {
        return natprefix;
    }


    /**
     * Sets the natprefix value for this Ipv6.
     * 
     * @param natprefix
     */
    public void setNatprefix(java.lang.String natprefix) {
        this.natprefix = natprefix;
    }


    /**
     * Gets the dodad value for this Ipv6.
     * 
     * @return dodad
     */
    public java.lang.String getDodad() {
        return dodad;
    }


    /**
     * Sets the dodad value for this Ipv6.
     * 
     * @param dodad
     */
    public void setDodad(java.lang.String dodad) {
        this.dodad = dodad;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Ipv6)) return false;
        Ipv6 other = (Ipv6) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ralearning==null && other.getRalearning()==null) || 
             (this.ralearning!=null &&
              this.ralearning.equals(other.getRalearning()))) &&
            ((this.routerredirection==null && other.getRouterredirection()==null) || 
             (this.routerredirection!=null &&
              this.routerredirection.equals(other.getRouterredirection()))) &&
            this.basereachtime == other.getBasereachtime() &&
            ((this.ndbasereachtime==null && other.getNdbasereachtime()==null) || 
             (this.ndbasereachtime!=null &&
              this.ndbasereachtime.equals(other.getNdbasereachtime()))) &&
            this.reachtime == other.getReachtime() &&
            ((this.ndreachtime==null && other.getNdreachtime()==null) || 
             (this.ndreachtime!=null &&
              this.ndreachtime.equals(other.getNdreachtime()))) &&
            this.retransmissiontime == other.getRetransmissiontime() &&
            ((this.ndretransmissiontime==null && other.getNdretransmissiontime()==null) || 
             (this.ndretransmissiontime!=null &&
              this.ndretransmissiontime.equals(other.getNdretransmissiontime()))) &&
            ((this.natprefix==null && other.getNatprefix()==null) || 
             (this.natprefix!=null &&
              this.natprefix.equals(other.getNatprefix()))) &&
            ((this.dodad==null && other.getDodad()==null) || 
             (this.dodad!=null &&
              this.dodad.equals(other.getDodad())));
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
        if (getRalearning() != null) {
            _hashCode += getRalearning().hashCode();
        }
        if (getRouterredirection() != null) {
            _hashCode += getRouterredirection().hashCode();
        }
        _hashCode += getBasereachtime();
        if (getNdbasereachtime() != null) {
            _hashCode += getNdbasereachtime().hashCode();
        }
        _hashCode += getReachtime();
        if (getNdreachtime() != null) {
            _hashCode += getNdreachtime().hashCode();
        }
        _hashCode += getRetransmissiontime();
        if (getNdretransmissiontime() != null) {
            _hashCode += getNdretransmissiontime().hashCode();
        }
        if (getNatprefix() != null) {
            _hashCode += getNatprefix().hashCode();
        }
        if (getDodad() != null) {
            _hashCode += getDodad().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Ipv6.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "ipv6"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ralearning");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ralearning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routerredirection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routerredirection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("basereachtime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "basereachtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ndbasereachtime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ndbasereachtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reachtime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reachtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ndreachtime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ndreachtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retransmissiontime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retransmissiontime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ndretransmissiontime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ndretransmissiontime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("natprefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "natprefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dodad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dodad"));
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
