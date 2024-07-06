package com.pipasoft.jsymphonic;

import java.net.URL;

import javax.swing.ImageIcon;

/**
 * a more centralized place to load resources
 * 
 * @author bpipa
 *
 */
public class ResourceLoader {

	/**
	 * gets the URL to a resource
	 * 
	 * @param name the name of the resource
	 * @return the URL to the resource
	 */
	public static URL get(String name) {
		return ResourceLoader.class.getResource("/"+name);
	}

	/**
	 * gets an icon by name
	 * 
	 * @param name the name of the icon image
	 * @return an ImageIcon object
	 */
	public static ImageIcon getIcon(String name) {
		return new ImageIcon(get(name));
	}	
	
}
