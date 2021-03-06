package Grupp7.uppgift1_2_ws;

public class Uppgift2_ServiceSoapProxy implements Grupp7.uppgift1_2_ws.Uppgift2_ServiceSoap {
  private String _endpoint = null;
  private Grupp7.uppgift1_2_ws.Uppgift2_ServiceSoap uppgift2_ServiceSoap = null;
  
  public Uppgift2_ServiceSoapProxy() {
    _initUppgift2_ServiceSoapProxy();
  }
  
  public Uppgift2_ServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initUppgift2_ServiceSoapProxy();
  }
  
  private void _initUppgift2_ServiceSoapProxy() {
    try {
      uppgift2_ServiceSoap = (new Grupp7.uppgift1_2_ws.Uppgift2_ServiceLocator()).getUppgift2_ServiceSoap();
      if (uppgift2_ServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)uppgift2_ServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)uppgift2_ServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (uppgift2_ServiceSoap != null)
      ((javax.xml.rpc.Stub)uppgift2_ServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Grupp7.uppgift1_2_ws.Uppgift2_ServiceSoap getUppgift2_ServiceSoap() {
    if (uppgift2_ServiceSoap == null)
      _initUppgift2_ServiceSoapProxy();
    return uppgift2_ServiceSoap;
  }
  
  public Grupp7.uppgift1_2_ws.User[] getAllUsers() throws java.rmi.RemoteException{
    if (uppgift2_ServiceSoap == null)
      _initUppgift2_ServiceSoapProxy();
    return uppgift2_ServiceSoap.getAllUsers();
  }
  
  public Grupp7.uppgift1_2_ws.Purpose[] getAllPurposes() throws java.rmi.RemoteException{
    if (uppgift2_ServiceSoap == null)
      _initUppgift2_ServiceSoapProxy();
    return uppgift2_ServiceSoap.getAllPurposes();
  }
  
  public Grupp7.uppgift1_2_ws.Location[] getAllLocations() throws java.rmi.RemoteException{
    if (uppgift2_ServiceSoap == null)
      _initUppgift2_ServiceSoapProxy();
    return uppgift2_ServiceSoap.getAllLocations();
  }
  
  public Grupp7.uppgift1_2_ws.UserLocationPurpose[] getAllUserLocationPurposes() throws java.rmi.RemoteException{
    if (uppgift2_ServiceSoap == null)
      _initUppgift2_ServiceSoapProxy();
    return uppgift2_ServiceSoap.getAllUserLocationPurposes();
  }
  
  public Grupp7.uppgift1_2_ws.FieldOfProfession[] getAllFieldOfProfessions() throws java.rmi.RemoteException{
    if (uppgift2_ServiceSoap == null)
      _initUppgift2_ServiceSoapProxy();
    return uppgift2_ServiceSoap.getAllFieldOfProfessions();
  }
  
  public Grupp7.uppgift1_2_ws.Message[] getAllMessages() throws java.rmi.RemoteException{
    if (uppgift2_ServiceSoap == null)
      _initUppgift2_ServiceSoapProxy();
    return uppgift2_ServiceSoap.getAllMessages();
  }
  
  public Grupp7.uppgift1_2_ws.Match[] getAllMatches() throws java.rmi.RemoteException{
    if (uppgift2_ServiceSoap == null)
      _initUppgift2_ServiceSoapProxy();
    return uppgift2_ServiceSoap.getAllMatches();
  }
  
  
}