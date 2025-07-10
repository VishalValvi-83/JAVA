package com.enetity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int studentId;
	String studentName;
	String address;
	// One-to-One mapping with Laptop entity
	@OneToOne
	Laptop laptop;

	public Student() {
		// Default constructor

	}

	public Student(int studentId, String studentName, String address, Laptop laptop) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.address = address;
		this.laptop = laptop;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", address=" + address + ", laptop="
				+ laptop + "]";
	}

	public void setAddress(String string) {
		this.address = string;
	}

}
