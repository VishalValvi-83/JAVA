package com.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee_details")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int empID;
	String empName;
	@Column(name = "empCity")
	String empCity;
	int empAge;
	String empSalary;
	String empDept;

	
	public Employee() {
		super();
	}

	public Employee(int empID, String empName, int empAge, String empCity, String empSalary, String empDept) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empAge = empAge;
		this.empCity = empCity;
		this.empSalary = empSalary;
		this.empDept = empDept;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public String getEmpSalary() {
		return empSalary;
	}

	@Override
	public String toString() {
		return "Employee [Employee_ID=" + empID + ", empName=" + empName + ", empAge=" + empAge + ", empCity=" + empCity
				+ ", empSalary=" + empSalary + ", empDept=" + empDept + "]";
	}

	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

}
