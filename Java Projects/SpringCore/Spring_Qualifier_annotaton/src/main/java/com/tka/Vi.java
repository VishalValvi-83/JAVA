package com.tka;

import org.springframework.stereotype.Component;

@Component("vi")
public class Vi implements Sim {

	@Override
	public String calling() {
		return "Calling from Vi";
	}

	@Override
	public String data() {
		return "Data of Vi";

	}

}
