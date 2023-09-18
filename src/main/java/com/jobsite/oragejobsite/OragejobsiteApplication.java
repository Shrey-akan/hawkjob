package com.jobsite.oragejobsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.jobsite.oragejobsite")
public class OragejobsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(OragejobsiteApplication.class, args);
	}

}
