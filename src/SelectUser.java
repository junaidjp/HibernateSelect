import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.training.hibernate.UserBean;


public class SelectUser {

	
	public static void main(String args[]) { 
		

		Connection conn = null;
		try {
			// 1) Load the Database Driver
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankofviz", "root",
					"junaid123");
			System.out.println("Successfully establised a Ping");
			
			System.out.println("USe this connection to Query the Database");
		
		PreparedStatement selectStatement  = null;
         String selectSql = "select * from User where id = ? ";
		  selectStatement = conn.prepareStatement(selectSql);
			 selectStatement.setInt(1,  3);
			 UserBean userBean = new UserBean();
			 ResultSet resultSet = selectStatement.executeQuery();
			 while(resultSet.next()) { 
				
				 userBean.setId(resultSet.getInt("Id"));
				 userBean.setUsername(resultSet.getString("username"));
				 userBean.setPassword(resultSet.getString("password"));
			 }
			 System.out.println(userBean.getId()+ " " + userBean.getPassword()+ " " +userBean.getUsername());
			
	
			
		}
		catch ( Exception ex) { 
			ex.printStackTrace();
		}
		
		
		
		
		
	}
}
