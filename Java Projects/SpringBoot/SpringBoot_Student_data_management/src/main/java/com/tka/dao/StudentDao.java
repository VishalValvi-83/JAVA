package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Student;

@Repository
public class StudentDao {

	@Autowired
	SessionFactory factory;

	public String insertData(Student s) throws Exception {
		try {
			Session session = factory.openSession();
			Transaction tr = session.beginTransaction();

			session.persist(s);
			tr.commit();
			session.close();
			return "Data is inserted";

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return "Failed to insert data";
		}

	}

	public String deleteData(int stdId) {
		try {
			Session session = factory.openSession();
			Transaction tr = session.beginTransaction();

			Student student = session.get(Student.class, stdId);
			if (student != null) {
				session.remove(student);
				tr.commit();
			} else {
				System.out.println("Student not found with ID: " + stdId);
			}
			session.close();
			return "Data deleted successfully";
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return "Failed to delete data";
		}

	}

	public Student getData(int stdId) {
		try {
			Session session = factory.openSession();
			Student student = session.get(Student.class, stdId);
			session.close();
			return student;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return null;
		}
	}

}
