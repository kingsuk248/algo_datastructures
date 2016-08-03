package com.dsa.iterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InterIterApp {
	public static void main(String[] args) throws IOException {
		LinkList list = new LinkList();
		ListIterator iterator = list.getIterator();
		iterator.insertAfter(30);
		iterator.insertAfter(56);
		iterator.insertAfter(14);
		iterator.insertAfter(57);
		iterator.insertAfter(78);
		
		while (true) {
			System.out.println("Enter the first letter of your opearation: ");
			System.out.println("show, before, after, delete, get, reset, next");
			
			char choice = getChar();
			switch (choice) {
			case 's':
				list.displayList();
				break;
			case 'b':
				int beforeInt = getInt();
				iterator.insertBefore(beforeInt);
				break;
			case 'a':
				int afterInt = getInt();
				iterator.insertAfter(afterInt);
				break;
			case 'd':
				iterator.deleteCurrent();
				break;
			case 'g':
				System.out.println("Iterator is at element: " + iterator.getCurrent().dData);
				break;
			case 'r':
				iterator.reset();
				break;
			case 'n':
				System.out.println("Iterator was at element: " + iterator.getCurrent().dData);
				iterator.nextLink();
				System.out.println("Iterator is now at element: " + iterator.getCurrent().dData);
				break;
			case '3':
				System.out.println("Before removing multiples of 3");
				list.displayList();
				deleteMultipleOf3s(iterator);
				System.out.println("After removing multiples of 3");
				list.displayList();
				break;
			}
		}
	}
	
	public static char getChar() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		char ch = reader.readLine().charAt(0);
		return ch;
	}
	
	public static int getInt() throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int i = Integer.parseInt(reader.readLine());
		return i;
	}
	
	public static void deleteMultipleOf3s(ListIterator iterator) {
		iterator.reset();
		while(!iterator.atEnd()) {
			if (iterator.getCurrent().dData % 3 == 0) {
				iterator.deleteCurrent();
			} else {
				iterator.nextLink();
			}
		}
		if (iterator.getCurrent().dData % 3 == 0) {
			iterator.deleteCurrent();
		}
	}
}
