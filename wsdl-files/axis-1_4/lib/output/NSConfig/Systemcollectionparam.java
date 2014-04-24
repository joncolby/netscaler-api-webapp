/**
 * Systemcollectionparam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Systemcollectionparam  implements java.io.Serializable {
    private java.lang.String communityname;

    private java.lang.String loglevel;

    private java.lang.String datapath;

    public Systemcollectionparam() {
    }

    public Systemcollectionparam(
           java.lang.String communityname,
           java.lang.String loglevel,
           java.lang.String datapath) {
           this.communityname = communityname;
           this.loglevel = loglevel;
           this.datapath = datapath;
    }


    /**
     * Gets the communityname value for this Systemcollectionparam.
     * 
     * @return communityname
     */
    public java.lang.String getCommunityname() {
        return communityname;
    }


    /**
     * Sets the communityname value for this Systemcollectionparam.
     * 
     * @param communityname
     */
    public void setCommunityname(java.lang.String communityname) {
        this.communityname = communityname;
    }


    /**
     * Gets the loglevel value for this Systemcollectionparam.
     * 
     * @return loglevel
     */
    public java.lang.String getLoglevel() {
        return loglevel;
    }


    /**
     * Sets the loglevel value for this Systemcollectionparam.
     * 
     * @param loglevel
     */
    public void setLoglevel(java.lang.String loglevel) {
        this.loglevel = loglevel;
    }


    /**
     * Gets the datapath value for this Systemcollectionparam.
     * 
     * @return datapath
     */
    public java.lang.String getDatapath() {
        return datapath;
    }


    /**
     * Sets the datapath value for this Systemcollectionparam.
     * 
     * @param datapath
     */
    public void setDatapath(java.lang.String datapath) {
        this.datapath = datapath;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Systemcollectionparam)) return false;
        Systemcollectionparam other = (Systemcollectionparam) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.communityname==null && other.getCommunityname()==null) || 
             (this.communityname!=null &&
              this.communityname.equals(other.getCommunityname()))) &&
            ((this.loglevel==null && other.getLoglevel()==null) || 
             (this.loglevel!=null &&
              this.loglevel.equals(other.getLoglevel()))) &&
            ((this.datapath==null && other.getDatapath()==null) || 
             (this.datapath!=null &&
              this.datapath.equals(other.getDatapath())));
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
        if (getCommunityname() != null) {
            _hashCode += getCommunityname().hashCode();
        }
        if (getLoglevel() != null) {
            _hashCode += getLoglevel().hashCode();
        }
        if (getDatapath() != null) {
            _hashCode += getDatapath().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Systemcollectionparam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "systemcollectionparam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communityname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "communityname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loglevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "loglevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datapath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datapath"));
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
