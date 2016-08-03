package com.dsa.linkedlist.stack;

public class LinkList {
	public Link first;
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insertFirst(int i) {
		Link newLink = new Link(i);
		newLink.next = first;
		first = newLink;
	}
	
	public Link deleteFirst() {
		Link temp = first;
		if (temp != null) {
			first = first.next;
		}
		return temp;
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
