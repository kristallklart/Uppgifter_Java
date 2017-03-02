package uppgift2;

import java.rmi.RemoteException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import Grupp7.uppgift1_2_ws.FieldOfProfession;
import Grupp7.uppgift1_2_ws.Location;
import Grupp7.uppgift1_2_ws.Match;
import Grupp7.uppgift1_2_ws.Message;
import Grupp7.uppgift1_2_ws.Purpose;
import Grupp7.uppgift1_2_ws.User;
import Grupp7.uppgift1_2_ws.UserLocationPurpose;

public class Uppgift2Utils {
	
	private static DefaultTableModel model = new DefaultTableModel() {
		private static final long serialVersionUID = 1L;
		@Override
		public boolean isCellEditable(int row, int column) {
			return false;
		}
		
	};
	
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
		}
		
		model.setDataVector(columnData, columnNames);
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
		
		model.setDataVector(columnData, columnNames);
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
		
		model.setDataVector(columnData, columnNames);
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
		
		model.setDataVector(columnData, columnNames);
		return model;
	}
	
	public static DefaultTableModel getFieldOfProfessionsTable() throws RemoteException{
		FieldOfProfession[] fieldOfProfessions = Uppgift2Dal.getAllFieldOfProfessions();
		
		Vector<Vector<Object>> columnData = new Vector<Vector<Object>>();

		Vector<String> columnNames = new Vector<String>();
		
		columnNames.add("Industry");
		
		for (FieldOfProfession fieldOfProfession : fieldOfProfessions) {
			Vector<Object> showUserLocationPurposes = new Vector<Object>();
			showUserLocationPurposes.add(fieldOfProfession.getIndustry());
			columnData.add(showUserLocationPurposes);
		}
		
		model.setDataVector(columnData, columnNames);
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
		
		model.setDataVector(columnData, columnNames);
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
		
		model.setDataVector(columnData, columnNames);
		return model;
	}
}
