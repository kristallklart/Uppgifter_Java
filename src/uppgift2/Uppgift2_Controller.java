package uppgift2;
import java.rmi.RemoteException;

import javax.swing.table.DefaultTableModel;

public class Uppgift2_Controller {
	
	public static DefaultTableModel getUsersTable() throws RemoteException{
		return Utils.getUsersTable();
	}
	
	public static DefaultTableModel getLocationsTable() throws RemoteException{
		return Utils.getLocationsTable();
	}
	
	public static DefaultTableModel getPurposesTable() throws RemoteException{
		return Utils.getPurposesTable();
	}
	
	public static DefaultTableModel getUserLocationPurposesTable() throws RemoteException{
		return Utils.getUserLocationPurposesTable();
	}
	
	public static DefaultTableModel getFieldOfProfessionsTable() throws RemoteException{
		return Utils.getFieldOfProfessionsTable();
	}
	
	public static DefaultTableModel getMatchesTable() throws RemoteException{
		return Utils.getMatchesTable();
	}
	
	public static DefaultTableModel getMessagesTable() throws RemoteException{
		return Utils.getMessagesTable();
	}
}
