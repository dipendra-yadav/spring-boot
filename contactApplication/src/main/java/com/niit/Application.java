package com.niit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//Maven based,spring Boot  Application


@ComponentScan
//@EnableAutoConfiguration// enable AutoConfiguration
@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);//Run the Application
	}

}
