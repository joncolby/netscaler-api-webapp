/**
 * Transformaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Transformaction  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String profilename;

    private org.apache.axis.types.UnsignedInt priority;

    private java.lang.String requrlfrom;

    private java.lang.String requrlinto;

    private java.lang.String resurlfrom;

    private java.lang.String resurlinto;

    private java.lang.String cookiedomainfrom;

    private java.lang.String cookiedomaininto;

    private java.lang.String continuematching;

    private java.lang.String state;

    private java.lang.String comment;

    public Transformaction() {
    }

    public Transformaction(
           java.lang.String name,
           java.lang.String profilename,
           org.apache.axis.types.UnsignedInt priority,
           java.lang.String requrlfrom,
           java.lang.String requrlinto,
           java.lang.String resurlfrom,
           java.lang.String resurlinto,
           java.lang.String cookiedomainfrom,
           java.lang.String cookiedomaininto,
           java.lang.String continuematching,
           java.lang.String state,
           java.lang.String comment) {
           this.name = name;
           this.profilename = profilename;
           this.priority = priority;
           this.requrlfrom = requrlfrom;
           this.requrlinto = requrlinto;
           this.resurlfrom = resurlfrom;
           this.resurlinto = resurlinto;
           this.cookiedomainfrom = cookiedomainfrom;
           this.cookiedomaininto = cookiedomaininto;
           this.continuematching = continuematching;
           this.state = state;
           this.comment = comment;
    }


    /**
     * Gets the name value for this Transformaction.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Transformaction.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the profilename value for this Transformaction.
     * 
     * @return profilename
     */
    public java.lang.String getProfilename() {
        return profilename;
    }


    /**
     * Sets the profilename value for this Transformaction.
     * 
     * @param profilename
     */
    public void setProfilename(java.lang.String profilename) {
        this.profilename = profilename;
    }


    /**
     * Gets the priority value for this Transformaction.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Transformaction.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the requrlfrom value for this Transformaction.
     * 
     * @return requrlfrom
     */
    public java.lang.String getRequrlfrom() {
        return requrlfrom;
    }


    /**
     * Sets the requrlfrom value for this Transformaction.
     * 
     * @param requrlfrom
     */
    public void setRequrlfrom(java.lang.String requrlfrom) {
        this.requrlfrom = requrlfrom;
    }


    /**
     * Gets the requrlinto value for this Transformaction.
     * 
     * @return requrlinto
     */
    public java.lang.String getRequrlinto() {
        return requrlinto;
    }


    /**
     * Sets the requrlinto value for this Transformaction.
     * 
     * @param requrlinto
     */
    public void setRequrlinto(java.lang.String requrlinto) {
        this.requrlinto = requrlinto;
    }


    /**
     * Gets the resurlfrom value for this Transformaction.
     * 
     * @return resurlfrom
     */
    public java.lang.String getResurlfrom() {
        return resurlfrom;
    }


    /**
     * Sets the resurlfrom value for this Transformaction.
     * 
     * @param resurlfrom
     */
    public void setResurlfrom(java.lang.String resurlfrom) {
        this.resurlfrom = resurlfrom;
    }


    /**
     * Gets the resurlinto value for this Transformaction.
     * 
     * @return resurlinto
     */
    public java.lang.String getResurlinto() {
        return resurlinto;
    }


    /**
     * Sets the resurlinto value for this Transformaction.
     * 
     * @param resurlinto
     */
    public void setResurlinto(java.lang.String resurlinto) {
        this.resurlinto = resurlinto;
    }


    /**
     * Gets the cookiedomainfrom value for this Transformaction.
     * 
     * @return cookiedomainfrom
     */
    public java.lang.String getCookiedomainfrom() {
        return cookiedomainfrom;
    }


    /**
     * Sets the cookiedomainfrom value for this Transformaction.
     * 
     * @param cookiedomainfrom
     */
    public void setCookiedomainfrom(java.lang.String cookiedomainfrom) {
        this.cookiedomainfrom = cookiedomainfrom;
    }


    /**
     * Gets the cookiedomaininto value for this Transformaction.
     * 
     * @return cookiedomaininto
     */
    public java.lang.String getCookiedomaininto() {
        return cookiedomaininto;
    }


    /**
     * Sets the cookiedomaininto value for this Transformaction.
     * 
     * @param cookiedomaininto
     */
    public void setCookiedomaininto(java.lang.String cookiedomaininto) {
        this.cookiedomaininto = cookiedomaininto;
    }


    /**
     * Gets the continuematching value for this Transformaction.
     * 
     * @return continuematching
     */
    public java.lang.String getContinuematching() {
        return continuematching;
    }


    /**
     * Sets the continuematching value for this Transformaction.
     * 
     * @param continuematching
     */
    public void setContinuematching(java.lang.String continuematching) {
        this.continuematching = continuematching;
    }


    /**
     * Gets the state value for this Transformaction.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Transformaction.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the comment value for this Transformaction.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Transformaction.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Transformaction)) return false;
        Transformaction other = (Transformaction) obj;
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
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.requrlfrom==null && other.getRequrlfrom()==null) || 
             (this.requrlfrom!=null &&
              this.requrlfrom.equals(other.getRequrlfrom()))) &&
            ((this.requrlinto==null && other.getRequrlinto()==null) || 
             (this.requrlinto!=null &&
              this.requrlinto.equals(other.getRequrlinto()))) &&
            ((this.resurlfrom==null && other.getResurlfrom()==null) || 
             (this.resurlfrom!=null &&
              this.resurlfrom.equals(other.getResurlfrom()))) &&
            ((this.resurlinto==null && other.getResurlinto()==null) || 
             (this.resurlinto!=null &&
              this.resurlinto.equals(other.getResurlinto()))) &&
            ((this.cookiedomainfrom==null && other.getCookiedomainfrom()==null) || 
             (this.cookiedomainfrom!=null &&
              this.cookiedomainfrom.equals(other.getCookiedomainfrom()))) &&
            ((this.cookiedomaininto==null && other.getCookiedomaininto()==null) || 
             (this.cookiedomaininto!=null &&
              this.cookiedomaininto.equals(other.getCookiedomaininto()))) &&
            ((this.continuematching==null && other.getContinuematching()==null) || 
             (this.continuematching!=null &&
              this.continuematching.equals(other.getContinuematching()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment())));
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
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getRequrlfrom() != null) {
            _hashCode += getRequrlfrom().hashCode();
        }
        if (getRequrlinto() != null) {
            _hashCode += getRequrlinto().hashCode();
        }
        if (getResurlfrom() != null) {
            _hashCode += getResurlfrom().hashCode();
        }
        if (getResurlinto() != null) {
            _hashCode += getResurlinto().hashCode();
        }
        if (getCookiedomainfrom() != null) {
            _hashCode += getCookiedomainfrom().hashCode();
        }
        if (getCookiedomaininto() != null) {
            _hashCode += getCookiedomaininto().hashCode();
        }
        if (getContinuematching() != null) {
            _hashCode += getContinuematching().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Transformaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "transformaction"));
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
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requrlfrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requrlfrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requrlinto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requrlinto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resurlfrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resurlfrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resurlinto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resurlinto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cookiedomainfrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cookiedomainfrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cookiedomaininto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cookiedomaininto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("continuematching");
        elemField.setXmlName(new javax.xml.namespace.QName("", "continuematching"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
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
