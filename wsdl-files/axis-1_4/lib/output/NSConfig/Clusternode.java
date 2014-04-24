/**
 * Clusternode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Clusternode  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt nodeid;

    private java.lang.String ipaddress;

    private java.lang.String clusterhealth;

    private java.lang.String effectivestate;

    private java.lang.String operationalsyncstate;

    private java.lang.String masterstate;

    private java.lang.String health;

    private java.lang.String state;

    private java.lang.String backplane;

    private org.apache.axis.types.UnsignedInt priority;

    private boolean isconfigurationcoordinator;

    private boolean islocalnode;

    private boolean nodersskeymismatch;

    private boolean nodelicensemismatch;

    private org.apache.axis.types.UnsignedInt[] nodelist;

    private java.lang.String[] ifaceslist;

    private java.lang.String enabledifaces;

    private java.lang.String disabledifaces;

    private java.lang.String partialfailifaces;

    private java.lang.String hamonifaces;

    public Clusternode() {
    }

    public Clusternode(
           org.apache.axis.types.UnsignedInt nodeid,
           java.lang.String ipaddress,
           java.lang.String clusterhealth,
           java.lang.String effectivestate,
           java.lang.String operationalsyncstate,
           java.lang.String masterstate,
           java.lang.String health,
           java.lang.String state,
           java.lang.String backplane,
           org.apache.axis.types.UnsignedInt priority,
           boolean isconfigurationcoordinator,
           boolean islocalnode,
           boolean nodersskeymismatch,
           boolean nodelicensemismatch,
           org.apache.axis.types.UnsignedInt[] nodelist,
           java.lang.String[] ifaceslist,
           java.lang.String enabledifaces,
           java.lang.String disabledifaces,
           java.lang.String partialfailifaces,
           java.lang.String hamonifaces) {
           this.nodeid = nodeid;
           this.ipaddress = ipaddress;
           this.clusterhealth = clusterhealth;
           this.effectivestate = effectivestate;
           this.operationalsyncstate = operationalsyncstate;
           this.masterstate = masterstate;
           this.health = health;
           this.state = state;
           this.backplane = backplane;
           this.priority = priority;
           this.isconfigurationcoordinator = isconfigurationcoordinator;
           this.islocalnode = islocalnode;
           this.nodersskeymismatch = nodersskeymismatch;
           this.nodelicensemismatch = nodelicensemismatch;
           this.nodelist = nodelist;
           this.ifaceslist = ifaceslist;
           this.enabledifaces = enabledifaces;
           this.disabledifaces = disabledifaces;
           this.partialfailifaces = partialfailifaces;
           this.hamonifaces = hamonifaces;
    }


    /**
     * Gets the nodeid value for this Clusternode.
     * 
     * @return nodeid
     */
    public org.apache.axis.types.UnsignedInt getNodeid() {
        return nodeid;
    }


    /**
     * Sets the nodeid value for this Clusternode.
     * 
     * @param nodeid
     */
    public void setNodeid(org.apache.axis.types.UnsignedInt nodeid) {
        this.nodeid = nodeid;
    }


    /**
     * Gets the ipaddress value for this Clusternode.
     * 
     * @return ipaddress
     */
    public java.lang.String getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Clusternode.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the clusterhealth value for this Clusternode.
     * 
     * @return clusterhealth
     */
    public java.lang.String getClusterhealth() {
        return clusterhealth;
    }


    /**
     * Sets the clusterhealth value for this Clusternode.
     * 
     * @param clusterhealth
     */
    public void setClusterhealth(java.lang.String clusterhealth) {
        this.clusterhealth = clusterhealth;
    }


    /**
     * Gets the effectivestate value for this Clusternode.
     * 
     * @return effectivestate
     */
    public java.lang.String getEffectivestate() {
        return effectivestate;
    }


    /**
     * Sets the effectivestate value for this Clusternode.
     * 
     * @param effectivestate
     */
    public void setEffectivestate(java.lang.String effectivestate) {
        this.effectivestate = effectivestate;
    }


    /**
     * Gets the operationalsyncstate value for this Clusternode.
     * 
     * @return operationalsyncstate
     */
    public java.lang.String getOperationalsyncstate() {
        return operationalsyncstate;
    }


    /**
     * Sets the operationalsyncstate value for this Clusternode.
     * 
     * @param operationalsyncstate
     */
    public void setOperationalsyncstate(java.lang.String operationalsyncstate) {
        this.operationalsyncstate = operationalsyncstate;
    }


    /**
     * Gets the masterstate value for this Clusternode.
     * 
     * @return masterstate
     */
    public java.lang.String getMasterstate() {
        return masterstate;
    }


    /**
     * Sets the masterstate value for this Clusternode.
     * 
     * @param masterstate
     */
    public void setMasterstate(java.lang.String masterstate) {
        this.masterstate = masterstate;
    }


    /**
     * Gets the health value for this Clusternode.
     * 
     * @return health
     */
    public java.lang.String getHealth() {
        return health;
    }


    /**
     * Sets the health value for this Clusternode.
     * 
     * @param health
     */
    public void setHealth(java.lang.String health) {
        this.health = health;
    }


    /**
     * Gets the state value for this Clusternode.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Clusternode.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the backplane value for this Clusternode.
     * 
     * @return backplane
     */
    public java.lang.String getBackplane() {
        return backplane;
    }


    /**
     * Sets the backplane value for this Clusternode.
     * 
     * @param backplane
     */
    public void setBackplane(java.lang.String backplane) {
        this.backplane = backplane;
    }


    /**
     * Gets the priority value for this Clusternode.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Clusternode.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the isconfigurationcoordinator value for this Clusternode.
     * 
     * @return isconfigurationcoordinator
     */
    public boolean isIsconfigurationcoordinator() {
        return isconfigurationcoordinator;
    }


    /**
     * Sets the isconfigurationcoordinator value for this Clusternode.
     * 
     * @param isconfigurationcoordinator
     */
    public void setIsconfigurationcoordinator(boolean isconfigurationcoordinator) {
        this.isconfigurationcoordinator = isconfigurationcoordinator;
    }


    /**
     * Gets the islocalnode value for this Clusternode.
     * 
     * @return islocalnode
     */
    public boolean isIslocalnode() {
        return islocalnode;
    }


    /**
     * Sets the islocalnode value for this Clusternode.
     * 
     * @param islocalnode
     */
    public void setIslocalnode(boolean islocalnode) {
        this.islocalnode = islocalnode;
    }


    /**
     * Gets the nodersskeymismatch value for this Clusternode.
     * 
     * @return nodersskeymismatch
     */
    public boolean isNodersskeymismatch() {
        return nodersskeymismatch;
    }


    /**
     * Sets the nodersskeymismatch value for this Clusternode.
     * 
     * @param nodersskeymismatch
     */
    public void setNodersskeymismatch(boolean nodersskeymismatch) {
        this.nodersskeymismatch = nodersskeymismatch;
    }


    /**
     * Gets the nodelicensemismatch value for this Clusternode.
     * 
     * @return nodelicensemismatch
     */
    public boolean isNodelicensemismatch() {
        return nodelicensemismatch;
    }


    /**
     * Sets the nodelicensemismatch value for this Clusternode.
     * 
     * @param nodelicensemismatch
     */
    public void setNodelicensemismatch(boolean nodelicensemismatch) {
        this.nodelicensemismatch = nodelicensemismatch;
    }


    /**
     * Gets the nodelist value for this Clusternode.
     * 
     * @return nodelist
     */
    public org.apache.axis.types.UnsignedInt[] getNodelist() {
        return nodelist;
    }


    /**
     * Sets the nodelist value for this Clusternode.
     * 
     * @param nodelist
     */
    public void setNodelist(org.apache.axis.types.UnsignedInt[] nodelist) {
        this.nodelist = nodelist;
    }


    /**
     * Gets the ifaceslist value for this Clusternode.
     * 
     * @return ifaceslist
     */
    public java.lang.String[] getIfaceslist() {
        return ifaceslist;
    }


    /**
     * Sets the ifaceslist value for this Clusternode.
     * 
     * @param ifaceslist
     */
    public void setIfaceslist(java.lang.String[] ifaceslist) {
        this.ifaceslist = ifaceslist;
    }


    /**
     * Gets the enabledifaces value for this Clusternode.
     * 
     * @return enabledifaces
     */
    public java.lang.String getEnabledifaces() {
        return enabledifaces;
    }


    /**
     * Sets the enabledifaces value for this Clusternode.
     * 
     * @param enabledifaces
     */
    public void setEnabledifaces(java.lang.String enabledifaces) {
        this.enabledifaces = enabledifaces;
    }


    /**
     * Gets the disabledifaces value for this Clusternode.
     * 
     * @return disabledifaces
     */
    public java.lang.String getDisabledifaces() {
        return disabledifaces;
    }


    /**
     * Sets the disabledifaces value for this Clusternode.
     * 
     * @param disabledifaces
     */
    public void setDisabledifaces(java.lang.String disabledifaces) {
        this.disabledifaces = disabledifaces;
    }


    /**
     * Gets the partialfailifaces value for this Clusternode.
     * 
     * @return partialfailifaces
     */
    public java.lang.String getPartialfailifaces() {
        return partialfailifaces;
    }


    /**
     * Sets the partialfailifaces value for this Clusternode.
     * 
     * @param partialfailifaces
     */
    public void setPartialfailifaces(java.lang.String partialfailifaces) {
        this.partialfailifaces = partialfailifaces;
    }


    /**
     * Gets the hamonifaces value for this Clusternode.
     * 
     * @return hamonifaces
     */
    public java.lang.String getHamonifaces() {
        return hamonifaces;
    }


    /**
     * Sets the hamonifaces value for this Clusternode.
     * 
     * @param hamonifaces
     */
    public void setHamonifaces(java.lang.String hamonifaces) {
        this.hamonifaces = hamonifaces;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Clusternode)) return false;
        Clusternode other = (Clusternode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nodeid==null && other.getNodeid()==null) || 
             (this.nodeid!=null &&
              this.nodeid.equals(other.getNodeid()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              this.ipaddress.equals(other.getIpaddress()))) &&
            ((this.clusterhealth==null && other.getClusterhealth()==null) || 
             (this.clusterhealth!=null &&
              this.clusterhealth.equals(other.getClusterhealth()))) &&
            ((this.effectivestate==null && other.getEffectivestate()==null) || 
             (this.effectivestate!=null &&
              this.effectivestate.equals(other.getEffectivestate()))) &&
            ((this.operationalsyncstate==null && other.getOperationalsyncstate()==null) || 
             (this.operationalsyncstate!=null &&
              this.operationalsyncstate.equals(other.getOperationalsyncstate()))) &&
            ((this.masterstate==null && other.getMasterstate()==null) || 
             (this.masterstate!=null &&
              this.masterstate.equals(other.getMasterstate()))) &&
            ((this.health==null && other.getHealth()==null) || 
             (this.health!=null &&
              this.health.equals(other.getHealth()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.backplane==null && other.getBackplane()==null) || 
             (this.backplane!=null &&
              this.backplane.equals(other.getBackplane()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            this.isconfigurationcoordinator == other.isIsconfigurationcoordinator() &&
            this.islocalnode == other.isIslocalnode() &&
            this.nodersskeymismatch == other.isNodersskeymismatch() &&
            this.nodelicensemismatch == other.isNodelicensemismatch() &&
            ((this.nodelist==null && other.getNodelist()==null) || 
             (this.nodelist!=null &&
              java.util.Arrays.equals(this.nodelist, other.getNodelist()))) &&
            ((this.ifaceslist==null && other.getIfaceslist()==null) || 
             (this.ifaceslist!=null &&
              java.util.Arrays.equals(this.ifaceslist, other.getIfaceslist()))) &&
            ((this.enabledifaces==null && other.getEnabledifaces()==null) || 
             (this.enabledifaces!=null &&
              this.enabledifaces.equals(other.getEnabledifaces()))) &&
            ((this.disabledifaces==null && other.getDisabledifaces()==null) || 
             (this.disabledifaces!=null &&
              this.disabledifaces.equals(other.getDisabledifaces()))) &&
            ((this.partialfailifaces==null && other.getPartialfailifaces()==null) || 
             (this.partialfailifaces!=null &&
              this.partialfailifaces.equals(other.getPartialfailifaces()))) &&
            ((this.hamonifaces==null && other.getHamonifaces()==null) || 
             (this.hamonifaces!=null &&
              this.hamonifaces.equals(other.getHamonifaces())));
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
        if (getNodeid() != null) {
            _hashCode += getNodeid().hashCode();
        }
        if (getIpaddress() != null) {
            _hashCode += getIpaddress().hashCode();
        }
        if (getClusterhealth() != null) {
            _hashCode += getClusterhealth().hashCode();
        }
        if (getEffectivestate() != null) {
            _hashCode += getEffectivestate().hashCode();
        }
        if (getOperationalsyncstate() != null) {
            _hashCode += getOperationalsyncstate().hashCode();
        }
        if (getMasterstate() != null) {
            _hashCode += getMasterstate().hashCode();
        }
        if (getHealth() != null) {
            _hashCode += getHealth().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getBackplane() != null) {
            _hashCode += getBackplane().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        _hashCode += (isIsconfigurationcoordinator() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIslocalnode() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNodersskeymismatch() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isNodelicensemismatch() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNodelist() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNodelist());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNodelist(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIfaceslist() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIfaceslist());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIfaceslist(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEnabledifaces() != null) {
            _hashCode += getEnabledifaces().hashCode();
        }
        if (getDisabledifaces() != null) {
            _hashCode += getDisabledifaces().hashCode();
        }
        if (getPartialfailifaces() != null) {
            _hashCode += getPartialfailifaces().hashCode();
        }
        if (getHamonifaces() != null) {
            _hashCode += getHamonifaces().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Clusternode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "clusternode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodeid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nodeid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ipaddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ipaddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusterhealth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clusterhealth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("effectivestate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "effectivestate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationalsyncstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operationalsyncstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "masterstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("health");
        elemField.setXmlName(new javax.xml.namespace.QName("", "health"));
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
        elemField.setFieldName("backplane");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backplane"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isconfigurationcoordinator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isconfigurationcoordinator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("islocalnode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "islocalnode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodersskeymismatch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nodersskeymismatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodelicensemismatch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nodelicensemismatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodelist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nodelist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ifaceslist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ifaceslist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("enabledifaces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "enabledifaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disabledifaces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disabledifaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partialfailifaces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partialfailifaces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hamonifaces");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hamonifaces"));
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
