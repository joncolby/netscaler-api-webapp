/**
 * Transformprofile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Transformprofile  implements java.io.Serializable {
    private java.lang.String name;

    private java.lang.String[] actionname;

    private java.lang.String type;

    private java.lang.String regexforfindingurlinjavascript;

    private java.lang.String regexforfindingurlincss;

    private java.lang.String regexforfindingurlinxcomponent;

    private java.lang.String regexforfindingurlinxml;

    private java.lang.String additionalreqheaderslist;

    private java.lang.String additionalrespheaderslist;

    private java.lang.String onlytransformabsurlinbody;

    private java.lang.String comment;

    private org.apache.axis.types.UnsignedInt[] priority;

    private java.lang.String[] state;

    private java.lang.String[] profilename;

    private java.lang.String[] requrlfrom;

    private java.lang.String[] requrlinto;

    private java.lang.String[] resurlfrom;

    private java.lang.String[] resurlinto;

    private java.lang.String[] cookiedomainfrom;

    private java.lang.String[] cookiedomaininto;

    private java.lang.String[] actioncomment;

    public Transformprofile() {
    }

    public Transformprofile(
           java.lang.String name,
           java.lang.String[] actionname,
           java.lang.String type,
           java.lang.String regexforfindingurlinjavascript,
           java.lang.String regexforfindingurlincss,
           java.lang.String regexforfindingurlinxcomponent,
           java.lang.String regexforfindingurlinxml,
           java.lang.String additionalreqheaderslist,
           java.lang.String additionalrespheaderslist,
           java.lang.String onlytransformabsurlinbody,
           java.lang.String comment,
           org.apache.axis.types.UnsignedInt[] priority,
           java.lang.String[] state,
           java.lang.String[] profilename,
           java.lang.String[] requrlfrom,
           java.lang.String[] requrlinto,
           java.lang.String[] resurlfrom,
           java.lang.String[] resurlinto,
           java.lang.String[] cookiedomainfrom,
           java.lang.String[] cookiedomaininto,
           java.lang.String[] actioncomment) {
           this.name = name;
           this.actionname = actionname;
           this.type = type;
           this.regexforfindingurlinjavascript = regexforfindingurlinjavascript;
           this.regexforfindingurlincss = regexforfindingurlincss;
           this.regexforfindingurlinxcomponent = regexforfindingurlinxcomponent;
           this.regexforfindingurlinxml = regexforfindingurlinxml;
           this.additionalreqheaderslist = additionalreqheaderslist;
           this.additionalrespheaderslist = additionalrespheaderslist;
           this.onlytransformabsurlinbody = onlytransformabsurlinbody;
           this.comment = comment;
           this.priority = priority;
           this.state = state;
           this.profilename = profilename;
           this.requrlfrom = requrlfrom;
           this.requrlinto = requrlinto;
           this.resurlfrom = resurlfrom;
           this.resurlinto = resurlinto;
           this.cookiedomainfrom = cookiedomainfrom;
           this.cookiedomaininto = cookiedomaininto;
           this.actioncomment = actioncomment;
    }


    /**
     * Gets the name value for this Transformprofile.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Transformprofile.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the actionname value for this Transformprofile.
     * 
     * @return actionname
     */
    public java.lang.String[] getActionname() {
        return actionname;
    }


    /**
     * Sets the actionname value for this Transformprofile.
     * 
     * @param actionname
     */
    public void setActionname(java.lang.String[] actionname) {
        this.actionname = actionname;
    }


    /**
     * Gets the type value for this Transformprofile.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Transformprofile.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the regexforfindingurlinjavascript value for this Transformprofile.
     * 
     * @return regexforfindingurlinjavascript
     */
    public java.lang.String getRegexforfindingurlinjavascript() {
        return regexforfindingurlinjavascript;
    }


    /**
     * Sets the regexforfindingurlinjavascript value for this Transformprofile.
     * 
     * @param regexforfindingurlinjavascript
     */
    public void setRegexforfindingurlinjavascript(java.lang.String regexforfindingurlinjavascript) {
        this.regexforfindingurlinjavascript = regexforfindingurlinjavascript;
    }


    /**
     * Gets the regexforfindingurlincss value for this Transformprofile.
     * 
     * @return regexforfindingurlincss
     */
    public java.lang.String getRegexforfindingurlincss() {
        return regexforfindingurlincss;
    }


    /**
     * Sets the regexforfindingurlincss value for this Transformprofile.
     * 
     * @param regexforfindingurlincss
     */
    public void setRegexforfindingurlincss(java.lang.String regexforfindingurlincss) {
        this.regexforfindingurlincss = regexforfindingurlincss;
    }


    /**
     * Gets the regexforfindingurlinxcomponent value for this Transformprofile.
     * 
     * @return regexforfindingurlinxcomponent
     */
    public java.lang.String getRegexforfindingurlinxcomponent() {
        return regexforfindingurlinxcomponent;
    }


    /**
     * Sets the regexforfindingurlinxcomponent value for this Transformprofile.
     * 
     * @param regexforfindingurlinxcomponent
     */
    public void setRegexforfindingurlinxcomponent(java.lang.String regexforfindingurlinxcomponent) {
        this.regexforfindingurlinxcomponent = regexforfindingurlinxcomponent;
    }


    /**
     * Gets the regexforfindingurlinxml value for this Transformprofile.
     * 
     * @return regexforfindingurlinxml
     */
    public java.lang.String getRegexforfindingurlinxml() {
        return regexforfindingurlinxml;
    }


    /**
     * Sets the regexforfindingurlinxml value for this Transformprofile.
     * 
     * @param regexforfindingurlinxml
     */
    public void setRegexforfindingurlinxml(java.lang.String regexforfindingurlinxml) {
        this.regexforfindingurlinxml = regexforfindingurlinxml;
    }


    /**
     * Gets the additionalreqheaderslist value for this Transformprofile.
     * 
     * @return additionalreqheaderslist
     */
    public java.lang.String getAdditionalreqheaderslist() {
        return additionalreqheaderslist;
    }


    /**
     * Sets the additionalreqheaderslist value for this Transformprofile.
     * 
     * @param additionalreqheaderslist
     */
    public void setAdditionalreqheaderslist(java.lang.String additionalreqheaderslist) {
        this.additionalreqheaderslist = additionalreqheaderslist;
    }


    /**
     * Gets the additionalrespheaderslist value for this Transformprofile.
     * 
     * @return additionalrespheaderslist
     */
    public java.lang.String getAdditionalrespheaderslist() {
        return additionalrespheaderslist;
    }


    /**
     * Sets the additionalrespheaderslist value for this Transformprofile.
     * 
     * @param additionalrespheaderslist
     */
    public void setAdditionalrespheaderslist(java.lang.String additionalrespheaderslist) {
        this.additionalrespheaderslist = additionalrespheaderslist;
    }


    /**
     * Gets the onlytransformabsurlinbody value for this Transformprofile.
     * 
     * @return onlytransformabsurlinbody
     */
    public java.lang.String getOnlytransformabsurlinbody() {
        return onlytransformabsurlinbody;
    }


    /**
     * Sets the onlytransformabsurlinbody value for this Transformprofile.
     * 
     * @param onlytransformabsurlinbody
     */
    public void setOnlytransformabsurlinbody(java.lang.String onlytransformabsurlinbody) {
        this.onlytransformabsurlinbody = onlytransformabsurlinbody;
    }


    /**
     * Gets the comment value for this Transformprofile.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Transformprofile.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the priority value for this Transformprofile.
     * 
     * @return priority
     */
    public org.apache.axis.types.UnsignedInt[] getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this Transformprofile.
     * 
     * @param priority
     */
    public void setPriority(org.apache.axis.types.UnsignedInt[] priority) {
        this.priority = priority;
    }


    /**
     * Gets the state value for this Transformprofile.
     * 
     * @return state
     */
    public java.lang.String[] getState() {
        return state;
    }


    /**
     * Sets the state value for this Transformprofile.
     * 
     * @param state
     */
    public void setState(java.lang.String[] state) {
        this.state = state;
    }


    /**
     * Gets the profilename value for this Transformprofile.
     * 
     * @return profilename
     */
    public java.lang.String[] getProfilename() {
        return profilename;
    }


    /**
     * Sets the profilename value for this Transformprofile.
     * 
     * @param profilename
     */
    public void setProfilename(java.lang.String[] profilename) {
        this.profilename = profilename;
    }


    /**
     * Gets the requrlfrom value for this Transformprofile.
     * 
     * @return requrlfrom
     */
    public java.lang.String[] getRequrlfrom() {
        return requrlfrom;
    }


    /**
     * Sets the requrlfrom value for this Transformprofile.
     * 
     * @param requrlfrom
     */
    public void setRequrlfrom(java.lang.String[] requrlfrom) {
        this.requrlfrom = requrlfrom;
    }


    /**
     * Gets the requrlinto value for this Transformprofile.
     * 
     * @return requrlinto
     */
    public java.lang.String[] getRequrlinto() {
        return requrlinto;
    }


    /**
     * Sets the requrlinto value for this Transformprofile.
     * 
     * @param requrlinto
     */
    public void setRequrlinto(java.lang.String[] requrlinto) {
        this.requrlinto = requrlinto;
    }


    /**
     * Gets the resurlfrom value for this Transformprofile.
     * 
     * @return resurlfrom
     */
    public java.lang.String[] getResurlfrom() {
        return resurlfrom;
    }


    /**
     * Sets the resurlfrom value for this Transformprofile.
     * 
     * @param resurlfrom
     */
    public void setResurlfrom(java.lang.String[] resurlfrom) {
        this.resurlfrom = resurlfrom;
    }


    /**
     * Gets the resurlinto value for this Transformprofile.
     * 
     * @return resurlinto
     */
    public java.lang.String[] getResurlinto() {
        return resurlinto;
    }


    /**
     * Sets the resurlinto value for this Transformprofile.
     * 
     * @param resurlinto
     */
    public void setResurlinto(java.lang.String[] resurlinto) {
        this.resurlinto = resurlinto;
    }


    /**
     * Gets the cookiedomainfrom value for this Transformprofile.
     * 
     * @return cookiedomainfrom
     */
    public java.lang.String[] getCookiedomainfrom() {
        return cookiedomainfrom;
    }


    /**
     * Sets the cookiedomainfrom value for this Transformprofile.
     * 
     * @param cookiedomainfrom
     */
    public void setCookiedomainfrom(java.lang.String[] cookiedomainfrom) {
        this.cookiedomainfrom = cookiedomainfrom;
    }


    /**
     * Gets the cookiedomaininto value for this Transformprofile.
     * 
     * @return cookiedomaininto
     */
    public java.lang.String[] getCookiedomaininto() {
        return cookiedomaininto;
    }


    /**
     * Sets the cookiedomaininto value for this Transformprofile.
     * 
     * @param cookiedomaininto
     */
    public void setCookiedomaininto(java.lang.String[] cookiedomaininto) {
        this.cookiedomaininto = cookiedomaininto;
    }


    /**
     * Gets the actioncomment value for this Transformprofile.
     * 
     * @return actioncomment
     */
    public java.lang.String[] getActioncomment() {
        return actioncomment;
    }


    /**
     * Sets the actioncomment value for this Transformprofile.
     * 
     * @param actioncomment
     */
    public void setActioncomment(java.lang.String[] actioncomment) {
        this.actioncomment = actioncomment;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Transformprofile)) return false;
        Transformprofile other = (Transformprofile) obj;
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
            ((this.actionname==null && other.getActionname()==null) || 
             (this.actionname!=null &&
              java.util.Arrays.equals(this.actionname, other.getActionname()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.regexforfindingurlinjavascript==null && other.getRegexforfindingurlinjavascript()==null) || 
             (this.regexforfindingurlinjavascript!=null &&
              this.regexforfindingurlinjavascript.equals(other.getRegexforfindingurlinjavascript()))) &&
            ((this.regexforfindingurlincss==null && other.getRegexforfindingurlincss()==null) || 
             (this.regexforfindingurlincss!=null &&
              this.regexforfindingurlincss.equals(other.getRegexforfindingurlincss()))) &&
            ((this.regexforfindingurlinxcomponent==null && other.getRegexforfindingurlinxcomponent()==null) || 
             (this.regexforfindingurlinxcomponent!=null &&
              this.regexforfindingurlinxcomponent.equals(other.getRegexforfindingurlinxcomponent()))) &&
            ((this.regexforfindingurlinxml==null && other.getRegexforfindingurlinxml()==null) || 
             (this.regexforfindingurlinxml!=null &&
              this.regexforfindingurlinxml.equals(other.getRegexforfindingurlinxml()))) &&
            ((this.additionalreqheaderslist==null && other.getAdditionalreqheaderslist()==null) || 
             (this.additionalreqheaderslist!=null &&
              this.additionalreqheaderslist.equals(other.getAdditionalreqheaderslist()))) &&
            ((this.additionalrespheaderslist==null && other.getAdditionalrespheaderslist()==null) || 
             (this.additionalrespheaderslist!=null &&
              this.additionalrespheaderslist.equals(other.getAdditionalrespheaderslist()))) &&
            ((this.onlytransformabsurlinbody==null && other.getOnlytransformabsurlinbody()==null) || 
             (this.onlytransformabsurlinbody!=null &&
              this.onlytransformabsurlinbody.equals(other.getOnlytransformabsurlinbody()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.priority==null && other.getPriority()==null) || 
             (this.priority!=null &&
              java.util.Arrays.equals(this.priority, other.getPriority()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              java.util.Arrays.equals(this.state, other.getState()))) &&
            ((this.profilename==null && other.getProfilename()==null) || 
             (this.profilename!=null &&
              java.util.Arrays.equals(this.profilename, other.getProfilename()))) &&
            ((this.requrlfrom==null && other.getRequrlfrom()==null) || 
             (this.requrlfrom!=null &&
              java.util.Arrays.equals(this.requrlfrom, other.getRequrlfrom()))) &&
            ((this.requrlinto==null && other.getRequrlinto()==null) || 
             (this.requrlinto!=null &&
              java.util.Arrays.equals(this.requrlinto, other.getRequrlinto()))) &&
            ((this.resurlfrom==null && other.getResurlfrom()==null) || 
             (this.resurlfrom!=null &&
              java.util.Arrays.equals(this.resurlfrom, other.getResurlfrom()))) &&
            ((this.resurlinto==null && other.getResurlinto()==null) || 
             (this.resurlinto!=null &&
              java.util.Arrays.equals(this.resurlinto, other.getResurlinto()))) &&
            ((this.cookiedomainfrom==null && other.getCookiedomainfrom()==null) || 
             (this.cookiedomainfrom!=null &&
              java.util.Arrays.equals(this.cookiedomainfrom, other.getCookiedomainfrom()))) &&
            ((this.cookiedomaininto==null && other.getCookiedomaininto()==null) || 
             (this.cookiedomaininto!=null &&
              java.util.Arrays.equals(this.cookiedomaininto, other.getCookiedomaininto()))) &&
            ((this.actioncomment==null && other.getActioncomment()==null) || 
             (this.actioncomment!=null &&
              java.util.Arrays.equals(this.actioncomment, other.getActioncomment())));
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
        if (getActionname() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActionname());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActionname(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getRegexforfindingurlinjavascript() != null) {
            _hashCode += getRegexforfindingurlinjavascript().hashCode();
        }
        if (getRegexforfindingurlincss() != null) {
            _hashCode += getRegexforfindingurlincss().hashCode();
        }
        if (getRegexforfindingurlinxcomponent() != null) {
            _hashCode += getRegexforfindingurlinxcomponent().hashCode();
        }
        if (getRegexforfindingurlinxml() != null) {
            _hashCode += getRegexforfindingurlinxml().hashCode();
        }
        if (getAdditionalreqheaderslist() != null) {
            _hashCode += getAdditionalreqheaderslist().hashCode();
        }
        if (getAdditionalrespheaderslist() != null) {
            _hashCode += getAdditionalrespheaderslist().hashCode();
        }
        if (getOnlytransformabsurlinbody() != null) {
            _hashCode += getOnlytransformabsurlinbody().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getPriority() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPriority());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPriority(), i);
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
        if (getProfilename() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProfilename());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProfilename(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequrlfrom() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequrlfrom());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequrlfrom(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRequrlinto() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequrlinto());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequrlinto(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResurlfrom() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResurlfrom());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResurlfrom(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getResurlinto() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResurlinto());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResurlinto(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCookiedomainfrom() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCookiedomainfrom());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCookiedomainfrom(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCookiedomaininto() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCookiedomaininto());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCookiedomaininto(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getActioncomment() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getActioncomment());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getActioncomment(), i);
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
        new org.apache.axis.description.TypeDesc(Transformprofile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "transformprofile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actionname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regexforfindingurlinjavascript");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regexforfindingurlinjavascript"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regexforfindingurlincss");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regexforfindingurlincss"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regexforfindingurlinxcomponent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regexforfindingurlinxcomponent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("regexforfindingurlinxml");
        elemField.setXmlName(new javax.xml.namespace.QName("", "regexforfindingurlinxml"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalreqheaderslist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalreqheaderslist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalrespheaderslist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "additionalrespheaderslist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlytransformabsurlinbody");
        elemField.setXmlName(new javax.xml.namespace.QName("", "onlytransformabsurlinbody"));
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
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("", "priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("profilename");
        elemField.setXmlName(new javax.xml.namespace.QName("", "profilename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requrlfrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requrlfrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requrlinto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requrlinto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resurlfrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resurlfrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resurlinto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resurlinto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cookiedomainfrom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cookiedomainfrom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cookiedomaininto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cookiedomaininto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actioncomment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "actioncomment"));
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
