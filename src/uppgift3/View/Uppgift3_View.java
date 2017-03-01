package uppgift3.View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
	private DefaultTableModel emptyDefTableModel = new DefaultTableModel();
	private JTable table_caccess;
	private JTextField textField_EmployeeNo;
	private JTextField textField_FirstName;
	private JTextField textField_LastName;

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
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1262, 636);
		contentPane.add(tabbedPane);

		lbl_feedback = new JLabel();
		lbl_feedback.setBounds(19, 635, 941, 20);
		contentPane.add(lbl_feedback);

		// ***************************************
		// ***********CRONUS ACCESS TAB***********
		// ***************************************

		table_caccess = new JTable();
		JPanel panel_caccess = new JPanel();
		tabbedPane.addTab("Cronus Access", panel_caccess);
		panel_caccess.setLayout(null);

		JScrollPane scrollPane_caccess = new JScrollPane();
		scrollPane_caccess.setBounds(460, 32, 782, 554);
		panel_caccess.add(scrollPane_caccess);

		table_caccess = new JTable();
		scrollPane_caccess.setViewportView(table_caccess);

		JPanel panel_CronusAccess_showTables = new JPanel();
		panel_CronusAccess_showTables.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"Show Employee and Related Tables", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_CronusAccess_showTables.setBounds(10, 11, 392, 128);
		panel_caccess.add(panel_CronusAccess_showTables);
		panel_CronusAccess_showTables.setLayout(null);

		JLabel lbl_caccess_selectOption = new JLabel("Select table");
		lbl_caccess_selectOption.setBounds(23, 45, 87, 23);
		panel_CronusAccess_showTables.add(lbl_caccess_selectOption);

		JComboBox<String> comboBox_caccessTables = new JComboBox<String>();
		comboBox_caccessTables.setBounds(120, 44, 242, 25);
		comboBox_caccessTables.addItem("Employee");
		comboBox_caccessTables.addItem("Relatives");
		comboBox_caccessTables.addItem("Sickleave 2004");
		comboBox_caccessTables.addItem("Most sick");
		panel_CronusAccess_showTables.add(comboBox_caccessTables);
		comboBox_caccessTables.setName("comboBox_caccessTables");

		JButton btn_caccess__showTables = new JButton("Show");
		btn_caccess__showTables.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switch(comboBox_caccessTables.getSelectedIndex()){
				case 0:
					//Employee
					break;
					
				case 1:
					//Relatives
					break;
					
				case 2:
					// Sickleave 2004
					break;
				
				case 3:
					//Most sick
					break;
				}
			}
		});
		btn_caccess__showTables.setBounds(254, 85, 108, 23);
		panel_CronusAccess_showTables.add(btn_caccess__showTables);

		JPanel panel_CronusAccess_showMetadata = new JPanel();
		panel_CronusAccess_showMetadata.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
				"Show Meta data", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_CronusAccess_showMetadata.setBounds(10, 173, 392, 133);
		panel_caccess.add(panel_CronusAccess_showMetadata);
		panel_CronusAccess_showMetadata.setLayout(null);

		JComboBox<String> comboBox_caccessMeta = new JComboBox<String>();
		comboBox_caccessMeta.addItem("Keys");
		comboBox_caccessMeta.addItem("Indexes");
		comboBox_caccessMeta.addItem("Table constraints");
		comboBox_caccessMeta.addItem("All tables 1");
		comboBox_caccessMeta.addItem("All tables 2");
		comboBox_caccessMeta.addItem("Columns employee 1");
		comboBox_caccessMeta.addItem("Columns employee 2");
		comboBox_caccessMeta.setBounds(124, 46, 242, 25);
		panel_CronusAccess_showMetadata.add(comboBox_caccessMeta);
		comboBox_caccessMeta.setName("comboBox_caccessMeta");

		JButton btn_caccess_showMetadata = new JButton("Show");
		btn_caccess_showMetadata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(comboBox_caccessMeta.getSelectedIndex()){
				case 0:
					//Keys
					break;
				case 1:
					//Indexes
					break;
				case 2:
					//Table constraints
					break;
				case 3:
					//All tables 1
					break;
				case 4:
					//All tables 2
					break;
				case 5:
					//Columns employee 1
					break;
				case 6:
					//Columns employee 2
					break;
				
				}
			}
		});
		btn_caccess_showMetadata.setBounds(258, 87, 108, 23);
		panel_CronusAccess_showMetadata.add(btn_caccess_showMetadata);

		JLabel lblNewLabel = new JLabel("Select query");
		lblNewLabel.setBounds(23, 49, 96, 19);
		panel_CronusAccess_showMetadata.add(lblNewLabel);

		JSeparator separator_cronusAccess = new JSeparator();
		separator_cronusAccess.setBounds(10, 155, 392, 2);
		panel_caccess.add(separator_cronusAccess);
		
		JPanel panel_AddUpdateDelete = new JPanel();
		panel_AddUpdateDelete.setLayout(null);
		panel_AddUpdateDelete.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"),
					"Add/Update/Delete", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_AddUpdateDelete.setBounds(10, 335, 392, 251);
		panel_caccess.add(panel_AddUpdateDelete);
		
		JLabel lblEmployee = new JLabel("Employee no:");
		lblEmployee.setBounds(15, 28, 104, 23);
		panel_AddUpdateDelete.add(lblEmployee);
		
		JButton btnAddEmploy = new JButton("Add Employee");
		btnAddEmploy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAddEmploy.setBounds(15, 166, 160, 29);
		panel_AddUpdateDelete.add(btnAddEmploy);
		
		textField_EmployeeNo = new JTextField();
		textField_EmployeeNo.setBounds(123, 26, 192, 26);
		panel_AddUpdateDelete.add(textField_EmployeeNo);
		textField_EmployeeNo.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First name:");
		lblFirstName.setBounds(15, 67, 104, 20);
		panel_AddUpdateDelete.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last name:");
		lblLastName.setBounds(15, 104, 104, 20);
		panel_AddUpdateDelete.add(lblLastName);
		
		textField_FirstName = new JTextField();
		textField_FirstName.setBounds(123, 64, 192, 26);
		panel_AddUpdateDelete.add(textField_FirstName);
		textField_FirstName.setColumns(10);
		
		textField_LastName = new JTextField();
		textField_LastName.setBounds(123, 101, 192, 26);
		panel_AddUpdateDelete.add(textField_LastName);
		textField_LastName.setColumns(10);
		
		JButton btnUpdateEmployee = new JButton("Update Employee");
		btnUpdateEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUpdateEmployee.setBounds(217, 166, 160, 29);
		panel_AddUpdateDelete.add(btnUpdateEmployee);
		
		JButton btnDeleteEmployee = new JButton("Delete Employee");
		btnDeleteEmployee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDeleteEmployee.setBounds(123, 211, 160, 29);
		panel_AddUpdateDelete.add(btnDeleteEmployee);
		
		JLabel label = new JLabel(" *");
		label.setBounds(318, 29, 28, 20);
		panel_AddUpdateDelete.add(label);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 317, 392, 2);
		panel_caccess.add(separator);
	}

	private void communicateMessage(String message) {
		lbl_feedback.setText(message);
	}

	private void clearFeedback() {
		lbl_feedback.setText("");
	}

	private void clearTable(JTable table) {
		table.setModel(emptyDefTableModel);
	}
	

}
