/**
 * 
 */
package com.example.restaurant.services;

import java.util.List;

import com.example.restaurant.models.Menu;

/**
 * @author Bhavik
 *
 */
public interface MenuService {

	/**
	 * Method retrives all menus.
	 * @return
	 */
	public List<Menu> getAllMenu();

	/**
	 * Method retrieves specific menu details.
	 * @param menuId
	 * @return
	 */
	public Menu getManuDetails(String menuId);

	/**
	 * Method update the specific menu based on menuId.
	 * @param menuId 
	 * @param menu
	 * @return
	 */
	public Menu updateMenu(String menuId, Menu menu);

	/**
	 * Method delete specific menu based on menuId.
	 * @param menuId
	 */
	public void deleteMenu(String menuId);

	/**
	 * Method Create new menu.
	 * @param menu
	 * @return
	 */
	public Menu createMenu(Menu menu);

}
