/**
 * Server.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Server  implements java.io.Serializable {
    private java.lang.String name;

    private boolean internaL;

    private java.lang.String ipaddress;

    private java.lang.String state;

    private java.lang.String domain;

    private int domainresolveretry;

    private java.lang.String[] servicename;

    private java.lang.String[] servicegroupname;

    private java.lang.String translationip;

    private java.lang.String translationmask;

    private java.lang.String comment;

    private java.lang.String[] servicetype;

    private java.lang.String[] serviceipaddress;

    private java.lang.String[] serviceipstr;

    private org.apache.axis.types.UnsignedInt[] port;

    private java.lang.String[] svrstate;

    private java.lang.String statechangetimesec;

    private org.apache.axis.types.UnsignedInt tickssincelaststatechange;

    private java.lang.String ipv6Address;

    private org.apache.axis.types.UnsignedInt[] port2;

    private java.lang.String[] servicetype2;

    private org.apache.axis.types.UnsignedInt[] svrcfgflags;

    private java.lang.String autoscale;

    private java.lang.String[] boundservicegroupsvctype;

    private java.lang.String[] boundservicegroupsvcip;

    private org.apache.axis.types.UnsignedInt[] boundservicegroupport;

    private java.lang.String[] boundservicegroupsvrstate;

    private java.lang.String[] boundservicegrroupsvcipstr;

    public Server() {
    }

    public Server(
           java.lang.String name,
           boolean internaL,
           java.lang.String ipaddress,
           java.lang.String state,
           java.lang.String domain,
           int domainresolveretry,
           java.lang.String[] servicename,
           java.lang.String[] servicegroupname,
           java.lang.String translationip,
           java.lang.String translationmask,
           java.lang.String comment,
           java.lang.String[] servicetype,
           java.lang.String[] serviceipaddress,
           java.lang.String[] serviceipstr,
           org.apache.axis.types.UnsignedInt[] port,
           java.lang.String[] svrstate,
           java.lang.String statechangetimesec,
           org.apache.axis.types.UnsignedInt tickssincelaststatechange,
           java.lang.String ipv6Address,
           org.apache.axis.types.UnsignedInt[] port2,
           java.lang.String[] servicetype2,
           org.apache.axis.types.UnsignedInt[] svrcfgflags,
           java.lang.String autoscale,
           java.lang.String[] boundservicegroupsvctype,
           java.lang.String[] boundservicegroupsvcip,
           org.apache.axis.types.UnsignedInt[] boundservicegroupport,
           java.lang.String[] boundservicegroupsvrstate,
           java.lang.String[] boundservicegrroupsvcipstr) {
           this.name = name;
           this.internaL = internaL;
           this.ipaddress = ipaddress;
           this.state = state;
           this.domain = domain;
           this.domainresolveretry = domainresolveretry;
           this.servicename = servicename;
           this.servicegroupname = servicegroupname;
           this.translationip = translationip;
           this.translationmask = translationmask;
           this.comment = comment;
           this.servicetype = servicetype;
           this.serviceipaddress = serviceipaddress;
           this.serviceipstr = serviceipstr;
           this.port = port;
           this.svrstate = svrstate;
           this.statechangetimesec = statechangetimesec;
           this.tickssincelaststatechange = tickssincelaststatechange;
           this.ipv6Address = ipv6Address;
           this.port2 = port2;
           this.servicetype2 = servicetype2;
           this.svrcfgflags = svrcfgflags;
           this.autoscale = autoscale;
           this.boundservicegroupsvctype = boundservicegroupsvctype;
           this.boundservicegroupsvcip = boundservicegroupsvcip;
           this.boundservicegroupport = boundservicegroupport;
           this.boundservicegroupsvrstate = boundservicegroupsvrstate;
           this.boundservicegrroupsvcipstr = boundservicegrroupsvcipstr;
    }


    /**
     * Gets the name value for this Server.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Server.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the internaL value for this Server.
     * 
     * @return internaL
     */
    public boolean isInternaL() {
        return internaL;
    }


    /**
     * Sets the internaL value for this Server.
     * 
     * @param internaL
     */
    public void setInternaL(boolean internaL) {
        this.internaL = internaL;
    }


    /**
     * Gets the ipaddress value for this Server.
     * 
     * @return ipaddress
     */
    public java.lang.String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Server.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the state value for this Server.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Server.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the domain value for this Server.
     * 
     * @return domain
     */
    public java.lang.String getDomain() {
        return domain;
    }


    /**
     * Sets the domain value for this Server.
     * 
     * @param domain
     */
    public void setDomain(java.lang.String domain) {
        this.domain = domain;
    }


    /**
     * Gets the domainresolveretry value for this Server.
     * 
     * @return domainresolveretry
     */
    public int getDomainresolveretry() {
        return domainresolveretry;
    }


    /**
     * Sets the domainresolveretry value for this Server.
     * 
     * @param domainresolveretry
     */
    public void setDomainresolveretry(int domainresolveretry) {
        this.domainresolveretry = domainresolveretry;
    }


    /**
     * Gets the servicename value for this Server.
     * 
     * @return servicename
     */
    public java.lang.String[] getServicename() {
        return servicename;
    }


    /**
     * Sets the servicename value for this Server.
     * 
     * @param servicename
     */
    public void setServicename(java.lang.String[] servicename) {
        this.servicename = servicename;
    }


    /**
     * Gets the servicegroupname value for this Server.
     * 
     * @return servicegroupname
     */
    public java.lang.String[] getServicegroupname() {
        return servicegroupname;
    }


    /**
     * Sets the servicegroupname value for this Server.
     * 
     * @param servicegroupname
     */
    public void setServicegroupname(java.lang.String[] servicegroupname) {
        this.servicegroupname = servicegroupname;
    }


    /**
     * Gets the translationip value for this Server.
     * 
     * @return translationip
     */
    public java.lang.String getTranslationip() {
        return translationip;
    }


    /**
     * Sets the translationip value for this Server.
     * 
     * @param translationip
     */
    public void setTranslationip(java.lang.String translationip) {
        this.translationip = translationip;
    }


    /**
     * Gets the translationmask value for this Server.
     * 
     * @return translationmask
     */
    public java.lang.String getTranslationmask() {
        return translationmask;
    }


    /**
     * Sets the translationmask value for this Server.
     * 
     * @param translationmask
     */
    public void setTranslationmask(java.lang.String translationmask) {
        this.translationmask = translationmask;
    }


    /**
     * Gets the comment value for this Server.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Server.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the servicetype value for this Server.
     * 
     * @return servicetype
     */
    public java.lang.String[] getServicetype() {
        return servicetype;
    }


    /**
     * Sets the servicetype value for this Server.
     * 
     * @param servicetype
     */
    public void setServicetype(java.lang.String[] servicetype) {
        this.servicetype = servicetype;
    }


    /**
     * Gets the serviceipaddress value for this Server.
     * 
     * @return serviceipaddress
     */
    public java.lang.String[] getServiceipaddress() {
        return serviceipaddress;
    }


    /**
     * Sets the serviceipaddress value for this Server.
     * 
     * @param serviceipaddress
     */
    public void setServiceipaddress(java.lang.String[] serviceipaddress) {
        this.serviceipaddress = serviceipaddress;
    }


    /**
     * Gets the serviceipstr value for this Server.
     * 
     * @return serviceipstr
     */
    public java.lang.String[] getServiceipstr() {
        return serviceipstr;
    }


    /**
     * Sets the serviceipstr value for this Server.
     * 
     * @param serviceipstr
     */
    public void setServiceipstr(java.lang.String[] serviceipstr) {
        this.serviceipstr = serviceipstr;
    }


    /**
     * Gets the port value for this Server.
     * 
     * @return port
     */
    public org.apache.axis.types.UnsignedInt[] getPort() {
        return port;
    }


    /**
     * Sets the port value for this Server.
     * 
     * @param port
     */
    public void setPort(org.apache.axis.types.UnsignedInt[] port) {
        this.port = port;
    }


    /**
     * Gets the svrstate value for this Server.
     * 
     * @return svrstate
     */
    public java.lang.String[] getSvrstate() {
        return svrstate;
    }


    /**
     * Sets the svrstate value for this Server.
     * 
     * @param svrstate
     */
    public void setSvrstate(java.lang.String[] svrstate) {
        this.svrstate = svrstate;
    }


    /**
     * Gets the statechangetimesec value for this Server.
     * 
     * @return statechangetimesec
     */
    public java.lang.String getStatechangetimesec() {
        return statechangetimesec;
    }


    /**
     * Sets the statechangetimesec value for this Server.
     * 
     * @param statechangetimesec
     */
    public void setStatechangetimesec(java.lang.String statechangetimesec) {
        this.statechangetimesec = statechangetimesec;
    }


    /**
     * Gets the tickssincelaststatechange value for this Server.
     * 
     * @return tickssincelaststatechange
     */
    public org.apache.axis.types.UnsignedInt getTickssincelaststatechange() {
        return tickssincelaststatechange;
    }


    /**
     * Sets the tickssincelaststatechange value for this Server.
     * 
     * @param tickssincelaststatechange
     */
    public void setTickssincelaststatechange(org.apache.axis.types.UnsignedInt tickssincelaststatechange) {
        this.tickssincelaststatechange = tickssincelaststatechange;
    }


    /**
     * Gets the ipv6Address value for this Server.
     * 
     * @return ipv6Address
     */
    public java.lang.String getIpv6Address() {
        return ipv6Address;
    }


    /**
     * Sets the ipv6Address value for this Server.
     * 
     * @param ipv6Address
     */
    public void setIpv6Address(java.lang.String ipv6Address) {
        this.ipv6Address = ipv6Address;
    }


    /**
     * Gets the port2 value for this Server.
     * 
     * @return port2
     */
    public org.apache.axis.types.UnsignedInt[] getPort2() {
        return port2;
    }


    /**
     * Sets the port2 value for this Server.
     * 
     * @param port2
     */
    public void setPort2(org.apache.axis.types.UnsignedInt[] port2) {
        this.port2 = port2;
    }


    /**
     * Gets the servicetype2 value for this Server.
     * 
     * @return servicetype2
     */
    public java.lang.String[] getServicetype2() {
        return servicetype2;
    }


    /**
     * Sets the servicetype2 value for this Server.
     * 
     * @param servicetype2
     */
    public void setServicetype2(java.lang.String[] servicetype2) {
        this.servicetype2 = servicetype2;
    }


    /**
     * Gets the svrcfgflags value for this Server.
     * 
     * @return svrcfgflags
     */
    public org.apache.axis.types.UnsignedInt[] getSvrcfgflags() {
        return svrcfgflags;
    }


    /**
     * Sets the svrcfgflags value for this Server.
     * 
     * @param svrcfgflags
     */
    public void setSvrcfgflags(org.apache.axis.types.UnsignedInt[] svrcfgflags) {
        this.svrcfgflags = svrcfgflags;
    }


    /**
     * Gets the autoscale value for this Server.
     * 
     * @return autoscale
     */
    public java.lang.String getAutoscale() {
        return autoscale;
    }


    /**
     * Sets the autoscale value for this Server.
     * 
     * @param autoscale
     */
    public void setAutoscale(java.lang.String autoscale) {
        this.autoscale = autoscale;
    }


    /**
     * Gets the boundservicegroupsvctype value for this Server.
     * 
     * @return boundservicegroupsvctype
     */
    public java.lang.String[] getBoundservicegroupsvctype() {
        return boundservicegroupsvctype;
    }


    /**
     * Sets the boundservicegroupsvctype value for this Server.
     * 
     * @param boundservicegroupsvctype
     */
    public void setBoundservicegroupsvctype(java.lang.String[] boundservicegroupsvctype) {
        this.boundservicegroupsvctype = boundservicegroupsvctype;
    }


    /**
     * Gets the boundservicegroupsvcip value for this Server.
     * 
     * @return boundservicegroupsvcip
     */
    public java.lang.String[] getBoundservicegroupsvcip() {
        return boundservicegroupsvcip;
    }


    /**
     * Sets the boundservicegroupsvcip value for this Server.
     * 
     * @param boundservicegroupsvcip
     */
    public void setBoundservicegroupsvcip(java.lang.String[] boundservicegroupsvcip) {
        this.boundservicegroupsvcip = boundservicegroupsvcip;
    }


    /**
     * Gets the boundservicegroupport value for this Server.
     * 
     * @return boundservicegroupport
     */
    public org.apache.axis.types.UnsignedInt[] getBoundservicegroupport() {
        return boundservicegroupport;
    }


    /**
     * Sets the boundservicegroupport value for this Server.
     * 
     * @param boundservicegroupport
     */
    public void setBoundservicegroupport(org.apache.axis.types.UnsignedInt[] boundservicegroupport) {
        this.boundservicegroupport = boundservicegroupport;
    }


    /**
     * Gets the boundservicegroupsvrstate value for this Server.
     * 
     * @return boundservicegroupsvrstate
     */
    public java.lang.String[] getBoundservicegroupsvrstate() {
        return boundservicegroupsvrstate;
    }


    /**
     * Sets the boundservicegroupsvrstate value for this Server.
     * 
     * @param boundservicegroupsvrstate
     */
    public void setBoundservicegroupsvrstate(java.lang.String[] boundservicegroupsvrstate) {
        this.boundservicegroupsvrstate = boundservicegroupsvrstate;
    }


    /**
     * Gets the boundservicegrroupsvcipstr value for this Server.
     * 
     * @return boundservicegrroupsvcipstr
     */
    public java.lang.String[] getBoundservicegrroupsvcipstr() {
        return boundservicegrroupsvcipstr;
    }


    /**
     * Sets the boundservicegrroupsvcipstr value for this Server.
     * 
     * @param boundservicegrroupsvcipstr
     */
    public void setBoundservicegrroupsvcipstr(java.lang.String[] boundservicegrroupsvcipstr) {
        this.boundservicegrroupsvcipstr = boundservicegrroupsvcipstr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Server)) return false;
        Server other = (Server) obj;
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
            this.internaL == other.isInternaL() &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              this.ipaddress.equals(other.getIpaddress()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.domain==null && other.getDomain()==null) || 
             (this.domain!=null &&
              this.domain.equals(other.getDomain()))) &&
            this.domainresolveretry == other.getDomainresolveretry() &&
            ((this.servicename==null && other.getServicename()==null) || 
             (this.servicename!=null &&
              java.util.Arrays.equals(this.servicename, other.getServicename()))) &&
            ((this.servicegroupname==null && other.getServicegroupname()==null) || 
             (this.servicegroupname!=null &&
              java.util.Arrays.equals(this.servicegroupname, other.getServicegroupname()))) &&
            ((this.translationip==null && other.getTranslationip()==null) || 
             (this.translationip!=null &&
              this.translationip.equals(other.getTranslationip()))) &&
            ((this.translationmask==null && other.getTranslationmask()==null) || 
             (this.translationmask!=null &&
              this.translationmask.equals(other.getTranslationmask()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.servicetype==null && other.getServicetype()==null) || 
             (this.servicetype!=null &&
              java.util.Arrays.equals(this.servicetype, other.getServicetype()))) &&
            ((this.serviceipaddress==null && other.getServiceipaddress()==null) || 
             (this.serviceipaddress!=null &&
              java.util.Arrays.equals(this.serviceipaddress, other.getServiceipaddress()))) &&
            ((this.serviceipstr==null && other.getServiceipstr()==null) || 
             (this.serviceipstr!=null &&
              java.util.Arrays.equals(this.serviceipstr, other.getServiceipstr()))) &&
            ((this.port==null && other.getPort()==null) || 
             (this.port!=null &&
              java.util.Arrays.equals(this.port, other.getPort()))) &&
            ((this.svrstate==null && other.getSvrstate()==null) || 
             (this.svrstate!=null &&
              java.util.Arrays.equals(this.svrstate, other.getSvrstate()))) &&
            ((this.statechangetimesec==null && other.getStatechangetimesec()==null) || 
             (this.statechangetimesec!=null &&
              this.statechangetimesec.equals(other.getStatechangetimesec()))) &&
            ((this.tickssincelaststatechange==null && other.getTickssincelaststatechange()==null) || 
             (this.tickssincelaststatechange!=null &&
              this.tickssincelaststatechange.equals(other.getTickssincelaststatechange()))) &&
            ((this.ipv6Address==null && other.getIpv6Address()==null) || 
             (this.ipv6Address!=null &&
              this.ipv6Address.equals(other.getIpv6Address()))) &&
            ((this.port2==null && other.getPort2()==null) || 
             (this.port2!=null &&
              java.util.Arrays.equals(this.port2, other.getPort2()))) &&
            ((this.servicetype2==null && other.getServicetype2()==null) || 
             (this.servicetype2!=null &&
              java.util.Arrays.equals(this.servicetype2, other.getServicetype2()))) &&
            ((this.svrcfgflags==null && other.getSvrcfgflags()==null) || 
             (this.svrcfgflags!=null &&
              java.util.Arrays.equals(this.svrcfgflags, other.getSvrcfgflags()))) &&
            ((this.autoscale==null && other.getAutoscale()==null) || 
             (this.autoscale!=null &&
              this.autoscale.equals(other.getAutoscale()))) &&
            ((this.boundservicegroupsvctype==null && other.getBoundservicegroupsvctype()==null) || 
             (this.boundservicegroupsvctype!=null &&
              java.util.Arrays.equals(this.boundservicegroupsvctype, other.getBoundservicegroupsvctype()))) &&
            ((this.boundservicegroupsvcip==null && other.getBoundservicegroupsvcip()==null) || 
             (this.boundservicegroupsvcip!=null &&
              java.util.Arrays.equals(this.boundservicegroupsvcip, other.getBoundservicegroupsvcip()))) &&
            ((this.boundservicegroupport==null && other.getBoundservicegroupport()==null) || 
             (this.boundservicegroupport!=null &&
              java.util.Arrays.equals(this.boundservicegroupport, other.getBoundservicegroupport()))) &&
            ((this.boundservicegroupsvrstate==null && other.getBoundservicegroupsvrstate()==null) || 
             (this.boundservicegroupsvrstate!=null &&
              java.util.Arrays.equals(this.boundservicegroupsvrstate, other.getBoundservicegroupsvrstate()))) &&
            ((this.boundservicegrroupsvcipstr==null && other.getBoundservicegrroupsvcipstr()==null) || 
             (this.boundservicegrroupsvcipstr!=null &&
              java.util.Arrays.equals(this.boundservicegrroupsvcipstr, other.getBoundservicegrroupsvcipstr())));
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
        _hashCode += (isInternaL() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getIpaddress() != null) {
            _hashCode += getIpaddress().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getDomain() != null) {
            _hashCode += getDomain().hashCode();
        }
        _hashCode += getDomainresolveretry();
        if (getServicename() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicename());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicename(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServicegroupname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicegroupname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicegroupname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTranslationip() != null) {
            _hashCode += getTranslationip().hashCode();
        }
        if (getTranslationmask() != null) {
            _hashCode += getTranslationmask().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getServicetype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicetype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicetype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServiceipaddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceipaddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceipaddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServiceipstr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServiceipstr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServiceipstr(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPort() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPort());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPort(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvrstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvrstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvrstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatechangetimesec() != null) {
            _hashCode += getStatechangetimesec().hashCode();
        }
        if (getTickssincelaststatechange() != null) {
            _hashCode += getTickssincelaststatechange().hashCode();
        }
        if (getIpv6Address() != null) {
            _hashCode += getIpv6Address().hashCode();
        }
        if (getPort2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPort2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPort2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServicetype2() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServicetype2());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServicetype2(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSvrcfgflags() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSvrcfgflags());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSvrcfgflags(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAutoscale() != null) {
            _hashCode += getAutoscale().hashCode();
        }
        if (getBoundservicegroupsvctype() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundservicegroupsvctype());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundservicegroupsvctype(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBoundservicegroupsvcip() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundservicegroupsvcip());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundservicegroupsvcip(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBoundservicegroupport() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundservicegroupport());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundservicegroupport(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBoundservicegroupsvrstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundservicegroupsvrstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundservicegroupsvrstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBoundservicegrroupsvcipstr() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBoundservicegrroupsvcipstr());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBoundservicegrroupsvcipstr(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Server.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "server"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internaL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "internaL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipaddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domainresolveretry");
        elemField.setXmlName(new javax.xml.namespace.QName("", "domainresolveretry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicegroupname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicegroupname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translationip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "translationip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("translationmask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "translationmask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicetype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceipaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceipaddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceipstr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serviceipstr"));
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
        elemField.setFieldName("svrstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svrstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statechangetimesec");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statechangetimesec"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tickssincelaststatechange");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tickssincelaststatechange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6Address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipv6address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("port2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "port2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("servicetype2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "servicetype2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("svrcfgflags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "svrcfgflags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoscale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autoscale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundservicegroupsvctype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundservicegroupsvctype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundservicegroupsvcip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundservicegroupsvcip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundservicegroupport");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundservicegroupport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundservicegroupsvrstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundservicegroupsvrstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundservicegrroupsvcipstr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundservicegrroupsvcipstr"));
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
