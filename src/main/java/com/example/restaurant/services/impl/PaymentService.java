/**
 * 
 */
package com.example.restaurant.services.impl;

import com.example.restaurant.models.PaymentCancelResponse;
import com.example.restaurant.models.PaymentRequest;
import com.example.restaurant.models.PaymentResponse;
import com.example.restaurant.services.PaymentServiceImpl;

/**
 * @author Bhavik
 *
 */
public class PaymentService implements PaymentServiceImpl {

	@Override
	public PaymentResponse completePayment(String orderId, PaymentRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentResponse getPaymentDetails(String orderId, String paymentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentCancelResponse cancelPayment(String orderId, String paymentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentResponse adjustPayment(String orderId, String paymentId, PaymentRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
