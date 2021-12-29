package holiday.strike;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Conn {
	
	Connection conn ;
	Statement stmt;
	public Conn(){
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tms", "root", "$hef@li24#02");
			stmt = conn.createStatement();
		}
		catch(Exception e) {
			
		}
	}
}
//jdbc:mysql://localhost:3306/tms


