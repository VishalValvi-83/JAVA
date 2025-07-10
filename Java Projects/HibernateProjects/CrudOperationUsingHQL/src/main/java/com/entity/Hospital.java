package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hospital {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String P_name;
	int P_age;

	public Hospital() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Hospital(String p_name, int p_age, String p_address) {
		super();
		this.P_name = p_name;
		this.P_age = p_age;	
		this.P_address = p_address;
	}

	public String getP_name() {
		return P_name;
	}

	public void setP_name(String p_name) {
		P_name = p_name;
	}

	public int getP_age() {
		return P_age;
	}

	public void setP_age(int p_age) {
		P_age = p_age;
	}

	public String getP_address() {
		return P_address;
	}

	public void setP_address(String p_address) {
		P_address = p_address;
	}

	@Override
	public String toString() {
		return "Hospital [id=" + id + ", P_name=" + P_name + ", P_age=" + P_age + ", P_address=" + P_address + "]";
	}

	String P_address;

}
