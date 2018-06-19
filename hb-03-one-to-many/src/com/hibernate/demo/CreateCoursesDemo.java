package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;


public class CreateCoursesDemo {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		
		try {
			session.beginTransaction();
		 	int id=1;
		 	Instructor instructor=session.get(Instructor.class, id);
		 	Course temp1=new Course("Classical");
		 	Course temp2=new Course("Folk");
		 	instructor.add(temp1);
		 	instructor.add(temp2);
		 	session.save(temp1);
		 	session.save(temp2);
		 	session.getTransaction().commit();
			System.out.println("Done");
		}
		finally {
			session.close();
			factory.close();
		}
	}

}
