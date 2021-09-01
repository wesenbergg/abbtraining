package com.solteq.abbtraining;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class AbbtrainingApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbbtrainingApplication.class, args);
	}

}
