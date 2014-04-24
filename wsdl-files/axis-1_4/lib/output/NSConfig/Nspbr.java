/**
 * Nspbr.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nspbr  implements java.io.Serializable {
    private java.lang.String name;

    private boolean detail;

    private java.lang.String actioN;

    private java.lang.String srcmac;

    private java.lang.String protocol;

    private org.apache.axis.types.UnsignedInt protocolnumber;

    private java.lang.String srcportval;

    private java.lang.String destportval;

    private java.lang.String srcipval;

    private java.lang.String destipval;

    private org.apache.axis.types.UnsignedInt vlan;

    private java.lang.String state;

    private java.lang.String interfacE;

    private org.apache.axis.types.UnsignedLong hits;

    private org.apache.axis.types.UnsignedInt priority;

    private java.lang.String operatoR;

    private java.lang.String operatoR2;

    private java.lang.String operatoR3;

    private java.lang.String operatoR4;

    private java.lang.String kernelstate;

    private java.lang.String nexthopval;

    private java.lang.String iptunnelname;

    private java.lang.String msr;

    private java.lang.String monitor;

    private org.apache.axis.types.UnsignedInt state2;

    private org.apache.axis.types.UnsignedInt totalprobes;

    private org.apache.axis.types.UnsignedInt totalfailedprobes;

    private org.apache.axis.types.UnsignedInt failedprobes;

    private int monstatcode;

    private int monstatparam1;

    private int monstatparam2;

    private int monstatparam3;

    private boolean data;

    public Nspbr() {
    }

    public Nspbr(
           java.lang.String name,
           boolean detail,
           java.lang.String actioN,
           java.lang.String srcmac,
           java.lang.String protocol,
           org.apache.axis.types.UnsignedInt protocolnumber,
           java.lang.String srcportval,
           java.lang.String destportval,
           java.lang.String srcipval,
           java.lang.String destipval,
           org.apache.axis.types.UnsignedInt vlan,
           java.lang.String state,
           java.lang.String interfacE,
           org.apache.axis.types.UnsignedLong hits,
           org.apache.axis.types.UnsignedInt priority,
           java.lang.String operatoR,
           java.lang.String operatoR2,
           java.lang.String operatoR3,
           java.lang.String operatoR4,
           java.lang.String kernelstate,
           java.lang.String nexthopval,
           java.lang.String iptunnelname,
           java.lang.String msr,
           java.lang.String monitor,
           org.apache.axis.types.UnsignedInt state2,
           org.apache.axis.types.UnsignedInt totalprobes,
           org.apache.axis.types.UnsignedInt totalfailedprobes,
           org.apache.axis.types.UnsignedInt failedprobes,
           int monstatcode,
           int monstatparam1,
           int monstatparam2,
           int monstatparam3,
           boolean data) {
           this.name = name;
           this.detail = detail;
           this.actioN = actioN;
           this.srcmac = srcmac;
           this.protocol = protocol;
           this.protocolnumber = protocolnumber;
           this.srcportval = srcportval;
           this.destportval = destportval;
           this.srcipval = srcipval;
           this.destipval = destipval;
           this.vlan = vlan;
           this.state = state;
           this.interfacE = interfacE;
           this.hits = hits;
           this.priority = priority;
           this.operatoR = operatoR;
           this.operatoR2 = operatoR2;
           this.operatoR3 = operatoR3;
           this.operatoR4 = operatoR4;
           this.kernelstate = kernelstate;
           this.nexthopval = nexthopval;
           this.iptunnelname = iptunnelname;
           this.msr = msr;
           this.monitor = monitor;
           this.state2 = state2;
           this.totalprobes = totalprobes;
           this.totalfailedprobes = totalfailedprobes;
           this.failedprobes = failedprobes;
           this.monstatcode = monstatcode;
           this.monstatparam1 = monstatparam1;
           this.monstatparam2 = monstatparam2;
           this.monstatparam3 = monstatparam3;
           this.data = data;
    }


    /**
     * Gets the name value for this Nspbr.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Nspbr.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the detail value for this Nspbr.
     * 
     * @return detail
     */
    public boolean isDetail() {
        return detail;
    }


    /**
     * Sets the detail value for this Nspbr.
     * 
     * @param detail
     */
    public void setDetail(boolean detail) {
        this.detail = detail;
    }


    /**
     * Gets the actioN value for this Nspbr.
     * 
     * @return actioN
     */
    public java.lang.String getActioN() {
        return actioN;
    }


    /**
     * Sets the actioN value for this Nspbr.
     * 
     * @param actioN
     */
    public void setActioN(java.lang.String actioN) {
        this.actioN = actioN;
    }


    /**
     * Gets the srcmac value for this Nspbr.
     * 
     * @return srcmac
     */
    public java.lang.String getSrcmac() {
        return srcmac;
    }


    /**
     * Sets the srcmac value for this Nspbr.
     * 
     * @param srcmac
     */
    public void setSrcmac(java.lang.String srcmac) {
        this.srcmac = srcmac;
    }


    /**
     * Gets the protocol value for this Nspbr.
     * 
     * @return protocol
     */
    public java.lang.String getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this Nspbr.
     * 
     * @param protocol
     */
    public void setProtocol(java.lang.String protocol) {
        this.protocol = protocol;
    }


    /**
     * Gets the protocolnumber value for this Nspbr.
     * 
     * @return protocolnumber
     */
    public org.apache.axis.types.UnsignedInt getProtocolnumber() {
        return protocolnumber;
    }


    /**
     * Sets the protocolnumber value for this Nspbr.
     * 
     * @param protocolnumber
     */
    public void setProtocolnumber(org.apache.axis.types.UnsignedInt protocolnumber) {
        this.protocolnumber = protocolnumber;
    }


    /**
     * Gets the srcportval value for this Nspbr.
     * 
     * @return srcportval
     */
    public java.lang.String getSrcportval() {
        return srcportval;
    }


    /**
     * Sets the srcportval value for this Nspbr.
     * 
     * @param srcportval
     */
    public void setSrcportval(java.lang.String srcportval) {
        this.srcportval = srcportval;
    }


    /**
     * Gets the destportval value for this Nspbr.
     * 
     * @return destportval
     */
    public java.lang.String getDestportval() {
        return destportval;
    }


    /**
     * Sets the destportval value for this Nspbr.
     * 
     * @param destportval
     */
    public void setDestportval(java.lang.String destportval) {
        this.destportval = destportval;
    }


    /**
     * Gets the srcipval value for this Nspbr.
     * 
     * @return srcipval
     */
    public java.lang.String getSrcipval() {
        return srcipval;
    }


    /**
     * Sets the srcipval value for this Nspbr.
     * 
     * @param srcipval
     */
    public void setSrcipval(java.lang.String srcipval) {
        this.srcipval = srcipval;
    }


    /**
     * Gets the destipval value for this Nspbr.
     * 
     * @return destipval
     */
    public java.lang.String getDestipval() {
        return destipval;
    }


    /**
     * Sets the destipval value for this Nspbr.
     * 
     * @param destipval
     */
    public void setDestipval(java.lang.String destipval) {
        this.destipval = destipval;
    }


    /**
     * Gets the vlan value for this Nspbr.
     * 
     * @return vlan
     */
    public org.apache.axis.types.UnsignedInt getVlan() {
        return vlan;
    }


    /**
     * Sets the vlan value for this Nspbr.
     * 
     * @param vlan
     */
    public void setVlan(org.apache.axis.types.UnsignedInt vlan) {
        this.vlan = vlan;
    }


    /**
     * Gets the state value for this Nspbr.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Nspbr.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the interfacE value for this Nspbr.
     * 
     * @return interfacE
     */
    public java.lang.String getInterfacE() {
        return interfacE;
    }


    /**
     * Sets the interfacE value for this Nspbr.
     * 
     * @param interfacE
     */
    public void setInterfacE(java.lang.String interfacE) {
        this.interfacE = interfacE;
    }


    /**
     * Gets the hits value for this Nspbr.
     * 
     * @return hits
     */
    public org.apache.axis.types.UnsignedLong getHits() {
        return hits;
    }


    /**
     * Sets the hits value for this Nspbr.
     * 
     * @param hits
     */
    public void setHits(org.apache.axis.types.UnsignedLong hits) {
        this.hits = hits;
    }


    /**
     * Gets the priority value for this Nspbr.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Nspbr.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the operatoR value for this Nspbr.
     * 
     * @return operatoR
     */
    public java.lang.String getOperatoR() {
        return operatoR;
    }


    /**
     * Sets the operatoR value for this Nspbr.
     * 
     * @param operatoR
     */
    public void setOperatoR(java.lang.String operatoR) {
        this.operatoR = operatoR;
    }


    /**
     * Gets the operatoR2 value for this Nspbr.
     * 
     * @return operatoR2
     */
    public java.lang.String getOperatoR2() {
        return operatoR2;
    }


    /**
     * Sets the operatoR2 value for this Nspbr.
     * 
     * @param operatoR2
     */
    public void setOperatoR2(java.lang.String operatoR2) {
        this.operatoR2 = operatoR2;
    }


    /**
     * Gets the operatoR3 value for this Nspbr.
     * 
     * @return operatoR3
     */
    public java.lang.String getOperatoR3() {
        return operatoR3;
    }


    /**
     * Sets the operatoR3 value for this Nspbr.
     * 
     * @param operatoR3
     */
    public void setOperatoR3(java.lang.String operatoR3) {
        this.operatoR3 = operatoR3;
    }


    /**
     * Gets the operatoR4 value for this Nspbr.
     * 
     * @return operatoR4
     */
    public java.lang.String getOperatoR4() {
        return operatoR4;
    }


    /**
     * Sets the operatoR4 value for this Nspbr.
     * 
     * @param operatoR4
     */
    public void setOperatoR4(java.lang.String operatoR4) {
        this.operatoR4 = operatoR4;
    }


    /**
     * Gets the kernelstate value for this Nspbr.
     * 
     * @return kernelstate
     */
    public java.lang.String getKernelstate() {
        return kernelstate;
    }


    /**
     * Sets the kernelstate value for this Nspbr.
     * 
     * @param kernelstate
     */
    public void setKernelstate(java.lang.String kernelstate) {
        this.kernelstate = kernelstate;
    }


    /**
     * Gets the nexthopval value for this Nspbr.
     * 
     * @return nexthopval
     */
    public java.lang.String getNexthopval() {
        return nexthopval;
    }


    /**
     * Sets the nexthopval value for this Nspbr.
     * 
     * @param nexthopval
     */
    public void setNexthopval(java.lang.String nexthopval) {
        this.nexthopval = nexthopval;
    }


    /**
     * Gets the iptunnelname value for this Nspbr.
     * 
     * @return iptunnelname
     */
    public java.lang.String getIptunnelname() {
        return iptunnelname;
    }


    /**
     * Sets the iptunnelname value for this Nspbr.
     * 
     * @param iptunnelname
     */
    public void setIptunnelname(java.lang.String iptunnelname) {
        this.iptunnelname = iptunnelname;
    }


    /**
     * Gets the msr value for this Nspbr.
     * 
     * @return msr
     */
    public java.lang.String getMsr() {
        return msr;
    }


    /**
     * Sets the msr value for this Nspbr.
     * 
     * @param msr
     */
    public void setMsr(java.lang.String msr) {
        this.msr = msr;
    }


    /**
     * Gets the monitor value for this Nspbr.
     * 
     * @return monitor
     */
    public java.lang.String getMonitor() {
        return monitor;
    }


    /**
     * Sets the monitor value for this Nspbr.
     * 
     * @param monitor
     */
    public void setMonitor(java.lang.String monitor) {
        this.monitor = monitor;
    }


    /**
     * Gets the state2 value for this Nspbr.
     * 
     * @return state2
     */
    public org.apache.axis.types.UnsignedInt getState2() {
        return state2;
    }


    /**
     * Sets the state2 value for this Nspbr.
     * 
     * @param state2
     */
    public void setState2(org.apache.axis.types.UnsignedInt state2) {
        this.state2 = state2;
    }


    /**
     * Gets the totalprobes value for this Nspbr.
     * 
     * @return totalprobes
     */
    public org.apache.axis.types.UnsignedInt getTotalprobes() {
        return totalprobes;
    }


    /**
     * Sets the totalprobes value for this Nspbr.
     * 
     * @param totalprobes
     */
    public void setTotalprobes(org.apache.axis.types.UnsignedInt totalprobes) {
        this.totalprobes = totalprobes;
    }


    /**
     * Gets the totalfailedprobes value for this Nspbr.
     * 
     * @return totalfailedprobes
     */
    public org.apache.axis.types.UnsignedInt getTotalfailedprobes() {
        return totalfailedprobes;
    }


    /**
     * Sets the totalfailedprobes value for this Nspbr.
     * 
     * @param totalfailedprobes
     */
    public void setTotalfailedprobes(org.apache.axis.types.UnsignedInt totalfailedprobes) {
        this.totalfailedprobes = totalfailedprobes;
    }


    /**
     * Gets the failedprobes value for this Nspbr.
     * 
     * @return failedprobes
     */
    public org.apache.axis.types.UnsignedInt getFailedprobes() {
        return failedprobes;
    }


    /**
     * Sets the failedprobes value for this Nspbr.
     * 
     * @param failedprobes
     */
    public void setFailedprobes(org.apache.axis.types.UnsignedInt failedprobes) {
        this.failedprobes = failedprobes;
    }


    /**
     * Gets the monstatcode value for this Nspbr.
     * 
     * @return monstatcode
     */
    public int getMonstatcode() {
        return monstatcode;
    }


    /**
     * Sets the monstatcode value for this Nspbr.
     * 
     * @param monstatcode
     */
    public void setMonstatcode(int monstatcode) {
        this.monstatcode = monstatcode;
    }


    /**
     * Gets the monstatparam1 value for this Nspbr.
     * 
     * @return monstatparam1
     */
    public int getMonstatparam1() {
        return monstatparam1;
    }


    /**
     * Sets the monstatparam1 value for this Nspbr.
     * 
     * @param monstatparam1
     */
    public void setMonstatparam1(int monstatparam1) {
        this.monstatparam1 = monstatparam1;
    }


    /**
     * Gets the monstatparam2 value for this Nspbr.
     * 
     * @return monstatparam2
     */
    public int getMonstatparam2() {
        return monstatparam2;
    }


    /**
     * Sets the monstatparam2 value for this Nspbr.
     * 
     * @param monstatparam2
     */
    public void setMonstatparam2(int monstatparam2) {
        this.monstatparam2 = monstatparam2;
    }


    /**
     * Gets the monstatparam3 value for this Nspbr.
     * 
     * @return monstatparam3
     */
    public int getMonstatparam3() {
        return monstatparam3;
    }


    /**
     * Sets the monstatparam3 value for this Nspbr.
     * 
     * @param monstatparam3
     */
    public void setMonstatparam3(int monstatparam3) {
        this.monstatparam3 = monstatparam3;
    }


    /**
     * Gets the data value for this Nspbr.
     * 
     * @return data
     */
    public boolean isData() {
        return data;
    }


    /**
     * Sets the data value for this Nspbr.
     * 
     * @param data
     */
    public void setData(boolean data) {
        this.data = data;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nspbr)) return false;
        Nspbr other = (Nspbr) obj;
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
            this.detail == other.isDetail() &&
            ((this.actioN==null && other.getActioN()==null) || 
             (this.actioN!=null &&
              this.actioN.equals(other.getActioN()))) &&
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
            ((this.interfacE==null && other.getInterfacE()==null) || 
             (this.interfacE!=null &&
              this.interfacE.equals(other.getInterfacE()))) &&
            ((this.hits==null && other.getHits()==null) || 
             (this.hits!=null &&
              this.hits.equals(other.getHits()))) &&
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
            ((this.nexthopval==null && other.getNexthopval()==null) || 
             (this.nexthopval!=null &&
              this.nexthopval.equals(other.getNexthopval()))) &&
            ((this.iptunnelname==null && other.getIptunnelname()==null) || 
             (this.iptunnelname!=null &&
              this.iptunnelname.equals(other.getIptunnelname()))) &&
            ((this.msr==null && other.getMsr()==null) || 
             (this.msr!=null &&
              this.msr.equals(other.getMsr()))) &&
            ((this.monitor==null && other.getMonitor()==null) || 
             (this.monitor!=null &&
              this.monitor.equals(other.getMonitor()))) &&
            ((this.state2==null && other.getState2()==null) || 
             (this.state2!=null &&
              this.state2.equals(other.getState2()))) &&
            ((this.totalprobes==null && other.getTotalprobes()==null) || 
             (this.totalprobes!=null &&
              this.totalprobes.equals(other.getTotalprobes()))) &&
            ((this.totalfailedprobes==null && other.getTotalfailedprobes()==null) || 
             (this.totalfailedprobes!=null &&
              this.totalfailedprobes.equals(other.getTotalfailedprobes()))) &&
            ((this.failedprobes==null && other.getFailedprobes()==null) || 
             (this.failedprobes!=null &&
              this.failedprobes.equals(other.getFailedprobes()))) &&
            this.monstatcode == other.getMonstatcode() &&
            this.monstatparam1 == other.getMonstatparam1() &&
            this.monstatparam2 == other.getMonstatparam2() &&
            this.monstatparam3 == other.getMonstatparam3() &&
            this.data == other.isData();
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
        _hashCode += (isDetail() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getActioN() != null) {
            _hashCode += getActioN().hashCode();
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
        if (getInterfacE() != null) {
            _hashCode += getInterfacE().hashCode();
        }
        if (getHits() != null) {
            _hashCode += getHits().hashCode();
        }
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
        if (getNexthopval() != null) {
            _hashCode += getNexthopval().hashCode();
        }
        if (getIptunnelname() != null) {
            _hashCode += getIptunnelname().hashCode();
        }
        if (getMsr() != null) {
            _hashCode += getMsr().hashCode();
        }
        if (getMonitor() != null) {
            _hashCode += getMonitor().hashCode();
        }
        if (getState2() != null) {
            _hashCode += getState2().hashCode();
        }
        if (getTotalprobes() != null) {
            _hashCode += getTotalprobes().hashCode();
        }
        if (getTotalfailedprobes() != null) {
            _hashCode += getTotalfailedprobes().hashCode();
        }
        if (getFailedprobes() != null) {
            _hashCode += getFailedprobes().hashCode();
        }
        _hashCode += getMonstatcode();
        _hashCode += getMonstatparam1();
        _hashCode += getMonstatparam2();
        _hashCode += getMonstatparam3();
        _hashCode += (isData() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nspbr.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nspbr"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actioN");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actioN"));
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
        elemField.setFieldName("nexthopval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nexthopval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iptunnelname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iptunnelname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monitor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monitor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalprobes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalprobes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalfailedprobes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalfailedprobes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("failedprobes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "failedprobes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monstatcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monstatcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monstatparam1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monstatparam1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monstatparam2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monstatparam2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monstatparam3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monstatparam3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
