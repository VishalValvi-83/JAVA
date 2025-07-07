package com.services;

import com.dao.EmployeeDao;

public class EmployeeServices {
	EmployeeDao empDao = new EmployeeDao();

	public EmployeeServices() {
		
	}

	public void insertData(int id, String name, int age, String city, String salary, String dept) {
		empDao.insertData(id, name, age, city, salary, dept);
	}

	public void updateData(int id, String name, int age, String city, String salary, String dept) {
	    empDao.updateData(id, name, age, city, salary, dept);
	}

	public void deleteData(int id) {
	    empDao.deleteData(id);
	}
}
