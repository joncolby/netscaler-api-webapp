/**
 * Appqoeaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Appqoeaction  implements java.io.Serializable {
    private java.lang.String name;

    private org.apache.axis.types.UnsignedLong hits;

    private java.lang.String priority;

    private java.lang.String respondwith;

    private org.apache.axis.types.UnsignedInt polqdepth;

    private org.apache.axis.types.UnsignedInt priqdepth;

    private java.lang.String altcontentsvcname;

    private java.lang.String altcontentpath;

    private org.apache.axis.types.UnsignedInt maxconn;

    private org.apache.axis.types.UnsignedInt delay;

    private java.lang.String customfile;

    private java.lang.String dostrigexpression;

    private java.lang.String dosaction;

    public Appqoeaction() {
    }

    public Appqoeaction(
           java.lang.String name,
           org.apache.axis.types.UnsignedLong hits,
           java.lang.String priority,
           java.lang.String respondwith,
           org.apache.axis.types.UnsignedInt polqdepth,
           org.apache.axis.types.UnsignedInt priqdepth,
           java.lang.String altcontentsvcname,
           java.lang.String altcontentpath,
           org.apache.axis.types.UnsignedInt maxconn,
           org.apache.axis.types.UnsignedInt delay,
           java.lang.String customfile,
           java.lang.String dostrigexpression,
           java.lang.String dosaction) {
           this.name = name;
           this.hits = hits;
           this.priority = priority;
           this.respondwith = respondwith;
           this.polqdepth = polqdepth;
           this.priqdepth = priqdepth;
           this.altcontentsvcname = altcontentsvcname;
           this.altcontentpath = altcontentpath;
           this.maxconn = maxconn;
           this.delay = delay;
           this.customfile = customfile;
           this.dostrigexpression = dostrigexpression;
           this.dosaction = dosaction;
    }


    /**
     * Gets the name value for this Appqoeaction.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Appqoeaction.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the hits value for this Appqoeaction.
     * 
     * @return hits
     */
    public org.apache.axis.types.UnsignedLong getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this Appqoeaction.
     * 
     * @param hits
     */
    public void setHits(org.apache.axis.types.UnsignedLong hits) {
        this.hits = hits;
    }


    /**
     * Gets the priority value for this Appqoeaction.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Appqoeaction.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the respondwith value for this Appqoeaction.
     * 
     * @return respondwith
     */
    public java.lang.String getRespondwith() {
        return respondwith;
    }


    /**
     * Sets the respondwith value for this Appqoeaction.
     * 
     * @param respondwith
     */
    public void setRespondwith(java.lang.String respondwith) {
        this.respondwith = respondwith;
    }


    /**
     * Gets the polqdepth value for this Appqoeaction.
     * 
     * @return polqdepth
     */
    public org.apache.axis.types.UnsignedInt getPolqdepth() {
        return polqdepth;
    }


    /**
     * Sets the polqdepth value for this Appqoeaction.
     * 
     * @param polqdepth
     */
    public void setPolqdepth(org.apache.axis.types.UnsignedInt polqdepth) {
        this.polqdepth = polqdepth;
    }


    /**
     * Gets the priqdepth value for this Appqoeaction.
     * 
     * @return priqdepth
     */
    public org.apache.axis.types.UnsignedInt getPriqdepth() {
        return priqdepth;
    }


    /**
     * Sets the priqdepth value for this Appqoeaction.
     * 
     * @param priqdepth
     */
    public void setPriqdepth(org.apache.axis.types.UnsignedInt priqdepth) {
        this.priqdepth = priqdepth;
    }


    /**
     * Gets the altcontentsvcname value for this Appqoeaction.
     * 
     * @return altcontentsvcname
     */
    public java.lang.String getAltcontentsvcname() {
        return altcontentsvcname;
    }


    /**
     * Sets the altcontentsvcname value for this Appqoeaction.
     * 
     * @param altcontentsvcname
     */
    public void setAltcontentsvcname(java.lang.String altcontentsvcname) {
        this.altcontentsvcname = altcontentsvcname;
    }


    /**
     * Gets the altcontentpath value for this Appqoeaction.
     * 
     * @return altcontentpath
     */
    public java.lang.String getAltcontentpath() {
        return altcontentpath;
    }


    /**
     * Sets the altcontentpath value for this Appqoeaction.
     * 
     * @param altcontentpath
     */
    public void setAltcontentpath(java.lang.String altcontentpath) {
        this.altcontentpath = altcontentpath;
    }


    /**
     * Gets the maxconn value for this Appqoeaction.
     * 
     * @return maxconn
     */
    public org.apache.axis.types.UnsignedInt getMaxconn() {
        return maxconn;
    }


    /**
     * Sets the maxconn value for this Appqoeaction.
     * 
     * @param maxconn
     */
    public void setMaxconn(org.apache.axis.types.UnsignedInt maxconn) {
        this.maxconn = maxconn;
    }


    /**
     * Gets the delay value for this Appqoeaction.
     * 
     * @return delay
     */
    public org.apache.axis.types.UnsignedInt getDelay() {
        return delay;
    }


    /**
     * Sets the delay value for this Appqoeaction.
     * 
     * @param delay
     */
    public void setDelay(org.apache.axis.types.UnsignedInt delay) {
        this.delay = delay;
    }


    /**
     * Gets the customfile value for this Appqoeaction.
     * 
     * @return customfile
     */
    public java.lang.String getCustomfile() {
        return customfile;
    }


    /**
     * Sets the customfile value for this Appqoeaction.
     * 
     * @param customfile
     */
    public void setCustomfile(java.lang.String customfile) {
        this.customfile = customfile;
    }


    /**
     * Gets the dostrigexpression value for this Appqoeaction.
     * 
     * @return dostrigexpression
     */
    public java.lang.String getDostrigexpression() {
        return dostrigexpression;
    }


    /**
     * Sets the dostrigexpression value for this Appqoeaction.
     * 
     * @param dostrigexpression
     */
    public void setDostrigexpression(java.lang.String dostrigexpression) {
        this.dostrigexpression = dostrigexpression;
    }


    /**
     * Gets the dosaction value for this Appqoeaction.
     * 
     * @return dosaction
     */
    public java.lang.String getDosaction() {
        return dosaction;
    }


    /**
     * Sets the dosaction value for this Appqoeaction.
     * 
     * @param dosaction
     */
    public void setDosaction(java.lang.String dosaction) {
        this.dosaction = dosaction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Appqoeaction)) return false;
        Appqoeaction other = (Appqoeaction) obj;
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
            ((this.hits==null && other.getHits()==null) || 
             (this.hits!=null &&
              this.hits.equals(other.getHits()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.respondwith==null && other.getRespondwith()==null) || 
             (this.respondwith!=null &&
              this.respondwith.equals(other.getRespondwith()))) &&
            ((this.polqdepth==null && other.getPolqdepth()==null) || 
             (this.polqdepth!=null &&
              this.polqdepth.equals(other.getPolqdepth()))) &&
            ((this.priqdepth==null && other.getPriqdepth()==null) || 
             (this.priqdepth!=null &&
              this.priqdepth.equals(other.getPriqdepth()))) &&
            ((this.altcontentsvcname==null && other.getAltcontentsvcname()==null) || 
             (this.altcontentsvcname!=null &&
              this.altcontentsvcname.equals(other.getAltcontentsvcname()))) &&
            ((this.altcontentpath==null && other.getAltcontentpath()==null) || 
             (this.altcontentpath!=null &&
              this.altcontentpath.equals(other.getAltcontentpath()))) &&
            ((this.maxconn==null && other.getMaxconn()==null) || 
             (this.maxconn!=null &&
              this.maxconn.equals(other.getMaxconn()))) &&
            ((this.delay==null && other.getDelay()==null) || 
             (this.delay!=null &&
              this.delay.equals(other.getDelay()))) &&
            ((this.customfile==null && other.getCustomfile()==null) || 
             (this.customfile!=null &&
              this.customfile.equals(other.getCustomfile()))) &&
            ((this.dostrigexpression==null && other.getDostrigexpression()==null) || 
             (this.dostrigexpression!=null &&
              this.dostrigexpression.equals(other.getDostrigexpression()))) &&
            ((this.dosaction==null && other.getDosaction()==null) || 
             (this.dosaction!=null &&
              this.dosaction.equals(other.getDosaction())));
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
        if (getHits() != null) {
            _hashCode += getHits().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getRespondwith() != null) {
            _hashCode += getRespondwith().hashCode();
        }
        if (getPolqdepth() != null) {
            _hashCode += getPolqdepth().hashCode();
        }
        if (getPriqdepth() != null) {
            _hashCode += getPriqdepth().hashCode();
        }
        if (getAltcontentsvcname() != null) {
            _hashCode += getAltcontentsvcname().hashCode();
        }
        if (getAltcontentpath() != null) {
            _hashCode += getAltcontentpath().hashCode();
        }
        if (getMaxconn() != null) {
            _hashCode += getMaxconn().hashCode();
        }
        if (getDelay() != null) {
            _hashCode += getDelay().hashCode();
        }
        if (getCustomfile() != null) {
            _hashCode += getCustomfile().hashCode();
        }
        if (getDostrigexpression() != null) {
            _hashCode += getDostrigexpression().hashCode();
        }
        if (getDosaction() != null) {
            _hashCode += getDosaction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Appqoeaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "appqoeaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respondwith");
        elemField.setXmlName(new javax.xml.namespace.QName("", "respondwith"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("polqdepth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "polqdepth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priqdepth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priqdepth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altcontentsvcname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "altcontentsvcname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("altcontentpath");
        elemField.setXmlName(new javax.xml.namespace.QName("", "altcontentpath"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxconn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxconn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "customfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dostrigexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dostrigexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dosaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dosaction"));
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
