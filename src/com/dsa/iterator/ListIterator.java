package com.dsa.iterator;

public class ListIterator {
	public LinkList list;
	public Link current;
	public Link previous;
	
	public ListIterator(LinkList list) {
		this.list = list;
		reset();
	}
	
	public void reset() {
		previous = null;
		current = list.getFirst();
	}
	
	public boolean atEnd() {
		return current.next == null;
	}
	
	public Link getCurrent() {
		return current;
	}
	
	public void nextLink() {
		previous = current;
		current = current.next;
	}
	
	public void insertBefore(double d) {
		Link newLink = new Link(d);
		if (previous == null) {
			newLink.next = list.getFirst();
			list.setFirst(newLink);
			reset();
		} else {
			previous.next = newLink;
			newLink.next = current;
			current = newLink;
		}
	}
	
	public void insertAfter(double d) {
		Link newLink = new Link(d);
		if (list.isEmpty()) {
			list.setFirst(newLink);
			current = newLink;
		} else {
			newLink.next = current.next;
			current.next = newLink;
			nextLink();
		}
	}
	
	public void deleteCurrent() {
		if (!list.isEmpty()) {
			if (previous == null) {
				list.setFirst(current.next);
				reset();
			} else {
				previous.next = current.next;
				if (atEnd()) {
					reset();
				} else {
					current = current.next;
				}
			}
		}
	}
}
