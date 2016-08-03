package com.dsa.custom.exception;

public class CollectionEmpty extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CollectionEmpty(Object obj) {
		System.out.println(obj.getClass() + " is empty");
	}
}
