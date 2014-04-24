/**
 * Aaapreauthenticationaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Aaapreauthenticationaction  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String preauthenticationaction;

    private java.lang.String killprocess;

    private java.lang.String deletefiles;

    private java.lang.String builtin;

    public Aaapreauthenticationaction() {
    }

    public Aaapreauthenticationaction(
           java.lang.String name,
           java.lang.String preauthenticationaction,
           java.lang.String killprocess,
           java.lang.String deletefiles,
           java.lang.String builtin) {
           this.name = name;
           this.preauthenticationaction = preauthenticationaction;
           this.killprocess = killprocess;
           this.deletefiles = deletefiles;
           this.builtin = builtin;
    }


    /**
     * Gets the name value for this Aaapreauthenticationaction.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Aaapreauthenticationaction.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the preauthenticationaction value for this Aaapreauthenticationaction.
     * 
     * @return preauthenticationaction
     */
    public java.lang.String getPreauthenticationaction() {
        return preauthenticationaction;
    }


    /**
     * Sets the preauthenticationaction value for this Aaapreauthenticationaction.
     * 
     * @param preauthenticationaction
     */
    public void setPreauthenticationaction(java.lang.String preauthenticationaction) {
        this.preauthenticationaction = preauthenticationaction;
    }


    /**
     * Gets the killprocess value for this Aaapreauthenticationaction.
     * 
     * @return killprocess
     */
    public java.lang.String getKillprocess() {
        return killprocess;
    }


    /**
     * Sets the killprocess value for this Aaapreauthenticationaction.
     * 
     * @param killprocess
     */
    public void setKillprocess(java.lang.String killprocess) {
        this.killprocess = killprocess;
    }


    /**
     * Gets the deletefiles value for this Aaapreauthenticationaction.
     * 
     * @return deletefiles
     */
    public java.lang.String getDeletefiles() {
        return deletefiles;
    }


    /**
     * Sets the deletefiles value for this Aaapreauthenticationaction.
     * 
     * @param deletefiles
     */
    public void setDeletefiles(java.lang.String deletefiles) {
        this.deletefiles = deletefiles;
    }


    /**
     * Gets the builtin value for this Aaapreauthenticationaction.
     * 
     * @return builtin
     */
    public java.lang.String getBuiltin() {
        return builtin;
    }


    /**
     * Sets the builtin value for this Aaapreauthenticationaction.
     * 
     * @param builtin
     */
    public void setBuiltin(java.lang.String builtin) {
        this.builtin = builtin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Aaapreauthenticationaction)) return false;
        Aaapreauthenticationaction other = (Aaapreauthenticationaction) obj;
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
            ((this.preauthenticationaction==null && other.getPreauthenticationaction()==null) || 
             (this.preauthenticationaction!=null &&
              this.preauthenticationaction.equals(other.getPreauthenticationaction()))) &&
            ((this.killprocess==null && other.getKillprocess()==null) || 
             (this.killprocess!=null &&
              this.killprocess.equals(other.getKillprocess()))) &&
            ((this.deletefiles==null && other.getDeletefiles()==null) || 
             (this.deletefiles!=null &&
              this.deletefiles.equals(other.getDeletefiles()))) &&
            ((this.builtin==null && other.getBuiltin()==null) || 
             (this.builtin!=null &&
              this.builtin.equals(other.getBuiltin())));
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
        if (getPreauthenticationaction() != null) {
            _hashCode += getPreauthenticationaction().hashCode();
        }
        if (getKillprocess() != null) {
            _hashCode += getKillprocess().hashCode();
        }
        if (getDeletefiles() != null) {
            _hashCode += getDeletefiles().hashCode();
        }
        if (getBuiltin() != null) {
            _hashCode += getBuiltin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Aaapreauthenticationaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "aaapreauthenticationaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preauthenticationaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preauthenticationaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("killprocess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "killprocess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deletefiles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deletefiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builtin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "builtin"));
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
