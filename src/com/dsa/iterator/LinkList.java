package com.dsa.iterator;

public class LinkList {
	public Link first;
	
	public Link getFirst() {
		return first;
	}
	
	public void setFirst(Link first) {
		this.first = first;
	}
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public ListIterator getIterator() {
		return new ListIterator(this);
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
