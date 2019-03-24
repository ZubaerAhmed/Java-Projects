package capstoneFinal;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;

public class FormDelete extends JPanel {
	private JTable table;
	JButton btnNewButton;

	
	public FormDelete() {
		setBackground(Color.BLACK);		
	
		//setBackground(Color.BLACK);
		initiation();
		}
	
	private void initiation() {
		setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Select Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setBounds(67, 105, 90, 17);
		add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setBounds(67, 137, 191, 28);
		add(comboBox);
		
		GoToHome g = new GoToHome();
		btnNewButton = new JButton("DELETE");
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.addActionListener(g);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(67, 242, 191, 28);
		add(btnNewButton);
		
		table = new JTable();
		table.setBounds(307, 137, 368, 133);
		add(table);

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
