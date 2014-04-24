/**
 * Systemglobal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Systemglobal  implements java.io.Serializable {
    private java.lang.String policyname;

    private org.apache.axis.types.UnsignedInt priority;

    private org.apache.axis.types.UnsignedInt bindpolicytype;

    private java.lang.String builtin;

    private java.lang.String[] radiuspolicyname;

    private org.apache.axis.types.UnsignedInt[] radiuspolicypriority;

    private java.lang.String[] radiuspolicybuiltin;

    private java.lang.String[] ldappolicyname;

    private org.apache.axis.types.UnsignedInt[] ldappolicypriority;

    private java.lang.String[] ldappolicybuiltin;

    private java.lang.String[] tacacspolicyname;

    private org.apache.axis.types.UnsignedInt[] tacacspolicypriority;

    private java.lang.String[] tacacspolicybuiltin;

    private java.lang.String[] localpolicyname;

    private org.apache.axis.types.UnsignedInt[] localpolicypriority;

    private java.lang.String[] localpolicybuiltin;

    private java.lang.String[] nslogpolicyname;

    private org.apache.axis.types.UnsignedInt[] nslogpriority;

    private java.lang.String[] nslogbuiltin;

    private java.lang.String[] syslogpolicyname;

    private org.apache.axis.types.UnsignedInt[] syslogpriority;

    private java.lang.String[] syslogbuiltin;

    public Systemglobal() {
    }

    public Systemglobal(
           java.lang.String policyname,
           org.apache.axis.types.UnsignedInt priority,
           org.apache.axis.types.UnsignedInt bindpolicytype,
           java.lang.String builtin,
           java.lang.String[] radiuspolicyname,
           org.apache.axis.types.UnsignedInt[] radiuspolicypriority,
           java.lang.String[] radiuspolicybuiltin,
           java.lang.String[] ldappolicyname,
           org.apache.axis.types.UnsignedInt[] ldappolicypriority,
           java.lang.String[] ldappolicybuiltin,
           java.lang.String[] tacacspolicyname,
           org.apache.axis.types.UnsignedInt[] tacacspolicypriority,
           java.lang.String[] tacacspolicybuiltin,
           java.lang.String[] localpolicyname,
           org.apache.axis.types.UnsignedInt[] localpolicypriority,
           java.lang.String[] localpolicybuiltin,
           java.lang.String[] nslogpolicyname,
           org.apache.axis.types.UnsignedInt[] nslogpriority,
           java.lang.String[] nslogbuiltin,
           java.lang.String[] syslogpolicyname,
           org.apache.axis.types.UnsignedInt[] syslogpriority,
           java.lang.String[] syslogbuiltin) {
           this.policyname = policyname;
           this.priority = priority;
           this.bindpolicytype = bindpolicytype;
           this.builtin = builtin;
           this.radiuspolicyname = radiuspolicyname;
           this.radiuspolicypriority = radiuspolicypriority;
           this.radiuspolicybuiltin = radiuspolicybuiltin;
           this.ldappolicyname = ldappolicyname;
           this.ldappolicypriority = ldappolicypriority;
           this.ldappolicybuiltin = ldappolicybuiltin;
           this.tacacspolicyname = tacacspolicyname;
           this.tacacspolicypriority = tacacspolicypriority;
           this.tacacspolicybuiltin = tacacspolicybuiltin;
           this.localpolicyname = localpolicyname;
           this.localpolicypriority = localpolicypriority;
           this.localpolicybuiltin = localpolicybuiltin;
           this.nslogpolicyname = nslogpolicyname;
           this.nslogpriority = nslogpriority;
           this.nslogbuiltin = nslogbuiltin;
           this.syslogpolicyname = syslogpolicyname;
           this.syslogpriority = syslogpriority;
           this.syslogbuiltin = syslogbuiltin;
    }


    /**
     * Gets the policyname value for this Systemglobal.
     * 
     * @return policyname
     */
    public java.lang.String getPolicyname() {
        return policyname;
    }


    /**
     * Sets the policyname value for this Systemglobal.
     * 
     * @param policyname
     */
    public void setPolicyname(java.lang.String policyname) {
        this.policyname = policyname;
    }


    /**
     * Gets the priority value for this Systemglobal.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Systemglobal.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt priority) {
        this.priority = priority;
    }


    /**
     * Gets the bindpolicytype value for this Systemglobal.
     * 
     * @return bindpolicytype
     */
    public org.apache.axis.types.UnsignedInt getBindpolicytype() {
        return bindpolicytype;
    }


    /**
     * Sets the bindpolicytype value for this Systemglobal.
     * 
     * @param bindpolicytype
     */
    public void setBindpolicytype(org.apache.axis.types.UnsignedInt bindpolicytype) {
        this.bindpolicytype = bindpolicytype;
    }


    /**
     * Gets the builtin value for this Systemglobal.
     * 
     * @return builtin
     */
    public java.lang.String getBuiltin() {
        return builtin;
    }


    /**
     * Sets the builtin value for this Systemglobal.
     * 
     * @param builtin
     */
    public void setBuiltin(java.lang.String builtin) {
        this.builtin = builtin;
    }


    /**
     * Gets the radiuspolicyname value for this Systemglobal.
     * 
     * @return radiuspolicyname
     */
    public java.lang.String[] getRadiuspolicyname() {
        return radiuspolicyname;
    }


    /**
     * Sets the radiuspolicyname value for this Systemglobal.
     * 
     * @param radiuspolicyname
     */
    public void setRadiuspolicyname(java.lang.String[] radiuspolicyname) {
        this.radiuspolicyname = radiuspolicyname;
    }


    /**
     * Gets the radiuspolicypriority value for this Systemglobal.
     * 
     * @return radiuspolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getRadiuspolicypriority() {
        return radiuspolicypriority;
    }


    /**
     * Sets the radiuspolicypriority value for this Systemglobal.
     * 
     * @param radiuspolicypriority
     */
    public void setRadiuspolicypriority(org.apache.axis.types.UnsignedInt[] radiuspolicypriority) {
        this.radiuspolicypriority = radiuspolicypriority;
    }


    /**
     * Gets the radiuspolicybuiltin value for this Systemglobal.
     * 
     * @return radiuspolicybuiltin
     */
    public java.lang.String[] getRadiuspolicybuiltin() {
        return radiuspolicybuiltin;
    }


    /**
     * Sets the radiuspolicybuiltin value for this Systemglobal.
     * 
     * @param radiuspolicybuiltin
     */
    public void setRadiuspolicybuiltin(java.lang.String[] radiuspolicybuiltin) {
        this.radiuspolicybuiltin = radiuspolicybuiltin;
    }


    /**
     * Gets the ldappolicyname value for this Systemglobal.
     * 
     * @return ldappolicyname
     */
    public java.lang.String[] getLdappolicyname() {
        return ldappolicyname;
    }


    /**
     * Sets the ldappolicyname value for this Systemglobal.
     * 
     * @param ldappolicyname
     */
    public void setLdappolicyname(java.lang.String[] ldappolicyname) {
        this.ldappolicyname = ldappolicyname;
    }


    /**
     * Gets the ldappolicypriority value for this Systemglobal.
     * 
     * @return ldappolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getLdappolicypriority() {
        return ldappolicypriority;
    }


    /**
     * Sets the ldappolicypriority value for this Systemglobal.
     * 
     * @param ldappolicypriority
     */
    public void setLdappolicypriority(org.apache.axis.types.UnsignedInt[] ldappolicypriority) {
        this.ldappolicypriority = ldappolicypriority;
    }


    /**
     * Gets the ldappolicybuiltin value for this Systemglobal.
     * 
     * @return ldappolicybuiltin
     */
    public java.lang.String[] getLdappolicybuiltin() {
        return ldappolicybuiltin;
    }


    /**
     * Sets the ldappolicybuiltin value for this Systemglobal.
     * 
     * @param ldappolicybuiltin
     */
    public void setLdappolicybuiltin(java.lang.String[] ldappolicybuiltin) {
        this.ldappolicybuiltin = ldappolicybuiltin;
    }


    /**
     * Gets the tacacspolicyname value for this Systemglobal.
     * 
     * @return tacacspolicyname
     */
    public java.lang.String[] getTacacspolicyname() {
        return tacacspolicyname;
    }


    /**
     * Sets the tacacspolicyname value for this Systemglobal.
     * 
     * @param tacacspolicyname
     */
    public void setTacacspolicyname(java.lang.String[] tacacspolicyname) {
        this.tacacspolicyname = tacacspolicyname;
    }


    /**
     * Gets the tacacspolicypriority value for this Systemglobal.
     * 
     * @return tacacspolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getTacacspolicypriority() {
        return tacacspolicypriority;
    }


    /**
     * Sets the tacacspolicypriority value for this Systemglobal.
     * 
     * @param tacacspolicypriority
     */
    public void setTacacspolicypriority(org.apache.axis.types.UnsignedInt[] tacacspolicypriority) {
        this.tacacspolicypriority = tacacspolicypriority;
    }


    /**
     * Gets the tacacspolicybuiltin value for this Systemglobal.
     * 
     * @return tacacspolicybuiltin
     */
    public java.lang.String[] getTacacspolicybuiltin() {
        return tacacspolicybuiltin;
    }


    /**
     * Sets the tacacspolicybuiltin value for this Systemglobal.
     * 
     * @param tacacspolicybuiltin
     */
    public void setTacacspolicybuiltin(java.lang.String[] tacacspolicybuiltin) {
        this.tacacspolicybuiltin = tacacspolicybuiltin;
    }


    /**
     * Gets the localpolicyname value for this Systemglobal.
     * 
     * @return localpolicyname
     */
    public java.lang.String[] getLocalpolicyname() {
        return localpolicyname;
    }


    /**
     * Sets the localpolicyname value for this Systemglobal.
     * 
     * @param localpolicyname
     */
    public void setLocalpolicyname(java.lang.String[] localpolicyname) {
        this.localpolicyname = localpolicyname;
    }


    /**
     * Gets the localpolicypriority value for this Systemglobal.
     * 
     * @return localpolicypriority
     */
    public org.apache.axis.types.UnsignedInt[] getLocalpolicypriority() {
        return localpolicypriority;
    }


    /**
     * Sets the localpolicypriority value for this Systemglobal.
     * 
     * @param localpolicypriority
     */
    public void setLocalpolicypriority(org.apache.axis.types.UnsignedInt[] localpolicypriority) {
        this.localpolicypriority = localpolicypriority;
    }


    /**
     * Gets the localpolicybuiltin value for this Systemglobal.
     * 
     * @return localpolicybuiltin
     */
    public java.lang.String[] getLocalpolicybuiltin() {
        return localpolicybuiltin;
    }


    /**
     * Sets the localpolicybuiltin value for this Systemglobal.
     * 
     * @param localpolicybuiltin
     */
    public void setLocalpolicybuiltin(java.lang.String[] localpolicybuiltin) {
        this.localpolicybuiltin = localpolicybuiltin;
    }


    /**
     * Gets the nslogpolicyname value for this Systemglobal.
     * 
     * @return nslogpolicyname
     */
    public java.lang.String[] getNslogpolicyname() {
        return nslogpolicyname;
    }


    /**
     * Sets the nslogpolicyname value for this Systemglobal.
     * 
     * @param nslogpolicyname
     */
    public void setNslogpolicyname(java.lang.String[] nslogpolicyname) {
        this.nslogpolicyname = nslogpolicyname;
    }


    /**
     * Gets the nslogpriority value for this Systemglobal.
     * 
     * @return nslogpriority
     */
    public org.apache.axis.types.UnsignedInt[] getNslogpriority() {
        return nslogpriority;
    }


    /**
     * Sets the nslogpriority value for this Systemglobal.
     * 
     * @param nslogpriority
     */
    public void setNslogpriority(org.apache.axis.types.UnsignedInt[] nslogpriority) {
        this.nslogpriority = nslogpriority;
    }


    /**
     * Gets the nslogbuiltin value for this Systemglobal.
     * 
     * @return nslogbuiltin
     */
    public java.lang.String[] getNslogbuiltin() {
        return nslogbuiltin;
    }


    /**
     * Sets the nslogbuiltin value for this Systemglobal.
     * 
     * @param nslogbuiltin
     */
    public void setNslogbuiltin(java.lang.String[] nslogbuiltin) {
        this.nslogbuiltin = nslogbuiltin;
    }


    /**
     * Gets the syslogpolicyname value for this Systemglobal.
     * 
     * @return syslogpolicyname
     */
    public java.lang.String[] getSyslogpolicyname() {
        return syslogpolicyname;
    }


    /**
     * Sets the syslogpolicyname value for this Systemglobal.
     * 
     * @param syslogpolicyname
     */
    public void setSyslogpolicyname(java.lang.String[] syslogpolicyname) {
        this.syslogpolicyname = syslogpolicyname;
    }


    /**
     * Gets the syslogpriority value for this Systemglobal.
     * 
     * @return syslogpriority
     */
    public org.apache.axis.types.UnsignedInt[] getSyslogpriority() {
        return syslogpriority;
    }


    /**
     * Sets the syslogpriority value for this Systemglobal.
     * 
     * @param syslogpriority
     */
    public void setSyslogpriority(org.apache.axis.types.UnsignedInt[] syslogpriority) {
        this.syslogpriority = syslogpriority;
    }


    /**
     * Gets the syslogbuiltin value for this Systemglobal.
     * 
     * @return syslogbuiltin
     */
    public java.lang.String[] getSyslogbuiltin() {
        return syslogbuiltin;
    }


    /**
     * Sets the syslogbuiltin value for this Systemglobal.
     * 
     * @param syslogbuiltin
     */
    public void setSyslogbuiltin(java.lang.String[] syslogbuiltin) {
        this.syslogbuiltin = syslogbuiltin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Systemglobal)) return false;
        Systemglobal other = (Systemglobal) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.policyname==null && other.getPolicyname()==null) || 
             (this.policyname!=null &&
              this.policyname.equals(other.getPolicyname()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              this.priority.equals(other.getPriority()))) &&
            ((this.bindpolicytype==null && other.getBindpolicytype()==null) || 
             (this.bindpolicytype!=null &&
              this.bindpolicytype.equals(other.getBindpolicytype()))) &&
            ((this.builtin==null && other.getBuiltin()==null) || 
             (this.builtin!=null &&
              this.builtin.equals(other.getBuiltin()))) &&
            ((this.radiuspolicyname==null && other.getRadiuspolicyname()==null) || 
             (this.radiuspolicyname!=null &&
              java.util.Arrays.equals(this.radiuspolicyname, other.getRadiuspolicyname()))) &&
            ((this.radiuspolicypriority==null && other.getRadiuspolicypriority()==null) || 
             (this.radiuspolicypriority!=null &&
              java.util.Arrays.equals(this.radiuspolicypriority, other.getRadiuspolicypriority()))) &&
            ((this.radiuspolicybuiltin==null && other.getRadiuspolicybuiltin()==null) || 
             (this.radiuspolicybuiltin!=null &&
              java.util.Arrays.equals(this.radiuspolicybuiltin, other.getRadiuspolicybuiltin()))) &&
            ((this.ldappolicyname==null && other.getLdappolicyname()==null) || 
             (this.ldappolicyname!=null &&
              java.util.Arrays.equals(this.ldappolicyname, other.getLdappolicyname()))) &&
            ((this.ldappolicypriority==null && other.getLdappolicypriority()==null) || 
             (this.ldappolicypriority!=null &&
              java.util.Arrays.equals(this.ldappolicypriority, other.getLdappolicypriority()))) &&
            ((this.ldappolicybuiltin==null && other.getLdappolicybuiltin()==null) || 
             (this.ldappolicybuiltin!=null &&
              java.util.Arrays.equals(this.ldappolicybuiltin, other.getLdappolicybuiltin()))) &&
            ((this.tacacspolicyname==null && other.getTacacspolicyname()==null) || 
             (this.tacacspolicyname!=null &&
              java.util.Arrays.equals(this.tacacspolicyname, other.getTacacspolicyname()))) &&
            ((this.tacacspolicypriority==null && other.getTacacspolicypriority()==null) || 
             (this.tacacspolicypriority!=null &&
              java.util.Arrays.equals(this.tacacspolicypriority, other.getTacacspolicypriority()))) &&
            ((this.tacacspolicybuiltin==null && other.getTacacspolicybuiltin()==null) || 
             (this.tacacspolicybuiltin!=null &&
              java.util.Arrays.equals(this.tacacspolicybuiltin, other.getTacacspolicybuiltin()))) &&
            ((this.localpolicyname==null && other.getLocalpolicyname()==null) || 
             (this.localpolicyname!=null &&
              java.util.Arrays.equals(this.localpolicyname, other.getLocalpolicyname()))) &&
            ((this.localpolicypriority==null && other.getLocalpolicypriority()==null) || 
             (this.localpolicypriority!=null &&
              java.util.Arrays.equals(this.localpolicypriority, other.getLocalpolicypriority()))) &&
            ((this.localpolicybuiltin==null && other.getLocalpolicybuiltin()==null) || 
             (this.localpolicybuiltin!=null &&
              java.util.Arrays.equals(this.localpolicybuiltin, other.getLocalpolicybuiltin()))) &&
            ((this.nslogpolicyname==null && other.getNslogpolicyname()==null) || 
             (this.nslogpolicyname!=null &&
              java.util.Arrays.equals(this.nslogpolicyname, other.getNslogpolicyname()))) &&
            ((this.nslogpriority==null && other.getNslogpriority()==null) || 
             (this.nslogpriority!=null &&
              java.util.Arrays.equals(this.nslogpriority, other.getNslogpriority()))) &&
            ((this.nslogbuiltin==null && other.getNslogbuiltin()==null) || 
             (this.nslogbuiltin!=null &&
              java.util.Arrays.equals(this.nslogbuiltin, other.getNslogbuiltin()))) &&
            ((this.syslogpolicyname==null && other.getSyslogpolicyname()==null) || 
             (this.syslogpolicyname!=null &&
              java.util.Arrays.equals(this.syslogpolicyname, other.getSyslogpolicyname()))) &&
            ((this.syslogpriority==null && other.getSyslogpriority()==null) || 
             (this.syslogpriority!=null &&
              java.util.Arrays.equals(this.syslogpriority, other.getSyslogpriority()))) &&
            ((this.syslogbuiltin==null && other.getSyslogbuiltin()==null) || 
             (this.syslogbuiltin!=null &&
              java.util.Arrays.equals(this.syslogbuiltin, other.getSyslogbuiltin())));
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
        if (getPolicyname() != null) {
            _hashCode += getPolicyname().hashCode();
        }
        if (getPriority() != null) {
            _hashCode += getPriority().hashCode();
        }
        if (getBindpolicytype() != null) {
            _hashCode += getBindpolicytype().hashCode();
        }
        if (getBuiltin() != null) {
            _hashCode += getBuiltin().hashCode();
        }
        if (getRadiuspolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRadiuspolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRadiuspolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRadiuspolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRadiuspolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRadiuspolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRadiuspolicybuiltin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRadiuspolicybuiltin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRadiuspolicybuiltin(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLdappolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLdappolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLdappolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLdappolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLdappolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLdappolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLdappolicybuiltin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLdappolicybuiltin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLdappolicybuiltin(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTacacspolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTacacspolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTacacspolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTacacspolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTacacspolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTacacspolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTacacspolicybuiltin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTacacspolicybuiltin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTacacspolicybuiltin(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocalpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocalpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocalpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocalpolicypriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocalpolicypriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocalpolicypriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLocalpolicybuiltin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLocalpolicybuiltin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLocalpolicybuiltin(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNslogpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNslogpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNslogpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNslogpriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNslogpriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNslogpriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNslogbuiltin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNslogbuiltin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNslogbuiltin(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSyslogpolicyname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSyslogpolicyname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSyslogpolicyname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSyslogpriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSyslogpriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSyslogpriority(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSyslogbuiltin() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSyslogbuiltin());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSyslogbuiltin(), i);
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
        new org.apache.axis.description.TypeDesc(Systemglobal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "systemglobal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("policyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "policyname"));
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
        elemField.setFieldName("bindpolicytype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bindpolicytype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("builtin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "builtin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiuspolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radiuspolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiuspolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radiuspolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("radiuspolicybuiltin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "radiuspolicybuiltin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldappolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldappolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldappolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldappolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldappolicybuiltin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ldappolicybuiltin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tacacspolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tacacspolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tacacspolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tacacspolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tacacspolicybuiltin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tacacspolicybuiltin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localpolicypriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localpolicypriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localpolicybuiltin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "localpolicybuiltin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nslogpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nslogpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nslogpriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nslogpriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nslogbuiltin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nslogbuiltin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syslogpolicyname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "syslogpolicyname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syslogpriority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "syslogpriority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("syslogbuiltin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "syslogbuiltin"));
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
