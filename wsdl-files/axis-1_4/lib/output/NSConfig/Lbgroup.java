/**
 * Lbgroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Lbgroup  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String[] vservername;

    private java.lang.String persistencetype;

    private java.lang.String persistencebackup;

    private org.apache.axis.types.UnsignedInt backuppersistencetimeout;

    private java.lang.String persistmask;

    private org.apache.axis.types.UnsignedInt v6Persistmasklen;

    private java.lang.String cookiename;

    private java.lang.String cookiedomain;

    private org.apache.axis.types.UnsignedInt timeout;

    private java.lang.String rule;

    public Lbgroup() {
    }

    public Lbgroup(
           java.lang.String name,
           java.lang.String[] vservername,
           java.lang.String persistencetype,
           java.lang.String persistencebackup,
           org.apache.axis.types.UnsignedInt backuppersistencetimeout,
           java.lang.String persistmask,
           org.apache.axis.types.UnsignedInt v6Persistmasklen,
           java.lang.String cookiename,
           java.lang.String cookiedomain,
           org.apache.axis.types.UnsignedInt timeout,
           java.lang.String rule) {
           this.name = name;
           this.vservername = vservername;
           this.persistencetype = persistencetype;
           this.persistencebackup = persistencebackup;
           this.backuppersistencetimeout = backuppersistencetimeout;
           this.persistmask = persistmask;
           this.v6Persistmasklen = v6Persistmasklen;
           this.cookiename = cookiename;
           this.cookiedomain = cookiedomain;
           this.timeout = timeout;
           this.rule = rule;
    }


    /**
     * Gets the name value for this Lbgroup.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Lbgroup.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the vservername value for this Lbgroup.
     * 
     * @return vservername
     */
    public java.lang.String[] getVservername() {
        return vservername;
    }


    /**
     * Sets the vservername value for this Lbgroup.
     * 
     * @param vservername
     */
    public void setVservername(java.lang.String[] vservername) {
        this.vservername = vservername;
    }


    /**
     * Gets the persistencetype value for this Lbgroup.
     * 
     * @return persistencetype
     */
    public java.lang.String getPersistencetype() {
        return persistencetype;
    }


    /**
     * Sets the persistencetype value for this Lbgroup.
     * 
     * @param persistencetype
     */
    public void setPersistencetype(java.lang.String persistencetype) {
        this.persistencetype = persistencetype;
    }


    /**
     * Gets the persistencebackup value for this Lbgroup.
     * 
     * @return persistencebackup
     */
    public java.lang.String getPersistencebackup() {
        return persistencebackup;
    }


    /**
     * Sets the persistencebackup value for this Lbgroup.
     * 
     * @param persistencebackup
     */
    public void setPersistencebackup(java.lang.String persistencebackup) {
        this.persistencebackup = persistencebackup;
    }


    /**
     * Gets the backuppersistencetimeout value for this Lbgroup.
     * 
     * @return backuppersistencetimeout
     */
    public org.apache.axis.types.UnsignedInt getBackuppersistencetimeout() {
        return backuppersistencetimeout;
    }


    /**
     * Sets the backuppersistencetimeout value for this Lbgroup.
     * 
     * @param backuppersistencetimeout
     */
    public void setBackuppersistencetimeout(org.apache.axis.types.UnsignedInt backuppersistencetimeout) {
        this.backuppersistencetimeout = backuppersistencetimeout;
    }


    /**
     * Gets the persistmask value for this Lbgroup.
     * 
     * @return persistmask
     */
    public java.lang.String getPersistmask() {
        return persistmask;
    }


    /**
     * Sets the persistmask value for this Lbgroup.
     * 
     * @param persistmask
     */
    public void setPersistmask(java.lang.String persistmask) {
        this.persistmask = persistmask;
    }


    /**
     * Gets the v6Persistmasklen value for this Lbgroup.
     * 
     * @return v6Persistmasklen
     */
    public org.apache.axis.types.UnsignedInt getV6Persistmasklen() {
        return v6Persistmasklen;
    }


    /**
     * Sets the v6Persistmasklen value for this Lbgroup.
     * 
     * @param v6Persistmasklen
     */
    public void setV6Persistmasklen(org.apache.axis.types.UnsignedInt v6Persistmasklen) {
        this.v6Persistmasklen = v6Persistmasklen;
    }


    /**
     * Gets the cookiename value for this Lbgroup.
     * 
     * @return cookiename
     */
    public java.lang.String getCookiename() {
        return cookiename;
    }


    /**
     * Sets the cookiename value for this Lbgroup.
     * 
     * @param cookiename
     */
    public void setCookiename(java.lang.String cookiename) {
        this.cookiename = cookiename;
    }


    /**
     * Gets the cookiedomain value for this Lbgroup.
     * 
     * @return cookiedomain
     */
    public java.lang.String getCookiedomain() {
        return cookiedomain;
    }


    /**
     * Sets the cookiedomain value for this Lbgroup.
     * 
     * @param cookiedomain
     */
    public void setCookiedomain(java.lang.String cookiedomain) {
        this.cookiedomain = cookiedomain;
    }


    /**
     * Gets the timeout value for this Lbgroup.
     * 
     * @return timeout
     */
    public org.apache.axis.types.UnsignedInt getTimeout() {
        return timeout;
    }


    /**
     * Sets the timeout value for this Lbgroup.
     * 
     * @param timeout
     */
    public void setTimeout(org.apache.axis.types.UnsignedInt timeout) {
        this.timeout = timeout;
    }


    /**
     * Gets the rule value for this Lbgroup.
     * 
     * @return rule
     */
    public java.lang.String getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this Lbgroup.
     * 
     * @param rule
     */
    public void setRule(java.lang.String rule) {
        this.rule = rule;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Lbgroup)) return false;
        Lbgroup other = (Lbgroup) obj;
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
            ((this.vservername==null && other.getVservername()==null) || 
             (this.vservername!=null &&
              java.util.Arrays.equals(this.vservername, other.getVservername()))) &&
            ((this.persistencetype==null && other.getPersistencetype()==null) || 
             (this.persistencetype!=null &&
              this.persistencetype.equals(other.getPersistencetype()))) &&
            ((this.persistencebackup==null && other.getPersistencebackup()==null) || 
             (this.persistencebackup!=null &&
              this.persistencebackup.equals(other.getPersistencebackup()))) &&
            ((this.backuppersistencetimeout==null && other.getBackuppersistencetimeout()==null) || 
             (this.backuppersistencetimeout!=null &&
              this.backuppersistencetimeout.equals(other.getBackuppersistencetimeout()))) &&
            ((this.persistmask==null && other.getPersistmask()==null) || 
             (this.persistmask!=null &&
              this.persistmask.equals(other.getPersistmask()))) &&
            ((this.v6Persistmasklen==null && other.getV6Persistmasklen()==null) || 
             (this.v6Persistmasklen!=null &&
              this.v6Persistmasklen.equals(other.getV6Persistmasklen()))) &&
            ((this.cookiename==null && other.getCookiename()==null) || 
             (this.cookiename!=null &&
              this.cookiename.equals(other.getCookiename()))) &&
            ((this.cookiedomain==null && other.getCookiedomain()==null) || 
             (this.cookiedomain!=null &&
              this.cookiedomain.equals(other.getCookiedomain()))) &&
            ((this.timeout==null && other.getTimeout()==null) || 
             (this.timeout!=null &&
              this.timeout.equals(other.getTimeout()))) &&
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              this.rule.equals(other.getRule())));
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
        if (getVservername() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVservername());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVservername(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPersistencetype() != null) {
            _hashCode += getPersistencetype().hashCode();
        }
        if (getPersistencebackup() != null) {
            _hashCode += getPersistencebackup().hashCode();
        }
        if (getBackuppersistencetimeout() != null) {
            _hashCode += getBackuppersistencetimeout().hashCode();
        }
        if (getPersistmask() != null) {
            _hashCode += getPersistmask().hashCode();
        }
        if (getV6Persistmasklen() != null) {
            _hashCode += getV6Persistmasklen().hashCode();
        }
        if (getCookiename() != null) {
            _hashCode += getCookiename().hashCode();
        }
        if (getCookiedomain() != null) {
            _hashCode += getCookiedomain().hashCode();
        }
        if (getTimeout() != null) {
            _hashCode += getTimeout().hashCode();
        }
        if (getRule() != null) {
            _hashCode += getRule().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Lbgroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "lbgroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vservername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vservername"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persistencetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "persistencetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persistencebackup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "persistencebackup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backuppersistencetimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backuppersistencetimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persistmask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "persistmask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("v6Persistmasklen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "v6persistmasklen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cookiename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cookiename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cookiedomain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cookiedomain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rule"));
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
