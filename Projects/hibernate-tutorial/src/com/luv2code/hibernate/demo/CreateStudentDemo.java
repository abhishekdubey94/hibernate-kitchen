package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		// create session
		Session session = sessionFactory.getCurrentSession();
		
		try {
			System.out.println("Creating a new student object");
			Student student = new Student("Abhishek","Dubey","abhishek");
			session.beginTransaction();
			session.save(student);
			session.getTransaction().commit();
			System.out.println("Student save");
		} finally {
			sessionFactory.close();
		}
		//

	}

}
