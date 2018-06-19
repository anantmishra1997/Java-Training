package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;


public class ReadStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		Session session=factory.getCurrentSession();
		
		try {
			System.out.println("Creating new Objects");
			Student tempStudent= new Student("Gagan","Mishra","gaganmishtra@yahoo.in");
			session.beginTransaction();
			System.out.println("Saving");
			session.save(tempStudent);
			session.getTransaction().commit();
			session=factory.getCurrentSession();
			session.beginTransaction();
			System.out.println(tempStudent.getId());
			Student myStudent=session.get(Student.class,tempStudent.getId());
			System.out.println(myStudent);
			session.getTransaction().commit();
			System.out.println("Done");	
		}
		finally {
			factory.close();
		}
	}

}
