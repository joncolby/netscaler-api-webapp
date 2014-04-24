/**
 * Location.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Location  implements java.io.Serializable {
    private java.lang.String ipfrom;

    private java.lang.String ipto;

    private java.lang.String preferredlocation;

    private java.lang.String q1Label;

    private java.lang.String q2Label;

    private java.lang.String q3Label;

    private java.lang.String q4Label;

    private java.lang.String q5Label;

    private java.lang.String q6Label;

    private int longitude;

    private int latitude;

    public Location() {
    }

    public Location(
           java.lang.String ipfrom,
           java.lang.String ipto,
           java.lang.String preferredlocation,
           java.lang.String q1Label,
           java.lang.String q2Label,
           java.lang.String q3Label,
           java.lang.String q4Label,
           java.lang.String q5Label,
           java.lang.String q6Label,
           int longitude,
           int latitude) {
           this.ipfrom = ipfrom;
           this.ipto = ipto;
           this.preferredlocation = preferredlocation;
           this.q1Label = q1Label;
           this.q2Label = q2Label;
           this.q3Label = q3Label;
           this.q4Label = q4Label;
           this.q5Label = q5Label;
           this.q6Label = q6Label;
           this.longitude = longitude;
           this.latitude = latitude;
    }


    /**
     * Gets the ipfrom value for this Location.
     * 
     * @return ipfrom
     */
    public java.lang.String getIpfrom() {
        return ipfrom;
    }


    /**
     * Sets the ipfrom value for this Location.
     * 
     * @param ipfrom
     */
    public void setIpfrom(java.lang.String ipfrom) {
        this.ipfrom = ipfrom;
    }


    /**
     * Gets the ipto value for this Location.
     * 
     * @return ipto
     */
    public java.lang.String getIpto() {
        return ipto;
    }


    /**
     * Sets the ipto value for this Location.
     * 
     * @param ipto
     */
    public void setIpto(java.lang.String ipto) {
        this.ipto = ipto;
    }


    /**
     * Gets the preferredlocation value for this Location.
     * 
     * @return preferredlocation
     */
    public java.lang.String getPreferredlocation() {
        return preferredlocation;
    }


    /**
     * Sets the preferredlocation value for this Location.
     * 
     * @param preferredlocation
     */
    public void setPreferredlocation(java.lang.String preferredlocation) {
        this.preferredlocation = preferredlocation;
    }


    /**
     * Gets the q1Label value for this Location.
     * 
     * @return q1Label
     */
    public java.lang.String getQ1Label() {
        return q1Label;
    }


    /**
     * Sets the q1Label value for this Location.
     * 
     * @param q1Label
     */
    public void setQ1Label(java.lang.String q1Label) {
        this.q1Label = q1Label;
    }


    /**
     * Gets the q2Label value for this Location.
     * 
     * @return q2Label
     */
    public java.lang.String getQ2Label() {
        return q2Label;
    }


    /**
     * Sets the q2Label value for this Location.
     * 
     * @param q2Label
     */
    public void setQ2Label(java.lang.String q2Label) {
        this.q2Label = q2Label;
    }


    /**
     * Gets the q3Label value for this Location.
     * 
     * @return q3Label
     */
    public java.lang.String getQ3Label() {
        return q3Label;
    }


    /**
     * Sets the q3Label value for this Location.
     * 
     * @param q3Label
     */
    public void setQ3Label(java.lang.String q3Label) {
        this.q3Label = q3Label;
    }


    /**
     * Gets the q4Label value for this Location.
     * 
     * @return q4Label
     */
    public java.lang.String getQ4Label() {
        return q4Label;
    }


    /**
     * Sets the q4Label value for this Location.
     * 
     * @param q4Label
     */
    public void setQ4Label(java.lang.String q4Label) {
        this.q4Label = q4Label;
    }


    /**
     * Gets the q5Label value for this Location.
     * 
     * @return q5Label
     */
    public java.lang.String getQ5Label() {
        return q5Label;
    }


    /**
     * Sets the q5Label value for this Location.
     * 
     * @param q5Label
     */
    public void setQ5Label(java.lang.String q5Label) {
        this.q5Label = q5Label;
    }


    /**
     * Gets the q6Label value for this Location.
     * 
     * @return q6Label
     */
    public java.lang.String getQ6Label() {
        return q6Label;
    }


    /**
     * Sets the q6Label value for this Location.
     * 
     * @param q6Label
     */
    public void setQ6Label(java.lang.String q6Label) {
        this.q6Label = q6Label;
    }


    /**
     * Gets the longitude value for this Location.
     * 
     * @return longitude
     */
    public int getLongitude() {
        return longitude;
    }


    /**
     * Sets the longitude value for this Location.
     * 
     * @param longitude
     */
    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }


    /**
     * Gets the latitude value for this Location.
     * 
     * @return latitude
     */
    public int getLatitude() {
        return latitude;
    }


    /**
     * Sets the latitude value for this Location.
     * 
     * @param latitude
     */
    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Location)) return false;
        Location other = (Location) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ipfrom==null && other.getIpfrom()==null) || 
             (this.ipfrom!=null &&
              this.ipfrom.equals(other.getIpfrom()))) &&
            ((this.ipto==null && other.getIpto()==null) || 
             (this.ipto!=null &&
              this.ipto.equals(other.getIpto()))) &&
            ((this.preferredlocation==null && other.getPreferredlocation()==null) || 
             (this.preferredlocation!=null &&
              this.preferredlocation.equals(other.getPreferredlocation()))) &&
            ((this.q1Label==null && other.getQ1Label()==null) || 
             (this.q1Label!=null &&
              this.q1Label.equals(other.getQ1Label()))) &&
            ((this.q2Label==null && other.getQ2Label()==null) || 
             (this.q2Label!=null &&
              this.q2Label.equals(other.getQ2Label()))) &&
            ((this.q3Label==null && other.getQ3Label()==null) || 
             (this.q3Label!=null &&
              this.q3Label.equals(other.getQ3Label()))) &&
            ((this.q4Label==null && other.getQ4Label()==null) || 
             (this.q4Label!=null &&
              this.q4Label.equals(other.getQ4Label()))) &&
            ((this.q5Label==null && other.getQ5Label()==null) || 
             (this.q5Label!=null &&
              this.q5Label.equals(other.getQ5Label()))) &&
            ((this.q6Label==null && other.getQ6Label()==null) || 
             (this.q6Label!=null &&
              this.q6Label.equals(other.getQ6Label()))) &&
            this.longitude == other.getLongitude() &&
            this.latitude == other.getLatitude();
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
        if (getIpfrom() != null) {
            _hashCode += getIpfrom().hashCode();
        }
        if (getIpto() != null) {
            _hashCode += getIpto().hashCode();
        }
        if (getPreferredlocation() != null) {
            _hashCode += getPreferredlocation().hashCode();
        }
        if (getQ1Label() != null) {
            _hashCode += getQ1Label().hashCode();
        }
        if (getQ2Label() != null) {
            _hashCode += getQ2Label().hashCode();
        }
        if (getQ3Label() != null) {
            _hashCode += getQ3Label().hashCode();
        }
        if (getQ4Label() != null) {
            _hashCode += getQ4Label().hashCode();
        }
        if (getQ5Label() != null) {
            _hashCode += getQ5Label().hashCode();
        }
        if (getQ6Label() != null) {
            _hashCode += getQ6Label().hashCode();
        }
        _hashCode += getLongitude();
        _hashCode += getLatitude();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Location.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "location"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipfrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipfrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredlocation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preferredlocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q1Label");
        elemField.setXmlName(new javax.xml.namespace.QName("", "q1label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q2Label");
        elemField.setXmlName(new javax.xml.namespace.QName("", "q2label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q3Label");
        elemField.setXmlName(new javax.xml.namespace.QName("", "q3label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q4Label");
        elemField.setXmlName(new javax.xml.namespace.QName("", "q4label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q5Label");
        elemField.setXmlName(new javax.xml.namespace.QName("", "q5label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("q6Label");
        elemField.setXmlName(new javax.xml.namespace.QName("", "q6label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "longitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new javax.xml.namespace.QName("", "latitude"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
