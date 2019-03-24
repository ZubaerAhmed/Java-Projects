package capstoneFinal;

import javax.swing.JPanel;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JButton;

public class Statement extends JPanel {
	private JTable table;
	JButton btnNewButton;


	public Statement() {
		setBackground(Color.BLACK);
		setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setBounds(286, 34, 198, 30);
		add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Select Name:");
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(196, 44, 80, 14);
		add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(72, 98, 544, 218);
		add(table);
		
		
		GoToHome g = new GoToHome();
		btnNewButton = new JButton("Go to Home");
		btnNewButton.addActionListener(g);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setBounds(72, 327, 135, 23);
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
