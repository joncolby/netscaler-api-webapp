/**
 * Nsevents.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nsevents  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt eventno;

    private org.apache.axis.types.UnsignedInt time;

    private org.apache.axis.types.UnsignedInt eventcode;

    private org.apache.axis.types.UnsignedInt devid;

    private java.lang.String devname;

    private java.lang.String text;

    private org.apache.axis.types.UnsignedInt data0;

    private org.apache.axis.types.UnsignedInt data1;

    private org.apache.axis.types.UnsignedInt data2;

    private org.apache.axis.types.UnsignedInt data3;

    public Nsevents() {
    }

    public Nsevents(
           org.apache.axis.types.UnsignedInt eventno,
           org.apache.axis.types.UnsignedInt time,
           org.apache.axis.types.UnsignedInt eventcode,
           org.apache.axis.types.UnsignedInt devid,
           java.lang.String devname,
           java.lang.String text,
           org.apache.axis.types.UnsignedInt data0,
           org.apache.axis.types.UnsignedInt data1,
           org.apache.axis.types.UnsignedInt data2,
           org.apache.axis.types.UnsignedInt data3) {
           this.eventno = eventno;
           this.time = time;
           this.eventcode = eventcode;
           this.devid = devid;
           this.devname = devname;
           this.text = text;
           this.data0 = data0;
           this.data1 = data1;
           this.data2 = data2;
           this.data3 = data3;
    }


    /**
     * Gets the eventno value for this Nsevents.
     * 
     * @return eventno
     */
    public org.apache.axis.types.UnsignedInt getEventno() {
        return eventno;
    }


    /**
     * Sets the eventno value for this Nsevents.
     * 
     * @param eventno
     */
    public void setEventno(org.apache.axis.types.UnsignedInt eventno) {
        this.eventno = eventno;
    }


    /**
     * Gets the time value for this Nsevents.
     * 
     * @return time
     */
    public org.apache.axis.types.UnsignedInt getTime() {
        return time;
    }


    /**
     * Sets the time value for this Nsevents.
     * 
     * @param time
     */
    public void setTime(org.apache.axis.types.UnsignedInt time) {
        this.time = time;
    }


    /**
     * Gets the eventcode value for this Nsevents.
     * 
     * @return eventcode
     */
    public org.apache.axis.types.UnsignedInt getEventcode() {
        return eventcode;
    }


    /**
     * Sets the eventcode value for this Nsevents.
     * 
     * @param eventcode
     */
    public void setEventcode(org.apache.axis.types.UnsignedInt eventcode) {
        this.eventcode = eventcode;
    }


    /**
     * Gets the devid value for this Nsevents.
     * 
     * @return devid
     */
    public org.apache.axis.types.UnsignedInt getDevid() {
        return devid;
    }


    /**
     * Sets the devid value for this Nsevents.
     * 
     * @param devid
     */
    public void setDevid(org.apache.axis.types.UnsignedInt devid) {
        this.devid = devid;
    }


    /**
     * Gets the devname value for this Nsevents.
     * 
     * @return devname
     */
    public java.lang.String getDevname() {
        return devname;
    }


    /**
     * Sets the devname value for this Nsevents.
     * 
     * @param devname
     */
    public void setDevname(java.lang.String devname) {
        this.devname = devname;
    }


    /**
     * Gets the text value for this Nsevents.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this Nsevents.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the data0 value for this Nsevents.
     * 
     * @return data0
     */
    public org.apache.axis.types.UnsignedInt getData0() {
        return data0;
    }


    /**
     * Sets the data0 value for this Nsevents.
     * 
     * @param data0
     */
    public void setData0(org.apache.axis.types.UnsignedInt data0) {
        this.data0 = data0;
    }


    /**
     * Gets the data1 value for this Nsevents.
     * 
     * @return data1
     */
    public org.apache.axis.types.UnsignedInt getData1() {
        return data1;
    }


    /**
     * Sets the data1 value for this Nsevents.
     * 
     * @param data1
     */
    public void setData1(org.apache.axis.types.UnsignedInt data1) {
        this.data1 = data1;
    }


    /**
     * Gets the data2 value for this Nsevents.
     * 
     * @return data2
     */
    public org.apache.axis.types.UnsignedInt getData2() {
        return data2;
    }


    /**
     * Sets the data2 value for this Nsevents.
     * 
     * @param data2
     */
    public void setData2(org.apache.axis.types.UnsignedInt data2) {
        this.data2 = data2;
    }


    /**
     * Gets the data3 value for this Nsevents.
     * 
     * @return data3
     */
    public org.apache.axis.types.UnsignedInt getData3() {
        return data3;
    }


    /**
     * Sets the data3 value for this Nsevents.
     * 
     * @param data3
     */
    public void setData3(org.apache.axis.types.UnsignedInt data3) {
        this.data3 = data3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nsevents)) return false;
        Nsevents other = (Nsevents) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.eventno==null && other.getEventno()==null) || 
             (this.eventno!=null &&
              this.eventno.equals(other.getEventno()))) &&
            ((this.time==null && other.getTime()==null) || 
             (this.time!=null &&
              this.time.equals(other.getTime()))) &&
            ((this.eventcode==null && other.getEventcode()==null) || 
             (this.eventcode!=null &&
              this.eventcode.equals(other.getEventcode()))) &&
            ((this.devid==null && other.getDevid()==null) || 
             (this.devid!=null &&
              this.devid.equals(other.getDevid()))) &&
            ((this.devname==null && other.getDevname()==null) || 
             (this.devname!=null &&
              this.devname.equals(other.getDevname()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            ((this.data0==null && other.getData0()==null) || 
             (this.data0!=null &&
              this.data0.equals(other.getData0()))) &&
            ((this.data1==null && other.getData1()==null) || 
             (this.data1!=null &&
              this.data1.equals(other.getData1()))) &&
            ((this.data2==null && other.getData2()==null) || 
             (this.data2!=null &&
              this.data2.equals(other.getData2()))) &&
            ((this.data3==null && other.getData3()==null) || 
             (this.data3!=null &&
              this.data3.equals(other.getData3())));
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
        if (getEventno() != null) {
            _hashCode += getEventno().hashCode();
        }
        if (getTime() != null) {
            _hashCode += getTime().hashCode();
        }
        if (getEventcode() != null) {
            _hashCode += getEventcode().hashCode();
        }
        if (getDevid() != null) {
            _hashCode += getDevid().hashCode();
        }
        if (getDevname() != null) {
            _hashCode += getDevname().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        if (getData0() != null) {
            _hashCode += getData0().hashCode();
        }
        if (getData1() != null) {
            _hashCode += getData1().hashCode();
        }
        if (getData2() != null) {
            _hashCode += getData2().hashCode();
        }
        if (getData3() != null) {
            _hashCode += getData3().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nsevents.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nsevents"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eventcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "devid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("devname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "devname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("", "text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data0");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data0"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data3"));
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
