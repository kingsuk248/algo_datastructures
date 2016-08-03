package com.dsa.hashtables;

public class HashFunctions {
	private static int arraySize = 31;
	
	public static void main(String[] args) {
		String inputString = "cat";
		System.out.println((3 * Math.pow(27, 2) + 1 * Math.pow(27, 1)) + 20);
		HashFunctions hf = new HashFunctions();
		hf.hash1(inputString);
		hf.hash2(inputString);
		hf.hash3(inputString);
	}

	private void hash1(String inputString) {
		int hashVal = 0;
		int pow27 = 1;
		for (int i = inputString.length() - 1; i >= 0; i--) {
			int letter = inputString.charAt(i) - 96;
			hashVal += pow27 * letter;
			pow27 *= 27;
		}
		System.out.println("Hash Value: " + hashVal);
		System.out.println("Hash: " + hashVal % arraySize);
	}

	private void hash2(String inputString) {
		int hashVal = 0;
		for (int i = 0; i < inputString.length(); i++) {
			int letter = inputString.charAt(i) - 96;
			hashVal = hashVal * 27 + letter;
		}
		System.out.println("Hash Value: " + hashVal);
		System.out.println("Hash: " + hashVal % arraySize);
	}

	private void hash3(String inputString) {
		int hashVal = 0;
		for (int i = 0; i < inputString.length(); i++) {
			int letter = inputString.charAt(i) - 96;
			hashVal = (hashVal * 27 + letter) % arraySize;
		}
		System.out.println("Hash Value: " + hashVal);
		System.out.println("Hash: " + hashVal % arraySize);
	}
}
