package project1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JSplitPane;
import javax.swing.ScrollPaneConstants;

public class project1_IDE extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project1_IDE frame = new project1_IDE();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public project1_IDE() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 370);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_3 = new JMenu("New");
		mnNewMenu.add(mnNewMenu_3);
		
		JMenu mnNewMenu_4 = new JMenu("Open");
		mnNewMenu.add(mnNewMenu_4);
		
		JMenu mnNewMenu_5 = new JMenu("Save");
		mnNewMenu.add(mnNewMenu_5);
		
		JMenu mnNewMenu_6 = new JMenu("Exit");
		mnNewMenu.add(mnNewMenu_6);
		
		JMenu mnNewMenu_1 = new JMenu("Edit");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_7 = new JMenu("Copy");
		mnNewMenu_1.add(mnNewMenu_7);
		
		JMenu mnNewMenu_8 = new JMenu("Paste");
		mnNewMenu_1.add(mnNewMenu_8);
		
		JMenu mnNewMenu_9 = new JMenu("Cut");
		mnNewMenu_1.add(mnNewMenu_9);
		
		JMenu mnNewMenu_2 = new JMenu("Compile");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnNewMenu_10 = new JMenu("Compile");
		mnNewMenu_2.add(mnNewMenu_10);
		
		JMenu mnNewMenu_11 = new JMenu("Run");
		mnNewMenu_2.add(mnNewMenu_11);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setBounds(6, 6, 488, 314);
		contentPane.add(splitPane);
		
		JScrollPane scrollPane = new JScrollPane();
		splitPane.setLeftComponent(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setColumnHeaderView(textArea);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		splitPane.setRightComponent(scrollPane_1);
		
		JTextArea textArea_1 = new JTextArea();
		scrollPane_1.setColumnHeaderView(textArea_1);
	}

}
