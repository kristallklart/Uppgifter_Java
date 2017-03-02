/**
 * Uppgift2_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Grupp7.uppgift1_2_ws;

public interface Uppgift2_Service extends javax.xml.rpc.Service {

/**
 * This web service has multiple web methods which all takes zero
 * arguments and returns an object collection of all the entities in
 * a given table in the Friendly Database if successful. If an error
 * occurs the methods will throw a FaultException which must be handled
 * by the client.
 */
    public java.lang.String getUppgift2_ServiceSoapAddress();

    public Grupp7.uppgift1_2_ws.Uppgift2_ServiceSoap getUppgift2_ServiceSoap() throws javax.xml.rpc.ServiceException;

    public Grupp7.uppgift1_2_ws.Uppgift2_ServiceSoap getUppgift2_ServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
