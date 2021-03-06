package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;


public class DeleteDemo {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		
		try {
			int id=1;
			session.beginTransaction();
			Instructor instructor =session.get(Instructor.class,id);
			session.delete(instructor);
		 	session.getTransaction().commit();
			System.out.println("Done");
		}
		finally {
			factory.close();
		}
	}

}
