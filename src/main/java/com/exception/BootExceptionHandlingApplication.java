package com.exception;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootExceptionHandlingApplication {

	/*
	 * This project is controller based and global exception handling.
	 */
	
	public static void main(String[] args) {
		SpringApplication.run(BootExceptionHandlingApplication.class, args);
	}

}
