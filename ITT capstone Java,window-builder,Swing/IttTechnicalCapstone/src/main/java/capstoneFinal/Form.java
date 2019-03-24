package capstoneFinal;

import java.awt.Label;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Button;
import java.awt.TextField;
import java.awt.Color;

public class Form extends JPanel {
	
	 private JLabel time;


	public Form() {
		initiation();
		clock();
	}
	
	private void initiation() {	
	setLayout(null);
	
	JPanel panel = new JPanel();
	panel.setBackground(Color.BLACK);
	panel.setBounds(0, 0, 789, 427);
	add(panel);
	panel.setLayout(null);
	
	
	Label label_1 = new Label("First Name:");
	label_1.setForeground(Color.YELLOW);
	label_1.setFont(new Font("Dialog", Font.PLAIN, 14));
	label_1.setBounds(129, 96, 82, 22);
	panel.add(label_1);
	
	time = new JLabel("Clock");
	time.setForeground(Color.RED);
	time.setFont(new Font("Tahoma", Font.PLAIN, 20));
	time.setBounds(445, 11, 184, 22);
	panel.add(time);
	
	Label label = new Label("Last Name:");
	label.setForeground(Color.YELLOW);
	label.setFont(new Font("Dialog", Font.PLAIN, 14));
	label.setBounds(129, 124, 82, 22);
	panel.add(label);
	
	Label label_2 = new Label("Address:");
	label_2.setForeground(Color.YELLOW);
	label_2.setFont(new Font("Dialog", Font.PLAIN, 14));
	label_2.setBounds(149, 152, 62, 22);
	panel.add(label_2);
	
	Label label_3 = new Label("City:");
	label_3.setForeground(Color.YELLOW);
	label_3.setFont(new Font("Dialog", Font.PLAIN, 14));
	label_3.setBounds(177, 180, 34, 22);
	panel.add(label_3);
	
	Label label_4 = new Label("State:");
	label_4.setForeground(Color.YELLOW);
	label_4.setFont(new Font("Dialog", Font.PLAIN, 14));
	label_4.setBounds(167, 208, 44, 22);
	panel.add(label_4);
	
	Label label_5 = new Label("Zip Code:");
	label_5.setForeground(Color.YELLOW);
	label_5.setFont(new Font("Dialog", Font.PLAIN, 14));
	label_5.setBounds(141, 236, 70, 22);
	panel.add(label_5);
	
	Label label_6 = new Label("Phone:");
	label_6.setForeground(Color.YELLOW);
	label_6.setFont(new Font("Dialog", Font.PLAIN, 14));
	label_6.setBounds(160, 264, 51, 22);
	panel.add(label_6);
	
	Label label_7 = new Label("email:");
	label_7.setForeground(Color.YELLOW);
	label_7.setFont(new Font("Dialog", Font.PLAIN, 14));
	label_7.setBounds(167, 292, 44, 22);
	panel.add(label_7);
	
	Label label_8 = new Label("SSN:");
	label_8.setForeground(Color.YELLOW);
	label_8.setFont(new Font("Dialog", Font.PLAIN, 14));
	label_8.setBounds(177, 320, 34, 22);
	panel.add(label_8);
	
	Button button = new Button("Submit");
	button.setBackground(Color.LIGHT_GRAY);
	button.setForeground(Color.RED);
	button.setFont(new Font("Dialog", Font.BOLD, 16));
	button.setBounds(217, 369, 70, 22);
	panel.add(button);
	
	TextField textField = new TextField();
	textField.setBackground(Color.LIGHT_GRAY);
	textField.setBounds(217, 96, 174, 22);
	panel.add(textField);
	
	TextField textField_1 = new TextField();
	textField_1.setBackground(Color.LIGHT_GRAY);
	textField_1.setBounds(217, 124, 174, 22);
	panel.add(textField_1);
	
	TextField textField_2 = new TextField();
	textField_2.setBackground(Color.LIGHT_GRAY);
	textField_2.setBounds(217, 152, 174, 22);
	panel.add(textField_2);
	
	TextField textField_3 = new TextField();
	textField_3.setBackground(Color.LIGHT_GRAY);
	textField_3.setBounds(217, 180, 174, 22);
	panel.add(textField_3);
	
	TextField textField_4 = new TextField();
	textField_4.setBackground(Color.LIGHT_GRAY);
	textField_4.setBounds(217, 208, 174, 22);
	panel.add(textField_4);
	
	TextField textField_5 = new TextField();
	textField_5.setBackground(Color.LIGHT_GRAY);
	textField_5.setBounds(217, 236, 174, 22);
	panel.add(textField_5);
	
	TextField textField_6 = new TextField();
	textField_6.setBackground(Color.LIGHT_GRAY);
	textField_6.setBounds(217, 264, 174, 22);
	panel.add(textField_6);
	
	TextField textField_7 = new TextField();
	textField_7.setBackground(Color.LIGHT_GRAY);
	textField_7.setBounds(217, 292, 174, 22);
	panel.add(textField_7);
	
	TextField textField_8 = new TextField();
	textField_8.setBackground(Color.LIGHT_GRAY);
	textField_8.setBounds(217, 320, 174, 22);
	panel.add(textField_8);
	
	JLabel logoForm = new JLabel("");
	logoForm.setIcon(new ImageIcon("C:\\Users\\tumpa\\Dropbox\\8th Semester\\1 Capstone SD2799\\Project\\Picture\\122.jpg"));
	logoForm.setBounds(522, 152, 167, 119);
	panel.add(logoForm);
	
	JLabel logoForm2 = new JLabel("");
	logoForm2.setIcon(new ImageIcon("C:\\Users\\tumpa\\Dropbox\\8th Semester\\1 Capstone SD2799\\Project\\Picture\\login2.png"));
	logoForm2.setBounds(445, 124, 312, 50);
	panel.add(logoForm2);

}
	public void clock(){
	    Thread clock = new Thread(){
	       public void run(){
	          try {
	        	  for(; ;){
	      		Calendar cal = new GregorianCalendar();
	    		int day = cal.get(Calendar.DAY_OF_MONTH);
	    		int month = cal.get(Calendar.MONTH);
	    		int year = cal.get(Calendar.YEAR);
	    		
	    		int second = cal.get(Calendar.SECOND);
	    		int minute = cal.get(Calendar.MINUTE);
	    		int hour = cal.get(Calendar.HOUR);
	    		
	    	    time.setText(hour+":"+minute+":"+second+"    "+month+"-"+day+"-"+year);
	    		
				sleep (1000);
	        	  }
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	       }
	    };
	  clock.start();		
	}
}