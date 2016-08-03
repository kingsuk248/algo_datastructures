package com.dsa.hashtables;

public class SortedList {
	protected Link first;
	
	protected void insert(Link newLink) {
		Link current = first;
		Link previous = null;
		while (current != null && current.iData < newLink.iData) {
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
	
	protected void delete(int key) {
		Link current = first;
		Link previous = null;
		while (current != null && current.iData != key) {
			previous = current;
			current = current.next;
		}
		if (previous == null) {
			first = null;
		} else {
			previous.next = current.next;
		}
	}
	
	protected Link find(int key) {
		Link current = first;
		while (current != null && current.iData <= key) {
			if (current.iData == key) {
				return current;
			}
			current = current.next;
		}
		return null;
	}
	
	protected void displayList() {
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
}
