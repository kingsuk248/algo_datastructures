package com.dsa.linkedlist.sortedlist;

public class SortedListApp {
	public static void main(String[] args) {
		SortedList list = new SortedList();
		list.insert(71.25);
		list.insert(62.68);
		list.insert(81.86);
		list.displayList();
		list.insert(55.34);
		list.displayList();
		list.insert(25.26);
		list.displayList();
		list.insert(98.54);
		list.displayList();
		list.remove();
		list.remove();
		list.displayList();
	}
}
