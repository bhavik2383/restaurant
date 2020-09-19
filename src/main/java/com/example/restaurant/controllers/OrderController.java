package com.example.restaurant.controllers;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurant.models.OrderRequest;
import com.example.restaurant.models.OrderResponse;
import com.example.restaurant.services.OrderService;

@RequestMapping("/restaurant")
@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;

	@RequestMapping(path = "/order", method = RequestMethod.POST)
	public ResponseEntity<OrderResponse> placeOrder(@RequestBody OrderRequest request) {
		orderService.placeOrder(request);
		return ResponseEntity.status(HttpStatus.OK).body(orderService.placeOrder(request));
	}
	
	@RequestMapping(path = "/order/${orderId}", method = RequestMethod.POST)
	public ResponseEntity<OrderResponse> updateOrder(@PathParam(value = "orderId") String orderId, @RequestBody OrderRequest request) {
		return ResponseEntity.status(HttpStatus.OK).body(orderService.updateOrder(orderId, request));
	}
	
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(path = "/order/${orderId}", method = RequestMethod.POST)
	public void cancelOrder(@PathParam(value = "orderId") String orderId) {
		orderService.cancelOrder(orderId);
	}

	@RequestMapping(path = "/order/${orderId}", method = RequestMethod.GET)
	public ResponseEntity<OrderResponse> getOrderDetails(@PathParam(value = "orderId") String orderId) {
		return ResponseEntity.status(HttpStatus.OK).body(orderService.getOrderDetails(orderId));
	}


}
