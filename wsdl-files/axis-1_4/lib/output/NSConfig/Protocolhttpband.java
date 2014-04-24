/**
 * Protocolhttpband.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Protocolhttpband  implements java.io.Serializable {
    private java.lang.String type;

    private int bandrange;

    private org.apache.axis.types.UnsignedLong[] totalbandsize;

    private org.apache.axis.types.UnsignedLong[] avgbandsize;

    private org.apache.axis.types.UnsignedLong[] banddata;

    private org.apache.axis.types.UnsignedLong[] accesscount;

    private org.apache.axis.types.UnsignedLong[] accessratio;

    public Protocolhttpband() {
    }

    public Protocolhttpband(
           java.lang.String type,
           int bandrange,
           org.apache.axis.types.UnsignedLong[] totalbandsize,
           org.apache.axis.types.UnsignedLong[] avgbandsize,
           org.apache.axis.types.UnsignedLong[] banddata,
           org.apache.axis.types.UnsignedLong[] accesscount,
           org.apache.axis.types.UnsignedLong[] accessratio) {
           this.type = type;
           this.bandrange = bandrange;
           this.totalbandsize = totalbandsize;
           this.avgbandsize = avgbandsize;
           this.banddata = banddata;
           this.accesscount = accesscount;
           this.accessratio = accessratio;
    }


    /**
     * Gets the type value for this Protocolhttpband.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Protocolhttpband.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the bandrange value for this Protocolhttpband.
     * 
     * @return bandrange
     */
    public int getBandrange() {
        return bandrange;
    }


    /**
     * Sets the bandrange value for this Protocolhttpband.
     * 
     * @param bandrange
     */
    public void setBandrange(int bandrange) {
        this.bandrange = bandrange;
    }


    /**
     * Gets the totalbandsize value for this Protocolhttpband.
     * 
     * @return totalbandsize
     */
    public org.apache.axis.types.UnsignedLong[] getTotalbandsize() {
        return totalbandsize;
    }


    /**
     * Sets the totalbandsize value for this Protocolhttpband.
     * 
     * @param totalbandsize
     */
    public void setTotalbandsize(org.apache.axis.types.UnsignedLong[] totalbandsize) {
        this.totalbandsize = totalbandsize;
    }


    /**
     * Gets the avgbandsize value for this Protocolhttpband.
     * 
     * @return avgbandsize
     */
    public org.apache.axis.types.UnsignedLong[] getAvgbandsize() {
        return avgbandsize;
    }


    /**
     * Sets the avgbandsize value for this Protocolhttpband.
     * 
     * @param avgbandsize
     */
    public void setAvgbandsize(org.apache.axis.types.UnsignedLong[] avgbandsize) {
        this.avgbandsize = avgbandsize;
    }


    /**
     * Gets the banddata value for this Protocolhttpband.
     * 
     * @return banddata
     */
    public org.apache.axis.types.UnsignedLong[] getBanddata() {
        return banddata;
    }


    /**
     * Sets the banddata value for this Protocolhttpband.
     * 
     * @param banddata
     */
    public void setBanddata(org.apache.axis.types.UnsignedLong[] banddata) {
        this.banddata = banddata;
    }


    /**
     * Gets the accesscount value for this Protocolhttpband.
     * 
     * @return accesscount
     */
    public org.apache.axis.types.UnsignedLong[] getAccesscount() {
        return accesscount;
    }


    /**
     * Sets the accesscount value for this Protocolhttpband.
     * 
     * @param accesscount
     */
    public void setAccesscount(org.apache.axis.types.UnsignedLong[] accesscount) {
        this.accesscount = accesscount;
    }


    /**
     * Gets the accessratio value for this Protocolhttpband.
     * 
     * @return accessratio
     */
    public org.apache.axis.types.UnsignedLong[] getAccessratio() {
        return accessratio;
    }


    /**
     * Sets the accessratio value for this Protocolhttpband.
     * 
     * @param accessratio
     */
    public void setAccessratio(org.apache.axis.types.UnsignedLong[] accessratio) {
        this.accessratio = accessratio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Protocolhttpband)) return false;
        Protocolhttpband other = (Protocolhttpband) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.bandrange == other.getBandrange() &&
            ((this.totalbandsize==null && other.getTotalbandsize()==null) || 
             (this.totalbandsize!=null &&
              java.util.Arrays.equals(this.totalbandsize, other.getTotalbandsize()))) &&
            ((this.avgbandsize==null && other.getAvgbandsize()==null) || 
             (this.avgbandsize!=null &&
              java.util.Arrays.equals(this.avgbandsize, other.getAvgbandsize()))) &&
            ((this.banddata==null && other.getBanddata()==null) || 
             (this.banddata!=null &&
              java.util.Arrays.equals(this.banddata, other.getBanddata()))) &&
            ((this.accesscount==null && other.getAccesscount()==null) || 
             (this.accesscount!=null &&
              java.util.Arrays.equals(this.accesscount, other.getAccesscount()))) &&
            ((this.accessratio==null && other.getAccessratio()==null) || 
             (this.accessratio!=null &&
              java.util.Arrays.equals(this.accessratio, other.getAccessratio())));
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += getBandrange();
        if (getTotalbandsize() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTotalbandsize());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTotalbandsize(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvgbandsize() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvgbandsize());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvgbandsize(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBanddata() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBanddata());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBanddata(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccesscount() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccesscount());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccesscount(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccessratio() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccessratio());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccessratio(), i);
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
        new org.apache.axis.description.TypeDesc(Protocolhttpband.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "protocolhttpband"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bandrange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bandrange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalbandsize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalbandsize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avgbandsize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "avgbandsize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("banddata");
        elemField.setXmlName(new javax.xml.namespace.QName("", "banddata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accesscount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accesscount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessratio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accessratio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
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
