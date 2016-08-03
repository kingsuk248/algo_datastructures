package com.dsa.linkedlist.queue;

public class LinkQueue {
	private FirstLastList firstLastList;
	
	public LinkQueue() {
		firstLastList = new FirstLastList();
	}
	
	public void insert(double d) {
		firstLastList.insertLast(d);
	}
	
	public double remove() {
		return firstLastList.deleteFirst().dData;
	}
	
	public void displayQueue() {
		System.out.println("Queue (front ---> rear): ");
		firstLastList.displayList();
	}
}
