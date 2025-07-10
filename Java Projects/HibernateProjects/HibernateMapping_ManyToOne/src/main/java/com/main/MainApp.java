package com.main;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Department;
import com.entity.Employee;

public class MainApp {

	public static void main(String[] args) {
		try {
			Configuration configuration = new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(Employee.class);
			configuration.addAnnotatedClass(Department.class);

			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();

			// Create Department object
			Department department = new Department();
			department.setDeptId(1);
			department.setdName("Developer");

			// Create Employee object
			Employee employee1 = new Employee();
			employee1.setEmpId(101);
			employee1.setEmpName("Dev");
			employee1.setEmpAddress("123 Main St pune");
			employee1.setDepartment(department);
			session.persist(employee1);

			Employee employee2 = new Employee();
			employee2.setEmpId(102);
			employee2.setEmpName("Ravi");
			employee2.setEmpAddress("456 Elm St pune");
			employee2.setDepartment(department);
			session.persist(employee2);

			Employee employee3 = new Employee();
			employee3.setEmpId(103);
			employee3.setEmpName("Suresh");
			employee3.setEmpAddress("789 Oak St pune");
			employee3.setDepartment(department);
			session.persist(employee3);

			ArrayList<Employee> list = new ArrayList<>();
			list.add(employee1);
			list.add(employee2);
			list.add(employee3);

			department.setEmployees(list);

			session.persist(department);
			transaction.commit();
			session.close();

			System.out.println("Data saved successfully!");

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ERROR: " + e.getMessage());
		}
	}

}
