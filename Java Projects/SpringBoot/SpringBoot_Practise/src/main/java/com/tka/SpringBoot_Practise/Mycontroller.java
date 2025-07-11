package com.tka.SpringBoot_Practise;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mycontroller {

	@PutMapping("/update")
	public String updateData() {
		return "Data updated successfully.";
	}

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	public String getData() {
		return "Data retrieved successfully.";
	}

	@RequestMapping(value = "/post", method = RequestMethod.POST)
	public String postData() {
		return "Data posted successfully.";
	}

	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public String deleteData() {
		return "Data with ID deleted.";
	}

	@RequestMapping("*")
	public String fallbackAPI() {
		return "ERROR, Not Found!!!";
	}

}
