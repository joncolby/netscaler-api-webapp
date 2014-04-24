/**
 * Appqoeparameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Appqoeparameter  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt sessionlife;

    private org.apache.axis.types.UnsignedInt avgwaitingclient;

    private org.apache.axis.types.UnsignedInt maxaltrespbandwidth;

    private org.apache.axis.types.UnsignedInt dosattackthresh;

    public Appqoeparameter() {
    }

    public Appqoeparameter(
           org.apache.axis.types.UnsignedInt sessionlife,
           org.apache.axis.types.UnsignedInt avgwaitingclient,
           org.apache.axis.types.UnsignedInt maxaltrespbandwidth,
           org.apache.axis.types.UnsignedInt dosattackthresh) {
           this.sessionlife = sessionlife;
           this.avgwaitingclient = avgwaitingclient;
           this.maxaltrespbandwidth = maxaltrespbandwidth;
           this.dosattackthresh = dosattackthresh;
    }


    /**
     * Gets the sessionlife value for this Appqoeparameter.
     * 
     * @return sessionlife
     */
    public org.apache.axis.types.UnsignedInt getSessionlife() {
        return sessionlife;
    }


    /**
     * Sets the sessionlife value for this Appqoeparameter.
     * 
     * @param sessionlife
     */
    public void setSessionlife(org.apache.axis.types.UnsignedInt sessionlife) {
        this.sessionlife = sessionlife;
    }


    /**
     * Gets the avgwaitingclient value for this Appqoeparameter.
     * 
     * @return avgwaitingclient
     */
    public org.apache.axis.types.UnsignedInt getAvgwaitingclient() {
        return avgwaitingclient;
    }


    /**
     * Sets the avgwaitingclient value for this Appqoeparameter.
     * 
     * @param avgwaitingclient
     */
    public void setAvgwaitingclient(org.apache.axis.types.UnsignedInt avgwaitingclient) {
        this.avgwaitingclient = avgwaitingclient;
    }


    /**
     * Gets the maxaltrespbandwidth value for this Appqoeparameter.
     * 
     * @return maxaltrespbandwidth
     */
    public org.apache.axis.types.UnsignedInt getMaxaltrespbandwidth() {
        return maxaltrespbandwidth;
    }


    /**
     * Sets the maxaltrespbandwidth value for this Appqoeparameter.
     * 
     * @param maxaltrespbandwidth
     */
    public void setMaxaltrespbandwidth(org.apache.axis.types.UnsignedInt maxaltrespbandwidth) {
        this.maxaltrespbandwidth = maxaltrespbandwidth;
    }


    /**
     * Gets the dosattackthresh value for this Appqoeparameter.
     * 
     * @return dosattackthresh
     */
    public org.apache.axis.types.UnsignedInt getDosattackthresh() {
        return dosattackthresh;
    }


    /**
     * Sets the dosattackthresh value for this Appqoeparameter.
     * 
     * @param dosattackthresh
     */
    public void setDosattackthresh(org.apache.axis.types.UnsignedInt dosattackthresh) {
        this.dosattackthresh = dosattackthresh;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Appqoeparameter)) return false;
        Appqoeparameter other = (Appqoeparameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionlife==null && other.getSessionlife()==null) || 
             (this.sessionlife!=null &&
              this.sessionlife.equals(other.getSessionlife()))) &&
            ((this.avgwaitingclient==null && other.getAvgwaitingclient()==null) || 
             (this.avgwaitingclient!=null &&
              this.avgwaitingclient.equals(other.getAvgwaitingclient()))) &&
            ((this.maxaltrespbandwidth==null && other.getMaxaltrespbandwidth()==null) || 
             (this.maxaltrespbandwidth!=null &&
              this.maxaltrespbandwidth.equals(other.getMaxaltrespbandwidth()))) &&
            ((this.dosattackthresh==null && other.getDosattackthresh()==null) || 
             (this.dosattackthresh!=null &&
              this.dosattackthresh.equals(other.getDosattackthresh())));
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
        if (getSessionlife() != null) {
            _hashCode += getSessionlife().hashCode();
        }
        if (getAvgwaitingclient() != null) {
            _hashCode += getAvgwaitingclient().hashCode();
        }
        if (getMaxaltrespbandwidth() != null) {
            _hashCode += getMaxaltrespbandwidth().hashCode();
        }
        if (getDosattackthresh() != null) {
            _hashCode += getDosattackthresh().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Appqoeparameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "appqoeparameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionlife");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionlife"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avgwaitingclient");
        elemField.setXmlName(new javax.xml.namespace.QName("", "avgwaitingclient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxaltrespbandwidth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxaltrespbandwidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dosattackthresh");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dosattackthresh"));
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
