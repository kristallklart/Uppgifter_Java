package src.uppgift2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Uppgift2_View {

	private JFrame frame;
	private JComboBox<String> comboBoxChooseTable;
	private JButton btnShowTable;
	private JPanel panel;
	private DefaultTableModel dataModelResultTable;
	private JScrollPane scrollPaneResultTable;
	private JTable tableResultTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uppgift2_View window = new Uppgift2_View();
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
	public Uppgift2_View() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame = new JFrame();
		frame.setBounds(100, 100, 985, 684);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(0, 0, 963, 628);
		frame.getContentPane().add(panel);
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
		
		btnShowTable = new JButton("Show Table");
		btnShowTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				switch(comboBoxChooseTable.getSelectedIndex()){
				case 0:
					Controller.getAllUsers();
					break;
				case 1:
					Controller.getAllLocations();
					break;
				case 2:
					Controller.getAllPurposes();
					break;
				case 3:
					Controller.getAllUserLocationPurpose();
					break;
				case 4:
					Controller.getAllFieldOfProfessions();
					break;
				case 5:
					Controller.getAllMatches();
					break;
				case 6:
					Controller.getAllMessages();
					break;
				}
			}
		});
		btnShowTable.setBounds(229, 15, 115, 29);
		panel.add(btnShowTable);
		
		dataModelResultTable = new DefaultTableModel();
		tableResultTable = new JTable(dataModelResultTable);
		scrollPaneResultTable =  new JScrollPane(tableResultTable);
		scrollPaneResultTable.setBounds(15, 60, 933, 552);
		panel.add(scrollPaneResultTable);
		
		
		}
	}


