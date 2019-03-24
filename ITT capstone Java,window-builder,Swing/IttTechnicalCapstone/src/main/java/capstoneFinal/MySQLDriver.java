package capstoneFinal;

import java.sql.*;
import javax.swing.JOptionPane;

public class MySQLDriver {

	public void driver() {
		
		try{
			//get connection
			Connection con = DriverManager.getConnection("jdbc:mysql://Localhost:3306/login","root","dhaka3049");
			JOptionPane.showMessageDialog(null, "Connection created"); 
			//statement
			//SQL query
			//result
		}catch (Exception e){
			JOptionPane.showMessageDialog(null, e); 
		}

	}
}
