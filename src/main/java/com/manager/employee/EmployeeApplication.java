package com.manager.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}
//	@Bean
//	public void addCorsMappings(CorsRegistry corsRegistry){
//		corsRegistry.addMapping("/**").allowedOrigins("http://localhost:4200").allowedMethods("GET","POST",
//				"PUT","DELETE");
//	}

}
