package com.example.restaurant.controllers;

import java.util.List;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurant.models.Menu;
import com.example.restaurant.services.MenuService;

@RequestMapping("/restaurant")
@RestController
public class MenuController {

	@Autowired
	private MenuService menuService;

	@RequestMapping(path = "/menus", method = RequestMethod.POST)
	public ResponseEntity<Menu> createMenu(@RequestBody Menu menu) {
		return ResponseEntity.status(HttpStatus.CREATED).body(menuService.createMenu(menu));
	}

	@RequestMapping(path = "/menus", method = RequestMethod.GET)
	public ResponseEntity<List<Menu>> getAllManu() {
		return ResponseEntity.status(HttpStatus.OK).body(menuService.getAllMenu());
	}

	@RequestMapping(path = "/menus/${menuId}", method = RequestMethod.GET)
	public ResponseEntity<Menu> getManuDetails(@PathParam(value = "menuId") String menuId) {
		return ResponseEntity.status(HttpStatus.OK).body(menuService.getManuDetails(menuId));
	}

	@RequestMapping(path = "/menus/${menuId}", method = RequestMethod.PUT)
	public ResponseEntity<Menu> updateMenu(@PathParam(value = "menuId") String menuId, @RequestBody Menu menu) {
		return ResponseEntity.status(HttpStatus.OK).body(menuService.updateMenu(menuId, menu));
	}

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(path = "/menus/${menuId}", method = RequestMethod.DELETE)
	public void deleteMenu(@PathParam(value = "menuId") String menuId) {
		menuService.deleteMenu(menuId);
	}
}
