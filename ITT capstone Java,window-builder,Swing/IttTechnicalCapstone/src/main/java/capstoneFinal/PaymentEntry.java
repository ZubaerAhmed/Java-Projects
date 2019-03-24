package capstoneFinal;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;

public class PaymentEntry extends JPanel {
	private JTextField textField;
	private JTable table;
	JButton btnNewButton;


	
	public PaymentEntry() {
		setBackground(Color.BLACK);
		setLayout(null);
		

       initiation();
	}
    
	private void initiation(){
		JLabel lblNewLabel = new JLabel("Select Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setBounds(91, 26, 80, 14);
		add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setBounds(181, 25, 235, 28);
		add(comboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Payment");
		lblNewLabel_1.setForeground(Color.YELLOW);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(79, 70, 92, 14);
		add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(181, 64, 235, 28);
		add(textField);
		textField.setColumns(10);
		
		table = new JTable();
		table.setBounds(81, 152, 463, 141);
		add(table);
		
		JLabel lblNewLabel_2 = new JLabel("Monthly Bill");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(Color.YELLOW);
		lblNewLabel_2.setBounds(250, 127, 80, 14);
		add(lblNewLabel_2);
		
		
		GoToHome g = new GoToHome();
		JButton btnNewButton = new JButton("Go to Home");
		btnNewButton.addActionListener(g);
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(181, 304, 149, 23);
		add(btnNewButton);
		
	}
	private class GoToHome implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == btnNewButton){
				Home1 c = new Home1();
				c.setVisible(true);
			}
		}		
	}
}
