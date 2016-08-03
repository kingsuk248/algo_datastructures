package com.dsa.linkedlist.sortedlist;

import com.dsa.linkedlist.queue.Link;

public class SortedList {
	
	protected Link first;
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insert(double key) {
		Link newLink = new Link(key);
		Link current = first;
		Link previous = null;
		while(current != null && key > current.dData) {
			previous = current;
			current = current.next;
		}
		if (previous == null) {
			first = newLink;
		} else {
			previous.next = newLink;
		}
		newLink.next = current;
	}
	
	public Link remove() {
		Link tempLink = first;
		if (!isEmpty()) {
			first = first.next;
		}
		return tempLink;
	}
	
	public void displayList() {
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
}
