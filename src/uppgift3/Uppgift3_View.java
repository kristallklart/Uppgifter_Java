package uppgift3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;


public class Uppgift3_View {

	private JFrame frame;
	private JLabel lbl_feedback;
	private JPanel contentPane;
	private JTable table_cronusAccess;
	private JTextField textField_employeeNo;
	private JTextField textField_firstName;
	private JTextField textField_lastName;
	private ArrayList<JTextField> textFields = new ArrayList<JTextField>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uppgift3_View window = new Uppgift3_View();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Uppgift3_View() {
		try{
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
				}
			}
			} catch (Exception e) {
				e.printStackTrace();
			}
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 1280, 626);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1262, 561);
		contentPane.add(tabbedPane);

		lbl_feedback = new JLabel();
		lbl_feedback.setBounds(10, 560, 1244, 20);
		contentPane.add(lbl_feedback);

		// ***************************************
		// ***********CRONUS ACCESS TAB***********
		// ***************************************

		//table_Caccess = new JTable();
		JPanel panel_cronusAccess = new JPanel();
		tabbedPane.addTab("Cronus Access", panel_cronusAccess);
		panel_cronusAccess.setLayout(null);

		JScrollPane scrollPane_cronusAccess = new JScrollPane();
		scrollPane_cronusAccess.setBounds(460, 32, 782, 483);
		panel_cronusAccess.add(scrollPane_cronusAccess);

		table_cronusAccess = new JTable();
		scrollPane_cronusAccess.setViewportView(table_cronusAccess);

		JPanel panel_cronusAccess_showTables = new JPanel();
		panel_cronusAccess_showTables.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"Show Employee and Related Tables", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_cronusAccess_showTables.setBounds(10, 11, 392, 128);
		panel_cronusAccess.add(panel_cronusAccess_showTables);
		panel_cronusAccess_showTables.setLayout(null);

		JLabel lbl_cronusAccess_selectOption = new JLabel("Select table");
		lbl_cronusAccess_selectOption.setBounds(23, 45, 87, 23);
		panel_cronusAccess_showTables.add(lbl_cronusAccess_selectOption);

		JComboBox<String> comboBox_cronusAccessTables = new JComboBox<String>();
		comboBox_cronusAccessTables.setBounds(120, 44, 242, 25);
		comboBox_cronusAccessTables.addItem("Employee");
		comboBox_cronusAccessTables.addItem("Relatives");
		comboBox_cronusAccessTables.addItem("Sickleave 2004");
		comboBox_cronusAccessTables.addItem("Most sick");
		panel_cronusAccess_showTables.add(comboBox_cronusAccessTables);
		comboBox_cronusAccessTables.setName("comboBox_caccessTables");

		JButton btn_cronusAccess__showTables = new JButton("Show");
		btn_cronusAccess__showTables.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clearFeedback();
				switch(comboBox_cronusAccessTables.getSelectedIndex()){
				case 0:
					//Employee
					try {
						DefaultTableModel model = Controller.getEmployees();
						table_cronusAccess.setModel(model);
					} catch (RemoteException e) {
						lbl_feedback.setText("Error could not load table.");
					}
					break;
					
				case 1:
					//Relatives
					try {
						DefaultTableModel model = Controller.getEmployeeRelatives();
						table_cronusAccess.setModel(model);
					} catch (RemoteException e) {
						lbl_feedback.setText("Error could not load table.");
					}					
					break;
					
				case 2:
					// Sickleave 2004
					try {
						DefaultTableModel model = Controller.getSickleave();
						table_cronusAccess.setModel(model);
					} catch (RemoteException e) {
						lbl_feedback.setText("Error could not load table.");
					}
					break;
				
				case 3:
					//Most sick
					try {
						DefaultTableModel model = Controller.getMostSick();
						table_cronusAccess.setModel(model);
					} catch (RemoteException e) {
						lbl_feedback.setText("Error could not load table");
					}
					break;
				}
			}
		});
		btn_cronusAccess__showTables.setBounds(254, 85, 108, 23);
		panel_cronusAccess_showTables.add(btn_cronusAccess__showTables);

		JPanel panel_cronusAccess_showMetadata = new JPanel();
		panel_cronusAccess_showMetadata.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"Show Meta data", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_cronusAccess_showMetadata.setBounds(10, 173, 392, 133);
		panel_cronusAccess.add(panel_cronusAccess_showMetadata);
		panel_cronusAccess_showMetadata.setLayout(null);

		JComboBox<String> comboBox_cronusAccessMeta = new JComboBox<String>();
		comboBox_cronusAccessMeta.addItem("Keys");
		comboBox_cronusAccessMeta.addItem("Indexes");
		comboBox_cronusAccessMeta.addItem("Table constraints");
		comboBox_cronusAccessMeta.addItem("All tables 1");
		comboBox_cronusAccessMeta.addItem("All tables 2");
		comboBox_cronusAccessMeta.addItem("Columns employee 1");
		comboBox_cronusAccessMeta.addItem("Columns employee 2");
		comboBox_cronusAccessMeta.setBounds(124, 46, 242, 25);
		panel_cronusAccess_showMetadata.add(comboBox_cronusAccessMeta);
		comboBox_cronusAccessMeta.setName("comboBox_caccessMeta");

		JButton btn_cronusAccess_showMetadata = new JButton("Show");
		btn_cronusAccess_showMetadata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearFeedback();
				switch(comboBox_cronusAccessMeta.getSelectedIndex()){
				case 0:
					//Keys
					try {
						DefaultTableModel model = Controller.getKeys();
						table_cronusAccess.setModel(model);
					} catch (RemoteException ex) {
						lbl_feedback.setText("Error could not load table");
					}
					break;
				case 1:
					//Indexes
					try {
						DefaultTableModel model = Controller.getIndices();
						table_cronusAccess.setModel(model);
					} catch (RemoteException ex) {
						lbl_feedback.setText("Error could not load table");
					}
					break;
				case 2:
					//Table constraints
					try {
						DefaultTableModel model = Controller.getConstraints();
						table_cronusAccess.setModel(model);
					} catch (RemoteException ex) {
						lbl_feedback.setText("Error could not load table");
					}
					break;
				case 3:
					//All tables 1
					try {
						DefaultTableModel model = Controller.getTablesOne();
						table_cronusAccess.setModel(model);
					} catch (RemoteException ex) {
						lbl_feedback.setText("Error could not load table");
					}
					break;
				case 4:
					//All tables 2
					try {
						DefaultTableModel model = Controller.getTablesTwo();
						table_cronusAccess.setModel(model);
					} catch (RemoteException ex) {
						lbl_feedback.setText("Error could not load table");
					}
					break;
				case 5:
					//Columns employee 1
					try {
						DefaultTableModel model = Controller.getColumnsOne();
						table_cronusAccess.setModel(model);
					} catch (RemoteException ex) {
						lbl_feedback.setText("Error could not load table");
					}
					break;
				case 6:
					//Columns employee 2
					try {
						DefaultTableModel model = Controller.getColumnsTwo();
						table_cronusAccess.setModel(model);
					} catch (RemoteException ex) {
						lbl_feedback.setText("Error could not load table");
					}
					break;
				
				}
			}
		});
		btn_cronusAccess_showMetadata.setBounds(258, 87, 108, 23);
		panel_cronusAccess_showMetadata.add(btn_cronusAccess_showMetadata);

		JLabel lbl_cronusAccessQuery = new JLabel("Select query");
		lbl_cronusAccessQuery.setBounds(23, 49, 96, 19);
		panel_cronusAccess_showMetadata.add(lbl_cronusAccessQuery);

		JSeparator separator_cronusAccess = new JSeparator();
		separator_cronusAccess.setBounds(10, 155, 392, 2);
		panel_cronusAccess.add(separator_cronusAccess);
		
		JPanel panel_addUpdateDelete = new JPanel();
		panel_addUpdateDelete.setLayout(null);
		panel_addUpdateDelete.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
					"Add/Update/Delete", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_addUpdateDelete.setBounds(10, 330, 392, 185);
		panel_cronusAccess.add(panel_addUpdateDelete);
		
		JLabel lbl_employee = new JLabel("Employee no:");
		lbl_employee.setBounds(15, 28, 104, 23);
		panel_addUpdateDelete.add(lbl_employee);
		
		JButton btn_addEmploy = new JButton("Add Employee");
		btn_addEmploy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clearFeedback();
				if (validateInput()) {
					try {
						String number = textField_employeeNo.getText().trim();
						String firstName = textField_firstName.getText().trim();
						String lastName = textField_lastName.getText().trim();
						int result = Controller.addEmployee(number, firstName, lastName);
						
						if (result > 0) {
							lbl_feedback.setText("Successfully added employee with number: " + number + ".");
						} else {
							lbl_feedback.setText("Could not add employee with number: " + number + ". Please make sure the number is correct.");
						}
					} catch (RemoteException ex) {
						lbl_feedback.setText("Error could not add employee to database.");
					}
				}
			}
		});
		btn_addEmploy.setBounds(10, 135, 117, 29);
		panel_addUpdateDelete.add(btn_addEmploy);
		
		textField_employeeNo = new JTextField();
		textField_employeeNo.setBounds(123, 26, 192, 26);
		panel_addUpdateDelete.add(textField_employeeNo);
		textField_employeeNo.setColumns(10);
		textFields.add(textField_employeeNo);
		
		JLabel lbl_firstName = new JLabel("First name:");
		lbl_firstName.setBounds(15, 67, 104, 20);
		panel_addUpdateDelete.add(lbl_firstName);
		
		JLabel lbl_lastName = new JLabel("Last name:");
		lbl_lastName.setBounds(15, 104, 104, 20);
		panel_addUpdateDelete.add(lbl_lastName);
		
		textField_firstName = new JTextField();
		textField_firstName.setBounds(123, 64, 192, 26);
		panel_addUpdateDelete.add(textField_firstName);
		textField_firstName.setColumns(10);
		textFields.add(textField_firstName);
		
		textField_lastName = new JTextField();
		textField_lastName.setBounds(123, 101, 192, 26);
		panel_addUpdateDelete.add(textField_lastName);
		textField_lastName.setColumns(10);
		textFields.add(textField_lastName);
		
		JButton btn_updateEmployee = new JButton("Update Employee");
		btn_updateEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearFeedback();
				if (validateInput()) {
					try {
						String number = textField_employeeNo.getText().trim();
						String firstName = textField_firstName.getText().trim();
						String lastName = textField_lastName.getText().trim();
						int result = Controller.updateEmployee(number, firstName, lastName);
						
						if (result > 0) {
							lbl_feedback.setText("Successfully updated employee with number: " + number + ".");
						} else {
							lbl_feedback.setText("Could not update employee with number: " + number + ". Please make sure the number is correct.");
						}
					} catch (RemoteException ex) {
						lbl_feedback.setText("Error could not update employee in the database.");
					}
				}
			}
		});
		btn_updateEmployee.setBounds(137, 135, 117, 29);
		panel_addUpdateDelete.add(btn_updateEmployee);
		
		JButton btn_deleteEmployee = new JButton("Delete Employee");
		btn_deleteEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearFeedback();
				if (textField_employeeNo.getText().trim() != "") {
					try {
						String number = textField_employeeNo.getText().trim();
						int result = Controller.deleteEmployee(number);
						
						if (result > 0) {
							lbl_feedback.setText("Successfully deleted employee with number: " + number + ".");
						} else {
							lbl_feedback.setText("Could not delete employee with number: " + number + ". Please make sure the number is correct.");
						}
					} catch (RemoteException ex) {
						lbl_feedback.setText("Error could not update employee in the database.");
					}
				}
			}
		});
		btn_deleteEmployee.setBounds(265, 135, 117, 29);
		panel_addUpdateDelete.add(btn_deleteEmployee);
		
		JLabel lbl_mustNumber = new JLabel(" *");
		lbl_mustNumber.setBounds(318, 29, 28, 20);
		panel_addUpdateDelete.add(lbl_mustNumber);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 317, 392, 2);
		panel_cronusAccess.add(separator);
	}
	
	private void clearTextFields() {
		for (JTextField field : textFields) {
			field.setText("");
		}
	}
	
	private boolean validateInput() {
		if (textField_lastName.getText().trim() != "" ||
			textField_firstName.getText().trim() != "" ||
			textField_employeeNo.getText().trim() != "") {
			return true;
		} else {
			return false;
		}
	}

	private void clearFeedback() {
		lbl_feedback.setText("");
	}

}
