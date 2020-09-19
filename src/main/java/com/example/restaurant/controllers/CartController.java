package com.example.restaurant.controllers;

import java.util.List;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurant.models.Cart;
import com.example.restaurant.models.Item;
import com.example.restaurant.services.CartService;

@RequestMapping("/restaurant")
@RestController
public class CartController {

	@Autowired
	private CartService cartService;

	@RequestMapping(path = "/cart/${cartId}/items/{itemId}", method = RequestMethod.POST)
	public ResponseEntity<Cart>  addItemToCart(@PathParam(value = "cartId") String cartId,
			@PathParam(value = "itemId") String itemId) {
		return ResponseEntity.status(HttpStatus.OK).body(cartService.addItemToCart(cartId, itemId));
	}

	@RequestMapping(path = "/cart/${cartId}/items", method = RequestMethod.POST)
	public ResponseEntity<Cart>  addMultipleItemsToCart(@PathParam(value = "cartId") String cartId, List<Item> items) {
		return ResponseEntity.status(HttpStatus.OK).body(cartService.addMultipleItemsToCart(cartId, items));
	}

	@RequestMapping(path = "/cart/${cartId}/items/{itemId}", method = RequestMethod.POST)
	public ResponseEntity<Cart>  removeItemFromCart(@PathParam(value = "cartId") String cartId,
			@PathParam(value = "itemId") String itemId) {
		return ResponseEntity.status(HttpStatus.OK).body(cartService.removeItemFromCart(cartId, itemId));
	}

	@RequestMapping(path = "/cart/${cartId}/items/{itemId}", method = RequestMethod.POST)
	public ResponseEntity<Cart>  removeMultipleItemFromCart(@PathParam(value = "cartId") String cartId, List<Item> items) {
		return ResponseEntity.status(HttpStatus.OK).body(cartService.removeMultipleItemsFromCart(cartId, items));
	}

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(path = "/cart/${cartId}", method = RequestMethod.POST)
	public void removeAllItemsFromCart(@PathParam(value = "cartId") String cartId) {
		cartService.removeAllItemsFromCart(cartId);
	}
	
	@RequestMapping(path = "/cart/${cartId}", method = RequestMethod.POST)
	public ResponseEntity<Cart> getCartDetails(@PathParam(value = "cartId") String cartId) {
		return ResponseEntity.status(HttpStatus.OK).body(cartService.getCartDetails(cartId));
	}

}
