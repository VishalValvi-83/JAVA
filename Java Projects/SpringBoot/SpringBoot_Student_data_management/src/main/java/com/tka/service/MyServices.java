package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.StudentDao;
import com.tka.entity.Student;

@Service
public class MyServices {
	@Autowired
	StudentDao dao;

	public String insertData(Student s) throws Exception {
		String msg = dao.insertData(s);
		return msg;
	}

	public String deleteData(int stdId) {
		try {
			String msg = dao.deleteData(stdId);
			return msg;
		} catch (Exception e) {
			e.printStackTrace();
			return e.getMessage();
		}
	}

	public Student getData(int stdId) {
		try {
			Student student = dao.getData(stdId);
			return student;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
