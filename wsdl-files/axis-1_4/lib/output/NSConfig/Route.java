/**
 * Route.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Route  implements java.io.Serializable {
    private java.lang.String network;

    private java.lang.String netmask;

    private java.lang.String gateway;

    private java.lang.String routetype;

    private boolean detail;

    private java.lang.String gatewayname;

    private java.lang.String advertise;

    private boolean type;

    private boolean dynamic;

    private boolean statiC;

    private boolean permanent;

    private boolean direct;

    private boolean nat;

    private boolean lbroute;

    private boolean adv;

    private boolean tunnel;

    private org.apache.axis.types.UnsignedInt cost;

    private org.apache.axis.types.UnsignedInt distance;

    private org.apache.axis.types.UnsignedInt cost2;

    private org.apache.axis.types.UnsignedInt weight;

    private java.lang.String protocol;

    private boolean data;

    private boolean data0;

    private boolean flags;

    private java.lang.String routeowners;

    private int retain;

    private boolean ospf;

    private boolean isis;

    private boolean rip;

    private boolean bgp;

    private boolean dhcp;

    private boolean advospf;

    private boolean advisis;

    private boolean advrip;

    private boolean advbgp;

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

    public Route() {
    }

    public Route(
           java.lang.String network,
           java.lang.String netmask,
           java.lang.String gateway,
           java.lang.String routetype,
           boolean detail,
           java.lang.String gatewayname,
           java.lang.String advertise,
           boolean type,
           boolean dynamic,
           boolean statiC,
           boolean permanent,
           boolean direct,
           boolean nat,
           boolean lbroute,
           boolean adv,
           boolean tunnel,
           org.apache.axis.types.UnsignedInt cost,
           org.apache.axis.types.UnsignedInt distance,
           org.apache.axis.types.UnsignedInt cost2,
           org.apache.axis.types.UnsignedInt weight,
           java.lang.String protocol,
           boolean data,
           boolean data0,
           boolean flags,
           java.lang.String routeowners,
           int retain,
           boolean ospf,
           boolean isis,
           boolean rip,
           boolean bgp,
           boolean dhcp,
           boolean advospf,
           boolean advisis,
           boolean advrip,
           boolean advbgp,
           java.lang.String msr,
           java.lang.String monitor,
           org.apache.axis.types.UnsignedInt state,
           org.apache.axis.types.UnsignedInt totalprobes,
           org.apache.axis.types.UnsignedInt totalfailedprobes,
           org.apache.axis.types.UnsignedInt failedprobes,
           int monstatcode,
           int monstatparam1,
           int monstatparam2,
           int monstatparam3) {
           this.network = network;
           this.netmask = netmask;
           this.gateway = gateway;
           this.routetype = routetype;
           this.detail = detail;
           this.gatewayname = gatewayname;
           this.advertise = advertise;
           this.type = type;
           this.dynamic = dynamic;
           this.statiC = statiC;
           this.permanent = permanent;
           this.direct = direct;
           this.nat = nat;
           this.lbroute = lbroute;
           this.adv = adv;
           this.tunnel = tunnel;
           this.cost = cost;
           this.distance = distance;
           this.cost2 = cost2;
           this.weight = weight;
           this.protocol = protocol;
           this.data = data;
           this.data0 = data0;
           this.flags = flags;
           this.routeowners = routeowners;
           this.retain = retain;
           this.ospf = ospf;
           this.isis = isis;
           this.rip = rip;
           this.bgp = bgp;
           this.dhcp = dhcp;
           this.advospf = advospf;
           this.advisis = advisis;
           this.advrip = advrip;
           this.advbgp = advbgp;
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
    }


    /**
     * Gets the network value for this Route.
     * 
     * @return network
     */
    public java.lang.String getNetwork() {
        return network;
    }


    /**
     * Sets the network value for this Route.
     * 
     * @param network
     */
    public void setNetwork(java.lang.String network) {
        this.network = network;
    }


    /**
     * Gets the netmask value for this Route.
     * 
     * @return netmask
     */
    public java.lang.String getNetmask() {
        return netmask;
    }


    /**
     * Sets the netmask value for this Route.
     * 
     * @param netmask
     */
    public void setNetmask(java.lang.String netmask) {
        this.netmask = netmask;
    }


    /**
     * Gets the gateway value for this Route.
     * 
     * @return gateway
     */
    public java.lang.String getGateway() {
        return gateway;
    }


    /**
     * Sets the gateway value for this Route.
     * 
     * @param gateway
     */
    public void setGateway(java.lang.String gateway) {
        this.gateway = gateway;
    }


    /**
     * Gets the routetype value for this Route.
     * 
     * @return routetype
     */
    public java.lang.String getRoutetype() {
        return routetype;
    }


    /**
     * Sets the routetype value for this Route.
     * 
     * @param routetype
     */
    public void setRoutetype(java.lang.String routetype) {
        this.routetype = routetype;
    }


    /**
     * Gets the detail value for this Route.
     * 
     * @return detail
     */
    public boolean isDetail() {
        return detail;
    }


    /**
     * Sets the detail value for this Route.
     * 
     * @param detail
     */
    public void setDetail(boolean detail) {
        this.detail = detail;
    }


    /**
     * Gets the gatewayname value for this Route.
     * 
     * @return gatewayname
     */
    public java.lang.String getGatewayname() {
        return gatewayname;
    }


    /**
     * Sets the gatewayname value for this Route.
     * 
     * @param gatewayname
     */
    public void setGatewayname(java.lang.String gatewayname) {
        this.gatewayname = gatewayname;
    }


    /**
     * Gets the advertise value for this Route.
     * 
     * @return advertise
     */
    public java.lang.String getAdvertise() {
        return advertise;
    }


    /**
     * Sets the advertise value for this Route.
     * 
     * @param advertise
     */
    public void setAdvertise(java.lang.String advertise) {
        this.advertise = advertise;
    }


    /**
     * Gets the type value for this Route.
     * 
     * @return type
     */
    public boolean isType() {
        return type;
    }


    /**
     * Sets the type value for this Route.
     * 
     * @param type
     */
    public void setType(boolean type) {
        this.type = type;
    }


    /**
     * Gets the dynamic value for this Route.
     * 
     * @return dynamic
     */
    public boolean isDynamic() {
        return dynamic;
    }


    /**
     * Sets the dynamic value for this Route.
     * 
     * @param dynamic
     */
    public void setDynamic(boolean dynamic) {
        this.dynamic = dynamic;
    }


    /**
     * Gets the statiC value for this Route.
     * 
     * @return statiC
     */
    public boolean isStatiC() {
        return statiC;
    }


    /**
     * Sets the statiC value for this Route.
     * 
     * @param statiC
     */
    public void setStatiC(boolean statiC) {
        this.statiC = statiC;
    }


    /**
     * Gets the permanent value for this Route.
     * 
     * @return permanent
     */
    public boolean isPermanent() {
        return permanent;
    }


    /**
     * Sets the permanent value for this Route.
     * 
     * @param permanent
     */
    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }


    /**
     * Gets the direct value for this Route.
     * 
     * @return direct
     */
    public boolean isDirect() {
        return direct;
    }


    /**
     * Sets the direct value for this Route.
     * 
     * @param direct
     */
    public void setDirect(boolean direct) {
        this.direct = direct;
    }


    /**
     * Gets the nat value for this Route.
     * 
     * @return nat
     */
    public boolean isNat() {
        return nat;
    }


    /**
     * Sets the nat value for this Route.
     * 
     * @param nat
     */
    public void setNat(boolean nat) {
        this.nat = nat;
    }


    /**
     * Gets the lbroute value for this Route.
     * 
     * @return lbroute
     */
    public boolean isLbroute() {
        return lbroute;
    }


    /**
     * Sets the lbroute value for this Route.
     * 
     * @param lbroute
     */
    public void setLbroute(boolean lbroute) {
        this.lbroute = lbroute;
    }


    /**
     * Gets the adv value for this Route.
     * 
     * @return adv
     */
    public boolean isAdv() {
        return adv;
    }


    /**
     * Sets the adv value for this Route.
     * 
     * @param adv
     */
    public void setAdv(boolean adv) {
        this.adv = adv;
    }


    /**
     * Gets the tunnel value for this Route.
     * 
     * @return tunnel
     */
    public boolean isTunnel() {
        return tunnel;
    }


    /**
     * Sets the tunnel value for this Route.
     * 
     * @param tunnel
     */
    public void setTunnel(boolean tunnel) {
        this.tunnel = tunnel;
    }


    /**
     * Gets the cost value for this Route.
     * 
     * @return cost
     */
    public org.apache.axis.types.UnsignedInt getCost() {
        return cost;
    }


    /**
     * Sets the cost value for this Route.
     * 
     * @param cost
     */
    public void setCost(org.apache.axis.types.UnsignedInt cost) {
        this.cost = cost;
    }


    /**
     * Gets the distance value for this Route.
     * 
     * @return distance
     */
    public org.apache.axis.types.UnsignedInt getDistance() {
        return distance;
    }


    /**
     * Sets the distance value for this Route.
     * 
     * @param distance
     */
    public void setDistance(org.apache.axis.types.UnsignedInt distance) {
        this.distance = distance;
    }


    /**
     * Gets the cost2 value for this Route.
     * 
     * @return cost2
     */
    public org.apache.axis.types.UnsignedInt getCost2() {
        return cost2;
    }


    /**
     * Sets the cost2 value for this Route.
     * 
     * @param cost2
     */
    public void setCost2(org.apache.axis.types.UnsignedInt cost2) {
        this.cost2 = cost2;
    }


    /**
     * Gets the weight value for this Route.
     * 
     * @return weight
     */
    public org.apache.axis.types.UnsignedInt getWeight() {
        return weight;
    }


    /**
     * Sets the weight value for this Route.
     * 
     * @param weight
     */
    public void setWeight(org.apache.axis.types.UnsignedInt weight) {
        this.weight = weight;
    }


    /**
     * Gets the protocol value for this Route.
     * 
     * @return protocol
     */
    public java.lang.String getProtocol() {
        return protocol;
    }


    /**
     * Sets the protocol value for this Route.
     * 
     * @param protocol
     */
    public void setProtocol(java.lang.String protocol) {
        this.protocol = protocol;
    }


    /**
     * Gets the data value for this Route.
     * 
     * @return data
     */
    public boolean isData() {
        return data;
    }


    /**
     * Sets the data value for this Route.
     * 
     * @param data
     */
    public void setData(boolean data) {
        this.data = data;
    }


    /**
     * Gets the data0 value for this Route.
     * 
     * @return data0
     */
    public boolean isData0() {
        return data0;
    }


    /**
     * Sets the data0 value for this Route.
     * 
     * @param data0
     */
    public void setData0(boolean data0) {
        this.data0 = data0;
    }


    /**
     * Gets the flags value for this Route.
     * 
     * @return flags
     */
    public boolean isFlags() {
        return flags;
    }


    /**
     * Sets the flags value for this Route.
     * 
     * @param flags
     */
    public void setFlags(boolean flags) {
        this.flags = flags;
    }


    /**
     * Gets the routeowners value for this Route.
     * 
     * @return routeowners
     */
    public java.lang.String getRouteowners() {
        return routeowners;
    }


    /**
     * Sets the routeowners value for this Route.
     * 
     * @param routeowners
     */
    public void setRouteowners(java.lang.String routeowners) {
        this.routeowners = routeowners;
    }


    /**
     * Gets the retain value for this Route.
     * 
     * @return retain
     */
    public int getRetain() {
        return retain;
    }


    /**
     * Sets the retain value for this Route.
     * 
     * @param retain
     */
    public void setRetain(int retain) {
        this.retain = retain;
    }


    /**
     * Gets the ospf value for this Route.
     * 
     * @return ospf
     */
    public boolean isOspf() {
        return ospf;
    }


    /**
     * Sets the ospf value for this Route.
     * 
     * @param ospf
     */
    public void setOspf(boolean ospf) {
        this.ospf = ospf;
    }


    /**
     * Gets the isis value for this Route.
     * 
     * @return isis
     */
    public boolean isIsis() {
        return isis;
    }


    /**
     * Sets the isis value for this Route.
     * 
     * @param isis
     */
    public void setIsis(boolean isis) {
        this.isis = isis;
    }


    /**
     * Gets the rip value for this Route.
     * 
     * @return rip
     */
    public boolean isRip() {
        return rip;
    }


    /**
     * Sets the rip value for this Route.
     * 
     * @param rip
     */
    public void setRip(boolean rip) {
        this.rip = rip;
    }


    /**
     * Gets the bgp value for this Route.
     * 
     * @return bgp
     */
    public boolean isBgp() {
        return bgp;
    }


    /**
     * Sets the bgp value for this Route.
     * 
     * @param bgp
     */
    public void setBgp(boolean bgp) {
        this.bgp = bgp;
    }


    /**
     * Gets the dhcp value for this Route.
     * 
     * @return dhcp
     */
    public boolean isDhcp() {
        return dhcp;
    }


    /**
     * Sets the dhcp value for this Route.
     * 
     * @param dhcp
     */
    public void setDhcp(boolean dhcp) {
        this.dhcp = dhcp;
    }


    /**
     * Gets the advospf value for this Route.
     * 
     * @return advospf
     */
    public boolean isAdvospf() {
        return advospf;
    }


    /**
     * Sets the advospf value for this Route.
     * 
     * @param advospf
     */
    public void setAdvospf(boolean advospf) {
        this.advospf = advospf;
    }


    /**
     * Gets the advisis value for this Route.
     * 
     * @return advisis
     */
    public boolean isAdvisis() {
        return advisis;
    }


    /**
     * Sets the advisis value for this Route.
     * 
     * @param advisis
     */
    public void setAdvisis(boolean advisis) {
        this.advisis = advisis;
    }


    /**
     * Gets the advrip value for this Route.
     * 
     * @return advrip
     */
    public boolean isAdvrip() {
        return advrip;
    }


    /**
     * Sets the advrip value for this Route.
     * 
     * @param advrip
     */
    public void setAdvrip(boolean advrip) {
        this.advrip = advrip;
    }


    /**
     * Gets the advbgp value for this Route.
     * 
     * @return advbgp
     */
    public boolean isAdvbgp() {
        return advbgp;
    }


    /**
     * Sets the advbgp value for this Route.
     * 
     * @param advbgp
     */
    public void setAdvbgp(boolean advbgp) {
        this.advbgp = advbgp;
    }


    /**
     * Gets the msr value for this Route.
     * 
     * @return msr
     */
    public java.lang.String getMsr() {
        return msr;
    }


    /**
     * Sets the msr value for this Route.
     * 
     * @param msr
     */
    public void setMsr(java.lang.String msr) {
        this.msr = msr;
    }


    /**
     * Gets the monitor value for this Route.
     * 
     * @return monitor
     */
    public java.lang.String getMonitor() {
        return monitor;
    }


    /**
     * Sets the monitor value for this Route.
     * 
     * @param monitor
     */
    public void setMonitor(java.lang.String monitor) {
        this.monitor = monitor;
    }


    /**
     * Gets the state value for this Route.
     * 
     * @return state
     */
    public org.apache.axis.types.UnsignedInt getState() {
        return state;
    }


    /**
     * Sets the state value for this Route.
     * 
     * @param state
     */
    public void setState(org.apache.axis.types.UnsignedInt state) {
        this.state = state;
    }


    /**
     * Gets the totalprobes value for this Route.
     * 
     * @return totalprobes
     */
    public org.apache.axis.types.UnsignedInt getTotalprobes() {
        return totalprobes;
    }


    /**
     * Sets the totalprobes value for this Route.
     * 
     * @param totalprobes
     */
    public void setTotalprobes(org.apache.axis.types.UnsignedInt totalprobes) {
        this.totalprobes = totalprobes;
    }


    /**
     * Gets the totalfailedprobes value for this Route.
     * 
     * @return totalfailedprobes
     */
    public org.apache.axis.types.UnsignedInt getTotalfailedprobes() {
        return totalfailedprobes;
    }


    /**
     * Sets the totalfailedprobes value for this Route.
     * 
     * @param totalfailedprobes
     */
    public void setTotalfailedprobes(org.apache.axis.types.UnsignedInt totalfailedprobes) {
        this.totalfailedprobes = totalfailedprobes;
    }


    /**
     * Gets the failedprobes value for this Route.
     * 
     * @return failedprobes
     */
    public org.apache.axis.types.UnsignedInt getFailedprobes() {
        return failedprobes;
    }


    /**
     * Sets the failedprobes value for this Route.
     * 
     * @param failedprobes
     */
    public void setFailedprobes(org.apache.axis.types.UnsignedInt failedprobes) {
        this.failedprobes = failedprobes;
    }


    /**
     * Gets the monstatcode value for this Route.
     * 
     * @return monstatcode
     */
    public int getMonstatcode() {
        return monstatcode;
    }


    /**
     * Sets the monstatcode value for this Route.
     * 
     * @param monstatcode
     */
    public void setMonstatcode(int monstatcode) {
        this.monstatcode = monstatcode;
    }


    /**
     * Gets the monstatparam1 value for this Route.
     * 
     * @return monstatparam1
     */
    public int getMonstatparam1() {
        return monstatparam1;
    }


    /**
     * Sets the monstatparam1 value for this Route.
     * 
     * @param monstatparam1
     */
    public void setMonstatparam1(int monstatparam1) {
        this.monstatparam1 = monstatparam1;
    }


    /**
     * Gets the monstatparam2 value for this Route.
     * 
     * @return monstatparam2
     */
    public int getMonstatparam2() {
        return monstatparam2;
    }


    /**
     * Sets the monstatparam2 value for this Route.
     * 
     * @param monstatparam2
     */
    public void setMonstatparam2(int monstatparam2) {
        this.monstatparam2 = monstatparam2;
    }


    /**
     * Gets the monstatparam3 value for this Route.
     * 
     * @return monstatparam3
     */
    public int getMonstatparam3() {
        return monstatparam3;
    }


    /**
     * Sets the monstatparam3 value for this Route.
     * 
     * @param monstatparam3
     */
    public void setMonstatparam3(int monstatparam3) {
        this.monstatparam3 = monstatparam3;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Route)) return false;
        Route other = (Route) obj;
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
            ((this.netmask==null && other.getNetmask()==null) || 
             (this.netmask!=null &&
              this.netmask.equals(other.getNetmask()))) &&
            ((this.gateway==null && other.getGateway()==null) || 
             (this.gateway!=null &&
              this.gateway.equals(other.getGateway()))) &&
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
            this.statiC == other.isStatiC() &&
            this.permanent == other.isPermanent() &&
            this.direct == other.isDirect() &&
            this.nat == other.isNat() &&
            this.lbroute == other.isLbroute() &&
            this.adv == other.isAdv() &&
            this.tunnel == other.isTunnel() &&
            ((this.cost==null && other.getCost()==null) || 
             (this.cost!=null &&
              this.cost.equals(other.getCost()))) &&
            ((this.distance==null && other.getDistance()==null) || 
             (this.distance!=null &&
              this.distance.equals(other.getDistance()))) &&
            ((this.cost2==null && other.getCost2()==null) || 
             (this.cost2!=null &&
              this.cost2.equals(other.getCost2()))) &&
            ((this.weight==null && other.getWeight()==null) || 
             (this.weight!=null &&
              this.weight.equals(other.getWeight()))) &&
            ((this.protocol==null && other.getProtocol()==null) || 
             (this.protocol!=null &&
              this.protocol.equals(other.getProtocol()))) &&
            this.data == other.isData() &&
            this.data0 == other.isData0() &&
            this.flags == other.isFlags() &&
            ((this.routeowners==null && other.getRouteowners()==null) || 
             (this.routeowners!=null &&
              this.routeowners.equals(other.getRouteowners()))) &&
            this.retain == other.getRetain() &&
            this.ospf == other.isOspf() &&
            this.isis == other.isIsis() &&
            this.rip == other.isRip() &&
            this.bgp == other.isBgp() &&
            this.dhcp == other.isDhcp() &&
            this.advospf == other.isAdvospf() &&
            this.advisis == other.isAdvisis() &&
            this.advrip == other.isAdvrip() &&
            this.advbgp == other.isAdvbgp() &&
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
            this.monstatparam3 == other.getMonstatparam3();
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
        if (getNetmask() != null) {
            _hashCode += getNetmask().hashCode();
        }
        if (getGateway() != null) {
            _hashCode += getGateway().hashCode();
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
        _hashCode += (isStatiC() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPermanent() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDirect() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNat() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isLbroute() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAdv() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTunnel() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCost() != null) {
            _hashCode += getCost().hashCode();
        }
        if (getDistance() != null) {
            _hashCode += getDistance().hashCode();
        }
        if (getCost2() != null) {
            _hashCode += getCost2().hashCode();
        }
        if (getWeight() != null) {
            _hashCode += getWeight().hashCode();
        }
        if (getProtocol() != null) {
            _hashCode += getProtocol().hashCode();
        }
        _hashCode += (isData() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isData0() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isFlags() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRouteowners() != null) {
            _hashCode += getRouteowners().hashCode();
        }
        _hashCode += getRetain();
        _hashCode += (isOspf() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsis() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRip() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isBgp() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isDhcp() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAdvospf() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAdvisis() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAdvrip() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAdvbgp() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Route.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "route"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("network");
        elemField.setXmlName(new javax.xml.namespace.QName("", "network"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("netmask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "netmask"));
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
        elemField.setFieldName("direct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "direct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lbroute");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lbroute"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tunnel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tunnel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cost"));
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
        elemField.setFieldName("cost2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cost2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "weight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("protocol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "protocol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data0");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data0"));
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
        elemField.setFieldName("ospf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ospf"));
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
        elemField.setFieldName("rip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rip"));
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
        elemField.setFieldName("dhcp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dhcp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advospf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advospf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advisis");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advisis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advrip");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advrip"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("advbgp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "advbgp"));
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
