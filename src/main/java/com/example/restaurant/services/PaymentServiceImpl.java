/**
 * 
 */
package com.example.restaurant.services;

import com.example.restaurant.models.PaymentCancelResponse;
import com.example.restaurant.models.PaymentRequest;
import com.example.restaurant.models.PaymentResponse;

/**
 * @author Bhavik
 *
 */
public interface PaymentServiceImpl {

	/**
	 * Method completes the payments for specific order.
	 * @param orderId
	 * @param request
	 * @return
	 */
	public PaymentResponse completePayment(String orderId, PaymentRequest request);

	/**
	 * Method retrieves payment information for specific order.
	 * @param orderId
	 * @param paymentId
	 * @return
	 */
	public PaymentResponse getPaymentDetails(String orderId, String paymentId);

	/**
	 * Method cancels the payments for specific order.
	 * @param orderId
	 * @param paymentId
	 * @return
	 */
	public PaymentCancelResponse cancelPayment(String orderId, String paymentId);

	/**
	 * Method adjusts the payments for specific order.
	 * @param orderId
	 * @param paymentId
	 * @param request
	 * @return
	 */
	public PaymentResponse adjustPayment(String orderId, String paymentId, PaymentRequest request);

}
