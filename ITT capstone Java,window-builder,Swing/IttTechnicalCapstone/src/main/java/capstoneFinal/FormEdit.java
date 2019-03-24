package capstoneFinal;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FormEdit extends JPanel {

//	private JLabel time;
	private JTextField txtLastName;
	private JTextField txtLastName_1;
	private JTextField txtAddress;
	private JTextField txtCity;
	private JTextField txtState;
	private JTextField txtZipCode;
	private JTextField txtPhone;
	private JTextField txtEmail;
	private JTextField txtSsn;
	private JButton btnNewButton;
	
	
	public FormEdit() {
		setBackground(Color.BLACK);
		initiation();
		}
	
	private void initiation() {	
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setBounds(383, 100, 74, 20);
		add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setBounds(67, 134, 189, 29);
		add(comboBox);
		
		GoToHome g = new GoToHome();
		btnNewButton = new JButton("UPDATE");
		btnNewButton.addActionListener(g);
		
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(67, 233, 189, 29);
		add(btnNewButton);
		
		txtLastName = new JTextField();
		txtLastName.setBackground(Color.LIGHT_GRAY);
		txtLastName.setBounds(467, 102, 224, 20);
		add(txtLastName);
		txtLastName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(Color.YELLOW);
		lblNewLabel_1.setBounds(383, 139, 74, 14);
		add(lblNewLabel_1);
		
		txtLastName_1 = new JTextField();
		txtLastName_1.setBackground(Color.LIGHT_GRAY);
		txtLastName_1.setBounds(467, 138, 224, 20);
		add(txtLastName_1);
		txtLastName_1.setColumns(10);
		
		txtAddress = new JTextField();
		txtAddress.setBackground(Color.LIGHT_GRAY);
		txtAddress.setBounds(467, 172, 224, 20);
		add(txtAddress);
		txtAddress.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setForeground(Color.YELLOW);
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAddress.setBounds(394, 175, 74, 14);
		add(lblAddress);
		
		txtCity = new JTextField();
		txtCity.setBackground(Color.LIGHT_GRAY);
		txtCity.setBounds(467, 204, 224, 20);
		add(txtCity);
		txtCity.setColumns(10);
		
		txtState = new JTextField();
		txtState.setBackground(Color.LIGHT_GRAY);
		txtState.setBounds(467, 239, 224, 20);
		add(txtState);
		txtState.setColumns(10);
		
		txtZipCode = new JTextField();
		txtZipCode.setBackground(Color.LIGHT_GRAY);
		txtZipCode.setBounds(467, 270, 224, 20);
		add(txtZipCode);
		txtZipCode.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setBackground(Color.LIGHT_GRAY);
		txtPhone.setBounds(467, 301, 224, 20);
		add(txtPhone);
		txtPhone.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBackground(Color.LIGHT_GRAY);
		txtEmail.setBounds(467, 332, 224, 20);
		add(txtEmail);
		txtEmail.setColumns(10);
		
		txtSsn = new JTextField();
		txtSsn.setBackground(Color.LIGHT_GRAY);
		txtSsn.setBounds(467, 363, 224, 20);
		add(txtSsn);
		txtSsn.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("City:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setForeground(Color.YELLOW);
		lblNewLabel_2.setBounds(422, 207, 46, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("State:");
		lblNewLabel_3.setForeground(Color.YELLOW);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBackground(Color.LIGHT_GRAY);
		lblNewLabel_3.setBounds(411, 240, 46, 14);
		add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Zip Code:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_4.setForeground(Color.YELLOW);
		lblNewLabel_4.setBounds(394, 273, 74, 14);
		add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Phone:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_5.setForeground(Color.YELLOW);
		lblNewLabel_5.setBounds(404, 304, 64, 14);
		add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("email:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_6.setForeground(Color.YELLOW);
		lblNewLabel_6.setBounds(414, 335, 46, 14);
		add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("SSN:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_7.setForeground(Color.YELLOW);
		lblNewLabel_7.setBounds(422, 364, 38, 14);
		add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Select Name:");
		lblNewLabel_8.setForeground(Color.RED);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_8.setBounds(69, 102, 113, 14);
		add(lblNewLabel_8);
		
	//	time = new JLabel("Clock");
	//	time.setForeground(Color.RED);
	//	time.setFont(new Font("Tahoma", Font.PLAIN, 20));
	//	time.setBounds(445, 11, 184, 22);
	//	panel.add(time);

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
