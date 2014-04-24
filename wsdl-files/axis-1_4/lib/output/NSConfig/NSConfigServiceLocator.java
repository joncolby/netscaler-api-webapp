/**
 * NSConfigServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public class NSConfigServiceLocator extends org.apache.axis.client.Service implements NSConfig.NSConfigService {

    public NSConfigServiceLocator() {
    }


    public NSConfigServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NSConfigServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NSConfigPort
    private java.lang.String NSConfigPort_address = "http://10.38.25.251/soap/";

    public java.lang.String getNSConfigPortAddress() {
        return NSConfigPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NSConfigPortWSDDServiceName = "NSConfigPort";

    public java.lang.String getNSConfigPortWSDDServiceName() {
        return NSConfigPortWSDDServiceName;
    }

    public void setNSConfigPortWSDDServiceName(java.lang.String name) {
        NSConfigPortWSDDServiceName = name;
    }

    public NSConfig.NSConfigPort getNSConfigPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NSConfigPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNSConfigPort(endpoint);
    }

    public NSConfig.NSConfigPort getNSConfigPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            NSConfig.NSConfigBindingStub _stub = new NSConfig.NSConfigBindingStub(portAddress, this);
            _stub.setPortName(getNSConfigPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNSConfigPortEndpointAddress(java.lang.String address) {
        NSConfigPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (NSConfig.NSConfigPort.class.isAssignableFrom(serviceEndpointInterface)) {
                NSConfig.NSConfigBindingStub _stub = new NSConfig.NSConfigBindingStub(new java.net.URL(NSConfigPort_address), this);
                _stub.setPortName(getNSConfigPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("NSConfigPort".equals(inputPortName)) {
            return getNSConfigPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:NSConfig", "NSConfigService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:NSConfig", "NSConfigPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("NSConfigPort".equals(portName)) {
            setNSConfigPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
