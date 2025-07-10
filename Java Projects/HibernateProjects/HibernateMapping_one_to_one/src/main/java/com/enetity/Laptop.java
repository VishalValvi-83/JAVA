package com.enetity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
	@Id
	int laptopId;
	String laptopName;
	String laptopBrand;

	public Laptop() {
		// Default constructor
	}

	public Laptop(int laptopId, String laptopName, String laptopBrand) {
		super();
		this.laptopId = laptopId;
		this.laptopName = laptopName;
		this.laptopBrand = laptopBrand;
	}

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	public String getLaptopBrand() {
		return laptopBrand;
	}

	public void setLaptopBrand(String laptopBrand) {
		this.laptopBrand = laptopBrand;
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", laptopName=" + laptopName + ", laptopBrand=" + laptopBrand + "]";
	}

}
