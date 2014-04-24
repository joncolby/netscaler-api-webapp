/**
 * Cacheobject.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Cacheobject  implements java.io.Serializable {
    private java.lang.String url;

    private org.apache.axis.types.UnsignedLong locator;

    private org.apache.axis.types.UnsignedInt httpstatus;

    private java.lang.String host;

    private org.apache.axis.types.UnsignedInt port;

    private java.lang.String groupname;

    private java.lang.String httpmethod;

    private java.lang.String group;

    private java.lang.String ignoremarkerobjects;

    private java.lang.String includenotreadyobjects;

    private org.apache.axis.types.UnsignedInt cacheressize;

    private org.apache.axis.types.UnsignedInt cachereshdrsize;

    private java.lang.String cacheetag;

    private org.apache.axis.types.UnsignedInt httpstatusoutput;

    private java.lang.String cachereslastmod;

    private java.lang.String cachecontrol;

    private java.lang.String cacheresdate;

    private java.lang.String contentgroup;

    private org.apache.axis.types.UnsignedInt destip;

    private java.lang.String destipv46;

    private org.apache.axis.types.UnsignedInt destport;

    private java.lang.String cachecellcomplex;

    private java.lang.String[] hitparams;

    private java.lang.String[] hitvalues;

    private org.apache.axis.types.UnsignedInt cachecellreqtime;

    private org.apache.axis.types.UnsignedInt cachecellrestime;

    private org.apache.axis.types.UnsignedInt cachecurage;

    private org.apache.axis.types.UnsignedInt cachecellexpires;

    private org.apache.axis.types.UnsignedInt cachecellexpiresmillisec;

    private java.lang.String flushed;

    private java.lang.String prefetch;

    private org.apache.axis.types.UnsignedInt prefetchperiod;

    private org.apache.axis.types.UnsignedInt prefetchperiodmillisec;

    private org.apache.axis.types.UnsignedInt cachecellcurreaders;

    private org.apache.axis.types.UnsignedInt cachecellcurmisses;

    private org.apache.axis.types.UnsignedInt cachecellhits;

    private org.apache.axis.types.UnsignedInt cachecellmisses;

    private org.apache.axis.types.UnsignedInt cachecelldhits;

    private java.lang.String cachecellgzipcompressed;

    private java.lang.String cachecelldeflatecompressed;

    private java.lang.String cachecellcompressionformat;

    private java.lang.String cachecellappfwmetadataexists;

    private java.lang.String cachecellhttp11;

    private java.lang.String cachecellweaketag;

    private java.lang.String cachecellresbadsize;

    private java.lang.String markerreason;

    private java.lang.String cachecellpolleverytime;

    private java.lang.String cachecelletaginserted;

    private java.lang.String cachecellreadywithlastbyte;

    private java.lang.String cacheinmemory;

    private java.lang.String cacheindisk;

    private java.lang.String cachedirname;

    private java.lang.String cachefilename;

    private java.lang.String cachecelldestipverified;

    private java.lang.String cachecellfwpxyobj;

    private java.lang.String cachecellbasefile;

    private java.lang.String cachecellminhitflag;

    private int cachecellminhit;

    private int policy;

    private java.lang.String policyname;

    private java.lang.String[] selectorname;

    private java.lang.String[] rule;

    private java.lang.String[] selectorvalue;

    private java.lang.String cacheurls;

    private org.apache.axis.types.UnsignedInt warnbucketskip;

    private org.apache.axis.types.UnsignedInt totalobjs;

    private java.lang.String httpcalloutcell;

    private java.lang.String httpcalloutname;

    private java.lang.String returntype;

    private java.lang.String httpcalloutresult;

    private org.apache.axis.types.UnsignedInt ceflags;

    public Cacheobject() {
    }

    public Cacheobject(
           java.lang.String url,
           org.apache.axis.types.UnsignedLong locator,
           org.apache.axis.types.UnsignedInt httpstatus,
           java.lang.String host,
           org.apache.axis.types.UnsignedInt port,
           java.lang.String groupname,
           java.lang.String httpmethod,
           java.lang.String group,
           java.lang.String ignoremarkerobjects,
           java.lang.String includenotreadyobjects,
           org.apache.axis.types.UnsignedInt cacheressize,
           org.apache.axis.types.UnsignedInt cachereshdrsize,
           java.lang.String cacheetag,
           org.apache.axis.types.UnsignedInt httpstatusoutput,
           java.lang.String cachereslastmod,
           java.lang.String cachecontrol,
           java.lang.String cacheresdate,
           java.lang.String contentgroup,
           org.apache.axis.types.UnsignedInt destip,
           java.lang.String destipv46,
           org.apache.axis.types.UnsignedInt destport,
           java.lang.String cachecellcomplex,
           java.lang.String[] hitparams,
           java.lang.String[] hitvalues,
           org.apache.axis.types.UnsignedInt cachecellreqtime,
           org.apache.axis.types.UnsignedInt cachecellrestime,
           org.apache.axis.types.UnsignedInt cachecurage,
           org.apache.axis.types.UnsignedInt cachecellexpires,
           org.apache.axis.types.UnsignedInt cachecellexpiresmillisec,
           java.lang.String flushed,
           java.lang.String prefetch,
           org.apache.axis.types.UnsignedInt prefetchperiod,
           org.apache.axis.types.UnsignedInt prefetchperiodmillisec,
           org.apache.axis.types.UnsignedInt cachecellcurreaders,
           org.apache.axis.types.UnsignedInt cachecellcurmisses,
           org.apache.axis.types.UnsignedInt cachecellhits,
           org.apache.axis.types.UnsignedInt cachecellmisses,
           org.apache.axis.types.UnsignedInt cachecelldhits,
           java.lang.String cachecellgzipcompressed,
           java.lang.String cachecelldeflatecompressed,
           java.lang.String cachecellcompressionformat,
           java.lang.String cachecellappfwmetadataexists,
           java.lang.String cachecellhttp11,
           java.lang.String cachecellweaketag,
           java.lang.String cachecellresbadsize,
           java.lang.String markerreason,
           java.lang.String cachecellpolleverytime,
           java.lang.String cachecelletaginserted,
           java.lang.String cachecellreadywithlastbyte,
           java.lang.String cacheinmemory,
           java.lang.String cacheindisk,
           java.lang.String cachedirname,
           java.lang.String cachefilename,
           java.lang.String cachecelldestipverified,
           java.lang.String cachecellfwpxyobj,
           java.lang.String cachecellbasefile,
           java.lang.String cachecellminhitflag,
           int cachecellminhit,
           int policy,
           java.lang.String policyname,
           java.lang.String[] selectorname,
           java.lang.String[] rule,
           java.lang.String[] selectorvalue,
           java.lang.String cacheurls,
           org.apache.axis.types.UnsignedInt warnbucketskip,
           org.apache.axis.types.UnsignedInt totalobjs,
           java.lang.String httpcalloutcell,
           java.lang.String httpcalloutname,
           java.lang.String returntype,
           java.lang.String httpcalloutresult,
           org.apache.axis.types.UnsignedInt ceflags) {
           this.url = url;
           this.locator = locator;
           this.httpstatus = httpstatus;
           this.host = host;
           this.port = port;
           this.groupname = groupname;
           this.httpmethod = httpmethod;
           this.group = group;
           this.ignoremarkerobjects = ignoremarkerobjects;
           this.includenotreadyobjects = includenotreadyobjects;
           this.cacheressize = cacheressize;
           this.cachereshdrsize = cachereshdrsize;
           this.cacheetag = cacheetag;
           this.httpstatusoutput = httpstatusoutput;
           this.cachereslastmod = cachereslastmod;
           this.cachecontrol = cachecontrol;
           this.cacheresdate = cacheresdate;
           this.contentgroup = contentgroup;
           this.destip = destip;
           this.destipv46 = destipv46;
           this.destport = destport;
           this.cachecellcomplex = cachecellcomplex;
           this.hitparams = hitparams;
           this.hitvalues = hitvalues;
           this.cachecellreqtime = cachecellreqtime;
           this.cachecellrestime = cachecellrestime;
           this.cachecurage = cachecurage;
           this.cachecellexpires = cachecellexpires;
           this.cachecellexpiresmillisec = cachecellexpiresmillisec;
           this.flushed = flushed;
           this.prefetch = prefetch;
           this.prefetchperiod = prefetchperiod;
           this.prefetchperiodmillisec = prefetchperiodmillisec;
           this.cachecellcurreaders = cachecellcurreaders;
           this.cachecellcurmisses = cachecellcurmisses;
           this.cachecellhits = cachecellhits;
           this.cachecellmisses = cachecellmisses;
           this.cachecelldhits = cachecelldhits;
           this.cachecellgzipcompressed = cachecellgzipcompressed;
           this.cachecelldeflatecompressed = cachecelldeflatecompressed;
           this.cachecellcompressionformat = cachecellcompressionformat;
           this.cachecellappfwmetadataexists = cachecellappfwmetadataexists;
           this.cachecellhttp11 = cachecellhttp11;
           this.cachecellweaketag = cachecellweaketag;
           this.cachecellresbadsize = cachecellresbadsize;
           this.markerreason = markerreason;
           this.cachecellpolleverytime = cachecellpolleverytime;
           this.cachecelletaginserted = cachecelletaginserted;
           this.cachecellreadywithlastbyte = cachecellreadywithlastbyte;
           this.cacheinmemory = cacheinmemory;
           this.cacheindisk = cacheindisk;
           this.cachedirname = cachedirname;
           this.cachefilename = cachefilename;
           this.cachecelldestipverified = cachecelldestipverified;
           this.cachecellfwpxyobj = cachecellfwpxyobj;
           this.cachecellbasefile = cachecellbasefile;
           this.cachecellminhitflag = cachecellminhitflag;
           this.cachecellminhit = cachecellminhit;
           this.policy = policy;
           this.policyname = policyname;
           this.selectorname = selectorname;
           this.rule = rule;
           this.selectorvalue = selectorvalue;
           this.cacheurls = cacheurls;
           this.warnbucketskip = warnbucketskip;
           this.totalobjs = totalobjs;
           this.httpcalloutcell = httpcalloutcell;
           this.httpcalloutname = httpcalloutname;
           this.returntype = returntype;
           this.httpcalloutresult = httpcalloutresult;
           this.ceflags = ceflags;
    }


    /**
     * Gets the url value for this Cacheobject.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Cacheobject.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the locator value for this Cacheobject.
     * 
     * @return locator
     */
    public org.apache.axis.types.UnsignedLong getLocator() {
        return locator;
    }


    /**
     * Sets the locator value for this Cacheobject.
     * 
     * @param locator
     */
    public void setLocator(org.apache.axis.types.UnsignedLong locator) {
        this.locator = locator;
    }


    /**
     * Gets the httpstatus value for this Cacheobject.
     * 
     * @return httpstatus
     */
    public org.apache.axis.types.UnsignedInt getHttpstatus() {
        return httpstatus;
    }


    /**
     * Sets the httpstatus value for this Cacheobject.
     * 
     * @param httpstatus
     */
    public void setHttpstatus(org.apache.axis.types.UnsignedInt httpstatus) {
        this.httpstatus = httpstatus;
    }


    /**
     * Gets the host value for this Cacheobject.
     * 
     * @return host
     */
    public java.lang.String getHost() {
        return host;
    }


    /**
     * Sets the host value for this Cacheobject.
     * 
     * @param host
     */
    public void setHost(java.lang.String host) {
        this.host = host;
    }


    /**
     * Gets the port value for this Cacheobject.
     * 
     * @return port
     */
    public org.apache.axis.types.UnsignedInt getPort() {
        return port;
    }


    /**
     * Sets the port value for this Cacheobject.
     * 
     * @param port
     */
    public void setPort(org.apache.axis.types.UnsignedInt port) {
        this.port = port;
    }


    /**
     * Gets the groupname value for this Cacheobject.
     * 
     * @return groupname
     */
    public java.lang.String getGroupname() {
        return groupname;
    }


    /**
     * Sets the groupname value for this Cacheobject.
     * 
     * @param groupname
     */
    public void setGroupname(java.lang.String groupname) {
        this.groupname = groupname;
    }


    /**
     * Gets the httpmethod value for this Cacheobject.
     * 
     * @return httpmethod
     */
    public java.lang.String getHttpmethod() {
        return httpmethod;
    }


    /**
     * Sets the httpmethod value for this Cacheobject.
     * 
     * @param httpmethod
     */
    public void setHttpmethod(java.lang.String httpmethod) {
        this.httpmethod = httpmethod;
    }


    /**
     * Gets the group value for this Cacheobject.
     * 
     * @return group
     */
    public java.lang.String getGroup() {
        return group;
    }


    /**
     * Sets the group value for this Cacheobject.
     * 
     * @param group
     */
    public void setGroup(java.lang.String group) {
        this.group = group;
    }


    /**
     * Gets the ignoremarkerobjects value for this Cacheobject.
     * 
     * @return ignoremarkerobjects
     */
    public java.lang.String getIgnoremarkerobjects() {
        return ignoremarkerobjects;
    }


    /**
     * Sets the ignoremarkerobjects value for this Cacheobject.
     * 
     * @param ignoremarkerobjects
     */
    public void setIgnoremarkerobjects(java.lang.String ignoremarkerobjects) {
        this.ignoremarkerobjects = ignoremarkerobjects;
    }


    /**
     * Gets the includenotreadyobjects value for this Cacheobject.
     * 
     * @return includenotreadyobjects
     */
    public java.lang.String getIncludenotreadyobjects() {
        return includenotreadyobjects;
    }


    /**
     * Sets the includenotreadyobjects value for this Cacheobject.
     * 
     * @param includenotreadyobjects
     */
    public void setIncludenotreadyobjects(java.lang.String includenotreadyobjects) {
        this.includenotreadyobjects = includenotreadyobjects;
    }


    /**
     * Gets the cacheressize value for this Cacheobject.
     * 
     * @return cacheressize
     */
    public org.apache.axis.types.UnsignedInt getCacheressize() {
        return cacheressize;
    }


    /**
     * Sets the cacheressize value for this Cacheobject.
     * 
     * @param cacheressize
     */
    public void setCacheressize(org.apache.axis.types.UnsignedInt cacheressize) {
        this.cacheressize = cacheressize;
    }


    /**
     * Gets the cachereshdrsize value for this Cacheobject.
     * 
     * @return cachereshdrsize
     */
    public org.apache.axis.types.UnsignedInt getCachereshdrsize() {
        return cachereshdrsize;
    }


    /**
     * Sets the cachereshdrsize value for this Cacheobject.
     * 
     * @param cachereshdrsize
     */
    public void setCachereshdrsize(org.apache.axis.types.UnsignedInt cachereshdrsize) {
        this.cachereshdrsize = cachereshdrsize;
    }


    /**
     * Gets the cacheetag value for this Cacheobject.
     * 
     * @return cacheetag
     */
    public java.lang.String getCacheetag() {
        return cacheetag;
    }


    /**
     * Sets the cacheetag value for this Cacheobject.
     * 
     * @param cacheetag
     */
    public void setCacheetag(java.lang.String cacheetag) {
        this.cacheetag = cacheetag;
    }


    /**
     * Gets the httpstatusoutput value for this Cacheobject.
     * 
     * @return httpstatusoutput
     */
    public org.apache.axis.types.UnsignedInt getHttpstatusoutput() {
        return httpstatusoutput;
    }


    /**
     * Sets the httpstatusoutput value for this Cacheobject.
     * 
     * @param httpstatusoutput
     */
    public void setHttpstatusoutput(org.apache.axis.types.UnsignedInt httpstatusoutput) {
        this.httpstatusoutput = httpstatusoutput;
    }


    /**
     * Gets the cachereslastmod value for this Cacheobject.
     * 
     * @return cachereslastmod
     */
    public java.lang.String getCachereslastmod() {
        return cachereslastmod;
    }


    /**
     * Sets the cachereslastmod value for this Cacheobject.
     * 
     * @param cachereslastmod
     */
    public void setCachereslastmod(java.lang.String cachereslastmod) {
        this.cachereslastmod = cachereslastmod;
    }


    /**
     * Gets the cachecontrol value for this Cacheobject.
     * 
     * @return cachecontrol
     */
    public java.lang.String getCachecontrol() {
        return cachecontrol;
    }


    /**
     * Sets the cachecontrol value for this Cacheobject.
     * 
     * @param cachecontrol
     */
    public void setCachecontrol(java.lang.String cachecontrol) {
        this.cachecontrol = cachecontrol;
    }


    /**
     * Gets the cacheresdate value for this Cacheobject.
     * 
     * @return cacheresdate
     */
    public java.lang.String getCacheresdate() {
        return cacheresdate;
    }


    /**
     * Sets the cacheresdate value for this Cacheobject.
     * 
     * @param cacheresdate
     */
    public void setCacheresdate(java.lang.String cacheresdate) {
        this.cacheresdate = cacheresdate;
    }


    /**
     * Gets the contentgroup value for this Cacheobject.
     * 
     * @return contentgroup
     */
    public java.lang.String getContentgroup() {
        return contentgroup;
    }


    /**
     * Sets the contentgroup value for this Cacheobject.
     * 
     * @param contentgroup
     */
    public void setContentgroup(java.lang.String contentgroup) {
        this.contentgroup = contentgroup;
    }


    /**
     * Gets the destip value for this Cacheobject.
     * 
     * @return destip
     */
    public org.apache.axis.types.UnsignedInt getDestip() {
        return destip;
    }


    /**
     * Sets the destip value for this Cacheobject.
     * 
     * @param destip
     */
    public void setDestip(org.apache.axis.types.UnsignedInt destip) {
        this.destip = destip;
    }


    /**
     * Gets the destipv46 value for this Cacheobject.
     * 
     * @return destipv46
     */
    public java.lang.String getDestipv46() {
        return destipv46;
    }


    /**
     * Sets the destipv46 value for this Cacheobject.
     * 
     * @param destipv46
     */
    public void setDestipv46(java.lang.String destipv46) {
        this.destipv46 = destipv46;
    }


    /**
     * Gets the destport value for this Cacheobject.
     * 
     * @return destport
     */
    public org.apache.axis.types.UnsignedInt getDestport() {
        return destport;
    }


    /**
     * Sets the destport value for this Cacheobject.
     * 
     * @param destport
     */
    public void setDestport(org.apache.axis.types.UnsignedInt destport) {
        this.destport = destport;
    }


    /**
     * Gets the cachecellcomplex value for this Cacheobject.
     * 
     * @return cachecellcomplex
     */
    public java.lang.String getCachecellcomplex() {
        return cachecellcomplex;
    }


    /**
     * Sets the cachecellcomplex value for this Cacheobject.
     * 
     * @param cachecellcomplex
     */
    public void setCachecellcomplex(java.lang.String cachecellcomplex) {
        this.cachecellcomplex = cachecellcomplex;
    }


    /**
     * Gets the hitparams value for this Cacheobject.
     * 
     * @return hitparams
     */
    public java.lang.String[] getHitparams() {
        return hitparams;
    }


    /**
     * Sets the hitparams value for this Cacheobject.
     * 
     * @param hitparams
     */
    public void setHitparams(java.lang.String[] hitparams) {
        this.hitparams = hitparams;
    }


    /**
     * Gets the hitvalues value for this Cacheobject.
     * 
     * @return hitvalues
     */
    public java.lang.String[] getHitvalues() {
        return hitvalues;
    }


    /**
     * Sets the hitvalues value for this Cacheobject.
     * 
     * @param hitvalues
     */
    public void setHitvalues(java.lang.String[] hitvalues) {
        this.hitvalues = hitvalues;
    }


    /**
     * Gets the cachecellreqtime value for this Cacheobject.
     * 
     * @return cachecellreqtime
     */
    public org.apache.axis.types.UnsignedInt getCachecellreqtime() {
        return cachecellreqtime;
    }


    /**
     * Sets the cachecellreqtime value for this Cacheobject.
     * 
     * @param cachecellreqtime
     */
    public void setCachecellreqtime(org.apache.axis.types.UnsignedInt cachecellreqtime) {
        this.cachecellreqtime = cachecellreqtime;
    }


    /**
     * Gets the cachecellrestime value for this Cacheobject.
     * 
     * @return cachecellrestime
     */
    public org.apache.axis.types.UnsignedInt getCachecellrestime() {
        return cachecellrestime;
    }


    /**
     * Sets the cachecellrestime value for this Cacheobject.
     * 
     * @param cachecellrestime
     */
    public void setCachecellrestime(org.apache.axis.types.UnsignedInt cachecellrestime) {
        this.cachecellrestime = cachecellrestime;
    }


    /**
     * Gets the cachecurage value for this Cacheobject.
     * 
     * @return cachecurage
     */
    public org.apache.axis.types.UnsignedInt getCachecurage() {
        return cachecurage;
    }


    /**
     * Sets the cachecurage value for this Cacheobject.
     * 
     * @param cachecurage
     */
    public void setCachecurage(org.apache.axis.types.UnsignedInt cachecurage) {
        this.cachecurage = cachecurage;
    }


    /**
     * Gets the cachecellexpires value for this Cacheobject.
     * 
     * @return cachecellexpires
     */
    public org.apache.axis.types.UnsignedInt getCachecellexpires() {
        return cachecellexpires;
    }


    /**
     * Sets the cachecellexpires value for this Cacheobject.
     * 
     * @param cachecellexpires
     */
    public void setCachecellexpires(org.apache.axis.types.UnsignedInt cachecellexpires) {
        this.cachecellexpires = cachecellexpires;
    }


    /**
     * Gets the cachecellexpiresmillisec value for this Cacheobject.
     * 
     * @return cachecellexpiresmillisec
     */
    public org.apache.axis.types.UnsignedInt getCachecellexpiresmillisec() {
        return cachecellexpiresmillisec;
    }


    /**
     * Sets the cachecellexpiresmillisec value for this Cacheobject.
     * 
     * @param cachecellexpiresmillisec
     */
    public void setCachecellexpiresmillisec(org.apache.axis.types.UnsignedInt cachecellexpiresmillisec) {
        this.cachecellexpiresmillisec = cachecellexpiresmillisec;
    }


    /**
     * Gets the flushed value for this Cacheobject.
     * 
     * @return flushed
     */
    public java.lang.String getFlushed() {
        return flushed;
    }


    /**
     * Sets the flushed value for this Cacheobject.
     * 
     * @param flushed
     */
    public void setFlushed(java.lang.String flushed) {
        this.flushed = flushed;
    }


    /**
     * Gets the prefetch value for this Cacheobject.
     * 
     * @return prefetch
     */
    public java.lang.String getPrefetch() {
        return prefetch;
    }


    /**
     * Sets the prefetch value for this Cacheobject.
     * 
     * @param prefetch
     */
    public void setPrefetch(java.lang.String prefetch) {
        this.prefetch = prefetch;
    }


    /**
     * Gets the prefetchperiod value for this Cacheobject.
     * 
     * @return prefetchperiod
     */
    public org.apache.axis.types.UnsignedInt getPrefetchperiod() {
        return prefetchperiod;
    }


    /**
     * Sets the prefetchperiod value for this Cacheobject.
     * 
     * @param prefetchperiod
     */
    public void setPrefetchperiod(org.apache.axis.types.UnsignedInt prefetchperiod) {
        this.prefetchperiod = prefetchperiod;
    }


    /**
     * Gets the prefetchperiodmillisec value for this Cacheobject.
     * 
     * @return prefetchperiodmillisec
     */
    public org.apache.axis.types.UnsignedInt getPrefetchperiodmillisec() {
        return prefetchperiodmillisec;
    }


    /**
     * Sets the prefetchperiodmillisec value for this Cacheobject.
     * 
     * @param prefetchperiodmillisec
     */
    public void setPrefetchperiodmillisec(org.apache.axis.types.UnsignedInt prefetchperiodmillisec) {
        this.prefetchperiodmillisec = prefetchperiodmillisec;
    }


    /**
     * Gets the cachecellcurreaders value for this Cacheobject.
     * 
     * @return cachecellcurreaders
     */
    public org.apache.axis.types.UnsignedInt getCachecellcurreaders() {
        return cachecellcurreaders;
    }


    /**
     * Sets the cachecellcurreaders value for this Cacheobject.
     * 
     * @param cachecellcurreaders
     */
    public void setCachecellcurreaders(org.apache.axis.types.UnsignedInt cachecellcurreaders) {
        this.cachecellcurreaders = cachecellcurreaders;
    }


    /**
     * Gets the cachecellcurmisses value for this Cacheobject.
     * 
     * @return cachecellcurmisses
     */
    public org.apache.axis.types.UnsignedInt getCachecellcurmisses() {
        return cachecellcurmisses;
    }


    /**
     * Sets the cachecellcurmisses value for this Cacheobject.
     * 
     * @param cachecellcurmisses
     */
    public void setCachecellcurmisses(org.apache.axis.types.UnsignedInt cachecellcurmisses) {
        this.cachecellcurmisses = cachecellcurmisses;
    }


    /**
     * Gets the cachecellhits value for this Cacheobject.
     * 
     * @return cachecellhits
     */
    public org.apache.axis.types.UnsignedInt getCachecellhits() {
        return cachecellhits;
    }


    /**
     * Sets the cachecellhits value for this Cacheobject.
     * 
     * @param cachecellhits
     */
    public void setCachecellhits(org.apache.axis.types.UnsignedInt cachecellhits) {
        this.cachecellhits = cachecellhits;
    }


    /**
     * Gets the cachecellmisses value for this Cacheobject.
     * 
     * @return cachecellmisses
     */
    public org.apache.axis.types.UnsignedInt getCachecellmisses() {
        return cachecellmisses;
    }


    /**
     * Sets the cachecellmisses value for this Cacheobject.
     * 
     * @param cachecellmisses
     */
    public void setCachecellmisses(org.apache.axis.types.UnsignedInt cachecellmisses) {
        this.cachecellmisses = cachecellmisses;
    }


    /**
     * Gets the cachecelldhits value for this Cacheobject.
     * 
     * @return cachecelldhits
     */
    public org.apache.axis.types.UnsignedInt getCachecelldhits() {
        return cachecelldhits;
    }


    /**
     * Sets the cachecelldhits value for this Cacheobject.
     * 
     * @param cachecelldhits
     */
    public void setCachecelldhits(org.apache.axis.types.UnsignedInt cachecelldhits) {
        this.cachecelldhits = cachecelldhits;
    }


    /**
     * Gets the cachecellgzipcompressed value for this Cacheobject.
     * 
     * @return cachecellgzipcompressed
     */
    public java.lang.String getCachecellgzipcompressed() {
        return cachecellgzipcompressed;
    }


    /**
     * Sets the cachecellgzipcompressed value for this Cacheobject.
     * 
     * @param cachecellgzipcompressed
     */
    public void setCachecellgzipcompressed(java.lang.String cachecellgzipcompressed) {
        this.cachecellgzipcompressed = cachecellgzipcompressed;
    }


    /**
     * Gets the cachecelldeflatecompressed value for this Cacheobject.
     * 
     * @return cachecelldeflatecompressed
     */
    public java.lang.String getCachecelldeflatecompressed() {
        return cachecelldeflatecompressed;
    }


    /**
     * Sets the cachecelldeflatecompressed value for this Cacheobject.
     * 
     * @param cachecelldeflatecompressed
     */
    public void setCachecelldeflatecompressed(java.lang.String cachecelldeflatecompressed) {
        this.cachecelldeflatecompressed = cachecelldeflatecompressed;
    }


    /**
     * Gets the cachecellcompressionformat value for this Cacheobject.
     * 
     * @return cachecellcompressionformat
     */
    public java.lang.String getCachecellcompressionformat() {
        return cachecellcompressionformat;
    }


    /**
     * Sets the cachecellcompressionformat value for this Cacheobject.
     * 
     * @param cachecellcompressionformat
     */
    public void setCachecellcompressionformat(java.lang.String cachecellcompressionformat) {
        this.cachecellcompressionformat = cachecellcompressionformat;
    }


    /**
     * Gets the cachecellappfwmetadataexists value for this Cacheobject.
     * 
     * @return cachecellappfwmetadataexists
     */
    public java.lang.String getCachecellappfwmetadataexists() {
        return cachecellappfwmetadataexists;
    }


    /**
     * Sets the cachecellappfwmetadataexists value for this Cacheobject.
     * 
     * @param cachecellappfwmetadataexists
     */
    public void setCachecellappfwmetadataexists(java.lang.String cachecellappfwmetadataexists) {
        this.cachecellappfwmetadataexists = cachecellappfwmetadataexists;
    }


    /**
     * Gets the cachecellhttp11 value for this Cacheobject.
     * 
     * @return cachecellhttp11
     */
    public java.lang.String getCachecellhttp11() {
        return cachecellhttp11;
    }


    /**
     * Sets the cachecellhttp11 value for this Cacheobject.
     * 
     * @param cachecellhttp11
     */
    public void setCachecellhttp11(java.lang.String cachecellhttp11) {
        this.cachecellhttp11 = cachecellhttp11;
    }


    /**
     * Gets the cachecellweaketag value for this Cacheobject.
     * 
     * @return cachecellweaketag
     */
    public java.lang.String getCachecellweaketag() {
        return cachecellweaketag;
    }


    /**
     * Sets the cachecellweaketag value for this Cacheobject.
     * 
     * @param cachecellweaketag
     */
    public void setCachecellweaketag(java.lang.String cachecellweaketag) {
        this.cachecellweaketag = cachecellweaketag;
    }


    /**
     * Gets the cachecellresbadsize value for this Cacheobject.
     * 
     * @return cachecellresbadsize
     */
    public java.lang.String getCachecellresbadsize() {
        return cachecellresbadsize;
    }


    /**
     * Sets the cachecellresbadsize value for this Cacheobject.
     * 
     * @param cachecellresbadsize
     */
    public void setCachecellresbadsize(java.lang.String cachecellresbadsize) {
        this.cachecellresbadsize = cachecellresbadsize;
    }


    /**
     * Gets the markerreason value for this Cacheobject.
     * 
     * @return markerreason
     */
    public java.lang.String getMarkerreason() {
        return markerreason;
    }


    /**
     * Sets the markerreason value for this Cacheobject.
     * 
     * @param markerreason
     */
    public void setMarkerreason(java.lang.String markerreason) {
        this.markerreason = markerreason;
    }


    /**
     * Gets the cachecellpolleverytime value for this Cacheobject.
     * 
     * @return cachecellpolleverytime
     */
    public java.lang.String getCachecellpolleverytime() {
        return cachecellpolleverytime;
    }


    /**
     * Sets the cachecellpolleverytime value for this Cacheobject.
     * 
     * @param cachecellpolleverytime
     */
    public void setCachecellpolleverytime(java.lang.String cachecellpolleverytime) {
        this.cachecellpolleverytime = cachecellpolleverytime;
    }


    /**
     * Gets the cachecelletaginserted value for this Cacheobject.
     * 
     * @return cachecelletaginserted
     */
    public java.lang.String getCachecelletaginserted() {
        return cachecelletaginserted;
    }


    /**
     * Sets the cachecelletaginserted value for this Cacheobject.
     * 
     * @param cachecelletaginserted
     */
    public void setCachecelletaginserted(java.lang.String cachecelletaginserted) {
        this.cachecelletaginserted = cachecelletaginserted;
    }


    /**
     * Gets the cachecellreadywithlastbyte value for this Cacheobject.
     * 
     * @return cachecellreadywithlastbyte
     */
    public java.lang.String getCachecellreadywithlastbyte() {
        return cachecellreadywithlastbyte;
    }


    /**
     * Sets the cachecellreadywithlastbyte value for this Cacheobject.
     * 
     * @param cachecellreadywithlastbyte
     */
    public void setCachecellreadywithlastbyte(java.lang.String cachecellreadywithlastbyte) {
        this.cachecellreadywithlastbyte = cachecellreadywithlastbyte;
    }


    /**
     * Gets the cacheinmemory value for this Cacheobject.
     * 
     * @return cacheinmemory
     */
    public java.lang.String getCacheinmemory() {
        return cacheinmemory;
    }


    /**
     * Sets the cacheinmemory value for this Cacheobject.
     * 
     * @param cacheinmemory
     */
    public void setCacheinmemory(java.lang.String cacheinmemory) {
        this.cacheinmemory = cacheinmemory;
    }


    /**
     * Gets the cacheindisk value for this Cacheobject.
     * 
     * @return cacheindisk
     */
    public java.lang.String getCacheindisk() {
        return cacheindisk;
    }


    /**
     * Sets the cacheindisk value for this Cacheobject.
     * 
     * @param cacheindisk
     */
    public void setCacheindisk(java.lang.String cacheindisk) {
        this.cacheindisk = cacheindisk;
    }


    /**
     * Gets the cachedirname value for this Cacheobject.
     * 
     * @return cachedirname
     */
    public java.lang.String getCachedirname() {
        return cachedirname;
    }


    /**
     * Sets the cachedirname value for this Cacheobject.
     * 
     * @param cachedirname
     */
    public void setCachedirname(java.lang.String cachedirname) {
        this.cachedirname = cachedirname;
    }


    /**
     * Gets the cachefilename value for this Cacheobject.
     * 
     * @return cachefilename
     */
    public java.lang.String getCachefilename() {
        return cachefilename;
    }


    /**
     * Sets the cachefilename value for this Cacheobject.
     * 
     * @param cachefilename
     */
    public void setCachefilename(java.lang.String cachefilename) {
        this.cachefilename = cachefilename;
    }


    /**
     * Gets the cachecelldestipverified value for this Cacheobject.
     * 
     * @return cachecelldestipverified
     */
    public java.lang.String getCachecelldestipverified() {
        return cachecelldestipverified;
    }


    /**
     * Sets the cachecelldestipverified value for this Cacheobject.
     * 
     * @param cachecelldestipverified
     */
    public void setCachecelldestipverified(java.lang.String cachecelldestipverified) {
        this.cachecelldestipverified = cachecelldestipverified;
    }


    /**
     * Gets the cachecellfwpxyobj value for this Cacheobject.
     * 
     * @return cachecellfwpxyobj
     */
    public java.lang.String getCachecellfwpxyobj() {
        return cachecellfwpxyobj;
    }


    /**
     * Sets the cachecellfwpxyobj value for this Cacheobject.
     * 
     * @param cachecellfwpxyobj
     */
    public void setCachecellfwpxyobj(java.lang.String cachecellfwpxyobj) {
        this.cachecellfwpxyobj = cachecellfwpxyobj;
    }


    /**
     * Gets the cachecellbasefile value for this Cacheobject.
     * 
     * @return cachecellbasefile
     */
    public java.lang.String getCachecellbasefile() {
        return cachecellbasefile;
    }


    /**
     * Sets the cachecellbasefile value for this Cacheobject.
     * 
     * @param cachecellbasefile
     */
    public void setCachecellbasefile(java.lang.String cachecellbasefile) {
        this.cachecellbasefile = cachecellbasefile;
    }


    /**
     * Gets the cachecellminhitflag value for this Cacheobject.
     * 
     * @return cachecellminhitflag
     */
    public java.lang.String getCachecellminhitflag() {
        return cachecellminhitflag;
    }


    /**
     * Sets the cachecellminhitflag value for this Cacheobject.
     * 
     * @param cachecellminhitflag
     */
    public void setCachecellminhitflag(java.lang.String cachecellminhitflag) {
        this.cachecellminhitflag = cachecellminhitflag;
    }


    /**
     * Gets the cachecellminhit value for this Cacheobject.
     * 
     * @return cachecellminhit
     */
    public int getCachecellminhit() {
        return cachecellminhit;
    }


    /**
     * Sets the cachecellminhit value for this Cacheobject.
     * 
     * @param cachecellminhit
     */
    public void setCachecellminhit(int cachecellminhit) {
        this.cachecellminhit = cachecellminhit;
    }


    /**
     * Gets the policy value for this Cacheobject.
     * 
     * @return policy
     */
    public int getPolicy() {
        return policy;
    }


    /**
     * Sets the policy value for this Cacheobject.
     * 
     * @param policy
     */
    public void setPolicy(int policy) {
        this.policy = policy;
    }


    /**
     * Gets the policyname value for this Cacheobject.
     * 
     * @return policyname
     */
    public java.lang.String getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Cacheobject.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the selectorname value for this Cacheobject.
     * 
     * @return selectorname
     */
    public java.lang.String[] getSelectorname() {
        return selectorname;
    }


    /**
     * Sets the selectorname value for this Cacheobject.
     * 
     * @param selectorname
     */
    public void setSelectorname(java.lang.String[] selectorname) {
        this.selectorname = selectorname;
    }


    /**
     * Gets the rule value for this Cacheobject.
     * 
     * @return rule
     */
    public java.lang.String[] getRule() {
        return rule;
    }


    /**
     * Sets the rule value for this Cacheobject.
     * 
     * @param rule
     */
    public void setRule(java.lang.String[] rule) {
        this.rule = rule;
    }


    /**
     * Gets the selectorvalue value for this Cacheobject.
     * 
     * @return selectorvalue
     */
    public java.lang.String[] getSelectorvalue() {
        return selectorvalue;
    }


    /**
     * Sets the selectorvalue value for this Cacheobject.
     * 
     * @param selectorvalue
     */
    public void setSelectorvalue(java.lang.String[] selectorvalue) {
        this.selectorvalue = selectorvalue;
    }


    /**
     * Gets the cacheurls value for this Cacheobject.
     * 
     * @return cacheurls
     */
    public java.lang.String getCacheurls() {
        return cacheurls;
    }


    /**
     * Sets the cacheurls value for this Cacheobject.
     * 
     * @param cacheurls
     */
    public void setCacheurls(java.lang.String cacheurls) {
        this.cacheurls = cacheurls;
    }


    /**
     * Gets the warnbucketskip value for this Cacheobject.
     * 
     * @return warnbucketskip
     */
    public org.apache.axis.types.UnsignedInt getWarnbucketskip() {
        return warnbucketskip;
    }


    /**
     * Sets the warnbucketskip value for this Cacheobject.
     * 
     * @param warnbucketskip
     */
    public void setWarnbucketskip(org.apache.axis.types.UnsignedInt warnbucketskip) {
        this.warnbucketskip = warnbucketskip;
    }


    /**
     * Gets the totalobjs value for this Cacheobject.
     * 
     * @return totalobjs
     */
    public org.apache.axis.types.UnsignedInt getTotalobjs() {
        return totalobjs;
    }


    /**
     * Sets the totalobjs value for this Cacheobject.
     * 
     * @param totalobjs
     */
    public void setTotalobjs(org.apache.axis.types.UnsignedInt totalobjs) {
        this.totalobjs = totalobjs;
    }


    /**
     * Gets the httpcalloutcell value for this Cacheobject.
     * 
     * @return httpcalloutcell
     */
    public java.lang.String getHttpcalloutcell() {
        return httpcalloutcell;
    }


    /**
     * Sets the httpcalloutcell value for this Cacheobject.
     * 
     * @param httpcalloutcell
     */
    public void setHttpcalloutcell(java.lang.String httpcalloutcell) {
        this.httpcalloutcell = httpcalloutcell;
    }


    /**
     * Gets the httpcalloutname value for this Cacheobject.
     * 
     * @return httpcalloutname
     */
    public java.lang.String getHttpcalloutname() {
        return httpcalloutname;
    }


    /**
     * Sets the httpcalloutname value for this Cacheobject.
     * 
     * @param httpcalloutname
     */
    public void setHttpcalloutname(java.lang.String httpcalloutname) {
        this.httpcalloutname = httpcalloutname;
    }


    /**
     * Gets the returntype value for this Cacheobject.
     * 
     * @return returntype
     */
    public java.lang.String getReturntype() {
        return returntype;
    }


    /**
     * Sets the returntype value for this Cacheobject.
     * 
     * @param returntype
     */
    public void setReturntype(java.lang.String returntype) {
        this.returntype = returntype;
    }


    /**
     * Gets the httpcalloutresult value for this Cacheobject.
     * 
     * @return httpcalloutresult
     */
    public java.lang.String getHttpcalloutresult() {
        return httpcalloutresult;
    }


    /**
     * Sets the httpcalloutresult value for this Cacheobject.
     * 
     * @param httpcalloutresult
     */
    public void setHttpcalloutresult(java.lang.String httpcalloutresult) {
        this.httpcalloutresult = httpcalloutresult;
    }


    /**
     * Gets the ceflags value for this Cacheobject.
     * 
     * @return ceflags
     */
    public org.apache.axis.types.UnsignedInt getCeflags() {
        return ceflags;
    }


    /**
     * Sets the ceflags value for this Cacheobject.
     * 
     * @param ceflags
     */
    public void setCeflags(org.apache.axis.types.UnsignedInt ceflags) {
        this.ceflags = ceflags;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cacheobject)) return false;
        Cacheobject other = (Cacheobject) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.locator==null && other.getLocator()==null) || 
             (this.locator!=null &&
              this.locator.equals(other.getLocator()))) &&
            ((this.httpstatus==null && other.getHttpstatus()==null) || 
             (this.httpstatus!=null &&
              this.httpstatus.equals(other.getHttpstatus()))) &&
            ((this.host==null && other.getHost()==null) || 
             (this.host!=null &&
              this.host.equals(other.getHost()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              this.port.equals(other.getPort()))) &&
            ((this.groupname==null && other.getGroupname()==null) || 
             (this.groupname!=null &&
              this.groupname.equals(other.getGroupname()))) &&
            ((this.httpmethod==null && other.getHttpmethod()==null) || 
             (this.httpmethod!=null &&
              this.httpmethod.equals(other.getHttpmethod()))) &&
            ((this.group==null && other.getGroup()==null) || 
             (this.group!=null &&
              this.group.equals(other.getGroup()))) &&
            ((this.ignoremarkerobjects==null && other.getIgnoremarkerobjects()==null) || 
             (this.ignoremarkerobjects!=null &&
              this.ignoremarkerobjects.equals(other.getIgnoremarkerobjects()))) &&
            ((this.includenotreadyobjects==null && other.getIncludenotreadyobjects()==null) || 
             (this.includenotreadyobjects!=null &&
              this.includenotreadyobjects.equals(other.getIncludenotreadyobjects()))) &&
            ((this.cacheressize==null && other.getCacheressize()==null) || 
             (this.cacheressize!=null &&
              this.cacheressize.equals(other.getCacheressize()))) &&
            ((this.cachereshdrsize==null && other.getCachereshdrsize()==null) || 
             (this.cachereshdrsize!=null &&
              this.cachereshdrsize.equals(other.getCachereshdrsize()))) &&
            ((this.cacheetag==null && other.getCacheetag()==null) || 
             (this.cacheetag!=null &&
              this.cacheetag.equals(other.getCacheetag()))) &&
            ((this.httpstatusoutput==null && other.getHttpstatusoutput()==null) || 
             (this.httpstatusoutput!=null &&
              this.httpstatusoutput.equals(other.getHttpstatusoutput()))) &&
            ((this.cachereslastmod==null && other.getCachereslastmod()==null) || 
             (this.cachereslastmod!=null &&
              this.cachereslastmod.equals(other.getCachereslastmod()))) &&
            ((this.cachecontrol==null && other.getCachecontrol()==null) || 
             (this.cachecontrol!=null &&
              this.cachecontrol.equals(other.getCachecontrol()))) &&
            ((this.cacheresdate==null && other.getCacheresdate()==null) || 
             (this.cacheresdate!=null &&
              this.cacheresdate.equals(other.getCacheresdate()))) &&
            ((this.contentgroup==null && other.getContentgroup()==null) || 
             (this.contentgroup!=null &&
              this.contentgroup.equals(other.getContentgroup()))) &&
            ((this.destip==null && other.getDestip()==null) || 
             (this.destip!=null &&
              this.destip.equals(other.getDestip()))) &&
            ((this.destipv46==null && other.getDestipv46()==null) || 
             (this.destipv46!=null &&
              this.destipv46.equals(other.getDestipv46()))) &&
            ((this.destport==null && other.getDestport()==null) || 
             (this.destport!=null &&
              this.destport.equals(other.getDestport()))) &&
            ((this.cachecellcomplex==null && other.getCachecellcomplex()==null) || 
             (this.cachecellcomplex!=null &&
              this.cachecellcomplex.equals(other.getCachecellcomplex()))) &&
            ((this.hitparams==null && other.getHitparams()==null) || 
             (this.hitparams!=null &&
              java.util.Arrays.equals(this.hitparams, other.getHitparams()))) &&
            ((this.hitvalues==null && other.getHitvalues()==null) || 
             (this.hitvalues!=null &&
              java.util.Arrays.equals(this.hitvalues, other.getHitvalues()))) &&
            ((this.cachecellreqtime==null && other.getCachecellreqtime()==null) || 
             (this.cachecellreqtime!=null &&
              this.cachecellreqtime.equals(other.getCachecellreqtime()))) &&
            ((this.cachecellrestime==null && other.getCachecellrestime()==null) || 
             (this.cachecellrestime!=null &&
              this.cachecellrestime.equals(other.getCachecellrestime()))) &&
            ((this.cachecurage==null && other.getCachecurage()==null) || 
             (this.cachecurage!=null &&
              this.cachecurage.equals(other.getCachecurage()))) &&
            ((this.cachecellexpires==null && other.getCachecellexpires()==null) || 
             (this.cachecellexpires!=null &&
              this.cachecellexpires.equals(other.getCachecellexpires()))) &&
            ((this.cachecellexpiresmillisec==null && other.getCachecellexpiresmillisec()==null) || 
             (this.cachecellexpiresmillisec!=null &&
              this.cachecellexpiresmillisec.equals(other.getCachecellexpiresmillisec()))) &&
            ((this.flushed==null && other.getFlushed()==null) || 
             (this.flushed!=null &&
              this.flushed.equals(other.getFlushed()))) &&
            ((this.prefetch==null && other.getPrefetch()==null) || 
             (this.prefetch!=null &&
              this.prefetch.equals(other.getPrefetch()))) &&
            ((this.prefetchperiod==null && other.getPrefetchperiod()==null) || 
             (this.prefetchperiod!=null &&
              this.prefetchperiod.equals(other.getPrefetchperiod()))) &&
            ((this.prefetchperiodmillisec==null && other.getPrefetchperiodmillisec()==null) || 
             (this.prefetchperiodmillisec!=null &&
              this.prefetchperiodmillisec.equals(other.getPrefetchperiodmillisec()))) &&
            ((this.cachecellcurreaders==null && other.getCachecellcurreaders()==null) || 
             (this.cachecellcurreaders!=null &&
              this.cachecellcurreaders.equals(other.getCachecellcurreaders()))) &&
            ((this.cachecellcurmisses==null && other.getCachecellcurmisses()==null) || 
             (this.cachecellcurmisses!=null &&
              this.cachecellcurmisses.equals(other.getCachecellcurmisses()))) &&
            ((this.cachecellhits==null && other.getCachecellhits()==null) || 
             (this.cachecellhits!=null &&
              this.cachecellhits.equals(other.getCachecellhits()))) &&
            ((this.cachecellmisses==null && other.getCachecellmisses()==null) || 
             (this.cachecellmisses!=null &&
              this.cachecellmisses.equals(other.getCachecellmisses()))) &&
            ((this.cachecelldhits==null && other.getCachecelldhits()==null) || 
             (this.cachecelldhits!=null &&
              this.cachecelldhits.equals(other.getCachecelldhits()))) &&
            ((this.cachecellgzipcompressed==null && other.getCachecellgzipcompressed()==null) || 
             (this.cachecellgzipcompressed!=null &&
              this.cachecellgzipcompressed.equals(other.getCachecellgzipcompressed()))) &&
            ((this.cachecelldeflatecompressed==null && other.getCachecelldeflatecompressed()==null) || 
             (this.cachecelldeflatecompressed!=null &&
              this.cachecelldeflatecompressed.equals(other.getCachecelldeflatecompressed()))) &&
            ((this.cachecellcompressionformat==null && other.getCachecellcompressionformat()==null) || 
             (this.cachecellcompressionformat!=null &&
              this.cachecellcompressionformat.equals(other.getCachecellcompressionformat()))) &&
            ((this.cachecellappfwmetadataexists==null && other.getCachecellappfwmetadataexists()==null) || 
             (this.cachecellappfwmetadataexists!=null &&
              this.cachecellappfwmetadataexists.equals(other.getCachecellappfwmetadataexists()))) &&
            ((this.cachecellhttp11==null && other.getCachecellhttp11()==null) || 
             (this.cachecellhttp11!=null &&
              this.cachecellhttp11.equals(other.getCachecellhttp11()))) &&
            ((this.cachecellweaketag==null && other.getCachecellweaketag()==null) || 
             (this.cachecellweaketag!=null &&
              this.cachecellweaketag.equals(other.getCachecellweaketag()))) &&
            ((this.cachecellresbadsize==null && other.getCachecellresbadsize()==null) || 
             (this.cachecellresbadsize!=null &&
              this.cachecellresbadsize.equals(other.getCachecellresbadsize()))) &&
            ((this.markerreason==null && other.getMarkerreason()==null) || 
             (this.markerreason!=null &&
              this.markerreason.equals(other.getMarkerreason()))) &&
            ((this.cachecellpolleverytime==null && other.getCachecellpolleverytime()==null) || 
             (this.cachecellpolleverytime!=null &&
              this.cachecellpolleverytime.equals(other.getCachecellpolleverytime()))) &&
            ((this.cachecelletaginserted==null && other.getCachecelletaginserted()==null) || 
             (this.cachecelletaginserted!=null &&
              this.cachecelletaginserted.equals(other.getCachecelletaginserted()))) &&
            ((this.cachecellreadywithlastbyte==null && other.getCachecellreadywithlastbyte()==null) || 
             (this.cachecellreadywithlastbyte!=null &&
              this.cachecellreadywithlastbyte.equals(other.getCachecellreadywithlastbyte()))) &&
            ((this.cacheinmemory==null && other.getCacheinmemory()==null) || 
             (this.cacheinmemory!=null &&
              this.cacheinmemory.equals(other.getCacheinmemory()))) &&
            ((this.cacheindisk==null && other.getCacheindisk()==null) || 
             (this.cacheindisk!=null &&
              this.cacheindisk.equals(other.getCacheindisk()))) &&
            ((this.cachedirname==null && other.getCachedirname()==null) || 
             (this.cachedirname!=null &&
              this.cachedirname.equals(other.getCachedirname()))) &&
            ((this.cachefilename==null && other.getCachefilename()==null) || 
             (this.cachefilename!=null &&
              this.cachefilename.equals(other.getCachefilename()))) &&
            ((this.cachecelldestipverified==null && other.getCachecelldestipverified()==null) || 
             (this.cachecelldestipverified!=null &&
              this.cachecelldestipverified.equals(other.getCachecelldestipverified()))) &&
            ((this.cachecellfwpxyobj==null && other.getCachecellfwpxyobj()==null) || 
             (this.cachecellfwpxyobj!=null &&
              this.cachecellfwpxyobj.equals(other.getCachecellfwpxyobj()))) &&
            ((this.cachecellbasefile==null && other.getCachecellbasefile()==null) || 
             (this.cachecellbasefile!=null &&
              this.cachecellbasefile.equals(other.getCachecellbasefile()))) &&
            ((this.cachecellminhitflag==null && other.getCachecellminhitflag()==null) || 
             (this.cachecellminhitflag!=null &&
              this.cachecellminhitflag.equals(other.getCachecellminhitflag()))) &&
            this.cachecellminhit == other.getCachecellminhit() &&
            this.policy == other.getPolicy() &&
            ((this.policyname==null && other.getPolicyname()==null) || 
             (this.policyname!=null &&
              this.policyname.equals(other.getPolicyname()))) &&
            ((this.selectorname==null && other.getSelectorname()==null) || 
             (this.selectorname!=null &&
              java.util.Arrays.equals(this.selectorname, other.getSelectorname()))) &&
            ((this.rule==null && other.getRule()==null) || 
             (this.rule!=null &&
              java.util.Arrays.equals(this.rule, other.getRule()))) &&
            ((this.selectorvalue==null && other.getSelectorvalue()==null) || 
             (this.selectorvalue!=null &&
              java.util.Arrays.equals(this.selectorvalue, other.getSelectorvalue()))) &&
            ((this.cacheurls==null && other.getCacheurls()==null) || 
             (this.cacheurls!=null &&
              this.cacheurls.equals(other.getCacheurls()))) &&
            ((this.warnbucketskip==null && other.getWarnbucketskip()==null) || 
             (this.warnbucketskip!=null &&
              this.warnbucketskip.equals(other.getWarnbucketskip()))) &&
            ((this.totalobjs==null && other.getTotalobjs()==null) || 
             (this.totalobjs!=null &&
              this.totalobjs.equals(other.getTotalobjs()))) &&
            ((this.httpcalloutcell==null && other.getHttpcalloutcell()==null) || 
             (this.httpcalloutcell!=null &&
              this.httpcalloutcell.equals(other.getHttpcalloutcell()))) &&
            ((this.httpcalloutname==null && other.getHttpcalloutname()==null) || 
             (this.httpcalloutname!=null &&
              this.httpcalloutname.equals(other.getHttpcalloutname()))) &&
            ((this.returntype==null && other.getReturntype()==null) || 
             (this.returntype!=null &&
              this.returntype.equals(other.getReturntype()))) &&
            ((this.httpcalloutresult==null && other.getHttpcalloutresult()==null) || 
             (this.httpcalloutresult!=null &&
              this.httpcalloutresult.equals(other.getHttpcalloutresult()))) &&
            ((this.ceflags==null && other.getCeflags()==null) || 
             (this.ceflags!=null &&
              this.ceflags.equals(other.getCeflags())));
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
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getLocator() != null) {
            _hashCode += getLocator().hashCode();
        }
        if (getHttpstatus() != null) {
            _hashCode += getHttpstatus().hashCode();
        }
        if (getHost() != null) {
            _hashCode += getHost().hashCode();
        }
        if (getPort() != null) {
            _hashCode += getPort().hashCode();
        }
        if (getGroupname() != null) {
            _hashCode += getGroupname().hashCode();
        }
        if (getHttpmethod() != null) {
            _hashCode += getHttpmethod().hashCode();
        }
        if (getGroup() != null) {
            _hashCode += getGroup().hashCode();
        }
        if (getIgnoremarkerobjects() != null) {
            _hashCode += getIgnoremarkerobjects().hashCode();
        }
        if (getIncludenotreadyobjects() != null) {
            _hashCode += getIncludenotreadyobjects().hashCode();
        }
        if (getCacheressize() != null) {
            _hashCode += getCacheressize().hashCode();
        }
        if (getCachereshdrsize() != null) {
            _hashCode += getCachereshdrsize().hashCode();
        }
        if (getCacheetag() != null) {
            _hashCode += getCacheetag().hashCode();
        }
        if (getHttpstatusoutput() != null) {
            _hashCode += getHttpstatusoutput().hashCode();
        }
        if (getCachereslastmod() != null) {
            _hashCode += getCachereslastmod().hashCode();
        }
        if (getCachecontrol() != null) {
            _hashCode += getCachecontrol().hashCode();
        }
        if (getCacheresdate() != null) {
            _hashCode += getCacheresdate().hashCode();
        }
        if (getContentgroup() != null) {
            _hashCode += getContentgroup().hashCode();
        }
        if (getDestip() != null) {
            _hashCode += getDestip().hashCode();
        }
        if (getDestipv46() != null) {
            _hashCode += getDestipv46().hashCode();
        }
        if (getDestport() != null) {
            _hashCode += getDestport().hashCode();
        }
        if (getCachecellcomplex() != null) {
            _hashCode += getCachecellcomplex().hashCode();
        }
        if (getHitparams() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHitparams());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHitparams(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHitvalues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHitvalues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHitvalues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCachecellreqtime() != null) {
            _hashCode += getCachecellreqtime().hashCode();
        }
        if (getCachecellrestime() != null) {
            _hashCode += getCachecellrestime().hashCode();
        }
        if (getCachecurage() != null) {
            _hashCode += getCachecurage().hashCode();
        }
        if (getCachecellexpires() != null) {
            _hashCode += getCachecellexpires().hashCode();
        }
        if (getCachecellexpiresmillisec() != null) {
            _hashCode += getCachecellexpiresmillisec().hashCode();
        }
        if (getFlushed() != null) {
            _hashCode += getFlushed().hashCode();
        }
        if (getPrefetch() != null) {
            _hashCode += getPrefetch().hashCode();
        }
        if (getPrefetchperiod() != null) {
            _hashCode += getPrefetchperiod().hashCode();
        }
        if (getPrefetchperiodmillisec() != null) {
            _hashCode += getPrefetchperiodmillisec().hashCode();
        }
        if (getCachecellcurreaders() != null) {
            _hashCode += getCachecellcurreaders().hashCode();
        }
        if (getCachecellcurmisses() != null) {
            _hashCode += getCachecellcurmisses().hashCode();
        }
        if (getCachecellhits() != null) {
            _hashCode += getCachecellhits().hashCode();
        }
        if (getCachecellmisses() != null) {
            _hashCode += getCachecellmisses().hashCode();
        }
        if (getCachecelldhits() != null) {
            _hashCode += getCachecelldhits().hashCode();
        }
        if (getCachecellgzipcompressed() != null) {
            _hashCode += getCachecellgzipcompressed().hashCode();
        }
        if (getCachecelldeflatecompressed() != null) {
            _hashCode += getCachecelldeflatecompressed().hashCode();
        }
        if (getCachecellcompressionformat() != null) {
            _hashCode += getCachecellcompressionformat().hashCode();
        }
        if (getCachecellappfwmetadataexists() != null) {
            _hashCode += getCachecellappfwmetadataexists().hashCode();
        }
        if (getCachecellhttp11() != null) {
            _hashCode += getCachecellhttp11().hashCode();
        }
        if (getCachecellweaketag() != null) {
            _hashCode += getCachecellweaketag().hashCode();
        }
        if (getCachecellresbadsize() != null) {
            _hashCode += getCachecellresbadsize().hashCode();
        }
        if (getMarkerreason() != null) {
            _hashCode += getMarkerreason().hashCode();
        }
        if (getCachecellpolleverytime() != null) {
            _hashCode += getCachecellpolleverytime().hashCode();
        }
        if (getCachecelletaginserted() != null) {
            _hashCode += getCachecelletaginserted().hashCode();
        }
        if (getCachecellreadywithlastbyte() != null) {
            _hashCode += getCachecellreadywithlastbyte().hashCode();
        }
        if (getCacheinmemory() != null) {
            _hashCode += getCacheinmemory().hashCode();
        }
        if (getCacheindisk() != null) {
            _hashCode += getCacheindisk().hashCode();
        }
        if (getCachedirname() != null) {
            _hashCode += getCachedirname().hashCode();
        }
        if (getCachefilename() != null) {
            _hashCode += getCachefilename().hashCode();
        }
        if (getCachecelldestipverified() != null) {
            _hashCode += getCachecelldestipverified().hashCode();
        }
        if (getCachecellfwpxyobj() != null) {
            _hashCode += getCachecellfwpxyobj().hashCode();
        }
        if (getCachecellbasefile() != null) {
            _hashCode += getCachecellbasefile().hashCode();
        }
        if (getCachecellminhitflag() != null) {
            _hashCode += getCachecellminhitflag().hashCode();
        }
        _hashCode += getCachecellminhit();
        _hashCode += getPolicy();
        if (getPolicyname() != null) {
            _hashCode += getPolicyname().hashCode();
        }
        if (getSelectorname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSelectorname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSelectorname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRule() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRule());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRule(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSelectorvalue() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSelectorvalue());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSelectorvalue(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCacheurls() != null) {
            _hashCode += getCacheurls().hashCode();
        }
        if (getWarnbucketskip() != null) {
            _hashCode += getWarnbucketskip().hashCode();
        }
        if (getTotalobjs() != null) {
            _hashCode += getTotalobjs().hashCode();
        }
        if (getHttpcalloutcell() != null) {
            _hashCode += getHttpcalloutcell().hashCode();
        }
        if (getHttpcalloutname() != null) {
            _hashCode += getHttpcalloutname().hashCode();
        }
        if (getReturntype() != null) {
            _hashCode += getReturntype().hashCode();
        }
        if (getHttpcalloutresult() != null) {
            _hashCode += getHttpcalloutresult().hashCode();
        }
        if (getCeflags() != null) {
            _hashCode += getCeflags().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cacheobject.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "cacheobject"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpstatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpstatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("host");
        elemField.setXmlName(new javax.xml.namespace.QName("", "host"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port");
        elemField.setXmlName(new javax.xml.namespace.QName("", "port"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "groupname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpmethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpmethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new javax.xml.namespace.QName("", "group"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ignoremarkerobjects");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ignoremarkerobjects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includenotreadyobjects");
        elemField.setXmlName(new javax.xml.namespace.QName("", "includenotreadyobjects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheressize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cacheressize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachereshdrsize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachereshdrsize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheetag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cacheetag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpstatusoutput");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpstatusoutput"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachereslastmod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachereslastmod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecontrol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecontrol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheresdate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cacheresdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentgroup");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contentgroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destipv46");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destipv46"));
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
        elemField.setFieldName("cachecellcomplex");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecellcomplex"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hitparams");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hitparams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hitvalues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hitvalues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecellreqtime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecellreqtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecellrestime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecellrestime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecurage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecurage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecellexpires");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecellexpires"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecellexpiresmillisec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecellexpiresmillisec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flushed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flushed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefetch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefetch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefetchperiod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefetchperiod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefetchperiodmillisec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefetchperiodmillisec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecellcurreaders");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecellcurreaders"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecellcurmisses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecellcurmisses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecellhits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecellhits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecellmisses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecellmisses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecelldhits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecelldhits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecellgzipcompressed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecellgzipcompressed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecelldeflatecompressed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecelldeflatecompressed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecellcompressionformat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecellcompressionformat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecellappfwmetadataexists");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecellappfwmetadataexists"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecellhttp11");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecellhttp11"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecellweaketag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecellweaketag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecellresbadsize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecellresbadsize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markerreason");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markerreason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecellpolleverytime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecellpolleverytime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecelletaginserted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecelletaginserted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecellreadywithlastbyte");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecellreadywithlastbyte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheinmemory");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cacheinmemory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheindisk");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cacheindisk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachedirname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachedirname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachefilename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachefilename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecelldestipverified");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecelldestipverified"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecellfwpxyobj");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecellfwpxyobj"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecellbasefile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecellbasefile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecellminhitflag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecellminhitflag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecellminhit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecellminhit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectorname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selectorname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectorvalue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "selectorvalue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cacheurls");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cacheurls"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("warnbucketskip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "warnbucketskip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalobjs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalobjs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpcalloutcell");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpcalloutcell"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpcalloutname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpcalloutname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returntype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "returntype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("httpcalloutresult");
        elemField.setXmlName(new javax.xml.namespace.QName("", "httpcalloutresult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ceflags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ceflags"));
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
