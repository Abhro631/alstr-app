package com.training.messaging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class AlstromApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(AlstromApp1Application.class, args);
		System.out.println("this is a message app");
	}

}
