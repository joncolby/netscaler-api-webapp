/**
 * Streamidentifier.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Streamidentifier  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String selectorname;

    private java.lang.String[] rule;

    private org.apache.axis.types.UnsignedInt interval;

    private org.apache.axis.types.UnsignedInt samplecount;

    private java.lang.String sort;

    private java.lang.String[] session;

    public Streamidentifier() {
    }

    public Streamidentifier(
           java.lang.String name,
           java.lang.String selectorname,
           java.lang.String[] rule,
           org.apache.axis.types.UnsignedInt interval,
           org.apache.axis.types.UnsignedInt samplecount,
           java.lang.String sort,
           java.lang.String[] session) {
           this.name = name;
           this.selectorname = selectorname;
           this.rule = rule;
           this.interval = interval;
           this.samplecount = samplecount;
           this.sort = sort;
           this.session = session;
    }


    /**
     * Gets the name value for this Streamidentifier.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Streamidentifier.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the selectorname value for this Streamidentifier.
     * 
     * @return selectorname
     */
    public java.lang.String getSelectorname() {
        return selectorname;
    }


    /**
     * Sets the selectorname value for this Streamidentifier.
     * 
     * @param selectorname
     */
    public void setSelectorname(java.lang.String selectorname) {
        this.selectorname = selectorname;
    }


    /**
     * Gets the rule value for this Streamidentifier.
     * 
     * @return rule
     */
    public java.lang.String[] getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this Streamidentifier.
     * 
     * @param rule
     */
    public void setRule(java.lang.String[] rule) {
        this.rule = rule;
    }


    /**
     * Gets the interval value for this Streamidentifier.
     * 
     * @return interval
     */
    public org.apache.axis.types.UnsignedInt getInterval() {
        return interval;
    }


    /**
     * Sets the interval value for this Streamidentifier.
     * 
     * @param interval
     */
    public void setInterval(org.apache.axis.types.UnsignedInt interval) {
        this.interval = interval;
    }


    /**
     * Gets the samplecount value for this Streamidentifier.
     * 
     * @return samplecount
     */
    public org.apache.axis.types.UnsignedInt getSamplecount() {
        return samplecount;
    }


    /**
     * Sets the samplecount value for this Streamidentifier.
     * 
     * @param samplecount
     */
    public void setSamplecount(org.apache.axis.types.UnsignedInt samplecount) {
        this.samplecount = samplecount;
    }


    /**
     * Gets the sort value for this Streamidentifier.
     * 
     * @return sort
     */
    public java.lang.String getSort() {
        return sort;
    }


    /**
     * Sets the sort value for this Streamidentifier.
     * 
     * @param sort
     */
    public void setSort(java.lang.String sort) {
        this.sort = sort;
    }


    /**
     * Gets the session value for this Streamidentifier.
     * 
     * @return session
     */
    public java.lang.String[] getSession() {
        return session;
    }


    /**
     * Sets the session value for this Streamidentifier.
     * 
     * @param session
     */
    public void setSession(java.lang.String[] session) {
        this.session = session;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Streamidentifier)) return false;
        Streamidentifier other = (Streamidentifier) obj;
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
            ((this.selectorname==null && other.getSelectorname()==null) || 
             (this.selectorname!=null &&
              this.selectorname.equals(other.getSelectorname()))) &&
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              java.util.Arrays.equals(this.rule, other.getRule()))) &&
            ((this.interval==null && other.getInterval()==null) || 
             (this.interval!=null &&
              this.interval.equals(other.getInterval()))) &&
            ((this.samplecount==null && other.getSamplecount()==null) || 
             (this.samplecount!=null &&
              this.samplecount.equals(other.getSamplecount()))) &&
            ((this.sort==null && other.getSort()==null) || 
             (this.sort!=null &&
              this.sort.equals(other.getSort()))) &&
            ((this.session==null && other.getSession()==null) || 
             (this.session!=null &&
              java.util.Arrays.equals(this.session, other.getSession())));
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
        if (getSelectorname() != null) {
            _hashCode += getSelectorname().hashCode();
        }
        if (getRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInterval() != null) {
            _hashCode += getInterval().hashCode();
        }
        if (getSamplecount() != null) {
            _hashCode += getSamplecount().hashCode();
        }
        if (getSort() != null) {
            _hashCode += getSort().hashCode();
        }
        if (getSession() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSession());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSession(), i);
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
        new org.apache.axis.description.TypeDesc(Streamidentifier.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "streamidentifier"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectorname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selectorname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samplecount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "samplecount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("session");
        elemField.setXmlName(new javax.xml.namespace.QName("", "session"));
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
