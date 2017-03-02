package uppgift3;

import java.rmi.RemoteException;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import Grupp7.uppgift3_ws.*;


public class Utils {
	
	private static DefaultTableModel model = new DefaultTableModel() {
		private static final long serialVersionUID = 1L;

		@Override
		public boolean isCellEditable(int row, int column) {
			return false;
		}
		
	};
	
	public static DefaultTableModel getEmployees() throws RemoteException{
		
		Employee[] employees = Dal.getEmployees();
		
		Vector<Vector<Object>> columnData = new Vector<Vector<Object>>();

		Vector<String> columnNames = new Vector<String>();
		
		columnNames.add("Employee number");
		columnNames.add("First name");
		columnNames.add("Last name");
		columnNames.add("Title");
		columnNames.add("City");
		
		for (Employee e : employees) {
			Vector<Object> showEmployees = new Vector<Object>();
			showEmployees.add(e.getEmployeeNumber());
			showEmployees.add(e.getFirstName());
			showEmployees.add(e.getLastName());
			showEmployees.add(e.getTitle());
			showEmployees.add(e.getCity());
			
			columnData.add(showEmployees);
		
		}
		
		model.setDataVector(columnData, columnNames);
		return model;
	}
	
	public static DefaultTableModel getEmployeeRelatives() throws RemoteException{
		EmployeeRelative[] employeeRelatives = Dal.getEmployeeRelatives();
		
		Vector<Vector<Object>> columnData = new Vector<Vector<Object>>();

		Vector<String> columnNames = new Vector<String>();
		
		columnNames.add("Employee number");
		columnNames.add("First name");
		columnNames.add("Last name");
		
		for (EmployeeRelative e : employeeRelatives) {
			Vector<Object> showEmployeeRelatives = new Vector<Object>();
			showEmployeeRelatives.add(e.getEmployeeNumber());
			showEmployeeRelatives.add(e.getFirstName());
			showEmployeeRelatives.add(e.getLastName());
			columnData.add(showEmployeeRelatives);
		}
		
		model.setDataVector(columnData, columnNames);
		return model;
	}
	
	public static DefaultTableModel getSickleave() throws RemoteException{
		Employee[] employees = Dal.getSickleave();
		
		Vector<Vector<Object>> columnData = new Vector<Vector<Object>>();

		Vector<String> columnNames = new Vector<String>();
		
		columnNames.add("Employee number");
		columnNames.add("First name");
		columnNames.add("Last name");
		columnNames.add("From date");
		
		for (Employee e : employees) {
			Vector<Object> showPurposes = new Vector<Object>();
			showPurposes.add(e.getEmployeeNumber());
			showPurposes.add(e.getFirstName());
			showPurposes.add(e.getLastName());
			showPurposes.add(e.getFromDate().getTime());
			columnData.add(showPurposes);
		}
		
		model.setDataVector(columnData, columnNames);
		return model;
	}
	
	public static DefaultTableModel getMostSick() throws RemoteException{
		Employee[] employees = Dal.getMostSick();
		
		Vector<Vector<Object>> columnData = new Vector<Vector<Object>>();

		Vector<String> columnNames = new Vector<String>();
		
		columnNames.add("First name");
		columnNames.add("Number of days sick");
		
		
		for (Employee e : employees) {
			Vector<Object> showMostSick = new Vector<Object>();
			showMostSick.add(e.getFirstName());
			showMostSick.add(e.getNumberOfSickDays());
			
			columnData.add(showMostSick);
		}
		
		model.setDataVector(columnData, columnNames);
		return model;
	}
	
	public static DefaultTableModel getKeys() throws RemoteException{
		String[] keys = Dal.getKeys();
		
		Vector<Vector<Object>> columnData = new Vector<Vector<Object>>();

		Vector<String> columnNames = new Vector<String>();
		
		columnNames.add("Keys");
		
		for (String s : keys) {
			Vector<Object> showKeys = new Vector<Object>();
			showKeys.add(s);
			columnData.add(showKeys);
		}
		
		model.setDataVector(columnData, columnNames);
		return model;
	}
	
	public static DefaultTableModel getIndices() throws RemoteException{
		Index[] indices = Dal.getIndices();
		
		Vector<Vector<Object>> columnData = new Vector<Vector<Object>>();

		Vector<String> columnNames = new Vector<String>();
		
		columnNames.add("Object id");
		columnNames.add("Name");
		columnNames.add("Index id");
		columnNames.add("Type");
		columnNames.add("Type description");
		
		for (Index i : indices) {
			Vector<Object> showIndices = new Vector<Object>();
			showIndices.add(i.getObjectId());
			showIndices.add(i.getName());
			showIndices.add(i.getIndexId());
			showIndices.add(i.getType());
			showIndices.add(i.getTypeDescription());
			columnData.add(showIndices);
		}
		
		model.setDataVector(columnData, columnNames);
		return model;
	}
	
	public static DefaultTableModel getConstraints() throws RemoteException{
		TableConstraint[] constraints = Dal.getConstraints();
		
		Vector<Vector<Object>> columnData = new Vector<Vector<Object>>();

		Vector<String> columnNames = new Vector<String>();
		
		columnNames.add("Table constraint catalog");
		columnNames.add("Name");
		columnNames.add("Table catalog");
		
		for (TableConstraint tc : constraints) {
			Vector<Object> showConstraints = new Vector<Object>();
			showConstraints.add(tc.getTableConstraintCatalog());
			showConstraints.add(tc.getName());
			showConstraints.add(tc.getTableCatalog());
			columnData.add(showConstraints);
		}
		
		model.setDataVector(columnData, columnNames);
		return model;
	}
	
	public static DefaultTableModel getTablesOne() throws RemoteException{
		String[] tables = Dal.getTablesOne();
		
		Vector<Vector<Object>> columnData = new Vector<Vector<Object>>();

		Vector<String> columnNames = new Vector<String>();
		
		columnNames.add("All tables in CRONUS Sverige AB");
		
		for (String s : tables) {
			Vector<Object> showTables = new Vector<Object>();
			showTables.add(s);
			columnData.add(showTables);
		}
		
		model.setDataVector(columnData, columnNames);
		return model;
	}
	
	public static DefaultTableModel getTablesTwo() throws RemoteException{
		String[] tables = Dal.getTablesTwo();
		
		Vector<Vector<Object>> columnData = new Vector<Vector<Object>>();

		Vector<String> columnNames = new Vector<String>();
		
		columnNames.add("All tables in CRONUS Sverige AB");
		
		for (String s : tables) {
			Vector<Object> showTables = new Vector<Object>();
			showTables.add(s);
			columnData.add(showTables);
		}
		
		model.setDataVector(columnData, columnNames);
		return model;
	}
	
	public static DefaultTableModel getColumnsOne() throws RemoteException{
		String[] columns = Dal.getColumnsOne();
		
		Vector<Vector<Object>> columnData = new Vector<Vector<Object>>();

		Vector<String> columnNames = new Vector<String>();
		
		columnNames.add("All columns in Employee table");
		
		for (String s : columns) {
			Vector<Object> showColumns = new Vector<Object>();
			showColumns.add(s);
			columnData.add(showColumns);
		}
		
		model.setDataVector(columnData, columnNames);
		return model;
	}
	
	public static DefaultTableModel getColumnsTwo() throws RemoteException{
		String[] tables = Dal.getColumnsTwo();
		
		Vector<Vector<Object>> columnData = new Vector<Vector<Object>>();

		Vector<String> columnNames = new Vector<String>();
		
		columnNames.add("All columns in Employee table");
		
		for (String s : tables) {
			Vector<Object> showColumns = new Vector<Object>();
			showColumns.add(s);
			columnData.add(showColumns);
		}
		
		model.setDataVector(columnData, columnNames);
		return model;
	}

	public static int updateEmployee(String employeeNumber, String firstname, String lastname) throws RemoteException {
        return Dal.updateEmployee(employeeNumber, firstname, lastname);
    }

    public static int addEmployee(String employeeNumber, String firstname, String lastname) throws RemoteException {
        return Dal.addEmployee(employeeNumber, firstname, lastname);
    }

    public static int deleteEmployee(String employeeNumber) throws RemoteException {
        return Dal.deleteEmployee(employeeNumber);
    }
}
