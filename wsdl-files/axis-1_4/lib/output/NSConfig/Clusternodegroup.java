/**
 * Clusternodegroup.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Clusternodegroup  implements java.io.Serializable {
    private java.lang.String[] name;

    private org.apache.axis.types.UnsignedInt[] node;

    private java.lang.String strict;

    private java.lang.String[] vserver;

    private org.apache.axis.types.UnsignedInt currentnodemask;

    private org.apache.axis.types.UnsignedInt backupnodemask;

    private org.apache.axis.types.UnsignedInt boundedentitiescntfrompe;

    private org.apache.axis.types.UnsignedInt[] activelist;

    private org.apache.axis.types.UnsignedInt[] backuplist;

    private java.lang.String[] identifiername;

    public Clusternodegroup() {
    }

    public Clusternodegroup(
           java.lang.String[] name,
           org.apache.axis.types.UnsignedInt[] node,
           java.lang.String strict,
           java.lang.String[] vserver,
           org.apache.axis.types.UnsignedInt currentnodemask,
           org.apache.axis.types.UnsignedInt backupnodemask,
           org.apache.axis.types.UnsignedInt boundedentitiescntfrompe,
           org.apache.axis.types.UnsignedInt[] activelist,
           org.apache.axis.types.UnsignedInt[] backuplist,
           java.lang.String[] identifiername) {
           this.name = name;
           this.node = node;
           this.strict = strict;
           this.vserver = vserver;
           this.currentnodemask = currentnodemask;
           this.backupnodemask = backupnodemask;
           this.boundedentitiescntfrompe = boundedentitiescntfrompe;
           this.activelist = activelist;
           this.backuplist = backuplist;
           this.identifiername = identifiername;
    }


    /**
     * Gets the name value for this Clusternodegroup.
     * 
     * @return name
     */
    public java.lang.String[] getName() {
        return name;
    }


    /**
     * Sets the name value for this Clusternodegroup.
     * 
     * @param name
     */
    public void setName(java.lang.String[] name) {
        this.name = name;
    }


    /**
     * Gets the node value for this Clusternodegroup.
     * 
     * @return node
     */
    public org.apache.axis.types.UnsignedInt[] getNode() {
        return node;
    }


    /**
     * Sets the node value for this Clusternodegroup.
     * 
     * @param node
     */
    public void setNode(org.apache.axis.types.UnsignedInt[] node) {
        this.node = node;
    }


    /**
     * Gets the strict value for this Clusternodegroup.
     * 
     * @return strict
     */
    public java.lang.String getStrict() {
        return strict;
    }


    /**
     * Sets the strict value for this Clusternodegroup.
     * 
     * @param strict
     */
    public void setStrict(java.lang.String strict) {
        this.strict = strict;
    }


    /**
     * Gets the vserver value for this Clusternodegroup.
     * 
     * @return vserver
     */
    public java.lang.String[] getVserver() {
        return vserver;
    }


    /**
     * Sets the vserver value for this Clusternodegroup.
     * 
     * @param vserver
     */
    public void setVserver(java.lang.String[] vserver) {
        this.vserver = vserver;
    }


    /**
     * Gets the currentnodemask value for this Clusternodegroup.
     * 
     * @return currentnodemask
     */
    public org.apache.axis.types.UnsignedInt getCurrentnodemask() {
        return currentnodemask;
    }


    /**
     * Sets the currentnodemask value for this Clusternodegroup.
     * 
     * @param currentnodemask
     */
    public void setCurrentnodemask(org.apache.axis.types.UnsignedInt currentnodemask) {
        this.currentnodemask = currentnodemask;
    }


    /**
     * Gets the backupnodemask value for this Clusternodegroup.
     * 
     * @return backupnodemask
     */
    public org.apache.axis.types.UnsignedInt getBackupnodemask() {
        return backupnodemask;
    }


    /**
     * Sets the backupnodemask value for this Clusternodegroup.
     * 
     * @param backupnodemask
     */
    public void setBackupnodemask(org.apache.axis.types.UnsignedInt backupnodemask) {
        this.backupnodemask = backupnodemask;
    }


    /**
     * Gets the boundedentitiescntfrompe value for this Clusternodegroup.
     * 
     * @return boundedentitiescntfrompe
     */
    public org.apache.axis.types.UnsignedInt getBoundedentitiescntfrompe() {
        return boundedentitiescntfrompe;
    }


    /**
     * Sets the boundedentitiescntfrompe value for this Clusternodegroup.
     * 
     * @param boundedentitiescntfrompe
     */
    public void setBoundedentitiescntfrompe(org.apache.axis.types.UnsignedInt boundedentitiescntfrompe) {
        this.boundedentitiescntfrompe = boundedentitiescntfrompe;
    }


    /**
     * Gets the activelist value for this Clusternodegroup.
     * 
     * @return activelist
     */
    public org.apache.axis.types.UnsignedInt[] getActivelist() {
        return activelist;
    }


    /**
     * Sets the activelist value for this Clusternodegroup.
     * 
     * @param activelist
     */
    public void setActivelist(org.apache.axis.types.UnsignedInt[] activelist) {
        this.activelist = activelist;
    }


    /**
     * Gets the backuplist value for this Clusternodegroup.
     * 
     * @return backuplist
     */
    public org.apache.axis.types.UnsignedInt[] getBackuplist() {
        return backuplist;
    }


    /**
     * Sets the backuplist value for this Clusternodegroup.
     * 
     * @param backuplist
     */
    public void setBackuplist(org.apache.axis.types.UnsignedInt[] backuplist) {
        this.backuplist = backuplist;
    }


    /**
     * Gets the identifiername value for this Clusternodegroup.
     * 
     * @return identifiername
     */
    public java.lang.String[] getIdentifiername() {
        return identifiername;
    }


    /**
     * Sets the identifiername value for this Clusternodegroup.
     * 
     * @param identifiername
     */
    public void setIdentifiername(java.lang.String[] identifiername) {
        this.identifiername = identifiername;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Clusternodegroup)) return false;
        Clusternodegroup other = (Clusternodegroup) obj;
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
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.node==null && other.getNode()==null) || 
             (this.node!=null &&
              java.util.Arrays.equals(this.node, other.getNode()))) &&
            ((this.strict==null && other.getStrict()==null) || 
             (this.strict!=null &&
              this.strict.equals(other.getStrict()))) &&
            ((this.vserver==null && other.getVserver()==null) || 
             (this.vserver!=null &&
              java.util.Arrays.equals(this.vserver, other.getVserver()))) &&
            ((this.currentnodemask==null && other.getCurrentnodemask()==null) || 
             (this.currentnodemask!=null &&
              this.currentnodemask.equals(other.getCurrentnodemask()))) &&
            ((this.backupnodemask==null && other.getBackupnodemask()==null) || 
             (this.backupnodemask!=null &&
              this.backupnodemask.equals(other.getBackupnodemask()))) &&
            ((this.boundedentitiescntfrompe==null && other.getBoundedentitiescntfrompe()==null) || 
             (this.boundedentitiescntfrompe!=null &&
              this.boundedentitiescntfrompe.equals(other.getBoundedentitiescntfrompe()))) &&
            ((this.activelist==null && other.getActivelist()==null) || 
             (this.activelist!=null &&
              java.util.Arrays.equals(this.activelist, other.getActivelist()))) &&
            ((this.backuplist==null && other.getBackuplist()==null) || 
             (this.backuplist!=null &&
              java.util.Arrays.equals(this.backuplist, other.getBackuplist()))) &&
            ((this.identifiername==null && other.getIdentifiername()==null) || 
             (this.identifiername!=null &&
              java.util.Arrays.equals(this.identifiername, other.getIdentifiername())));
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
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getNode() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNode());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNode(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStrict() != null) {
            _hashCode += getStrict().hashCode();
        }
        if (getVserver() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getVserver());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getVserver(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCurrentnodemask() != null) {
            _hashCode += getCurrentnodemask().hashCode();
        }
        if (getBackupnodemask() != null) {
            _hashCode += getBackupnodemask().hashCode();
        }
        if (getBoundedentitiescntfrompe() != null) {
            _hashCode += getBoundedentitiescntfrompe().hashCode();
        }
        if (getActivelist() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActivelist());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActivelist(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBackuplist() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBackuplist());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBackuplist(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIdentifiername() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdentifiername());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdentifiername(), i);
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
        new org.apache.axis.description.TypeDesc(Clusternodegroup.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "clusternodegroup"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("node");
        elemField.setXmlName(new javax.xml.namespace.QName("", "node"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strict");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strict"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vserver");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vserver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentnodemask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "currentnodemask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupnodemask");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backupnodemask"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("boundedentitiescntfrompe");
        elemField.setXmlName(new javax.xml.namespace.QName("", "boundedentitiescntfrompe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activelist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activelist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backuplist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "backuplist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identifiername");
        elemField.setXmlName(new javax.xml.namespace.QName("", "identifiername"));
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
