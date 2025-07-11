package com.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("1")
	private int stdId;
	@Value("Vishal Valvi")
	private String name;
	@Value("20")
	private int age;
	@Autowired
	private College college;

	public Student() {
		super();
	}

	public Student(int stdId, String name, int age, College college) {
		super();
		this.stdId = stdId;
		this.name = name;
		this.age = age;
		this.college = college;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	@Override
	public String toString() {
		return "Student: [Student ID="+ stdId + ", name=" + name + ", age=" + age + 
				", College=" + college + "]";
	}
}
