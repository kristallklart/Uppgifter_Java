package uppgift2;

import java.rmi.RemoteException;

import Grupp7.uppgift1_2_ws.FieldOfProfession;
import Grupp7.uppgift1_2_ws.Location;
import Grupp7.uppgift1_2_ws.Match;
import Grupp7.uppgift1_2_ws.Message;
import Grupp7.uppgift1_2_ws.Purpose;
import Grupp7.uppgift1_2_ws.Uppgift2_ServiceSoapProxy;
import Grupp7.uppgift1_2_ws.User;
import Grupp7.uppgift1_2_ws.UserLocationPurpose;

public class Uppgift2Dal {
	
	static Uppgift2_ServiceSoapProxy proxy = new Uppgift2_ServiceSoapProxy();

	public static User[] getAllUsers() throws RemoteException {
		return proxy.getAllUsers();
	}
	
	public static Location[] getAllLocations() throws RemoteException {
		return proxy.getAllLocations();
	}
	
	public static Purpose[] getAllPurposes() throws RemoteException {
		return proxy.getAllPurposes();
	}
	
	public static UserLocationPurpose[] getAllUserLocationPurposes() throws RemoteException {
		return proxy.getAllUserLocationPurposes();
	}
	
	public static FieldOfProfession[] getAllFieldOfProfessions() throws RemoteException {
		return proxy.getAllFieldOfProfessions();
	}
	
	public static Match[] getAllMatches() throws RemoteException {
		return proxy.getAllMatches();
	}
	
	public static Message[] getAllMessages() throws RemoteException {
		return proxy.getAllMessages();
	}
}
