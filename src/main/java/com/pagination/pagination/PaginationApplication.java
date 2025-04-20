package com.pagination.pagination;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PaginationApplication {

	@Value("${spring.profiles.active}")
    private String activeProfile;

	public static void main(String[] args) {
		SpringApplication.run(PaginationApplication.class, args);
		System.out.println("Application Running 🚀");
	}

	@Bean
    public CommandLineRunner run() {
        return args -> {
            System.out.println("Running with profile: " + activeProfile);
        };
    }

}
