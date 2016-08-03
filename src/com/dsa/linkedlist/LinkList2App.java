package com.dsa.linkedlist;

public class LinkList2App {
	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		linkedList.insertFirst(14, 22.348);
		linkedList.insertFirst(65, 76.2387);
		linkedList.insertFirst(38, 41.3718);
		linkedList.insertFirst(288, 11.666);
		linkedList.insertFirst(175, 38.876);
		linkedList.displayLink();
		Link link = linkedList.find(38);
		if (link != null) {
			System.out.println("Found link with key: " + link.iData);
		} else {
			System.out.println("Could not find the link");
		}
		Link dLink = linkedList.delete(288);
		if (dLink != null) {
			System.out.println("Deleted link with key: " + dLink.iData);
		} else {
			System.out.println("Could not find the link");
		}
		linkedList.displayLink();
	}
}
