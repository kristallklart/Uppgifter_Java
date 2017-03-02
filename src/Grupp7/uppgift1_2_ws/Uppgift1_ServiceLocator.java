/**
 * Uppgift1_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Grupp7.uppgift1_2_ws;

public class Uppgift1_ServiceLocator extends org.apache.axis.client.Service implements Grupp7.uppgift1_2_ws.Uppgift1_Service {

/**
 * This web service has one web method which takes a string filename/filepath
 * as parameter and returns the file content to the caller as a string
 * if successful. If an error occurs, the web method throws a FaultException
 * which must be handled by the client.
 */

    public Uppgift1_ServiceLocator() {
    }


    public Uppgift1_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Uppgift1_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Uppgift1_ServiceSoap
    private java.lang.String Uppgift1_ServiceSoap_address = "http://localhost:51873/Uppgift1_Service.asmx";

    public java.lang.String getUppgift1_ServiceSoapAddress() {
        return Uppgift1_ServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Uppgift1_ServiceSoapWSDDServiceName = "Uppgift1_ServiceSoap";

    public java.lang.String getUppgift1_ServiceSoapWSDDServiceName() {
        return Uppgift1_ServiceSoapWSDDServiceName;
    }

    public void setUppgift1_ServiceSoapWSDDServiceName(java.lang.String name) {
        Uppgift1_ServiceSoapWSDDServiceName = name;
    }

    public Grupp7.uppgift1_2_ws.Uppgift1_ServiceSoap getUppgift1_ServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Uppgift1_ServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUppgift1_ServiceSoap(endpoint);
    }

    public Grupp7.uppgift1_2_ws.Uppgift1_ServiceSoap getUppgift1_ServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Grupp7.uppgift1_2_ws.Uppgift1_ServiceSoapStub _stub = new Grupp7.uppgift1_2_ws.Uppgift1_ServiceSoapStub(portAddress, this);
            _stub.setPortName(getUppgift1_ServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUppgift1_ServiceSoapEndpointAddress(java.lang.String address) {
        Uppgift1_ServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Grupp7.uppgift1_2_ws.Uppgift1_ServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                Grupp7.uppgift1_2_ws.Uppgift1_ServiceSoapStub _stub = new Grupp7.uppgift1_2_ws.Uppgift1_ServiceSoapStub(new java.net.URL(Uppgift1_ServiceSoap_address), this);
                _stub.setPortName(getUppgift1_ServiceSoapWSDDServiceName());
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
        if ("Uppgift1_ServiceSoap".equals(inputPortName)) {
            return getUppgift1_ServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("Grupp7", "Uppgift1_Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("Grupp7", "Uppgift1_ServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Uppgift1_ServiceSoap".equals(portName)) {
            setUppgift1_ServiceSoapEndpointAddress(address);
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
