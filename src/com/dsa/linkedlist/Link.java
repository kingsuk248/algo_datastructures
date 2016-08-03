package com.dsa.linkedlist;

public class Link {
	public int iData;
	public double dData;
	public Link next;
	
	public Link(int i, double d) {
		iData = i;
		dData = d;
	}
	
	public void displayLink() {
		System.out.println(iData + ", " + dData);
	}
}
