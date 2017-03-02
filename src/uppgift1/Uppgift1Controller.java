package uppgift1;
//import Uppgift1_OpenFile;

import java.rmi.RemoteException;

public class Uppgift1Controller {
	
	public static String getFileContent(String s) throws RemoteException {
		return Uppgift1FileHandler.getFileContent(s);
	}
}
