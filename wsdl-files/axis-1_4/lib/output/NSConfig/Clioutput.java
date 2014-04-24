/**
 * Clioutput.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class Clioutput  implements java.io.Serializable {
    private java.lang.String command;

    private java.lang.String output;

    public Clioutput() {
    }

    public Clioutput(
           java.lang.String command,
           java.lang.String output) {
           this.command = command;
           this.output = output;
    }


    /**
     * Gets the command value for this Clioutput.
     * 
     * @return command
     */
    public java.lang.String getCommand() {
        return command;
    }


    /**
     * Sets the command value for this Clioutput.
     * 
     * @param command
     */
    public void setCommand(java.lang.String command) {
        this.command = command;
    }


    /**
     * Gets the output value for this Clioutput.
     * 
     * @return output
     */
    public java.lang.String getOutput() {
        return output;
    }


    /**
     * Sets the output value for this Clioutput.
     * 
     * @param output
     */
    public void setOutput(java.lang.String output) {
        this.output = output;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Clioutput)) return false;
        Clioutput other = (Clioutput) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.command==null && other.getCommand()==null) || 
             (this.command!=null &&
              this.command.equals(other.getCommand()))) &&
            ((this.output==null && other.getOutput()==null) || 
             (this.output!=null &&
              this.output.equals(other.getOutput())));
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
        if (getCommand() != null) {
            _hashCode += getCommand().hashCode();
        }
        if (getOutput() != null) {
            _hashCode += getOutput().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Clioutput.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:NSConfig", "clioutput"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("command");
        elemField.setXmlName(new javax.xml.namespace.QName("", "command"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("output");
        elemField.setXmlName(new javax.xml.namespace.QName("", "output"));
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
