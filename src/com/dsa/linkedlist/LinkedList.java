package com.dsa.linkedlist;

public class LinkedList {
	private Link first;
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int i, double d) {
		Link link = new Link(i, d);
		link.next = first;
		first = link;
	}
	
	public Link deleteFirst() {
		Link deletedLink = first;
		first = first.next;
		return deletedLink;
	}
	
	public void displayLink() {
		System.out.println("Displaying List (first ---> last)");
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
	
	public Link find(int i) {
		Link current = first;
		while (current != null) {
			if (current.iData == i) {
				return current;
			} else {
				current = current.next;
			}
		}
		return null;
	}
	
	public Link delete(int key) {
		Link current = first;
		Link previous = first;
		while (current.iData != key) {
			if (current.next == null) {
				return null;
			} else {
				previous = current;
				current = current.next;
			}
		}
		if (current == first) {
			first = first.next;
		} else {
			previous.next = current.next;
		}
		return current;
	}
}
