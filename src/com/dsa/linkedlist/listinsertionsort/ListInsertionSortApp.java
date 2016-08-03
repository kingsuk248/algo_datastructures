package com.dsa.linkedlist.listinsertionsort;

import com.dsa.linkedlist.queue.Link;


public class ListInsertionSortApp {
	public static void main(String[] args) {
		int size = 10;
		Link[] links = new Link[size];
		for (int i = 0; i < size; i++) {
			Link newLink = new Link((int) (Math.random() * 99));
			links[i] = newLink;
		}
		System.out.println("Unsorted List");
		for (int i = 0; i < size; i++)
			System.out.print((int)links[i].dData + " ");
		System.out.println();
		SortedList sortedList = new SortedList(links);
		for (int i = 0; i < size; i++)
			links[i] = sortedList.remove();
		System.out.println("Sorted List");
		for (int i = 0; i < size; i++)
			System.out.print((int)links[i].dData + " ");
	}
}
