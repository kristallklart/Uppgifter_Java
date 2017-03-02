package uppgift2;

import javax.swing.table.DefaultTableModel;

import Grupp7.uppgift1_2_ws.FieldOfProfession;
import Grupp7.uppgift1_2_ws.Location;
import Grupp7.uppgift1_2_ws.Match;
import Grupp7.uppgift1_2_ws.Message;
import Grupp7.uppgift1_2_ws.Purpose;
import Grupp7.uppgift1_2_ws.User;
import Grupp7.uppgift1_2_ws.UserLocationPurpose;

import java.rmi.RemoteException;

public class Uppgift2Controller {
	
	public static DefaultTableModel getUsersTable() throws RemoteException{
		return Uppgift2Utils.getUsersTable();
	}
	
	public static DefaultTableModel getLocationsTable() throws RemoteException{
		return Uppgift2Utils.getLocationsTable();
	}
	
	public static DefaultTableModel getPurposesTable() throws RemoteException{
		return Uppgift2Utils.getPurposesTable();
	}
	
	public static DefaultTableModel getUserLocationPurposesTable() throws RemoteException{
		return Uppgift2Utils.getUserLocationPurposesTable();
	}
	
	public static DefaultTableModel getFieldOfProfessionsTable() throws RemoteException{
		return Uppgift2Utils.getFieldOfProfessionsTable();
	}
	
	public static DefaultTableModel getMatchesTable() throws RemoteException{
		return Uppgift2Utils.getMatchesTable();
	}
	
	public static DefaultTableModel getMessagesTable() throws RemoteException{
		return Uppgift2Utils.getMessagesTable();
	}
}
