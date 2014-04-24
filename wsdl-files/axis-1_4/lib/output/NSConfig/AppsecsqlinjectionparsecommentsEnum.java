/**
 * AppsecsqlinjectionparsecommentsEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class AppsecsqlinjectionparsecommentsEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected AppsecsqlinjectionparsecommentsEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CHECKALL = "CHECKALL";
    public static final java.lang.String _ANSI = "ANSI";
    public static final java.lang.String _NESTED = "NESTED";
    public static final java.lang.String _ANSINESTED = "ANSINESTED";
    public static final java.lang.String _VALNOTSET = "VALNOTSET";
    public static final AppsecsqlinjectionparsecommentsEnum CHECKALL = new AppsecsqlinjectionparsecommentsEnum(_CHECKALL);
    public static final AppsecsqlinjectionparsecommentsEnum ANSI = new AppsecsqlinjectionparsecommentsEnum(_ANSI);
    public static final AppsecsqlinjectionparsecommentsEnum NESTED = new AppsecsqlinjectionparsecommentsEnum(_NESTED);
    public static final AppsecsqlinjectionparsecommentsEnum ANSINESTED = new AppsecsqlinjectionparsecommentsEnum(_ANSINESTED);
    public static final AppsecsqlinjectionparsecommentsEnum VALNOTSET = new AppsecsqlinjectionparsecommentsEnum(_VALNOTSET);
    public java.lang.String getValue() { return _value_;}
    public static AppsecsqlinjectionparsecommentsEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        AppsecsqlinjectionparsecommentsEnum enumeration = (AppsecsqlinjectionparsecommentsEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static AppsecsqlinjectionparsecommentsEnum fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AppsecsqlinjectionparsecommentsEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "appsecsqlinjectionparsecommentsEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
