package uppgift2;

import javax.swing.table.DefaultTableModel;
import java.rmi.RemoteException;
import Grupp7.FieldOfProfession;
import Grupp7.Location;
import Grupp7.Match;
import Grupp7.Message;
import Grupp7.Purpose;
import Grupp7.User;
import Grupp7.UserLocationPurpose;

public class Uppgift2_Controller {
	
	public static DefaultTableModel getUsersTable() throws RemoteException{
		return Utils.getUsersTable();
	}
	/*public static User[] getAllUsers() throws RemoteException {
		return Uppgift2_Dal.getAllUsers();
	}*/
	
	public static DefaultTableModel getLocationsTable() throws RemoteException{
		return Utils.getLocationsTable();
	}
	
	/*public static Location[] getAllLocations() throws RemoteException {
		return Uppgift2_Dal.getAllLocations();
	}*/
	
	public static DefaultTableModel getPurposesTable() throws RemoteException{
		return Utils.getPurposesTable();
	}
	
	/*public static UserLocationPurpose[] getAllUserLocationPurposes() throws RemoteException {
		return Uppgift2_Dal.getAllUserLocationPurposes();
	}*/
	
	public static DefaultTableModel getUserLocationPurposesTable() throws RemoteException{
		return Utils.getUserLocationPurposesTable();
	}

	/*public static Purpose[] getAllPurposes() throws RemoteException {
		return Uppgift2_Dal.getAllPurposes();
	}*/
	
	public static DefaultTableModel getFieldOfProfessionsTable() throws RemoteException{
		return Utils.getFieldOfProfessionsTable();
	}
	
	/*public static FieldOfProfession[] getAllFieldOfProfessions() throws RemoteException {
		return Uppgift2_Dal.getAllFieldOfProfessions();
	}*/
	
	public static DefaultTableModel getMatchesTable() throws RemoteException{
		return Utils.getMatchesTable();
	}
	
	public static DefaultTableModel getMessagesTable() throws RemoteException{
		return Utils.getMessagesTable();
	}
	
	/*public static Message[] getAllMessages() throws RemoteException {
		return Uppgift2_Dal.getAllMessages();
	}*/
}
