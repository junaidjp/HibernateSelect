import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import com.training.hibernate.HibernateSessionFactory;


public class HibernateLoadAccountInfo {

	
	public static void main(String args[]) { 

		  Session session = null;
		try {
		    	// SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		       SessionFactory sessionFactory=HibernateSessionFactory.getSessionFactory();
		      session =sessionFactory.openSession();
		      
		} 
		catch(Exception ex) { 
			ex.printStackTrace();
		}
		
		
		
	}
}
