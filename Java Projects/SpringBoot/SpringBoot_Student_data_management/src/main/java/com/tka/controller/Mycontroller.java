package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Student;
import com.tka.service.MyServices;

@RestController
public class Mycontroller {

	@Autowired
	MyServices service;

	@PostMapping("/save")
	public String saveData(@RequestBody Student s) {
		try {
			String msg = service.insertData(s);
			return msg;
		} catch (Exception e) {
			e.printStackTrace();
			return "Failed to insert data";
		}
	}

	@DeleteMapping("/delete/{stdId}")
	public String saveData(@PathVariable int stdId) {
		try {
			String msg = service.deleteData(stdId);
			return msg;
 		} catch (Exception e) {
			e.printStackTrace();
			return "Failed to insert data";
		}
	}
	@GetMapping("/get/{stdId}")
	public Student getData(@PathVariable int stdId) {
		try {
			Student student = service.getData(stdId);
			return student;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
