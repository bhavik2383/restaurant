package com.example.restaurant.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurant.models.AuthenticationRequest;
import com.example.restaurant.models.AuthenticationResponse;
import com.example.restaurant.services.AuthenticationService;

@RequestMapping("/restaurant")
@RestController
public class AuthenticationController {

	@Autowired
	private AuthenticationService authenticationService;

	@RequestMapping(path = "/users/authenticate", method = RequestMethod.POST)
	public ResponseEntity<AuthenticationResponse> authenticateUser(@RequestBody AuthenticationRequest request) {
		return ResponseEntity.status(HttpStatus.OK).body(authenticationService.authenticate(request));
	}
}
