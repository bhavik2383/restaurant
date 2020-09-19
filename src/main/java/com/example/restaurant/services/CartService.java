/**
 * 
 */
package com.example.restaurant.services;

import java.util.List;

import com.example.restaurant.models.Cart;
import com.example.restaurant.models.Item;

/**
 * @author Bhavik
 *
 */
public interface CartService {

	/**
	 * Method removes all items from the cart
	 * @param cartId
	 * @return
	 */
	public Cart removeAllItemsFromCart(String cartId);

	/**
	 * Method adds new items into the cart
	 * @param cartId
	 * @param items
	 * @return
	 */
	public Cart addItemsToCart(String cartId, List<Item> items);

	/**
	 * Method removes items from the cart
	 * @param cartId
	 * @param items
	 * @return
	 */
	public Cart removeItemsFromCart(String cartId, List<Item> items);

	/**
	 * Method retrieves the cart information
	 * @param cartId
	 * @return
	 */
	public Cart getCartDetails(String cartId);

	/**
	 * Method empty the cart
	 * @return
	 */
	public Cart createCart();

}
