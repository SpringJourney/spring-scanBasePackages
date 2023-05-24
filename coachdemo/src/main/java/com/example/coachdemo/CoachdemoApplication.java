package com.example.coachdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		scanBasePackages = {"com.example.coachdemo","com.example.util"}
)
public class CoachdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoachdemoApplication.class, args);
	}

}
