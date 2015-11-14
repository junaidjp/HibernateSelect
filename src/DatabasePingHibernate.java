import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import com.training.hibernate.HibernateSessionFactory;
import com.training.hibernate.UserBean;




public class DatabasePingHibernate {
	
	
public static void main(String args[]) {

		
	// First Load Session Factory 
	
	// Get the Session from Session Factory 
	
	// Ping DB using this Session
	
	
	  Session session = null;
	try {
	    	// SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
	       SessionFactory sessionFactory=HibernateSessionFactory.getSessionFactory();
	      session =sessionFactory.openSession();
	      
	      UserBean userBean = (UserBean) session.load(UserBean.class, 3); 
	      
	    
			
	      
	      
	        System.out.println(userBean.getId()+ " " + userBean.getPassword()+ " " +userBean.getUsername());
	      
	     
	        // How to load the Objects 
	     
	       }
	     catch(Exception e){
	      System.out.println(e.getMessage());
	    }finally{
	      // Actual contact insertion will happen at this step
	      session.flush();
	      session.close();

	      }
	    
	
	
	
	
	

}
}