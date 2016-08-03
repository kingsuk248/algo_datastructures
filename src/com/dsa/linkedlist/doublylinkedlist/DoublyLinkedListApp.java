package com.dsa.linkedlist.doublylinkedlist;

public class DoublyLinkedListApp {
	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertFirst(23);
		dll.insertFirst(66);
		dll.insertLast(51);
		dll.insertLast(16);
		dll.displayForward();
		dll.displayBackward();
		dll.insertAfter(66, 246);
		dll.insertAfter(126, 348);
		dll.displayForward();
		dll.insertAfter(23, 468);
		dll.displayForward();
		dll.deleteKey(23);
		dll.displayForward();
		dll.deleteFirst();
		dll.displayForward();
		dll.deleteLast();
		dll.displayForward();
		dll.displayBackward();
	}
}
