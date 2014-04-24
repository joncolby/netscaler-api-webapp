/**
 * Cachecontentgroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Cachecontentgroup  implements java.io.Serializable {
    private java.lang.String name;

    private org.apache.axis.types.UnsignedInt flags;

    private java.lang.String type;

    private org.apache.axis.types.UnsignedInt relexpiry;

    private org.apache.axis.types.UnsignedInt relexpirymillisec;

    private java.lang.String[] absexpiry;

    private java.lang.String[] absexpirygmt;

    private org.apache.axis.types.UnsignedInt heurexpiryparam;

    private org.apache.axis.types.UnsignedInt weakposrelexpiry;

    private org.apache.axis.types.UnsignedInt weaknegrelexpiry;

    private java.lang.String[] hitparams;

    private java.lang.String[] invalparams;

    private java.lang.String ignoreparamvaluecase;

    private java.lang.String matchcookies;

    private java.lang.String invalrestrictedtohost;

    private java.lang.String polleverytime;

    private java.lang.String ignorereloadreq;

    private java.lang.String removecookies;

    private java.lang.String prefetch;

    private org.apache.axis.types.UnsignedInt prefetchperiod;

    private org.apache.axis.types.UnsignedInt prefetchperiodmillisec;

    private org.apache.axis.types.UnsignedInt prefetchcur;

    private org.apache.axis.types.UnsignedInt prefetchmaxpending;

    private java.lang.String flashcache;

    private java.lang.String expireatlastbyte;

    private java.lang.String insertvia;

    private java.lang.String insertage;

    private java.lang.String insertetag;

    private java.lang.String cachecontrol;

    private org.apache.axis.types.UnsignedInt quickabortsize;

    private org.apache.axis.types.UnsignedInt minressize;

    private org.apache.axis.types.UnsignedInt maxressize;

    private org.apache.axis.types.UnsignedLong memusage;

    private org.apache.axis.types.UnsignedInt memlimit;

    private java.lang.String ignorereqcachinghdrs;

    private org.apache.axis.types.UnsignedLong cachenon304Hits;

    private org.apache.axis.types.UnsignedLong cache304Hits;

    private org.apache.axis.types.UnsignedInt cachecells;

    private org.apache.axis.types.UnsignedInt cachegroupincarnation;

    private int minhits;

    private java.lang.String alwaysevalpolicies;

    private java.lang.String persist;

    private java.lang.String pinned;

    private java.lang.String lazydnsresolve;

    private java.lang.String hitselector;

    private java.lang.String invalselector;

    private java.lang.String[] policyname;

    private org.apache.axis.types.UnsignedInt cachenuminvalpolicy;

    private org.apache.axis.types.UnsignedInt markercells;

    private java.lang.String builtin;

    public Cachecontentgroup() {
    }

    public Cachecontentgroup(
           java.lang.String name,
           org.apache.axis.types.UnsignedInt flags,
           java.lang.String type,
           org.apache.axis.types.UnsignedInt relexpiry,
           org.apache.axis.types.UnsignedInt relexpirymillisec,
           java.lang.String[] absexpiry,
           java.lang.String[] absexpirygmt,
           org.apache.axis.types.UnsignedInt heurexpiryparam,
           org.apache.axis.types.UnsignedInt weakposrelexpiry,
           org.apache.axis.types.UnsignedInt weaknegrelexpiry,
           java.lang.String[] hitparams,
           java.lang.String[] invalparams,
           java.lang.String ignoreparamvaluecase,
           java.lang.String matchcookies,
           java.lang.String invalrestrictedtohost,
           java.lang.String polleverytime,
           java.lang.String ignorereloadreq,
           java.lang.String removecookies,
           java.lang.String prefetch,
           org.apache.axis.types.UnsignedInt prefetchperiod,
           org.apache.axis.types.UnsignedInt prefetchperiodmillisec,
           org.apache.axis.types.UnsignedInt prefetchcur,
           org.apache.axis.types.UnsignedInt prefetchmaxpending,
           java.lang.String flashcache,
           java.lang.String expireatlastbyte,
           java.lang.String insertvia,
           java.lang.String insertage,
           java.lang.String insertetag,
           java.lang.String cachecontrol,
           org.apache.axis.types.UnsignedInt quickabortsize,
           org.apache.axis.types.UnsignedInt minressize,
           org.apache.axis.types.UnsignedInt maxressize,
           org.apache.axis.types.UnsignedLong memusage,
           org.apache.axis.types.UnsignedInt memlimit,
           java.lang.String ignorereqcachinghdrs,
           org.apache.axis.types.UnsignedLong cachenon304Hits,
           org.apache.axis.types.UnsignedLong cache304Hits,
           org.apache.axis.types.UnsignedInt cachecells,
           org.apache.axis.types.UnsignedInt cachegroupincarnation,
           int minhits,
           java.lang.String alwaysevalpolicies,
           java.lang.String persist,
           java.lang.String pinned,
           java.lang.String lazydnsresolve,
           java.lang.String hitselector,
           java.lang.String invalselector,
           java.lang.String[] policyname,
           org.apache.axis.types.UnsignedInt cachenuminvalpolicy,
           org.apache.axis.types.UnsignedInt markercells,
           java.lang.String builtin) {
           this.name = name;
           this.flags = flags;
           this.type = type;
           this.relexpiry = relexpiry;
           this.relexpirymillisec = relexpirymillisec;
           this.absexpiry = absexpiry;
           this.absexpirygmt = absexpirygmt;
           this.heurexpiryparam = heurexpiryparam;
           this.weakposrelexpiry = weakposrelexpiry;
           this.weaknegrelexpiry = weaknegrelexpiry;
           this.hitparams = hitparams;
           this.invalparams = invalparams;
           this.ignoreparamvaluecase = ignoreparamvaluecase;
           this.matchcookies = matchcookies;
           this.invalrestrictedtohost = invalrestrictedtohost;
           this.polleverytime = polleverytime;
           this.ignorereloadreq = ignorereloadreq;
           this.removecookies = removecookies;
           this.prefetch = prefetch;
           this.prefetchperiod = prefetchperiod;
           this.prefetchperiodmillisec = prefetchperiodmillisec;
           this.prefetchcur = prefetchcur;
           this.prefetchmaxpending = prefetchmaxpending;
           this.flashcache = flashcache;
           this.expireatlastbyte = expireatlastbyte;
           this.insertvia = insertvia;
           this.insertage = insertage;
           this.insertetag = insertetag;
           this.cachecontrol = cachecontrol;
           this.quickabortsize = quickabortsize;
           this.minressize = minressize;
           this.maxressize = maxressize;
           this.memusage = memusage;
           this.memlimit = memlimit;
           this.ignorereqcachinghdrs = ignorereqcachinghdrs;
           this.cachenon304Hits = cachenon304Hits;
           this.cache304Hits = cache304Hits;
           this.cachecells = cachecells;
           this.cachegroupincarnation = cachegroupincarnation;
           this.minhits = minhits;
           this.alwaysevalpolicies = alwaysevalpolicies;
           this.persist = persist;
           this.pinned = pinned;
           this.lazydnsresolve = lazydnsresolve;
           this.hitselector = hitselector;
           this.invalselector = invalselector;
           this.policyname = policyname;
           this.cachenuminvalpolicy = cachenuminvalpolicy;
           this.markercells = markercells;
           this.builtin = builtin;
    }


    /**
     * Gets the name value for this Cachecontentgroup.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Cachecontentgroup.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the flags value for this Cachecontentgroup.
     * 
     * @return flags
     */
    public org.apache.axis.types.UnsignedInt getFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this Cachecontentgroup.
     * 
     * @param flags
     */
    public void setFlags(org.apache.axis.types.UnsignedInt flags) {
        this.flags = flags;
    }


    /**
     * Gets the type value for this Cachecontentgroup.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Cachecontentgroup.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the relexpiry value for this Cachecontentgroup.
     * 
     * @return relexpiry
     */
    public org.apache.axis.types.UnsignedInt getRelexpiry() {
        return relexpiry;
    }


    /**
     * Sets the relexpiry value for this Cachecontentgroup.
     * 
     * @param relexpiry
     */
    public void setRelexpiry(org.apache.axis.types.UnsignedInt relexpiry) {
        this.relexpiry = relexpiry;
    }


    /**
     * Gets the relexpirymillisec value for this Cachecontentgroup.
     * 
     * @return relexpirymillisec
     */
    public org.apache.axis.types.UnsignedInt getRelexpirymillisec() {
        return relexpirymillisec;
    }


    /**
     * Sets the relexpirymillisec value for this Cachecontentgroup.
     * 
     * @param relexpirymillisec
     */
    public void setRelexpirymillisec(org.apache.axis.types.UnsignedInt relexpirymillisec) {
        this.relexpirymillisec = relexpirymillisec;
    }


    /**
     * Gets the absexpiry value for this Cachecontentgroup.
     * 
     * @return absexpiry
     */
    public java.lang.String[] getAbsexpiry() {
        return absexpiry;
    }


    /**
     * Sets the absexpiry value for this Cachecontentgroup.
     * 
     * @param absexpiry
     */
    public void setAbsexpiry(java.lang.String[] absexpiry) {
        this.absexpiry = absexpiry;
    }


    /**
     * Gets the absexpirygmt value for this Cachecontentgroup.
     * 
     * @return absexpirygmt
     */
    public java.lang.String[] getAbsexpirygmt() {
        return absexpirygmt;
    }


    /**
     * Sets the absexpirygmt value for this Cachecontentgroup.
     * 
     * @param absexpirygmt
     */
    public void setAbsexpirygmt(java.lang.String[] absexpirygmt) {
        this.absexpirygmt = absexpirygmt;
    }


    /**
     * Gets the heurexpiryparam value for this Cachecontentgroup.
     * 
     * @return heurexpiryparam
     */
    public org.apache.axis.types.UnsignedInt getHeurexpiryparam() {
        return heurexpiryparam;
    }


    /**
     * Sets the heurexpiryparam value for this Cachecontentgroup.
     * 
     * @param heurexpiryparam
     */
    public void setHeurexpiryparam(org.apache.axis.types.UnsignedInt heurexpiryparam) {
        this.heurexpiryparam = heurexpiryparam;
    }


    /**
     * Gets the weakposrelexpiry value for this Cachecontentgroup.
     * 
     * @return weakposrelexpiry
     */
    public org.apache.axis.types.UnsignedInt getWeakposrelexpiry() {
        return weakposrelexpiry;
    }


    /**
     * Sets the weakposrelexpiry value for this Cachecontentgroup.
     * 
     * @param weakposrelexpiry
     */
    public void setWeakposrelexpiry(org.apache.axis.types.UnsignedInt weakposrelexpiry) {
        this.weakposrelexpiry = weakposrelexpiry;
    }


    /**
     * Gets the weaknegrelexpiry value for this Cachecontentgroup.
     * 
     * @return weaknegrelexpiry
     */
    public org.apache.axis.types.UnsignedInt getWeaknegrelexpiry() {
        return weaknegrelexpiry;
    }


    /**
     * Sets the weaknegrelexpiry value for this Cachecontentgroup.
     * 
     * @param weaknegrelexpiry
     */
    public void setWeaknegrelexpiry(org.apache.axis.types.UnsignedInt weaknegrelexpiry) {
        this.weaknegrelexpiry = weaknegrelexpiry;
    }


    /**
     * Gets the hitparams value for this Cachecontentgroup.
     * 
     * @return hitparams
     */
    public java.lang.String[] getHitparams() {
        return hitparams;
    }


    /**
     * Sets the hitparams value for this Cachecontentgroup.
     * 
     * @param hitparams
     */
    public void setHitparams(java.lang.String[] hitparams) {
        this.hitparams = hitparams;
    }


    /**
     * Gets the invalparams value for this Cachecontentgroup.
     * 
     * @return invalparams
     */
    public java.lang.String[] getInvalparams() {
        return invalparams;
    }


    /**
     * Sets the invalparams value for this Cachecontentgroup.
     * 
     * @param invalparams
     */
    public void setInvalparams(java.lang.String[] invalparams) {
        this.invalparams = invalparams;
    }


    /**
     * Gets the ignoreparamvaluecase value for this Cachecontentgroup.
     * 
     * @return ignoreparamvaluecase
     */
    public java.lang.String getIgnoreparamvaluecase() {
        return ignoreparamvaluecase;
    }


    /**
     * Sets the ignoreparamvaluecase value for this Cachecontentgroup.
     * 
     * @param ignoreparamvaluecase
     */
    public void setIgnoreparamvaluecase(java.lang.String ignoreparamvaluecase) {
        this.ignoreparamvaluecase = ignoreparamvaluecase;
    }


    /**
     * Gets the matchcookies value for this Cachecontentgroup.
     * 
     * @return matchcookies
     */
    public java.lang.String getMatchcookies() {
        return matchcookies;
    }


    /**
     * Sets the matchcookies value for this Cachecontentgroup.
     * 
     * @param matchcookies
     */
    public void setMatchcookies(java.lang.String matchcookies) {
        this.matchcookies = matchcookies;
    }


    /**
     * Gets the invalrestrictedtohost value for this Cachecontentgroup.
     * 
     * @return invalrestrictedtohost
     */
    public java.lang.String getInvalrestrictedtohost() {
        return invalrestrictedtohost;
    }


    /**
     * Sets the invalrestrictedtohost value for this Cachecontentgroup.
     * 
     * @param invalrestrictedtohost
     */
    public void setInvalrestrictedtohost(java.lang.String invalrestrictedtohost) {
        this.invalrestrictedtohost = invalrestrictedtohost;
    }


    /**
     * Gets the polleverytime value for this Cachecontentgroup.
     * 
     * @return polleverytime
     */
    public java.lang.String getPolleverytime() {
        return polleverytime;
    }


    /**
     * Sets the polleverytime value for this Cachecontentgroup.
     * 
     * @param polleverytime
     */
    public void setPolleverytime(java.lang.String polleverytime) {
        this.polleverytime = polleverytime;
    }


    /**
     * Gets the ignorereloadreq value for this Cachecontentgroup.
     * 
     * @return ignorereloadreq
     */
    public java.lang.String getIgnorereloadreq() {
        return ignorereloadreq;
    }


    /**
     * Sets the ignorereloadreq value for this Cachecontentgroup.
     * 
     * @param ignorereloadreq
     */
    public void setIgnorereloadreq(java.lang.String ignorereloadreq) {
        this.ignorereloadreq = ignorereloadreq;
    }


    /**
     * Gets the removecookies value for this Cachecontentgroup.
     * 
     * @return removecookies
     */
    public java.lang.String getRemovecookies() {
        return removecookies;
    }


    /**
     * Sets the removecookies value for this Cachecontentgroup.
     * 
     * @param removecookies
     */
    public void setRemovecookies(java.lang.String removecookies) {
        this.removecookies = removecookies;
    }


    /**
     * Gets the prefetch value for this Cachecontentgroup.
     * 
     * @return prefetch
     */
    public java.lang.String getPrefetch() {
        return prefetch;
    }


    /**
     * Sets the prefetch value for this Cachecontentgroup.
     * 
     * @param prefetch
     */
    public void setPrefetch(java.lang.String prefetch) {
        this.prefetch = prefetch;
    }


    /**
     * Gets the prefetchperiod value for this Cachecontentgroup.
     * 
     * @return prefetchperiod
     */
    public org.apache.axis.types.UnsignedInt getPrefetchperiod() {
        return prefetchperiod;
    }


    /**
     * Sets the prefetchperiod value for this Cachecontentgroup.
     * 
     * @param prefetchperiod
     */
    public void setPrefetchperiod(org.apache.axis.types.UnsignedInt prefetchperiod) {
        this.prefetchperiod = prefetchperiod;
    }


    /**
     * Gets the prefetchperiodmillisec value for this Cachecontentgroup.
     * 
     * @return prefetchperiodmillisec
     */
    public org.apache.axis.types.UnsignedInt getPrefetchperiodmillisec() {
        return prefetchperiodmillisec;
    }


    /**
     * Sets the prefetchperiodmillisec value for this Cachecontentgroup.
     * 
     * @param prefetchperiodmillisec
     */
    public void setPrefetchperiodmillisec(org.apache.axis.types.UnsignedInt prefetchperiodmillisec) {
        this.prefetchperiodmillisec = prefetchperiodmillisec;
    }


    /**
     * Gets the prefetchcur value for this Cachecontentgroup.
     * 
     * @return prefetchcur
     */
    public org.apache.axis.types.UnsignedInt getPrefetchcur() {
        return prefetchcur;
    }


    /**
     * Sets the prefetchcur value for this Cachecontentgroup.
     * 
     * @param prefetchcur
     */
    public void setPrefetchcur(org.apache.axis.types.UnsignedInt prefetchcur) {
        this.prefetchcur = prefetchcur;
    }


    /**
     * Gets the prefetchmaxpending value for this Cachecontentgroup.
     * 
     * @return prefetchmaxpending
     */
    public org.apache.axis.types.UnsignedInt getPrefetchmaxpending() {
        return prefetchmaxpending;
    }


    /**
     * Sets the prefetchmaxpending value for this Cachecontentgroup.
     * 
     * @param prefetchmaxpending
     */
    public void setPrefetchmaxpending(org.apache.axis.types.UnsignedInt prefetchmaxpending) {
        this.prefetchmaxpending = prefetchmaxpending;
    }


    /**
     * Gets the flashcache value for this Cachecontentgroup.
     * 
     * @return flashcache
     */
    public java.lang.String getFlashcache() {
        return flashcache;
    }


    /**
     * Sets the flashcache value for this Cachecontentgroup.
     * 
     * @param flashcache
     */
    public void setFlashcache(java.lang.String flashcache) {
        this.flashcache = flashcache;
    }


    /**
     * Gets the expireatlastbyte value for this Cachecontentgroup.
     * 
     * @return expireatlastbyte
     */
    public java.lang.String getExpireatlastbyte() {
        return expireatlastbyte;
    }


    /**
     * Sets the expireatlastbyte value for this Cachecontentgroup.
     * 
     * @param expireatlastbyte
     */
    public void setExpireatlastbyte(java.lang.String expireatlastbyte) {
        this.expireatlastbyte = expireatlastbyte;
    }


    /**
     * Gets the insertvia value for this Cachecontentgroup.
     * 
     * @return insertvia
     */
    public java.lang.String getInsertvia() {
        return insertvia;
    }


    /**
     * Sets the insertvia value for this Cachecontentgroup.
     * 
     * @param insertvia
     */
    public void setInsertvia(java.lang.String insertvia) {
        this.insertvia = insertvia;
    }


    /**
     * Gets the insertage value for this Cachecontentgroup.
     * 
     * @return insertage
     */
    public java.lang.String getInsertage() {
        return insertage;
    }


    /**
     * Sets the insertage value for this Cachecontentgroup.
     * 
     * @param insertage
     */
    public void setInsertage(java.lang.String insertage) {
        this.insertage = insertage;
    }


    /**
     * Gets the insertetag value for this Cachecontentgroup.
     * 
     * @return insertetag
     */
    public java.lang.String getInsertetag() {
        return insertetag;
    }


    /**
     * Sets the insertetag value for this Cachecontentgroup.
     * 
     * @param insertetag
     */
    public void setInsertetag(java.lang.String insertetag) {
        this.insertetag = insertetag;
    }


    /**
     * Gets the cachecontrol value for this Cachecontentgroup.
     * 
     * @return cachecontrol
     */
    public java.lang.String getCachecontrol() {
        return cachecontrol;
    }


    /**
     * Sets the cachecontrol value for this Cachecontentgroup.
     * 
     * @param cachecontrol
     */
    public void setCachecontrol(java.lang.String cachecontrol) {
        this.cachecontrol = cachecontrol;
    }


    /**
     * Gets the quickabortsize value for this Cachecontentgroup.
     * 
     * @return quickabortsize
     */
    public org.apache.axis.types.UnsignedInt getQuickabortsize() {
        return quickabortsize;
    }


    /**
     * Sets the quickabortsize value for this Cachecontentgroup.
     * 
     * @param quickabortsize
     */
    public void setQuickabortsize(org.apache.axis.types.UnsignedInt quickabortsize) {
        this.quickabortsize = quickabortsize;
    }


    /**
     * Gets the minressize value for this Cachecontentgroup.
     * 
     * @return minressize
     */
    public org.apache.axis.types.UnsignedInt getMinressize() {
        return minressize;
    }


    /**
     * Sets the minressize value for this Cachecontentgroup.
     * 
     * @param minressize
     */
    public void setMinressize(org.apache.axis.types.UnsignedInt minressize) {
        this.minressize = minressize;
    }


    /**
     * Gets the maxressize value for this Cachecontentgroup.
     * 
     * @return maxressize
     */
    public org.apache.axis.types.UnsignedInt getMaxressize() {
        return maxressize;
    }


    /**
     * Sets the maxressize value for this Cachecontentgroup.
     * 
     * @param maxressize
     */
    public void setMaxressize(org.apache.axis.types.UnsignedInt maxressize) {
        this.maxressize = maxressize;
    }


    /**
     * Gets the memusage value for this Cachecontentgroup.
     * 
     * @return memusage
     */
    public org.apache.axis.types.UnsignedLong getMemusage() {
        return memusage;
    }


    /**
     * Sets the memusage value for this Cachecontentgroup.
     * 
     * @param memusage
     */
    public void setMemusage(org.apache.axis.types.UnsignedLong memusage) {
        this.memusage = memusage;
    }


    /**
     * Gets the memlimit value for this Cachecontentgroup.
     * 
     * @return memlimit
     */
    public org.apache.axis.types.UnsignedInt getMemlimit() {
        return memlimit;
    }


    /**
     * Sets the memlimit value for this Cachecontentgroup.
     * 
     * @param memlimit
     */
    public void setMemlimit(org.apache.axis.types.UnsignedInt memlimit) {
        this.memlimit = memlimit;
    }


    /**
     * Gets the ignorereqcachinghdrs value for this Cachecontentgroup.
     * 
     * @return ignorereqcachinghdrs
     */
    public java.lang.String getIgnorereqcachinghdrs() {
        return ignorereqcachinghdrs;
    }


    /**
     * Sets the ignorereqcachinghdrs value for this Cachecontentgroup.
     * 
     * @param ignorereqcachinghdrs
     */
    public void setIgnorereqcachinghdrs(java.lang.String ignorereqcachinghdrs) {
        this.ignorereqcachinghdrs = ignorereqcachinghdrs;
    }


    /**
     * Gets the cachenon304Hits value for this Cachecontentgroup.
     * 
     * @return cachenon304Hits
     */
    public org.apache.axis.types.UnsignedLong getCachenon304Hits() {
        return cachenon304Hits;
    }


    /**
     * Sets the cachenon304Hits value for this Cachecontentgroup.
     * 
     * @param cachenon304Hits
     */
    public void setCachenon304Hits(org.apache.axis.types.UnsignedLong cachenon304Hits) {
        this.cachenon304Hits = cachenon304Hits;
    }


    /**
     * Gets the cache304Hits value for this Cachecontentgroup.
     * 
     * @return cache304Hits
     */
    public org.apache.axis.types.UnsignedLong getCache304Hits() {
        return cache304Hits;
    }


    /**
     * Sets the cache304Hits value for this Cachecontentgroup.
     * 
     * @param cache304Hits
     */
    public void setCache304Hits(org.apache.axis.types.UnsignedLong cache304Hits) {
        this.cache304Hits = cache304Hits;
    }


    /**
     * Gets the cachecells value for this Cachecontentgroup.
     * 
     * @return cachecells
     */
    public org.apache.axis.types.UnsignedInt getCachecells() {
        return cachecells;
    }


    /**
     * Sets the cachecells value for this Cachecontentgroup.
     * 
     * @param cachecells
     */
    public void setCachecells(org.apache.axis.types.UnsignedInt cachecells) {
        this.cachecells = cachecells;
    }


    /**
     * Gets the cachegroupincarnation value for this Cachecontentgroup.
     * 
     * @return cachegroupincarnation
     */
    public org.apache.axis.types.UnsignedInt getCachegroupincarnation() {
        return cachegroupincarnation;
    }


    /**
     * Sets the cachegroupincarnation value for this Cachecontentgroup.
     * 
     * @param cachegroupincarnation
     */
    public void setCachegroupincarnation(org.apache.axis.types.UnsignedInt cachegroupincarnation) {
        this.cachegroupincarnation = cachegroupincarnation;
    }


    /**
     * Gets the minhits value for this Cachecontentgroup.
     * 
     * @return minhits
     */
    public int getMinhits() {
        return minhits;
    }


    /**
     * Sets the minhits value for this Cachecontentgroup.
     * 
     * @param minhits
     */
    public void setMinhits(int minhits) {
        this.minhits = minhits;
    }


    /**
     * Gets the alwaysevalpolicies value for this Cachecontentgroup.
     * 
     * @return alwaysevalpolicies
     */
    public java.lang.String getAlwaysevalpolicies() {
        return alwaysevalpolicies;
    }


    /**
     * Sets the alwaysevalpolicies value for this Cachecontentgroup.
     * 
     * @param alwaysevalpolicies
     */
    public void setAlwaysevalpolicies(java.lang.String alwaysevalpolicies) {
        this.alwaysevalpolicies = alwaysevalpolicies;
    }


    /**
     * Gets the persist value for this Cachecontentgroup.
     * 
     * @return persist
     */
    public java.lang.String getPersist() {
        return persist;
    }


    /**
     * Sets the persist value for this Cachecontentgroup.
     * 
     * @param persist
     */
    public void setPersist(java.lang.String persist) {
        this.persist = persist;
    }


    /**
     * Gets the pinned value for this Cachecontentgroup.
     * 
     * @return pinned
     */
    public java.lang.String getPinned() {
        return pinned;
    }


    /**
     * Sets the pinned value for this Cachecontentgroup.
     * 
     * @param pinned
     */
    public void setPinned(java.lang.String pinned) {
        this.pinned = pinned;
    }


    /**
     * Gets the lazydnsresolve value for this Cachecontentgroup.
     * 
     * @return lazydnsresolve
     */
    public java.lang.String getLazydnsresolve() {
        return lazydnsresolve;
    }


    /**
     * Sets the lazydnsresolve value for this Cachecontentgroup.
     * 
     * @param lazydnsresolve
     */
    public void setLazydnsresolve(java.lang.String lazydnsresolve) {
        this.lazydnsresolve = lazydnsresolve;
    }


    /**
     * Gets the hitselector value for this Cachecontentgroup.
     * 
     * @return hitselector
     */
    public java.lang.String getHitselector() {
        return hitselector;
    }


    /**
     * Sets the hitselector value for this Cachecontentgroup.
     * 
     * @param hitselector
     */
    public void setHitselector(java.lang.String hitselector) {
        this.hitselector = hitselector;
    }


    /**
     * Gets the invalselector value for this Cachecontentgroup.
     * 
     * @return invalselector
     */
    public java.lang.String getInvalselector() {
        return invalselector;
    }


    /**
     * Sets the invalselector value for this Cachecontentgroup.
     * 
     * @param invalselector
     */
    public void setInvalselector(java.lang.String invalselector) {
        this.invalselector = invalselector;
    }


    /**
     * Gets the policyname value for this Cachecontentgroup.
     * 
     * @return policyname
     */
    public java.lang.String[] getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Cachecontentgroup.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String[] policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the cachenuminvalpolicy value for this Cachecontentgroup.
     * 
     * @return cachenuminvalpolicy
     */
    public org.apache.axis.types.UnsignedInt getCachenuminvalpolicy() {
        return cachenuminvalpolicy;
    }


    /**
     * Sets the cachenuminvalpolicy value for this Cachecontentgroup.
     * 
     * @param cachenuminvalpolicy
     */
    public void setCachenuminvalpolicy(org.apache.axis.types.UnsignedInt cachenuminvalpolicy) {
        this.cachenuminvalpolicy = cachenuminvalpolicy;
    }


    /**
     * Gets the markercells value for this Cachecontentgroup.
     * 
     * @return markercells
     */
    public org.apache.axis.types.UnsignedInt getMarkercells() {
        return markercells;
    }


    /**
     * Sets the markercells value for this Cachecontentgroup.
     * 
     * @param markercells
     */
    public void setMarkercells(org.apache.axis.types.UnsignedInt markercells) {
        this.markercells = markercells;
    }


    /**
     * Gets the builtin value for this Cachecontentgroup.
     * 
     * @return builtin
     */
    public java.lang.String getBuiltin() {
        return builtin;
    }


    /**
     * Sets the builtin value for this Cachecontentgroup.
     * 
     * @param builtin
     */
    public void setBuiltin(java.lang.String builtin) {
        this.builtin = builtin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Cachecontentgroup)) return false;
        Cachecontentgroup other = (Cachecontentgroup) obj;
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
            ((this.flags==null && other.getFlags()==null) || 
             (this.flags!=null &&
              this.flags.equals(other.getFlags()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.relexpiry==null && other.getRelexpiry()==null) || 
             (this.relexpiry!=null &&
              this.relexpiry.equals(other.getRelexpiry()))) &&
            ((this.relexpirymillisec==null && other.getRelexpirymillisec()==null) || 
             (this.relexpirymillisec!=null &&
              this.relexpirymillisec.equals(other.getRelexpirymillisec()))) &&
            ((this.absexpiry==null && other.getAbsexpiry()==null) || 
             (this.absexpiry!=null &&
              java.util.Arrays.equals(this.absexpiry, other.getAbsexpiry()))) &&
            ((this.absexpirygmt==null && other.getAbsexpirygmt()==null) || 
             (this.absexpirygmt!=null &&
              java.util.Arrays.equals(this.absexpirygmt, other.getAbsexpirygmt()))) &&
            ((this.heurexpiryparam==null && other.getHeurexpiryparam()==null) || 
             (this.heurexpiryparam!=null &&
              this.heurexpiryparam.equals(other.getHeurexpiryparam()))) &&
            ((this.weakposrelexpiry==null && other.getWeakposrelexpiry()==null) || 
             (this.weakposrelexpiry!=null &&
              this.weakposrelexpiry.equals(other.getWeakposrelexpiry()))) &&
            ((this.weaknegrelexpiry==null && other.getWeaknegrelexpiry()==null) || 
             (this.weaknegrelexpiry!=null &&
              this.weaknegrelexpiry.equals(other.getWeaknegrelexpiry()))) &&
            ((this.hitparams==null && other.getHitparams()==null) || 
             (this.hitparams!=null &&
              java.util.Arrays.equals(this.hitparams, other.getHitparams()))) &&
            ((this.invalparams==null && other.getInvalparams()==null) || 
             (this.invalparams!=null &&
              java.util.Arrays.equals(this.invalparams, other.getInvalparams()))) &&
            ((this.ignoreparamvaluecase==null && other.getIgnoreparamvaluecase()==null) || 
             (this.ignoreparamvaluecase!=null &&
              this.ignoreparamvaluecase.equals(other.getIgnoreparamvaluecase()))) &&
            ((this.matchcookies==null && other.getMatchcookies()==null) || 
             (this.matchcookies!=null &&
              this.matchcookies.equals(other.getMatchcookies()))) &&
            ((this.invalrestrictedtohost==null && other.getInvalrestrictedtohost()==null) || 
             (this.invalrestrictedtohost!=null &&
              this.invalrestrictedtohost.equals(other.getInvalrestrictedtohost()))) &&
            ((this.polleverytime==null && other.getPolleverytime()==null) || 
             (this.polleverytime!=null &&
              this.polleverytime.equals(other.getPolleverytime()))) &&
            ((this.ignorereloadreq==null && other.getIgnorereloadreq()==null) || 
             (this.ignorereloadreq!=null &&
              this.ignorereloadreq.equals(other.getIgnorereloadreq()))) &&
            ((this.removecookies==null && other.getRemovecookies()==null) || 
             (this.removecookies!=null &&
              this.removecookies.equals(other.getRemovecookies()))) &&
            ((this.prefetch==null && other.getPrefetch()==null) || 
             (this.prefetch!=null &&
              this.prefetch.equals(other.getPrefetch()))) &&
            ((this.prefetchperiod==null && other.getPrefetchperiod()==null) || 
             (this.prefetchperiod!=null &&
              this.prefetchperiod.equals(other.getPrefetchperiod()))) &&
            ((this.prefetchperiodmillisec==null && other.getPrefetchperiodmillisec()==null) || 
             (this.prefetchperiodmillisec!=null &&
              this.prefetchperiodmillisec.equals(other.getPrefetchperiodmillisec()))) &&
            ((this.prefetchcur==null && other.getPrefetchcur()==null) || 
             (this.prefetchcur!=null &&
              this.prefetchcur.equals(other.getPrefetchcur()))) &&
            ((this.prefetchmaxpending==null && other.getPrefetchmaxpending()==null) || 
             (this.prefetchmaxpending!=null &&
              this.prefetchmaxpending.equals(other.getPrefetchmaxpending()))) &&
            ((this.flashcache==null && other.getFlashcache()==null) || 
             (this.flashcache!=null &&
              this.flashcache.equals(other.getFlashcache()))) &&
            ((this.expireatlastbyte==null && other.getExpireatlastbyte()==null) || 
             (this.expireatlastbyte!=null &&
              this.expireatlastbyte.equals(other.getExpireatlastbyte()))) &&
            ((this.insertvia==null && other.getInsertvia()==null) || 
             (this.insertvia!=null &&
              this.insertvia.equals(other.getInsertvia()))) &&
            ((this.insertage==null && other.getInsertage()==null) || 
             (this.insertage!=null &&
              this.insertage.equals(other.getInsertage()))) &&
            ((this.insertetag==null && other.getInsertetag()==null) || 
             (this.insertetag!=null &&
              this.insertetag.equals(other.getInsertetag()))) &&
            ((this.cachecontrol==null && other.getCachecontrol()==null) || 
             (this.cachecontrol!=null &&
              this.cachecontrol.equals(other.getCachecontrol()))) &&
            ((this.quickabortsize==null && other.getQuickabortsize()==null) || 
             (this.quickabortsize!=null &&
              this.quickabortsize.equals(other.getQuickabortsize()))) &&
            ((this.minressize==null && other.getMinressize()==null) || 
             (this.minressize!=null &&
              this.minressize.equals(other.getMinressize()))) &&
            ((this.maxressize==null && other.getMaxressize()==null) || 
             (this.maxressize!=null &&
              this.maxressize.equals(other.getMaxressize()))) &&
            ((this.memusage==null && other.getMemusage()==null) || 
             (this.memusage!=null &&
              this.memusage.equals(other.getMemusage()))) &&
            ((this.memlimit==null && other.getMemlimit()==null) || 
             (this.memlimit!=null &&
              this.memlimit.equals(other.getMemlimit()))) &&
            ((this.ignorereqcachinghdrs==null && other.getIgnorereqcachinghdrs()==null) || 
             (this.ignorereqcachinghdrs!=null &&
              this.ignorereqcachinghdrs.equals(other.getIgnorereqcachinghdrs()))) &&
            ((this.cachenon304Hits==null && other.getCachenon304Hits()==null) || 
             (this.cachenon304Hits!=null &&
              this.cachenon304Hits.equals(other.getCachenon304Hits()))) &&
            ((this.cache304Hits==null && other.getCache304Hits()==null) || 
             (this.cache304Hits!=null &&
              this.cache304Hits.equals(other.getCache304Hits()))) &&
            ((this.cachecells==null && other.getCachecells()==null) || 
             (this.cachecells!=null &&
              this.cachecells.equals(other.getCachecells()))) &&
            ((this.cachegroupincarnation==null && other.getCachegroupincarnation()==null) || 
             (this.cachegroupincarnation!=null &&
              this.cachegroupincarnation.equals(other.getCachegroupincarnation()))) &&
            this.minhits == other.getMinhits() &&
            ((this.alwaysevalpolicies==null && other.getAlwaysevalpolicies()==null) || 
             (this.alwaysevalpolicies!=null &&
              this.alwaysevalpolicies.equals(other.getAlwaysevalpolicies()))) &&
            ((this.persist==null && other.getPersist()==null) || 
             (this.persist!=null &&
              this.persist.equals(other.getPersist()))) &&
            ((this.pinned==null && other.getPinned()==null) || 
             (this.pinned!=null &&
              this.pinned.equals(other.getPinned()))) &&
            ((this.lazydnsresolve==null && other.getLazydnsresolve()==null) || 
             (this.lazydnsresolve!=null &&
              this.lazydnsresolve.equals(other.getLazydnsresolve()))) &&
            ((this.hitselector==null && other.getHitselector()==null) || 
             (this.hitselector!=null &&
              this.hitselector.equals(other.getHitselector()))) &&
            ((this.invalselector==null && other.getInvalselector()==null) || 
             (this.invalselector!=null &&
              this.invalselector.equals(other.getInvalselector()))) &&
            ((this.policyname==null && other.getPolicyname()==null) || 
             (this.policyname!=null &&
              java.util.Arrays.equals(this.policyname, other.getPolicyname()))) &&
            ((this.cachenuminvalpolicy==null && other.getCachenuminvalpolicy()==null) || 
             (this.cachenuminvalpolicy!=null &&
              this.cachenuminvalpolicy.equals(other.getCachenuminvalpolicy()))) &&
            ((this.markercells==null && other.getMarkercells()==null) || 
             (this.markercells!=null &&
              this.markercells.equals(other.getMarkercells()))) &&
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
        if (getFlags() != null) {
            _hashCode += getFlags().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getRelexpiry() != null) {
            _hashCode += getRelexpiry().hashCode();
        }
        if (getRelexpirymillisec() != null) {
            _hashCode += getRelexpirymillisec().hashCode();
        }
        if (getAbsexpiry() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAbsexpiry());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAbsexpiry(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAbsexpirygmt() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAbsexpirygmt());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAbsexpirygmt(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHeurexpiryparam() != null) {
            _hashCode += getHeurexpiryparam().hashCode();
        }
        if (getWeakposrelexpiry() != null) {
            _hashCode += getWeakposrelexpiry().hashCode();
        }
        if (getWeaknegrelexpiry() != null) {
            _hashCode += getWeaknegrelexpiry().hashCode();
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
        if (getInvalparams() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvalparams());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvalparams(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIgnoreparamvaluecase() != null) {
            _hashCode += getIgnoreparamvaluecase().hashCode();
        }
        if (getMatchcookies() != null) {
            _hashCode += getMatchcookies().hashCode();
        }
        if (getInvalrestrictedtohost() != null) {
            _hashCode += getInvalrestrictedtohost().hashCode();
        }
        if (getPolleverytime() != null) {
            _hashCode += getPolleverytime().hashCode();
        }
        if (getIgnorereloadreq() != null) {
            _hashCode += getIgnorereloadreq().hashCode();
        }
        if (getRemovecookies() != null) {
            _hashCode += getRemovecookies().hashCode();
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
        if (getPrefetchcur() != null) {
            _hashCode += getPrefetchcur().hashCode();
        }
        if (getPrefetchmaxpending() != null) {
            _hashCode += getPrefetchmaxpending().hashCode();
        }
        if (getFlashcache() != null) {
            _hashCode += getFlashcache().hashCode();
        }
        if (getExpireatlastbyte() != null) {
            _hashCode += getExpireatlastbyte().hashCode();
        }
        if (getInsertvia() != null) {
            _hashCode += getInsertvia().hashCode();
        }
        if (getInsertage() != null) {
            _hashCode += getInsertage().hashCode();
        }
        if (getInsertetag() != null) {
            _hashCode += getInsertetag().hashCode();
        }
        if (getCachecontrol() != null) {
            _hashCode += getCachecontrol().hashCode();
        }
        if (getQuickabortsize() != null) {
            _hashCode += getQuickabortsize().hashCode();
        }
        if (getMinressize() != null) {
            _hashCode += getMinressize().hashCode();
        }
        if (getMaxressize() != null) {
            _hashCode += getMaxressize().hashCode();
        }
        if (getMemusage() != null) {
            _hashCode += getMemusage().hashCode();
        }
        if (getMemlimit() != null) {
            _hashCode += getMemlimit().hashCode();
        }
        if (getIgnorereqcachinghdrs() != null) {
            _hashCode += getIgnorereqcachinghdrs().hashCode();
        }
        if (getCachenon304Hits() != null) {
            _hashCode += getCachenon304Hits().hashCode();
        }
        if (getCache304Hits() != null) {
            _hashCode += getCache304Hits().hashCode();
        }
        if (getCachecells() != null) {
            _hashCode += getCachecells().hashCode();
        }
        if (getCachegroupincarnation() != null) {
            _hashCode += getCachegroupincarnation().hashCode();
        }
        _hashCode += getMinhits();
        if (getAlwaysevalpolicies() != null) {
            _hashCode += getAlwaysevalpolicies().hashCode();
        }
        if (getPersist() != null) {
            _hashCode += getPersist().hashCode();
        }
        if (getPinned() != null) {
            _hashCode += getPinned().hashCode();
        }
        if (getLazydnsresolve() != null) {
            _hashCode += getLazydnsresolve().hashCode();
        }
        if (getHitselector() != null) {
            _hashCode += getHitselector().hashCode();
        }
        if (getInvalselector() != null) {
            _hashCode += getInvalselector().hashCode();
        }
        if (getPolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCachenuminvalpolicy() != null) {
            _hashCode += getCachenuminvalpolicy().hashCode();
        }
        if (getMarkercells() != null) {
            _hashCode += getMarkercells().hashCode();
        }
        if (getBuiltin() != null) {
            _hashCode += getBuiltin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Cachecontentgroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "cachecontentgroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relexpiry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relexpiry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relexpirymillisec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relexpirymillisec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("absexpiry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "absexpiry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("absexpirygmt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "absexpirygmt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("heurexpiryparam");
        elemField.setXmlName(new javax.xml.namespace.QName("", "heurexpiryparam"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weakposrelexpiry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weakposrelexpiry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weaknegrelexpiry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weaknegrelexpiry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hitparams");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hitparams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invalparams");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invalparams"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ignoreparamvaluecase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ignoreparamvaluecase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matchcookies");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matchcookies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invalrestrictedtohost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invalrestrictedtohost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("polleverytime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "polleverytime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ignorereloadreq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ignorereloadreq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("removecookies");
        elemField.setXmlName(new javax.xml.namespace.QName("", "removecookies"));
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
        elemField.setFieldName("prefetchcur");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefetchcur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prefetchmaxpending");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prefetchmaxpending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flashcache");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flashcache"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireatlastbyte");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expireatlastbyte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertvia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "insertvia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "insertage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertetag");
        elemField.setXmlName(new javax.xml.namespace.QName("", "insertetag"));
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
        elemField.setFieldName("quickabortsize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quickabortsize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minressize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minressize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxressize");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxressize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memusage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "memusage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memlimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "memlimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ignorereqcachinghdrs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ignorereqcachinghdrs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachenon304Hits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachenon304hits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cache304Hits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cache304hits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedLong"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachecells");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachecells"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachegroupincarnation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachegroupincarnation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minhits");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minhits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alwaysevalpolicies");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alwaysevalpolicies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("persist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "persist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pinned");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pinned"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lazydnsresolve");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lazydnsresolve"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hitselector");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hitselector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invalselector");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invalselector"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cachenuminvalpolicy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cachenuminvalpolicy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markercells");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markercells"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
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
