package com.controller;

import com.services.EmployeeServices;

public class EmployeeController {

	public static void main(String[] args) {
		EmployeeServices empServ = new EmployeeServices();
//		empServ.updateData(0, null, 0, null, null, null);
		
		// empServ.insertData();
		// empServ.deleteData();
		System.out.println("Operation completed successfully.");
		
	}

}
