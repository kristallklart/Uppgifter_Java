package uppgift2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.JLabel;

public class Uppgift2_View {

	private JFrame frameMain;
	private JComboBox<String> comboBoxChooseTable;
	private JButton btnShowTable;
	private JPanel panelMain;
	private JScrollPane scrollPaneResultTable;
	private JTable tableResultTable;
	private JLabel lblFeedback;
	private final String errorMessage = "Error: Could not load the table.";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uppgift2_View window = new Uppgift2_View();
					window.frameMain.setVisible(true);
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
				e.printStackTrace();
			}
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameMain = new JFrame();
		frameMain.setBounds(100, 100, 985, 684);
		frameMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameMain.getContentPane().setLayout(null);
		
		panelMain = new JPanel();
		panelMain.setBounds(0, 0, 963, 621);
		frameMain.getContentPane().add(panelMain);
		panelMain.setLayout(null);
		
		comboBoxChooseTable = new JComboBox<String>();
		comboBoxChooseTable.addItem("User");
		comboBoxChooseTable.addItem("Location");
		comboBoxChooseTable.addItem("Purpose");
		comboBoxChooseTable.addItem("User_Location_Purpose");
		comboBoxChooseTable.addItem("FieldOfProfession");
		comboBoxChooseTable.addItem("Match");
		comboBoxChooseTable.addItem("Message");
		comboBoxChooseTable.setBounds(15, 16, 199, 26);
		panelMain.add(comboBoxChooseTable);
		
		tableResultTable = new JTable();
		scrollPaneResultTable = new JScrollPane(tableResultTable);
		scrollPaneResultTable.setBounds(15, 60, 933, 552);
		panelMain.add(scrollPaneResultTable);
		
		lblFeedback = new JLabel();
		lblFeedback.setBounds(15, 625, 556, 15);
		frameMain.getContentPane().add(lblFeedback);
		
		btnShowTable = new JButton("Show Table");
		btnShowTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clearFeedback();
				switch(comboBoxChooseTable.getSelectedIndex()){
				case 0:
					try {
						tableResultTable.setModel(Uppgift2_Controller.getUsersTable());						
					} catch (RemoteException e) {
						lblFeedback.setText(errorMessage);
					}
					break;
				case 1:
					try {
						tableResultTable.setModel(Uppgift2_Controller.getLocationsTable());
					} catch (RemoteException e) {
						lblFeedback.setText(errorMessage);
					}
					break;
				case 2:
					try {
						tableResultTable.setModel(Uppgift2_Controller.getPurposesTable());
					} catch (RemoteException e) {
						lblFeedback.setText(errorMessage);
					}
					break;
				case 3:
					try {
						tableResultTable.setModel(Uppgift2_Controller.getUserLocationPurposesTable());
					} catch (RemoteException e) {
						lblFeedback.setText(errorMessage);
					}
					break;
				case 4:
					try {
						tableResultTable.setModel(Uppgift2_Controller.getFieldOfProfessionsTable());
					} catch (RemoteException e) {
						lblFeedback.setText(errorMessage);
					}
					break;
				case 5:
					try {
						tableResultTable.setModel(Uppgift2_Controller.getMatchesTable());
					} catch (RemoteException e) {
						lblFeedback.setText(errorMessage);
					}
					break;
				case 6:
					try {
						tableResultTable.setModel(Uppgift2_Controller.getMessagesTable());
					} catch (RemoteException e) {
						lblFeedback.setText(errorMessage);
					}
					break;
				}
			}
		});
		btnShowTable.setBounds(229, 15, 115, 29);
		panelMain.add(btnShowTable);	
		}
	private void clearFeedback() {
		lblFeedback.setText("");
	}
}


	