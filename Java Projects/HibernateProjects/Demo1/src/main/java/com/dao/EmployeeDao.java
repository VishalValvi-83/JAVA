package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entities.Employee;

public class EmployeeDao {

	public void updateData(int id, String name, int age, String city, String salary, String dept) {
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
			Employee emp = session.get(Employee.class, id);
			if (emp != null) {
				emp.setEmpName(name);
				emp.setEmpAge(age);
				emp.setEmpCity(city);
				emp.setEmpSalary(salary);
				emp.setEmpDept(dept);
				session.merge(emp);
				tran.commit();
				System.out.println("Employee with ID " + id + " updated successfully: " + emp);
			} else {
				System.out.println("Employee with ID " + id + " not found");
			}
			session.close();
			sf.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error occurred while updating employee data: " + e.getMessage());
		}
	}

	public void deleteData(int id) {
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
			Employee emp = session.get(Employee.class, id);
			if (emp != null) {
				session.remove(emp);
				tran.commit();
				System.out.println("Employee with ID " + id + " deleted successfully");
			} else {
				System.out.println("Employee with ID " + id + " not found");
			}
			session.close();
			sf.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error occurred while deleting employee data: " + e.getMessage());
		}
	}

	public void insertData(int id, String name, int age, String city, String salary, String dept) {
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

			Employee emp = new Employee(id, name, age, city, salary, dept);
			session.persist(emp);
			tran.commit();
			System.out.println("Employee inserted successfully: " + emp);

			session.close();
			sf.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error occurred while inserting employee data: " + e.getMessage());
		}
	}
}
