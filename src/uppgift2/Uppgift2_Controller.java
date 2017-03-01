package uppgift2;

import java.rmi.RemoteException;
import Grupp7.FieldOfProfession;
import Grupp7.Location;
import Grupp7.Match;
import Grupp7.Message;
import Grupp7.Purpose;
import Grupp7.User;
import Grupp7.UserLocationPurpose;

public class Uppgift2_Controller {
	
	public static User[] getAllUsers() throws RemoteException{
		return Uppgift2_Dal.getAllUsers();
	}
	
	public static Location[] getAllLocations() throws RemoteException{
		return Uppgift2_Dal.getAllLocations();
	}
	
	public static UserLocationPurpose[] getAllUserLocationPurposes() throws RemoteException{
		return Uppgift2_Dal.getAllUserLocationPurposes();
	}
	
	public static Purpose[] getAllPurposes() throws RemoteException{
		return Uppgift2_Dal.getAllPurposes();
	}
	
	public static FieldOfProfession[] getAllFieldOfProfessions() throws RemoteException{
		return Uppgift2_Dal.getAllFieldOfProfessions();
	}
	
	public static Match[] getAllMatches() throws RemoteException{
		return Uppgift2_Dal.getAllMatches();
	}
	
	public static Message[] getAllMessages() throws RemoteException{
		return Uppgift2_Dal.getAllMessages();
	}
}
