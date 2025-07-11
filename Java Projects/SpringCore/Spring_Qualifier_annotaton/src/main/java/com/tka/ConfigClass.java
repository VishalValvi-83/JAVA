package com.tka;

import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = {"com.tka"})
public class ConfigClass {
	// This class is used to enable component scanning in the specified package.
	// It will automatically detect and register beans annotated with @Component.
	// No additional configuration is needed here for basic component scanning.

}
