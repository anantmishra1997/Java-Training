package com.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;


public class QueryStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			List<Student> theStudents=session.createQuery("from Student").list();
			for(Student temp : theStudents) {
				System.out.println(temp);
			}
			theStudents=session.createQuery("from Student s where s.lastName='asdf' or s.firstName='Gagan'").getResultList();
			for(Student temp : theStudents) {
				System.out.println("Last Name: "+temp);
			}
			theStudents=session.createQuery("from Student s where s.email like '%yahoo.in'").getResultList();
			for(Student temp : theStudents) {
				System.out.println("Email : "+temp);
			}
			session.getTransaction().commit();
			System.out.println("Done");
		}
		finally {
			factory.close();
		}
	}

}
