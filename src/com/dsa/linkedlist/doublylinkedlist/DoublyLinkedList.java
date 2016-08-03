package com.dsa.linkedlist.doublylinkedlist;

public class DoublyLinkedList {
	private Link first;
	private Link last;
	
	public boolean isEmpty() {
		return (first == null);
	}
	
	public void insertFirst(int element) {
		Link newLink = new Link(element);
		if (isEmpty()) {
			last = newLink;
		} else {
			first.previous = newLink;
			newLink.next = first;
		}
		first = newLink;
	}
	
	public void insertLast(int element) {
		Link newLink = new Link(element);
		if (isEmpty()) {
			first = newLink;
		} else {
			last.next = newLink;
			newLink.previous = last;
		}
		last = newLink;
	}
	
	public Link deleteFirst() {
		Link tbdLink = first;
		if (!isEmpty()) {
			if (first.next == null) {
				last = null;
			} else {
				first.next.previous = null;
			}
			first = first.next;
		}
		return tbdLink;
	}
	
	public Link deleteLast() {
		Link tbdLink = last;
		if (!isEmpty()) {
			if (last.previous == null) {
				first = null;
			} else {
				last.previous.next = null;
			}
			last = last.previous;
		}
		return tbdLink;
	}
	
	public boolean insertAfter(int key, int element) {
		Link current = first;
		while (current.iData != key) {
			current = current.next;
			if (current == null) {
				return false;
			}
		}
		Link newLink = new Link(element);
		if (current == last) {
			last = newLink;
		} else {
			newLink.next = current.next;
			current.next.previous = newLink;
		}
		current.next = newLink;
		newLink.previous = current;
		return true;
	}
	
	public Link deleteKey(int key) {
		Link current = first;
		while (current.iData != key) {
			current = current.next;
			if (current == null) {
				return current;
			}
		}
		if (current == first) {
			first = current.next;
		} else {
			current.previous.next = current.next; 
		}
		if (current == last) {
			last = current.previous;
		} else {
			current.next.previous = current.previous;
		}
		return current;
	}
	
	public void displayForward() {
		System.out.println("Display front --> back");
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
	
	public void displayBackward() {
		System.out.println("Display back --> front");
		Link current = last;
		while (current != null) {
			current.displayLink();
			current = current.previous;
		}
		System.out.println();
	}
}
