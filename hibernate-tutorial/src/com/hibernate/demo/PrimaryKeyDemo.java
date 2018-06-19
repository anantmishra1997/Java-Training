package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		
		try {
			System.out.println("Creating new Objects");
			Student tempStudent= new Student("Anant","Mishra","kanhamishra76@yahoo.in");
			Student tempStudent1= new Student("Bharat","Chaudhary","xyz@yahoo.in");
			Student tempStudent2= new Student("Abhinav","Jha","fds@yahoo.in");
			Student tempStudent3= new Student("Ram","Sham","aefd@yahoo.in");
			session.beginTransaction();
			System.out.println("Saving");
			session.save(tempStudent);
			session.save(tempStudent1);
			session.save(tempStudent2);
			session.save(tempStudent3);
			session.getTransaction().commit();
			System.out.println("Done");
		}
		finally {
			factory.close();
		}
	}

}
