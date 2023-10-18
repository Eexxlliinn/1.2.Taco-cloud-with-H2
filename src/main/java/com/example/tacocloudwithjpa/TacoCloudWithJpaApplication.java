package com.example.tacocloudwithjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class TacoCloudWithJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudWithJpaApplication.class, args);
	}

}
