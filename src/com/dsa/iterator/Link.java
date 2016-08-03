package com.dsa.iterator;

public class Link {
	public double dData;
	public Link next;
	
	public Link(double d) {
		dData = d;
	}
	
	public void displayLink() {
		System.out.print(dData + " ");
	}
}
