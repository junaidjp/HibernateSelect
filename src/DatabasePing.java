import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabasePing {

	public static void main(String args[]) {

		
		
		Connection conn = null;
		try {
			// 1) Load the Database Driver
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankofdanish", "root",
					"junaid123");
			
			
		 
				System.out.println("Successfully establised a Ping");
			
			
		} catch (Exception ex) {
			ex.printStackTrace();

		}

	}
}
