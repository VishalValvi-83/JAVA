package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	private int empId;
	private String empName;
	private String empAddress;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", department="
				+ department + "]";
	}

	public Employee(int empId, String empName, String empAddress, Department department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.department = department;
	}

	public String getEmpName() {
		return empName;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@ManyToOne
//	@jakarta.persistence.JoinColumn(name = "")
	private Department department;

}
