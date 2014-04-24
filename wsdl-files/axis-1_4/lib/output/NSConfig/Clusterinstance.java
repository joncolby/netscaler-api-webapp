/**
 * Clusterinstance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Clusterinstance  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedInt clid;

    private org.apache.axis.types.UnsignedInt deadinterval;

    private org.apache.axis.types.UnsignedInt hellointerval;

    private java.lang.String preemption;

    private java.lang.String adminstate;

    private java.lang.String propstate;

    private org.apache.axis.types.UnsignedInt[] nodeid;

    private java.lang.String[] ipaddress;

    private java.lang.String[] masterstate;

    private java.lang.String[] health;

    private java.lang.String[] clusterhealth;

    private java.lang.String[] effectivestate;

    private java.lang.String[] state;

    private java.lang.String operationalstate;

    private java.lang.String status;

    private boolean[] isconfigurationcoordinator;

    private boolean[] islocalnode;

    private boolean rsskeymismatch;

    private boolean licensemismatch;

    private boolean[] nodersskeymismatch;

    private boolean[] nodelicensemismatch;

    private java.lang.String operationalpropstate;

    public Clusterinstance() {
    }

    public Clusterinstance(
           org.apache.axis.types.UnsignedInt clid,
           org.apache.axis.types.UnsignedInt deadinterval,
           org.apache.axis.types.UnsignedInt hellointerval,
           java.lang.String preemption,
           java.lang.String adminstate,
           java.lang.String propstate,
           org.apache.axis.types.UnsignedInt[] nodeid,
           java.lang.String[] ipaddress,
           java.lang.String[] masterstate,
           java.lang.String[] health,
           java.lang.String[] clusterhealth,
           java.lang.String[] effectivestate,
           java.lang.String[] state,
           java.lang.String operationalstate,
           java.lang.String status,
           boolean[] isconfigurationcoordinator,
           boolean[] islocalnode,
           boolean rsskeymismatch,
           boolean licensemismatch,
           boolean[] nodersskeymismatch,
           boolean[] nodelicensemismatch,
           java.lang.String operationalpropstate) {
           this.clid = clid;
           this.deadinterval = deadinterval;
           this.hellointerval = hellointerval;
           this.preemption = preemption;
           this.adminstate = adminstate;
           this.propstate = propstate;
           this.nodeid = nodeid;
           this.ipaddress = ipaddress;
           this.masterstate = masterstate;
           this.health = health;
           this.clusterhealth = clusterhealth;
           this.effectivestate = effectivestate;
           this.state = state;
           this.operationalstate = operationalstate;
           this.status = status;
           this.isconfigurationcoordinator = isconfigurationcoordinator;
           this.islocalnode = islocalnode;
           this.rsskeymismatch = rsskeymismatch;
           this.licensemismatch = licensemismatch;
           this.nodersskeymismatch = nodersskeymismatch;
           this.nodelicensemismatch = nodelicensemismatch;
           this.operationalpropstate = operationalpropstate;
    }


    /**
     * Gets the clid value for this Clusterinstance.
     * 
     * @return clid
     */
    public org.apache.axis.types.UnsignedInt getClid() {
        return clid;
    }


    /**
     * Sets the clid value for this Clusterinstance.
     * 
     * @param clid
     */
    public void setClid(org.apache.axis.types.UnsignedInt clid) {
        this.clid = clid;
    }


    /**
     * Gets the deadinterval value for this Clusterinstance.
     * 
     * @return deadinterval
     */
    public org.apache.axis.types.UnsignedInt getDeadinterval() {
        return deadinterval;
    }


    /**
     * Sets the deadinterval value for this Clusterinstance.
     * 
     * @param deadinterval
     */
    public void setDeadinterval(org.apache.axis.types.UnsignedInt deadinterval) {
        this.deadinterval = deadinterval;
    }


    /**
     * Gets the hellointerval value for this Clusterinstance.
     * 
     * @return hellointerval
     */
    public org.apache.axis.types.UnsignedInt getHellointerval() {
        return hellointerval;
    }


    /**
     * Sets the hellointerval value for this Clusterinstance.
     * 
     * @param hellointerval
     */
    public void setHellointerval(org.apache.axis.types.UnsignedInt hellointerval) {
        this.hellointerval = hellointerval;
    }


    /**
     * Gets the preemption value for this Clusterinstance.
     * 
     * @return preemption
     */
    public java.lang.String getPreemption() {
        return preemption;
    }


    /**
     * Sets the preemption value for this Clusterinstance.
     * 
     * @param preemption
     */
    public void setPreemption(java.lang.String preemption) {
        this.preemption = preemption;
    }


    /**
     * Gets the adminstate value for this Clusterinstance.
     * 
     * @return adminstate
     */
    public java.lang.String getAdminstate() {
        return adminstate;
    }


    /**
     * Sets the adminstate value for this Clusterinstance.
     * 
     * @param adminstate
     */
    public void setAdminstate(java.lang.String adminstate) {
        this.adminstate = adminstate;
    }


    /**
     * Gets the propstate value for this Clusterinstance.
     * 
     * @return propstate
     */
    public java.lang.String getPropstate() {
        return propstate;
    }


    /**
     * Sets the propstate value for this Clusterinstance.
     * 
     * @param propstate
     */
    public void setPropstate(java.lang.String propstate) {
        this.propstate = propstate;
    }


    /**
     * Gets the nodeid value for this Clusterinstance.
     * 
     * @return nodeid
     */
    public org.apache.axis.types.UnsignedInt[] getNodeid() {
        return nodeid;
    }


    /**
     * Sets the nodeid value for this Clusterinstance.
     * 
     * @param nodeid
     */
    public void setNodeid(org.apache.axis.types.UnsignedInt[] nodeid) {
        this.nodeid = nodeid;
    }


    /**
     * Gets the ipaddress value for this Clusterinstance.
     * 
     * @return ipaddress
     */
    public java.lang.String[] getIpaddress() {
        return ipaddress;
    }


    /**
     * Sets the ipaddress value for this Clusterinstance.
     * 
     * @param ipaddress
     */
    public void setIpaddress(java.lang.String[] ipaddress) {
        this.ipaddress = ipaddress;
    }


    /**
     * Gets the masterstate value for this Clusterinstance.
     * 
     * @return masterstate
     */
    public java.lang.String[] getMasterstate() {
        return masterstate;
    }


    /**
     * Sets the masterstate value for this Clusterinstance.
     * 
     * @param masterstate
     */
    public void setMasterstate(java.lang.String[] masterstate) {
        this.masterstate = masterstate;
    }


    /**
     * Gets the health value for this Clusterinstance.
     * 
     * @return health
     */
    public java.lang.String[] getHealth() {
        return health;
    }


    /**
     * Sets the health value for this Clusterinstance.
     * 
     * @param health
     */
    public void setHealth(java.lang.String[] health) {
        this.health = health;
    }


    /**
     * Gets the clusterhealth value for this Clusterinstance.
     * 
     * @return clusterhealth
     */
    public java.lang.String[] getClusterhealth() {
        return clusterhealth;
    }


    /**
     * Sets the clusterhealth value for this Clusterinstance.
     * 
     * @param clusterhealth
     */
    public void setClusterhealth(java.lang.String[] clusterhealth) {
        this.clusterhealth = clusterhealth;
    }


    /**
     * Gets the effectivestate value for this Clusterinstance.
     * 
     * @return effectivestate
     */
    public java.lang.String[] getEffectivestate() {
        return effectivestate;
    }


    /**
     * Sets the effectivestate value for this Clusterinstance.
     * 
     * @param effectivestate
     */
    public void setEffectivestate(java.lang.String[] effectivestate) {
        this.effectivestate = effectivestate;
    }


    /**
     * Gets the state value for this Clusterinstance.
     * 
     * @return state
     */
    public java.lang.String[] getState() {
        return state;
    }


    /**
     * Sets the state value for this Clusterinstance.
     * 
     * @param state
     */
    public void setState(java.lang.String[] state) {
        this.state = state;
    }


    /**
     * Gets the operationalstate value for this Clusterinstance.
     * 
     * @return operationalstate
     */
    public java.lang.String getOperationalstate() {
        return operationalstate;
    }


    /**
     * Sets the operationalstate value for this Clusterinstance.
     * 
     * @param operationalstate
     */
    public void setOperationalstate(java.lang.String operationalstate) {
        this.operationalstate = operationalstate;
    }


    /**
     * Gets the status value for this Clusterinstance.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Clusterinstance.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the isconfigurationcoordinator value for this Clusterinstance.
     * 
     * @return isconfigurationcoordinator
     */
    public boolean[] getIsconfigurationcoordinator() {
        return isconfigurationcoordinator;
    }


    /**
     * Sets the isconfigurationcoordinator value for this Clusterinstance.
     * 
     * @param isconfigurationcoordinator
     */
    public void setIsconfigurationcoordinator(boolean[] isconfigurationcoordinator) {
        this.isconfigurationcoordinator = isconfigurationcoordinator;
    }


    /**
     * Gets the islocalnode value for this Clusterinstance.
     * 
     * @return islocalnode
     */
    public boolean[] getIslocalnode() {
        return islocalnode;
    }


    /**
     * Sets the islocalnode value for this Clusterinstance.
     * 
     * @param islocalnode
     */
    public void setIslocalnode(boolean[] islocalnode) {
        this.islocalnode = islocalnode;
    }


    /**
     * Gets the rsskeymismatch value for this Clusterinstance.
     * 
     * @return rsskeymismatch
     */
    public boolean isRsskeymismatch() {
        return rsskeymismatch;
    }


    /**
     * Sets the rsskeymismatch value for this Clusterinstance.
     * 
     * @param rsskeymismatch
     */
    public void setRsskeymismatch(boolean rsskeymismatch) {
        this.rsskeymismatch = rsskeymismatch;
    }


    /**
     * Gets the licensemismatch value for this Clusterinstance.
     * 
     * @return licensemismatch
     */
    public boolean isLicensemismatch() {
        return licensemismatch;
    }


    /**
     * Sets the licensemismatch value for this Clusterinstance.
     * 
     * @param licensemismatch
     */
    public void setLicensemismatch(boolean licensemismatch) {
        this.licensemismatch = licensemismatch;
    }


    /**
     * Gets the nodersskeymismatch value for this Clusterinstance.
     * 
     * @return nodersskeymismatch
     */
    public boolean[] getNodersskeymismatch() {
        return nodersskeymismatch;
    }


    /**
     * Sets the nodersskeymismatch value for this Clusterinstance.
     * 
     * @param nodersskeymismatch
     */
    public void setNodersskeymismatch(boolean[] nodersskeymismatch) {
        this.nodersskeymismatch = nodersskeymismatch;
    }


    /**
     * Gets the nodelicensemismatch value for this Clusterinstance.
     * 
     * @return nodelicensemismatch
     */
    public boolean[] getNodelicensemismatch() {
        return nodelicensemismatch;
    }


    /**
     * Sets the nodelicensemismatch value for this Clusterinstance.
     * 
     * @param nodelicensemismatch
     */
    public void setNodelicensemismatch(boolean[] nodelicensemismatch) {
        this.nodelicensemismatch = nodelicensemismatch;
    }


    /**
     * Gets the operationalpropstate value for this Clusterinstance.
     * 
     * @return operationalpropstate
     */
    public java.lang.String getOperationalpropstate() {
        return operationalpropstate;
    }


    /**
     * Sets the operationalpropstate value for this Clusterinstance.
     * 
     * @param operationalpropstate
     */
    public void setOperationalpropstate(java.lang.String operationalpropstate) {
        this.operationalpropstate = operationalpropstate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Clusterinstance)) return false;
        Clusterinstance other = (Clusterinstance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.clid==null && other.getClid()==null) || 
             (this.clid!=null &&
              this.clid.equals(other.getClid()))) &&
            ((this.deadinterval==null && other.getDeadinterval()==null) || 
             (this.deadinterval!=null &&
              this.deadinterval.equals(other.getDeadinterval()))) &&
            ((this.hellointerval==null && other.getHellointerval()==null) || 
             (this.hellointerval!=null &&
              this.hellointerval.equals(other.getHellointerval()))) &&
            ((this.preemption==null && other.getPreemption()==null) || 
             (this.preemption!=null &&
              this.preemption.equals(other.getPreemption()))) &&
            ((this.adminstate==null && other.getAdminstate()==null) || 
             (this.adminstate!=null &&
              this.adminstate.equals(other.getAdminstate()))) &&
            ((this.propstate==null && other.getPropstate()==null) || 
             (this.propstate!=null &&
              this.propstate.equals(other.getPropstate()))) &&
            ((this.nodeid==null && other.getNodeid()==null) || 
             (this.nodeid!=null &&
              java.util.Arrays.equals(this.nodeid, other.getNodeid()))) &&
            ((this.ipaddress==null && other.getIpaddress()==null) || 
             (this.ipaddress!=null &&
              java.util.Arrays.equals(this.ipaddress, other.getIpaddress()))) &&
            ((this.masterstate==null && other.getMasterstate()==null) || 
             (this.masterstate!=null &&
              java.util.Arrays.equals(this.masterstate, other.getMasterstate()))) &&
            ((this.health==null && other.getHealth()==null) || 
             (this.health!=null &&
              java.util.Arrays.equals(this.health, other.getHealth()))) &&
            ((this.clusterhealth==null && other.getClusterhealth()==null) || 
             (this.clusterhealth!=null &&
              java.util.Arrays.equals(this.clusterhealth, other.getClusterhealth()))) &&
            ((this.effectivestate==null && other.getEffectivestate()==null) || 
             (this.effectivestate!=null &&
              java.util.Arrays.equals(this.effectivestate, other.getEffectivestate()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              java.util.Arrays.equals(this.state, other.getState()))) &&
            ((this.operationalstate==null && other.getOperationalstate()==null) || 
             (this.operationalstate!=null &&
              this.operationalstate.equals(other.getOperationalstate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.isconfigurationcoordinator==null && other.getIsconfigurationcoordinator()==null) || 
             (this.isconfigurationcoordinator!=null &&
              java.util.Arrays.equals(this.isconfigurationcoordinator, other.getIsconfigurationcoordinator()))) &&
            ((this.islocalnode==null && other.getIslocalnode()==null) || 
             (this.islocalnode!=null &&
              java.util.Arrays.equals(this.islocalnode, other.getIslocalnode()))) &&
            this.rsskeymismatch == other.isRsskeymismatch() &&
            this.licensemismatch == other.isLicensemismatch() &&
            ((this.nodersskeymismatch==null && other.getNodersskeymismatch()==null) || 
             (this.nodersskeymismatch!=null &&
              java.util.Arrays.equals(this.nodersskeymismatch, other.getNodersskeymismatch()))) &&
            ((this.nodelicensemismatch==null && other.getNodelicensemismatch()==null) || 
             (this.nodelicensemismatch!=null &&
              java.util.Arrays.equals(this.nodelicensemismatch, other.getNodelicensemismatch()))) &&
            ((this.operationalpropstate==null && other.getOperationalpropstate()==null) || 
             (this.operationalpropstate!=null &&
              this.operationalpropstate.equals(other.getOperationalpropstate())));
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
        if (getClid() != null) {
            _hashCode += getClid().hashCode();
        }
        if (getDeadinterval() != null) {
            _hashCode += getDeadinterval().hashCode();
        }
        if (getHellointerval() != null) {
            _hashCode += getHellointerval().hashCode();
        }
        if (getPreemption() != null) {
            _hashCode += getPreemption().hashCode();
        }
        if (getAdminstate() != null) {
            _hashCode += getAdminstate().hashCode();
        }
        if (getPropstate() != null) {
            _hashCode += getPropstate().hashCode();
        }
        if (getNodeid() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNodeid());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNodeid(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIpaddress() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIpaddress());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIpaddress(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMasterstate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMasterstate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMasterstate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHealth() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHealth());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHealth(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClusterhealth() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getClusterhealth());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getClusterhealth(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEffectivestate() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEffectivestate());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEffectivestate(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getState() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getState());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getState(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOperationalstate() != null) {
            _hashCode += getOperationalstate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getIsconfigurationcoordinator() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIsconfigurationcoordinator());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIsconfigurationcoordinator(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIslocalnode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIslocalnode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIslocalnode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isRsskeymismatch() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isLicensemismatch() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNodersskeymismatch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNodersskeymismatch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNodersskeymismatch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNodelicensemismatch() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNodelicensemismatch());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNodelicensemismatch(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOperationalpropstate() != null) {
            _hashCode += getOperationalpropstate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Clusterinstance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "clusterinstance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deadinterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deadinterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hellointerval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hellointerval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preemption");
        elemField.setXmlName(new javax.xml.namespace.QName("", "preemption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adminstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "adminstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationalstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operationalstate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("rsskeymismatch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsskeymismatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licensemismatch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "licensemismatch"));
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
        elemField.setFieldName("operationalpropstate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operationalpropstate"));
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
