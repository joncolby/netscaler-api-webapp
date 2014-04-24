/**
 * Sslaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Sslaction  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String clientauth;

    private java.lang.String clientcert;

    private java.lang.String certheader;

    private java.lang.String clientcertserialnumber;

    private java.lang.String certserialheader;

    private java.lang.String clientcertsubject;

    private java.lang.String certsubjectheader;

    private java.lang.String clientcerthash;

    private java.lang.String certhashheader;

    private java.lang.String clientcertissuer;

    private java.lang.String certissuerheader;

    private java.lang.String sessionid;

    private java.lang.String sessionidheader;

    private java.lang.String cipher;

    private java.lang.String cipherheader;

    private java.lang.String owasupport;

    private java.lang.String clientcertnotbefore;

    private java.lang.String certnotbeforeheader;

    private java.lang.String clientcertnotafter;

    private java.lang.String certnotafterheader;

    private org.apache.axis.types.UnsignedLong hits;

    private org.apache.axis.types.UnsignedLong undefhits;

    private org.apache.axis.types.UnsignedInt referencecount;

    private java.lang.String description;

    private java.lang.String builtin;

    public Sslaction() {
    }

    public Sslaction(
           java.lang.String name,
           java.lang.String clientauth,
           java.lang.String clientcert,
           java.lang.String certheader,
           java.lang.String clientcertserialnumber,
           java.lang.String certserialheader,
           java.lang.String clientcertsubject,
           java.lang.String certsubjectheader,
           java.lang.String clientcerthash,
           java.lang.String certhashheader,
           java.lang.String clientcertissuer,
           java.lang.String certissuerheader,
           java.lang.String sessionid,
           java.lang.String sessionidheader,
           java.lang.String cipher,
           java.lang.String cipherheader,
           java.lang.String owasupport,
           java.lang.String clientcertnotbefore,
           java.lang.String certnotbeforeheader,
           java.lang.String clientcertnotafter,
           java.lang.String certnotafterheader,
           org.apache.axis.types.UnsignedLong hits,
           org.apache.axis.types.UnsignedLong undefhits,
           org.apache.axis.types.UnsignedInt referencecount,
           java.lang.String description,
           java.lang.String builtin) {
           this.name = name;
           this.clientauth = clientauth;
           this.clientcert = clientcert;
           this.certheader = certheader;
           this.clientcertserialnumber = clientcertserialnumber;
           this.certserialheader = certserialheader;
           this.clientcertsubject = clientcertsubject;
           this.certsubjectheader = certsubjectheader;
           this.clientcerthash = clientcerthash;
           this.certhashheader = certhashheader;
           this.clientcertissuer = clientcertissuer;
           this.certissuerheader = certissuerheader;
           this.sessionid = sessionid;
           this.sessionidheader = sessionidheader;
           this.cipher = cipher;
           this.cipherheader = cipherheader;
           this.owasupport = owasupport;
           this.clientcertnotbefore = clientcertnotbefore;
           this.certnotbeforeheader = certnotbeforeheader;
           this.clientcertnotafter = clientcertnotafter;
           this.certnotafterheader = certnotafterheader;
           this.hits = hits;
           this.undefhits = undefhits;
           this.referencecount = referencecount;
           this.description = description;
           this.builtin = builtin;
    }


    /**
     * Gets the name value for this Sslaction.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Sslaction.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the clientauth value for this Sslaction.
     * 
     * @return clientauth
     */
    public java.lang.String getClientauth() {
        return clientauth;
    }


    /**
     * Sets the clientauth value for this Sslaction.
     * 
     * @param clientauth
     */
    public void setClientauth(java.lang.String clientauth) {
        this.clientauth = clientauth;
    }


    /**
     * Gets the clientcert value for this Sslaction.
     * 
     * @return clientcert
     */
    public java.lang.String getClientcert() {
        return clientcert;
    }


    /**
     * Sets the clientcert value for this Sslaction.
     * 
     * @param clientcert
     */
    public void setClientcert(java.lang.String clientcert) {
        this.clientcert = clientcert;
    }


    /**
     * Gets the certheader value for this Sslaction.
     * 
     * @return certheader
     */
    public java.lang.String getCertheader() {
        return certheader;
    }


    /**
     * Sets the certheader value for this Sslaction.
     * 
     * @param certheader
     */
    public void setCertheader(java.lang.String certheader) {
        this.certheader = certheader;
    }


    /**
     * Gets the clientcertserialnumber value for this Sslaction.
     * 
     * @return clientcertserialnumber
     */
    public java.lang.String getClientcertserialnumber() {
        return clientcertserialnumber;
    }


    /**
     * Sets the clientcertserialnumber value for this Sslaction.
     * 
     * @param clientcertserialnumber
     */
    public void setClientcertserialnumber(java.lang.String clientcertserialnumber) {
        this.clientcertserialnumber = clientcertserialnumber;
    }


    /**
     * Gets the certserialheader value for this Sslaction.
     * 
     * @return certserialheader
     */
    public java.lang.String getCertserialheader() {
        return certserialheader;
    }


    /**
     * Sets the certserialheader value for this Sslaction.
     * 
     * @param certserialheader
     */
    public void setCertserialheader(java.lang.String certserialheader) {
        this.certserialheader = certserialheader;
    }


    /**
     * Gets the clientcertsubject value for this Sslaction.
     * 
     * @return clientcertsubject
     */
    public java.lang.String getClientcertsubject() {
        return clientcertsubject;
    }


    /**
     * Sets the clientcertsubject value for this Sslaction.
     * 
     * @param clientcertsubject
     */
    public void setClientcertsubject(java.lang.String clientcertsubject) {
        this.clientcertsubject = clientcertsubject;
    }


    /**
     * Gets the certsubjectheader value for this Sslaction.
     * 
     * @return certsubjectheader
     */
    public java.lang.String getCertsubjectheader() {
        return certsubjectheader;
    }


    /**
     * Sets the certsubjectheader value for this Sslaction.
     * 
     * @param certsubjectheader
     */
    public void setCertsubjectheader(java.lang.String certsubjectheader) {
        this.certsubjectheader = certsubjectheader;
    }


    /**
     * Gets the clientcerthash value for this Sslaction.
     * 
     * @return clientcerthash
     */
    public java.lang.String getClientcerthash() {
        return clientcerthash;
    }


    /**
     * Sets the clientcerthash value for this Sslaction.
     * 
     * @param clientcerthash
     */
    public void setClientcerthash(java.lang.String clientcerthash) {
        this.clientcerthash = clientcerthash;
    }


    /**
     * Gets the certhashheader value for this Sslaction.
     * 
     * @return certhashheader
     */
    public java.lang.String getCerthashheader() {
        return certhashheader;
    }


    /**
     * Sets the certhashheader value for this Sslaction.
     * 
     * @param certhashheader
     */
    public void setCerthashheader(java.lang.String certhashheader) {
        this.certhashheader = certhashheader;
    }


    /**
     * Gets the clientcertissuer value for this Sslaction.
     * 
     * @return clientcertissuer
     */
    public java.lang.String getClientcertissuer() {
        return clientcertissuer;
    }


    /**
     * Sets the clientcertissuer value for this Sslaction.
     * 
     * @param clientcertissuer
     */
    public void setClientcertissuer(java.lang.String clientcertissuer) {
        this.clientcertissuer = clientcertissuer;
    }


    /**
     * Gets the certissuerheader value for this Sslaction.
     * 
     * @return certissuerheader
     */
    public java.lang.String getCertissuerheader() {
        return certissuerheader;
    }


    /**
     * Sets the certissuerheader value for this Sslaction.
     * 
     * @param certissuerheader
     */
    public void setCertissuerheader(java.lang.String certissuerheader) {
        this.certissuerheader = certissuerheader;
    }


    /**
     * Gets the sessionid value for this Sslaction.
     * 
     * @return sessionid
     */
    public java.lang.String getSessionid() {
        return sessionid;
    }


    /**
     * Sets the sessionid value for this Sslaction.
     * 
     * @param sessionid
     */
    public void setSessionid(java.lang.String sessionid) {
        this.sessionid = sessionid;
    }


    /**
     * Gets the sessionidheader value for this Sslaction.
     * 
     * @return sessionidheader
     */
    public java.lang.String getSessionidheader() {
        return sessionidheader;
    }


    /**
     * Sets the sessionidheader value for this Sslaction.
     * 
     * @param sessionidheader
     */
    public void setSessionidheader(java.lang.String sessionidheader) {
        this.sessionidheader = sessionidheader;
    }


    /**
     * Gets the cipher value for this Sslaction.
     * 
     * @return cipher
     */
    public java.lang.String getCipher() {
        return cipher;
    }


    /**
     * Sets the cipher value for this Sslaction.
     * 
     * @param cipher
     */
    public void setCipher(java.lang.String cipher) {
        this.cipher = cipher;
    }


    /**
     * Gets the cipherheader value for this Sslaction.
     * 
     * @return cipherheader
     */
    public java.lang.String getCipherheader() {
        return cipherheader;
    }


    /**
     * Sets the cipherheader value for this Sslaction.
     * 
     * @param cipherheader
     */
    public void setCipherheader(java.lang.String cipherheader) {
        this.cipherheader = cipherheader;
    }


    /**
     * Gets the owasupport value for this Sslaction.
     * 
     * @return owasupport
     */
    public java.lang.String getOwasupport() {
        return owasupport;
    }


    /**
     * Sets the owasupport value for this Sslaction.
     * 
     * @param owasupport
     */
    public void setOwasupport(java.lang.String owasupport) {
        this.owasupport = owasupport;
    }


    /**
     * Gets the clientcertnotbefore value for this Sslaction.
     * 
     * @return clientcertnotbefore
     */
    public java.lang.String getClientcertnotbefore() {
        return clientcertnotbefore;
    }


    /**
     * Sets the clientcertnotbefore value for this Sslaction.
     * 
     * @param clientcertnotbefore
     */
    public void setClientcertnotbefore(java.lang.String clientcertnotbefore) {
        this.clientcertnotbefore = clientcertnotbefore;
    }


    /**
     * Gets the certnotbeforeheader value for this Sslaction.
     * 
     * @return certnotbeforeheader
     */
    public java.lang.String getCertnotbeforeheader() {
        return certnotbeforeheader;
    }


    /**
     * Sets the certnotbeforeheader value for this Sslaction.
     * 
     * @param certnotbeforeheader
     */
    public void setCertnotbeforeheader(java.lang.String certnotbeforeheader) {
        this.certnotbeforeheader = certnotbeforeheader;
    }


    /**
     * Gets the clientcertnotafter value for this Sslaction.
     * 
     * @return clientcertnotafter
     */
    public java.lang.String getClientcertnotafter() {
        return clientcertnotafter;
    }


    /**
     * Sets the clientcertnotafter value for this Sslaction.
     * 
     * @param clientcertnotafter
     */
    public void setClientcertnotafter(java.lang.String clientcertnotafter) {
        this.clientcertnotafter = clientcertnotafter;
    }


    /**
     * Gets the certnotafterheader value for this Sslaction.
     * 
     * @return certnotafterheader
     */
    public java.lang.String getCertnotafterheader() {
        return certnotafterheader;
    }


    /**
     * Sets the certnotafterheader value for this Sslaction.
     * 
     * @param certnotafterheader
     */
    public void setCertnotafterheader(java.lang.String certnotafterheader) {
        this.certnotafterheader = certnotafterheader;
    }


    /**
     * Gets the hits value for this Sslaction.
     * 
     * @return hits
     */
    public org.apache.axis.types.UnsignedLong getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this Sslaction.
     * 
     * @param hits
     */
    public void setHits(org.apache.axis.types.UnsignedLong hits) {
        this.hits = hits;
    }


    /**
     * Gets the undefhits value for this Sslaction.
     * 
     * @return undefhits
     */
    public org.apache.axis.types.UnsignedLong getUndefhits() {
        return undefhits;
    }


    /**
     * Sets the undefhits value for this Sslaction.
     * 
     * @param undefhits
     */
    public void setUndefhits(org.apache.axis.types.UnsignedLong undefhits) {
        this.undefhits = undefhits;
    }


    /**
     * Gets the referencecount value for this Sslaction.
     * 
     * @return referencecount
     */
    public org.apache.axis.types.UnsignedInt getReferencecount() {
        return referencecount;
    }


    /**
     * Sets the referencecount value for this Sslaction.
     * 
     * @param referencecount
     */
    public void setReferencecount(org.apache.axis.types.UnsignedInt referencecount) {
        this.referencecount = referencecount;
    }


    /**
     * Gets the description value for this Sslaction.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Sslaction.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the builtin value for this Sslaction.
     * 
     * @return builtin
     */
    public java.lang.String getBuiltin() {
        return builtin;
    }


    /**
     * Sets the builtin value for this Sslaction.
     * 
     * @param builtin
     */
    public void setBuiltin(java.lang.String builtin) {
        this.builtin = builtin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sslaction)) return false;
        Sslaction other = (Sslaction) obj;
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
            ((this.clientauth==null && other.getClientauth()==null) || 
             (this.clientauth!=null &&
              this.clientauth.equals(other.getClientauth()))) &&
            ((this.clientcert==null && other.getClientcert()==null) || 
             (this.clientcert!=null &&
              this.clientcert.equals(other.getClientcert()))) &&
            ((this.certheader==null && other.getCertheader()==null) || 
             (this.certheader!=null &&
              this.certheader.equals(other.getCertheader()))) &&
            ((this.clientcertserialnumber==null && other.getClientcertserialnumber()==null) || 
             (this.clientcertserialnumber!=null &&
              this.clientcertserialnumber.equals(other.getClientcertserialnumber()))) &&
            ((this.certserialheader==null && other.getCertserialheader()==null) || 
             (this.certserialheader!=null &&
              this.certserialheader.equals(other.getCertserialheader()))) &&
            ((this.clientcertsubject==null && other.getClientcertsubject()==null) || 
             (this.clientcertsubject!=null &&
              this.clientcertsubject.equals(other.getClientcertsubject()))) &&
            ((this.certsubjectheader==null && other.getCertsubjectheader()==null) || 
             (this.certsubjectheader!=null &&
              this.certsubjectheader.equals(other.getCertsubjectheader()))) &&
            ((this.clientcerthash==null && other.getClientcerthash()==null) || 
             (this.clientcerthash!=null &&
              this.clientcerthash.equals(other.getClientcerthash()))) &&
            ((this.certhashheader==null && other.getCerthashheader()==null) || 
             (this.certhashheader!=null &&
              this.certhashheader.equals(other.getCerthashheader()))) &&
            ((this.clientcertissuer==null && other.getClientcertissuer()==null) || 
             (this.clientcertissuer!=null &&
              this.clientcertissuer.equals(other.getClientcertissuer()))) &&
            ((this.certissuerheader==null && other.getCertissuerheader()==null) || 
             (this.certissuerheader!=null &&
              this.certissuerheader.equals(other.getCertissuerheader()))) &&
            ((this.sessionid==null && other.getSessionid()==null) || 
             (this.sessionid!=null &&
              this.sessionid.equals(other.getSessionid()))) &&
            ((this.sessionidheader==null && other.getSessionidheader()==null) || 
             (this.sessionidheader!=null &&
              this.sessionidheader.equals(other.getSessionidheader()))) &&
            ((this.cipher==null && other.getCipher()==null) || 
             (this.cipher!=null &&
              this.cipher.equals(other.getCipher()))) &&
            ((this.cipherheader==null && other.getCipherheader()==null) || 
             (this.cipherheader!=null &&
              this.cipherheader.equals(other.getCipherheader()))) &&
            ((this.owasupport==null && other.getOwasupport()==null) || 
             (this.owasupport!=null &&
              this.owasupport.equals(other.getOwasupport()))) &&
            ((this.clientcertnotbefore==null && other.getClientcertnotbefore()==null) || 
             (this.clientcertnotbefore!=null &&
              this.clientcertnotbefore.equals(other.getClientcertnotbefore()))) &&
            ((this.certnotbeforeheader==null && other.getCertnotbeforeheader()==null) || 
             (this.certnotbeforeheader!=null &&
              this.certnotbeforeheader.equals(other.getCertnotbeforeheader()))) &&
            ((this.clientcertnotafter==null && other.getClientcertnotafter()==null) || 
             (this.clientcertnotafter!=null &&
              this.clientcertnotafter.equals(other.getClientcertnotafter()))) &&
            ((this.certnotafterheader==null && other.getCertnotafterheader()==null) || 
             (this.certnotafterheader!=null &&
              this.certnotafterheader.equals(other.getCertnotafterheader()))) &&
            ((this.hits==null && other.getHits()==null) || 
             (this.hits!=null &&
              this.hits.equals(other.getHits()))) &&
            ((this.undefhits==null && other.getUndefhits()==null) || 
             (this.undefhits!=null &&
              this.undefhits.equals(other.getUndefhits()))) &&
            ((this.referencecount==null && other.getReferencecount()==null) || 
             (this.referencecount!=null &&
              this.referencecount.equals(other.getReferencecount()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
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
        if (getClientauth() != null) {
            _hashCode += getClientauth().hashCode();
        }
        if (getClientcert() != null) {
            _hashCode += getClientcert().hashCode();
        }
        if (getCertheader() != null) {
            _hashCode += getCertheader().hashCode();
        }
        if (getClientcertserialnumber() != null) {
            _hashCode += getClientcertserialnumber().hashCode();
        }
        if (getCertserialheader() != null) {
            _hashCode += getCertserialheader().hashCode();
        }
        if (getClientcertsubject() != null) {
            _hashCode += getClientcertsubject().hashCode();
        }
        if (getCertsubjectheader() != null) {
            _hashCode += getCertsubjectheader().hashCode();
        }
        if (getClientcerthash() != null) {
            _hashCode += getClientcerthash().hashCode();
        }
        if (getCerthashheader() != null) {
            _hashCode += getCerthashheader().hashCode();
        }
        if (getClientcertissuer() != null) {
            _hashCode += getClientcertissuer().hashCode();
        }
        if (getCertissuerheader() != null) {
            _hashCode += getCertissuerheader().hashCode();
        }
        if (getSessionid() != null) {
            _hashCode += getSessionid().hashCode();
        }
        if (getSessionidheader() != null) {
            _hashCode += getSessionidheader().hashCode();
        }
        if (getCipher() != null) {
            _hashCode += getCipher().hashCode();
        }
        if (getCipherheader() != null) {
            _hashCode += getCipherheader().hashCode();
        }
        if (getOwasupport() != null) {
            _hashCode += getOwasupport().hashCode();
        }
        if (getClientcertnotbefore() != null) {
            _hashCode += getClientcertnotbefore().hashCode();
        }
        if (getCertnotbeforeheader() != null) {
            _hashCode += getCertnotbeforeheader().hashCode();
        }
        if (getClientcertnotafter() != null) {
            _hashCode += getClientcertnotafter().hashCode();
        }
        if (getCertnotafterheader() != null) {
            _hashCode += getCertnotafterheader().hashCode();
        }
        if (getHits() != null) {
            _hashCode += getHits().hashCode();
        }
        if (getUndefhits() != null) {
            _hashCode += getUndefhits().hashCode();
        }
        if (getReferencecount() != null) {
            _hashCode += getReferencecount().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getBuiltin() != null) {
            _hashCode += getBuiltin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sslaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "sslaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientauth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientauth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientcert");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientcert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certheader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certheader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientcertserialnumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientcertserialnumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certserialheader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certserialheader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientcertsubject");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientcertsubject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certsubjectheader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certsubjectheader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientcerthash");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientcerthash"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certhashheader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certhashheader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientcertissuer");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientcertissuer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certissuerheader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certissuerheader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionidheader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sessionidheader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cipher");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cipher"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cipherheader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cipherheader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owasupport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "owasupport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientcertnotbefore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientcertnotbefore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certnotbeforeheader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certnotbeforeheader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientcertnotafter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientcertnotafter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("certnotafterheader");
        elemField.setXmlName(new javax.xml.namespace.QName("", "certnotafterheader"));
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
        elemField.setFieldName("undefhits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "undefhits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referencecount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "referencecount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
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
