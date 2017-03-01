package uppgift2;

import java.rmi.RemoteException;
import Grupp7.FieldOfProfession;
import Grupp7.Location;
import Grupp7.Match;
import Grupp7.Message;
import Grupp7.Purpose;
import Grupp7.Uppgift2_ServiceSoapProxy;
import Grupp7.User;
import Grupp7.UserLocationPurpose;

public class Uppgift2_Dal {
	
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
