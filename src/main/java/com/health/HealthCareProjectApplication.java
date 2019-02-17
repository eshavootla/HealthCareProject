package com.health;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.health.controller")
public class HealthCareProjectApplication extends SpringBootServletInitializer {

	@Override
    public SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HealthCareProjectApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(HealthCareProjectApplication.class, args);
	}

}
