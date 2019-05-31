package com.example.upx_campus_back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class UpxCampusBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpxCampusBackApplication.class, args);
	}

}
