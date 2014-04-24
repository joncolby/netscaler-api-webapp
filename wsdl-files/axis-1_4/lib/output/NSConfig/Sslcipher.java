/**
 * Sslcipher.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Sslcipher  implements java.io.Serializable {
    private java.lang.String ciphergroupname;

    private java.lang.String[] description;

    private java.lang.String[] ciphername;

    private java.lang.String[] individualciphername;

    private java.lang.String[] individualcipherdesc;

    public Sslcipher() {
    }

    public Sslcipher(
           java.lang.String ciphergroupname,
           java.lang.String[] description,
           java.lang.String[] ciphername,
           java.lang.String[] individualciphername,
           java.lang.String[] individualcipherdesc) {
           this.ciphergroupname = ciphergroupname;
           this.description = description;
           this.ciphername = ciphername;
           this.individualciphername = individualciphername;
           this.individualcipherdesc = individualcipherdesc;
    }


    /**
     * Gets the ciphergroupname value for this Sslcipher.
     * 
     * @return ciphergroupname
     */
    public java.lang.String getCiphergroupname() {
        return ciphergroupname;
    }


    /**
     * Sets the ciphergroupname value for this Sslcipher.
     * 
     * @param ciphergroupname
     */
    public void setCiphergroupname(java.lang.String ciphergroupname) {
        this.ciphergroupname = ciphergroupname;
    }


    /**
     * Gets the description value for this Sslcipher.
     * 
     * @return description
     */
    public java.lang.String[] getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Sslcipher.
     * 
     * @param description
     */
    public void setDescription(java.lang.String[] description) {
        this.description = description;
    }


    /**
     * Gets the ciphername value for this Sslcipher.
     * 
     * @return ciphername
     */
    public java.lang.String[] getCiphername() {
        return ciphername;
    }


    /**
     * Sets the ciphername value for this Sslcipher.
     * 
     * @param ciphername
     */
    public void setCiphername(java.lang.String[] ciphername) {
        this.ciphername = ciphername;
    }


    /**
     * Gets the individualciphername value for this Sslcipher.
     * 
     * @return individualciphername
     */
    public java.lang.String[] getIndividualciphername() {
        return individualciphername;
    }


    /**
     * Sets the individualciphername value for this Sslcipher.
     * 
     * @param individualciphername
     */
    public void setIndividualciphername(java.lang.String[] individualciphername) {
        this.individualciphername = individualciphername;
    }


    /**
     * Gets the individualcipherdesc value for this Sslcipher.
     * 
     * @return individualcipherdesc
     */
    public java.lang.String[] getIndividualcipherdesc() {
        return individualcipherdesc;
    }


    /**
     * Sets the individualcipherdesc value for this Sslcipher.
     * 
     * @param individualcipherdesc
     */
    public void setIndividualcipherdesc(java.lang.String[] individualcipherdesc) {
        this.individualcipherdesc = individualcipherdesc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sslcipher)) return false;
        Sslcipher other = (Sslcipher) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ciphergroupname==null && other.getCiphergroupname()==null) || 
             (this.ciphergroupname!=null &&
              this.ciphergroupname.equals(other.getCiphergroupname()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              java.util.Arrays.equals(this.description, other.getDescription()))) &&
            ((this.ciphername==null && other.getCiphername()==null) || 
             (this.ciphername!=null &&
              java.util.Arrays.equals(this.ciphername, other.getCiphername()))) &&
            ((this.individualciphername==null && other.getIndividualciphername()==null) || 
             (this.individualciphername!=null &&
              java.util.Arrays.equals(this.individualciphername, other.getIndividualciphername()))) &&
            ((this.individualcipherdesc==null && other.getIndividualcipherdesc()==null) || 
             (this.individualcipherdesc!=null &&
              java.util.Arrays.equals(this.individualcipherdesc, other.getIndividualcipherdesc())));
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
        if (getCiphergroupname() != null) {
            _hashCode += getCiphergroupname().hashCode();
        }
        if (getDescription() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescription());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescription(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCiphername() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCiphername());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCiphername(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIndividualciphername() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIndividualciphername());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIndividualciphername(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIndividualcipherdesc() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIndividualcipherdesc());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIndividualcipherdesc(), i);
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
        new org.apache.axis.description.TypeDesc(Sslcipher.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "sslcipher"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ciphergroupname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ciphergroupname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ciphername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ciphername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("individualciphername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "individualciphername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("individualcipherdesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "individualcipherdesc"));
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
