package com.dsa.recursion;

import com.dsa.util.methods.Utility;

public class AnagramApp {
	public static int count;
	public static int size;
	public static char[] charArray = new char[100];
	
	public static void main(String[] args) {
		System.out.println("Enter a string");
		String str = Utility.getString();
		size = str.length();
		for (int i=0; i < str.length(); i++) {
			charArray[i] = str.charAt(i);
		}
		doAnagram(size);
	}
	
	public static void doAnagram(int newSize) {
		if (newSize == 1) {
			return;
		}
		for (int i = 0; i < newSize; i++) {
			doAnagram(newSize - 1);
			if (newSize == 2) {
				displayWord();
			}
			rotate(newSize);
		}
	}
	
	public static void rotate(int newsize) {
		int i;
		int position = size - newsize;
		char temp = charArray[position];
		for (i = position + 1; i < size; i++) {
			charArray[i - 1] = charArray[i];
		}
		charArray[i - 1] = temp;
	}
	
	public static void displayWord() {
		if (count < 99) {
			System.out.print(" ");
		}
		if (count < 9) {
			System.out.print(" ");
		}
		System.out.print(++count + " ");
		for (int i = 0; i < size; i++) {
			System.out.print(charArray[i]);
		}
		System.out.print(" ");
		if (count % 6 == 0) {
			System.out.println();
		}
	}
}
