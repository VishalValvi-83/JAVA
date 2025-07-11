package com.tka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigClass.class);
		User user = context.getBean(User.class);
		
		System.out.println(user.getSim1().calling());
		System.out.println(user.getSim2().calling());
		System.out.println(user.getSim2().data());
		System.out.println(user.getSim1().data());

	}
}
