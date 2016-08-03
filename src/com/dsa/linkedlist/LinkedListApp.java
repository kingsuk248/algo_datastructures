package com.dsa.linkedlist;

public class LinkedListApp {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertFirst(46, 25.4876);
		list.insertFirst(23, 11.86574);
		list.insertFirst(55, 31.56745);
		list.displayLink();
		while(!list.isEmpty()) {
			list.deleteFirst();
		}
		list.displayLink();
	}
}
