package capstoneFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Welcome extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	//private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
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
	public Welcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 791, 491);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		final JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		contentPane.add(panel_1, "name_453386117178626");
		panel_1.setLayout(null);
		panel_1.setVisible(true);
		
		final JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		contentPane.add(panel, "name_452940857753547");
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Welcome");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
				panel.setVisible(true);
				
			}
		});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 70));
		btnNewButton.setBounds(10, 11, 745, 420);
		panel_1.add(btnNewButton);
		
		
		
		JLabel lblNewLabel = new JLabel("User Name:");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(347, 140, 84, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setBounds(441, 139, 157, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password:");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(358, 179, 73, 14);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("LOGIN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				//frame.dispose();
				Home home = new  Home();
				home.setVisible(true);
			}
		});
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(441, 235, 121, 23);
		panel.add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(Color.LIGHT_GRAY);
		passwordField.setBounds(441, 178, 157, 20);
		panel.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\tumpa\\Dropbox\\8th Semester\\1 Capstone SD2799\\Project\\Picture\\122.jpg"));
		lblNewLabel_2.setBounds(96, 103, 175, 139);
		panel.add(lblNewLabel_2);
	}
}
