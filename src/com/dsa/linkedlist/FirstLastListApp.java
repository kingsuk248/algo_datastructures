package com.dsa.linkedlist;

public class FirstLastListApp {
	public static void main(String[] args) {
		FirstLastList firstLastList = new FirstLastList();
		firstLastList.insertFirst(14, 22.348);
		firstLastList.insertFirst(65, 76.2387);
		firstLastList.insertFirst(38, 41.3718);
		firstLastList.insertFirst(288, 11.666);
		firstLastList.displayList();
		firstLastList.insertLast(131, 32.684);
		firstLastList.insertLast(564, 98.164);
		firstLastList.insertLast(24, 45.876);
		firstLastList.displayList();
		firstLastList.deleteFirst();
		firstLastList.deleteFirst();
		firstLastList.displayList();
	}
}
