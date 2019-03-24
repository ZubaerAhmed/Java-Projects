package capstoneFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 *//*
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
*/
	/**
	 * Create the frame.
	 */
	public Home() {
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 484);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnParent = new JMenu("Parent");
		menuBar.add(mnParent);
		
		JMenuItem mntmNewForm = new JMenuItem("New Form");
		mntmNewForm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormNew c = new FormNew();
					contentPane.removeAll();
					contentPane.repaint();
					contentPane.revalidate();
					
					contentPane.add(c);
					contentPane.repaint();
					contentPane.revalidate();
			}
		});
		mnParent.add(mntmNewForm);
		
		JMenuItem mntmEditForm = new JMenuItem("Edit Form");
		mnParent.add(mntmEditForm);
		
		JMenuItem mntmDeleteForm = new JMenuItem("Delete Form");
		mnParent.add(mntmDeleteForm);
		
		JMenu mnChild = new JMenu("Child");
		menuBar.add(mnChild);
		
		JMenuItem mntmNewForm_1 = new JMenuItem("New Form");
		mntmNewForm_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormNew c1 = new FormNew();
				contentPane.removeAll();
				contentPane.repaint();
				contentPane.revalidate();
				
				contentPane.add(c1);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		mnChild.add(mntmNewForm_1);
		
		JMenuItem mntmEditForm_1 = new JMenuItem("Edit Form");
		mnChild.add(mntmEditForm_1);
		
		JMenuItem mntmDeleteForm_1 = new JMenuItem("Delete Form");
		mnChild.add(mntmDeleteForm_1);
		
		JMenu mnEmployee = new JMenu("Employee");
		menuBar.add(mnEmployee);
		
		JMenuItem mntmNewForm_2 = new JMenuItem("New Form");
		mntmNewForm_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FormNew c2 = new FormNew();
				contentPane.removeAll();
				contentPane.repaint();
				contentPane.revalidate();
				
				contentPane.add(c2);
				contentPane.repaint();
				contentPane.revalidate();
			}
		});
		mnEmployee.add(mntmNewForm_2);
		
		JMenuItem mntmEditForm_2 = new JMenuItem("Edit Form");
		mnEmployee.add(mntmEditForm_2);
		
		JMenuItem mntmDeleteForm_2 = new JMenuItem("Delete Form");
		mnEmployee.add(mntmDeleteForm_2);
		
		JMenu mnStatement = new JMenu("Statement");
		menuBar.add(mnStatement);
		
		JMenuItem mntmListOfParent = new JMenuItem("List of Parent");
		mnStatement.add(mntmListOfParent);
		
		JMenuItem mntmListOfChild = new JMenuItem("List of Child");
		mnStatement.add(mntmListOfChild);
		
		JMenuItem mntmListOfEmployee = new JMenuItem("List of Employee");
		mnStatement.add(mntmListOfEmployee);
		
		JMenuItem mntmListOfPayment = new JMenuItem("List of payment");
		mnStatement.add(mntmListOfPayment);
		
		JMenu mnEvent = new JMenu("Event");
		menuBar.add(mnEvent);
		
		JMenuItem mntmListOfEvent = new JMenuItem("List of Event");
		mnEvent.add(mntmListOfEvent);
		
		JMenuItem mntmMakeEventDate = new JMenuItem("Make Event date");
		mnEvent.add(mntmMakeEventDate);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
//---------------------------------------------------------------------------------------------
		
		JLabel header = new JLabel("");
		contentPane.add(header, BorderLayout.NORTH);
		header.setIcon(new ImageIcon("C:\\Users\\tumpa\\Dropbox\\8th Semester\\1 Capstone SD2799\\Project\\Picture\\pict3.png"));
		
		JLabel lblNewLabel_1 = new JLabel("This is done by Zubaer for ITT institute Capston project");
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setForeground(Color.BLACK);
		contentPane.add(lblNewLabel_1, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\tumpa\\Dropbox\\8th Semester\\1 Capstone SD2799\\Project\\Picture\\122.jpg"));
		lblNewLabel.setBounds(380, 83, 279, 147);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\tumpa\\Dropbox\\8th Semester\\1 Capstone SD2799\\Project\\Picture\\login2.png"));
		lblNewLabel_2.setBounds(308, 70, 305, 39);
		panel.add(lblNewLabel_2);
	}

}
