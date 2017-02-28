/**
 * Uppgift1_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Grupp7;

public interface Uppgift1_Service extends javax.xml.rpc.Service {

/**
 * This web service has one web method which takes a string filename/filepath
 * as parameter and returns the file content to the caller as a string
 * if successful. If an error occurs, the web method throws a FaultException
 * which must be handled by the client.
 */
    public java.lang.String getUppgift1_ServiceSoapAddress();

    public Grupp7.Uppgift1_ServiceSoap getUppgift1_ServiceSoap() throws javax.xml.rpc.ServiceException;

    public Grupp7.Uppgift1_ServiceSoap getUppgift1_ServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
