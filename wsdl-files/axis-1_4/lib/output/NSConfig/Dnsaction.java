/**
 * Dnsaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Dnsaction  implements java.io.Serializable {
    private java.lang.String actionname;

    private java.lang.String actiontype;

    private org.apache.axis.types.UnsignedInt ttl;

    private java.lang.String[] ipaddress;

    private java.lang.String viewname;

    private java.lang.String[] preferredloclist;

    private java.lang.String drop;

    private java.lang.String cachebypass;

    private java.lang.String builtin;

    public Dnsaction() {
    }

    public Dnsaction(
           java.lang.String actionname,
           java.lang.String actiontype,
           org.apache.axis.types.UnsignedInt ttl,
           java.lang.String[] ipaddress,
           java.lang.String viewname,
           java.lang.String[] preferredloclist,
           java.lang.String drop,
           java.lang.String cachebypass,
           java.lang.String builtin) {
           this.actionname = actionname;
           this.actiontype = actiontype;
           this.ttl = ttl;
           this.ipaddress = ipaddress;
           this.viewname = viewname;
           this.preferredloclist = preferredloclist;
           this.drop = drop;
           this.cachebypass = cachebypass;
           this.builtin = builtin;
    }


    /**
     * Gets the actionname value for this Dnsaction.
     * 
     * @return actionname
     */
    public java.lang.String getActionname() {
        return actionname;
    }


    /**
     * Sets the actionname value for this Dnsaction.
     * 
     * @param actionname
     */
    public void setActionname(java.lang.String actionname) {
        this.actionname = actionname;
    }


    /**
     * Gets the actiontype value for this Dnsaction.
     * 
     * @return actiontype
     */
    public java.lang.String getActiontype() {
        return actiontype;
    }


    /**
     * Sets the actiontype value for this Dnsaction.
     * 
     * @param actiontype
     */
    public void setActiontype(java.lang.String actiontype) {
        this.actiontype = actiontype;
    }


    /**
     * Gets the ttl value for this Dnsaction.
     * 
     * @return ttl
     */
    public org.apache.axis.types.UnsignedInt getTtl() {
        return ttl;
    }


    /**
     * Sets the ttl value for this Dnsaction.
     * 
     * @param ttl
     */
    public void setTtl(org.apache.axis.types.UnsignedInt ttl) {
        this.ttl = ttl;
    }


    /**
     * Gets the ipaddress value for this Dnsaction.
     * 
     * @return ipaddress
     */
    public java.lang.String[] getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Dnsaction.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String[] ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the viewname value for this Dnsaction.
     * 
     * @return viewname
     */
    public java.lang.String getViewname() {
        return viewname;
    }


    /**
     * Sets the viewname value for this Dnsaction.
     * 
     * @param viewname
     */
    public void setViewname(java.lang.String viewname) {
        this.viewname = viewname;
    }


    /**
     * Gets the preferredloclist value for this Dnsaction.
     * 
     * @return preferredloclist
     */
    public java.lang.String[] getPreferredloclist() {
        return preferredloclist;
    }


    /**
     * Sets the preferredloclist value for this Dnsaction.
     * 
     * @param preferredloclist
     */
    public void setPreferredloclist(java.lang.String[] preferredloclist) {
        this.preferredloclist = preferredloclist;
    }


    /**
     * Gets the drop value for this Dnsaction.
     * 
     * @return drop
     */
    public java.lang.String getDrop() {
        return drop;
    }


    /**
     * Sets the drop value for this Dnsaction.
     * 
     * @param drop
     */
    public void setDrop(java.lang.String drop) {
        this.drop = drop;
    }


    /**
     * Gets the cachebypass value for this Dnsaction.
     * 
     * @return cachebypass
     */
    public java.lang.String getCachebypass() {
        return cachebypass;
    }


    /**
     * Sets the cachebypass value for this Dnsaction.
     * 
     * @param cachebypass
     */
    public void setCachebypass(java.lang.String cachebypass) {
        this.cachebypass = cachebypass;
    }


    /**
     * Gets the builtin value for this Dnsaction.
     * 
     * @return builtin
     */
    public java.lang.String getBuiltin() {
        return builtin;
    }


    /**
     * Sets the builtin value for this Dnsaction.
     * 
     * @param builtin
     */
    public void setBuiltin(java.lang.String builtin) {
        this.builtin = builtin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Dnsaction)) return false;
        Dnsaction other = (Dnsaction) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actionname==null && other.getActionname()==null) || 
             (this.actionname!=null &&
              this.actionname.equals(other.getActionname()))) &&
            ((this.actiontype==null && other.getActiontype()==null) || 
             (this.actiontype!=null &&
              this.actiontype.equals(other.getActiontype()))) &&
            ((this.ttl==null && other.getTtl()==null) || 
             (this.ttl!=null &&
              this.ttl.equals(other.getTtl()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              java.util.Arrays.equals(this.ipaddress, other.getIpaddress()))) &&
            ((this.viewname==null && other.getViewname()==null) || 
             (this.viewname!=null &&
              this.viewname.equals(other.getViewname()))) &&
            ((this.preferredloclist==null && other.getPreferredloclist()==null) || 
             (this.preferredloclist!=null &&
              java.util.Arrays.equals(this.preferredloclist, other.getPreferredloclist()))) &&
            ((this.drop==null && other.getDrop()==null) || 
             (this.drop!=null &&
              this.drop.equals(other.getDrop()))) &&
            ((this.cachebypass==null && other.getCachebypass()==null) || 
             (this.cachebypass!=null &&
              this.cachebypass.equals(other.getCachebypass()))) &&
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
        if (getActionname() != null) {
            _hashCode += getActionname().hashCode();
        }
        if (getActiontype() != null) {
            _hashCode += getActiontype().hashCode();
        }
        if (getTtl() != null) {
            _hashCode += getTtl().hashCode();
        }
        if (getIpaddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpaddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpaddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getViewname() != null) {
            _hashCode += getViewname().hashCode();
        }
        if (getPreferredloclist() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPreferredloclist());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPreferredloclist(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDrop() != null) {
            _hashCode += getDrop().hashCode();
        }
        if (getCachebypass() != null) {
            _hashCode += getCachebypass().hashCode();
        }
        if (getBuiltin() != null) {
            _hashCode += getBuiltin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Dnsaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "dnsaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actiontype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actiontype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ttl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ttl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipaddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viewname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferredloclist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preferredloclist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("drop");
        elemField.setXmlName(new javax.xml.namespace.QName("", "drop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachebypass");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachebypass"));
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
