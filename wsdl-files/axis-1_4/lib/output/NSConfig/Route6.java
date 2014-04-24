/**
 * Route6.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Route6  implements java.io.Serializable {
    private java.lang.String network;

    private java.lang.String gateway;

    private org.apache.axis.types.UnsignedInt vlan;

    private java.lang.String routetype;

    private boolean detail;

    private java.lang.String gatewayname;

    private java.lang.String advertise;

    private boolean type;

    private boolean dynamic;

    private org.apache.axis.types.UnsignedInt weight;

    private org.apache.axis.types.UnsignedInt distance;

    private org.apache.axis.types.UnsignedInt cost;

    private boolean data;

    private boolean flags;

    private java.lang.String msr;

    private java.lang.String monitor;

    private org.apache.axis.types.UnsignedInt state;

    private org.apache.axis.types.UnsignedInt totalprobes;

    private org.apache.axis.types.UnsignedInt totalfailedprobes;

    private org.apache.axis.types.UnsignedInt failedprobes;

    private int monstatcode;

    private int monstatparam1;

    private int monstatparam2;

    private int monstatparam3;

    private java.lang.String data1;

    private java.lang.String routeowners;

    private int retain;

    private boolean statiC;

    private boolean permanent;

    private boolean connected;

    private boolean ospfv3;

    private boolean isis;

    private boolean active;

    private boolean bgp;

    private boolean rip;

    private boolean raroute;

    public Route6() {
    }

    public Route6(
           java.lang.String network,
           java.lang.String gateway,
           org.apache.axis.types.UnsignedInt vlan,
           java.lang.String routetype,
           boolean detail,
           java.lang.String gatewayname,
           java.lang.String advertise,
           boolean type,
           boolean dynamic,
           org.apache.axis.types.UnsignedInt weight,
           org.apache.axis.types.UnsignedInt distance,
           org.apache.axis.types.UnsignedInt cost,
           boolean data,
           boolean flags,
           java.lang.String msr,
           java.lang.String monitor,
           org.apache.axis.types.UnsignedInt state,
           org.apache.axis.types.UnsignedInt totalprobes,
           org.apache.axis.types.UnsignedInt totalfailedprobes,
           org.apache.axis.types.UnsignedInt failedprobes,
           int monstatcode,
           int monstatparam1,
           int monstatparam2,
           int monstatparam3,
           java.lang.String data1,
           java.lang.String routeowners,
           int retain,
           boolean statiC,
           boolean permanent,
           boolean connected,
           boolean ospfv3,
           boolean isis,
           boolean active,
           boolean bgp,
           boolean rip,
           boolean raroute) {
           this.network = network;
           this.gateway = gateway;
           this.vlan = vlan;
           this.routetype = routetype;
           this.detail = detail;
           this.gatewayname = gatewayname;
           this.advertise = advertise;
           this.type = type;
           this.dynamic = dynamic;
           this.weight = weight;
           this.distance = distance;
           this.cost = cost;
           this.data = data;
           this.flags = flags;
           this.msr = msr;
           this.monitor = monitor;
           this.state = state;
           this.totalprobes = totalprobes;
           this.totalfailedprobes = totalfailedprobes;
           this.failedprobes = failedprobes;
           this.monstatcode = monstatcode;
           this.monstatparam1 = monstatparam1;
           this.monstatparam2 = monstatparam2;
           this.monstatparam3 = monstatparam3;
           this.data1 = data1;
           this.routeowners = routeowners;
           this.retain = retain;
           this.statiC = statiC;
           this.permanent = permanent;
           this.connected = connected;
           this.ospfv3 = ospfv3;
           this.isis = isis;
           this.active = active;
           this.bgp = bgp;
           this.rip = rip;
           this.raroute = raroute;
    }


    /**
     * Gets the network value for this Route6.
     * 
     * @return network
     */
    public java.lang.String getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this Route6.
     * 
     * @param network
     */
    public void setNetwork(java.lang.String network) {
        this.network = network;
    }


    /**
     * Gets the gateway value for this Route6.
     * 
     * @return gateway
     */
    public java.lang.String getGateway() {
        return gateway;
    }


    /**
     * Sets the gateway value for this Route6.
     * 
     * @param gateway
     */
    public void setGateway(java.lang.String gateway) {
        this.gateway = gateway;
    }


    /**
     * Gets the vlan value for this Route6.
     * 
     * @return vlan
     */
    public org.apache.axis.types.UnsignedInt getVlan() {
        return vlan;
    }


    /**
     * Sets the vlan value for this Route6.
     * 
     * @param vlan
     */
    public void setVlan(org.apache.axis.types.UnsignedInt vlan) {
        this.vlan = vlan;
    }


    /**
     * Gets the routetype value for this Route6.
     * 
     * @return routetype
     */
    public java.lang.String getRoutetype() {
        return routetype;
    }


    /**
     * Sets the routetype value for this Route6.
     * 
     * @param routetype
     */
    public void setRoutetype(java.lang.String routetype) {
        this.routetype = routetype;
    }


    /**
     * Gets the detail value for this Route6.
     * 
     * @return detail
     */
    public boolean isDetail() {
        return detail;
    }


    /**
     * Sets the detail value for this Route6.
     * 
     * @param detail
     */
    public void setDetail(boolean detail) {
        this.detail = detail;
    }


    /**
     * Gets the gatewayname value for this Route6.
     * 
     * @return gatewayname
     */
    public java.lang.String getGatewayname() {
        return gatewayname;
    }


    /**
     * Sets the gatewayname value for this Route6.
     * 
     * @param gatewayname
     */
    public void setGatewayname(java.lang.String gatewayname) {
        this.gatewayname = gatewayname;
    }


    /**
     * Gets the advertise value for this Route6.
     * 
     * @return advertise
     */
    public java.lang.String getAdvertise() {
        return advertise;
    }


    /**
     * Sets the advertise value for this Route6.
     * 
     * @param advertise
     */
    public void setAdvertise(java.lang.String advertise) {
        this.advertise = advertise;
    }


    /**
     * Gets the type value for this Route6.
     * 
     * @return type
     */
    public boolean isType() {
        return type;
    }


    /**
     * Sets the type value for this Route6.
     * 
     * @param type
     */
    public void setType(boolean type) {
        this.type = type;
    }


    /**
     * Gets the dynamic value for this Route6.
     * 
     * @return dynamic
     */
    public boolean isDynamic() {
        return dynamic;
    }


    /**
     * Sets the dynamic value for this Route6.
     * 
     * @param dynamic
     */
    public void setDynamic(boolean dynamic) {
        this.dynamic = dynamic;
    }


    /**
     * Gets the weight value for this Route6.
     * 
     * @return weight
     */
    public org.apache.axis.types.UnsignedInt getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this Route6.
     * 
     * @param weight
     */
    public void setWeight(org.apache.axis.types.UnsignedInt weight) {
        this.weight = weight;
    }


    /**
     * Gets the distance value for this Route6.
     * 
     * @return distance
     */
    public org.apache.axis.types.UnsignedInt getDistance() {
        return distance;
    }


    /**
     * Sets the distance value for this Route6.
     * 
     * @param distance
     */
    public void setDistance(org.apache.axis.types.UnsignedInt distance) {
        this.distance = distance;
    }


    /**
     * Gets the cost value for this Route6.
     * 
     * @return cost
     */
    public org.apache.axis.types.UnsignedInt getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this Route6.
     * 
     * @param cost
     */
    public void setCost(org.apache.axis.types.UnsignedInt cost) {
        this.cost = cost;
    }


    /**
     * Gets the data value for this Route6.
     * 
     * @return data
     */
    public boolean isData() {
        return data;
    }


    /**
     * Sets the data value for this Route6.
     * 
     * @param data
     */
    public void setData(boolean data) {
        this.data = data;
    }


    /**
     * Gets the flags value for this Route6.
     * 
     * @return flags
     */
    public boolean isFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this Route6.
     * 
     * @param flags
     */
    public void setFlags(boolean flags) {
        this.flags = flags;
    }


    /**
     * Gets the msr value for this Route6.
     * 
     * @return msr
     */
    public java.lang.String getMsr() {
        return msr;
    }


    /**
     * Sets the msr value for this Route6.
     * 
     * @param msr
     */
    public void setMsr(java.lang.String msr) {
        this.msr = msr;
    }


    /**
     * Gets the monitor value for this Route6.
     * 
     * @return monitor
     */
    public java.lang.String getMonitor() {
        return monitor;
    }


    /**
     * Sets the monitor value for this Route6.
     * 
     * @param monitor
     */
    public void setMonitor(java.lang.String monitor) {
        this.monitor = monitor;
    }


    /**
     * Gets the state value for this Route6.
     * 
     * @return state
     */
    public org.apache.axis.types.UnsignedInt getState() {
        return state;
    }


    /**
     * Sets the state value for this Route6.
     * 
     * @param state
     */
    public void setState(org.apache.axis.types.UnsignedInt state) {
        this.state = state;
    }


    /**
     * Gets the totalprobes value for this Route6.
     * 
     * @return totalprobes
     */
    public org.apache.axis.types.UnsignedInt getTotalprobes() {
        return totalprobes;
    }


    /**
     * Sets the totalprobes value for this Route6.
     * 
     * @param totalprobes
     */
    public void setTotalprobes(org.apache.axis.types.UnsignedInt totalprobes) {
        this.totalprobes = totalprobes;
    }


    /**
     * Gets the totalfailedprobes value for this Route6.
     * 
     * @return totalfailedprobes
     */
    public org.apache.axis.types.UnsignedInt getTotalfailedprobes() {
        return totalfailedprobes;
    }


    /**
     * Sets the totalfailedprobes value for this Route6.
     * 
     * @param totalfailedprobes
     */
    public void setTotalfailedprobes(org.apache.axis.types.UnsignedInt totalfailedprobes) {
        this.totalfailedprobes = totalfailedprobes;
    }


    /**
     * Gets the failedprobes value for this Route6.
     * 
     * @return failedprobes
     */
    public org.apache.axis.types.UnsignedInt getFailedprobes() {
        return failedprobes;
    }


    /**
     * Sets the failedprobes value for this Route6.
     * 
     * @param failedprobes
     */
    public void setFailedprobes(org.apache.axis.types.UnsignedInt failedprobes) {
        this.failedprobes = failedprobes;
    }


    /**
     * Gets the monstatcode value for this Route6.
     * 
     * @return monstatcode
     */
    public int getMonstatcode() {
        return monstatcode;
    }


    /**
     * Sets the monstatcode value for this Route6.
     * 
     * @param monstatcode
     */
    public void setMonstatcode(int monstatcode) {
        this.monstatcode = monstatcode;
    }


    /**
     * Gets the monstatparam1 value for this Route6.
     * 
     * @return monstatparam1
     */
    public int getMonstatparam1() {
        return monstatparam1;
    }


    /**
     * Sets the monstatparam1 value for this Route6.
     * 
     * @param monstatparam1
     */
    public void setMonstatparam1(int monstatparam1) {
        this.monstatparam1 = monstatparam1;
    }


    /**
     * Gets the monstatparam2 value for this Route6.
     * 
     * @return monstatparam2
     */
    public int getMonstatparam2() {
        return monstatparam2;
    }


    /**
     * Sets the monstatparam2 value for this Route6.
     * 
     * @param monstatparam2
     */
    public void setMonstatparam2(int monstatparam2) {
        this.monstatparam2 = monstatparam2;
    }


    /**
     * Gets the monstatparam3 value for this Route6.
     * 
     * @return monstatparam3
     */
    public int getMonstatparam3() {
        return monstatparam3;
    }


    /**
     * Sets the monstatparam3 value for this Route6.
     * 
     * @param monstatparam3
     */
    public void setMonstatparam3(int monstatparam3) {
        this.monstatparam3 = monstatparam3;
    }


    /**
     * Gets the data1 value for this Route6.
     * 
     * @return data1
     */
    public java.lang.String getData1() {
        return data1;
    }


    /**
     * Sets the data1 value for this Route6.
     * 
     * @param data1
     */
    public void setData1(java.lang.String data1) {
        this.data1 = data1;
    }


    /**
     * Gets the routeowners value for this Route6.
     * 
     * @return routeowners
     */
    public java.lang.String getRouteowners() {
        return routeowners;
    }


    /**
     * Sets the routeowners value for this Route6.
     * 
     * @param routeowners
     */
    public void setRouteowners(java.lang.String routeowners) {
        this.routeowners = routeowners;
    }


    /**
     * Gets the retain value for this Route6.
     * 
     * @return retain
     */
    public int getRetain() {
        return retain;
    }


    /**
     * Sets the retain value for this Route6.
     * 
     * @param retain
     */
    public void setRetain(int retain) {
        this.retain = retain;
    }


    /**
     * Gets the statiC value for this Route6.
     * 
     * @return statiC
     */
    public boolean isStatiC() {
        return statiC;
    }


    /**
     * Sets the statiC value for this Route6.
     * 
     * @param statiC
     */
    public void setStatiC(boolean statiC) {
        this.statiC = statiC;
    }


    /**
     * Gets the permanent value for this Route6.
     * 
     * @return permanent
     */
    public boolean isPermanent() {
        return permanent;
    }


    /**
     * Sets the permanent value for this Route6.
     * 
     * @param permanent
     */
    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }


    /**
     * Gets the connected value for this Route6.
     * 
     * @return connected
     */
    public boolean isConnected() {
        return connected;
    }


    /**
     * Sets the connected value for this Route6.
     * 
     * @param connected
     */
    public void setConnected(boolean connected) {
        this.connected = connected;
    }


    /**
     * Gets the ospfv3 value for this Route6.
     * 
     * @return ospfv3
     */
    public boolean isOspfv3() {
        return ospfv3;
    }


    /**
     * Sets the ospfv3 value for this Route6.
     * 
     * @param ospfv3
     */
    public void setOspfv3(boolean ospfv3) {
        this.ospfv3 = ospfv3;
    }


    /**
     * Gets the isis value for this Route6.
     * 
     * @return isis
     */
    public boolean isIsis() {
        return isis;
    }


    /**
     * Sets the isis value for this Route6.
     * 
     * @param isis
     */
    public void setIsis(boolean isis) {
        this.isis = isis;
    }


    /**
     * Gets the active value for this Route6.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this Route6.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the bgp value for this Route6.
     * 
     * @return bgp
     */
    public boolean isBgp() {
        return bgp;
    }


    /**
     * Sets the bgp value for this Route6.
     * 
     * @param bgp
     */
    public void setBgp(boolean bgp) {
        this.bgp = bgp;
    }


    /**
     * Gets the rip value for this Route6.
     * 
     * @return rip
     */
    public boolean isRip() {
        return rip;
    }


    /**
     * Sets the rip value for this Route6.
     * 
     * @param rip
     */
    public void setRip(boolean rip) {
        this.rip = rip;
    }


    /**
     * Gets the raroute value for this Route6.
     * 
     * @return raroute
     */
    public boolean isRaroute() {
        return raroute;
    }


    /**
     * Sets the raroute value for this Route6.
     * 
     * @param raroute
     */
    public void setRaroute(boolean raroute) {
        this.raroute = raroute;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Route6)) return false;
        Route6 other = (Route6) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.network==null && other.getNetwork()==null) || 
             (this.network!=null &&
              this.network.equals(other.getNetwork()))) &&
            ((this.gateway==null && other.getGateway()==null) || 
             (this.gateway!=null &&
              this.gateway.equals(other.getGateway()))) &&
            ((this.vlan==null && other.getVlan()==null) || 
             (this.vlan!=null &&
              this.vlan.equals(other.getVlan()))) &&
            ((this.routetype==null && other.getRoutetype()==null) || 
             (this.routetype!=null &&
              this.routetype.equals(other.getRoutetype()))) &&
            this.detail == other.isDetail() &&
            ((this.gatewayname==null && other.getGatewayname()==null) || 
             (this.gatewayname!=null &&
              this.gatewayname.equals(other.getGatewayname()))) &&
            ((this.advertise==null && other.getAdvertise()==null) || 
             (this.advertise!=null &&
              this.advertise.equals(other.getAdvertise()))) &&
            this.type == other.isType() &&
            this.dynamic == other.isDynamic() &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.distance==null && other.getDistance()==null) || 
             (this.distance!=null &&
              this.distance.equals(other.getDistance()))) &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            this.data == other.isData() &&
            this.flags == other.isFlags() &&
            ((this.msr==null && other.getMsr()==null) || 
             (this.msr!=null &&
              this.msr.equals(other.getMsr()))) &&
            ((this.monitor==null && other.getMonitor()==null) || 
             (this.monitor!=null &&
              this.monitor.equals(other.getMonitor()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
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
            ((this.data1==null && other.getData1()==null) || 
             (this.data1!=null &&
              this.data1.equals(other.getData1()))) &&
            ((this.routeowners==null && other.getRouteowners()==null) || 
             (this.routeowners!=null &&
              this.routeowners.equals(other.getRouteowners()))) &&
            this.retain == other.getRetain() &&
            this.statiC == other.isStatiC() &&
            this.permanent == other.isPermanent() &&
            this.connected == other.isConnected() &&
            this.ospfv3 == other.isOspfv3() &&
            this.isis == other.isIsis() &&
            this.active == other.isActive() &&
            this.bgp == other.isBgp() &&
            this.rip == other.isRip() &&
            this.raroute == other.isRaroute();
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
        if (getNetwork() != null) {
            _hashCode += getNetwork().hashCode();
        }
        if (getGateway() != null) {
            _hashCode += getGateway().hashCode();
        }
        if (getVlan() != null) {
            _hashCode += getVlan().hashCode();
        }
        if (getRoutetype() != null) {
            _hashCode += getRoutetype().hashCode();
        }
        _hashCode += (isDetail() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getGatewayname() != null) {
            _hashCode += getGatewayname().hashCode();
        }
        if (getAdvertise() != null) {
            _hashCode += getAdvertise().hashCode();
        }
        _hashCode += (isType() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDynamic() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getDistance() != null) {
            _hashCode += getDistance().hashCode();
        }
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        _hashCode += (isData() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isFlags() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getMsr() != null) {
            _hashCode += getMsr().hashCode();
        }
        if (getMonitor() != null) {
            _hashCode += getMonitor().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
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
        if (getData1() != null) {
            _hashCode += getData1().hashCode();
        }
        if (getRouteowners() != null) {
            _hashCode += getRouteowners().hashCode();
        }
        _hashCode += getRetain();
        _hashCode += (isStatiC() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPermanent() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isConnected() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOspfv3() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsis() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isBgp() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRip() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRaroute() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Route6.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "route6"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("", "network"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gateway");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gateway"));
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
        elemField.setFieldName("routetype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routetype"));
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
        elemField.setFieldName("gatewayname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gatewayname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advertise");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advertise"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dynamic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dynamic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "distance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flags");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flags"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
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
        elemField.setFieldName("data1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeowners");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routeowners"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retain");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retain"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statiC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "statiC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permanent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "permanent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connected");
        elemField.setXmlName(new javax.xml.namespace.QName("", "connected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ospfv3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ospfv3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bgp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bgp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("raroute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "raroute"));
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
