package com.ibm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.ibm"})
public class OptusRestFulWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OptusRestFulWebserviceApplication.class, args);
	}

}
