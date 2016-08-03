package com.dsa.custom.exception;

public class CollectionFull extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CollectionFull(Object object) {
		System.out.println(object.getClass() + " is already full");
	}

}
