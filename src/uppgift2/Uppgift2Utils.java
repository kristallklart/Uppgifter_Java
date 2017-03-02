package uppgift2;

import java.rmi.RemoteException;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import Grupp7.FieldOfProfession;
import Grupp7.Location;
import Grupp7.Match;
import Grupp7.Message;
import Grupp7.Purpose;
//import Grupp7.Uppgift2_ServiceSoapProxy;
import Grupp7.User;
import Grupp7.UserLocationPurpose;

public class Uppgift2Utils {
	
	//static Uppgift2_ServiceSoapProxy proxy = new Uppgift2_ServiceSoapProxy();
	
	public static DefaultTableModel getUsersTable() throws RemoteException{
		
		User[] users = Uppgift2Dal.getAllUsers();
		
		Vector<Vector<Object>> columnData = new Vector<Vector<Object>>();

		Vector<String> columnNames = new Vector<String>();
		
		columnNames.add("Username");
		columnNames.add("First name");
		columnNames.add("Last name");
		columnNames.add("Birth date");
		columnNames.add("Profession");
		columnNames.add("Password");
		columnNames.add("About");
		columnNames.add("Industry");
		
		for (User user : users) {
			Vector<Object> showUsers = new Vector<Object>();
			showUsers.add(user.getUserName());
			showUsers.add(user.getFirstName());
			showUsers.add(user.getLastName());
			showUsers.add(user.getBirthDate().getTime());
			showUsers.add(user.getProfession());
			showUsers.add(user.getPassword());
			showUsers.add(user.getAbout());
			showUsers.add(user.getIndustry());
			
			columnData.add(showUsers);
			//TypeDesc td = user.getTypeDesc();
		}
		
		DefaultTableModel model = new DefaultTableModel(columnData, columnNames);
		return model;
	}
	
	public static DefaultTableModel getLocationsTable() throws RemoteException{
		Location[] locations = Uppgift2Dal.getAllLocations();
		
		Vector<Vector<Object>> columnData = new Vector<Vector<Object>>();

		Vector<String> columnNames = new Vector<String>();
		
		columnNames.add("City");
		
		for (Location location : locations) {
			Vector<Object> showLocations = new Vector<Object>();
			showLocations.add(location.getCity());		
			columnData.add(showLocations);
		}
		
		DefaultTableModel model = new DefaultTableModel(columnData, columnNames);
		return model;
	}
	
	public static DefaultTableModel getPurposesTable() throws RemoteException{
		Purpose[] purposes = Uppgift2Dal.getAllPurposes();
		
		Vector<Vector<Object>> columnData = new Vector<Vector<Object>>();

		Vector<String> columnNames = new Vector<String>();
		
		columnNames.add("Purpose");
		
		for (Purpose purpose : purposes) {
			Vector<Object> showPurposes = new Vector<Object>();
			showPurposes.add(purpose.getPurposeType());		
			columnData.add(showPurposes);
		}
		
		DefaultTableModel model = new DefaultTableModel(columnData, columnNames);
		return model;
	}
	
	public static DefaultTableModel getUserLocationPurposesTable() throws RemoteException{
		UserLocationPurpose[] userLocationPurposes = Uppgift2Dal.getAllUserLocationPurposes();
		
		Vector<Vector<Object>> columnData = new Vector<Vector<Object>>();

		Vector<String> columnNames = new Vector<String>();
		
		columnNames.add("City");
		columnNames.add("Username");
		columnNames.add("Purpose");
		columnNames.add("From date");
		columnNames.add("To date");
		
		for (UserLocationPurpose userLocationPurpose : userLocationPurposes) {
			Vector<Object> showUserLocationPurposes = new Vector<Object>();
			showUserLocationPurposes.add(userLocationPurpose.getCity());
			showUserLocationPurposes.add(userLocationPurpose.getUsername());
			showUserLocationPurposes.add(userLocationPurpose.getPurposetype());
			showUserLocationPurposes.add(userLocationPurpose.getFromDate().getTime());
			showUserLocationPurposes.add(userLocationPurpose.getToDate().getTime());
			columnData.add(showUserLocationPurposes);
		}
		
		DefaultTableModel model = new DefaultTableModel(columnData, columnNames);
		return model;
	}
	
	public static DefaultTableModel getFieldOfProfessionsTable() throws RemoteException{
		FieldOfProfession[] fieldOfProfessions = Uppgift2Dal.getAllFieldOfProfessions();
		
		Vector<Vector<Object>> columnData = new Vector<Vector<Object>>();

		Vector<String> columnNames = new Vector<String>();
		
		columnNames.add("Industry");
		
		//Industry
		
		for (FieldOfProfession fieldOfProfession : fieldOfProfessions) {
			Vector<Object> showUserLocationPurposes = new Vector<Object>();
			showUserLocationPurposes.add(fieldOfProfession.getIndustry());
			columnData.add(showUserLocationPurposes);
		}
		
		DefaultTableModel model = new DefaultTableModel(columnData, columnNames);
		return model;
	}
	
	public static DefaultTableModel getMatchesTable() throws RemoteException{
		Match[] matches = Uppgift2Dal.getAllMatches();
		
		Vector<Vector<Object>> columnData = new Vector<Vector<Object>>();

		Vector<String> columnNames = new Vector<String>();
		
		columnNames.add("Username");
		columnNames.add("Match username");
		
		for (Match match : matches) {
			Vector<Object> showMatches = new Vector<Object>();
			showMatches.add(match.getUsername());
			showMatches.add(match.getMatchUsername());
			columnData.add(showMatches);
		}
		
		DefaultTableModel model = new DefaultTableModel(columnData, columnNames);
		return model;
	}
	
	public static DefaultTableModel getMessagesTable() throws RemoteException{
		Message[] messages = Uppgift2Dal.getAllMessages();
		
		Vector<Vector<Object>> columnData = new Vector<Vector<Object>>();

		Vector<String> columnNames = new Vector<String>();
		
		columnNames.add("Id");
		columnNames.add("Sender");
		columnNames.add("Reciever");
		columnNames.add("Content");
		
		for (Message message : messages) {
			Vector<Object> showMessages = new Vector<Object>();
			showMessages.add(message.getId());
			showMessages.add(message.getSender());
			showMessages.add(message.getReciever());
			showMessages.add(message.getContent());
			columnData.add(showMessages);
		}
		
		DefaultTableModel model = new DefaultTableModel(columnData, columnNames);
		return model;
	}
}
