/**
 * Nsacl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nsacl  implements java.io.Serializable {
    private java.lang.String aclname;

    private java.lang.String aclaction;

    private java.lang.String srcmac;

    private java.lang.String protocol;

    private org.apache.axis.types.UnsignedInt protocolnumber;

    private java.lang.String srcportval;

    private java.lang.String destportval;

    private java.lang.String srcipval;

    private java.lang.String destipval;

    private org.apache.axis.types.UnsignedInt vlan;

    private java.lang.String state;

    private org.apache.axis.types.UnsignedInt ttl;

    private org.apache.axis.types.UnsignedInt icmptype;

    private org.apache.axis.types.UnsignedInt icmpcode;

    private java.lang.String interfacE;

    private org.apache.axis.types.UnsignedLong hits;

    private boolean established;

    private org.apache.axis.types.UnsignedInt priority;

    private java.lang.String operatoR;

    private java.lang.String operatoR2;

    private java.lang.String operatoR3;

    private java.lang.String operatoR4;

    private java.lang.String kernelstate;

    private java.lang.String logstate;

    private org.apache.axis.types.UnsignedInt ratelimit;

    public Nsacl() {
    }

    public Nsacl(
           java.lang.String aclname,
           java.lang.String aclaction,
           java.lang.String srcmac,
           java.lang.String protocol,
           org.apache.axis.types.UnsignedInt protocolnumber,
           java.lang.String srcportval,
           java.lang.String destportval,
           java.lang.String srcipval,
           java.lang.String destipval,
           org.apache.axis.types.UnsignedInt vlan,
           java.lang.String state,
           org.apache.axis.types.UnsignedInt ttl,
           org.apache.axis.types.UnsignedInt icmptype,
           org.apache.axis.types.UnsignedInt icmpcode,
           java.lang.String interfacE,
           org.apache.axis.types.UnsignedLong hits,
           boolean established,
           org.apache.axis.types.UnsignedInt priority,
           java.lang.String operatoR,
           java.lang.String operatoR2,
           java.lang.String operatoR3,
           java.lang.String operatoR4,
           java.lang.String kernelstate,
           java.lang.String logstate,
           org.apache.axis.types.UnsignedInt ratelimit) {
           this.aclname = aclname;
           this.aclaction = aclaction;
           this.srcmac = srcmac;
           this.protocol = protocol;
           this.protocolnumber = protocolnumber;
           this.srcportval = srcportval;
           this.destportval = destportval;
           this.srcipval = srcipval;
           this.destipval = destipval;
           this.vlan = vlan;
           this.state = state;
           this.ttl = ttl;
           this.icmptype = icmptype;
           this.icmpcode = icmpcode;
           this.interfacE = interfacE;
           this.hits = hits;
           this.established = established;
           this.priority = priority;
           this.operatoR = operatoR;
           this.operatoR2 = operatoR2;
           this.operatoR3 = operatoR3;
           this.operatoR4 = operatoR4;
           this.kernelstate = kernelstate;
           this.logstate = logstate;
           this.ratelimit = ratelimit;
    }


    /**
     * Gets the aclname value for this Nsacl.
     * 
     * @return aclname
     */
    public java.lang.String getAclname() {
        return aclname;
    }


    /**
     * Sets the aclname value for this Nsacl.
     * 
     * @param aclname
     */
    public void setAclname(java.lang.String aclname) {
        this.aclname = aclname;
    }


    /**
     * Gets the aclaction value for this Nsacl.
     * 
     * @return aclaction
     */
    public java.lang.String getAclaction() {
        return aclaction;
    }


    /**
     * Sets the aclaction value for this Nsacl.
     * 
     * @param aclaction
     */
    public void setAclaction(java.lang.String aclaction) {
        this.aclaction = aclaction;
    }


    /**
     * Gets the srcmac value for this Nsacl.
     * 
     * @return srcmac
     */
    public java.lang.String getSrcmac() {
        return srcmac;
    }


    /**
     * Sets the srcmac value for this Nsacl.
     * 
     * @param srcmac
     */
    public void setSrcmac(java.lang.String srcmac) {
        this.srcmac = srcmac;
    }


    /**
     * Gets the protocol value for this Nsacl.
     * 
     * @return protocol
     */
    public java.lang.String getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this Nsacl.
     * 
     * @param protocol
     */
    public void setProtocol(java.lang.String protocol) {
        this.protocol = protocol;
    }


    /**
     * Gets the protocolnumber value for this Nsacl.
     * 
     * @return protocolnumber
     */
    public org.apache.axis.types.UnsignedInt getProtocolnumber() {
        return protocolnumber;
    }


    /**
     * Sets the protocolnumber value for this Nsacl.
     * 
     * @param protocolnumber
     */
    public void setProtocolnumber(org.apache.axis.types.UnsignedInt protocolnumber) {
        this.protocolnumber = protocolnumber;
    }


    /**
     * Gets the srcportval value for this Nsacl.
     * 
     * @return srcportval
     */
    public java.lang.String getSrcportval() {
        return srcportval;
    }


    /**
     * Sets the srcportval value for this Nsacl.
     * 
     * @param srcportval
     */
    public void setSrcportval(java.lang.String srcportval) {
        this.srcportval = srcportval;
    }


    /**
     * Gets the destportval value for this Nsacl.
     * 
     * @return destportval
     */
    public java.lang.String getDestportval() {
        return destportval;
    }


    /**
     * Sets the destportval value for this Nsacl.
     * 
     * @param destportval
     */
    public void setDestportval(java.lang.String destportval) {
        this.destportval = destportval;
    }


    /**
     * Gets the srcipval value for this Nsacl.
     * 
     * @return srcipval
     */
    public java.lang.String getSrcipval() {
        return srcipval;
    }


    /**
     * Sets the srcipval value for this Nsacl.
     * 
     * @param srcipval
     */
    public void setSrcipval(java.lang.String srcipval) {
        this.srcipval = srcipval;
    }


    /**
     * Gets the destipval value for this Nsacl.
     * 
     * @return destipval
     */
    public java.lang.String getDestipval() {
        return destipval;
    }


    /**
     * Sets the destipval value for this Nsacl.
     * 
     * @param destipval
     */
    public void setDestipval(java.lang.String destipval) {
        this.destipval = destipval;
    }


    /**
     * Gets the vlan value for this Nsacl.
     * 
     * @return vlan
     */
    public org.apache.axis.types.UnsignedInt getVlan() {
        return vlan;
    }


    /**
     * Sets the vlan value for this Nsacl.
     * 
     * @param vlan
     */
    public void setVlan(org.apache.axis.types.UnsignedInt vlan) {
        this.vlan = vlan;
    }


    /**
     * Gets the state value for this Nsacl.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Nsacl.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the ttl value for this Nsacl.
     * 
     * @return ttl
     */
    public org.apache.axis.types.UnsignedInt getTtl() {
        return ttl;
    }


    /**
     * Sets the ttl value for this Nsacl.
     * 
     * @param ttl
     */
    public void setTtl(org.apache.axis.types.UnsignedInt ttl) {
        this.ttl = ttl;
    }


    /**
     * Gets the icmptype value for this Nsacl.
     * 
     * @return icmptype
     */
    public org.apache.axis.types.UnsignedInt getIcmptype() {
        return icmptype;
    }


    /**
     * Sets the icmptype value for this Nsacl.
     * 
     * @param icmptype
     */
    public void setIcmptype(org.apache.axis.types.UnsignedInt icmptype) {
        this.icmptype = icmptype;
    }


    /**
     * Gets the icmpcode value for this Nsacl.
     * 
     * @return icmpcode
     */
    public org.apache.axis.types.UnsignedInt getIcmpcode() {
        return icmpcode;
    }


    /**
     * Sets the icmpcode value for this Nsacl.
     * 
     * @param icmpcode
     */
    public void setIcmpcode(org.apache.axis.types.UnsignedInt icmpcode) {
        this.icmpcode = icmpcode;
    }


    /**
     * Gets the interfacE value for this Nsacl.
     * 
     * @return interfacE
     */
    public java.lang.String getInterfacE() {
        return interfacE;
    }


    /**
     * Sets the interfacE value for this Nsacl.
     * 
     * @param interfacE
     */
    public void setInterfacE(java.lang.String interfacE) {
        this.interfacE = interfacE;
    }


    /**
     * Gets the hits value for this Nsacl.
     * 
     * @return hits
     */
    public org.apache.axis.types.UnsignedLong getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this Nsacl.
     * 
     * @param hits
     */
    public void setHits(org.apache.axis.types.UnsignedLong hits) {
        this.hits = hits;
    }


    /**
     * Gets the established value for this Nsacl.
     * 
     * @return established
     */
    public boolean isEstablished() {
        return established;
    }


    /**
     * Sets the established value for this Nsacl.
     * 
     * @param established
     */
    public void setEstablished(boolean established) {
        this.established = established;
    }


    /**
     * Gets the priority value for this Nsacl.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Nsacl.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the operatoR value for this Nsacl.
     * 
     * @return operatoR
     */
    public java.lang.String getOperatoR() {
        return operatoR;
    }


    /**
     * Sets the operatoR value for this Nsacl.
     * 
     * @param operatoR
     */
    public void setOperatoR(java.lang.String operatoR) {
        this.operatoR = operatoR;
    }


    /**
     * Gets the operatoR2 value for this Nsacl.
     * 
     * @return operatoR2
     */
    public java.lang.String getOperatoR2() {
        return operatoR2;
    }


    /**
     * Sets the operatoR2 value for this Nsacl.
     * 
     * @param operatoR2
     */
    public void setOperatoR2(java.lang.String operatoR2) {
        this.operatoR2 = operatoR2;
    }


    /**
     * Gets the operatoR3 value for this Nsacl.
     * 
     * @return operatoR3
     */
    public java.lang.String getOperatoR3() {
        return operatoR3;
    }


    /**
     * Sets the operatoR3 value for this Nsacl.
     * 
     * @param operatoR3
     */
    public void setOperatoR3(java.lang.String operatoR3) {
        this.operatoR3 = operatoR3;
    }


    /**
     * Gets the operatoR4 value for this Nsacl.
     * 
     * @return operatoR4
     */
    public java.lang.String getOperatoR4() {
        return operatoR4;
    }


    /**
     * Sets the operatoR4 value for this Nsacl.
     * 
     * @param operatoR4
     */
    public void setOperatoR4(java.lang.String operatoR4) {
        this.operatoR4 = operatoR4;
    }


    /**
     * Gets the kernelstate value for this Nsacl.
     * 
     * @return kernelstate
     */
    public java.lang.String getKernelstate() {
        return kernelstate;
    }


    /**
     * Sets the kernelstate value for this Nsacl.
     * 
     * @param kernelstate
     */
    public void setKernelstate(java.lang.String kernelstate) {
        this.kernelstate = kernelstate;
    }


    /**
     * Gets the logstate value for this Nsacl.
     * 
     * @return logstate
     */
    public java.lang.String getLogstate() {
        return logstate;
    }


    /**
     * Sets the logstate value for this Nsacl.
     * 
     * @param logstate
     */
    public void setLogstate(java.lang.String logstate) {
        this.logstate = logstate;
    }


    /**
     * Gets the ratelimit value for this Nsacl.
     * 
     * @return ratelimit
     */
    public org.apache.axis.types.UnsignedInt getRatelimit() {
        return ratelimit;
    }


    /**
     * Sets the ratelimit value for this Nsacl.
     * 
     * @param ratelimit
     */
    public void setRatelimit(org.apache.axis.types.UnsignedInt ratelimit) {
        this.ratelimit = ratelimit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nsacl)) return false;
        Nsacl other = (Nsacl) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.aclname==null && other.getAclname()==null) || 
             (this.aclname!=null &&
              this.aclname.equals(other.getAclname()))) &&
            ((this.aclaction==null && other.getAclaction()==null) || 
             (this.aclaction!=null &&
              this.aclaction.equals(other.getAclaction()))) &&
            ((this.srcmac==null && other.getSrcmac()==null) || 
             (this.srcmac!=null &&
              this.srcmac.equals(other.getSrcmac()))) &&
            ((this.protocol==null && other.getProtocol()==null) || 
             (this.protocol!=null &&
              this.protocol.equals(other.getProtocol()))) &&
            ((this.protocolnumber==null && other.getProtocolnumber()==null) || 
             (this.protocolnumber!=null &&
              this.protocolnumber.equals(other.getProtocolnumber()))) &&
            ((this.srcportval==null && other.getSrcportval()==null) || 
             (this.srcportval!=null &&
              this.srcportval.equals(other.getSrcportval()))) &&
            ((this.destportval==null && other.getDestportval()==null) || 
             (this.destportval!=null &&
              this.destportval.equals(other.getDestportval()))) &&
            ((this.srcipval==null && other.getSrcipval()==null) || 
             (this.srcipval!=null &&
              this.srcipval.equals(other.getSrcipval()))) &&
            ((this.destipval==null && other.getDestipval()==null) || 
             (this.destipval!=null &&
              this.destipval.equals(other.getDestipval()))) &&
            ((this.vlan==null && other.getVlan()==null) || 
             (this.vlan!=null &&
              this.vlan.equals(other.getVlan()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.ttl==null && other.getTtl()==null) || 
             (this.ttl!=null &&
              this.ttl.equals(other.getTtl()))) &&
            ((this.icmptype==null && other.getIcmptype()==null) || 
             (this.icmptype!=null &&
              this.icmptype.equals(other.getIcmptype()))) &&
            ((this.icmpcode==null && other.getIcmpcode()==null) || 
             (this.icmpcode!=null &&
              this.icmpcode.equals(other.getIcmpcode()))) &&
            ((this.interfacE==null && other.getInterfacE()==null) || 
             (this.interfacE!=null &&
              this.interfacE.equals(other.getInterfacE()))) &&
            ((this.hits==null && other.getHits()==null) || 
             (this.hits!=null &&
              this.hits.equals(other.getHits()))) &&
            this.established == other.isEstablished() &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.operatoR==null && other.getOperatoR()==null) || 
             (this.operatoR!=null &&
              this.operatoR.equals(other.getOperatoR()))) &&
            ((this.operatoR2==null && other.getOperatoR2()==null) || 
             (this.operatoR2!=null &&
              this.operatoR2.equals(other.getOperatoR2()))) &&
            ((this.operatoR3==null && other.getOperatoR3()==null) || 
             (this.operatoR3!=null &&
              this.operatoR3.equals(other.getOperatoR3()))) &&
            ((this.operatoR4==null && other.getOperatoR4()==null) || 
             (this.operatoR4!=null &&
              this.operatoR4.equals(other.getOperatoR4()))) &&
            ((this.kernelstate==null && other.getKernelstate()==null) || 
             (this.kernelstate!=null &&
              this.kernelstate.equals(other.getKernelstate()))) &&
            ((this.logstate==null && other.getLogstate()==null) || 
             (this.logstate!=null &&
              this.logstate.equals(other.getLogstate()))) &&
            ((this.ratelimit==null && other.getRatelimit()==null) || 
             (this.ratelimit!=null &&
              this.ratelimit.equals(other.getRatelimit())));
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
        if (getAclname() != null) {
            _hashCode += getAclname().hashCode();
        }
        if (getAclaction() != null) {
            _hashCode += getAclaction().hashCode();
        }
        if (getSrcmac() != null) {
            _hashCode += getSrcmac().hashCode();
        }
        if (getProtocol() != null) {
            _hashCode += getProtocol().hashCode();
        }
        if (getProtocolnumber() != null) {
            _hashCode += getProtocolnumber().hashCode();
        }
        if (getSrcportval() != null) {
            _hashCode += getSrcportval().hashCode();
        }
        if (getDestportval() != null) {
            _hashCode += getDestportval().hashCode();
        }
        if (getSrcipval() != null) {
            _hashCode += getSrcipval().hashCode();
        }
        if (getDestipval() != null) {
            _hashCode += getDestipval().hashCode();
        }
        if (getVlan() != null) {
            _hashCode += getVlan().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getTtl() != null) {
            _hashCode += getTtl().hashCode();
        }
        if (getIcmptype() != null) {
            _hashCode += getIcmptype().hashCode();
        }
        if (getIcmpcode() != null) {
            _hashCode += getIcmpcode().hashCode();
        }
        if (getInterfacE() != null) {
            _hashCode += getInterfacE().hashCode();
        }
        if (getHits() != null) {
            _hashCode += getHits().hashCode();
        }
        _hashCode += (isEstablished() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getOperatoR() != null) {
            _hashCode += getOperatoR().hashCode();
        }
        if (getOperatoR2() != null) {
            _hashCode += getOperatoR2().hashCode();
        }
        if (getOperatoR3() != null) {
            _hashCode += getOperatoR3().hashCode();
        }
        if (getOperatoR4() != null) {
            _hashCode += getOperatoR4().hashCode();
        }
        if (getKernelstate() != null) {
            _hashCode += getKernelstate().hashCode();
        }
        if (getLogstate() != null) {
            _hashCode += getLogstate().hashCode();
        }
        if (getRatelimit() != null) {
            _hashCode += getRatelimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nsacl.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nsacl"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aclname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aclname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aclaction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aclaction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcmac");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srcmac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocolnumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocolnumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcportval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srcportval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destportval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destportval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srcipval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srcipval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destipval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destipval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
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
        elemField.setFieldName("icmptype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "icmptype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("icmpcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "icmpcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interfacE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interfacE"));
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
        elemField.setFieldName("established");
        elemField.setXmlName(new javax.xml.namespace.QName("", "established"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatoR");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operatoR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatoR2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operatoR2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatoR3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operatoR3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatoR4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operatoR4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kernelstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kernelstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("logstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "logstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ratelimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ratelimit"));
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
