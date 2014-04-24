/**
 * Nshttpprofile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nshttpprofile  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String dropinvalreqs;

    private java.lang.String markhttp09Inval;

    private java.lang.String markconnreqinval;

    private java.lang.String cmponpush;

    private java.lang.String conmultiplex;

    private org.apache.axis.types.UnsignedInt maxreusepool;

    private java.lang.String websocket;

    private org.apache.axis.types.UnsignedInt refcnt;

    private java.lang.String dropextracrlf;

    private org.apache.axis.types.UnsignedInt incomphdrdelay;

    private org.apache.axis.types.UnsignedInt reqtimeout;

    private java.lang.String adpttimeout;

    private java.lang.String reqtimeoutaction;

    private java.lang.String dropextradata;

    private java.lang.String weblog;

    private java.lang.String clientiphdrexpr;

    private org.apache.axis.types.UnsignedInt maxreq;

    private java.lang.String persistentetag;

    private java.lang.String spdy;

    private org.apache.axis.types.UnsignedInt reusepooltimeout;

    public Nshttpprofile() {
    }

    public Nshttpprofile(
           java.lang.String name,
           java.lang.String dropinvalreqs,
           java.lang.String markhttp09Inval,
           java.lang.String markconnreqinval,
           java.lang.String cmponpush,
           java.lang.String conmultiplex,
           org.apache.axis.types.UnsignedInt maxreusepool,
           java.lang.String websocket,
           org.apache.axis.types.UnsignedInt refcnt,
           java.lang.String dropextracrlf,
           org.apache.axis.types.UnsignedInt incomphdrdelay,
           org.apache.axis.types.UnsignedInt reqtimeout,
           java.lang.String adpttimeout,
           java.lang.String reqtimeoutaction,
           java.lang.String dropextradata,
           java.lang.String weblog,
           java.lang.String clientiphdrexpr,
           org.apache.axis.types.UnsignedInt maxreq,
           java.lang.String persistentetag,
           java.lang.String spdy,
           org.apache.axis.types.UnsignedInt reusepooltimeout) {
           this.name = name;
           this.dropinvalreqs = dropinvalreqs;
           this.markhttp09Inval = markhttp09Inval;
           this.markconnreqinval = markconnreqinval;
           this.cmponpush = cmponpush;
           this.conmultiplex = conmultiplex;
           this.maxreusepool = maxreusepool;
           this.websocket = websocket;
           this.refcnt = refcnt;
           this.dropextracrlf = dropextracrlf;
           this.incomphdrdelay = incomphdrdelay;
           this.reqtimeout = reqtimeout;
           this.adpttimeout = adpttimeout;
           this.reqtimeoutaction = reqtimeoutaction;
           this.dropextradata = dropextradata;
           this.weblog = weblog;
           this.clientiphdrexpr = clientiphdrexpr;
           this.maxreq = maxreq;
           this.persistentetag = persistentetag;
           this.spdy = spdy;
           this.reusepooltimeout = reusepooltimeout;
    }


    /**
     * Gets the name value for this Nshttpprofile.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Nshttpprofile.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the dropinvalreqs value for this Nshttpprofile.
     * 
     * @return dropinvalreqs
     */
    public java.lang.String getDropinvalreqs() {
        return dropinvalreqs;
    }


    /**
     * Sets the dropinvalreqs value for this Nshttpprofile.
     * 
     * @param dropinvalreqs
     */
    public void setDropinvalreqs(java.lang.String dropinvalreqs) {
        this.dropinvalreqs = dropinvalreqs;
    }


    /**
     * Gets the markhttp09Inval value for this Nshttpprofile.
     * 
     * @return markhttp09Inval
     */
    public java.lang.String getMarkhttp09Inval() {
        return markhttp09Inval;
    }


    /**
     * Sets the markhttp09Inval value for this Nshttpprofile.
     * 
     * @param markhttp09Inval
     */
    public void setMarkhttp09Inval(java.lang.String markhttp09Inval) {
        this.markhttp09Inval = markhttp09Inval;
    }


    /**
     * Gets the markconnreqinval value for this Nshttpprofile.
     * 
     * @return markconnreqinval
     */
    public java.lang.String getMarkconnreqinval() {
        return markconnreqinval;
    }


    /**
     * Sets the markconnreqinval value for this Nshttpprofile.
     * 
     * @param markconnreqinval
     */
    public void setMarkconnreqinval(java.lang.String markconnreqinval) {
        this.markconnreqinval = markconnreqinval;
    }


    /**
     * Gets the cmponpush value for this Nshttpprofile.
     * 
     * @return cmponpush
     */
    public java.lang.String getCmponpush() {
        return cmponpush;
    }


    /**
     * Sets the cmponpush value for this Nshttpprofile.
     * 
     * @param cmponpush
     */
    public void setCmponpush(java.lang.String cmponpush) {
        this.cmponpush = cmponpush;
    }


    /**
     * Gets the conmultiplex value for this Nshttpprofile.
     * 
     * @return conmultiplex
     */
    public java.lang.String getConmultiplex() {
        return conmultiplex;
    }


    /**
     * Sets the conmultiplex value for this Nshttpprofile.
     * 
     * @param conmultiplex
     */
    public void setConmultiplex(java.lang.String conmultiplex) {
        this.conmultiplex = conmultiplex;
    }


    /**
     * Gets the maxreusepool value for this Nshttpprofile.
     * 
     * @return maxreusepool
     */
    public org.apache.axis.types.UnsignedInt getMaxreusepool() {
        return maxreusepool;
    }


    /**
     * Sets the maxreusepool value for this Nshttpprofile.
     * 
     * @param maxreusepool
     */
    public void setMaxreusepool(org.apache.axis.types.UnsignedInt maxreusepool) {
        this.maxreusepool = maxreusepool;
    }


    /**
     * Gets the websocket value for this Nshttpprofile.
     * 
     * @return websocket
     */
    public java.lang.String getWebsocket() {
        return websocket;
    }


    /**
     * Sets the websocket value for this Nshttpprofile.
     * 
     * @param websocket
     */
    public void setWebsocket(java.lang.String websocket) {
        this.websocket = websocket;
    }


    /**
     * Gets the refcnt value for this Nshttpprofile.
     * 
     * @return refcnt
     */
    public org.apache.axis.types.UnsignedInt getRefcnt() {
        return refcnt;
    }


    /**
     * Sets the refcnt value for this Nshttpprofile.
     * 
     * @param refcnt
     */
    public void setRefcnt(org.apache.axis.types.UnsignedInt refcnt) {
        this.refcnt = refcnt;
    }


    /**
     * Gets the dropextracrlf value for this Nshttpprofile.
     * 
     * @return dropextracrlf
     */
    public java.lang.String getDropextracrlf() {
        return dropextracrlf;
    }


    /**
     * Sets the dropextracrlf value for this Nshttpprofile.
     * 
     * @param dropextracrlf
     */
    public void setDropextracrlf(java.lang.String dropextracrlf) {
        this.dropextracrlf = dropextracrlf;
    }


    /**
     * Gets the incomphdrdelay value for this Nshttpprofile.
     * 
     * @return incomphdrdelay
     */
    public org.apache.axis.types.UnsignedInt getIncomphdrdelay() {
        return incomphdrdelay;
    }


    /**
     * Sets the incomphdrdelay value for this Nshttpprofile.
     * 
     * @param incomphdrdelay
     */
    public void setIncomphdrdelay(org.apache.axis.types.UnsignedInt incomphdrdelay) {
        this.incomphdrdelay = incomphdrdelay;
    }


    /**
     * Gets the reqtimeout value for this Nshttpprofile.
     * 
     * @return reqtimeout
     */
    public org.apache.axis.types.UnsignedInt getReqtimeout() {
        return reqtimeout;
    }


    /**
     * Sets the reqtimeout value for this Nshttpprofile.
     * 
     * @param reqtimeout
     */
    public void setReqtimeout(org.apache.axis.types.UnsignedInt reqtimeout) {
        this.reqtimeout = reqtimeout;
    }


    /**
     * Gets the adpttimeout value for this Nshttpprofile.
     * 
     * @return adpttimeout
     */
    public java.lang.String getAdpttimeout() {
        return adpttimeout;
    }


    /**
     * Sets the adpttimeout value for this Nshttpprofile.
     * 
     * @param adpttimeout
     */
    public void setAdpttimeout(java.lang.String adpttimeout) {
        this.adpttimeout = adpttimeout;
    }


    /**
     * Gets the reqtimeoutaction value for this Nshttpprofile.
     * 
     * @return reqtimeoutaction
     */
    public java.lang.String getReqtimeoutaction() {
        return reqtimeoutaction;
    }


    /**
     * Sets the reqtimeoutaction value for this Nshttpprofile.
     * 
     * @param reqtimeoutaction
     */
    public void setReqtimeoutaction(java.lang.String reqtimeoutaction) {
        this.reqtimeoutaction = reqtimeoutaction;
    }


    /**
     * Gets the dropextradata value for this Nshttpprofile.
     * 
     * @return dropextradata
     */
    public java.lang.String getDropextradata() {
        return dropextradata;
    }


    /**
     * Sets the dropextradata value for this Nshttpprofile.
     * 
     * @param dropextradata
     */
    public void setDropextradata(java.lang.String dropextradata) {
        this.dropextradata = dropextradata;
    }


    /**
     * Gets the weblog value for this Nshttpprofile.
     * 
     * @return weblog
     */
    public java.lang.String getWeblog() {
        return weblog;
    }


    /**
     * Sets the weblog value for this Nshttpprofile.
     * 
     * @param weblog
     */
    public void setWeblog(java.lang.String weblog) {
        this.weblog = weblog;
    }


    /**
     * Gets the clientiphdrexpr value for this Nshttpprofile.
     * 
     * @return clientiphdrexpr
     */
    public java.lang.String getClientiphdrexpr() {
        return clientiphdrexpr;
    }


    /**
     * Sets the clientiphdrexpr value for this Nshttpprofile.
     * 
     * @param clientiphdrexpr
     */
    public void setClientiphdrexpr(java.lang.String clientiphdrexpr) {
        this.clientiphdrexpr = clientiphdrexpr;
    }


    /**
     * Gets the maxreq value for this Nshttpprofile.
     * 
     * @return maxreq
     */
    public org.apache.axis.types.UnsignedInt getMaxreq() {
        return maxreq;
    }


    /**
     * Sets the maxreq value for this Nshttpprofile.
     * 
     * @param maxreq
     */
    public void setMaxreq(org.apache.axis.types.UnsignedInt maxreq) {
        this.maxreq = maxreq;
    }


    /**
     * Gets the persistentetag value for this Nshttpprofile.
     * 
     * @return persistentetag
     */
    public java.lang.String getPersistentetag() {
        return persistentetag;
    }


    /**
     * Sets the persistentetag value for this Nshttpprofile.
     * 
     * @param persistentetag
     */
    public void setPersistentetag(java.lang.String persistentetag) {
        this.persistentetag = persistentetag;
    }


    /**
     * Gets the spdy value for this Nshttpprofile.
     * 
     * @return spdy
     */
    public java.lang.String getSpdy() {
        return spdy;
    }


    /**
     * Sets the spdy value for this Nshttpprofile.
     * 
     * @param spdy
     */
    public void setSpdy(java.lang.String spdy) {
        this.spdy = spdy;
    }


    /**
     * Gets the reusepooltimeout value for this Nshttpprofile.
     * 
     * @return reusepooltimeout
     */
    public org.apache.axis.types.UnsignedInt getReusepooltimeout() {
        return reusepooltimeout;
    }


    /**
     * Sets the reusepooltimeout value for this Nshttpprofile.
     * 
     * @param reusepooltimeout
     */
    public void setReusepooltimeout(org.apache.axis.types.UnsignedInt reusepooltimeout) {
        this.reusepooltimeout = reusepooltimeout;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nshttpprofile)) return false;
        Nshttpprofile other = (Nshttpprofile) obj;
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
            ((this.dropinvalreqs==null && other.getDropinvalreqs()==null) || 
             (this.dropinvalreqs!=null &&
              this.dropinvalreqs.equals(other.getDropinvalreqs()))) &&
            ((this.markhttp09Inval==null && other.getMarkhttp09Inval()==null) || 
             (this.markhttp09Inval!=null &&
              this.markhttp09Inval.equals(other.getMarkhttp09Inval()))) &&
            ((this.markconnreqinval==null && other.getMarkconnreqinval()==null) || 
             (this.markconnreqinval!=null &&
              this.markconnreqinval.equals(other.getMarkconnreqinval()))) &&
            ((this.cmponpush==null && other.getCmponpush()==null) || 
             (this.cmponpush!=null &&
              this.cmponpush.equals(other.getCmponpush()))) &&
            ((this.conmultiplex==null && other.getConmultiplex()==null) || 
             (this.conmultiplex!=null &&
              this.conmultiplex.equals(other.getConmultiplex()))) &&
            ((this.maxreusepool==null && other.getMaxreusepool()==null) || 
             (this.maxreusepool!=null &&
              this.maxreusepool.equals(other.getMaxreusepool()))) &&
            ((this.websocket==null && other.getWebsocket()==null) || 
             (this.websocket!=null &&
              this.websocket.equals(other.getWebsocket()))) &&
            ((this.refcnt==null && other.getRefcnt()==null) || 
             (this.refcnt!=null &&
              this.refcnt.equals(other.getRefcnt()))) &&
            ((this.dropextracrlf==null && other.getDropextracrlf()==null) || 
             (this.dropextracrlf!=null &&
              this.dropextracrlf.equals(other.getDropextracrlf()))) &&
            ((this.incomphdrdelay==null && other.getIncomphdrdelay()==null) || 
             (this.incomphdrdelay!=null &&
              this.incomphdrdelay.equals(other.getIncomphdrdelay()))) &&
            ((this.reqtimeout==null && other.getReqtimeout()==null) || 
             (this.reqtimeout!=null &&
              this.reqtimeout.equals(other.getReqtimeout()))) &&
            ((this.adpttimeout==null && other.getAdpttimeout()==null) || 
             (this.adpttimeout!=null &&
              this.adpttimeout.equals(other.getAdpttimeout()))) &&
            ((this.reqtimeoutaction==null && other.getReqtimeoutaction()==null) || 
             (this.reqtimeoutaction!=null &&
              this.reqtimeoutaction.equals(other.getReqtimeoutaction()))) &&
            ((this.dropextradata==null && other.getDropextradata()==null) || 
             (this.dropextradata!=null &&
              this.dropextradata.equals(other.getDropextradata()))) &&
            ((this.weblog==null && other.getWeblog()==null) || 
             (this.weblog!=null &&
              this.weblog.equals(other.getWeblog()))) &&
            ((this.clientiphdrexpr==null && other.getClientiphdrexpr()==null) || 
             (this.clientiphdrexpr!=null &&
              this.clientiphdrexpr.equals(other.getClientiphdrexpr()))) &&
            ((this.maxreq==null && other.getMaxreq()==null) || 
             (this.maxreq!=null &&
              this.maxreq.equals(other.getMaxreq()))) &&
            ((this.persistentetag==null && other.getPersistentetag()==null) || 
             (this.persistentetag!=null &&
              this.persistentetag.equals(other.getPersistentetag()))) &&
            ((this.spdy==null && other.getSpdy()==null) || 
             (this.spdy!=null &&
              this.spdy.equals(other.getSpdy()))) &&
            ((this.reusepooltimeout==null && other.getReusepooltimeout()==null) || 
             (this.reusepooltimeout!=null &&
              this.reusepooltimeout.equals(other.getReusepooltimeout())));
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
        if (getDropinvalreqs() != null) {
            _hashCode += getDropinvalreqs().hashCode();
        }
        if (getMarkhttp09Inval() != null) {
            _hashCode += getMarkhttp09Inval().hashCode();
        }
        if (getMarkconnreqinval() != null) {
            _hashCode += getMarkconnreqinval().hashCode();
        }
        if (getCmponpush() != null) {
            _hashCode += getCmponpush().hashCode();
        }
        if (getConmultiplex() != null) {
            _hashCode += getConmultiplex().hashCode();
        }
        if (getMaxreusepool() != null) {
            _hashCode += getMaxreusepool().hashCode();
        }
        if (getWebsocket() != null) {
            _hashCode += getWebsocket().hashCode();
        }
        if (getRefcnt() != null) {
            _hashCode += getRefcnt().hashCode();
        }
        if (getDropextracrlf() != null) {
            _hashCode += getDropextracrlf().hashCode();
        }
        if (getIncomphdrdelay() != null) {
            _hashCode += getIncomphdrdelay().hashCode();
        }
        if (getReqtimeout() != null) {
            _hashCode += getReqtimeout().hashCode();
        }
        if (getAdpttimeout() != null) {
            _hashCode += getAdpttimeout().hashCode();
        }
        if (getReqtimeoutaction() != null) {
            _hashCode += getReqtimeoutaction().hashCode();
        }
        if (getDropextradata() != null) {
            _hashCode += getDropextradata().hashCode();
        }
        if (getWeblog() != null) {
            _hashCode += getWeblog().hashCode();
        }
        if (getClientiphdrexpr() != null) {
            _hashCode += getClientiphdrexpr().hashCode();
        }
        if (getMaxreq() != null) {
            _hashCode += getMaxreq().hashCode();
        }
        if (getPersistentetag() != null) {
            _hashCode += getPersistentetag().hashCode();
        }
        if (getSpdy() != null) {
            _hashCode += getSpdy().hashCode();
        }
        if (getReusepooltimeout() != null) {
            _hashCode += getReusepooltimeout().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nshttpprofile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nshttpprofile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dropinvalreqs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dropinvalreqs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markhttp09Inval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markhttp09inval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markconnreqinval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markconnreqinval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cmponpush");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cmponpush"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conmultiplex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "conmultiplex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxreusepool");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxreusepool"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("websocket");
        elemField.setXmlName(new javax.xml.namespace.QName("", "websocket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refcnt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refcnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dropextracrlf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dropextracrlf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incomphdrdelay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "incomphdrdelay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqtimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reqtimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adpttimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adpttimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reqtimeoutaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reqtimeoutaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dropextradata");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dropextradata"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weblog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weblog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientiphdrexpr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clientiphdrexpr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxreq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxreq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persistentetag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "persistentetag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spdy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spdy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reusepooltimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reusepooltimeout"));
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
