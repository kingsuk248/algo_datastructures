package com.dsa.linkedlist.listinsertionsort;

import com.dsa.linkedlist.queue.Link;

public class SortedList extends com.dsa.linkedlist.sortedlist.SortedList{
	public SortedList(Link[] links) {
		for (int i = 0; i < links.length; i++) {
			insert(links[i].dData);
		}
	}
}
