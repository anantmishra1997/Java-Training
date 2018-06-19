package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;


public class CreateDemo {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		
		try {
			Instructor instructor=new Instructor("Gagan","Mishra","gaganmishra@yahoo.in");
			InstructorDetail detail=new InstructorDetail("def", "Singing");
			instructor.setInstructorDetail(detail);
			session.beginTransaction();
			System.out.println("Saving Instructor");
			session.save(instructor);
		 	session.getTransaction().commit();
			System.out.println("Done");
		}
		finally {
			factory.close();
		}
	}

}
