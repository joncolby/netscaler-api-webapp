/**
 * Nsacl6.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nsacl6  implements java.io.Serializable {
    private java.lang.String acl6Name;

    private java.lang.String acl6Action;

    private java.lang.String srcmac;

    private java.lang.String protocol;

    private org.apache.axis.types.UnsignedInt protocolnumber;

    private java.lang.String srcportval;

    private java.lang.String destportval;

    private java.lang.String srcipv6Val;

    private java.lang.String destipv6Val;

    private org.apache.axis.types.UnsignedInt vlan;

    private java.lang.String state;

    private java.lang.String kernelstate;

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

    public Nsacl6() {
    }

    public Nsacl6(
           java.lang.String acl6Name,
           java.lang.String acl6Action,
           java.lang.String srcmac,
           java.lang.String protocol,
           org.apache.axis.types.UnsignedInt protocolnumber,
           java.lang.String srcportval,
           java.lang.String destportval,
           java.lang.String srcipv6Val,
           java.lang.String destipv6Val,
           org.apache.axis.types.UnsignedInt vlan,
           java.lang.String state,
           java.lang.String kernelstate,
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
           java.lang.String operatoR4) {
           this.acl6Name = acl6Name;
           this.acl6Action = acl6Action;
           this.srcmac = srcmac;
           this.protocol = protocol;
           this.protocolnumber = protocolnumber;
           this.srcportval = srcportval;
           this.destportval = destportval;
           this.srcipv6Val = srcipv6Val;
           this.destipv6Val = destipv6Val;
           this.vlan = vlan;
           this.state = state;
           this.kernelstate = kernelstate;
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
    }


    /**
     * Gets the acl6Name value for this Nsacl6.
     * 
     * @return acl6Name
     */
    public java.lang.String getAcl6Name() {
        return acl6Name;
    }


    /**
     * Sets the acl6Name value for this Nsacl6.
     * 
     * @param acl6Name
     */
    public void setAcl6Name(java.lang.String acl6Name) {
        this.acl6Name = acl6Name;
    }


    /**
     * Gets the acl6Action value for this Nsacl6.
     * 
     * @return acl6Action
     */
    public java.lang.String getAcl6Action() {
        return acl6Action;
    }


    /**
     * Sets the acl6Action value for this Nsacl6.
     * 
     * @param acl6Action
     */
    public void setAcl6Action(java.lang.String acl6Action) {
        this.acl6Action = acl6Action;
    }


    /**
     * Gets the srcmac value for this Nsacl6.
     * 
     * @return srcmac
     */
    public java.lang.String getSrcmac() {
        return srcmac;
    }


    /**
     * Sets the srcmac value for this Nsacl6.
     * 
     * @param srcmac
     */
    public void setSrcmac(java.lang.String srcmac) {
        this.srcmac = srcmac;
    }


    /**
     * Gets the protocol value for this Nsacl6.
     * 
     * @return protocol
     */
    public java.lang.String getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this Nsacl6.
     * 
     * @param protocol
     */
    public void setProtocol(java.lang.String protocol) {
        this.protocol = protocol;
    }


    /**
     * Gets the protocolnumber value for this Nsacl6.
     * 
     * @return protocolnumber
     */
    public org.apache.axis.types.UnsignedInt getProtocolnumber() {
        return protocolnumber;
    }


    /**
     * Sets the protocolnumber value for this Nsacl6.
     * 
     * @param protocolnumber
     */
    public void setProtocolnumber(org.apache.axis.types.UnsignedInt protocolnumber) {
        this.protocolnumber = protocolnumber;
    }


    /**
     * Gets the srcportval value for this Nsacl6.
     * 
     * @return srcportval
     */
    public java.lang.String getSrcportval() {
        return srcportval;
    }


    /**
     * Sets the srcportval value for this Nsacl6.
     * 
     * @param srcportval
     */
    public void setSrcportval(java.lang.String srcportval) {
        this.srcportval = srcportval;
    }


    /**
     * Gets the destportval value for this Nsacl6.
     * 
     * @return destportval
     */
    public java.lang.String getDestportval() {
        return destportval;
    }


    /**
     * Sets the destportval value for this Nsacl6.
     * 
     * @param destportval
     */
    public void setDestportval(java.lang.String destportval) {
        this.destportval = destportval;
    }


    /**
     * Gets the srcipv6Val value for this Nsacl6.
     * 
     * @return srcipv6Val
     */
    public java.lang.String getSrcipv6Val() {
        return srcipv6Val;
    }


    /**
     * Sets the srcipv6Val value for this Nsacl6.
     * 
     * @param srcipv6Val
     */
    public void setSrcipv6Val(java.lang.String srcipv6Val) {
        this.srcipv6Val = srcipv6Val;
    }


    /**
     * Gets the destipv6Val value for this Nsacl6.
     * 
     * @return destipv6Val
     */
    public java.lang.String getDestipv6Val() {
        return destipv6Val;
    }


    /**
     * Sets the destipv6Val value for this Nsacl6.
     * 
     * @param destipv6Val
     */
    public void setDestipv6Val(java.lang.String destipv6Val) {
        this.destipv6Val = destipv6Val;
    }


    /**
     * Gets the vlan value for this Nsacl6.
     * 
     * @return vlan
     */
    public org.apache.axis.types.UnsignedInt getVlan() {
        return vlan;
    }


    /**
     * Sets the vlan value for this Nsacl6.
     * 
     * @param vlan
     */
    public void setVlan(org.apache.axis.types.UnsignedInt vlan) {
        this.vlan = vlan;
    }


    /**
     * Gets the state value for this Nsacl6.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Nsacl6.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the kernelstate value for this Nsacl6.
     * 
     * @return kernelstate
     */
    public java.lang.String getKernelstate() {
        return kernelstate;
    }


    /**
     * Sets the kernelstate value for this Nsacl6.
     * 
     * @param kernelstate
     */
    public void setKernelstate(java.lang.String kernelstate) {
        this.kernelstate = kernelstate;
    }


    /**
     * Gets the ttl value for this Nsacl6.
     * 
     * @return ttl
     */
    public org.apache.axis.types.UnsignedInt getTtl() {
        return ttl;
    }


    /**
     * Sets the ttl value for this Nsacl6.
     * 
     * @param ttl
     */
    public void setTtl(org.apache.axis.types.UnsignedInt ttl) {
        this.ttl = ttl;
    }


    /**
     * Gets the icmptype value for this Nsacl6.
     * 
     * @return icmptype
     */
    public org.apache.axis.types.UnsignedInt getIcmptype() {
        return icmptype;
    }


    /**
     * Sets the icmptype value for this Nsacl6.
     * 
     * @param icmptype
     */
    public void setIcmptype(org.apache.axis.types.UnsignedInt icmptype) {
        this.icmptype = icmptype;
    }


    /**
     * Gets the icmpcode value for this Nsacl6.
     * 
     * @return icmpcode
     */
    public org.apache.axis.types.UnsignedInt getIcmpcode() {
        return icmpcode;
    }


    /**
     * Sets the icmpcode value for this Nsacl6.
     * 
     * @param icmpcode
     */
    public void setIcmpcode(org.apache.axis.types.UnsignedInt icmpcode) {
        this.icmpcode = icmpcode;
    }


    /**
     * Gets the interfacE value for this Nsacl6.
     * 
     * @return interfacE
     */
    public java.lang.String getInterfacE() {
        return interfacE;
    }


    /**
     * Sets the interfacE value for this Nsacl6.
     * 
     * @param interfacE
     */
    public void setInterfacE(java.lang.String interfacE) {
        this.interfacE = interfacE;
    }


    /**
     * Gets the hits value for this Nsacl6.
     * 
     * @return hits
     */
    public org.apache.axis.types.UnsignedLong getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this Nsacl6.
     * 
     * @param hits
     */
    public void setHits(org.apache.axis.types.UnsignedLong hits) {
        this.hits = hits;
    }


    /**
     * Gets the established value for this Nsacl6.
     * 
     * @return established
     */
    public boolean isEstablished() {
        return established;
    }


    /**
     * Sets the established value for this Nsacl6.
     * 
     * @param established
     */
    public void setEstablished(boolean established) {
        this.established = established;
    }


    /**
     * Gets the priority value for this Nsacl6.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Nsacl6.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the operatoR value for this Nsacl6.
     * 
     * @return operatoR
     */
    public java.lang.String getOperatoR() {
        return operatoR;
    }


    /**
     * Sets the operatoR value for this Nsacl6.
     * 
     * @param operatoR
     */
    public void setOperatoR(java.lang.String operatoR) {
        this.operatoR = operatoR;
    }


    /**
     * Gets the operatoR2 value for this Nsacl6.
     * 
     * @return operatoR2
     */
    public java.lang.String getOperatoR2() {
        return operatoR2;
    }


    /**
     * Sets the operatoR2 value for this Nsacl6.
     * 
     * @param operatoR2
     */
    public void setOperatoR2(java.lang.String operatoR2) {
        this.operatoR2 = operatoR2;
    }


    /**
     * Gets the operatoR3 value for this Nsacl6.
     * 
     * @return operatoR3
     */
    public java.lang.String getOperatoR3() {
        return operatoR3;
    }


    /**
     * Sets the operatoR3 value for this Nsacl6.
     * 
     * @param operatoR3
     */
    public void setOperatoR3(java.lang.String operatoR3) {
        this.operatoR3 = operatoR3;
    }


    /**
     * Gets the operatoR4 value for this Nsacl6.
     * 
     * @return operatoR4
     */
    public java.lang.String getOperatoR4() {
        return operatoR4;
    }


    /**
     * Sets the operatoR4 value for this Nsacl6.
     * 
     * @param operatoR4
     */
    public void setOperatoR4(java.lang.String operatoR4) {
        this.operatoR4 = operatoR4;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nsacl6)) return false;
        Nsacl6 other = (Nsacl6) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acl6Name==null && other.getAcl6Name()==null) || 
             (this.acl6Name!=null &&
              this.acl6Name.equals(other.getAcl6Name()))) &&
            ((this.acl6Action==null && other.getAcl6Action()==null) || 
             (this.acl6Action!=null &&
              this.acl6Action.equals(other.getAcl6Action()))) &&
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
            ((this.srcipv6Val==null && other.getSrcipv6Val()==null) || 
             (this.srcipv6Val!=null &&
              this.srcipv6Val.equals(other.getSrcipv6Val()))) &&
            ((this.destipv6Val==null && other.getDestipv6Val()==null) || 
             (this.destipv6Val!=null &&
              this.destipv6Val.equals(other.getDestipv6Val()))) &&
            ((this.vlan==null && other.getVlan()==null) || 
             (this.vlan!=null &&
              this.vlan.equals(other.getVlan()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.kernelstate==null && other.getKernelstate()==null) || 
             (this.kernelstate!=null &&
              this.kernelstate.equals(other.getKernelstate()))) &&
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
              this.operatoR4.equals(other.getOperatoR4())));
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
        if (getAcl6Name() != null) {
            _hashCode += getAcl6Name().hashCode();
        }
        if (getAcl6Action() != null) {
            _hashCode += getAcl6Action().hashCode();
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
        if (getSrcipv6Val() != null) {
            _hashCode += getSrcipv6Val().hashCode();
        }
        if (getDestipv6Val() != null) {
            _hashCode += getDestipv6Val().hashCode();
        }
        if (getVlan() != null) {
            _hashCode += getVlan().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getKernelstate() != null) {
            _hashCode += getKernelstate().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nsacl6.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nsacl6"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acl6Name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acl6name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acl6Action");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acl6action"));
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
        elemField.setFieldName("srcipv6Val");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srcipv6val"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destipv6Val");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destipv6val"));
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
        elemField.setFieldName("kernelstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kernelstate"));
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
