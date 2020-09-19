package com.example.restaurant.controllers;

import java.util.List;
import java.util.Map;

import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurant.services.ContentService;

@RestController
@RequestMapping("/restaurant/ui")
public class ContentController {

	@Autowired
	private ContentService contentService;

	@RequestMapping(path = "/contents", method = RequestMethod.GET)
	public ResponseEntity<Map<String, String>> getContents(@QueryParam(value = "userAgent") String userAgent) {
		return ResponseEntity.status(HttpStatus.OK).body(contentService.getContents(userAgent));
	}

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(path = "/contents", method = RequestMethod.GET)
	public void addContents(@QueryParam(value = "userAgent") String userAgent,
			@RequestBody Map<String, String> contents) {
		contentService.addContents(userAgent, contents);
	}

	@RequestMapping(path = "/contents/${contentId}", method = RequestMethod.GET)
	public ResponseEntity<Map<String, String>> getContentDetails(@RequestParam String contentId) {
		return ResponseEntity.status(HttpStatus.OK).body(contentService.getContentDetails(contentId));
	}

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(path = "/contents", method = RequestMethod.DELETE)
	public void deleteContents(@RequestBody List<String> contentIds) {
		contentService.deleteContents(contentIds);
	}

}
