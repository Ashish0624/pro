package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.EmailService;

@RestController
public class Controller {

	@Autowired
    EmailService emailService;
	
	@RequestMapping("/api/{en}")
	public HttpEntity<?> helloWorld(@PathVariable String en) {
		System.out.println("in controller");
		String result = emailService.helloWorld(en);
		return ResponseEntity.ok(result);
	}
}
