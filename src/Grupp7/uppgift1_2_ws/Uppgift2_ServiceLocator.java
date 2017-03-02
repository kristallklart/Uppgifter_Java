/**
 * Uppgift2_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Grupp7.uppgift1_2_ws;

public class Uppgift2_ServiceLocator extends org.apache.axis.client.Service implements Grupp7.uppgift1_2_ws.Uppgift2_Service {

/**
 * This web service has multiple web methods which all takes zero
 * arguments and returns an object collection of all the entities in
 * a given table in the Friendly Database if successful. If an error
 * occurs the methods will throw a FaultException which must be handled
 * by the client.
 */

    public Uppgift2_ServiceLocator() {
    }


    public Uppgift2_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Uppgift2_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Uppgift2_ServiceSoap
    private java.lang.String Uppgift2_ServiceSoap_address = "http://localhost:53586/Uppgift2_Service.asmx";

    public java.lang.String getUppgift2_ServiceSoapAddress() {
        return Uppgift2_ServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Uppgift2_ServiceSoapWSDDServiceName = "Uppgift2_ServiceSoap";

    public java.lang.String getUppgift2_ServiceSoapWSDDServiceName() {
        return Uppgift2_ServiceSoapWSDDServiceName;
    }

    public void setUppgift2_ServiceSoapWSDDServiceName(java.lang.String name) {
        Uppgift2_ServiceSoapWSDDServiceName = name;
    }

    public Grupp7.uppgift1_2_ws.Uppgift2_ServiceSoap getUppgift2_ServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Uppgift2_ServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUppgift2_ServiceSoap(endpoint);
    }

    public Grupp7.uppgift1_2_ws.Uppgift2_ServiceSoap getUppgift2_ServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Grupp7.uppgift1_2_ws.Uppgift2_ServiceSoapStub _stub = new Grupp7.uppgift1_2_ws.Uppgift2_ServiceSoapStub(portAddress, this);
            _stub.setPortName(getUppgift2_ServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUppgift2_ServiceSoapEndpointAddress(java.lang.String address) {
        Uppgift2_ServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Grupp7.uppgift1_2_ws.Uppgift2_ServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                Grupp7.uppgift1_2_ws.Uppgift2_ServiceSoapStub _stub = new Grupp7.uppgift1_2_ws.Uppgift2_ServiceSoapStub(new java.net.URL(Uppgift2_ServiceSoap_address), this);
                _stub.setPortName(getUppgift2_ServiceSoapWSDDServiceName());
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
        if ("Uppgift2_ServiceSoap".equals(inputPortName)) {
            return getUppgift2_ServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("Grupp7", "Uppgift2_Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("Grupp7", "Uppgift2_ServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Uppgift2_ServiceSoap".equals(portName)) {
            setUppgift2_ServiceSoapEndpointAddress(address);
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
