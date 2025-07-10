package com.entities;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateData {

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
			// Fetch the Employee object to be updated
			int id = 2;
			Employee emp = session.get(Employee.class, id);
			if (emp != null) {

				// Update Employee object
				emp.setEmpName("Bhushan");
				emp.setEmpAge(22);
				emp.setEmpCity("Dhule");
				emp.setEmpSalary("40000");
				emp.setEmpDept("Id");

				// Use merge to update the Employee object
				session.merge(emp);
				tran.commit();
				System.out.println("Employee with ID " + id + " updated successfully: " + emp);
			} else {
				System.out.println("Employee with ID " + id + " not found");
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error occurred while updating employee data: " + e.getMessage());
		}

	}

}
