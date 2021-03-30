package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.ordering.antlr.Factory;

import com.luv2code.hibernate.demo.entity.Student;

public class DeleteStudentDemo {

	public static void main(String[] args) {
		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		try {
			int studentId = 1;
//			session.beginTransaction();
//			Student student = session.get(Student.class, studentId);
//			
//			//delete the student
//			session.delete(student);
//			session.getTransaction().commit();
			
			session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.createQuery("delete from Student where id=2").executeUpdate();
			session.getTransaction().commit();
			
			//System.out.println(student.toString());
		}finally {
			sessionFactory.close();
		}
	}

}
