package com.boot.angular.angularwithboot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/application")
public class ApplicationController {

	@GetMapping
	public ResponseEntity<String> appName() {
		return new ResponseEntity<String>("Web application with spring boot and angular", HttpStatus.OK);
	}

}
