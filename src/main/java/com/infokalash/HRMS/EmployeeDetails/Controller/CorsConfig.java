package com.infokalash.HRMS.EmployeeDetails.Controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class CorsConfig implements WebMvcConfigurer{
	
	@Override
	public void addCorsMappings (CorsRegistry registry) {
		registry.addMapping("/**")
					.allowedOrigins("*")
					.allowedMethods("GET","POST","PUT","DELETE")
					.allowedHeaders("*")
					.exposedHeaders("Access-Control-Allow-Origin")
					.allowCredentials(false)
					.maxAge(3600);
	}


}
