package uppgift3;

import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
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


public class Uppgift3View {

	private JFrame frame;
	private JLabel lblFeedback;
	private JPanel contentPane;
	private JTable tableCronusAccess;
	private JTextField textFieldAddUpdateEmployeeNo;
	private JTextField textFieldFirstName;
	private JTextField textFieldLastName;
	private ArrayList<JTextField> textFields = new ArrayList<JTextField>();
	private final String errorMessage = "Error: Could not load the table.";
	private JTextField textFieldDeleteEmployeeNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uppgift3View window = new Uppgift3View();
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
	public Uppgift3View() {
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
		frame.setBounds(100, 100, 1280, 760);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1262, 695);
		contentPane.add(tabbedPane);

		lblFeedback = new JLabel();
		lblFeedback.setBounds(10, 694, 1244, 27);
		contentPane.add(lblFeedback);

		// ***************************************
		// ***********CRONUS ACCESS TAB***********
		// ***************************************

		//table_Caccess = new JTable();
		JPanel panelCronusAccess = new JPanel();
		tabbedPane.addTab("Cronus Access", panelCronusAccess);
		panelCronusAccess.setLayout(null);

		JScrollPane scrollPaneCronusAccess = new JScrollPane();
		scrollPaneCronusAccess.setBounds(460, 11, 782, 645);
		panelCronusAccess.add(scrollPaneCronusAccess);

		tableCronusAccess = new JTable();
		scrollPaneCronusAccess.setViewportView(tableCronusAccess);

		JPanel panelCronusAccessShowTables = new JPanel();
		panelCronusAccessShowTables.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"Show Employee and Related Tables", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelCronusAccessShowTables.setBounds(10, 11, 392, 128);
		panelCronusAccess.add(panelCronusAccessShowTables);
		panelCronusAccessShowTables.setLayout(null);

		JLabel lblCronusAccessSelectOption = new JLabel("Select table");
		lblCronusAccessSelectOption.setBounds(23, 45, 87, 23);
		panelCronusAccessShowTables.add(lblCronusAccessSelectOption);

		JComboBox<String> comboBox_cronusAccessTables = new JComboBox<String>();
		comboBox_cronusAccessTables.setBounds(120, 44, 242, 25);
		comboBox_cronusAccessTables.addItem("Employee");
		comboBox_cronusAccessTables.addItem("Relatives");
		comboBox_cronusAccessTables.addItem("Sickleave 2004");
		comboBox_cronusAccessTables.addItem("Most sick");
		panelCronusAccessShowTables.add(comboBox_cronusAccessTables);
		comboBox_cronusAccessTables.setName("comboBox_caccessTables");

		JButton btnCronusAccessShowTables = new JButton("Show");
		btnCronusAccessShowTables.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clearFeedback();
				switch(comboBox_cronusAccessTables.getSelectedIndex()){
				case 0:
					//Employee
					try {
						DefaultTableModel model = Uppgift3Controller.getEmployees();
						tableCronusAccess.setModel(model);
					} catch (RemoteException e) {
						lblFeedback.setText(errorMessage);
					}
					break;
					
				case 1:
					//Relatives
					try {
						DefaultTableModel model = Uppgift3Controller.getEmployeeRelatives();
						tableCronusAccess.setModel(model);
					} catch (RemoteException e) {
						lblFeedback.setText(errorMessage);
					}					
					break;
					
				case 2:
					// Sickleave 2004
					try {
						DefaultTableModel model = Uppgift3Controller.getSickleave();
						tableCronusAccess.setModel(model);
					} catch (RemoteException e) {
						lblFeedback.setText(errorMessage);
					}
					break;
				
				case 3:
					//Most sick
					try {
						DefaultTableModel model = Uppgift3Controller.getMostSick();
						tableCronusAccess.setModel(model);
					} catch (RemoteException e) {
						lblFeedback.setText(errorMessage);
					}
					break;
				}
			}
		});
		btnCronusAccessShowTables.setBounds(254, 85, 108, 23);
		panelCronusAccessShowTables.add(btnCronusAccessShowTables);

		JPanel panelCronusAccess_showMetadata = new JPanel();
		panelCronusAccess_showMetadata.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"Show Meta data", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelCronusAccess_showMetadata.setBounds(10, 173, 392, 133);
		panelCronusAccess.add(panelCronusAccess_showMetadata);
		panelCronusAccess_showMetadata.setLayout(null);

		JComboBox<String> comboBoxCronusAccessMeta = new JComboBox<String>();
		comboBoxCronusAccessMeta.addItem("Keys");
		comboBoxCronusAccessMeta.addItem("Indexes");
		comboBoxCronusAccessMeta.addItem("Table constraints");
		comboBoxCronusAccessMeta.addItem("All tables 1");
		comboBoxCronusAccessMeta.addItem("All tables 2");
		comboBoxCronusAccessMeta.addItem("Columns employee 1");
		comboBoxCronusAccessMeta.addItem("Columns employee 2");
		comboBoxCronusAccessMeta.setBounds(124, 46, 242, 25);
		panelCronusAccess_showMetadata.add(comboBoxCronusAccessMeta);
		comboBoxCronusAccessMeta.setName("comboBox_caccessMeta");

		JButton btnCronusAccessShowMetadata = new JButton("Show");
		btnCronusAccessShowMetadata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearFeedback();
				switch(comboBoxCronusAccessMeta.getSelectedIndex()){
				case 0:
					//Keys
					try {
						DefaultTableModel model = Uppgift3Controller.getKeys();
						tableCronusAccess.setModel(model);
					} catch (RemoteException ex) {
						lblFeedback.setText(errorMessage);
					}
					break;
				case 1:
					//Indexes
					try {
						DefaultTableModel model = Uppgift3Controller.getIndices();
						tableCronusAccess.setModel(model);
					} catch (RemoteException ex) {
						lblFeedback.setText(errorMessage);
					}
					break;
				case 2:
					//Table constraints
					try {
						DefaultTableModel model = Uppgift3Controller.getConstraints();
						tableCronusAccess.setModel(model);
					} catch (RemoteException ex) {
						lblFeedback.setText(errorMessage);
					}
					break;
				case 3:
					//All tables 1
					try {
						DefaultTableModel model = Uppgift3Controller.getTablesOne();
						tableCronusAccess.setModel(model);
					} catch (RemoteException ex) {
						lblFeedback.setText(errorMessage);
					}
					break;
				case 4:
					//All tables 2
					try {
						DefaultTableModel model = Uppgift3Controller.getTablesTwo();
						tableCronusAccess.setModel(model);
					} catch (RemoteException ex) {
						lblFeedback.setText(errorMessage);
					}
					break;
				case 5:
					//Columns employee 1
					try {
						DefaultTableModel model = Uppgift3Controller.getColumnsOne();
						tableCronusAccess.setModel(model);
					} catch (RemoteException ex) {
						lblFeedback.setText(errorMessage);
					}
					break;
				case 6:
					//Columns employee 2
					try {
						DefaultTableModel model = Uppgift3Controller.getColumnsTwo();
						tableCronusAccess.setModel(model);
					} catch (RemoteException ex) {
						lblFeedback.setText(errorMessage);
					}
					break;
				
				}
			}
		});
		btnCronusAccessShowMetadata.setBounds(258, 87, 108, 23);
		panelCronusAccess_showMetadata.add(btnCronusAccessShowMetadata);

		JLabel lblCronusAccessQuery = new JLabel("Select query");
		lblCronusAccessQuery.setBounds(23, 49, 96, 19);
		panelCronusAccess_showMetadata.add(lblCronusAccessQuery);

		JSeparator separatorCronusAccessEmployeeMeta = new JSeparator();
		separatorCronusAccessEmployeeMeta.setBounds(10, 155, 392, 2);
		panelCronusAccess.add(separatorCronusAccessEmployeeMeta);
		
		JPanel panelAddUpdate = new JPanel();
		panelAddUpdate.setLayout(null);
		panelAddUpdate.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Add/Update employee", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelAddUpdate.setBounds(10, 330, 392, 185);
		panelCronusAccess.add(panelAddUpdate);
		
		JLabel lblAddUpdateEmployee = new JLabel("Employee no:");
		lblAddUpdateEmployee.setBounds(15, 28, 104, 23);
		panelAddUpdate.add(lblAddUpdateEmployee);
		
		JButton btnAddEmployee = new JButton("Add Employee");
		btnAddEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clearFeedback();
				if (validateAddUpdateInput()) {
					try {
						String number = textFieldAddUpdateEmployeeNo.getText().trim();
						String firstName = textFieldFirstName.getText().trim();
						String lastName = textFieldLastName.getText().trim();
						int result = Uppgift3Controller.addEmployee(number, firstName, lastName);
						
						if (result > 0) {
							lblFeedback.setText("Successfully added employee with number: " + number + ".");
						} else {
							lblFeedback.setText("Could not add employee with number: " + number + ". Please make sure the number is correct.");
						}
					} catch (RemoteException ex) {
						lblFeedback.setText("Error: could not add employee to database.");
					}
				} else {
					lblFeedback.setText("Please fill in all the details.");
				}
			}
		});
		btnAddEmployee.setBounds(122, 135, 110, 29);
		panelAddUpdate.add(btnAddEmployee);
		
		textFieldAddUpdateEmployeeNo = new JTextField();
		textFieldAddUpdateEmployeeNo.setBounds(123, 26, 236, 26);
		panelAddUpdate.add(textFieldAddUpdateEmployeeNo);
		textFieldAddUpdateEmployeeNo.setColumns(10);
		textFields.add(textFieldAddUpdateEmployeeNo);
		
		JLabel lblFirstName = new JLabel("First name:");
		lblFirstName.setBounds(15, 67, 104, 20);
		panelAddUpdate.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last name:");
		lblLastName.setBounds(15, 104, 104, 20);
		panelAddUpdate.add(lblLastName);
		
		textFieldFirstName = new JTextField();
		textFieldFirstName.setBounds(123, 64, 236, 26);
		panelAddUpdate.add(textFieldFirstName);
		textFieldFirstName.setColumns(10);
		textFields.add(textFieldFirstName);
		
		textFieldLastName = new JTextField();
		textFieldLastName.setBounds(123, 101, 236, 26);
		panelAddUpdate.add(textFieldLastName);
		textFieldLastName.setColumns(10);
		textFields.add(textFieldLastName);
		
		JButton btnUpdateEmployee = new JButton("Update Employee");
		btnUpdateEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearFeedback();
				if (validateAddUpdateInput()) {
					try {
						String number = textFieldAddUpdateEmployeeNo.getText().trim();
						String firstName = textFieldFirstName.getText().trim();
						String lastName = textFieldLastName.getText().trim();
						int result = Uppgift3Controller.updateEmployee(number, firstName, lastName);
						
						if (result > 0) {
							lblFeedback.setText("Successfully updated employee with number: " + number + ".");
						} else {
							lblFeedback.setText("Could not update employee with number: " + number + ". Please make sure the number is correct.");
						}
					} catch (RemoteException ex) {
						lblFeedback.setText("Error: could not update employee in the database.");
					}
				} else {
					lblFeedback.setText("Please fill in all the details.");
				}
			}
		});
		btnUpdateEmployee.setBounds(242, 135, 117, 29);
		panelAddUpdate.add(btnUpdateEmployee);
		
		JLabel lblMustFirstName = new JLabel("*");
		lblMustFirstName.setBounds(369, 70, 17, 20);
		panelAddUpdate.add(lblMustFirstName);
		
		JLabel lblMustLastName = new JLabel("*");
		lblMustLastName.setBounds(369, 107, 17, 20);
		panelAddUpdate.add(lblMustLastName);
		
		JLabel lblMustAddUpdateNumber = new JLabel("*");
		lblMustAddUpdateNumber.setBounds(369, 29, 17, 20);
		panelAddUpdate.add(lblMustAddUpdateNumber);
		
		JSeparator separatorCronusAccessMetaAdd = new JSeparator();
		separatorCronusAccessMetaAdd.setBounds(10, 317, 392, 2);
		panelCronusAccess.add(separatorCronusAccessMetaAdd);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Delete employee", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 543, 392, 113);
		panelCronusAccess.add(panel);
		panel.setLayout(null);
		
		JLabel lblDeleteEmployee = new JLabel("Employee no:");
		lblDeleteEmployee.setBounds(10, 34, 104, 23);
		panel.add(lblDeleteEmployee);
		
		textFieldDeleteEmployeeNo = new JTextField();
		textFieldDeleteEmployeeNo.setColumns(10);
		textFieldDeleteEmployeeNo.setBounds(124, 32, 236, 26);
		panel.add(textFieldDeleteEmployeeNo);
		
		JButton btnDeleteEmployee = new JButton("Delete Employee");
		btnDeleteEmployee.setBounds(243, 69, 117, 29);
		panel.add(btnDeleteEmployee);
		
		JLabel lblMustDeleteNumber = new JLabel("*");
		lblMustDeleteNumber.setBounds(370, 35, 17, 20);
		panel.add(lblMustDeleteNumber);
		
		JSeparator separatorCronusAccessAddDelete = new JSeparator();
		separatorCronusAccessAddDelete.setBounds(10, 530, 392, 2);
		panelCronusAccess.add(separatorCronusAccessAddDelete);
		btnDeleteEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clearFeedback();
				if (validateDeleteInput()) {
					try {
						String number = textFieldDeleteEmployeeNo.getText().trim();
						int result = Uppgift3Controller.deleteEmployee(number);
						
						if (result > 0) {
							lblFeedback.setText("Successfully deleted employee with number: " + number + ".");
						} else {
							lblFeedback.setText("Could not delete employee with number: " + number + ". Please make sure the number is correct.");
						}
					} catch (RemoteException ex) {
						lblFeedback.setText("Error: could not update employee in the database.");
					}
				} else {
					lblFeedback.setText("Please enter a employee number.");
				}
			}
		});
	}
	
	private void clearTextFields() {
		for (JTextField field : textFields) {
			field.setText("");
		}
	}
	
	private boolean validateAddUpdateInput() {
		if (textFieldLastName.getText().trim().equals("") ||
			textFieldFirstName.getText().trim().equals("") ||
			textFieldAddUpdateEmployeeNo.getText().trim().equals("")) {
			return false;
		} else {
			return true;
		}
	}
	
	private boolean validateDeleteInput() {
		if (textFieldDeleteEmployeeNo.getText().trim().equals("")) {
			return false;
		} else {
			return true;
		}
	}

	private void clearFeedback() {
		lblFeedback.setText("");
	}
}
