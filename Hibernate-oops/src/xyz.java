import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class xyz {

	public static void main(String[] args) {
		Session session=null;
		
		try {
			System.out.println("Inserting Record");
			Student s1=new Student();
			s1.setId(20);
			s1.setName("Anant");
			s1.setMarks(9);
			s1.setGrade("Pass");
			System.out.println("Inserting Record 223");
			Configuration cf=new Configuration().configure();
			SessionFactory ses=cf.buildSessionFactory();
			session= ses.openSession();
			
			System.out.println("Inserting Row 22");
			session.beginTransaction();
			session.save(s1);
			session.getTransaction().commit();
			System.out.println("Done");
			
		}
		catch(HibernateException e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
	}
}
