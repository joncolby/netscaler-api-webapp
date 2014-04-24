/**
 * Nstcpprofile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nstcpprofile  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String ws;

    private java.lang.String sack;

    private org.apache.axis.types.UnsignedInt wsval;

    private java.lang.String nagle;

    private java.lang.String ackonpush;

    private org.apache.axis.types.UnsignedInt mss;

    private org.apache.axis.types.UnsignedInt maxburst;

    private org.apache.axis.types.UnsignedInt initialcwnd;

    private org.apache.axis.types.UnsignedInt delayedack;

    private org.apache.axis.types.UnsignedInt oooqsize;

    private org.apache.axis.types.UnsignedInt maxpktpermss;

    private org.apache.axis.types.UnsignedInt pktperretx;

    private org.apache.axis.types.UnsignedInt minrto;

    private org.apache.axis.types.UnsignedInt slowstartincr;

    private org.apache.axis.types.UnsignedInt buffersize;

    private java.lang.String flavor;

    private org.apache.axis.types.UnsignedInt refcnt;

    private java.lang.String syncookie;

    private java.lang.String kaprobeupdatelastactivity;

    private java.lang.String dynamicreceivebuffering;

    private java.lang.String ka;

    private org.apache.axis.types.UnsignedInt kaconnidletime;

    private org.apache.axis.types.UnsignedInt kamaxprobes;

    private org.apache.axis.types.UnsignedInt kaprobeinterval;

    private org.apache.axis.types.UnsignedInt sendbuffsize;

    private java.lang.String mptcp;

    private java.lang.String establishclientconn;

    public Nstcpprofile() {
    }

    public Nstcpprofile(
           java.lang.String name,
           java.lang.String ws,
           java.lang.String sack,
           org.apache.axis.types.UnsignedInt wsval,
           java.lang.String nagle,
           java.lang.String ackonpush,
           org.apache.axis.types.UnsignedInt mss,
           org.apache.axis.types.UnsignedInt maxburst,
           org.apache.axis.types.UnsignedInt initialcwnd,
           org.apache.axis.types.UnsignedInt delayedack,
           org.apache.axis.types.UnsignedInt oooqsize,
           org.apache.axis.types.UnsignedInt maxpktpermss,
           org.apache.axis.types.UnsignedInt pktperretx,
           org.apache.axis.types.UnsignedInt minrto,
           org.apache.axis.types.UnsignedInt slowstartincr,
           org.apache.axis.types.UnsignedInt buffersize,
           java.lang.String flavor,
           org.apache.axis.types.UnsignedInt refcnt,
           java.lang.String syncookie,
           java.lang.String kaprobeupdatelastactivity,
           java.lang.String dynamicreceivebuffering,
           java.lang.String ka,
           org.apache.axis.types.UnsignedInt kaconnidletime,
           org.apache.axis.types.UnsignedInt kamaxprobes,
           org.apache.axis.types.UnsignedInt kaprobeinterval,
           org.apache.axis.types.UnsignedInt sendbuffsize,
           java.lang.String mptcp,
           java.lang.String establishclientconn) {
           this.name = name;
           this.ws = ws;
           this.sack = sack;
           this.wsval = wsval;
           this.nagle = nagle;
           this.ackonpush = ackonpush;
           this.mss = mss;
           this.maxburst = maxburst;
           this.initialcwnd = initialcwnd;
           this.delayedack = delayedack;
           this.oooqsize = oooqsize;
           this.maxpktpermss = maxpktpermss;
           this.pktperretx = pktperretx;
           this.minrto = minrto;
           this.slowstartincr = slowstartincr;
           this.buffersize = buffersize;
           this.flavor = flavor;
           this.refcnt = refcnt;
           this.syncookie = syncookie;
           this.kaprobeupdatelastactivity = kaprobeupdatelastactivity;
           this.dynamicreceivebuffering = dynamicreceivebuffering;
           this.ka = ka;
           this.kaconnidletime = kaconnidletime;
           this.kamaxprobes = kamaxprobes;
           this.kaprobeinterval = kaprobeinterval;
           this.sendbuffsize = sendbuffsize;
           this.mptcp = mptcp;
           this.establishclientconn = establishclientconn;
    }


    /**
     * Gets the name value for this Nstcpprofile.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Nstcpprofile.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the ws value for this Nstcpprofile.
     * 
     * @return ws
     */
    public java.lang.String getWs() {
        return ws;
    }


    /**
     * Sets the ws value for this Nstcpprofile.
     * 
     * @param ws
     */
    public void setWs(java.lang.String ws) {
        this.ws = ws;
    }


    /**
     * Gets the sack value for this Nstcpprofile.
     * 
     * @return sack
     */
    public java.lang.String getSack() {
        return sack;
    }


    /**
     * Sets the sack value for this Nstcpprofile.
     * 
     * @param sack
     */
    public void setSack(java.lang.String sack) {
        this.sack = sack;
    }


    /**
     * Gets the wsval value for this Nstcpprofile.
     * 
     * @return wsval
     */
    public org.apache.axis.types.UnsignedInt getWsval() {
        return wsval;
    }


    /**
     * Sets the wsval value for this Nstcpprofile.
     * 
     * @param wsval
     */
    public void setWsval(org.apache.axis.types.UnsignedInt wsval) {
        this.wsval = wsval;
    }


    /**
     * Gets the nagle value for this Nstcpprofile.
     * 
     * @return nagle
     */
    public java.lang.String getNagle() {
        return nagle;
    }


    /**
     * Sets the nagle value for this Nstcpprofile.
     * 
     * @param nagle
     */
    public void setNagle(java.lang.String nagle) {
        this.nagle = nagle;
    }


    /**
     * Gets the ackonpush value for this Nstcpprofile.
     * 
     * @return ackonpush
     */
    public java.lang.String getAckonpush() {
        return ackonpush;
    }


    /**
     * Sets the ackonpush value for this Nstcpprofile.
     * 
     * @param ackonpush
     */
    public void setAckonpush(java.lang.String ackonpush) {
        this.ackonpush = ackonpush;
    }


    /**
     * Gets the mss value for this Nstcpprofile.
     * 
     * @return mss
     */
    public org.apache.axis.types.UnsignedInt getMss() {
        return mss;
    }


    /**
     * Sets the mss value for this Nstcpprofile.
     * 
     * @param mss
     */
    public void setMss(org.apache.axis.types.UnsignedInt mss) {
        this.mss = mss;
    }


    /**
     * Gets the maxburst value for this Nstcpprofile.
     * 
     * @return maxburst
     */
    public org.apache.axis.types.UnsignedInt getMaxburst() {
        return maxburst;
    }


    /**
     * Sets the maxburst value for this Nstcpprofile.
     * 
     * @param maxburst
     */
    public void setMaxburst(org.apache.axis.types.UnsignedInt maxburst) {
        this.maxburst = maxburst;
    }


    /**
     * Gets the initialcwnd value for this Nstcpprofile.
     * 
     * @return initialcwnd
     */
    public org.apache.axis.types.UnsignedInt getInitialcwnd() {
        return initialcwnd;
    }


    /**
     * Sets the initialcwnd value for this Nstcpprofile.
     * 
     * @param initialcwnd
     */
    public void setInitialcwnd(org.apache.axis.types.UnsignedInt initialcwnd) {
        this.initialcwnd = initialcwnd;
    }


    /**
     * Gets the delayedack value for this Nstcpprofile.
     * 
     * @return delayedack
     */
    public org.apache.axis.types.UnsignedInt getDelayedack() {
        return delayedack;
    }


    /**
     * Sets the delayedack value for this Nstcpprofile.
     * 
     * @param delayedack
     */
    public void setDelayedack(org.apache.axis.types.UnsignedInt delayedack) {
        this.delayedack = delayedack;
    }


    /**
     * Gets the oooqsize value for this Nstcpprofile.
     * 
     * @return oooqsize
     */
    public org.apache.axis.types.UnsignedInt getOooqsize() {
        return oooqsize;
    }


    /**
     * Sets the oooqsize value for this Nstcpprofile.
     * 
     * @param oooqsize
     */
    public void setOooqsize(org.apache.axis.types.UnsignedInt oooqsize) {
        this.oooqsize = oooqsize;
    }


    /**
     * Gets the maxpktpermss value for this Nstcpprofile.
     * 
     * @return maxpktpermss
     */
    public org.apache.axis.types.UnsignedInt getMaxpktpermss() {
        return maxpktpermss;
    }


    /**
     * Sets the maxpktpermss value for this Nstcpprofile.
     * 
     * @param maxpktpermss
     */
    public void setMaxpktpermss(org.apache.axis.types.UnsignedInt maxpktpermss) {
        this.maxpktpermss = maxpktpermss;
    }


    /**
     * Gets the pktperretx value for this Nstcpprofile.
     * 
     * @return pktperretx
     */
    public org.apache.axis.types.UnsignedInt getPktperretx() {
        return pktperretx;
    }


    /**
     * Sets the pktperretx value for this Nstcpprofile.
     * 
     * @param pktperretx
     */
    public void setPktperretx(org.apache.axis.types.UnsignedInt pktperretx) {
        this.pktperretx = pktperretx;
    }


    /**
     * Gets the minrto value for this Nstcpprofile.
     * 
     * @return minrto
     */
    public org.apache.axis.types.UnsignedInt getMinrto() {
        return minrto;
    }


    /**
     * Sets the minrto value for this Nstcpprofile.
     * 
     * @param minrto
     */
    public void setMinrto(org.apache.axis.types.UnsignedInt minrto) {
        this.minrto = minrto;
    }


    /**
     * Gets the slowstartincr value for this Nstcpprofile.
     * 
     * @return slowstartincr
     */
    public org.apache.axis.types.UnsignedInt getSlowstartincr() {
        return slowstartincr;
    }


    /**
     * Sets the slowstartincr value for this Nstcpprofile.
     * 
     * @param slowstartincr
     */
    public void setSlowstartincr(org.apache.axis.types.UnsignedInt slowstartincr) {
        this.slowstartincr = slowstartincr;
    }


    /**
     * Gets the buffersize value for this Nstcpprofile.
     * 
     * @return buffersize
     */
    public org.apache.axis.types.UnsignedInt getBuffersize() {
        return buffersize;
    }


    /**
     * Sets the buffersize value for this Nstcpprofile.
     * 
     * @param buffersize
     */
    public void setBuffersize(org.apache.axis.types.UnsignedInt buffersize) {
        this.buffersize = buffersize;
    }


    /**
     * Gets the flavor value for this Nstcpprofile.
     * 
     * @return flavor
     */
    public java.lang.String getFlavor() {
        return flavor;
    }


    /**
     * Sets the flavor value for this Nstcpprofile.
     * 
     * @param flavor
     */
    public void setFlavor(java.lang.String flavor) {
        this.flavor = flavor;
    }


    /**
     * Gets the refcnt value for this Nstcpprofile.
     * 
     * @return refcnt
     */
    public org.apache.axis.types.UnsignedInt getRefcnt() {
        return refcnt;
    }


    /**
     * Sets the refcnt value for this Nstcpprofile.
     * 
     * @param refcnt
     */
    public void setRefcnt(org.apache.axis.types.UnsignedInt refcnt) {
        this.refcnt = refcnt;
    }


    /**
     * Gets the syncookie value for this Nstcpprofile.
     * 
     * @return syncookie
     */
    public java.lang.String getSyncookie() {
        return syncookie;
    }


    /**
     * Sets the syncookie value for this Nstcpprofile.
     * 
     * @param syncookie
     */
    public void setSyncookie(java.lang.String syncookie) {
        this.syncookie = syncookie;
    }


    /**
     * Gets the kaprobeupdatelastactivity value for this Nstcpprofile.
     * 
     * @return kaprobeupdatelastactivity
     */
    public java.lang.String getKaprobeupdatelastactivity() {
        return kaprobeupdatelastactivity;
    }


    /**
     * Sets the kaprobeupdatelastactivity value for this Nstcpprofile.
     * 
     * @param kaprobeupdatelastactivity
     */
    public void setKaprobeupdatelastactivity(java.lang.String kaprobeupdatelastactivity) {
        this.kaprobeupdatelastactivity = kaprobeupdatelastactivity;
    }


    /**
     * Gets the dynamicreceivebuffering value for this Nstcpprofile.
     * 
     * @return dynamicreceivebuffering
     */
    public java.lang.String getDynamicreceivebuffering() {
        return dynamicreceivebuffering;
    }


    /**
     * Sets the dynamicreceivebuffering value for this Nstcpprofile.
     * 
     * @param dynamicreceivebuffering
     */
    public void setDynamicreceivebuffering(java.lang.String dynamicreceivebuffering) {
        this.dynamicreceivebuffering = dynamicreceivebuffering;
    }


    /**
     * Gets the ka value for this Nstcpprofile.
     * 
     * @return ka
     */
    public java.lang.String getKa() {
        return ka;
    }


    /**
     * Sets the ka value for this Nstcpprofile.
     * 
     * @param ka
     */
    public void setKa(java.lang.String ka) {
        this.ka = ka;
    }


    /**
     * Gets the kaconnidletime value for this Nstcpprofile.
     * 
     * @return kaconnidletime
     */
    public org.apache.axis.types.UnsignedInt getKaconnidletime() {
        return kaconnidletime;
    }


    /**
     * Sets the kaconnidletime value for this Nstcpprofile.
     * 
     * @param kaconnidletime
     */
    public void setKaconnidletime(org.apache.axis.types.UnsignedInt kaconnidletime) {
        this.kaconnidletime = kaconnidletime;
    }


    /**
     * Gets the kamaxprobes value for this Nstcpprofile.
     * 
     * @return kamaxprobes
     */
    public org.apache.axis.types.UnsignedInt getKamaxprobes() {
        return kamaxprobes;
    }


    /**
     * Sets the kamaxprobes value for this Nstcpprofile.
     * 
     * @param kamaxprobes
     */
    public void setKamaxprobes(org.apache.axis.types.UnsignedInt kamaxprobes) {
        this.kamaxprobes = kamaxprobes;
    }


    /**
     * Gets the kaprobeinterval value for this Nstcpprofile.
     * 
     * @return kaprobeinterval
     */
    public org.apache.axis.types.UnsignedInt getKaprobeinterval() {
        return kaprobeinterval;
    }


    /**
     * Sets the kaprobeinterval value for this Nstcpprofile.
     * 
     * @param kaprobeinterval
     */
    public void setKaprobeinterval(org.apache.axis.types.UnsignedInt kaprobeinterval) {
        this.kaprobeinterval = kaprobeinterval;
    }


    /**
     * Gets the sendbuffsize value for this Nstcpprofile.
     * 
     * @return sendbuffsize
     */
    public org.apache.axis.types.UnsignedInt getSendbuffsize() {
        return sendbuffsize;
    }


    /**
     * Sets the sendbuffsize value for this Nstcpprofile.
     * 
     * @param sendbuffsize
     */
    public void setSendbuffsize(org.apache.axis.types.UnsignedInt sendbuffsize) {
        this.sendbuffsize = sendbuffsize;
    }


    /**
     * Gets the mptcp value for this Nstcpprofile.
     * 
     * @return mptcp
     */
    public java.lang.String getMptcp() {
        return mptcp;
    }


    /**
     * Sets the mptcp value for this Nstcpprofile.
     * 
     * @param mptcp
     */
    public void setMptcp(java.lang.String mptcp) {
        this.mptcp = mptcp;
    }


    /**
     * Gets the establishclientconn value for this Nstcpprofile.
     * 
     * @return establishclientconn
     */
    public java.lang.String getEstablishclientconn() {
        return establishclientconn;
    }


    /**
     * Sets the establishclientconn value for this Nstcpprofile.
     * 
     * @param establishclientconn
     */
    public void setEstablishclientconn(java.lang.String establishclientconn) {
        this.establishclientconn = establishclientconn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nstcpprofile)) return false;
        Nstcpprofile other = (Nstcpprofile) obj;
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
            ((this.ws==null && other.getWs()==null) || 
             (this.ws!=null &&
              this.ws.equals(other.getWs()))) &&
            ((this.sack==null && other.getSack()==null) || 
             (this.sack!=null &&
              this.sack.equals(other.getSack()))) &&
            ((this.wsval==null && other.getWsval()==null) || 
             (this.wsval!=null &&
              this.wsval.equals(other.getWsval()))) &&
            ((this.nagle==null && other.getNagle()==null) || 
             (this.nagle!=null &&
              this.nagle.equals(other.getNagle()))) &&
            ((this.ackonpush==null && other.getAckonpush()==null) || 
             (this.ackonpush!=null &&
              this.ackonpush.equals(other.getAckonpush()))) &&
            ((this.mss==null && other.getMss()==null) || 
             (this.mss!=null &&
              this.mss.equals(other.getMss()))) &&
            ((this.maxburst==null && other.getMaxburst()==null) || 
             (this.maxburst!=null &&
              this.maxburst.equals(other.getMaxburst()))) &&
            ((this.initialcwnd==null && other.getInitialcwnd()==null) || 
             (this.initialcwnd!=null &&
              this.initialcwnd.equals(other.getInitialcwnd()))) &&
            ((this.delayedack==null && other.getDelayedack()==null) || 
             (this.delayedack!=null &&
              this.delayedack.equals(other.getDelayedack()))) &&
            ((this.oooqsize==null && other.getOooqsize()==null) || 
             (this.oooqsize!=null &&
              this.oooqsize.equals(other.getOooqsize()))) &&
            ((this.maxpktpermss==null && other.getMaxpktpermss()==null) || 
             (this.maxpktpermss!=null &&
              this.maxpktpermss.equals(other.getMaxpktpermss()))) &&
            ((this.pktperretx==null && other.getPktperretx()==null) || 
             (this.pktperretx!=null &&
              this.pktperretx.equals(other.getPktperretx()))) &&
            ((this.minrto==null && other.getMinrto()==null) || 
             (this.minrto!=null &&
              this.minrto.equals(other.getMinrto()))) &&
            ((this.slowstartincr==null && other.getSlowstartincr()==null) || 
             (this.slowstartincr!=null &&
              this.slowstartincr.equals(other.getSlowstartincr()))) &&
            ((this.buffersize==null && other.getBuffersize()==null) || 
             (this.buffersize!=null &&
              this.buffersize.equals(other.getBuffersize()))) &&
            ((this.flavor==null && other.getFlavor()==null) || 
             (this.flavor!=null &&
              this.flavor.equals(other.getFlavor()))) &&
            ((this.refcnt==null && other.getRefcnt()==null) || 
             (this.refcnt!=null &&
              this.refcnt.equals(other.getRefcnt()))) &&
            ((this.syncookie==null && other.getSyncookie()==null) || 
             (this.syncookie!=null &&
              this.syncookie.equals(other.getSyncookie()))) &&
            ((this.kaprobeupdatelastactivity==null && other.getKaprobeupdatelastactivity()==null) || 
             (this.kaprobeupdatelastactivity!=null &&
              this.kaprobeupdatelastactivity.equals(other.getKaprobeupdatelastactivity()))) &&
            ((this.dynamicreceivebuffering==null && other.getDynamicreceivebuffering()==null) || 
             (this.dynamicreceivebuffering!=null &&
              this.dynamicreceivebuffering.equals(other.getDynamicreceivebuffering()))) &&
            ((this.ka==null && other.getKa()==null) || 
             (this.ka!=null &&
              this.ka.equals(other.getKa()))) &&
            ((this.kaconnidletime==null && other.getKaconnidletime()==null) || 
             (this.kaconnidletime!=null &&
              this.kaconnidletime.equals(other.getKaconnidletime()))) &&
            ((this.kamaxprobes==null && other.getKamaxprobes()==null) || 
             (this.kamaxprobes!=null &&
              this.kamaxprobes.equals(other.getKamaxprobes()))) &&
            ((this.kaprobeinterval==null && other.getKaprobeinterval()==null) || 
             (this.kaprobeinterval!=null &&
              this.kaprobeinterval.equals(other.getKaprobeinterval()))) &&
            ((this.sendbuffsize==null && other.getSendbuffsize()==null) || 
             (this.sendbuffsize!=null &&
              this.sendbuffsize.equals(other.getSendbuffsize()))) &&
            ((this.mptcp==null && other.getMptcp()==null) || 
             (this.mptcp!=null &&
              this.mptcp.equals(other.getMptcp()))) &&
            ((this.establishclientconn==null && other.getEstablishclientconn()==null) || 
             (this.establishclientconn!=null &&
              this.establishclientconn.equals(other.getEstablishclientconn())));
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
        if (getWs() != null) {
            _hashCode += getWs().hashCode();
        }
        if (getSack() != null) {
            _hashCode += getSack().hashCode();
        }
        if (getWsval() != null) {
            _hashCode += getWsval().hashCode();
        }
        if (getNagle() != null) {
            _hashCode += getNagle().hashCode();
        }
        if (getAckonpush() != null) {
            _hashCode += getAckonpush().hashCode();
        }
        if (getMss() != null) {
            _hashCode += getMss().hashCode();
        }
        if (getMaxburst() != null) {
            _hashCode += getMaxburst().hashCode();
        }
        if (getInitialcwnd() != null) {
            _hashCode += getInitialcwnd().hashCode();
        }
        if (getDelayedack() != null) {
            _hashCode += getDelayedack().hashCode();
        }
        if (getOooqsize() != null) {
            _hashCode += getOooqsize().hashCode();
        }
        if (getMaxpktpermss() != null) {
            _hashCode += getMaxpktpermss().hashCode();
        }
        if (getPktperretx() != null) {
            _hashCode += getPktperretx().hashCode();
        }
        if (getMinrto() != null) {
            _hashCode += getMinrto().hashCode();
        }
        if (getSlowstartincr() != null) {
            _hashCode += getSlowstartincr().hashCode();
        }
        if (getBuffersize() != null) {
            _hashCode += getBuffersize().hashCode();
        }
        if (getFlavor() != null) {
            _hashCode += getFlavor().hashCode();
        }
        if (getRefcnt() != null) {
            _hashCode += getRefcnt().hashCode();
        }
        if (getSyncookie() != null) {
            _hashCode += getSyncookie().hashCode();
        }
        if (getKaprobeupdatelastactivity() != null) {
            _hashCode += getKaprobeupdatelastactivity().hashCode();
        }
        if (getDynamicreceivebuffering() != null) {
            _hashCode += getDynamicreceivebuffering().hashCode();
        }
        if (getKa() != null) {
            _hashCode += getKa().hashCode();
        }
        if (getKaconnidletime() != null) {
            _hashCode += getKaconnidletime().hashCode();
        }
        if (getKamaxprobes() != null) {
            _hashCode += getKamaxprobes().hashCode();
        }
        if (getKaprobeinterval() != null) {
            _hashCode += getKaprobeinterval().hashCode();
        }
        if (getSendbuffsize() != null) {
            _hashCode += getSendbuffsize().hashCode();
        }
        if (getMptcp() != null) {
            _hashCode += getMptcp().hashCode();
        }
        if (getEstablishclientconn() != null) {
            _hashCode += getEstablishclientconn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nstcpprofile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nstcpprofile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sack");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sack"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wsval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wsval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nagle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nagle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ackonpush");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ackonpush"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mss");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxburst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxburst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialcwnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "initialcwnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delayedack");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delayedack"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oooqsize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oooqsize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxpktpermss");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxpktpermss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pktperretx");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pktperretx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minrto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minrto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slowstartincr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slowstartincr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("buffersize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "buffersize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flavor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flavor"));
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
        elemField.setFieldName("syncookie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "syncookie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kaprobeupdatelastactivity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kaprobeupdatelastactivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamicreceivebuffering");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dynamicreceivebuffering"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ka");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ka"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kaconnidletime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kaconnidletime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kamaxprobes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kamaxprobes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kaprobeinterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kaprobeinterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendbuffsize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendbuffsize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mptcp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mptcp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("establishclientconn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "establishclientconn"));
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
