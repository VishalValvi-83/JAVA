package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.entity.College;

@Configuration
public class ConfigClass {

	 @Bean
	 public College myCollege() {
	     return new College();
	 }
}
