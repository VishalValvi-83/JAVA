package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	@Id
	private int deptId;
	private String dName;

	@OneToMany
	private List<Employee> employees;

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public Department() {
		// Default constructor
	}

	public Department(int deptId, String dName) {
		super();
		this.deptId = deptId;
		this.dName = dName;
	}

	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", dName=" + dName + "]";
	}

}
