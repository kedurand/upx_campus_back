package com.example.upx_campus_back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * The type Upx campus back application.
 */
@SpringBootApplication
@EnableJpaAuditing
public class UpxCampusBackApplication {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(UpxCampusBackApplication.class, args);
    }

}
