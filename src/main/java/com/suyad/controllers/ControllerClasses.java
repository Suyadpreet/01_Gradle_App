package com.suyad.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.suyad.Entities.Student;

@RestController
public class ControllerClasses 
{
	@Autowired
	Student std;
	
	@GetMapping("/welcome")
	public String getWelcomeMessage()
	{
		std.setName("Suyadpreet");
		return "Hiiii welcome ";
	}
}
