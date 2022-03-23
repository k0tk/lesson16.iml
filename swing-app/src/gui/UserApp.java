package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserApp extends JFrame {

	private JPanel contentPane;
	private JTextField userNameTxtField;
	private JTextField userLastNameField;
	private JLabel userLastNameLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
				UserApp frame = new UserApp();
				frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public UserApp() {
		setTitle("Registration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton mainButton = new JButton("Next");
		
		mainButton.setBounds(360, 224, 64, 26);
		contentPane.add(mainButton);
		
		JLabel userNameLabel = new JLabel("User name:");
		userNameLabel.setBounds(31, 33, 152, 26);
		contentPane.add(userNameLabel);
		
		userNameTxtField = new JTextField();
		userNameTxtField.setBounds(31, 60, 174, 20);
		contentPane.add(userNameTxtField);
		userNameTxtField.setColumns(10);
		
		userLastNameField = new JTextField();
		userLastNameField.setBounds(31, 108, 174, 20);
		contentPane.add(userLastNameField);
		userLastNameField.setColumns(10);
		
		userLastNameLabel = new JLabel("Last name:");
		userLastNameLabel.setBounds(31, 91, 95, 14);
		contentPane.add(userLastNameLabel);
		
		mainButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String txt = userNameTxtField.getText();
				System.out.print(txt);
				String txt1 = userLastNameField.getText();
				System.out.print(" " + txt1);
				
			}
		});
	}
}
