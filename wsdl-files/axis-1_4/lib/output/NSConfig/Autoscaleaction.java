/**
 * Autoscaleaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Autoscaleaction  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String profilename;

    private java.lang.String parameters;

    private org.apache.axis.types.UnsignedInt vmdestroygraceperiod;

    private org.apache.axis.types.UnsignedInt quiettime;

    private java.lang.String vserver;

    public Autoscaleaction() {
    }

    public Autoscaleaction(
           java.lang.String name,
           java.lang.String profilename,
           java.lang.String parameters,
           org.apache.axis.types.UnsignedInt vmdestroygraceperiod,
           org.apache.axis.types.UnsignedInt quiettime,
           java.lang.String vserver) {
           this.name = name;
           this.profilename = profilename;
           this.parameters = parameters;
           this.vmdestroygraceperiod = vmdestroygraceperiod;
           this.quiettime = quiettime;
           this.vserver = vserver;
    }


    /**
     * Gets the name value for this Autoscaleaction.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Autoscaleaction.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the profilename value for this Autoscaleaction.
     * 
     * @return profilename
     */
    public java.lang.String getProfilename() {
        return profilename;
    }


    /**
     * Sets the profilename value for this Autoscaleaction.
     * 
     * @param profilename
     */
    public void setProfilename(java.lang.String profilename) {
        this.profilename = profilename;
    }


    /**
     * Gets the parameters value for this Autoscaleaction.
     * 
     * @return parameters
     */
    public java.lang.String getParameters() {
        return parameters;
    }


    /**
     * Sets the parameters value for this Autoscaleaction.
     * 
     * @param parameters
     */
    public void setParameters(java.lang.String parameters) {
        this.parameters = parameters;
    }


    /**
     * Gets the vmdestroygraceperiod value for this Autoscaleaction.
     * 
     * @return vmdestroygraceperiod
     */
    public org.apache.axis.types.UnsignedInt getVmdestroygraceperiod() {
        return vmdestroygraceperiod;
    }


    /**
     * Sets the vmdestroygraceperiod value for this Autoscaleaction.
     * 
     * @param vmdestroygraceperiod
     */
    public void setVmdestroygraceperiod(org.apache.axis.types.UnsignedInt vmdestroygraceperiod) {
        this.vmdestroygraceperiod = vmdestroygraceperiod;
    }


    /**
     * Gets the quiettime value for this Autoscaleaction.
     * 
     * @return quiettime
     */
    public org.apache.axis.types.UnsignedInt getQuiettime() {
        return quiettime;
    }


    /**
     * Sets the quiettime value for this Autoscaleaction.
     * 
     * @param quiettime
     */
    public void setQuiettime(org.apache.axis.types.UnsignedInt quiettime) {
        this.quiettime = quiettime;
    }


    /**
     * Gets the vserver value for this Autoscaleaction.
     * 
     * @return vserver
     */
    public java.lang.String getVserver() {
        return vserver;
    }


    /**
     * Sets the vserver value for this Autoscaleaction.
     * 
     * @param vserver
     */
    public void setVserver(java.lang.String vserver) {
        this.vserver = vserver;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Autoscaleaction)) return false;
        Autoscaleaction other = (Autoscaleaction) obj;
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
            ((this.profilename==null && other.getProfilename()==null) || 
             (this.profilename!=null &&
              this.profilename.equals(other.getProfilename()))) &&
            ((this.parameters==null && other.getParameters()==null) || 
             (this.parameters!=null &&
              this.parameters.equals(other.getParameters()))) &&
            ((this.vmdestroygraceperiod==null && other.getVmdestroygraceperiod()==null) || 
             (this.vmdestroygraceperiod!=null &&
              this.vmdestroygraceperiod.equals(other.getVmdestroygraceperiod()))) &&
            ((this.quiettime==null && other.getQuiettime()==null) || 
             (this.quiettime!=null &&
              this.quiettime.equals(other.getQuiettime()))) &&
            ((this.vserver==null && other.getVserver()==null) || 
             (this.vserver!=null &&
              this.vserver.equals(other.getVserver())));
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
        if (getProfilename() != null) {
            _hashCode += getProfilename().hashCode();
        }
        if (getParameters() != null) {
            _hashCode += getParameters().hashCode();
        }
        if (getVmdestroygraceperiod() != null) {
            _hashCode += getVmdestroygraceperiod().hashCode();
        }
        if (getQuiettime() != null) {
            _hashCode += getQuiettime().hashCode();
        }
        if (getVserver() != null) {
            _hashCode += getVserver().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Autoscaleaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "autoscaleaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profilename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profilename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "parameters"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vmdestroygraceperiod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vmdestroygraceperiod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quiettime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quiettime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vserver"));
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
