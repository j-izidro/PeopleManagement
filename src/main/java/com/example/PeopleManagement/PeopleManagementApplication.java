package com.example.PeopleManagement;

//import Controller.PersonController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@Configuration
//@ComponentScan(basePackageClasses = PersonController.class)
public class PeopleManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PeopleManagementApplication.class, args);
	}

}
