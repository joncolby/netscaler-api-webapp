/**
 * Sslparameter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Sslparameter  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt quantumsize;

    private org.apache.axis.types.UnsignedInt crlmemorysizemb;

    private java.lang.String strictcachecks;

    private org.apache.axis.types.UnsignedInt ssltriggertimeout;

    private java.lang.String sendclosenotify;

    private org.apache.axis.types.UnsignedInt encrypttriggerpktcount;

    private java.lang.String denysslreneg;

    private java.lang.String insertionencoding;

    private org.apache.axis.types.UnsignedInt ocspcachesize;

    private org.apache.axis.types.UnsignedInt pushflag;

    private java.lang.String dropreqwithnohostheader;

    private org.apache.axis.types.UnsignedInt pushenctriggertimeout;

    private java.lang.String undefactioncontrol;

    private java.lang.String undefactiondata;

    public Sslparameter() {
    }

    public Sslparameter(
           org.apache.axis.types.UnsignedInt quantumsize,
           org.apache.axis.types.UnsignedInt crlmemorysizemb,
           java.lang.String strictcachecks,
           org.apache.axis.types.UnsignedInt ssltriggertimeout,
           java.lang.String sendclosenotify,
           org.apache.axis.types.UnsignedInt encrypttriggerpktcount,
           java.lang.String denysslreneg,
           java.lang.String insertionencoding,
           org.apache.axis.types.UnsignedInt ocspcachesize,
           org.apache.axis.types.UnsignedInt pushflag,
           java.lang.String dropreqwithnohostheader,
           org.apache.axis.types.UnsignedInt pushenctriggertimeout,
           java.lang.String undefactioncontrol,
           java.lang.String undefactiondata) {
           this.quantumsize = quantumsize;
           this.crlmemorysizemb = crlmemorysizemb;
           this.strictcachecks = strictcachecks;
           this.ssltriggertimeout = ssltriggertimeout;
           this.sendclosenotify = sendclosenotify;
           this.encrypttriggerpktcount = encrypttriggerpktcount;
           this.denysslreneg = denysslreneg;
           this.insertionencoding = insertionencoding;
           this.ocspcachesize = ocspcachesize;
           this.pushflag = pushflag;
           this.dropreqwithnohostheader = dropreqwithnohostheader;
           this.pushenctriggertimeout = pushenctriggertimeout;
           this.undefactioncontrol = undefactioncontrol;
           this.undefactiondata = undefactiondata;
    }


    /**
     * Gets the quantumsize value for this Sslparameter.
     * 
     * @return quantumsize
     */
    public org.apache.axis.types.UnsignedInt getQuantumsize() {
        return quantumsize;
    }


    /**
     * Sets the quantumsize value for this Sslparameter.
     * 
     * @param quantumsize
     */
    public void setQuantumsize(org.apache.axis.types.UnsignedInt quantumsize) {
        this.quantumsize = quantumsize;
    }


    /**
     * Gets the crlmemorysizemb value for this Sslparameter.
     * 
     * @return crlmemorysizemb
     */
    public org.apache.axis.types.UnsignedInt getCrlmemorysizemb() {
        return crlmemorysizemb;
    }


    /**
     * Sets the crlmemorysizemb value for this Sslparameter.
     * 
     * @param crlmemorysizemb
     */
    public void setCrlmemorysizemb(org.apache.axis.types.UnsignedInt crlmemorysizemb) {
        this.crlmemorysizemb = crlmemorysizemb;
    }


    /**
     * Gets the strictcachecks value for this Sslparameter.
     * 
     * @return strictcachecks
     */
    public java.lang.String getStrictcachecks() {
        return strictcachecks;
    }


    /**
     * Sets the strictcachecks value for this Sslparameter.
     * 
     * @param strictcachecks
     */
    public void setStrictcachecks(java.lang.String strictcachecks) {
        this.strictcachecks = strictcachecks;
    }


    /**
     * Gets the ssltriggertimeout value for this Sslparameter.
     * 
     * @return ssltriggertimeout
     */
    public org.apache.axis.types.UnsignedInt getSsltriggertimeout() {
        return ssltriggertimeout;
    }


    /**
     * Sets the ssltriggertimeout value for this Sslparameter.
     * 
     * @param ssltriggertimeout
     */
    public void setSsltriggertimeout(org.apache.axis.types.UnsignedInt ssltriggertimeout) {
        this.ssltriggertimeout = ssltriggertimeout;
    }


    /**
     * Gets the sendclosenotify value for this Sslparameter.
     * 
     * @return sendclosenotify
     */
    public java.lang.String getSendclosenotify() {
        return sendclosenotify;
    }


    /**
     * Sets the sendclosenotify value for this Sslparameter.
     * 
     * @param sendclosenotify
     */
    public void setSendclosenotify(java.lang.String sendclosenotify) {
        this.sendclosenotify = sendclosenotify;
    }


    /**
     * Gets the encrypttriggerpktcount value for this Sslparameter.
     * 
     * @return encrypttriggerpktcount
     */
    public org.apache.axis.types.UnsignedInt getEncrypttriggerpktcount() {
        return encrypttriggerpktcount;
    }


    /**
     * Sets the encrypttriggerpktcount value for this Sslparameter.
     * 
     * @param encrypttriggerpktcount
     */
    public void setEncrypttriggerpktcount(org.apache.axis.types.UnsignedInt encrypttriggerpktcount) {
        this.encrypttriggerpktcount = encrypttriggerpktcount;
    }


    /**
     * Gets the denysslreneg value for this Sslparameter.
     * 
     * @return denysslreneg
     */
    public java.lang.String getDenysslreneg() {
        return denysslreneg;
    }


    /**
     * Sets the denysslreneg value for this Sslparameter.
     * 
     * @param denysslreneg
     */
    public void setDenysslreneg(java.lang.String denysslreneg) {
        this.denysslreneg = denysslreneg;
    }


    /**
     * Gets the insertionencoding value for this Sslparameter.
     * 
     * @return insertionencoding
     */
    public java.lang.String getInsertionencoding() {
        return insertionencoding;
    }


    /**
     * Sets the insertionencoding value for this Sslparameter.
     * 
     * @param insertionencoding
     */
    public void setInsertionencoding(java.lang.String insertionencoding) {
        this.insertionencoding = insertionencoding;
    }


    /**
     * Gets the ocspcachesize value for this Sslparameter.
     * 
     * @return ocspcachesize
     */
    public org.apache.axis.types.UnsignedInt getOcspcachesize() {
        return ocspcachesize;
    }


    /**
     * Sets the ocspcachesize value for this Sslparameter.
     * 
     * @param ocspcachesize
     */
    public void setOcspcachesize(org.apache.axis.types.UnsignedInt ocspcachesize) {
        this.ocspcachesize = ocspcachesize;
    }


    /**
     * Gets the pushflag value for this Sslparameter.
     * 
     * @return pushflag
     */
    public org.apache.axis.types.UnsignedInt getPushflag() {
        return pushflag;
    }


    /**
     * Sets the pushflag value for this Sslparameter.
     * 
     * @param pushflag
     */
    public void setPushflag(org.apache.axis.types.UnsignedInt pushflag) {
        this.pushflag = pushflag;
    }


    /**
     * Gets the dropreqwithnohostheader value for this Sslparameter.
     * 
     * @return dropreqwithnohostheader
     */
    public java.lang.String getDropreqwithnohostheader() {
        return dropreqwithnohostheader;
    }


    /**
     * Sets the dropreqwithnohostheader value for this Sslparameter.
     * 
     * @param dropreqwithnohostheader
     */
    public void setDropreqwithnohostheader(java.lang.String dropreqwithnohostheader) {
        this.dropreqwithnohostheader = dropreqwithnohostheader;
    }


    /**
     * Gets the pushenctriggertimeout value for this Sslparameter.
     * 
     * @return pushenctriggertimeout
     */
    public org.apache.axis.types.UnsignedInt getPushenctriggertimeout() {
        return pushenctriggertimeout;
    }


    /**
     * Sets the pushenctriggertimeout value for this Sslparameter.
     * 
     * @param pushenctriggertimeout
     */
    public void setPushenctriggertimeout(org.apache.axis.types.UnsignedInt pushenctriggertimeout) {
        this.pushenctriggertimeout = pushenctriggertimeout;
    }


    /**
     * Gets the undefactioncontrol value for this Sslparameter.
     * 
     * @return undefactioncontrol
     */
    public java.lang.String getUndefactioncontrol() {
        return undefactioncontrol;
    }


    /**
     * Sets the undefactioncontrol value for this Sslparameter.
     * 
     * @param undefactioncontrol
     */
    public void setUndefactioncontrol(java.lang.String undefactioncontrol) {
        this.undefactioncontrol = undefactioncontrol;
    }


    /**
     * Gets the undefactiondata value for this Sslparameter.
     * 
     * @return undefactiondata
     */
    public java.lang.String getUndefactiondata() {
        return undefactiondata;
    }


    /**
     * Sets the undefactiondata value for this Sslparameter.
     * 
     * @param undefactiondata
     */
    public void setUndefactiondata(java.lang.String undefactiondata) {
        this.undefactiondata = undefactiondata;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sslparameter)) return false;
        Sslparameter other = (Sslparameter) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.quantumsize==null && other.getQuantumsize()==null) || 
             (this.quantumsize!=null &&
              this.quantumsize.equals(other.getQuantumsize()))) &&
            ((this.crlmemorysizemb==null && other.getCrlmemorysizemb()==null) || 
             (this.crlmemorysizemb!=null &&
              this.crlmemorysizemb.equals(other.getCrlmemorysizemb()))) &&
            ((this.strictcachecks==null && other.getStrictcachecks()==null) || 
             (this.strictcachecks!=null &&
              this.strictcachecks.equals(other.getStrictcachecks()))) &&
            ((this.ssltriggertimeout==null && other.getSsltriggertimeout()==null) || 
             (this.ssltriggertimeout!=null &&
              this.ssltriggertimeout.equals(other.getSsltriggertimeout()))) &&
            ((this.sendclosenotify==null && other.getSendclosenotify()==null) || 
             (this.sendclosenotify!=null &&
              this.sendclosenotify.equals(other.getSendclosenotify()))) &&
            ((this.encrypttriggerpktcount==null && other.getEncrypttriggerpktcount()==null) || 
             (this.encrypttriggerpktcount!=null &&
              this.encrypttriggerpktcount.equals(other.getEncrypttriggerpktcount()))) &&
            ((this.denysslreneg==null && other.getDenysslreneg()==null) || 
             (this.denysslreneg!=null &&
              this.denysslreneg.equals(other.getDenysslreneg()))) &&
            ((this.insertionencoding==null && other.getInsertionencoding()==null) || 
             (this.insertionencoding!=null &&
              this.insertionencoding.equals(other.getInsertionencoding()))) &&
            ((this.ocspcachesize==null && other.getOcspcachesize()==null) || 
             (this.ocspcachesize!=null &&
              this.ocspcachesize.equals(other.getOcspcachesize()))) &&
            ((this.pushflag==null && other.getPushflag()==null) || 
             (this.pushflag!=null &&
              this.pushflag.equals(other.getPushflag()))) &&
            ((this.dropreqwithnohostheader==null && other.getDropreqwithnohostheader()==null) || 
             (this.dropreqwithnohostheader!=null &&
              this.dropreqwithnohostheader.equals(other.getDropreqwithnohostheader()))) &&
            ((this.pushenctriggertimeout==null && other.getPushenctriggertimeout()==null) || 
             (this.pushenctriggertimeout!=null &&
              this.pushenctriggertimeout.equals(other.getPushenctriggertimeout()))) &&
            ((this.undefactioncontrol==null && other.getUndefactioncontrol()==null) || 
             (this.undefactioncontrol!=null &&
              this.undefactioncontrol.equals(other.getUndefactioncontrol()))) &&
            ((this.undefactiondata==null && other.getUndefactiondata()==null) || 
             (this.undefactiondata!=null &&
              this.undefactiondata.equals(other.getUndefactiondata())));
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
        if (getQuantumsize() != null) {
            _hashCode += getQuantumsize().hashCode();
        }
        if (getCrlmemorysizemb() != null) {
            _hashCode += getCrlmemorysizemb().hashCode();
        }
        if (getStrictcachecks() != null) {
            _hashCode += getStrictcachecks().hashCode();
        }
        if (getSsltriggertimeout() != null) {
            _hashCode += getSsltriggertimeout().hashCode();
        }
        if (getSendclosenotify() != null) {
            _hashCode += getSendclosenotify().hashCode();
        }
        if (getEncrypttriggerpktcount() != null) {
            _hashCode += getEncrypttriggerpktcount().hashCode();
        }
        if (getDenysslreneg() != null) {
            _hashCode += getDenysslreneg().hashCode();
        }
        if (getInsertionencoding() != null) {
            _hashCode += getInsertionencoding().hashCode();
        }
        if (getOcspcachesize() != null) {
            _hashCode += getOcspcachesize().hashCode();
        }
        if (getPushflag() != null) {
            _hashCode += getPushflag().hashCode();
        }
        if (getDropreqwithnohostheader() != null) {
            _hashCode += getDropreqwithnohostheader().hashCode();
        }
        if (getPushenctriggertimeout() != null) {
            _hashCode += getPushenctriggertimeout().hashCode();
        }
        if (getUndefactioncontrol() != null) {
            _hashCode += getUndefactioncontrol().hashCode();
        }
        if (getUndefactiondata() != null) {
            _hashCode += getUndefactiondata().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sslparameter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "sslparameter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantumsize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantumsize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("crlmemorysizemb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crlmemorysizemb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strictcachecks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strictcachecks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ssltriggertimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ssltriggertimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendclosenotify");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendclosenotify"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("encrypttriggerpktcount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "encrypttriggerpktcount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("denysslreneg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "denysslreneg"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertionencoding");
        elemField.setXmlName(new javax.xml.namespace.QName("", "insertionencoding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ocspcachesize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ocspcachesize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pushflag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pushflag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dropreqwithnohostheader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dropreqwithnohostheader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pushenctriggertimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pushenctriggertimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undefactioncontrol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "undefactioncontrol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undefactiondata");
        elemField.setXmlName(new javax.xml.namespace.QName("", "undefactiondata"));
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
