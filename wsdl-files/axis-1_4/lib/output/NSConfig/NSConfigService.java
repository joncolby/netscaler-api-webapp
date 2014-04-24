/**
 * NSConfigService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package NSConfig;

public interface NSConfigService extends javax.xml.rpc.Service {
    public java.lang.String getNSConfigPortAddress();

    public NSConfig.NSConfigPort getNSConfigPort() throws javax.xml.rpc.ServiceException;

    public NSConfig.NSConfigPort getNSConfigPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
