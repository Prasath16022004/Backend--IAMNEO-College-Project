package com.e727821tuit114.reciperealm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication

@Configuration
@PropertySource(value="classpath:application.properties")
public class TablecreationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TablecreationApplication.class, args);
	}

}





