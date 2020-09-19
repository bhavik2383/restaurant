/**
 * 
 */
package com.example.restaurant.services;

import java.util.List;
import java.util.Map;

/**
 * @author Bhavik
 *
 */
public interface ContentService {

	/**
	 * Method retrieves all contents for specific userAgent(e.g android , iphone, internet explorer, chrome etc.)
	 * @param userAgent
	 * @return
	 */
	public Map<String, String> getContents(String userAgent);

	/**
	 * Method adds new content in the content management system.
	 * @param userAgent
	 * @param contents
	 */
	public void addContents(String userAgent, Map<String, String> contents);

	/**
	 * Method remove contents from the content management system.
	 * @param contentIds
	 */
	public void deleteContents(List<String> contentIds);

	/**
	 * Retrieves content information based on content id.
	 * @param contentId
	 * @return
	 */
	public Map<String, String> getContentDetails(String contentId);

	/**
	 * Method updates content based on contentId.
	 * @param contentId
	 * @param contents
	 * @return
	 */
	public  Map<String, String> updateContentDetails(String contentId, Map<String, String> contents);

}
