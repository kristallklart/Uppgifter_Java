package Grupp7.uppgift3_ws;

public class Uppgift3_ServiceSoapProxy implements Grupp7.uppgift3_ws.Uppgift3_ServiceSoap {
  private String _endpoint = null;
  private Grupp7.uppgift3_ws.Uppgift3_ServiceSoap serviceSoap = null;
  
  public Uppgift3_ServiceSoapProxy() {
    _initServiceSoapProxy();
  }
  
  public Uppgift3_ServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceSoapProxy();
  }
  
  private void _initServiceSoapProxy() {
    try {
      serviceSoap = (new Grupp7.uppgift3_ws.Uppgift3_ServiceLocator()).getServiceSoap();
      if (serviceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serviceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serviceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serviceSoap != null)
      ((javax.xml.rpc.Stub)serviceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Grupp7.uppgift3_ws.Uppgift3_ServiceSoap getServiceSoap() {
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap;
  }
  
  public java.lang.String helloWorld() throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.helloWorld();
  }
  
  public Grupp7.uppgift3_ws.Employee[] getEmployees() throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.getEmployees();
  }
  
  public Grupp7.uppgift3_ws.EmployeeRelative[] getEmployeeRelatives() throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.getEmployeeRelatives();
  }
  
  public Grupp7.uppgift3_ws.Employee[] getSickleave() throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.getSickleave();
  }
  
  public Grupp7.uppgift3_ws.Employee[] getMostSick() throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.getMostSick();
  }
  
  public java.lang.String[] getKeys() throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.getKeys();
  }
  
  public Grupp7.uppgift3_ws.Index[] getIndices() throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.getIndices();
  }
  
  public Grupp7.uppgift3_ws.TableConstraint[] getConstraints() throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.getConstraints();
  }
  
  public java.lang.String[] getTablesOne() throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.getTablesOne();
  }
  
  public java.lang.String[] getTablesTwo() throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.getTablesTwo();
  }
  
  public java.lang.String[] getColumnsOne() throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.getColumnsOne();
  }
  
  public java.lang.String[] getColumnsTwo() throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.getColumnsTwo();
  }
  
  public int updateEmployee(java.lang.String employeeNumber, java.lang.String firstname, java.lang.String lastname) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.updateEmployee(employeeNumber, firstname, lastname);
  }
  
  public int addEmployee(java.lang.String employeeNumber, java.lang.String firstname, java.lang.String lastname) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.addEmployee(employeeNumber, firstname, lastname);
  }
  
  public int deleteEmployee(java.lang.String employeeNumber) throws java.rmi.RemoteException{
    if (serviceSoap == null)
      _initServiceSoapProxy();
    return serviceSoap.deleteEmployee(employeeNumber);
  }
  
  
}