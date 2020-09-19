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
import com.example.restaurant.utils.Constants;

@RequestMapping("/restaurant")
@RestController
public class CartController {

	@Autowired
	private CartService cartService;

	@RequestMapping(path = "/carts", method = RequestMethod.POST)
	public ResponseEntity<Cart> createCart() {
		Cart cart = cartService.createCart();
		return ResponseEntity.status(HttpStatus.CREATED).header(Constants.LOCATION_HEADER, "/carts/" + cart.getCartId()).body(cart);
		
	}

	@RequestMapping(path = "/carts/${cartId}/items", method = RequestMethod.POST)
	public ResponseEntity<Cart> addItemsToCart(@PathParam(value = "cartId") String cartId, List<Item> items) {
		return ResponseEntity.status(HttpStatus.OK).body(cartService.addItemsToCart(cartId, items));
	}

	@RequestMapping(path = "/carts/${cartId}/items", method = RequestMethod.DELETE)
	public ResponseEntity<Cart> removeItemsFromCart(@PathParam(value = "cartId") String cartId, List<Item> items) {
		return ResponseEntity.status(HttpStatus.OK).body(cartService.removeItemsFromCart(cartId, items));
	}

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(path = "/carts/${cartId}", method = RequestMethod.DELETE)
	public void removeAllItemsFromCart(@PathParam(value = "cartId") String cartId) {
		cartService.removeAllItemsFromCart(cartId);
	}

	@RequestMapping(path = "/carts/${cartId}", method = RequestMethod.GET)
	public ResponseEntity<Cart> getCartDetails(@PathParam(value = "cartId") String cartId) {
		return ResponseEntity.status(HttpStatus.OK).body(cartService.getCartDetails(cartId));
	}

}
