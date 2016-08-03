package com.dsa.linkedlist.queue;

public class LinkQueueApp {
	public static void main(String[] args) {
		LinkQueue linkQueue = new LinkQueue();
		linkQueue.insert(23.423);
		linkQueue.insert(34.678);
		linkQueue.insert(18.246);
		linkQueue.insert(14.185);
		linkQueue.insert(68.346);
		linkQueue.displayQueue();
		linkQueue.remove();
		linkQueue.remove();
		linkQueue.displayQueue();
		linkQueue.remove();
		linkQueue.remove();
		linkQueue.displayQueue();
		
	}
}
