package com.dsa.linkedlist.queue;

public class FirstLastList {
	private Link first;
	private Link last;
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertLast(double d) {
		Link newLink = new Link(d);
		if (isEmpty()) {
			first = newLink;
		} else {
			last.next = newLink;
		}
		last = newLink;
	}
	
	public Link deleteFirst() {
		Link tempLink = first;
		if (isEmpty()) {
			last = null;
		} else {
			if (first.next == null) {
				last = null;
			}
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
