package com.example.policymanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.ModelMap;

@SpringBootApplication
public class PolicymanagementApplication {
	public ModelMap modelMap(){
		return new ModelMap();

	}

	public static void main(String[] args) {
		SpringApplication.run(PolicymanagementApplication.class, args);
	}

}
