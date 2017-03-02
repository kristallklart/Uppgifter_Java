package uppgift1;

import java.rmi.RemoteException;

import Grupp7.Uppgift1_ServiceSoapProxy;

public class Uppgift1FileHandler {
	
	static Uppgift1_ServiceSoapProxy proxy = new Uppgift1_ServiceSoapProxy();
	//
	public static String getFileContent(String s) throws RemoteException {
		String fileContent;
		fileContent = proxy.openFile(s);
		return fileContent;
	}
	
}
