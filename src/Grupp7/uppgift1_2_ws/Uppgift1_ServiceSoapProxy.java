package Grupp7.uppgift1_2_ws;

public class Uppgift1_ServiceSoapProxy implements Grupp7.uppgift1_2_ws.Uppgift1_ServiceSoap {
  private String _endpoint = null;
  private Grupp7.uppgift1_2_ws.Uppgift1_ServiceSoap uppgift1_ServiceSoap = null;
  
  public Uppgift1_ServiceSoapProxy() {
    _initUppgift1_ServiceSoapProxy();
  }
  
  public Uppgift1_ServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initUppgift1_ServiceSoapProxy();
  }
  
  private void _initUppgift1_ServiceSoapProxy() {
    try {
      uppgift1_ServiceSoap = (new Grupp7.uppgift1_2_ws.Uppgift1_ServiceLocator()).getUppgift1_ServiceSoap();
      if (uppgift1_ServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)uppgift1_ServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)uppgift1_ServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (uppgift1_ServiceSoap != null)
      ((javax.xml.rpc.Stub)uppgift1_ServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Grupp7.uppgift1_2_ws.Uppgift1_ServiceSoap getUppgift1_ServiceSoap() {
    if (uppgift1_ServiceSoap == null)
      _initUppgift1_ServiceSoapProxy();
    return uppgift1_ServiceSoap;
  }
  
  public java.lang.String openFile(java.lang.String s) throws java.rmi.RemoteException{
    if (uppgift1_ServiceSoap == null)
      _initUppgift1_ServiceSoapProxy();
    return uppgift1_ServiceSoap.openFile(s);
  }
  
  
}