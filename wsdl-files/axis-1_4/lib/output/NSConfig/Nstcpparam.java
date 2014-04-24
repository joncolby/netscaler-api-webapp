/**
 * Nstcpparam.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nstcpparam  implements java.io.Serializable {
    private java.lang.String ws;

    private org.apache.axis.types.UnsignedInt wsval;

    private java.lang.String sack;

    private java.lang.String learnvsvrmss;

    private org.apache.axis.types.UnsignedInt maxburst;

    private org.apache.axis.types.UnsignedInt initialcwnd;

    private org.apache.axis.types.UnsignedInt recvbuffsize;

    private org.apache.axis.types.UnsignedInt delayedack;

    private java.lang.String downstaterst;

    private java.lang.String nagle;

    private java.lang.String limitedpersist;

    private org.apache.axis.types.UnsignedInt oooqsize;

    private java.lang.String ackonpush;

    private int maxpktpermss;

    private int pktperretx;

    private int minrto;

    private int slowstartincr;

    private org.apache.axis.types.UnsignedInt maxdynserverprobes;

    private org.apache.axis.types.UnsignedInt synholdfastgiveup;

    private org.apache.axis.types.UnsignedInt maxsynholdperprobe;

    private org.apache.axis.types.UnsignedInt maxsynhold;

    private org.apache.axis.types.UnsignedInt msslearninterval;

    private org.apache.axis.types.UnsignedInt msslearndelay;

    private org.apache.axis.types.UnsignedInt maxtimewaitconn;

    private java.lang.String kaprobeupdatelastactivity;

    private org.apache.axis.types.UnsignedInt maxsynackretx;

    private java.lang.String synattackdetection;

    private java.lang.String connflushifnomem;

    private org.apache.axis.types.UnsignedInt connflushthres;

    private java.lang.String mptcpconcloseonpassivesf;

    private java.lang.String mptcpchecksum;

    private org.apache.axis.types.UnsignedInt mptcpsftimeout;

    private org.apache.axis.types.UnsignedInt mptcpsfreplacetimeout;

    private org.apache.axis.types.UnsignedInt mptcpmaxsf;

    private org.apache.axis.types.UnsignedInt mptcpmaxpendingsf;

    private org.apache.axis.types.UnsignedInt mptcppendingjointhreshold;

    private org.apache.axis.types.UnsignedInt mptcprtostoswitchsf;

    private java.lang.String mptcpusebackupondss;

    private org.apache.axis.types.UnsignedInt tcpmaxretries;

    private java.lang.String mptcpimmediatesfcloseonfin;

    public Nstcpparam() {
    }

    public Nstcpparam(
           java.lang.String ws,
           org.apache.axis.types.UnsignedInt wsval,
           java.lang.String sack,
           java.lang.String learnvsvrmss,
           org.apache.axis.types.UnsignedInt maxburst,
           org.apache.axis.types.UnsignedInt initialcwnd,
           org.apache.axis.types.UnsignedInt recvbuffsize,
           org.apache.axis.types.UnsignedInt delayedack,
           java.lang.String downstaterst,
           java.lang.String nagle,
           java.lang.String limitedpersist,
           org.apache.axis.types.UnsignedInt oooqsize,
           java.lang.String ackonpush,
           int maxpktpermss,
           int pktperretx,
           int minrto,
           int slowstartincr,
           org.apache.axis.types.UnsignedInt maxdynserverprobes,
           org.apache.axis.types.UnsignedInt synholdfastgiveup,
           org.apache.axis.types.UnsignedInt maxsynholdperprobe,
           org.apache.axis.types.UnsignedInt maxsynhold,
           org.apache.axis.types.UnsignedInt msslearninterval,
           org.apache.axis.types.UnsignedInt msslearndelay,
           org.apache.axis.types.UnsignedInt maxtimewaitconn,
           java.lang.String kaprobeupdatelastactivity,
           org.apache.axis.types.UnsignedInt maxsynackretx,
           java.lang.String synattackdetection,
           java.lang.String connflushifnomem,
           org.apache.axis.types.UnsignedInt connflushthres,
           java.lang.String mptcpconcloseonpassivesf,
           java.lang.String mptcpchecksum,
           org.apache.axis.types.UnsignedInt mptcpsftimeout,
           org.apache.axis.types.UnsignedInt mptcpsfreplacetimeout,
           org.apache.axis.types.UnsignedInt mptcpmaxsf,
           org.apache.axis.types.UnsignedInt mptcpmaxpendingsf,
           org.apache.axis.types.UnsignedInt mptcppendingjointhreshold,
           org.apache.axis.types.UnsignedInt mptcprtostoswitchsf,
           java.lang.String mptcpusebackupondss,
           org.apache.axis.types.UnsignedInt tcpmaxretries,
           java.lang.String mptcpimmediatesfcloseonfin) {
           this.ws = ws;
           this.wsval = wsval;
           this.sack = sack;
           this.learnvsvrmss = learnvsvrmss;
           this.maxburst = maxburst;
           this.initialcwnd = initialcwnd;
           this.recvbuffsize = recvbuffsize;
           this.delayedack = delayedack;
           this.downstaterst = downstaterst;
           this.nagle = nagle;
           this.limitedpersist = limitedpersist;
           this.oooqsize = oooqsize;
           this.ackonpush = ackonpush;
           this.maxpktpermss = maxpktpermss;
           this.pktperretx = pktperretx;
           this.minrto = minrto;
           this.slowstartincr = slowstartincr;
           this.maxdynserverprobes = maxdynserverprobes;
           this.synholdfastgiveup = synholdfastgiveup;
           this.maxsynholdperprobe = maxsynholdperprobe;
           this.maxsynhold = maxsynhold;
           this.msslearninterval = msslearninterval;
           this.msslearndelay = msslearndelay;
           this.maxtimewaitconn = maxtimewaitconn;
           this.kaprobeupdatelastactivity = kaprobeupdatelastactivity;
           this.maxsynackretx = maxsynackretx;
           this.synattackdetection = synattackdetection;
           this.connflushifnomem = connflushifnomem;
           this.connflushthres = connflushthres;
           this.mptcpconcloseonpassivesf = mptcpconcloseonpassivesf;
           this.mptcpchecksum = mptcpchecksum;
           this.mptcpsftimeout = mptcpsftimeout;
           this.mptcpsfreplacetimeout = mptcpsfreplacetimeout;
           this.mptcpmaxsf = mptcpmaxsf;
           this.mptcpmaxpendingsf = mptcpmaxpendingsf;
           this.mptcppendingjointhreshold = mptcppendingjointhreshold;
           this.mptcprtostoswitchsf = mptcprtostoswitchsf;
           this.mptcpusebackupondss = mptcpusebackupondss;
           this.tcpmaxretries = tcpmaxretries;
           this.mptcpimmediatesfcloseonfin = mptcpimmediatesfcloseonfin;
    }


    /**
     * Gets the ws value for this Nstcpparam.
     * 
     * @return ws
     */
    public java.lang.String getWs() {
        return ws;
    }


    /**
     * Sets the ws value for this Nstcpparam.
     * 
     * @param ws
     */
    public void setWs(java.lang.String ws) {
        this.ws = ws;
    }


    /**
     * Gets the wsval value for this Nstcpparam.
     * 
     * @return wsval
     */
    public org.apache.axis.types.UnsignedInt getWsval() {
        return wsval;
    }


    /**
     * Sets the wsval value for this Nstcpparam.
     * 
     * @param wsval
     */
    public void setWsval(org.apache.axis.types.UnsignedInt wsval) {
        this.wsval = wsval;
    }


    /**
     * Gets the sack value for this Nstcpparam.
     * 
     * @return sack
     */
    public java.lang.String getSack() {
        return sack;
    }


    /**
     * Sets the sack value for this Nstcpparam.
     * 
     * @param sack
     */
    public void setSack(java.lang.String sack) {
        this.sack = sack;
    }


    /**
     * Gets the learnvsvrmss value for this Nstcpparam.
     * 
     * @return learnvsvrmss
     */
    public java.lang.String getLearnvsvrmss() {
        return learnvsvrmss;
    }


    /**
     * Sets the learnvsvrmss value for this Nstcpparam.
     * 
     * @param learnvsvrmss
     */
    public void setLearnvsvrmss(java.lang.String learnvsvrmss) {
        this.learnvsvrmss = learnvsvrmss;
    }


    /**
     * Gets the maxburst value for this Nstcpparam.
     * 
     * @return maxburst
     */
    public org.apache.axis.types.UnsignedInt getMaxburst() {
        return maxburst;
    }


    /**
     * Sets the maxburst value for this Nstcpparam.
     * 
     * @param maxburst
     */
    public void setMaxburst(org.apache.axis.types.UnsignedInt maxburst) {
        this.maxburst = maxburst;
    }


    /**
     * Gets the initialcwnd value for this Nstcpparam.
     * 
     * @return initialcwnd
     */
    public org.apache.axis.types.UnsignedInt getInitialcwnd() {
        return initialcwnd;
    }


    /**
     * Sets the initialcwnd value for this Nstcpparam.
     * 
     * @param initialcwnd
     */
    public void setInitialcwnd(org.apache.axis.types.UnsignedInt initialcwnd) {
        this.initialcwnd = initialcwnd;
    }


    /**
     * Gets the recvbuffsize value for this Nstcpparam.
     * 
     * @return recvbuffsize
     */
    public org.apache.axis.types.UnsignedInt getRecvbuffsize() {
        return recvbuffsize;
    }


    /**
     * Sets the recvbuffsize value for this Nstcpparam.
     * 
     * @param recvbuffsize
     */
    public void setRecvbuffsize(org.apache.axis.types.UnsignedInt recvbuffsize) {
        this.recvbuffsize = recvbuffsize;
    }


    /**
     * Gets the delayedack value for this Nstcpparam.
     * 
     * @return delayedack
     */
    public org.apache.axis.types.UnsignedInt getDelayedack() {
        return delayedack;
    }


    /**
     * Sets the delayedack value for this Nstcpparam.
     * 
     * @param delayedack
     */
    public void setDelayedack(org.apache.axis.types.UnsignedInt delayedack) {
        this.delayedack = delayedack;
    }


    /**
     * Gets the downstaterst value for this Nstcpparam.
     * 
     * @return downstaterst
     */
    public java.lang.String getDownstaterst() {
        return downstaterst;
    }


    /**
     * Sets the downstaterst value for this Nstcpparam.
     * 
     * @param downstaterst
     */
    public void setDownstaterst(java.lang.String downstaterst) {
        this.downstaterst = downstaterst;
    }


    /**
     * Gets the nagle value for this Nstcpparam.
     * 
     * @return nagle
     */
    public java.lang.String getNagle() {
        return nagle;
    }


    /**
     * Sets the nagle value for this Nstcpparam.
     * 
     * @param nagle
     */
    public void setNagle(java.lang.String nagle) {
        this.nagle = nagle;
    }


    /**
     * Gets the limitedpersist value for this Nstcpparam.
     * 
     * @return limitedpersist
     */
    public java.lang.String getLimitedpersist() {
        return limitedpersist;
    }


    /**
     * Sets the limitedpersist value for this Nstcpparam.
     * 
     * @param limitedpersist
     */
    public void setLimitedpersist(java.lang.String limitedpersist) {
        this.limitedpersist = limitedpersist;
    }


    /**
     * Gets the oooqsize value for this Nstcpparam.
     * 
     * @return oooqsize
     */
    public org.apache.axis.types.UnsignedInt getOooqsize() {
        return oooqsize;
    }


    /**
     * Sets the oooqsize value for this Nstcpparam.
     * 
     * @param oooqsize
     */
    public void setOooqsize(org.apache.axis.types.UnsignedInt oooqsize) {
        this.oooqsize = oooqsize;
    }


    /**
     * Gets the ackonpush value for this Nstcpparam.
     * 
     * @return ackonpush
     */
    public java.lang.String getAckonpush() {
        return ackonpush;
    }


    /**
     * Sets the ackonpush value for this Nstcpparam.
     * 
     * @param ackonpush
     */
    public void setAckonpush(java.lang.String ackonpush) {
        this.ackonpush = ackonpush;
    }


    /**
     * Gets the maxpktpermss value for this Nstcpparam.
     * 
     * @return maxpktpermss
     */
    public int getMaxpktpermss() {
        return maxpktpermss;
    }


    /**
     * Sets the maxpktpermss value for this Nstcpparam.
     * 
     * @param maxpktpermss
     */
    public void setMaxpktpermss(int maxpktpermss) {
        this.maxpktpermss = maxpktpermss;
    }


    /**
     * Gets the pktperretx value for this Nstcpparam.
     * 
     * @return pktperretx
     */
    public int getPktperretx() {
        return pktperretx;
    }


    /**
     * Sets the pktperretx value for this Nstcpparam.
     * 
     * @param pktperretx
     */
    public void setPktperretx(int pktperretx) {
        this.pktperretx = pktperretx;
    }


    /**
     * Gets the minrto value for this Nstcpparam.
     * 
     * @return minrto
     */
    public int getMinrto() {
        return minrto;
    }


    /**
     * Sets the minrto value for this Nstcpparam.
     * 
     * @param minrto
     */
    public void setMinrto(int minrto) {
        this.minrto = minrto;
    }


    /**
     * Gets the slowstartincr value for this Nstcpparam.
     * 
     * @return slowstartincr
     */
    public int getSlowstartincr() {
        return slowstartincr;
    }


    /**
     * Sets the slowstartincr value for this Nstcpparam.
     * 
     * @param slowstartincr
     */
    public void setSlowstartincr(int slowstartincr) {
        this.slowstartincr = slowstartincr;
    }


    /**
     * Gets the maxdynserverprobes value for this Nstcpparam.
     * 
     * @return maxdynserverprobes
     */
    public org.apache.axis.types.UnsignedInt getMaxdynserverprobes() {
        return maxdynserverprobes;
    }


    /**
     * Sets the maxdynserverprobes value for this Nstcpparam.
     * 
     * @param maxdynserverprobes
     */
    public void setMaxdynserverprobes(org.apache.axis.types.UnsignedInt maxdynserverprobes) {
        this.maxdynserverprobes = maxdynserverprobes;
    }


    /**
     * Gets the synholdfastgiveup value for this Nstcpparam.
     * 
     * @return synholdfastgiveup
     */
    public org.apache.axis.types.UnsignedInt getSynholdfastgiveup() {
        return synholdfastgiveup;
    }


    /**
     * Sets the synholdfastgiveup value for this Nstcpparam.
     * 
     * @param synholdfastgiveup
     */
    public void setSynholdfastgiveup(org.apache.axis.types.UnsignedInt synholdfastgiveup) {
        this.synholdfastgiveup = synholdfastgiveup;
    }


    /**
     * Gets the maxsynholdperprobe value for this Nstcpparam.
     * 
     * @return maxsynholdperprobe
     */
    public org.apache.axis.types.UnsignedInt getMaxsynholdperprobe() {
        return maxsynholdperprobe;
    }


    /**
     * Sets the maxsynholdperprobe value for this Nstcpparam.
     * 
     * @param maxsynholdperprobe
     */
    public void setMaxsynholdperprobe(org.apache.axis.types.UnsignedInt maxsynholdperprobe) {
        this.maxsynholdperprobe = maxsynholdperprobe;
    }


    /**
     * Gets the maxsynhold value for this Nstcpparam.
     * 
     * @return maxsynhold
     */
    public org.apache.axis.types.UnsignedInt getMaxsynhold() {
        return maxsynhold;
    }


    /**
     * Sets the maxsynhold value for this Nstcpparam.
     * 
     * @param maxsynhold
     */
    public void setMaxsynhold(org.apache.axis.types.UnsignedInt maxsynhold) {
        this.maxsynhold = maxsynhold;
    }


    /**
     * Gets the msslearninterval value for this Nstcpparam.
     * 
     * @return msslearninterval
     */
    public org.apache.axis.types.UnsignedInt getMsslearninterval() {
        return msslearninterval;
    }


    /**
     * Sets the msslearninterval value for this Nstcpparam.
     * 
     * @param msslearninterval
     */
    public void setMsslearninterval(org.apache.axis.types.UnsignedInt msslearninterval) {
        this.msslearninterval = msslearninterval;
    }


    /**
     * Gets the msslearndelay value for this Nstcpparam.
     * 
     * @return msslearndelay
     */
    public org.apache.axis.types.UnsignedInt getMsslearndelay() {
        return msslearndelay;
    }


    /**
     * Sets the msslearndelay value for this Nstcpparam.
     * 
     * @param msslearndelay
     */
    public void setMsslearndelay(org.apache.axis.types.UnsignedInt msslearndelay) {
        this.msslearndelay = msslearndelay;
    }


    /**
     * Gets the maxtimewaitconn value for this Nstcpparam.
     * 
     * @return maxtimewaitconn
     */
    public org.apache.axis.types.UnsignedInt getMaxtimewaitconn() {
        return maxtimewaitconn;
    }


    /**
     * Sets the maxtimewaitconn value for this Nstcpparam.
     * 
     * @param maxtimewaitconn
     */
    public void setMaxtimewaitconn(org.apache.axis.types.UnsignedInt maxtimewaitconn) {
        this.maxtimewaitconn = maxtimewaitconn;
    }


    /**
     * Gets the kaprobeupdatelastactivity value for this Nstcpparam.
     * 
     * @return kaprobeupdatelastactivity
     */
    public java.lang.String getKaprobeupdatelastactivity() {
        return kaprobeupdatelastactivity;
    }


    /**
     * Sets the kaprobeupdatelastactivity value for this Nstcpparam.
     * 
     * @param kaprobeupdatelastactivity
     */
    public void setKaprobeupdatelastactivity(java.lang.String kaprobeupdatelastactivity) {
        this.kaprobeupdatelastactivity = kaprobeupdatelastactivity;
    }


    /**
     * Gets the maxsynackretx value for this Nstcpparam.
     * 
     * @return maxsynackretx
     */
    public org.apache.axis.types.UnsignedInt getMaxsynackretx() {
        return maxsynackretx;
    }


    /**
     * Sets the maxsynackretx value for this Nstcpparam.
     * 
     * @param maxsynackretx
     */
    public void setMaxsynackretx(org.apache.axis.types.UnsignedInt maxsynackretx) {
        this.maxsynackretx = maxsynackretx;
    }


    /**
     * Gets the synattackdetection value for this Nstcpparam.
     * 
     * @return synattackdetection
     */
    public java.lang.String getSynattackdetection() {
        return synattackdetection;
    }


    /**
     * Sets the synattackdetection value for this Nstcpparam.
     * 
     * @param synattackdetection
     */
    public void setSynattackdetection(java.lang.String synattackdetection) {
        this.synattackdetection = synattackdetection;
    }


    /**
     * Gets the connflushifnomem value for this Nstcpparam.
     * 
     * @return connflushifnomem
     */
    public java.lang.String getConnflushifnomem() {
        return connflushifnomem;
    }


    /**
     * Sets the connflushifnomem value for this Nstcpparam.
     * 
     * @param connflushifnomem
     */
    public void setConnflushifnomem(java.lang.String connflushifnomem) {
        this.connflushifnomem = connflushifnomem;
    }


    /**
     * Gets the connflushthres value for this Nstcpparam.
     * 
     * @return connflushthres
     */
    public org.apache.axis.types.UnsignedInt getConnflushthres() {
        return connflushthres;
    }


    /**
     * Sets the connflushthres value for this Nstcpparam.
     * 
     * @param connflushthres
     */
    public void setConnflushthres(org.apache.axis.types.UnsignedInt connflushthres) {
        this.connflushthres = connflushthres;
    }


    /**
     * Gets the mptcpconcloseonpassivesf value for this Nstcpparam.
     * 
     * @return mptcpconcloseonpassivesf
     */
    public java.lang.String getMptcpconcloseonpassivesf() {
        return mptcpconcloseonpassivesf;
    }


    /**
     * Sets the mptcpconcloseonpassivesf value for this Nstcpparam.
     * 
     * @param mptcpconcloseonpassivesf
     */
    public void setMptcpconcloseonpassivesf(java.lang.String mptcpconcloseonpassivesf) {
        this.mptcpconcloseonpassivesf = mptcpconcloseonpassivesf;
    }


    /**
     * Gets the mptcpchecksum value for this Nstcpparam.
     * 
     * @return mptcpchecksum
     */
    public java.lang.String getMptcpchecksum() {
        return mptcpchecksum;
    }


    /**
     * Sets the mptcpchecksum value for this Nstcpparam.
     * 
     * @param mptcpchecksum
     */
    public void setMptcpchecksum(java.lang.String mptcpchecksum) {
        this.mptcpchecksum = mptcpchecksum;
    }


    /**
     * Gets the mptcpsftimeout value for this Nstcpparam.
     * 
     * @return mptcpsftimeout
     */
    public org.apache.axis.types.UnsignedInt getMptcpsftimeout() {
        return mptcpsftimeout;
    }


    /**
     * Sets the mptcpsftimeout value for this Nstcpparam.
     * 
     * @param mptcpsftimeout
     */
    public void setMptcpsftimeout(org.apache.axis.types.UnsignedInt mptcpsftimeout) {
        this.mptcpsftimeout = mptcpsftimeout;
    }


    /**
     * Gets the mptcpsfreplacetimeout value for this Nstcpparam.
     * 
     * @return mptcpsfreplacetimeout
     */
    public org.apache.axis.types.UnsignedInt getMptcpsfreplacetimeout() {
        return mptcpsfreplacetimeout;
    }


    /**
     * Sets the mptcpsfreplacetimeout value for this Nstcpparam.
     * 
     * @param mptcpsfreplacetimeout
     */
    public void setMptcpsfreplacetimeout(org.apache.axis.types.UnsignedInt mptcpsfreplacetimeout) {
        this.mptcpsfreplacetimeout = mptcpsfreplacetimeout;
    }


    /**
     * Gets the mptcpmaxsf value for this Nstcpparam.
     * 
     * @return mptcpmaxsf
     */
    public org.apache.axis.types.UnsignedInt getMptcpmaxsf() {
        return mptcpmaxsf;
    }


    /**
     * Sets the mptcpmaxsf value for this Nstcpparam.
     * 
     * @param mptcpmaxsf
     */
    public void setMptcpmaxsf(org.apache.axis.types.UnsignedInt mptcpmaxsf) {
        this.mptcpmaxsf = mptcpmaxsf;
    }


    /**
     * Gets the mptcpmaxpendingsf value for this Nstcpparam.
     * 
     * @return mptcpmaxpendingsf
     */
    public org.apache.axis.types.UnsignedInt getMptcpmaxpendingsf() {
        return mptcpmaxpendingsf;
    }


    /**
     * Sets the mptcpmaxpendingsf value for this Nstcpparam.
     * 
     * @param mptcpmaxpendingsf
     */
    public void setMptcpmaxpendingsf(org.apache.axis.types.UnsignedInt mptcpmaxpendingsf) {
        this.mptcpmaxpendingsf = mptcpmaxpendingsf;
    }


    /**
     * Gets the mptcppendingjointhreshold value for this Nstcpparam.
     * 
     * @return mptcppendingjointhreshold
     */
    public org.apache.axis.types.UnsignedInt getMptcppendingjointhreshold() {
        return mptcppendingjointhreshold;
    }


    /**
     * Sets the mptcppendingjointhreshold value for this Nstcpparam.
     * 
     * @param mptcppendingjointhreshold
     */
    public void setMptcppendingjointhreshold(org.apache.axis.types.UnsignedInt mptcppendingjointhreshold) {
        this.mptcppendingjointhreshold = mptcppendingjointhreshold;
    }


    /**
     * Gets the mptcprtostoswitchsf value for this Nstcpparam.
     * 
     * @return mptcprtostoswitchsf
     */
    public org.apache.axis.types.UnsignedInt getMptcprtostoswitchsf() {
        return mptcprtostoswitchsf;
    }


    /**
     * Sets the mptcprtostoswitchsf value for this Nstcpparam.
     * 
     * @param mptcprtostoswitchsf
     */
    public void setMptcprtostoswitchsf(org.apache.axis.types.UnsignedInt mptcprtostoswitchsf) {
        this.mptcprtostoswitchsf = mptcprtostoswitchsf;
    }


    /**
     * Gets the mptcpusebackupondss value for this Nstcpparam.
     * 
     * @return mptcpusebackupondss
     */
    public java.lang.String getMptcpusebackupondss() {
        return mptcpusebackupondss;
    }


    /**
     * Sets the mptcpusebackupondss value for this Nstcpparam.
     * 
     * @param mptcpusebackupondss
     */
    public void setMptcpusebackupondss(java.lang.String mptcpusebackupondss) {
        this.mptcpusebackupondss = mptcpusebackupondss;
    }


    /**
     * Gets the tcpmaxretries value for this Nstcpparam.
     * 
     * @return tcpmaxretries
     */
    public org.apache.axis.types.UnsignedInt getTcpmaxretries() {
        return tcpmaxretries;
    }


    /**
     * Sets the tcpmaxretries value for this Nstcpparam.
     * 
     * @param tcpmaxretries
     */
    public void setTcpmaxretries(org.apache.axis.types.UnsignedInt tcpmaxretries) {
        this.tcpmaxretries = tcpmaxretries;
    }


    /**
     * Gets the mptcpimmediatesfcloseonfin value for this Nstcpparam.
     * 
     * @return mptcpimmediatesfcloseonfin
     */
    public java.lang.String getMptcpimmediatesfcloseonfin() {
        return mptcpimmediatesfcloseonfin;
    }


    /**
     * Sets the mptcpimmediatesfcloseonfin value for this Nstcpparam.
     * 
     * @param mptcpimmediatesfcloseonfin
     */
    public void setMptcpimmediatesfcloseonfin(java.lang.String mptcpimmediatesfcloseonfin) {
        this.mptcpimmediatesfcloseonfin = mptcpimmediatesfcloseonfin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nstcpparam)) return false;
        Nstcpparam other = (Nstcpparam) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ws==null && other.getWs()==null) || 
             (this.ws!=null &&
              this.ws.equals(other.getWs()))) &&
            ((this.wsval==null && other.getWsval()==null) || 
             (this.wsval!=null &&
              this.wsval.equals(other.getWsval()))) &&
            ((this.sack==null && other.getSack()==null) || 
             (this.sack!=null &&
              this.sack.equals(other.getSack()))) &&
            ((this.learnvsvrmss==null && other.getLearnvsvrmss()==null) || 
             (this.learnvsvrmss!=null &&
              this.learnvsvrmss.equals(other.getLearnvsvrmss()))) &&
            ((this.maxburst==null && other.getMaxburst()==null) || 
             (this.maxburst!=null &&
              this.maxburst.equals(other.getMaxburst()))) &&
            ((this.initialcwnd==null && other.getInitialcwnd()==null) || 
             (this.initialcwnd!=null &&
              this.initialcwnd.equals(other.getInitialcwnd()))) &&
            ((this.recvbuffsize==null && other.getRecvbuffsize()==null) || 
             (this.recvbuffsize!=null &&
              this.recvbuffsize.equals(other.getRecvbuffsize()))) &&
            ((this.delayedack==null && other.getDelayedack()==null) || 
             (this.delayedack!=null &&
              this.delayedack.equals(other.getDelayedack()))) &&
            ((this.downstaterst==null && other.getDownstaterst()==null) || 
             (this.downstaterst!=null &&
              this.downstaterst.equals(other.getDownstaterst()))) &&
            ((this.nagle==null && other.getNagle()==null) || 
             (this.nagle!=null &&
              this.nagle.equals(other.getNagle()))) &&
            ((this.limitedpersist==null && other.getLimitedpersist()==null) || 
             (this.limitedpersist!=null &&
              this.limitedpersist.equals(other.getLimitedpersist()))) &&
            ((this.oooqsize==null && other.getOooqsize()==null) || 
             (this.oooqsize!=null &&
              this.oooqsize.equals(other.getOooqsize()))) &&
            ((this.ackonpush==null && other.getAckonpush()==null) || 
             (this.ackonpush!=null &&
              this.ackonpush.equals(other.getAckonpush()))) &&
            this.maxpktpermss == other.getMaxpktpermss() &&
            this.pktperretx == other.getPktperretx() &&
            this.minrto == other.getMinrto() &&
            this.slowstartincr == other.getSlowstartincr() &&
            ((this.maxdynserverprobes==null && other.getMaxdynserverprobes()==null) || 
             (this.maxdynserverprobes!=null &&
              this.maxdynserverprobes.equals(other.getMaxdynserverprobes()))) &&
            ((this.synholdfastgiveup==null && other.getSynholdfastgiveup()==null) || 
             (this.synholdfastgiveup!=null &&
              this.synholdfastgiveup.equals(other.getSynholdfastgiveup()))) &&
            ((this.maxsynholdperprobe==null && other.getMaxsynholdperprobe()==null) || 
             (this.maxsynholdperprobe!=null &&
              this.maxsynholdperprobe.equals(other.getMaxsynholdperprobe()))) &&
            ((this.maxsynhold==null && other.getMaxsynhold()==null) || 
             (this.maxsynhold!=null &&
              this.maxsynhold.equals(other.getMaxsynhold()))) &&
            ((this.msslearninterval==null && other.getMsslearninterval()==null) || 
             (this.msslearninterval!=null &&
              this.msslearninterval.equals(other.getMsslearninterval()))) &&
            ((this.msslearndelay==null && other.getMsslearndelay()==null) || 
             (this.msslearndelay!=null &&
              this.msslearndelay.equals(other.getMsslearndelay()))) &&
            ((this.maxtimewaitconn==null && other.getMaxtimewaitconn()==null) || 
             (this.maxtimewaitconn!=null &&
              this.maxtimewaitconn.equals(other.getMaxtimewaitconn()))) &&
            ((this.kaprobeupdatelastactivity==null && other.getKaprobeupdatelastactivity()==null) || 
             (this.kaprobeupdatelastactivity!=null &&
              this.kaprobeupdatelastactivity.equals(other.getKaprobeupdatelastactivity()))) &&
            ((this.maxsynackretx==null && other.getMaxsynackretx()==null) || 
             (this.maxsynackretx!=null &&
              this.maxsynackretx.equals(other.getMaxsynackretx()))) &&
            ((this.synattackdetection==null && other.getSynattackdetection()==null) || 
             (this.synattackdetection!=null &&
              this.synattackdetection.equals(other.getSynattackdetection()))) &&
            ((this.connflushifnomem==null && other.getConnflushifnomem()==null) || 
             (this.connflushifnomem!=null &&
              this.connflushifnomem.equals(other.getConnflushifnomem()))) &&
            ((this.connflushthres==null && other.getConnflushthres()==null) || 
             (this.connflushthres!=null &&
              this.connflushthres.equals(other.getConnflushthres()))) &&
            ((this.mptcpconcloseonpassivesf==null && other.getMptcpconcloseonpassivesf()==null) || 
             (this.mptcpconcloseonpassivesf!=null &&
              this.mptcpconcloseonpassivesf.equals(other.getMptcpconcloseonpassivesf()))) &&
            ((this.mptcpchecksum==null && other.getMptcpchecksum()==null) || 
             (this.mptcpchecksum!=null &&
              this.mptcpchecksum.equals(other.getMptcpchecksum()))) &&
            ((this.mptcpsftimeout==null && other.getMptcpsftimeout()==null) || 
             (this.mptcpsftimeout!=null &&
              this.mptcpsftimeout.equals(other.getMptcpsftimeout()))) &&
            ((this.mptcpsfreplacetimeout==null && other.getMptcpsfreplacetimeout()==null) || 
             (this.mptcpsfreplacetimeout!=null &&
              this.mptcpsfreplacetimeout.equals(other.getMptcpsfreplacetimeout()))) &&
            ((this.mptcpmaxsf==null && other.getMptcpmaxsf()==null) || 
             (this.mptcpmaxsf!=null &&
              this.mptcpmaxsf.equals(other.getMptcpmaxsf()))) &&
            ((this.mptcpmaxpendingsf==null && other.getMptcpmaxpendingsf()==null) || 
             (this.mptcpmaxpendingsf!=null &&
              this.mptcpmaxpendingsf.equals(other.getMptcpmaxpendingsf()))) &&
            ((this.mptcppendingjointhreshold==null && other.getMptcppendingjointhreshold()==null) || 
             (this.mptcppendingjointhreshold!=null &&
              this.mptcppendingjointhreshold.equals(other.getMptcppendingjointhreshold()))) &&
            ((this.mptcprtostoswitchsf==null && other.getMptcprtostoswitchsf()==null) || 
             (this.mptcprtostoswitchsf!=null &&
              this.mptcprtostoswitchsf.equals(other.getMptcprtostoswitchsf()))) &&
            ((this.mptcpusebackupondss==null && other.getMptcpusebackupondss()==null) || 
             (this.mptcpusebackupondss!=null &&
              this.mptcpusebackupondss.equals(other.getMptcpusebackupondss()))) &&
            ((this.tcpmaxretries==null && other.getTcpmaxretries()==null) || 
             (this.tcpmaxretries!=null &&
              this.tcpmaxretries.equals(other.getTcpmaxretries()))) &&
            ((this.mptcpimmediatesfcloseonfin==null && other.getMptcpimmediatesfcloseonfin()==null) || 
             (this.mptcpimmediatesfcloseonfin!=null &&
              this.mptcpimmediatesfcloseonfin.equals(other.getMptcpimmediatesfcloseonfin())));
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
        if (getWs() != null) {
            _hashCode += getWs().hashCode();
        }
        if (getWsval() != null) {
            _hashCode += getWsval().hashCode();
        }
        if (getSack() != null) {
            _hashCode += getSack().hashCode();
        }
        if (getLearnvsvrmss() != null) {
            _hashCode += getLearnvsvrmss().hashCode();
        }
        if (getMaxburst() != null) {
            _hashCode += getMaxburst().hashCode();
        }
        if (getInitialcwnd() != null) {
            _hashCode += getInitialcwnd().hashCode();
        }
        if (getRecvbuffsize() != null) {
            _hashCode += getRecvbuffsize().hashCode();
        }
        if (getDelayedack() != null) {
            _hashCode += getDelayedack().hashCode();
        }
        if (getDownstaterst() != null) {
            _hashCode += getDownstaterst().hashCode();
        }
        if (getNagle() != null) {
            _hashCode += getNagle().hashCode();
        }
        if (getLimitedpersist() != null) {
            _hashCode += getLimitedpersist().hashCode();
        }
        if (getOooqsize() != null) {
            _hashCode += getOooqsize().hashCode();
        }
        if (getAckonpush() != null) {
            _hashCode += getAckonpush().hashCode();
        }
        _hashCode += getMaxpktpermss();
        _hashCode += getPktperretx();
        _hashCode += getMinrto();
        _hashCode += getSlowstartincr();
        if (getMaxdynserverprobes() != null) {
            _hashCode += getMaxdynserverprobes().hashCode();
        }
        if (getSynholdfastgiveup() != null) {
            _hashCode += getSynholdfastgiveup().hashCode();
        }
        if (getMaxsynholdperprobe() != null) {
            _hashCode += getMaxsynholdperprobe().hashCode();
        }
        if (getMaxsynhold() != null) {
            _hashCode += getMaxsynhold().hashCode();
        }
        if (getMsslearninterval() != null) {
            _hashCode += getMsslearninterval().hashCode();
        }
        if (getMsslearndelay() != null) {
            _hashCode += getMsslearndelay().hashCode();
        }
        if (getMaxtimewaitconn() != null) {
            _hashCode += getMaxtimewaitconn().hashCode();
        }
        if (getKaprobeupdatelastactivity() != null) {
            _hashCode += getKaprobeupdatelastactivity().hashCode();
        }
        if (getMaxsynackretx() != null) {
            _hashCode += getMaxsynackretx().hashCode();
        }
        if (getSynattackdetection() != null) {
            _hashCode += getSynattackdetection().hashCode();
        }
        if (getConnflushifnomem() != null) {
            _hashCode += getConnflushifnomem().hashCode();
        }
        if (getConnflushthres() != null) {
            _hashCode += getConnflushthres().hashCode();
        }
        if (getMptcpconcloseonpassivesf() != null) {
            _hashCode += getMptcpconcloseonpassivesf().hashCode();
        }
        if (getMptcpchecksum() != null) {
            _hashCode += getMptcpchecksum().hashCode();
        }
        if (getMptcpsftimeout() != null) {
            _hashCode += getMptcpsftimeout().hashCode();
        }
        if (getMptcpsfreplacetimeout() != null) {
            _hashCode += getMptcpsfreplacetimeout().hashCode();
        }
        if (getMptcpmaxsf() != null) {
            _hashCode += getMptcpmaxsf().hashCode();
        }
        if (getMptcpmaxpendingsf() != null) {
            _hashCode += getMptcpmaxpendingsf().hashCode();
        }
        if (getMptcppendingjointhreshold() != null) {
            _hashCode += getMptcppendingjointhreshold().hashCode();
        }
        if (getMptcprtostoswitchsf() != null) {
            _hashCode += getMptcprtostoswitchsf().hashCode();
        }
        if (getMptcpusebackupondss() != null) {
            _hashCode += getMptcpusebackupondss().hashCode();
        }
        if (getTcpmaxretries() != null) {
            _hashCode += getTcpmaxretries().hashCode();
        }
        if (getMptcpimmediatesfcloseonfin() != null) {
            _hashCode += getMptcpimmediatesfcloseonfin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nstcpparam.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nstcpparam"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ws");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ws"));
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
        elemField.setFieldName("sack");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sack"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("learnvsvrmss");
        elemField.setXmlName(new javax.xml.namespace.QName("", "learnvsvrmss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("recvbuffsize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recvbuffsize"));
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
        elemField.setFieldName("downstaterst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "downstaterst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nagle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nagle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitedpersist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limitedpersist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oooqsize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oooqsize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ackonpush");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ackonpush"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxpktpermss");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxpktpermss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pktperretx");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pktperretx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minrto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minrto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("slowstartincr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "slowstartincr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxdynserverprobes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxdynserverprobes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("synholdfastgiveup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "synholdfastgiveup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxsynholdperprobe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxsynholdperprobe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxsynhold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxsynhold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msslearninterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msslearninterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msslearndelay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msslearndelay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxtimewaitconn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxtimewaitconn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kaprobeupdatelastactivity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kaprobeupdatelastactivity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxsynackretx");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxsynackretx"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("synattackdetection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "synattackdetection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connflushifnomem");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connflushifnomem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connflushthres");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connflushthres"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mptcpconcloseonpassivesf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mptcpconcloseonpassivesf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mptcpchecksum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mptcpchecksum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mptcpsftimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mptcpsftimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mptcpsfreplacetimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mptcpsfreplacetimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mptcpmaxsf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mptcpmaxsf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mptcpmaxpendingsf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mptcpmaxpendingsf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mptcppendingjointhreshold");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mptcppendingjointhreshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mptcprtostoswitchsf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mptcprtostoswitchsf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mptcpusebackupondss");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mptcpusebackupondss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcpmaxretries");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tcpmaxretries"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mptcpimmediatesfcloseonfin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mptcpimmediatesfcloseonfin"));
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
