package com.tka;

import org.springframework.stereotype.Component;

@Component("jio")
public class Jio implements Sim {

	@Override
	public String calling() {
		return "Calling from Jio";
	}
	
	@Override
	public String data() {
		return "Data of jio";
		
	}

}
