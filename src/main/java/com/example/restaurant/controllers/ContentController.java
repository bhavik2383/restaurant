package com.example.restaurant.controllers;

import java.util.Map;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurant.services.ContentService;

@RestController
@RequestMapping("/restaurant/ui")
public class ContentController {

	@Autowired
	private ContentService contentService;

	@RequestMapping(path = "/contents", method = RequestMethod.GET)
	public ResponseEntity<Map<String,String>> getContents(@QueryParam(value ="userAgent") String userAgent) {
		return ResponseEntity.status(HttpStatus.OK).body(contentService.getContents(userAgent));
	}

}
