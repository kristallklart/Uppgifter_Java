package uppgift1;
//import Uppgift1_OpenFile;

import java.rmi.RemoteException;

public class Uppgift1_Controller {
	
	public static String getFileContent(String s) throws RemoteException {
		return Uppgift1_FileHandler.getFileContent(s);
	}
}
