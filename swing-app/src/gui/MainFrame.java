package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField numb1Field;
    private JTextField textField_1;
    private JTextField numb2Field;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        
                    MainFrame frame = new MainFrame();
                    frame.setVisible(true);
                
    }

    /**
     * Create the frame.
     */
    public MainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);	
        
        numb1Field = new JTextField();
        numb1Field.setBounds(10, 81, 86, 20);
        contentPane.add(numb1Field);
        numb1Field.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setBounds(304, 112, 86, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);
        
        JLabel Number2Label = new JLabel("Answer:");
        Number2Label.setBounds(304, 99, 46, 14);
        contentPane.add(Number2Label);
        
        JLabel Number1Label_1 = new JLabel("Imput numbers to calculated:");
        Number1Label_1.setBounds(10, 11, 184, 14);
        contentPane.add(Number1Label_1);
        
        JButton calculeteButton = new JButton("Calculete");
        calculeteButton.setBounds(158, 111, 89, 23);
        contentPane.add(calculeteButton);
        
        numb2Field = new JTextField();
        numb2Field.setBounds(10, 150, 86, 20);
        contentPane.add(numb2Field);
        numb2Field.setColumns(10);
        
        String numbAText = numb1Field.getText();
        String numbBText = numb2Field.getText();
		
        
        double numbA = Double.parseDouble(numbAText);  
        double numbB = Double.parseDouble(numbBText);  

        double summa = numbA + numbB;
        
        
        
    }

}
