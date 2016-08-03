package com.dsa.linkedlist.doublylinkedlist;

public class Link {
	public int iData;
	public Link previous;
	public Link next;
	
	public Link(int i) {
		iData = i;
	}
	
	public void displayLink() {
		System.out.print(iData + " ");
	}
}
