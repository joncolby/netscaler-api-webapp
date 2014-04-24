/**
 * Nsconnectiontable.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nsconnectiontable  implements java.io.Serializable {
    private java.lang.String filterexpression;

    private boolean link;

    private boolean name;

    private java.lang.String detail;

    private java.lang.String sourceip;

    private org.apache.axis.types.UnsignedInt sourceport;

    private java.lang.String destip;

    private org.apache.axis.types.UnsignedInt destport;

    private java.lang.String svctype;

    private int idletime;

    private java.lang.String state;

    private java.lang.String linksourceip;

    private org.apache.axis.types.UnsignedInt linksourceport;

    private java.lang.String linkdestip;

    private org.apache.axis.types.UnsignedInt linkdestport;

    private java.lang.String linkservicetype;

    private int linkidletime;

    private java.lang.String linkstate;

    private java.lang.String entityname;

    private java.lang.String linkentityname;

    private int connectionnumber;

    private int linkconnectionnumber;

    private org.apache.axis.types.UnsignedLong connid;

    private org.apache.axis.types.UnsignedLong linkconnid;

    private java.lang.String optionflags;

    private org.apache.axis.types.UnsignedInt nswsvalue;

    private org.apache.axis.types.UnsignedInt peerwsvalue;

    private int mss;

    private int retxretrycnt;

    private int rcvwnd;

    private int advwnd;

    private int sndcwnd;

    private int iss;

    private int irs;

    private int rcvnxt;

    private int maxack;

    private int sndnxt;

    private int sndunack;

    private int httpendseq;

    private java.lang.String httpstate;

    private int trcount;

    private java.lang.String priority;

    private java.lang.String httpreqver;

    private java.lang.String httprequest;

    private int httprspcode;

    private int rttsmoothed;

    private int rttvariance;

    private int outoforderpkts;

    private java.lang.String linkoptionflag;

    private org.apache.axis.types.UnsignedInt linknswsvalue;

    private org.apache.axis.types.UnsignedInt linkpeerwsvalue;

    private int targetnodeidnnm;

    private int sourcenodeidnnm;

    private org.apache.axis.types.UnsignedInt channelidnnm;

    private org.apache.axis.types.UnsignedInt msgversionnnm;

    private org.apache.axis.types.UnsignedInt td;

    public Nsconnectiontable() {
    }

    public Nsconnectiontable(
           java.lang.String filterexpression,
           boolean link,
           boolean name,
           java.lang.String detail,
           java.lang.String sourceip,
           org.apache.axis.types.UnsignedInt sourceport,
           java.lang.String destip,
           org.apache.axis.types.UnsignedInt destport,
           java.lang.String svctype,
           int idletime,
           java.lang.String state,
           java.lang.String linksourceip,
           org.apache.axis.types.UnsignedInt linksourceport,
           java.lang.String linkdestip,
           org.apache.axis.types.UnsignedInt linkdestport,
           java.lang.String linkservicetype,
           int linkidletime,
           java.lang.String linkstate,
           java.lang.String entityname,
           java.lang.String linkentityname,
           int connectionnumber,
           int linkconnectionnumber,
           org.apache.axis.types.UnsignedLong connid,
           org.apache.axis.types.UnsignedLong linkconnid,
           java.lang.String optionflags,
           org.apache.axis.types.UnsignedInt nswsvalue,
           org.apache.axis.types.UnsignedInt peerwsvalue,
           int mss,
           int retxretrycnt,
           int rcvwnd,
           int advwnd,
           int sndcwnd,
           int iss,
           int irs,
           int rcvnxt,
           int maxack,
           int sndnxt,
           int sndunack,
           int httpendseq,
           java.lang.String httpstate,
           int trcount,
           java.lang.String priority,
           java.lang.String httpreqver,
           java.lang.String httprequest,
           int httprspcode,
           int rttsmoothed,
           int rttvariance,
           int outoforderpkts,
           java.lang.String linkoptionflag,
           org.apache.axis.types.UnsignedInt linknswsvalue,
           org.apache.axis.types.UnsignedInt linkpeerwsvalue,
           int targetnodeidnnm,
           int sourcenodeidnnm,
           org.apache.axis.types.UnsignedInt channelidnnm,
           org.apache.axis.types.UnsignedInt msgversionnnm,
           org.apache.axis.types.UnsignedInt td) {
           this.filterexpression = filterexpression;
           this.link = link;
           this.name = name;
           this.detail = detail;
           this.sourceip = sourceip;
           this.sourceport = sourceport;
           this.destip = destip;
           this.destport = destport;
           this.svctype = svctype;
           this.idletime = idletime;
           this.state = state;
           this.linksourceip = linksourceip;
           this.linksourceport = linksourceport;
           this.linkdestip = linkdestip;
           this.linkdestport = linkdestport;
           this.linkservicetype = linkservicetype;
           this.linkidletime = linkidletime;
           this.linkstate = linkstate;
           this.entityname = entityname;
           this.linkentityname = linkentityname;
           this.connectionnumber = connectionnumber;
           this.linkconnectionnumber = linkconnectionnumber;
           this.connid = connid;
           this.linkconnid = linkconnid;
           this.optionflags = optionflags;
           this.nswsvalue = nswsvalue;
           this.peerwsvalue = peerwsvalue;
           this.mss = mss;
           this.retxretrycnt = retxretrycnt;
           this.rcvwnd = rcvwnd;
           this.advwnd = advwnd;
           this.sndcwnd = sndcwnd;
           this.iss = iss;
           this.irs = irs;
           this.rcvnxt = rcvnxt;
           this.maxack = maxack;
           this.sndnxt = sndnxt;
           this.sndunack = sndunack;
           this.httpendseq = httpendseq;
           this.httpstate = httpstate;
           this.trcount = trcount;
           this.priority = priority;
           this.httpreqver = httpreqver;
           this.httprequest = httprequest;
           this.httprspcode = httprspcode;
           this.rttsmoothed = rttsmoothed;
           this.rttvariance = rttvariance;
           this.outoforderpkts = outoforderpkts;
           this.linkoptionflag = linkoptionflag;
           this.linknswsvalue = linknswsvalue;
           this.linkpeerwsvalue = linkpeerwsvalue;
           this.targetnodeidnnm = targetnodeidnnm;
           this.sourcenodeidnnm = sourcenodeidnnm;
           this.channelidnnm = channelidnnm;
           this.msgversionnnm = msgversionnnm;
           this.td = td;
    }


    /**
     * Gets the filterexpression value for this Nsconnectiontable.
     * 
     * @return filterexpression
     */
    public java.lang.String getFilterexpression() {
        return filterexpression;
    }


    /**
     * Sets the filterexpression value for this Nsconnectiontable.
     * 
     * @param filterexpression
     */
    public void setFilterexpression(java.lang.String filterexpression) {
        this.filterexpression = filterexpression;
    }


    /**
     * Gets the link value for this Nsconnectiontable.
     * 
     * @return link
     */
    public boolean isLink() {
        return link;
    }


    /**
     * Sets the link value for this Nsconnectiontable.
     * 
     * @param link
     */
    public void setLink(boolean link) {
        this.link = link;
    }


    /**
     * Gets the name value for this Nsconnectiontable.
     * 
     * @return name
     */
    public boolean isName() {
        return name;
    }


    /**
     * Sets the name value for this Nsconnectiontable.
     * 
     * @param name
     */
    public void setName(boolean name) {
        this.name = name;
    }


    /**
     * Gets the detail value for this Nsconnectiontable.
     * 
     * @return detail
     */
    public java.lang.String getDetail() {
        return detail;
    }


    /**
     * Sets the detail value for this Nsconnectiontable.
     * 
     * @param detail
     */
    public void setDetail(java.lang.String detail) {
        this.detail = detail;
    }


    /**
     * Gets the sourceip value for this Nsconnectiontable.
     * 
     * @return sourceip
     */
    public java.lang.String getSourceip() {
        return sourceip;
    }


    /**
     * Sets the sourceip value for this Nsconnectiontable.
     * 
     * @param sourceip
     */
    public void setSourceip(java.lang.String sourceip) {
        this.sourceip = sourceip;
    }


    /**
     * Gets the sourceport value for this Nsconnectiontable.
     * 
     * @return sourceport
     */
    public org.apache.axis.types.UnsignedInt getSourceport() {
        return sourceport;
    }


    /**
     * Sets the sourceport value for this Nsconnectiontable.
     * 
     * @param sourceport
     */
    public void setSourceport(org.apache.axis.types.UnsignedInt sourceport) {
        this.sourceport = sourceport;
    }


    /**
     * Gets the destip value for this Nsconnectiontable.
     * 
     * @return destip
     */
    public java.lang.String getDestip() {
        return destip;
    }


    /**
     * Sets the destip value for this Nsconnectiontable.
     * 
     * @param destip
     */
    public void setDestip(java.lang.String destip) {
        this.destip = destip;
    }


    /**
     * Gets the destport value for this Nsconnectiontable.
     * 
     * @return destport
     */
    public org.apache.axis.types.UnsignedInt getDestport() {
        return destport;
    }


    /**
     * Sets the destport value for this Nsconnectiontable.
     * 
     * @param destport
     */
    public void setDestport(org.apache.axis.types.UnsignedInt destport) {
        this.destport = destport;
    }


    /**
     * Gets the svctype value for this Nsconnectiontable.
     * 
     * @return svctype
     */
    public java.lang.String getSvctype() {
        return svctype;
    }


    /**
     * Sets the svctype value for this Nsconnectiontable.
     * 
     * @param svctype
     */
    public void setSvctype(java.lang.String svctype) {
        this.svctype = svctype;
    }


    /**
     * Gets the idletime value for this Nsconnectiontable.
     * 
     * @return idletime
     */
    public int getIdletime() {
        return idletime;
    }


    /**
     * Sets the idletime value for this Nsconnectiontable.
     * 
     * @param idletime
     */
    public void setIdletime(int idletime) {
        this.idletime = idletime;
    }


    /**
     * Gets the state value for this Nsconnectiontable.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Nsconnectiontable.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the linksourceip value for this Nsconnectiontable.
     * 
     * @return linksourceip
     */
    public java.lang.String getLinksourceip() {
        return linksourceip;
    }


    /**
     * Sets the linksourceip value for this Nsconnectiontable.
     * 
     * @param linksourceip
     */
    public void setLinksourceip(java.lang.String linksourceip) {
        this.linksourceip = linksourceip;
    }


    /**
     * Gets the linksourceport value for this Nsconnectiontable.
     * 
     * @return linksourceport
     */
    public org.apache.axis.types.UnsignedInt getLinksourceport() {
        return linksourceport;
    }


    /**
     * Sets the linksourceport value for this Nsconnectiontable.
     * 
     * @param linksourceport
     */
    public void setLinksourceport(org.apache.axis.types.UnsignedInt linksourceport) {
        this.linksourceport = linksourceport;
    }


    /**
     * Gets the linkdestip value for this Nsconnectiontable.
     * 
     * @return linkdestip
     */
    public java.lang.String getLinkdestip() {
        return linkdestip;
    }


    /**
     * Sets the linkdestip value for this Nsconnectiontable.
     * 
     * @param linkdestip
     */
    public void setLinkdestip(java.lang.String linkdestip) {
        this.linkdestip = linkdestip;
    }


    /**
     * Gets the linkdestport value for this Nsconnectiontable.
     * 
     * @return linkdestport
     */
    public org.apache.axis.types.UnsignedInt getLinkdestport() {
        return linkdestport;
    }


    /**
     * Sets the linkdestport value for this Nsconnectiontable.
     * 
     * @param linkdestport
     */
    public void setLinkdestport(org.apache.axis.types.UnsignedInt linkdestport) {
        this.linkdestport = linkdestport;
    }


    /**
     * Gets the linkservicetype value for this Nsconnectiontable.
     * 
     * @return linkservicetype
     */
    public java.lang.String getLinkservicetype() {
        return linkservicetype;
    }


    /**
     * Sets the linkservicetype value for this Nsconnectiontable.
     * 
     * @param linkservicetype
     */
    public void setLinkservicetype(java.lang.String linkservicetype) {
        this.linkservicetype = linkservicetype;
    }


    /**
     * Gets the linkidletime value for this Nsconnectiontable.
     * 
     * @return linkidletime
     */
    public int getLinkidletime() {
        return linkidletime;
    }


    /**
     * Sets the linkidletime value for this Nsconnectiontable.
     * 
     * @param linkidletime
     */
    public void setLinkidletime(int linkidletime) {
        this.linkidletime = linkidletime;
    }


    /**
     * Gets the linkstate value for this Nsconnectiontable.
     * 
     * @return linkstate
     */
    public java.lang.String getLinkstate() {
        return linkstate;
    }


    /**
     * Sets the linkstate value for this Nsconnectiontable.
     * 
     * @param linkstate
     */
    public void setLinkstate(java.lang.String linkstate) {
        this.linkstate = linkstate;
    }


    /**
     * Gets the entityname value for this Nsconnectiontable.
     * 
     * @return entityname
     */
    public java.lang.String getEntityname() {
        return entityname;
    }


    /**
     * Sets the entityname value for this Nsconnectiontable.
     * 
     * @param entityname
     */
    public void setEntityname(java.lang.String entityname) {
        this.entityname = entityname;
    }


    /**
     * Gets the linkentityname value for this Nsconnectiontable.
     * 
     * @return linkentityname
     */
    public java.lang.String getLinkentityname() {
        return linkentityname;
    }


    /**
     * Sets the linkentityname value for this Nsconnectiontable.
     * 
     * @param linkentityname
     */
    public void setLinkentityname(java.lang.String linkentityname) {
        this.linkentityname = linkentityname;
    }


    /**
     * Gets the connectionnumber value for this Nsconnectiontable.
     * 
     * @return connectionnumber
     */
    public int getConnectionnumber() {
        return connectionnumber;
    }


    /**
     * Sets the connectionnumber value for this Nsconnectiontable.
     * 
     * @param connectionnumber
     */
    public void setConnectionnumber(int connectionnumber) {
        this.connectionnumber = connectionnumber;
    }


    /**
     * Gets the linkconnectionnumber value for this Nsconnectiontable.
     * 
     * @return linkconnectionnumber
     */
    public int getLinkconnectionnumber() {
        return linkconnectionnumber;
    }


    /**
     * Sets the linkconnectionnumber value for this Nsconnectiontable.
     * 
     * @param linkconnectionnumber
     */
    public void setLinkconnectionnumber(int linkconnectionnumber) {
        this.linkconnectionnumber = linkconnectionnumber;
    }


    /**
     * Gets the connid value for this Nsconnectiontable.
     * 
     * @return connid
     */
    public org.apache.axis.types.UnsignedLong getConnid() {
        return connid;
    }


    /**
     * Sets the connid value for this Nsconnectiontable.
     * 
     * @param connid
     */
    public void setConnid(org.apache.axis.types.UnsignedLong connid) {
        this.connid = connid;
    }


    /**
     * Gets the linkconnid value for this Nsconnectiontable.
     * 
     * @return linkconnid
     */
    public org.apache.axis.types.UnsignedLong getLinkconnid() {
        return linkconnid;
    }


    /**
     * Sets the linkconnid value for this Nsconnectiontable.
     * 
     * @param linkconnid
     */
    public void setLinkconnid(org.apache.axis.types.UnsignedLong linkconnid) {
        this.linkconnid = linkconnid;
    }


    /**
     * Gets the optionflags value for this Nsconnectiontable.
     * 
     * @return optionflags
     */
    public java.lang.String getOptionflags() {
        return optionflags;
    }


    /**
     * Sets the optionflags value for this Nsconnectiontable.
     * 
     * @param optionflags
     */
    public void setOptionflags(java.lang.String optionflags) {
        this.optionflags = optionflags;
    }


    /**
     * Gets the nswsvalue value for this Nsconnectiontable.
     * 
     * @return nswsvalue
     */
    public org.apache.axis.types.UnsignedInt getNswsvalue() {
        return nswsvalue;
    }


    /**
     * Sets the nswsvalue value for this Nsconnectiontable.
     * 
     * @param nswsvalue
     */
    public void setNswsvalue(org.apache.axis.types.UnsignedInt nswsvalue) {
        this.nswsvalue = nswsvalue;
    }


    /**
     * Gets the peerwsvalue value for this Nsconnectiontable.
     * 
     * @return peerwsvalue
     */
    public org.apache.axis.types.UnsignedInt getPeerwsvalue() {
        return peerwsvalue;
    }


    /**
     * Sets the peerwsvalue value for this Nsconnectiontable.
     * 
     * @param peerwsvalue
     */
    public void setPeerwsvalue(org.apache.axis.types.UnsignedInt peerwsvalue) {
        this.peerwsvalue = peerwsvalue;
    }


    /**
     * Gets the mss value for this Nsconnectiontable.
     * 
     * @return mss
     */
    public int getMss() {
        return mss;
    }


    /**
     * Sets the mss value for this Nsconnectiontable.
     * 
     * @param mss
     */
    public void setMss(int mss) {
        this.mss = mss;
    }


    /**
     * Gets the retxretrycnt value for this Nsconnectiontable.
     * 
     * @return retxretrycnt
     */
    public int getRetxretrycnt() {
        return retxretrycnt;
    }


    /**
     * Sets the retxretrycnt value for this Nsconnectiontable.
     * 
     * @param retxretrycnt
     */
    public void setRetxretrycnt(int retxretrycnt) {
        this.retxretrycnt = retxretrycnt;
    }


    /**
     * Gets the rcvwnd value for this Nsconnectiontable.
     * 
     * @return rcvwnd
     */
    public int getRcvwnd() {
        return rcvwnd;
    }


    /**
     * Sets the rcvwnd value for this Nsconnectiontable.
     * 
     * @param rcvwnd
     */
    public void setRcvwnd(int rcvwnd) {
        this.rcvwnd = rcvwnd;
    }


    /**
     * Gets the advwnd value for this Nsconnectiontable.
     * 
     * @return advwnd
     */
    public int getAdvwnd() {
        return advwnd;
    }


    /**
     * Sets the advwnd value for this Nsconnectiontable.
     * 
     * @param advwnd
     */
    public void setAdvwnd(int advwnd) {
        this.advwnd = advwnd;
    }


    /**
     * Gets the sndcwnd value for this Nsconnectiontable.
     * 
     * @return sndcwnd
     */
    public int getSndcwnd() {
        return sndcwnd;
    }


    /**
     * Sets the sndcwnd value for this Nsconnectiontable.
     * 
     * @param sndcwnd
     */
    public void setSndcwnd(int sndcwnd) {
        this.sndcwnd = sndcwnd;
    }


    /**
     * Gets the iss value for this Nsconnectiontable.
     * 
     * @return iss
     */
    public int getIss() {
        return iss;
    }


    /**
     * Sets the iss value for this Nsconnectiontable.
     * 
     * @param iss
     */
    public void setIss(int iss) {
        this.iss = iss;
    }


    /**
     * Gets the irs value for this Nsconnectiontable.
     * 
     * @return irs
     */
    public int getIrs() {
        return irs;
    }


    /**
     * Sets the irs value for this Nsconnectiontable.
     * 
     * @param irs
     */
    public void setIrs(int irs) {
        this.irs = irs;
    }


    /**
     * Gets the rcvnxt value for this Nsconnectiontable.
     * 
     * @return rcvnxt
     */
    public int getRcvnxt() {
        return rcvnxt;
    }


    /**
     * Sets the rcvnxt value for this Nsconnectiontable.
     * 
     * @param rcvnxt
     */
    public void setRcvnxt(int rcvnxt) {
        this.rcvnxt = rcvnxt;
    }


    /**
     * Gets the maxack value for this Nsconnectiontable.
     * 
     * @return maxack
     */
    public int getMaxack() {
        return maxack;
    }


    /**
     * Sets the maxack value for this Nsconnectiontable.
     * 
     * @param maxack
     */
    public void setMaxack(int maxack) {
        this.maxack = maxack;
    }


    /**
     * Gets the sndnxt value for this Nsconnectiontable.
     * 
     * @return sndnxt
     */
    public int getSndnxt() {
        return sndnxt;
    }


    /**
     * Sets the sndnxt value for this Nsconnectiontable.
     * 
     * @param sndnxt
     */
    public void setSndnxt(int sndnxt) {
        this.sndnxt = sndnxt;
    }


    /**
     * Gets the sndunack value for this Nsconnectiontable.
     * 
     * @return sndunack
     */
    public int getSndunack() {
        return sndunack;
    }


    /**
     * Sets the sndunack value for this Nsconnectiontable.
     * 
     * @param sndunack
     */
    public void setSndunack(int sndunack) {
        this.sndunack = sndunack;
    }


    /**
     * Gets the httpendseq value for this Nsconnectiontable.
     * 
     * @return httpendseq
     */
    public int getHttpendseq() {
        return httpendseq;
    }


    /**
     * Sets the httpendseq value for this Nsconnectiontable.
     * 
     * @param httpendseq
     */
    public void setHttpendseq(int httpendseq) {
        this.httpendseq = httpendseq;
    }


    /**
     * Gets the httpstate value for this Nsconnectiontable.
     * 
     * @return httpstate
     */
    public java.lang.String getHttpstate() {
        return httpstate;
    }


    /**
     * Sets the httpstate value for this Nsconnectiontable.
     * 
     * @param httpstate
     */
    public void setHttpstate(java.lang.String httpstate) {
        this.httpstate = httpstate;
    }


    /**
     * Gets the trcount value for this Nsconnectiontable.
     * 
     * @return trcount
     */
    public int getTrcount() {
        return trcount;
    }


    /**
     * Sets the trcount value for this Nsconnectiontable.
     * 
     * @param trcount
     */
    public void setTrcount(int trcount) {
        this.trcount = trcount;
    }


    /**
     * Gets the priority value for this Nsconnectiontable.
     * 
     * @return priority
     */
    public java.lang.String getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Nsconnectiontable.
     * 
     * @param priority
     */
    public void setPriority(java.lang.String priority) {
        this.priority = priority;
    }


    /**
     * Gets the httpreqver value for this Nsconnectiontable.
     * 
     * @return httpreqver
     */
    public java.lang.String getHttpreqver() {
        return httpreqver;
    }


    /**
     * Sets the httpreqver value for this Nsconnectiontable.
     * 
     * @param httpreqver
     */
    public void setHttpreqver(java.lang.String httpreqver) {
        this.httpreqver = httpreqver;
    }


    /**
     * Gets the httprequest value for this Nsconnectiontable.
     * 
     * @return httprequest
     */
    public java.lang.String getHttprequest() {
        return httprequest;
    }


    /**
     * Sets the httprequest value for this Nsconnectiontable.
     * 
     * @param httprequest
     */
    public void setHttprequest(java.lang.String httprequest) {
        this.httprequest = httprequest;
    }


    /**
     * Gets the httprspcode value for this Nsconnectiontable.
     * 
     * @return httprspcode
     */
    public int getHttprspcode() {
        return httprspcode;
    }


    /**
     * Sets the httprspcode value for this Nsconnectiontable.
     * 
     * @param httprspcode
     */
    public void setHttprspcode(int httprspcode) {
        this.httprspcode = httprspcode;
    }


    /**
     * Gets the rttsmoothed value for this Nsconnectiontable.
     * 
     * @return rttsmoothed
     */
    public int getRttsmoothed() {
        return rttsmoothed;
    }


    /**
     * Sets the rttsmoothed value for this Nsconnectiontable.
     * 
     * @param rttsmoothed
     */
    public void setRttsmoothed(int rttsmoothed) {
        this.rttsmoothed = rttsmoothed;
    }


    /**
     * Gets the rttvariance value for this Nsconnectiontable.
     * 
     * @return rttvariance
     */
    public int getRttvariance() {
        return rttvariance;
    }


    /**
     * Sets the rttvariance value for this Nsconnectiontable.
     * 
     * @param rttvariance
     */
    public void setRttvariance(int rttvariance) {
        this.rttvariance = rttvariance;
    }


    /**
     * Gets the outoforderpkts value for this Nsconnectiontable.
     * 
     * @return outoforderpkts
     */
    public int getOutoforderpkts() {
        return outoforderpkts;
    }


    /**
     * Sets the outoforderpkts value for this Nsconnectiontable.
     * 
     * @param outoforderpkts
     */
    public void setOutoforderpkts(int outoforderpkts) {
        this.outoforderpkts = outoforderpkts;
    }


    /**
     * Gets the linkoptionflag value for this Nsconnectiontable.
     * 
     * @return linkoptionflag
     */
    public java.lang.String getLinkoptionflag() {
        return linkoptionflag;
    }


    /**
     * Sets the linkoptionflag value for this Nsconnectiontable.
     * 
     * @param linkoptionflag
     */
    public void setLinkoptionflag(java.lang.String linkoptionflag) {
        this.linkoptionflag = linkoptionflag;
    }


    /**
     * Gets the linknswsvalue value for this Nsconnectiontable.
     * 
     * @return linknswsvalue
     */
    public org.apache.axis.types.UnsignedInt getLinknswsvalue() {
        return linknswsvalue;
    }


    /**
     * Sets the linknswsvalue value for this Nsconnectiontable.
     * 
     * @param linknswsvalue
     */
    public void setLinknswsvalue(org.apache.axis.types.UnsignedInt linknswsvalue) {
        this.linknswsvalue = linknswsvalue;
    }


    /**
     * Gets the linkpeerwsvalue value for this Nsconnectiontable.
     * 
     * @return linkpeerwsvalue
     */
    public org.apache.axis.types.UnsignedInt getLinkpeerwsvalue() {
        return linkpeerwsvalue;
    }


    /**
     * Sets the linkpeerwsvalue value for this Nsconnectiontable.
     * 
     * @param linkpeerwsvalue
     */
    public void setLinkpeerwsvalue(org.apache.axis.types.UnsignedInt linkpeerwsvalue) {
        this.linkpeerwsvalue = linkpeerwsvalue;
    }


    /**
     * Gets the targetnodeidnnm value for this Nsconnectiontable.
     * 
     * @return targetnodeidnnm
     */
    public int getTargetnodeidnnm() {
        return targetnodeidnnm;
    }


    /**
     * Sets the targetnodeidnnm value for this Nsconnectiontable.
     * 
     * @param targetnodeidnnm
     */
    public void setTargetnodeidnnm(int targetnodeidnnm) {
        this.targetnodeidnnm = targetnodeidnnm;
    }


    /**
     * Gets the sourcenodeidnnm value for this Nsconnectiontable.
     * 
     * @return sourcenodeidnnm
     */
    public int getSourcenodeidnnm() {
        return sourcenodeidnnm;
    }


    /**
     * Sets the sourcenodeidnnm value for this Nsconnectiontable.
     * 
     * @param sourcenodeidnnm
     */
    public void setSourcenodeidnnm(int sourcenodeidnnm) {
        this.sourcenodeidnnm = sourcenodeidnnm;
    }


    /**
     * Gets the channelidnnm value for this Nsconnectiontable.
     * 
     * @return channelidnnm
     */
    public org.apache.axis.types.UnsignedInt getChannelidnnm() {
        return channelidnnm;
    }


    /**
     * Sets the channelidnnm value for this Nsconnectiontable.
     * 
     * @param channelidnnm
     */
    public void setChannelidnnm(org.apache.axis.types.UnsignedInt channelidnnm) {
        this.channelidnnm = channelidnnm;
    }


    /**
     * Gets the msgversionnnm value for this Nsconnectiontable.
     * 
     * @return msgversionnnm
     */
    public org.apache.axis.types.UnsignedInt getMsgversionnnm() {
        return msgversionnnm;
    }


    /**
     * Sets the msgversionnnm value for this Nsconnectiontable.
     * 
     * @param msgversionnnm
     */
    public void setMsgversionnnm(org.apache.axis.types.UnsignedInt msgversionnnm) {
        this.msgversionnnm = msgversionnnm;
    }


    /**
     * Gets the td value for this Nsconnectiontable.
     * 
     * @return td
     */
    public org.apache.axis.types.UnsignedInt getTd() {
        return td;
    }


    /**
     * Sets the td value for this Nsconnectiontable.
     * 
     * @param td
     */
    public void setTd(org.apache.axis.types.UnsignedInt td) {
        this.td = td;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nsconnectiontable)) return false;
        Nsconnectiontable other = (Nsconnectiontable) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.filterexpression==null && other.getFilterexpression()==null) || 
             (this.filterexpression!=null &&
              this.filterexpression.equals(other.getFilterexpression()))) &&
            this.link == other.isLink() &&
            this.name == other.isName() &&
            ((this.detail==null && other.getDetail()==null) || 
             (this.detail!=null &&
              this.detail.equals(other.getDetail()))) &&
            ((this.sourceip==null && other.getSourceip()==null) || 
             (this.sourceip!=null &&
              this.sourceip.equals(other.getSourceip()))) &&
            ((this.sourceport==null && other.getSourceport()==null) || 
             (this.sourceport!=null &&
              this.sourceport.equals(other.getSourceport()))) &&
            ((this.destip==null && other.getDestip()==null) || 
             (this.destip!=null &&
              this.destip.equals(other.getDestip()))) &&
            ((this.destport==null && other.getDestport()==null) || 
             (this.destport!=null &&
              this.destport.equals(other.getDestport()))) &&
            ((this.svctype==null && other.getSvctype()==null) || 
             (this.svctype!=null &&
              this.svctype.equals(other.getSvctype()))) &&
            this.idletime == other.getIdletime() &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.linksourceip==null && other.getLinksourceip()==null) || 
             (this.linksourceip!=null &&
              this.linksourceip.equals(other.getLinksourceip()))) &&
            ((this.linksourceport==null && other.getLinksourceport()==null) || 
             (this.linksourceport!=null &&
              this.linksourceport.equals(other.getLinksourceport()))) &&
            ((this.linkdestip==null && other.getLinkdestip()==null) || 
             (this.linkdestip!=null &&
              this.linkdestip.equals(other.getLinkdestip()))) &&
            ((this.linkdestport==null && other.getLinkdestport()==null) || 
             (this.linkdestport!=null &&
              this.linkdestport.equals(other.getLinkdestport()))) &&
            ((this.linkservicetype==null && other.getLinkservicetype()==null) || 
             (this.linkservicetype!=null &&
              this.linkservicetype.equals(other.getLinkservicetype()))) &&
            this.linkidletime == other.getLinkidletime() &&
            ((this.linkstate==null && other.getLinkstate()==null) || 
             (this.linkstate!=null &&
              this.linkstate.equals(other.getLinkstate()))) &&
            ((this.entityname==null && other.getEntityname()==null) || 
             (this.entityname!=null &&
              this.entityname.equals(other.getEntityname()))) &&
            ((this.linkentityname==null && other.getLinkentityname()==null) || 
             (this.linkentityname!=null &&
              this.linkentityname.equals(other.getLinkentityname()))) &&
            this.connectionnumber == other.getConnectionnumber() &&
            this.linkconnectionnumber == other.getLinkconnectionnumber() &&
            ((this.connid==null && other.getConnid()==null) || 
             (this.connid!=null &&
              this.connid.equals(other.getConnid()))) &&
            ((this.linkconnid==null && other.getLinkconnid()==null) || 
             (this.linkconnid!=null &&
              this.linkconnid.equals(other.getLinkconnid()))) &&
            ((this.optionflags==null && other.getOptionflags()==null) || 
             (this.optionflags!=null &&
              this.optionflags.equals(other.getOptionflags()))) &&
            ((this.nswsvalue==null && other.getNswsvalue()==null) || 
             (this.nswsvalue!=null &&
              this.nswsvalue.equals(other.getNswsvalue()))) &&
            ((this.peerwsvalue==null && other.getPeerwsvalue()==null) || 
             (this.peerwsvalue!=null &&
              this.peerwsvalue.equals(other.getPeerwsvalue()))) &&
            this.mss == other.getMss() &&
            this.retxretrycnt == other.getRetxretrycnt() &&
            this.rcvwnd == other.getRcvwnd() &&
            this.advwnd == other.getAdvwnd() &&
            this.sndcwnd == other.getSndcwnd() &&
            this.iss == other.getIss() &&
            this.irs == other.getIrs() &&
            this.rcvnxt == other.getRcvnxt() &&
            this.maxack == other.getMaxack() &&
            this.sndnxt == other.getSndnxt() &&
            this.sndunack == other.getSndunack() &&
            this.httpendseq == other.getHttpendseq() &&
            ((this.httpstate==null && other.getHttpstate()==null) || 
             (this.httpstate!=null &&
              this.httpstate.equals(other.getHttpstate()))) &&
            this.trcount == other.getTrcount() &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.httpreqver==null && other.getHttpreqver()==null) || 
             (this.httpreqver!=null &&
              this.httpreqver.equals(other.getHttpreqver()))) &&
            ((this.httprequest==null && other.getHttprequest()==null) || 
             (this.httprequest!=null &&
              this.httprequest.equals(other.getHttprequest()))) &&
            this.httprspcode == other.getHttprspcode() &&
            this.rttsmoothed == other.getRttsmoothed() &&
            this.rttvariance == other.getRttvariance() &&
            this.outoforderpkts == other.getOutoforderpkts() &&
            ((this.linkoptionflag==null && other.getLinkoptionflag()==null) || 
             (this.linkoptionflag!=null &&
              this.linkoptionflag.equals(other.getLinkoptionflag()))) &&
            ((this.linknswsvalue==null && other.getLinknswsvalue()==null) || 
             (this.linknswsvalue!=null &&
              this.linknswsvalue.equals(other.getLinknswsvalue()))) &&
            ((this.linkpeerwsvalue==null && other.getLinkpeerwsvalue()==null) || 
             (this.linkpeerwsvalue!=null &&
              this.linkpeerwsvalue.equals(other.getLinkpeerwsvalue()))) &&
            this.targetnodeidnnm == other.getTargetnodeidnnm() &&
            this.sourcenodeidnnm == other.getSourcenodeidnnm() &&
            ((this.channelidnnm==null && other.getChannelidnnm()==null) || 
             (this.channelidnnm!=null &&
              this.channelidnnm.equals(other.getChannelidnnm()))) &&
            ((this.msgversionnnm==null && other.getMsgversionnnm()==null) || 
             (this.msgversionnnm!=null &&
              this.msgversionnnm.equals(other.getMsgversionnnm()))) &&
            ((this.td==null && other.getTd()==null) || 
             (this.td!=null &&
              this.td.equals(other.getTd())));
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
        if (getFilterexpression() != null) {
            _hashCode += getFilterexpression().hashCode();
        }
        _hashCode += (isLink() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isName() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDetail() != null) {
            _hashCode += getDetail().hashCode();
        }
        if (getSourceip() != null) {
            _hashCode += getSourceip().hashCode();
        }
        if (getSourceport() != null) {
            _hashCode += getSourceport().hashCode();
        }
        if (getDestip() != null) {
            _hashCode += getDestip().hashCode();
        }
        if (getDestport() != null) {
            _hashCode += getDestport().hashCode();
        }
        if (getSvctype() != null) {
            _hashCode += getSvctype().hashCode();
        }
        _hashCode += getIdletime();
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getLinksourceip() != null) {
            _hashCode += getLinksourceip().hashCode();
        }
        if (getLinksourceport() != null) {
            _hashCode += getLinksourceport().hashCode();
        }
        if (getLinkdestip() != null) {
            _hashCode += getLinkdestip().hashCode();
        }
        if (getLinkdestport() != null) {
            _hashCode += getLinkdestport().hashCode();
        }
        if (getLinkservicetype() != null) {
            _hashCode += getLinkservicetype().hashCode();
        }
        _hashCode += getLinkidletime();
        if (getLinkstate() != null) {
            _hashCode += getLinkstate().hashCode();
        }
        if (getEntityname() != null) {
            _hashCode += getEntityname().hashCode();
        }
        if (getLinkentityname() != null) {
            _hashCode += getLinkentityname().hashCode();
        }
        _hashCode += getConnectionnumber();
        _hashCode += getLinkconnectionnumber();
        if (getConnid() != null) {
            _hashCode += getConnid().hashCode();
        }
        if (getLinkconnid() != null) {
            _hashCode += getLinkconnid().hashCode();
        }
        if (getOptionflags() != null) {
            _hashCode += getOptionflags().hashCode();
        }
        if (getNswsvalue() != null) {
            _hashCode += getNswsvalue().hashCode();
        }
        if (getPeerwsvalue() != null) {
            _hashCode += getPeerwsvalue().hashCode();
        }
        _hashCode += getMss();
        _hashCode += getRetxretrycnt();
        _hashCode += getRcvwnd();
        _hashCode += getAdvwnd();
        _hashCode += getSndcwnd();
        _hashCode += getIss();
        _hashCode += getIrs();
        _hashCode += getRcvnxt();
        _hashCode += getMaxack();
        _hashCode += getSndnxt();
        _hashCode += getSndunack();
        _hashCode += getHttpendseq();
        if (getHttpstate() != null) {
            _hashCode += getHttpstate().hashCode();
        }
        _hashCode += getTrcount();
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getHttpreqver() != null) {
            _hashCode += getHttpreqver().hashCode();
        }
        if (getHttprequest() != null) {
            _hashCode += getHttprequest().hashCode();
        }
        _hashCode += getHttprspcode();
        _hashCode += getRttsmoothed();
        _hashCode += getRttvariance();
        _hashCode += getOutoforderpkts();
        if (getLinkoptionflag() != null) {
            _hashCode += getLinkoptionflag().hashCode();
        }
        if (getLinknswsvalue() != null) {
            _hashCode += getLinknswsvalue().hashCode();
        }
        if (getLinkpeerwsvalue() != null) {
            _hashCode += getLinkpeerwsvalue().hashCode();
        }
        _hashCode += getTargetnodeidnnm();
        _hashCode += getSourcenodeidnnm();
        if (getChannelidnnm() != null) {
            _hashCode += getChannelidnnm().hashCode();
        }
        if (getMsgversionnnm() != null) {
            _hashCode += getMsgversionnnm().hashCode();
        }
        if (getTd() != null) {
            _hashCode += getTd().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Nsconnectiontable.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nsconnectiontable"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterexpression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filterexpression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("link");
        elemField.setXmlName(new javax.xml.namespace.QName("", "link"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "detail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourceport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svctype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svctype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idletime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idletime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linksourceip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linksourceip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linksourceport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linksourceport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkdestip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkdestip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkdestport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkdestport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkservicetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkservicetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkidletime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkidletime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "entityname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkentityname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkentityname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionnumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connectionnumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkconnectionnumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkconnectionnumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkconnid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkconnid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionflags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "optionflags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nswsvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nswsvalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("peerwsvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "peerwsvalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mss");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retxretrycnt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retxretrycnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rcvwnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rcvwnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advwnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advwnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sndcwnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sndcwnd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("iss");
        elemField.setXmlName(new javax.xml.namespace.QName("", "iss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("irs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "irs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rcvnxt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rcvnxt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxack");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxack"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sndnxt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sndnxt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sndunack");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sndunack"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpendseq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpendseq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trcount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trcount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpreqver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpreqver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httprequest");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httprequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httprspcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httprspcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rttsmoothed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rttsmoothed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rttvariance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rttvariance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outoforderpkts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outoforderpkts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkoptionflag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkoptionflag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linknswsvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linknswsvalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkpeerwsvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkpeerwsvalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetnodeidnnm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "targetnodeidnnm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourcenodeidnnm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sourcenodeidnnm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelidnnm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channelidnnm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msgversionnnm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msgversionnnm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("td");
        elemField.setXmlName(new javax.xml.namespace.QName("", "td"));
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
