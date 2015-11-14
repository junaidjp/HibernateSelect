import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import com.bank.entity.Bank;
import com.training.hibernate.HibernateSessionFactory;


public class HibernateLoadBankDetails {
	
	
	public static void main(String args[]) { 
		
		 Session session = null;
			try {
			    	// SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			       SessionFactory sessionFactory=HibernateSessionFactory.getSessionFactory();
			      session =sessionFactory.openSession();
			       Bank bankdetails = (Bank) session.load(Bank.class, 1);
			       System.out.println(bankdetails.getBankName());
			       System.out.println(bankdetails.getBanktype());
			       System.out.println(bankdetails.getLocation());
			      
			} 
			
			catch(Exception ex) { 
				ex.printStackTrace();
			}
		
		
	}

}
