package com.dsa.hashtables;

public class Link {
	protected int iData;
	protected Link next;
	
	public Link(int i) {
		this.iData = i;
	}
	
	public void displayLink() {
		System.out.print(iData + " ");
	}
}
