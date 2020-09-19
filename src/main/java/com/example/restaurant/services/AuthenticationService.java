/**
 * 
 */
package com.example.restaurant.services;

import com.example.restaurant.models.AuthenticationRequest;
import com.example.restaurant.models.AuthenticationResponse;

/**
 * @author Bhavik Defines method for user authentication
 */
public interface AuthenticationService {
	/**
	 * Method performs user authentication
	 * @param request
	 * @return
	 */
	public AuthenticationResponse authenticate(AuthenticationRequest request);
}
