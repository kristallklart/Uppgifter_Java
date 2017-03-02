package uppgift1;

import java.awt.EventQueue;
import java.awt.ScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.rmi.RemoteException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Uppgift1View {

	private JFrame frameOpenFile;
	private JFileChooser fileChooser;
	private FileNameExtensionFilter filter; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uppgift1View window = new Uppgift1View();
					window.frameOpenFile.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Uppgift1View() {
		try{
		for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
			if ("Windows".equals(info.getName())) {
				UIManager.setLookAndFeel(info.getClassName());
			}
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		fileChooser = new JFileChooser();
    	filter = new FileNameExtensionFilter(".txt", "txt");
    	fileChooser.setFileFilter(filter);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frameOpenFile = new JFrame();
		frameOpenFile.setTitle("Open File Application");
		frameOpenFile.setBounds(100, 100, 270, 280);
		frameOpenFile.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameOpenFile.getContentPane().setLayout(null);
		
		JLabel lblFileName = new JLabel("File name");
		lblFileName.setBounds(21, 63, 46, 14);
		frameOpenFile.getContentPane().add(lblFileName);
		
		JLabel lblFileContent = new JLabel("File content");
		lblFileContent.setBounds(21, 86, 65, 14);
		frameOpenFile.getContentPane().add(lblFileContent);
		
		JTextField textFieldFileName;
		textFieldFileName = new JTextField();
		textFieldFileName.setEditable(false);
		textFieldFileName.setBounds(80, 60, 155, 20);
		frameOpenFile.getContentPane().add(textFieldFileName);
		textFieldFileName.setColumns(10);
		
		JLabel lblFeedback = new JLabel("Message:");
		lblFeedback.setBounds(21, 222, 210, 14);
		frameOpenFile.getContentPane().add(lblFeedback);
		
		JTextPane textPaneContent = new JTextPane();
		textPaneContent.setBounds(20, 105, 200, 100);
		textPaneContent.setEditable(false);
		
		ScrollPane scrollPane = new ScrollPane();
		scrollPane.setBounds(20, 105, 212, 102);
		scrollPane.add(textPaneContent);
		frameOpenFile.getContentPane().add(scrollPane);
		
		JPanel panelResult = new JPanel();
		panelResult.setBorder(new TitledBorder(null, "Result", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panelResult.setBounds(10, 40, 234, 180);
		frameOpenFile.getContentPane().add(panelResult);
		
		JButton btnBrowseFile = new JButton("Browse file...");
		btnBrowseFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int returnVal = fileChooser.showOpenDialog(frameOpenFile);
		        if (returnVal == JFileChooser.APPROVE_OPTION) {
		        	File file = fileChooser.getSelectedFile();
		            String fileName;
		            fileName = file.getPath();
		            try {
		            	textPaneContent.setText(Uppgift1Controller.getFileContent(fileName));
						textFieldFileName.setText(file.getName());
					} catch (RemoteException e) {
						lblFeedback.setText("Error: could not open file.");
					} 
		        }
			}
		});
		btnBrowseFile.setBounds(10, 11, 97, 23);
		frameOpenFile.getContentPane().add(btnBrowseFile);
	}
}
