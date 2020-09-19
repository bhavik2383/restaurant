package com.example.restaurant.controllers;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.restaurant.models.PaymentCancelResponse;
import com.example.restaurant.models.PaymentRequest;
import com.example.restaurant.models.PaymentResponse;
import com.example.restaurant.services.PaymentServiceImpl;

@RequestMapping("/restaurant")
@RestController
public class PaymentController {

	@Autowired
	private PaymentServiceImpl paymentServiceImpl;

	@RequestMapping(path = "/order/${orderId}/payment", method = RequestMethod.POST)
	public ResponseEntity<PaymentResponse> completePayment(@PathParam(value = "orderId") String orderId,
			@RequestBody PaymentRequest request) {
		return ResponseEntity.status(HttpStatus.OK).body(paymentServiceImpl.completePayment(orderId, request));

	}

	@RequestMapping(path = "/order/${orderId}/payment", method = RequestMethod.PUT)
	public ResponseEntity<PaymentResponse> adjustPayment(@PathParam(value = "orderId") String orderId,
			@PathParam(value = "paymentId") String paymentId, @RequestBody PaymentRequest request) {
		return ResponseEntity.status(HttpStatus.OK).body(paymentServiceImpl.adjustPayment(orderId, paymentId, request));

	}

	@RequestMapping(path = "/order/${orderId}/payment/${paymentId}", method = RequestMethod.GET)
	public ResponseEntity<PaymentResponse> getPaymentDetails(@PathParam(value = "orderId") String orderId,
			@PathParam(value = "paymentId") String paymentId) {
		return ResponseEntity.status(HttpStatus.OK).body(paymentServiceImpl.getPaymentDetails(orderId, paymentId));

	}

	@RequestMapping(path = "/order/${orderId}/payment/${paymentId}", method = RequestMethod.DELETE)
	public ResponseEntity<PaymentCancelResponse> cancelPayment(@PathParam(value = "orderId") String orderId,
			@PathParam(value = "paymentId") String paymentId) {
		return ResponseEntity.status(HttpStatus.OK).body(paymentServiceImpl.cancelPayment(orderId, paymentId));

	}
}
