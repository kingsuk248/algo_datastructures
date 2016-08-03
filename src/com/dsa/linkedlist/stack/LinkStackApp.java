package com.dsa.linkedlist.stack;

public class LinkStackApp {
	public static void main(String[] args) {
		LinkStack linkStack = new LinkStack();
		linkStack.push(24);
		linkStack.push(56);
		linkStack.push(31);
		linkStack.displayStack();
		linkStack.push(28);
		linkStack.push(98);
		linkStack.displayStack();
		linkStack.pop();
		linkStack.pop();
		linkStack.displayStack();
	}
}
