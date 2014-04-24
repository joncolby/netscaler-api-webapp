/**
 * Nd6Ravariables.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Nd6Ravariables  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt vlan;

    private java.lang.String ceaserouteradv;

    private java.lang.String sendrouteradv;

    private java.lang.String srclinklayeraddroption;

    private java.lang.String onlyunicastrtadvresponse;

    private java.lang.String managedaddrconfig;

    private java.lang.String otheraddrconfig;

    private org.apache.axis.types.UnsignedInt currhoplimit;

    private org.apache.axis.types.UnsignedInt maxrtadvinterval;

    private org.apache.axis.types.UnsignedInt minrtadvinterval;

    private org.apache.axis.types.UnsignedInt linkmtu;

    private org.apache.axis.types.UnsignedInt reachabletime;

    private org.apache.axis.types.UnsignedInt retranstime;

    private int defaultlifetime;

    private org.apache.axis.types.UnsignedInt lastrtadvtime;

    private org.apache.axis.types.UnsignedInt nextrtadvdelay;

    private java.lang.String[] ipv6Prefix;

    public Nd6Ravariables() {
    }

    public Nd6Ravariables(
           org.apache.axis.types.UnsignedInt vlan,
           java.lang.String ceaserouteradv,
           java.lang.String sendrouteradv,
           java.lang.String srclinklayeraddroption,
           java.lang.String onlyunicastrtadvresponse,
           java.lang.String managedaddrconfig,
           java.lang.String otheraddrconfig,
           org.apache.axis.types.UnsignedInt currhoplimit,
           org.apache.axis.types.UnsignedInt maxrtadvinterval,
           org.apache.axis.types.UnsignedInt minrtadvinterval,
           org.apache.axis.types.UnsignedInt linkmtu,
           org.apache.axis.types.UnsignedInt reachabletime,
           org.apache.axis.types.UnsignedInt retranstime,
           int defaultlifetime,
           org.apache.axis.types.UnsignedInt lastrtadvtime,
           org.apache.axis.types.UnsignedInt nextrtadvdelay,
           java.lang.String[] ipv6Prefix) {
           this.vlan = vlan;
           this.ceaserouteradv = ceaserouteradv;
           this.sendrouteradv = sendrouteradv;
           this.srclinklayeraddroption = srclinklayeraddroption;
           this.onlyunicastrtadvresponse = onlyunicastrtadvresponse;
           this.managedaddrconfig = managedaddrconfig;
           this.otheraddrconfig = otheraddrconfig;
           this.currhoplimit = currhoplimit;
           this.maxrtadvinterval = maxrtadvinterval;
           this.minrtadvinterval = minrtadvinterval;
           this.linkmtu = linkmtu;
           this.reachabletime = reachabletime;
           this.retranstime = retranstime;
           this.defaultlifetime = defaultlifetime;
           this.lastrtadvtime = lastrtadvtime;
           this.nextrtadvdelay = nextrtadvdelay;
           this.ipv6Prefix = ipv6Prefix;
    }


    /**
     * Gets the vlan value for this Nd6Ravariables.
     * 
     * @return vlan
     */
    public org.apache.axis.types.UnsignedInt getVlan() {
        return vlan;
    }


    /**
     * Sets the vlan value for this Nd6Ravariables.
     * 
     * @param vlan
     */
    public void setVlan(org.apache.axis.types.UnsignedInt vlan) {
        this.vlan = vlan;
    }


    /**
     * Gets the ceaserouteradv value for this Nd6Ravariables.
     * 
     * @return ceaserouteradv
     */
    public java.lang.String getCeaserouteradv() {
        return ceaserouteradv;
    }


    /**
     * Sets the ceaserouteradv value for this Nd6Ravariables.
     * 
     * @param ceaserouteradv
     */
    public void setCeaserouteradv(java.lang.String ceaserouteradv) {
        this.ceaserouteradv = ceaserouteradv;
    }


    /**
     * Gets the sendrouteradv value for this Nd6Ravariables.
     * 
     * @return sendrouteradv
     */
    public java.lang.String getSendrouteradv() {
        return sendrouteradv;
    }


    /**
     * Sets the sendrouteradv value for this Nd6Ravariables.
     * 
     * @param sendrouteradv
     */
    public void setSendrouteradv(java.lang.String sendrouteradv) {
        this.sendrouteradv = sendrouteradv;
    }


    /**
     * Gets the srclinklayeraddroption value for this Nd6Ravariables.
     * 
     * @return srclinklayeraddroption
     */
    public java.lang.String getSrclinklayeraddroption() {
        return srclinklayeraddroption;
    }


    /**
     * Sets the srclinklayeraddroption value for this Nd6Ravariables.
     * 
     * @param srclinklayeraddroption
     */
    public void setSrclinklayeraddroption(java.lang.String srclinklayeraddroption) {
        this.srclinklayeraddroption = srclinklayeraddroption;
    }


    /**
     * Gets the onlyunicastrtadvresponse value for this Nd6Ravariables.
     * 
     * @return onlyunicastrtadvresponse
     */
    public java.lang.String getOnlyunicastrtadvresponse() {
        return onlyunicastrtadvresponse;
    }


    /**
     * Sets the onlyunicastrtadvresponse value for this Nd6Ravariables.
     * 
     * @param onlyunicastrtadvresponse
     */
    public void setOnlyunicastrtadvresponse(java.lang.String onlyunicastrtadvresponse) {
        this.onlyunicastrtadvresponse = onlyunicastrtadvresponse;
    }


    /**
     * Gets the managedaddrconfig value for this Nd6Ravariables.
     * 
     * @return managedaddrconfig
     */
    public java.lang.String getManagedaddrconfig() {
        return managedaddrconfig;
    }


    /**
     * Sets the managedaddrconfig value for this Nd6Ravariables.
     * 
     * @param managedaddrconfig
     */
    public void setManagedaddrconfig(java.lang.String managedaddrconfig) {
        this.managedaddrconfig = managedaddrconfig;
    }


    /**
     * Gets the otheraddrconfig value for this Nd6Ravariables.
     * 
     * @return otheraddrconfig
     */
    public java.lang.String getOtheraddrconfig() {
        return otheraddrconfig;
    }


    /**
     * Sets the otheraddrconfig value for this Nd6Ravariables.
     * 
     * @param otheraddrconfig
     */
    public void setOtheraddrconfig(java.lang.String otheraddrconfig) {
        this.otheraddrconfig = otheraddrconfig;
    }


    /**
     * Gets the currhoplimit value for this Nd6Ravariables.
     * 
     * @return currhoplimit
     */
    public org.apache.axis.types.UnsignedInt getCurrhoplimit() {
        return currhoplimit;
    }


    /**
     * Sets the currhoplimit value for this Nd6Ravariables.
     * 
     * @param currhoplimit
     */
    public void setCurrhoplimit(org.apache.axis.types.UnsignedInt currhoplimit) {
        this.currhoplimit = currhoplimit;
    }


    /**
     * Gets the maxrtadvinterval value for this Nd6Ravariables.
     * 
     * @return maxrtadvinterval
     */
    public org.apache.axis.types.UnsignedInt getMaxrtadvinterval() {
        return maxrtadvinterval;
    }


    /**
     * Sets the maxrtadvinterval value for this Nd6Ravariables.
     * 
     * @param maxrtadvinterval
     */
    public void setMaxrtadvinterval(org.apache.axis.types.UnsignedInt maxrtadvinterval) {
        this.maxrtadvinterval = maxrtadvinterval;
    }


    /**
     * Gets the minrtadvinterval value for this Nd6Ravariables.
     * 
     * @return minrtadvinterval
     */
    public org.apache.axis.types.UnsignedInt getMinrtadvinterval() {
        return minrtadvinterval;
    }


    /**
     * Sets the minrtadvinterval value for this Nd6Ravariables.
     * 
     * @param minrtadvinterval
     */
    public void setMinrtadvinterval(org.apache.axis.types.UnsignedInt minrtadvinterval) {
        this.minrtadvinterval = minrtadvinterval;
    }


    /**
     * Gets the linkmtu value for this Nd6Ravariables.
     * 
     * @return linkmtu
     */
    public org.apache.axis.types.UnsignedInt getLinkmtu() {
        return linkmtu;
    }


    /**
     * Sets the linkmtu value for this Nd6Ravariables.
     * 
     * @param linkmtu
     */
    public void setLinkmtu(org.apache.axis.types.UnsignedInt linkmtu) {
        this.linkmtu = linkmtu;
    }


    /**
     * Gets the reachabletime value for this Nd6Ravariables.
     * 
     * @return reachabletime
     */
    public org.apache.axis.types.UnsignedInt getReachabletime() {
        return reachabletime;
    }


    /**
     * Sets the reachabletime value for this Nd6Ravariables.
     * 
     * @param reachabletime
     */
    public void setReachabletime(org.apache.axis.types.UnsignedInt reachabletime) {
        this.reachabletime = reachabletime;
    }


    /**
     * Gets the retranstime value for this Nd6Ravariables.
     * 
     * @return retranstime
     */
    public org.apache.axis.types.UnsignedInt getRetranstime() {
        return retranstime;
    }


    /**
     * Sets the retranstime value for this Nd6Ravariables.
     * 
     * @param retranstime
     */
    public void setRetranstime(org.apache.axis.types.UnsignedInt retranstime) {
        this.retranstime = retranstime;
    }


    /**
     * Gets the defaultlifetime value for this Nd6Ravariables.
     * 
     * @return defaultlifetime
     */
    public int getDefaultlifetime() {
        return defaultlifetime;
    }


    /**
     * Sets the defaultlifetime value for this Nd6Ravariables.
     * 
     * @param defaultlifetime
     */
    public void setDefaultlifetime(int defaultlifetime) {
        this.defaultlifetime = defaultlifetime;
    }


    /**
     * Gets the lastrtadvtime value for this Nd6Ravariables.
     * 
     * @return lastrtadvtime
     */
    public org.apache.axis.types.UnsignedInt getLastrtadvtime() {
        return lastrtadvtime;
    }


    /**
     * Sets the lastrtadvtime value for this Nd6Ravariables.
     * 
     * @param lastrtadvtime
     */
    public void setLastrtadvtime(org.apache.axis.types.UnsignedInt lastrtadvtime) {
        this.lastrtadvtime = lastrtadvtime;
    }


    /**
     * Gets the nextrtadvdelay value for this Nd6Ravariables.
     * 
     * @return nextrtadvdelay
     */
    public org.apache.axis.types.UnsignedInt getNextrtadvdelay() {
        return nextrtadvdelay;
    }


    /**
     * Sets the nextrtadvdelay value for this Nd6Ravariables.
     * 
     * @param nextrtadvdelay
     */
    public void setNextrtadvdelay(org.apache.axis.types.UnsignedInt nextrtadvdelay) {
        this.nextrtadvdelay = nextrtadvdelay;
    }


    /**
     * Gets the ipv6Prefix value for this Nd6Ravariables.
     * 
     * @return ipv6Prefix
     */
    public java.lang.String[] getIpv6Prefix() {
        return ipv6Prefix;
    }


    /**
     * Sets the ipv6Prefix value for this Nd6Ravariables.
     * 
     * @param ipv6Prefix
     */
    public void setIpv6Prefix(java.lang.String[] ipv6Prefix) {
        this.ipv6Prefix = ipv6Prefix;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Nd6Ravariables)) return false;
        Nd6Ravariables other = (Nd6Ravariables) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.vlan==null && other.getVlan()==null) || 
             (this.vlan!=null &&
              this.vlan.equals(other.getVlan()))) &&
            ((this.ceaserouteradv==null && other.getCeaserouteradv()==null) || 
             (this.ceaserouteradv!=null &&
              this.ceaserouteradv.equals(other.getCeaserouteradv()))) &&
            ((this.sendrouteradv==null && other.getSendrouteradv()==null) || 
             (this.sendrouteradv!=null &&
              this.sendrouteradv.equals(other.getSendrouteradv()))) &&
            ((this.srclinklayeraddroption==null && other.getSrclinklayeraddroption()==null) || 
             (this.srclinklayeraddroption!=null &&
              this.srclinklayeraddroption.equals(other.getSrclinklayeraddroption()))) &&
            ((this.onlyunicastrtadvresponse==null && other.getOnlyunicastrtadvresponse()==null) || 
             (this.onlyunicastrtadvresponse!=null &&
              this.onlyunicastrtadvresponse.equals(other.getOnlyunicastrtadvresponse()))) &&
            ((this.managedaddrconfig==null && other.getManagedaddrconfig()==null) || 
             (this.managedaddrconfig!=null &&
              this.managedaddrconfig.equals(other.getManagedaddrconfig()))) &&
            ((this.otheraddrconfig==null && other.getOtheraddrconfig()==null) || 
             (this.otheraddrconfig!=null &&
              this.otheraddrconfig.equals(other.getOtheraddrconfig()))) &&
            ((this.currhoplimit==null && other.getCurrhoplimit()==null) || 
             (this.currhoplimit!=null &&
              this.currhoplimit.equals(other.getCurrhoplimit()))) &&
            ((this.maxrtadvinterval==null && other.getMaxrtadvinterval()==null) || 
             (this.maxrtadvinterval!=null &&
              this.maxrtadvinterval.equals(other.getMaxrtadvinterval()))) &&
            ((this.minrtadvinterval==null && other.getMinrtadvinterval()==null) || 
             (this.minrtadvinterval!=null &&
              this.minrtadvinterval.equals(other.getMinrtadvinterval()))) &&
            ((this.linkmtu==null && other.getLinkmtu()==null) || 
             (this.linkmtu!=null &&
              this.linkmtu.equals(other.getLinkmtu()))) &&
            ((this.reachabletime==null && other.getReachabletime()==null) || 
             (this.reachabletime!=null &&
              this.reachabletime.equals(other.getReachabletime()))) &&
            ((this.retranstime==null && other.getRetranstime()==null) || 
             (this.retranstime!=null &&
              this.retranstime.equals(other.getRetranstime()))) &&
            this.defaultlifetime == other.getDefaultlifetime() &&
            ((this.lastrtadvtime==null && other.getLastrtadvtime()==null) || 
             (this.lastrtadvtime!=null &&
              this.lastrtadvtime.equals(other.getLastrtadvtime()))) &&
            ((this.nextrtadvdelay==null && other.getNextrtadvdelay()==null) || 
             (this.nextrtadvdelay!=null &&
              this.nextrtadvdelay.equals(other.getNextrtadvdelay()))) &&
            ((this.ipv6Prefix==null && other.getIpv6Prefix()==null) || 
             (this.ipv6Prefix!=null &&
              java.util.Arrays.equals(this.ipv6Prefix, other.getIpv6Prefix())));
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
        if (getVlan() != null) {
            _hashCode += getVlan().hashCode();
        }
        if (getCeaserouteradv() != null) {
            _hashCode += getCeaserouteradv().hashCode();
        }
        if (getSendrouteradv() != null) {
            _hashCode += getSendrouteradv().hashCode();
        }
        if (getSrclinklayeraddroption() != null) {
            _hashCode += getSrclinklayeraddroption().hashCode();
        }
        if (getOnlyunicastrtadvresponse() != null) {
            _hashCode += getOnlyunicastrtadvresponse().hashCode();
        }
        if (getManagedaddrconfig() != null) {
            _hashCode += getManagedaddrconfig().hashCode();
        }
        if (getOtheraddrconfig() != null) {
            _hashCode += getOtheraddrconfig().hashCode();
        }
        if (getCurrhoplimit() != null) {
            _hashCode += getCurrhoplimit().hashCode();
        }
        if (getMaxrtadvinterval() != null) {
            _hashCode += getMaxrtadvinterval().hashCode();
        }
        if (getMinrtadvinterval() != null) {
            _hashCode += getMinrtadvinterval().hashCode();
        }
        if (getLinkmtu() != null) {
            _hashCode += getLinkmtu().hashCode();
        }
        if (getReachabletime() != null) {
            _hashCode += getReachabletime().hashCode();
        }
        if (getRetranstime() != null) {
            _hashCode += getRetranstime().hashCode();
        }
        _hashCode += getDefaultlifetime();
        if (getLastrtadvtime() != null) {
            _hashCode += getLastrtadvtime().hashCode();
        }
        if (getNextrtadvdelay() != null) {
            _hashCode += getNextrtadvdelay().hashCode();
        }
        if (getIpv6Prefix() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpv6Prefix());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpv6Prefix(), i);
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
        new org.apache.axis.description.TypeDesc(Nd6Ravariables.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "nd6ravariables"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ceaserouteradv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ceaserouteradv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendrouteradv");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sendrouteradv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("srclinklayeraddroption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "srclinklayeraddroption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlyunicastrtadvresponse");
        elemField.setXmlName(new javax.xml.namespace.QName("", "onlyunicastrtadvresponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("managedaddrconfig");
        elemField.setXmlName(new javax.xml.namespace.QName("", "managedaddrconfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otheraddrconfig");
        elemField.setXmlName(new javax.xml.namespace.QName("", "otheraddrconfig"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currhoplimit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currhoplimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxrtadvinterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxrtadvinterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minrtadvinterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minrtadvinterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkmtu");
        elemField.setXmlName(new javax.xml.namespace.QName("", "linkmtu"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reachabletime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reachabletime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retranstime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "retranstime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("defaultlifetime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "defaultlifetime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastrtadvtime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastrtadvtime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextrtadvdelay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nextrtadvdelay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipv6Prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipv6prefix"));
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
