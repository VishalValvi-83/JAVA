package com.entities;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteData {
	public static void main(String[] args) {
		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			cfg.addAnnotatedClass(Employee.class);
			SessionFactory sf = cfg.buildSessionFactory();
			Session session = sf.openSession();

			if (session == null) {
				System.out.println("Session is null");
				return;
			} else {
				System.out.println("Session opened successfully");
			}
			Transaction tran = session.beginTransaction();

			// Fetch the Employee object to be deleted
			int id = 1; // Assuming the ID of the employee to delete is 1
			Employee emp = session.get(Employee.class, id);

			if (emp != null) {
				// session.delete(emp);
				session.remove(emp);
				tran.commit();
				System.out.println("Employee with ID 1 deleted successfully");
			} else {
				System.out.println("Employee with ID 1 not found");
			}
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error occurred while deleting employee data: " + e.getMessage());
		}
	}
}
