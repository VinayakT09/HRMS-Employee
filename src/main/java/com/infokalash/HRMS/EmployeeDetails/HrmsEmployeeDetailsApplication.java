package com.infokalash.HRMS.EmployeeDetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class HrmsEmployeeDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrmsEmployeeDetailsApplication.class, args);
		System.out.println("Program is Executed successfully");
	}

}
