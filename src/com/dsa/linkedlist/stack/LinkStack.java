package com.dsa.linkedlist.stack;

public class LinkStack {
	private LinkList linkList;
	
	public LinkStack() {
		linkList = new LinkList();
	}
	
	public void push(int i) {
		linkList.insertFirst(i);
	}
	
	public int pop() {
		return linkList.deleteFirst().iData;
	}
	
	public void displayStack() {
		System.out.println("Stack top--->bottom");
		linkList.displayList();
	}
}
