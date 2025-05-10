package com.example.demoOAuth;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class DemoOAuthApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoOAuthApplication.class, args);
	}


	@Override
	public void run(String... args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "clientsecret";
		String encodedPassword = encoder.encode(rawPassword);
		System.out.println("Encoded Password: " + encodedPassword);
	}
}
