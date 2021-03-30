package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class QueryStudentDemo {

	public static void main(String[] args) {
		// create session factory
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();

		// create session
		Session session = sessionFactory.getCurrentSession();
		try {
			session.beginTransaction();
			
			List<Student> resultList = session.createQuery("from Student s where s.firstName='Abhishek'")
					.getResultList();

			resultList.forEach(System.out::println);

			resultList = session.createQuery("from Student s where s.lastName='Doe' OR s.firstName='Daffy'")
					.getResultList();

			resultList.forEach(System.out::println);

			resultList = session.createQuery("from Student s where s.email LIKE '%luv2code.com'").getResultList();

			resultList.forEach(System.out::println);
			session.getTransaction().commit();
		} finally {
			sessionFactory.close();
		}
		//

	}

}
