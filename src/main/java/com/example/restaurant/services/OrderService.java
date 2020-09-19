/**
 * 
 */
package com.example.restaurant.services;

import com.example.restaurant.models.OrderRequest;
import com.example.restaurant.models.OrderResponse;

/**
 * @author Bhavik
 *
 */
public interface OrderService {

	/**
	 * Method place new order. This should include information about order for
	 * specific table and order source (dine-in/online/pick up). If it is dine-in order then it is for which
	 * table.
	 * 
	 * @param request
	 * @return
	 */
	public OrderResponse placeOrder(OrderRequest request);

	/**
	 * Method returns existing order information based on orderId. This should
	 * include the status of the order. 
	 * 
	 * @param orderId
	 * @return
	 */
	public OrderResponse getOrderDetails(String orderId);

	/**
	 * Method updates order information for order with orderId. This should also
	 * update the status for the order.
	 * 
	 * @param orderId
	 * @param request
	 * @return
	 */
	public OrderResponse updateOrder(String orderId, OrderRequest request);

	/**
	 * Method Cancel specific order with orderId.
	 * 
	 * @param orderId
	 */
	public void cancelOrder(String orderId);

	/**
	 * Method updates the status of the order
	 * @param orderId
	 */
	public void updateOrderStatus(String orderId);

}
