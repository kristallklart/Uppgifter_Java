package uppgift2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.apache.axis.description.TypeDesc;

import Grupp7.User;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.JLabel;

public class Uppgift2_View {

	private JFrame frame;
	private JFrame frame_1;
	private JComboBox<String> comboBoxChooseTable;
	private JButton btnShowTable;
	private JPanel panel;
	private DefaultTableModel dataModelResultTable;
	private JScrollPane scrollPaneResultTable;
	private JTable tableResultTable;
	private final String errorMessage = "Error: Could not load the table.";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uppgift2_View window = new Uppgift2_View();
					window.frame_1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Uppgift2_View() {
		try{
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
				}
			}
			} catch (Exception e) {
				//Hantera fel här
				e.printStackTrace();
			}
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_1 = new JFrame();
		frame_1.setBounds(100, 100, 985, 684);
		frame_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame_1.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 963, 628);
		frame_1.getContentPane().add(panel);
		panel.setLayout(null);
		
		comboBoxChooseTable = new JComboBox<String>();
		comboBoxChooseTable.addItem("User");
		comboBoxChooseTable.addItem("Location");
		comboBoxChooseTable.addItem("Purpose");
		comboBoxChooseTable.addItem("User_Location_Purpose");
		comboBoxChooseTable.addItem("FieldOfProfession");
		comboBoxChooseTable.addItem("Match");
		comboBoxChooseTable.addItem("Message");
		comboBoxChooseTable.setBounds(15, 16, 199, 26);
		panel.add(comboBoxChooseTable);
		
		dataModelResultTable = new DefaultTableModel();
		tableResultTable = new JTable(dataModelResultTable);
		scrollPaneResultTable = new JScrollPane(tableResultTable);
		scrollPaneResultTable.setBounds(15, 60, 933, 552);
		panel.add(scrollPaneResultTable);
		
		JLabel lblFeedback = new JLabel("Feedback");
		lblFeedback.setBounds(10, 632, 46, 14);
		frame_1.getContentPane().add(lblFeedback);
		
		btnShowTable = new JButton("Show Table");
		btnShowTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switch(comboBoxChooseTable.getSelectedIndex()){
				case 0:
					try {
						User[] users = Uppgift2_Controller.getAllUsers();
						
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
						tableResultTable.setModel(model);
						
					} catch (RemoteException e) {
						lblFeedback.setText(errorMessage);
					}
					break;
				case 1:
					try {
						Uppgift2_Controller.getAllLocations();
					} catch (RemoteException e) {
						lblFeedback.setText(errorMessage);
					}
					break;
				case 2:
					try {
						Uppgift2_Controller.getAllPurposes();
					} catch (RemoteException e) {
						lblFeedback.setText(errorMessage);
					}
					break;
				case 3:
					try {
						Uppgift2_Controller.getAllUserLocationPurposes();
					} catch (RemoteException e) {
						lblFeedback.setText(errorMessage);
					}
					break;
				case 4:
					try {
						Uppgift2_Controller.getAllFieldOfProfessions();
					} catch (RemoteException e) {
						lblFeedback.setText(errorMessage);
					}
					break;
				case 5:
					try {
						Uppgift2_Controller.getAllMatches();
					} catch (RemoteException e) {
						lblFeedback.setText(errorMessage);
					}
					break;
				case 6:
					try {
						Uppgift2_Controller.getAllMessages();
					} catch (RemoteException e) {
						lblFeedback.setText(errorMessage);
					}
					break;
				}
			}
		});
		btnShowTable.setBounds(229, 15, 115, 29);
		panel.add(btnShowTable);	
		}
	}


