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

public class Home1 extends JFrame {

	private JPanel contentPane;
	private JMenuItem mntmNewForm, mntmNewForm_1, mntmNewForm_2,
	                  mntmEditForm, mntmEditForm_1, mntmEditForm_2,
	                  mntmDeleteForm, mntmDeleteForm_1, mntmDeleteForm_2,
	                  mntmListOfParent;
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home1 frame = new Home1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}



	public Home1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 484);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnParent = new JMenu("Parent");
		menuBar.add(mnParent);
		
		Form f = new Form();	
		mntmNewForm = new JMenuItem("New Form");
		mntmNewForm.addActionListener(f);
		mnParent.add(mntmNewForm);
		
		EditForm e = new EditForm();
		mntmEditForm = new JMenuItem("Edit Form");
		mntmEditForm.addActionListener(e); 
		mnParent.add(mntmEditForm);
		
		DeleteForm d = new DeleteForm();
		mntmDeleteForm = new JMenuItem("Delete Form");
		mntmDeleteForm.addActionListener(d);
		mnParent.add(mntmDeleteForm);
//------------------------------------------------------------------------
		
		
		JMenu mnChild = new JMenu("Child");
		menuBar.add(mnChild);
		
		mntmNewForm_1 = new JMenuItem("New Form");
		mntmNewForm_1.addActionListener(f);
		mnChild.add(mntmNewForm_1);
		
		mntmEditForm_1 = new JMenuItem("Edit Form");
		mntmEditForm_1.addActionListener(e);
		mnChild.add(mntmEditForm_1);
		
		mntmDeleteForm_1 = new JMenuItem("Delete Form");
		mntmDeleteForm_1.addActionListener(d);
		mnChild.add(mntmDeleteForm_1);
//------------------child complete-----------------------------		
		
		
		
		JMenu mnEmployee = new JMenu("Employee");
		menuBar.add(mnEmployee);
					
		mntmNewForm_2 = new JMenuItem("New Form");
		mntmNewForm_2.addActionListener(f); 
		mnEmployee.add(mntmNewForm_2);
		
		mntmEditForm_2 = new JMenuItem("Edit Form");
		mntmEditForm_2.addActionListener(e);
		mnEmployee.add(mntmEditForm_2);
		
		mntmDeleteForm_2 = new JMenuItem("Delete Form");
		mntmDeleteForm_2.addActionListener(d);
		mnEmployee.add(mntmDeleteForm_2);
//------------------------Employee complete--------------------
		
		JMenu mnStatement = new JMenu("Statement");
		menuBar.add(mnStatement);
		
		StatementForm s = new StatementForm();
		mntmListOfParent = new JMenuItem("List of Parent");
		mntmListOfParent.addActionListener(s);
		mnStatement.add(mntmListOfParent);
		
		JMenuItem mntmListOfChild = new JMenuItem("List of Child");
		mnStatement.add(mntmListOfChild);
		
		JMenuItem mntmListOfEmployee = new JMenuItem("List of Employee");
		mnStatement.add(mntmListOfEmployee);
		
		JMenu mnEvent = new JMenu("Event");
		menuBar.add(mnEvent);
		
		JMenuItem mntmListOfEvent = new JMenuItem("List of Event");
		mnEvent.add(mntmListOfEvent);
		
		JMenuItem mntmEventForChildinvidual = new JMenuItem("Event for Child");
		mnEvent.add(mntmEventForChildinvidual);
		
		JMenu mnPayment = new JMenu("Payment");
		menuBar.add(mnPayment);
		
		JMenuItem mntmPaymentOfPayment = new JMenuItem("Payment Statement");
		mnPayment.add(mntmPaymentOfPayment);
		
		JMenuItem mntmBillForPayment = new JMenuItem("Monthly Bill");
		mnPayment.add(mntmBillForPayment);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel header = new JLabel("New label");
		contentPane.add(header, BorderLayout.NORTH);
		header.setIcon(new ImageIcon("C:\\Users\\tumpa\\Dropbox\\8th Semester\\1 Capstone SD2799\\Project\\Picture\\pict3.png"));
		
		JLabel lblNewLabel = new JLabel("This is done by Zubaer for ITT institute Capstone Project");
		contentPane.add(lblNewLabel, BorderLayout.SOUTH);
	}
//---------------------interface-----------------------------------------------------------	

	private class Form implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == mntmNewForm){
			FormNew c = new FormNew();
			contentPane.removeAll();
			contentPane.repaint();
			contentPane.revalidate();
			
			contentPane.add(c);
			contentPane.repaint();
			contentPane.revalidate();
		}
		else if(e.getSource() == mntmNewForm_1){
			FormNew c = new FormNew();
			contentPane.removeAll();
			contentPane.repaint();
			contentPane.revalidate();
			
			contentPane.add(c);
			contentPane.repaint();
			contentPane.revalidate();
		}
		else if(e.getSource() == mntmNewForm_2){
			FormNew c = new FormNew();
			contentPane.removeAll();
			contentPane.repaint();
			contentPane.revalidate();
			
			contentPane.add(c);
			contentPane.repaint();
			contentPane.revalidate();
		}		
	}		
	}
	private class DeleteForm implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == mntmDeleteForm){
				FormDelete c = new FormDelete();
				contentPane.removeAll();
				contentPane.repaint();
				contentPane.revalidate();
				
				contentPane.add(c);
				contentPane.repaint();
				contentPane.revalidate();
			}
			else if(e.getSource() == mntmDeleteForm_1){
				FormDelete c = new FormDelete();
				contentPane.removeAll();
				contentPane.repaint();
				contentPane.revalidate();
				
				contentPane.add(c);
				contentPane.repaint();
				contentPane.revalidate();
			}
			else if(e.getSource() == mntmDeleteForm_2){
				FormDelete c = new FormDelete();
				contentPane.removeAll();
				contentPane.repaint();
				contentPane.revalidate();
				
				contentPane.add(c);
				contentPane.repaint();
				contentPane.revalidate();
			}
			
		}
		
	}
	private class EditForm implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == mntmEditForm){
				FormEdit c = new FormEdit();
				contentPane.removeAll();
				contentPane.repaint();
				contentPane.revalidate();
				
				contentPane.add(c);
				contentPane.repaint();
				contentPane.revalidate();
			}
			else if(e.getSource() == mntmEditForm_1){
				FormEdit c = new FormEdit();
				contentPane.removeAll();
				contentPane.repaint();
				contentPane.revalidate();
				
				contentPane.add(c);
				contentPane.repaint();
				contentPane.revalidate();
			}
			else if(e.getSource() == mntmEditForm_2){
				FormEdit c = new FormEdit();
				contentPane.removeAll();
				contentPane.repaint();
				contentPane.revalidate();
				
				contentPane.add(c);
				contentPane.repaint();
				contentPane.revalidate();
			}			
		}		
	}
	private class StatementForm implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == mntmListOfParent){
				Statement c = new Statement();
				contentPane.removeAll();
				contentPane.repaint();
				contentPane.revalidate();
				
				contentPane.add(c);
				contentPane.repaint();
				contentPane.revalidate();
			}
		}	
	}
}
