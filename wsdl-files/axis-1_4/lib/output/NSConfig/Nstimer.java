/**
 * Nstimer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nstimer  implements java.io.Serializable {
    private java.lang.String name;

    private int interval;

    private java.lang.String unit;

    private java.lang.String comment;

    private java.lang.String[] policyname;

    private org.apache.axis.types.UnsignedInt[] priority;

    private java.lang.String[] gotopriorityexpression;

    private java.lang.String[] vserver;

    private org.apache.axis.types.UnsignedInt[] samplesize;

    private org.apache.axis.types.UnsignedInt[] threshold;

    public Nstimer() {
    }

    public Nstimer(
           java.lang.String name,
           int interval,
           java.lang.String unit,
           java.lang.String comment,
           java.lang.String[] policyname,
           org.apache.axis.types.UnsignedInt[] priority,
           java.lang.String[] gotopriorityexpression,
           java.lang.String[] vserver,
           org.apache.axis.types.UnsignedInt[] samplesize,
           org.apache.axis.types.UnsignedInt[] threshold) {
           this.name = name;
           this.interval = interval;
           this.unit = unit;
           this.comment = comment;
           this.policyname = policyname;
           this.priority = priority;
           this.gotopriorityexpression = gotopriorityexpression;
           this.vserver = vserver;
           this.samplesize = samplesize;
           this.threshold = threshold;
    }


    /**
     * Gets the name value for this Nstimer.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Nstimer.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the interval value for this Nstimer.
     * 
     * @return interval
     */
    public int getInterval() {
        return interval;
    }


    /**
     * Sets the interval value for this Nstimer.
     * 
     * @param interval
     */
    public void setInterval(int interval) {
        this.interval = interval;
    }


    /**
     * Gets the unit value for this Nstimer.
     * 
     * @return unit
     */
    public java.lang.String getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this Nstimer.
     * 
     * @param unit
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }


    /**
     * Gets the comment value for this Nstimer.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Nstimer.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the policyname value for this Nstimer.
     * 
     * @return policyname
     */
    public java.lang.String[] getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Nstimer.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String[] policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the priority value for this Nstimer.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt[] getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Nstimer.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt[] priority) {
        this.priority = priority;
    }


    /**
     * Gets the gotopriorityexpression value for this Nstimer.
     * 
     * @return gotopriorityexpression
     */
    public java.lang.String[] getGotopriorityexpression() {
        return gotopriorityexpression;
    }


    /**
     * Sets the gotopriorityexpression value for this Nstimer.
     * 
     * @param gotopriorityexpression
     */
    public void setGotopriorityexpression(java.lang.String[] gotopriorityexpression) {
        this.gotopriorityexpression = gotopriorityexpression;
    }


    /**
     * Gets the vserver value for this Nstimer.
     * 
     * @return vserver
     */
    public java.lang.String[] getVserver() {
        return vserver;
    }


    /**
     * Sets the vserver value for this Nstimer.
     * 
     * @param vserver
     */
    public void setVserver(java.lang.String[] vserver) {
        this.vserver = vserver;
    }


    /**
     * Gets the samplesize value for this Nstimer.
     * 
     * @return samplesize
     */
    public org.apache.axis.types.UnsignedInt[] getSamplesize() {
        return samplesize;
    }


    /**
     * Sets the samplesize value for this Nstimer.
     * 
     * @param samplesize
     */
    public void setSamplesize(org.apache.axis.types.UnsignedInt[] samplesize) {
        this.samplesize = samplesize;
    }


    /**
     * Gets the threshold value for this Nstimer.
     * 
     * @return threshold
     */
    public org.apache.axis.types.UnsignedInt[] getThreshold() {
        return threshold;
    }


    /**
     * Sets the threshold value for this Nstimer.
     * 
     * @param threshold
     */
    public void setThreshold(org.apache.axis.types.UnsignedInt[] threshold) {
        this.threshold = threshold;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nstimer)) return false;
        Nstimer other = (Nstimer) obj;
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
            this.interval == other.getInterval() &&
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.policyname==null && other.getPolicyname()==null) || 
             (this.policyname!=null &&
              java.util.Arrays.equals(this.policyname, other.getPolicyname()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              java.util.Arrays.equals(this.priority, other.getPriority()))) &&
            ((this.gotopriorityexpression==null && other.getGotopriorityexpression()==null) || 
             (this.gotopriorityexpression!=null &&
              java.util.Arrays.equals(this.gotopriorityexpression, other.getGotopriorityexpression()))) &&
            ((this.vserver==null && other.getVserver()==null) || 
             (this.vserver!=null &&
              java.util.Arrays.equals(this.vserver, other.getVserver()))) &&
            ((this.samplesize==null && other.getSamplesize()==null) || 
             (this.samplesize!=null &&
              java.util.Arrays.equals(this.samplesize, other.getSamplesize()))) &&
            ((this.threshold==null && other.getThreshold()==null) || 
             (this.threshold!=null &&
              java.util.Arrays.equals(this.threshold, other.getThreshold())));
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
        _hashCode += getInterval();
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getPolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGotopriorityexpression() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGotopriorityexpression());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGotopriorityexpression(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getVserver() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVserver());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVserver(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSamplesize() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSamplesize());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSamplesize(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThreshold() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThreshold());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThreshold(), i);
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
        new org.apache.axis.description.TypeDesc(Nstimer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nstimer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gotopriorityexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gotopriorityexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("samplesize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "samplesize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "threshold"));
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
