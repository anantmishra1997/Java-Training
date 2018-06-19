package com.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;


public class CreateStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			session.createQuery("update Student set firstName='Kanha' where email='kanhamishra76@yahoo.in'").executeUpdate();
			session.getTransaction().commit();
			System.out.println("Done");
		}
		finally {
			factory.close();
		}
	}

}
