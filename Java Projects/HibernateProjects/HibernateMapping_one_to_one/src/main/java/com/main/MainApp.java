package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.enetity.Laptop;
import com.enetity.Student;

public class MainApp {

	public static void main(String[] args) {
		try {
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Student.class);
		configuration.addAnnotatedClass(Laptop.class);
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		
		// Create Laptop object
		Laptop laptop = new Laptop();
		laptop.setLaptopId(101);
		laptop.setLaptopName("MacBook Pro");
		laptop.setLaptopBrand("Apple");
		
		session.persist(laptop);
		
		// Create Student object
		Student student = new Student();
		student.setStudentName("Vishal");
		student.setAddress("123 Main St Pune");
		student.setLaptop(laptop);
		session.persist(student);
		
		transaction.commit();
		session.close();
		
		System.out.println("Data saved successfully!");
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERROR: " + e.getMessage());
		}
	}

}
